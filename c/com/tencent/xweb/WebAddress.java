package com.tencent.xweb;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.xweb.file.XVFSFile;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebAddress {
    public static final int MATCH_GROUP_AUTHORITY = 2;
    public static final int MATCH_GROUP_HOST = 3;
    public static final int MATCH_GROUP_PATH = 5;
    public static final int MATCH_GROUP_PORT = 4;
    public static final int MATCH_GROUP_SCHEME = 1;
    public static Pattern sAddressPattern = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
    private String mAuthInfo = "";
    private String mHost = "";
    private String mPath = "/";
    private int mPort = -1;
    private String mScheme = "";

    public static class ParseException extends RuntimeException {
        public String response;

        public ParseException(String str) {
            this.response = str;
        }
    }

    public WebAddress(String str) {
        str.getClass();
        Matcher matcher = sAddressPattern.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (group != null) {
                this.mScheme = group.toLowerCase(Locale.ROOT);
            }
            String group2 = matcher.group(2);
            if (group2 != null) {
                this.mAuthInfo = group2;
            }
            String group3 = matcher.group(3);
            if (group3 != null) {
                this.mHost = group3;
            }
            String group4 = matcher.group(4);
            if (group4 != null && group4.length() > 0) {
                try {
                    this.mPort = Integer.parseInt(group4);
                } catch (NumberFormatException unused) {
                    throw new ParseException("Bad port");
                }
            }
            String group5 = matcher.group(5);
            if (group5 != null && group5.length() > 0) {
                if (group5.charAt(0) == '/') {
                    this.mPath = group5;
                } else {
                    this.mPath = "/" + group5;
                }
            }
            if (this.mPort == 443 && this.mScheme.equals("")) {
                this.mScheme = C113600ck.f339986i;
            } else if (this.mPort == -1) {
                if (this.mScheme.equals(C113600ck.f339986i)) {
                    this.mPort = JsApiPauseDownloadTask.CTRL_INDEX;
                } else {
                    this.mPort = 80;
                }
            }
            if (this.mScheme.equals("")) {
                this.mScheme = "http";
                return;
            }
            return;
        }
        throw new ParseException("Bad address");
    }

    public String getAuthInfo() {
        return this.mAuthInfo;
    }

    public String getHost() {
        return this.mHost;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getPort() {
        return this.mPort;
    }

    public String getScheme() {
        return this.mScheme;
    }

    public void setAuthInfo(String str) {
        this.mAuthInfo = str;
    }

    public void setHost(String str) {
        this.mHost = str;
    }

    public void setPath(String str) {
        this.mPath = str;
    }

    public void setPort(int i) {
        this.mPort = i;
    }

    public void setScheme(String str) {
        this.mScheme = str;
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.mPort == 443 || !this.mScheme.equals(C113600ck.f339986i)) && (this.mPort == 80 || !this.mScheme.equals("http"))) {
            str = str2;
        } else {
            str = XVFSFile.PATH_SEPARATOR + this.mPort;
        }
        if (this.mAuthInfo.length() > 0) {
            str2 = this.mAuthInfo + "@";
        }
        return this.mScheme + "://" + str2 + this.mHost + str + this.mPath;
    }
}
