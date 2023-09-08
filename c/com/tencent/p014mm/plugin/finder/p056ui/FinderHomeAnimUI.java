package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeAnimUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI */
public final class FinderHomeAnimUI extends MMActivity {

    /* renamed from: e */
    public static Bitmap f16889e;

    /* renamed from: d */
    public final Runnable f16890d = new C3669b(this);

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI$a */
    public static final class C3668a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeAnimUI f16891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3668a(FinderHomeAnimUI finderHomeAnimUI) {
            super(0);
            this.f16891d = finderHomeAnimUI;
        }

        public Object invoke() {
            FinderHomeAnimUI.super.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI$b */
    public static final class C3669b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeAnimUI f16892d;

        public C3669b(FinderHomeAnimUI finderHomeAnimUI) {
            this.f16892d = finderHomeAnimUI;
        }

        public final void run() {
            Log.m105924i("FinderHomeAnimUI", "finishFallbackTimerTask, isFinishing:" + this.f16892d.isFinishing());
            if (!this.f16892d.isFinishing()) {
                this.f16892d.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI$c */
    public static final class C3670c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ View f16893d;

        /* renamed from: e */
        public final /* synthetic */ FinderHomeAnimUI f16894e;

        public C3670c(View view, FinderHomeAnimUI finderHomeAnimUI) {
            this.f16893d = view;
            this.f16894e = finderHomeAnimUI;
        }

        public boolean onPreDraw() {
            this.f16893d.getViewTreeObserver().removeOnPreDrawListener(this);
            FinderHomeAnimUI finderHomeAnimUI = this.f16894e;
            Bitmap bitmap = FinderHomeAnimUI.f16889e;
            finderHomeAnimUI.getContentView().postDelayed(this.f16894e.f16890d, 300);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r11 = this;
            java.lang.String r0 = "FinderHomeAnimUI"
            java.lang.String r1 = "finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r2 = "KEY_ROUTER_LAUNCHER"
            r3 = -1
            int r1 = r1.getIntExtra(r2, r3)
            r2 = 2130772185(0x7f0100d9, float:1.7147481E38)
            r3 = 2130772175(0x7f0100cf, float:1.714746E38)
            java.lang.String r4 = ".ui.LauncherUI"
            r5 = 0
            java.lang.String r6 = "preferred_tab"
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = 2
            r9 = 0
            r10 = 1
            if (r1 == r10) goto L_0x0042
            if (r1 == r8) goto L_0x002a
            super.finish()
            goto L_0x005f
        L_0x002a:
            java.lang.String r1 = "routeToMainPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.addFlags(r7)
            r0.putExtra(r6, r9)
            ke3.C88144b.m109801s(r11, r4, r0, r5)
            r11.overridePendingTransition(r3, r2)
            goto L_0x005e
        L_0x0042:
            java.lang.String r1 = "routeToFindPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.addFlags(r7)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            r0.putExtra(r6, r8)
            ke3.C88144b.m109801s(r11, r4, r0, r5)
            r11.overridePendingTransition(r3, r2)
        L_0x005e:
            r9 = 1
        L_0x005f:
            if (r9 == 0) goto L_0x006b
            r0 = 0
            com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI$a r2 = new com.tencent.mm.plugin.finder.ui.FinderHomeAnimUI$a
            r2.<init>(r11)
            o40.C61926c.m72666K(r0, r2)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAnimUI.finish():void");
    }

    public int getLayoutId() {
        return -1;
    }

    public void initActivityCloseAnimation() {
        if (C85875k4.m106208w()) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
        }
    }

    public void initActivityOpenAnimation(Intent intent) {
        overridePendingTransition(0, 0);
    }

    public boolean initNavigationSwipeBack() {
        return false;
    }

    public boolean isSupportNavigationSwipeBack() {
        return false;
    }

    public boolean needResetStatusBarColorOnActivityCreate() {
        return false;
    }

    public boolean noActionBar() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("FinderHomeAnimUI", "onCreate");
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        if (f16889e == null) {
            Log.m105920e("FinderHomeAnimUI", "onCreate: finderHomeSnapshot is null");
            finish();
            return;
        }
        View contentView = getContentView();
        contentView.setBackground(new BitmapDrawable(contentView.getResources(), f16889e));
        contentView.setWillNotDraw(false);
        View contentView2 = getContentView();
        C87412m.m108593f(contentView2, "contentView");
        contentView2.getViewTreeObserver().addOnPreDrawListener(new C3670c(contentView2, this));
    }

    public void onCreateBeforeSetContentView() {
        setTheme(C0966R.style.a3a);
    }

    public void onDestroy() {
        Log.m105924i("FinderHomeAnimUI", "onDestroy");
        super.onDestroy();
        getContentView().removeCallbacks(this.f16890d);
        getContentView().setBackground((Drawable) null);
        f16889e = null;
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        Log.m105924i("FinderHomeAnimUI", "onEnterAnimationComplete");
        finish();
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
