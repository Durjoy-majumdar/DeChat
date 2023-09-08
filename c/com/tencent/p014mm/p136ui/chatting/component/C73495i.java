package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import bk3.C0313c;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.p136ui.chatting.ChattingUI;
import com.tencent.p014mm.p136ui.contact.C44885y3;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.p136ui.mvvm.MvvmSelectContactUI;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import d62.C7250m;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k20.C9556a;
import p196ln.C76708i;
import p270xi.C91212b;
import pc0.C100760a0;
import tc0.C48629h;
import tc0.C77885p;
import te3.C50954qg;
import vm3.C65764a;
import vm3.C78444g;
import wd3.C78575u;
import xm3.C78870a;
import xm3.C78877c0;
import xm3.C78889f0;
import xm3.C78917n;
import xm3.C78928r;
import xm3.C78938y;
import xm3.C78944z;
import yb2.C79062b;
import zj3.C79351f;

@C91212b(exportInterface = C79351f.class)
/* renamed from: com.tencent.mm.ui.chatting.component.i */
public class C73495i extends C73412a implements C79351f {
    /* renamed from: B */
    public void mo102463B() {
        Intent intent = new Intent(this.f215752d.f193286j.getContext(), MvvmSelectContactUI.class);
        if (C72996z1.m85843n5(this.f215752d.mo91577r()) || C72996z1.m85847r5(this.f215752d.mo91577r())) {
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219165f, 1, 16777216));
        } else {
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219165f, 1, 2048, 16777216));
        }
        intent.putExtra("list_type", 4);
        intent.putExtra("received_card_name", this.f215752d.mo91577r());
        HashSet<String> c = C74560s1.m89274c();
        c.add(this.f215752d.mo91577r());
        intent.putExtra("block_contact", Util.setToString(c, ","));
        intent.putExtra("titile", this.f215752d.mo91572m().getString(C0966R.string.f7496hv));
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 16);
        C79062b.m95631b(intent, C0313c.class);
        C79062b.m95631b(intent, C78444g.class);
        C79062b.m95631b(intent, C65764a.class);
        C79062b.m95631b(intent, C78877c0.class);
        C79062b.m95631b(intent, C78889f0.class);
        C79062b.m95631b(intent, C78870a.class);
        C79062b.m95631b(intent, C78938y.class);
        C79062b.m95631b(intent, C78944z.class);
        C79062b.m95631b(intent, C78928r.class);
        C79062b.m95631b(intent, C78917n.class);
        this.f215752d.f193286j.startActivityForResult(intent, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        if (i3 != 223) {
            if (i3 == 224 && i4 == -1 && intent2 != null) {
                String stringExtra = intent2.getStringExtra("be_send_card_name");
                String stringExtra2 = intent2.getStringExtra("received_card_name");
                String stringExtra3 = intent2.getStringExtra("custom_send_text");
                boolean booleanExtra = intent2.getBooleanExtra("Is_Chatroom", false);
                Intent intent3 = new Intent(this.f215752d.mo91565f(), ChattingUI.class);
                intent3.putExtra("Chat_User", stringExtra2);
                intent3.putExtra("send_card_username", stringExtra);
                intent3.putExtra("send_card_edittext", stringExtra3);
                intent3.putExtra("Is_Chatroom", booleanExtra);
                BaseChattingUIFragment baseChattingUIFragment = this.f215752d.f193286j;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent3);
                BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
                C117292a.m165358d(baseChattingUIFragment2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/component/CardComponent", "dealWithRequestCode", "(IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/CardComponent", "dealWithRequestCode", "(IILandroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (i4 == -1 && intent2 != null) {
            String stringExtra4 = intent2.getStringExtra("be_send_card_name");
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(stringExtra4);
            if (!z1Var.mo62932t3()) {
                String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(stringExtra4);
                String stringExtra5 = intent2.getStringExtra("received_card_name");
                boolean booleanExtra2 = intent2.getBooleanExtra("Is_Chatroom", false);
                C78575u.C78583h hVar = new C78575u.C78583h(this.f215752d.mo91565f());
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106820Fj(stringExtra4, true);
                int E2 = z1Var.mo73953E2();
                Set<String> set = C45628s0.f123410p;
                StringBuffer stringBuffer = new StringBuffer(C72996z1.m85810M4(E2) ? this.f215752d.f193286j.getResources().getString(C0966R.string.f8019zf) : C72996z1.m85843n5(stringExtra4) ? SelectConversationUI.m89668y8(MMApplicationContext.getContext(), z1Var) : this.f215752d.f193286j.getResources().getString(C0966R.string.f8021zh));
                stringBuffer.append(displayName);
                String stringBuffer2 = stringBuffer.toString();
                hVar.mo108578p(stringExtra5);
                hVar.mo108571i(stringBuffer2);
                hVar.mo108569g(Boolean.TRUE);
                hVar.mo108573k(C0966R.string.a2s);
                hVar.mo108563a(new C44823h(this, stringExtra4, stringExtra5, booleanExtra2));
                hVar.mo108574l();
            }
        }
    }

    /* renamed from: d */
    public boolean mo102464d(C72963f4 f4Var) {
        if (!f4Var.mo100975N3()) {
            return false;
        }
        if (!this.f215752d.mo91577r().equals("medianote")) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
        }
        C73673d4.m87248b(f4Var);
        this.f215752d.mo91541B(true);
        return true;
    }

    /* renamed from: e */
    public void mo70065e() {
        C67391b bVar = this.f215752d;
        if (bVar != null) {
            Intent intent = bVar.mo91565f().getIntent();
            String stringExtra = intent.getStringExtra("Chat_User");
            String stringExtra2 = intent.getStringExtra("send_card_username");
            if (!Util.isNullOrNil(stringExtra2)) {
                boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
                String stringExtra3 = intent.getStringExtra("send_card_edittext");
                int i = 66;
                if (booleanExtra) {
                    String nullAs = Util.nullAs(stringExtra, "");
                    String a = C44885y3.m49774a(stringExtra2, (C50954qg) null);
                    C100760a0.C100764f a2 = C100760a0.m131931a(nullAs);
                    a2.f295187a = nullAs;
                    a2.f295189c = a;
                    if (!C72996z1.m85843n5(stringExtra2)) {
                        i = 42;
                    }
                    a2.f295190d = i;
                    a2.f295191e = 0;
                    a2.f295194h = 4;
                    a2.mo140195a().mo123694a();
                } else {
                    ArrayList<String> stringsToList = Util.stringsToList(Util.nullAs(stringExtra, "").split(","));
                    String a3 = C44885y3.m49774a(stringExtra2, (C50954qg) null);
                    for (int i2 = 0; i2 < stringsToList.size(); i2++) {
                        String str = stringsToList.get(i2);
                        C100760a0.C100764f a4 = C100760a0.m131931a(str);
                        a4.f295187a = str;
                        a4.f295189c = a3;
                        a4.f295190d = C72996z1.m85843n5(stringExtra2) ? 66 : 42;
                        a4.f295191e = 0;
                        a4.f295194h = 4;
                        a4.mo140195a().mo123694a();
                    }
                }
                if (stringExtra3 != null) {
                    C7250m.m7431a().mo136252Ar(stringExtra3, stringExtra);
                }
            }
        }
    }
}
