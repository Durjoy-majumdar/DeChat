package jn3;

import a11.C39479c;
import ck3.C39969i;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Map;
import p740wo.C53193b;
import rx3.C13604l;
import su0.C13781a;
import sx3.C90364q0;

/* renamed from: jn3.f */
public final class C46564f {
    /* renamed from: a */
    public static final Map<String, Object> m51893a(C39969i iVar) {
        C87412m.m108594g(iVar, "<this>");
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(iVar.f107141a);
        boolean b = C87412m.m108589b(Lo != null ? Lo.field_roomowner : null, C13781a.m13082a());
        boolean u2 = Lo != null ? Lo.mo69793u2(C13781a.m13082a()) : false;
        int i = 3;
        C13604l[] lVarArr = new C13604l[3];
        lVarArr[0] = new C13604l("group_chat_room_uv", Integer.valueOf(((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(iVar.f107141a)));
        lVarArr[1] = new C13604l("group_chat_name", iVar.f107141a);
        if (b) {
            i = 1;
        } else if (u2) {
            i = 2;
        }
        lVarArr[2] = new C13604l("group_user_role", Integer.valueOf(i));
        return C90364q0.m113147f(lVarArr);
    }
}
