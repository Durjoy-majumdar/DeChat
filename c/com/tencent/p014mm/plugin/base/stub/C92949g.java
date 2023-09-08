package com.tencent.p014mm.plugin.base.stub;

import android.app.Activity;
import android.net.Uri;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.modelsimple.C40360i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import eb0.C97625j3;
import java.net.URLDecoder;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.base.stub.g */
public class C92949g implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ Activity f267707d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f267708e;

    /* renamed from: com.tencent.mm.plugin.base.stub.g$a */
    public class C92950a implements Runnable {
        public C92950a() {
        }

        public void run() {
            C92949g.this.f267707d.finish();
        }
    }

    public C92949g(Activity activity, Runnable runnable) {
        this.f267707d = activity;
        this.f267708e = runnable;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C97625j3.m125815e().mo123470p(1200, this);
        Log.m105925i("MicroMsg.WXBizLogic", "dealWithHandleScanResult translateLink: errType = %d; errCode = %d; errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i == 0 && i2 == 0) {
            String H0 = ((C40360i0) yVar).mo63046H0();
            Log.m105925i("MicroMsg.WXBizLogic", "dealWithHandleScanResult respUriStr=%s", H0);
            try {
                Uri parse = Uri.parse(H0);
                if (parse == null) {
                    Log.m105920e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri null");
                    C85083h.m104912a(this.f267707d);
                    return;
                }
                String queryParameter = parse.getQueryParameter("result");
                if (queryParameter != null) {
                    String decode = URLDecoder.decode(queryParameter);
                    Log.m105919d("MicroMsg.WXBizLogic", "dealWithHandleScanResult: result=%s", decode);
                    DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
                    DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
                    aVar.f264650b = this.f267707d;
                    aVar.f264649a = decode;
                    aVar.f264651c = 19;
                    aVar.f264655g = 3;
                    aVar.f264657i = 42;
                    aVar.f264656h = parse.getQueryParameter("appid");
                    dealQBarStrEvent.f264648d.f264660l = this.f267707d.getIntent().getBundleExtra("_stat_obj");
                    dealQBarStrEvent.publish();
                    Runnable runnable = this.f267708e;
                    if (runnable != null) {
                        runnable.run();
                    }
                    MMHandlerThread.postToMainThreadDelayed(new C92950a(), 100);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WXBizLogic", "dealWithHandleScanResult: respUri parse exp=%s", e);
                C85083h.m104912a(this.f267707d);
            }
        } else {
            Log.m105924i("MicroMsg.WXBizLogic", "dealWithHandleScanResult: translate failed");
            C85083h.m104912a(this.f267707d);
        }
    }
}
