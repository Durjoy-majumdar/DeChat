package qk1;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeCouponMiniInfoView;
import er1.C58739j4;
import er1.C7802g1;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import java.util.LinkedList;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C51559uk1;

/* renamed from: qk1.g2 */
public final class C12802g2 extends RecyclerView.C16613e<C12803a> {

    /* renamed from: d */
    public final C32226l<C49098d51, C13598b0> f36640d;

    /* renamed from: e */
    public final C32226l<String, Boolean> f36641e;

    /* renamed from: f */
    public LinkedList<C49098d51> f36642f;

    /* renamed from: qk1.g2$a */
    public final class C12803a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final TextView f36643A;

        /* renamed from: B */
        public final NoticeCouponMiniInfoView f36644B;

        /* renamed from: C */
        public final TextView f36645C;

        /* renamed from: D */
        public final View f36646D;

        /* renamed from: E */
        public final TextView f36647E;

        /* renamed from: F */
        public final View f36648F;

        /* renamed from: z */
        public final TextView f36649z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12803a(C12802g2 g2Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f36649z = (TextView) view.findViewById(C0966R.C0970id.f358195m10);
            this.f36643A = (TextView) view.findViewById(C0966R.C0970id.m0x);
            this.f36644B = (NoticeCouponMiniInfoView) view.findViewById(C0966R.C0970id.n2a);
            this.f36645C = (TextView) view.findViewById(C0966R.C0970id.m0z);
            this.f36646D = view.findViewById(C0966R.C0970id.m0v);
            this.f36647E = (TextView) view.findViewById(C0966R.C0970id.m0w);
            this.f36648F = view.findViewById(C0966R.C0970id.m0y);
        }
    }

    public C12802g2(C32226l<? super C49098d51, C13598b0> lVar, C32226l<? super String, Boolean> lVar2) {
        this.f36640d = lVar;
        this.f36641e = lVar2;
    }

    public int getItemCount() {
        LinkedList<C49098d51> linkedList = this.f36642f;
        if (linkedList != null) {
            return linkedList.size();
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C13598b0 b0Var;
        C13598b0 b0Var2;
        C12803a aVar = (C12803a) zVar;
        C87412m.m108594g(aVar, "holder");
        Context context = aVar.f44854d.getContext();
        LinkedList<C49098d51> linkedList = this.f36642f;
        C49098d51 d512 = linkedList != null ? linkedList.get(i) : null;
        if (d512 != null) {
            aVar.f36649z.setText(context.getString(C0966R.string.m6p, new Object[]{C58739j4.m68254u(C58739j4.f168176a, ((long) d512.f132118d) * 1000, (Boolean) null, false, 2, (Object) null)}));
            C85875k4.m106189j0(aVar.f36649z.getPaint(), 0.8f);
            C51559uk1 a = C7802g1.m7949a(d512);
            if (a != null) {
                NoticeCouponMiniInfoView noticeCouponMiniInfoView = aVar.f36644B;
                C87412m.m108593f(noticeCouponMiniInfoView, "holder.couponMiniInfoView");
                NoticeCouponMiniInfoView.m4339a(noticeCouponMiniInfoView, false, a, false, true, false, (C32224a) null, 52, (Object) null);
                aVar.f36643A.setVisibility(8);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                aVar.f36644B.setVisibility(8);
                String str = d512.f132121g;
                if (!(!(str == null || str.length() == 0))) {
                    str = null;
                }
                if (str != null) {
                    aVar.f36643A.setVisibility(0);
                    aVar.f36643A.setText(d512.f132121g);
                    b0Var2 = C13598b0.f38549a;
                } else {
                    b0Var2 = null;
                }
                if (b0Var2 == null) {
                    aVar.f36643A.setVisibility(8);
                }
            }
            aVar.f36645C.setText(context.getString(C0966R.string.m6l, new Object[]{C62042e.f176370a.mo87005G((long) d512.f132123i)}));
            C32226l<String, Boolean> lVar = this.f36641e;
            if (lVar != null) {
                if (lVar.invoke(d512.f132122h).booleanValue()) {
                    aVar.f36647E.setText(context.getString(C0966R.string.m6j));
                    aVar.f36647E.setTextColor(context.getResources().getColor(C0966R.color.BW_100_Alpha_0_3));
                    aVar.f36646D.setOnClickListener((View.OnClickListener) null);
                } else {
                    aVar.f36647E.setText(context.getString(C0966R.string.m6h));
                    aVar.f36647E.setTextColor(Color.parseColor("#7D90A9"));
                    aVar.f36646D.setOnClickListener(new C12812i2(this, d512));
                }
            }
            aVar.f44854d.setOnClickListener(new C12813j2(d512, context));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.cnl, viewGroup, false);
        C87412m.m108593f(inflate, "view");
        return new C12803a(this, inflate);
    }
}
