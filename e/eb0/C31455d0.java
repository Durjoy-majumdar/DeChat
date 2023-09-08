package eb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import f40.C86709a0;
import f62.C75700k0;

/* renamed from: eb0.d0 */
public class C31455d0 {
    /* renamed from: a */
    public static int m39412a() {
        int i = 0;
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.BottleConversationLogic", "get Bottle Total Conversation Unread, but has not set uin");
            return 0;
        }
        C44660i2 i2Var = (C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
        i2Var.getClass();
        Log.m105925i("MicroMsg.ConversationStorage", "get bottle total conversation unread sql is %s", "select count(*) from rbottleconversation where unReadCount > 0");
        Cursor rawQuery = i2Var.f121077c.rawQuery("select count(*) from rbottleconversation where unReadCount > 0", (String[]) null);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.moveToFirst();
            i = rawQuery.getInt(0);
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return i;
    }
}
