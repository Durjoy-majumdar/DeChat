package p42;

import com.tencent.p014mm.plugin.magicbrush.C30197h1;
import com.tencent.p014mm.plugin.magicbrush.C30217o0;
import com.tencent.p014mm.plugin.magicbrush.C30223r0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import gy3.C87412m;

/* renamed from: p42.b */
public final class C35366b extends C30217o0 implements ScreenShotUtil.ScreenShotCallback {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35366b(C30197h1 h1Var) {
        super(h1Var);
        C87412m.m108594g(h1Var, "service");
    }

    /* renamed from: b */
    public void mo57232b() {
        Log.m105924i("MBOnScreenShotEventImpl", "onStartListen");
        try {
            ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), this);
        } catch (Exception e) {
            Log.m105929w("MBOnScreenShotEventImpl", "setScreenShotCallback fail e:%s", e.getMessage());
        }
    }

    /* renamed from: c */
    public void mo57233c() {
        ScreenShotUtil.setScreenShotCallback(MMApplicationContext.getContext(), (ScreenShotUtil.ScreenShotCallback) null);
    }

    public void onScreenShot(String str, long j) {
        Log.m105924i("MBOnScreenShotEventImpl", "onScreenShot");
        this.f81653d.mo57213PY(C30223r0.OnScreenShot, "");
    }
}
