package cm1;

import android.text.TextUtils;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import p749xh.C66261f3;
import te3.C64273c21;
import tf1.C13914m;

/* renamed from: cm1.b0 */
public final class C0712b0 implements C0740i2 {

    /* renamed from: d */
    public final FinderObject f1709d;

    public C0712b0(FinderObject finderObject) {
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        this.f1709d = finderObject;
    }

    /* renamed from: a */
    public final FinderObject mo690a() {
        return this.f1709d;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2004;
    }

    public boolean equals(Object obj) {
        C0712b0 b0Var = obj instanceof C0712b0 ? (C0712b0) obj : null;
        return b0Var != null && b0Var.f1709d.f164794id == this.f1709d.f164794id;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return ((mVar instanceof C0712b0 ? (C0712b0) mVar : null) == null || ((C0712b0) mVar).f1709d.f164794id != this.f1709d.f164794id) ? -1 : 0;
    }

    public long getItemId() {
        return this.f1709d.f164794id;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("liveItem:");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[nickname:");
        String str2 = this.f1709d.nickname;
        if (str2 == null || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = str2.substring(0, Math.min(4 + 0, str2.length()));
            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sb4.append(str);
        sb4.append(",feedId:");
        sb4.append(this.f1709d.f164794id);
        sb4.append(",liveId:");
        C64273c21 c212 = this.f1709d.liveInfo;
        sb4.append(c212 != null ? Long.valueOf(c212.f182392d) : null);
        sb4.append(",friendLikeCount:");
        sb4.append(this.f1709d.friendLikeCount);
        sb4.append(']');
        sb.append(sb4.toString());
        String sb5 = sb.toString();
        C87412m.m108593f(sb5, "sb.toString()");
        return sb5;
    }
}
