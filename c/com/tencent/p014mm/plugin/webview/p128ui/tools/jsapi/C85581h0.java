package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import b30.C39723a;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ob0.C117747y;
import p209nt.C11270c;
import p209nt.C89090b;
import t83.C13851h1;
import te3.C49713hj2;
import te3.C90411fk2;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h0 */
public class C85581h0 implements C11270c.C11271a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f249473a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler$$o0 f249474b;

    /* renamed from: c */
    public final /* synthetic */ String f249475c;

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f249476d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h0$a */
    public class C85582a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C90411fk2 f249477d;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.h0$a$a */
        public class C85583a implements C85590k1.C85591a {
            public C85583a() {
            }

            /* renamed from: a */
            public void mo67901a(int i, Bundle bundle) {
                Log.m105925i("MicroMsg.MsgHandler", "stev onRevMsg resultCode %d", Integer.valueOf(i));
                if (i == 1 || i == 2) {
                    C85581h0 h0Var = C85581h0.this;
                    MsgHandler msgHandler = h0Var.f249476d;
                    String str = h0Var.f249475c;
                    C13851h1 h1Var = h0Var.f249473a;
                    MsgHandler$$o0 msgHandler$$o0 = h0Var.f249474b;
                    msgHandler.getClass();
                    LinkedList linkedList = new LinkedList();
                    Iterator it = ((ArrayList) bundle.getSerializable("key_scope")).iterator();
                    while (it.hasNext()) {
                        linkedList.add((String) it.next());
                    }
                    C86709a0.m107524d().mo123460f((C117747y) ((C89090b) C86312j.m106911c(C89090b.class)).mo123233vW(str, linkedList, 0, i, new C85580g0(msgHandler, h1Var, msgHandler$$o0, i)));
                    if (i == 2) {
                        C85581h0 h0Var2 = C85581h0.this;
                        h0Var2.f249476d.mo7210k5(h0Var2.f249473a, "authorize:fail auth deny", (Map<String, Object>) null);
                        ((MsgHandler$$h) C85581h0.this.f249474b).mo7246a();
                        return;
                    }
                    return;
                }
                Log.m105918d("MicroMsg.MsgHandler", "press back button!");
                C85581h0 h0Var3 = C85581h0.this;
                h0Var3.f249476d.mo7210k5(h0Var3.f249473a, "authorize:fail auth cancel", (Map<String, Object>) null);
                ((MsgHandler$$h) C85581h0.this.f249474b).mo7246a();
            }
        }

        public C85582a(C90411fk2 fk22) {
            this.f249477d = fk22;
        }

        public void run() {
            C90411fk2 fk22 = this.f249477d;
            LinkedList<C90437rw3> linkedList = fk22.f259515e;
            String str = fk22.f259516f;
            String str2 = fk22.f259517g;
            C85590k1 k1Var = new C85590k1(C85581h0.this.f249476d.f22697d);
            C85583a aVar = new C85583a();
            if (linkedList == null || linkedList.size() <= 0) {
                Log.m105920e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
                C85581h0 h0Var = C85581h0.this;
                h0Var.f249476d.mo7210k5(h0Var.f249473a, "authorize:fail", (Map<String, Object>) null);
                ((MsgHandler$$h) C85581h0.this.f249474b).mo7246a();
            } else if (!k1Var.mo119057a(linkedList, str, str2, (String) null, aVar)) {
                ((MsgHandler$$h) C85581h0.this.f249474b).mo7246a();
            }
        }
    }

    public C85581h0(MsgHandler msgHandler, C13851h1 h1Var, MsgHandler$$o0 msgHandler$$o0, String str) {
        this.f249476d = msgHandler;
        this.f249473a = h1Var;
        this.f249474b = msgHandler$$o0;
        this.f249475c = str;
    }

    /* renamed from: a */
    public void mo11329a(int i, int i2, String str, C11270c cVar) {
        Log.m105925i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            this.f249476d.mo7210k5(this.f249473a, "authorize:fail", (Map<String, Object>) null);
            ((MsgHandler$$h) this.f249474b).mo7246a();
        } else if (cVar instanceof C11270c) {
            C90411fk2 fk22 = (C90411fk2) ((C39723a) cVar).f106580d.f127056b.f127083a;
            C49713hj2 hj22 = fk22.f259514d;
            int i3 = hj22.f134688d;
            String str2 = hj22.f134689e;
            Log.m105925i("MicroMsg.MsgHandler", "NetSceneJSAuthorize jsErrcode %d", Integer.valueOf(i3));
            if (i3 == -12000) {
                MMHandlerThread.postToMainThread(new C85582a(fk22));
            } else if (i3 == 0) {
                this.f249476d.mo7210k5(this.f249473a, "authorize:ok", (Map<String, Object>) null);
                ((MsgHandler$$h) this.f249474b).mo7246a();
            } else {
                Log.m105921e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSAuthorize ERROR %s", str2);
                this.f249476d.mo7210k5(this.f249473a, "authorize:fail", (Map<String, Object>) null);
                ((MsgHandler$$h) this.f249474b).mo7246a();
            }
        }
    }
}
