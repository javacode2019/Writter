<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    Login page
    <@l.login "/login" />
    <span><a href="/registration">Add new user</a></span>
</@c.page>