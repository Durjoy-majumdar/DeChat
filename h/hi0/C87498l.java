package hi0;

import android.util.Base64;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ii0.C87732a;
import java.util.LinkedList;
import java.util.List;
import js0.C88022n;
import ki0.C33910e;
import te3.C90446wm2;
import te3.e75;
import te3.o75;

/* renamed from: hi0.l */
public class C87498l extends C87491a<Boolean, o75> {
    /* renamed from: f */
    public static String m108803f(List<?> list) {
        if (list == null) {
            return "null";
        }
        if (Util.isNullOrNil((List) list)) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        for (Object obj : list) {
            sb.append(obj.toString());
            sb.append(',');
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: b */
    public Object mo58858b(String str, String str2, Object obj) {
        o75 o75 = (o75) obj;
        String str3 = o75.f139013e;
        if (Util.isNullOrNil(str3)) {
            Log.m105921e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty base64", str, str2);
            return Boolean.FALSE;
        } else if (Util.isNullOrNil((List) o75.f139014f)) {
            Log.m105921e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty sceneList", str, str2);
            return Boolean.FALSE;
        } else {
            try {
                byte[] decode = Base64.decode(str3, 0);
                C90446wm2 wm22 = new C90446wm2();
                wm22.parseFrom(decode);
                if (wm22.f259923e.f130770d.f257327a.length == 0) {
                    Log.m105921e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], parse pb, invalid foreground control bytes", str, str2);
                    C87732a.INSTANCE.mo122144a(o75.f139012d.f132768f, 105);
                    return Boolean.FALSE;
                }
                C87732a aVar = C87732a.INSTANCE;
                aVar.mo122144a(o75.f139012d.f132768f, 104);
                LinkedList<Integer> linkedList = o75.f139014f;
                long a = C88022n.m109570a(o75.f139015g);
                long a2 = C88022n.m109570a(o75.f139016h);
                Log.m105925i("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s| %s] WriteToStorage, sceneList %s, time[%d, %d]", str, str2, m108803f(linkedList), Long.valueOf(a), Long.valueOf(a2));
                boolean jo = ((C33910e) C81161g2.Bx0(C33910e.class)).mo59362jo(decode, str2, linkedList, a, a2);
                aVar.mo122144a(o75.f139012d.f132768f, jo ? 107 : 108);
                return Boolean.valueOf(jo);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", e, "call[%s | %s], decode base64", str, str2);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: d */
    public e75 mo58859d(Object obj) {
        return ((o75) obj).f139012d;
    }

    /* renamed from: e */
    public String mo58860e() {
        return "CmdIssueLaunch";
    }
}
