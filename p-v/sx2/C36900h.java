package sx2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C75592q0;
import eb0.C97625j3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;
import te3.gf4;

/* renamed from: sx2.h */
public class C36900h implements C35141t {
    /* renamed from: d */
    public static int m41081d(String str, int i) {
        if (Util.isNullOrNil(str)) {
            return i;
        }
        try {
            return Integer.valueOf(str).intValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.TalkRoomExtension", e, "", new Object[0]);
            return i;
        }
    }

    /* renamed from: B */
    public final String mo60870B(String str, List<gf4> list) {
        int i;
        List k = C118318d.yx0().mo183118k();
        LinkedList linkedList = new LinkedList();
        Iterator it = k.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            gf4 gf4 = (gf4) it.next();
            Iterator<gf4> it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (it4.next().f134027e.equals(gf4.f134027e)) {
                        i = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i == 0) {
                linkedList.add(gf4.f134027e);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        while (i < linkedList.size()) {
            String str2 = (String) linkedList.get(i);
            if (!str2.equals(C75592q0.m90789s())) {
                return str2;
            }
            i++;
        }
        return null;
    }

    /* renamed from: Fg */
    public C35136m.C35139b mo56403Fg(C35136m.C35137a aVar) {
        boolean z;
        String str;
        String str2;
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null) {
            Log.m105920e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        int i = j3Var.f227630g;
        if (i != 56) {
            Log.m105921e("MicroMsg.TalkRoomExtension", "onPreAddMessage cmdAM.type:%d", Integer.valueOf(i));
            return null;
        }
        String g = C48374j0.m53718g(j3Var.f227628e);
        String g2 = ((String) C97625j3.m125812b().mo105906u().mo119684e(2, (Object) null)).equals(g) ? C48374j0.m53718g(j3Var.f227629f) : g;
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(g2);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C97625j3.m125812b().mo105907v().mo69667P3(new C72996z1(g2));
        }
        String g3 = C48374j0.m53718g(j3Var.f227631h);
        Log.m105918d("MicroMsg.TalkRoomExtension", "talkroom xml:" + g3);
        Map<String, String> parseXml = XmlParser.parseXml(g3, "talkroominfo", (String) null);
        if (parseXml != null) {
            try {
                if (m41081d(parseXml.get(".talkroominfo.tracksysmsgtype"), 0) == 0) {
                    m41081d(parseXml.get(".talkroominfo.sysmsgtype"), 0);
                    z = true;
                } else {
                    z = false;
                }
                LinkedList linkedList = new LinkedList();
                m41081d(parseXml.get(".talkroominfo.membersize"), 0);
                int i2 = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(".talkroominfo.memberlist.member");
                    sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
                    String sb4 = sb.toString();
                    String str3 = parseXml.get(sb4 + ".username");
                    if (Util.isNullOrNil(str3)) {
                        break;
                    }
                    int d = m41081d(parseXml.get(sb4 + ".memberid"), 0);
                    gf4 gf4 = new gf4();
                    gf4.f134027e = str3;
                    gf4.f134026d = d;
                    linkedList.add(gf4);
                    i2++;
                }
                if (g2.equals(C118318d.yx0().f353649h)) {
                    String q = mo60871q(g2, linkedList);
                    if (Util.isNullOrNil(q)) {
                        str2 = q;
                        str = mo60870B(g2, linkedList);
                    } else {
                        str2 = q;
                        str = null;
                    }
                } else {
                    str2 = null;
                    str = null;
                }
                C118318d.zx0().mo73133g(g2, linkedList, str2, str, z ? 0 : 1);
                return null;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.TalkRoomExtension", "parsing memList xml failed");
                Log.printErrStackTrace("MicroMsg.TalkRoomExtension", e, "", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    /* renamed from: q */
    public final String mo60871q(String str, List<gf4> list) {
        int i;
        List k = C118318d.yx0().mo183118k();
        LinkedList linkedList = new LinkedList();
        Iterator<gf4> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            gf4 next = it.next();
            Iterator it4 = k.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (((gf4) it4.next()).f134027e.equals(next.f134027e)) {
                        i = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i == 0) {
                linkedList.add(next.f134027e);
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        while (i < linkedList.size()) {
            String str2 = (String) linkedList.get(i);
            if (!str2.equals(C75592q0.m90789s())) {
                return str2;
            }
            i++;
        }
        return null;
    }
}
