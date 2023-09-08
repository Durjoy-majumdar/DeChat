package com.tencent.p014mm.plugin.mall.p075ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.mall.ui.MallWalletSectionView */
public class MallWalletSectionView extends LinearLayout {
    public MallWalletSectionView(Context context) {
        super(context);
        View.inflate(context, C0966R.C0971layout.baz, this);
        setOrientation(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66643a(te3.C49009cj2 r20, boolean r21, di0.C86300q r22, com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.C43429f r23) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.Class<ub3.b> r3 = ub3.C78144b.class
            java.util.LinkedList<te3.te4> r0 = r2.f131777e
            if (r0 == 0) goto L_0x0180
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC
            java.lang.String r5 = ""
            java.lang.Object r0 = r0.mo119685f(r4, r5)
            java.lang.String r0 = (java.lang.String) r0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r7 = 0
            java.lang.String r8 = "MicroMsg.MallWalletSectionView"
            if (r4 != 0) goto L_0x0034
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e }
            r4.<init>(r0)     // Catch:{ JSONException -> 0x002e }
            goto L_0x0035
        L_0x002e:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r5, r4)
        L_0x0034:
            r4 = 0
        L_0x0035:
            int r0 = r19.getChildCount()
            java.util.LinkedList<te3.te4> r9 = r2.f131777e
            int r15 = r9.size()
            r14 = 1
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
            r9[r7] = r10
            java.lang.String r10 = "cell size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r9)
            r13 = 0
        L_0x004e:
            if (r13 >= r15) goto L_0x0174
            java.util.LinkedList<te3.te4> r9 = r2.f131777e
            java.lang.Object r9 = r9.get(r13)
            r10 = r9
            te3.te4 r10 = (te3.te4) r10
            java.lang.String r9 = r10.f142187i
            java.lang.String r11 = "balance_cell"
            boolean r9 = r11.equals(r9)
            java.lang.String r12 = "100"
            r6 = 2131839645(0x7f114a9d, float:1.9312547E38)
            r17 = 0
            if (r9 == 0) goto L_0x00bd
            di3.d r9 = di3.C86312j.m106911c(r3)
            ub3.b r9 = (ub3.C78144b) r9
            com.tencent.mm.wallet_core.model.q0 r9 = r9.mo107980OI()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC
            java.lang.Long r14 = java.lang.Long.valueOf(r17)
            java.lang.Object r7 = r9.mo119992d(r7, r14)
            java.lang.Long r7 = (java.lang.Long) r7
            r14 = r12
            long r11 = r7.longValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r9 = r19.getContext()
            java.lang.String r6 = r9.getString(r6)
            r7.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            r12 = r14
            r11 = 2
            java.math.BigDecimal r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90248h(r6, r12, r11, r9)
            double r11 = r6.doubleValue()
            java.lang.String r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r11)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r11 = r10
            goto L_0x011a
        L_0x00bd:
            java.lang.String r7 = r10.f142187i
            java.lang.String r11 = "lqt_cell"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0118
            di3.d r7 = di3.C86312j.m106911c(r3)
            ub3.b r7 = (ub3.C78144b) r7
            com.tencent.mm.wallet_core.model.q0 r7 = r7.mo107980OI()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_LQT_LONG_SYNC
            java.lang.Long r14 = java.lang.Long.valueOf(r17)
            java.lang.Object r7 = r7.mo119992d(r11, r14)
            java.lang.Long r7 = (java.lang.Long) r7
            r11 = r10
            long r9 = r7.longValue()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            android.content.Context r14 = r19.getContext()
            java.lang.String r6 = r14.getString(r6)
            r7.append(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.math.RoundingMode r9 = java.math.RoundingMode.HALF_UP
            r10 = 2
            java.math.BigDecimal r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90248h(r6, r12, r10, r9)
            double r9 = r6.doubleValue()
            java.lang.String r6 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            goto L_0x011a
        L_0x0118:
            r11 = r10
            r6 = 0
        L_0x011a:
            if (r13 >= r0) goto L_0x0141
            java.lang.String r7 = "update view"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r7)
            android.view.View r7 = r1.getChildAt(r13)
            r9 = r7
            com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView r9 = (com.tencent.p014mm.plugin.mall.p075ui.MallWalletSectionCellView) r9
            int r7 = r15 + -1
            if (r13 >= r7) goto L_0x012e
            r12 = 1
            goto L_0x012f
        L_0x012e:
            r12 = 0
        L_0x012f:
            r10 = r11
            r11 = r4
            r7 = r13
            r13 = r6
            r17 = 1
            r14 = r21
            r6 = r15
            r15 = r22
            r16 = r23
            r9.mo66640c(r10, r11, r12, r13, r14, r15, r16)
            r2 = r6
            goto L_0x016b
        L_0x0141:
            r7 = r13
            r17 = 1
            java.lang.String r9 = "insert view"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r9)
            com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView r14 = new com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView
            android.content.Context r9 = r19.getContext()
            r14.<init>(r9)
            int r9 = r15 + -1
            if (r7 >= r9) goto L_0x0158
            r12 = 1
            goto L_0x0159
        L_0x0158:
            r12 = 0
        L_0x0159:
            r9 = r14
            r10 = r11
            r11 = r4
            r13 = r6
            r6 = r14
            r14 = r21
            r2 = r15
            r15 = r22
            r16 = r23
            r9.mo66640c(r10, r11, r12, r13, r14, r15, r16)
            r1.addView(r6)
        L_0x016b:
            int r13 = r7 + 1
            r15 = r2
            r7 = 0
            r14 = 1
            r2 = r20
            goto L_0x004e
        L_0x0174:
            r2 = r15
            if (r0 <= r2) goto L_0x0180
            java.lang.String r3 = "remove layout"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r3)
            int r0 = r0 - r2
            r1.removeViews(r2, r0)
        L_0x0180:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mall.p075ui.MallWalletSectionView.mo66643a(te3.cj2, boolean, di0.q, com.tencent.mm.plugin.wallet_core.utils.i0$f):void");
    }

    public MallWalletSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C0966R.C0971layout.baz, this);
        setOrientation(1);
    }

    public MallWalletSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, C0966R.C0971layout.baz, this);
        setOrientation(1);
    }
}
