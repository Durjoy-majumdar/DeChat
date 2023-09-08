package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.CombinedFileSystem */
public class CombinedFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<CombinedFileSystem> CREATOR = new C116199a();

    /* renamed from: e */
    public final FileSystem[] f348728e;

    /* renamed from: f */
    public final C116200b[] f348729f;

    /* renamed from: com.tencent.mm.vfs.CombinedFileSystem$a */
    public class C116199a implements Parcelable.Creator<CombinedFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new CombinedFileSystem(parcel, (C116199a) null);
        }

        public Object[] newArray(int i) {
            return new CombinedFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.CombinedFileSystem$b */
    public static final class C116200b {

        /* renamed from: a */
        public final Pattern f348730a;

        /* renamed from: b */
        public final int f348731b;

        public C116200b(Pattern pattern, int i) {
            this.f348730a = pattern;
            this.f348731b = i;
        }
    }

    /* renamed from: com.tencent.mm.vfs.CombinedFileSystem$c */
    public class C116201c extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c[] f348732e;

        /* renamed from: f */
        public final int f348733f;

        public C116201c(FileSystem.C85995c[] cVarArr, int i) {
            this.f348732e = cVarArr;
            this.f348733f = i;
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return Arrays.asList(this.f348732e);
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            for (C116200b bVar : CombinedFileSystem.this.f348729f) {
                Pattern pattern = bVar.f348730a;
                if (pattern == null || pattern.matcher(str).matches()) {
                    return this.f348732e[bVar.f348731b];
                }
            }
            return null;
        }

        /* renamed from: f */
        public int mo119936f() {
            return this.f348733f;
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            boolean z = false;
            for (FileSystem.C85995c g : this.f348732e) {
                z |= g.mo119937g(str);
            }
            return z;
        }

        /* renamed from: p */
        public FileSystem.C116215a mo119944p(String str) {
            FileSystem.C85995c[] cVarArr = this.f348732e;
            return cVarArr[cVarArr.length - 1].mo119944p(str);
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return CombinedFileSystem.this;
        }
    }

    public CombinedFileSystem(Parcel parcel, C116199a aVar) {
        C116299g2.m163845a(parcel, CombinedFileSystem.class, 1);
        int readInt = parcel.readInt();
        this.f348728e = new FileSystem[readInt];
        int i = 0;
        while (i < readInt) {
            FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
            if (fileSystem != null) {
                this.f348728e[i] = fileSystem;
                i++;
            } else {
                throw new ParcelFormatException();
            }
        }
        int readInt2 = parcel.readInt();
        this.f348729f = new C116200b[readInt2];
        for (int i2 = 0; i2 < readInt2; i2++) {
            String readString = parcel.readString();
            this.f348729f[i2] = new C116200b(readString == null ? null : Pattern.compile(readString), parcel.readInt());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CombinedFS [");
        for (FileSystem obj : this.f348728e) {
            sb.append(obj.toString());
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        int length = this.f348728e.length;
        FileSystem.C85995c[] cVarArr = new FileSystem.C85995c[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            FileSystem.C85995c cVar = (FileSystem.C85995c) this.f348728e[i2].mo177578v(map);
            i |= cVar.mo119936f();
            cVarArr[i2] = cVar;
        }
        return new C116201c(cVarArr, i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, CombinedFileSystem.class, 1);
        parcel.writeInt(this.f348728e.length);
        for (FileSystem writeParcelable : this.f348728e) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeInt(this.f348729f.length);
        for (C116200b bVar : this.f348729f) {
            Pattern pattern = bVar.f348730a;
            parcel.writeString(pattern == null ? null : pattern.pattern());
            parcel.writeInt(bVar.f348731b);
        }
    }
}
