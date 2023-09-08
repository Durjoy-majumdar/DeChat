package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p1042u.C111059i;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new C104467a();

    /* renamed from: f */
    public final C111059i<String, Bundle> f309476f;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    public static class C104467a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (C104467a) null);
        }

        public Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        public Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (C104467a) null);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f309476f = new C111059i<>();
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f309476f + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f306434d, i);
        int i2 = this.f309476f.f332583f;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.f309476f.mo162789j(i3);
            bundleArr[i3] = this.f309476f.mo162791l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C104467a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f309476f = new C111059i<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f309476f.put(strArr[i], bundleArr[i]);
        }
    }
}
