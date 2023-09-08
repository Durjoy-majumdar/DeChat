package ro3;

import android.text.TextUtils;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ro3.C110588j;

/* renamed from: ro3.d */
public class C110581d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C110582e f330784d;

    public C110581d(C110582e eVar) {
        this.f330784d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/edittext/MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null || (view.getTag() instanceof C110588j.C110589b)) {
            this.f330784d.f330787f.mo14786b(view, (C110588j.C110589b) view.getTag(), !TextUtils.isEmpty(this.f330784d.f330786e.f330857c) ? this.f330784d.f330786e.f330857c : "");
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/edittext/MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
