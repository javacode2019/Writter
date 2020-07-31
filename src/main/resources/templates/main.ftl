<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    <div>
        <@l.logout />
    </div>
    <div>
        <form method="post">
            <label>
                <input type="text" name="text" placeholder="Enter message" />
            </label>
            <label>
                <input type="text" name="tag" placeholder="Tag">
            </label>
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit">Add</button>
        </form>
    </div>
    <div>List of messages</div>
    <form method="get" action="/main">
        <label>
            <input type="text" name="filter" value="${filter} "/>
        </label>
        <button type="submit">Find</button>
    </form>
    <#list messages as message>
        <div>
            <b>${message.id}</b>
            <span>${message.text}</span>
            <i>${message.tag}</i>
            <strong>${message.authorName}</strong>
        </div>
    <#else>
        No message
    </#list>
</@c.page>