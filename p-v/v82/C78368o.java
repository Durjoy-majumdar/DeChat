package v82;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: v82.o */
public final class C78368o<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkControlIconLayout f229646d;

    public C78368o(MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f229646d = multiTalkControlIconLayout;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "camera btn state: " + bool);
        MultiTalkControlIconLayout multiTalkControlIconLayout = this.f229646d;
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        multiTalkControlIconLayout.setChecked(bool.booleanValue());
    }
}
