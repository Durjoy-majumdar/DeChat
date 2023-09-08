package com.tencent.p014mm.matrix;

import com.tencent.matrix.openglleak.hook.OpenGLHook;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.matrix.dice.C80982a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p1034se.C90173a;
import p723vf.C118672d;
import p761yd.C91441c;
import qe3.C89625d;

/* renamed from: com.tencent.mm.matrix.g */
public class C80987g implements C80982a.C80983a {

    /* renamed from: d */
    public final /* synthetic */ boolean f237871d;

    /* renamed from: e */
    public final /* synthetic */ C91441c.C91443b f237872e;

    /* renamed from: f */
    public final /* synthetic */ double f237873f;

    /* renamed from: g */
    public final /* synthetic */ C80981c f237874g;

    /* renamed from: com.tencent.mm.matrix.g$a */
    public class C80988a implements C114668z {
        public C80988a() {
        }

        public void onAppBackground(String str) {
            C80981c cVar = C80987g.this.f237874g;
            cVar.f237858j.postDelayed(cVar.f237857i, 3600000);
        }

        public void onAppForeground(String str) {
            C80981c cVar = C80987g.this.f237874g;
            cVar.f237858j.removeCallbacks(cVar.f237857i);
        }
    }

    public C80987g(C80981c cVar, boolean z, C91441c.C91443b bVar, double d) {
        this.f237874g = cVar;
        this.f237871d = z;
        this.f237872e = bVar;
        this.f237873f = d;
    }

    /* renamed from: S1 */
    public double mo55862S1() {
        if (BuildInfo.DEBUG || Log.getLogLevel() <= 1 || BuildInfo.IS_FLAVOR_RED || C89625d.f257845k || BuildInfo.ENABLE_MATRIX_OPENGL_HOOK || BuildInfo.IS_FLAVOR_P_ALPHA) {
            return 1.0d;
        }
        return this.f237873f;
    }

    public long b00() {
        return 0;
    }

    /* renamed from: kD */
    public void mo55864kD(double d) {
        if (this.f237871d) {
            this.f237874g.f237859n = new C90173a(MMApplicationContext.getContext());
            this.f237874g.f237859n.getClass();
            OpenGLHook.getInstance().setJavaStackDump(true);
            this.f237874g.f237859n.getClass();
            OpenGLHook.getInstance().setNativeStackDump(true);
            C80981c cVar = this.f237874g;
            C90173a aVar = cVar.f237859n;
            C80989h hVar = new C80989h(cVar);
            aVar.getClass();
            if (C90173a.f258891i != null) {
                C118672d.m167352b("matrix.OpenglLeakPlugin", "OpenglReportCallback register again, May be overwrite !!!", new Object[0]);
            }
            C90173a.f258891i = hVar;
            this.f237872e.mo125379a(this.f237874g.f237859n);
            Log.m105924i("MatrixDelegate", "[OpenglLeakPlugin: Matrix add OpenglLeakPlugin success]");
            AppForegroundDelegate.INSTANCE.mo174208a(new C80988a());
        }
    }

    public String key() {
        return "OpenglLeakPlugin_Dice";
    }
}
