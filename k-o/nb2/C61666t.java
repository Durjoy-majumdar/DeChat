package nb2;

import android.view.View;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cm1.C55033u;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import sb2.C63807m;

/* renamed from: nb2.t */
public final class C61666t implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175345d;

    /* renamed from: e */
    public final /* synthetic */ C61646d f175346e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f175347f;

    /* renamed from: nb2.t$a */
    public static final class C61667a implements CommentDrawerContract.CloseDrawerCallback {

        /* renamed from: a */
        public final /* synthetic */ C61646d f175348a;

        /* renamed from: b */
        public final /* synthetic */ C61647e f175349b;

        /* renamed from: c */
        public final /* synthetic */ C60905o f175350c;

        public C61667a(C61646d dVar, C61647e eVar, C60905o oVar) {
            this.f175348a = dVar;
            this.f175349b = eVar;
            this.f175350c = oVar;
        }

        /* renamed from: a */
        public void mo2377a(int i, List<? extends C55033u> list, boolean z) {
            C87412m.m108594g(list, "data");
            C61646d dVar = this.f175348a;
            dVar.f175298d.f170765m = i;
            this.f175349b.mo86591n(this.f175350c, dVar);
        }
    }

    public C61666t(C61647e eVar, C61646d dVar, C60905o oVar) {
        this.f175345d = eVar;
        this.f175346e = dVar;
        this.f175347f = oVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C39622i0 a = C39818r.f106831a.mo62444c(this.f175345d.f175299e).mo75002a(C63807m.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvInfoUIC::class.java)");
        C61646d dVar = this.f175346e;
        ((C63807m) a).mo88603f3(dVar.f175298d, 0, new C61667a(dVar, this.f175345d, this.f175347f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
