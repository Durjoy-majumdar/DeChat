package op1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import er1.C58739j4;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ok1.C62042e;
import rx3.C13598b0;
import sk1.C63965x;
import sx3.C36907w;
import sx3.C64197v;

/* renamed from: op1.b */
public final class C62080b extends RecyclerView.C16613e<C62082b> {

    /* renamed from: d */
    public boolean f176505d;

    /* renamed from: e */
    public ArrayList<C62081a> f176506e;

    /* renamed from: f */
    public final ArrayList<Long> f176507f;

    /* renamed from: g */
    public List<? extends C0740i2> f176508g;

    /* renamed from: h */
    public FinderLiveShoppingPriceView.C56321b f176509h;

    /* renamed from: i */
    public C32228q<? super View, ? super Integer, ? super C0740i2, C13598b0> f176510i;

    /* renamed from: j */
    public C32227p<? super Long, ? super String, C13598b0> f176511j;

    /* renamed from: op1.b$a */
    public static final class C62081a {

        /* renamed from: a */
        public final C63965x f176512a;

        /* renamed from: b */
        public boolean f176513b;

        public C62081a(C63965x xVar, boolean z, int i, C8480h hVar) {
            z = (i & 2) != 0 ? false : z;
            C87412m.m108594g(xVar, "productInfo");
            this.f176512a = xVar;
            this.f176513b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C62081a)) {
                return false;
            }
            C62081a aVar = (C62081a) obj;
            return C87412m.m108589b(this.f176512a, aVar.f176512a) && this.f176513b == aVar.f176513b;
        }

        public int hashCode() {
            int hashCode = this.f176512a.hashCode() * 31;
            boolean z = this.f176513b;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "EditData(productInfo=" + this.f176512a + ", select=" + this.f176513b + ')';
        }
    }

    /* renamed from: op1.b$b */
    public final class C62082b extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f176514A;

        /* renamed from: B */
        public TextView f176515B;

        /* renamed from: C */
        public TextView f176516C;

        /* renamed from: D */
        public TextView f176517D;

        /* renamed from: E */
        public TextView f176518E;

        /* renamed from: F */
        public TextView f176519F;

        /* renamed from: G */
        public View f176520G;

        /* renamed from: H */
        public TextView f176521H;

        /* renamed from: I */
        public View f176522I;

        /* renamed from: J */
        public FinderLiveShoppingPriceView f176523J;

        /* renamed from: K */
        public ImageView f176524K;

        /* renamed from: z */
        public CheckBox f176525z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62082b(C62080b bVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f176525z = (CheckBox) view.findViewById(C0966R.C0970id.jji);
            this.f176514A = (ImageView) view.findViewById(C0966R.C0970id.i3t);
            this.f176515B = (TextView) view.findViewById(C0966R.C0970id.f358967i42);
            this.f176516C = (TextView) view.findViewById(C0966R.C0970id.i3e);
            this.f176517D = (TextView) view.findViewById(C0966R.C0970id.lwl);
            this.f176518E = (TextView) view.findViewById(C0966R.C0970id.i45);
            this.f176519F = (TextView) view.findViewById(C0966R.C0970id.f358968i43);
            this.f176520G = view.findViewById(C0966R.C0970id.i44);
            this.f176521H = (TextView) view.findViewById(C0966R.C0970id.nxz);
            this.f176522I = view.findViewById(C0966R.C0970id.nxy);
            this.f176523J = (FinderLiveShoppingPriceView) view.findViewById(C0966R.C0970id.i2k);
            this.f176524K = (ImageView) view.findViewById(C0966R.C0970id.lwk);
        }
    }

    /* renamed from: op1.b$c */
    public static final class C62083c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62080b f176526d;

        /* renamed from: e */
        public final /* synthetic */ C62082b f176527e;

        /* renamed from: f */
        public final /* synthetic */ int f176528f;

        /* renamed from: g */
        public final /* synthetic */ C62081a f176529g;

        public C62083c(C62080b bVar, C62082b bVar2, int i, C62081a aVar) {
            this.f176526d = bVar;
            this.f176527e = bVar2;
            this.f176528f = i;
            this.f176529g = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62080b bVar = this.f176526d;
            C62082b bVar2 = this.f176527e;
            int i = this.f176528f;
            C62081a aVar = this.f176529g;
            bVar.getClass();
            boolean z = true;
            boolean z2 = !aVar.f176513b;
            aVar.f176513b = z2;
            CheckBox checkBox = bVar2.f176525z;
            if (!z2) {
                z = false;
            }
            checkBox.setChecked(z);
            C32228q<? super View, ? super Integer, ? super C0740i2, C13598b0> qVar = bVar.f176510i;
            if (qVar != null) {
                View view2 = bVar2.f44854d;
                C87412m.m108593f(view2, "holder.itemView");
                qVar.invoke(view2, Integer.valueOf(i), aVar.f176512a);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C62080b(boolean z, int i, C8480h hVar) {
        this.f176505d = (i & 1) != 0 ? true : z;
        this.f176506e = new ArrayList<>();
        this.f176507f = new ArrayList<>();
        FinderLiveShoppingPriceView.C56321b bVar = FinderLiveShoppingPriceView.f160997p;
        bVar.f161007c = false;
        bVar.f161010f = false;
        this.f176509h = bVar;
    }

    /* renamed from: F4 */
    public final List<Long> mo87145F4() {
        ArrayList<C62081a> arrayList = this.f176506e;
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C62081a aVar : arrayList) {
            arrayList2.add(Long.valueOf(aVar.f176512a.f181347t));
        }
        return arrayList2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100 A[SYNTHETIC] */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(op1.C62080b.C62082b r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.String r3 = "holder"
            gy3.C87412m.m108594g(r1, r3)
            java.util.ArrayList<op1.b$a> r3 = r0.f176506e
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "dataList[position]"
            gy3.C87412m.m108593f(r3, r4)
            op1.b$a r3 = (op1.C62080b.C62081a) r3
            sk1.x r4 = r3.f176512a
            boolean r5 = r3.f176513b
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r9 = r8.mo62446e(r7)
            bl3.c r9 = r9.mo62447c(r6)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11870V()
            pl1.f r10 = new pl1.f
            java.util.LinkedList<java.lang.String> r11 = r4.f181349v
            java.lang.String r12 = "item.img_urls"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            r13 = 2
            r10.<init>(r11, r12, r13, r12)
            android.widget.ImageView r11 = r1.f176514A
            java.lang.String r13 = "holder.productImg"
            gy3.C87412m.m108593f(r11, r13)
            pl1.e0$a r13 = pl1.C11978e0.C11979a.LIVE_SHOPPING_DEFAULT
            bl3.r$a r7 = r8.mo62446e(r7)
            bl3.c r6 = r7.mo62447c(r6)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r6 = r6.mo11867O2(r13)
            r9.mo85957c(r10, r11, r6)
            android.widget.TextView r6 = r1.f176515B
            int r7 = r23.getItemCount()
            int r7 = r7 - r2
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r6.setText(r7)
            android.widget.TextView r6 = r1.f176516C
            java.lang.Class<ny.h> r7 = p629ny.C76979h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ny.h r7 = (p629ny.C76979h) r7
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = r4.f181348u
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x0081
            r9 = r10
        L_0x0081:
            android.text.SpannableString r7 = r7.mo107057T1(r8, r9)
            r6.setText(r7)
            te3.s90 r6 = r4.mo88747k()
            np1.i0 r13 = np1.C61866i0.f175909a
            android.widget.TextView r14 = r1.f176518E
            java.lang.String r7 = "holder.productStock"
            gy3.C87412m.m108593f(r14, r7)
            ok1.e r7 = ok1.C62042e.f176370a
            boolean r7 = r7.mo87027N0()
            if (r7 != 0) goto L_0x00b2
            fj1.b r7 = fj1.C45795b.f123698n
            if (r7 == 0) goto L_0x00ac
            java.lang.Class<cl1.o> r11 = cl1.C54991o.class
            androidx.lifecycle.i0 r7 = r7.mo71262a(r11)
            cl1.o r7 = (cl1.C54991o) r7
            boolean r7 = r7.f154190D
            goto L_0x00ad
        L_0x00ac:
            r7 = 0
        L_0x00ad:
            if (r7 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r7 = 0
            goto L_0x00b3
        L_0x00b2:
            r7 = 1
        L_0x00b3:
            java.lang.String r15 = r13.mo86799k(r7, r4, r6)
            android.view.View r6 = r1.f176520G
            java.lang.String r7 = "holder.sourceDivider"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.TextView r7 = r1.f176519F
            java.lang.String r11 = "holder.productSource"
            gy3.C87412m.m108593f(r7, r11)
            java.lang.String r11 = r4.f181333A
            if (r11 != 0) goto L_0x00cc
            r18 = r10
            goto L_0x00ce
        L_0x00cc:
            r18 = r11
        L_0x00ce:
            android.widget.TextView r11 = r1.f176521H
            te3.fp1 r12 = r4.f181346s
            java.lang.String r9 = "<this>"
            gy3.C87412m.m108594g(r12, r9)
            java.util.LinkedList<te3.z44> r9 = r12.f183165J
            java.lang.String r12 = "this.show_box_items"
            gy3.C87412m.m108593f(r9, r12)
            java.util.Iterator r9 = r9.iterator()
        L_0x00e3:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0100
            java.lang.Object r12 = r9.next()
            r8 = r12
            te3.z44 r8 = (te3.z44) r8
            int r8 = r8.f186625d
            r16 = r9
            r9 = 5
            if (r8 != r9) goto L_0x00f9
            r8 = 1
            goto L_0x00fa
        L_0x00f9:
            r8 = 0
        L_0x00fa:
            if (r8 == 0) goto L_0x00fd
            goto L_0x0101
        L_0x00fd:
            r9 = r16
            goto L_0x00e3
        L_0x0100:
            r12 = 0
        L_0x0101:
            te3.z44 r12 = (te3.z44) r12
            if (r12 == 0) goto L_0x0116
            pe3.b r8 = r12.f186626e
            if (r8 == 0) goto L_0x0116
            te3.h40 r9 = new te3.h40
            r9.<init>()
            byte[] r8 = r8.mo123703f()
            r9.parseFrom(r8)
            goto L_0x0117
        L_0x0116:
            r9 = 0
        L_0x0117:
            if (r9 == 0) goto L_0x0121
            java.lang.String r8 = r9.f183400d
            if (r8 != 0) goto L_0x011e
            goto L_0x0121
        L_0x011e:
            r20 = r8
            goto L_0x0123
        L_0x0121:
            r20 = r10
        L_0x0123:
            android.view.View r8 = r1.f176522I
            r16 = r6
            r17 = r7
            r19 = r11
            r21 = r8
            r13.mo86804q(r14, r15, r16, r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r6 = r0.f176509h
            te3.bs4 r7 = r4.f181343K
            if (r7 == 0) goto L_0x0139
            java.lang.String r12 = r7.f131295f
            goto L_0x013a
        L_0x0139:
            r12 = 0
        L_0x013a:
            if (r12 == 0) goto L_0x0147
            int r7 = r12.length()
            if (r7 != 0) goto L_0x0143
            goto L_0x0147
        L_0x0143:
            r7 = 1
            r22 = 0
            goto L_0x014a
        L_0x0147:
            r7 = 1
            r22 = 1
        L_0x014a:
            r8 = r22 ^ 1
            r6.f161010f = r8
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r6 = r1.f176523J
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$a r8 = com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView.f160994j
            r8 = 3
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView$b r9 = r0.f176509h
            r6.mo78824b(r8, r4, r9)
            android.widget.CheckBox r6 = r1.f176525z
            r6.setChecked(r5)
            boolean r5 = r0.f176505d
            r6 = 8
            if (r5 == 0) goto L_0x01a0
            te3.fp1 r5 = r4.f181346s
            java.lang.String r5 = r5.f183162G
            if (r5 == 0) goto L_0x0172
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            r8 = 0
            goto L_0x0173
        L_0x0172:
            r8 = 1
        L_0x0173:
            if (r8 == 0) goto L_0x0181
            android.widget.TextView r5 = r1.f176517D
            r5.setText(r10)
            android.widget.TextView r5 = r1.f176517D
            r5.setVisibility(r6)
            r6 = 0
            goto L_0x0190
        L_0x0181:
            android.widget.TextView r5 = r1.f176517D
            te3.fp1 r6 = r4.f181346s
            java.lang.String r6 = r6.f183162G
            r5.setText(r6)
            android.widget.TextView r5 = r1.f176517D
            r6 = 0
            r5.setVisibility(r6)
        L_0x0190:
            android.widget.ImageView r5 = r1.f176524K
            r5.setVisibility(r6)
            android.widget.ImageView r5 = r1.f176524K
            op1.c r6 = new op1.c
            r6.<init>(r0, r1, r4)
            r5.setOnClickListener(r6)
            goto L_0x01aa
        L_0x01a0:
            android.widget.TextView r4 = r1.f176517D
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r1.f176524K
            r4.setVisibility(r6)
        L_0x01aa:
            android.view.View r4 = r1.f44854d
            op1.b$c r5 = new op1.b$c
            r5.<init>(r0, r1, r2, r3)
            r4.setOnClickListener(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: op1.C62080b.onBindViewHolder(op1.b$b, int):void");
    }

    /* renamed from: O4 */
    public final void mo87147O4(ArrayList<C62081a> arrayList, String str) {
        if (C58739j4.f168176a.mo83692U()) {
            StringBuilder sb = new StringBuilder(str + XVFSFile.PATH_SEPARATOR_CHAR);
            int i = 0;
            for (T next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append('[');
                    sb4.append(i);
                    sb4.append(',');
                    sb4.append(((C62081a) next).f176512a.f181347t);
                    sb4.append(']');
                    sb.append(sb4.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            Log.m105924i("FinderLiveShoppingEditAdapter", sb.toString());
        }
    }

    public int getItemCount() {
        int size = this.f176506e.size();
        C62042e eVar = C62042e.f176370a;
        eVar.mo86998D1("FinderLiveShoppingEditAdapter", "getItemCount " + size);
        return size;
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.aju, (ViewGroup) null);
        C87412m.m108593f(inflate, "itemView");
        return new C62082b(this, inflate);
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C62082b bVar = (C62082b) zVar;
        C87412m.m108594g(bVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (!list.isEmpty()) {
            for (Object b : list) {
                if (C87412m.m108589b(b, 1)) {
                    bVar.f176515B.setText(String.valueOf(getItemCount() - i));
                }
            }
            return;
        }
        onBindViewHolder(bVar, i);
    }
}
