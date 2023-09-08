package com.tencent.p014mm.plugin.scanner.model;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/model/ScanPoint;", "", "()V", "id", "", "getId", "()I", "setId", "(I)V", "size", "", "getSize", "()F", "setSize", "(F)V", "x", "getX", "setX", "xFactor", "getXFactor", "setXFactor", "y", "getY", "setY", "yFactor", "getYFactor", "setYFactor", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.scanner.model.ScanPoint */
public final class ScanPoint {

    /* renamed from: id */
    private int f315799id;
    private float size;

    /* renamed from: x */
    private float f315800x;
    private float xFactor;

    /* renamed from: y */
    private float f315801y;
    private float yFactor;

    public final int getId() {
        return this.f315799id;
    }

    public final float getSize() {
        return this.size;
    }

    public final float getX() {
        return this.f315800x;
    }

    public final float getXFactor() {
        return this.xFactor;
    }

    public final float getY() {
        return this.f315801y;
    }

    public final float getYFactor() {
        return this.yFactor;
    }

    public final void setId(int i) {
        this.f315799id = i;
    }

    public final void setSize(float f) {
        this.size = f;
    }

    public final void setX(float f) {
        this.f315800x = f;
    }

    public final void setXFactor(float f) {
        this.xFactor = f;
    }

    public final void setY(float f) {
        this.f315801y = f;
    }

    public final void setYFactor(float f) {
        this.yFactor = f;
    }
}
