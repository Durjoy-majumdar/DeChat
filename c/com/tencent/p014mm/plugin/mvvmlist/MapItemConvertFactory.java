package com.tencent.p014mm.plugin.mvvmlist;

import gy3.C87412m;
import java.util.Map;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B;\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00070\u0006\u0012\u0012\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R/\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mvvmlist/MapItemConvertFactory;", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "", "Ljava/lang/Class;", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "defaultConvert", "Ljava/lang/Class;", "getDefaultConvert", "()Ljava/lang/Class;", "<init>", "(Ljava/util/Map;Ljava/lang/Class;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mvvmlist.MapItemConvertFactory */
public final class MapItemConvertFactory implements C9500j {
    private final Class<? extends C60896i<?>> defaultConvert;
    private final Map<Integer, Class<? extends C60896i<?>>> map;

    public MapItemConvertFactory(Map<Integer, ? extends Class<? extends C60896i<?>>> map2, Class<? extends C60896i<?>> cls) {
        C87412m.m108594g(map2, "map");
        C87412m.m108594g(cls, "defaultConvert");
        this.map = map2;
        this.defaultConvert = cls;
    }

    public final Class<? extends C60896i<?>> getDefaultConvert() {
        return this.defaultConvert;
    }

    public C60896i<?> getItemConvert(int i) {
        Class cls = this.map.get(Integer.valueOf(i));
        C60896i<?> iVar = cls != null ? (C60896i) cls.newInstance() : null;
        if (iVar != null) {
            return iVar;
        }
        Object newInstance = this.defaultConvert.newInstance();
        C87412m.m108593f(newInstance, "defaultConvert.newInstance()");
        return (C60896i) newInstance;
    }

    public final Map<Integer, Class<? extends C60896i<?>>> getMap() {
        return this.map;
    }
}
