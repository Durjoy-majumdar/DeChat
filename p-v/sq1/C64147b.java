package sq1;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import er1.C58739j4;
import fe1.C58960c;
import fe1.C58969q;
import gy3.C87412m;
import java.util.Arrays;
import java.util.LinkedList;
import qq1.C63317a;
import te3.C52155yq2;
import te3.C52295zq2;
import te3.C64284cg;
import te3.C64854ye0;

/* renamed from: sq1.b */
public final class C64147b extends C64146a {

    /* renamed from: P */
    public C63317a f181859P;

    /* renamed from: Q */
    public LinkedList<String> f181860Q = new LinkedList<>();

    public C64147b() {
        C64854ye0 ye02 = new C64854ye0();
        ye02.f186497e = new FinderCommentInfo();
        ye02.f186498f = new C52155yq2();
        ye02.f186499g = new C52295zq2();
        this.field_actionInfo = ye02;
    }

    public final C64284cg getBizInfo() {
        FinderContact finderContact = mo88876n2().author_contact;
        if (finderContact != null) {
            return C58960c.m68830b(C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null), false);
        }
        return null;
    }

    public final String getContent() {
        String str = mo88876n2().content;
        return str == null ? "" : str;
    }

    public final int getLikeCount() {
        return mo88876n2().likeCount;
    }

    public final int getLikeFlag() {
        return mo88876n2().likeFlag;
    }

    public final String getNickname() {
        FinderContact finderContact = mo88876n2().author_contact;
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getNickname();
        }
        String str = mo88876n2().nickname;
        return str == null ? "" : str;
    }

    public final String getUsername() {
        String str = mo88876n2().username;
        return str == null ? "" : str;
    }

    /* renamed from: l2 */
    public final String mo88874l2() {
        String str = mo88876n2().client_id;
        return str == null ? "" : str;
    }

    /* renamed from: m2 */
    public final long mo88875m2() {
        return mo88876n2().commentId;
    }

    /* renamed from: n2 */
    public final FinderCommentInfo mo88876n2() {
        FinderCommentInfo finderCommentInfo = this.field_actionInfo.f186497e;
        return finderCommentInfo == null ? new FinderCommentInfo() : finderCommentInfo;
    }

    /* renamed from: o2 */
    public final int mo88877o2() {
        return mo88876n2().displayFlag;
    }

    /* renamed from: p2 */
    public final long mo88878p2() {
        return mo88876n2().displayid;
    }

    /* renamed from: q2 */
    public final int mo88879q2() {
        return mo88876n2().expandCommentCount;
    }

    /* renamed from: r2 */
    public final String mo88880r2() {
        FinderContact finderContact = mo88876n2().author_contact;
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getAvatarUrl();
        }
        String str = mo88876n2().headUrl;
        return str == null ? "" : str;
    }

    /* renamed from: s2 */
    public final LinkedList<FinderCommentInfo> mo88881s2() {
        return mo88876n2().levelTwoComment;
    }

    /* renamed from: t2 */
    public final long mo88882t2() {
        return mo88876n2().replyCommentId;
    }

    public String toString() {
        String str;
        String str2 = "field_commentInfo{commentId:" + mo88876n2().commentId + ", displayid:" + Long.valueOf(mo88876n2().displayid) + " try_count " + this.field_tryCount + " conetent:%s}";
        Object[] objArr = new Object[1];
        String str3 = mo88876n2().content;
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
    public final String mo88884u2() {
        FinderContact finderContact = mo88876n2().reply_contact;
        if (finderContact != null) {
            return C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null).getNickname();
        }
        String str = mo88876n2().replyNickname;
        return str == null ? "" : str;
    }

    /* renamed from: v2 */
    public final boolean mo88885v2() {
        C58739j4 j4Var = C58739j4.f168176a;
        int o2 = mo88877o2();
        j4Var.getClass();
        return (o2 & 8) != 0;
    }
}
