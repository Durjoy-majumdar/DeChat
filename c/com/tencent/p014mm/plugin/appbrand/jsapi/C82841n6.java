package com.tencent.p014mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiShowImageOperateSheet;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n6 */
public class C82841n6 implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ JsApiShowImageOperateSheet.BottomSheetLogicHelper f242257a;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.n6$a */
    public class C82842a implements C1256g<IPCInteger> {
        public C82842a() {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            if (iPCInteger == null) {
                Log.m105920e("MicroMsg.JsApiShowImageOperateSheet", "fav ipc callback data null");
                return;
            }
            int i = iPCInteger.f10313d;
            Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "fav result:%d", Integer.valueOf(i));
            Context context = C82841n6.this.f242257a.f240451c.getContext();
            if (i == 0 && (context instanceof Activity)) {
                MMHandlerThread.postToMainThread(new C82643m6(this, context));
            }
        }
    }

    public C82841n6(JsApiShowImageOperateSheet.BottomSheetLogicHelper bottomSheetLogicHelper) {
        this.f242257a = bottomSheetLogicHelper;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        Log.m105925i("MicroMsg.JsApiShowImageOperateSheet", "fav localPath:%s", str);
        if (!Util.isNullOrNil(str)) {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, new IPCString(str), JsApiShowImageOperateSheet.BottomSheetLogicHelper.C1572c.class, new C82842a());
        }
    }
}
