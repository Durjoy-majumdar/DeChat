package dv0;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;

/* renamed from: dv0.b */
public class C97543b {

    /* renamed from: a */
    public StringBuffer f286250a = new StringBuffer();

    /* renamed from: a */
    public void mo136813a(String str, String str2) {
        mo136815c(str);
        if (Util.isNullOrNil(str2)) {
            this.f286250a.append("");
        } else if (str2.contains("]]>")) {
            StringBuffer stringBuffer = this.f286250a;
            stringBuffer.append("<![CDATA[" + Util.escapeStringForXml(str2) + "]]>");
        } else {
            StringBuffer stringBuffer2 = this.f286250a;
            stringBuffer2.append("<![CDATA[" + str2 + "]]>");
        }
        mo136814b(str);
    }

    /* renamed from: b */
    public void mo136814b(String str) {
        StringBuffer stringBuffer = this.f286250a;
        stringBuffer.append("</" + str + ">");
    }

    /* renamed from: c */
    public void mo136815c(String str) {
        StringBuffer stringBuffer = this.f286250a;
        stringBuffer.append("<" + str + ">");
    }

    /* renamed from: d */
    public void mo136816d(String str, Map<String, String> map) {
        StringBuffer stringBuffer = this.f286250a;
        stringBuffer.append("<" + str);
        for (String next : map.keySet()) {
            StringBuffer stringBuffer2 = this.f286250a;
            stringBuffer2.append(" " + next + " =  \"" + map.get(next) + "\" ");
        }
        this.f286250a.append(">");
        map.clear();
    }
}
