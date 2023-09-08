package qp1;

import dj1.C58272a1;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import op1.C62084h;
import te3.C64370fp1;

/* renamed from: qp1.j */
public final class C63315j implements C58272a1.C58273a {

    /* renamed from: d */
    public static final HashMap<Long, C63316a> f179661d = new HashMap<>();

    /* renamed from: a */
    public final long f179662a;

    /* renamed from: b */
    public final C64370fp1 f179663b;

    /* renamed from: c */
    public final WeakReference<C62084h> f179664c;

    /* renamed from: qp1.j$a */
    public static final class C63316a {

        /* renamed from: a */
        public final long f179665a;

        /* renamed from: b */
        public int f179666b;

        /* renamed from: c */
        public long f179667c;

        /* renamed from: d */
        public boolean f179668d;

        public C63316a(long j, int i, long j2, boolean z, int i2, C8480h hVar) {
            i = (i2 & 2) != 0 ? 1 : i;
            j2 = (i2 & 4) != 0 ? System.currentTimeMillis() : j2;
            z = (i2 & 8) != 0 ? false : z;
            this.f179665a = j;
            this.f179666b = i;
            this.f179667c = j2;
            this.f179668d = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C63316a)) {
                return false;
            }
            C63316a aVar = (C63316a) obj;
            return this.f179665a == aVar.f179665a && this.f179666b == aVar.f179666b && this.f179667c == aVar.f179667c && this.f179668d == aVar.f179668d;
        }

        public int hashCode() {
            long j = this.f179665a;
            long j2 = this.f179667c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.f179666b) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.f179668d;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "RefreshNote(productId=" + this.f179665a + ", refreshTimes=" + this.f179666b + ", lastRefreshTime=" + this.f179667c + ", refreshing=" + this.f179668d + ')';
        }
    }

    public C63315j(long j, C64370fp1 fp12, WeakReference<C62084h> weakReference) {
        C87412m.m108594g(fp12, "product");
        C87412m.m108594g(weakReference, "rAdapter");
        this.f179662a = j;
        this.f179663b = fp12;
        this.f179664c = weakReference;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: te3.fp1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75796a(dj1.C58272a1 r7, int r8, int r9, java.lang.String r10, te3.C50512n91 r11) {
        /*
            r6 = this;
            java.lang.String r10 = "cgi"
            gy3.C87412m.m108594g(r7, r10)
            java.lang.String r10 = "resp"
            gy3.C87412m.m108594g(r11, r10)
            te3.fp1 r10 = r6.f179663b
            long r0 = r10.f183176d
            java.util.HashMap<java.lang.Long, qp1.j$a> r10 = f179661d
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r10 = r10.get(r0)
            qp1.j$a r10 = (qp1.C63315j.C63316a) r10
            r0 = 0
            if (r10 != 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r10.f179668d = r0
        L_0x0020:
            te3.m91 r10 = r7.f166858v
            long r1 = r10.f184244i
            long r3 = r6.f179662a
            java.lang.String r10 = "ProductRefreshPresenter"
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "liveId not match: "
            r8.append(r9)
            te3.m91 r7 = r7.f166858v
            long r0 = r7.f184244i
            r8.append(r0)
            java.lang.String r7 = " request liveId: "
            r8.append(r7)
            long r0 = r6.f179662a
            r8.append(r0)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r7)
            return
        L_0x004f:
            if (r8 != 0) goto L_0x00e8
            if (r9 != 0) goto L_0x00e8
            java.util.LinkedList<te3.he4> r7 = r11.f138495d
            if (r7 == 0) goto L_0x00e8
            if (r7 == 0) goto L_0x00e8
            java.util.List r7 = sx3.C110818d0.m150912J(r7)
            java.util.Iterator r7 = r7.iterator()
        L_0x0061:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e8
            java.lang.Object r8 = r7.next()
            te3.he4 r8 = (te3.he4) r8
            int r9 = r8.f134586e
            if (r9 != 0) goto L_0x0061
            int r9 = r8.f134585d
            r11 = 2
            if (r9 != r11) goto L_0x0061
            pe3.b r9 = r8.f134587f
            if (r9 == 0) goto L_0x0061
            te3.ym1 r9 = new te3.ym1
            r9.<init>()
            pe3.b r8 = r8.f134587f
            if (r8 == 0) goto L_0x0088
            byte[] r8 = r8.mo123703f()
            goto L_0x0089
        L_0x0088:
            r8 = 0
        L_0x0089:
            r11 = 1
            java.lang.String r1 = ""
            if (r8 != 0) goto L_0x008f
            goto L_0x009d
        L_0x008f:
            r9.parseFrom(r8)     // Catch:{ Exception -> 0x0093 }
            goto L_0x009d
        L_0x0093:
            r8 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r0] = r8
            java.lang.String r8 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r8, r1, r2)
        L_0x009d:
            te3.fp1 r8 = r9.f145400d
            if (r8 == 0) goto L_0x00ca
            long r2 = r8.f183176d
            te3.fp1 r9 = r6.f179663b
            long r4 = r9.f183176d
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x00ca
            java.lang.ref.WeakReference<op1.h> r9 = r6.f179664c
            java.lang.Object r9 = r9.get()
            op1.h r9 = (op1.C62084h) r9
            if (r9 != 0) goto L_0x00bb
            java.lang.String r7 = "refreshProduct suc,but adapter is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
            return
        L_0x00bb:
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            long r3 = r8.f183176d
            op1.t r5 = new op1.t
            r5.<init>(r9, r8, r11, r2)
            r9.mo87153P5(r3, r5)
        L_0x00ca:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "refreshProduct:"
            r9.append(r11)
            if (r8 != 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r1 = r8
        L_0x00d8:
            org.json.JSONObject r8 = o40.C61937h.m72703b(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r8)
            goto L_0x0061
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qp1.C63315j.mo75796a(dj1.a1, int, int, java.lang.String, te3.n91):void");
    }
}
