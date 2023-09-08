package com.tencent.p014mm.plugin.profile;

import ad3.C67028b;
import ae3.C67030b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ChatroomMemberInviteerUpdatedEvent;
import com.tencent.p014mm.autogen.events.RecoverAccountFriendEvent;
import com.tencent.p014mm.autogen.events.TalkRoomServerEvent;
import com.tencent.p014mm.autogen.events.VoipCheckIsDeviceUsingEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.NewFriendAssistActionStruct;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.ButtonPreference;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.TextPreference;
import com.tencent.p014mm.plugin.account.friend.model.C68397a;
import com.tencent.p014mm.plugin.profile.logic.OpenIMPreference;
import com.tencent.p014mm.plugin.profile.p088ui.C70293u1;
import com.tencent.p014mm.plugin.profile.p088ui.ContactMoreInfoUI;
import com.tencent.p014mm.plugin.profile.p088ui.MultiButtonPreference;
import com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference;
import com.tencent.p014mm.plugin.profile.p088ui.PermissionSettingUI;
import com.tencent.p014mm.plugin.profile.p088ui.PermissionSettingUI2;
import com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI;
import com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2;
import com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b;
import com.tencent.p014mm.pluginsdk.p133ui.preference.FinderPreference;
import com.tencent.p014mm.pluginsdk.p133ui.preference.FinderRecentLikePreference;
import com.tencent.p014mm.pluginsdk.p133ui.preference.PhoneNumPreference;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C72979k3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import df2.C75381g;
import dg0.C75398e;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31543z5;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75597w2;
import eb0.C97625j3;
import ef2.C58565a;
import f40.C86709a0;
import fd0.C75743h;
import ge0.C32415b;
import h81.C32735h;
import hg0.C76166a;
import ht1.C60179k4;
import ht1.C60200t1;
import ht1.C60216z4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jr2.C76440q;
import jr2.C99014h;
import jr2.C99019x;
import k20.C9556a;
import ke3.C88144b;
import lc3.C10485b;
import md3.C47001b;
import ne0.C47224a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C117747y;
import p011cm.C39989b;
import p182kk.C61104a;
import p214om.C11502f;
import p629ny.C76979h;
import p788aj.C39608b;
import pj3.C47511g;
import pj3.C77101h;
import qo3.C77407n;
import te3.C51129rn0;
import te3.C51866wq2;
import te3.fp4;
import te3.hp4;
import wd3.C78543a;
import yb2.C79063g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal */
public class NewContactWidgetNormal implements C67028b, C76440q.C76441a {

    /* renamed from: A */
    public static boolean f202418A;

    /* renamed from: d */
    public MMActivity f202419d;

    /* renamed from: e */
    public C72996z1 f202420e;

    /* renamed from: f */
    public C47511g f202421f;

    /* renamed from: g */
    public int f202422g;

    /* renamed from: h */
    public boolean f202423h = false;

    /* renamed from: i */
    public boolean f202424i = false;

    /* renamed from: j */
    public boolean f202425j = false;

    /* renamed from: n */
    public boolean f202426n = false;

    /* renamed from: o */
    public boolean f202427o = false;

    /* renamed from: p */
    public C44661m1 f202428p;

    /* renamed from: q */
    public String f202429q;

    /* renamed from: r */
    public C75381g f202430r;

    /* renamed from: s */
    public boolean f202431s;

    /* renamed from: t */
    public final List<String> f202432t = new LinkedList();

    /* renamed from: u */
    public boolean f202433u = false;

    /* renamed from: v */
    public MultiButtonPreference f202434v;

    /* renamed from: w */
    public String f202435w = null;

    /* renamed from: x */
    public IListener<ChatroomMemberInviteerUpdatedEvent> f202436x = new IListener<ChatroomMemberInviteerUpdatedEvent>(C40008f.f107254d) {
        {
            this.__eventId = 896186802;
        }

        public boolean callback(IEvent iEvent) {
            ChatroomMemberInviteerUpdatedEvent chatroomMemberInviteerUpdatedEvent = (ChatroomMemberInviteerUpdatedEvent) iEvent;
            ChatroomMemberInviteerUpdatedEvent.C67667a aVar = chatroomMemberInviteerUpdatedEvent.f193513d;
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "[ChatroomMemberInviterUpdatedEvent callback] username:%s inviter:%s", aVar.f193514a, aVar.f193515b);
            if (!Util.isNullOrNil(chatroomMemberInviteerUpdatedEvent.f193513d.f193514a) && chatroomMemberInviteerUpdatedEvent.f193513d.f193514a.equals(NewContactWidgetNormal.this.f202420e.getUsername()) && !Util.isNullOrNil(chatroomMemberInviteerUpdatedEvent.f193513d.f193515b)) {
                MMHandlerThread.postToMainThread(new C70140e(this, chatroomMemberInviteerUpdatedEvent));
            }
            return false;
        }
    };

    /* renamed from: y */
    public boolean f202437y = false;

    /* renamed from: z */
    public long f202438z = 0;

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$b */
    public class C4933b implements C39989b.C0706c {

        /* renamed from: a */
        public final /* synthetic */ MMActivity f20104a;

        /* renamed from: b */
        public final /* synthetic */ C72996z1 f20105b;

        /* renamed from: c */
        public final /* synthetic */ int f20106c;

        /* renamed from: d */
        public final /* synthetic */ String f20107d;

        /* renamed from: e */
        public final /* synthetic */ String f20108e;

        /* renamed from: f */
        public final /* synthetic */ long f20109f;

        public C4933b(NewContactWidgetNormal newContactWidgetNormal, MMActivity mMActivity, C72996z1 z1Var, int i, String str, String str2, long j) {
            this.f20104a = mMActivity;
            this.f20105b = z1Var;
            this.f20106c = i;
            this.f20107d = str;
            this.f20108e = str2;
            this.f20109f = j;
        }

        /* renamed from: a */
        public boolean mo678a(String str, String str2, String str3, int i, String str4) {
            Class cls = C32735h.class;
            String stringExtra = this.f20104a.getIntent().getStringExtra("room_name");
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_set_default_chatonly, 2);
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000);
            Class cls2 = SayHiWithSnsPermissionUI.class;
            if (!C72996z1.m85843n5(this.f20105b.getUsername()) && Qe == 1) {
                cls2 = SayHiWithSnsPermissionUI2.class;
            } else if (!C72996z1.m85843n5(this.f20105b.getUsername()) && Qe == 2 && C45628s0.m50780j() >= Qe2) {
                cls2 = SayHiWithSnsPermissionUI3.class;
            }
            Intent intent = new Intent(this.f20104a, cls2);
            intent.putExtra("Contact_User", this.f20105b.getUsername());
            intent.putExtra("Contact_Nick", this.f20105b.getNickname());
            intent.putExtra("Contact_RemarkName", this.f20105b.mo73969n2());
            int i2 = this.f20106c;
            if (i2 == 14 || i2 == 8) {
                intent.putExtra("Contact_RoomNickname", this.f20104a.getIntent().getStringExtra("Contact_RoomNickname"));
            } else if (i2 == 17) {
                intent.putExtra("key_msg_id", this.f20104a.getIntent().getLongExtra("key_msg_id", 0));
            }
            intent.putExtra("Contact_Scene", this.f20106c);
            intent.putExtra("room_name", stringExtra);
            intent.putExtra("source_from_user_name", this.f20107d);
            intent.putExtra("source_from_nick_name", this.f20108e);
            intent.putExtra("sayhi_with_sns_perm_send_verify", true);
            intent.putExtra("sayhi_with_sns_perm_add_remark", true);
            intent.putExtra("sayhi_with_sns_perm_set_label", false);
            intent.putExtra("AntispamTicket", str3);
            intent.putExtra("sayhi_verify_add_errcode", i);
            intent.putExtra("key_msg_id", this.f20109f);
            MMActivity mMActivity = this.f20104a;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal$12", "onNeedSentVerify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$12", "onNeedSentVerify", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$o */
    public class C4934o implements C11182m0 {
        public C4934o(NewContactWidgetNormal newContactWidgetNormal) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107135b(2, C0966R.string.f7998ys, C0966R.raw.icons_filled_video_call);
            e0Var.mo107135b(1, C0966R.string.f8000yu, C0966R.raw.icons_filled_call);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$p */
    public class C4935p implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f20110d;

        /* renamed from: e */
        public final /* synthetic */ Context f20111e;

        public C4935p(C72996z1 z1Var, Context context) {
            this.f20110d = z1Var;
            this.f20111e = context;
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
                C72996z1 z1Var = this.f20110d;
                Context context = this.f20111e;
                newContactWidgetNormal.getClass();
                VoipEvent voipEvent = new VoipEvent();
                VoipEvent.C67818a aVar = voipEvent.f194019d;
                aVar.f194022b = 5;
                aVar.f194025e = z1Var.getUsername();
                VoipEvent.C67818a aVar2 = voipEvent.f194019d;
                aVar2.f194024d = context;
                aVar2.f194026f = 4;
                voipEvent.publish();
            } else if (itemId == 2) {
                NewContactWidgetNormal newContactWidgetNormal2 = NewContactWidgetNormal.this;
                C72996z1 z1Var2 = this.f20110d;
                Context context2 = this.f20111e;
                newContactWidgetNormal2.getClass();
                VoipEvent voipEvent2 = new VoipEvent();
                VoipEvent.C67818a aVar3 = voipEvent2.f194019d;
                aVar3.f194022b = 5;
                aVar3.f194025e = z1Var2.getUsername();
                VoipEvent.C67818a aVar4 = voipEvent2.f194019d;
                aVar4.f194024d = context2;
                aVar4.f194026f = 2;
                voipEvent2.publish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$a */
    public class C70124a implements C39989b.C0705b {

        /* renamed from: d */
        public final /* synthetic */ C72996z1 f202440d;

        /* renamed from: e */
        public final /* synthetic */ int f202441e;

        public C70124a(C72996z1 z1Var, int i) {
            this.f202440d = z1Var;
            this.f202441e = i;
        }

        /* renamed from: a */
        public void mo677a(boolean z, boolean z2, String str, String str2) {
            C76166a a;
            int i;
            if (z) {
                NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
                C72996z1 z1Var = this.f202440d;
                int i2 = this.f202441e;
                newContactWidgetNormal.getClass();
                if (Util.isNullOrNil(str)) {
                    Log.m105928w("MicroMsg.NewContactWidgetNormal", "addContact respUsername is empty");
                    C115669n.INSTANCE.mo175911u(931, 21);
                }
                if (((int) z1Var.f108320R1) == 0) {
                    if (!Util.isNullOrNil(str)) {
                        z1Var.setUsername(str);
                    }
                    C97625j3.m125812b().mo105907v().mo69707j3(z1Var);
                    C97625j3.m125812b().mo105907v().get(z1Var.getUsername());
                } else if (Util.isEqual(z1Var.getUsername(), z1Var.mo73978v2()) && !Util.isNullOrNil(str)) {
                    Log.m105925i("MicroMsg.NewContactWidgetNormal", "addContact respUsername:%s, username:%s, encryptUsername:%s", str, Util.nullAs(z1Var.getUsername(), ""), Util.nullAs(z1Var.mo73978v2(), ""));
                    z1Var.setUsername(str);
                }
                if (((int) z1Var.f108320R1) <= 0) {
                    Log.m105920e("MicroMsg.NewContactWidgetNormal", "addContact : insert contact failed");
                    return;
                }
                if (!z1Var.mo62927s3() && i2 == 15 && (a = C75398e.vx0().mo106401a(z1Var.getUsername())) != null && !Util.isNullOrNil(z1Var.f149525Y0)) {
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr = new Object[4];
                    objArr[0] = z1Var.getUsername();
                    objArr[1] = 3;
                    objArr[2] = Integer.valueOf(Util.isNullOrNil(a.mo106385e()) ^ true ? 1 : 0);
                    String[] c = C1233a.m1356c(z1Var);
                    if (c == null) {
                        i = 0;
                    } else {
                        i = 5;
                        if (c.length < 5) {
                            i = c.length;
                        }
                    }
                    objArr[3] = Integer.valueOf(i);
                    nVar.mo160131h(12040, objArr);
                }
                C45628s0.m50775g0(z1Var);
                newContactWidgetNormal.f202421f.notifyDataSetChanged();
                C68397a.m80737c(z1Var.mo73978v2(), 0);
                RecoverAccountFriendEvent recoverAccountFriendEvent = new RecoverAccountFriendEvent();
                recoverAccountFriendEvent.f193880d.f193881a = z1Var.mo73978v2();
                recoverAccountFriendEvent.f193880d.f193882b = 1;
                recoverAccountFriendEvent.publish();
            } else if (z2) {
                C75743h.vx0().mo101171bF(str, 2);
                C68397a.m80737c(this.f202440d.mo73978v2(), 1);
                RecoverAccountFriendEvent recoverAccountFriendEvent2 = new RecoverAccountFriendEvent();
                recoverAccountFriendEvent2.f193880d.f193881a = this.f202440d.mo73978v2();
                recoverAccountFriendEvent2.f193880d.f193882b = 1;
                recoverAccountFriendEvent2.publish();
            } else {
                Log.m105920e("MicroMsg.NewContactWidgetNormal", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$c */
    public class C70125c implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C72996z1 f202443a;

        /* renamed from: b */
        public final /* synthetic */ C78543a f202444b;

        /* renamed from: c */
        public final /* synthetic */ String f202445c;

        /* renamed from: d */
        public final /* synthetic */ LinkedList f202446d;

        public C70125c(NewContactWidgetNormal newContactWidgetNormal, C72996z1 z1Var, C78543a aVar, String str, LinkedList linkedList) {
            this.f202443a = z1Var;
            this.f202444b = aVar;
            this.f202445c = str;
            this.f202446d = linkedList;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(this.f202443a.getUsername());
            String str2 = "";
            if (z1Var != null) {
                str2 = Util.nullAs(z1Var.f149527Z0, str2);
            }
            this.f202444b.mo108509l(str2);
            this.f202444b.mo108500a(this.f202443a.getUsername(), this.f202445c, this.f202446d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$d */
    public class C70126d implements C75597w2.C31525a {
        public C70126d() {
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, NewContactWidgetNormal.this.f202429q, Boolean.valueOf(z));
            NewContactWidgetNormal.this.f202436x.dead();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$e */
    public class C70127e implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ C47511g f202448a;

        public C70127e(C47511g gVar) {
            this.f202448a = gVar;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "username:%s mRoomId:%s succ:%s", str, NewContactWidgetNormal.this.f202429q, Boolean.valueOf(z));
            if (z) {
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
                String j3 = z1Var.mo62909j3();
                NewContactWidgetNormal newContactWidgetNormal = NewContactWidgetNormal.this;
                newContactWidgetNormal.mo96543m(this.f202448a, newContactWidgetNormal.f202419d, newContactWidgetNormal.f202435w, j3, z1Var, newContactWidgetNormal.f202428p);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$f */
    public class C70128f implements C60216z4.C8821a<Object> {

        /* renamed from: a */
        public final /* synthetic */ boolean f202450a;

        /* renamed from: b */
        public final /* synthetic */ C47511g f202451b;

        public C70128f(boolean z, C47511g gVar) {
            this.f202450a = z;
            this.f202451b = gVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            if (this.f202450a) {
                NewContactWidgetNormal.this.mo96547q(this.f202451b, obj);
            }
            NewContactWidgetNormal.this.mo96548r(this.f202451b, obj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$g */
    public class C70129g implements C72893b.C72896c {
        public C70129g() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$h */
    public class C70130h implements C60216z4.C8821a<Integer> {

        /* renamed from: a */
        public final /* synthetic */ boolean f202454a;

        /* renamed from: b */
        public final /* synthetic */ C47511g f202455b;

        public C70130h(boolean z, C47511g gVar) {
            this.f202454a = z;
            this.f202455b = gVar;
        }

        /* renamed from: a */
        public void mo6382a(Object obj) {
            Integer num = (Integer) obj;
            if (this.f202454a) {
                NewContactWidgetNormal.this.mo96547q(this.f202455b, (Object) null);
            }
            NewContactWidgetNormal.this.mo96548r(this.f202455b, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$i */
    public class C70131i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Context f202457d;

        /* renamed from: e */
        public final /* synthetic */ long f202458e;

        public C70131i(Context context, long j) {
            this.f202457d = context;
            this.f202458e = j;
        }

        public void run() {
            Intent intent = new Intent();
            Context context = this.f202457d;
            if (context instanceof Activity) {
                intent = ((Activity) context).getIntent();
            }
            if (!intent.hasExtra("Contact_Conversation_IsFromNewFriendToProfile")) {
                Log.m105924i("MicroMsg.NewContactWidgetNormal", "doReportClick , is no from new friend add.");
                return;
            }
            NewFriendAssistActionStruct newFriendAssistActionStruct = new NewFriendAssistActionStruct();
            newFriendAssistActionStruct.f194298h = this.f202458e;
            long j = 1;
            newFriendAssistActionStruct.f194294d = intent.getBooleanExtra("Contact_Conversation_IsSelfSendAdd", false) ? 1 : 2;
            newFriendAssistActionStruct.f194296f = intent.getBooleanExtra("Contact_Conversation_Isexpired", false) ? 2 : 1;
            newFriendAssistActionStruct.f194297g = (long) intent.getIntExtra("Contact_Scene", 0);
            if (!intent.getBooleanExtra("Contact_Conversation_IsContact", false)) {
                j = 2;
            }
            newFriendAssistActionStruct.f194295e = j;
            newFriendAssistActionStruct.f194299i = newFriendAssistActionStruct.mo86045b("username", NewContactWidgetNormal.this.f202420e.getUsername(), true);
            newFriendAssistActionStruct.mo86054n();
            Log.m105924i("MicroMsg.NewContactWidgetNormal", "24723 type_ = " + newFriendAssistActionStruct.f194294d + ",status_ = " + newFriendAssistActionStruct.f194295e + ",is_expired_ = " + newFriendAssistActionStruct.f194296f + ",source_ = " + newFriendAssistActionStruct.f194297g + ",action = " + this.f202458e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$j */
    public class C70132j implements View.OnClickListener {
        public C70132j(NewContactWidgetNormal newContactWidgetNormal) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/NewContactWidgetNormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$k */
    public class C70133k implements View.OnClickListener {
        public C70133k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/NewContactWidgetNormal$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NewContactWidgetNormal.this.f202430r.mo105719c(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$l */
    public class C70134l implements View.OnClickListener {
        public C70134l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/NewContactWidgetNormal$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NewContactWidgetNormal.this.f202430r.mo105724h();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$m */
    public class C70135m implements View.OnClickListener {
        public C70135m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/NewContactWidgetNormal$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NewContactWidgetNormal.this.f202430r.mo105724h();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/NewContactWidgetNormal$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.NewContactWidgetNormal$n */
    public class C70136n implements TextPreference.C73243a {

        /* renamed from: a */
        public final /* synthetic */ TextPreference f202463a;

        /* renamed from: b */
        public final /* synthetic */ String f202464b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList f202465c;

        public C70136n(TextPreference textPreference, String str, ArrayList arrayList) {
            this.f202463a = textPreference;
            this.f202464b = str;
            this.f202465c = arrayList;
        }
    }

    public NewContactWidgetNormal(MMActivity mMActivity) {
        this.f202419d = mMActivity;
    }

    /* renamed from: A */
    public final void mo96526A(String str, C72996z1 z1Var) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.NewContactWidgetNormal", "view stranger remark, username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_Scene", this.f202422g);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", z1Var.getUsername());
        intent.putExtra("Contact_Nick", z1Var.getNickname());
        intent.putExtra("Contact_RemarkName", z1Var.mo73969n2());
        intent.putExtra("Contact_RoomNickname", this.f202419d.getIntent().getStringExtra("Contact_RoomNickname"));
        int intExtra = this.f202419d.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra != 0) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        }
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93186s(intent, this.f202419d);
    }

    /* renamed from: B0 */
    public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
        C77101h hVar2 = (C77101h) this.f202421f.mo72519a("contact_profile_sns");
        if (hVar2 != null && C99019x.m128971c() != null) {
            hVar2.mo107419b(this.f202420e.getUsername());
            SnsReportHelper.f275506m0.mo131341B().f266215g = (long) hVar2.mo107418a();
            if (C99019x.m128970b() != null) {
                ((C5431p1.C5432a) C99019x.m128970b()).mo6412c(this, 3);
            }
            this.f202421f.notifyDataSetChanged();
            if (hVar.mo131162C0()) {
                Log.m105918d("MicroMsg.NewContactWidgetNormal", "bg Change!");
                if (C99019x.m128970b() != null) {
                    C76440q b = C99019x.m128970b();
                    String username = this.f202420e.getUsername();
                    ((C5431p1.C5432a) b).getClass();
                    SnsMethodCalculate.markStartTimeMs("deleteBg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                    String YO = C94866e1.m120262YO();
                    String str2 = username + "bg_";
                    String str3 = username + "tbg_";
                    if (C86013q1.m106450k(str2)) {
                        C86013q1.m106447h(C94938q1.m120518e(YO, username) + str3);
                        C86013q1.m106435Q(C94938q1.m120518e(YO, username), str2, str3);
                    }
                    SnsMethodCalculate.markEndTimeMs("deleteBg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                }
            }
        }
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0145 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo96530a(com.tencent.p014mm.p136ui.MMActivity r23, com.tencent.p014mm.storage.C72996z1 r24, int r25, boolean r26) {
        /*
            r22 = this;
            r9 = r22
            r10 = r23
            r0 = r24
            r6 = r25
            java.lang.String r11 = ""
            r7 = 17
            r1 = 0
            r2 = 2131840199(0x7f114cc7, float:1.9313671E38)
            if (r6 != r7) goto L_0x0029
            boolean r3 = r9.f202431s
            if (r3 == 0) goto L_0x0029
            com.tencent.mm.ui.MMActivity r0 = r9.f202419d
            r3 = 2131834155(0x7f11352b, float:1.9301412E38)
            java.lang.String r3 = r0.getString(r3)
            com.tencent.mm.ui.MMActivity r4 = r9.f202419d
            java.lang.String r2 = r4.getString(r2)
            nj3.C76879j.m92754y(r0, r3, r11, r2, r1)
            return
        L_0x0029:
            long r3 = r0.f108320R1
            int r4 = (int) r3
            r8 = -1
            if (r4 != 0) goto L_0x004d
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()
            int r3 = r3.mo69707j3(r0)
            if (r3 == r8) goto L_0x004d
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()
            java.lang.String r0 = r24.getUsername()
            com.tencent.mm.storage.z1 r0 = r3.get(r0)
        L_0x004d:
            r12 = r0
            boolean r0 = r12.mo62920o3()
            if (r0 == 0) goto L_0x0067
            com.tencent.mm.ui.MMActivity r0 = r9.f202419d
            r3 = 2131820721(0x7f1100b1, float:1.9274165E38)
            java.lang.String r3 = r0.getString(r3)
            com.tencent.mm.ui.MMActivity r4 = r9.f202419d
            java.lang.String r2 = r4.getString(r2)
            nj3.C76879j.m92754y(r0, r3, r11, r2, r1)
            return
        L_0x0067:
            java.lang.String r13 = "MicroMsg.NewContactWidgetNormal"
            r14 = 3
            java.lang.String r15 = "KSpamInfo"
            r4 = 1
            if (r26 != 0) goto L_0x013f
            com.tencent.mm.ui.MMActivity r0 = r9.f202419d
            android.content.Intent r0 = r0.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r15)
            com.tencent.mm.feature.openim.impl.SpamInfo r0 = (com.tencent.p014mm.feature.openim.impl.SpamInfo) r0
            if (r0 != 0) goto L_0x007f
            r0 = r1
            goto L_0x0081
        L_0x007f:
            java.lang.String r0 = r0.f195285e
        L_0x0081:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r4
            if (r0 == 0) goto L_0x013f
            pj3.g r0 = r9.f202421f
            java.lang.String r2 = "contact_profile_header_normal"
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r2)
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference) r0
            if (r0 == 0) goto L_0x013f
            android.view.View r2 = r0.f202576Q
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r2.getTag()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r2 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70150c) r2
            goto L_0x00a0
        L_0x009f:
            r2 = r1
        L_0x00a0:
            if (r2 == 0) goto L_0x00ab
            com.tencent.mm.ui.widget.MMNeat7extView r2 = r2.f202606j
            if (r2 == 0) goto L_0x00ab
            java.lang.CharSequence r2 = r2.mo154968a()
            goto L_0x00ac
        L_0x00ab:
            r2 = r11
        L_0x00ac:
            android.view.View r0 = r0.f202576Q
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r0 = r0.getTag()
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference$c r0 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.C70150c) r0
            goto L_0x00b8
        L_0x00b7:
            r0 = r1
        L_0x00b8:
            if (r0 == 0) goto L_0x00c3
            android.widget.TextView r0 = r0.f202605i
            if (r0 == 0) goto L_0x00c3
            java.lang.CharSequence r0 = r0.getText()
            goto L_0x00c4
        L_0x00c3:
            r0 = r11
        L_0x00c4:
            java.lang.String r1 = r12.getUsername()
            com.tencent.mm.ui.MMActivity r3 = r9.f202419d
            android.content.Intent r3 = r3.getIntent()
            android.os.Parcelable r3 = r3.getParcelableExtra(r15)
            com.tencent.mm.feature.openim.impl.SpamInfo r3 = (com.tencent.p014mm.feature.openim.impl.SpamInfo) r3
            if (r3 != 0) goto L_0x00d8
            r3 = 0
            goto L_0x00da
        L_0x00d8:
            java.lang.String r3 = r3.f195285e
        L_0x00da:
            boolean r16 = android.text.TextUtils.isEmpty(r2)
            if (r16 != 0) goto L_0x0130
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto L_0x0130
            java.lang.Class<sv.p> r16 = p239sv.C77792p.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            r4 = r16
            sv.p r4 = (p239sv.C77792p) r4
            sv.o r4 = r4.mo107731L6(r10)
            r8 = r4
            te0.a r8 = (te0.C77894a) r8
            r8.getClass()
            te0.a$a r5 = new te0.a$a
            r5.<init>(r2, r0, r1, r3)
            r8.f226948h = r5
            com.tencent.mm.plugin.profile.b r5 = new com.tencent.mm.plugin.profile.b
            r0 = r5
            r1 = r22
            r2 = r4
            r4 = 0
            r3 = r23
            r4 = r12
            r7 = r5
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f226949i = r7
            r8.show()
            com.tencent.mm.ui.MMActivity r0 = r9.f202419d
            android.content.Intent r0 = r0.getIntent()
            android.os.Parcelable r0 = r0.getParcelableExtra(r15)
            com.tencent.mm.feature.openim.impl.SpamInfo r0 = (com.tencent.p014mm.feature.openim.impl.SpamInfo) r0
            if (r0 != 0) goto L_0x0126
            r3 = 0
            goto L_0x0128
        L_0x0126:
            int r3 = r0.f195284d
        L_0x0128:
            p921uv.C78282a.m94571a(r14, r14, r3)
            r4 = 1
            r5 = 1
            r7 = 2
            r8 = 0
            goto L_0x0143
        L_0x0130:
            r7 = 2
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r8 = 0
            r1[r8] = r2
            r5 = 1
            r1[r5] = r0
            java.lang.String r0 = "confirm create fail nameTxt:%s, companyTxt:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r1)
            goto L_0x0142
        L_0x013f:
            r5 = 1
            r7 = 2
            r8 = 0
        L_0x0142:
            r4 = 0
        L_0x0143:
            if (r4 == 0) goto L_0x0146
            return
        L_0x0146:
            com.tencent.mm.ui.MMActivity r0 = r9.f202419d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "Contact_Mobile_MD5"
            java.lang.String r0 = r0.getStringExtra(r1)
            com.tencent.mm.ui.MMActivity r1 = r9.f202419d
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r2 = "Contact_full_Mobile_MD5"
            java.lang.String r1 = r1.getStringExtra(r2)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x0172
            boolean r2 = r1.equals(r11)
            if (r2 != 0) goto L_0x018f
        L_0x0172:
            hg0.b r2 = dg0.C75398e.vx0()
            hg0.a r2 = r2.mo106402b(r0)
            if (r2 != 0) goto L_0x0185
            hg0.b r0 = dg0.C75398e.vx0()
            hg0.a r2 = r0.mo106402b(r1)
            r0 = r1
        L_0x0185:
            if (r2 != 0) goto L_0x0188
            goto L_0x018f
        L_0x0188:
            hg0.b r1 = dg0.C75398e.vx0()
            r1.mo106403d(r0, r2)
        L_0x018f:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r4.add(r0)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r1 = "source_from_user_name"
            java.lang.String r3 = r0.getStringExtra(r1)
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r2 = "source_from_nick_name"
            java.lang.String r0 = r0.getStringExtra(r2)
            android.content.Intent r5 = r23.getIntent()
            java.lang.String r7 = "key_msg_id"
            r17 = r15
            r14 = 0
            r18 = r11
            long r10 = r5.getLongExtra(r7, r14)
            android.content.Intent r5 = r23.getIntent()
            java.lang.String r8 = "room_name"
            java.lang.String r5 = r5.getStringExtra(r8)
            boolean r14 = r9.f202424i
            java.lang.String r15 = "AntispamTicket"
            if (r14 == 0) goto L_0x02ca
            wd3.a r14 = new wd3.a
            com.tencent.mm.ui.MMActivity r1 = r9.f202419d
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$a r2 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$a
            r2.<init>(r12, r6)
            r14.<init>(r1, r2)
            r14.f230048t = r3
            r14.f230049u = r0
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$b r7 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$b
            r8 = r0
            r0 = r7
            r1 = r22
            r2 = r23
            r20 = r3
            r3 = r12
            r21 = r13
            r13 = r4
            r4 = r25
            r6 = r5
            r5 = r20
            r25 = r6
            r6 = r8
            r16 = r13
            r13 = r7
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.f230036e = r13
            com.tencent.mm.ui.MMActivity r0 = r9.f202419d
            android.content.Intent r0 = r0.getIntent()
            r1 = r17
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.tencent.mm.feature.openim.impl.SpamInfo r0 = (com.tencent.p014mm.feature.openim.impl.SpamInfo) r0
            r14.f230042n = r0
            android.content.Intent r0 = r23.getIntent()
            java.lang.String r0 = r0.getStringExtra(r15)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x022f
            r14.mo108509l(r0)
            java.lang.String r0 = r12.getUsername()
            r5 = r16
            r1 = r18
            r14.mo108500a(r0, r1, r5)
            goto L_0x02bf
        L_0x022f:
            r5 = r16
            r1 = r18
            boolean r0 = android.text.TextUtils.isEmpty(r25)
            if (r0 == 0) goto L_0x0248
            java.lang.String r0 = r12.f149527Z0
            r14.mo108509l(r0)
            java.lang.String r0 = r12.getUsername()
            r13 = 0
            r14.mo108501b(r0, r5, r13, r1)
            goto L_0x02bf
        L_0x0248:
            r13 = 0
            java.lang.String r0 = r14.f230045q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x025b
            java.lang.String r0 = r12.getUsername()
            r6 = r25
            r14.mo108500a(r0, r6, r5)
            goto L_0x02bf
        L_0x025b:
            r6 = r25
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            java.lang.String r2 = r12.getUsername()
            com.tencent.mm.storage.z1 r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = r0.f149527Z0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
            goto L_0x0277
        L_0x0276:
            r0 = r1
        L_0x0277:
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = r12.getUsername()
            r2[r13] = r1
            r3 = 1
            r2[r3] = r6
            r4 = 2
            r2[r4] = r0
            java.lang.String r1 = "dkverify footer add:%s chat:%s ticket:%s"
            r3 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r1, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x029e
            r14.mo108509l(r0)
            java.lang.String r0 = r12.getUsername()
            r14.mo108500a(r0, r6, r5)
            goto L_0x02bf
        L_0x029e:
            java.util.List<java.lang.String> r0 = r9.f202432t
            java.lang.String r1 = r12.getUsername()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.add(r1)
            eb0.w2 r7 = eb0.C31519v2.m39436a()
            java.lang.String r8 = r12.getUsername()
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$c r13 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$c
            r0 = r13
            r1 = r22
            r2 = r12
            r3 = r14
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r7.mo55988e(r8, r6, r13)
        L_0x02bf:
            boolean r0 = p62.C35382d.m40669B(r10)
            if (r0 == 0) goto L_0x02c9
            r0 = 3
            p62.C35382d.m40670O(r10, r0)
        L_0x02c9:
            return
        L_0x02ca:
            r5 = r0
            r20 = r3
            r0 = 3
            r3 = 1
            r4 = 2
            r13 = 0
            android.content.Intent r14 = r23.getIntent()
            java.lang.String r14 = r14.getStringExtra(r15)
            boolean r17 = p62.C35382d.m40669B(r10)
            if (r17 == 0) goto L_0x02e2
            p62.C35382d.m40670O(r10, r0)
        L_0x02e2:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            android.content.Intent r13 = r23.getIntent()
            java.lang.String r13 = r13.getStringExtra(r8)
            di3.d r17 = di3.C86312j.m106911c(r0)
            r3 = r17
            h81.h r3 = (h81.C32735h) r3
            r18 = r10
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_set_default_chatonly
            int r3 = r3.mo58779Qe(r10, r4)
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold
            r11 = 5000(0x1388, float:7.006E-42)
            int r0 = r0.mo58779Qe(r10, r11)
            java.lang.Class<com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI> r10 = com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI.class
            java.lang.String r11 = r12.getUsername()
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85843n5(r11)
            if (r11 != 0) goto L_0x031c
            r11 = 1
            if (r3 != r11) goto L_0x031c
            java.lang.Class<com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI2> r10 = com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI2.class
            goto L_0x0330
        L_0x031c:
            java.lang.String r11 = r12.getUsername()
            boolean r11 = com.tencent.p014mm.storage.C72996z1.m85843n5(r11)
            if (r11 != 0) goto L_0x0330
            if (r3 != r4) goto L_0x0330
            int r3 = eb0.C45628s0.m50780j()
            if (r3 < r0) goto L_0x0330
            java.lang.Class<com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3> r10 = com.tencent.p014mm.plugin.profile.p088ui.SayHiWithSnsPermissionUI3.class
        L_0x0330:
            android.content.Intent r0 = new android.content.Intent
            r11 = r23
            r3 = r18
            r0.<init>(r11, r10)
            java.lang.String r10 = r12.getUsername()
            java.lang.String r9 = "Contact_User"
            r0.putExtra(r9, r10)
            java.lang.String r9 = r12.getNickname()
            java.lang.String r10 = "Contact_Nick"
            r0.putExtra(r10, r9)
            java.lang.String r9 = r12.mo73969n2()
            java.lang.String r10 = "Contact_RemarkName"
            r0.putExtra(r10, r9)
            r9 = 14
            if (r6 == r9) goto L_0x036f
            r9 = 8
            if (r6 != r9) goto L_0x035d
            goto L_0x036f
        L_0x035d:
            r9 = 17
            if (r6 != r9) goto L_0x037c
            android.content.Intent r9 = r23.getIntent()
            r10 = 0
            long r9 = r9.getLongExtra(r7, r10)
            r0.putExtra(r7, r9)
            goto L_0x037c
        L_0x036f:
            android.content.Intent r9 = r23.getIntent()
            java.lang.String r10 = "Contact_RoomNickname"
            java.lang.String r9 = r9.getStringExtra(r10)
            r0.putExtra(r10, r9)
        L_0x037c:
            java.lang.String r9 = "Contact_Scene"
            r0.putExtra(r9, r6)
            android.content.Intent r6 = r23.getIntent()
            java.lang.String r9 = "Contact_Source_Add"
            r10 = -1
            int r6 = r6.getIntExtra(r9, r10)
            r0.putExtra(r9, r6)
            r0.putExtra(r8, r13)
            r6 = r20
            r0.putExtra(r1, r6)
            r0.putExtra(r2, r5)
            java.lang.String r1 = "sayhi_with_sns_perm_send_verify"
            r2 = 1
            r0.putExtra(r1, r2)
            java.lang.String r1 = "sayhi_with_sns_perm_add_remark"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "sayhi_with_sns_perm_set_label"
            r2 = 0
            r0.putExtra(r1, r2)
            r0.putExtra(r15, r14)
            java.lang.String r1 = "sayhi_verify_add_errcode"
            r2 = -1
            r0.putExtra(r1, r2)
            r0.putExtra(r7, r3)
            k20.a r8 = new k20.a
            r8.<init>()
            r8.mo10233c(r0)
            java.lang.Object[] r1 = r8.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/profile/NewContactWidgetNormal"
            java.lang.String r3 = "gotoSayHiPage"
            java.lang.String r4 = "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;I)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r23
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r8.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r1 = r23
            r1.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/profile/NewContactWidgetNormal"
            java.lang.String r3 = "gotoSayHiPage"
            java.lang.String r4 = "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;I)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r23
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r0 = 3
            r2 = r22
            com.tencent.mm.ui.MMActivity r3 = r2.f202419d
            r2.mo96531b(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.NewContactWidgetNormal.mo96530a(com.tencent.mm.ui.MMActivity, com.tencent.mm.storage.z1, int, boolean):void");
    }

    /* renamed from: b */
    public void mo96531b(long j, Context context) {
        ((C119157j) C119157j.f356862d).mo183875f(new C70131i(context, j));
    }

    /* renamed from: c */
    public final String mo96532c(C44661m1 m1Var, String str) {
        String str2 = null;
        if (m1Var == null) {
            return null;
        }
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
        if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
            str2 = z1Var.mo73969n2();
        }
        if (Util.isNullOrNil(str2)) {
            str2 = m1Var.mo69789q2(str);
        }
        return (!Util.isNullOrNil(str2) || z1Var == null) ? str2 : z1Var.mo62909j3();
    }

    /* renamed from: d */
    public final void mo96533d(C47511g gVar, C72996z1 z1Var) {
        gVar.mo72529n("contact_info_invite_source", true);
        C44661m1 m1Var = this.f202428p;
        boolean z = false;
        boolean booleanExtra = m1Var == null ? this.f202419d.getIntent().getBooleanExtra("Is_RoomOwner", false) : m1Var.mo69797y2();
        if (this.f202422g != 14 || !booleanExtra || this.f202428p == null || z1Var.getUsername().equals(this.f202428p.field_roomowner)) {
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(this.f202422g);
            objArr[1] = Boolean.valueOf(booleanExtra);
            if (this.f202428p == null) {
                z = true;
            }
            objArr[2] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", objArr);
            gVar.mo72529n("contact_info_invite_source", true);
            return;
        }
        String stringExtra = this.f202419d.getIntent().getStringExtra("inviteer");
        this.f202435w = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            C39608b n2 = this.f202428p.mo69786n2(z1Var.getUsername());
            this.f202435w = n2 == null ? "" : Util.nullAs(n2.f106346g, "");
        }
        if (Util.isNullOrNil(this.f202435w)) {
            String username = z1Var.getUsername();
            String str = this.f202429q;
            C51866wq2 wq22 = C45612m0.f123381a;
            String str2 = str + "#" + username;
            this.f202435w = C45612m0.f123382b.checkAndUpTime(str2) ? C45612m0.f123382b.get(str2) : "";
        }
        if (Util.isNullOrNil(this.f202435w)) {
            Log.m105929w("MicroMsg.NewContactWidgetNormal", "mRoomId:%s member:%s , inviter is null!", this.f202429q, z1Var.getUsername());
            this.f202436x.alive();
            ((LinkedList) this.f202432t).add(z1Var.getUsername());
            C31519v2.m39436a().mo55988e(z1Var.getUsername(), this.f202429q, new C70126d());
            return;
        }
        this.f202419d.getIntent().putExtra("inviteer", this.f202435w);
        String c = mo96532c(this.f202428p, this.f202435w);
        if (Util.isNullOrNil(c)) {
            ((LinkedList) this.f202432t).add(z1Var.getUsername());
            C31519v2.m39436a().mo55988e(z1Var.getUsername(), "", new C70127e(gVar));
            return;
        }
        mo96543m(gVar, this.f202419d, this.f202435w, c, z1Var, this.f202428p);
    }

    /* renamed from: e */
    public final boolean mo96534e() {
        return ((C60179k4) C86312j.m106911c(C60179k4.class)).p70(this.f202420e.getUsername());
    }

    /* renamed from: f */
    public final boolean mo96535f() {
        return this.f202419d.getIntent().getIntExtra("Contact_Scene", 0) == 18;
    }

    /* renamed from: g */
    public final boolean mo96536g() {
        return !this.f202420e.mo62927s3() && this.f202419d.getIntent().getBooleanExtra("User_Verify", false);
    }

    /* renamed from: h */
    public final boolean mo96537h() {
        for (String equalsIgnoreCase : C45628s0.f123409o) {
            if (equalsIgnoreCase.equalsIgnoreCase(this.f202420e.getUsername())) {
                return true;
            }
        }
        return C72996z1.m85816S4(this.f202420e.getUsername());
    }

    /* renamed from: i */
    public final boolean mo96538i() {
        C72996z1 z1Var = this.f202420e;
        return z1Var != null && C72996z1.m85846q5(z1Var.getUsername());
    }

    /* renamed from: j */
    public final boolean mo96539j() {
        return C75592q0.m90789s().equals(this.f202420e.getUsername());
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
    }

    /* renamed from: k */
    public final boolean mo96541k() {
        int intExtra = this.f202419d.getIntent().getIntExtra("Contact_Scene", 0);
        return 26 <= intExtra && intExtra <= 29;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0178, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r3 = java.lang.Integer.valueOf(r5[r8]).intValue();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96542l(pj3.C47511g r20, com.tencent.p014mm.storage.C72996z1 r21, boolean r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = r21
            boolean r3 = r19.mo96536g()
            java.lang.String r4 = "contact_profile_accept_contact"
            java.lang.String r5 = "contact_profile_accept_contact_by_wework"
            r6 = 1
            if (r3 == 0) goto L_0x023b
            java.lang.String r3 = "contact_profile_setting_desc"
            r2.mo72529n(r3, r6)
            java.lang.String r3 = "contact_profile_setting_permission"
            r2.mo72529n(r3, r6)
            java.lang.String r3 = "contact_profile_phone"
            r2.mo72529n(r3, r6)
            java.lang.String r3 = "contact_profile_info_more"
            r2.mo72529n(r3, r6)
            java.lang.String r3 = r21.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            java.lang.String r7 = "contact_profile_sns"
            r2.mo72529n(r7, r3)
            long r7 = eb0.C75592q0.m90781k()
            r9 = 268435456(0x10000000, double:1.32624737E-315)
            long r7 = r7 & r9
            r9 = 0
            r3 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            com.tencent.mm.ui.MMActivity r8 = r1.f202419d
            java.lang.String r9 = "com.tencent.wework"
            boolean r8 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r8, r9)
            eb0.c r10 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r10 = r10.mo105906u()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADD_CONTACT_BY_WEWORK_SWITCH_INT
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            java.lang.Object r10 = r10.mo119685f(r11, r12)
            java.lang.Integer r10 = (java.lang.Integer) r10
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]
            long r13 = eb0.C75592q0.m90781k()
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r12[r3] = r13
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r7)
            r12[r6] = r13
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r13 = 2
            r12[r13] = r8
            java.lang.String r8 = "MicroMsg.NewContactWidgetNormal"
            java.lang.String r14 = "ExtStatus:%s openAddByWework:%s isInstallWework:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r14, r12)
            int r8 = r10.intValue()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r8, (int) r6)
            if (r8 != 0) goto L_0x00cb
            if (r7 == 0) goto L_0x0096
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            boolean r7 = com.tencent.p014mm.pluginsdk.model.app.C72688j0.m85020f(r7, r9)
            if (r7 == 0) goto L_0x0096
            goto L_0x00cb
        L_0x0096:
            com.tencent.mm.ui.MMActivity r0 = r1.f202419d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r7 = "isVerifyExpired"
            boolean r0 = r0.getBooleanExtra(r7, r3)
            if (r0 == 0) goto L_0x00c6
            com.tencent.mm.ui.base.preference.Preference r0 = r2.mo72519a(r4)
            com.tencent.mm.ui.base.preference.ButtonPreference r0 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r0
            com.tencent.mm.ui.MMActivity r4 = r1.f202419d
            r7 = 2131820813(0x7f11010d, float:1.9274352E38)
            java.lang.String r4 = r4.getString(r7)
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131100419(0x7f060303, float:1.7813219E38)
            int r7 = r7.getColor(r8)
            r0.mo101917K(r4, r7)
            r0.mo69932y(r3)
        L_0x00c6:
            r2.mo72529n(r5, r6)
            goto L_0x0241
        L_0x00cb:
            r2.mo72529n(r5, r3)
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            int r8 = r1.f202422g
            ae3.b[] r7 = com.tencent.p014mm.plugin.profile.p088ui.C70293u1.m82853a(r7, r0, r8)
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x00e7
            int r7 = r7.length
            if (r7 < r6) goto L_0x00e7
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            int r9 = r1.f202422g
            java.lang.String r0 = com.tencent.p014mm.plugin.profile.p088ui.C70293u1.m82854b(r7, r0, r9)
            r7 = r0
            goto L_0x00e8
        L_0x00e7:
            r7 = r8
        L_0x00e8:
            com.tencent.mm.storage.z1 r0 = r1.f202420e
            java.lang.String r9 = r0.getUsername()
            java.lang.String r10 = "getStateAddContactUsernameByWework() Exception:%s"
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r12 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r12, r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r12 = new java.lang.Object[r6]
            r12[r3] = r9
            java.lang.String r14 = "MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg"
            java.lang.String r15 = "getStateAddContactUsernameByWework() username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            java.lang.String r15 = "states"
            java.lang.String r11 = ","
            if (r12 == 0) goto L_0x011b
            goto L_0x0190
        L_0x011b:
            c30.g r12 = new c30.g     // Catch:{ Exception -> 0x0182 }
            r12.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = "usernames"
            java.lang.String r0 = r12.optString(r0)     // Catch:{ Exception -> 0x0182 }
            java.lang.String r12 = r12.optString(r15)     // Catch:{ Exception -> 0x0182 }
            java.lang.String[] r13 = r0.split(r11)     // Catch:{ Exception -> 0x0182 }
            java.lang.String[] r12 = r12.split(r11)     // Catch:{ Exception -> 0x0182 }
            if (r13 == 0) goto L_0x018f
            if (r12 != 0) goto L_0x0138
            goto L_0x018f
        L_0x0138:
            int r0 = r13.length     // Catch:{ Exception -> 0x0182 }
            if (r3 >= r0) goto L_0x018f
            r0 = r13[r3]     // Catch:{ Exception -> 0x0182 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r0)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x017a
            r0 = r12[r3]     // Catch:{ NumberFormatException -> 0x0151 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0151 }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x0151 }
            r21 = r9
        L_0x014f:
            r9 = 2
            goto L_0x0163
        L_0x0151:
            r0 = move-exception
            r21 = r9
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0182 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0182 }
            r17 = 0
            r9[r17] = r0     // Catch:{ Exception -> 0x0182 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r10, r9)     // Catch:{ Exception -> 0x0182 }
            r0 = 0
            goto L_0x014f
        L_0x0163:
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r9)     // Catch:{ Exception -> 0x0182 }
            if (r18 != 0) goto L_0x0178
            r9 = 3
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r9)     // Catch:{ Exception -> 0x0182 }
            if (r16 == 0) goto L_0x0171
            goto L_0x0178
        L_0x0171:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r0, (int) r6)     // Catch:{ Exception -> 0x0182 }
            if (r0 == 0) goto L_0x017d
            goto L_0x018f
        L_0x0178:
            r3 = 1
            goto L_0x0190
        L_0x017a:
            r21 = r9
            r9 = 3
        L_0x017d:
            int r3 = r3 + 1
            r9 = r21
            goto L_0x0138
        L_0x0182:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r9 = 0
            r3[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r10, r3)
        L_0x018f:
            r3 = 0
        L_0x0190:
            if (r3 == 0) goto L_0x01b1
            com.tencent.mm.ui.base.preference.Preference r0 = r2.mo72519a(r5)
            com.tencent.mm.ui.base.preference.ButtonPreference r0 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r0
            com.tencent.mm.ui.MMActivity r3 = r1.f202419d
            r5 = 2131824163(0x7f110e23, float:1.9281146E38)
            java.lang.String r3 = r3.getString(r5)
            com.tencent.mm.ui.MMActivity r5 = r1.f202419d
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131100190(0x7f06021e, float:1.7812754E38)
            int r5 = r5.getColor(r9)
            r0.mo101917K(r3, r5)
        L_0x01b1:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x0241
            java.lang.String r3 = "getStateAddContactByWework() Exception:%s"
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_ADD_CONTACT_BY_WEWORK_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r5, r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r8 = 0
            r5[r8] = r7
            java.lang.String r8 = "getStateAddContactByWework() climsgid:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r8, r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x01de
        L_0x01dc:
            r3 = 1
            goto L_0x0232
        L_0x01de:
            c30.g r5 = new c30.g     // Catch:{ Exception -> 0x0224 }
            r5.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = "svrids"
            java.lang.String r0 = r5.optString(r0)     // Catch:{ Exception -> 0x0224 }
            java.lang.String r5 = r5.optString(r15)     // Catch:{ Exception -> 0x0224 }
            java.lang.String[] r0 = r0.split(r11)     // Catch:{ Exception -> 0x0224 }
            java.lang.String[] r5 = r5.split(r11)     // Catch:{ Exception -> 0x0224 }
            if (r0 == 0) goto L_0x01dc
            if (r5 != 0) goto L_0x01fb
            goto L_0x01dc
        L_0x01fb:
            r8 = 0
        L_0x01fc:
            int r9 = r0.length     // Catch:{ Exception -> 0x0224 }
            if (r8 >= r9) goto L_0x01dc
            r9 = r0[r8]     // Catch:{ Exception -> 0x0224 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r7, (java.lang.String) r9)     // Catch:{ Exception -> 0x0224 }
            if (r9 == 0) goto L_0x0221
            r0 = r5[r8]     // Catch:{ NumberFormatException -> 0x0212 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0212 }
            int r3 = r0.intValue()     // Catch:{ NumberFormatException -> 0x0212 }
            goto L_0x0232
        L_0x0212:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0224 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x0224 }
            r7 = 0
            r5[r7] = r0     // Catch:{ Exception -> 0x0224 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r5)     // Catch:{ Exception -> 0x0224 }
            r3 = 0
            goto L_0x0232
        L_0x0221:
            int r8 = r8 + 1
            goto L_0x01fc
        L_0x0224:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            r7 = 0
            r5[r7] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r3, r5)
            goto L_0x01dc
        L_0x0232:
            r5 = 2
            if (r3 != r5) goto L_0x0241
            if (r22 == 0) goto L_0x0241
            r2.mo72529n(r4, r6)
            goto L_0x0241
        L_0x023b:
            r2.mo72529n(r4, r6)
            r2.mo72529n(r5, r6)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.NewContactWidgetNormal.mo96542l(pj3.g, com.tencent.mm.storage.z1, boolean):void");
    }

    /* renamed from: m */
    public final void mo96543m(C47511g gVar, Activity activity, String str, String str2, C72996z1 z1Var, C44661m1 m1Var) {
        Log.m105925i("MicroMsg.NewContactWidgetNormal", "[showInviterView] inviter:%s inviterDisplayName:%s", str, str2);
        KeyValuePreference keyValuePreference = (KeyValuePreference) gVar.mo72519a("contact_info_invite_source");
        gVar.mo72529n("contact_info_invite_source", false);
        SpannableString spannableString = new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(activity, activity.getResources().getString(C0966R.string.bn6, new Object[]{str2})));
        spannableString.setSpan(new ForegroundColorSpan(activity.getResources().getColor(C0966R.color.f3154h3)), 0, str2.length(), 33);
        keyValuePreference.f121254p0 = 2;
        TextView textView = keyValuePreference.f121238J;
        if (textView != null) {
            textView.setMaxLines(2);
        }
        keyValuePreference.f121240L = false;
        keyValuePreference.mo7741E(spannableString);
        keyValuePreference.mo69925c().putString("inviter", str);
        activity.getIntent().putExtra("inviteer", str);
    }

    /* renamed from: n */
    public final void mo96544n(C72996z1 z1Var, Context context) {
        C77407n nVar = new C77407n((Context) this.f202419d, 1, false);
        nVar.f225771i = new C4934o(this);
        nVar.f225792t1 = true;
        nVar.f225781o1 = true;
        nVar.f225782p = new C4935p(z1Var, context);
        nVar.mo107573q();
    }

    /* renamed from: o */
    public final void mo96545o() {
        if (!this.f202421f.mo72522f("contact_profile_add_contact")) {
            Log.m105924i("MicroMsg.NewContactWidgetNormal", "updateAddContactPrefenceState, prefence no show. ");
            return;
        }
        ButtonPreference buttonPreference = (ButtonPreference) this.f202421f.mo72519a("contact_profile_add_contact");
        C72979k3 Yt = C75743h.vx0().mo101169Yt(this.f202420e.getUsername());
        boolean z = true;
        this.f202426n = Yt != null && Yt.field_state == 2 && C31543z5.m39453c() - Yt.field_lastModifiedTime < ((long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("VerifyUserTicketTimeExceed", 259200)) * 1000;
        boolean booleanExtra = this.f202419d.getIntent().getBooleanExtra("Contact_ToProfilePageFromSource", false);
        if (!this.f202426n || !booleanExtra) {
            z = false;
        }
        this.f202426n = z;
        if (buttonPreference == null) {
            return;
        }
        if (z) {
            buttonPreference.mo69924H(this.f202419d.getResources().getString(C0966R.string.f7465uz));
            buttonPreference.mo101917K(this.f202419d.getResources().getString(C0966R.string.f7465uz), this.f202419d.getResources().getColor(C0966R.color.FG_2));
            buttonPreference.mo101916J(C0966R.C0969drawable.b3p);
            return;
        }
        buttonPreference.mo101917K(this.f202419d.getResources().getString(C0966R.string.hob), this.f202419d.getResources().getColor(C0966R.color.f3154h3));
        buttonPreference.mo69924H(this.f202419d.getResources().getString(C0966R.string.hob));
        buttonPreference.mo101916J(C0966R.C0969drawable.ar5);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        mo96542l(this.f202421f, this.f202420e, true);
    }

    public boolean onCreate() {
        return false;
    }

    public boolean onDestroy() {
        return false;
    }

    public boolean onDetach() {
        C77101h hVar = (C77101h) this.f202421f.mo72519a("contact_profile_sns");
        if (hVar != null) {
            hVar.onDetach();
        }
        if (C99019x.m128970b() != null) {
            ((C5431p1.C5432a) C99019x.m128970b()).mo6412c(this, 3);
        }
        NormalProfileHeaderPreference normalProfileHeaderPreference = (NormalProfileHeaderPreference) this.f202421f.mo72519a("contact_profile_header_normal");
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.mo96615N();
        }
        this.f202436x.dead();
        C75381g gVar = this.f202430r;
        if (gVar != null) {
            ((C47001b) C86709a0.m107533q(C47001b.class)).mo71279fN(gVar);
        }
        for (String f : this.f202432t) {
            C31519v2.m39436a().mo55989f(f);
        }
        return false;
    }

    public void onPause() {
    }

    public void onResume() {
        mo96545o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        if (r1 != false) goto L_0x01fe;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96546p(android.content.Context r20, pj3.C47511g r21, com.tencent.p014mm.storage.C72996z1 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            boolean r4 = r0.f202424i
            r5 = -1
            java.lang.String r6 = "contact_profile_finder"
            r7 = 1
            if (r4 != 0) goto L_0x0014
            boolean r4 = r0.f202425j
            if (r4 == 0) goto L_0x003b
        L_0x0014:
            r2.mo72531o(r6)
            java.lang.String r4 = "openim_pref_key_info"
            int r4 = r2.mo72521d(r4)
            com.tencent.mm.pluginsdk.ui.preference.FinderPreference r8 = new com.tencent.mm.pluginsdk.ui.preference.FinderPreference
            r8.<init>(r1)
            r8.mo26273A(r6)
            r9 = 2131825947(0x7f11151b, float:1.9284765E38)
            java.lang.String r1 = r1.getString(r9)
            r8.f120967J = r1
            r8.f120971N = r7
            if (r4 == r5) goto L_0x0038
            int r4 = r4 + r7
            r2.mo72524h(r8, r4)
            goto L_0x003b
        L_0x0038:
            r2.mo72524h(r8, r4)
        L_0x003b:
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r4 = "FinderWxNameCardFinderAndRecentLikeFinderClose"
            r8 = 0
            int r1 = r1.mo107404b(r4, r8)
            if (r1 != r7) goto L_0x0052
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            di3.d r4 = di3.C86312j.m106911c(r3)
            ht1.t1 r4 = (ht1.C60200t1) r4
            ht1.u4 r4 = r4.mo76885uf()
            boolean r4 = r4.mo8925d()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "updateFinderPreview, dontRequestCgi:"
            r9.append(r10)
            r9.append(r1)
            java.lang.String r10 = ", switchC:"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "MicroMsg.NewContactWidgetNormal"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.lang.Class<ky2.i> r9 = ky2.C10432i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ky2.i r9 = (ky2.C10432i) r9
            boolean r9 = r9.mo10750e()
            if (r1 != 0) goto L_0x01fe
            boolean r1 = r0.f202424i
            r11 = 4
            r12 = 2
            if (r1 != 0) goto L_0x00fd
            boolean r1 = r0.f202425j
            if (r1 != 0) goto L_0x00fd
            if (r22 != 0) goto L_0x009c
        L_0x009a:
            r1 = 1
            goto L_0x00fb
        L_0x009c:
            com.tencent.mm.ui.MMActivity r1 = r0.f202419d
            android.content.Intent r1 = r1.getIntent()
            java.lang.String r13 = "Contact_Scene"
            int r1 = r1.getIntExtra(r13, r5)
            com.tencent.mm.ui.MMActivity r13 = r0.f202419d
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r14 = "CONTACT_INFO_UI_SOURCE"
            int r5 = r13.getIntExtra(r14, r5)
            eb0.c r13 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r13 = r13.mo105907v()
            java.lang.String r14 = r22.getUsername()
            boolean r13 = r13.mo69724s3(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "isFinderGone, isFriend:"
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = ", scene:"
            r14.append(r15)
            r14.append(r1)
            java.lang.String r15 = ", uiSource： "
            r14.append(r15)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
            if (r13 != 0) goto L_0x00fa
            r13 = 14
            if (r1 == r13) goto L_0x00fa
            r13 = 18
            if (r1 == r13) goto L_0x00fa
            r13 = 9
            if (r1 != r13) goto L_0x009a
            if (r5 == r12) goto L_0x00fa
            if (r5 != r11) goto L_0x009a
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            if (r1 != 0) goto L_0x01fe
        L_0x00fd:
            if (r9 == 0) goto L_0x0101
            goto L_0x01fe
        L_0x0101:
            long r13 = eb0.C31543z5.m39451a()
            long r11 = r0.f202438z
            long r11 = r13 - r11
            r15 = 1000(0x3e8, double:4.94E-321)
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x012f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "updateFinderPreview, lastUpdateTime:"
            r1.append(r2)
            long r2 = r0.f202438z
            r1.append(r2)
            java.lang.String r2 = ", curTime:"
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            return
        L_0x012f:
            r0.f202438z = r13
            boolean r5 = r0.f202424i
            java.lang.String r9 = ""
            if (r5 != 0) goto L_0x0145
            boolean r5 = r0.f202425j
            if (r5 == 0) goto L_0x013c
            goto L_0x0145
        L_0x013c:
            java.lang.String r5 = r22.getUsername()
            r14 = r5
            r15 = r9
        L_0x0142:
            r5 = 4
            goto L_0x01b3
        L_0x0145:
            com.tencent.mm.ui.MMActivity r5 = r0.f202419d
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r11 = "key_add_contact_openim_finder_username"
            java.lang.String r12 = r5.getStringExtra(r11)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 == 0) goto L_0x019b
            boolean r5 = r5.hasExtra(r11)
            if (r5 == 0) goto L_0x0164
            java.lang.String r5 = "FinderUsername from intent, use empty value"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            r12 = r9
            goto L_0x01b0
        L_0x0164:
            java.lang.Class<ge0.b> r5 = ge0.C32415b.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ge0.b r5 = (ge0.C32415b) r5
            re0.h r5 = r5.zx0()
            java.lang.String r11 = r22.getUsername()
            zh3.f r5 = r5.f96665d
            java.lang.String[] r12 = new java.lang.String[r7]
            r12[r8] = r11
            java.lang.String r11 = "select finder_username from OpenIMFinderInfoNew where openIMUsername=? "
            r1 = 2
            android.database.Cursor r5 = r5.rawQuery(r11, r12, r1)
            boolean r11 = r5.moveToFirst()
            if (r11 == 0) goto L_0x0191
            java.lang.String r11 = r5.getString(r8)
            if (r11 != 0) goto L_0x018f
            goto L_0x0191
        L_0x018f:
            r12 = r11
            goto L_0x0192
        L_0x0191:
            r12 = r9
        L_0x0192:
            r5.close()
            java.lang.String r5 = "FinderUsername from intent is empty, use db value"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            goto L_0x01b0
        L_0x019b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "use FinderUsername from intent, "
            r5.append(r11)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
        L_0x01b0:
            r14 = r9
            r15 = r12
            goto L_0x0142
        L_0x01b3:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            boolean r9 = r0.f202424i
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r5[r8] = r9
            boolean r8 = r0.f202425j
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r5[r7] = r8
            r1 = 2
            r5[r1] = r14
            r1 = 3
            r5[r1] = r15
            java.lang.String r1 = "updateFinderPreview isOpenIM: %s, isOpenIMKefu: %s, wxUsername: %s, openimFinderUsername: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r5)
            di3.d r1 = di3.C86312j.m106911c(r3)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r13 = r1.mo76861l7()
            com.tencent.mm.ui.MMActivity r1 = r0.f202419d
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$f r3 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$f
            r3.<init>(r4, r2)
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$h r5 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$h
            r5.<init>(r4, r2)
            r16 = r1
            r17 = r3
            r18 = r5
            java.lang.Object r1 = r13.mo83781a6(r14, r15, r16, r17, r18)
            if (r4 == 0) goto L_0x01f7
            r0.mo96547q(r2, r1)
            goto L_0x01fa
        L_0x01f7:
            r2.mo72529n(r6, r7)
        L_0x01fa:
            r0.mo96548r(r2, r1)
            return
        L_0x01fe:
            r2.mo72529n(r6, r7)
            java.lang.String r1 = "contact_profile_finder_recent_like"
            r2.mo72529n(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.NewContactWidgetNormal.mo96546p(android.content.Context, pj3.g, com.tencent.mm.storage.z1):void");
    }

    /* renamed from: q */
    public final void mo96547q(C47511g gVar, Object obj) {
        boolean z = obj instanceof fp4;
        if (z) {
            fp4 fp4 = (fp4) obj;
            FinderPreference finderPreference = (FinderPreference) gVar.mo72519a("contact_profile_finder");
            if (finderPreference == null) {
                Log.m105920e("MicroMsg.NewContactWidgetNormal", "preference is null!");
                return;
            }
            if (fp4.f133628d == null) {
                gVar.mo72529n("contact_profile_finder", true);
            } else {
                if (!this.f202437y) {
                    C115669n.INSTANCE.mo160131h(21908, 2, 2, 1);
                }
                gVar.mo72529n("contact_profile_finder", false);
                finderPreference.f120970M = fp4;
                finderPreference.mo69404I();
                this.f202437y = true;
                if (this.f202424i) {
                    Preference a = gVar.mo72519a("openim_pref_key_info");
                    if (a instanceof OpenIMPreference) {
                        ((OpenIMPreference) a).f115282Q0 = true;
                        gVar.notifyDataSetChanged();
                    }
                }
            }
            String username = this.f202420e.getUsername();
            boolean z2 = this.f202437y;
            C72996z1 z1Var = C42599h.f115274e;
            if (z1Var != null && z1Var.getUsername().equals(username)) {
                C42599h.f115276g = Boolean.valueOf(z2);
            }
            C42599h.xx0(this.f202419d.getIntent(), 33, 1, this.f202420e.getUsername());
        } else {
            gVar.mo72529n("contact_profile_finder", true);
        }
        if (z) {
            NormalProfileHeaderPreference normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal");
            if (normalProfileHeaderPreference != null) {
                normalProfileHeaderPreference.f202582W = ((fp4) obj).f133628d;
                this.f202421f.notifyDataSetChanged();
                return;
            }
            return;
        }
        NormalProfileHeaderPreference normalProfileHeaderPreference2 = (NormalProfileHeaderPreference) gVar.mo72519a("contact_profile_header_normal");
        if (normalProfileHeaderPreference2 != null) {
            normalProfileHeaderPreference2.f202582W = null;
            this.f202421f.notifyDataSetChanged();
        }
    }

    /* renamed from: r */
    public final void mo96548r(C47511g gVar, Object obj) {
        if ((obj instanceof fp4) && !this.f202424i && !this.f202425j) {
            fp4 fp4 = (fp4) obj;
            if (fp4.f133631g == 1) {
                gVar.mo72529n("contact_profile_finder_recent_like", false);
                FinderRecentLikePreference finderRecentLikePreference = (FinderRecentLikePreference) gVar.mo72519a("contact_profile_finder_recent_like");
                hp4 hp4 = null;
                if (!gVar.mo72522f("contact_profile_finder")) {
                    C51129rn0 rn02 = fp4.f133632h;
                    if (rn02 != null && !Util.isNullOrNil((List) rn02.f141036d)) {
                        hp4 = new hp4();
                        hp4.f134812d.addAll(fp4.f133632h.f141036d);
                    }
                    finderRecentLikePreference.f120976M = hp4;
                    finderRecentLikePreference.mo69405I();
                    return;
                }
                finderRecentLikePreference.f120976M = null;
                finderRecentLikePreference.mo69405I();
                return;
            }
        }
        gVar.mo72529n("contact_profile_finder_recent_like", true);
    }

    /* renamed from: s */
    public final void mo96549s(C47511g gVar) {
        if (mo96534e()) {
            Log.m105924i("MicroMsg.NewContactWidgetNormal", "isFinder, hide all");
            gVar.mo72529n("contact_profile_add_contact", true);
            gVar.mo72529n("contact_profile_accept_contact_by_wework", true);
            gVar.mo72529n("contact_profile_setting_desc", true);
            gVar.mo72529n("contact_profile_send", true);
            gVar.mo72529n("contact_profile_voip", true);
            gVar.mo72529n("contact_profile_say_hi", true);
            gVar.mo72529n("contact_profile_info_more", true);
            gVar.mo72529n("contact_profile_setting_permission", true);
            gVar.mo72529n("contact_profile_voip", true);
            gVar.mo72529n("contact_profile_multi_button", false);
            gVar.mo72529n("contact_profile_set_des_category", true);
            gVar.mo72529n("contact_info_category_1", true);
            gVar.mo72529n("line1", false);
            gVar.mo72529n("line2", false);
            gVar.mo72529n("line3", false);
            gVar.mo72529n("line4", false);
            this.f202430r.f221633d.removeAllOptionMenu();
            return;
        }
        gVar.mo72529n("line4", true);
    }

    /* renamed from: t */
    public final void mo96550t(C47511g gVar) {
        if (mo96538i()) {
            Log.m105924i("MicroMsg.NewContactWidgetNormal", "isOpenIMKefuContact, hide all");
            gVar.mo72529n("contact_profile_add_contact", true);
            gVar.mo72529n("contact_profile_accept_contact", true);
            gVar.mo72529n("contact_profile_accept_contact_by_wework", true);
            gVar.mo72529n("contact_profile_setting_desc", true);
            gVar.mo72529n("contact_profile_send", true);
            gVar.mo72529n("contact_profile_voip", true);
            gVar.mo72529n("contact_profile_say_hi", true);
            gVar.mo72529n("contact_profile_info_more", true);
            gVar.mo72529n("contact_profile_setting_permission", true);
            gVar.mo72529n("contact_profile_multi_button", true);
            gVar.mo72529n("contact_profile_set_des_category", true);
            gVar.mo72529n("contact_profile_hint", true);
            gVar.mo72529n("contact_profile_source", true);
            gVar.mo72529n("contact_info_invite_source", true);
            gVar.mo72529n("contact_info_signature", true);
            gVar.mo72529n("contact_info_introduce", true);
            gVar.mo72529n("contact_info_category_1", false);
            gVar.mo72529n("line1", true);
            gVar.mo72529n("line2", true);
            gVar.mo72529n("line3", true);
            gVar.mo72529n("line4", true);
        }
    }

    /* renamed from: u */
    public final void mo96551u(C47511g gVar) {
        if (this.f202434v != null && gVar != null && !gVar.mo72522f("contact_profile_multi_button")) {
            gVar.mo72529n("line3", true);
        }
    }

    /* renamed from: v */
    public final void mo96552v(C47511g gVar, C72996z1 z1Var) {
        if (gVar.mo72523g("contact_profile_desc") >= 0 || gVar.mo72523g("contact_profile_label") >= 0) {
            gVar.mo72529n("contact_profile_setting_desc", true);
        } else {
            gVar.mo72529n("contact_profile_setting_desc", false);
        }
        if (!z1Var.mo62927s3()) {
            gVar.mo72529n("contact_profile_setting_desc", false);
        }
        gVar.mo72529n("contact_profile_set_des_category", true);
        if (C72996z1.m85843n5(this.f202420e.getUsername()) && Util.isNullOrNil(this.f202420e.mo73969n2())) {
            gVar.mo72529n("contact_profile_setting_desc", false);
            gVar.mo72529n("contact_profile_set_des_category", true);
        } else if (C72996z1.m85843n5(this.f202420e.getUsername()) || mo96534e()) {
            gVar.mo72529n("contact_profile_setting_desc", true);
            gVar.mo72529n("contact_profile_set_des_category", true);
        }
    }

    /* renamed from: w */
    public final void mo96553w(C47511g gVar, C72996z1 z1Var) {
        MMActivity mMActivity;
        int i;
        if (this.f202433u) {
            TextPreference textPreference = (TextPreference) gVar.mo72519a("contact_profile_wechat_info");
            String string = this.f202419d.getResources().getString(C0966R.string.g1k);
            StringBuilder sb = new StringBuilder();
            Resources resources = this.f202419d.getResources();
            Object[] objArr = new Object[1];
            if (!((z1Var.f149528a1 & 2) > 0)) {
                mMActivity = this.f202419d;
                i = C0966R.string.bim;
            } else {
                mMActivity = this.f202419d;
                i = C0966R.string.bin;
            }
            objArr[0] = mMActivity.getString(i);
            sb.append(resources.getString(C0966R.string.bsw, objArr));
            sb.append("  ");
            sb.append(string);
            String sb4 = sb.toString();
            ArrayList arrayList = new ArrayList();
            arrayList.add(string);
            textPreference.f215119N = new C70136n(textPreference, sb4, arrayList);
            if (!gVar.mo72522f("contact_profile_hint")) {
                gVar.mo72529n("line2", true);
                gVar.mo72529n("line4", true);
            }
            mo96551u(gVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04c6, code lost:
        if ((((ge0.C32415b) di3.C86312j.m106911c(ge0.C32415b.class)).Ax0().mo60611Lo(r4.getUsername()) & 1) > 0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04cd, code lost:
        if ((r10.f130392d & 1) > 0) goto L_0x04cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04d4, code lost:
        r30 = r3;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0ce5, code lost:
        if ((r1.f202419d.getIntent().getIntExtra("Contact_Scene", -1) == 14) != false) goto L_0x0ce7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0a84  */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x0ae3  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x0ae7  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0b1a  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x0b71  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0bc6  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0bfc  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0c0c  */
    /* JADX WARNING: Removed duplicated region for block: B:418:0x0c11  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0c25  */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x0c3b  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0cd5  */
    /* JADX WARNING: Removed duplicated region for block: B:465:0x0d13  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0d23  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0d65  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x0d90  */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0dc0  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0dc9  */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0de7  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0e2d  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0e38 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0285 A[EDGE_INSN: B:515:0x0285->B:78:0x0285 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x031e  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5961x(pj3.C47511g r34, com.tencent.p014mm.storage.C72996z1 r35, boolean r36, int r37) {
        /*
            r33 = this;
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r37
            java.lang.Class<ny.h> r5 = p629ny.C76979h.class
            boolean r0 = r1.f202423h
            r1.f202423h = r0
            r1.f202421f = r2
            r1.f202420e = r3
            r1.f202422g = r4
            com.tencent.mm.ui.MMActivity r0 = r1.f202419d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r6 = "room_name"
            java.lang.String r0 = r0.getStringExtra(r6)
            r1.f202429q = r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            eb0.m2 r0 = r0.mo105902q()
            java.lang.String r6 = r1.f202429q
            com.tencent.mm.storage.n1 r0 = (com.tencent.p014mm.storage.C44662n1) r0
            com.tencent.mm.storage.m1 r0 = r0.mo69799Lo(r6)
            r1.f202428p = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f202419d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r6 = "key_forward_flag"
            r7 = 0
            boolean r0 = r0.getBooleanExtra(r6, r7)
            r1.f202431s = r0
            df2.g r0 = r1.f202430r
            if (r0 != 0) goto L_0x005a
            df2.g r0 = new df2.g
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            r0.<init>(r6, r3)
            r1.f202430r = r0
            r8 = 2131821586(0x7f110412, float:1.927592E38)
            r9 = 2131756370(0x7f100552, float:1.9143646E38)
            r6.addIconOptionMenu((int) r7, (int) r8, (int) r9, (android.view.MenuItem.OnMenuItemClickListener) r0)
        L_0x005a:
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.String r8 = r35.getUsername()
            r0[r7] = r8
            java.lang.String r8 = "MicroMsg.NewContactWidgetNormal"
            java.lang.String r9 = "[onAttach] username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r0)
            r34.removeAll()
            r0 = 2132082767(0x7f15004f, float:1.9805657E38)
            r2.mo72520b(r0)
            java.lang.String r0 = "contact_profile_header_normal"
            com.tencent.mm.ui.base.preference.Preference r0 = r2.mo72519a(r0)
            r9 = r0
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference r9 = (com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference) r9
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$g r0 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$g
            r0.<init>()
            r9.f202583X = r0
            r9.f202575P = r2
            df2.g r0 = r1.f202430r
            r10 = r36
            r9.mo96611I(r3, r4, r10, r0)
            java.lang.String r10 = "contact_profile_send"
            com.tencent.mm.ui.base.preference.Preference r0 = r2.mo72519a(r10)
            r11 = r0
            com.tencent.mm.ui.base.preference.ButtonPreference r11 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r11
            if (r11 == 0) goto L_0x009c
            r0 = 2131300325(0x7f090fe5, float:1.8218676E38)
            r11.f215028T = r0
        L_0x009c:
            java.lang.String r12 = "contact_profile_add_contact"
            com.tencent.mm.ui.base.preference.Preference r0 = r2.mo72519a(r12)
            r13 = r0
            com.tencent.mm.ui.base.preference.ButtonPreference r13 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r13
            java.lang.String r0 = r35.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 == 0) goto L_0x00b5
            int r0 = r3.f149530c1
            if (r0 == 0) goto L_0x00b5
            r0 = 1
            goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r1.f202424i = r0
            boolean r0 = r33.mo96538i()
            if (r0 == 0) goto L_0x00c4
            int r0 = r3.f149530c1
            if (r0 == 0) goto L_0x00c4
            r0 = 1
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            r1.f202425j = r0
            boolean r0 = r1.f202424i
            java.lang.String r14 = "contact_info_category_1"
            r2.mo72529n(r14, r0)
            boolean r0 = r1.f202424i
            r0 = r0 ^ r6
            java.lang.String r14 = "contact_info_category_1_openim"
            r2.mo72529n(r14, r0)
            com.tencent.mm.ui.MMActivity r15 = r1.f202419d
            com.tencent.mm.storage.z1 r6 = r1.f202420e
            java.lang.String r0 = r6.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r0)
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = r6.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85846q5(r0)
            if (r0 == 0) goto L_0x02a2
        L_0x00ee:
            int r0 = r6.f149530c1
            if (r0 == 0) goto L_0x02a2
            int r14 = r2.mo72521d(r14)
            java.lang.String r0 = r6.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85846q5(r0)
            java.lang.Class<he0.j> r20 = he0.C76158j.class
            di3.d r20 = di3.C86312j.m106911c(r20)
            r7 = r20
            he0.j r7 = (he0.C76158j) r7
            r20 = r12
            java.lang.String r12 = r6.mo73980x2()
            r21 = r10
            he0.j$a r10 = he0.C76158j.C8510a.TYPE_WORDING
            java.lang.String r4 = "openim_custom_info_header"
            java.lang.String r0 = r7.S10(r12, r4, r10, r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r7 = "openim_company_info_title"
            if (r4 != 0) goto L_0x013f
            com.tencent.mm.ui.base.preference.PreferenceTitleCategory r4 = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory
            r10 = 0
            r4.<init>(r15, r10)
            r4.mo26273A(r7)
            r10 = 2131496615(0x7f0c0ea7, float:1.86168E38)
            r4.f121271G = r10
            r4.mo69924H(r0)
            r2.mo72524h(r4, r14)
            df2.b r0 = new df2.b
            r0.<init>()
            r4.f121276f = r0
            r4 = r14
            goto L_0x0140
        L_0x013f:
            r4 = -1
        L_0x0140:
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.lang.String r0 = r6.f149532d1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = r6.f149532d1
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017e }
            r12.<init>(r0)     // Catch:{ JSONException -> 0x017e }
            java.lang.String r0 = "custom_info"
            org.json.JSONArray r0 = r12.optJSONArray(r0)     // Catch:{ JSONException -> 0x017e }
            if (r0 != 0) goto L_0x015d
            goto L_0x018d
        L_0x015d:
            r22 = r14
            r12 = 0
        L_0x0160:
            int r14 = r0.length()     // Catch:{ JSONException -> 0x017c }
            if (r12 >= r14) goto L_0x018f
            org.json.JSONObject r14 = r0.getJSONObject(r12)     // Catch:{ JSONException -> 0x017c }
            r23 = r0
            he0.l r0 = new he0.l     // Catch:{ JSONException -> 0x017c }
            r0.<init>()     // Catch:{ JSONException -> 0x017c }
            r0.mo106375a(r14)     // Catch:{ JSONException -> 0x017c }
            r10.add(r0)     // Catch:{ JSONException -> 0x017c }
            int r12 = r12 + 1
            r0 = r23
            goto L_0x0160
        L_0x017c:
            r0 = move-exception
            goto L_0x0181
        L_0x017e:
            r0 = move-exception
            r22 = r14
        L_0x0181:
            r12 = 0
            java.lang.Object[] r14 = new java.lang.Object[r12]
            java.lang.String r12 = "MicroMsg.OpenIMCustomDetail"
            java.lang.String r3 = "parse"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r14)
            goto L_0x018f
        L_0x018d:
            r22 = r14
        L_0x018f:
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r6.f149532d1
            r12 = 0
            r0[r12] = r3
            java.lang.String r3 = "MicroMsg.Profile.OpenIMProfileLogic"
            java.lang.String r12 = "handleProfileLogic customInfoDetail: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r12, r0)
            java.util.Iterator r0 = r10.iterator()
            r14 = r22
            r10 = 0
        L_0x01a5:
            boolean r12 = r0.hasNext()
            r22 = r14
            java.lang.String r14 = "openim_pref_key_info"
            if (r12 == 0) goto L_0x0285
            java.lang.Object r12 = r0.next()
            he0.l r12 = (he0.C76159l) r12
            r23 = r0
            java.util.List<he0.m> r0 = r12.f223089b
            java.util.Iterator r0 = r0.iterator()
        L_0x01be:
            boolean r24 = r0.hasNext()
            if (r24 == 0) goto L_0x027f
            java.lang.Object r24 = r0.next()
            r25 = r0
            r0 = r24
            he0.m r0 = (he0.C76160m) r0
            r24 = r8
            int r8 = r22 + 1
            r26 = r13
            com.tencent.mm.plugin.profile.logic.OpenIMPreference r13 = new com.tencent.mm.plugin.profile.logic.OpenIMPreference
            r13.<init>(r15)
            r13.f115284y0 = r0
            r27 = r11
            java.lang.String r11 = r12.f223088a
            r13.f121242N = r11
            r11 = 2
            r13.f121254p0 = r11
            r28 = r9
            android.widget.TextView r9 = r13.f121238J
            if (r9 == 0) goto L_0x01ed
            r9.setMaxLines(r11)
        L_0x01ed:
            r9 = 0
            r13.f121240L = r9
            di3.d r11 = di3.C86312j.m106911c(r5)
            ny.h r11 = (p629ny.C76979h) r11
            java.lang.String r9 = r6.mo73980x2()
            java.lang.String r9 = r0.mo106376a(r9)
            android.text.SpannableString r9 = r11.mo107057T1(r15, r9)
            r13.mo7741E(r9)
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.String r9 = r0.f223091b
            r17 = 0
            r11[r17] = r9
            java.lang.String r9 = "handleProfileLogic rawDesc: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r9, r11)
            if (r10 != 0) goto L_0x0231
            java.lang.String r9 = r0.f223091b
            java.lang.String r11 = "@im"
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0231
            r13.mo26273A(r14)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10[r17] = r9
            java.lang.String r9 = "handleProfileLogic foundCompanyInfo pos: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r9, r10)
            r10 = 1
        L_0x0231:
            r2.mo72524h(r13, r8)
            int r9 = r0.f223093d
            if (r9 == 0) goto L_0x0268
            r11 = 1
            if (r9 != r11) goto L_0x023c
            goto L_0x0268
        L_0x023c:
            r11 = 2
            if (r9 != r11) goto L_0x0247
            df2.c r9 = new df2.c
            r9.<init>(r0, r6, r12, r15)
            r13.f121276f = r9
            goto L_0x0271
        L_0x0247:
            r11 = 3
            if (r9 != r11) goto L_0x0252
            df2.d r9 = new df2.d
            r9.<init>(r0, r6, r12, r15)
            r13.f121276f = r9
            goto L_0x0271
        L_0x0252:
            r11 = 4
            if (r9 != r11) goto L_0x025d
            df2.e r9 = new df2.e
            r9.<init>(r0, r6, r12, r15)
            r13.f121276f = r9
            goto L_0x0271
        L_0x025d:
            r11 = 5
            if (r9 != r11) goto L_0x0271
            df2.f r9 = new df2.f
            r9.<init>(r0, r6, r12)
            r13.f121276f = r9
            goto L_0x0271
        L_0x0268:
            r9 = 1
            r13.mo69932y(r9)
            r9 = 8
            r13.mo69921C(r9)
        L_0x0271:
            r22 = r8
            r8 = r24
            r0 = r25
            r13 = r26
            r11 = r27
            r9 = r28
            goto L_0x01be
        L_0x027f:
            r14 = r22
            r0 = r23
            goto L_0x01a5
        L_0x0285:
            r24 = r8
            r28 = r9
            r27 = r11
            r26 = r13
            if (r10 != 0) goto L_0x02ae
            r3 = -1
            if (r4 == r3) goto L_0x02ae
            com.tencent.mm.ui.base.preference.Preference r0 = r2.mo72519a(r7)
            if (r0 == 0) goto L_0x02ae
            r2.mo72531o(r7)
            r0.mo26273A(r14)
            r2.mo72524h(r0, r4)
            goto L_0x02ae
        L_0x02a2:
            r24 = r8
            r28 = r9
            r21 = r10
            r27 = r11
            r20 = r12
            r26 = r13
        L_0x02ae:
            com.tencent.mm.storage.z1 r0 = r1.f202420e
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85816S4(r0)
            if (r0 == 0) goto L_0x031e
            r34.removeAll()
            r3 = r28
            r2.mo72527k(r3)
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r0 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            com.tencent.mm.ui.MMActivity r3 = r1.f202419d
            r4 = 0
            r0.<init>(r3, r4)
            r2.mo72527k(r0)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = new com.tencent.mm.ui.base.preference.KeyValuePreference
            com.tencent.mm.ui.MMActivity r3 = r1.f202419d
            r0.<init>(r3)
            r3 = 2131824168(0x7f110e28, float:1.9281156E38)
            r0.mo69923G(r3)
            r3 = 2131824428(0x7f110f2c, float:1.9281684E38)
            r0.mo7740D(r3)
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.f121254p0 = r3
            android.widget.TextView r4 = r0.f121238J
            if (r4 == 0) goto L_0x02ec
            r4.setMaxLines(r3)
        L_0x02ec:
            r3 = 0
            r0.f121240L = r3
            r3 = 8
            r0.mo69921C(r3)
            r2.mo72527k(r0)
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r0 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            com.tencent.mm.ui.MMActivity r3 = r1.f202419d
            r4 = 0
            r0.<init>(r3, r4)
            r2.mo72527k(r0)
            com.tencent.mm.storage.z1 r0 = r1.f202420e
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x0310
            r3 = r27
            r2.mo72527k(r3)
            goto L_0x0315
        L_0x0310:
            r3 = r26
            r2.mo72527k(r3)
        L_0x0315:
            df2.g r0 = r1.f202430r
            com.tencent.mm.ui.MMActivity r0 = r0.f221633d
            r0.removeAllOptionMenu()
            r2 = 1
            return r2
        L_0x031e:
            r3 = r26
            java.lang.String r0 = "contact_profile_setting_desc"
            com.tencent.mm.ui.base.preference.Preference r4 = r2.mo72519a(r0)
            com.tencent.mm.storage.z1 r6 = r1.f202420e
            java.lang.String r6 = r6.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85843n5(r6)
            if (r6 == 0) goto L_0x0338
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            r7 = 2131824438(0x7f110f36, float:1.9281704E38)
            goto L_0x033d
        L_0x0338:
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            r7 = 2131824437(0x7f110f35, float:1.9281702E38)
        L_0x033d:
            java.lang.CharSequence r6 = r6.getText(r7)
            java.lang.String r6 = r6.toString()
            r4.mo69924H(r6)
            com.tencent.mm.storage.z1 r4 = r1.f202420e
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "Contact_KSnsIFlag"
            r8 = -1
            int r6 = r6.getIntExtra(r7, r8)
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            android.content.Intent r7 = r7.getIntent()
            r8 = -1
            java.lang.String r10 = "Contact_KSnsBgId"
            long r7 = r7.getLongExtra(r10, r8)
            com.tencent.mm.ui.MMActivity r9 = r1.f202419d
            android.content.Intent r9 = r9.getIntent()
            java.lang.String r10 = "Contact_KSnsBgUrl"
            java.lang.String r9 = r9.getStringExtra(r10)
            java.lang.String r10 = ""
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r10)
            te3.a94 r10 = new te3.a94
            r10.<init>()
            r10.f130392d = r6
            r10.f130394f = r7
            r10.f130393e = r9
            jr2.n r6 = jr2.C99019x.m128971c()
            if (r6 == 0) goto L_0x0475
            jr2.n r6 = jr2.C99019x.m128971c()
            java.lang.String r7 = r4.getUsername()
            os2.d0 r6 = (os2.C100399d0) r6
            r6.getClass()
            java.lang.String r8 = "setSnsUserInfo"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.storage.SnsExtStorage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            os2.c0 r11 = r6.mo139782Yt(r7)
            java.lang.String r12 = r10.f130393e
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x03ac
            java.lang.String r12 = r11.field_bgUrl
            goto L_0x03ae
        L_0x03ac:
            java.lang.String r12 = r10.f130393e
        L_0x03ae:
            r10.f130393e = r12
            int r12 = r10.f130392d
            r13 = -1
            if (r12 != r13) goto L_0x03b7
            r13 = 1
            goto L_0x03b8
        L_0x03b7:
            r13 = 0
        L_0x03b8:
            if (r13 == 0) goto L_0x03bc
            int r12 = r11.field_iFlag
        L_0x03bc:
            r10.f130392d = r12
            java.lang.String r12 = "getFromExtInfo2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r9)
            int r14 = r11.field_iFlag
            r15 = 1
            r14 = r14 & r15
            if (r14 <= 0) goto L_0x03cb
            r14 = 1
            goto L_0x03cc
        L_0x03cb:
            r14 = 0
        L_0x03cc:
            int r11 = r11.field_local_flag
            r15 = 4
            r11 = r11 & r15
            if (r11 <= 0) goto L_0x03d4
            r11 = 1
            goto L_0x03d5
        L_0x03d4:
            r11 = 0
        L_0x03d5:
            if (r11 != 0) goto L_0x045f
            if (r14 != 0) goto L_0x045f
            zh3.f r11 = r6.f294085e
            java.lang.String r14 = "select count(*)  from sqlite_master where type='table' and name = 'snsExtInfo2'"
            r26 = r3
            r3 = 2
            r15 = 0
            android.database.Cursor r11 = r11.rawQuery(r14, r15, r3)
            boolean r3 = r11.moveToFirst()
            if (r3 == 0) goto L_0x03f2
            r3 = 0
            int r17 = r11.getInt(r3)
            goto L_0x03f5
        L_0x03f2:
            r3 = 0
            r17 = 0
        L_0x03f5:
            r11.close()
            java.lang.String r11 = "MicroMsg.SnsExtStorage"
            if (r17 != 0) goto L_0x040c
            r14 = 1
            java.lang.Object[] r6 = new java.lang.Object[r14]
            r6[r3] = r7
            java.lang.String r3 = "can not get snsextinfo2 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r11, r3, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            r6 = 0
            r14 = 0
            goto L_0x0466
        L_0x040c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r14 = "select * from snsExtInfo2 where userName=\""
            r3.append(r14)
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r7)
            r3.append(r14)
            java.lang.String r14 = "\""
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]
            r14 = 0
            r15[r14] = r3
            java.lang.String r14 = "get from snsextinfo2 sql %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r14, r15)
            zh3.f r6 = r6.f294085e
            r14 = 0
            r15 = 2
            android.database.Cursor r3 = r6.rawQuery(r3, r14, r15)
            os2.c0 r6 = new os2.c0
            r6.<init>()
            boolean r15 = r3.moveToFirst()
            if (r15 == 0) goto L_0x045b
            r6.convertFrom(r3)
            r3.close()
            r3 = 1
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r3 = 0
            r15[r3] = r7
            java.lang.String r3 = "setSnsUserInfo fix newversion change snsextinfo3 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            goto L_0x0466
        L_0x045b:
            r3.close()
            goto L_0x0462
        L_0x045f:
            r26 = r3
            r14 = 0
        L_0x0462:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r9)
            r6 = r14
        L_0x0466:
            if (r6 == 0) goto L_0x0471
            if (r13 == 0) goto L_0x046d
            int r3 = r6.field_iFlag
            goto L_0x046f
        L_0x046d:
            int r3 = r10.f130392d
        L_0x046f:
            r10.f130392d = r3
        L_0x0471:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            goto L_0x0478
        L_0x0475:
            r26 = r3
            r14 = 0
        L_0x0478:
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r3 = r3.mo105907v()
            java.lang.String r6 = r4.getUsername()
            boolean r3 = r3.mo69724s3(r6)
            java.lang.String r6 = eb0.C75592q0.m90789s()
            java.lang.String r7 = r4.getUsername()
            boolean r31 = r6.equals(r7)
            java.lang.String r6 = r4.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85843n5(r6)
            r7 = 0
            if (r6 == 0) goto L_0x04c9
            if (r3 != 0) goto L_0x04ab
            boolean r3 = r4.mo62927s3()
            if (r3 == 0) goto L_0x04a9
            goto L_0x04ab
        L_0x04a9:
            r3 = 0
            goto L_0x04ac
        L_0x04ab:
            r3 = 1
        L_0x04ac:
            java.lang.Class<ge0.b> r6 = ge0.C32415b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ge0.b r6 = (ge0.C32415b) r6
            re0.j r6 = r6.Ax0()
            java.lang.String r9 = r4.getUsername()
            long r9 = r6.mo60611Lo(r9)
            r11 = 1
            long r9 = r9 & r11
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r9 = 1
            if (r6 <= 0) goto L_0x04d4
            goto L_0x04cf
        L_0x04c9:
            int r6 = r10.f130392d
            r9 = 1
            r6 = r6 & r9
            if (r6 <= 0) goto L_0x04d4
        L_0x04cf:
            r30 = r3
            r16 = 1
            goto L_0x04d8
        L_0x04d4:
            r30 = r3
            r16 = 0
        L_0x04d8:
            boolean r3 = f202418A
            if (r3 == 0) goto L_0x04ee
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r16)
            r10 = 0
            r3[r10] = r6
            java.lang.String r6 = "debugOpenAlbum, origin:%s"
            r11 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r3)
            r3 = 1
            goto L_0x04f3
        L_0x04ee:
            r11 = r24
            r10 = 0
            r3 = r16
        L_0x04f3:
            r6 = 3
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r30)
            r12[r10] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r31)
            r12[r9] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r9 = 2
            r12[r9] = r6
            java.lang.String r6 = "isFriend:%s isSelf:%s openAlbum:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r12)
            java.lang.String r6 = r4.getUsername()
            com.tencent.mm.storage.z1 r9 = com.tencent.p014mm.plugin.profile.C42599h.f115274e
            if (r9 == 0) goto L_0x0526
            java.lang.String r9 = r9.getUsername()
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x0526
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            com.tencent.p014mm.plugin.profile.C42599h.f115275f = r6
        L_0x0526:
            java.lang.String r6 = r4.getUsername()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85852w5(r6)
            java.lang.String r9 = "contact_profile_sns"
            if (r6 != 0) goto L_0x0534
            if (r3 != 0) goto L_0x0544
        L_0x0534:
            boolean r3 = r33.mo96536g()
            if (r3 != 0) goto L_0x0544
            if (r31 == 0) goto L_0x053d
            goto L_0x0544
        L_0x053d:
            pj3.g r3 = r1.f202421f
            r4 = 1
            r3.mo72529n(r9, r4)
            goto L_0x058b
        L_0x0544:
            pj3.g r3 = r1.f202421f
            r6 = 0
            r3.mo72529n(r9, r6)
            pj3.g r3 = r1.f202421f
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r9)
            pj3.h r3 = (pj3.C77101h) r3
            jr2.q r6 = jr2.C99019x.m128970b()
            if (r6 == 0) goto L_0x0584
            jr2.q r6 = jr2.C99019x.m128970b()
            java.lang.String r9 = r4.getUsername()
            com.tencent.mm.plugin.sns.model.p1$a r6 = (com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a) r6
            r10 = 3
            r6.mo6423t(r10, r9, r1)
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r9 = "Sns_from_Scene"
            r10 = 0
            int r32 = r6.getIntExtra(r9, r10)
            jr2.q r6 = jr2.C99019x.m128970b()
            r28 = 2
            java.lang.String r29 = r4.getUsername()
            r27 = r6
            com.tencent.mm.plugin.sns.model.p1$a r27 = (com.tencent.p014mm.plugin.sns.model.C5431p1.C5432a) r27
            r27.mo6413d(r28, r29, r30, r31, r32)
        L_0x0584:
            java.lang.String r4 = r4.getUsername()
            r3.mo107419b(r4)
        L_0x058b:
            java.lang.String r3 = "contact_profile_setting_permission"
            com.tencent.mm.ui.base.preference.Preference r4 = r2.mo72519a(r3)
            com.tencent.mm.plugin.profile.ui.MultiSummaryPreference r4 = (com.tencent.p014mm.plugin.profile.p088ui.MultiSummaryPreference) r4
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            r9 = 2131833967(0x7f11346f, float:1.9301031E38)
            java.lang.String r6 = r6.getString(r9)
            r4.f20211K = r6
            com.tencent.mm.storage.z1 r6 = r1.f202420e
            boolean r6 = r6.mo62846A3()
            if (r6 == 0) goto L_0x05bb
            r6 = 1
            java.lang.String[] r9 = new java.lang.String[r6]
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            r10 = 2131834176(0x7f113540, float:1.9301455E38)
            java.lang.String r6 = r6.getString(r10)
            r10 = 0
            r9[r10] = r6
            r4.f20212L = r9
            r12 = r35
            goto L_0x0653
        L_0x05bb:
            boolean r6 = r35.mo62943y3()
            jr2.t r9 = jr2.C99019x.m128974f()
            java.lang.String r10 = r35.getUsername()
            r11 = 5
            os2.m0 r9 = (os2.C11766m0) r9
            boolean r9 = r9.mo11654bD(r10, r11)
            java.util.LinkedList r10 = new java.util.LinkedList
            r10.<init>()
            java.lang.Class<h81.h> r11 = h81.C32735h.class
            di3.d r11 = di3.C86312j.m106911c(r11)
            h81.h r11 = (h81.C32735h) r11
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_set_default_chatonly
            r13 = 0
            int r11 = r11.mo58779Qe(r12, r13)
            if (r6 == 0) goto L_0x0617
            if (r11 != 0) goto L_0x05ff
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            r12 = r35
            int r13 = r12.f149500H
            r15 = 2
            if (r13 != r15) goto L_0x05f4
            r13 = 2131834169(0x7f113539, float:1.930144E38)
            goto L_0x05f7
        L_0x05f4:
            r13 = 2131834171(0x7f11353b, float:1.9301445E38)
        L_0x05f7:
            java.lang.String r6 = r6.getString(r13)
            r10.add(r6)
            goto L_0x0619
        L_0x05ff:
            r12 = r35
            r15 = 2
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            int r13 = r12.f149500H
            if (r13 != r15) goto L_0x060c
            r13 = 2131834170(0x7f11353a, float:1.9301443E38)
            goto L_0x060f
        L_0x060c:
            r13 = 2131834172(0x7f11353c, float:1.9301447E38)
        L_0x060f:
            java.lang.String r6 = r6.getString(r13)
            r10.add(r6)
            goto L_0x0619
        L_0x0617:
            r12 = r35
        L_0x0619:
            if (r9 == 0) goto L_0x0648
            if (r11 != 0) goto L_0x0633
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            int r9 = r12.f149500H
            r11 = 2
            if (r9 != r11) goto L_0x0628
            r9 = 2131834163(0x7f113533, float:1.9301429E38)
            goto L_0x062b
        L_0x0628:
            r9 = 2131834165(0x7f113535, float:1.9301433E38)
        L_0x062b:
            java.lang.String r6 = r6.getString(r9)
            r10.add(r6)
            goto L_0x0648
        L_0x0633:
            r11 = 2
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            int r9 = r12.f149500H
            if (r9 != r11) goto L_0x063e
            r9 = 2131834164(0x7f113534, float:1.930143E38)
            goto L_0x0641
        L_0x063e:
            r9 = 2131834166(0x7f113536, float:1.9301435E38)
        L_0x0641:
            java.lang.String r6 = r6.getString(r9)
            r10.add(r6)
        L_0x0648:
            r6 = 0
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.Object[] r6 = r10.toArray(r9)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.f20212L = r6
        L_0x0653:
            java.lang.String r4 = "contact_profile_source"
            com.tencent.mm.ui.base.preference.Preference r6 = r2.mo72519a(r4)
            com.tencent.mm.ui.base.preference.KeyValuePreference r6 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r6
            com.tencent.mm.ui.MMActivity r9 = r1.f202419d
            android.content.Intent r9 = r9.getIntent()
            java.lang.String r10 = "Contact_Source_FMessage"
            r11 = r37
            int r9 = r9.getIntExtra(r10, r11)
            com.tencent.mm.ui.MMActivity r10 = r1.f202419d
            com.tencent.mm.storage.z1 r11 = r1.f202420e
            java.lang.String r13 = r11.getUsername()
            boolean r15 = r33.mo96536g()
            r14 = 9
            if (r9 != r14) goto L_0x067d
            int r9 = r11.getSource()
        L_0x067d:
            r14 = 1000000(0xf4240, float:1.401298E-39)
            r7 = 17
            r8 = 1
            if (r9 == r8) goto L_0x09e3
            r8 = 6
            if (r9 == r8) goto L_0x09d7
            r8 = 8
            if (r9 == r8) goto L_0x0946
            r8 = 10
            if (r9 == r8) goto L_0x0912
            r8 = 34
            if (r9 == r8) goto L_0x0905
            r8 = 48
            if (r9 == r8) goto L_0x08f8
            r8 = 76
            if (r9 == r8) goto L_0x08eb
            r8 = 96
            if (r9 == r8) goto L_0x0946
            r8 = 161(0xa1, float:2.26E-43)
            if (r9 == r8) goto L_0x08de
            r8 = 184(0xb8, float:2.58E-43)
            if (r9 == r8) goto L_0x08d1
            r8 = 3
            if (r9 == r8) goto L_0x089d
            r8 = 4
            if (r9 == r8) goto L_0x0890
            if (r9 == r7) goto L_0x07d1
            r8 = 18
            if (r9 == r8) goto L_0x079d
            switch(r9) {
                case 12: goto L_0x0890;
                case 13: goto L_0x0912;
                case 14: goto L_0x0946;
                case 15: goto L_0x06c0;
                default: goto L_0x06b7;
            }
        L_0x06b7:
            switch(r9) {
                case 22: goto L_0x075c;
                case 23: goto L_0x075c;
                case 24: goto L_0x075c;
                case 25: goto L_0x0728;
                case 26: goto L_0x075c;
                case 27: goto L_0x075c;
                case 28: goto L_0x075c;
                case 29: goto L_0x075c;
                case 30: goto L_0x06f4;
                default: goto L_0x06ba;
            }
        L_0x06ba:
            switch(r9) {
                case 58: goto L_0x0790;
                case 59: goto L_0x0790;
                case 60: goto L_0x0790;
                default: goto L_0x06bd;
            }
        L_0x06bd:
            r8 = 0
            goto L_0x0a13
        L_0x06c0:
            if (r15 != 0) goto L_0x06e7
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x06c7
            goto L_0x06e7
        L_0x06c7:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x06da
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824351(0x7f110edf, float:1.9281527E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x06da:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824353(0x7f110ee1, float:1.9281532E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x06e7:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824352(0x7f110ee0, float:1.928153E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x06f4:
            if (r15 != 0) goto L_0x071b
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x06fb
            goto L_0x071b
        L_0x06fb:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x070e
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824347(0x7f110edb, float:1.928152E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x070e:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824349(0x7f110edd, float:1.9281523E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x071b:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824348(0x7f110edc, float:1.9281521E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0728:
            if (r15 != 0) goto L_0x074f
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x072f
            goto L_0x074f
        L_0x072f:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x0742
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824327(0x7f110ec7, float:1.9281479E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0742:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824329(0x7f110ec9, float:1.9281483E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x074f:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824328(0x7f110ec8, float:1.928148E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x075c:
            if (r15 != 0) goto L_0x0783
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x0763
            goto L_0x0783
        L_0x0763:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x0776
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824360(0x7f110ee8, float:1.9281546E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0776:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824362(0x7f110eea, float:1.928155E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0783:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824361(0x7f110ee9, float:1.9281548E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0790:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131830991(0x7f1128cf, float:1.9294995E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x079d:
            if (r15 != 0) goto L_0x07c4
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x07a4
            goto L_0x07c4
        L_0x07a4:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x07b7
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824342(0x7f110ed6, float:1.928151E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x07b7:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824344(0x7f110ed8, float:1.9281513E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x07c4:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824343(0x7f110ed7, float:1.9281511E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x07d1:
            android.content.Intent r8 = r10.getIntent()
            java.lang.String r9 = "share_card_username"
            java.lang.String r8 = r8.getStringExtra(r9)
            android.content.Intent r9 = r10.getIntent()
            java.lang.String r13 = "share_card_nickname"
            java.lang.String r9 = r9.getStringExtra(r13)
            java.lang.String r8 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.m82681J(r8, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x080b
            android.content.Intent r8 = r10.getIntent()
            java.lang.String r9 = "source_from_user_name"
            java.lang.String r8 = r8.getStringExtra(r9)
            android.content.Intent r9 = r10.getIntent()
            java.lang.String r13 = "source_from_nick_name"
            java.lang.String r9 = r9.getStringExtra(r13)
            java.lang.String r8 = com.tencent.p014mm.plugin.profile.p088ui.NormalProfileHeaderPreference.m82681J(r8, r9)
        L_0x080b:
            if (r15 != 0) goto L_0x0868
            int r9 = r11.f149526Z
            if (r9 <= r14) goto L_0x0812
            goto L_0x0868
        L_0x0812:
            boolean r9 = r11.mo62927s3()
            if (r9 == 0) goto L_0x0840
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x0827
            r8 = 2131824330(0x7f110eca, float:1.9281485E38)
            java.lang.String r8 = r10.getString(r8)
            goto L_0x0a13
        L_0x0827:
            di3.d r9 = di3.C86312j.m106911c(r5)
            ny.h r9 = (p629ny.C76979h) r9
            r11 = 2131824331(0x7f110ecb, float:1.9281487E38)
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r15 = 0
            r14[r15] = r8
            java.lang.String r8 = r10.getString(r11, r14)
            android.text.SpannableString r8 = r9.mo107057T1(r10, r8)
            goto L_0x0a13
        L_0x0840:
            r13 = 1
            r15 = 0
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x0855
            r9 = 2131824334(0x7f110ece, float:1.9281493E38)
            java.lang.Object[] r11 = new java.lang.Object[r13]
            r11[r15] = r8
            java.lang.String r8 = r10.getString(r9, r11)
            goto L_0x0a13
        L_0x0855:
            di3.d r8 = di3.C86312j.m106911c(r5)
            ny.h r8 = (p629ny.C76979h) r8
            r9 = 2131824335(0x7f110ecf, float:1.9281495E38)
            java.lang.String r9 = r10.getString(r9)
            android.text.SpannableString r8 = r8.mo107057T1(r10, r9)
            goto L_0x0a13
        L_0x0868:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x0877
            r8 = 2131824333(0x7f110ecd, float:1.928149E38)
            java.lang.String r8 = r10.getString(r8)
            goto L_0x0a13
        L_0x0877:
            di3.d r9 = di3.C86312j.m106911c(r5)
            ny.h r9 = (p629ny.C76979h) r9
            r11 = 2131824332(0x7f110ecc, float:1.9281489E38)
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r13 = 0
            r14[r13] = r8
            java.lang.String r8 = r10.getString(r11, r14)
            android.text.SpannableString r8 = r9.mo107057T1(r10, r8)
            goto L_0x0a13
        L_0x0890:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131830280(0x7f112608, float:1.9293553E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x089d:
            if (r15 != 0) goto L_0x08c4
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x08a4
            goto L_0x08c4
        L_0x08a4:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x08b7
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824357(0x7f110ee5, float:1.928154E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x08b7:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824359(0x7f110ee7, float:1.9281544E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x08c4:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824358(0x7f110ee6, float:1.9281542E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x08d1:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824341(0x7f110ed5, float:1.9281507E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x08de:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824340(0x7f110ed4, float:1.9281505E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x08eb:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824345(0x7f110ed9, float:1.9281515E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x08f8:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824350(0x7f110ede, float:1.9281525E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0905:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824325(0x7f110ec5, float:1.9281475E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0912:
            if (r15 != 0) goto L_0x0939
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x0919
            goto L_0x0939
        L_0x0919:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x092c
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824363(0x7f110eeb, float:1.9281552E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x092c:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824365(0x7f110eed, float:1.9281556E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0939:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824364(0x7f110eec, float:1.9281554E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0946:
            com.tencent.mm.storage.n3 r8 = fd0.C75743h.wx0()
            com.tencent.mm.storage.m3 r8 = r8.mo101187Ow(r13)
            java.lang.String r8 = r8.field_chatroomName
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 == 0) goto L_0x095a
            java.lang.String r8 = r11.mo73950B2()
        L_0x095a:
            java.lang.Class<f62.k0> r9 = f62.C75700k0.class
            k40.a r9 = f40.C86709a0.m107533q(r9)
            f62.k0 r9 = (f62.C75700k0) r9
            com.tencent.mm.storage.u3 r9 = r9.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r9.get(r8)
            if (r8 == 0) goto L_0x098f
            java.lang.String r9 = r8.getUsername()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0977
            goto L_0x098f
        L_0x0977:
            java.lang.String r9 = r8.getNickname()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x098a
            java.lang.String r8 = r8.getUsername()
            java.lang.String r8 = eb0.C45612m0.m50698o(r8)
            goto L_0x0990
        L_0x098a:
            java.lang.String r8 = r8.getNickname()
            goto L_0x0990
        L_0x098f:
            r8 = 0
        L_0x0990:
            if (r15 != 0) goto L_0x09bb
            int r9 = r11.f149526Z
            if (r9 <= r14) goto L_0x0997
            goto L_0x09bb
        L_0x0997:
            boolean r9 = r11.mo62927s3()
            if (r9 == 0) goto L_0x09af
            android.content.res.Resources r9 = r10.getResources()
            r10 = 2131824338(0x7f110ed2, float:1.9281501E38)
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r11 = 0
            r13[r11] = r8
            java.lang.String r8 = r9.getString(r10, r13)
            goto L_0x0a13
        L_0x09af:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824336(0x7f110ed0, float:1.9281497E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x09bb:
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x09cf
            r9 = 2131824339(0x7f110ed3, float:1.9281503E38)
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r11 = 0
            r13[r11] = r8
            java.lang.String r8 = r10.getString(r9, r13)
            goto L_0x0a13
        L_0x09cf:
            r8 = 2131824337(0x7f110ed1, float:1.92815E38)
            java.lang.String r8 = r10.getString(r8)
            goto L_0x0a13
        L_0x09d7:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131830281(0x7f112609, float:1.9293555E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x09e3:
            if (r15 != 0) goto L_0x0a08
            int r8 = r11.f149526Z
            if (r8 <= r14) goto L_0x09ea
            goto L_0x0a08
        L_0x09ea:
            boolean r8 = r11.mo62927s3()
            if (r8 == 0) goto L_0x09fc
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824354(0x7f110ee2, float:1.9281534E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x09fc:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824356(0x7f110ee4, float:1.9281538E38)
            java.lang.String r8 = r8.getString(r9)
            goto L_0x0a13
        L_0x0a08:
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131824355(0x7f110ee3, float:1.9281536E38)
            java.lang.String r8 = r8.getString(r9)
        L_0x0a13:
            r6.mo7741E(r8)
            r9 = 2
            r6.f121254p0 = r9
            android.widget.TextView r10 = r6.f121238J
            if (r10 == 0) goto L_0x0a20
            r10.setMaxLines(r9)
        L_0x0a20:
            r9 = 0
            r6.f121240L = r9
            com.tencent.mm.ui.MMActivity r9 = r1.f202419d
            android.content.res.Resources r10 = r9.getResources()
            r11 = 2131165591(0x7f070197, float:1.7945403E38)
            float r10 = r10.getDimension(r11)
            int r10 = (int) r10
            int r9 = kg3.C76577a.m92152c(r9, r10)
            float r9 = (float) r9
            com.tencent.mm.ui.MMActivity r10 = r1.f202419d
            float r10 = kg3.C76577a.m92165p(r10)
            float r9 = r9 * r10
            r6.f121253Z = r9
            r9 = 8
            r6.mo69921C(r9)
            boolean r6 = r35.mo62927s3()
            r9 = 14
            java.lang.String r10 = "Contact_Scene"
            if (r6 != 0) goto L_0x0a70
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r8)
            if (r6 != 0) goto L_0x0a70
            com.tencent.mm.ui.MMActivity r6 = r1.f202419d
            android.content.Intent r6 = r6.getIntent()
            r8 = -1
            int r6 = r6.getIntExtra(r10, r8)
            if (r6 != r9) goto L_0x0a64
            r6 = 1
            goto L_0x0a65
        L_0x0a64:
            r6 = 0
        L_0x0a65:
            if (r6 == 0) goto L_0x0a6e
            boolean r6 = r33.mo96536g()
            if (r6 != 0) goto L_0x0a6e
            goto L_0x0a70
        L_0x0a6e:
            r6 = 0
            goto L_0x0a71
        L_0x0a70:
            r6 = 1
        L_0x0a71:
            r2.mo72529n(r4, r6)
            java.lang.String r4 = "contact_profile_label"
            com.tencent.mm.ui.base.preference.Preference r6 = r2.mo72519a(r4)
            com.tencent.mm.pluginsdk.ui.preference.LabelPreference r6 = (com.tencent.p014mm.pluginsdk.p133ui.preference.LabelPreference) r6
            r6.f212406J = r12
            boolean r8 = r35.mo62927s3()
            if (r8 != 0) goto L_0x0ac2
            com.tencent.mm.storage.z1 r8 = r6.f212406J
            java.lang.String r8 = r8.mo73978v2()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r13 != 0) goto L_0x0aa0
            eb0.c r13 = eb0.C97625j3.m125812b()
            g62.s r13 = r13.mo105880F()
            com.tencent.mm.storage.a5 r13 = (com.tencent.p014mm.storage.C44651a5) r13
            com.tencent.mm.storage.z4 r8 = r13.mo69630Lo(r8)
            r6.f212410N = r8
        L_0x0aa0:
            com.tencent.mm.storage.z4 r8 = r6.f212410N
            if (r8 == 0) goto L_0x0ac2
            long r13 = r8.systemRowid
            r18 = 0
            int r8 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r8 >= 0) goto L_0x0ac2
            eb0.c r8 = eb0.C97625j3.m125812b()
            g62.s r8 = r8.mo105880F()
            com.tencent.mm.storage.z1 r13 = r6.f212406J
            java.lang.String r13 = r13.getUsername()
            com.tencent.mm.storage.a5 r8 = (com.tencent.p014mm.storage.C44651a5) r8
            com.tencent.mm.storage.z4 r8 = r8.mo69630Lo(r13)
            r6.f212410N = r8
        L_0x0ac2:
            com.tencent.mm.storage.z1 r8 = r6.f212406J
            boolean r8 = r8.mo62927s3()
            if (r8 == 0) goto L_0x0ad7
            com.tencent.mm.storage.z1 r8 = r6.f212406J
            java.lang.String r8 = r8.mo73974r2()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0ad7
            goto L_0x0ae3
        L_0x0ad7:
            com.tencent.mm.storage.z4 r6 = r6.f212410N
            if (r6 == 0) goto L_0x0ae7
            java.lang.String r6 = r6.field_contactLabels
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0ae7
        L_0x0ae3:
            r6 = 1
            r16 = 1
            goto L_0x0aea
        L_0x0ae7:
            r6 = 1
            r16 = 0
        L_0x0aea:
            r8 = r16 ^ 1
            r2.mo72529n(r4, r8)
            java.lang.String r4 = "contact_profile_phone"
            com.tencent.mm.ui.base.preference.Preference r6 = r2.mo72519a(r4)
            com.tencent.mm.pluginsdk.ui.preference.PhoneNumPreference r6 = (com.tencent.p014mm.pluginsdk.p133ui.preference.PhoneNumPreference) r6
            r6.f24041M = r2
            com.tencent.mm.ui.MMActivity r8 = r1.f202419d
            android.content.Intent r8 = r8.getIntent()
            r6.mo7607I(r8, r12)
            r6.mo7608J()
            r8 = 8
            r6.mo69921C(r8)
            java.lang.String r6 = "contact_profile_desc"
            com.tencent.mm.ui.base.preference.Preference r8 = r2.mo72519a(r6)
            com.tencent.mm.pluginsdk.ui.preference.ProfileDescribePreference r8 = (com.tencent.p014mm.pluginsdk.p133ui.preference.ProfileDescribePreference) r8
            r8.f212451K = r12
            boolean r13 = r35.mo62927s3()
            if (r13 != 0) goto L_0x0b58
            com.tencent.mm.storage.z1 r13 = r8.f212451K
            java.lang.String r13 = r13.mo73978v2()
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 != 0) goto L_0x0b36
            eb0.c r14 = eb0.C97625j3.m125812b()
            g62.s r14 = r14.mo105880F()
            com.tencent.mm.storage.a5 r14 = (com.tencent.p014mm.storage.C44651a5) r14
            com.tencent.mm.storage.z4 r13 = r14.mo69630Lo(r13)
            r8.f212453M = r13
        L_0x0b36:
            com.tencent.mm.storage.z4 r13 = r8.f212453M
            if (r13 == 0) goto L_0x0b58
            long r13 = r13.systemRowid
            r18 = 0
            int r15 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r15 >= 0) goto L_0x0b58
            eb0.c r13 = eb0.C97625j3.m125812b()
            g62.s r13 = r13.mo105880F()
            com.tencent.mm.storage.z1 r14 = r8.f212451K
            java.lang.String r14 = r14.getUsername()
            com.tencent.mm.storage.a5 r13 = (com.tencent.p014mm.storage.C44651a5) r13
            com.tencent.mm.storage.z4 r13 = r13.mo69630Lo(r14)
            r8.f212453M = r13
        L_0x0b58:
            boolean r8 = r8.mo100738I()
            r13 = 1
            r8 = r8 ^ r13
            r2.mo72529n(r6, r8)
            boolean r6 = r35.mo62927s3()
            java.lang.String r8 = "contact_info_signature"
            if (r6 != 0) goto L_0x0bc6
            java.lang.String r6 = r12.f149516U
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x0bc6
            com.tencent.mm.ui.base.preference.Preference r6 = r2.mo72519a(r8)
            com.tencent.mm.ui.base.preference.KeyValuePreference r6 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r6
            if (r6 == 0) goto L_0x0bc9
            com.tencent.mm.ui.MMActivity r8 = r1.f202419d
            android.content.res.Resources r13 = r8.getResources()
            float r11 = r13.getDimension(r11)
            int r11 = (int) r11
            int r8 = kg3.C76577a.m92152c(r8, r11)
            float r8 = (float) r8
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            float r11 = kg3.C76577a.m92165p(r11)
            float r8 = r8 * r11
            r6.f121253Z = r8
            r8 = 0
            r6.f121240L = r8
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            r13 = 2131824313(0x7f110eb9, float:1.928145E38)
            java.lang.String r11 = r11.getString(r13)
            r6.mo69924H(r11)
            di3.d r5 = di3.C86312j.m106911c(r5)
            ny.h r5 = (p629ny.C76979h) r5
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            java.lang.String r13 = r12.f149516U
            android.text.SpannableString r5 = r5.mo107057T1(r11, r13)
            r6.mo7741E(r5)
            r6.mo69912I(r8)
            r5 = 5
            r6.f121254p0 = r5
            android.widget.TextView r8 = r6.f121238J
            if (r8 == 0) goto L_0x0bc0
            r8.setMaxLines(r5)
        L_0x0bc0:
            r5 = 8
            r6.mo69921C(r5)
            goto L_0x0bc9
        L_0x0bc6:
            r2.mo72531o(r8)
        L_0x0bc9:
            r33.mo96552v(r34, r35)
            java.lang.String r5 = "contact_profile_info_more"
            com.tencent.mm.ui.base.preference.Preference r6 = r2.mo72519a(r5)
            com.tencent.mm.ui.MMActivity r8 = r1.f202419d
            r11 = 2131824215(0x7f110e57, float:1.9281252E38)
            java.lang.CharSequence r8 = r8.getText(r11)
            java.lang.String r8 = r8.toString()
            r6.mo69924H(r8)
            java.lang.String r6 = "contact_profile_hint"
            com.tencent.mm.ui.base.preference.Preference r8 = r2.mo72519a(r6)
            com.tencent.mm.ui.base.preference.TextPreference r8 = (com.tencent.p014mm.p136ui.base.preference.TextPreference) r8
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            r13 = 2131824220(0x7f110e5c, float:1.9281262E38)
            java.lang.CharSequence r11 = r11.getText(r13)
            r8.f215116K = r11
            r8.f215115J = r7
            android.widget.TextView r7 = r8.f215117L
            if (r7 != 0) goto L_0x0bfc
            goto L_0x0c06
        L_0x0bfc:
            r7.setText(r11)
            android.widget.TextView r7 = r8.f215117L
            int r8 = r8.f215115J
            r7.setGravity(r8)
        L_0x0c06:
            boolean r7 = r35.mo62920o3()
            if (r7 == 0) goto L_0x0c11
            r7 = 0
            r2.mo72529n(r6, r7)
            goto L_0x0c15
        L_0x0c11:
            r7 = 1
            r2.mo72529n(r6, r7)
        L_0x0c15:
            java.lang.String r6 = "contact_profile_multi_button"
            com.tencent.mm.ui.base.preference.Preference r7 = r2.mo72519a(r6)
            com.tencent.mm.plugin.profile.ui.MultiButtonPreference r7 = (com.tencent.p014mm.plugin.profile.p088ui.MultiButtonPreference) r7
            r1.f202434v = r7
            boolean r7 = r33.mo96534e()
            if (r7 == 0) goto L_0x0c3b
            com.tencent.mm.plugin.profile.ui.MultiButtonPreference r7 = r1.f202434v
            com.tencent.mm.ui.MMActivity r8 = r1.f202419d
            r11 = 2131824149(0x7f110e15, float:1.9281118E38)
            java.lang.String r8 = r8.getString(r11)
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$j r11 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$j
            r11.<init>(r1)
            r7.f20206J = r8
            r7.f20208L = r11
            goto L_0x0cbd
        L_0x0c3b:
            boolean r7 = r33.mo96536g()
            r8 = 2131822644(0x7f110834, float:1.9278065E38)
            if (r7 != 0) goto L_0x0c86
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            boolean r7 = r7.mo62927s3()
            if (r7 != 0) goto L_0x0c5e
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r11 = "CONTACT_INFO_UI_SOURCE"
            r13 = 0
            int r7 = r7.getIntExtra(r11, r13)
            r11 = 2
            if (r7 != r11) goto L_0x0c5e
            r7 = 1
            goto L_0x0c5f
        L_0x0c5e:
            r7 = 0
        L_0x0c5f:
            if (r7 == 0) goto L_0x0c62
            goto L_0x0c86
        L_0x0c62:
            boolean r7 = r35.mo62920o3()
            if (r7 != 0) goto L_0x0c74
            boolean r7 = r33.mo96541k()
            if (r7 != 0) goto L_0x0c74
            boolean r7 = r33.mo96535f()
            if (r7 == 0) goto L_0x0cbd
        L_0x0c74:
            com.tencent.mm.plugin.profile.ui.MultiButtonPreference r7 = r1.f202434v
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            java.lang.String r8 = r11.getString(r8)
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$m r11 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$m
            r11.<init>()
            r7.f20206J = r8
            r7.f20208L = r11
            goto L_0x0cbd
        L_0x0c86:
            com.tencent.mm.plugin.profile.ui.MultiButtonPreference r7 = r1.f202434v
            com.tencent.mm.storage.z1 r11 = r1.f202420e
            boolean r11 = r11.mo62920o3()
            if (r11 == 0) goto L_0x0c9a
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            r13 = 2131824221(0x7f110e5d, float:1.9281264E38)
            java.lang.String r11 = r11.getString(r13)
            goto L_0x0ca3
        L_0x0c9a:
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            r13 = 2131824216(0x7f110e58, float:1.9281254E38)
            java.lang.String r11 = r11.getString(r13)
        L_0x0ca3:
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$k r13 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$k
            r13.<init>()
            r7.f20206J = r11
            r7.f20208L = r13
            com.tencent.mm.plugin.profile.ui.MultiButtonPreference r7 = r1.f202434v
            com.tencent.mm.ui.MMActivity r11 = r1.f202419d
            java.lang.String r8 = r11.getString(r8)
            com.tencent.mm.plugin.profile.NewContactWidgetNormal$l r11 = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$l
            r11.<init>()
            r7.f20207K = r8
            r7.f20209M = r11
        L_0x0cbd:
            boolean r7 = r33.mo96537h()
            if (r7 != 0) goto L_0x0ce7
            boolean r7 = r35.mo62927s3()
            if (r7 == 0) goto L_0x0ccf
            boolean r7 = r35.mo62920o3()
            if (r7 == 0) goto L_0x0ce7
        L_0x0ccf:
            boolean r7 = r33.mo96536g()
            if (r7 != 0) goto L_0x0cee
            com.tencent.mm.ui.MMActivity r7 = r1.f202419d
            android.content.Intent r7 = r7.getIntent()
            r8 = -1
            int r7 = r7.getIntExtra(r10, r8)
            if (r7 != r9) goto L_0x0ce4
            r7 = 1
            goto L_0x0ce5
        L_0x0ce4:
            r7 = 0
        L_0x0ce5:
            if (r7 == 0) goto L_0x0cee
        L_0x0ce7:
            r7 = 1
            r2.mo72529n(r6, r7)
            r33.mo96551u(r34)
        L_0x0cee:
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            boolean r7 = r7.mo62927s3()
            java.lang.String r8 = "contact_profile_voip"
            if (r7 == 0) goto L_0x0d23
            boolean r7 = r33.mo96536g()
            if (r7 != 0) goto L_0x0d23
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            boolean r7 = r7.mo62932t3()
            if (r7 != 0) goto L_0x0d23
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            java.lang.String r7 = r7.getUsername()
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85811N4(r7)
            if (r7 == 0) goto L_0x0d13
            goto L_0x0d23
        L_0x0d13:
            r7 = r21
            r9 = 0
            r2.mo72529n(r7, r9)
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            boolean r7 = r7.mo62920o3()
            r2.mo72529n(r8, r7)
            goto L_0x0d36
        L_0x0d23:
            r7 = r21
            com.tencent.mm.storage.z1 r9 = r1.f202420e
            boolean r9 = r9.mo62932t3()
            if (r9 != 0) goto L_0x0d32
            r9 = 1
            r2.mo72529n(r7, r9)
            goto L_0x0d33
        L_0x0d32:
            r9 = 1
        L_0x0d33:
            r2.mo72529n(r8, r9)
        L_0x0d36:
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            boolean r7 = r7.mo62927s3()
            if (r7 != 0) goto L_0x0d90
            boolean r7 = r33.mo96536g()
            if (r7 != 0) goto L_0x0d90
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            boolean r7 = r7.mo62932t3()
            if (r7 != 0) goto L_0x0d90
            boolean r7 = r33.mo96541k()
            if (r7 != 0) goto L_0x0d90
            boolean r7 = r33.mo96535f()
            if (r7 != 0) goto L_0x0d90
            boolean r7 = r33.mo96539j()
            if (r7 != 0) goto L_0x0d90
            boolean r7 = r33.mo96538i()
            if (r7 == 0) goto L_0x0d65
            goto L_0x0d90
        L_0x0d65:
            r7 = r20
            r9 = 0
            r2.mo72529n(r7, r9)
            r2.mo72529n(r0, r9)
            r7 = 1
            r2.mo72529n(r3, r7)
            r2.mo72529n(r4, r7)
            r2.mo72529n(r5, r7)
            if (r26 == 0) goto L_0x0d96
            boolean r4 = r1.f202426n
            if (r4 == 0) goto L_0x0d87
            r4 = 2131235711(0x7f08137f, float:1.8087624E38)
            r7 = r26
            r7.mo101916J(r4)
            goto L_0x0d96
        L_0x0d87:
            r7 = r26
            r4 = 2131234785(0x7f080fe1, float:1.8085746E38)
            r7.mo101916J(r4)
            goto L_0x0d96
        L_0x0d90:
            r7 = r20
            r4 = 1
            r2.mo72529n(r7, r4)
        L_0x0d96:
            r4 = 0
            r1.mo96542l(r2, r12, r4)
            boolean r4 = r33.mo96536g()
            java.lang.String r7 = "contact_profile_say_hi"
            if (r4 != 0) goto L_0x0dc9
            boolean r4 = r35.mo62927s3()
            if (r4 != 0) goto L_0x0dc9
            com.tencent.mm.storage.z1 r4 = r1.f202420e
            java.lang.String r4 = r4.getUsername()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85811N4(r4)
            if (r4 != 0) goto L_0x0dc0
            boolean r4 = r33.mo96541k()
            if (r4 != 0) goto L_0x0dc0
            boolean r4 = r33.mo96535f()
            if (r4 == 0) goto L_0x0dc9
        L_0x0dc0:
            r4 = 1
            r2.mo72529n(r5, r4)
            r9 = 0
            r2.mo72529n(r7, r9)
            goto L_0x0ddb
        L_0x0dc9:
            r4 = 1
            r9 = 0
            r2.mo72529n(r7, r4)
            boolean r7 = r35.mo62927s3()
            if (r7 != 0) goto L_0x0dd8
            r2.mo72529n(r5, r4)
            goto L_0x0ddb
        L_0x0dd8:
            r2.mo72529n(r5, r9)
        L_0x0ddb:
            com.tencent.mm.storage.z1 r7 = r1.f202420e
            java.lang.String r7 = r7.getUsername()
            boolean r7 = eb0.C75592q0.m90764L(r7)
            if (r7 == 0) goto L_0x0e06
            r2.mo72529n(r6, r4)
            r33.mo96551u(r34)
            java.lang.String r6 = r12.f149516U
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r2.mo72529n(r5, r6)
            r2.mo72529n(r0, r4)
            r2.mo72529n(r3, r4)
            r2.mo72529n(r8, r4)
            df2.g r0 = r1.f202430r
            com.tencent.mm.ui.MMActivity r0 = r0.f221633d
            r0.removeAllOptionMenu()
        L_0x0e06:
            com.tencent.mm.storage.z1 r0 = r1.f202420e
            r1.mo96533d(r2, r0)
            pj3.g r0 = r1.f202421f
            r1.mo96549s(r0)
            com.tencent.mm.ui.MMActivity r0 = r1.f202419d
            pj3.g r3 = r1.f202421f
            r1.mo96546p(r0, r3, r12)
            pj3.g r0 = r1.f202421f
            r1.mo96550t(r0)
            com.tencent.mm.storage.z1 r0 = r1.f202420e
            r1.mo96554z(r2, r0)
            pj3.g r0 = r1.f202421f
            r1.mo96553w(r0, r12)
            r33.mo96545o()
            boolean r0 = r1.f202427o
            if (r0 != 0) goto L_0x0e38
            r2 = 4
            com.tencent.mm.ui.MMActivity r0 = r1.f202419d
            r1.mo96531b(r2, r0)
            r2 = 1
            r1.f202427o = r2
            goto L_0x0e39
        L_0x0e38:
            r2 = 1
        L_0x0e39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.NewContactWidgetNormal.mo5961x(pj3.g, com.tencent.mm.storage.z1, boolean, int):boolean");
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        FinderContact finderContact;
        String str2;
        int i;
        int i2;
        String str3 = str;
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_set_default_chatonly;
        Class cls = C32735h.class;
        Class cls2 = C11502f.class;
        Class cls3 = C60200t1.class;
        if (str3.equals("contact_profile_sns")) {
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(this.f202419d, (View) null);
            } else {
                C42599h.xx0(this.f202419d.getIntent(), 3, 1, this.f202420e.getUsername());
                boolean z = this.f202419d.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0) != 12;
                Intent intent = this.f202419d.getIntent();
                intent.putExtra("sns_source", this.f202419d.getIntent().getIntExtra("Sns_from_Scene", 0));
                if (!C72996z1.m85843n5(this.f202420e.getUsername()) || (((C32415b) C86312j.m106911c(C32415b.class)).Ax0().mo60611Lo(this.f202420e.getUsername()) & 2) > 0) {
                    intent.putExtra("sns_signature", this.f202420e.f149516U);
                }
                intent.putExtra("sns_nickName", this.f202420e.mo62909j3());
                intent.putExtra("sns_title", this.f202420e.mo62898f());
                intent.putExtra("sns_rpt_scene", C42599h.vx0(this.f202419d.getIntent()));
                if (C99019x.m128970b() == null || !z) {
                    intent.putExtra("sns_userName", this.f202420e.getUsername());
                } else {
                    ((C5431p1.C5432a) C99019x.m128970b()).mo6416g(intent, this.f202420e.getUsername());
                }
                C88144b.m109791i(this.f202419d, "sns", ".ui.SnsUserUI", intent, (Bundle) null);
                if ((intent.getFlags() & 67108864) != 0) {
                    this.f202419d.finish();
                }
                C77101h hVar = (C77101h) this.f202421f.mo72519a("contact_profile_sns");
                if (hVar != null) {
                    SnsReportHelper.f275506m0.mo131341B().f266215g = (long) hVar.mo107418a();
                }
            }
        } else if (str3.equals("contact_profile_label") || str3.equals("contact_profile_desc") || str3.equals("contact_profile_phone") || str3.equals("contact_profile_setting_desc")) {
            C72996z1 z1Var = this.f202420e;
            if (z1Var == null) {
                Log.m105920e("MicroMsg.NewContactWidgetNormal", "contact is null");
            } else if (z1Var.mo62927s3()) {
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_Scene", this.f202422g);
                intent2.putExtra("Contact_User", z1Var.getUsername());
                intent2.putExtra("Contact_RoomNickname", this.f202419d.getIntent().getStringExtra("Contact_RoomNickname"));
                intent2.putExtra("view_mode", true);
                intent2.putExtra("contact_phone_number_by_md5", ((PhoneNumPreference) this.f202421f.mo72519a("contact_profile_phone")).f24039K);
                intent2.putExtra("contact_phone_number_list", z1Var.f149525Y0);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93175h(intent2, this.f202419d);
            } else if (!Util.isNullOrNil(z1Var.mo73978v2())) {
                mo96526A(z1Var.mo73978v2(), z1Var);
            } else {
                mo96526A(z1Var.getUsername(), z1Var);
            }
            if (str3.equals("contact_profile_setting_desc")) {
                C42599h.xx0(this.f202419d.getIntent(), 2, 1, this.f202420e.getUsername());
                return true;
            }
        } else if (str3.equals("contact_profile_setting_permission")) {
            Intent intent3 = new Intent(this.f202419d, ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 0) == 0 ? PermissionSettingUI.class : PermissionSettingUI2.class);
            intent3.putExtra("sns_permission_userName", this.f202420e.getUsername());
            intent3.putExtra("CONTACT_INFO_UI_SOURCE", this.f202419d.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0));
            intent3.putExtra("sns_permission_anim", true);
            intent3.putExtra("sns_permission_block_scene", 1);
            MMActivity mMActivity = this.f202419d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent3);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (str3.equals("contact_profile_power")) {
            C75381g gVar = this.f202430r;
            if (gVar != null) {
                gVar.mo105720d();
            }
        } else if (str3.equals("contact_profile_send")) {
            C72996z1 z1Var2 = this.f202420e;
            Class cls4 = C79063g.class;
            if (Util.nullAs(Boolean.valueOf(C45628s0.m50743H(z1Var2.getUsername())), false)) {
                String username = z1Var2.getUsername();
                Intent intent4 = new Intent();
                intent4.addFlags(67108864);
                C79063g gVar2 = (C79063g) C39818r.f106831a.mo62444c(this.f202419d).mo75002a(cls4);
                if (gVar2 != null ? gVar2.f232169d : false) {
                    i2 = 1;
                    intent4.putExtra("finish_direct", true);
                } else {
                    i2 = 1;
                }
                if (this.f202423h) {
                    intent4.putExtra("Chat_User", username);
                    intent4.putExtra("Chat_Mode", i2);
                    this.f202419d.setResult(-1, intent4);
                } else {
                    intent4.putExtra("Chat_User", username);
                    intent4.putExtra("Chat_Mode", i2);
                    intent4.setClassName(this.f202419d, "com.tencent.mm.ui.chatting.ChattingUI");
                    MMActivity mMActivity3 = this.f202419d;
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(intent4);
                    C117292a.m165358d(mMActivity3, aVar2.mo10232b(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "dealSendToGroupCardEvent", "(Lcom/tencent/mm/storage/Contact;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity3.startActivity((Intent) aVar2.mo10231a(0));
                    C117292a.m165359e(mMActivity3, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "dealSendToGroupCardEvent", "(Lcom/tencent/mm/storage/Contact;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else {
                Intent intent5 = new Intent();
                intent5.addFlags(67108864);
                C79063g gVar3 = (C79063g) C39818r.f106831a.mo62444c(this.f202419d).mo75002a(cls4);
                if (gVar3 != null ? gVar3.f232169d : false) {
                    i = 1;
                    intent5.putExtra("finish_direct", true);
                } else {
                    i = 1;
                }
                if (this.f202423h) {
                    intent5.putExtra("Chat_User", z1Var2.getUsername());
                    intent5.putExtra("Chat_Mode", i);
                    this.f202419d.setResult(-1, intent5);
                } else {
                    intent5.putExtra("Chat_User", z1Var2.getUsername());
                    intent5.putExtra("Chat_Mode", i);
                    intent5.setClassName(this.f202419d, "com.tencent.mm.ui.chatting.ChattingUI");
                    MMActivity mMActivity4 = this.f202419d;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent5);
                    C117292a.m165358d(mMActivity4, aVar3.mo10232b(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "dealSendEvent", "(Lcom/tencent/mm/storage/Contact;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity4.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(mMActivity4, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "dealSendEvent", "(Lcom/tencent/mm/storage/Contact;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            C42599h.xx0(this.f202419d.getIntent(), 4, 1, this.f202420e.getUsername());
        } else if (str3.equals("contact_profile_voip")) {
            C72996z1 z1Var3 = this.f202420e;
            VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new VoipCheckIsDeviceUsingEvent();
            voipCheckIsDeviceUsingEvent.publish();
            C42599h.xx0(this.f202419d.getIntent(), 5, 1, this.f202420e.getUsername());
            if (!z1Var3.getUsername().equals(voipCheckIsDeviceUsingEvent.f194014d.f194018d)) {
                VoipCheckIsDeviceUsingEvent.C67817a aVar4 = voipCheckIsDeviceUsingEvent.f194014d;
                if (aVar4.f194016b || aVar4.f194017c) {
                    Toast.makeText(this.f202419d, aVar4.f194015a ? C0966R.string.auy : C0966R.string.auz, 0).show();
                    Log.m105924i("MicroMsg.NewContactWidgetNormal", "voip is running, can't do this");
                }
            }
            if (!C61104a.m71665u(this.f202419d) && !C61104a.m71649e(this.f202419d) && !C61104a.m71656l(this.f202419d, true)) {
                TalkRoomServerEvent talkRoomServerEvent = new TalkRoomServerEvent();
                talkRoomServerEvent.f154883d.f154885a = true;
                talkRoomServerEvent.publish();
                String str4 = talkRoomServerEvent.f154884e.f154887a;
                if (!Util.isNullOrNil(str4)) {
                    Log.m105926v("MicroMsg.NewContactWidgetNormal", "Talkroom is on: " + str4);
                    MMActivity mMActivity5 = this.f202419d;
                    C76879j.m92707A(mMActivity5, mMActivity5.getString(C0966R.string.jt9), "", this.f202419d.getString(C0966R.string.a18), this.f202419d.getString(C0966R.string.f7926wf), new C70138c(this, z1Var3), new C70139d(this));
                } else {
                    mo96544n(z1Var3, this.f202419d);
                }
            }
        } else if (str3.equals("contact_profile_add_contact")) {
            boolean booleanExtra = this.f202419d.getIntent().getBooleanExtra("Contact_Conversation_IsExpireTimeAndOpenIm", false);
            Log.m105925i("MicroMsg.NewContactWidgetNormal", "needShowExpiredTimeToast = %s, showVerfying = %s.", Boolean.valueOf(booleanExtra), Boolean.valueOf(this.f202426n));
            if (booleanExtra) {
                MMActivity mMActivity6 = this.f202419d;
                Toast.makeText(mMActivity6, mMActivity6.getResources().getString(C0966R.string.m27), 0).show();
            } else if (!this.f202426n) {
                mo96530a(this.f202419d, this.f202420e, this.f202422g, false);
            }
        } else if (str3.equals("contact_profile_accept_contact")) {
            MMActivity mMActivity7 = this.f202419d;
            C72996z1 z1Var4 = this.f202420e;
            mMActivity7.getIntent().removeExtra("Accept_NewFriend_FromOutside");
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(cVar, 2);
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_add_friends_without_choose_permission_threshold, 5000);
            Class cls5 = SayHiWithSnsPermissionUI.class;
            if (!C72996z1.m85843n5(z1Var4.getUsername()) && Qe == 1) {
                cls5 = SayHiWithSnsPermissionUI2.class;
            } else if (!C72996z1.m85843n5(z1Var4.getUsername()) && Qe == 2 && C45628s0.m50780j() >= Qe2) {
                cls5 = SayHiWithSnsPermissionUI3.class;
            }
            Intent intent6 = new Intent(mMActivity7, cls5);
            intent6.putExtra("Contact_User", z1Var4.getUsername());
            intent6.putExtra("room_name", this.f202429q);
            intent6.putExtra("Contact_Nick", z1Var4.getNickname());
            intent6.putExtra("Contact_RemarkName", z1Var4.mo73969n2());
            int i3 = this.f202422g;
            if (i3 == 14 || i3 == 8) {
                intent6.putExtra("Contact_RoomNickname", mMActivity7.getIntent().getStringExtra("Contact_RoomNickname"));
            }
            intent6.putExtra("Contact_Scene", this.f202422g);
            intent6.putExtra("Verify_ticket", Util.nullAsNil(mMActivity7.getIntent().getStringExtra("Verify_ticket")));
            intent6.putExtra("sayhi_with_sns_perm_send_verify", false);
            intent6.putExtra("sayhi_with_sns_perm_add_remark", true);
            intent6.putExtra("sayhi_with_sns_perm_set_label", true);
            intent6.putExtra("sayhi_with_sns_permission", z1Var4.mo62943y3());
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent6);
            MMActivity mMActivity8 = mMActivity7;
            C117292a.m165358d(mMActivity8, aVar5.mo10232b(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "acceptContact", "(Landroid/content/Context;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity7.startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(mMActivity8, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "acceptContact", "(Landroid/content/Context;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C42599h.xx0(this.f202419d.getIntent(), 30, 1, this.f202420e.getUsername());
            mo96531b(1, this.f202419d);
        } else if (str3.equals("contact_profile_say_hi")) {
            C42599h.xx0(this.f202419d.getIntent(), 27, 1, this.f202420e.getUsername());
            C72996z1 z1Var5 = this.f202420e;
            Intent intent7 = new Intent();
            intent7.putExtra("Contact_User", z1Var5.getUsername());
            intent7.putExtra("Contact_Scene", this.f202422g);
            intent7.putExtra("Contact_RoomNickname", this.f202419d.getIntent().getStringExtra("Contact_RoomNickname"));
            intent7.putExtra("AntispamTicket", z1Var5.f149527Z0);
            ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93187t(intent7, this.f202419d);
        } else if (str3.equals("contact_profile_info_more")) {
            C75381g gVar4 = this.f202430r;
            if (gVar4 != null) {
                MMActivity mMActivity9 = this.f202419d;
                C72996z1 z1Var6 = this.f202420e;
                gVar4.getClass();
                Intent intent8 = new Intent();
                intent8.setClass(mMActivity9, ContactMoreInfoUI.class);
                intent8.putExtra("Is_RoomOwner", mMActivity9.getIntent().getBooleanExtra("Is_RoomOwner", false));
                intent8.putExtra("Contact_User", z1Var6.getUsername());
                String stringExtra = mMActivity9.getIntent().getStringExtra("room_name");
                if (stringExtra == null) {
                    stringExtra = mMActivity9.getIntent().getStringExtra("Contact_ChatRoomId");
                }
                intent8.putExtra("Contact_ChatRoomId", stringExtra);
                String nullAs = Util.nullAs(mMActivity9.getIntent().getStringExtra("verify_gmail"), "");
                String nullAs2 = Util.nullAs(mMActivity9.getIntent().getStringExtra("profileName"), Util.subStringEmail(nullAs));
                intent8.putExtra("verify_gmail", nullAs);
                intent8.putExtra("profileName", nullAs2);
                long longExtra = mMActivity9.getIntent().getLongExtra("Contact_Uin", 0);
                String stringExtra2 = mMActivity9.getIntent().getStringExtra("Contact_QQNick");
                intent8.putExtra("Contact_Uin", longExtra);
                intent8.putExtra("Contact_QQNick", stringExtra2);
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(intent8);
                MMActivity mMActivity10 = mMActivity9;
                C117292a.m165358d(mMActivity10, aVar6.mo10232b(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "goToMoreInfoUI", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity9.startActivity((Intent) aVar6.mo10231a(0));
                C117292a.m165359e(mMActivity10, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "goToMoreInfoUI", "(Landroid/app/Activity;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C42599h.xx0(this.f202419d.getIntent(), 6, 1, this.f202420e.getUsername());
            }
        } else if (str3.equals("contact_info_invite_source")) {
            String string = ((KeyValuePreference) this.f202421f.mo72519a("contact_info_invite_source")).mo69925c().getString("inviter");
            if (!Util.isNullOrNil(string)) {
                String c = mo96532c(this.f202428p, string);
                Intent intent9 = new Intent();
                intent9.putExtra("Contact_User", string);
                intent9.putExtra("Contact_RemarkName", c);
                intent9.putExtra("Contact_RoomNickname", c);
                intent9.putExtra("Contact_RoomMember", true);
                intent9.putExtra("room_name", this.f202429q);
                intent9.putExtra("Contact_Nick", C97625j3.m125812b().mo105907v().get(string).getNickname());
                intent9.putExtra("Contact_Scene", 14);
                intent9.putExtra("Is_RoomOwner", true);
                intent9.putExtra("Contact_ChatRoomId", this.f202429q);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls2)).mo11462yM()).mo93174g(intent9, this.f202419d);
            }
        } else if (str3.equals("contact_profile_accept_contact_by_wework")) {
            C72996z1 z1Var7 = this.f202420e;
            String nullAsNil = Util.nullAsNil(this.f202419d.getIntent().getStringExtra("Verify_ticket"));
            C67030b[] a = C70293u1.m82853a(this.f202419d, z1Var7, this.f202422g);
            String str5 = "";
            if (a.length >= 1) {
                String str6 = a[a.length - 1].f192525b;
                str5 = C70293u1.m82854b(this.f202419d, z1Var7, this.f202422g);
                str2 = str6;
            } else {
                str2 = str5;
            }
            new C58565a(z1Var7.getUsername(), nullAsNil, str5, str2).doScene(C86709a0.m107529k().f251779b.f256809d, new C57165f(this));
            C42599h.xx0(this.f202419d.getIntent(), 31, 1, this.f202420e.getUsername());
        } else if (str3.equals("contact_profile_finder")) {
            FinderPreference finderPreference = (FinderPreference) this.f202421f.mo72519a("contact_profile_finder");
            fp4 fp4 = finderPreference.f120970M;
            if (!(fp4 == null || (finderContact = fp4.f133628d) == null)) {
                String str7 = finderContact.username;
                if (!Util.isNullOrNil(str7)) {
                    Intent intent10 = new Intent();
                    intent10.putExtra("finder_username", str7);
                    intent10.putExtra("key_enter_profile_type", 14);
                    intent10.putExtra("key_extra_info", "{\"is_openimcontact\":" + (finderPreference.f120971N ? 1 : 0) + "}");
                    boolean equals = str7.equals(C75592q0.m90778h());
                    ((C60200t1) C86312j.m106911c(cls3)).mo76842e7(14, 2, equals ? 33 : 32, intent10);
                    intent10.putExtra("KEY_FINDER_SELF_FLAG", equals);
                    ((C60200t1) C86312j.m106911c(cls3)).mo76819V1(finderPreference.f121274d, intent10);
                    C115669n.INSTANCE.mo175913w(1585, 2, 1);
                }
            }
            ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83787f6(this.f202420e.getUsername());
            C42599h.xx0(this.f202419d.getIntent(), 24, 1, this.f202420e.getUsername());
            C115669n.INSTANCE.mo160131h(21908, 2, 2, 2);
            if (this.f202425j) {
                C47224a.m52531b(this.f202420e.getUsername(), 14, 0);
            }
        } else if (str3.equals("contact_profile_finder_recent_like")) {
            ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83762I5(this.f202419d, this.f202420e.getUsername(), this.f202420e.getNickname(), 79);
            C42599h.xx0(this.f202419d.getIntent(), 25, 1, this.f202420e.getUsername());
            ((C60200t1) C86312j.m106911c(cls3)).mo76861l7().mo83787f6(this.f202420e.getUsername());
        }
        return true;
    }

    /* renamed from: z */
    public final void mo96554z(C47511g gVar, C72996z1 z1Var) {
        Class cls = C32735h.class;
        boolean z = gVar.mo72522f("contact_profile_add_contact") || gVar.mo72522f("contact_profile_accept_contact");
        boolean U = C45628s0.m50756U();
        int i = z1Var.f149528a1;
        if ((i & 4) > 0) {
            if (!U) {
                if ((i & 2) > 0) {
                    this.f202433u = true;
                }
            }
            if (U) {
                if (!((i & 2) > 0)) {
                    this.f202433u = true;
                }
            }
        }
        boolean z2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_profile_contact_add_wechat_tip, 0) == 1;
        boolean z3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_profile_contact_wechat_tip, 0) == 1;
        StringBuilder sb = new StringBuilder();
        sb.append("needShowWechatTip = ");
        sb.append(this.f202433u);
        sb.append(", addWechatUser = ");
        sb.append(z2);
        sb.append(", profileWechat = ");
        sb.append(z3);
        sb.append(", contact.getExtFlag = ");
        sb.append(z1Var.f149528a1);
        sb.append(", isSelfWechatUser = ");
        sb.append(U);
        sb.append(", contact.isWeChatContact() = ");
        sb.append((z1Var.f149528a1 & 2) > 0);
        sb.append(", contact.isContactExtflagHasOverseaInfo() = ");
        sb.append((z1Var.f149528a1 & 4) > 0);
        sb.append("， isaddContact = ");
        sb.append(z);
        Log.m105924i("MicroMsg.NewContactWidgetNormal", sb.toString());
        if (this.f202433u) {
            if (z) {
                if (z2) {
                    this.f202433u = true;
                } else {
                    this.f202433u = false;
                }
            } else if (z3) {
                this.f202433u = true;
            } else {
                this.f202433u = false;
            }
            MMActivity mMActivity = this.f202419d;
            if (mMActivity != null && mMActivity.getIntent().hasExtra("Contact_Ext_Flag") && !z1Var.mo62927s3()) {
                gVar.mo72529n("line5", true);
            }
        }
    }
}
