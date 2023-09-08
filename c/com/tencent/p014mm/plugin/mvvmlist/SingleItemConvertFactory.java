package com.tencent.p014mm.plugin.mvvmlist;

import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mvvmlist/SingleItemConvertFactory;", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "Ljava/lang/Class;", "clazz", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mvvmlist.SingleItemConvertFactory */
public final class SingleItemConvertFactory implements C9500j {
    private final Class<? extends C60896i<?>> clazz;

    public SingleItemConvertFactory(Class<? extends C60896i<?>> cls) {
        C87412m.m108594g(cls, "clazz");
        this.clazz = cls;
    }

    public final Class<? extends C60896i<?>> getClazz() {
        return this.clazz;
    }

    public C60896i<?> getItemConvert(int i) {
        Object newInstance = this.clazz.newInstance();
        C87412m.m108593f(newInstance, "clazz.newInstance()");
        return (C60896i) newInstance;
    }
}
