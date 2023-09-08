package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72428s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75121j;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import ie3.C8883h;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C117747y;
import te3.C64592nu;
import v53.C78339d;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;
import z53.C79307e;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI */
public class SwitchRealnameVerifyModeUI extends WalletBaseUI implements View.OnClickListener {

    /* renamed from: A */
    public C72428s1 f209050A = new C72428s1();

    /* renamed from: B */
    public boolean f209051B = false;

    /* renamed from: d */
    public int f209052d = 500;

    /* renamed from: e */
    public long f209053e = 0;

    /* renamed from: f */
    public View f209054f;

    /* renamed from: g */
    public View f209055g;

    /* renamed from: h */
    public View f209056h;

    /* renamed from: i */
    public TextView f209057i;

    /* renamed from: j */
    public TextView f209058j;

    /* renamed from: n */
    public TextView f209059n;

    /* renamed from: o */
    public TextView f209060o;

    /* renamed from: p */
    public TextView f209061p;

    /* renamed from: q */
    public TextView f209062q;

    /* renamed from: r */
    public TextView f209063r;

    /* renamed from: s */
    public TextView f209064s;

    /* renamed from: t */
    public TextView f209065t;

    /* renamed from: u */
    public String f209066u;

    /* renamed from: v */
    public String f209067v;

    /* renamed from: w */
    public String f209068w;

    /* renamed from: x */
    public boolean f209069x;

    /* renamed from: y */
    public int f209070y = 0;

    /* renamed from: z */
    public boolean f209071z = false;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$g */
    public class C43367g implements View.OnClickListener {
        public C43367g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("wallet_lock_jsapi_scene", 2);
            if (C79144b.m95773a().mo109089d()) {
                ((C76324c) C86312j.m106911c(C76324c.class)).startPaySecurityUseCase(2, (C76324c.C76325a) null);
            } else {
                C88144b.m109791i(SwitchRealnameVerifyModeUI.this, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$a */
    public class C72071a implements C72428s1.C72430b {
        public C72071a() {
        }

        public Context getContext() {
            return SwitchRealnameVerifyModeUI.this;
        }

        public int getShowAgreenRequestCode() {
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$b */
    public class C72072b implements MenuItem.OnMenuItemClickListener {
        public C72072b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C79148e process = SwitchRealnameVerifyModeUI.this.getProcess();
            if (process != null) {
                C75228t.m90245f0(14, 1, Util.nowSecond(), SwitchRealnameVerifyModeUI.this.f209070y);
                process.mo91257c(SwitchRealnameVerifyModeUI.this, 0);
                return true;
            }
            SwitchRealnameVerifyModeUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$c */
    public class C72073c implements C75121j {
        public C72073c(SwitchRealnameVerifyModeUI switchRealnameVerifyModeUI) {
        }

        /* renamed from: a */
        public void mo95711a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$d */
    public class C72074d implements C72428s1.C72429a {

        /* renamed from: a */
        public final /* synthetic */ View f209074a;

        public C72074d(View view) {
            this.f209074a = view;
        }

        public void agree(Intent intent) {
            SwitchRealnameVerifyModeUI.this.onClickImp(this.f209074a);
            SwitchRealnameVerifyModeUI.this.f209051B = false;
        }

        public void cancel() {
            SwitchRealnameVerifyModeUI.this.f209050A.f210684d = false;
        }

        public void nothing() {
            SwitchRealnameVerifyModeUI.this.onClickImp(this.f209074a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$e */
    public class C72075e implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79148e f209076d;

        public C72075e(C79148e eVar) {
            this.f209076d = eVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Bundle bundle = this.f209076d.f232423c;
            bundle.putInt("real_name_verify_mode", 3);
            bundle.putString("verify_card_flag", "1");
            C79143a.m95765d(SwitchRealnameVerifyModeUI.this, bundle);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$f */
    public class C72076f implements MenuItem.OnMenuItemClickListener {
        public C72076f() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C75228t.m90245f0(18, 1, Util.nowSecond(), SwitchRealnameVerifyModeUI.this.f209070y);
            C75228t.m90219L(SwitchRealnameVerifyModeUI.this.getContext(), SwitchRealnameVerifyModeUI.this.f209066u, false);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x037a A[RETURN] */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo99287H7(boolean r23) {
        /*
            r22 = this;
            r1 = r22
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC
            java.lang.String r3 = ""
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            r2 = 0
            java.lang.String r4 = "MicroMsg.SwitchRealnameVerifyModeUI"
            r5 = 0
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = (java.lang.String) r0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x007a
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x006e }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x006e }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x006e }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.lang.String r0 = "timestamp"
            long r9 = r6.getLong(r0)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r0 = "cache_time"
            long r11 = r6.getLong(r0)     // Catch:{ JSONException -> 0x006e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x006e }
            r0.<init>()     // Catch:{ JSONException -> 0x006e }
            java.lang.String r13 = " dddd time="
            r0.append(r13)     // Catch:{ JSONException -> 0x006e }
            r0.append(r7)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r13 = ";timestamp="
            r0.append(r13)     // Catch:{ JSONException -> 0x006e }
            r0.append(r9)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r13 = ";cachetime="
            r0.append(r13)     // Catch:{ JSONException -> 0x006e }
            r0.append(r11)     // Catch:{ JSONException -> 0x006e }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x006e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ JSONException -> 0x006e }
            long r7 = r7 - r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            java.lang.String r0 = "wording data from cache is out of date"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ JSONException -> 0x006e }
            goto L_0x007f
        L_0x006c:
            r2 = r6
            goto L_0x007f
        L_0x006e:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r6)
            java.lang.String r0 = "parse wording data form cache error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            goto L_0x007f
        L_0x007a:
            java.lang.String r0 = "cache is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x007f:
            if (r23 == 0) goto L_0x0088
            if (r2 != 0) goto L_0x0088
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x0088:
            if (r2 == 0) goto L_0x037a
            r0 = 2131837594(0x7f11429a, float:1.9308387E38)
            java.lang.String r4 = r1.getString(r0)
            java.lang.String r6 = "cache_header_titles"
            java.lang.String r4 = r2.optString(r6, r4)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r0)
            boolean r4 = r1.f209071z
            if (r4 == 0) goto L_0x00ac
            android.widget.TextView r0 = r1.f209063r
            r4 = 2131839596(0x7f114a6c, float:1.9312448E38)
            r0.setText(r4)
            goto L_0x00b1
        L_0x00ac:
            android.widget.TextView r4 = r1.f209063r
            r4.setText(r0)
        L_0x00b1:
            java.lang.String r0 = "isShowBindCardVerify"
            boolean r0 = r2.optBoolean(r0, r5)
            r4 = 8
            if (r0 == 0) goto L_0x0112
            android.widget.TextView r0 = r1.f209064s
            java.lang.String r6 = "bindCardVerifyTitle"
            java.lang.String r6 = r2.optString(r6)
            r0.setText(r6)
            android.widget.TextView r0 = r1.f209065t
            java.lang.String r6 = "bindCardVerifySubtitle"
            java.lang.String r6 = r2.optString(r6)
            r0.setText(r6)
            android.view.View r0 = r1.f209056h
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r7)
            java.lang.Object[] r8 = r6.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r10 = "fillView"
            java.lang.String r11 = "(Z)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r9 = "fillView"
            java.lang.String r10 = "(Z)Z"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0152
        L_0x0112:
            android.view.View r0 = r1.f209056h
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r17 = "fillView"
            java.lang.String r18 = "(Z)Z"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r16 = "fillView"
            java.lang.String r17 = "(Z)Z"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0152:
            java.lang.String r0 = "isShowBindCard"
            boolean r0 = r2.optBoolean(r0, r5)
            if (r0 == 0) goto L_0x01bd
            android.widget.TextView r0 = r1.f209057i
            r6 = 2131837595(0x7f11429b, float:1.930839E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "bindcardTitle"
            java.lang.String r6 = r2.optString(r7, r6)
            r0.setText(r6)
            android.widget.TextView r0 = r1.f209058j
            r6 = 2131837596(0x7f11429c, float:1.9308392E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "bindcardSubTitle"
            java.lang.String r6 = r2.optString(r7, r6)
            r0.setText(r6)
            android.view.View r0 = r1.f209054f
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r7)
            java.lang.Object[] r8 = r6.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r10 = "fillView"
            java.lang.String r11 = "(Z)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r9 = "fillView"
            java.lang.String r10 = "(Z)Z"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x01fb
        L_0x01bd:
            android.view.View r0 = r1.f209054f
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r17 = "fillView"
            java.lang.String r18 = "(Z)Z"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r16 = "fillView"
            java.lang.String r17 = "(Z)Z"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x01fb:
            java.lang.String r0 = "isShowBindId"
            boolean r0 = r2.optBoolean(r0, r5)
            if (r0 == 0) goto L_0x0266
            android.widget.TextView r0 = r1.f209059n
            r6 = 2131837597(0x7f11429d, float:1.9308394E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "bindIdTitle"
            java.lang.String r6 = r2.optString(r7, r6)
            r0.setText(r6)
            android.widget.TextView r0 = r1.f209060o
            r6 = 2131837598(0x7f11429e, float:1.9308396E38)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r7 = "bindIdSubTitle"
            java.lang.String r6 = r2.optString(r7, r6)
            r0.setText(r6)
            android.view.View r0 = r1.f209055g
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r6.mo10233c(r7)
            java.lang.Object[] r8 = r6.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r10 = "fillView"
            java.lang.String r11 = "(Z)Z"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r0
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r9 = "fillView"
            java.lang.String r10 = "(Z)Z"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x02a4
        L_0x0266:
            android.view.View r0 = r1.f209055g
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r17 = "fillView"
            java.lang.String r18 = "(Z)Z"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r0
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI"
            java.lang.String r16 = "fillView"
            java.lang.String r17 = "(Z)Z"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x02a4:
            java.lang.String r0 = "bindCardVerifyAlertViewRightBtnTxt"
            java.lang.String r6 = r2.optString(r0, r3)
            r1.f209067v = r6
            java.lang.String r6 = "bindCardVerifyAlertViewContent"
            java.lang.String r7 = r2.optString(r6, r3)
            r1.f209068w = r7
            java.lang.String r7 = "isShowBindCardVerifyAlertView"
            boolean r8 = r2.optBoolean(r7, r5)
            r1.f209069x = r8
            java.lang.String r8 = "extral_wording"
            java.lang.String r8 = r2.optString(r8, r3)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x02d3
            android.widget.TextView r9 = r1.f209061p
            r9.setText(r8)
            android.widget.TextView r8 = r1.f209061p
            r8.setVisibility(r5)
            goto L_0x02d8
        L_0x02d3:
            android.widget.TextView r8 = r1.f209061p
            r8.setVisibility(r4)
        L_0x02d8:
            java.lang.String r0 = r2.optString(r0, r3)
            r1.f209067v = r0
            java.lang.String r0 = r2.optString(r6)
            r1.f209068w = r0
            boolean r0 = r2.optBoolean(r7, r5)
            r1.f209069x = r0
            java.lang.String r0 = "question_answer_switch"
            boolean r0 = r2.optBoolean(r0, r5)
            java.lang.String r6 = "question_answer_url"
            java.lang.String r3 = r2.optString(r6, r3)
            r1.f209066u = r3
            if (r0 == 0) goto L_0x030b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 != 0) goto L_0x030b
            r0 = 2131235628(0x7f08132c, float:1.8087455E38)
            com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$f r3 = new com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$f
            r3.<init>()
            r1.addIconOptionMenu(r5, r0, r3)
        L_0x030b:
            java.lang.String r0 = "isShowCapitalSecurity"
            boolean r0 = r2.optBoolean(r0, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0374
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "#  "
            r3.append(r4)
            androidx.appcompat.app.AppCompatActivity r4 = r22.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131839356(0x7f11497c, float:1.9311961E38)
            java.lang.String r4 = r4.getString(r6)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r22.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131233374(0x7f080a5e, float:1.8082884E38)
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            int r4 = r3.getIntrinsicWidth()
            int r6 = r3.getIntrinsicHeight()
            r3.setBounds(r5, r5, r4, r6)
            android.text.style.ImageSpan r4 = new android.text.style.ImageSpan
            r4.<init>(r3)
            r3 = 18
            r0.setSpan(r4, r5, r2, r3)
            android.widget.TextView r3 = r1.f209062q
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE
            r3.setText(r0, r4)
            android.widget.TextView r0 = r1.f209062q
            com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$g r3 = new com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI$g
            r3.<init>()
            r0.setOnClickListener(r3)
            android.widget.TextView r0 = r1.f209062q
            r0.setVisibility(r5)
            goto L_0x0379
        L_0x0374:
            android.widget.TextView r0 = r1.f209062q
            r0.setVisibility(r4)
        L_0x0379:
            return r2
        L_0x037a:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI.mo99287H7(boolean):boolean");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cg8;
    }

    public void initView() {
        setMMTitle("");
        this.f209054f = findViewById(C0966R.C0970id.kb8);
        this.f209055g = findViewById(C0966R.C0970id.kb9);
        this.f209056h = findViewById(C0966R.C0970id.kb_);
        this.f209055g.setOnClickListener(this);
        this.f209054f.setOnClickListener(this);
        this.f209056h.setOnClickListener(this);
        this.f209057i = (TextView) findViewById(C0966R.C0970id.a98);
        this.f209058j = (TextView) findViewById(C0966R.C0970id.a97);
        this.f209059n = (TextView) findViewById(C0966R.C0970id.a9b);
        this.f209060o = (TextView) findViewById(C0966R.C0970id.a9a);
        this.f209061p = (TextView) findViewById(C0966R.C0970id.co6);
        this.f209062q = (TextView) findViewById(C0966R.C0970id.j0g);
        this.f209064s = (TextView) findViewById(C0966R.C0970id.l3z);
        this.f209065t = (TextView) findViewById(C0966R.C0970id.l3y);
        TextView textView = (TextView) findViewById(C0966R.C0970id.kb6);
        this.f209063r = textView;
        if (this.f209071z) {
            textView.setText(C0966R.string.l6d);
        }
        mo99287H7(false);
        C79307e eVar = new C79307e("");
        addSceneEndListener(1666);
        doSceneProgress(eVar);
        setBackBtn(new C72072b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            this.f209050A.mo99789a(intent);
            return;
        }
        C72428s1.C72429a aVar = this.f209050A.f210687g;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (System.currentTimeMillis() - this.f209053e <= ((long) this.f209052d)) {
            Log.m105920e("MicroMsg.SwitchRealnameVerifyModeUI", "process pass");
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f209053e = System.currentTimeMillis();
        this.f209050A.mo99792d(new C72074d(view), this.f209051B);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/SwitchRealnameVerifyModeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onClickImp(View view) {
        int id = view.getId();
        C79148e process = getProcess();
        if (process != null) {
            Bundle bundle = process.f232423c;
            if (id == C0966R.C0970id.kb8) {
                C75228t.m90245f0(15, 1, Util.nowSecond(), this.f209070y);
                if (bundle.getInt("realname_scene") != 1) {
                    bundle.putInt("real_name_verify_mode", 1);
                } else if (getIntent() == null) {
                    String str = "";
                    if (Util.isNullOrNil(str)) {
                        str = getString(C0966R.string.l_3);
                    }
                    C76879j.m92713G(this, str, (String) null, false, new C72151k(this));
                    return;
                } else {
                    addSceneEndListener(580);
                    doSceneForceProgress(new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 8, "idCardRealnameVerify", getIntent().getIntExtra("pay_channel", 0)));
                    return;
                }
            } else if (id == C0966R.C0970id.kb9) {
                C75228t.m90245f0(17, 1, Util.nowSecond(), this.f209070y);
                bundle.putInt("real_name_verify_mode", 2);
            } else if (id == C0966R.C0970id.kb_) {
                C75228t.m90245f0(16, 1, Util.nowSecond(), this.f209070y);
                if (!this.f209069x || Util.isNullOrNil(this.f209068w)) {
                    bundle.putInt("real_name_verify_mode", 3);
                    bundle.putString("verify_card_flag", "1");
                } else {
                    C76879j.m92711E(this, this.f209068w, "", this.f209067v, false, new C72075e(process));
                    return;
                }
            }
            C79143a.m95765d(this, bundle);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras().getBoolean("is_from_new_cashier") && getProcess() == null) {
            boolean z = getIntent().getExtras().getBoolean("key_process_is_end");
            boolean z2 = getIntent().getExtras().getBoolean("key_process_is_stay");
            if (z && !z2) {
                finish();
            }
        }
        this.f209071z = getInput().getBoolean("key_from_set_pwd", false);
        initView();
        getProcess();
        this.f209070y = getInput().getInt("entry_scene", this.f209070y);
        C75228t.m90245f0(13, 1, Util.nowSecond(), this.f209070y);
        if (this.f209071z) {
            setMMTitle((int) C0966R.string.l6c);
        }
        this.f209050A.f210686f = new C72071a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f209050A.getClass();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            C79148e process = getProcess();
            if (process != null) {
                C75228t.m90245f0(14, 1, Util.nowSecond(), this.f209070y);
                process.mo91257c(this, 0);
                return true;
            }
            finish();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f209050A.mo99790b();
    }

    public void onResume() {
        super.onResume();
        this.f209050A.mo99791c();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78339d) {
            if (i == 0 && i2 == 0) {
                C78339d dVar = (C78339d) yVar;
                C8883h.f28150a = dVar.mo108331j1();
                removeSceneEndListener(580);
                String str2 = ((C64592nu) dVar.f229547e.f127056b.f127083a).f184559f;
                C79148e process = getProcess();
                if (process != null) {
                    Bundle bundle = process.f232423c;
                    bundle.putInt("real_name_verify_mode", 1);
                    C79143a.m95765d(this, bundle);
                }
                return true;
            }
        } else if (yVar instanceof C79307e) {
            removeSceneEndListener(1666);
            mo99287H7(true);
            C79307e eVar = (C79307e) yVar;
            this.f209051B = eVar.f232823g;
            JumpRemind jumpRemind = eVar.f232824h;
            if (jumpRemind != null) {
                jumpRemind.mo104782f(this, new C72073c(this));
                return true;
            }
        }
        return false;
    }
}
