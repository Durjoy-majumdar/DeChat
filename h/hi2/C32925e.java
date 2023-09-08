package hi2;

import a70.C112760b;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.vfs.VFSStrategy$$b;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.io.File;
import zt3.C119157j;

/* renamed from: hi2.e */
public final class C32925e {

    /* renamed from: a */
    public static final C32925e f89499a;

    /* renamed from: hi2.e$a */
    public static final class C32926a implements Runnable {

        /* renamed from: d */
        public static final C32926a f89500d = new C32926a();

        public final void run() {
            Iterable<C86001b0> t;
            Iterable<C86001b0> t2;
            String b = C32925e.f89499a.mo58862b("capture");
            boolean k = C86013q1.m106450k(b);
            Log.m105924i("MicroMsg.MediaFilePathUtil", "captureDir:" + b + " exist:" + k);
            int i = 0;
            if (k && (t2 = C86013q1.m106459t(b, false)) != null) {
                int i2 = 0;
                for (C86001b0 next : t2) {
                    Log.m105924i("MicroMsg.MediaFilePathUtil", "index:" + i2 + "  path:" + next.f250471a + " size:" + next.f250473c);
                    i2++;
                }
            }
            String b2 = C32925e.f89499a.mo58862b("edit");
            boolean k2 = C86013q1.m106450k(b2);
            Log.m105924i("MicroMsg.MediaFilePathUtil", "editDir:" + k2 + " exist:" + k2);
            if (k2 && (t = C86013q1.m106459t(b2, false)) != null) {
                for (C86001b0 next2 : t) {
                    Log.m105924i("MicroMsg.MediaFilePathUtil", "index:" + i + "  path:" + next2.f250471a + " size:" + next2.f250473c);
                    i++;
                }
            }
        }
    }

    static {
        C32925e eVar = new C32925e();
        f89499a = eVar;
        Log.m105924i("MicroMsg.MediaFilePathUtil", "useMediaTempPath:" + eVar.mo58865f());
        ((C119157j) C119157j.f356862d).mo183875f(C32926a.f89500d);
    }

    /* renamed from: d */
    public static /* synthetic */ String m39859d(C32925e eVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return eVar.mo58863c(str, str2);
    }

    /* renamed from: a */
    public final String mo58861a(String str) {
        C87412m.m108594g(str, "biz");
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        C86009m1 i0 = C112760b.m154236i0(str);
        if (!i0.mo119967g()) {
            i0.mo119987x();
        }
        String n = i0.mo119976n();
        C87412m.m108593f(n, "temDir.path");
        return n;
    }

    /* renamed from: b */
    public final String mo58862b(String str) {
        C87412m.m108594g(str, "biz");
        VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
        String str2 = C112760b.m154236i0("media") + File.separator + str;
        C86013q1.m106461v(str2);
        return str2;
    }

    /* renamed from: c */
    public final String mo58863c(String str, String str2) {
        if (str2 == null) {
            str2 = String.valueOf(System.currentTimeMillis());
        }
        if (TextUtils.isEmpty(str)) {
            VFSStrategy$$b vFSStrategy$$b = VFSStrategy.f348871a;
            C86009m1 i0 = C112760b.m154236i0("media");
            return i0 + File.separator + str2;
        }
        C87412m.m108591d(str);
        String b = mo58862b(str);
        return b + File.separator + str2;
    }

    /* renamed from: e */
    public final String[] mo58864e(String str, String... strArr) {
        C87412m.m108594g(str, "biz");
        C87412m.m108594g(strArr, "desc");
        String b = mo58862b(str);
        long currentTimeMillis = System.currentTimeMillis();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = b + File.separator + strArr[i] + '_' + currentTimeMillis;
        }
        return strArr2;
    }

    /* renamed from: f */
    public final boolean mo58865f() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_media_file_temp_path, true);
    }
}
