package com.tencent.p014mm.p136ui.chatting.component;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import bd0.C39755e;
import bp3.C79758p;
import ck3.C67391b;
import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.OpenChattingUIEvent;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.message.C40339m;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelsimple.C40367r;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73764n3;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.plugin.report.service.C70998a;
import com.tencent.p014mm.plugin.report.service.C71000b;
import com.tencent.p014mm.pluginsdk.model.C96790t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fk3.C59136a;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C46117w1;
import ie3.C87716k;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import nj3.C76912y0;
import p1029rf.C89940c;
import p154fy.C87121j;
import p270xi.C91212b;
import p680ru.C77569h;
import p761yd.C91440a;
import p761yd.C91441c;
import p789bi.C67242a;
import p789bi.C67244b;
import p873bx.C67328d;
import p995kf.C88146a;
import pf3.C110213h;
import qo3.C89779i0;
import qy2.C77457v;
import rb0.C48009v0;
import rx3.C13598b0;
import t90.C77878b;
import tc0.C48629h;
import tc0.C77885p;
import u73.C22613h1;
import ww0.C78732i;
import xy1.C53472h;
import zj3.C79348e;
import zj3.C79361h0;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79377q;
import zt3.C119157j;

@C91212b(exportInterface = C79361h0.class)
@Deprecated
/* renamed from: com.tencent.mm.ui.chatting.component.i3 */
public class C73497i3 extends C73412a implements C79361h0 {

    /* renamed from: e */
    public List<C72963f4> f215923e;

    /* renamed from: f */
    public int f215924f;

    /* renamed from: g */
    public String f215925g;

    /* renamed from: h */
    public boolean f215926h = false;

    /* renamed from: i */
    public boolean f215927i = false;

    /* renamed from: j */
    public C75875l.C75877b f215928j = new C73498a();

    /* renamed from: n */
    public C73764n3 f215929n = null;

    /* renamed from: com.tencent.mm.ui.chatting.component.i3$a */
    public class C73498a implements C75875l.C75877b {
        public C73498a() {
        }

        /* renamed from: w5 */
        public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            if (eVar != null && eVar.f123847d > 0 && !Util.isNullOrNil(eVar.f123844a) && eVar.f123844a.equalsIgnoreCase(C73497i3.this.f215752d.mo91577r())) {
                C73497i3.this.f215927i = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.i3$b */
    public class C73499b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f215931d;

        public C73499b(C72963f4 f4Var) {
            this.f215931d = f4Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C73497i3.m86889Y5(this.f215931d, C73497i3.this.f215752d.mo91577r());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.i3$c */
    public class C73500c implements DialogInterface.OnClickListener {
        public C73500c(C73497i3 i3Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.i3$d */
    public class C73501d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C74023i f215933d;

        /* renamed from: e */
        public final /* synthetic */ String f215934e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f215935f;

        /* renamed from: g */
        public final /* synthetic */ C89779i0 f215936g;

        /* renamed from: com.tencent.mm.ui.chatting.component.i3$d$a */
        public class C73502a implements Runnable {
            public C73502a() {
            }

            public void run() {
                C76912y0.m92769h(C73497i3.this.f215752d.mo91565f(), C73497i3.this.f215752d.mo91572m().getString(C0966R.string.ct6), C0966R.raw.icons_outlined_done);
            }
        }

        public C73501d(C74023i iVar, String str, C72963f4 f4Var, C89779i0 i0Var) {
            this.f215933d = iVar;
            this.f215934e = str;
            this.f215935f = f4Var;
            this.f215936g = i0Var;
        }

        public void run() {
            C74023i iVar = this.f215933d;
            String str = this.f215934e;
            C72963f4 f4Var = this.f215935f;
            iVar.getClass();
            C73497i3.m86889Y5(f4Var, str);
            C67328d.m79664b(1, this.f215935f, 1);
            this.f215936g.dismiss();
            ((C119157j) C119157j.f356862d).mo183895z(new C73502a());
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.i3$e */
    public class C73503e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f215939d;

        /* renamed from: e */
        public final /* synthetic */ String f215940e;

        /* renamed from: f */
        public final /* synthetic */ String f215941f;

        /* renamed from: g */
        public final /* synthetic */ String f215942g;

        /* renamed from: h */
        public final /* synthetic */ String f215943h;

        /* renamed from: i */
        public final /* synthetic */ int f215944i;

        /* renamed from: j */
        public final /* synthetic */ String f215945j;

        /* renamed from: n */
        public final /* synthetic */ int f215946n;

        public C73503e(C73497i3 i3Var, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) {
            this.f215939d = str;
            this.f215940e = str2;
            this.f215941f = str3;
            this.f215942g = str4;
            this.f215943h = str5;
            this.f215944i = i;
            this.f215945j = str6;
            this.f215946n = i2;
        }

        public void run() {
            C78732i.C53208a ka = ((C78732i) C86312j.m106911c(C78732i.class)).mo73881ka(this.f215939d);
            C22613h1.m26479e(2, this.f215940e, 34, 1, ka.f148428c, this.f215941f, this.f215942g, this.f215943h, this.f215944i, this.f215945j, (long) this.f215946n, (long) this.f215939d.length(), 1, ka.f148426a, ka.f148429d, ka.f148427b);
        }
    }

    /* renamed from: Y5 */
    public static void m86889Y5(C72963f4 f4Var, String str) {
        C77878b bVar;
        Class cls = C77569h.class;
        if (f4Var.mo100994f4()) {
            String s2 = f4Var.mo108765s2();
            synchronized (C96790t0.f283533w) {
                Log.m105925i("MicroMsg.ImportMultiVideo", "remove remuxing job, filename %s, ret %B", s2, Boolean.valueOf(C96790t0.f283532v.remove(s2) != null));
            }
        }
        C75604z3.m90834f(f4Var.getMsgId());
        C59136a.f169139a.mo84347b(f4Var, 0);
        int i = -1;
        if (f4Var.mo101020w3()) {
            i = C40339m.m43520a(f4Var);
            ((C77569h) C86312j.m106911c(cls)).mo35245rb(f4Var, i);
        } else {
            ((C77569h) C86312j.m106911c(cls)).Tc0(f4Var);
        }
        Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "delete msg, id:%d", Long.valueOf(f4Var.getMsgId()));
        if (!str.equals("medianote")) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
        }
        if (f4Var.getStatus() == 1 && f4Var.mo108769t2() == 1) {
            Log.m105918d("MicroMsg.ChattingUI.MessBoxComponent", "delete a sending msg, publish SendMsgFailEvent");
            SendMsgFailEvent sendMsgFailEvent = new SendMsgFailEvent();
            sendMsgFailEvent.f193928d.f193929a = f4Var;
            sendMsgFailEvent.publish();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(f4Var.mo108774y2() + "");
        if (!(i != 6 || (bVar = (C77878b) C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2()).mo93555w(C77878b.class)) == null || bVar.f226901b == 0)) {
            linkedList.add(bVar.f226901b + "");
            Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "add file overwritenewmsgid %s", Long.valueOf(bVar.f226901b));
        }
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71223wE(f4Var.mo108768t(), 9, "deleteMessages", Util.listToString(linkedList, ","));
    }

    /* renamed from: F4 */
    public void mo26186F4() {
        C87716k.f253994a = 6;
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
        aVar.f193972a = 0;
        C67391b bVar = this.f215752d;
        if (bVar != null) {
            aVar.f193975d = bVar.mo91568i();
            uIStatusChangedEvent.f193971d.f193973b = this.f215752d.mo91566g();
            uIStatusChangedEvent.f193971d.f193974c = this.f215752d.mo91569j();
        }
        uIStatusChangedEvent.publish();
        MMEntryLock.lock("keep_chatting_silent" + this.f215752d.mo91577r());
        ((MMNotification) C97625j3.m125816f()).f194715b = this.f215752d.mo91577r();
        MMAppMgr.m85986f();
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        uIStatusChangedEvent.f193971d.f193972a = 1;
        uIStatusChangedEvent.publish();
        ((MMNotification) C97625j3.m125816f()).f194715b = "";
        MMEntryLock.unlock("keep_app_silent");
        MMEntryLock.unlock("keep_chatting_silent" + this.f215752d.mo91577r());
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Boolean.valueOf(intent == null);
        objArr[2] = this.f215752d.mo91577r();
        Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult requestCode:%d, data is null:%b  rawUserName:%s ", objArr);
        if (i != 211) {
            if (i != 213) {
                Log.m105920e("MicroMsg.ChattingUI.MessBoxComponent", "onActivityResult: not found this requestCode");
            } else if (intent != null && intent.getBooleanExtra("_delete_ok_", false)) {
                this.f215752d.mo91563d();
            }
        } else if (i2 == -1) {
            Uri data = intent.getData();
            C67391b bVar = this.f215752d;
            Cursor managedQuery = bVar != null ? bVar.mo91565f().managedQuery(data, (String[]) null, (String) null, (String[]) null, (String) null) : null;
            if (managedQuery.moveToFirst()) {
                String string = managedQuery.getString(managedQuery.getColumnIndexOrThrow("_id"));
                Intent intent2 = new Intent("android.intent.action.EDIT", Uri.parse("content://com.android.contacts/contacts/" + string));
                BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
                C117292a.m165358d(baseChattingUIFragment2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/MessBoxComponent", "doActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/MessBoxComponent", "doActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Class cls = C79348e.class;
        C67244b bVar = C67244b.C67246b.f193087a;
        String r = this.f215752d.mo91577r();
        bVar.getClass();
        if (!Util.isNullOrNil(r)) {
            C67242a aVar = bVar.f193086f;
            synchronized (aVar) {
                Log.m105925i("MicroMsg.NotificationAppMsgQueue", "remove username: %s", r);
                if (!Util.isNullOrNil(r)) {
                    if (aVar.f193077d == null) {
                        aVar.mo91388i();
                    }
                    Iterator<C67242a.C67243a> it = aVar.f193077d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C67242a.C67243a next = it.next();
                        if (r.equals(next.f193080f)) {
                            aVar.f193077d.remove(next);
                            aVar.mo91390k();
                            break;
                        }
                    }
                }
            }
        }
        if (this.f215752d.mo91583x()) {
            C39755e.f106663g = 1;
        } else {
            C39755e.f106663g = 0;
        }
        List<C72963f4> list = this.f215923e;
        if (list != null) {
            list.clear();
        }
        if (((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70071q1()) {
            this.f215923e = ((C79348e) this.f215752d.f193278b.mo102812a(cls)).mo70049B3();
        } else {
            int i = 100;
            if (((C79365j) this.f215752d.f193278b.mo102812a(C79365j.class)).mo70105e4()) {
                int min = Math.min(100, ((C46117w1) C86312j.m106911c(C46117w1.class)).mo64582V(this.f215752d.mo91577r()));
                if (min > 0) {
                    this.f215923e = ((C72972g4) C97625j3.m125812b().mo105911z()).Nx0(this.f215752d.mo91577r(), min);
                }
            } else {
                if (((C79366k) this.f215752d.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                    int min2 = Math.min(100, ((C53472h) C86312j.m106911c(C53472h.class)).mo70726V(this.f215752d.mo91577r()));
                    if (min2 > 0) {
                        this.f215923e = ((C72972g4) C97625j3.m125812b().mo105911z()).Nx0(this.f215752d.mo91577r(), min2);
                    }
                } else {
                    if (((C79377q) this.f215752d.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                        int min3 = Math.min(100, ((C77457v) C86312j.m106911c(C77457v.class)).mo74148V(this.f215752d.mo91577r()));
                        if (min3 > 0) {
                            this.f215923e = ((C72972g4) C97625j3.m125812b().mo105911z()).Nx0(this.f215752d.mo91577r(), min3);
                        }
                    } else {
                        C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215752d.mo91577r());
                        if (j != null && j.mo108786G2() > 0) {
                            if (j.mo108786G2() <= 100) {
                                i = j.mo108786G2();
                            }
                            if (i > 0) {
                                this.f215923e = ((C72972g4) C97625j3.m125812b().mo105911z()).Nx0(this.f215752d.mo91577r(), i);
                            }
                        }
                    }
                }
            }
        }
        if (this.f215923e == null) {
            this.f215923e = new LinkedList();
        }
        this.f215924f = this.f215923e.size();
    }

    /* renamed from: P0 */
    public List<C72963f4> mo102465P0() {
        return this.f215923e;
    }

    /* renamed from: R3 */
    public boolean mo102466R3(String str, C72996z1 z1Var) {
        C67391b bVar;
        Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "[writeOpLogAndMarkRead] username:%s isTContact:%s thread name:%s", str, Boolean.valueOf(C72996z1.m85798E5(str)), Thread.currentThread().getName());
        if (!C86709a0.m107523b().mo121114l()) {
            Log.m105928w("MicroMsg.ChattingUI.MessBoxComponent", "account not init.");
            return false;
        } else if (C72996z1.m85798E5(str) || (bVar = this.f215752d) == null) {
            Cursor zs02 = ((C72972g4) C97625j3.m125812b().mo105911z()).zs0(str);
            boolean z = zs02.getCount() > 0;
            zs02.close();
            if (z) {
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(str);
                ((C72972g4) C97625j3.m125812b().mo105911z()).By0(str);
            } else {
                Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "unread count is 0, not need to update unread by Talker %s", str);
            }
            return z;
        } else {
            C79348e eVar = (C79348e) bVar.f193278b.mo102812a(C79348e.class);
            if (eVar != null) {
                return eVar.mo70070m0(z1Var, str);
            }
            Log.m105920e("MicroMsg.ChattingUI.MessBoxComponent", "[writeOpLogAndMarkRead] ");
            return false;
        }
    }

    /* renamed from: X5 */
    public void mo102328X5(View view, int i) {
        if (i == 0) {
            UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
            UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
            aVar.f193972a = 5;
            aVar.f193973b = this.f215752d.mo91566g();
            uIStatusChangedEvent.f193971d.f193974c = this.f215752d.mo91569j();
            uIStatusChangedEvent.f193971d.f193975d = this.f215752d.mo91568i();
            uIStatusChangedEvent.publish();
        }
    }

    /* renamed from: Y2 */
    public int mo102467Y2() {
        return this.f215924f;
    }

    /* renamed from: e */
    public void mo70065e() {
        boolean booleanValue = this.f215752d.f193286j.getBooleanExtra("key_is_temp_session", false).booleanValue();
        this.f215926h = booleanValue;
        if (booleanValue) {
            C97625j3.m125815e().mo123460f(new C40367r(this.f215752d.mo91577r(), this.f215752d.f193286j.getIntExtra("key_temp_session_scene", 5), this.f215752d.f193286j.getStringExtra("key_temp_session_from"), (byte[]) null, 0));
        }
        if (!this.f215752d.mo91574o().mo62916m3() || this.f215752d.mo91574o().mo62927s3()) {
            this.f215926h = false;
        } else {
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215752d.mo91577r());
            if (j == null) {
                if (this.f215926h) {
                    C72976h2 h2Var = new C72976h2(this.f215752d.mo91577r());
                    h2Var.mo108371j3(4194304);
                    h2Var.mo101162m3();
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69751W(h2Var);
                }
            } else if (j.mo108372k3(4194304)) {
                this.f215926h = true;
            } else if (j.mo108821o2() < C48009v0.Nx0()) {
                Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "It is a old version temp session, Set attr flag(talker : %s), %s", this.f215752d.mo91577r(), Boolean.valueOf(((C44660i2) C97625j3.m125812b().mo105908w()).mo69776n0(this.f215752d.mo91577r(), 4194304, true, j.mo108819m2())));
                this.f215926h = true;
            } else if (this.f215926h) {
                Log.m105925i("MicroMsg.ChattingUI.MessBoxComponent", "It is a temp session, Set attr flag(talker : %s), %s", this.f215752d.mo91577r(), Boolean.valueOf(((C44660i2) C97625j3.m125812b().mo105908w()).mo69776n0(this.f215752d.mo91577r(), 4194304, true, j.mo108819m2())));
            }
        }
        Log.m105919d("MicroMsg.ChattingUI.MessBoxComponent", "is temp session : %s.", Boolean.valueOf(this.f215926h));
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        uIStatusChangedEvent.f193971d.f193972a = 4;
        uIStatusChangedEvent.publish();
        if (this.f215752d != null) {
            Looper.myQueue().addIdleHandler(new C73514k3(this));
        }
        OpenChattingUIEvent openChattingUIEvent = new OpenChattingUIEvent();
        openChattingUIEvent.f107684d.f107685a = this.f215752d.mo91577r();
        openChattingUIEvent.publish();
        ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9(this.f215752d.mo91577r(), 2);
        this.f215927i = false;
        if (C91441c.m114729c() && this.f215752d.f193286j.getActivity() != null) {
            C91440a aVar = C91440a.INSTANCE;
            ProcessUILifecycleOwner.f235399x.getClass();
            this.f215925g = ProcessUILifecycleOwner.f235398w;
            String name = this.f215752d.f193286j.getActivity().getClass().getName();
            aVar.mo125376c(name + "#" + this.f215752d.f193286j.getClass().getSimpleName());
        }
        if (((Integer) C79758p.f233760a.mo109880c(new C110213h())).intValue() == 1) {
            ViewGroup D = this.f215752d.mo91570k().mo81289D();
            C87412m.m108594g(D, "view");
            if (Build.VERSION.SDK_INT >= 24 && C91441c.m114729c() && (D instanceof RecyclerView)) {
                Object tag = D.getTag(C0966R.C0970id.o_l);
                if ((tag instanceof C70998a ? (C70998a) tag : null) == null) {
                    C70998a aVar2 = new C70998a("chatting", (AbsListView.OnScrollListener) null, 2, (C8480h) null);
                    ((RecyclerView) D).mo17043c(aVar2);
                    D.setTag(C0966R.C0970id.o_l, aVar2);
                    C89940c cVar = ((C88146a) C91441c.m114730d().mo125377a(C88146a.class)).f254918n;
                    C71000b bVar = aVar2.f205469g;
                    synchronized (cVar.f258456o) {
                        cVar.f258456o.add(bVar);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
        }
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this.f215928j);
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        if (this.f215927i) {
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9(this.f215752d.mo91577r(), 5);
            this.f215927i = false;
        }
        if (((Integer) C79758p.f233760a.mo109880c(new C110213h())).intValue() == 1) {
            ViewGroup D = this.f215752d.mo91570k().mo81289D();
            C87412m.m108594g(D, "view");
            if (Build.VERSION.SDK_INT >= 24 && C91441c.m114729c() && (D instanceof RecyclerView)) {
                Object tag = D.getTag(C0966R.C0970id.o_l);
                C70998a aVar = tag instanceof C70998a ? (C70998a) tag : null;
                if (aVar != null) {
                    ((RecyclerView) D).mo17098m1(aVar);
                    D.setTag(C0966R.C0970id.o_l, (Object) null);
                    C89940c cVar = ((C88146a) C91441c.m114730d().mo125377a(C88146a.class)).f254918n;
                    C71000b bVar = aVar.f205469g;
                    synchronized (cVar.f258456o) {
                        cVar.f258456o.remove(bVar);
                    }
                }
            }
        }
    }

    /* renamed from: o1 */
    public boolean mo102468o1() {
        return this.f215926h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x051a, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x07cd, code lost:
        if (r4.isEmpty() == false) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x08a0, code lost:
        if (r15 != false) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x093c, code lost:
        if (r15 != false) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0a6f, code lost:
        if (r15 == false) goto L_0x0a72;
     */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0a0d  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0a0f  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0a12  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0a15 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016b  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo102469t(android.view.MenuItem r36, int r37, com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r38) {
        /*
            r35 = this;
            r11 = r35
            r0 = r38
            java.lang.Class<wt.c> r1 = p744wt.C66190c.class
            java.lang.Class<gt.k> r2 = p158gt.C98201k.class
            java.lang.Class<zj3.w> r3 = zj3.C79387w.class
            java.lang.Class<ww0.i> r12 = ww0.C78732i.class
            ck3.b r4 = r11.f215752d
            java.lang.Class<zj3.l> r5 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r4 = r4.f193278b
            xi.d r4 = r4.mo102812a(r5)
            zj3.l r4 = (zj3.C79368l) r4
            int r5 = r36.getGroupId()
            com.tencent.mm.storage.f4 r5 = r4.getItem(r5)
            r36.getGroupId()
            if (r5 != 0) goto L_0x002d
            java.lang.String r0 = "MicroMsg.ChattingUI.MessBoxComponent"
            java.lang.String r1 = "context item select failed, null msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x002d:
            boolean r4 = r0 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74103m
            if (r4 == 0) goto L_0x0039
            java.lang.String r0 = "MicroMsg.ChattingUI.MessBoxComponent"
            java.lang.String r1 = "appbrand notify item long click, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            return
        L_0x0039:
            ck3.b r4 = r11.f215752d
            java.lang.Class<zj3.i0> r6 = zj3.C79364i0.class
            com.tencent.mm.ui.chatting.manager.a r4 = r4.f193278b
            xi.d r4 = r4.mo102812a(r6)
            zj3.i0 r4 = (zj3.C79364i0) r4
            r6 = r36
            r7 = r37
            r4.mo102500t(r6, r7, r0)
            int r4 = r36.getItemId()
            r7 = 100
            if (r4 == r7) goto L_0x0bf1
            r7 = 114(0x72, float:1.6E-43)
            r8 = 2
            r15 = 0
            r14 = 1
            if (r4 == r7) goto L_0x0aca
            r7 = 116(0x74, float:1.63E-43)
            r9 = 6
            r10 = 0
            if (r4 == r7) goto L_0x05a2
            r7 = 129(0x81, float:1.81E-43)
            if (r4 == r7) goto L_0x04ca
            r2 = 150(0x96, float:2.1E-43)
            if (r4 == r2) goto L_0x0459
            r2 = 122(0x7a, float:1.71E-43)
            if (r4 == r2) goto L_0x0449
            r2 = 123(0x7b, float:1.72E-43)
            if (r4 == r2) goto L_0x02cc
            switch(r4) {
                case 136: goto L_0x02bd;
                case 137: goto L_0x00eb;
                case 138: goto L_0x0094;
                case 139: goto L_0x0085;
                case 140: goto L_0x0076;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x05aa
        L_0x0076:
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            zj3.w r0 = (zj3.C79387w) r0
            r0.mo102198w3(r8, r5)
            goto L_0x05aa
        L_0x0085:
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            zj3.w r0 = (zj3.C79387w) r0
            r0.mo102198w3(r14, r5)
            goto L_0x05aa
        L_0x0094:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            java.lang.String r2 = "com.tencent.mm.plugin.repairer.ui.RepairerMsgDebugUI"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "Chat_Msg_Id"
            long r2 = r5.getMsgId()
            r0.putExtra(r1, r2)
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/chatting/component/MessBoxComponent"
            java.lang.String r5 = "dealWithLongClick"
            java.lang.String r6 = "(Landroid/view/MenuItem;ILcom/tencent/mm/ui/chatting/viewitems/ChattingItem;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r0 = r10.mo10231a(r15)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r3 = "com/tencent/mm/ui/chatting/component/MessBoxComponent"
            java.lang.String r4 = "dealWithLongClick"
            java.lang.String r5 = "(Landroid/view/MenuItem;ILcom/tencent/mm/ui/chatting/viewitems/ChattingItem;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x05aa
        L_0x00eb:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r0 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextSearch
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            boolean r0 = r0.checkAvailable(r1)
            if (r0 != 0) goto L_0x00fb
            goto L_0x05aa
        L_0x00fb:
            boolean r0 = r5.mo100993e4()
            if (r0 != 0) goto L_0x0132
            boolean r0 = r5.mo100987Z3()
            if (r0 != 0) goto L_0x0132
            boolean r0 = r5.mo100963C3()
            if (r0 == 0) goto L_0x010e
            goto L_0x0132
        L_0x010e:
            boolean r0 = r5.mo100979R3()
            if (r0 == 0) goto L_0x05aa
            u73.r r0 = new u73.r
            r0.<init>()
            r0.f300285d = r14
            r0.f300284c = r5
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            r0.f300283b = r1
            java.lang.Class<u73.n> r1 = u73.C101980n.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            u73.n r1 = (u73.C101980n) r1
            r1.mo134683D6(r0)
            goto L_0x05aa
        L_0x0132:
            java.lang.String r0 = r5.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r0 == 0) goto L_0x0145
            java.lang.String r1 = r5.getContent()
            java.lang.String r1 = eb0.C75604z3.m90846r(r1)
            goto L_0x0149
        L_0x0145:
            java.lang.String r1 = r5.getContent()
        L_0x0149:
            java.lang.String r2 = ""
            boolean r3 = r5.mo100963C3()
            if (r3 != 0) goto L_0x015a
            boolean r3 = r5.mo100987Z3()
            if (r3 == 0) goto L_0x0158
            goto L_0x015a
        L_0x0158:
            r13 = r1
            goto L_0x0164
        L_0x015a:
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r1, r10)
            if (r1 == 0) goto L_0x0163
            java.lang.String r1 = r1.f195570f
            goto L_0x0158
        L_0x0163:
            r13 = r2
        L_0x0164:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r1 == 0) goto L_0x016b
            return
        L_0x016b:
            java.lang.Class<vr.e> r1 = p255vr.C65873e.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            vr.e r1 = (p255vr.C65873e) r1
            r10 = 34
            java.lang.String r9 = r1.ep0(r10)
            ck3.b r1 = r11.f215752d
            boolean r1 = r1.mo91582w()
            if (r1 == 0) goto L_0x0184
            r24 = 2
            goto L_0x0186
        L_0x0184:
            r24 = 1
        L_0x0186:
            ck3.b r1 = r11.f215752d
            boolean r1 = r1.mo91582w()
            if (r1 == 0) goto L_0x0195
            ck3.b r1 = r11.f215752d
            java.lang.String r1 = r1.mo91577r()
            goto L_0x0197
        L_0x0195:
            java.lang.String r1 = "0"
        L_0x0197:
            r25 = r1
            int r1 = r5.mo108769t2()
            if (r1 == 0) goto L_0x01a8
            ck3.b r0 = r11.f215752d
            java.lang.String r0 = r0.mo91573n()
        L_0x01a5:
            r23 = r0
            goto L_0x01b8
        L_0x01a8:
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = r5.getContent()
            java.lang.String r0 = eb0.C75604z3.m90847s(r0)
            goto L_0x01a5
        L_0x01b3:
            java.lang.String r0 = r5.mo108768t()
            goto L_0x01a5
        L_0x01b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r5.mo108774y2()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r22 = r0.toString()
            di3.d r0 = di3.C86312j.m106911c(r12)
            ww0.i r0 = (ww0.C78732i) r0
            java.lang.String r21 = r0.I80()
            di3.d r0 = di3.C86312j.m106911c(r12)
            ww0.i r0 = (ww0.C78732i) r0
            java.lang.String r0 = r0.Lp0(r13)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r34 = r1 ^ 1
            di3.d r1 = di3.C86312j.m106911c(r12)
            ww0.i r1 = (ww0.C78732i) r1
            int r8 = r1.mo73878MS()
            if (r34 == 0) goto L_0x021a
            zt3.t r16 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.component.i3$e r7 = new com.tencent.mm.ui.chatting.component.i3$e
            r1 = r7
            r2 = r35
            r3 = r13
            r4 = r9
            r5 = r21
            r6 = r22
            r15 = r7
            r7 = r23
            r36 = r8
            r8 = r24
            r38 = r9
            r9 = r25
            r14 = 34
            r10 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r16
            zt3.j r1 = (zt3.C119157j) r1
            r1.mo183875f(r15)
            goto L_0x0241
        L_0x021a:
            r36 = r8
            r38 = r9
            r14 = 34
            r16 = 2
            r18 = 34
            r19 = 0
            java.lang.String r20 = ""
            r1 = r36
            long r1 = (long) r1
            r26 = r1
            int r1 = r13.length()
            long r1 = (long) r1
            r28 = r1
            r30 = 1
            java.lang.String r31 = ""
            java.lang.String r32 = ""
            r33 = -1
            r17 = r38
            u73.C22613h1.m26479e(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33)
        L_0x0241:
            u73.p0 r1 = new u73.p0
            r1.<init>()
            ck3.b r2 = r11.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r1.f39544a = r2
            r1.f39545b = r14
            r1.f39547d = r13
            r2 = r38
            r1.f39548e = r2
            r2 = 1
            r1.f39549f = r2
            r1.f39551h = r2
            r3 = 0
            r1.f39552i = r3
            r1.f39560q = r2
            ck3.b r2 = r11.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r4 = 2131101833(0x7f060889, float:1.7816087E38)
            int r2 = kg3.C76577a.m92153d(r2, r4)
            r1.f39554k = r2
            r1.f39555l = r3
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f39550g
            java.lang.String r3 = "chatSearch"
            java.lang.String r4 = "1"
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r4)
            if (r34 == 0) goto L_0x02b0
            di3.d r2 = di3.C86312j.m106911c(r12)
            ww0.i r2 = (ww0.C78732i) r2
            java.lang.String r2 = r2.js0(r0)
            di3.d r3 = di3.C86312j.m106911c(r12)
            ww0.i r3 = (ww0.C78732i) r3
            java.lang.String r0 = r3.Sg0(r0, r13)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x02a1
            java.util.Map<java.lang.String, java.lang.String> r3 = r1.f39561r
            java.lang.String r4 = "exposedFingerWord"
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.put(r4, r2)
        L_0x02a1:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x02b0
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f39561r
            java.lang.String r3 = "matchedFingerWord"
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r3, r0)
        L_0x02b0:
            java.lang.Class<u73.p> r0 = u73.C101982p.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            u73.p r0 = (u73.C101982p) r0
            r0.mo6877X6(r1)
            goto L_0x05aa
        L_0x02bd:
            ck3.b r0 = r11.f215752d
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r3)
            zj3.w r0 = (zj3.C79387w) r0
            r0.mo102182S4(r5)
            goto L_0x05aa
        L_0x02cc:
            java.lang.String r2 = "MicroMsg.ChattingUI.MessBoxComponent"
            java.lang.String r3 = "[oneliang][longclick_menu_revoke] type:%d,item.getGroupId:%d"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            int r7 = r5.getType()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 0
            r4[r9] = r7
            int r6 = r36.getGroupId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 1
            r4[r7] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r4)
            oa1.d r2 = oa1.C117731d.m166007c()
            xf3.a r3 = new xf3.a
            r3.<init>()
            int r2 = r2.mo182440a(r3)
            if (r2 != r7) goto L_0x02fc
            r2 = 1
            goto L_0x02fd
        L_0x02fc:
            r2 = 0
        L_0x02fd:
            pc0.x r3 = pc0.C77068x.f225120a
            long r3 = r5.getMsgId()
            java.util.HashMap<java.lang.Long, pc0.x$a> r6 = pc0.C77068x.f225121b
            monitor-enter(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0446 }
            java.lang.Object r4 = r6.get(r3)     // Catch:{ all -> 0x0446 }
            if (r4 != 0) goto L_0x0323
            pc0.x$a r4 = new pc0.x$a     // Catch:{ all -> 0x0446 }
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 15
            r19 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r17, r18, r19)     // Catch:{ all -> 0x0446 }
            r6.put(r3, r4)     // Catch:{ all -> 0x0446 }
        L_0x0323:
            r3 = r4
            pc0.x$a r3 = (pc0.C77068x.C77069a) r3     // Catch:{ all -> 0x0446 }
            long r9 = eb0.C31543z5.m39453c()     // Catch:{ all -> 0x0446 }
            r3.f225124c = r9     // Catch:{ all -> 0x0446 }
            int r7 = r5.getStatus()     // Catch:{ all -> 0x0446 }
            if (r7 != r8) goto L_0x0334
            r7 = 1
            goto L_0x0335
        L_0x0334:
            r7 = 0
        L_0x0335:
            r3.f225125d = r7     // Catch:{ all -> 0x0446 }
            pc0.x$a r4 = (pc0.C77068x.C77069a) r4     // Catch:{ all -> 0x0446 }
            monitor-exit(r6)
            java.lang.String r3 = "MMRevoke.MicroMsg.ChattingUI.MessBoxComponent"
            java.lang.String r4 = "revoke begin msgid:%s type:%s isSupportRevokeSendingMsg:%s"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            long r9 = r5.getMsgId()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r9 = 0
            r6[r9] = r7
            int r7 = r5.getType()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r6[r9] = r7
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)
            boolean r2 = r5.mo100962B3()
            if (r2 == 0) goto L_0x03b7
            java.lang.String r2 = r5.getContent()
            if (r2 == 0) goto L_0x03a2
            java.lang.String r3 = r5.mo108775z2()
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
            if (r2 == 0) goto L_0x03b7
            java.lang.Class<y50.q0> r3 = y50.C66541q0.class
            com.tencent.mm.message.g r2 = r2.mo93555w(r3)
            y50.q0 r2 = (y50.C66541q0) r2
            java.lang.String r2 = r2.f191394b
            long r2 = java.lang.Long.parseLong(r2)
            di3.d r4 = di3.C86312j.m106911c(r1)
            wt.c r4 = (p744wt.C66190c) r4
            long r6 = r4.zt0()
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x03b7
            di3.d r1 = di3.C86312j.m106911c(r1)
            wt.c r1 = (p744wt.C66190c) r1
            ck3.b r2 = r11.f215752d
            android.app.Activity r2 = r2.mo91565f()
            r1.ud0(r2)
            goto L_0x03b7
        L_0x03a2:
            java.lang.String r1 = "MicroMsg.ChattingUI.MessBoxComponent"
            java.lang.String r2 = "deal revoke live xml is null, msgid:%s"
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r6 = r5.getMsgId()
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r6 = 0
            r4[r6] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r4)
        L_0x03b7:
            int r1 = r5.getType()
            r2 = 419430449(0x19000031, float:6.6174836E-24)
            if (r1 != r2) goto L_0x03d1
            ck3.b r0 = r11.f215752d
            java.lang.Class<zj3.q0> r1 = zj3.C79378q0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.q0 r0 = (zj3.C79378q0) r0
            r0.mo102403j2(r5)
            goto L_0x05aa
        L_0x03d1:
            boolean r1 = hd0.C98429r0.m127830u()
            if (r1 == 0) goto L_0x03f1
            boolean r1 = r5.mo100994f4()
            if (r1 == 0) goto L_0x03f1
            int r1 = r5.mo108769t2()
            r2 = 1
            if (r1 != r2) goto L_0x03f1
            int r1 = r5.getStatus()
            if (r1 == r8) goto L_0x03f1
            java.lang.String r1 = r5.mo108765s2()
            hd0.C98429r0.m127835z(r1)
        L_0x03f1:
            boolean r1 = r38.mo103033l0()
            pc0.x r2 = pc0.C77068x.f225120a
            boolean r1 = r2.mo107379b(r5, r1)
            if (r1 == 0) goto L_0x0433
            ck3.b r1 = r11.f215752d
            android.app.Activity r12 = r1.mo91565f()
            r13 = 0
            ck3.b r1 = r11.f215752d
            android.content.res.Resources r1 = r1.mo91572m()
            r2 = 2131823640(0x7f110c18, float:1.9280085E38)
            java.lang.String r14 = r1.getString(r2)
            r15 = 1
            r16 = 0
            r17 = 0
            qo3.i0 r6 = nj3.C76879j.m92723Q(r12, r13, r14, r15, r16, r17)
            ck3.b r1 = r11.f215752d
            java.lang.String r4 = r1.mo91577r()
            zt3.t r7 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.component.i3$d r8 = new com.tencent.mm.ui.chatting.component.i3$d
            r1 = r8
            r2 = r35
            r3 = r38
            r1.<init>(r3, r4, r5, r6)
            zt3.j r7 = (zt3.C119157j) r7
            r7.mo183875f(r8)
            goto L_0x05aa
        L_0x0433:
            ck3.b r0 = r11.f215752d
            java.lang.Class<zj3.s0> r1 = zj3.C53793s0.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.s0 r0 = (zj3.C53793s0) r0
            java.lang.String r1 = ""
            r0.mo74367R4(r5, r1)
            goto L_0x05aa
        L_0x0446:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0449:
            ck3.b r0 = r11.f215752d
            java.lang.Class<zj3.m> r1 = zj3.C79369m.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.m r0 = (zj3.C79369m) r0
            r0.mo102681X2(r5)
            return
        L_0x0459:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            int r1 = r5.getType()
            r2 = 1090519089(0x41000031, float:8.000047)
            if (r1 != r2) goto L_0x0473
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI"
            r0.setClassName(r1, r2)
            goto L_0x047e
        L_0x0473:
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.AppAttachDownloadUI"
            r0.setClassName(r1, r2)
        L_0x047e:
            java.lang.String r1 = "app_msg_id"
            long r2 = r5.getMsgId()
            r0.putExtra(r1, r2)
            java.lang.String r1 = "choose_way"
            r3 = 1
            r0.putExtra(r1, r3)
            ck3.b r1 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/chatting/component/MessBoxComponent"
            java.lang.String r5 = "dealWithLongClick"
            java.lang.String r6 = "(Landroid/view/MenuItem;ILcom/tencent/mm/ui/chatting/viewitems/ChattingItem;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            java.lang.Object r0 = r10.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r3 = "com/tencent/mm/ui/chatting/component/MessBoxComponent"
            java.lang.String r4 = "dealWithLongClick"
            java.lang.String r5 = "(Landroid/view/MenuItem;ILcom/tencent/mm/ui/chatting/viewitems/ChattingItem;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x05aa
        L_0x04ca:
            r3 = 1
            ck3.b r0 = r11.f215752d
            boolean r0 = r0.mo91583x()
            java.lang.String r1 = r5.getContent()
            int r4 = r5.mo108769t2()
            java.lang.String r0 = eb0.C75604z3.m90840l(r0, r1, r4)
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r10)
            if (r0 == 0) goto L_0x04fe
            int r1 = r0.f195582i
            if (r1 == r9) goto L_0x04e9
            if (r1 != r8) goto L_0x04fe
        L_0x04e9:
            com.tencent.mm.pluginsdk.model.app.e r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r0 = r0.f195606o
            com.tencent.mm.pluginsdk.model.app.d r0 = r1.mo100154qq(r0)
            if (r0 == 0) goto L_0x051a
            java.lang.String r0 = r0.field_fileFullPath
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x051c
            goto L_0x051a
        L_0x04fe:
            boolean r0 = r5.mo100979R3()
            if (r0 == 0) goto L_0x051c
            di3.d r0 = di3.C86312j.m106911c(r2)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.mo127166LL(r5)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x051c
        L_0x051a:
            r14 = 0
            goto L_0x051d
        L_0x051c:
            r14 = 1
        L_0x051d:
            ck3.b r0 = r11.f215752d
            java.lang.Class<zj3.g1> r1 = zj3.C79359g1.class
            com.tencent.mm.ui.chatting.manager.a r0 = r0.f193278b
            xi.d r0 = r0.mo102812a(r1)
            zj3.g1 r0 = (zj3.C79359g1) r0
            boolean r0 = r0.mo102710l0(r5, r14)
            if (r0 != 0) goto L_0x054d
            ck3.b r0 = r11.f215752d
            android.app.Activity r0 = r0.mo91565f()
            ck3.b r1 = r11.f215752d
            android.content.res.Resources r1 = r1.mo91572m()
            r2 = 2131824453(0x7f110f45, float:1.9281734E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = ""
            com.tencent.mm.ui.chatting.component.i3$c r3 = new com.tencent.mm.ui.chatting.component.i3$c
            r3.<init>(r11)
            nj3.C76879j.m92750u(r0, r1, r2, r3, r10)
            return
        L_0x054d:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            ck3.b r1 = r11.f215752d
            android.app.Activity r1 = r1.mo91565f()
            java.lang.String r2 = "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI"
            r0.setClassName(r1, r2)
            java.lang.String r1 = "Retr_Msg_Id"
            long r2 = r5.getMsgId()
            r0.putExtra(r1, r2)
            ck3.b r1 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r1 = r1.f193286j
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/ui/chatting/component/MessBoxComponent"
            java.lang.String r5 = "dealWithLongClick"
            java.lang.String r6 = "(Landroid/view/MenuItem;ILcom/tencent/mm/ui/chatting/viewitems/ChattingItem;)V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "startActivity"
            java.lang.String r9 = "(Landroid/content/Intent;)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r4 = 0
            java.lang.Object r0 = r10.mo10231a(r4)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r3 = "com/tencent/mm/ui/chatting/component/MessBoxComponent"
            java.lang.String r4 = "dealWithLongClick"
            java.lang.String r5 = "(Landroid/view/MenuItem;ILcom/tencent/mm/ui/chatting/viewitems/ChattingItem;)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "startActivity"
            java.lang.String r8 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x05aa
        L_0x05a2:
            r3 = 1
            r4 = 0
            boolean r1 = com.tencent.p014mm.p136ui.chatting.C73764n3.m87369a(r5)
            if (r1 != 0) goto L_0x05ad
        L_0x05aa:
            r1 = r11
            goto L_0x0bf0
        L_0x05ad:
            ck3.b r1 = r11.f215752d
            r6 = 2131823349(0x7f110af5, float:1.9279495E38)
            boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88386h(r1, r5, r6)
            if (r1 != 0) goto L_0x0ac6
            ck3.b r1 = r11.f215752d
            r6 = 2131823347(0x7f110af3, float:1.9279491E38)
            boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7.m88385g(r1, r5, r6)
            if (r1 != 0) goto L_0x0ac6
            ub1.a r1 = new ub1.a
            ck3.b r6 = r11.f215752d
            java.lang.Class<zj3.e> r7 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r7)
            zj3.e r6 = (zj3.C79348e) r6
            boolean r14 = r6.mo70071q1()
            ck3.b r6 = r11.f215752d
            boolean r15 = r6.mo91582w()
            ck3.b r6 = r11.f215752d
            java.lang.String r16 = r6.mo91577r()
            com.tencent.mm.ui.chatting.component.l3 r6 = new com.tencent.mm.ui.chatting.component.l3
            r6.<init>(r11)
            r13 = r1
            r17 = r5
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18)
            com.tencent.mm.ui.chatting.n3 r6 = r11.f215929n
            if (r6 != 0) goto L_0x05f9
            com.tencent.mm.ui.chatting.n3 r6 = new com.tencent.mm.ui.chatting.n3
            r6.<init>()
            r11.f215929n = r6
        L_0x05f9:
            com.tencent.mm.ui.chatting.n3 r6 = r11.f215929n
            ck3.b r7 = r11.f215752d
            com.tencent.mm.ui.chatting.BaseChattingUIFragment r15 = r7.f193286j
            android.app.Activity r7 = r7.mo91565f()
            r6.getClass()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            com.tencent.mm.storage.f4 r13 = r1.f228992d
            long r13 = r13.getMsgId()
            r12.append(r13)
            java.lang.String r13 = " "
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = r6.f216523a
            boolean r13 = r12.equals(r13)
            if (r13 == 0) goto L_0x0635
            r1 = 2131825597(0x7f1113bd, float:1.9284055E38)
            java.lang.String r1 = r7.getString(r1)
            android.widget.Toast r1 = nj3.C76912y0.makeText((android.content.Context) r7, (java.lang.CharSequence) r1, (int) r4)
            r1.show()
            goto L_0x0a77
        L_0x0635:
            r6.f216523a = r12
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            boolean r7 = r7.mo101020w3()
            java.lang.String r14 = ""
            java.lang.String r13 = "MicroMsg.FavMsgHandle"
            if (r7 == 0) goto L_0x07d1
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            int r7 = r7.getType()
            r12 = 1107296305(0x42000031, float:32.000187)
            if (r7 == r12) goto L_0x07d1
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            java.lang.String r7 = r7.getContent()
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r10)
            int r12 = r7.f195582i
            r10 = 19
            if (r12 != r9) goto L_0x0708
            java.lang.String r9 = r7.f195650z
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0708
            com.tencent.mm.storage.f4 r9 = r1.f228992d
            java.lang.String r12 = r7.f195606o
            com.tencent.mm.pluginsdk.model.app.d r9 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85069k(r9, r12)
            if (r9 == 0) goto L_0x07d1
            java.lang.String r12 = r9.field_fileFullPath
            boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r12 == 0) goto L_0x0684
            java.lang.String r12 = r9.field_fileFullPath
            long r16 = com.tencent.p014mm.vfs.C86013q1.m106451l(r12)
            long r3 = r9.field_totalLen
            int r12 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x07d1
        L_0x0684:
            gi.g r2 = new gi.g
            r2.<init>()
            java.lang.String r3 = "task_FavMsgHandle_2"
            r2.f287660d = r3
            com.tencent.mm.ui.chatting.r3 r3 = new com.tencent.mm.ui.chatting.r3
            r3.<init>(r6, r9, r1, r15)
            r2.f287662f = r3
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            com.tencent.mm.storage.f4 r6 = r1.f228992d
            java.lang.String r6 = r6.mo108768t()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r14)
            com.tencent.mm.storage.f4 r1 = r1.f228992d
            long r14 = r1.getMsgId()
            r12.append(r14)
            java.lang.String r1 = r12.toString()
            java.lang.String r12 = "checkExist"
            java.lang.String r1 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r12, r3, r6, r1)
            r2.field_mediaId = r1
            java.lang.String r1 = r7.f195524R
            r2.field_aesKey = r1
            r2.field_fileType = r10
            java.lang.String r1 = r7.f195472C
            r2.field_authKey = r1
            java.lang.String r1 = r7.f195650z
            r2.f287672s = r1
            java.lang.String r1 = r9.field_fileFullPath
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06dc
            java.lang.String r1 = r9.field_fileFullPath
            r3 = 0
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r1, r3)
            r2.field_fullpath = r1
            goto L_0x06f3
        L_0x06dc:
            r3 = 0
            eb0.c r1 = eb0.C97625j3.m125812b()
            java.lang.String r1 = r1.mo105889d()
            java.lang.String r4 = r7.f195570f
            java.lang.String r6 = r7.f195602n
            java.lang.String r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r1, r4, r6)
            java.lang.String r1 = com.tencent.p014mm.vfs.C86013q1.m106448i(r1, r3)
            r2.field_fullpath = r1
        L_0x06f3:
            java.lang.Class<qo.l> r1 = p663qo.C101213l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qo.l r1 = (p663qo.C101213l) r1
            boolean r1 = r1.xf0(r2)
            if (r1 != 0) goto L_0x0a77
            java.lang.String r1 = "openim attach download failed before rescend"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r1)
            goto L_0x0a77
        L_0x0708:
            int r3 = r7.f195582i
            if (r3 != r10) goto L_0x07d1
            java.lang.String r3 = r7.f195571f0
            te3.dp3 r3 = qg2.C101147j0.m132643x(r3)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            if (r3 == 0) goto L_0x07c5
            java.util.LinkedList<te3.rc0> r3 = r3.f227155f
            if (r3 == 0) goto L_0x07c5
            java.util.Iterator r3 = r3.iterator()
        L_0x0721:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x07c5
            java.lang.Object r7 = r3.next()
            te3.rc0 r7 = (te3.C101834rc0) r7
            com.tencent.mm.storage.f4 r9 = r1.f228992d
            long r9 = r9.getMsgId()
            r12 = 1
            java.lang.String r18 = qg2.C101147j0.m132636q(r7, r9, r12)
            java.lang.String r9 = r7.f299342z1
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0776
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r18)
            if (r9 != 0) goto L_0x0776
            java.lang.String r9 = r7.f299280T
            com.tencent.mm.storage.f4 r10 = r1.f228992d
            r36 = r13
            r16 = r14
            long r13 = r10.getMsgId()
            java.lang.String r19 = qg2.C101147j0.m132641v(r9, r13, r12)
            java.lang.String r9 = r7.f299342z1
            java.lang.String r10 = r7.f299337x1
            java.lang.String r14 = r7.f299340y1
            com.tencent.mm.storage.f4 r13 = r1.f228992d
            r12 = r6
            r8 = r36
            r20 = r13
            r13 = r15
            r36 = r3
            r17 = r14
            r3 = r16
            r14 = r1
            r24 = r15
            r15 = r9
            r16 = r10
            r21 = r4
            r12.mo102815c(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x077c
        L_0x0776:
            r36 = r3
            r8 = r13
            r3 = r14
            r24 = r15
        L_0x077c:
            com.tencent.mm.storage.f4 r9 = r1.f228992d
            long r9 = r9.getMsgId()
            r12 = 1
            java.lang.String r18 = qg2.C101147j0.m132611D(r7, r9, r12)
            java.lang.String r9 = r7.f299334w1
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x07bc
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106450k(r18)
            if (r9 != 0) goto L_0x07bc
            java.lang.String r9 = r7.f299280T
            java.lang.String r9 = qg2.C101147j0.m132610C(r9)
            com.tencent.mm.storage.f4 r10 = r1.f228992d
            long r13 = r10.getMsgId()
            java.lang.String r19 = qg2.C101147j0.m132641v(r9, r13, r12)
            java.lang.String r15 = r7.f299334w1
            java.lang.String r9 = r7.f299243A1
            java.lang.String r7 = r7.f299340y1
            com.tencent.mm.storage.f4 r10 = r1.f228992d
            r12 = r6
            r13 = r24
            r14 = r1
            r16 = r9
            r17 = r7
            r20 = r10
            r21 = r4
            r12.mo102815c(r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x07bc:
            r14 = r3
            r13 = r8
            r15 = r24
            r8 = 2
            r3 = r36
            goto L_0x0721
        L_0x07c5:
            r8 = r13
            r3 = r14
            r24 = r15
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x07d5
            goto L_0x0a77
        L_0x07d1:
            r8 = r13
            r3 = r14
            r24 = r15
        L_0x07d5:
            com.tencent.mm.storage.f4 r4 = r1.f228992d
            boolean r4 = r4.mo100979R3()
            if (r4 == 0) goto L_0x08a4
            com.tencent.mm.storage.f4 r4 = r1.f228992d
            java.lang.String r4 = com.tencent.p014mm.modelimage.C1300x.m1391b(r4)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 != 0) goto L_0x07f8
            r7 = 9
            com.tencent.mm.storage.f4 r9 = r1.f228992d
            java.lang.String r9 = r9.mo108768t()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            mk3.C21506a.m24351Y5(r7, r9, r4)
        L_0x07f8:
            di3.d r4 = di3.C86312j.m106911c(r2)
            gt.k r4 = (p158gt.C98201k) r4
            gt.m r4 = r4.mo137277xi()
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            java.lang.String r7 = r7.mo108768t()
            com.tencent.mm.storage.f4 r9 = r1.f228992d
            long r9 = r9.mo108774y2()
            com.tencent.mm.modelimage.m r4 = (com.tencent.p014mm.modelimage.C92839m) r4
            com.tencent.mm.modelimage.k r4 = r4.mo127168NQ(r7, r9)
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            int r7 = r7.mo108769t2()
            r9 = 1
            if (r7 != r9) goto L_0x0824
            boolean r15 = r4.mo127145p()
            r17 = r15
            goto L_0x0855
        L_0x0824:
            boolean r7 = r4.mo127145p()
            if (r7 != 0) goto L_0x082b
            goto L_0x0850
        L_0x082b:
            java.lang.Class<gt.l> r7 = p158gt.C76053l.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            gt.l r7 = (p158gt.C76053l) r7
            com.tencent.mm.modelimage.k r7 = r7.mo106261jD(r4)
            di3.d r9 = di3.C86312j.m106911c(r2)
            gt.k r9 = (p158gt.C98201k) r9
            gt.m r9 = r9.mo137277xi()
            java.lang.String r7 = r7.f267378e
            com.tencent.mm.modelimage.m r9 = (com.tencent.p014mm.modelimage.C92839m) r9
            r10 = 1
            java.lang.String r7 = r9.mo127174TY(r7, r3, r3, r10)
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r7 != 0) goto L_0x0853
        L_0x0850:
            r17 = 0
            goto L_0x0855
        L_0x0853:
            r17 = 1
        L_0x0855:
            int r7 = r4.f267376c
            int r9 = r4.f267377d
            if (r7 < r9) goto L_0x0862
            if (r9 != 0) goto L_0x085e
            goto L_0x0862
        L_0x085e:
            r9 = r24
            r15 = 0
            goto L_0x08a0
        L_0x0862:
            r7 = 1
            java.lang.Object[] r9 = new java.lang.Object[r7]
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            long r12 = r7.getMsgId()
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r10 = 0
            r9[r10] = r7
            java.lang.String r7 = "oreh downloadImgAndFav start  msgID:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r9)
            di3.d r2 = di3.C86312j.m106911c(r2)
            gt.k r2 = (p158gt.C98201k) r2
            gt.j r2 = r2.Jp0()
            long r13 = r4.f267374a
            com.tencent.mm.storage.f4 r4 = r1.f228992d
            long r15 = r4.getMsgId()
            com.tencent.mm.storage.f4 r4 = r1.f228992d
            r19 = 2131231570(0x7f080352, float:1.8079225E38)
            com.tencent.mm.ui.chatting.p3 r7 = new com.tencent.mm.ui.chatting.p3
            r9 = r24
            r7.<init>(r6, r1, r9)
            r12 = r2
            com.tencent.mm.modelimage.e r12 = (com.tencent.p014mm.modelimage.C92822e) r12
            r18 = r4
            r20 = r7
            r12.mo127101c(r13, r15, r17, r18, r19, r20)
            r15 = 1
        L_0x08a0:
            if (r15 == 0) goto L_0x08a6
            goto L_0x0a77
        L_0x08a4:
            r9 = r24
        L_0x08a6:
            com.tencent.mm.storage.f4 r2 = r1.f228992d
            boolean r2 = r2.mo100994f4()
            if (r2 != 0) goto L_0x08b6
            com.tencent.mm.storage.f4 r2 = r1.f228992d
            boolean r2 = r2.mo100989b4()
            if (r2 == 0) goto L_0x0940
        L_0x08b6:
            java.lang.Class<rz.u> r2 = p682rz.C101491u.class
            di3.d r4 = di3.C86312j.m106911c(r2)
            rz.u r4 = (p682rz.C101491u) r4
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            java.lang.String r7 = r7.mo108765s2()
            hd0.n0 r4 = r4.mo140806Zd(r7)
            if (r4 == 0) goto L_0x093b
            int r7 = r4.f288562i
            r10 = 199(0xc7, float:2.79E-43)
            if (r7 == r10) goto L_0x093b
            com.tencent.mm.ui.chatting.o3 r7 = new com.tencent.mm.ui.chatting.o3
            r7.<init>(r6, r1, r9)
            java.lang.Class<rz.s> r10 = p682rz.C101488s.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            rz.s r10 = (p682rz.C101488s) r10
            rz.t r10 = r10.Kj0()
            android.os.Looper r12 = android.os.Looper.getMainLooper()
            hd0.o0 r10 = (hd0.C98410o0) r10
            r10.mo137716b(r7, r12)
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            long r12 = r7.getMsgId()
            java.lang.Long r7 = java.lang.Long.valueOf(r12)
            r12 = 0
            r10[r12] = r7
            com.tencent.mm.storage.f4 r7 = r1.f228992d
            java.lang.String r7 = r7.mo108765s2()
            r12 = 1
            r10[r12] = r7
            java.lang.String r7 = "oreh downloadVideoAndFav start  msgID:%d, fileName:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r10)
            boolean r4 = r4.mo137711o()
            if (r4 == 0) goto L_0x0924
            java.lang.String r4 = "start complete online video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.u r2 = (p682rz.C101491u) r2
            com.tencent.mm.storage.f4 r4 = r1.f228992d
            java.lang.String r4 = r4.mo108765s2()
            r2.mo140797FT(r4)
            goto L_0x0939
        L_0x0924:
            java.lang.String r4 = "start complete offline video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            di3.d r2 = di3.C86312j.m106911c(r2)
            rz.u r2 = (p682rz.C101491u) r2
            com.tencent.mm.storage.f4 r4 = r1.f228992d
            java.lang.String r4 = r4.mo108765s2()
            r2.M00(r4)
        L_0x0939:
            r15 = 1
            goto L_0x093c
        L_0x093b:
            r15 = 0
        L_0x093c:
            if (r15 == 0) goto L_0x0940
            goto L_0x0a77
        L_0x0940:
            com.tencent.mm.storage.f4 r2 = r1.f228992d
            boolean r2 = r2.mo101016t3()
            if (r2 == 0) goto L_0x0a72
            com.tencent.mm.storage.f4 r2 = r1.f228992d
            java.lang.String r2 = r2.getContent()
            if (r2 == 0) goto L_0x0a6e
            java.lang.Class<mh0.d> r2 = mh0.C99864d.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            i40.e r2 = (i40.C98598e) r2
            java.lang.Class<ro.b> r4 = p1086ro.C101415b.class
            i40.b r2 = i40.C98597b.m128130c3(r2, r4)
            ro.b r2 = (p1086ro.C101415b) r2
            com.tencent.mm.storage.f4 r13 = r1.f228992d
            com.tencent.mm.ui.chatting.q3 r15 = new com.tencent.mm.ui.chatting.q3
            r15.<init>(r6, r9, r1)
            java.lang.String r4 = "msgInfo"
            gy3.C87412m.m108594g(r13, r4)
            java.lang.String r4 = r13.getContent()
            if (r4 == 0) goto L_0x0a5d
            ig.a r4 = new ig.a
            r4.<init>()
            java.lang.String r7 = r13.getContent()
            java.lang.String r8 = "msgInfo.content"
            gy3.C87412m.m108593f(r7, r8)
            r4.mo141099d(r7)
            ig.g r7 = new ig.g
            r7.<init>()
            java.lang.String r4 = r4.f289309p
            r7.mo141099d(r4)
            boolean r4 = r2.mo140925i3(r7, r13)
            java.util.List<ig.d> r8 = r7.f289364h
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x099c:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x09cb
            java.lang.Object r12 = r8.next()
            r14 = r12
            ig.d r14 = (p434ig.C98672d) r14
            r36 = r8
            th0.l r8 = th0.C101888l.f300029a
            boolean r16 = r8.mo141361k(r14, r13)
            if (r16 != 0) goto L_0x09c2
            boolean r16 = r8.mo141358h(r14, r13)
            if (r16 != 0) goto L_0x09c2
            boolean r8 = r8.mo141357g(r14, r13)
            if (r8 == 0) goto L_0x09c0
            goto L_0x09c2
        L_0x09c0:
            r8 = 0
            goto L_0x09c3
        L_0x09c2:
            r8 = 1
        L_0x09c3:
            if (r8 != 0) goto L_0x09c8
            r10.add(r12)
        L_0x09c8:
            r8 = r36
            goto L_0x099c
        L_0x09cb:
            java.util.List<ig.d> r7 = r7.f289364h
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x09d6:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x0a1a
            java.lang.Object r12 = r7.next()
            r14 = r12
            ig.d r14 = (p434ig.C98672d) r14
            r36 = r7
            java.lang.String r7 = "albumDataItem"
            gy3.C87412m.m108594g(r14, r7)
            java.lang.String r7 = r14.mo55256G()
            if (r7 == 0) goto L_0x09fe
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x09f8
            r7 = 1
            goto L_0x09f9
        L_0x09f8:
            r7 = 0
        L_0x09f9:
            r11 = 1
            if (r7 != r11) goto L_0x09fe
            r7 = 1
            goto L_0x09ff
        L_0x09fe:
            r7 = 0
        L_0x09ff:
            if (r7 == 0) goto L_0x0a0f
            ph0.a r7 = ph0.C100792a.f295260a
            java.lang.String r7 = r7.mo140250v(r14, r13)
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r7 == 0) goto L_0x0a0f
            r7 = 1
            goto L_0x0a10
        L_0x0a0f:
            r7 = 0
        L_0x0a10:
            if (r7 != 0) goto L_0x0a15
            r8.add(r12)
        L_0x0a15:
            r11 = r35
            r7 = r36
            goto L_0x09d6
        L_0x0a1a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "check download album, needDownload: "
            r7.append(r11)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r11 = "MicroMsg.AlbumVideoDownloadPLC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r7)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.addAll(r10)
            r14.addAll(r8)
            if (r4 == 0) goto L_0x0a5b
            i40.e r2 = r2.f289092d
            r2.requireAccountInitialized()
            i40.g r2 = r2.f289095f
            if (r2 == 0) goto L_0x0a49
            com.tencent.mm.sdk.coroutines.LifecycleScope r2 = r2.f223480f
            goto L_0x0a4a
        L_0x0a49:
            r2 = 0
        L_0x0a4a:
            if (r2 == 0) goto L_0x0a5b
            ro.a r7 = new ro.a
            r17 = 0
            r12 = r7
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r8 = 0
            r10 = 1
            com.tencent.p014mm.sdk.coroutines.LifecycleScope.launchDefault$default(r2, r8, r7, r10, r8)
        L_0x0a5b:
            r15 = r4
            goto L_0x0a6f
        L_0x0a5d:
            com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r2.<init>((android.os.Looper) r4)
            com.tencent.mm.ui.chatting.q3$a r4 = new com.tencent.mm.ui.chatting.q3$a
            r4.<init>()
            r2.post(r4)
        L_0x0a6e:
            r15 = 0
        L_0x0a6f:
            if (r15 == 0) goto L_0x0a72
            goto L_0x0a77
        L_0x0a72:
            r6.f216523a = r3
            r6.mo102816d(r9, r1)
        L_0x0a77:
            boolean r1 = r0 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.C74060a
            if (r1 != 0) goto L_0x0a7f
            boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7.C74061b
            if (r0 == 0) goto L_0x0ac6
        L_0x0a7f:
            r0 = 5
            int r1 = eb0.C75569c4.m90676i(r5)
            if (r1 <= 0) goto L_0x0ac6
            com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.MessageSecurityInterceptStruct
            r2.<init>()
            java.lang.String r3 = r5.mo108768t()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
            if (r3 != 0) goto L_0x0aa2
            java.lang.String r3 = r5.mo108768t()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85847r5(r3)
            if (r3 == 0) goto L_0x0aa0
            goto L_0x0aa2
        L_0x0aa0:
            r8 = 1
            goto L_0x0aa3
        L_0x0aa2:
            r8 = 2
        L_0x0aa3:
            int r3 = r5.mo108769t2()
            r4 = 1
            if (r3 != r4) goto L_0x0aac
            r15 = 1
            goto L_0x0aad
        L_0x0aac:
            r15 = 0
        L_0x0aad:
            long r3 = r5.mo108774y2()
            r2.f194273f = r3
            long r3 = (long) r8
            r2.f194271d = r3
            long r3 = (long) r15
            r2.f194272e = r3
            long r3 = (long) r1
            r2.f194276i = r3
            long r0 = (long) r0
            r2.f194274g = r0
            r0 = 0
            r2.f194275h = r0
            r2.mo86054n()
        L_0x0ac6:
            r1 = r35
            goto L_0x0bf0
        L_0x0aca:
            boolean r1 = r5.mo100993e4()
            if (r1 == 0) goto L_0x0aef
            r1 = r35
            ck3.b r0 = r1.f215752d
            boolean r0 = r0.mo91583x()
            java.lang.String r2 = r5.getContent()
            int r3 = r5.mo108769t2()
            java.lang.String r0 = eb0.C75604z3.m90840l(r0, r2, r3)
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87344e(r0, r2)
            goto L_0x0bda
        L_0x0aef:
            r1 = r35
            boolean r2 = r5.mo100995g4()
            if (r2 == 0) goto L_0x0b33
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            java.lang.String r2 = "MicroMsg.LongClickBrandServiceHelper"
            if (r0 != 0) goto L_0x0b08
            java.lang.String r0 = "showAcceptVoiceConnector: context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0bda
        L_0x0b08:
            eb0.c r3 = eb0.C97625j3.m125812b()
            boolean r3 = r3.mo105883I()
            if (r3 != 0) goto L_0x0b1c
            nj3.C76912y0.m92772k(r0)
            java.lang.String r0 = "showAcceptVoiceConnector: sd card not available"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x0bda
        L_0x0b1c:
            rb0.j r2 = rb0.C48009v0.Fx0()
            r3 = 2
            java.util.List r2 = r2.mo72763bO(r3)
            java.util.List r2 = com.tencent.p014mm.p136ui.chatting.C73745l4.m87340a(r2)
            com.tencent.mm.ui.chatting.m4 r3 = new com.tencent.mm.ui.chatting.m4
            r3.<init>(r5, r0)
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87346g(r2, r0, r3)
            goto L_0x0bda
        L_0x0b33:
            boolean r2 = r5.mo100979R3()
            if (r2 == 0) goto L_0x0b50
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            ck3.b r3 = r1.f215752d
            java.lang.String r0 = r0.mo103068y(r3, r5)
            ck3.b r3 = r1.f215752d
            boolean r3 = r3.mo91583x()
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87343d(r5, r2, r0, r3)
            goto L_0x0bda
        L_0x0b50:
            boolean r0 = r5.mo100994f4()
            if (r0 == 0) goto L_0x0b61
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87345f(r5, r0)
            goto L_0x0bda
        L_0x0b61:
            boolean r0 = r5.mo100982U3()
            if (r0 == 0) goto L_0x0b9e
            java.lang.String r0 = r5.getContent()
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            java.lang.String r3 = "MicroMsg.LongClickBrandServiceHelper"
            if (r2 != 0) goto L_0x0b7b
            java.lang.String r0 = "showAcceptLocationConnector: context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0bda
        L_0x0b7b:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0b87
            java.lang.String r0 = "showAcceptLocationConnector: locationXML is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0bda
        L_0x0b87:
            rb0.j r3 = rb0.C48009v0.Fx0()
            r4 = 16
            java.util.List r3 = r3.mo72763bO(r4)
            java.util.List r3 = com.tencent.p014mm.p136ui.chatting.C73745l4.m87340a(r3)
            com.tencent.mm.ui.chatting.n4 r4 = new com.tencent.mm.ui.chatting.n4
            r4.<init>(r0, r2)
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87346g(r3, r2, r4)
            goto L_0x0bda
        L_0x0b9e:
            boolean r0 = r5.mo100975N3()
            if (r0 == 0) goto L_0x0bda
            java.lang.String r0 = r5.getContent()
            ck3.b r2 = r1.f215752d
            android.app.Activity r2 = r2.mo91565f()
            java.lang.String r3 = "MicroMsg.LongClickBrandServiceHelper"
            if (r2 != 0) goto L_0x0bb8
            java.lang.String r0 = "showAcceptPersonalCardConnector: context is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0bda
        L_0x0bb8:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0bc4
            java.lang.String r0 = "showAcceptPersonalCardConnector: locationXML is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0bda
        L_0x0bc4:
            rb0.j r3 = rb0.C48009v0.Fx0()
            r4 = 32
            java.util.List r3 = r3.mo72763bO(r4)
            java.util.List r3 = com.tencent.p014mm.p136ui.chatting.C73745l4.m87340a(r3)
            com.tencent.mm.ui.chatting.o4 r4 = new com.tencent.mm.ui.chatting.o4
            r4.<init>(r0, r2)
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87346g(r3, r2, r4)
        L_0x0bda:
            java.lang.String r0 = "MicroMsg.ChattingUI.MessBoxComponent"
            java.lang.String r2 = "type is %d"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r5.getType()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
        L_0x0bf0:
            return
        L_0x0bf1:
            r1 = r11
            ck3.b r0 = r1.f215752d
            android.app.Activity r6 = r0.mo91565f()
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r2 = 2131824004(0x7f110d84, float:1.9280824E38)
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r8 = ""
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r2 = 2131824607(0x7f110fdf, float:1.9282047E38)
            java.lang.String r9 = r0.getString(r2)
            ck3.b r0 = r1.f215752d
            android.app.Activity r0 = r0.mo91565f()
            r2 = 2131821426(0x7f110372, float:1.9275595E38)
            java.lang.String r10 = r0.getString(r2)
            com.tencent.mm.ui.chatting.component.i3$b r11 = new com.tencent.mm.ui.chatting.component.i3$b
            r11.<init>(r5)
            r12 = 0
            r13 = 2131100028(0x7f06017c, float:1.7812426E38)
            nj3.C76879j.m92708B(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73497i3.mo102469t(android.view.MenuItem, int, com.tencent.mm.ui.chatting.viewitems.i):void");
    }

    /* renamed from: u2 */
    public void mo70142u2(C67391b bVar) {
        super.mo70142u2(bVar);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this.f215928j, (Looper) null);
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105924i("MicroMsg.ChattingUI.MessBoxComponent", "[onChattingExitAnimStart]");
        UIStatusChangedEvent uIStatusChangedEvent = new UIStatusChangedEvent();
        uIStatusChangedEvent.f193971d.f193972a = 3;
        uIStatusChangedEvent.publish();
        String r = this.f215752d.mo91577r();
        ((C119157j) C119157j.f356862d).mo183875f(new C73507j3(this, r));
        if (C91441c.m114729c()) {
            C91440a.INSTANCE.mo125376c(this.f215925g);
        }
    }
}
