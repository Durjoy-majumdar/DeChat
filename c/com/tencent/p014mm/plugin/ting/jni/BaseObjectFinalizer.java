package com.tencent.p014mm.plugin.ting.jni;

import com.tencent.p014mm.plugin.ting.jni.cleaner.Cleaner;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0011\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H R\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ting/jni/BaseObjectFinalizer;", "", "Lcom/tencent/mm/plugin/ting/jni/BaseObject;", "obj", "Lrx3/b0;", "registerObject", "", "nativePointer", "destroy", "Lcom/tencent/mm/plugin/ting/jni/cleaner/Cleaner;", "cleaner$delegate", "Lrx3/g;", "getCleaner", "()Lcom/tencent/mm/plugin/ting/jni/cleaner/Cleaner;", "cleaner", "<init>", "()V", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ting.jni.BaseObjectFinalizer */
public final class BaseObjectFinalizer {
    public static final BaseObjectFinalizer INSTANCE = new BaseObjectFinalizer();
    private static final C13601g cleaner$delegate = C36568h.m40985a(BaseObjectFinalizer$cleaner$2.INSTANCE);

    private BaseObjectFinalizer() {
    }

    private final Cleaner getCleaner() {
        Object value = cleaner$delegate.getValue();
        C87412m.m108593f(value, "<get-cleaner>(...)");
        return (Cleaner) value;
    }

    public static final void registerObject(BaseObject baseObject) {
        C87412m.m108594g(baseObject, "obj");
        baseObject.toString();
        INSTANCE.getCleaner().register(baseObject, new BaseObjectFinalizer$$a(baseObject.getNativePointer()));
    }

    /* access modifiers changed from: private */
    /* renamed from: registerObject$lambda-0  reason: not valid java name */
    public static final void m168904registerObject$lambda0(long j) {
        INSTANCE.destroy(j);
    }

    public final native void destroy(long j);
}
