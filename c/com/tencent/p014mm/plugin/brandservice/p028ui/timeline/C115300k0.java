package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import fy3.C32224a;
import gy3.C87413o;
import java.io.RandomAccessFile;
import p007bo.C16813m;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.k0 */
public final class C115300k0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C115300k0 f345522d = new C115300k0();

    public C115300k0() {
        super(0);
    }

    public Object invoke() {
        String str = C86013q1.m106448i(VFSStrategy.m163776d("biz_persist"), false) + "/aff_db/biz.db";
        C86013q1.m106447h(str + "-wal");
        C86013q1.m106447h(str + "-shm");
        byte[] O = C86013q1.m106433O("/dev/urandom", 0, 4096);
        RandomAccessFile B = C86013q1.m106420B(str, true);
        B.write(O);
        B.close();
        C16813m.f45424a.mo17857c().getLastMsgInfo();
        return C13598b0.f38549a;
    }
}
