package i63;

import com.tencent.p014mm.autogen.events.ECardJsApiCheckEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h63.C8491b;
import h63.C8492c;
import java.util.HashMap;
import v53.C78339d;

/* renamed from: i63.c */
public class C8862c extends IStaticListener<ECardJsApiCheckEvent> {
    public boolean callback(IEvent iEvent) {
        String[] split;
        ECardJsApiCheckEvent eCardJsApiCheckEvent = (ECardJsApiCheckEvent) iEvent;
        C8492c cVar = (C8492c) C86312j.m106911c(C8492c.class);
        cVar.getClass();
        ECardJsApiCheckEvent.C1003a aVar = eCardJsApiCheckEvent.f9049d;
        HashMap hashMap = new HashMap();
        if (!Util.isNullOrNil(aVar.f9054d) && (split = aVar.f9054d.split("&")) != null && split.length > 0) {
            for (int i = 0; i < split.length; i++) {
                if (!Util.isNullOrNil(split[i])) {
                    String[] split2 = split[i].split("=");
                    if (split2.length == 2 && !Util.isNullOrNil(split2[0])) {
                        hashMap.put(split2[0], split2[1]);
                    }
                }
            }
        }
        String str = (String) hashMap.get("extradata");
        Log.m105925i("MicroMsg.SubCoreECard", "start openECard, extraData: %s, packageExt: %s", str, hashMap);
        C78339d dVar = new C78339d(aVar.f9051a, aVar.f9052b, aVar.f9053c, aVar.f9054d, aVar.f9056f, aVar.f9055e, aVar.f9057g, 15, "openECard", aVar.f9063m);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(580, new C8491b(cVar, aVar, eCardJsApiCheckEvent, str));
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123460f(dVar);
        return false;
    }
}
