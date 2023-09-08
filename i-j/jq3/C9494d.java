package jq3;

import android.view.View;
import gy3.C87412m;
import jq3.C9493c;

/* renamed from: jq3.d */
public final class C9494d<T extends C9493c> {

    /* renamed from: a */
    public final T f29663a;

    /* renamed from: b */
    public long f29664b = -1;

    /* renamed from: c */
    public long f29665c = -1;

    /* renamed from: d */
    public long f29666d = -1;

    /* renamed from: e */
    public int f29667e = -1;

    /* renamed from: f */
    public View f29668f;

    public C9494d(T t) {
        C87412m.m108594g(t, "associatedObject");
        this.f29663a = t;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9494d)) {
            return false;
        }
        return this == obj || this.f29663a.getItemId() == ((C9494d) obj).f29663a.getItemId();
    }

    public int hashCode() {
        return (int) this.f29663a.getItemId();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("adapterPosition = " + this.f29667e);
        sb.append("\n");
        sb.append("exposeTime = " + this.f29666d);
        sb.append("\n");
        sb.append("startTime = " + this.f29664b);
        sb.append("\n");
        sb.append("endTime = " + this.f29665c);
        sb.append("\n");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "StringBuilder().append(\"…)\n            .toString()");
        return sb4;
    }
}
