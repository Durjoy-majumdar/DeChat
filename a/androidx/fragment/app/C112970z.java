package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.C112950q0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.fragment.app.z */
public class C112970z {

    /* renamed from: a */
    public final C112962t f338185a;

    /* renamed from: b */
    public final C112917b0 f338186b;

    /* renamed from: c */
    public final Fragment f338187c;

    /* renamed from: d */
    public boolean f338188d = false;

    /* renamed from: e */
    public int f338189e = -1;

    /* renamed from: androidx.fragment.app.z$b */
    public static /* synthetic */ class C54200b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f152160a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.j$c[] r0 = androidx.lifecycle.C39623j.C39626c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f152160a = r0
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f152160a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f152160a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f152160a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.j$c r1 = androidx.lifecycle.C39623j.C39626c.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C112970z.C54200b.<clinit>():void");
        }
    }

    /* renamed from: androidx.fragment.app.z$a */
    public class C112971a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ View f338190d;

        public C112971a(C112970z zVar, View view) {
            this.f338190d = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f338190d.removeOnAttachStateChangeListener(this);
            View view2 = this.f338190d;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107212f.m145215c(view2);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public C112970z(C112962t tVar, C112917b0 b0Var, Fragment fragment) {
        this.f338185a = tVar;
        this.f338186b = b0Var;
        this.f338187c = fragment;
    }

    /* renamed from: a */
    public void mo165274a() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        Fragment fragment = this.f338187c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C112962t tVar = this.f338185a;
        Fragment fragment2 = this.f338187c;
        tVar.mo165253a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* renamed from: b */
    public void mo165275b() {
        View view;
        View view2;
        C112917b0 b0Var = this.f338186b;
        Fragment fragment = this.f338187c;
        b0Var.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = b0Var.f338018a.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= b0Var.f338018a.size()) {
                            break;
                        }
                        Fragment fragment2 = b0Var.f338018a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = b0Var.f338018a.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        Fragment fragment4 = this.f338187c;
        fragment4.mContainer.addView(fragment4.mView, i);
    }

    /* renamed from: c */
    public void mo165276c() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        Fragment fragment = this.f338187c;
        Fragment fragment2 = fragment.mTarget;
        C112970z zVar = null;
        if (fragment2 != null) {
            C112917b0 b0Var = this.f338186b;
            C112970z zVar2 = b0Var.f338019b.get(fragment2.mWho);
            if (zVar2 != null) {
                Fragment fragment3 = this.f338187c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                zVar = zVar2;
            } else {
                throw new IllegalStateException("Fragment " + this.f338187c + " declared target fragment " + this.f338187c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (zVar = this.f338186b.f338019b.get(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f338187c + " declared target fragment " + this.f338187c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (zVar != null && (FragmentManager.USE_STATE_MANAGER || zVar.f338187c.mState < 1)) {
            zVar.mo165284k();
        }
        Fragment fragment4 = this.f338187c;
        fragment4.mHost = fragment4.mFragmentManager.getHost();
        Fragment fragment5 = this.f338187c;
        fragment5.mParentFragment = fragment5.mFragmentManager.getParent();
        this.f338185a.mo165259g(this.f338187c, false);
        this.f338187c.performAttach();
        this.f338185a.mo165254b(this.f338187c, false);
    }

    /* renamed from: d */
    public int mo165277d() {
        Fragment fragment;
        ViewGroup viewGroup;
        C112950q0.C112954d dVar;
        C112950q0.C112954d.C112956b bVar;
        Fragment fragment2 = this.f338187c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i = this.f338189e;
        int i2 = C54200b.f152160a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment3 = this.f338187c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i = Math.max(this.f338189e, 2);
                View view = this.f338187c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f338189e < 4 ? Math.min(i, fragment3.mState) : Math.min(i, 1);
            }
        }
        if (!this.f338187c.mAdded) {
            i = Math.min(i, 1);
        }
        C112950q0.C112954d.C112956b bVar2 = null;
        if (FragmentManager.USE_STATE_MANAGER && (viewGroup = fragment.mContainer) != null) {
            C112950q0 f = C112950q0.m154551f(viewGroup, (fragment = this.f338187c).getParentFragmentManager());
            f.getClass();
            C112950q0.C112954d d = f.mo165234d(this.f338187c);
            if (d != null) {
                bVar = d.f338143b;
            } else {
                Fragment fragment4 = this.f338187c;
                Iterator<C112950q0.C112954d> it = f.f338134c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dVar = null;
                        break;
                    }
                    dVar = it.next();
                    if (dVar.f338144c.equals(fragment4) && !dVar.f338147f) {
                        break;
                    }
                }
                if (dVar != null) {
                    bVar = dVar.f338143b;
                }
            }
            bVar2 = bVar;
        }
        if (bVar2 == C112950q0.C112954d.C112956b.ADDING) {
            i = Math.min(i, 6);
        } else if (bVar2 == C112950q0.C112954d.C112956b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment5 = this.f338187c;
            if (fragment5.mRemoving) {
                i = fragment5.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment6 = this.f338187c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f338187c);
        }
        return i;
    }

    /* renamed from: e */
    public void mo165278e() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        Fragment fragment = this.f338187c;
        if (!fragment.mIsCreated) {
            this.f338185a.mo165260h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f338187c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C112962t tVar = this.f338185a;
            Fragment fragment3 = this.f338187c;
            tVar.mo165255c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f338187c.mState = 1;
    }

    /* renamed from: f */
    public void mo165279f() {
        String str;
        if (!this.f338187c.mFromLayout) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Objects.toString(this.f338187c);
            }
            Fragment fragment = this.f338187c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f338187c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.getContainer().mo164813b(this.f338187c.mContainerId);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f338187c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.f338187c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f338187c.mContainerId) + " (" + str + ") for fragment " + this.f338187c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f338187c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f338187c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.f338187c.mView;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f338187c;
                fragment5.mView.setTag(C0966R.C0970id.eel, fragment5);
                if (viewGroup != null) {
                    mo165275b();
                }
                Fragment fragment6 = this.f338187c;
                if (fragment6.mHidden) {
                    View view2 = fragment6.mView;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view4 = this.f338187c.mView;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(view4)) {
                    C107207u.C107212f.m145215c(this.f338187c.mView);
                } else {
                    View view5 = this.f338187c.mView;
                    view5.addOnAttachStateChangeListener(new C112971a(this, view5));
                }
                this.f338187c.performViewCreated();
                C112962t tVar = this.f338185a;
                Fragment fragment7 = this.f338187c;
                tVar.mo165265m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.f338187c.mView.getVisibility();
                float alpha = this.f338187c.mView.getAlpha();
                if (FragmentManager.USE_STATE_MANAGER) {
                    this.f338187c.setPostOnViewCreatedAlpha(alpha);
                    Fragment fragment8 = this.f338187c;
                    if (fragment8.mContainer != null && visibility == 0) {
                        View findFocus = fragment8.mView.findFocus();
                        if (findFocus != null) {
                            this.f338187c.setFocusedView(findFocus);
                            if (FragmentManager.isLoggingEnabled(2)) {
                                findFocus.toString();
                                Objects.toString(this.f338187c);
                            }
                        }
                        View view6 = this.f338187c.mView;
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(Float.valueOf(0.0f));
                        View view7 = view6;
                        C117292a.m165358d(view7, aVar2.mo10232b(), "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view6.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(view7, "androidx/fragment/app/FragmentStateManager", "createView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                } else {
                    Fragment fragment9 = this.f338187c;
                    if (visibility == 0 && fragment9.mContainer != null) {
                        z = true;
                    }
                    fragment9.mIsNewlyAdded = z;
                }
            }
            this.f338187c.mState = 2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo165280g() {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r1 == 0) goto L_0x000c
            androidx.fragment.app.Fragment r1 = r7.f338187c
            java.util.Objects.toString(r1)
        L_0x000c:
            androidx.fragment.app.Fragment r1 = r7.f338187c
            boolean r2 = r1.mRemoving
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001c
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            if (r1 != 0) goto L_0x0040
            androidx.fragment.app.b0 r2 = r7.f338186b
            androidx.fragment.app.v r2 = r2.f338020c
            androidx.fragment.app.Fragment r5 = r7.f338187c
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r6 = r2.f338173d
            java.lang.String r5 = r5.mWho
            boolean r5 = r6.containsKey(r5)
            if (r5 != 0) goto L_0x0031
            r2 = 1
            goto L_0x003b
        L_0x0031:
            boolean r5 = r2.f338176g
            if (r5 == 0) goto L_0x0038
            boolean r2 = r2.f338177h
            goto L_0x003b
        L_0x0038:
            boolean r2 = r2.f338178i
            r2 = r2 ^ r4
        L_0x003b:
            if (r2 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r2 = 0
            goto L_0x0041
        L_0x0040:
            r2 = 1
        L_0x0041:
            if (r2 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r2 = r7.f338187c
            androidx.fragment.app.r<?> r2 = r2.mHost
            boolean r5 = r2 instanceof androidx.lifecycle.C0123n0
            if (r5 == 0) goto L_0x0052
            androidx.fragment.app.b0 r2 = r7.f338186b
            androidx.fragment.app.v r2 = r2.f338020c
            boolean r4 = r2.f338177h
            goto L_0x005f
        L_0x0052:
            android.content.Context r2 = r2.f338160e
            boolean r5 = r2 instanceof android.app.Activity
            if (r5 == 0) goto L_0x005f
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isChangingConfigurations()
            r4 = r4 ^ r2
        L_0x005f:
            if (r1 != 0) goto L_0x0063
            if (r4 == 0) goto L_0x00a1
        L_0x0063:
            androidx.fragment.app.b0 r1 = r7.f338186b
            androidx.fragment.app.v r1 = r1.f338020c
            androidx.fragment.app.Fragment r2 = r7.f338187c
            r1.getClass()
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L_0x0075
            java.util.Objects.toString(r2)
        L_0x0075:
            java.util.HashMap<java.lang.String, androidx.fragment.app.v> r0 = r1.f338174e
            java.lang.String r4 = r2.mWho
            java.lang.Object r0 = r0.get(r4)
            androidx.fragment.app.v r0 = (androidx.fragment.app.C112965v) r0
            if (r0 == 0) goto L_0x008b
            r0.onCleared()
            java.util.HashMap<java.lang.String, androidx.fragment.app.v> r0 = r1.f338174e
            java.lang.String r4 = r2.mWho
            r0.remove(r4)
        L_0x008b:
            java.util.HashMap<java.lang.String, androidx.lifecycle.m0> r0 = r1.f338175f
            java.lang.String r4 = r2.mWho
            java.lang.Object r0 = r0.get(r4)
            androidx.lifecycle.m0 r0 = (androidx.lifecycle.C39630m0) r0
            if (r0 == 0) goto L_0x00a1
            r0.mo62188a()
            java.util.HashMap<java.lang.String, androidx.lifecycle.m0> r0 = r1.f338175f
            java.lang.String r1 = r2.mWho
            r0.remove(r1)
        L_0x00a1:
            androidx.fragment.app.Fragment r0 = r7.f338187c
            r0.performDestroy()
            androidx.fragment.app.t r0 = r7.f338185a
            androidx.fragment.app.Fragment r1 = r7.f338187c
            r0.mo165256d(r1, r3)
            androidx.fragment.app.b0 r0 = r7.f338186b
            java.util.List r0 = r0.mo165192d()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x00b9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.z r1 = (androidx.fragment.app.C112970z) r1
            if (r1 == 0) goto L_0x00b9
            androidx.fragment.app.Fragment r1 = r1.f338187c
            androidx.fragment.app.Fragment r2 = r7.f338187c
            java.lang.String r2 = r2.mWho
            java.lang.String r3 = r1.mTargetWho
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b9
            androidx.fragment.app.Fragment r2 = r7.f338187c
            r1.mTarget = r2
            r2 = 0
            r1.mTargetWho = r2
            goto L_0x00b9
        L_0x00dd:
            androidx.fragment.app.Fragment r0 = r7.f338187c
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto L_0x00eb
            androidx.fragment.app.b0 r2 = r7.f338186b
            androidx.fragment.app.Fragment r1 = r2.mo165190b(r1)
            r0.mTarget = r1
        L_0x00eb:
            androidx.fragment.app.b0 r0 = r7.f338186b
            r0.mo165196h(r7)
            goto L_0x010b
        L_0x00f1:
            androidx.fragment.app.Fragment r0 = r7.f338187c
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto L_0x0107
            androidx.fragment.app.b0 r1 = r7.f338186b
            androidx.fragment.app.Fragment r0 = r1.mo165190b(r0)
            if (r0 == 0) goto L_0x0107
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L_0x0107
            androidx.fragment.app.Fragment r1 = r7.f338187c
            r1.mTarget = r0
        L_0x0107:
            androidx.fragment.app.Fragment r0 = r7.f338187c
            r0.mState = r3
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C112970z.mo165280g():void");
    }

    /* renamed from: h */
    public void mo165281h() {
        View view;
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        Fragment fragment = this.f338187c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.f338187c.performDestroyView();
        this.f338185a.mo165266n(this.f338187c, false);
        Fragment fragment2 = this.f338187c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f338187c.mInLayout = false;
    }

    /* renamed from: i */
    public void mo165282i() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        this.f338187c.performDetach();
        boolean z = false;
        this.f338185a.mo165257e(this.f338187c, false);
        Fragment fragment = this.f338187c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z2 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (!z) {
            C112965v vVar = this.f338186b.f338020c;
            if (vVar.f338173d.containsKey(this.f338187c.mWho)) {
                z2 = vVar.f338176g ? vVar.f338177h : true ^ vVar.f338178i;
            }
            if (!z2) {
                return;
            }
        }
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        this.f338187c.initState();
    }

    /* renamed from: j */
    public void mo165283j() {
        Fragment fragment = this.f338187c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Objects.toString(this.f338187c);
            }
            Fragment fragment2 = this.f338187c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.f338187c.mSavedFragmentState);
            View view = this.f338187c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f338187c;
                fragment3.mView.setTag(C0966R.C0970id.eel, fragment3);
                Fragment fragment4 = this.f338187c;
                if (fragment4.mHidden) {
                    View view2 = fragment4.mView;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "androidx/fragment/app/FragmentStateManager", "ensureInflatedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "androidx/fragment/app/FragmentStateManager", "ensureInflatedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f338187c.performViewCreated();
                C112962t tVar = this.f338185a;
                Fragment fragment5 = this.f338187c;
                tVar.mo165265m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f338187c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public void mo165284k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C112950q0.C112954d.C112956b bVar = C112950q0.C112954d.C112956b.NONE;
        if (!this.f338188d) {
            boolean z = true;
            z = false;
            try {
                while (true) {
                    int d = mo165277d();
                    Fragment fragment = this.f338187c;
                    int i = fragment.mState;
                    if (d != i) {
                        if (d <= i) {
                            switch (i - 1) {
                                case -1:
                                    mo165282i();
                                    break;
                                case 0:
                                    mo165280g();
                                    break;
                                case 1:
                                    mo165281h();
                                    this.f338187c.mState = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.isLoggingEnabled(3)) {
                                        Objects.toString(this.f338187c);
                                    }
                                    Fragment fragment2 = this.f338187c;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        mo165288o();
                                    }
                                    Fragment fragment3 = this.f338187c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        C112950q0 f = C112950q0.m154551f(viewGroup2, fragment3.getParentFragmentManager());
                                        f.getClass();
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Objects.toString(this.f338187c);
                                        }
                                        f.mo165232a(C112950q0.C112954d.C112957c.REMOVED, C112950q0.C112954d.C112956b.REMOVING, this);
                                    }
                                    this.f338187c.mState = 3;
                                    break;
                                case 4:
                                    if (FragmentManager.isLoggingEnabled(3)) {
                                        Objects.toString(this.f338187c);
                                    }
                                    this.f338187c.performStop();
                                    this.f338185a.mo165264l(this.f338187c, z);
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    if (FragmentManager.isLoggingEnabled(3)) {
                                        Objects.toString(this.f338187c);
                                    }
                                    this.f338187c.performPause();
                                    this.f338185a.mo165258f(this.f338187c, z);
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    mo165276c();
                                    break;
                                case 1:
                                    mo165278e();
                                    break;
                                case 2:
                                    mo165283j();
                                    mo165279f();
                                    break;
                                case 3:
                                    mo165274a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        C112950q0 f2 = C112950q0.m154551f(viewGroup3, fragment.getParentFragmentManager());
                                        C112950q0.C112954d.C112957c b = C112950q0.C112954d.C112957c.m154566b(this.f338187c.mView.getVisibility());
                                        f2.getClass();
                                        if (FragmentManager.isLoggingEnabled(2)) {
                                            Objects.toString(this.f338187c);
                                        }
                                        f2.mo165232a(b, C112950q0.C112954d.C112956b.ADDING, this);
                                    }
                                    this.f338187c.mState = 4;
                                    break;
                                case 5:
                                    if (FragmentManager.isLoggingEnabled(3)) {
                                        Objects.toString(this.f338187c);
                                    }
                                    this.f338187c.performStart();
                                    this.f338185a.mo165263k(this.f338187c, z);
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    mo165286m();
                                    break;
                            }
                        }
                    } else {
                        if (FragmentManager.USE_STATE_MANAGER && fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                C112950q0 f3 = C112950q0.m154551f(viewGroup, fragment.getParentFragmentManager());
                                if (this.f338187c.mHidden) {
                                    f3.getClass();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Objects.toString(this.f338187c);
                                    }
                                    f3.mo165232a(C112950q0.C112954d.C112957c.GONE, bVar, this);
                                } else {
                                    f3.getClass();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        Objects.toString(this.f338187c);
                                    }
                                    f3.mo165232a(C112950q0.C112954d.C112957c.VISIBLE, bVar, this);
                                }
                            }
                            Fragment fragment4 = this.f338187c;
                            FragmentManager fragmentManager = fragment4.mFragmentManager;
                            if (fragmentManager != null) {
                                fragmentManager.invalidateMenuForFragment(fragment4);
                            }
                            Fragment fragment5 = this.f338187c;
                            fragment5.mHiddenChanged = z;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.f338188d = z;
                        return;
                    }
                }
            } finally {
                this.f338188d = z;
            }
        } else if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(this.f338187c);
        }
    }

    /* renamed from: l */
    public void mo165285l(ClassLoader classLoader) {
        Bundle bundle = this.f338187c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f338187c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f338187c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f338187c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.f338187c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f338187c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.f338187c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f338187c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    /* renamed from: m */
    public void mo165286m() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Objects.toString(this.f338187c);
        }
        View focusedView = this.f338187c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.f338187c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.f338187c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                focusedView.requestFocus();
                if (FragmentManager.isLoggingEnabled(2)) {
                    focusedView.toString();
                    Objects.toString(this.f338187c);
                    Objects.toString(this.f338187c.mView.findFocus());
                }
            }
        }
        this.f338187c.setFocusedView((View) null);
        this.f338187c.performResume();
        this.f338185a.mo165261i(this.f338187c, false);
        Fragment fragment = this.f338187c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: n */
    public final Bundle mo165287n() {
        Bundle bundle = new Bundle();
        this.f338187c.performSaveInstanceState(bundle);
        this.f338185a.mo165262j(this.f338187c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f338187c.mView != null) {
            mo165288o();
        }
        if (this.f338187c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f338187c.mSavedViewState);
        }
        if (this.f338187c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f338187c.mSavedViewRegistryState);
        }
        if (!this.f338187c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f338187c.mUserVisibleHint);
        }
        return bundle;
    }

    /* renamed from: o */
    public void mo165288o() {
        if (this.f338187c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f338187c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f338187c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f338187c.mViewLifecycleOwner.f338129e.mo145973b(bundle);
            if (!bundle.isEmpty()) {
                this.f338187c.mSavedViewRegistryState = bundle;
            }
        }
    }

    public C112970z(C112962t tVar, C112917b0 b0Var, ClassLoader classLoader, C112949q qVar, FragmentState fragmentState) {
        this.f338185a = tVar;
        this.f338186b = b0Var;
        Fragment a = qVar.mo165135a(classLoader, fragmentState.f337987d);
        this.f338187c = a;
        Bundle bundle = fragmentState.f337996p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a.setArguments(fragmentState.f337996p);
        a.mWho = fragmentState.f337988e;
        a.mFromLayout = fragmentState.f337989f;
        a.mRestored = true;
        a.mFragmentId = fragmentState.f337990g;
        a.mContainerId = fragmentState.f337991h;
        a.mTag = fragmentState.f337992i;
        a.mRetainInstance = fragmentState.f337993j;
        a.mRemoving = fragmentState.f337994n;
        a.mDetached = fragmentState.f337995o;
        a.mHidden = fragmentState.f337997q;
        a.mMaxState = C39623j.C39626c.values()[fragmentState.f337998r];
        Bundle bundle2 = fragmentState.f337999s;
        if (bundle2 != null) {
            a.mSavedFragmentState = bundle2;
        } else {
            a.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Objects.toString(a);
        }
    }

    public C112970z(C112962t tVar, C112917b0 b0Var, Fragment fragment, FragmentState fragmentState) {
        this.f338185a = tVar;
        this.f338186b = b0Var;
        this.f338187c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f337999s;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
