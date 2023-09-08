package p203mi;

import android.content.ContentValues;
import com.tencent.p014mm.autogen.events.UpdateChatRoomSpamStatusEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import p749xh.C53335e1;

/* renamed from: mi.q$$a */
public final /* synthetic */ class q$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C47046q f224560d;

    /* renamed from: e */
    public final /* synthetic */ int f224561e;

    public /* synthetic */ q$$a(C47046q qVar, int i) {
        this.f224560d = qVar;
        this.f224561e = i;
    }

    public final void run() {
        C47046q qVar = this.f224560d;
        int i = this.f224561e;
        qVar.getClass();
        SingleTable singleTable = C53335e1.f149283M;
        ContentValues contentValues = new ContentValues();
        contentValues.put("spamStatus", Integer.valueOf(i));
        Log.m105925i("MicroMsg.NetSceneGetChatRoomInfoDetail", "update spamstatus: %s %s %s", qVar.f126430n, Integer.valueOf(C53335e1.f149283M.update(contentValues).where(C53335e1.f149285P.equal(qVar.f126430n)).build().run(C53335e1.f149324r1.getDB())), Integer.valueOf(i));
        UpdateChatRoomSpamStatusEvent updateChatRoomSpamStatusEvent = new UpdateChatRoomSpamStatusEvent();
        UpdateChatRoomSpamStatusEvent.C67805a aVar = updateChatRoomSpamStatusEvent.f193979d;
        aVar.f193980a = qVar.f126430n;
        aVar.f193981b = i;
        updateChatRoomSpamStatusEvent.publish();
    }
}
