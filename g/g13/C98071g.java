package g13;

import android.util.SparseArray;
import eb0.C75604z3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: g13.g */
public class C98071g implements C98070b {

    /* renamed from: a */
    public int f287520a = 0;

    /* renamed from: b */
    public final C98076h[] f287521b = new C98076h[1];

    /* renamed from: c */
    public ArrayList<C98073b> f287522c = new ArrayList<>(1);

    /* renamed from: d */
    public Queue<C98075d> f287523d = new LinkedList();

    /* renamed from: e */
    public HashMap<String, Integer> f287524e = new HashMap<>();

    /* renamed from: g13.g$b */
    public interface C98073b {
        /* renamed from: a */
        void mo136672a(int i, SparseArray<C98075d> sparseArray);
    }

    /* renamed from: g13.g$c */
    public static final class C98074c {

        /* renamed from: a */
        public static final C98071g f287525a = new C98071g((C98072a) null);
    }

    /* renamed from: g13.g$d */
    public static class C98075d {

        /* renamed from: l */
        public static int f287526l;

        /* renamed from: a */
        public String f287527a;

        /* renamed from: b */
        public String f287528b;

        /* renamed from: c */
        public String f287529c;

        /* renamed from: d */
        public String f287530d;

        /* renamed from: e */
        public String f287531e;

        /* renamed from: f */
        public byte[] f287532f;

        /* renamed from: g */
        public int f287533g;

        /* renamed from: h */
        public int f287534h;

        /* renamed from: i */
        public int f287535i;

        /* renamed from: j */
        public int f287536j;

        /* renamed from: k */
        public String f287537k;

        public C98075d(String str, String str2, int i, String str3, byte[] bArr) {
            int t;
            String trim;
            this.f287527a = str;
            this.f287529c = str2;
            this.f287534h = i;
            this.f287530d = str3;
            this.f287532f = bArr;
            if (f287526l == Integer.MAX_VALUE) {
                f287526l = 0;
            }
            int i2 = f287526l + 1;
            f287526l = i2;
            this.f287535i = i2;
            if (i == 1 && (t = C75604z3.m90848t(str)) != -1 && (trim = str.substring(0, t).trim()) != null && trim.length() > 0) {
                this.f287537k = trim;
                this.f287527a = str.substring(t + 1).trim();
            }
        }
    }

    public C98071g(C98072a aVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0125 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo137367a() {
        /*
            r14 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.util.Queue<g13.g$d> r2 = r14.f287523d
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.TranslateServiceManager"
            java.lang.String r4 = "current waitings : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r4, r1)
            java.util.Queue<g13.g$d> r1 = r14.f287523d
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0024
            return
        L_0x0024:
            int r1 = r14.f287520a
            g13.h[] r2 = r14.f287521b
            int r2 = r2.length
            if (r1 > r2) goto L_0x0129
            r1 = 0
        L_0x002c:
            g13.h[] r2 = r14.f287521b
            int r4 = r2.length
            if (r1 >= r4) goto L_0x0129
            r4 = r2[r1]
            if (r4 != 0) goto L_0x004c
            g13.h r4 = new g13.h
            r4.<init>(r1, r14)
            r2[r1] = r4
            g13.h[] r2 = r14.f287521b
            r2 = r2[r1]
            r2.getClass()
            ob0.b0 r4 = eb0.C97625j3.m125815e()
            r5 = 631(0x277, float:8.84E-43)
            r4.mo123455a(r5, r2)
        L_0x004c:
            g13.h[] r2 = r14.f287521b
            r2 = r2[r1]
            boolean r4 = r2.f287539e
            if (r4 == 0) goto L_0x0056
            goto L_0x0125
        L_0x0056:
            java.util.Queue<g13.g$d> r5 = r14.f287523d
            if (r4 == 0) goto L_0x005d
        L_0x005a:
            r2 = 0
            goto L_0x011e
        L_0x005d:
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r2.f287538d = r4
            java.util.LinkedList r5 = (java.util.LinkedList) r5
            int r4 = r5.size()
            if (r4 != 0) goto L_0x006d
            goto L_0x005a
        L_0x006d:
            r2.f287539e = r0
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r6 = 0
        L_0x0075:
            r7 = 512(0x200, float:7.175E-43)
            if (r6 >= r7) goto L_0x00ff
            int r8 = r5.size()
            if (r8 <= 0) goto L_0x00ff
            java.lang.Object r8 = r5.peek()
            g13.g$d r8 = (g13.C98071g.C98075d) r8
            java.lang.String r9 = r8.f287527a
            byte[] r9 = r9.getBytes()
            int r9 = r9.length
            if (r6 == 0) goto L_0x0092
            int r10 = r6 + r9
            if (r10 > r7) goto L_0x00fc
        L_0x0092:
            r5.poll()
            te3.zj4 r7 = new te3.zj4
            r7.<init>()
            int r10 = r8.f287535i
            r7.f146040d = r10
            java.lang.String r10 = r8.f287527a
            r7.f146041e = r10
            te3.qv3 r10 = new te3.qv3
            r10.<init>()
            byte[] r11 = r8.f287532f
            r10.mo73350k(r11)
            r7.f146044h = r10
            int r10 = r8.f287534h
            if (r10 == r0) goto L_0x00ba
            java.lang.String r10 = r8.f287530d
            boolean r10 = com.tencent.p014mm.storage.C72996z1.m85820U5(r10)
            if (r10 == 0) goto L_0x00be
        L_0x00ba:
            java.lang.String r10 = r8.f287530d
            r7.f146042f = r10
        L_0x00be:
            int r10 = r8.f287534h
            r11 = 3
            r12 = 2
            if (r10 == 0) goto L_0x00d5
            if (r10 == r0) goto L_0x00d1
            if (r10 == r12) goto L_0x00ce
            if (r10 == r11) goto L_0x00cb
            goto L_0x00d7
        L_0x00cb:
            r7.f146043g = r11
            goto L_0x00d7
        L_0x00ce:
            r7.f146043g = r12
            goto L_0x00d7
        L_0x00d1:
            r13 = 4
            r7.f146043g = r13
            goto L_0x00d7
        L_0x00d5:
            r7.f146043g = r0
        L_0x00d7:
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11[r3] = r10
            int r10 = r7.f146043g
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11[r0] = r10
            java.lang.String r10 = r8.f287529c
            r11[r12] = r10
            java.lang.String r10 = "MicroMsg.WorkingTranslate"
            java.lang.String r12 = "eventMsg.type: %d, msg.Scene:%d, id: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r12, r11)
            r4.add(r7)
            android.util.SparseArray<g13.g$d> r7 = r2.f287538d
            int r10 = r8.f287535i
            r7.put(r10, r8)
        L_0x00fc:
            int r6 = r6 + r9
            goto L_0x0075
        L_0x00ff:
            g13.c r5 = new g13.c
            r5.<init>(r4)
            r2.f287540f = r5
            ob0.b0 r4 = eb0.C97625j3.m125815e()
            g13.c r5 = r2.f287540f
            r4.mo123460f(r5)
            long r4 = java.lang.System.currentTimeMillis()
            r2.f287543i = r4
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r2.f287544j
            r4 = 60000(0xea60, double:2.9644E-319)
            r2.startTimer(r4)
            r2 = 1
        L_0x011e:
            if (r2 == 0) goto L_0x0125
            int r2 = r14.f287520a
            int r2 = r2 + r0
            r14.f287520a = r2
        L_0x0125:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g13.C98071g.mo137367a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a7, code lost:
        r5 = r5.f140574f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo137368b(int r9, int r10, int r11, java.lang.String r12, android.util.SparseArray<g13.C98071g.C98075d> r13, java.util.LinkedList<te3.ak4> r14) {
        /*
            r8 = this;
            int r9 = r8.f287520a
            r10 = 1
            int r9 = r9 - r10
            r8.f287520a = r9
            r9 = 0
            java.lang.String r12 = "MicroMsg.TranslateServiceManager"
            r0 = 0
            if (r14 == 0) goto L_0x0019
            int r1 = r13.size()
            int r2 = r14.size()
            if (r1 == r2) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r1 = r9
            goto L_0x0045
        L_0x0019:
            java.lang.String r1 = "originals.size() != translatedMsg.size()"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
        L_0x0025:
            int r3 = r13.size()
            if (r2 >= r3) goto L_0x0045
            java.lang.Object r3 = r13.valueAt(r2)
            g13.g$d r3 = (g13.C98071g.C98075d) r3
            java.lang.String r3 = r3.f287529c
            java.lang.Object r4 = r13.valueAt(r2)
            g13.g$d r4 = (g13.C98071g.C98075d) r4
            int r4 = r4.f287535i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r3, r4)
            int r2 = r2 + 1
            goto L_0x0025
        L_0x0045:
            r2 = 2
            if (r14 == 0) goto L_0x00c4
            java.util.Iterator r14 = r14.iterator()
        L_0x004c:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x00e2
            java.lang.Object r3 = r14.next()
            te3.ak4 r3 = (te3.ak4) r3
            int r4 = r3.f130596d
            java.lang.Object r4 = r13.get(r4)
            g13.g$d r4 = (g13.C98071g.C98075d) r4
            if (r4 != 0) goto L_0x0083
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r3.f130596d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r0] = r5
            int r5 = r3.f130598f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r10] = r5
            java.lang.String r3 = r3.f130597e
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r3)
            r4[r2] = r3
            java.lang.String r3 = "[onTranslateEnd] message is null! %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r3, r4)
            goto L_0x004c
        L_0x0083:
            java.lang.String r5 = r3.f130597e
            int r6 = r4.f287534h
            if (r6 != r10) goto L_0x0099
            java.lang.String r6 = r4.f287537k
            java.lang.String r5 = eb0.C75604z3.m90826A(r5, r6)
            java.lang.String r6 = r4.f287527a
            java.lang.String r7 = r4.f287537k
            java.lang.String r6 = eb0.C75604z3.m90826A(r6, r7)
            r4.f287527a = r6
        L_0x0099:
            r4.f287528b = r5
            int r5 = r3.f130598f
            r4.f287536j = r5
            java.lang.String r5 = r3.f130599g
            r4.f287531e = r5
            te3.qv3 r5 = r3.f130600h
            if (r5 == 0) goto L_0x00ae
            pe3.b r5 = r5.f140574f
            if (r5 == 0) goto L_0x00ae
            byte[] r5 = r5.f257327a
            goto L_0x00af
        L_0x00ae:
            r5 = r9
        L_0x00af:
            r4.f287532f = r5
            int r3 = r3.f130601i
            r4.f287533g = r3
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r8.f287524e
            java.lang.String r5 = r4.f287529c
            r3.remove(r5)
            if (r1 == 0) goto L_0x004c
            java.lang.String r3 = r4.f287529c
            r1.remove(r3)
            goto L_0x004c
        L_0x00c4:
            r9 = 0
        L_0x00c5:
            int r14 = r13.size()
            if (r9 >= r14) goto L_0x00e2
            java.lang.Object r14 = r13.valueAt(r9)
            g13.g$d r14 = (g13.C98071g.C98075d) r14
            int r3 = r14.f287534h
            if (r3 != r10) goto L_0x00df
            java.lang.String r3 = r14.f287527a
            java.lang.String r4 = r14.f287537k
            java.lang.String r3 = eb0.C75604z3.m90826A(r3, r4)
            r14.f287527a = r3
        L_0x00df:
            int r9 = r9 + 1
            goto L_0x00c5
        L_0x00e2:
            if (r1 == 0) goto L_0x011c
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x011c
            java.util.Set r9 = r1.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00f2:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x011c
            java.lang.Object r14 = r9.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r8.f287524e
            java.lang.Object r3 = r14.getKey()
            r1.remove(r3)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r3 = r14.getKey()
            r1[r0] = r3
            java.lang.Object r14 = r14.getValue()
            r1[r10] = r14
            java.lang.String r14 = "we found missing translate, msgId : %s, clientId : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r12, r14, r1)
            goto L_0x00f2
        L_0x011c:
            java.util.ArrayList<g13.g$b> r9 = r8.f287522c
            java.util.Iterator r9 = r9.iterator()
        L_0x0122:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0132
            java.lang.Object r10 = r9.next()
            g13.g$b r10 = (g13.C98071g.C98073b) r10
            r10.mo136672a(r11, r13)
            goto L_0x0122
        L_0x0132:
            r8.mo137367a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g13.C98071g.mo137368b(int, int, int, java.lang.String, android.util.SparseArray, java.util.LinkedList):void");
    }
}
