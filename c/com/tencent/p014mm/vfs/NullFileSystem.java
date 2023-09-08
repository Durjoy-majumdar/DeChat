package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.NullFileSystem */
public final class NullFileSystem extends C86010o0 implements FileSystem {
    public static final Parcelable.Creator<NullFileSystem> CREATOR = new C116231b((C116230a) null);

    /* renamed from: com.tencent.mm.vfs.NullFileSystem$b */
    public static class C116231b implements Parcelable.Creator<NullFileSystem> {

        /* renamed from: a */
        public static final C116342y0<FileSystem, FileSystem.C85995c> f348795a = new C116342y0<>(new NullFileSystem());

        public C116231b(C116230a aVar) {
        }

        public Object createFromParcel(Parcel parcel) {
            return (NullFileSystem) f348795a.f349131a;
        }

        public Object[] newArray(int i) {
            return new NullFileSystem[i];
        }
    }

    /* renamed from: z */
    public static FileSystem.C85995c m163697z() {
        return (FileSystem.C85995c) C116231b.f348795a.f349131a;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "(null)";
    }

    /* renamed from: u */
    public FileSystem mo119930u() {
        return this;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
