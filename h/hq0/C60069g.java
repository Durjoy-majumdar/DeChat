package hq0;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import di3.C86312j;
import gq0.C59603h0;
import hq0.C60064e;
import ob0.C47350c;
import te3.C50775p32;
import te3.C64647q32;

/* renamed from: hq0.g */
public final class C60069g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MaterialModel f171421d;

    public C60069g(MaterialModel materialModel) {
        this.f171421d = materialModel;
    }

    public final void run() {
        MaterialModel materialModel = this.f171421d;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getmaterialrecommwxacard";
        bVar.f127069d = 5049;
        C50775p32 p322 = new C50775p32();
        p322.f139546d = materialModel.f267604d;
        p322.f139547e = materialModel.f267605e;
        bVar.f127066a = p322;
        bVar.f127067b = new C64647q32();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C60064e.C60065a(materialModel, (C59603h0) null));
    }
}
