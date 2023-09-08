package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.DeleteAllFileSystem */
public class DeleteAllFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<DeleteAllFileSystem> CREATOR = new C116206a();

    /* renamed from: e */
    public final FileSystem f348742e;

    /* renamed from: com.tencent.mm.vfs.DeleteAllFileSystem$a */
    public class C116206a implements Parcelable.Creator<DeleteAllFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new DeleteAllFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new DeleteAllFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.DeleteAllFileSystem$b */
    public class C116207b extends C86010o0 implements FileSystem.C85994b {

        /* renamed from: d */
        public final FileSystem.C85995c f348743d;

        public C116207b(FileSystem.C85995c cVar) {
            this.f348743d = cVar;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            this.f348743d.mo119942o("", true);
            cancellationSignal.throwIfCanceled();
            this.f348743d.mo119928a(cancellationSignal);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C116207b) && this.f348743d.equals(((C116207b) obj).f348743d);
        }

        public int hashCode() {
            return C116207b.class.hashCode() ^ this.f348743d.hashCode();
        }

        /* renamed from: j */
        public List<FileSystem.C85995c> mo119931j() {
            return Collections.singletonList(this.f348743d);
        }

        public String toString() {
            return "delete <- " + this.f348743d;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return DeleteAllFileSystem.this;
        }
    }

    public DeleteAllFileSystem(FileSystem fileSystem) {
        this.f348742e = fileSystem;
    }

    public boolean equals(Object obj) {
        return (obj instanceof DeleteAllFileSystem) && this.f348742e.equals(((DeleteAllFileSystem) obj).f348742e);
    }

    public int hashCode() {
        return DeleteAllFileSystem.class.hashCode() ^ this.f348742e.hashCode();
    }

    public String toString() {
        return "delete <- " + this.f348742e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116207b((FileSystem.C85995c) this.f348742e.mo177578v(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, StatisticsFileSystem.class, 1);
        parcel.writeParcelable(this.f348742e, i);
    }

    public DeleteAllFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, StatisticsFileSystem.class, 1);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348742e = fileSystem;
        if (fileSystem == null) {
            throw new IllegalArgumentException("Wrong wrapped filesystem.");
        }
    }
}
