package com.tencent.p014mm.plugin.notification.p1186ui;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import cd2.C28541j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotificationSendFailMsgFinishEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.plugin.notification.base.AbstractSendMsgFailNotification;
import com.tencent.p014mm.plugin.notification.base.C115640a;
import com.tencent.p014mm.plugin.notification.base.C115641b;
import com.tencent.p014mm.plugin.notification.base.C115642c;
import com.tencent.p014mm.plugin.notification.base.C115643d;
import com.tencent.p014mm.plugin.notification.base.C115644e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import p918s2.C90116e;
import vc3.C78382a;

/* renamed from: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification */
public class FailSendMsgNotification {

    /* renamed from: a */
    public Notification f346899a = null;

    /* renamed from: b */
    public C90116e.C90121c f346900b = null;

    /* renamed from: c */
    public Context f346901c;

    /* renamed from: d */
    public int f346902d;

    /* renamed from: e */
    public C115651a f346903e = null;

    /* renamed from: f */
    public C115652b f346904f = null;

    /* renamed from: g */
    public C115653c f346905g = null;

    /* renamed from: h */
    public String f346906h = null;

    /* renamed from: i */
    public String f346907i = null;

    /* renamed from: j */
    public PendingIntent f346908j = null;

    /* renamed from: k */
    public PendingIntent f346909k = null;

    /* renamed from: l */
    public boolean f346910l = false;

    /* renamed from: m */
    public boolean f346911m = false;

    /* renamed from: n */
    public boolean f346912n = false;

    /* renamed from: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendMsgNotificationService */
    public static abstract class FailSendMsgNotificationService extends Service {

        /* renamed from: d */
        public IListener f346913d = new IListener<NotificationSendFailMsgFinishEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1445026585;
            }

            public boolean callback(IEvent iEvent) {
                int i = ((NotificationSendFailMsgFinishEvent) iEvent).f343588d.f343589a;
                if (i != FailSendMsgNotificationService.this.mo175875a()) {
                    Log.m105919d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotificationService, resend finish, type mismatch, type:%d, getNotificationType:%d", Integer.valueOf(i), Integer.valueOf(FailSendMsgNotificationService.this.mo175875a()));
                } else {
                    Log.m105919d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotificationService, resend finish, stop service and show notificaiton, type:%d", Integer.valueOf(i));
                    FailSendMsgNotificationService.this.stopForeground(true);
                    FailSendMsgNotification failSendMsgNotification = FailSendMsgNotificationService.this.f346914e;
                    if (failSendMsgNotification != null) {
                        failSendMsgNotification.f346911m = false;
                        failSendMsgNotification.mo175872e();
                    }
                    FailSendMsgNotificationService.this.stopSelf();
                }
                return false;
            }
        };

        /* renamed from: e */
        public FailSendMsgNotification f346914e = null;

        /* renamed from: a */
        public abstract int mo175875a();

        public IBinder onBind(Intent intent) {
            return null;
        }

        public void onCreate() {
            super.onCreate();
            Log.m105918d("MicroMsg.FailSendMsgNotification", "onCreate FailSendMsgNotificationService");
            this.f346913d.alive();
        }

        public void onDestroy() {
            super.onDestroy();
            Log.m105918d("MicroMsg.FailSendMsgNotification", "onDestroy FailSendMsgNotificationService");
            this.f346913d.dead();
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            Log.m105918d("MicroMsg.FailSendMsgNotification", "onStartCommand");
            if (intent == null || intent.getExtras() == null) {
                Log.m105918d("MicroMsg.FailSendMsgNotification", "handle action button, intent is null");
                return 2;
            }
            String action = intent.getAction();
            if (Util.isNullOrNil(action)) {
                Log.m105918d("MicroMsg.FailSendMsgNotification", "handle action button, action is null");
                return 2;
            }
            int i3 = intent.getExtras().getInt("notification_type", -1);
            Log.m105919d("MicroMsg.FailSendMsgNotification", "handle action button, type:%d", Integer.valueOf(i3));
            if (C28541j.wx0(i3) == null) {
                Log.m105918d("MicroMsg.FailSendMsgNotification", "handle action button, notification not exist");
                return 2;
            }
            Log.m105919d("MicroMsg.FailSendMsgNotification", "action:%s", action);
            this.f346914e = C28541j.wx0(i3);
            if (action.startsWith("com.tencent.failnotification.omit")) {
                if (this.f346914e.f346903e != null) {
                    Log.m105919d("MicroMsg.FailSendMsgNotification", "handle omit action button, type:%d", Integer.valueOf(i3));
                    C115642c cVar = (C115642c) this.f346914e.f346903e;
                    cVar.getClass();
                    Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "onClickOmitButton");
                    MMHandlerThread.postToMainThread(new C115641b(cVar));
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotificaiton.resend")) {
                if (this.f346914e.f346903e != null) {
                    Object[] objArr = new Object[3];
                    objArr[0] = Integer.valueOf(i3);
                    objArr[1] = Boolean.valueOf(this.f346914e.f346899a == null);
                    objArr[2] = Boolean.valueOf(this.f346914e.f346900b == null);
                    Log.m105919d("MicroMsg.FailSendMsgNotification", "handle resend action button, type:%d, notification==null:%b, notificationBuilder==null:%b", objArr);
                    FailSendMsgNotification failSendMsgNotification = this.f346914e;
                    if (failSendMsgNotification != null) {
                        failSendMsgNotification.f346911m = true;
                    }
                    Notification notification = failSendMsgNotification.f346899a;
                    if (notification != null) {
                        notification.priority = 0;
                    }
                    if (notification == null) {
                        failSendMsgNotification.mo175872e();
                    }
                    C115642c cVar2 = (C115642c) this.f346914e.f346903e;
                    cVar2.getClass();
                    Log.m105918d("MicroMsg.AbstractSendMsgFailNotification", "onClickResendButton");
                    MMHandlerThread.postToMainThread(new C115640a(cVar2));
                    Log.m105919d("MicroMsg.FailSendMsgNotification", "finish handle resend action button, type:%d", Integer.valueOf(i3));
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotification.click")) {
                if (this.f346914e.f346904f != null) {
                    Log.m105919d("MicroMsg.FailSendMsgNotification", "handle click notification, type:%d", Integer.valueOf(i3));
                    C115643d dVar = (C115643d) this.f346914e.f346904f;
                    dVar.getClass();
                    C115669n.INSTANCE.mo160131h(11425, Integer.valueOf(dVar.f346889a.mo56033k()), 1, 0, 0);
                    dVar.f346889a.mo175846a();
                    dVar.f346889a.mo56035o();
                    AbstractSendMsgFailNotification abstractSendMsgFailNotification = dVar.f346889a;
                    if (!abstractSendMsgFailNotification.f346878c) {
                        abstractSendMsgFailNotification.f346877b.mo175868a();
                    }
                    return 2;
                }
            } else if (action.startsWith("com.tencent.failnotification.dismiss")) {
                FailSendMsgNotification failSendMsgNotification2 = this.f346914e;
                failSendMsgNotification2.f346910l = false;
                failSendMsgNotification2.f346911m = false;
                if (failSendMsgNotification2.f346905g != null) {
                    Log.m105918d("MicroMsg.FailSendMsgNotification", "handle notification dismiss");
                    ((C115644e) this.f346914e.f346905g).f346890a.mo175855v();
                }
                stopSelf();
            }
            return 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendNormalMsgNotificationService */
    public static class FailSendNormalMsgNotificationService extends FailSendMsgNotificationService {
        /* renamed from: a */
        public int mo175875a() {
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.notification.ui.FailSendMsgNotification$FailSendSnsMsgNotificationService */
    public static class FailSendSnsMsgNotificationService extends FailSendMsgNotificationService {
        /* renamed from: a */
        public int mo175875a() {
            return 2;
        }
    }

    public FailSendMsgNotification(int i) {
        this.f346902d = i;
        Context context = MMApplicationContext.getContext();
        this.f346901c = context;
        this.f346900b = new C90116e.C90121c(context, C78382a.m94651c());
        this.f346907i = "";
        try {
            mo175869b();
            mo175870c();
            this.f346912n = true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FailSendMsgNotification", "init FailSendMsgNotification error, e:%s", e.getMessage());
            this.f346912n = false;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(this.f346901c == null);
        Log.m105919d("MicroMsg.FailSendMsgNotification", "create FailSendMsgNotification, type:%d, context==null:%b", objArr);
        this.f346910l = false;
    }

    /* renamed from: a */
    public void mo175868a() {
        ((MMNotification) C97625j3.m125816f()).mo93207e(this.f346902d);
        Intent intent = new Intent();
        int i = this.f346902d;
        if (i == 1) {
            intent.setClass(this.f346901c, FailSendNormalMsgNotificationService.class);
            this.f346901c.stopService(intent);
        } else if (i == 2) {
            intent.setClass(this.f346901c, FailSendSnsMsgNotificationService.class);
            this.f346901c.stopService(intent);
        }
        this.f346911m = false;
        this.f346910l = false;
    }

    /* renamed from: b */
    public final void mo175869b() {
        this.f346900b.f258805q = true;
        Intent intent = new Intent();
        int i = this.f346902d;
        if (i == 1) {
            intent.setAction("com.tencent.failnotification.omit_msg");
            intent.setClass(this.f346901c, FailSendNormalMsgNotificationService.class);
        } else if (i == 2) {
            intent.setAction("com.tencent.failnotification.omit_sns");
            intent.setClass(this.f346901c, FailSendSnsMsgNotificationService.class);
        }
        intent.putExtra("notification_type", this.f346902d);
        this.f346908j = PendingIntent.getService(this.f346901c, this.f346902d, intent, 134217728);
        this.f346900b.mo124377a(C0966R.C0969drawable.c9m, this.f346901c.getString(C0966R.string.hay), this.f346908j);
        Intent intent2 = new Intent();
        int i2 = this.f346902d;
        if (i2 == 1) {
            intent2.setAction("com.tencent.failnotificaiton.resend_msg");
            intent2.setClass(this.f346901c, FailSendNormalMsgNotificationService.class);
        } else if (i2 == 2) {
            intent2.setAction("com.tencent.failnotificaiton.resend_sns");
            intent2.setClass(this.f346901c, FailSendSnsMsgNotificationService.class);
        }
        intent2.putExtra("notification_type", this.f346902d);
        intent2.addFlags(268435456);
        this.f346909k = PendingIntent.getService(this.f346901c, this.f346902d, intent2, 134217728);
        this.f346900b.mo124377a(C0966R.C0969drawable.c9n, this.f346901c.getString(C0966R.string.haz), this.f346909k);
    }

    /* renamed from: c */
    public final void mo175870c() {
        Intent intent = new Intent();
        int i = this.f346902d;
        if (i == 1) {
            intent.setAction("com.tencent.failnotification.click_msg");
            intent.setClass(this.f346901c, FailSendNormalMsgNotificationService.class);
        } else if (i == 2) {
            intent.setAction("com.tencent.failnotification.click_sns");
            intent.setClass(this.f346901c, FailSendSnsMsgNotificationService.class);
        }
        intent.putExtra("notification_type", this.f346902d);
        this.f346900b.f258795g = PendingIntent.getService(this.f346901c, this.f346902d, intent, 134217728);
        Intent intent2 = new Intent();
        int i2 = this.f346902d;
        if (i2 == 1) {
            intent2.setAction("com.tencent.failnotification.dismiss_msg");
            intent2.setClass(this.f346901c, FailSendNormalMsgNotificationService.class);
        } else if (i2 == 2) {
            intent2.setAction("com.tencent.failnotification.dismiss_sns");
            intent2.setClass(this.f346901c, FailSendSnsMsgNotificationService.class);
        }
        intent2.putExtra("notification_type", this.f346902d);
        this.f346900b.f258814z.deleteIntent = PendingIntent.getService(this.f346901c, this.f346902d, intent2, 134217728);
    }

    /* renamed from: d */
    public void mo175871d(boolean z) {
        Log.m105919d("MicroMsg.FailSendMsgNotification", "setIsForeground:%b", Boolean.valueOf(z));
        this.f346911m = z;
    }

    /* renamed from: e */
    public void mo175872e() {
        if (!this.f346912n) {
            Log.m105920e("MicroMsg.FailSendMsgNotification", "when show notification, is not init yet");
            return;
        }
        this.f346900b.mo124390o(this.f346907i);
        this.f346900b.mo124383h(this.f346901c.getText(C0966R.string.a0u));
        C90116e.C90121c cVar = this.f346900b;
        cVar.f258814z.icon = C0966R.C0969drawable.c9k;
        cVar.mo124382g(this.f346906h);
        this.f346900b.mo124380e(false);
        Notification b = this.f346900b.mo124378b();
        this.f346899a = b;
        if (!this.f346911m) {
            b.priority = 2;
            Log.m105918d("MicroMsg.FailSendMsgNotification", "show notification, set priority to max");
        }
        Log.m105919d("MicroMsg.FailSendMsgNotification", "show notification, mIsForeground:%b", Boolean.valueOf(this.f346911m));
        ((MMNotification) C97625j3.m125816f()).mo93215l(this.f346902d, this.f346899a, false);
        this.f346910l = true;
    }

    /* renamed from: f */
    public void mo175873f() {
        this.f346900b.mo124384i(2, false);
        mo175872e();
        Log.m105918d("MicroMsg.FailSendMsgNotification", "FailSendMsgNotification, unLockInNotificationBar");
    }

    /* renamed from: g */
    public void mo175874g(String str) {
        this.f346906h = str;
        mo175872e();
    }
}
