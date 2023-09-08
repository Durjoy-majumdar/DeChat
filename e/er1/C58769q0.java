package er1;

import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Comparator;
import java.util.List;
import rx3.C13604l;
import sx3.C77813z;
import ux3.C65486b;

/* renamed from: er1.q0 */
public final class C58769q0 {

    /* renamed from: a */
    public final String f168261a;

    /* renamed from: b */
    public final String f168262b;

    /* renamed from: c */
    public final long f168263c;

    /* renamed from: d */
    public final boolean f168264d;

    /* renamed from: e */
    public final int f168265e;

    /* renamed from: f */
    public final boolean f168266f;

    /* renamed from: g */
    public final String f168267g;

    /* renamed from: er1.q0$a */
    public static final class C58770a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C86001b0) t2).f250475e), Long.valueOf(((C86001b0) t).f250475e));
        }
    }

    public C58769q0(String str, String str2, long j, boolean z, int i, boolean z2) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "name");
        this.f168261a = str;
        this.f168262b = str2;
        this.f168263c = j;
        this.f168264d = z;
        this.f168265e = i;
        this.f168266f = z2;
        this.f168267g = "Finder.FinderFolder";
    }

    /* renamed from: a */
    public final C13604l<Integer, Long> mo83807a(boolean z) {
        Iterable<C86001b0> t = C86013q1.m106459t(this.f168261a, true);
        List<C86001b0> j = t != null ? C116299g2.m163854j(t) : null;
        if (j != null && j.size() > 1) {
            C77813z.m93909o(j, new C58770a());
        }
        long j2 = 0;
        if (j != null) {
            for (C86001b0 b0Var : j) {
                if (b0Var != null) {
                    String str = b0Var.f250472b;
                    C87412m.m108593f(str, "fileEntry.name");
                    if (!C87412m.m108589b(FilePathGenerator.NO_MEDIA_FILENAME, str)) {
                        if (z && this.f168266f) {
                            String str2 = this.f168267g;
                            Log.m105924i(str2, this.f168262b + "===>" + b0Var.f250472b + '(' + Util.getSizeKB(b0Var.f250474d) + ") " + b0Var.f250475e);
                        }
                        j2 += b0Var.f250474d;
                    }
                }
            }
        }
        return new C13604l<>(Integer.valueOf(j != null ? j.size() : 0), Long.valueOf(j2));
    }

    public String toString() {
        return this.f168262b + '(' + this.f168261a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C58769q0(String str, String str2, long j, boolean z, int i, boolean z2, int i2, C8480h hVar) {
        this(str, str2, (i2 & 4) != 0 ? -1 : j, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? false : z2);
    }
}
