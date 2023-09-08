package mo1;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: mo1.m0 */
public final class C11017m0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32741d;

    public C11017m0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32741d = finderProfileHeaderUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("key_scene", 2);
        ((C58684b) C86312j.m106911c(C58684b.class)).iy0(this.f32741d.getContext(), intent);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleUserDesc$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
