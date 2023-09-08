package com.tencent.mapsdk.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.k */
public final class C113864k {

    /* renamed from: a */
    private StringBuilder f340649a;

    /* renamed from: b */
    private int f340650b;

    public C113864k(StringBuilder sb, int i) {
        this.f340649a = sb;
        this.f340650b = i;
    }

    /* renamed from: a */
    private void m157377a(String str) {
        for (int i = 0; i < this.f340650b; i++) {
            this.f340649a.append(9);
        }
        if (str != null) {
            StringBuilder sb = this.f340649a;
            sb.append(str);
            sb.append(": ");
        }
    }

    private C113864k(StringBuilder sb) {
        this.f340650b = 0;
        this.f340649a = sb;
    }

    /* renamed from: a */
    private C113864k m157361a(boolean z, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(z ? 'T' : 'F');
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    private C113864k m157362a(boolean z, boolean z2) {
        this.f340649a.append(z ? 'T' : 'F');
        if (z2) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172251a(byte b, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(b);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172252a(byte b, boolean z) {
        this.f340649a.append(b);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157352a(char c, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(c);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    private C113864k m157353a(char c, boolean z) {
        this.f340649a.append(c);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172264a(short s, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(s);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172265a(short s, boolean z) {
        this.f340649a.append(s);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172253a(int i, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(i);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172254a(int i, boolean z) {
        this.f340649a.append(i);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172255a(long j, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(j);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172256a(long j, boolean z) {
        this.f340649a.append(j);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157356a(float f, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(f);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    private C113864k m157357a(float f, boolean z) {
        this.f340649a.append(f);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157354a(double d, String str) {
        m157377a(str);
        StringBuilder sb = this.f340649a;
        sb.append(d);
        sb.append(10);
        return this;
    }

    /* renamed from: a */
    private C113864k m157355a(double d, boolean z) {
        this.f340649a.append(d);
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172259a(String str, String str2) {
        m157377a(str2);
        if (str == null) {
            this.f340649a.append("null\n");
        } else {
            StringBuilder sb = this.f340649a;
            sb.append(str);
            sb.append(10);
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172260a(String str, boolean z) {
        if (str == null) {
            this.f340649a.append("null");
        } else {
            this.f340649a.append(str);
        }
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172266a(byte[] bArr, String str) {
        m157377a(str);
        if (bArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (bArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(bArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (byte a : bArr) {
                kVar.mo172251a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    public final C113864k mo172267a(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append(C80342i.m97830a(bArr));
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157363a(char[] cArr, String str) {
        m157377a(str);
        if (cArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (cArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(cArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(cArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (char a : cArr) {
                kVar.m157352a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private C113864k m157364a(char[] cArr, boolean z) {
        if (cArr == null || cArr.length == 0) {
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append(new String(cArr));
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157375a(short[] sArr, String str) {
        m157377a(str);
        if (sArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (sArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(sArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (short a : sArr) {
                kVar.mo172264a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private C113864k m157376a(short[] sArr, boolean z) {
        if (sArr == null || sArr.length == 0) {
            this.f340649a.append("[]");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("[");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
        for (int i = 0; i < sArr.length; i++) {
            short s = sArr[i];
            if (i != 0) {
                this.f340649a.append("|");
            }
            kVar.mo172265a(s, false);
        }
        this.f340649a.append("]");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157369a(int[] iArr, String str) {
        m157377a(str);
        if (iArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (iArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(iArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (int a : iArr) {
                kVar.mo172253a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private C113864k m157370a(int[] iArr, boolean z) {
        if (iArr == null || iArr.length == 0) {
            this.f340649a.append("[]");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("[");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i != 0) {
                this.f340649a.append("|");
            }
            kVar.mo172254a(i2, false);
        }
        this.f340649a.append("]");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157371a(long[] jArr, String str) {
        m157377a(str);
        if (jArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (jArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(jArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (long a : jArr) {
                kVar.mo172255a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private C113864k m157372a(long[] jArr, boolean z) {
        if (jArr == null || jArr.length == 0) {
            this.f340649a.append("[]");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("[");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
        for (int i = 0; i < jArr.length; i++) {
            long j = jArr[i];
            if (i != 0) {
                this.f340649a.append("|");
            }
            kVar.mo172256a(j, false);
        }
        this.f340649a.append("]");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157367a(float[] fArr, String str) {
        m157377a(str);
        if (fArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (fArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(fArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (float a : fArr) {
                kVar.m157356a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private C113864k m157368a(float[] fArr, boolean z) {
        if (fArr == null || fArr.length == 0) {
            this.f340649a.append("[]");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("[");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            if (i != 0) {
                this.f340649a.append("|");
            }
            kVar.m157357a(f, false);
        }
        this.f340649a.append("]");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private C113864k m157365a(double[] dArr, String str) {
        m157377a(str);
        if (dArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (dArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(dArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (double a : dArr) {
                kVar.m157354a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private C113864k m157366a(double[] dArr, boolean z) {
        if (dArr == null || dArr.length == 0) {
            this.f340649a.append("[]");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("[");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
        for (int i = 0; i < dArr.length; i++) {
            double d = dArr[i];
            if (i != 0) {
                this.f340649a.append("|");
            }
            kVar.m157355a(d, false);
        }
        this.f340649a.append("[");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final <K, V> C113864k mo172263a(Map<K, V> map, String str) {
        m157377a(str);
        if (map == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (map.isEmpty()) {
            StringBuilder sb = this.f340649a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(map.size());
            sb4.append(", {\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            C113864k kVar2 = new C113864k(this.f340649a, this.f340650b + 2);
            for (Map.Entry next : map.entrySet()) {
                kVar.m157352a('(', (String) null);
                kVar2.m157358a(next.getKey(), (String) null);
                kVar2.m157358a(next.getValue(), (String) null);
                kVar.m157352a(')', (String) null);
            }
            m157352a('}', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private <K, V> C113864k m157360a(Map<K, V> map, boolean z) {
        if (map == null || map.isEmpty()) {
            this.f340649a.append("{}");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("{");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 2);
        boolean z2 = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z2) {
                this.f340649a.append(",");
            }
            kVar.m157359a(next.getKey(), true);
            kVar.m157359a(next.getValue(), false);
            z2 = false;
        }
        this.f340649a.append("}");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private <T> C113864k m157373a(T[] tArr, String str) {
        m157377a(str);
        if (tArr == null) {
            this.f340649a.append("null\n");
            return this;
        } else if (tArr.length == 0) {
            StringBuilder sb = this.f340649a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb4 = this.f340649a;
            sb4.append(tArr.length);
            sb4.append(", [\n");
            C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
            for (T a : tArr) {
                kVar.m157358a(a, (String) null);
            }
            m157352a(']', (String) null);
            return this;
        }
    }

    /* renamed from: a */
    private <T> C113864k m157374a(T[] tArr, boolean z) {
        if (tArr == null || tArr.length == 0) {
            this.f340649a.append("[]");
            if (z) {
                this.f340649a.append("|");
            }
            return this;
        }
        this.f340649a.append("[");
        C113864k kVar = new C113864k(this.f340649a, this.f340650b + 1);
        for (int i = 0; i < tArr.length; i++) {
            T t = tArr[i];
            if (i != 0) {
                this.f340649a.append("|");
            }
            kVar.m157359a(t, false);
        }
        this.f340649a.append("]");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    public final <T> C113864k mo172261a(Collection<T> collection, String str) {
        if (collection != null) {
            return m157373a((T[]) collection.toArray(), str);
        }
        m157377a(str);
        this.f340649a.append("null\t");
        return this;
    }

    /* renamed from: a */
    public final <T> C113864k mo172262a(Collection<T> collection, boolean z) {
        if (collection != null) {
            return m157374a((T[]) collection.toArray(), z);
        }
        this.f340649a.append("[]");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }

    /* renamed from: a */
    private <T> C113864k m157358a(T t, String str) {
        if (t == null) {
            this.f340649a.append("null\n");
        } else if (t instanceof Byte) {
            mo172251a(((Byte) t).byteValue(), str);
        } else if (t instanceof Boolean) {
            m157361a(((Boolean) t).booleanValue(), str);
        } else if (t instanceof Short) {
            mo172264a(((Short) t).shortValue(), str);
        } else if (t instanceof Integer) {
            mo172253a(((Integer) t).intValue(), str);
        } else if (t instanceof Long) {
            mo172255a(((Long) t).longValue(), str);
        } else if (t instanceof Float) {
            m157356a(((Float) t).floatValue(), str);
        } else if (t instanceof Double) {
            m157354a(((Double) t).doubleValue(), str);
        } else if (t instanceof String) {
            mo172259a((String) t, str);
        } else if (t instanceof Map) {
            mo172263a((Map) t, str);
        } else if (t instanceof List) {
            mo172261a((List) t, str);
        } else if (t instanceof C114029p) {
            mo172257a((C114029p) t, str);
        } else if (t instanceof byte[]) {
            mo172266a((byte[]) t, str);
        } else if (t instanceof boolean[]) {
            m157358a((boolean[]) t, str);
        } else if (t instanceof short[]) {
            m157375a((short[]) t, str);
        } else if (t instanceof int[]) {
            m157369a((int[]) t, str);
        } else if (t instanceof long[]) {
            m157371a((long[]) t, str);
        } else if (t instanceof float[]) {
            m157367a((float[]) t, str);
        } else if (t instanceof double[]) {
            m157365a((double[]) t, str);
        } else if (t.getClass().isArray()) {
            m157373a((T[]) (Object[]) t, str);
        } else {
            throw new C113924l("write object error: unsupport type.");
        }
        return this;
    }

    /* renamed from: a */
    private <T> C113864k m157359a(T t, boolean z) {
        if (t == null) {
            this.f340649a.append("null\n");
        } else if (t instanceof Byte) {
            mo172252a(((Byte) t).byteValue(), z);
        } else if (t instanceof Boolean) {
            m157362a(((Boolean) t).booleanValue(), z);
        } else if (t instanceof Short) {
            mo172265a(((Short) t).shortValue(), z);
        } else if (t instanceof Integer) {
            mo172254a(((Integer) t).intValue(), z);
        } else if (t instanceof Long) {
            mo172256a(((Long) t).longValue(), z);
        } else if (t instanceof Float) {
            m157357a(((Float) t).floatValue(), z);
        } else if (t instanceof Double) {
            m157355a(((Double) t).doubleValue(), z);
        } else if (t instanceof String) {
            mo172260a((String) t, z);
        } else if (t instanceof Map) {
            m157360a((Map) t, z);
        } else if (t instanceof List) {
            mo172262a((List) t, z);
        } else if (t instanceof C114029p) {
            mo172258a((C114029p) t, z);
        } else if (t instanceof byte[]) {
            mo172267a((byte[]) t, z);
        } else if (t instanceof boolean[]) {
            m157359a((boolean[]) t, z);
        } else if (t instanceof short[]) {
            m157376a((short[]) t, z);
        } else if (t instanceof int[]) {
            m157370a((int[]) t, z);
        } else if (t instanceof long[]) {
            m157372a((long[]) t, z);
        } else if (t instanceof float[]) {
            m157368a((float[]) t, z);
        } else if (t instanceof double[]) {
            m157366a((double[]) t, z);
        } else if (t.getClass().isArray()) {
            m157374a((T[]) (Object[]) t, z);
        } else {
            throw new C113924l("write object error: unsupport type.");
        }
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172257a(C114029p pVar, String str) {
        m157352a('{', str);
        if (pVar == null) {
            StringBuilder sb = this.f340649a;
            sb.append(9);
            sb.append("null");
        } else {
            pVar.display(this.f340649a, this.f340650b + 1);
        }
        m157352a('}', (String) null);
        return this;
    }

    /* renamed from: a */
    public final C113864k mo172258a(C114029p pVar, boolean z) {
        this.f340649a.append("{");
        if (pVar == null) {
            StringBuilder sb = this.f340649a;
            sb.append(9);
            sb.append("null");
        } else {
            pVar.displaySimple(this.f340649a, this.f340650b + 1);
        }
        this.f340649a.append("}");
        if (z) {
            this.f340649a.append("|");
        }
        return this;
    }
}
