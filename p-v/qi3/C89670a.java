package qi3;

import af3.C79525e;
import com.tencent.p014mm.recoveryv2.C85671c;
import com.tencent.p014mm.recoveryv2.C85692k;
import com.tencent.p014mm.sdk.platformtools.Log;
import iv3.C87825c;
import java.io.File;
import ri3.C89966b;

/* renamed from: qi3.a */
public class C89670a {
    /* renamed from: a */
    public void mo123996a(C89673c cVar) {
        C89966b bVar = cVar.f257918r;
        if (bVar != null) {
            C79525e.C79530e eVar = (C79525e.C79530e) bVar;
            File file = cVar.f257910g;
            C85671c.m105784b("MicroMsg.recovery.operator", "#onComplete, file = " + file);
            C85671c.m105784b("MicroMsg.recovery.operator", "download tinker path success");
            if (file.exists()) {
                eVar.f233177a.set(0);
                if (eVar.f233178b) {
                    C87825c.m109282a(eVar.f233179c, file.getAbsolutePath());
                }
                eVar.f233180d.accept(Integer.valueOf(eVar.f233177a.get()));
                return;
            }
            eVar.f233177a.set(2);
            eVar.f233180d.accept(Integer.valueOf(eVar.f233177a.get()));
        }
    }

    /* renamed from: b */
    public void mo123997b(C89673c cVar, int i, String str) {
        C89966b bVar = cVar.f257918r;
        if (bVar != null) {
            C79525e.C79530e eVar = (C79525e.C79530e) bVar;
            String str2 = "#onFailed, code = " + i + ", msg = " + str;
            Log.m105928w("MicroMsg.recovery.operator", str2);
            C85692k.C85693a.m105840a(5, "MicroMsg.recovery.operator", str2);
            eVar.f233177a.set(i == 1001 ? 3 : (i < 1101 || i > 1106) ? 2 : (i - 1101) + 4);
            eVar.f233180d.accept(Integer.valueOf(eVar.f233177a.get()));
        }
    }
}
