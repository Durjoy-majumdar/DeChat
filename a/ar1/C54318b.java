package ar1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import je1.C60799f4;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C51843wk0;
import wp1.C15585f;

/* renamed from: ar1.b */
public final class C54318b<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderItem f152446a;

    /* renamed from: b */
    public final /* synthetic */ C54319c f152447b;

    /* renamed from: c */
    public final /* synthetic */ C60799f4 f152448c;

    public C54318b(FinderItem finderItem, C54319c cVar, C60799f4 f4Var) {
        this.f152446a = finderItem;
        this.f152447b = cVar;
        this.f152448c = f4Var;
    }

    public Object call(Object obj) {
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        FinderItem finderItem = this.f152446a;
        FinderFeedReportObject finderFeedReportObject = finderItem.field_reportObject;
        if (finderFeedReportObject != null) {
            finderFeedReportObject.dumpCgiErrorType = cVar.f256793a;
        }
        if (finderFeedReportObject != null) {
            finderFeedReportObject.dumpCgiErrorCode = cVar.f256794b;
        }
        C15585f.f42211a.mo14345h(finderItem);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            String str = this.f152447b.f152451j;
            Log.m105924i(str, "dumpcgi, waitType:" + ((C51843wk0) cVar.f256796d).f144113f + " url:" + ((C51843wk0) cVar.f256796d).f144111d + ", thumbUrl:" + ((C51843wk0) cVar.f256796d).f144112e);
            FinderObjectDesc finderObjectDesc = this.f152448c.f173175o.f185018e;
            if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
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
            C60799f4 f4Var = this.f152448c;
            f4Var.f173175o.f185012C = ((C51843wk0) cVar.f256796d).f144113f;
            return Boolean.valueOf(this.f152447b.mo75106h(f4Var));
        }
        C54319c cVar2 = this.f152447b;
        cVar2.f152452n = new C54324i(cVar2.f152449h, 2);
        cVar2.f152453o.countDown();
        return C13598b0.f38549a;
    }
}
