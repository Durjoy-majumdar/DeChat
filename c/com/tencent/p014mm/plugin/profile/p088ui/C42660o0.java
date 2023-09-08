package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.ExDeviceBindHardDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent;
import com.tencent.p014mm.autogen.events.ReportAdClickEvent;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import d62.C7250m;
import d62.C75339i;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45618p;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C97625j3;
import ef2.C45653c;
import ef2.C45654d;
import ex0.C45696d;
import f40.C86709a0;
import g62.C32330n;
import gf2.C45908a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p011cm.C39989b;
import p196ln.C76706g;
import p196ln.C76708i;
import p214om.C11502f;
import p227rn.C48053v;
import p248ug.C52558c;
import pj3.C47511g;
import qo3.C77407n;
import qo3.C89779i0;
import rb0.C47961a;
import rb0.C47964c0;
import rb0.C47971i;
import rb0.C47984k;
import rb0.C47987l;
import rb0.C47989m;
import rb0.C47994n;
import rb0.C48007u0;
import rb0.C48009v0;
import sb0.C48353j;
import tc0.C77885p;
import te3.C48926by2;
import te3.C50122kf;
import te3.C51043r10;
import te3.d45;
import wd3.C78543a;

/* renamed from: com.tencent.mm.plugin.profile.ui.o0 */
public class C42660o0 implements C67027a, C11385n, C47989m.C47992c, C47964c0 {

    /* renamed from: I */
    public static final String f115478I = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + "/mp/infringement?username=%s&from=1#wechat_redirect");

    /* renamed from: A */
    public String f115479A;

    /* renamed from: B */
    public SharedPreferences f115480B = null;

    /* renamed from: C */
    public CheckBoxPreference f115481C;

    /* renamed from: D */
    public Bundle f115482D;

    /* renamed from: E */
    public SnsAdClick f115483E = null;

    /* renamed from: F */
    public String f115484F = null;

    /* renamed from: G */
    public C89779i0 f115485G = null;

    /* renamed from: H */
    public boolean f115486H = false;

    /* renamed from: d */
    public MMActivity f115487d;

    /* renamed from: e */
    public C47511g f115488e;

    /* renamed from: f */
    public C72996z1 f115489f;

    /* renamed from: g */
    public C52558c f115490g;

    /* renamed from: h */
    public List<C52558c.C52559a> f115491h;

    /* renamed from: i */
    public List<WxaAttributes.WxaEntryInfo> f115492i;

    /* renamed from: j */
    public C52558c.C52560b f115493j;

    /* renamed from: n */
    public int f115494n;

    /* renamed from: o */
    public boolean f115495o;

    /* renamed from: p */
    public String f115496p;

    /* renamed from: q */
    public C51043r10 f115497q;

    /* renamed from: r */
    public boolean f115498r;

    /* renamed from: s */
    public String f115499s;

    /* renamed from: t */
    public boolean f115500t = false;

    /* renamed from: u */
    public boolean f115501u = false;

    /* renamed from: v */
    public boolean f115502v = false;

    /* renamed from: w */
    public boolean f115503w = false;

    /* renamed from: x */
    public int f115504x = 0;

    /* renamed from: y */
    public String f115505y;

    /* renamed from: z */
    public boolean f115506z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$a */
    public class C42661a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f115507d;

        public C42661a(C117747y yVar) {
            this.f115507d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123470p(536, C42660o0.this);
            ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new ExDeviceBindHardDeviceEvent();
            ExDeviceBindHardDeviceEvent.C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
            aVar.f107428c = 2;
            aVar.f107429d = this.f115507d;
            exDeviceBindHardDeviceEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$b */
    public class C42662b implements C39989b.C0705b {
        public C42662b() {
        }

        /* renamed from: a */
        public void mo677a(boolean z, boolean z2, String str, String str2) {
            C52558c cVar;
            C52558c cVar2;
            if (z) {
                MMActivity mMActivity = C42660o0.this.f115487d;
                C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.bjx));
                C42660o0.this.f115488e.mo72529n("contact_info_time_expired", true);
                C42660o0 o0Var = C42660o0.this;
                C72996z1 z1Var = o0Var.f115489f;
                o0Var.getClass();
                if (z1Var == null || Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.ContactWidgetBizInfo", "respUsername == " + str + ", contact = " + z1Var);
                } else {
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        cVar2 = C47984k.m53328b(nullAsNil);
                        if (cVar2 != null) {
                            cVar2.field_username = str;
                        }
                        C48009v0.Fx0().mo72764c(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                    } else {
                        cVar2 = null;
                    }
                    z1Var.setUsername(str);
                    if (((int) z1Var.f108320R1) == 0) {
                        C97625j3.m125812b().mo105907v().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.ContactWidgetBizInfo", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(z1Var.getUsername());
                        if (cVar2 != null) {
                            C48009v0.Fx0().insert(cVar2);
                        } else {
                            Class cls = C76708i.class;
                            C52558c b = C47984k.m53328b(z1Var2.getUsername());
                            boolean z3 = z1Var2.mo62916m3() && C47961a.m53282a();
                            if (b == null || (b.mo72809G1() && !z3)) {
                                Log.m105918d("MicroMsg.ContactWidgetBizInfo", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5() && !z3) {
                                Log.m105919d("MicroMsg.ContactWidgetBizInfo", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C42660o0 o0Var2 = C42660o0.this;
                o0Var2.f115503w = true;
                if (o0Var2.f115483E != null) {
                    ReportAdClickEvent reportAdClickEvent = new ReportAdClickEvent();
                    SnsAdClick snsAdClick = C42660o0.this.f115483E;
                    snsAdClick.f267472g = 4;
                    reportAdClickEvent.f9426d.f9427a = snsAdClick;
                    reportAdClickEvent.publish();
                }
                C52558c SE = C48009v0.Fx0().mo72757SE(C42660o0.this.f115489f.getUsername());
                SE.field_status = 1;
                if (!Util.isNullOrNil(SE.field_extInfo) || Util.isNullOrNil(SE.field_username) || (cVar = C42660o0.this.f115490g) == null || !SE.field_username.equals(Util.nullAsNil(cVar.field_username))) {
                    C48009v0.Fx0().replace(SE);
                } else {
                    C48009v0.Fx0().replace(C42660o0.this.f115490g);
                }
                boolean booleanExtra = C42660o0.this.f115487d.getIntent().getBooleanExtra("key_biz_profile_stay_after_follow_op", false);
                boolean booleanExtra2 = C42660o0.this.f115487d.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false);
                if (SE.mo72811g1()) {
                    Intent intent = new Intent();
                    intent.putExtra("enterprise_biz_name", C42660o0.this.f115489f.getUsername());
                    intent.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(C42660o0.this.f115489f.getUsername()));
                    intent.putExtra("enterprise_from_scene", 7);
                    intent.addFlags(67108864);
                    C88144b.m109801s(C42660o0.this.f115487d, ".ui.conversation.EnterpriseConversationUI", intent, (Bundle) null);
                    C42660o0.this.f115487d.finish();
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Chat_User", C42660o0.this.f115489f.getUsername());
                    intent2.putExtra("key_has_add_contact", true);
                    intent2.putExtra("finish_direct", true);
                    if (booleanExtra2) {
                        intent2.addFlags(268435456);
                    }
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent2, C42660o0.this.f115487d);
                    if (booleanExtra || booleanExtra2) {
                        C42660o0.this.f115487d.finish();
                    }
                }
                C42660o0.this.mo66804m(3, (String) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$c */
    public class C42663c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52558c f115510d;

        public C42663c(C52558c cVar) {
            this.f115510d = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar = this.f115510d;
            cVar.field_hadAlert = 1;
            cVar.field_brandFlag |= 4;
            C42660o0.this.mo66792a(cVar, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$d */
    public class C42664d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52558c f115512d;

        public C42664d(C52558c cVar) {
            this.f115512d = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar = this.f115512d;
            cVar.field_hadAlert = 1;
            C42660o0.this.mo66792a(cVar, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$e */
    public class C42665e implements DialogInterface.OnClickListener {
        public C42665e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C42660o0.this.mo66796e(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$f */
    public class C42666f implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45654d f115515d;

        public C42666f(C45654d dVar) {
            this.f115515d = dVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123458d(this.f115515d);
            C97625j3.m125815e().mo123470p(1394, C42660o0.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$g */
    public class C42667g implements MenuItem.OnMenuItemClickListener {
        public C42667g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C42660o0 o0Var = C42660o0.this;
            C77407n nVar = new C77407n((Context) o0Var.f115487d, 1, false);
            nVar.f225771i = new C42637k0(o0Var);
            nVar.f225782p = new C42639l0(o0Var);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$h */
    public class C42668h implements MenuItem.OnMenuItemClickListener {
        public C42668h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C42660o0 o0Var = C42660o0.this;
            C77407n nVar = new C77407n((Context) o0Var.f115487d, 1, false);
            nVar.f225771i = new C42637k0(o0Var);
            nVar.f225782p = new C42639l0(o0Var);
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.o0$i */
    public class C42669i implements View.OnClickListener {
        public C42669i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C42660o0 o0Var = C42660o0.this;
            String str = C42660o0.f115478I;
            o0Var.mo66795d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C42660o0(MMActivity mMActivity, String str, C51043r10 r102) {
        this.f115487d = mMActivity;
        this.f115496p = str;
        this.f115497q = r102;
    }

    /* renamed from: L6 */
    public String mo66779L6() {
        return "MicroMsg.ContactWidgetBizInfo";
    }

    /* renamed from: a */
    public final void mo66792a(C52558c cVar, boolean z) {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f115488e.mo72519a("contact_info_subscribe_bizinfo");
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f115488e.mo72519a("contact_info_locate");
        C48926by2 by22 = new C48926by2();
        by22.f131388d = cVar.field_brandFlag;
        by22.f131389e = this.f115489f.getUsername();
        if (mo66800i(this.f115494n)) {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(58, by22));
        } else {
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C32330n(47, by22));
        }
        C48009v0.Fx0().update(cVar, new String[0]);
        checkBoxPreference.mo6805K(cVar.mo73508z2());
        if (checkBoxPreference2 != null) {
            checkBoxPreference2.mo6805K(cVar.mo73495m2());
        }
        if (z) {
            mo66802k();
        }
    }

    /* renamed from: b */
    public boolean mo66793b() {
        if (this.f115487d.getIntent() == null) {
            return false;
        }
        String stringExtra = this.f115487d.getIntent().getStringExtra(TPDownloadProxyEnum.USER_DEVICE_ID);
        String stringExtra2 = this.f115487d.getIntent().getStringExtra("device_type");
        ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = new ExDeviceCheckDeviceIsBoundEvent();
        ExDeviceCheckDeviceIsBoundEvent.C40062a aVar = exDeviceCheckDeviceIsBoundEvent.f107435d;
        aVar.f107438b = stringExtra;
        aVar.f107437a = stringExtra2;
        exDeviceCheckDeviceIsBoundEvent.publish();
        return exDeviceCheckDeviceIsBoundEvent.f107436e.f107439a;
    }

    /* renamed from: c */
    public final void mo66794c() {
        if (this.f115487d.getIntent() != null && this.f115487d.getIntent().getBooleanExtra("KIsHardDevice", false)) {
            String stringExtra = this.f115487d.getIntent().getStringExtra("KHardDeviceBindTicket");
            if (Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.ContactWidgetBizInfo", "bindTicket is null, means it is not switch from QRcode scan, just add contact");
            } else if (!mo66793b()) {
                Log.m105919d("MicroMsg.ContactWidgetBizInfo", "IsHardDevice, bindTicket = %s", stringExtra);
                C97625j3.m125815e().mo123455a(536, this);
                ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new ExDeviceBindHardDeviceEvent();
                ExDeviceBindHardDeviceEvent.C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
                aVar.f107426a = stringExtra;
                aVar.f107428c = 1;
                exDeviceBindHardDeviceEvent.publish();
                C117747y yVar = exDeviceBindHardDeviceEvent.f107425e.f107430a;
                MMActivity mMActivity = this.f115487d;
                this.f115485G = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), this.f115487d.getString(C0966R.string.a4d), true, true, new C42661a(yVar));
                return;
            }
        }
        C78543a aVar2 = new C78543a(this.f115487d, new C42662b());
        LinkedList linkedList = new LinkedList();
        linkedList.add(Integer.valueOf(this.f115494n));
        String str = this.f115499s;
        if (str != null) {
            aVar2.f230044p = str;
        }
        if (!Util.isNullOrNil(this.f115479A)) {
            aVar2.f230045q = this.f115479A;
        }
        aVar2.f230054z = true;
        aVar2.mo108501b(this.f115489f.getUsername(), linkedList, false, this.f115484F);
    }

    /* renamed from: c7 */
    public void mo7311c7(int i, C117747y yVar) {
        C52558c cVar = this.f115490g;
        if (cVar != null && cVar.mo73501s2() && yVar.getType() == 1354) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f115488e.mo72519a("contact_info_subscribe_bizinfo");
            C48353j jVar = C48009v0.Bx0().get(C48009v0.Bx0().mo73076Pk(this.f115490g.field_username));
            if (jVar != null) {
                checkBoxPreference.mo6805K(!jVar.mo73073l2(4));
                this.f115488e.notifyDataSetChanged();
                return;
            }
            Log.m105928w("MicroMsg.ContactWidgetBizInfo", "bizChatMyuser bizChatUserInfo is null after GetBizChatMyUserInfo");
        }
    }

    /* renamed from: d */
    public final void mo66795d() {
        C72996z1 z1Var = this.f115489f;
        if (z1Var != null && !Util.isNullOrNil(z1Var.getUsername())) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", String.format(f115478I, new Object[]{this.f115489f.getUsername()}));
            intent.putExtra("showShare", false);
            C88144b.m109791i(this.f115487d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: e */
    public final void mo66796e(boolean z) {
        C45654d dVar = new C45654d(this.f115490g.field_username, !z);
        C97625j3.m125815e().mo123455a(1394, this);
        C97625j3.m125815e().mo123460f(dVar);
        MMActivity mMActivity = this.f115487d;
        this.f115485G = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), this.f115487d.getString(C0966R.string.a4d), true, true, new C42666f(dVar));
    }

    /* renamed from: f */
    public final void mo66797f(C47987l lVar) {
        Class cls = C76706g.class;
        long currentTimeMillis = System.currentTimeMillis();
        C68098o oVar = (C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg();
        if (oVar.mo93607Lo(lVar.field_openId) == null) {
            C68097n nVar = new C68097n();
            nVar.f195728a = lVar.field_openId;
            nVar.f195731d = lVar.field_headImgUrl;
            nVar.f195733f = 0;
            nVar.f195729b = 3;
            oVar.mo93608Yt(nVar);
        }
        ((C68082g) ((C76706g) C86312j.m106911c(cls)).mo106847uz()).mo93575b(lVar.field_openId);
        Log.m105919d("MicroMsg.ContactWidgetBizInfo", "downloadKFAvatar, %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: g */
    public final String mo66798g(int i) {
        if (i == 0) {
            return this.f115487d.getResources().getString(C0966R.string.f360314bt2);
        }
        if (i == 1) {
            return this.f115487d.getResources().getString(C0966R.string.atn);
        }
        if (i == 2) {
            return this.f115487d.getResources().getString(C0966R.string.ato);
        }
        Log.m105929w("MicroMsg.ContactWidgetBizInfo", "getVerifyStr, error type %d", Integer.valueOf(i));
        return this.f115487d.getResources().getString(C0966R.string.bn8);
    }

    /* renamed from: g5 */
    public void mo66780g5(LinkedList<d45> linkedList) {
        C48009v0.Gx0().mo72778e(this);
        if (this.f115488e == null) {
            Log.m105920e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, screen is null");
        } else if (this.f115489f == null) {
            Log.m105920e("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, contact is null");
        } else if (linkedList == null || linkedList.size() <= 0) {
            Log.m105928w("MicroMsg.ContactWidgetBizInfo", "onKFSceneEnd, worker is null");
        } else {
            if (!Util.isNullOrNil(this.f115505y)) {
                Iterator<d45> it = linkedList.iterator();
                while (it.hasNext()) {
                    d45 next = it.next();
                    String str = next.f132111d;
                    if (str != null && str.equals(this.f115505y)) {
                        this.f115488e.mo72529n("contact_info_kf_worker", false);
                        this.f115488e.mo72519a("contact_info_kf_worker").mo7741E(next.f132113f);
                        return;
                    }
                }
            }
            this.f115488e.mo72529n("contact_info_kf_worker", false);
            Preference a = this.f115488e.mo72519a("contact_info_kf_worker");
            if (a != null && linkedList.get(0) != null) {
                a.mo7741E(linkedList.get(0).f132113f);
            }
        }
    }

    /* renamed from: h */
    public final void mo66799h(boolean z) {
        if (this.f115489f.mo62916m3()) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f115487d.findViewById(C0966R.C0970id.i1f);
                if (frameLayout == null) {
                    return;
                }
                if (z) {
                    View findViewById = frameLayout.findViewById(C0966R.C0970id.bmz);
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo", "hideExposeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo", "hideExposeBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                if (frameLayout.findViewById(C0966R.C0970id.bmz) == null) {
                    LinearLayout linearLayout = (LinearLayout) C85868k2.m106137b(this.f115487d).inflate(C0966R.C0971layout.f7054wa, (ViewGroup) null);
                    TextView textView = (TextView) linearLayout.findViewById(C0966R.C0970id.bns);
                    textView.setText(this.f115487d.getResources().getString(C0966R.string.bly));
                    textView.setTextColor(this.f115487d.getResources().getColor(C0966R.color.f3154h3));
                    textView.setOnClickListener(new C42669i());
                    frameLayout.addView(linearLayout);
                }
                frameLayout.setVisibility(0);
                this.f115488e.mo72529n("contact_info_expose_btn", true);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ContactWidgetBizInfo", "isShowExposeBtn Exception: " + e.getMessage());
            }
        }
    }

    /* renamed from: i */
    public final boolean mo66800i(int i) {
        return i == 81 || i == 92 || i == 93 || i == 94;
    }

    /* renamed from: j */
    public final boolean mo66801j(String str) {
        try {
            long j = Util.getLong(str, 0);
            return j > 0 && j - (System.currentTimeMillis() / 1000) < 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x05dc  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0601  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0685  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0806  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0814  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x08ae  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x093f  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x095b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0972  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x09b7  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0b6d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x038a  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66802k() {
        /*
            r21 = this;
            r1 = r21
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            r21.onDetach()
            pj3.g r2 = r1.f115488e
            r2.removeAll()
            pj3.g r2 = r1.f115488e
            r3 = 2132082703(0x7f15000f, float:1.9805528E38)
            r2.mo72520b(r3)
            boolean r2 = r1.f115503w
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = 1
            java.lang.String r5 = "contact_info_time_expired"
            if (r2 == 0) goto L_0x0022
            pj3.g r2 = r1.f115488e
            r2.mo72529n(r5, r4)
        L_0x0022:
            com.tencent.mm.storage.z1 r2 = r1.f115489f
            java.lang.String r2 = r2.getUsername()
            ug.c r2 = rb0.C47984k.m53328b(r2)
            r6 = 0
            r1.f115491h = r6
            r1.f115493j = r6
            r1.f115492i = r6
            r7 = 0
            if (r2 == 0) goto L_0x003c
            ug.c$b r8 = r2.mo73500r2(r7)
            if (r8 != 0) goto L_0x005f
        L_0x003c:
            te3.r10 r8 = r1.f115497q
            if (r8 == 0) goto L_0x005f
            ug.c r2 = new ug.c
            r2.<init>()
            com.tencent.mm.storage.z1 r8 = r1.f115489f
            java.lang.String r8 = r8.getUsername()
            r2.field_username = r8
            te3.r10 r8 = r1.f115497q
            int r9 = r8.f140656d
            r2.field_brandFlag = r9
            java.lang.String r9 = r8.f140659g
            r2.field_brandIconURL = r9
            java.lang.String r9 = r8.f140658f
            r2.field_brandInfo = r9
            java.lang.String r8 = r8.f140657e
            r2.field_extInfo = r8
        L_0x005f:
            if (r2 == 0) goto L_0x0087
            java.lang.String r8 = r2.field_brandInfo
            if (r8 != 0) goto L_0x0087
            java.lang.String r8 = r2.field_extInfo
            if (r8 != 0) goto L_0x0087
            te3.r10 r8 = r1.f115497q
            if (r8 == 0) goto L_0x0087
            com.tencent.mm.storage.z1 r8 = r1.f115489f
            java.lang.String r8 = r8.getUsername()
            r2.field_username = r8
            te3.r10 r8 = r1.f115497q
            int r9 = r8.f140656d
            r2.field_brandFlag = r9
            java.lang.String r9 = r8.f140659g
            r2.field_brandIconURL = r9
            java.lang.String r9 = r8.f140658f
            r2.field_brandInfo = r9
            java.lang.String r8 = r8.f140657e
            r2.field_extInfo = r8
        L_0x0087:
            pj3.g r8 = r1.f115488e
            java.lang.String r9 = "contact_info_header_bizinfo"
            com.tencent.mm.ui.base.preference.Preference r8 = r8.mo72519a(r9)
            com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference r8 = (com.tencent.p014mm.plugin.profile.p088ui.BizInfoHeaderPreference) r8
            java.lang.String r10 = "MicroMsg.ContactWidgetBizInfo"
            if (r8 == 0) goto L_0x00a9
            com.tencent.mm.storage.z1 r11 = r1.f115489f
            java.lang.String r11 = r11.getUsername()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00a9
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            java.lang.String r11 = r1.f115496p
            r8.mo66731J(r9, r11, r2)
            goto L_0x00b3
        L_0x00a9:
            java.lang.String r8 = "head pref is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r8)
            pj3.g r8 = r1.f115488e
            r8.mo72529n(r9, r4)
        L_0x00b3:
            pj3.g r8 = r1.f115488e
            java.lang.String r9 = "biz_placed_to_the_top"
            r8.mo72529n(r9, r4)
            pj3.g r8 = r1.f115488e
            java.lang.String r11 = "contact_info_biz_enable"
            r8.mo72529n(r11, r4)
            pj3.g r8 = r1.f115488e
            java.lang.String r12 = "contact_info_biz_disable"
            r8.mo72529n(r12, r4)
            pj3.g r8 = r1.f115488e
            java.lang.String r13 = "contact_info_stick_biz"
            r8.mo72529n(r13, r4)
            r1.mo66799h(r7)
            java.lang.String r8 = "contact_info_biz_go_chatting"
            java.lang.String r14 = "contact_info_biz_add"
            java.lang.String r15 = "contact_info_locate"
            java.lang.String r6 = "contact_info_subscribe_bizinfo"
            if (r2 == 0) goto L_0x0390
            boolean r18 = r2.mo73502t2()
            java.lang.String r7 = "contact_is_mute"
            if (r18 == 0) goto L_0x01cd
            r18 = r3
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r14, r4)
            pj3.g r3 = r1.f115488e
            r19 = r14
            java.lang.String r14 = "contact_info_expose_btn"
            r3.mo72529n(r14, r4)
            r1.mo66799h(r4)
            pj3.g r3 = r1.f115488e
            r14 = 0
            r3.mo72529n(r7, r14)
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            boolean r3 = eb0.C45628s0.m50746K(r3)
            r1.f115498r = r3
            boolean r3 = r2.mo73501s2()
            if (r3 == 0) goto L_0x0138
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r8, r4)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.storage.z1 r7 = r1.f115489f
            boolean r7 = r7.mo62927s3()
            r7 = r7 ^ r4
            r3.mo72529n(r13, r7)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r13)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r3
            com.tencent.mm.storage.z1 r7 = r1.f115489f
            boolean r7 = r7.mo62940x3()
            r3.mo6805K(r7)
            r7 = 2131825146(0x7f1111fa, float:1.928314E38)
            r3.mo69923G(r7)
            r21.mo66807p()
            goto L_0x01c7
        L_0x0138:
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r6, r4)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r8, r4)
            boolean r3 = r2.mo73508z2()
            if (r3 == 0) goto L_0x0188
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r11, r4)
            pj3.g r3 = r1.f115488e
            r11 = 0
            r3.mo72529n(r12, r11)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r12)
            r12 = 2131825148(0x7f1111fc, float:1.9283144E38)
            r3.mo69923G(r12)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r11)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r9, r11)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r9)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r3
            r1.f115481C = r3
            r7 = 2131825165(0x7f11120d, float:1.9283178E38)
            r3.mo69923G(r7)
            r21.mo66807p()
            boolean r3 = r2.mo73504v2()
            if (r3 == 0) goto L_0x01c7
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r15, r4)
            goto L_0x01c7
        L_0x0188:
            pj3.g r3 = r1.f115488e
            r13 = 0
            r3.mo72529n(r11, r13)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r12, r4)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r11)
            com.tencent.mm.ui.base.preference.ButtonPreference r3 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r3
            com.tencent.mm.ui.MMActivity r11 = r1.f115487d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131825150(0x7f1111fe, float:1.9283148E38)
            java.lang.String r11 = r11.getString(r12)
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131100190(0x7f06021e, float:1.7812754E38)
            int r12 = r12.getColor(r13)
            r3.mo101917K(r11, r12)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r4)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r9, r4)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r15, r4)
        L_0x01c7:
            boolean r3 = r1.f115498r
            r1.mo66806o(r3)
            goto L_0x0245
        L_0x01cd:
            r18 = r3
            r19 = r14
            boolean r3 = r2.mo72811g1()
            if (r3 == 0) goto L_0x0247
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r15, r4)
            pj3.g r3 = r1.f115488e
            r9 = 0
            r3.mo72529n(r6, r9)
            pj3.g r3 = r1.f115488e
            java.lang.String r11 = "enterprise_contact_info_enter"
            r3.mo72529n(r11, r9)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r8)
            com.tencent.mm.ui.base.preference.ButtonPreference r3 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r3
            com.tencent.mm.ui.MMActivity r9 = r1.f115487d
            android.content.res.Resources r9 = r9.getResources()
            r11 = 2131825151(0x7f1111ff, float:1.928315E38)
            java.lang.String r9 = r9.getString(r11)
            com.tencent.mm.ui.MMActivity r11 = r1.f115487d
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131100190(0x7f06021e, float:1.7812754E38)
            int r11 = r11.getColor(r12)
            r3.mo101917K(r9, r11)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            boolean r9 = r9.mo62927s3()
            r9 = r9 ^ r4
            r3.mo72529n(r13, r9)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r13)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r3
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            boolean r9 = r9.mo62940x3()
            r3.mo6805K(r9)
            r9 = 2131825154(0x7f111202, float:1.9283156E38)
            r3.mo69923G(r9)
            r21.mo66807p()
            pj3.g r3 = r1.f115488e
            r9 = 0
            r3.mo72529n(r7, r9)
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            boolean r3 = eb0.C45628s0.m50746K(r3)
            r1.f115498r = r3
            r1.mo66806o(r3)
        L_0x0245:
            r3 = 0
            goto L_0x027d
        L_0x0247:
            pj3.g r3 = r1.f115488e
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            java.lang.String r9 = r9.getUsername()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85793A5(r9)
            if (r9 != 0) goto L_0x0260
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            boolean r9 = r9.mo62927s3()
            if (r9 != 0) goto L_0x025e
            goto L_0x0260
        L_0x025e:
            r9 = 0
            goto L_0x0261
        L_0x0260:
            r9 = 1
        L_0x0261:
            r3.mo72529n(r13, r9)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r13)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r3 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r3
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            boolean r9 = r9.mo62940x3()
            r3.mo6805K(r9)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r4)
            r3 = 0
            r1.f115498r = r3
        L_0x027d:
            r1.f115490g = r2
            java.util.List r7 = r2.mo73496n2()
            r1.f115491h = r7
            ug.c$b r7 = r2.mo73500r2(r3)
            r1.f115493j = r7
            java.util.List r3 = r7.mo73523p()
            r1.f115492i = r3
            ug.c$b r3 = r1.f115493j
            boolean r3 = r3.mo73524q()
            java.lang.String r7 = "near_field_service"
            if (r3 == 0) goto L_0x02a9
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r7)
            r7 = 2131840191(0x7f114cbf, float:1.9313655E38)
            r3.mo7740D(r7)
            goto L_0x02ae
        L_0x02a9:
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r4)
        L_0x02ae:
            ug.c$b r3 = r1.f115493j
            org.json.JSONObject r7 = r3.f146795a
            java.lang.String r9 = "ConferenceContactExpireTime"
            if (r7 == 0) goto L_0x02bc
            java.lang.String r7 = r7.optString(r9)
            r3.f146800f = r7
        L_0x02bc:
            java.lang.String r3 = r3.f146800f
            if (r3 == 0) goto L_0x031b
            r1.f115501u = r4
            ug.c$b r3 = r1.f115493j
            org.json.JSONObject r7 = r3.f146795a
            if (r7 == 0) goto L_0x02ce
            java.lang.String r7 = r7.optString(r9)
            r3.f146800f = r7
        L_0x02ce:
            java.lang.String r3 = r3.f146800f
            boolean r3 = r1.mo66801j(r3)
            if (r3 != 0) goto L_0x02dc
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r5, r4)
            goto L_0x02ff
        L_0x02dc:
            r1.f115500t = r4
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            boolean r3 = r3.mo62927s3()
            if (r3 != 0) goto L_0x02fa
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.mm.storage.z1 r7 = r1.f115489f
            java.lang.String r7 = r7.getUsername()
            r9 = 0
            r3[r9] = r7
            java.lang.String r7 = "expireTime not null, and %s is not my contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r7, r3)
            r21.mo66803l()
            goto L_0x02ff
        L_0x02fa:
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r5, r4)
        L_0x02ff:
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            java.lang.String r3 = r3.getUsername()
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85842m5(r3)
            if (r3 != 0) goto L_0x0317
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            java.lang.String r3 = r3.getUsername()
            boolean r3 = eb0.C45628s0.m50757V(r3)
            if (r3 == 0) goto L_0x0320
        L_0x0317:
            r21.mo66803l()
            goto L_0x0320
        L_0x031b:
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r5, r4)
        L_0x0320:
            ug.c$b r3 = r1.f115493j
            java.lang.String r3 = r3.mo73522o()
            if (r3 == 0) goto L_0x033c
            ug.c$b r3 = r1.f115493j
            java.lang.String r3 = r3.mo73522o()
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x033c
            ug.c$b r3 = r1.f115493j
            java.lang.String r3 = r3.mo73522o()
            r1.f115499s = r3
        L_0x033c:
            ug.c$b r3 = r1.f115493j
            org.json.JSONObject r7 = r3.f146795a
            if (r7 == 0) goto L_0x0350
            java.lang.String r9 = "IsShowMember"
            java.lang.String r7 = r7.optString(r9)
            java.lang.String r9 = "1"
            boolean r7 = r9.equals(r7)
            r3.f146797c = r7
        L_0x0350:
            boolean r3 = r3.f146797c
            r1.f115502v = r3
            ug.c$b r3 = r1.f115493j
            java.lang.String r3 = r3.mo73516i()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r7 = "contact_info_service_phone"
            if (r3 != 0) goto L_0x038a
            pj3.g r3 = r1.f115488e
            r9 = 0
            r3.mo72529n(r7, r9)
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r7)
            if (r3 == 0) goto L_0x039e
            ug.c$b r7 = r1.f115493j
            java.lang.String r7 = r7.mo73516i()
            r3.mo7741E(r7)
            com.tencent.mm.ui.MMActivity r7 = r1.f115487d
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131101015(0x7f060557, float:1.7814428E38)
            int r7 = r7.getColor(r9)
            r3.mo69922F(r7)
            goto L_0x039e
        L_0x038a:
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r4)
            goto L_0x039e
        L_0x0390:
            r18 = r3
            r19 = r14
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r5, r4)
            java.lang.String r3 = "get biz info from storage, but return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r3)
        L_0x039e:
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            java.lang.String r3 = r3.f149516U
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r7 = "contact_info_user_desc"
            r9 = 8
            java.lang.String r11 = "verify bmp is null ? %B"
            if (r3 != 0) goto L_0x042b
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r7)
            com.tencent.mm.ui.base.preference.KeyValuePreference r3 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r3
            if (r3 == 0) goto L_0x043e
            com.tencent.mm.storage.z1 r5 = r1.f115489f
            java.lang.String r5 = r5.f149516U
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            java.lang.String r5 = r5.trim()
            int r5 = r5.length()
            if (r5 > 0) goto L_0x03d1
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r4)
            goto L_0x043e
        L_0x03d1:
            r5 = 0
            r3.f121240L = r5
            com.tencent.mm.ui.MMActivity r5 = r1.f115487d
            r12 = 2131824168(0x7f110e28, float:1.9281156E38)
            java.lang.String r5 = r5.getString(r12)
            r3.f121242N = r5
            di3.d r5 = di3.C86312j.m106911c(r0)
            ny.h r5 = (p629ny.C76979h) r5
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            com.tencent.mm.storage.z1 r13 = r1.f115489f
            java.lang.String r13 = r13.f149516U
            android.text.SpannableString r5 = r5.mo107057T1(r12, r13)
            r3.mo7741E(r5)
            r5 = 0
            r3.mo69912I(r5)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r12[r5] = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            r5 = 0
            r3.f121249V = r5
            r3.f121247T = r9
            r3.mo69921C(r9)
            com.tencent.mm.storage.z1 r5 = r1.f115489f
            java.lang.String r5 = r5.getUsername()
            boolean r5 = com.tencent.p014mm.storage.C72996z1.m85805J5(r5)
            if (r5 == 0) goto L_0x043e
            boolean r5 = com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch.hardcodeWeChatUSTeam()
            if (r5 == 0) goto L_0x043e
            di3.d r5 = di3.C86312j.m106911c(r0)
            ny.h r5 = (p629ny.C76979h) r5
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            java.lang.String r13 = eb0.C116734h6.C45610f.m50672a()
            android.text.SpannableString r5 = r5.mo107057T1(r12, r13)
            r3.mo7741E(r5)
            goto L_0x043e
        L_0x042b:
            java.lang.String r3 = "has not desc info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r3)
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r7, r4)
            boolean r3 = r1.f115500t
            if (r3 != 0) goto L_0x043e
            pj3.g r3 = r1.f115488e
            r3.mo72529n(r5, r4)
        L_0x043e:
            ug.c$b r3 = r1.f115493j
            java.lang.String r5 = "contact_info_verifyuser"
            java.lang.String r12 = "OfficialEntity"
            if (r3 == 0) goto L_0x052b
            ug.c$b$e r3 = r3.mo73521n()
            if (r3 == 0) goto L_0x052b
            ug.c$b r3 = r1.f115493j
            ug.c$b$e r3 = r3.mo73521n()
            java.lang.String r3 = r3.f146837b
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x052b
            ug.c$b r3 = r1.f115493j
            ug.c$b$e r3 = r3.mo73521n()
            pj3.g r13 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r13 = r13.mo72519a(r5)
            com.tencent.mm.ui.base.preference.KeyValuePreference r13 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r13
            if (r13 == 0) goto L_0x0525
            r14 = 0
            r13.mo69915L(r14)
            java.lang.String r14 = r3.f146838c
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 == 0) goto L_0x0480
            int r14 = r3.f146836a
            java.lang.String r14 = r1.mo66798g(r14)
            r13.mo69916M(r14)
            goto L_0x0485
        L_0x0480:
            java.lang.String r14 = r3.f146838c
            r13.mo69916M(r14)
        L_0x0485:
            java.lang.Object[] r14 = new java.lang.Object[r4]
            r17 = 0
            r14[r17] = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r14)
            r11 = 0
            r13.mo69913J(r11)
            java.lang.String r11 = r3.f146837b
            if (r11 == 0) goto L_0x04f4
            java.lang.String r11 = r3.f146840e
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            com.tencent.mm.ui.MMActivity r14 = r1.f115487d
            java.lang.String r3 = r3.f146837b
            java.lang.String r3 = r3.trim()
            android.text.SpannableString r3 = r0.mo107057T1(r14, r3)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r0 != 0) goto L_0x04f0
            android.text.SpannableString r14 = new android.text.SpannableString     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            r0.append(r11)     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            java.lang.String r9 = " "
            r0.append(r9)     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            r0.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            r14.<init>(r0)     // Catch:{ IndexOutOfBoundsException -> 0x04e0 }
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan     // Catch:{ IndexOutOfBoundsException -> 0x04dd }
            r3 = -36352(0xffffffffffff7200, float:NaN)
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x04dd }
            int r3 = r11.length()     // Catch:{ IndexOutOfBoundsException -> 0x04dd }
            r9 = 17
            r11 = 0
            r14.setSpan(r0, r11, r3, r9)     // Catch:{ IndexOutOfBoundsException -> 0x04dd }
            r3 = r14
            goto L_0x04f0
        L_0x04dd:
            r0 = move-exception
            r3 = r14
            goto L_0x04e1
        L_0x04e0:
            r0 = move-exception
        L_0x04e1:
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.String r0 = r0.getMessage()
            r11 = 0
            r9[r11] = r0
            java.lang.String r0 = "verifySummary setSpan error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r0, r9)
        L_0x04f0:
            r13.mo7741E(r3)
            goto L_0x04f9
        L_0x04f4:
            java.lang.String r0 = "[arthurdan.emojiSpan] Notice!!!! extInfo.verifyInfo.verifySourceDescription is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x04f9:
            boolean r0 = eb0.C45628s0.m50756U()
            if (r0 == 0) goto L_0x0506
            r3 = 8
            r13.mo69921C(r3)
            goto L_0x058d
        L_0x0506:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85805J5(r0)
            if (r0 == 0) goto L_0x058d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch.hardcodeWeChatUSTeam()
            if (r0 == 0) goto L_0x058d
            java.lang.String r0 = eb0.C116734h6.m164662r(r12)
            r13.mo7741E(r0)
            r3 = 8
            r13.mo69921C(r3)
            goto L_0x058d
        L_0x0525:
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r5, r4)
            goto L_0x058d
        L_0x052b:
            ug.c$b r3 = r1.f115493j
            if (r3 == 0) goto L_0x0583
            ug.c$b$h r3 = r3.mo73515h()
            if (r3 == 0) goto L_0x0583
            ug.c$b r3 = r1.f115493j
            ug.c$b$h r3 = r3.mo73515h()
            java.lang.String r3 = r3.f146848a
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0583
            pj3.g r3 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r3 = r3.mo72519a(r5)
            com.tencent.mm.ui.base.preference.KeyValuePreference r3 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r3
            if (r3 == 0) goto L_0x058d
            ug.c$b r9 = r1.f115493j
            ug.c$b$h r9 = r9.mo73515h()
            java.lang.String r9 = r9.f146848a
            r3.mo7741E(r9)
            com.tencent.mm.storage.z1 r9 = r1.f115489f
            java.lang.String r9 = r9.getUsername()
            boolean r9 = com.tencent.p014mm.storage.C72996z1.m85805J5(r9)
            if (r9 == 0) goto L_0x058d
            boolean r9 = com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch.hardcodeWeChatUSTeam()
            if (r9 == 0) goto L_0x058d
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            com.tencent.mm.ui.MMActivity r9 = r1.f115487d
            java.lang.String r11 = eb0.C116734h6.m164662r(r12)
            android.text.SpannableString r0 = r0.mo107057T1(r9, r11)
            r3.mo7741E(r0)
            r9 = 8
            r3.mo69921C(r9)
            goto L_0x058d
        L_0x0583:
            java.lang.String r0 = "has not verify info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r5, r4)
        L_0x058d:
            ug.c$b r0 = r1.f115493j
            r3 = 2
            java.lang.String r9 = "contact_info_trademark"
            if (r0 == 0) goto L_0x05dc
            java.lang.String r0 = r0.mo73519l()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x05dc
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r9)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            if (r0 == 0) goto L_0x05e6
            r9 = 0
            r0.mo69915L(r9)
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r11[r9] = r18
            java.lang.String r12 = "trademark bmp is null ? %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r12, r11)
            r11 = 0
            r0.mo69913J(r11)
            ug.c$b r11 = r1.f115493j
            java.lang.String r11 = r11.mo73519l()
            r0.mo7741E(r11)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            ug.c$b r11 = r1.f115493j
            java.lang.String r11 = r11.mo73519l()
            r0[r9] = r11
            ug.c$b r9 = r1.f115493j
            java.lang.String r9 = r9.mo73520m()
            r0[r4] = r9
            java.lang.String r9 = "trademark name : %s, url : %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r9, r0)
            goto L_0x05e6
        L_0x05dc:
            java.lang.String r0 = "has not trademark info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r9, r4)
        L_0x05e6:
            ug.c$b r0 = r1.f115493j
            java.lang.String r9 = "string"
            java.lang.String r11 = "contact_info_privilege"
            if (r0 == 0) goto L_0x0685
            java.util.List r0 = r0.mo73514g()
            if (r0 == 0) goto L_0x0685
            ug.c$b r0 = r1.f115493j
            java.util.List r0 = r0.mo73514g()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0685
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r11)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            r11 = 0
            r0.mo69912I(r11)
            java.util.List<android.view.View> r11 = r0.f121251X
            java.util.LinkedList r11 = (java.util.LinkedList) r11
            r11.clear()
            ug.c$b r11 = r1.f115493j
            java.util.List r11 = r11.mo73514g()
            java.util.Iterator r11 = r11.iterator()
        L_0x061e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x068b
            java.lang.Object r12 = r11.next()
            ug.c$b$g r12 = (p248ug.C52558c.C52560b.C52568g) r12
            com.tencent.mm.ui.MMActivity r13 = r1.f115487d
            r14 = 2131496084(0x7f0c0c94, float:1.8615723E38)
            r3 = 0
            android.view.View r13 = android.view.View.inflate(r13, r14, r3)
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r14 = 2131306304(0x7f092740, float:1.8230803E38)
            android.view.View r14 = r13.findViewById(r14)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            sf2.c r3 = new sf2.c
            com.tencent.mm.ui.MMActivity r4 = r1.f115487d
            android.content.res.Resources r4 = r4.getResources()
            r20 = r11
            java.lang.String r11 = r12.f146845a
            r3.<init>(r4, r11)
            r14.setImageDrawable(r3)
            java.lang.String r3 = r12.f146846b
            com.tencent.mm.ui.MMActivity r4 = r1.f115487d
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r11 = r12.f146847c
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            java.lang.String r12 = r12.getPackageName()
            int r4 = r4.getIdentifier(r11, r9, r12)
            if (r4 <= 0) goto L_0x066d
            com.tencent.mm.ui.MMActivity r3 = r1.f115487d
            java.lang.String r3 = r3.getString(r4)
        L_0x066d:
            r4 = 2131314717(0x7f09481d, float:1.8247867E38)
            android.view.View r4 = r13.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r3)
            java.util.List<android.view.View> r3 = r0.f121251X
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            r3.add(r13)
            r11 = r20
            r3 = 2
            r4 = 1
            goto L_0x061e
        L_0x0685:
            pj3.g r0 = r1.f115488e
            r3 = 1
            r0.mo72529n(r11, r3)
        L_0x068b:
            pj3.g r0 = r1.f115488e
            java.lang.String r3 = "contact_info_category2"
            int r0 = r0.mo72521d(r3)
            java.lang.String r3 = "contact_info_scope_of_business"
            if (r0 < 0) goto L_0x0806
            java.util.List<ug.c$a> r4 = r1.f115491h
            if (r4 == 0) goto L_0x0806
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0806
            java.util.List<ug.c$a> r4 = r1.f115491h
            int r4 = r4.size()
            r11 = 1
            int r4 = r4 - r11
        L_0x06a9:
            if (r4 < 0) goto L_0x080c
            java.util.List<ug.c$a> r11 = r1.f115491h
            java.lang.Object r11 = r11.get(r4)
            if (r11 != 0) goto L_0x06b4
            goto L_0x06f2
        L_0x06b4:
            com.tencent.mm.ui.MMActivity r11 = r1.f115487d
            r12 = 2131824086(0x7f110dd6, float:1.928099E38)
            java.lang.String r11 = r11.getString(r12)
            java.util.List<ug.c$a> r12 = r1.f115491h
            java.lang.Object r12 = r12.get(r4)
            ug.c$a r12 = (p248ug.C52558c.C52559a) r12
            java.lang.String r12 = r12.f146786a
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x06d2
            boolean r11 = r1.f115502v
            if (r11 != 0) goto L_0x06d2
            goto L_0x06f2
        L_0x06d2:
            java.util.List<ug.c$a> r11 = r1.f115491h
            java.lang.Object r11 = r11.get(r4)
            ug.c$a r11 = (p248ug.C52558c.C52559a) r11
            java.lang.String r11 = r11.f146786a
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x06f6
            java.util.List<ug.c$a> r11 = r1.f115491h
            java.lang.Object r11 = r11.get(r4)
            ug.c$a r11 = (p248ug.C52558c.C52559a) r11
            java.lang.String r11 = r11.f146787b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x06f6
        L_0x06f2:
            r16 = r0
            goto L_0x0800
        L_0x06f6:
            com.tencent.mm.ui.base.preference.Preference r11 = new com.tencent.mm.ui.base.preference.Preference
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            r11.<init>(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "contact_info_bizinfo_external#"
            r12.append(r13)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r11.mo26273A(r12)
            java.util.List<ug.c$a> r12 = r1.f115491h
            java.lang.Object r12 = r12.get(r4)
            ug.c$a r12 = (p248ug.C52558c.C52559a) r12
            java.lang.String r12 = r12.f146786a
            com.tencent.mm.ui.MMActivity r13 = r1.f115487d
            android.content.res.Resources r13 = r13.getResources()
            java.util.List<ug.c$a> r14 = r1.f115491h
            java.lang.Object r14 = r14.get(r4)
            ug.c$a r14 = (p248ug.C52558c.C52559a) r14
            java.lang.String r14 = r14.f146787b
            r16 = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            java.lang.String r0 = r0.getPackageName()
            int r0 = r13.getIdentifier(r14, r9, r0)
            if (r0 <= 0) goto L_0x073f
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            java.lang.String r12 = r12.getString(r0)
        L_0x073f:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85805J5(r0)
            r13 = 2131820556(0x7f11000c, float:1.927383E38)
            if (r0 == 0) goto L_0x0764
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            java.lang.String r0 = r0.getString(r13)
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0764
            pj3.g r0 = r1.f115488e
            java.lang.String r14 = r11.mo69927p()
            r13 = 1
            r0.mo72529n(r14, r13)
        L_0x0764:
            ug.c r0 = r1.f115490g
            boolean r0 = r0.mo73503u2()
            if (r0 == 0) goto L_0x0796
            java.util.List<ug.c$a> r0 = r1.f115491h
            java.lang.Object r0 = r0.get(r4)
            ug.c$a r0 = (p248ug.C52558c.C52559a) r0
            java.lang.String r0 = r0.f146787b
            java.lang.String r13 = "__mp_wording__brandinfo_history_massmsg"
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x078d
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r13 = 2131820556(0x7f11000c, float:1.927383E38)
            java.lang.String r0 = r0.getString(r13)
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0796
        L_0x078d:
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r12 = 2131825142(0x7f1111f6, float:1.9283132E38)
            java.lang.String r12 = r0.getString(r12)
        L_0x0796:
            r11.mo69924H(r12)
            java.util.List<ug.c$a> r0 = r1.f115491h
            java.lang.Object r0 = r0.get(r4)
            ug.c$a r0 = (p248ug.C52558c.C52559a) r0
            java.lang.String r0 = r0.f146789d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x07b6
            java.util.List<ug.c$a> r0 = r1.f115491h
            java.lang.Object r0 = r0.get(r4)
            ug.c$a r0 = (p248ug.C52558c.C52559a) r0
            java.lang.String r0 = r0.f146789d
            r11.mo7741E(r0)
        L_0x07b6:
            java.util.List<ug.c$a> r0 = r1.f115491h
            java.lang.Object r0 = r0.get(r4)
            ug.c$a r0 = (p248ug.C52558c.C52559a) r0
            java.lang.String r0 = r0.f146787b
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r12 = "__mp_wording__brandinfo_feedback"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x07d7
            pj3.g r0 = r1.f115488e
            int r0 = r0.mo72521d(r3)
            if (r0 <= 0) goto L_0x07d7
            int r0 = r0 + 1
            goto L_0x07d9
        L_0x07d7:
            r0 = r16
        L_0x07d9:
            pj3.g r12 = r1.f115488e
            r12.mo72524h(r11, r0)
            java.util.List<ug.c$a> r11 = r1.f115491h
            java.lang.Object r11 = r11.get(r4)
            ug.c$a r11 = (p248ug.C52558c.C52559a) r11
            java.lang.String r11 = r11.f146787b
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            java.lang.String r12 = "__mp_wording__brandinfo_biz_detail"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0800
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r11 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            com.tencent.mm.ui.MMActivity r12 = r1.f115487d
            r11.<init>(r12)
            pj3.g r12 = r1.f115488e
            r12.mo72524h(r11, r0)
        L_0x0800:
            int r4 = r4 + -1
            r0 = r16
            goto L_0x06a9
        L_0x0806:
            java.lang.String r0 = "pos no more"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
        L_0x080c:
            boolean r0 = r1.f115500t
            java.lang.String r4 = "contact_info_verifyuser_weibo"
            java.lang.String r9 = ""
            if (r0 != 0) goto L_0x0899
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.util.Set<java.lang.String> r11 = eb0.C45628s0.f123410p
            int r0 = r0.mo73955G2()
            r11 = 1
            r0 = r0 & r11
            if (r0 == 0) goto L_0x0822
            r0 = 1
            goto L_0x0823
        L_0x0822:
            r0 = 0
        L_0x0823:
            if (r0 == 0) goto L_0x0899
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.mo73954F2()
            if (r0 == 0) goto L_0x0899
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.mo73954F2()
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0899
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r4)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            if (r0 == 0) goto L_0x089f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.storage.z1 r11 = r1.f115489f
            java.lang.String r11 = r11.mo73956H2()
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r9)
            r4.append(r11)
            com.tencent.mm.ui.MMActivity r11 = r1.f115487d
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            com.tencent.mm.storage.z1 r13 = r1.f115489f
            java.lang.String r13 = r13.mo73954F2()
            boolean r16 = eb0.C45628s0.m50754S(r13)
            if (r16 == 0) goto L_0x0874
            java.lang.String r12 = "http://t.qq.com/"
            java.lang.String r12 = r13.replace(r12, r9)
            java.lang.String r13 = "t.qq.com/"
            java.lang.String r12 = r12.replace(r13, r9)
            goto L_0x0875
        L_0x0874:
            r12 = r9
        L_0x0875:
            r13 = 0
            r14[r13] = r12
            r12 = 2131836331(0x7f113dab, float:1.9305826E38)
            java.lang.String r11 = r11.getString(r12, r14)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            r0.mo7741E(r4)
            com.tencent.mm.ui.MMActivity r4 = r1.f115487d
            r11 = 2131101015(0x7f060557, float:1.7814428E38)
            int r4 = kg3.C76577a.m92153d(r4, r11)
            r0.mo69922F(r4)
            r0.mo69912I(r13)
            goto L_0x089f
        L_0x0899:
            pj3.g r0 = r1.f115488e
            r11 = 1
            r0.mo72529n(r4, r11)
        L_0x089f:
            ug.c$b r0 = r1.f115493j
            r4 = 4
            java.lang.String r11 = "contact_info_guarantee_info"
            java.lang.String r12 = "contact_info_reputation"
            if (r0 == 0) goto L_0x093f
            ug.c$b$f r0 = r0.mo73513f()
            if (r0 == 0) goto L_0x093f
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r12)
            com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.BizInfoPayInfoIconPreference) r0
            ug.c$b r13 = r1.f115493j
            ug.c$b$f r13 = r13.mo73513f()
            int r13 = r13.f146841a
            if (r13 <= 0) goto L_0x08d3
            ug.c$b r12 = r1.f115493j
            ug.c$b$f r12 = r12.mo73513f()
            int r12 = r12.f146841a
            int r13 = r0.f20125M
            if (r12 != r13) goto L_0x08cd
            goto L_0x08d9
        L_0x08cd:
            r0.f20125M = r12
            r0.mo5901J()
            goto L_0x08d9
        L_0x08d3:
            pj3.g r0 = r1.f115488e
            r13 = 1
            r0.mo72529n(r12, r13)
        L_0x08d9:
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r11)
            com.tencent.mm.plugin.profile.ui.BizInfoPayInfoIconPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.BizInfoPayInfoIconPreference) r0
            ug.c$b r12 = r1.f115493j
            ug.c$b$f r12 = r12.mo73513f()
            java.util.List<java.lang.String> r12 = r12.f146843c
            if (r12 == 0) goto L_0x0909
            ug.c$b r12 = r1.f115493j
            ug.c$b$f r12 = r12.mo73513f()
            java.util.List<java.lang.String> r12 = r12.f146843c
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r12 = r12.size()
            if (r12 <= 0) goto L_0x0909
            ug.c$b r11 = r1.f115493j
            ug.c$b$f r11 = r11.mo73513f()
            java.util.List<java.lang.String> r11 = r11.f146843c
            r0.f20124L = r11
            r0.mo5901J()
            goto L_0x090f
        L_0x0909:
            pj3.g r0 = r1.f115488e
            r12 = 1
            r0.mo72529n(r11, r12)
        L_0x090f:
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r3)
            com.tencent.mm.ui.base.preference.KeyValuePreference r0 = (com.tencent.p014mm.p136ui.base.preference.KeyValuePreference) r0
            ug.c$b r11 = r1.f115493j
            ug.c$b$f r11 = r11.mo73513f()
            java.lang.String r11 = r11.f146842b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0938
            ug.c$b r3 = r1.f115493j
            ug.c$b$f r3 = r3.mo73513f()
            java.lang.String r3 = r3.f146842b
            r0.mo7741E(r3)
            r0.mo69914K(r4)
            r3 = 0
            r0.mo69912I(r3)
            goto L_0x094f
        L_0x0938:
            pj3.g r0 = r1.f115488e
            r13 = 1
            r0.mo72529n(r3, r13)
            goto L_0x094f
        L_0x093f:
            r13 = 1
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r12, r13)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r11, r13)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r3, r13)
        L_0x094f:
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r0 = r1.f115492i
            java.lang.String r3 = "contact_info_bindwxainfo"
            if (r0 == 0) goto L_0x0972
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0972
            pj3.g r0 = r1.f115488e
            r11 = 0
            r0.mo72529n(r3, r11)
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r3)
            com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference r0 = (com.tencent.p014mm.plugin.profile.p088ui.BizBindWxaInfoPreference) r0
            ug.c r3 = r1.f115490g
            java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r11 = r1.f115492i
            r0.mo66721I(r3, r11)
            r11 = 1
            goto L_0x0978
        L_0x0972:
            pj3.g r0 = r1.f115488e
            r11 = 1
            r0.mo72529n(r3, r11)
        L_0x0978:
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "Contact_BIZ_KF_WORKER_ID"
            java.lang.String r0 = r0.getStringExtra(r3)
            r1.mo66805n(r0)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.mm.ui.MMActivity r3 = r1.f115487d
            android.content.Intent r3 = r3.getIntent()
            java.lang.String r11 = "KIsHardDevice"
            r12 = 0
            boolean r3 = r3.getBooleanExtra(r11, r12)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0[r12] = r3
            java.lang.String r3 = "KIsardDevice(%b)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r0)
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "contact_info_template_recv"
            if (r0 == 0) goto L_0x0b6d
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            android.content.Intent r0 = r0.getIntent()
            boolean r0 = r0.getBooleanExtra(r11, r12)
            if (r0 == 0) goto L_0x0b6d
            java.lang.String r0 = "Hard device biz..."
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r0)
            boolean r0 = r21.mo66793b()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.mm.storage.z1 r7 = r1.f115489f
            boolean r7 = r7.mo62927s3()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r5[r12] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            r9 = 1
            r5[r9] = r7
            java.lang.String r7 = "contact.isContact()(%b), isHardDeviceBound(%b)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r7, r5)
            com.tencent.mm.storage.z1 r5 = r1.f115489f
            boolean r5 = r5.mo62927s3()
            if (r5 == 0) goto L_0x0b04
            if (r0 == 0) goto L_0x0b04
            if (r2 == 0) goto L_0x0a7b
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r6)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            pj3.g r5 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r5 = r5.mo72519a(r15)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r5 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r5
            boolean r6 = r2.mo73501s2()
            if (r6 == 0) goto L_0x0a21
            sb0.k r6 = rb0.C48009v0.Bx0()
            java.lang.String r7 = r2.field_username
            java.lang.String r6 = r6.mo73076Pk(r7)
            sb0.k r7 = rb0.C48009v0.Bx0()
            sb0.j r6 = r7.get(r6)
            if (r6 == 0) goto L_0x0a1b
            boolean r4 = r6.mo73073l2(r4)
            r6 = 1
            r4 = r4 ^ r6
            r0.mo6805K(r4)
            goto L_0x0a28
        L_0x0a1b:
            java.lang.String r0 = "bizChatMyuser bizChatUserInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0a28
        L_0x0a21:
            boolean r4 = r2.mo73508z2()
            r0.mo6805K(r4)
        L_0x0a28:
            boolean r0 = r2.mo73508z2()
            if (r0 == 0) goto L_0x0a56
            ug.c$b r0 = r1.f115493j
            if (r0 != 0) goto L_0x0a38
            ug.c$b r0 = r2.mo73499q2()
            r1.f115493j = r0
        L_0x0a38:
            ug.c$b r0 = r1.f115493j
            if (r0 == 0) goto L_0x0a4f
            boolean r0 = r0.mo73526s()
            if (r0 == 0) goto L_0x0a4f
            java.lang.String r0 = "brandservice"
            ke3.C88144b.m109788f(r0)
            pj3.g r0 = r1.f115488e
            r4 = 0
            r0.mo72529n(r3, r4)
            r4 = 1
            goto L_0x0a5c
        L_0x0a4f:
            pj3.g r0 = r1.f115488e
            r4 = 1
            r0.mo72529n(r3, r4)
            goto L_0x0a5c
        L_0x0a56:
            r4 = 1
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r3, r4)
        L_0x0a5c:
            ug.c$b r0 = r2.mo73499q2()
            boolean r0 = r0.mo73525r()
            if (r0 == 0) goto L_0x0a6e
            boolean r0 = r2.mo73495m2()
            r5.mo6805K(r0)
            goto L_0x0a8b
        L_0x0a6e:
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r15, r4)
            boolean r0 = r2.mo73495m2()
            r5.mo6805K(r0)
            goto L_0x0a8b
        L_0x0a7b:
            r4 = 1
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r6, r4)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r15, r4)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r3, r4)
        L_0x0a8b:
            pj3.g r0 = r1.f115488e
            java.lang.String r2 = "contact_info_biz_read_msg_online"
            r0.mo72529n(r2, r4)
            pj3.g r0 = r1.f115488e
            r11 = r19
            r0.mo72529n(r11, r4)
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.mo62898f()
            if (r0 == 0) goto L_0x0aa6
            com.tencent.mm.ui.MMActivity r2 = r1.f115487d
            r2.setMMTitle((java.lang.String) r0)
        L_0x0aa6:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85793A5(r0)
            if (r0 == 0) goto L_0x0adf
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r8)
            com.tencent.mm.ui.base.preference.ButtonPreference r0 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r0
            com.tencent.mm.ui.MMActivity r2 = r1.f115487d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131824296(0x7f110ea8, float:1.9281416E38)
            java.lang.String r2 = r2.getString(r3)
            com.tencent.mm.ui.MMActivity r3 = r1.f115487d
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100190(0x7f06021e, float:1.7812754E38)
            int r3 = r3.getColor(r4)
            r0.mo101917K(r2, r3)
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r2 = 2131824376(0x7f110ef8, float:1.9281578E38)
            r0.setMMTitle((int) r2)
        L_0x0adf:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85842m5(r0)
            if (r0 != 0) goto L_0x0b6c
            ug.c r0 = r1.f115490g
            if (r0 == 0) goto L_0x0b6c
            boolean r0 = r0.mo73502t2()
            if (r0 != 0) goto L_0x0b6c
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r2 = 2131756370(0x7f100552, float:1.9143646E38)
            com.tencent.mm.plugin.profile.ui.o0$g r3 = new com.tencent.mm.plugin.profile.ui.o0$g
            r3.<init>()
            r4 = 0
            r0.addIconOptionMenu(r4, r2, r3)
            goto L_0x0b6c
        L_0x0b04:
            r11 = r19
            r4 = 0
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.mm.storage.z1 r7 = r1.f115489f
            java.lang.String r7 = r7.getUsername()
            r5[r4] = r7
            java.lang.String r7 = "%s is not my hard biz contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r7, r5)
            r21.mo66803l()
            pj3.g r5 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r5 = r5.mo72519a(r11)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            boolean r7 = r1.f115501u
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r4] = r7
            java.lang.String r4 = "isBizConferenceAccount(%b)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r4, r3)
            if (r5 == 0) goto L_0x0b40
            if (r0 == 0) goto L_0x0b3a
            r0 = 2131824060(0x7f110dbc, float:1.9280937E38)
            r5.mo69923G(r0)
            goto L_0x0b40
        L_0x0b3a:
            r0 = 2131824046(0x7f110dae, float:1.9280909E38)
            r5.mo69923G(r0)
        L_0x0b40:
            int r0 = r1.f115494n
            boolean r0 = r1.mo66800i(r0)
            if (r0 == 0) goto L_0x0b66
            if (r2 != 0) goto L_0x0b50
            java.lang.String r0 = "bizinfo is null in temp session"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0b66
        L_0x0b50:
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r6)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            boolean r2 = r2.mo73508z2()
            r0.mo6805K(r2)
            pj3.g r0 = r1.f115488e
            r2 = 0
            r0.mo72529n(r6, r2)
            goto L_0x0b67
        L_0x0b66:
            r2 = 0
        L_0x0b67:
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r0.showOptionMenu(r2)
        L_0x0b6c:
            return
        L_0x0b6d:
            r11 = r19
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            boolean r0 = r0.mo62927s3()
            if (r0 == 0) goto L_0x0cb4
            if (r2 == 0) goto L_0x0c2f
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r6)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            pj3.g r6 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r6 = r6.mo72519a(r15)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r6 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r6
            boolean r9 = r2.mo73501s2()
            if (r9 == 0) goto L_0x0bb9
            r9 = 2131825147(0x7f1111fb, float:1.9283142E38)
            r0.mo69923G(r9)
            sb0.k r9 = rb0.C48009v0.Bx0()
            java.lang.String r12 = r2.field_username
            java.lang.String r9 = r9.mo73076Pk(r12)
            sb0.k r12 = rb0.C48009v0.Bx0()
            sb0.j r9 = r12.get(r9)
            if (r9 == 0) goto L_0x0bb3
            boolean r4 = r9.mo73073l2(r4)
            r9 = 1
            r4 = r4 ^ r9
            r0.mo6805K(r4)
            goto L_0x0bdc
        L_0x0bb3:
            java.lang.String r0 = "bizChatMyuser bizChatUserInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0bdc
        L_0x0bb9:
            boolean r4 = r2.mo72811g1()
            if (r4 == 0) goto L_0x0bd5
            r4 = 2131825155(0x7f111203, float:1.9283158E38)
            r0.mo69923G(r4)
            rb0.i r4 = rb0.C48009v0.Ex0()
            java.lang.String r9 = r2.field_username
            boolean r4 = r4.mo72750kD(r9)
            r9 = 1
            r4 = r4 ^ r9
            r0.mo6805K(r4)
            goto L_0x0bdc
        L_0x0bd5:
            boolean r4 = r2.mo73508z2()
            r0.mo6805K(r4)
        L_0x0bdc:
            boolean r0 = r2.mo73508z2()
            if (r0 == 0) goto L_0x0c0a
            ug.c$b r0 = r1.f115493j
            if (r0 != 0) goto L_0x0bec
            ug.c$b r0 = r2.mo73499q2()
            r1.f115493j = r0
        L_0x0bec:
            ug.c$b r0 = r1.f115493j
            if (r0 == 0) goto L_0x0c03
            boolean r0 = r0.mo73526s()
            if (r0 == 0) goto L_0x0c03
            java.lang.String r0 = "brandservice"
            ke3.C88144b.m109788f(r0)
            pj3.g r0 = r1.f115488e
            r4 = 0
            r0.mo72529n(r3, r4)
            r4 = 1
            goto L_0x0c10
        L_0x0c03:
            pj3.g r0 = r1.f115488e
            r4 = 1
            r0.mo72529n(r3, r4)
            goto L_0x0c10
        L_0x0c0a:
            r4 = 1
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r3, r4)
        L_0x0c10:
            ug.c$b r0 = r2.mo73499q2()
            boolean r0 = r0.mo73525r()
            if (r0 == 0) goto L_0x0c22
            boolean r0 = r2.mo73495m2()
            r6.mo6805K(r0)
            goto L_0x0c3f
        L_0x0c22:
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r15, r4)
            boolean r0 = r2.mo73495m2()
            r6.mo6805K(r0)
            goto L_0x0c3f
        L_0x0c2f:
            r4 = 1
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r6, r4)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r15, r4)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r3, r4)
        L_0x0c3f:
            pj3.g r0 = r1.f115488e
            java.lang.String r2 = "contact_info_biz_read_msg_online"
            r0.mo72529n(r2, r4)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r11, r4)
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.mo62898f()
            if (r0 == 0) goto L_0x0c58
            com.tencent.mm.ui.MMActivity r2 = r1.f115487d
            r2.setMMTitle((java.lang.String) r0)
        L_0x0c58:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85793A5(r0)
            if (r0 == 0) goto L_0x0c95
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r8)
            com.tencent.mm.ui.base.preference.ButtonPreference r0 = (com.tencent.p014mm.p136ui.base.preference.ButtonPreference) r0
            r2 = 1
            r0.mo101918L(r2)
            com.tencent.mm.ui.MMActivity r2 = r1.f115487d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131824296(0x7f110ea8, float:1.9281416E38)
            java.lang.String r2 = r2.getString(r3)
            com.tencent.mm.ui.MMActivity r3 = r1.f115487d
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100190(0x7f06021e, float:1.7812754E38)
            int r3 = r3.getColor(r4)
            r0.mo101917K(r2, r3)
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r2 = 2131824376(0x7f110ef8, float:1.9281578E38)
            r0.setMMTitle((int) r2)
        L_0x0c95:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85842m5(r0)
            if (r0 != 0) goto L_0x0d0b
            ug.c r0 = r1.f115490g
            if (r0 == 0) goto L_0x0d0b
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r2 = 2131756370(0x7f100552, float:1.9143646E38)
            com.tencent.mm.plugin.profile.ui.o0$h r3 = new com.tencent.mm.plugin.profile.ui.o0$h
            r3.<init>()
            r4 = 0
            r0.addIconOptionMenu(r4, r2, r3)
            goto L_0x0d0b
        L_0x0cb4:
            r3 = 1
            r4 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.mm.storage.z1 r3 = r1.f115489f
            java.lang.String r3 = r3.getUsername()
            r0[r4] = r3
            java.lang.String r3 = "%s is not my contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r3, r0)
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r0.setMMTitle((java.lang.String) r9)
            r21.mo66803l()
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r11)
            if (r0 == 0) goto L_0x0cdf
            boolean r3 = r1.f115501u
            if (r3 == 0) goto L_0x0cdf
            r3 = 2131824060(0x7f110dbc, float:1.9280937E38)
            r0.mo69923G(r3)
        L_0x0cdf:
            int r0 = r1.f115494n
            boolean r0 = r1.mo66800i(r0)
            if (r0 == 0) goto L_0x0d05
            if (r2 != 0) goto L_0x0cef
            java.lang.String r0 = "bizinfo is null in temp session"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
            goto L_0x0d05
        L_0x0cef:
            pj3.g r0 = r1.f115488e
            com.tencent.mm.ui.base.preference.Preference r0 = r0.mo72519a(r6)
            com.tencent.mm.ui.base.preference.CheckBoxPreference r0 = (com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference) r0
            boolean r2 = r2.mo73508z2()
            r0.mo6805K(r2)
            pj3.g r0 = r1.f115488e
            r2 = 0
            r0.mo72529n(r6, r2)
            goto L_0x0d06
        L_0x0d05:
            r2 = 0
        L_0x0d06:
            com.tencent.mm.ui.MMActivity r0 = r1.f115487d
            r0.showOptionMenu(r2)
        L_0x0d0b:
            com.tencent.mm.storage.z1 r0 = r1.f115489f
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85805J5(r0)
            if (r0 == 0) goto L_0x0d28
            boolean r0 = eb0.C45628s0.m50756U()
            if (r0 == 0) goto L_0x0d28
            pj3.g r0 = r1.f115488e
            r2 = 1
            r0.mo72529n(r7, r2)
            pj3.g r0 = r1.f115488e
            r0.mo72529n(r5, r2)
        L_0x0d28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.C42660o0.mo66802k():void");
    }

    /* renamed from: l */
    public final void mo66803l() {
        C72996z1 z1Var = this.f115489f;
        if (z1Var == null || !z1Var.mo62927s3() || C72996z1.m85793A5(this.f115489f.getUsername()) || C45628s0.m50757V(this.f115489f.getUsername())) {
            this.f115488e.mo72529n("contact_is_mute", true);
            C72996z1 z1Var2 = this.f115489f;
            if (z1Var2 == null || z1Var2.mo62927s3() || !mo66800i(this.f115494n)) {
                this.f115488e.mo72529n("contact_info_expose_btn", true);
                mo66799h(true);
            } else {
                this.f115488e.mo72529n("contact_info_expose_btn", false);
                mo66799h(false);
            }
        } else {
            this.f115488e.mo72529n("contact_is_mute", false);
        }
        this.f115488e.mo72529n("contact_info_verifyuser_weibo", true);
        this.f115488e.mo72529n("contact_info_subscribe_bizinfo", true);
        this.f115488e.mo72529n("contact_info_template_recv", true);
        this.f115488e.mo72529n("contact_info_locate", true);
        if (!this.f115500t) {
            this.f115488e.mo72529n("contact_info_time_expired", true);
        } else {
            this.f115488e.mo72529n("contact_info_biz_add", true);
        }
        C72996z1 z1Var3 = this.f115489f;
        if (z1Var3 == null || ((!C72996z1.m85842m5(z1Var3.getUsername()) && !C45628s0.m50757V(this.f115489f.getUsername())) || !this.f115489f.mo62927s3())) {
            this.f115488e.mo72529n("contact_info_biz_go_chatting", true);
        } else {
            this.f115488e.mo72529n("contact_info_biz_go_chatting", false);
        }
        if (C45628s0.m50757V(this.f115489f.getUsername())) {
            this.f115488e.mo72529n("contact_info_user_desc", true);
        }
    }

    /* renamed from: m */
    public final void mo66804m(int i, String str) {
        int i2;
        int i3;
        String str2;
        Bundle bundle = this.f115482D;
        if (bundle == null || !((i2 = this.f115494n) == 39 || i2 == 56 || i2 == 35 || i2 == 87 || i2 == 88 || i2 == 89 || i2 == 85)) {
            Log.m105918d("MicroMsg.ContactWidgetBizInfo", "mExtArgs is null or the add contact action is not from biz search.");
        } else if (this.f115489f == null) {
            Log.m105924i("MicroMsg.ContactWidgetBizInfo", "contact is null.");
        } else {
            String string = bundle.getString("Contact_Ext_Args_Search_Id");
            String nullAsNil = Util.nullAsNil(this.f115482D.getString("Contact_Ext_Args_Query_String"));
            int i4 = this.f115482D.getInt("Contact_Ext_Args_Index");
            int i5 = this.f115494n;
            if (i5 == 35) {
                i3 = 1;
            } else if (i5 != 85) {
                switch (i5) {
                    case 87:
                        i3 = 2;
                        break;
                    case 88:
                        i3 = 3;
                        break;
                    case 89:
                        i3 = 4;
                        break;
                    default:
                        i3 = 0;
                        break;
                }
            } else {
                i3 = 5;
            }
            String nullAsNil2 = Util.nullAsNil(this.f115482D.getString("Contact_Ext_Extra_Params"));
            String str3 = nullAsNil + "," + i + "," + Util.nullAsNil(this.f115489f.getUsername()) + "," + i4 + "," + (System.currentTimeMillis() / 1000) + "," + string + "," + i3;
            if (!Util.isNullOrNil(str)) {
                str2 = str3 + "," + str + "," + nullAsNil2;
            } else {
                str2 = str3 + ",," + nullAsNil2;
            }
            Log.m105927v("MicroMsg.ContactWidgetBizInfo", "report 10866: %s", str2);
            C115669n.INSTANCE.kvStat(10866, str2);
        }
    }

    /* renamed from: n */
    public final void mo66805n(String str) {
        Class cls = C76708i.class;
        Log.m105919d("MicroMsg.ContactWidgetBizInfo", "updateKF %s, %b", str, Boolean.valueOf(this.f115506z));
        if (!this.f115506z) {
            this.f115505y = str;
            C52558c.C52560b bVar = this.f115493j;
            if (bVar != null) {
                JSONObject jSONObject = bVar.f146795a;
                if (jSONObject != null) {
                    bVar.f146819y = jSONObject.optInt("FunctionFlag");
                }
                int i = bVar.f146819y;
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52558c.f146783y0;
                if (((i & 1) > 0) && this.f115489f != null) {
                    if (Util.isNullOrNil(str)) {
                        C47987l qq = C48009v0.Hx0().mo72784qq(this.f115489f.getUsername());
                        if (qq == null) {
                            this.f115488e.mo72529n("contact_info_kf_worker", true);
                            C48009v0.Gx0().mo72774a(this);
                            C48009v0.Gx0().mo72776c(this.f115489f.getUsername(), C75592q0.m90789s());
                            this.f115506z = true;
                            return;
                        }
                        Log.m105919d("MicroMsg.ContactWidgetBizInfo", "has default kf %s", qq.field_openId);
                        this.f115488e.mo72529n("contact_info_kf_worker", false);
                        IconWidgetPreference iconWidgetPreference = (IconWidgetPreference) this.f115488e.mo72519a("contact_info_kf_worker");
                        iconWidgetPreference.mo7741E(qq.field_nickname);
                        Bitmap N50 = ((C76708i) C86312j.m106911c(cls)).N50(qq.field_openId);
                        if (N50 == null) {
                            mo66797f(qq);
                            MMHandlerThread.postToMainThreadDelayed(new C5016t0(this, qq.field_openId), 2000);
                            return;
                        }
                        iconWidgetPreference.mo5914I(N50);
                        return;
                    }
                    C47994n Hx0 = C48009v0.Hx0();
                    C47987l Lo = Hx0.mo72780Lo(str);
                    if (Lo == null || Hx0.mo72782Yt(Lo)) {
                        C48009v0.Gx0().mo72774a(this);
                        C48009v0.Gx0().mo72777d(this.f115489f.getUsername(), str, 1);
                        this.f115506z = true;
                    }
                    if (Lo == null) {
                        Log.m105918d("MicroMsg.ContactWidgetBizInfo", "no such kf, get default kf");
                        Lo = Hx0.mo72784qq(this.f115489f.getUsername());
                    }
                    if (Lo == null) {
                        this.f115488e.mo72529n("contact_info_kf_worker", true);
                        return;
                    }
                    this.f115488e.mo72529n("contact_info_kf_worker", false);
                    IconWidgetPreference iconWidgetPreference2 = (IconWidgetPreference) this.f115488e.mo72519a("contact_info_kf_worker");
                    iconWidgetPreference2.mo7741E(Lo.field_nickname);
                    Bitmap N502 = ((C76708i) C86312j.m106911c(cls)).N50(Lo.field_openId);
                    if (N502 == null) {
                        mo66797f(Lo);
                        MMHandlerThread.postToMainThreadDelayed(new C5016t0(this, Lo.field_openId), 2000);
                    } else {
                        iconWidgetPreference2.mo5914I(N502);
                    }
                    Log.m105919d("MicroMsg.ContactWidgetBizInfo", "kf worker %s, %s", Lo.field_openId, Lo.field_nickname);
                    return;
                }
            }
            this.f115488e.mo72529n("contact_info_kf_worker", true);
        }
    }

    /* renamed from: o */
    public final void mo66806o(boolean z) {
        if (this.f115489f != null) {
            if (this.f115487d != null) {
                if (!z || ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(this.f115489f.getUsername())) {
                    this.f115487d.setTitleMuteIconVisibility(8);
                } else {
                    this.f115487d.setTitleMuteIconVisibility(0);
                }
            }
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f115488e.mo72519a("contact_is_mute");
            if (checkBoxPreference != null) {
                checkBoxPreference.mo6805K(z);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f115487d == null) {
            Log.m105920e("MicroMsg.ContactWidgetBizInfo", "null == context");
            return;
        }
        Log.m105925i("MicroMsg.ContactWidgetBizInfo", "onActivityResult, requestCode = %d, resultCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("be_send_card_name");
            String stringExtra2 = intent.getStringExtra("received_card_name");
            boolean booleanExtra = intent.getBooleanExtra("Is_Chatroom", false);
            String stringExtra3 = intent.getStringExtra("custom_send_text");
            C7250m.m7431a().Y50(stringExtra, stringExtra2, booleanExtra);
            C7250m.m7431a().mo136252Ar(stringExtra3, stringExtra2);
            MMActivity mMActivity = this.f115487d;
            C75026b.m89951a(mMActivity, mMActivity.getString(C0966R.string.euo));
        }
    }

    public boolean onDetach() {
        BizInfoHeaderPreference bizInfoHeaderPreference = (BizInfoHeaderPreference) this.f115488e.mo72519a("contact_info_header_bizinfo");
        if (bizInfoHeaderPreference == null) {
            return true;
        }
        bizInfoHeaderPreference.mo66732K();
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: te3.ud4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: te3.i24} */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0089, code lost:
        r5 = r4.f127056b.f127083a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r4, int r5, java.lang.String r6, ob0.C117747y r7) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onSceneEnd errType = "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", errCode = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ",errMsg = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "MicroMsg.ContactWidgetBizInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r6)
            r6 = 0
            r3.f115506z = r6
            qo3.i0 r1 = r3.f115485G
            if (r1 == 0) goto L_0x0039
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L_0x0039
            qo3.i0 r1 = r3.f115485G
            r1.dismiss()
        L_0x0039:
            if (r7 != 0) goto L_0x0042
            java.lang.String r4 = "scene == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)
            return
        L_0x0042:
            ob0.b0 r1 = eb0.C97625j3.m125815e()
            int r2 = r7.getType()
            r1.mo123470p(r2, r3)
            java.lang.String r1 = "scene.getType() = %s"
            r2 = 1
            if (r4 != 0) goto L_0x029d
            if (r5 == 0) goto L_0x0057
            goto L_0x029d
        L_0x0057:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r7.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r4)
            int r4 = r7.getType()
            r5 = 536(0x218, float:7.51E-43)
            if (r4 != r5) goto L_0x007a
            ob0.b0 r4 = eb0.C97625j3.m125815e()
            r4.mo123470p(r5, r3)
            r3.mo66802k()
            goto L_0x029c
        L_0x007a:
            int r4 = r7.getType()
            r5 = 1363(0x553, float:1.91E-42)
            r1 = 0
            if (r4 != r5) goto L_0x012a
            ef2.c r7 = (ef2.C45653c) r7
            ob0.c r4 = r7.f123450e
            if (r4 == 0) goto L_0x0092
            ob0.c$d r5 = r4.f127056b
            pe3.a r5 = r5.f127083a
            if (r5 == 0) goto L_0x0092
            te3.j24 r5 = (te3.C49934j24) r5
            goto L_0x0093
        L_0x0092:
            r5 = r1
        L_0x0093:
            if (r4 == 0) goto L_0x009e
            ob0.c$c r4 = r4.f127055a
            pe3.a r4 = r4.f127080a
            if (r4 == 0) goto L_0x009e
            r1 = r4
            te3.i24 r1 = (te3.C49789i24) r1
        L_0x009e:
            if (r5 == 0) goto L_0x010c
            te3.am3 r4 = r5.f135829d
            if (r4 == 0) goto L_0x010c
            int r4 = r4.f130638d
            if (r4 != 0) goto L_0x010c
            te3.ef r4 = r5.f135830e
            if (r4 == 0) goto L_0x010c
            java.lang.String r4 = r4.f132889d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x00b5
            goto L_0x010c
        L_0x00b5:
            te3.ef r4 = r5.f135830e
            if (r4 != 0) goto L_0x00c0
            java.lang.String r4 = "willen onSceneEnd resp.user == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
            return
        L_0x00c0:
            sb0.k r4 = rb0.C48009v0.Bx0()
            te3.ef r7 = r5.f135830e
            java.lang.String r7 = r7.f132889d
            sb0.j r4 = r4.get(r7)
            if (r4 != 0) goto L_0x00d9
            sb0.j r4 = new sb0.j
            r4.<init>()
            te3.ef r7 = r5.f135830e
            java.lang.String r7 = r7.f132889d
            r4.field_userId = r7
        L_0x00d9:
            te3.ef r5 = r5.f135830e
            java.lang.String r7 = r5.f132890e
            r4.field_userName = r7
            java.lang.String r7 = r1.f135038d
            r4.field_brandUserName = r7
            int r7 = r5.f132891f
            r4.field_UserVersion = r7
            java.lang.String r7 = r5.f132892g
            r4.field_headImageUrl = r7
            java.lang.String r7 = r5.f132893h
            r4.field_profileUrl = r7
            int r7 = r5.f132894i
            r4.field_bitFlag = r7
            java.lang.String r5 = r5.f132895j
            r4.field_addMemberUrl = r5
            r4.field_needToUpdate = r6
            sb0.k r5 = rb0.C48009v0.Bx0()
            boolean r5 = r5.mo73075Lo(r4)
            if (r5 != 0) goto L_0x029c
            sb0.k r5 = rb0.C48009v0.Bx0()
            r5.insert(r4)
            goto L_0x029c
        L_0x010c:
            if (r5 == 0) goto L_0x0123
            te3.am3 r4 = r5.f135829d
            if (r4 == 0) goto L_0x0123
            java.lang.Object[] r5 = new java.lang.Object[r2]
            int r4 = r4.f130638d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r6] = r4
            java.lang.String r4 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r5)
            goto L_0x0129
        L_0x0123:
            java.lang.String r4 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r4)
        L_0x0129:
            return
        L_0x012a:
            int r4 = r7.getType()
            r5 = 1394(0x572, float:1.953E-42)
            if (r4 != r5) goto L_0x0285
            r4 = r7
            ef2.d r4 = (ef2.C45654d) r4
            ob0.c r4 = r4.f123452e
            if (r4 == 0) goto L_0x0142
            ob0.c$c r5 = r4.f127055a
            pe3.a r5 = r5.f127080a
            if (r5 == 0) goto L_0x0142
            te3.td4 r5 = (te3.td4) r5
            goto L_0x0143
        L_0x0142:
            r5 = r1
        L_0x0143:
            if (r4 == 0) goto L_0x014e
            ob0.c$d r4 = r4.f127056b
            pe3.a r4 = r4.f127083a
            if (r4 == 0) goto L_0x014e
            r1 = r4
            te3.ud4 r1 = (te3.ud4) r1
        L_0x014e:
            if (r1 == 0) goto L_0x0250
            te3.am3 r4 = r1.f142790d
            if (r4 == 0) goto L_0x0250
            int r4 = r4.f130638d
            if (r4 == 0) goto L_0x015a
            goto L_0x0250
        L_0x015a:
            boolean r4 = r5.f142140e
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0207
            ug.c r4 = r3.f115490g
            int r5 = r4.field_brandFlag
            r5 = r5 & -2
            r4.field_brandFlag = r5
            r3.mo66792a(r4, r2)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            java.lang.String r6 = r4.field_username
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            com.tencent.mm.storage.h2 r5 = r5.mo69771j(r6)
            if (r5 != 0) goto L_0x01cd
            com.tencent.mm.storage.h2 r5 = new com.tencent.mm.storage.h2
            java.lang.String r6 = r4.field_username
            r5.<init>(r6)
            ug.c r6 = r3.f115490g
            java.lang.String r6 = r6.mo73498p2()
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r5.mo108807c3(r6)
            eb0.c r6 = eb0.C97625j3.m125812b()
            g62.l r6 = r6.mo105911z()
            java.lang.String r7 = r4.field_username
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            com.tencent.mm.storage.f4 r6 = r6.Ex0(r7)
            if (r6 == 0) goto L_0x01bd
            eb0.c r7 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r7 = r7.mo105908w()
            com.tencent.mm.storage.i2 r7 = (com.tencent.p014mm.storage.C44660i2) r7
            r7.mo69751W(r5)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            r5.mo69777o0(r6)
            goto L_0x01cd
        L_0x01bd:
            r5.mo101162m3()
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            r6.mo69751W(r5)
        L_0x01cd:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            java.lang.String r6 = r4.field_enterpriseFather
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            com.tencent.mm.storage.h2 r5 = r5.mo69771j(r6)
            if (r5 != 0) goto L_0x01f8
            com.tencent.mm.storage.h2 r5 = new com.tencent.mm.storage.h2
            java.lang.String r4 = r4.field_enterpriseFather
            r5.<init>(r4)
            r5.mo101162m3()
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            r4.mo69751W(r5)
            goto L_0x029c
        L_0x01f8:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.b0 r5 = r5.mo105898m()
            java.lang.String r4 = r4.field_enterpriseFather
            r5.mo69633b(r4)
            goto L_0x029c
        L_0x0207:
            ug.c r4 = r3.f115490g
            int r5 = r4.field_brandFlag
            r5 = r5 | r2
            r4.field_brandFlag = r5
            r3.mo66792a(r4, r2)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            java.lang.String r6 = r4.field_username
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            r5.mo69763f(r6)
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            java.lang.String r6 = r4.field_enterpriseFather
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            int r5 = r5.mo69740K(r6)
            if (r5 > 0) goto L_0x0242
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r5 = r5.mo105908w()
            java.lang.String r4 = r4.field_enterpriseFather
            com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5
            r5.mo69763f(r4)
            goto L_0x029c
        L_0x0242:
            eb0.c r5 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.b0 r5 = r5.mo105898m()
            java.lang.String r4 = r4.field_enterpriseFather
            r5.mo69633b(r4)
            goto L_0x029c
        L_0x0250:
            if (r1 == 0) goto L_0x0273
            te3.am3 r4 = r1.f142790d
            if (r4 == 0) goto L_0x0273
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r7.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r6] = r5
            te3.am3 r5 = r1.f142790d
            int r5 = r5.f130638d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            java.lang.String r5 = "chuangchen onSceneEnd type:%s, err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r5, r4)
            goto L_0x0284
        L_0x0273:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r7.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r6] = r5
            java.lang.String r5 = "chuangchen onSceneEnd type:%s, err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r5, r4)
        L_0x0284:
            return
        L_0x0285:
            int r4 = r7.getType()
            r5 = 1343(0x53f, float:1.882E-42)
            if (r4 != r5) goto L_0x0291
            r3.mo66802k()
            goto L_0x029c
        L_0x0291:
            int r4 = r7.getType()
            r5 = 1228(0x4cc, float:1.721E-42)
            if (r4 != r5) goto L_0x029c
            r3.mo66802k()
        L_0x029c:
            return
        L_0x029d:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r5 = r7.getType()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.C42660o0.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    /* renamed from: p */
    public final void mo66807p() {
        Log.m105918d("MicroMsg.ContactWidgetBizInfo", "updatePlaceTop");
        if (this.f115480B == null) {
            MMActivity mMActivity = this.f115487d;
            this.f115480B = mMActivity.getSharedPreferences(this.f115487d.getPackageName() + "_preferences", 0);
        }
        if (this.f115481C != null) {
            if (this.f115489f != null) {
                this.f115480B.edit().putBoolean("biz_placed_to_the_top", this.f115489f.mo62940x3()).commit();
            } else {
                this.f115480B.edit().putBoolean("biz_placed_to_the_top", false).commit();
            }
        }
        this.f115488e.notifyDataSetChanged();
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        Class cls = C48053v.class;
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(Util.nullAsNil(z1Var.getUsername()).length() > 0);
        Assert.assertTrue(gVar != null);
        this.f115488e = gVar;
        this.f115489f = z1Var;
        this.f115495o = z;
        this.f115494n = i;
        this.f115504x = this.f115487d.getIntent().getIntExtra("add_more_friend_search_scene", 0);
        this.f115483E = (SnsAdClick) this.f115487d.getIntent().getParcelableExtra("KSnsAdTag");
        this.f115482D = this.f115487d.getIntent().getBundleExtra("Contact_Ext_Args");
        this.f115484F = this.f115487d.getIntent().getStringExtra("key_add_contact_report_info");
        mo66802k();
        String stringExtra = this.f115487d.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
        if (!Util.isNullOrNil(stringExtra)) {
            this.f115487d.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
            MMActivity mMActivity = this.f115487d;
            C76879j.m92754y(mMActivity, stringExtra, "", mMActivity.getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
        }
        C48009v0.wx0().mo72736c(z1Var.getUsername(), (C47961a.C12965b) null);
        if (C47984k.m53338l(z1Var.getUsername())) {
            String username = z1Var.getUsername();
            if (((C48053v) C86312j.m106911c(cls)).mo72614OE(username)) {
                C48009v0.yx0().mo73062h(username, this);
                String p2 = C47984k.m53328b(username).mo73498p2();
                if (p2 != null) {
                    C48009v0.wx0().mo72736c(p2, (C47961a.C12965b) null);
                }
            } else if (((C48053v) C86312j.m106911c(cls)).mo72617gl(username)) {
                C48009v0.Ex0().mo72745SE(username, this);
                String TE = C48009v0.Fx0().mo72758TE(username);
                if (TE != null) {
                    C48009v0.wx0().mo72736c(TE, (C47961a.C12965b) null);
                }
            }
        }
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        int i;
        Preference a;
        C52558c.C52560b r2;
        int i2;
        int i3;
        int i4;
        String str2 = str;
        if (str2 == null) {
            return false;
        }
        if (str2.equals("contact_info_verifyuser_weibo")) {
            C45908a aVar = new C45908a(this.f115487d);
            C72996z1 z1Var = this.f115489f;
            aVar.mo71332a(z1Var.f149545p0, z1Var.getUsername());
            return true;
        } else if ("contact_info_biz_go_chatting".endsWith(str2)) {
            if (this.f115483E != null) {
                ReportAdClickEvent reportAdClickEvent = new ReportAdClickEvent();
                SnsAdClick snsAdClick = this.f115483E;
                snsAdClick.f267472g = 5;
                reportAdClickEvent.f9426d.f9427a = snsAdClick;
                reportAdClickEvent.publish();
            }
            C52558c cVar = this.f115490g;
            if (cVar == null || (!cVar.mo72811g1() && !this.f115490g.mo73501s2())) {
                Intent intent = new Intent();
                if (this.f115487d.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false)) {
                    intent.setFlags(268435456);
                }
                if (this.f115495o) {
                    intent.putExtra("Chat_User", this.f115489f.getUsername());
                    intent.putExtra("Chat_Mode", 1);
                    this.f115487d.setResult(-1, intent);
                } else {
                    intent.putExtra("Chat_User", this.f115489f.getUsername());
                    intent.putExtra("Chat_Mode", 1);
                    intent.putExtra("finish_direct", true);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, this.f115487d);
                }
            } else {
                Intent intent2 = new Intent();
                if (this.f115490g.mo73501s2()) {
                    String p2 = this.f115490g.mo73498p2();
                    if (Util.isNullOrNil(p2)) {
                        Log.m105928w("MicroMsg.ContactWidgetBizInfo", "contact_info_biz_go_chatting fatherUserName is empty");
                        return false;
                    }
                    intent2.putExtra("enterprise_biz_name", p2);
                    intent2.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(p2));
                } else {
                    intent2.putExtra("enterprise_biz_name", this.f115489f.getUsername());
                    intent2.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f115489f.getUsername()));
                }
                intent2.addFlags(67108864);
                C88144b.m109801s(this.f115487d, ".ui.conversation.EnterpriseConversationUI", intent2, (Bundle) null);
                this.f115487d.finish();
            }
            mo66804m(5, (String) null);
            return true;
        } else if ("contact_info_biz_add".endsWith(str2)) {
            Class cls = C45696d.class;
            if (((C45696d) C86709a0.m107533q(cls)).mo70993g3()) {
                mo66794c();
            } else {
                ((C45696d) C86709a0.m107533q(cls)).Bw0(this.f115487d, new C42645n0(this));
            }
            int i5 = this.f115504x;
            if (i5 != 0) {
                C115669n.INSTANCE.mo160131h(11263, Integer.valueOf(i5), this.f115489f.getUsername());
            }
            return true;
        } else if ("contact_info_biz_read_msg_online".endsWith(str2)) {
            return true;
        } else {
            if ("contact_info_stick_biz".equals(str2)) {
                if (((CheckBoxPreference) this.f115488e.mo72519a("contact_info_stick_biz")).mo6804J()) {
                    C115669n.INSTANCE.mo160131h(13307, this.f115489f.getUsername(), 1, 1, 0, "", Integer.valueOf(this.f115494n));
                    C45618p.m50718b(this.f115489f.getUsername(), true);
                } else {
                    C45628s0.m50803u0(this.f115489f.getUsername(), true);
                    C115669n.INSTANCE.mo160131h(13307, this.f115489f.getUsername(), 1, 2, 0, "", Integer.valueOf(this.f115494n));
                }
                return true;
            }
            if ("contact_info_guarantee_info".equals(str2) && this.f115493j.mo73513f() != null && !Util.isNullOrNil(this.f115493j.mo73513f().f146844d)) {
                Intent intent3 = new Intent();
                intent3.putExtra("rawUrl", this.f115493j.mo73513f().f146844d);
                intent3.putExtra("useJs", true);
                intent3.putExtra("vertical_scroll", true);
                intent3.putExtra("geta8key_scene", 3);
                C88144b.m109791i(this.f115487d, "webview", ".ui.tools.WebViewUI", intent3, (Bundle) null);
            }
            if (str2.startsWith("contact_info_bizinfo_external#") && (i2 = Util.getInt(str2.replace("contact_info_bizinfo_external#", ""), -1)) >= 0 && i2 < this.f115491h.size()) {
                C52558c.C52559a aVar2 = this.f115491h.get(i2);
                String str3 = aVar2.f146788c;
                Intent intent4 = new Intent();
                intent4.putExtra("rawUrl", str3);
                intent4.putExtra("useJs", true);
                intent4.putExtra("vertical_scroll", true);
                intent4.putExtra("geta8key_scene", 3);
                intent4.putExtra("KPublisherId", "brand_profile");
                intent4.putExtra("prePublishId", "brand_profile");
                if ((this.f115482D != null && ((i4 = this.f115494n) == 39 || i4 == 56 || i4 == 35)) || (i3 = this.f115494n) == 87 || i3 == 89 || i3 == 85 || i3 == 88) {
                    Log.m105918d("MicroMsg.ContactWidgetBizInfo", "from biz search.");
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("KFromBizSearch", true);
                    bundle.putBundle("KBizSearchExtArgs", this.f115482D);
                    intent4.putExtra("jsapiargs", bundle);
                    int i6 = this.f115489f.mo62927s3() ? 7 : 6;
                    int identifier = this.f115487d.getResources().getIdentifier(aVar2.f146787b, "string", this.f115487d.getPackageName());
                    String str4 = aVar2.f146786a;
                    if (identifier > 0) {
                        str4 = this.f115487d.getString(identifier);
                    }
                    mo66804m(i6, str4);
                }
                C88144b.m109791i(this.f115487d, "webview", ".ui.tools.WebViewUI", intent4, (Bundle) null);
                return true;
            } else if ("contact_info_subscribe_bizinfo".endsWith(str2) || "contact_info_show_brand".endsWith(str2) || "contact_info_locate".endsWith(str2)) {
                C52558c cVar2 = this.f115490g;
                if (cVar2 == null) {
                    return true;
                }
                if ("contact_info_subscribe_bizinfo".endsWith(str2)) {
                    if (!cVar2.mo73503u2()) {
                        if (cVar2.mo73508z2()) {
                            cVar2.field_brandFlag |= 1;
                            if (this.f115493j == null) {
                                this.f115493j = cVar2.mo73500r2(false);
                            }
                            C52558c.C52560b bVar = this.f115493j;
                            if (bVar == null || !bVar.mo73526s()) {
                                i = 1;
                                this.f115488e.mo72529n("contact_info_template_recv", true);
                            } else {
                                C88144b.m109788f("brandservice");
                                this.f115488e.mo72529n("contact_info_template_recv", false);
                                i = 1;
                            }
                        } else {
                            i = 1;
                            cVar2.field_brandFlag &= -2;
                            this.f115488e.mo72529n("contact_info_template_recv", true);
                        }
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr = new Object[6];
                        objArr[0] = cVar2.field_username;
                        objArr[i] = Integer.valueOf(i);
                        objArr[2] = Integer.valueOf(cVar2.mo73508z2() ? 3 : 4);
                        objArr[3] = 0;
                        objArr[4] = "";
                        objArr[5] = Integer.valueOf(this.f115494n);
                        nVar.mo160131h(13307, objArr);
                    } else if (cVar2.mo73501s2()) {
                        C97625j3.m125815e().mo123455a(1363, this);
                        C45653c cVar3 = new C45653c(cVar2.field_username, ((CheckBoxPreference) this.f115488e.mo72519a("contact_info_subscribe_bizinfo")).mo6804J() ? 0 : 4, 4);
                        C97625j3.m125815e().mo123460f(cVar3);
                        MMActivity mMActivity = this.f115487d;
                        this.f115485G = C76879j.m92723Q(mMActivity, mMActivity.getString(C0966R.string.a3h), this.f115487d.getString(C0966R.string.a4d), true, true, new C42778u0(this, cVar3));
                    } else if (cVar2.mo72811g1()) {
                        C47971i Ex0 = C48009v0.Ex0();
                        String str5 = cVar2.field_username;
                        boolean z = !((CheckBoxPreference) this.f115488e.mo72519a("contact_info_subscribe_bizinfo")).mo6804J();
                        Ex0.getClass();
                        C50122kf kfVar = new C50122kf();
                        kfVar.f136726d = str5;
                        kfVar.f136729g = z ? 17 : 0;
                        kfVar.f136727e = 0;
                        C48007u0 u0Var = new C48007u0(kfVar, 17, 1, this);
                        C48007u0 u0Var2 = C86709a0.m107529k().f251779b.mo123461g(u0Var, 0) ? u0Var : null;
                        MMActivity mMActivity2 = this.f115487d;
                        this.f115485G = C76879j.m92723Q(mMActivity2, mMActivity2.getString(C0966R.string.a3h), this.f115487d.getString(C0966R.string.a4d), true, true, new C42779v0(this, u0Var2));
                    }
                } else if ("contact_info_show_brand".endsWith(str2)) {
                    int i7 = cVar2.field_brandFlag;
                    if ((i7 & 2) == 0) {
                        cVar2.field_brandFlag = i7 | 2;
                    } else {
                        cVar2.field_brandFlag = i7 & -3;
                    }
                } else if ("contact_info_locate".endsWith(str2)) {
                    if (cVar2.mo73495m2()) {
                        cVar2.field_brandFlag &= -5;
                    } else {
                        MMActivity mMActivity3 = this.f115487d;
                        C76879j.m92750u(mMActivity3, mMActivity3.getString(C0966R.string.b76, new Object[]{this.f115489f.mo62898f()}), this.f115487d.getString(C0966R.string.a3h), new C42663c(cVar2), new C42664d(cVar2));
                    }
                }
                if (cVar2.mo73501s2() || cVar2.mo72811g1()) {
                    return true;
                }
                mo66792a(cVar2, false);
                return true;
            } else if ("contact_info_verifyuser".endsWith(str2)) {
                if (C72996z1.m85805J5(this.f115489f.getUsername()) && WeChatSomeFeatureSwitch.hardcodeWeChatUSTeam()) {
                    return true;
                }
                if (C45628s0.m50756U()) {
                    Log.m105924i("MicroMsg.ContactWidgetBizInfo", "contact_info_verifyuser no click isWeChatUser.");
                    return true;
                }
                C52558c cVar4 = this.f115490g;
                if (cVar4 == null || (r2 = cVar4.mo73500r2(false)) == null) {
                    return true;
                }
                String str6 = (r2.mo73521n() == null || Util.isNullOrNil(r2.mo73521n().f146839d)) ? (r2.mo73515h() == null || Util.isNullOrNil(r2.mo73515h().f146849b)) ? null : r2.mo73515h().f146849b : r2.mo73521n().f146839d;
                if (Util.isNullOrNil(str6)) {
                    return true;
                }
                Intent intent5 = new Intent();
                intent5.putExtra("rawUrl", str6);
                intent5.putExtra("useJs", true);
                intent5.putExtra("vertical_scroll", true);
                intent5.putExtra("geta8key_scene", 3);
                C88144b.m109791i(this.f115487d, "webview", ".ui.tools.WebViewUI", intent5, (Bundle) null);
                return true;
            } else if ("contact_info_trademark".endsWith(str2)) {
                C52558c cVar5 = this.f115490g;
                if (cVar5 == null || cVar5.mo73500r2(false) == null || Util.isNullOrNil(cVar5.mo73500r2(false).mo73520m())) {
                    return true;
                }
                Intent intent6 = new Intent();
                intent6.putExtra("rawUrl", cVar5.mo73500r2(false).mo73520m());
                intent6.putExtra("useJs", true);
                intent6.putExtra("vertical_scroll", true);
                intent6.putExtra("geta8key_scene", 3);
                C88144b.m109791i(this.f115487d, "webview", ".ui.tools.WebViewUI", intent6, (Bundle) null);
                return true;
            } else {
                if ("contact_is_mute".endsWith(str2)) {
                    boolean z2 = !this.f115498r;
                    this.f115498r = z2;
                    if (z2) {
                        C45628s0.m50779i0(this.f115489f, true);
                    } else {
                        C45628s0.m50797r0(this.f115489f, true);
                    }
                    mo66806o(this.f115498r);
                }
                if ("enterprise_contact_info_enter".equals(str2)) {
                    if (this.f115487d == null) {
                        Log.m105920e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise context is null");
                    } else if (this.f115490g == null) {
                        Log.m105920e("MicroMsg.ContactWidgetBizInfo", "EnterEnterprise bizInfo is null");
                    } else {
                        Intent intent7 = new Intent();
                        intent7.putExtra("enterprise_biz_name", this.f115490g.field_username);
                        intent7.addFlags(67108864);
                        C88144b.m109791i(this.f115487d, "brandservice", ".ui.EnterpriseBizContactListUI", intent7, (Bundle) null);
                    }
                }
                if ("contact_info_biz_disable".equals(str2)) {
                    String string = this.f115487d.getString(C0966R.string.cay);
                    String string2 = this.f115487d.getString(C0966R.string.cax);
                    MMActivity mMActivity4 = this.f115487d;
                    C76879j.m92707A(mMActivity4, string, "", string2, mMActivity4.getString(C0966R.string.f7926wf), new C42665e(), (DialogInterface.OnClickListener) null);
                }
                if ("contact_info_biz_enable".equals(str2)) {
                    mo66796e(true);
                }
                if ("contact_info_template_recv".equals(str2)) {
                    Intent intent8 = new Intent();
                    intent8.putExtra("enterprise_biz_name", this.f115490g.field_username);
                    C88144b.m109791i(this.f115487d, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", intent8, (Bundle) null);
                }
                if ("contact_info_service_phone".equals(str2) && (a = this.f115488e.mo72519a("contact_info_service_phone")) != null && a.mo5913r() != null && !Util.isNullOrNil(a.mo5913r().toString())) {
                    String charSequence = a.mo5913r().toString();
                    MMActivity mMActivity5 = this.f115487d;
                    C76879j.m92717K(mMActivity5, true, charSequence, "", mMActivity5.getString(C0966R.string.bls), this.f115487d.getString(C0966R.string.f7926wf), new C5003p0(this, charSequence), (DialogInterface.OnClickListener) null);
                }
                if ("contact_info_expose_btn".equals(str2)) {
                    mo66795d();
                }
                if (str2.equals("biz_placed_to_the_top")) {
                    Log.m105918d("MicroMsg.ContactWidgetBizInfo", "changePlacedTop");
                    if (this.f115480B == null) {
                        this.f115480B = this.f115487d.getSharedPreferences(this.f115487d.getPackageName() + "_preferences", 0);
                    }
                    C72996z1 z1Var2 = this.f115489f;
                    if (z1Var2 != null) {
                        if (z1Var2.mo62940x3()) {
                            Log.m105919d("MicroMsg.ContactWidgetBizInfo", "unSetPlaceTop:%s", this.f115489f.getUsername());
                            C45628s0.m50803u0(this.f115489f.getUsername(), true);
                            this.f115480B.edit().putBoolean("biz_placed_to_the_top", false).commit();
                            return true;
                        }
                        C45618p.m50718b(this.f115489f.getUsername(), true);
                        Log.m105919d("MicroMsg.ContactWidgetBizInfo", "setPlaceTop:%s", this.f115489f.getUsername());
                        this.f115480B.edit().putBoolean("biz_placed_to_the_top", true).commit();
                        return true;
                    }
                }
                return true;
            }
        }
    }
}
