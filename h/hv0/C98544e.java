package hv0;

import a11.C39479c;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C44579p;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import hd0.C98410o0;
import p158gt.C98201k;
import p441aq.C92054g;
import p682rz.C101488s;
import p763ym.C53543s;
import yu0.C102908a;

/* renamed from: hv0.e */
public class C98544e extends C102908a {

    /* renamed from: d */
    public static C98544e f288982d;

    /* renamed from: b */
    public C98542c f288983b;

    /* renamed from: c */
    public C98540b f288984c;

    /* renamed from: f */
    public static C98544e m128035f() {
        if (f288982d == null) {
            C98544e eVar = new C98544e();
            f288982d = eVar;
            C102908a.m136012a(eVar);
        }
        return f288982d;
    }

    /* renamed from: b */
    public void mo17656b() {
        f288982d = null;
    }

    /* renamed from: c */
    public void mo137899c() {
        Log.m105924i("MicroMsg.BackupStorageModel", "backupInitStorage.");
        C98542c e = mo137901e();
        String f = C97625j3.m125812b().mo105891f();
        int G = C97625j3.m125812b().mo105881G();
        e.getClass();
        Class cls = C53543s.class;
        Log.m105925i("MicroMsg.BackupStorage", "setBackupStorage, accPath:%s, accUin:%d, caller:%s", f, Integer.valueOf(G), Util.getStack());
        e.f288980o = G;
        e.f288981p = f;
        e.f288979n = C97625j3.m125812b().mo105909x();
        e.f288966a = C97625j3.m125812b().mo105906u();
        e.f288967b = C97625j3.m125812b().mo105907v();
        e.f288969d = C97625j3.m125812b().mo105908w();
        e.f288968c = C97625j3.m125812b().mo105911z();
        e.f288972g = C97625j3.m125812b().mo105877C();
        e.f288970e = (C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi();
        ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
        e.f288971f = C30790w2.m39221h().mo57717d();
        e.f288974i = ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr();
        e.f288973h = (C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0();
        e.f288975j = (C96776s) ((C53543s) C86312j.m106911c(cls)).mo74023HM();
        e.f288976k = (C44579p) ((C53543s) C86312j.m106911c(cls)).Gk0();
        e.f288977l = (C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ();
        C97625j3.m125812b().getClass();
        C86709a0.m107528h();
        C86709a0.m107523b().mo121108c();
        e.f288978m = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX();
    }

    /* renamed from: d */
    public C98540b mo137900d() {
        if (this.f288984c == null) {
            this.f288984c = new C98540b();
        }
        return this.f288984c;
    }

    /* renamed from: e */
    public C98542c mo137901e() {
        if (this.f288983b == null) {
            this.f288983b = new C98542c();
        }
        return this.f288983b;
    }
}
