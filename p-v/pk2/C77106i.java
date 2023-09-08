package pk2;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.rtos.p320ui.RtosWatchLoginUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import de3.C75364j;
import de3.C75365k;
import gy3.C8479f0;
import gy3.C87412m;
import qg0.C12215a;

/* renamed from: pk2.i */
public final class C77106i implements C75364j<String> {

    /* renamed from: a */
    public final /* synthetic */ RtosWatchLoginUI f225214a;

    /* renamed from: b */
    public final /* synthetic */ C8479f0<String> f225215b;

    public C77106i(RtosWatchLoginUI rtosWatchLoginUI, C8479f0<String> f0Var) {
        this.f225214a = rtosWatchLoginUI;
        this.f225215b = f0Var;
    }

    /* renamed from: a */
    public void mo94024a(View view, int i, C75365k<String> kVar) {
        C87412m.m108594g(view, "view");
        C87412m.m108594g(kVar, "obj");
        RtosWatchLoginUI rtosWatchLoginUI = this.f225214a;
        C12215a.m11778c(rtosWatchLoginUI, rtosWatchLoginUI.getString(C0966R.string.mj4, new Object[]{LocaleUtil.getApplicationLanguage(), this.f225215b.f27484d}), 0, true);
    }
}
