package ar1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;
import uq1.C65437f;
import uq1.C65445i;
import uq1.C65446j;
import wp1.C15585f;
import xq1.C66405c;

/* renamed from: ar1.a */
public final class C54317a extends C66405c {

    /* renamed from: e */
    public final FinderItem f152441e;

    /* renamed from: f */
    public final int f152442f;

    /* renamed from: g */
    public final int f152443g;

    /* renamed from: h */
    public final String f152444h;

    /* renamed from: i */
    public final String f152445i = "LogPost.FinderFailedStage";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54317a(FinderItem finderItem, int i, int i2, String str) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        C87412m.m108594g(str, "errMsg");
        this.f152441e = finderItem;
        this.f152442f = i;
        this.f152443g = i2;
        this.f152444h = str;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 100;
    }

    /* renamed from: c */
    public void mo75101c() {
        FinderFeedReportObject finderFeedReportObject;
        FinderFeedReportObject finderFeedReportObject2;
        Log.m105929w(this.f152445i, "post failed, errType %d, errCode %d, errMsg %s", Integer.valueOf(this.f152442f), Integer.valueOf(this.f152443g), this.f152444h);
        this.f152441e.setPostFailed();
        int i = this.f152442f;
        if (!(Integer.MIN_VALUE == i || (finderFeedReportObject2 = this.f152441e.field_reportObject) == null)) {
            finderFeedReportObject2.cgiErrorType = i;
        }
        int i2 = this.f152443g;
        if (!(Integer.MIN_VALUE == i2 || (finderFeedReportObject = this.f152441e.field_reportObject) == null)) {
            finderFeedReportObject.cgiErrorCode = i2;
        }
        C15585f.f42211a.mo14345h(this.f152441e);
        boolean isLongVideo = this.f152441e.isLongVideo();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175913w(1253, 18, 1);
        if (isLongVideo) {
            nVar.mo175913w(1523, 18, 1);
        }
        C65437f fVar = C65437f.f188296h;
        long localId = this.f152441e.getLocalId();
        fVar.getClass();
        C61926c.m72668M(new C65445i(fVar, localId, false));
        C61926c.m72668M(new C65446j(fVar, this.f152441e.getLocalId(), false));
        boolean isLongVideo2 = this.f152441e.isLongVideo();
        nVar.mo175913w(1253, 16, 1);
        if (isLongVideo2) {
            nVar.mo175913w(1523, 16, 1);
        }
    }
}
