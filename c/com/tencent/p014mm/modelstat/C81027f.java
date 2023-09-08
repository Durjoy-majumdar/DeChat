package com.tencent.p014mm.modelstat;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.BroadcastHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashSet;
import p823sg.C101611g;
import q90.C101062d;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelstat.f */
public final class C81027f {

    /* renamed from: c */
    public static C81027f f237999c;

    /* renamed from: a */
    public C81029b f238000a = new C81029b();

    /* renamed from: b */
    public HashSet<String> f238001b;

    /* renamed from: com.tencent.mm.modelstat.f$a */
    public class C81028a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f238002d;

        /* renamed from: e */
        public final /* synthetic */ String f238003e;

        /* renamed from: f */
        public final /* synthetic */ int f238004f;

        public C81028a(int i, String str, int i2) {
            this.f238002d = i;
            this.f238003e = str;
            this.f238004f = i2;
        }

        public void run() {
            Intent intent = new Intent("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT");
            intent.putExtra("opCode", this.f238002d);
            intent.putExtra("ui", this.f238003e);
            intent.putExtra("uiHashCode", this.f238004f);
            intent.putExtra("nowMilliSecond", Util.nowMilliSecond());
            intent.putExtra("elapsedRealtime", SystemClock.elapsedRealtime());
            BroadcastHelper.setIntentPackageName(intent);
            Context context = MMApplicationContext.getContext();
            if (context != null) {
                if (MMApplicationContext.isMMProcess()) {
                    C81016b i = C81016b.m98929i();
                    i.getClass();
                    if (intent.getAction().equals("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT")) {
                        i.f237961a.post(new C81024d(i, intent));
                    }
                } else {
                    Log.m105919d("MicroMsg.ClickFlowStatSender", "sendBroadcast, Intent: %s, Extra: %s", intent, intent.getExtras());
                    context.sendBroadcast(intent);
                }
                intent.setAction("com.tencent.mm.Intent.ACTION_NET_STATS");
                context.sendBroadcast(intent);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelstat.f$b */
    public static class C81029b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: d */
        public int f238005d;

        /* renamed from: e */
        public int f238006e;

        /* renamed from: f */
        public int f238007f;

        /* renamed from: g */
        public int f238008g;

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C81027f.m98941a(C81027f.m98943c(), 1, activity);
        }

        public void onActivityDestroyed(Activity activity) {
            C81027f.m98941a(C81027f.m98943c(), 6, activity);
        }

        public void onActivityPaused(Activity activity) {
            int i = this.f238006e + 1;
            this.f238006e = i;
            Log.m105925i("MicroMsg.ClickFlowStatSender", "paused[%d]", Integer.valueOf(i));
            C81027f.m98941a(C81027f.m98943c(), 4, activity);
            C81030i a = C81030i.m98944a();
            a.getClass();
            if (activity instanceof MMActivity) {
                String name = activity.getClass().getName();
                long activityBrowseTimeMs = ((MMActivity) activity).getActivityBrowseTimeMs();
                C101611g<String, Long> gVar = a.f238010a;
                if (gVar != null) {
                    a.f238011b = name;
                    ((C101062d) gVar).put(name, Long.valueOf(activityBrowseTimeMs));
                }
                Log.m105927v("MicroMsg.MMActivityBrowseMgr", "onPause activity[%s] time[%d] map[%d]", name, Long.valueOf(activityBrowseTimeMs), Integer.valueOf(((C101062d) a.f238010a).size()));
            }
        }

        public void onActivityResumed(Activity activity) {
            int i = this.f238005d + 1;
            this.f238005d = i;
            Log.m105925i("MicroMsg.ClickFlowStatSender", "resumed[%d]", Integer.valueOf(i));
            C81027f.m98941a(C81027f.m98943c(), 3, activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            int i = this.f238007f + 1;
            this.f238007f = i;
            Log.m105925i("MicroMsg.ClickFlowStatSender", "started[%d]", Integer.valueOf(i));
            C81027f.m98941a(C81027f.m98943c(), 2, activity);
        }

        public void onActivityStopped(Activity activity) {
            int i = this.f238008g + 1;
            this.f238008g = i;
            Log.m105925i("MicroMsg.ClickFlowStatSender", "stopped[%d]", Integer.valueOf(i));
            C81027f.m98941a(C81027f.m98943c(), 5, activity);
        }
    }

    public C81027f() {
        HashSet<String> hashSet = new HashSet<>();
        this.f238001b = hashSet;
        hashSet.add("com.tencent.mm.ui.LauncherUI");
        this.f238001b.add("com.tencent.mm.plugin.profile.ui.ContactInfoUI");
        this.f238001b.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        this.f238001b.add("com.tencent.mm.ui.conversation.BizConversationUI");
        this.f238001b.add("com.tencent.mm.ui.chatting.ChattingUI");
        this.f238001b.add("com.tencent.mm.plugin.label.ui.ContactLabelEditUI");
        this.f238001b.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
        this.f238001b.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI1");
        this.f238001b.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI2");
        this.f238001b.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI3");
        this.f238001b.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI4");
    }

    /* renamed from: a */
    public static void m98941a(C81027f fVar, int i, Activity activity) {
        fVar.getClass();
        int hashCode = activity.hashCode();
        String className = activity.getComponentName().getClassName();
        boolean contains = fVar.f238001b.contains(className);
        Log.m105927v("MicroMsg.ClickFlowStatSender", "callback opCode:%d activity:%s hash:%d ignore:%s %s", Integer.valueOf(i), className, Integer.valueOf(hashCode), Boolean.valueOf(contains), Util.getStack());
        if (!contains) {
            m98942b(i, className, hashCode);
        }
    }

    /* renamed from: b */
    public static void m98942b(int i, String str, int i2) {
        ((C119157j) C119157j.f356862d).mo183875f(new C81028a(i, str, i2));
    }

    /* renamed from: c */
    public static C81027f m98943c() {
        if (f237999c == null) {
            synchronized (C81027f.class) {
                if (f237999c == null) {
                    f237999c = new C81027f();
                }
            }
        }
        return f237999c;
    }
}
