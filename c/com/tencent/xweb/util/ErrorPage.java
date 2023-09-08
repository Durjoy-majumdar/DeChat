package com.tencent.xweb.util;

public class ErrorPage {
    public static String createErrorPage(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(2000);
        sb.append("<html>\n");
        sb.append("<head>\n");
        sb.append("<script type=\"text/javascript\">\n");
        sb.append("function jumurl(){\n");
        sb.append("　　window.location.href = '");
        sb.append(str2);
        sb.append("';\n");
        sb.append("}\n");
        sb.append("</script>\n");
        sb.append("<title>无法打开页面</title>\n");
        sb.append("<script >\n");
        sb.append("var html = document.documentElement,");
        sb.append("resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize';");
        sb.append("function setHtmlFontSize() {");
        sb.append("var cliWidth = html.clientWidth;");
        sb.append("html.style.fontSize = 100 * (cliWidth / 720) + 'px';}");
        sb.append("window.addEventListener(resizeEvt, setHtmlFontSize, false);");
        sb.append("</script>\n");
        sb.append("<style>.exp{ text-align:center; margin-top:15rem; height=\"10rem\" width=\"10rem\"}</style>\n");
        sb.append("<style>.fcolorfortitle{ color: rgba(0, 0, 0, 0.3); font-size:44px;}</style>\n");
        sb.append("<style>.fcolorforsubtitle{ color: rgba(0, 0, 0, 0.3); font-size:34px;}</style>\n");
        sb.append("</head>\n");
        sb.append("<body bgcolor=\"#F2F2F2\" onclick=\"jumurl()\"'\">\n");
        sb.append("<br></br>");
        sb.append("<p></p>");
        sb.append("<div class=\"exp\" ><img src=\"html/img/webview_404_refresh_icon.svg\" text-align:center /><div>");
        sb.append("<br></br>");
        sb.append("<font size=\"44px\" class=\"fcolorfortitle\">无法打开页面</font>");
        sb.append("<br></br>");
        sb.append("<font size=\"44px\" class=\"fcolorforsubtitle\">轻触屏幕重新加载</font>");
        sb.append("</body>\n");
        sb.append("</html>");
        return sb.toString();
    }
}
