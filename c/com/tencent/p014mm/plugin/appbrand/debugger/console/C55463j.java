package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.j */
public final class C55463j {

    /* renamed from: a */
    public C32224a<C13598b0> f158036a;

    /* renamed from: b */
    public final C13601g f158037b;

    /* renamed from: c */
    public final C13601g f158038c;

    /* renamed from: d */
    public final C13601g f158039d;

    /* renamed from: e */
    public final C13601g f158040e;

    /* renamed from: f */
    public final C13601g f158041f;

    /* renamed from: g */
    public boolean f158042g;

    public C55463j(C32224a<C13598b0> aVar, int i, C8480h hVar) {
        this.f158036a = (i & 1) != 0 ? null : aVar;
        this.f158037b = C36568h.m40985a(C1525i.f10895d);
        this.f158038c = C36568h.m40985a(new C55459d(this));
        this.f158039d = C36568h.m40985a(C1524e.f10894d);
        this.f158040e = C36568h.m40985a(new C55462h(this));
        this.f158041f = C36568h.m40985a(new C55458c(this));
    }

    /* renamed from: a */
    public static final Point m63109a(C55463j jVar) {
        return (Point) ((C36570n) jVar.f158038c).getValue();
    }

    /* renamed from: b */
    public final View mo76978b() {
        return (View) ((C36570n) this.f158040e).getValue();
    }

    /* renamed from: c */
    public final void mo76979c() {
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "hide, isShown: " + this.f158042g);
        if (this.f158042g) {
            try {
                WindowManager windowManager = (WindowManager) ((C36570n) this.f158037b).getValue();
                if (windowManager != null) {
                    windowManager.removeView(mo76978b());
                    C13598b0 b0Var = C13598b0.f38549a;
                    this.f158042g = false;
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "hide, removeView fail since " + e);
            }
        }
    }

    /* renamed from: d */
    public final void mo76980d() {
        Log.m105924i("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "show, isShown: " + this.f158042g);
        if (!this.f158042g) {
            try {
                WindowManager windowManager = (WindowManager) ((C36570n) this.f158037b).getValue();
                if (windowManager != null) {
                    windowManager.addView(mo76978b(), (WindowManager.LayoutParams) ((C36570n) this.f158041f).getValue());
                    C13598b0 b0Var = C13598b0.f38549a;
                    this.f158042g = true;
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.AppBrand.ConsolePrintControlFloatWindow", "show, addView fail since " + e);
            }
        }
    }
}
