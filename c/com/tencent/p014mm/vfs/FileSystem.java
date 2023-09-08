package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;

/* renamed from: com.tencent.mm.vfs.FileSystem */
public interface FileSystem extends Parcelable, C116296g<C85995c> {

    /* renamed from: com.tencent.mm.vfs.FileSystem$b */
    public interface C85994b extends C85995c {
        /* renamed from: j */
        List<C85995c> mo119931j();
    }

    /* renamed from: com.tencent.mm.vfs.FileSystem$c */
    public interface C85995c {
        /* renamed from: a */
        void mo119928a(CancellationSignal cancellationSignal);

        /* renamed from: b */
        WritableByteChannel mo119932b(String str, boolean z);

        /* renamed from: c */
        boolean mo119933c(String str);

        /* renamed from: d */
        long mo119934d(String str, C85995c cVar, String str2, boolean z);

        /* renamed from: e */
        boolean mo119935e(String str, long j);

        /* renamed from: f */
        int mo119936f();

        /* renamed from: g */
        boolean mo119937g(String str);

        /* renamed from: h */
        ReadableByteChannel mo119938h(String str);

        /* renamed from: i */
        ParcelFileDescriptor mo119939i(String str, String str2);

        Iterable<C86001b0> list(String str);

        /* renamed from: m */
        OutputStream mo119941m(String str, boolean z);

        /* renamed from: o */
        boolean mo119942o(String str, boolean z);

        InputStream openRead(String str);

        /* renamed from: p */
        C116215a mo119944p(String str);

        /* renamed from: q */
        C86001b0 mo119945q(String str);

        /* renamed from: t */
        boolean mo119946t(String str, C85995c cVar, String str2);

        /* renamed from: u */
        FileSystem mo119930u();

        /* renamed from: w */
        String mo119947w(String str, boolean z);

        /* renamed from: x */
        boolean mo119948x(String str);
    }

    /* renamed from: com.tencent.mm.vfs.FileSystem$a */
    public static class C116215a {

        /* renamed from: a */
        public long f348759a;

        /* renamed from: b */
        public long f348760b;

        /* renamed from: c */
        public long f348761c;
    }
}
