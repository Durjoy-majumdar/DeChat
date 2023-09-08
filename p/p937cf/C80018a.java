package p937cf;

import com.tencent.p014mm.matrix.C80993l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.TimeUnit;
import ur3.C90728a;

/* renamed from: cf.a */
public final class C80018a {

    /* renamed from: f */
    public static final long f234428f;

    /* renamed from: g */
    public static final long f234429g;

    /* renamed from: h */
    public static final /* synthetic */ int f234430h = 0;

    /* renamed from: a */
    public final C90728a f234431a;

    /* renamed from: b */
    public final C80020b f234432b;

    /* renamed from: c */
    public final String f234433c;

    /* renamed from: d */
    public final String f234434d;

    /* renamed from: e */
    public final boolean f234435e;

    /* renamed from: cf.a$b */
    public enum C80020b {
        NO_DUMP,
        AUTO_DUMP,
        MANUAL_DUMP,
        SILENCE_ANALYSE,
        FORK_ANALYSE,
        LAZY_FORK_ANALYZE
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f234428f = timeUnit.toMillis(1);
        f234429g = timeUnit.toMillis(20);
    }

    public C80018a(C90728a aVar, C80020b bVar, boolean z, String str, String str2, boolean z2, C80019a aVar2) {
        this.f234431a = aVar;
        this.f234432b = bVar;
        this.f234433c = str;
        this.f234434d = str2;
        this.f234435e = z2;
    }

    /* renamed from: a */
    public long mo110261a() {
        C90728a aVar = this.f234431a;
        long j = f234428f;
        String b = ((C80993l) aVar).mo112815b("clicfg_matrix_resource_detect_interval_millis", "");
        return Util.isNullOrNil(b) ? j : Util.getLong(b, j);
    }
}
