package j41;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38644q6;

/* renamed from: j41.a */
public class C33509a extends C38644q6 {

    /* renamed from: r */
    public static IAutoDBItem.MAutoDBInfo f90727r = C38644q6.initAutoDBInfo(C38644q6.class);

    /* renamed from: p */
    public long f90728p;

    /* renamed from: q */
    public String f90729q;

    public C33509a() {
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f90727r;
    }

    public String toString() {
        return "NewUserBehaviourCache{, cacheTime=" + this.f90728p + ", reportStr=" + this.f90729q + '\'' + '}';
    }

    public C33509a(long j, String str) {
        this.f90728p = j;
        this.f90729q = str;
    }
}
