package v82;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: v82.p */
public final class C78369p<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkControlIconLayout f229647d;

    public C78369p(MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f229647d = multiTalkControlIconLayout;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "handsfreeEnable state: " + bool);
        MultiTalkControlIconLayout multiTalkControlIconLayout = this.f229647d;
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        multiTalkControlIconLayout.setIconEnabled(bool.booleanValue());
    }
}
