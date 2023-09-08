package e22;

import com.tencent.p014mm.plugin.label.p067ui.ContactLabelSelectUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C47883u;

/* renamed from: e22.y */
public class C75537y implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Runnable f221929a;

    public C75537y(ContactLabelSelectUI contactLabelSelectUI, Runnable runnable) {
        this.f221929a = runnable;
    }

    /* renamed from: a */
    public void mo353a(boolean z, String str) {
        Log.m105924i("MicroMsg.Label.ContactLabelSelectUI", "showTextToast, has shown tip");
        Runnable runnable = this.f221929a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
