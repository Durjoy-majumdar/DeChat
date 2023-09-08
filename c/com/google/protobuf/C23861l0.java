package com.google.protobuf;

import com.google.protobuf.C23810b;
import com.google.protobuf.C23825f;
import com.google.protobuf.C23832g0;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23861l0.C23862a;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24087z2;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.l0 */
public abstract class C23861l0<MessageType extends C23861l0<MessageType, BuilderType>, BuilderType extends C23862a<MessageType, BuilderType>> extends C23810b<MessageType, BuilderType> {
    private static Map<Object, C23861l0<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C24046t2 unknownFields = C24046t2.f69159f;

    /* renamed from: com.google.protobuf.l0$a */
    public static abstract class C23862a<MessageType extends C23861l0<MessageType, BuilderType>, BuilderType extends C23862a<MessageType, BuilderType>> extends C23810b.C23811a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        public MessageType instance;
        public boolean isBuilt = false;

        public C23862a(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (C23861l0) messagetype.dynamicMethod(C23867f.NEW_MUTABLE_INSTANCE);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            C24086z1 z1Var = C24086z1.f69225c;
            z1Var.getClass();
            z1Var.mo38436a(messagetype.getClass()).mo37609a(messagetype, messagetype2);
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (C23861l0) this.instance.dynamicMethod(C23867f.NEW_MUTABLE_INSTANCE);
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        public final boolean isInitialized() {
            return C23861l0.isInitialized(this.instance, false);
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw C23810b.C23811a.newUninitializedMessageException(buildPartial);
        }

        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final BuilderType clear() {
            this.instance = (C23861l0) this.instance.dynamicMethod(C23867f.NEW_MUTABLE_INSTANCE);
            return this;
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom(messagetype);
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
            copyOnWrite();
            try {
                C24086z1 z1Var = C24086z1.f69225c;
                MessageType messagetype = this.instance;
                z1Var.getClass();
                z1Var.mo38436a(messagetype.getClass()).mo37612d(this.instance, bArr, i, i + i2, new C23825f.C23826a(a0Var));
                return this;
            } catch (C23922p0 e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw C23922p0.m29484i();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) {
            return mergeFrom(bArr, i, i2, C23806a0.m28602a());
        }

        public BuilderType mergeFrom(C23856l lVar, C23806a0 a0Var) {
            copyOnWrite();
            try {
                C24086z1 z1Var = C24086z1.f69225c;
                MessageType messagetype = this.instance;
                z1Var.getClass();
                C23828f2<?> a = z1Var.mo38436a(messagetype.getClass());
                MessageType messagetype2 = this.instance;
                C23871m mVar = lVar.f68362d;
                if (mVar == null) {
                    mVar = new C23871m(lVar);
                }
                a.mo37617h(messagetype2, mVar, a0Var);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* renamed from: com.google.protobuf.l0$b */
    public static class C23863b<T extends C23861l0<T, ?>> extends C23813c<T> {

        /* renamed from: a */
        public final T f68387a;

        public C23863b(T t) {
            this.f68387a = t;
        }

        public Object parsePartialFrom(C23856l lVar, C23806a0 a0Var) {
            return C23861l0.parsePartialFrom(this.f68387a, lVar, a0Var);
        }

        public C23845j1 parsePartialFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
            return C23861l0.parsePartialFrom(this.f68387a, bArr, i, i2, a0Var);
        }

        /* renamed from: parsePartialFrom  reason: collision with other method in class */
        public Object m168131parsePartialFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
            return C23861l0.parsePartialFrom(this.f68387a, bArr, i, i2, a0Var);
        }
    }

    /* renamed from: com.google.protobuf.l0$c */
    public static abstract class C23864c<MessageType extends C23864c<MessageType, BuilderType>, BuilderType> extends C23861l0<MessageType, BuilderType> implements C23848k1 {

        /* renamed from: d */
        public C23832g0<C23865d> f68388d = C23832g0.f68258d;

        public /* bridge */ /* synthetic */ C23845j1 getDefaultInstanceForType() {
            return C23861l0.super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ C23845j1.C23846a newBuilderForType() {
            return C23861l0.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ C23845j1.C23846a toBuilder() {
            return C23861l0.super.toBuilder();
        }
    }

    /* renamed from: com.google.protobuf.l0$d */
    public static final class C23865d implements C23832g0.C23835c<C23865d> {

        /* renamed from: d */
        public final C23908o0.C23912d<?> f68389d;

        /* renamed from: e */
        public final int f68390e;

        /* renamed from: f */
        public final C24087z2.C24089b f68391f;

        /* renamed from: g */
        public final boolean f68392g;

        /* renamed from: h */
        public final boolean f68393h;

        public C23865d(C23908o0.C23912d<?> dVar, int i, C24087z2.C24089b bVar, boolean z, boolean z2) {
            this.f68389d = dVar;
            this.f68390e = i;
            this.f68391f = bVar;
            this.f68392g = z;
            this.f68393h = z2;
        }

        /* renamed from: E0 */
        public boolean mo37662E0() {
            return this.f68392g;
        }

        /* renamed from: O */
        public C24087z2.C24089b mo37663O() {
            return this.f68391f;
        }

        /* renamed from: Q */
        public C24087z2.C24094c mo37664Q() {
            return this.f68391f.f69233d;
        }

        /* renamed from: S1 */
        public C23845j1.C23846a mo37665S1(C23845j1.C23846a aVar, C23845j1 j1Var) {
            return ((C23862a) aVar).mergeFrom((C23861l0) j1Var);
        }

        /* renamed from: T0 */
        public boolean mo37666T0() {
            return this.f68393h;
        }

        public int compareTo(Object obj) {
            return this.f68390e - ((C23865d) obj).f68390e;
        }

        public int getNumber() {
            return this.f68390e;
        }
    }

    /* renamed from: com.google.protobuf.l0$e */
    public static class C23866e<ContainingType extends C23845j1, Type> extends C24063x<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f68394a;

        /* renamed from: b */
        public final Type f68395b;

        /* renamed from: c */
        public final C23845j1 f68396c;

        /* renamed from: d */
        public final C23865d f68397d;

        public C23866e(ContainingType containingtype, Type type, C23845j1 j1Var, C23865d dVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.f68391f == C24087z2.C24089b.MESSAGE && j1Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f68394a = containingtype;
                this.f68395b = type;
                this.f68396c = j1Var;
                this.f68397d = dVar;
            }
        }
    }

    /* renamed from: com.google.protobuf.l0$f */
    public enum C23867f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.protobuf.l0$g */
    public static final class C23868g implements Serializable {
        public C23868g(C23845j1 j1Var) {
            j1Var.getClass();
            j1Var.toByteArray();
        }
    }

    /* access modifiers changed from: private */
    public static <MessageType extends C23864c<MessageType, BuilderType>, BuilderType, T> C23866e<MessageType, T> checkIsLite(C24063x<MessageType, T> xVar) {
        xVar.getClass();
        if (!(xVar instanceof C24060w)) {
            return (C23866e) xVar;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends C23861l0<T, ?>> T checkMessageInitialized(T t) {
        if (t == null || t.isInitialized()) {
            return t;
        }
        C104490q2 newUninitializedMessageException = t.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        C23922p0 p0Var = new C23922p0(newUninitializedMessageException.getMessage());
        p0Var.f68530d = t;
        throw p0Var;
    }

    public static C23908o0.C23909a emptyBooleanList() {
        return C23838h.f68266g;
    }

    public static C23908o0.C23910b emptyDoubleList() {
        return C24047u.f69165g;
    }

    public static C23908o0.C23914f emptyFloatList() {
        return C23843i0.f68335g;
    }

    public static C23908o0.C23915g emptyIntList() {
        return C23901n0.f68496g;
    }

    public static C23908o0.C23918i emptyLongList() {
        return C24061w0.f69185g;
    }

    public static <E> C23908o0.C23919j<E> emptyProtobufList() {
        return C23808a2.f68212g;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C24046t2.f69159f) {
            this.unknownFields = new C24046t2();
        }
    }

    public static <T extends C23861l0<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (C23861l0) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C23861l0) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((C23861l0) C24065x2.m29974a(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            StringBuilder sb = new StringBuilder(name.length() + 45 + String.valueOf(str).length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(str);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static C23908o0.C23915g mutableCopy(C23908o0.C23915g gVar) {
        int i = ((C23901n0) gVar).f68498f;
        return ((C23901n0) gVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static Object newMessageInfo(C23845j1 j1Var, String str, Object[] objArr) {
        return new C23816c2(j1Var, str, objArr);
    }

    public static <ContainingType extends C23845j1, Type> C23866e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C23845j1 j1Var, C23908o0.C23912d<?> dVar, int i, C24087z2.C24089b bVar, boolean z, Class cls) {
        return new C23866e(containingtype, Collections.emptyList(), j1Var, new C23865d(dVar, i, bVar, true, z), cls);
    }

    public static <ContainingType extends C23845j1, Type> C23866e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C23845j1 j1Var, C23908o0.C23912d<?> dVar, int i, C24087z2.C24089b bVar, Class cls) {
        return new C23866e(containingtype, type, j1Var, new C23865d(dVar, i, bVar, false, false), cls);
    }

    public static <T extends C23861l0<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C23806a0.m28602a()));
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C23806a0 a0Var) {
        return checkMessageInitialized(parseFrom(t, C23856l.m28958h(byteBuffer, false), a0Var));
    }

    private static <T extends C23861l0<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, C23806a0 a0Var) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            C23856l g = C23856l.m28957g(new C23810b.C23811a.C16984a(inputStream, C23856l.m28960y(read, inputStream)));
            T parsePartialFrom = parsePartialFrom(t, g, a0Var);
            try {
                g.mo37761a(0);
                return parsePartialFrom;
            } catch (C23922p0 e) {
                e.f68530d = parsePartialFrom;
                throw e;
            }
        } catch (IOException e2) {
            throw new C23922p0(e2.getMessage());
        }
    }

    public static <T extends C23861l0<T, ?>> T parsePartialFrom(T t, C23856l lVar, C23806a0 a0Var) {
        T t2 = (C23861l0) t.dynamicMethod(C23867f.NEW_MUTABLE_INSTANCE);
        try {
            C24086z1 z1Var = C24086z1.f69225c;
            z1Var.getClass();
            C23828f2<?> a = z1Var.mo38436a(t2.getClass());
            C23871m mVar = lVar.f68362d;
            if (mVar == null) {
                mVar = new C23871m(lVar);
            }
            a.mo37617h(t2, mVar, a0Var);
            a.mo37613e(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C23922p0) {
                throw ((C23922p0) e.getCause());
            }
            C23922p0 p0Var = new C23922p0(e.getMessage());
            p0Var.f68530d = t2;
            throw p0Var;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C23922p0) {
                throw ((C23922p0) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends C23861l0<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(C23867f.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends C23861l0<MessageType, BuilderType>, BuilderType extends C23862a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C23862a) dynamicMethod(C23867f.NEW_BUILDER);
    }

    public Object dynamicMethod(C23867f fVar, Object obj) {
        return dynamicMethod(fVar, obj, (Object) null);
    }

    public abstract Object dynamicMethod(C23867f fVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24086z1 z1Var = C24086z1.f69225c;
        z1Var.getClass();
        return z1Var.mo38436a(getClass()).equals(this, (C23861l0) obj);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C24062w1<MessageType> getParserForType() {
        return (C24062w1) dynamicMethod(C23867f.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            C24086z1 z1Var = C24086z1.f69225c;
            z1Var.getClass();
            this.memoizedSerializedSize = z1Var.mo38436a(getClass()).mo37615f(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C24086z1 z1Var = C24086z1.f69225c;
        z1Var.getClass();
        int hashCode = z1Var.mo38436a(getClass()).hashCode(this);
        this.memoizedHashCode = hashCode;
        return hashCode;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        C24086z1 z1Var = C24086z1.f69225c;
        z1Var.getClass();
        z1Var.mo38436a(getClass()).mo37613e(this);
    }

    public void mergeLengthDelimitedField(int i, C16994k kVar) {
        ensureUnknownFieldsInitialized();
        C24046t2 t2Var = this.unknownFields;
        if (!t2Var.f69164e) {
            throw new UnsupportedOperationException();
        } else if (i != 0) {
            t2Var.mo38361d((i << 3) | 2, kVar);
        } else {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(C24046t2 t2Var) {
        this.unknownFields = C24046t2.m29897c(this.unknownFields, t2Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C24046t2 t2Var = this.unknownFields;
        if (!t2Var.f69164e) {
            throw new UnsupportedOperationException();
        } else if (i != 0) {
            t2Var.mo38361d((i << 3) | 0, Long.valueOf((long) i2));
        } else {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
    }

    public boolean parseUnknownField(int i, C23856l lVar) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo38360b(i, lVar);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C113384l1.m155238c(this, sb, 0);
        return sb.toString();
    }

    public void writeTo(C23897n nVar) {
        C24086z1 z1Var = C24086z1.f69225c;
        z1Var.getClass();
        C23828f2<?> a = z1Var.mo38436a(getClass());
        C23907o oVar = nVar.f68488a;
        if (oVar == null) {
            oVar = new C23907o(nVar);
        }
        a.mo37611c(this, oVar);
    }

    public static final <T extends C23861l0<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(C23867f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C24086z1 z1Var = C24086z1.f69225c;
        z1Var.getClass();
        boolean b = z1Var.mo38436a(t.getClass()).mo37610b(t);
        if (z) {
            t.dynamicMethod(C23867f.SET_MEMOIZED_IS_INITIALIZED, b ? t : null);
        }
        return b;
    }

    public final <MessageType extends C23861l0<MessageType, BuilderType>, BuilderType extends C23862a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mergeFrom(messagetype);
    }

    public Object dynamicMethod(C23867f fVar) {
        return dynamicMethod(fVar, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (C23861l0) dynamicMethod(C23867f.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (C23862a) dynamicMethod(C23867f.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C23862a) dynamicMethod(C23867f.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public static C23908o0.C23918i mutableCopy(C23908o0.C23918i iVar) {
        int i = ((C24061w0) iVar).f69187f;
        return ((C24061w0) iVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static <T extends C23861l0<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, a0Var));
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        return parseFrom(t, byteBuffer, C23806a0.m28602a());
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, C16994k kVar) {
        return checkMessageInitialized(parseFrom(t, kVar, C23806a0.m28602a()));
    }

    public static C23908o0.C23914f mutableCopy(C23908o0.C23914f fVar) {
        int i = ((C23843i0) fVar).f68337f;
        return ((C23843i0) fVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, C16994k kVar, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(t, kVar, a0Var));
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, byte[] bArr) {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C23806a0.m28602a()));
    }

    public static C23908o0.C23910b mutableCopy(C23908o0.C23910b bVar) {
        int i = ((C24047u) bVar).f69167f;
        return ((C24047u) bVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, byte[] bArr, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, a0Var));
    }

    public static C23908o0.C23909a mutableCopy(C23908o0.C23909a aVar) {
        int i = ((C23838h) aVar).f68268f;
        return ((C23838h) aVar).mo37467E0(i == 0 ? 10 : i * 2);
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, InputStream inputStream) {
        return checkMessageInitialized(parsePartialFrom(t, C23856l.m28957g(inputStream), C23806a0.m28602a()));
    }

    public static <E> C23908o0.C23919j<E> mutableCopy(C23908o0.C23919j<E> jVar) {
        int size = jVar.size();
        return jVar.mo37467E0(size == 0 ? 10 : size * 2);
    }

    public static <T extends C23861l0<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C23806a0 a0Var) {
        T t2 = (C23861l0) t.dynamicMethod(C23867f.NEW_MUTABLE_INSTANCE);
        try {
            C24086z1 z1Var = C24086z1.f69225c;
            z1Var.getClass();
            C23828f2<?> a = z1Var.mo38436a(t2.getClass());
            a.mo37612d(t2, bArr, i, i + i2, new C23825f.C23826a(a0Var));
            a.mo37613e(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C23922p0) {
                throw ((C23922p0) e.getCause());
            }
            C23922p0 p0Var = new C23922p0(e.getMessage());
            p0Var.f68530d = t2;
            throw p0Var;
        } catch (IndexOutOfBoundsException unused) {
            C23922p0 i3 = C23922p0.m29484i();
            i3.f68530d = t2;
            throw i3;
        }
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, InputStream inputStream, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(t, C23856l.m28957g(inputStream), a0Var));
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, C23856l lVar) {
        return parseFrom(t, lVar, C23806a0.m28602a());
    }

    public static <T extends C23861l0<T, ?>> T parseFrom(T t, C23856l lVar, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(t, lVar, a0Var));
    }

    public static <T extends C23861l0<T, ?>> T parsePartialFrom(T t, C23856l lVar) {
        return parsePartialFrom(t, lVar, C23806a0.m28602a());
    }

    private static <T extends C23861l0<T, ?>> T parsePartialFrom(T t, C16994k kVar, C23806a0 a0Var) {
        T parsePartialFrom;
        try {
            C23856l o = kVar.mo18745o();
            parsePartialFrom = parsePartialFrom(t, o, a0Var);
            o.mo37761a(0);
            return parsePartialFrom;
        } catch (C23922p0 e) {
            e.f68530d = parsePartialFrom;
            throw e;
        } catch (C23922p0 e2) {
            throw e2;
        }
    }

    private static <T extends C23861l0<T, ?>> T parsePartialFrom(T t, byte[] bArr, C23806a0 a0Var) {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, a0Var));
    }
}
