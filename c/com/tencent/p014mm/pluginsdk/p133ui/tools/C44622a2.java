package com.tencent.p014mm.pluginsdk.p133ui.tools;

import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.pluginsdk.ui.tools.a2 */
public class C44622a2 {

    /* renamed from: f */
    public static Pattern f120997f = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* renamed from: a */
    public String f120998a = "";

    /* renamed from: b */
    public String f120999b = "";

    /* renamed from: c */
    public int f121000c = -1;

    /* renamed from: d */
    public String f121001d = "/";

    /* renamed from: e */
    public String f121002e = "";

    public C44622a2(String str) {
        str.getClass();
        Matcher matcher = f120997f.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if (group != null) {
                this.f120998a = group.toLowerCase();
            }
            String group2 = matcher.group(2);
            if (group2 != null) {
                this.f121002e = group2;
            }
            String group3 = matcher.group(3);
            if (group3 != null) {
                this.f120999b = group3;
            }
            String group4 = matcher.group(4);
            if (group4 != null && group4.length() > 0) {
                try {
                    this.f121000c = Util.getInt(group4, this.f121000c);
                } catch (NumberFormatException unused) {
                    throw new Exception("Bad port");
                }
            }
            String group5 = matcher.group(5);
            if (group5 != null && group5.length() > 0) {
                if (group5.charAt(0) == '/') {
                    this.f121001d = group5;
                } else {
                    this.f121001d = "/" + group5;
                }
            }
            if (this.f121000c == 443 && this.f120998a.equals("")) {
                this.f120998a = C113600ck.f339986i;
            } else if (this.f121000c == -1) {
                if (this.f120998a.equals(C113600ck.f339986i)) {
                    this.f121000c = JsApiPauseDownloadTask.CTRL_INDEX;
                } else {
                    this.f121000c = 80;
                }
            }
            if (this.f120998a.equals("")) {
                this.f120998a = "http";
                return;
            }
            return;
        }
        throw new Exception("Bad address");
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.f121000c == 443 || !this.f120998a.equals(C113600ck.f339986i)) && (this.f121000c == 80 || !this.f120998a.equals("http"))) {
            str = str2;
        } else {
            str = XVFSFile.PATH_SEPARATOR + Integer.toString(this.f121000c);
        }
        if (this.f121002e.length() > 0) {
            str2 = this.f121002e + "@";
        }
        return this.f120998a + "://" + str2 + this.f120999b + str + this.f121001d;
    }
}
