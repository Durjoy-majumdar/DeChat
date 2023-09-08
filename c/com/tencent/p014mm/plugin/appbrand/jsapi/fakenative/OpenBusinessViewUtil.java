package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.autogen.events.NavigateBackH5Event;
import com.tencent.p014mm.autogen.events.NavigateBackMiniProgramEvent;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiNavigateBackApplication;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51268sm2;
import te3.C51417tm2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil */
public class OpenBusinessViewUtil {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$NavigateBackH5Task */
    public static final class NavigateBackH5Task extends MainProcessTask {
        public static final Parcelable.Creator<NavigateBackH5Task> CREATOR = new C1681a();

        /* renamed from: f */
        public String f11358f;

        /* renamed from: g */
        public String f11359g;

        /* renamed from: h */
        public int f11360h;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$NavigateBackH5Task$a */
        public class C1681a implements Parcelable.Creator<NavigateBackH5Task> {
            public Object createFromParcel(Parcel parcel) {
                NavigateBackH5Task navigateBackH5Task = new NavigateBackH5Task();
                navigateBackH5Task.mo1551g(parcel);
                return navigateBackH5Task;
            }

            public Object[] newArray(int i) {
                return new NavigateBackH5Task[i];
            }
        }

        public NavigateBackH5Task() {
        }

        /* renamed from: g */
        public void mo1551g(Parcel parcel) {
            this.f11358f = parcel.readString();
            this.f11359g = parcel.readString();
            this.f11360h = parcel.readInt();
        }

        /* renamed from: j */
        public void mo1553j() {
            String str = this.f11358f;
            String str2 = this.f11359g;
            int i = this.f11360h;
            NavigateBackH5Event navigateBackH5Event = new NavigateBackH5Event();
            NavigateBackH5Event.C1095a aVar = navigateBackH5Event.f9347d;
            aVar.f9349b = str;
            aVar.f9348a = i;
            aVar.f9350c = str2;
            navigateBackH5Event.publish();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f11358f);
            parcel.writeString(this.f11359g);
            parcel.writeInt(this.f11360h);
        }

        public NavigateBackH5Task(String str, String str2, int i) {
            this.f11358f = str;
            this.f11359g = str2;
            this.f11360h = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$a */
    public class C40462a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C40463b f108750a;

        public C40462a(C40463b bVar) {
            this.f108750a = bVar;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar;
            if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof C51417tm2)) {
                Log.m105920e("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo, request fail");
                C40463b bVar = this.f108750a;
                if (bVar != null) {
                    bVar.mo63222z(i2, str);
                    return;
                }
                return;
            }
            C51417tm2 tm22 = (C51417tm2) aVar;
            Log.m105925i("MicroMsg.OpenBusinessViewUtil", "transBusinessAppInfo, request success, appId:%s, path:%s", tm22.f142291d, tm22.f142292e);
            C40463b bVar2 = this.f108750a;
            if (bVar2 != null) {
                bVar2.mo63221A(tm22.f142291d, tm22.f142292e, tm22.f142293f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.OpenBusinessViewUtil$b */
    public interface C40463b {
        /* renamed from: A */
        void mo63221A(String str, String str2, boolean z);

        /* renamed from: z */
        void mo63222z(int i, String str);
    }

    /* renamed from: a */
    public static void m101147a(String str, String str2, String str3, int i) {
        Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackApplication, appId:%s, businessType:%s, errCode:%d", str, str3, Integer.valueOf(i));
        new JsApiNavigateBackApplication.NavigateBackAppTask(str, Util.nullAs(str2, "{}"), str3, i).mo114395c();
    }

    /* renamed from: b */
    public static void m101148b(AppBrandRuntimeWC appBrandRuntimeWC) {
        if (appBrandRuntimeWC != null) {
            int i = C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245466j;
            String str = C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245465i;
            Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, appId:%s, businessType:%s, launchScene:%s", appBrandRuntimeWC.f238147j, str, Integer.valueOf(i));
            if (Util.isNullOrNil(str)) {
                return;
            }
            if (i == 2) {
                if (!C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245467k) {
                    Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to H5, businessType:%s", str);
                    m101149c(str, (String) null, -3);
                }
            } else if (i == 4) {
                if (!C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245469m) {
                    Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to Application, businessType:%s", str);
                    if (appBrandRuntimeWC.mo113210l1().f234846y != null && !Util.isNullOrNil(appBrandRuntimeWC.mo113210l1().f234846y.f239397e)) {
                        m101147a(appBrandRuntimeWC.mo113210l1().f234846y.f239397e, (String) null, str, -2);
                    }
                }
            } else if (i == 1 && !C84072q1.m103587b(appBrandRuntimeWC.f238147j).f245468l) {
                Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackCancelResultIfNeed, return cancel to MiniProgram, businessType:%s", str);
                m101150d(str, -3, (String) null);
            }
        }
    }

    /* renamed from: c */
    public static void m101149c(String str, String str2, int i) {
        Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackH5, businessType:%s, errCode:%d", str, Integer.valueOf(i));
        if (MMApplicationContext.isMMProcess()) {
            NavigateBackH5Event navigateBackH5Event = new NavigateBackH5Event();
            NavigateBackH5Event.C1095a aVar = navigateBackH5Event.f9347d;
            aVar.f9349b = str;
            aVar.f9348a = i;
            aVar.f9350c = str2;
            navigateBackH5Event.publish();
            return;
        }
        new NavigateBackH5Task(str, str2, i).mo114395c();
    }

    /* renamed from: d */
    public static void m101150d(String str, int i, String str2) {
        Log.m105925i("MicroMsg.OpenBusinessViewUtil", "navigateBackMiniProgram, businessType:%s, errCode:%d", str, Integer.valueOf(i));
        NavigateBackMiniProgramEvent navigateBackMiniProgramEvent = new NavigateBackMiniProgramEvent();
        NavigateBackMiniProgramEvent.C80729a aVar = navigateBackMiniProgramEvent.f236239d;
        aVar.f236240a = i;
        aVar.f236241b = str;
        aVar.f236242c = str2;
        navigateBackMiniProgramEvent.publish();
    }

    /* renamed from: e */
    public static void m101151e(AppBrandRuntimeWC appBrandRuntimeWC) {
        if (appBrandRuntimeWC != null) {
            AppBrandLaunchReferrer appBrandLaunchReferrer = appBrandRuntimeWC.mo113210l1().f234846y;
            if (appBrandLaunchReferrer == null || Util.isNullOrNil(appBrandLaunchReferrer.f239404o)) {
                Log.m105924i("MicroMsg.OpenBusinessViewUtil", "recordOpenBusinessViewInfo, referrer businessType is null");
                return;
            }
            String str = appBrandRuntimeWC.f238147j;
            C84072q1.m103586a(str).f245466j = appBrandLaunchReferrer.f239396d;
            C84072q1.m103586a(str).f245465i = appBrandLaunchReferrer.f239404o;
            C84072q1.m103586a(str).f245467k = false;
            C84072q1.m103586a(str).f245469m = false;
            C84072q1.m103586a(str).f245468l = false;
            Log.m105925i("MicroMsg.OpenBusinessViewUtil", "recordOpenBusinessViewInfo, app:%s, businessType:%s, launchScene:%s", str, appBrandLaunchReferrer.f239404o, Integer.valueOf(appBrandLaunchReferrer.f239396d));
        }
    }

    /* renamed from: f */
    public static void m101152f(int i, String str, String str2, String str3, String str4, C40463b bVar) {
        C51268sm2 sm22 = new C51268sm2();
        sm22.f141611h = i;
        sm22.f141607d = str;
        sm22.f141609f = str3;
        sm22.f141610g = str4;
        sm22.f141608e = str2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127069d = 1268;
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/launchbizwxaapp";
        bVar2.f127066a = sm22;
        bVar2.f127067b = new C51417tm2();
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar2.mo72403a(), new C40462a(bVar));
    }
}
