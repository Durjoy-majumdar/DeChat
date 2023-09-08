package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import cm3.C67406a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import java.util.ArrayList;
import java.util.Locale;
import nj3.C88990b;
import p605mj.C34575a;
import vo3.C78461f;

/* renamed from: com.tencent.mm.ui.MMFragment */
public abstract class MMFragment extends FragmentActivitySupport implements C67406a, View.OnAttachStateChangeListener {
    public static final int DEFAULT_TOAST_TIME = 3000;
    public static final String FLAG_OVERRIDE_ENTER_ANIMATION = "MMActivity.OverrideEnterAnimation";
    public static final String FLAG_OVERRIDE_EXIT_ANIMATION = "MMActivity.OverrideExitAnimation";
    private static final String TAG = "MicroMsg.MMFragment";
    private static final String TAG2 = "MicroMsg.INIT";
    private boolean bounceEnable = true;
    public String className;
    public MMActivityController mController = new C116045a();
    private boolean mCurVisible = false;
    private C67406a mListener;
    public AppCompatActivity mParent;
    private MMFragment mParentFragment;
    private boolean mParentVisible = false;
    private SwipeBackLayout mSwipeBackLayout;

    /* renamed from: com.tencent.mm.ui.MMFragment$a */
    public class C116045a extends MMActivityController {
        public C116045a() {
        }

        /* renamed from: N */
        public boolean mo177019N() {
            return MMFragment.this.isActionbarMenuUseOriginalSys();
        }

        /* renamed from: O */
        public boolean mo177020O() {
            return true;
        }

        /* renamed from: R */
        public boolean mo177021R() {
            return MMFragment.this.isLayoutInDecorView();
        }

        /* renamed from: X */
        public boolean mo177024X() {
            return MMFragment.this.noActionBar();
        }

        /* renamed from: Z */
        public void mo177025Z() {
            MMFragment.this.onCreateBeforeSetContentView();
        }

        /* renamed from: c0 */
        public void mo177026c0() {
            MMFragment.this.onKeyboardStateChanged();
        }

        /* renamed from: k */
        public void mo177028k(View view) {
            MMFragment.this.dealContentView(view);
        }

        /* renamed from: o */
        public boolean mo177029o() {
            return false;
        }

        /* renamed from: r */
        public String mo177030r() {
            return MMFragment.this.getClass().getName();
        }

        /* renamed from: u */
        public int mo177031u() {
            return MMFragment.this.getCustomBounceId();
        }

        /* renamed from: x */
        public String mo177032x() {
            return MMFragment.this.getIdentityString();
        }

        /* renamed from: y */
        public int mo177033y() {
            return MMFragment.this.getLayoutId();
        }

        /* renamed from: z */
        public View mo177034z() {
            return MMFragment.this.getLayoutView();
        }
    }

    /* renamed from: com.tencent.mm.ui.MMFragment$b */
    public class C116046b implements SwipeBackLayout.C19847c {
        public C116046b() {
        }

        public void onCancel() {
            MMFragment.this.onCancelDrag();
        }

        public void onDrag() {
            MMFragment.this.onDragBegin();
        }

        public void onSwipeBack() {
            MMFragment.this.onSwipeBack();
        }
    }

    public MMFragment() {
    }

    private void filterAndNotifyVisibility(boolean z) {
        filterAndNotifyVisibility(z, false);
    }

    public static Locale initLanguage(Context context) {
        return MMActivityController.m163188J(context);
    }

    private View initSwipeBack() {
        View contentView = getContentView();
        ViewGroup viewGroup = (ViewGroup) contentView.getParent();
        if (viewGroup != null) {
            this.mSwipeBackLayout = (SwipeBackLayout) LayoutInflater.from(thisActivity()).inflate(C0966R.C0971layout.c7z, viewGroup, false);
            viewGroup.removeView(contentView);
            viewGroup.addView(this.mSwipeBackLayout);
        } else {
            this.mSwipeBackLayout = (SwipeBackLayout) LayoutInflater.from(thisActivity()).inflate(C0966R.C0971layout.c7z, (ViewGroup) null);
        }
        this.mSwipeBackLayout.addView(contentView);
        this.mSwipeBackLayout.setContentView(contentView);
        this.mSwipeBackLayout.mo26381c(true);
        this.mSwipeBackLayout.setSwipeGestureDelegate(new C116046b());
        return this.mSwipeBackLayout;
    }

    public void activateBroadcast(boolean z) {
        this.mController.mo177069d(z);
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

    public void addSearchMenu(boolean z, C106742j1 j1Var) {
        this.mController.mo177078i(z, j1Var);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177076h(i, 0, str, false, onMenuItemClickListener, (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
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

    public void dealContentView(View view) {
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

    public MMActivityController.C116044q findMenuInfo(int i) {
        return this.mController.mo177035A(i);
    }

    public void finish() {
        super.finish();
        int intExtra = thisActivity().getIntent().getIntExtra("MMActivity.OverrideEnterAnimation", -1);
        int intExtra2 = thisActivity().getIntent().getIntExtra("MMActivity.OverrideExitAnimation", -1);
        if (intExtra != -1) {
            BackwardSupportUtil.AnimationHelper.overridePendingTransition(getContext(), intExtra, intExtra2);
        }
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

    public View getBodyView() {
        return this.mController.f348088b;
    }

    public C78461f getBounceView() {
        return this.mController.f348121u;
    }

    public final View getContentView() {
        return this.mController.mo177094s();
    }

    public MMActivityController getController() {
        return this.mController;
    }

    public int getCustomBounceId() {
        return -1;
    }

    public int getForceOrientation() {
        return this.mController.mo177101w();
    }

    public String getIdentityString() {
        return "";
    }

    public boolean getLandscapeMode() {
        return this.mController.f348123w;
    }

    public abstract int getLayoutId();

    public View getLayoutView() {
        return null;
    }

    public Resources getMMResources() {
        return thisActivity().getResources();
    }

    public String getMMString(int i) {
        return thisActivity().getString(i);
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

    public int getStreamMaxVolume(int i) {
        return this.mController.f348100h.getStreamMaxVolume(i);
    }

    public int getStreamVolume(int i) {
        return this.mController.f348100h.getStreamVolume(i);
    }

    public SwipeBackLayout getSwipeBackLayout() {
        return this.mSwipeBackLayout;
    }

    public int getTitleLocation() {
        ActionBar actionBar = this.mController.f348065F;
        if (actionBar == null) {
            return 0;
        }
        return actionBar.mo91101l();
    }

    public void hideTitleView() {
        this.mController.mo177043E();
    }

    public boolean hideVKB() {
        return this.mController.mo177045F();
    }

    public boolean interceptSupportInvalidateOptionsMenu() {
        if (!this.mController.mo177055L()) {
            return false;
        }
        this.mController.mo177047G0();
        return true;
    }

    public boolean isActionbarMenuUseOriginalSys() {
        return false;
    }

    public boolean isFragmentVisible() {
        return this.mCurVisible;
    }

    public boolean isLayoutInDecorView() {
        return false;
    }

    public boolean isScreenEnable() {
        return this.mController.f348102i;
    }

    public boolean isSupportCustomActionBar() {
        return isSupportNavigationSwipeBack();
    }

    public final boolean isSupportNavigationSwipeBack() {
        if (!C88990b.m111196e() || !C34575a.m40396a()) {
            return false;
        }
        return supportNavigationSwipeBack();
    }

    public boolean isTitleShowing() {
        return this.mController.mo177063S();
    }

    public int keyboardState() {
        return this.mController.f348099g0;
    }

    public boolean needShowIdcError() {
        return true;
    }

    public boolean noActionBar() {
        return false;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        Log.m105924i(TAG, "onAttach");
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof MMFragment)) {
            MMFragment mMFragment = (MMFragment) parentFragment;
            this.mParentFragment = mMFragment;
            mMFragment.setOnVisibilityChangedListener(this);
        }
        filterAndNotifyVisibility(true);
    }

    public void onCancelDrag() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mController.mo177065Y(thisActivity().getBaseContext(), (AppCompatActivity) thisActivity());
        this.mController.mo177103x0(thisActivity().getResources().getColor(C0966R.color.f2928b));
        MMActivityController mMActivityController = this.mController;
        boolean z = this.bounceEnable;
        mMActivityController.f348122v = z;
        C78461f fVar = mMActivityController.f348121u;
        if (fVar != null) {
            fVar.setBounceEnabled(z);
        }
    }

    public void onCreateBeforeSetContentView() {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (!this.mController.mo177066a0(menu)) {
            super.onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.m105924i(TAG, "onCreateView");
        setHasOptionsMenu(true);
        return isSupportNavigationSwipeBack() ? initSwipeBack() : getContentView();
    }

    public void onDestroy() {
        super.onDestroy();
        MMActivityController mMActivityController = this.mController;
        FragmentActivity activity = getActivity();
        mMActivityController.f348093d0.dead();
        mMActivityController.mo177041D();
        AndroidContextUtil.fixInputMethodManagerLeak(activity);
    }

    public void onDestroyView() {
        super.onDestroyView();
        getView().removeOnAttachStateChangeListener(this);
    }

    public void onDetach() {
        MMFragment mMFragment = this.mParentFragment;
        if (mMFragment != null) {
            mMFragment.setOnVisibilityChangedListener((C67406a) null);
        }
        super.onDetach();
        filterAndNotifyVisibility(false);
        this.mParentFragment = null;
    }

    public void onDragBegin() {
    }

    public void onFragmentVisibilityChanged(boolean z) {
        filterAndNotifyVisibility(z);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        filterAndNotifyVisibility(!z, z);
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
        return super.onKeyUp(i, keyEvent);
    }

    public void onKeyboardStateChanged() {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.mController.mo177070d0(menuItem);
    }

    public void onParentVisibilityChanged(boolean z) {
        this.mParentVisible = z;
        filterAndNotifyVisibility(z);
    }

    public void onPause() {
        long currentTimeMillis = System.currentTimeMillis();
        C30858i4.m39248a(2, this.className);
        super.onPause();
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177069d(false);
        mMActivityController.f348093d0.dead();
        Log.m105926v(TAG2, "KEVIN MMActivity onPause:" + (System.currentTimeMillis() - currentTimeMillis));
        onParentVisibilityChanged(false);
    }

    public void onPrepareOptionsMenu(Menu menu) {
        this.mController.mo177072e0(menu);
        super.onPrepareOptionsMenu(menu);
    }

    public void onResume() {
        long currentTimeMillis = System.currentTimeMillis();
        C30858i4.m39248a(1, this.className);
        super.onResume();
        Log.m105926v(TAG2, "KEVIN MMActivity super..onResume " + (System.currentTimeMillis() - currentTimeMillis));
        this.mController.mo177074f0();
        Log.m105926v(TAG2, "KEVIN MMActivity onResume :" + (System.currentTimeMillis() - currentTimeMillis));
        onParentVisibilityChanged(true);
    }

    public void onStart() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.mo177101w() == -1) {
            boolean z = mMActivityController.f348120t.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getBoolean("settings_landscape_mode", false);
            mMActivityController.f348123w = z;
            if (z) {
                mMActivityController.f348119s.setRequestedOrientation(-1);
            } else {
                mMActivityController.f348119s.setRequestedOrientation(1);
            }
        } else {
            mMActivityController.f348119s.setRequestedOrientation(mMActivityController.mo177101w());
        }
        super.onStart();
        onParentVisibilityChanged(true);
    }

    public void onStop() {
        super.onStop();
        onParentVisibilityChanged(false);
    }

    public void onSwipeBack() {
    }

    public void onViewAttachedToWindow(View view) {
        filterAndNotifyVisibility(true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        getView().addOnAttachStateChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        filterAndNotifyVisibility(false);
    }

    public void onVisibilityChanged(boolean z) {
        C67406a aVar = this.mListener;
        if (aVar != null) {
            aVar.onFragmentVisibilityChanged(z);
        }
        int i = -1;
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey(getClass().getName())) {
            i = arguments.getInt(getClass().getName());
        }
        Log.m105925i(TAG, "[onVisibilityChanged] visible:%s name:%s id:%s", Boolean.valueOf(z), getClass().getName(), Integer.valueOf(i));
    }

    public void removeAllOptionMenu() {
        MMActivityController mMActivityController = this.mController;
        if (!mMActivityController.f348062C.isEmpty()) {
            mMActivityController.f348062C.clear();
            mMActivityController.mo177047G0();
        }
    }

    public boolean removeOptionMenu(int i) {
        return this.mController.mo177077h0(i);
    }

    public void setActivityController(MMActivityController mMActivityController) {
        if (mMActivityController != null) {
            this.mController = mMActivityController;
        }
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177085m0(onMenuItemClickListener, 0);
    }

    public void setBackGroundColorResource(int i) {
        this.mController.mo177087n0(i);
    }

    public final void setBodyView(int i) {
        this.mController.mo177088o0(i);
    }

    public void setBounceEnabled(boolean z) {
        this.bounceEnable = z;
        MMActivityController mMActivityController = this.mController;
        mMActivityController.f348122v = z;
        C78461f fVar = mMActivityController.f348121u;
        if (fVar != null) {
            fVar.setBounceEnabled(z);
        }
    }

    public void setMMNormalView() {
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController.f348120t != null) {
            mMActivityController.mo177048H(mMActivityController.f348119s);
        }
    }

    public void setMMSubTitle(String str) {
        this.mController.mo177097t0(str);
    }

    public void setMMSubTitleColor(int i) {
    }

    public void setMMTitle(String str) {
        this.mController.mo177100v0(str);
    }

    public void setOnVisibilityChangedListener(C67406a aVar) {
        this.mListener = aVar;
    }

    public void setParent(AppCompatActivity appCompatActivity) {
        this.mParent = appCompatActivity;
    }

    @Deprecated
    public void setRedDotVisibilty(int i) {
    }

    public void setScreenEnable(boolean z) {
        this.mController.mo177104y0(z);
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

    public void setUserVisibleHint(boolean z) {
        Log.m105925i(TAG, "[setUserVisibleHint] isVisibleToUser:%s name:%s", Boolean.valueOf(z), getClass().getName());
        super.setUserVisibleHint(z);
        filterAndNotifyVisibility(z);
    }

    public void showHomeBtn(boolean z) {
        this.mController.mo177040C0(z);
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

    public void startActivity(Intent intent) {
        startActivityReal(intent);
    }

    public void startActivityReal(Intent intent) {
        super.startActivity(intent);
    }

    public boolean supportNavigationSwipeBack() {
        return true;
    }

    public FragmentActivity thisActivity() {
        return this.mController.mo177096t() != null ? this.mController.mo177096t() : super.getActivity();
    }

    public Resources thisResources() {
        FragmentActivity activity = super.getActivity();
        return activity == null ? MMApplicationContext.getContext().getResources() : activity.getResources();
    }

    public void updateDescription(String str) {
        this.mController.mo177054K0(str);
    }

    public void updateOptionMenu(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        updateOptionMenu(i, i2, i3, false, onMenuItemClickListener);
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

    public void updateOptionMenuRedDot(int i, boolean z) {
        this.mController.mo177057M0(i, z);
    }

    public void updateOptionMenuText(int i, String str) {
        this.mController.mo177058N0(i, str);
    }

    private void filterAndNotifyVisibility(boolean z, boolean z2) {
        if (z != this.mCurVisible) {
            MMFragment mMFragment = this.mParentFragment;
            boolean isFragmentVisible = mMFragment == null ? this.mParentVisible : mMFragment.isFragmentVisible();
            boolean isVisible = super.isVisible();
            boolean userVisibleHint = getUserVisibleHint();
            boolean z3 = isFragmentVisible && isVisible && userVisibleHint && !z2;
            Log.m105925i(TAG, "[filterAndNotifyVisibility] visible = %s parent = %s, super = %s, hint = %s name:%s", Boolean.valueOf(z3), Boolean.valueOf(isFragmentVisible), Boolean.valueOf(isVisible), Boolean.valueOf(userVisibleHint), getClass().getName());
            if (z3 != this.mCurVisible) {
                this.mCurVisible = z3;
                onVisibilityChanged(z3);
            }
        }
    }

    public final Activity getContext() {
        return this.mController.mo177096t();
    }

    public String getMMString(int i, Object... objArr) {
        return thisActivity().getString(i, objArr);
    }

    public boolean hideVKB(View view) {
        return this.mController.mo177046G(view);
    }

    public void setBackBtn(MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i) {
        this.mController.mo177085m0(onMenuItemClickListener, i);
    }

    public void setMMSubTitle(int i) {
        this.mController.mo177095s0(i);
    }

    public void setMMTitle(int i) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177100v0(mMActivityController.f348120t.getString(i));
    }

    public void updateOptionMenu(int i, int i2, int i3, boolean z, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177058N0(i, mMActivityController.mo177096t().getString(i2));
        this.mController.mo177056L0(i, i3);
        MMActivityController.C116044q A = this.mController.mo177035A(i);
        if (A != null) {
            A.f348152m = onMenuItemClickListener;
            A.f348153n = null;
        }
        this.mController.mo177057M0(i, z);
        MMActivityController mMActivityController2 = this.mController;
        MMActivityController.C116044q A2 = mMActivityController2.mo177035A(i);
        mMActivityController2.mo177079i0(A2.f348140a);
        mMActivityController2.f348062C.add(A2);
        mMActivityController2.mo177047G0();
    }

    public void enableOptionMenu(int i, boolean z) {
        this.mController.mo177083l(false, i, z);
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

    public void addIconOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i3) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.getClass();
        MMActivityController.C73075r rVar = MMActivityController.C73075r.NORMAL;
        MMActivityController.C116044q qVar = new MMActivityController.C116044q();
        qVar.f348140a = i;
        qVar.f348142c = i3;
        qVar.f348141b = i2;
        qVar.f348146g = "";
        qVar.f348152m = onMenuItemClickListener;
        qVar.f348153n = null;
        qVar.f348150k = rVar;
        qVar.f348151l = false;
        if ((i2 == C0966R.C0969drawable.agr || i2 == C0966R.raw.icons_outlined_more || i2 == C0966R.raw.actionbar_icon_dark_more) && Util.isNullOrNil("")) {
            qVar.f348146g = mMActivityController.f348120t.getString(C0966R.string.a0h);
        }
        mMActivityController.mo177079i0(qVar.f348140a);
        mMActivityController.f348062C.add(qVar);
        mMActivityController.mo177047G0();
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        this.mController.mo177076h(i, 0, str, false, onMenuItemClickListener, onLongClickListener, MMActivityController.C73075r.NORMAL);
    }

    public MMFragment(boolean z) {
        super(z);
    }

    public void addTextOptionMenu(int i, String str, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener, MMActivityController.C73075r rVar) {
        this.mController.mo177076h(i, 0, str, false, onMenuItemClickListener, onLongClickListener, rVar);
    }

    public void updateOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i3) {
        this.mController.mo177056L0(i, i2);
        MMActivityController.C116044q A = this.mController.mo177035A(i);
        if (A != null) {
            A.f348152m = onMenuItemClickListener;
            A.f348153n = null;
        }
        MMActivityController mMActivityController = this.mController;
        MMActivityController.C116044q A2 = mMActivityController.mo177035A(i);
        if (!(A2 == null || A2.f348141b == i2)) {
            A2.f348141b = i2;
            A2.f348142c = i3;
            mMActivityController.mo177047G0();
        }
        MMActivityController mMActivityController2 = this.mController;
        MMActivityController.C116044q A3 = mMActivityController2.mo177035A(i);
        mMActivityController2.mo177079i0(A3.f348140a);
        mMActivityController2.f348062C.add(A3);
        mMActivityController2.mo177047G0();
    }

    public void addIconOptionMenu(int i, String str, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177073f(i, str, i2, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177071e(i, i2, i3, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i, int i2, int i3, boolean z, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177076h(i, i3, mMActivityController.f348120t.getString(i2), z, onMenuItemClickListener, (View.OnLongClickListener) null, MMActivityController.C73075r.NORMAL);
    }

    public void addIconOptionMenu(int i, int i2, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        this.mController.mo177076h(i, i2, "", false, onMenuItemClickListener, onLongClickListener, MMActivityController.C73075r.NORMAL);
    }

    public void addIconOptionMenu(int i, int i2, int i3, MenuItem.OnMenuItemClickListener onMenuItemClickListener, View.OnLongClickListener onLongClickListener) {
        MMActivityController mMActivityController = this.mController;
        mMActivityController.mo177076h(i, i3, mMActivityController.f348120t.getString(i2), false, onMenuItemClickListener, onLongClickListener, MMActivityController.C73075r.NORMAL);
    }

    public void addIconOptionMenu(int i, int i2, Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177075g(i, getString(i2), drawable, onMenuItemClickListener);
    }

    public void addIconOptionMenu(int i, String str, Drawable drawable, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.mController.mo177075g(i, str, drawable, onMenuItemClickListener);
    }
}
