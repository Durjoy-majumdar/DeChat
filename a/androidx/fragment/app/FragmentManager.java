package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.activity.C112842b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C67073a;
import androidx.activity.result.C67074b;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.C112935j0;
import androidx.fragment.app.C112943n;
import androidx.fragment.app.C112962t;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C60958c;
import k20.C9556a;
import p1042u.C90590d;
import p431e.C116634a;
import p834a3.C112741b;
import p918s2.C118252b;

public abstract class FragmentManager {
    private static boolean DEBUG = false;
    private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    public static final String TAG = "FragmentManager";
    public static boolean USE_STATE_MANAGER = true;
    private byte _hellAccFlag_;
    public ArrayList<C112910a> mBackStack;
    private ArrayList<C67088o> mBackStackChangeListeners;
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private C112946o mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    public int mCurState = -1;
    private C112959r0 mDefaultSpecialEffectsControllerFactory = new C112896f(this);
    private boolean mDestroyed;
    private Runnable mExecCommit = new C112897g();
    private boolean mExecutingActions;
    private Map<Fragment, HashSet<C112741b>> mExitAnimationCancellationSignals = Collections.synchronizedMap(new HashMap());
    private C112949q mFragmentFactory = null;
    /* access modifiers changed from: private */
    public final C112917b0 mFragmentStore = new C112917b0();
    private final C112935j0.C112936a mFragmentTransitionCallback = new C112894d();
    private boolean mHavePendingDeferredStart;
    private C112958r<?> mHost;
    private C112949q mHostFragmentFactory = new C112895e();
    public ArrayDeque<LaunchedFragmentInfo> mLaunchedFragments = new ArrayDeque<>();
    private final C112960s mLayoutInflaterFactory = new C112960s(this);
    private final C112962t mLifecycleCallbacksDispatcher = new C112962t(this);
    private boolean mNeedMenuInvalidate;
    private C112965v mNonConfig;
    private final CopyOnWriteArrayList<C112967w> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final C112842b mOnBackPressedCallback = new C112893c(false);
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private Fragment mParent;
    private final ArrayList<C112903p> mPendingActions = new ArrayList<>();
    private ArrayList<C112905r> mPostponedTransactions;
    public Fragment mPrimaryNav;
    private C67074b<String[]> mRequestPermissions;
    /* access modifiers changed from: private */
    public final Map<String, C112902n> mResultListeners = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
    private C112959r0 mSpecialEffectsControllerFactory = null;
    private C67074b<Intent> mStartActivityForResult;
    private C67074b<IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<C112910a> mTmpRecords;

    /* renamed from: androidx.fragment.app.FragmentManager$m */
    public static abstract class C67087m {
    }

    /* renamed from: androidx.fragment.app.FragmentManager$o */
    public interface C67088o {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    public class C103744h extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f306479d;

        /* renamed from: e */
        public final /* synthetic */ View f306480e;

        /* renamed from: f */
        public final /* synthetic */ Fragment f306481f;

        public C103744h(FragmentManager fragmentManager, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f306479d = viewGroup;
            this.f306480e = view;
            this.f306481f = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f306479d.endViewTransition(this.f306480e);
            animator.removeListener(this);
            Fragment fragment = this.f306481f;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "androidx/fragment/app/FragmentManager$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "androidx/fragment/app/FragmentManager$7", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    public class C112891a implements C67073a<ActivityResult> {
        public C112891a() {
        }

        /* renamed from: a */
        public void mo91080a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f337959d;
                int i = pollFirst.f337960e;
                Fragment c = FragmentManager.this.mFragmentStore.mo165191c(str);
                if (c != null) {
                    c.onActivityResult(i, activityResult.f337841d, activityResult.f337842e);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    public class C112892b implements C67073a<Map<String, Boolean>> {
        public C112892b() {
        }

        /* renamed from: a */
        public void mo91080a(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f337959d;
                int i2 = pollFirst.f337960e;
                Fragment c = FragmentManager.this.mFragmentStore.mo165191c(str);
                if (c != null) {
                    c.onRequestPermissionsResult(i2, strArr, iArr);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    public class C112893c extends C112842b {
        public C112893c(boolean z) {
            super(z);
        }

        public void handleOnBackPressed() {
            FragmentManager.this.handleOnBackPressed();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    public class C112894d implements C112935j0.C112936a {
        public C112894d() {
        }

        /* renamed from: a */
        public void mo165134a(Fragment fragment, C112741b bVar) {
            boolean z;
            synchronized (bVar) {
                z = bVar.f337597a;
            }
            if (!z) {
                FragmentManager.this.removeCancellationSignal(fragment, bVar);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    public class C112895e extends C112949q {
        public C112895e() {
        }

        /* renamed from: a */
        public Fragment mo165135a(ClassLoader classLoader, String str) {
            C112958r<?> host = FragmentManager.this.getHost();
            Context context = FragmentManager.this.getHost().f338160e;
            host.getClass();
            return Fragment.instantiate(context, str, (Bundle) null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public class C112896f implements C112959r0 {
        public C112896f(FragmentManager fragmentManager) {
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    public class C112897g implements Runnable {
        public C112897g() {
        }

        public void run() {
            FragmentManager.this.execPendingActions(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    public class C112898i implements C112967w {

        /* renamed from: d */
        public final /* synthetic */ Fragment f337967d;

        public C112898i(FragmentManager fragmentManager, Fragment fragment) {
            this.f337967d = fragment;
        }

        /* renamed from: a */
        public void mo164995a(FragmentManager fragmentManager, Fragment fragment) {
            this.f337967d.onAttachFragment(fragment);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$j */
    public class C112899j implements C67073a<ActivityResult> {
        public C112899j() {
        }

        /* renamed from: a */
        public void mo91080a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.mLaunchedFragments.pollFirst();
            if (pollFirst != null) {
                String str = pollFirst.f337959d;
                int i = pollFirst.f337960e;
                Fragment c = FragmentManager.this.mFragmentStore.mo165191c(str);
                if (c != null) {
                    c.onActivityResult(i, activityResult.f337841d, activityResult.f337842e);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$k */
    public interface C112900k {
        String getName();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$l */
    public static class C112901l extends C116634a<IntentSenderRequest, ActivityResult> {
        /* renamed from: a */
        public Intent mo105808a(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.f337866e;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra(FragmentManager.EXTRA_CREATED_FILLIN_INTENT, false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f337865d, (Intent) null, intentSenderRequest.f337867f, intentSenderRequest.f337868g);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.isLoggingEnabled(2)) {
                intent.toString();
            }
            return intent;
        }

        /* renamed from: c */
        public Object mo105809c(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$n */
    public static class C112902n implements C112969y {

        /* renamed from: a */
        public final C39623j f337969a;

        /* renamed from: b */
        public final C112969y f337970b;

        /* renamed from: c */
        public final C103764p f337971c;

        public C112902n(C39623j jVar, C112969y yVar, C103764p pVar) {
            this.f337969a = jVar;
            this.f337970b = yVar;
            this.f337971c = pVar;
        }

        /* renamed from: a */
        public void mo165138a(String str, Bundle bundle) {
            ((C112902n) this.f337970b).mo165138a(str, bundle);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$p */
    public interface C112903p {
        /* renamed from: a */
        boolean mo165139a(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$q */
    public class C112904q implements C112903p {

        /* renamed from: a */
        public final String f337972a;

        /* renamed from: b */
        public final int f337973b;

        /* renamed from: c */
        public final int f337974c;

        public C112904q(String str, int i, int i2) {
            this.f337972a = str;
            this.f337973b = i;
            this.f337974c = i2;
        }

        /* renamed from: a */
        public boolean mo165139a(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.mPrimaryNav;
            if (fragment != null && this.f337973b < 0 && this.f337972a == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
                return false;
            }
            return FragmentManager.this.popBackStackState(arrayList, arrayList2, this.f337972a, this.f337973b, this.f337974c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$r */
    public static class C112905r implements Fragment.C112885l {

        /* renamed from: a */
        public final boolean f337976a;

        /* renamed from: b */
        public final C112910a f337977b;

        /* renamed from: c */
        public int f337978c;

        public C112905r(C112910a aVar, boolean z) {
            this.f337976a = z;
            this.f337977b = aVar;
        }

        /* renamed from: a */
        public void mo165140a() {
            boolean z = this.f337978c > 0;
            for (Fragment next : this.f337977b.f338004q.getFragments()) {
                next.setOnStartEnterTransitionListener((Fragment.C112885l) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            C112910a aVar = this.f337977b;
            aVar.f338004q.completeExecute(aVar, this.f337976a, !z, true);
        }
    }

    private void addAddedFragments(C90590d<Fragment> dVar) {
        int i = this.mCurState;
        if (i >= 1) {
            int min = Math.min(i, 5);
            for (Fragment next : this.mFragmentStore.mo165194f()) {
                if (next.mState < min) {
                    moveToState(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        dVar.add(next);
                    }
                }
            }
        }
    }

    private void cancelExitAnimation(Fragment fragment) {
        HashSet hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C112741b) it.next()).mo164500a();
            }
            hashSet.clear();
            destroyFragmentView(fragment);
            this.mExitAnimationCancellationSignals.remove(fragment);
        }
    }

    private void checkStateLoss() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    private Set<C112950q0> collectAllSpecialEffectsController() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.mFragmentStore.mo165192d()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C112970z) it.next()).f338187c.mContainer;
            if (viewGroup != null) {
                hashSet.add(C112950q0.m154552g(viewGroup, getSpecialEffectsControllerFactory()));
            }
        }
        return hashSet;
    }

    private Set<C112950q0> collectChangedControllers(ArrayList<C112910a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C112919c0.C112920a> it = arrayList.get(i).f338026a.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f338043b;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(C112950q0.m154552g(viewGroup, getSpecialEffectsControllerFactory()));
                }
            }
            i++;
        }
        return hashSet;
    }

    private void completeShowHideFragment(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C112943n.C112944a a = C112943n.m154542a(this.mHost.f338160e, fragment, !fragment.mHidden, fragment.getPopDirection());
            if (a == null || (animator = a.f338122b) == null) {
                if (a != null) {
                    fragment.mView.startAnimation(a.f338121a);
                    a.f338121a.start();
                }
                int i = (!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8;
                View view = fragment.mView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    View view3 = fragment.mView;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "androidx/fragment/app/FragmentManager", "completeShowHideFragment", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view5 = fragment.mView;
                    viewGroup.startViewTransition(view5);
                    a.f338122b.addListener(new C103744h(this, viewGroup, view5, fragment));
                }
                a.f338122b.start();
            }
        }
        invalidateMenuForFragment(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    private void destroyFragmentView(Fragment fragment) {
        fragment.performDestroyView();
        this.mLifecycleCallbacksDispatcher.mo165266n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(Fragment fragment) {
        if (fragment != null && fragment.equals(findActiveFragment(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* JADX INFO: finally extract failed */
    private void dispatchStateChange(int i) {
        try {
            this.mExecutingActions = true;
            for (C112970z next : this.mFragmentStore.f338019b.values()) {
                if (next != null) {
                    next.f338189e = i;
                }
            }
            moveToState(i, false);
            if (USE_STATE_MANAGER) {
                for (C112950q0 e : collectAllSpecialEffectsController()) {
                    e.mo165235e();
                }
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    @Deprecated
    public static void enableDebugLogging(boolean z) {
        DEBUG = z;
    }

    public static void enableNewStateManager(boolean z) {
        USE_STATE_MANAGER = z;
    }

    private void endAnimatingAwayFragments() {
        if (USE_STATE_MANAGER) {
            for (C112950q0 e : collectAllSpecialEffectsController()) {
                e.mo165235e();
            }
        } else if (!this.mExitAnimationCancellationSignals.isEmpty()) {
            for (Fragment next : this.mExitAnimationCancellationSignals.keySet()) {
                cancelExitAnimation(next);
                moveToState(next);
            }
        }
    }

    private void ensureExecReady(boolean z) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.mHost.f338161f.getLooper()) {
            if (!z) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList<>();
                this.mTmpIsPop = new ArrayList<>();
            }
            this.mExecutingActions = true;
            try {
                executePostponedTransaction((ArrayList<C112910a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.mExecutingActions = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private static void executeOps(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C112910a aVar = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                aVar.mo165172p(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo165176t(z);
            } else {
                aVar.mo165172p(1);
                aVar.mo165175s();
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void executeOpsTogether(java.util.ArrayList<androidx.fragment.app.C112910a> r21, java.util.ArrayList<java.lang.Boolean> r22, int r23, int r24) {
        /*
            r20 = this;
            r6 = r20
            r15 = r21
            r5 = r22
            r4 = r23
            r3 = r24
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.C112910a) r0
            boolean r2 = r0.f338041p
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mTmpAddedFragments = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            androidx.fragment.app.b0 r1 = r6.mFragmentStore
            java.util.List r1 = r1.mo165194f()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r20.getPrimaryNavigationFragment()
            r7 = r4
            r16 = 0
        L_0x0033:
            r14 = 1
            if (r7 >= r3) goto L_0x016e
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C112910a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r11 = 3
            if (r9 != 0) goto L_0x0123
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.mTmpAddedFragments
            r12 = 0
        L_0x004c:
            java.util.ArrayList<androidx.fragment.app.c0$a> r13 = r8.f338026a
            int r13 = r13.size()
            if (r12 >= r13) goto L_0x0121
            java.util.ArrayList<androidx.fragment.app.c0$a> r13 = r8.f338026a
            java.lang.Object r13 = r13.get(r12)
            androidx.fragment.app.c0$a r13 = (androidx.fragment.app.C112919c0.C112920a) r13
            int r1 = r13.f338042a
            if (r1 == r14) goto L_0x0114
            r10 = 2
            r14 = 9
            if (r1 == r10) goto L_0x009a
            if (r1 == r11) goto L_0x0081
            r10 = 6
            if (r1 == r10) goto L_0x0081
            r10 = 7
            if (r1 == r10) goto L_0x0114
            r10 = 8
            if (r1 == r10) goto L_0x0072
            goto L_0x0097
        L_0x0072:
            java.util.ArrayList<androidx.fragment.app.c0$a> r1 = r8.f338026a
            androidx.fragment.app.c0$a r10 = new androidx.fragment.app.c0$a
            r10.<init>(r14, r0)
            r1.add(r12, r10)
            int r12 = r12 + 1
            androidx.fragment.app.Fragment r0 = r13.f338043b
            goto L_0x0097
        L_0x0081:
            androidx.fragment.app.Fragment r1 = r13.f338043b
            r9.remove(r1)
            androidx.fragment.app.Fragment r1 = r13.f338043b
            if (r1 != r0) goto L_0x0097
            java.util.ArrayList<androidx.fragment.app.c0$a> r0 = r8.f338026a
            androidx.fragment.app.c0$a r10 = new androidx.fragment.app.c0$a
            r10.<init>(r14, r1)
            r0.add(r12, r10)
            int r12 = r12 + 1
            r0 = 0
        L_0x0097:
            r4 = 1
            goto L_0x011a
        L_0x009a:
            androidx.fragment.app.Fragment r1 = r13.f338043b
            int r10 = r1.mContainerId
            int r18 = r9.size()
            r17 = 1
            int r18 = r18 + -1
            r11 = r18
            r18 = 0
        L_0x00aa:
            if (r11 < 0) goto L_0x0103
            java.lang.Object r19 = r9.get(r11)
            r14 = r19
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r4 = r14.mContainerId
            if (r4 != r10) goto L_0x00f8
            if (r14 != r1) goto L_0x00bf
            r19 = r10
            r18 = 1
            goto L_0x00fa
        L_0x00bf:
            if (r14 != r0) goto L_0x00d3
            java.util.ArrayList<androidx.fragment.app.c0$a> r0 = r8.f338026a
            androidx.fragment.app.c0$a r4 = new androidx.fragment.app.c0$a
            r19 = r10
            r10 = 9
            r4.<init>(r10, r14)
            r0.add(r12, r4)
            int r12 = r12 + 1
            r0 = 0
            goto L_0x00d7
        L_0x00d3:
            r19 = r10
            r10 = 9
        L_0x00d7:
            androidx.fragment.app.c0$a r4 = new androidx.fragment.app.c0$a
            r10 = 3
            r4.<init>(r10, r14)
            int r10 = r13.f338044c
            r4.f338044c = r10
            int r10 = r13.f338046e
            r4.f338046e = r10
            int r10 = r13.f338045d
            r4.f338045d = r10
            int r10 = r13.f338047f
            r4.f338047f = r10
            java.util.ArrayList<androidx.fragment.app.c0$a> r10 = r8.f338026a
            r10.add(r12, r4)
            r9.remove(r14)
            r4 = 1
            int r12 = r12 + r4
            goto L_0x00fa
        L_0x00f8:
            r19 = r10
        L_0x00fa:
            int r11 = r11 + -1
            r4 = r23
            r10 = r19
            r14 = 9
            goto L_0x00aa
        L_0x0103:
            if (r18 == 0) goto L_0x010d
            java.util.ArrayList<androidx.fragment.app.c0$a> r1 = r8.f338026a
            r1.remove(r12)
            int r12 = r12 + -1
            goto L_0x0097
        L_0x010d:
            r4 = 1
            r13.f338042a = r4
            r9.add(r1)
            goto L_0x011a
        L_0x0114:
            r4 = 1
            androidx.fragment.app.Fragment r1 = r13.f338043b
            r9.add(r1)
        L_0x011a:
            int r12 = r12 + r4
            r4 = r23
            r11 = 3
            r14 = 1
            goto L_0x004c
        L_0x0121:
            r4 = 1
            goto L_0x015c
        L_0x0123:
            r4 = 1
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mTmpAddedFragments
            java.util.ArrayList<androidx.fragment.app.c0$a> r9 = r8.f338026a
            int r9 = r9.size()
            int r9 = r9 - r4
        L_0x012d:
            if (r9 < 0) goto L_0x015c
            java.util.ArrayList<androidx.fragment.app.c0$a> r10 = r8.f338026a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.c0$a r10 = (androidx.fragment.app.C112919c0.C112920a) r10
            int r11 = r10.f338042a
            if (r11 == r4) goto L_0x0152
            r4 = 3
            if (r11 == r4) goto L_0x014c
            switch(r11) {
                case 6: goto L_0x014c;
                case 7: goto L_0x0153;
                case 8: goto L_0x014a;
                case 9: goto L_0x0147;
                case 10: goto L_0x0142;
                default: goto L_0x0141;
            }
        L_0x0141:
            goto L_0x0158
        L_0x0142:
            androidx.lifecycle.j$c r11 = r10.f338048g
            r10.f338049h = r11
            goto L_0x0158
        L_0x0147:
            androidx.fragment.app.Fragment r0 = r10.f338043b
            goto L_0x0158
        L_0x014a:
            r0 = 0
            goto L_0x0158
        L_0x014c:
            androidx.fragment.app.Fragment r10 = r10.f338043b
            r1.add(r10)
            goto L_0x0158
        L_0x0152:
            r4 = 3
        L_0x0153:
            androidx.fragment.app.Fragment r10 = r10.f338043b
            r1.remove(r10)
        L_0x0158:
            int r9 = r9 + -1
            r4 = 1
            goto L_0x012d
        L_0x015c:
            if (r16 != 0) goto L_0x0166
            boolean r1 = r8.f338032g
            if (r1 == 0) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            r16 = 0
            goto L_0x0168
        L_0x0166:
            r16 = 1
        L_0x0168:
            int r7 = r7 + 1
            r4 = r23
            goto L_0x0033
        L_0x016e:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mTmpAddedFragments
            r0.clear()
            if (r2 != 0) goto L_0x01c5
            int r0 = r6.mCurState
            r1 = 1
            if (r0 < r1) goto L_0x01c5
            boolean r0 = USE_STATE_MANAGER
            if (r0 == 0) goto L_0x01af
            r0 = r23
        L_0x0180:
            if (r0 >= r3) goto L_0x01c5
            java.lang.Object r4 = r15.get(r0)
            androidx.fragment.app.a r4 = (androidx.fragment.app.C112910a) r4
            java.util.ArrayList<androidx.fragment.app.c0$a> r4 = r4.f338026a
            java.util.Iterator r4 = r4.iterator()
        L_0x018e:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01ac
            java.lang.Object r7 = r4.next()
            androidx.fragment.app.c0$a r7 = (androidx.fragment.app.C112919c0.C112920a) r7
            androidx.fragment.app.Fragment r7 = r7.f338043b
            if (r7 == 0) goto L_0x018e
            androidx.fragment.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x018e
            androidx.fragment.app.z r7 = r6.createOrGetFragmentStateManager(r7)
            androidx.fragment.app.b0 r8 = r6.mFragmentStore
            r8.mo165195g(r7)
            goto L_0x018e
        L_0x01ac:
            int r0 = r0 + 1
            goto L_0x0180
        L_0x01af:
            androidx.fragment.app.r<?> r0 = r6.mHost
            android.content.Context r7 = r0.f338160e
            androidx.fragment.app.o r8 = r6.mContainer
            r13 = 0
            androidx.fragment.app.j0$a r14 = r6.mFragmentTransitionCallback
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r4 = 1
            androidx.fragment.app.C112935j0.m154517l(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01c6
        L_0x01c5:
            r4 = 1
        L_0x01c6:
            executeOps(r21, r22, r23, r24)
            boolean r0 = USE_STATE_MANAGER
            if (r0 == 0) goto L_0x024d
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = r23
        L_0x01db:
            if (r1 >= r3) goto L_0x0225
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C112910a) r2
            if (r0 == 0) goto L_0x0204
            java.util.ArrayList<androidx.fragment.app.c0$a> r7 = r2.f338026a
            int r7 = r7.size()
            int r7 = r7 - r4
        L_0x01ec:
            if (r7 < 0) goto L_0x0222
            java.util.ArrayList<androidx.fragment.app.c0$a> r8 = r2.f338026a
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.c0$a r8 = (androidx.fragment.app.C112919c0.C112920a) r8
            androidx.fragment.app.Fragment r8 = r8.f338043b
            if (r8 == 0) goto L_0x0201
            androidx.fragment.app.z r8 = r6.createOrGetFragmentStateManager(r8)
            r8.mo165284k()
        L_0x0201:
            int r7 = r7 + -1
            goto L_0x01ec
        L_0x0204:
            java.util.ArrayList<androidx.fragment.app.c0$a> r2 = r2.f338026a
            java.util.Iterator r2 = r2.iterator()
        L_0x020a:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x0222
            java.lang.Object r7 = r2.next()
            androidx.fragment.app.c0$a r7 = (androidx.fragment.app.C112919c0.C112920a) r7
            androidx.fragment.app.Fragment r7 = r7.f338043b
            if (r7 == 0) goto L_0x020a
            androidx.fragment.app.z r7 = r6.createOrGetFragmentStateManager(r7)
            r7.mo165284k()
            goto L_0x020a
        L_0x0222:
            int r1 = r1 + 1
            goto L_0x01db
        L_0x0225:
            int r1 = r6.mCurState
            r6.moveToState((int) r1, (boolean) r4)
            r7 = r23
            java.util.Set r1 = r6.collectChangedControllers(r15, r7, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0234:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0249
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.q0 r2 = (androidx.fragment.app.C112950q0) r2
            r2.f338135d = r0
            r2.mo165236h()
            r2.mo165233c()
            goto L_0x0234
        L_0x0249:
            r0 = r3
            r3 = r5
            goto L_0x02a3
        L_0x024d:
            r7 = r23
            if (r2 == 0) goto L_0x0271
            u.d r8 = new u.d
            r8.<init>()
            r6.addAddedFragments(r8)
            r0 = r20
            r1 = r21
            r9 = r2
            r2 = r22
            r14 = r3
            r3 = r23
            r13 = r7
            r12 = 1
            r4 = r24
            r11 = r5
            r5 = r8
            int r0 = r0.postponePostponableTransactions(r1, r2, r3, r4, r5)
            r6.makeRemovedFragmentsInvisible(r8)
            goto L_0x0277
        L_0x0271:
            r9 = r2
            r14 = r3
            r11 = r5
            r13 = r7
            r12 = 1
            r0 = r14
        L_0x0277:
            if (r0 == r13) goto L_0x02a1
            if (r9 == 0) goto L_0x02a1
            int r1 = r6.mCurState
            if (r1 < r12) goto L_0x0298
            androidx.fragment.app.r<?> r1 = r6.mHost
            android.content.Context r7 = r1.f338160e
            androidx.fragment.app.o r8 = r6.mContainer
            r1 = 1
            androidx.fragment.app.j0$a r2 = r6.mFragmentTransitionCallback
            r9 = r21
            r10 = r22
            r3 = r11
            r11 = r23
            r4 = 1
            r12 = r0
            r13 = r1
            r0 = r14
            r14 = r2
            androidx.fragment.app.C112935j0.m154517l(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x029b
        L_0x0298:
            r3 = r11
            r0 = r14
            r4 = 1
        L_0x029b:
            int r1 = r6.mCurState
            r6.moveToState((int) r1, (boolean) r4)
            goto L_0x02a3
        L_0x02a1:
            r3 = r11
            r0 = r14
        L_0x02a3:
            r1 = r23
        L_0x02a5:
            if (r1 >= r0) goto L_0x02c6
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C112910a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x02c0
            int r4 = r2.f338006s
            if (r4 < 0) goto L_0x02c0
            r4 = -1
            r2.f338006s = r4
        L_0x02c0:
            r2.getClass()
            int r1 = r1 + 1
            goto L_0x02a5
        L_0x02c6:
            if (r16 == 0) goto L_0x02cb
            r20.reportBackStackChanged()
        L_0x02cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.executeOpsTogether(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void executePostponedTransaction(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<C112905r> arrayList3 = this.mPostponedTransactions;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C112905r rVar = this.mPostponedTransactions.get(i);
            if (arrayList == null || rVar.f337976a || (indexOf2 = arrayList.indexOf(rVar.f337977b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((rVar.f337978c == 0) || (arrayList != null && rVar.f337977b.mo165179v(arrayList, 0, arrayList.size()))) {
                    this.mPostponedTransactions.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || rVar.f337976a || (indexOf = arrayList.indexOf(rVar.f337977b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        rVar.mo165140a();
                    } else {
                        C112910a aVar = rVar.f337977b;
                        aVar.f338004q.completeExecute(aVar, rVar.f337976a, false, false);
                    }
                }
            } else {
                this.mPostponedTransactions.remove(i);
                i--;
                size--;
                C112910a aVar2 = rVar.f337977b;
                aVar2.f338004q.completeExecute(aVar2, rVar.f337976a, false, false);
            }
            i++;
        }
    }

    public static <F extends Fragment> F findFragment(View view) {
        F findViewFragment = findViewFragment(view);
        if (findViewFragment != null) {
            return findViewFragment;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    public static FragmentManager findFragmentManager(View view) {
        Fragment findViewFragment = findViewFragment(view);
        if (findViewFragment == null) {
            Context context = view.getContext();
            FragmentActivity fragmentActivity = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (findViewFragment.isAdded()) {
            return findViewFragment.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + findViewFragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    private static Fragment findViewFragment(View view) {
        while (view != null) {
            Fragment viewFragment = getViewFragment(view);
            if (viewFragment != null) {
                return viewFragment;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void forcePostponedTransactions() {
        if (USE_STATE_MANAGER) {
            for (C112950q0 next : collectAllSpecialEffectsController()) {
                if (next.f338136e) {
                    next.f338136e = false;
                    next.mo165233c();
                }
            }
        } else if (this.mPostponedTransactions != null) {
            while (!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).mo165140a();
            }
        }
    }

    private boolean generateOpsForPendingActions(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            int size = this.mPendingActions.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.mPendingActions.get(i).mo165139a(arrayList, arrayList2);
            }
            this.mPendingActions.clear();
            this.mHost.f338161f.removeCallbacks(this.mExecCommit);
            return z;
        }
    }

    private C112965v getChildNonConfig(Fragment fragment) {
        C112965v vVar = this.mNonConfig;
        C112965v vVar2 = vVar.f338174e.get(fragment.mWho);
        if (vVar2 != null) {
            return vVar2;
        }
        C112965v vVar3 = new C112965v(vVar.f338176g);
        vVar.f338174e.put(fragment.mWho, vVar3);
        return vVar3;
    }

    private ViewGroup getFragmentContainer(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.mo164814c()) {
            View b = this.mContainer.mo164813b(fragment.mContainerId);
            if (b instanceof ViewGroup) {
                return (ViewGroup) b;
            }
        }
        return null;
    }

    public static Fragment getViewFragment(View view) {
        Object tag = view.getTag(C0966R.C0970id.eel);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean isLoggingEnabled(int i) {
        return DEBUG || Log.isLoggable(TAG, i);
    }

    private boolean isMenuAvailable(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.checkForMenus();
    }

    private void makeRemovedFragmentsInvisible(C90590d<Fragment> dVar) {
        int i = dVar.f260295f;
        for (int i2 = 0; i2 < i; i2++) {
            Fragment fragment = (Fragment) dVar.f260294e[i2];
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                View view = requireView;
                C117292a.m165358d(view, aVar.mo10232b(), "androidx/fragment/app/FragmentManager", "makeRemovedFragmentsInvisible", "(Landroidx/collection/ArraySet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                requireView.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view, "androidx/fragment/app/FragmentManager", "makeRemovedFragmentsInvisible", "(Landroidx/collection/ArraySet;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    private int postponePostponableTransactions(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C90590d<Fragment> dVar) {
        boolean z;
        boolean z2;
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C112910a aVar = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            int i5 = 0;
            while (true) {
                z = true;
                if (i5 >= aVar.f338026a.size()) {
                    z2 = false;
                    break;
                } else if (C112910a.m154457w(aVar.f338026a.get(i5))) {
                    z2 = true;
                    break;
                } else {
                    i5++;
                }
            }
            if (!z2 || aVar.mo165179v(arrayList, i4 + 1, i2)) {
                z = false;
            }
            if (z) {
                if (this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new ArrayList<>();
                }
                C112905r rVar = new C112905r(aVar, booleanValue);
                this.mPostponedTransactions.add(rVar);
                for (int i6 = 0; i6 < aVar.f338026a.size(); i6++) {
                    C112919c0.C112920a aVar2 = aVar.f338026a.get(i6);
                    if (C112910a.m154457w(aVar2)) {
                        aVar2.f338043b.setOnStartEnterTransitionListener(rVar);
                    }
                }
                if (booleanValue) {
                    aVar.mo165175s();
                } else {
                    aVar.mo165176t(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                addAddedFragments(dVar);
            }
        }
        return i3;
    }

    private void removeRedundantOperationsAndExecute(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                executePostponedTransaction(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).f338041p) {
                        if (i2 != i) {
                            executeOpsTogether(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).f338041p) {
                                i2++;
                            }
                        }
                        executeOpsTogether(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    executeOpsTogether(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                this.mBackStackChangeListeners.get(i).onBackStackChanged();
            }
        }
    }

    public static int reverseTransit(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void setVisibleRemovingFragment(Fragment fragment) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (fragmentContainer.getTag(C0966R.C0970id.l9v) == null) {
                fragmentContainer.setTag(C0966R.C0970id.l9v, fragment);
            }
            ((Fragment) fragmentContainer.getTag(C0966R.C0970id.l9v)).setPopDirection(fragment.getPopDirection());
        }
    }

    private void startPendingDeferredFragments() {
        Iterator it = ((ArrayList) this.mFragmentStore.mo165192d()).iterator();
        while (it.hasNext()) {
            performPendingDeferredStart((C112970z) it.next());
        }
    }

    private void throwException(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new C67091p0(TAG));
        C112958r<?> rVar = this.mHost;
        if (rVar != null) {
            try {
                rVar.mo164996d("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            dump("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (getBackStackEntryCount() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (isPrimaryNavigation(r3.mParent) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.mOnBackPressedCallback;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$p> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$p> r1 = r3.mPendingActions     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.mOnBackPressedCallback     // Catch:{ all -> 0x002a }
            r1.setEnabled(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.setEnabled(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.updateOnBackPressedCallbackEnabled():void");
    }

    public void addBackStackState(C112910a aVar) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(aVar);
    }

    public void addCancellationSignal(Fragment fragment, C112741b bVar) {
        if (this.mExitAnimationCancellationSignals.get(fragment) == null) {
            this.mExitAnimationCancellationSignals.put(fragment, new HashSet());
        }
        this.mExitAnimationCancellationSignals.get(fragment).add(bVar);
    }

    public C112970z addFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        C112970z createOrGetFragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.mo165195g(createOrGetFragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.mo165189a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return createOrGetFragmentStateManager;
    }

    public void addFragmentOnAttachListener(C112967w wVar) {
        this.mOnAttachListeners.add(wVar);
    }

    public void addOnBackStackChangedListener(C67088o oVar) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(oVar);
    }

    public void addRetainedFragment(Fragment fragment) {
        this.mNonConfig.mo165267c3(fragment);
    }

    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachController(androidx.fragment.app.C112958r<?> r3, androidx.fragment.app.C112946o r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.r<?> r0 = r2.mHost
            if (r0 != 0) goto L_0x0111
            r2.mHost = r3
            r2.mContainer = r4
            r2.mParent = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$i r4 = new androidx.fragment.app.FragmentManager$i
            r4.<init>(r2, r5)
            r2.addFragmentOnAttachListener(r4)
            goto L_0x001f
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.C112967w
            if (r4 == 0) goto L_0x001f
            r4 = r3
            androidx.fragment.app.w r4 = (androidx.fragment.app.C112967w) r4
            r2.addFragmentOnAttachListener(r4)
        L_0x001f:
            androidx.fragment.app.Fragment r4 = r2.mParent
            if (r4 == 0) goto L_0x0026
            r2.updateOnBackPressedCallbackEnabled()
        L_0x0026:
            boolean r4 = r3 instanceof androidx.activity.C103394c
            if (r4 == 0) goto L_0x003b
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.C103394c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.mOnBackPressedDispatcher = r0
            if (r5 == 0) goto L_0x0036
            r4 = r5
        L_0x0036:
            androidx.activity.b r1 = r2.mOnBackPressedCallback
            r0.mo164666a(r4, r1)
        L_0x003b:
            if (r5 == 0) goto L_0x0046
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.v r3 = r3.getChildNonConfig(r5)
            r2.mNonConfig = r3
            goto L_0x006a
        L_0x0046:
            boolean r4 = r3 instanceof androidx.lifecycle.C0123n0
            if (r4 == 0) goto L_0x0062
            androidx.lifecycle.n0 r3 = (androidx.lifecycle.C0123n0) r3
            androidx.lifecycle.m0 r3 = r3.getViewModelStore()
            androidx.lifecycle.k0 r4 = new androidx.lifecycle.k0
            androidx.lifecycle.k0$b r0 = androidx.fragment.app.C112965v.f338172n
            r4.<init>((androidx.lifecycle.C39630m0) r3, (androidx.lifecycle.C54209k0.C54210b) r0)
            java.lang.Class<androidx.fragment.app.v> r3 = androidx.fragment.app.C112965v.class
            androidx.lifecycle.i0 r3 = r4.mo75002a(r3)
            androidx.fragment.app.v r3 = (androidx.fragment.app.C112965v) r3
            r2.mNonConfig = r3
            goto L_0x006a
        L_0x0062:
            androidx.fragment.app.v r3 = new androidx.fragment.app.v
            r4 = 0
            r3.<init>(r4)
            r2.mNonConfig = r3
        L_0x006a:
            androidx.fragment.app.v r3 = r2.mNonConfig
            boolean r4 = r2.isStateSaved()
            r3.f338179j = r4
            androidx.fragment.app.b0 r3 = r2.mFragmentStore
            androidx.fragment.app.v r4 = r2.mNonConfig
            r3.f338020c = r4
            androidx.fragment.app.r<?> r3 = r2.mHost
            boolean r4 = r3 instanceof androidx.activity.result.C112850c
            if (r4 == 0) goto L_0x0110
            androidx.activity.result.c r3 = (androidx.activity.result.C112850c) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x009a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x009c
        L_0x009a:
            java.lang.String r4 = ""
        L_0x009c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            e.c r0 = new e.c
            r0.<init>()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.activity.result.b r5 = r3.mo164682e(r5, r0, r1)
            r2.mStartActivityForResult = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$l r0 = new androidx.fragment.app.FragmentManager$l
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.b r5 = r3.mo164682e(r5, r0, r1)
            r2.mStartIntentSenderForResult = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            e.b r5 = new e.b
            r5.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            androidx.activity.result.b r3 = r3.mo164682e(r4, r5, r0)
            r2.mRequestPermissions = r3
        L_0x0110:
            return
        L_0x0111:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.attachController(androidx.fragment.app.r, androidx.fragment.app.o, androidx.fragment.app.Fragment):void");
    }

    public void attachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.mo165189a(fragment);
                if (isLoggingEnabled(2)) {
                    fragment.toString();
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    public C112919c0 beginTransaction() {
        return new C112910a(this);
    }

    public boolean checkForMenus() {
        Iterator it = ((ArrayList) this.mFragmentStore.mo165193e()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                z = isMenuAvailable(fragment);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void clearFragmentResult(String str) {
        this.mResults.remove(str);
    }

    public final void clearFragmentResultListener(String str) {
        C112902n remove = this.mResultListeners.remove(str);
        if (remove != null) {
            remove.f337969a.removeObserver(remove.f337971c);
        }
    }

    public void completeExecute(C112910a aVar, boolean z, boolean z2, boolean z3) {
        C112910a aVar2 = aVar;
        boolean z4 = z3;
        if (z) {
            aVar2.mo165176t(z4);
        } else {
            aVar.mo165175s();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar2);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.mCurState >= 1) {
            C112935j0.m154517l(this.mHost.f338160e, this.mContainer, arrayList, arrayList2, 0, 1, true, this.mFragmentTransitionCallback);
        }
        if (z4) {
            moveToState(this.mCurState, true);
        }
        Iterator it = ((ArrayList) this.mFragmentStore.mo165193e()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar2.mo165178u(fragment.mContainerId)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    View view = fragment.mView;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(Float.valueOf(f));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar3.mo10232b(), "androidx/fragment/app/FragmentManager", "completeExecute", "(Landroidx/fragment/app/BackStackRecord;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view2, "androidx/fragment/app/FragmentManager", "completeExecute", "(Landroidx/fragment/app/BackStackRecord;ZZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                if (z4) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public C112970z createOrGetFragmentStateManager(Fragment fragment) {
        C112917b0 b0Var = this.mFragmentStore;
        C112970z zVar = b0Var.f338019b.get(fragment.mWho);
        if (zVar != null) {
            return zVar;
        }
        C112970z zVar2 = new C112970z(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        zVar2.mo165285l(this.mHost.f338160e.getClassLoader());
        zVar2.f338189e = this.mCurState;
        return zVar2;
    }

    public void detachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    fragment.toString();
                }
                C112917b0 b0Var = this.mFragmentStore;
                synchronized (b0Var.f338018a) {
                    b0Var.f338018a.remove(fragment);
                }
                fragment.mAdded = false;
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                setVisibleRemovingFragment(fragment);
            }
        }
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f338179j = false;
        dispatchStateChange(4);
    }

    public void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f338179j = false;
        dispatchStateChange(0);
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f338179j = false;
        dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null && isParentMenuVisible(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment fragment = this.mCreatedMenus.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        dispatchStateChange(-1);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        C67074b<Intent> bVar = this.mStartActivityForResult;
        if (bVar != null) {
            bVar.mo91082b();
            this.mStartIntentSenderForResult.mo91082b();
            this.mRequestPermissions.mo91082b();
        }
    }

    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    public void dispatchLowMemory() {
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean z) {
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
            }
        }
    }

    public void dispatchOnAttachFragment(Fragment fragment) {
        Iterator<C112967w> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().mo164995a(this, fragment);
        }
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState >= 1) {
            for (Fragment next : this.mFragmentStore.mo165194f()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public void dispatchPause() {
        dispatchStateChange(5);
    }

    public void dispatchPictureInPictureModeChanged(boolean z) {
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment next : this.mFragmentStore.mo165194f()) {
            if (next != null && isParentMenuVisible(next) && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f338179j = false;
        dispatchStateChange(7);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.f338179j = false;
        dispatchStateChange(5);
    }

    public void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.f338179j = true;
        dispatchStateChange(4);
    }

    public void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        C112917b0 b0Var = this.mFragmentStore;
        b0Var.getClass();
        String str3 = str + "    ";
        if (!b0Var.f338019b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C112970z next : b0Var.f338019b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.f338187c;
                    printWriter.println(fragment);
                    fragment.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = b0Var.f338018a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(b0Var.f338018a.get(i).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.mCreatedMenus.get(i2).toString());
            }
        }
        ArrayList<C112910a> arrayList2 = this.mBackStack;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C112910a aVar = this.mBackStack.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.mo165174r(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            int size4 = this.mPendingActions.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(this.mPendingActions.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    public void enqueueAction(C112903p pVar, boolean z) {
        if (!z) {
            if (this.mHost != null) {
                checkStateLoss();
            } else if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.mPendingActions) {
            if (this.mHost != null) {
                this.mPendingActions.add(pVar);
                scheduleCommit();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean execPendingActions(boolean z) {
        ensureExecReady(z);
        boolean z2 = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                z2 = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.f338019b.values().removeAll(Collections.singleton((Object) null));
        return z2;
    }

    public void execSingleAction(C112903p pVar, boolean z) {
        if (!z || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(z);
            if (pVar.mo165139a(this.mTmpRecords, this.mTmpIsPop)) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            updateOnBackPressedCallbackEnabled();
            doPendingDeferredStart();
            this.mFragmentStore.f338019b.values().removeAll(Collections.singleton((Object) null));
        }
    }

    public boolean executePendingTransactions() {
        boolean execPendingActions = execPendingActions(true);
        forcePostponedTransactions();
        return execPendingActions;
    }

    public Fragment findActiveFragment(String str) {
        return this.mFragmentStore.mo165190b(str);
    }

    public Fragment findFragmentById(int i) {
        C112917b0 b0Var = this.mFragmentStore;
        int size = b0Var.f338018a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = b0Var.f338018a.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C112970z next : b0Var.f338019b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.f338187c;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment findFragmentByTag(String str) {
        C112917b0 b0Var = this.mFragmentStore;
        if (str != null) {
            int size = b0Var.f338018a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = b0Var.f338018a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C112970z next : b0Var.f338019b.values()) {
                if (next != null) {
                    Fragment fragment2 = next.f338187c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            b0Var.getClass();
        }
        return null;
    }

    public Fragment findFragmentByWho(String str) {
        return this.mFragmentStore.mo165191c(str);
    }

    public int getActiveFragmentCount() {
        return this.mFragmentStore.f338019b.size();
    }

    public List<Fragment> getActiveFragments() {
        return this.mFragmentStore.mo165193e();
    }

    public C112900k getBackStackEntryAt(int i) {
        return this.mBackStack.get(i);
    }

    public int getBackStackEntryCount() {
        ArrayList<C112910a> arrayList = this.mBackStack;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public C112946o getContainer() {
        return this.mContainer;
    }

    public Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment findActiveFragment = findActiveFragment(string);
        if (findActiveFragment == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return findActiveFragment;
    }

    public C112949q getFragmentFactory() {
        C112949q qVar = this.mFragmentFactory;
        if (qVar != null) {
            return qVar;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getFragmentFactory() : this.mHostFragmentFactory;
    }

    public C112917b0 getFragmentStore() {
        return this.mFragmentStore;
    }

    public List<Fragment> getFragments() {
        return this.mFragmentStore.mo165194f();
    }

    public C112958r<?> getHost() {
        return this.mHost;
    }

    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    public C112962t getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    public Fragment getParent() {
        return this.mParent;
    }

    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    public C112959r0 getSpecialEffectsControllerFactory() {
        C112959r0 r0Var = this.mSpecialEffectsControllerFactory;
        if (r0Var != null) {
            return r0Var;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.getSpecialEffectsControllerFactory() : this.mDefaultSpecialEffectsControllerFactory;
    }

    public C39630m0 getViewModelStore(Fragment fragment) {
        C112965v vVar = this.mNonConfig;
        C39630m0 m0Var = vVar.f338175f.get(fragment.mWho);
        if (m0Var != null) {
            return m0Var;
        }
        C39630m0 m0Var2 = new C39630m0();
        vVar.f338175f.put(fragment.mWho, m0Var2);
        return m0Var2;
    }

    public void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.mo164667b();
        }
    }

    public void hideFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void invalidateMenuForFragment(Fragment fragment) {
        if (fragment.mAdded && isMenuAvailable(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isParentMenuVisible(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean isPrimaryNavigation(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && isPrimaryNavigation(fragmentManager.mParent);
    }

    public boolean isStateAtLeast(int i) {
        return this.mCurState >= i;
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    public void launchRequestPermissions(Fragment fragment, String[] strArr, int i) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.mRequestPermissions.mo91081a(strArr, (C118252b) null);
            return;
        }
        this.mHost.mo165246g(fragment, strArr, i);
    }

    public void launchStartActivityForResult(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.mStartActivityForResult.mo91081a(intent, (C118252b) null);
            return;
        }
        this.mHost.mo165247j(fragment, intent, i, bundle);
    }

    public void launchStartIntentSenderForResult(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        Intent intent2;
        Bundle bundle2 = bundle;
        if (this.mStartIntentSenderForResult != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
                } else {
                    intent2 = intent;
                }
                if (isLoggingEnabled(2)) {
                    bundle.toString();
                    intent2.toString();
                    Objects.toString(fragment);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            int i5 = i2;
            IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
            int i6 = i;
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (isLoggingEnabled(2)) {
                fragment.toString();
            }
            this.mStartIntentSenderForResult.mo91081a(intentSenderRequest, (C118252b) null);
            return;
        }
        Fragment fragment2 = fragment;
        IntentSender intentSender3 = intentSender;
        int i7 = i;
        this.mHost.mo165248k(fragment, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void moveFragmentToExpectedState(Fragment fragment) {
        if (this.mFragmentStore.f338019b.get(fragment.mWho) != null) {
            moveToState(fragment);
            View view = fragment.mView;
            if (!(view == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(f));
                    C117292a.m165358d(view, aVar.mo10232b(), "androidx/fragment/app/FragmentManager", "moveFragmentToExpectedState", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "androidx/fragment/app/FragmentManager", "moveFragmentToExpectedState", "(Landroidx/fragment/app/Fragment;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                C112943n.C112944a a = C112943n.m154542a(this.mHost.f338160e, fragment, true, fragment.getPopDirection());
                if (a != null) {
                    Animation animation = a.f338121a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        a.f338122b.setTarget(fragment.mView);
                        a.f338122b.start();
                    }
                }
            }
            if (fragment.mHiddenChanged) {
                completeShowHideFragment(fragment);
            }
        } else if (isLoggingEnabled(3)) {
            fragment.toString();
            toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r1 != 5) goto L_0x01cb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void moveToState(androidx.fragment.app.Fragment r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            androidx.fragment.app.b0 r1 = r0.mFragmentStore
            java.lang.String r2 = r7.mWho
            java.util.HashMap<java.lang.String, androidx.fragment.app.z> r1 = r1.f338019b
            java.lang.Object r1 = r1.get(r2)
            androidx.fragment.app.z r1 = (androidx.fragment.app.C112970z) r1
            r8 = 1
            if (r1 != 0) goto L_0x001e
            androidx.fragment.app.z r1 = new androidx.fragment.app.z
            androidx.fragment.app.t r2 = r0.mLifecycleCallbacksDispatcher
            androidx.fragment.app.b0 r3 = r0.mFragmentStore
            r1.<init>(r2, r3, r7)
            r1.f338189e = r8
        L_0x001e:
            r9 = r1
            boolean r1 = r7.mFromLayout
            r10 = 2
            if (r1 == 0) goto L_0x0033
            boolean r1 = r7.mInLayout
            if (r1 == 0) goto L_0x0033
            int r1 = r7.mState
            if (r1 != r10) goto L_0x0033
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0035
        L_0x0033:
            r1 = r18
        L_0x0035:
            int r2 = r9.mo165277d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.mState
            r2 = -1
            r3 = 5
            r4 = 4
            r5 = 0
            r12 = 3
            if (r1 > r11) goto L_0x009c
            if (r1 >= r11) goto L_0x0053
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<a3.b>> r1 = r0.mExitAnimationCancellationSignals
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0053
            r16.cancelExitAnimation(r17)
        L_0x0053:
            int r1 = r7.mState
            if (r1 == r2) goto L_0x0063
            if (r1 == 0) goto L_0x0068
            if (r1 == r8) goto L_0x006d
            if (r1 == r10) goto L_0x0077
            if (r1 == r4) goto L_0x007c
            if (r1 == r3) goto L_0x0095
            goto L_0x01cb
        L_0x0063:
            if (r11 <= r2) goto L_0x0068
            r9.mo165276c()
        L_0x0068:
            if (r11 <= 0) goto L_0x006d
            r9.mo165278e()
        L_0x006d:
            if (r11 <= r2) goto L_0x0072
            r9.mo165283j()
        L_0x0072:
            if (r11 <= r8) goto L_0x0077
            r9.mo165279f()
        L_0x0077:
            if (r11 <= r10) goto L_0x007c
            r9.mo165274a()
        L_0x007c:
            if (r11 <= r4) goto L_0x0095
            boolean r1 = isLoggingEnabled(r12)
            if (r1 == 0) goto L_0x0089
            androidx.fragment.app.Fragment r1 = r9.f338187c
            java.util.Objects.toString(r1)
        L_0x0089:
            androidx.fragment.app.Fragment r1 = r9.f338187c
            r1.performStart()
            androidx.fragment.app.t r1 = r9.f338185a
            androidx.fragment.app.Fragment r2 = r9.f338187c
            r1.mo165263k(r2, r5)
        L_0x0095:
            if (r11 <= r3) goto L_0x01cb
            r9.mo165286m()
            goto L_0x01cb
        L_0x009c:
            if (r1 <= r11) goto L_0x01cb
            if (r1 == 0) goto L_0x01c4
            if (r1 == r8) goto L_0x01b6
            if (r1 == r10) goto L_0x00fd
            if (r1 == r4) goto L_0x00df
            if (r1 == r3) goto L_0x00c6
            r6 = 7
            if (r1 == r6) goto L_0x00ad
            goto L_0x01cb
        L_0x00ad:
            if (r11 >= r6) goto L_0x00c6
            boolean r1 = isLoggingEnabled(r12)
            if (r1 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r1 = r9.f338187c
            java.util.Objects.toString(r1)
        L_0x00ba:
            androidx.fragment.app.Fragment r1 = r9.f338187c
            r1.performPause()
            androidx.fragment.app.t r1 = r9.f338185a
            androidx.fragment.app.Fragment r6 = r9.f338187c
            r1.mo165258f(r6, r5)
        L_0x00c6:
            if (r11 >= r3) goto L_0x00df
            boolean r1 = isLoggingEnabled(r12)
            if (r1 == 0) goto L_0x00d3
            androidx.fragment.app.Fragment r1 = r9.f338187c
            java.util.Objects.toString(r1)
        L_0x00d3:
            androidx.fragment.app.Fragment r1 = r9.f338187c
            r1.performStop()
            androidx.fragment.app.t r1 = r9.f338185a
            androidx.fragment.app.Fragment r3 = r9.f338187c
            r1.mo165264l(r3, r5)
        L_0x00df:
            if (r11 >= r4) goto L_0x00fd
            boolean r1 = isLoggingEnabled(r12)
            if (r1 == 0) goto L_0x00ea
            r17.toString()
        L_0x00ea:
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x00fd
            androidx.fragment.app.r<?> r1 = r0.mHost
            boolean r1 = r1.mo164999h(r7)
            if (r1 == 0) goto L_0x00fd
            android.util.SparseArray<android.os.Parcelable> r1 = r7.mSavedViewState
            if (r1 != 0) goto L_0x00fd
            r9.mo165288o()
        L_0x00fd:
            if (r11 >= r10) goto L_0x01b6
            r1 = 0
            android.view.View r3 = r7.mView
            if (r3 == 0) goto L_0x01ab
            android.view.ViewGroup r4 = r7.mContainer
            if (r4 == 0) goto L_0x01ab
            r4.endViewTransition(r3)
            android.view.View r3 = r7.mView
            r3.clearAnimation()
            boolean r3 = r17.isRemovingParent()
            if (r3 != 0) goto L_0x01ab
            int r3 = r0.mCurState
            r4 = 0
            if (r3 <= r2) goto L_0x0139
            boolean r2 = r0.mDestroyed
            if (r2 != 0) goto L_0x0139
            android.view.View r2 = r7.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0139
            float r2 = r7.mPostponedAlpha
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0139
            androidx.fragment.app.r<?> r1 = r0.mHost
            android.content.Context r1 = r1.f338160e
            boolean r2 = r17.getPopDirection()
            androidx.fragment.app.n$a r1 = androidx.fragment.app.C112943n.m154542a(r1, r7, r5, r2)
        L_0x0139:
            r7.mPostponedAlpha = r4
            android.view.ViewGroup r13 = r7.mContainer
            android.view.View r14 = r7.mView
            if (r1 == 0) goto L_0x0194
            androidx.fragment.app.j0$a r2 = r0.mFragmentTransitionCallback
            r13.startViewTransition(r14)
            a3.b r6 = new a3.b
            r6.<init>()
            androidx.fragment.app.k r3 = new androidx.fragment.app.k
            r3.<init>(r7)
            r6.mo164501b(r3)
            r5 = r2
            androidx.fragment.app.FragmentManager$d r5 = (androidx.fragment.app.FragmentManager.C112894d) r5
            androidx.fragment.app.FragmentManager r2 = androidx.fragment.app.FragmentManager.this
            r2.addCancellationSignal(r7, r6)
            android.view.animation.Animation r2 = r1.f338121a
            if (r2 == 0) goto L_0x0179
            androidx.fragment.app.n$b r2 = new androidx.fragment.app.n$b
            android.view.animation.Animation r1 = r1.f338121a
            r2.<init>(r1, r13, r14)
            android.view.View r1 = r7.mView
            r7.setAnimatingAway(r1)
            androidx.fragment.app.l r1 = new androidx.fragment.app.l
            r1.<init>(r13, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.mView
            r1.startAnimation(r2)
            goto L_0x0194
        L_0x0179:
            android.animation.Animator r15 = r1.f338122b
            r7.setAnimator(r15)
            androidx.fragment.app.m r4 = new androidx.fragment.app.m
            r1 = r4
            r2 = r13
            r3 = r14
            r12 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r15.addListener(r12)
            android.view.View r1 = r7.mView
            r15.setTarget(r1)
            r15.start()
        L_0x0194:
            r13.removeView(r14)
            boolean r1 = isLoggingEnabled(r10)
            if (r1 == 0) goto L_0x01a6
            java.util.Objects.toString(r14)
            r17.toString()
            r13.toString()
        L_0x01a6:
            android.view.ViewGroup r1 = r7.mContainer
            if (r13 == r1) goto L_0x01ab
            return
        L_0x01ab:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<a3.b>> r1 = r0.mExitAnimationCancellationSignals
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L_0x01b6
            r9.mo165281h()
        L_0x01b6:
            if (r11 >= r8) goto L_0x01c4
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<a3.b>> r1 = r0.mExitAnimationCancellationSignals
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x01c1
            goto L_0x01c5
        L_0x01c1:
            r9.mo165280g()
        L_0x01c4:
            r8 = r11
        L_0x01c5:
            if (r8 >= 0) goto L_0x01ca
            r9.mo165282i()
        L_0x01ca:
            r11 = r8
        L_0x01cb:
            int r1 = r7.mState
            if (r1 == r11) goto L_0x01db
            r1 = 3
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L_0x01d9
            r17.toString()
        L_0x01d9:
            r7.mState = r11
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.moveToState(androidx.fragment.app.Fragment, int):void");
    }

    public void noteStateNotSaved() {
        if (this.mHost != null) {
            this.mStateSaved = false;
            this.mStopped = false;
            this.mNonConfig.f338179j = false;
            for (Fragment next : this.mFragmentStore.mo165194f()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    public void onContainerAvailable(FragmentContainerView fragmentContainerView) {
        View view;
        Iterator it = ((ArrayList) this.mFragmentStore.mo165192d()).iterator();
        while (it.hasNext()) {
            C112970z zVar = (C112970z) it.next();
            Fragment fragment = zVar.f338187c;
            if (fragment.mContainerId == fragmentContainerView.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                zVar.mo165275b();
            }
        }
    }

    @Deprecated
    public C112919c0 openTransaction() {
        return beginTransaction();
    }

    public void performPendingDeferredStart(C112970z zVar) {
        Fragment fragment = zVar.f338187c;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.mHavePendingDeferredStart = true;
            return;
        }
        fragment.mDeferStart = false;
        if (USE_STATE_MANAGER) {
            zVar.mo165284k();
        } else {
            moveToState(fragment);
        }
    }

    public void popBackStack() {
        enqueueAction(new C112904q((String) null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate((String) null, -1, 0);
    }

    public boolean popBackStackState(ArrayList<C112910a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C112910a> arrayList3 = this.mBackStack;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.mBackStack.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C112910a aVar = this.mBackStack.get(size2);
                    if ((str != null && str.equals(aVar.f338034i)) || (i >= 0 && i == aVar.f338006s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C112910a aVar2 = this.mBackStack.get(size2);
                        if ((str == null || !str.equals(aVar2.f338034i)) && (i < 0 || i != aVar2.f338006s)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.mBackStack.size() - 1) {
                return false;
            }
            for (int size3 = this.mBackStack.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.mBackStack.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public void registerFragmentLifecycleCallbacks(C67087m mVar, boolean z) {
        this.mLifecycleCallbacksDispatcher.f338166a.add(new C112962t.C112963a(mVar, z));
    }

    public void removeCancellationSignal(Fragment fragment, C112741b bVar) {
        HashSet hashSet = this.mExitAnimationCancellationSignals.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.mExitAnimationCancellationSignals.remove(fragment);
            if (fragment.mState < 5) {
                destroyFragmentView(fragment);
                moveToState(fragment);
            }
        }
    }

    public void removeFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
            int i = fragment.mBackStackNesting;
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            C112917b0 b0Var = this.mFragmentStore;
            synchronized (b0Var.f338018a) {
                b0Var.f338018a.remove(fragment);
            }
            fragment.mAdded = false;
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    public void removeFragmentOnAttachListener(C112967w wVar) {
        this.mOnAttachListeners.remove(wVar);
    }

    public void removeOnBackStackChangedListener(C67088o oVar) {
        ArrayList<C67088o> arrayList = this.mBackStackChangeListeners;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }

    public void removeRetainedFragment(Fragment fragment) {
        this.mNonConfig.mo165269e3(fragment);
    }

    public void restoreAllState(Parcelable parcelable, C112964u uVar) {
        if (this.mHost instanceof C0123n0) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.mo165271f3(uVar);
        restoreSaveState(parcelable);
    }

    public void restoreSaveState(Parcelable parcelable) {
        int i;
        C112970z zVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f337979d != null) {
                this.mFragmentStore.f338019b.clear();
                Iterator<FragmentState> it = fragmentManagerState.f337979d.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        C112965v vVar = this.mNonConfig;
                        Fragment fragment = vVar.f338173d.get(next.f337988e);
                        if (fragment != null) {
                            if (isLoggingEnabled(2)) {
                                fragment.toString();
                            }
                            zVar = new C112970z(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment, next);
                        } else {
                            zVar = new C112970z(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.f338160e.getClassLoader(), getFragmentFactory(), next);
                        }
                        Fragment fragment2 = zVar.f338187c;
                        fragment2.mFragmentManager = this;
                        if (isLoggingEnabled(2)) {
                            fragment2.toString();
                        }
                        zVar.mo165285l(this.mHost.f338160e.getClassLoader());
                        this.mFragmentStore.mo165195g(zVar);
                        zVar.f338189e = this.mCurState;
                    }
                }
                C112965v vVar2 = this.mNonConfig;
                vVar2.getClass();
                Iterator it4 = new ArrayList(vVar2.f338173d.values()).iterator();
                while (true) {
                    i = 0;
                    if (!it4.hasNext()) {
                        break;
                    }
                    Fragment fragment3 = (Fragment) it4.next();
                    C112917b0 b0Var = this.mFragmentStore;
                    if (b0Var.f338019b.get(fragment3.mWho) != null) {
                        i = 1;
                    }
                    if (i == 0) {
                        if (isLoggingEnabled(2)) {
                            fragment3.toString();
                            Objects.toString(fragmentManagerState.f337979d);
                        }
                        this.mNonConfig.mo165269e3(fragment3);
                        fragment3.mFragmentManager = this;
                        C112970z zVar2 = new C112970z(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment3);
                        zVar2.f338189e = 1;
                        zVar2.mo165284k();
                        fragment3.mRemoving = true;
                        zVar2.mo165284k();
                    }
                }
                C112917b0 b0Var2 = this.mFragmentStore;
                ArrayList<String> arrayList = fragmentManagerState.f337980e;
                b0Var2.f338018a.clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        Fragment b = b0Var2.mo165190b(next2);
                        if (b != null) {
                            if (isLoggingEnabled(2)) {
                                b.toString();
                            }
                            b0Var2.mo165189a(b);
                        } else {
                            throw new IllegalStateException("No instantiated fragment for (" + next2 + ")");
                        }
                    }
                }
                if (fragmentManagerState.f337981f != null) {
                    this.mBackStack = new ArrayList<>(fragmentManagerState.f337981f.length);
                    int i2 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.f337981f;
                        if (i2 >= backStackStateArr.length) {
                            break;
                        }
                        BackStackState backStackState = backStackStateArr[i2];
                        backStackState.getClass();
                        C112910a aVar = new C112910a(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < backStackState.f337889d.length) {
                            C112919c0.C112920a aVar2 = new C112919c0.C112920a();
                            int i5 = i3 + 1;
                            aVar2.f338042a = backStackState.f337889d[i3];
                            if (isLoggingEnabled(2)) {
                                aVar.toString();
                                int i6 = backStackState.f337889d[i5];
                            }
                            String str = backStackState.f337890e.get(i4);
                            if (str != null) {
                                aVar2.f338043b = findActiveFragment(str);
                            } else {
                                aVar2.f338043b = null;
                            }
                            aVar2.f338048g = C39623j.C39626c.values()[backStackState.f337891f[i4]];
                            aVar2.f338049h = C39623j.C39626c.values()[backStackState.f337892g[i4]];
                            int[] iArr = backStackState.f337889d;
                            int i7 = i5 + 1;
                            int i8 = iArr[i5];
                            aVar2.f338044c = i8;
                            int i9 = i7 + 1;
                            int i15 = iArr[i7];
                            aVar2.f338045d = i15;
                            int i16 = i9 + 1;
                            int i17 = iArr[i9];
                            aVar2.f338046e = i17;
                            int i18 = iArr[i16];
                            aVar2.f338047f = i18;
                            aVar.f338027b = i8;
                            aVar.f338028c = i15;
                            aVar.f338029d = i17;
                            aVar.f338030e = i18;
                            aVar.mo165198b(aVar2);
                            i4++;
                            i3 = i16 + 1;
                        }
                        aVar.f338031f = backStackState.f337893h;
                        aVar.f338034i = backStackState.f337894i;
                        aVar.f338006s = backStackState.f337895j;
                        aVar.f338032g = true;
                        aVar.f338035j = backStackState.f337896n;
                        aVar.f338036k = backStackState.f337897o;
                        aVar.f338037l = backStackState.f337898p;
                        aVar.f338038m = backStackState.f337899q;
                        aVar.f338039n = backStackState.f337900r;
                        aVar.f338040o = backStackState.f337901s;
                        aVar.f338041p = backStackState.f337902t;
                        aVar.mo165172p(1);
                        if (isLoggingEnabled(2)) {
                            aVar.toString();
                            PrintWriter printWriter = new PrintWriter(new C67091p0(TAG));
                            aVar.mo165174r("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.mBackStack.add(aVar);
                        i2++;
                    }
                } else {
                    this.mBackStack = null;
                }
                this.mBackStackIndex.set(fragmentManagerState.f337982g);
                String str2 = fragmentManagerState.f337983h;
                if (str2 != null) {
                    Fragment findActiveFragment = findActiveFragment(str2);
                    this.mPrimaryNav = findActiveFragment;
                    dispatchParentPrimaryNavigationFragmentChanged(findActiveFragment);
                }
                ArrayList<String> arrayList2 = fragmentManagerState.f337984i;
                if (arrayList2 != null) {
                    while (i < arrayList2.size()) {
                        this.mResults.put(arrayList2.get(i), fragmentManagerState.f337985j.get(i));
                        i++;
                    }
                }
                this.mLaunchedFragments = new ArrayDeque<>(fragmentManagerState.f337986n);
            }
        }
    }

    @Deprecated
    public C112964u retainNonConfig() {
        if (this.mHost instanceof C0123n0) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.mo165268d3();
    }

    public Parcelable saveAllState() {
        ArrayList<String> arrayList;
        int size;
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.f338179j = true;
        C112917b0 b0Var = this.mFragmentStore;
        b0Var.getClass();
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(b0Var.f338019b.size());
        for (C112970z next : b0Var.f338019b.values()) {
            if (next != null) {
                Fragment fragment = next.f338187c;
                FragmentState fragmentState = new FragmentState(fragment);
                Fragment fragment2 = next.f338187c;
                if (fragment2.mState <= -1 || fragmentState.f337999s != null) {
                    fragmentState.f337999s = fragment2.mSavedFragmentState;
                } else {
                    Bundle n = next.mo165287n();
                    fragmentState.f337999s = n;
                    if (next.f338187c.mTargetWho != null) {
                        if (n == null) {
                            fragmentState.f337999s = new Bundle();
                        }
                        fragmentState.f337999s.putString("android:target_state", next.f338187c.mTargetWho);
                        int i = next.f338187c.mTargetRequestCode;
                        if (i != 0) {
                            fragmentState.f337999s.putInt("android:target_req_state", i);
                        }
                    }
                }
                arrayList2.add(fragmentState);
                if (isLoggingEnabled(2)) {
                    Objects.toString(fragment);
                    Objects.toString(fragmentState.f337999s);
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList2.isEmpty()) {
            isLoggingEnabled(2);
            return null;
        }
        C112917b0 b0Var2 = this.mFragmentStore;
        synchronized (b0Var2.f338018a) {
            if (b0Var2.f338018a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(b0Var2.f338018a.size());
                Iterator<Fragment> it = b0Var2.f338018a.iterator();
                while (it.hasNext()) {
                    Fragment next2 = it.next();
                    arrayList.add(next2.mWho);
                    if (isLoggingEnabled(2)) {
                        next2.toString();
                    }
                }
            }
        }
        ArrayList<C112910a> arrayList3 = this.mBackStack;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.mBackStack.get(i2));
                if (isLoggingEnabled(2)) {
                    Objects.toString(this.mBackStack.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f337979d = arrayList2;
        fragmentManagerState.f337980e = arrayList;
        fragmentManagerState.f337981f = backStackStateArr;
        fragmentManagerState.f337982g = this.mBackStackIndex.get();
        Fragment fragment3 = this.mPrimaryNav;
        if (fragment3 != null) {
            fragmentManagerState.f337983h = fragment3.mWho;
        }
        fragmentManagerState.f337984i.addAll(this.mResults.keySet());
        fragmentManagerState.f337985j.addAll(this.mResults.values());
        fragmentManagerState.f337986n = new ArrayList<>(this.mLaunchedFragments);
        return fragmentManagerState;
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        Bundle n;
        C112917b0 b0Var = this.mFragmentStore;
        C112970z zVar = b0Var.f338019b.get(fragment.mWho);
        if (zVar == null || !zVar.f338187c.equals(fragment)) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        if (zVar.f338187c.mState <= -1 || (n = zVar.mo165287n()) == null) {
            return null;
        }
        return new Fragment.SavedState(n);
    }

    public void scheduleCommit() {
        synchronized (this.mPendingActions) {
            ArrayList<C112905r> arrayList = this.mPostponedTransactions;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.mPendingActions.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.mHost.f338161f.removeCallbacks(this.mExecCommit);
                this.mHost.f338161f.post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    public void setExitAnimationOrder(Fragment fragment, boolean z) {
        ViewGroup fragmentContainer = getFragmentContainer(fragment);
        if (fragmentContainer != null && (fragmentContainer instanceof FragmentContainerView)) {
            ((FragmentContainerView) fragmentContainer).setDrawDisappearingViewsLast(!z);
        }
    }

    public void setFragmentFactory(C112949q qVar) {
        this.mFragmentFactory = qVar;
    }

    public final void setFragmentResult(String str, Bundle bundle) {
        C112902n nVar = this.mResultListeners.get(str);
        if (nVar != null) {
            if (nVar.f337969a.getCurrentState().mo62187a(C39623j.C39626c.STARTED)) {
                nVar.mo165138a(str, bundle);
                return;
            }
        }
        this.mResults.put(str, bundle);
    }

    public final void setFragmentResultListener(final String str, C0125s sVar, final C112969y yVar) {
        final C39623j lifecycle = sVar.getLifecycle();
        if (lifecycle.getCurrentState() != C39623j.C39626c.DESTROYED) {
            C1128896 r0 = new C103764p() {
                /* renamed from: k4 */
                public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                    Bundle bundle;
                    if (bVar == C39623j.C39625b.ON_START && (bundle = (Bundle) FragmentManager.this.mResults.get(str)) != null) {
                        ((C112902n) yVar).mo165138a(str, bundle);
                        FragmentManager.this.clearFragmentResult(str);
                    }
                    if (bVar == C39623j.C39625b.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        FragmentManager.this.mResultListeners.remove(str);
                    }
                }
            };
            lifecycle.addObserver(r0);
            C112902n put = this.mResultListeners.put(str, new C112902n(lifecycle, yVar, r0));
            if (put != null) {
                put.f337969a.removeObserver(put.f337971c);
            }
        }
    }

    public void setMaxLifecycle(Fragment fragment, C39623j.C39626c cVar) {
        if (!fragment.equals(findActiveFragment(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = cVar;
    }

    public void setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment == null || (fragment.equals(findActiveFragment(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            dispatchParentPrimaryNavigationFragmentChanged(fragment2);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void setSpecialEffectsControllerFactory(C112959r0 r0Var) {
        this.mSpecialEffectsControllerFactory = r0Var;
    }

    public void showFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            C112958r<?> rVar = this.mHost;
            if (rVar != null) {
                sb.append(rVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void unregisterFragmentLifecycleCallbacks(C67087m mVar) {
        C112962t tVar = this.mLifecycleCallbacksDispatcher;
        synchronized (tVar.f338166a) {
            if (tVar.f338166a.size() > 0) {
                tVar.f338166a.get(0).getClass();
                tVar.f338166a.remove(0);
            }
        }
    }

    public void popBackStack(String str, int i) {
        enqueueAction(new C112904q(str, -1, i), false);
    }

    public boolean popBackStackImmediate(String str, int i) {
        return popBackStackImmediate(str, -1, i);
    }

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C112890a();

        /* renamed from: d */
        public String f337959d;

        /* renamed from: e */
        public int f337960e;

        /* renamed from: androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$a */
        public class C112890a implements Parcelable.Creator<LaunchedFragmentInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.f337959d = str;
            this.f337960e = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f337959d);
            parcel.writeInt(this.f337960e);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.f337959d = parcel.readString();
            this.f337960e = parcel.readInt();
        }
    }

    public void popBackStack(int i, int i2) {
        if (i >= 0) {
            enqueueAction(new C112904q((String) null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public boolean popBackStackImmediate(int i, int i2) {
        if (i >= 0) {
            return popBackStackImmediate((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    private boolean popBackStackImmediate(String str, int i, int i2) {
        execPendingActions(false);
        ensureExecReady(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean popBackStackState = popBackStackState(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (popBackStackState) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.f338019b.values().removeAll(Collections.singleton((Object) null));
        return popBackStackState;
    }

    public void moveToState(Fragment fragment) {
        moveToState(fragment, this.mCurState);
    }

    public void moveToState(int i, boolean z) {
        C112958r<?> rVar;
        if (this.mHost == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.mCurState) {
            this.mCurState = i;
            if (USE_STATE_MANAGER) {
                C112917b0 b0Var = this.mFragmentStore;
                Iterator<Fragment> it = b0Var.f338018a.iterator();
                while (it.hasNext()) {
                    C112970z zVar = b0Var.f338019b.get(it.next().mWho);
                    if (zVar != null) {
                        zVar.mo165284k();
                    }
                }
                for (C112970z next : b0Var.f338019b.values()) {
                    if (next != null) {
                        next.mo165284k();
                        Fragment fragment = next.f338187c;
                        if (fragment.mRemoving && !fragment.isInBackStack()) {
                            b0Var.mo165196h(next);
                        }
                    }
                }
            } else {
                for (Fragment moveFragmentToExpectedState : this.mFragmentStore.mo165194f()) {
                    moveFragmentToExpectedState(moveFragmentToExpectedState);
                }
                Iterator it4 = ((ArrayList) this.mFragmentStore.mo165192d()).iterator();
                while (it4.hasNext()) {
                    C112970z zVar2 = (C112970z) it4.next();
                    Fragment fragment2 = zVar2.f338187c;
                    if (!fragment2.mIsNewlyAdded) {
                        moveFragmentToExpectedState(fragment2);
                    }
                    if (fragment2.mRemoving && !fragment2.isInBackStack()) {
                        this.mFragmentStore.mo165196h(zVar2);
                    }
                }
            }
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && (rVar = this.mHost) != null && this.mCurState == 7) {
                rVar.mo165001l();
                this.mNeedMenuInvalidate = false;
            }
        }
    }
}
