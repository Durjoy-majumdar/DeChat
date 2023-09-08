package com.tencent.p014mm.p136ui.halfscreen;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewPropertyAnimator;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditDialogFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.drawer.RecyclerViewDrawerSquares;
import do3.C75441a;
import fj3.C20713c;
import gy3.C87412m;
import java.io.Serializable;
import kotlin.Metadata;
import nj3.C88989a;
import rx3.C13605o;
import vo3.C90852c;
import zl3.C16296e;
import zl3.C79400b;
import zl3.C79401c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/halfscreen/HalfScreenTransparentActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(35)
@C90852c(0)
/* renamed from: com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity */
public class HalfScreenTransparentActivity extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f219857f = 0;

    /* renamed from: d */
    public MMHalfScreenDialogFragment f219858d;

    /* renamed from: e */
    public boolean f219859e;

    /* renamed from: com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity$a */
    public static final class C74765a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HalfScreenTransparentActivity f219860d;

        public C74765a(HalfScreenTransparentActivity halfScreenTransparentActivity) {
            this.f219860d = halfScreenTransparentActivity;
        }

        public final void run() {
            HalfScreenTransparentActivity halfScreenTransparentActivity = this.f219860d;
            int i = HalfScreenTransparentActivity.f219857f;
            halfScreenTransparentActivity.getClass();
            try {
                Bundle bundleExtra = halfScreenTransparentActivity.getIntent().getBundleExtra("INTENT_KEY_HALFSCREEN_BUNDLE");
                if (bundleExtra != null) {
                    String string = bundleExtra.getString("KEY_BUNDLE_ACTIVITY_CLS_NAME", "");
                    boolean z = bundleExtra.getBoolean("KEY_BUNDLE_ENABLE_PULL_DOWN_CLOSE", false);
                    Bundle bundle = bundleExtra.getBundle("KEY_BUNDLE_BUNDLE");
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    Serializable serializable = bundleExtra.getSerializable("KEY_BUNDLE_DIALOG_FRAGMENT_CLS");
                    C87412m.m108592e(serializable, "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment?>");
                    Intent intent = new Intent();
                    intent.putExtras(bundle);
                    MMHalfScreenDialogFragment mMHalfScreenDialogFragment = (MMHalfScreenDialogFragment) ((Class) serializable).getDeclaredConstructor(new Class[]{Context.class, Intent.class, String.class, RecyclerViewDrawerSquares.C45117c.class}).newInstance(new Object[]{halfScreenTransparentActivity.getContext(), intent, string, null});
                    if (mMHalfScreenDialogFragment != null) {
                        mMHalfScreenDialogFragment.f219873r = z;
                    }
                    if (mMHalfScreenDialogFragment != null) {
                        mMHalfScreenDialogFragment.show(halfScreenTransparentActivity.getSupportFragmentManager(), "halfScreenDialog");
                    }
                    if (mMHalfScreenDialogFragment != null) {
                        mMHalfScreenDialogFragment.f219876u = new C79401c(halfScreenTransparentActivity);
                    }
                    halfScreenTransparentActivity.f219858d = mMHalfScreenDialogFragment;
                }
            } catch (Exception e) {
                Log.m105921e("MMHalfScreen.TransparentActivity", "showHalfScreen: %s", e.toString());
            }
        }
    }

    public void finish() {
        Log.m105924i("MMHalfScreen.TransparentActivity", "finish() called hasCalledFinished:" + this.f219859e);
        MMHalfScreenDialogFragment mMHalfScreenDialogFragment = this.f219858d;
        if (mMHalfScreenDialogFragment != null) {
            Object[] objArr = new Object[2];
            boolean z = mMHalfScreenDialogFragment instanceof TextStatusEditDialogFragment;
            objArr[0] = Boolean.valueOf(z);
            Dialog dialog = mMHalfScreenDialogFragment.getDialog();
            objArr[1] = Boolean.valueOf(dialog != null ? dialog.isShowing() : false);
            Log.m105925i("MMHalfScreen.TransparentActivity", "finish() called isUseCustomDimen:%s isDialogShowing:%s", objArr);
            if (!z) {
                Dialog dialog2 = mMHalfScreenDialogFragment.getDialog();
                if (dialog2 != null ? dialog2.isShowing() : false) {
                    mMHalfScreenDialogFragment.dismiss();
                    return;
                }
            }
        }
        if (!this.f219859e) {
            this.f219859e = true;
            C13605o oVar = null;
            if (C75441a.f221748d) {
                C13605o oVar2 = new C13605o(Integer.valueOf(C75441a.f221745a), C75441a.f221746b, Integer.valueOf(C75441a.f221747c));
                C75441a.f221745a = 0;
                C75441a.f221746b = null;
                C75441a.f221747c = -1;
                C75441a.f221748d = false;
                oVar = oVar2;
            }
            if (oVar != null) {
                setResult(((Number) oVar.f38557d).intValue(), (Intent) oVar.f38558e);
            }
            MMHalfScreenDialogFragment mMHalfScreenDialogFragment2 = this.f219858d;
            if (mMHalfScreenDialogFragment2 == null) {
                return;
            }
            if (mMHalfScreenDialogFragment2 instanceof TextStatusEditDialogFragment) {
                C79400b bVar = new C79400b(this);
                ViewPropertyAnimator alpha = mMHalfScreenDialogFragment2.mo103945P().animate().alpha(0.0f);
                C20713c cVar = C20713c.f58572a;
                alpha.setInterpolator(cVar.mo32435a());
                alpha.setDuration(300);
                alpha.setListener(new C16296e(bVar, alpha));
                alpha.start();
                ViewPropertyAnimator translationY = mMHalfScreenDialogFragment2.mo103943L().animate().translationY((float) mMHalfScreenDialogFragment2.mo103943L().getMeasuredHeight());
                translationY.setDuration(300);
                translationY.setInterpolator(cVar.mo32435a());
                translationY.start();
                return;
            }
            super.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r4.supportRequestWindowFeature(r0)
            super.onCreate(r5)
            r5 = 0
            r4.setActionbarColor(r5)
            java.lang.String r0 = ""
            r4.setMMTitle((java.lang.String) r0)
            r4.hideActionbarLine()
            r4.hideActionBarOperationArea()
            androidx.appcompat.app.ActionBar r0 = r4.getSupportActionBar()
            if (r0 == 0) goto L_0x0020
            r0.mo91104o()
        L_0x0020:
            android.content.Intent r0 = r4.getIntent()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "INTENT_KEY_HALFSCREEN_BUNDLE"
            android.os.Bundle r0 = r0.getBundleExtra(r1)     // Catch:{ all -> 0x0034 }
            if (r0 != 0) goto L_0x002d
            goto L_0x003e
        L_0x002d:
            java.lang.String r1 = "KEY_TRANSPARENT_NAVIGATIONBAR"
            boolean r0 = r0.getBoolean(r1, r5)     // Catch:{ all -> 0x0034 }
            goto L_0x003f
        L_0x0034:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "MMHalfScreen.TransparentActivity"
            java.lang.String r3 = "isNavigationBarTransparent err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x005b
            android.view.Window r0 = r4.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            gy3.C87412m.m108593f(r0, r1)
            r1 = 1792(0x700, float:2.511E-42)
            r0.setSystemUiVisibility(r1)
            android.view.Window r0 = r4.getWindow()
            r0.setNavigationBarColor(r5)
        L_0x005b:
            android.view.View r5 = r4.getContentView()
            com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity$a r0 = new com.tencent.mm.ui.halfscreen.HalfScreenTransparentActivity$a
            r0.<init>(r4)
            r5.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.halfscreen.HalfScreenTransparentActivity.onCreate(android.os.Bundle):void");
    }
}
