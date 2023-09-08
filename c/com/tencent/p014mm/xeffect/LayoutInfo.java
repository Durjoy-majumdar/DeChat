package com.tencent.p014mm.xeffect;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H J9\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H J\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002H ¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/LayoutInfo;", "", "", "nInit", "ptr", "", "centerX", "centerY", "", "scale", "rotate", "scaleBase", "Lrx3/b0;", "nUpdate", "nDestroy", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.LayoutInfo */
public final class LayoutInfo {

    /* renamed from: a */
    public final long f319975a = nInit();

    /* renamed from: b */
    public int f319976b;

    /* renamed from: c */
    public int f319977c;

    /* renamed from: d */
    public float f319978d = 1.0f;

    /* renamed from: e */
    public int f319979e;

    public final void finalize() {
        nDestroy(this.f319975a);
    }

    public final native void nDestroy(long j);

    public final native long nInit();

    public final native void nUpdate(long j, int i, int i2, float f, float f2, int i3);
}
