package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.MultiContextNodeJS;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.appbrand.v8.i */
public final class C80667i extends C80693r {

    /* renamed from: o */
    public static final ThreadLocal<C80667i> f236035o = new ThreadLocal<>();

    /* renamed from: m */
    public final C80668a f236036m;

    /* renamed from: n */
    public boolean f236037n = true;

    /* renamed from: com.tencent.mm.appbrand.v8.i$a */
    public interface C80668a {
    }

    public C80667i(C80668a aVar, boolean z) {
        super(z);
        this.f236036m = aVar;
    }

    /* renamed from: k */
    public void mo112491k() {
        super.mo112491k();
        this.f236037n = C80662g.this.f236029y.handleMessage(true);
    }

    /* renamed from: m */
    public void mo112492m() {
        super.mo112492m();
        this.f236037n = C80662g.this.f236029y.handleMessage(false);
    }

    /* renamed from: n */
    public void mo112493n() {
        MultiContextNodeJS multiContextNodeJS;
        super.mo112493n();
        C80668a aVar = this.f236036m;
        if (aVar != null && (multiContextNodeJS = C80662g.this.f236029y) != null) {
            multiContextNodeJS.closeUVLoop();
        }
    }

    /* renamed from: o */
    public void mo112494o() {
        if (this.f236036m != null) {
            Log.m105924i("MicroMsg.NodeJSRuntimeLooper", "onQuit wakeUpUVLoop");
            MultiContextNodeJS multiContextNodeJS = C80662g.this.f236029y;
            if (multiContextNodeJS != null) {
                multiContextNodeJS.wakeUpUVLoop();
            }
        }
    }

    /* renamed from: p */
    public void mo112495p() {
        MultiContextNodeJS multiContextNodeJS;
        C80668a aVar = this.f236036m;
        if (aVar != null && (multiContextNodeJS = C80662g.this.f236029y) != null) {
            multiContextNodeJS.wakeUpUVLoop();
        }
    }

    /* renamed from: q */
    public void mo112496q() {
        MultiContextNodeJS multiContextNodeJS;
        if (this.f236036m != null && !mo112524l() && (multiContextNodeJS = C80662g.this.f236029y) != null) {
            multiContextNodeJS.wakeUpUVLoop();
        }
    }

    /* renamed from: s */
    public boolean mo112497s() {
        return !this.f236037n && super.mo112497s();
    }
}
