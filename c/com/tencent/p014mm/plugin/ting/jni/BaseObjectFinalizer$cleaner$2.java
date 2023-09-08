package com.tencent.p014mm.plugin.ting.jni;

import com.tencent.p014mm.plugin.ting.jni.cleaner.Cleaner;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/plugin/ting/jni/cleaner/Cleaner;", "kotlin.jvm.PlatformType", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.ting.jni.BaseObjectFinalizer$cleaner$2 */
public final class BaseObjectFinalizer$cleaner$2 extends C87413o implements C32224a<Cleaner> {
    public static final BaseObjectFinalizer$cleaner$2 INSTANCE = new BaseObjectFinalizer$cleaner$2();

    public BaseObjectFinalizer$cleaner$2() {
        super(0);
    }

    public final Cleaner invoke() {
        return Cleaner.create();
    }
}
