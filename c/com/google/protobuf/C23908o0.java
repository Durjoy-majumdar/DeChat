package com.google.protobuf;

import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.o0 */
public final class C23908o0 {

    /* renamed from: a */
    public static final Charset f68505a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f68506b = Charset.forName(KindaConfigCacheStg.SAVE_CHARSET);

    /* renamed from: c */
    public static final byte[] f68507c;

    /* renamed from: com.google.protobuf.o0$a */
    public interface C23909a extends C23919j<Boolean> {
    }

    /* renamed from: com.google.protobuf.o0$b */
    public interface C23910b extends C23919j<Double> {
    }

    /* renamed from: com.google.protobuf.o0$c */
    public interface C23911c {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.o0$d */
    public interface C23912d<T extends C23911c> {
        T findValueByNumber(int i);
    }

    /* renamed from: com.google.protobuf.o0$e */
    public interface C23913e {
        boolean isInRange(int i);
    }

    /* renamed from: com.google.protobuf.o0$f */
    public interface C23914f extends C23919j<Float> {
    }

    /* renamed from: com.google.protobuf.o0$g */
    public interface C23915g extends C23919j<Integer> {
    }

    /* renamed from: com.google.protobuf.o0$h */
    public static class C23916h<F, T> extends AbstractList<T> {

        /* renamed from: d */
        public final List<F> f68508d;

        /* renamed from: e */
        public final C23917a<F, T> f68509e;

        /* renamed from: com.google.protobuf.o0$h$a */
        public interface C23917a<F, T> {
            T convert(F f);
        }

        public C23916h(List<F> list, C23917a<F, T> aVar) {
            this.f68508d = list;
            this.f68509e = aVar;
        }

        public T get(int i) {
            return this.f68509e.convert(this.f68508d.get(i));
        }

        public int size() {
            return this.f68508d.size();
        }
    }

    /* renamed from: com.google.protobuf.o0$i */
    public interface C23918i extends C23919j<Long> {
    }

    /* renamed from: com.google.protobuf.o0$j */
    public interface C23919j<E> extends List<E>, RandomAccess {
        /* renamed from: E0 */
        C23919j<E> mo37467E0(int i);

        /* renamed from: O */
        void mo37522O();

        /* renamed from: Q */
        boolean mo37523Q();
    }

    static {
        byte[] bArr = new byte[0];
        f68507c = bArr;
        ByteBuffer.wrap(bArr);
        C23856l.m28959i(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m29423a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: b */
    public static int m29424b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: c */
    public static Object m29425c(Object obj, Object obj2) {
        return ((C23845j1) obj).toBuilder().mergeFrom((C23845j1) obj2).buildPartial();
    }
}
