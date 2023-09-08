package mi3;

import com.google.protobuf.C23908o0;

/* renamed from: mi3.j */
public enum C109632j implements C23908o0.C23911c {
    Custom(0),
    CenterCrop(1),
    CenterInside(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    public final int f328225d;

    /* access modifiers changed from: public */
    static {
        values();
    }

    /* access modifiers changed from: public */
    C109632j(int i) {
        this.f328225d = i;
    }

    /* renamed from: a */
    public static C109632j m148942a(int i) {
        if (i == 0) {
            return Custom;
        }
        if (i == 1) {
            return CenterCrop;
        }
        if (i != 2) {
            return null;
        }
        return CenterInside;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f328225d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
