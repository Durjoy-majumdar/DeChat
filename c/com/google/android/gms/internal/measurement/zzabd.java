package com.google.android.gms.internal.measurement;

import java.util.Map;

final class zzabd implements Comparable, Map.Entry {
    private Object value;
    private final Comparable zzbue;
    private final /* synthetic */ zzaay zzbuf;

    public zzabd(zzaay zzaay, Comparable comparable, Object obj) {
        this.zzbuf = zzaay;
        this.zzbue = comparable;
        this.value = obj;
    }

    public zzabd(zzaay zzaay, Map.Entry entry) {
        this(zzaay, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzabd) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzbue, entry.getKey()) && equals(this.value, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.zzbue;
    }

    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        Comparable comparable = this.zzbue;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.value;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.zzbuf.zzul();
        Object obj2 = this.value;
        this.value = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzbue);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
