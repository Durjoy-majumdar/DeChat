package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.FileReaderHelper;
import j20.C117292a;
import java.util.ArrayList;
import mv0.C99980a;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.b */
public class C92942b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92943c f267696d;

    public C92942b(C92943c cVar) {
        this.f267696d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f267696d.f267697h = C99980a.m130643h().mo139322k().f292969q;
        int i = this.f267696d.f267697h;
        if (2 == i || 3 == i || 5 == i || 6 == i) {
            Log.m105919d("MicroMsg.BakChatBanner", "OnClickListener goToBakOperatingUI PCBannerStatus:%d, percent:%d", Integer.valueOf(C99980a.m130643h().mo139322k().f292969q), Integer.valueOf(this.f267696d.f267698i));
            C92943c cVar = this.f267696d;
            cVar.getClass();
            Intent intent = new Intent(cVar.f230570g.get(), BakOperatingUI.class);
            intent.putExtra("from_bak_banner", true);
            MMWizardActivity.m7017L7(cVar.f230570g.get(), intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else if (4 == i) {
            Log.m105919d("MicroMsg.BakChatBanner", "OnClickListener goToBakFinishUI PCBannerStatus:%d, percent:%d", Integer.valueOf(C99980a.m130643h().mo139322k().f292969q), Integer.valueOf(this.f267696d.f267698i));
            C92943c cVar2 = this.f267696d;
            cVar2.getClass();
            Intent intent2 = new Intent(cVar2.f230570g.get(), BakFinishUI.class);
            intent2.putExtra(FileReaderHelper.OPEN_FILE_FROM_CMD, 1);
            MMWizardActivity.m7017L7(cVar2.f230570g.get(), intent2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            C117292a.m165361g(this, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakChatBanner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
