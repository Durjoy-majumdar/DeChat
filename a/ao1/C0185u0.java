package ao1;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ao1.u0 */
public final class C0185u0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMActivity f649d;

    public C0185u0(MMActivity mMActivity) {
        this.f649d = mMActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostMainUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f649d.hideVKB();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
