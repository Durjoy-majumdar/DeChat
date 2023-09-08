package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import by0.C16825a;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18468r;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import dx0.C31332a;
import fx0.C20729b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.a4 */
public class C18188a4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f50266d;

    /* renamed from: e */
    public final /* synthetic */ int f50267e;

    /* renamed from: f */
    public final /* synthetic */ List f50268f;

    /* renamed from: g */
    public final /* synthetic */ BizTimeLineUI f50269g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.a4$a */
    public class C18189a implements Runnable {
        public C18189a() {
        }

        public void run() {
            BizTimeLineUI bizTimeLineUI = C18188a4.this.f50269g;
            bizTimeLineUI.f50250w.mo35255b(bizTimeLineUI.f50235f);
            C16825a aVar = C16825a.f45444a;
            C16825a.C16826a aVar2 = C16825a.C16826a.INIT;
            BizTimeLineUI bizTimeLineUI2 = C18188a4.this.f50269g;
            aVar.mo17863a(aVar2, bizTimeLineUI2.f50235f, bizTimeLineUI2.f50246s);
            C20729b bVar = C20729b.f58601a;
            BizTimeLineUI bizTimeLineUI3 = C18188a4.this.f50269g;
            bVar.mo32440a(bizTimeLineUI3.f50235f, bizTimeLineUI3.f50246s);
        }
    }

    public C18188a4(BizTimeLineUI bizTimeLineUI, boolean z, int i, List list, int i2) {
        this.f50269g = bizTimeLineUI;
        this.f50266d = z;
        this.f50267e = i;
        this.f50268f = list;
    }

    public void run() {
        if (!this.f50266d) {
            BizTimeLineUI bizTimeLineUI = this.f50269g;
            bizTimeLineUI.mo22781I7(bizTimeLineUI.f50235f.getFirstVisiblePosition(), this.f50269g.f50235f.getLastVisiblePosition());
        } else if (this.f50267e != 0) {
            this.f50269g.mo22785M7();
        } else {
            BizTimeLineUI bizTimeLineUI2 = this.f50269g;
            bizTimeLineUI2.mo22783K7(bizTimeLineUI2.f50246s.getItem(0));
        }
        if (!Util.isNullOrNil(this.f50268f)) {
            long j = ((C19623o0) this.f50268f.get(0)).field_orderFlag;
            BizTimeLineUI bizTimeLineUI3 = this.f50269g;
            C18412m3 m3Var = bizTimeLineUI3.f50249v;
            int i = bizTimeLineUI3.f50209B;
            int intExtra = bizTimeLineUI3.getIntent().getIntExtra("Main_IndexInSessionList", 0);
            CopyOnWriteArrayList<C18468r> copyOnWriteArrayList = this.f50269g.f50245r.f51172n;
            m3Var.getClass();
            C31332a.m39373a("BrandServiceWorkerThread", new C18409k3(m3Var, j, copyOnWriteArrayList, i, intExtra), 0);
        }
        C119179t tVar = C119157j.f356862d;
        C18189a aVar = new C18189a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 100, false);
    }
}
