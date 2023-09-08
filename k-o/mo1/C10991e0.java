package mo1;

import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.widget.RoundCornerRelativeLayout;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p823sg.C101614i;
import up1.C37521f;

/* renamed from: mo1.e0 */
public final class C10991e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderProfileHeaderUIC f32700d;

    /* renamed from: mo1.e0$a */
    public static final class C10992a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileHeaderUIC f32701d;

        public C10992a(FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f32701d = finderProfileHeaderUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleEditBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10943a aVar = (C10943a) C39818r.f106831a.mo62443b(this.f32701d.getContext()).mo62449e(C10943a.class);
            if (aVar != null) {
                aVar.mo11148f3();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileHeaderUIC$handleEditBtn$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: mo1.e0$b */
    public static final class C10993b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f32702d;

        /* renamed from: e */
        public final /* synthetic */ FinderProfileHeaderUIC f32703e;

        public C10993b(LinearLayout linearLayout, FinderProfileHeaderUIC finderProfileHeaderUIC) {
            this.f32702d = linearLayout;
            this.f32703e = finderProfileHeaderUIC;
        }

        public final void run() {
            int top = this.f32702d.getTop();
            ViewParent parent = this.f32702d.getParent();
            View view = parent instanceof View ? (View) parent : null;
            int top2 = top + (view != null ? view.getTop() : 0);
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32703e;
            C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
            RoundCornerRelativeLayout roundCornerRelativeLayout = finderProfileHeaderUIC.mo3808J3().f42946x;
            C87412m.m108593f(roundCornerRelativeLayout, "profileHeaderUiBinding.finderProfileEditLl");
            int measuredHeight = top2 - ((roundCornerRelativeLayout.getMeasuredHeight() - this.f32702d.getMeasuredHeight()) / 2);
            roundCornerRelativeLayout.layout(roundCornerRelativeLayout.getLeft(), measuredHeight, roundCornerRelativeLayout.getRight(), roundCornerRelativeLayout.getMeasuredHeight() + measuredHeight);
        }
    }

    public C10991e0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32700d = finderProfileHeaderUIC;
    }

    public final void run() {
        this.f32700d.mo3805F3().setVisibility(8);
        if (!this.f32700d.isSelf() || !this.f32700d.isSelfFlag()) {
            C37521f.f99374d.getClass();
            if (C37521f.f99335Y2.mo60266n().intValue() != 1) {
                if (this.f32700d.getFragmentMode()) {
                    this.f32700d.mo3805F3().setVisibility(0);
                    this.f32700d.mo3805F3().setOnClickListener(new C10992a(this.f32700d));
                }
                LinearLayout linearLayout = this.f32700d.mo3808J3().f42894O;
                C87412m.m108593f(linearLayout, "profileHeaderUiBinding.finderProfileNameContainer");
                linearLayout.post(new C10993b(linearLayout, this.f32700d));
            }
        }
        this.f32700d.mo3805F3().setVisibility(8);
        LinearLayout linearLayout2 = this.f32700d.mo3808J3().f42894O;
        C87412m.m108593f(linearLayout2, "profileHeaderUiBinding.finderProfileNameContainer");
        linearLayout2.post(new C10993b(linearLayout2, this.f32700d));
    }
}
