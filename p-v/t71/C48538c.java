package t71;

import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C75592q0;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import u71.C52451c;
import v71.C37687a;

/* renamed from: t71.c */
public class C48538c implements C98124g.C98125a {

    /* renamed from: d */
    public String f129818d = null;

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Log.m105919d("MicroMsg.ExdevicePictureUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar);
        if (dVar == null || !str.equals(this.f129818d)) {
            if (cVar != null) {
                Log.m105918d("MicroMsg.ExdevicePictureUploader", "hy: upload progressing....");
            }
        } else if (i == 0 && dVar.field_retCode == 0) {
            Log.m105918d("MicroMsg.ExdevicePictureUploader", "hy: transfer done, upload callback success");
            Log.m105925i("MicroMsg.ExdevicePictureUploader", "transfer done, mediaid=%s, completeInfo=%s", str, dVar.toString());
            C37687a aVar = new C37687a();
            aVar.field_championUrl = dVar.field_fileUrl;
            aVar.field_username = C75592q0.m90789s();
            String str2 = aVar.field_championUrl;
            if (!Util.isNullOrNil(str2) && !"#".equals(str2)) {
                String mD5String = MD5Util.getMD5String(str2);
                C86009m1 m1Var = new C86009m1(C48539d.f129819a);
                if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                    m1Var.mo119987x();
                }
                C86009m1 m1Var2 = new C86009m1(m1Var, mD5String);
                if (m1Var2.mo119967g()) {
                    m1Var2.mo119971i();
                } else {
                    try {
                        m1Var2.mo119964e();
                    } catch (IOException e) {
                        Log.m105919d("MicroMsg.ExdevicePictureLocalizer", "hy: %s", e.toString());
                    }
                    C86709a0.m107525e().postToWorker(new C48537b(str2, m1Var2));
                }
            }
            C41166r1.vx0().mo61491Lo(aVar, true);
            C52451c Gx0 = C41166r1.Gx0();
            String str3 = aVar.field_championUrl;
            String str4 = aVar.field_championMotto;
            Gx0.getClass();
            C86709a0.m107529k().f251779b.mo123460f(new C48552n(str3, str4));
        } else {
            Log.m105928w("MicroMsg.ExdevicePictureUploader", "hy: transfer done, fail");
        }
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        return null;
    }
}
