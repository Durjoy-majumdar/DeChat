package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.os.Bundle;
import b30.C79662c;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import ob0.C117747y;
import p209nt.C11272e;
import p209nt.C89090b;
import t83.C13851h1;
import te3.C49713hj2;
import te3.C90421jk2;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.f0 */
public class C85577f0 implements C11272e.C11273a {

    /* renamed from: a */
    public final /* synthetic */ C13851h1 f249461a;

    /* renamed from: b */
    public final /* synthetic */ MsgHandler$$o0 f249462b;

    /* renamed from: c */
    public final /* synthetic */ String f249463c;

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f249464d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.f0$a */
    public class C85578a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C90421jk2 f249465d;

        /* renamed from: e */
        public final /* synthetic */ String f249466e;

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.f0$a$a */
        public class C85579a implements C85590k1.C85591a {
            public C85579a() {
            }

            /* renamed from: a */
            public void mo67901a(int i, Bundle bundle) {
                int i2 = i;
                Log.m105925i("MicroMsg.MsgHandler", "onRevMsg resultCode %d", Integer.valueOf(i));
                if (i2 == 1 || i2 == 2) {
                    C85578a aVar = C85578a.this;
                    C85577f0 f0Var = C85577f0.this;
                    MsgHandler msgHandler = f0Var.f249464d;
                    String str = f0Var.f249463c;
                    String str2 = aVar.f249466e;
                    C13851h1 h1Var = f0Var.f249461a;
                    MsgHandler$$o0 msgHandler$$o0 = f0Var.f249462b;
                    msgHandler.getClass();
                    LinkedList linkedList = new LinkedList();
                    Iterator it = ((ArrayList) bundle.getSerializable("key_scope")).iterator();
                    while (it.hasNext()) {
                        linkedList.add((String) it.next());
                    }
                    C86709a0.m107524d().mo123460f((C117747y) ((C89090b) C86312j.m106911c(C89090b.class)).Sf0(str, linkedList, 0, str2, 0, i, new C85576e0(msgHandler, h1Var, msgHandler$$o0, i2)));
                    if (i2 == 2) {
                        Log.m105920e("MicroMsg.MsgHandler", "fail auth deny!");
                        C85577f0 f0Var2 = C85577f0.this;
                        f0Var2.f249464d.mo7210k5(f0Var2.f249461a, "login:fail auth deny", (Map<String, Object>) null);
                        ((MsgHandler$$h) C85577f0.this.f249462b).mo7246a();
                        return;
                    }
                    return;
                }
                Log.m105924i("MicroMsg.MsgHandler", "press back button!");
                C85577f0 f0Var3 = C85577f0.this;
                f0Var3.f249464d.mo7210k5(f0Var3.f249461a, "login:fail auth cancel", (Map<String, Object>) null);
                ((MsgHandler$$h) C85577f0.this.f249462b).mo7246a();
            }
        }

        public C85578a(C90421jk2 jk22, String str) {
            this.f249465d = jk22;
            this.f249466e = str;
        }

        public void run() {
            C90421jk2 jk22 = this.f249465d;
            LinkedList<C90437rw3> linkedList = jk22.f259630f;
            String str = jk22.f259631g;
            String str2 = jk22.f259632h;
            Log.m105919d("MicroMsg.MsgHandler", "appName %s, appIconUrl %s", str, str2);
            C85590k1 k1Var = new C85590k1(C85577f0.this.f249464d.f22697d);
            C85579a aVar = new C85579a();
            if (linkedList == null || linkedList.size() <= 0) {
                Log.m105920e("MicroMsg.MsgHandler", "scopeInfoList is empty!");
                C85577f0 f0Var = C85577f0.this;
                f0Var.f249464d.mo7210k5(f0Var.f249461a, "login:fail", (Map<String, Object>) null);
                ((MsgHandler$$h) C85577f0.this.f249462b).mo7246a();
            } else if (!k1Var.mo119057a(linkedList, str, str2, (String) null, aVar)) {
                ((MsgHandler$$h) C85577f0.this.f249462b).mo7246a();
            }
        }
    }

    public C85577f0(MsgHandler msgHandler, C13851h1 h1Var, MsgHandler$$o0 msgHandler$$o0, String str) {
        this.f249464d = msgHandler;
        this.f249461a = h1Var;
        this.f249462b = msgHandler$$o0;
        this.f249463c = str;
    }

    /* renamed from: a */
    public void mo11330a(int i, int i2, String str, C11272e eVar) {
        Log.m105925i("MicroMsg.MsgHandler", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            this.f249464d.mo7210k5(this.f249461a, "login:fail", (Map<String, Object>) null);
            ((MsgHandler$$h) this.f249462b).mo7246a();
        } else if (eVar instanceof C11272e) {
            C90421jk2 j1 = ((C79662c) eVar).mo109787j1();
            C49713hj2 hj22 = j1.f259628d;
            int i3 = hj22.f134688d;
            String str2 = hj22.f134689e;
            String str3 = j1.f259637p;
            Log.m105925i("MicroMsg.MsgHandler", "NetSceneJSLogin jsErrcode %d", Integer.valueOf(i3));
            if (i3 == -12000) {
                MMHandlerThread.postToMainThread(new C85578a(j1, str3));
            } else if (i3 == 0) {
                String str4 = j1.f259629e;
                HashMap hashMap = new HashMap();
                hashMap.put("code", str4);
                this.f249464d.mo7210k5(this.f249461a, "login:ok", hashMap);
                Log.m105919d("MicroMsg.MsgHandler", "resp data code [%s]", str4);
                ((MsgHandler$$h) this.f249462b).mo7246a();
            } else {
                this.f249464d.mo7210k5(this.f249461a, "login:fail", (Map<String, Object>) null);
                Log.m105921e("MicroMsg.MsgHandler", "onSceneEnd NetSceneJSLogin %s", str2);
                ((MsgHandler$$h) this.f249462b).mo7246a();
            }
        }
    }
}
