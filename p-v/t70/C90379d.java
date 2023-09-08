package t70;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import cy3.C86157m;
import fy3.C32226l;
import gy3.C8479f0;
import h81.C32735h;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import p723vf.C118672d;
import p723vf.C90783g;
import p723vf.C90784h;
import p723vf.C90785i;
import p761yd.C38993b;
import rx3.C13598b0;
import sx3.C77813z;
import z04.C119027c;

/* renamed from: t70.d */
public final class C90379d implements C36961c {

    /* renamed from: d */
    public static final C90379d f259391d = new C90379d();

    /* renamed from: a */
    public boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar) {
        boolean z2 = true;
        if (!C38993b.m41993c(C32735h.C32737c.clicfg_matrix_memory_trigger_smaps_enable, true) && !BuildInfo.ENABLE_MATRIX_MEMORY_TRIGGERS && !z) {
            z2 = false;
        }
        if (z2) {
            Log.m105924i("MicroMsg.triggers.Smaps", "SmapsTrigger: type = " + i);
            C90785i.C90786a aVar = C90785i.f260700b;
            int myPid = Process.myPid();
            aVar.getClass();
            Pattern compile = Pattern.compile("^[0-9a-f]+-[0-9a-f]+\\s+([rwxps-]{4})\\s+[0-9a-f]+\\s+[0-9a-f]+:[0-9a-f]+\\s+\\d+\\s*(.*)$");
            HashMap hashMap = new HashMap();
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = null;
            try {
                File file = new File("/proc/" + myPid + "/smaps");
                C86157m.m106665a(new InputStreamReader(new FileInputStream(file), C119027c.f356488a), new C90783g(myPid, f0Var, compile, hashMap));
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.MemoryInfoFactory", th, "", new Object[0]);
            }
            ArrayList arrayList = new ArrayList(hashMap.values());
            C77813z.m93909o(arrayList, C90784h.f260699d);
            Log.m105920e("MicroMsg.triggers.Smaps", new C90785i(arrayList).toString());
        }
        return z2;
    }
}
