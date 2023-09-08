package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.C4087k6;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import qo3.C12925w;
import qo3.w$$d;
import sx3.C110818d0;
import sx3.C36907w;
import te3.C51560uk2;

/* renamed from: com.tencent.mm.plugin.finder.view.y4 */
public abstract class C4220y4<T> {

    /* renamed from: a */
    public C12925w f18523a;

    /* renamed from: b */
    public String f18524b = "";

    /* renamed from: c */
    public final ArrayList<C4221a<T>> f18525c = new ArrayList<>();

    /* renamed from: com.tencent.mm.plugin.finder.view.y4$a */
    public static abstract class C4221a<T> implements C0740i2 {

        /* renamed from: d */
        public final T f18526d;

        /* renamed from: e */
        public boolean f18527e;

        public C4221a(Object obj, boolean z, int i, C8480h hVar) {
            z = (i & 2) != 0 ? false : z;
            this.f18526d = obj;
            this.f18527e = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.y4$b */
    public static final class C4222b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4220y4<T> f18528d;

        public C4222b(C4220y4<T> y4Var) {
            this.f18528d = y4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$show$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18528d.mo5090e().mo5085n();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderSingleSelectBottomSheet$show$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.y4$c */
    public static final class C4223c implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C4220y4<T> f18529d;

        public C4223c(C4220y4<T> y4Var) {
            this.f18529d = y4Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.LinkedList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.LinkedList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.LinkedList} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r9, android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.C16631z r12) {
            /*
                r8 = this;
                jq3.o r12 = (jq3.C60905o) r12
                java.lang.String r11 = "adapter"
                gy3.C87412m.m108594g(r9, r11)
                java.lang.String r9 = "view"
                gy3.C87412m.m108594g(r10, r9)
                java.lang.String r9 = "holder"
                gy3.C87412m.m108594g(r12, r9)
                com.tencent.mm.plugin.finder.view.y4<T> r9 = r8.f18529d
                java.lang.Object r10 = r12.f173503E
                java.lang.String r11 = "holder.getAssociatedObject()"
                gy3.C87412m.m108593f(r10, r11)
                com.tencent.mm.plugin.finder.view.y4$a r10 = (com.tencent.p014mm.plugin.finder.view.C4220y4.C4221a) r10
                com.tencent.mm.plugin.finder.view.k6 r9 = (com.tencent.p014mm.plugin.finder.view.C4087k6) r9
                r9.getClass()
                T r11 = r10.f18526d
                r12 = r11
                te3.uk2 r12 = (te3.C51560uk2) r12
                int r12 = r12.f142914e
                r0 = 7
                r1 = 1
                r2 = 0
                if (r12 != r0) goto L_0x00ea
                qo3.w r11 = r9.mo5090e()
                com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage r12 = r9.f18222e
                r11.mo12468h(r12)
                java.util.ArrayList<com.tencent.mm.plugin.finder.view.y4$a<T>> r11 = r9.f18525c
                java.util.Iterator r11 = r11.iterator()
            L_0x003d:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x0058
                java.lang.Object r12 = r11.next()
                r3 = r12
                com.tencent.mm.plugin.finder.view.y4$a r3 = (com.tencent.p014mm.plugin.finder.view.C4220y4.C4221a) r3
                T r3 = r3.f18526d
                te3.uk2 r3 = (te3.C51560uk2) r3
                int r3 = r3.f142914e
                if (r3 != r0) goto L_0x0054
                r3 = 1
                goto L_0x0055
            L_0x0054:
                r3 = 0
            L_0x0055:
                if (r3 == 0) goto L_0x003d
                goto L_0x0059
            L_0x0058:
                r12 = 0
            L_0x0059:
                com.tencent.mm.plugin.finder.view.y4$a r12 = (com.tencent.p014mm.plugin.finder.view.C4220y4.C4221a) r12
                if (r12 == 0) goto L_0x00f3
                T r11 = r12.f18526d
                te3.uk2 r11 = (te3.C51560uk2) r11
                te3.ps1 r11 = r11.f142915f
                r3 = 10
                if (r11 == 0) goto L_0x008e
                java.util.LinkedList<te3.e20> r11 = r11.f139937f
                if (r11 == 0) goto L_0x008e
                java.util.ArrayList r4 = new java.util.ArrayList
                int r5 = sx3.C36907w.m41090l(r11, r3)
                r4.<init>(r5)
                java.util.Iterator r11 = r11.iterator()
            L_0x0078:
                boolean r5 = r11.hasNext()
                if (r5 == 0) goto L_0x0093
                java.lang.Object r5 = r11.next()
                te3.e20 r5 = (te3.C49218e20) r5
                int r5 = r5.f132637e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.add(r5)
                goto L_0x0078
            L_0x008e:
                java.util.LinkedList r4 = new java.util.LinkedList
                r4.<init>()
            L_0x0093:
                com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage r11 = r9.f18222e
                r11.getClass()
                java.util.ArrayList<com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b> r5 = r11.f17991d
                r5.clear()
                java.util.ArrayList<com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b> r5 = r11.f17991d
                java.util.ArrayList r6 = new java.util.ArrayList
                int r3 = sx3.C36907w.m41090l(r4, r3)
                r6.<init>(r3)
                java.util.Iterator r3 = r4.iterator()
            L_0x00ac:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x00c5
                java.lang.Object r4 = r3.next()
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b r7 = new com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b
                r7.<init>(r4)
                r6.add(r7)
                goto L_0x00ac
            L_0x00c5:
                r5.addAll(r6)
                java.util.ArrayList<com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b> r3 = r11.f17991d
                com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b r4 = new com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b
                r4.<init>(r2)
                r3.add(r4)
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<com.tencent.mm.plugin.finder.view.GameTeamSelectCoinBottomPage$b> r11 = r11.f17992e
                if (r11 == 0) goto L_0x00d9
                r11.notifyDataSetChanged()
            L_0x00d9:
                com.tencent.mm.plugin.finder.view.m6 r9 = r9.f18223f
                T r11 = r12.f18526d
                te3.uk2 r11 = (te3.C51560uk2) r11
                te3.ps1 r11 = r11.f142915f
                if (r11 == 0) goto L_0x00e6
                int r11 = r11.f139935d
                goto L_0x00e7
            L_0x00e6:
                r11 = 0
            L_0x00e7:
                r9.f18273e = r11
                goto L_0x00f3
            L_0x00ea:
                fy3.p<te3.uk2, java.lang.Integer, rx3.b0> r9 = r9.f18221d
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                r9.invoke(r11, r12)
            L_0x00f3:
                T r9 = r10.f18526d
                te3.uk2 r9 = (te3.C51560uk2) r9
                int r9 = r9.f142914e
                if (r9 == r0) goto L_0x00fc
                goto L_0x00fd
            L_0x00fc:
                r1 = 0
            L_0x00fd:
                if (r1 == 0) goto L_0x0108
                com.tencent.mm.plugin.finder.view.y4<T> r9 = r8.f18529d
                qo3.w r9 = r9.mo5090e()
                r9.mo5085n()
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4220y4.C4223c.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.y4$d */
    public static final class C4224d implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C4220y4<T> f18530a;

        public C4224d(C4220y4<T> y4Var) {
            this.f18530a = y4Var;
        }

        public final void onDismiss() {
            ((C4087k6) this.f18530a).getClass();
        }
    }

    /* renamed from: d */
    public final C4220y4<T> mo5089d(String str, List<? extends T> list, int i) {
        C4221a aVar;
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(list, "dataList");
        this.f18524b = str;
        this.f18525c.clear();
        ArrayList<C4221a<T>> arrayList = this.f18525c;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C51560uk2 uk22 = (C51560uk2) it.next();
            C87412m.m108594g(uk22, FirebaseAnalytics.C113379b.SOURCE);
            arrayList2.add(new C4087k6.C4089b(uk22));
        }
        arrayList.addAll(arrayList2);
        if (i >= 0 && i < this.f18525c.size() && (aVar = (C4221a) C110818d0.m150917O(this.f18525c, i)) != null) {
            aVar.f18527e = true;
        }
        return this;
    }

    /* renamed from: e */
    public final C12925w mo5090e() {
        C12925w wVar = this.f18523a;
        if (wVar != null) {
            return wVar;
        }
        C87412m.m108603p("bottomSheet");
        throw null;
    }

    /* renamed from: f */
    public final void mo5091f(Context context) {
        C87412m.m108594g(context, "context");
        this.f18523a = new C12925w(context);
        C12925w e = mo5090e();
        e.mo12470j(C0966R.C0971layout.apv);
        e.f36927f.setBackground((Drawable) null);
        e.f36927f.findViewById(C0966R.C0970id.djl).setOnClickListener(new C4222b(this));
        WxRecyclerView wxRecyclerView = (WxRecyclerView) e.f36927f.findViewById(C0966R.C0970id.jmi);
        ((TextView) e.f36927f.findViewById(C0966R.C0970id.jmj)).setText(this.f18524b);
        WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderSingleSelectBottomSheet$getAdapter$1(this), this.f18525c, false);
        wxRecyclerAdapter.f173488o = new C4223c(this);
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
        mo5090e().f36937s = new C4224d(this);
        mo5090e().mo5086o();
    }
}
