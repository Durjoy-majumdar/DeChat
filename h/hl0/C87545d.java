package hl0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import di3.C86312j;
import java.util.HashMap;
import kr0.C88267e;
import kz1.C88349l;
import org.json.JSONObject;
import p635os.C89291d;

/* renamed from: hl0.d */
public class C87545d extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1032;
    public static final String NAME = "gameLiveInfoControl";

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Class cls = C89291d.class;
        Class cls2 = C88349l.class;
        d$$c d__c = d$$c.WAGameLiveInfoControlActionUnknow;
        switch (jSONObject.optInt("action", 0)) {
            case 1:
                d__c = d$$c.WAGameLiveInfoControlActionEnableInfo;
                break;
            case 2:
                d__c = d$$c.WAGameLiveInfoControlActionDisableInfo;
                break;
            case 3:
                d__c = d$$c.WAGameLiveInfoControlActionGetCurrentRoomMemberInfo;
                break;
            case 4:
                d__c = d$$c.WAGameLiveInfoControlActionGetCurrentRoomInfo;
                break;
            case 5:
                d__c = d$$c.WAGameLiveInfoControlActionEnableMic;
                break;
            case 6:
                d__c = d$$c.WAGameLiveInfoControlActionDisableMic;
                break;
            case 7:
                d__c = d$$c.WAGameLiveInfoControlActionGetCurrentMicState;
                break;
            case 8:
                d__c = d$$c.WAGameLiveInfoControlActionEnableMicInfo;
                break;
            case 9:
                d__c = d$$c.WAGameLiveInfoControlActionDisableMicInfo;
                break;
            case 10:
                d__c = d$$c.WAGameLiveInfoControlActionSetTopic;
                break;
        }
        switch (d__c.ordinal()) {
            case 0:
                eVar.mo109647a(i, mo115109j("fail:invalid data,unknown action"));
                return;
            case 1:
                ((C89291d) C86312j.m106911c(cls)).mo112601YV(Boolean.TRUE);
                eVar.mo109647a(i, mo115109j("ok"));
                return;
            case 2:
                ((C89291d) C86312j.m106911c(cls)).mo112601YV(Boolean.FALSE);
                eVar.mo109647a(i, mo115109j("ok"));
                return;
            case 3:
                ((C88349l) C86312j.m106911c(cls2)).mo118238F9(new C87546e(this, eVar, i));
                return;
            case 4:
                ((C88349l) C86312j.m106911c(cls2)).yg0(new d$$a(this, eVar, i));
                return;
            case 5:
                ((C88349l) C86312j.m106911c(cls2)).mo118248Zs(Boolean.TRUE);
                eVar.mo109647a(i, mo115109j("ok"));
                return;
            case 6:
                ((C88349l) C86312j.m106911c(cls2)).mo118248Zs(Boolean.FALSE);
                eVar.mo109647a(i, mo115109j("ok"));
                return;
            case 7:
                HashMap hashMap = new HashMap(1);
                hashMap.put("mute", Boolean.valueOf(true ^ ((C88349l) C86312j.m106911c(cls2)).mo118236Ao().booleanValue()));
                eVar.mo109647a(i, mo115112m("ok", hashMap));
                return;
            case 8:
                ((C88349l) C86312j.m106911c(cls2)).Wl0(Boolean.TRUE, jSONObject.optInt("duration", 0));
                eVar.mo109647a(i, mo115109j("ok"));
                return;
            case 9:
                ((C88349l) C86312j.m106911c(cls2)).Wl0(Boolean.FALSE, 0);
                eVar.mo109647a(i, mo115109j("ok"));
                return;
            case 10:
                ((C88349l) C86312j.m106911c(cls2)).mo118252cV(jSONObject.optString("topic"), new d$$b(this, eVar, i));
                return;
            default:
                return;
        }
    }
}
