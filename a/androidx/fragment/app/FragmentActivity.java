package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C103394c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C112850c;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p1094c4.a$$c;
import p1202o3.C117643a;
import p430d.C116551b;
import p918s2.C118259k;
import p918s2.C90111a;

public class FragmentActivity extends ComponentActivity implements C90111a.C90113b, C90111a.C90114c {
    public static final String FRAGMENTS_TAG = "android:support:fragments";
    public boolean mCreated;
    public final C103766u mFragmentLifecycleRegistry = new C103766u(this);
    public final C112948p mFragments = new C112948p(new C112888c());
    public boolean mResumed;
    public boolean mStopped = true;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    public class C112886a implements a$$c {
        public C112886a() {
        }

        /* renamed from: a */
        public Bundle mo144852a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.markFragmentsCreated();
            FragmentActivity.this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_STOP);
            Parcelable saveAllState = FragmentActivity.this.mFragments.f338130a.f338162g.saveAllState();
            if (saveAllState != null) {
                bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, saveAllState);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$b */
    public class C112887b implements C116551b {
        public C112887b() {
        }

        /* renamed from: a */
        public void mo164662a(Context context) {
            C112958r<?> rVar = FragmentActivity.this.mFragments.f338130a;
            rVar.f338162g.attachController(rVar, rVar, (Fragment) null);
            Bundle a = FragmentActivity.this.getSavedStateRegistry().mo145969a(FragmentActivity.FRAGMENTS_TAG);
            if (a != null) {
                Parcelable parcelable = a.getParcelable(FragmentActivity.FRAGMENTS_TAG);
                C112958r<?> rVar2 = FragmentActivity.this.mFragments.f338130a;
                if (rVar2 instanceof C0123n0) {
                    rVar2.f338162g.restoreSaveState(parcelable);
                    return;
                }
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$c */
    public class C112888c extends C112958r<FragmentActivity> implements C0123n0, C103394c, C112850c, C112967w {
        public C112888c() {
            super(FragmentActivity.this, FragmentActivity.this, new Handler(), 0);
        }

        /* renamed from: a */
        public void mo164995a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        /* renamed from: b */
        public View mo164813b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: c */
        public boolean mo164814c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: d */
        public void mo164996d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: e */
        public Object mo164997e() {
            return FragmentActivity.this;
        }

        /* renamed from: f */
        public LayoutInflater mo164998f() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        public C39623j getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        public C39630m0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        /* renamed from: h */
        public boolean mo164999h(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: i */
        public boolean mo165000i(String str) {
            return C90111a.m112742f(FragmentActivity.this, str);
        }

        /* renamed from: l */
        public void mo165001l() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }
    }

    public FragmentActivity() {
        init();
    }

    private void init() {
        getSavedStateRegistry().mo145970b(FRAGMENTS_TAG, new C112886a());
        addOnContextAvailableListener(new C112887b());
    }

    private static boolean markState(FragmentManager fragmentManager, C39623j.C39626c cVar) {
        boolean z = false;
        for (Fragment next : fragmentManager.getFragments()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z |= markState(next.getChildFragmentManager(), cVar);
                }
                C112947o0 o0Var = next.mViewLifecycleOwner;
                if (o0Var != null) {
                    o0Var.mo165230b();
                    if (o0Var.f338128d.f306531b.mo62187a(C39623j.C39626c.STARTED)) {
                        next.mViewLifecycleOwner.f338128d.mo145138f(cVar);
                        z = true;
                    }
                }
                if (next.mLifecycleRegistry.f306531b.mo62187a(C39623j.C39626c.STARTED)) {
                    next.mLifecycleRegistry.mo145138f(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f338130a.f338162g.getLayoutInflaterFactory().onCreateView(view, str, context, attributeSet);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            C117643a.m165934b(this).mo182366a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f338130a.f338162g.dump(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f338130a.f338162g;
    }

    @Deprecated
    public C117643a getSupportLoaderManager() {
        return C117643a.m165934b(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), C39623j.C39626c.CREATED));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo165231a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo165231a();
        this.mFragments.f338130a.f338162g.dispatchConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_CREATE);
        this.mFragments.f338130a.f338162g.dispatchCreate();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C112948p pVar = this.mFragments;
        return onCreatePanelMenu | pVar.f338130a.f338162g.dispatchCreateOptionsMenu(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f338130a.f338162g.dispatchDestroy();
        this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f338130a.f338162g.dispatchLowMemory();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.f338130a.f338162g.dispatchOptionsItemSelected(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.f338130a.f338162g.dispatchContextItemSelected(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.f338130a.f338162g.dispatchMultiWindowModeChanged(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo165231a();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.f338130a.f338162g.dispatchOptionsMenuClosed(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f338130a.f338162g.dispatchPause();
        this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.f338130a.f338162g.dispatchPictureInPictureModeChanged(z);
    }

    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.f338130a.f338162g.dispatchPrepareOptionsMenu(menu) : super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo165231a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.mResumed = true;
        this.mFragments.mo165231a();
        this.mFragments.f338130a.f338162g.execPendingActions(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_RESUME);
        this.mFragments.f338130a.f338162g.dispatchResume();
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.f338130a.f338162g.dispatchActivityCreated();
        }
        this.mFragments.mo165231a();
        this.mFragments.f338130a.f338162g.execPendingActions(true);
        this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_START);
        this.mFragments.f338130a.f338162g.dispatchStart();
    }

    public void onStateNotSaved() {
        this.mFragments.mo165231a();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.f338130a.f338162g.dispatchStop();
        this.mFragmentLifecycleRegistry.mo145135c(C39623j.C39625b.ON_STOP);
    }

    public void setEnterSharedElementCallback(C118259k kVar) {
        int i = C90111a.f258766c;
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(C118259k kVar) {
        int i = C90111a.f258766c;
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            int i5 = C90111a.f258766c;
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void supportFinishAfterTransition() {
        int i = C90111a.f258766c;
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i = C90111a.f258766c;
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        int i = C90111a.f258766c;
        startPostponedEnterTransition();
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            int i2 = C90111a.f258766c;
            startActivityForResult(intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i, bundle);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView((View) null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        init();
    }
}
