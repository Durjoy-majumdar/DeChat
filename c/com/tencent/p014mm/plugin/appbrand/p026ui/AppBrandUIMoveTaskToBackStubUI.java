package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.C81820e3;
import com.tencent.p014mm.plugin.appbrand.utils.C84767n0;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import gy3.C87412m;
import in3.C46279a;
import in3.C87763b;
import in3.C87771d;
import kotlin.Metadata;
import p170ic.C87687a;
import rx3.C13598b0;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandUIMoveTaskToBackStubUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI */
public class AppBrandUIMoveTaskToBackStubUI extends MMActivity {

    /* renamed from: g */
    public static final C84460a f246524g = new C84460a((C8480h) null);

    /* renamed from: h */
    public static final SparseArray<Bitmap> f246525h = new SparseArray<>();

    /* renamed from: i */
    public static final SparseArray<AppBrandUI> f246526i = new SparseArray<>();

    /* renamed from: j */
    public static final ArraySet<AppBrandUIMoveTaskToBackStubUI> f246527j = new ArraySet<>();

    /* renamed from: d */
    public final Runnable f246528d = new C84462b(this);

    /* renamed from: e */
    public AppBrandUI f246529e;

    /* renamed from: f */
    public C84460a.C84461a f246530f = C84460a.C84461a.Undefined;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI$a */
    public static final class C84460a {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI$a$a */
        public enum C84461a {
            Undefined,
            MoveTaskToBack,
            Finish
        }

        public C84460a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo117143a() {
            for (AppBrandUIMoveTaskToBackStubUI H7 : AppBrandUIMoveTaskToBackStubUI.f246527j) {
                H7.mo117140H7();
            }
            AppBrandUIMoveTaskToBackStubUI.f246527j.clear();
        }

        /* renamed from: b */
        public final boolean mo117144b(Activity activity) {
            C87412m.m108594g(activity, "<this>");
            int requestedOrientation = activity.getRequestedOrientation();
            if (requestedOrientation == -1) {
                return 1 == activity.getResources().getConfiguration().orientation;
            }
            if (requestedOrientation != 1) {
                return false;
            }
        }

        /* renamed from: c */
        public final boolean mo117145c(AppBrandUI appBrandUI, C84461a aVar) {
            Class cls;
            Bitmap e1;
            String processName = MMApplicationContext.getProcessName();
            C87412m.m108593f(processName, "getProcessName()");
            if (C112551y.m153808h(processName, ":appbrand4", false, 2, (Object) null)) {
                cls = AppBrandUIMoveTaskToBackStubUI4.class;
            } else if (C112551y.m153808h(processName, ":appbrand3", false, 2, (Object) null)) {
                cls = AppBrandUIMoveTaskToBackStubUI3.class;
            } else if (C112551y.m153808h(processName, ":appbrand2", false, 2, (Object) null)) {
                cls = AppBrandUIMoveTaskToBackStubUI2.class;
            } else if (C112551y.m153808h(processName, ":appbrand1", false, 2, (Object) null)) {
                cls = AppBrandUIMoveTaskToBackStubUI1.class;
            } else {
                if (C112551y.m153808h(processName, ":appbrand0", false, 2, (Object) null)) {
                    cls = AppBrandUIMoveTaskToBackStubUI0.class;
                }
                return false;
            }
            C81820e3 a8 = appBrandUI.mo117110a8();
            AppBrandRuntime activeRuntime = a8 != null ? a8.getActiveRuntime() : null;
            AppBrandRuntimeWC appBrandRuntimeWC = activeRuntime instanceof AppBrandRuntimeWC ? (AppBrandRuntimeWC) activeRuntime : null;
            if (appBrandRuntimeWC != null && (e1 = appBrandRuntimeWC.mo121249e1()) != null && !e1.isRecycled() && e1.getWidth() > 0 && e1.getHeight() > 0) {
                int hashCode = appBrandUI.hashCode();
                AppBrandUIMoveTaskToBackStubUI.f246525h.put(hashCode, e1);
                AppBrandUIMoveTaskToBackStubUI.f246526i.put(hashCode, appBrandUI);
                Intent addFlags = new Intent(appBrandUI, cls).addFlags(268435456);
                addFlags.putExtra("KEY_LIGHT_STATUS_BAR_BOOL", C84545i3.m104135l(appBrandUI.getWindow()));
                addFlags.putExtra("KEY_NAVIGATION_BAR_COLOR_INT", appBrandUI.getWindow().getNavigationBarColor());
                addFlags.putExtra("KEY_FULLSCREEN_BOOL", C84545i3.m104132i(appBrandUI));
                addFlags.putExtra("KEY_REQUESTED_ORIENTATION_INT", appBrandUI.getRequestedOrientation());
                addFlags.putExtra("KEY_ACTIVITY_HASH_INT", hashCode);
                addFlags.putExtra("KEY_WORKAROUND_SCENE", aVar.ordinal());
                appBrandUI.mo117122o8(addFlags, -1, (Bundle) null);
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI$b */
    public static final class C84462b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandUIMoveTaskToBackStubUI f246535d;

        public C84462b(AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI) {
            this.f246535d = appBrandUIMoveTaskToBackStubUI;
        }

        public final void run() {
            Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finishFallbackTimerTask.run(), isFinishing:" + this.f246535d.isFinishing());
            this.f246535d.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandUIMoveTaskToBackStubUI$c */
    public static final class C84463c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ View f246536d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandUIMoveTaskToBackStubUI f246537e;

        public C84463c(View view, AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI) {
            this.f246536d = view;
            this.f246537e = appBrandUIMoveTaskToBackStubUI;
        }

        public boolean onPreDraw() {
            this.f246536d.getViewTreeObserver().removeOnPreDrawListener(this);
            AppBrandUIMoveTaskToBackStubUI appBrandUIMoveTaskToBackStubUI = this.f246537e;
            C84460a aVar = AppBrandUIMoveTaskToBackStubUI.f246524g;
            appBrandUIMoveTaskToBackStubUI.getContentView().postDelayed(this.f246537e.f246528d, 300);
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo117140H7() {
        if (!isFinishing() && !isDestroyed()) {
            Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finishDirectly");
            super.finish();
            overridePendingTransition(0, 0);
        }
    }

    public void finish() {
        AppBrandUI appBrandUI;
        if (!isFinishing() && !isDestroyed()) {
            Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "finish");
            int ordinal = this.f246530f.ordinal();
            if (ordinal == 1) {
                AppBrandUI appBrandUI2 = this.f246529e;
                if (appBrandUI2 != null) {
                    appBrandUI2.mo117121n8(false);
                }
            } else if (ordinal == 2 && (appBrandUI = this.f246529e) != null) {
                appBrandUI.mo117104O7();
            }
            super.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void initActivityCloseAnimation() {
        overridePendingTransition((f246524g.mo117144b(this) || C84583r2.m104180b()) ? C0966R.C0968anim.f2350ae : C0966R.C0968anim.f2333y, C0966R.C0968anim.f2351af);
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
        C13598b0 b0Var;
        C84460a.C84461a aVar = C84460a.C84461a.Undefined;
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean z = true;
        if (intent == null || !intent.hasExtra("KEY_ACTIVITY_HASH_INT")) {
            z = false;
        }
        if (z) {
            try {
                Intent intent2 = getIntent();
                C87412m.m108591d(intent2);
                int intExtra = intent2.getIntExtra("KEY_ACTIVITY_HASH_INT", 0);
                AppBrandUI appBrandUI = (AppBrandUI) C84767n0.m104424a(f246526i, intExtra);
                if (appBrandUI != null) {
                    this.f246529e = appBrandUI;
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    finish();
                    return;
                }
                Bitmap bitmap = (Bitmap) C84767n0.m104424a(f246525h, intExtra);
                if (bitmap == null || bitmap.isRecycled()) {
                    finish();
                    return;
                }
                int intExtra2 = IntentUtil.getIntExtra(getIntent(), "KEY_WORKAROUND_SCENE", 0);
                this.f246530f = aVar;
                for (C84460a.C84461a aVar2 : C84460a.C84461a.values()) {
                    if (aVar2.ordinal() == intExtra2) {
                        this.f246530f = aVar2;
                    }
                }
                if (aVar == this.f246530f) {
                    finish();
                    return;
                }
                setNavigationbarColor(IntentUtil.getIntExtra(getIntent(), "KEY_NAVIGATION_BAR_COLOR_INT", getWindow().getNavigationBarColor()));
                f246527j.add(this);
                setMMOrientation();
                C84545i3.m104129f(this, IntentUtil.getBooleanExtra(getIntent(), "KEY_FULLSCREEN_BOOL", false));
                View contentView = getContentView();
                contentView.setBackground(new BitmapDrawable(contentView.getResources(), bitmap));
                contentView.setWillNotDraw(false);
                View contentView2 = getContentView();
                C87412m.m108593f(contentView2, "contentView");
                contentView2.getViewTreeObserver().addOnPreDrawListener(new C84463c(contentView2, this));
                C46279a.m51577a(getContentView(), 0, IntentUtil.getBooleanExtra(getIntent(), "KEY_LIGHT_STATUS_BAR_BOOL", false));
            } catch (Exception unused) {
                finish();
            }
        } else {
            finish();
        }
    }

    public void onCreateBeforeSetContentView() {
        WindowManager.LayoutParams attributes;
        Window window = getWindow();
        if (!(window == null || (attributes = window.getAttributes()) == null)) {
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        super.onCreateBeforeSetContentView();
        setTheme(C0966R.style.f8227f5);
        C87687a.m109086b(this, 10);
        C87687a.m109086b(this, 1);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(3);
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onDestroy");
        super.onDestroy();
        f246527j.remove(this);
        getContentView().removeCallbacks(this.f246528d);
        Drawable background = getContentView().getBackground();
        BitmapDrawable bitmapDrawable = background instanceof BitmapDrawable ? (BitmapDrawable) background : null;
        Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
        getContentView().setBackground((Drawable) null);
        if (bitmap != null) {
            bitmap.recycle();
        }
        C87771d c = C87771d.m109204c(this);
        if (c != null) {
            c.mo122179a();
        }
        this.f246529e = null;
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onEnterAnimationComplete");
        finish();
    }

    public void onPause() {
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onPause");
        super.onPause();
    }

    public void onResume() {
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onResume");
        super.onResume();
    }

    public void onStart() {
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onStart");
        super.onStart();
    }

    public void onStop() {
        Log.m105924i("MicroMsg.AppBrandUIMoveTaskToBackStubUI", "onStop");
        super.onStop();
        finish();
    }

    public View provideCustomActivityContentView() {
        return new C87763b(this);
    }

    public void setMMOrientation() {
        setRequestedOrientation(IntentUtil.getIntExtra(getIntent(), "KEY_REQUESTED_ORIENTATION_INT", 1));
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
