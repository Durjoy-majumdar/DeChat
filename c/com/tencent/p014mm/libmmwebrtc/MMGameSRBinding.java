package com.tencent.p014mm.libmmwebrtc;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H JA\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H J\u0011\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0004H ¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/libmmwebrtc/MMGameSRBinding;", "", "", "cachePath", "", "createFromJNI", "libSr", "", "inputGlTex", "inWidth", "inHeight", "outputGlTex", "outWidth", "outHeight", "", "executeSRFromJNI", "Lrx3/b0;", "destroyFromJNI", "libmmwebrtc_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.libmmwebrtc.MMGameSRBinding */
public final class MMGameSRBinding {

    /* renamed from: a */
    public long f237828a;

    public MMGameSRBinding(String str) {
        C87412m.m108594g(str, "cachePath");
        this.f237828a = createFromJNI(str);
    }

    private final native long createFromJNI(String str);

    private final native void destroyFromJNI(long j);

    private final native boolean executeSRFromJNI(long j, int i, int i2, int i3, int i4, int i5, int i6);

    /* renamed from: a */
    public final boolean mo112747a(int i, int i2, int i3, int i4, int i5, int i6) {
        long j = this.f237828a;
        if (j == 0) {
            return false;
        }
        return executeSRFromJNI(j, i, i2, i3, i4, i5, i6);
    }
}
