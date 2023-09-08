package com.tencent.wxa.p1187ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p172io.flutter.embedding.android.FlutterView;
import p172io.flutter.embedding.android.SplashScreen;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import ww3.C118789a;

/* renamed from: com.tencent.wxa.ui.WxaFlutterSplashView */
public class WxaFlutterSplashView extends FrameLayout {

    /* renamed from: d */
    public SplashScreen f349444d;

    /* renamed from: e */
    public FlutterView f349445e;

    /* renamed from: f */
    public View f349446f;

    /* renamed from: g */
    public Bundle f349447g;

    /* renamed from: h */
    public String f349448h;

    /* renamed from: i */
    public String f349449i;

    /* renamed from: j */
    public final FlutterView.FlutterEngineAttachmentListener f349450j;

    /* renamed from: n */
    public final FlutterUiDisplayListener f349451n;

    /* renamed from: o */
    public final Runnable f349452o;

    /* renamed from: com.tencent.wxa.ui.WxaFlutterSplashView$SavedState */
    public static class SavedState extends View.BaseSavedState {

        /* renamed from: d */
        public String f349453d;

        /* renamed from: e */
        public Bundle f349454e;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f349453d);
            parcel.writeBundle(this.f349454e);
        }
    }

    /* renamed from: com.tencent.wxa.ui.WxaFlutterSplashView$a */
    public class C116503a implements FlutterView.FlutterEngineAttachmentListener {
        public C116503a() {
        }

        public void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine) {
            WxaFlutterSplashView.this.f349445e.removeFlutterEngineAttachmentListener(this);
            WxaFlutterSplashView wxaFlutterSplashView = WxaFlutterSplashView.this;
            wxaFlutterSplashView.mo180428a(wxaFlutterSplashView.f349445e, wxaFlutterSplashView.f349444d);
        }

        public void onFlutterEngineDetachedFromFlutterView() {
        }
    }

    /* renamed from: com.tencent.wxa.ui.WxaFlutterSplashView$b */
    public class C116504b implements FlutterUiDisplayListener {
        public C116504b() {
        }

        public void onFlutterUiDisplayed() {
            WxaFlutterSplashView wxaFlutterSplashView = WxaFlutterSplashView.this;
            if (wxaFlutterSplashView.f349444d != null) {
                wxaFlutterSplashView.mo180430c();
            }
        }

        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    /* renamed from: com.tencent.wxa.ui.WxaFlutterSplashView$c */
    public class C116505c implements Runnable {
        public C116505c() {
        }

        public void run() {
            WxaFlutterSplashView wxaFlutterSplashView = WxaFlutterSplashView.this;
            wxaFlutterSplashView.removeView(wxaFlutterSplashView.f349446f);
            WxaFlutterSplashView wxaFlutterSplashView2 = WxaFlutterSplashView.this;
            wxaFlutterSplashView2.f349449i = wxaFlutterSplashView2.f349448h;
        }
    }

    public WxaFlutterSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        if ((r4.f349445e.hasRenderedFirstFrame() && !mo180429b()) != false) goto L_0x009a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo180428a(p172io.flutter.embedding.android.FlutterView r5, p172io.flutter.embedding.android.SplashScreen r6) {
        /*
            r4 = this;
            io.flutter.embedding.android.FlutterView r0 = r4.f349445e
            if (r0 == 0) goto L_0x000e
            io.flutter.embedding.engine.renderer.FlutterUiDisplayListener r1 = r4.f349451n
            r0.removeOnFirstFrameRenderedListener(r1)
            io.flutter.embedding.android.FlutterView r0 = r4.f349445e
            r4.removeView(r0)
        L_0x000e:
            android.view.View r0 = r4.f349446f
            if (r0 == 0) goto L_0x0015
            r4.removeView(r0)
        L_0x0015:
            r4.f349445e = r5
            r4.f349444d = r6
            if (r6 == 0) goto L_0x00c8
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0035
            boolean r2 = r5.isAttachedToFlutterEngine()
            if (r2 == 0) goto L_0x0035
            io.flutter.embedding.android.FlutterView r2 = r4.f349445e
            boolean r2 = r2.hasRenderedFirstFrame()
            if (r2 != 0) goto L_0x0035
            boolean r2 = r4.mo180429b()
            if (r2 != 0) goto L_0x0035
            r2 = 1
            goto L_0x0036
        L_0x0035:
            r2 = 0
        L_0x0036:
            java.lang.String r3 = "WxaRouter.WxaFlutterSplashView"
            if (r2 == 0) goto L_0x0057
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Showing splash screen UI."
            ww3.C118789a.m167473d(r3, r1, r0)
            android.content.Context r0 = r4.getContext()
            android.os.Bundle r1 = r4.f349447g
            android.view.View r6 = r6.createSplashView(r0, r1)
            r4.f349446f = r6
            r4.addView(r6)
            io.flutter.embedding.engine.renderer.FlutterUiDisplayListener r6 = r4.f349451n
            r5.addOnFirstFrameRenderedListener(r6)
            goto L_0x00c8
        L_0x0057:
            io.flutter.embedding.android.FlutterView r2 = r4.f349445e
            if (r2 == 0) goto L_0x0099
            boolean r2 = r2.isAttachedToFlutterEngine()
            if (r2 == 0) goto L_0x0099
            io.flutter.embedding.android.SplashScreen r2 = r4.f349444d
            if (r2 == 0) goto L_0x0099
            boolean r2 = r2.doesSplashViewRememberItsTransition()
            if (r2 == 0) goto L_0x0099
            io.flutter.embedding.android.FlutterView r2 = r4.f349445e
            if (r2 == 0) goto L_0x0091
            boolean r2 = r2.isAttachedToFlutterEngine()
            if (r2 == 0) goto L_0x0089
            io.flutter.embedding.android.FlutterView r2 = r4.f349445e
            boolean r2 = r2.hasRenderedFirstFrame()
            if (r2 == 0) goto L_0x0085
            boolean r2 = r4.mo180429b()
            if (r2 != 0) goto L_0x0085
            r2 = 1
            goto L_0x0086
        L_0x0085:
            r2 = 0
        L_0x0086:
            if (r2 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0089:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences."
            r5.<init>(r6)
            throw r5
        L_0x0091:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Cannot determine if previous splash transition was interrupted when no FlutterView is set."
            r5.<init>(r6)
            throw r5
        L_0x0099:
            r0 = 0
        L_0x009a:
            if (r0 == 0) goto L_0x00b6
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r1 = "Showing an immediate splash transition to Flutter due to previously interrupted transition."
            ww3.C118789a.m167473d(r3, r1, r0)
            android.content.Context r0 = r4.getContext()
            android.os.Bundle r1 = r4.f349447g
            android.view.View r6 = r6.createSplashView(r0, r1)
            r4.f349446f = r6
            r4.addView(r6)
            r4.mo180430c()
            goto L_0x00c8
        L_0x00b6:
            boolean r6 = r5.isAttachedToFlutterEngine()
            if (r6 != 0) goto L_0x00c8
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r0 = "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached."
            ww3.C118789a.m167473d(r3, r0, r6)
            io.flutter.embedding.android.FlutterView$FlutterEngineAttachmentListener r6 = r4.f349450j
            r5.addFlutterEngineAttachmentListener(r6)
        L_0x00c8:
            r4.addView(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxa.p1187ui.WxaFlutterSplashView.mo180428a(io.flutter.embedding.android.FlutterView, io.flutter.embedding.android.SplashScreen):void");
    }

    /* renamed from: b */
    public final boolean mo180429b() {
        FlutterView flutterView = this.f349445e;
        if (flutterView == null) {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
        } else if (flutterView.isAttachedToFlutterEngine()) {
            return this.f349445e.getAttachedFlutterEngine().getDartExecutor().getIsolateServiceId() != null && this.f349445e.getAttachedFlutterEngine().getDartExecutor().getIsolateServiceId().equals(this.f349449i);
        } else {
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
    }

    /* renamed from: c */
    public final void mo180430c() {
        this.f349448h = this.f349445e.getAttachedFlutterEngine().getDartExecutor().getIsolateServiceId();
        C118789a.m167473d("WxaRouter.WxaFlutterSplashView", "Transitioning splash screen to a Flutter UI. Isolate: " + this.f349448h, new Object[0]);
        this.f349444d.transitionToFlutter(this.f349452o);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f349449i = savedState.f349453d;
        this.f349447g = savedState.f349454e;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f349453d = this.f349449i;
        SplashScreen splashScreen = this.f349444d;
        savedState.f349454e = splashScreen != null ? splashScreen.saveSplashScreenState() : null;
        return savedState;
    }

    public WxaFlutterSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f349450j = new C116503a();
        this.f349451n = new C116504b();
        this.f349452o = new C116505c();
        setSaveEnabled(true);
    }
}
