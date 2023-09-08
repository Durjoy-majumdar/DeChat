package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.result.C67074b;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import co3.C113370c;
import co3.C28632a;
import co3.C28633b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.glocom.GloUIComponentActivity;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.AndroidOSafety;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import dp3.C116623a;
import go3.C76004e;
import go3.C76019y;
import in3.C87771d;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jp3.C9486a;
import jp3.C9487b;
import k20.C60958c;
import k20.C9556a;
import lg3.C88496e;
import lg3.C88497f;
import nj3.C88990b;
import p1067yj.C91461a;
import p206nj.C76860a;
import p431e.C75464c;
import p605mj.C34575a;
import p918s2.C118252b;
import r40.C118224c;
import r40.C36247b;
import r40.C36248d;
import r40.C89868a;
import vn3.C111559c;
import vn3.C111562e;
import vn3.C118694m;
import xq3.C38806a;

/* renamed from: com.tencent.mm.ui.MMFragmentActivity */
public class MMFragmentActivity extends GloUIComponentActivity implements C76019y.C76020a, SwipeBackLayout.C19847c, C9487b {
    public static final long ANIMATION_DURATION = 260;
    public static final String EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM = "extra_use_system_default_enter_exit_anim";
    private static final String TAG = "MicroMsg.MMFragmentActivity";
    public static final float WIDTH_SETTLE_FACT = 3.5f;
    public static C28633b aMonitor = C28633b.C28634a.f78563a;
    public static C113370c aReporter = C113370c.C104383a.f309020a;
    private static List<MMFragmentActivity$$h> interceptors;
    private byte _hellAccFlag_;
    public String className;
    private Resources customResources;
    public C38806a inflateXMLInfo = new C38806a(getClass().getSimpleName());
    private MMFragmentActivity$$c mActivityAnimStyle = new MMFragmentActivity$$c();
    private View mContentViewForSwipeBack = null;
    private List<MMFragmentActivity$$e> mDispatchedTouchListeners = new ArrayList();
    private Resources mForceBaseResources;
    private Resources mForceNewResources;
    private Resources mForceOldResources;
    private boolean mIsPaused;
    private C116623a mLifeCycleKeeper = new C116623a();
    private SwipeBackLayout mSwipeBackLayout;
    private boolean mSwiping;
    private MMFragmentActivity$$f onActResult = null;
    public ArrayList<WeakReference<MMFragment>> record = new ArrayList<>();
    private boolean updateForceResource = false;
    private boolean updateResource = false;

    static {
        C87771d.f254122h = new MMFragmentActivity$$a();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        interceptors = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new MMFragmentActivity$$b());
        int i = C113370c.f339169a;
        int i2 = C28632a.f78561a;
        int i3 = C28633b.f78562a;
    }

    public static void addInterceptor(MMFragmentActivity$$h mMFragmentActivity$$h) {
        interceptors.add(mMFragmentActivity$$h);
    }

    /* access modifiers changed from: private */
    public static int getSlideLeftInAnim() {
        return C0966R.C0968anim.f2497el;
    }

    /* access modifiers changed from: private */
    public static int getSlideLeftOutAnim() {
        return C0966R.C0968anim.f2499en;
    }

    /* access modifiers changed from: private */
    public static int getSlideRightInAnim() {
        return C0966R.C0968anim.f2504es;
    }

    /* access modifiers changed from: private */
    public static int getSlideRightOutAnim() {
        return C0966R.C0968anim.f2507ev;
    }

    public static boolean isVASActivity(Intent intent) {
        return intent != null && C111562e.m152092b(intent, 1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(Activity activity) {
        return C85861e4.m106115b(activity) || C85875k4.m106209x(activity.getTaskId());
    }

    private void recordActivityStartTime() {
        aMonitor.mo56106b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addDispatchedTouchListener(com.tencent.p014mm.p136ui.MMFragmentActivity$$e r4) {
        /*
            r3 = this;
            java.util.List<com.tencent.mm.ui.MMFragmentActivity$$e> r0 = r3.mDispatchedTouchListeners
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()
            com.tencent.mm.ui.MMFragmentActivity$$e r1 = (com.tencent.p014mm.p136ui.MMFragmentActivity$$e) r1
            if (r1 == r4) goto L_0x0022
            java.lang.String r1 = r1.key()
            java.lang.String r2 = r4.key()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0006
        L_0x0022:
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x002c
            java.util.List<com.tencent.mm.ui.MMFragmentActivity$$e> r0 = r3.mDispatchedTouchListeners
            r0.add(r4)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMFragmentActivity.addDispatchedTouchListener(com.tencent.mm.ui.MMFragmentActivity$$e):void");
    }

    public String appendMemLog() {
        long j = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        return String.format("Runtime: [%s:%s:%s] Native: [%s:%s:%s] ", new Object[]{Long.valueOf(j), Long.valueOf(freeMemory), Long.valueOf(j - freeMemory), Long.valueOf(Debug.getNativeHeapSize()), Long.valueOf(Debug.getNativeHeapAllocatedSize()), Long.valueOf(Debug.getNativeHeapFreeSize())});
    }

    public boolean convertActivityFromTranslucent() {
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isSupportNavigationSwipeBack()) {
            SwipeBackLayout swipeBackLayout = getSwipeBackLayout();
            if (keyEvent.getKeyCode() == 4 && swipeBackLayout != null) {
                swipeBackLayout.mo26379a();
                if (swipeBackLayout.f56498v) {
                    Log.m105928w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (MMFragmentActivity$$e a : this.mDispatchedTouchListeners) {
            a.mo14377a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean enableActivityAnimation() {
        Intent intent = getIntent();
        return !(intent != null ? IntentUtil.getBooleanExtra(intent, EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, false) : false);
    }

    public void finish() {
        super.finish();
        initActivityCloseAnimation();
    }

    public boolean forceRemoveNoMatchOnPath() {
        return false;
    }

    public int getActionBarHeightFromTheme() {
        return C76860a.m92657c(this);
    }

    public MMFragment getCurrentFragmet() {
        MMFragment mMFragment;
        int size = this.record.size();
        if (size == 0 || (mMFragment = (MMFragment) this.record.get(size - 1).get()) == null || !mMFragment.isShowing()) {
            return null;
        }
        return mMFragment;
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent != null) {
            C111559c.f333976a.mo163251d(intent);
        }
        return intent;
    }

    public final Resources getOriginalResources() {
        return super.getResources();
    }

    public Resources getResources() {
        if (getAssets() == null || MMApplicationContext.getResources() == null) {
            return super.getResources();
        }
        if (!this.updateResource || this.customResources == null) {
            Resources resources = getBaseContext().getResources();
            Resources resources2 = MMApplicationContext.getResources();
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

    public ActionBar getSupportActionBar() {
        return C76004e.m91288N(super.getSupportActionBar());
    }

    public SwipeBackLayout getSwipeBackLayout() {
        return this.mSwipeBackLayout;
    }

    public Object getSystemService(String str) {
        if (("clipboard".equals(str) || "power".equals(str)) && getApplicationContext() != null) {
            return getApplicationContext().getSystemService(str);
        }
        Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? C85868k2.m106138c((LayoutInflater) systemService) : systemService;
    }

    public WindowManager getWindowManager() {
        if (!isDestroyed()) {
            return super.getWindowManager();
        }
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 2 && stackTrace[1].getMethodName().equals("handleDestroyActivity")) {
                return C91461a.m114761a(super.getWindowManager());
            }
        } catch (Throwable th) {
            Log.m105920e(TAG, th.getMessage());
        }
        return super.getWindowManager();
    }

    public void hideVKB() {
        View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            hideVKB(getWindow().getDecorView());
        } else {
            hideVKB(currentFocus);
        }
    }

    public void initActivityCloseAnimation() {
        if (enableActivityAnimation()) {
            boolean z = true;
            if (!((C88990b.m111195d(getClass()) & 2) == 0)) {
                if ((C88990b.m111195d(getClass()) & 4) == 0) {
                    z = false;
                }
                if (!z) {
                    C88990b.m111200i(this);
                } else {
                    C88990b.m111197f(this);
                }
            } else if (C85875k4.m106208w()) {
                super.overridePendingTransition(0, 0);
            } else {
                super.overridePendingTransition(MMFragmentActivity$$c.f318650g, MMFragmentActivity$$c.f318651h);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091 A[SYNTHETIC, Splitter:B:41:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initActivityOpenAnimation(android.content.Intent r9) {
        /*
            r8 = this;
            boolean r0 = r8.enableActivityAnimation()
            if (r0 == 0) goto L_0x00ba
            r0 = 0
            if (r9 != 0) goto L_0x000b
            r9 = r0
            goto L_0x000f
        L_0x000b:
            android.content.ComponentName r9 = r9.getComponent()
        L_0x000f:
            if (r9 == 0) goto L_0x00ba
            java.lang.String r1 = r9.getClassName()
            java.lang.String r2 = r9.getPackageName()
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0024
            java.lang.String r9 = r9.getClassName()
            goto L_0x0028
        L_0x0024:
            java.lang.String r9 = r9.getClassName()
        L_0x0028:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = "Class %s not found in dex"
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.ActivityUtil"
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0038
        L_0x0036:
            r1 = r0
            goto L_0x004b
        L_0x0038:
            java.lang.Class r1 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x003d }
            goto L_0x004b
        L_0x003d:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r3, r7)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            goto L_0x0036
        L_0x004b:
            if (r1 == 0) goto L_0x005b
            int r1 = nj3.C88990b.m111195d(r1)
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 == 0) goto L_0x005b
            return
        L_0x005b:
            java.lang.Class r1 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0060 }
            goto L_0x006e
        L_0x0060:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r3, r7)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
            r1 = r0
        L_0x006e:
            if (r1 == 0) goto L_0x0075
            int r1 = nj3.C88990b.m111195d(r1)
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            r1 = r1 & 2
            if (r1 != 0) goto L_0x007c
            r1 = 1
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            if (r1 == 0) goto L_0x0091
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106208w()
            if (r9 == 0) goto L_0x0089
            super.overridePendingTransition(r6, r6)
            goto L_0x00ba
        L_0x0089:
            int r9 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318648e
            int r0 = com.tencent.p014mm.p136ui.MMFragmentActivity$$c.f318649f
            super.overridePendingTransition(r9, r0)
            goto L_0x00ba
        L_0x0091:
            java.lang.Class r0 = java.lang.Class.forName(r9)     // Catch:{ ClassNotFoundException -> 0x0096 }
            goto L_0x00a3
        L_0x0096:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r3, r7)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
        L_0x00a3:
            if (r0 == 0) goto L_0x00aa
            int r9 = nj3.C88990b.m111195d(r0)
            goto L_0x00ab
        L_0x00aa:
            r9 = 0
        L_0x00ab:
            r9 = r9 & 4
            if (r9 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r5 = 0
        L_0x00b1:
            if (r5 != 0) goto L_0x00b7
            nj3.C88990b.m111198g(r8)
            goto L_0x00ba
        L_0x00b7:
            nj3.C88990b.m111197f(r8)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MMFragmentActivity.initActivityOpenAnimation(android.content.Intent):void");
    }

    public boolean initNavigationSwipeBack() {
        if (C88990b.m111196e()) {
            if (!((C88990b.m111195d(getClass()) & 1) == 0) || !convertActivityFromTranslucent()) {
                if (((C88990b.m111195d(getClass()) & 16) != 0) && MMHandlerThread.isMainThread()) {
                    C88990b.m111193b(this);
                }
            } else if (MMHandlerThread.isMainThread()) {
                C88990b.m111193b(this);
            }
        }
        if (!isSupportNavigationSwipeBack()) {
            return false;
        }
        initSwipeBack();
        return true;
    }

    public void initSwipeBack() {
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        int i = 0;
        SwipeBackLayout swipeBackLayout = (SwipeBackLayout) LayoutInflater.from(this).inflate(C0966R.C0971layout.c7z, viewGroup, false);
        this.mSwipeBackLayout = swipeBackLayout;
        swipeBackLayout.mo26380b();
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        View childAt = viewGroup.getChildAt(0);
        if (childAt.findViewById(16908290) == null) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt2 = viewGroup.getChildAt(i);
                if ((childAt2 instanceof ViewGroup) && childAt2.findViewById(16908290) != null) {
                    childAt = childAt2;
                    break;
                }
                i++;
            }
        }
        childAt.setBackgroundResource(C0966R.color.ahf);
        viewGroup.removeView(childAt);
        this.mSwipeBackLayout.addView(childAt);
        this.mSwipeBackLayout.setContentView(childAt);
        viewGroup.addView(this.mSwipeBackLayout);
        this.mSwipeBackLayout.setSwipeGestureDelegate(this);
    }

    public boolean isCallSuperOnSaveInstanceState() {
        return false;
    }

    public boolean isHideStatusBar() {
        return (C88990b.m111195d(getClass()) & 32) != 0;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isSupportNavigationSwipeBack() {
        if (C88990b.m111196e() && C34575a.m40396a() && supportNavigationSwipeBack()) {
            if ((C88990b.m111195d(getClass()) & 1) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isSwiping() {
        return this.mSwiping;
    }

    public void keep(C9486a aVar) {
        this.mLifeCycleKeeper.f349699a.keep(aVar);
    }

    public void mmStartActivityForResult(MMFragmentActivity$$f mMFragmentActivity$$f, Intent intent, int i) {
        this.onActResult = mMFragmentActivity$$f;
        startActivityForResult(intent, i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MMFragmentActivity$$f mMFragmentActivity$$f = this.onActResult;
        this.onActResult = null;
        if (mMFragmentActivity$$f != null) {
            mMFragmentActivity$$f.mmOnActivityResult(i, i2, intent);
        }
    }

    public void onCancel() {
        this.mSwiping = false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        ViewGroup viewGroup;
        View findViewById;
        super.onConfigurationChanged(configuration);
        if (getSupportActionBar() != null && (viewGroup = (ViewGroup) findViewById(C0966R.C0970id.bzq)) != null && (findViewById = viewGroup.findViewById(C0966R.C0970id.f5380dl)) != null && (findViewById instanceof Toolbar)) {
            Toolbar toolbar = (Toolbar) findViewById;
            ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = getActionBarHeightFromTheme();
            }
            toolbar.setLayoutParams(layoutParams);
        }
    }

    public void onCreate(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bundle);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onCreate", "(Landroid/os/Bundle;)V", this, array);
        recordActivityStartTime();
        String name = getClass().getName();
        this.className = name;
        C30858i4.m39248a(3, name);
        super.onCreate(bundle);
        this.mLifeCycleKeeper.getClass();
        Log.m105925i(TAG, "checktask onCreate:%s#0x%x, taskid:%d, task:%s appendMemLog:%s", getClass().getSimpleName(), Integer.valueOf(hashCode()), Integer.valueOf(getTaskId()), Util.getActivityTaskInfo(this), appendMemLog());
        C117292a.m165361g(this, "com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onCreate", "(Landroid/os/Bundle;)V");
    }

    public void onDestroy() {
        C117292a.m165355a("com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onDestroy", "()V", this);
        aMonitor.mo56105a(this.inflateXMLInfo);
        Log.m105925i(TAG, "checktask onDestroy:%s#0x%x task:%s appendMemLog:%s", getClass().getSimpleName(), Integer.valueOf(hashCode()), Util.getActivityTaskInfo(this), appendMemLog());
        this.mLifeCycleKeeper.f349699a.dead();
        this.mDispatchedTouchListeners.clear();
        super.onDestroy();
        C36247b.m40929a(this);
        if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT == 24) {
            try {
                if (C118224c.f353374a == null) {
                    Class<?> cls = Class.forName("android.gestureboost.GestureBoostManager");
                    C118224c.f353374a = cls;
                    Field declaredField = cls.getDeclaredField("sGestureBoostManager");
                    C118224c.f353375b = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = C118224c.f353374a.getDeclaredField("mContext");
                    C118224c.f353376c = declaredField2;
                    declaredField2.setAccessible(true);
                }
                Object obj = C118224c.f353375b.get((Object) null);
                if (obj != null) {
                    C118224c.f353376c.set(obj, (Object) null);
                }
            } catch (Throwable unused) {
            }
        }
        C36248d.m40930a();
        Log.m105925i(TAG, "Activity dump [%s]", C89868a.m112382a());
        C117292a.m165361g(this, "com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onDestroy", "()V");
    }

    public void onDrag() {
        this.mSwiping = true;
    }

    public void onPause() {
        C30858i4.m39248a(2, this.className);
        this.mIsPaused = true;
        super.onPause();
        if (isSupportNavigationSwipeBack()) {
            if (getSwipeBackLayout() != null) {
                getSwipeBackLayout().setEnableGesture(false);
            }
            if (!isFinishing()) {
                C76019y.m91316d(this);
            }
        }
        this.mLifeCycleKeeper.f349700b.dead();
    }

    public void onResume() {
        C30858i4.m39248a(1, this.className);
        this.mIsPaused = false;
        super.onResume();
        if (isSupportNavigationSwipeBack()) {
            C76019y.m91315c(this);
            onSwipe(1.0f);
            if (getSwipeBackLayout() != null) {
                getSwipeBackLayout().setEnableGesture(true);
                getSwipeBackLayout().f56498v = false;
            }
        }
        this.mLifeCycleKeeper.getClass();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (isCallSuperOnSaveInstanceState()) {
            super.onSaveInstanceState(bundle);
        }
    }

    public void onSettle(boolean z, int i) {
        Log.m105927v("ashutest", "ashutest:: on settle %B, speed %d", Boolean.valueOf(z), Integer.valueOf(i));
        if (this.mContentViewForSwipeBack == null) {
            this.mContentViewForSwipeBack = C85875k4.m106172b(getWindow(), getSupportActionBar().mo91099j());
        }
        View view = this.mContentViewForSwipeBack;
        long j = 130;
        if (z) {
            if (i <= 0) {
                j = 260;
            }
            C74863w0.m89620a(view, j, 0.0f, 0.0f, (C74863w0.C74865b) null);
            return;
        }
        if (i <= 0) {
            j = 260;
        }
        C74863w0.m89620a(view, j, ((float) (view.getWidth() * -1)) / 3.5f, 0.0f, (C74863w0.C74865b) null);
    }

    public void onStart() {
        super.onStart();
        this.mLifeCycleKeeper.getClass();
    }

    public void onStop() {
        this.mLifeCycleKeeper.f349701c.dead();
        super.onStop();
    }

    public void onSwipe(float f) {
        Log.m105927v("ashutest", "ashutest::on swipe %f, duration %d", Float.valueOf(f), 260L);
        if (this.mContentViewForSwipeBack == null) {
            this.mContentViewForSwipeBack = C85875k4.m106172b(getWindow(), getSupportActionBar() != null ? getSupportActionBar().mo91099j() : null);
        }
        View view = this.mContentViewForSwipeBack;
        if (Float.compare(1.0f, f) <= 0) {
            C74863w0.m89622c(view, 0.0f, 0.0f);
        } else {
            C74863w0.m89622c(view, (((float) view.getWidth()) / 3.5f) * (1.0f - f) * -1.0f, 0.0f);
        }
    }

    public void onSwipeBack() {
        if (!isFinishing()) {
            finish();
        }
        View decorView = getWindow().getDecorView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(decorView, aVar.mo10232b(), "com/tencent/mm/ui/MMFragmentActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(decorView, "com/tencent/mm/ui/MMFragmentActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
        this.mSwiping = false;
    }

    public boolean popBackStackImmediate() {
        if (this.record.size() == 0) {
            return false;
        }
        ArrayList<WeakReference<MMFragment>> arrayList = this.record;
        arrayList.remove(arrayList.size() - 1);
        return getSupportFragmentManager().popBackStackImmediate();
    }

    public void putActivityCloseAnimation(int i, int i2) {
        if (enableActivityAnimation()) {
            MMFragmentActivity$$c.f318650g = i;
            MMFragmentActivity$$c.f318651h = i2;
        }
        super.overridePendingTransition(i, i2);
    }

    public void putActivityOpenAnimation(int i, int i2) {
        if (enableActivityAnimation()) {
            MMFragmentActivity$$c.f318648e = i;
            MMFragmentActivity$$c.f318649f = i2;
        }
        super.overridePendingTransition(i, i2);
    }

    public void removeDispatchedTouchListener(MMFragmentActivity$$e mMFragmentActivity$$e) {
        this.mDispatchedTouchListeners.remove(mMFragmentActivity$$e);
    }

    public void setMMOnFragmentActivityResult(MMFragmentActivity$$f mMFragmentActivity$$f) {
        this.onActResult = mMFragmentActivity$$f;
    }

    public void setRequestedOrientation(int i) {
        if (!AndroidOSafety.safety(this, i)) {
            Log.m105921e(TAG, "AndroidOSafety.safety false ignore setRequestedOrientation %s for activity %s", Integer.valueOf(i), this);
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "AndroidOSafety.safety uncaught", new Object[0]);
        }
    }

    public void showVKB() {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public void startActivities(Intent[] intentArr, Bundle bundle) {
        if (!C85927s.m106240a(this, this.mIsPaused, intentArr, bundle)) {
            super.startActivities(intentArr, bundle);
            initActivityOpenAnimation((Intent) null);
        }
    }

    public void startActivity(Intent intent) {
        for (MMFragmentActivity$$h d : interceptors) {
            if (d.mo7676d(this, Util.nullAsNil(intent.getComponent() != null ? intent.getComponent().getClassName() : ""), intent)) {
                return;
            }
        }
        super.startActivity(intent);
        initActivityOpenAnimation(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
        initActivityOpenAnimation(intent);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        for (MMFragmentActivity$$h d : interceptors) {
            if (d.mo7676d(this, Util.nullAsNil(intent.getComponent() != null ? intent.getComponent().getClassName() : ""), intent)) {
                return;
            }
        }
        super.startActivityFromFragment(fragment, intent, i);
        initActivityOpenAnimation(intent);
    }

    public void startVASActivity(Intent intent, Bundle bundle) {
        try {
            C118694m.m167387e(this, Class.forName(intent.getComponent().getClassName()), intent, bundle, -1);
        } catch (Throwable unused) {
        }
    }

    public void startVASActivityForResult(Intent intent, int i, Bundle bundle) {
        try {
            C118694m.m167387e(this, Class.forName(intent.getComponent().getClassName()), intent, bundle, i);
        } catch (Throwable unused) {
        }
    }

    public void supportInvalidateOptionsMenu() {
        if (getCurrentFragmet() == null || !getCurrentFragmet().interceptSupportInvalidateOptionsMenu()) {
            super.supportInvalidateOptionsMenu();
        }
    }

    public boolean supportNavigationSwipeBack() {
        return true;
    }

    public void switchFragment(Fragment fragment, int i, boolean z, boolean z2, int i2, int i3) {
        if (fragment != null && i != 0) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C112919c0 beginTransaction = supportFragmentManager.beginTransaction();
            if (z2) {
                beginTransaction.mo165201m(i2, i3, 0, 0);
            }
            if (supportFragmentManager.findFragmentById(i) == null) {
                beginTransaction.mo165167i(i, fragment, fragment.getTag(), 1);
            } else if (fragment.isHidden()) {
                beginTransaction.mo165171o(fragment);
            }
            if (z) {
                beginTransaction.mo165199c((String) null);
            }
            beginTransaction.mo165162d();
            supportFragmentManager.executePendingTransactions();
        }
    }

    public void switchFragmentActivity(Fragment fragment) {
        if (fragment != null) {
            switchFragmentActivity(fragment, fragment.getId());
        }
    }

    public void switchFragmentInternalBackwardWithAnim(Fragment fragment) {
        switchFragmentInternalBackwardWithAnim(fragment, fragment.getId());
    }

    public void switchFragmentInternalBackwardWithAnimLeftSelfView(Fragment fragment, View view) {
        if (fragment != null) {
            switchFragmentInternalBackwardWithAnimLeftSelfView(fragment, fragment.getId(), view);
        }
    }

    public void switchFragmentInternalFarwardWithAnim(Fragment fragment) {
        if (fragment != null) {
            switchFragmentInternalFarwardWithAnim(fragment, fragment.getId());
        }
    }

    public void switchFragmentInternalWithoutAnim(Fragment fragment) {
        if (fragment != null) {
            switchFragmentInternalWithoutAnim(fragment, fragment.getId());
        }
    }

    public C9487b theCreate() {
        return this.mLifeCycleKeeper.f349699a;
    }

    public C9487b theResume() {
        return this.mLifeCycleKeeper.f349700b;
    }

    public C9487b theStart() {
        return this.mLifeCycleKeeper.f349700b;
    }

    public void switchFragmentActivity(Fragment fragment, int i) {
        switchFragment(fragment, i, true, true, C0966R.C0968anim.f2456di, C0966R.C0968anim.f2461dn);
        this.record.add(new WeakReference((MMFragment) fragment));
    }

    public void switchFragmentInternalBackwardWithAnim(Fragment fragment, int i) {
        switchFragment(fragment, i, false, true, C0966R.C0968anim.f2496ek, C0966R.C0968anim.f2506eu);
    }

    public void switchFragmentInternalBackwardWithAnimLeftSelfView(Fragment fragment, int i, View view) {
        switchFragment(fragment, i, false, true, 0, C0966R.C0968anim.f2506eu);
        if (view != null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, C0966R.C0968anim.f2496ek);
            if (loadAnimation != null) {
                view.startAnimation(loadAnimation);
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MMFragmentActivity", "switchFragmentInternalBackwardWithAnimLeftSelfView", "(Landroidx/fragment/app/Fragment;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MMFragmentActivity", "switchFragmentInternalBackwardWithAnimLeftSelfView", "(Landroidx/fragment/app/Fragment;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void switchFragmentInternalFarwardWithAnim(Fragment fragment, int i) {
        switchFragment(fragment, i, false, true, C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
    }

    public void switchFragmentInternalWithoutAnim(Fragment fragment, int i) {
        switchFragment(fragment, i, false, false, 0, 0);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        for (MMFragmentActivity$$h d : interceptors) {
            if (d.mo7676d(this, Util.nullAsNil(intent.getComponent() != null ? intent.getComponent().getClassName() : ""), intent)) {
                return;
            }
        }
        if (!C85927s.m106240a(this, this.mIsPaused, new Intent[]{intent}, Integer.valueOf(i), bundle)) {
            boolean isVASActivity = isVASActivity(intent);
            aReporter.mo146069a(intent, this, isVASActivity);
            if (intent != null) {
                C111559c.f333976a.mo163252e(intent);
            }
            if (isVASActivity) {
                startVASActivityForResult(intent, i, bundle);
            } else {
                super.startActivityForResult(intent, i, bundle);
            }
            initActivityOpenAnimation(intent);
        }
    }

    public void hideVKB(View view) {
        InputMethodManager inputMethodManager;
        IBinder windowToken;
        if (view != null && (inputMethodManager = (InputMethodManager) getSystemService("input_method")) != null && (windowToken = view.getWindowToken()) != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            } catch (IllegalArgumentException e) {
                Log.m105921e(TAG, "hide VKB(View) exception %s", e);
            }
        }
    }

    public void startActivities(Intent[] intentArr) {
        super.startActivities(intentArr);
        initActivityOpenAnimation((Intent) null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
        initActivityOpenAnimation(intent);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        for (MMFragmentActivity$$h d : interceptors) {
            if (d.mo7676d(this, Util.nullAsNil(intent.getComponent() != null ? intent.getComponent().getClassName() : ""), intent)) {
                return;
            }
        }
        if (!C85927s.m106240a(this, this.mIsPaused, new Intent[]{intent}, fragment, Integer.valueOf(i))) {
            super.startActivityFromFragment(fragment, intent, i, bundle);
        }
    }

    public MMFragmentActivity$$d startActivityForResult(Intent intent) {
        return startActivityForResult(intent, (Bundle) null);
    }

    public MMFragmentActivity$$d startActivityForResult(Intent intent, Bundle bundle) {
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        MMFragmentActivity$$i mMFragmentActivity$$i = new MMFragmentActivity$$i();
        C67074b<?> e = getActivityResultRegistry().mo164682e(String.valueOf(System.currentTimeMillis()), new C75464c(), mMFragmentActivity$$i);
        mMFragmentActivity$$i.f214429b = e;
        e.mo91081a(intent, (C118252b) null);
        return mMFragmentActivity$$i;
    }
}
