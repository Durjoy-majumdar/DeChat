package ny2;

import android.view.View;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

public final /* synthetic */ class r$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SettingsTeenModeMain f33272d;

    /* renamed from: e */
    public final /* synthetic */ String f33273e;

    /* renamed from: f */
    public final /* synthetic */ byte[] f33274f;

    public /* synthetic */ r$$c(SettingsTeenModeMain settingsTeenModeMain, String str, byte[] bArr) {
        this.f33272d = settingsTeenModeMain;
        this.f33273e = str;
        this.f33274f = bArr;
    }

    public final void run() {
        SettingsTeenModeMain settingsTeenModeMain = this.f33272d;
        String str = this.f33273e;
        byte[] bArr = this.f33274f;
        View view = settingsTeenModeMain.f21477j;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "lambda$updateWCPayLimit$1", "(Ljava/lang/String;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "lambda$updateWCPayLimit$1", "(Ljava/lang/String;[B)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        settingsTeenModeMain.f21476i.setText(str);
        settingsTeenModeMain.f21476i.setVisibility(0);
        settingsTeenModeMain.f21478n = bArr;
    }
}
