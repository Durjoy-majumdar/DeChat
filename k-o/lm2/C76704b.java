package lm2;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.ShareRoomHistoryStatStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f62.C31950v0;
import java.util.Map;
import km2.C33939b;
import nm2.C25231f;
import nm2.C76927a;
import pm2.C35561a;
import qm2.C77368a;
import qm2.C77369b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: lm2.b */
public class C76704b extends C86301e implements C31950v0 {
    /* renamed from: Mj */
    public void mo58432Mj(String str, long j, String str2) {
        C35561a aVar = new C35561a();
        aVar.field_historyId = str;
        aVar.field_msgId = j;
        aVar.field_talker = str2;
        Log.m105925i("MicroMsg.selectRecord.SelectRecordService", "saveHistoryIdToMsgIf msgId:%s historyId:%s result:%s", Long.valueOf(j), Util.nullAs(str, ""), Boolean.valueOf(((C33939b) C86312j.m106911c(C33939b.class)).vx0().insert(aVar)));
    }

    /* renamed from: fs */
    public boolean mo58433fs(C72963f4 f4Var, Map<String, String> map, String str, String str2) {
        return C77369b.m93267g(f4Var, map, str, str2, (C77368a) null);
    }

    /* renamed from: ql */
    public void mo58434ql(int i) {
        C76927a.m92781a().f224809j = i;
        C76927a a = C76927a.m92781a();
        ShareRoomHistoryStatStruct shareRoomHistoryStatStruct = a.f224800a;
        shareRoomHistoryStatStruct.f194400l = (long) a.f224801b;
        shareRoomHistoryStatStruct.f194401m = (long) a.f224802c;
        shareRoomHistoryStatStruct.f194402n = (long) a.f224803d;
        shareRoomHistoryStatStruct.f194403o = (long) a.f224804e;
        shareRoomHistoryStatStruct.f194404p = (long) a.f224805f;
        shareRoomHistoryStatStruct.f194405q = (long) a.f224806g;
        shareRoomHistoryStatStruct.f194406r = (long) a.f224807h;
        shareRoomHistoryStatStruct.f194409u = (long) a.f224809j;
        shareRoomHistoryStatStruct.f194410v = (long) a.f224810k;
        shareRoomHistoryStatStruct.f194412x = a.f224814o;
        shareRoomHistoryStatStruct.f194413y = a.f224815p;
        shareRoomHistoryStatStruct.f194389A = (long) a.f224811l;
        shareRoomHistoryStatStruct.f194390B = (long) a.f224812m;
        shareRoomHistoryStatStruct.f194391C = (long) a.f224813n;
        Log.m105919d("MicroMsg.selectrecord.SelectRecordReportManager", "%s", shareRoomHistoryStatStruct.mo1006q());
        a.f224800a.mo86054n();
    }

    public void w70(String str, int i, int i2, int i3, int i4, int i5, long j, String str2) {
        C25231f.m32169a(str, i, i2, i3, i4, i5, j, str2);
    }
}
