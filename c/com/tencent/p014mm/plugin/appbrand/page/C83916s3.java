package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import rq0.C90088g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.s3 */
public class C83916s3 implements C90088g {

    /* renamed from: a */
    public final C83780d1 f244986a;

    /* renamed from: b */
    public final C83763b2 f244987b;

    /* renamed from: c */
    public final String f244988c = "Luggage.MPPageViewPullDownExtensionImpl";

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$a */
    public static final class C83917a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f244989d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f244990e;

        /* renamed from: f */
        public final /* synthetic */ boolean f244991f;

        public C83917a(C83916s3 s3Var, C83916s3 s3Var2, boolean z) {
            this.f244989d = s3Var;
            this.f244990e = s3Var2;
            this.f244991f = z;
        }

        public final void run() {
            if (!this.f244989d.f244986a.isRunning()) {
                Log.m105920e(this.f244989d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
            } else {
                this.f244990e.f244987b.setPullDownEnabled(this.f244991f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$b */
    public static final class C83918b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f244992d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f244993e;

        /* renamed from: f */
        public final /* synthetic */ boolean f244994f;

        public C83918b(C83916s3 s3Var, C83916s3 s3Var2, boolean z) {
            this.f244992d = s3Var;
            this.f244993e = s3Var2;
            this.f244994f = z;
        }

        public final void run() {
            if (!this.f244992d.f244986a.isRunning()) {
                Log.m105920e(this.f244992d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
                return;
            }
            this.f244993e.f244987b.setPullDownEnabled(this.f244994f);
            this.f244993e.f244987b.mo116099g(this.f244994f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$c */
    public static final class C83919c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f244995d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f244996e;

        /* renamed from: f */
        public final /* synthetic */ boolean f244997f;

        public C83919c(C83916s3 s3Var, C83916s3 s3Var2, boolean z) {
            this.f244995d = s3Var;
            this.f244996e = s3Var2;
            this.f244997f = z;
        }

        public final void run() {
            if (!this.f244995d.f244986a.isRunning()) {
                Log.m105920e(this.f244995d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
            } else {
                this.f244996e.f244987b.requestDisallowInterceptTouchEvent(this.f244997f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$d */
    public static final class C83920d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f244998d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f244999e;

        /* renamed from: f */
        public final /* synthetic */ C90088g.C90089a f245000f;

        /* renamed from: g */
        public final /* synthetic */ int f245001g;

        public C83920d(C83916s3 s3Var, C83916s3 s3Var2, C90088g.C90089a aVar, int i) {
            this.f244998d = s3Var;
            this.f244999e = s3Var2;
            this.f245000f = aVar;
            this.f245001g = i;
        }

        public final void run() {
            if (!this.f244998d.f244986a.isRunning()) {
                Log.m105920e(this.f244998d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
                return;
            }
            C83763b2 b2Var = this.f244999e.f244987b;
            String lowerCase = this.f245000f.name().toLowerCase();
            int i = this.f245001g;
            b2Var.setBackgroundTextStyle(lowerCase);
            b2Var.setPullDownBackgroundColor(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$e */
    public static final class C83921e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f245002d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f245003e;

        /* renamed from: f */
        public final /* synthetic */ String f245004f;

        public C83921e(C83916s3 s3Var, C83916s3 s3Var2, String str) {
            this.f245002d = s3Var;
            this.f245003e = s3Var2;
            this.f245004f = str;
        }

        public final void run() {
            if (!this.f245002d.f244986a.isRunning()) {
                Log.m105920e(this.f245002d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
            } else {
                this.f245003e.f244987b.setBackgroundTextStyle(this.f245004f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$f */
    public static final class C83922f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f245005d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f245006e;

        /* renamed from: f */
        public final /* synthetic */ String f245007f;

        public C83922f(C83916s3 s3Var, C83916s3 s3Var2, String str) {
            this.f245005d = s3Var;
            this.f245006e = s3Var2;
            this.f245007f = str;
        }

        public final void run() {
            if (!this.f245005d.f244986a.isRunning()) {
                Log.m105920e(this.f245005d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
            } else {
                this.f245006e.f244987b.setPullDownText(this.f245007f);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$g */
    public static final class C83923g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f245008d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f245009e;

        public C83923g(C83916s3 s3Var, C83916s3 s3Var2) {
            this.f245008d = s3Var;
            this.f245009e = s3Var2;
        }

        public final void run() {
            if (!this.f245008d.f244986a.isRunning()) {
                Log.m105920e(this.f245008d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
                return;
            }
            String str = this.f245009e.f244988c;
            Log.m105924i(str, "AppBrandPullDown OnUiThread startPullDownRefresh appId:" + this.f245009e.f244986a.getAppId() + " url:" + this.f245009e.f244986a.mo116162Q0());
            try {
                if (this.f245009e.f244986a.f244558J.getWebScrollY() != 0) {
                    this.f245009e.f244986a.f244558J.mo63324p1();
                }
                this.f245009e.f244987b.mo116099g(true);
                C83763b2 b2Var = this.f245009e.f244987b;
                b2Var.mo116085c(b2Var.getStayHeight());
                if (!b2Var.f244484j) {
                    b2Var.mo116088f();
                }
                b2Var.f244485n = true;
                b2Var.f244484j = true;
                b2Var.f244486o = true;
            } catch (NullPointerException e) {
                String str2 = this.f245009e.f244988c;
                Log.m105920e(str2, "AppBrandPullDown OnUiThread startPullDownRefresh appId:" + this.f245009e.f244986a.getAppId() + " url:" + this.f245009e.f244986a.mo116162Q0() + " e:" + e);
                throw e;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.page.s3$h */
    public static final class C83924h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83916s3 f245010d;

        /* renamed from: e */
        public final /* synthetic */ C83916s3 f245011e;

        public C83924h(C83916s3 s3Var, C83916s3 s3Var2) {
            this.f245010d = s3Var;
            this.f245011e = s3Var2;
        }

        public final void run() {
            if (!this.f245010d.f244986a.isRunning()) {
                Log.m105920e(this.f245010d.f244988c, "runOnUiThread in ui-thread PageView destroyed");
                return;
            }
            C83763b2 b2Var = this.f245011e.f244987b;
            b2Var.getClass();
            long currentTimeMillis = System.currentTimeMillis() - b2Var.f244505F;
            if (currentTimeMillis < 1000) {
                b2Var.postDelayed(new C83775c2(b2Var), 1000 - currentTimeMillis);
            } else {
                b2Var.mo116084b();
            }
        }
    }

    public C83916s3(C83780d1 d1Var, C83763b2 b2Var) {
        C87412m.m108594g(d1Var, "mPageView");
        C87412m.m108594g(b2Var, "mPullDownWrapper");
        this.f244986a = d1Var;
        this.f244987b = b2Var;
    }

    /* renamed from: b */
    public void mo116503b(boolean z) {
        if (!this.f244986a.isRunning()) {
            String str = this.f244988c;
            Log.m105920e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83917a(this, this, z));
    }

    /* renamed from: c */
    public void mo116504c(String str) {
        C87412m.m108594g(str, "style");
        if (!this.f244986a.isRunning()) {
            String str2 = this.f244988c;
            Log.m105920e(str2, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83921e(this, this, str));
    }

    /* renamed from: d */
    public void mo116505d(boolean z) {
        if (!this.f244986a.isRunning()) {
            String str = this.f244988c;
            Log.m105920e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83918b(this, this, z));
    }

    /* renamed from: e */
    public void mo116112e(C90088g.C90089a aVar, int i) {
        C87412m.m108594g(aVar, "style");
        if (!this.f244986a.isRunning()) {
            String str = this.f244988c;
            Log.m105920e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83920d(this, this, aVar, i));
    }

    /* renamed from: f */
    public void mo116506f() {
        String str = this.f244988c;
        Log.m105924i(str, "AppBrandPullDown invoke entered startPullDownRefresh appId:" + this.f244986a.getAppId() + " url:" + this.f244986a.mo116162Q0());
        if (!this.f244986a.isRunning()) {
            String str2 = this.f244988c;
            Log.m105920e(str2, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83923g(this, this));
    }

    /* renamed from: g */
    public void mo116507g() {
        if (!this.f244986a.isRunning()) {
            String str = this.f244988c;
            Log.m105920e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83924h(this, this));
    }

    /* renamed from: h */
    public void mo116508h(String str) {
        C87412m.m108594g(str, MimeTypes.BASE_TYPE_TEXT);
        if (!this.f244986a.isRunning()) {
            String str2 = this.f244988c;
            Log.m105920e(str2, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83922f(this, this, str));
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (!this.f244986a.isRunning()) {
            String str = this.f244988c;
            Log.m105920e(str, "runOnUiThread PageView destroyed, stack=" + android.util.Log.getStackTraceString(new Throwable()));
            return;
        }
        this.f244986a.mo109673t(new C83919c(this, this, z));
    }
}
