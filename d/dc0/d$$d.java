package dc0;

import com.tencent.p014mm.roomsdk.model.factory.C72940a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89144l0;
import p214om.C11502f;
import p530fx.C45819c;
import sf0.C48374j0;
import te3.C48959c52;
import te3.C49099d52;
import te3.C49915iy1;
import te3.C50051jy1;
import te3.C51163rv3;

public class d$$d implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C31113d f83427d;

    public d$$d(C31113d dVar) {
        this.f83427d = dVar;
    }

    public boolean onTimerExpired() {
        LinkedList<C51163rv3> linkedList;
        Log.m105918d("MicroMsg.GetContactService", "pusherTry onTimerExpired tryStartNetscene");
        C31113d dVar = this.f83427d;
        synchronized (dVar) {
            if (((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().Ab0()) {
                Log.m105928w("MicroMsg.GetContactService", "tryStartNetscene need init , never get contact");
            } else {
                long nowMilliSecond = Util.nowMilliSecond();
                boolean z = true;
                if (dVar.f83415a) {
                    long j = nowMilliSecond - dVar.f83421g;
                    if (j > 600000) {
                        Log.m105929w("MicroMsg.GetContactService", "tryStartNetscene Not Callback too long:%d . Force Run Now", Long.valueOf(j));
                        dVar.f83415a = false;
                    }
                }
                if (dVar.f83415a) {
                    Log.m105924i("MicroMsg.GetContactService", "tryStartNetscene netSceneRunning: " + dVar.f83415a + " ret");
                } else {
                    C49915iy1 iy12 = (C49915iy1) ((LinkedList) dVar.f83418d).poll();
                    if (iy12 == null) {
                        dVar.mo57992i();
                        iy12 = (C49915iy1) ((LinkedList) dVar.f83418d).poll();
                        while (true) {
                            if (iy12 != null) {
                                LinkedList<C51163rv3> linkedList2 = iy12.f135747e;
                                if (!(linkedList2 == null || linkedList2.size() == 0)) {
                                    break;
                                }
                            }
                            if (((LinkedList) dVar.f83418d).size() <= 0) {
                                break;
                            }
                            iy12 = (C49915iy1) ((LinkedList) dVar.f83418d).poll();
                        }
                        if (iy12 == null || (linkedList = iy12.f135747e) == null || linkedList.size() == 0) {
                            Object[] objArr = new Object[1];
                            if (iy12 != null) {
                                z = false;
                            }
                            objArr[0] = Boolean.valueOf(z);
                            Log.m105921e("MicroMsg.GetContactService", "tryStartNetscene Not any more contact. req is null? %s", objArr);
                        }
                    }
                    dVar.f83421g = nowMilliSecond;
                    dVar.f83415a = true;
                    LinkedList linkedList3 = new LinkedList();
                    LinkedList linkedList4 = new LinkedList();
                    Iterator<C51163rv3> it = iy12.f135747e.iterator();
                    while (it.hasNext()) {
                        String g = C48374j0.m53718g(it.next());
                        if (C72996z1.m85847r5(g)) {
                            linkedList3.add(g);
                        }
                        if (C72996z1.m85843n5(g)) {
                            linkedList4.add(g);
                        }
                    }
                    if (linkedList3.size() > 0) {
                        String str = (String) linkedList3.get(0);
                        if (C72996z1.m85847r5(str)) {
                            C72940a o = ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(str).mo71504o(str);
                            o.f212615d = new C31115e(dVar, str);
                            o.mo100865c();
                        }
                    } else if (linkedList4.size() > 0) {
                        String str2 = (String) linkedList4.get(0);
                        C48959c52 c522 = new C48959c52();
                        c522.f131526d = str2;
                        String str3 = "";
                        LinkedList<C51163rv3> linkedList5 = iy12.f135751i;
                        if (linkedList5 != null && linkedList5.size() > 0) {
                            str3 = C48374j0.m53718g(iy12.f135751i.get(0));
                        }
                        c522.f131527e = str3;
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        bVar.f127066a = c522;
                        bVar.f127067b = new C49099d52();
                        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimcontact";
                        bVar.f127069d = 881;
                        Log.m105925i("MicroMsg.GetContactService", "request roomName %s userOpenImname %s", str3, str2);
                        C89144l0.m111429e(bVar.mo72403a(), new C31116f(dVar, str2), true);
                    } else {
                        C47350c.C47352b bVar2 = new C47350c.C47352b();
                        bVar2.f127066a = iy12;
                        bVar2.f127067b = new C50051jy1();
                        bVar2.f127068c = "/cgi-bin/micromsg-bin/getcontact";
                        bVar2.f127069d = WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS;
                        C89144l0.m111429e(bVar2.mo72403a(), new C31117g(dVar, iy12.f135752j), true);
                    }
                }
            }
        }
        return false;
    }
}
