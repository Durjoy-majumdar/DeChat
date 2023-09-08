package ij2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import hj2.C59927b;
import yb2.C66605h;

/* renamed from: ij2.i */
public final class C60326i extends C66605h<C59927b> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60326i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public BaseState mo85303g3() {
        return new C59927b();
    }
}
