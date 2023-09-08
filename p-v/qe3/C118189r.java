package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86718e;
import java.io.IOException;
import sf0.C48374j0;
import te3.C118481y7;
import te3.xk4;

/* renamed from: qe3.r */
public class C118189r extends C118193t {
    public int fromProtoBuf(byte[] bArr) {
        C118481y7 y7Var;
        try {
            xk4 xk4 = (xk4) this.f353315a.parseFrom(bArr);
            this.f353315a = xk4;
            C89631w.m112066b(this, xk4.getBaseResponse());
            this.f353321g = 0;
            if (this.f353315a.getBaseResponse().f135955d == 0 && ((y7Var = this.f353315a.f354538e) == null || y7Var.f354583d == 0 || Util.isNullOrNil(C48374j0.m53715d(y7Var.f354585f)))) {
                Log.m105920e("MicroMsg.MMAuth", "retcode 0 but invalid auth sect resp or invalid uin or invalid session");
                this.f353315a.getBaseResponse().f135955d = -1;
            }
            String errMsg = getErrMsg();
            Log.m105925i("MicroMsg.MMAuth", "summerauthkick manual errmsg[%s]", errMsg);
            C86718e.f251747w = errMsg;
            return this.f353315a.getBaseResponse().f135955d;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.MMAuth", "toProtoBuf :%s", Util.stackTraceToString(e));
            this.f353315a.getBaseResponse().f135955d = -1;
            return -1;
        }
    }
}
