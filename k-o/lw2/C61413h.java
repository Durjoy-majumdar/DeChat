package lw2;

import android.view.View;
import ew2.C97757a;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: lw2.h */
public final class C61413h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99693f f174658d;

    /* renamed from: e */
    public final /* synthetic */ C97757a f174659e;

    public C61413h(C99693f fVar, C97757a aVar) {
        this.f174658d = fVar;
        this.f174659e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder$onBindOpTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C32227p<? super C97757a, ? super Boolean, C13598b0> pVar = this.f174658d.f292192f;
        if (pVar != null) {
            pVar.invoke(this.f174659e, Boolean.FALSE);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/adapter/StoryCommentAdapter$StoryCommentViewHolder$onBindOpTv$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
