package p675rj;

import android.content.Context;
import com.tencent.p014mm.plugin.hardcoder.HardCoderReporterImpl;
import com.tencent.p014mm.sdk.platformtools.Util;
import yc3.C38992a;

/* renamed from: rj.a */
public class C36329a implements C38992a {
    /* renamed from: a */
    public boolean mo38a(Context context, String[] strArr, String str) {
        if (strArr.length <= 1) {
            return false;
        }
        if (Util.getInt(strArr[1], 0) > 0) {
            HardCoderReporterImpl.f81457f = true;
        } else {
            HardCoderReporterImpl.f81457f = false;
        }
        return true;
    }
}
