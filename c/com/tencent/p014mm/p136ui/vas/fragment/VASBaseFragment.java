package com.tencent.p014mm.p136ui.vas.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import bl3.C39812a0;
import bl3.C39818r;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import sx3.C110818d0;
import yn3.C39129a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/vas/fragment/VASBaseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.vas.fragment.VASBaseFragment */
public abstract class VASBaseFragment extends HellAndroidXFragment {

    /* renamed from: d */
    public final String f165490d = ("MicroMsg.VAS.VASBaseFragment@" + hashCode());

    /* renamed from: e */
    public final HashSet<UIComponent> f165491e = new HashSet<>();

    /* renamed from: f */
    public UIComponent f165492f;

    /* renamed from: g */
    public C39630m0 f165493g;

    /* renamed from: h */
    public View f165494h;

    /* renamed from: i */
    public boolean f165495i;

    /* renamed from: j */
    public final LinkedList<Runnable> f165496j = new LinkedList<>();

    /* renamed from: K */
    public <T extends C39622i0> T mo82279K(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        T a = C39818r.f106831a.mo62445d(this).mo75002a(cls);
        C87412m.m108593f(a, "UICProvider.of(this).get(modelClass)");
        return a;
    }

    /* renamed from: L */
    public String mo82280L() {
        return this.f165490d;
    }

    /* renamed from: M */
    public abstract Set<Class<? extends UIComponent>> mo82281M();

    /* renamed from: N */
    public void mo82282N(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        Set<Class<? extends UIComponent>> M = mo82281M();
        if (M != null) {
            hashSet.addAll(C110818d0.m150951w0(M));
        }
    }

    public int getLayoutId() {
        UIComponent uIComponent = this.f165492f;
        if (uIComponent != null) {
            return uIComponent.getLayoutId();
        }
        return 0;
    }

    public C39630m0 getViewModelStore() {
        C39630m0 m0Var = this.f165493g;
        if (m0Var != null) {
            return m0Var;
        }
        C39812a0 a0Var = new C39812a0(false, 1, (C8480h) null);
        this.f165493g = a0Var;
        return a0Var;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        String L = mo82280L();
        Log.m105924i(L, "[onActivityCreated] " + getClass().getSimpleName() + '@' + hashCode());
        if (!this.f165495i) {
            this.f165495i = true;
            for (UIComponent onCreate : this.f165491e) {
                onCreate.onCreate(bundle);
            }
            for (UIComponent onCreateAfter : this.f165491e) {
                onCreateAfter.onCreateAfter(bundle);
            }
        }
    }

    public void onAttach(Context context) {
        C87412m.m108594g(context, "context");
        super.onAttach(context);
        String L = mo82280L();
        Log.m105924i(L, "[onAttach] " + getClass().getSimpleName() + '@' + hashCode());
        C39630m0 viewModelStore = super.getViewModelStore();
        C39630m0 viewModelStore2 = getViewModelStore();
        C39129a aVar = C39129a.f105321d;
        if (viewModelStore != null) {
            Field declaredField = C39630m0.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(viewModelStore);
            C87412m.m108592e(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            Object obj2 = declaredField.get(viewModelStore2);
            C87412m.m108592e(obj2, "null cannot be cast to non-null type java.util.HashMap<kotlin.Any, kotlin.Any>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.Any, kotlin.Any> }");
            HashMap hashMap = (HashMap) obj2;
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                if (((Boolean) aVar.invoke(entry.getValue())).booleanValue()) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        HashSet<UIComponent> hashSet = this.f165491e;
        C87412m.m108594g(hashSet, "uiComponents");
        HashSet hashSet2 = new HashSet();
        mo82282N(hashSet2);
        Iterator it = hashSet2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            UIComponent uIComponent = (UIComponent) mo82279K((Class) it.next());
            hashSet.add(uIComponent);
            if (uIComponent.getLayoutId() != 0) {
                this.f165492f = uIComponent;
                if (!z) {
                    z = true;
                } else {
                    throw new RuntimeException("already layout uic[" + this.f165492f + "], no more than one layout uic.");
                }
            }
        }
        for (UIComponent arguments : this.f165491e) {
            arguments.setArguments(getArguments());
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        String L = mo82280L();
        Log.m105924i(L, "[onConfigurationChanged] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onConfigurationChanged : this.f165491e) {
            onConfigurationChanged.onConfigurationChanged(configuration);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C87412m.m108594g(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getContext()).inflate(getLayoutId(), viewGroup, false);
        String L = mo82280L();
        Log.m105924i(L, "[onCreateView] " + getClass().getSimpleName() + '@' + hashCode() + " uiComponents=" + this.f165491e);
        for (UIComponent rootView : this.f165491e) {
            C87412m.m108593f(inflate, "view");
            rootView.setRootView(inflate);
        }
        this.f165494h = inflate;
        for (UIComponent onCreateBefore : this.f165491e) {
            onCreateBefore.onCreateBefore(bundle);
        }
        return inflate;
    }

    public void onDestroy() {
        if (this.f165494h == null) {
            String L = mo82280L();
            Log.m105918d(L, "[onDestroy] exception fold " + getClass().getSimpleName() + '@' + hashCode());
            super.onDestroy();
            return;
        }
        for (UIComponent onPreDestroyed : this.f165491e) {
            onPreDestroyed.onPreDestroyed();
        }
        super.onDestroy();
        String L2 = mo82280L();
        Log.m105924i(L2, "[onDestroy] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onDestroy : this.f165491e) {
            onDestroy.onDestroy();
        }
        for (UIComponent onPostDestroyed : this.f165491e) {
            onPostDestroyed.onPostDestroyed();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        String L = mo82280L();
        Log.m105924i(L, "[onPause] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onPause : this.f165491e) {
            onPause.onPause();
        }
    }

    public void onResume() {
        super.onResume();
        String L = mo82280L();
        Log.m105924i(L, "[onResume] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onResume : this.f165491e) {
            onResume.onResume();
        }
        for (Runnable run : this.f165496j) {
            run.run();
        }
        this.f165496j.clear();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        for (UIComponent onSaveInstanceState : this.f165491e) {
            onSaveInstanceState.onSaveInstanceState(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        String L = mo82280L();
        Log.m105924i(L, "[onStart] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onStart : this.f165491e) {
            onStart.onStart();
        }
    }

    public void onStop() {
        super.onStop();
        String L = mo82280L();
        Log.m105924i(L, "[onStop] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onStop : this.f165491e) {
            onStop.onStop();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        String L = mo82280L();
        Log.m105924i(L, "[onViewCreated] " + getClass().getSimpleName() + '@' + hashCode());
        for (UIComponent onViewCreated : this.f165491e) {
            onViewCreated.onViewCreated(view);
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (UIComponent onRestoreInstanceState : this.f165491e) {
            onRestoreInstanceState.onRestoreInstanceState(bundle);
        }
    }
}
