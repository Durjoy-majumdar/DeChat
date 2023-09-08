package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import gy3.C87412m;
import kotlin.Metadata;
import p175j0.C108494d2;
import p175j0.C108497e2;
import p175j0.C108507n2;
import p175j0.C108511s1;
import p175j0.C108516z0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, mo182094d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Lj0/d2;", "Landroid/os/Parcelable;", "runtime_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class ParcelableSnapshotMutableState<T> extends C108494d2<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C103601a();

    /* renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    public static final class C103601a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        /* renamed from: a */
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            C108497e2 e2Var;
            C87412m.m108594g(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C103601a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                e2Var = C108516z0.f324839a;
            } else if (readInt == 1) {
                e2Var = C108507n2.f324831a;
            } else if (readInt == 2) {
                e2Var = C108511s1.f324833a;
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, e2Var);
        }

        public Object createFromParcel(Parcel parcel) {
            C87412m.m108594g(parcel, "parcel");
            return createFromParcel(parcel, (ClassLoader) null);
        }

        public Object[] newArray(int i) {
            return new ParcelableSnapshotMutableState[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t, C108497e2<T> e2Var) {
        super(t, e2Var);
        C87412m.m108594g(e2Var, "policy");
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C87412m.m108594g(parcel, "parcel");
        parcel.writeValue(getValue());
        C108497e2<T> e2Var = this.f324818d;
        if (C87412m.m108589b(e2Var, C108516z0.f324839a)) {
            i2 = 0;
        } else if (C87412m.m108589b(e2Var, C108507n2.f324831a)) {
            i2 = 1;
        } else if (C87412m.m108589b(e2Var, C108511s1.f324833a)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
