package hi2;

import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.HashMap;
import lh2.C109344g0;

/* renamed from: hi2.q */
public final class C59917q implements C109344g0 {

    /* renamed from: d */
    public final HashMap<String, Long> f171023d = new HashMap<>();

    /* renamed from: a */
    public final long mo84844a(String str, String str2) {
        C87412m.m108594g(str, "tag");
        long j = -1;
        if (this.f171023d.get(str) == null) {
            Log.m105920e("MicroMsg.RecordTimeCalculatePlugin", str + " miss start mark!!!");
            return -1;
        }
        Long l = this.f171023d.get(str);
        if (l != null) {
            j = System.currentTimeMillis() - l.longValue();
            StringBuilder sb = new StringBuilder();
            if (str2 != null) {
                str = str2;
            }
            sb.append(str);
            sb.append(" cost time:");
            sb.append(j);
            Log.m105924i("MicroMsg.RecordTimeCalculatePlugin", sb.toString());
        }
        return j;
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return C59917q.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
        this.f171023d.clear();
    }

    public void reset() {
    }

    public void setVisibility(int i) {
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
