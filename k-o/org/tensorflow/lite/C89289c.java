package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: org.tensorflow.lite.c */
public final class C89289c implements AutoCloseable {

    /* renamed from: d */
    public NativeInterpreterWrapper f257238d;

    /* renamed from: org.tensorflow.lite.c$a */
    public static class C89290a {

        /* renamed from: a */
        public final List<C89288b> f257239a = new ArrayList();
    }

    public C89289c(ByteBuffer byteBuffer) {
        this.f257238d = new NativeInterpreterWrapper(byteBuffer, (C89290a) null);
    }

    /* renamed from: a */
    public final void mo123624a() {
        if (this.f257238d == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    /* renamed from: b */
    public Tensor mo123625b(int i) {
        mo123624a();
        return this.f257238d.mo123609a(i);
    }

    /* renamed from: c */
    public int mo123626c() {
        mo123624a();
        return this.f257238d.f257220h.length;
    }

    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f257238d;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f257238d = null;
        }
    }

    /* renamed from: d */
    public Tensor mo123628d(int i) {
        mo123624a();
        return this.f257238d.mo123610b(i);
    }

    /* renamed from: e */
    public void mo123629e(Object[] objArr, Map<Integer, Object> map) {
        mo123624a();
        this.f257238d.mo123611c(objArr, map);
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
