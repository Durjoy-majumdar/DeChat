package ve1;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import di3.C86312j;
import er1.C7878t0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import p629ny.C76979h;
import rx3.C13598b0;
import vq1.C14951b0;
import vq1.C14958f0;

/* renamed from: ve1.s8 */
public final class C14629s8 extends C60896i<C2815r0> {

    /* renamed from: e */
    public final C32226l<C2815r0, C13598b0> f40475e;

    /* renamed from: ve1.s8$a */
    public /* synthetic */ class C14630a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40476a;

        static {
            int[] iArr = new int[FinderWordingLayout.C3984a.values().length];
            iArr[2] = 1;
            f40476a = iArr;
        }
    }

    public C14629s8(C32226l<? super C2815r0, C13598b0> lVar) {
        C87412m.m108594g(lVar, "removeItemListener");
        this.f40475e = lVar;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cks;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        long j;
        C2815r0 r0Var = (C2815r0) cVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(r0Var, "item");
        C14951b0 b0Var = C14951b0.f40992g;
        FinderWordingLayout.C3984a aVar = b0Var.f40996d.get(Long.valueOf(r0Var.f14070h));
        if (aVar == null) {
            aVar = FinderWordingLayout.C3984a.NORMAL;
        }
        boolean a = b0Var.mo13999a(r0Var);
        long j2 = r0Var.f131802d;
        if (j2 == 0) {
            j = r0Var.f131804f;
        } else {
            boolean z2 = r0Var.f131805g == 1;
            C14958f0 f0Var = b0Var.f40995c.get(new C14951b0.C14952a(r0Var.f14070h, j2));
            boolean z3 = f0Var != null ? f0Var.f41010d : z2;
            j = (!z2 || z2 == z3) ? (z2 || z2 == z3) ? r0Var.f131804f : 1 + r0Var.f131804f : r0Var.f131804f - 1;
        }
        boolean z4 = r0Var.f14071i;
        View D = oVar.mo85812D(C0966R.C0970id.m1k);
        if (D != null) {
            if (!a || z4) {
                D.setBackgroundResource(C0966R.C0969drawable.b4z);
            } else {
                D.setBackgroundResource(C0966R.C0969drawable.f357165b50);
            }
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.m1h);
        if (textView != null) {
            textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(oVar.f173499A, r0Var.f131803e));
            if (!a || z4) {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            } else {
                textView.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.m1i);
        if (textView2 != null) {
            textView2.setText(C7878t0.m8034c(2, (int) j));
            if (!a || z4) {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.BW_100_Alpha_0_6));
            } else {
                textView2.setTextColor(oVar.f173499A.getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_5));
            }
            textView2.setVisibility(8);
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.m1j);
        if (weImageView != null) {
            if (C14630a.f40476a[aVar.ordinal()] == 1) {
                weImageView.setVisibility(0);
            } else {
                weImageView.setVisibility(8);
            }
            weImageView.setOnClickListener(new C14652u8(this, r0Var));
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        oVar.f44854d.setEnabled(true);
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.m1h);
        if (textView != null) {
            textView.setTextSize(1, 14.0f);
        }
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.m1i);
        if (textView2 != null) {
            textView2.setTextSize(1, 12.0f);
        }
        WeImageView weImageView = (WeImageView) oVar.mo85812D(C0966R.C0970id.m1j);
        if (weImageView != null) {
            int dimension = (int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3703bv);
            ViewParent parent = weImageView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                view.post(new C14642t8(weImageView, dimension, view));
            }
        }
    }
}
