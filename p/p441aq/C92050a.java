package p441aq;

import android.content.res.Resources;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p008bq.C92279g0;
import q90.C101062d;
import qz1.C101325b;
import qz1.C101326c;
import qz1.C22180d;

@C86522b
/* renamed from: aq.a */
public class C92050a extends C86301e implements C92279g0 {
    /* renamed from: C9 */
    public C101325b mo126015C9(String str, InputStream inputStream) {
        C101326c d = C101326c.m132949d();
        d.getClass();
        C101325b bVar = null;
        if (inputStream == null) {
            return null;
        }
        Log.m105919d("MicroMsg.GIF.MMAnimateDrawableCacheMgr", "stream key:%s", str);
        if (((C101062d) d.f296842b).get(str) != null) {
            bVar = (C101325b) ((WeakReference) ((C101062d) d.f296842b).get(str)).get();
        }
        if (bVar != null) {
            return bVar;
        }
        C22180d dVar = new C22180d(inputStream);
        ((C101062d) d.f296842b).put(str, new WeakReference(dVar));
        return dVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: qz1.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: EH */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qz1.C101328e mo126016EH(java.lang.String r13, android.content.Context r14, boolean r15, boolean r16, boolean r17, int r18, int[] r19, java.lang.String r20) {
        /*
            r12 = this;
            r0 = r13
            qz1.c r1 = qz1.C101326c.m132949d()
            r1.getClass()
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            r3 = 0
            if (r2 == 0) goto L_0x0010
            goto L_0x005c
        L_0x0010:
            sg.g<java.lang.String, java.lang.ref.WeakReference<qz1.e>> r2 = r1.f296841a
            q90.d r2 = (q90.C101062d) r2
            java.lang.Object r2 = r2.get(r13)
            if (r2 == 0) goto L_0x003b
            sg.g<java.lang.String, java.lang.ref.WeakReference<qz1.e>> r2 = r1.f296841a
            q90.d r2 = (q90.C101062d) r2
            java.lang.Object r2 = r2.get(r13)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L_0x003b
            sg.g<java.lang.String, java.lang.ref.WeakReference<qz1.e>> r2 = r1.f296841a
            q90.d r2 = (q90.C101062d) r2
            java.lang.Object r2 = r2.get(r13)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            r3 = r2
            qz1.e r3 = (qz1.C101328e) r3
        L_0x003b:
            if (r3 != 0) goto L_0x005c
            qz1.e r2 = new qz1.e
            r4 = r2
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            sg.g<java.lang.String, java.lang.ref.WeakReference<qz1.e>> r1 = r1.f296841a
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r2)
            q90.d r1 = (q90.C101062d) r1
            r1.put(r13, r3)
            r3 = r2
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p441aq.C92050a.mo126016EH(java.lang.String, android.content.Context, boolean, boolean, boolean, int, int[], java.lang.String):qz1.e");
    }

    public C101325b Vl0(String str, byte[] bArr) {
        return C101326c.m132949d().mo140815c(str, bArr);
    }

    public C101325b Zc0(String str, Resources resources, int i) {
        C101326c d = C101326c.m132949d();
        C101325b bVar = ((C101062d) d.f296842b).get(str) != null ? (C101325b) ((WeakReference) ((C101062d) d.f296842b).get(str)).get() : null;
        if (bVar != null) {
            return bVar;
        }
        C22180d dVar = new C22180d(resources, i, false);
        ((C101062d) d.f296842b).put(str, new WeakReference(dVar));
        return dVar;
    }

    /* renamed from: w */
    public C101325b mo126019w(String str, String str2) {
        return C101326c.m132949d().mo140814b(str, str2);
    }
}
