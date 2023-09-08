package e31;

import b31.C54403a;
import c31.C79925c;
import com.tencent.p014mm.plugin.crashfix.jni.BitmapReleaseImmediately;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import h81.C32735h;
import p761yd.C38993b;

/* renamed from: e31.a */
public class C58526a implements C79925c {

    /* renamed from: e31.a$a */
    public class C58527a implements C54403a.C54404a {
        public C58527a(C58526a aVar) {
        }
    }

    /* renamed from: a */
    public boolean mo58760a(int i) {
        return C38993b.m41993c(C32735h.C32737c.clicfg_bitmap_recycle_release_native, BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) && MMApplicationContext.isMainProcess() && i >= 26 && i <= 30;
    }

    /* renamed from: d */
    public boolean mo58763d() {
        C54403a.f152605a = new C58527a(this);
        try {
            BitmapReleaseImmediately.work();
            Log.m105924i("MicroMsg.BitmapReleaseX", "work succ");
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.BitmapReleaseX", "work error");
            Log.printErrStackTrace("MicroMsg.BitmapReleaseX", e, "", new Object[0]);
            return false;
        }
    }
}
