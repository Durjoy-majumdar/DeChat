package com.tencent.p014mm.plugin.finder.live.infrastructure.livedata;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import androidx.lifecycle.C54219z;
import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/infrastructure/livedata/LiveMutableData;", "T", "Landroidx/lifecycle/z;", "Landroidx/lifecycle/p;", "<init>", "()V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData */
public final class LiveMutableData<T> extends C54219z<T> implements C103764p {

    /* renamed from: d */
    public boolean f15070d = true;

    /* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData$b */
    public static final class C3148b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ LiveMutableData<T> f15071d;

        /* renamed from: e */
        public final /* synthetic */ C0120a0<? super T> f15072e;

        public C3148b(LiveMutableData<T> liveMutableData, C0120a0<? super T> a0Var) {
            this.f15071d = liveMutableData;
            this.f15072e = a0Var;
        }

        public final void onChanged(T t) {
            if (!this.f15071d.f15070d) {
                this.f15072e.onChanged(t);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData$a */
    public /* synthetic */ class C3149a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15073a;

        static {
            int[] iArr = new int[C39623j.C39625b.values().length];
            iArr[C39623j.C39625b.ON_DESTROY.ordinal()] = 1;
            f15073a = iArr;
        }
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (C3149a.f15073a[bVar.ordinal()] == 1) {
            this.f15070d = true;
            sVar.getLifecycle().removeObserver(this);
        }
    }

    public void observe(C0125s sVar, C0120a0<? super T> a0Var) {
        C87412m.m108594g(sVar, "owner");
        C87412m.m108594g(a0Var, "observer");
        sVar.getLifecycle().addObserver(this);
        super.observe(sVar, new C3148b(this, a0Var));
    }

    public void setValue(T t) {
        this.f15070d = false;
        super.setValue(t);
    }
}
