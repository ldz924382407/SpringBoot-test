# 使用说明
## 摘要
Flyway是一个款数据库版本管理工具,通过集成Flyway可以实现启动项目时自动执行项目迭代升级所需Sql语句,从而减少升级项目时人工干预成本。flyway最大的作用就是当你修改了表的结构，或者新建了表什么的，你和你同事之间能够保持同步。

## 文件命名规范
格式: V+版本号+__描述.sql
举例说明：
    案例1：V1.0__create_flyway_test_table.sql      
        优点：符合规范，另外大致能根据表名知道干了啥     
        缺点：不便于迭代，如果需要重复增删改sql的话，文件命名中版本号就不好起名字
    案例2：V20221101_10381.sql（推荐使用第二种方式）    
        优点：符合规范，其中20221101代表日期，10381代表SVN或者Git的提交版本号，便于迭代     
        缺点：光看表名不直接了然，压根不知道sql里面干了啥
    案例3：V20221101_10381__add_table.sql（推荐使用这种也可以）

注意：前缀到双下划线之间的都算版本号，比如版本号V20221102_1000 > V20221101_10002   > V20221101_10001，即优先匹配开头的，如果相同匹配单下划线或者点后面的数字

前缀为V的脚本不可重复执行，每个脚本只会被执行一次。已经执行过的历史版本脚本不能再修改，除非清除flayway的历史记录，重新执行升级脚本，这在生产环境不允许。
前缀为R的脚本，后面无版本号，如R__update_version.sql，可以重复执行，每次内容发生变化时重启后就会执行。
