package ll0;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.xweb.IXWebBroadcastListener;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: ll0.c */
public class C88572c extends C82016a0<C83780d1> {
    private static final int CTRL_INDEX = 583;
    private static final String NAME = "getSelectedTextRange";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        int[] iArr = (int[]) new C88571b(this, (C83780d1) fVar).exec(new MMHandler(Looper.getMainLooper()));
        if (iArr == null) {
            return mo115109j("fail:no focused input");
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put(IXWebBroadcastListener.STAGE_START, Integer.valueOf(iArr[0]));
        hashMap.put("end", Integer.valueOf(iArr[1]));
        return mo115112m("ok", hashMap);
    }
}
