package ly1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ly1.i0 */
public class C99744i0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99757m0 f292336d;

    public C99744i0(C99757m0 m0Var) {
        this.f292336d = m0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/media/GameVideoDownloadPerform$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C99757m0 m0Var = this.f292336d;
        String str = C99757m0.f292364f;
        m0Var.mo139119a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameVideoDownloadPerform$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
