package h11;

import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: h11.d */
public class C98311d {
    /* renamed from: a */
    public static long m127052a() {
        C86001b0 n = C86013q1.m106453n(C86709a0.m107535s().mo121140g());
        long j = n != null ? n.f250474d : 0;
        int vP = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101146vP();
        if (vP <= 0) {
            vP = 1;
        }
        return Math.min(1024, j / ((long) vP));
    }

    /* renamed from: b */
    public static String m127053b(long j) {
        if (j >= 1073741824) {
            return String.format("%.1f GB", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1.073741824E9d)});
        } else if (j >= 1048576) {
            return String.format("%.1f MB", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1048576.0d)});
        } else if (j < 1024) {
            return j > 0 ? "< 1 KB" : "0 KB";
        } else {
            return String.format("%.0f KB", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1024.0d)});
        }
    }
}
