package l71;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting;
import di3.C86301e;
import ei3.C86522b;
import l71.C34192f;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import te3.C50243lc2;
import te3.C50383mc2;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: l71.b */
public class C34186b extends C86301e implements C34192f {

    /* renamed from: l71.b$a */
    public class C34187a implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ C34192f.C34193a f92204d;

        public C34187a(C34186b bVar, C34192f.C34193a aVar) {
            this.f92204d = aVar;
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            boolean z;
            if (yVar.getType() != 1926) {
                return 0;
            }
            boolean z2 = true;
            if (i == 0 && i2 == 0) {
                C50383mc2 mc22 = (C50383mc2) cVar.f127056b.f127083a;
                z = mc22 != null && mc22.f137953d;
            } else {
                z = false;
                z2 = false;
            }
            C34192f.C34193a aVar = this.f92204d;
            if (aVar != null) {
                ((JsApiOpenWeRunSetting.OpenWeRunSetting.C81992a.C81993a) aVar).mo114443a(z2, z);
            }
            return 0;
        }
    }

    public void Am0(C34192f.C34193a aVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50243lc2();
        bVar.f127067b = new C50383mc2();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/getwerunuserstate";
        bVar.f127069d = 1926;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C89144l0.m111429e(bVar.mo72403a(), new C34187a(this, aVar), true);
    }
}
