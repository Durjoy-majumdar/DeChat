package up1;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import er1.C58739j4;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedList;
import pe3.C89349b;
import te3.C52155yq2;
import te3.C52295zq2;
import te3.C64854ye0;

/* renamed from: up1.w0 */
public final class C65426w0 extends C65425v0 {

    /* renamed from: P */
    public boolean f188279P;

    /* renamed from: Q */
    public LinkedList<String> f188280Q = new LinkedList<>();

    /* renamed from: R */
    public String f188281R = "";

    public C65426w0() {
        C64854ye0 ye02 = new C64854ye0();
        ye02.f186497e = new FinderCommentInfo();
        ye02.f186498f = new C52155yq2();
        ye02.f186499g = new C52295zq2();
        this.field_actionInfo = ye02;
    }

    /* renamed from: A2 */
    public final boolean mo89522A2() {
        C58739j4 j4Var = C58739j4.f168176a;
        int p2 = mo89533p2();
        j4Var.getClass();
        return (p2 & 8) != 0;
    }

    /* renamed from: B2 */
    public final void mo89523B2(int i) {
        mo89532o2().displayFlag = i;
    }

    public final String getContent() {
        String str = mo89532o2().content;
        return str == null ? "" : str;
    }

    public final int getLikeCount() {
        return mo89532o2().likeCount;
    }

    public final int getLikeFlag() {
        return mo89532o2().likeFlag;
    }

    public final String getNickname() {
        FinderContact finderContact = mo89532o2().author_contact;
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getNickname();
        }
        String str = mo89532o2().nickname;
        return str == null ? "" : str;
    }

    public final String getUsername() {
        String str = mo89532o2().username;
        return str == null ? "" : str;
    }

    /* renamed from: l2 */
    public final int mo89529l2() {
        return mo89532o2().blacklist_flag;
    }

    /* renamed from: m2 */
    public final String mo89530m2() {
        String str = mo89532o2().client_id;
        return str == null ? "" : str;
    }

    /* renamed from: n2 */
    public final long mo89531n2() {
        return mo89532o2().commentId;
    }

    /* renamed from: o2 */
    public final FinderCommentInfo mo89532o2() {
        FinderCommentInfo finderCommentInfo = this.field_actionInfo.f186497e;
        return finderCommentInfo == null ? new FinderCommentInfo() : finderCommentInfo;
    }

    /* renamed from: p2 */
    public final int mo89533p2() {
        return mo89532o2().displayFlag;
    }

    /* renamed from: q2 */
    public final int mo89534q2() {
        return mo89532o2().expandCommentCount;
    }

    /* renamed from: r2 */
    public final int mo89535r2() {
        return this.field_failedFlag;
    }

    /* renamed from: s2 */
    public final long mo89536s2() {
        return this.field_feedId;
    }

    /* renamed from: t2 */
    public final String mo89537t2() {
        FinderContact finderContact = mo89532o2().author_contact;
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getAvatarUrl();
        }
        String str = mo89532o2().headUrl;
        return str == null ? "" : str;
    }

    public String toString() {
        String str;
        String str2 = "field_commentInfo{commentId:" + mo89532o2().commentId + ", displayid:" + Long.valueOf(mo89532o2().displayid) + " try_count " + this.field_tryCount + " conetent:%s}";
        Object[] objArr = new Object[1];
        String str3 = mo89532o2().content;
        if (str3 != null) {
            str = str3.substring(0, Math.min(str3.length(), 2));
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        objArr[0] = str;
        String format = String.format(str2, Arrays.copyOf(objArr, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: u2 */
    public final C89349b mo89539u2() {
        return mo89532o2().lastBuffer;
    }

    /* renamed from: v2 */
    public final LinkedList<FinderCommentInfo> mo89540v2() {
        return mo89532o2().levelTwoComment;
    }

    /* renamed from: w2 */
    public final long mo89541w2() {
        return mo89532o2().replyCommentId;
    }

    /* renamed from: x2 */
    public final String mo89542x2() {
        FinderContact finderContact = mo89532o2().reply_contact;
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getNickname();
        }
        String str = mo89532o2().replyNickname;
        return str == null ? "" : str;
    }

    /* renamed from: y2 */
    public final String mo89543y2() {
        String str = mo89532o2().reply_username;
        return str == null ? "" : str;
    }

    /* renamed from: z2 */
    public final boolean mo89544z2() {
        return mo89532o2().comment_type == 1;
    }
}
