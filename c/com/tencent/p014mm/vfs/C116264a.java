package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.tencent.p014mm.vfs.C116297g0;
import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.p014mm.vfs.FileSystem;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.a */
public abstract class C116264a implements FileSystem.C85995c {

    /* renamed from: d */
    public final C116344z0.C116346b f348895d;

    public C116264a() {
        this.f348895d = null;
    }

    /* renamed from: B */
    public boolean mo177582B(String str, FileSystem.C85995c cVar, String str2) {
        return false;
    }

    /* renamed from: D */
    public boolean mo177583D(String str, FileSystem.C85995c cVar, String str2) {
        return true;
    }

    /* renamed from: F */
    public void mo177781F(int i, Object... objArr) {
        HashMap hashMap;
        if (this.f348895d != null) {
            if (objArr.length == 0) {
                hashMap = null;
            } else {
                HashMap hashMap2 = new HashMap(objArr.length / 2);
                int i2 = 0;
                while (i2 < objArr.length - 1) {
                    int i3 = i2 + 1;
                    Object obj = objArr[i2];
                    if (i3 >= objArr.length) {
                        break;
                    }
                    int i4 = i3 + 1;
                    hashMap2.put(obj.toString(), objArr[i3]);
                    i2 = i4;
                }
                hashMap = hashMap2;
            }
            C116297g0.C116298a aVar = (C116297g0.C116298a) this.f348895d;
            aVar.f349011b.mo177613a(aVar.f349010a, mo119930u(), i, hashMap);
        }
    }

    /* renamed from: a */
    public void mo119928a(CancellationSignal cancellationSignal) {
    }

    /* renamed from: b */
    public WritableByteChannel mo119932b(String str, boolean z) {
        return Channels.newChannel(mo119941m(str, z));
    }

    /* renamed from: d */
    public long mo119934d(String str, FileSystem.C85995c cVar, String str2, boolean z) {
        FileSystem.C85995c q = C116299g2.m163861q(this, str, 2);
        FileSystem.C85995c q2 = C116299g2.m163861q(cVar, str2, 1);
        if (q != null && q2 != null) {
            return q instanceof C116264a ? ((C116264a) q).mo177589z(str, q2, str2, z) : q.mo119934d(str, q2, str2, z);
        }
        throw new IOException("Cannot resolve delegate filesystem.");
    }

    /* renamed from: h */
    public ReadableByteChannel mo119938h(String str) {
        return Channels.newChannel(openRead(str));
    }

    /* renamed from: i */
    public ParcelFileDescriptor mo119939i(String str, String str2) {
        throw new FileNotFoundException("Not supported by the filesystem.");
    }

    /* renamed from: t */
    public boolean mo119946t(String str, FileSystem.C85995c cVar, String str2) {
        FileSystem.C85995c q = C116299g2.m163861q(this, str, 2);
        FileSystem.C85995c q2 = C116299g2.m163861q(cVar, str2, 1);
        if (q == null || q2 == null) {
            throw new IOException("Cannot resolve delegate filesystem.");
        } else if (!(q2 instanceof C116264a) || ((C116264a) q2).mo177583D(str2, q, str)) {
            return q instanceof C116264a ? ((C116264a) q).mo177582B(str, q2, str2) : q.mo119946t(str, q2, str2);
        } else {
            return false;
        }
    }

    public String toString() {
        return "State -> " + mo119930u();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.nio.channels.ReadableByteChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.nio.channels.ReadableByteChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.nio.channels.ReadableByteChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.nio.channels.ReadableByteChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.nio.channels.WritableByteChannel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.nio.channels.ReadableByteChannel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo177589z(java.lang.String r9, com.tencent.p014mm.vfs.FileSystem.C85995c r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            java.util.regex.Pattern r12 = com.tencent.p014mm.vfs.C116299g2.f349012a
            r12 = 0
            java.nio.channels.ReadableByteChannel r11 = r10.mo119938h(r11)     // Catch:{ all -> 0x0063 }
            r0 = 0
            java.nio.channels.WritableByteChannel r9 = r8.mo119932b(r9, r0)     // Catch:{ all -> 0x005f }
            int r10 = r10.mo119936f()     // Catch:{ all -> 0x005c }
            int r12 = r8.mo119936f()     // Catch:{ all -> 0x005c }
            r10 = r10 & r12
            r10 = r10 & 2
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r10 == 0) goto L_0x0020
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r12)     // Catch:{ all -> 0x005c }
            goto L_0x0024
        L_0x0020:
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r12)     // Catch:{ all -> 0x005c }
        L_0x0024:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10.clear()     // Catch:{ all -> 0x005c }
            r2 = 0
        L_0x002e:
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x0055
            long r4 = r0 - r2
            int r12 = r10.capacity()     // Catch:{ all -> 0x005c }
            long r6 = (long) r12     // Catch:{ all -> 0x005c }
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x0041
            int r12 = (int) r4     // Catch:{ all -> 0x005c }
            r10.limit(r12)     // Catch:{ all -> 0x005c }
        L_0x0041:
            int r12 = r11.read(r10)     // Catch:{ all -> 0x005c }
            if (r12 >= 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            r10.flip()     // Catch:{ all -> 0x005c }
            int r12 = r9.write(r10)     // Catch:{ all -> 0x005c }
            long r4 = (long) r12     // Catch:{ all -> 0x005c }
            long r2 = r2 + r4
            r10.clear()     // Catch:{ all -> 0x005c }
            goto L_0x002e
        L_0x0055:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r11)
            com.tencent.p014mm.vfs.C116299g2.m163847c(r9)
            return r2
        L_0x005c:
            r10 = move-exception
            r12 = r9
            goto L_0x0060
        L_0x005f:
            r10 = move-exception
        L_0x0060:
            r9 = r12
            r12 = r11
            goto L_0x0065
        L_0x0063:
            r10 = move-exception
            r9 = r12
        L_0x0065:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r12)
            com.tencent.p014mm.vfs.C116299g2.m163847c(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116264a.mo177589z(java.lang.String, com.tencent.mm.vfs.FileSystem$c, java.lang.String, boolean):long");
    }

    public C116264a(FileSystem fileSystem, Map<String, Object> map) {
        C116297g0.C116298a aVar = null;
        if (!(fileSystem instanceof AbstractFileSystem)) {
            this.f348895d = null;
            return;
        }
        C116344z0 z0Var = ((AbstractFileSystem) fileSystem).f348691d;
        if (z0Var != null) {
            C116297g0 g0Var = (C116297g0) z0Var;
            String a = g0Var.f349008a.mo177821a(map);
            if (a != null) {
                aVar = new C116297g0.C116298a(a, g0Var.f349009b);
            }
        }
        this.f348895d = aVar;
    }
}
