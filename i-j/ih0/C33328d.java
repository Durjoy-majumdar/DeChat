package ih0;

import com.tencent.p014mm.autogen.events.TabRedDotChangeEvent;
import com.tencent.p014mm.autogen.events.WeChatTabRedDotEvent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ih0.d */
public class C33328d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WeChatTabRedDotEvent f90351d;

    /* renamed from: e */
    public final /* synthetic */ C33329e f90352e;

    public C33328d(C33329e eVar, WeChatTabRedDotEvent weChatTabRedDotEvent) {
        this.f90352e = eVar;
        this.f90351d = weChatTabRedDotEvent;
    }

    public void run() {
        Log.m105927v("MicroMsg.AiRedDotData", "thread wechat tab red dot [%d] redDot[%b] unread[%d]", Integer.valueOf(this.f90351d.f79062d.f79063a), Boolean.valueOf(this.f90351d.f79062d.f79064b), Integer.valueOf(this.f90351d.f79062d.f79065c));
        if (this.f90352e.f90355f.containsKey(Integer.valueOf(this.f90351d.f79062d.f79063a))) {
            WeChatTabRedDotEvent.C28853a aVar = this.f90352e.f90355f.get(Integer.valueOf(this.f90351d.f79062d.f79063a));
            C33329e eVar = this.f90352e;
            WeChatTabRedDotEvent.C28853a aVar2 = this.f90351d.f79062d;
            eVar.getClass();
            if (aVar.f79063a == aVar2.f79063a && !(aVar.f79064b == aVar2.f79064b && aVar.f79065c == aVar2.f79065c)) {
                TabRedDotChangeEvent tabRedDotChangeEvent = new TabRedDotChangeEvent();
                TabRedDotChangeEvent.C28839a aVar3 = tabRedDotChangeEvent.f79024d;
                aVar3.f79025a = aVar2.f79063a;
                aVar3.f79026b = aVar.f79064b;
                aVar3.f79027c = aVar.f79065c;
                aVar3.f79028d = aVar2.f79064b;
                aVar3.f79029e = aVar2.f79065c;
                tabRedDotChangeEvent.publish();
                Log.m105927v("MicroMsg.AiRedDotData", "check red status tab[%d] old[%b %d] new[%b %d]", Integer.valueOf(aVar2.f79063a), Boolean.valueOf(aVar.f79064b), Integer.valueOf(aVar.f79065c), Boolean.valueOf(aVar2.f79064b), Integer.valueOf(aVar2.f79065c));
            }
        }
        this.f90352e.f90355f.put(Integer.valueOf(this.f90351d.f79062d.f79063a), this.f90351d.f79062d);
    }
}
