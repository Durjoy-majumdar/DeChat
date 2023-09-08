package fa2;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ji3.C9457a;
import p213oh.C89209a;
import tj0.C90507c;

/* renamed from: fa2.b */
public class C20698b implements C20705c {

    /* renamed from: a */
    public static volatile int f58512a;

    /* renamed from: b */
    public static volatile int f58513b;

    /* renamed from: c */
    public static volatile int f58514c;

    /* renamed from: d */
    public static volatile int f58515d;

    /* renamed from: e */
    public static volatile int f58516e;

    /* renamed from: f */
    public static volatile int f58517f;

    /* renamed from: g */
    public static volatile int f58518g;

    /* renamed from: h */
    public static volatile HashMap<String, Integer> f58519h = new HashMap<>();

    /* renamed from: i */
    public static volatile HashMap<String, Integer> f58520i = new HashMap<>();

    /* renamed from: j */
    public static volatile HashMap<String, C20703e> f58521j = new HashMap<>();

    /* renamed from: k */
    public static volatile HashMap<String, List<Long>> f58522k = new HashMap<>();

    /* renamed from: l */
    public static volatile HashMap<String, List<Long>> f58523l = new HashMap<>();

    /* renamed from: m */
    public static volatile HashMap<String, List<Long>> f58524m = new HashMap<>();

    /* renamed from: fa2.b$a */
    public class C20699a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f58525d;

        /* renamed from: e */
        public final /* synthetic */ String f58526e;

        public C20699a(C20698b bVar, String str, String str2) {
            this.f58525d = str;
            this.f58526e = str2;
        }

        public void run() {
            String str = this.f58525d + "-" + MD5Util.getMD5String(this.f58526e);
            synchronized (C20698b.f58520i) {
                if (C20698b.f58519h.containsKey(str)) {
                    C20698b.f58519h.put(str, Integer.valueOf(C20698b.f58519h.get(str).intValue() + 1));
                } else {
                    C20698b.f58519h.put(str, 1);
                }
                C20698b.f58513b++;
            }
        }
    }

    /* renamed from: fa2.b$b */
    public class C20700b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f58527d;

        /* renamed from: e */
        public final /* synthetic */ String f58528e;

        /* renamed from: f */
        public final /* synthetic */ boolean f58529f;

        public C20700b(C20698b bVar, String str, String str2, boolean z) {
            this.f58527d = str;
            this.f58528e = str2;
            this.f58529f = z;
        }

        public void run() {
            String str = this.f58527d + "-" + MD5Util.getMD5String(this.f58528e);
            synchronized (C20698b.f58520i) {
                if (C20698b.f58520i.containsKey(str)) {
                    C20698b.f58520i.put(str, Integer.valueOf(C20698b.f58520i.get(str).intValue() + 1));
                } else {
                    C20698b.f58520i.put(str, 1);
                }
                if (!this.f58529f) {
                    C20698b.f58516e++;
                } else {
                    C20698b.f58515d++;
                }
            }
        }
    }

    /* renamed from: fa2.b$c */
    public class C20701c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f58530d;

        /* renamed from: e */
        public final /* synthetic */ String f58531e;

        /* renamed from: f */
        public final /* synthetic */ long f58532f;

        /* renamed from: g */
        public final /* synthetic */ long f58533g;

        /* renamed from: h */
        public final /* synthetic */ long f58534h;

        /* renamed from: i */
        public final /* synthetic */ boolean f58535i;

        /* renamed from: j */
        public final /* synthetic */ String f58536j;

        /* renamed from: n */
        public final /* synthetic */ long f58537n;

        /* renamed from: o */
        public final /* synthetic */ long f58538o;

        /* renamed from: p */
        public final /* synthetic */ long f58539p;

        /* renamed from: q */
        public final /* synthetic */ C20698b f58540q;

        public C20701c(C20698b bVar, String str, String str2, long j, long j2, long j3, boolean z, String str3, long j4, long j5, long j6) {
            this.f58540q = bVar;
            this.f58530d = str;
            this.f58531e = str2;
            this.f58532f = j;
            this.f58533g = j2;
            this.f58534h = j3;
            this.f58535i = z;
            this.f58536j = str3;
            this.f58537n = j4;
            this.f58538o = j5;
            this.f58539p = j6;
        }

        public void run() {
            String str = this.f58530d + "-" + MD5Util.getMD5String(this.f58531e);
            synchronized (C20698b.f58520i) {
                if (C20698b.f58520i.containsKey(str)) {
                    C20698b.m22653C0(this.f58540q, C20698b.f58522k, str, this.f58532f);
                    C20698b.m22653C0(this.f58540q, C20698b.f58523l, str, this.f58533g);
                    C20698b.m22653C0(this.f58540q, C20698b.f58524m, str, this.f58534h);
                    int intValue = C20698b.f58520i.get(str).intValue() - 1;
                    if (intValue > 0) {
                        C20698b.f58520i.put(str, Integer.valueOf(intValue));
                    } else {
                        C20698b.f58520i.remove(str);
                    }
                    if (!this.f58535i) {
                        C20698b.f58512a = 1;
                        C20698b.f58518g++;
                    } else {
                        C20698b.f58517f++;
                    }
                } else {
                    Log.m105919d("MicroMsg.Audio.AudioReportService", "leonlaudio not exist audioKey, audioId:%s, audioSrc:%s", this.f58530d, this.f58531e);
                }
                if (C20698b.f58519h.containsKey(str)) {
                    int intValue2 = C20698b.f58519h.get(str).intValue() - 1;
                    if (intValue2 > 0) {
                        C20698b.f58519h.put(str, Integer.valueOf(intValue2));
                    } else {
                        C20698b.f58519h.remove(str);
                    }
                }
                if (!this.f58535i && !TextUtils.isEmpty(this.f58536j)) {
                    if (C20698b.f58521j.containsKey(this.f58536j)) {
                        C20703e eVar = C20698b.f58521j.get(this.f58536j);
                        if (eVar != null) {
                            eVar.f58546a++;
                        }
                        eVar.f58549d = this.f58537n;
                        eVar.f58548c = this.f58538o;
                        eVar.f58547b = this.f58539p;
                        C20698b.f58521j.put(this.f58536j, eVar);
                    } else {
                        C20703e eVar2 = new C20703e(this.f58540q);
                        eVar2.f58546a = 1;
                        eVar2.f58549d = this.f58537n;
                        eVar2.f58548c = this.f58538o;
                        eVar2.f58547b = this.f58539p;
                        C20698b.f58521j.put(this.f58536j, eVar2);
                    }
                }
            }
        }
    }

    /* renamed from: fa2.b$d */
    public class C20702d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f58541d;

        /* renamed from: e */
        public final /* synthetic */ long f58542e;

        /* renamed from: f */
        public final /* synthetic */ long f58543f;

        /* renamed from: g */
        public final /* synthetic */ long f58544g;

        public C20702d(String str, long j, long j2, long j3) {
            this.f58541d = str;
            this.f58542e = j;
            this.f58543f = j2;
            this.f58544g = j3;
        }

        public void run() {
            synchronized (C20698b.f58520i) {
                Log.m105919d("MicroMsg.Audio.AudioReportService", "leonlaudio clear appId:%s", this.f58541d);
                String str = "";
                int i = 0;
                int i2 = 0;
                for (Map.Entry next : C20698b.f58519h.entrySet()) {
                    String str2 = (String) next.getKey();
                    i2 += ((Integer) next.getValue()).intValue();
                    if (((Integer) next.getValue()).intValue() > i) {
                        i = ((Integer) next.getValue()).intValue();
                        str = str2;
                    }
                    Log.m105919d("MicroMsg.Audio.AudioReportService", "leonlaudio clear real invoke audioKey:%s, lostCount:%s", str2, next.getValue());
                }
                C20698b.f58519h.clear();
                String str3 = "";
                int i3 = 0;
                int i4 = 0;
                for (Map.Entry next2 : C20698b.f58520i.entrySet()) {
                    String str4 = (String) next2.getKey();
                    i3 += ((Integer) next2.getValue()).intValue();
                    if (((Integer) next2.getValue()).intValue() > i4) {
                        i4 = ((Integer) next2.getValue()).intValue();
                        str3 = str4;
                    }
                    Log.m105919d("MicroMsg.Audio.AudioReportService", "leonlaudio clear audioKey:%s, lostCount:%s", str4, next2.getValue());
                }
                C20698b.f58520i.clear();
                C20698b bVar = C20698b.this;
                C20704f fVar = new C20704f(bVar);
                C20704f fVar2 = new C20704f(bVar);
                C20704f fVar3 = new C20704f(bVar);
                C20698b.m22655w(bVar, fVar, C20698b.f58522k);
                C20698b.m22655w(C20698b.this, fVar2, C20698b.f58523l);
                C20698b.m22655w(C20698b.this, fVar3, C20698b.f58524m);
                C20698b.f58522k.clear();
                C20698b.f58523l.clear();
                C20698b.f58524m.clear();
                Object[] objArr = new Object[23];
                objArr[0] = Integer.valueOf(i2);
                objArr[1] = Integer.valueOf(i);
                objArr[2] = str;
                objArr[3] = Integer.valueOf(fVar.f58550a);
                int i5 = i;
                objArr[4] = Long.valueOf(fVar.f58551b);
                Object[] objArr2 = objArr;
                objArr2[5] = Long.valueOf(fVar.f58552c);
                objArr2[6] = Integer.valueOf(fVar2.f58550a);
                objArr2[7] = Long.valueOf(fVar2.f58551b);
                objArr2[8] = Long.valueOf(fVar2.f58552c);
                objArr2[9] = Integer.valueOf(fVar3.f58550a);
                objArr2[10] = Long.valueOf(fVar3.f58551b);
                objArr2[11] = Long.valueOf(fVar3.f58552c);
                objArr2[12] = Integer.valueOf(i3);
                objArr2[13] = Integer.valueOf(i4);
                objArr2[14] = str3;
                objArr2[15] = Integer.valueOf(C20698b.f58513b);
                objArr2[16] = Integer.valueOf(C20698b.f58514c);
                objArr2[17] = Integer.valueOf(C20698b.f58512a);
                objArr2[18] = Integer.valueOf(C20698b.f58517f);
                objArr2[19] = Integer.valueOf(C20698b.f58518g);
                int i6 = i3;
                objArr2[20] = Long.valueOf(this.f58542e);
                objArr2[21] = Long.valueOf(this.f58543f);
                objArr2[22] = Long.valueOf(this.f58544g);
                Log.m105919d("MicroMsg.Audio.AudioReportService", "leonlaudio clear invokeTotalLostCount:%s, invokeMaxLostCount:%s, invokeMaxLostKey:%s, totalCostCount:%s, totalCostTime:%s, averageCostTime:%s, totalJsCostCount:%s, totalJSCostTime:%s, averageJSCostTime:%s,totalInvokeCostCount:%s, totalInvokeCostTime:%s, averageInvokeCostTime:%s,totalLostCount:%s, maxLostCount:%s, maxLostKey:%s, realInvokeTotalCount:%s, reachMaxPlayerCount:%s, audioPlayerType:%s, useQQAudioPlayerCount:%s, useAudioMixPlayerCount:%s, mixAverageTime:%s, maxCacheBufferSize:%s, realCacheBufferSize:%s", objArr2);
                Log.m105919d("MicroMsg.Audio.AudioReportService", "leonlaudio clear invokeQQAudioPlayerPlayCount:%s, invokeMixPlayerPlayCount:%s, useQQAudioPlayerPlayLostCount:%s, useMixPlayerPlayLostCount:%s, ", Integer.valueOf(C20698b.f58515d), Integer.valueOf(C20698b.f58516e), Integer.valueOf((C20698b.f58515d - C20698b.f58517f) + C20698b.f58514c), Integer.valueOf(C20698b.f58516e - C20698b.f58518g));
                if (fVar.f58550a > 0 && fVar2.f58550a > 0 && fVar3.f58550a > 0) {
                    C115669n.INSTANCE.mo160131h(15686, this.f58541d, Integer.valueOf(i2), Integer.valueOf(i5), str, Integer.valueOf(fVar.f58550a), Long.valueOf(fVar.f58551b), Long.valueOf(fVar.f58552c), Integer.valueOf(fVar2.f58550a), Long.valueOf(fVar2.f58551b), Long.valueOf(fVar2.f58552c), Integer.valueOf(fVar3.f58550a), Long.valueOf(fVar3.f58551b), Long.valueOf(fVar3.f58552c), Integer.valueOf(i6), Integer.valueOf(i4), str3, Integer.valueOf(C20698b.f58513b), Integer.valueOf(C20698b.f58514c), Integer.valueOf(C20698b.f58512a), Integer.valueOf(C20698b.f58517f), Integer.valueOf(C20698b.f58518g), Long.valueOf(this.f58542e), Long.valueOf(this.f58543f), Long.valueOf(this.f58544g), Integer.valueOf((C20698b.f58515d - C20698b.f58517f) + C20698b.f58514c), Integer.valueOf(C20698b.f58516e - C20698b.f58518g));
                    C20698b.this.mo32411D0(C20698b.f58512a, fVar2.f58552c, fVar3.f58552c, fVar.f58552c, i6 + C20698b.f58514c, i2, this.f58543f, this.f58544g, (C20698b.f58515d - C20698b.f58517f) + C20698b.f58514c, C20698b.f58516e - C20698b.f58518g);
                }
                C20698b.f58513b = 0;
                C20698b.f58514c = 0;
                C20698b.f58512a = 0;
                C20698b.f58515d = 0;
                C20698b.f58516e = 0;
                C20698b.f58517f = 0;
                C20698b.f58518g = 0;
                C20698b.m22654K(C20698b.this, this.f58541d);
                C20698b.f58521j.clear();
            }
        }
    }

    /* renamed from: fa2.b$e */
    public class C20703e {

        /* renamed from: a */
        public int f58546a = 0;

        /* renamed from: b */
        public long f58547b = 0;

        /* renamed from: c */
        public long f58548c = 0;

        /* renamed from: d */
        public long f58549d = 0;

        public C20703e(C20698b bVar) {
        }
    }

    /* renamed from: fa2.b$f */
    public class C20704f {

        /* renamed from: a */
        public int f58550a = 0;

        /* renamed from: b */
        public long f58551b = 0;

        /* renamed from: c */
        public long f58552c = 0;

        public C20704f(C20698b bVar) {
        }
    }

    /* renamed from: C0 */
    public static void m22653C0(C20698b bVar, HashMap hashMap, String str, long j) {
        bVar.getClass();
        if (hashMap.containsKey(str)) {
            ((List) hashMap.get(str)).add(Long.valueOf(j));
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        hashMap.put(str, arrayList);
    }

    /* renamed from: K */
    public static void m22654K(C20698b bVar, String str) {
        bVar.getClass();
        for (Map.Entry next : f58521j.entrySet()) {
            C20703e eVar = (C20703e) next.getValue();
            if (eVar != null && eVar.f58546a >= 1) {
                long j = eVar.f58548c;
                if (j == 0) {
                    j = C89209a.m111503e((String) next.getKey());
                }
                C115669n.INSTANCE.mo160131h(16577, str, Long.valueOf(j), Long.valueOf(eVar.f58549d), Long.valueOf(eVar.f58547b), Integer.valueOf(eVar.f58546a), 0);
            }
        }
    }

    /* renamed from: w */
    public static void m22655w(C20698b bVar, C20704f fVar, HashMap hashMap) {
        int i;
        bVar.getClass();
        for (Map.Entry value : hashMap.entrySet()) {
            List list = (List) value.getValue();
            for (int i2 = 0; i2 < list.size(); i2++) {
                fVar.f58551b += ((Long) list.get(i2)).longValue();
            }
            fVar.f58550a += list.size();
        }
        long j = fVar.f58551b;
        if (j > 0 && (i = fVar.f58550a) > 0) {
            fVar.f58552c = j / ((long) i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0796, code lost:
        if (r1 <= 60) goto L_0x07a6;
     */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32411D0(int r43, long r44, long r46, long r48, int r50, int r51, long r52, long r54, int r56, int r57) {
        /*
            r42 = this;
            r0 = r50
            r1 = r51
            r2 = r56
            r3 = r57
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r4.<init>()
            r5 = 971(0x3cb, float:1.36E-42)
            r4.SetID(r5)
            r6 = 0
            r4.SetKey(r6)
            r6 = 1
            r4.SetValue(r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r8.add(r4)
            com.tencent.mars.smc.IDKey r4 = new com.tencent.mars.smc.IDKey
            r4.<init>()
            r4.SetID(r5)
            r4.SetValue(r6)
            r8.add(r4)
            com.tencent.mars.smc.IDKey r9 = new com.tencent.mars.smc.IDKey
            r9.<init>()
            r9.SetID(r5)
            r9.SetValue(r6)
            r8.add(r9)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r10.<init>()
            r10.SetID(r5)
            r10.SetValue(r6)
            r8.add(r10)
            com.tencent.mars.smc.IDKey r11 = new com.tencent.mars.smc.IDKey
            r11.<init>()
            r11.SetID(r5)
            r11.SetValue(r6)
            r8.add(r11)
            com.tencent.mars.smc.IDKey r12 = new com.tencent.mars.smc.IDKey
            r12.<init>()
            r12.SetID(r5)
            r12.SetValue(r6)
            r8.add(r12)
            com.tencent.mars.smc.IDKey r13 = new com.tencent.mars.smc.IDKey
            r13.<init>()
            r13.SetID(r5)
            r13.SetValue(r6)
            r8.add(r13)
            com.tencent.mars.smc.IDKey r14 = new com.tencent.mars.smc.IDKey
            r14.<init>()
            r14.SetID(r5)
            r14.SetValue(r6)
            r8.add(r14)
            com.tencent.mars.smc.IDKey r15 = new com.tencent.mars.smc.IDKey
            r15.<init>()
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            r6.<init>()
            if (r0 <= 0) goto L_0x00ac
            r15.SetID(r5)
            r17 = r6
            r5 = 1
            r15.SetValue(r5)
            r8.add(r15)
            r7 = r17
            r3 = 971(0x3cb, float:1.36E-42)
            r7.SetID(r3)
            r7.SetValue(r5)
            r8.add(r7)
            goto L_0x00af
        L_0x00ac:
            r7 = r6
            r3 = 971(0x3cb, float:1.36E-42)
        L_0x00af:
            com.tencent.mars.smc.IDKey r5 = new com.tencent.mars.smc.IDKey
            r5.<init>()
            com.tencent.mars.smc.IDKey r6 = new com.tencent.mars.smc.IDKey
            r6.<init>()
            if (r1 <= 0) goto L_0x00d8
            r5.SetID(r3)
            r17 = r4
            r3 = 1
            r5.SetValue(r3)
            r8.add(r5)
            r16 = r7
            r7 = 971(0x3cb, float:1.36E-42)
            r6.SetID(r7)
            r7 = r16
            r6.SetValue(r3)
            r8.add(r6)
            goto L_0x00da
        L_0x00d8:
            r17 = r4
        L_0x00da:
            r18 = 30
            r20 = 15
            r22 = 10
            r24 = 6
            r26 = 20
            r28 = 0
            r30 = 90
            r32 = 80
            r34 = 70
            r36 = 60
            r38 = 3
            r40 = 50
            r3 = 1
            if (r43 != 0) goto L_0x0329
            r4 = r17
            r4.SetKey(r3)
            r4 = 2
            r9.SetKey(r4)
            int r4 = (r28 > r44 ? 1 : (r28 == r44 ? 0 : -1))
            if (r4 > 0) goto L_0x0108
            int r4 = (r44 > r38 ? 1 : (r44 == r38 ? 0 : -1))
            if (r4 > 0) goto L_0x0108
            r4 = 3
            goto L_0x0132
        L_0x0108:
            int r4 = (r38 > r44 ? 1 : (r38 == r44 ? 0 : -1))
            if (r4 >= 0) goto L_0x0112
            int r4 = (r44 > r24 ? 1 : (r44 == r24 ? 0 : -1))
            if (r4 > 0) goto L_0x0112
            r4 = 4
            goto L_0x0132
        L_0x0112:
            int r4 = (r24 > r44 ? 1 : (r24 == r44 ? 0 : -1))
            if (r4 >= 0) goto L_0x011c
            int r4 = (r44 > r22 ? 1 : (r44 == r22 ? 0 : -1))
            if (r4 > 0) goto L_0x011c
            r4 = 5
            goto L_0x0132
        L_0x011c:
            int r4 = (r22 > r44 ? 1 : (r22 == r44 ? 0 : -1))
            if (r4 >= 0) goto L_0x0126
            int r4 = (r44 > r20 ? 1 : (r44 == r20 ? 0 : -1))
            if (r4 > 0) goto L_0x0126
            r4 = 6
            goto L_0x0132
        L_0x0126:
            int r4 = (r20 > r44 ? 1 : (r20 == r44 ? 0 : -1))
            if (r4 >= 0) goto L_0x0130
            int r4 = (r44 > r26 ? 1 : (r44 == r26 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            r4 = 7
            goto L_0x0132
        L_0x0130:
            r4 = 8
        L_0x0132:
            r10.SetKey(r4)
            r4 = 11
            r11.SetKey(r4)
            int r4 = (r28 > r46 ? 1 : (r28 == r46 ? 0 : -1))
            if (r4 > 0) goto L_0x0145
            int r4 = (r46 > r24 ? 1 : (r46 == r24 ? 0 : -1))
            if (r4 > 0) goto L_0x0145
            r4 = 12
            goto L_0x018b
        L_0x0145:
            int r4 = (r24 > r46 ? 1 : (r24 == r46 ? 0 : -1))
            if (r4 >= 0) goto L_0x0150
            int r4 = (r46 > r22 ? 1 : (r46 == r22 ? 0 : -1))
            if (r4 > 0) goto L_0x0150
            r4 = 13
            goto L_0x018b
        L_0x0150:
            int r4 = (r22 > r46 ? 1 : (r22 == r46 ? 0 : -1))
            if (r4 >= 0) goto L_0x015b
            int r4 = (r46 > r20 ? 1 : (r46 == r20 ? 0 : -1))
            if (r4 > 0) goto L_0x015b
            r4 = 14
            goto L_0x018b
        L_0x015b:
            int r4 = (r20 > r46 ? 1 : (r20 == r46 ? 0 : -1))
            if (r4 >= 0) goto L_0x0166
            int r4 = (r46 > r26 ? 1 : (r46 == r26 ? 0 : -1))
            if (r4 > 0) goto L_0x0166
            r4 = 15
            goto L_0x018b
        L_0x0166:
            int r4 = (r26 > r46 ? 1 : (r26 == r46 ? 0 : -1))
            if (r4 >= 0) goto L_0x0171
            int r4 = (r46 > r18 ? 1 : (r46 == r18 ? 0 : -1))
            if (r4 > 0) goto L_0x0171
            r4 = 16
            goto L_0x018b
        L_0x0171:
            int r4 = (r18 > r46 ? 1 : (r18 == r46 ? 0 : -1))
            r9 = 40
            if (r4 >= 0) goto L_0x017e
            int r4 = (r46 > r9 ? 1 : (r46 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x017e
            r4 = 17
            goto L_0x018b
        L_0x017e:
            int r4 = (r9 > r46 ? 1 : (r9 == r46 ? 0 : -1))
            if (r4 >= 0) goto L_0x0189
            int r4 = (r46 > r40 ? 1 : (r46 == r40 ? 0 : -1))
            if (r4 > 0) goto L_0x0189
            r4 = 18
            goto L_0x018b
        L_0x0189:
            r4 = 19
        L_0x018b:
            r12.SetKey(r4)
            r4 = 22
            r13.SetKey(r4)
            int r4 = (r28 > r48 ? 1 : (r28 == r48 ? 0 : -1))
            if (r4 > 0) goto L_0x019f
            int r4 = (r48 > r26 ? 1 : (r48 == r26 ? 0 : -1))
            if (r4 > 0) goto L_0x019f
            r4 = 23
            goto L_0x0251
        L_0x019f:
            int r4 = (r26 > r48 ? 1 : (r26 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x01ab
            int r4 = (r48 > r18 ? 1 : (r48 == r18 ? 0 : -1))
            if (r4 > 0) goto L_0x01ab
            r4 = 24
            goto L_0x0251
        L_0x01ab:
            int r4 = (r18 > r48 ? 1 : (r18 == r48 ? 0 : -1))
            r9 = 40
            if (r4 >= 0) goto L_0x01b9
            int r4 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x01b9
            r4 = 25
            goto L_0x0251
        L_0x01b9:
            int r4 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x01c5
            int r4 = (r48 > r40 ? 1 : (r48 == r40 ? 0 : -1))
            if (r4 > 0) goto L_0x01c5
            r4 = 26
            goto L_0x0251
        L_0x01c5:
            int r4 = (r40 > r48 ? 1 : (r40 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x01d1
            int r4 = (r48 > r36 ? 1 : (r48 == r36 ? 0 : -1))
            if (r4 > 0) goto L_0x01d1
            r4 = 27
            goto L_0x0251
        L_0x01d1:
            int r4 = (r36 > r48 ? 1 : (r36 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x01dd
            int r4 = (r48 > r34 ? 1 : (r48 == r34 ? 0 : -1))
            if (r4 > 0) goto L_0x01dd
            r4 = 28
            goto L_0x0251
        L_0x01dd:
            int r4 = (r34 > r48 ? 1 : (r34 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x01e9
            int r4 = (r48 > r32 ? 1 : (r48 == r32 ? 0 : -1))
            if (r4 > 0) goto L_0x01e9
            r4 = 29
            goto L_0x0251
        L_0x01e9:
            int r4 = (r32 > r48 ? 1 : (r32 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x01f4
            int r4 = (r48 > r30 ? 1 : (r48 == r30 ? 0 : -1))
            if (r4 > 0) goto L_0x01f4
            r4 = 30
            goto L_0x0251
        L_0x01f4:
            r9 = 100
            int r4 = (r30 > r48 ? 1 : (r30 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x0201
            int r4 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0201
            r4 = 31
            goto L_0x0251
        L_0x0201:
            r11 = 110(0x6e, double:5.43E-322)
            int r4 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x020e
            int r4 = (r48 > r11 ? 1 : (r48 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x020e
            r4 = 32
            goto L_0x0251
        L_0x020e:
            r9 = 120(0x78, double:5.93E-322)
            int r4 = (r11 > r48 ? 1 : (r11 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x021b
            int r4 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x021b
            r4 = 33
            goto L_0x0251
        L_0x021b:
            r11 = 130(0x82, double:6.4E-322)
            int r4 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x0228
            int r4 = (r48 > r11 ? 1 : (r48 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0228
            r4 = 34
            goto L_0x0251
        L_0x0228:
            r9 = 140(0x8c, double:6.9E-322)
            int r4 = (r11 > r48 ? 1 : (r11 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x0235
            int r4 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x0235
            r4 = 35
            goto L_0x0251
        L_0x0235:
            r11 = 150(0x96, double:7.4E-322)
            int r4 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x0242
            int r4 = (r48 > r11 ? 1 : (r48 == r11 ? 0 : -1))
            if (r4 > 0) goto L_0x0242
            r4 = 36
            goto L_0x0251
        L_0x0242:
            int r4 = (r11 > r48 ? 1 : (r11 == r48 ? 0 : -1))
            if (r4 >= 0) goto L_0x024f
            r9 = 200(0xc8, double:9.9E-322)
            int r4 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r4 > 0) goto L_0x024f
            r4 = 37
            goto L_0x0251
        L_0x024f:
            r4 = 38
        L_0x0251:
            r14.SetKey(r4)
            if (r0 <= 0) goto L_0x02b7
            r4 = 41
            r15.SetKey(r4)
            if (r0 != 0) goto L_0x0260
            r0 = 42
            goto L_0x02b4
        L_0x0260:
            if (r3 > r0) goto L_0x0268
            r4 = 3
            if (r0 > r4) goto L_0x0268
            r0 = 43
            goto L_0x02b4
        L_0x0268:
            r4 = 4
            if (r4 > r0) goto L_0x0271
            r4 = 6
            if (r0 > r4) goto L_0x0271
            r0 = 44
            goto L_0x02b4
        L_0x0271:
            r4 = 7
            if (r4 > r0) goto L_0x027b
            r4 = 10
            if (r0 > r4) goto L_0x027b
            r0 = 45
            goto L_0x02b4
        L_0x027b:
            r4 = 11
            if (r4 > r0) goto L_0x0286
            r4 = 15
            if (r0 > r4) goto L_0x0288
            r0 = 46
            goto L_0x02b4
        L_0x0286:
            r4 = 15
        L_0x0288:
            if (r4 >= r0) goto L_0x0291
            r4 = 20
            if (r0 > r4) goto L_0x0293
            r0 = 47
            goto L_0x02b4
        L_0x0291:
            r4 = 20
        L_0x0293:
            if (r4 >= r0) goto L_0x029c
            r4 = 40
            if (r0 > r4) goto L_0x029e
            r0 = 48
            goto L_0x02b4
        L_0x029c:
            r4 = 40
        L_0x029e:
            if (r4 >= r0) goto L_0x02a7
            r4 = 60
            if (r0 > r4) goto L_0x02a9
            r0 = 49
            goto L_0x02b4
        L_0x02a7:
            r4 = 60
        L_0x02a9:
            if (r4 >= r0) goto L_0x02b2
            r4 = 100
            if (r0 > r4) goto L_0x02b2
            r0 = 50
            goto L_0x02b4
        L_0x02b2:
            r0 = 51
        L_0x02b4:
            r7.SetKey(r0)
        L_0x02b7:
            if (r1 <= 0) goto L_0x0325
            r0 = 124(0x7c, float:1.74E-43)
            r5.SetKey(r0)
            if (r1 != 0) goto L_0x02c4
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x0322
        L_0x02c4:
            r0 = 10
            if (r1 < 0) goto L_0x02cf
            if (r1 > r0) goto L_0x02cf
            r1 = 126(0x7e, float:1.77E-43)
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x0322
        L_0x02cf:
            if (r0 > r1) goto L_0x02da
            r0 = 20
            if (r1 > r0) goto L_0x02dc
            r1 = 127(0x7f, float:1.78E-43)
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x0322
        L_0x02da:
            r0 = 20
        L_0x02dc:
            if (r0 > r1) goto L_0x02e7
            r0 = 40
            if (r1 > r0) goto L_0x02e9
            r1 = 128(0x80, float:1.794E-43)
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0322
        L_0x02e7:
            r0 = 40
        L_0x02e9:
            if (r0 > r1) goto L_0x02f4
            r0 = 60
            if (r1 > r0) goto L_0x02f6
            r1 = 129(0x81, float:1.81E-43)
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x0322
        L_0x02f4:
            r0 = 60
        L_0x02f6:
            if (r0 >= r1) goto L_0x0301
            r0 = 100
            if (r1 > r0) goto L_0x0303
            r1 = 130(0x82, float:1.82E-43)
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x0322
        L_0x0301:
            r0 = 100
        L_0x0303:
            r4 = 150(0x96, float:2.1E-43)
            if (r0 >= r1) goto L_0x030c
            if (r1 > r4) goto L_0x030c
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x0322
        L_0x030c:
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 >= r1) goto L_0x0317
            if (r1 > r0) goto L_0x0317
            r1 = 132(0x84, float:1.85E-43)
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x0322
        L_0x0317:
            if (r0 >= r1) goto L_0x0320
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 > r0) goto L_0x0320
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x0322
        L_0x0320:
            r0 = 134(0x86, float:1.88E-43)
        L_0x0322:
            r6.SetKey(r0)
        L_0x0325:
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x06ae
        L_0x0329:
            r4 = r17
            r3 = 59
            r4.SetKey(r3)
            r3 = 60
            r9.SetKey(r3)
            int r3 = (r28 > r44 ? 1 : (r28 == r44 ? 0 : -1))
            if (r3 >= 0) goto L_0x0340
            int r3 = (r44 > r38 ? 1 : (r44 == r38 ? 0 : -1))
            if (r3 > 0) goto L_0x0340
            r3 = 61
            goto L_0x036e
        L_0x0340:
            int r3 = (r38 > r44 ? 1 : (r38 == r44 ? 0 : -1))
            if (r3 >= 0) goto L_0x034b
            int r3 = (r44 > r24 ? 1 : (r44 == r24 ? 0 : -1))
            if (r3 > 0) goto L_0x034b
            r3 = 62
            goto L_0x036e
        L_0x034b:
            int r3 = (r24 > r44 ? 1 : (r24 == r44 ? 0 : -1))
            if (r3 >= 0) goto L_0x0356
            int r3 = (r44 > r22 ? 1 : (r44 == r22 ? 0 : -1))
            if (r3 > 0) goto L_0x0356
            r3 = 63
            goto L_0x036e
        L_0x0356:
            int r3 = (r22 > r44 ? 1 : (r22 == r44 ? 0 : -1))
            if (r3 >= 0) goto L_0x0361
            int r3 = (r44 > r20 ? 1 : (r44 == r20 ? 0 : -1))
            if (r3 > 0) goto L_0x0361
            r3 = 64
            goto L_0x036e
        L_0x0361:
            int r3 = (r20 > r44 ? 1 : (r20 == r44 ? 0 : -1))
            if (r3 >= 0) goto L_0x036c
            int r3 = (r44 > r26 ? 1 : (r44 == r26 ? 0 : -1))
            if (r3 > 0) goto L_0x036c
            r3 = 65
            goto L_0x036e
        L_0x036c:
            r3 = 66
        L_0x036e:
            r10.SetKey(r3)
            r3 = 69
            r11.SetKey(r3)
            int r3 = (r28 > r46 ? 1 : (r28 == r46 ? 0 : -1))
            if (r3 > 0) goto L_0x0381
            int r3 = (r46 > r24 ? 1 : (r46 == r24 ? 0 : -1))
            if (r3 > 0) goto L_0x0381
            r3 = 70
            goto L_0x03cb
        L_0x0381:
            int r3 = (r24 > r46 ? 1 : (r24 == r46 ? 0 : -1))
            if (r3 >= 0) goto L_0x038c
            int r3 = (r46 > r22 ? 1 : (r46 == r22 ? 0 : -1))
            if (r3 > 0) goto L_0x038c
            r3 = 71
            goto L_0x03cb
        L_0x038c:
            int r3 = (r22 > r46 ? 1 : (r22 == r46 ? 0 : -1))
            if (r3 >= 0) goto L_0x0397
            int r3 = (r46 > r20 ? 1 : (r46 == r20 ? 0 : -1))
            if (r3 > 0) goto L_0x0397
            r3 = 72
            goto L_0x03cb
        L_0x0397:
            int r3 = (r20 > r46 ? 1 : (r20 == r46 ? 0 : -1))
            if (r3 >= 0) goto L_0x03a2
            int r3 = (r46 > r26 ? 1 : (r46 == r26 ? 0 : -1))
            if (r3 > 0) goto L_0x03a2
            r3 = 73
            goto L_0x03cb
        L_0x03a2:
            int r3 = (r26 > r46 ? 1 : (r26 == r46 ? 0 : -1))
            if (r3 >= 0) goto L_0x03ad
            int r3 = (r46 > r18 ? 1 : (r46 == r18 ? 0 : -1))
            if (r3 > 0) goto L_0x03ad
            r3 = 74
            goto L_0x03cb
        L_0x03ad:
            int r3 = (r18 > r46 ? 1 : (r18 == r46 ? 0 : -1))
            if (r3 >= 0) goto L_0x03bc
            r3 = 40
            int r9 = (r46 > r3 ? 1 : (r46 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x03be
            r9 = 75
            r3 = 75
            goto L_0x03cb
        L_0x03bc:
            r3 = 40
        L_0x03be:
            int r9 = (r3 > r46 ? 1 : (r3 == r46 ? 0 : -1))
            if (r9 >= 0) goto L_0x03c9
            int r3 = (r46 > r40 ? 1 : (r46 == r40 ? 0 : -1))
            if (r3 > 0) goto L_0x03c9
            r3 = 76
            goto L_0x03cb
        L_0x03c9:
            r3 = 77
        L_0x03cb:
            r12.SetKey(r3)
            r3 = 80
            r13.SetKey(r3)
            int r3 = (r28 > r48 ? 1 : (r28 == r48 ? 0 : -1))
            if (r3 > 0) goto L_0x03df
            int r3 = (r48 > r26 ? 1 : (r48 == r26 ? 0 : -1))
            if (r3 > 0) goto L_0x03df
            r3 = 81
            goto L_0x0493
        L_0x03df:
            int r3 = (r26 > r48 ? 1 : (r26 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x03eb
            int r3 = (r48 > r18 ? 1 : (r48 == r18 ? 0 : -1))
            if (r3 > 0) goto L_0x03eb
            r3 = 82
            goto L_0x0493
        L_0x03eb:
            int r3 = (r18 > r48 ? 1 : (r18 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x03f9
            r3 = 40
            int r9 = (r48 > r3 ? 1 : (r48 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x03fb
            r3 = 83
            goto L_0x0493
        L_0x03f9:
            r3 = 40
        L_0x03fb:
            int r9 = (r3 > r48 ? 1 : (r3 == r48 ? 0 : -1))
            if (r9 >= 0) goto L_0x0407
            int r3 = (r48 > r40 ? 1 : (r48 == r40 ? 0 : -1))
            if (r3 > 0) goto L_0x0407
            r3 = 84
            goto L_0x0493
        L_0x0407:
            int r3 = (r40 > r48 ? 1 : (r40 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x0413
            int r3 = (r48 > r36 ? 1 : (r48 == r36 ? 0 : -1))
            if (r3 > 0) goto L_0x0413
            r3 = 85
            goto L_0x0493
        L_0x0413:
            int r3 = (r36 > r48 ? 1 : (r36 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x041f
            int r3 = (r48 > r34 ? 1 : (r48 == r34 ? 0 : -1))
            if (r3 > 0) goto L_0x041f
            r3 = 86
            goto L_0x0493
        L_0x041f:
            int r3 = (r34 > r48 ? 1 : (r34 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x042b
            int r3 = (r48 > r32 ? 1 : (r48 == r32 ? 0 : -1))
            if (r3 > 0) goto L_0x042b
            r3 = 87
            goto L_0x0493
        L_0x042b:
            int r3 = (r32 > r48 ? 1 : (r32 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x0436
            int r3 = (r48 > r30 ? 1 : (r48 == r30 ? 0 : -1))
            if (r3 > 0) goto L_0x0436
            r3 = 88
            goto L_0x0493
        L_0x0436:
            r3 = 100
            int r9 = (r30 > r48 ? 1 : (r30 == r48 ? 0 : -1))
            if (r9 >= 0) goto L_0x0443
            int r9 = (r48 > r3 ? 1 : (r48 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0443
            r3 = 89
            goto L_0x0493
        L_0x0443:
            r9 = 110(0x6e, double:5.43E-322)
            int r11 = (r3 > r48 ? 1 : (r3 == r48 ? 0 : -1))
            if (r11 >= 0) goto L_0x0450
            int r3 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0450
            r3 = 90
            goto L_0x0493
        L_0x0450:
            r3 = 120(0x78, double:5.93E-322)
            int r11 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r11 >= 0) goto L_0x045d
            int r9 = (r48 > r3 ? 1 : (r48 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x045d
            r3 = 91
            goto L_0x0493
        L_0x045d:
            r9 = 130(0x82, double:6.4E-322)
            int r11 = (r3 > r48 ? 1 : (r3 == r48 ? 0 : -1))
            if (r11 >= 0) goto L_0x046a
            int r3 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x046a
            r3 = 92
            goto L_0x0493
        L_0x046a:
            r3 = 140(0x8c, double:6.9E-322)
            int r11 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r11 >= 0) goto L_0x0477
            int r9 = (r48 > r3 ? 1 : (r48 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0477
            r3 = 93
            goto L_0x0493
        L_0x0477:
            r9 = 150(0x96, double:7.4E-322)
            int r11 = (r3 > r48 ? 1 : (r3 == r48 ? 0 : -1))
            if (r11 >= 0) goto L_0x0484
            int r3 = (r48 > r9 ? 1 : (r48 == r9 ? 0 : -1))
            if (r3 > 0) goto L_0x0484
            r3 = 94
            goto L_0x0493
        L_0x0484:
            int r3 = (r9 > r48 ? 1 : (r9 == r48 ? 0 : -1))
            if (r3 >= 0) goto L_0x0491
            r3 = 200(0xc8, double:9.9E-322)
            int r9 = (r48 > r3 ? 1 : (r48 == r3 ? 0 : -1))
            if (r9 > 0) goto L_0x0491
            r3 = 95
            goto L_0x0493
        L_0x0491:
            r3 = 96
        L_0x0493:
            r14.SetKey(r3)
            if (r0 <= 0) goto L_0x04fa
            r3 = 98
            r15.SetKey(r3)
            if (r0 != 0) goto L_0x04a2
            r0 = 99
            goto L_0x04f7
        L_0x04a2:
            r3 = 1
            if (r3 > r0) goto L_0x04ab
            r3 = 3
            if (r0 > r3) goto L_0x04ab
            r0 = 100
            goto L_0x04f7
        L_0x04ab:
            r3 = 4
            if (r3 > r0) goto L_0x04b4
            r3 = 6
            if (r0 > r3) goto L_0x04b4
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x04f7
        L_0x04b4:
            r3 = 7
            if (r3 > r0) goto L_0x04be
            r3 = 10
            if (r0 > r3) goto L_0x04be
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x04f7
        L_0x04be:
            r3 = 11
            if (r3 > r0) goto L_0x04c9
            r3 = 15
            if (r0 > r3) goto L_0x04cb
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x04f7
        L_0x04c9:
            r3 = 15
        L_0x04cb:
            if (r3 >= r0) goto L_0x04d4
            r3 = 20
            if (r0 > r3) goto L_0x04d6
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x04f7
        L_0x04d4:
            r3 = 20
        L_0x04d6:
            if (r3 >= r0) goto L_0x04df
            r3 = 40
            if (r0 > r3) goto L_0x04e1
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x04f7
        L_0x04df:
            r3 = 40
        L_0x04e1:
            if (r3 >= r0) goto L_0x04ea
            r3 = 60
            if (r0 > r3) goto L_0x04ec
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x04f7
        L_0x04ea:
            r3 = 60
        L_0x04ec:
            if (r3 >= r0) goto L_0x04f5
            r3 = 100
            if (r0 > r3) goto L_0x04f5
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x04f7
        L_0x04f5:
            r0 = 108(0x6c, float:1.51E-43)
        L_0x04f7:
            r7.SetKey(r0)
        L_0x04fa:
            if (r1 <= 0) goto L_0x0566
            r0 = 139(0x8b, float:1.95E-43)
            r5.SetKey(r0)
            if (r1 != 0) goto L_0x050a
            r0 = 140(0x8c, float:1.96E-43)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 140(0x8c, float:1.96E-43)
            goto L_0x0562
        L_0x050a:
            r0 = 10
            if (r1 < 0) goto L_0x0515
            if (r1 > r0) goto L_0x0515
            r1 = 141(0x8d, float:1.98E-43)
        L_0x0512:
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0562
        L_0x0515:
            if (r0 > r1) goto L_0x051e
            r0 = 20
            if (r1 > r0) goto L_0x0520
            r1 = 142(0x8e, float:1.99E-43)
            goto L_0x0512
        L_0x051e:
            r0 = 20
        L_0x0520:
            if (r0 > r1) goto L_0x0529
            r0 = 40
            if (r1 > r0) goto L_0x052b
            r1 = 143(0x8f, float:2.0E-43)
            goto L_0x0512
        L_0x0529:
            r0 = 40
        L_0x052b:
            if (r0 > r1) goto L_0x0534
            r0 = 60
            if (r1 > r0) goto L_0x0536
            r1 = 144(0x90, float:2.02E-43)
            goto L_0x0512
        L_0x0534:
            r0 = 60
        L_0x0536:
            if (r0 >= r1) goto L_0x053f
            r0 = 100
            if (r1 > r0) goto L_0x0541
            r1 = 145(0x91, float:2.03E-43)
            goto L_0x0512
        L_0x053f:
            r0 = 100
        L_0x0541:
            r3 = 150(0x96, float:2.1E-43)
            if (r0 >= r1) goto L_0x054e
            if (r1 > r3) goto L_0x054e
            r0 = 146(0x92, float:2.05E-43)
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 146(0x92, float:2.05E-43)
            goto L_0x0562
        L_0x054e:
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r1) goto L_0x0557
            if (r1 > r0) goto L_0x0557
            r1 = 147(0x93, float:2.06E-43)
            goto L_0x0562
        L_0x0557:
            if (r0 >= r1) goto L_0x0560
            r3 = 500(0x1f4, float:7.0E-43)
            if (r1 > r3) goto L_0x0560
            r1 = 148(0x94, float:2.07E-43)
            goto L_0x0562
        L_0x0560:
            r1 = 149(0x95, float:2.09E-43)
        L_0x0562:
            r6.SetKey(r1)
            goto L_0x0568
        L_0x0566:
            r0 = 200(0xc8, float:2.8E-43)
        L_0x0568:
            int r1 = (r52 > r28 ? 1 : (r52 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x06ae
            int r1 = (r54 > r28 ? 1 : (r54 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x06ae
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r3 = 971(0x3cb, float:1.36E-42)
            r1.SetID(r3)
            r4 = 1
            r1.SetValue(r4)
            r6 = 153(0x99, float:2.14E-43)
            r1.SetKey(r6)
            r8.add(r1)
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r1.SetID(r3)
            r1.SetValue(r4)
            r3 = 10485760(0xa00000, double:5.180654E-317)
            int r5 = (r28 > r52 ? 1 : (r28 == r52 ? 0 : -1))
            if (r5 > 0) goto L_0x05a1
            int r5 = (r52 > r3 ? 1 : (r52 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x05a1
            r5 = 154(0x9a, float:2.16E-43)
            goto L_0x0614
        L_0x05a1:
            r5 = 20971520(0x1400000, double:1.03613076E-316)
            int r9 = (r3 > r52 ? 1 : (r3 == r52 ? 0 : -1))
            if (r9 >= 0) goto L_0x05b0
            int r9 = (r52 > r5 ? 1 : (r52 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x05b0
            r5 = 155(0x9b, float:2.17E-43)
            goto L_0x0614
        L_0x05b0:
            r9 = 31457280(0x1e00000, double:1.55419614E-316)
            int r11 = (r5 > r52 ? 1 : (r5 == r52 ? 0 : -1))
            if (r11 >= 0) goto L_0x05be
            int r5 = (r52 > r9 ? 1 : (r52 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x05be
            r5 = 156(0x9c, float:2.19E-43)
            goto L_0x0614
        L_0x05be:
            r5 = 41943040(0x2800000, double:2.0722615E-316)
            int r11 = (r9 > r52 ? 1 : (r9 == r52 ? 0 : -1))
            if (r11 >= 0) goto L_0x05cc
            int r9 = (r52 > r5 ? 1 : (r52 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x05cc
            r5 = 157(0x9d, float:2.2E-43)
            goto L_0x0614
        L_0x05cc:
            r9 = 52428800(0x3200000, double:2.5903269E-316)
            int r11 = (r5 > r52 ? 1 : (r5 == r52 ? 0 : -1))
            if (r11 >= 0) goto L_0x05da
            int r5 = (r52 > r9 ? 1 : (r52 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x05da
            r5 = 158(0x9e, float:2.21E-43)
            goto L_0x0614
        L_0x05da:
            r5 = 62914560(0x3c00000, double:3.10839227E-316)
            int r11 = (r9 > r52 ? 1 : (r9 == r52 ? 0 : -1))
            if (r11 >= 0) goto L_0x05e8
            int r9 = (r52 > r5 ? 1 : (r52 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x05e8
            r5 = 159(0x9f, float:2.23E-43)
            goto L_0x0614
        L_0x05e8:
            r9 = 73400320(0x4600000, double:3.62645765E-316)
            int r11 = (r5 > r52 ? 1 : (r5 == r52 ? 0 : -1))
            if (r11 >= 0) goto L_0x05f6
            int r5 = (r52 > r9 ? 1 : (r52 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x05f6
            r5 = 160(0xa0, float:2.24E-43)
            goto L_0x0614
        L_0x05f6:
            r5 = 94371840(0x5a00000, double:4.6625884E-316)
            int r11 = (r9 > r52 ? 1 : (r9 == r52 ? 0 : -1))
            if (r11 >= 0) goto L_0x0604
            int r9 = (r52 > r5 ? 1 : (r52 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0604
            r5 = 161(0xa1, float:2.26E-43)
            goto L_0x0614
        L_0x0604:
            int r9 = (r5 > r52 ? 1 : (r5 == r52 ? 0 : -1))
            if (r9 >= 0) goto L_0x0612
            r5 = 115343360(0x6e00000, double:5.69871917E-316)
            int r9 = (r52 > r5 ? 1 : (r52 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0612
            r5 = 162(0xa2, float:2.27E-43)
            goto L_0x0614
        L_0x0612:
            r5 = 163(0xa3, float:2.28E-43)
        L_0x0614:
            r1.SetKey(r5)
            r8.add(r1)
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r5 = 971(0x3cb, float:1.36E-42)
            r1.SetID(r5)
            r5 = 1
            r1.SetValue(r5)
            int r5 = (r28 > r54 ? 1 : (r28 == r54 ? 0 : -1))
            if (r5 > 0) goto L_0x0635
            int r5 = (r54 > r3 ? 1 : (r54 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0635
            r3 = 169(0xa9, float:2.37E-43)
            goto L_0x06a8
        L_0x0635:
            r5 = 20971520(0x1400000, double:1.03613076E-316)
            int r9 = (r3 > r54 ? 1 : (r3 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x0644
            int r3 = (r54 > r5 ? 1 : (r54 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0644
            r3 = 170(0xaa, float:2.38E-43)
            goto L_0x06a8
        L_0x0644:
            r3 = 31457280(0x1e00000, double:1.55419614E-316)
            int r9 = (r5 > r54 ? 1 : (r5 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x0652
            int r5 = (r54 > r3 ? 1 : (r54 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0652
            r3 = 171(0xab, float:2.4E-43)
            goto L_0x06a8
        L_0x0652:
            r5 = 41943040(0x2800000, double:2.0722615E-316)
            int r9 = (r3 > r54 ? 1 : (r3 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x0660
            int r3 = (r54 > r5 ? 1 : (r54 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0660
            r3 = 172(0xac, float:2.41E-43)
            goto L_0x06a8
        L_0x0660:
            r3 = 52428800(0x3200000, double:2.5903269E-316)
            int r9 = (r5 > r54 ? 1 : (r5 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x066e
            int r5 = (r54 > r3 ? 1 : (r54 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x066e
            r3 = 173(0xad, float:2.42E-43)
            goto L_0x06a8
        L_0x066e:
            r5 = 62914560(0x3c00000, double:3.10839227E-316)
            int r9 = (r3 > r54 ? 1 : (r3 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x067c
            int r3 = (r54 > r5 ? 1 : (r54 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x067c
            r3 = 174(0xae, float:2.44E-43)
            goto L_0x06a8
        L_0x067c:
            r3 = 73400320(0x4600000, double:3.62645765E-316)
            int r9 = (r5 > r54 ? 1 : (r5 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x068a
            int r5 = (r54 > r3 ? 1 : (r54 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x068a
            r3 = 175(0xaf, float:2.45E-43)
            goto L_0x06a8
        L_0x068a:
            r5 = 94371840(0x5a00000, double:4.6625884E-316)
            int r9 = (r3 > r54 ? 1 : (r3 == r54 ? 0 : -1))
            if (r9 >= 0) goto L_0x0698
            int r3 = (r54 > r5 ? 1 : (r54 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0698
            r3 = 176(0xb0, float:2.47E-43)
            goto L_0x06a8
        L_0x0698:
            int r3 = (r5 > r54 ? 1 : (r5 == r54 ? 0 : -1))
            if (r3 >= 0) goto L_0x06a6
            r3 = 115343360(0x6e00000, double:5.69871917E-316)
            int r5 = (r54 > r3 ? 1 : (r54 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x06a6
            r3 = 177(0xb1, float:2.48E-43)
            goto L_0x06a8
        L_0x06a6:
            r3 = 178(0xb2, float:2.5E-43)
        L_0x06a8:
            r1.SetKey(r3)
            r8.add(r1)
        L_0x06ae:
            if (r2 <= 0) goto L_0x072d
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r3 = 971(0x3cb, float:1.36E-42)
            r1.SetID(r3)
            r4 = 1
            r1.SetValue(r4)
            r6 = 181(0xb5, float:2.54E-43)
            r1.SetKey(r6)
            r8.add(r1)
            com.tencent.mars.smc.IDKey r1 = new com.tencent.mars.smc.IDKey
            r1.<init>()
            r1.SetID(r3)
            r1.SetValue(r4)
            r3 = 1
            if (r3 > r2) goto L_0x06db
            r3 = 3
            if (r2 > r3) goto L_0x06db
            r2 = 182(0xb6, float:2.55E-43)
            goto L_0x0727
        L_0x06db:
            r3 = 4
            if (r3 > r2) goto L_0x06e4
            r3 = 6
            if (r2 > r3) goto L_0x06e4
            r2 = 183(0xb7, float:2.56E-43)
            goto L_0x0727
        L_0x06e4:
            r3 = 7
            if (r3 > r2) goto L_0x06ee
            r3 = 10
            if (r2 > r3) goto L_0x06ee
            r2 = 184(0xb8, float:2.58E-43)
            goto L_0x0727
        L_0x06ee:
            r3 = 11
            if (r3 > r2) goto L_0x06f9
            r3 = 15
            if (r2 > r3) goto L_0x06fb
            r2 = 185(0xb9, float:2.59E-43)
            goto L_0x0727
        L_0x06f9:
            r3 = 15
        L_0x06fb:
            if (r3 >= r2) goto L_0x0704
            r3 = 20
            if (r2 > r3) goto L_0x0706
            r2 = 186(0xba, float:2.6E-43)
            goto L_0x0727
        L_0x0704:
            r3 = 20
        L_0x0706:
            if (r3 >= r2) goto L_0x070f
            r3 = 40
            if (r2 > r3) goto L_0x0711
            r2 = 187(0xbb, float:2.62E-43)
            goto L_0x0727
        L_0x070f:
            r3 = 40
        L_0x0711:
            if (r3 >= r2) goto L_0x071a
            r3 = 60
            if (r2 > r3) goto L_0x071c
            r2 = 188(0xbc, float:2.63E-43)
            goto L_0x0727
        L_0x071a:
            r3 = 60
        L_0x071c:
            if (r3 >= r2) goto L_0x0725
            r3 = 100
            if (r2 > r3) goto L_0x0725
            r2 = 189(0xbd, float:2.65E-43)
            goto L_0x0727
        L_0x0725:
            r2 = 190(0xbe, float:2.66E-43)
        L_0x0727:
            r1.SetKey(r2)
            r8.add(r1)
        L_0x072d:
            r1 = r57
            if (r1 <= 0) goto L_0x07ac
            com.tencent.mars.smc.IDKey r2 = new com.tencent.mars.smc.IDKey
            r2.<init>()
            com.tencent.mars.smc.IDKey r3 = new com.tencent.mars.smc.IDKey
            r3.<init>()
            r4 = 971(0x3cb, float:1.36E-42)
            r2.SetID(r4)
            r5 = 1
            r2.SetValue(r5)
            r7 = 193(0xc1, float:2.7E-43)
            r2.SetKey(r7)
            r8.add(r2)
            r3.SetID(r4)
            r3.SetValue(r5)
            r2 = 1
            if (r2 > r1) goto L_0x075c
            r2 = 3
            if (r1 > r2) goto L_0x075c
            r0 = 194(0xc2, float:2.72E-43)
            goto L_0x07a6
        L_0x075c:
            r2 = 4
            if (r2 > r1) goto L_0x0765
            r2 = 6
            if (r1 > r2) goto L_0x0765
            r0 = 195(0xc3, float:2.73E-43)
            goto L_0x07a6
        L_0x0765:
            r2 = 7
            if (r2 > r1) goto L_0x076f
            r2 = 10
            if (r1 > r2) goto L_0x076f
            r0 = 196(0xc4, float:2.75E-43)
            goto L_0x07a6
        L_0x076f:
            r2 = 11
            if (r2 > r1) goto L_0x077a
            r2 = 15
            if (r1 > r2) goto L_0x077c
            r0 = 197(0xc5, float:2.76E-43)
            goto L_0x07a6
        L_0x077a:
            r2 = 15
        L_0x077c:
            if (r2 >= r1) goto L_0x0785
            r2 = 20
            if (r1 > r2) goto L_0x0787
            r0 = 198(0xc6, float:2.77E-43)
            goto L_0x07a6
        L_0x0785:
            r2 = 20
        L_0x0787:
            if (r2 >= r1) goto L_0x0790
            r2 = 40
            if (r1 > r2) goto L_0x0792
            r0 = 199(0xc7, float:2.79E-43)
            goto L_0x07a6
        L_0x0790:
            r2 = 40
        L_0x0792:
            if (r2 >= r1) goto L_0x0799
            r2 = 60
            if (r1 > r2) goto L_0x079b
            goto L_0x07a6
        L_0x0799:
            r2 = 60
        L_0x079b:
            if (r2 >= r1) goto L_0x07a4
            r0 = 100
            if (r1 > r0) goto L_0x07a4
            r0 = 201(0xc9, float:2.82E-43)
            goto L_0x07a6
        L_0x07a4:
            r0 = 202(0xca, float:2.83E-43)
        L_0x07a6:
            r3.SetKey(r0)
            r8.add(r3)
        L_0x07ac:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1
            r0.mo160124a(r8, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "idkeyGroupStat:  id:971"
            r0.append(r1)
            java.util.Iterator r1 = r8.iterator()
        L_0x07c0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x07f1
            java.lang.Object r2 = r1.next()
            com.tencent.mars.smc.IDKey r2 = (com.tencent.mars.smc.IDKey) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ", key:"
            r3.append(r4)
            long r4 = r2.GetKey()
            r3.append(r4)
            java.lang.String r4 = " value:"
            r3.append(r4)
            long r4 = r2.GetValue()
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            goto L_0x07c0
        L_0x07f1:
            java.lang.String r0 = r0.toString()
            int r1 = p213oh.C11412b.f33577a
            r1 = 0
            java.lang.String r2 = "MicroMsg.Audio.AudioMixReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fa2.C20698b.mo32411D0(int, long, long, long, int, int, long, long, int, int):void");
    }

    /* renamed from: G */
    public void mo32412G(int i, int i2) {
        int i3;
        IDKey iDKey = new IDKey();
        iDKey.SetID(C90507c.CTRL_INDEX);
        iDKey.SetKey(1);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(C90507c.CTRL_INDEX);
        Log.m105918d("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrSceneIdKey, scene:" + i);
        iDKey2.SetKey(9);
        iDKey2.SetValue(1);
        IDKey iDKey3 = new IDKey();
        iDKey3.SetID(C90507c.CTRL_INDEX);
        Log.m105924i("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerErrIdKey, errCode:" + i2);
        if (i2 == 66) {
            i3 = 23;
        } else if (i2 == 67) {
            i3 = 24;
        } else if (i2 == 69) {
            i3 = 25;
        } else if (i2 == 70) {
            i3 = 36;
        } else if (i2 == 74) {
            i3 = 26;
        } else if (i2 == 80) {
            i3 = 27;
        } else if (i2 == 105) {
            i3 = 37;
        } else if (i2 == 101) {
            i3 = 28;
        } else if (i2 != 102) {
            switch (i2) {
                case 53:
                    i3 = 17;
                    break;
                case 54:
                    i3 = 18;
                    break;
                case 55:
                    i3 = 19;
                    break;
                default:
                    switch (i2) {
                        case 62:
                            i3 = 20;
                            break;
                        case 63:
                            i3 = 21;
                            break;
                        case 64:
                            i3 = 22;
                            break;
                        default:
                            switch (i2) {
                                case 500:
                                    i3 = 31;
                                    break;
                                case 501:
                                    i3 = 32;
                                    break;
                                case 502:
                                    i3 = 33;
                                    break;
                                case 503:
                                    i3 = 34;
                                    break;
                                case 504:
                                    i3 = 35;
                                    break;
                                default:
                                    i3 = 30;
                                    break;
                            }
                    }
            }
        } else {
            i3 = 29;
        }
        iDKey3.SetKey(i3);
        iDKey3.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        arrayList.add(iDKey3);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: T */
    public void mo32413T(int i, int i2) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(C90507c.CTRL_INDEX);
        iDKey.SetKey(91);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(C90507c.CTRL_INDEX);
        iDKey2.SetKey(C58934a.m68807a(i2));
        iDKey2.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C115669n.INSTANCE.mo160124a(arrayList, true);
        C58934a.m68808b(arrayList);
    }

    /* renamed from: X */
    public void mo32414X(String str, String str2, boolean z) {
        C9457a.m9137a(new C20700b(this, str, str2, z));
    }

    /* renamed from: c */
    public void mo32415c(String str, String str2, long j, long j2, long j3, boolean z) {
        mo32421r0(str, str2, j, j2, j3, z, "", 0, 0, 0);
    }

    /* renamed from: f */
    public void mo32416f(String str, String str2) {
        C9457a.m9137a(new C20699a(this, str, str2));
    }

    /* renamed from: l */
    public void mo32417l(int i) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(C90507c.CTRL_INDEX);
        iDKey.SetKey(i == 2 ? 42 : i == 3 ? 43 : i == 4 ? 44 : i == 5 ? 45 : i == 6 ? 46 : i == 7 ? 47 : i == 8 ? 48 : i == 9 ? 49 : 50);
        iDKey.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: n */
    public void mo32418n(int i) {
        Log.m105919d("MicroMsg.Audio.AudioPlayIdKeyReport", "idKeyReportQQAudioPlayerSum scene:%d", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(C90507c.CTRL_INDEX);
        iDKey.SetKey(0);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(C90507c.CTRL_INDEX);
        Log.m105918d("MicroMsg.Audio.AudioPlayIdKeyReport", "getQQAudioPlayerSumIdKeyByScene, scene:" + i);
        iDKey2.SetKey(2);
        iDKey2.SetValue(1);
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: o0 */
    public void mo32419o0(int i) {
        Log.m105919d("MicroMsg.Audio.AudioPlayIdKeyReport", "idKeyReportAudioMixPlayerSum scene:%d", Integer.valueOf(i));
        ArrayList arrayList = new ArrayList();
        IDKey iDKey = new IDKey();
        iDKey.SetID(C90507c.CTRL_INDEX);
        iDKey.SetKey(90);
        iDKey.SetValue(1);
        arrayList.add(iDKey);
        C115669n.INSTANCE.mo160124a(arrayList, true);
    }

    /* renamed from: p */
    public void mo32420p(int i) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(C90507c.CTRL_INDEX);
        iDKey.SetKey(118);
        iDKey.SetValue(1);
        IDKey iDKey2 = new IDKey();
        iDKey2.SetID(C90507c.CTRL_INDEX);
        iDKey2.SetKey(C58934a.m68807a(i));
        iDKey2.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        arrayList.add(iDKey2);
        C115669n.INSTANCE.mo160124a(arrayList, true);
        C58934a.m68808b(arrayList);
    }

    /* renamed from: r0 */
    public void mo32421r0(String str, String str2, long j, long j2, long j3, boolean z, String str3, long j4, long j5, long j6) {
        long j7 = j6;
        C9457a.m9137a(new C20701c(this, str, str2, j, j2, j3, z, str3, j7, j5, j4));
    }

    /* renamed from: s */
    public void mo32422s() {
        synchronized (f58520i) {
            f58514c++;
        }
    }

    /* renamed from: z0 */
    public void mo32423z0(String str, long j, long j2, long j3) {
        C9457a.m9137a(new C20702d(str, j, j2, j3));
    }
}
