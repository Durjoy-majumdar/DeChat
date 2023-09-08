package com.tencent.p014mm.app;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114773i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import zt3.C119157j;

/* renamed from: com.tencent.mm.app.g0 */
public final class C114663g0 {

    /* renamed from: a */
    public static final C114770g[] f343521a = {null};

    /* renamed from: b */
    public static final byte[] f343522b = new byte[0];

    /* renamed from: c */
    public static final Map<Integer, C114667d> f343523c = new HashMap();

    /* renamed from: d */
    public static final C114773i f343524d = new C114665b();

    /* renamed from: com.tencent.mm.app.g0$a */
    public class C114664a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114666c f343525d;

        /* renamed from: e */
        public final /* synthetic */ String f343526e;

        public C114664a(C114666c cVar, String str) {
            this.f343525d = cVar;
            this.f343526e = str;
        }

        public void run() {
            this.f343525d.mo105672a(this.f343526e);
        }
    }

    /* renamed from: com.tencent.mm.app.g0$b */
    public class C114665b extends C114773i.C114774a {
        public void c40(int i, int i2, long j, long j2) {
            int i3;
            C114667d dVar;
            int i4 = i2;
            boolean z = true;
            if (i4 < 0) {
                Log.m105921e("MicroMsg.IpxxUploadHelper", "Bad percent: %s, observerId: %s", Integer.valueOf(i2), Integer.valueOf(i));
                synchronized (C114663g0.f343522b) {
                    C114667d dVar2 = (C114667d) ((HashMap) C114663g0.f343523c).remove(Integer.valueOf(i));
                    if (dVar2 != null) {
                        C114663g0.m161242b(dVar2.f343528b, dVar2.f343527a);
                    }
                }
                return;
            }
            if (i4 > 100) {
                Log.m105929w("MicroMsg.IpxxUploadHelper", "Bad percent: %s, observerId: %s", Integer.valueOf(i2), Integer.valueOf(i));
                i3 = 100;
            } else {
                i3 = i4;
            }
            synchronized (C114663g0.f343522b) {
                if (i3 != 100) {
                    z = false;
                }
                if (z) {
                    dVar = (C114667d) ((HashMap) C114663g0.f343523c).remove(Integer.valueOf(i));
                } else {
                    dVar = (C114667d) ((HashMap) C114663g0.f343523c).get(Integer.valueOf(i));
                }
                if (dVar != null) {
                    C114666c cVar = dVar.f343528b;
                    String str = dVar.f343527a;
                    if (cVar != null) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C114662f0(cVar, str, i3, j, j2));
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.app.g0$c */
    public interface C114666c {
        /* renamed from: a */
        void mo105672a(String str);

        /* renamed from: b */
        void mo105673b(String str, int i, long j, long j2);
    }

    /* renamed from: com.tencent.mm.app.g0$d */
    public static class C114667d {

        /* renamed from: a */
        public final String f343527a;

        /* renamed from: b */
        public final C114666c f343528b;

        public C114667d(int i, String str, C114666c cVar) {
            this.f343527a = str;
            this.f343528b = cVar;
        }
    }

    /* renamed from: a */
    public static void m161241a(C114770g gVar) {
        C114770g[] gVarArr = f343521a;
        synchronized (gVarArr) {
            gVar.mo55477i2(f343524d);
            gVarArr[0] = gVar;
        }
    }

    /* renamed from: b */
    public static void m161242b(C114666c cVar, String str) {
        if (cVar != null) {
            ((C119157j) C119157j.f356862d).mo183895z(new C114664a(cVar, str));
        }
    }

    /* renamed from: c */
    public static void m161243c(String str, int i, int i2, String str2, String str3, C114666c cVar) {
        C114770g gVar;
        C114770g[] gVarArr = f343521a;
        synchronized (gVarArr) {
            gVar = gVarArr[0];
        }
        if (gVar == null) {
            Log.m105920e("MicroMsg.IpxxUploadHelper", "Please call init first.");
            m161242b(cVar, str);
            return;
        }
        synchronized (f343522b) {
            try {
                int v5 = gVar.mo55492v5(str, i, (long) i2, Util.nullAsNil(str3), Util.nullAsNil(str2));
                if (v5 >= 0) {
                    C114667d dVar = new C114667d(v5, str, cVar);
                    ((HashMap) f343523c).put(Integer.valueOf(v5), dVar);
                } else {
                    Log.m105920e("MicroMsg.IpxxUploadHelper", "Fail to call uploadFile.");
                    m161242b(cVar, str);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.IpxxUploadHelper", th, "Error happened.", new Object[0]);
                ((HashMap) f343523c).remove(-1);
                m161242b(cVar, str);
            }
        }
    }

    /* renamed from: d */
    public static void m161244d(int[] iArr, boolean z, long j, int i, int i2, String str, C114666c cVar) {
        C114770g gVar;
        C114666c cVar2 = cVar;
        C114770g[] gVarArr = f343521a;
        synchronized (gVarArr) {
            gVar = gVarArr[0];
        }
        if (gVar == null) {
            Log.m105920e("MicroMsg.IpxxUploadHelper", "Please call init first.");
            m161242b(cVar2, (String) null);
            return;
        }
        synchronized (f343522b) {
            try {
                int S1 = gVar.mo55458S1(iArr, z, j, i, i2, Util.nullAsNil(str));
                if (S1 >= 0) {
                    C114667d dVar = new C114667d(S1, (String) null, cVar2);
                    ((HashMap) f343523c).put(Integer.valueOf(S1), dVar);
                } else {
                    Log.m105920e("MicroMsg.IpxxUploadHelper", "Fail to call uploadLog.");
                    m161242b(cVar2, (String) null);
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.IpxxUploadHelper", th, "Error happened.", new Object[0]);
                ((HashMap) f343523c).remove(-1);
                m161242b(cVar2, (String) null);
            }
        }
    }
}
