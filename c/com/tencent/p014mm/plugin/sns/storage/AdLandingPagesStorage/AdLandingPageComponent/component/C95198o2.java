package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.net.URI;
import java.util.List;
import ji3.C9457a;
import p1208q3.C118144a;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2 */
public class C95198o2 {

    /* renamed from: a */
    public static Typeface f276254a;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2$a */
    public class C95199a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f276255d;

        /* renamed from: e */
        public final /* synthetic */ Intent f276256e;

        /* renamed from: f */
        public final /* synthetic */ String f276257f;

        /* renamed from: g */
        public final /* synthetic */ int f276258g;

        /* renamed from: h */
        public final /* synthetic */ C44580q1 f276259h;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2$a$a */
        public class C95200a implements C44580q1 {
            public C95200a() {
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1$1");
                Log.m105924i("LandingPageUtil", "onLaunchApp, launchSuccess=" + z + ", launchCancel=" + z2);
                if (!z) {
                    C95198o2.m121132d(C95199a.this.f276255d);
                }
                C44580q1 q1Var = C95199a.this.f276259h;
                if (q1Var != null) {
                    q1Var.mo1579a(z, z2);
                }
                SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1$1");
            }
        }

        public C95199a(Context context, Intent intent, String str, int i, C44580q1 q1Var) {
            this.f276255d = context;
            this.f276256e = intent;
            this.f276257f = str;
            this.f276258g = i;
            this.f276259h = q1Var;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1");
            if (Util.isIntentAvailable(this.f276255d, this.f276256e, true)) {
                Log.m105924i("LandingPageUtil", "openApp, launchAppByWeChat, targetIntent=" + this.f276256e + ", appName=" + this.f276257f + ", showType=" + this.f276258g);
                ((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(this.f276255d, this.f276256e, this.f276257f, this.f276258g, new C95200a(), (Bundle) null);
            } else {
                Log.m105920e("LandingPageUtil", "openApp, isIntentAvailable==false, intent=" + this.f276256e);
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2$b */
    public class C95201b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f276261d;

        /* renamed from: e */
        public final /* synthetic */ Intent f276262e;

        /* renamed from: f */
        public final /* synthetic */ String f276263f;

        /* renamed from: g */
        public final /* synthetic */ int f276264g;

        /* renamed from: h */
        public final /* synthetic */ C44580q1 f276265h;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2$b$a */
        public class C95202a implements C44580q1 {
            public C95202a() {
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$2$1");
                if (!z) {
                    C95198o2.m121132d(C95201b.this.f276261d);
                }
                C44580q1 q1Var = C95201b.this.f276265h;
                if (q1Var != null) {
                    q1Var.mo1579a(z, z2);
                }
                SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$2$1");
            }
        }

        public C95201b(Context context, Intent intent, String str, int i, C44580q1 q1Var) {
            this.f276261d = context;
            this.f276262e = intent;
            this.f276263f = str;
            this.f276264g = i;
            this.f276265h = q1Var;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$2");
            ((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(this.f276261d, this.f276262e, this.f276263f, this.f276264g, new C95202a(), (Bundle) null);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2$c */
    public class C95203c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f276267d;

        /* renamed from: e */
        public final /* synthetic */ String f276268e;

        /* renamed from: f */
        public final /* synthetic */ String f276269f;

        /* renamed from: g */
        public final /* synthetic */ int f276270g;

        /* renamed from: h */
        public final /* synthetic */ C44580q1 f276271h;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o2$c$a */
        public class C95204a implements C44580q1 {
            public C95204a() {
            }

            /* renamed from: a */
            public void mo1579a(boolean z, boolean z2) {
                SnsMethodCalculate.markStartTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3$1");
                Log.m105924i("LandingPageUtil", "onLaunchApp, default, launchSuccess=" + z + ", launchCancel=" + z2);
                if (!z) {
                    C95198o2.m121132d(C95203c.this.f276267d);
                }
                C44580q1 q1Var = C95203c.this.f276271h;
                if (q1Var != null) {
                    q1Var.mo1579a(z, z2);
                }
                SnsMethodCalculate.markEndTimeMs("onLaunchApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3$1");
            }
        }

        public C95203c(Context context, String str, String str2, int i, C44580q1 q1Var) {
            this.f276267d = context;
            this.f276268e = str;
            this.f276269f = str2;
            this.f276270g = i;
            this.f276271h = q1Var;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3");
            Intent launchIntentForPackage = this.f276267d.getPackageManager().getLaunchIntentForPackage(this.f276268e);
            Log.m105924i("LandingPageUtil", "openApp, default, launchAppByWeChat, intent=" + launchIntentForPackage + ", appName=" + this.f276269f + ", showType=" + this.f276270g);
            ((C79138l) C86312j.m106911c(C79138l.class)).mo73999QH(this.f276267d, launchIntentForPackage, this.f276269f, this.f276270g, new C95204a(), (Bundle) null);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil$3");
        }
    }

    /* renamed from: a */
    public static String m121129a(String str, String... strArr) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        if (strArr == null) {
            SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return str;
        }
        try {
            URI uri = new URI(str);
            StringBuilder sb = new StringBuilder();
            for (String append : strArr) {
                sb.append(append);
                sb.append("&");
            }
            if (sb.length() > 1) {
                StringBuilder deleteCharAt = sb.deleteCharAt(sb.length() - 1);
                String query = uri.getQuery();
                if (query == null) {
                    str2 = deleteCharAt.toString();
                } else {
                    str2 = query + "&" + deleteCharAt.toString();
                }
                String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
                SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
                return uri2;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("LandingPageUtil", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return str;
    }

    /* renamed from: b */
    public static int[] m121130b(Context context) {
        SnsMethodCalculate.markStartTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        int[] iArr = {point.x, point.y};
        SnsMethodCalculate.markEndTimeMs("getScreenSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return iArr;
    }

    /* renamed from: c */
    public static boolean m121131c(Context context, String str, String str2, Intent intent, String str3, C44580q1 q1Var, int i) {
        Context context2 = context;
        String str4 = str2;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        StringBuilder sb = new StringBuilder();
        sb.append("openApp, pkg=");
        String str5 = str;
        sb.append(str);
        sb.append(", appName=");
        String str6 = str3;
        sb.append(str3);
        sb.append(", showType=");
        sb.append(i);
        sb.append(", pageUrl=");
        sb.append(str2);
        sb.append(", intent=");
        sb.append(intent);
        Log.m105924i("LandingPageUtil", sb.toString());
        if (context2 == null || (TextUtils.isEmpty(str) && intent2 == null)) {
            Log.m105920e("LandingPageUtil", "openApp, null");
            SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            return false;
        }
        if (intent2 != null) {
            C9457a.m9137a(new C95199a(context, intent, str3, i, q1Var));
        } else if (!TextUtils.isEmpty(str2)) {
            Log.m105924i("LandingPageUtil", "openApp, jump pageUrl=" + str2);
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(str2));
            intent3.addFlags(268435456);
            List<ResolveInfo> queryIntentActivities = Util.queryIntentActivities(context, intent3);
            if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                if (!Util.nullAsNil(MMApplicationContext.getPackageName()).equals((!TextUtils.isEmpty(intent3.getPackage()) || queryIntentActivities.size() != 1) ? intent3.getPackage() : ((C79138l) C86312j.m106911c(C79138l.class)).mo74017uF(queryIntentActivities.get(0)))) {
                    C9457a.m9137a(new C95201b(context, intent3, str3, i, q1Var));
                }
            }
        } else {
            C9457a.m9137a(new C95203c(context, str, str3, i, q1Var));
        }
        SnsMethodCalculate.markEndTimeMs("openApp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        return true;
    }

    /* renamed from: d */
    public static void m121132d(Context context) {
        SnsMethodCalculate.markStartTimeMs("sendSetUiOptionLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        SnsMethodCalculate.markStartTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        C118144a.m166672a(context).mo182944c(new Intent("com.tencent.mm.adlanding.set_uioption"));
        SnsMethodCalculate.markEndTimeMs("sendLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        SnsMethodCalculate.markEndTimeMs("sendSetUiOptionLocalBroadcast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    /* renamed from: e */
    public static void m121133e(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        boolean t = C85875k4.m106205t(activity, false);
        Log.m105924i("LandingPageUtil", "setFullScreen, hasCut=" + t);
        int i = 514;
        if (!t) {
            i = 1542;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(i | 4096);
        SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }

    /* renamed from: f */
    public static void m121134f(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("setVideoFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
        Log.m105924i("LandingPageUtil", "setFullScreen");
        activity.getWindow().getDecorView().setSystemUiVisibility(5638);
        SnsMethodCalculate.markEndTimeMs("setVideoFullScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
    }
}
