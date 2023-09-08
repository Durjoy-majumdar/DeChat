package p738wg;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.ExtVoiceFileNameToMsgIdEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kd0.C76541g0;
import kd0.C76546u;
import kd0.C76551y;

/* renamed from: wg.l */
public class C78594l extends IStaticListener<ExtVoiceFileNameToMsgIdEvent> {
    public boolean callback(IEvent iEvent) {
        ExtVoiceFileNameToMsgIdEvent extVoiceFileNameToMsgIdEvent = (ExtVoiceFileNameToMsgIdEvent) iEvent;
        if (C76546u.yx0() == null) {
            Log.m105920e("MicroMsg.ExtVoiceFileNameToMsgId", "SubCoreVoice.getVoiceStg() == null" + Util.getStack());
        }
        C76541g0 yx02 = C76546u.yx0();
        String str = extVoiceFileNameToMsgIdEvent.f193572d.f193574a;
        C76551y yVar = null;
        if (str == null) {
            yx02.getClass();
        } else {
            Cursor rawQuery = yx02.f224034d.rawQuery("SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId, checksum, VoiceFlag, VoiceInfoExt FROM voiceinfo WHERE FileName= ?", new String[]{str}, 2);
            Log.m105918d("MicroMsg.VoiceStorage", "getInfoByFilename fileName[" + str + "] ResCount:" + rawQuery.getCount());
            if (rawQuery.moveToFirst()) {
                yVar = new C76551y();
                yVar.mo106794a(rawQuery);
            }
            rawQuery.close();
        }
        if (yVar != null) {
            extVoiceFileNameToMsgIdEvent.f193573e.f193575a = yVar.f224062m;
        }
        return true;
    }
}
