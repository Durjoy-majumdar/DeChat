package com.google.protobuf;

import com.google.protobuf.C17003m2;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23836g1;
import com.google.protobuf.C23902n1;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24020s2;
import com.google.protobuf.C24025t;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82986r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.a */
public abstract class C23803a extends C23810b implements C23836g1 {
    public int memoizedSize = -1;

    /* renamed from: com.google.protobuf.a$a */
    public static abstract class C23804a<BuilderType extends C23804a<BuilderType>> extends C23810b.C23811a implements C23836g1.C23837a {
        public static C104490q2 newUninitializedMessageException(C23836g1 g1Var) {
            ArrayList arrayList = new ArrayList();
            C23902n1.m29376b(g1Var, "", arrayList);
            return new C104490q2((List<String>) arrayList);
        }

        /* access modifiers changed from: package-private */
        public void dispose() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public List<String> findInitializationErrors() {
            ArrayList arrayList = new ArrayList();
            C23902n1.m29376b(this, "", arrayList);
            return arrayList;
        }

        public C23836g1.C23837a getFieldBuilder(C24025t.C24035g gVar) {
            throw new UnsupportedOperationException("getFieldBuilder() called on an unsupported message type.");
        }

        public String getInitializationErrorString() {
            return C23902n1.m29375a(findInitializationErrors());
        }

        public C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar) {
            throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
        }

        public C23836g1.C23837a getRepeatedFieldBuilder(C24025t.C24035g gVar, int i) {
            throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on an unsupported message type.");
        }

        public boolean hasOneof(C24025t.C24042k kVar) {
            throw new UnsupportedOperationException("hasOneof() is not implemented.");
        }

        public void markClean() {
            throw new IllegalStateException("Should be overridden by subclasses.");
        }

        public boolean mergeDelimitedFrom(InputStream inputStream) {
            return super.mergeDelimitedFrom(inputStream);
        }

        public BuilderType mergeFrom(C23856l lVar) {
            return mergeFrom(lVar, (C23806a0) C24071y.f69198h);
        }

        public String toString() {
            Logger logger = C17003m2.f46007a;
            C17003m2.C17007c cVar = C17003m2.C17007c.f46011b;
            cVar.getClass();
            try {
                StringBuilder sb = new StringBuilder();
                cVar.mo18761a(this, new C17003m2.C17006d(sb, false, (C17003m2.C17004a) null));
                return sb.toString();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        public BuilderType clearOneof(C24025t.C24042k kVar) {
            throw new UnsupportedOperationException("clearOneof() is not implemented.");
        }

        public BuilderType internalMergeFrom(C23810b bVar) {
            return mergeFrom((C23836g1) bVar);
        }

        public boolean mergeDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return super.mergeDelimitedFrom(inputStream, a0Var);
        }

        public BuilderType mergeUnknownFields(C24020s2 s2Var) {
            C24020s2 unknownFields = getUnknownFields();
            C24020s2.C24021a b = C24020s2.m29807b();
            b.mo38303f(unknownFields);
            b.mo38303f(s2Var);
            setUnknownFields(b.build());
            return this;
        }

        public BuilderType clear() {
            for (Map.Entry<C24025t.C24035g, Object> key : getAllFields().entrySet()) {
                clearField((C24025t.C24035g) key.getKey());
            }
            return this;
        }

        public BuilderType clone() {
            throw new UnsupportedOperationException("clone() should be implemented in subclasses.");
        }

        public BuilderType mergeFrom(C23836g1 g1Var) {
            return mergeFrom(g1Var, g1Var.getAllFields());
        }

        public BuilderType mergeFrom(C23836g1 g1Var, Map<C24025t.C24035g, Object> map) {
            if (g1Var.getDescriptorForType() == getDescriptorForType()) {
                for (Map.Entry next : map.entrySet()) {
                    C24025t.C24035g gVar = (C24025t.C24035g) next.getKey();
                    if (gVar.mo37662E0()) {
                        for (Object addRepeatedField : (List) next.getValue()) {
                            addRepeatedField(gVar, addRepeatedField);
                        }
                    } else if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                        C23836g1 g1Var2 = (C23836g1) getField(gVar);
                        if (g1Var2 == g1Var2.getDefaultInstanceForType()) {
                            setField(gVar, next.getValue());
                        } else {
                            setField(gVar, g1Var2.newBuilderForType().mergeFrom(g1Var2).mergeFrom((C23836g1) next.getValue()).build());
                        }
                    } else {
                        setField(gVar, next.getValue());
                    }
                }
                mergeUnknownFields(g1Var.getUnknownFields());
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
        }

        public BuilderType mergeFrom(C23856l lVar, C23806a0 a0Var) {
            int F;
            lVar.getClass();
            C24020s2 unknownFields = getUnknownFields();
            C24020s2.C24021a b = C24020s2.m29807b();
            b.mo38303f(unknownFields);
            do {
                F = lVar.mo37757F();
                if (F == 0) {
                    break;
                }
            } while (C23902n1.m29378d(lVar, b, a0Var, getDescriptorForType(), new C23902n1.C23903a(this), F));
            setUnknownFields(b.build());
            return this;
        }

        public BuilderType mergeFrom(C16994k kVar) {
            return (C23804a) super.mergeFrom(kVar);
        }

        public BuilderType mergeFrom(C16994k kVar, C23806a0 a0Var) {
            return (C23804a) super.mergeFrom(kVar, a0Var);
        }

        public BuilderType mergeFrom(byte[] bArr) {
            return (C23804a) super.mergeFrom(bArr);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) {
            return (C23804a) super.mergeFrom(bArr, i, i2);
        }

        public BuilderType mergeFrom(byte[] bArr, C23806a0 a0Var) {
            return (C23804a) super.mergeFrom(bArr, a0Var);
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, C23806a0 a0Var) {
            return (C23804a) super.mergeFrom(bArr, i, i2, a0Var);
        }

        public BuilderType mergeFrom(InputStream inputStream) {
            return (C23804a) super.mergeFrom(inputStream);
        }

        public BuilderType mergeFrom(InputStream inputStream, C23806a0 a0Var) {
            return (C23804a) super.mergeFrom(inputStream, a0Var);
        }
    }

    /* renamed from: com.google.protobuf.a$b */
    public interface C23805b {
        /* renamed from: a */
        void mo37464a();
    }

    private static boolean compareBytes(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? toByteString(obj).equals(toByteString(obj2)) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    public static boolean compareFields(Map<C24025t.C24035g, Object> map, Map<C24025t.C24035g, Object> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (C24025t.C24035g next : map.keySet()) {
            if (!map2.containsKey(next)) {
                return false;
            }
            Object obj = map.get(next);
            Object obj2 = map2.get(next);
            if (next.f69109j == C24025t.C24035g.C24037b.BYTES) {
                if (next.mo37662E0()) {
                    List list = (List) obj;
                    List list2 = (List) obj2;
                    if (list.size() != list2.size()) {
                        return false;
                    }
                    for (int i = 0; i < list.size(); i++) {
                        if (!compareBytes(list.get(i), list2.get(i))) {
                            return false;
                        }
                    }
                    continue;
                } else if (!compareBytes(obj, obj2)) {
                    return false;
                }
            } else if (next.mo38341j()) {
                if (!compareMapField(obj, obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareMapField(Object obj, Object obj2) {
        return C16985b1.m16767f(convertMapEntryListToMap((List) obj), convertMapEntryListToMap((List) obj2));
    }

    private static Map convertMapEntryListToMap(List list) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        C23836g1 g1Var = (C23836g1) it.next();
        C24025t.C24027b descriptorForType = g1Var.getDescriptorForType();
        C24025t.C24035g f = descriptorForType.mo38316f("key");
        C24025t.C24035g f2 = descriptorForType.mo38316f("value");
        Object field = g1Var.getField(f2);
        if (field instanceof C24025t.C24034f) {
            field = Integer.valueOf(((C24025t.C24034f) field).f69098e.f68710f);
        }
        hashMap.put(g1Var.getField(f), field);
        while (it.hasNext()) {
            C23836g1 g1Var2 = (C23836g1) it.next();
            Object field2 = g1Var2.getField(f2);
            if (field2 instanceof C24025t.C24034f) {
                field2 = Integer.valueOf(((C24025t.C24034f) field2).f69098e.f68710f);
            }
            hashMap.put(g1Var2.getField(f), field2);
        }
        return hashMap;
    }

    @Deprecated
    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    @Deprecated
    public static int hashEnum(C23908o0.C23911c cVar) {
        return cVar.getNumber();
    }

    @Deprecated
    public static int hashEnumList(List<? extends C23908o0.C23911c> list) {
        int i = 1;
        for (C23908o0.C23911c hashEnum : list) {
            i = (i * 31) + hashEnum(hashEnum);
        }
        return i;
    }

    public static int hashFields(int i, Map<C24025t.C24035g, Object> map) {
        int i2;
        int number;
        for (Map.Entry next : map.entrySet()) {
            C24025t.C24035g gVar = (C24025t.C24035g) next.getKey();
            Object value = next.getValue();
            int i3 = (i * 37) + gVar.f69104e.f68739f;
            if (gVar.mo38341j()) {
                i2 = i3 * 53;
                number = hashMapField(value);
            } else if (gVar.f69109j != C24025t.C24035g.C24037b.ENUM) {
                i2 = i3 * 53;
                number = value.hashCode();
            } else if (gVar.mo37662E0()) {
                int i4 = i3 * 53;
                int i5 = 1;
                for (C23908o0.C23911c number2 : (List) value) {
                    i5 = (i5 * 31) + number2.getNumber();
                }
                i = i4 + i5;
            } else {
                i2 = i3 * 53;
                number = ((C23908o0.C23911c) value).getNumber();
            }
            i = i2 + number;
        }
        return i;
    }

    @Deprecated
    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    private static int hashMapField(Object obj) {
        return C16985b1.m16764a(convertMapEntryListToMap((List) obj));
    }

    private static C16994k toByteString(Object obj) {
        if (!(obj instanceof byte[])) {
            return (C16994k) obj;
        }
        byte[] bArr = (byte[]) obj;
        C16994k kVar = C16994k.f46000e;
        return C16994k.m16790i(bArr, 0, bArr.length);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23836g1)) {
            return false;
        }
        C23836g1 g1Var = (C23836g1) obj;
        return getDescriptorForType() == g1Var.getDescriptorForType() && compareFields(getAllFields(), g1Var.getAllFields()) && getUnknownFields().equals(g1Var.getUnknownFields());
    }

    public List<String> findInitializationErrors() {
        ArrayList arrayList = new ArrayList();
        C23902n1.m29376b(this, "", arrayList);
        return arrayList;
    }

    public String getInitializationErrorString() {
        return C23902n1.m29375a(findInitializationErrors());
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSize;
    }

    public C24025t.C24035g getOneofFieldDescriptor(C24025t.C24042k kVar) {
        throw new UnsupportedOperationException("getOneofFieldDescriptor() is not implemented.");
    }

    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int c = C23902n1.m29377c(this, getAllFields());
        this.memoizedSize = c;
        return c;
    }

    public boolean hasOneof(C24025t.C24042k kVar) {
        throw new UnsupportedOperationException("hasOneof() is not implemented.");
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int hashFields = (hashFields(C82986r.CTRL_INDEX + getDescriptorForType().hashCode(), getAllFields()) * 29) + getUnknownFields().hashCode();
        this.memoizedHashCode = hashFields;
        return hashFields;
    }

    public boolean isInitialized() {
        for (C24025t.C24035g next : getDescriptorForType().mo38319h()) {
            if (next.mo38343l() && !hasField(next)) {
                return false;
            }
        }
        for (Map.Entry next2 : getAllFields().entrySet()) {
            C24025t.C24035g gVar = (C24025t.C24035g) next2.getKey();
            if (gVar.f69109j.f69132d == C24025t.C24035g.C24036a.MESSAGE) {
                if (gVar.mo37662E0()) {
                    for (C23836g1 isInitialized : (List) next2.getValue()) {
                        if (!isInitialized.isInitialized()) {
                            return false;
                        }
                    }
                    continue;
                } else if (!((C23836g1) next2.getValue()).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public C23836g1.C23837a newBuilderForType(C23805b bVar) {
        throw new UnsupportedOperationException("Nested builder is not supported for this type.");
    }

    public C104490q2 newUninitializedMessageException() {
        return C23804a.newUninitializedMessageException(this);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSize = i;
    }

    public final String toString() {
        Logger logger = C17003m2.f46007a;
        C17003m2.C17007c cVar = C17003m2.C17007c.f46011b;
        cVar.getClass();
        try {
            StringBuilder sb = new StringBuilder();
            cVar.mo18761a(this, new C17003m2.C17006d(sb, false, (C17003m2.C17004a) null));
            return sb.toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public void writeTo(C23897n nVar) {
        C23902n1.m29380f(this, getAllFields(), nVar, false);
    }
}
