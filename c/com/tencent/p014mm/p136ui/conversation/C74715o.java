package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LeftSlideOptionStruct;
import com.tencent.p014mm.modelgetchatroommsg.C68111c;
import com.tencent.p014mm.p136ui.C75045z;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.tools.C45074p;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import nj3.C11184p0;
import nj3.C76879j;
import p154fy.C87121j;
import p227rn.C48053v;
import p248ug.C52558c;
import p629ny.C76979h;
import p680ru.C77569h;
import p749xh.C78821o1;
import rb0.C47984k;
import rb0.C47997p;
import rb0.C48009v0;
import tc0.C77885p;
import te3.C52054y14;
import te3.C64266br1;
import tf3.C101873g;
import uo3.C78253a;

/* renamed from: com.tencent.mm.ui.conversation.o */
public class C74715o implements AdapterView.OnItemLongClickListener, View.OnCreateContextMenuListener, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public C74720p f219671d;

    /* renamed from: e */
    public ListView f219672e;

    /* renamed from: f */
    public Activity f219673f;

    /* renamed from: g */
    public String f219674g = "";

    /* renamed from: h */
    public C72976h2 f219675h = null;

    /* renamed from: i */
    public int[] f219676i;

    /* renamed from: j */
    public int f219677j;

    /* renamed from: n */
    public C11184p0 f219678n = new C74716a();

    /* renamed from: com.tencent.mm.ui.conversation.o$a */
    public class C74716a implements C11184p0 {

        /* renamed from: com.tencent.mm.ui.conversation.o$a$a */
        public class C74717a implements Runnable {
            public C74717a() {
            }

            public void run() {
                Class cls = C48053v.class;
                Log.m105925i("MicroMsg.ConversationClickListener", "dismiss conv confirm:%s", C74715o.this.f219674g);
                C74715o.this.mo103871c(14);
                if (C72996z1.m85853x5(C74715o.this.f219674g) || C72996z1.m85827Y4(C74715o.this.f219674g)) {
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69769i(C74715o.this.f219674g);
                } else if (((C48053v) C86312j.m106911c(cls)).mo72617gl(C74715o.this.f219674g) || ((C48053v) C86312j.m106911c(cls)).mo72614OE(C74715o.this.f219674g)) {
                    C48009v0.Dx0().mo73021Lo(C74715o.this.f219674g);
                    ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69763f(C74715o.this.f219674g);
                } else {
                    C45629t0.m50823j(C74715o.this.f219674g);
                }
                ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(C74715o.this.f219674g, 14);
            }
        }

        public C74716a() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            Class cls = C75700k0.class;
            Class cls2 = C87121j.class;
            Class cls3 = C77569h.class;
            int i2 = 3;
            switch (menuItem.getItemId()) {
                case 4:
                    C74715o.this.mo103871c(1);
                    if (C72996z1.m85820U5(C74715o.this.f219674g)) {
                        C115669n.INSTANCE.mo160131h(14553, 1, 1, C74715o.this.f219674g);
                    } else {
                        C115669n.INSTANCE.mo160131h(14553, 0, 1, C74715o.this.f219674g);
                    }
                    C74715o oVar = C74715o.this;
                    C72976h2 h2Var = oVar.f219675h;
                    C72963f4 f4Var = h2Var.f212786n1;
                    if (f4Var != null) {
                        Log.m105925i("MicroMsg.ConversationClickListener", "summerdel talker[%s] activity[%s] username[%s] latestInsertMsg[%s, %s, %s]", oVar.f219674g, oVar.f219673f, h2Var.getUsername(), Long.valueOf(f4Var.getMsgId()), f4Var.getContent(), Long.valueOf(f4Var.getCreateTime()));
                    } else {
                        Log.m105925i("MicroMsg.ConversationClickListener", "summerdel talker[%s] activity[%s] username[%s] latestInsertMsg is null", oVar.f219674g, oVar.f219673f, h2Var.getUsername());
                    }
                    if (C47984k.m53340n(C74715o.this.f219674g)) {
                        C47997p Cx0 = C48009v0.Cx0();
                        C74715o oVar2 = C74715o.this;
                        int i3 = oVar2.f219677j;
                        int G2 = oVar2.f219675h.mo108786G2();
                        String str = C74715o.this.f219674g;
                        Cx0.getClass();
                        C52054y14 y142 = new C52054y14();
                        Cx0.f128740i = y142;
                        y142.f145079h = i3;
                        y142.f145077f = G2;
                        if (f4Var == null) {
                            f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(str);
                        }
                        if (f4Var != null) {
                            Cx0.f128740i.f145078g = f4Var.getType();
                            C52054y14 y143 = Cx0.f128740i;
                            if (y143.f145077f > 0) {
                                y143.f145076e = ((int) (System.currentTimeMillis() - f4Var.getCreateTime())) / 1000;
                            }
                        }
                        Cx0.mo72790c(Cx0.f128740i, str);
                    }
                    C74715o oVar3 = C74715o.this;
                    C44965d.m49844d(oVar3.f219674g, oVar3.f219673f, oVar3.f219675h, true, (Runnable) null, true, false);
                    i2 = 12;
                    break;
                case 5:
                    Log.m105918d("MicroMsg.ConversationClickListener", "placed to the top");
                    C45628s0.m50787m0(C74715o.this.f219674g, true, true);
                    C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(C74715o.this.f219674g);
                    if (z1Var != null && z1Var.mo62916m3()) {
                        C115669n.INSTANCE.mo160131h(13307, z1Var.getUsername(), 1, 1, 1);
                    }
                    if (!(z1Var == null || z1Var.getUsername() == null || !z1Var.getUsername().equals("newsapp"))) {
                        C115669n.INSTANCE.mo160131h(15413, 13);
                        C74715o.m89458a(C74715o.this, true);
                    }
                    if (!(z1Var == null || z1Var.getUsername() == null || !z1Var.getUsername().equals("qqmail"))) {
                        C74715o.m89459b(C74715o.this, true);
                    }
                    Activity activity = C74715o.this.f219673f;
                    C76879j.m92726T(activity, activity.getString(C0966R.string.gm4));
                    ((C77569h) C86312j.m106911c(cls3)).mo35230Fx(true, C74715o.this.f219674g, true);
                    i2 = 4;
                    break;
                case 6:
                    Log.m105918d("MicroMsg.ConversationClickListener", "unplaced to the top");
                    C45628s0.m50803u0(C74715o.this.f219674g, true);
                    C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(C74715o.this.f219674g);
                    if (z1Var2 != null && z1Var2.mo62916m3()) {
                        C115669n.INSTANCE.mo160131h(13307, z1Var2.getUsername(), 1, 2, 1);
                    }
                    if (!(z1Var2 == null || z1Var2.getUsername() == null || !z1Var2.getUsername().equals("newsapp"))) {
                        C115669n.INSTANCE.mo160131h(15413, 14);
                        C74715o.m89458a(C74715o.this, false);
                    }
                    if (!(z1Var2 == null || z1Var2.getUsername() == null || !z1Var2.getUsername().equals("qqmail"))) {
                        C74715o.m89459b(C74715o.this, false);
                    }
                    Activity activity2 = C74715o.this.f219673f;
                    C76879j.m92726T(activity2, activity2.getString(C0966R.string.gm5));
                    ((C77569h) C86312j.m106911c(cls3)).mo35230Fx(true, C74715o.this.f219674g, false);
                    i2 = 5;
                    break;
                case 7:
                    Log.m105919d("MicroMsg.ConversationClickListener", "jacks mark read: %s", C74715o.this.f219674g);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69778p0(C74715o.this.f219674g);
                    MMAppMgr.m85983c(C74715o.this.f219674g);
                    ((C87121j) C86312j.m106911c(cls2)).mo71215V9(C74715o.this.f219674g, 1);
                    ((C77569h) C86312j.m106911c(cls3)).mo35236XG(true, C74715o.this.f219674g, false);
                    C68111c.m80513e().mo93621c(C74715o.this.f219674g);
                    if (MultiProcessMMKV.getSingleMMKV("message_fold_config2").decodeInt("fold_button_status_int_sync", 65536) == 131072) {
                        if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69753Y(C74715o.this.f219674g)) {
                            String str2 = C74715o.this.f219674g;
                            C87412m.m108594g(str2, "username");
                            SingleTable singleTable = C78821o1.f231207K;
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(C78821o1.f231211P.getName(), "message_fold");
                            int run = singleTable.update(contentValues).where(C78821o1.f231208L.equal(str2)).build().run(C86709a0.m107535s().f251811i);
                            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku();
                            if ((Ku instanceof MStorageEx) && run > 0) {
                                Ku.doNotify(3, (MStorageEx) Ku, str2);
                                break;
                            }
                        }
                    }
                    break;
                case 8:
                    Log.m105919d("MicroMsg.ConversationClickListener", "jacks set unread: %s", C74715o.this.f219674g);
                    ((C44660i2) C97625j3.m125812b().mo105908w()).mo69768h0(C74715o.this.f219674g);
                    ((C77569h) C86312j.m106911c(cls3)).mo35236XG(true, C74715o.this.f219674g, true);
                    ((C87121j) C86312j.m106911c(cls2)).mo71215V9(C74715o.this.f219674g, 13);
                    i2 = 2;
                    break;
                case 9:
                    Log.m105919d("MicroMsg.ConversationClickListener", "jacks clear history: %s", C74715o.this.f219674g);
                    C72996z1.m85820U5(C74715o.this.f219674g);
                    C74715o oVar4 = C74715o.this;
                    String str3 = oVar4.f219674g;
                    Activity activity3 = oVar4.f219673f;
                    PBool pBool = new PBool();
                    pBool.value = false;
                    C75604z3.m90836h(str3, new C74691h(pBool, C76879j.m92723Q(activity3, activity3.getString(C0966R.string.a3h), activity3.getString(C0966R.string.a4d), true, true, new C74690g(pBool))));
                    ((C87121j) C86312j.m106911c(cls2)).mo71213Ot(str3, 15);
                    break;
                case 10:
                    Log.m105919d("MicroMsg.ConversationClickListener", "delete biz service: %s", C74715o.this.f219674g);
                    C45074p.m49920b(C47984k.m53328b(C74715o.this.f219674g), C74715o.this.f219673f, C97625j3.m125812b().mo105907v().get(C74715o.this.f219674g), false, (Runnable) null, 1);
                    break;
                case 11:
                    C75045z.m90001b(C74715o.this.f219673f, new C74717a());
                    i2 = 13;
                    break;
                case 12:
                    Intent intent = new Intent();
                    intent.setClassName(C74715o.this.f219673f, "com.tencent.mm.plugin.repairer.ui.RepairerChatroomDebugUI");
                    intent.putExtra("Contact_User", C74715o.this.f219674g);
                    Activity activity4 = C74715o.this.f219673f;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Activity activity5 = activity4;
                    C117292a.m165358d(activity5, aVar.mo10232b(), "com/tencent/mm/ui/conversation/ConversationLongClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity4.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(activity5, "com/tencent/mm/ui/conversation/ConversationLongClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    break;
            }
            i2 = -1;
            if (i2 > 0) {
                C74715o.this.mo103871c(i2);
                Log.m105919d("MicroMsg.ConversationClickListener", "jacks kv long click: %d", Integer.valueOf(i2));
            }
        }
    }

    public C74715o(C74720p pVar, ListView listView, Activity activity, int[] iArr) {
        this.f219671d = pVar;
        this.f219672e = listView;
        this.f219673f = activity;
        this.f219676i = iArr;
    }

    /* renamed from: a */
    public static void m89458a(C74715o oVar, boolean z) {
        oVar.getClass();
        long j = C75592q0.m90780j();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(z ? j | 8192 : j & -8193));
        int i = z ? 1 : 2;
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 82;
        br12.f182325e = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        Log.m105924i("MicroMsg.ConversationClickListener", "switch ext change : TXNEWS isTop open = " + z + " item value = " + br12.f182325e + " functionId = " + br12.f182324d);
    }

    /* renamed from: b */
    public static void m89459b(C74715o oVar, boolean z) {
        oVar.getClass();
        long j = C75592q0.m90780j();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(z ? j | 262144 : j & -262145));
        int i = z ? 1 : 2;
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 84;
        br12.f182325e = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        Log.m105924i("MicroMsg.ConversationClickListener", "switch ext change : isTop open = " + z + " item value = " + br12.f182325e + " functionId = " + br12.f182324d);
    }

    /* renamed from: c */
    public final void mo103871c(int i) {
        LeftSlideOptionStruct leftSlideOptionStruct = new LeftSlideOptionStruct();
        leftSlideOptionStruct.f107964d = (long) i;
        leftSlideOptionStruct.f107965e = leftSlideOptionStruct.mo86045b("SessionName", this.f219674g, true);
        leftSlideOptionStruct.f107966f = (long) this.f219675h.mo108786G2();
        leftSlideOptionStruct.f107967g = (long) C45629t0.m50816c(this.f219674g);
        if (i == 13 || i == 14) {
            leftSlideOptionStruct.f107968h = C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, true) ? 1 : 2;
        }
        leftSlideOptionStruct.mo86054n();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C52558c b;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_minishop_plugin_enabled;
        Class cls = C32735h.class;
        C74720p pVar = this.f219671d;
        pVar.getClass();
        Log.m105925i("MicroMsg.ConversationWithCacheAdapter", "[frozenNotify] from:%s", Util.getStack());
        pVar.f219706T0 = true;
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f219674g);
        if (z1Var == null) {
            Log.m105920e("MicroMsg.ConversationClickListener", "onCreateContextMenu, contact is null, talker = " + this.f219674g);
            return;
        }
        String f = z1Var.mo62898f();
        if (f.toLowerCase().endsWith("@chatroom") && Util.isNullOrNil(z1Var.getNickname())) {
            f = this.f219673f.getString(C0966R.string.bba);
        }
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        contextMenu.setHeaderTitle(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f219673f, f));
        C72976h2 h2Var = this.f219675h;
        boolean z = h2Var != null;
        Set<String> set = C45628s0.f123410p;
        String username = h2Var.getUsername();
        if ((!C72996z1.m85841l5(username) && !C72996z1.m85808L4(username) && !C72996z1.m85806K4(username) && !C72996z1.m85845p5(username) && !C72996z1.m85813P4(username)) && z) {
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f219674g);
            if (j != null && j.mo108786G2() <= 0 && !j.mo108372k3(1048576)) {
                contextMenu.add(adapterContextMenuInfo.position, 8, 0, C0966R.string.f361010gm2);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 7, 0, C0966R.string.f361008gm0);
            }
        }
        C72976h2 h2Var2 = this.f219675h;
        if (h2Var2 != null && C45628s0.m50772f(h2Var2)) {
            if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(this.f219674g)) {
                contextMenu.add(adapterContextMenuInfo.position, 6, 0, C0966R.string.f361011gm3);
            } else if (!z1Var.mo62916m3()) {
                contextMenu.add(adapterContextMenuInfo.position, 5, 0, C0966R.string.f361009gm1);
            } else if (C72996z1.m85826X5(z1Var.getUsername()) || (1 == ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) && C45628s0.m50744I(z1Var.getUsername()))) {
                contextMenu.add(adapterContextMenuInfo.position, 5, 0, C0966R.string.bsg);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 5, 0, C0966R.string.bsh);
            }
        }
        if (z1Var.mo62916m3() && z1Var.mo62927s3() && !C45628s0.m50751P(z1Var.getUsername()) && !C72996z1.m85793A5(z1Var.getUsername()) && (b = C47984k.m53328b(z1Var.getUsername())) != null && b.mo73506x2() && !C72996z1.m85826X5(z1Var.getUsername()) && (1 != ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 1) || !C45628s0.m50744I(z1Var.getUsername()))) {
            contextMenu.add(adapterContextMenuInfo.position, 10, 0, C0966R.string.glz);
        }
        C72976h2 h2Var3 = this.f219675h;
        if (!(h2Var3 == null || h2Var3.mo108821o2() == -1)) {
            if (C72996z1.m85838i5(this.f219674g)) {
                contextMenu.add(adapterContextMenuInfo.position, 4, 0, C0966R.string.gm_);
            } else if (C72996z1.m85827Y4(this.f219674g)) {
                contextMenu.add(adapterContextMenuInfo.position, 4, 0, C0966R.string.gm8);
            } else {
                contextMenu.add(adapterContextMenuInfo.position, 11, 0, C0966R.string.glt);
                contextMenu.add(adapterContextMenuInfo.position, 4, 0, C0966R.string.gm7);
            }
        }
        if (C72996z1.m85807K5(z1Var.getUsername()) && C79758p.f233760a.mo109883f(new C101873g()) == 1) {
            contextMenu.add(adapterContextMenuInfo.position, 12, 0, C0966R.string.ln9);
        }
    }

    public void onDismiss() {
        C74720p pVar = this.f219671d;
        pVar.f219706T0 = false;
        pVar.notifyDataSetChanged();
    }

    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2 = i;
        if (i2 < this.f219672e.getHeaderViewsCount()) {
            Log.m105918d("MicroMsg.ConversationClickListener", "on long click header view");
            return true;
        }
        this.f219677j = i2 - this.f219672e.getHeaderViewsCount();
        C72976h2 h2Var = (C72976h2) this.f219671d.getItem(i2 - this.f219672e.getHeaderViewsCount());
        this.f219675h = h2Var;
        if (h2Var == null) {
            Log.m105921e("MicroMsg.ConversationClickListener", "headercount:%d, postion:%d", Integer.valueOf(this.f219672e.getHeaderViewsCount()), Integer.valueOf(i));
            return true;
        }
        String username = h2Var.getUsername();
        this.f219674g = username;
        if (C72996z1.m85828Z4(username)) {
            return true;
        }
        C78253a aVar = new C78253a(this.f219673f);
        C11184p0 p0Var = this.f219678n;
        int[] iArr = this.f219676i;
        aVar.mo108272g(view, i, j, this, p0Var, iArr[0], iArr[1]);
        aVar.f229227C = this;
        if (C72996z1.m85820U5(this.f219674g)) {
            C115669n.INSTANCE.mo160131h(14553, 1, 0, this.f219674g);
        } else {
            C115669n.INSTANCE.mo160131h(14553, 0, 0, this.f219674g);
        }
        mo103871c(100);
        return true;
    }
}
