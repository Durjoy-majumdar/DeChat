package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.plugin.appbrand.ipc.AccountScopedMainProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C1535a;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.C83387n;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84572p2;
import com.tencent.p014mm.plugin.appbrand.report.C84128k0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84186b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84201i;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Objects;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask */
public final class AppBrandPreInitTask extends AccountScopedMainProcessTask {
    public static final Parcelable.Creator<AppBrandPreInitTask> CREATOR = new AppBrandPreInitTask$$d();

    /* renamed from: f */
    public transient AppBrandPreInitTask$$e f243139f;

    /* renamed from: g */
    public transient Context f243140g;

    /* renamed from: h */
    public ActivityStarterIpcDelegate f243141h;

    /* renamed from: i */
    public LaunchParcel f243142i;

    /* renamed from: j */
    public boolean f243143j;

    /* renamed from: n */
    public boolean f243144n;

    /* renamed from: o */
    public boolean f243145o;

    /* renamed from: p */
    public AppBrandInitConfigWC f243146p;

    /* renamed from: q */
    public boolean f243147q;

    /* renamed from: r */
    public boolean f243148r;

    /* renamed from: s */
    public boolean f243149s;

    public AppBrandPreInitTask(Context context, LaunchParcel launchParcel, boolean z, AppBrandPreInitTask$$e appBrandPreInitTask$$e) {
        this.f243140g = context;
        this.f243142i = launchParcel;
        this.f243143j = z;
        this.f243144n = false;
        this.f243139f = appBrandPreInitTask$$e;
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(context);
        if (castActivityOrNull != null) {
            this.f243141h = new ActivityStarterIpcDelegate(castActivityOrNull);
        } else {
            this.f243141h = null;
        }
        this.f243142i.f243745v = this.f243141h;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f243142i = (LaunchParcel) parcel.readParcelable(LaunchParcel.class.getClassLoader());
        boolean z = true;
        this.f243143j = parcel.readByte() > 0;
        this.f243144n = parcel.readByte() > 0;
        this.f243146p = (AppBrandInitConfigWC) parcel.readParcelable(AppBrandInitConfigWC.class.getClassLoader());
        this.f243141h = (ActivityStarterIpcDelegate) parcel.readParcelable(ActivityStarterIpcDelegate.class.getClassLoader());
        this.f243147q = parcel.readByte() != 0;
        this.f243148r = parcel.readByte() > 0;
        if (parcel.readByte() <= 0) {
            z = false;
        }
        this.f243149s = z;
    }

    /* renamed from: i */
    public void mo1552i() {
        boolean z;
        try {
            if (this.f243148r) {
                Log.m105925i("MicroMsg.AppBrandPreInitTask", "runInClientProcess for %s, account expired, context:%s", this.f243142i, this.f243140g);
                Context context = this.f243140g;
                if (context instanceof Activity) {
                    C84572p2.f246773a.mo117255a((Activity) context);
                }
                if (z) {
                    return;
                }
                return;
            }
            AppBrandPreInitTask$$e appBrandPreInitTask$$e = this.f243139f;
            if (appBrandPreInitTask$$e != null) {
                if (this.f243147q) {
                    AppBrandTeenModeTempAuthMgr.f243916a.mo115755b(this.f243140g, this.f243146p, new AppBrandPreInitTask$$c(this));
                } else {
                    appBrandPreInitTask$$e.mo114042a(this.f243146p, this.f243142i.f243738o);
                }
            }
            if (!this.f243147q) {
                mo114397h();
            }
        } finally {
            if (!this.f243147q) {
                mo114397h();
            }
        }
    }

    /* renamed from: t */
    public void mo56735t() {
        C61926c.m72668M(C1535a.f10907d);
        this.f243148r = true;
        mo114394b();
    }

    /* renamed from: u */
    public void mo56736u() {
        AppBrandInitConfigWC h;
        Class<KSProcessWeAppLaunch> cls = KSProcessWeAppLaunch.class;
        LaunchParcel launchParcel = this.f243142i;
        String str = launchParcel.f243731e;
        Objects.requireNonNull(str);
        String e = C84201i.m103808e(launchParcel, str, this.f243144n);
        C84128k0.f245602a.mo116794d(this.f243142i, e);
        if (C84186b0.m103776e()) {
            C84186b0.f245919a.mo116883k(this.f243142i.f243731e, e);
            C83226n.m102133j(cls, this.f243142i.f243731e);
            C83226n.m102124a(cls, this.f243142i.f243731e, String.format("Network:%s", new Object[]{NetStatusUtil.getNetTypeString(MMApplicationContext.getContext())}));
        }
        AppBrandPreInitTask$$a appBrandPreInitTask$$a = new AppBrandPreInitTask$$a(this);
        LaunchParcel launchParcel2 = this.f243142i;
        String str2 = launchParcel2.f243731e;
        int i = launchParcel2.f243733g;
        if (!this.f243145o || this.f243144n || TextUtils.isEmpty(str2) || i != 0 || !AppBrandProcessesManager.m103869I().mo111385G(str2, i) || (h = C81648d.m100144g().mo113992b(str2)) == null || h.f239365g != i) {
            LaunchParcel launchParcel3 = this.f243142i;
            boolean z = this.f243143j;
            C87412m.m108594g(launchParcel3, "launchParcel");
            new C83351k(launchParcel3, e, z, appBrandPreInitTask$$a, (C83387n.C83389b) null, 16, (C8480h) null).run();
            return;
        }
        appBrandPreInitTask$$a.mo115495a(h, this.f243142i.f243738o, 1);
    }

    /* renamed from: v */
    public void mo115494v() {
        LaunchParcel launchParcel = this.f243142i;
        if (launchParcel.f243741r <= 0) {
            launchParcel.mo115684d();
        }
        mo114395c();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f243142i, i);
        parcel.writeByte(this.f243143j ? (byte) 1 : 0);
        parcel.writeByte(this.f243144n ? (byte) 1 : 0);
        parcel.writeParcelable(this.f243146p, i);
        parcel.writeParcelable(this.f243141h, i);
        parcel.writeByte(this.f243147q ? (byte) 1 : 0);
        parcel.writeByte(this.f243148r ? (byte) 1 : 0);
        parcel.writeByte(this.f243149s ? (byte) 1 : 0);
    }

    public AppBrandPreInitTask(Parcel parcel, AppBrandPreInitTask$$c appBrandPreInitTask$$c) {
        mo1551g(parcel);
    }
}
