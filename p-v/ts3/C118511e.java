package ts3;

import bt3.C113206a;
import com.p013qq.taf.RequestPacket;
import com.tencent.p014mm.plugin.normsg.C115634f;
import ft3.C116891b;
import ft3.C116898j;
import ft3.C87080a;
import us3.C118609c;

/* renamed from: ts3.e */
public class C118511e {
    /* renamed from: a */
    public static boolean m167177a(C118609c cVar, C118507b bVar, String str, String str2, C113206a aVar) {
        byte[] bArr;
        cVar.getClass();
        try {
            C116898j jVar = new C116898j(true);
            RequestPacket requestPacket = jVar.f350318b;
            requestPacket.iRequestId = 3;
            requestPacket.sServantName = str;
            requestPacket.sFuncName = str2;
            jVar.f350317a = "UTF-8";
            jVar.mo180862b("userInfo", cVar.mo183353a(aVar));
            jVar.mo180862b("req", aVar);
            byte[] a = C87080a.m108102a(jVar.mo180861a());
            if (a != null) {
                bArr = C116891b.m164878b(a, C116891b.m164880d());
                if (bArr != null && bArr.length != 0) {
                    return ((C115634f.C115635a) bVar).mo175843a(0, bArr);
                }
                ((C115634f.C115635a) bVar).mo175843a(-20, new byte[0]);
                return false;
            }
            throw new RuntimeException("compress data fail");
        } catch (Exception unused) {
            bArr = null;
        }
    }
}
