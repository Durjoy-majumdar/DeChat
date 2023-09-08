package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0125s;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002\u0003\u0004\b\n\u0018\u00002\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00060\u0003R\u00020\u0004*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, mo182094d2 = {"com/tencent/matrix/lifecycle/StatefulOwnerKt$reverse$1", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "Lcom/tencent/matrix/lifecycle/h;", "com/tencent/matrix/lifecycle/StatefulOwnerKt$reverse$1$a", "com/tencent/matrix/lifecycle/StatefulOwnerKt$reverse$1", "wrap", "(Lcom/tencent/matrix/lifecycle/h;)Lcom/tencent/matrix/lifecycle/StatefulOwnerKt$reverse$1$a;", "", "active", "observer", "Lrx3/b0;", "observeForever", "Landroidx/lifecycle/s;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "a", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class StatefulOwnerKt$reverse$1 implements IStatefulOwner {
    public final /* synthetic */ IStatefulOwner $this_reverse;

    /* renamed from: com.tencent.matrix.lifecycle.StatefulOwnerKt$reverse$1$a */
    public final class C80390a implements C80407h, C80406g {

        /* renamed from: d */
        public final C80407h f235319d;

        public C80390a(StatefulOwnerKt$reverse$1 statefulOwnerKt$reverse$1, C80407h hVar) {
            C87412m.m108594g(hVar, FirebaseAnalytics.C113379b.ORIGIN);
            this.f235319d = hVar;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C80390a) {
                return C87412m.m108589b(this.f235319d, ((C80390a) obj).f235319d);
            }
            return false;
        }

        public int hashCode() {
            return this.f235319d.hashCode();
        }

        public void off() {
            this.f235319d.mo60742on();
        }

        /* renamed from: on */
        public void mo60742on() {
            this.f235319d.off();
        }

        public boolean serial() {
            C80407h hVar = this.f235319d;
            if (hVar instanceof C80406g) {
                return ((C80406g) hVar).serial();
            }
            return false;
        }

        public String toString() {
            return this.f235319d.toString();
        }
    }

    public StatefulOwnerKt$reverse$1(IStatefulOwner iStatefulOwner) {
        this.$this_reverse = iStatefulOwner;
    }

    private final C80390a wrap(C80407h hVar) {
        return new C80390a(this, hVar);
    }

    public boolean active() {
        return !this.$this_reverse.active();
    }

    public void observeForever(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        this.$this_reverse.observeForever(wrap(hVar));
    }

    public void observeWithLifecycle(C0125s sVar, C80407h hVar) {
        C87412m.m108594g(sVar, "lifecycleOwner");
        C87412m.m108594g(hVar, "observer");
        this.$this_reverse.observeWithLifecycle(sVar, wrap(hVar));
    }

    public void removeObserver(C80407h hVar) {
        C87412m.m108594g(hVar, "observer");
        this.$this_reverse.removeObserver(wrap(hVar));
    }
}
