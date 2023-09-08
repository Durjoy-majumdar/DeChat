package kv1;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.math.BigInteger;
import java.util.ArrayList;
import kj2.C117407d;
import p823sg.C77710q;
import qe3.C89625d;

/* renamed from: kv1.h */
public class C99252h {

    /* renamed from: a */
    public static final int[] f291028a = {8, 9, 10, 11, 12, 14, 19, 20, 21, 22, 24, 25, 26, 15, 28, 29};

    /* renamed from: b */
    public static final C99253a f291029b = new C99253a();

    /* renamed from: c */
    public static long f291030c = 0;

    /* renamed from: d */
    public static long f291031d = 0;

    /* renamed from: e */
    public static String f291032e = "";

    /* renamed from: kv1.h$a */
    public static final class C99253a {

        /* renamed from: a */
        public long f291033a = 0;

        /* renamed from: b */
        public long f291034b = 0;

        /* renamed from: c */
        public long f291035c = 0;

        /* renamed from: d */
        public long f291036d = 0;

        /* renamed from: e */
        public long f291037e = 0;
    }

    /* renamed from: a */
    public static final void m129296a(ArrayList<IDKey> arrayList, int i, int i2, int i3) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(i);
        iDKey.SetKey(i2);
        iDKey.SetValue((long) i3);
        arrayList.add(iDKey);
    }

    /* renamed from: b */
    public static String m129297b() {
        String str = f291032e;
        if (str == null || "".equals(str)) {
            f291032e = "" + System.currentTimeMillis();
        }
        return f291032e;
    }

    /* renamed from: c */
    public static String m129298c(long j) {
        return new BigInteger(Long.toBinaryString(j), 2).toString();
    }

    /* renamed from: d */
    public static final void m129299d(int i) {
        Log.m105925i("MicroMsg.FTS.FTSReportApiLogic", "reportCommonChatroom: %d %d", 14731, Integer.valueOf(i));
        C117407d.INSTANCE.mo160131h(14731, Integer.valueOf(i));
    }

    /* renamed from: e */
    public static void m129300e(int i) {
        IDKey iDKey = new IDKey();
        iDKey.SetID(146);
        iDKey.SetKey(0);
        iDKey.SetValue(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(iDKey);
        if (i != 1) {
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(146);
            iDKey2.SetKey(2);
            iDKey2.SetValue(1);
            arrayList.add(iDKey2);
            IDKey iDKey3 = new IDKey();
            iDKey3.SetID(146);
            iDKey3.SetKey(i);
            iDKey3.SetValue(1);
            arrayList.add(iDKey3);
        } else {
            IDKey iDKey4 = new IDKey();
            iDKey4.SetID(146);
            iDKey4.SetKey(1);
            iDKey4.SetValue(1);
            arrayList.add(iDKey4);
        }
        C117407d.INSTANCE.mo160124a(arrayList, false);
    }

    /* renamed from: f */
    public static void m129301f(int i, long j) {
        if (i > 0) {
            int i2 = ((i - 1) * 2) + 1;
            Log.m105927v("MicroMsg.FTS.FTSReportApiLogic", "reportIDKeySearchTime: reportKey=%d taskId=%d time=%d", Integer.valueOf(i2), Integer.valueOf(i), Long.valueOf(j));
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(601);
            iDKey.SetKey(i2);
            iDKey.SetValue((long) ((int) j));
            arrayList.add(iDKey);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(601);
            iDKey2.SetKey(i2 + 1);
            iDKey2.SetValue(1);
            arrayList.add(iDKey2);
            C117407d.INSTANCE.mo160124a(arrayList, false);
        }
    }

    /* renamed from: g */
    public static void m129302g(int i, long j) {
        if (i > 0) {
            int i2 = ((i - 1) * 4) + 1;
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(602);
            iDKey.SetKey(i2);
            iDKey.SetValue(1);
            arrayList.add(iDKey);
            if (j <= 100) {
                IDKey iDKey2 = new IDKey();
                iDKey2.SetID(602);
                iDKey2.SetKey(i2 + 1);
                iDKey2.SetValue(1);
                arrayList.add(iDKey2);
            } else if (j <= 500) {
                IDKey iDKey3 = new IDKey();
                iDKey3.SetID(602);
                iDKey3.SetKey(i2 + 2);
                iDKey3.SetValue(1);
                arrayList.add(iDKey3);
            } else {
                IDKey iDKey4 = new IDKey();
                iDKey4.SetID(602);
                iDKey4.SetKey(i2 + 3);
                iDKey4.SetValue(1);
                arrayList.add(iDKey4);
            }
            C117407d.INSTANCE.mo160124a(arrayList, false);
        }
    }

    /* renamed from: h */
    public static final void m129303h(int i, long j, long j2) {
        boolean z;
        int[] iArr = f291028a;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                z = false;
                break;
            } else if (i == iArr[i2]) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            long longValue = new C77710q(C86709a0.m107523b().mo121110g()).longValue();
            if (C89625d.f257842h) {
                if (longValue % 100 != 1) {
                    return;
                }
            } else if (C89625d.f257844j && longValue % 10 != 1) {
                return;
            }
            Object[] objArr = new Object[11];
            objArr[0] = 0;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Long.valueOf(j);
            objArr[3] = 0;
            C99253a aVar = f291029b;
            objArr[4] = Integer.valueOf(aVar.f291033a >= 1536 ? 1 : 0);
            objArr[5] = Long.valueOf(aVar.f291033a);
            objArr[6] = Long.valueOf(aVar.f291034b);
            objArr[7] = Long.valueOf(aVar.f291035c);
            objArr[8] = Long.valueOf(aVar.f291036d);
            objArr[9] = Long.valueOf(aVar.f291037e);
            objArr[10] = Long.valueOf(j2);
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
            Log.m105927v("MicroMsg.FTS.FTSReportApiLogic", "reportKVSearchTime: %d %s", 14175, format);
            C117407d.INSTANCE.kvStat(14175, format);
        }
    }
}
