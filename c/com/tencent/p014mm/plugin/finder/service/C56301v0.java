package com.tencent.p014mm.plugin.finder.service;

import android.os.PowerManager;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.service.v0 */
public final class C56301v0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56294r0 f160908d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f160909e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56301v0(C56294r0 r0Var, AppCompatActivity appCompatActivity) {
        super(0);
        this.f160908d = r0Var;
        this.f160909e = appCompatActivity;
    }

    public Object invoke() {
        MMFinderUI.C56369a aVar;
        C56294r0 r0Var = this.f160908d;
        PowerManager powerManager = (PowerManager) ((C36570n) r0Var.f160885h).getValue();
        r0Var.f160884g = !(powerManager != null ? powerManager.isInteractive() : true);
        if (this.f160908d.f160884g) {
            AppCompatActivity appCompatActivity = this.f160909e;
            MMFinderUI mMFinderUI = appCompatActivity instanceof MMFinderUI ? (MMFinderUI) appCompatActivity : null;
            if (!(mMFinderUI == null || (aVar = mMFinderUI.f161156h) == null)) {
                aVar.mo79125a("onScreenOff");
            }
        }
        return C13598b0.f38549a;
    }
}
