package gx0;

import com.tencent.p014mm.plugin.brandservice.p028ui.BrandServiceIndexUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p274xx.C15907f;
import xm2.C23109g;

/* renamed from: gx0.f */
public class C8474f implements C15907f.C15908a {

    /* renamed from: a */
    public final /* synthetic */ BrandServiceIndexUI f27476a;

    public C8474f(BrandServiceIndexUI brandServiceIndexUI) {
        this.f27476a = brandServiceIndexUI;
    }

    /* renamed from: a */
    public void mo9404a() {
        Log.m105924i("MicroMsg.BrandService.BrandServiceIndexUI", "doPopUpCloseSheet fail!");
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.BrandService.BrandServiceIndexUI", "doPopUpCloseSheet success!");
        ((C15907f) C86312j.m106911c(C15907f.class)).Hr0(this.f27476a.getContext(), 3, 1, 256, 0, (C23109g) null, true);
        this.f27476a.finish();
    }
}
