package oy2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsSettingUI;
import com.tencent.p014mm.plugin.test.ExMainSettings;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: oy2.a */
public final class C11790a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExMainSettings f34503d;

    public C11790a(ExMainSettings exMainSettings) {
        this.f34503d = exMainSettings;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/test/ExMainSettings$initList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = SnsSettingUI.f82073g;
        Intent intent = new Intent(this.f34503d, SnsSettingUI.class);
        ExMainSettings exMainSettings = this.f34503d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        ExMainSettings exMainSettings2 = exMainSettings;
        C117292a.m165358d(exMainSettings2, aVar.mo10232b(), "com/tencent/mm/plugin/test/ExMainSettings$initList$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exMainSettings.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(exMainSettings2, "com/tencent/mm/plugin/test/ExMainSettings$initList$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/test/ExMainSettings$initList$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
