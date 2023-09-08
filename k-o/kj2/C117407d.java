package kj2;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: kj2.d */
public enum C117407d implements C117406c {
    INSTANCE;
    

    /* renamed from: d */
    public C117406c f351448d;

    /* renamed from: kj2.d$b */
    public static class C109027b implements C117406c {
        public C109027b(C109026a aVar) {
        }

        /* renamed from: a */
        public void mo160124a(ArrayList<IDKey> arrayList, boolean z) {
            mo160127d();
        }

        /* renamed from: b */
        public void mo160125b(int i) {
            mo160127d();
        }

        /* renamed from: c */
        public void mo160126c(int i, String str, boolean z, boolean z2) {
            mo160127d();
        }

        /* renamed from: d */
        public final void mo160127d() {
            Log.m105928w("MicroMsg.ReportService", "this is DummyReportService");
        }

        /* renamed from: e */
        public void mo160128e(int i, boolean z, boolean z2, boolean z3, Object... objArr) {
            mo160127d();
        }

        /* renamed from: f */
        public boolean mo160129f(int i, String str) {
            mo160127d();
            return false;
        }

        /* renamed from: g */
        public void mo160130g(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            mo160127d();
        }

        /* renamed from: h */
        public void mo160131h(int i, Object... objArr) {
            mo160127d();
        }

        /* renamed from: i */
        public void mo160132i(int i, int i2, String str, boolean z, boolean z2) {
            mo160127d();
        }

        public void idkeyStat(long j, long j2, long j3, boolean z) {
            mo160127d();
        }

        /* renamed from: j */
        public void mo160134j(int i, String str, boolean z, boolean z2, boolean z3) {
            mo160127d();
        }

        /* renamed from: k */
        public void mo160135k(String str, String str2, Map<String, Object> map) {
            mo160127d();
        }

        public void kvStat(int i, String str) {
            mo160127d();
        }

        /* renamed from: l */
        public void mo160137l(int i, List<String> list) {
            mo160127d();
        }

        /* renamed from: m */
        public void mo160138m(int i, int i2, int i3, int i4, boolean z) {
            mo160127d();
        }

        /* renamed from: n */
        public void mo160139n() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: o */
        public void mo160140o(int i, boolean z, boolean z2, Object... objArr) {
            mo160127d();
        }
    }

    /* renamed from: s */
    public static Object m165559s(int i, int[] iArr, int i2, int i3) {
        if (iArr == null || iArr.length < 1 || i3 <= i2 || i3 > 255 || iArr.length != i3 - i2) {
            return null;
        }
        int i4 = 0;
        if (i <= iArr[0]) {
            return Integer.valueOf(i2);
        }
        while (i4 < iArr.length - 1) {
            int i5 = iArr[i4];
            int i6 = i4 + 1;
            int i7 = iArr[i6];
            if (i5 >= i7) {
                return null;
            }
            if (i > i5 && i <= i7) {
                return Integer.valueOf(i2 + 1 + i4);
            }
            i4 = i6;
        }
        return Integer.valueOf(i3);
    }

    /* renamed from: t */
    public static Object m165560t(int i, int[] iArr, Object[] objArr) {
        if (iArr == null || iArr.length < 1 || objArr == null || iArr.length + 1 != objArr.length) {
            return null;
        }
        int i2 = 0;
        if (i <= iArr[0]) {
            return objArr[0];
        }
        while (i2 < iArr.length - 1) {
            int i3 = iArr[i2];
            i2++;
            int i4 = iArr[i2];
            if (i3 >= i4) {
                return null;
            }
            if (i > i3 && i <= i4) {
                return objArr[i2];
            }
        }
        return objArr[objArr.length - 1];
    }

    /* renamed from: a */
    public void mo160124a(ArrayList<IDKey> arrayList, boolean z) {
        this.f351448d.mo160124a(arrayList, z);
    }

    /* renamed from: b */
    public void mo160125b(int i) {
        this.f351448d.mo160125b(i);
    }

    /* renamed from: c */
    public void mo160126c(int i, String str, boolean z, boolean z2) {
        this.f351448d.mo160126c(i, str, z, z2);
    }

    /* renamed from: e */
    public void mo160128e(int i, boolean z, boolean z2, boolean z3, Object... objArr) {
        this.f351448d.mo160128e(i, z, z2, z3, objArr);
    }

    /* renamed from: f */
    public boolean mo160129f(int i, String str) {
        return this.f351448d.mo160129f(i, str);
    }

    /* renamed from: g */
    public void mo160130g(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        Log.m105919d("MicroMsg.ReportService", "idkeyGroupForPair [%d, %d] -> %d / [%d, %d] -> %d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i6));
        this.f351448d.mo160130g(i, i2, i3, i4, i5, i6, z);
    }

    /* renamed from: h */
    public void mo160131h(int i, Object... objArr) {
        this.f351448d.mo160131h(i, objArr);
    }

    /* renamed from: i */
    public void mo160132i(int i, int i2, String str, boolean z, boolean z2) {
        this.f351448d.mo160132i(i, i2, str, z, z2);
    }

    public void idkeyStat(long j, long j2, long j3, boolean z) {
        Log.m105919d("MicroMsg.ReportService", "idkeyStat [%d, %d] -> %d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        this.f351448d.idkeyStat(j, j2, j3, z);
    }

    /* renamed from: j */
    public void mo160134j(int i, String str, boolean z, boolean z2, boolean z3) {
        this.f351448d.mo160134j(i, str, z, z2, z3);
    }

    /* renamed from: k */
    public void mo160135k(String str, String str2, Map<String, Object> map) {
        this.f351448d.mo160135k(str, str2, map);
    }

    public void kvStat(int i, String str) {
        this.f351448d.kvStat(i, str);
    }

    /* renamed from: l */
    public void mo160137l(int i, List<String> list) {
        this.f351448d.mo160137l(i, list);
    }

    /* renamed from: m */
    public void mo160138m(int i, int i2, int i3, int i4, boolean z) {
        Log.m105919d("MicroMsg.ReportService", "idkeyGroupForPairAverger [%d, %d] -> %d / [%d, %d] -> 1", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(i3));
        this.f351448d.mo160138m(i, i2, i3, i4, z);
    }

    /* renamed from: n */
    public void mo160139n() {
        this.f351448d.mo160139n();
    }

    /* renamed from: o */
    public void mo160140o(int i, boolean z, boolean z2, Object... objArr) {
        this.f351448d.mo160140o(i, z, z2, objArr);
    }

    /* renamed from: p */
    public String mo182087p(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            Log.m105928w("MicroMsg.ReportService", "vals is null, use '' as value");
            return "";
        }
        if (objArr.length == 1) {
            return String.valueOf(objArr[0]);
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb.append(String.valueOf(objArr[i]).replace(',', ' '));
            sb.append(',');
        }
        sb.append(String.valueOf(objArr[length]));
        return sb.toString();
    }

    /* renamed from: q */
    public void mo182088q(int i, int i2) {
        mo182089r((long) i, (long) i2, 1);
    }

    /* renamed from: r */
    public void mo182089r(long j, long j2, long j3) {
        idkeyStat(j, j2, j3, false);
    }
}
