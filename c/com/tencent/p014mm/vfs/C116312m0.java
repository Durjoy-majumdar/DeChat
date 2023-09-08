package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.tencent.mm.vfs.m0 */
public class C116312m0 implements C116281f0.C116286f {

    /* renamed from: b */
    public static final C116312m0 f349030b = new C116312m0();

    /* renamed from: a */
    public final LinkedHashSet<C116281f0.C116286f> f349031a = new LinkedHashSet<>();

    /* renamed from: a */
    public boolean mo177782a(String str, FileSystem.C85995c cVar, CancellationSignal cancellationSignal) {
        boolean z;
        synchronized (this) {
            Iterator<C116281f0.C116286f> it = this.f349031a.iterator();
            z = true;
            while (it.hasNext()) {
                z &= it.next().mo177782a(str, cVar, cancellationSignal);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo177783b(CancellationSignal cancellationSignal) {
        synchronized (this) {
            Iterator<C116281f0.C116286f> it = this.f349031a.iterator();
            while (it.hasNext()) {
                it.next().mo177783b(cancellationSignal);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        }
    }

    /* renamed from: c */
    public void mo177784c(boolean z, boolean z2, CancellationSignal cancellationSignal) {
        synchronized (this) {
            Iterator<C116281f0.C116286f> it = this.f349031a.iterator();
            while (it.hasNext()) {
                it.next().mo177784c(z, z2, cancellationSignal);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        }
    }
}
