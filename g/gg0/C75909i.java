package gg0;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactStatusUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactVerifyUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C86312j;
import eb0.C75592q0;
import ig0.C76343k;
import ke3.C88144b;
import p214om.C11502f;
import wc3.C15141z;

/* renamed from: gg0.i */
public class C75909i implements C76343k.C76347d {

    /* renamed from: a */
    public final /* synthetic */ String f222581a;

    /* renamed from: b */
    public final /* synthetic */ BindMContactIntroUI f222582b;

    public C75909i(BindMContactIntroUI bindMContactIntroUI, String str) {
        this.f222582b = bindMContactIntroUI;
        this.f222581a = str;
    }

    /* renamed from: a */
    public void mo93913a(int i, Bundle bundle) {
        if (i == 2) {
            BindMContactIntroUI bindMContactIntroUI = this.f222582b;
            boolean z = false;
            if (bindMContactIntroUI.f344300u == 1) {
                if ((C75592q0.m90786p() & 16384) != 0) {
                    z = true;
                }
                if (!z) {
                    UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new UpdateLocalVerifySwitchEvent();
                    UpdateLocalVerifySwitchEvent.C67808a aVar = updateLocalVerifySwitchEvent.f193987d;
                    aVar.f193988a = true;
                    aVar.f193989b = true;
                    updateLocalVerifySwitchEvent.publish();
                }
                this.f222582b.mo7680J7();
                Intent intent = new Intent();
                intent.addFlags(67108864);
                C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
                BindMContactIntroUI bindMContactIntroUI2 = this.f222582b;
                ((C67654r1) yM).getClass();
                if (bindMContactIntroUI2 != null) {
                    C88144b.m109791i(bindMContactIntroUI2, "account", ".security.ui.MySafeDeviceListUI", intent, (Bundle) null);
                    return;
                }
                return;
            }
            MMWizardActivity.m7017L7(bindMContactIntroUI, new Intent(this.f222582b, BindMContactStatusUI.class).putExtra("bind_scene", this.f222582b.f344300u));
            BindMContactIntroUI bindMContactIntroUI3 = this.f222582b;
            if (!bindMContactIntroUI3.f344298s) {
                return;
            }
            if (bindMContactIntroUI3.f344300u == 2) {
                C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 3, 3);
                return;
            }
            C115669n.INSTANCE.mo160131h(ErrorCode.ERROR_OUTOF_MEMORY, 1, 2);
        } else if (i == 1) {
            Intent intent2 = new Intent(this.f222582b, BindMContactVerifyUI.class);
            intent2.putExtra("bindmcontact_mobile", this.f222581a);
            intent2.putExtra("bind_scene", this.f222582b.f344300u);
            intent2.putExtra("KEnterFromBanner", this.f222582b.f344298s);
            MMWizardActivity.m7017L7(this.f222582b, intent2);
        }
    }
}
