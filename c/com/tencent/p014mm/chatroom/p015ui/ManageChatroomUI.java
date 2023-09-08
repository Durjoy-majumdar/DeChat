package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.OnlyAdminModifyTopicReportStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.newtips.NewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gc0.C20828a;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nr3.C89060f;
import p239sv.C13786m;
import p626nv.C109759g;
import p626nv.C47300f;
import p740wo.C53193b;
import pj3.C47511g;
import qo3.C101218e0;
import qo3.C77407n;
import qo3.C77426q;
import tc0.C77885p;
import te3.C48768av3;
import te3.C49065cy2;
import te3.C51163rv3;
import te3.C52310zu3;
import te3.C52326zy2;
import zt3.C119157j;

/* renamed from: com.tencent.mm.chatroom.ui.ManageChatroomUI */
public class ManageChatroomUI extends MMPreference {

    /* renamed from: s */
    public static final /* synthetic */ int f108069s = 0;

    /* renamed from: d */
    public C47511g f108070d;

    /* renamed from: e */
    public SharedPreferences f108071e = null;

    /* renamed from: f */
    public CheckBoxPreference f108072f;

    /* renamed from: g */
    public Preference f108073g;

    /* renamed from: h */
    public NewTipPreference f108074h;

    /* renamed from: i */
    public int f108075i;

    /* renamed from: j */
    public C48768av3 f108076j = null;

    /* renamed from: n */
    public CheckBoxPreference f108077n = null;

    /* renamed from: o */
    public String f108078o;

    /* renamed from: p */
    public int f108079p;

    /* renamed from: q */
    public String f108080q;

    /* renamed from: r */
    public C101218e0 f108081r = null;

    /* renamed from: H7 */
    public static void m43240H7(ManageChatroomUI manageChatroomUI) {
        C48768av3 av32 = manageChatroomUI.f108076j;
        if (av32 == null || Util.isNullOrNil((List) av32.f130782e)) {
            manageChatroomUI.f108070d.mo72529n("room_bind_app_info", true);
        } else {
            manageChatroomUI.f108070d.mo72529n("room_bind_app_info", false);
            manageChatroomUI.f108073g.mo7741E(Util.nullAsNil(manageChatroomUI.f108076j.f130782e.getFirst().f146230e));
        }
        manageChatroomUI.f108070d.notifyDataSetChanged();
    }

    /* renamed from: I7 */
    public void mo62741I7(long j, long j2) {
        ((C119157j) C119157j.f356862d).mo183875f(new ManageChatroomUI$$b(this, j, j2));
    }

    public int getResourceId() {
        return C0966R.xml.f8916ba;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2) {
                Log.m105925i("MicroMsg.ManageChatroomUI", "[onActivityResult] requestCode:%s", 2);
            }
        } else if (intent != null) {
            int intExtra = intent.getIntExtra("into_room_type", -1);
            Log.m105925i("MicroMsg.ManageChatroomUI", "[openVerify] roomId:%s, type:%s", this.f108078o, Integer.valueOf(intExtra));
            C49065cy2 cy22 = new C49065cy2();
            cy22.f132027d = Util.nullAsNil(this.f108078o);
            cy22.f132028e = intExtra;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(66, cy22));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.ManageChatroomUI", "[onCreate]");
        this.f108078o = getIntent().getStringExtra("RoomInfo_Id");
        this.f108080q = getIntent().getStringExtra("room_owner_name");
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C101218e0 e0Var;
        Class cls = C39479c.class;
        Class cls2 = C75700k0.class;
        String str = preference.f121285r;
        Log.m105919d("MicroMsg.ManageChatroomUI", "[onPreferenceTreeClick] key:%s", str);
        int i = 2;
        if (str.equals("room_transfer_room_ower")) {
            Log.m105925i("MicroMsg.ManageChatroomUI", "[selectNewRoomOwner] roomId:%s", this.f108078o);
            String listToString = Util.listToString(((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f108078o), ",");
            Intent intent = new Intent();
            intent.putExtra("Block_list", C75592q0.m90789s());
            intent.putExtra("Chatroom_member_list", listToString);
            intent.putExtra("from_scene", 2);
            intent.putExtra("RoomInfo_Id", this.f108078o);
            intent.putExtra("is_show_owner", false);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, getString(C0966R.string.f361222i93));
            intent.setClass(this, TransferRoomOwnerUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/ManageChatroomUI", "enterSelectNewRoomOwnerUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/ManageChatroomUI", "enterSelectNewRoomOwnerUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            C52310zu3 zu32 = null;
            if (str.equals("allow_by_identity")) {
                boolean J = this.f108072f.mo6804J();
                C48768av3 av32 = this.f108076j;
                if (av32 != null && !Util.isNullOrNil((List) av32.f130782e)) {
                    zu32 = this.f108076j.f130782e.getFirst();
                }
                if (zu32 == null || !J) {
                    C115669n.INSTANCE.idkeyStat(219, 22, 1, true);
                    Log.m105925i("MicroMsg.ManageChatroomUI", "[selectAllowByIdentity] roomId:%s isOpen:%s", this.f108078o, Boolean.valueOf(J));
                    if (C72996z1.m85847r5(this.f108078o)) {
                        ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(((C13786m) C86312j.m106911c(C13786m.class)).cf0(Util.nullAsNil(this.f108078o), J ? 1 : 0));
                    } else {
                        C49065cy2 cy22 = new C49065cy2();
                        cy22.f132027d = Util.nullAsNil(this.f108078o);
                        if (!J) {
                            i = 0;
                        }
                        cy22.f132028e = i;
                        ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(new C32330n(66, cy22));
                    }
                    CheckBoxPreference checkBoxPreference = this.f108072f;
                    checkBoxPreference.f121290w = false;
                    this.f108070d.mo72529n("room_access_verify_application", !checkBoxPreference.mo6804J());
                } else {
                    this.f108072f.mo6805K(false);
                    C77426q qVar = new C77426q(getContext());
                    qVar.mo107606r(getString(C0966R.string.b48));
                    qVar.mo107595g(Util.safeFormatString(getString(C0966R.string.b47), zu32.f146230e));
                    qVar.mo107601m(C0966R.string.f8028zq);
                    qVar.mo107603o();
                }
            } else if (str.equals("room_access_verify_application")) {
                Intent intent2 = new Intent(getContext(), RoomAccessVerifyApplicationUI.class);
                intent2.putExtra("intent_chatroom_username", this.f108078o);
                intent2.putExtra("intent_from_chattingui", false);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/ManageChatroomUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/ManageChatroomUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else if (str.equals("room_manager")) {
                Log.m105925i("MicroMsg.ManageChatroomUI", "[selectRoomManager] roomId:%s", this.f108078o);
                C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108078o);
                Intent intent3 = new Intent();
                if (Lo.mo69793u2(C75592q0.m90789s())) {
                    intent3.setClass(this, SeeRoomOwnerManagerUI.class);
                } else {
                    intent3.setClass(this, SeeRoomManagerUI.class);
                }
                intent3.putExtra("RoomInfo_Id", this.f108078o);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent3);
                C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/chatroom/ui/ManageChatroomUI", "enterSeeRoomManagerUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/ManageChatroomUI", "enterSeeRoomManagerUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                int i2 = 3;
                if (str.equals("use_wework_manager_room")) {
                    Log.m105925i("MicroMsg.ManageChatroomUI", "[useWeworkManagerRoom] roomId:%s", this.f108078o);
                    C44661m1 Lo2 = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108078o);
                    if (Lo2 == null) {
                        Log.m105920e("MicroMsg.ManageChatroomUI", "enterUseWeworkManagerRoomUI member is null");
                    } else {
                        boolean z = Lo2.field_memberCount >= C45612m0.m50699p();
                        if (!Lo2.mo69796x2(C75592q0.m90789s())) {
                            Log.m105924i("MicroMsg.ManageChatroomUI", "enterUseWeworkManagerRoomUI：no owner");
                            C76879j.m92711E(getContext(), getString(C0966R.string.b6e), "", getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
                            if (!z) {
                                i2 = 1;
                            }
                            ManagerRoomByWeworkUI.m43242H7(this.f108078o, 1, 2, i2);
                        } else if (z) {
                            Log.m105920e("MicroMsg.ManageChatroomUI", "enterUseWeworkManagerRoomUI：exceed maxnum");
                            C76879j.m92711E(getContext(), getString(C0966R.string.b6c), "", getString(C0966R.string.f8028zq), false, (DialogInterface.OnClickListener) null);
                            ManagerRoomByWeworkUI.m43242H7(this.f108078o, 1, 2, 2);
                        } else {
                            ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(27);
                            Intent intent4 = new Intent();
                            intent4.setClass(this, ManagerRoomByWeworkUI.class);
                            intent4.putExtra("RoomInfo_Id", this.f108078o);
                            intent4.putExtra("upgrade_openim_room_from_scene", 1);
                            C9556a aVar4 = new C9556a();
                            aVar4.mo10233c(intent4);
                            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/chatroom/ui/ManageChatroomUI", "enterUseWeworkManagerRoomUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar4.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/chatroom/ui/ManageChatroomUI", "enterUseWeworkManagerRoomUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                } else if (str.equals("room_bind_app_info")) {
                    C48768av3 av33 = this.f108076j;
                    C52310zu3 first = (av33 == null || Util.isNullOrNil((List) av33.f130782e)) ? null : this.f108076j.f130782e.getFirst();
                    if (first != null && ((e0Var = this.f108081r) == null || !e0Var.mo140661h())) {
                        this.f108081r = new C101218e0(getContext(), 0, 3);
                        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f7141zl, (ViewGroup) null, false);
                        C20828a.m22825b().mo32518g(first.f146231f, (ImageView) inflate.findViewById(C0966R.C0970id.fc9));
                        ((TextView) inflate.findViewById(C0966R.C0970id.kvf)).setText(first.f146230e);
                        ((TextView) inflate.findViewById(C0966R.C0970id.kvj)).setText(Util.safeFormatString(getString(C0966R.string.b44), first.f146230e));
                        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kys);
                        textView.setText(Util.safeFormatString(getString(C0966R.string.b4b), first.f146230e));
                        textView.setOnClickListener(new C1228z0(this, first));
                        this.f108081r.mo140663j(inflate);
                        this.f108081r.mo140655A();
                    }
                } else if (str.equals("dismiss_chatroom_quit")) {
                    mo62741I7(1, -1);
                    C77407n nVar = new C77407n((Context) this, 1, true);
                    nVar.f225771i = new C1211c1(this);
                    nVar.mo107568m(getString(C0966R.string.c09), 17, C76577a.m92151b(this, 14));
                    nVar.f225782p = new C67986q0(this);
                    nVar.f225761d = new C40264r0(this);
                    nVar.mo107573q();
                } else if (str.equals("room_topic_mod_only_admin")) {
                    if (C72996z1.m85847r5(this.f108078o)) {
                        Log.m105925i("MicroMsg.ManageChatroomUI", "dealModOnlyAdmin mRoomId:%s", this.f108078o);
                    } else {
                        C52326zy2 zy22 = new C52326zy2();
                        C51163rv3 rv32 = new C51163rv3();
                        rv32.f141175d = Util.nullAsNil(this.f108078o);
                        rv32.f141176e = true;
                        zy22.f146282d = rv32;
                        boolean J2 = this.f108077n.mo6804J();
                        Log.m105925i("MicroMsg.ManageChatroomUI", "dealModOnlyAdmin mRoomId:%s isChecked:%s", this.f108078o, Boolean.valueOf(J2));
                        if (J2) {
                            zy22.f146283e = 1;
                        } else {
                            zy22.f146283e = 0;
                        }
                        ((C77885p) ((C75700k0) C86709a0.m107533q(cls2)).mo96100XW()).mo107993q(new C32330n(76, zy22));
                        OnlyAdminModifyTopicReportStruct onlyAdminModifyTopicReportStruct = new OnlyAdminModifyTopicReportStruct();
                        if (J2) {
                            onlyAdminModifyTopicReportStruct.f107999g = 1;
                        } else {
                            onlyAdminModifyTopicReportStruct.f107999g = 2;
                        }
                        onlyAdminModifyTopicReportStruct.f107996d = onlyAdminModifyTopicReportStruct.mo86045b("ChatName", this.f108078o, true);
                        onlyAdminModifyTopicReportStruct.f107998f = (long) this.f108079p;
                        onlyAdminModifyTopicReportStruct.f107997e = (long) this.f108075i;
                        onlyAdminModifyTopicReportStruct.mo86054n();
                        onlyAdminModifyTopicReportStruct.mo86056r();
                        ((C119157j) C119157j.f356862d).mo183876g(new ManageChatroomUI$$a(this, J2), "MicroMsg.ManageChatroomUI");
                    }
                }
            }
        }
        return false;
    }

    public void onResume() {
        Class cls = C39479c.class;
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108078o);
        if (Lo != null) {
            if (this.f108071e == null) {
                SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
                this.f108071e = sharedPreferences;
                sharedPreferences.edit().putBoolean("allow_by_identity", Lo.mo69788p2() == 2).commit();
            }
            this.f108079p = Lo.field_memberCount;
        }
        super.onResume();
        C47511g preferenceScreen = getPreferenceScreen();
        this.f108070d = preferenceScreen;
        if (preferenceScreen != null) {
            setMMTitle((int) C0966R.string.gp8);
            this.f108072f = (CheckBoxPreference) this.f108070d.mo72519a("allow_by_identity");
            this.f108070d.mo72519a("room_manager");
            this.f108073g = this.f108070d.mo72519a("room_bind_app_info");
            this.f108077n = (CheckBoxPreference) this.f108070d.mo72519a("room_topic_mod_only_admin");
            if (!C45628s0.m50735A(this.f108078o) || (C75592q0.m90774d() & 16) != 0) {
                this.f108070d.mo72529n("room_manager", !((C39479c) C86709a0.m107533q(cls)).mo62087yu(this.f108078o));
            }
            this.f108070d.mo72529n("select_enable_qrcode", true);
            this.f108070d.mo72529n("select_into_room_type", true);
            this.f108070d.mo72529n("use_wework_manager_room", true);
            this.f108070d.mo72529n("room_bind_app_info", true);
            boolean equals = C75592q0.m90789s().equals(this.f108080q);
            if (!equals) {
                this.f108070d.mo72529n("room_transfer_room_ower", true);
                this.f108070d.mo72531o("dismiss_chatroom_quit");
            }
            if (equals) {
                C89060f.m111323b(this.f108078o).mo123064p(new C1223x0(this)).mo123062e(new C1221w0(this));
            }
            C44661m1 Lo2 = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(this.f108078o);
            if (Lo2 != null) {
                if (C72996z1.m85847r5(this.f108078o)) {
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(Lo2.mo69788p2() == 1);
                    Log.m105925i("MicroMsg.ManageChatroomUI", "isChecked = %s", objArr);
                    this.f108072f.mo6805K((Lo2.mo69788p2() & 1) == 1);
                } else {
                    this.f108072f.mo6805K(Lo2.mo69788p2() == 2);
                }
                Log.m105919d("MicroMsg.ManageChatroomUI", "mRoomId:%s chatroomstatus:%s", Util.nullAs(this.f108078o, "null"), Integer.valueOf(Lo2.field_chatroomStatus));
                if (!C72996z1.m85847r5(this.f108078o) && C45612m0.m50704u()) {
                    long j = (long) Lo2.field_chatroomStatus;
                    if ((j & 131072) != 131072 && (j & 65536) == 65536 && MultiProcessMMKV.getMMKV("room_upgrade_to_wework").getBoolean("enter_show", false)) {
                        this.f108070d.mo72529n("use_wework_manager_room", false);
                        NewTipPreference newTipPreference = (NewTipPreference) this.f108070d.mo72519a("use_wework_manager_room");
                        this.f108074h = newTipPreference;
                        C47511g gVar = this.f108070d;
                        newTipPreference.getClass();
                        newTipPreference.f115227P = new WeakReference<>(gVar);
                        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(this.f108074h);
                        NewTipPreference newTipPreference2 = this.f108074h;
                        newTipPreference2.getClass();
                        ((C47300f) C86312j.m106911c(C47300f.class)).mo72343o0(newTipPreference2);
                    }
                }
            }
            CheckBoxPreference checkBoxPreference = this.f108072f;
            checkBoxPreference.f121290w = false;
            this.f108070d.mo72529n("room_access_verify_application", !checkBoxPreference.mo6804J());
            setBackBtn(new C1225y0(this));
            if (C72996z1.m85847r5(this.f108078o)) {
                this.f108070d.mo72529n("room_topic_mod_only_admin", true);
            } else {
                this.f108070d.mo72529n("room_topic_mod_only_admin", false);
                if (Lo2 != null) {
                    int i = Lo2.field_chatroomStatus;
                    if ((i & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                        if ((i & 4) != 0) {
                            this.f108077n.mo6805K(true);
                        } else {
                            this.f108077n.mo6805K(false);
                        }
                    } else {
                        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChatRoomOwnerModTopic");
                        int safeParseInt = !Util.isNullOrNil(c) ? Util.safeParseInt(c) : 0;
                        if (Lo2.field_memberCount >= safeParseInt && safeParseInt > 0) {
                            this.f108077n.mo6805K(true);
                        } else {
                            this.f108077n.mo6805K(false);
                        }
                    }
                }
            }
            if (Lo2 != null) {
                if (Lo2.mo69796x2(C75592q0.m90789s())) {
                    this.f108075i = 1;
                } else if (Lo2.mo69793u2(C75592q0.m90789s())) {
                    this.f108075i = 2;
                } else {
                    this.f108075i = 3;
                }
            }
        }
        this.f108070d.notifyDataSetChanged();
    }
}
