package com.tencent.kinda.framework.widget.base;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.framework.app.MainFragment;
import com.tencent.kinda.framework.widget.tools.ConstantsKinda;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di0.C86299o;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kr0.C76630x0;

public class FrLifeController {
    public static final String TAG = "MicroMsg.FragmentController";
    /* access modifiers changed from: private */
    public BaseFrActivity activity;
    private int fragmentCount = 0;
    /* access modifiers changed from: private */
    public Stack<BaseFragment> mFragmentBackStack;
    private boolean needTinyCallback = true;
    private MainFragment tinyAppFragment = null;
    private int tinyappCount = 0;
    private MainFragment webViewFragment = null;
    private int webviewCount = 0;

    public interface IFrLife {
        void onDestroyView();

        void onPause();

        void onResume();

        void onViewCreate(Bundle bundle);
    }

    public FrLifeController(BaseFrActivity baseFrActivity) {
        this.activity = baseFrActivity;
        FragmentManager.enableDebugLogging(true);
        this.activity.getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.C67088o() {
            public void onBackStackChanged() {
                FragmentManager supportFragmentManager = FrLifeController.this.activity.getSupportFragmentManager();
                Log.m105925i(FrLifeController.TAG, "onBackstackChanged: %s, fragments: %s", Integer.valueOf(supportFragmentManager.getBackStackEntryCount()), supportFragmentManager.getFragments());
            }
        });
        this.mFragmentBackStack = new Stack<>();
    }

    private void checkSwipeBackLayout() {
        if (this.activity.isSupportNavigationSwipeBack()) {
            int size = this.mFragmentBackStack.size();
            Log.m105925i(TAG, "checkSwipeBackLayout %s %s", Integer.valueOf(size), Integer.valueOf(this.activity.getFragmentManager().getBackStackEntryCount()));
            if (size > 1) {
                this.activity.getSwipeBackLayout().setEnableGesture(false);
            } else {
                this.activity.getSwipeBackLayout().setEnableGesture(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public BaseFragment getFragMent(int i) {
        Stack<BaseFragment> stack = this.mFragmentBackStack;
        if (!(stack == null || stack.size() == 0)) {
            if (i < 0) {
                int size = this.mFragmentBackStack.size() + i;
                if (size < 0 || size >= this.mFragmentBackStack.size()) {
                    return null;
                }
                Stack<BaseFragment> stack2 = this.mFragmentBackStack;
                return stack2.get(stack2.size() + i);
            } else if (i < this.mFragmentBackStack.size()) {
                return this.mFragmentBackStack.get(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void setAccessibilityState(boolean z, int i) {
        BaseFragment fragMent = getFragMent(i);
        if (fragMent == null) {
            Log.m105924i(TAG, "fragment is null");
        } else if (fragMent.getView() == null) {
            Log.m105924i(TAG, "fragment " + fragMent + " getView() is null");
        } else {
            ViewGroup viewGroup = (ViewGroup) fragMent.getView().findViewById(C67448R.C67449id.fge);
            if (viewGroup == null) {
                Log.m105920e(TAG, "fragment " + fragMent + " container is null");
                return;
            }
            if (z) {
                viewGroup.setImportantForAccessibility(1);
            } else {
                viewGroup.setImportantForAccessibility(4);
            }
            Log.m105919d(TAG, "accessibility fragment " + fragMent + " set %s", Boolean.valueOf(z));
        }
    }

    private void watchLife(final BaseFragment baseFragment) {
        if (baseFragment == null) {
            Log.m105920e(TAG, Util.stackTraceToString(new Throwable("Watch a null fragment!!")));
        } else {
            baseFragment.watchLife(new IFrLife() {
                public void onDestroyView() {
                    Log.m105924i(FrLifeController.TAG, "onDestroyView " + baseFragment);
                    if (FrLifeController.this.mFragmentBackStack.search(baseFragment) > 0) {
                        if (FrLifeController.this.getFragMent(-1) == baseFragment) {
                            FrLifeController.this.setAccessibilityState(true, -2);
                        } else {
                            FrLifeController.this.setAccessibilityState(true, -1);
                        }
                    }
                    BaseFragment coveredFragment = baseFragment.getCoveredFragment();
                    if (coveredFragment != null && coveredFragment.equals(FrLifeController.this.getFragMent(-1))) {
                        Log.m105924i(FrLifeController.TAG, "From onDestroyView, active covered fragment: " + coveredFragment);
                        coveredFragment.willActive();
                    }
                }

                public void onPause() {
                }

                public void onResume() {
                }

                public void onViewCreate(Bundle bundle) {
                    Log.m105924i(FrLifeController.TAG, "onViewCreate " + baseFragment);
                    if (!baseFragment.isActive()) {
                        Log.m105924i(FrLifeController.TAG, "From onResume, Active create view fragment: " + baseFragment);
                        baseFragment.willActive();
                    }
                    BaseFragment access$100 = FrLifeController.this.getFragMent(-2);
                    if (access$100 != null && (baseFragment instanceof MainFragment) && access$100.isActive()) {
                        Log.m105924i(FrLifeController.TAG, "From onCreateView, DeActive covered fragment: " + baseFragment);
                        access$100.willDeActive();
                        baseFragment.recordCoveredFragment(access$100);
                    }
                }
            });
        }
    }

    public boolean addFragment(BaseFragment baseFragment) {
        this.fragmentCount++;
        C112919c0 beginTransaction = this.activity.getSupportFragmentManager().beginTransaction();
        if (baseFragment instanceof MainFragment) {
            int i = baseFragment.enterAnimStyle;
            if (i == ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
                beginTransaction.mo165201m(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em, 0, 0);
            } else if (i == ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
                beginTransaction.mo165201m(C0966R.C0968anim.f2492eg, 0, 0, 0);
            }
        }
        beginTransaction.mo165167i(C67448R.C67449id.eem, baseFragment, (String) null, 1);
        watchLife(baseFragment);
        this.mFragmentBackStack.add(baseFragment);
        beginTransaction.mo165163e();
        Log.m105924i(TAG, "fragment [" + baseFragment + "] has add! current fragmentCount: " + this.fragmentCount);
        if (this.fragmentCount > 1) {
            setAccessibilityState(false, -2);
        }
        return true;
    }

    public BaseFragment getCurrent() {
        return BaseFrActivity.topShowFragmentOf(getFragmentList());
    }

    public List<Fragment> getFragmentList() {
        return this.mFragmentBackStack == null ? new ArrayList() : new ArrayList(this.mFragmentBackStack);
    }

    public int getFragmentListSize() {
        Log.m105925i(TAG, "getFragmentListSize: %d", Integer.valueOf(this.fragmentCount));
        return this.fragmentCount;
    }

    public boolean hasOpenH5OrTinyApp() {
        Log.m105925i(TAG, "hasOpenH5OrTinyApp, webviewCount: %d, tinyappCount: %d", Integer.valueOf(this.webviewCount), Integer.valueOf(this.tinyappCount));
        return this.webviewCount > 0 || this.tinyappCount > 0;
    }

    public void onActivityDestroy() {
        this.mFragmentBackStack.clear();
    }

    public boolean popFragment() {
        BaseFragment baseFragment;
        Log.m105925i(TAG, "popFragment, fragmentCount: %d, isStateSaved: %b", Integer.valueOf(this.fragmentCount), Boolean.valueOf(this.activity.getSupportFragmentManager().isStateSaved()));
        if (this.fragmentCount <= 1 || this.activity.getSupportFragmentManager().isStateSaved()) {
            Log.m105925i(TAG, "NO popFragment before return, fragmentCount: %d", Integer.valueOf(this.fragmentCount));
            if (this.fragmentCount == 1 && (baseFragment = BaseFrActivity.topShowFragmentOf(getFragmentList())) != null) {
                int i = baseFragment.enterAnimStyle;
                if (i == ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
                    this.activity.getIntent().putExtra(ConstantsKinda.INTENT_EXIT_ANIMATION, C0966R.C0968anim.f2506eu);
                } else if (i == ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
                    this.activity.getIntent().putExtra(ConstantsKinda.INTENT_EXIT_ANIMATION, C0966R.C0968anim.f2493eh);
                }
            }
            return false;
        }
        removeModal(BaseFrActivity.topShowFragmentOf(getFragmentList()));
        Log.m105925i(TAG, "popFragment to remove, fragmentCount: %d", Integer.valueOf(this.fragmentCount));
        return this.fragmentCount > 0;
    }

    public boolean processCallback(int i) {
        MainFragment mainFragment;
        MainFragment mainFragment2;
        if (i == 2 && this.webviewCount > 0 && (mainFragment2 = this.webViewFragment) != null) {
            mainFragment2.onDestroy();
            this.webViewFragment = null;
            this.webviewCount--;
            return true;
        } else if (i != 3 || this.tinyappCount <= 0 || (mainFragment = this.tinyAppFragment) == null || !this.needTinyCallback) {
            return false;
        } else {
            mainFragment.onDestroy();
            this.tinyAppFragment = null;
            this.tinyappCount--;
            return true;
        }
    }

    public boolean removeModal(BaseFragment baseFragment) {
        if (this.fragmentCount > 0) {
            if (baseFragment.isActive()) {
                baseFragment.willDeActive();
            }
            this.fragmentCount--;
            baseFragment.setWillBeRemoved(true);
            C112919c0 beginTransaction = this.activity.getSupportFragmentManager().beginTransaction();
            if (baseFragment instanceof MainFragment) {
                int i = baseFragment.enterAnimStyle;
                if (i == ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
                    beginTransaction.mo165201m(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2506eu, 0, 0);
                } else if (i == ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
                    beginTransaction.mo165201m(0, C0966R.C0968anim.f2493eh, 0, 0);
                }
            }
            beginTransaction.mo165169k(baseFragment);
            beginTransaction.mo165163e();
            this.mFragmentBackStack.remove(baseFragment);
            setAccessibilityState(true, -1);
        }
        Log.m105925i(TAG, "removeModal [%s] before return, fragmentCount: %d", baseFragment, Integer.valueOf(this.fragmentCount));
        return this.fragmentCount > 0;
    }

    public void setTinyCallbackTag(boolean z) {
        this.needTinyCallback = z;
    }

    public void startTinyAppUIPage(Bundle bundle, MainFragment mainFragment) {
        String string = bundle.getString(ConstantsKinda.INTENT_TINYAPP_USERNAME, "");
        String string2 = bundle.getString(ConstantsKinda.INTENT_TINYAPP_PATH, "");
        String string3 = bundle.getString(ConstantsKinda.INTENT_TINYAPP_VERSION, "");
        int i = bundle.getInt(ConstantsKinda.INTENT_TINYAPP_TYPE, 0);
        int i2 = bundle.getInt(ConstantsKinda.INTENT_TINYAPP_SCENE, 0);
        mainFragment.isTinyApp = true;
        mainFragment.tinyAppUserName = string;
        mainFragment.initPagePlatformDelegate();
        C86299o oVar = new C86299o();
        oVar.f250929a = string;
        oVar.f250934f = Util.nullAs(string2, "");
        if (i2 == 0) {
            oVar.f250939k = 1034;
        } else {
            oVar.f250939k = i2;
        }
        if (i == 0) {
            oVar.f250931c = 0;
        } else {
            oVar.f250931c = 2;
        }
        int i3 = Util.getInt(string3, 0);
        if (i3 > 0) {
            oVar.f250932d = i3;
        }
        oVar.f250945q = 3;
        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(this.activity, oVar);
        this.tinyAppFragment = mainFragment;
        this.tinyappCount++;
        if (this.fragmentCount == 0) {
            Log.m105924i(TAG, "only tinyApp,dont need TinyCallback");
            this.needTinyCallback = false;
            return;
        }
        this.needTinyCallback = true;
    }

    public void startWebViewUIPage(Bundle bundle, MainFragment mainFragment) {
        C75228t.m90220M(this.activity, bundle.getString(ConstantsKinda.INTENT_WEBVIEW_URL, ""), true, 2);
        this.webViewFragment = mainFragment;
        this.webviewCount++;
    }
}
