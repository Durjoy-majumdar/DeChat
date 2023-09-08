package nw3;

import as3.C103860b1;
import as3.C103863c1;
import bs3.C104161b;
import bs3.C104166f;

/* renamed from: nw3.d */
public final class C109777d {

    /* renamed from: a */
    public C103860b1 f328542a;

    /* renamed from: b */
    public C103863c1 f328543b;

    public C109777d(C103860b1 b1Var) {
        mo161025b(b1Var);
    }

    /* renamed from: a */
    public String mo161024a() {
        C103860b1 b1Var = this.f328542a;
        return b1Var != null ? b1Var.f306906s : "";
    }

    /* renamed from: b */
    public void mo161025b(C103860b1 b1Var) {
        if (b1Var == null) {
            C104161b.m138997f("tagorewang:TalkRoomMember", "set null info");
            return;
        }
        this.f328542a = b1Var;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C109777d)) {
            return false;
        }
        return C104166f.m139001a(mo161024a(), ((C109777d) obj).mo161024a());
    }

    public int hashCode() {
        String a = mo161024a();
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }

    public String toString() {
        int i;
        String str;
        C103860b1 b1Var = this.f328542a;
        if (b1Var != null) {
            i = b1Var.f306889b;
        } else {
            C103863c1 c1Var = this.f328543b;
            i = c1Var != null ? c1Var.f306940b : 0;
        }
        if (b1Var == null || this.f328543b == null) {
            return "invlaid TalkRoomMember which uuid is " + i;
        }
        StringBuilder sb = new StringBuilder();
        C103860b1 b1Var2 = this.f328542a;
        String str2 = "null";
        if (b1Var2 == null) {
            str = str2;
        } else {
            str = "VoiceGroupMem" + " uuid:" + b1Var2.f306889b + " openClientId:" + b1Var2.f306897j + " invite uuid: " + b1Var2.f306890c + " member id:" + b1Var2.f306893f + " status: " + b1Var2.f306891d + " reason: " + b1Var2.f306892e;
        }
        sb.append(str);
        sb.append(" ");
        C103863c1 c1Var2 = this.f328543b;
        if (c1Var2 != null) {
            str2 = "VoiceGroupUsrProfile" + " uuid: " + c1Var2.f306940b + " user name: " + c1Var2.f306941c + " head url: " + c1Var2.f306942d;
        }
        sb.append(str2);
        return sb.toString();
    }

    public C109777d(C103860b1 b1Var, C103863c1 c1Var) {
        mo161025b(b1Var);
        if (c1Var == null) {
            C104161b.m138997f("tagorewang:TalkRoomMember", "set null profile");
            return;
        }
        this.f328543b = c1Var;
    }
}
