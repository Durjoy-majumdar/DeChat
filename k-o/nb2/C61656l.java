package nb2;

import android.view.View;
import bl3.C39818r;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import lq1.C61355g;
import sb2.C63756e;
import sb2.C63807m;
import sq1.C64151e;

/* renamed from: nb2.l */
public final class C61656l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C61647e f175318d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f175319e;

    /* renamed from: f */
    public final /* synthetic */ C63756e f175320f;

    /* renamed from: nb2.l$a */
    public static final class C61657a implements C61355g {

        /* renamed from: a */
        public final /* synthetic */ C61647e f175321a;

        /* renamed from: b */
        public final /* synthetic */ C60905o f175322b;

        /* renamed from: c */
        public final /* synthetic */ C63756e f175323c;

        public C61657a(C61647e eVar, C60905o oVar, C63756e eVar2) {
            this.f175321a = eVar;
            this.f175322b = oVar;
            this.f175323c = eVar2;
        }

        /* renamed from: a */
        public void mo86310a(int i, List<? extends C64151e> list) {
            C87412m.m108594g(list, "data");
            this.f175321a.mo86594q(this.f175322b, this.f175323c, Integer.valueOf(i));
        }
    }

    public C61656l(C61647e eVar, C60905o oVar, C63756e eVar2) {
        this.f175318d = eVar;
        this.f175319e = oVar;
        this.f175320f = eVar2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C63807m) C39818r.f106831a.mo62444c(this.f175318d.f175299e).mo75002a(C63807m.class)).mo88604g3(0, new C61657a(this.f175318d, this.f175319e, this.f175320f));
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
