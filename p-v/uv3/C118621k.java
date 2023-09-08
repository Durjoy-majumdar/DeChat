package uv3;

import com.p013qq.taf.RequestPacket;
import com.tencent.p014mm.plugin.normsg.C115634f;
import com.tencent.p014mm.sdk.platformtools.Log;
import ew3.C116791a;
import gw3.C116997a;
import jm2.C117361f;
import mw3.C117582a;
import rv3.C118245h;
import rv3.C90099a;
import rv3.C90100b;
import sv3.C118317a;

/* renamed from: uv3.k */
public class C118621k implements C116791a {

    /* renamed from: a */
    public final /* synthetic */ C118613c f354965a;

    /* renamed from: b */
    public final /* synthetic */ C118616f f354966b;

    /* renamed from: c */
    public final /* synthetic */ C118619j f354967c;

    public C118621k(C118619j jVar, C118613c cVar, C118616f fVar) {
        this.f354967c = jVar;
        this.f354965a = cVar;
        this.f354966b = fVar;
    }

    /* renamed from: a */
    public void mo180765a(int i, C116997a aVar) {
        if (this.f354965a != null) {
            byte[] bArr = null;
            C116997a e = (i != 0 || aVar == null) ? C118619j.m167301e(this.f354967c, (C116997a) null) : C118619j.m167301e(this.f354967c, aVar);
            C117582a aVar2 = this.f354967c.f354962c;
            C118612b bVar = this.f354966b.f354956d;
            C118612b bVar2 = C118612b.GESTURETYPE_MULTI;
            String str = bVar == bVar2 ? "TeenyProto" : "masterRecoV2New";
            String str2 = bVar == bVar2 ? "teenyProtoCheckWup" : "ownerRecoV2Wup";
            aVar2.getClass();
            if (e != null) {
                try {
                    C118317a aVar3 = new C118317a(true);
                    RequestPacket requestPacket = aVar3.f353598b;
                    requestPacket.iRequestId = 3;
                    requestPacket.sServantName = str;
                    requestPacket.sFuncName = str2;
                    aVar3.f353597a = "UTF-8";
                    aVar3.mo183101b("user", aVar2.mo182316a(e));
                    aVar3.mo183101b("req", e);
                    byte[] a = C90099a.m112721a(aVar3.mo183100a());
                    if (a != null) {
                        bArr = C90100b.m112725c(a, C90100b.m112727e());
                    } else {
                        throw new RuntimeException("compress game1.data fail");
                    }
                } catch (Exception e2) {
                    if (C118245h.f353423a) {
                        Log.m105921e("sensor_WupProxy", "", e2);
                    }
                }
            }
            ((C115634f.C115637c) this.f354965a).getClass();
            C117361f.INSTANCE.mo182031ZB(bArr);
        }
    }
}
