package p375qh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: qh.j */
public class C35873j {
    /* renamed from: a */
    public static int m40885a(String str, int i) {
        try {
            return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str), i);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.RecorderSwitch", "getIntValFromDynamicConfig parseInt failed, key: " + str);
            return i;
        } catch (Error unused2) {
            Log.m105920e("MicroMsg.RecorderSwitch", "error on parseInt failed, key: " + str);
            return i;
        }
    }
}
