package com.tencent.p014mm.app;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.util.ArrayMap;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kj2.C117407d;
import org.json.JSONException;
import org.json.JSONObject;
import zt3.C119157j;

@Deprecated
/* renamed from: com.tencent.mm.app.AppForegroundDelegate */
public enum AppForegroundDelegate {
    INSTANCE;
    

    /* renamed from: s */
    public static final String f343439s = null;

    /* renamed from: t */
    public static String f343440t;

    /* renamed from: u */
    public static boolean f343441u;

    /* renamed from: v */
    public static ArrayList<String> f343442v;

    /* renamed from: w */
    public static boolean f343443w;

    /* renamed from: x */
    public static final C114646d f343444x = null;

    /* renamed from: y */
    public static ConcurrentHashMap<String, C114653f> f343445y;

    /* renamed from: d */
    public Handler f343447d;

    /* renamed from: e */
    public Handler f343448e;

    /* renamed from: f */
    public Runnable f343449f;

    /* renamed from: g */
    public WeakReference<Activity> f343450g;

    /* renamed from: h */
    public WeakReference<Activity> f343451h;

    /* renamed from: i */
    public final Set<C114668z> f343452i;

    /* renamed from: j */
    public final Set<C114660c0> f343453j;

    /* renamed from: n */
    public volatile boolean f343454n;

    /* renamed from: o */
    public C114647e f343455o;

    /* renamed from: p */
    public volatile boolean f343456p;

    /* renamed from: q */
    public boolean f343457q;

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$Provider */
    public static class Provider extends ContentProvider {

        /* renamed from: d */
        public static final String f343458d = null;

        static {
            f343458d = WeChatAuthorities.AUTHORITIES_APPFOREGROUNDDELEGATE_PROVIDER();
        }

        public Bundle call(String str, String str2, Bundle bundle) {
            if (!str.equals("isAppForeground")) {
                return super.call(str, str2, bundle);
            }
            Bundle bundle2 = new Bundle();
            AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
            bundle2.putString("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", appForegroundDelegate.f343455o.f343478b.f343490a);
            bundle2.putBoolean("isAppForeground", appForegroundDelegate.f343454n);
            return bundle2;
        }

        public int delete(Uri uri, String str, String[] strArr) {
            return 0;
        }

        public String getType(Uri uri) {
            return null;
        }

        public Uri insert(Uri uri, ContentValues contentValues) {
            return null;
        }

        public boolean onCreate() {
            return true;
        }

        public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            return null;
        }

        public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$a */
    public class C114643a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f343459d;

        public C114643a(String str) {
            this.f343459d = str;
        }

        public void run() {
            Intent intent = new Intent();
            intent.setAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE");
            intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", this.f343459d);
            AppForegroundDelegate.this.f343455o.f343478b.onReceive(MMApplicationContext.getContext(), intent);
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$b */
    public enum C114644b {
        CREATED("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_CREATED"),
        STARTED("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STARTED"),
        RESUMED("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_RESUMED"),
        PAUSED("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_PAUSED"),
        STOPPED("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STOPPED"),
        DESTROY("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_DESTROY");
        

        /* renamed from: d */
        public String f343468d;

        /* access modifiers changed from: public */
        C114644b(String str) {
            this.f343468d = str;
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$c */
    public enum C114645c {
        ENTER("com.tencent.mm.sensitive.SENSITIVE_PAGE_ENTER"),
        EXIT("com.tencent.mm.sensitive.SENSITIVE_PAGE_EXIT");
        

        /* renamed from: d */
        public String f343472d;

        /* access modifiers changed from: public */
        C114645c(String str) {
            this.f343472d = str;
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$d */
    public static class C114646d implements Runnable {

        /* renamed from: d */
        public C114654g f343473d;

        /* renamed from: e */
        public int f343474e;

        /* renamed from: f */
        public Handler f343475f;

        /* renamed from: g */
        public boolean f343476g;

        public C114646d(C114643a aVar) {
            this.f343474e = 0;
            this.f343476g = true;
        }

        public void run() {
            int i;
            AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.INSTANCE;
            Log.m105925i("MicroMsg.AppForegroundDelegate", "CheckExceptionRunnable... isValid=%s checkErrorCount=%s isAppForeground=%s", Boolean.valueOf(this.f343476g), Integer.valueOf(this.f343474e), Boolean.valueOf(appForegroundDelegate.f343454n));
            if (this.f343476g) {
                if (appForegroundDelegate.f343454n && this.f343474e >= 2) {
                    Log.m105920e("MicroMsg.AppForegroundDelegate", "check error! isScreenOff is true but isAppForeground is true");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("isOpenFallbackCheck", AppForegroundDelegate.f343441u);
                    } catch (JSONException unused) {
                    }
                    C117407d dVar = C117407d.INSTANCE;
                    dVar.mo160131h(20459, jSONObject.toString().replaceAll(",", ";"), 3L);
                    if (AppForegroundDelegate.f343441u) {
                        dVar.idkeyStat(1439, 11, 1, false);
                    } else {
                        dVar.idkeyStat(1439, 12, 1, false);
                    }
                    dVar.idkeyStat(1439, 13, 1, false);
                    AppForegroundDelegate.f343445y.clear();
                    C114654g gVar = this.f343473d;
                    if (gVar != null) {
                        gVar.mo174246a(false, "fallback");
                    }
                } else if (appForegroundDelegate.f343454n && (i = this.f343474e) < 2) {
                    this.f343474e = i + 1;
                    this.f343475f.postDelayed(this, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$e */
    public final class C114647e {

        /* renamed from: a */
        public C114648a f343477a;

        /* renamed from: b */
        public C114654g f343478b;

        /* renamed from: com.tencent.mm.app.AppForegroundDelegate$e$a */
        public class C114648a extends BroadcastReceiver implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

            /* renamed from: d */
            public HashSet<String> f343480d;

            /* renamed from: com.tencent.mm.app.AppForegroundDelegate$e$a$a */
            public class C114649a implements Runnable {
                public C114649a() {
                }

                public void run() {
                    LinkedList<C114660c0> linkedList;
                    synchronized (AppForegroundDelegate.this.f343453j) {
                        linkedList = new LinkedList<>(AppForegroundDelegate.this.f343453j);
                    }
                    for (C114660c0 b : linkedList) {
                        b.mo112345b(AppForegroundDelegate.this.f343457q);
                    }
                }
            }

            /* renamed from: com.tencent.mm.app.AppForegroundDelegate$e$a$b */
            public class C114650b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f343483d;

                public C114650b(String str) {
                    this.f343483d = str;
                }

                public void run() {
                    if (!AppForegroundDelegate.this.f343454n) {
                        C114647e.this.f343478b.mo174246a(true, this.f343483d);
                    }
                }
            }

            /* renamed from: com.tencent.mm.app.AppForegroundDelegate$e$a$c */
            public class C114651c implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f343485d;

                public C114651c(String str) {
                    this.f343485d = str;
                }

                public void run() {
                    if (!AppForegroundDelegate.this.f343454n || !C114648a.this.f343480d.remove(this.f343485d)) {
                        AppForegroundDelegate.this.f343449f = null;
                        Log.m105928w("MicroMsg.AppForegroundDelegate", "[PAUSED] delay to check background in stop!");
                        return;
                    }
                    C114647e.this.f343478b.mo174246a(false, this.f343485d);
                }
            }

            /* renamed from: com.tencent.mm.app.AppForegroundDelegate$e$a$d */
            public class C114652d implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ String f343487d;

                public C114652d(String str) {
                    this.f343487d = str;
                }

                public void run() {
                    if (AppForegroundDelegate.this.f343454n) {
                        C114647e.this.f343478b.mo174246a(false, this.f343487d);
                    }
                }
            }

            public C114648a(C114643a aVar) {
                this.f343480d = new HashSet<>();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
                r8 = r6.f343481e.f343479c;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo174225a(java.lang.String r7, java.lang.String r8, com.tencent.p014mm.app.AppForegroundDelegate.C114644b r9) {
                /*
                    r6 = this;
                    com.tencent.mm.app.AppForegroundDelegate$b r0 = com.tencent.p014mm.app.AppForegroundDelegate.C114644b.PAUSED
                    r1 = 3
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r2 = 0
                    r1[r2] = r7
                    r3 = 1
                    r1[r3] = r8
                    java.lang.String r4 = r9.name()
                    r5 = 2
                    r1[r5] = r4
                    java.lang.String r4 = "MicroMsg.AppForegroundDelegate"
                    java.lang.String r5 = "[checkAlive] activityName:%s process:%s action:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
                    com.tencent.mm.app.AppForegroundDelegate$e r1 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r1 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    com.tencent.mm.app.AppForegroundDelegate r5 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
                    r1.getClass()
                    com.tencent.mm.app.AppForegroundDelegate$b r1 = com.tencent.p014mm.app.AppForegroundDelegate.C114644b.RESUMED
                    if (r9 != r1) goto L_0x004b
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.app.AppForegroundDelegate$f> r5 = com.tencent.p014mm.app.AppForegroundDelegate.f343445y
                    java.lang.Object r5 = r5.get(r8)
                    com.tencent.mm.app.AppForegroundDelegate$f r5 = (com.tencent.p014mm.app.AppForegroundDelegate.C114653f) r5
                    if (r5 != 0) goto L_0x003b
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.app.AppForegroundDelegate$f> r2 = com.tencent.p014mm.app.AppForegroundDelegate.f343445y
                    com.tencent.mm.app.AppForegroundDelegate$f r4 = new com.tencent.mm.app.AppForegroundDelegate$f
                    r4.<init>(r7, r9)
                    r2.put(r8, r4)
                    goto L_0x0071
                L_0x003b:
                    boolean r8 = r5.mo174245a(r7, r9)
                    if (r8 != 0) goto L_0x0071
                    java.lang.Object[] r8 = new java.lang.Object[r3]
                    r8[r2] = r7
                    java.lang.String r2 = "[countState] activityName=%s duplicate resume"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r8)
                    goto L_0x0071
                L_0x004b:
                    if (r9 != r0) goto L_0x0071
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.app.AppForegroundDelegate$f> r5 = com.tencent.p014mm.app.AppForegroundDelegate.f343445y
                    java.lang.Object r5 = r5.get(r8)
                    com.tencent.mm.app.AppForegroundDelegate$f r5 = (com.tencent.p014mm.app.AppForegroundDelegate.C114653f) r5
                    if (r5 != 0) goto L_0x0062
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.app.AppForegroundDelegate$f> r2 = com.tencent.p014mm.app.AppForegroundDelegate.f343445y
                    com.tencent.mm.app.AppForegroundDelegate$f r4 = new com.tencent.mm.app.AppForegroundDelegate$f
                    r4.<init>(r7, r9)
                    r2.put(r8, r4)
                    goto L_0x0071
                L_0x0062:
                    boolean r8 = r5.mo174245a(r7, r9)
                    if (r8 != 0) goto L_0x0071
                    java.lang.Object[] r8 = new java.lang.Object[r3]
                    r8[r2] = r7
                    java.lang.String r2 = "[countState] activityName=%s duplicate pause"
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r8)
                L_0x0071:
                    com.tencent.mm.app.AppForegroundDelegate$b r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114644b.STARTED
                    if (r9 != r8) goto L_0x0089
                    com.tencent.mm.app.AppForegroundDelegate$e r2 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r2 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    boolean r2 = r2.f343454n
                    if (r2 != 0) goto L_0x0084
                    com.tencent.mm.app.AppForegroundDelegate$e r2 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate$g r2 = r2.f343478b
                    r2.mo174246a(r3, r7)
                L_0x0084:
                    java.util.HashSet<java.lang.String> r2 = r6.f343480d
                    r2.remove(r7)
                L_0x0089:
                    com.tencent.mm.app.AppForegroundDelegate$b r2 = com.tencent.p014mm.app.AppForegroundDelegate.C114644b.CREATED
                    if (r9 == r2) goto L_0x0093
                    if (r9 == r8) goto L_0x0093
                    if (r9 == r1) goto L_0x0093
                    if (r9 != r0) goto L_0x00a7
                L_0x0093:
                    com.tencent.mm.app.AppForegroundDelegate$e r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    java.lang.Runnable r2 = r8.f343449f
                    if (r2 == 0) goto L_0x00a7
                    android.os.Handler r8 = r8.f343447d
                    r8.removeCallbacks(r2)
                    com.tencent.mm.app.AppForegroundDelegate$e r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    r2 = 0
                    r8.f343449f = r2
                L_0x00a7:
                    r2 = 600(0x258, double:2.964E-321)
                    if (r9 != r1) goto L_0x00bc
                    com.tencent.mm.app.AppForegroundDelegate$e r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    android.os.Handler r9 = r8.f343447d
                    com.tencent.mm.app.AppForegroundDelegate$e$a$b r0 = new com.tencent.mm.app.AppForegroundDelegate$e$a$b
                    r0.<init>(r7)
                    r8.f343449f = r0
                    r9.postDelayed(r0, r2)
                    goto L_0x00f2
                L_0x00bc:
                    if (r9 != r0) goto L_0x00cf
                    com.tencent.mm.app.AppForegroundDelegate$e r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    android.os.Handler r9 = r8.f343447d
                    com.tencent.mm.app.AppForegroundDelegate$e$a$c r0 = new com.tencent.mm.app.AppForegroundDelegate$e$a$c
                    r0.<init>(r7)
                    r8.f343449f = r0
                    r9.postDelayed(r0, r2)
                    goto L_0x00f2
                L_0x00cf:
                    com.tencent.mm.app.AppForegroundDelegate$b r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114644b.STOPPED
                    if (r9 == r8) goto L_0x00d7
                    com.tencent.mm.app.AppForegroundDelegate$b r0 = com.tencent.p014mm.app.AppForegroundDelegate.C114644b.DESTROY
                    if (r9 != r0) goto L_0x00f2
                L_0x00d7:
                    if (r9 != r8) goto L_0x00de
                    java.util.HashSet<java.lang.String> r8 = r6.f343480d
                    r8.add(r7)
                L_0x00de:
                    com.tencent.mm.app.AppForegroundDelegate$e r8 = com.tencent.p014mm.app.AppForegroundDelegate.C114647e.this
                    com.tencent.mm.app.AppForegroundDelegate r8 = com.tencent.p014mm.app.AppForegroundDelegate.this
                    java.lang.Runnable r9 = r8.f343449f
                    if (r9 != 0) goto L_0x00f2
                    android.os.Handler r9 = r8.f343447d
                    com.tencent.mm.app.AppForegroundDelegate$e$a$d r0 = new com.tencent.mm.app.AppForegroundDelegate$e$a$d
                    r0.<init>(r7)
                    r8.f343449f = r0
                    r9.postDelayed(r0, r2)
                L_0x00f2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.AppForegroundDelegate.C114647e.C114648a.mo174225a(java.lang.String, java.lang.String, com.tencent.mm.app.AppForegroundDelegate$b):void");
            }

            /* renamed from: b */
            public final String mo174226b() {
                return MMApplicationContext.getProcessName() + "@" + Process.myPid();
            }

            /* renamed from: c */
            public final void mo174227c(C114644b bVar, String str) {
                Intent intent = new Intent();
                intent.setAction(bVar.f343468d);
                intent.putExtra(MMApplicationContext.INTENT_PROCESS_NAME, mo174226b());
                intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", str);
                MMApplicationContext.getContext().sendBroadcast(intent, AppForegroundDelegate.f343439s);
            }

            /* renamed from: d */
            public final void mo174228d(C114645c cVar, Activity activity) {
                Intent intent = new Intent();
                intent.setAction(cVar.f343472d);
                intent.putExtra(MMApplicationContext.INTENT_PROCESS_NAME, mo174226b());
                intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_CLASS_NAME", activity.getClass().getName());
                intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_REF", activity.hashCode() + "");
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                C114644b bVar = C114644b.CREATED;
                String str = activity.getClass().getName() + "@" + activity.hashCode();
                AppForegroundDelegate.f343440t = str;
                AppForegroundDelegate.this.f343450g = new WeakReference<>(activity);
                AppForegroundDelegate.f343442v.add(activity.getClass().getName());
                if (MMApplicationContext.isMainProcess()) {
                    mo174225a(str, mo174226b(), bVar);
                } else {
                    mo174227c(bVar, str);
                }
            }

            public void onActivityDestroyed(Activity activity) {
                C114644b bVar = C114644b.DESTROY;
                String str = activity.getClass().getName() + "@" + activity.hashCode();
                if (MMApplicationContext.isMainProcess()) {
                    mo174225a(str, mo174226b(), bVar);
                } else {
                    mo174227c(bVar, str);
                }
                mo174228d(C114645c.EXIT, activity);
            }

            public void onActivityPaused(Activity activity) {
                C114644b bVar = C114644b.PAUSED;
                AppForegroundDelegate.f343443w = false;
                String str = activity.getClass().getName() + "@" + activity.hashCode();
                if (MMApplicationContext.isMainProcess()) {
                    mo174225a(str, mo174226b(), bVar);
                } else {
                    mo174227c(bVar, str);
                }
            }

            public void onActivityPreCreated(Activity activity, Bundle bundle) {
                mo174228d(C114645c.ENTER, activity);
                AppForegroundDelegate.this.f343451h = new WeakReference<>(activity);
            }

            public void onActivityResumed(Activity activity) {
                C114644b bVar = C114644b.RESUMED;
                AppForegroundDelegate.f343443w = true;
                String str = activity.getClass().getName() + "@" + activity.hashCode();
                AppForegroundDelegate.this.f343451h = new WeakReference<>(activity);
                if (MMApplicationContext.isMainProcess()) {
                    mo174225a(str, mo174226b(), bVar);
                } else {
                    mo174227c(bVar, str);
                }
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public void onActivityStarted(Activity activity) {
                C114644b bVar = C114644b.STARTED;
                String str = activity.getClass().getName() + "@" + activity.hashCode();
                if (MMApplicationContext.isMainProcess()) {
                    mo174225a(str, mo174226b(), bVar);
                } else {
                    mo174227c(bVar, str);
                }
            }

            public void onActivityStopped(Activity activity) {
                C114644b bVar = C114644b.STOPPED;
                String str = activity.getClass().getName() + "@" + activity.hashCode();
                if (MMApplicationContext.isMainProcess()) {
                    mo174225a(str, mo174226b(), bVar);
                } else {
                    mo174227c(bVar, str);
                }
            }

            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
            }

            public void onReceive(Context context, Intent intent) {
                C114644b bVar;
                C114644b bVar2 = C114644b.RESUMED;
                if (intent != null) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action) || "android.intent.action.SCREEN_ON".equals(action)) {
                        Log.m105925i("MicroMsg.AppForegroundDelegate", "ACTION_SCREEN:%s isAppForeground:%s", action, Boolean.valueOf(AppForegroundDelegate.this.f343454n));
                        if ("android.intent.action.SCREEN_OFF".equals(action)) {
                            C114647e eVar = C114647e.this;
                            AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.this;
                            appForegroundDelegate.f343457q = true;
                            C114646d dVar = AppForegroundDelegate.f343444x;
                            C114654g gVar = eVar.f343478b;
                            Handler handler = appForegroundDelegate.f343447d;
                            dVar.f343473d = gVar;
                            dVar.f343475f = handler;
                            dVar.f343474e = 0;
                            dVar.f343476g = true;
                            handler.postDelayed(dVar, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        } else {
                            AppForegroundDelegate.this.f343447d.removeCallbacks(AppForegroundDelegate.f343444x);
                            AppForegroundDelegate.this.f343457q = false;
                        }
                        ((C119157j) C119157j.f356862d).mo183876g(new C114649a(), "MicroMsg.AppForegroundDelegate");
                        return;
                    }
                    C114644b bVar3 = C114644b.STARTED;
                    if (action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STARTED")) {
                        bVar = bVar3;
                    } else if (action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_RESUMED")) {
                        bVar = bVar2;
                    } else {
                        bVar = C114644b.PAUSED;
                        if (!action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_PAUSED")) {
                            bVar = C114644b.STOPPED;
                            if (!action.equals("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STOPPED")) {
                                bVar = null;
                            }
                        }
                    }
                    if (bVar == bVar3 || bVar == bVar2) {
                        C114646d dVar2 = AppForegroundDelegate.f343444x;
                        dVar2.f343476g = false;
                        AppForegroundDelegate.this.f343447d.removeCallbacks(dVar2);
                    }
                    if (bVar != null) {
                        mo174225a(intent.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME"), intent.getStringExtra(MMApplicationContext.INTENT_PROCESS_NAME), bVar);
                    }
                }
            }

            public void onTrimMemory(int i) {
            }
        }

        public C114647e(C114643a aVar) {
            this.f343477a = new C114648a((C114643a) null);
            this.f343478b = new C114654g((C114643a) null);
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$f */
    public static class C114653f {

        /* renamed from: a */
        public LinkedList<String> f343489a;

        public C114653f(String str, C114644b bVar) {
            this.f343489a = new LinkedList<>();
            mo174245a(str, bVar);
        }

        /* renamed from: a */
        public boolean mo174245a(String str, C114644b bVar) {
            String str2 = str + "#" + bVar;
            if (this.f343489a.contains(str2)) {
                return false;
            }
            C114644b bVar2 = C114644b.RESUMED;
            if (bVar == bVar2) {
                this.f343489a.add(str2);
                return true;
            } else if (bVar != C114644b.PAUSED) {
                return true;
            } else {
                this.f343489a.remove(str + "#" + bVar2);
                return true;
            }
        }
    }

    /* renamed from: com.tencent.mm.app.AppForegroundDelegate$g */
    public class C114654g extends BroadcastReceiver {

        /* renamed from: a */
        public String f343490a;

        public C114654g(C114643a aVar) {
        }

        /* renamed from: a */
        public void mo174246a(boolean z, String str) {
            Intent intent = new Intent();
            intent.setAction(z ? "com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE" : "com.tencent.mm.AppForegroundDelegate.ACTION_DEAD");
            intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", str);
            intent.putExtra("com.tencent.mm.AppForegroundDelegate.DISPATCH_TIME", SystemClock.uptimeMillis());
            MMApplicationContext.getContext().sendBroadcast(intent, AppForegroundDelegate.f343439s);
        }

        public void onReceive(Context context, Intent intent) {
            boolean z;
            Intent intent2 = intent;
            if (intent2 != null) {
                String action = intent.getAction();
                this.f343490a = intent2.getStringExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME");
                long longExtra = intent2.getLongExtra("com.tencent.mm.AppForegroundDelegate.DISPATCH_TIME", 0);
                boolean equalsIgnoreCase = "com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE".equalsIgnoreCase(action);
                long uptimeMillis = SystemClock.uptimeMillis() - longExtra;
                int i = 2;
                if (equalsIgnoreCase) {
                    AppForegroundDelegate appForegroundDelegate = AppForegroundDelegate.this;
                    String str = this.f343490a;
                    if (!appForegroundDelegate.f343454n && appForegroundDelegate.f343456p) {
                        Log.m105925i("MicroMsg.AppForeground", "onAppForeground... activity[%s] expired[%sms]", str, Long.valueOf(uptimeMillis));
                        appForegroundDelegate.f343454n = true;
                        appForegroundDelegate.f343448e.post(new C114655b(appForegroundDelegate, str));
                        return;
                    }
                    return;
                }
                AppForegroundDelegate appForegroundDelegate2 = AppForegroundDelegate.this;
                String str2 = this.f343490a;
                if (appForegroundDelegate2.f343454n && appForegroundDelegate2.f343456p) {
                    if (!AppForegroundDelegate.f343441u) {
                        z = true;
                    } else {
                        LinkedList linkedList = new LinkedList();
                        List<String> aliveProcess = MMApplicationContext.getAliveProcess();
                        z = true;
                        for (Map.Entry next : AppForegroundDelegate.f343445y.entrySet()) {
                            if (!aliveProcess.contains(next.getKey())) {
                                linkedList.add((String) next.getKey());
                            } else if (((C114653f) next.getValue()).f343489a.size() > 0) {
                                Log.m105925i("MicroMsg.AppForegroundDelegate", "[isFallbackBackgroundValid] printRecord=%s", ((C114653f) next.getValue()).f343489a.toString());
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("isFallbackBackgroundValid=false", ((C114653f) next.getValue()).f343489a.toString());
                                } catch (JSONException unused) {
                                }
                                C117407d dVar = C117407d.INSTANCE;
                                Object[] objArr = new Object[i];
                                objArr[0] = jSONObject.toString().replaceAll(",", ";");
                                objArr[1] = 3L;
                                dVar.mo160131h(20459, objArr);
                                i = 2;
                                z = false;
                            }
                            i = 2;
                        }
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            AppForegroundDelegate.f343445y.remove((String) it.next());
                        }
                    }
                    if (z) {
                        appForegroundDelegate2.f343454n = false;
                        Log.m105925i("MicroMsg.AppForeground", "onAppBackground... activity[%s] expired[%sms]", str2, Long.valueOf(uptimeMillis));
                        appForegroundDelegate2.f343448e.post(new C114658c(appForegroundDelegate2, str2));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: public */
    static {
        f343439s = WeChatPermissions.PERMISSION_MM_MESSAGE();
        f343440t = null;
        f343441u = false;
        f343442v = new ArrayList<>();
        f343443w = false;
        f343444x = new C114646d((C114643a) null);
        f343445y = new ConcurrentHashMap<>();
    }

    /* renamed from: g */
    public static WeakReference<Activity> m161224g() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object next : arrayMap.values()) {
                Class<?> cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    declaredField3.setAccessible(true);
                    return new WeakReference<>((Activity) declaredField3.get(next));
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static String m161225h() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object next : arrayMap.values()) {
                Class<?> cls2 = next.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    Field declaredField3 = cls2.getDeclaredField(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                    declaredField3.setAccessible(true);
                    return ((Activity) declaredField3.get(next)).getClass().getCanonicalName();
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo174208a(C114668z zVar) {
        if (this.f343454n) {
            zVar.onAppForeground(this.f343455o.f343478b.f343490a);
        }
        synchronized (this.f343452i) {
            ((HashSet) this.f343452i).add(zVar);
        }
    }

    /* renamed from: b */
    public void mo174209b(C114660c0 c0Var) {
        synchronized (this.f343453j) {
            ((HashSet) this.f343453j).add(c0Var);
        }
    }

    /* renamed from: c */
    public String mo174210c() {
        if (Util.isNullOrNil(f343440t)) {
            f343440t = m161225h();
        }
        return f343440t;
    }

    /* renamed from: e */
    public WeakReference<Activity> mo174211e() {
        WeakReference<Activity> weakReference = this.f343451h;
        if (weakReference == null || weakReference.get() == null) {
            this.f343451h = m161224g();
        }
        return this.f343451h;
    }

    /* renamed from: f */
    public WeakReference<Activity> mo174212f() {
        WeakReference<Activity> weakReference = this.f343450g;
        if (weakReference == null || weakReference.get() == null) {
            this.f343450g = m161224g();
        }
        return this.f343450g;
    }

    /* renamed from: i */
    public void mo174213i(Application application) {
        Application application2 = application;
        if (this.f343456p) {
            Log.m105920e("MicroMsg.AppForegroundDelegate", "has init!");
            return;
        }
        this.f343456p = true;
        HandlerThread handlerThread = new HandlerThread("AppForegroundDelegate");
        handlerThread.start();
        this.f343448e = new Handler(handlerThread.getLooper());
        if (MMApplicationContext.isMainProcess()) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STARTED");
            intentFilter.addAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_RESUMED");
            intentFilter.addAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_PAUSED");
            intentFilter.addAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVITY_STOPPED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            application2.registerReceiver(this.f343455o.f343477a, intentFilter, f343439s, (Handler) null);
        } else if (!MMApplicationContext.getProcessName().endsWith(":dexopt")) {
            Uri parse = Uri.parse("content://" + Provider.f343458d + "/");
            Bundle bundle = new Bundle();
            try {
                if (MMApplicationContext.isMMProcessExist()) {
                    bundle = application.getContentResolver().call(parse, "isAppForeground", (String) null, (Bundle) null);
                    this.f343454n = bundle.getBoolean("isAppForeground");
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppForegroundDelegate", e, "isMMProcessExist:%s", Boolean.valueOf(MMApplicationContext.isMMProcessExist()));
                if (MMApplicationContext.isPushProcess()) {
                    C117407d.INSTANCE.idkeyStat(1118, 0, 1, true);
                } else {
                    C117407d.INSTANCE.idkeyStat(1118, 1, 1, true);
                }
            }
            String string = bundle == null ? "" : bundle.getString("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME");
            Log.m105925i("MicroMsg.AppForegroundDelegate", "[init] process:%s isAppForeground:%s", MMApplicationContext.getProcessName(), Boolean.valueOf(this.f343454n));
            if (this.f343454n) {
                this.f343447d.post(new C114643a(string));
            }
        } else {
            return;
        }
        application2.registerActivityLifecycleCallbacks(this.f343455o.f343477a);
        application2.registerComponentCallbacks(this.f343455o.f343477a);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE");
        intentFilter2.addAction("com.tencent.mm.AppForegroundDelegate.ACTION_DEAD");
        application2.registerReceiver(this.f343455o.f343478b, intentFilter2, f343439s, (Handler) null);
    }

    /* renamed from: j */
    public boolean mo174214j() {
        return this.f343454n;
    }

    /* renamed from: k */
    public void mo174215k(C114668z zVar) {
        synchronized (this.f343452i) {
            ((HashSet) this.f343452i).remove(zVar);
        }
    }
}
