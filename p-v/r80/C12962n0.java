package r80;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: r80.n0 */
public final class C12962n0 {

    /* renamed from: a */
    public static final C12963a f36985a = new C12963a((C8480h) null);

    /* renamed from: r80.n0$a */
    public static final class C12963a {
        public C12963a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo12495a(String str) {
            C87412m.m108594g(str, "file");
            if (MMApplicationContext.isMainProcess()) {
                String str2 = C86709a0.m107535s().f251807e + "videoMix/";
                C86013q1.m106461v(str2);
                return str2 + C86013q1.m106456q(str) + "_cp_video.temp";
            }
            String str3 = C72994y1.f212832a + "tmp";
            if (!C86013q1.m106450k(str3)) {
                C86013q1.m106461v(str3);
            }
            return str3 + XVFSFile.SEPARATOR_CHAR + C86013q1.m106456q(str) + "_cp_video.temp";
        }
    }
}
