package com.google.protobuf;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23810b.C23811a;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23897n;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.b */
public abstract class C23810b<MessageType extends C23810b<MessageType, BuilderType>, BuilderType extends C23811a<MessageType, BuilderType>> implements C23845j1 {
    public int memoizedHashCode = 0;

    /* renamed from: com.google.protobuf.b$a */
    public static abstract class C23811a<MessageType extends C23810b<MessageType, BuilderType>, BuilderType extends C23811a<MessageType, BuilderType>> implements C23845j1.C23846a {
        @Deprecated
        public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
            addAll(iterable, (List) collection);
        }

        private static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(list.size() - size);
                    sb.append(" is null.");
                    String sb4 = sb.toString();
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(next);
            }
        }

        private String getReadingExceptionMessage(String str) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 60 + String.valueOf(str).length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append(str);
            sb.append(" threw an IOException (should never happen).");
            return sb.toString();
        }

        public static C104490q2 newUninitializedMessageException(C23845j1 j1Var) {
            return new C104490q2(j1Var);
        }

        public abstract BuilderType clone();

        public abstract BuilderType internalMergeFrom(MessageType messagetype);

        public boolean mergeDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            int read = inputStream.read();
            if (read == -1) {
                return false;
            }
            mergeFrom((InputStream) new C16984a(inputStream, C23856l.m28960y(read, inputStream)), a0Var);
            return true;
        }

        public abstract BuilderType mergeFrom(C23856l lVar, C23806a0 a0Var);

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) {
            try {
                C23856l i3 = C23856l.m28959i(bArr, i, i2, false);
                mergeFrom(i3);
                i3.mo37761a(0);
                return this;
            } catch (C23922p0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
            Charset charset = C23908o0.f68505a;
            iterable.getClass();
            if (iterable instanceof C24048u0) {
                List<?> c = ((C24048u0) iterable).mo38351c();
                C24048u0 u0Var = (C24048u0) list;
                int size = list.size();
                for (Object next : c) {
                    if (next == null) {
                        StringBuilder sb = new StringBuilder(37);
                        sb.append("Element at index ");
                        sb.append(u0Var.size() - size);
                        sb.append(" is null.");
                        String sb4 = sb.toString();
                        for (int size2 = u0Var.size() - 1; size2 >= size; size2--) {
                            u0Var.remove(size2);
                        }
                        throw new NullPointerException(sb4);
                    } else if (next instanceof C16994k) {
                        u0Var.mo38353g((C16994k) next);
                    } else {
                        u0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C24064x1) {
                list.addAll((Collection) iterable);
            } else {
                addAllCheckingNulls(iterable, list);
            }
        }

        /* renamed from: com.google.protobuf.b$a$a */
        public static final class C16984a extends FilterInputStream {

            /* renamed from: d */
            public int f45990d;

            public C16984a(InputStream inputStream, int i) {
                super(inputStream);
                this.f45990d = i;
            }

            public int available() {
                return Math.min(super.available(), this.f45990d);
            }

            public int read() {
                if (this.f45990d <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f45990d--;
                }
                return read;
            }

            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.f45990d));
                if (skip >= 0) {
                    this.f45990d = (int) (((long) this.f45990d) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f45990d;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f45990d -= read;
                }
                return read;
            }
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return mergeDelimitedFrom(inputStream, C23806a0.m28602a());
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
            try {
                C23856l i3 = C23856l.m28959i(bArr, i, i2, false);
                mergeFrom(i3, a0Var);
                i3.mo37761a(0);
                return this;
            } catch (C23922p0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
            }
        }

        public BuilderType mergeFrom(C23856l lVar) {
            return mergeFrom(lVar, C23806a0.m28602a());
        }

        public BuilderType mergeFrom(C16994k kVar) {
            try {
                C23856l o = kVar.mo18745o();
                mergeFrom(o);
                o.mo37761a(0);
                return this;
            } catch (C23922p0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(C16994k kVar, C23806a0 a0Var) {
            try {
                C23856l o = kVar.mo18745o();
                mergeFrom(o, a0Var);
                o.mo37761a(0);
                return this;
            } catch (C23922p0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr) {
            return mergeFrom(bArr, 0, bArr.length);
        }

        public BuilderType mergeFrom(byte[] bArr, C23806a0 a0Var) {
            return mergeFrom(bArr, 0, bArr.length, a0Var);
        }

        public BuilderType mergeFrom(InputStream inputStream) {
            C23856l g = C23856l.m28957g(inputStream);
            mergeFrom(g);
            g.mo37761a(0);
            return this;
        }

        public BuilderType mergeFrom(InputStream inputStream, C23806a0 a0Var) {
            C23856l g = C23856l.m28957g(inputStream);
            mergeFrom(g, a0Var);
            g.mo37761a(0);
            return this;
        }

        public BuilderType mergeFrom(C23845j1 j1Var) {
            if (getDefaultInstanceForType().getClass().isInstance(j1Var)) {
                return internalMergeFrom((C23810b) j1Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C23811a.addAll(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(C16994k kVar) {
        if (!kVar.mo18744n()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        String name = getClass().getName();
        StringBuilder sb = new StringBuilder(name.length() + 62 + String.valueOf(str).length());
        sb.append("Serializing ");
        sb.append(name);
        sb.append(" to a ");
        sb.append(str);
        sb.append(" threw an IOException (should never happen).");
        return sb.toString();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C23828f2 f2Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int f = f2Var.mo37615f(this);
        setMemoizedSerializedSize(f);
        return f;
    }

    public C104490q2 newUninitializedMessageException() {
        return new C104490q2((C23845j1) this);
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = C23897n.f68486b;
            C23897n.C23899b bVar = new C23897n.C23899b(bArr, 0, serializedSize);
            writeTo(bVar);
            if (bVar.mo37895B() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public C16994k toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C16994k kVar = C16994k.f46000e;
            byte[] bArr = new byte[serializedSize];
            Logger logger = C23897n.f68486b;
            C23897n.C23899b bVar = new C23897n.C23899b(bArr, 0, serializedSize);
            writeTo(bVar);
            if (bVar.mo37895B() == 0) {
                return new C16994k.C17000f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int x = C23897n.m29279x(serializedSize) + serializedSize;
        if (x > 4096) {
            x = 4096;
        }
        C23897n.C23900d dVar = new C23897n.C23900d(outputStream, x);
        dVar.mo37918Y(serializedSize);
        writeTo(dVar);
        if (dVar.f68491f > 0) {
            dVar.mo37927g0();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = C23897n.f68486b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C23897n.C23900d dVar = new C23897n.C23900d(outputStream, serializedSize);
        writeTo(dVar);
        if (dVar.f68491f > 0) {
            dVar.mo37927g0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C23811a.addAll(iterable, list);
    }
}
