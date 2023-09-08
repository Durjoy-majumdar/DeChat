package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.memory.C92702a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.facedetect.model.h */
public class C105224h {

    /* renamed from: b */
    public static volatile C105224h f312604b;

    /* renamed from: c */
    public static final Object f312605c = new Object();

    /* renamed from: a */
    public List<C105225a> f312606a = null;

    /* renamed from: com.tencent.mm.plugin.facedetect.model.h$a */
    public class C105225a {

        /* renamed from: a */
        public C105226b f312607a;

        /* renamed from: b */
        public byte[] f312608b;

        public C105225a(C105224h hVar, C105226b bVar) {
            this.f312607a = bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C105225a)) {
                return false;
            }
            return this.f312607a.equals(((C105225a) obj).f312607a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.model.h$b */
    public interface C105226b {
        /* renamed from: a */
        void mo149592a(byte[] bArr);

        /* renamed from: b */
        C92702a<byte[]> mo149593b();
    }

    /* renamed from: b */
    public static final C105224h m141309b() {
        C105224h hVar;
        if (f312604b != null) {
            return f312604b;
        }
        synchronized (f312605c) {
            if (f312604b == null) {
                f312604b = new C105224h();
            }
            hVar = f312604b;
        }
        return hVar;
    }

    /* renamed from: a */
    public synchronized void mo149588a(C105226b bVar) {
        if (bVar == null) {
            Log.m105928w("MicroMsg.FaceCameraDataCallbackHolder", "hy: invalid callbacker");
            return;
        }
        synchronized (f312605c) {
            if (this.f312606a == null) {
                this.f312606a = Collections.synchronizedList(new ArrayList(5));
            }
            this.f312606a.add(new C105225a(this, bVar));
        }
    }

    /* renamed from: c */
    public void mo149589c(byte[] bArr) {
        synchronized (f312605c) {
            Log.m105926v("MicroMsg.FaceCameraDataCallbackHolder", "hy: publish data:" + bArr);
            List<C105225a> list = this.f312606a;
            if (list != null) {
                if (list.size() != 0) {
                    if (bArr != null) {
                        if (bArr.length != 0) {
                            for (C105225a next : this.f312606a) {
                                int length = bArr.length;
                                byte[] m = next.f312607a.mo149593b().mo126905m(Integer.valueOf(length));
                                next.f312608b = m;
                                System.arraycopy(bArr, 0, m, 0, length);
                                next.f312607a.mo149592a(next.f312608b);
                            }
                            return;
                        }
                    }
                    Log.m105928w("MicroMsg.FaceCameraDataCallbackHolder", "hy: null camera data got");
                    return;
                }
            }
            Log.m105928w("MicroMsg.FaceCameraDataCallbackHolder", "hy: nothing's listening to preview data");
        }
    }

    /* renamed from: d */
    public void mo149590d(C105226b bVar) {
        synchronized (f312605c) {
            List<C105225a> list = this.f312606a;
            if (list != null) {
                list.remove(new C105225a(this, bVar));
            }
        }
    }
}
