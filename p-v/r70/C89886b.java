package r70;

import android.os.SystemClock;
import com.tencent.p014mm.matrix.C80981c;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.concurrent.ConcurrentHashMap;
import oa1.C117731d;
import org.json.JSONObject;
import p269xe.C91185g;
import r70.C89888c;

/* renamed from: r70.b */
public class C89886b implements C89888c.C89890b {

    /* renamed from: a */
    public final ConcurrentHashMap<String, C89887a> f258333a = new ConcurrentHashMap<>();

    /* renamed from: r70.b$a */
    public static final class C89887a {

        /* renamed from: a */
        public int f258334a = 0;

        /* renamed from: b */
        public long f258335b = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public boolean mo124178a(C91185g gVar) {
        if (!gVar.f261447e.mo112098b().equals("Trace")) {
            return false;
        }
        JSONObject jSONObject = gVar.f261446d;
        String str = gVar.f261444b;
        if (str.equalsIgnoreCase("Trace_EvilMethod")) {
            if (!jSONObject.getString("detail").equalsIgnoreCase("NORMAL") || MultiProcessMMKV.getDefault().decodeBool("clicfg_normal_report", false) || C80981c.m98873c()) {
                return false;
            }
        } else if (str.equalsIgnoreCase("Trace_FPS")) {
            String string = jSONObject.getString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C89887a aVar = this.f258333a.get(string);
            if (aVar == null) {
                aVar = new C89887a();
                this.f258333a.put(string, aVar);
            }
            long uptimeMillis = SystemClock.uptimeMillis() - aVar.f258335b;
            int i = aVar.f258334a + 1;
            aVar.f258334a = i;
            if (i <= 12 || uptimeMillis > 2400000) {
                return false;
            }
            this.f258333a.put(string, new C89887a());
        } else if (!str.equalsIgnoreCase("Trace_StartUp") || C117731d.m166007c().mo182445g("clicfg_matrix_startup_report", false, true)) {
            return false;
        }
        return true;
    }
}
