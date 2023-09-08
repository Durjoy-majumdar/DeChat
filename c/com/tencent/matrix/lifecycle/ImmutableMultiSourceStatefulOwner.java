package com.tencent.matrix.lifecycle;

import androidx.lifecycle.C0125s;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/ImmutableMultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/MultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "owner", "Lrx3/b0;", "addSourceOwner", "Landroidx/lifecycle/s;", "removeSourceOwner", "Lkotlin/Function1;", "", "Lcom/tencent/matrix/lifecycle/i;", "", "reduceOperator", "", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "args", "<init>", "(Lfy3/l;[Lcom/tencent/matrix/lifecycle/IStatefulOwner;)V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public class ImmutableMultiSourceStatefulOwner extends MultiSourceStatefulOwner {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImmutableMultiSourceStatefulOwner(C32226l<? super Collection<? extends C28660i>, Boolean> lVar, IStatefulOwner... iStatefulOwnerArr) {
        super(lVar, (IStatefulOwner[]) Arrays.copyOf(iStatefulOwnerArr, iStatefulOwnerArr.length));
        C87412m.m108594g(lVar, "reduceOperator");
        C87412m.m108594g(iStatefulOwnerArr, "args");
    }

    public final void addSourceOwner(StatefulOwner statefulOwner) {
        C87412m.m108594g(statefulOwner, "owner");
        throw new UnsupportedOperationException();
    }

    public final void removeSourceOwner(StatefulOwner statefulOwner) {
        C87412m.m108594g(statefulOwner, "owner");
        throw new UnsupportedOperationException();
    }

    public final StatefulOwner addSourceOwner(C0125s sVar) {
        C87412m.m108594g(sVar, "owner");
        throw new UnsupportedOperationException();
    }
}
