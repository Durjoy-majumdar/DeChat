package hh0;

import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: hh0.c */
public class C32910c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeChatTabRedDotEvent f89472d;

    /* renamed from: e */
    public final /* synthetic */ C32913e f89473e;

    /* renamed from: hh0.c$a */
    public class C32911a implements Runnable {
        public C32911a() {
        }

        public void run() {
            Log.m105927v("MicroMsg.AiFinderData", "wechat tab red dot [%d] redDot[%b] unread[%d]", Integer.valueOf(C32910c.this.f89472d.f79062d.f79063a), Boolean.valueOf(C32910c.this.f89472d.f79062d.f79064b), Integer.valueOf(C32910c.this.f89472d.f79062d.f79065c));
            C32910c cVar = C32910c.this;
            WeChatTabRedDotEvent.C28853a aVar = cVar.f89472d.f79062d;
            if (aVar.f79063a == 2) {
                C32908a aVar2 = cVar.f89473e.f89481a;
                aVar2.f89463c = aVar.f79064b;
                aVar2.f89464d = aVar.f79065c;
            }
        }
    }

    public C32910c(C32913e eVar, WeChatTabRedDotEvent weChatTabRedDotEvent) {
        this.f89473e = eVar;
        this.f89472d = weChatTabRedDotEvent;
    }

    public void run() {
        if (this.f89473e.mo58856a()) {
            ((C119157j) C119157j.f356862d).mo183895z(new C32911a());
        }
    }
}
