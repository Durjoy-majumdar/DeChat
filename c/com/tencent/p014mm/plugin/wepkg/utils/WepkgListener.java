package com.tencent.p014mm.plugin.wepkg.utils;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SendEntranceStateEvent;
import com.tencent.p014mm.autogen.events.WepkgNotifyEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40327m;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.wepkg.model.C44490c;
import com.tencent.p014mm.plugin.wepkg.model.C44492d;
import com.tencent.p014mm.plugin.wepkg.model.C44493e;
import com.tencent.p014mm.plugin.wepkg.model.C44509m;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.plugin.wepkg.version.WepkgVersionUpdater;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kb3.C46676l;
import lb3.C46843e;
import lb3.C46844f;
import sx1.C48493b;

/* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgListener */
public class WepkgListener {

    /* renamed from: a */
    public C114668z.C104589a f120756a = new C44527a(this);

    /* renamed from: b */
    public IListener f120757b;

    /* renamed from: c */
    public final IListener f120758c;

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgListener$a */
    public class C44527a extends C114668z.C104589a {
        public C44527a(WepkgListener wepkgListener) {
        }

        public void onAppBackground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
                    wepkgNotifyEvent.f107837d.f107838a = 3;
                    wepkgNotifyEvent.publish();
                }
            }
        }

        public void onAppForeground(String str) {
            if (C86709a0.m107522a() && C86709a0.m107523b().f251765p) {
                C86709a0.m107523b();
                if (!C86718e.m107551r()) {
                    WepkgNotifyEvent wepkgNotifyEvent = new WepkgNotifyEvent();
                    wepkgNotifyEvent.f107837d.f107838a = 5;
                    wepkgNotifyEvent.publish();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wepkg.utils.WepkgListener$b */
    public static class C44528b implements C80883e {
        private C44528b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C46676l.f125645b = false;
        }
    }

    public WepkgListener() {
        C40008f fVar = C40008f.f107254d;
        this.f120757b = new IListener<SendEntranceStateEvent>(fVar) {
            {
                this.__eventId = -625487945;
            }

            public boolean callback(IEvent iEvent) {
                boolean z = ((SendEntranceStateEvent) iEvent).f107751d.f107752a;
                Log.m105925i("MicroMsg.Wepkg.WepkgListener", "sendEntranceStateListener isInFindEntrance:%b", Boolean.valueOf(z));
                if (z) {
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WEPKG_ENTRANCE_TRIGGER_DOWNLOAD_TIME_LONG;
                    if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) i.mo119685f(aVar, 0L))).longValue()) > 60) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(Util.nowSecond()));
                        WepkgListener.m48900a(WepkgListener.this, 2);
                    }
                }
                return false;
            }
        };
        this.f120758c = new IListener<WepkgNotifyEvent>(fVar) {
            {
                this.__eventId = -1170682909;
            }

            public boolean callback(IEvent iEvent) {
                C46843e qq;
                WepkgVersion e;
                boolean z;
                WepkgNotifyEvent wepkgNotifyEvent = (WepkgNotifyEvent) iEvent;
                boolean a = C41853c.m45367a();
                boolean z2 = true;
                Log.m105919d("MicroMsg.Wepkg.WepkgListener", "wepkg notify event operation:%d", Integer.valueOf(wepkgNotifyEvent.f107837d.f107838a));
                WepkgNotifyEvent.C40188a aVar = wepkgNotifyEvent.f107837d;
                switch (aVar.f107838a) {
                    case 0:
                        if (!a) {
                            C48493b.m53856b().mo73124a("wepkg_download_retry", new C44533b(this));
                            break;
                        }
                        break;
                    case 1:
                        if (!a) {
                            String str = aVar.f107839b;
                            int i = aVar.f107842e;
                            int i2 = aVar.f107843f;
                            HashSet hashSet = new HashSet();
                            if (!Util.isNullOrNil(str)) {
                                if (i2 == 0) {
                                    hashSet.add(str);
                                } else if (i2 == 1 && C44509m.m48883d(str) != null) {
                                    hashSet.add(str);
                                }
                            }
                            WepkgVersionUpdater.m48922b(hashSet, 1, i, false);
                            break;
                        }
                        break;
                    case 2:
                        if (!a) {
                            C46844f Ow = C46844f.m52139Ow();
                            String str2 = wepkgNotifyEvent.f107837d.f107839b;
                            if (!Ow.f126002d || Util.isNullOrNil(str2) || (qq = Ow.mo72053qq(str2)) == null || !qq.field_bigPackageReady || !qq.field_preloadFilesReady) {
                                z2 = false;
                            }
                            aVar.f107840c = z2;
                            break;
                        }
                        break;
                    case 3:
                        if (MMApplicationContext.isMMProcess()) {
                            C44493e c = C44493e.m48856c();
                            synchronized (c) {
                                C85801v1 i3 = C86709a0.m107535s().mo121142i();
                                C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WEPKG_EXPIRED_TIME_LONG;
                                if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) i3.mo119685f(aVar2, 0L))).longValue()) <= 86400) {
                                    break;
                                } else {
                                    C86709a0.m107535s().mo121142i().mo119677K(aVar2, Long.valueOf(Util.nowSecond()));
                                    Log.m105924i("MicroMsg.Wepkg.CleanWepkgMgr", "clean wepkg in one day");
                                    C48493b.m53856b().mo73124a("wepkg_expired_clean", new C44490c(c));
                                    break;
                                }
                            }
                        }
                        break;
                    case 4:
                        if (!a && (e = C44509m.m48884e(aVar.f107839b)) != null) {
                            WepkgNotifyEvent.C40188a aVar3 = wepkgNotifyEvent.f107837d;
                            int i4 = e.f120670z;
                            aVar3.f107841d = i4;
                            Log.m105925i("MicroMsg.Wepkg.WepkgListener", "total download count:%s", Integer.valueOf(i4));
                            break;
                        }
                    case 5:
                        if (!a) {
                            C85801v1 i5 = C86709a0.m107535s().mo121142i();
                            C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_WEPKG_FRONT_TRIGGER_DOWNLOAD_TIME_LONG;
                            if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) i5.mo119685f(aVar4, 0L))).longValue()) > 60) {
                                C86709a0.m107535s().mo121142i().mo119677K(aVar4, Long.valueOf(Util.nowSecond()));
                                z = WepkgListener.m48900a(WepkgListener.this, 1);
                            } else {
                                z = false;
                            }
                            if (!z) {
                                C85801v1 i6 = C86709a0.m107535s().mo121142i();
                                C72994y1.C72995a aVar5 = C72994y1.C72995a.USERINFO_WEPKG_CHECK_DOWNLOAD_TIME_LONG;
                                if (Util.secondsToNow(Long.valueOf(Util.nullAsNil((Long) i6.mo119685f(aVar5, 0L))).longValue()) > 1800) {
                                    C86709a0.m107535s().mo121142i().mo119677K(aVar5, Long.valueOf(Util.nowSecond()));
                                    WepkgNotifyEvent wepkgNotifyEvent2 = new WepkgNotifyEvent();
                                    wepkgNotifyEvent2.f107837d.f107838a = 0;
                                    wepkgNotifyEvent2.publish();
                                    break;
                                }
                            }
                        }
                        break;
                    case 6:
                        if (!Util.isNullOrNil(aVar.f107839b)) {
                            C44493e.m48856c().mo69277e(wepkgNotifyEvent.f107837d.f107839b, 2, 7);
                            break;
                        } else {
                            C44493e c2 = C44493e.m48856c();
                            c2.getClass();
                            if (Looper.getMainLooper() != Looper.myLooper()) {
                                c2.mo69278g((String) null, 0, 7);
                                break;
                            } else {
                                C44536d.m48918d().postToWorker(new C44492d(c2, 7));
                                break;
                            }
                        }
                    case 7:
                        ((C40327m) C86312j.m106911c(C40327m.class)).Ku0(null, C44528b.class, (C1256g) null);
                        break;
                    case 8:
                        int i7 = aVar.f107844g;
                        List list = aVar.f107845h;
                        if (!Util.isNullOrNil(list)) {
                            if (i7 != 0) {
                                if (i7 == 1) {
                                    WepkgVersionUpdater.m48921a(list, 3);
                                    break;
                                }
                            } else {
                                WepkgVersionUpdater.m48921a(list, 4);
                                break;
                            }
                        }
                        break;
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public static boolean m48900a(WepkgListener wepkgListener, int i) {
        wepkgListener.getClass();
        if (C41853c.m45367a()) {
            return false;
        }
        Log.m105925i("MicroMsg.Wepkg.WepkgListener", "triggerDownload downloadTriggerType:%d", Integer.valueOf(i));
        C46844f Ow = C46844f.m52139Ow();
        HashSet hashSet = null;
        if (Ow.f126002d && i != -1) {
            hashSet = new HashSet();
            Cursor rawQuery = Ow.rawQuery(String.format("select distinct %s from %s where %s=?", new Object[]{"pkgId", "WepkgVersion", "downloadTriggerType"}), String.valueOf(i));
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    do {
                        String string = rawQuery.getString(0);
                        if (!Util.isNullOrNil(string)) {
                            hashSet.add(string);
                        }
                    } while (rawQuery.moveToNext());
                    rawQuery.close();
                } else {
                    rawQuery.close();
                }
            }
            HashSet hashSet2 = new HashSet();
            Cursor rawQuery2 = Ow.rawQuery(String.format("select distinct %s from %s where (%s=0 or %s=0) and %s=? and %s<?", new Object[]{"pkgId", "WepkgVersion", "bigPackageReady", "preloadFilesReady", "downloadTriggerType", "packageDownloadCount"}), String.valueOf(i), "1");
            if (rawQuery2 != null) {
                if (rawQuery2.moveToFirst()) {
                    do {
                        String string2 = rawQuery2.getString(0);
                        if (!Util.isNullOrNil(string2)) {
                            hashSet2.add(string2);
                        }
                    } while (rawQuery2.moveToNext());
                    rawQuery2.close();
                } else {
                    rawQuery2.close();
                }
            }
            HashSet hashSet3 = new HashSet();
            Cursor rawQuery3 = Ow.rawQuery(String.format("select distinct %s from %s where %s=0 and %s<?", new Object[]{"pkgId", "WepkgPreloadFiles", "completeDownload", "fileDownloadCount"}), "1");
            if (rawQuery3 != null) {
                if (rawQuery3.moveToFirst()) {
                    do {
                        String string3 = rawQuery3.getString(0);
                        if (!Util.isNullOrNil(string3)) {
                            hashSet3.add(string3);
                        }
                    } while (rawQuery3.moveToNext());
                    rawQuery3.close();
                } else {
                    rawQuery3.close();
                }
            }
            hashSet2.addAll(hashSet3);
            hashSet.retainAll(hashSet2);
            Log.m105925i("MicroMsg.Wepkg.WepkgVersionStorage", "trigger Predownload size:%d, List:%s", Integer.valueOf(hashSet.size()), hashSet.toString());
        }
        if (hashSet == null || hashSet.size() == 0) {
            return false;
        }
        C44536d.m48918d().postToWorker(new C44535c(wepkgListener, new ArrayList(hashSet)));
        return true;
    }
}
