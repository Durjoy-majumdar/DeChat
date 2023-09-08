package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.MaintenanceGroup */
public class MaintenanceGroup implements FileSystem {
    public static final Parcelable.Creator<MaintenanceGroup> CREATOR = new C116219a();

    /* renamed from: d */
    public final C116335w f348768d;

    /* renamed from: com.tencent.mm.vfs.MaintenanceGroup$a */
    public class C116219a implements Parcelable.Creator<MaintenanceGroup> {
        public Object createFromParcel(Parcel parcel) {
            return new MaintenanceGroup(parcel);
        }

        public Object[] newArray(int i) {
            return new MaintenanceGroup[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.MaintenanceGroup$b */
    public class C116220b extends C86010o0 implements FileSystem.C85994b {

        /* renamed from: d */
        public final List<FileSystem.C85995c> f348769d;

        public C116220b(List<FileSystem.C85995c> list) {
            this.f348769d = list;
        }

        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            for (FileSystem.C85995c a : this.f348769d) {
                cancellationSignal.throwIfCanceled();
                a.mo119928a(cancellationSignal);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof C116220b) && this.f348769d.equals(((C116220b) obj).f348769d);
        }

        public int hashCode() {
            return C116220b.class.hashCode() ^ this.f348769d.hashCode();
        }

        /* renamed from: j */
        public List<FileSystem.C85995c> mo119931j() {
            return this.f348769d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(512);
            sb.append("maintenanceGroup:");
            for (FileSystem.C85995c append : this.f348769d) {
                sb.append("\n  ");
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return MaintenanceGroup.this;
        }
    }

    public MaintenanceGroup(Object... objArr) {
        this.f348768d = new C116335w(objArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof MaintenanceGroup) && this.f348768d.equals(((MaintenanceGroup) obj).f348768d);
    }

    public int hashCode() {
        return MaintenanceGroup.class.hashCode() ^ this.f348768d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(512);
        sb.append("maintenanceGroup:");
        for (Object append : this.f348768d.f349111a) {
            sb.append(10);
            sb.append("  ");
            sb.append(append);
        }
        return sb.toString();
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return new C116220b(this.f348768d.mo177834a(map));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, MaintenanceGroup.class, 3);
        this.f348768d.mo177835b(parcel);
    }

    public MaintenanceGroup(Collection<?> collection) {
        this.f348768d = new C116335w(collection);
    }

    public MaintenanceGroup(Parcel parcel) {
        C116299g2.m163845a(parcel, MaintenanceGroup.class, 3);
        this.f348768d = new C116335w(parcel);
    }
}
