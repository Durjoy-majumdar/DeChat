package com.tencent.p014mm.p136ui.component;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53930o0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import bl3.C113199a;
import bl3.C39812a0;
import bl3.C39818r;
import bl3.C54492n;
import bl3.C54495t;
import com.tencent.p014mm.p136ui.component.support.ActivityLifecycleInjector;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C36570n;
import sx3.C64175a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\b\t*\u0001r\b&\u0018\u0000 x2\u00020\u0001:\u0001yB\u0007¢\u0006\u0004\bv\u0010wJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010\u0015\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0003J\b\u0010\u0016\u001a\u00020\u0004H\u0002J%\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0019\u0018\u00010\u001dH&J0\u0010\"\u001a\u00020\u00042&\u0010!\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u00190\u001fj\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0019` H\u0017J\b\u0010#\u001a\u00020\u000eH\u0016J \u0010%\u001a\u00020\u00042\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001fj\b\u0012\u0004\u0012\u00020\u000b` H\u0014J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010(\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010/H\u0014J\b\u00102\u001a\u00020\u0004H\u0016J\b\u00103\u001a\u00020\u0004H\u0016J\u0012\u00104\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u00105\u001a\u00020\u0004H\u0014J\b\u00106\u001a\u00020\u0004H\u0014J\u0010\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0013H\u0016J\b\u00109\u001a\u00020\u0004H\u0014J\b\u0010:\u001a\u00020\u0004H\u0014J\u0012\u0010;\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010=\u001a\u00020<H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\u0018\u0010C\u001a\u00020\u00132\u0006\u0010@\u001a\u00020&2\u0006\u0010B\u001a\u00020AH\u0016J\u0018\u0010D\u001a\u00020\u00132\u0006\u0010@\u001a\u00020&2\u0006\u0010B\u001a\u00020AH\u0016J\b\u0010E\u001a\u00020\u0004H\u0017J\b\u0010F\u001a\u00020\u0004H\u0014J\b\u0010G\u001a\u00020\u0004H\u0017J\"\u0010K\u001a\u00020\u00042\u0006\u0010H\u001a\u00020&2\u0006\u0010I\u001a\u00020&2\b\u0010J\u001a\u0004\u0018\u00010,H\u0014J/\u0010Q\u001a\u00020\u00042\u0006\u0010H\u001a\u00020&2\u000e\u0010N\u001a\n\u0012\u0006\b\u0001\u0012\u00020M0L2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0010\u0010S\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0010\u0010U\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u0006H\u0014J$\u0010W\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010H\u001a\u00020&2\b\u0010V\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010X\u001a\u00020\u0004H\u0016J\b\u0010Y\u001a\u00020\u0004H\u0016J\u0016\u0010Z\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0019J\u0018\u0010]\u001a\b\u0012\u0004\u0012\u00020\u000b0\\2\b\b\u0002\u0010[\u001a\u00020\u0013H\u0004J\b\u0010^\u001a\u00020\u0013H\u0014R\u001a\u0010`\u001a\u00020_8\u0016X\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010dR*\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001fj\b\u0012\u0004\u0012\u00020\u000b` 8\u0014X\u0004¢\u0006\f\n\u0004\b$\u0010e\u001a\u0004\bf\u0010gR$\u0010h\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010q¨\u0006z"}, mo182094d2 = {"Lcom/tencent/mm/ui/component/UIComponentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View;", "contentView", "Lrx3/b0;", "dispatchViewCreated", "Landroid/os/Bundle;", "savedInstanceState", "onPostCreated", "Landroidx/lifecycle/j$c;", "currentState", "Lcom/tencent/mm/ui/component/UIComponent;", "uic", "initUIComponentToState", "Landroidx/lifecycle/m0;", "src", "dest", "Lkotlin/Function1;", "", "", "isStore", "mapStoreTo", "checkWindowFocusChangeFallbackOnStop", "Landroidx/lifecycle/i0;", "T", "Ljava/lang/Class;", "modelClass", "component", "(Ljava/lang/Class;)Landroidx/lifecycle/i0;", "", "importUIComponents", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "set", "superImportUIComponents", "getViewModelStore", "uiComponents", "initializeUIC", "", "layoutResID", "setContentView", "view", "Landroid/view/ViewGroup$LayoutParams;", "params", "Landroid/content/Intent;", "intent", "startActivity", "Landroid/content/Context;", "newBase", "attachBaseContext", "registerActivityDetailedLifecycleCallbacks", "unregisterActivityDetailedLifecycleCallbacks", "onCreate", "onStart", "onResume", "hasFocus", "onWindowFocusChanged", "onPause", "onStop", "onNewIntent", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "onBackPressed", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "onKeyUp", "onPreDestroyed", "onDestroy", "onPostDestroyed", "requestCode", "resultCode", "data", "onActivityResult", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onRestoreInstanceState", "outState", "onSaveInstanceState", "options", "startActivityForResult", "finishAfterTransition", "finish", "containUIC", "includeFragment", "", "activeUIComponents", "enableLazyInitUIC", "La14/n0;", "lifecycleAsyncScope", "La14/n0;", "getLifecycleAsyncScope", "()La14/n0;", "Landroid/os/Bundle;", "Ljava/util/HashSet;", "getUiComponents", "()Ljava/util/HashSet;", "layoutUIC", "Lcom/tencent/mm/ui/component/UIComponent;", "getLayoutUIC", "()Lcom/tencent/mm/ui/component/UIComponent;", "setLayoutUIC", "(Lcom/tencent/mm/ui/component/UIComponent;)V", "modelStore", "Landroidx/lifecycle/m0;", "isFirstResume", "Z", "com/tencent/mm/ui/component/UIComponentActivity$b", "activityLifecycleDetailedCallbacks", "Lcom/tencent/mm/ui/component/UIComponentActivity$b;", "isWindowFocus", "<init>", "()V", "Companion", "a", "plugin-uic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.component.UIComponentActivity */
public abstract class UIComponentActivity extends AppCompatActivity {
    public static final C44871a Companion = new C44871a((C8480h) null);
    private static final String TAG = "MicroMsg.UIComponentActivity";
    private final C116075b activityLifecycleDetailedCallbacks = new C116075b(this);
    private boolean isFirstResume = true;
    private boolean isWindowFocus;
    private UIComponent layoutUIC;
    private final C0000n0 lifecycleAsyncScope = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));
    private C39630m0 modelStore;
    private Bundle savedInstanceState;
    private final HashSet<UIComponent> uiComponents = new HashSet<>();

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$a */
    public static final class C44871a {
        public C44871a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$f */
    public static final class C44872f extends C87413o implements C32226l<Object, Boolean> {

        /* renamed from: d */
        public static final C44872f f121732d = new C44872f();

        public C44872f() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, "model");
            return Boolean.valueOf(!(obj instanceof C54492n));
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$c */
    public static final class C57814c extends C87413o implements C32226l<Object, Boolean> {

        /* renamed from: d */
        public static final C57814c f165429d = new C57814c();

        public C57814c() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$g */
    public static final class C57815g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ HashSet<Class<? extends C54495t>> f165430d;

        /* renamed from: e */
        public final /* synthetic */ UIComponentActivity f165431e;

        /* renamed from: f */
        public final /* synthetic */ View f165432f;

        public C57815g(HashSet<Class<? extends C54495t>> hashSet, UIComponentActivity uIComponentActivity, View view) {
            this.f165430d = hashSet;
            this.f165431e = uIComponentActivity;
            this.f165432f = view;
        }

        public final void run() {
            HashSet<Class> hashSet = new HashSet<>();
            hashSet.addAll(this.f165430d);
            this.f165430d.clear();
            C39623j.C39626c currentState = this.f165431e.getLifecycle().getCurrentState();
            C87412m.m108593f(currentState, "this.lifecycle.currentState");
            Log.m105924i(UIComponentActivity.TAG, "onResume: lazy init uic size = " + hashSet.size() + ", currentState=" + currentState);
            HashSet<UIComponent> hashSet2 = new HashSet<>();
            UIComponentActivity uIComponentActivity = this.f165431e;
            for (Class a : hashSet) {
                C39622i0 a2 = C39818r.f106831a.mo62444c(uIComponentActivity).mo75002a(a);
                C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponent");
                UIComponent uIComponent = (UIComponent) a2;
                View decorView = uIComponentActivity.getWindow().getDecorView();
                C87412m.m108593f(decorView, "window.decorView");
                uIComponent.setRootView(decorView);
                uIComponentActivity.getUiComponents().add(uIComponent);
                hashSet2.add(uIComponent);
            }
            UIComponentActivity uIComponentActivity2 = this.f165431e;
            View view = this.f165432f;
            for (UIComponent access$initUIComponentToState : hashSet2) {
                uIComponentActivity2.initUIComponentToState(currentState, access$initUIComponentToState, view);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$d */
    public static final class C85844d extends C87413o implements C32226l<C39622i0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ UIComponentActivity f250043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85844d(UIComponentActivity uIComponentActivity) {
            super(1);
            this.f250043d = uIComponentActivity;
        }

        public Object invoke(Object obj) {
            C39622i0 i0Var = (C39622i0) obj;
            C87412m.m108594g(i0Var, "vm");
            return Boolean.valueOf(!this.f250043d.isChangingConfigurations() || (i0Var instanceof UIComponent));
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$e */
    public static final class C85845e extends C87413o implements C32226l<C39622i0, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ UIComponentActivity f250044d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85845e(UIComponentActivity uIComponentActivity) {
            super(1);
            this.f250044d = uIComponentActivity;
        }

        public Object invoke(Object obj) {
            C39622i0 i0Var = (C39622i0) obj;
            C87412m.m108594g(i0Var, "vm");
            return Boolean.valueOf(!this.f250044d.isChangingConfigurations() || (i0Var instanceof UIComponent));
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentActivity$b */
    public static final class C116075b implements C113199a {

        /* renamed from: a */
        public final /* synthetic */ UIComponentActivity f348352a;

        public C116075b(UIComponentActivity uIComponentActivity) {
            this.f348352a = uIComponentActivity;
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (C87412m.m108589b(activity, this.f348352a)) {
                this.f348352a.onPostCreated(bundle);
            }
        }

        public void onActivityPostDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (C87412m.m108589b(activity, this.f348352a)) {
                this.f348352a.onPostDestroyed();
            }
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (C87412m.m108589b(activity, this.f348352a)) {
                this.f348352a.onPreDestroyed();
            }
        }
    }

    public static /* synthetic */ List activeUIComponents$default(UIComponentActivity uIComponentActivity, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return uIComponentActivity.activeUIComponents(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: activeUIComponents");
    }

    private final void checkWindowFocusChangeFallbackOnStop() {
        if (this.isWindowFocus) {
            onWindowFocusChanged(false);
        }
    }

    private final void dispatchViewCreated(View view) {
        Log.m105924i(TAG, "[dispatchViewCreated]... " + getClass().getSimpleName() + '@' + hashCode() + " contentView=" + view);
        for (UIComponent onViewCreated : activeUIComponents(false)) {
            onViewCreated.onViewCreated(view);
        }
    }

    /* access modifiers changed from: private */
    public final void initUIComponentToState(C39623j.C39626c cVar, UIComponent uIComponent, View view) {
        Log.m105918d(TAG, "initUIComponentToState: currentState=" + cVar + ", uic=" + uIComponent);
        if (cVar.compareTo(C39623j.C39626c.CREATED) >= 0) {
            uIComponent.onCreateBefore(this.savedInstanceState);
            uIComponent.onViewCreated(view);
            uIComponent.onCreate(this.savedInstanceState);
            uIComponent.onCreateAfter(this.savedInstanceState);
            if (cVar.compareTo(C39623j.C39626c.STARTED) >= 0) {
                uIComponent.onStart();
            }
            if (cVar.compareTo(C39623j.C39626c.RESUMED) >= 0) {
                uIComponent.onResume();
                uIComponent.onWindowFocusChanged(true);
            }
        }
    }

    private final void mapStoreTo(C39630m0 m0Var, C39630m0 m0Var2, C32226l<Object, Boolean> lVar) {
        if (m0Var != null) {
            Field declaredField = C39630m0.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(m0Var);
            C87412m.m108592e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            Object obj2 = declaredField.get(m0Var2);
            C87412m.m108592e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            HashMap hashMap = (HashMap) obj2;
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                if (lVar.invoke(entry.getValue()).booleanValue()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static /* synthetic */ void mapStoreTo$default(UIComponentActivity uIComponentActivity, C39630m0 m0Var, C39630m0 m0Var2, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                lVar = C57814c.f165429d;
            }
            uIComponentActivity.mapStoreTo(m0Var, m0Var2, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mapStoreTo");
    }

    /* access modifiers changed from: private */
    public final void onPostCreated(Bundle bundle) {
        Log.m105924i(TAG, "[onPostCreated]... " + getClass().getSimpleName() + '@' + hashCode() + " isChangingConfigurations=" + isChangingConfigurations());
        List<UIComponent> activeUIComponents = activeUIComponents(false);
        for (UIComponent rootView : activeUIComponents) {
            View decorView = getWindow().getDecorView();
            C87412m.m108593f(decorView, "window.decorView");
            rootView.setRootView(decorView);
        }
        for (UIComponent onCreate : activeUIComponents) {
            onCreate.onCreate(bundle);
        }
        for (UIComponent onCreateAfter : activeUIComponents) {
            onCreateAfter.onCreateAfter(bundle);
        }
    }

    public final List<UIComponent> activeUIComponents(boolean z) {
        LinkedList linkedList = new LinkedList(getUiComponents());
        if (z) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            C87412m.m108593f(fragments, "supportFragmentManager.fragments");
            ArrayList arrayList = new ArrayList();
            for (T next : fragments) {
                if (next instanceof UIComponentFragment) {
                    arrayList.add(next);
                }
            }
            ArrayList<UIComponentFragment> arrayList2 = new ArrayList<>();
            for (Object next2 : arrayList) {
                if (((UIComponentFragment) next2).isVisible()) {
                    arrayList2.add(next2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (UIComponentFragment uIComponentFragment : arrayList2) {
                C64175a0.m75508p(arrayList3, uIComponentFragment.f165434e);
            }
            linkedList.addAll(arrayList3);
        }
        return linkedList;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        registerActivityDetailedLifecycleCallbacks();
    }

    public final <T extends C39622i0> T component(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        T a = C39818r.f106831a.mo62444c(this).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(this).get(modelClass)");
        return a;
    }

    public final boolean containUIC(Class<? extends UIComponent> cls) {
        C87412m.m108594g(cls, "modelClass");
        return C39818r.f106831a.mo62444c(this).mo62449e(cls) != null;
    }

    public boolean enableLazyInitUIC() {
        return false;
    }

    public void finish() {
        Object obj;
        Intent intent = null;
        List<UIComponent> activeUIComponents$default = activeUIComponents$default(this, false, 1, (Object) null);
        for (UIComponent uIComponent : activeUIComponents$default) {
            if (uIComponent.onInterceptFinish()) {
                Log.m105928w(TAG, uIComponent + " intercept finish!");
                return;
            }
        }
        try {
            Result.Companion companion = Result.Companion;
            Field declaredField = Activity.class.getDeclaredField("mResultData");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            obj = Result.m168114constructorimpl(obj2 instanceof Intent ? (Intent) obj2 : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m168120isFailureimpl(obj)) {
            intent = obj;
        }
        Intent intent2 = intent;
        if (intent2 == null) {
            intent2 = new Intent();
        }
        for (UIComponent onBeforeFinish : activeUIComponents$default) {
            onBeforeFinish.onBeforeFinish(intent2);
        }
        super.finish();
        for (UIComponent onFinished : activeUIComponents$default) {
            onFinished.onFinished();
        }
    }

    public void finishAfterTransition() {
        for (UIComponent onBeforeFinishAfterTransition : activeUIComponents$default(this, false, 1, (Object) null)) {
            onBeforeFinishAfterTransition.onBeforeFinishAfterTransition();
        }
        super.finishAfterTransition();
    }

    public final UIComponent getLayoutUIC() {
        return this.layoutUIC;
    }

    public C0000n0 getLifecycleAsyncScope() {
        return this.lifecycleAsyncScope;
    }

    public HashSet<UIComponent> getUiComponents() {
        return this.uiComponents;
    }

    public C39630m0 getViewModelStore() {
        C39630m0 m0Var = this.modelStore;
        if (m0Var != null) {
            return m0Var;
        }
        C39812a0 a0Var = new C39812a0(false, 1, (C8480h) null);
        mapStoreTo$default(this, super.getViewModelStore(), a0Var, (C32226l) null, 4, (Object) null);
        this.modelStore = a0Var;
        return a0Var;
    }

    public abstract Set<Class<? extends UIComponent>> importUIComponents();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        r6 = (bl3.C113200q) r6.getAnnotation(bl3.C113200q.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initializeUIC(java.util.HashSet<com.tencent.p014mm.p136ui.component.UIComponent> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "uiComponents"
            gy3.C87412m.m108594g(r9, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r8.superImportUIComponents(r0)
            boolean r1 = r8.enableLazyInitUIC()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00b4
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r0.iterator()
        L_0x001e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.String r7 = "clazz"
            gy3.C87412m.m108594g(r6, r7)
            java.lang.Class<bl3.q> r7 = bl3.C113200q.class
            boolean r7 = r6.isAnnotationPresent(r7)
            if (r7 == 0) goto L_0x0047
            java.lang.Class<bl3.q> r7 = bl3.C113200q.class
            java.lang.annotation.Annotation r6 = r6.getAnnotation(r7)
            bl3.q r6 = (bl3.C113200q) r6
            if (r6 == 0) goto L_0x0047
            int r6 = r6.initialMode()
            goto L_0x0048
        L_0x0047:
            r6 = 1
        L_0x0048:
            r7 = 2
            if (r6 != r7) goto L_0x004d
            r6 = 1
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x001e
            r1.add(r5)
            goto L_0x001e
        L_0x0054:
            androidx.lifecycle.m0 r4 = r8.getViewModelStore()
            boolean r5 = r4 instanceof bl3.C39812a0
            if (r5 == 0) goto L_0x0060
            r5 = r4
            bl3.a0 r5 = (bl3.C39812a0) r5
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            java.lang.String r6 = "MicroMsg.UIComponentActivity"
            if (r5 == 0) goto L_0x007c
            rx3.g r5 = r5.f106827f
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.util.HashSet r5 = (java.util.HashSet) r5
            if (r5 == 0) goto L_0x007c
            java.util.Set r4 = sx3.C110818d0.m150904D0(r1)
            r0.removeAll(r4)
            r5.addAll(r1)
            goto L_0x0090
        L_0x007c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "initializeUIC: error, viewModelStore="
            r5.append(r7)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
        L_0x0090:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "initializeUIC: lazy init uic size="
            r4.append(r5)
            int r1 = r1.size()
            r4.append(r1)
            java.lang.String r1 = ", need init size="
            r4.append(r1)
            int r1 = r0.size()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
        L_0x00b4:
            java.util.Iterator r0 = r0.iterator()
        L_0x00b8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62444c(r8)
            androidx.lifecycle.i0 r1 = r4.mo75002a(r1)
            com.tencent.mm.ui.component.UIComponent r1 = (com.tencent.p014mm.p136ui.component.UIComponent) r1
            r9.add(r1)
            int r4 = r1.getLayoutId()
            if (r4 == 0) goto L_0x00b8
            r8.layoutUIC = r1
            if (r2 != 0) goto L_0x00df
            r2 = 1
            goto L_0x00b8
        L_0x00df:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "already layout uic["
            r0.append(r1)
            com.tencent.mm.ui.component.UIComponent r1 = r8.layoutUIC
            r0.append(r1)
            java.lang.String r1 = "], no more than one layout uic."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.component.UIComponentActivity.initializeUIC(java.util.HashSet):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        for (UIComponent onActivityResult : activeUIComponents$default(this, false, 1, (Object) null)) {
            onActivityResult.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        for (UIComponent onBackPressed : activeUIComponents$default(this, false, 1, (Object) null)) {
            if (onBackPressed.onBackPressed()) {
                return;
            }
        }
        try {
            super.onBackPressed();
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "backpressed err", new Object[0]);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        for (UIComponent onConfigurationChanged : activeUIComponents(false)) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.savedInstanceState = bundle;
        Log.m105924i(TAG, "[onCreate]... " + getClass().getSimpleName() + '@' + hashCode() + " isChangingConfigurations=" + isChangingConfigurations());
        initializeUIC(getUiComponents());
        for (UIComponent onCreateBefore : activeUIComponents(false)) {
            onCreateBefore.onCreateBefore(bundle);
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        Log.m105924i(TAG, "[onDestroy]... " + getClass().getSimpleName() + '@' + hashCode() + " isChangingConfigurations=" + isChangingConfigurations());
        C39630m0 viewModelStore = getViewModelStore();
        C39812a0 a0Var = viewModelStore instanceof C39812a0 ? (C39812a0) viewModelStore : null;
        if (a0Var != null && !a0Var.f106825d) {
            for (UIComponent onDestroy : activeUIComponents(false)) {
                onDestroy.onDestroy();
            }
            super.onDestroy();
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        for (UIComponent onKeyDown : activeUIComponents$default(this, false, 1, (Object) null)) {
            if (onKeyDown.onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        for (UIComponent onKeyUp : activeUIComponents$default(this, false, 1, (Object) null)) {
            if (onKeyUp.onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        for (UIComponent onNewIntent : activeUIComponents$default(this, false, 1, (Object) null)) {
            onNewIntent.onNewIntent(intent);
        }
    }

    public void onPause() {
        super.onPause();
        for (UIComponent onPause : activeUIComponents(false)) {
            onPause.onPause();
        }
    }

    public void onPostDestroyed() {
        Log.m105924i(TAG, "[onPostDestroyed]... " + getClass().getSimpleName() + '@' + hashCode() + " isChangingConfigurations=" + isChangingConfigurations());
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments, "supportFragmentManager.fragments");
        ArrayList<UIComponentFragment> arrayList = new ArrayList<>();
        for (T next : fragments) {
            if (next instanceof UIComponentFragment) {
                arrayList.add(next);
            }
        }
        for (UIComponentFragment uIComponentFragment : arrayList) {
            uIComponentFragment.getClass();
        }
        for (UIComponent onPostDestroyed : activeUIComponents(false)) {
            onPostDestroyed.onPostDestroyed();
        }
        C39630m0 viewModelStore = getViewModelStore();
        Log.m105924i(TAG, String.valueOf(viewModelStore instanceof C39812a0 ? (C39812a0) viewModelStore : null));
        List<Fragment> fragments2 = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments2, "supportFragmentManager.fragments");
        ArrayList<UIComponentFragment> arrayList2 = new ArrayList<>();
        for (T next2 : fragments2) {
            if (next2 instanceof UIComponentFragment) {
                arrayList2.add(next2);
            }
        }
        for (UIComponentFragment viewModelStore2 : arrayList2) {
            C39630m0 viewModelStore3 = viewModelStore2.getViewModelStore();
            C39812a0 a0Var = viewModelStore3 instanceof C39812a0 ? (C39812a0) viewModelStore3 : null;
            if (a0Var != null) {
                a0Var.mo62428b(new C85844d(this));
            }
        }
        C39630m0 viewModelStore4 = getViewModelStore();
        C39812a0 a0Var2 = viewModelStore4 instanceof C39812a0 ? (C39812a0) viewModelStore4 : null;
        if (a0Var2 != null) {
            a0Var2.mo62428b(new C85845e(this));
        }
        C0000n0 lifecycleAsyncScope2 = getLifecycleAsyncScope();
        C53930o0.m60557d(lifecycleAsyncScope2, this + " onPostDestroyed.", (Throwable) null, 2, (Object) null);
        unregisterActivityDetailedLifecycleCallbacks();
    }

    public void onPreDestroyed() {
        Log.m105924i(TAG, "[onPreDestroyed]... " + getClass().getSimpleName() + '@' + hashCode() + " isChangingConfigurations=" + isChangingConfigurations());
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        C87412m.m108593f(fragments, "supportFragmentManager.fragments");
        ArrayList<UIComponentFragment> arrayList = new ArrayList<>();
        for (T next : fragments) {
            if (next instanceof UIComponentFragment) {
                arrayList.add(next);
            }
        }
        for (UIComponentFragment N : arrayList) {
            N.mo82249N();
        }
        for (UIComponent onPreDestroyed : activeUIComponents(false)) {
            onPreDestroyed.onPreDestroyed();
        }
        C39630m0 viewModelStore = getViewModelStore();
        C39630m0 viewModelStore2 = super.getViewModelStore();
        C87412m.m108593f(viewModelStore2, "super.getViewModelStore()");
        mapStoreTo(viewModelStore, viewModelStore2, C44872f.f121732d);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        for (UIComponent onRequestPermissionsResult : activeUIComponents$default(this, false, 1, (Object) null)) {
            onRequestPermissionsResult.onRequestPermissionsResult(i, strArr, iArr);
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        for (UIComponent onRestoreInstanceState : activeUIComponents(false)) {
            onRestoreInstanceState.onRestoreInstanceState(bundle);
        }
    }

    public void onResume() {
        HashSet hashSet;
        super.onResume();
        for (UIComponent onResume : activeUIComponents(false)) {
            onResume.onResume();
        }
        if (this.isFirstResume) {
            this.isFirstResume = false;
            C39630m0 viewModelStore = getViewModelStore();
            View view = null;
            C39812a0 a0Var = viewModelStore instanceof C39812a0 ? (C39812a0) viewModelStore : null;
            if (a0Var != null && (hashSet = (HashSet) ((C36570n) a0Var.f106827f).getValue()) != null) {
                if (!(!hashSet.isEmpty())) {
                    hashSet = null;
                }
                if (hashSet != null) {
                    ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().findViewById(16908290);
                    if (viewGroup != null) {
                        view = viewGroup.getChildAt(0);
                    }
                    if (view == null) {
                        view = getWindow().getDecorView();
                        C87412m.m108593f(view, "window.decorView");
                    }
                    view.post(new C57815g(hashSet, this, view));
                }
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        for (UIComponent onSaveInstanceState : activeUIComponents(false)) {
            onSaveInstanceState.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        for (UIComponent onStart : activeUIComponents(false)) {
            onStart.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        checkWindowFocusChangeFallbackOnStop();
        for (UIComponent onStop : activeUIComponents(false)) {
            onStop.onStop();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.isWindowFocus = z;
        Log.m105924i(TAG, "[onWindowFocusChanged] hasFocus=" + z + " activity=" + getClass().getSimpleName());
        for (UIComponent uIComponent : activeUIComponents$default(this, false, 1, (Object) null)) {
            if (!uIComponent.isBelongFragment()) {
                if (z) {
                    uIComponent.onUserVisibleFocused();
                } else {
                    uIComponent.onUserVisibleUnFocused();
                }
            }
            uIComponent.onWindowFocusChanged(z);
        }
    }

    public void registerActivityDetailedLifecycleCallbacks() {
        ActivityLifecycleInjector activityLifecycleInjector = ActivityLifecycleInjector.f348353a;
        C116075b bVar = this.activityLifecycleDetailedCallbacks;
        C87412m.m108594g(bVar, "callback");
        ArrayList<C113199a> arrayList = ActivityLifecycleInjector.f348354b;
        synchronized (arrayList) {
            arrayList.add(bVar);
        }
    }

    public void setContentView(int i) {
        View childAt;
        super.setContentView(i);
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView().findViewById(16908290);
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            dispatchViewCreated(childAt);
        }
    }

    public final void setLayoutUIC(UIComponent uIComponent) {
        this.layoutUIC = uIComponent;
    }

    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (intent != null) {
            for (UIComponent onStartActivityForResult : activeUIComponents$default(this, false, 1, (Object) null)) {
                onStartActivityForResult.onStartActivityForResult(intent, i, bundle);
            }
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        Set<Class<? extends UIComponent>> importUIComponents = importUIComponents();
        if (importUIComponents != null) {
            hashSet.addAll(importUIComponents);
        }
    }

    public void unregisterActivityDetailedLifecycleCallbacks() {
        ActivityLifecycleInjector activityLifecycleInjector = ActivityLifecycleInjector.f348353a;
        C116075b bVar = this.activityLifecycleDetailedCallbacks;
        C87412m.m108594g(bVar, "callback");
        ArrayList<C113199a> arrayList = ActivityLifecycleInjector.f348354b;
        synchronized (arrayList) {
            arrayList.remove(bVar);
        }
    }

    public void setContentView(View view) {
        super.setContentView(view);
        if (view != null) {
            dispatchViewCreated(view);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        if (view != null) {
            dispatchViewCreated(view);
        }
    }
}
