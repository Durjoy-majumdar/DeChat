package com.tencent.p014mm.plugin.wallet.balance.model.lqt;

import android.app.Activity;
import android.app.Dialog;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71633i0;

/* renamed from: com.tencent.mm.plugin.wallet.balance.model.lqt.l0 */
public final class C71639l0<T> implements C71633i0.C71635b {

    /* renamed from: a */
    public final /* synthetic */ Dialog f207634a;

    /* renamed from: b */
    public final /* synthetic */ Activity f207635b;

    /* renamed from: c */
    public final /* synthetic */ C71637j0 f207636c;

    /* renamed from: d */
    public final /* synthetic */ C71633i0 f207637d;

    /* renamed from: e */
    public final /* synthetic */ String f207638e;

    /* renamed from: f */
    public final /* synthetic */ String f207639f;

    /* renamed from: g */
    public final /* synthetic */ String f207640g;

    public C71639l0(Dialog dialog, Activity activity, C71637j0 j0Var, C71633i0 i0Var, String str, String str2, String str3) {
        this.f207634a = dialog;
        this.f207635b = activity;
        this.f207636c = j0Var;
        this.f207637d = i0Var;
        this.f207638e = str;
        this.f207639f = str2;
        this.f207640g = str3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: sx3.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x006c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(java.lang.Object r13) {
        /*
            r12 = this;
            te3.zk3 r13 = (te3.C78023zk3) r13
            android.app.Dialog r0 = r12.f207634a
            if (r0 == 0) goto L_0x0009
            r0.dismiss()
        L_0x0009:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fetch detail success, account_type: "
            r0.append(r1)
            int r1 = r13.f228693C
            r0.append(r1)
            java.lang.String r1 = ", is_hide_close_account_btn: "
            r0.append(r1)
            boolean r1 = r13.f228692B
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LqtNativeUrlJumpHandler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            android.app.Activity r0 = r12.f207635b
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x016a
            android.app.Activity r0 = r12.f207635b
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L_0x003d
            goto L_0x016a
        L_0x003d:
            com.tencent.mm.plugin.wallet.balance.model.lqt.j0 r0 = r12.f207636c
            int r0 = r0.ordinal()
            r2 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r2) goto L_0x004b
            r0 = 8
            goto L_0x0052
        L_0x004b:
            rx3.j r13 = new rx3.j
            r13.<init>()
            throw r13
        L_0x0051:
            r0 = 3
        L_0x0052:
            com.tencent.mm.plugin.wallet.balance.model.lqt.i0 r3 = r12.f207637d
            int r4 = r13.f228693C
            com.tencent.mm.plugin.wallet.balance.model.lqt.f0 r3 = r3.f207626a
            com.tencent.mm.plugin.wallet.balance.model.lqt.f0$c r3 = r3.f117129e
            r3.mo67529b(r4, r0)
            java.util.LinkedList<te3.l50> r3 = r13.f228734q
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x00bb
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x006c:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x00bd
            java.lang.Object r7 = r3.next()
            te3.l50 r7 = (te3.C64514l50) r7
            java.lang.String r8 = r7.f184038d
            if (r8 == 0) goto L_0x0085
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r8 = 0
            goto L_0x0086
        L_0x0085:
            r8 = 1
        L_0x0086:
            if (r8 != 0) goto L_0x00b4
            java.lang.String r8 = r7.f184040f
            if (r8 == 0) goto L_0x0095
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r8 = 0
            goto L_0x0096
        L_0x0095:
            r8 = 1
        L_0x0096:
            if (r8 == 0) goto L_0x0099
            goto L_0x00b4
        L_0x0099:
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = r7.f184038d
            r9[r5] = r10
            java.lang.String r7 = r7.f184040f
            r9[r2] = r7
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r9, r8)
            java.lang.String r8 = "%s||%s"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            java.lang.String r8 = "format(format, *args)"
            gy3.C87412m.m108593f(r7, r8)
            goto L_0x00b5
        L_0x00b4:
            r7 = r4
        L_0x00b5:
            if (r7 == 0) goto L_0x006c
            r6.add(r7)
            goto L_0x006c
        L_0x00bb:
            sx3.f0 r6 = sx3.C64186f0.f181907d
        L_0x00bd:
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            java.lang.String r7 = r12.f207638e
            java.lang.String r8 = r12.f207639f
            java.lang.String r9 = r12.f207640g
            java.lang.String r10 = r13.f228735r
            java.lang.String r11 = "lqt_save_fund_code"
            r3.putExtra(r11, r10)
            java.lang.String r10 = "lqt_save_fetch_mode"
            r3.putExtra(r10, r2)
            int r10 = r13.f228731o
            if (r10 != r2) goto L_0x00da
            r10 = 1
            goto L_0x00db
        L_0x00da:
            r10 = 0
        L_0x00db:
            java.lang.String r11 = "lqt_is_show_protocol"
            r3.putExtra(r11, r10)
            int r10 = r13.f228732p
            if (r10 != r2) goto L_0x00e6
            r10 = 1
            goto L_0x00e7
        L_0x00e6:
            r10 = 0
        L_0x00e7:
            java.lang.String r11 = "lqt_is_agree_protocol"
            r3.putExtra(r11, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r6)
            java.lang.String r6 = "lqt_protocol_list"
            r3.putStringArrayListExtra(r6, r10)
            java.lang.String r6 = r13.f228745z
            java.lang.String r10 = "lqt_profile_wording"
            r3.putExtra(r10, r6)
            int r6 = r13.f228693C
            java.lang.String r10 = "lqt_account_type"
            r3.putExtra(r10, r6)
            java.lang.String r13 = r13.f228694D
            java.lang.String r6 = "lqt_fund_spid"
            r3.putExtra(r6, r13)
            java.lang.String r13 = "operate_id"
            r3.putExtra(r13, r7)
            java.lang.String r13 = "entrance_type"
            r3.putExtra(r13, r0)
            java.lang.String r13 = "is_from_kinda_balance"
            r3.putExtra(r13, r2)
            if (r8 == 0) goto L_0x0130
            int r13 = r8.length()
            if (r13 <= 0) goto L_0x0124
            r13 = 1
            goto L_0x0125
        L_0x0124:
            r13 = 0
        L_0x0125:
            if (r13 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r8 = r4
        L_0x0129:
            if (r8 == 0) goto L_0x0130
            java.lang.String r13 = "fill_money"
            r3.putExtra(r13, r8)
        L_0x0130:
            if (r9 == 0) goto L_0x0144
            int r13 = r9.length()
            if (r13 <= 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r2 = 0
        L_0x013a:
            if (r2 == 0) goto L_0x013d
            r4 = r9
        L_0x013d:
            if (r4 == 0) goto L_0x0144
            java.lang.String r13 = "card_serial"
            r3.putExtra(r13, r4)
        L_0x0144:
            java.lang.String r13 = "start lqt save use case"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
            java.lang.Class<ie3.c> r13 = ie3.C76324c.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ie3.c r13 = (ie3.C76324c) r13
            android.app.Activity r0 = r12.f207635b
            com.tencent.mm.plugin.wallet.balance.model.lqt.k0 r1 = com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71638k0.f207633a
            boolean r13 = r13.startLqtSaveUseCase(r0, r3, r1)
            if (r13 != 0) goto L_0x0170
            android.app.Activity r13 = r12.f207635b
            r0 = 32770(0x8002, float:4.592E-41)
            java.lang.String r1 = "wallet"
            java.lang.String r2 = ".balance.ui.lqt.WalletLqtSaveFetchUI"
            ke3.C88144b.m109795m(r13, r1, r2, r3, r0)
            goto L_0x0170
        L_0x016a:
            java.lang.String r13 = "this activity has finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r13)
        L_0x0170:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71639l0.call(java.lang.Object):void");
    }
}
