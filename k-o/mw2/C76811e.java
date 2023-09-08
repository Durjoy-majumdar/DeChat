package mw2;

import android.view.View;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kw2.C99266g;
import rx3.C13598b0;

/* renamed from: mw2.e */
public final class C76811e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C100014d f224623d;

    public C76811e(C100014d dVar) {
        this.f224623d = dVar;
    }

    public final void onClick(View view) {
        C32226l<? super C99266g, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() == null || !(view.getTag() instanceof C99266g) || (lVar = this.f224623d.f293029e) == null)) {
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryHistoryInfo");
            lVar.invoke((C99266g) tag);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/album/StoryAlbumItemAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
