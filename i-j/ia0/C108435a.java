package ia0;

/* renamed from: ia0.a */
public final class C108435a {

    /* renamed from: a */
    public final int f324687a;

    /* renamed from: b */
    public final int f324688b;

    /* renamed from: c */
    public int f324689c;

    public C108435a(int i, int i2) {
        this.f324687a = i;
        this.f324688b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108435a)) {
            return false;
        }
        C108435a aVar = (C108435a) obj;
        return this.f324687a == aVar.f324687a && this.f324688b == aVar.f324688b;
    }

    public int hashCode() {
        return (this.f324687a * 31) + this.f324688b;
    }

    public String toString() {
        return "AudioConfig(sampleRate=" + this.f324687a + ", channelCount=" + this.f324688b + ')';
    }
}
