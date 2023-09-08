package cm2;

import pv1.C100970d;

/* renamed from: cm2.c */
public class C67404c implements C100970d {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo91604d(android.content.Context r18, android.view.View r19, pv1.C22019b r20, java.lang.Object... r21) {
        /*
            r17 = this;
            r8 = r18
            java.lang.Class<rn.c0> r0 = p227rn.C22240c0.class
            java.lang.Class<ky2.i> r1 = ky2.C10432i.class
            java.lang.Class<vr.f> r2 = p255vr.C78469f.class
            r9 = r20
            xv1.j r9 = (xv1.C102755j) r9
            java.lang.Class<kv1.q> r3 = kv1.C99260q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kv1.q r3 = (kv1.C99260q) r3
            java.lang.String r4 = r9.mo35139k()
            lv1.n r5 = r9.f303414p
            r10 = 0
            r3.mo128752cG(r4, r5, r10)
            di3.d r3 = di3.C86312j.m106911c(r2)
            vr.f r3 = (p255vr.C78469f) r3
            java.lang.String r4 = r9.mo35139k()
            r3.Vs0(r4)
            lv1.e r3 = r9.f303418t
            java.lang.String r3 = r3.field_title
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0042
            di3.d r2 = di3.C86312j.m106911c(r2)
            vr.f r2 = (p255vr.C78469f) r2
            lv1.e r3 = r9.f303418t
            java.lang.String r3 = r3.field_title
            r2.Vs0(r3)
        L_0x0042:
            lv1.e r2 = r9.f303418t
            java.lang.String r2 = r2.field_url
            r11 = 0
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r2 = r11
        L_0x004e:
            if (r2 != 0) goto L_0x0051
            goto L_0x006c
        L_0x0051:
            java.lang.String r3 = "username"
            java.lang.String r2 = r2.getQueryParameter(r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x006c
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85804J4(r2)
            if (r3 != 0) goto L_0x0065
            goto L_0x006c
        L_0x0065:
            java.lang.String r3 = "gh_e9a0a3cb9d1e@app"
            boolean r2 = r3.equals(r2)
            goto L_0x006d
        L_0x006c:
            r2 = 0
        L_0x006d:
            r12 = 1
            if (r2 == 0) goto L_0x0093
            di3.d r2 = di3.C86312j.m106911c(r1)
            ky2.i r2 = (ky2.C10432i) r2
            boolean r2 = r2.mo10750e()
            if (r2 == 0) goto L_0x0086
            di3.d r0 = di3.C86312j.m106911c(r1)
            ky2.i r0 = (ky2.C10432i) r0
            r0.mo10755m4(r8)
            return r12
        L_0x0086:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r1 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryGame
            android.content.Context r2 = r19.getContext()
            boolean r1 = r1.checkAvailable(r2)
            if (r1 != 0) goto L_0x0093
            return r12
        L_0x0093:
            java.lang.Class<kr0.y0> r1 = kr0.C76632y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.y0 r1 = (kr0.C76632y0) r1
            lv1.e r2 = r9.f303418t
            java.lang.String r2 = r2.field_url
            boolean r1 = r1.mo106904s8(r2, r11)
            if (r1 == 0) goto L_0x00a6
            return r12
        L_0x00a6:
            lv1.e r1 = r9.f303418t
            int r2 = r1.field_actionType
            java.lang.String r13 = ".ui.tools.WebViewUI"
            java.lang.String r14 = "webview"
            java.lang.String r15 = "rawUrl"
            r3 = 2
            if (r2 != r3) goto L_0x00c5
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            lv1.e r1 = r9.f303418t
            java.lang.String r1 = r1.field_url
            r0.putExtra(r15, r1)
            ke3.C88144b.m109791i(r8, r14, r13, r0, r11)
            return r12
        L_0x00c5:
            int r1 = r1.field_featureId
            java.lang.Class<f62.k0> r2 = f62.C75700k0.class
            java.lang.Class<ht1.t1> r4 = ht1.C60200t1.class
            android.util.SparseArray<bm2.b$a> r5 = bm2.C67290b.f193125a
            int r6 = r5.indexOfKey(r1)
            if (r6 >= 0) goto L_0x00d5
            goto L_0x04be
        L_0x00d5:
            r6 = 30
            if (r1 != r6) goto L_0x00ed
            boolean r7 = p182kk.C61104a.m71651g(r18)
            if (r7 != 0) goto L_0x04be
            boolean r7 = p182kk.C61104a.m71665u(r18)
            if (r7 != 0) goto L_0x04be
            boolean r7 = p182kk.C61104a.m71649e(r18)
            if (r7 == 0) goto L_0x00ed
            goto L_0x04be
        L_0x00ed:
            java.lang.Object r5 = r5.get(r1)
            bm2.b$a r5 = (bm2.C67290b.C67291a) r5
            java.lang.String r7 = r5.f193129d
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85795C5(r7)
            if (r7 == 0) goto L_0x0105
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r7 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginSports
            boolean r7 = r7.checkAvailable(r8)
            if (r7 != 0) goto L_0x0105
            goto L_0x04b4
        L_0x0105:
            java.lang.String r7 = r5.f193129d
            boolean r7 = com.tencent.p014mm.storage.C72996z1.m85822V5(r7)
            if (r7 == 0) goto L_0x0117
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r7 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginWePay
            boolean r7 = r7.checkAvailable(r8)
            if (r7 != 0) goto L_0x0117
            goto L_0x04b4
        L_0x0117:
            r7 = 41
            if (r1 != r7) goto L_0x0125
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginWePay
            boolean r3 = r3.checkAvailable(r8)
            if (r3 != 0) goto L_0x0125
            goto L_0x04b4
        L_0x0125:
            r3 = 42
            if (r1 != r3) goto L_0x0133
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginWePay
            boolean r3 = r3.checkAvailable(r8)
            if (r3 != 0) goto L_0x0133
            goto L_0x04b4
        L_0x0133:
            r3 = 31
            if (r1 != r3) goto L_0x0141
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r7 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryGame
            boolean r7 = r7.checkAvailable(r8)
            if (r7 != 0) goto L_0x0141
            goto L_0x04b4
        L_0x0141:
            r7 = 18
            if (r1 != r7) goto L_0x014f
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r3 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryShake
            boolean r3 = r3.checkAvailable(r8)
            if (r3 != 0) goto L_0x014f
            goto L_0x04b4
        L_0x014f:
            r3 = 75
            if (r1 != r3) goto L_0x015d
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryChannels
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x015d
            goto L_0x04b4
        L_0x015d:
            r10 = 65
            if (r1 != r10) goto L_0x016b
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryLooks
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x016b
            goto L_0x04b4
        L_0x016b:
            r10 = 17
            if (r1 != r10) goto L_0x0179
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.DiscoveryNearby
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x0179
            goto L_0x04b4
        L_0x0179:
            r10 = 50
            r6 = 67
            r7 = 63
            if (r1 == r10) goto L_0x0185
            if (r1 == r7) goto L_0x0185
            if (r1 != r6) goto L_0x018f
        L_0x0185:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomeServiceOa
            boolean r10 = r10.checkAvailable(r8)
            if (r10 != 0) goto L_0x018f
            goto L_0x04b4
        L_0x018f:
            r10 = 28
            if (r1 != r10) goto L_0x019d
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r6 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.HomePluginQQMail
            boolean r6 = r6.checkAvailable(r8)
            if (r6 != 0) goto L_0x019d
            goto L_0x04b4
        L_0x019d:
            int r6 = r5.f193126a
            r7 = -1
            if (r6 == r7) goto L_0x01b2
            int r6 = eb0.C75592q0.m90785o()
            int r7 = r5.f193126a
            r6 = r6 & r7
            if (r6 == 0) goto L_0x01b2
            java.lang.String r0 = r5.f193129d
            bm2.C67290b.m79634a(r8, r0)
            goto L_0x04b4
        L_0x01b2:
            if (r1 != r3) goto L_0x0227
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            di3.d r1 = di3.C86312j.m106911c(r4)
            ht1.t1 r1 = (ht1.C60200t1) r1
            ht1.z4 r1 = r1.mo76861l7()
            java.lang.String r1 = r1.mo83783b6()
            r0.setClassName(r8, r1)
            java.lang.String r1 = "KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB"
            r0.putExtra(r1, r12)
            di3.d r1 = di3.C86312j.m106911c(r4)
            ht1.t1 r1 = (ht1.C60200t1) r1
            r2 = 19
            r3 = 18
            r4 = 30
            java.lang.String r1 = r1.mo76842e7(r4, r2, r3, r11)
            java.lang.String r2 = "key_context_id"
            r0.putExtra(r2, r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            k20.a r10 = new k20.a
            r10.<init>()
            r10.mo10233c(r0)
            java.lang.Object[] r1 = r10.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/search/model/FeatureLogic"
            java.lang.String r3 = "startFeature"
            java.lang.String r4 = "(Landroid/content/Context;I)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r18
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r10.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/search/model/FeatureLogic"
            java.lang.String r2 = "startFeature"
            java.lang.String r3 = "(Landroid/content/Context;I)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r18
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x04b4
        L_0x0227:
            java.lang.String r3 = r5.f193128c
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r4 = 5
            if (r3 != 0) goto L_0x03f6
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            if (r1 != r10) goto L_0x023f
            r3 = 20
            java.lang.String r6 = "type"
            r2.putExtra(r6, r3)
        L_0x023f:
            if (r1 != r12) goto L_0x0249
            java.lang.String r3 = "key_native_url"
            java.lang.String r6 = "wxpay://bizmall/mobile_recharge"
            r2.putExtra(r3, r6)
        L_0x0249:
            java.lang.String r3 = "animation_pop_in"
            r6 = 0
            r2.putExtra(r3, r6)
            r3 = 32
            r7 = 6
            if (r1 != r3) goto L_0x0263
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 12065(0x2f21, float:1.6907E-41)
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.lang.Integer r16 = java.lang.Integer.valueOf(r7)
            r11[r6] = r16
            r3.mo160131h(r10, r11)
        L_0x0263:
            if (r1 != r7) goto L_0x026d
            r3 = 15
            java.lang.String r6 = "pay_channel"
            r2.putExtra(r6, r3)
        L_0x026d:
            r3 = 4
            r6 = 31
            if (r1 != r6) goto L_0x0277
            java.lang.String r6 = "game_report_from_scene"
            r2.putExtra(r6, r3)
        L_0x0277:
            java.lang.String r6 = "key_from_scene"
            r7 = 41
            if (r1 != r7) goto L_0x0280
            r2.putExtra(r6, r4)
        L_0x0280:
            r4 = 42
            if (r1 != r4) goto L_0x0287
            r2.putExtra(r6, r3)
        L_0x0287:
            r4 = 64
            if (r1 != r4) goto L_0x0290
            java.lang.String r4 = "entry_fix_tools"
            r2.putExtra(r4, r12)
        L_0x0290:
            r4 = 63
            if (r1 == r4) goto L_0x0298
            r4 = 67
            if (r1 != r4) goto L_0x02bb
        L_0x0298:
            java.lang.String r4 = "biz_enter_source"
            r6 = 2
            r2.putExtra(r4, r6)
            r4 = 7
            java.lang.String r6 = "KOpenArticleSceneFromScene"
            r2.putExtra(r6, r4)
            di3.d r4 = di3.C86312j.m106911c(r0)
            rn.c0 r4 = (p227rn.C22240c0) r4
            boolean r4 = r4.mo35410vH()
            if (r4 == 0) goto L_0x02bb
            di3.d r0 = di3.C86312j.m106911c(r0)
            rn.c0 r0 = (p227rn.C22240c0) r0
            r0.u90(r8, r2)
            goto L_0x04b4
        L_0x02bb:
            r0 = 69
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            java.lang.String r6 = "Contact_User"
            if (r1 != r0) goto L_0x02d0
            java.lang.String r0 = "appbrandcustomerservicemsg"
            r2.putExtra(r6, r0)
            java.lang.String r0 = "app_brand_conversation_from_scene"
            r2.putExtra(r0, r3)
            r2.addFlags(r4)
        L_0x02d0:
            r0 = 74
            if (r1 != r0) goto L_0x02e4
            java.lang.String r0 = "opencustomerservicemsg"
            r2.putExtra(r6, r0)
            r0 = 3
            java.lang.String r3 = "open_im_kefu_conversation_list_ui_from_scene"
            r2.putExtra(r3, r0)
            r2.addFlags(r4)
        L_0x02e4:
            r0 = 30
            if (r1 != r0) goto L_0x02f7
            java.lang.String r0 = "key_enable_multi_code"
            r2.putExtra(r0, r12)
            java.lang.String r0 = "key_scan_goods_enable_dynamic_wording"
            r2.putExtra(r0, r12)
            java.lang.String r0 = "key_enable_scan_code_product_merge"
            r2.putExtra(r0, r12)
        L_0x02f7:
            r0 = 33
            if (r1 != r0) goto L_0x0310
            java.lang.Class<xq.e> r0 = p272xq.C102712e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xq.e r0 = (p272xq.C102712e) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = ".ui.FavoriteIndexUI"
            r0.F20(r8, r3, r1)
        L_0x030d:
            r6 = 0
            goto L_0x03f1
        L_0x0310:
            r0 = 35
            if (r1 != r0) goto L_0x031d
            java.lang.String r0 = "com.tencent.mm.plugin.backup.backupmoveui.BackupUI"
            r2.setClassName(r8, r0)
            com.tencent.p014mm.p136ui.MMWizardActivity.m7017L7(r8, r2)
            goto L_0x030d
        L_0x031d:
            r0 = 66
            if (r1 != r0) goto L_0x0330
            java.lang.Class<kr0.z0> r0 = kr0.C76633z0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.z0 r0 = (kr0.C76633z0) r0
            r1 = 16
            r3 = 0
            r0.mo94230XU(r8, r1, r3)
            goto L_0x030d
        L_0x0330:
            r0 = 40
            if (r1 != r0) goto L_0x034d
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            boolean r0 = r0.startWalletBalanceEntryUseCase(r8)
            if (r0 != 0) goto L_0x030d
            java.lang.String r0 = r5.f193128c
            java.lang.String r1 = r5.f193127b
            r3 = 0
            ke3.C88144b.m109791i(r8, r0, r1, r2, r3)
        L_0x034a:
            r6 = r3
            goto L_0x03f1
        L_0x034d:
            java.lang.String r0 = r5.f193128c
            java.lang.String r1 = "app"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03eb
            java.lang.String r0 = r5.f193127b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0399
            java.lang.String r0 = r5.f193127b
            java.lang.String r1 = ".ui.MallIndexUIv2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0399
            boolean r0 = eb0.C75592q0.m90754B()
            if (r0 == 0) goto L_0x0392
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_android_walletv2_oversea_open_config
            r3 = 0
            boolean r0 = r0.mo58784wf(r1, r3)
            if (r0 == 0) goto L_0x0389
            java.lang.String r0 = r5.f193128c
            java.lang.String r1 = ".ui.MallIndexOSUIv2"
            r3 = 0
            ke3.C88144b.m109791i(r8, r0, r1, r2, r3)
            goto L_0x034a
        L_0x0389:
            r3 = 0
            java.lang.String r0 = r5.f193128c
            java.lang.String r1 = ".ui.MallIndexOSUI"
            ke3.C88144b.m109791i(r8, r0, r1, r2, r3)
            goto L_0x034a
        L_0x0392:
            r3 = 0
            java.lang.String r0 = r5.f193128c
            ke3.C88144b.m109791i(r8, r0, r1, r2, r3)
            goto L_0x034a
        L_0x0399:
            java.lang.String r0 = r5.f193127b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x03e2
            java.lang.String r0 = r5.f193127b
            java.lang.String r1 = ".ui.WalletOfflineEntranceUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03e2
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r0.mo119685f(r3, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3 = 8
            if (r0 != r3) goto L_0x03db
            java.lang.Class<zz.f> r0 = p287zz.C79442f.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            zz.f r0 = (p287zz.C79442f) r0
            zz.d r0 = r0.J70()
            n63.b r0 = (n63.C76831b) r0
            r0.mo107100c(r8)
            goto L_0x030d
        L_0x03db:
            java.lang.String r0 = r5.f193128c
            r6 = 0
            ke3.C88144b.m109791i(r8, r0, r1, r2, r6)
            goto L_0x03f1
        L_0x03e2:
            r6 = 0
            java.lang.String r0 = r5.f193128c
            java.lang.String r1 = r5.f193127b
            ke3.C88144b.m109791i(r8, r0, r1, r2, r6)
            goto L_0x03f1
        L_0x03eb:
            r6 = 0
            java.lang.String r0 = r5.f193127b
            ke3.C88144b.m109801s(r8, r0, r2, r6)
        L_0x03f1:
            nj3.C88990b.m111192a(r8, r2)
            goto L_0x04b4
        L_0x03f6:
            r6 = r11
            r0 = 65
            r3 = 0
            if (r1 != r0) goto L_0x0405
            r0 = 21
            java.lang.String r1 = ""
            t03.C22426h.m26109k(r8, r0, r6, r1, r6)
            goto L_0x04b4
        L_0x0405:
            r0 = 71
            if (r1 != r0) goto L_0x0468
            k40.a r0 = f40.C86709a0.m107533q(r2)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
            if (r0 == 0) goto L_0x0468
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            java.util.List r1 = r0.mo69735F(r6)
            r6 = 0
        L_0x041c:
            r7 = r1
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r10 = r7.size()
            java.lang.String r11 = "appbrand_notify_message"
            if (r6 >= r10) goto L_0x0437
            java.lang.Object r7 = r7.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0434
            goto L_0x0438
        L_0x0434:
            int r6 = r6 + 1
            goto L_0x041c
        L_0x0437:
            r6 = 0
        L_0x0438:
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r11)
            if (r0 == 0) goto L_0x0443
            int r0 = r0.mo108786G2()
            goto L_0x0444
        L_0x0443:
            r0 = 0
        L_0x0444:
            java.lang.Class<kr0.j0> r1 = kr0.C76626j0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.j0 r1 = (kr0.C76626j0) r1
            f40.e r7 = f40.C86709a0.m107523b()
            int r7 = r7.mo121110g()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            r1.mo56476VX(r7)
            kr0.j0$a r7 = new kr0.j0$a
            int r6 = r6 + r12
            r7.<init>(r0, r6)
            r1.t80(r7)
        L_0x0468:
            java.lang.String r0 = r5.f193127b
            java.lang.String r1 = ".ui.chatting.ChattingUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04a5
            java.lang.String r0 = r5.f193129d
            k40.a r2 = f40.C86709a0.m107533q(r2)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            com.tencent.mm.storage.z1 r2 = r2.get(r0)
            boolean r2 = r2.mo62927s3()
            if (r2 == 0) goto L_0x04a1
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "Chat_User"
            r2.putExtra(r3, r0)
            java.lang.String r0 = "finish_direct"
            r2.putExtra(r0, r12)
            java.lang.String r0 = "chat_from_scene"
            r2.putExtra(r0, r4)
            r0 = 0
            ke3.C88144b.m109801s(r8, r1, r2, r0)
            goto L_0x04b4
        L_0x04a1:
            bm2.C67290b.m79634a(r8, r0)
            goto L_0x04b4
        L_0x04a5:
            java.lang.String r0 = r5.f193127b
            java.lang.String r1 = ".plugin.profile.ui.ContactInfoUI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04b6
            java.lang.String r0 = r5.f193129d
            bm2.C67290b.m79634a(r8, r0)
        L_0x04b4:
            r10 = 1
            goto L_0x04be
        L_0x04b6:
            java.lang.String r0 = "MicroMsg.Feature"
            java.lang.String r1 = "Error URI of android feature"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            r10 = 0
        L_0x04be:
            if (r10 != 0) goto L_0x04d0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            lv1.e r1 = r9.f303418t
            java.lang.String r1 = r1.field_updateUrl
            r0.putExtra(r15, r1)
            r1 = 0
            ke3.C88144b.m109791i(r8, r14, r13, r0, r1)
        L_0x04d0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: cm2.C67404c.mo91604d(android.content.Context, android.view.View, pv1.b, java.lang.Object[]):boolean");
    }
}
