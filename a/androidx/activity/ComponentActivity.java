package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C112850c;
import androidx.activity.result.C67073a;
import androidx.activity.result.C67074b;
import androidx.lifecycle.C0121i;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103762g0;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C112980e0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import com.tencent.p014mm.C0966R;
import gy3.C8480h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p1094c4.C104290a;
import p1094c4.C104291b;
import p1094c4.C104292c;
import p1094c4.C104293d;
import p1118h4.C108057a;
import p430d.C116550a;
import p430d.C116551b;
import p431e.C116634a;
import p849e3.C116677f;
import p849e3.C116678i;
import p849e3.f$$a;
import p849e3.f$$b;
import p849e3.f$$c;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements C0123n0, C0121i, C104292c, C103394c, C112850c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final C116550a mContextAwareHelper;
    private C54209k0.C54210b mDefaultFactory;
    private final C103766u mLifecycleRegistry;
    private final C116677f mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final C104291b mSavedStateRegistryController;
    private C39630m0 mViewModelStore;

    public ComponentActivity() {
        this.mContextAwareHelper = new C116550a();
        this.mMenuHostHelper = new C116677f(new ComponentActivity$$a(this));
        this.mLifecycleRegistry = new C103766u(this);
        this.mSavedStateRegistryController = new C104291b(this, (C8480h) null);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new ComponentActivity$$d(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new ComponentActivity$$e(this);
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().addObserver(new C103764p() {
                /* renamed from: k4 */
                public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                    if (bVar == C39623j.C39625b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().addObserver(new C103764p() {
                /* renamed from: k4 */
                public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                    if (bVar == C39623j.C39625b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f349550b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().mo62188a();
                        }
                    }
                }
            });
            getLifecycle().addObserver(new C103764p() {
                /* renamed from: k4 */
                public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().removeObserver(this);
                }
            });
            if (i <= 23) {
                getLifecycle().addObserver(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().mo145970b(ACTIVITY_RESULT_TAG, new ComponentActivity$$b(this));
            addOnContextAvailableListener(new ComponentActivity$$c(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(C0966R.C0970id.l8r, this);
        getWindow().getDecorView().setTag(C0966R.C0970id.l8t, this);
        C104293d.m139245b(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = this.mActivityResultRegistry;
        activityResultRegistry.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(((HashMap) activityResultRegistry.f337845c).values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(((HashMap) activityResultRegistry.f337845c).keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(activityResultRegistry.f337847e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f337850h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.f337843a);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle a = getSavedStateRegistry().mo145969a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            this.mActivityResultRegistry.mo164680c(a);
        }
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(C116678i iVar) {
        C116677f fVar = this.mMenuHostHelper;
        fVar.f349930b.add(iVar);
        fVar.f349929a.run();
    }

    public final void addOnContextAvailableListener(C116551b bVar) {
        C116550a aVar = this.mContextAwareHelper;
        if (aVar.f349550b != null) {
            bVar.mo164662a(aVar.f349550b);
        }
        ((CopyOnWriteArraySet) aVar.f349549a).add(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            ComponentActivity$$f componentActivity$$f = (ComponentActivity$$f) getLastNonConfigurationInstance();
            if (componentActivity$$f != null) {
                this.mViewModelStore = componentActivity$$f.f337832b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new C39630m0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public C54209k0.C54210b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new C103762g0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        ComponentActivity$$f componentActivity$$f = (ComponentActivity$$f) getLastNonConfigurationInstance();
        if (componentActivity$$f != null) {
            return componentActivity$$f.f337831a;
        }
        return null;
    }

    public C39623j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final C104290a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f308652b;
    }

    public C39630m0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.mo164679a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.mo164667b();
    }

    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.mo145972a(bundle);
        C116550a aVar = this.mContextAwareHelper;
        aVar.f349550b = this;
        Iterator it = ((CopyOnWriteArraySet) aVar.f349549a).iterator();
        while (it.hasNext()) {
            ((C116551b) it.next()).mo164662a(this);
        }
        super.onCreate(bundle);
        C112980e0.m154618c(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        C116677f fVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<C116678i> it = fVar.f349930b.iterator();
        while (it.hasNext()) {
            it.next().mo180681b(menu, menuInflater);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        Iterator<C116678i> it = this.mMenuHostHelper.f349930b.iterator();
        while (it.hasNext()) {
            if (it.next().mo180680a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.mo164679a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        ComponentActivity$$f componentActivity$$f;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        C39630m0 m0Var = this.mViewModelStore;
        if (m0Var == null && (componentActivity$$f = (ComponentActivity$$f) getLastNonConfigurationInstance()) != null) {
            m0Var = componentActivity$$f.f337832b;
        }
        if (m0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ComponentActivity$$f componentActivity$$f2 = new ComponentActivity$$f();
        componentActivity$$f2.f337831a = onRetainCustomNonConfigurationInstance;
        componentActivity$$f2.f337832b = m0Var;
        return componentActivity$$f2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C39623j lifecycle = getLifecycle();
        if (lifecycle instanceof C103766u) {
            ((C103766u) lifecycle).mo145138f(C39623j.C39626c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.mo145973b(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f349550b;
    }

    public final <I, O> C67074b<I> registerForActivityResult(C116634a<I, O> aVar, ActivityResultRegistry activityResultRegistry, C67073a<O> aVar2) {
        return activityResultRegistry.mo164681d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    public void removeMenuProvider(C116678i iVar) {
        this.mMenuHostHelper.mo180679a(iVar);
    }

    public final void removeOnContextAvailableListener(C116551b bVar) {
        ((CopyOnWriteArraySet) this.mContextAwareHelper.f349549a).remove(bVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C108057a.m146362a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> C67074b<I> registerForActivityResult(C116634a<I, O> aVar, C67073a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void addMenuProvider(C116678i iVar, C0125s sVar) {
        C116677f fVar = this.mMenuHostHelper;
        fVar.f349930b.add(iVar);
        fVar.f349929a.run();
        C39623j lifecycle = sVar.getLifecycle();
        f$$c f__c = (f$$c) ((HashMap) fVar.f349931c).remove(iVar);
        if (f__c != null) {
            f__c.f349937a.removeObserver(f__c.f349938b);
            f__c.f349938b = null;
        }
        f$$a f__a = new f$$a(fVar, iVar);
        ((HashMap) fVar.f349931c).put(iVar, new f$$c(lifecycle, f__a));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(C116678i iVar, C0125s sVar, C39623j.C39626c cVar) {
        C116677f fVar = this.mMenuHostHelper;
        fVar.getClass();
        C39623j lifecycle = sVar.getLifecycle();
        f$$c f__c = (f$$c) ((HashMap) fVar.f349931c).remove(iVar);
        if (f__c != null) {
            f__c.f349937a.removeObserver(f__c.f349938b);
            f__c.f349938b = null;
        }
        f$$b f__b = new f$$b(fVar, cVar, iVar);
        ((HashMap) fVar.f349931c).put(iVar, new f$$c(lifecycle, f__b));
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
