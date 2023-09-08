package p417qz;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import h81.C32735h;
import org.json.JSONObject;
import p682rz.C36593i;

@C86522b
/* renamed from: qz.a */
public final class C36209a extends C86301e implements C36593i {
    public int f30() {
        Class cls = C32735h.class;
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_long_video_max_duration_android, 1801);
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_long_video_models_config_android, "");
        if (Util.isNullOrNil(Y60)) {
            return Qe;
        }
        try {
            JSONObject jSONObject = new JSONObject(Y60);
            int i = jSONObject.getInt("apiLevel");
            double d = jSONObject.getDouble("durationMultiplier");
            return (d < 0.0d || Build.VERSION.SDK_INT > i) ? Qe : (int) (((double) Qe) * d);
        } catch (Throwable unused) {
            return Qe;
        }
    }
}
