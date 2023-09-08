package com.p013qq.taf.jce;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.qq.taf.jce.JceDisplayer */
public final class JceDisplayer {
    private int _level;

    /* renamed from: sb */
    private StringBuilder f339246sb;

    public JceDisplayer(StringBuilder sb, int i) {
        this.f339246sb = sb;
        this._level = i;
    }

    public static void main(String[] strArr) {
        System.out.println("1.2");
    }

    /* renamed from: ps */
    private void m155249ps(String str) {
        for (int i = 0; i < this._level; i++) {
            this.f339246sb.append(9);
        }
        if (str != null) {
            StringBuilder sb = this.f339246sb;
            sb.append(str);
            sb.append(": ");
        }
    }

    public JceDisplayer display(boolean z, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(z ? 'T' : 'F');
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(boolean z, boolean z2) {
        this.f339246sb.append(z ? 'T' : 'F');
        if (z2) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(byte b, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(b);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(byte b, boolean z) {
        this.f339246sb.append(b);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer(StringBuilder sb) {
        this._level = 0;
        this.f339246sb = sb;
    }

    public JceDisplayer display(char c, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(c);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(char c, boolean z) {
        this.f339246sb.append(c);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(short s, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(s);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(short s, boolean z) {
        this.f339246sb.append(s);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(int i, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(i);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(int i, boolean z) {
        this.f339246sb.append(i);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(long j, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(j);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(long j, boolean z) {
        this.f339246sb.append(j);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(float f, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(f);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(float f, boolean z) {
        this.f339246sb.append(f);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(double d, String str) {
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append(d);
        sb.append(10);
        return this;
    }

    public JceDisplayer displaySimple(double d, boolean z) {
        this.f339246sb.append(d);
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(String str, String str2) {
        m155249ps(str2);
        if (str == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
        } else {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(str);
            sb4.append(10);
        }
        return this;
    }

    public JceDisplayer displaySimple(String str, boolean z) {
        if (str == null) {
            this.f339246sb.append("null");
        } else {
            this.f339246sb.append(str);
        }
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(byte[] bArr, String str) {
        m155249ps(str);
        if (bArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (bArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(bArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(bArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (byte display : bArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public JceDisplayer displaySimple(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append(HexUtil.bytes2HexStr(bArr));
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer displaySimple(char[] cArr, boolean z) {
        if (cArr == null || cArr.length == 0) {
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append(new String(cArr));
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer displaySimple(short[] sArr, boolean z) {
        if (sArr == null || sArr.length == 0) {
            this.f339246sb.append("[]");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("[");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
        for (int i = 0; i < sArr.length; i++) {
            short s = sArr[i];
            if (i != 0) {
                this.f339246sb.append("|");
            }
            jceDisplayer.displaySimple(s, false);
        }
        this.f339246sb.append("]");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(char[] cArr, String str) {
        m155249ps(str);
        if (cArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (cArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(cArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(cArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (char display : cArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public JceDisplayer displaySimple(int[] iArr, boolean z) {
        if (iArr == null || iArr.length == 0) {
            this.f339246sb.append("[]");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("[");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i != 0) {
                this.f339246sb.append("|");
            }
            jceDisplayer.displaySimple(i2, false);
        }
        this.f339246sb.append("]");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(short[] sArr, String str) {
        m155249ps(str);
        if (sArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (sArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(sArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(sArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (short display : sArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public JceDisplayer display(int[] iArr, String str) {
        m155249ps(str);
        if (iArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (iArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(iArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(iArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (int display : iArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public JceDisplayer displaySimple(long[] jArr, boolean z) {
        if (jArr == null || jArr.length == 0) {
            this.f339246sb.append("[]");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("[");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
        for (int i = 0; i < jArr.length; i++) {
            long j = jArr[i];
            if (i != 0) {
                this.f339246sb.append("|");
            }
            jceDisplayer.displaySimple(j, false);
        }
        this.f339246sb.append("]");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(long[] jArr, String str) {
        m155249ps(str);
        if (jArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (jArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(jArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(jArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (long display : jArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public JceDisplayer displaySimple(float[] fArr, boolean z) {
        if (fArr == null || fArr.length == 0) {
            this.f339246sb.append("[]");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("[");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            if (i != 0) {
                this.f339246sb.append("|");
            }
            jceDisplayer.displaySimple(f, false);
        }
        this.f339246sb.append("]");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(float[] fArr, String str) {
        m155249ps(str);
        if (fArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (fArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(fArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(fArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (float display : fArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public JceDisplayer displaySimple(double[] dArr, boolean z) {
        if (dArr == null || dArr.length == 0) {
            this.f339246sb.append("[]");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("[");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
        for (int i = 0; i < dArr.length; i++) {
            double d = dArr[i];
            if (i != 0) {
                this.f339246sb.append("|");
            }
            jceDisplayer.displaySimple(d, false);
        }
        this.f339246sb.append("[");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(double[] dArr, String str) {
        m155249ps(str);
        if (dArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (dArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(dArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(dArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (double display : dArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public <K, V> JceDisplayer displaySimple(Map<K, V> map, boolean z) {
        if (map == null || map.isEmpty()) {
            this.f339246sb.append("{}");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("{");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 2);
        boolean z2 = true;
        for (Map.Entry next : map.entrySet()) {
            if (!z2) {
                this.f339246sb.append(",");
            }
            jceDisplayer.displaySimple(next.getKey(), true);
            jceDisplayer.displaySimple(next.getValue(), false);
            z2 = false;
        }
        this.f339246sb.append("}");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public <K, V> JceDisplayer display(Map<K, V> map, String str) {
        m155249ps(str);
        if (map == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (map.isEmpty()) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(map.size());
            sb4.append(", {}");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(map.size());
            sb5.append(", {");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            JceDisplayer jceDisplayer2 = new JceDisplayer(this.f339246sb, this._level + 2);
            for (Map.Entry next : map.entrySet()) {
                jceDisplayer.display('(', (String) null);
                jceDisplayer2.display(next.getKey(), (String) null);
                jceDisplayer2.display(next.getValue(), (String) null);
                jceDisplayer.display(')', (String) null);
            }
            display('}', (String) null);
            return this;
        }
    }

    public <T> JceDisplayer displaySimple(T[] tArr, boolean z) {
        if (tArr == null || tArr.length == 0) {
            this.f339246sb.append("[]");
            if (z) {
                this.f339246sb.append("|");
            }
            return this;
        }
        this.f339246sb.append("[");
        JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
        for (int i = 0; i < tArr.length; i++) {
            T t = tArr[i];
            if (i != 0) {
                this.f339246sb.append("|");
            }
            jceDisplayer.displaySimple(t, false);
        }
        this.f339246sb.append("]");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public <T> JceDisplayer display(T[] tArr, String str) {
        m155249ps(str);
        if (tArr == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
            return this;
        } else if (tArr.length == 0) {
            StringBuilder sb4 = this.f339246sb;
            sb4.append(tArr.length);
            sb4.append(", []");
            sb4.append(10);
            return this;
        } else {
            StringBuilder sb5 = this.f339246sb;
            sb5.append(tArr.length);
            sb5.append(", [");
            sb5.append(10);
            JceDisplayer jceDisplayer = new JceDisplayer(this.f339246sb, this._level + 1);
            for (T display : tArr) {
                jceDisplayer.display(display, (String) null);
            }
            display(']', (String) null);
            return this;
        }
    }

    public <T> JceDisplayer displaySimple(Collection<T> collection, boolean z) {
        if (collection != null) {
            return displaySimple((T[]) collection.toArray(), z);
        }
        this.f339246sb.append("[]");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public <T> JceDisplayer displaySimple(T t, boolean z) {
        if (t == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
        } else if (t instanceof Byte) {
            displaySimple(((Byte) t).byteValue(), z);
        } else if (t instanceof Boolean) {
            displaySimple(((Boolean) t).booleanValue(), z);
        } else if (t instanceof Short) {
            displaySimple(((Short) t).shortValue(), z);
        } else if (t instanceof Integer) {
            displaySimple(((Integer) t).intValue(), z);
        } else if (t instanceof Long) {
            displaySimple(((Long) t).longValue(), z);
        } else if (t instanceof Float) {
            displaySimple(((Float) t).floatValue(), z);
        } else if (t instanceof Double) {
            displaySimple(((Double) t).doubleValue(), z);
        } else if (t instanceof String) {
            displaySimple((String) t, z);
        } else if (t instanceof Map) {
            displaySimple((Map) t, z);
        } else if (t instanceof List) {
            displaySimple((List) t, z);
        } else if (t instanceof JceStruct) {
            displaySimple((JceStruct) t, z);
        } else if (t instanceof byte[]) {
            displaySimple((byte[]) t, z);
        } else if (t instanceof boolean[]) {
            displaySimple((boolean[]) t, z);
        } else if (t instanceof short[]) {
            displaySimple((short[]) t, z);
        } else if (t instanceof int[]) {
            displaySimple((int[]) t, z);
        } else if (t instanceof long[]) {
            displaySimple((long[]) t, z);
        } else if (t instanceof float[]) {
            displaySimple((float[]) t, z);
        } else if (t instanceof double[]) {
            displaySimple((double[]) t, z);
        } else if (t.getClass().isArray()) {
            displaySimple((T[]) (Object[]) t, z);
        } else {
            throw new JceEncodeException("write object error: unsupport type.");
        }
        return this;
    }

    public <T> JceDisplayer display(Collection<T> collection, String str) {
        if (collection != null) {
            return display((T[]) collection.toArray(), str);
        }
        m155249ps(str);
        StringBuilder sb = this.f339246sb;
        sb.append("null");
        sb.append(9);
        return this;
    }

    public <T> JceDisplayer display(T t, String str) {
        if (t == null) {
            StringBuilder sb = this.f339246sb;
            sb.append("null");
            sb.append(10);
        } else if (t instanceof Byte) {
            display(((Byte) t).byteValue(), str);
        } else if (t instanceof Boolean) {
            display(((Boolean) t).booleanValue(), str);
        } else if (t instanceof Short) {
            display(((Short) t).shortValue(), str);
        } else if (t instanceof Integer) {
            display(((Integer) t).intValue(), str);
        } else if (t instanceof Long) {
            display(((Long) t).longValue(), str);
        } else if (t instanceof Float) {
            display(((Float) t).floatValue(), str);
        } else if (t instanceof Double) {
            display(((Double) t).doubleValue(), str);
        } else if (t instanceof String) {
            display((String) t, str);
        } else if (t instanceof Map) {
            display((Map) t, str);
        } else if (t instanceof List) {
            display((List) t, str);
        } else if (t instanceof JceStruct) {
            display((JceStruct) t, str);
        } else if (t instanceof byte[]) {
            display((byte[]) t, str);
        } else if (t instanceof boolean[]) {
            display((boolean[]) t, str);
        } else if (t instanceof short[]) {
            display((short[]) t, str);
        } else if (t instanceof int[]) {
            display((int[]) t, str);
        } else if (t instanceof long[]) {
            display((long[]) t, str);
        } else if (t instanceof float[]) {
            display((float[]) t, str);
        } else if (t instanceof double[]) {
            display((double[]) t, str);
        } else if (t.getClass().isArray()) {
            display((T[]) (Object[]) t, str);
        } else {
            throw new JceEncodeException("write object error: unsupport type.");
        }
        return this;
    }

    public JceDisplayer displaySimple(JceStruct jceStruct, boolean z) {
        this.f339246sb.append("{");
        if (jceStruct == null) {
            StringBuilder sb = this.f339246sb;
            sb.append(9);
            sb.append("null");
        } else {
            jceStruct.displaySimple(this.f339246sb, this._level + 1);
        }
        this.f339246sb.append("}");
        if (z) {
            this.f339246sb.append("|");
        }
        return this;
    }

    public JceDisplayer display(JceStruct jceStruct, String str) {
        display('{', str);
        if (jceStruct == null) {
            StringBuilder sb = this.f339246sb;
            sb.append(9);
            sb.append("null");
        } else {
            jceStruct.display(this.f339246sb, this._level + 1);
        }
        display('}', (String) null);
        return this;
    }
}
