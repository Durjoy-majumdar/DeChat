package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import eb0.C75592q0;
import java.util.List;
import nj3.C11182m0;
import nj3.C76874e0;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q */
public class WalletOfflineCoinPurseUI$$q implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ List f201974d;

    /* renamed from: e */
    public final /* synthetic */ WalletOfflineCoinPurseUI f201975e;

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$a */
    public class C69983a implements C102720b.C78973a {

        /* renamed from: d */
        public final /* synthetic */ String f201976d;

        /* renamed from: e */
        public final /* synthetic */ C76874e0 f201977e;

        /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$a$a */
        public class C69984a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f201979d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f201980e;

            public C69984a(String str, Bitmap bitmap) {
                this.f201979d = str;
                this.f201980e = bitmap;
            }

            public void run() {
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f201979d, C69983a.this.f201976d);
                if (WalletOfflineCoinPurseUI$$q.this.f201975e.f201844Q1.containsKey(this.f201979d)) {
                    int intValue = WalletOfflineCoinPurseUI$$q.this.f201975e.f201844Q1.get(this.f201979d).intValue();
                    if (C69983a.this.f201977e.getItem(intValue) != null) {
                        C69983a.this.f201977e.getItem(intValue).setIcon(new BitmapDrawable(BitmapUtil.extractThumbNail(this.f201980e, WalletOfflineCoinPurseUI$$q.this.f201975e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), WalletOfflineCoinPurseUI$$q.this.f201975e.getResources().getDimensionPixelOffset(C0966R.dimen.atf), true, false)));
                        if (WalletOfflineCoinPurseUI$$q.this.f201975e.isFinishing() || WalletOfflineCoinPurseUI$$q.this.f201975e.isDestroyed()) {
                            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineCoinPurseUI.this.isFinishing() || WalletOfflineCoinPurseUI.this.isDestroyed()：%s，%s", Boolean.valueOf(WalletOfflineCoinPurseUI$$q.this.f201975e.isFinishing()), Boolean.valueOf(WalletOfflineCoinPurseUI$$q.this.f201975e.isDestroyed()));
                            return;
                        }
                        WalletOfflineCoinPurseUI$$q.this.f201975e.f201870c1.mo106727b();
                    }
                }
            }
        }

        public C69983a(String str, C76874e0 e0Var) {
            this.f201976d = str;
            this.f201977e = e0Var;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            MMHandlerThread.postToMainThread(new C69984a(str, bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$b */
    public class C69985b extends C72478z {

        /* renamed from: g */
        public final /* synthetic */ Bankcard f201982g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69985b(Context context, Bankcard bankcard) {
            super(context);
            this.f201982g = bankcard;
        }

        public void onClick(View view) {
            Bankcard bankcard = this.f201982g;
            String str = bankcard.field_forbid_url;
            if (!bankcard.mo99391q2() || !Util.isNullOrNil(str)) {
                Intent intent = new Intent();
                Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "go to url %s", str);
                intent.putExtra("rawUrl", str);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                intent.putExtra("pay_channel", 1);
                C75228t.m90217J(WalletOfflineCoinPurseUI$$q.this.f201975e.getContext(), intent);
                return;
            }
            Log.m105924i("MicroMsg.WalletOfflineCoinPurseUI", "goto appbrand");
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            Bankcard bankcard2 = this.f201982g;
            aVar.f9526a = bankcard2.f209398K2;
            aVar.f9527b = bankcard2.f209399L2;
            aVar.f9529d = 1137;
            aVar.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
            Log.m105925i("MicroMsg.WalletOfflineCoinPurseUI", "goto appbrand result:%s", Boolean.valueOf(startAppBrandUIFromOuterEvent.f9523e.f9552a));
            if (startAppBrandUIFromOuterEvent.f9523e.f9552a) {
                WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = WalletOfflineCoinPurseUI$$q.this.f201975e;
                walletOfflineCoinPurseUI.f201869b1 = 1;
                walletOfflineCoinPurseUI.f201870c1.mo106728c();
                return;
            }
            WalletOfflineCoinPurseUI$$q.this.f201975e.f201869b1 = 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$c */
    public class C69986c implements C72476y0.C72477a {

        /* renamed from: a */
        public final /* synthetic */ Bankcard f201984a;

        public C69986c(Bankcard bankcard) {
            this.f201984a = bankcard;
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            C75228t.m90219L(WalletOfflineCoinPurseUI$$q.this.f201975e.getContext(), this.f201984a.field_prompt_info_jump_url, true);
            C115669n.INSTANCE.mo160131h(20216, 3, this.f201984a.field_prompt_info_jump_url);
        }
    }

    public WalletOfflineCoinPurseUI$$q(WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, List list) {
        this.f201975e = walletOfflineCoinPurseUI;
        this.f201974d = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateMMMenu(nj3.C76874e0 r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            java.lang.Class<xs.b> r2 = p755xs.C102720b.class
            r22.clear()
            java.lang.String r3 = "MicroMsg.WalletOfflineCoinPurseUI"
            java.lang.String r4 = "mmBottomSheet list show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r12 = 0
        L_0x0012:
            java.util.List r5 = r0.f201974d
            int r5 = r5.size()
            if (r12 >= r5) goto L_0x0271
            java.util.List r5 = r0.f201974d
            java.lang.Object r5 = r5.get(r12)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r5
            java.lang.String r6 = r5.field_bankcardType
            java.lang.String r7 = kd2.C76559f.f224087e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x003a
            com.tencent.mm.plugin.offline.m r7 = com.tencent.p014mm.plugin.offline.C69963m.wx0()
            r8 = 196615(0x30007, float:2.75516E-40)
            java.lang.String r7 = r7.zx0(r8)
            kd2.C76559f.f224087e = r7
            goto L_0x003c
        L_0x003a:
            java.lang.String r7 = kd2.C76559f.f224087e
        L_0x003c:
            java.util.LinkedList r7 = kd2.C76559f.m92120p(r7)
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x0045
            goto L_0x0062
        L_0x0045:
            r9 = 0
        L_0x0046:
            int r10 = r7.size()
            if (r9 >= r10) goto L_0x0062
            java.lang.Object r10 = r7.get(r9)
            kd2.f$c r10 = (kd2.C76559f.C76562c) r10
            if (r10 == 0) goto L_0x005f
            java.lang.String r11 = r10.f224098a
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x005f
            java.lang.String r6 = r10.f224099b
            goto L_0x0063
        L_0x005f:
            int r9 = r9 + 1
            goto L_0x0046
        L_0x0062:
            r6 = r8
        L_0x0063:
            boolean r7 = r5.mo99393s2()
            if (r7 == 0) goto L_0x006f
            b63.e r7 = r5.f209427v2
            if (r7 == 0) goto L_0x006f
            java.lang.String r6 = r7.f192875a
        L_0x006f:
            di3.d r7 = di3.C86312j.m106911c(r2)
            xs.b r7 = (p755xs.C102720b) r7
            g63.j r9 = new g63.j
            r9.<init>(r6)
            android.graphics.Bitmap r7 = r7.mo142104N6(r9)
            di3.d r9 = di3.C86312j.m106911c(r2)
            xs.b r9 = (p755xs.C102720b) r9
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$a r10 = new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$a
            r13 = r22
            r10.<init>(r6, r13)
            r9.Lu0(r10)
            java.lang.String r9 = r5.field_forbidWord
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0099
            java.lang.String r9 = r5.field_forbidWord
            goto L_0x009a
        L_0x0099:
            r9 = r8
        L_0x009a:
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 == 0) goto L_0x00b0
            boolean r10 = r5.field_support_micropay
            if (r10 != 0) goto L_0x00b0
            java.lang.String r9 = r5.field_no_micro_word
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x00ae
            r9 = r8
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r9 = r5.field_no_micro_word
        L_0x00b0:
            java.lang.String r10 = r5.field_forbid_title
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x00c2
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>(r9)
            r17 = r2
            r18 = r8
            goto L_0x011e
        L_0x00c2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = " "
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r9)
            java.lang.String r15 = r5.field_forbid_title
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r10.<init>(r14)
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$b r14 = new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$b
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r15 = r0.f201975e
            r14.<init>(r15, r5)
            int r15 = r9.length()
            int r16 = r9.length()
            java.lang.String r4 = r5.field_forbid_title
            int r4 = r4.length()
            int r4 = r16 + r4
            android.text.style.ForegroundColorSpan r11 = new android.text.style.ForegroundColorSpan
            r17 = r2
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r2 = r0.f201975e
            android.content.res.Resources r2 = r2.getResources()
            r18 = r8
            r8 = 2131101778(0x7f060852, float:1.7815975E38)
            int r2 = r2.getColor(r8)
            r11.<init>(r2)
            r2 = 33
            r10.setSpan(r11, r15, r4, r2)
            r10.setSpan(r14, r15, r4, r2)
        L_0x011e:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r10)
            r4 = 2
            if (r2 == 0) goto L_0x0164
            java.lang.String r2 = r5.field_prompt_info_prompt_text
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0164
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            java.lang.String r8 = r5.field_prompt_info_prompt_text
            r2.<init>(r8)
            java.lang.String r8 = r5.field_prompt_info_jump_text
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0162
            java.lang.String r8 = r5.field_prompt_info_jump_url
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0162
            java.lang.String r8 = r5.field_prompt_info_jump_text
            r2.append(r8)
            com.tencent.mm.plugin.wallet_core.ui.y0 r8 = new com.tencent.mm.plugin.wallet_core.ui.y0
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$c r10 = new com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI$$q$c
            r10.<init>(r5)
            r8.<init>((int) r4, (com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0.C72477a) r10)
            java.lang.String r10 = r5.field_prompt_info_prompt_text
            int r10 = r10.length()
            int r11 = r2.length()
            r14 = 33
            r2.setSpan(r8, r10, r11, r14)
        L_0x0162:
            r8 = r2
            goto L_0x0165
        L_0x0164:
            r8 = r10
        L_0x0165:
            boolean r2 = r5.mo99388n2()
            r10 = 1
            if (r2 != 0) goto L_0x0176
            boolean r2 = r5.mo99393s2()
            if (r2 == 0) goto L_0x0173
            goto L_0x0176
        L_0x0173:
            java.lang.String r2 = r5.field_desc
            goto L_0x01aa
        L_0x0176:
            double r14 = r5.f209415j2
            r19 = 0
            int r2 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r2 >= 0) goto L_0x0181
            java.lang.String r2 = r5.field_desc
            goto L_0x01aa
        L_0x0181:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = r5.field_desc
            r2.append(r11)
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r11 = r0.f201975e
            r14 = 2131838807(0x7f114757, float:1.9310848E38)
            java.lang.Object[] r15 = new java.lang.Object[r10]
            r19 = r11
            double r10 = r5.f209415j2
            java.lang.String r10 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r10)
            r11 = 0
            r15[r11] = r10
            r10 = r19
            java.lang.String r10 = r10.getString(r14, r15)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
        L_0x01aa:
            r10 = 0
            boolean r11 = r5.mo99392r2()
            if (r11 == 0) goto L_0x01c1
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r7 = r0.f201975e
            android.content.res.Resources r7 = r7.getResources()
            r10 = 2131755844(0x7f100344, float:1.9142579E38)
            r11 = 0
            android.graphics.drawable.Drawable r7 = hi3.C87515a.m108835e(r7, r10, r11)
            r10 = r7
            goto L_0x01e5
        L_0x01c1:
            if (r7 == 0) goto L_0x01e5
            android.graphics.drawable.BitmapDrawable r10 = new android.graphics.drawable.BitmapDrawable
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r11 = r0.f201975e
            android.content.res.Resources r11 = r11.getResources()
            r14 = 2131167400(0x7f0708a8, float:1.7949073E38)
            int r11 = r11.getDimensionPixelOffset(r14)
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r15 = r0.f201975e
            android.content.res.Resources r15 = r15.getResources()
            int r14 = r15.getDimensionPixelOffset(r14)
            r4 = 1
            r15 = 0
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r7, r11, r14, r4, r15)
            r10.<init>(r7)
        L_0x01e5:
            if (r10 != 0) goto L_0x01f2
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r4 = r0.f201975e
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r4.f201844Q1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r4.put(r6, r7)
        L_0x01f2:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            r14 = 0
            r4[r14] = r6
            r6 = 1
            r4[r6] = r2
            r6 = 2
            r4[r6] = r8
            r6 = 3
            int r7 = r5.field_defaultCardState
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r6] = r7
            java.lang.String r6 = "can choose list：i %d fee %s %s，status:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r4)
            boolean r4 = r5.mo99391q2()
            if (r4 == 0) goto L_0x024b
            di3.d r4 = di3.C86312j.m106911c(r1)
            ny.h r4 = (p629ny.C76979h) r4
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r6 = r0.f201975e
            androidx.appcompat.app.AppCompatActivity r6 = r6.getContext()
            android.text.SpannableString r7 = r4.mo107057T1(r6, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 == 0) goto L_0x023a
            java.lang.String r2 = r5.f209397J2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0237
            r8 = r18
            goto L_0x023a
        L_0x0237:
            java.lang.String r2 = r5.f209397J2
            r8 = r2
        L_0x023a:
            r2 = 0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r5 = 1
            r11 = r4 ^ 1
            r5 = r22
            r6 = r12
            r9 = r10
            r10 = r2
            r5.mo107156p(r6, r7, r8, r9, r10, r11)
            goto L_0x026b
        L_0x024b:
            di3.d r4 = di3.C86312j.m106911c(r1)
            ny.h r4 = (p629ny.C76979h) r4
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r5 = r0.f201975e
            androidx.appcompat.app.AppCompatActivity r5 = r5.getContext()
            android.text.SpannableString r7 = r4.mo107057T1(r5, r2)
            r2 = 0
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            r5 = 1
            r11 = r4 ^ 1
            r5 = r22
            r6 = r12
            r9 = r10
            r10 = r2
            r5.mo107156p(r6, r7, r8, r9, r10, r11)
        L_0x026b:
            int r12 = r12 + 1
            r2 = r17
            goto L_0x0012
        L_0x0271:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI$$q.onCreateMMMenu(nj3.e0):void");
    }
}
