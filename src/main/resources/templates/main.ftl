<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
    <div>
        <@l.logout />
        <span><a href="/user">User list</a></span>
    </div>
    <div>
        <form method="post" enctype="multipart/form-data">
            <input type="text" name="text" placeholder="Enter message">
            <input type="text" name="tag" placeholder="Enter tag">
            <input type="file" name="file">
            <input type="hidden" name="_csrf" value="${_csrf.token}">
            <button type="submit">Add</button>
        </form>
    </div>

    <form method="get" action="/main">
        <input type="text" name="filter" placeholder="Enter filter by tag" value="${filter?ifExists}">
        <button type="submit">Find</button>
    </form>
    <div>List of messages:</div>
    <#list messages as message>
        <div>
            <b>${message.id}</b>
            <span>${message.text}</span>
            <i>${message.tag}</i>
            <strong>${message.authorName}</strong>
            <div>
                <#if message.filename??>
                    <img src="/img/${message.filename}" >
                </#if>
            </div>
        </div>
    <#else>
        No message by this tag!
    </#list>
</@c.page>