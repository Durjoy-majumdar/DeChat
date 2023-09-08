package p1014o4;

import android.app.Notification;

/* renamed from: o4.f */
public final class C109939f {

    /* renamed from: a */
    public final int f328934a;

    /* renamed from: b */
    public final int f328935b;

    /* renamed from: c */
    public final Notification f328936c;

    public C109939f(int i, Notification notification, int i2) {
        this.f328934a = i;
        this.f328936c = notification;
        this.f328935b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C109939f.class != obj.getClass()) {
            return false;
        }
        C109939f fVar = (C109939f) obj;
        if (this.f328934a == fVar.f328934a && this.f328935b == fVar.f328935b) {
            return this.f328936c.equals(fVar.f328936c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f328934a * 31) + this.f328935b) * 31) + this.f328936c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f328934a + ", mForegroundServiceType=" + this.f328935b + ", mNotification=" + this.f328936c + '}';
    }
}
