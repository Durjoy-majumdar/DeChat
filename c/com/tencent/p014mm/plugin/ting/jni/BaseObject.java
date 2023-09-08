package com.tencent.p014mm.plugin.ting.jni;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0006\u0010\u0004\u001a\u00020\u0002R$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "", "Lrx3/b0;", "finalize", "destroy", "", "<set-?>", "nativePointer", "J", "getNativePointer", "()J", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.BaseObject */
public abstract class BaseObject {
    private long nativePointer;

    public final void destroy() {
        this.nativePointer = 0;
        BaseObjectFinalizer.INSTANCE.destroy(0);
    }

    public final void finalize() {
    }

    public final long getNativePointer() {
        return this.nativePointer;
    }
}
