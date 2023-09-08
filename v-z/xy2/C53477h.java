package xy2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import androidx.lifecycle.C0125s;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C117747y;
import ob0.C89137b0;
import pe3.C89349b;
import qy2.C47902u;
import rx3.C13598b0;
import rx3.C13604l;
import rz2.C48212k;
import rz2.C48213l;
import su0.C13781a;
import sx3.C26236u;
import sy2.C48507a;
import sy2.C48508b;
import uy2.C52660e;
import uy2.C52665g;
import uz2.C52684h;
import uz2.C52694k0;
import uz2.C52712r1;
import uz2.C52717t1;
import vy2.C78495a;
import wz2.C53275g;
import z04.C112551y;
import zy2.C53847c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: xy2.h */
public final class C53477h extends C86301e implements C47902u {

    /* renamed from: xy2.h$a */
    public static final class C53478a implements C47902u.C36207b {

        /* renamed from: a */
        public final /* synthetic */ C53477h f150390a;

        /* renamed from: b */
        public final /* synthetic */ String f150391b;

        /* renamed from: c */
        public final /* synthetic */ Context f150392c;

        public C53478a(C53477h hVar, String str, Context context) {
            this.f150390a = hVar;
            this.f150391b = str;
            this.f150392c = context;
        }

        /* renamed from: a */
        public final void mo60567a(boolean z, List<C52684h> list) {
            if (z) {
                this.f150390a.xx0(this.f150391b, this.f150392c);
                return;
            }
            Context context = this.f150392c;
            C76879j.m92748s(context, context.getString(C0966R.string.msg_net_error), "");
        }
    }

    /* renamed from: xy2.h$b */
    public static final class C53479b implements C47902u.C47903a {

        /* renamed from: a */
        public final /* synthetic */ C53477h f150393a;

        /* renamed from: b */
        public final /* synthetic */ String f150394b;

        /* renamed from: c */
        public final /* synthetic */ C48212k f150395c;

        public C53479b(C53477h hVar, String str, C48212k kVar) {
            this.f150393a = hVar;
            this.f150394b = str;
            this.f150395c = kVar;
        }

        /* renamed from: a */
        public void mo72659a(boolean z, C52717t1 t1Var) {
            if (z) {
                C53477h.vx0(this.f150393a, new C13604l(this.f150394b, this.f150395c.field_userName), (C47902u.C36207b) null, (C0125s) null, false, 14, (Object) null);
            }
        }
    }

    public static C117747y vx0(C53477h hVar, C13604l lVar, C47902u.C36207b bVar, C0125s sVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        if ((i & 4) != 0) {
            sVar = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        hVar.getClass();
        C87412m.m108594g(lVar, "params");
        C48507a aVar = new C48507a(C26236u.m33719b(lVar), z);
        C89137b0 d = C86709a0.m107524d();
        C87412m.m108593f(d, "getNetSceneQueue()");
        C78495a.m94796a(d, aVar, sVar, new C53476g(aVar, bVar));
        return aVar;
    }

    public void A80(Context context, String str) {
        C87412m.m108594g(context, "context");
        C52665g.f147055f.mo73606c(str == null ? "" : str, 160);
        C48212k wx02 = wx0(str);
        if (wx02 != null) {
            if (C39674e.f106452d.mo62253n0(str) != null) {
                vx0(this, new C13604l(wx02.field_sessionId, wx02.field_userName), (C47902u.C36207b) null, (C0125s) null, false, 8, (Object) null);
                C53482m.f150398a.mo74150b(context, wx02.field_userName, "chat", (C52660e) null);
            }
        }
    }

    /* renamed from: O1 */
    public boolean mo72652O1(String str) {
        C48212k wx02 = wx0(str);
        return wx02 != null && wx02.field_block == 1;
    }

    /* renamed from: aY */
    public String mo72653aY(String str) {
        C48212k wx02;
        return ((str == null || C112551y.m153811k(str)) || (wx02 = wx0(str)) == null) ? "" : wx02.field_bigHeadImgUrl;
    }

    public void bu0(List<String> list, C47902u.C36207b bVar, C0125s sVar) {
        String str;
        Log.m105918d("MicroMsg.TextStatus.TextStatusContactService", "requestSessionStatus() called with: sessionIds = " + list + ", callback = " + bVar);
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            for (String str2 : list) {
                C48212k wx02 = wx0(str2);
                if (!(wx02 == null || (str = wx02.field_userName) == null)) {
                    linkedList.add(new C13604l(str2, str));
                }
            }
        }
        C48507a aVar = new C48507a(linkedList, true);
        C89137b0 d = C86709a0.m107524d();
        C87412m.m108593f(d, "getNetSceneQueue()");
        C78495a.m94796a(d, aVar, sVar, new C53476g(aVar, bVar));
    }

    /* renamed from: dS */
    public void mo72655dS(String str, int i) {
        C52665g.C52666a aVar = C52665g.f147055f;
        if (str == null) {
            str = "";
        }
        aVar.mo73606c(str, i);
    }

    public void e70(Context context, String str) {
        C87412m.m108594g(context, "context");
        C48212k wx02 = wx0(str);
        C53482m mVar = C53482m.f150398a;
        String str2 = wx02 != null ? wx02.field_userName : null;
        if (str2 == null) {
            str2 = "";
        }
        mVar.mo74151c(context, C26236u.m33719b(str2), "chat");
    }

    /* renamed from: is */
    public void mo72657is(Context context, String str) {
        C13598b0 b0Var;
        C87412m.m108594g(context, "context");
        if (C87412m.m108589b(str, C13781a.m13082a())) {
            C52665g.C52666a aVar = C52665g.f147055f;
            String a = C13781a.m13082a();
            C87412m.m108593f(a, "username()");
            aVar.mo73606c(a, 152);
            return;
        }
        C48212k wx02 = wx0(str);
        if (wx02 != null) {
            new C53847c(context, wx02, (C52660e) null, false, 4, (C8480h) null).mo140655A();
            C52665g.f147055f.mo73606c(str == null ? "" : str, 151);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.TextStatus.TextStatusContactService", "contact is null for " + str);
        }
    }

    /* renamed from: mz */
    public void mo72658mz(Context context, boolean z, String str) {
        C87412m.m108594g(context, "context");
        Log.m105918d("MicroMsg.TextStatus.TextStatusContactService", "modifyMsgSessionMuteSetting() called with: ifOpen = " + z + ", sessionId = " + str);
        C52665g.f147055f.mo73606c(str == null ? "" : str, z ? 155 : 156);
        C48212k wx02 = wx0(str);
        if (wx02 != null) {
            C52712r1 r1Var = new C52712r1();
            r1Var.f147195d = wx02.field_userName;
            r1Var.f147196e = z;
            C52694k0 k0Var = new C52694k0();
            k0Var.f147151d = 11;
            byte[] byteArray = r1Var.toByteArray();
            k0Var.f147152e = C89349b.m111675b(Base64.encodeToString(byteArray, 0, byteArray.length, 2));
            C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
            C53479b bVar = new C53479b(this, str, wx02);
            LinkedList linkedList = new LinkedList();
            linkedList.add(k0Var);
            C48508b bVar2 = new C48508b(linkedList);
            if (sVar != null) {
                C89137b0 d = C86709a0.m107524d();
                C87412m.m108593f(d, "getNetSceneQueue()");
                C78495a.m94796a(d, bVar2, sVar, new C53484n(bVar2, bVar));
                return;
            }
            C86709a0.m107524d().mo123460f(bVar2);
        }
    }

    public final C48212k wx0(String str) {
        C48213l E0 = C39674e.f106452d.mo62239E0();
        E0.getClass();
        if (str == null || C112551y.m153811k(str)) {
            return null;
        }
        SingleTable singleTable = C53275g.f148839u;
        C87412m.m108593f(singleTable, "TABLE");
        Column column = C53275g.f148840v;
        C87412m.m108593f(column, "SESSIONID");
        SelectSql.Builder selectAll = singleTable.selectAll();
        String escapeSqlValue = Util.escapeSqlValue(str);
        C87412m.m108593f(escapeSqlValue, "escapeSqlValue(sessionId)");
        return (C48212k) selectAll.where(column.equal(escapeSqlValue)).build().singleQuery(E0.f129197d, C48212k.class);
    }

    public final void xx0(String str, Context context) {
        C39674e.f106452d.mo62238D().mo74245K(str);
        Intent intent = new Intent();
        intent.putExtra("Chat_Self", C13781a.m13082a());
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C88144b.m109801s(context, ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    public final void yx0(String str, String str2, Context context) {
        C87412m.m108594g(context, "context");
        boolean z = false;
        if (!(str == null || C112551y.m153811k(str))) {
            if (!(str2 == null || C112551y.m153811k(str2))) {
                C39674e eVar = C39674e.f106452d;
                String str3 = eVar.mo62251j0().mo61999jo(str).field_sessionId;
                if (str3 == null) {
                    str3 = "";
                }
                if (C112551y.m153811k(str3)) {
                    eVar.mo62251j0().mo61998Lo(str, str2, 0, 0, 0, 0, "");
                }
                C48212k wx02 = wx0(str);
                StringBuilder sb = new StringBuilder();
                sb.append("jumpChatting() called with: contact == null ");
                if (wx02 == null) {
                    z = true;
                }
                sb.append(z);
                Log.m105924i("MicroMsg.TextStatus.TextStatusContactService", sb.toString());
                if (wx02 == null) {
                    vx0(this, new C13604l(str, str2), new C53478a(this, str, context), (C0125s) null, false, 12, (Object) null);
                } else {
                    xx0(str, context);
                }
            }
        }
    }

    public final void zx0(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "changeUserName");
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("Chat_User", str);
        intent.putExtra("Chat_Mode", 1);
        intent.setClassName(context, "com.tencent.mm.ui.chatting.ChattingUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/conversation/service/TextStatusContactService", "jumpFriendChatting", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/textstatus/conversation/service/TextStatusContactService", "jumpFriendChatting", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
