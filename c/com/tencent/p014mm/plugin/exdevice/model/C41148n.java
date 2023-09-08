package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.plugin.exdevice.service.C41178a;
import com.tencent.p014mm.plugin.exdevice.service.C41180b;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: com.tencent.mm.plugin.exdevice.model.n */
public class C41148n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f110855d;

    /* renamed from: e */
    public final /* synthetic */ boolean f110856e;

    /* renamed from: f */
    public final /* synthetic */ C41140m f110857f;

    /* renamed from: com.tencent.mm.plugin.exdevice.model.n$a */
    public class C41149a extends C41178a.C41179a {
        public C41149a(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo64202a() {
            C41148n nVar = C41148n.this;
            nVar.f110857f.f110826a.f110938d = null;
            C41180b.f110942e.mo64233a(nVar.f110855d, nVar.f110856e);
        }
    }

    public C41148n(C41140m mVar, String str, boolean z) {
        this.f110857f = mVar;
        this.f110855d = str;
        this.f110856e = z;
    }

    public void run() {
        C41140m mVar = this.f110857f;
        if (mVar.f110826a == null) {
            mVar.f110826a = new C41178a();
            C41178a aVar = this.f110857f.f110826a;
            aVar.f110938d = new C41149a(0);
            aVar.mo64230a(MMApplicationContext.getContext());
            return;
        }
        C41180b.f110942e.mo64233a(this.f110855d, this.f110856e);
    }

    public String toString() {
        return super.toString() + "|ranging";
    }
}
