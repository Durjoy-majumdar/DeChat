package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import qp3.C118196a;
import qp3.C118198c;

/* renamed from: com.tencent.mm.vfs.m */
public abstract class C116309m extends C116264a implements FileSystem.C85994b {

    /* renamed from: com.tencent.mm.vfs.m$b */
    public static final class C86008b implements C118196a.C89789a<FileSystem.C85995c, C86001b0> {

        /* renamed from: a */
        public final String f250485a;

        public C86008b(String str) {
            this.f250485a = str;
        }

        /* renamed from: a */
        public Iterable mo119949a(Object obj) {
            return ((FileSystem.C85995c) obj).list(this.f250485a);
        }
    }

    /* renamed from: com.tencent.mm.vfs.m$c */
    public static final class C116311c implements C118198c.C118199a<C86001b0> {

        /* renamed from: a */
        public final HashSet<String> f349029a = new HashSet<>();

        public C116311c(C116310a aVar) {
        }
    }

    public C116309m() {
    }

    /* renamed from: B */
    public final boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
        throw new AssertionError();
    }

    /* renamed from: D */
    public boolean mo177583D(String str, FileSystem.C85995c cVar, String str2) {
        throw new AssertionError();
    }

    /* renamed from: G */
    public abstract List<FileSystem.C85995c> mo119926G();

    /* renamed from: H */
    public abstract FileSystem.C85995c mo119927H(String str, int i);

    /* renamed from: K */
    public Iterable<FileSystem.C85995c> mo177633K(String str, int i) {
        return mo119926G();
    }

    /* renamed from: M */
    public final boolean mo177814M(String str, boolean z) {
        C86001b0 q;
        String h = C116299g2.m163852h(str);
        if (h == null) {
            return false;
        }
        FileSystem.C85995c H = mo119927H(h, 2);
        while (z && (H instanceof C116309m)) {
            H = ((C116309m) H).mo119927H(h, 2);
        }
        FileSystem.C85995c H2 = mo119927H(h, 1);
        while (z && (H2 instanceof C116309m)) {
            H2 = ((C116309m) H2).mo119927H(h, 1);
        }
        if (H == H2 || H.mo119948x(h) || (q = H2.mo119945q(h)) == null || !q.f250476f) {
            return false;
        }
        return H.mo119937g(h);
    }

    /* renamed from: a */
    public void mo119928a(CancellationSignal cancellationSignal) {
        for (FileSystem.C85995c a : mo119926G()) {
            cancellationSignal.throwIfCanceled();
            a.mo119928a(cancellationSignal);
        }
    }

    /* renamed from: b */
    public WritableByteChannel mo119932b(String str, boolean z) {
        FileSystem.C85995c H = mo119927H(str, z ? 3 : 2);
        if (H == null) {
            throw new FileNotFoundException("Path not found on any filesystems: " + str);
        } else if (z || mo119926G().size() <= 1) {
            return H.mo119932b(str, z);
        } else {
            try {
                return H.mo119932b(str, false);
            } catch (FileNotFoundException e) {
                if (mo177814M(str, false)) {
                    return H.mo119932b(str, false);
                }
                throw e;
            }
        }
    }

    /* renamed from: c */
    public boolean mo119933c(String str) {
        boolean z = false;
        for (FileSystem.C85995c c : mo177633K(str, 5)) {
            z |= c.mo119933c(str);
        }
        return z;
    }

    /* renamed from: d */
    public long mo119934d(String str, FileSystem.C85995c cVar, String str2, boolean z) {
        if (!str.equals(str2) || !equals(cVar)) {
            try {
                return super.mo119934d(str, cVar, str2, z);
            } catch (FileNotFoundException e) {
                if (mo177814M(str, true)) {
                    return super.mo119934d(str, cVar, str2, z);
                }
                throw e;
            }
        } else {
            throw new IOException("Copying within the same filesystem is not allowed: " + str + " -> " + this);
        }
    }

    /* renamed from: e */
    public boolean mo119935e(String str, long j) {
        FileSystem.C85995c H = mo119927H(str, 3);
        return H != null && H.mo119935e(str, j);
    }

    /* renamed from: f */
    public int mo119936f() {
        return mo119927H("", 0).mo119936f();
    }

    /* renamed from: g */
    public boolean mo119937g(String str) {
        FileSystem.C85995c H = mo119927H(str, 2);
        return H != null && H.mo119937g(str);
    }

    /* renamed from: h */
    public ReadableByteChannel mo119938h(String str) {
        FileSystem.C85995c H = mo119927H(str, 1);
        if (H != null) {
            return H.mo119938h(str);
        }
        throw new FileNotFoundException("Path not found on any filesystems: " + str);
    }

    /* renamed from: i */
    public ParcelFileDescriptor mo119939i(String str, String str2) {
        FileSystem.C85995c H = mo119927H(str, str2.contains("rw") ? 3 : str2.contains("w") ? 2 : 1);
        if (H != null) {
            return H.mo119939i(str, str2);
        }
        throw new FileNotFoundException("Path not found on any filesystems: " + str);
    }

    /* renamed from: j */
    public final List<FileSystem.C85995c> mo119931j() {
        return mo119926G();
    }

    public Iterable<C86001b0> list(String str) {
        List<FileSystem.C85995c> j = C116299g2.m163854j(mo177633K(str, 4));
        int size = j.size();
        if (size == 1) {
            return j.get(0).list(str);
        }
        if (size == 0) {
            return null;
        }
        return new C118198c(new C118196a(j, new C86008b(str)), new C116311c((C116310a) null));
    }

    /* renamed from: m */
    public OutputStream mo119941m(String str, boolean z) {
        FileSystem.C85995c H = mo119927H(str, z ? 3 : 2);
        if (H == null) {
            throw new FileNotFoundException("Path not found on any filesystems: " + str);
        } else if (z || mo119926G().size() <= 1) {
            return H.mo119941m(str, z);
        } else {
            try {
                return H.mo119941m(str, false);
            } catch (FileNotFoundException e) {
                if (mo177814M(str, false)) {
                    return H.mo119941m(str, false);
                }
                throw e;
            }
        }
    }

    /* renamed from: o */
    public boolean mo119942o(String str, boolean z) {
        boolean z2 = false;
        for (FileSystem.C85995c o : mo177633K(str, 5)) {
            z2 |= o.mo119942o(str, z);
        }
        return z2;
    }

    public InputStream openRead(String str) {
        FileSystem.C85995c H = mo119927H(str, 1);
        if (H != null) {
            return H.openRead(str);
        }
        throw new FileNotFoundException("Path not found on any filesystems: " + str);
    }

    /* renamed from: p */
    public FileSystem.C116215a mo119944p(String str) {
        FileSystem.C85995c H = mo119927H(str, 0);
        if (H != null) {
            return H.mo119944p(str);
        }
        throw new RuntimeException("Cannot delegate path to filesystem: " + str);
    }

    /* renamed from: q */
    public C86001b0 mo119945q(String str) {
        FileSystem.C85995c H = mo119927H(str, 1);
        if (H == null) {
            return null;
        }
        return H.mo119945q(str);
    }

    /* renamed from: t */
    public boolean mo119946t(String str, FileSystem.C85995c cVar, String str2) {
        if (str.equals(str2) && equals(cVar)) {
            return false;
        }
        boolean t = super.mo119946t(str, cVar, str2);
        return (t || !mo177814M(str, true)) ? t : super.mo119946t(str, cVar, str2);
    }

    /* renamed from: w */
    public String mo119947w(String str, boolean z) {
        FileSystem.C85995c H = mo119927H(str, z ? 2 : 1);
        if (H == null) {
            return null;
        }
        return H.mo119947w(str, z);
    }

    /* renamed from: x */
    public boolean mo119948x(String str) {
        FileSystem.C85995c H = mo119927H(str, 1);
        return H != null && H.mo119948x(str);
    }

    /* renamed from: z */
    public final long mo177589z(String str, FileSystem.C85995c cVar, String str2, boolean z) {
        throw new AssertionError();
    }

    public C116309m(FileSystem fileSystem, Map<String, Object> map) {
        super(fileSystem, map);
    }
}
