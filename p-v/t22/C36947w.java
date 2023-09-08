package t22;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import eb0.C75573f;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C35136m;
import ob0.C35141t;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: t22.w */
public class C36947w extends C75573f implements C35141t {
    /* renamed from: B */
    public final String mo60910B(String str, List<String> list) {
        int i;
        C118355y Ax0 = C77832s.Ax0();
        Ax0.getClass();
        LinkedList<String> c = C77832s.Bx0().mo107950c(Ax0.f353752u);
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = c.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it4 = list.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (it4.next().equals(next)) {
                        i = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i == 0) {
                linkedList.add(next);
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
        int i;
        String str;
        String str2;
        String str3;
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null) {
            Log.m105920e("MicroMsg.TrackMsgExtension", "onPreAddMessage cmdAM is null");
            return null;
        }
        LinkedList linkedList = new LinkedList();
        String g = C48374j0.m53718g(j3Var.f227628e);
        String g2 = C48374j0.m53718g(j3Var.f227629f);
        String str4 = ((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null)).equals(g) ? g2 : g;
        String g3 = C48374j0.m53718g(j3Var.f227631h);
        Log.m105918d("MicroMsg.TrackMsgExtension", "cmd " + g3);
        Map<String, String> parseXml = XmlParser.parseXml(g3, "sysmsg", (String) null);
        if (parseXml == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("talk  " + str4 + APLogFileUtil.SEPARATOR_LINE);
            stringBuffer.append("from fromUser " + g + APLogFileUtil.SEPARATOR_LINE);
            stringBuffer.append("from toUser " + g2 + APLogFileUtil.SEPARATOR_LINE);
            String str5 = parseXml.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.addr");
            String str6 = parseXml.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.latitude");
            double d = 0.0d;
            double d2 = str6 == null ? 0.0d : Util.getDouble(str6, 0.0d);
            stringBuffer.append("lat " + d2 + APLogFileUtil.SEPARATOR_LINE);
            String str7 = parseXml.get(".sysmsg.trackmsg.trackroominfo.trackroompoi.longitude");
            if (str7 != null) {
                d = Util.getDouble(str7, 0.0d);
            }
            stringBuffer.append("lng " + d + APLogFileUtil.SEPARATOR_LINE);
            int i2 = Util.getInt(parseXml.get(".sysmsg.trackmsg.trackroominfo.timestamp"), 0);
            stringBuffer.append("times " + i2 + APLogFileUtil.SEPARATOR_LINE);
            int i3 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append(".sysmsg.trackmsg.trackroominfo.trackmemberlist.member");
                sb.append(i3 == 0 ? "" : Integer.valueOf(i3));
                String sb4 = sb.toString();
                String str8 = parseXml.get(sb4 + ".username");
                if (Util.isNullOrNil(str8)) {
                    break;
                }
                double d3 = d2;
                i = 0;
                i3++;
                try {
                    linkedList.add(str8);
                    d2 = d3;
                } catch (Exception e) {
                    e = e;
                    Log.printErrStackTrace("MicroMsg.TrackMsgExtension", e, "", new Object[i]);
                    return null;
                }
            }
            stringBuffer.append("userNameList size " + linkedList.size() + APLogFileUtil.SEPARATOR_LINE);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("xml : ");
            sb5.append(stringBuffer.toString());
            Log.m105924i("MicroMsg.TrackMsgExtension", sb5.toString());
            try {
                if (str4.equals(C77832s.Ax0().f353752u)) {
                    str3 = mo60911q(str4, linkedList);
                    if (Util.isNullOrNil(str3)) {
                        str2 = str3;
                        str = mo60910B(str4, linkedList);
                        C77832s.Bx0().mo107956i(str4, linkedList, d2, d, str5, str2, str);
                        return null;
                    }
                } else {
                    str3 = null;
                }
                str2 = str3;
                str = null;
                C77832s.Bx0().mo107956i(str4, linkedList, d2, d, str5, str2, str);
            } catch (Exception e2) {
                e = e2;
                i = 0;
                Log.printErrStackTrace("MicroMsg.TrackMsgExtension", e, "", new Object[i]);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
            Log.printErrStackTrace("MicroMsg.TrackMsgExtension", e, "", new Object[i]);
            return null;
        }
        return null;
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }

    /* renamed from: q */
    public final String mo60911q(String str, List<String> list) {
        int i;
        C118355y Ax0 = C77832s.Ax0();
        Ax0.getClass();
        LinkedList<String> c = C77832s.Bx0().mo107950c(Ax0.f353752u);
        LinkedList linkedList = new LinkedList();
        Iterator<String> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Iterator<String> it4 = c.iterator();
            while (true) {
                if (it4.hasNext()) {
                    if (it4.next().equals(next)) {
                        i = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i == 0) {
                linkedList.add(next);
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
