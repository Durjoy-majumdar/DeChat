package g21;

import a70.C112760b;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C75592q0;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;

/* renamed from: g21.a */
public class C75825a implements C98124g.C98125a {

    /* renamed from: f */
    public static C75825a f222435f;

    /* renamed from: d */
    public Map<String, C75827b> f222436d;

    /* renamed from: e */
    public String f222437e;

    /* renamed from: g21.a$a */
    public class C75826a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f222438d;

        /* renamed from: e */
        public final /* synthetic */ C98121d f222439e;

        /* renamed from: f */
        public final /* synthetic */ int f222440f;

        public C75826a(String str, C98121d dVar, int i) {
            this.f222438d = str;
            this.f222439e = dVar;
            this.f222440f = i;
        }

        public void run() {
            C75827b bVar = (C75827b) ((HashMap) C75825a.this.f222436d).get(this.f222438d);
            if (bVar != null) {
                C98121d dVar = this.f222439e;
                if (dVar != null) {
                    bVar.mo94665a(this.f222438d, this.f222440f, dVar.field_retCode);
                    ((HashMap) C75825a.this.f222436d).remove(this.f222438d);
                    if (this.f222439e.field_retCode == 0) {
                        C115669n.INSTANCE.idkeyStat(724, 8, 1, false);
                    } else {
                        C115669n.INSTANCE.idkeyStat(724, 9, 1, false);
                    }
                } else {
                    Log.m105926v("MicroMsg.QrRewardCdnDownloadHelper", "download is not end");
                }
            } else {
                Log.m105928w("MicroMsg.QrRewardCdnDownloadHelper", "no callback");
            }
        }
    }

    /* renamed from: g21.a$b */
    public interface C75827b {
        /* renamed from: a */
        void mo94665a(String str, int i, int i2);
    }

    /* renamed from: b */
    public static String m91074b() {
        return C112760b.m154195C() + "wallet/img" + "/";
    }

    /* renamed from: c */
    public static C75825a m91075c() {
        if (f222435f == null) {
            f222435f = new C75825a();
        }
        return f222435f;
    }

    /* renamed from: a */
    public String mo106111a() {
        if (Util.isNullOrNil(this.f222437e)) {
            this.f222437e = MD5Util.getMD5String(C75592q0.m90789s() + "_reward_img");
        }
        return this.f222437e;
    }

    /* renamed from: d */
    public boolean mo106112d() {
        return new C86009m1(m91074b() + mo106111a()).mo119967g();
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        Log.m105925i("MicroMsg.QrRewardCdnDownloadHelper", "cdn callback, id: %s, ret: %s, sceneResult: %s", str, Integer.valueOf(i), dVar);
        MMHandlerThread.postToMainThread(new C75826a(str, dVar, i));
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
