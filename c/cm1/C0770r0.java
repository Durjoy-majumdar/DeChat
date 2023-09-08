package cm1;

import com.tencent.rtmp.TXLiveConstants;
import gy3.C87412m;
import tf1.C13914m;

/* renamed from: cm1.r0 */
public final class C0770r0 implements C0740i2 {

    /* renamed from: d */
    public final long f1812d;

    public C0770r0(long j) {
        this.f1812d = j;
    }

    /* renamed from: c */
    public int mo75c() {
        return TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C0770r0) || ((C0770r0) mVar).f1812d != this.f1812d) ? -1 : 0;
    }

    public long getItemId() {
        return this.f1812d;
    }

    public String toString() {
        return "ItemId=" + this.f1812d + ",ItemType=" + TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC;
    }
}
