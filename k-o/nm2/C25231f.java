package nm2;

import com.tencent.p014mm.autogen.mmdata.rpt.ShareRoomHistoryRevokeStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: nm2.f */
public class C25231f {
    /* renamed from: a */
    public static void m32169a(String str, int i, int i2, int i3, int i4, int i5, long j, String str2) {
        ShareRoomHistoryRevokeStruct shareRoomHistoryRevokeStruct = new ShareRoomHistoryRevokeStruct();
        shareRoomHistoryRevokeStruct.f69607d = shareRoomHistoryRevokeStruct.mo86045b("RoomId", str, true);
        shareRoomHistoryRevokeStruct.f69608e = (long) i;
        shareRoomHistoryRevokeStruct.f69609f = (long) i2;
        shareRoomHistoryRevokeStruct.f69610g = (long) i3;
        shareRoomHistoryRevokeStruct.f69611h = (long) i4;
        shareRoomHistoryRevokeStruct.f69612i = (long) i5;
        shareRoomHistoryRevokeStruct.f69613j = j;
        shareRoomHistoryRevokeStruct.f69614k = shareRoomHistoryRevokeStruct.mo86045b("ToUsers", str2, true);
        Log.m105919d("MicroMsg.selectrecord.SelectRecordReporter", "reportShareRoomHistoryRevoke %s", shareRoomHistoryRevokeStruct.mo1006q());
        shareRoomHistoryRevokeStruct.mo86054n();
    }
}
