package com.tencent.p014mm.plugin.wallet.balance.p119ui;

import a63.C67008a;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b63.C67187h;
import b63.C67195n;
import b63.C67199q0;
import b63.C67203r0;
import b63.C67205s0;
import b63.C67211x;
import b73.C28273c;
import b73.C67213b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.weishi.C84909g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C5792e0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75227s;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.HashSet;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C117747y;
import org.json.JSONObject;
import p281yz.C79173v;
import r43.C12942a;
import t43.C77855b;
import te3.C64320dn3;
import u43.C52448a;
import ub3.C78144b;
import v53.C78342e0;
import w43.C78514b;
import xb3.C78781k;
import y43.C79029b0;
import yb3.C79064a;
import yb3.C79066c;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI */
public class WalletBalanceManagerUI extends WalletBaseUI implements C67195n, MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public static final /* synthetic */ int f207786A = 0;

    /* renamed from: d */
    public Button f207787d;

    /* renamed from: e */
    public Button f207788e;

    /* renamed from: f */
    public TextView f207789f;

    /* renamed from: g */
    public View f207790g;

    /* renamed from: h */
    public TextView f207791h;

    /* renamed from: i */
    public ViewGroup f207792i;

    /* renamed from: j */
    public TextView f207793j;

    /* renamed from: n */
    public WcPayMoneyLoadingView f207794n;

    /* renamed from: o */
    public ProgressBar f207795o;

    /* renamed from: p */
    public WcPayBannerView f207796p;

    /* renamed from: q */
    public Bankcard f207797q;

    /* renamed from: r */
    public C67187h f207798r;

    /* renamed from: s */
    public C52448a f207799s;

    /* renamed from: t */
    public ViewGroup f207800t;

    /* renamed from: u */
    public CdnImageView f207801u;

    /* renamed from: v */
    public TextView f207802v;

    /* renamed from: w */
    public CdnImageView f207803w;

    /* renamed from: x */
    public View f207804x;

    /* renamed from: y */
    public TextView f207805y;

    /* renamed from: z */
    public IListener<KindaBindCardEvent> f207806z = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Log.m105924i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent bindCard Succ");
                    Log.m105924i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from WalletBalanceManagerUI");
                    C79143a.m95771j(WalletBalanceManagerUI.this, C77855b.class, (Bundle) null, (C79148e.C79149a) null);
                    C75228t.m90243e0(15, 1);
                } else {
                    Log.m105924i("MicroMsg.WalletBalanceManagerUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            WalletBalanceManagerUI.this.f207806z.dead();
            return true;
        }
    };

    /* renamed from: H7 */
    public void mo98860H7() {
        doSceneProgress(new C78342e0((String) null, 10), C79029b0.vx0().wx0().f192955h == null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0202  */
    /* renamed from: I7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo98861I7() {
        /*
            r26 = this;
            r1 = r26
            r26.removeAllOptionMenu()
            java.lang.String r2 = "MicroMsg.WalletBalanceManagerUI"
            java.lang.String r0 = "go old menu logic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.f207797q
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0057
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r1.f207797q
            java.lang.String r5 = r5.field_bindSerial
            r0.getClass()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.f207797q
            java.lang.String r0 = r0.f209418m2
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0057
            r0 = 2131838816(0x7f114760, float:1.9310866E38)
            java.lang.String r0 = r1.getString(r0)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r1.f207797q
            java.lang.String r5 = r5.f209420o2
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x004d
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r1.f207797q
            java.lang.String r5 = r5.f209420o2
            r0[r4] = r5
            java.lang.String r5 = "entry_word：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r0)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r1.f207797q
            java.lang.String r0 = r0.f209420o2
        L_0x004d:
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$b r5 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$b
            r5.<init>(r1)
            com.tencent.mm.ui.MMActivityController$r r6 = com.tencent.p014mm.p136ui.MMActivityController.C73075r.TRANSPARENT_BG_BLACK_TEXT
            r1.addTextOptionMenu(r4, r0, r5, r6)
        L_0x0057:
            android.widget.TextView r0 = r1.f207805y
            if (r0 == 0) goto L_0x0248
            android.view.View r0 = r1.f207804x
            if (r0 == 0) goto L_0x0248
            boolean r0 = r26.isFinishing()
            if (r0 != 0) goto L_0x0248
            boolean r0 = r26.isDestroyed()
            if (r0 == 0) goto L_0x006d
            goto L_0x0248
        L_0x006d:
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$k r5 = new com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI$$k
            r6 = 0
            r5.<init>(r6)
            r7 = -1
            java.lang.Class<ub3.b> r0 = ub3.C78144b.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ JSONException -> 0x00fe }
            ub3.b r0 = (ub3.C78144b) r0     // Catch:{ JSONException -> 0x00fe }
            com.tencent.mm.wallet_core.model.q0 r0 = r0.mo107980OI()     // Catch:{ JSONException -> 0x00fe }
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BALANCE_ENTRANCE_INFO_STRING_SYNC     // Catch:{ JSONException -> 0x00fe }
            java.lang.Object r0 = r0.mo119992d(r8, r6)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x00fe }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ JSONException -> 0x00fe }
            if (r8 != 0) goto L_0x00fa
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r8.<init>(r0)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = "is_exposure"
            boolean r9 = r8.optBoolean(r0, r4)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r0 = "jump_info"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r10 = "wording_item"
            java.lang.String r8 = r8.optString(r10)     // Catch:{ JSONException -> 0x00f7 }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ JSONException -> 0x00f7 }
            if (r10 != 0) goto L_0x00d3
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f7 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r0 = "type"
            int r0 = r10.optInt(r0, r4)     // Catch:{ JSONException -> 0x00f7 }
            r5.f207820a = r0     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r0 = "url"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ JSONException -> 0x00f7 }
            r5.f207821b = r0     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r0 = "mini_username"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ JSONException -> 0x00f7 }
            r5.f207822c = r0     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r0 = "mini_pagepath"
            java.lang.String r0 = r10.optString(r0)     // Catch:{ JSONException -> 0x00f7 }
            r5.f207823d = r0     // Catch:{ JSONException -> 0x00f7 }
        L_0x00d3:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ JSONException -> 0x00f7 }
            if (r0 != 0) goto L_0x00f4
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f7 }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r8 = "wording"
            java.lang.String r6 = r0.optString(r8)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r8 = "color"
            int r8 = r0.optInt(r8, r7)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r10 = "dark_color"
            int r0 = r0.optInt(r10, r7)     // Catch:{ JSONException -> 0x00f2 }
            goto L_0x0109
        L_0x00f2:
            r0 = move-exception
            goto L_0x0101
        L_0x00f4:
            r0 = 0
            r8 = 0
            goto L_0x0109
        L_0x00f7:
            r0 = move-exception
            r8 = 0
            goto L_0x0101
        L_0x00fa:
            r0 = 0
            r8 = 0
            r9 = 0
            goto L_0x0109
        L_0x00fe:
            r0 = move-exception
            r8 = 0
            r9 = 0
        L_0x0101:
            java.lang.Object[] r10 = new java.lang.Object[r4]
            java.lang.String r11 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r11, r10)
            r0 = 0
        L_0x0109:
            r10 = 8
            if (r9 == 0) goto L_0x0202
            java.lang.String r9 = "show Lqt ServceEntrance"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            r2 = 45
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90243e0(r2, r3)
            if (r6 == 0) goto L_0x011e
            android.widget.TextView r2 = r1.f207805y
            r2.setText(r6)
        L_0x011e:
            boolean r2 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r6 = 2131101015(0x7f060557, float:1.7814428E38)
            if (r2 != 0) goto L_0x013d
            if (r8 != r7) goto L_0x0137
            android.widget.TextView r0 = r1.f207805y
            android.content.res.Resources r2 = r26.getResources()
            int r2 = r2.getColor(r6)
            r0.setTextColor(r2)
            goto L_0x0152
        L_0x0137:
            android.widget.TextView r0 = r1.f207805y
            r0.setTextColor(r8)
            goto L_0x0152
        L_0x013d:
            if (r0 != r7) goto L_0x014d
            android.widget.TextView r0 = r1.f207805y
            android.content.res.Resources r2 = r26.getResources()
            int r2 = r2.getColor(r6)
            r0.setTextColor(r2)
            goto L_0x0152
        L_0x014d:
            android.widget.TextView r2 = r1.f207805y
            r2.setTextColor(r0)
        L_0x0152:
            android.widget.TextView r0 = r1.f207805y
            com.tencent.mm.plugin.wallet.balance.ui.t r2 = new com.tencent.mm.plugin.wallet.balance.ui.t
            r2.<init>(r1, r5)
            r0.setOnClickListener(r2)
            android.widget.TextView r0 = r1.f207805y
            r0.setVisibility(r4)
            android.widget.TextView r0 = r1.f207805y
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90240d(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r2 = "zh_CN"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0174
            goto L_0x017c
        L_0x0174:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isOverseasUser(r0)
        L_0x017c:
            if (r3 != 0) goto L_0x01c0
            android.view.View r0 = r1.f207804x
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI"
            java.lang.String r14 = "showLqtServieEntrance"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI"
            java.lang.String r13 = "showLqtServieEntrance"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0264
        L_0x01c0:
            android.view.View r2 = r1.f207804x
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r0.mo10233c(r3)
            java.lang.Object[] r19 = r0.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI"
            java.lang.String r21 = "showLqtServieEntrance"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r2
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r0 = r0.mo10231a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r3 = "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI"
            java.lang.String r4 = "showLqtServieEntrance"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0264
        L_0x0202:
            android.widget.TextView r0 = r1.f207805y
            r0.setVisibility(r10)
            android.view.View r0 = r1.f207804x
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2.mo10233c(r3)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI"
            java.lang.String r14 = "showLqtServieEntrance"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r0
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.mo10231a(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r12 = "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI"
            java.lang.String r13 = "showLqtServieEntrance"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0264
        L_0x0248:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r5 = r26.isFinishing()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r4] = r5
            boolean r4 = r26.isDestroyed()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0[r3] = r4
            java.lang.String r3 = "accountUpdateServiceTv == null || marginLine == null || WalletBalanceManagerUI.this.isFinishing()|| WalletBalanceManagerUI.this.isDestroyed()：%s，%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r0)
        L_0x0264:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.WalletBalanceManagerUI.mo98861I7():void");
    }

    /* renamed from: J7 */
    public void mo98862J7() {
        startActivity(WalletBalanceSaveUI.class);
    }

    /* renamed from: K7 */
    public final void mo98863K7(C67211x xVar) {
        if (xVar == null) {
            this.f207800t.setVisibility(8);
            return;
        }
        if (!Util.isNullOrNil(xVar.f193004f)) {
            this.f207801u.setUrl(xVar.f193004f);
            this.f207801u.setVisibility(0);
        } else {
            this.f207801u.setVisibility(8);
        }
        if (!Util.isNullOrNil(xVar.f193005g)) {
            this.f207803w.setUrl(xVar.f193005g);
            this.f207803w.setVisibility(0);
        } else {
            this.f207803w.setVisibility(8);
        }
        this.f207802v.setText(xVar.f192999a);
        if (!Util.isNullOrNil(xVar.f193000b)) {
            if (C85875k4.m106211z()) {
                this.f207802v.setTextColor(C85875k4.m106176d(Util.getHex(xVar.f193000b, -16777216)));
            } else {
                this.f207802v.setTextColor(Util.getHex(xVar.f193000b, -16777216));
            }
        }
        this.f207802v.setTextSize(1, (float) xVar.f193001c);
        if (!Util.isNullOrNil(xVar.f193002d)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (C85875k4.m106211z()) {
                gradientDrawable.setColor(C85875k4.m106176d(Util.getHex(xVar.f193002d, -1)));
            } else {
                gradientDrawable.setColor(Util.getHex(xVar.f193002d, -1));
            }
            gradientDrawable.setCornerRadius((float) C76577a.m92151b(getContext(), 4));
            this.f207800t.setBackground(gradientDrawable);
        }
        this.f207800t.setVisibility(0);
        this.f207800t.setOnClickListener(new WalletBalanceManagerUI$$d(this, xVar));
        this.f207792i.setVisibility(8);
    }

    /* renamed from: L7 */
    public final void mo98864L7(boolean z) {
        long longValue = ((Long) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f207794n;
        wcPayMoneyLoadingView.mo99856e(C75228t.m90260n(C75228t.m90248h("" + longValue, "100", 2, RoundingMode.HALF_UP).doubleValue()), !z, false);
    }

    /* renamed from: M7 */
    public void mo98865M7(boolean z) {
        mo98864L7(z);
        Bankcard bankcard = C79029b0.vx0().wx0().f192955h;
        this.f207797q = bankcard;
        if (bankcard != null) {
            C67199q0 p = C79029b0.vx0().wx0().mo91334p();
            boolean z2 = (p.f192928a & 4) > 0;
            Log.m105925i("MicroMsg.WalletSwitchConfig", "isBalanceFetchOn, ret = %s switchBit %s", Boolean.valueOf(z2), Integer.valueOf(p.f192928a));
            if (z2) {
                this.f207787d.setVisibility(0);
                if (((Long) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue() <= 0) {
                    this.f207787d.setEnabled(false);
                }
            } else {
                this.f207787d.setVisibility(8);
            }
        }
        View findViewById = findViewById(C0966R.C0970id.gb4);
        C86709a0.m107528h();
        if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_LQT_LINK_RED_DOT_INT, -1)).intValue() == 1) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(196660, 0)).intValue();
        C86709a0.m107528h();
        int intValue2 = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BALANCE_SHOW_INT, 0)).intValue();
        Log.m105924i("MicroMsg.WalletSwitchConfig", "WalletSwitchConfig2 " + intValue + "balanceShow:" + intValue2);
        boolean z3 = (32768 & intValue) > 0;
        Log.m105925i("MicroMsg.WalletSwitchConfig", "isShowRealnameGuide, ret = %s switchBit %s", Boolean.valueOf(z3), Integer.valueOf(intValue));
        if (z3) {
            C86709a0.m107528h();
            View view3 = this.f207790g;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207791h.setTextColor(getResources().getColor(C0966R.color.f356998aj0));
            this.f207791h.setText((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_RELEAY_NAME_TIP_CONTENT_STRING_SYNC, getString(C0966R.string.hsi)));
            this.f207790g.setOnClickListener(new WalletBalanceManagerUI$$h(this));
            return;
        }
        C67203r0 r0Var = C79029b0.vx0().wx0().f192953f;
        boolean z4 = (r0Var != null ? r0Var.field_lqt_cell_is_show : 0) == 1;
        C67203r0 r0Var2 = C79029b0.vx0().wx0().f192953f;
        String str = null;
        String str2 = r0Var2 != null ? r0Var2.field_lqt_cell_lqt_title : null;
        C67203r0 r0Var3 = C79029b0.vx0().wx0().f192953f;
        String str3 = r0Var3 != null ? r0Var3.field_lqt_cell_lqt_wording : null;
        Log.m105925i("MicroMsg.WalletBalanceManagerUI", "isShowLqtCell:%s lqtCellTitle:%s lqtCellWording:%s", Boolean.valueOf(z4), str2, str3);
        if (z4 && (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str3))) {
            View view5 = this.f207790g;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (!C79029b0.vx0().wx0().mo91339u() || Util.isNullOrNil(C79029b0.vx0().wx0().mo91331m())) {
            C67205s0 wx02 = C79029b0.vx0().wx0();
            if (wx02 != null) {
                C67199q0 p2 = wx02.mo91334p();
                boolean z5 = (p2.f192928a & 1024) > 0;
                Log.m105925i("MicroMsg.WalletSwitchConfig", "isSupportLCT, ret = %s switchBit %s", Boolean.valueOf(z5), Integer.valueOf(p2.f192928a));
                if (z5 && !TextUtils.isEmpty(wx02.mo91331m())) {
                    C67203r0 r0Var4 = wx02.f192953f;
                    if (r0Var4 != null) {
                        str = r0Var4.field_lct_url;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        View view7 = this.f207790g;
                        C9556a aVar5 = new C9556a();
                        aVar5.mo10233c(0);
                        View view8 = view7;
                        C117292a.m165358d(view8, aVar5.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view7.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                        C117292a.m165359e(view8, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f207791h.setText(wx02.mo91331m());
                        this.f207790g.setOnClickListener(new WalletBalanceManagerUI$$j(this, wx02));
                        return;
                    }
                }
            }
            View view9 = this.f207790g;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar6.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view11 = this.f207790g;
            C9556a aVar7 = new C9556a();
            aVar7.mo10233c(0);
            View view12 = view11;
            C117292a.m165358d(view12, aVar7.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/wallet/balance/ui/WalletBalanceManagerUI", "updateView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207790g.setOnClickListener(new WalletBalanceManagerUI$$i(this));
            this.f207791h.setText(C79029b0.vx0().wx0().mo91331m());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cdm;
    }

    public void initView() {
        setMMTitle("");
        this.f207794n = (WcPayMoneyLoadingView) findViewById(C0966R.C0970id.ler);
        this.f207795o = (ProgressBar) findViewById(C0966R.C0970id.lhb);
        this.f207789f = (TextView) findViewById(C0966R.C0970id.lel);
        this.f207794n.setLoadingPb(this.f207795o);
        this.f207794n.setPrefixSymbol(getString(C0966R.string.l7o));
        getLifecycle().addObserver(this.f207794n);
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f207788e = button;
        button.setOnClickListener(new WalletBalanceManagerUI$$e(this));
        Button button2 = (Button) findViewById(C0966R.C0970id.len);
        this.f207787d = button2;
        button2.setOnClickListener(new WalletBalanceManagerUI$$f(this));
        this.f207804x = findViewById(C0966R.C0970id.leo);
        this.f207805y = (TextView) findViewById(C0966R.C0970id.lek);
        TextView textView = (TextView) findViewById(C0966R.C0970id.lep);
        if (!(!LocaleUtil.getApplicationLanguage().equals("zh_CN") ? true : Util.isOverseasUser(MMApplicationContext.getContext()))) {
            textView.setOnClickListener(new WalletBalanceManagerUI$$g(this));
            textView.setVisibility(0);
            C75228t.m90240d(textView);
        } else {
            textView.setVisibility(8);
        }
        ((TextView) findViewById(C0966R.C0970id.ljk)).setText(C75592q0.m90763K() ? C0966R.string.l5m : C0966R.string.l5n);
        this.f207792i = (ViewGroup) findViewById(C0966R.C0970id.a4x);
        this.f207793j = (TextView) findViewById(C0966R.C0970id.a4y);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a4w);
        this.f207790g = findViewById(C0966R.C0970id.fn_);
        this.f207791h = (TextView) findViewById(C0966R.C0970id.fna);
        this.f207800t = (ViewGroup) findViewById(C0966R.C0970id.a57);
        this.f207802v = (TextView) findViewById(C0966R.C0970id.a55);
        this.f207801u = (CdnImageView) findViewById(C0966R.C0970id.a56);
        this.f207803w = (CdnImageView) findViewById(C0966R.C0970id.a54);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f207796p = wcPayBannerView;
        wcPayBannerView.mo105020a();
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "2";
        walletGetBulletinEvent.callback = new WalletBalanceManagerUI$$a(this, walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    /* renamed from: k7 */
    public void mo91296k7(int i, Map<String, String> map, Object[] objArr) {
        if (i != 12 && i == 43 && objArr != null && objArr.length > 0) {
            mo98863K7(objArr[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        ECardInfo a;
        fixStatusbar(true);
        super.onCreate(bundle);
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().add(this);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        C64320dn3 dn32 = null;
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        setBackBtn(new WalletBalanceManagerUI$$c(this), C0966R.raw.actionbar_icon_dark_back);
        getIntent().getIntExtra("key_scene_balance_manager", 0);
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REALNAME_INFO_JSON_STRING_SYNC, (Object) null);
        if (!Util.isNullOrNil(str)) {
            try {
                C64320dn3 dn33 = new C64320dn3();
                JSONObject jSONObject = new JSONObject(str);
                dn33.f182785d = jSONObject.optInt("guide_flag");
                dn33.f182786e = jSONObject.optString("guide_wording");
                dn33.f182787f = jSONObject.optString("left_button_wording");
                dn33.f182788g = jSONObject.optString("right_button_wording");
                dn33.f182789h = jSONObject.optString("upload_credit_url");
                dn32 = dn33;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ECardInfo", e, "", new Object[0]);
            }
        }
        if (dn32 != null) {
            int i = dn32.f182785d;
            if (i == 1) {
                C67008a.m79172h(this, dn32.f182786e, 0, dn32.f182787f, dn32.f182788g, new Bundle(), isTransparent(), (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 0, 2);
            } else if (i == 3 && (a = ECardInfo.m5535a()) != null) {
                C5792e0.m5545a(this, a, 1);
            }
        }
        addSceneEndListener(C84909g.CTRL_INDEX);
        ((C79173v) C86312j.m106911c(C79173v.class)).Bx0().mo91291a(this);
        initView();
        C75136r0.m90122d(2, 0);
        C115669n.INSTANCE.mo160131h(11850, 6, 0);
        C75228t.m90243e0(10, 1);
        mo98863K7(C67211x.m79541a());
    }

    public void onDestroy() {
        removeSceneEndListener(C84909g.CTRL_INDEX);
        ((C79173v) C86312j.m106911c(C79173v.class)).Bx0().mo91292b(this);
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().remove(this);
        C52448a aVar = this.f207799s;
        if (aVar != null) {
            aVar.mo85581g();
        }
        this.f207799s = null;
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i("MicroMsg.WalletBalanceManagerUI", "jumpFethProcess from bind ui flag:" + intent.getIntExtra("from_bind_ui", 0));
        if (intent.getIntExtra("from_bind_ui", 0) == 1) {
            C79143a.m95771j(this, C77855b.class, (Bundle) null, (C79148e.C79149a) null);
            C75228t.m90243e0(15, 1);
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (mStorageEx == ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI() && i == 4) {
            Log.m105925i("MicroMsg.WalletBalanceManagerUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                mo98864L7(false);
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f207794n.mo99855d();
    }

    public void onResume() {
        Class cls = C75227s.class;
        C79064a aVar = new C79064a(true, true, 300, this.f207787d, 0, C79066c.ViewId_Balance_Fetch_Btn.toString(), this, false, 0, 0);
        C79064a aVar2 = new C79064a(true, true, 300, this.f207788e, 0, C79066c.ViewId_Balance_Save_Btn.toString(), this, false, 0, 0);
        C78781k.C78782a aVar3 = C78781k.C78782a.Event_OnResume;
        ((C75227s) component(cls)).mo108700d3(aVar3, aVar);
        ((C75227s) component(cls)).mo108700d3(aVar3, aVar2);
        mo98865M7(true);
        mo98860H7();
        Log.m105924i("MicroMsg.WalletBalanceManagerUI", "do query balance menu");
        C52448a aVar4 = this.f207799s;
        if (aVar4 != null) {
            aVar4.mo85581g();
        }
        C52448a aVar5 = new C52448a();
        this.f207799s = aVar5;
        aVar5.mo9225i().mo123062e(new C71856u(this));
        super.onResume();
        C67213b Jf = ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf();
        Jf.mo91357j(this, Jf.mo91358k(), (C67213b.C67215a) null);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0 && !(yVar instanceof C78514b) && (yVar instanceof C78342e0)) {
            C67187h hVar = ((C78342e0) yVar).f229575y;
            this.f207798r = hVar;
            if (hVar == null || this.f207800t.isShown()) {
                this.f207792i.setVisibility(8);
            } else if (!Util.isNullOrNil(this.f207798r.f192894a)) {
                this.f207793j.setText(this.f207798r.f192894a);
                this.f207792i.setOnClickListener(new C71851q(this));
                this.f207792i.setVisibility(0);
            } else {
                this.f207792i.setVisibility(8);
            }
            mo98865M7(false);
            mo98861I7();
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12942a.class);
    }
}
