package com.tencent.p014mm.plugin.scanner.model;

import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0000J\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020-H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001a\u0010$\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017¨\u0006/"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/model/ScanProductInfo;", "", "()V", "age", "", "getAge", "()I", "setAge", "(I)V", "classId", "getClassId", "setClassId", "hit", "getHit", "setHit", "id", "getId", "setId", "prob", "", "getProb", "()F", "setProb", "(F)V", "shouldShow", "", "getShouldShow", "()Z", "setShouldShow", "(Z)V", "x1", "getX1", "setX1", "x2", "getX2", "setX2", "y1", "getY1", "setY1", "y2", "getY2", "setY2", "copy", "toCopy", "toDebugString", "", "toString", "scan-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.scanner.model.ScanProductInfo */
public final class ScanProductInfo {
    private int age;
    private int classId;
    private int hit;

    /* renamed from: id */
    private int f315802id;
    private float prob;
    private boolean shouldShow;

    /* renamed from: x1 */
    private float f315803x1;

    /* renamed from: x2 */
    private float f315804x2;

    /* renamed from: y1 */
    private float f315805y1;

    /* renamed from: y2 */
    private float f315806y2;

    public final ScanProductInfo copy(ScanProductInfo scanProductInfo) {
        C87412m.m108594g(scanProductInfo, "toCopy");
        this.f315803x1 = scanProductInfo.f315803x1;
        this.f315804x2 = scanProductInfo.f315804x2;
        this.f315805y1 = scanProductInfo.f315805y1;
        this.f315806y2 = scanProductInfo.f315806y2;
        this.prob = scanProductInfo.prob;
        this.f315802id = scanProductInfo.f315802id;
        this.age = scanProductInfo.age;
        this.hit = scanProductInfo.hit;
        this.classId = scanProductInfo.classId;
        this.shouldShow = scanProductInfo.shouldShow;
        return this;
    }

    public final int getAge() {
        return this.age;
    }

    public final int getClassId() {
        return this.classId;
    }

    public final int getHit() {
        return this.hit;
    }

    public final int getId() {
        return this.f315802id;
    }

    public final float getProb() {
        return this.prob;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final float getX1() {
        return this.f315803x1;
    }

    public final float getX2() {
        return this.f315804x2;
    }

    public final float getY1() {
        return this.f315805y1;
    }

    public final float getY2() {
        return this.f315806y2;
    }

    public final void setAge(int i) {
        this.age = i;
    }

    public final void setClassId(int i) {
        this.classId = i;
    }

    public final void setHit(int i) {
        this.hit = i;
    }

    public final void setId(int i) {
        this.f315802id = i;
    }

    public final void setProb(float f) {
        this.prob = f;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setX1(float f) {
        this.f315803x1 = f;
    }

    public final void setX2(float f) {
        this.f315804x2 = f;
    }

    public final void setY1(float f) {
        this.f315805y1 = f;
    }

    public final void setY2(float f) {
        this.f315806y2 = f;
    }

    public final String toDebugString() {
        return "shouldShow: " + this.shouldShow + "\nlocation: " + this.f315803x1 + ", " + this.f315805y1 + ", " + this.f315804x2 + ", " + this.f315806y2 + "\nprob: " + this.prob + "\ntrackId: " + this.f315802id + "\nage: " + this.age + "\nhit: " + this.hit + "\nclassId: " + this.classId + 10;
    }

    public String toString() {
        return "ScanProductInfo: (" + this.f315803x1 + ", " + this.f315805y1 + "), (" + this.f315804x2 + ", " + this.f315806y2 + ") prob=" + this.prob + ", id=" + this.f315802id + ", age=" + this.age + ", hit=" + this.hit + ", classId: " + this.classId + ", shouldShow=" + this.shouldShow;
    }
}
