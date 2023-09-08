package com.tencent.p014mm.plugin.wepkg.model;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.tencent.p014mm.autogen.events.GetEntranceStateEvent;
import com.tencent.p014mm.autogen.events.WepkgNotifyEvent;
import com.tencent.p014mm.plugin.wepkg.utils.C44532a;
import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import te3.C51684vd3;
import te3.k35;
import te3.m35;
import te3.n35;
import te3.o35;
import te3.p35;
import te3.q35;
import te3.r35;
import te3.s35;

/* renamed from: com.tencent.mm.plugin.wepkg.model.r */
public class C44523r {

    /* renamed from: a */
    public static volatile C44523r f120743a;

    /* renamed from: b */
    public static C44523r m48890b() {
        if (f120743a == null) {
            synchronized (C44523r.class) {
                if (f120743a == null) {
                    f120743a = new C44523r();
                }
            }
        }
        return f120743a;
    }

    /* renamed from: a */
    public final void mo69299a(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            mo69303f(z, str, 3);
            return;
        }
        List<WepkgPreloadFile> b = C44509m.m48881b(str);
        if (Util.isNullOrNil((List) b)) {
            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
            wepkgCrossProcessTask.f120618h = AuthApiStatusCodes.AUTH_APP_CERT_ERROR;
            WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
            wepkgVersion.f120651d = str;
            wepkgVersion.f120668x = true;
            if (MMApplicationContext.isMMProcess()) {
                wepkgCrossProcessTask.mo1553j();
            } else {
                wepkgCrossProcessTask.mo114396f();
            }
            WepkgVersion d = C44509m.m48883d(str);
            if (!(d == null || d.f120665u == 0)) {
                C44532a.m48912c("downloadCompleteTime", "", d.f120651d, d.f120653f, -1, System.currentTimeMillis() - (d.f120665u * 1000), (String) null);
                WepkgCrossProcessTask wepkgCrossProcessTask2 = new WepkgCrossProcessTask();
                wepkgCrossProcessTask2.f120618h = 3007;
                wepkgCrossProcessTask2.f120619i.f120651d = str;
                if (MMApplicationContext.isMMProcess()) {
                    wepkgCrossProcessTask2.mo1553j();
                } else {
                    wepkgCrossProcessTask2.mo114396f();
                }
            }
            mo69303f(z, str, 0);
            Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:true");
            return;
        }
        Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "WepkgPreloadFile downloadComplete:false list.size:%s", Integer.valueOf(b.size()));
        mo69303f(z, str, 1);
    }

    /* renamed from: c */
    public final void mo69300c(String str, List<WepkgPreloadFile> list, boolean z) {
        String str2 = str;
        List<WepkgPreloadFile> list2 = list;
        boolean z2 = z;
        try {
            if (Util.isNullOrNil((List) list)) {
                Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "loopDownload WepkgPreloadFile is empty");
                mo69299a(str2, z2);
                return;
            }
            WepkgPreloadFile remove = list2.remove(0);
            if (remove != null) {
                Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "download preload files pkgid:%s, version:%s, rid:%s", remove.f120639e, remove.f120640f, remove.f120642h);
                r$$c r__c = new r$$c(this, str2, list2, z2);
                r__c.f120671a = remove;
                C44509m.m48880a(2, remove.f120639e, remove.f120642h, remove.f120645n, (long) remove.f120646o, remove.f120640f, remove.f120644j, remove.f120647p, r__c);
                return;
            }
            Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "download item is null, to loop");
            mo69300c(str, list, z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.Wepkg.WepkgUpdater", "loopDownload err:%s", e.getMessage());
        }
    }

    /* renamed from: d */
    public void mo69301d(String str, boolean z) {
        String str2 = str;
        boolean z2 = z;
        if (Util.isNullOrNil(str)) {
            mo69303f(z2, str2, 3);
            return;
        }
        r$$b r__b = new r$$b(this, z2, str2);
        r__b.f120671a = str2;
        Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "start update wepkg. pkgid:%s, isAutoUpdate:%s", str2, Boolean.valueOf(z));
        if (Util.isNullOrNil(str)) {
            mo69303f(z2, str2, 3);
            return;
        }
        Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "update big package. pkgid:%s, isAutoUpdate:%s", str2, Boolean.valueOf(z));
        WepkgVersion d = C44509m.m48883d(str);
        if (d == null) {
            mo69303f(z2, str2, 3);
        } else if (!d.f120667w) {
            C44509m.m48880a(1, d.f120651d, "", d.f120661q, (long) d.f120662r, d.f120653f, d.f120660p, d.f120663s, new C44524s(this, r__b, z2, str2));
        } else {
            WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
            wepkgCrossProcessTask.f120608f = true;
            wepkgCrossProcessTask.f120609g = true;
            r__b.mo66027a(wepkgCrossProcessTask);
        }
    }

    /* renamed from: e */
    public void mo69302e(C51684vd3 vd32, int i) {
        s35 s35;
        k35 k35;
        n35 n35;
        q35 q35;
        n35 n352;
        if (vd32 == null || (s35 = vd32.f143444f) == null) {
            Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "dont need to update wepkg");
            if (vd32 != null) {
                mo69301d(vd32.f143442d, false);
                return;
            }
            return;
        }
        k35 k352 = s35.f141305f;
        r35 r35 = s35.f141306g;
        if (k352 == null && r35 == null) {
            Log.m105924i("MicroMsg.Wepkg.WepkgUpdater", "bigPackage is null and preloadFiles is null");
            C44493e.m48856c().mo69277e(vd32.f143442d, 2, 5);
            return;
        }
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 2002;
        WepkgVersion wepkgVersion = wepkgCrossProcessTask.f120619i;
        wepkgVersion.getClass();
        wepkgVersion.f120651d = vd32.f143442d;
        p35 p35 = vd32.f143443e;
        s35 s352 = vd32.f143444f;
        if (p35 != null) {
            wepkgVersion.f120652e = p35.f139561d;
            m35 m35 = p35.f139562e;
            if (m35 != null) {
                wepkgVersion.f120653f = m35.f137822d;
                wepkgVersion.f120655h = m35.f137823e;
                wepkgVersion.f120656i = (long) m35.f137824f;
                wepkgVersion.f120657j = (long) m35.f137825g;
            }
        }
        if (s352 != null) {
            wepkgVersion.f120659o = s352.f141303d;
            wepkgVersion.f120666v = s352.f141304e;
            k35 k353 = s352.f141305f;
            if (k353 == null || (n352 = k353.f136536d) == null || Util.isNullOrNil(n352.f138397e)) {
                wepkgVersion.f120667w = true;
            } else {
                n35 n353 = k353.f136536d;
                wepkgVersion.f120660p = n353.f138396d;
                wepkgVersion.f120661q = n353.f138397e;
                wepkgVersion.f120662r = n353.f138399g;
                wepkgVersion.f120663s = n353.f138398f;
                wepkgVersion.f120667w = false;
            }
            r35 r352 = s352.f141306g;
            if (r352 != null) {
                wepkgVersion.f120669y = r352.f140687e;
            }
            if (r352 == null || Util.isNullOrNil((List) r352.f140686d) || !r352.f140687e) {
                wepkgVersion.f120668x = true;
            } else {
                wepkgVersion.f120668x = false;
            }
            wepkgVersion.f120670z = 0;
        }
        wepkgVersion.f120650A = i;
        WePkgDiffInfo wePkgDiffInfo = wepkgCrossProcessTask.f120621n;
        wePkgDiffInfo.getClass();
        s35 s353 = vd32.f143444f;
        if (!(s353 == null || (k35 = s353.f141305f) == null || (n35 = k35.f136536d) == null || (q35 = n35.f138400h) == null || Util.isNullOrNil(q35.f140117e))) {
            q35 q352 = vd32.f143444f.f141305f.f136536d.f138400h;
            wePkgDiffInfo.f120613g = vd32.f143443e.f139562e.f137822d;
            wePkgDiffInfo.f120610d = vd32.f143442d;
            wePkgDiffInfo.f120614h = q352.f140117e;
            wePkgDiffInfo.f120615i = q352.f140116d;
            wePkgDiffInfo.f120616j = q352.f140119g;
            wePkgDiffInfo.f120617n = q352.f140118f;
        }
        r35 r353 = vd32.f143444f.f141306g;
        if (r353 != null && !Util.isNullOrNil((List) r353.f140686d)) {
            ArrayList arrayList = new ArrayList();
            Iterator<o35> it = r353.f140686d.iterator();
            while (it.hasNext()) {
                o35 next = it.next();
                WepkgPreloadFile wepkgPreloadFile = new WepkgPreloadFile();
                String str = vd32.f143442d;
                String str2 = vd32.f143443e.f139562e.f137822d;
                if (next != null) {
                    wepkgPreloadFile.f120638d = C44536d.m48917c(str, next.f138942d);
                    wepkgPreloadFile.f120639e = str;
                    wepkgPreloadFile.f120640f = str2;
                    wepkgPreloadFile.f120642h = next.f138942d;
                    wepkgPreloadFile.f120643i = next.f138943e;
                    n35 n354 = next.f138944f;
                    if (n354 != null) {
                        wepkgPreloadFile.f120644j = n354.f138396d;
                        wepkgPreloadFile.f120645n = n354.f138397e;
                        wepkgPreloadFile.f120646o = n354.f138399g;
                        wepkgPreloadFile.f120647p = n354.f138398f;
                    }
                    wepkgPreloadFile.f120648q = false;
                }
                arrayList.add(wepkgPreloadFile);
            }
            wepkgCrossProcessTask.f120623p = arrayList;
        }
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        Log.m105925i("MicroMsg.Wepkg.WepkgUpdater", "downloadTriggerType:%d", Integer.valueOf(i));
        if (i == -1 || i == 0) {
            mo69301d(vd32.f143442d, false);
        } else if (i != 1) {
            if (i == 2) {
                GetEntranceStateEvent getEntranceStateEvent = new GetEntranceStateEvent();
                getEntranceStateEvent.publish();
                if (getEntranceStateEvent.f107593d.f107594a) {
                    mo69301d(vd32.f143442d, false);
                }
            }
        } else if (C44536d.m48919e(MMApplicationContext.getContext())) {
            mo69301d(vd32.f143442d, false);
        }
    }

    /* renamed from: f */
    public final void mo69303f(boolean z, String str, int i) {
        if (z) {
            WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
            wepkgNotifyEvent.f107837d.f107838a = 0;
            wepkgNotifyEvent.publish();
        }
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 2006;
        wepkgCrossProcessTask.f120619i.f120651d = str;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
        } else {
            wepkgCrossProcessTask.mo114396f();
        }
        C44493e.m48856c().mo69277e(str, 3, 6);
    }
}
