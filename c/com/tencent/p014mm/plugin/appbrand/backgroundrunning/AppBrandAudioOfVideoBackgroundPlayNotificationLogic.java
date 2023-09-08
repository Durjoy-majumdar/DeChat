package com.tencent.p014mm.plugin.appbrand.backgroundrunning;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co0.C80123a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81682d;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.plugin.appbrand.widget.C85008l;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import kg3.C76577a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic */
public final class AppBrandAudioOfVideoBackgroundPlayNotificationLogic extends CustomBackgroundRunningNotificationLogic {

    /* renamed from: q */
    public static final int f239191q = C76577a.m92151b(MMApplicationContext.getContext(), 17104901);

    /* renamed from: r */
    public static final int f239192r = C76577a.m92151b(MMApplicationContext.getContext(), 17104902);

    /* renamed from: d */
    public final AppBrandRuntime f239193d;

    /* renamed from: e */
    public final C80123a f239194e;

    /* renamed from: f */
    public final Context f239195f;

    /* renamed from: g */
    public final NotificationManager f239196g;

    /* renamed from: h */
    public int f239197h = JsApiSetAudioState.CTRL_INDEX;

    /* renamed from: i */
    public volatile boolean f239198i = true;

    /* renamed from: j */
    public volatile boolean f239199j = false;

    /* renamed from: n */
    public volatile String f239200n = null;

    /* renamed from: o */
    public volatile Bitmap f239201o = null;

    /* renamed from: p */
    public BroadcastReceiver f239202p = new C81564a();

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic$a */
    public class C81564a extends BroadcastReceiver {
        public C81564a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && !Util.isNullOrNil(intent.getAction())) {
                String stringExtra = intent.getStringExtra("background_audio_notification_action_key");
                if (Util.isNullOrNil(stringExtra)) {
                    Log.m105920e("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "action is null, err, return");
                    return;
                }
                Log.m105925i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "action:%s", stringExtra);
                if (stringExtra.equals("background_audio_notification_action_play")) {
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239194e.mo110362O();
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = true;
                    Log.m105918d("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onReceive, notify start");
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                    NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239196g;
                    int d = appBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113825d();
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                    notificationManager.notify(d, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239195f, true, (Bitmap) null));
                } else if (stringExtra.equals("background_audio_notification_action_pause")) {
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239194e.mo110358A();
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239194e.f234610f.mo110378a();
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = false;
                    Log.m105918d("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onReceive, notify pause");
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic3 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                    NotificationManager notificationManager2 = appBrandAudioOfVideoBackgroundPlayNotificationLogic3.f239196g;
                    int d2 = appBrandAudioOfVideoBackgroundPlayNotificationLogic3.mo113825d();
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic4 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                    notificationManager2.notify(d2, appBrandAudioOfVideoBackgroundPlayNotificationLogic4.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic4.f239195f, false, (Bitmap) null));
                } else if (stringExtra.equals("background_audio_notification_action_close")) {
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239194e.mo110364Q();
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = false;
                    Log.m105918d("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "onReceive, cancel");
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic5 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
                    appBrandAudioOfVideoBackgroundPlayNotificationLogic5.getClass();
                    Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "cancelNotify");
                    if (appBrandAudioOfVideoBackgroundPlayNotificationLogic5.f239198i) {
                        Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "cancelNotify, already cancel");
                    } else {
                        appBrandAudioOfVideoBackgroundPlayNotificationLogic5.f239198i = true;
                        ((C119157j) C119157j.f356862d).mo183895z(new C81577a(appBrandAudioOfVideoBackgroundPlayNotificationLogic5));
                    }
                    AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239194e.mo110366d();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic$b */
    public class C81565b implements C80123a.C80126c {
        public C81565b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic$c */
    public class C81566c implements Runnable {
        public C81566c() {
        }

        public void run() {
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
            NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239196g;
            int d = appBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113825d();
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
            notificationManager.notify(d, appBrandAudioOfVideoBackgroundPlayNotificationLogic2.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239195f, true, (Bitmap) null));
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic$d */
    public class C81567d implements Runnable {
        public C81567d() {
        }

        public void run() {
            IntentFilter intentFilter = new IntentFilter("com.tencent.mm.Intent.ACTION_BACKGROUND_AUDIO_NOTIFICATION_CLICK");
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
            appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239195f.registerReceiver(appBrandAudioOfVideoBackgroundPlayNotificationLogic.f239202p, intentFilter);
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic2 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
            NotificationManager notificationManager = appBrandAudioOfVideoBackgroundPlayNotificationLogic2.f239196g;
            int d = appBrandAudioOfVideoBackgroundPlayNotificationLogic2.mo113825d();
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic appBrandAudioOfVideoBackgroundPlayNotificationLogic3 = AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this;
            notificationManager.notify(d, appBrandAudioOfVideoBackgroundPlayNotificationLogic3.mo113827k(appBrandAudioOfVideoBackgroundPlayNotificationLogic3.f239195f, true, (Bitmap) null));
            AppBrandAudioOfVideoBackgroundPlayNotificationLogic.this.f239199j = true;
        }
    }

    public AppBrandAudioOfVideoBackgroundPlayNotificationLogic(String str) {
        super(str);
        AppBrandRuntimeWC b = C81682d.m100222b(str);
        if (b != null) {
            this.f239193d = b;
            C80123a aVar = (C80123a) b.mo113032U(C80123a.class);
            if (aVar != null) {
                this.f239194e = aVar;
                aVar.f234612h = new C81565b();
                Context context = b.f238141d;
                this.f239195f = context;
                this.f239196g = (NotificationManager) context.getSystemService("notification");
                return;
            }
            throw new IllegalStateException("find AppBrandRuntimeAudioOfVideoBackgroundPlayManager fail");
        }
        throw new IllegalStateException("find AppBrandRuntime fail");
    }

    /* renamed from: l */
    public static void m100049l(View view, List<TextView> list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m100049l(viewGroup.getChildAt(i), list);
            }
        } else if (view instanceof TextView) {
            list.add((TextView) view);
        }
    }

    /* renamed from: c */
    public Notification mo113824c() {
        return mo113827k(this.f239195f, this.f239199j, (Bitmap) null);
    }

    /* renamed from: d */
    public int mo113825d() {
        if (292 == this.f239197h) {
            this.f239197h = MMApplicationContext.getProcessName().hashCode() + JsApiSetAudioState.CTRL_INDEX;
        }
        return this.f239197h;
    }

    /* renamed from: e */
    public void mo113826e() {
        Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "startNotify");
        if (!this.f239198i) {
            Log.m105924i("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "startNotify, already start");
            ((C119157j) C119157j.f356862d).mo183895z(new C81566c());
            return;
        }
        this.f239198i = false;
        ((C119157j) C119157j.f356862d).mo183895z(new C81567d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0250  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.Notification mo113827k(android.content.Context r17, boolean r18, android.graphics.Bitmap r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            s2.e$c r2 = new s2.e$c
            java.lang.String r3 = "reminder_channel_id"
            r2.<init>(r1, r3)
            r4 = 2131233736(0x7f080bc8, float:1.8083618E38)
            android.app.Notification r5 = r2.f258814z
            r5.icon = r4
            co0.a r4 = r0.f239194e
            java.lang.String r4 = r4.mo110371q()
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r5 == 0) goto L_0x0029
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r0.f239193d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r4 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r4
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r4 = r4.mo113210l1()
            java.lang.String r4 = r4.f239363e
        L_0x0029:
            r5 = 0
            java.lang.String r6 = "AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic"
            if (r19 != 0) goto L_0x00c8
            co0.a r7 = r0.f239194e
            yc.n r7 = r7.mo110370o()
            if (r7 != 0) goto L_0x0037
            goto L_0x0060
        L_0x0037:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "getPosterPath, videoPlayer:"
            r8.append(r9)
            java.lang.String r9 = r7.getName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            java.lang.Class<yc.q> r8 = p1066yc.C91421q.class
            yc.o r7 = r7.mo109509c(r8)
            yc.q r7 = (p1066yc.C91421q) r7
            if (r7 != 0) goto L_0x0062
            java.lang.String r7 = "getPosterPath, playerAddOnInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r7)
        L_0x0060:
            r7 = r5
            goto L_0x0066
        L_0x0062:
            java.lang.String r7 = r7.mo109544a()
        L_0x0066:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x0076
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r7 = r0.f239193d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r7 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r7
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r7 = r7.mo113210l1()
            java.lang.String r7 = r7.f239364f
        L_0x0076:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x0085
            android.graphics.Bitmap r7 = r16.mo113829q()
            android.graphics.Bitmap r7 = r0.mo113828o(r7)
            goto L_0x00ca
        L_0x0085:
            java.lang.String r8 = r0.f239200n
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L_0x0099
            android.graphics.Bitmap r8 = r0.f239201o
            if (r8 == 0) goto L_0x0099
            java.lang.String r7 = "loadAlbum, use mAlbumBitmap"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            android.graphics.Bitmap r7 = r0.f239201o
            goto L_0x00ca
        L_0x0099:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "loadAlbum, albumUrl: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            r0.f239200n = r7
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = r0.f239193d
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r8 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r8
            com.tencent.mm.plugin.appbrand.i2 r8 = r8.f238150p
            kr0.e r8 = (kr0.C88267e) r8
            com.tencent.mm.plugin.appbrand.backgroundrunning.c r9 = new com.tencent.mm.plugin.appbrand.backgroundrunning.c
            r9.<init>(r0)
            com.tencent.p014mm.plugin.appbrand.utils.C84795y.m104477c(r8, r7, r5, r9)
            android.graphics.Bitmap r7 = r16.mo113829q()
            android.graphics.Bitmap r7 = r0.mo113828o(r7)
            goto L_0x00ca
        L_0x00c8:
            r7 = r19
        L_0x00ca:
            android.widget.RemoteViews r8 = new android.widget.RemoteViews
            java.lang.String r9 = r17.getPackageName()
            r10 = 2131497164(0x7f0c10cc, float:1.8617913E38)
            r8.<init>(r9, r10)
            if (r7 == 0) goto L_0x00de
            r9 = 2131309815(0x7f0934f7, float:1.8237924E38)
            r8.setImageViewBitmap(r9, r7)
        L_0x00de:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r9 = 8
            r10 = 2131309821(0x7f0934fd, float:1.8237937E38)
            r11 = 0
            if (r7 != 0) goto L_0x00f1
            r8.setViewVisibility(r10, r11)
            r8.setTextViewText(r10, r4)
            goto L_0x00f4
        L_0x00f1:
            r8.setViewVisibility(r10, r9)
        L_0x00f4:
            r4 = 2131309817(0x7f0934f9, float:1.8237929E38)
            r8.setViewVisibility(r4, r9)
            s2.e$c r4 = new s2.e$c
            r4.<init>(r1, r3)
            android.app.Notification r3 = r4.mo124378b()
            android.widget.RemoteViews r3 = r3.contentView
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r3 != 0) goto L_0x010a
            goto L_0x0154
        L_0x010a:
            int r3 = r3.getLayoutId()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r17)
            android.view.View r3 = r7.inflate(r3, r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r7 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0128
            int r3 = r7.getCurrentTextColor()
            goto L_0x0156
        L_0x0128:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            m100049l(r3, r7)
            java.util.Iterator r3 = r7.iterator()
            r7 = r5
        L_0x0135:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x014d
            java.lang.Object r9 = r3.next()
            android.widget.TextView r9 = (android.widget.TextView) r9
            float r10 = r9.getTextSize()
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0135
            r7 = r9
            goto L_0x0135
        L_0x014d:
            if (r7 == 0) goto L_0x0154
            int r3 = r7.getCurrentTextColor()
            goto L_0x0156
        L_0x0154:
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0156:
            r3 = r3 | r4
            int r7 = android.graphics.Color.red(r4)
            int r9 = android.graphics.Color.red(r3)
            int r7 = r7 - r9
            int r9 = android.graphics.Color.green(r4)
            int r10 = android.graphics.Color.green(r3)
            int r9 = r9 - r10
            int r4 = android.graphics.Color.blue(r4)
            int r3 = android.graphics.Color.blue(r3)
            int r4 = r4 - r3
            int r7 = r7 * r7
            int r9 = r9 * r9
            int r7 = r7 + r9
            int r4 = r4 * r4
            int r7 = r7 + r4
            double r3 = (double) r7
            double r3 = java.lang.Math.sqrt(r3)
            r9 = 4640537203540230144(0x4066800000000000, double:180.0)
            r7 = 1
            int r12 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r12 >= 0) goto L_0x018b
            r3 = 1
            goto L_0x018c
        L_0x018b:
            r3 = 0
        L_0x018c:
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r9 = "com.tencent.mm.Intent.ACTION_BACKGROUND_AUDIO_NOTIFICATION_CLICK"
            r4.<init>(r9)
            java.lang.String r10 = "background_audio_notification_action_key"
            java.lang.String r12 = "background_audio_notification_action_pre"
            r4.putExtra(r10, r12)
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r1, r11, r4, r12)
            if (r3 == 0) goto L_0x01a6
            r13 = 2131234638(0x7f080f4e, float:1.8085447E38)
            goto L_0x01a9
        L_0x01a6:
            r13 = 2131234639(0x7f080f4f, float:1.808545E38)
        L_0x01a9:
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r13)
            r14 = 1050253722(0x3e99999a, float:0.3)
            if (r13 != 0) goto L_0x01b9
            java.lang.String r13 = "getPreIconBitmap, bitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r13)
            r13 = r5
            goto L_0x01bd
        L_0x01b9:
            android.graphics.Bitmap r13 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.setAlpha(r13, r14)
        L_0x01bd:
            if (r13 != 0) goto L_0x01c5
            java.lang.String r4 = "getRemoteViews, preIconBitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r4)
            goto L_0x01ce
        L_0x01c5:
            r15 = 2131309820(0x7f0934fc, float:1.8237935E38)
            r8.setImageViewBitmap(r15, r13)
            r8.setOnClickPendingIntent(r15, r4)
        L_0x01ce:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r9)
            if (r18 == 0) goto L_0x01db
            java.lang.String r13 = "background_audio_notification_action_pause"
            r4.putExtra(r10, r13)
            goto L_0x01e0
        L_0x01db:
            java.lang.String r13 = "background_audio_notification_action_play"
            r4.putExtra(r10, r13)
        L_0x01e0:
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r1, r7, r4, r12)
            if (r18 == 0) goto L_0x01f0
            if (r3 == 0) goto L_0x01ec
            r13 = 2131234634(0x7f080f4a, float:1.808544E38)
            goto L_0x01f9
        L_0x01ec:
            r13 = 2131234635(0x7f080f4b, float:1.8085441E38)
            goto L_0x01f9
        L_0x01f0:
            if (r3 == 0) goto L_0x01f6
            r13 = 2131234636(0x7f080f4c, float:1.8085443E38)
            goto L_0x01f9
        L_0x01f6:
            r13 = 2131234637(0x7f080f4d, float:1.8085445E38)
        L_0x01f9:
            r15 = 2131309819(0x7f0934fb, float:1.8237933E38)
            r8.setImageViewResource(r15, r13)
            r8.setOnClickPendingIntent(r15, r4)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r9)
            java.lang.String r13 = "background_audio_notification_action_next"
            r4.putExtra(r10, r13)
            r13 = 2
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r1, r13, r4, r12)
            if (r3 == 0) goto L_0x0217
            r15 = 2131234632(0x7f080f48, float:1.8085435E38)
            goto L_0x021a
        L_0x0217:
            r15 = 2131234633(0x7f080f49, float:1.8085437E38)
        L_0x021a:
            android.graphics.Bitmap r15 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((int) r15)
            if (r15 != 0) goto L_0x0226
            java.lang.String r14 = "getNextIconBitmap, bitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r14)
            goto L_0x022a
        L_0x0226:
            android.graphics.Bitmap r5 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.setAlpha(r15, r14)
        L_0x022a:
            if (r5 != 0) goto L_0x0232
            java.lang.String r4 = "getRemoteViews, nextIconBitmap is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r4)
            goto L_0x023b
        L_0x0232:
            r6 = 2131309818(0x7f0934fa, float:1.823793E38)
            r8.setImageViewBitmap(r6, r5)
            r8.setOnClickPendingIntent(r6, r4)
        L_0x023b:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r9)
            java.lang.String r5 = "background_audio_notification_action_close"
            r4.putExtra(r10, r5)
            r5 = 3
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r1, r5, r4, r12)
            if (r3 == 0) goto L_0x0250
            r3 = 2131234630(0x7f080f46, float:1.8085431E38)
            goto L_0x0253
        L_0x0250:
            r3 = 2131234631(0x7f080f47, float:1.8085433E38)
        L_0x0253:
            r4 = 2131309816(0x7f0934f8, float:1.8237926E38)
            r8.setImageViewResource(r4, r3)
            r8.setOnClickPendingIntent(r4, r1)
            android.app.Notification r1 = r2.f258814z
            r1.contentView = r8
            r1 = 16
            r2.mo124384i(r1, r11)
            r2.mo124384i(r13, r7)
            android.app.Notification r1 = r2.mo124378b()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.backgroundrunning.AppBrandAudioOfVideoBackgroundPlayNotificationLogic.mo113827k(android.content.Context, boolean, android.graphics.Bitmap):android.app.Notification");
    }

    /* renamed from: o */
    public final Bitmap mo113828o(Bitmap bitmap) {
        if (bitmap != null) {
            return BitmapUtil.getRoundedCornerBitmap(bitmap, false, 12.0f, false);
        }
        Log.m105928w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "getRoundedCornerBitmap, bitmap is null");
        return null;
    }

    /* renamed from: q */
    public final Bitmap mo113829q() {
        C85008l lVar = (C85008l) this.f239193d.mo113027R0(C85008l.class);
        if (lVar == null) {
            Log.m105928w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadDefaultAlbum, iconProvider is null");
            return null;
        }
        Drawable Dj0 = lVar.Dj0();
        if (Dj0 != null) {
            return BitmapUtil.transformDrawableToBitmap(Dj0);
        }
        Log.m105928w("AppBrand.MicroMsg.AppBrandAudioOfVideoBackgroundPlayNotificationLogic", "loadDefaultAlbum, albumDrawable is null");
        return null;
    }
}
