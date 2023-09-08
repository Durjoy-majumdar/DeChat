package com.tencent.p014mm.plugin.magicbrush;

import com.tencent.p014mm.plugin.magicbrush.base.MBJsEventBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import e42.C7597n;
import ei3.C86522b;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p42.C35365a;
import p42.C35366b;

@C86522b
/* renamed from: com.tencent.mm.plugin.magicbrush.h1 */
public final class C30197h1 extends C86301e implements C30187e0 {

    /* renamed from: d */
    public ConcurrentHashMap<C30223r0, LinkedList<C30198a>> f81617d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public ConcurrentHashMap<C30223r0, C30217o0> f81618e;

    /* renamed from: com.tencent.mm.plugin.magicbrush.h1$a */
    public static final class C30198a {

        /* renamed from: a */
        public final String f81619a;

        /* renamed from: b */
        public final WeakReference<C7597n> f81620b;

        public C30198a(String str, WeakReference<C7597n> weakReference) {
            C87412m.m108594g(str, "instanceName");
            C87412m.m108594g(weakReference, "context");
            this.f81619a = str;
            this.f81620b = weakReference;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30198a)) {
                return false;
            }
            C30198a aVar = (C30198a) obj;
            return C87412m.m108589b(this.f81619a, aVar.f81619a) && C87412m.m108589b(this.f81620b, aVar.f81620b);
        }

        public int hashCode() {
            return (this.f81619a.hashCode() * 31) + this.f81620b.hashCode();
        }

        public String toString() {
            return "BizCallbackInfo(instanceName=" + this.f81619a + ", context=" + this.f81620b + ')';
        }
    }

    public C30197h1() {
        ConcurrentHashMap<C30223r0, C30217o0> concurrentHashMap = new ConcurrentHashMap<>();
        this.f81618e = concurrentHashMap;
        concurrentHashMap.put(C30223r0.OnScreenShot, new C35366b(this));
        this.f81618e.put(C30223r0.OnOrientationChange, new C35365a(this));
    }

    public synchronized void Ik0(String str, C30223r0 r0Var) {
        LinkedList linkedList;
        LinkedList linkedList2;
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(r0Var, "eventName");
        Log.m105924i("MagicBrushJsEventExtFeatureService", "unregisterEventCallback instanceName:" + str + " eventName:" + r0Var);
        if (r0Var == C30223r0.AllEvent) {
            for (Map.Entry next : this.f81617d.entrySet()) {
                for (C30198a aVar : (Iterable) next.getValue()) {
                    if (C87412m.m108589b(str, aVar.f81619a) && (linkedList2 = this.f81617d.get(next.getKey())) != null) {
                        linkedList2.remove(aVar);
                    }
                    wx0((C30223r0) next.getKey());
                }
            }
        } else {
            LinkedList<C30198a> linkedList3 = this.f81617d.get(r0Var);
            if (linkedList3 != null) {
                for (C30198a aVar2 : linkedList3) {
                    if (C87412m.m108589b(aVar2.f81619a, str) && (linkedList = this.f81617d.get(r0Var)) != null) {
                        linkedList.remove(aVar2);
                    }
                }
            }
            wx0(r0Var);
        }
    }

    /* renamed from: PY */
    public void mo57213PY(C30223r0 r0Var, String str) {
        C87412m.m108594g(r0Var, "eventName");
        C87412m.m108594g(str, "data");
        LinkedList<C30198a> linkedList = this.f81617d.get(r0Var);
        if (linkedList != null) {
            for (C30198a aVar : linkedList) {
                C7597n nVar = aVar.f81620b.get();
                if (nVar != null) {
                    nVar.mo8722f0(new MBJsEventBase(r0Var.name(), str));
                }
            }
        }
    }

    public synchronized void j60(String str, C30223r0 r0Var, WeakReference<C7597n> weakReference) {
        C87412m.m108594g(str, "instanceName");
        C87412m.m108594g(r0Var, "eventName");
        C87412m.m108594g(weakReference, "context");
        Log.m105924i("MagicBrushJsEventExtFeatureService", "registerEventCallback instanceName:" + str + " eventName:" + r0Var);
        C30198a aVar = new C30198a(str, weakReference);
        vx0(r0Var);
        if (this.f81617d.get(r0Var) == null) {
            this.f81617d.put(r0Var, new LinkedList());
        }
        LinkedList linkedList = this.f81617d.get(r0Var);
        if (linkedList != null) {
            linkedList.add(aVar);
        }
    }

    public final void vx0(C30223r0 r0Var) {
        if (this.f81617d.get(r0Var) != null) {
            LinkedList linkedList = this.f81617d.get(r0Var);
            boolean z = false;
            if (linkedList != null && linkedList.size() == 0) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        Log.m105924i("MagicBrushJsEventExtFeatureService", "register eventName:" + r0Var);
        C30217o0 o0Var = this.f81618e.get(r0Var);
        if (o0Var != null) {
            o0Var.mo57232b();
        }
    }

    public final void wx0(C30223r0 r0Var) {
        if (this.f81617d.get(r0Var) != null) {
            LinkedList linkedList = this.f81617d.get(r0Var);
            boolean z = false;
            if (linkedList != null && linkedList.size() == 0) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        this.f81617d.remove(r0Var);
        Log.m105924i("MagicBrushJsEventExtFeatureService", "unRegister eventName:" + r0Var);
        C30217o0 o0Var = this.f81618e.get(r0Var);
        if (o0Var != null) {
            o0Var.mo57233c();
        }
    }
}
