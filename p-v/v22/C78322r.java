package v22;

import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashSet;
import java.util.Set;
import p702ts.C118505d;
import p702ts.C78085c;
import t22.C77827e;
import t22.C77832s;

/* renamed from: v22.r */
public class C78322r extends IStaticListener<LocationServerEvent> {

    /* renamed from: d */
    public volatile boolean f229524d = false;

    public boolean callback(IEvent iEvent) {
        int t;
        int t2;
        LocationServerEvent locationServerEvent = (LocationServerEvent) iEvent;
        Class cls = C78085c.class;
        if (!(locationServerEvent instanceof LocationServerEvent)) {
            return false;
        }
        Log.m105918d("LocationServerListener", "e.data.eventType : " + locationServerEvent.f193728d.f193730a);
        int i = locationServerEvent.f193728d.f193730a;
        if (i == 0) {
            C77827e wx02 = C77832s.wx0();
            String str = locationServerEvent.f193728d.f193731b;
            wx02.getClass();
            wx02.f226758a = new HashSet();
            this.f229524d = true;
            return true;
        } else if (i != 1) {
            if (i != 2 || !this.f229524d) {
                return true;
            }
            C77827e wx03 = C77832s.wx0();
            Set<Long> set = wx03.f226758a;
            if (set != null) {
                ((HashSet) set).clear();
            }
            ((C78085c) C86312j.m106911c(cls)).oe0().mo108055b(wx03.f226759b);
            return true;
        } else if (!this.f229524d) {
            locationServerEvent.f193729e.f193734a = "err_not_started";
            return true;
        } else {
            C77827e wx04 = C77832s.wx0();
            C72963f4 f4Var = locationServerEvent.f193728d.f193733d;
            wx04.getClass();
            String[] strArr = new String[2];
            String content = f4Var.getContent();
            if (Util.isNullOrNil(content)) {
                strArr[0] = "";
                strArr[1] = "";
            } else {
                boolean z = f4Var.mo108769t2() == 0;
                if (C72996z1.m85820U5(f4Var.mo108768t()) && z && (t2 = C75604z3.m90848t(content)) != -1) {
                    content = content.substring(t2 + 1).trim();
                }
                C72963f4.C72968e Tx0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Tx0(content);
                if (Tx0.mo101029a()) {
                    String str2 = Tx0.f212707e;
                    String str3 = Tx0.f212708f;
                    strArr[0] = str2;
                    strArr[1] = str3;
                } else {
                    strArr[0] = Tx0.f212707e;
                    strArr[1] = "";
                }
                if (Util.isNullOrNil(strArr[0]) && Util.isNullOrNil(strArr[1])) {
                    Log.m105924i("MicroMsg.LocationServer", "pull from sever");
                    long msgId = f4Var.getMsgId();
                    Set<Long> set2 = wx04.f226758a;
                    if (set2 != null) {
                        if (!((HashSet) set2).contains(Long.valueOf(msgId))) {
                            String content2 = f4Var.getContent();
                            boolean z2 = f4Var.mo108769t2() == 0;
                            if (C72996z1.m85820U5(f4Var.mo108768t()) && z2 && (t = C75604z3.m90848t(content2)) != -1) {
                                content2 = content2.substring(t + 1).trim();
                            }
                            C72963f4.C72968e c = C72963f4.C72968e.m85663c(content2);
                            ((HashSet) wx04.f226758a).add(Long.valueOf(msgId));
                            C118505d dVar = new C118505d(c.f212704b, c.f212705c);
                            dVar.f354674f = Long.valueOf(f4Var.getMsgId());
                            ((C78085c) C86312j.m106911c(cls)).oe0().mo108054a(dVar, wx04.f226759b);
                        }
                    }
                }
            }
            LocationServerEvent.C67730b bVar = locationServerEvent.f193729e;
            bVar.f193734a = strArr[0];
            bVar.f193735b = strArr[1];
            return true;
        }
    }
}
