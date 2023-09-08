package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import sx3.C36907w;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.n */
public final class C6478n<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23547d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23548e;

    public C6478n(C13855j jVar, C13851h1 h1Var) {
        this.f23547d = jVar;
        this.f23548e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        GetMsgList getMsgList = (GetMsgList) obj;
        HashMap hashMap = new HashMap();
        LinkedList linkedList = new LinkedList();
        if (getMsgList.f23504e) {
            List<GameLifeMsg> list = getMsgList.f23503d;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (GameLifeMsg gameLifeMsg : list) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("toUsername", gameLifeMsg.f23473d);
                    hashMap2.put("fromUsername", gameLifeMsg.f23474e);
                    hashMap2.put("messageTime", Double.valueOf(gameLifeMsg.f23475f));
                    hashMap2.put("content", gameLifeMsg.f23476g);
                    hashMap2.put("localMsgId", Integer.valueOf(gameLifeMsg.f23477h));
                    hashMap2.put("sessionId", gameLifeMsg.f23478i);
                    hashMap2.put("uiSendingStatus", Integer.valueOf(gameLifeMsg.f23479j));
                    hashMap2.put("msgSource", gameLifeMsg.f23480n);
                    hashMap2.put("appId", gameLifeMsg.f23481o);
                    hashMap2.put("messageType", Integer.valueOf(gameLifeMsg.f23482p));
                    hashMap2.put("rawMsgType", Integer.valueOf(gameLifeMsg.f23483q));
                    arrayList.add(Boolean.valueOf(linkedList.add(C13851h1.C13852a.m13142b(hashMap2))));
                }
                hashMap.put("messageList", linkedList);
            }
            C13849g gVar = this.f23547d.f39001d;
            String str = this.f23548e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(":ok ");
            sb.append(getMsgList.f23505f);
            gVar.mo10774a(str, sb.toString(), hashMap);
            return;
        }
        C13849g gVar2 = this.f23547d.f39001d;
        String str2 = this.f23548e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(":fail ");
        sb4.append(getMsgList.f23505f);
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
