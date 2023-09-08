package il1;

import a14.C53973z1;
import android.view.View;
import fy3.C32226l;
import il1.C60413h1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import sx3.C110818d0;
import w50.C65929d;

/* renamed from: il1.i1 */
public final class C60435i1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C60413h1 f172319d;

    /* renamed from: e */
    public final /* synthetic */ int f172320e;

    /* renamed from: f */
    public final /* synthetic */ C60413h1.C60421h f172321f;

    /* renamed from: g */
    public final /* synthetic */ C60413h1.C60420g f172322g;

    /* renamed from: il1.i1$a */
    public static final class C60436a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C60413h1 f172323d;

        public C60436a(C60413h1 h1Var) {
            this.f172323d = h1Var;
        }

        public final void run() {
            this.f172323d.f172245c.setVisibility(0);
            C53973z1 z1Var = this.f172323d.f172258p;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C60413h1.m70665b(this.f172323d);
        }
    }

    public C60435i1(C60413h1 h1Var, int i, C60413h1.C60421h hVar, C60413h1.C60420g gVar) {
        this.f172319d = h1Var;
        this.f172320e = i;
        this.f172321f = hVar;
        this.f172322g = gVar;
    }

    public final void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C65929d.C65930a aVar = (C65929d.C65930a) C110818d0.m150917O(this.f172319d.f172251i, this.f172320e);
        if (aVar != null) {
            C60413h1 h1Var = this.f172319d;
            C60413h1.C60421h hVar = this.f172321f;
            C60413h1.C60420g gVar = this.f172322g;
            int i2 = this.f172320e;
            C60413h1.C60421h hVar2 = h1Var.f172253k;
            View view2 = hVar2 != null ? hVar2.f172270B : null;
            if (view2 == null) {
                i = 0;
            } else {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(4);
                View view3 = view2;
                i = 0;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            h1Var.f172253k = hVar;
            View view4 = hVar != null ? hVar.f172270B : null;
            if (view4 != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(Integer.valueOf(i));
                View view5 = view4;
                C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar3.mo10231a(i)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter$onBindViewHolder$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            C32226l<? super C65929d.C65930a, C13598b0> lVar = h1Var.f172254l;
            if (lVar != null) {
                ((C60413h1.C60415d) lVar).invoke(aVar);
            }
            gVar.notifyDataSetChanged();
            if (i2 == 0) {
                C53973z1 z1Var = h1Var.f172258p;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                h1Var.f172245c.setVisibility(4);
            } else {
                h1Var.f172243a.post(new C60436a(h1Var));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCameraOptFilterWidget$CameraOptFilterAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
