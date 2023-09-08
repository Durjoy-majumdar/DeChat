package x81;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C118444mn3;

public final /* synthetic */ class a$$c implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ long f355581d;

    /* renamed from: e */
    public final /* synthetic */ C118444mn3 f355582e;

    /* renamed from: f */
    public final /* synthetic */ l0$$e f355583f;

    public /* synthetic */ a$$c(long j, C118444mn3 mn32, l0$$e l0__e) {
        this.f355581d = j;
        this.f355582e = mn32;
        this.f355583f = l0__e;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        long j = this.f355581d;
        C118444mn3 mn32 = this.f355582e;
        l0$$e l0__e = this.f355583f;
        Log.m105919d("EdgeComputingReporter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(Util.milliSecondsToNow(j)), mn32.f354142j);
        if (l0__e != null) {
            return l0__e.mo1488a(i, i2, str, cVar, yVar);
        }
        return 0;
    }
}
