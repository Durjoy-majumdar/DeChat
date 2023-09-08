package qk1;

import al1.C27915k;
import al1.C54130j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C54963d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: qk1.p2 */
public final class C63248p2 extends RecyclerView.C16613e<C63249a> {

    /* renamed from: d */
    public final HashMap<String, C27915k> f179471d;

    /* renamed from: e */
    public final boolean f179472e;

    /* renamed from: f */
    public final ArrayList<C54130j> f179473f = new ArrayList<>();

    /* renamed from: g */
    public String f179474g = "";

    /* renamed from: h */
    public final int f179475h = 300;

    /* renamed from: i */
    public C32226l<? super C54130j, C13598b0> f179476i;

    /* renamed from: j */
    public C32226l<? super C54130j, C13598b0> f179477j;

    /* renamed from: n */
    public C45795b f179478n;

    /* renamed from: qk1.p2$a */
    public static final class C63249a extends RecyclerView.C16631z {

        /* renamed from: A */
        public final WeImageView f179479A;

        /* renamed from: B */
        public final TextView f179480B;

        /* renamed from: C */
        public final TextView f179481C;

        /* renamed from: D */
        public final ProgressBar f179482D;

        /* renamed from: E */
        public final TextView f179483E;

        /* renamed from: z */
        public final TextView f179484z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63249a(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f179484z = (TextView) view.findViewById(C0966R.C0970id.dpq);
            this.f179479A = (WeImageView) view.findViewById(C0966R.C0970id.dps);
            this.f179480B = (TextView) view.findViewById(C0966R.C0970id.dpk);
            this.f179481C = (TextView) view.findViewById(C0966R.C0970id.dpm);
            this.f179482D = (ProgressBar) view.findViewById(C0966R.C0970id.dpr);
            this.f179483E = (TextView) view.findViewById(C0966R.C0970id.dpt);
        }
    }

    public C63248p2(HashMap<String, C27915k> hashMap, boolean z) {
        C87412m.m108594g(hashMap, "applyLinkUserDescMap");
        this.f179471d = hashMap;
        this.f179472e = z;
    }

    /* renamed from: F4 */
    public final int mo88149F4(C54130j jVar) {
        C87412m.m108594g(jVar, "data");
        int i = 0;
        for (C54130j jVar2 : this.f179473f) {
            if (Util.isEqual(jVar2.f151999c, jVar.f151999c)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: G4 */
    public final void mo88150G4(C54130j jVar) {
        List<C54130j> list;
        T t;
        C87412m.m108594g(jVar, "micUser");
        int F4 = mo88149F4(jVar);
        if (F4 != -1) {
            this.f179473f.remove(jVar);
            notifyItemRemoved(F4);
        }
        C45795b bVar = this.f179478n;
        if (bVar != null && (list = ((C54963d0) bVar.mo71262a(C54963d0.class)).f154076s) != null) {
            synchronized (list) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Util.isEqual(((C54130j) t).f151997a, jVar.f151997a)) {
                        break;
                    }
                }
            }
            C54130j jVar2 = (C54130j) t;
            if (jVar2 != null) {
                jVar2.f152008l = 0;
            }
        }
    }

    /* renamed from: O4 */
    public final void mo88151O4(List<C54130j> list, String str) {
        C87412m.m108594g(list, "data");
        C87412m.m108594g(str, "keyword");
        this.f179474g = str;
        this.f179473f.clear();
        this.f179473f.addAll(list);
    }

    /* renamed from: c */
    public final void mo88152c(List<C54130j> list) {
        C87412m.m108594g(list, "data");
        this.f179473f.clear();
        ArrayList<C54130j> arrayList = this.f179473f;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C54130j jVar = (C54130j) next;
                if (i < this.f179475h) {
                    arrayList2.add(next);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        arrayList.addAll(arrayList2);
    }

    public int getItemCount() {
        return this.f179473f.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r21, int r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r22
            r2 = r21
            qk1.p2$a r2 = (qk1.C63248p2.C63249a) r2
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r2, r4)
            java.util.ArrayList<al1.j> r4 = r1.f179473f
            java.lang.Object r4 = r4.get(r0)
            java.lang.String r5 = "dataList[position]"
            gy3.C87412m.m108593f(r4, r5)
            al1.j r4 = (al1.C54130j) r4
            android.text.SpannableString r11 = new android.text.SpannableString
            java.lang.Class<tf0.p1> r5 = tf0.C64916p1.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r6 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            r12 = r5
            tf0.p1 r12 = (tf0.C64916p1) r12
            android.widget.TextView r13 = r2.f179484z
            java.lang.String r5 = "holder.nicknameTv"
            gy3.C87412m.m108593f(r13, r5)
            er1.j4 r14 = er1.C58739j4.f168176a
            java.lang.String r5 = r4.f151999c
            if (r5 != 0) goto L_0x003b
            java.lang.String r5 = ""
        L_0x003b:
            r15 = r5
            java.lang.String r5 = r4.f152000d
            if (r5 != 0) goto L_0x0042
            java.lang.String r5 = ""
        L_0x0042:
            r16 = r5
            r17 = 0
            r18 = 4
            r19 = 0
            java.lang.String r14 = er1.C58739j4.m68253s(r14, r15, r16, r17, r18, r19)
            r15 = 0
            r16 = 4
            r17 = 0
            java.lang.CharSequence r5 = tf0.C64916p1.C64917a.m76442i(r12, r13, r14, r15, r16, r17)
            r11.<init>(r5)
            boolean r5 = r1.f179472e
            if (r5 == 0) goto L_0x00d3
            java.lang.String r6 = r1.f179474g
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            int r5 = z04.C112550d0.m153769E(r5, r6, r7, r8, r9, r10)
            if (r5 < 0) goto L_0x00d3
            java.lang.String r6 = r1.f179474g
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            int r5 = z04.C112550d0.m153769E(r5, r6, r7, r8, r9, r10)
            java.lang.String r6 = r1.f179474g
            int r6 = r6.length()
            int r6 = r6 + r5
            if (r5 < 0) goto L_0x00a3
            int r7 = r11.length()
            if (r6 >= r7) goto L_0x00a3
            if (r5 > r6) goto L_0x00a3
            android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
            android.view.View r8 = r2.f44854d
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101823(0x7f06087f, float:1.7816067E38)
            int r8 = r8.getColor(r9)
            r7.<init>(r8)
            r8 = 33
            r11.setSpan(r7, r5, r6, r8)
            goto L_0x00d3
        L_0x00a3:
            java.lang.String r7 = "Finder.FinderLiveVisitorApplyLinkAdapter"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "invalid index beginIndex:"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = " endIndex:"
            r8.append(r5)
            r8.append(r6)
            java.lang.String r5 = " nickname:"
            r8.append(r5)
            r8.append(r11)
            java.lang.String r5 = " keyword:"
            r8.append(r5)
            java.lang.String r5 = r1.f179474g
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r5)
        L_0x00d3:
            android.widget.TextView r5 = r2.f179484z
            r5.setText(r11)
            android.widget.TextView r5 = r2.f179480B
            qk1.q2 r6 = new qk1.q2
            r6.<init>(r1, r0)
            r5.setOnClickListener(r6)
            android.widget.TextView r0 = r2.f179483E
            wk1.n r7 = wk1.C15440n.f41895a
            android.view.View r5 = r2.f44854d
            android.content.Context r9 = r5.getContext()
            java.lang.String r5 = "holder.itemView.context"
            gy3.C87412m.m108593f(r9, r5)
            java.lang.String r10 = " "
            te3.hx0 r5 = r4.f152014r
            r6 = 0
            if (r5 == 0) goto L_0x00fc
            java.util.LinkedList<te3.aw0> r5 = r5.f134930r
            r11 = r5
            goto L_0x00fd
        L_0x00fc:
            r11 = r6
        L_0x00fd:
            r5 = 2
            int[] r12 = new int[r5]
            r12 = {2, 4} // fill-array
            r13 = 0
            r14 = 0
            r15 = 96
            r16 = 0
            r8 = r0
            rx3.l r7 = wk1.C15440n.m14440c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            A r7 = r7.f38555d
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setText(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "handleDescTv username:"
            r0.append(r7)
            java.lang.String r7 = r4.f151999c
            r0.append(r7)
            java.lang.String r7 = " descType:"
            r0.append(r7)
            java.util.HashMap<java.lang.String, al1.k> r7 = r1.f179471d
            java.lang.String r8 = r4.f151999c
            java.lang.Object r7 = r7.get(r8)
            al1.k r7 = (al1.C27915k) r7
            if (r7 == 0) goto L_0x013c
            int r7 = r7.f77102a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x013d
        L_0x013c:
            r7 = r6
        L_0x013d:
            r0.append(r7)
            java.lang.String r7 = " badgeInfo:["
            r0.append(r7)
            java.util.HashMap<java.lang.String, al1.k> r7 = r1.f179471d
            java.lang.String r8 = r4.f151999c
            java.lang.Object r7 = r7.get(r8)
            al1.k r7 = (al1.C27915k) r7
            if (r7 == 0) goto L_0x015c
            te3.aw0 r7 = r7.f77103b
            if (r7 == 0) goto L_0x015c
            int r7 = r7.f130789d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x015d
        L_0x015c:
            r7 = r6
        L_0x015d:
            r0.append(r7)
            java.lang.String r7 = ", "
            r0.append(r7)
            java.util.HashMap<java.lang.String, al1.k> r7 = r1.f179471d
            java.lang.String r8 = r4.f151999c
            java.lang.Object r7 = r7.get(r8)
            al1.k r7 = (al1.C27915k) r7
            if (r7 == 0) goto L_0x017c
            te3.aw0 r7 = r7.f77103b
            if (r7 == 0) goto L_0x017c
            int r7 = r7.f130791f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x017d
        L_0x017c:
            r7 = r6
        L_0x017d:
            r0.append(r7)
            r7 = 93
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "Finder.FinderLiveVisitorApplyLinkAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            android.widget.TextView r0 = r2.f179481C
            r7 = 8
            r0.setVisibility(r7)
            java.util.HashMap<java.lang.String, al1.k> r0 = r1.f179471d
            java.lang.String r8 = r4.f151999c
            java.lang.Object r0 = r0.get(r8)
            al1.k r0 = (al1.C27915k) r0
            if (r0 == 0) goto L_0x01a8
            int r0 = r0.f77102a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x01a9
        L_0x01a8:
            r0 = r6
        L_0x01a9:
            r8 = 3
            r9 = 1
            r10 = 0
            if (r0 != 0) goto L_0x01af
            goto L_0x0201
        L_0x01af:
            int r11 = r0.intValue()
            if (r11 != r8) goto L_0x0201
            java.util.HashMap<java.lang.String, al1.k> r0 = r1.f179471d
            java.lang.String r8 = r4.f151999c
            java.lang.Object r0 = r0.get(r8)
            al1.k r0 = (al1.C27915k) r0
            if (r0 == 0) goto L_0x01c8
            te3.aw0 r0 = r0.f77103b
            if (r0 == 0) goto L_0x01c8
            int r0 = r0.f130791f
            goto L_0x01c9
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            if (r0 <= 0) goto L_0x0246
            android.widget.TextView r0 = r2.f179481C
            android.content.Context r8 = r0.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131827670(0x7f111bd6, float:1.928826E38)
            java.lang.Object[] r12 = new java.lang.Object[r9]
            java.util.HashMap<java.lang.String, al1.k> r13 = r1.f179471d
            java.lang.String r14 = r4.f151999c
            java.lang.Object r13 = r13.get(r14)
            al1.k r13 = (al1.C27915k) r13
            if (r13 == 0) goto L_0x01ed
            te3.aw0 r13 = r13.f77103b
            if (r13 == 0) goto L_0x01ed
            int r13 = r13.f130791f
            goto L_0x01ee
        L_0x01ed:
            r13 = 0
        L_0x01ee:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12[r10] = r13
            java.lang.String r8 = r8.getString(r11, r12)
            r0.setText(r8)
            android.widget.TextView r0 = r2.f179481C
            r0.setVisibility(r10)
            goto L_0x0246
        L_0x0201:
            if (r0 != 0) goto L_0x0204
            goto L_0x0224
        L_0x0204:
            int r8 = r0.intValue()
            if (r8 != r5) goto L_0x0224
            android.widget.TextView r0 = r2.f179481C
            android.content.Context r8 = r0.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131827671(0x7f111bd7, float:1.9288261E38)
            java.lang.String r8 = r8.getString(r11)
            r0.setText(r8)
            android.widget.TextView r0 = r2.f179481C
            r0.setVisibility(r10)
            goto L_0x0246
        L_0x0224:
            if (r0 != 0) goto L_0x0227
            goto L_0x0246
        L_0x0227:
            int r0 = r0.intValue()
            if (r0 != r9) goto L_0x0246
            android.widget.TextView r0 = r2.f179481C
            android.content.Context r8 = r0.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r11 = 2131827672(0x7f111bd8, float:1.9288263E38)
            java.lang.String r8 = r8.getString(r11)
            r0.setText(r8)
            android.widget.TextView r0 = r2.f179481C
            r0.setVisibility(r10)
        L_0x0246:
            fj1.b r0 = r1.f179478n
            if (r0 == 0) goto L_0x0280
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r8 = r0.f154076s
            if (r8 == 0) goto L_0x0280
            monitor-enter(r8)
            java.util.Iterator r0 = r8.iterator()     // Catch:{ all -> 0x027d }
        L_0x0259:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x027d }
            if (r11 == 0) goto L_0x0271
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x027d }
            r12 = r11
            al1.j r12 = (al1.C54130j) r12     // Catch:{ all -> 0x027d }
            java.lang.String r12 = r12.f151997a     // Catch:{ all -> 0x027d }
            java.lang.String r13 = r4.f151997a     // Catch:{ all -> 0x027d }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x027d }
            if (r12 == 0) goto L_0x0259
            goto L_0x0272
        L_0x0271:
            r11 = r6
        L_0x0272:
            monitor-exit(r8)
            al1.j r11 = (al1.C54130j) r11
            if (r11 == 0) goto L_0x0280
            int r0 = r11.f152008l
            if (r0 != r5) goto L_0x0280
            r0 = 1
            goto L_0x0281
        L_0x027d:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0280:
            r0 = 0
        L_0x0281:
            r8 = 4
            if (r0 != 0) goto L_0x03e1
            fj1.b r0 = r1.f179478n
            if (r0 == 0) goto L_0x02be
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r11 = r0.f154076s
            if (r11 == 0) goto L_0x02be
            monitor-enter(r11)
            java.util.Iterator r0 = r11.iterator()     // Catch:{ all -> 0x02bb }
        L_0x0297:
            boolean r12 = r0.hasNext()     // Catch:{ all -> 0x02bb }
            if (r12 == 0) goto L_0x02af
            java.lang.Object r12 = r0.next()     // Catch:{ all -> 0x02bb }
            r13 = r12
            al1.j r13 = (al1.C54130j) r13     // Catch:{ all -> 0x02bb }
            java.lang.String r13 = r13.f151997a     // Catch:{ all -> 0x02bb }
            java.lang.String r14 = r4.f151997a     // Catch:{ all -> 0x02bb }
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r13, (java.lang.String) r14)     // Catch:{ all -> 0x02bb }
            if (r13 == 0) goto L_0x0297
            goto L_0x02b0
        L_0x02af:
            r12 = r6
        L_0x02b0:
            monitor-exit(r11)
            al1.j r12 = (al1.C54130j) r12
            if (r12 == 0) goto L_0x02be
            int r0 = r12.f152008l
            if (r0 != r9) goto L_0x02be
            r0 = 1
            goto L_0x02bf
        L_0x02bb:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x02be:
            r0 = 0
        L_0x02bf:
            if (r0 != 0) goto L_0x03e1
            int r0 = r4.f152008l
            if (r0 == r9) goto L_0x02ca
            if (r0 != r5) goto L_0x02c8
            goto L_0x02ca
        L_0x02c8:
            r0 = 0
            goto L_0x02cb
        L_0x02ca:
            r0 = 1
        L_0x02cb:
            if (r0 == 0) goto L_0x02cf
            goto L_0x03e1
        L_0x02cf:
            fj1.b r0 = r1.f179478n
            if (r0 == 0) goto L_0x0301
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r3 = r0.f154074q
            if (r3 == 0) goto L_0x0301
            monitor-enter(r3)
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x02fe }
        L_0x02e2:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x02fe }
            if (r11 == 0) goto L_0x02fa
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x02fe }
            r12 = r11
            al1.j r12 = (al1.C54130j) r12     // Catch:{ all -> 0x02fe }
            java.lang.String r12 = r12.f151997a     // Catch:{ all -> 0x02fe }
            java.lang.String r13 = r4.f151997a     // Catch:{ all -> 0x02fe }
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r12, (java.lang.String) r13)     // Catch:{ all -> 0x02fe }
            if (r12 == 0) goto L_0x02e2
            r6 = r11
        L_0x02fa:
            monitor-exit(r3)
            al1.j r6 = (al1.C54130j) r6
            goto L_0x0301
        L_0x02fe:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0301:
            r0 = 2131232900(0x7f080884, float:1.8081922E38)
            if (r6 == 0) goto L_0x034d
            android.widget.TextView r3 = r2.f179480B
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2131827692(0x7f111bec, float:1.9288304E38)
            java.lang.String r6 = r6.getString(r11)
            r3.setText(r6)
            android.widget.TextView r3 = r2.f179480B
            android.content.Context r6 = r3.getContext()
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r3.setBackground(r0)
            android.widget.TextView r0 = r2.f179480B
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131099905(0x7f060101, float:1.7812176E38)
            int r3 = r3.getColor(r6)
            r0.setTextColor(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r6)
            r0.setIconColor(r3)
            goto L_0x0393
        L_0x034d:
            android.widget.TextView r3 = r2.f179480B
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r11 = 2131827691(0x7f111beb, float:1.9288302E38)
            java.lang.String r6 = r6.getString(r11)
            r3.setText(r6)
            android.widget.TextView r3 = r2.f179480B
            android.content.Context r6 = r3.getContext()
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            r3.setBackground(r0)
            android.widget.TextView r0 = r2.f179480B
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131099800(0x7f060098, float:1.7811963E38)
            android.content.res.ColorStateList r3 = r3.getColorStateList(r6)
            r0.setTextColor(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r6)
            r0.setIconColor(r3)
        L_0x0393:
            android.widget.TextView r0 = r2.f179480B
            r0.setVisibility(r10)
            android.widget.ProgressBar r0 = r2.f179482D
            r0.setVisibility(r7)
            int r0 = r4.f152001e
            if (r0 != r9) goto L_0x03bd
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            r0.setVisibility(r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            android.view.View r2 = r2.f44854d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131755968(0x7f1003c0, float:1.914283E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setImageDrawable(r2)
            goto L_0x03f0
        L_0x03bd:
            if (r0 != r5) goto L_0x03db
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            r0.setVisibility(r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            android.view.View r2 = r2.f44854d
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131756187(0x7f10049b, float:1.9143274E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r0.setImageDrawable(r2)
            goto L_0x03f0
        L_0x03db:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            r0.setVisibility(r8)
            goto L_0x03f0
        L_0x03e1:
            android.widget.ProgressBar r0 = r2.f179482D
            r0.setVisibility(r10)
            android.widget.TextView r0 = r2.f179480B
            r0.setVisibility(r8)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r2.f179479A
            r0.setVisibility(r8)
        L_0x03f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qk1.C63248p2.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.ahj, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(parent.context, …ve_link_apply_item, null)");
        return new C63249a(inflate);
    }
}
