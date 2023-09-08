package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0125s;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000bH\u0017J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bH\u0017¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/IBackgroundStatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "", "isBackground", "Lcom/tencent/matrix/lifecycle/d;", "callback", "Lrx3/b0;", "addLifecycleCallback", "Landroidx/lifecycle/s;", "lifecycleOwner", "removeLifecycleCallback", "Lcom/tencent/matrix/lifecycle/f;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public interface IBackgroundStatefulOwner extends IStatefulOwner {

    /* renamed from: com.tencent.matrix.lifecycle.IBackgroundStatefulOwner$a */
    public static final class C80384a {

        /* renamed from: com.tencent.matrix.lifecycle.IBackgroundStatefulOwner$a$a */
        public static final class C80385a implements C80407h {

            /* renamed from: d */
            public final /* synthetic */ C80401d f235313d;

            public C80385a(C80401d dVar) {
                this.f235313d = dVar;
            }

            public void off() {
                this.f235313d.mo17851b();
            }

            /* renamed from: on */
            public void mo60742on() {
                this.f235313d.mo17850a();
            }
        }

        /* renamed from: com.tencent.matrix.lifecycle.IBackgroundStatefulOwner$a$b */
        public static final class C80386b implements C80407h {

            /* renamed from: d */
            public final /* synthetic */ C80401d f235314d;

            public C80386b(C80401d dVar) {
                this.f235314d = dVar;
            }

            public void off() {
                this.f235314d.mo17851b();
            }

            /* renamed from: on */
            public void mo60742on() {
                this.f235314d.mo17850a();
            }
        }

        /* renamed from: a */
        public static void m97972a(IBackgroundStatefulOwner iBackgroundStatefulOwner, C0125s sVar, C80401d dVar) {
            C87412m.m108594g(sVar, "lifecycleOwner");
            C87412m.m108594g(dVar, "callback");
            C80386b bVar = new C80386b(dVar);
            dVar.f235333a = bVar;
            C13598b0 b0Var = C13598b0.f38549a;
            iBackgroundStatefulOwner.observeWithLifecycle(sVar, bVar);
        }

        /* renamed from: b */
        public static void m97973b(IBackgroundStatefulOwner iBackgroundStatefulOwner, C80401d dVar) {
            C87412m.m108594g(dVar, "callback");
            C80385a aVar = new C80385a(dVar);
            dVar.f235333a = aVar;
            C13598b0 b0Var = C13598b0.f38549a;
            iBackgroundStatefulOwner.observeForever(aVar);
        }

        /* renamed from: c */
        public static void m97974c(IBackgroundStatefulOwner iBackgroundStatefulOwner, C80401d dVar) {
            C87412m.m108594g(dVar, "callback");
            C80407h hVar = dVar.f235333a;
            if (hVar != null) {
                iBackgroundStatefulOwner.removeObserver(hVar);
            }
        }
    }

    /* synthetic */ boolean active();

    void addLifecycleCallback(C0125s sVar, C80401d dVar);

    void addLifecycleCallback(C0125s sVar, C80404f fVar);

    void addLifecycleCallback(C80401d dVar);

    void addLifecycleCallback(C80404f fVar);

    boolean isBackground();

    /* synthetic */ void observeForever(C80407h hVar);

    /* synthetic */ void observeWithLifecycle(C0125s sVar, C80407h hVar);

    void removeLifecycleCallback(C80401d dVar);

    void removeLifecycleCallback(C80404f fVar);

    /* synthetic */ void removeObserver(C80407h hVar);
}
