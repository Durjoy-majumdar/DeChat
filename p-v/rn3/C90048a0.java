package rn3;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: rn3.a0 */
public class C90048a0 implements C98124g.C98125a {

    /* renamed from: d */
    public final /* synthetic */ C90049b0 f258663d;

    public C90048a0(C90049b0 b0Var) {
        this.f258663d = b0Var;
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        if (i != 0) {
            Log.m105920e("MiroMsg.MusicVideoShareUtil", "CDN starts fail!");
            C90049b0 b0Var = this.f258663d;
            if (b0Var != null) {
                b0Var.mo119879a((String) null, true);
            }
            return 0;
        }
        if (dVar != null) {
            int i2 = dVar.field_retCode;
            if (i2 != 0) {
                Log.m105920e("MiroMsg.MusicVideoShareUtil", "CDN upload task fail!");
                C90049b0 b0Var2 = this.f258663d;
                if (b0Var2 != null) {
                    b0Var2.mo119879a((String) null, true);
                }
            } else {
                Log.m105925i("MiroMsg.MusicVideoShareUtil", "retCode %d, fileId %s, url %s", Integer.valueOf(i2), dVar.field_fileId, dVar.field_fileUrl);
                String str2 = dVar.field_fileUrl;
                C90049b0 b0Var3 = this.f258663d;
                if (b0Var3 != null) {
                    b0Var3.mo119879a(str2, true);
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return new byte[0];
    }
}
