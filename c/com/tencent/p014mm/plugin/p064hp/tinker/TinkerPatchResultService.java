package com.tencent.p014mm.plugin.p064hp.tinker;

import a12.C79450b;
import a70.C79471a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import b12.C79644b;
import bd2.C79690d;
import com.tencent.p014mm.app.C80589e;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelmulti.C81003a;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.service.DefaultTinkerResultService;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import di3.C86312j;
import ex3.C86702a;
import f40.C86709a0;
import hv3.C87598a;
import iv3.C87824b;
import java.io.File;
import java.util.Properties;
import jv3.C88033a;
import p182kk.C61104a;
import p235sm.C90236m0;
import p620nm.C89013r;
import p970gg.C87186a;
import tm2.C14049d;
import x02.C38431f;

/* renamed from: com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService */
public class TinkerPatchResultService extends DefaultTinkerResultService {

    /* renamed from: e */
    public static C86702a f248331e;

    /* renamed from: d */
    public boolean f248332d = false;

    /* renamed from: com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService$a */
    public class C85239a implements Runnable {
        public C85239a() {
        }

        public void run() {
            Log.m105928w("Tinker.TinkerPatchResultService", "actually kill tinker patch service!");
            C88033a.m109602c(TinkerPatchResultService.this.getApplicationContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.hp.tinker.TinkerPatchResultService$b */
    public class C85240b implements C81003a.C81005b {
        public C85240b() {
        }

        /* renamed from: a */
        public void mo112882a(boolean z) {
            boolean z2;
            C86702a aVar = TinkerPatchResultService.f248331e;
            VoipEvent voipEvent = new VoipEvent();
            voipEvent.f194019d.f194022b = 2;
            voipEvent.publish();
            boolean z3 = voipEvent.f194020e.f194028b;
            boolean D = C61104a.m71644D();
            TinkerPatchResultService tinkerPatchResultService = TinkerPatchResultService.this;
            Context context = MMApplicationContext.getContext();
            tinkerPatchResultService.getClass();
            try {
                Display[] displays = ((DisplayManager) context.getApplicationContext().getSystemService("display")).getDisplays();
                int length = displays.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (displays[i].getState() == 2) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("Tinker.TinkerPatchResultService", th, "Fail to fetch status of displays.", new Object[0]);
            }
            z2 = false;
            if (z || z2 || z3 || D) {
                Log.m105929w("Tinker.TinkerPatchResultService", "not hit condition, skip suicide this time. cond: screenOn: %s, screenOnNow: %s, voip: %s, multiTalk: %s", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(D));
                return;
            }
            TinkerPatchResultService tinkerPatchResultService2 = TinkerPatchResultService.this;
            if (tinkerPatchResultService2.f248332d) {
                Log.m105929w("Tinker.TinkerPatchResultService", "[+] do not call suicide more than one time @ %s", Util.getStack());
                return;
            }
            tinkerPatchResultService2.f248332d = true;
            Log.m105924i("Tinker.TinkerPatchResultService", "app is background now, i can kill quietly");
            Log.appenderFlushSync();
            Boolean bool = C86709a0.m107524d().f256816n;
            if (bool == null ? true : bool.booleanValue()) {
                Log.m105924i("Tinker.TinkerPatchResultService", "we are in foreground, trigger reboot now.");
                Intent launchIntentForPackage = tinkerPatchResultService2.getPackageManager().getLaunchIntentForPackage(tinkerPatchResultService2.getPackageName());
                if (launchIntentForPackage != null) {
                    try {
                        C87186a.m108241d(tinkerPatchResultService2.getApplicationContext(), 112, 1, System.currentTimeMillis() + 1000, launchIntentForPackage, 1073741824, false);
                    } catch (Throwable th4) {
                        Log.printErrStackTrace("Tinker.TinkerPatchResultService", th4, "[-] Fail to set alarm.", new Object[0]);
                        Log.appenderFlushSync();
                    }
                } else {
                    Log.m105920e("Tinker.TinkerPatchResultService", "failure to get launcher intent, skip reboot logic.");
                }
            } else {
                Log.m105928w("Tinker.TinkerPatchResultService", "we are in background, do not explicitly trigger reboot.");
            }
            ((C90236m0) C86312j.m106911c(C90236m0.class)).Rc0("Tinker");
            C85623c.C85624a aVar2 = C85623c.f249568a;
            Context context2 = MMApplicationContext.getContext();
            ((C89013r.C89016c) aVar2).getClass();
            Class cls = C79690d.class;
            C114781l0.m161561h().edit().putBoolean("is_in_notify_mode", true).commit();
            MMEntryLock.unlock("welcome_page_show");
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).getClass();
            C67845k.C67847b.f194757a.mo93234b(-1, (String) null);
            BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
            backupProcessMgrExitEvent.f78724d.f78725a = false;
            backupProcessMgrExitEvent.publish();
            C14049d.m13402a().mo93150TO();
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93209g();
            MMAppMgr.m85985e(context2, false);
        }
    }

    /* renamed from: a */
    public void mo118340a(C87598a aVar) {
        String str;
        if (aVar == null) {
            Log.m105920e("Tinker.TinkerPatchResultService", "TinkerPatchResultService received null result!!!!");
            return;
        }
        boolean z = true;
        Log.m105925i("Tinker.TinkerPatchResultService", "TinkerPatchResultService receive result: %s", aVar.toString());
        Log.m105924i("Tinker.TinkerPatchResultService", "onPatchResult on service");
        Properties a = C79644b.m96723a(new File(aVar.f253684e));
        if (a != null) {
            String property = a.getProperty("patch.client.ver");
            if (!TextUtils.isEmpty(property)) {
                C79450b bVar = new C79450b(C79471a.f233015c, property);
                SharedPreferences b = bVar.mo109424b();
                String a2 = bVar.mo109423a(2);
                if (b.contains(a2)) {
                    bVar.mo109425c(2, System.currentTimeMillis() - b.getLong(a2, 0));
                    b.edit().remove(a2).remove(bVar.mo109423a(3)).commit();
                }
                C38431f.m41870a(BuildInfo.CLIENT_VERSION, property, a.getProperty(ShareConstants.NEW_TINKER_ID), 0, aVar.f253683d ? 1 : 0);
            } else {
                Log.m105920e("Tinker.TinkerPatchResultService", "[-] Fail to get patch clientversion.");
            }
        } else {
            Log.m105924i("Tinker.TinkerPatchResultService", "onPatchResult properties is null.");
        }
        new MMHandler(Looper.getMainLooper()).postDelayed(new C85239a(), 10000);
        if (aVar.f253683d) {
            ApplicationLike applicationLike = C80589e.f235760a;
            if (C87824b.m109281c(applicationLike)) {
                String b2 = C87824b.m109280b(applicationLike);
                if (!ShareTinkerInternals.isNullOrNil(b2) && (str = aVar.f253689j) != null && str.equals(b2)) {
                    z = false;
                }
            }
            if (z) {
                new C81003a(MMApplicationContext.getContext(), new C85240b(), false);
            } else {
                Log.m105924i("Tinker.TinkerPatchResultService", "I have already install the newly patch version!");
            }
        }
        C86702a aVar2 = f248331e;
        if (aVar2 != null) {
            aVar2.mo121089a(aVar);
        }
    }
}
