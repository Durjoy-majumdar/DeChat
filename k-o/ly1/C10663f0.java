package ly1;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ly1.f0 */
public class C10663f0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104428a f32081d;

    public C10663f0(C99730g0 g0Var, C104428a aVar) {
        this.f32081d = aVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/media/GameTabGalleryView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f32081d.cancel();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameTabGalleryView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
