package wq3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: wq3.v */
public final class C91097v extends UIComponent {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91097v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        C91095g e = C111855q.f334885a.mo163608b().mo163577e();
        if (e != null) {
            e.mo125150b(getActivity());
        }
    }

    public void onDestroy() {
        C91095g e = C111855q.f334885a.mo163608b().mo163577e();
        if (e != null) {
            e.mo125153e(getActivity());
        }
        super.onDestroy();
    }
}
