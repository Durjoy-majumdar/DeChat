package fa3;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import p158gt.C76051j;

/* renamed from: fa3.d */
public class C75737d implements C76051j.C76052a {

    /* renamed from: d */
    public final /* synthetic */ C75733c f222339d;

    public C75737d(C75733c cVar) {
        this.f222339d = cVar;
    }

    /* renamed from: T2 */
    public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.MultiTerminalSyncMgr", "download image msgid:%d, [%d,%d]", Long.valueOf(j2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (i3 == 0 && i4 == 0) {
            this.f222339d.mo106058c(j2);
        }
    }

    /* renamed from: f0 */
    public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
    }

    /* renamed from: x4 */
    public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
    }
}
