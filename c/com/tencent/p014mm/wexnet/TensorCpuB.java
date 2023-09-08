package com.tencent.p014mm.wexnet;

import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/TensorCpuB;", "", "dateType", "", "dataShape", "", "data", "Ljava/nio/ByteBuffer;", "(I[ILjava/nio/ByteBuffer;)V", "getData", "()Ljava/nio/ByteBuffer;", "getDataShape", "()[I", "getDateType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.wexnet.TensorCpuB */
public final class TensorCpuB {
    private final ByteBuffer data;
    private final int[] dataShape;
    private final int dateType;

    public TensorCpuB(int i, int[] iArr, ByteBuffer byteBuffer) {
        C87412m.m108594g(iArr, "dataShape");
        C87412m.m108594g(byteBuffer, "data");
        this.dateType = i;
        this.dataShape = iArr;
        this.data = byteBuffer;
    }

    public static /* synthetic */ TensorCpuB copy$default(TensorCpuB tensorCpuB, int i, int[] iArr, ByteBuffer byteBuffer, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tensorCpuB.dateType;
        }
        if ((i2 & 2) != 0) {
            iArr = tensorCpuB.dataShape;
        }
        if ((i2 & 4) != 0) {
            byteBuffer = tensorCpuB.data;
        }
        return tensorCpuB.copy(i, iArr, byteBuffer);
    }

    public final int component1() {
        return this.dateType;
    }

    public final int[] component2() {
        return this.dataShape;
    }

    public final ByteBuffer component3() {
        return this.data;
    }

    public final TensorCpuB copy(int i, int[] iArr, ByteBuffer byteBuffer) {
        C87412m.m108594g(iArr, "dataShape");
        C87412m.m108594g(byteBuffer, "data");
        return new TensorCpuB(i, iArr, byteBuffer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TensorCpuB)) {
            return false;
        }
        TensorCpuB tensorCpuB = (TensorCpuB) obj;
        return this.dateType == tensorCpuB.dateType && C87412m.m108589b(this.dataShape, tensorCpuB.dataShape) && C87412m.m108589b(this.data, tensorCpuB.data);
    }

    public final ByteBuffer getData() {
        return this.data;
    }

    public final int[] getDataShape() {
        return this.dataShape;
    }

    public final int getDateType() {
        return this.dateType;
    }

    public int hashCode() {
        return (((this.dateType * 31) + Arrays.hashCode(this.dataShape)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "TensorCpuB(dateType=" + this.dateType + ", dataShape=" + Arrays.toString(this.dataShape) + ", data=" + this.data + ')';
    }
}
