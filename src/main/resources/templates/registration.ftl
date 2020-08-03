<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    Enter user name and password:

    <@l.login "/registration" />
</@c.page>

