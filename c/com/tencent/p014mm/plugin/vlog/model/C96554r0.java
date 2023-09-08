package com.tencent.p014mm.plugin.vlog.model;

import a23.C0011b;
import a23.C39481a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48912bv2;
import te3.C50177kt1;
import te3.C50308lt1;
import te3.C50601nw;
import te3.C52181yx1;
import te3.C64645q23;
import te3.C64839xt2;
import te3.cs4;

/* renamed from: com.tencent.mm.plugin.vlog.model.r0 */
public final class C96554r0 implements C11385n {

    /* renamed from: d */
    public final MultiProcessMMKV f282589d = MultiProcessMMKV.getSingleMMKV("MicroMsg.VLogDataManager");

    /* renamed from: e */
    public LinkedList<C48912bv2> f282590e = new LinkedList<>();

    /* renamed from: f */
    public C50601nw f282591f;

    /* renamed from: g */
    public Map<Long, String> f282592g = new LinkedHashMap();

    /* renamed from: h */
    public final LinkedList<C106205q0> f282593h = new LinkedList<>();

    /* renamed from: i */
    public C32226l<? super C50308lt1, C13598b0> f282594i;

    /* renamed from: j */
    public List<cs4> f282595j = new ArrayList();

    /* renamed from: n */
    public int f282596n;

    /* renamed from: o */
    public int f282597o;

    /* renamed from: p */
    public int f282598p;

    /* renamed from: q */
    public int f282599q;

    /* renamed from: com.tencent.mm.plugin.vlog.model.r0$a */
    public static final class C96555a {
        public C96555a(C8480h hVar) {
        }
    }

    static {
        new C96555a((C8480h) null);
    }

    public C96554r0() {
        C86709a0.m107524d().mo123455a(1469, this);
        C86709a0.m107524d().mo123455a(2972, this);
    }

    /* renamed from: a */
    public final List<C64839xt2> mo134629a() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T next : this.f282595j) {
            int i2 = i + 1;
            if (i >= 0) {
                C64839xt2 xt22 = new C64839xt2();
                C64645q23 q232 = ((cs4) next).f131933e;
                String str = q232.f184936f;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                xt22.f186387g = str;
                xt22.f186384d = (int) q232.f184935e;
                xt22.f186390j = q232.f184939i;
                String str3 = q232.f184938h;
                if (str3 != null) {
                    str2 = str3;
                }
                xt22.f186389i = str2;
                xt22.f186391n = q232.f184940j;
                arrayList.add(xt22);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r11v2, types: [com.tencent.mm.plugin.vlog.model.a0] */
    /* JADX WARNING: type inference failed for: r11v3, types: [com.tencent.mm.plugin.vlog.model.y0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.p014mm.plugin.vlog.model.C96533c0> mo134630b(te3.cs4 r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.util.LinkedList<te3.cv2> r1 = r1.f131936h
            java.lang.String r2 = "script.materials"
            gy3.C87412m.m108593f(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00b2
            java.lang.Object r3 = r1.next()
            te3.cv2 r3 = (te3.C49053cv2) r3
            java.util.Map<java.lang.Long, java.lang.String> r4 = r0.f282592g
            long r5 = r3.f131973d
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ""
            if (r4 != 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            r3.f131987u = r4
            long r6 = r3.f131974e
            r8 = 2
            r4 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0072
            com.tencent.mm.plugin.vlog.model.y0 r6 = new com.tencent.mm.plugin.vlog.model.y0
            java.util.Map<java.lang.Long, java.lang.String> r7 = r0.f282592g
            long r8 = r3.f131973d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x0057
            r12 = r5
            goto L_0x0058
        L_0x0057:
            r12 = r7
        L_0x0058:
            long r13 = r3.f131981o
            r15 = 0
            boolean r5 = r3.f131982p
            double r7 = r3.f131983q
            float r7 = (float) r7
            long r8 = r3.f131975f
            long r10 = r3.f131976g
            long r21 = r8 + r10
            r11 = r6
            r17 = r5
            r18 = r7
            r19 = r8
            r11.<init>(r12, r13, r15, r17, r18, r19, r21)
            goto L_0x00a1
        L_0x0072:
            r8 = 1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x00a0
            com.tencent.mm.plugin.vlog.model.a0 r6 = new com.tencent.mm.plugin.vlog.model.a0
            java.util.Map<java.lang.Long, java.lang.String> r7 = r0.f282592g
            long r8 = r3.f131973d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x008e
            r12 = r5
            goto L_0x008f
        L_0x008e:
            r12 = r7
        L_0x008f:
            long r13 = r3.f131975f
            long r7 = r3.f131976g
            long r15 = r13 + r7
            r17 = 0
            r18 = 8
            r19 = 0
            r11 = r6
            r11.<init>(r12, r13, r15, r17, r18, r19)
            goto L_0x00a1
        L_0x00a0:
            r6 = r4
        L_0x00a1:
            if (r6 == 0) goto L_0x00ab
            te3.si4 r3 = r3.f131986t
            if (r3 != 0) goto L_0x00a8
            goto L_0x00aa
        L_0x00a8:
            long r3 = r3.f141544d
        L_0x00aa:
            r4 = r6
        L_0x00ab:
            if (r4 == 0) goto L_0x0015
            r2.add(r4)
            goto L_0x0015
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.model.C96554r0.mo134630b(te3.cs4):java.util.List");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C0011b) {
            if (i == 0 && i2 == 0) {
                C52181yx1 yx12 = ((C0011b) yVar).f11e;
                if (yx12 != null) {
                    C50601nw nwVar = yx12.f145559d;
                    this.f282591f = nwVar;
                    MultiProcessMMKV multiProcessMMKV = this.f282589d;
                    C87412m.m108591d(nwVar);
                    multiProcessMMKV.encode("VLOG_CONF", nwVar.toByteArray());
                    C61926c.m72657B("generateVLog", true, new C106207s0(this, this.f282593h));
                    return;
                }
                C87412m.m108603p("response");
                throw null;
            }
            Log.m105928w("MicroMsg.VLogDataManager", "get client from server error, errType = " + i + ", errCode = " + i2);
        } else if (!(yVar instanceof C39481a)) {
        } else {
            if (i == 0 && i2 == 0) {
                C50177kt1 kt12 = ((C39481a) yVar).f106022f;
                if (kt12 != null) {
                    C50308lt1 lt12 = kt12.f137035d;
                    long j = lt12.f137636d;
                    LinkedList<cs4> linkedList = lt12.f137637e;
                    Log.m105924i("MicroMsg.VLogDataManager", "generate vlog response, ret = " + j + ", scripts = " + linkedList);
                    this.f282599q = 0;
                    List<cs4> list = this.f282595j;
                    C87412m.m108593f(linkedList, "scripts");
                    ((ArrayList) list).addAll(0, linkedList);
                    if (!linkedList.isEmpty()) {
                        C32226l<? super C50308lt1, C13598b0> lVar = this.f282594i;
                        if (lVar != null) {
                            lVar.invoke(lt12);
                        }
                    } else {
                        C32226l<? super C50308lt1, C13598b0> lVar2 = this.f282594i;
                        if (lVar2 != null) {
                            lVar2.invoke(null);
                        }
                    }
                    this.f282594i = null;
                    return;
                }
                C87412m.m108603p("response");
                throw null;
            }
            Log.m105928w("MicroMsg.VLogDataManager", "generate vlog from server error, errType = " + i + ", errCode = " + i2);
        }
    }
}
