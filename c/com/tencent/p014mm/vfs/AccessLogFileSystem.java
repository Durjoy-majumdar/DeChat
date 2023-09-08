package com.tencent.p014mm.vfs;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.tencent.mm.vfs.AccessLogFileSystem */
public class AccessLogFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<AccessLogFileSystem> CREATOR = new C116188a();

    /* renamed from: e */
    public final FileSystem f348706e;

    /* renamed from: f */
    public final int f348707f;

    /* renamed from: g */
    public final C116330v f348708g;

    /* renamed from: com.tencent.mm.vfs.AccessLogFileSystem$a */
    public class C116188a implements Parcelable.Creator<AccessLogFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new AccessLogFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new AccessLogFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.AccessLogFileSystem$b */
    public class C116189b extends C116301h2 {

        /* renamed from: f */
        public final int f348709f;

        public C116189b(FileSystem.C85995c cVar, int i, Map<String, Object> map) {
            super(cVar, AccessLogFileSystem.this, map);
            this.f348709f = i;
        }

        /* renamed from: B */
        public boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
            try {
                boolean B = super.mo177582B(str, cVar, str2);
                mo177597H(512, B, str, cVar, str2);
                return B;
            } catch (Throwable th) {
                mo177597H(512, false, str, cVar, str2);
                throw th;
            }
        }

        /* renamed from: D */
        public boolean mo177583D(String str, FileSystem.C85995c cVar, String str2) {
            boolean D = super.mo177583D(str, cVar, str2);
            mo177597H(1024, D, str, cVar, str2);
            return D;
        }

        /* renamed from: G */
        public void mo177596G(int i, boolean z, String str) {
            if ((this.f348709f & i) != 0) {
                mo177781F(0, "op", Integer.valueOf(i), "ok", Boolean.valueOf(z), "path", str);
            }
        }

        /* renamed from: H */
        public void mo177597H(int i, boolean z, String str, FileSystem.C85995c cVar, String str2) {
            if ((this.f348709f & i) != 0) {
                mo177781F(0, "op", Integer.valueOf(i), "ok", Boolean.valueOf(z), "path", str, "targetFS", cVar, "targetPath", str2);
            }
        }

        /* renamed from: b */
        public WritableByteChannel mo119932b(String str, boolean z) {
            try {
                WritableByteChannel b = super.mo119932b(str, z);
                mo177596G(2, true, str);
                return b;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                mo177596G(2, false, str);
                throw th;
            }
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            boolean c = super.mo119933c(str);
            mo177596G(16, c, str);
            return c;
        }

        /* renamed from: e */
        public boolean mo119935e(String str, long j) {
            return super.mo119935e(str, j);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116189b)) {
                return false;
            }
            C116189b bVar = (C116189b) obj;
            return this.f349014e.equals(bVar.f349014e) && this.f348709f == bVar.f348709f;
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            boolean g = super.mo119937g(str);
            mo177596G(64, g, str);
            return g;
        }

        /* renamed from: h */
        public ReadableByteChannel mo119938h(String str) {
            boolean z;
            try {
                ReadableByteChannel h = super.mo119938h(str);
                mo177596G(1, true, str);
                return h;
            } catch (Exception e) {
                z = false;
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            mo177596G(1, z, str);
            throw th;
        }

        public int hashCode() {
            int hashCode = C116189b.class.hashCode();
            Object[] objArr = {this.f349014e, Integer.valueOf(this.f348709f)};
            Pattern pattern = C116299g2.f349012a;
            return hashCode ^ Arrays.deepHashCode(objArr);
        }

        /* renamed from: i */
        public ParcelFileDescriptor mo119939i(String str, String str2) {
            boolean z;
            int i = 1;
            int i2 = 2;
            try {
                ParcelFileDescriptor i3 = super.mo119939i(str, str2);
                if (!str2.contains("w")) {
                    i2 = 1;
                }
                mo177596G(i2, true, str);
                return i3;
            } catch (Exception e) {
                z = false;
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            if (str2.contains("w")) {
                i = 2;
            }
            mo177596G(i, z, str);
            throw th;
        }

        public Iterable<C86001b0> list(String str) {
            Iterable<C86001b0> list = super.list(str);
            mo177596G(32, list != null, str);
            return list;
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            try {
                OutputStream m = super.mo119941m(str, z);
                mo177596G(2, true, str);
                return m;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                mo177596G(2, false, str);
                throw th;
            }
        }

        /* renamed from: o */
        public boolean mo119942o(String str, boolean z) {
            boolean o = super.mo119942o(str, z);
            mo177596G(16, o, str);
            return o;
        }

        public InputStream openRead(String str) {
            boolean z;
            try {
                InputStream openRead = super.openRead(str);
                mo177596G(1, true, str);
                return openRead;
            } catch (Exception e) {
                z = false;
                throw e;
            } catch (Throwable th) {
                th = th;
            }
            mo177596G(1, z, str);
            throw th;
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            C86001b0 q = super.mo119945q(str);
            mo177596G(8, q != null, str);
            return q;
        }

        public String toString() {
            return String.format("log(%04x) <- %s", new Object[]{Integer.valueOf(this.f348709f), this.f349014e});
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return AccessLogFileSystem.this;
        }

        /* renamed from: w */
        public String mo119947w(String str, boolean z) {
            String w = super.mo119947w(str, z);
            boolean z2 = w != null;
            if ((this.f348709f & 128) != 0) {
                mo177781F(0, "op", 128, "ok", Boolean.valueOf(z2), "path", str, "forWrite", Boolean.valueOf(z));
            }
            return w;
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            boolean x = super.mo119948x(str);
            mo177596G(4, x, str);
            return x;
        }

        /* renamed from: z */
        public long mo177589z(String str, FileSystem.C85995c cVar, String str2, boolean z) {
            try {
                long z2 = super.mo177589z(str, cVar, str2, z);
                mo177597H(256, true, str, cVar, str2);
                return z2;
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                mo177597H(256, false, str, cVar, str2);
                throw th;
            }
        }
    }

    public AccessLogFileSystem(FileSystem fileSystem, int i, String str) {
        C116330v vVar;
        this.f348706e = fileSystem;
        this.f348707f = i;
        if (str == null) {
            vVar = null;
        } else {
            vVar = new C116330v(str);
        }
        this.f348708g = vVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccessLogFileSystem)) {
            return false;
        }
        AccessLogFileSystem accessLogFileSystem = (AccessLogFileSystem) obj;
        return this.f348706e.equals(accessLogFileSystem.f348706e) && this.f348707f == accessLogFileSystem.f348707f && C116299g2.m163849e(this.f348708g, accessLogFileSystem.f348708g);
    }

    public int hashCode() {
        int hashCode = AccessLogFileSystem.class.hashCode();
        Object[] objArr = {this.f348706e, Integer.valueOf(this.f348707f), this.f348708g};
        Pattern pattern = C116299g2.f349012a;
        return hashCode ^ Arrays.deepHashCode(objArr);
    }

    public String toString() {
        return String.format("log(%04x) <- %s", new Object[]{Integer.valueOf(this.f348707f), this.f348706e});
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        int i;
        C116330v vVar = this.f348708g;
        if (vVar == null) {
            i = this.f348707f;
        } else {
            String a = vVar.mo177821a(map);
            int i2 = this.f348707f;
            Pattern pattern = C116299g2.f349012a;
            if (a != null) {
                try {
                    i = Integer.parseInt(a);
                } catch (NumberFormatException unused) {
                }
            }
            i = i2;
        }
        FileSystem.C85995c cVar = (FileSystem.C85995c) this.f348706e.mo177578v(map);
        return i == 0 ? cVar : new C116189b(cVar, i, map);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, AccessLogFileSystem.class, 2);
        parcel.writeParcelable(this.f348706e, i);
        parcel.writeInt(this.f348707f);
        C116330v vVar = this.f348708g;
        parcel.writeString(vVar == null ? null : vVar.f349099a);
    }

    public AccessLogFileSystem(Parcel parcel) {
        C116330v vVar;
        C116299g2.m163845a(parcel, AccessLogFileSystem.class, 2);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348706e = fileSystem;
        if (fileSystem != null) {
            this.f348707f = parcel.readInt();
            String readString = parcel.readString();
            if (readString == null) {
                vVar = null;
            } else {
                vVar = new C116330v(readString);
            }
            this.f348708g = vVar;
            return;
        }
        throw new IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
