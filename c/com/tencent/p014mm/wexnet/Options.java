package com.tencent.p014mm.wexnet;

import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0015\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J[\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0012\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/Options;", "", "numThreads", "", "cachePath", "", "allowQuantize", "", "allowGPU", "allowNPU", "precisionLevel", "typicalShape", "", "", "(ILjava/lang/String;ZZZILjava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.wexnet.Options */
public final class Options {
    public boolean allowGPU;
    public boolean allowNPU;
    public boolean allowQuantize;
    public String cachePath;
    public int numThreads;
    public int precisionLevel;
    public Map<String, int[]> typicalShape;

    public Options(int i, String str, boolean z, boolean z2, boolean z3, int i2, Map<String, int[]> map) {
        C87412m.m108594g(str, "cachePath");
        C87412m.m108594g(map, "typicalShape");
        this.numThreads = i;
        this.cachePath = str;
        this.allowQuantize = z;
        this.allowGPU = z2;
        this.allowNPU = z3;
        this.precisionLevel = i2;
        this.typicalShape = map;
    }

    public static /* synthetic */ Options copy$default(Options options, int i, String str, boolean z, boolean z2, boolean z3, int i2, Map<String, int[]> map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = options.numThreads;
        }
        if ((i3 & 2) != 0) {
            str = options.cachePath;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            z = options.allowQuantize;
        }
        boolean z4 = z;
        if ((i3 & 8) != 0) {
            z2 = options.allowGPU;
        }
        boolean z5 = z2;
        if ((i3 & 16) != 0) {
            z3 = options.allowNPU;
        }
        boolean z6 = z3;
        if ((i3 & 32) != 0) {
            i2 = options.precisionLevel;
        }
        int i4 = i2;
        if ((i3 & 64) != 0) {
            map = options.typicalShape;
        }
        return options.copy(i, str2, z4, z5, z6, i4, map);
    }

    public final int component1() {
        return this.numThreads;
    }

    public final String component2() {
        return this.cachePath;
    }

    public final boolean component3() {
        return this.allowQuantize;
    }

    public final boolean component4() {
        return this.allowGPU;
    }

    public final boolean component5() {
        return this.allowNPU;
    }

    public final int component6() {
        return this.precisionLevel;
    }

    public final Map<String, int[]> component7() {
        return this.typicalShape;
    }

    public final Options copy(int i, String str, boolean z, boolean z2, boolean z3, int i2, Map<String, int[]> map) {
        C87412m.m108594g(str, "cachePath");
        Map<String, int[]> map2 = map;
        C87412m.m108594g(map2, "typicalShape");
        return new Options(i, str, z, z2, z3, i2, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        return this.numThreads == options.numThreads && C87412m.m108589b(this.cachePath, options.cachePath) && this.allowQuantize == options.allowQuantize && this.allowGPU == options.allowGPU && this.allowNPU == options.allowNPU && this.precisionLevel == options.precisionLevel && C87412m.m108589b(this.typicalShape, options.typicalShape);
    }

    public int hashCode() {
        int hashCode = ((this.numThreads * 31) + this.cachePath.hashCode()) * 31;
        boolean z = this.allowQuantize;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.allowGPU;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.allowNPU;
        if (!z4) {
            z2 = z4;
        }
        return ((((i2 + (z2 ? 1 : 0)) * 31) + this.precisionLevel) * 31) + this.typicalShape.hashCode();
    }

    public String toString() {
        return "Options(numThreads=" + this.numThreads + ", cachePath=" + this.cachePath + ", allowQuantize=" + this.allowQuantize + ", allowGPU=" + this.allowGPU + ", allowNPU=" + this.allowNPU + ", precisionLevel=" + this.precisionLevel + ", typicalShape=" + this.typicalShape + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Options(int i, String str, boolean z, boolean z2, boolean z3, int i2, Map map, int i3, C8480h hVar) {
        this((i3 & 1) != 0 ? 1 : i, str, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? 4 : i2, (i3 & 64) != 0 ? new HashMap() : map);
    }
}
