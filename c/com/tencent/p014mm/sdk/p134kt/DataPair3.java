package com.tencent.p014mm.sdk.p134kt;

import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0002¢\u0006\u0002\u0010\bR\u001c\u0010\u0005\u001a\u00028\u0000X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u00028\u0001X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u00028\u0002X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/sdk/kt/DataPair3;", "A", "B", "C", "", "obj1", "obj2", "obj3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getObj1", "()Ljava/lang/Object;", "setObj1", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getObj2", "setObj2", "getObj3", "setObj3", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.sdk.kt.DataPair3 */
public final class DataPair3<A, B, C> {
    private A obj1;
    private B obj2;
    private C obj3;

    public DataPair3(A a, B b, C c) {
        this.obj1 = a;
        this.obj2 = b;
        this.obj3 = c;
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

    public final void setObj1(A a) {
        this.obj1 = a;
    }

    public final void setObj2(B b) {
        this.obj2 = b;
    }

    public final void setObj3(C c) {
        this.obj3 = c;
    }
}
