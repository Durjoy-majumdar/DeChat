package com.tencent.p014mm.plugin.wallet_core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mall.p075ui.MallWalletUI;
import com.tencent.p014mm.plugin.wallet_core.id_verify.RealNameVerifyProcess;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import de3.C75355a0;
import di0.C86300q;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ie3.C76324c;
import java.util.Iterator;
import java.util.LinkedList;
import junit.framework.Assert;
import ke3.C88144b;
import kg3.C76577a;
import t02.C48527c;
import te3.C49118da3;
import te3.C50315lv3;
import te3.C50456mv3;
import te3.C51300su2;
import te3.C51975xh2;
import te3.as4;
import te3.sg4;
import te3.vf4;
import te3.zf4;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0 */
public class C43423i0 {

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0$a */
    public class C43424a implements UseCaseCallback {
        public void call(ITransmitKvData iTransmitKvData) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0$b */
    public class C43425b implements UseCaseCallback {
        public void call(ITransmitKvData iTransmitKvData) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0$c */
    public class C43426c implements C79148e.C79149a {

        /* renamed from: a */
        public final /* synthetic */ C43429f f117390a;

        public C43426c(C43429f fVar) {
            this.f117390a = fVar;
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            boolean z = true;
            boolean z2 = this.f117390a != null;
            if (i != -1) {
                z = false;
            }
            if (!z2 || !z) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("callbackEventType", 2);
            ((MallWalletUI.C42553c) this.f117390a).mo66650a(bundle2);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0$d */
    public class C43427d implements UseCaseCallback {

        /* renamed from: a */
        public final /* synthetic */ C43429f f117391a;

        public C43427d(C43429f fVar) {
            this.f117391a = fVar;
        }

        public void call(ITransmitKvData iTransmitKvData) {
            if (iTransmitKvData != null && this.f117391a != null && iTransmitKvData.getInt("pay.settings.refreshentrance") == 1) {
                Bundle bundle = new Bundle();
                bundle.putInt("callbackEventType", 1);
                ((MallWalletUI.C42553c) this.f117391a).mo66650a(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0$e */
    public interface C43428e {
        /* renamed from: a */
        void mo66651a(C50456mv3 mv32, Object... objArr);

        /* renamed from: b */
        boolean mo66652b(C50456mv3 mv32, Object... objArr);
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.utils.i0$f */
    public interface C43429f {
    }

    /* renamed from: a */
    public static int m46930a(long j) {
        return Color.argb((int) ((j >> 24) & 255), (int) ((j >> 16) & 255), (int) ((j >> 8) & 255), (int) (j & 255));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A[Catch:{ Exception -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a A[Catch:{ Exception -> 0x00bc }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m46931b(java.lang.String r9, boolean r10) {
        /*
            te3.z50 r0 = new te3.z50
            r0.<init>()
            if (r9 != 0) goto L_0x0009
            r9 = 0
            return r9
        L_0x0009:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r1 != 0) goto L_0x0014
            int r9 = android.graphics.Color.parseColor(r9)
            return r9
        L_0x0014:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x00bc }
            h81.h r1 = (h81.C32735h) r1     // Catch:{ Exception -> 0x00bc }
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_no_kinda_dark_mode_sw     // Catch:{ Exception -> 0x00bc }
            r3 = 1
            int r1 = r1.mo58779Qe(r2, r3)     // Catch:{ Exception -> 0x00bc }
            if (r1 != 0) goto L_0x002a
            int r9 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x00bc }
            return r9
        L_0x002a:
            java.lang.String r1 = "#"
            boolean r1 = r9.startsWith(r1)     // Catch:{ Exception -> 0x00bc }
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = r9.substring(r3)     // Catch:{ Exception -> 0x00bc }
            goto L_0x0038
        L_0x0037:
            r1 = r9
        L_0x0038:
            r2 = 16
            long r3 = java.lang.Long.parseLong(r1, r2)     // Catch:{ Exception -> 0x00bc }
            r5 = -1
            if (r10 == 0) goto L_0x008c
            java.lang.String r10 = "ff000000"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0085
            r7 = 0
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0053
            goto L_0x0085
        L_0x0053:
            java.lang.String r10 = "78000000"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0064
            java.lang.String r10 = "80FFFFFF"
            long r1 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            goto L_0x0091
        L_0x0064:
            java.lang.String r10 = "909090"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x007e
            java.lang.String r10 = "ff909090"
            long r7 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r0.f145706d = r3     // Catch:{ Exception -> 0x00bc }
            r0.f145707e = r5     // Catch:{ Exception -> 0x00bc }
            goto L_0x0090
        L_0x007e:
            java.lang.String r10 = "4DFFFFFF"
            long r1 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            goto L_0x0091
        L_0x0085:
            java.lang.String r10 = "CCFFFFFF"
            long r1 = java.lang.Long.parseLong(r10, r2)     // Catch:{ Exception -> 0x00bc }
            goto L_0x0091
        L_0x008c:
            r0.f145706d = r3     // Catch:{ Exception -> 0x00bc }
            r0.f145707e = r5     // Catch:{ Exception -> 0x00bc }
        L_0x0090:
            r1 = r5
        L_0x0091:
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x009a
            int r9 = m46930a(r1)     // Catch:{ Exception -> 0x00bc }
            return r9
        L_0x009a:
            java.lang.Class<ie3.c> r10 = ie3.C76324c.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x00bc }
            ie3.c r10 = (ie3.C76324c) r10     // Catch:{ Exception -> 0x00bc }
            long r1 = r0.f145706d     // Catch:{ Exception -> 0x00bc }
            long r3 = r0.f145707e     // Catch:{ Exception -> 0x00bc }
            long r0 = r10.getColorByMode(r1, r3)     // Catch:{ Exception -> 0x00bc }
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x00b3
            int r9 = m46930a(r0)     // Catch:{ Exception -> 0x00bc }
            return r9
        L_0x00b3:
            int r10 = android.graphics.Color.parseColor(r9)     // Catch:{ Exception -> 0x00bc }
            int r9 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r10)     // Catch:{ Exception -> 0x00bc }
            return r9
        L_0x00bc:
            int r9 = android.graphics.Color.parseColor(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46931b(java.lang.String, boolean):int");
    }

    /* renamed from: c */
    public static void m46932c(Context context, C50456mv3 mv32, Bundle bundle, C86300q qVar, C43429f fVar) {
        Class cls = C76324c.class;
        if (mv32 != null) {
            Log.m105925i("MicroMsg.WcPayViewEngineRender", "route info type: %s, uri: %s", Integer.valueOf(mv32.f138230d), mv32.f138231e);
            int i = mv32.f138230d;
            if (i == 1) {
                C75228t.m90221N(context, mv32.f138231e, true);
            } else if (i == 2) {
                if (mv32.f138232f == null) {
                    Log.m105920e("MicroMsg.WcPayViewEngineRender", "tiny app uri is null");
                    return;
                }
                int i2 = 1000;
                if (bundle != null) {
                    i2 = bundle.getInt("key_tiny_app_scene", 1000);
                }
                if (qVar != null) {
                    sg4 sg4 = mv32.f138232f;
                    C75228t.m90225R(sg4.f141503d, sg4.f141504e, sg4.f141505f, i2, qVar);
                    return;
                }
                sg4 sg42 = mv32.f138232f;
                C75228t.m90224Q(sg42.f141503d, sg42.f141504e, sg42.f141505f, i2);
            } else if (i != 3) {
                if (i == 4) {
                    if (mv32.f138231e.equals("balance")) {
                        if (!((C76324c) C86312j.m106911c(cls)).startWalletBalanceEntryUseCase(context)) {
                            C88144b.m109794l(context, "wallet", ".balance.ui.WalletBalanceManagerUI", 65281);
                        }
                    } else if (mv32.f138231e.equals("bankCard")) {
                        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_kinda_android_bankcard_manager_config, false)) {
                            Log.m105924i("MicroMsg.WcPayViewEngineRender", "isKindaBankCardManagerEnable");
                            ((C76324c) C86312j.m106911c(cls)).startUseCase("bankCard", ITransmitKvData.create(), new C43424a());
                            return;
                        }
                        Intent intent = new Intent();
                        intent.putExtra("intent_finish_self", true);
                        C88144b.m109795m(context, "wallet", ".bind.ui.WalletBankcardManageUI", intent, 65281);
                    } else if (mv32.f138231e.equals("qmfCard")) {
                        if (C48527c.m53911g()) {
                            ((C76324c) C86312j.m106911c(cls)).startUseCase("HoneyPayPayerUseCase", ITransmitKvData.create(), new C43425b());
                            return;
                        }
                        C88144b.m109795m(context, "honey_pay", ".ui.HoneyPayMainUI", new Intent(), 65283);
                    } else if (mv32.f138231e.equals("paySecurity")) {
                        Intent intent2 = new Intent();
                        intent2.putExtra("wallet_lock_jsapi_scene", 1);
                        if (C79144b.m95773a().mo109089d()) {
                            ((C76324c) C86312j.m106911c(cls)).startPaySecurityUseCase(1, (C76324c.C76325a) null);
                        } else {
                            C88144b.m109795m(context, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent2, 65282);
                        }
                    } else if (mv32.f138231e.equals("lqt")) {
                        Intent intent3 = new Intent();
                        intent3.putExtra("key_account_type", 1);
                        if (!((C76324c) C86312j.m106911c(cls)).startLqtDetailUseCase(context, intent3)) {
                            C88144b.m109795m(context, "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent3, 65286);
                        }
                    } else if (mv32.f138231e.equals("realname")) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("real_name_verify_mode", 0);
                        bundle2.putInt("entry_scene", 0);
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        Assert.assertTrue("context must be activity", context instanceof Activity);
                        C79143a.m95771j((Activity) context, RealNameVerifyProcess.class, bundle2, new C43426c(fVar));
                    } else if (mv32.f138231e.equals("paySettingsUseCase")) {
                        ITransmitKvData create = ITransmitKvData.create();
                        create.putString("modifyPwd.sessionId", C86709a0.m107523b().mo121111i() + "_" + C75228t.m90271t());
                        create.putBool("resetPwd.bResetPwdFromPayManage", true);
                        create.putInt("resetPwd.realnameScene", 0);
                        create.putInt("resetPwd.payScene", 0);
                        ((C76324c) C86312j.m106911c(cls)).startUseCase("paySettingsUseCase", create, new C43427d(fVar));
                    }
                } else if (i == 5) {
                    if (mv32.f138231e.equals("wxpay://lqp/balanceQuotaState")) {
                        C88144b.m109790h(context, "wallet_ecard", ".ui.WalletECardLogoutUI", new Intent());
                    }
                } else if (i != 13) {
                    if (i == 15) {
                        C75228t.m90216I(context, mv32.f138242s, 16, 1, false);
                        return;
                    }
                    Log.m105929w("MicroMsg.WcPayViewEngineRender", "can't handle type: %s, uri: %s", Integer.valueOf(i), mv32.f138231e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0083  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence m46933d(android.content.Context r24, te3.zf4 r25, com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.C43428e r26) {
        /*
            r0 = r24
            r1 = r25
            if (r1 == 0) goto L_0x01aa
            java.util.LinkedList<te3.vf4> r2 = r1.f145863d
            if (r2 == 0) goto L_0x01aa
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0012
            goto L_0x01aa
        L_0x0012:
            java.util.LinkedList<te3.vf4> r2 = r1.f145863d
            int r2 = r2.size()
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            r5 = 0
        L_0x001e:
            if (r5 >= r2) goto L_0x01a9
            java.util.LinkedList<te3.vf4> r6 = r1.f145863d
            java.lang.Object r6 = r6.get(r5)
            te3.vf4 r6 = (te3.vf4) r6
            java.lang.Class<ie3.c> r7 = ie3.C76324c.class
            android.text.SpannableString r8 = new android.text.SpannableString
            java.lang.String r9 = r6.f143463f
            r8.<init>(r9)
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r10 = 0
            r12 = 1
            if (r9 == 0) goto L_0x00b7
            te3.z50 r9 = r6.f143468n
            if (r9 != 0) goto L_0x00a1
            te3.z50 r9 = new te3.z50
            r9.<init>()
            r6.f143468n = r9
            long r13 = r6.f143461d
            r9 = 16
            java.lang.String r15 = "ff000000"
            long r15 = java.lang.Long.parseLong(r15, r9)
            r17 = r5
            r4 = -1
            int r18 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r18 == 0) goto L_0x0079
            long r13 = r6.f143461d
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 != 0) goto L_0x005e
            goto L_0x0079
        L_0x005e:
            java.lang.String r15 = "78000000"
            long r15 = java.lang.Long.parseLong(r15, r9)
            int r18 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r18 != 0) goto L_0x006f
            java.lang.String r13 = "80FFFFFF"
            long r13 = java.lang.Long.parseLong(r13, r9)
            goto L_0x007f
        L_0x006f:
            te3.z50 r9 = r6.f143468n
            long r13 = r6.f143461d
            r9.f145706d = r13
            r9.f145707e = r4
            r13 = r4
            goto L_0x007f
        L_0x0079:
            java.lang.String r13 = "CCFFFFFF"
            long r13 = java.lang.Long.parseLong(r13, r9)
        L_0x007f:
            int r9 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x00b3
            di3.d r7 = di3.C86312j.m106911c(r7)
            ie3.c r7 = (ie3.C76324c) r7
            te3.z50 r9 = r6.f143468n
            long r13 = r9.f145706d
            long r10 = r9.f145707e
            long r13 = r7.getColorByMode(r13, r10)
            int r7 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00b3
            long r4 = r6.f143461d
            int r5 = (int) r4
            int r4 = com.tencent.p014mm.p136ui.C85875k4.m106176d(r5)
            long r4 = (long) r4
            r7 = 0
            goto L_0x00b5
        L_0x00a1:
            r17 = r5
            di3.d r4 = di3.C86312j.m106911c(r7)
            ie3.c r4 = (ie3.C76324c) r4
            te3.z50 r5 = r6.f143468n
            long r9 = r5.f145706d
            long r13 = r5.f145707e
            long r13 = r4.getColorByMode(r9, r13)
        L_0x00b3:
            r4 = r13
            r7 = 1
        L_0x00b5:
            int r9 = (int) r4
            goto L_0x00bd
        L_0x00b7:
            r17 = r5
            long r4 = r6.f143461d
            int r9 = (int) r4
            r7 = 1
        L_0x00bd:
            if (r7 == 0) goto L_0x00cc
            r10 = -16777216(0xffffffffff000000, double:NaN)
            long r13 = r4 & r10
            r15 = 0
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x00cc
            long r4 = r4 | r10
            int r9 = (int) r4
        L_0x00cc:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r4 = kg3.C76577a.m92165p(r4)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r5 = kg3.C76577a.m92169t(r5)
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106153J(r4, r5)
            if (r5 != 0) goto L_0x00f0
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r5 = kg3.C76577a.m92170u(r5)
            boolean r5 = com.tencent.p014mm.p136ui.C85875k4.m106153J(r4, r5)
            if (r5 == 0) goto L_0x00f8
        L_0x00f0:
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r4 = kg3.C76577a.m92168s(r4)
        L_0x00f8:
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r7 = r6.f143464g
            int r7 = (int) r7
            int r5 = kg3.C76577a.m92151b(r5, r7)
            float r5 = (float) r5
            float r5 = r5 * r4
            int r4 = (int) r5
            com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan r5 = new com.tencent.mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan
            r19 = 0
            r20 = 0
            android.content.res.ColorStateList r22 = android.content.res.ColorStateList.valueOf(r9)
            r23 = 0
            r18 = r5
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23)
            int r4 = r8.length()
            r7 = 17
            r9 = 0
            r8.setSpan(r5, r9, r4, r7)
            java.lang.String r4 = r6.f143462e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x014f
            java.lang.String r4 = r6.f143462e
            java.util.regex.Pattern r9 = com.tencent.p014mm.wallet_core.p137ui.C75228t.f221346a
            r4.getClass()
            java.lang.String r9 = "sans_ss"
            boolean r9 = r4.equals(r9)
            if (r9 != 0) goto L_0x0148
            java.lang.String r9 = "sans_std"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0146
            r9 = 8
            goto L_0x0149
        L_0x0146:
            r9 = 4
            goto L_0x0149
        L_0x0148:
            r9 = 0
        L_0x0149:
            android.graphics.Typeface r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90274w(r0, r9)
            r5.f210885d = r4
        L_0x014f:
            int r4 = r6.f143471q
            if (r4 <= 0) goto L_0x0155
            r5.f210886e = r4
        L_0x0155:
            r4 = 0
            int r5 = r6.f143466i
            if (r5 != r12) goto L_0x0160
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            goto L_0x0168
        L_0x0160:
            r9 = 2
            if (r5 != r9) goto L_0x0168
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
        L_0x0168:
            if (r4 == 0) goto L_0x0173
            int r5 = r8.length()
            r9 = 0
            r8.setSpan(r4, r9, r5, r7)
            goto L_0x0174
        L_0x0173:
            r9 = 0
        L_0x0174:
            te3.mv3 r4 = r6.f143465h
            if (r4 == 0) goto L_0x01a0
            int r5 = r4.f138230d
            if (r5 == 0) goto L_0x01a0
            java.lang.Object[] r6 = new java.lang.Object[r12]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6[r9] = r5
            java.lang.String r5 = "MicroMsg.WcPayViewEngineRender"
            java.lang.String r10 = "route type: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r6)
            com.tencent.mm.plugin.wallet_core.ui.y0 r5 = new com.tencent.mm.plugin.wallet_core.ui.y0
            r6 = 7
            com.tencent.mm.plugin.wallet_core.utils.h0 r10 = new com.tencent.mm.plugin.wallet_core.utils.h0
            r11 = r26
            r10.<init>(r11, r4, r0)
            r5.<init>((int) r6, (com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0.C72477a) r10)
            int r4 = r8.length()
            r8.setSpan(r5, r9, r4, r7)
            goto L_0x01a2
        L_0x01a0:
            r11 = r26
        L_0x01a2:
            r3.append(r8)
            int r5 = r17 + 1
            goto L_0x001e
        L_0x01a9:
            return r3
        L_0x01aa:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46933d(android.content.Context, te3.zf4, com.tencent.mm.plugin.wallet_core.utils.i0$e):java.lang.CharSequence");
    }

    /* renamed from: e */
    public static void m46934e(CdnImageView cdnImageView, C51975xh2 xh22, int i, int i2, int i3, boolean z) {
        cdnImageView.setUseSdcardCache(z);
        int b = C76577a.m92151b(MMApplicationContext.getContext(), (int) xh22.f144655f);
        int b2 = C76577a.m92151b(MMApplicationContext.getContext(), (int) xh22.f144656g);
        if (i2 <= 0) {
            i2 = b;
        }
        if (i3 <= 0) {
            i3 = b2;
        }
        ViewGroup.LayoutParams layoutParams = cdnImageView.getLayoutParams();
        if (layoutParams != null && i2 > 0 && i3 > 0) {
            layoutParams.width = i2;
            layoutParams.height = i3;
        }
        if (!C85875k4.m106211z() || Util.isNullOrNil(xh22.f144658i)) {
            cdnImageView.mo100288c(xh22.f144653d, i2, i3, i);
        } else {
            cdnImageView.mo100288c(xh22.f144658i, i2, i3, i);
        }
    }

    /* renamed from: f */
    public static void m46935f(View view, C49118da3 da32) {
        if (da32 != null) {
            view.setPadding(C76577a.m92151b(MMApplicationContext.getContext(), (int) da32.f132213f), C76577a.m92151b(MMApplicationContext.getContext(), (int) da32.f132211d), C76577a.m92151b(MMApplicationContext.getContext(), (int) da32.f132214g), C76577a.m92151b(MMApplicationContext.getContext(), (int) da32.f132212e));
        }
    }

    /* renamed from: g */
    public static void m46936g(TextView textView, C50315lv3 lv32) {
        if (lv32 != null && textView != null) {
            m46937h(textView, lv32.f137662e, (C43428e) null);
            m46935f(textView, lv32.f137663f);
            long j = lv32.f137665h;
            int i = (int) j;
            if ((j & -16777216) == 0) {
                i = (int) (j | -16777216);
            }
            if (lv32.f137666i != null) {
                i = (int) (C85875k4.m106211z() ? lv32.f137666i.f145707e : lv32.f137666i.f145706d);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            if (lv32.f137664g > 0.0f) {
                gradientDrawable.setCornerRadius((float) C76577a.m92151b(textView.getContext(), (int) lv32.f137664g));
            }
            gradientDrawable.setColor(i);
            textView.setBackground(gradientDrawable);
        }
    }

    /* renamed from: h */
    public static void m46937h(TextView textView, zf4 zf4, C43428e eVar) {
        if (m46939j(zf4)) {
            textView.setClickable(true);
            textView.setOnTouchListener(new C75355a0(textView.getContext()));
        }
        textView.setText(m46933d(textView.getContext(), zf4, eVar));
    }

    /* renamed from: i */
    public static void m46938i(View view, ViewGroup.MarginLayoutParams marginLayoutParams, as4 as4) {
        if (as4 != null) {
            C51300su2 su22 = as4.f130755e;
            if (su22 != null) {
                marginLayoutParams.topMargin = C76577a.m92151b(MMApplicationContext.getContext(), (int) su22.f141760d);
                marginLayoutParams.bottomMargin = C76577a.m92151b(MMApplicationContext.getContext(), (int) su22.f141761e);
                marginLayoutParams.leftMargin = C76577a.m92151b(MMApplicationContext.getContext(), (int) su22.f141762f);
                marginLayoutParams.rightMargin = C76577a.m92151b(MMApplicationContext.getContext(), (int) su22.f141763g);
            }
            m46935f(view, as4.f130754d);
        }
    }

    /* renamed from: j */
    public static boolean m46939j(zf4 zf4) {
        LinkedList<vf4> linkedList = zf4.f145863d;
        if (linkedList != null && !linkedList.isEmpty()) {
            Iterator<vf4> it = zf4.f145863d.iterator();
            while (it.hasNext()) {
                if (it.next().f143465h != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
