package ly1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import ly1.C99765p;
import vw1.C102299l;
import yt0.C53568b;

/* renamed from: ly1.o */
public class C99764o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C99765p.C99767c f292384d;

    /* renamed from: e */
    public final /* synthetic */ int f292385e;

    /* renamed from: f */
    public final /* synthetic */ C102299l f292386f;

    /* renamed from: g */
    public final /* synthetic */ C99765p.C99766a f292387g;

    public C99764o(C99765p.C99766a aVar, C99765p.C99767c cVar, int i, C102299l lVar) {
        this.f292387g = aVar;
        this.f292384d = cVar;
        this.f292385e = i;
        this.f292386f = lVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/media/GameHaowanRecycleView$GameHaowanAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53568b bVar = this.f292387g.f292401j;
        C99765p.C99767c cVar = this.f292384d;
        bVar.mo63442a(cVar.f44854d, this.f292385e, cVar.f44858h);
        C99765p.C99766a aVar = this.f292387g;
        int F4 = aVar.mo139128F4(this.f292385e);
        C102299l lVar = this.f292386f;
        aVar.mo139129G4(F4, 2, lVar.f301307s, lVar.f301312x);
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView$GameHaowanAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
