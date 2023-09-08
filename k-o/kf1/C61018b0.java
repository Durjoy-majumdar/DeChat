package kf1;

import cm1.C55033u;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: kf1.b0 */
public final class C61018b0 extends C87413o implements C32226l<FinderCommentInfo, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C55033u f173776d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61018b0(C55033u uVar) {
        super(1);
        this.f173776d = uVar;
    }

    public Object invoke(Object obj) {
        long j = ((FinderCommentInfo) obj).commentId;
        return Boolean.valueOf(j != 0 && j == this.f173776d.f154492d.field_actionInfo.f186500h);
    }
}
