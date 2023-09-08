package v82;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.MultiTalkControlIconLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: v82.t */
public final class C78371t<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ MultiTalkControlIconLayout f229649d;

    public C78371t(MultiTalkControlIconLayout multiTalkControlIconLayout) {
        this.f229649d = multiTalkControlIconLayout;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        Log.m105924i("MicroMsg.MT.ControlPanelLogic", "mic btn state: " + bool);
        MultiTalkControlIconLayout multiTalkControlIconLayout = this.f229649d;
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        multiTalkControlIconLayout.setChecked(bool.booleanValue());
    }
}
