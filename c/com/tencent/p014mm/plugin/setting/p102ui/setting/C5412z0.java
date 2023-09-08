package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.view.View;
import de3.C75359b0;
import j20.C117292a;
import java.util.ArrayList;
import kj2.C117407d;
import qo3.C77407n;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.z0 */
public class C5412z0 extends C75359b0 {

    /* renamed from: d */
    public final /* synthetic */ SettingsAboutMicroMsgUI f21098d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5412z0(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI, int i, C53155r0 r0Var) {
        super(i, r0Var);
        this.f21098d = settingsAboutMicroMsgUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$10", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f21098d;
        int i = SettingsAboutMicroMsgUI.f248965w;
        C77407n nVar = new C77407n((Context) settingsAboutMicroMsgUI.getContext(), false, 1);
        nVar.f225771i = new C5336a1(settingsAboutMicroMsgUI);
        nVar.f225782p = new C5339b1(settingsAboutMicroMsgUI);
        nVar.mo107573q();
        C117407d.INSTANCE.idkeyStat(250, 30, 1, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI$10", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
