package p203mi;

import com.tencent.p014mm.chatroom.storage.GroupToolItem;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import kb0.C33860c;
import p644pi.C77089d;
import p684si.C36674e;

/* renamed from: mi.d0 */
public class C34572d0 {
    /* renamed from: a */
    public static boolean m40390a(C72963f4 f4Var) {
        if (f4Var == null || !C72996z1.m85807K5(f4Var.mo108768t())) {
            return false;
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (u == null) {
            Log.m105918d("MicroMsg.roomtools.RoomToolsHelp", "content is null");
            return false;
        }
        if (!C33860c.m40172a(u)) {
            return (u.f195582i == 44) || "1001".equals(u.f195604n1);
        }
    }

    /* renamed from: b */
    public static GroupToolItem m40391b(C72963f4 f4Var) {
        try {
            C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
            if (u == null) {
                return null;
            }
            GroupToolItem groupToolItem = new GroupToolItem();
            groupToolItem.f79318d = Util.nullAs(u.f195573f2, "");
            groupToolItem.f79319e = Util.nullAs(u.f195569e2, "");
            groupToolItem.f79320f = f4Var.getCreateTime();
            return groupToolItem;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.roomtools.RoomToolsHelp", "getGroupToolItemFromMsg Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public static C36674e m40392c(String str) {
        Class cls = C77089d.class;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        C36674e jo = ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(str);
        if (jo != null) {
            return jo;
        }
        C36674e eVar = new C36674e();
        eVar.field_chatroomname = str;
        if (((C77089d) C86312j.m106911c(cls)).xx0().insert(eVar)) {
            return ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(str);
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m40393d(C72963f4 f4Var) {
        if (f4Var != null && f4Var.getType() == 436207665) {
            String content = f4Var.getContent();
            C68070l.C68072b bVar = null;
            if (content != null) {
                bVar = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            }
            return bVar != null && "1001".equals(bVar.f195604n1);
        }
    }

    /* renamed from: e */
    public static void m40394e(String str) {
        boolean z;
        Class cls = C77089d.class;
        if (C72996z1.m85807K5(str)) {
            C36674e eVar = null;
            if (Util.isNullOrNil(str) || (eVar = ((C77089d) C86312j.m106911c(cls)).xx0().mo60800jo(str)) == null || eVar.field_queryState == 0) {
                z = false;
            } else {
                eVar.field_queryState = 0;
                z = ((C77089d) C86312j.m106911c(cls)).xx0().update(eVar, new String[0]);
            }
            Object[] objArr = new Object[3];
            objArr[0] = Util.nullAs(str, "");
            objArr[1] = eVar == null ? "null" : "not_null";
            objArr[2] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.roomtools.RoomToolsHelp", "resetGroupToolsByTalker roomName:%s groupTools:%s result:%s", objArr);
        }
    }
}
