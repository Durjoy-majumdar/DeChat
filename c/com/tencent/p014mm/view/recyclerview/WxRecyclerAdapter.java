package com.tencent.p014mm.view.recyclerview;

import a14.C0000n0;
import a14.C53930o0;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.album.p836ui.c2c.gallery.C55068a;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C33631s;
import jq3.C60896i;
import jq3.C60897k;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import jq3.C9500j;
import jq3.C9508q;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\tR$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, mo182094d2 = {"Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", "Ljq3/c;", "D", "Ljq3/l;", "Ljq3/o;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "data", "Ljava/util/ArrayList;", "a", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter */
public class WxRecyclerAdapter<D extends C9493c> extends C60898l<C60905o> {

    /* renamed from: F */
    public static final /* synthetic */ int f165734F = 0;

    /* renamed from: A */
    public final LongSparseArray<C33631s> f165735A;

    /* renamed from: B */
    public final LongSparseArray<C33631s> f165736B;

    /* renamed from: C */
    public C60907t f165737C;

    /* renamed from: D */
    public WxRecyclerAdapter<D>.a f165738D;

    /* renamed from: E */
    public RecyclerView.C16615g f165739E;
    /* access modifiers changed from: private */
    public final ArrayList<D> data;

    /* renamed from: s */
    public final C9500j f165740s;

    /* renamed from: t */
    public final boolean f165741t;

    /* renamed from: u */
    public final ConcurrentHashMap<Integer, C60896i<?>> f165742u;

    /* renamed from: v */
    public final ConcurrentHashMap<C0000n0, Object> f165743v;

    /* renamed from: w */
    public final LongSparseArray<C9508q> f165744w;

    /* renamed from: x */
    public boolean f165745x;

    /* renamed from: y */
    public C60897k<D> f165746y;

    /* renamed from: z */
    public final LongSparseArray<C33631s> f165747z;

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$a */
    public final class C57915a extends RecyclerView.C0130p {

        /* renamed from: d */
        public int f165748d = -1;

        /* renamed from: e */
        public int f165749e = -1;

        /* renamed from: f */
        public final int f165750f;

        /* renamed from: g */
        public int f165751g;

        /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$a$a */
        public static final class C57916a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f165753d;

            /* renamed from: e */
            public final /* synthetic */ WxRecyclerAdapter<D>.a f165754e;

            /* renamed from: f */
            public final /* synthetic */ RecyclerView f165755f;

            /* renamed from: g */
            public final /* synthetic */ WxRecyclerAdapter<D> f165756g;

            /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$a$a$a */
            public static final class C57917a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ WxRecyclerAdapter<D> f165757d;

                /* renamed from: e */
                public final /* synthetic */ RecyclerView f165758e;

                /* renamed from: f */
                public final /* synthetic */ C8479f0<C60906r> f165759f;

                public C57917a(WxRecyclerAdapter<D> wxRecyclerAdapter, RecyclerView recyclerView, C8479f0<C60906r> f0Var) {
                    this.f165757d = wxRecyclerAdapter;
                    this.f165758e = recyclerView;
                    this.f165759f = f0Var;
                }

                public final void run() {
                    C60907t tVar = this.f165757d.f165737C;
                    if (tVar != null) {
                        tVar.mo2587a(this.f165758e, (C60906r) this.f165759f.f27484d);
                    }
                }
            }

            public C57916a(int i, WxRecyclerAdapter<D>.a aVar, RecyclerView recyclerView, WxRecyclerAdapter<D> wxRecyclerAdapter) {
                this.f165753d = i;
                this.f165754e = aVar;
                this.f165755f = recyclerView;
                this.f165756g = wxRecyclerAdapter;
            }

            /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x01b0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r19 = this;
                    r1 = r19
                    java.lang.String r2 = "footerInfoList[footerPosition]"
                    java.lang.String r3 = "headerInfoList[headerPosition]"
                    java.lang.String r4 = "{\n                      …                        }"
                    java.lang.String r5 = ""
                    gy3.f0 r6 = new gy3.f0
                    r6.<init>()
                    jq3.r r0 = new jq3.r
                    int r7 = r1.f165753d
                    r0.<init>(r7)
                    r6.f27484d = r0
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D>$a r7 = r1.f165754e
                    int r8 = r7.f165748d
                    r0.f173506b = r8
                    int r7 = r7.f165749e
                    r0.f173507c = r7
                    androidx.recyclerview.widget.RecyclerView r0 = r1.f165755f
                    androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                    boolean r7 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
                    r8 = 0
                    r9 = 1
                    java.lang.String r10 = ", layoutPosition="
                    java.lang.String r11 = "[onScrollStateChanged] invalid. adapterPosition="
                    java.lang.String r12 = "RecyclerViewAdapterEx"
                    r13 = 0
                    if (r7 == 0) goto L_0x00ad
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                    int r14 = r0.mo16957C()
                    int r14 = java.lang.Math.max(r8, r14)
                    r7.f173508d = r14
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    int r0 = r0.mo16959E()
                    int r0 = java.lang.Math.max(r8, r0)
                    r7.f173509e = r0
                    androidx.recyclerview.widget.RecyclerView r0 = r1.f165755f
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    int r7 = r7.f173508d
                    androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17024J0(r7, r8)
                    if (r0 == 0) goto L_0x006b
                    int r7 = r0.mo17363j()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L_0x006c
                L_0x006b:
                    r7 = r13
                L_0x006c:
                    if (r0 == 0) goto L_0x0077
                    int r14 = r0.mo17364k()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                    goto L_0x0078
                L_0x0077:
                    r14 = r13
                L_0x0078:
                    boolean r7 = gy3.C87412m.m108589b(r7, r14)
                    if (r7 != 0) goto L_0x01ab
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r11)
                    if (r0 == 0) goto L_0x0091
                    int r3 = r0.mo17363j()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    goto L_0x0092
                L_0x0091:
                    r3 = r13
                L_0x0092:
                    r2.append(r3)
                    r2.append(r10)
                    if (r0 == 0) goto L_0x00a2
                    int r0 = r0.mo17364k()
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
                L_0x00a2:
                    r2.append(r13)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                    return
                L_0x00ad:
                    boolean r7 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
                    if (r7 == 0) goto L_0x0130
                    androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
                    int[] r7 = r0.mo17394A(r13)
                    int[] r0 = r0.mo17395B(r13)
                    T r14 = r6.f27484d
                    jq3.r r14 = (jq3.C60906r) r14
                    r15 = r7[r8]
                    r7 = r7[r9]
                    int r7 = java.lang.Math.min(r15, r7)
                    r14.f173508d = r7
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    r14 = r0[r8]
                    r0 = r0[r9]
                    int r0 = java.lang.Math.max(r14, r0)
                    r7.f173509e = r0
                    androidx.recyclerview.widget.RecyclerView r0 = r1.f165755f
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    int r7 = r7.f173508d
                    androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17024J0(r7, r8)
                    if (r0 == 0) goto L_0x00ee
                    int r7 = r0.mo17363j()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L_0x00ef
                L_0x00ee:
                    r7 = r13
                L_0x00ef:
                    if (r0 == 0) goto L_0x00fa
                    int r14 = r0.mo17364k()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                    goto L_0x00fb
                L_0x00fa:
                    r14 = r13
                L_0x00fb:
                    boolean r7 = gy3.C87412m.m108589b(r7, r14)
                    if (r7 != 0) goto L_0x01ab
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r11)
                    if (r0 == 0) goto L_0x0114
                    int r3 = r0.mo17363j()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    goto L_0x0115
                L_0x0114:
                    r3 = r13
                L_0x0115:
                    r2.append(r3)
                    r2.append(r10)
                    if (r0 == 0) goto L_0x0125
                    int r0 = r0.mo17364k()
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
                L_0x0125:
                    r2.append(r13)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                    return
                L_0x0130:
                    boolean r7 = r0 instanceof androidx.recyclerview.widget.GridLayoutManager
                    if (r7 == 0) goto L_0x01ad
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
                    int r14 = r0.mo16957C()
                    int r14 = java.lang.Math.max(r8, r14)
                    r7.f173508d = r14
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    int r0 = r0.mo16959E()
                    int r0 = java.lang.Math.max(r8, r0)
                    r7.f173509e = r0
                    androidx.recyclerview.widget.RecyclerView r0 = r1.f165755f
                    T r7 = r6.f27484d
                    jq3.r r7 = (jq3.C60906r) r7
                    int r7 = r7.f173508d
                    androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17024J0(r7, r8)
                    if (r0 == 0) goto L_0x0169
                    int r7 = r0.mo17363j()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L_0x016a
                L_0x0169:
                    r7 = r13
                L_0x016a:
                    if (r0 == 0) goto L_0x0175
                    int r14 = r0.mo17364k()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                    goto L_0x0176
                L_0x0175:
                    r14 = r13
                L_0x0176:
                    boolean r7 = gy3.C87412m.m108589b(r7, r14)
                    if (r7 != 0) goto L_0x01ab
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r11)
                    if (r0 == 0) goto L_0x018f
                    int r3 = r0.mo17363j()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    goto L_0x0190
                L_0x018f:
                    r3 = r13
                L_0x0190:
                    r2.append(r3)
                    r2.append(r10)
                    if (r0 == 0) goto L_0x01a0
                    int r0 = r0.mo17364k()
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
                L_0x01a0:
                    r2.append(r13)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
                    return
                L_0x01ab:
                    r0 = 1
                    goto L_0x01ae
                L_0x01ad:
                    r0 = 0
                L_0x01ae:
                    if (r0 == 0) goto L_0x0422
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D>$a r0 = r1.f165754e
                    T r7 = r6.f27484d
                    r10 = r7
                    jq3.r r10 = (jq3.C60906r) r10
                    int r11 = r10.f173508d
                    r0.f165748d = r11
                    int r10 = r10.f173509e
                    r0.f165749e = r10
                    r0 = r7
                    jq3.r r0 = (jq3.C60906r) r0     // Catch:{ Exception -> 0x0252 }
                    int r0 = r0.f173508d     // Catch:{ Exception -> 0x0252 }
                    jq3.r r7 = (jq3.C60906r) r7     // Catch:{ Exception -> 0x0252 }
                    int r7 = r7.f173509e     // Catch:{ Exception -> 0x0252 }
                    if (r0 > r7) goto L_0x0258
                L_0x01ca:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    int r10 = r10.getItemCount()     // Catch:{ Exception -> 0x0252 }
                    if (r10 <= 0) goto L_0x024c
                    if (r0 >= 0) goto L_0x01dc
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    int r10 = r10.getItemCount()     // Catch:{ Exception -> 0x0252 }
                    if (r0 >= r10) goto L_0x024c
                L_0x01dc:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    int r10 = r10.mo85796c6()     // Catch:{ Exception -> 0x0252 }
                    int r10 = r0 - r10
                    if (r10 >= 0) goto L_0x01f4
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    java.util.ArrayList<jq3.l$a> r10 = r10.f173485i     // Catch:{ Exception -> 0x0252 }
                    java.lang.Object r10 = r10.get(r0)     // Catch:{ Exception -> 0x0252 }
                    gy3.C87412m.m108593f(r10, r3)     // Catch:{ Exception -> 0x0252 }
                    jq3.l$a r10 = (jq3.C60898l.C60899a) r10     // Catch:{ Exception -> 0x0252 }
                    goto L_0x0226
                L_0x01f4:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r11 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    java.util.ArrayList r11 = r11.data     // Catch:{ Exception -> 0x0252 }
                    int r11 = r11.size()     // Catch:{ Exception -> 0x0252 }
                    if (r10 < r11) goto L_0x0217
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r11 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    java.util.ArrayList r13 = r11.data     // Catch:{ Exception -> 0x0252 }
                    int r13 = r13.size()     // Catch:{ Exception -> 0x0252 }
                    int r10 = r10 - r13
                    java.util.ArrayList<jq3.l$a> r11 = r11.f173486j     // Catch:{ Exception -> 0x0252 }
                    java.lang.Object r10 = r11.get(r10)     // Catch:{ Exception -> 0x0252 }
                    gy3.C87412m.m108593f(r10, r2)     // Catch:{ Exception -> 0x0252 }
                    jq3.l$a r10 = (jq3.C60898l.C60899a) r10     // Catch:{ Exception -> 0x0252 }
                    goto L_0x0226
                L_0x0217:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r11 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    java.util.ArrayList r11 = r11.data     // Catch:{ Exception -> 0x0252 }
                    java.lang.Object r10 = r11.get(r10)     // Catch:{ Exception -> 0x0252 }
                    gy3.C87412m.m108593f(r10, r4)     // Catch:{ Exception -> 0x0252 }
                    jq3.c r10 = (jq3.C9493c) r10     // Catch:{ Exception -> 0x0252 }
                L_0x0226:
                    jq3.s r11 = new jq3.s     // Catch:{ Exception -> 0x0252 }
                    r15 = 0
                    r17 = 2
                    r18 = 0
                    r13 = r11
                    r14 = r10
                    r13.<init>(r14, r15, r17, r18)     // Catch:{ Exception -> 0x0252 }
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r13 = r1.f165756g     // Catch:{ Exception -> 0x0252 }
                    r11.f91022c = r0     // Catch:{ Exception -> 0x0252 }
                    android.util.LongSparseArray<jq3.q> r13 = r13.f165744w     // Catch:{ Exception -> 0x0252 }
                    long r14 = r10.getItemId()     // Catch:{ Exception -> 0x0252 }
                    java.lang.Object r10 = r13.get(r14)     // Catch:{ Exception -> 0x0252 }
                    jq3.q r10 = (jq3.C9508q) r10     // Catch:{ Exception -> 0x0252 }
                    T r10 = r6.f27484d     // Catch:{ Exception -> 0x0252 }
                    jq3.r r10 = (jq3.C60906r) r10     // Catch:{ Exception -> 0x0252 }
                    java.util.LinkedList<jq3.s> r10 = r10.f173510f     // Catch:{ Exception -> 0x0252 }
                    r10.add(r11)     // Catch:{ Exception -> 0x0252 }
                L_0x024c:
                    if (r0 == r7) goto L_0x0258
                    int r0 = r0 + 1
                    goto L_0x01ca
                L_0x0252:
                    r0 = move-exception
                    java.lang.Object[] r7 = new java.lang.Object[r8]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r5, r7)
                L_0x0258:
                    T r0 = r6.f27484d
                    r7 = r0
                    jq3.r r7 = (jq3.C60906r) r7
                    int r10 = r7.f173506b
                    int r11 = r7.f173508d
                    if (r10 != r11) goto L_0x0269
                    int r11 = r7.f173507c
                    int r13 = r7.f173509e
                    if (r11 == r13) goto L_0x0270
                L_0x0269:
                    r11 = -1
                    if (r10 != r11) goto L_0x0279
                    int r10 = r7.f173507c
                    if (r10 != r11) goto L_0x0279
                L_0x0270:
                    java.util.LinkedList<jq3.s> r0 = r7.f173511g
                    java.util.LinkedList<jq3.s> r2 = r7.f173510f
                    r0.addAll(r2)
                    goto L_0x032e
                L_0x0279:
                    r7 = r0
                    jq3.r r7 = (jq3.C60906r) r7     // Catch:{ Exception -> 0x0328 }
                    int r7 = r7.f173508d     // Catch:{ Exception -> 0x0328 }
                    jq3.r r0 = (jq3.C60906r) r0     // Catch:{ Exception -> 0x0328 }
                    int r0 = r0.f173506b     // Catch:{ Exception -> 0x0328 }
                    if (r7 <= r0) goto L_0x0285
                    r7 = r0
                L_0x0285:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r0 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    int r0 = r0.getItemCount()     // Catch:{ Exception -> 0x0328 }
                    int r0 = r0 - r9
                    T r9 = r6.f27484d     // Catch:{ Exception -> 0x0328 }
                    r10 = r9
                    jq3.r r10 = (jq3.C60906r) r10     // Catch:{ Exception -> 0x0328 }
                    int r10 = r10.f173509e     // Catch:{ Exception -> 0x0328 }
                    jq3.r r9 = (jq3.C60906r) r9     // Catch:{ Exception -> 0x0328 }
                    int r9 = r9.f173507c     // Catch:{ Exception -> 0x0328 }
                    if (r10 >= r9) goto L_0x029a
                    r10 = r9
                L_0x029a:
                    if (r0 <= r10) goto L_0x029d
                    r0 = r10
                L_0x029d:
                    if (r7 > r0) goto L_0x032e
                L_0x029f:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r9 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    int r9 = r9.getItemCount()     // Catch:{ Exception -> 0x0328 }
                    if (r9 <= 0) goto L_0x0322
                    if (r7 >= 0) goto L_0x02b1
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r9 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    int r9 = r9.getItemCount()     // Catch:{ Exception -> 0x0328 }
                    if (r7 >= r9) goto L_0x0322
                L_0x02b1:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r9 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    int r9 = r9.mo85796c6()     // Catch:{ Exception -> 0x0328 }
                    int r9 = r7 - r9
                    if (r9 >= 0) goto L_0x02c9
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    java.util.ArrayList<jq3.l$a> r10 = r10.f173485i     // Catch:{ Exception -> 0x0328 }
                    java.lang.Object r10 = r10.get(r7)     // Catch:{ Exception -> 0x0328 }
                    gy3.C87412m.m108593f(r10, r3)     // Catch:{ Exception -> 0x0328 }
                    jq3.l$a r10 = (jq3.C60898l.C60899a) r10     // Catch:{ Exception -> 0x0328 }
                    goto L_0x02fc
                L_0x02c9:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    java.util.ArrayList r10 = r10.data     // Catch:{ Exception -> 0x0328 }
                    int r10 = r10.size()     // Catch:{ Exception -> 0x0328 }
                    if (r9 < r10) goto L_0x02ed
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    java.util.ArrayList r11 = r10.data     // Catch:{ Exception -> 0x0328 }
                    int r11 = r11.size()     // Catch:{ Exception -> 0x0328 }
                    int r11 = r9 - r11
                    java.util.ArrayList<jq3.l$a> r10 = r10.f173486j     // Catch:{ Exception -> 0x0328 }
                    java.lang.Object r10 = r10.get(r11)     // Catch:{ Exception -> 0x0328 }
                    gy3.C87412m.m108593f(r10, r2)     // Catch:{ Exception -> 0x0328 }
                    jq3.l$a r10 = (jq3.C60898l.C60899a) r10     // Catch:{ Exception -> 0x0328 }
                    goto L_0x02fc
                L_0x02ed:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r10 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    java.util.ArrayList r10 = r10.data     // Catch:{ Exception -> 0x0328 }
                    java.lang.Object r10 = r10.get(r9)     // Catch:{ Exception -> 0x0328 }
                    gy3.C87412m.m108593f(r10, r4)     // Catch:{ Exception -> 0x0328 }
                    jq3.c r10 = (jq3.C9493c) r10     // Catch:{ Exception -> 0x0328 }
                L_0x02fc:
                    jq3.s r11 = new jq3.s     // Catch:{ Exception -> 0x0328 }
                    r15 = 0
                    r17 = 2
                    r18 = 0
                    r13 = r11
                    r14 = r10
                    r13.<init>(r14, r15, r17, r18)     // Catch:{ Exception -> 0x0328 }
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r13 = r1.f165756g     // Catch:{ Exception -> 0x0328 }
                    r11.f91022c = r9     // Catch:{ Exception -> 0x0328 }
                    android.util.LongSparseArray<jq3.q> r9 = r13.f165744w     // Catch:{ Exception -> 0x0328 }
                    long r13 = r10.getItemId()     // Catch:{ Exception -> 0x0328 }
                    java.lang.Object r9 = r9.get(r13)     // Catch:{ Exception -> 0x0328 }
                    jq3.q r9 = (jq3.C9508q) r9     // Catch:{ Exception -> 0x0328 }
                    T r9 = r6.f27484d     // Catch:{ Exception -> 0x0328 }
                    jq3.r r9 = (jq3.C60906r) r9     // Catch:{ Exception -> 0x0328 }
                    java.util.LinkedList<jq3.s> r9 = r9.f173511g     // Catch:{ Exception -> 0x0328 }
                    r9.add(r11)     // Catch:{ Exception -> 0x0328 }
                L_0x0322:
                    if (r7 == r0) goto L_0x032e
                    int r7 = r7 + 1
                    goto L_0x029f
                L_0x0328:
                    r0 = move-exception
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r5, r2)
                L_0x032e:
                    android.util.LongSparseArray r0 = new android.util.LongSparseArray
                    r0.<init>()
                    T r2 = r6.f27484d
                    jq3.r r2 = (jq3.C60906r) r2
                    java.util.LinkedList<jq3.s> r2 = r2.f173510f
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r3 = r1.f165756g
                    java.util.Iterator r2 = r2.iterator()
                L_0x033f:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x036c
                    java.lang.Object r4 = r2.next()
                    jq3.s r4 = (jq3.C33631s) r4
                    jq3.c r5 = r4.f91020a
                    long r9 = r5.getItemId()
                    r0.put(r9, r4)
                    android.util.LongSparseArray<jq3.s> r5 = r3.f165736B
                    jq3.c r7 = r4.f91020a
                    long r9 = r7.getItemId()
                    int r5 = r5.indexOfKey(r9)
                    if (r5 >= 0) goto L_0x033f
                    T r5 = r6.f27484d
                    jq3.r r5 = (jq3.C60906r) r5
                    java.util.LinkedList<jq3.s> r5 = r5.f173513i
                    r5.add(r4)
                    goto L_0x033f
                L_0x036c:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r2 = r1.f165756g
                    android.util.LongSparseArray<jq3.s> r2 = r2.f165736B
                    int r2 = r2.size()
                    r3 = 0
                L_0x0375:
                    if (r3 >= r2) goto L_0x0399
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r4 = r1.f165756g
                    android.util.LongSparseArray<jq3.s> r4 = r4.f165736B
                    java.lang.Object r4 = r4.valueAt(r3)
                    jq3.s r4 = (jq3.C33631s) r4
                    jq3.c r5 = r4.f91020a
                    long r9 = r5.getItemId()
                    int r5 = r0.indexOfKey(r9)
                    if (r5 >= 0) goto L_0x0396
                    T r5 = r6.f27484d
                    jq3.r r5 = (jq3.C60906r) r5
                    java.util.LinkedList<jq3.s> r5 = r5.f173512h
                    r5.add(r4)
                L_0x0396:
                    int r3 = r3 + 1
                    goto L_0x0375
                L_0x0399:
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r2 = r1.f165756g
                    android.util.LongSparseArray<jq3.s> r2 = r2.f165736B
                    r2.clear()
                    int r2 = r0.size()
                L_0x03a4:
                    if (r8 >= r2) goto L_0x03bc
                    java.lang.Object r3 = r0.valueAt(r8)
                    jq3.s r3 = (jq3.C33631s) r3
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r4 = r1.f165756g
                    android.util.LongSparseArray<jq3.s> r4 = r4.f165736B
                    jq3.c r5 = r3.f91020a
                    long r9 = r5.getItemId()
                    r4.put(r9, r3)
                    int r8 = r8 + 1
                    goto L_0x03a4
                L_0x03bc:
                    T r0 = r6.f27484d
                    jq3.r r0 = (jq3.C60906r) r0
                    java.util.LinkedList<jq3.s> r0 = r0.f173511g
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r2 = r1.f165756g
                    java.util.Iterator r0 = r0.iterator()
                L_0x03c8:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x0410
                    java.lang.Object r3 = r0.next()
                    jq3.s r3 = (jq3.C33631s) r3
                    android.util.LongSparseArray<jq3.s> r4 = r2.f165735A
                    jq3.c r5 = r3.f91020a
                    long r7 = r5.getItemId()
                    int r4 = r4.indexOfKey(r7)
                    if (r4 >= 0) goto L_0x03ed
                    android.util.LongSparseArray<jq3.s> r4 = r2.f165735A
                    jq3.c r5 = r3.f91020a
                    long r7 = r5.getItemId()
                    r4.put(r7, r3)
                L_0x03ed:
                    android.util.LongSparseArray<jq3.s> r4 = r2.f165747z
                    jq3.c r5 = r3.f91020a
                    long r7 = r5.getItemId()
                    int r4 = r4.indexOfKey(r7)
                    if (r4 >= 0) goto L_0x03c8
                    android.util.LongSparseArray<jq3.s> r4 = r2.f165747z
                    jq3.c r5 = r3.f91020a
                    long r7 = r5.getItemId()
                    r4.put(r7, r3)
                    T r4 = r6.f27484d
                    jq3.r r4 = (jq3.C60906r) r4
                    java.util.LinkedList<jq3.s> r4 = r4.f173514j
                    r4.add(r3)
                    goto L_0x03c8
                L_0x0410:
                    zt3.t r0 = zt3.C119157j.f356862d
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter$a$a$a r2 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter$a$a$a
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter<D> r3 = r1.f165756g
                    androidx.recyclerview.widget.RecyclerView r4 = r1.f165755f
                    r2.<init>(r3, r4, r6)
                    zt3.j r0 = (zt3.C119157j) r0
                    java.lang.String r3 = "WxDataRecyclerView.DataHandle"
                    r0.mo183876g(r2, r3)
                L_0x0422:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter.C57915a.C57916a.run():void");
            }
        }

        public C57915a() {
            this.f165750f = ViewConfiguration.get(WxRecyclerAdapter.this.mo85797d6().getContext()).getScaledTouchSlop();
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            recyclerView.post(new C57916a(i, this, recyclerView, WxRecyclerAdapter.this));
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108591d(layoutManager);
            if (!layoutManager.canScrollHorizontally()) {
                i = i2;
            }
            int i3 = this.f165751g + i;
            this.f165751g = i3;
            if (Math.abs(i3) > this.f165750f * 5) {
                onScrollStateChanged(recyclerView, 3);
                this.f165751g = 0;
            }
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$WxRecyclerOnScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$b */
    public static final class C57918b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<D> f165760d;

        public C57918b(WxRecyclerAdapter<D> wxRecyclerAdapter) {
            this.f165760d = wxRecyclerAdapter;
        }

        public final void run() {
            WxRecyclerAdapter<D> wxRecyclerAdapter = this.f165760d;
            wxRecyclerAdapter.mo10297w6(wxRecyclerAdapter.mo85797d6());
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$c */
    public static final class C57919c implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<D> f165761d;

        /* renamed from: e */
        public final /* synthetic */ int f165762e;

        /* renamed from: f */
        public final /* synthetic */ View f165763f;

        /* renamed from: g */
        public final /* synthetic */ D f165764g;

        public C57919c(WxRecyclerAdapter<D> wxRecyclerAdapter, int i, View view, D d) {
            this.f165761d = wxRecyclerAdapter;
            this.f165762e = i;
            this.f165763f = view;
            this.f165764g = d;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            RecyclerView.C16631z F0 = this.f165761d.mo85797d6().mo17021F0(view);
            int j = F0 != null ? F0.mo17363j() : this.f165762e;
            C60897k<D> kVar = this.f165761d.f165746y;
            if (kVar != null) {
                View view2 = this.f165763f;
                C87412m.m108593f(motionEvent, "event");
                z = kVar.mo2040b(view2, motionEvent, this.f165764g, j);
            } else {
                z = false;
            }
            C117292a.m165362h(z, this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z;
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$d */
    public static final class C57920d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<D> f165765d;

        /* renamed from: e */
        public final /* synthetic */ int f165766e;

        /* renamed from: f */
        public final /* synthetic */ View f165767f;

        /* renamed from: g */
        public final /* synthetic */ D f165768g;

        public C57920d(WxRecyclerAdapter<D> wxRecyclerAdapter, int i, View view, D d) {
            this.f165765d = wxRecyclerAdapter;
            this.f165766e = i;
            this.f165767f = view;
            this.f165768g = d;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RecyclerView.C16631z F0 = this.f165765d.mo85797d6().mo17021F0(view);
            int j = F0 != null ? F0.mo17363j() : this.f165766e;
            C60897k<D> kVar = this.f165765d.f165746y;
            if (kVar != null) {
                kVar.mo2041c(this.f165767f, this.f165768g, j);
            }
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$e */
    public static final class C57921e implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<D> f165769d;

        /* renamed from: e */
        public final /* synthetic */ int f165770e;

        /* renamed from: f */
        public final /* synthetic */ View f165771f;

        /* renamed from: g */
        public final /* synthetic */ D f165772g;

        public C57921e(WxRecyclerAdapter<D> wxRecyclerAdapter, int i, View view, D d) {
            this.f165769d = wxRecyclerAdapter;
            this.f165770e = i;
            this.f165771f = view;
            this.f165772g = d;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            RecyclerView.C16631z F0 = this.f165769d.mo85797d6().mo17021F0(view);
            int j = F0 != null ? F0.mo17363j() : this.f165770e;
            C60897k<D> kVar = this.f165769d.f165746y;
            boolean a = kVar != null ? kVar.mo2039a(this.f165771f, this.f165772g, j) : false;
            C117292a.m165362h(a, this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return a;
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$f */
    public static final class C57922f extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ RecyclerView f165773a;

        /* renamed from: b */
        public final /* synthetic */ WxRecyclerAdapter<D> f165774b;

        /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$f$a */
        public static final class C57923a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ WxRecyclerAdapter<D> f165775d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView f165776e;

            public C57923a(WxRecyclerAdapter<D> wxRecyclerAdapter, RecyclerView recyclerView) {
                this.f165775d = wxRecyclerAdapter;
                this.f165776e = recyclerView;
            }

            public final void run() {
                WxRecyclerAdapter<D>.a aVar = this.f165775d.f165738D;
                if (aVar != null) {
                    aVar.onScrollStateChanged(this.f165776e, 8);
                }
            }
        }

        public C57922f(RecyclerView recyclerView, WxRecyclerAdapter<D> wxRecyclerAdapter) {
            this.f165773a = recyclerView;
            this.f165774b = wxRecyclerAdapter;
        }

        /* renamed from: b */
        public void mo2556b() {
            mo82623h();
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo82623h();
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            mo82623h();
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            mo82623h();
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            mo82623h();
        }

        /* renamed from: h */
        public final void mo82623h() {
            RecyclerView recyclerView = this.f165773a;
            recyclerView.post(new C57923a(this.f165774b, recyclerView));
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$g */
    public static final class C57924g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<D> f165777d;

        public C57924g(WxRecyclerAdapter<D> wxRecyclerAdapter) {
            this.f165777d = wxRecyclerAdapter;
        }

        public final void run() {
            Log.m105924i("RecyclerViewAdapterEx", "onPause visibleExposeMap.size:" + this.f165777d.f165736B.size() + " sessionExposeMap.size:" + this.f165777d.f165735A.size());
            this.f165777d.f165736B.clear();
            this.f165777d.f165735A.clear();
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$h */
    public static final class C57925h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<D> f165778d;

        public C57925h(WxRecyclerAdapter<D> wxRecyclerAdapter) {
            this.f165778d = wxRecyclerAdapter;
        }

        public final void run() {
            WxRecyclerAdapter<D> wxRecyclerAdapter = this.f165778d;
            WxRecyclerAdapter<D>.a aVar = wxRecyclerAdapter.f165738D;
            if (aVar != null) {
                aVar.onScrollStateChanged(wxRecyclerAdapter.mo85797d6(), 7);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$i */
    public static final class C57926i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9508q f165779d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f165780e;

        public C57926i(C9508q qVar, C60905o oVar) {
            this.f165779d = qVar;
            this.f165780e = oVar;
        }

        public final void run() {
            this.f165779d.f29681b = this.f165780e.f44854d.getMeasuredWidth();
            this.f165779d.f29682c = this.f165780e.f44854d.getMeasuredHeight();
        }
    }

    /* renamed from: com.tencent.mm.view.recyclerview.WxRecyclerAdapter$j */
    public static final class C57927j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C9508q f165781d;

        /* renamed from: e */
        public final /* synthetic */ C60905o f165782e;

        public C57927j(C9508q qVar, C60905o oVar) {
            this.f165781d = qVar;
            this.f165782e = oVar;
        }

        public final void run() {
            this.f165781d.f29681b = this.f165782e.f44854d.getMeasuredWidth();
            this.f165781d.f29682c = this.f165782e.f44854d.getMeasuredHeight();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WxRecyclerAdapter(C9500j jVar, ArrayList arrayList, boolean z, int i, C8480h hVar) {
        this(jVar, arrayList, (i & 4) != 0 ? false : z);
    }

    /* renamed from: A6 */
    public void onViewDetachedFromWindow(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        C60896i iVar = this.f165742u.get(Integer.valueOf(oVar.f44859i));
        if (iVar != null) {
            iVar.mo85791h(oVar);
        }
        super.onViewDetachedFromWindow(oVar);
    }

    /* renamed from: F4 */
    public int mo82597F4() {
        return this.data.size();
    }

    /* renamed from: G4 */
    public long mo82598G4(int i) {
        return ((C9493c) this.data.get(i)).getItemId();
    }

    /* renamed from: N5 */
    public RecyclerView.C16631z mo82599N5(ViewGroup viewGroup, int i, C60898l.C60899a aVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(aVar, "info");
        C60896i<C60898l.C60899a> s6 = mo82610s6(i);
        long uptimeMillis = SystemClock.uptimeMillis();
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(s6.mo43c(), viewGroup, false);
        Log.m105918d("RecyclerViewAdapterEx", "CreateView Cost=" + (SystemClock.uptimeMillis() - uptimeMillis) + "ms viewType=" + i);
        C60905o oVar = new C60905o(inflate);
        oVar.f173504F = mo85797d6();
        RecyclerView recyclerView = (RecyclerView) viewGroup;
        s6.mo45f(recyclerView, oVar, i);
        oVar.f173500B = recyclerView.getAdapter();
        return oVar;
    }

    /* renamed from: O4 */
    public int mo82600O4(int i) {
        return ((C9493c) this.data.get(i)).mo75c();
    }

    /* renamed from: O5 */
    public RecyclerView.C16631z mo82601O5(ViewGroup viewGroup, int i, C60898l.C60899a aVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(aVar, "info");
        C60896i<C60898l.C60899a> t6 = mo82611t6(i);
        long uptimeMillis = SystemClock.uptimeMillis();
        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(t6.mo43c(), viewGroup, false);
        Log.m105924i("RecyclerViewAdapterEx", "CreateView Cost=" + (SystemClock.uptimeMillis() - uptimeMillis) + "ms viewType=" + i);
        C60905o oVar = new C60905o(inflate);
        oVar.f173504F = mo85797d6();
        RecyclerView recyclerView = (RecyclerView) viewGroup;
        t6.mo45f(recyclerView, oVar, i);
        oVar.f173500B = recyclerView.getAdapter();
        return oVar;
    }

    /* renamed from: P5 */
    public RecyclerView.C16631z mo82602P5(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        C60896i u6 = mo82613u6(i);
        long uptimeMillis = SystemClock.uptimeMillis();
        View a = u6.mo13760a(mo85797d6());
        if (a == null) {
            a = C85868k2.m106137b(viewGroup.getContext()).inflate(u6.mo43c(), viewGroup, false);
        }
        Log.m105924i("RecyclerViewAdapterEx", "CreateView Cost=" + (SystemClock.uptimeMillis() - uptimeMillis) + "ms viewType=" + i + " hashCode=" + a.hashCode());
        C60905o b = u6.mo25318b(mo85797d6(), a);
        if (b == null) {
            b = new C60905o(a);
        }
        b.f173504F = mo85797d6();
        u6.mo45f(mo85797d6(), b, i);
        b.f173500B = mo85797d6().getAdapter();
        return b;
    }

    /* renamed from: X5 */
    public void mo82603X5(RecyclerView.C16631z zVar, boolean z) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(oVar, "holder");
        if (z) {
            if (oVar.f29679z == null) {
                oVar.mo10193y();
            }
            C0000n0 n0Var = oVar.f29679z;
            if (n0Var != null) {
                this.f165743v.put(n0Var, new Object());
                return;
            }
            return;
        }
        C0000n0 n0Var2 = oVar.f29679z;
        if (n0Var2 != null) {
            this.f165743v.remove(n0Var2);
        }
        oVar.mo10193y();
        C0000n0 n0Var3 = oVar.f29679z;
        if (n0Var3 != null) {
            this.f165743v.put(n0Var3, new Object());
        }
    }

    /* renamed from: Z5 */
    public void mo82604Z5(RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(oVar, "holder");
        C0000n0 n0Var = oVar.f29679z;
        if (n0Var != null) {
            this.f165743v.remove(n0Var);
        }
        oVar.mo10193y();
        C0000n0 n0Var2 = oVar.f29679z;
        if (n0Var2 != null) {
            this.f165743v.put(n0Var2, new Object());
        }
    }

    /* renamed from: g5 */
    public void mo82605g5(RecyclerView.C16631z zVar, int i, C60898l.C60899a aVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "info");
        super.mo82605g5(oVar, i, aVar);
        int itemViewType = getItemViewType(i);
        oVar.f173504F = mo85797d6();
        oVar.f173503E = aVar;
        mo82610s6(itemViewType).mo44e(oVar, aVar, i, itemViewType, false, (List<Object>) null);
    }

    public final List<D> getData() {
        return this.data;
    }

    /* renamed from: n6 */
    public RecyclerView.C16631z mo82607n6(View view) {
        C87412m.m108594g(view, "view");
        if (view.getParent() != null) {
            Log.m105920e("RecyclerViewAdapterEx", String.valueOf(Util.getStack()));
        }
        return new C60905o(view);
    }

    /* renamed from: o6 */
    public void mo10426w5(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        int itemViewType = getItemViewType(mo85796c6() + i);
        D d = this.data.get(i);
        C87412m.m108593f(d, "data[position]");
        C9493c cVar = (C9493c) d;
        oVar.f173503E = cVar;
        oVar.f173504F = mo85797d6();
        Log.m105924i("RecyclerViewAdapterEx", "_onBindViewHolder pos:" + i + ", item:" + cVar.hashCode() + " ry=" + oVar.mo85811C().hashCode());
        mo82613u6(itemViewType).mo44e(oVar, cVar, i, itemViewType, false, (List<Object>) null);
        View view = oVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        mo82609r6(view, cVar, i);
        if (this.f165745x) {
            this.f165745x = false;
            mo85797d6().post(new C57918b(this));
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        for (Map.Entry<Integer, C60896i<?>> value : this.f165742u.entrySet()) {
            C60896i iVar = (C60896i) value.getValue();
            if (!iVar.f173479d) {
                iVar.mo2292d(recyclerView, this);
            }
        }
        if (this.f165741t) {
            WxRecyclerAdapter<D>.a aVar = new C57915a();
            recyclerView.mo17043c(aVar);
            this.f165738D = aVar;
            C57922f fVar = new C57922f(recyclerView, this);
            registerAdapterDataObserver(fVar);
            this.f165739E = fVar;
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        for (Map.Entry<C0000n0, Object> key : this.f165743v.entrySet()) {
            C53930o0.m60558e((C0000n0) key.getKey(), (CancellationException) null, 1, (Object) null);
        }
        for (Map.Entry<Integer, C60896i<?>> value : this.f165742u.entrySet()) {
            C60896i iVar = (C60896i) value.getValue();
            if (iVar.f173479d) {
                iVar.mo2296g(recyclerView);
            }
        }
        RecyclerView.C16615g gVar = this.f165739E;
        if (gVar != null) {
            unregisterAdapterDataObserver(gVar);
        }
    }

    public void onViewRecycled(RecyclerView.C16631z zVar) {
        C60896i iVar;
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(oVar, "holder");
        Log.m105924i("RecyclerViewAdapterEx", "onViewRecycled viewType=" + oVar.f44859i + " hashCode=" + oVar.f44854d.hashCode());
        C0000n0 n0Var = oVar.f29679z;
        if (n0Var != null) {
            this.f165743v.remove(n0Var);
        }
        C0000n0 n0Var2 = oVar.f29679z;
        if (n0Var2 != null) {
            C53930o0.m60556c(n0Var2, (CancellationException) null);
        }
        oVar.f29679z = null;
        if (oVar.mo17363j() >= 0 && (iVar = this.f165742u.get(Integer.valueOf(oVar.f44859i))) != null) {
            iVar.mo735i(oVar);
        }
        super.onViewRecycled(oVar);
    }

    /* renamed from: p6 */
    public void mo82615y5(C60905o oVar, int i, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(list, "payloads");
        int itemViewType = getItemViewType(mo85796c6() + i);
        D d = this.data.get(i);
        C87412m.m108593f(d, "data[position]");
        C9493c cVar = (C9493c) d;
        oVar.f173504F = mo85797d6();
        oVar.f173503E = cVar;
        mo82613u6(itemViewType).mo44e(oVar, cVar, i, itemViewType, true, list);
        View view = oVar.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        mo82609r6(view, cVar, i);
    }

    /* renamed from: r6 */
    public final void mo82609r6(View view, D d, int i) {
        if (mo6267v6()) {
            view.setOnTouchListener(new C57919c(this, i, view, d));
            view.setOnClickListener(new C57920d(this, i, view, d));
            view.setOnLongClickListener(new C57921e(this, i, view, d));
        }
    }

    /* renamed from: s6 */
    public final C60896i<C60898l.C60899a> mo82610s6(int i) {
        C60896i<?> iVar = this.f165742u.get(Integer.valueOf(i));
        if (iVar == null) {
            iVar = this.f165740s.getItemConvert(i);
            C87412m.m108592e(iVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.ItemConvert<com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx.FixedViewInfo>");
            this.f165742u.put(Integer.valueOf(i), iVar);
            if (!iVar.f173479d) {
                iVar.mo2292d(mo85797d6(), this);
            }
        }
        return iVar;
    }

    /* renamed from: t6 */
    public final C60896i<C60898l.C60899a> mo82611t6(int i) {
        C60896i<?> iVar = this.f165742u.get(Integer.valueOf(i));
        if (iVar == null) {
            iVar = this.f165740s.getItemConvert(i);
            this.f165742u.put(Integer.valueOf(i), iVar);
            if (!iVar.f173479d) {
                iVar.mo2292d(mo85797d6(), this);
            }
        }
        return iVar;
    }

    /* renamed from: u5 */
    public void mo82612u5(RecyclerView.C16631z zVar, int i, C60898l.C60899a aVar) {
        C60905o oVar = (C60905o) zVar;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(aVar, "info");
        super.mo82612u5(oVar, i, aVar);
        int itemViewType = getItemViewType(i);
        oVar.f173504F = mo85797d6();
        oVar.f173503E = aVar;
        mo82611t6(itemViewType).mo44e(oVar, aVar, i, itemViewType, false, (List<Object>) null);
    }

    /* renamed from: u6 */
    public final C60896i<D> mo82613u6(int i) {
        C60896i<?> iVar = this.f165742u.get(Integer.valueOf(i));
        if (iVar == null) {
            iVar = this.f165740s.getItemConvert(i);
            C87412m.m108592e(iVar, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.ItemConvert<D of com.tencent.mm.view.recyclerview.WxRecyclerAdapter>");
            this.f165742u.put(Integer.valueOf(i), iVar);
            if (!iVar.f173479d) {
                iVar.mo2292d(mo85797d6(), this);
            }
        }
        return iVar;
    }

    /* renamed from: v6 */
    public boolean mo6267v6() {
        return this instanceof C55068a;
    }

    /* renamed from: w6 */
    public void mo10297w6(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        WxRecyclerAdapter<D>.a aVar = this.f165738D;
        if (aVar != null) {
            aVar.onScrollStateChanged(recyclerView, 5);
        }
    }

    /* renamed from: x6 */
    public final void mo82614x6() {
        mo85797d6().post(new C57924g(this));
    }

    /* renamed from: y6 */
    public final void mo82616y6() {
        mo85797d6().post(new C57925h(this));
    }

    /* renamed from: z6 */
    public void onViewAttachedToWindow(C60905o oVar) {
        C9493c cVar;
        C87412m.m108594g(oVar, "holder");
        super.onViewAttachedToWindow(oVar);
        ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
        if (layoutParams != null && (cVar = (C9493c) oVar.f173503E) != null) {
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                C9508q qVar = new C9508q(((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo17429e(), oVar.f44854d.getMeasuredWidth(), oVar.f44854d.getMeasuredHeight());
                if (qVar.f29681b == 0 || qVar.f29682c == 0) {
                    oVar.f44854d.post(new C57926i(qVar, oVar));
                }
                this.f165744w.put(cVar.getItemId(), qVar);
                return;
            }
            C9508q qVar2 = new C9508q(0, oVar.f44854d.getMeasuredWidth(), oVar.f44854d.getMeasuredHeight());
            if (qVar2.f29681b == 0 || qVar2.f29682c == 0) {
                oVar.f44854d.post(new C57927j(qVar2, oVar));
            }
            this.f165744w.put(cVar.getItemId(), qVar2);
        }
    }

    public WxRecyclerAdapter(C9500j jVar, ArrayList<D> arrayList, boolean z) {
        C87412m.m108594g(jVar, "itemConvertFactory");
        C87412m.m108594g(arrayList, "data");
        this.f165740s = jVar;
        this.data = arrayList;
        this.f165741t = z;
        this.f165742u = new ConcurrentHashMap<>();
        this.f165743v = new ConcurrentHashMap<>();
        this.f165744w = new LongSparseArray<>();
        this.f165745x = true;
        this.f165747z = new LongSparseArray<>();
        this.f165735A = new LongSparseArray<>();
        this.f165736B = new LongSparseArray<>();
    }
}
