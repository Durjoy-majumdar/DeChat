package lq1;

import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32226l;
import gy3.C87413o;
import sq1.C64151e;

/* renamed from: lq1.k */
public final class C61370k extends C87413o implements C32226l<FinderCommentInfo, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C64151e f174562d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61370k(C64151e eVar) {
        super(1);
        this.f174562d = eVar;
    }

    public Object invoke(Object obj) {
        long j = ((FinderCommentInfo) obj).commentId;
        return Boolean.valueOf(j != 0 && j == this.f174562d.f181868d.field_actionInfo.f186500h);
    }
}
