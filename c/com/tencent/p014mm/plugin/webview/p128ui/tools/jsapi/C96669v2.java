package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ExtPlayerEvent;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C76996p;
import p749xh.C66261f3;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.v2 */
public class C96669v2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WebViewJSSDKFileItem f283132d;

    /* renamed from: e */
    public final /* synthetic */ String f283133e;

    /* renamed from: f */
    public final /* synthetic */ MsgHandler f283134f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.v2$a */
    public class C96670a implements C76996p.C77000a {
        public C96670a() {
        }

        public void onCompletion() {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("playResult", "onVoicePlayEnd:ok");
                bundle.putString(C66261f3.COL_LOCALID, C96669v2.this.f283133e);
                C96669v2.this.f283134f.f22715x.callback(2002, bundle);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MsgHandler", "notify voice play end failed : %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.v2$b */
    public class C96671b implements C76996p.C77001b {
        public C96671b() {
        }

        /* renamed from: a */
        public void mo96016a() {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("playResult", "onVoicePlayEnd:fail");
                bundle.putString(C66261f3.COL_LOCALID, C96669v2.this.f283133e);
                C96669v2.this.f283134f.f22715x.callback(2002, bundle);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MsgHandler", "notify voice play end failed : %s", e.getMessage());
            }
        }
    }

    public C96669v2(MsgHandler msgHandler, WebViewJSSDKFileItem webViewJSSDKFileItem, String str) {
        this.f283134f = msgHandler;
        this.f283132d = webViewJSSDKFileItem;
        this.f283133e = str;
    }

    public void run() {
        ExtPlayerEvent extPlayerEvent = new ExtPlayerEvent();
        ExtPlayerEvent.C92500a aVar = extPlayerEvent.f264779d;
        aVar.f264781a = 1;
        aVar.f264782b = this.f283132d.f283027j;
        aVar.f264784d = true;
        aVar.f264785e = new C96670a();
        aVar.f264786f = new C96671b();
        extPlayerEvent.publish();
    }
}
