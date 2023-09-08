package lv0;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: lv0.c */
public class C99651c {

    /* renamed from: a */
    public StringBuffer f292064a = new StringBuffer();

    /* renamed from: a */
    public void mo139029a(String str, String str2) {
        mo139031c(str);
        if (Util.isNullOrNil(str2)) {
            this.f292064a.append("");
        } else if (str2.contains("]]>")) {
            StringBuffer stringBuffer = this.f292064a;
            stringBuffer.append("<![CDATA[" + Util.escapeStringForXml(str2) + "]]>");
        } else {
            StringBuffer stringBuffer2 = this.f292064a;
            stringBuffer2.append("<![CDATA[" + str2 + "]]>");
        }
        mo139030b(str);
    }

    /* renamed from: b */
    public void mo139030b(String str) {
        StringBuffer stringBuffer = this.f292064a;
        stringBuffer.append("</" + str + ">");
    }

    /* renamed from: c */
    public void mo139031c(String str) {
        StringBuffer stringBuffer = this.f292064a;
        stringBuffer.append("<" + str + ">");
    }

    /* renamed from: d */
    public void mo139032d(String str, Map<String, String> map) {
        StringBuffer stringBuffer = this.f292064a;
        stringBuffer.append("<" + str);
        for (String next : map.keySet()) {
            StringBuffer stringBuffer2 = this.f292064a;
            stringBuffer2.append(" " + next + " =  \"" + map.get(next) + "\" ");
        }
        this.f292064a.append(">");
        map.clear();
    }
}
