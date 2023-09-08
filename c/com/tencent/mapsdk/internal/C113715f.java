package com.tencent.mapsdk.internal;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: com.tencent.mapsdk.internal.f */
public class C113715f extends C113647e {

    /* renamed from: h */
    public static final int f340174h = 4;

    /* renamed from: i */
    public static HashMap<String, byte[]> f340175i;

    /* renamed from: j */
    public static HashMap<String, HashMap<String, byte[]>> f340176j;

    /* renamed from: g */
    public C113797h f340177g;

    /* renamed from: k */
    private int f340178k = 0;

    /* renamed from: l */
    private int f340179l = 0;

    public C113715f() {
        C113797h hVar = new C113797h();
        this.f340177g = hVar;
        hVar.f340452a = 2;
    }

    /* renamed from: h */
    private int m156769h() {
        return this.f340177g.f340452a;
    }

    /* renamed from: i */
    private int m156770i() {
        return this.f340178k;
    }

    /* renamed from: j */
    private void m156771j() {
        C113953m mVar = new C113953m(this.f340177g.f340458g);
        mVar.mo172380a(this.f339930c);
        if (f340175i == null) {
            HashMap<String, byte[]> hashMap = new HashMap<>();
            f340175i = hashMap;
            hashMap.put("", new byte[0]);
        }
        this.f340045e = mVar.mo172385a(f340175i, 0, false);
    }

    /* renamed from: k */
    private void m156772k() {
        C113953m mVar = new C113953m(this.f340177g.f340458g);
        mVar.mo172380a(this.f339930c);
        if (f340176j == null) {
            f340176j = new HashMap<>();
            HashMap hashMap = new HashMap();
            hashMap.put("", new byte[0]);
            f340176j.put("", hashMap);
        }
        this.f339928a = mVar.mo172385a(f340176j, 0, false);
        this.f339929b = new HashMap<>();
    }

    /* renamed from: l */
    private String m156773l() {
        return this.f340177g.f340456e;
    }

    /* renamed from: m */
    private String m156774m() {
        return this.f340177g.f340457f;
    }

    /* renamed from: n */
    private int m156775n() {
        return this.f340177g.f340455d;
    }

    /* renamed from: o */
    private C113715f m156776o() {
        C113715f fVar = new C113715f();
        C113797h hVar = this.f340177g;
        fVar.f340177g.f340455d = hVar.f340455d;
        fVar.mo172057c(hVar.f340456e);
        fVar.mo172058d(this.f340177g.f340457f);
        fVar.mo171893a(this.f339930c);
        fVar.f340177g.f340452a = this.f340177g.f340452a;
        return fVar;
    }

    /* renamed from: p */
    private byte[] m156777p() {
        C113979n nVar = new C113979n(0);
        nVar.mo172509a(this.f339930c);
        nVar.mo172519a(this.f339928a, 0);
        byte[] a = C114095q.m158994a(nVar.f340970a);
        C113979n nVar2 = new C113979n(0);
        nVar2.mo172509a(this.f339930c);
        nVar2.mo172520a(this.f340177g.f340452a, 1);
        nVar2.mo172510a(this.f340177g.f340453b, 2);
        nVar2.mo172513a(this.f340177g.f340455d, 3);
        nVar2.mo172513a(this.f340177g.f340454c, 4);
        nVar2.mo172513a(this.f340179l, 5);
        nVar2.mo172522a(a, 6);
        nVar2.mo172519a(this.f340177g.f340461j, 7);
        return C114095q.m158994a(nVar2.f340970a);
    }

    /* renamed from: q */
    private int m156778q() {
        return this.f340179l;
    }

    /* renamed from: a */
    public final <T> void mo171894a(String str, T t) {
        if (!str.startsWith(".")) {
            super.mo171894a(str, t);
            return;
        }
        throw new IllegalArgumentException("put name can not startwith . , now is ".concat(str));
    }

    /* renamed from: b */
    public final void mo171983b(byte[] bArr) {
        if (bArr.length >= 4) {
            try {
                C113953m mVar = new C113953m(bArr, (byte) 0);
                mVar.mo172380a(this.f339930c);
                this.f340177g.readFrom(mVar);
                m156771j();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("decode package must include size head");
        }
    }

    /* renamed from: c */
    public final void mo171984c(byte[] bArr) {
        if (bArr.length >= 4) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            allocate.put(bArr2).flip();
            this.f340178k = allocate.getInt();
            try {
                C113953m mVar = new C113953m(bArr, (byte) 0);
                mVar.mo172380a(this.f339930c);
                this.f340177g.readFrom(mVar);
                m156772k();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("decode package must include size head");
        }
    }

    /* renamed from: d */
    public final void mo172058d(String str) {
        this.f340177g.f340457f = str;
    }

    /* renamed from: f */
    public final byte[] mo171903f() {
        C113797h hVar = this.f340177g;
        if (hVar.f340452a == 2) {
            String str = hVar.f340456e;
            if (str == null || str.equals("")) {
                throw new IllegalArgumentException("servantName can not is null");
            }
            String str2 = this.f340177g.f340457f;
            if (str2 == null || str2.equals("")) {
                throw new IllegalArgumentException("funcName can not is null");
            }
        } else {
            if (hVar.f340456e == null) {
                hVar.f340456e = "";
            }
            if (hVar.f340457f == null) {
                hVar.f340457f = "";
            }
        }
        C113979n nVar = new C113979n(0);
        nVar.mo172509a(this.f339930c);
        short s = this.f340177g.f340452a;
        if (s == 2 || s == 1) {
            nVar.mo172519a(this.f339928a, 0);
        } else {
            nVar.mo172519a(this.f340045e, 0);
        }
        this.f340177g.f340458g = C114095q.m158994a(nVar.f340970a);
        C113979n nVar2 = new C113979n(0);
        nVar2.mo172509a(this.f339930c);
        this.f340177g.writeTo(nVar2);
        byte[] a = C114095q.m158994a(nVar2.f340970a);
        int length = a.length + 4;
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length).put(a).flip();
        return allocate.array();
    }

    /* renamed from: g */
    public final void mo171985g() {
        super.mo171985g();
        this.f340177g.f340452a = 3;
    }

    /* renamed from: a */
    public final void mo171895a(byte[] bArr) {
        if (bArr.length >= 4) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 0, 4);
            allocate.put(bArr2).flip();
            this.f340178k = allocate.getInt();
            try {
                C113953m mVar = new C113953m(bArr, (byte) 0);
                mVar.mo172380a(this.f339930c);
                this.f340177g.readFrom(mVar);
                if (this.f340177g.f340452a == 3) {
                    m156771j();
                    return;
                }
                this.f340045e = null;
                m156772k();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("decode package must include size head");
        }
    }

    private C113715f(boolean z) {
        C113797h hVar = new C113797h();
        this.f340177g = hVar;
        if (z) {
            mo171985g();
        } else {
            hVar.f340452a = 2;
        }
    }

    /* renamed from: b */
    private void m156768b(int i) {
        this.f340179l = i;
    }

    /* renamed from: c */
    public final void mo172057c(String str) {
        this.f340177g.f340456e = str;
    }

    /* renamed from: a */
    private void m156764a(int i) {
        this.f340177g.f340455d = i;
    }

    /* renamed from: a */
    private void m156766a(C113979n nVar) {
        this.f340177g.writeTo(nVar);
    }

    /* renamed from: a */
    private void m156765a(C113953m mVar) {
        this.f340177g.readFrom(mVar);
    }

    /* renamed from: a */
    private void m156767a(StringBuilder sb, int i) {
        this.f340177g.display(sb, i);
    }
}
