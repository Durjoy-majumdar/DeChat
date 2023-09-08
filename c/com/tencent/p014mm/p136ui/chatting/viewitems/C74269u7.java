package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.AutoPlay;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import kd0.C76552z;
import nj3.C76874e0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p371ph.C21967a;
import qg2.C77335p;
import uj3.C78208e;
import uw2.C78294g;
import uw2.C78296j;
import uw2.C78306m;
import zj3.C79362h1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u7 */
public final class C74269u7 extends C74023i {

    /* renamed from: v */
    public C67391b f218148v;

    /* renamed from: w */
    public C11385n f218149w;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u7$a */
    public class C74270a implements C11385n {
        public C74270a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105918d("MicroMsg.ChattingItemVoiceRemindRemind", "errType " + i + " errCode " + i2 + "  scene " + yVar.getType());
            C97625j3.m125815e().mo123470p(221, C74269u7.this.f218149w);
            C74269u7.this.f218149w = null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u7$b */
    public class C74271b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f218151d;

        /* renamed from: e */
        public final /* synthetic */ C78208e f218152e;

        public C74271b(C72963f4 f4Var, C78208e eVar) {
            this.f218151d = f4Var;
            this.f218152e = eVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (Util.isNullOrNil(this.f218151d.mo108765s2())) {
                Log.m105918d("MicroMsg.ChattingItemVoiceRemindRemind", "filename is null");
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            AutoPlay W = ((C79362h1) C74269u7.this.f218148v.f193278b.mo102812a(C79362h1.class)).mo102325W();
            int adapterPosition = this.f218152e.getAdapterPosition();
            C72963f4 f4Var = this.f218151d;
            if (f4Var == null) {
                W.getClass();
            } else {
                W.mo102005h();
                Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(4115, (Object) null);
                if (bool == null || !bool.booleanValue()) {
                    C97625j3.m125812b().mo105906u().mo119676J(4115, Boolean.TRUE);
                    W.f215196i.mo91555P(C0966R.raw.icons_filled_ear, C0966R.color.f2933h, W.f215197j.getString(C0966R.string.f360267ba2), 4000);
                }
                if (!((C21967a) W.f215194g).mo35058b() || f4Var.getMsgId() != W.f215195h) {
                    W.mo102003f(f4Var);
                    if (f4Var.mo108769t2() == 0 && !C76552z.m92079q(f4Var)) {
                        W.mo102002e(adapterPosition + 1);
                    }
                    W.mo102009l();
                } else {
                    W.mo102016s(true);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6972tr);
        C74330z8 z8Var = new C74330z8();
        z8Var.mo103297a(n4Var, true);
        n4Var.setTag(z8Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (menuItem.getItemId() != 111) {
            return false;
        }
        Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C67391b bVar2 = bVar;
        C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bVar.mo91556Q((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoiceRemindRemind", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        int m = C72695v.m85071m(C75604z3.m90840l(this.f218148v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        int i = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f218148v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null).f195594l;
        if (i <= 0 || (i > 0 && m >= 100)) {
            e0Var.mo107136c(b, 111, 0, this.f218148v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
        }
        if (this.f218148v.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, this.f218148v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        String str2;
        String str3;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        C74330z8 z8Var = (C74330z8) cVar;
        this.f218148v = bVar2;
        C68070l a0 = C72709y1.Ax0().mo135038a0(f4Var.getMsgId());
        String content = f4Var.getContent();
        C68070l.C68072b u = (a0 == null || content == null) ? null : C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
        C78294g a = C78294g.m94582a(content);
        boolean z = true;
        if (!(a == null || a.f229341a == 0)) {
            try {
                String h = C72715f.m85115h(bVar.mo91565f(), a.f229341a);
                if (h != null) {
                    if (h.length() > 0) {
                        String[] split = h.split(";");
                        str3 = "" + split[0].replace(" ", "");
                        if (split.length > 1) {
                            str3 = str3 + split[1];
                        }
                        if (!(u == null || u.f195574g == null)) {
                            str3 = str3 + " " + u.f195574g;
                        }
                        z8Var.f218346b.setText(str3);
                    }
                }
                str3 = "";
                str3 = str3 + " " + u.f195574g;
                z8Var.f218346b.setText(str3);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindRemind", e, "", new Object[0]);
            }
        }
        Log.m105918d("MicroMsg.ChattingItemVoiceRemindRemind", "content remind " + Util.secPrint(f4Var.getContent()));
        if (Util.isNullOrNil(f4Var.mo108765s2()) && a.f229345e > 0) {
            C72963f4 h302 = ((C72972g4) C97625j3.m125812b().mo105911z()).h30(f4Var.mo108768t(), (long) a.f229345e);
            if (!Util.isNullOrNil(h302.mo108765s2())) {
                String yr02 = C78306m.yr0(C75592q0.m90789s());
                if (C86013q1.m106443d(C78296j.m94584b(h302.mo108765s2(), false), C78296j.m94584b(yr02, false), false) >= 0) {
                    f4Var2.mo108739S2(yr02);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var2);
                }
            }
        }
        if (Util.isNullOrNil(f4Var.mo108765s2()) && a != null && (str2 = a.f229346f) != null && str2.length() > 0 && a.f229347g > 0 && this.f218149w == null) {
            String yr03 = C78306m.yr0(C75592q0.m90789s());
            String b = C78296j.m94584b(yr03, false);
            if (Util.isNullOrNil(f4Var.mo108765s2())) {
                f4Var2.mo108739S2(yr03);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var2);
                Log.m105918d("MicroMsg.ChattingItemVoiceRemindRemind", "content.attachid " + u.f195606o);
                C72683d h2 = C72695v.m85066h(b, f4Var.getMsgId(), u.f195566e, u.f195562d, u.f195606o, u.f195594l);
                Log.m105918d("MicroMsg.ChattingItemVoiceRemindRemind", "ainfo.field_mediaSvrId " + h2.field_mediaSvrId);
                if (h2.field_mediaSvrId != null) {
                    C89137b0 e2 = C97625j3.m125815e();
                    C74270a aVar = new C74270a();
                    this.f218149w = aVar;
                    e2.mo123455a(221, aVar);
                    Log.m105918d("MicroMsg.ChattingItemVoiceRemindRemind", "doscene");
                    C97625j3.m125815e().mo123460f(new C77335p(h2, true));
                }
            }
        }
        z8Var.f218347c.setOnClickListener(new C74271b(f4Var2, z8Var));
        long msgId = f4Var.getMsgId();
        AutoPlay W = ((C79362h1) this.f218148v.f193278b.mo102812a(C79362h1.class)).mo102325W();
        if (!((C21967a) W.f215194g).mo35058b() || W.f215195h != msgId) {
            z = false;
        }
        if (z) {
            z8Var.f218347c.setImageResource(C0966R.C0969drawable.ajq);
        } else {
            z8Var.f218347c.setImageResource(C0966R.C0969drawable.ajs);
        }
        z8Var.clickArea.setTag(new C74243t8(f4Var2, bVar.mo91583x(), z8Var, (String) null));
        if (C97625j3.m125812b().mo105883I()) {
            z8Var.clickArea.setOnLongClickListener(mo103098p(bVar2));
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048190;
    }

    /* renamed from: n0 */
    public boolean mo103045n0(C67391b bVar) {
        return false;
    }

    /* renamed from: y */
    public String mo103068y(C67391b bVar, C72963f4 f4Var) {
        return bVar.mo91577r();
    }
}
