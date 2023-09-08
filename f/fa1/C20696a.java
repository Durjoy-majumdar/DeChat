package fa1;

import android.util.Pair;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import g91.C20813c;
import i20.C21043a;
import j20.C21153d;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: fa1.a */
public final class C20696a {

    /* renamed from: a */
    public static final C21153d f58510a = new C20697a();

    /* renamed from: b */
    public static volatile boolean f58511b;

    /* renamed from: fa1.a$a */
    public class C20697a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            C20813c.m22810a().mo32508c(220, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public static boolean m22649a(String str) {
        String a = C115411b.f345922a.mo175244a(str);
        return "124".equals(a) || "109".equals(a);
    }

    /* renamed from: b */
    public static void m22650b(String str) {
        if ("com.tencent.mm.plugin.scanner.ui.BaseScanUI".equals(str)) {
            Log.m105925i("HABBYGE-MALI.ScanSessionHandler", "ScanSessionHandler, startMonitor: %s", str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Pair.create("goBack", "()V"));
            HashMap hashMap = new HashMap();
            hashMap.put("com/tencent/mm/plugin/scanner/ui/BaseScanUI", arrayList);
            C21043a.m23197h().mo32758l(hashMap, f58510a);
        }
    }
}
