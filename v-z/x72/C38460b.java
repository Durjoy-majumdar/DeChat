package x72;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38589j6;

/* renamed from: x72.b */
public class C38460b extends C38589j6 {

    /* renamed from: v */
    public static IAutoDBItem.MAutoDBInfo f101445v = C38589j6.initAutoDBInfo(C38460b.class);

    public Object clone() {
        C38460b bVar = new C38460b();
        try {
            bVar.systemRowid = this.systemRowid;
            bVar.field_msgId = this.field_msgId;
            bVar.field_msgSvrId = this.field_msgSvrId;
            bVar.field_quotedMsgId = this.field_quotedMsgId;
            bVar.field_quotedMsgSvrId = this.field_quotedMsgSvrId;
            bVar.field_status = this.field_status;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.msgquote.MsgQute", "clone() Exception:%s %s", e.getClass(), e.getMessage());
        }
        return bVar;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f101445v;
    }

    public String toString() {
        return "MsgQute{field_msgId=" + this.field_msgId + ", field_msgSvrId=" + this.field_msgSvrId + ", field_quotedMsgId=" + this.field_quotedMsgId + ", field_quotedMsgSvrId=" + this.field_quotedMsgSvrId + ", field_status=" + this.field_status + ", systemRowid=" + this.systemRowid + '}';
    }
}
