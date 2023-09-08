package sb0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C53342n0;

/* renamed from: sb0.a */
public class C48327a extends C53342n0 {

    /* renamed from: W */
    public static IAutoDBItem.MAutoDBInfo f129397W = C53342n0.initAutoDBInfo(C48327a.class);

    /* renamed from: sb0.a$a */
    public enum C48328a {
        ALL(2),
        DEPARTMENT(32),
        EXTERNAL(128),
        NORMAL(0);
        

        /* renamed from: d */
        public final int f129403d;

        /* access modifiers changed from: public */
        C48328a(int i) {
            this.f129403d = i;
        }
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f129397W;
    }
}
