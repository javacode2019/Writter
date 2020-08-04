<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    <div>
        <span><a href="/main">main page</a></span>
    </div>
    Enter user name and password:
    ${message?ifExists}

    <@l.login "/registration" />
</@c.page>

