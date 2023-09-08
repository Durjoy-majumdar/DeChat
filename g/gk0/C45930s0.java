package gk0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import te3.C48677a8;

/* renamed from: gk0.s0 */
public class C45930s0 implements C87581a<Object, C48677a8> {
    public C45930s0(C45931t0 t0Var) {
    }

    public Object call(Object obj) {
        C48677a8 a8Var = (C48677a8) obj;
        if (a8Var == null) {
            Log.m105920e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData cgi failed, null response");
            return null;
        }
        int i = a8Var.BaseResponse.f135955d;
        if (i != 0) {
            Log.m105921e("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(i), a8Var.BaseResponse.f135956e);
            return null;
        }
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "requestAuthUserAutoFillData success");
        return null;
    }
}
