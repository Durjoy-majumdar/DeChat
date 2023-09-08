package k12;

import java.util.Iterator;
import java.util.LinkedList;
import pe3.C89349b;
import te3.C50550ni3;

/* renamed from: k12.c */
public class C108828c {

    /* renamed from: A */
    public C89349b f325883A;

    /* renamed from: B */
    public LinkedList<C50550ni3> f325884B = new LinkedList<>();

    /* renamed from: C */
    public LinkedList<C50550ni3> f325885C = new LinkedList<>();

    /* renamed from: D */
    public int f325886D = 999;

    /* renamed from: E */
    public LinkedList<C108829d> f325887E = new LinkedList<>();

    /* renamed from: F */
    public String f325888F;

    /* renamed from: G */
    public String f325889G;

    /* renamed from: H */
    public String f325890H;

    /* renamed from: I */
    public String f325891I;

    /* renamed from: J */
    public String f325892J;

    /* renamed from: K */
    public String f325893K;

    /* renamed from: L */
    public int f325894L;

    /* renamed from: M */
    public boolean f325895M = false;

    /* renamed from: a */
    public int f325896a;

    /* renamed from: b */
    public long f325897b;

    /* renamed from: c */
    public long f325898c;

    /* renamed from: d */
    public int f325899d;

    /* renamed from: e */
    public int f325900e;

    /* renamed from: f */
    public int f325901f;

    /* renamed from: g */
    public int f325902g;

    /* renamed from: h */
    public String f325903h;

    /* renamed from: i */
    public int f325904i;

    /* renamed from: j */
    public String f325905j;

    /* renamed from: k */
    public int f325906k;

    /* renamed from: l */
    public int f325907l;

    /* renamed from: m */
    public int f325908m;

    /* renamed from: n */
    public int f325909n;

    /* renamed from: o */
    public int f325910o;

    /* renamed from: p */
    public boolean f325911p = false;

    /* renamed from: q */
    public boolean f325912q = false;

    /* renamed from: r */
    public boolean f325913r = false;

    /* renamed from: s */
    public boolean f325914s = true;

    /* renamed from: t */
    public int f325915t = 0;

    /* renamed from: u */
    public int f325916u;

    /* renamed from: v */
    public int f325917v;

    /* renamed from: w */
    public int f325918w;

    /* renamed from: x */
    public C89349b f325919x;

    /* renamed from: y */
    public int f325920y;

    /* renamed from: z */
    public int f325921z;

    /* renamed from: a */
    public int mo159937a() {
        LinkedList<C108829d> linkedList = this.f325887E;
        return (linkedList == null || linkedList.size() <= 0) ? this.f325908m : this.f325887E.get(0).f325922a;
    }

    /* renamed from: b */
    public int mo159938b() {
        LinkedList<C108829d> linkedList = this.f325887E;
        return (linkedList == null || linkedList.size() <= 0) ? this.f325907l : this.f325887E.get(0).f325923b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("IPCallInfo: ");
        sb.append(String.format("[roomId: %d, roomKey: %d, callSeq: %d, inviteId: %d, roomMemberId: %d, syncKey: %d, syncInterval: %d, currentStatus: %d, ErrMsg: %s, ErrCode：%d, ErrLevel：%d]\n", new Object[]{Integer.valueOf(this.f325896a), Long.valueOf(this.f325897b), Long.valueOf(this.f325898c), Integer.valueOf(this.f325899d), Integer.valueOf(this.f325906k), Integer.valueOf(this.f325907l), Integer.valueOf(this.f325909n), Integer.valueOf(this.f325908m), this.f325903h, Integer.valueOf(this.f325902g), Integer.valueOf(this.f325904i)}));
        sb.append(String.format("[toUsername: %s, toPhoneNumber: %s]\n", new Object[]{this.f325891I, this.f325892J}));
        sb.append("[addrList: ");
        Iterator<C50550ni3> it = this.f325884B.iterator();
        while (it.hasNext()) {
            C50550ni3 next = it.next();
            sb.append(String.format("{IP: %s, port: %d}", new Object[]{next.f138617d, Integer.valueOf(next.f138618e)}));
        }
        sb.append("]");
        sb.append("\n");
        LinkedList<C108829d> linkedList = this.f325887E;
        if (linkedList == null || linkedList.size() <= 0) {
            sb.append("userInfoList is empty");
        } else {
            sb.append("[userInfoList: ");
            Iterator<C108829d> it4 = this.f325887E.iterator();
            while (it4.hasNext()) {
                sb.append("{");
                sb.append(it4.next().toString());
                sb.append("}");
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
