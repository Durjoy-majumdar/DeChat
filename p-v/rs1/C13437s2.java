package rs1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8780k2;
import nj3.C76912y0;
import p166hy.C98567o0;

/* renamed from: rs1.s2 */
public final class C13437s2 extends UIComponent implements C8780k2 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13437s2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && intent != null) {
            ((C98567o0) C86312j.m106911c(C98567o0.class)).mo137595om(intent);
            C76912y0.m92769h(getContext(), getContext().getResources().getString(C0966R.string.f360096a30), C0966R.raw.toast_ok);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13437s2(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
