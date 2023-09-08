package x73;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: x73.b */
public final class C78780b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102570e f230513d;

    public C78780b(C102570e eVar) {
        this.f230513d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f230513d.onBackPressed();
        C117292a.m165361g(this, "com/tencent/mm/plugin/websearch/emojisearch/ui/EmojiSearchDialog$initContentView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
