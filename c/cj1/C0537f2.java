package cj1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import pe3.C89349b;
import te3.C49765hx0;
import te3.C50728ot0;
import te3.C51025qx0;
import te3.C51741vu0;
import te3.C52013xs0;
import te3.C52303zt0;

/* renamed from: cj1.f2 */
public final class C0537f2 implements C0581o5, C0584p5 {

    /* renamed from: a */
    public C52013xs0 f1301a;

    /* renamed from: b */
    public boolean f1302b;

    /* renamed from: c */
    public int f1303c;

    /* renamed from: d */
    public boolean f1304d;

    /* renamed from: e */
    public boolean f1305e;

    public C0537f2(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        this.f1301a = xs02;
    }

    /* renamed from: a */
    public boolean mo567a() {
        return this.f1305e;
    }

    /* renamed from: b */
    public void mo568b(int i) {
        this.f1303c = i;
    }

    /* renamed from: c */
    public boolean mo569c() {
        return this.f1302b;
    }

    /* renamed from: d */
    public void mo570d(boolean z) {
        this.f1302b = z;
    }

    /* renamed from: e */
    public String mo571e() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1301a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: f */
    public String mo572f() {
        String str = this.f1301a.f144915t;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo573g() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1301a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    public String getContent() {
        int i = this.f1301a.f144903e;
        if (i == 20001) {
            return "";
        }
        byte[] bArr = null;
        if (i == 20002) {
            C51741vu0 vu02 = new C51741vu0();
            C89349b bVar = this.f1301a.f144906h;
            if (bVar != null) {
                bArr = bVar.mo123703f();
            }
            vu02.parseFrom(bArr);
            return vu02.f143698d;
        } else if (i == 20032 || i == 20034) {
            C52303zt0 zt02 = new C52303zt0();
            C89349b bVar2 = this.f1301a.f144906h;
            if (bVar2 != null) {
                bArr = bVar2.mo123703f();
            }
            zt02.parseFrom(bArr);
            return zt02.f146211d;
        } else if (i != 20036) {
            return "";
        } else {
            C51025qx0 qx02 = new C51025qx0();
            C89349b bVar3 = this.f1301a.f144906h;
            if (bVar3 != null) {
                bArr = bVar3.mo123703f();
            }
            qx02.parseFrom(bArr);
            return qx02.f140595d;
        }
    }

    public int getLikeCount() {
        return this.f1303c;
    }

    public int getMsgTime() {
        return 0;
    }

    public long getSeq() {
        return this.f1301a.f144913r;
    }

    public int getType() {
        return this.f1301a.f144903e;
    }

    /* renamed from: h */
    public boolean mo578h() {
        return this.f1301a.f144911p == 1;
    }

    /* renamed from: i */
    public C49765hx0 mo579i() {
        return this.f1301a.f144914s;
    }

    /* renamed from: j */
    public String mo580j() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1301a.f144902d;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: k */
    public C49765hx0 mo581k() {
        return this.f1301a.f144902d;
    }

    /* renamed from: l */
    public void mo582l(boolean z) {
        this.f1304d = z;
    }

    /* renamed from: m */
    public boolean mo583m() {
        return this.f1304d;
    }

    /* renamed from: n */
    public int mo584n() {
        return this.f1301a.f144912q;
    }

    /* renamed from: o */
    public String mo585o() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1301a.f144902d;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    /* renamed from: p */
    public void mo586p(boolean z) {
        this.f1305e = z;
    }

    /* renamed from: q */
    public Object mo563q() {
        int i = this.f1301a.f144903e;
        byte[] bArr = null;
        if (i == 20034) {
            C52303zt0 zt02 = new C52303zt0();
            C89349b bVar = this.f1301a.f144906h;
            if (bVar != null) {
                bArr = bVar.mo123703f();
            }
            zt02.parseFrom(bArr);
            return zt02.f146212e;
        } else if (i != 20041) {
            return null;
        } else {
            C50728ot0 ot02 = new C50728ot0();
            C89349b bVar2 = this.f1301a.f144906h;
            if (bVar2 != null) {
                bArr = bVar2.mo123703f();
            }
            ot02.parseFrom(bArr);
            return ot02;
        }
    }
}
