package qb1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p749xh.C102660p2;

/* renamed from: qb1.a */
public final class C101088a extends C102660p2 {

    /* renamed from: F */
    public static final IAutoDBItem.MAutoDBInfo f295918F = C102660p2.initAutoDBInfo(C102660p2.class);

    /* renamed from: G */
    public static final SimpleDateFormat f295919G = new SimpleDateFormat("yyyy.MM.dd HH:mm", Locale.ENGLISH);

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f295918F;
    }

    public String toString() {
        return toJSON().toString() + "delTimeF:" + mo140540v2(mo142412m2()) + " updateTimeF:" + mo140540v2(getUpdateTime());
    }

    /* renamed from: v2 */
    public final String mo140540v2(long j) {
        try {
            String format = f295919G.format(Long.valueOf(j));
            C87412m.m108593f(format, "{\n            sdf.format(time)\n        }");
            return format;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FavDelMgr", th, "format err", new Object[0]);
            return String.valueOf(j);
        }
    }
}
