package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import gy3.C8480h;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011B\u001b\b\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0003H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/LifecycleDelegateStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onCreate", "onReceiveStart", "onReceiveStop", "", "toString", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/s;", "", "async", "<init>", "(Landroidx/lifecycle/s;Z)V", "Companion", "a", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class LifecycleDelegateStatefulOwner extends StatefulOwner implements C0124r {
    public static final C80387a Companion = new C80387a((C8480h) null);
    private final C0125s source;

    /* renamed from: com.tencent.matrix.lifecycle.LifecycleDelegateStatefulOwner$a */
    public static final class C80387a {
        public C80387a(C8480h hVar) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifecycleDelegateStatefulOwner(C0125s sVar, boolean z, int i, C8480h hVar) {
        this(sVar, (i & 2) != 0 ? true : z);
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void onCreate() {
        turnOff();
    }

    @C112974b0(C39623j.C39625b.ON_START)
    public final void onReceiveStart() {
        turnOn();
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public final void onReceiveStop() {
        turnOff();
    }

    public String toString() {
        return this.source.toString();
    }

    private LifecycleDelegateStatefulOwner(C0125s sVar, boolean z) {
        super(z);
        this.source = sVar;
        sVar.getLifecycle().addObserver(this);
    }
}
