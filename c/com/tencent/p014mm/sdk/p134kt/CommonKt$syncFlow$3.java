package com.tencent.p014mm.sdk.p134kt;

import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import d14.C45252f;
import kotlin.Metadata;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
@C91590f(mo125468c = "com.tencent.mm.sdk.kt.CommonKt", mo125469f = "Common.kt", mo125470l = {226}, mo125471m = "syncFlow")
/* renamed from: com.tencent.mm.sdk.kt.CommonKt$syncFlow$3 */
public final class CommonKt$syncFlow$3<T> extends C66704d {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public CommonKt$syncFlow$3(C15601d<? super CommonKt$syncFlow$3> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CommonKt.syncFlow((C45252f) null, (LifecycleScope) null, 0, this);
    }
}
