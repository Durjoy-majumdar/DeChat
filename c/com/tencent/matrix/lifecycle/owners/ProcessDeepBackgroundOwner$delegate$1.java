package com.tencent.matrix.lifecycle.owners;

import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.IStatefulOwner;
import com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner;
import fy3.C32226l;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, mo182094d2 = {"com/tencent/matrix/lifecycle/owners/ProcessDeepBackgroundOwner$delegate$1", "Lcom/tencent/matrix/lifecycle/ImmutableMultiSourceStatefulOwner;", "Lcom/tencent/matrix/lifecycle/g;", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class ProcessDeepBackgroundOwner$delegate$1 extends ImmutableMultiSourceStatefulOwner implements C80406g {
    public ProcessDeepBackgroundOwner$delegate$1(C32226l lVar, IStatefulOwner[] iStatefulOwnerArr) {
        super(lVar, iStatefulOwnerArr);
    }

    public boolean serial() {
        return true;
    }
}
