package p834a3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: a3.f */
public class C103300f<T> implements Parcelable.ClassLoaderCreator<T> {

    /* renamed from: a */
    public final C103301g<T> f304581a;

    public C103300f(C103301g<T> gVar) {
        this.f304581a = gVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.f304581a.createFromParcel(parcel, (ClassLoader) null);
    }

    public T[] newArray(int i) {
        return this.f304581a.newArray(i);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f304581a.createFromParcel(parcel, classLoader);
    }
}
