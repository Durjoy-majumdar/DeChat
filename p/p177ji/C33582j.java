package p177ji;

import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.chatroom.storage.GroupToolItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import eb0.C31543z5;
import ei3.C86522b;
import f62.C75709u0;
import java.util.ArrayList;
import p203mi.C34572d0;
import p644pi.C77089d;
import p684si.C36674e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ji.j */
public class C33582j extends C86301e implements C75709u0 {
    /* JADX INFO: finally extract failed */
    /* renamed from: rI */
    public void mo59208rI() {
        ArrayList<C36674e> arrayList;
        Class cls = C77089d.class;
        Log.m105924i("MicroMsg.roomtools.RoomToolsHelp", "resetAllGroupToolsRecentUse");
        Cursor query = ((C77089d) C86312j.m106911c(cls)).xx0().f97473d.query("GroupTools", C36674e.f97468v.columns, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query == null) {
            arrayList = null;
        } else {
            try {
                ArrayList arrayList2 = new ArrayList();
                while (query.moveToNext()) {
                    C36674e eVar = new C36674e();
                    eVar.convertFrom(query);
                    arrayList2.add(eVar);
                }
                query.close();
                arrayList = arrayList2;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        if (arrayList != null) {
            for (C36674e eVar2 : arrayList) {
                eVar2.field_queryState = 0;
                ((C77089d) C86312j.m106911c(cls)).xx0().update(eVar2, new String[0]);
            }
        }
    }

    /* renamed from: yn */
    public void mo59209yn(String str) {
        if (C72996z1.m85807K5(str)) {
            C36674e c = C34572d0.m40392c(str);
            if (c == null) {
                Log.m105919d("MicroMsg.roomtools.RoomTodoService", "handleGroupToolByLaunchAA(room:%s) groupTools is null", str);
            } else if (c.field_queryState == 0) {
                Log.m105919d("MicroMsg.roomtools.RoomTodoService", "handleGroupToolByLaunchAA(room:%s) groupTools is COL_STATE_NEED_QUERY", str);
            } else {
                c.mo60796l2(new GroupToolItem("roomaa@app.origin", "", C31543z5.m39451a()));
                Log.m105925i("MicroMsg.roomtools.RoomTodoService", "handleGroupToolByLaunchAA room:%s result:%s", str, Boolean.valueOf(((C77089d) C86312j.m106911c(C77089d.class)).xx0().update(c, new String[0])));
            }
        }
    }
}
