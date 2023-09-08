package jg0;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import bd2.C79690d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.account.p024ui.MobileVerifyUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import p918s2.C90116e;

/* renamed from: jg0.l */
public class C108742l {

    /* renamed from: a */
    public static int f325626a = 0;

    /* renamed from: b */
    public static MTimerHandler f325627b = null;

    /* renamed from: jg0.l$a */
    public class C108743a implements MTimerHandler.CallBack {
        public boolean onTimerExpired() {
            Class<MobileVerifyUI> cls = MobileVerifyUI.class;
            int i = C108742l.f325626a + 1;
            C108742l.f325626a = i;
            if (i == 1 || i == 16 || i % 96 == 0) {
                Context context = MMApplicationContext.getContext();
                ComponentName componentName = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningTasks(1).get(0).topActivity;
                Log.m105919d("MicroMsg.SubCoreAccountSync", "[oneliang][showMobileRegNoVerifyCodeNotification]:%s", componentName.getClassName());
                if (!cls.getName().equals(componentName.getClassName())) {
                    Intent intent = new Intent(context, cls);
                    intent.addFlags(2);
                    intent.addFlags(536870912);
                    intent.addFlags(67108864);
                    PendingIntent activity = PendingIntent.getActivity(context, 36, intent, 1073741824);
                    C90116e.C90121c cVar = new C90116e.C90121c(context, "reminder_channel_id");
                    cVar.mo124383h(context.getString(C0966R.string.a25));
                    cVar.f258814z.icon = C0966R.C0969drawable.c9k;
                    cVar.f258814z.when = System.currentTimeMillis();
                    cVar.f258795g = activity;
                    C90116e.C90117b bVar = new C90116e.C90117b(cVar);
                    bVar.f258770b = C90116e.C90121c.m112748d(context.getString(C0966R.string.gs_));
                    C90116e.C90121c cVar2 = bVar.f258771a;
                    Notification b = cVar2 != null ? cVar2.mo124378b() : null;
                    b.defaults |= 1;
                    b.flags |= 16;
                    ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93215l(36, b, false);
                }
            }
            return true;
        }
    }

    /* renamed from: jg0.l$b */
    public enum C108744b {
        NONE,
        SENT,
        VERIFIED
    }

    /* renamed from: a */
    public static void m147542a(C108744b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                f325626a = 0;
                if (f325627b == null) {
                    f325627b = new MTimerHandler(new C108743a(), true);
                }
                Log.m105918d("MicroMsg.SubCoreAccountSync", "[oneliang][SmsVerifyCodeState]Sent");
                f325627b.startTimer(900000);
                return;
            } else if (ordinal != 2) {
                return;
            }
        }
        MTimerHandler mTimerHandler = f325627b;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        Log.m105918d("MicroMsg.SubCoreAccountSync", "[oneliang][SmsVerifyCodeState]verified");
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93207e(36);
        f325626a = 0;
        f325627b = null;
    }
}
