package com.tencent.p014mm.plugin.announcement;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GroupNoticeInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ViewRoomDescStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.component.editor.EditorUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import d62.C75339i;
import de3.C45331f0;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import hp3.C87581a;
import j20.C117292a;
import java.util.HashSet;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kb0.C76528a;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import p148ei.C7660a;
import p196ln.C76705f;
import p629ny.C76979h;
import p823sg.C90193h;
import pb1.C100755z;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C101835rd0;
import te3.C50071k24;
import te3.C50206l24;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI */
public class ChatroomNoticeUI extends EditorUI implements C11385n {

    /* renamed from: x0 */
    public static final /* synthetic */ int f196934x0 = 0;

    /* renamed from: K */
    public String f196935K;

    /* renamed from: L */
    public String f196936L;

    /* renamed from: M */
    public int f196937M;

    /* renamed from: N */
    public LinearLayout f196938N;

    /* renamed from: P */
    public boolean f196939P;

    /* renamed from: Q */
    public boolean f196940Q;

    /* renamed from: R */
    public String f196941R;

    /* renamed from: S */
    public String f196942S;

    /* renamed from: T */
    public String f196943T;

    /* renamed from: U */
    public long f196944U;

    /* renamed from: V */
    public C89779i0 f196945V;

    /* renamed from: W */
    public boolean f196946W = false;

    /* renamed from: X */
    public IListener f196947X = new IListener<RevokeMsgEvent>(this) {
        {
            this.__eventId = 675629679;
        }

        public boolean callback(IEvent iEvent) {
            Map<String, String> parseXml;
            RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
            if (!Util.isNullOrNil(revokeMsgEvent.f78943d.f78949f)) {
                ChatroomNoticeUI chatroomNoticeUI = ChatroomNoticeUI.this;
                if (!chatroomNoticeUI.f196946W && (parseXml = XmlParser.parseXml(chatroomNoticeUI.f196942S, "favitem", (String) null)) != null && revokeMsgEvent.f78943d.f78949f.equalsIgnoreCase(parseXml.get(".favitem.announcement_id"))) {
                    Intent intent = ChatroomNoticeUI.this.getIntent();
                    intent.putExtra("annoucement_revoke", true);
                    ChatroomNoticeUI chatroomNoticeUI2 = ChatroomNoticeUI.this;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    ChatroomNoticeUI chatroomNoticeUI3 = chatroomNoticeUI2;
                    C117292a.m165358d(chatroomNoticeUI3, aVar.mo10232b(), "com/tencent/mm/plugin/announcement/ChatroomNoticeUI$1", "callback", "(Lcom/tencent/mm/autogen/events/RevokeMsgEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    chatroomNoticeUI2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(chatroomNoticeUI3, "com/tencent/mm/plugin/announcement/ChatroomNoticeUI$1", "callback", "(Lcom/tencent/mm/autogen/events/RevokeMsgEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            return false;
        }
    };

    /* renamed from: Y */
    public boolean f196948Y;

    /* renamed from: Z */
    public Boolean f196949Z = null;

    /* renamed from: p0 */
    public String f196950p0 = null;

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$a */
    public class C68545a implements C87581a<Object, C89132b.C89134c<C50206l24>> {
        public C68545a() {
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            ChatroomNoticeUI chatroomNoticeUI = ChatroomNoticeUI.this;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            String str = cVar.f256795c;
            int i3 = ChatroomNoticeUI.f196934x0;
            chatroomNoticeUI.mo94189f8(i, i2, str);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$b */
    public class C68546b implements MenuItem.OnMenuItemClickListener {
        public C68546b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0064, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(((p21.C100622g) r1).f294819s.trim()) != false) goto L_0x0066;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onMenuItemClick(android.view.MenuItem r7) {
            /*
                r6 = this;
                java.lang.CharSequence r7 = r7.getTitle()
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI r0 = com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.this
                r1 = 2131821539(0x7f1103e3, float:1.9275824E38)
                java.lang.String r0 = r0.getString(r1)
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 == 0) goto L_0x00ac
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI r7 = com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.this
                r7.hideVKB()
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI r7 = com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.this
                boolean r1 = r7.f196948Y
                r2 = 5
                if (r1 != 0) goto L_0x003b
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                java.lang.String r3 = r7.f196936L
                java.lang.String r4 = "room_name"
                r1.putExtra(r4, r3)
                java.lang.String r3 = r7.f196941R
                java.lang.String r4 = "room_notice"
                r1.putExtra(r4, r3)
                r3 = -1
                r7.setResult(r3, r1)
                r7.finish()
                goto L_0x00a6
            L_0x003b:
                r7.hideVKB()
                u21.c r1 = u21.C101941c.m134173q()
                int r1 = r1.mo141443B()
                if (r1 != 0) goto L_0x0049
                goto L_0x0066
            L_0x0049:
                if (r1 != r0) goto L_0x0068
                u21.c r3 = u21.C101941c.m134173q()
                int r1 = r1 - r0
                p21.a r1 = r3.mo141456l(r1)
                boolean r3 = r1 instanceof p21.C100622g
                if (r3 == 0) goto L_0x0068
                p21.g r1 = (p21.C100622g) r1
                java.lang.String r1 = r1.f294819s
                java.lang.String r1 = r1.trim()
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x0068
            L_0x0066:
                r1 = 1
                goto L_0x0069
            L_0x0068:
                r1 = 0
            L_0x0069:
                if (r1 == 0) goto L_0x0073
                r1 = 2131837591(0x7f114297, float:1.9308381E38)
                r3 = 2131837590(0x7f114296, float:1.930838E38)
                r4 = 5
                goto L_0x007a
            L_0x0073:
                r1 = 2131833649(0x7f113331, float:1.9300386E38)
                r3 = 2131833651(0x7f113333, float:1.930039E38)
                r4 = 6
            L_0x007a:
                qo3.q r5 = new qo3.q
                r5.<init>(r7)
                java.lang.String r1 = r7.getString(r1)
                r5.mo107595g(r1)
                r5.mo107601m(r3)
                com.tencent.mm.plugin.announcement.b r1 = new com.tencent.mm.plugin.announcement.b
                r1.<init>(r7, r4)
                r5.mo107600l(r1)
                r1 = 2131833650(0x7f113332, float:1.9300388E38)
                java.lang.String r1 = r7.getString(r1)
                r5.mo107598j(r1)
                com.tencent.mm.plugin.announcement.a r1 = new com.tencent.mm.plugin.announcement.a
                r1.<init>(r7, r4)
                r5.mo107597i(r1)
                r5.mo107603o()
            L_0x00a6:
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI r7 = com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.this
                r7.mo94190g8(r2)
                return r0
            L_0x00ac:
                com.tencent.mm.plugin.announcement.ChatroomNoticeUI r7 = com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.this
                com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.m80800b8(r7)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.announcement.ChatroomNoticeUI.C68546b.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$c */
    public class C68547c implements Runnable {
        public C68547c() {
        }

        public void run() {
            ChatroomNoticeUI.m80800b8(ChatroomNoticeUI.this);
            ChatroomNoticeUI.this.enableOptionMenu(0, true);
            ChatroomNoticeUI.this.f196948Y = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$d */
    public class C68548d implements Runnable {

        /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$d$a */
        public class C68549a implements Runnable {
            public C68549a() {
            }

            public void run() {
                C45612m0.m50676C(ChatroomNoticeUI.this.f196935K);
            }
        }

        public C68548d() {
        }

        public void run() {
            long j;
            ChatroomNoticeUI chatroomNoticeUI = ChatroomNoticeUI.this;
            int i = ChatroomNoticeUI.f196934x0;
            chatroomNoticeUI.mo94190g8(4);
            ChatroomNoticeUI chatroomNoticeUI2 = ChatroomNoticeUI.this;
            int intExtra = chatroomNoticeUI2.getIntent().getIntExtra("from_scene", 0);
            ViewRoomDescStruct viewRoomDescStruct = new ViewRoomDescStruct();
            viewRoomDescStruct.f194654d = viewRoomDescStruct.mo86045b("ChatName", chatroomNoticeUI2.f196935K, true);
            long j2 = 0;
            viewRoomDescStruct.f194657g = C45628s0.m50739D(chatroomNoticeUI2.f196935K) ? 0 : 1;
            viewRoomDescStruct.f194656f = (long) chatroomNoticeUI2.f196937M;
            viewRoomDescStruct.f194659i = viewRoomDescStruct.mo86045b("NoticeId", "" + chatroomNoticeUI2.f196944U, true);
            if (chatroomNoticeUI2.f196939P) {
                j = 1;
            } else {
                j = (long) (chatroomNoticeUI2.f196940Q ? 2 : 3);
            }
            viewRoomDescStruct.f194655e = j;
            if (!chatroomNoticeUI2.mo94188e8()) {
                j2 = 1;
            }
            viewRoomDescStruct.f194660j = j2;
            viewRoomDescStruct.f194658h = (long) intExtra;
            viewRoomDescStruct.mo86054n();
            ChatroomNoticeUI.this.runOnUiThread(new C68549a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$e */
    public class C68550e implements MenuItem.OnMenuItemClickListener {
        public C68550e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ChatroomNoticeUI chatroomNoticeUI = ChatroomNoticeUI.this;
            int i = ChatroomNoticeUI.f196934x0;
            chatroomNoticeUI.mo94187d8();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$f */
    public class C68551f implements DialogInterface.OnClickListener {
        public C68551f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ChatroomNoticeUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$g */
    public class C68552g implements C47883u {

        /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$g$a */
        public class C68553a implements Runnable {
            public C68553a() {
            }

            public void run() {
                ChatroomNoticeUI.this.setResult(0);
                ChatroomNoticeUI.this.finish();
                ChatroomNoticeUI chatroomNoticeUI = ChatroomNoticeUI.this;
                int i = ChatroomNoticeUI.f196934x0;
                chatroomNoticeUI.mo94190g8(11);
            }
        }

        public C68552g() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            ((C119157j) C119157j.f356862d).mo183895z(new C68553a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$h */
    public class C68554h implements C47883u {
        public C68554h() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            ChatroomNoticeUI chatroomNoticeUI = ChatroomNoticeUI.this;
            int i = ChatroomNoticeUI.f196934x0;
            chatroomNoticeUI.mo94190g8(10);
        }
    }

    /* renamed from: b8 */
    public static void m80800b8(ChatroomNoticeUI chatroomNoticeUI) {
        NestedScrollView nestedScrollView = (NestedScrollView) chatroomNoticeUI.findViewById(C0966R.C0970id.f5234zt);
        nestedScrollView.mo145003q(0 - nestedScrollView.getScrollX(), chatroomNoticeUI.f196938N.getHeight() - nestedScrollView.getScrollY(), 100, false);
        nestedScrollView.postDelayed(new C68570d(chatroomNoticeUI, nestedScrollView), 100);
        chatroomNoticeUI.updateOptionMenuText(0, chatroomNoticeUI.getString(C0966R.string.f8014z_));
        chatroomNoticeUI.updateOptionMenuStyle(0, MMActivityController.C73075r.GREEN);
        chatroomNoticeUI.enableOptionMenu(false);
        chatroomNoticeUI.mo94190g8(3);
    }

    /* renamed from: K7 */
    public long mo94181K7() {
        return 4580249617L;
    }

    /* renamed from: L5 */
    public void mo94182L5(TextView textView) {
        C86709a0.m107528h();
        Bundle a = C45331f0.m50242a(true, C76528a.m92004a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f196935K).getUsername()));
        a.putInt("geta8key_scene", 31);
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107085xb(textView, 1, a, (String) null, C76979h.f224926w0);
    }

    /* renamed from: L7 */
    public C101835rd0 mo94183L7(C100755z zVar) {
        String s = C75592q0.m90789s();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(s);
        rd02.mo141279o(this.f196935K);
        rd02.mo141277m(zVar.field_sourceType);
        rd02.mo141273f(Util.nowMilliSecond());
        rd02.mo141278n(mo94185c8());
        return rd02;
    }

    /* renamed from: P7 */
    public void mo94184P7(String str, String str2, boolean z) {
        this.f196941R = str;
        String replace = str2.replace("<favitem", "<group_notice_item");
        this.f196942S = replace;
        this.f196942S = replace.replace("favitem>", "group_notice_item>");
        Log.m105925i("MicroMsg.ChatroomNoticeUI", "onContentSave. digest:%b, content:%b, isPureText:%b", Boolean.valueOf(Util.isNullOrNil(str)), Boolean.valueOf(Util.isNullOrNil(str2)), Boolean.valueOf(z));
        C50071k24 k242 = new C50071k24();
        k242.f136519d = this.f196935K;
        k242.f136520e = this.f196941R;
        k242.f136522g = this.f196942S;
        k242.f136525j = z ? 1 : 0;
        k242.mo73343b().mo9225i().mo11397F(this).mo123062e(new C68545a());
    }

    /* renamed from: c8 */
    public final String mo94185c8() {
        if (this.f196950p0 == null) {
            String s = C75592q0.m90789s();
            this.f196950p0 = C90193h.m112878f((s + this.f196935K + System.currentTimeMillis()).getBytes());
        }
        return this.f196950p0;
    }

    /* renamed from: d5 */
    public void mo94186d5(int i) {
        super.mo94186d5(i);
        enableOptionMenu(0, true);
        this.f196948Y = true;
    }

    /* renamed from: d8 */
    public final void mo94187d8() {
        if (!this.f196939P && !this.f196940Q) {
            setResult(0);
            finish();
        } else if (this.f196948Y) {
            C77426q qVar = new C77426q(this);
            qVar.mo107595g(getString(C0966R.string.i5l));
            qVar.mo107601m(C0966R.string.i5n);
            qVar.mo107600l(new C68554h());
            qVar.mo107598j(getString(C0966R.string.i5m));
            qVar.mo107597i(new C68552g());
            qVar.mo107603o();
        } else {
            setResult(0);
            finish();
        }
    }

    /* renamed from: e8 */
    public final boolean mo94188e8() {
        Boolean bool = this.f196949Z;
        if (bool != null) {
            return bool.booleanValue();
        }
        String g = C45612m0.m50690g(this.f196935K);
        Map<String, String> parseXml = XmlParser.parseXml(this.f196942S, "favitem", (String) null);
        boolean z = true;
        if (parseXml == null) {
            this.f196949Z = Boolean.TRUE;
            return true;
        }
        String str = parseXml.get(".favitem.source.$sourceid");
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(g) && g.contains(str)) {
            this.f196949Z = Boolean.TRUE;
            return true;
        } else if (Util.isNullOrNil(str)) {
            if (Math.abs(C45612m0.m50689f(this.f196935K) - this.f196944U) >= 5) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.f196949Z = valueOf;
            return valueOf.booleanValue();
        } else {
            this.f196949Z = Boolean.FALSE;
            return false;
        }
    }

    /* renamed from: f8 */
    public final void mo94189f8(int i, int i2, String str) {
        C89779i0 i0Var = this.f196945V;
        if (i0Var != null && i0Var.isShowing()) {
            this.f196945V.dismiss();
        }
        if (i == 0 && i2 == 0) {
            Log.m105924i("MicroMsg.ChatroomNoticeUI", "dz[onSceneEnd : set announcement successfully!]");
            C115669n.INSTANCE.idkeyStat(219, 15, 1, true);
            C76912y0.m92768g(this, getString(C0966R.string.m95));
            Intent intent = new Intent();
            intent.putExtra("room_name", this.f196936L);
            intent.putExtra("room_notice", this.f196941R);
            setResult(-1, intent);
            finish();
            return;
        }
        Log.m105929w("MicroMsg.ChatroomNoticeUI", "dz[handleSetNoticeFailed:%s]", str);
        C7660a a = C7660a.m7782a(str);
        if (a != null) {
            a.mo8793c(this, new C68569c(this));
        } else {
            C76879j.m92726T(getContext(), getString(C0966R.string.m96));
        }
        Log.m105929w("MicroMsg.ChatroomNoticeUI", "dz[onSceneEnd : set announcement failed:%d %d %s]", Integer.valueOf(i), Integer.valueOf(i2), str);
    }

    /* renamed from: g8 */
    public final void mo94190g8(int i) {
        long j;
        ViewRoomDescTipsStruct viewRoomDescTipsStruct = new ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.mo93200s(this.f196935K);
        viewRoomDescTipsStruct.f194663f = (long) this.f196937M;
        if (this.f196939P) {
            j = 1;
        } else {
            j = (long) (this.f196940Q ? 2 : 3);
        }
        viewRoomDescTipsStruct.f194662e = j;
        viewRoomDescTipsStruct.mo93201t("" + this.f196944U);
        viewRoomDescTipsStruct.f194664g = (long) i;
        viewRoomDescTipsStruct.mo86054n();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.at6;
    }

    /* renamed from: h2 */
    public void mo94191h2(int i, long j) {
        super.mo94191h2(i, j);
        enableOptionMenu(0, true);
        this.f196948Y = true;
    }

    public void initView() {
        super.initView();
        setMMTitle((int) C0966R.string.f361216i81);
        setNavigationbarColor(getResources().getColor(C0966R.color.al6));
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(C0966R.color.al6)));
        addTextOptionMenu(0, getString(C0966R.string.f7956xe), new C68546b(), (View.OnLongClickListener) null, MMActivityController.C73075r.BLACK);
        C86709a0.m107528h();
        C45331f0.m50242a(true, C76528a.m92004a(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f196935K).getUsername())).putInt("geta8key_scene", 31);
        boolean e8 = mo94188e8();
        boolean booleanExtra = getIntent().getBooleanExtra("room_notice_reedit", false);
        boolean z = this.f196939P;
        if ((!z && !this.f196940Q) || (!e8 && !booleanExtra)) {
            if (!z && !this.f196940Q && e8) {
                View findViewById = findViewById(C0966R.C0970id.ivy);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/announcement/ChatroomNoticeUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/announcement/ChatroomNoticeUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            removeOptionMenu(0);
        }
        if (booleanExtra) {
            ((C119157j) C119157j.f356862d).mo183884o(new C68547c());
        }
        this.f196938N = (LinearLayout) findViewById(C0966R.C0970id.euz);
        if (Util.isNullOrNil(this.f196941R)) {
            this.f196938N.setVisibility(8);
        } else {
            TextView textView = (TextView) this.f196938N.findViewById(C0966R.C0970id.hjh);
            if (this.f196944U != 0) {
                textView.setVisibility(0);
                textView.setText(C72715f.m85111d("yyyy-MM-dd HH:mm", this.f196944U));
            } else {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) this.f196938N.findViewById(C0966R.C0970id.hjg);
            textView2.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f196943T), textView2.getTextSize()));
            ImageView imageView = (ImageView) this.f196938N.findViewById(C0966R.C0970id.hjf);
            String str = this.f196943T;
            if (Util.isNullOrNil(str)) {
                imageView.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
            }
        }
        if (Util.isNullOrNil(this.f196941R) && Util.isNullOrNil(this.f196942S)) {
            updateOptionMenuText(0, getContext().getString(C0966R.string.f8014z_));
            updateOptionMenuStyle(0, MMActivityController.C73075r.GREEN);
            if (this.f196948Y) {
                enableOptionMenu(true);
            } else {
                enableOptionMenu(false);
            }
        }
        ((C119157j) C119157j.f356862d).mo183870a(new C68548d());
    }

    /* renamed from: k6 */
    public void mo94192k6() {
        enableOptionMenu(0, true);
        this.f196948Y = true;
    }

    /* renamed from: n4 */
    public void mo94193n4(int i, int i2) {
        super.mo94193n4(i, i2);
        enableOptionMenu(0, true);
        this.f196948Y = true;
    }

    public void onCreate(Bundle bundle) {
        long j;
        this.f196935K = getIntent().getStringExtra("RoomInfo_Id");
        this.f196941R = getIntent().getStringExtra("room_notice");
        String stringExtra = getIntent().getStringExtra("room_notice_xml");
        this.f196942S = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            this.f196942S = this.f196941R;
        }
        this.f196943T = getIntent().getStringExtra("room_notice_editor");
        this.f196944U = getIntent().getLongExtra("room_notice_publish_time", 0);
        this.f196936L = getIntent().getStringExtra("room_name");
        int i = 0;
        this.f196937M = getIntent().getIntExtra("room_member_count", 0);
        this.f196939P = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.f196940Q = getIntent().getBooleanExtra("Is_RoomManager", false);
        getIntent().putExtra("KEY_EDITABLE", Util.isNullOrNil(this.f196942S));
        String replace = this.f196942S.replace("<group_notice_item", "<favitem");
        this.f196942S = replace;
        this.f196942S = replace.replace("group_notice_item>", "favitem>");
        getIntent().putExtra("KEY_CONTENT_XML", this.f196942S);
        getIntent().putExtra("KEY_CONTENT_PURE_TEXT", !this.f196942S.trim().startsWith("<favitem"));
        super.onCreate(bundle);
        C115669n.INSTANCE.idkeyStat(219, 0, 1, true);
        initView();
        setBackBtn(new C68550e());
        if (isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
        ViewRoomDescTipsStruct viewRoomDescTipsStruct = new ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.mo93200s(this.f196935K);
        viewRoomDescTipsStruct.f194663f = (long) this.f196937M;
        boolean z = this.f196939P;
        if (z) {
            j = 1;
        } else {
            if (z) {
                i = 2;
            }
            j = (long) i;
        }
        viewRoomDescTipsStruct.f194662e = j;
        viewRoomDescTipsStruct.mo93201t("" + this.f196944U);
        viewRoomDescTipsStruct.f194664g = 1;
        viewRoomDescTipsStruct.mo86054n();
        this.f196947X.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        C89779i0 i0Var = this.f196945V;
        if (i0Var != null && i0Var.isShowing()) {
            this.f196945V.dismiss();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            Log.m105924i("MicroMsg.ChatroomNoticeUI", "press back.");
            mo94187d8();
            return true;
        }
        super.onKeyDown(i, keyEvent);
        return false;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (getIntent().getBooleanExtra("annoucement_revoke", false)) {
            C76879j.m92711E(this, getString(C0966R.string.by5), (String) null, getString(C0966R.string.a18), false, new C68551f());
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 993) {
            mo94189f8(i, i2, str);
            return;
        }
        Log.m105929w("MicroMsg.ChatroomNoticeUI", "error cgi type callback:[%d]", Integer.valueOf(yVar.getType()));
    }

    /* renamed from: q4 */
    public void mo94194q4(long j) {
        long j2;
        int i = 2;
        long j3 = 1;
        int i2 = j == 1 ? 4 : j == 16 ? 1 : j == 65536 ? 2 : j == 4096 ? 3 : 0;
        GroupNoticeInfoStruct groupNoticeInfoStruct = new GroupNoticeInfoStruct();
        groupNoticeInfoStruct.f194223d = groupNoticeInfoStruct.mo86045b("ChatName", this.f196935K, true);
        if (this.f196939P) {
            j2 = 1;
        } else {
            if (!this.f196940Q) {
                i = 3;
            }
            j2 = (long) i;
        }
        groupNoticeInfoStruct.f194224e = j2;
        groupNoticeInfoStruct.f194225f = (long) this.f196937M;
        if (!Util.isNullOrNil(this.f196942S)) {
            j3 = 2;
        }
        groupNoticeInfoStruct.f194226g = j3;
        groupNoticeInfoStruct.f194227h = groupNoticeInfoStruct.mo86045b("NoticeId", mo94185c8(), true);
        groupNoticeInfoStruct.f194228i = (long) i2;
        groupNoticeInfoStruct.mo86054n();
    }

    /* renamed from: r3 */
    public void mo94195r3(int i) {
        super.mo94195r3(i);
        enableOptionMenu(0, true);
        this.f196948Y = true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C1496e.class);
    }
}
