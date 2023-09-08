package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import b63.C28269p;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.utils.C5809a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import ob0.C117747y;
import p281yz.C79173v;
import v43.C78334a;
import v53.C78342e0;
import y43.C79029b0;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI */
public class WalletBankcardManageUI extends WalletBaseUI {

    /* renamed from: y */
    public static final /* synthetic */ int f208441y = 0;

    /* renamed from: d */
    public ArrayList<Bankcard> f208442d = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<Bankcard> f208443e = new ArrayList<>();

    /* renamed from: f */
    public C67205s0 f208444f = null;

    /* renamed from: g */
    public ListView f208445g = null;

    /* renamed from: h */
    public ListView f208446h = null;

    /* renamed from: i */
    public C71882b f208447i = null;

    /* renamed from: j */
    public C71882b f208448j = null;

    /* renamed from: n */
    public TextView f208449n;

    /* renamed from: o */
    public View f208450o;

    /* renamed from: p */
    public View f208451p;

    /* renamed from: q */
    public View f208452q;

    /* renamed from: r */
    public CdnImageView f208453r;

    /* renamed from: s */
    public TextView f208454s;

    /* renamed from: t */
    public C28269p f208455t;

    /* renamed from: u */
    public WcPayBannerView f208456u;

    /* renamed from: v */
    public View.OnClickListener f208457v = new WalletBankcardManageUI$$f(this);

    /* renamed from: w */
    public AdapterView.OnItemClickListener f208458w = new AdapterView.OnItemClickListener() {
        /* JADX WARNING: type inference failed for: r10v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
            /*
                r9 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r10)
                r0.add(r11)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
                r0.add(r11)
                java.lang.Long r11 = java.lang.Long.valueOf(r13)
                r0.add(r11)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$6"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r9
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r10 = r10.getAdapter()
                java.lang.Object r10 = r10.getItem(r12)
                com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r10
                r11 = 18
                r12 = 1
                com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r11, r12)
                r11 = 14422(0x3856, float:2.021E-41)
                r13 = 2
                r14 = 0
                r0 = 0
                if (r10 == 0) goto L_0x0218
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r1 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                com.tencent.mm.plugin.wallet.bind.ui.b r1 = r1.f208447i
                java.util.List<java.lang.String> r2 = r1.f208513h
                if (r2 == 0) goto L_0x0094
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x0052
                goto L_0x0094
            L_0x0052:
                java.util.List<java.lang.String> r2 = r1.f208513h
                java.util.Iterator r2 = r2.iterator()
            L_0x0058:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0094
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = r10.field_bindSerial
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L_0x0058
                java.lang.Object[] r2 = new java.lang.Object[r12]
                r2[r14] = r3
                java.lang.String r4 = "MicroMsg.BankcardListAdapter"
                java.lang.String r5 = "remove new: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r2)
                java.util.List<java.lang.String> r2 = r1.f208513h
                r2.remove(r3)
                f40.C86709a0.m107528h()
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC
                java.util.List<java.lang.String> r1 = r1.f208513h
                java.lang.String r4 = ","
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r1, r4)
                r2.mo119677K(r3, r1)
            L_0x0094:
                boolean r1 = r10.mo99394u2()
                if (r1 == 0) goto L_0x011d
                int r1 = r10.field_wxcreditState
                java.lang.String r2 = "wxcredit"
                java.lang.String r3 = "key_bankcard"
                if (r1 != 0) goto L_0x010c
                boolean r1 = com.tencent.p014mm.plugin.wallet.bind.p120ui.C71884c.m84324a(r10)
                if (r1 == 0) goto L_0x00ed
                f40.C86709a0.m107528h()
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                r4 = 196659(0x30033, float:2.75578E-40)
                java.lang.Object r1 = r1.mo119684e(r4, r0)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                boolean r6 = android.text.TextUtils.isEmpty(r1)
                if (r6 != 0) goto L_0x00d6
                r5.append(r1)
                java.lang.String r1 = "&"
                r5.append(r1)
                java.lang.String r1 = r10.field_bankcardType
                r5.append(r1)
                goto L_0x00db
            L_0x00d6:
                java.lang.String r1 = r10.field_bankcardType
                r5.append(r1)
            L_0x00db:
                f40.C86709a0.m107528h()
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                java.lang.String r5 = r5.toString()
                r1.mo119676J(r4, r5)
            L_0x00ed:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r1.putParcelable(r3, r10)
                java.lang.String r3 = r10.field_bizUsername
                java.lang.String r4 = "key_bank_username"
                r1.putString(r4, r3)
                java.lang.String r3 = r10.field_bankcardType
                java.lang.String r4 = "key_bank_type"
                r1.putString(r4, r3)
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r3 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                java.lang.String r4 = "WXCreditOpenProcess"
                yq3.C79143a.m95772k(r3, r2, r4, r1, r0)
                goto L_0x0206
            L_0x010c:
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r1.putParcelable(r3, r10)
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r3 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                java.lang.String r4 = "WXCreditManagerProcess"
                yq3.C79143a.m95772k(r3, r2, r4, r1, r0)
                goto L_0x0206
            L_0x011d:
                boolean r1 = r10.mo99392r2()
                java.lang.String r2 = "MicroMsg.WalletBankcardManageUI"
                if (r1 == 0) goto L_0x0169
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r1 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                r1.getClass()
                java.lang.String r3 = "do honey pay card back"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                boolean r2 = t02.C48527c.m53911g()
                if (r2 == 0) goto L_0x0154
                com.tencent.kinda.gen.ITransmitKvData r0 = com.tencent.kinda.gen.ITransmitKvData.create()
                java.lang.String r2 = r10.field_bindSerial
                java.lang.String r3 = "card_id"
                r0.putString(r3, r2)
                java.lang.Class<ie3.c> r2 = ie3.C76324c.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ie3.c r2 = (ie3.C76324c) r2
                com.tencent.mm.plugin.wallet.bind.ui.i r3 = new com.tencent.mm.plugin.wallet.bind.ui.i
                r3.<init>(r1)
                java.lang.String r1 = "honeyPayCardBackUseCase"
                r2.startUseCase(r1, r0, r3)
                goto L_0x0206
            L_0x0154:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                java.lang.String r3 = r10.field_bindSerial
                java.lang.String r4 = "key_card_no"
                r2.putExtra(r4, r3)
                java.lang.String r3 = "honey_pay"
                java.lang.String r4 = ".ui.HoneyPayCardBackUI"
                ke3.C88144b.m109791i(r1, r3, r4, r2, r0)
                goto L_0x0206
            L_0x0169:
                java.lang.Class<yz.v> r0 = p281yz.C79173v.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                yz.v r0 = (p281yz.C79173v) r0
                b63.s0 r0 = r0.Ex0()
                b63.q0 r0 = r0.mo91334p()
                int r1 = r0.f192928a
                r1 = r1 & 4096(0x1000, float:5.74E-42)
                if (r1 <= 0) goto L_0x0181
                r1 = 1
                goto L_0x0182
            L_0x0181:
                r1 = 0
            L_0x0182:
                java.lang.Object[] r3 = new java.lang.Object[r13]
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                r3[r14] = r4
                int r0 = r0.f192928a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3[r12] = r0
                java.lang.String r0 = "MicroMsg.WalletSwitchConfig"
                java.lang.String r4 = "isReportLocation, ret = %s switchBit %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
                if (r1 == 0) goto L_0x0201
                java.lang.String r0 = "jump to H5 bankcard detail page"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                f40.C86709a0.m107528h()
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC
                java.lang.String r3 = ""
                java.lang.Object r0 = r0.mo119685f(r1, r3)
                java.lang.String r0 = (java.lang.String) r0
                f40.C86709a0.m107528h()
                f40.o r1 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r1 = r1.mo121142i()
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BANKCARD_DETAIL_URL_TIMESTAMP_LONG_SYNC
                r4 = 0
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                java.lang.Object r1 = r1.mo119685f(r3, r4)
                java.lang.Long r1 = (java.lang.Long) r1
                long r3 = r1.longValue()
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 / r7
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x01f1
                long r5 = r5 - r3
                r0 = 7200(0x1c20, double:3.5573E-320)
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 >= 0) goto L_0x01f1
                java.lang.String r0 = "bank's url is not null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r0 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                r0.mo99047K7(r10)
                goto L_0x0206
            L_0x01f1:
                java.lang.String r0 = "listen BankcardLogoReadyEvent for newest url"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$6$1 r0 = new com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$6$1
                com.tencent.mm.app.f r1 = com.tencent.p014mm.app.C40008f.f107254d
                r0.<init>(r1, r10)
                r0.alive()
                goto L_0x0206
            L_0x0201:
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r0 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                r0.mo99048L7(r10)
            L_0x0206:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r13 = new java.lang.Object[r13]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r13[r14] = r1
                java.lang.String r10 = r10.field_bankcardType
                r13[r12] = r10
                r0.mo160131h(r11, r13)
                goto L_0x022a
            L_0x0218:
                com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI r10 = com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.this
                r10.mo99044H7(r0)
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                java.lang.Object[] r12 = new java.lang.Object[r12]
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r12[r14] = r13
                r10.mo160131h(r11, r12)
            L_0x022a:
                java.lang.String r10 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$6"
                java.lang.String r11 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r12 = "onItemClick"
                java.lang.String r13 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.C718696.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    };

    /* renamed from: x */
    public IListener<KindaBindCardEvent> f208459x = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Log.m105924i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent bindCard Succ");
                    WalletBankcardManageUI.this.mo99045I7(false);
                } else {
                    Log.m105924i("MicroMsg.WalletBankcardManageUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            WalletBankcardManageUI.this.f208459x.dead();
            return true;
        }
    };

    /* renamed from: H7 */
    public void mo99044H7(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        new WalletBankcardManageUI$$g(this, bundle).run();
    }

    /* renamed from: I7 */
    public void mo99045I7(boolean z) {
        if (z) {
            doSceneForceProgress(new C78342e0((String) null, 12));
        } else {
            doSceneProgress(new C78342e0((String) null, 12), false);
        }
    }

    /* renamed from: J7 */
    public C71882b mo99046J7() {
        return new C71882b(this, this.f208442d);
    }

    /* renamed from: K7 */
    public void mo99047K7(Bankcard bankcard) {
        String str;
        C86709a0.m107528h();
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC, "");
        if (!Util.isNullOrNil(str2)) {
            Log.m105924i("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is not null");
            Intent intent = new Intent();
            String format = String.format("bank_type=%s&card_tail=%s&bind_serial=%s", new Object[]{bankcard.field_bankcardType, bankcard.field_bankcardTail, bankcard.field_bindSerial});
            if (str2.contains("?")) {
                str = str2 + "&" + format;
            } else {
                str = str2 + "?" + format;
            }
            intent.putExtra("rawUrl", str);
            intent.putExtra("disable_bounce_scroll", true);
            intent.putExtra(C74928u.C45093i.f122326r, true);
            intent.putExtra("pay_report_scene", 1);
            C75228t.m90217J(getContext(), intent);
            return;
        }
        Log.m105920e("MicroMsg.WalletBankcardManageUI", "jumpToH5BankDetail :: url is null");
    }

    /* renamed from: L7 */
    public void mo99048L7(Bankcard bankcard) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_bankcard", bankcard);
        C79143a.m95771j(this, C78334a.class, bundle, (C79148e.C79149a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0194  */
    /* renamed from: M7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99049M7() {
        /*
            r23 = this;
            r1 = r23
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC
            java.lang.String r3 = ""
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "BindCardMenu"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L_0x0077
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0071 }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x0071 }
            b63.f r0 = new b63.f     // Catch:{ JSONException -> 0x0071 }
            r0.<init>()     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "menu_jump_type"
            r9 = -1
            int r8 = r4.optInt(r8, r9)     // Catch:{ JSONException -> 0x0071 }
            r0.f192883a = r8     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "menu_jump_url"
            java.lang.String r8 = r4.optString(r8, r3)     // Catch:{ JSONException -> 0x0071 }
            r0.f192884b = r8     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "menu_username"
            java.lang.String r8 = r4.optString(r8, r3)     // Catch:{ JSONException -> 0x0071 }
            r0.f192885c = r8     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "menu_path"
            java.lang.String r8 = r4.optString(r8, r3)     // Catch:{ JSONException -> 0x0071 }
            r0.f192886d = r8     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "menu_title"
            java.lang.String r8 = r4.optString(r8, r3)     // Catch:{ JSONException -> 0x0071 }
            r0.f192887e = r8     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r8 = "menu_icon_url"
            java.lang.String r4 = r4.optString(r8, r3)     // Catch:{ JSONException -> 0x0071 }
            r0.f192888f = r4     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r4 = "parse bind card menu, type: %s, title: %s"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ JSONException -> 0x0071 }
            int r9 = r0.f192883a     // Catch:{ JSONException -> 0x0071 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ JSONException -> 0x0071 }
            r8[r7] = r9     // Catch:{ JSONException -> 0x0071 }
            java.lang.String r9 = r0.f192887e     // Catch:{ JSONException -> 0x0071 }
            r8[r6] = r9     // Catch:{ JSONException -> 0x0071 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r8)     // Catch:{ JSONException -> 0x0071 }
            goto L_0x0078
        L_0x0071:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x0077:
            r0 = 0
        L_0x0078:
            r2 = 8
            if (r0 == 0) goto L_0x0194
            java.lang.String r3 = r0.f192887e
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0194
            java.lang.String r3 = r0.f192888f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0093
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r1.f208453r
            java.lang.String r4 = r0.f192888f
            r3.setUrl(r4)
        L_0x0093:
            android.widget.TextView r3 = r1.f208454s
            java.lang.String r4 = r0.f192887e
            r3.setText(r4)
            android.widget.TextView r3 = r1.f208454s
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90240d(r3)
            int r3 = r0.f192883a
            if (r3 != r6) goto L_0x00f1
            android.view.View r2 = r1.f208452q
            com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$d r3 = new com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$d
            r3.<init>(r1, r0)
            r2.setOnClickListener(r3)
            android.view.View r0 = r1.f208452q
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r3)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r11 = "updateApplyCreditEntrance"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r10 = "updateApplyCreditEntrance"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01d7
        L_0x00f1:
            if (r3 != r5) goto L_0x0141
            android.view.View r2 = r1.f208452q
            com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$e r3 = new com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$$e
            r3.<init>(r1, r0)
            r2.setOnClickListener(r3)
            android.view.View r0 = r1.f208452q
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2.mo10233c(r3)
            java.lang.Object[] r9 = r2.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r11 = "updateApplyCreditEntrance"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r2.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r10 = "updateApplyCreditEntrance"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01d7
        L_0x0141:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r7] = r3
            java.lang.String r3 = "MicroMsg.WalletBankcardManageUI"
            java.lang.String r4 = "unknown type: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r0)
            android.view.View r0 = r1.f208452q
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r11 = "updateApplyCreditEntrance"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r0
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r3.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r9 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r10 = "updateApplyCreditEntrance"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x01d7
        L_0x0194:
            android.view.View r0 = r1.f208452q
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r2)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r18 = "updateApplyCreditEntrance"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r0
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r2 = r3.mo10231a(r7)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI"
            java.lang.String r4 = "updateApplyCreditEntrance"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.bind.p120ui.WalletBankcardManageUI.mo99049M7():void");
    }

    /* renamed from: N7 */
    public final void mo99050N7() {
        if (this.f208444f.mo91337s()) {
            this.f208449n.setEnabled(false);
        } else if (this.f208444f.mo91343y()) {
            this.f208449n.setEnabled(true);
        } else {
            this.f208449n.setEnabled(true);
        }
        ArrayList<Bankcard> arrayList = this.f208442d;
        if (arrayList == null || arrayList.size() <= 0) {
            this.f208445g.setVisibility(8);
        } else {
            this.f208445g.setVisibility(0);
        }
        ArrayList<Bankcard> arrayList2 = this.f208443e;
        if (arrayList2 == null || arrayList2.size() <= 0) {
            this.f208446h.setVisibility(8);
        } else {
            this.f208446h.setVisibility(0);
        }
        C28269p pVar = this.f208455t;
        if (pVar == null || pVar.field_is_show_entry != 1) {
            View view = this.f208451p;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((TextView) this.f208451p.findViewById(C0966R.C0970id.lgu)).setText(this.f208455t.field_title);
            C28269p pVar2 = this.f208455t;
            TextView textView = (TextView) findViewById(C0966R.C0970id.lh4);
            int i = pVar2.field_red_dot_index;
            C86709a0.m107528h();
            if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LOAN_ENTRANCE_RED_POINT_INT, -1)).intValue() < i && i > 0) {
                Log.m105924i("MicroMsg.WalletBankcardManageUI", "red point update");
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.lgt);
            if (pVar2.field_is_overdue == 1) {
                Log.m105924i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.is_overdue = true");
                textView2.setText(C0966R.string.kn6);
                textView2.setTextColor(getResources().getColor(C0966R.color.a_0));
            } else if (!Util.isNullOrNil(pVar2.field_tips)) {
                Log.m105924i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.tips not null");
                textView2.setText(pVar2.field_tips);
            } else if (!Util.isNullOrNil(pVar2.field_available_otb)) {
                Log.m105924i("MicroMsg.WalletBankcardManageUI", "loanEntryInfo.available_otb not null");
                int indexOf = pVar2.field_available_otb.indexOf(".");
                String str = pVar2.field_available_otb;
                if (indexOf > 0) {
                    str = str.substring(0, indexOf);
                }
                textView2.setText(getString(C0966R.string.kn5, new Object[]{str}));
            } else {
                textView2.setVisibility(8);
                View view3 = this.f208451p;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView2.setVisibility(0);
            View view32 = this.f208451p;
            C9556a aVar22 = new C9556a();
            ThreadLocal<C9556a> threadLocal22 = C60958c.f173611a;
            aVar22.mo10233c(0);
            View view42 = view32;
            C117292a.m165358d(view42, aVar22.mo10232b(), "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view32.setVisibility(((Integer) aVar22.mo10231a(0)).intValue());
            C117292a.m165359e(view42, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f208447i.mo99073b(this.f208442d);
        this.f208447i.notifyDataSetChanged();
        this.f208448j.mo99073b(this.f208443e);
        this.f208448j.notifyDataSetChanged();
        this.f208449n.setEnabled(true);
    }

    public boolean checkProcLife() {
        return false;
    }

    public void finish() {
        if (!getIntent().getBooleanExtra("intent_finish_self", false)) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            Log.m105925i("MicroMsg.WalletBankcardManageUI", " walletMallV2 switch is ：%s", Boolean.TRUE);
            C88144b.m109791i(this, "mall", ".ui.MallIndexUIv2", intent, (Bundle) null);
        }
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdz;
    }

    public void initView() {
        setBackBtn(new WalletBankcardManageUI$$b(this));
        TextView textView = (TextView) findViewById(C0966R.C0970id.lef);
        this.f208449n = textView;
        textView.setOnClickListener(new WalletBankcardManageUI$$c(this));
        this.f208445g = (ListView) findViewById(C0966R.C0970id.f357501a70);
        C71882b J7 = mo99046J7();
        this.f208447i = J7;
        this.f208445g.setAdapter(J7);
        this.f208445g.setOnItemClickListener(this.f208458w);
        this.f208446h = (ListView) findViewById(C0966R.C0970id.l9t);
        C71882b bVar = new C71882b(this, this.f208443e);
        this.f208448j = bVar;
        this.f208446h.setAdapter(bVar);
        this.f208446h.setOnItemClickListener(this.f208458w);
        View findViewById = findViewById(C0966R.C0970id.lgn);
        this.f208450o = findViewById;
        findViewById.setOnClickListener(this.f208457v);
        View findViewById2 = findViewById(C0966R.C0970id.lgs);
        this.f208451p = findViewById2;
        findViewById2.setOnClickListener(this.f208457v);
        this.f208452q = findViewById(C0966R.C0970id.lgq);
        this.f208453r = (CdnImageView) findViewById(C0966R.C0970id.lgr);
        this.f208454s = (TextView) findViewById(C0966R.C0970id.lgp);
        mo99049M7();
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f208456u = wcPayBannerView;
        wcPayBannerView.mo105020a();
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL;
        walletGetBulletinEvent.callback = new WalletBankcardManageUI$$a(this, walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C71890h(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setContentViewVisibility(4);
        Log.m105924i("MicroMsg.WalletBankcardManageUI", "index Oncreate");
        this.f208444f = C79029b0.vx0().wx0();
        setMMTitle((int) C0966R.string.kuf);
        hideActionbarLine();
        initView();
        C75136r0.m90122d(5, 0);
        C75228t.m90243e0(27, 1);
        C115669n.INSTANCE.mo160131h(14422, 5);
        this.f208455t = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192957j;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f208447i.f208512g.mo99890a();
        this.f208448j.f208512g.mo99890a();
        this.f208459x.dead();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        if (!this.f208444f.mo91337s()) {
            this.f208444f.mo91327i(this.f208442d, this.f208443e);
            if (this.f208444f.f192955h != null) {
                setContentViewVisibility(0);
            }
            mo99045I7(false);
        } else {
            mo99045I7(true);
        }
        mo99050N7();
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.WalletBankcardManageUI", "onSceneEnd");
        if (i != 0 || i2 != 0 || !(yVar instanceof C78342e0)) {
            return false;
        }
        this.f208455t = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192957j;
        setContentViewVisibility(0);
        this.f208444f.mo91327i(this.f208442d, this.f208443e);
        mo99050N7();
        mo99049M7();
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5809a.class);
    }
}
