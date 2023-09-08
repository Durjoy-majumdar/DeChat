package sb2;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import kg3.C76577a;
import tb2.C64216a;

/* renamed from: sb2.b */
public final class C63741b extends UIComponent {

    /* renamed from: d */
    public C64216a f180692d;

    static {
        C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3740cu);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63741b(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }
}
