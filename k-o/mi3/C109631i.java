package mi3;

import com.google.protobuf.C23908o0;

/* renamed from: mi3.i */
public enum C109631i implements C23908o0.C23911c {
    UnknownType(0),
    Video(1),
    Audio(2),
    Image(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    public final int f328219d;

    /* access modifiers changed from: public */
    static {
        values();
    }

    /* access modifiers changed from: public */
    C109631i(int i) {
        this.f328219d = i;
    }

    /* renamed from: a */
    public static C109631i m148941a(int i) {
        if (i == 0) {
            return UnknownType;
        }
        if (i == 1) {
            return Video;
        }
        if (i == 2) {
            return Audio;
        }
        if (i != 3) {
            return null;
        }
        return Image;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f328219d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
