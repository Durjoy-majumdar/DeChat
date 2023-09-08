package p203mi;

import a11.C39479c;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Pair;
import android.view.MenuItem;
import bp3.C67301m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.NotifyGroupTodoEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import kg3.C76577a;
import kr0.C76629w0;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p644pi.C77089d;
import p684si.C77711c;
import p684si.C77712d;
import pe3.C89349b;
import qo3.C77407n;
import te3.C77955jv3;
import vh0.C78415b;

/* renamed from: mi.b0 */
public class C76758b0 {

    /* renamed from: mi.b0$a */
    public class C76759a implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ boolean f224533d;

        /* renamed from: e */
        public final /* synthetic */ Context f224534e;

        public C76759a(boolean z, Context context) {
            this.f224533d = z;
            this.f224534e = context;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (this.f224533d) {
                e0Var.mo107142f(0, this.f224534e.getString(C0966R.string.b4k));
            } else {
                e0Var.mo107140d(0, this.f224534e.getResources().getColor(C0966R.color.f2966ao), this.f224534e.getString(C0966R.string.b4j));
            }
        }
    }

    /* renamed from: mi.b0$b */
    public class C76760b implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C76762d f224535d;

        /* renamed from: e */
        public final /* synthetic */ boolean f224536e;

        /* renamed from: f */
        public final /* synthetic */ int f224537f;

        /* renamed from: g */
        public final /* synthetic */ String f224538g;

        /* renamed from: h */
        public final /* synthetic */ int f224539h;

        /* renamed from: i */
        public final /* synthetic */ int f224540i;

        /* renamed from: j */
        public final /* synthetic */ String f224541j;

        /* renamed from: n */
        public final /* synthetic */ String f224542n;

        public C76760b(C76762d dVar, boolean z, int i, String str, int i2, int i3, String str2, String str3) {
            this.f224535d = dVar;
            this.f224536e = z;
            this.f224537f = i;
            this.f224538g = str;
            this.f224539h = i2;
            this.f224540i = i3;
            this.f224541j = str2;
            this.f224542n = str3;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C76762d dVar;
            if (menuItem.getItemId() == 0 && (dVar = this.f224535d) != null) {
                if (this.f224536e) {
                    dVar.mo102497a();
                } else {
                    dVar.mo102498b();
                }
                int i2 = this.f224537f;
                if (i2 == 2) {
                    C24982c0.m31599c(this.f224538g, 2, this.f224539h, this.f224536e ? 1 : 2, this.f224540i, this.f224541j, this.f224542n);
                } else if (i2 == 1) {
                    C24982c0.m31598b(this.f224538g, this.f224539h, 3, 2, this.f224541j, this.f224542n);
                }
            }
        }
    }

    /* renamed from: mi.b0$c */
    public class C76761c implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ int f224543a;

        /* renamed from: b */
        public final /* synthetic */ String f224544b;

        /* renamed from: c */
        public final /* synthetic */ int f224545c;

        /* renamed from: d */
        public final /* synthetic */ boolean f224546d;

        /* renamed from: e */
        public final /* synthetic */ int f224547e;

        /* renamed from: f */
        public final /* synthetic */ String f224548f;

        /* renamed from: g */
        public final /* synthetic */ String f224549g;

        public C76761c(int i, String str, int i2, boolean z, int i3, String str2, String str3) {
            this.f224543a = i;
            this.f224544b = str;
            this.f224545c = i2;
            this.f224546d = z;
            this.f224547e = i3;
            this.f224548f = str2;
            this.f224549g = str3;
        }

        public void onDismiss() {
            if (this.f224543a == 2) {
                C24982c0.m31599c(this.f224544b, 1, this.f224545c, this.f224546d ? 1 : 2, this.f224547e, this.f224548f, this.f224549g);
            }
            if (this.f224543a == 1) {
                C24982c0.m31598b(this.f224544b, this.f224545c, 3, 1, this.f224548f, this.f224549g);
            }
        }
    }

    /* renamed from: mi.b0$d */
    public interface C76762d {
        /* renamed from: a */
        void mo102497a();

        /* renamed from: b */
        void mo102498b();
    }

    /* renamed from: a */
    public static Pair<Boolean, String> m92496a(C72963f4 f4Var, C68070l.C68072b bVar) {
        String str;
        WxaAttributes N2;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "msginfo is null");
            return new Pair<>(Boolean.FALSE, "");
        } else if (bVar == null) {
            Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
            return new Pair<>(Boolean.FALSE, "");
        } else {
            long createTime = f4Var.getCreateTime();
            Class cls = C75700k0.class;
            Class cls2 = C77089d.class;
            C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
            if (Util.isNullOrNil(aVar.f237909r)) {
                str = "related_msgid_" + f4Var.mo108774y2();
            } else {
                str = aVar.f237909r;
            }
            C77711c Lo = ((C77089d) C86312j.m106911c(cls2)).wx0().mo107864Lo(f4Var.mo108768t(), str);
            if (Lo != null) {
                Log.m105921e("MicroMsg.roomTodo.RoomTodoHelp", "addTodoAppBrandImpl %s(%s) exist", str, Integer.valueOf(Lo.field_state));
                if (Lo.field_state != 2) {
                    return new Pair<>(Boolean.TRUE, Lo.field_todoid);
                }
                Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "addTodoAppBrandImpl delete %s", Boolean.valueOf(((C77089d) C86312j.m106911c(cls2)).wx0().mo107865jo(Lo)));
            }
            C77711c cVar = new C77711c();
            cVar.field_todoid = str;
            cVar.field_roomname = f4Var.mo108768t();
            cVar.field_username = bVar.f195573f2;
            cVar.field_path = bVar.f195569e2;
            cVar.field_createtime = createTime;
            cVar.field_updatetime = createTime;
            cVar.field_custominfo = "";
            String str2 = bVar.f195570f;
            if (Util.isNullOrNil(str2) && (N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar.f195573f2)) != null && !Util.isNullOrNil(N2.field_nickname)) {
                str2 = N2.field_nickname;
            }
            cVar.field_title = str2;
            cVar.field_creator = C67301m.m79637b(f4Var);
            cVar.field_manager = C75592q0.m90789s();
            cVar.field_nreply = 0;
            cVar.field_related_msgids = f4Var.mo108774y2() + "";
            cVar.field_shareKey = bVar.f195593k2;
            cVar.field_shareName = f4Var.mo108768t();
            boolean qq = ((C77089d) C86312j.m106911c(cls2)).wx0().insert(cVar);
            Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "addTodoBySendSuccess todoId:%s result:%s", cVar.field_todoid, Boolean.valueOf(qq));
            if (qq) {
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(f4Var.mo108768t(), f4Var.mo108774y2());
                h302.mo108737Q2(cVar.field_todoid);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(h302.getMsgId(), h302);
                NotifyGroupTodoEvent notifyGroupTodoEvent = new NotifyGroupTodoEvent();
                NotifyGroupTodoEvent.C67740a aVar2 = notifyGroupTodoEvent.f193762d;
                aVar2.f193763a = 0;
                aVar2.f193765c = cVar.field_todoid;
                aVar2.f193764b = f4Var.mo108768t();
                notifyGroupTodoEvent.asyncPublish(Looper.getMainLooper());
            }
            return new Pair<>(Boolean.valueOf(qq), cVar.field_todoid);
        }
    }

    /* renamed from: b */
    public static C77955jv3 m92497b(C77711c cVar) {
        C77955jv3 jv32 = new C77955jv3();
        jv32.f227698d = cVar.field_todoid;
        jv32.f227699e = cVar.field_username;
        jv32.f227700f = cVar.field_path;
        jv32.f227701g = (int) (cVar.field_createtime / 1000);
        jv32.f227703i = cVar.field_title;
        jv32.f227704j = cVar.field_creator;
        jv32.f227705n = cVar.mo107862m2();
        jv32.f227706o = cVar.field_manager;
        jv32.f227702h = C89349b.m111675b(cVar.field_custominfo);
        jv32.f227707p = cVar.field_shareKey;
        jv32.f227708q = cVar.field_shareName;
        return jv32;
    }

    /* renamed from: c */
    public static String m92498c(C72963f4 f4Var) {
        if (f4Var == null) {
            return "";
        }
        if (f4Var.mo100971J3()) {
            return "roomannouncement@app.origin";
        }
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (u == null) {
            Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "getAppUsernameFromMsginfo content is null");
            return "";
        } else if (((C80995a) u.mo93555w(C80995a.class)) != null) {
            return u.f195573f2;
        } else {
            Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "getAppUsernameFromMsginfo appContentAppBrandPiece is null");
            return "";
        }
    }

    /* renamed from: d */
    public static void m92499d(Context context, String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.roomTodo.RoomTodoHelp", "gotoRoomCard roomname is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("RoomInfo_Id", str);
        intent.putExtra("room_notice", C45612m0.m50687d(str));
        intent.putExtra("room_notice_xml", C45612m0.m50690g(str));
        intent.putExtra("room_notice_publish_time", C45612m0.m50689f(str));
        intent.putExtra("room_notice_editor", C45612m0.m50688e(str));
        intent.putExtra("from_scene", z ? 4 : 3);
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str);
        if (Lo != null) {
            intent.putExtra("Is_RoomOwner", Lo.field_roomowner.equals(C75592q0.m90789s()));
            intent.putExtra("Is_RoomManager", Lo.mo69793u2(C75592q0.m90789s()));
        }
        intent.putExtra("room_member_count", Lo.field_memberCount);
        if (z) {
            intent.setFlags(268435456);
        }
        ((C78415b) C86312j.m106911c(C78415b.class)).mo94224yh(context, intent);
    }

    /* renamed from: e */
    public static boolean m92500e(C77711c cVar) {
        return (cVar == null || cVar.field_state == 2) ? false : true;
    }

    /* renamed from: f */
    public static String m92501f(C77955jv3 jv32) {
        if (jv32 == null) {
            return "";
        }
        return "RoomToolsTodo{TodoId='" + jv32.f227698d + '\'' + ", Username='" + jv32.f227699e + '\'' + ", Path='" + jv32.f227700f + '\'' + ", Time=" + jv32.f227701g + ", CustomInfo=" + jv32.f227702h + ", Title='" + Util.secPrint(jv32.f227703i) + '\'' + ", Creator='" + jv32.f227704j + '\'' + ", RelatedMsgId=" + jv32.f227705n + ", Manager='" + jv32.f227706o + '\'' + '}';
    }

    /* renamed from: g */
    public static Pair<Boolean, String> m92502g(long j) {
        boolean z;
        Class cls = C75700k0.class;
        Class cls2 = C77089d.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
        if (Util.isNullOrNil(b002.f230738V)) {
            return new Pair<>(Boolean.FALSE, "");
        }
        C77711c Lo = ((C77089d) C86312j.m106911c(cls2)).wx0().mo107864Lo(b002.mo108768t(), b002.f230738V);
        if (Lo == null) {
            return new Pair<>(Boolean.FALSE, b002.f230738V);
        }
        long y2 = b002.mo108774y2();
        if (((ArrayList) Lo.f226492S).contains(Long.valueOf(y2))) {
            ((ArrayList) Lo.f226492S).remove(Long.valueOf(y2));
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayList) Lo.f226492S).iterator();
            while (it.hasNext()) {
                sb.append(((Long) it.next()).longValue());
                sb.append(",");
            }
            if (sb.length() - 1 >= 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            Lo.field_related_msgids = sb.toString();
        }
        if (((ArrayList) Lo.f226492S).size() == 0) {
            z = ((C77089d) C86312j.m106911c(cls2)).wx0().mo107865jo(Lo);
            NotifyGroupTodoEvent notifyGroupTodoEvent = new NotifyGroupTodoEvent();
            NotifyGroupTodoEvent.C67740a aVar = notifyGroupTodoEvent.f193762d;
            aVar.f193763a = 1;
            aVar.f193764b = Lo.field_roomname;
            aVar.f193765c = Lo.field_todoid;
            if (z) {
                notifyGroupTodoEvent.asyncPublish(Looper.getMainLooper());
            }
            Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByRevokeMsg delete result:%s", Boolean.valueOf(z));
        } else {
            C77712d wx02 = ((C77089d) C86312j.m106911c(cls2)).wx0();
            wx02.getClass();
            z = wx02.update(Lo.systemRowid, Lo);
            Log.m105925i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByRevokeMsg updateGroupTodo result:%s", Boolean.valueOf(z));
        }
        if (z) {
            b002.mo108737Q2("");
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(b002.getMsgId(), b002);
        }
        return new Pair<>(Boolean.TRUE, b002.f230738V);
    }

    /* renamed from: h */
    public static void m92503h(Context context, String str, String str2, String str3, boolean z, int i, int i2, int i3, C76762d dVar) {
        Context context2 = context;
        boolean z2 = z;
        C77407n nVar = new C77407n(context, 1, true);
        if (z2) {
            nVar.mo107568m(context.getString(C0966R.string.b4m), 17, C76577a.m92151b(context, 14));
        } else {
            nVar.mo107568m(context.getString(C0966R.string.b4l), 17, C76577a.m92151b(context, 14));
        }
        nVar.f225784p1 = true;
        nVar.f225771i = new C76759a(z2, context);
        nVar.f225782p = new C76760b(dVar, z, i, str, i2, i3, str2, str3);
        nVar.f225761d = new C76761c(i, str, i2, z, i3, str2, str3);
        nVar.mo107573q();
    }

    /* renamed from: i */
    public static boolean m92504i(C77711c cVar) {
        cVar.field_state = 2;
        cVar.field_updatetime = C31543z5.m39453c();
        C77712d wx02 = ((C77089d) C86312j.m106911c(C77089d.class)).wx0();
        wx02.getClass();
        return wx02.update(cVar.systemRowid, cVar);
    }

    /* renamed from: j */
    public static boolean m92505j(C77711c cVar) {
        cVar.field_state = 1;
        cVar.field_updatetime = C31543z5.m39453c();
        C77712d wx02 = ((C77089d) C86312j.m106911c(C77089d.class)).wx0();
        wx02.getClass();
        return wx02.update(cVar.systemRowid, cVar);
    }
}
