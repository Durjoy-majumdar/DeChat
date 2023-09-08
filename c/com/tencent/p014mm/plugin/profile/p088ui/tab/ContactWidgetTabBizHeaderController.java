package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.BizFinderLineStatusChangedEvent;
import com.tencent.p014mm.autogen.events.ExDeviceBindHardDeviceEvent;
import com.tencent.p014mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent;
import com.tencent.p014mm.autogen.events.ReportAdClickEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import d62.C75339i;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C97625j3;
import ex0.C45695b;
import ex0.C45696d;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import ke3.C88144b;
import kf2.C46723f;
import kg3.C76577a;
import ky2.C10432i;
import l31.C61212e;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C39989b;
import p185kq.C61130g;
import p196ln.C76708i;
import p214om.C11502f;
import p248ug.C37468y;
import p248ug.C52558c;
import p248ug.C52570c0;
import qo3.C89779i0;
import rb0.C47961a;
import rb0.C47984k;
import rb0.C48009v0;
import te3.C49001ch;
import te3.C51091rd;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController */
public class ContactWidgetTabBizHeaderController implements C11385n {

    /* renamed from: Q */
    public static long f115537Q;

    /* renamed from: A */
    public String f115538A;

    /* renamed from: B */
    public String f115539B = "";

    /* renamed from: C */
    public int f115540C = 0;

    /* renamed from: D */
    public long f115541D;

    /* renamed from: E */
    public C52558c.C52560b f115542E;

    /* renamed from: F */
    public AppBarLayout f115543F;

    /* renamed from: G */
    public ContactWidgetActionLiveBar f115544G;

    /* renamed from: H */
    public C42686g f115545H;

    /* renamed from: I */
    public Bundle f115546I;

    /* renamed from: J */
    public View f115547J;

    /* renamed from: K */
    public C72996z1 f115548K;

    /* renamed from: L */
    public int f115549L = 0;

    /* renamed from: M */
    public C45695b f115550M;

    /* renamed from: N */
    public IListener f115551N;

    /* renamed from: P */
    public long f115552P;

    /* renamed from: d */
    public boolean f115553d = false;

    /* renamed from: e */
    public boolean f115554e = false;

    /* renamed from: f */
    public String f115555f = "";

    /* renamed from: g */
    public MMActivity f115556g;

    /* renamed from: h */
    public View f115557h;

    /* renamed from: i */
    public C42718i0 f115558i;

    /* renamed from: j */
    public C72996z1 f115559j;

    /* renamed from: n */
    public String f115560n;

    /* renamed from: o */
    public C52558c f115561o;

    /* renamed from: p */
    public C49001ch f115562p;

    /* renamed from: q */
    public String f115563q = null;

    /* renamed from: r */
    public C42734m f115564r;

    /* renamed from: s */
    public SnsAdClick f115565s = null;

    /* renamed from: t */
    public C42713g f115566t;

    /* renamed from: u */
    public C89779i0 f115567u;

    /* renamed from: v */
    public int f115568v;

    /* renamed from: w */
    public boolean f115569w;

    /* renamed from: x */
    public boolean f115570x = false;

    /* renamed from: y */
    public String f115571y;

    /* renamed from: z */
    public String f115572z;

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$BizFinderLineStatusChangedEventListenerImpl */
    public static class BizFinderLineStatusChangedEventListenerImpl extends IListener<BizFinderLineStatusChangedEvent> {

        /* renamed from: d */
        public WeakReference<ContactWidgetTabBizHeaderController> f115573d;

        public BizFinderLineStatusChangedEventListenerImpl(ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController) {
            super(C40008f.f107254d);
            this.f115573d = new WeakReference<>(contactWidgetTabBizHeaderController);
            this.__eventId = -1230141771;
        }

        public boolean callback(IEvent iEvent) {
            BizFinderLineStatusChangedEvent bizFinderLineStatusChangedEvent = (BizFinderLineStatusChangedEvent) iEvent;
            WeakReference<ContactWidgetTabBizHeaderController> weakReference = this.f115573d;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            Log.m105924i("MicroMsg.ContactWidgetTabBizHeaderController", "callback");
            ContactWidgetTabBizHeaderController.m46369a(this.f115573d.get());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$a */
    public class C42680a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f115574d;

        public C42680a(C117747y yVar) {
            this.f115574d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C97625j3.m125815e().mo123470p(536, ContactWidgetTabBizHeaderController.this);
            ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new ExDeviceBindHardDeviceEvent();
            ExDeviceBindHardDeviceEvent.C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
            aVar.f107428c = 2;
            aVar.f107429d = this.f115574d;
            exDeviceBindHardDeviceEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$b */
    public class C42681b implements C39989b.C0705b {
        public C42681b() {
        }

        /* renamed from: a */
        public void mo677a(boolean z, boolean z2, String str, String str2) {
            C52558c cVar;
            C52558c cVar2;
            if (z) {
                MMActivity mMActivity = ContactWidgetTabBizHeaderController.this.f115556g;
                C76879j.m92726T(mMActivity, mMActivity.getString(C0966R.string.bkt));
                ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
                C72996z1 z1Var = contactWidgetTabBizHeaderController.f115559j;
                contactWidgetTabBizHeaderController.getClass();
                String str3 = "";
                boolean z3 = false;
                if (z1Var == null || Util.isNullOrNil(str)) {
                    Log.m105920e("MicroMsg.ContactWidgetTabBizHeaderController", "respUsername == " + str + ", contact = " + z1Var);
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
                        Log.m105920e("MicroMsg.ContactWidgetTabBizHeaderController", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(z1Var.getUsername());
                        if (cVar2 != null) {
                            C48009v0.Fx0().insert(cVar2);
                        } else {
                            Class cls = C76708i.class;
                            C52558c b = C47984k.m53328b(z1Var2.getUsername());
                            boolean z4 = z1Var2.mo62916m3() && C47961a.m53282a();
                            if (b == null || (b.mo72809G1() && !z4)) {
                                Log.m105918d("MicroMsg.ContactWidgetTabBizHeaderController", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), str3);
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5() && !z4) {
                                Log.m105919d("MicroMsg.ContactWidgetTabBizHeaderController", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), str3);
                                ((C76708i) C86312j.m106911c(cls)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                if (ContactWidgetTabBizHeaderController.this.f115565s != null) {
                    ReportAdClickEvent reportAdClickEvent = new ReportAdClickEvent();
                    SnsAdClick snsAdClick = ContactWidgetTabBizHeaderController.this.f115565s;
                    snsAdClick.f267472g = 4;
                    reportAdClickEvent.f9426d.f9427a = snsAdClick;
                    reportAdClickEvent.publish();
                }
                C52558c SE = C48009v0.Fx0().mo72757SE(ContactWidgetTabBizHeaderController.this.f115559j.getUsername());
                SE.field_status = 1;
                if (!Util.isNullOrNil(SE.field_extInfo) || Util.isNullOrNil(SE.field_username) || (cVar = ContactWidgetTabBizHeaderController.this.f115561o) == null || !SE.field_username.equals(Util.nullAsNil(cVar.field_username))) {
                    C48009v0.Fx0().replace(SE);
                } else {
                    C48009v0.Fx0().replace(ContactWidgetTabBizHeaderController.this.f115561o);
                }
                boolean booleanExtra = ContactWidgetTabBizHeaderController.this.f115556g.getIntent().getBooleanExtra("key_biz_profile_stay_after_follow_op", false);
                boolean booleanExtra2 = ContactWidgetTabBizHeaderController.this.f115556g.getIntent().getBooleanExtra("key_start_biz_profile_from_app_brand_profile", false);
                if (SE.mo72811g1()) {
                    Intent intent = new Intent();
                    intent.putExtra("enterprise_biz_name", ContactWidgetTabBizHeaderController.this.f115559j.getUsername());
                    intent.putExtra("enterprise_biz_display_name", ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(ContactWidgetTabBizHeaderController.this.f115559j.getUsername()));
                    intent.putExtra("enterprise_from_scene", 7);
                    intent.addFlags(67108864);
                    C88144b.m109801s(ContactWidgetTabBizHeaderController.this.f115556g, ".ui.conversation.EnterpriseConversationUI", intent, (Bundle) null);
                    ContactWidgetTabBizHeaderController.this.f115556g.finish();
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Chat_User", ContactWidgetTabBizHeaderController.this.f115559j.getUsername());
                    intent2.putExtra("key_has_add_contact", true);
                    intent2.putExtra("finish_direct", true);
                    if (booleanExtra2) {
                        intent2.addFlags(268435456);
                    }
                    if (ContactWidgetTabBizHeaderController.this.f115556g.getIntent().getBundleExtra("Contact_Ext_Args") != null) {
                        str3 = ContactWidgetTabBizHeaderController.this.f115556g.getIntent().getBundleExtra("Contact_Ext_Args").getString("Contact_Ext_Args_Search_Click_Id", str3);
                    }
                    intent2.putExtra("uinserve_search_click_id", str3);
                    C19636w0.f55624a = ContactWidgetTabBizHeaderController.this.f115559j.getUsername();
                    C42686g gVar = ContactWidgetTabBizHeaderController.this.f115545H;
                    if (gVar != null && gVar.mo66839c()) {
                        z3 = true;
                    }
                    if (!z3) {
                        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent2, ContactWidgetTabBizHeaderController.this.f115556g);
                    }
                    if (booleanExtra || booleanExtra2) {
                        ContactWidgetTabBizHeaderController.this.f115556g.finish();
                    }
                }
                ContactWidgetTabBizHeaderController.this.mo66830h(3, (String) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$c */
    public class C42682c implements C42716h0 {
        public C42682c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$d */
    public class C42683d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f115578d;

        public C42683d(String str) {
            this.f115578d = str;
        }

        public void run() {
            ContactWidgetTabBizHeaderController.this.f115556g.setMMTitle(this.f115578d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$e */
    public class C42684e implements Runnable {
        public C42684e() {
        }

        public void run() {
            ContactWidgetTabBizHeaderController.this.mo66830h(4, (String) null);
            if (ContactWidgetTabBizHeaderController.this.f115556g.getIntent().getIntExtra("Kdel_from", -1) == 1) {
                Intent intent = new Intent();
                intent.addFlags(67108864);
                C88144b.m109791i(ContactWidgetTabBizHeaderController.this.f115556g, "shake", ".ui.ShakeReportUI", intent, (Bundle) null);
            }
            C31519v2.m39436a().mo55986b(ContactWidgetTabBizHeaderController.this.f115559j.getUsername());
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$f */
    public class C42685f implements ViewTreeObserver.OnPreDrawListener {
        public C42685f() {
        }

        public boolean onPreDraw() {
            ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
            int[] iArr = new int[2];
            contactWidgetTabBizHeaderController.f115557h.getLocationOnScreen(iArr);
            int i = iArr[1];
            int f = C76577a.m92155f(contactWidgetTabBizHeaderController.f115556g, C0966R.dimen.akj);
            int f2 = C75044y4.m89994f(contactWidgetTabBizHeaderController.f115556g);
            int a = C75044y4.m89989a(contactWidgetTabBizHeaderController.f115556g);
            Log.m105925i("MicroMsg.ContactWidgetTabBizHeaderController", "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s", Integer.valueOf(a), Integer.valueOf(f2), Integer.valueOf(i));
            if (a > 0) {
                f = a;
            }
            if (i == 0) {
                f += f2;
            }
            if (contactWidgetTabBizHeaderController.mo66828f()) {
                f = 0;
            }
            if (f == contactWidgetTabBizHeaderController.f115557h.getPaddingTop()) {
                return true;
            }
            View view = contactWidgetTabBizHeaderController.f115557h;
            view.setPadding(view.getPaddingLeft(), f, contactWidgetTabBizHeaderController.f115557h.getPaddingRight(), contactWidgetTabBizHeaderController.f115557h.getPaddingBottom());
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$g */
    public interface C42686g {
        /* renamed from: a */
        void mo66837a();

        /* renamed from: b */
        void mo66838b(boolean z);

        /* renamed from: c */
        boolean mo66839c();
    }

    public ContactWidgetTabBizHeaderController(MMActivity mMActivity, View view, C42718i0 i0Var) {
        C42682c cVar = new C42682c();
        this.f115550M = null;
        this.f115551N = null;
        this.f115552P = 0;
        this.f115557h = view;
        this.f115556g = mMActivity;
        this.f115558i = i0Var;
        this.f115564r = new C42734m(view, mMActivity, cVar, this);
        if (this.f115544G == null) {
            this.f115544G = new ContactWidgetActionLiveBar(this.f115556g);
            View j = this.f115556g.getController().f348065F.mo91099j();
            if (j instanceof LinearLayout) {
                ((LinearLayout) j).addView(this.f115544G);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f115544G.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.weight = 1.0f;
                layoutParams.gravity = 17;
                this.f115544G.setLayoutParams(layoutParams);
            } else if (j instanceof RelativeLayout) {
                ((RelativeLayout) j).addView(this.f115544G);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f115544G.getLayoutParams();
                layoutParams2.width = -2;
                layoutParams2.addRule(13);
                this.f115544G.setLayoutParams(layoutParams2);
            }
        }
        this.f115543F = (AppBarLayout) this.f115557h.findViewById(C0966R.C0970id.aal);
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).o30(this.f115544G, "living_label_profile_header_view");
        ((C61212e) C86312j.m106911c(cls)).mo86175pO(this.f115544G, 40, 26236);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("live_id", "");
        arrayMap.put("finder_username", "");
        arrayMap.put("feed_id", "");
        arrayMap.put("comment_scene", ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK());
        ((C61212e) C86312j.m106911c(cls)).mo86149PM(this.f115544G, arrayMap);
        ((C61212e) C86312j.m106911c(cls)).E60(this.f115544G, new C42717i(this));
        this.f115543F.mo146159a(new C42715h(this));
        this.f115565s = (SnsAdClick) this.f115556g.getIntent().getParcelableExtra("KSnsAdTag");
        this.f115538A = this.f115556g.getIntent().getStringExtra("key_add_contact_report_info");
        this.f115540C = this.f115556g.getIntent().getIntExtra("add_more_friend_search_scene", 0);
        Bundle bundleExtra = this.f115556g.getIntent().getBundleExtra("Contact_Ext_Args");
        this.f115546I = bundleExtra;
        if (bundleExtra != null) {
            this.f115539B = bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", "");
        }
        this.f115541D = System.currentTimeMillis();
        this.f115556g.getIntent().getIntExtra("KOpenArticleSceneFromScene", 10000);
        this.f115556g.getIntent().getIntExtra("biz_profile_tab_type", 0);
    }

    /* renamed from: a */
    public static void m46369a(ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController) {
        contactWidgetTabBizHeaderController.getClass();
        Class cls = C45696d.class;
        String q4 = ((C45696d) C86709a0.m107533q(cls)).mo71011q4(contactWidgetTabBizHeaderController.f115563q);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - contactWidgetTabBizHeaderController.f115552P >= 1000) {
            contactWidgetTabBizHeaderController.f115552P = currentTimeMillis;
            int i = C19636w0.f55626c;
            int gg02 = ((C45696d) C86709a0.m107533q(cls)).gg0(contactWidgetTabBizHeaderController.f115563q);
            C115669n.INSTANCE.mo160131h(23044, 1, contactWidgetTabBizHeaderController.f115563q, Integer.valueOf(contactWidgetTabBizHeaderController.f115568v), Integer.valueOf(i), q4, Integer.valueOf(gg02), 1, "");
            Log.m105919d("MicroMsg.ContactWidgetTabBizHeaderController", "reportExposed bizUserName=%s, liveScene=%d, addContactScene=%d", contactWidgetTabBizHeaderController.f115563q, Integer.valueOf(gg02), Integer.valueOf(contactWidgetTabBizHeaderController.f115568v));
        }
        contactWidgetTabBizHeaderController.f115544G.setOnClickListener(new C42719j(contactWidgetTabBizHeaderController, q4));
        if (!Util.isNullOrNil(q4)) {
            contactWidgetTabBizHeaderController.f115544G.setVisibility(0);
            contactWidgetTabBizHeaderController.f115556g.setMMTitle("");
            return;
        }
        contactWidgetTabBizHeaderController.f115544G.setVisibility(8);
    }

    /* renamed from: b */
    public boolean mo66824b() {
        if (this.f115556g.getIntent() == null) {
            return false;
        }
        String stringExtra = this.f115556g.getIntent().getStringExtra(TPDownloadProxyEnum.USER_DEVICE_ID);
        String stringExtra2 = this.f115556g.getIntent().getStringExtra("device_type");
        ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = new ExDeviceCheckDeviceIsBoundEvent();
        ExDeviceCheckDeviceIsBoundEvent.C40062a aVar = exDeviceCheckDeviceIsBoundEvent.f107435d;
        aVar.f107438b = stringExtra;
        aVar.f107437a = stringExtra2;
        exDeviceCheckDeviceIsBoundEvent.publish();
        return exDeviceCheckDeviceIsBoundEvent.f107436e.f107439a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0215 A[SYNTHETIC, Splitter:B:87:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0244  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66825c() {
        /*
            r27 = this;
            r1 = r27
            long r2 = java.lang.System.currentTimeMillis()
            f115537Q = r2
            com.tencent.mm.ui.MMActivity r0 = r1.f115556g
            android.content.Intent r0 = r0.getIntent()
            r2 = 0
            r3 = 1
            java.lang.String r4 = "MicroMsg.ContactWidgetTabBizHeaderController"
            if (r0 == 0) goto L_0x0084
            com.tencent.mm.ui.MMActivity r0 = r1.f115556g
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KIsHardDevice"
            boolean r0 = r0.getBooleanExtra(r5, r2)
            if (r0 == 0) goto L_0x0084
            com.tencent.mm.ui.MMActivity r0 = r1.f115556g
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KHardDeviceBindTicket"
            java.lang.String r0 = r0.getStringExtra(r5)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x003a
            java.lang.String r0 = "bindTicket is null, means it is not switch from QRcode scan, just add contact"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0084
        L_0x003a:
            boolean r5 = r27.mo66824b()
            if (r5 != 0) goto L_0x0084
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r0
            java.lang.String r2 = "IsHardDevice, bindTicket = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r2, r5)
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            r4 = 536(0x218, float:7.51E-43)
            r2.mo123455a(r4, r1)
            com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent r2 = new com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent
            r2.<init>()
            com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent$a r4 = r2.f107424d
            r4.f107426a = r0
            r4.f107428c = r3
            r2.publish()
            com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent$b r0 = r2.f107425e
            ob0.y r0 = r0.f107430a
            com.tencent.mm.ui.MMActivity r2 = r1.f115556g
            r3 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r3 = r2.getString(r3)
            com.tencent.mm.ui.MMActivity r4 = r1.f115556g
            r5 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r4 = r4.getString(r5)
            r5 = 1
            r6 = 1
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$a r7 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$a
            r7.<init>(r0)
            qo3.i0 r0 = nj3.C76879j.m92723Q(r2, r3, r4, r5, r6, r7)
            r1.f115567u = r0
            return
        L_0x0084:
            wd3.a r0 = new wd3.a
            com.tencent.mm.ui.MMActivity r5 = r1.f115556g
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$b r6 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$b
            r6.<init>()
            r0.<init>(r5, r6)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r1.f115568v
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            java.lang.String r6 = r1.f115571y
            if (r6 == 0) goto L_0x00a4
            r0.f230044p = r6
        L_0x00a4:
            java.lang.String r6 = r1.f115572z
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x00b0
            java.lang.String r6 = r1.f115572z
            r0.f230045q = r6
        L_0x00b0:
            r0.f230054z = r3
            com.tencent.mm.ui.MMActivity r6 = r1.f115556g
            android.content.Intent r6 = r6.getIntent()
            java.lang.String r7 = "url"
            java.lang.String r6 = r6.getStringExtra(r7)
            r0.f230027A = r6
            com.tencent.mm.ui.MMActivity r8 = r1.f115556g
            android.content.Intent r8 = r8.getIntent()
            java.lang.String r9 = "qbarScene"
            r10 = -1
            int r8 = r8.getIntExtra(r9, r10)
            r12 = 2
            if (r8 == 0) goto L_0x00dc
            if (r8 == r3) goto L_0x00da
            if (r8 == r12) goto L_0x00d8
            r8 = 0
            goto L_0x00dd
        L_0x00d8:
            r8 = 3
            goto L_0x00dd
        L_0x00da:
            r8 = 2
            goto L_0x00dd
        L_0x00dc:
            r8 = 1
        L_0x00dd:
            r0.f230028B = r8
            te3.mq4 r8 = new te3.mq4
            r8.<init>()
            com.tencent.mm.ui.MMActivity r13 = r1.f115556g
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r14 = "Contact_Sub_Scene"
            int r13 = r13.getIntExtra(r14, r2)
            r8.f138158d = r13
            com.tencent.mm.ui.MMActivity r13 = r1.f115556g
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r14 = "Contact_Scene_Note"
            java.lang.String r13 = r13.getStringExtra(r14)
            r8.f138159e = r13
            com.tencent.mm.ui.MMActivity r13 = r1.f115556g
            android.content.Intent r13 = r13.getIntent()
            java.lang.String r14 = "Contact_Finder_Buffer"
            java.lang.String r13 = r13.getStringExtra(r14)
            r8.f138162h = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "FinderBuffer :"
            r13.append(r14)
            java.lang.String r14 = r8.f138162h
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            java.lang.String r13 = r1.f115539B
            r8.f138161g = r13
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r13 != 0) goto L_0x015f
            java.lang.String r13 = r8.f138159e
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0138
            r8.f138159e = r6
        L_0x0138:
            java.lang.Class<ex0.d> r13 = ex0.C45696d.class
            k40.a r13 = f40.C86709a0.m107533q(r13)
            ex0.d r13 = (ex0.C45696d) r13
            boolean r13 = r13.mo70989eQ(r6)
            if (r13 == 0) goto L_0x015f
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r14 = 10000(0x2710, float:1.4013E-41)
            if (r13 != 0) goto L_0x015d
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x015d }
            java.lang.String r13 = "scene"
            java.lang.String r6 = r6.getQueryParameter(r13)     // Catch:{ Exception -> 0x015d }
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r6, (int) r14)     // Catch:{ Exception -> 0x015d }
        L_0x015d:
            r8.f138160f = r14
        L_0x015f:
            r0.f230029C = r8
            com.tencent.mm.storage.z1 r6 = r1.f115559j
            java.lang.String r6 = r6.getUsername()
            java.lang.String r8 = r1.f115538A
            r0.mo108501b(r6, r5, r2, r8)
            java.lang.String r0 = "UTF-8"
            com.tencent.mm.ui.MMActivity r5 = r1.f115556g
            android.content.Intent r5 = r5.getIntent()
            java.lang.String r6 = "Contact_Scene"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            int r13 = r5.getIntExtra(r6, r2)
            r14 = 17
            if (r13 == r14) goto L_0x01a5
            r14 = 30
            if (r13 == r14) goto L_0x01a3
            r14 = 39
            if (r13 == r14) goto L_0x01a1
            r14 = 45
            if (r13 == r14) goto L_0x01a3
            r14 = 57
            if (r13 == r14) goto L_0x019f
            r14 = 87
            if (r13 == r14) goto L_0x01a1
            r14 = 89
            if (r13 == r14) goto L_0x01a1
            switch(r13) {
                case 41: goto L_0x01a5;
                case 42: goto L_0x019f;
                case 43: goto L_0x019f;
                default: goto L_0x019d;
            }
        L_0x019d:
            r13 = 0
            goto L_0x01a6
        L_0x019f:
            r13 = 1
            goto L_0x01a6
        L_0x01a1:
            r13 = 3
            goto L_0x01a6
        L_0x01a3:
            r13 = 4
            goto L_0x01a6
        L_0x01a5:
            r13 = 2
        L_0x01a6:
            java.lang.String r14 = "preChatName"
            java.lang.String r14 = r5.getStringExtra(r14)
            java.lang.String r15 = "preUsername"
            java.lang.String r15 = r5.getStringExtra(r15)
            java.lang.String r11 = "preChatTYPE"
            int r11 = r5.getIntExtra(r11, r2)
            r2 = 7
            r10 = 6
            if (r14 == 0) goto L_0x01c6
            boolean r18 = eb0.C45628s0.m50738C(r14)
            if (r18 == 0) goto L_0x01c6
            goto L_0x01d7
        L_0x01c6:
            if (r11 == r3) goto L_0x01d8
            if (r11 == r12) goto L_0x01d8
            if (r11 == r10) goto L_0x01d7
            if (r11 == r2) goto L_0x01d7
            r2 = 9
            if (r11 == r2) goto L_0x01d7
            switch(r11) {
                case 11: goto L_0x01d7;
                case 12: goto L_0x01d7;
                case 13: goto L_0x01d7;
                default: goto L_0x01d5;
            }
        L_0x01d5:
            r11 = 0
            goto L_0x01d8
        L_0x01d7:
            r11 = 3
        L_0x01d8:
            java.lang.String r2 = "rawUrl"
            java.lang.String r2 = r5.getStringExtra(r2)
            java.lang.String r7 = r5.getStringExtra(r7)
            java.lang.String r10 = "Contact_Ext_Args"
            android.os.Bundle r10 = r5.getBundleExtra(r10)
            java.lang.String r12 = ""
            if (r10 == 0) goto L_0x01f4
            java.lang.String r3 = "Contact_Ext_Args_Query_String"
            java.lang.String r3 = r10.getString(r3, r12)
            goto L_0x01f5
        L_0x01f4:
            r3 = r12
        L_0x01f5:
            r10 = -1
            int r9 = r5.getIntExtra(r9, r10)
            if (r9 == 0) goto L_0x0208
            r10 = 1
            if (r9 == r10) goto L_0x0206
            r10 = 2
            if (r9 == r10) goto L_0x0204
            r9 = 0
            goto L_0x0209
        L_0x0204:
            r9 = 3
            goto L_0x0209
        L_0x0206:
            r9 = 2
            goto L_0x0209
        L_0x0208:
            r9 = 1
        L_0x0209:
            com.tencent.mm.storage.z1 r10 = r1.f115559j
            java.lang.String r10 = r10.getUsername()
            boolean r17 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r17 != 0) goto L_0x0244
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)     // Catch:{ UnsupportedEncodingException -> 0x0236 }
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x0236 }
            r17 = r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException -> 0x0232 }
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x0232 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)     // Catch:{ UnsupportedEncodingException -> 0x0232 }
            java.lang.String r7 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x0232 }
            r3 = r2
            r2 = 0
            goto L_0x0248
        L_0x0232:
            r0 = move-exception
            r16 = r2
            goto L_0x023b
        L_0x0236:
            r0 = move-exception
            r16 = r2
            r17 = r12
        L_0x023b:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r12, r3)
            r3 = r16
            goto L_0x0248
        L_0x0244:
            r3 = r2
            r2 = 0
            r17 = r12
        L_0x0248:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = r12
            r4 = 9
            java.lang.Object[] r12 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r12[r2] = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4 = 1
            r12[r4] = r2
            r2 = 2
            r12[r2] = r14
            r2 = 3
            r12[r2] = r15
            r2 = 4
            r12[r2] = r3
            r2 = 5
            r12[r2] = r7
            r3 = 6
            r12[r3] = r17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r4 = 7
            r12[r4] = r3
            r3 = 8
            r12[r3] = r10
            r4 = 16232(0x3f68, float:2.2746E-41)
            r0.mo160131h(r4, r12)
            java.lang.String r4 = r1.f115538A
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x028b
            r4 = 16697(0x4139, float:2.3397E-41)
            java.lang.String r7 = r1.f115538A
            r0.kvStat(r4, r7)
        L_0x028b:
            r4 = 0
            int r6 = r5.getIntExtra(r6, r4)
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            int r4 = (int) r9
            long r9 = (long) r4
            r4 = 160(0xa0, float:2.24E-43)
            r7 = 15721(0x3d69, float:2.203E-41)
            if (r6 != r4) goto L_0x02f4
            r11 = 0
            java.lang.String r4 = "KBizRecCardId"
            long r4 = r5.getLongExtra(r4, r11)
            r6 = 9
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.mm.storage.z1 r11 = r1.f115559j
            java.lang.String r11 = r11.getUsername()
            r12 = 0
            r6[r12] = r11
            r11 = 1
            r6[r11] = r8
            r11 = 14
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 2
            r6[r12] = r11
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 3
            r6[r10] = r9
            int r9 = com.tencent.p014mm.storage.C19636w0.f55626c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 4
            r6[r10] = r9
            r6[r2] = r8
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 6
            r6[r4] = r2
            r2 = 7
            r6[r2] = r19
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6[r3] = r2
            r0.mo160131h(r7, r6)
            r20 = 1149(0x47d, double:5.677E-321)
            r22 = 7
            r24 = 1
            r26 = 0
            r19 = r0
            r19.idkeyStat(r20, r22, r24, r26)
            goto L_0x0332
        L_0x02f4:
            r4 = 174(0xae, float:2.44E-43)
            if (r6 != r4) goto L_0x0332
            r4 = 9
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mm.storage.z1 r5 = r1.f115559j
            java.lang.String r5 = r5.getUsername()
            r6 = 0
            r4[r6] = r5
            r5 = 1
            r4[r5] = r8
            r5 = 21
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r4[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r6 = 3
            r4[r6] = r5
            int r5 = com.tencent.p014mm.storage.C19636w0.f55626c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9 = 4
            r4[r9] = r5
            r4[r2] = r8
            r2 = 6
            r4[r2] = r8
            r2 = 7
            r4[r2] = r19
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r4[r3] = r2
            r0.mo160131h(r7, r4)
        L_0x0332:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController.mo66825c():void");
    }

    /* renamed from: d */
    public void mo66826d() {
        if (this.f115570x) {
            ((C10432i) C86312j.m106911c(C10432i.class)).mo10755m4(this.f115556g);
            C72996z1 z1Var = this.f115559j;
            if (z1Var != null && z1Var.getUsername() != null) {
                ((C52570c0) C86709a0.m107533q(C52570c0.class)).n80(7, this.f115559j.getUsername(), this.f115559j.getNickname());
                return;
            }
            return;
        }
        Class cls = C45696d.class;
        if (((C45696d) C86709a0.m107533q(cls)).mo70993g3()) {
            mo66825c();
        } else {
            ((C45696d) C86709a0.m107533q(cls)).Bw0(this.f115556g, new C42721l(this));
        }
        int i = this.f115540C;
        if (i != 0) {
            C115669n.INSTANCE.mo160131h(11263, Integer.valueOf(i), this.f115559j.getUsername());
        }
        C46723f.m52019a(this.f115559j.getUsername(), 200, this.f115568v, this.f115541D, this.f115556g.getIntent());
    }

    /* renamed from: e */
    public void mo66827e() {
        ((C37468y) C86312j.m106911c(C37468y.class)).mo61115c(this.f115561o, this.f115556g, this.f115559j, true, new C42684e(), mo66828f() ? 4 : 0);
        C46723f.m52019a(this.f115559j.getUsername(), 1000, this.f115568v, this.f115541D, this.f115556g.getIntent());
    }

    /* renamed from: f */
    public boolean mo66828f() {
        C42686g gVar = this.f115545H;
        return gVar != null && gVar.mo66839c();
    }

    /* renamed from: g */
    public void mo66829g(C72996z1 z1Var, String str, C52558c cVar, C49001ch chVar, int i, boolean z) {
        C51091rd rdVar;
        this.f115560n = str;
        this.f115561o = cVar;
        this.f115559j = z1Var;
        this.f115562p = chVar;
        this.f115568v = i;
        this.f115569w = z;
        if (z1Var != null && mo66828f() && !Util.isNullOrNil(z1Var.getNickname())) {
            this.f115548K = z1Var.mo101227D4();
        }
        if (cVar != null) {
            this.f115542E = cVar.mo73500r2(false);
        }
        if (z1Var != null) {
            String username = z1Var.getUsername();
            this.f115563q = username;
            if (!(username.startsWith("gh_") || chVar == null || (rdVar = chVar.f131707d) == null)) {
                this.f115563q = rdVar.f140834d;
            }
        }
        C52558c.C52560b bVar = this.f115542E;
        if (!(bVar == null || bVar.mo73522o() == null || this.f115542E.mo73522o().length() <= 0)) {
            this.f115571y = this.f115542E.mo73522o();
        }
        if (chVar != null) {
            this.f115566t = new C42713g(this.f115556g, chVar, this.f115557h, this.f115541D);
        }
        mo66832j();
    }

    /* renamed from: h */
    public final void mo66830h(int i, String str) {
        int i2;
        int i3;
        String str2;
        Bundle bundle = this.f115546I;
        if (bundle == null || !((i2 = this.f115568v) == 39 || i2 == 56 || i2 == 35 || i2 == 87 || i2 == 88 || i2 == 89 || i2 == 85)) {
            Log.m105918d("MicroMsg.ContactWidgetTabBizHeaderController", "mExtArgs is null or the add contact action is not from biz search.");
        } else if (this.f115559j == null) {
            Log.m105924i("MicroMsg.ContactWidgetTabBizHeaderController", "contact is null.");
        } else {
            String string = bundle.getString("Contact_Ext_Args_Search_Id");
            String nullAsNil = Util.nullAsNil(this.f115546I.getString("Contact_Ext_Args_Query_String"));
            int i4 = this.f115546I.getInt("Contact_Ext_Args_Index");
            int i5 = this.f115568v;
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
            String nullAsNil2 = Util.nullAsNil(this.f115546I.getString("Contact_Ext_Extra_Params"));
            String str3 = nullAsNil + "," + i + "," + Util.nullAsNil(this.f115559j.getUsername()) + "," + i4 + "," + (System.currentTimeMillis() / 1000) + "," + string + "," + i3;
            if (!Util.isNullOrNil(str)) {
                str2 = str3 + "," + str.replaceAll(",", ".") + "," + nullAsNil2;
            } else {
                str2 = str3 + ",," + nullAsNil2;
            }
            String str4 = str2 + "," + this.f115539B + "," + System.currentTimeMillis();
            Log.m105927v("MicroMsg.ContactWidgetTabBizHeaderController", "report 10866: %s", str4);
            C115669n.INSTANCE.kvStat(10866, str4);
        }
    }

    /* renamed from: i */
    public final void mo66831i(String str) {
        if (!this.f115556g.getMMTitle().toString().equals(str)) {
            ((C119157j) C119157j.f356862d).mo183895z(new C42683d(str));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0182  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66832j() {
        /*
            r22 = this;
            r1 = r22
            com.tencent.mm.storage.z1 r0 = r1.f115559j
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = "MicroMsg.ContactWidgetTabBizHeaderController"
            java.lang.String r2 = "initView contact is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            return
        L_0x000e:
            ug.c r2 = r1.f115561o
            if (r2 != 0) goto L_0x001c
            java.lang.String r0 = r0.getUsername()
            ug.c r0 = rb0.C47984k.m53328b(r0)
            r1.f115561o = r0
        L_0x001c:
            ug.c r0 = r1.f115561o
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.field_brandIconURL
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x002e
            ug.c r0 = r1.f115561o
            java.lang.String r0 = r0.field_brandIconURL
            r1.f115560n = r0
        L_0x002e:
            com.tencent.mm.plugin.profile.ui.tab.m r2 = r1.f115564r
            com.tencent.mm.storage.z1 r0 = r1.f115559j
            r2.f115731f = r0
            ug.c r0 = r1.f115561o
            r2.f115732g = r0
            java.lang.String r0 = r1.f115560n
            r2.f115734i = r0
            te3.ch r0 = r1.f115562p
            r2.f115733h = r0
            com.tencent.mm.storage.z1 r0 = r1.f115548K
            r2.f115735j = r0
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = f115537Q
            long r3 = r3 - r5
            r5 = 2000(0x7d0, double:9.88E-321)
            r7 = 1
            r8 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            rx3.g r3 = r2.f115737l
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            java.lang.String r4 = "<get-avatarIv>(...)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.tencent.mm.storage.z1 r4 = r2.f115731f
            java.lang.String r5 = r2.f115734i
            fx0.C45829j.m51128a(r3, r4, r5, r0)
            rx3.g r0 = r2.f115737l
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "<get-avatarIv>(...)"
            gy3.C87412m.m108593f(r0, r3)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.tencent.mm.plugin.profile.ui.tab.n r3 = new com.tencent.mm.plugin.profile.ui.tab.n
            r3.<init>(r2)
            r0.setOnClickListener(r3)
            com.tencent.mm.storage.z1 r0 = r2.f115731f
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 4
            r5 = 32
            if (r0 != 0) goto L_0x008f
            goto L_0x0189
        L_0x008f:
            fy0.i r0 = fy0.C8219i.f27144a
            com.tencent.mm.ui.widget.MMNeat7extView r6 = r2.mo66889f()
            r0.mo9272c(r6)
            com.tencent.mm.storage.z1 r0 = r2.f115731f
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.getNickname()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x00b3
            com.tencent.mm.storage.z1 r6 = r2.f115735j
            if (r6 == 0) goto L_0x00b3
            java.lang.String r0 = r6.getNickname()
        L_0x00b3:
            com.tencent.mm.storage.z1 r6 = r2.f115731f
            gy3.C87412m.m108591d(r6)
            boolean r6 = r6.mo62927s3()
            if (r6 == 0) goto L_0x00da
            com.tencent.mm.storage.z1 r6 = r2.f115731f
            gy3.C87412m.m108591d(r6)
            boolean r6 = r6.mo62940x3()
            if (r6 == 0) goto L_0x00da
            com.tencent.mm.storage.z1 r6 = r2.f115731f
            gy3.C87412m.m108591d(r6)
            java.lang.String r6 = r6.getUsername()
            boolean r6 = rb0.C47984k.m53341o(r6)
            if (r6 == 0) goto L_0x00da
            r6 = 1
            goto L_0x00db
        L_0x00da:
            r6 = 0
        L_0x00db:
            if (r6 == 0) goto L_0x0182
            com.tencent.mm.ui.MMActivity r6 = r2.f115727b
            int r6 = kg3.C76577a.m92145A(r6)
            androidx.appcompat.app.AppCompatActivity r9 = r2.f115730e
            int r9 = kg3.C76577a.m92151b(r9, r5)
            int r6 = r6 - r9
            r9 = 80
            androidx.appcompat.app.AppCompatActivity r10 = r2.f115730e
            int r9 = kg3.C76577a.m92151b(r10, r9)
            int r6 = r6 - r9
            r9 = 12
            androidx.appcompat.app.AppCompatActivity r10 = r2.f115730e
            int r9 = kg3.C76577a.m92151b(r10, r9)
            int r6 = r6 - r9
            com.tencent.mm.ui.widget.MMNeat7extView r9 = r2.mo66889f()
            r10 = 2131231344(0x7f080270, float:1.8078766E38)
            java.lang.String r11 = "showName"
            gy3.C87412m.m108593f(r0, r11)
            androidx.appcompat.app.AppCompatActivity r11 = r2.f115730e
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r10 = r11.getDrawable(r10)
            float r11 = r9.getTextSize()
            int r11 = (int) r11
            double r11 = (double) r11
            r13 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r11 = r11 * r13
            int r11 = (int) r11
            int r12 = r10.getIntrinsicWidth()
            int r12 = r12 * r11
            int r13 = r10.getIntrinsicHeight()
            int r12 = r12 / r13
            r10.setBounds(r8, r8, r12, r11)
            float r11 = (float) r12
            androidx.appcompat.app.AppCompatActivity r12 = r2.f115730e
            r13 = 5
            int r12 = kg3.C76577a.m92151b(r12, r13)
            float r12 = (float) r12
            float r11 = r11 + r12
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r9.mo154992j(r12, r11)
            yr3.a r6 = r9.mo154990i(r6, r3)
            if (r6 == 0) goto L_0x017c
            int r11 = r9.getMaxLines()
            int r11 = r11 + -1
            yr3.c r6 = (yr3.C112481c) r6
            int r6 = r6.mo109129m0(r11)
            if (r6 > 0) goto L_0x0158
            kw0.a r6 = kw0.C46746a.f125826a
            r6.mo71968a(r9, r0, r10, r4)
            goto L_0x0189
        L_0x0158:
            int r11 = r0.length()
            int r11 = r11 - r6
            java.lang.CharSequence r0 = r0.subSequence(r8, r11)
            java.lang.String r0 = r0.toString()
            kw0.a r6 = kw0.C46746a.f125826a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r6.mo71968a(r9, r0, r10, r4)
            goto L_0x0189
        L_0x017c:
            kw0.a r6 = kw0.C46746a.f125826a
            r6.mo71968a(r9, r0, r10, r4)
            goto L_0x0189
        L_0x0182:
            com.tencent.mm.ui.widget.MMNeat7extView r6 = r2.mo66889f()
            r6.mo104279b(r0)
        L_0x0189:
            com.tencent.mm.storage.z1 r0 = r2.f115731f
            r6 = 2
            r9 = 8
            r10 = 0
            if (r0 != 0) goto L_0x0193
            goto L_0x0346
        L_0x0193:
            rx3.g r0 = df2.C7325a.f25439a
            rx3.g r0 = df2.C7325a.f25439a
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01a7
            goto L_0x0346
        L_0x01a7:
            com.tencent.mm.storage.z1 r0 = r2.f115731f
            gy3.C87412m.m108591d(r0)
            int r0 = r0.mo73953E2()
            r11 = 16
            r0 = r0 & r11
            if (r0 <= 0) goto L_0x01b7
            r0 = 1
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            com.tencent.mm.storage.z1 r12 = r2.f115731f
            gy3.C87412m.m108591d(r12)
            int r12 = r12.mo73953E2()
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 <= 0) goto L_0x01c7
            r12 = 1
            goto L_0x01c8
        L_0x01c7:
            r12 = 0
        L_0x01c8:
            ug.c r13 = r2.f115732g
            if (r13 == 0) goto L_0x02f5
            if (r0 != 0) goto L_0x01d2
            if (r12 != 0) goto L_0x01d2
            goto L_0x02f5
        L_0x01d2:
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r12 == 0) goto L_0x01e8
            androidx.appcompat.app.AppCompatActivity r13 = r2.f115730e
            if (r0 == 0) goto L_0x01e0
            r0 = 2131233385(0x7f080a69, float:1.8082906E38)
            goto L_0x01e3
        L_0x01e0:
            r0 = 2131233384(0x7f080a68, float:1.8082904E38)
        L_0x01e3:
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            goto L_0x01f7
        L_0x01e8:
            androidx.appcompat.app.AppCompatActivity r13 = r2.f115730e
            if (r0 == 0) goto L_0x01f0
            r0 = 2131233383(0x7f080a67, float:1.8082902E38)
            goto L_0x01f3
        L_0x01f0:
            r0 = 2131233382(0x7f080a66, float:1.80829E38)
        L_0x01f3:
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
        L_0x01f7:
            r13 = r0
            androidx.appcompat.app.AppCompatActivity r0 = r2.f115730e
            int r0 = kg3.C76577a.m92151b(r0, r11)
            if (r13 == 0) goto L_0x0203
            r13.setBounds(r8, r8, r0, r0)
        L_0x0203:
            if (r12 == 0) goto L_0x028d
            ug.c r0 = r2.f115732g
            gy3.C87412m.m108591d(r0)
            ug.c$b r11 = r0.mo73500r2(r8)
            if (r11 == 0) goto L_0x0287
            org.json.JSONObject r0 = r11.f146795a
            if (r0 == 0) goto L_0x0284
            ug.c$b$d r12 = r11.f146803i
            if (r12 != 0) goto L_0x0284
            java.lang.String r12 = "PersonVerifyInfo"
            java.lang.String r0 = r0.optString(r12)
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r12 == 0) goto L_0x0226
            r12 = r10
            goto L_0x0282
        L_0x0226:
            java.lang.Object[] r12 = new java.lang.Object[r7]
            r12[r8] = r0
            java.lang.String r14 = "MicroMsg.BizInfo"
            java.lang.String r15 = "biz verify info is [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r12)
            ug.c$b$d r12 = new ug.c$b$d
            r12.<init>()
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ Exception -> 0x025c }
            r15.<init>(r0)     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "VerifyDesc"
            java.lang.String r0 = r15.optString(r0)     // Catch:{ Exception -> 0x025c }
            r12.f146832a = r0     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "VerifyName"
            java.lang.String r0 = r15.optString(r0)     // Catch:{ Exception -> 0x025c }
            r12.f146833b = r0     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "VerifyIdentity"
            java.lang.String r0 = r15.optString(r0)     // Catch:{ Exception -> 0x025c }
            r12.f146834c = r0     // Catch:{ Exception -> 0x025c }
            java.lang.String r0 = "VerifyDescribe"
            java.lang.String r0 = r15.optString(r0)     // Catch:{ Exception -> 0x025c }
            r12.f146835d = r0     // Catch:{ Exception -> 0x025c }
            goto L_0x026a
        L_0x025c:
            r0 = move-exception
            java.lang.Object[] r15 = new java.lang.Object[r7]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r15[r8] = r0
            java.lang.String r0 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r15)
        L_0x026a:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r12.f146832a
            r0[r8] = r4
            java.lang.String r4 = r12.f146833b
            r0[r7] = r4
            java.lang.String r4 = r12.f146834c
            r0[r6] = r4
            r4 = 3
            java.lang.String r15 = r12.f146835d
            r0[r4] = r15
            java.lang.String r4 = "desc[%s] name[%s] identity[%s] describe[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r0)
        L_0x0282:
            r11.f146803i = r12
        L_0x0284:
            ug.c$b$d r0 = r11.f146803i
            goto L_0x0288
        L_0x0287:
            r0 = r10
        L_0x0288:
            if (r0 == 0) goto L_0x02a3
            java.lang.String r0 = r0.f146834c
            goto L_0x02a4
        L_0x028d:
            ug.c r0 = r2.f115732g
            gy3.C87412m.m108591d(r0)
            ug.c$b r0 = r0.mo73500r2(r8)
            if (r0 == 0) goto L_0x029d
            ug.c$b$e r0 = r0.mo73521n()
            goto L_0x029e
        L_0x029d:
            r0 = r10
        L_0x029e:
            if (r0 == 0) goto L_0x02a3
            java.lang.String r0 = r0.f146837b
            goto L_0x02a4
        L_0x02a3:
            r0 = r10
        L_0x02a4:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x02be
            rx3.g r0 = r2.f115740o
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-certificationTv>(...)"
            gy3.C87412m.m108593f(r0, r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setVisibility(r9)
            goto L_0x0346
        L_0x02be:
            rx3.g r4 = r2.f115740o
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r11 = "<get-certificationTv>(...)"
            gy3.C87412m.m108593f(r4, r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setVisibility(r8)
            rx3.g r4 = r2.f115740o
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.String r11 = "<get-certificationTv>(...)"
            gy3.C87412m.m108593f(r4, r11)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setText(r0)
            rx3.g r0 = r2.f115741p
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-certificationIcon>(...)"
            gy3.C87412m.m108593f(r0, r4)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r13)
            goto L_0x0346
        L_0x02f5:
            rx3.g r0 = r2.f115739n
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-certificationContainer>(...)"
            gy3.C87412m.m108593f(r0, r4)
            android.view.View r0 = (android.view.View) r0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r11)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r14 = "updateCertification"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r13 = "updateCertification"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x0346:
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r0 = r2.f115729d
            boolean r0 = r0.mo66828f()
            if (r0 != 0) goto L_0x03a1
            rx3.g r0 = r2.f115742q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-dialogMenuContainer>(...)"
            gy3.C87412m.m108593f(r0, r4)
            android.view.View r0 = (android.view.View) r0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r11)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r14 = "updateDialogMenu"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r13 = "updateDialogMenu"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0420
        L_0x03a1:
            rx3.g r0 = r2.f115742q
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-dialogMenuContainer>(...)"
            gy3.C87412m.m108593f(r0, r4)
            android.view.View r0 = (android.view.View) r0
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r4.mo10233c(r11)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r14 = "updateDialogMenu"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r4 = r4.mo10231a(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r13 = "updateDialogMenu"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            rx3.g r0 = r2.f115743r
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-dialogSearch>(...)"
            gy3.C87412m.m108593f(r0, r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            com.tencent.mm.plugin.profile.ui.tab.q r4 = new com.tencent.mm.plugin.profile.ui.tab.q
            r4.<init>(r2)
            r0.setOnClickListener(r4)
            rx3.g r0 = r2.f115744s
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r4 = "<get-dialogMore>(...)"
            gy3.C87412m.m108593f(r0, r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            com.tencent.mm.plugin.profile.ui.tab.r r4 = new com.tencent.mm.plugin.profile.ui.tab.r
            r4.<init>(r2)
            r0.setOnClickListener(r4)
        L_0x0420:
            com.tencent.mm.storage.z1 r0 = r2.f115731f
            gy3.C87412m.m108591d(r0)
            java.lang.String r0 = r0.f149516U
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 == 0) goto L_0x0433
            com.tencent.mm.storage.z1 r4 = r2.f115735j
            if (r4 == 0) goto L_0x0433
            java.lang.String r0 = r4.f149516U
        L_0x0433:
            if (r0 == 0) goto L_0x043e
            boolean r4 = z04.C112551y.m153811k(r0)
            if (r4 == 0) goto L_0x043c
            goto L_0x043e
        L_0x043c:
            r4 = 0
            goto L_0x043f
        L_0x043e:
            r4 = 1
        L_0x043f:
            if (r4 == 0) goto L_0x044a
            androidx.appcompat.app.AppCompatActivity r0 = r2.f115730e
            r4 = 2131824071(0x7f110dc7, float:1.928096E38)
            java.lang.String r0 = r0.getString(r4)
        L_0x044a:
            com.tencent.mm.ui.widget.FlowTextMixView r4 = r2.mo66890g()
            r11 = 2131297978(0x7f0906ba, float:1.8213916E38)
            android.view.View r4 = r4.findViewById(r11)
            com.tencent.mm.ui.widget.MMNeat7extView r4 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r4
            r4.mo104279b(r0)
            com.tencent.mm.ui.MMActivity r12 = r2.f115727b
            int r12 = kg3.C76577a.m92145A(r12)
            r13 = 40
            androidx.appcompat.app.AppCompatActivity r14 = r2.f115730e
            int r14 = kg3.C76577a.m92151b(r14, r13)
            int r12 = r12 - r14
            yr3.a r3 = r4.mo154990i(r12, r3)
            if (r3 == 0) goto L_0x047b
            com.tencent.neattextview.textview.layout.NeatLayout r3 = (com.tencent.neattextview.textview.layout.NeatLayout) r3
            int r3 = r3.f319992L
            int r4 = r4.getMaxLines()
            if (r3 <= r4) goto L_0x047b
            r3 = 1
            goto L_0x047c
        L_0x047b:
            r3 = 0
        L_0x047c:
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            if (r3 == 0) goto L_0x04ec
            android.view.View r3 = r2.mo66884a()
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r6.mo10233c(r11)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r17 = "updateDesc"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r8)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r3.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r16 = "updateDesc"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            com.tencent.mm.ui.widget.FlowTextMixView r3 = r2.mo66890g()
            r3.setVisibility(r9)
            android.view.View r3 = r2.mo66884a()
            r6 = 2131297944(0x7f090698, float:1.8213847E38)
            android.view.View r3 = r3.findViewById(r6)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r3
            android.view.View r6 = r2.mo66884a()
            r11 = 2131297941(0x7f090695, float:1.8213841E38)
            android.view.View r6 = r6.findViewById(r11)
            r4.f27484d = r6
            r3.mo104279b(r0)
            goto L_0x0567
        L_0x04ec:
            android.view.View r3 = r2.mo66884a()
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r12.mo10233c(r14)
            java.lang.Object[] r15 = r12.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r17 = "updateDesc"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r3
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r12 = r12.mo10231a(r8)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3.setVisibility(r12)
            java.lang.String r15 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r16 = "updateDesc"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            com.tencent.mm.ui.widget.FlowTextMixView r3 = r2.mo66890g()
            r3.setVisibility(r8)
            com.tencent.mm.ui.widget.FlowTextMixView r3 = r2.mo66890g()
            android.view.View r3 = r3.findViewById(r11)
            com.tencent.mm.ui.widget.MMNeat7extView r3 = (com.tencent.p014mm.p136ui.widget.MMNeat7extView) r3
            com.tencent.mm.ui.widget.FlowTextMixView r11 = r2.mo66890g()
            r12 = 2131297942(0x7f090696, float:1.8213843E38)
            android.view.View r11 = r11.findViewById(r12)
            r4.f27484d = r11
            com.tencent.mm.ui.widget.FlowTextMixView r11 = r2.mo66890g()
            androidx.appcompat.app.AppCompatActivity r12 = r2.f115730e
            int r12 = kg3.C76577a.m92151b(r12, r9)
            r11.setItemSpacing(r12)
            r3.mo104279b(r0)
            androidx.appcompat.app.AppCompatActivity r0 = r2.f115730e
            int r0 = kg3.C76577a.m92151b(r0, r6)
            r3.setSpacingAdd(r0)
        L_0x0567:
            com.tencent.mm.plugin.profile.ui.tab.o r0 = new com.tencent.mm.plugin.profile.ui.tab.o
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            com.tencent.mm.plugin.profile.ui.tab.p r0 = new com.tencent.mm.plugin.profile.ui.tab.p
            r0.<init>(r4, r2)
            r3.setOnTouchListener(r0)
            te3.ch r0 = r2.f115733h
            r3 = 2131101317(0x7f060685, float:1.781504E38)
            r4 = 2131101688(0x7f0607f8, float:1.7815793E38)
            if (r0 == 0) goto L_0x05f2
            te3.mi r0 = r0.f131719s
            if (r0 != 0) goto L_0x0586
            goto L_0x05f2
        L_0x0586:
            pe3.b r6 = r0.f138039d
            java.lang.String r6 = sf0.C48374j0.m53713b(r6)
            pe3.b r0 = r0.f138040e
            java.lang.String r0 = sf0.C48374j0.m53713b(r0)
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r11 != 0) goto L_0x05ea
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r11 == 0) goto L_0x059f
            goto L_0x05ea
        L_0x059f:
            android.widget.TextView r11 = r2.mo66885b()
            androidx.appcompat.app.AppCompatActivity r12 = r2.f115730e
            r14 = 2131824055(0x7f110db7, float:1.9280927E38)
            java.lang.String r12 = r12.getString(r14)
            java.lang.Object[] r14 = new java.lang.Object[r7]
            r14[r8] = r0
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r12, r14)
            r11.setText(r12)
            android.widget.TextView r11 = r2.mo66885b()
            r11.setVisibility(r8)
            kw0.a r11 = kw0.C46746a.f125826a
            android.widget.TextView r12 = r2.mo66885b()
            android.view.ViewParent r12 = r12.getParent()
            android.widget.TextView r14 = r2.mo66885b()
            r11.mo71969b(r12, r14, r13, r13)
            android.widget.TextView r11 = r2.mo66885b()
            com.tencent.mm.plugin.profile.ui.tab.s r12 = new com.tencent.mm.plugin.profile.ui.tab.s
            r12.<init>(r2, r6, r0)
            r11.setOnClickListener(r12)
            android.widget.TextView r0 = r2.mo66885b()
            java.lang.Float r6 = com.tencent.p014mm.p136ui.tools.C7007c1.f24745a
            com.tencent.mm.ui.tools.u0 r11 = new com.tencent.mm.ui.tools.u0
            r11.<init>(r4, r3, r6)
            r0.setOnTouchListener(r11)
            goto L_0x05f9
        L_0x05ea:
            android.widget.TextView r0 = r2.mo66885b()
            r0.setVisibility(r9)
            goto L_0x05f9
        L_0x05f2:
            android.widget.TextView r0 = r2.mo66885b()
            r0.setVisibility(r9)
        L_0x05f9:
            te3.ch r0 = r2.f115733h
            if (r0 == 0) goto L_0x0621
            te3.te r0 = r0.f131708e
            if (r0 != 0) goto L_0x0602
            goto L_0x0621
        L_0x0602:
            java.lang.String r0 = r0.f142144g
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x0612
            android.widget.TextView r0 = r2.mo66891h()
            r0.setVisibility(r9)
            goto L_0x0628
        L_0x0612:
            android.widget.TextView r6 = r2.mo66891h()
            r6.setVisibility(r8)
            android.widget.TextView r6 = r2.mo66891h()
            r6.setText(r0)
            goto L_0x0628
        L_0x0621:
            android.widget.TextView r0 = r2.mo66891h()
            r0.setVisibility(r9)
        L_0x0628:
            te3.ch r0 = r2.f115733h
            if (r0 != 0) goto L_0x0634
            android.widget.TextView r0 = r2.mo66888e()
            r0.setVisibility(r9)
            goto L_0x0652
        L_0x0634:
            java.lang.String r0 = r0.f131725y
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x0644
            android.widget.TextView r0 = r2.mo66888e()
            r0.setVisibility(r9)
            goto L_0x0652
        L_0x0644:
            android.widget.TextView r6 = r2.mo66888e()
            r6.setVisibility(r8)
            android.widget.TextView r6 = r2.mo66888e()
            r6.setText(r0)
        L_0x0652:
            te3.ch r0 = r2.f115733h
            if (r0 == 0) goto L_0x0701
            te3.te r0 = r0.f131708e
            if (r0 != 0) goto L_0x065c
            goto L_0x0701
        L_0x065c:
            java.lang.String r6 = r0.f142147j
            java.lang.String r0 = r0.f142145h
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r11 != 0) goto L_0x066e
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r11 != 0) goto L_0x066e
            r11 = 1
            goto L_0x066f
        L_0x066e:
            r11 = 0
        L_0x066f:
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x067c
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x067c
            goto L_0x067d
        L_0x067c:
            r7 = 0
        L_0x067d:
            if (r11 == 0) goto L_0x06cd
            android.widget.TextView r6 = r2.mo66887d()
            r6.setVisibility(r8)
            android.widget.TextView r6 = r2.mo66887d()
            androidx.appcompat.app.AppCompatActivity r7 = r2.f115730e
            android.content.res.Resources r7 = r7.getResources()
            r11 = 2131101314(0x7f060682, float:1.7815034E38)
            int r7 = r7.getColor(r11)
            r6.setTextColor(r7)
            android.widget.TextView r6 = r2.mo66887d()
            r6.setText(r0)
            android.widget.TextView r0 = r2.mo66887d()
            com.tencent.mm.plugin.profile.ui.tab.t r6 = new com.tencent.mm.plugin.profile.ui.tab.t
            r6.<init>(r2)
            r0.setOnClickListener(r6)
            kw0.a r0 = kw0.C46746a.f125826a
            android.widget.TextView r6 = r2.mo66887d()
            android.view.ViewParent r6 = r6.getParent()
            android.widget.TextView r7 = r2.mo66887d()
            r0.mo71969b(r6, r7, r13, r13)
            android.widget.TextView r0 = r2.mo66887d()
            java.lang.Float r6 = com.tencent.p014mm.p136ui.tools.C7007c1.f24745a
            com.tencent.mm.ui.tools.u0 r7 = new com.tencent.mm.ui.tools.u0
            r7.<init>(r4, r3, r6)
            r0.setOnTouchListener(r7)
            goto L_0x0708
        L_0x06cd:
            if (r7 == 0) goto L_0x06f9
            android.widget.TextView r3 = r2.mo66887d()
            r3.setVisibility(r8)
            android.widget.TextView r3 = r2.mo66887d()
            androidx.appcompat.app.AppCompatActivity r4 = r2.f115730e
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131099804(0x7f06009c, float:1.7811972E38)
            int r4 = r4.getColor(r6)
            r3.setTextColor(r4)
            android.widget.TextView r3 = r2.mo66887d()
            r3.setText(r0)
            android.widget.TextView r0 = r2.mo66887d()
            r0.setOnClickListener(r10)
            goto L_0x0708
        L_0x06f9:
            android.widget.TextView r0 = r2.mo66887d()
            r0.setVisibility(r9)
            goto L_0x0708
        L_0x0701:
            android.widget.TextView r0 = r2.mo66891h()
            r0.setVisibility(r9)
        L_0x0708:
            r2.mo66893j()
            te3.ch r13 = r2.f115733h
            if (r13 != 0) goto L_0x0711
            goto L_0x07e2
        L_0x0711:
            com.tencent.mm.plugin.profile.ui.tab.g r0 = r2.f115725I
            if (r0 != 0) goto L_0x0726
            com.tencent.mm.plugin.profile.ui.tab.g r0 = new com.tencent.mm.plugin.profile.ui.tab.g
            com.tencent.mm.ui.MMActivity r12 = r2.f115727b
            android.view.View r14 = r2.f115726a
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController r3 = r2.f115729d
            long r3 = r3.f115541D
            r11 = r0
            r15 = r3
            r11.<init>(r12, r13, r14, r15)
            r2.f115725I = r0
        L_0x0726:
            com.tencent.mm.plugin.profile.ui.tab.g r0 = r2.f115725I
            gy3.C87412m.m108591d(r0)
            boolean r0 = r0.mo66866b()
            if (r0 != 0) goto L_0x0781
            rx3.g r0 = r2.f115724H
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "<get-widgetContainer>(...)"
            gy3.C87412m.m108593f(r0, r3)
            android.view.View r0 = (android.view.View) r0
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r3.mo10233c(r4)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r14 = "updateLiveReserve"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r13 = "updateLiveReserve"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x07d0
        L_0x0781:
            rx3.g r0 = r2.f115724H
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r3 = "<get-widgetContainer>(...)"
            gy3.C87412m.m108593f(r0, r3)
            android.view.View r0 = (android.view.View) r0
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r4)
            java.lang.Object[] r12 = r3.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r14 = "updateLiveReserve"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r3 = r3.mo10231a(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r12 = "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView"
            java.lang.String r13 = "updateLiveReserve"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
        L_0x07d0:
            com.tencent.mm.plugin.profile.ui.tab.g r0 = r2.f115725I
            gy3.C87412m.m108591d(r0)
            r0.mo66868d()
            com.tencent.mm.plugin.profile.ui.tab.g r0 = r2.f115725I
            gy3.C87412m.m108591d(r0)
            te3.ch r2 = r2.f115733h
            r0.mo66869e(r2)
        L_0x07e2:
            android.view.View r0 = r1.f115557h
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$f r2 = new com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizHeaderController$f
            r2.<init>()
            r0.addOnPreDrawListener(r2)
            te3.ch r0 = r1.f115562p
            monitor-enter(r22)
            if (r0 != 0) goto L_0x07f7
            monitor-exit(r22)
            goto L_0x0800
        L_0x07f7:
            te3.gi r0 = r0.f131718r     // Catch:{ all -> 0x0850 }
            if (r0 != 0) goto L_0x07fd
            monitor-exit(r22)
            goto L_0x0800
        L_0x07fd:
            java.util.LinkedList<te3.fi> r10 = r0.f134058e     // Catch:{ all -> 0x0850 }
            monitor-exit(r22)
        L_0x0800:
            if (r10 == 0) goto L_0x084f
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x084f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r10.iterator()
        L_0x0811:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0844
            java.lang.Object r3 = r2.next()
            te3.fi r3 = (te3.C49425fi) r3
            ex0.h$b r4 = new ex0.h$b
            r4.<init>()
            ug.c r6 = r1.f115561o
            if (r6 == 0) goto L_0x0829
            java.lang.String r6 = r6.field_appId
            goto L_0x082b
        L_0x0829:
            java.lang.String r6 = ""
        L_0x082b:
            r4.f123508e = r6
            java.lang.String r6 = r3.f133512f
            r4.f123504a = r6
            java.lang.String r6 = r3.f133510d
            r4.f123509f = r6
            java.lang.String r3 = r3.f133511e
            r4.f123510g = r3
            r3 = 126(0x7e, float:1.77E-43)
            r4.f123506c = r3
            r3 = 6
            r4.f123507d = r3
            r0.add(r4)
            goto L_0x0811
        L_0x0844:
            java.lang.Class<ex0.h> r2 = ex0.C45700h.class
            k40.a r2 = f40.C86709a0.m107533q(r2)
            ex0.h r2 = (ex0.C45700h) r2
            r2.mo71026A3(r0, r5)
        L_0x084f:
            return
        L_0x0850:
            r0 = move-exception
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.tab.ContactWidgetTabBizHeaderController.mo66832j():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.ContactWidgetTabBizHeaderController", "onSceneEnd errType = " + i + ", errCode = " + i2 + ",errMsg = " + str);
        C89779i0 i0Var = this.f115567u;
        if (i0Var != null && i0Var.isShowing()) {
            this.f115567u.dismiss();
        }
        if (yVar == null) {
            Log.m105920e("MicroMsg.ContactWidgetTabBizHeaderController", "scene == null");
            return;
        }
        C97625j3.m125815e().mo123470p(yVar.getType(), this);
        if (i == 0 && i2 == 0) {
            Log.m105919d("MicroMsg.ContactWidgetTabBizHeaderController", "scene.getType() = %s", Integer.valueOf(yVar.getType()));
            if (yVar.getType() == 536) {
                C97625j3.m125815e().mo123470p(536, this);
                mo66832j();
                return;
            }
            return;
        }
        Log.m105921e("MicroMsg.ContactWidgetTabBizHeaderController", "scene.getType() = %s", Integer.valueOf(yVar.getType()));
    }
}
