package com.tencent.p014mm.vfs;

import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.StatFs;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.system.StructTimespec;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.file.XVFSFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import qp3.C118204f;
import qp3.C118206g;
import qp3.C118207h;
import qp3.C118209i;

/* renamed from: com.tencent.mm.vfs.NativeFileSystem */
public class NativeFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<NativeFileSystem> CREATOR = new C116223a();

    /* renamed from: e */
    public final C116330v f348783e;

    /* renamed from: f */
    public final C116228g f348784f;

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$b */
    public static final class C85997b {
        /* renamed from: a */
        public static boolean m106363a(String str, String str2) {
            try {
                Os.rename(str, str2);
                return true;
            } catch (ErrnoException e) {
                if (e.errno == OsConstants.EXDEV) {
                    return false;
                }
                if (e.errno == OsConstants.ENOENT) {
                    throw new FileNotFoundException("Cannot move file " + str + " to " + str2 + ": " + e.getMessage());
                }
                throw new IOException("Cannot move file " + str + " to " + str2 + ": " + e.getMessage());
            } catch (RuntimeException e2) {
                throw new IOException("Cannot move file " + str + " to " + str2 + ": " + e2.getMessage(), e2);
            }
        }
    }

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$f */
    public static class C85998f extends FileInputStream {

        /* renamed from: d */
        public long f250465d = 0;

        public C85998f(String str) {
            super(str);
        }

        public void mark(int i) {
            try {
                this.f250465d = getChannel().position();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean markSupported() {
            return true;
        }

        public void reset() {
            getChannel().position(this.f250465d);
        }
    }

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$a */
    public class C116223a implements Parcelable.Creator<NativeFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new NativeFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new NativeFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$c */
    public static final class C116224c {
        /* renamed from: a */
        public static Iterable<C86001b0> m163675a(C116228g gVar, String str) {
            try {
                Path path = Paths.get(str, new String[0]);
                if (!Files.isDirectory(path, new LinkOption[0])) {
                    return null;
                }
                return new C116225d(path, gVar);
            } catch (InvalidPathException unused) {
                Log.m106513w("VFS.NativeFileSystem", "Invalid path for list: " + str);
                return null;
            }
        }

        /* renamed from: b */
        public static boolean m163676b(String str) {
            try {
                Path path = Paths.get(str, new String[0]);
                if (Files.isDirectory(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                    return false;
                }
                Files.createDirectories(path, new FileAttribute[0]);
                return true;
            } catch (Exception e) {
                Log.m106499e("VFS.NativeFileSystem", (Throwable) e, "Cannot create directory.");
                return false;
            }
        }
    }

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$d */
    public static final class C116225d implements Iterable<C86001b0>, C118204f.C118205a<Path, C86001b0>, C118207h.C118208a {

        /* renamed from: d */
        public DirectoryStream<Path> f348785d;

        /* renamed from: e */
        public final Path f348786e;

        /* renamed from: f */
        public final C116228g f348787f;

        /* renamed from: com.tencent.mm.vfs.NativeFileSystem$d$a */
        public class C116226a implements Iterator<C86001b0> {

            /* renamed from: d */
            public final Iterator<C86001b0> f348788d;

            public C116226a() {
                this.f348788d = new C118206g(new C118209i(C116225d.this.f348785d.iterator(), C116225d.this), C116225d.this, false);
            }

            public boolean hasNext() {
                try {
                    return ((C118206g) this.f348788d).hasNext();
                } catch (RuntimeException e) {
                    Log.m106515w("VFS.NativeFileSystem", (Throwable) e, "Cannot iterate through directory: " + C116225d.this.f348786e.toString());
                    return false;
                }
            }

            public Object next() {
                return (C86001b0) ((C118206g) this.f348788d).next();
            }

            public void remove() {
                throw new UnsupportedOperationException("remove");
            }
        }

        public C116225d(Path path, C116228g gVar) {
            this.f348786e = path;
            this.f348787f = gVar;
        }

        /* renamed from: f */
        public Object mo105957f(Object obj) {
            return this.f348787f.mo177703G(((Path) obj).toFile());
        }

        public void finalize() {
            mo177698h();
        }

        /* renamed from: h */
        public void mo177698h() {
            C116299g2.m163847c(this.f348785d);
            this.f348785d = null;
        }

        public Iterator<C86001b0> iterator() {
            C116299g2.m163847c(this.f348785d);
            try {
                this.f348785d = Files.newDirectoryStream(this.f348786e);
                return new C116226a();
            } catch (Exception e) {
                Log.m106515w("VFS.NativeFileSystem", (Throwable) e, "Cannot list directory '" + this.f348786e + "'");
                this.f348785d = null;
                return Collections.emptyIterator();
            }
        }
    }

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$e */
    public static final class C116227e {
        /* renamed from: a */
        public static long m163679a(StructStat structStat) {
            StructTimespec structTimespec = structStat.st_mtim;
            return (structTimespec.tv_sec * 1000) + (structTimespec.tv_nsec / TimeUtil.SECOND_TO_US);
        }
    }

    /* renamed from: com.tencent.mm.vfs.NativeFileSystem$g */
    public class C116228g extends C116264a {

        /* renamed from: e */
        public final String f348790e;

        /* renamed from: f */
        public boolean f348791f;

        /* renamed from: com.tencent.mm.vfs.NativeFileSystem$g$a */
        public class C116229a implements C118204f.C118205a<String, C86001b0> {

            /* renamed from: d */
            public final /* synthetic */ File f348793d;

            public C116229a(File file) {
                this.f348793d = file;
            }

            /* renamed from: f */
            public Object mo105957f(Object obj) {
                return C116228g.this.mo177703G(new File(this.f348793d, (String) obj));
            }
        }

        public C116228g(String str) {
            String str2;
            String str3 = "";
            if (str.isEmpty()) {
                str2 = str3;
            } else {
                Pattern pattern = C116299g2.f349012a;
                File file = new File(str);
                try {
                    str2 = file.getCanonicalPath();
                } catch (IOException unused) {
                    str2 = file.getAbsolutePath();
                }
            }
            str3 = !str2.equals("/") ? str2 : str3;
            this.f348790e = str3;
            if (str3.isEmpty()) {
                this.f348791f = true;
                return;
            }
            File file2 = new File(str3);
            if (file2.isDirectory()) {
                this.f348791f = true;
                return;
            }
            if (file2.exists()) {
                Log.m106497e("VFS.NativeFileSystem", "Base directory exists but is not a directory, delete and proceed.Base path: " + file2.getPath());
                file2.delete();
            }
            this.f348791f = false;
        }

        /* renamed from: B */
        public boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
            if ((cVar.mo119936f() & 2) != 0) {
                String w = cVar.mo119947w(str2, false);
                String w2 = mo119947w(str, true);
                if (!(w == null || w2 == null)) {
                    return C85997b.m106363a(w, w2);
                }
            }
            return false;
        }

        /* renamed from: G */
        public final C86001b0 mo177703G(File file) {
            String str = this.f348790e;
            if (file.getPath().startsWith(str)) {
                String substring = file.getPath().length() == str.length() ? "" : file.getPath().substring(str.length() + 1);
                String name = file.getName();
                int i = Build.VERSION.SDK_INT;
                String path = file.getPath();
                try {
                    StructStat lstat = Os.lstat(path);
                    if (lstat == null) {
                        return null;
                    }
                    StructStat stat = OsConstants.S_ISLNK(lstat.st_mode) ? Os.stat(path) : lstat;
                    return new C86001b0(this, substring, name, stat.st_size, 512 * lstat.st_blocks, i >= 27 ? C116227e.m163679a(lstat) : lstat.st_mtime * 1000, OsConstants.S_ISDIR(stat.st_mode));
                } catch (ErrnoException unused) {
                    return null;
                }
            } else {
                throw new RuntimeException("Illegal file: " + file + " (base: " + str + ")");
            }
        }

        /* renamed from: b */
        public WritableByteChannel mo119932b(String str, boolean z) {
            String w = mo119947w(str, true);
            if (w != null) {
                try {
                    return new FileOutputStream(w, z).getChannel();
                } catch (Exception e) {
                    throw NativeFileSystem.m163670b(e);
                }
            } else {
                throw new FileNotFoundException("Invalid path: " + str);
            }
        }

        /* renamed from: c */
        public boolean mo119933c(String str) {
            String w = mo119947w(str, false);
            if (w == null) {
                return false;
            }
            return new File(w).delete();
        }

        /* renamed from: e */
        public boolean mo119935e(String str, long j) {
            String w = mo119947w(str, true);
            if (w == null) {
                return false;
            }
            return new File(w).setLastModified(j);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C116228g) && this.f348790e.equals(((C116228g) obj).f348790e);
        }

        /* renamed from: f */
        public int mo119936f() {
            return 31;
        }

        /* renamed from: g */
        public boolean mo119937g(String str) {
            String w = mo119947w(str, true);
            if (w == null) {
                return false;
            }
            return Build.VERSION.SDK_INT >= 26 ? C116224c.m163676b(w) : new File(w).mkdirs();
        }

        /* renamed from: h */
        public ReadableByteChannel mo119938h(String str) {
            String w = mo119947w(str, false);
            if (w != null) {
                try {
                    return new FileInputStream(w).getChannel();
                } catch (Exception e) {
                    throw NativeFileSystem.m163670b(e);
                }
            } else {
                throw new FileNotFoundException("Invalid path: " + str);
            }
        }

        public int hashCode() {
            return C116228g.class.hashCode() ^ this.f348790e.hashCode();
        }

        /* renamed from: i */
        public ParcelFileDescriptor mo119939i(String str, String str2) {
            String w = mo119947w(str, true);
            if (w != null) {
                try {
                    return ParcelFileDescriptor.open(new File(w), NativeFileSystem.m163671c(str2));
                } catch (Exception e) {
                    throw NativeFileSystem.m163670b(e);
                }
            } else {
                throw new FileNotFoundException("Invalid path: " + str);
            }
        }

        public Iterable<C86001b0> list(String str) {
            String w = mo119947w(str, false);
            if (w == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                return C116224c.m163675a(this, w);
            }
            File file = new File(w);
            String[] list = file.list();
            if (list == null) {
                return null;
            }
            return new C118204f(Arrays.asList(list), new C116229a(file), false);
        }

        /* renamed from: m */
        public OutputStream mo119941m(String str, boolean z) {
            String w = mo119947w(str, true);
            if (w != null) {
                try {
                    return new FileOutputStream(w, z);
                } catch (Exception e) {
                    throw NativeFileSystem.m163670b(e);
                }
            } else {
                throw new FileNotFoundException("Invalid path: " + str);
            }
        }

        /* renamed from: o */
        public boolean mo119942o(String str, boolean z) {
            String w = mo119947w(str, false);
            if (w == null) {
                return false;
            }
            boolean z2 = str.isEmpty() || str.equals("/");
            File file = new File(w);
            if (!file.isDirectory()) {
                return false;
            }
            boolean e = z ? NativeFileSystem.m163672e(file) : file.delete();
            if (z2 && e) {
                this.f348791f = false;
            }
            return e;
        }

        public InputStream openRead(String str) {
            String w = mo119947w(str, false);
            if (w != null) {
                try {
                    return new C85998f(w);
                } catch (Exception e) {
                    throw NativeFileSystem.m163670b(e);
                }
            } else {
                throw new FileNotFoundException("Invalid path: " + str);
            }
        }

        /* renamed from: p */
        public FileSystem.C116215a mo119944p(String str) {
            try {
                StatFs statFs = new StatFs(mo119947w(str, false));
                FileSystem.C116215a aVar = new FileSystem.C116215a();
                aVar.f348759a = statFs.getBlockSizeLong();
                aVar.f348760b = statFs.getAvailableBlocksLong();
                statFs.getBlockCountLong();
                aVar.f348761c = aVar.f348760b * aVar.f348759a;
                return aVar;
            } catch (RuntimeException unused) {
                return null;
            }
        }

        /* renamed from: q */
        public C86001b0 mo119945q(String str) {
            String w = mo119947w(str, false);
            if (w == null) {
                return null;
            }
            return mo177703G(new File(w));
        }

        public String toString() {
            return this.f348790e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return NativeFileSystem.this;
        }

        /* renamed from: w */
        public String mo119947w(String str, boolean z) {
            if (this.f348790e != null) {
                if (z && !this.f348791f) {
                    new File(this.f348790e).mkdirs();
                    this.f348791f = true;
                }
                if (str.isEmpty()) {
                    return this.f348790e;
                }
                return this.f348790e + XVFSFile.SEPARATOR_CHAR + str;
            }
            throw new IllegalStateException("Base path cannot be resolved: " + NativeFileSystem.this.f348783e);
        }

        /* renamed from: x */
        public boolean mo119948x(String str) {
            String w = mo119947w(str, false);
            return w != null && new File(w).exists();
        }
    }

    public NativeFileSystem(String str) {
        C116228g gVar;
        boolean z = true;
        String k = C116299g2.m163855k(str, true, false);
        C116330v vVar = new C116330v(k);
        this.f348783e = vVar;
        if (k.isEmpty()) {
            this.f348784f = new C116228g(k);
            return;
        }
        if (vVar.f349100b == null ? false : z) {
            gVar = null;
        } else {
            gVar = new C116228g(k);
        }
        this.f348784f = gVar;
    }

    /* renamed from: b */
    public static FileNotFoundException m163670b(Exception exc) {
        if (exc instanceof FileNotFoundException) {
            return (FileNotFoundException) exc;
        }
        if (!(exc instanceof RuntimeException)) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException(exc.getMessage());
            fileNotFoundException.initCause(exc);
            return fileNotFoundException;
        }
        throw ((RuntimeException) exc);
    }

    /* renamed from: c */
    public static int m163671c(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: e */
    public static boolean m163672e(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                z &= file2.isDirectory() ? m163672e(file2) : file2.delete();
            }
        }
        return file.delete() & z;
    }

    /* renamed from: d */
    public FileSystem.C85995c mo177578v(Map<String, Object> map) {
        C116228g gVar = this.f348784f;
        if (gVar != null) {
            return gVar;
        }
        String a = this.f348783e.mo177821a(map);
        return a == null ? NullFileSystem.m163697z() : new C116228g(a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof NativeFileSystem) && this.f348783e.equals(((NativeFileSystem) obj).f348783e);
    }

    public int hashCode() {
        return NativeFileSystem.class.hashCode() ^ this.f348783e.hashCode();
    }

    public String toString() {
        return this.f348783e.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, NativeFileSystem.class, 2);
        parcel.writeString(this.f348783e.f349099a);
    }

    public NativeFileSystem(Parcel parcel) {
        String str;
        C116228g gVar;
        C116299g2.m163845a(parcel, NativeFileSystem.class, 2);
        String readString = parcel.readString();
        boolean z = false;
        if (readString == null) {
            str = "";
        } else {
            str = C116299g2.m163855k(readString, true, false);
        }
        C116330v vVar = new C116330v(str);
        this.f348783e = vVar;
        if (str.isEmpty()) {
            this.f348784f = new C116228g(str);
            return;
        }
        if (vVar.f349100b != null ? true : z) {
            gVar = null;
        } else {
            gVar = new C116228g(str);
        }
        this.f348784f = gVar;
    }
}
