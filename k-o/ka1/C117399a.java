package ka1;

import com.tencent.p014mm.autogen.events.SessionPageConfigChangeEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import f91.C116850b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import te3.C49033cp;
import te3.C49565gi3;
import te3.C50562nl2;

/* renamed from: ka1.a */
public final class C117399a {

    /* renamed from: a */
    public static final C117400a f351442a = new C117400a((C8480h) null);

    /* renamed from: ka1.a$a */
    public static final class C117400a {
        public C117400a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C49033cp mo182081a() {
            byte[] a = C116850b.m164831a("hell_cgi_cc_dat");
            if (a != null) {
                if (!(a.length == 0)) {
                    C49033cp cpVar = new C49033cp();
                    try {
                        cpVar.parseFrom(a);
                        return cpVar;
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.HellCloudData", e, "HellCloudData, read: " + e.getMessage(), new Object[0]);
                    }
                }
            }
            return null;
        }

        /* renamed from: b */
        public final void mo182082b(C49033cp cpVar) {
            try {
                byte[] byteArray = cpVar.toByteArray();
                C87412m.m108593f(byteArray, "parguard.toByteArray()");
                C116850b.m164834d("hell_cgi_cc_dat", byteArray);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellCloudData", e, "HellCloudData, write: " + e.getMessage(), new Object[0]);
            }
        }

        /* renamed from: c */
        public final void mo182083c(String str, int i, boolean z, String str2, List<? extends C50562nl2> list) {
            if (str != null && str2 != null && list != null && !list.isEmpty()) {
                C49033cp a = mo182081a();
                if (a != null) {
                    Iterator<C49565gi3> it = a.f131884d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            C49565gi3 gi32 = new C49565gi3();
                            gi32.f134060d = str;
                            gi32.f134061e.addAll(list);
                            a.f131884d.add(gi32);
                            mo182082b(a);
                            break;
                        }
                        C49565gi3 next = it.next();
                        if (C87412m.m108589b(str, next.f134060d)) {
                            next.f134061e.clear();
                            next.f134061e.addAll(list);
                            mo182082b(a);
                            break;
                        }
                    }
                } else {
                    C49033cp cpVar = new C49033cp();
                    C49565gi3 gi33 = new C49565gi3();
                    gi33.f134060d = str;
                    gi33.f134061e.addAll(list);
                    cpVar.f131884d.add(gi33);
                    mo182082b(cpVar);
                }
                if (i == 3) {
                    mo182084d(str, str2, list, false, z);
                }
            }
        }

        /* renamed from: d */
        public final void mo182084d(String str, String str2, List<? extends C50562nl2> list, boolean z, boolean z2) {
            Log.m105924i("HABBYGE-MALI.HellCloudData", "notifySessionPageConfigChange: " + str + ", " + z2 + ", " + z);
            SessionPageConfigChangeEvent sessionPageConfigChangeEvent = new SessionPageConfigChangeEvent();
            sessionPageConfigChangeEvent.f343608d.f343609a = Long.parseLong(str);
            SessionPageConfigChangeEvent.C114692a aVar = sessionPageConfigChangeEvent.f343608d;
            aVar.f343610b = str2;
            aVar.f343612d = Boolean.valueOf(z);
            sessionPageConfigChangeEvent.f343608d.f343613e = Boolean.valueOf(z2);
            SessionPageConfigChangeEvent.C114692a aVar2 = sessionPageConfigChangeEvent.f343608d;
            aVar2.f343611c = list;
            aVar2.f343614f = 2;
            sessionPageConfigChangeEvent.publish();
        }
    }
}
