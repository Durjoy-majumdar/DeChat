package com.tencent.p014mm.p136ui.component;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C39630m0;
import bl3.C0326v;
import bl3.C39812a0;
import bl3.C39818r;
import bl3.C54492n;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/component/UIComponentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "plugin-uic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.component.UIComponentFragment */
public abstract class UIComponentFragment extends HellAndroidXFragment {

    /* renamed from: d */
    public int f165433d;

    /* renamed from: e */
    public final HashSet<UIComponent> f165434e = new HashSet<>();

    /* renamed from: f */
    public UIComponent f165435f;

    /* renamed from: g */
    public C39630m0 f165436g;

    /* renamed from: h */
    public View f165437h;

    /* renamed from: i */
    public final LinkedList<Runnable> f165438i = new LinkedList<>();

    /* renamed from: com.tencent.mm.ui.component.UIComponentFragment$a */
    public static final class C57816a extends C87413o implements C32226l<Object, Boolean> {

        /* renamed from: d */
        public static final C57816a f165439d = new C57816a();

        public C57816a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, "model");
            return Boolean.valueOf(!(obj instanceof C54492n));
        }
    }

    /* renamed from: com.tencent.mm.ui.component.UIComponentFragment$b */
    public static final class C57817b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ UIComponentFragment f165440d;

        public C57817b(UIComponentFragment uIComponentFragment) {
            this.f165440d = uIComponentFragment;
        }

        public final void run() {
            Log.m105924i("MicroMsg.UIComponentFragment", "[onViewFocused] " + this.f165440d.getClass().getSimpleName() + '@' + this.f165440d.hashCode() + " focusState=" + this.f165440d.f165433d);
            for (UIComponent onUserVisibleFocused : this.f165440d.f165434e) {
                onUserVisibleFocused.onUserVisibleFocused();
            }
        }
    }

    /* renamed from: K */
    public <T extends C39622i0> T mo82247K(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        T a = C39818r.f106831a.mo62445d(this).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(this).get(modelClass)");
        return a;
    }

    /* renamed from: L */
    public abstract Set<Class<? extends UIComponent>> mo2201L();

    /* renamed from: M */
    public final void mo82248M(C39630m0 m0Var, C39630m0 m0Var2, C32226l<Object, Boolean> lVar) {
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

    /* renamed from: N */
    public final void mo82249N() {
        if (getLifecycle().getCurrentState().compareTo(C39623j.C39626c.INITIALIZED) > 0) {
            C39630m0 m0Var = this.f165436g;
            C39630m0 viewModelStore = super.getViewModelStore();
            C87412m.m108593f(viewModelStore, "super.getViewModelStore()");
            mo82248M(m0Var, viewModelStore, C57816a.f165439d);
        }
    }

    /* renamed from: O */
    public void mo2202O() {
        if (!C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f165433d != 1) {
            C57817b bVar = new C57817b(this);
            if (!isResumed()) {
                Log.m105928w("MicroMsg.UIComponentFragment", "[onUserVisibleFocused] wait to fragment resume.");
                this.f165438i.add(bVar);
            } else {
                bVar.run();
            }
            this.f165433d = 1;
        }
    }

    /* renamed from: P */
    public void mo3550P() {
        if (!C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f165433d != 2) {
            Log.m105924i("MicroMsg.UIComponentFragment", "[onViewUnFocused] " + getClass().getSimpleName() + '@' + hashCode());
            for (UIComponent onUserVisibleUnFocused : this.f165434e) {
                onUserVisibleUnFocused.onUserVisibleUnFocused();
            }
            this.f165433d = 2;
        }
    }

    /* renamed from: Q */
    public void mo2207Q(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        Set<Class<? extends UIComponent>> L = mo2201L();
        if (L != null) {
            hashSet.addAll(C110818d0.m150951w0(L));
        }
    }

    public int getLayoutId() {
        UIComponent uIComponent = this.f165435f;
        if (uIComponent != null) {
            return uIComponent.getLayoutId();
        }
        return 0;
    }

    public C39630m0 getViewModelStore() {
        C39630m0 m0Var = this.f165436g;
        if (m0Var != null) {
            return m0Var;
        }
        C39812a0 a0Var = new C39812a0(false, 1, (C8480h) null);
        this.f165436g = a0Var;
        return a0Var;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Log.m105924i("MicroMsg.UIComponentFragment", "[onActivityCreated] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onCreate : this.f165434e) {
            onCreate.onCreate(bundle);
        }
        for (UIComponent onCreateAfter : this.f165434e) {
            onCreateAfter.onCreateAfter(bundle);
        }
    }

    public void onAttach(Context context) {
        C87412m.m108594g(context, "context");
        super.onAttach(context);
        Log.m105924i("MicroMsg.UIComponentFragment", "[onAttach] " + getClass().getSimpleName() + '@' + hashCode());
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.UIComponentFragment", "[onConfigurationChanged] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onConfigurationChanged : this.f165434e) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i("MicroMsg.UIComponentFragment", "[onCreate] " + getClass().getSimpleName() + '@' + hashCode() + " uiComponents=" + this.f165434e);
        mo82248M(super.getViewModelStore(), getViewModelStore(), C0326v.f901d);
        HashSet<UIComponent> hashSet = this.f165434e;
        C87412m.m108594g(hashSet, "uiComponents");
        HashSet hashSet2 = new HashSet();
        mo2207Q(hashSet2);
        Iterator it = hashSet2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            UIComponent uIComponent = (UIComponent) mo82247K((Class) it.next());
            hashSet.add(uIComponent);
            if (uIComponent.getLayoutId() != 0) {
                this.f165435f = uIComponent;
                if (!z) {
                    z = true;
                } else {
                    throw new RuntimeException("already layout uic[" + this.f165435f + "], no more than one layout uic.");
                }
            }
        }
        for (UIComponent arguments : this.f165434e) {
            arguments.setArguments(getArguments());
        }
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), viewGroup, false);
        Log.m105924i("MicroMsg.UIComponentFragment", "[onCreateView] " + getClass().getSimpleName() + '@' + hashCode() + " uiComponents=" + this.f165434e);
        for (UIComponent rootView : this.f165434e) {
            C87412m.m108593f(inflate, "view");
            rootView.setRootView(inflate);
        }
        this.f165437h = inflate;
        for (UIComponent onCreateBefore : this.f165434e) {
            onCreateBefore.onCreateBefore(bundle);
        }
        return inflate;
    }

    public void onDestroyView() {
        for (UIComponent onPreDestroyed : this.f165434e) {
            onPreDestroyed.onPreDestroyed();
        }
        super.onDestroyView();
        Log.m105924i("MicroMsg.UIComponentFragment", "[onDestroyView] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onDestroy : this.f165434e) {
            onDestroy.onDestroy();
        }
        for (UIComponent onPostDestroyed : this.f165434e) {
            onPostDestroyed.onPostDestroyed();
        }
    }

    public void onPause() {
        super.onPause();
        Log.m105924i("MicroMsg.UIComponentFragment", "[onPause] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onPause : this.f165434e) {
            onPause.onPause();
        }
    }

    public void onResume() {
        super.onResume();
        Log.m105924i("MicroMsg.UIComponentFragment", "[onResume] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onResume : this.f165434e) {
            onResume.onResume();
        }
        for (Runnable run : this.f165438i) {
            run.run();
        }
        this.f165438i.clear();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        for (UIComponent onSaveInstanceState : this.f165434e) {
            onSaveInstanceState.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        Log.m105924i("MicroMsg.UIComponentFragment", "[onStart] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onStart : this.f165434e) {
            onStart.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        Log.m105924i("MicroMsg.UIComponentFragment", "[onStop] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onStop : this.f165434e) {
            onStop.onStop();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        Log.m105924i("MicroMsg.UIComponentFragment", "[onViewCreated] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onViewCreated : this.f165434e) {
            onViewCreated.onViewCreated(view);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (UIComponent onRestoreInstanceState : this.f165434e) {
            onRestoreInstanceState.onRestoreInstanceState(bundle);
        }
    }
}
