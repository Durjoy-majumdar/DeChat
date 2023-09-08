package p61;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.emoji.model.C93104c0;
import com.tencent.p014mm.plugin.emoji.model.C93116n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96984r2;
import eb0.C75592q0;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p61.C100652i;
import p61.C100660k;
import q61.C101046c;
import q61.C101047d;
import rx3.C13598b0;
import sx3.C110818d0;
import x51.C102562g;

/* renamed from: p61.m */
public class C100664m extends RecyclerView.C16613e<C100657j<?>> {

    /* renamed from: d */
    public final Context f294886d;

    /* renamed from: e */
    public final C100668o f294887e;

    /* renamed from: f */
    public final String f294888f = "MicroMsg.EmojiStoreV3HomeMainAdapter";

    /* renamed from: g */
    public final ArrayList<C100684y> f294889g = new ArrayList<>();

    /* renamed from: h */
    public C100640a0 f294890h;

    /* renamed from: i */
    public HashMap<String, Integer> f294891i = new HashMap<>();

    /* renamed from: j */
    public Set<Integer> f294892j = new LinkedHashSet();

    /* renamed from: n */
    public List<C100663l> f294893n = new ArrayList();

    /* renamed from: o */
    public C32226l<? super C101046c, C13598b0> f294894o;

    /* renamed from: p */
    public C32227p<? super Integer, ? super C100639a, C13598b0> f294895p;

    /* renamed from: q */
    public C32226l<? super C101047d, C13598b0> f294896q;

    /* renamed from: r */
    public C93104c0 f294897r;

    /* renamed from: p61.m$a */
    public static final class C100665a extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ C100664m f294898d;

        public C100665a(C100664m mVar) {
            this.f294898d = mVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                Log.m105918d(this.f294898d.f294888f, "rv idle reportExposeData 18662, 12875");
                C100664m mVar = this.f294898d;
                if (!(mVar.f294894o == null || mVar.f294896q == null)) {
                    mVar.mo140099G4(recyclerView.getLayoutManager());
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeAdapter$onAttachedToRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    public C100664m(Context context, C100668o oVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(oVar, "singleProductAlbumItemSizeResolver");
        this.f294886d = context;
        this.f294887e = oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: p61.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p61.C100663l mo140098F4(int r6) {
        /*
            r5 = this;
            java.util.List<p61.l> r0 = r5.f294893n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            r0 = 0
            r3 = r1
            r2 = 0
        L_0x000f:
            java.util.List<p61.l> r4 = r5.f294893n
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0032
            java.util.List<p61.l> r3 = r5.f294893n
            int r4 = r2 + 1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r2 = r3.get(r2)
            r3 = r2
            p61.l r3 = (p61.C100663l) r3
            int r2 = r3.f294883a
            if (r6 <= r2) goto L_0x0030
            int r2 = r3.f294884b
            if (r6 >= r2) goto L_0x0030
            r0 = 1
            goto L_0x0032
        L_0x0030:
            r2 = r4
            goto L_0x000f
        L_0x0032:
            if (r0 != 0) goto L_0x0035
            return r1
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.C100664m.mo140098F4(int):p61.l");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00dc, code lost:
        r15 = r14.f301983b;
     */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo140099G4(androidx.recyclerview.widget.RecyclerView.LayoutManager r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = r0.f294888f
            java.lang.String r2 = "reportExposeData failed, recyclerview layoutManager null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            return
        L_0x000f:
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x01a9
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r2 = r1.mo16957C()
            int r1 = r1.mo16959E()
            java.lang.String r3 = r0.f294888f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "visible firstPos:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " lastPos:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            int r3 = r1 - r2
            if (r3 > 0) goto L_0x0041
            return
        L_0x0041:
            my3.j r3 = new my3.j
            r3.<init>(r2, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            int r3 = r3.f175175e
            if (r2 > r3) goto L_0x019d
            r6 = 0
        L_0x0055:
            java.util.ArrayList<p61.y> r7 = r0.f294889g
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r8 = "itemList[pos]"
            gy3.C87412m.m108593f(r7, r8)
            p61.y r7 = (p61.C100684y) r7
            boolean r8 = r7 instanceof p61.C100683x
            java.lang.String r9 = ""
            r10 = 0
            r11 = 1
            if (r8 == 0) goto L_0x00f3
            java.util.List<p61.l> r8 = r0.f294893n
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r11
            if (r8 == 0) goto L_0x00f3
            java.util.List<p61.l> r8 = r0.f294893n
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r6)
            p61.l r8 = (p61.C100663l) r8
            r12 = r6
        L_0x007f:
            java.util.List<p61.l> r13 = r0.f294893n
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x00ab
            int r13 = r8.f294883a
            if (r2 <= r13) goto L_0x0093
            int r13 = r8.f294884b
            if (r2 >= r13) goto L_0x0093
            r6 = r12
            goto L_0x00ab
        L_0x0093:
            int r12 = r12 + 1
            java.util.List<p61.l> r13 = r0.f294893n
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            int r13 = r13.size()
            if (r12 < r13) goto L_0x00a0
            goto L_0x00ab
        L_0x00a0:
            java.util.List<p61.l> r8 = r0.f294893n
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r12)
            p61.l r8 = (p61.C100663l) r8
            goto L_0x007f
        L_0x00ab:
            int r12 = r8.f294885c
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r13 = r1.containsKey(r13)
            if (r13 != 0) goto L_0x00c3
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            r1.put(r13, r14)
        L_0x00c3:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r12 = r1.get(r12)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x00f3
            q61.b r13 = new q61.b
            int r8 = r8.f294883a
            int r8 = r2 - r8
            r14 = r7
            p61.x r14 = (p61.C100683x) r14
            x51.g r14 = r14.f294996a
            if (r14 == 0) goto L_0x00e3
            te3.o80 r15 = r14.f301983b
            if (r15 == 0) goto L_0x00e3
            java.lang.String r15 = r15.f298996f
            goto L_0x00e4
        L_0x00e3:
            r15 = r10
        L_0x00e4:
            if (r15 != 0) goto L_0x00e7
            r15 = r9
        L_0x00e7:
            if (r14 == 0) goto L_0x00ec
            te3.o80 r14 = r14.f301983b
            goto L_0x00ed
        L_0x00ec:
            r14 = r10
        L_0x00ed:
            r13.<init>(r8, r15, r14)
            r12.add(r13)
        L_0x00f3:
            boolean r8 = r7 instanceof p61.C100651h0
            if (r8 == 0) goto L_0x0184
            r8 = r7
            p61.h0 r8 = (p61.C100651h0) r8
            te3.a80 r12 = r8.f294865b
            if (r12 == 0) goto L_0x0101
            int r12 = r12.f297841g
            goto L_0x0102
        L_0x0101:
            r12 = 0
        L_0x0102:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            boolean r13 = r4.containsKey(r13)
            if (r13 != 0) goto L_0x013a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            q61.d r15 = new q61.d
            r24 = r6
            long r5 = (long) r12
            te3.a80 r14 = r8.f294865b
            if (r14 == 0) goto L_0x011c
            java.lang.String r14 = r14.f297839e
            goto L_0x011d
        L_0x011c:
            r14 = r10
        L_0x011d:
            if (r14 != 0) goto L_0x0122
            r17 = r9
            goto L_0x0124
        L_0x0122:
            r17 = r14
        L_0x0124:
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 60
            r23 = 0
            r14 = r15
            r9 = r15
            r15 = r5
            r14.<init>(r15, r17, r18, r19, r20, r21, r22, r23)
            r4.put(r13, r9)
            goto L_0x013c
        L_0x013a:
            r24 = r6
        L_0x013c:
            int r5 = r8.f294866c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Object r6 = r4.get(r6)
            q61.d r6 = (q61.C101047d) r6
            if (r6 == 0) goto L_0x0186
            if (r11 > r5) goto L_0x017c
            r9 = 1
        L_0x014d:
            if (r9 == r11) goto L_0x015b
            java.lang.StringBuilder r12 = r6.f295840d
            java.lang.String r13 = "#"
            r12.append(r13)
            java.lang.StringBuilder r12 = r6.f295839c
            r12.append(r13)
        L_0x015b:
            java.lang.StringBuilder r12 = r6.f295840d
            r12.append(r9)
            java.lang.StringBuilder r12 = r6.f295839c
            java.util.List<p61.j0> r13 = r8.f294864a
            int r14 = r9 + -1
            java.lang.Object r13 = r13.get(r14)
            p61.j0 r13 = (p61.C100659j0) r13
            te3.k70 r13 = r13.f294877a
            if (r13 == 0) goto L_0x0173
            java.lang.String r13 = r13.f298586d
            goto L_0x0174
        L_0x0173:
            r13 = r10
        L_0x0174:
            r12.append(r13)
            if (r9 == r5) goto L_0x017c
            int r9 = r9 + 1
            goto L_0x014d
        L_0x017c:
            fy3.l<? super q61.d, rx3.b0> r5 = r0.f294896q
            if (r5 == 0) goto L_0x0186
            r5.invoke(r6)
            goto L_0x0186
        L_0x0184:
            r24 = r6
        L_0x0186:
            boolean r5 = r7 instanceof p61.C100639a
            if (r5 == 0) goto L_0x0195
            fy3.p<? super java.lang.Integer, ? super p61.a, rx3.b0> r5 = r0.f294895p
            if (r5 == 0) goto L_0x0195
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5.invoke(r6, r7)
        L_0x0195:
            if (r2 == r3) goto L_0x019d
            int r2 = r2 + 1
            r6 = r24
            goto L_0x0055
        L_0x019d:
            fy3.l<? super q61.c, rx3.b0> r2 = r0.f294894o
            if (r2 == 0) goto L_0x01a9
            q61.c r3 = new q61.c
            r3.<init>(r1)
            r2.invoke(r3)
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.C100664m.mo140099G4(androidx.recyclerview.widget.RecyclerView$LayoutManager):void");
    }

    /* renamed from: O4 */
    public final void mo140100O4(C102562g gVar, String str, int i) {
        if (gVar != null && str != null && !C87412m.m108589b(str, "")) {
            gVar.mo142189b(i);
            C93104c0 c0Var = this.f294897r;
            if (c0Var != null) {
                ((C93116n) c0Var).mo127609a(str, i);
            }
        }
    }

    /* renamed from: g5 */
    public final void mo140101g5(boolean z) {
        Object obj = z ? C100652i.C100654b.f294869a : C100652i.C100655c.f294870a;
        for (Number intValue : this.f294892j) {
            int intValue2 = intValue.intValue();
            if (this.f294889g.get(intValue2).getType() == 5) {
                notifyItemChanged(intValue2, obj);
            }
        }
    }

    public int getItemCount() {
        return this.f294889g.size();
    }

    public int getItemViewType(int i) {
        C100684y yVar = (C100684y) C110818d0.m150917O(this.f294889g, i);
        if (yVar != null) {
            return yVar.getType();
        }
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.mo17043c(new C100665a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        r9 = r9.f301983b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r9, int r10) {
        /*
            r8 = this;
            p61.j r9 = (p61.C100657j) r9
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r9, r0)
            java.util.ArrayList<p61.y> r0 = r8.f294889g
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r1 = "itemList[position]"
            gy3.C87412m.m108593f(r0, r1)
            p61.y r0 = (p61.C100684y) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.mo140091y(r0, r1)
            int r9 = r0.getType()
            r1 = 1
            if (r9 == r1) goto L_0x0066
            r2 = 2
            if (r9 == r2) goto L_0x004e
            r0 = 5
            if (r9 == r0) goto L_0x0044
            r0 = 6
            if (r9 == r0) goto L_0x002e
            goto L_0x0080
        L_0x002e:
            java.util.List<p61.l> r9 = r8.f294893n
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ r1
            if (r9 == 0) goto L_0x0080
            java.util.List<p61.l> r9 = r8.f294893n
            java.lang.Object r9 = sx3.C110818d0.m150923U(r9)
            p61.l r9 = (p61.C100663l) r9
            r9.f294884b = r10
            goto L_0x0080
        L_0x0044:
            java.util.Set<java.lang.Integer> r9 = r8.f294892j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.add(r10)
            goto L_0x0080
        L_0x004e:
            p61.w r0 = (p61.C100682w) r0
            int r9 = r0.f294995b
            java.util.List<p61.l> r0 = r8.f294893n
            p61.l r7 = new p61.l
            r3 = 0
            int r4 = r9 + 10000
            r5 = 2
            r6 = 0
            r1 = r7
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r7)
            goto L_0x0080
        L_0x0066:
            p61.x r0 = (p61.C100683x) r0
            x51.g r9 = r0.f294996a
            if (r9 == 0) goto L_0x0073
            te3.o80 r9 = r9.f301983b
            if (r9 == 0) goto L_0x0073
            java.lang.String r9 = r9.f298994d
            goto L_0x0074
        L_0x0073:
            r9 = 0
        L_0x0074:
            if (r9 != 0) goto L_0x0077
            goto L_0x0080
        L_0x0077:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r8.f294891i
            r0.put(r9, r10)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p61.C100664m.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        LayoutInflater b = C85868k2.m106137b(viewGroup.getContext());
        if (i == 1) {
            View inflate = b.inflate(C0966R.C0971layout.cki, viewGroup, false);
            Context context = this.f294886d;
            C87412m.m108593f(inflate, "itemView");
            return new C100666n(context, inflate, (List) null, false, false, this.f294890h, 28, (C8480h) null);
        } else if (i == 2) {
            View inflate2 = b.inflate(C0966R.C0971layout.ckh, viewGroup, false);
            C87412m.m108593f(inflate2, "itemView");
            return new C100669p(inflate2, this.f294890h);
        } else if (i == 3) {
            View inflate3 = b.inflate(C0966R.C0971layout.ckl, viewGroup, false);
            Context context2 = this.f294886d;
            C87412m.m108593f(inflate3, "itemView");
            return new C100679u(context2, inflate3, this.f294890h, this.f294887e);
        } else if (i != 6) {
            View inflate4 = b.inflate(C0966R.C0971layout.ck_, viewGroup, false);
            Context context3 = this.f294886d;
            C87412m.m108593f(inflate4, "itemView");
            return new C100649h(context3, inflate4, this.f294890h);
        } else {
            View inflate5 = b.inflate(C0966R.C0971layout.ckg, viewGroup, false);
            Context context4 = this.f294886d;
            C87412m.m108593f(inflate5, "itemView");
            return new C100670q(context4, inflate5, this.f294890h);
        }
    }

    /* renamed from: u5 */
    public final void mo140102u5(C100660k kVar) {
        C87412m.m108594g(kVar, "event");
        String a = kVar.mo140094a();
        Integer num = this.f294891i.get(a);
        if (num == null || num.intValue() >= this.f294889g.size()) {
            String str = this.f294888f;
            Log.m105924i(str, "updateListItemProgress failed, cache pos error, productId:" + a);
            return;
        }
        C100684y yVar = this.f294889g.get(num.intValue());
        C96984r2 r2Var = null;
        C100683x xVar = yVar instanceof C100683x ? (C100683x) yVar : null;
        C102562g gVar = xVar != null ? xVar.f294996a : null;
        boolean z = true;
        if (kVar instanceof C100660k.C100662b) {
            mo140100O4(gVar, a, ((C100660k.C100662b) kVar).f294882b);
            if (gVar == null || gVar.f301987f != -1) {
                z = false;
            }
            if (z) {
                String str2 = this.f294888f;
                Log.m105924i(str2, "force refresh emotionItem status, productId:" + a);
                boolean z2 = C75592q0.m90796z();
                C93104c0 c0Var = this.f294897r;
                if (c0Var != null) {
                    r2Var = ((C93116n) c0Var).mo127610b(a);
                }
                C93116n.C93117a aVar = C93116n.f268258c;
                gVar.mo142188a(z2, r2Var, C93116n.f268259d.containsKey(a));
            }
        } else if (kVar instanceof C100660k.C100661a) {
            int i = ((C100660k.C100661a) kVar).f294880b;
            if (i < 0 || i >= 100) {
                z = false;
            }
            if (z) {
                mo140100O4(gVar, a, 6);
                if (gVar != null) {
                    gVar.f301986e = i;
                }
            }
            if (i >= 100) {
                mo140100O4(gVar, a, 7);
            }
        }
        notifyItemChanged(num.intValue(), kVar);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C100657j jVar = (C100657j) zVar;
        C87412m.m108594g(jVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (!list.isEmpty()) {
            C100684y yVar = this.f294889g.get(i);
            C87412m.m108593f(yVar, "itemList[position]");
            jVar.mo140091y(yVar, list);
            return;
        }
        super.onBindViewHolder(jVar, i, list);
    }
}
