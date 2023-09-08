package com.tencent.p014mm.plugin.wallet_index.p127ui;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C57930i0;
import com.tencent.wxmm.v2helper;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import n63.C76835c;
import nj3.C88990b;
import ob0.C11385n;
import ob0.C89137b0;
import qo3.C89779i0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/wallet_index/ui/WecoinIapUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI */
public final class WecoinIapUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f211060p = 0;

    /* renamed from: d */
    public C72568l f211061d;

    /* renamed from: e */
    public int f211062e = 6;

    /* renamed from: f */
    public final int f211063f = 1;

    /* renamed from: g */
    public final int f211064g = 2;

    /* renamed from: h */
    public int f211065h = 0;

    /* renamed from: i */
    public final int f211066i = 1002;

    /* renamed from: j */
    public boolean f211067j = true;

    /* renamed from: n */
    public Dialog f211068n;

    /* renamed from: o */
    public C72555a f211069o;

    /* renamed from: com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI$a */
    public static final class C72555a implements C11385n {

        /* renamed from: d */
        public final WeakReference<WecoinIapUI> f211070d;

        public C72555a(WeakReference<WecoinIapUI> weakReference) {
            this.f211070d = weakReference;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x010d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onSceneEnd(int r18, int r19, java.lang.String r20, ob0.C117747y r21) {
            /*
                r17 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "onSceneEnd type:"
                r3.append(r4)
                int r4 = r21.getType()
                r3.append(r4)
                java.lang.String r4 = " errCode:"
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = ",errMsg:"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "MicroMsg.WecoinIapUI"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                n63.c r3 = n63.C76835c.m92625b(r19, r20)
                int r5 = r3.f224657a
                java.lang.String r6 = r3.f224658b
                int r7 = r21.getType()
                r8 = r17
                java.lang.ref.WeakReference<com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI> r9 = r8.f211070d
                if (r9 == 0) goto L_0x033e
                java.lang.Object r9 = r9.get()
                com.tencent.mm.plugin.wallet_index.ui.WecoinIapUI r9 = (com.tencent.p014mm.plugin.wallet_index.p127ui.WecoinIapUI) r9
                if (r9 == 0) goto L_0x033e
                r10 = 414(0x19e, float:5.8E-43)
                java.lang.String r11 = " , errMsg: "
                java.lang.String r16 = ""
                r15 = 0
                r14 = 1
                r13 = 0
                if (r7 == r10) goto L_0x019f
                r0 = 422(0x1a6, float:5.91E-43)
                if (r7 == r0) goto L_0x0072
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "get a wrong sceneType : "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
                goto L_0x033e
            L_0x0072:
                com.tencent.mm.plugin.wallet_index.ui.l r0 = r9.f211061d
                if (r0 == 0) goto L_0x00a7
                java.lang.String r1 = "errorMsg"
                gy3.C87412m.m108593f(r6, r1)
                n63.c r1 = n63.C76835c.m92625b(r5, r6)
                int r3 = r1.f224657a
                boolean r5 = r2 instanceof com.tencent.p014mm.wallet_core.model.C57930i0
                if (r5 == 0) goto L_0x00a8
                if (r3 != 0) goto L_0x00a8
                com.tencent.mm.wallet_core.model.i0 r2 = (com.tencent.p014mm.wallet_core.model.C57930i0) r2
                ob0.c r2 = r2.f165789d
                ob0.c$d r2 = r2.f127056b
                pe3.a r2 = r2.f127083a
                te3.dh3 r2 = (te3.C49147dh3) r2
                java.lang.String r3 = r2.f132328d
                if (r3 != 0) goto L_0x0097
                r3 = r16
            L_0x0097:
                r0.f211110b = r3
                te3.qv3 r2 = r2.f132332h
                byte[] r2 = sf0.C48374j0.m53715d(r2)
                java.lang.String r3 = "preScene.buffer"
                gy3.C87412m.m108593f(r2, r3)
                r0.f211111c = r2
                goto L_0x00a8
            L_0x00a7:
                r1 = r15
            L_0x00a8:
                int r0 = r1.f224657a
                if (r0 != 0) goto L_0x017b
                boolean r0 = r9.f211067j
                if (r0 == 0) goto L_0x033e
                r9.mo99959H7()
                r9.f211067j = r13
                java.lang.String r0 = "PreparePurchase success, launch Wecoin Consume"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                boolean r0 = r9.f211067j
                if (r0 == 0) goto L_0x00c5
                java.lang.String r0 = "[WeCoin] consumeWeCoin failed, PreChecking = true"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                goto L_0x0175
            L_0x00c5:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r9)
                com.tencent.mm.plugin.wallet_index.ui.l r1 = r9.f211061d
                if (r1 == 0) goto L_0x00d2
                int r1 = r1.f211122n
                r11 = r1
                goto L_0x00d3
            L_0x00d2:
                r11 = 0
            L_0x00d3:
                s43.e r1 = new s43.e
                com.tencent.mm.plugin.wallet_index.ui.n r2 = new com.tencent.mm.plugin.wallet_index.ui.n
                r2.<init>(r9, r0)
                com.tencent.mm.plugin.wallet_index.ui.o r3 = new com.tencent.mm.plugin.wallet_index.ui.o
                r3.<init>(r9, r0)
                com.tencent.mm.plugin.wallet_index.ui.p r5 = new com.tencent.mm.plugin.wallet_index.ui.p
                r5.<init>(r0)
                r10 = r1
                r12 = r9
                r6 = 0
                r13 = r2
                r7 = 1
                r14 = r3
                r0 = r15
                r15 = r5
                r10.<init>(r11, r12, r13, r14, r15)
                com.tencent.mm.plugin.wallet_index.ui.l r2 = r9.f211061d
                if (r2 == 0) goto L_0x00f6
                byte[] r15 = r2.f211111c
                goto L_0x00f7
            L_0x00f6:
                r15 = r0
            L_0x00f7:
                if (r15 == 0) goto L_0x0103
                int r3 = r15.length
                if (r3 != 0) goto L_0x00fe
                r14 = 1
                goto L_0x00ff
            L_0x00fe:
                r14 = 0
            L_0x00ff:
                if (r14 != r7) goto L_0x0103
                r14 = 1
                goto L_0x0104
            L_0x0103:
                r14 = 0
            L_0x0104:
                if (r14 == 0) goto L_0x010d
                java.lang.String r0 = "[WeCoin] consumeWeCoin failed, buffer empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                goto L_0x0175
            L_0x010d:
                r1.f38603g = r15
                s43.d r3 = s43.C13623d.ShowPanel
                r1.f38602f = r3
                if (r2 == 0) goto L_0x0119
                java.lang.String r3 = r2.f211120l
                if (r3 != 0) goto L_0x011b
            L_0x0119:
                r3 = r16
            L_0x011b:
                r1.f38604h = r3
                if (r2 == 0) goto L_0x0122
                java.lang.String r15 = r2.f211121m
                goto L_0x0123
            L_0x0122:
                r15 = r0
            L_0x0123:
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r2 != 0) goto L_0x0136
                com.tencent.mm.plugin.wallet_index.ui.l r2 = r9.f211061d
                if (r2 == 0) goto L_0x0130
                java.lang.String r15 = r2.f211121m
                goto L_0x0131
            L_0x0130:
                r15 = r0
            L_0x0131:
                gy3.C87412m.m108591d(r15)
                r1.f38605i = r15
            L_0x0136:
                com.tencent.mm.plugin.wallet_index.ui.l r2 = r9.f211061d
                if (r2 == 0) goto L_0x013d
                java.lang.String r15 = r2.f211112d
                goto L_0x013e
            L_0x013d:
                r15 = r0
            L_0x013e:
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r15)
                r1.f38606j = r0
                com.tencent.mm.plugin.wallet_index.ui.l r0 = r9.f211061d
                if (r0 == 0) goto L_0x0164
                java.lang.String r0 = r0.f211113e
                if (r0 == 0) goto L_0x0164
                r2 = 2131840177(0x7f114cb1, float:1.9313626E38)
                java.lang.Object[] r3 = new java.lang.Object[r7]
                r3[r6] = r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r2, r3)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 != 0) goto L_0x0164
                java.lang.String r2 = "productWecoinRealPrice"
                gy3.C87412m.m108593f(r0, r2)
                r1.f38607k = r0
            L_0x0164:
                java.lang.Class<m53.c> r0 = m53.C10756c.class
                k40.a r0 = f40.C86709a0.m107533q(r0)
                m53.c r0 = (m53.C10756c) r0
                java.lang.Object r0 = r0.mo10992Gy(r1)
                java.lang.String r1 = "service<IWeCoinManager>(…).startConsume(parameter)"
                gy3.C87412m.m108593f(r0, r1)
            L_0x0175:
                int r0 = r9.f211063f
                r9.f211065h = r0
                goto L_0x033e
            L_0x017b:
                r7 = 1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "back to preview UI, reason: PreparePurchase fail , errCode: "
                r0.append(r2)
                int r2 = r1.f224657a
                r0.append(r2)
                r0.append(r11)
                java.lang.String r2 = r1.f224658b
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r9.mo99960I7(r1, r7)
                goto L_0x033e
            L_0x019f:
                r5 = r15
                r6 = 0
                r7 = 1
                com.tencent.mm.plugin.wallet_index.ui.l r10 = r9.f211061d
                if (r10 == 0) goto L_0x026a
                boolean r12 = r2 instanceof com.tencent.p014mm.wallet_core.model.C57931j0
                if (r12 == 0) goto L_0x01ca
                com.tencent.mm.wallet_core.model.j0 r2 = (com.tencent.p014mm.wallet_core.model.C57931j0) r2
                java.lang.String r12 = r2.f165796f
                java.lang.String r13 = "scene.productId"
                gy3.C87412m.m108593f(r12, r13)
                r10.f211117i = r12
                java.lang.String r12 = r2.f165798h
                if (r12 != 0) goto L_0x01bb
                r12 = r16
            L_0x01bb:
                r10.f211114f = r12
                int r12 = r2.f165797g
                r10.f211115g = r12
                int r2 = r2.f165799i
                if (r2 != 0) goto L_0x01c7
                r14 = 1
                goto L_0x01c8
            L_0x01c7:
                r14 = 0
            L_0x01c8:
                r13 = r14
                goto L_0x01cb
            L_0x01ca:
                r13 = 0
            L_0x01cb:
                java.util.List<java.lang.String> r2 = r10.f211116h
                java.lang.String r12 = r10.f211117i
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                r2.remove(r12)
                java.lang.String r2 = "Verify "
                java.lang.String r12 = "MicroMsg.WecoinIapData"
                if (r13 == 0) goto L_0x0202
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r2)
                java.lang.String r2 = r10.f211117i
                r13.append(r2)
                java.lang.String r2 = " OK"
                r13.append(r2)
                java.lang.String r2 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                java.util.ArrayList<java.lang.String> r2 = r10.f211118j
                java.lang.String r12 = r10.f211117i
                r2.add(r12)
                java.util.ArrayList<java.lang.String> r2 = r10.f211119k
                java.lang.String r10 = r10.f211114f
                r2.add(r10)
                goto L_0x026a
            L_0x0202:
                java.lang.String r13 = r10.f211117i
                r14 = 2
                java.lang.String r15 = "com.tencent.xin.wco"
                boolean r13 = z04.C112551y.m153820t(r13, r15, r6, r14, r5)
                java.lang.String r14 = " fail"
                if (r13 == 0) goto L_0x0253
                int r13 = r10.f211115g
                if (r13 <= 0) goto L_0x023b
                java.util.ArrayList<java.lang.String> r13 = r10.f211118j
                java.lang.String r14 = r10.f211117i
                r13.add(r14)
                java.util.ArrayList<java.lang.String> r13 = r10.f211119k
                java.lang.String r14 = r10.f211114f
                r13.add(r14)
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r2)
                java.lang.String r2 = r10.f211117i
                r13.append(r2)
                java.lang.String r2 = " fail and consume"
                r13.append(r2)
                java.lang.String r2 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                goto L_0x026a
            L_0x023b:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r2)
                java.lang.String r2 = r10.f211117i
                r13.append(r2)
                r13.append(r14)
                java.lang.String r2 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
                goto L_0x026a
            L_0x0253:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r2)
                java.lang.String r2 = r10.f211117i
                r13.append(r2)
                r13.append(r14)
                java.lang.String r2 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            L_0x026a:
                com.tencent.mm.plugin.wallet_index.ui.l r2 = r9.f211061d
                if (r2 == 0) goto L_0x027a
                java.util.List<java.lang.String> r2 = r2.f211116h
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                boolean r2 = r2.isEmpty()
                if (r7 != r2) goto L_0x027a
                r14 = 1
                goto L_0x027b
            L_0x027a:
                r14 = 0
            L_0x027b:
                if (r14 == 0) goto L_0x033e
                java.lang.String r2 = "Verify All End... "
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r2)
                com.tencent.mm.plugin.wallet_index.ui.l r2 = r9.f211061d
                if (r2 == 0) goto L_0x0293
                java.util.ArrayList<java.lang.String> r2 = r2.f211118j
                if (r2 == 0) goto L_0x0293
                boolean r2 = r2.isEmpty()
                r2 = r2 ^ r7
                if (r7 != r2) goto L_0x0293
                r14 = 1
                goto L_0x0294
            L_0x0293:
                r14 = 0
            L_0x0294:
                if (r14 == 0) goto L_0x0320
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "mResultProductIds size: "
                r0.append(r1)
                com.tencent.mm.plugin.wallet_index.ui.l r1 = r9.f211061d
                if (r1 == 0) goto L_0x02ad
                java.util.ArrayList<java.lang.String> r1 = r1.f211118j
                if (r1 == 0) goto L_0x02ad
                int r13 = r1.size()
                goto L_0x02ae
            L_0x02ad:
                r13 = 0
            L_0x02ae:
                r0.append(r13)
                java.lang.String r1 = ", Consume ..."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                n63.c r0 = n63.C76835c.m92624a(r6)
                com.tencent.mm.plugin.wallet_index.ui.l r1 = r9.f211061d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Consume finished: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                boolean r2 = r0.mo107104c()
                if (r2 == 0) goto L_0x02e3
                java.lang.String r2 = "back to preview UI, reason: consume Fail ! "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                goto L_0x02e8
            L_0x02e3:
                java.lang.String r2 = "back to preview UI, reason: consume Success ! "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            L_0x02e8:
                android.content.Intent r2 = new android.content.Intent
                r2.<init>()
                int r3 = r0.f224657a
                java.lang.String r4 = "key_err_code"
                r2.putExtra(r4, r3)
                java.lang.String r0 = r0.f224658b
                java.lang.String r3 = "key_err_msg"
                r2.putExtra(r3, r0)
                if (r1 == 0) goto L_0x0300
                java.util.ArrayList<java.lang.String> r15 = r1.f211118j
                goto L_0x0301
            L_0x0300:
                r15 = r5
            L_0x0301:
                java.lang.String r0 = "key_response_product_ids"
                r2.putStringArrayListExtra(r0, r15)
                if (r1 == 0) goto L_0x030b
                java.util.ArrayList<java.lang.String> r15 = r1.f211119k
                goto L_0x030c
            L_0x030b:
                r15 = r5
            L_0x030c:
                java.lang.String r0 = "key_response_series_ids"
                r2.putStringArrayListExtra(r0, r15)
                long r0 = com.tencent.p014mm.plugin.wallet_index.p127ui.C72556a.f211072m
                java.lang.String r3 = "key_launch_ts"
                r2.putExtra(r3, r0)
                r0 = -1
                r9.setResult(r0, r2)
                r9.finish()
                goto L_0x033e
            L_0x0320:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "back to preview UI, reason: VerifyPurchase fail , errCode: "
                r2.append(r5)
                r2.append(r0)
                r2.append(r11)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
                r0 = 3
                r9.mo99960I7(r3, r0)
            L_0x033e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_index.p127ui.WecoinIapUI.C72555a.onSceneEnd(int, int, java.lang.String, ob0.y):void");
        }
    }

    /* renamed from: H7 */
    public final void mo99959H7() {
        Log.m105924i("MicroMsg.WecoinIapUI", "hideLoadingDialog!");
        Dialog dialog = this.f211068n;
        if (dialog != null) {
            boolean z = true;
            if (dialog == null || !dialog.isShowing()) {
                z = false;
            }
            if (z) {
                Dialog dialog2 = this.f211068n;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                this.f211068n = null;
            }
        }
    }

    /* renamed from: I7 */
    public final void mo99960I7(C76835c cVar, int i) {
        int i2 = cVar.f224657a;
        Log.m105924i("MicroMsg.WecoinIapUI", "Consume failed: " + cVar.f224657a);
        Intent intent = new Intent();
        intent.putExtra("key_err_code", cVar.f224657a);
        intent.putExtra("key_err_msg", cVar.f224658b);
        if (i != -1) {
            intent.putExtra("key_response_position", i);
        }
        setResult(-1, intent);
        finish();
    }

    public void finish() {
        Log.m105924i("MicroMsg.WecoinIapUI", "finish");
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f211069o = new C72555a(new WeakReference(this));
        overridePendingTransition(0, 0);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        C88990b.m111194c(this, (C88990b.C61771c) null);
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        C72555a aVar = this.f211069o;
        if (aVar != null) {
            b0Var.mo123455a(v2helper.EMethodOutputVolumeGainEnable, aVar);
            C89137b0 b0Var2 = C86709a0.m107529k().f251779b;
            C72555a aVar2 = this.f211069o;
            if (aVar2 != null) {
                b0Var2.mo123455a(414, aVar2);
                this.f211061d = new C72568l();
                Log.m105924i("MicroMsg.WecoinIapUI", "onHandleIntent");
                Intent intent = getIntent();
                if (getIntent().getBooleanExtra("key_request_fullscreen", false)) {
                    getWindow().addFlags(1024);
                }
                C72568l lVar = this.f211061d;
                if (lVar != null) {
                    String stringExtra = intent.getStringExtra("key_product_id");
                    String str = "";
                    if (stringExtra == null) {
                        stringExtra = str;
                    }
                    lVar.f211117i = stringExtra;
                    ((ArrayList) lVar.f211116h).add(stringExtra);
                    Log.m105924i("MicroMsg.WecoinIapData", "prepare pay product: " + stringExtra);
                    lVar.f211112d = intent.getStringExtra("key_wecoin_price");
                    lVar.f211113e = intent.getStringExtra("key_price");
                    intent.getIntExtra("key_count", 1);
                    intent.getStringExtra("key_currency_type");
                    String stringExtra2 = intent.getStringExtra("key_desc");
                    if (stringExtra2 == null) {
                        stringExtra2 = str;
                    }
                    lVar.f211120l = stringExtra2;
                    lVar.f211109a = intent.getIntExtra("key_pay_type", this.f211062e);
                    String stringExtra3 = intent.getStringExtra("key_product_title_insufficient");
                    if (stringExtra3 != null) {
                        str = stringExtra3;
                    }
                    lVar.f211121m = str;
                    return;
                }
                return;
            }
            C87412m.m108603p("mNetSceneCallback");
            throw null;
        }
        C87412m.m108603p("mNetSceneCallback");
        throw null;
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.WecoinIapUI", "onDestroy");
        mo99959H7();
        C89137b0 b0Var = C86709a0.m107529k().f251779b;
        C72555a aVar = this.f211069o;
        if (aVar != null) {
            b0Var.mo123470p(v2helper.EMethodOutputVolumeGainEnable, aVar);
            C89137b0 b0Var2 = C86709a0.m107529k().f251779b;
            C72555a aVar2 = this.f211069o;
            if (aVar2 != null) {
                b0Var2.mo123470p(414, aVar2);
                super.onDestroy();
                return;
            }
            C87412m.m108603p("mNetSceneCallback");
            throw null;
        }
        C87412m.m108603p("mNetSceneCallback");
        throw null;
    }

    public void onResume() {
        Log.m105924i("MicroMsg.WecoinIapUI", "onResume");
        super.onResume();
        C72568l lVar = this.f211061d;
        C57930i0 i0Var = lVar != null ? new C57930i0(lVar.f211117i, lVar.f211112d, lVar.f211109a) : null;
        if (i0Var != null && this.f211067j) {
            Log.m105924i("MicroMsg.WecoinIapUI", "showLoadingDialog!");
            this.f211068n = C89779i0.m112248e(this, getString(C0966R.string.a4d), true, 0, new C72569m(this));
            C86709a0.m107529k().f251779b.mo123460f(i0Var);
        }
    }

    public void onStop() {
        Log.m105924i("MicroMsg.WecoinIapUI", "onStop");
        super.onStop();
    }
}
