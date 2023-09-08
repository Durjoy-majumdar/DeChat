package za2;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import la2.C99355b;
import la2.C99364n;
import qc0.C101106m;

/* renamed from: za2.c */
public class C102985c {
    /* renamed from: a */
    public static boolean m136170a(C101106m mVar) {
        if (mVar == null || TextUtils.isEmpty(mVar.f295945F)) {
            return false;
        }
        Log.m105919d("MicroMsg.Music.MusicPlayerSupport", "protocol:%s", mVar.f295945F);
        return "hls".equalsIgnoreCase(mVar.f295945F);
    }

    /* renamed from: b */
    public static boolean m136171b(int i) {
        if (!(i == 0 || i == 1 || i == 4 || i == 5 || i == 14)) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    break;
                default:
                    C99355b m = C99364n.m129618m();
                    return m != null && m.mo138789r(i);
            }
        }
        return true;
    }
}
