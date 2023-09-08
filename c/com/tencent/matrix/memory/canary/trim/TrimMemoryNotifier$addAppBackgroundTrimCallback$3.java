package com.tencent.matrix.memory.canary.trim;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import java.util.ArrayList;
import kotlin.Metadata;
import p1028re.C89928a;
import p1028re.C89931d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/matrix/memory/canary/trim/TrimMemoryNotifier$addAppBackgroundTrimCallback$3", "Landroidx/lifecycle/r;", "Lrx3/b0;", "release", "matrix-memory-canary_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class TrimMemoryNotifier$addAppBackgroundTrimCallback$3 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C89928a f193432d;

    public TrimMemoryNotifier$addAppBackgroundTrimCallback$3(C89928a aVar) {
        this.f193432d = aVar;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void release() {
        ArrayList<C89928a> arrayList = C89931d.f258424a;
        ArrayList<C89928a> arrayList2 = C89931d.f258425b;
        synchronized (arrayList2) {
            arrayList2.remove(this.f193432d);
        }
    }
}
