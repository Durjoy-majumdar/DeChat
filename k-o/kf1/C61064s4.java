package kf1;

import al1.C54130j;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import org.json.JSONObject;
import rx3.C13598b0;

/* renamed from: kf1.s4 */
public final class C61064s4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f173902d;

    /* renamed from: e */
    public final /* synthetic */ C61066t4 f173903e;

    /* renamed from: f */
    public final /* synthetic */ HashMap<String, C54130j> f173904f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61064s4(JSONObject jSONObject, C61066t4 t4Var, HashMap<String, C54130j> hashMap) {
        super(0);
        this.f173902d = jSONObject;
        this.f173903e = t4Var;
        this.f173904f = hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        r3 = z04.C66730w.m78730d(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0138 A[EDGE_INSN: B:91:0x0138->B:34:0x0138 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r16 = this;
            r0 = r16
            org.json.JSONObject r1 = r0.f173902d
            if (r1 != 0) goto L_0x000b
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x000b:
            java.lang.String r2 = "m"
            int r2 = r1.optInt(r2)
            java.lang.String r3 = "a"
            java.lang.String r3 = r1.optString(r3)
            r4 = 0
            if (r3 == 0) goto L_0x0025
            java.lang.Float r3 = z04.C66730w.m78730d(r3)
            if (r3 == 0) goto L_0x0025
            float r3 = r3.floatValue()
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            kf1.t4 r5 = r0.f173903e
            java.lang.String r5 = r5.f173908d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "refreshLayout videoRate: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " windowSize: "
            r6.append(r7)
            kf1.t4 r7 = r0.f173903e
            android.graphics.Point r7 = r7.f173912h
            r6.append(r7)
            java.lang.String r7 = " micMode: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " micData:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            kf1.t4 r5 = r0.f173903e
            r5.getClass()
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x009b
            if (r2 == r7) goto L_0x009b
            if (r2 == r6) goto L_0x006d
            if (r2 == r5) goto L_0x006d
            goto L_0x0183
        L_0x006d:
            kf1.t4 r4 = r0.f173903e
            java.util.HashMap<java.lang.String, al1.j> r9 = r0.f173904f
            mi1.c r10 = mi1.C61482c.f174809a
            java.lang.String r11 = r4.f173913i
            java.lang.Object r11 = r9.get(r11)
            al1.j r11 = (al1.C54130j) r11
            kf1.q4 r12 = new kf1.q4
            r12.<init>(r9)
            java.util.LinkedList r1 = r10.mo86458e(r1, r11, r12)
            gi1.d r9 = new gi1.d
            r9.<init>(r1, r2, r3)
            r4.f173916l = r9
            r4.f173909e = r1
            r10.mo86461h(r1)
            r4.f173910f = r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f173911g = r1
            goto L_0x0183
        L_0x009b:
            kf1.t4 r9 = r0.f173903e
            java.util.HashMap<java.lang.String, al1.j> r10 = r0.f173904f
            mi1.c r11 = mi1.C61482c.f174809a
            java.lang.String r12 = r9.f173913i
            java.lang.Object r12 = r10.get(r12)
            al1.j r12 = (al1.C54130j) r12
            kf1.r4 r13 = new kf1.r4
            r13.<init>(r10)
            java.util.LinkedList r1 = r11.mo86460g(r1, r12, r13)
            gi1.d r10 = new gi1.d
            r10.<init>(r1, r2, r3)
            r9.f173916l = r10
            if (r2 != r7) goto L_0x00d6
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x00c1:
            r4 = 0
        L_0x00c2:
            if (r4 == 0) goto L_0x00c5
            goto L_0x00d6
        L_0x00c5:
            java.lang.String r4 = r9.f173913i
            android.graphics.Point r10 = r9.f173912h
            java.util.LinkedHashMap r3 = r11.mo86457d(r4, r10, r1, r3)
            android.graphics.Point r4 = r9.f173912h
            java.util.LinkedList r1 = r11.mo86454a(r4, r1, r3)
            r9.f173909e = r1
            goto L_0x00d8
        L_0x00d6:
            r9.f173909e = r1
        L_0x00d8:
            java.util.LinkedList<gi1.a> r1 = r9.f173909e
            r11.mo86461h(r1)
            android.graphics.Point r1 = r9.f173912h
            int r3 = r1.x
            if (r3 <= 0) goto L_0x0138
            int r1 = r1.y
            if (r1 > 0) goto L_0x00e8
            goto L_0x0138
        L_0x00e8:
            java.util.LinkedList<gi1.a> r1 = r9.f173909e
            java.util.Iterator r1 = r1.iterator()
        L_0x00ee:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0138
            java.lang.Object r3 = r1.next()
            gi1.a r3 = (gi1.C59463a) r3
            gi1.f r3 = r3.f169895b
            int r4 = r3.f169903g
            if (r4 != r6) goto L_0x00ee
            android.graphics.Point r1 = r9.f173912h
            int r1 = r1.x
            float r4 = r3.f165729a
            float r1 = (float) r1
            float r4 = r4 * r1
            float r3 = r3.f165731c
            float r3 = r3 * r1
            float r1 = r1 - r4
            float r1 = r1 - r3
            java.lang.String r10 = r9.f173908d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getRightOffestSize margin: "
            r11.append(r12)
            r11.append(r1)
            java.lang.String r12 = " windowWidth:"
            r11.append(r12)
            r11.append(r3)
            java.lang.String r12 = " left: "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            float r3 = r3 + r1
            int r1 = (int) r3
            goto L_0x0139
        L_0x0138:
            r1 = 0
        L_0x0139:
            r9.f173910f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.graphics.Point r3 = r9.f173912h
            int r4 = r3.x
            if (r4 <= 0) goto L_0x0181
            int r3 = r3.y
            if (r3 > 0) goto L_0x014b
            goto L_0x0181
        L_0x014b:
            java.util.LinkedList<gi1.a> r10 = r9.f173909e
            java.util.Iterator r10 = r10.iterator()
        L_0x0151:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0181
            java.lang.Object r11 = r10.next()
            gi1.a r11 = (gi1.C59463a) r11
            gi1.f r11 = r11.f169895b
            int r12 = r11.f169903g
            if (r12 != r6) goto L_0x0151
            float r12 = r11.f165729a
            float r13 = (float) r4
            float r12 = r12 * r13
            float r14 = r11.f165730b
            float r15 = (float) r3
            float r14 = r14 * r15
            float r8 = r11.f165731c
            float r8 = r8 * r13
            float r11 = r11.f165732d
            float r11 = r11 * r15
            android.graphics.RectF r13 = new android.graphics.RectF
            float r8 = r8 + r12
            float r11 = r11 + r14
            r13.<init>(r12, r14, r8, r11)
            r1.add(r13)
            r8 = 0
            goto L_0x0151
        L_0x0181:
            r9.f173911g = r1
        L_0x0183:
            kf1.t4 r1 = r0.f173903e
            java.util.LinkedList<gi1.a> r3 = r1.f173909e
            int r3 = r3.size()
            java.util.HashMap<java.lang.String, al1.j> r4 = r0.f173904f
            if (r2 == r7) goto L_0x01ad
            if (r2 == r6) goto L_0x01aa
            if (r2 == r5) goto L_0x01a7
            java.lang.String r2 = r1.f173914j
            java.lang.Object r2 = r4.get(r2)
            if (r2 == 0) goto L_0x019e
            dl1.a r2 = dl1.C58321a.NORMAL_PK_MODE
            goto L_0x01af
        L_0x019e:
            r2 = 4
            if (r3 > r2) goto L_0x01a4
            dl1.a r2 = dl1.C58321a.NORMAL_4_MODE
            goto L_0x01af
        L_0x01a4:
            dl1.a r2 = dl1.C58321a.NORMAL_5_9_MULTI_MODE
            goto L_0x01af
        L_0x01a7:
            dl1.a r2 = dl1.C58321a.GRAB_FOCUS_9_MODE
            goto L_0x01af
        L_0x01aa:
            dl1.a r2 = dl1.C58321a.GRAB_9_MODE
            goto L_0x01af
        L_0x01ad:
            dl1.a r2 = dl1.C58321a.NORMAL_FOCUS
        L_0x01af:
            r1.f173915k = r2
            kf1.t4 r1 = r0.f173903e
            java.util.LinkedList<gi1.a> r2 = r1.f173909e
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x01ba:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01fc
            java.lang.Object r4 = r2.next()
            gi1.a r4 = (gi1.C59463a) r4
            al1.j r5 = r4.f169894a
            if (r5 == 0) goto L_0x01d0
            boolean r6 = r5.f152004h
            if (r6 != r7) goto L_0x01d0
            r6 = 1
            goto L_0x01d1
        L_0x01d0:
            r6 = 0
        L_0x01d1:
            if (r6 != 0) goto L_0x01e1
            if (r5 == 0) goto L_0x01d8
            java.lang.String r5 = r5.f151997a
            goto L_0x01d9
        L_0x01d8:
            r5 = 0
        L_0x01d9:
            java.lang.String r6 = r1.f173913i
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x01ba
        L_0x01e1:
            al1.j r4 = r4.f169894a
            if (r4 == 0) goto L_0x01eb
            int r5 = r4.f152001e
            if (r5 != r7) goto L_0x01eb
            r5 = 1
            goto L_0x01ec
        L_0x01eb:
            r5 = 0
        L_0x01ec:
            if (r5 != 0) goto L_0x01f9
            if (r4 == 0) goto L_0x01f6
            boolean r4 = r4.f152012p
            if (r4 != r7) goto L_0x01f6
            r4 = 1
            goto L_0x01f7
        L_0x01f6:
            r4 = 0
        L_0x01f7:
            if (r4 == 0) goto L_0x01ba
        L_0x01f9:
            int r3 = r3 + 1
            goto L_0x01ba
        L_0x01fc:
            java.lang.String r2 = r1.f173908d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "createCountDownData audio sum111: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            ti1.e r2 = new ti1.e
            kf1.p4 r4 = new kf1.p4
            r4.<init>(r1)
            r2.<init>(r3, r4)
            r1.f173917m = r2
            kf1.t4 r1 = r0.f173903e
            r1.mo85559g()
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C61064s4.invoke():java.lang.Object");
    }
}
