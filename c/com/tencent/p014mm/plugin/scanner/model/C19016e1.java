package com.tencent.p014mm.plugin.scanner.model;

import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.WxQBarResult;
import fy3.C32226l;
import gy3.C87412m;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.scanner.model.e1 */
public final class C19016e1 {

    /* renamed from: a */
    public static final C19016e1 f53424a = new C19016e1();

    /* renamed from: b */
    public static String f53425b = "";

    /* renamed from: c */
    public static HashMap<Integer, String> f53426c = new HashMap<>();

    /* renamed from: d */
    public static HashMap<Integer, String> f53427d = new HashMap<>();

    /* renamed from: e */
    public static HashMap<Integer, Integer> f53428e = new HashMap<>();

    /* renamed from: f */
    public static HashMap<String, C19018b> f53429f = new HashMap<>();

    /* renamed from: g */
    public static boolean f53430g;

    /* renamed from: h */
    public static boolean f53431h;

    /* renamed from: i */
    public static C19017a f53432i;

    /* renamed from: j */
    public static long f53433j;

    /* renamed from: com.tencent.mm.plugin.scanner.model.e1$a */
    public static final class C19017a {

        /* renamed from: a */
        public final List<WxQBarResult> f53434a;

        /* renamed from: b */
        public final long f53435b;

        /* renamed from: c */
        public long f53436c;

        /* renamed from: d */
        public long f53437d;

        /* renamed from: e */
        public long f53438e;

        /* renamed from: f */
        public long f53439f;

        /* renamed from: g */
        public boolean f53440g;

        public C19017a(List<? extends WxQBarResult> list, long j) {
            C87412m.m108594g(list, "codeResultList");
            this.f53434a = list;
            this.f53435b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C19017a)) {
                return false;
            }
            C19017a aVar = (C19017a) obj;
            return C87412m.m108589b(this.f53434a, aVar.f53434a) && this.f53435b == aVar.f53435b;
        }

        public int hashCode() {
            long j = this.f53435b;
            return (this.f53434a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            return "ScanMultiCodeReportInfo(codeResultList=" + this.f53434a + ", scanCost=" + this.f53435b + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.scanner.model.e1$b */
    public static final class C19018b {

        /* renamed from: a */
        public String f53441a = "";

        /* renamed from: b */
        public String f53442b = "";

        /* renamed from: c */
        public long f53443c;

        /* renamed from: d */
        public long f53444d;

        /* renamed from: e */
        public long f53445e;

        /* renamed from: f */
        public int f53446f;

        /* renamed from: g */
        public long f53447g;

        /* renamed from: h */
        public long f53448h;

        /* renamed from: i */
        public int f53449i;

        public String toString() {
            String format = String.format("ScanReportInfo tabSession: %s, scanSession: %s, show: %d, dismiss: %d, time: %d, exitType: %d", Arrays.copyOf(new Object[]{this.f53441a, this.f53442b, Long.valueOf(this.f53443c), Long.valueOf(this.f53444d), Long.valueOf(this.f53445e), Integer.valueOf(this.f53446f)}, 6));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: A */
    public static final void m20067A(int i) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportStopScan tabId: %d", Integer.valueOf(i));
        if (m20076j(i)) {
            Integer num = f53428e.get(Integer.valueOf(i));
            if (num != null && num.intValue() == 1) {
                f53428e.put(Integer.valueOf(i), 2);
                C115669n.INSTANCE.mo175911u(1259, !f53431h ? 51 : 71);
                return;
            }
            Log.m105920e("MicroMsg.ScanReporter", "alvinluo reportStopScan tab not start or stopped, and ignore");
        } else if (i == 12) {
            Integer num2 = f53428e.get(Integer.valueOf(i));
            if (num2 != null && num2.intValue() == 1) {
                f53428e.put(Integer.valueOf(i), 2);
                C115669n.INSTANCE.mo175911u(1259, 101);
                return;
            }
            Log.m105920e("MicroMsg.ScanReporter", "alvinluo reportStopScan tab not start or stopped, and ignore");
        }
    }

    /* renamed from: B */
    public static final void m20068B(int i, long j) {
        if (i == 12) {
            C19018b g = f53424a.mo24260g(i);
            if (g != null) {
                g.f53443c = j;
            }
            Log.m105919d("MicroMsg.ScanReporter", "alvinluo showScanResult tabId: %d, timestamp: %d", Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: C */
    public static final void m20069C(int i, long j) {
        C19018b g = f53424a.mo24260g(12);
        if (g != null) {
            g.f53447g = j;
            Log.m105919d("MicroMsg.ScanReporter", "alvinluo startScanGoods info: %d, tabSession: %s, scanSession: %s, source: %d, timestamp: %d", Integer.valueOf(g.hashCode()), g.f53441a, g.f53442b, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if ((r7.length() > 0) == true) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20070a(int r7) {
        /*
            r0 = 12
            if (r7 == r0) goto L_0x000b
            boolean r0 = m20076j(r7)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = f53426c
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.put(r0, r2)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2 = 0
            r0[r2] = r1
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = f53426c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r1.get(r3)
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "MicroMsg.ScanReporter"
            java.lang.String r4 = "alvinluo createScanSession tabId: %d, session: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = f53427d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = f53426c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r0 == 0) goto L_0x0061
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x005c
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            if (r1 != r3) goto L_0x0061
            r1 = 1
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            if (r1 == 0) goto L_0x00cd
            if (r7 == 0) goto L_0x0072
            int r1 = r7.length()
            if (r1 <= 0) goto L_0x006e
            r1 = 1
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            if (r1 != r3) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            if (r3 == 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r3 = 44
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.scanner.model.e1$b> r3 = f53429f
            java.lang.Object r3 = r3.get(r1)
            com.tencent.mm.plugin.scanner.model.e1$b r3 = (com.tencent.p014mm.plugin.scanner.model.C19016e1.C19018b) r3
            java.lang.String r4 = "<set-?>"
            if (r3 != 0) goto L_0x00aa
            com.tencent.mm.plugin.scanner.model.e1$b r2 = new com.tencent.mm.plugin.scanner.model.e1$b
            r2.<init>()
            gy3.C87412m.m108594g(r0, r4)
            r2.f53441a = r0
            gy3.C87412m.m108594g(r7, r4)
            r2.f53442b = r7
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.scanner.model.e1$b> r7 = f53429f
            r7.put(r1, r2)
            goto L_0x00cd
        L_0x00aa:
            java.lang.String r1 = ""
            r3.f53441a = r1
            r3.f53442b = r1
            r5 = 0
            r3.f53443c = r5
            r3.f53444d = r5
            r3.f53445e = r5
            r3.f53446f = r2
            r3.f53447g = r5
            r3.getClass()
            r3.f53448h = r5
            r3.f53449i = r2
            gy3.C87412m.m108594g(r0, r4)
            r3.f53441a = r0
            gy3.C87412m.m108594g(r7, r4)
            r3.f53442b = r7
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C19016e1.m20070a(int):void");
    }

    /* renamed from: b */
    public static final void m20071b(int i, long j) {
        if (i == 12) {
            C19018b g = f53424a.mo24260g(i);
            if (g != null) {
                g.f53444d = j;
            }
            Log.m105919d("MicroMsg.ScanReporter", "alvinluo dismissScanResult tabId: %d, timestamp: %d", Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: c */
    public static final void m20072c(int i, boolean z, long j, boolean z2) {
        C19018b g = f53424a.mo24260g(12);
        if (g != null) {
            g.getClass();
            g.f53449i = i != 1 ? i != 2 ? -1 : 2 : 1;
            long j2 = g.f53447g;
            if (j2 > 0 && j > 0) {
                g.f53448h = j - j2;
            }
            if (g.f53448h > 0 || z2) {
                int i2 = z2 ? 3 : z ? 1 : 2;
                Log.m105919d("MicroMsg.ScanReporter", "alvinluo finishScanGoods info: %d, tabSession: %s, scanSession: %s, source: %d, success: %b, timestamp: %d, timeCost: %d, result: %d", Integer.valueOf(g.hashCode()), g.f53441a, g.f53442b, Integer.valueOf(i), Boolean.valueOf(z), Long.valueOf(j), Long.valueOf(g.f53448h), Integer.valueOf(i2));
                C115669n.INSTANCE.mo160131h(18724, g.f53441a, g.f53442b, Integer.valueOf(g.f53449i), Integer.valueOf(i2), Long.valueOf(g.f53448h));
            }
        }
    }

    /* renamed from: e */
    public static final String m20073e(int i) {
        return f53426c.get(Integer.valueOf(i));
    }

    /* renamed from: f */
    public static final String m20074f(int i) {
        return f53427d.get(Integer.valueOf(i));
    }

    /* renamed from: h */
    public static final int m20075h(BaseScanRequest baseScanRequest) {
        boolean z = baseScanRequest instanceof ScanGoodsRequest;
        if (!z || ((ScanGoodsRequest) baseScanRequest).f248902j != 5) {
            return (!z || ((ScanGoodsRequest) baseScanRequest).f248903n != 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: j */
    public static final boolean m20076j(int i) {
        return i == 1 || i == 8 || i == 4;
    }

    /* renamed from: k */
    public static final void m20077k(int i) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportCancelGallery tabId: %d", Integer.valueOf(i));
        if (m20076j(i)) {
            C115669n.INSTANCE.mo175911u(1259, !f53431h ? 56 : 74);
        } else if (i == 12) {
            C115669n.INSTANCE.mo175911u(1259, 104);
        }
    }

    /* renamed from: l */
    public static final void m20078l(int i, int i2, boolean z) {
        String str;
        String str2;
        int i3 = i2;
        C19017a aVar = f53432i;
        if (aVar != null) {
            C87412m.m108591d(aVar);
            C19017a aVar2 = f53432i;
            C87412m.m108591d(aVar2);
            C19017a aVar3 = f53432i;
            C87412m.m108591d(aVar3);
            Log.m105925i("MicroMsg.ScanReporter", "alvinluo reportMultiCode result size: %d, tabSession: %d, scanSession: %d, chooseIndex: %d, resultOpType: %d", Integer.valueOf(aVar.f53434a.size()), Long.valueOf(aVar2.f53436c), Long.valueOf(aVar3.f53437d), Integer.valueOf(i2), Integer.valueOf(i));
            C19017a aVar4 = f53432i;
            C87412m.m108591d(aVar4);
            if (!aVar4.f53440g) {
                C87412m.m108591d(f53432i);
                C19017a aVar5 = f53432i;
                C87412m.m108591d(aVar5);
                aVar5.f53440g = true;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C19017a aVar6 = f53432i;
                C87412m.m108591d(aVar6);
                Iterator<T> it = aVar6.f53434a.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    WxQBarResult wxQBarResult = (WxQBarResult) it.next();
                    if (wxQBarResult != null) {
                        String encode = URLEncoder.encode(wxQBarResult.f56829f, "utf-8");
                        C87412m.m108593f(encode, "encode(codeResult.data, \"utf-8\")");
                        arrayList.add(encode);
                        arrayList2.add(Integer.valueOf(wxQBarResult.f56832i));
                        String str3 = wxQBarResult.f56828e;
                        if (str3 == null) {
                            str3 = str;
                        }
                        arrayList3.add(str3);
                    }
                }
                C19017a aVar7 = f53432i;
                C87412m.m108591d(aVar7);
                if (aVar7.f53438e > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C19017a aVar8 = f53432i;
                    C87412m.m108591d(aVar8);
                    str2 = String.valueOf(currentTimeMillis - aVar8.f53438e);
                } else {
                    str2 = str;
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[15];
                C19017a aVar9 = f53432i;
                C87412m.m108591d(aVar9);
                objArr[0] = Long.valueOf(aVar9.f53437d);
                C19017a aVar10 = f53432i;
                C87412m.m108591d(aVar10);
                objArr[1] = Integer.valueOf(aVar10.f53434a.size());
                Object[] objArr2 = objArr;
                C115669n nVar2 = nVar;
                ArrayList arrayList4 = arrayList3;
                ArrayList arrayList5 = arrayList2;
                String S = C110818d0.m150921S(arrayList, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                Log.m105924i("MicroMsg.ScanReporter", "alvinluo reportMultiCode result: " + S);
                C13598b0 b0Var = C13598b0.f38549a;
                objArr2[2] = S;
                String S2 = C110818d0.m150921S(arrayList5, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                Log.m105926v("MicroMsg.ScanReporter", "alvinluo reportMultiCode type: " + S2);
                objArr2[3] = S2;
                objArr2[4] = Integer.valueOf(i);
                String str4 = (String) C110818d0.m150917O(arrayList, i3);
                if (str4 != null) {
                    str = str4;
                }
                objArr2[5] = str;
                Integer num = (Integer) C110818d0.m150917O(arrayList5, i3);
                objArr2[6] = Integer.valueOf(num != null ? num.intValue() : 0);
                C19017a aVar11 = f53432i;
                C87412m.m108591d(aVar11);
                objArr2[7] = Long.valueOf(aVar11.f53435b);
                C19017a aVar12 = f53432i;
                C87412m.m108591d(aVar12);
                objArr2[8] = Long.valueOf(aVar12.f53436c);
                String S3 = C110818d0.m150921S(arrayList4, "#", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                Log.m105926v("MicroMsg.ScanReporter", "alvinluo reportMultiCode typeName: " + S3);
                objArr2[9] = S3;
                objArr2[10] = str2;
                objArr2[11] = 3;
                objArr2[12] = Integer.valueOf(z ? 1 : 0);
                objArr2[13] = 0;
                objArr2[14] = 7;
                nVar2.mo160131h(19332, objArr2);
            }
        }
    }

    /* renamed from: m */
    public static final void m20079m(int i, boolean z, int i2, int i3) {
        String str;
        int i4 = i;
        C19017a aVar = f53432i;
        if (aVar != null) {
            C87412m.m108591d(aVar);
            C19017a aVar2 = f53432i;
            C87412m.m108591d(aVar2);
            Log.m105925i("MicroMsg.ScanReporter", "alvinluo reportMultiCodeOp tabSession:  %d, scanSession: %d, resultOpType: %d", Long.valueOf(aVar.f53436c), Long.valueOf(aVar2.f53437d), Integer.valueOf(i));
            if (i4 == 4) {
                C19017a aVar3 = f53432i;
                C87412m.m108591d(aVar3);
                aVar3.f53439f = System.currentTimeMillis();
            }
            if (i4 == 6 || i4 == 5) {
                long currentTimeMillis = System.currentTimeMillis();
                C19017a aVar4 = f53432i;
                C87412m.m108591d(aVar4);
                str = String.valueOf(currentTimeMillis - aVar4.f53439f);
            } else if (i4 != 7 || (str = m20074f(i2)) == null) {
                str = "";
            }
            C115669n nVar = C115669n.INSTANCE;
            C19017a aVar5 = f53432i;
            C87412m.m108591d(aVar5);
            C19017a aVar6 = f53432i;
            C87412m.m108591d(aVar6);
            nVar.mo160131h(19332, Long.valueOf(aVar5.f53437d), 0, "", "", Integer.valueOf(i), "", 0, 0, Long.valueOf(aVar6.f53436c), "", str, 3, Integer.valueOf(z ? 1 : 0), Integer.valueOf(i3));
            if (i4 == 4) {
                nVar.mo175911u(1259, 64);
            } else if (i4 == 6) {
                nVar.mo175911u(1259, 65);
            } else if (i4 == 5) {
                nVar.mo175911u(1259, 66);
            }
        }
    }

    /* renamed from: n */
    public static final void m20080n(int i) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportOpenGallery tabId: %d", Integer.valueOf(i));
        if (m20076j(i)) {
            C115669n.INSTANCE.mo175911u(1259, !f53431h ? 55 : 73);
        } else if (i == 12) {
            C115669n.INSTANCE.mo175911u(1259, 103);
        }
    }

    /* renamed from: o */
    public static final void m20081o(int i, boolean z, int i2, int i3) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportScanCodeResult tabId: %d, success: %b, source: %d, codeResultSize: %d", Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
        if (m20076j(i)) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                    }
                }
                if (z) {
                    C115669n.INSTANCE.mo175911u(1259, !f53431h ? 58 : 76);
                    return;
                } else {
                    C115669n.INSTANCE.mo175911u(1259, !f53431h ? 59 : 77);
                    return;
                }
            }
            if (z) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(1259, !f53431h ? 52 : 72);
                if (i3 == 1) {
                    nVar.mo175911u(1259, !f53431h ? 60 : 80);
                } else if (i3 > 1) {
                    nVar.mo175911u(1259, !f53431h ? 61 : 81);
                }
            }
        }
    }

    /* renamed from: p */
    public static final void m20082p(int i, int i2, int i3, int i4, int i5, long j, long j2, int i6) {
        m20083q(i, i2, i3, i4, i5, j, j2, i6 == 2 ? 2 : 1, 0, 0, "", 0, 0);
    }

    /* renamed from: q */
    public static final void m20083q(int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, int i7, int i8, String str, int i9, int i15) {
        String str2;
        int i16 = i4;
        int i17 = i5;
        String str3 = str;
        C87412m.m108594g(str3, "cardTitle");
        if (f53431h) {
            Object f = m20074f(i);
            if (f == null) {
                f = Long.valueOf(System.currentTimeMillis());
            }
            Object e = m20073e(i);
            if (e == null) {
                e = Long.valueOf(System.currentTimeMillis());
            }
            if (i16 > 0 || i17 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i5);
                sb.append(';');
                sb.append(i4);
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            String obj = f.toString();
            String obj2 = e.toString();
            String valueOf = String.valueOf(j2);
            String str4 = f53425b;
            C87412m.m108594g(str2, "actionResult");
            C87412m.m108594g(obj, "tabSession");
            C87412m.m108594g(obj2, "scanSession");
            C87412m.m108594g(valueOf, "detectSession");
            C87412m.m108594g(str4, "enterSession");
            C115669n.INSTANCE.mo160131h(24121, Integer.valueOf(i2), Integer.valueOf(i3), str2, Long.valueOf(j), obj, obj2, valueOf, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), str3, Integer.valueOf(i9), str4, Integer.valueOf(i15));
        }
    }

    /* renamed from: r */
    public static final void m20084r(int i, int i2, int i3, int i4, int i5, long j, long j2, int i6, int i7, int i8, String str, int i9) {
        C87412m.m108594g(str, "cardTitle");
        m20083q(i, i2, i3, i4, i5, j, j2, i6 == 2 ? 2 : 1, i7 + 1, i8, str, 0, i9);
    }

    /* renamed from: s */
    public static final void m20085s(int i, int i2, int i3, long j, long j2) {
        m20083q(i, i2, i3, 0, 0, j, j2, 0, 0, 0, "", 0, 0);
    }

    /* renamed from: t */
    public static final void m20086t(boolean z, int i) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportScanGoodsResult success: %b, source: %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (i == 1) {
            if (z) {
                C115669n.INSTANCE.mo175911u(1259, 102);
            }
        } else if (i == 2) {
            C115669n.INSTANCE.mo175911u(1259, z ? 106 : 107);
        } else if (i == 4 && f53431h) {
            C115669n.INSTANCE.mo175911u(1259, z ? 78 : 79);
        }
    }

    /* renamed from: u */
    public static final void m20087u(int i, int i2, int i3, BaseScanRequest baseScanRequest, int i4) {
        int i5 = i3;
        if (i2 == 12) {
            String str = f53427d.get(Integer.valueOf(i2));
            String str2 = f53426c.get(Integer.valueOf(i2));
            if (!(str == null || str.length() == 0)) {
                if (!(str2 == null || str2.length() == 0)) {
                    C19016e1 e1Var = f53424a;
                    int i6 = i5 != 1 ? i5 != 2 ? -1 : 2 : 1;
                    C13604l<String, String> d = e1Var.mo24259d(baseScanRequest);
                    Log.m105919d("MicroMsg.ScanReporter", "alvinluo reportScanGoodsSuccessResult logId: %d, scene: %d, tabId: %d, tabSession: %s, scanSession: %s, imageSource: %s, result: %d", 18558, Integer.valueOf(i), Integer.valueOf(i2), str, str2, Integer.valueOf(i6), Integer.valueOf(i4));
                    C115669n.INSTANCE.mo160131h(18558, str, str2, Integer.valueOf(i6), Integer.valueOf(i4), Integer.valueOf(i), d.f38555d, d.f38556e, f53425b);
                }
            }
        }
    }

    /* renamed from: v */
    public static final void m20088v(int i, int i2, boolean z) {
        String str = f53427d.get(Integer.valueOf(i));
        if (!(str == null || str.length() == 0)) {
            int i3 = f53424a.mo24261i(i, z);
            Log.m105919d("MicroMsg.ScanReporter", "alvinluo reportScanOperation logId: %d, tabId: %d, tabType: %d, tabSession: %s, op: %d", 18561, Integer.valueOf(i), Integer.valueOf(i3), str, Integer.valueOf(i2));
            C115669n.INSTANCE.mo160131h(18561, str, Integer.valueOf(i3), Integer.valueOf(i2));
        }
    }

    /* renamed from: w */
    public static final void m20089w(int i) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportSelectImageFromGallery tabId: %d", Integer.valueOf(i));
        if (m20076j(i)) {
            C115669n.INSTANCE.mo175911u(1259, !f53431h ? 57 : 75);
        } else if (i == 12) {
            C115669n.INSTANCE.mo175911u(1259, 105);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r0 = f53424a;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m20090x(int r10, int r11, int r12, com.tencent.p014mm.plugin.scanner.api.BaseScanRequest r13) {
        /*
            r0 = 12
            if (r11 == r0) goto L_0x0005
            return
        L_0x0005:
            com.tencent.mm.plugin.scanner.model.e1 r0 = f53424a
            com.tencent.mm.plugin.scanner.model.e1$b r1 = r0.mo24260g(r11)
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            r1.f53446f = r12
            long r2 = r1.f53444d
            long r4 = r1.f53443c
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x001b
            long r2 = r2 - r4
            r1.f53445e = r2
        L_0x001b:
            long r2 = r1.f53445e
            r4 = 0
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            rx3.l r12 = r0.mo24259d(r13)
            r13 = 5
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r2 = 18560(0x4880, float:2.6008E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r0[r4] = r3
            r3 = 1
            r0[r3] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r6 = 2
            r0[r6] = r5
            A r5 = r12.f38555d
            r7 = 3
            r0[r7] = r5
            B r5 = r12.f38556e
            r8 = 4
            r0[r8] = r5
            java.lang.String r5 = "MicroMsg.ScanReporter"
            java.lang.String r9 = "alvinluo reportShowScanResultTime logId: %d, reportInfo: %s, scene: %d, bizId: %s, bizInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 10
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r9 = r1.f53441a
            r5[r4] = r9
            java.lang.String r4 = r1.f53442b
            r5[r3] = r4
            long r3 = r1.f53443c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5[r6] = r3
            long r3 = r1.f53444d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5[r7] = r3
            long r3 = r1.f53445e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r5[r8] = r3
            int r1 = r1.f53446f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r13] = r1
            r13 = 6
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r5[r13] = r10
            r10 = 7
            A r13 = r12.f38555d
            r5[r10] = r13
            r10 = 8
            B r12 = r12.f38556e
            r5[r10] = r12
            r10 = 9
            java.lang.String r12 = f53425b
            r5[r10] = r12
            r0.mo160131h(r2, r5)
        L_0x0097:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            java.util.HashMap<java.lang.Integer, java.lang.String> r11 = f53426c
            java.lang.String r12 = ""
            r11.put(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C19016e1.m20090x(int, int, int, com.tencent.mm.plugin.scanner.api.BaseScanRequest):void");
    }

    /* renamed from: y */
    public static final void m20091y(int i) {
        Log.m105925i("MicroMsg.ScanReporter", "alvinluo reportStartRetry retryType: %d", Integer.valueOf(i));
        if (i == 1) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175911u(1259, 20);
            nVar.mo175911u(1259, 21);
        } else if (i == 2) {
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo175911u(1259, 20);
            nVar2.mo175911u(1259, 22);
        }
    }

    /* renamed from: z */
    public static final void m20092z(int i) {
        Log.m105927v("MicroMsg.ScanReporter", "alvinluo reportStartScan tabId: %d", Integer.valueOf(i));
        if (m20076j(i)) {
            Integer num = f53428e.get(Integer.valueOf(i));
            if (num == null || num.intValue() != 1) {
                f53428e.put(Integer.valueOf(i), 1);
                C115669n.INSTANCE.mo175911u(1259, !f53431h ? 50 : 70);
            }
        } else if (i == 12) {
            Integer num2 = f53428e.get(Integer.valueOf(i));
            if (num2 == null || num2.intValue() != 1) {
                f53428e.put(Integer.valueOf(i), 1);
                C115669n.INSTANCE.mo175911u(1259, 100);
            }
        }
    }

    /* renamed from: d */
    public final C13604l<String, String> mo24259d(BaseScanRequest baseScanRequest) {
        try {
            if ((baseScanRequest instanceof ScanGoodsRequest) && ((ScanGoodsRequest) baseScanRequest).f248902j == 5) {
                Bundle bundle = ((ScanGoodsRequest) baseScanRequest).f248901i;
                String string = bundle != null ? bundle.getString("key_sns_ad_ux_info", "") : "";
                C87412m.m108593f(string, "bizInfo");
                String str = (String) C110818d0.m150917O(C112550d0.m153785U(string, new String[]{"|"}, false, 0, 6, (Object) null), 1);
                if (str == null) {
                    str = "";
                }
                Log.m105919d("MicroMsg.ScanReporter", "alvinluo getBizInfo %s, bizId: %s", string, str);
                return new C13604l<>(str, string);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanReporter", e, "alvinluo getBizId exception", new Object[0]);
        }
        return new C13604l<>("", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if ((r5.length() > 0) == true) goto L_0x003b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.scanner.model.C19016e1.C19018b mo24260g(int r5) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = f53427d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = f53426c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r1.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r3 != r1) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 == 0) goto L_0x005a
            if (r5 == 0) goto L_0x003a
            int r3 = r5.length()
            if (r3 <= 0) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 != r1) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            if (r1 == 0) goto L_0x005a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 44
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.scanner.model.e1$b> r0 = f53429f
            java.lang.Object r5 = r0.get(r5)
            com.tencent.mm.plugin.scanner.model.e1$b r5 = (com.tencent.p014mm.plugin.scanner.model.C19016e1.C19018b) r5
            return r5
        L_0x005a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.scanner.model.C19016e1.mo24260g(int):com.tencent.mm.plugin.scanner.model.e1$b");
    }

    /* renamed from: i */
    public final int mo24261i(int i, boolean z) {
        if (!(i == 1 || i == 8)) {
            if (i == 12) {
                return 2;
            }
            if (i == 3) {
                return 3;
            }
            if (i != 4) {
                return 0;
            }
        }
        return z ? 4 : 1;
    }
}
