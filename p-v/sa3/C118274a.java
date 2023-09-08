package sa3;

import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.welab.p130ui.WelabAppInfoUI;
import ra3.C118229a;

/* renamed from: sa3.a */
public class C118274a implements MMSwitchBtn.C7041b {

    /* renamed from: a */
    public final /* synthetic */ WelabAppInfoUI f353515a;

    public C118274a(WelabAppInfoUI welabAppInfoUI) {
        this.f353515a = welabAppInfoUI;
    }

    public void onStatusChange(boolean z) {
        C118229a aVar = this.f353515a.f347597e;
        int i = aVar.field_Switch;
        if (i == 2) {
            aVar.field_Switch = 1;
        } else if (i == 1) {
            aVar.field_Switch = 2;
        }
    }
}
