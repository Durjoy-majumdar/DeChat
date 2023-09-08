package vv2;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.sport.model.C115769k;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C7250m;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C97625j3;
import gc2.C116945b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p196ln.C76708i;
import p248ug.C52558c;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C48009v0;
import tv2.C14096e;

/* renamed from: vv2.a */
public class C52999a implements C67027a, C11385n {

    /* renamed from: j */
    public static final String f147908j = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");

    /* renamed from: d */
    public Context f147909d;

    /* renamed from: e */
    public C72996z1 f147910e;

    /* renamed from: f */
    public C47511g f147911f;

    /* renamed from: g */
    public CheckBoxPreference f147912g;

    /* renamed from: h */
    public CheckBoxPreference f147913h;

    /* renamed from: i */
    public C89779i0 f147914i;

    /* renamed from: vv2.a$a */
    public class C53000a implements DialogInterface.OnClickListener {
        public C53000a(C52999a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C14096e.m13447a(25);
            ((C72972g4) C97625j3.m125812b().mo105911z()).mo101089TE("gh_43f2581f6fd6");
        }
    }

    public C52999a(Context context) {
        this.f147909d = context;
    }

    /* renamed from: a */
    public final void mo73742a() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f147911f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f147910e.getUsername(), this.f147910e.mo62898f(), this.f147909d.getString(C0966R.string.bsf));
        if (this.f147910e.mo62927s3()) {
            helperHeaderPreference.mo7601J(1);
            this.f147911f.mo72529n("contact_info_sport_install", true);
            this.f147911f.mo72529n("contact_info_sport_uninstall", false);
            this.f147911f.mo72529n("contact_info_go_to_sport", false);
            this.f147911f.mo72529n("contact_info_go_to_my_profile", false);
            this.f147911f.mo72529n("contact_info_invite_friend", false);
            this.f147911f.mo72529n("contact_info_common_problem", false);
            this.f147911f.mo72529n("contact_info_record_data", false);
            this.f147911f.mo72529n("contact_info_privacy_and_notification", false);
            this.f147911f.mo72529n("contact_info_top_sport", false);
            this.f147911f.mo72529n("contact_info_not_disturb", false);
            if (((C44660i2) C97625j3.m125812b().mo105908w()).mo69755a0(this.f147910e.getUsername())) {
                this.f147912g.mo6805K(true);
            } else {
                this.f147912g.mo6805K(false);
            }
            if (C45628s0.m50746K(this.f147910e)) {
                this.f147913h.mo6805K(true);
            } else {
                this.f147913h.mo6805K(false);
            }
        } else {
            helperHeaderPreference.mo7601J(0);
            this.f147911f.mo72529n("contact_info_sport_install", false);
            this.f147911f.mo72529n("contact_info_sport_uninstall", true);
            this.f147911f.mo72529n("contact_info_go_to_sport", true);
            this.f147911f.mo72529n("contact_info_go_to_my_profile", true);
            this.f147911f.mo72529n("contact_info_invite_friend", true);
            this.f147911f.mo72529n("contact_info_common_problem", true);
            this.f147911f.mo72529n("contact_info_record_data", true);
            this.f147911f.mo72529n("contact_info_privacy_and_notification", true);
            this.f147911f.mo72529n("contact_info_top_sport", true);
            this.f147911f.mo72529n("contact_info_not_disturb", true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1 && intent != null) {
            ArrayList<String> stringsToList = Util.stringsToList(intent.getStringExtra("received_card_name").split(","));
            String stringExtra = intent.getStringExtra("custom_send_text");
            for (String next : stringsToList) {
                C7250m.m7431a().Y50("gh_43f2581f6fd6", next, C72996z1.m85820U5(next));
                if (!Util.isNullOrNil(stringExtra)) {
                    SendMsgEvent sendMsgEvent = new SendMsgEvent();
                    SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                    aVar.f9497a = next;
                    aVar.f9498b = stringExtra;
                    aVar.f9499c = C45628s0.m50810y(next);
                    sendMsgEvent.f9496d.f9500d = 0;
                    sendMsgEvent.publish();
                }
            }
        }
    }

    public boolean onDetach() {
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C44590b1) {
            C97625j3.m125815e().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C44590b1) yVar).mo56091T0();
                Log.m105925i("MicroMsg.Sport.ContactWidgetSport", "bind fitness contact %s success", T0);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get("gh_43f2581f6fd6");
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.Sport.ContactWidgetSport", "respUsername == " + T0 + ", contact = " + z1Var);
                } else {
                    C52558c cVar = null;
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        C52558c b = C47984k.m53328b(nullAsNil);
                        if (b != null) {
                            b.field_username = T0;
                        }
                        C48009v0.Fx0().mo72764c(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                        cVar = b;
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        C97625j3.m125812b().mo105907v().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.Sport.ContactWidgetSport", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(z1Var.getUsername());
                        if (cVar != null) {
                            C48009v0.Fx0().insert(cVar);
                        } else {
                            Class cls = C76708i.class;
                            C52558c b2 = C47984k.m53328b(z1Var2.getUsername());
                            if (b2 == null || b2.mo72809G1()) {
                                Log.m105918d("MicroMsg.Sport.ContactWidgetSport", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.Sport.ContactWidgetSport", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C48009v0.Fx0().replace(C48009v0.Fx0().mo72757SE(z1Var.getUsername()));
                C97625j3.m125812b().mo105906u().mo119676J(327825, Boolean.TRUE);
                C116945b.yx0().mo175767h(3, 1, 0, "", (String) null);
                Log.m105925i("MicroMsg.NewTips.NewTipsManager", "dancy register local newtips, tipsId:%s, tipsVersion:%s, key:%s", 3, 1, "");
            } else {
                Log.m105921e("MicroMsg.Sport.ContactWidgetSport", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && ((i2 == -2 || i2 == -101 || i2 == -24) && !Util.isNullOrNil(str))) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
            }
            C89779i0 i0Var = this.f147914i;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            mo73742a();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        this.f147911f = gVar;
        this.f147910e = z1Var;
        gVar.mo72520b(C0966R.xml.f8879a8);
        this.f147912g = (CheckBoxPreference) gVar.mo72519a("contact_info_top_sport");
        this.f147913h = (CheckBoxPreference) gVar.mo72519a("contact_info_not_disturb");
        mo73742a();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        if ("contact_info_record_data".equals(str)) {
            Intent intent = new Intent();
            intent.setClassName(this.f147909d, "com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI");
            Context context = this.f147909d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/sport/ui/widget/ContactWidgetSport", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/sport/ui/widget/ContactWidgetSport", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if ("contact_info_top_sport".equals(str)) {
            if (this.f147912g.mo6804J()) {
                C14096e.m13447a(20);
                C45628s0.m50787m0(this.f147910e.getUsername(), true, true);
            } else {
                C14096e.m13447a(21);
                C45628s0.m50803u0(this.f147910e.getUsername(), true);
            }
        } else if ("contact_info_not_disturb".equals(str)) {
            if (this.f147913h.mo6804J()) {
                C14096e.m13447a(22);
                C45628s0.m50779i0(this.f147910e, true);
            } else {
                C14096e.m13447a(23);
                C45628s0.m50797r0(this.f147910e, true);
            }
        } else if ("contact_info_go_to_sport".equals(str)) {
            Intent intent2 = new Intent();
            intent2.putExtra("Chat_User", this.f147910e.getUsername());
            intent2.putExtra("finish_direct", true);
            C88144b.m109801s(this.f147909d, ".ui.chatting.ChattingUI", intent2, (Bundle) null);
            C14096e.m13447a(19);
        } else if ("contact_info_go_to_my_profile".equals(str)) {
            String s = C75592q0.m90789s();
            if (Util.isNullOrNil(s)) {
                Log.m105920e("MicroMsg.Sport.ContactWidgetSport", "Get username from UserInfo return null or nil.");
                return false;
            }
            Intent intent3 = new Intent();
            intent3.putExtra("username", s);
            C88144b.m109791i(this.f147909d, "exdevice", ".ui.ExdeviceProfileUI", intent3, (Bundle) null);
            C14096e.m13447a(3);
        } else if ("contact_info_invite_friend".equals(str)) {
            Intent intent4 = new Intent();
            intent4.putExtra("Select_Talker_Name", this.f147910e.getUsername());
            intent4.putExtra("Select_block_List", this.f147910e.getUsername());
            intent4.putExtra("Select_Conv_Type", 3);
            intent4.putExtra("Select_Send_Card", true);
            intent4.putExtra("mutil_select_is_ret", true);
            C88144b.m109802t(this.f147909d, ".ui.transmit.SelectConversationUI", intent4, 1);
            C14096e.m13447a(4);
        } else if ("contact_info_common_problem".equals(str)) {
            Intent intent5 = new Intent();
            intent5.putExtra("KPublisherId", "custom_menu");
            intent5.putExtra("pre_username", this.f147910e.getUsername());
            intent5.putExtra("prePublishId", "custom_menu");
            intent5.putExtra("preUsername", this.f147910e.getUsername());
            intent5.putExtra("preChatName", this.f147910e.getUsername());
            intent5.putExtra("preChatTYPE", C45629t0.m50815b(this.f147910e.getUsername(), this.f147910e.getUsername()));
            intent5.putExtra("rawUrl", f147908j);
            intent5.putExtra("geta8key_username", this.f147910e.getUsername());
            intent5.putExtra("from_scence", 1);
            C88144b.m109791i(this.f147909d, "webview", ".ui.tools.WebViewUI", intent5, (Bundle) null);
            C14096e.m13447a(5);
        } else if ("contact_info_privacy_and_notification".equals(str)) {
            C88144b.m109789g(this.f147909d, "exdevice", ".ui.ExdeviceSettingUI");
        } else if ("contact_info_sport_install".equals(str)) {
            C14096e.m13447a(13);
            Context context3 = this.f147909d;
            C89779i0 Q = C76879j.m92723Q(context3, context3.getString(C0966R.string.a3h), this.f147909d.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
            this.f147914i = Q;
            Q.show();
            C97625j3.m125815e().mo123455a(30, this);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_43f2581f6fd6");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(1);
            C97625j3.m125815e().mo123460f(new C44590b1(1, linkedList, linkedList2, "", ""));
            C115769k.m162823b(true);
        } else if ("contact_info_sport_uninstall".equals(str)) {
            C14096e.m13447a(14);
            Context context4 = this.f147909d;
            C76879j.m92707A(context4, context4.getString(C0966R.string.iwz), "", this.f147909d.getString(C0966R.string.f7930wk), this.f147909d.getString(C0966R.string.f7926wf), new C53001b(this), (DialogInterface.OnClickListener) null);
        } else if ("contact_info_clear_data".equals(str)) {
            Context context5 = this.f147909d;
            C76879j.m92707A(context5, context5.getString(C0966R.string.blf), "", this.f147909d.getString(C0966R.string.f7930wk), this.f147909d.getString(C0966R.string.f7926wf), new C53000a(this), (DialogInterface.OnClickListener) null);
        }
        return false;
    }
}
