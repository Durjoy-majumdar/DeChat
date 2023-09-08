package rb1;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import te3.C101755ad0;

/* renamed from: rb1.b */
public class C101368b {
    /* renamed from: a */
    public static C101755ad0 m133010a(String str, Map<String, String> map) {
        if (!map.containsKey(str)) {
            return null;
        }
        C101755ad0 ad02 = new C101755ad0();
        ad02.f297848d = Util.getInt(map.get(str + ".itemshowtype"), -1);
        ad02.f297862u = Util.getInt(map.get(str + ".ispaysubscribe"), -1);
        ad02.f297849e = Util.getInt(map.get(str + ".nativepage"), 0);
        ad02.f297850f = Util.getInt(map.get(str + ".width"), 0);
        ad02.f297851g = Util.getInt(map.get(str + ".height"), 0);
        ad02.f297852h = Util.getInt(map.get(str + ".pubtime"), 0);
        ad02.f297853i = Util.getInt(map.get(str + ".duration"), 0);
        ad02.f297857p = Util.getInt(map.get(str + ".funcflag"), 0);
        ad02.f297854j = map.get(str + ".vid");
        ad02.f297855n = map.get(str + ".srcusername");
        ad02.f297856o = map.get(str + ".srcdisplayname");
        ad02.f297859r = map.get(str + ".cover");
        return ad02;
    }

    /* renamed from: b */
    public static C101755ad0 m133011b(String str, Map<String, String> map) {
        if (!map.containsKey(str)) {
            return null;
        }
        C101755ad0 ad02 = new C101755ad0();
        ad02.f297854j = map.get(str + ".vid");
        ad02.f297861t = map.get(str + ".videourl");
        ad02.f297860s = map.get(str + ".mpurl");
        ad02.f297855n = map.get(str + ".bizusrname");
        ad02.f297856o = map.get(str + ".biznickname");
        ad02.f297859r = map.get(str + ".thumburl");
        ad02.f297850f = (int) Util.getFloat(map.get(str + ".thumbwidth"), 0.0f);
        ad02.f297851g = (int) Util.getFloat(map.get(str + ".thumbheight"), 0.0f);
        ad02.f297853i = (int) Util.getFloat(map.get(str + ".duration"), 0.0f);
        return ad02;
    }

    /* renamed from: c */
    public static String m133012c(C101755ad0 ad02) {
        StringBuffer stringBuffer = new StringBuffer();
        if (ad02 == null) {
            return "";
        }
        stringBuffer.append("<appmsgshareitem>");
        stringBuffer.append("<vid>");
        stringBuffer.append(Util.escapeStringForXml(ad02.f297854j));
        stringBuffer.append("</vid>");
        stringBuffer.append("<srcusername>");
        stringBuffer.append(Util.escapeStringForXml(ad02.f297855n));
        stringBuffer.append("</srcusername>");
        stringBuffer.append("<srcdisplayname>");
        stringBuffer.append(Util.escapeStringForXml(ad02.f297856o));
        stringBuffer.append("</srcdisplayname>");
        stringBuffer.append("<cover>");
        stringBuffer.append(Util.escapeStringForXml(ad02.f297859r));
        stringBuffer.append("</cover>");
        stringBuffer.append("<itemshowtype>");
        stringBuffer.append(ad02.f297848d);
        stringBuffer.append("</itemshowtype>");
        stringBuffer.append("<ispaysubscribe>");
        stringBuffer.append(ad02.f297862u);
        stringBuffer.append("</ispaysubscribe>");
        stringBuffer.append("<nativepage>");
        stringBuffer.append(ad02.f297849e);
        stringBuffer.append("</nativepage>");
        stringBuffer.append("<width>");
        stringBuffer.append(ad02.f297850f);
        stringBuffer.append("</width>");
        stringBuffer.append("<height>");
        stringBuffer.append(ad02.f297851g);
        stringBuffer.append("</height>");
        stringBuffer.append("<pubtime>");
        stringBuffer.append(ad02.f297852h);
        stringBuffer.append("</pubtime>");
        stringBuffer.append("<duration>");
        stringBuffer.append(ad02.f297853i);
        stringBuffer.append("</duration>");
        stringBuffer.append("<funcflag>");
        stringBuffer.append(ad02.f297857p);
        stringBuffer.append("</funcflag>");
        stringBuffer.append("</appmsgshareitem>");
        return stringBuffer.toString();
    }
}
