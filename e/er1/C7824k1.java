package er1;

import android.content.Context;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dp1.C7435f2;
import gy3.C87412m;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import te3.C49712hj1;

/* renamed from: er1.k1 */
public final class C7824k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f26361d;

    public C7824k1(Context context) {
        this.f26361d = context;
    }

    public final void run() {
        C49712hj1 hj12;
        Context context = this.f26361d;
        C87412m.m108594g(context, "context");
        C13442s8 f = C13442s8.f38060Q0.mo12873f(context);
        if (f != null) {
            hj12 = f.mo12861q3();
            hj12.f134675i = 97;
        } else {
            hj12 = null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 6);
        } catch (JSONException unused) {
        }
        C7435f2.f25626a.mo8577a(hj12, "", 0, jSONObject);
    }
}
