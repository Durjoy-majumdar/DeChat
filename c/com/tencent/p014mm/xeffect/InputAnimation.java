package com.tencent.p014mm.xeffect;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H J\u0011\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H ¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/InputAnimation;", "", "", "nInit", "ptr", "startMs", "endMs", "", "interpolator", "Lrx3/b0;", "nUpdate", "nDestroy", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.InputAnimation */
public final class InputAnimation {

    /* renamed from: a */
    public final long f319972a = nInit();

    /* renamed from: b */
    public long f319973b;

    /* renamed from: c */
    public long f319974c;

    public final void finalize() {
        nDestroy(this.f319972a);
    }

    public final native void nDestroy(long j);

    public final native long nInit();

    public final native void nUpdate(long j, long j2, long j3, int i);
}
