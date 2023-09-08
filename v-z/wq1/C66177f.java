package wq1;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import xq1.C66408e;
import xq1.C66413j;

/* renamed from: wq1.f */
public abstract class C66177f extends C66413j {

    /* renamed from: e */
    public final String f190191e = "Finder.FinderTaskStage";

    /* renamed from: f */
    public long f190192f;

    /* renamed from: g */
    public long f190193g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66177f(String str) {
        super(str);
        C87412m.m108594g(str, "taskId");
    }

    /* renamed from: c */
    public C66408e mo90273c() {
        String str = this.f190191e;
        Log.m105924i(str, "task-" + this.f191158d + " start");
        this.f190192f = C31543z5.m39453c();
        this.f190193g = 0;
        C66408e g = mo75105g();
        this.f190193g = C31543z5.m39453c() - this.f190192f;
        String str2 = this.f190191e;
        Log.m105924i(str2, "task-" + this.f191158d + " end");
        return g;
    }

    /* renamed from: g */
    public abstract C66408e mo75105g();
}
