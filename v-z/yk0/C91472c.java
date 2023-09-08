package yk0;

import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.p941ui.MagicBrushView;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;

/* renamed from: yk0.c */
public final class C91472c implements MagicBrushView.C80325f {

    /* renamed from: a */
    public final /* synthetic */ C91469a f262262a;

    /* renamed from: b */
    public final /* synthetic */ C80301a f262263b;

    /* renamed from: c */
    public final /* synthetic */ C82381f f262264c;

    /* renamed from: d */
    public final /* synthetic */ int f262265d;

    /* renamed from: e */
    public final /* synthetic */ C82870p f262266e;

    /* renamed from: yk0.c$a */
    public static final class C91473a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262267d;

        /* renamed from: e */
        public final /* synthetic */ int f262268e;

        /* renamed from: f */
        public final /* synthetic */ C82870p f262269f;

        public C91473a(C82381f fVar, int i, C82870p pVar) {
            this.f262267d = fVar;
            this.f262268e = i;
            this.f262269f = pVar;
        }

        public final void run() {
            this.f262267d.mo109647a(this.f262268e, this.f262269f.mo115109j("ok"));
        }
    }

    public C91472c(C91469a aVar, C80301a aVar2, C82381f fVar, int i, C82870p pVar) {
        this.f262262a = aVar;
        this.f262263b = aVar2;
        this.f262264c = fVar;
        this.f262265d = i;
        this.f262266e = pVar;
    }

    public void onPrepared() {
        if (!this.f262262a.f262257s) {
            this.f262263b.f235057f.mo123773p(new C91473a(this.f262264c, this.f262265d, this.f262266e), false);
        }
    }
}
