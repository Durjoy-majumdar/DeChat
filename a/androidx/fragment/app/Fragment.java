package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C112850c;
import androidx.activity.result.C67073a;
import androidx.activity.result.C67074b;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C0121i;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103762g0;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.C0966R;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import j20.C117292a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k20.C9556a;
import p1094c4.C104290a;
import p1094c4.C104291b;
import p1094c4.C104292c;
import p1094c4.C104293d;
import p1202o3.C117643a;
import p1202o3.C117645b;
import p210o.C11323a;
import p431e.C116634a;
import p918s2.C118252b;
import p918s2.C118259k;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, C0125s, C0123n0, C0121i, C104292c {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    private byte _hellAccFlag_;
    public boolean mAdded;
    public C112882i mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    private boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    private C54209k0.C54210b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public C112958r<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public C103766u mLifecycleRegistry;
    public C39623j.C39626c mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<C112884k> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public C104291b mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public C112947o0 mViewLifecycleOwner;
    public C54219z<C0125s> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C112874a implements Runnable {
        public C112874a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class C112875b implements Runnable {
        public C112875b() {
        }

        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C112876c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112950q0 f337913d;

        public C112876c(C112950q0 q0Var) {
            this.f337913d = q0Var;
        }

        public void run() {
            this.f337913d.mo165233c();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class C112877d extends C112946o {
        public C112877d() {
        }

        /* renamed from: b */
        public View mo164813b(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        /* renamed from: c */
        public boolean mo164814c() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class C112878e implements C11323a<Void, ActivityResultRegistry> {
        public C112878e() {
        }

        public Object apply(Object obj) {
            Void voidR = (Void) obj;
            Fragment fragment = Fragment.this;
            C112958r<?> rVar = fragment.mHost;
            return rVar instanceof C112850c ? ((C112850c) rVar).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C112879f implements C11323a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        public final /* synthetic */ ActivityResultRegistry f337917a;

        public C112879f(ActivityResultRegistry activityResultRegistry) {
            this.f337917a = activityResultRegistry;
        }

        public Object apply(Object obj) {
            Void voidR = (Void) obj;
            return this.f337917a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C112880g extends C112884k {

        /* renamed from: a */
        public final /* synthetic */ C11323a f337919a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f337920b;

        /* renamed from: c */
        public final /* synthetic */ C116634a f337921c;

        /* renamed from: d */
        public final /* synthetic */ C67073a f337922d;

        public C112880g(C11323a aVar, AtomicReference atomicReference, C116634a aVar2, C67073a aVar3) {
            this.f337919a = aVar;
            this.f337920b = atomicReference;
            this.f337921c = aVar2;
            this.f337922d = aVar3;
        }

        /* renamed from: a */
        public void mo164972a() {
            this.f337920b.set(((ActivityResultRegistry) this.f337919a.apply(null)).mo164681d(Fragment.this.generateActivityResultKey(), Fragment.this, this.f337921c, this.f337922d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C112881h extends C67074b<I> {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f337924a;

        public C112881h(AtomicReference atomicReference, C116634a aVar) {
            this.f337924a = atomicReference;
        }

        /* renamed from: a */
        public void mo91081a(I i, C118252b bVar) {
            C67074b bVar2 = (C67074b) this.f337924a.get();
            if (bVar2 != null) {
                bVar2.mo91081a(i, bVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        /* renamed from: b */
        public void mo91082b() {
            C67074b bVar = (C67074b) this.f337924a.getAndSet((Object) null);
            if (bVar != null) {
                bVar.mo91082b();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public static class C112882i {

        /* renamed from: a */
        public View f337926a;

        /* renamed from: b */
        public Animator f337927b;

        /* renamed from: c */
        public boolean f337928c;

        /* renamed from: d */
        public int f337929d;

        /* renamed from: e */
        public int f337930e;

        /* renamed from: f */
        public int f337931f;

        /* renamed from: g */
        public int f337932g;

        /* renamed from: h */
        public int f337933h;

        /* renamed from: i */
        public ArrayList<String> f337934i;

        /* renamed from: j */
        public ArrayList<String> f337935j;

        /* renamed from: k */
        public Object f337936k = null;

        /* renamed from: l */
        public Object f337937l;

        /* renamed from: m */
        public Object f337938m;

        /* renamed from: n */
        public Object f337939n;

        /* renamed from: o */
        public Object f337940o;

        /* renamed from: p */
        public Object f337941p;

        /* renamed from: q */
        public Boolean f337942q;

        /* renamed from: r */
        public Boolean f337943r;

        /* renamed from: s */
        public float f337944s;

        /* renamed from: t */
        public View f337945t;

        /* renamed from: u */
        public boolean f337946u;

        /* renamed from: v */
        public C112885l f337947v;

        /* renamed from: w */
        public boolean f337948w;

        public C112882i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f337937l = obj;
            this.f337938m = null;
            this.f337939n = obj;
            this.f337940o = null;
            this.f337941p = obj;
            this.f337944s = 1.0f;
            this.f337945t = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public static class C112883j extends RuntimeException {
        public C112883j(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    public static abstract class C112884k {
        /* renamed from: a */
        public abstract void mo164972a();
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    public interface C112885l {
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new C112874a();
        this.mMaxState = C39623j.C39626c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new C54219z<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C112882i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C112882i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        C39623j.C39626c cVar = this.mMaxState;
        return (cVar == C39623j.C39626c.INITIALIZED || this.mParentFragment == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C103766u(this);
        this.mSavedStateRegistryController = new C104291b(this, (C8480h) null);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, (Bundle) null);
    }

    private <I, O> C67074b<I> prepareCallInternal(C116634a<I, O> aVar, C11323a<Void, ActivityResultRegistry> aVar2, C67073a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C112880g(aVar2, atomicReference, aVar, aVar3));
            return new C112881h(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(C112884k kVar) {
        if (this.mState >= 0) {
            kVar.mo164972a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C112882i iVar = this.mAnimationInfo;
        C112885l lVar = null;
        if (iVar != null) {
            iVar.f337946u = false;
            C112885l lVar2 = iVar.f337947v;
            iVar.f337947v = null;
            lVar = lVar2;
        }
        if (lVar != null) {
            FragmentManager.C112905r rVar = (FragmentManager.C112905r) lVar;
            int i = rVar.f337978c - 1;
            rVar.f337978c = i;
            if (i == 0) {
                rVar.f337977b.f338004q.scheduleCommit();
            }
        } else if (FragmentManager.USE_STATE_MANAGER && this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            C112950q0 f = C112950q0.m154551f(viewGroup, fragmentManager);
            f.mo165236h();
            if (z) {
                this.mHost.f338161f.post(new C112876c(f));
            } else {
                f.mo165233c();
            }
        }
    }

    public C112946o createFragmentContainer() {
        return new C112877d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            C117643a.m165934b(this).mo182366a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + XVFSFile.PATH_SEPARATOR);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.findFragmentByWho(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        C112958r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return (FragmentActivity) rVar.f338159d;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f337943r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f337942q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f337926a;
    }

    public Animator getAnimator() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f337927b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        C112958r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.f338160e;
    }

    public C54209k0.C54210b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.isLoggingEnabled(3)) {
                    Objects.toString(requireContext().getApplicationContext());
                }
                this.mDefaultFactory = new C103762g0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f337929d;
    }

    public Object getEnterTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f337936k;
    }

    public C118259k getEnterTransitionCallback() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    public int getExitAnim() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f337930e;
    }

    public Object getExitTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f337938m;
    }

    public C118259k getExitTransitionCallback() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    /* access modifiers changed from: package-private */
    public View getFocusedView() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f337945t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        C112958r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.mo164997e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater((Bundle) null) : layoutInflater;
    }

    public C39623j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public C117643a getLoaderManager() {
        return C117643a.m165934b(this);
    }

    public int getNextTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f337933h;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f337928c;
    }

    public int getPopEnterAnim() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f337931f;
    }

    public int getPopExitAnim() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f337932g;
    }

    public float getPostOnViewCreatedAlpha() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f337944s;
    }

    public Object getReenterTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f337939n;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f337937l;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    public final C104290a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f308652b;
    }

    public Object getSharedElementEnterTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f337940o;
    }

    public Object getSharedElementReturnTransition() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f337941p;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f337934i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f337934i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementSourceNames():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f337935j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.mAnimationInfo
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f337935j
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.getSharedElementTargetNames():java.util.ArrayList");
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.findActiveFragment(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public C0125s getViewLifecycleOwner() {
        C112947o0 o0Var = this.mViewLifecycleOwner;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<C0125s> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public C39630m0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != C39623j.C39626c.INITIALIZED.ordinal()) {
            return this.mFragmentManager.getViewModelStore(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f337948w;
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.mFragmentManager;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMenuVisible() {
        /*
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.isParentMenuVisible(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isMenuVisible():boolean");
    }

    public boolean isPostponed() {
        C112882i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f337946u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.mView;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.isLoggingEnabled(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        C112958r<?> rVar = this.mHost;
        if (rVar == null) {
            activity = null;
        } else {
            activity = rVar.f338159d;
        }
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        C112958r<?> rVar = this.mHost;
        if (rVar == null) {
            activity = null;
        } else {
            activity = rVar.f338159d;
        }
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.dispatchActivityCreated();
            return;
        }
        throw new C103748s0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<C112884k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo164972a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f338160e);
        if (this.mCalled) {
            this.mFragmentManager.dispatchOnAttachFragment(this);
            this.mChildFragmentManager.dispatchAttach();
            return;
        }
        throw new C103748s0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.dispatchConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchContextItemSelected(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new C103764p() {
            /* renamed from: k4 */
            public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                View view;
                if (bVar == C39623j.C39625b.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.mo145972a(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.mo145135c(C39623j.C39625b.ON_CREATE);
            return;
        }
        throw new C103748s0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        boolean z = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C112947o0();
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.mo165230b();
            this.mView.setTag(C0966R.C0970id.l8r, this.mViewLifecycleOwner);
            this.mView.setTag(C0966R.C0970id.l8t, this);
            C104293d.m139245b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f338128d == null) {
            z = false;
        }
        if (!z) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.mo145135c(C39623j.C39625b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new C103748s0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null) {
            C112947o0 o0Var = this.mViewLifecycleOwner;
            o0Var.mo165230b();
            if (o0Var.f338128d.f306531b.mo62187a(C39623j.C39626c.CREATED)) {
                this.mViewLifecycleOwner.mo165229a(C39623j.C39625b.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            C117645b.C117648c cVar = ((C117645b) C117643a.m165934b(this)).f351900b;
            int h = cVar.f351911d.mo162808h();
            for (int i = 0; i < h; i++) {
                cVar.f351911d.mo162809j(i).mo182368a();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new C103748s0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new C103748s0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.isDestroyed()) {
            this.mChildFragmentManager.dispatchDestroy();
            this.mChildFragmentManager = new FragmentManagerImpl();
        }
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.dispatchLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.dispatchMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(menuItem)) {
            return this.mChildFragmentManager.dispatchOptionsItemSelected(menuItem);
        }
        return true;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo165229a(C39623j.C39625b.ON_PAUSE);
        }
        this.mLifecycleRegistry.mo145135c(C39623j.C39625b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new C103748s0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.dispatchPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z = true;
            onPrepareOptionsMenu(menu);
        }
        return z | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigation = this.mFragmentManager.isPrimaryNavigation(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != isPrimaryNavigation) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigation);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigation);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            C103766u uVar = this.mLifecycleRegistry;
            C39623j.C39625b bVar = C39623j.C39625b.ON_RESUME;
            uVar.mo145135c(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo165229a(bVar);
            }
            this.mChildFragmentManager.dispatchResume();
            return;
        }
        throw new C103748s0("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo145973b(bundle);
        Parcelable saveAllState = this.mChildFragmentManager.saveAllState();
        if (saveAllState != null) {
            bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, saveAllState);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            C103766u uVar = this.mLifecycleRegistry;
            C39623j.C39625b bVar = C39623j.C39625b.ON_START;
            uVar.mo145135c(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.mo165229a(bVar);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new C103748s0("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.mo165229a(C39623j.C39625b.ON_STOP);
        }
        this.mLifecycleRegistry.mo145135c(C39623j.C39625b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new C103748s0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f337946u = true;
    }

    public final <I, O> C67074b<I> registerForActivityResult(C116634a<I, O> aVar, C67073a<O> aVar2) {
        return prepareCallInternal(aVar, new C112878e(), aVar2);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().launchRequestPermissions(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(FragmentActivity.FRAGMENTS_TAG)) != null) {
            this.mChildFragmentManager.restoreSaveState(parcelable);
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            C112947o0 o0Var = this.mViewLifecycleOwner;
            o0Var.f338129e.mo145972a(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new C103748s0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.mo165229a(C39623j.C39625b.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f337943r = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f337942q = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f337926a = view;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            ensureAnimationInfo().f337929d = i;
            ensureAnimationInfo().f337930e = i2;
            ensureAnimationInfo().f337931f = i3;
            ensureAnimationInfo().f337932g = i4;
        }
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f337927b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(C118259k kVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f337936k = obj;
    }

    public void setExitSharedElementCallback(C118259k kVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f337938m = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f337945t = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo165001l();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f337948w = z;
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.f337910d) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo165001l();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo != null || i != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.f337933h = i;
        }
    }

    public void setOnStartEnterTransitionListener(C112885l lVar) {
        ensureAnimationInfo();
        C112882i iVar = this.mAnimationInfo;
        C112885l lVar2 = iVar.f337947v;
        if (lVar != lVar2) {
            if (lVar == null || lVar2 == null) {
                if (iVar.f337946u) {
                    iVar.f337947v = lVar;
                }
                if (lVar != null) {
                    ((FragmentManager.C112905r) lVar).f337978c++;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().f337928c = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f337944s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f337939n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.addRetainedFragment(this);
        } else {
            fragmentManager.removeRetainedFragment(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f337937l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f337940o = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C112882i iVar = this.mAnimationInfo;
        iVar.f337934i = arrayList;
        iVar.f337935j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f337941p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.performPendingDeferredStart(fragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        C112958r<?> rVar = this.mHost;
        if (rVar != null) {
            return rVar.mo165000i(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        C9556a aVar = new C9556a();
        aVar.mo10233c((Object) null);
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "androidx/fragment/app/Fragment", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
        startActivity((Intent) aVar.mo10231a(0), (Bundle) aVar.mo10231a(1));
        C117292a.m165359e(this, "androidx/fragment/app/Fragment", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                toString();
                Objects.toString(intentSender);
                Objects.toString(intent);
                Objects.toString(bundle);
            }
            getParentFragmentManager().launchStartIntentSenderForResult(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f337946u) {
            if (this.mHost == null) {
                ensureAnimationInfo().f337946u = false;
            } else if (Looper.myLooper() != this.mHost.f338161f.getLooper()) {
                this.mHost.f338161f.postAtFrontOfQueue(new C112875b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C112873a();

        /* renamed from: d */
        public final Bundle f337910d;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C112873a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f337910d = bundle;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f337910d);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f337910d = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) C112949q.m154549c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            throw new C112883j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C112883j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C112883j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C112883j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f337946u = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.getHost().f338161f;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> C67074b<I> registerForActivityResult(C116634a<I, O> aVar, ActivityResultRegistry activityResultRegistry, C67073a<O> aVar2) {
        return prepareCallInternal(aVar, new C112879f(activityResultRegistry), aVar2);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        C112958r<?> rVar = this.mHost;
        if (rVar != null) {
            rVar.mo165247j(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().launchStartActivityForResult(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C112958r<?> rVar = this.mHost;
        if (rVar != null) {
            LayoutInflater f = rVar.mo164998f();
            f.setFactory2(this.mChildFragmentManager.getLayoutInflaterFactory());
            return f;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    private void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            toString();
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }
}
