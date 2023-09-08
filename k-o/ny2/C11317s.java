package ny2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: ny2.s */
public class C11317s implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsTeenModeMain f33275d;

    public C11317s(SettingsTeenModeMain settingsTeenModeMain) {
        this.f33275d = settingsTeenModeMain;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107140d(0, this.f33275d.getResources().getColor(C0966R.color.a_0), this.f33275d.getString(C0966R.string.jwk));
    }
}
