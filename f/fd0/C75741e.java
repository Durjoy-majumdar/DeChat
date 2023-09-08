package fd0;

import com.tencent.p014mm.autogen.events.FMessageMobileFilterEvent;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75573f;
import eb0.C97625j3;
import ob0.C35136m;
import ob0.C35141t;
import p196ln.C76706g;
import p196ln.C76708i;
import p872ah.C67046a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: fd0.e */
public class C75741e extends C75573f implements C35141t {
    /* renamed from: d */
    public C72963f4 mo71474d(C35136m.C35137a aVar, String str, String str2, String str3) {
        int i;
        C77949j3 j3Var = aVar.f94242a;
        String g = C48374j0.m53718g(j3Var.f227631h);
        if (g == null || g.length() <= 0) {
            Log.m105920e("MicroMsg.FMessageExtension", "possible friend msg : content is null");
            return null;
        }
        C72963f4.C72964b f = C72963f4.C72964b.m85654f(g);
        if (!(f.f212682h == null && f.f212683i == null) && ((i = f.f212681g) == 10 || i == 11)) {
            FMessageMobileFilterEvent fMessageMobileFilterEvent = new FMessageMobileFilterEvent();
            FMessageMobileFilterEvent.C67696a aVar2 = fMessageMobileFilterEvent.f193606d;
            aVar2.f193608a = f.f212682h;
            aVar2.f193609b = f.f212683i;
            fMessageMobileFilterEvent.publish();
            if (fMessageMobileFilterEvent.f193607e.f193610a) {
                Log.m105926v("MicroMsg.FMessageExtension", "possible mobile friend is not in local address book");
                return null;
            }
        }
        if (f.f212684j > 0) {
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106828Ux(f.f212684j, f.f212680f);
        }
        if (Util.nullAsNil(f.f212675a).length() > 0) {
            C68097n nVar = new C68097n();
            String str4 = f.f212675a;
            nVar.f195728a = str4;
            nVar.f195729b = 3;
            nVar.f195733f = 1;
            nVar.f195732e = f.f212695u;
            nVar.f195731d = f.f212696v;
            nVar.f195736i = -1;
            Log.m105919d("MicroMsg.FMessageExtension", "dkhurl user:[%s] big:[%s] sm:[%s]", str4, nVar.mo93594c(), nVar.mo93597f());
            ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93608Yt(nVar);
        }
        C72985m3 m3Var = new C72985m3();
        m3Var.field_createTime = C75742g.m91010b(str, (long) j3Var.f227635o);
        m3Var.field_isSend = 0;
        m3Var.field_msgContent = C48374j0.m53718g(j3Var.f227631h);
        m3Var.field_svrId = j3Var.f227638r;
        m3Var.field_talker = f.f212675a;
        m3Var.field_type = 0;
        C72979k3 qq = C75743h.vx0().mo101174qq(m3Var.field_talker);
        if (qq != null) {
            Log.m105918d("MicroMsg.FMessageExtension", "getByEncryptTalker success. encryptTalker = " + m3Var.field_talker + " , real talker = " + qq.field_talker);
            m3Var.field_encryptTalker = m3Var.field_talker;
            m3Var.field_talker = qq.field_talker;
        }
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(m3Var.field_talker);
        if (z1Var == null || !z1Var.mo62927s3() || z1Var.f108320R1 <= 0) {
            C75743h.wx0().insert(m3Var);
            return null;
        }
        Log.m105918d("MicroMsg.FMessageExtension", "The biz contact whose talker is " + m3Var.field_talker + " has already been in user's contact list");
        return null;
    }

    /* renamed from: nA */
    public /* synthetic */ boolean mo56405nA(C67046a aVar, String str, long j, String str2, String str3, String str4, int i, String str5, String str6, String str7, int i2) {
        return false;
    }
}
