<html>
<head>
    <meta name='layout' content='main'/>
    <title><g:message code="springSecurity.login.title"/></title>
    <link rel="stylesheet" href="${resource(dir: 'css', file: 'auth.css')}" type="text/css">
</head>
<body>
<oauth:connect provider="facebook" id="facebook-connect-link">Facebook</oauth:connect>
Logged with facebook?
<s2o:ifLoggedInWith provider="facebook">yes</s2o:ifLoggedInWith>
<s2o:ifNotLoggedInWith provider="facebook">no</s2o:ifNotLoggedInWith>
<div id='login'>
    <div class='inner'>
        <div class='fheader'><g:message code="springSecurity.login.header"/></div>

        <g:if test='${flash.message}'>
            <div class='login_message'>${flash.message}</div>
        </g:if>
        <form action='${postUrl}' method='POST' id='loginForm' class='cssform pure-form pure-form-aligned' autocomplete='off'>
            <p>
                <label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
                <input type='text' class='text_' name='j_username' id='username'/>
                <label>test</label>
            </p>

            <p>
                <label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
                <input type='password' class='text_' name='j_password' id='password'/>
            </p>

            <p>
                <input type='submit' id="submit" class="btn" value='${message(code: "springSecurity.login.button")}'/>
            </p>
        </form>
    </div>
</div>
<script type='text/javascript'>
    <!--
    (function() {
        document.forms['loginForm'].elements['j_username'].focus();
    })();
    // -->
</script>
</body>
</html>