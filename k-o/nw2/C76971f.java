package nw2;

import android.view.View;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentsContainer;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: nw2.f */
public final class C76971f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CommentsContainer f224909d;

    public C76971f(CommentsContainer commentsContainer) {
        this.f224909d = commentsContainer;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/CommentsContainer$getItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32224a<C13598b0> itemClickListener = this.f224909d.getItemClickListener();
        if (itemClickListener != null) {
            itemClickListener.invoke();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/CommentsContainer$getItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
