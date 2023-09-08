package v82;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: v82.q */
public final class C78370q<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkControlIconLayout f229648d;

    public C78370q(MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f229648d = multiTalkControlIconLayout;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "cameraEnable state: " + bool);
        MultiTalkControlIconLayout multiTalkControlIconLayout = this.f229648d;
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        multiTalkControlIconLayout.setIconEnabled(bool.booleanValue());
    }
}
