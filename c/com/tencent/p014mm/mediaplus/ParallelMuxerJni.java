package com.tencent.p014mm.mediaplus;

import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import p277yf.C112439f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H J)\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H J!\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H J\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H JN\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H ¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/mediaplus/ParallelMuxerJni;", "Lyf/f;", "", "nCreate", "nPtr", "", "ptsArray", "", "fps", "", "nAddVideoPtsArray", "size", "nAddVideoSoftPtsArray", "dtsArray", "nAddVideoDtsArray", "nAddAudioPtsArray", "", "", "h264Files", "aacPath", "outputPath", "frameCount", "suggestFps", "", "mute", "nMux", "(J[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFZ)I", "nRelease", "mediaplus_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.mediaplus.ParallelMuxerJni */
public final class ParallelMuxerJni extends C112439f {

    /* renamed from: a */
    public long f310781a = -1;

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("mediaplus");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/mediaplus/ParallelMuxerJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/mediaplus/ParallelMuxerJni", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private final native int nAddAudioPtsArray(long j, long[] jArr);

    private final native int nAddVideoDtsArray(long j, long[] jArr, float f);

    private final native int nAddVideoPtsArray(long j, long[] jArr, float f);

    private final native int nAddVideoSoftPtsArray(long j, long[] jArr, int i, float f);

    private final native long nCreate();

    private final native int nMux(long j, String[] strArr, String str, String str2, long j2, float f, boolean z);

    private final native int nRelease(long j);

    /* renamed from: a */
    public final int mo148327a(long[] jArr) {
        C87412m.m108595h(jArr, "ptsArray");
        return nAddAudioPtsArray(this.f310781a, jArr);
    }

    /* renamed from: b */
    public final int mo148328b(long[] jArr, float f) {
        C87412m.m108595h(jArr, "dtsArray");
        return nAddVideoDtsArray(this.f310781a, jArr, f);
    }

    /* renamed from: c */
    public final int mo148329c(long[] jArr, float f) {
        C87412m.m108595h(jArr, "ptsArray");
        return nAddVideoPtsArray(this.f310781a, jArr, f);
    }

    /* renamed from: d */
    public final int mo148330d(long[] jArr, int i, float f) {
        C87412m.m108595h(jArr, "ptsArray");
        return nAddVideoSoftPtsArray(this.f310781a, jArr, i, f);
    }

    /* renamed from: e */
    public final boolean mo148331e() {
        long nCreate = nCreate();
        this.f310781a = nCreate;
        return nCreate >= 0;
    }

    /* renamed from: f */
    public final int mo148332f(String[] strArr, String str, String str2, long j, float f, boolean z) {
        C87412m.m108595h(strArr, "h264Files");
        C87412m.m108595h(str, "aacPath");
        C87412m.m108595h(str2, "outputPath");
        return nMux(this.f310781a, strArr, str, str2, j, f, z);
    }

    /* renamed from: g */
    public final int mo148333g() {
        return nRelease(this.f310781a);
    }
}
