package com.tencent.p014mm.plugin.webview.p128ui.tools.fts;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import ud3.C101998d;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.b0 */
public class C43960b0 {

    /* renamed from: e */
    public static C43960b0 f119089e;

    /* renamed from: a */
    public C101998d f119090a;

    /* renamed from: b */
    public long f119091b;

    /* renamed from: c */
    public boolean f119092c = false;

    /* renamed from: d */
    public boolean f119093d = false;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.b0$a */
    public class C43961a extends C101998d.C101999a {

        /* renamed from: d */
        public final /* synthetic */ C43962b f119094d;

        public C43961a(C43962b bVar) {
            this.f119094d = bVar;
        }

        public void onRelease() {
        }

        public void onShake(boolean z) {
            Log.m105924i("WebSearchShakeCheckingManager", "onShake");
            long ticksToNow = Util.ticksToNow(C43960b0.this.f119091b);
            C43960b0 b0Var = C43960b0.this;
            if (!b0Var.f119092c) {
                if (ticksToNow < 1200) {
                    return;
                }
            } else if (ticksToNow < 1000) {
                return;
            }
            b0Var.f119091b = Util.currentTicks();
            C43960b0.this.f119092c = true;
            C43962b bVar = this.f119094d;
            if (bVar != null) {
                bVar.call();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.b0$b */
    public interface C43962b {
        void call();
    }

    /* renamed from: a */
    public void mo68556a(C43962b bVar) {
        if (!this.f119093d || this.f119090a == null) {
            this.f119093d = true;
            C101998d dVar = new C101998d(MMApplicationContext.getContext());
            this.f119090a = dVar;
            dVar.mo141497a(new C43961a(bVar));
            this.f119091b = Util.currentTicks();
            return;
        }
        Log.m105924i("WebSearchShakeCheckingManager", "startCheck , isInitShake.");
    }
}
