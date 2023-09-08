package l41;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C118444mn3;

public final /* synthetic */ class a$$b implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ long f351532d;

    /* renamed from: e */
    public final /* synthetic */ C118444mn3 f351533e;

    /* renamed from: f */
    public final /* synthetic */ l0$$e f351534f;

    public /* synthetic */ a$$b(long j, C118444mn3 mn32, l0$$e l0__e) {
        this.f351532d = j;
        this.f351533e = mn32;
        this.f351534f = l0__e;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        long j = this.f351532d;
        C118444mn3 mn32 = this.f351533e;
        l0$$e l0__e = this.f351534f;
        Log.m105919d("Amoeba.MMDataReportRouter", "onGYNetEnd errType:%d errCode:%d msg:%s  %d val:%s ", Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(Util.milliSecondsToNow(j)), mn32.f354142j);
        if (l0__e != null) {
            return l0__e.mo1488a(i, i2, str, cVar, yVar);
        }
        return 0;
    }
}
