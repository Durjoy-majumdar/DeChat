package com.tencent.p014mm.plugin.finder.live.controller.base;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import androidx.lifecycle.C54209k0;
import bl3.C39816f;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import fj1.C45795b;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o40.C11348f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J%\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0007*\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore;", "Lbl3/f;", "Landroidx/lifecycle/m0;", "getViewModelStore", "Lrx3/b0;", "clear", "Landroidx/lifecycle/i0;", "T", "Ljava/lang/Class;", "bu", "business", "(Ljava/lang/Class;)Landroidx/lifecycle/i0;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "controller", "(Ljava/lang/Class;)Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomController;", "", "getKey", "", "hasInitialized", "Lfj1/b;", "liveRoomData", "Lfj1/b;", "getLiveRoomData", "()Lfj1/b;", "Ljava/util/HashSet;", "controllers", "Ljava/util/HashSet;", "getControllers", "()Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore$b;", "storeMap", "Lcom/tencent/mm/plugin/finder/live/controller/base/LiveRoomControllerStore$b;", "viewModel", "Landroidx/lifecycle/m0;", "<init>", "(Lfj1/b;)V", "Companion", "a", "b", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore */
public final class LiveRoomControllerStore implements C39816f {
    public static final C55904a Companion = new C55904a((C8480h) null);
    /* access modifiers changed from: private */
    public static final String TAG = "Finder.LiveRoomControllerStore";
    private final HashSet<LiveRoomController> controllers = new HashSet<>();
    private final C45795b liveRoomData;
    private final C29959b<String, C39622i0> storeMap;
    private final C39630m0 viewModel;

    /* renamed from: com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore$b */
    public static final class C29959b<K, V> extends HashMap<K, V> {

        /* renamed from: d */
        public final int f81120d;

        public C29959b(int i) {
            this.f81120d = i;
        }

        public synchronized void clear() {
            LiveRoomControllerStore.Companion.getClass();
            String access$getTAG$cp = LiveRoomControllerStore.TAG;
            Log.m105924i(access$getTAG$cp, "clear(" + hashCode() + ')');
            super.clear();
        }

        public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
            return super.entrySet();
        }

        public synchronized V get(Object obj) {
            return super.get(obj);
        }

        public final /* bridge */ Set<K> keySet() {
            return super.keySet();
        }

        public synchronized V put(K k, V v) {
            LiveRoomControllerStore.Companion.getClass();
            String access$getTAG$cp = LiveRoomControllerStore.TAG;
            Log.m105924i(access$getTAG$cp, "put(" + hashCode() + ") ,LiveRoomController(" + this.f81120d + ") " + k);
            return super.put(k, v);
        }

        public synchronized V remove(Object obj) {
            LiveRoomControllerStore.Companion.getClass();
            String access$getTAG$cp = LiveRoomControllerStore.TAG;
            Log.m105924i(access$getTAG$cp, "remove(" + hashCode() + ") " + obj);
            return super.remove(obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<V> values() {
            return super.values();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore$a */
    public static final class C55904a {
        public C55904a(C8480h hVar) {
        }
    }

    public LiveRoomControllerStore(C45795b bVar) {
        C87412m.m108594g(bVar, "liveRoomData");
        this.liveRoomData = bVar;
        C29959b<String, C39622i0> bVar2 = new C29959b<>(hashCode());
        this.storeMap = bVar2;
        C39630m0 m0Var = new C39630m0();
        this.viewModel = m0Var;
        String str = TAG;
        Log.m105924i(str, "init " + hashCode() + " check map " + bVar2);
        Field declaredField = C39630m0.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(m0Var);
        declaredField.set(m0Var, bVar2);
        Object obj2 = declaredField.get(m0Var);
        Log.m105924i(str, "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + obj2.hashCode() + " storeMap:" + bVar2.hashCode());
    }

    public final <T extends C39622i0> T business(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return this.liveRoomData.mo71262a(cls);
    }

    public final void clear() {
        String str = TAG;
        Log.m105924i(str, "clear " + this.storeMap.size() + ", " + this.controllers.size());
        try {
            LinkedList<LiveRoomController> linkedList = new LinkedList<>();
            for (LiveRoomController add : this.controllers) {
                linkedList.add(add);
            }
            this.controllers.clear();
            for (LiveRoomController liveRoomController : linkedList) {
                String str2 = TAG;
                Log.m105924i(str2, "[clear] " + liveRoomController.hashCode());
                liveRoomController.onLiveDeactivate();
            }
            this.storeMap.clear();
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "LiveRoomControllerStore clear");
        }
    }

    public final <T extends LiveRoomController> T controller(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        String key = getKey(cls);
        if (this.storeMap.containsKey(key)) {
            Companion.getClass();
            C41447a aVar = new C41447a(this);
            C39630m0 viewModelStore = getViewModelStore();
            T t = (C39622i0) viewModelStore.f106390a.get(key);
            if (!cls.isInstance(t)) {
                t = aVar instanceof C54209k0.C54211c ? ((C54209k0.C54211c) aVar).mo75004b(key, cls) : aVar.create(cls);
                C39622i0 put = viewModelStore.f106390a.put(key, t);
                if (put != null) {
                    put.onCleared();
                }
            } else if (aVar instanceof C54209k0.C54212e) {
                ((C54209k0.C54212e) aVar).mo75005a(t);
            }
            return (LiveRoomController) t;
        }
        String str = TAG;
        Log.m105920e(str, "get controller but not exist, key:" + key);
        return null;
    }

    public final HashSet<LiveRoomController> getControllers() {
        return this.controllers;
    }

    public final <T extends LiveRoomController> String getKey(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null || canonicalName.length() == 0) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "LiveRoomController_getKey_invalid", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
        }
        return "LiveRoomControllerStore:" + canonicalName;
    }

    public final C45795b getLiveRoomData() {
        return this.liveRoomData;
    }

    public C39630m0 getViewModelStore() {
        return this.viewModel;
    }

    public final boolean hasInitialized() {
        return !this.storeMap.isEmpty();
    }
}
