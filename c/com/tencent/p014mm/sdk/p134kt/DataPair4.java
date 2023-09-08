package com.tencent.p014mm.sdk.p134kt;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005B%\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002\u0012\u0006\u0010\t\u001a\u00028\u0003¢\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\u00028\u0001X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\b\u001a\u00028\u0002X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001c\u0010\t\u001a\u00028\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/sdk/kt/DataPair4;", "A", "B", "C", "D", "", "obj1", "obj2", "obj3", "obj4", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getObj1", "()Ljava/lang/Object;", "setObj1", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getObj2", "setObj2", "getObj3", "setObj3", "getObj4", "setObj4", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.kt.DataPair4 */
public final class DataPair4<A, B, C, D> {
    private A obj1;
    private B obj2;
    private C obj3;
    private D obj4;

    public DataPair4(A a, B b, C c, D d) {
        this.obj1 = a;
        this.obj2 = b;
        this.obj3 = c;
        this.obj4 = d;
    }

    public final A getObj1() {
        return this.obj1;
    }

    public final B getObj2() {
        return this.obj2;
    }

    public final C getObj3() {
        return this.obj3;
    }

    public final D getObj4() {
        return this.obj4;
    }

    public final void setObj1(A a) {
        this.obj1 = a;
    }

    public final void setObj2(B b) {
        this.obj2 = b;
    }

    public final void setObj3(C c) {
        this.obj3 = c;
    }

    public final void setObj4(D d) {
        this.obj4 = d;
    }
}
