package yb2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: yb2.h */
public abstract class C66605h<State extends BaseState> extends C15946a {

    /* renamed from: d */
    public UIStateCenter<State> f191525d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66605h(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public abstract State mo85303g3();

    public void onCreateBefore(Bundle bundle) {
        this.f191525d = new UIStateCenter(mo85303g3(), getActivity(), (String) null, (LifecycleScope) null, 12, (C8480h) null);
    }
}
