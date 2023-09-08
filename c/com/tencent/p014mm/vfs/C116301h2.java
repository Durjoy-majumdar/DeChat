package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.h2 */
public abstract class C116301h2 extends C116264a implements FileSystem.C85994b {

    /* renamed from: e */
    public final FileSystem.C85995c f349014e;

    public C116301h2(FileSystem.C85995c cVar) {
        this.f349014e = cVar;
    }

    /* renamed from: B */
    public boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
        FileSystem.C85995c q = C116299g2.m163861q(this.f349014e, str, 2);
        FileSystem.C85995c q2 = C116299g2.m163861q(cVar, str2, 1);
        if (q != null && q2 != null) {
            return q instanceof C116264a ? ((C116264a) q).mo177582B(str, q2, str2) : q.mo119946t(str, q2, str2);
        }
        throw new IOException("Cannot resolve delegate filesystem.");
    }

    /* renamed from: D */
    public boolean mo177583D(String str, FileSystem.C85995c cVar, String str2) {
        FileSystem.C85995c q = C116299g2.m163861q(this.f349014e, str2, 2);
        FileSystem.C85995c q2 = C116299g2.m163861q(cVar, str, 1);
        if (q2 == null || q == null) {
            return false;
        }
        if (q instanceof C116264a) {
            return ((C116264a) q).mo177583D(str, q2, str2);
        }
        return true;
    }

    /* renamed from: a */
    public void mo119928a(CancellationSignal cancellationSignal) {
        this.f349014e.mo119928a(cancellationSignal);
    }

    /* renamed from: b */
    public WritableByteChannel mo119932b(String str, boolean z) {
        return this.f349014e.mo119932b(str, z);
    }

    /* renamed from: c */
    public boolean mo119933c(String str) {
        return this.f349014e.mo119933c(str);
    }

    /* renamed from: e */
    public boolean mo119935e(String str, long j) {
        return this.f349014e.mo119935e(str, j);
    }

    /* renamed from: f */
    public int mo119936f() {
        return this.f349014e.mo119936f();
    }

    /* renamed from: g */
    public boolean mo119937g(String str) {
        return this.f349014e.mo119937g(str);
    }

    /* renamed from: h */
    public ReadableByteChannel mo119938h(String str) {
        return this.f349014e.mo119938h(str);
    }

    /* renamed from: i */
    public ParcelFileDescriptor mo119939i(String str, String str2) {
        return this.f349014e.mo119939i(str, str2);
    }

    /* renamed from: j */
    public List<FileSystem.C85995c> mo119931j() {
        return Collections.singletonList(this.f349014e);
    }

    public Iterable<C86001b0> list(String str) {
        return this.f349014e.list(str);
    }

    /* renamed from: m */
    public OutputStream mo119941m(String str, boolean z) {
        return this.f349014e.mo119941m(str, z);
    }

    /* renamed from: o */
    public boolean mo119942o(String str, boolean z) {
        return this.f349014e.mo119942o(str, z);
    }

    public InputStream openRead(String str) {
        return this.f349014e.openRead(str);
    }

    /* renamed from: p */
    public FileSystem.C116215a mo119944p(String str) {
        return this.f349014e.mo119944p(str);
    }

    /* renamed from: q */
    public C86001b0 mo119945q(String str) {
        return this.f349014e.mo119945q(str);
    }

    /* renamed from: w */
    public String mo119947w(String str, boolean z) {
        return this.f349014e.mo119947w(str, z);
    }

    /* renamed from: x */
    public boolean mo119948x(String str) {
        return this.f349014e.mo119948x(str);
    }

    /* renamed from: z */
    public long mo177589z(String str, FileSystem.C85995c cVar, String str2, boolean z) {
        return this.f349014e.mo119934d(str, cVar, str2, z);
    }

    public C116301h2(FileSystem.C85995c cVar, FileSystem fileSystem, Map<String, Object> map) {
        super(fileSystem, map);
        this.f349014e = cVar;
    }
}
