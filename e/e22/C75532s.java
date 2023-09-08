package e22;

import com.tencent.p014mm.plugin.label.p067ui.ContactLabelManagerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C47883u;

/* renamed from: e22.s */
public class C75532s implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Runnable f221919a;

    public C75532s(ContactLabelManagerUI contactLabelManagerUI, Runnable runnable) {
        this.f221919a = runnable;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        Log.m105924i("MicroMsg.Label.ContactLabelManagerUI", "showTextToast, has shown tip");
        Runnable runnable = this.f221919a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
