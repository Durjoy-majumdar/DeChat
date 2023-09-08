package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0125s;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0018\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0019\"\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0001H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R&\u0010\u0017\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/h;", "", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "owner", "Lrx3/b0;", "register", "unregister", "onStateChanged", "addSourceOwner", "Landroidx/lifecycle/s;", "removeSourceOwner", "on", "off", "", "active", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "sourceOwners", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/i;", "reduceOperator", "Lfy3/l;", "", "statefulOwners", "<init>", "(Lfy3/l;[Lcom/tencent/matrix/lifecycle/IStatefulOwner;)V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public class MultiSourceStatefulOwner extends StatefulOwner implements C80407h {
    private final C32226l<Collection<? extends C28660i>, Boolean> reduceOperator;
    private final ConcurrentLinkedQueue<IStatefulOwner> sourceOwners = new ConcurrentLinkedQueue<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiSourceStatefulOwner(C32226l<? super Collection<? extends C28660i>, Boolean> lVar, IStatefulOwner... iStatefulOwnerArr) {
        super(true);
        C87412m.m108594g(lVar, "reduceOperator");
        C87412m.m108594g(iStatefulOwnerArr, "statefulOwners");
        this.reduceOperator = lVar;
        for (IStatefulOwner register : iStatefulOwnerArr) {
            register(register);
        }
    }

    private final void onStateChanged() {
        if (this.reduceOperator.invoke(this.sourceOwners).booleanValue()) {
            turnOn();
        } else {
            turnOff();
        }
    }

    private final void register(IStatefulOwner iStatefulOwner) {
        if (!(iStatefulOwner instanceof MultiSourceStatefulOwner)) {
            this.sourceOwners.add(iStatefulOwner);
            iStatefulOwner.observeForever(this);
            return;
        }
        throw new IllegalArgumentException("NOT allow to add MultiSourceStatefulOwner as source, consider to add its shadow owner");
    }

    private final void unregister(StatefulOwner statefulOwner) {
        this.sourceOwners.remove(statefulOwner);
        statefulOwner.removeObserver(this);
        onStateChanged();
    }

    public boolean active() {
        if (this.sourceOwners.isEmpty()) {
            return super.active();
        }
        Boolean invoke = this.reduceOperator.invoke(this.sourceOwners);
        if (invoke.booleanValue()) {
            turnOn();
        } else {
            turnOff();
        }
        return invoke.booleanValue();
    }

    public void addSourceOwner(StatefulOwner statefulOwner) {
        C87412m.m108594g(statefulOwner, "owner");
        register(statefulOwner);
    }

    public void off() {
        onStateChanged();
    }

    /* renamed from: on */
    public void mo60742on() {
        onStateChanged();
    }

    public void removeSourceOwner(StatefulOwner statefulOwner) {
        C87412m.m108594g(statefulOwner, "owner");
        unregister(statefulOwner);
    }

    public StatefulOwner addSourceOwner(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        LifecycleDelegateStatefulOwner.Companion.getClass();
        LifecycleDelegateStatefulOwner lifecycleDelegateStatefulOwner = new LifecycleDelegateStatefulOwner(sVar, false, 2, (C8480h) null);
        addSourceOwner((StatefulOwner) lifecycleDelegateStatefulOwner);
        return lifecycleDelegateStatefulOwner;
    }
}
