package mi3;

import com.google.protobuf.C23908o0;

/* renamed from: mi3.h */
public enum C109630h implements C23908o0.C23911c {
    NoneAnimation(0),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    public final int f328212d;

    /* access modifiers changed from: public */
    static {
        values();
    }

    /* access modifiers changed from: public */
    C109630h(int i) {
        this.f328212d = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f328212d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
