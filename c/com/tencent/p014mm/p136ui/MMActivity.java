package com.tencent.p014mm.p136ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import bp3.C79758p;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C106741c;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.widget.AlbumChooserView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84963i1;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import go3.C116982a;
import go3.C116983b;
import go3.C76004e;
import in3.C87763b;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lg3.C88494d;
import lg3.C88496e;
import lg3.C88497f;
import lg3.C88506m;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import p1042u.C111055b;
import p206nj.C76862i;
import p977hj.C87527b;
import qo3.C77393e;
import sn0.C90259e;
import tf3.C110979n;
import vo3.C78461f;
import xi3.C15709j;

@C88989a(0)
/* renamed from: com.tencent.mm.ui.MMActivity */
public abstract class MMActivity extends MMFragmentActivity implements C84963i1, C77393e, C76879j.C76887m {
    private static final int ANDROID_API_LEVEL_11 = 11;
    public static final int DEFAULT_TOAST_TIME = 3000;
    public static final String FLAG_OVERRIDE_ENTER_ANIMATION = "MMActivity.OverrideEnterAnimation";
    public static final String FLAG_OVERRIDE_EXIT_ANIMATION = "MMActivity.OverrideExitAnimation";
    private static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";
    private static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
    private static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";
    private static final String TAG = "MicroMsg.MMActivity";
    private static final String TAG2 = "MicroMsg.INIT";
    private static String sNavBarOverride;
    private byte _hellAccFlag_;
    public String className;
    private Resources customResources;
    public boolean customfixStatusbar = false;
    public boolean fixStatusbar = false;
    private GestureDetector gestureDetector;
    public boolean landscapeMode = false;
    private long lastBrowseTime = 0;
    private long lastOnPauseTicks = 0;
    private long lastOnResumeTicks = 0;
    private Resources mBaseResources;
    private final Map<C44688e, Object> mConfigChangedListeners = new C111055b();
    public MMActivityController mController = new C116036a();
    private Resources mForceBaseResources;
    private Resources mForceNewResources;
    private Resources mForceOldResources;
    private boolean mIsPaused = false;
    private boolean mIsStopped = false;
    private Resources mNewResources;
    private Resources mOldResources;
    private View mSelfNavigationBar;
    public ViewGroup mWrappingFrame = null;
    private C6739d onActResult = null;
    public boolean transparentTheme = false;
    private boolean updateForceResource = false;
    private boolean updateNewResource = false;
    private boolean updateResource = false;

    /* renamed from: com.tencent.mm.ui.MMActivity$c */
    public class C6738c implements Runnable {
        public C6738c() {
        }

        public void run() {
            MMActivity mMActivity = MMActivity.this;
            Intent intent = mMActivity.getIntent();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity, "com/tencent/mm/ui/MMActivity$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivity$d */
    public interface C6739d {
        void mmOnActivityResult(int i, int i2, Intent intent);
    }

    /* renamed from: com.tencent.mm.ui.MMActivity$b */
    public class C44687b extends GestureDetector.SimpleOnGestureListener {
        public C44687b() {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (Math.abs(f2) > 0.0f) {
                MMActivity.this.hideVKB();
            }
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
            C117292a.m165362h(onSingleTapUp, this, "com/tencent/mm/ui/MMActivity$2", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return onSingleTapUp;
        }
    }

    /* renamed from: com.tencent.mm.ui.MMActivity$e */
    public interface C44688e {
        void onConfigurationChanged(Configuration configuration);
    }

    /* renamed from: com.tencent.mm.ui.MMActivity$a */
    public class C116036a extends MMActivityController {
        public C116036a() {
        }

        /* renamed from: M */
        public boolean mo177018M() {
            return MMActivity.this.isActionbarCenterLayoutMode();
        }

        /* renamed from: N */
        public boolean mo177019N() {
            return MMActivity.this.isActionbarMenuUseOriginalSys();
        }

        /* renamed from: O */
        public boolean mo177020O() {
            return false;
        }

        /* renamed from: R */
        public boolean mo177021R() {
            return MMActivity.this.isLayoutInDecorView();
        }

        /* renamed from: V */
        public boolean mo177022V() {
            return MMActivity.this.needResetStatusBarColorOnActivityCreate();
        }

        /* renamed from: W */
        public boolean mo177023W() {
            return MMActivity.this.needShowIdcError();
        }

        /* renamed from: X */
        public boolean mo177024X() {
            return MMActivity.this.noActionBar();
        }

        /* renamed from: Z */
        public void mo177025Z() {
            MMActivity.this.onCreateBeforeSetContentView();
        }

        /* renamed from: c0 */
        public void mo177026c0() {
            MMActivity.this.onKeyboardStateChanged();
        }

        /* renamed from: g0 */
        public View mo177027g0() {
            return MMActivity.this.provideCustomActivityContentView();
        }

        /* renamed from: k */
        public void mo177028k(View view) {
            MMActivity.this.dealContentView(view);
        }

        /* renamed from: o */
        public boolean mo177029o() {
            return MMActivity.this.fromFullScreenActivity();
        }

        /* renamed from: r */
        public String mo177030r() {
            return MMActivity.this.getClass().getName();
        }

        /* renamed from: u */
        public int mo177031u() {
            return MMActivity.this.getCustomBounceId();
        }

        /* renamed from: x */
        public String mo177032x() {
            return MMActivity.this.getIdentString();
        }

        /* renamed from: y */
        public int mo177033y() {
            int layoutId = MMActivity.this.getLayoutId();
            return layoutId == 0 ? MMActivity.this.getLayoutUIC().getLayoutId() : layoutId;
        }

        /* renamed from: z */
        public View mo177034z() {
            return MMActivity.this.getLayoutView();
        }
    }

    static {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            sNavBarOverride = (String) declaredMethod.invoke((Object) null, new Object[]{"qemu.hw.mainkeys"});
        } catch (Throwable unused) {
            sNavBarOverride = null;
        }
    }

    private int getInternalDimensionSize(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, "dimen", Platform.ANDROID);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void handleVKBInit() {
        if (isHideVKBWhenScroll()) {
            this.gestureDetector = new GestureDetector(this, new C44687b());
        }
    }

    public static Locale initLanguage(Context context) {
        return MMActivityController.m163188J(context);
    }

    private void noteOnPauseTicks() {
        this.lastOnPauseTicks = Util.currentTicks();
    }

    private void noteOnResumeTicks() {
        long j = this.lastOnPauseTicks;
        long j2 = this.lastOnResumeTicks;
        if (j > j2) {
            this.lastBrowseTime += j - j2;
        }
        this.lastOnResumeTicks = Util.currentTicks();
        this.lastOnPauseTicks = 0;
    }

    private void recreateSelf() {
        finish();
        overridePendingTransition(0, 0);
        MMHandlerThread.postToMainThreadDelayed(new C6738c(), 50);
    }

    public static void setMainProcess() {
        MMActivityController.f348057p0 = true;
    }

    /* renamed from: $ */
    public <T> T mo176895$(int i) {
        return findViewById(i);
    }

    public void activateBroadcast(boolean z) {
        this.mController.mo177069d(z);
    }

    @Deprecated
    public boolean activityHasDestroyed() {
        return isDestroyed();
    }

    public void addDialog(Dialog dialog) {
        MMActivityController mMActivityController = this.mController;
        if (dialog == null) {
            mMActivityController.getClass();
            return;
        }
        if (mMActivityController.f348064E == null) {
            mMActivityController.f348064E = new ArrayList<>();
        }
        mMActivityController.f348064E.add(dialog);
    }

    public void addIconOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177076h(i, i2, "", false, onMenuItemClickListener, (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
    }

    public void addOnConfigurationChangedListener(C44688e eVar) {
        if (eVar != null) {
            this.mConfigChangedListeners.put(eVar, this);
        }
    }

    public void addSearchMenu(boolean z, C106742j1 j1Var) {
        this.mController.mo177078i(z, j1Var);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177076h(i, 0, str, false, onMenuItemClickListener, (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C76862i.f224685a.mo107120c(this);
    }

    public boolean callBackMenu() {
        MMActivityController mMActivityController = this.mController;
        MMActivityController.C116044q qVar = mMActivityController.f348061B;
        if (qVar == null || !qVar.f348144e) {
            return false;
        }
        mMActivityController.mo177080j((MenuItem) null, qVar);
        return true;
    }

    @Deprecated
    public void customfixStatusbar(boolean z) {
        this.customfixStatusbar = z;
    }

    public void dealContentView(View view) {
        setContentView(view);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector2 = this.gestureDetector;
        if (gestureDetector2 != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector2, gestureDetector2.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/MMActivity", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void enableBackMenu(boolean z) {
        MMActivityController mMActivityController = this.mController;
        MMActivityController.C116044q qVar = mMActivityController.f348061B;
        if (qVar != null && qVar.f348144e != z) {
            qVar.f348144e = z;
            mMActivityController.mo177047G0();
        }
    }

    public void enableOptionMenu(boolean z) {
        this.mController.mo177083l(true, -1, z);
    }

    public void expendActionbar() {
        int i;
        int i2;
        MMActivityController mMActivityController = this.mController;
        if (!mMActivityController.mo177024X() && (i = mMActivityController.f348113n0) < (i2 = mMActivityController.f348081V)) {
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{i, i2}).setDuration(200);
            duration.addUpdateListener(new C74799n1(mMActivityController));
            duration.start();
        }
    }

    public void finish() {
        super.finish();
        int intExtra = IntentUtil.getIntExtra(getIntent(), "MMActivity.OverrideEnterAnimation", -1);
        int intExtra2 = IntentUtil.getIntExtra(getIntent(), "MMActivity.OverrideExitAnimation", -1);
        if (intExtra != -1) {
            super.overridePendingTransition(intExtra, intExtra2);
        }
    }

    @Deprecated
    public void fixStatusbar(boolean z) {
        this.fixStatusbar = z;
    }

    public boolean fromFullScreenActivity() {
        return false;
    }

    public void fullScreenNoTitleBar(boolean z) {
        this.mController.mo177089p(z);
    }

    public void fullScreenWithTitleBar(boolean z) {
        MMActivityController mMActivityController = this.mController;
        if (z) {
            mMActivityController.f348119s.getWindow().setFlags(1024, 1024);
        } else {
            mMActivityController.f348119s.getWindow().clearFlags(1024);
        }
    }

    public int getActionbarColor() {
        return this.mController.mo177091q();
    }

    public long getActivityBrowseTimeMs() {
        long j;
        long j2;
        long j3 = this.lastOnPauseTicks;
        if (j3 != 0) {
            j2 = j3 - this.lastOnResumeTicks;
            j = this.lastBrowseTime;
        } else {
            j2 = Util.currentTicks() - this.lastOnResumeTicks;
            j = this.lastBrowseTime;
        }
        long j4 = j2 + j;
        if (j4 < 0) {
            Log.m105929w(TAG, "%d get activity browse time is error, may be something warn here.[%d %d %d %d]", Integer.valueOf(hashCode()), Long.valueOf(j4), Long.valueOf(this.lastOnResumeTicks), Long.valueOf(this.lastOnPauseTicks), Long.valueOf(this.lastBrowseTime));
        }
        Log.m105927v(TAG, "%d get activity browse time [%d]", Integer.valueOf(hashCode()), Long.valueOf(j4));
        return j4;
    }

    public View getBodyView() {
        return this.mController.f348088b;
    }

    public C78461f getBounceView() {
        return this.mController.f348121u;
    }

    public String getCallerPackage() {
        String str;
        Uri referrer;
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity != null) {
            str = callingActivity.getPackageName();
            Log.m105925i(TAG, "get calling activity, %s", str);
        } else {
            str = "";
        }
        if (Util.isNullOrNil(str) && Build.VERSION.SDK_INT >= 22) {
            try {
                Object a = new C87527b(this, "mReferrer", (String) null).mo121998a();
                if (a != null) {
                    str = (String) a;
                }
                Log.m105925i(TAG, "get referrer, %s", str);
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "get mReferrer error", new Object[0]);
            }
        }
        if (!Util.isNullOrNil(str) || Build.VERSION.SDK_INT < 22 || (referrer = getReferrer()) == null) {
            return str;
        }
        String authority = referrer.getAuthority();
        Log.m105925i(TAG, "get referrer, %s", authority);
        return authority;
    }

    public final View getContentView() {
        return this.mController.mo177094s();
    }

    public AppCompatActivity getContext() {
        return this.mController.mo177096t();
    }

    public MMActivityController getController() {
        return this.mController;
    }

    public int getCurrentActionbarHeight() {
        return this.mController.f348113n0;
    }

    public int getCustomBounceId() {
        return -1;
    }

    public int getForceOrientation() {
        return -1;
    }

    public int getForceUIMode() {
        return 0;
    }

    public Activity getHostActivity() {
        return this;
    }

    public String getIdentString() {
        return "";
    }

    public abstract int getLayoutId();

    public View getLayoutView() {
        return null;
    }

    public TextView getMMSubTitle() {
        return this.mController.f348072M;
    }

    public CharSequence getMMTitle() {
        MMActivityController mMActivityController = this.mController;
        ActionBar actionBar = mMActivityController.f348065F;
        if (actionBar == null) {
            return null;
        }
        String str = mMActivityController.f348104j;
        return str != null ? str : actionBar.mo91103n();
    }

    public TextView getMMTitleView() {
        return this.mController.f348066G;
    }

    public WeImageView getMabBackBtn() {
        return this.mController.f348069J;
    }

    public C76874e0 getMenu() {
        C106741c cVar = this.mController.f348063D;
        if (cVar == null || !cVar.f319109c) {
            return null;
        }
        return cVar.f319110d;
    }

    public Resources getResources() {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Log.printInfoStack(TAG, "no base context!!", new Object[0]);
            return super.getResources();
        } else if (getForceUIMode() != 0) {
            if (!this.updateNewResource || this.mNewResources == null) {
                this.mBaseResources = baseContext.getResources();
                this.mOldResources = super.getResources();
                this.mBaseResources.getConfiguration().updateFrom(this.mOldResources.getConfiguration());
                this.mNewResources = new C88506m(this.mBaseResources, getForceUIMode(), C88494d.m110348d());
                this.updateNewResource = true;
            }
            return this.mNewResources;
        } else {
            if (!this.updateResource || this.customResources == null) {
                Resources resources = baseContext.getResources();
                Resources resources2 = super.getResources();
                this.customResources = resources2;
                if ((resources2 instanceof C88496e) && resources != null) {
                    C88496e eVar = (C88496e) resources2;
                    Configuration b = eVar.f255632e.mo122940b(resources.getConfiguration());
                    C88497f.m110370c(b, C85875k4.m106145B(this.customResources));
                    eVar.getConfiguration().updateFrom(b);
                    this.customResources = eVar;
                    this.updateResource = true;
                }
            }
            return this.customResources;
        }
    }

    public int getStatusBarHeight(int i) {
        ViewGroup viewGroup = this.mWrappingFrame;
        return viewGroup instanceof C87763b ? ((C87763b) viewGroup).getDrawnStatusBarHeight() : C75044y4.m89995g(this, i);
    }

    public int getStreamMaxVolume(int i) {
        return this.mController.f348100h.getStreamMaxVolume(i);
    }

    public int getStreamVolume(int i) {
        return this.mController.f348100h.getStreamVolume(i);
    }

    public ActionBar getSupportActionBar() {
        return C76004e.m91288N(super.getSupportActionBar());
    }

    public int getTitleLocation() {
        ActionBar actionBar = this.mController.f348065F;
        if (actionBar == null) {
            return 0;
        }
        return actionBar.mo91101l();
    }

    public void hideActionBarOperationArea() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            mMActivityController.mo177039C();
        }
    }

    public void hideActionbarLine() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.mo177037B() != null) {
            mMActivityController.mo177037B().mo91089G(0.0f);
        }
    }

    public void hideAllManagedDialogs() {
        this.mController.mo177041D();
    }

    public void hideTitleView() {
        this.mController.mo177043E();
    }

    public void hideVKB() {
        this.mController.mo177045F();
    }

    public boolean hideVKBHavingResult() {
        return this.mController.mo177045F();
    }

    public void initActionBarOperationArea() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            View view = mMActivityController.f348083X;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = mMActivityController.f348067H;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/MMActivityController", "initActionBarOperationArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void initActionBarOperationAreaTxt(String str) {
        AlbumChooserView albumChooserView;
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null && (albumChooserView = mMActivityController.f348084Y) != null) {
            albumChooserView.f348674d.setText(str);
        }
    }

    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() != null && getSwipeBackLayout().getChildCount() > 0) {
            View childAt = getSwipeBackLayout().getChildAt(0);
            getSwipeBackLayout().removeView(childAt);
            if (this.fixStatusbar) {
                this.mWrappingFrame = new C87763b(this);
            } else {
                this.mWrappingFrame = new FrameLayout(this);
            }
            this.mWrappingFrame.addView(childAt, new FrameLayout.LayoutParams(-1, -1));
            getSwipeBackLayout().addView(this.mWrappingFrame);
            getSwipeBackLayout().setContentView(this.mWrappingFrame);
        }
    }

    @Deprecated
    public void initView() {
    }

    public boolean isActionbarCenterLayoutMode() {
        return true;
    }

    public boolean isActionbarMenuUseOriginalSys() {
        return false;
    }

    public boolean isForceFixStatusBar() {
        return false;
    }

    public boolean isHideVKBWhenScroll() {
        return false;
    }

    public boolean isLayoutInDecorView() {
        return false;
    }

    public boolean isOptionMenuEnable(int i) {
        Iterator<MMActivityController.C116044q> it = this.mController.f348062C.iterator();
        while (it.hasNext()) {
            MMActivityController.C116044q next = it.next();
            if (next.f348140a == i) {
                return next.f348144e;
            }
        }
        return false;
    }

    public boolean isOptionMenuShow(int i) {
        Iterator<MMActivityController.C116044q> it = this.mController.f348062C.iterator();
        while (it.hasNext()) {
            MMActivityController.C116044q next = it.next();
            if (next.f348140a == i) {
                return next.f348145f;
            }
        }
        return false;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isScreenEnable() {
        return this.mController.f348102i;
    }

    public boolean isShowDialog() {
        ArrayList<Dialog> arrayList = this.mController.f348064E;
        if (arrayList == null) {
            return false;
        }
        Iterator<Dialog> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().isShowing()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSingleTitleView() {
        MMActivityController mMActivityController = this.mController;
        ActionBar actionBar = mMActivityController.f348065F;
        return (actionBar == null || actionBar.mo91099j() == null || mMActivityController.f348065F.mo91099j().findViewById(C0966R.C0970id.f5387ds) == null) ? false : true;
    }

    public boolean isStopped() {
        return this.mIsStopped;
    }

    public boolean isTitleShowing() {
        return this.mController.mo177063S();
    }

    public int keyboardState() {
        return this.mController.f348099g0;
    }

    public void mmSetOnActivityResultCallback(C6739d dVar) {
        this.onActResult = dVar;
    }

    public void mmStartActivityForResult(C6739d dVar, Intent intent, int i) {
        this.onActResult = dVar;
        startActivityForResult(intent, i);
    }

    public boolean needResetStatusBarColorOnActivityCreate() {
        return true;
    }

    public boolean needShowIdcError() {
        return true;
    }

    public boolean noActionBar() {
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C6739d dVar = this.onActResult;
        if (dVar != null) {
            dVar.mmOnActivityResult(i, i2, intent);
        }
        this.onActResult = null;
    }

    public void onBusinessPermissionDenied(String str) {
        finish();
    }

    public void onBusinessPermissionGranted(String str) {
        if (getCallingActivity() == null) {
            recreateSelf();
        } else {
            recreate();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.mConfigChangedListeners.isEmpty()) {
            for (C44688e onConfigurationChanged : (C44688e[]) this.mConfigChangedListeners.keySet().toArray(new C44688e[this.mConfigChangedListeners.size()])) {
                onConfigurationChanged.onConfigurationChanged(configuration);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (!this.customfixStatusbar) {
            this.fixStatusbar = true;
        }
        getController().f348095e0 = C0966R.C0971layout.f6311bc;
        super.onCreate(bundle);
        if (isHideStatusBar() && !isForceFixStatusBar()) {
            this.fixStatusbar = false;
        }
        this.mController.mo177065Y(getApplicationContext(), this);
        initNavigationSwipeBack();
        if (!noActionBar()) {
            setActionbarColor(getResources().getColor(C0966R.color.a7_));
            setMMTitleSize(((float) C76577a.m92155f(this, C0966R.dimen.f3619c)) * C76577a.m92161l(this));
        }
        if (C79758p.f233760a.mo109883f(new C110979n()) == 1) {
            C76912y0.makeText((Context) this, (CharSequence) getClass().getSimpleName(), 0).show();
        }
        handleVKBInit();
    }

    public void onCreateBeforeSetContentView() {
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.mController.mo177066a0(menu)) {
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348093d0.dead();
        mMActivityController.mo177041D();
        AndroidContextUtil.fixInputMethodManagerLeak(this);
        this.mConfigChangedListeners.clear();
    }

    public void onDialogDismiss(Dialog dialog) {
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.mController.mo177067b0(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        MMActivityController mMActivityController = this.mController;
        mMActivityController.getClass();
        if (i == 82 && keyEvent.getAction() == 1) {
            MMActivityController.C116044q qVar = mMActivityController.f348101h0;
            if (qVar != null && qVar.f348144e) {
                mMActivityController.mo177080j(mMActivityController.f348103i0, qVar);
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        try {
            return super.onKeyUp(i, keyEvent);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState", new Object[0]);
            return true;
        }
    }

    public void onKeyboardStateChanged() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.mController.mo177070d0(menuItem);
    }

    public void onPause() {
        long currentTimeMillis = System.currentTimeMillis();
        C30858i4.m39248a(2, this.className);
        this.mIsPaused = true;
        super.onPause();
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177069d(false);
        mMActivityController.f348093d0.dead();
        Log.m105927v(TAG2, "KEVIN MMActivity onPause: %d ms, isFinishing %B, hash:#0x%x", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(isFinishing()), Integer.valueOf(hashCode()));
        noteOnPauseTicks();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        this.mController.mo177072e0(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onResume() {
        long currentTimeMillis = System.currentTimeMillis();
        C30858i4.m39248a(1, this.className);
        this.mIsPaused = false;
        super.onResume();
        Log.m105926v(TAG2, "KEVIN MMActivity super.onResume " + (System.currentTimeMillis() - currentTimeMillis));
        this.mController.mo177074f0();
        Log.m105927v(TAG2, "KEVIN MMActivity onResume :%dms, hash:#0x%x", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(hashCode()));
        noteOnResumeTicks();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (isCallSuperOnSaveInstanceState()) {
            super.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        setMMOrientation();
        this.mIsStopped = false;
        super.onStart();
    }

    public void onStop() {
        this.mIsStopped = true;
        super.onStop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.mController;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSwipeBack() {
        /*
            r3 = this;
            boolean r0 = r3.onSwipeBackFinish()
            if (r0 != 0) goto L_0x0014
            com.tencent.mm.ui.MMActivityController r0 = r3.mController
            com.tencent.mm.ui.MMActivityController$q r1 = r0.f348061B
            if (r1 == 0) goto L_0x0014
            boolean r2 = r1.f348144e
            if (r2 == 0) goto L_0x0014
            r2 = 0
            r0.mo177080j(r2, r1)
        L_0x0014:
            super.onSwipeBack()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMActivity.onSwipeBack():void");
    }

    public boolean onSwipeBackFinish() {
        return false;
    }

    public void playActionBarOperationAreaAnim() {
        AlbumChooserView albumChooserView;
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null && (albumChooserView = mMActivityController.f348084Y) != null && !albumChooserView.f348676f) {
            albumChooserView.f348676f = true;
            albumChooserView.f348675e.animate().rotationBy(180.0f).setDuration(200).withEndAction(new C116982a(albumChooserView)).start();
        }
    }

    public View provideCustomActivityContentView() {
        return null;
    }

    public void removeAllOptionMenu() {
        MMActivityController mMActivityController = this.mController;
        if (!mMActivityController.f348062C.isEmpty()) {
            mMActivityController.f348062C.clear();
            mMActivityController.mo177047G0();
        }
    }

    public void removeOnConfigurationChangedListener(C44688e eVar) {
        if (eVar != null) {
            this.mConfigChangedListeners.remove(eVar);
        }
    }

    public boolean removeOptionMenu(int i) {
        return this.mController.mo177077h0(i);
    }

    public void removeSearchMenu() {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.getClass();
        MMActivityController.C116044q qVar = new MMActivityController.C116044q();
        qVar.f348140a = C0966R.C0970id.gsl;
        qVar.f348146g = mMActivityController.f348120t.getString(C0966R.string.a2p);
        qVar.f348141b = C0966R.raw.actionbar_icon_dark_search;
        qVar.f348152m = null;
        qVar.f348153n = null;
        mMActivityController.mo177077h0(qVar.f348140a);
        mMActivityController.mo177047G0();
    }

    public void setActionBarOperationAreaClickListener(AlbumChooserView.C116178b bVar) {
        AlbumChooserView albumChooserView;
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null && (albumChooserView = mMActivityController.f348084Y) != null) {
            albumChooserView.setOnAlbumChooserViewClick(bVar);
        }
    }

    public void setActionbarColor(int i) {
        this.mController.mo177081j0(i);
        if (getCustomBounceId() == -1 && getBounceView() != null) {
            getBounceView().setStart2EndBgColorByActionBar(i);
        }
    }

    public void setActionbarElementColor(int i) {
        this.mController.mo177082k0(i);
    }

    public void setActionbarHeight(int i) {
        this.mController.mo177084l0(i, false);
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177085m0(onMenuItemClickListener, 0);
    }

    public void setBackBtnColorFilter(int i) {
        MMActivityController mMActivityController = this.mController;
        WeImageView weImageView = mMActivityController.f348069J;
        if (weImageView != null) {
            weImageView.setIconColor(mMActivityController.f348120t.getResources().getColor(i));
        }
    }

    public void setBackBtnVisible(boolean z) {
        MMActivityController mMActivityController = this.mController;
        WeImageView weImageView = mMActivityController.f348069J;
        if (weImageView != null) {
            if (z) {
                weImageView.setVisibility(0);
                TextView textView = mMActivityController.f348070K;
                if (textView != null) {
                    textView.setVisibility(8);
                    return;
                }
                return;
            }
            weImageView.setVisibility(8);
        }
    }

    public void setBackGroundColorResource(int i) {
        this.mController.mo177087n0(i);
    }

    public final void setBodyView(int i) {
        this.mController.mo177088o0(i);
    }

    public void setBounceEnabled(boolean z) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348122v = z;
        C78461f fVar = mMActivityController.f348121u;
        if (fVar != null) {
            fVar.setBounceEnabled(z);
        }
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(contentView, "com/tencent/mm/ui/MMActivity", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i == 0) {
            showTitleView();
        } else {
            hideTitleView();
        }
    }

    public void setCurController(MMActivityController mMActivityController) {
        this.mController = mMActivityController;
    }

    public void setIconAlpha(float f) {
        MMActivityController mMActivityController = this.mController;
        View view = mMActivityController.f348068I;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "setIconAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MMActivityController", "setIconAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (f == 0.0f) {
                mMActivityController.f348068I.setEnabled(false);
            } else {
                mMActivityController.f348068I.setEnabled(true);
            }
        }
        WeImageView weImageView = mMActivityController.f348077R;
        if (weImageView != null) {
            weImageView.setAlpha(f);
            if (f == 0.0f) {
                mMActivityController.f348077R.setEnabled(false);
            } else {
                mMActivityController.f348077R.setEnabled(true);
            }
        }
    }

    public void setIsDarkActionbarBg(boolean z) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348076Q = z;
        mMActivityController.mo177049H0(z);
        mMActivityController.mo177051I0();
    }

    public void setLightNavigationbarIcon() {
        MMActivityController mMActivityController = this.mController;
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = mMActivityController.f348119s.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -17);
            return;
        }
        mMActivityController.getClass();
    }

    public void setMMNormalView() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.f348120t != null) {
            mMActivityController.mo177048H(mMActivityController.f348119s);
        }
    }

    public void setMMOrientation() {
        if (getForceOrientation() == -1) {
            boolean z = getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("settings_landscape_mode", false);
            this.landscapeMode = z;
            if (z) {
                if (C85875k4.m106160Q() || C85875k4.m106159P()) {
                    C85811a5.m106028e(1);
                }
                setRequestedOrientation(-1);
                return;
            }
            if (C85875k4.m106160Q() || C85875k4.m106159P()) {
                C85811a5.m106028e(0);
            }
            setRequestedOrientation(1);
            return;
        }
        setRequestedOrientation(getForceOrientation());
    }

    public void setMMSingleTitle(String str) {
        this.mController.mo177093r0(str, (Animation) null);
    }

    public void setMMSubTitle(String str) {
        this.mController.mo177097t0(str);
    }

    @Deprecated
    public void setMMSubTitleColor(int i) {
    }

    public void setMMTitle(String str) {
        super.setTitle(str);
        this.mController.mo177100v0(str);
    }

    public void setMMTitleColor(int i) {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.f348065F != null) {
            Log.m105919d("MicroMsg.MMActivityController", "setMMTitleColor color: %s.", Integer.valueOf(i));
            mMActivityController.f348066G.setTextColor(i);
        }
    }

    public void setMMTitleSize(float f) {
        TextView textView;
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.f348065F != null && (textView = mMActivityController.f348066G) != null) {
            textView.setTextSize(0, f);
        }
    }

    public void setMMTitleVisibility(int i) {
        this.mController.mo177102w0(i);
    }

    public void setNavigationbarColor(int i) {
        this.mController.mo177103x0(i);
    }

    public void setProgressIcon(int i) {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.f348065F != null) {
            mMActivityController.f348071L.setIndeterminateDrawable(mMActivityController.mo177096t().getDrawable(i));
        }
    }

    public void setProgressVisibility(int i) {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.f348065F != null) {
            mMActivityController.f348071L.setVisibility(i);
        }
    }

    @Deprecated
    public void setRedDotVisibilty(int i) {
    }

    public void setScreenEnable(boolean z) {
        this.mController.mo177104y0(z);
    }

    public void setSelfNavigationBarColor(int i) {
        if (!C75044y4.m89992d(getContext())) {
            Log.m105928w(TAG, "has not NavigationBar!");
            return;
        }
        if (this.mSelfNavigationBar == null) {
            this.mSelfNavigationBar = new View(getContext());
            ((ViewGroup) getWindow().getDecorView()).addView(this.mSelfNavigationBar);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, C75044y4.m89991c(getContext()));
        layoutParams.gravity = 80;
        this.mSelfNavigationBar.setLayoutParams(layoutParams);
        this.mSelfNavigationBar.setBackgroundColor(i);
        View view = this.mSelfNavigationBar;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setSelfNavigationBarVisible(int i) {
        View view = this.mSelfNavigationBar;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/MMActivity", "setSelfNavigationBarVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setSmartGalleryEntryVisibility(boolean z) {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            mMActivityController.getClass();
            Log.m105918d("MicroMsg.MMActivityController", "set smart gallery entry valid.");
            mMActivityController.f348125y = z;
            mMActivityController.mo177047G0();
        }
    }

    public void setTitleAlpha(float f) {
        TextView textView = this.mController.f348066G;
        if (textView != null) {
            textView.setAlpha(f);
        }
    }

    public void setTitleBarClickListener(Runnable runnable, Runnable runnable2) {
        MMActivityController mMActivityController = this.mController;
        ActionBar actionBar = mMActivityController.f348065F;
        if (actionBar != null) {
            actionBar.mo91099j().setOnClickListener(new C6983k1(mMActivityController, runnable, runnable2));
        }
    }

    public void setTitleBarDoubleClickListener(Runnable runnable) {
        MMActivityController mMActivityController = this.mController;
        ActionBar actionBar = mMActivityController.f348065F;
        if (actionBar != null && runnable != null) {
            actionBar.mo91099j().setOnClickListener(new C6980j1(mMActivityController, runnable));
        }
    }

    @Deprecated
    public void setTitleClickAction(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
    }

    public void setTitleDividerColor(int i) {
        this.mController.getClass();
    }

    public void setTitleDividerVis(boolean z) {
        this.mController.getClass();
    }

    public void setTitleForceNotifyIconVisibility(int i) {
        this.mController.mo177061P0();
    }

    public void setTitleLogo(int i, int i2) {
        this.mController.mo177036A0(i, i2);
    }

    public void setTitleMuteIconVisibility(int i) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348117q = i == 0;
        mMActivityController.mo177061P0();
    }

    public void setTitlePhoneIconVisibility(int i) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348118r = i == 0;
        mMActivityController.mo177061P0();
    }

    public void setTitleVisibility(int i) {
        this.mController.mo177038B0(i);
    }

    @Deprecated
    public void setToTop(View.OnClickListener onClickListener) {
    }

    public void setTransparentTheme(boolean z) {
        this.transparentTheme = z;
    }

    public void showActionbarLine() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.mo177037B() != null) {
            mMActivityController.mo177037B().mo91089G(1.0f);
        }
    }

    public void showHomeBtn(boolean z) {
        this.mController.mo177040C0(z);
    }

    public void showMMLogo() {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348069J.setVisibility(8);
        View view = mMActivityController.f348068I;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/MMActivityController", "showMMLogo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/ui/MMActivityController", "showMMLogo", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void showOptionMenu(boolean z) {
        this.mController.mo177042D0(true, -1, z);
    }

    public void showTitleView() {
        this.mController.mo177044E0();
    }

    public void showVKB() {
        MMActivityController.m163187F0(this.mController.f348119s);
    }

    public void startActivity(Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C15709j.class);
    }

    public void supportLightStatusBar() {
        MMActivityController mMActivityController = this.mController;
        if (Build.VERSION.SDK_INT >= 23) {
            View decorView = mMActivityController.f348119s.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        mMActivityController.getClass();
    }

    public void triggerActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }

    public void updataStatusBarIcon(boolean z) {
        this.mController.mo177049H0(z);
    }

    public void updateActionBarOperationAreaTxt(String str) {
        AlbumChooserView albumChooserView;
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null && (albumChooserView = mMActivityController.f348084Y) != null && !albumChooserView.f348676f) {
            albumChooserView.f348676f = true;
            albumChooserView.f348675e.animate().rotationBy(180.0f).setDuration(200).withEndAction(new C116983b(albumChooserView, str)).start();
        }
    }

    public void updateBackBtn(Drawable drawable) {
        this.mController.mo177052J0(drawable);
    }

    public void updateDescription(String str) {
        this.mController.mo177054K0(str);
    }

    public void updateOptionMenuIcon(int i, int i2) {
        this.mController.mo177056L0(i, i2);
    }

    public void updateOptionMenuListener(int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        MMActivityController.C116044q A = this.mController.mo177035A(i);
        if (A != null) {
            A.f348152m = onMenuItemClickListener;
            A.f348153n = onLongClickListener;
        }
    }

    public void updateOptionMenuRightButtonColor(int i, int i2, int i3, int i4, int i5, boolean z) {
        MMActivityController mMActivityController = this.mController;
        MMActivityController.C116044q A = mMActivityController.mo177035A(i);
        if ((A != null && (A.f348155p != i2 || A.f348156q != i3 || A.f348157r != i4 || A.f348158s != i5)) || A.f348159t != z) {
            A.f348155p = i2;
            A.f348156q = i3;
            A.f348157r = i4;
            A.f348158s = i5;
            A.f348159t = z;
            mMActivityController.mo177047G0();
        }
    }

    public void updateOptionMenuStyle(int i, MMActivityController.C73075r rVar) {
        MMActivityController mMActivityController = this.mController;
        MMActivityController.C116044q A = mMActivityController.mo177035A(i);
        if (A != null) {
            A.f348150k = rVar;
            mMActivityController.mo177047G0();
        }
    }

    public void updateOptionMenuText(int i, String str) {
        this.mController.mo177058N0(i, str);
    }

    public static Locale initLanguage(Context context, String str) {
        if (str.equals("language_default")) {
            LocaleUtil.updateApplicationResourceLocale(context, Locale.ENGLISH);
            return Locale.getDefault();
        }
        Locale transLanguageToLocale = LocaleUtil.transLanguageToLocale(str);
        LocaleUtil.updateApplicationResourceLocale(context, transLanguageToLocale);
        return transLanguageToLocale;
    }

    public void fullScreenNoTitleBar(boolean z, long j) {
        MMActivityController mMActivityController = this.mController;
        if (z) {
            ActionBar actionBar = mMActivityController.f348065F;
            if (actionBar != null) {
                actionBar.mo91104o();
            }
            mMActivityController.f348124x.removeCallbacks(mMActivityController.f348107k0);
            mMActivityController.f348124x.removeCallbacks(mMActivityController.f348105j0);
            mMActivityController.f348124x.postDelayed(mMActivityController.f348105j0, j);
            return;
        }
        mMActivityController.f348119s.getWindow().clearFlags(1024);
        mMActivityController.f348124x.removeCallbacks(mMActivityController.f348105j0);
        mMActivityController.f348124x.removeCallbacks(mMActivityController.f348107k0);
        mMActivityController.f348124x.postDelayed(mMActivityController.f348107k0, j);
    }

    public void hideVKB(View view) {
        this.mController.mo177046G(view);
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i) {
        this.mController.mo177085m0(onMenuItemClickListener, i);
    }

    public void setMMSubTitle(int i) {
        this.mController.mo177095s0(i);
    }

    public void enableOptionMenu(int i, boolean z) {
        this.mController.mo177083l(false, i, z);
    }

    public void setMMSingleTitle(String str, Animation animation) {
        this.mController.mo177093r0(str, animation);
    }

    public void setMMTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mController.mo177098u0(charSequence);
    }

    public void showOptionMenu(int i, boolean z) {
        this.mController.mo177042D0(false, i, z);
    }

    public static void showVKB(Activity activity) {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = activity.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public void addIconOptionMenu(int i, int i2, Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177075g(i, getString(i2), drawable, onMenuItemClickListener);
    }

    public void addTextOptionMenu(int i, String str, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.getClass();
        MMActivityController.C73075r rVar = MMActivityController.C73075r.NORMAL;
        MMActivityController.C116044q qVar = new MMActivityController.C116044q();
        qVar.f348140a = i;
        qVar.f348146g = str;
        qVar.f348147h = i2;
        qVar.f348152m = onMenuItemClickListener;
        qVar.f348153n = null;
        qVar.f348150k = rVar;
        mMActivityController.mo177079i0(i);
        mMActivityController.f348062C.add(qVar);
        new MMHandler().postDelayed(new C116088m1(mMActivityController), 200);
    }

    public void startActivity(Class<?> cls, Intent intent) {
        intent.setClass(this, cls);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/ui/MMActivity", "startActivity", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void addIconOptionMenu(int i, String str, Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177075g(i, str, drawable, onMenuItemClickListener);
    }

    public void initActionBarOperationAreaTxt(String str, int i, int i2, int i3, int i4) {
        AlbumChooserView albumChooserView;
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null && (albumChooserView = mMActivityController.f348084Y) != null) {
            albumChooserView.f348674d.setText(str);
            albumChooserView.f348674d.setTextColor(albumChooserView.getContext().getResources().getColor(i));
            ((LinearLayout) albumChooserView.f348674d.getParent()).setBackground(albumChooserView.getContext().getResources().getDrawable(i4));
            albumChooserView.f348675e.setIconColor(albumChooserView.getContext().getResources().getColor(i2));
            ((FrameLayout) albumChooserView.f348675e.getParent()).setBackground(albumChooserView.getContext().getResources().getDrawable(i3));
        }
    }

    public void setMMTitle(int i) {
        super.setTitle(i);
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177100v0(mMActivityController.f348120t.getString(i));
    }

    public void addIconOptionMenu(int i, String str, int i2, boolean z, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177076h(i, i2, str, z, onMenuItemClickListener, (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
    }

    public void addIconOptionMenu(int i, String str, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        getController().mo177073f(i, str, i2, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        getController().mo177071e(i, i2, i3, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i, int i2, int i3, boolean z, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177076h(i, i3, mMActivityController.f348120t.getString(i2), z, onMenuItemClickListener, (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
    }

    public void addIconOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        this.mController.mo177076h(i, i2, "", false, onMenuItemClickListener, onLongClickListener, MMActivityController.C73075r.NORMAL);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        this.mController.mo177076h(i, 0, str, false, onMenuItemClickListener, onLongClickListener, MMActivityController.C73075r.NORMAL);
    }

    public void addIconOptionMenu(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177076h(i, i3, mMActivityController.f348120t.getString(i2), false, onMenuItemClickListener, onLongClickListener, MMActivityController.C73075r.NORMAL);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener, MMActivityController.C73075r rVar) {
        this.mController.mo177076h(i, 0, str, false, onMenuItemClickListener, onLongClickListener, rVar);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, MMActivityController.C73075r rVar) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.getClass();
        MMActivityController.C116044q qVar = new MMActivityController.C116044q();
        qVar.f348140a = i;
        qVar.f348141b = 0;
        qVar.f348146g = str;
        qVar.f348152m = onMenuItemClickListener;
        qVar.f348153n = onLongClickListener;
        qVar.f348154o = onTouchListener;
        qVar.f348150k = rVar;
        qVar.f348151l = false;
        mMActivityController.mo177079i0(i);
        mMActivityController.f348062C.add(qVar);
        mMActivityController.mo177047G0();
    }
}
