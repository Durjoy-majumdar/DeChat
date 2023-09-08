package zq1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51843wk0;
import te3.C64365fh0;
import wp1.C66166c;

/* renamed from: zq1.f */
public final class C66964f<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderItem f192388a;

    /* renamed from: b */
    public final /* synthetic */ C66965g f192389b;

    public C66964f(FinderItem finderItem, C66965g gVar) {
        this.f192388a = finderItem;
        this.f192389b = gVar;
    }

    public Object call(Object obj) {
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        FinderFeedReportObject finderFeedReportObject = this.f192388a.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.dumpCgiErrorType = cVar.f256793a;
        }
        if (finderFeedReportObject != null) {
            finderFeedReportObject.dumpCgiErrorCode = cVar.f256794b;
        }
        C66166c.f190172a.mo90231b(this.f192389b.f192390h);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            String str = this.f192389b.f192392j;
            Log.m105924i(str, "dumpcgi, waitType:" + ((C51843wk0) cVar.f256796d).f144113f + " url:" + ((C51843wk0) cVar.f256796d).f144111d + ", thumbUrl:" + ((C51843wk0) cVar.f256796d).f144112e);
            FinderObjectDesc finderObjectDesc2 = this.f192389b.f192393n.getFeedObject().objectDesc;
            if (!(finderObjectDesc2 == null || (linkedList = finderObjectDesc2.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                C51843wk0 wk02 = (C51843wk0) cVar.f256796d;
                String str2 = wk02.f144111d;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                finderMedia.url = str2;
                String str4 = wk02.f144112e;
                if (str4 != null) {
                    str3 = str4;
                }
                finderMedia.thumbUrl = str3;
            }
            FinderObjectDesc finderObjectDesc3 = this.f192389b.f192393n.getFeedObject().objectDesc;
            C64365fh0 fh02 = null;
            if ((finderObjectDesc3 != null ? finderObjectDesc3.client_draft_ext_info : null) == null && (finderObjectDesc = this.f192389b.f192393n.getFeedObject().objectDesc) != null) {
                finderObjectDesc.client_draft_ext_info = new C64365fh0();
            }
            FinderObjectDesc finderObjectDesc4 = this.f192389b.f192393n.getFeedObject().objectDesc;
            if (finderObjectDesc4 != null) {
                fh02 = finderObjectDesc4.client_draft_ext_info;
            }
            if (fh02 != null) {
                fh02.f183133d = ((C51843wk0) cVar.f256796d).f144113f;
            }
            return Boolean.valueOf(this.f192389b.mo90946h());
        }
        C66965g gVar = this.f192389b;
        gVar.f192394o = new C66961c(gVar.f192390h, 2);
        gVar.f192395p.countDown();
        return C13598b0.f38549a;
    }
}
