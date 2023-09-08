package cj1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import pe3.C89349b;
import te3.C48903bt0;
import te3.C49765hx0;
import te3.C52013xs0;

/* renamed from: cj1.l5 */
public final class C0568l5 implements C0581o5 {

    /* renamed from: a */
    public C52013xs0 f1366a;

    public C0568l5(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        this.f1366a = xs02;
    }

    /* renamed from: e */
    public String mo571e() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1366a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: f */
    public String mo572f() {
        String str = this.f1366a.f144915t;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo573g() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1366a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    public String getContent() {
        C89349b bVar = this.f1366a.f144906h;
        if (bVar == null) {
            return "";
        }
        C48903bt0 bt02 = new C48903bt0();
        try {
            bt02.parseFrom(bVar.mo123703f());
        } catch (Exception e) {
            Log.printDebugStack("safeParser", "", e);
        }
        String str = bt02.f131298d;
        return str == null ? "" : str;
    }

    public int getMsgTime() {
        return 0;
    }

    public long getSeq() {
        return this.f1366a.f144913r;
    }

    public int getType() {
        return this.f1366a.f144903e;
    }

    /* renamed from: h */
    public boolean mo578h() {
        return this.f1366a.f144911p == 1;
    }

    /* renamed from: i */
    public C49765hx0 mo579i() {
        return this.f1366a.f144914s;
    }

    /* renamed from: j */
    public String mo580j() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1366a.f144902d;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: k */
    public C49765hx0 mo581k() {
        return this.f1366a.f144902d;
    }

    /* renamed from: n */
    public int mo584n() {
        return this.f1366a.f144912q;
    }

    /* renamed from: o */
    public String mo585o() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1366a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    /* renamed from: q */
    public Object mo563q() {
        return null;
    }
}
