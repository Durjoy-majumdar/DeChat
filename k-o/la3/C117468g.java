package la3;

import android.text.TextUtils;
import com.tencent.p014mm.autogen.events.MyLifeAroundPreloadEvent;
import com.tencent.p014mm.autogen.events.ReceiveNewLabAppInfoEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import hc0.C20937c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import na3.C117620h;
import na3.C34760f;
import p261wl.C38166b;
import p261wl.C38174i;
import qa3.C101087a;
import ra3.C118229a;

/* renamed from: la3.g */
public class C117468g {

    /* renamed from: c */
    public static final C117468g f351552c = new C117468g();

    /* renamed from: a */
    public C117620h f351553a = ((C117620h) C86312j.m106911c(C34760f.class));

    /* renamed from: b */
    public C20937c f351554b;

    public C117468g() {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59346b = true;
        bVar.f59347c = true;
        this.f351554b = bVar.mo32666a();
    }

    /* renamed from: a */
    public String mo182172a(C118229a aVar) {
        String str;
        C117620h e = mo182176e(aVar.field_LabsAppId);
        if (e != null) {
            str = e.mo11753Is(aVar.field_LabsAppId);
            Log.m105925i("WelabMgr", "get appName from opener , appid %s, appName %s", aVar.field_LabsAppId, str);
        } else {
            str = "";
        }
        return TextUtils.isEmpty(str) ? aVar.mo183024m2("field_Title") : str;
    }

    /* renamed from: b */
    public C118229a mo182173b(String str) {
        C101087a c = mo182174c();
        c.getClass();
        C118229a aVar = new C118229a();
        aVar.field_LabsAppId = str;
        c.get(aVar, new String[0]);
        return aVar;
    }

    /* renamed from: c */
    public C101087a mo182174c() {
        C34209e eVar = (C34209e) C86312j.m106911c(C34209e.class);
        if (eVar.f92251d[0] == null && C86709a0.m107522a()) {
            synchronized (eVar.f92251d) {
                C101087a[] aVarArr = eVar.f92251d;
                if (aVarArr[0] == null) {
                    aVarArr[0] = new C101087a(C86709a0.m107535s().f251811i);
                }
            }
        }
        return eVar.f92251d[0];
    }

    /* renamed from: d */
    public List<C118229a> mo182175d() {
        int i;
        List<C118229a> jo = mo182174c().mo140537jo();
        Iterator it = ((ArrayList) jo).iterator();
        while (it.hasNext()) {
            C118229a aVar = (C118229a) it.next();
            if (!aVar.mo183028q2() || (!((i = aVar.field_Switch) == 2 || i == 1) || "labs1de6f3".equals(aVar.field_LabsAppId))) {
                it.remove();
            }
        }
        Log.m105925i("WelabMgr", "online lab %s", jo.toString());
        return jo;
    }

    /* renamed from: e */
    public C117620h mo182176e(String str) {
        C38174i<C117620h> g = C38166b.m41760g(C117620h.class, str);
        if (g != null) {
            return g.get();
        }
        return null;
    }

    /* renamed from: f */
    public void mo182177f(List<C118229a> list) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C118229a next : list) {
                boolean z = true;
                if (next.field_status != 1) {
                    z = false;
                }
                if (!z && !next.mo183026o2()) {
                    arrayList.add(next.field_LabsAppId);
                }
            }
            ReceiveNewLabAppInfoEvent receiveNewLabAppInfoEvent = new ReceiveNewLabAppInfoEvent();
            receiveNewLabAppInfoEvent.f343592d.f343593a = arrayList;
            receiveNewLabAppInfoEvent.publish();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if ("labs_nearbylife".equals((String) it.next())) {
                    new MyLifeAroundPreloadEvent().publish();
                    return;
                }
            }
        }
    }
}
