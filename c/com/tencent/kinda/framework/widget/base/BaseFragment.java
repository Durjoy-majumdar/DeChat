package com.tencent.kinda.framework.widget.base;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.fragment.app.Fragment;
import com.facebook.yoga.android.YogaLayout;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.animate.KindaAnimatorWatch;
import com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl;
import com.tencent.kinda.framework.widget.PlatformWrapLayout;
import com.tencent.kinda.framework.widget.base.FrLifeController;
import com.tencent.kinda.framework.widget.tools.ColorUtil;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.DynamicColor;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.LeftBarButtonType;
import com.tencent.kinda.gen.NavigationBarConfig;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C116182x1;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p206nj.C88956h;
import xb3.C78781k;
import yb3.C79064a;
import yi3.C112467b;

public abstract class BaseFragment extends LifecycleFragment implements View.OnTouchListener {
    public static final String TAG = "MicroMsg.BaseFragment";
    private byte _hellAccFlag_;
    public int enterAnimStyle = 1;
    public IEventFragment fragEvent;
    private boolean isActive = false;
    private boolean isEnterBackground = false;
    public boolean isTinyApp = false;
    private FrLifeController.IFrLife life;
    private ActionBarContainer mActionBarContainer = null;
    private BaseFragment mCoveredFragment;
    public C116182x1 mCustomActioinBarController = null;
    private C78781k mReportUIC;
    public String mReportUrl;
    public UIPagePlatformDelegateImpl pagePlatformDelegate;
    public UIPagePlatformFuncDelegateImpl pagePlatformFuncDelegate;
    public boolean showSingleActionStWcKbWhenHide = false;
    private long statusBarColor = -1;
    public FrameLayout statusBarSpaceView;
    public String tinyAppUserName = "";
    public UIModalFuncDelegateImpl uiModalFuncDelegate;
    private MMHandler wcpayKeyboardAnimationHandler = null;
    private boolean willBeRemoved = false;

    public BaseFragment() {
        KindaAnimatorWatch.didObjCreated(hashCode());
    }

    private void calculateStatusBarColor(int i) {
        if (Build.VERSION.SDK_INT < 23 || C88956h.m111064e()) {
            i = C74933u4.m89765b(getResources().getColor(C0966R.color.aec), i);
        }
        this.statusBarSpaceView.setBackgroundColor(i);
        getController().mo177049H0(C74933u4.m89770g(i));
        getController().mo177059O0(getActivity(), 0);
        getController().mo177103x0(getResources().getColor(C0966R.color.f2927a));
    }

    public void addCustomReportEvent(String str, C79064a aVar) {
        this.mReportUIC.mo108699c3(str, aVar);
    }

    public void addLifecycleReportEvent(C78781k.C78782a aVar, C79064a aVar2) {
        this.mReportUIC.mo108700d3(aVar, aVar2);
    }

    public ITransmitKvData covertPlatformData(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ITransmitKvData create = ITransmitKvData.create();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null) {
                if (obj instanceof String) {
                    create.putString(next, (String) obj);
                } else if (obj instanceof Long) {
                    create.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    create.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.get(0) instanceof String) {
                        create.putListString(next, arrayList);
                    } else if (arrayList.get(0) instanceof Long) {
                        create.putListLong(next, arrayList);
                    } else if (arrayList.get(0) instanceof Integer) {
                        create.putListInt(next, arrayList);
                    }
                }
            }
        }
        return create;
    }

    public void dealContentView(View view) {
        super.dealContentView(view);
        if (isSupportCustomActionBar()) {
            if (this.mActionBarContainer == null) {
                this.mActionBarContainer = (ActionBarContainer) ((ViewStub) view.findViewById(C67448R.C67449id.fgb)).inflate();
            }
            this.mCustomActioinBarController.f348687u0.f336740i = (ViewGroup) view;
        }
    }

    public View findViewById(int i) {
        if (getView() != null) {
            return getView().findViewById(i);
        }
        if (getActivity() != null) {
            return getActivity().findViewById(i);
        }
        return null;
    }

    public BaseFragment getCoveredFragment() {
        return this.mCoveredFragment;
    }

    public boolean getIsEnterBackground() {
        return this.isEnterBackground;
    }

    public int getLayoutId() {
        return C67448R.C67450layout.b3g;
    }

    public Fragment getPrevFragment() {
        int indexOf;
        if (getFragmentManager() != null) {
            List<Fragment> fragments = getFragmentManager().getFragments();
            if (fragments.size() > 1 && (indexOf = fragments.indexOf(this) - 1) >= 0) {
                return fragments.get(indexOf);
            }
        }
        return null;
    }

    public abstract String getReportUrl();

    public abstract String getTagName();

    public MMHandler getWcpayKeyboardAnimationHandler() {
        if (this.wcpayKeyboardAnimationHandler == null) {
            this.wcpayKeyboardAnimationHandler = new MMHandler();
        }
        return this.wcpayKeyboardAnimationHandler;
    }

    public boolean getWillBeRemoved() {
        return this.willBeRemoved;
    }

    public void hideKeyboard() {
        getController().mo177045F();
        View findViewById = findViewById(C0966R.C0970id.f359359kh1);
        if (findViewById != null && (getActivity() instanceof BaseFrActivity)) {
            ((BaseFrActivity) getActivity()).hideTenpayKB(findViewById, new WeakReference(this));
        }
        hideWcPayKeyboard();
    }

    public void hideWcPayKeyboard() {
        WcPayKeyboard wcPayKeyboard = (WcPayKeyboard) findViewById(C67448R.C67449id.lkw);
        if (wcPayKeyboard == null) {
            return;
        }
        if (this.showSingleActionStWcKbWhenHide) {
            wcPayKeyboard.mo104753p();
        } else {
            wcPayKeyboard.mo104741f();
        }
    }

    public abstract void initOnCreate();

    public void initPagePlatformDelegate() {
        this.pagePlatformDelegate = new UIPagePlatformDelegateImpl(getActivity());
        this.pagePlatformFuncDelegate = new UIPagePlatformFuncDelegateImpl(this);
        this.uiModalFuncDelegate = new UIModalFuncDelegateImpl(this);
    }

    public void initPageView() {
        YogaLayout yogaLayout = new YogaLayout(getActivity());
        yogaLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((ViewGroup) getView().findViewById(C67448R.C67449id.container)).addView(yogaLayout);
        Log.m105925i(TAG, "initPageView rootLayout %s", yogaLayout);
        onCreateLayout(new PlatformWrapLayout(yogaLayout));
    }

    public void initWithNavigationBarConfig(NavigationBarConfig navigationBarConfig) {
        WeImageView weImageView;
        boolean z = true;
        boolean z2 = false;
        Log.m105925i(TAG, "NavigationBarConfig: %s", navigationBarConfig);
        if (navigationBarConfig != null && getController().f348065F != null) {
            DynamicColor dynamicColor = navigationBarConfig.mBackgroundColor;
            if (dynamicColor != null) {
                int colorByMode = (int) ColorUtil.getColorByMode(dynamicColor);
                getController().f348065F.mo91112w(new ColorDrawable(colorByMode));
                calculateStatusBarColor(colorByMode);
                getController().mo177103x0(colorByMode);
            }
            String str = navigationBarConfig.mBarTitle;
            if (str != null) {
                setMMTitle(str);
            }
            DynamicColor dynamicColor2 = navigationBarConfig.mTitleColor;
            if (!(dynamicColor2 == null || dynamicColor2.mNormalColor == 0)) {
                MMActivityController controller = getController();
                int i = (int) navigationBarConfig.mTitleColor.mNormalColor;
                if (controller.f348065F != null) {
                    Log.m105919d("MicroMsg.MMActivityController", "setMMTitleColor color: %s.", Integer.valueOf(i));
                    controller.f348066G.setTextColor(i);
                }
            }
            DynamicColor dynamicColor3 = navigationBarConfig.mLeftButtonColor;
            if (!(dynamicColor3 == null || dynamicColor3.getNormalColor() == 0)) {
                if (MMKViewUtil.argbColor(navigationBarConfig.mLeftButtonColor.getNormalColor()) != -1) {
                    z = false;
                }
                WeImageView weImageView2 = getController().f348069J;
                if (weImageView2 != null) {
                    weImageView2.clearColorFilter();
                }
                WeImageView weImageView3 = getController().f348069J;
                if (weImageView3 != null) {
                    weImageView3.setEnableColorFilter(false);
                }
                z2 = z;
            }
            ActionBar actionBar = getController().f348065F;
            if (actionBar != null) {
                actionBar.mo91089G(0.0f);
            }
            LeftBarButtonType leftBarButtonType = navigationBarConfig.mLeftBarButtonType;
            if (leftBarButtonType == LeftBarButtonType.BACK) {
                setBackBtn(new MenuItem.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        BaseFragment.this.popFragment();
                        return true;
                    }
                }, z2 ? C0966R.raw.actionbar_icon_light_back : C0966R.raw.actionbar_icon_dark_back);
            } else if (leftBarButtonType == LeftBarButtonType.CANCEL) {
                setBackBtn(new MenuItem.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        BaseFragment.this.popFragment();
                        return true;
                    }
                }, z2 ? C0966R.raw.actionbar_icon_light_close : C0966R.raw.actionbar_icon_dark_close);
            } else if (leftBarButtonType == LeftBarButtonType.NONE && (weImageView = getController().f348069J) != null) {
                weImageView.setVisibility(8);
            }
            DynamicColor dynamicColor4 = navigationBarConfig.mLeftButtonColor;
            if (!(dynamicColor4 == null || MMKViewUtil.argbColor(dynamicColor4.getNormalColor()) == 0 || navigationBarConfig.mLeftButtonColor.getNormalColor() != navigationBarConfig.mRightButtonColor.getNormalColor())) {
                getController().mo177082k0(MMKViewUtil.argbColor(ColorUtil.getColorByMode(navigationBarConfig.mLeftButtonColor)));
            }
            setTopRightBtnImage(navigationBarConfig.mRightButtonImage);
            setTopRightBtnTitle(navigationBarConfig.mRightButtonTitle, navigationBarConfig.mRightButtonColor);
        }
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isContainSecureView() {
        UIPagePlatformDelegateImpl uIPagePlatformDelegateImpl = this.pagePlatformDelegate;
        if (uIPagePlatformDelegateImpl != null) {
            int size = uIPagePlatformDelegateImpl.getSecureViews().size();
            Log.m105925i(TAG, "Fragment contains secure view size: %s.", Integer.valueOf(size));
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isSupportCustomActionBar() {
        return true;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Log.m105919d(TAG, "onActivityCreated %s %s", getTagName(), this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (isSupportCustomActionBar()) {
            C116182x1 x1Var = new C116182x1();
            this.mCustomActioinBarController = x1Var;
            x1Var.f348685s0 = this;
            x1Var.f348687u0 = new C112467b(thisActivity(), x1Var);
            setActivityController(this.mCustomActioinBarController);
        }
        this.mReportUIC = new C78781k((Fragment) this);
    }

    public abstract boolean onBackPressed();

    public void onCreate(Bundle bundle) {
        Log.m105919d(TAG, "onCreate %s %s", getTagName(), this);
        super.onCreate(bundle);
    }

    public abstract void onCreateLayout(PlatformWrapLayout platformWrapLayout);

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.m105919d(TAG, "onDestroyView %s %s", getTagName(), this);
        this.pagePlatformDelegate = null;
        this.pagePlatformFuncDelegate = null;
        this.uiModalFuncDelegate = null;
        restoreActionBarColor();
        FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onDestroyView();
        }
        this.life = null;
    }

    public void onDetach() {
        Log.m105919d(TAG, "onDetach %s %s", getTagName(), this);
        super.onDetach();
        this.fragEvent = null;
    }

    public void onFirstLayoutFinished() {
    }

    public void onFirstRenderFinish() {
    }

    public /* bridge */ /* synthetic */ void onFragmentOnCreate() {
        super.onFragmentOnCreate();
    }

    public void onFragmentOnDestroy() {
        super.onFragmentOnDestroy();
        this.pagePlatformFuncDelegate = null;
        this.mCustomActioinBarController = null;
        this.mReportUIC.onDestroy();
    }

    public void onFragmentOnPause() {
        super.onFragmentOnPause();
        if (isContainSecureView()) {
            getActivity().getWindow().clearFlags(8192);
        }
        this.mReportUIC.onPause();
        Log.m105919d(TAG, "lifecycle: onFragmentOnPause, class: %s", toString());
    }

    public void onFragmentOnResume() {
        super.onFragmentOnResume();
        if (isContainSecureView()) {
            getActivity().getWindow().addFlags(8192);
        }
        this.mReportUIC.onResume();
        Log.m105919d(TAG, "lifecycle: onFragmentOnResume, class: %s", toString());
    }

    public /* bridge */ /* synthetic */ void onFragmentOnStart() {
        super.onFragmentOnStart();
    }

    public /* bridge */ /* synthetic */ void onFragmentOnStop() {
        super.onFragmentOnStop();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            getActivity().getWindow().clearFlags(8192);
        } else if (isContainSecureView()) {
            getActivity().getWindow().addFlags(8192);
        }
        Log.m105925i(TAG, "onHiddenChanged %s", Boolean.valueOf(z));
    }

    public abstract void onKeyboardShow(boolean z, int i);

    public void onPause() {
        super.onPause();
        Log.m105919d(TAG, "onPause %s %s", getTagName(), this);
        FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onPause();
        }
    }

    public void onResume() {
        Log.m105919d(TAG, "onResume %s %s", getTagName(), this);
        super.onResume();
        FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onResume();
        }
    }

    public /* bridge */ /* synthetic */ void onStart() {
        super.onStart();
    }

    public /* bridge */ /* synthetic */ void onStop() {
        super.onStop();
    }

    public void onSwipeBack() {
        super.onSwipeBack();
        Log.m105919d(TAG, "onSwipeBack %s %s", getTagName(), this);
        this.fragEvent.popFragment();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/kinda/framework/widget/base/BaseFragment", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Log.m105926v(TAG, "on touch");
        C117292a.m165362h(true, this, "com/tencent/kinda/framework/widget/base/BaseFragment", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void onViewCreated(final View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.statusBarSpaceView = (FrameLayout) view.findViewById(C67448R.C67449id.fgf);
        int o = C85875k4.m106198o(getContext());
        ViewGroup.LayoutParams layoutParams = this.statusBarSpaceView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = o;
            this.statusBarSpaceView.setLayoutParams(layoutParams);
        }
        Log.m105919d(TAG, "onViewCreated %s %s", getTagName(), this);
        this.pagePlatformDelegate = new UIPagePlatformDelegateImpl(getActivity());
        this.pagePlatformFuncDelegate = new UIPagePlatformFuncDelegateImpl(this);
        this.uiModalFuncDelegate = new UIModalFuncDelegateImpl(this);
        if (usePanelModalMode()) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/BaseFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        initOnCreate();
        KindaAnimatorWatch.didViewCreated(hashCode());
        view.setOnTouchListener(this);
        view.setClickable(true);
        view.setImportantForAccessibility(2);
        view.post(new Runnable() {
            private byte _hellAccFlag_;

            public void run() {
                BaseFragment.this.onFirstRenderFinish();
                BaseFragment.this.onFirstLayoutFinished();
                if (BaseFragment.this.usePanelModalMode()) {
                    View view = view;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/kinda/framework/widget/base/BaseFragment$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/kinda/framework/widget/base/BaseFragment$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
        FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onViewCreate(bundle);
        }
        this.mReportUIC.onCreate((Bundle) null);
    }

    public void popFragment() {
        IEventFragment iEventFragment = this.fragEvent;
        if (iEventFragment != null) {
            iEventFragment.popFragment();
        }
    }

    public void recordCoveredFragment(BaseFragment baseFragment) {
        this.mCoveredFragment = baseFragment;
    }

    public void restoreActionBarColor() {
    }

    public void setActionBarColor(int i) {
        if (getContext() != null) {
            getController().f348065F.mo91112w(new ColorDrawable(i));
            calculateStatusBarColor(i);
        }
    }

    public void setIsEnterBackground(boolean z) {
        this.isEnterBackground = z;
    }

    public abstract void setTopRightBtnImage(String str);

    public abstract void setTopRightBtnTitle(String str, DynamicColor dynamicColor);

    public void setWillBeRemoved(boolean z) {
        this.willBeRemoved = z;
    }

    public boolean supportNavigationSwipeBack() {
        return false;
    }

    public void triggerReport(C78781k.C78782a aVar, String str) {
        this.mReportUIC.mo108702f3(aVar, str);
    }

    public boolean useImmediateKeyboardAnimation() {
        return false;
    }

    public boolean useKeyboardCoverMode() {
        return false;
    }

    public boolean usePanelModalMode() {
        return false;
    }

    public void watchLife(FrLifeController.IFrLife iFrLife) {
        this.life = iFrLife;
    }

    public void willActive() {
        Log.m105919d(TAG, "willActive %s %s", getTagName(), this);
        this.isActive = true;
    }

    public void willDeActive() {
        this.isActive = false;
        Log.m105919d(TAG, "willDeActive %s %s", getTagName(), this);
    }

    public void onAttach(Activity activity) {
        Log.m105919d(TAG, "onAttach %s %s", getTagName(), this);
        super.onAttach(activity);
        try {
            this.fragEvent = (IEventFragment) activity;
        } catch (ClassCastException unused) {
            Log.m105920e(TAG, "error IEventFragment");
        }
    }
}
