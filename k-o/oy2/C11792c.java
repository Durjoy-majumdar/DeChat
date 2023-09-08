package oy2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.p056ui.FinderSettingsUI;
import com.tencent.p014mm.plugin.test.ExMainSettings;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: oy2.c */
public final class C11792c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExMainSettings f34505d;

    public C11792c(ExMainSettings exMainSettings) {
        this.f34505d = exMainSettings;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/test/ExMainSettings$initList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = FinderSettingsUI.f161137r;
        Intent intent = new Intent(this.f34505d, FinderSettingsUI.class);
        ExMainSettings exMainSettings = this.f34505d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        ExMainSettings exMainSettings2 = exMainSettings;
        C117292a.m165358d(exMainSettings2, aVar.mo10232b(), "com/tencent/mm/plugin/test/ExMainSettings$initList$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exMainSettings.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(exMainSettings2, "com/tencent/mm/plugin/test/ExMainSettings$initList$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/test/ExMainSettings$initList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
