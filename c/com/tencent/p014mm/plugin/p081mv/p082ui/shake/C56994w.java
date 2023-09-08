package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import com.tencent.p014mm.autogen.mmdata.rpt.ShakeActionReport2Struct;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.w */
public final class C56994w {

    /* renamed from: a */
    public static final C56994w f163218a = new C56994w();

    /* renamed from: b */
    public static ShakeActionReport2Struct f163219b = new ShakeActionReport2Struct();

    /* renamed from: com.tencent.mm.plugin.mv.ui.shake.w$a */
    public static final class C56995a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f163220d;

        public C56995a(int i) {
            this.f163220d = i;
        }

        public final void run() {
            C56994w wVar = C56994w.f163218a;
            ShakeActionReport2Struct shakeActionReport2Struct = C56994w.f163219b;
            shakeActionReport2Struct.f156835d = this.f163220d;
            if (shakeActionReport2Struct != null) {
                shakeActionReport2Struct.mo86054n();
            }
        }
    }

    /* renamed from: a */
    public final void mo80436a(int i) {
        C119179t tVar = C119157j.f356862d;
        C56995a aVar = new C56995a(i);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183889t(aVar, 100, (String) null);
    }
}
