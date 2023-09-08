package t70;

import android.os.Debug;
import com.tencent.matrix.resource.MemoryUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p269xe.C91190k;
import p269xe.C91191l;
import p723vf.C118672d;
import p761yd.C38993b;
import p955df.C86266e;
import qe3.C89625d;
import rx3.C13598b0;

/* renamed from: t70.b */
public final class C90378b implements C36961c {

    /* renamed from: d */
    public static final C90378b f259390d = new C90378b();

    /* renamed from: a */
    public boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar) {
        File file;
        boolean z2;
        C32226l<Object, C13598b0> lVar2 = lVar;
        long currentTimeMillis = System.currentTimeMillis();
        long a = C38993b.m41991a(C32735h.C32737c.clicfg_matrix_memory_trigger_hprof_enable_until_millis, 0);
        if (!((currentTimeMillis < a && a - currentTimeMillis <= TimeUnit.DAYS.toMillis(7)) || BuildInfo.ENABLE_MATRIX_MEMORY_TRIGGERS || BuildInfo.IS_FLAVOR_P_ALPHA || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || C89625d.f257845k || WeChatEnvironment.hasDebugger() || z)) {
            return false;
        }
        Log.m105924i("MicroMsg.triggers.Hprof", "HprofTrigger: ");
        C13598b0 b0Var = null;
        try {
            file = C86266e.f250872e.mo120674b("trigger", false);
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.triggers.Hprof", th, "", new Object[0]);
            file = null;
        }
        if (file == null) {
            Log.m105920e("MicroMsg.triggers.Hprof", "HprofTrigger: prepare hprof file failed, see log above");
            return false;
        }
        try {
            String absolutePath = file.getAbsolutePath();
            C87412m.m108593f(absolutePath, "hprof.absolutePath");
            z2 = MemoryUtil.m98119e(absolutePath, 0);
        } catch (Throwable th4) {
            C118672d.m167354d("MicroMsg.triggers.Hprof", th4, "", new Object[0]);
            z2 = false;
        }
        if (z2) {
            if (lVar2 != null) {
                String absolutePath2 = file.getAbsolutePath();
                C87412m.m108593f(absolutePath2, "hprof.absolutePath");
                lVar2.invoke(absolutePath2);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                C91190k.C26537a aVar = C91190k.f261451a;
                long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("hprof", file.getAbsolutePath());
                } catch (Throwable th5) {
                    C118672d.m167354d("Matrix.Safe", th5, "", new Object[0]);
                }
                aVar.mo53491a(new C91190k.C26538b(5, (String) null, 0, 0, freeMemory, nativeHeapAllocatedSize, 0, 0, (String) null, 0, (String) null, 0, (String) null, 0, 0, 0, (String) null, (String) null, 0, i, 0, 0, 0, 0, (String) null, (String) null, C91191l.m114455a(jSONObject), 0, 0, (String) null, (String) null, 0, 0, -67633202, 1, (C8480h) null));
            }
        }
        return z2;
    }
}
