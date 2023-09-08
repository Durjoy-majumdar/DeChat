package ly1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ly1.v */
public class C10668v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99776u f32085d;

    public C10668v(C99776u uVar) {
        this.f32085d = uVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/media/GamePublishGalleryView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32085d.mo139135d();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GamePublishGalleryView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
