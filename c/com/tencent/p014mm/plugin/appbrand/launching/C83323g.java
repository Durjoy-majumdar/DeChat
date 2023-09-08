package com.tencent.p014mm.plugin.appbrand.launching;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.AppBrandBackgroundFetchDataTokenParcel;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C29445x;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81554a;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81557d;
import com.tencent.p014mm.plugin.appbrand.backgroundfetch.C81562p;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import java.util.Calendar;
import java.util.LinkedList;
import op3.C117877b;
import op3.C117882j;
import te3.C64524lg3;
import te3.C64767v8;
import tw0.C90583b;
import tw0.C90584e;
import vq0.C90865l;
import ym0.C91516n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.g */
public final class C83323g {

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.g$a */
    public class C83324a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandInitConfigWC f243493d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandStatObject f243494e;

        public C83324a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
            this.f243493d = appBrandInitConfigWC;
            this.f243494e = appBrandStatObject;
        }

        public void run() {
            AppBrandInitConfigWC appBrandInitConfigWC = this.f243493d;
            String str = appBrandInitConfigWC.f239362d;
            String str2 = appBrandInitConfigWC.f234839s;
            int i = appBrandInitConfigWC.f239365g;
            String str3 = appBrandInitConfigWC.f239367i;
            int i2 = this.f243494e.f245533f;
            C81562p pVar = new C81562p(appBrandInitConfigWC.f234838r);
            if (Util.isNullOrNil(str2)) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, username is null");
                return;
            }
            C81554a a = C81661j.m100176a(str2);
            if (a == null || a.f239178a) {
                String str4 = null;
                if (!Util.isNullOrNil(str3)) {
                    int lastIndexOf = str3.lastIndexOf(63);
                    if (lastIndexOf > 0) {
                        String substring = str3.substring(0, lastIndexOf);
                        if (lastIndexOf < str3.length() - 1) {
                            str4 = str3.substring(lastIndexOf + 1);
                        }
                        str3 = substring;
                    }
                } else {
                    str3 = null;
                }
                C117877b c = C117882j.m166284c(str3, str4);
                String str5 = (String) c.mo182596a(0);
                String str6 = (String) c.mo182596a(1);
                Class cls = C29445x.class;
                Log.m105925i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, app(%s) pre fetch data start, path:%s, query:%s, scene:%d", str2, str5, str6, Integer.valueOf(i2));
                C64767v8 v8Var = new C64767v8();
                v8Var.f185851h = str;
                v8Var.f185847d = str2;
                v8Var.f185848e = 0;
                C64524lg3 lg32 = new C64524lg3();
                v8Var.f185849f = lg32;
                lg32.f184105f = i2;
                if (C86312j.m106911c(cls) != null) {
                    AppBrandBackgroundFetchDataTokenParcel appBrandBackgroundFetchDataTokenParcel = ((C29445x) C86312j.m106911c(cls)).get(str2);
                    if (appBrandBackgroundFetchDataTokenParcel == null || Util.isNullOrNil(appBrandBackgroundFetchDataTokenParcel.f80235e)) {
                        Log.m105929w("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, token is empty, appid:%s", str);
                    } else {
                        Log.m105919d("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchDataInternal, app(%s) token:%s", v8Var.f185847d, appBrandBackgroundFetchDataTokenParcel.f80235e);
                        v8Var.f185850g = appBrandBackgroundFetchDataTokenParcel.f80235e;
                    }
                }
                if (!Util.isNullOrNil(str5)) {
                    v8Var.f185849f.f184103d = str5;
                }
                if (!Util.isNullOrNil(str6)) {
                    v8Var.f185849f.f184104e = str6;
                }
                LinkedList linkedList = new LinkedList();
                linkedList.add(v8Var);
                C81557d.m100044b(0, linkedList, pVar);
                return;
            }
            Log.m105925i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "preFetchData, app(%s_v%d) can not pre fetch data", str2, Integer.valueOf(i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.g$b */
    public class C83325b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandInitConfigWC f243495d;

        public C83325b(AppBrandInitConfigWC appBrandInitConfigWC) {
            this.f243495d = appBrandInitConfigWC;
        }

        public void run() {
            String str;
            Class cls = C90584e.class;
            if (this.f243495d.mo111300k()) {
                ((C90584e) C86312j.m106911c(cls)).mo60856OH(C90583b.f260261e);
                String i = C86709a0.m107523b().mo121111i();
                if (!TextUtils.isEmpty(i)) {
                    String string = MultiProcessMMKV.getDefault().getString("heavy_user_game_" + i, "");
                    long currentTimeMillis = System.currentTimeMillis();
                    if (TextUtils.isEmpty(string)) {
                        str = "0:" + currentTimeMillis;
                    } else {
                        String[] split = string.split(XVFSFile.PATH_SEPARATOR);
                        int i2 = 0;
                        int intValue = Integer.valueOf(split[0]).intValue();
                        long longValue = Long.valueOf(split[1]).longValue();
                        Calendar instance = Calendar.getInstance();
                        Calendar instance2 = Calendar.getInstance();
                        instance.setTimeInMillis(longValue);
                        instance2.setTimeInMillis(currentTimeMillis);
                        int i3 = instance2.get(6) - instance.get(6);
                        if (i3 < 0) {
                            i3 += instance.getActualMaximum(6);
                        }
                        if (i3 == 1) {
                            i2 = intValue + 1;
                        }
                        str = i2 + XVFSFile.PATH_SEPARATOR + currentTimeMillis;
                    }
                    MultiProcessMMKV.getDefault().edit().putString("heavy_user_game_" + i, str);
                }
            }
            if (!this.f243495d.f239373d1) {
                ((C90584e) C86312j.m106911c(cls)).mo60856OH(C90583b.f260262f);
                if (!this.f243495d.mo111300k()) {
                    ((C90584e) C86312j.m106911c(cls)).mo60856OH(C90583b.f260263g);
                }
            }
            if (C91516n.m114822a(this.f243495d.f239362d)) {
                ((C90584e) C86312j.m106911c(cls)).mo60856OH(C90583b.f260264h);
            }
            if (this.f243495d.mo111293d()) {
                ((C90584e) C86312j.m106911c(cls)).mo60856OH(C90583b.f260265i);
            }
        }
    }

    /* renamed from: a */
    public static void m102275a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        if (appBrandInitConfigWC != null && !Util.isNullOrNil(appBrandInitConfigWC.f239362d) && !AppBrandProcessesManager.m103869I().mo111384F(appBrandInitConfigWC.f239362d)) {
            ((C119157j) C119157j.f356862d).mo183870a(new C83324a(appBrandInitConfigWC, appBrandStatObject));
        }
        appBrandInitConfigWC.f234818T = C86709a0.m107523b().mo121110g();
        C81161g2.requireAccountInitializedOnDemand();
        boolean Lo = C81161g2.f238473i.mo56638Lo(appBrandInitConfigWC.f234839s, appBrandInitConfigWC.f239365g);
        if (C81161g2.Ax0().mo113793bD(appBrandInitConfigWC.f234839s, appBrandInitConfigWC.f239365g)) {
            appBrandStatObject.f245535h = 1;
        } else if (Lo) {
            appBrandStatObject.f245535h = 2;
        } else {
            appBrandStatObject.f245535h = 3;
        }
        ((C119157j) C119157j.f356862d).mo183870a(new C83325b(appBrandInitConfigWC));
        if (appBrandInitConfigWC.mo111300k()) {
            appBrandInitConfigWC.f239378i1 = null;
            if (appBrandInitConfigWC.f234813Q0 == 1) {
                appBrandInitConfigWC.f239366h = "portrait";
                return;
            }
            return;
        }
        WebRenderingCacheDirectoryDescriptor webRenderingCacheDirectoryDescriptor = new WebRenderingCacheDirectoryDescriptor();
        appBrandInitConfigWC.f239378i1 = webRenderingCacheDirectoryDescriptor;
        webRenderingCacheDirectoryDescriptor.f245118d = C90865l.m113956a(appBrandInitConfigWC.f239362d);
    }
}
