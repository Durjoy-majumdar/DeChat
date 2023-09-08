package d82;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import gy3.C87412m;

/* renamed from: d82.a */
public final class C107025a {

    /* renamed from: a */
    public MultiTalkGroupMember f320414a;

    /* renamed from: b */
    public View.OnClickListener f320415b;

    /* renamed from: c */
    public int f320416c;

    /* renamed from: d */
    public boolean f320417d;

    /* renamed from: e */
    public String f320418e;

    public C107025a(MultiTalkGroupMember multiTalkGroupMember, View.OnClickListener onClickListener, int i, boolean z, String str) {
        C87412m.m108594g(multiTalkGroupMember, "member");
        C87412m.m108594g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C87412m.m108594g(str, "nickName");
        this.f320414a = multiTalkGroupMember;
        this.f320415b = onClickListener;
        this.f320416c = i;
        this.f320417d = z;
        this.f320418e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C107025a)) {
            return false;
        }
        C107025a aVar = (C107025a) obj;
        return C87412m.m108589b(this.f320414a, aVar.f320414a) && C87412m.m108589b(this.f320415b, aVar.f320415b) && this.f320416c == aVar.f320416c && this.f320417d == aVar.f320417d && C87412m.m108589b(this.f320418e, aVar.f320418e);
    }

    public int hashCode() {
        int hashCode = ((((this.f320414a.hashCode() * 31) + this.f320415b.hashCode()) * 31) + this.f320416c) * 31;
        boolean z = this.f320417d;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f320418e.hashCode();
    }

    public String toString() {
        return "MultitalkAvatarViewData(member=" + this.f320414a + ", listener=" + this.f320415b + ", index=" + this.f320416c + ", isRenderVideo=" + this.f320417d + ", nickName=" + this.f320418e + ')';
    }
}
