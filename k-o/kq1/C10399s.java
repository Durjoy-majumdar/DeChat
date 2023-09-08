package kq1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: kq1.s */
public final class C10399s extends UIComponent implements C7020t0 {

    /* renamed from: d */
    public KeyboardHeightProvider f31624d;

    /* renamed from: e */
    public final ArrayList<C7020t0> f31625e = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10399s(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        for (C7020t0 Q1 : new ArrayList(this.f31625e)) {
            Q1.mo531Q1(i, z);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(getActivity());
        this.f31624d = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
    }

    public void onPause() {
        super.onPause();
        KeyboardHeightProvider keyboardHeightProvider = this.f31624d;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
        }
    }

    public void onResume() {
        super.onResume();
        KeyboardHeightProvider keyboardHeightProvider = this.f31624d;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104022e();
        }
    }
}
