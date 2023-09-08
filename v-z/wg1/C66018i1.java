package wg1;

import ak1.C54067f0;
import ak1.C54116w;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d60.C58124b;
import di3.C86312j;
import ej0.C86524b;
import ej0.C86525c;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: wg1.i1 */
public final class C66018i1 implements C65989d1 {

    /* renamed from: A */
    public final TextView f189797A;

    /* renamed from: B */
    public final ArrayList<C66021c> f189798B;

    /* renamed from: C */
    public final C66019a f189799C;

    /* renamed from: D */
    public C86525c f189800D;

    /* renamed from: E */
    public int f189801E;

    /* renamed from: d */
    public final View f189802d;

    /* renamed from: e */
    public final C58124b f189803e;

    /* renamed from: f */
    public final MMActivity f189804f;

    /* renamed from: g */
    public final C65986c1 f189805g;

    /* renamed from: h */
    public final String f189806h = "Finder.FinderLiveCastScreenViewCallback";

    /* renamed from: i */
    public final int f189807i = -1;

    /* renamed from: j */
    public final int f189808j = 1;

    /* renamed from: n */
    public final int f189809n = 2;

    /* renamed from: o */
    public final int f189810o = 3;

    /* renamed from: p */
    public final LiveBottomSheetPanel f189811p;

    /* renamed from: q */
    public final View f189812q;

    /* renamed from: r */
    public final View f189813r;

    /* renamed from: s */
    public final View f189814s;

    /* renamed from: t */
    public final View f189815t;

    /* renamed from: u */
    public final View f189816u;

    /* renamed from: v */
    public final TextView f189817v;

    /* renamed from: w */
    public final View f189818w;

    /* renamed from: x */
    public final RecyclerView f189819x;

    /* renamed from: y */
    public final View f189820y;

    /* renamed from: z */
    public final TextView f189821z;

    /* renamed from: wg1.i1$n */
    public static final class C15306n implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f41616d;

        public C15306n(C66018i1 i1Var) {
            this.f41616d = i1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$refreshByMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66018i1 i1Var = this.f41616d;
            i1Var.getClass();
            i1Var.mo90056p(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$refreshByMode$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.i1$o */
    public static final class C15307o extends ClickableSpan {
        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$refreshByMode$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$refreshByMode$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(Color.parseColor("#7D90A9"));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: wg1.i1$a */
    public final class C66019a extends RecyclerView.C16613e<C66020b> {
        public C66019a() {
        }

        public int getItemCount() {
            return C66018i1.this.f189798B.size();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
            r1 = r1.f251382a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r5, int r6) {
            /*
                r4 = this;
                wg1.i1$b r5 = (wg1.C66018i1.C66020b) r5
                java.lang.String r0 = "holder"
                gy3.C87412m.m108594g(r5, r0)
                wg1.i1 r0 = wg1.C66018i1.this
                java.util.ArrayList<wg1.i1$c> r0 = r0.f189798B
                java.lang.Object r6 = sx3.C110818d0.m150917O(r0, r6)
                wg1.i1$c r6 = (wg1.C66018i1.C66021c) r6
                if (r6 == 0) goto L_0x004b
                wg1.i1 r0 = wg1.C66018i1.this
                ej0.c r1 = r6.f189825a
                r2 = 0
                if (r1 == 0) goto L_0x0021
                ej0.b r1 = r1.f251382a
                if (r1 == 0) goto L_0x0021
                java.lang.String r1 = r1.f251378g
                goto L_0x0022
            L_0x0021:
                r1 = r2
            L_0x0022:
                android.widget.TextView r3 = r5.f189824z
                r3.setText(r1)
                ej0.c r1 = r6.f189825a
                if (r1 == 0) goto L_0x002f
                ej0.e r1 = r1.f251386e
                ej0.e$a r2 = r1.f167798a
            L_0x002f:
                ej0.e$a r1 = ej0.C58608e.C58609a.Transitioning
                if (r2 != r1) goto L_0x003a
                android.widget.ProgressBar r1 = r5.f189823A
                r2 = 0
                r1.setVisibility(r2)
                goto L_0x0041
            L_0x003a:
                android.widget.ProgressBar r1 = r5.f189823A
                r2 = 8
                r1.setVisibility(r2)
            L_0x0041:
                android.view.View r5 = r5.f44854d
                wg1.h1 r1 = new wg1.h1
                r1.<init>(r0, r6)
                r5.setOnClickListener(r1)
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.C66019a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "p0");
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.afj, (ViewGroup) null);
            inflate.setBackground(viewGroup.getContext().getResources().getDrawable(C0966R.C0969drawable.f5162yu));
            return new C66020b(C66018i1.this, inflate);
        }
    }

    /* renamed from: wg1.i1$b */
    public final class C66020b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ProgressBar f189823A;

        /* renamed from: z */
        public final TextView f189824z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66020b(C66018i1 i1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f189824z = (TextView) view.findViewById(C0966R.C0970id.ay4);
            this.f189823A = (ProgressBar) view.findViewById(C0966R.C0970id.f357640ay3);
        }
    }

    /* renamed from: wg1.i1$c */
    public static final class C66021c {

        /* renamed from: a */
        public C86525c f189825a;

        public C66021c(C86525c cVar) {
            this.f189825a = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C66021c) && C87412m.m108589b(this.f189825a, ((C66021c) obj).f189825a);
        }

        public int hashCode() {
            C86525c cVar = this.f189825a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "DeviceInfo(device=" + this.f189825a + ')';
        }
    }

    /* renamed from: wg1.i1$d */
    public static final class C66022d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189826d;

        public C66022d(C66018i1 i1Var) {
            this.f189826d = i1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f189826d.f189803e, C58124b.C58125b.FINDER_LIVE_CAST_SCREEN_HIDE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.i1$e */
    public static final class C66023e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189827d;

        public C66023e(C66018i1 i1Var) {
            this.f189827d = i1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58124b.C7172a.m7372a(this.f189827d.f189803e, C58124b.C58125b.FINDER_LIVE_CAST_SCREEN_HIDE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.i1$f */
    public static final class C66024f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189828d;

        public C66024f(C66018i1 i1Var) {
            this.f189828d = i1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65986c1 c1Var = this.f189828d.f189805g;
            if (c1Var != null) {
                c1Var.mo90018K();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.i1$g */
    public static final class C66025g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86525c f189829d;

        /* renamed from: e */
        public final /* synthetic */ C66018i1 f189830e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66025g(C86525c cVar, C66018i1 i1Var) {
            super(0);
            this.f189829d = cVar;
            this.f189830e = i1Var;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.ArrayList<wg1.i1$c>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Iterator<wg1.i1$c>} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: wg1.i1$c} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r4v1 */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            r5 = r5.f251382a;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r7 = this;
                ej0.c r0 = r7.f189829d
                if (r0 == 0) goto L_0x0080
                ej0.b r0 = r0.f251382a
                if (r0 == 0) goto L_0x0080
                wg1.i1 r0 = r7.f189830e
                int r1 = r0.f189801E
                int r2 = r0.f189810o
                if (r1 == r2) goto L_0x0080
                int r0 = r0.f189809n
                if (r1 == r0) goto L_0x0021
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ak1.w r0 = (ak1.C54116w) r0
                ak1.f0$f r1 = ak1.C54067f0.C0055f.CAST_SCREEN_DEVICE_EXPOSE
                r0.Mx0(r1)
            L_0x0021:
                wg1.i1 r0 = r7.f189830e
                java.util.ArrayList<wg1.i1$c> r0 = r0.f189798B
                ej0.c r1 = r7.f189829d
                monitor-enter(r0)
                java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x007d }
            L_0x002c:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x007d }
                r4 = 0
                if (r3 == 0) goto L_0x0053
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x007d }
                r5 = r3
                wg1.i1$c r5 = (wg1.C66018i1.C66021c) r5     // Catch:{ all -> 0x007d }
                ej0.c r5 = r5.f189825a     // Catch:{ all -> 0x007d }
                if (r5 == 0) goto L_0x0045
                ej0.b r5 = r5.f251382a     // Catch:{ all -> 0x007d }
                if (r5 == 0) goto L_0x0045
                java.lang.String r5 = r5.f251380i     // Catch:{ all -> 0x007d }
                goto L_0x0046
            L_0x0045:
                r5 = r4
            L_0x0046:
                ej0.b r6 = r1.f251382a     // Catch:{ all -> 0x007d }
                if (r6 == 0) goto L_0x004c
                java.lang.String r4 = r6.f251380i     // Catch:{ all -> 0x007d }
            L_0x004c:
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ all -> 0x007d }
                if (r4 == 0) goto L_0x002c
                r4 = r3
            L_0x0053:
                monitor-exit(r0)
                wg1.i1$c r4 = (wg1.C66018i1.C66021c) r4
                wg1.i1 r0 = r7.f189830e
                int r1 = r0.f189809n
                r0.mo90056p(r1)
                if (r4 != 0) goto L_0x0080
                wg1.i1 r0 = r7.f189830e
                java.util.ArrayList<wg1.i1$c> r0 = r0.f189798B
                wg1.i1$c r1 = new wg1.i1$c
                ej0.c r2 = r7.f189829d
                r1.<init>(r2)
                r0.add(r1)
                wg1.i1 r0 = r7.f189830e
                wg1.i1$a r1 = r0.f189799C
                java.util.ArrayList<wg1.i1$c> r0 = r0.f189798B
                int r0 = r0.size()
                int r0 = r0 + -1
                r1.notifyItemInserted(r0)
                goto L_0x0080
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0080:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.C66025g.invoke():java.lang.Object");
        }
    }

    /* renamed from: wg1.i1$h */
    public static final class C66026h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189831d;

        /* renamed from: e */
        public final /* synthetic */ C86525c f189832e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66026h(C66018i1 i1Var, C86525c cVar) {
            super(0);
            this.f189831d = i1Var;
            this.f189832e = cVar;
        }

        public Object invoke() {
            String str = this.f189831d.f189806h;
            Log.m105924i(str, "onBreakDevice mrDevice:" + this.f189832e + "\nselectedDevice:" + this.f189831d.f189800D);
            if (C87412m.m108589b(this.f189832e, this.f189831d.f189800D)) {
                C66018i1 i1Var = this.f189831d;
                i1Var.f189800D = null;
                if (i1Var.f189798B.isEmpty()) {
                    C66018i1 i1Var2 = this.f189831d;
                    i1Var2.getClass();
                    i1Var2.mo90056p(0);
                } else {
                    C66018i1 i1Var3 = this.f189831d;
                    i1Var3.mo90056p(i1Var3.f189809n);
                    C65986c1 c1Var = this.f189831d.f189805g;
                    if (c1Var != null) {
                        c1Var.mo90019V0();
                    }
                }
                ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_BREAK);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.i1$i */
    public static final class C66027i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189833d;

        /* renamed from: e */
        public final /* synthetic */ C86525c f189834e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66027i(C66018i1 i1Var, C86525c cVar) {
            super(0);
            this.f189833d = i1Var;
            this.f189834e = cVar;
        }

        public Object invoke() {
            String str = this.f189833d.f189806h;
            Log.m105924i(str, "onLinkingDevice mrDevice:" + this.f189834e);
            C66018i1 i1Var = this.f189833d;
            i1Var.f189800D = this.f189834e;
            i1Var.mo90056p(i1Var.f189810o);
            ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_SUCCESS);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.i1$j */
    public static final class C66028j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189835d;

        /* renamed from: e */
        public final /* synthetic */ C86525c f189836e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66028j(C66018i1 i1Var, C86525c cVar) {
            super(0);
            this.f189835d = i1Var;
            this.f189836e = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            r6 = r6.f251382a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r10 = this;
                wg1.i1 r0 = r10.f189835d
                java.lang.String r0 = r0.f189806h
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onLinkingDevice mrDevice:"
                r1.append(r2)
                ej0.c r2 = r10.f189836e
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                ej0.c r0 = r10.f189836e
                if (r0 == 0) goto L_0x0078
                ej0.b r1 = r0.f251382a
                if (r1 == 0) goto L_0x0078
                wg1.i1 r1 = r10.f189835d
                java.util.ArrayList<wg1.i1$c> r1 = r1.f189798B
                monitor-enter(r1)
                r2 = 0
                java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0075 }
                r4 = -1
                r5 = -1
            L_0x002e:
                boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x005e
                java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0075 }
                int r7 = r2 + 1
                r8 = 0
                if (r2 < 0) goto L_0x005a
                wg1.i1$c r6 = (wg1.C66018i1.C66021c) r6     // Catch:{ all -> 0x0075 }
                ej0.c r6 = r6.f189825a     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x004a
                ej0.b r6 = r6.f251382a     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x004a
                java.lang.String r6 = r6.f251380i     // Catch:{ all -> 0x0075 }
                goto L_0x004b
            L_0x004a:
                r6 = r8
            L_0x004b:
                ej0.b r9 = r0.f251382a     // Catch:{ all -> 0x0075 }
                if (r9 == 0) goto L_0x0051
                java.lang.String r8 = r9.f251380i     // Catch:{ all -> 0x0075 }
            L_0x0051:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r8)     // Catch:{ all -> 0x0075 }
                if (r6 == 0) goto L_0x0058
                r5 = r2
            L_0x0058:
                r2 = r7
                goto L_0x002e
            L_0x005a:
                sx3.C64197v.m75542k()     // Catch:{ all -> 0x0075 }
                throw r8     // Catch:{ all -> 0x0075 }
            L_0x005e:
                monitor-exit(r1)
                if (r5 == r4) goto L_0x0078
                if (r5 <= 0) goto L_0x0078
                wg1.i1 r0 = r10.f189835d
                java.util.ArrayList<wg1.i1$c> r0 = r0.f189798B
                int r0 = r0.size()
                if (r5 >= r0) goto L_0x0078
                wg1.i1 r0 = r10.f189835d
                wg1.i1$a r0 = r0.f189799C
                r0.notifyItemChanged(r5)
                goto L_0x0078
            L_0x0075:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x0078:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.C66028j.invoke():java.lang.Object");
        }
    }

    /* renamed from: wg1.i1$k */
    public static final class C66029k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86525c f189837d;

        /* renamed from: e */
        public final /* synthetic */ C66018i1 f189838e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66029k(C86525c cVar, C66018i1 i1Var) {
            super(0);
            this.f189837d = cVar;
            this.f189838e = i1Var;
        }

        public Object invoke() {
            int i;
            C86524b bVar;
            C86525c cVar = this.f189837d;
            if (!(cVar == null || cVar.f251382a == null)) {
                C66018i1 i1Var = this.f189838e;
                if (i1Var.f189801E != i1Var.f189810o) {
                    ArrayList<C66021c> arrayList = i1Var.f189798B;
                    synchronized (arrayList) {
                        int i2 = 0;
                        Iterator<C66021c> it = arrayList.iterator();
                        i = -1;
                        while (it.hasNext()) {
                            C66021c next = it.next();
                            int i3 = i2 + 1;
                            String str = null;
                            if (i2 >= 0) {
                                C66021c cVar2 = next;
                                C86524b bVar2 = cVar.f251382a;
                                String str2 = bVar2 != null ? bVar2.f251380i : null;
                                C86525c cVar3 = cVar2.f189825a;
                                if (!(cVar3 == null || (bVar = cVar3.f251382a) == null)) {
                                    str = bVar.f251380i;
                                }
                                if (Util.isEqual(str2, str)) {
                                    i = i2;
                                }
                                i2 = i3;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                    }
                    if (i != -1 && i > 0 && i < this.f189838e.f189798B.size()) {
                        this.f189838e.f189798B.remove(i);
                        this.f189838e.f189799C.notifyItemRemoved(i);
                    }
                    if (this.f189838e.f189798B.isEmpty()) {
                        C66018i1 i1Var2 = this.f189838e;
                        i1Var2.mo90056p(i1Var2.f189808j);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.i1$l */
    public static final class C66030l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66018i1 f189839d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66030l(C66018i1 i1Var) {
            super(0);
            this.f189839d = i1Var;
        }

        public Object invoke() {
            if (this.f189839d.f189798B.isEmpty()) {
                C66018i1 i1Var = this.f189839d;
                i1Var.mo90056p(i1Var.f189808j);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.i1$m */
    public static final class C66031m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86525c f189840d;

        /* renamed from: e */
        public final /* synthetic */ C66018i1 f189841e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66031m(C86525c cVar, C66018i1 i1Var) {
            super(0);
            this.f189840d = cVar;
            this.f189841e = i1Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
            r9 = r9.f251382a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r11 = this;
                ej0.c r0 = r11.f189840d
                if (r0 == 0) goto L_0x006d
                ej0.b r1 = r0.f251382a
                if (r1 == 0) goto L_0x006d
                wg1.i1 r1 = r11.f189841e
                int r2 = r1.f189801E
                int r3 = r1.f189810o
                if (r2 == r3) goto L_0x006d
                java.util.ArrayList<wg1.i1$c> r1 = r1.f189798B
                monitor-enter(r1)
                r2 = 0
                java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x006a }
                r4 = -1
                r5 = -1
            L_0x001a:
                boolean r6 = r3.hasNext()     // Catch:{ all -> 0x006a }
                if (r6 == 0) goto L_0x004c
                java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x006a }
                int r7 = r2 + 1
                r8 = 0
                if (r2 < 0) goto L_0x0048
                wg1.i1$c r6 = (wg1.C66018i1.C66021c) r6     // Catch:{ all -> 0x006a }
                ej0.c r9 = r6.f189825a     // Catch:{ all -> 0x006a }
                if (r9 == 0) goto L_0x0036
                ej0.b r9 = r9.f251382a     // Catch:{ all -> 0x006a }
                if (r9 == 0) goto L_0x0036
                java.lang.String r9 = r9.f251380i     // Catch:{ all -> 0x006a }
                goto L_0x0037
            L_0x0036:
                r9 = r8
            L_0x0037:
                ej0.b r10 = r0.f251382a     // Catch:{ all -> 0x006a }
                if (r10 == 0) goto L_0x003d
                java.lang.String r8 = r10.f251380i     // Catch:{ all -> 0x006a }
            L_0x003d:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r8)     // Catch:{ all -> 0x006a }
                if (r8 == 0) goto L_0x0046
                r6.f189825a = r0     // Catch:{ all -> 0x006a }
                r5 = r2
            L_0x0046:
                r2 = r7
                goto L_0x001a
            L_0x0048:
                sx3.C64197v.m75542k()     // Catch:{ all -> 0x006a }
                throw r8     // Catch:{ all -> 0x006a }
            L_0x004c:
                monitor-exit(r1)
                wg1.i1 r0 = r11.f189841e
                int r1 = r0.f189809n
                r0.mo90056p(r1)
                if (r5 == r4) goto L_0x006d
                if (r5 <= 0) goto L_0x006d
                wg1.i1 r0 = r11.f189841e
                java.util.ArrayList<wg1.i1$c> r0 = r0.f189798B
                int r0 = r0.size()
                if (r5 >= r0) goto L_0x006d
                wg1.i1 r0 = r11.f189841e
                wg1.i1$a r0 = r0.f189799C
                r0.notifyItemChanged(r5)
                goto L_0x006d
            L_0x006a:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            L_0x006d:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.C66031m.invoke():java.lang.Object");
        }
    }

    public C66018i1(View view, C58124b bVar, MMActivity mMActivity, C65986c1 c1Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f189802d = view;
        this.f189803e = bVar;
        this.f189804f = mMActivity;
        this.f189805g = c1Var;
        this.f189811p = (LiveBottomSheetPanel) view.findViewById(C0966R.C0970id.dil);
        this.f189812q = view.findViewById(C0966R.C0970id.diy);
        this.f189813r = view.findViewById(C0966R.C0970id.dij);
        this.f189814s = view.findViewById(C0966R.C0970id.din);
        this.f189815t = view.findViewById(C0966R.C0970id.dix);
        this.f189816u = view.findViewById(C0966R.C0970id.div);
        this.f189817v = (TextView) view.findViewById(C0966R.C0970id.diw);
        this.f189818w = view.findViewById(C0966R.C0970id.dit);
        this.f189819x = (RecyclerView) view.findViewById(C0966R.C0970id.diu);
        this.f189820y = view.findViewById(C0966R.C0970id.diq);
        this.f189821z = (TextView) view.findViewById(C0966R.C0970id.dip);
        this.f189797A = (TextView) view.findViewById(C0966R.C0970id.dio);
        this.f189798B = new ArrayList<>();
        this.f189799C = new C66019a();
        this.f189801E = -1;
    }

    /* renamed from: D0 */
    public void mo90023D0(C86525c cVar) {
        C61926c.m72668M(new C66028j(this, cVar));
    }

    /* renamed from: L */
    public void mo90024L() {
        C61926c.m72668M(new C66030l(this));
    }

    /* renamed from: W */
    public void mo90025W(C86525c cVar) {
        C61926c.m72668M(new C66027i(this, cVar));
    }

    /* JADX WARNING: type inference failed for: r1v17, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90026Y() {
        /*
            r8 = this;
            android.view.View r0 = r8.f189802d
            android.content.Context r0 = r0.getContext()
            android.graphics.Point r0 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r0)
            int r0 = r0.y
            float r0 = (float) r0
            android.view.View r1 = r8.f189802d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165337(0x7f070099, float:1.7944888E38)
            float r1 = r1.getDimension(r2)
            float r0 = r0 - r1
            int r0 = (int) r0
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r1 = r8.f189811p
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.View r2 = r8.f189802d
            android.content.Context r2 = r2.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.y
            r1.width = r2
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r1 = r8.f189811p
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r0
            android.view.View r1 = r8.f189802d
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165363(0x7f0700b3, float:1.794494E38)
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            int r0 = r0 - r1
            android.view.View r1 = r8.f189816u
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x005d
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            goto L_0x005e
        L_0x005d:
            r1 = r3
        L_0x005e:
            r4 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            if (r1 != 0) goto L_0x0066
            goto L_0x006c
        L_0x0066:
            double r6 = (double) r0
            double r6 = r6 * r4
            int r2 = (int) r6
            r1.topMargin = r2
        L_0x006c:
            android.view.View r1 = r8.f189815t
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x0079
            r3 = r1
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
        L_0x0079:
            if (r3 != 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            double r0 = (double) r0
            double r0 = r0 * r4
            int r0 = (int) r0
            r3.topMargin = r0
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.mo90026Y():void");
    }

    /* renamed from: a */
    public void mo90027a() {
        this.f189819x.setLayoutManager(new LinearLayoutManager(this.f189802d.getContext()));
        this.f189819x.setAdapter(this.f189799C);
        this.f189814s.setOnClickListener(new C66022d(this));
        this.f189813r.setOnClickListener(new C66023e(this));
        this.f189797A.setOnClickListener(new C66024f(this));
        TextView textView = (TextView) this.f189802d.findViewById(C0966R.C0970id.f358122dj1);
        if (textView != null) {
            C7919x.m8091a(textView);
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo90028c0() {
        /*
            r8 = this;
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r8.f189811p
            android.view.View r1 = r8.f189802d
            android.content.Context r1 = r1.getContext()
            android.graphics.Point r1 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r1)
            int r1 = r1.y
            float r1 = (float) r1
            r0.setTranslationY(r1)
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r0 = r8.f189811p
            int r1 = r0.getPaddingLeft()
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r2 = r8.f189811p
            int r2 = r2.getPaddingTop()
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r3 = r8.f189811p
            int r3 = r3.getPaddingRight()
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r4 = r8.f189811p
            int r4 = r4.getPaddingBottom()
            android.view.View r5 = r8.f189802d
            android.content.Context r5 = r5.getContext()
            int r5 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r5)
            int r4 = r4 + r5
            r0.setPadding(r1, r2, r3, r4)
            android.view.View r0 = r8.f189802d
            android.content.Context r0 = r0.getContext()
            r1 = 416(0x1a0, float:5.83E-43)
            int r0 = kg3.C76577a.m92151b(r0, r1)
            android.view.View r1 = r8.f189816u
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            r3 = 0
            if (r2 == 0) goto L_0x0052
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
            goto L_0x0053
        L_0x0052:
            r1 = r3
        L_0x0053:
            r4 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            if (r1 != 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            double r6 = (double) r0
            double r6 = r6 * r4
            int r2 = (int) r6
            r1.topMargin = r2
        L_0x0061:
            android.view.View r1 = r8.f189815t
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x006e
            r3 = r1
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
        L_0x006e:
            if (r3 != 0) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            double r0 = (double) r0
            double r0 = r0 * r4
            int r0 = (int) r0
            r3.topMargin = r0
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.mo90028c0():void");
    }

    /* renamed from: e0 */
    public void mo90029e0(int i) {
        String str = this.f189806h;
        Log.m105924i(str, "onLinkError errCode:" + i);
        ((C54116w) C86312j.m106911c(C54116w.class)).Mx0(C54067f0.C0055f.CAST_SCREEN_BREAK);
    }

    public MMFragmentActivity getActivity() {
        return this.f189804f;
    }

    /* renamed from: n */
    public void mo90030n(C86525c cVar) {
        C61926c.m72668M(new C66025g(cVar, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x05a5, code lost:
        r6 = r6.f251382a;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90056p(int r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r0.f189801E
            if (r1 == r2) goto L_0x05b6
            r0.f189801E = r1
            r2 = 8
            r3 = 0
            if (r1 != 0) goto L_0x015c
            android.view.View r1 = r0.f189812q
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r7 = "refreshByMode"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r6 = "refreshByMode"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r1
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r1 = r0.f189815t
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r5)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r1 = r0.f189816u
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r7 = "refreshByMode"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r6 = "refreshByMode"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r1
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r1 = r0.f189818w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r5)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r1 = r0.f189820y
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r2)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r7 = "refreshByMode"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r12.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r6 = "refreshByMode"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            wg1.c1 r1 = r0.f189805g
            if (r1 == 0) goto L_0x05b6
            r1.mo90019V0()
            goto L_0x05b6
        L_0x015c:
            int r4 = r0.f189808j
            r5 = 1
            if (r1 != r4) goto L_0x0301
            android.view.View r1 = r0.f189812q
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f189815t
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r6)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r16 = "refreshByMode"
            java.lang.String r17 = "(I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r15 = "refreshByMode"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r0.f189816u
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f189818w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r6)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r16 = "refreshByMode"
            java.lang.String r17 = "(I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r15 = "refreshByMode"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r0.f189820y
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r2)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r4.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.text.SpannableString r1 = new android.text.SpannableString
            android.view.View r2 = r0.f189802d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131827127(0x7f1119b7, float:1.9287158E38)
            java.lang.String r2 = r2.getString(r3)
            r1.<init>(r2)
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            java.lang.String r14 = "，"
            r13 = r1
            int r2 = z04.C112550d0.m153769E(r13, r14, r15, r16, r17, r18)
            r3 = -1
            if (r2 == r3) goto L_0x02f2
            if (r2 <= 0) goto L_0x02f2
            int r3 = r1.length()
            int r3 = r3 - r5
            if (r2 >= r3) goto L_0x02f2
            wg1.i1$o r3 = new wg1.i1$o
            r3.<init>()
            int r2 = r2 + r5
            int r4 = r1.length()
            r5 = 33
            r1.setSpan(r3, r2, r4, r5)
            android.widget.TextView r2 = r0.f189817v
            r2.setText(r1)
            android.widget.TextView r1 = r0.f189817v
            wg1.i1$n r2 = new wg1.i1$n
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x02f2:
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.w r1 = (ak1.C54116w) r1
            ak1.f0$f r2 = ak1.C54067f0.C0055f.CAST_SCREEN_TIMEOUT
            r1.Mx0(r2)
            goto L_0x05b6
        L_0x0301:
            int r4 = r0.f189809n
            if (r1 != r4) goto L_0x044a
            android.view.View r1 = r0.f189812q
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r5)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f189815t
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r5)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r16 = "refreshByMode"
            java.lang.String r17 = "(I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r15 = "refreshByMode"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r0.f189816u
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r7 = "refreshByMode"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r6 = "refreshByMode"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r1
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r1 = r0.f189818w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r4.mo10233c(r5)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r14 = "refreshByMode"
            java.lang.String r15 = "(I)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r1
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r13 = "refreshByMode"
            java.lang.String r14 = "(I)V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            android.view.View r1 = r0.f189820y
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r2)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r7 = "refreshByMode"
            java.lang.String r8 = "(I)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r1
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r2 = r12.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r6 = "refreshByMode"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x05b6
        L_0x044a:
            int r4 = r0.f189810o
            if (r1 != r4) goto L_0x05b6
            android.view.View r1 = r0.f189812q
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f189815t
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r6)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r16 = "refreshByMode"
            java.lang.String r17 = "(I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r15 = "refreshByMode"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r0.f189816u
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r6)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.setVisibility(r4)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r1 = r0.f189818w
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.mo10233c(r2)
            java.lang.Object[] r14 = r4.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r16 = "refreshByMode"
            java.lang.String r17 = "(I)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r1
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r2 = r4.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r15 = "refreshByMode"
            java.lang.String r16 = "(I)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.view.View r1 = r0.f189820y
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r7 = r2.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r9 = "refreshByMode"
            java.lang.String r10 = "(I)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback"
            java.lang.String r8 = "refreshByMode"
            java.lang.String r9 = "(I)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.widget.TextView r1 = r0.f189821z
            android.view.View r2 = r0.f189802d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131827125(0x7f1119b5, float:1.9287154E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            ej0.c r6 = r0.f189800D
            if (r6 == 0) goto L_0x05ac
            ej0.b r6 = r6.f251382a
            if (r6 == 0) goto L_0x05ac
            java.lang.String r6 = r6.f251378g
            goto L_0x05ad
        L_0x05ac:
            r6 = 0
        L_0x05ad:
            r5[r3] = r6
            java.lang.String r2 = r2.getString(r4, r5)
            r1.setText(r2)
        L_0x05b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66018i1.mo90056p(int):void");
    }

    /* renamed from: q */
    public void mo90031q(C86525c cVar) {
        C61926c.m72668M(new C66029k(cVar, this));
    }

    /* renamed from: t */
    public void mo90032t(C86525c cVar) {
        C61926c.m72668M(new C66031m(cVar, this));
    }

    /* renamed from: z0 */
    public void mo90033z0(C86525c cVar) {
        C61926c.m72668M(new C66026h(this, cVar));
    }
}
