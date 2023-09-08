package oy2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.live.p016ui.LiveUIG;
import com.tencent.p014mm.plugin.test.ExMainSettings;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: oy2.b */
public final class C11791b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExMainSettings f34504d;

    public C11791b(ExMainSettings exMainSettings) {
        this.f34504d = exMainSettings;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/test/ExMainSettings$initList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = LiveUIG.f108407g;
        Intent intent = new Intent(this.f34504d, LiveUIG.class);
        ExMainSettings exMainSettings = this.f34504d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        ExMainSettings exMainSettings2 = exMainSettings;
        C117292a.m165358d(exMainSettings2, aVar.mo10232b(), "com/tencent/mm/plugin/test/ExMainSettings$initList$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exMainSettings.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(exMainSettings2, "com/tencent/mm/plugin/test/ExMainSettings$initList$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/test/ExMainSettings$initList$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
