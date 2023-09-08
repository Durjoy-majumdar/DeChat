package ih0;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.EnterFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.EnterMainUIEvent;
import com.tencent.p014mm.autogen.events.QuitFindMoreFriendsUIEvent;
import com.tencent.p014mm.autogen.events.QuitMainUIEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AiSessionInfoStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.LinkedList;
import jh0.C33573a;
import lh0.C34262g;
import lh0.C34274n;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS})
/* renamed from: ih0.g */
public class C21093g extends C86301e {

    /* renamed from: d */
    public LinkedList<C21095o> f59647d = new LinkedList<>();

    /* renamed from: e */
    public C21095o f59648e;

    /* renamed from: ih0.g$a */
    public class C21094a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AiSessionInfoStruct f59649d;

        public C21094a(AiSessionInfoStruct aiSessionInfoStruct) {
            this.f59649d = aiSessionInfoStruct;
        }

        public void run() {
            C21093g gVar = C21093g.this;
            AiSessionInfoStruct aiSessionInfoStruct = this.f59649d;
            gVar.getClass();
            long currentTicks = Util.currentTicks();
            C34274n nVar = new C34274n();
            if (aiSessionInfoStruct != null) {
                long nowMilliSecond = Util.nowMilliSecond();
                nVar.field_ds = C33573a.m40127c(nowMilliSecond);
                nVar.field_hour = C33573a.m40128d(nowMilliSecond);
                nVar.field_lastSession = aiSessionInfoStruct.f79109d;
                nVar.field_currSession = aiSessionInfoStruct.f79110e;
                nVar.field_nextSession = aiSessionInfoStruct.f79111f;
                nVar.field_enterMs = aiSessionInfoStruct.f79112g;
                nVar.field_quitMs = aiSessionInfoStruct.f79113h;
                nVar.field_stayMs = aiSessionInfoStruct.f79114i;
            }
            C34262g vx02 = C34262g.vx0();
            vx02.requireAccountInitialized();
            vx02.f92369g.mo59536Yt(nVar);
            Log.m105925i("MicroMsg.AiSessionData", "save wechat session history cost[%d]", Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }

    public final void vx0(String str, long j) {
        String str2 = str;
        Log.m105925i("MicroMsg.AiSessionData", "handleSessionEvent sessionId[%s]", str2);
        C21095o oVar = new C21095o();
        oVar.f59651a = str2;
        oVar.f59652b = j;
        this.f59648e = oVar;
        this.f59647d.add(oVar);
        int size = this.f59647d.size();
        if (size >= 1) {
            C21095o oVar2 = this.f59647d.get(size - 1);
            C21095o oVar3 = null;
            C21095o oVar4 = size >= 2 ? this.f59647d.get(size - 2) : null;
            if (size >= 3) {
                oVar3 = this.f59647d.get(size - 3);
            }
            if (this.f59647d.size() > 5) {
                this.f59647d.removeFirst();
            }
            String str3 = "unknow";
            if (oVar4 != null && "0".equals(oVar4.f59651a)) {
                QuitMainUIEvent quitMainUIEvent = new QuitMainUIEvent();
                QuitMainUIEvent.C17687a aVar = quitMainUIEvent.f48115d;
                aVar.f48116a = oVar3 != null ? oVar3.f59651a : str3;
                aVar.f48117b = oVar2 != null ? oVar2.f59651a : str3;
                aVar.f48118c = oVar4.f59652b;
                aVar.f48119d = oVar2 != null ? oVar2.f59652b : 0;
                quitMainUIEvent.publish();
            }
            if (oVar2 != null && "0".equals(oVar2.f59651a)) {
                EnterMainUIEvent enterMainUIEvent = new EnterMainUIEvent();
                EnterMainUIEvent.C114672a aVar2 = enterMainUIEvent.f343547d;
                long j2 = oVar2.f59652b;
                aVar2.f343550c = j2;
                aVar2.f343548a = oVar4 != null ? oVar4.f59651a : str3;
                aVar2.f343549b = oVar4 != null ? j2 - oVar4.f59652b : 0;
                enterMainUIEvent.publish();
            }
            if (oVar4 != null && "2".equals(oVar4.f59651a)) {
                QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent = new QuitFindMoreFriendsUIEvent();
                QuitFindMoreFriendsUIEvent.C17686a aVar3 = quitFindMoreFriendsUIEvent.f48110d;
                aVar3.f48111a = oVar3 != null ? oVar3.f59651a : str3;
                aVar3.f48112b = oVar2 != null ? oVar2.f59651a : str3;
                aVar3.f48113c = oVar4.f59652b;
                aVar3.f48114d = oVar2 != null ? oVar2.f59652b : 0;
                quitFindMoreFriendsUIEvent.publish();
                QuitFindMoreFriendsUIEvent.C17686a aVar4 = quitFindMoreFriendsUIEvent.f48110d;
                Log.m105925i("MicroMsg.AiSessionData", "quit find more friends ui fromSid[%s] toSid[%s]", aVar4.f48111a, aVar4.f48112b);
            }
            if (oVar2 != null && "2".equals(oVar2.f59651a)) {
                EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = new EnterFindMoreFriendsUIEvent();
                EnterFindMoreFriendsUIEvent.C17676a aVar5 = enterFindMoreFriendsUIEvent.f48084d;
                long j3 = oVar2.f59652b;
                aVar5.f48087c = j3;
                if (oVar4 != null) {
                    str3 = oVar4.f59651a;
                }
                aVar5.f48085a = str3;
                aVar5.f48086b = oVar4 != null ? j3 - oVar4.f59652b : 0;
                enterFindMoreFriendsUIEvent.publish();
                Log.m105925i("MicroMsg.AiSessionData", "enter find more friends ui fromSid[%s]", enterFindMoreFriendsUIEvent.f48084d.f48085a);
            }
            AiSessionInfoStruct aiSessionInfoStruct = new AiSessionInfoStruct();
            String str4 = "";
            aiSessionInfoStruct.f79109d = aiSessionInfoStruct.mo86045b("lastSessionId", oVar3 != null ? oVar3.f59651a : str4, true);
            aiSessionInfoStruct.f79111f = aiSessionInfoStruct.mo86045b("nextSessionId", oVar2 != null ? oVar2.f59651a : str4, true);
            if (oVar4 != null) {
                str4 = oVar4.f59651a;
            }
            aiSessionInfoStruct.f79110e = aiSessionInfoStruct.mo86045b("currSessionId", str4, true);
            long j4 = oVar4 != null ? oVar4.f59652b : 0;
            aiSessionInfoStruct.f79112g = j4;
            long j5 = oVar2 != null ? oVar2.f59652b : 0;
            aiSessionInfoStruct.f79113h = j5;
            aiSessionInfoStruct.f79114i = j5 - j4;
            aiSessionInfoStruct.mo86054n();
            Log.m105925i("MicroMsg.AiSessionData", "new report size[ %d ] [%s]", Integer.valueOf(this.f59647d.size()), aiSessionInfoStruct.mo1006q());
            ((C119157j) C119157j.f356862d).mo183875f(new C21094a(aiSessionInfoStruct));
        }
    }
}
