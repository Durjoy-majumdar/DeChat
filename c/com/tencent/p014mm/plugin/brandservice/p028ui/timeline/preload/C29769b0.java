package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.database.Cursor;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dx0.C31338h;
import g93.C32355a;
import java.util.LinkedList;
import kotlin.Metadata;
import ob0.C89144l0;
import te3.C49948j6;
import wx0.C38338a;
import wx0.C38341d;
import wx0.C38342e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCVoid;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.b0 */
final class C29769b0<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C29769b0<InputType, ResultType> f80779d = new C29769b0<>();

    public void invoke(Object obj, C1256g gVar) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Cursor query = C31338h.vx0().f101196d.query("BizAppMsgReportContext", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "reportTime DESC limit 50");
        LinkedList<C38338a> linkedList = new LinkedList<>();
        while (query.moveToNext()) {
            C38338a aVar = new C38338a();
            aVar.convertFrom(query);
            linkedList.add(aVar);
        }
        query.close();
        LinkedList linkedList2 = new LinkedList();
        if (linkedList.size() > 0) {
            Log.m105925i("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] list size:%d", Integer.valueOf(linkedList.size()));
            for (C38338a aVar2 : linkedList) {
                if (Util.isNullOrNil(aVar2.field_url)) {
                    Log.m105928w("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] url is null, err");
                } else if (System.currentTimeMillis() - aVar2.field_reportTime >= C29776q.f80785a) {
                    C32355a.m39690b(908, 60, 1, true);
                } else {
                    C49948j6 j6Var = new C49948j6();
                    j6Var.f135877d = aVar2.field_url;
                    j6Var.f135878e = aVar2.field_reportTime;
                    linkedList2.add(j6Var);
                    Log.m105927v("MicroMsg.Preload.BizAppMsgReportMgr", "[processReportList] url:%s reportTime:%d", j6Var.f135877d, Long.valueOf(j6Var.f135878e));
                }
            }
        }
        if (linkedList2.size() <= 0) {
            C31338h.vx0().mo61622Lo(linkedList);
            Log.m105928w("MicroMsg.Preload.BizAppMsgReportMgr", "list is null, return");
            return;
        }
        C32355a.m39689a(53);
        C89144l0.m111429e(C38342e.m41837a(linkedList2, 1).mo72403a(), new C38341d(linkedList2, linkedList), false);
    }
}
