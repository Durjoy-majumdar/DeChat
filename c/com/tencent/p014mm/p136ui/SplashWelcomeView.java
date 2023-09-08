package com.tencent.p014mm.p136ui;

import a70.C112760b;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.chatting.C73312a5;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import p206nj.C88956h;

/* renamed from: com.tencent.mm.ui.SplashWelcomeView */
public class SplashWelcomeView extends FrameLayout implements C73312a5 {

    /* renamed from: d */
    public boolean f214661d;

    /* renamed from: e */
    public volatile boolean f214662e;

    /* renamed from: f */
    public volatile boolean f214663f;

    /* renamed from: g */
    public Bitmap f214664g;

    /* renamed from: h */
    public ImageView f214665h;

    /* renamed from: i */
    public int f214666i;

    /* renamed from: com.tencent.mm.ui.SplashWelcomeView$a */
    public class C73146a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f214667d;

        public C73146a(String str) {
            this.f214667d = str;
        }

        public void run() {
            SplashWelcomeView splashWelcomeView;
            if (C86013q1.m106450k(this.f214667d)) {
                try {
                    String str = this.f214667d;
                    byte[] O = C86013q1.m106433O(str, 0, (int) C86013q1.m106451l(str));
                    if (O != null && O.length > 0) {
                        SplashWelcomeView.this.f214664g = BitmapFactory.decodeByteArray(O, 0, O.length);
                        Log.m105925i("SplashWelcomeView", "ready to play animation, hasDrawed %s", Boolean.valueOf(SplashWelcomeView.this.f214661d));
                        SplashWelcomeView.this.f214663f = true;
                    }
                    splashWelcomeView = SplashWelcomeView.this;
                    if (!splashWelcomeView.f214661d) {
                        return;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("SplashWelcomeView", e, "decode new welcome image error: %s", e.getMessage());
                    splashWelcomeView = SplashWelcomeView.this;
                    if (!splashWelcomeView.f214661d) {
                        return;
                    }
                } catch (Throwable th) {
                    SplashWelcomeView splashWelcomeView2 = SplashWelcomeView.this;
                    if (splashWelcomeView2.f214661d) {
                        splashWelcomeView2.mo101557d();
                    }
                    throw th;
                }
                splashWelcomeView.mo101557d();
                return;
            }
            Log.m105925i("SplashWelcomeView", "cannot find %s", this.f214667d);
        }
    }

    /* renamed from: com.tencent.mm.ui.SplashWelcomeView$b */
    public class C73147b implements Runnable {

        /* renamed from: com.tencent.mm.ui.SplashWelcomeView$b$a */
        public class C73148a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: d */
            public final /* synthetic */ ImageView f214670d;

            public C73148a(C73147b bVar, ImageView imageView) {
                this.f214670d = imageView;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f214670d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        }

        public C73147b() {
        }

        public void run() {
            Log.m105918d("SplashWelcomeView", "set top imageView");
            ImageView imageView = new ImageView(SplashWelcomeView.this.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(SplashWelcomeView.this.f214664g);
            imageView.setAlpha(0.0f);
            SplashWelcomeView.this.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1000);
            duration.addUpdateListener(new C73148a(this, imageView));
            duration.start();
            Log.m105924i("SplashWelcomeView", "start play animation");
        }
    }

    public SplashWelcomeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101555b(context);
    }

    /* renamed from: a */
    public final boolean mo101554a(SharedPreferences sharedPreferences) {
        this.f214666i = sharedPreferences.getInt("launch_fail_times", 0);
        int i = sharedPreferences.getInt("launch_last_status", 0);
        if (i == 1) {
            Log.m105924i("SplashWelcomeView", "last launch status is 'start'.");
            this.f214666i++;
            sharedPreferences.edit().putInt("launch_fail_times", this.f214666i).commit();
        } else if (i == 2) {
            Log.m105924i("SplashWelcomeView", "last launch status is 'end'.");
        }
        sharedPreferences.edit().putInt("launch_last_status", 1).apply();
        int i2 = this.f214666i;
        if (i2 < 3) {
            return true;
        }
        Log.m105925i("SplashWelcomeView", "launch exceed max failed times, %d", Integer.valueOf(i2));
        return false;
    }

    /* renamed from: b */
    public final void mo101555b(Context context) {
        SplashImageView splashImageView = new SplashImageView(context);
        this.f214665h = splashImageView;
        SplashImageView splashImageView2 = splashImageView;
        splashImageView.setOnDrawListener(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (MMApplicationContext.isMMProcess()) {
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0);
            try {
                boolean z = sharedPreferences.getBoolean("transit_to_switch_account", false);
                Log.m105925i("SplashWelcomeView", "transit to switch account %s", Boolean.valueOf(z));
                if (z) {
                    String str = C74928u.C30867e.f82897a;
                    byte[] O = C86013q1.m106433O(str, 0, (int) C86013q1.m106451l(str));
                    C86013q1.m106447h(str);
                    sharedPreferences.edit().putBoolean("transit_to_switch_account", false).commit();
                    if (O != null && O.length > 0) {
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(O, 0, O.length);
                        if (decodeByteArray != null) {
                            this.f214665h.setImageBitmap(decodeByteArray);
                            if (Build.VERSION.SDK_INT < 23 || C88956h.m111064e()) {
                                ((Activity) getContext()).getWindow().setStatusBarColor(C74933u4.m89765b(Color.parseColor("#33000000"), -1));
                            } else {
                                ((Activity) getContext()).getWindow().setStatusBarColor(-1);
                            }
                        } else {
                            Log.m105920e("SplashWelcomeView", "get switch account bg null!");
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("SplashWelcomeView", e, "show switch account view with exception!", new Object[0]);
            }
        }
        addView(this.f214665h, layoutParams);
        try {
            if (!MMApplicationContext.isMMProcess()) {
                Log.m105924i("SplashWelcomeView", "not main process, only load default splash bitmap.");
                return;
            }
            SharedPreferences sharedPreferences2 = MMApplicationContext.getContext().getSharedPreferences("system_config_prefs", 0);
            long j = sharedPreferences2.getLong("new_launch_image_begin_time", 0);
            long j2 = sharedPreferences2.getLong("new_launch_image_end_time", 0);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Log.m105925i("SplashWelcomeView", "beginTime:%s,endTime:%s,currentTime:%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(currentTimeMillis));
            String str2 = C112760b.m154225d() + "splashWelcomeImg";
            if (currentTimeMillis <= j || currentTimeMillis >= j2) {
                Log.m105924i("SplashWelcomeView", "change launch image activity is finished!");
                C86013q1.m106447h(str2);
            } else if (mo101554a(sharedPreferences2)) {
                ThreadPool.post(new C73146a(str2), "readWelcomeBg");
            }
        } catch (Exception e2) {
            Log.printErrStackTrace("SplashWelcomeView", e2, "%s", e2.getMessage());
        }
    }

    /* renamed from: c */
    public void mo101556c() {
        Log.m105925i("SplashWelcomeView", "hasDrawed:%s", Boolean.valueOf(this.f214661d));
        if (!this.f214661d) {
            this.f214661d = true;
            if (this.f214663f && !this.f214662e) {
                mo101557d();
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo101557d() {
        if (!this.f214662e) {
            this.f214662e = true;
            if (this.f214664g != null) {
                try {
                    MMHandlerThread.postToMainThread(new C73147b());
                } catch (Exception e) {
                    Log.printErrStackTrace("SplashWelcomeView", e, "%s", e.getMessage());
                }
            }
        }
        return;
    }

    public SplashWelcomeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101555b(context);
    }
}
