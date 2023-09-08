package u02;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import q02.C47745i;

/* renamed from: u02.a */
public class C52402a implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ HoneyPayCardManagerUI f146478a;

    public C52402a(HoneyPayCardManagerUI honeyPayCardManagerUI) {
        this.f146478a = honeyPayCardManagerUI;
    }

    public void onStatusChange(boolean z) {
        Log.m105919d(this.f146478a.f114712d, "check %s", Boolean.valueOf(z));
        HoneyPayCardManagerUI honeyPayCardManagerUI = this.f146478a;
        int i = HoneyPayCardManagerUI.f114744Z;
        Log.m105924i(honeyPayCardManagerUI.f114712d, "do modify notify");
        C47745i iVar = new C47745i(z ? 1 : 0);
        iVar.mo104821m1(honeyPayCardManagerUI);
        honeyPayCardManagerUI.doSceneProgress(iVar, false);
    }
}
