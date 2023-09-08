package p774zg;

import com.eclipsesource.mmv8.V8ArrayBuffer;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import gy3.C87412m;
import java.nio.ByteBuffer;

/* renamed from: zg.i */
public final class C91716i {

    /* renamed from: a */
    public V8ArrayBuffer f262718a;

    /* renamed from: b */
    public ByteBuffer f262719b;

    /* renamed from: c */
    public final C91708g f262720c;

    /* renamed from: d */
    public final C80669j f262721d;

    public C91716i(C80669j jVar, V8ArrayBuffer v8ArrayBuffer, C91708g gVar) {
        C87412m.m108594g(jVar, "v8");
        C87412m.m108594g(v8ArrayBuffer, "V8Buffer");
        this.f262721d = jVar;
        this.f262720c = gVar;
        if (gVar == C91708g.R && !v8ArrayBuffer.getBackingStore().isReadOnly()) {
            v8ArrayBuffer = jVar.mo112501e().newSharedV8ArrayBuffer(v8ArrayBuffer.getBackingStore().asReadOnlyBuffer());
        }
        ByteBuffer backingStore = v8ArrayBuffer.getBackingStore();
        C87412m.m108593f(backingStore, "it.backingStore");
        this.f262719b = backingStore;
        this.f262718a = v8ArrayBuffer;
    }

    public C91716i(C80669j jVar, ByteBuffer byteBuffer, C91708g gVar) {
        C87412m.m108594g(jVar, "v8");
        C87412m.m108594g(byteBuffer, "buffer");
        this.f262721d = jVar;
        this.f262720c = gVar;
        this.f262719b = byteBuffer;
    }
}
