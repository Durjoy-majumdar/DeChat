package p377qu;

import android.os.Bundle;
import cd0.C28531b;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86301e;
import ei3.C86522b;
import p680ru.C36492m;

@C86522b
/* renamed from: qu.n */
public class C36093n extends C86301e implements C36492m {
    public void qp0(Bundle bundle) {
        if (bundle != null) {
            ThreadPool.post(new C28531b(bundle), "web_call_rpt");
        }
    }
}
