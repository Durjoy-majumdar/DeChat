package com.tencent.p014mm.plugin.profile.p088ui.newbizinfo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1841q2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82378e4;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import cw0.C116541b;
import d62.C75339i;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gy3.C87412m;
import hf2.C46035f;
import hf2.C46047i;
import hf2.C46048j;
import hf2.C46049k;
import hf2.C46050l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import jl0.C9464d;
import ke3.C88144b;
import kf2.C46723f;
import nj3.C76879j;
import p154fy.C87121j;
import p248ug.C52558c;
import pj3.C47511g;
import qo3.C89779i0;
import rb0.C47984k;
import rb0.C48009v0;
import rd0.C22222c;
import rd0.C22226d;
import rd0.C22227f;
import rd0.C48018e;
import tb0.C22474a;
import tc0.C48628g;
import tc0.C77885p;
import te3.C48926by2;
import te3.C49618gw;
import te3.C49939j34;
import te3.C52054y14;

/* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI */
public class NewBizInfoSettingUI extends MMPreference {

    /* renamed from: v */
    public static final /* synthetic */ int f115445v = 0;

    /* renamed from: d */
    public C47511g f115446d;

    /* renamed from: e */
    public C72996z1 f115447e;

    /* renamed from: f */
    public C52558c f115448f;

    /* renamed from: g */
    public SharedPreferences f115449g = null;

    /* renamed from: h */
    public C52558c.C52560b f115450h;

    /* renamed from: i */
    public boolean f115451i;

    /* renamed from: j */
    public int f115452j;

    /* renamed from: n */
    public long f115453n;

    /* renamed from: o */
    public long f115454o;

    /* renamed from: p */
    public C22222c f115455p = C48018e.f128802a.mo72802a("name_biz");

    /* renamed from: q */
    public SubscribeMsgRequestResult f115456q;

    /* renamed from: r */
    public ArrayList<C42652e> f115457r = new ArrayList<>();

    /* renamed from: s */
    public C89779i0 f115458s = null;

    /* renamed from: t */
    public boolean f115459t = false;

    /* renamed from: u */
    public C52054y14 f115460u;

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI$a */
    public class C42648a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52558c f115461d;

        public C42648a(C52558c cVar) {
            this.f115461d = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar = this.f115461d;
            cVar.field_hadAlert = 1;
            cVar.field_brandFlag |= 4;
            NewBizInfoSettingUI newBizInfoSettingUI = NewBizInfoSettingUI.this;
            int i2 = NewBizInfoSettingUI.f115445v;
            newBizInfoSettingUI.mo66782H7(cVar, true);
            String username = NewBizInfoSettingUI.this.f115447e.getUsername();
            NewBizInfoSettingUI newBizInfoSettingUI2 = NewBizInfoSettingUI.this;
            C46723f.m52020b(username, C1841q2.CTRL_INDEX, newBizInfoSettingUI2.f115453n, newBizInfoSettingUI2.getIntent());
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI$b */
    public class C42649b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C52558c f115463d;

        public C42649b(C52558c cVar) {
            this.f115463d = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar = this.f115463d;
            cVar.field_hadAlert = 1;
            NewBizInfoSettingUI newBizInfoSettingUI = NewBizInfoSettingUI.this;
            int i2 = NewBizInfoSettingUI.f115445v;
            newBizInfoSettingUI.mo66782H7(cVar, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI$c */
    public class C42650c implements DialogInterface.OnClickListener {
        public C42650c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C52558c cVar;
            NewBizInfoSettingUI newBizInfoSettingUI = NewBizInfoSettingUI.this;
            C52558c cVar2 = newBizInfoSettingUI.f115448f;
            boolean z = cVar2 != null && cVar2.mo73507y2();
            String username = newBizInfoSettingUI.f115447e.getUsername();
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48628g(username, ((C72972g4) C97625j3.m125812b().mo105911z()).Rx0(username).mo108774y2()));
            newBizInfoSettingUI.f115459t = false;
            newBizInfoSettingUI.f115458s = C76879j.m92723Q(newBizInfoSettingUI, newBizInfoSettingUI.getString(C0966R.string.a3h), newBizInfoSettingUI.getString(C0966R.string.a4d), true, true, new C46048j(newBizInfoSettingUI));
            C75604z3.m90836h(username, new C46049k(newBizInfoSettingUI, z, username));
            C48009v0.Jx0().mo25795Yt(username);
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(username, 15);
            String username2 = NewBizInfoSettingUI.this.f115447e.getUsername();
            NewBizInfoSettingUI newBizInfoSettingUI2 = NewBizInfoSettingUI.this;
            C46723f.m52020b(username2, C9464d.CTRL_INDEX, newBizInfoSettingUI2.f115453n, newBizInfoSettingUI2.getIntent());
            NewBizInfoSettingUI newBizInfoSettingUI3 = NewBizInfoSettingUI.this;
            if (newBizInfoSettingUI3.f115447e != null && (cVar = newBizInfoSettingUI3.f115448f) != null && cVar.mo73506x2()) {
                C48009v0.Cx0().mo72789b(newBizInfoSettingUI3.f115447e.getUsername(), 17, 0, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null, 0, newBizInfoSettingUI3.f115460u, (C49939j34) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI$d */
    public class C42651d implements C22226d {
        public C42651d() {
        }

        /* renamed from: a */
        public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            Log.m105924i("MicroMsg.NewBizInfoSettingUI", "alvinluo updateSubscribeMsgList success");
            NewBizInfoSettingUI newBizInfoSettingUI = NewBizInfoSettingUI.this;
            SubscribeMsgRequestResult subscribeMsgRequestResult2 = newBizInfoSettingUI.f115456q;
            if (subscribeMsgRequestResult2 != null) {
                ArrayList<SubscribeMsgTmpItem> arrayList = subscribeMsgRequestResult2.f49004h;
                for (int i = 0; i < arrayList.size(); i++) {
                    SubscribeMsgTmpItem subscribeMsgTmpItem = arrayList.get(i);
                    if (subscribeMsgTmpItem != null) {
                        for (int i2 = 0; i2 < subscribeMsgRequestResult.f49004h.size(); i2++) {
                            SubscribeMsgTmpItem subscribeMsgTmpItem2 = subscribeMsgRequestResult.f49004h.get(i2);
                            if (subscribeMsgTmpItem2 != null && subscribeMsgTmpItem.f49021f.equals(subscribeMsgTmpItem2.f49021f)) {
                                subscribeMsgTmpItem.f49025j = subscribeMsgTmpItem2.f49025j;
                            }
                        }
                    }
                }
                newBizInfoSettingUI.f115456q.f49008o = subscribeMsgRequestResult.f49008o;
            }
        }

        /* renamed from: e */
        public void mo26258e(int i, int i2, String str) {
            Log.m105921e("MicroMsg.NewBizInfoSettingUI", "alvinluo updateSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI$e */
    public interface C42652e {
        /* renamed from: k2 */
        void mo66790k2(C47511g gVar, Preference preference);
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI$f */
    public static class C42653f implements C22226d {

        /* renamed from: a */
        public final WeakReference<Activity> f115467a;

        public C42653f(Activity activity) {
            this.f115467a = new WeakReference<>(activity);
        }

        /* renamed from: a */
        public void mo26257a(String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
            NewBizInfoSettingUI newBizInfoSettingUI;
            if (this.f115467a.get() != null && (newBizInfoSettingUI = (NewBizInfoSettingUI) this.f115467a.get()) != null && !newBizInfoSettingUI.isFinishing() && !newBizInfoSettingUI.isDestroyed()) {
                boolean z = subscribeMsgRequestResult.f49009p;
                Log.m105925i("MicroMsg.NewBizInfoSettingUI", "alvinluo initSubscribeMsgEntry getSubscribeMsgList onSuccess size: %d, showEntry: %b", Integer.valueOf(subscribeMsgRequestResult.f49004h.size()), Boolean.valueOf(subscribeMsgRequestResult.f49009p));
                newBizInfoSettingUI.f115446d.mo72529n("contact_info_subscribe_msg", !z);
                newBizInfoSettingUI.f115456q = subscribeMsgRequestResult;
            }
        }

        /* renamed from: e */
        public void mo26258e(int i, int i2, String str) {
            NewBizInfoSettingUI newBizInfoSettingUI;
            if (this.f115467a.get() != null && (newBizInfoSettingUI = (NewBizInfoSettingUI) this.f115467a.get()) != null && !newBizInfoSettingUI.isFinishing() && !newBizInfoSettingUI.isDestroyed()) {
                Log.m105921e("MicroMsg.NewBizInfoSettingUI", "alvinluo initSubscribeMsgEntry getSubscribeMsgList onError errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                newBizInfoSettingUI.f115446d.mo72529n("contact_info_subscribe_msg", true);
            }
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.f360885fm3);
    }

    /* renamed from: H7 */
    public final void mo66782H7(C52558c cVar, boolean z) {
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f115446d.mo72519a("contact_info_subscribe_bizinfo");
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f115446d.mo72519a("contact_info_locate");
        C48926by2 by22 = new C48926by2();
        by22.f131388d = cVar.field_brandFlag;
        by22.f131389e = this.f115447e.getUsername();
        if (mo66783I7(this.f115452j)) {
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
            initView();
            this.f115446d.notifyDataSetChanged();
        }
    }

    /* renamed from: I7 */
    public final boolean mo66783I7(int i) {
        return i == 81 || i == 92 || i == 93 || i == 94;
    }

    /* renamed from: J7 */
    public final void mo66784J7() {
        C72996z1 z1Var = this.f115447e;
        if (z1Var == null || !z1Var.mo62927s3() || C72996z1.m85793A5(this.f115447e.getUsername()) || C45628s0.m50757V(this.f115447e.getUsername())) {
            this.f115446d.mo72529n("contact_is_mute", true);
        } else {
            C52558c cVar = this.f115448f;
            if (cVar == null || !cVar.mo73506x2()) {
                this.f115446d.mo72529n("contact_is_mute", true);
            } else {
                this.f115446d.mo72529n("contact_is_mute", false);
            }
        }
        this.f115446d.mo72529n("contact_info_verifyuser_weibo", true);
        this.f115446d.mo72529n("contact_info_subscribe_bizinfo", true);
        this.f115446d.mo72529n("contact_info_template_recv", true);
        this.f115446d.mo72529n("contact_info_locate", true);
    }

    /* renamed from: K7 */
    public final void mo66785K7(boolean z) {
        C52558c cVar;
        if (this.f115447e != null && (cVar = this.f115448f) != null && cVar.mo73506x2()) {
            C49939j34 j342 = new C49939j34();
            j342.f135851e = C45628s0.m50746K(this.f115447e) ? 1 : 0;
            j342.f135850d = getIntent().getIntExtra("key_start_biz_profile_setting_from_scene", 0);
            C48009v0.Cx0().mo72789b(this.f115447e.getUsername(), z ? 15 : 16, 0, 0.0f, 0.0f, 0, (LinkedList<C49618gw>) null, 0, (C52054y14) null, j342);
        }
    }

    /* renamed from: L7 */
    public final void mo66786L7(boolean z) {
        C52558c cVar;
        if (this.f115447e != null) {
            if (this.f115449g == null) {
                this.f115449g = getSharedPreferences(getPackageName() + "_preferences", 0);
            }
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f115446d.mo72519a("contact_is_mute");
            if (!z || (cVar = this.f115448f) == null || !cVar.mo73506x2()) {
                setTitleMuteIconVisibility(8);
                if (checkBoxPreference != null) {
                    this.f115449g.edit().putBoolean("contact_is_mute", false).commit();
                }
            } else {
                setTitleMuteIconVisibility(0);
                if (checkBoxPreference != null) {
                    this.f115449g.edit().putBoolean("contact_is_mute", true).commit();
                }
            }
            if (checkBoxPreference != null) {
                checkBoxPreference.mo6805K(z);
                this.f115446d.notifyDataSetChanged();
            }
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8923bh;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet();
        hashSet.add(C46035f.class);
        return hashSet;
    }

    public void initView() {
        C52558c cVar;
        boolean z;
        C52558c cVar2;
        C52558c cVar3;
        C22222c cVar4;
        C52558c cVar5 = this.f115448f;
        if (cVar5 != null) {
            this.f115450h = cVar5.mo73500r2(false);
        }
        C52558c cVar6 = this.f115448f;
        if (cVar6 == null) {
            this.f115446d.mo72529n("contact_is_mute", true);
        } else if (cVar6.mo73506x2()) {
            this.f115446d.mo72529n("contact_is_mute", false);
        } else {
            this.f115446d.mo72529n("contact_is_mute", true);
        }
        this.f115446d.mo72529n("contact_info_subscribe_msg", true);
        C72996z1 z1Var = this.f115447e;
        if (!(z1Var == null || !z1Var.mo62927s3() || (cVar3 = this.f115448f) == null || !cVar3.mo73506x2() || (cVar4 = this.f115455p) == null)) {
            cVar4.mo35376q(this.f115448f.field_username, new C42653f(this));
        }
        boolean K = C45628s0.m50746K(this.f115447e);
        this.f115451i = K;
        mo66786L7(K);
        Log.m105919d("MicroMsg.NewBizInfoSettingUI", "KIsardDevice(%b)", Boolean.valueOf(getIntent().getBooleanExtra("KIsHardDevice", false)));
        if (getIntent() != null && getIntent().getBooleanExtra("KIsHardDevice", false)) {
            Log.m105918d("MicroMsg.NewBizInfoSettingUI", "Hard device biz...");
            if (getIntent() == null) {
                z = false;
            } else {
                String stringExtra = getIntent().getStringExtra(TPDownloadProxyEnum.USER_DEVICE_ID);
                String stringExtra2 = getIntent().getStringExtra("device_type");
                ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = new ExDeviceCheckDeviceIsBoundEvent();
                ExDeviceCheckDeviceIsBoundEvent.C40062a aVar = exDeviceCheckDeviceIsBoundEvent.f107435d;
                aVar.f107438b = stringExtra;
                aVar.f107437a = stringExtra2;
                exDeviceCheckDeviceIsBoundEvent.publish();
                z = exDeviceCheckDeviceIsBoundEvent.f107436e.f107439a;
            }
            Log.m105919d("MicroMsg.NewBizInfoSettingUI", "contact.isContact()(%b), isHardDeviceBound(%b)", Boolean.valueOf(this.f115447e.mo62927s3()), Boolean.valueOf(z));
            if (!this.f115447e.mo62927s3() || !z) {
                Log.m105929w("MicroMsg.NewBizInfoSettingUI", "%s is not my hard biz contact", this.f115447e.getUsername());
                mo66784J7();
                if (!mo66783I7(this.f115452j)) {
                    return;
                }
                if (this.f115448f == null) {
                    Log.m105920e("MicroMsg.NewBizInfoSettingUI", "bizinfo is null in temp session");
                    return;
                }
                ((CheckBoxPreference) this.f115446d.mo72519a("contact_info_subscribe_bizinfo")).mo6805K(this.f115448f.mo73508z2());
                this.f115446d.mo72529n("contact_info_subscribe_bizinfo", false);
            } else if (this.f115448f != null) {
                ((CheckBoxPreference) this.f115446d.mo72519a("contact_info_subscribe_bizinfo")).mo6805K(this.f115448f.mo73508z2());
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f115446d.mo72519a("contact_info_locate");
                if (this.f115448f.mo73500r2(false).mo73525r()) {
                    checkBoxPreference.mo6805K(this.f115448f.mo73495m2());
                } else {
                    this.f115446d.mo72529n("contact_info_locate", true);
                    checkBoxPreference.mo6805K(this.f115448f.mo73495m2());
                }
                if (this.f115448f.mo73508z2()) {
                    if (this.f115450h == null && (cVar2 = this.f115448f) != null) {
                        this.f115450h = cVar2.mo73500r2(false);
                    }
                    C52558c.C52560b bVar = this.f115450h;
                    if (bVar == null || !bVar.mo73526s()) {
                        this.f115446d.mo72529n("contact_info_template_recv", true);
                        return;
                    }
                    C88144b.m109788f("brandservice");
                    this.f115446d.mo72529n("contact_info_template_recv", false);
                    return;
                }
                this.f115446d.mo72529n("contact_info_template_recv", true);
            } else {
                this.f115446d.mo72529n("contact_info_subscribe_bizinfo", true);
                this.f115446d.mo72529n("contact_info_locate", true);
                this.f115446d.mo72529n("contact_info_template_recv", true);
                this.f115446d.mo72529n("contact_info_subscribe_msg", true);
            }
        } else if (!this.f115447e.mo62927s3()) {
            Log.m105929w("MicroMsg.NewBizInfoSettingUI", "%s is not my contact", this.f115447e.getUsername());
            mo66784J7();
            if (!mo66783I7(this.f115452j)) {
                return;
            }
            if (this.f115448f == null) {
                Log.m105920e("MicroMsg.NewBizInfoSettingUI", "bizinfo is null in temp session");
                return;
            }
            ((CheckBoxPreference) this.f115446d.mo72519a("contact_info_subscribe_bizinfo")).mo6805K(this.f115448f.mo73508z2());
            this.f115446d.mo72529n("contact_info_subscribe_bizinfo", false);
        } else if (this.f115448f != null) {
            ((CheckBoxPreference) this.f115446d.mo72519a("contact_info_subscribe_bizinfo")).mo6805K(this.f115448f.mo73508z2());
            if (this.f115448f.mo73508z2()) {
                if (this.f115450h == null && (cVar = this.f115448f) != null) {
                    this.f115450h = cVar.mo73500r2(false);
                }
                C52558c.C52560b bVar2 = this.f115450h;
                if (bVar2 == null || !bVar2.mo73526s()) {
                    this.f115446d.mo72529n("contact_info_template_recv", true);
                } else {
                    C88144b.m109788f("brandservice");
                    this.f115446d.mo72529n("contact_info_template_recv", false);
                }
            } else {
                this.f115446d.mo72529n("contact_info_template_recv", true);
            }
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f115446d.mo72519a("contact_info_locate");
            if (this.f115448f.mo73500r2(false).mo73525r()) {
                checkBoxPreference2.mo6805K(this.f115448f.mo73495m2());
                return;
            }
            this.f115446d.mo72529n("contact_info_locate", true);
            checkBoxPreference2.mo6805K(this.f115448f.mo73495m2());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.NewBizInfoSettingUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1001 && intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("key_need_update", false);
            ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (ISubscribeMsgService$Companion$SubscribeMsgListWrapper) intent.getParcelableExtra("key_biz_data");
            if (booleanExtra && iSubscribeMsgService$Companion$SubscribeMsgListWrapper != null && this.f115448f != null && this.f115455p != null) {
                C22227f fVar = new C22227f();
                String nullAs = Util.nullAs(this.f115448f.field_username, "");
                C87412m.m108594g(nullAs, "<set-?>");
                fVar.f62967a = nullAs;
                ((ArrayList) fVar.f62969c).addAll(iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f49048d);
                fVar.f62970d = iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f49049e;
                fVar.f62975i = new C42651d();
                this.f115455p.mo35370k(fVar);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f115446d = getPreferenceScreen();
        this.f115454o = System.currentTimeMillis() / 1000;
        setMMTitle((int) C0966R.string.bl9);
        boolean z = false;
        setTitleDividerVis(false);
        hideActionbarLine();
        setBackBtn(new C46047i(this));
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("Contact_User"));
        this.f115447e = C97625j3.m125812b().mo105907v().get(nullAsNil);
        this.f115448f = C47984k.m53328b(nullAsNil);
        Object[] objArr = new Object[3];
        objArr[0] = nullAsNil;
        objArr[1] = Boolean.valueOf(this.f115447e != null);
        if (this.f115448f != null) {
            z = true;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.NewBizInfoSettingUI", "user:%s contact:%b, bizInfo:%b", objArr);
        this.f115452j = getIntent().getIntExtra("Contact_Scene", 9);
        this.f115453n = getIntent().getLongExtra("key_profile_enter_timestamp", 0);
        initView();
        mo66785K7(true);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f115457r.clear();
        mo66785K7(false);
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C47511g gVar2 = gVar;
        Preference preference2 = preference;
        String str = preference2.f121285r;
        Log.m105924i("MicroMsg.NewBizInfoSettingUI", str + " item has been clicked!");
        Iterator<C42652e> it = this.f115457r.iterator();
        while (it.hasNext()) {
            it.next().mo66790k2(gVar2, preference2);
        }
        if ("contact_info_locate".endsWith(str)) {
            C52558c cVar = this.f115448f;
            if (cVar == null) {
                return true;
            }
            if (cVar.mo73495m2()) {
                cVar.field_brandFlag &= -5;
            } else {
                C76879j.m92750u(this, getString(C0966R.string.b77, new Object[]{this.f115447e.mo62898f()}), getString(C0966R.string.a3h), new C42648a(cVar), new C42649b(cVar));
            }
            mo66782H7(cVar, false);
            if (((CheckBoxPreference) gVar2.mo72519a("contact_info_locate")).mo6804J()) {
                C46723f.m52020b(this.f115447e.getUsername(), C82378e4.CTRL_INDEX, this.f115453n, getIntent());
            } else {
                C46723f.m52020b(this.f115447e.getUsername(), 907, this.f115453n, getIntent());
            }
        }
        if ("contact_info_add_shortcut_btn".equals(str)) {
            Log.m105918d("MicroMsg.NewBizInfoSettingUI", "dealAddShortcut, username = " + this.f115447e.getUsername());
            C116541b.m164359i(this, this.f115447e.getUsername());
            MMHandlerThread.postToMainThreadDelayed(new C46050l(this), 1000);
        }
        if ("contact_info_clear_msg".equals(str)) {
            Class cls = C75700k0.class;
            C52558c cVar2 = this.f115448f;
            if (cVar2 != null && cVar2.mo73506x2()) {
                C52054y14 y142 = new C52054y14();
                this.f115460u = y142;
                y142.f145079h = 0;
                C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j(this.f115447e.getUsername());
                if (j != null) {
                    this.f115460u.f145077f = j.mo108786G2();
                }
                C72963f4 Ex0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ex0(this.f115447e.getUsername());
                if (Ex0 != null) {
                    this.f115460u.f145078g = Ex0.getType();
                    C52054y14 y143 = this.f115460u;
                    if (y143.f145077f > 0) {
                        y143.f145076e = ((int) (System.currentTimeMillis() - Ex0.getCreateTime())) / 1000;
                    }
                }
            }
            C76879j.m92707A(this, getString(C0966R.string.bk6), "", getString(C0966R.string.bk4), getString(C0966R.string.f7926wf), new C42650c(), (DialogInterface.OnClickListener) null);
            C46723f.m52020b(this.f115447e.getUsername(), 909, this.f115453n, getIntent());
        }
        if ("contact_is_mute".endsWith(str)) {
            boolean z = !this.f115451i;
            this.f115451i = z;
            if (z) {
                C45628s0.m50779i0(this.f115447e, true);
            } else {
                C45628s0.m50797r0(this.f115447e, true);
            }
            mo66786L7(this.f115451i);
        }
        if ("contact_info_template_recv".equals(str)) {
            Intent intent = new Intent();
            intent.putExtra("enterprise_biz_name", this.f115448f.field_username);
            C88144b.m109791i(this, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", intent, (Bundle) null);
        }
        if ("contact_info_subscribe_msg".equals(str) && this.f115456q != null) {
            Intent intent2 = new Intent();
            intent2.putExtra("key_biz_username", this.f115448f.field_username);
            intent2.putExtra("key_biz_presenter_class", C22474a.class.getName());
            intent2.putExtra("key_biz_nickname", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(this.f115448f.field_username));
            intent2.putExtra("key_biz_data", this.f115456q);
            intent2.putExtra("key_need_update", false);
            intent2.putExtra("key_enter_scene", 1);
            C88144b.m109802t(this, "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI", intent2, 1001);
        }
        if ("contact_info_subscribe_bizinfo".endsWith(str)) {
            C52558c cVar3 = this.f115448f;
            if (cVar3 == null) {
                return true;
            }
            int i = 4;
            if (cVar3.mo73508z2()) {
                cVar3.field_brandFlag |= 1;
                if (this.f115450h == null) {
                    this.f115450h = cVar3.mo73500r2(false);
                }
                C52558c.C52560b bVar = this.f115450h;
                if (bVar == null || !bVar.mo73526s()) {
                    gVar2.mo72529n("contact_info_template_recv", true);
                } else {
                    C88144b.m109788f("brandservice");
                    gVar2.mo72529n("contact_info_template_recv", false);
                }
                String str2 = cVar3.field_username;
                long j2 = this.f115454o;
                C87412m.m108594g(str2, "brandUserName");
                C115669n.INSTANCE.mo160131h(17748, str2, Long.valueOf(System.currentTimeMillis() / 1000), 0, Long.valueOf(j2), 0);
            } else {
                cVar3.field_brandFlag &= -2;
                gVar2.mo72529n("contact_info_template_recv", true);
            }
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = cVar3.field_username;
            objArr[1] = 1;
            if (cVar3.mo73508z2()) {
                i = 3;
            }
            objArr[2] = Integer.valueOf(i);
            objArr[3] = 0;
            nVar.mo160131h(13307, objArr);
            mo66782H7(cVar3, false);
            if (((CheckBoxPreference) gVar2.mo72519a("contact_info_subscribe_bizinfo")).mo6804J()) {
                C46723f.m52020b(this.f115447e.getUsername(), 901, this.f115453n, getIntent());
            } else {
                C46723f.m52020b(this.f115447e.getUsername(), C82613z.CTRL_INDEX, this.f115453n, getIntent());
            }
        }
        return false;
    }
}
