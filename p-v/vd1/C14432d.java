package vd1;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.service.C3604o1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8794p5;
import j20.C117292a;
import java.util.ArrayList;
import jp3.C9487b;
import nj3.C76879j;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C51954xc1;

/* renamed from: vd1.d */
public final class C14432d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f40041d;

    /* renamed from: e */
    public final /* synthetic */ FinderItem f40042e;

    /* renamed from: f */
    public final /* synthetic */ boolean f40043f;

    /* renamed from: g */
    public final /* synthetic */ C8794p5<C51954xc1> f40044g;

    /* renamed from: h */
    public final /* synthetic */ C77407n f40045h;

    public C14432d(Context context, FinderItem finderItem, boolean z, C8794p5<C51954xc1> p5Var, C77407n nVar) {
        this.f40041d = context;
        this.f40042e = finderItem;
        this.f40043f = z;
        this.f40044g = p5Var;
        this.f40045h = nVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/music/utils/FinderMusicTopicUtils$setFeedMusicTopicLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f40041d;
        long id = this.f40042e.getId();
        String objectNonceId = this.f40042e.getObjectNonceId();
        boolean z = !this.f40043f;
        C8794p5<C51954xc1> p5Var = this.f40044g;
        C9487b bVar = context instanceof C9487b ? (C9487b) context : null;
        if (bVar != null) {
            String string = context.getResources().getString(z ? C0966R.string.n1a : C0966R.string.n1e);
            C87412m.m108593f(string, "context.resources.getStr…          }\n            )");
            C89779i0 Q = C76879j.m92723Q(context, "", string, true, false, (DialogInterface.OnCancelListener) null);
            if (Q != null) {
                Q.show();
            }
            ((C3604o1) C86312j.m106911c(C3604o1.class)).mo3973KD(bVar, id, objectNonceId, z, new C14431c(Q, p5Var, context, z));
        }
        this.f40045h.mo107572p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/music/utils/FinderMusicTopicUtils$setFeedMusicTopicLink$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
