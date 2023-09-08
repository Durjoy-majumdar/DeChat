package ji1;

import al1.C54130j;
import android.content.Context;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.ratio.RatioLayout;
import d60.C58124b;
import gi1.C59463a;
import gi1.C59465f;
import gy3.C87412m;
import iq3.C60601c;
import java.util.Iterator;
import java.util.LinkedList;
import kg3.C76577a;
import li1.C61295f;
import qj1.C63068w1;
import sx3.C110818d0;

/* renamed from: ji1.a */
public final class C60870a {

    /* renamed from: i */
    public static final int f173420i = C76577a.m92151b(MMApplicationContext.getContext(), 192);

    /* renamed from: a */
    public final Context f173421a;

    /* renamed from: b */
    public final C63068w1 f173422b;

    /* renamed from: c */
    public final RatioLayout f173423c;

    /* renamed from: d */
    public final C60873c f173424d;

    /* renamed from: e */
    public int f173425e = 1;

    /* renamed from: f */
    public int f173426f = 1;

    /* renamed from: g */
    public LinkedList<C59463a> f173427g;

    /* renamed from: h */
    public final C61295f f173428h;

    /* renamed from: ji1.a$a */
    public /* synthetic */ class C60871a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f173429a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[169] = 1;
            f173429a = iArr;
        }
    }

    public C60870a(Context context, C63068w1 w1Var, LivePreviewView livePreviewView, RatioLayout ratioLayout) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(w1Var, "basePlugin");
        C87412m.m108594g(livePreviewView, "previewView");
        C87412m.m108594g(ratioLayout, "ratioLayout");
        this.f173421a = context;
        this.f173422b = w1Var;
        this.f173423c = ratioLayout;
        C60873c cVar = new C60873c(context, w1Var, livePreviewView);
        this.f173424d = cVar;
        C61295f fVar = new C61295f();
        this.f173428h = fVar;
        ratioLayout.setAdapter(cVar);
        ratioLayout.setItemDecoration(fVar);
        ratioLayout.setLayoutManager(new C60601c());
    }

    /* renamed from: a */
    public final void mo85774a(LinkedList<C59463a> linkedList, LinkedList<C59463a> linkedList2, String str) {
        C59465f fVar;
        T t;
        T t2;
        C59465f fVar2;
        C59465f fVar3;
        boolean z;
        Iterator<T> it = linkedList.iterator();
        while (true) {
            fVar = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C59463a) t).f169895b.f169901e == 1) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C59463a aVar = (C59463a) t;
        Iterator<T> it4 = linkedList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it4.next();
            if (C87412m.m108589b(((C59463a) t2).mo84561a(), str)) {
                break;
            }
        }
        C59463a aVar2 = (C59463a) t2;
        C54130j jVar = aVar != null ? aVar.f169894a : null;
        if (aVar != null) {
            aVar.f169894a = aVar2 != null ? aVar2.f169894a : null;
        }
        if (aVar2 != null) {
            aVar2.f169894a = jVar;
        }
        int i = (aVar == null || (fVar3 = aVar.f169895b) == null) ? 0 : fVar3.f169905i;
        C59465f fVar4 = aVar != null ? aVar.f169895b : null;
        if (fVar4 != null) {
            fVar4.f169905i = (aVar2 == null || (fVar2 = aVar2.f169895b) == null) ? 0 : fVar2.f169905i;
        }
        if (aVar2 != null) {
            fVar = aVar2.f169895b;
        }
        if (fVar != null) {
            fVar.f169905i = i;
        }
        int size = linkedList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C59463a aVar3 = (C59463a) C110818d0.m150917O(linkedList2, linkedList.get(i2).f169895b.f169901e - 1);
            if (aVar3 != null) {
                aVar3.f169894a = linkedList.get(i2).f169894a;
                C59465f fVar5 = aVar3.f169895b;
                fVar5.f169904h = false;
                fVar5.f169905i = linkedList.get(i2).f169895b.f169905i;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:278:0x06c1  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0703  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x071e A[LOOP:19: B:283:0x0718->B:285:0x071e, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<gi1.C59463a> mo85775b(int r32, java.util.LinkedList<gi1.C59463a> r33, java.lang.String r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.String r5 = "list"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.String r5 = "curFocusId"
            gy3.C87412m.m108594g(r3, r5)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r5.addAll(r2)
            int r2 = r0.f173425e
            java.lang.String r9 = ""
            r12 = 4
            r14 = 0
            r15 = 3
            r10 = 2
            r6 = 1
            r8 = 0
            if (r2 != r1) goto L_0x00d9
            if (r1 != r10) goto L_0x002c
            goto L_0x00d9
        L_0x002c:
            if (r1 == r12) goto L_0x0033
            if (r1 != r10) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r2 = 0
            goto L_0x0034
        L_0x0033:
            r2 = 1
        L_0x0034:
            if (r2 != 0) goto L_0x0038
            goto L_0x05bb
        L_0x0038:
            java.lang.Object r2 = r5.get(r8)
            java.lang.String r8 = "dataList[0]"
            gy3.C87412m.m108593f(r2, r8)
            gi1.a r2 = (gi1.C59463a) r2
            java.lang.String r8 = r2.mo84561a()
            boolean r8 = gy3.C87412m.m108589b(r8, r3)
            if (r8 == 0) goto L_0x004f
            goto L_0x05bb
        L_0x004f:
            java.util.Iterator r8 = r5.iterator()
            r16 = 0
        L_0x0055:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L_0x009d
            java.lang.Object r17 = r8.next()
            int r18 = r16 + 1
            if (r16 < 0) goto L_0x0099
            r13 = r17
            gi1.a r13 = (gi1.C59463a) r13
            java.lang.String r11 = r13.mo84561a()
            boolean r11 = gy3.C87412m.m108589b(r11, r3)
            if (r11 == 0) goto L_0x0096
            al1.j r3 = r2.f169894a
            al1.j r8 = r13.f169894a
            r2.f169894a = r8
            r13.f169894a = r3
            gi1.f r2 = r2.f169895b
            if (r2 == 0) goto L_0x0080
            int r3 = r2.f169905i
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            if (r2 != 0) goto L_0x0084
            goto L_0x008e
        L_0x0084:
            gi1.f r8 = r13.f169895b
            if (r8 == 0) goto L_0x008b
            int r8 = r8.f169905i
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            r2.f169905i = r8
        L_0x008e:
            gi1.f r2 = r13.f169895b
            if (r2 != 0) goto L_0x0093
            goto L_0x009d
        L_0x0093:
            r2.f169905i = r3
            goto L_0x009d
        L_0x0096:
            r16 = r18
            goto L_0x0055
        L_0x0099:
            sx3.C64197v.m75542k()
            throw r14
        L_0x009d:
            qj1.w1 r2 = r0.f173422b
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.bq2 r2 = r2.f154419p
            java.lang.String r2 = r2.f182319n
            if (r2 != 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r9 = r2
        L_0x00ad:
            int r2 = r5.size()
            java.util.ListIterator r2 = r5.listIterator(r2)
        L_0x00b5:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x00cd
            java.lang.Object r3 = r2.previous()
            r4 = r3
            gi1.a r4 = (gi1.C59463a) r4
            java.lang.String r4 = r4.mo84561a()
            boolean r4 = gy3.C87412m.m108589b(r4, r9)
            if (r4 == 0) goto L_0x00b5
            r14 = r3
        L_0x00cd:
            gi1.a r14 = (gi1.C59463a) r14
            if (r14 == 0) goto L_0x05bb
            gi1.f r2 = r14.f169895b
            int r2 = r2.f169901e
            r0.f173426f = r2
            goto L_0x05bb
        L_0x00d9:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00e7:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x00ff
            java.lang.Object r11 = r5.next()
            r13 = r11
            gi1.a r13 = (gi1.C59463a) r13
            gi1.f r13 = r13.f169895b
            boolean r13 = r13.f169904h
            r13 = r13 ^ r6
            if (r13 == 0) goto L_0x00e7
            r8.add(r11)
            goto L_0x00e7
        L_0x00ff:
            ji1.b r5 = new ji1.b
            r5.<init>()
            java.util.List r5 = sx3.C110818d0.m150943o0(r8, r5)
            r2.addAll(r5)
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x0119
            mi1.a r5 = new mi1.a
            r5.<init>()
            sx3.C77813z.m93909o(r2, r5)
        L_0x0119:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r11 = r2.iterator()
        L_0x0127:
            boolean r13 = r11.hasNext()
            r7 = 9
            if (r13 == 0) goto L_0x015d
            java.lang.Object r13 = r11.next()
            gi1.a r13 = (gi1.C59463a) r13
            gi1.f r14 = r13.f169895b
            int r14 = r14.f169901e
            if (r14 <= 0) goto L_0x0158
            if (r14 <= r7) goto L_0x013e
            goto L_0x0158
        L_0x013e:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            boolean r7 = r8.containsKey(r7)
            if (r7 != 0) goto L_0x0154
            gi1.f r7 = r13.f169895b
            int r7 = r7.f169901e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.put(r7, r13)
            goto L_0x015b
        L_0x0154:
            r5.add(r13)
            goto L_0x015b
        L_0x0158:
            r5.add(r13)
        L_0x015b:
            r14 = 0
            goto L_0x0127
        L_0x015d:
            r11 = 0
            r13 = 1
        L_0x015f:
            r14 = 10
            if (r13 >= r14) goto L_0x0184
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            boolean r14 = r8.containsKey(r14)
            if (r14 != 0) goto L_0x0181
            int r14 = r11 + 1
            java.lang.Object r11 = sx3.C110818d0.m150917O(r5, r11)
            gi1.a r11 = (gi1.C59463a) r11
            if (r11 == 0) goto L_0x017a
            gi1.f r11 = r11.f169895b
            goto L_0x017b
        L_0x017a:
            r11 = 0
        L_0x017b:
            if (r11 != 0) goto L_0x017e
            goto L_0x0180
        L_0x017e:
            r11.f169901e = r13
        L_0x0180:
            r11 = r14
        L_0x0181:
            int r13 = r13 + 1
            goto L_0x015f
        L_0x0184:
            int r5 = r2.size()
            if (r5 <= r6) goto L_0x0192
            mi1.b r5 = new mi1.b
            r5.<init>()
            sx3.C77813z.m93909o(r2, r5)
        L_0x0192:
            r0.f173426f = r6
            if (r1 == r6) goto L_0x0415
            if (r1 == r10) goto L_0x02df
            if (r1 == r15) goto L_0x0209
            if (r1 == r12) goto L_0x019f
            r5 = r2
            goto L_0x05bb
        L_0x019f:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            gi1.a r5 = new gi1.a
            gi1.f r7 = new gi1.f
            r20 = 0
            r21 = 0
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1
            r25 = 0
            r26 = 1
            r27 = 1
            r28 = 0
            r29 = 288(0x120, float:4.04E-43)
            r30 = 0
            r19 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = 0
            r5.<init>(r8, r7)
            r4.add(r5)
            r5 = 0
        L_0x01cb:
            r7 = 8
            if (r5 >= r7) goto L_0x0204
            gi1.a r7 = new gi1.a
            gi1.f r8 = new gi1.f
            int r9 = r5 % 2
            float r9 = (float) r9
            r11 = 1048576000(0x3e800000, float:0.25)
            float r9 = r9 * r11
            r13 = 1056964608(0x3f000000, float:0.5)
            float r20 = r9 + r13
            int r9 = r5 / 2
            float r9 = (float) r9
            float r21 = r9 * r11
            int r24 = r5 + 2
            r25 = 0
            r26 = 2
            r27 = 1
            r28 = 0
            r29 = 288(0x120, float:4.04E-43)
            r30 = 0
            r23 = 1048576000(0x3e800000, float:0.25)
            r19 = r8
            r22 = r23
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r9 = 0
            r7.<init>(r9, r8)
            r4.add(r7)
            int r5 = r5 + 1
            goto L_0x01cb
        L_0x0204:
            r0.mo85774a(r2, r4, r3)
            goto L_0x02dc
        L_0x0209:
            int r3 = r0.f173425e
            if (r3 != r12) goto L_0x028d
            java.util.Iterator r3 = r2.iterator()
        L_0x0211:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x022a
            java.lang.Object r5 = r3.next()
            r8 = r5
            gi1.a r8 = (gi1.C59463a) r8
            gi1.f r8 = r8.f169895b
            int r8 = r8.f169901e
            if (r8 != r6) goto L_0x0226
            r8 = 1
            goto L_0x0227
        L_0x0226:
            r8 = 0
        L_0x0227:
            if (r8 == 0) goto L_0x0211
            goto L_0x022b
        L_0x022a:
            r5 = 0
        L_0x022b:
            gi1.a r5 = (gi1.C59463a) r5
            if (r5 == 0) goto L_0x028d
            qj1.w1 r3 = r0.f173422b
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.bq2 r3 = r3.f154419p
            java.lang.String r3 = r3.f182319n
            if (r3 != 0) goto L_0x023e
            r3 = r9
        L_0x023e:
            java.lang.String r8 = r5.mo84561a()
            boolean r8 = gy3.C87412m.m108589b(r8, r3)
            if (r8 != 0) goto L_0x028d
            java.util.Iterator r8 = r2.iterator()
        L_0x024c:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0264
            java.lang.Object r11 = r8.next()
            r13 = r11
            gi1.a r13 = (gi1.C59463a) r13
            java.lang.String r13 = r13.mo84561a()
            boolean r13 = gy3.C87412m.m108589b(r13, r3)
            if (r13 == 0) goto L_0x024c
            goto L_0x0265
        L_0x0264:
            r11 = 0
        L_0x0265:
            gi1.a r11 = (gi1.C59463a) r11
            if (r11 == 0) goto L_0x028d
            al1.j r3 = r5.f169894a
            al1.j r8 = r11.f169894a
            r5.f169894a = r8
            r11.f169894a = r3
            gi1.f r3 = r5.f169895b
            if (r3 == 0) goto L_0x0278
            int r5 = r3.f169905i
            goto L_0x0279
        L_0x0278:
            r5 = 0
        L_0x0279:
            if (r3 != 0) goto L_0x027c
            goto L_0x0286
        L_0x027c:
            gi1.f r8 = r11.f169895b
            if (r8 == 0) goto L_0x0283
            int r8 = r8.f169905i
            goto L_0x0284
        L_0x0283:
            r8 = 0
        L_0x0284:
            r3.f169905i = r8
        L_0x0286:
            gi1.f r3 = r11.f169895b
            if (r3 != 0) goto L_0x028b
            goto L_0x028d
        L_0x028b:
            r3.f169905i = r5
        L_0x028d:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r5 = 0
        L_0x0293:
            if (r5 >= r7) goto L_0x02c8
            gi1.a r8 = new gi1.a
            gi1.f r11 = new gi1.f
            int r13 = r5 % 3
            float r13 = (float) r13
            r14 = 1051372191(0x3eaaaa9f, float:0.333333)
            float r20 = r13 * r14
            int r13 = r5 / 3
            float r13 = (float) r13
            float r21 = r13 * r14
            int r5 = r5 + 1
            r25 = 0
            r26 = 0
            r27 = 1
            r28 = 0
            r29 = 352(0x160, float:4.93E-43)
            r30 = 0
            r23 = 1051372191(0x3eaaaa9f, float:0.333333)
            r19 = r11
            r22 = r23
            r24 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r13 = 0
            r8.<init>(r13, r11)
            r3.add(r8)
            goto L_0x0293
        L_0x02c8:
            qj1.w1 r5 = r0.f173422b
            androidx.lifecycle.i0 r4 = r5.mo87696x0(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.bq2 r4 = r4.f154419p
            java.lang.String r4 = r4.f182319n
            if (r4 != 0) goto L_0x02d7
            goto L_0x02d8
        L_0x02d7:
            r9 = r4
        L_0x02d8:
            r0.mo85774a(r2, r3, r9)
            r4 = r3
        L_0x02dc:
            r5 = r4
            goto L_0x05bb
        L_0x02df:
            java.util.Iterator r4 = r2.iterator()
        L_0x02e3:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x02fc
            java.lang.Object r5 = r4.next()
            r7 = r5
            gi1.a r7 = (gi1.C59463a) r7
            gi1.f r7 = r7.f169895b
            int r7 = r7.f169901e
            if (r7 != r6) goto L_0x02f8
            r7 = 1
            goto L_0x02f9
        L_0x02f8:
            r7 = 0
        L_0x02f9:
            if (r7 == 0) goto L_0x02e3
            goto L_0x02fd
        L_0x02fc:
            r5 = 0
        L_0x02fd:
            gi1.a r5 = (gi1.C59463a) r5
            java.util.Iterator r4 = r2.iterator()
        L_0x0303:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x031b
            java.lang.Object r7 = r4.next()
            r8 = r7
            gi1.a r8 = (gi1.C59463a) r8
            java.lang.String r8 = r8.mo84561a()
            boolean r8 = gy3.C87412m.m108589b(r8, r3)
            if (r8 == 0) goto L_0x0303
            goto L_0x031c
        L_0x031b:
            r7 = 0
        L_0x031c:
            gi1.a r7 = (gi1.C59463a) r7
            if (r5 == 0) goto L_0x0323
            al1.j r3 = r5.f169894a
            goto L_0x0324
        L_0x0323:
            r3 = 0
        L_0x0324:
            if (r5 != 0) goto L_0x0327
            goto L_0x032f
        L_0x0327:
            if (r7 == 0) goto L_0x032c
            al1.j r4 = r7.f169894a
            goto L_0x032d
        L_0x032c:
            r4 = 0
        L_0x032d:
            r5.f169894a = r4
        L_0x032f:
            if (r7 != 0) goto L_0x0332
            goto L_0x0334
        L_0x0332:
            r7.f169894a = r3
        L_0x0334:
            if (r5 == 0) goto L_0x033d
            gi1.f r3 = r5.f169895b
            if (r3 == 0) goto L_0x033d
            int r3 = r3.f169905i
            goto L_0x033e
        L_0x033d:
            r3 = 0
        L_0x033e:
            if (r5 == 0) goto L_0x0343
            gi1.f r4 = r5.f169895b
            goto L_0x0344
        L_0x0343:
            r4 = 0
        L_0x0344:
            if (r4 != 0) goto L_0x0347
            goto L_0x0353
        L_0x0347:
            if (r7 == 0) goto L_0x0350
            gi1.f r5 = r7.f169895b
            if (r5 == 0) goto L_0x0350
            int r5 = r5.f169905i
            goto L_0x0351
        L_0x0350:
            r5 = 0
        L_0x0351:
            r4.f169905i = r5
        L_0x0353:
            if (r7 == 0) goto L_0x0358
            gi1.f r4 = r7.f169895b
            goto L_0x0359
        L_0x0358:
            r4 = 0
        L_0x0359:
            if (r4 != 0) goto L_0x035c
            goto L_0x035e
        L_0x035c:
            r4.f169905i = r3
        L_0x035e:
            int r3 = r2.size()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            float r5 = (float) r15
            r7 = 1050415214(0x3e9c106e, float:0.30481285)
            float r5 = r5 * r7
            r8 = 1065353216(0x3f800000, float:1.0)
            float r13 = r8 - r5
            r5 = 1077936128(0x40400000, float:3.0)
            float r13 = r13 / r5
            r5 = 1059494506(0x3f269a6a, float:0.6507937)
            float r5 = r5 - r13
            gi1.a r8 = new gi1.a
            gi1.f r9 = new gi1.f
            r20 = 0
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = 0
            r29 = 288(0x120, float:4.04E-43)
            r30 = 0
            r19 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r11 = 0
            r8.<init>(r11, r9)
            r4.add(r8)
            int r3 = r3 + -1
            r8 = 0
        L_0x03a1:
            if (r8 >= r3) goto L_0x03d5
            gi1.a r9 = new gi1.a
            gi1.f r11 = new gi1.f
            float r14 = (float) r10
            float r14 = r14 * r13
            float r12 = (float) r8
            float r12 = r12 * r7
            float r21 = r14 + r12
            int r24 = r8 + 2
            r25 = 0
            r26 = 2
            r27 = 0
            r28 = 0
            r29 = 288(0x120, float:4.04E-43)
            r30 = 0
            r22 = 1051904813(0x3eb2cb2d, float:0.34920636)
            r23 = 1050415214(0x3e9c106e, float:0.30481285)
            r19 = r11
            r20 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = 0
            r9.<init>(r12, r11)
            r4.add(r9)
            int r8 = r8 + 1
            r12 = 4
            goto L_0x03a1
        L_0x03d5:
            java.util.Iterator r3 = r2.iterator()
            r5 = 0
        L_0x03da:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x02dc
            java.lang.Object r7 = r3.next()
            int r8 = r5 + 1
            if (r5 < 0) goto L_0x0410
            gi1.a r7 = (gi1.C59463a) r7
            java.lang.Object r7 = r4.get(r5)
            gi1.a r7 = (gi1.C59463a) r7
            java.lang.Object r9 = r2.get(r5)
            gi1.a r9 = (gi1.C59463a) r9
            al1.j r9 = r9.f169894a
            r7.f169894a = r9
            java.lang.Object r7 = r4.get(r5)
            gi1.a r7 = (gi1.C59463a) r7
            gi1.f r7 = r7.f169895b
            java.lang.Object r5 = r2.get(r5)
            gi1.a r5 = (gi1.C59463a) r5
            gi1.f r5 = r5.f169895b
            int r5 = r5.f169905i
            r7.f169905i = r5
            r5 = r8
            goto L_0x03da
        L_0x0410:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x0415:
            int r3 = r2.size()
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            if (r3 != r6) goto L_0x0448
            gi1.a r3 = new gi1.a
            gi1.f r7 = new gi1.f
            r20 = 0
            r21 = 0
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 480(0x1e0, float:6.73E-43)
            r30 = 0
            r19 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = 0
            r3.<init>(r8, r7)
            r5.add(r3)
            goto L_0x0536
        L_0x0448:
            if (r3 != r10) goto L_0x047b
            r7 = 0
        L_0x044b:
            if (r7 >= r3) goto L_0x0536
            gi1.a r8 = new gi1.a
            gi1.f r11 = new gi1.f
            int r12 = r7 % 2
            float r12 = (float) r12
            r13 = 1056964608(0x3f000000, float:0.5)
            float r20 = r13 * r12
            r21 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            int r7 = r7 + 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 480(0x1e0, float:6.73E-43)
            r30 = 0
            r22 = 1056964608(0x3f000000, float:0.5)
            r19 = r11
            r24 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = 0
            r8.<init>(r12, r11)
            r5.add(r8)
            goto L_0x044b
        L_0x047b:
            if (r3 != r15) goto L_0x04bf
            r7 = 0
        L_0x047e:
            if (r7 >= r3) goto L_0x0536
            gi1.a r8 = new gi1.a
            gi1.f r11 = new gi1.f
            if (r7 != 0) goto L_0x0489
            r20 = 0
            goto L_0x048b
        L_0x0489:
            r20 = 1056964608(0x3f000000, float:0.5)
        L_0x048b:
            if (r7 != 0) goto L_0x0490
            r21 = 0
            goto L_0x0499
        L_0x0490:
            int r12 = r7 + -1
            float r12 = (float) r12
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 * r13
            r21 = r12
        L_0x0499:
            if (r7 != 0) goto L_0x049e
            r23 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04a0
        L_0x049e:
            r23 = 1056964608(0x3f000000, float:0.5)
        L_0x04a0:
            int r7 = r7 + 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 480(0x1e0, float:6.73E-43)
            r30 = 0
            r22 = 1056964608(0x3f000000, float:0.5)
            r19 = r11
            r24 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = 0
            r8.<init>(r12, r11)
            r5.add(r8)
            goto L_0x047e
        L_0x04bf:
            r7 = 4
            if (r3 != r7) goto L_0x04f6
            r7 = 0
        L_0x04c3:
            if (r7 >= r3) goto L_0x0536
            gi1.a r8 = new gi1.a
            gi1.f r11 = new gi1.f
            int r12 = r7 % 2
            float r12 = (float) r12
            r13 = 1056964608(0x3f000000, float:0.5)
            float r20 = r13 * r12
            int r12 = r7 / 2
            float r12 = (float) r12
            float r21 = r13 * r12
            int r7 = r7 + 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 480(0x1e0, float:6.73E-43)
            r30 = 0
            r23 = 1056964608(0x3f000000, float:0.5)
            r19 = r11
            r22 = r23
            r24 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = 0
            r8.<init>(r12, r11)
            r5.add(r8)
            goto L_0x04c3
        L_0x04f6:
            r7 = 5
            if (r7 > r3) goto L_0x04fd
            if (r3 >= r14) goto L_0x04fd
            r7 = 1
            goto L_0x04fe
        L_0x04fd:
            r7 = 0
        L_0x04fe:
            if (r7 == 0) goto L_0x0536
            r7 = 0
        L_0x0501:
            if (r7 >= r3) goto L_0x0536
            gi1.a r8 = new gi1.a
            gi1.f r11 = new gi1.f
            int r12 = r7 % 3
            float r12 = (float) r12
            r13 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r20 = r13 * r12
            int r12 = r7 / 3
            float r12 = (float) r12
            float r21 = r13 * r12
            int r7 = r7 + 1
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 480(0x1e0, float:6.73E-43)
            r30 = 0
            r23 = 1051372203(0x3eaaaaab, float:0.33333334)
            r19 = r11
            r22 = r23
            r24 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r12 = 0
            r8.<init>(r12, r11)
            r5.add(r8)
            goto L_0x0501
        L_0x0536:
            qj1.w1 r3 = r0.f173422b
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.bq2 r3 = r3.f154419p
            java.lang.String r3 = r3.f182319n
            if (r3 != 0) goto L_0x0545
            goto L_0x0546
        L_0x0545:
            r9 = r3
        L_0x0546:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x054f:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x056a
            java.lang.Object r7 = r4.next()
            r8 = r7
            gi1.a r8 = (gi1.C59463a) r8
            java.lang.String r8 = r8.mo84561a()
            boolean r8 = gy3.C87412m.m108589b(r8, r9)
            if (r8 == 0) goto L_0x054f
            r3.add(r7)
            goto L_0x054f
        L_0x056a:
            r7 = 0
            java.lang.Object r3 = sx3.C110818d0.m150917O(r3, r7)
            gi1.a r3 = (gi1.C59463a) r3
            if (r3 == 0) goto L_0x05b8
            r2.remove(r3)
            java.lang.Object r4 = r5.get(r7)
            gi1.a r4 = (gi1.C59463a) r4
            al1.j r3 = r3.f169894a
            r4.f169894a = r3
            gi1.f r3 = r4.f169895b
            r3.f169904h = r7
            r3.f169901e = r6
            int r3 = r2.size()
            r7 = 0
        L_0x058b:
            if (r7 >= r3) goto L_0x05b8
            int r4 = r7 + 1
            java.lang.Object r8 = sx3.C110818d0.m150917O(r5, r4)
            gi1.a r8 = (gi1.C59463a) r8
            if (r8 == 0) goto L_0x05b6
            java.lang.Object r9 = r2.get(r7)
            gi1.a r9 = (gi1.C59463a) r9
            al1.j r9 = r9.f169894a
            r8.f169894a = r9
            gi1.f r8 = r8.f169895b
            r9 = 0
            r8.f169904h = r9
            int r9 = r7 + 2
            r8.f169901e = r9
            java.lang.Object r7 = r2.get(r7)
            gi1.a r7 = (gi1.C59463a) r7
            gi1.f r7 = r7.f169895b
            int r7 = r7.f169905i
            r8.f169905i = r7
        L_0x05b6:
            r7 = r4
            goto L_0x058b
        L_0x05b8:
            r4 = r5
            goto L_0x02dc
        L_0x05bb:
            r0.f173425e = r1
            if (r1 == r15) goto L_0x062a
            r2 = 4
            if (r1 == r2) goto L_0x05ce
            li1.f r2 = r0.f173428h
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2.mo86274b(r3)
            goto L_0x0688
        L_0x05ce:
            li1.f r2 = r0.f173428h
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r8 = 1048576000(0x3e800000, float:0.25)
            r9 = 1056964608(0x3f000000, float:0.5)
            r7.<init>(r9, r8)
            android.graphics.PointF r11 = new android.graphics.PointF
            r12 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r12, r8)
            r4.<init>(r7, r11)
            r3.add(r4)
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r9, r9)
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r12, r9)
            r4.<init>(r7, r8)
            r3.add(r4)
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r8 = 1061158912(0x3f400000, float:0.75)
            r7.<init>(r9, r8)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r12, r8)
            r4.<init>(r7, r9)
            r3.add(r4)
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r9 = 0
            r7.<init>(r8, r9)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r8, r12)
            r4.<init>(r7, r9)
            r3.add(r4)
            r2.mo86274b(r3)
            goto L_0x0688
        L_0x062a:
            li1.f r2 = r0.f173428h
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r8 = 1051372203(0x3eaaaaab, float:0.33333334)
            r9 = 0
            r7.<init>(r9, r8)
            android.graphics.PointF r11 = new android.graphics.PointF
            r12 = 1065353216(0x3f800000, float:1.0)
            r11.<init>(r12, r8)
            r4.<init>(r7, r11)
            r3.add(r4)
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r8 = 1059760811(0x3f2aaaab, float:0.6666667)
            r7.<init>(r9, r8)
            android.graphics.PointF r11 = new android.graphics.PointF
            r11.<init>(r12, r8)
            r4.<init>(r7, r11)
            r3.add(r4)
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r11 = 1051372203(0x3eaaaaab, float:0.33333334)
            r7.<init>(r11, r9)
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>(r11, r12)
            r4.<init>(r7, r13)
            r3.add(r4)
            li1.f$a r4 = new li1.f$a
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r8, r9)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r8, r12)
            r4.<init>(r7, r9)
            r3.add(r4)
            r2.mo86274b(r3)
        L_0x0688:
            int r2 = f173420i
            if (r1 == r10) goto L_0x06b2
            if (r1 == r15) goto L_0x06ab
            r3 = 4
            if (r1 == r3) goto L_0x06a7
            int r3 = r5.size()
            if (r3 != r6) goto L_0x069a
            r3 = 1058013184(0x3f100000, float:0.5625)
            goto L_0x06b5
        L_0x069a:
            r4 = 5
            if (r4 > r3) goto L_0x06a1
            r4 = 7
            if (r3 >= r4) goto L_0x06a1
            goto L_0x06a2
        L_0x06a1:
            r6 = 0
        L_0x06a2:
            if (r6 == 0) goto L_0x06ab
            int r3 = r2 * 1
            goto L_0x06b9
        L_0x06a7:
            r3 = 1066356202(0x3f8f4dea, float:1.1195652)
            goto L_0x06b5
        L_0x06ab:
            float r3 = (float) r2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            goto L_0x06b9
        L_0x06b2:
            r3 = 1059880434(0x3f2c7df2, float:0.6737968)
        L_0x06b5:
            float r4 = (float) r2
            float r4 = r4 * r3
            int r3 = (int) r4
        L_0x06b9:
            com.tencent.mm.view.ratio.RatioLayout r4 = r0.f173423c
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            if (r4 == 0) goto L_0x06c5
            r4.width = r3
            r4.height = r2
        L_0x06c5:
            ji1.c r2 = r0.f173424d
            r2.getClass()
            r2.f173433e = r1
            int r1 = r2.f173437i
            r2.f173437i = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "updateData rightOffestSize: "
            r1.append(r3)
            int r3 = r2.f173437i
            r1.append(r3)
            java.lang.String r3 = " data: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicDecorLayoutAdapter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.util.LinkedList<gi1.a> r1 = r2.f173435g
            r1.clear()
            java.util.LinkedList<gi1.a> r1 = r2.f173435g
            r1.addAll(r5)
            java.util.LinkedList<gi1.a> r1 = r2.f173435g
            int r1 = r1.size()
            if (r1 != 0) goto L_0x070e
            java.lang.String r1 = "updateData clear cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.util.HashMap<java.lang.String, ki1.d> r1 = r2.f173434f
            r1.clear()
        L_0x070e:
            java.util.HashMap<java.lang.String, ki1.d> r1 = r2.f173434f
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0718:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x072f
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            ki1.d r3 = (ki1.C61100d) r3
            r4 = 0
            r3.setCorner(r4)
            goto L_0x0718
        L_0x072f:
            r2.mo85559g()
            ji1.c r1 = r0.f173424d
            r1.mo85559g()
            r0.f173427g = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ji1.C60870a.mo85775b(int, java.util.LinkedList, java.lang.String):java.util.LinkedList");
    }
}
