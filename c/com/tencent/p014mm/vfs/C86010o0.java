package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* renamed from: com.tencent.mm.vfs.o0 */
public abstract class C86010o0 implements FileSystem.C85995c {
    /* renamed from: a */
    public void mo119928a(CancellationSignal cancellationSignal) {
    }

    /* renamed from: b */
    public WritableByteChannel mo119932b(String str, boolean z) {
        throw new FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    /* renamed from: c */
    public boolean mo119933c(String str) {
        return false;
    }

    /* renamed from: d */
    public long mo119934d(String str, FileSystem.C85995c cVar, String str2, boolean z) {
        throw new FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    /* renamed from: e */
    public boolean mo119935e(String str, long j) {
        return false;
    }

    /* renamed from: f */
    public int mo119936f() {
        return 28;
    }

    /* renamed from: g */
    public boolean mo119937g(String str) {
        return false;
    }

    /* renamed from: h */
    public ReadableByteChannel mo119938h(String str) {
        throw new FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    /* renamed from: i */
    public ParcelFileDescriptor mo119939i(String str, String str2) {
        throw new FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    public Iterable<C86001b0> list(String str) {
        return null;
    }

    /* renamed from: m */
    public OutputStream mo119941m(String str, boolean z) {
        throw new FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    /* renamed from: o */
    public boolean mo119942o(String str, boolean z) {
        return false;
    }

    public InputStream openRead(String str) {
        throw new FileNotFoundException("Path '" + str + "' not found on NullFileSystem");
    }

    /* renamed from: p */
    public FileSystem.C116215a mo119944p(String str) {
        return null;
    }

    /* renamed from: q */
    public C86001b0 mo119945q(String str) {
        return null;
    }

    /* renamed from: t */
    public boolean mo119946t(String str, FileSystem.C85995c cVar, String str2) {
        return false;
    }

    /* renamed from: w */
    public String mo119947w(String str, boolean z) {
        return null;
    }

    /* renamed from: x */
    public boolean mo119948x(String str) {
        return false;
    }
}
