package pj2;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60153b5;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: pj2.p */
public final class C62334p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C62338s f177173d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f177174e;

    /* renamed from: f */
    public final /* synthetic */ C62324e f177175f;

    /* renamed from: pj2.p$a */
    public static final class C62335a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62338s f177176d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f177177e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62335a(C62338s sVar, C60905o oVar) {
            super(0);
            this.f177176d = sVar;
            this.f177177e = oVar;
        }

        public Object invoke() {
            C60153b5 b5Var = this.f177176d.f177188j;
            View D = this.f177177e.mo85812D(C0966R.C0970id.o3g);
            C87412m.m108593f(D, "holder.getView(R.id.ringtone_video_container)");
            b5Var.mo84619d((FrameLayout) D, false);
            return C13598b0.f38549a;
        }
    }

    public C62334p(C62338s sVar, C60905o oVar, C62324e eVar) {
        this.f177173d = sVar;
        this.f177174e = oVar;
        this.f177175f = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C61926c.m72657B("MicroMsg.RingtoneConverter", true, new C62335a(this.f177173d, this.f177174e));
        this.f177173d.f177185g.invoke(Integer.valueOf(this.f177174e.mo17363j()), this.f177175f);
        C117292a.m165361g(this, "com/tencent/mm/plugin/ringtone/data/RingtoneVideoConverter$bindFinderRingBack$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
