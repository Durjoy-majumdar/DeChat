package nf2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72996z1;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import kg3.C76577a;
import kw0.C46746a;
import pf2.C47478f;
import pf2.C47482g;
import pf2.C47483h;
import pf2.C47484i;
import pf2.C47486k;
import pf2.C47489n;
import pf2.C47490o;
import pf2.C47491p;
import pf2.C47492q;
import pf2.C47493r;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C49699hg;
import te3.C49841ig;

/* renamed from: nf2.a */
public final class C47240a extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Context f126805d;

    /* renamed from: e */
    public final int f126806e;

    /* renamed from: f */
    public final C72996z1 f126807f;

    /* renamed from: g */
    public final long f126808g;

    /* renamed from: h */
    public final boolean f126809h;

    /* renamed from: i */
    public final String f126810i = "BizProfileTabFeaturedMsgAdapter";

    /* renamed from: j */
    public C32224a<C13598b0> f126811j;

    /* renamed from: n */
    public ArrayList<C13604l<C47241a, C49699hg>> f126812n = new ArrayList<>();

    /* renamed from: o */
    public C49841ig f126813o;

    /* renamed from: p */
    public Integer f126814p = 0;

    /* renamed from: q */
    public LinkedList<C49699hg> f126815q;

    /* renamed from: r */
    public boolean f126816r;

    /* renamed from: nf2.a$a */
    public enum C47241a {
        Text(1),
        SingleVideo(2),
        SinglePic(3),
        Compound(4),
        FinderLive(5),
        Loading(90);
        

        /* renamed from: d */
        public final int f126824d;

        /* access modifiers changed from: public */
        C47241a(int i) {
            this.f126824d = i;
        }
    }

    public C47240a(Context context, int i, C72996z1 z1Var, long j, boolean z) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(z1Var, "contact");
        this.f126805d = context;
        this.f126806e = i;
        this.f126807f = z1Var;
        this.f126808g = j;
        this.f126809h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        r9 = r8.f126815q;
     */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72277F4(te3.C49841ig r9, java.lang.Integer r10, java.util.LinkedList<te3.C49699hg> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "v2RespMsgList"
            gy3.C87412m.m108594g(r9, r0)
            r8.f126813o = r9
            r8.f126814p = r10
            r8.f126815q = r11
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r9 = r8.f126812n
            r9.clear()
            te3.ig r9 = r8.f126813o
            r10 = 0
            if (r9 == 0) goto L_0x01fc
            java.util.LinkedList<te3.hg> r9 = r9.f135306d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            r11 = 0
            r1 = 1
            if (r9 == 0) goto L_0x002a
            java.lang.String r9 = r8.f126810i
            java.lang.String r2 = "no v2resp msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x00f3
        L_0x002a:
            java.lang.Integer r9 = r8.f126814p
            if (r9 == 0) goto L_0x0042
            int r9 = r9.intValue()
            if (r9 >= 0) goto L_0x0035
            goto L_0x0042
        L_0x0035:
            java.util.LinkedList<te3.hg> r9 = r8.f126815q
            if (r9 == 0) goto L_0x0042
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r9)
            if (r9 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r9 = 1
            goto L_0x0043
        L_0x0042:
            r9 = 0
        L_0x0043:
            if (r9 != 0) goto L_0x004f
            java.lang.String r9 = r8.f126810i
            java.lang.String r2 = "no featured list"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x00f3
        L_0x004f:
            java.lang.Class<ex0.d> r9 = ex0.C45696d.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            ex0.d r9 = (ex0.C45696d) r9
            com.tencent.mm.storage.z1 r2 = r8.f126807f
            java.lang.String r2 = r2.getUsername()
            long r2 = r9.mo70975T4(r2)
            java.lang.Integer r9 = r8.f126814p
            gy3.C87412m.m108591d(r9)
            int r9 = r9.intValue()
            long r4 = (long) r9
            r9 = 1000(0x3e8, float:1.401E-42)
            long r6 = (long) r9
            long r4 = r4 * r6
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0076
            r9 = 1
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            if (r9 != 0) goto L_0x0080
            boolean r9 = r8.f126816r
            if (r9 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r9 = 0
            goto L_0x0081
        L_0x0080:
            r9 = 1
        L_0x0081:
            te3.ig r2 = r8.f126813o
            if (r2 == 0) goto L_0x01f8
            java.util.LinkedList<te3.hg> r2 = r2.f135306d
            java.lang.Object r2 = r2.get(r11)
            te3.hg r2 = (te3.C49699hg) r2
            int r2 = r2.f134609n
            if (r2 == 0) goto L_0x009f
            te3.ig r2 = r8.f126813o
            if (r2 == 0) goto L_0x009b
            java.util.LinkedList<te3.hg> r2 = r2.f135306d
            r2.remove(r11)
            goto L_0x009f
        L_0x009b:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x009f:
            if (r9 == 0) goto L_0x00cd
            java.lang.String r9 = r8.f126810i
            java.lang.String r2 = "add featured expand msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            java.util.LinkedList<te3.hg> r9 = r8.f126815q
            gy3.C87412m.m108591d(r9)
            java.lang.Object r9 = r9.get(r11)
            te3.hg r9 = (te3.C49699hg) r9
            r2 = 2
            r9.f134609n = r2
            te3.ig r9 = r8.f126813o
            if (r9 == 0) goto L_0x00c9
            java.util.LinkedList<te3.hg> r9 = r9.f135306d
            java.util.LinkedList<te3.hg> r2 = r8.f126815q
            gy3.C87412m.m108591d(r2)
            java.lang.Object r2 = r2.get(r11)
            r9.add(r11, r2)
            goto L_0x00f3
        L_0x00c9:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x00cd:
            java.lang.String r9 = r8.f126810i
            java.lang.String r2 = "add featured collapse msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            java.util.LinkedList<te3.hg> r9 = r8.f126815q
            gy3.C87412m.m108591d(r9)
            java.lang.Object r9 = r9.get(r11)
            te3.hg r9 = (te3.C49699hg) r9
            r9.f134609n = r1
            te3.ig r9 = r8.f126813o
            if (r9 == 0) goto L_0x01f4
            java.util.LinkedList<te3.hg> r9 = r9.f135306d
            java.util.LinkedList<te3.hg> r2 = r8.f126815q
            gy3.C87412m.m108591d(r2)
            java.lang.Object r2 = r2.get(r11)
            r9.add(r11, r2)
        L_0x00f3:
            nf2.a$a r9 = nf2.C47240a.C47241a.Text
            te3.ig r2 = r8.f126813o
            if (r2 == 0) goto L_0x01f0
            java.util.LinkedList<te3.hg> r2 = r2.f135306d
            java.util.Iterator r2 = r2.iterator()
        L_0x00ff:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01c8
            java.lang.Object r3 = r2.next()
            te3.hg r3 = (te3.C49699hg) r3
            te3.me r4 = r3.f134607i
            if (r4 == 0) goto L_0x011a
            java.util.LinkedList<te3.le> r4 = r4.f137969e
            int r4 = r4.size()
            if (r4 != 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r4 = 0
            goto L_0x011b
        L_0x011a:
            r4 = 1
        L_0x011b:
            te3.iy r5 = r3.f134602d
            int r5 = r5.f135740e
            if (r5 != r1) goto L_0x0127
            te3.ei r6 = r3.f134603e
            if (r6 != 0) goto L_0x0127
            r6 = 1
            goto L_0x0128
        L_0x0127:
            r6 = 0
        L_0x0128:
            if (r4 == 0) goto L_0x014d
            if (r6 == 0) goto L_0x014d
            java.lang.String r9 = r8.f126810i
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "updateData fail, appMsgTypeLegal = "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r11 = ", oldTextLegal = "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r10)
            goto L_0x01e8
        L_0x014d:
            if (r5 == r1) goto L_0x01bc
            r4 = 49
            if (r5 == r4) goto L_0x0154
            goto L_0x00ff
        L_0x0154:
            te3.me r4 = r3.f134607i
            java.util.LinkedList<te3.le> r4 = r4.f137969e
            int r4 = r4.size()
            te3.me r5 = r3.f134607i
            java.util.LinkedList<te3.le> r5 = r5.f137969e
            java.lang.Object r5 = r5.get(r11)
            te3.le r5 = (te3.C50249le) r5
            if (r4 != r1) goto L_0x01ae
            int r4 = r5.f137345p
            r5 = 5
            if (r4 != r5) goto L_0x017a
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r4 = r8.f126812n
            rx3.l r5 = new rx3.l
            nf2.a$a r6 = nf2.C47240a.C47241a.SingleVideo
            r5.<init>(r6, r3)
            r4.add(r5)
            goto L_0x00ff
        L_0x017a:
            r5 = 8
            if (r4 != r5) goto L_0x018c
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r4 = r8.f126812n
            rx3.l r5 = new rx3.l
            nf2.a$a r6 = nf2.C47240a.C47241a.SinglePic
            r5.<init>(r6, r3)
            r4.add(r5)
            goto L_0x00ff
        L_0x018c:
            r5 = 10
            if (r4 != r5) goto L_0x019c
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r4 = r8.f126812n
            rx3.l r5 = new rx3.l
            r5.<init>(r9, r3)
            r4.add(r5)
            goto L_0x00ff
        L_0x019c:
            r5 = 19
            if (r4 != r5) goto L_0x01ae
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r4 = r8.f126812n
            rx3.l r5 = new rx3.l
            nf2.a$a r6 = nf2.C47240a.C47241a.FinderLive
            r5.<init>(r6, r3)
            r4.add(r5)
            goto L_0x00ff
        L_0x01ae:
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r4 = r8.f126812n
            rx3.l r5 = new rx3.l
            nf2.a$a r6 = nf2.C47240a.C47241a.Compound
            r5.<init>(r6, r3)
            r4.add(r5)
            goto L_0x00ff
        L_0x01bc:
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r4 = r8.f126812n
            rx3.l r5 = new rx3.l
            r5.<init>(r9, r3)
            r4.add(r5)
            goto L_0x00ff
        L_0x01c8:
            te3.ig r9 = r8.f126813o
            if (r9 == 0) goto L_0x01ec
            te3.ah r9 = r9.f135309g
            if (r9 == 0) goto L_0x01d5
            int r9 = r9.f130509e
            if (r9 != 0) goto L_0x01d5
            r11 = 1
        L_0x01d5:
            if (r11 == 0) goto L_0x01e8
            java.util.ArrayList<rx3.l<nf2.a$a, te3.hg>> r9 = r8.f126812n
            rx3.l r10 = new rx3.l
            nf2.a$a r11 = nf2.C47240a.C47241a.Loading
            te3.hg r0 = new te3.hg
            r0.<init>()
            r10.<init>(r11, r0)
            r9.add(r10)
        L_0x01e8:
            r8.notifyDataSetChanged()
            return
        L_0x01ec:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x01f0:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x01f4:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x01f8:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x01fc:
            gy3.C87412m.m108603p(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: nf2.C47240a.mo72277F4(te3.ig, java.lang.Integer, java.util.LinkedList):void");
    }

    public int getItemCount() {
        return this.f126812n.size();
    }

    public int getItemViewType(int i) {
        return ((C47241a) this.f126812n.get(i).f38555d).f126824d;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C32224a<C13598b0> aVar;
        RecyclerView.C16631z zVar2 = zVar;
        int i2 = i;
        C87412m.m108594g(zVar2, "holder");
        if (i2 == this.f126812n.size() - 1 && (aVar = this.f126811j) != null) {
            aVar.invoke();
        }
        if (zVar2 instanceof C47253h) {
            C47253h hVar = (C47253h) zVar2;
            C49699hg hgVar = (C49699hg) this.f126812n.get(i2).f38556e;
            C87412m.m108594g(hgVar, "bizMessage");
            C46746a.m52038k(C46746a.f125826a, hVar.f44854d, (float) C76577a.m92151b(hVar.f126848B, 8), false, false, 12, (Object) null);
            C47478f fVar = C47478f.f127353a;
            fVar.mo72497e(hgVar);
            Context context = hVar.f126848B;
            C47240a aVar2 = hVar.f126856z;
            View view = hVar.f126850D;
            C87412m.m108593f(view, "collapseView");
            View view2 = hVar.f126851E;
            C87412m.m108593f(view2, "mainView");
            fVar.mo72494b(context, aVar2, hgVar, view, view2, new C47252g(hVar, hgVar));
        } else if (zVar2 instanceof C47491p) {
            C47491p pVar = (C47491p) zVar2;
            C49699hg hgVar2 = (C49699hg) this.f126812n.get(i2).f38556e;
            C87412m.m108594g(hgVar2, "bizMessage");
            C47478f fVar2 = C47478f.f127353a;
            fVar2.mo72497e(hgVar2);
            C46746a.m52038k(C46746a.f125826a, pVar.f44854d, (float) C76577a.m92151b(pVar.f127403B, 8), false, false, 12, (Object) null);
            Context context2 = pVar.f127403B;
            C47240a aVar3 = pVar.f127411z;
            View view3 = pVar.f127404C;
            C87412m.m108593f(view3, "collapseView");
            View view4 = pVar.f127405D;
            C87412m.m108593f(view4, "mainView");
            fVar2.mo72494b(context2, aVar3, hgVar2, view3, view4, new C47490o(pVar, hgVar2));
        } else if (zVar2 instanceof C47493r) {
            C47493r rVar = (C47493r) zVar2;
            C49699hg hgVar3 = (C49699hg) this.f126812n.get(i2).f38556e;
            C87412m.m108594g(hgVar3, "bizMessage");
            C46746a.m52038k(C46746a.f125826a, rVar.f44854d, (float) C76577a.m92151b(rVar.f127415B, 8), false, false, 12, (Object) null);
            C47478f fVar3 = C47478f.f127353a;
            fVar3.mo72497e(hgVar3);
            Context context3 = rVar.f127415B;
            C47240a aVar4 = rVar.f127423z;
            View view5 = rVar.f127418E;
            C87412m.m108593f(view5, "collapseView");
            View view6 = rVar.f127419F;
            C87412m.m108593f(view6, "mainView");
            fVar3.mo72494b(context3, aVar4, hgVar3, view5, view6, new C47492q(rVar, hgVar3));
        } else if (zVar2 instanceof C47483h) {
            C47483h hVar2 = (C47483h) zVar2;
            C49699hg hgVar4 = (C49699hg) this.f126812n.get(i2).f38556e;
            C87412m.m108594g(hgVar4, "bizMessage");
            C47478f fVar4 = C47478f.f127353a;
            fVar4.mo72497e(hgVar4);
            C46746a.m52038k(C46746a.f125826a, hVar2.f44854d, (float) C76577a.m92151b(hVar2.f127371A, 8), false, false, 12, (Object) null);
            Context context4 = hVar2.f127371A;
            C47240a aVar5 = hVar2.f127376z;
            View view7 = hVar2.f127374D;
            C87412m.m108593f(view7, "collapseView");
            View view8 = hVar2.f127375E;
            C87412m.m108593f(view8, "mainView");
            fVar4.mo72494b(context4, aVar5, hgVar4, view7, view8, new C47482g(hVar2, hgVar4, i2));
        } else if (zVar2 instanceof C47489n) {
            C47489n nVar = (C47489n) zVar2;
            C49699hg hgVar5 = (C49699hg) this.f126812n.get(i2).f38556e;
            C87412m.m108594g(hgVar5, "bizMessage");
            C46746a.m52038k(C46746a.f125826a, nVar.f44854d, (float) C76577a.m92151b(nVar.f127395B, 8), false, false, 12, (Object) null);
            C47478f fVar5 = C47478f.f127353a;
            Context context5 = nVar.f127395B;
            C47240a aVar6 = nVar.f127399z;
            View view9 = nVar.f127396C;
            C87412m.m108593f(view9, "collapseView");
            View view10 = nVar.f127397D;
            C87412m.m108593f(view10, "mainView");
            fVar5.mo72494b(context5, aVar6, hgVar5, view9, view10, new C47486k(nVar, hgVar5));
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 90) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f7059wm, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C47484i(inflate);
        } else if (i == 2) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ck8, viewGroup, false);
            C87412m.m108593f(inflate2, "view");
            return new C47253h(this, inflate2);
        } else if (i == 3) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cj_, viewGroup, false);
            C87412m.m108593f(inflate3, "view");
            return new C47491p(this, inflate3);
        } else if (i == 1) {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.ckw, viewGroup, false);
            C87412m.m108593f(inflate4, "view");
            return new C47493r(this, inflate4);
        } else if (i == 4) {
            View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bmn, viewGroup, false);
            C87412m.m108593f(inflate5, "view");
            return new C47483h(this, inflate5);
        } else if (i == 5) {
            View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.cut, viewGroup, false);
            C87412m.m108593f(inflate6, "view");
            return new C47489n(this, inflate6);
        } else {
            View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.bmn, viewGroup, false);
            C87412m.m108593f(inflate7, "view");
            return new C47483h(this, inflate7);
        }
    }
}
