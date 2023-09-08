package mi3;

import com.google.protobuf.C23908o0;

/* renamed from: mi3.f */
public enum C109629f implements C23908o0.C23911c {
    PbDefault(0),
    PbJumpBack(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    public final int f328208d;

    /* access modifiers changed from: public */
    static {
        values();
    }

    /* access modifiers changed from: public */
    C109629f(int i) {
        this.f328208d = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f328208d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
