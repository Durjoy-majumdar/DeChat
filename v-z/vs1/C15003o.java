package vs1;

import ak1.C54067f0;
import ak1.C54116w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.UnchangeTextView;
import di3.C7335d;
import di3.C86312j;
import er1.C7919x;
import fj1.C45795b;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C51215sa1;
import te3.C52172yv;
import z04.C112551y;

/* renamed from: vs1.o */
public final class C15003o extends RecyclerView.C16613e<C15004a> {

    /* renamed from: d */
    public final ViewGroup f41120d;

    /* renamed from: e */
    public final C45795b f41121e;

    /* renamed from: f */
    public final ArrayList<C52172yv> f41122f = new ArrayList<>();

    /* renamed from: g */
    public C32227p<? super List<Integer>, ? super Integer, C13598b0> f41123g;

    /* renamed from: h */
    public long f41124h;

    /* renamed from: i */
    public boolean f41125i = true;

    /* renamed from: j */
    public boolean f41126j;

    /* renamed from: n */
    public boolean f41127n;

    /* renamed from: vs1.o$a */
    public final class C15004a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final WeImageView f41128A;

        /* renamed from: B */
        public final UnchangeTextView f41129B;

        /* renamed from: C */
        public final WeImageView f41130C;

        /* renamed from: z */
        public final UnchangeTextView f41131z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15004a(C15003o oVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(C0966R.C0970id.nh9);
            UnchangeTextView unchangeTextView = (UnchangeTextView) view.findViewById(C0966R.C0970id.l4s);
            this.f41131z = unchangeTextView;
            this.f41128A = (WeImageView) view.findViewById(C0966R.C0970id.l4t);
            UnchangeTextView unchangeTextView2 = (UnchangeTextView) view.findViewById(C0966R.C0970id.f357697k12);
            this.f41129B = unchangeTextView2;
            this.f41130C = (WeImageView) view.findViewById(C0966R.C0970id.l4p);
            C87412m.m108593f(unchangeTextView, "choiceNameTv");
            C7919x.m8091a(unchangeTextView);
            C87412m.m108593f(unchangeTextView2, "choiceCountTv");
            C7919x.m8091a(unchangeTextView2);
        }
    }

    public C15003o(ViewGroup viewGroup, C45795b bVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "liveData");
        this.f41120d = viewGroup;
        this.f41121e = bVar;
    }

    /* renamed from: F4 */
    public final void mo14053F4(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 3);
        C51215sa1 sa12 = ((C54991o) this.f41121e.mo71262a(C54991o.class)).f154275W3;
        jSONObject.put("vote_id", sa12 != null ? sa12.f141393i : null);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_VOTE, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C52172yv yvVar = this.f41122f.get(i);
        C87412m.m108593f(yvVar, "dataList[position]");
        C52172yv yvVar2 = yvVar;
        yvVar2.f145529f = 1;
        yvVar2.f145530g++;
        this.f41124h++;
    }

    /* renamed from: G4 */
    public final void mo14054G4(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", 4);
        C51215sa1 sa12 = ((C54991o) this.f41121e.mo71262a(C54991o.class)).f154275W3;
        jSONObject.put("vote_id", sa12 != null ? sa12.f141393i : null);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "json.toString()");
        String n = C112551y.m153814n(jSONObject2, ",", ";", false);
        C7335d c = C86312j.m106911c(C54116w.class);
        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
        C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_VOTE, n, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        C52172yv yvVar = this.f41122f.get(i);
        C87412m.m108593f(yvVar, "dataList[position]");
        C52172yv yvVar2 = yvVar;
        yvVar2.f145529f = 0;
        int i2 = yvVar2.f145530g;
        if (i2 > 0) {
            yvVar2.f145530g = i2 - 1;
        }
        this.f41124h--;
    }

    /* renamed from: O4 */
    public final void mo14055O4(LinkedList<C52172yv> linkedList, long j, boolean z, boolean z2, boolean z3) {
        boolean z4;
        C87412m.m108594g(linkedList, "respList");
        this.f41127n = z2;
        this.f41125i = z;
        boolean z5 = this.f41124h != j;
        this.f41124h = j;
        if (this.f41122f.size() != linkedList.size() || z3) {
            this.f41122f.clear();
            this.f41122f.addAll(linkedList);
            notifyItemRangeChanged(0, linkedList.size(), Boolean.TRUE);
            return;
        }
        int i = 0;
        for (T next : this.f41122f) {
            int i2 = i + 1;
            if (i >= 0) {
                C52172yv yvVar = (C52172yv) next;
                if (this.f41122f.get(i).f145527d != linkedList.get(i).f145527d) {
                    this.f41122f.clear();
                    this.f41122f.addAll(linkedList);
                    notifyItemRangeChanged(0, linkedList.size(), Boolean.TRUE);
                } else {
                    if (this.f41122f.get(i).f145530g != linkedList.get(i).f145530g || z5) {
                        this.f41122f.get(i).f145530g = linkedList.get(i).f145530g;
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (this.f41122f.get(i).f145529f != linkedList.get(i).f145529f) {
                        this.f41122f.get(i).f145529f = linkedList.get(i).f145529f;
                        z4 = true;
                    }
                    if (z4) {
                        notifyItemChanged(i, Boolean.TRUE);
                    }
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public int getItemCount() {
        return this.f41122f.size();
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C87412m.m108594g((C15004a) zVar, "holder");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        boolean z = false;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.czy, viewGroup, false);
        if (this.f41120d.getContext().getResources().getConfiguration().orientation == 2) {
            z = true;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f41120d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3766df);
        } else {
            ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = this.f41120d.getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        }
        C87412m.m108593f(inflate, "itemView");
        return new C15004a(this, inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r12, int r13, java.util.List r14) {
        /*
            r11 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            vs1.o$a r12 = (vs1.C15003o.C15004a) r12
            java.lang.String r1 = "holder"
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = "payloads"
            gy3.C87412m.m108594g(r14, r1)
            java.util.ArrayList<te3.yv> r1 = r11.f41122f
            java.lang.Object r1 = r1.get(r13)
            java.lang.String r2 = "dataList[position]"
            gy3.C87412m.m108593f(r1, r2)
            te3.yv r1 = (te3.C52172yv) r1
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r12.f41129B
            android.view.View r3 = r12.f44854d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r6 = r1.f145530g
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            r6 = 2131829015(0x7f112117, float:1.9290987E38)
            java.lang.String r3 = r3.getString(r6, r5)
            r2.setText(r3)
            boolean r2 = r11.f41127n
            r3 = 8
            if (r2 != 0) goto L_0x0069
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r2 = r2.mo87027N0()
            if (r2 != 0) goto L_0x005a
            fj1.b r2 = r11.f41121e
            androidx.lifecycle.i0 r2 = r2.mo71262a(r0)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154190D
            if (r2 == 0) goto L_0x0058
            goto L_0x005a
        L_0x0058:
            r2 = 0
            goto L_0x005b
        L_0x005a:
            r2 = 1
        L_0x005b:
            if (r2 == 0) goto L_0x005e
            goto L_0x0069
        L_0x005e:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r12.f41129B
            r2.setVisibility(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41130C
            r2.setVisibility(r3)
            goto L_0x0073
        L_0x0069:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r12.f41129B
            r2.setVisibility(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41130C
            r2.setVisibility(r7)
        L_0x0073:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r12.f41131z
            java.lang.String r5 = r1.f145528e
            r2.setText(r5)
            int r2 = r1.f145529f
            if (r2 != r4) goto L_0x00b0
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r12.f41129B
            android.view.View r3 = r12.f44854d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131099707(0x7f06003b, float:1.7811775E38)
            int r3 = r3.getColor(r5)
            r2.setTextColor(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41130C
            android.view.View r3 = r12.f44854d
            android.content.Context r3 = r3.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131099703(0x7f060037, float:1.7811767E38)
            int r3 = r3.getColor(r5)
            r2.setIconColor(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41128A
            r2.setVisibility(r7)
            goto L_0x00e1
        L_0x00b0:
            com.tencent.mm.plugin.finder.view.UnchangeTextView r2 = r12.f41129B
            android.view.View r5 = r12.f44854d
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099699(0x7f060033, float:1.7811759E38)
            int r5 = r5.getColor(r6)
            r2.setTextColor(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41130C
            android.view.View r5 = r12.f44854d
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099694(0x7f06002e, float:1.7811748E38)
            int r5 = r5.getColor(r6)
            r2.setIconColor(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41128A
            r2.setVisibility(r3)
        L_0x00e1:
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            boolean r2 = r14 instanceof java.lang.Boolean
            r3 = 0
            r5 = 0
            java.lang.String r8 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            if (r2 == 0) goto L_0x014d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r14 = gy3.C87412m.m108589b(r14, r2)
            if (r14 == 0) goto L_0x014d
            long r9 = r11.f41124h
            int r14 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0105
            int r14 = r1.f145530g
            if (r14 != 0) goto L_0x0101
            goto L_0x0105
        L_0x0101:
            float r14 = (float) r14
            float r2 = (float) r9
            float r3 = r14 / r2
        L_0x0105:
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = r12.f41130C
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            gy3.C87412m.m108592e(r14, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r14 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r14
            float r14 = r14.f44422N
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 != 0) goto L_0x0118
            r14 = 1
            goto L_0x0119
        L_0x0118:
            r14 = 0
        L_0x0119:
            if (r14 != 0) goto L_0x017a
            r14 = 2
            float[] r14 = new float[r14]
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r12.f41130C
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            gy3.C87412m.m108592e(r2, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            float r2 = r2.f44422N
            r14[r7] = r2
            r14[r4] = r3
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r14)
            r2 = 300(0x12c, double:1.48E-321)
            android.animation.ValueAnimator r14 = r14.setDuration(r2)
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            r14.setInterpolator(r2)
            vs1.p r2 = new vs1.p
            r2.<init>(r12)
            r14.addUpdateListener(r2)
            r14.start()
            goto L_0x017a
        L_0x014d:
            long r9 = r11.f41124h
            int r14 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x016d
            int r14 = r1.f145530g
            if (r14 != 0) goto L_0x0158
            goto L_0x016d
        L_0x0158:
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = r12.f41130C
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            gy3.C87412m.m108592e(r14, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r14 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r14
            int r2 = r1.f145530g
            float r2 = (float) r2
            long r5 = r11.f41124h
            float r3 = (float) r5
            float r2 = r2 / r3
            r14.f44422N = r2
            goto L_0x017a
        L_0x016d:
            com.tencent.mm.ui.widget.imageview.WeImageView r14 = r12.f41130C
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            gy3.C87412m.m108592e(r14, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r14 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r14
            r14.f44422N = r3
        L_0x017a:
            ok1.e r14 = ok1.C62042e.f176370a
            boolean r14 = r14.mo87027N0()
            if (r14 != 0) goto L_0x0190
            fj1.b r14 = r11.f41121e
            androidx.lifecycle.i0 r14 = r14.mo71262a(r0)
            cl1.o r14 = (cl1.C54991o) r14
            boolean r14 = r14.f154190D
            if (r14 == 0) goto L_0x018f
            goto L_0x0190
        L_0x018f:
            r4 = 0
        L_0x0190:
            if (r4 != 0) goto L_0x019c
            android.view.View r12 = r12.f44854d
            vs1.q r14 = new vs1.q
            r14.<init>(r11, r1, r13)
            r12.setOnClickListener(r14)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vs1.C15003o.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int, java.util.List):void");
    }
}
