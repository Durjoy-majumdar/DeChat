package ny2;

import android.view.View;
import com.tencent.p014mm.plugin.teenmode.p111ui.SettingsTeenModeMain;
import di3.C86312j;
import ie3.C76324c;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class r$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsTeenModeMain f33270d;

    public /* synthetic */ r$$a(SettingsTeenModeMain settingsTeenModeMain) {
        this.f33270d = settingsTeenModeMain;
    }

    public final void onClick(View view) {
        SettingsTeenModeMain settingsTeenModeMain = this.f33270d;
        int i = SettingsTeenModeMain.f21470x;
        settingsTeenModeMain.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", settingsTeenModeMain, array);
        ((C76324c) C86312j.m106911c(C76324c.class)).startTeenagerPay(settingsTeenModeMain, settingsTeenModeMain.f21478n);
        C117292a.m165361g(settingsTeenModeMain, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
