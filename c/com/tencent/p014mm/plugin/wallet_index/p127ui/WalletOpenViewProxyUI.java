package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43310p1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.C43337b;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtSaveFetchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ep3.C97688c;
import f32.C75672b;
import f40.C86709a0;
import hp3.C87581a;
import ie3.C76324c;
import ie3.C8883h;
import j20.C117292a;
import j53.C76387f;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import k20.C9556a;
import ke3.C88144b;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C88989a;
import ob0.C117747y;
import ob0.C89132b;
import p910lj.C76701a;
import te3.C49673h83;
import te3.C52159yr2;
import te3.C64514l50;
import te3.C78023zk3;
import v53.C37675a0;
import v53.C78339d;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI */
public class WalletOpenViewProxyUI extends WalletBaseUI {

    /* renamed from: d */
    public C43337b f211049d;

    /* renamed from: e */
    public C76387f.C76388a f211050e;

    /* renamed from: f */
    public Map<String, String> f211051f = new HashMap();

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$a */
    public class C72549a implements UseCaseCallback {
        public C72549a(WalletOpenViewProxyUI walletOpenViewProxyUI) {
        }

        public void call(ITransmitKvData iTransmitKvData) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$b */
    public class C72550b implements UseCaseCallback {
        public C72550b(WalletOpenViewProxyUI walletOpenViewProxyUI) {
        }

        public void call(ITransmitKvData iTransmitKvData) {
            Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "unbindCard: %s", Boolean.valueOf(iTransmitKvData.getBool("unbind_card")));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$c */
    public class C72551c implements Runnable {
        public C72551c(boolean z) {
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("closeWebView", (String) ((HashMap) WalletOpenViewProxyUI.this.f211051f).get("closeWebView"));
            WalletOpenViewProxyUI.this.setResult(-1, intent);
            WalletOpenViewProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$d */
    public class C72552d implements Runnable {
        public C72552d(boolean z) {
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("closeWebView", (String) ((HashMap) WalletOpenViewProxyUI.this.f211051f).get("closeWebView"));
            WalletOpenViewProxyUI.this.setResult(-1, intent);
            WalletOpenViewProxyUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$e */
    public class C72553e implements C76324c.C76325a {
        public C72553e(WalletOpenViewProxyUI walletOpenViewProxyUI) {
        }

        /* renamed from: a */
        public void mo5281a(Intent intent) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$f */
    public class C72554f implements C87581a<Void, C89132b.C89134c<C78023zk3>> {

        /* renamed from: a */
        public final /* synthetic */ Dialog f211054a;

        /* renamed from: b */
        public final /* synthetic */ String f211055b;

        /* renamed from: c */
        public final /* synthetic */ String f211056c;

        public C72554f(Dialog dialog, String str, String str2) {
            this.f211054a = dialog;
            this.f211055b = str;
            this.f211056c = str2;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            boolean z = true;
            Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "on qryusrfunddetail finish, errType: %s, errCode: %s", Integer.valueOf(cVar.f256793a), Integer.valueOf(cVar.f256794b));
            if (WalletOpenViewProxyUI.this.isFinishing() || WalletOpenViewProxyUI.this.isDestroyed()) {
                return null;
            }
            this.f211054a.dismiss();
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C78023zk3 zk32 = (C78023zk3) cVar.f256796d;
                Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", Integer.valueOf(zk32.f228723d), zk32.f228724e);
                if (zk32.f228723d == 0) {
                    C71648n1.m84125c(zk32.f228715U0);
                    ArrayList arrayList = new ArrayList();
                    LinkedList<C64514l50> linkedList = zk32.f228734q;
                    if (linkedList != null && linkedList.size() > 0) {
                        Iterator<C64514l50> it = zk32.f228734q.iterator();
                        while (it.hasNext()) {
                            C64514l50 next = it.next();
                            if (!Util.isNullOrNil(next.f184038d) && !Util.isNullOrNil(next.f184040f)) {
                                arrayList.add(String.format("%s||%s", new Object[]{next.f184038d, next.f184040f}));
                            }
                        }
                    }
                    C43290f0 f0Var = (C43290f0) new C97688c().mo136940b(WalletOpenViewProxyUI.this.getContext(), C43290f0.class);
                    long j = 0;
                    if (this.f211055b.contains("amount")) {
                        j = Util.safeParseLong((String) ((HashMap) WalletOpenViewProxyUI.this.f211051f).get("amount"));
                    }
                    C43290f0.C43294d dVar = f0Var.f117130f;
                    int i = zk32.f228693C;
                    int safeParseInt = Util.safeParseInt((String) ((HashMap) WalletOpenViewProxyUI.this.f211051f).get("entry_scene"));
                    dVar.getClass();
                    ((C88633e) C88643g.m110549g(Integer.valueOf(i), Integer.valueOf(safeParseInt), Long.valueOf(j))).mo123061d(dVar);
                    Intent intent = new Intent(WalletOpenViewProxyUI.this.getContext(), WalletLqtSaveFetchUI.class);
                    intent.putExtra("lqt_save_fund_code", zk32.f228735r);
                    intent.putExtra("lqt_save_fetch_mode", 1);
                    intent.putExtra("lqt_is_show_protocol", zk32.f228731o == 1);
                    if (zk32.f228732p != 1) {
                        z = false;
                    }
                    intent.putExtra("lqt_is_agree_protocol", z);
                    intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
                    intent.putExtra("lqt_profile_wording", zk32.f228745z);
                    intent.putExtra("lqt_account_type", zk32.f228693C);
                    intent.putExtra("lqt_fund_spid", zk32.f228694D);
                    intent.putExtra("operate_id", this.f211056c);
                    if (this.f211055b.contains("entry_scene")) {
                        intent.putExtra("entrance_type", Util.safeParseInt((String) ((HashMap) WalletOpenViewProxyUI.this.f211051f).get("entry_scene")));
                    }
                    if (this.f211055b.contains("amount")) {
                        double d = ((double) j) / 100.0d;
                        intent.putExtra("fill_money", C75228t.m90260n(d));
                        intent.putExtra("limit_cashier_amount", d);
                        intent.putExtra("outer_trans_money", C75228t.m90260n(d));
                    }
                    if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(WalletOpenViewProxyUI.this.getContext(), intent, new C72567k(this))) {
                        WalletOpenViewProxyUI walletOpenViewProxyUI = WalletOpenViewProxyUI.this;
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        WalletOpenViewProxyUI walletOpenViewProxyUI2 = walletOpenViewProxyUI;
                        C117292a.m165358d(walletOpenViewProxyUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI$7", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        walletOpenViewProxyUI.startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(walletOpenViewProxyUI2, "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI$7", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Void;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            }
            WalletOpenViewProxyUI.this.finish();
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99953H7(java.lang.String r17) {
        /*
            r16 = this;
            r8 = r16
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            r10 = 0
            r11 = 1
            java.lang.String r2 = "MicroMsg.WalletOpenViewProxyUI"
            if (r1 != 0) goto L_0x05d2
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "openview"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "open_wcpay_biz_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0042
            java.lang.String r0 = "func[handleOpenView] do open mall_index_ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r16.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1[r10] = r2
            java.lang.String r2 = "MicroMsg.WalletManager"
            java.lang.String r3 = " walletMallV2 switch is ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            java.lang.String r1 = "mall"
            java.lang.String r2 = ".ui.MallIndexUIv2"
            ke3.C88144b.m109789g(r0, r1, r2)
        L_0x003f:
            r0 = 1
            goto L_0x05d8
        L_0x0042:
            java.lang.String r3 = "open_wcpay_hbrefund"
            boolean r3 = r3.equals(r1)
            r4 = 0
            r6 = 3
            r7 = 2
            if (r3 == 0) goto L_0x00ed
            java.lang.String r1 = "func[handleOpenView] do open hbrefund"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            com.tencent.kinda.gen.ITransmitKvData r1 = com.tencent.kinda.gen.ITransmitKvData.create()
            java.lang.String r2 = "refund_open_from"
            r1.putInt(r2, r6)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.mo106619b()
            java.lang.String r3 = "refund_json"
            r1.putString(r3, r2)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.f223677d
            java.lang.String r3 = "refund_lingqian_title"
            r1.putString(r3, r2)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.f223678e
            java.lang.String r3 = "refund_lingqian_desc"
            r1.putString(r3, r2)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.f223679f
            java.lang.String r3 = "refund_origin_title"
            r1.putString(r3, r2)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.f223680g
            java.lang.String r3 = "refund_origin_desc"
            r1.putString(r3, r2)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.f223681h
            java.lang.String r3 = "top_tip"
            r1.putString(r3, r2)
            j53.f$a r2 = r8.f211050e
            java.lang.String r2 = r2.f223682i
            java.lang.String r3 = "refund_time_title"
            r1.putString(r3, r2)
            com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.WCPayHongBaoRefundClickReportStruct
            r2.<init>()
            f40.C86709a0.m107528h()
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EXT_PAY_SETTING_LONG_SYNC
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r3.mo119685f(r6, r4)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            r5 = 3
            long r3 = r3 & r5
            r12 = 2
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((long) r3, (long) r12)
            if (r3 == 0) goto L_0x00ca
            goto L_0x00cb
        L_0x00ca:
            r7 = 1
        L_0x00cb:
            if (r7 != r11) goto L_0x00ce
            r10 = 1
        L_0x00ce:
            java.lang.String r3 = "is_return_to_lq"
            r1.putBool(r3, r10)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            com.tencent.mm.plugin.wallet_index.ui.j r3 = new com.tencent.mm.plugin.wallet_index.ui.j
            r3.<init>(r8)
            java.lang.String r4 = "hongbaoRefundWay"
            r0.startUseCase(r4, r1, r3)
            r2.f194668f = r5
            long r0 = (long) r7
            r2.f194666d = r0
            r2.mo86054n()
            goto L_0x003f
        L_0x00ed:
            java.lang.String r3 = "open_wallet_delay_transfer_setting_ui"
            boolean r3 = r3.equals(r1)
            java.lang.String r12 = "wallet"
            r13 = 0
            if (r3 == 0) goto L_0x0113
            java.lang.String r0 = "func[handleOpenView] do open wallet_delay_transfer_setting_ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "key_scene"
            r0.putExtra(r1, r11)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".pwd.ui.WalletDelayTransferSettingUI"
            ke3.C88144b.m109791i(r1, r12, r2, r0, r13)
            goto L_0x003f
        L_0x0113:
            java.lang.String r3 = "open_wcpay_balance_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0129
            java.lang.String r0 = "func[handleOpenView] do open wallet_balance_manager_ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r16.getContext()
            ie3.C76331i.m91758b(r0, r10)
            goto L_0x003f
        L_0x0129:
            java.lang.String r3 = "open_wcpay_order_detail_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0176
            java.lang.String r0 = "func[handleOpenView] do open mall_order_transaction_info_ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "trans_id"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.putExtra(r2, r1)
            java.lang.String r1 = "scene"
            r0.putExtra(r1, r11)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "bill_id"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x0169
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.putExtra(r2, r1)
        L_0x0169:
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = "order"
            java.lang.String r3 = ".ui.MallOrderTransactionInfoUI"
            ke3.C88144b.m109791i(r1, r2, r3, r0, r13)
            goto L_0x003f
        L_0x0176:
            java.lang.String r3 = "open_wcpay_f2f_receive_detail"
            boolean r3 = r3.equals(r1)
            java.lang.String r14 = "collect"
            java.lang.String r15 = "key_from_scene"
            if (r3 == 0) goto L_0x01be
            java.lang.String r0 = "func[handleOpenView] do open open_wcpay_f2f_receive_detail"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "fromtimestamp"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r4)
            java.lang.String r3 = "key_timestamp"
            r0.putExtra(r3, r1)
            r0.putExtra(r15, r11)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".ui.CollectBillUI"
            ke3.C88144b.m109791i(r1, r14, r2, r0, r13)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 13944(0x3678, float:1.954E-41)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r2[r10] = r3
            r0.mo160131h(r1, r2)
            goto L_0x003f
        L_0x01be:
            java.lang.String r3 = "open_wcpay_grouppay_detail"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "aa"
            java.lang.String r5 = "enter_scene"
            r6 = 5
            if (r3 == 0) goto L_0x0228
            java.lang.String r0 = "func[handleOpenView] do open open_wcpay_grouppay_detail"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "billno"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "bill_no"
            r0.putExtra(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "groupid"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "chatroom"
            r0.putExtra(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "sign"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "key_sign"
            r0.putExtra(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "ver"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "key_ver"
            r0.putExtra(r2, r1)
            r0.putExtra(r5, r6)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".ui.PaylistAAUI"
            ke3.C88144b.m109791i(r1, r4, r2, r0, r13)
            goto L_0x003f
        L_0x0228:
            java.lang.String r3 = "open_wcpay_t2bc_detail"
            boolean r3 = r3.equals(r1)
            java.lang.String r6 = "remittance"
            if (r3 == 0) goto L_0x026a
            java.lang.String r1 = "do open_wcpay_t2bc_detail"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "transfer_bill_id"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            boolean r0 = r0.tryStartTransferToBankDetailUseCase(r1, r13)
            if (r0 != 0) goto L_0x003f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "key_transfer_bill_id"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "key_enter_scene"
            r0.putExtra(r1, r11)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".bankcard.ui.BankRemitDetailUI"
            ke3.C88144b.m109791i(r1, r6, r2, r0, r13)
            goto L_0x003f
        L_0x026a:
            java.lang.String r3 = "open_honey_pay_home"
            boolean r3 = r3.equals(r1)
            java.lang.String r7 = "honey_pay"
            if (r3 == 0) goto L_0x02a5
            java.lang.String r1 = "do open honey pay view"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            boolean r1 = t02.C48527c.m53911g()
            if (r1 == 0) goto L_0x0295
            com.tencent.kinda.gen.ITransmitKvData r1 = com.tencent.kinda.gen.ITransmitKvData.create()
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$a r2 = new com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$a
            r2.<init>(r8)
            java.lang.String r3 = "HoneyPayPayerUseCase"
            r0.startUseCase(r3, r1, r2)
            goto L_0x003f
        L_0x0295:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".ui.HoneyPayMainUI"
            ke3.C88144b.m109791i(r1, r7, r2, r0, r13)
            goto L_0x003f
        L_0x02a5:
            java.lang.String r3 = "open_honey_pay_card_back"
            boolean r3 = r3.equals(r1)
            java.lang.String r9 = "card_id"
            java.lang.String r10 = "key_card_no"
            if (r3 == 0) goto L_0x030d
            java.lang.String r1 = "do open honey pay card back"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            boolean r1 = t02.C48527c.m53911g()
            if (r1 == 0) goto L_0x02de
            com.tencent.kinda.gen.ITransmitKvData r1 = com.tencent.kinda.gen.ITransmitKvData.create()
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f211051f
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            r1.putString(r9, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$b r2 = new com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$b
            r2.<init>(r8)
            java.lang.String r3 = "honeyPayCardBackUseCase"
            r0.startUseCase(r3, r1, r2)
            goto L_0x02f9
        L_0x02de:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r0.putExtra(r10, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".ui.HoneyPayCardBackUI"
            ke3.C88144b.m109791i(r1, r7, r2, r0, r13)
        L_0x02f9:
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$c r1 = new com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$c
            r2 = 1
            r1.<init>(r2)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r2 = 500(0x1f4, double:2.47E-321)
            r11 = 0
            r0.mo183892w(r1, r2, r11)
            return
        L_0x030d:
            r11 = 0
            java.lang.String r3 = "open_honey_pay_user_detail"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x034f
            java.lang.String r0 = "do open honey pay user detail"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "key_is_payer"
            r0.putExtra(r1, r11)
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r9)
            java.lang.String r1 = (java.lang.String) r1
            r0.putExtra(r10, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".ui.HoneyPayProxyUI"
            ke3.C88144b.m109791i(r1, r7, r2, r0, r13)
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$d r1 = new com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$d
            r2 = 1
            r1.<init>(r2)
            zt3.j r0 = (zt3.C119157j) r0
            r0.getClass()
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 0
            r0.mo183892w(r1, r2, r4)
            return
        L_0x034f:
            java.lang.String r3 = "open_wcpay_t2bc_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0378
            java.lang.String r1 = "do open VIEW_OPEN_T2BC_UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            boolean r0 = r0.tryStartTransferToBankUseCase(r13, r13)
            if (r0 != 0) goto L_0x003f
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".bankcard.ui.BankRemitBankcardInputUI"
            ke3.C88144b.m109791i(r1, r6, r2, r0, r13)
            goto L_0x003f
        L_0x0378:
            java.lang.String r3 = "open_wcpay_fetch_balance_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0397
            java.lang.String r0 = "do open VIEW_OPEN_FETCH_BALANCE_UI"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent r0 = new com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent
            r0.<init>()
            com.tencent.mm.autogen.events.WCPayStartBalanceFetchEvent$a r1 = r0.f194030d
            androidx.appcompat.app.AppCompatActivity r2 = r16.getContext()
            r1.f194031a = r2
            r0.publish()
            goto L_0x003f
        L_0x0397:
            java.lang.String r3 = "open_wcpay_wallet_lock_view"
            boolean r3 = r3.equals(r1)
            java.lang.String r6 = "entry_scene"
            java.lang.String r7 = "wallet_lock_jsapi_scene"
            if (r3 == 0) goto L_0x03c7
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            r0.putExtra(r7, r1)
            java.lang.Class<b73.c> r1 = b73.C28273c.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            b73.c r1 = (b73.C28273c) r1
            b73.b r1 = r1.mo55895Jf()
            r1.mo91351e(r8, r0)
            goto L_0x003f
        L_0x03c7:
            java.lang.String r3 = "open_wcpay_security_setting_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0410
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.String> r2 = r8.f211051f
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r2 = r2.get(r6)
            java.lang.String r2 = (java.lang.String) r2
            r1.putExtra(r7, r2)
            yq3.b r2 = yq3.C79144b.m95773a()
            boolean r2 = r2.mo109089d()
            if (r2 == 0) goto L_0x0409
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$e r2 = new com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$e
            r2.<init>(r8)
            r0.startPaySecurityUseCase(r1, r2)
            goto L_0x003f
        L_0x0409:
            java.lang.String r0 = ".pwd.ui.WalletSecuritySettingUI"
            ke3.C88144b.m109791i(r8, r12, r0, r1, r13)
            goto L_0x003f
        L_0x0410:
            java.lang.String r0 = "open_wcpay_c2c_message_view"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x048c
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f211051f
            if (r0 == 0) goto L_0x003f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "bizType"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r1 = -1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            r1 = 1
            if (r0 != r1) goto L_0x003f
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r3 = "bizId"
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f211051f
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r4 = "username"
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f211051f
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.String r5 = "createTime"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r5 = -1
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r4, r5)
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r7 = 3
            r6[r7] = r0
            java.lang.String r0 = "view open c2c message view, bizType: %s, bizId: %s, username: %s, createTime: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r6)
            com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent r0 = new com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent
            r0.<init>()
            com.tencent.mm.autogen.events.JsApiOpenC2CTransferMsgViewEvent$a r2 = r0.f78843d
            r2.f78844a = r1
            r2.f78845b = r3
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r2.f78846c = r1
            r0.publish()
            goto L_0x003f
        L_0x048c:
            java.lang.String r0 = "open_lqt_auto_planindex_view"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04a4
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".balance.ui.lqt.WalletLqtPlanBeforeHomeUI"
            ke3.C88144b.m109791i(r1, r12, r2, r0, r13)
            goto L_0x003f
        L_0x04a4:
            java.lang.String r0 = "open_wcpay_hk_f2f"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04c0
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r1 = 1
            r0.putExtra(r15, r1)
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            java.lang.String r2 = ".ui.CollectHKMainUI"
            ke3.C88144b.m109791i(r1, r14, r2, r0, r13)
            goto L_0x003f
        L_0x04c0:
            java.lang.String r0 = "open_lqt_auto_planadd_view"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0511
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI> r1 = com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtPlanAddUI.class
            r0.<init>(r8, r1)
            java.lang.String r1 = "key_mode"
            r2 = 1
            r0.putExtra(r1, r2)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI"
            java.lang.String r3 = "handleOpenView"
            java.lang.String r4 = "(Ljava/lang/String;)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r16
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r9.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI"
            java.lang.String r2 = "handleOpenView"
            java.lang.String r3 = "(Ljava/lang/String;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r16
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x0511:
            java.lang.String r0 = "open_wcpay_lqt_save"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0554
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f211051f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "trace_info"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1.m84125c(r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f211051f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "operate_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            androidx.appcompat.app.AppCompatActivity r1 = r16.getContext()
            r2 = 0
            android.app.Dialog r1 = com.tencent.p014mm.wallet_core.p137ui.C75197d0.m90163d(r1, r2, r2, r13)
            com.tencent.mm.plugin.wallet.balance.model.lqt.p r2 = new com.tencent.mm.plugin.wallet.balance.model.lqt.p
            r2.<init>()
            nr3.e r2 = r2.mo9225i()
            com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$f r3 = new com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI$f
            r4 = r17
            r3.<init>(r1, r4, r0)
            r2.mo123062e(r3)
            r10 = 0
            goto L_0x05d9
        L_0x0554:
            java.lang.String r0 = "open_wcpay_grouppay_introview"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x05a3
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.f211051f
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "amount"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map<java.lang.String, java.lang.String> r3 = r8.f211051f
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.String r6 = "title"
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r7.putExtra(r1, r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r1 != 0) goto L_0x058a
            java.lang.String r3 = java.net.URLDecoder.decode(r3)
            r7.putExtra(r6, r3)
        L_0x058a:
            r1 = 5
            r7.putExtra(r5, r1)
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r5 = 0
            r1[r5] = r0
            r0 = 1
            r1[r0] = r3
            java.lang.String r3 = "view open grouppay, amount: %s, title: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            java.lang.String r1 = ".ui.AAEntranceUI"
            ke3.C88144b.m109791i(r8, r4, r1, r7, r13)
            goto L_0x05d8
        L_0x05a3:
            r0 = 1
            java.lang.String r3 = "open_transfer_operation_result_view"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x05bd
            com.tencent.mm.plugin.remittance.ui.RemittanceJsapiConfirmEvent r1 = new com.tencent.mm.plugin.remittance.ui.RemittanceJsapiConfirmEvent
            r1.<init>()
            androidx.appcompat.app.AppCompatActivity r2 = r16.getContext()
            android.os.Looper r2 = r2.getMainLooper()
            r1.asyncPublish((android.os.Looper) r2)
            goto L_0x05d8
        L_0x05bd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "func[handleOpenView] invalid target view : "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            goto L_0x05d8
        L_0x05d2:
            r0 = 1
            java.lang.String r1 = "func[handleOpenView] packageExt null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
        L_0x05d8:
            r10 = 1
        L_0x05d9:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r8.f211051f
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = "closeWebView"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.putExtra(r2, r1)
            r1 = -1
            r8.setResult(r1, r0)
            if (r10 == 0) goto L_0x05f6
            r16.finish()
        L_0x05f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_index.p127ui.WalletOpenViewProxyUI.mo99953H7(java.lang.String):void");
    }

    /* renamed from: I7 */
    public final void mo99954I7(Intent intent) {
        if (intent == null) {
            intent = new Intent();
        }
        Log.m105924i("MicroMsg.WalletOpenViewProxyUI", "start LQTDetail");
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtDetailUseCase(getContext(), intent)) {
            C88144b.m109791i(getContext(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, (Bundle) null);
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 563) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("Select_Conv_User");
                Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "select chatroom：%s", stringExtra);
                String str = (String) ((HashMap) this.f211051f).get("amount");
                String str2 = (String) ((HashMap) this.f211051f).get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                Intent intent2 = new Intent();
                intent2.putExtra("amount", str);
                if (!Util.isNullOrNil(str2)) {
                    str2 = URLDecoder.decode(str2);
                    intent2.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
                }
                if (!Util.isNullOrNil(stringExtra)) {
                    intent2.putExtra("chatroom_name", stringExtra);
                }
                intent2.putExtra("enter_scene", 5);
                C88144b.m109791i(getContext(), "aa", ".ui.LaunchAAUI", intent2, (Bundle) null);
                Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", str, str2);
            }
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        String[] split;
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f211049d = new C43337b(this);
        String stringExtra = getIntent().getStringExtra("packageExt");
        Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "packageExt:%s", stringExtra);
        this.f211051f = new HashMap();
        if (!Util.isNullOrNil(stringExtra) && (split = stringExtra.split("&")) != null && split.length > 0) {
            for (int i = 0; i < split.length; i++) {
                if (!Util.isNullOrNil(split[i])) {
                    String[] split2 = split[i].split("=");
                    if (split2.length == 2 && !Util.isNullOrNil(split2[0])) {
                        ((HashMap) this.f211051f).put(split2[0], split2[1]);
                    }
                }
            }
        }
        String str = (String) ((HashMap) this.f211051f).get("trace_info");
        if (!Util.isNullOrNil(str)) {
            C71648n1.m84125c(str);
        }
        addSceneEndListener(2996);
        addSceneEndListener(580);
        addSceneEndListener(385);
        addSceneEndListener(1477);
        if (getIntent() == null) {
            Log.m105918d("MicroMsg.WalletOpenViewProxyUI", "func[doCheckPayNetscene] intent null");
            setResult(0);
            finish();
            return;
        }
        String str2 = (String) ((HashMap) this.f211051f).get("openview");
        String stringExtra2 = getIntent().getStringExtra("appId");
        String stringExtra3 = getIntent().getStringExtra("timeStamp");
        String stringExtra4 = getIntent().getStringExtra("nonceStr");
        String stringExtra5 = getIntent().getStringExtra("packageExt");
        String stringExtra6 = getIntent().getStringExtra("paySignature");
        if ("open_wcpay_f2f_receive_detail".equals(str2)) {
            doSceneForceProgress(new C37675a0(stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6));
        } else if ("open_wcpay_grouppay_detail".equals(str2) || "open_wcpay_hk_f2f".equals(str2) || "open_wallet_delay_transfer_setting_ui".equals(str2)) {
            mo99953H7(stringExtra5);
        } else if ("open_wcpay_lqt_detail".equals(str2)) {
            Log.m105924i("MicroMsg.WalletOpenViewProxyUI", "open lqt detail ui");
            if (this.f211051f != null) {
                new Intent().putExtra("key_account_type", 1);
                String str3 = (String) ((HashMap) this.f211051f).get("ecardtype");
                String str4 = (String) ((HashMap) this.f211051f).get("extradata");
                String str5 = (String) ((HashMap) this.f211051f).get("need_open_lqb");
                Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "open lqt detail ui, ecardtype: %s, extradata: %s, need_open_lqb: %s", str3, str4, str5);
                if (Util.getInt(str5, 0) == 1) {
                    if (Util.isNullOrNil(str3)) {
                        str3 = "WEB_DEBIT";
                    }
                    doSceneForceProgress(new C43310p1(str3, str4));
                } else {
                    int i2 = Util.getInt((String) ((HashMap) this.f211051f).get("auto_jump_charge_setting"), 0);
                    int i3 = Util.getInt((String) ((HashMap) this.f211051f).get("show_open_toast"), 0);
                    Intent intent = new Intent();
                    if (i2 == 1) {
                        intent.putExtra("show_open_toast", i3);
                        C88144b.m109791i(getContext(), "wallet", ".balance.ui.lqt.WalletLqtBalanceAutoTransferUI", intent, (Bundle) null);
                    } else {
                        mo99954I7(intent);
                    }
                    setResult(-1);
                    finish();
                }
            } else {
                mo99954I7((Intent) null);
                setResult(-1);
                finish();
            }
            C115669n.INSTANCE.idkeyStat(663, 18, 1, false);
        } else if ("redenvelopes_getshowresouces_and_move_to_root".equals(str2)) {
            Log.m105924i("MicroMsg.WalletOpenViewProxyUI", "receive envelope");
            ((C75672b) C86312j.m106911c(C75672b.class)).mo95329wA(true, true);
            setResult(-1);
            finish();
        } else if ("open_wcpay_hbrefund".equals(str2)) {
            doSceneForceProgress(new C76387f());
        } else {
            doSceneForceProgress(new C78339d(stringExtra2, stringExtra3, stringExtra4, stringExtra5, getIntent().getStringExtra("signtype"), stringExtra6, getIntent().getStringExtra("url"), 4, "openWCPaySpecificView", getIntent().getIntExtra("pay_channel", 0)));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(580);
        removeSceneEndListener(385);
        removeSceneEndListener(2996);
        removeSceneEndListener(1477);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (i != 0 || i2 != 0) {
            setResult(0);
            finish();
            return true;
        } else if (yVar instanceof C78339d) {
            C8883h.f28150a = ((C78339d) yVar).mo108331j1();
            mo99953H7(getIntent().getStringExtra("packageExt"));
            return true;
        } else if (yVar instanceof C37675a0) {
            mo99953H7(getIntent().getStringExtra("packageExt"));
            return true;
        } else if (yVar instanceof C43310p1) {
            C49673h83 h832 = ((C43310p1) yVar).f117146d;
            Log.m105925i("MicroMsg.WalletOpenViewProxyUI", "on open lqb account scene end, retcode: %s, regmsg: %s", Integer.valueOf(h832.f134500d), h832.f134501e);
            C52159yr2 yr22 = h832.f134502f;
            if (yr22 != null) {
                this.f211049d.mo67549a(yr22, (C43337b.C43339b) null);
            }
            if (h832.f134500d == 0) {
                Intent intent = new Intent();
                intent.putExtra("key_account_type", 2);
                mo99954I7(intent);
                setResult(-1);
            } else if (h832.f134502f == null) {
                C76701a.makeText((Context) this, (CharSequence) h832.f134501e, 1).show();
                setResult(0);
            }
            finish();
            return true;
        } else {
            if (yVar instanceof C76387f) {
                this.f211050e = ((C76387f) yVar).mo106618j1();
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, this.f211050e.mo106619b());
                mo99953H7(getIntent().getStringExtra("packageExt"));
            }
            return false;
        }
    }
}
