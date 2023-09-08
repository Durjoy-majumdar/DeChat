package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72428s1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import ke3.C88144b;
import ob0.C117747y;
import s24.C77613a;
import te3.C77919e72;
import te3.C77942hl2;
import yq3.C79143a;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI */
public class WcPayRealnameVerifyMainUI extends WalletBaseUI {

    /* renamed from: d */
    public Button f209251d;

    /* renamed from: e */
    public TextView f209252e;

    /* renamed from: f */
    public TextView f209253f;

    /* renamed from: g */
    public ViewGroup f209254g;

    /* renamed from: h */
    public C72428s1 f209255h = new C72428s1();

    /* renamed from: i */
    public boolean f209256i;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$d */
    public class C43372d implements View.OnClickListener {
        public C43372d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyMainUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("wallet_lock_jsapi_scene", 2);
            if (C79144b.m95773a().mo109089d()) {
                ((C76324c) C86312j.m106911c(C76324c.class)).startPaySecurityUseCase(2, (C76324c.C76325a) null);
            } else {
                C88144b.m109791i(WcPayRealnameVerifyMainUI.this.getContext(), "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyMainUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$a */
    public class C72133a implements C72428s1.C72430b {
        public C72133a() {
        }

        public Context getContext() {
            return WcPayRealnameVerifyMainUI.this.getContext();
        }

        public int getShowAgreenRequestCode() {
            return 1;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$b */
    public class C72134b implements MenuItem.OnMenuItemClickListener {
        public C72134b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C79148e process = WcPayRealnameVerifyMainUI.this.getProcess();
            if (process != null) {
                process.mo91257c(WcPayRealnameVerifyMainUI.this.getContext(), 0);
                return true;
            }
            WcPayRealnameVerifyMainUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$c */
    public class C72135c extends C30870z1 {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$c$a */
        public class C72136a implements C72428s1.C72429a {
            public C72136a() {
            }

            public void agree(Intent intent) {
                WcPayRealnameVerifyMainUI.m84528H7(WcPayRealnameVerifyMainUI.this, intent);
            }

            public void cancel() {
                WcPayRealnameVerifyMainUI.this.f209255h.f210684d = false;
            }

            public void nothing() {
                WcPayRealnameVerifyMainUI.m84528H7(WcPayRealnameVerifyMainUI.this, (Intent) null);
            }
        }

        public C72135c() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            Log.m105918d("MicroMsg.WcPayRealnameVerifyMainUI", "click verify btn");
            WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI = WcPayRealnameVerifyMainUI.this;
            wcPayRealnameVerifyMainUI.f209255h.mo99792d(new C72136a(), wcPayRealnameVerifyMainUI.f209256i);
        }
    }

    /* renamed from: H7 */
    public static void m84528H7(WcPayRealnameVerifyMainUI wcPayRealnameVerifyMainUI, Intent intent) {
        wcPayRealnameVerifyMainUI.getClass();
        Log.m105924i("MicroMsg.WcPayRealnameVerifyMainUI", "go to id input ui");
        if (intent != null) {
            wcPayRealnameVerifyMainUI.getInput().putBoolean("key_marketing_switch_closed", intent.getBooleanExtra("key_marketing_switch_closed", false));
        }
        C79143a.m95765d(wcPayRealnameVerifyMainUI, wcPayRealnameVerifyMainUI.getInput());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chh;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r13 = this;
            r0 = 2131317259(0x7f09520b, float:1.8253023E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.f209251d = r0
            r0 = 2131317255(0x7f095207, float:1.8253015E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f209252e = r0
            r0 = 2131317257(0x7f095209, float:1.8253019E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f209253f = r0
            r0 = 2131317256(0x7f095208, float:1.8253017E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r13.f209254g = r0
            android.widget.Button r0 = r13.f209251d
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$c r1 = new com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$c
            r1.<init>()
            r0.setOnClickListener(r1)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_REALNAME_SWITCH_WORDING_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            r1 = 0
            java.lang.String r3 = "MicroMsg.WcPayRealnameVerifyMainUI"
            r4 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = (java.lang.String) r0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 != 0) goto L_0x00ae
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a2 }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x00a2 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x00a2 }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            java.lang.String r0 = "timestamp"
            long r8 = r5.getLong(r0)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = "cache_time"
            long r10 = r5.getLong(r0)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00a2 }
            r0.<init>()     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r12 = " dddd time="
            r0.append(r12)     // Catch:{ JSONException -> 0x00a2 }
            r0.append(r6)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r12 = ";timestamp="
            r0.append(r12)     // Catch:{ JSONException -> 0x00a2 }
            r0.append(r8)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r12 = ";cachetime="
            r0.append(r12)     // Catch:{ JSONException -> 0x00a2 }
            r0.append(r10)     // Catch:{ JSONException -> 0x00a2 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x00a2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ JSONException -> 0x00a2 }
            long r6 = r6 - r8
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            java.lang.String r0 = "wording data from cache is out of date"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)     // Catch:{ JSONException -> 0x00a2 }
            goto L_0x00b3
        L_0x00a0:
            r1 = r5
            goto L_0x00b3
        L_0x00a2:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r2, r5)
            java.lang.String r0 = "parse wording data form cache error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            goto L_0x00b3
        L_0x00ae:
            java.lang.String r0 = "cache is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x00b3:
            if (r1 == 0) goto L_0x00f6
            r0 = 2131837594(0x7f11429a, float:1.9308387E38)
            java.lang.String r2 = r13.getString(r0)
            java.lang.String r3 = "cache_header_titles"
            java.lang.String r2 = r1.optString(r3, r2)
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r0)
            android.widget.TextView r2 = r13.f209252e
            r2.setText(r0)
            java.lang.String r0 = "isShowCapitalSecurity"
            boolean r0 = r1.optBoolean(r0, r4)
            if (r0 == 0) goto L_0x00ef
            android.widget.TextView r0 = r13.f209253f
            r1 = 2131839356(0x7f11497c, float:1.9311961E38)
            r0.setText(r1)
            android.view.ViewGroup r0 = r13.f209254g
            com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$d r1 = new com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI$d
            r1.<init>()
            r0.setOnClickListener(r1)
            android.view.ViewGroup r0 = r13.f209254g
            r0.setVisibility(r4)
            goto L_0x00f6
        L_0x00ef:
            android.view.ViewGroup r0 = r13.f209254g
            r1 = 8
            r0.setVisibility(r1)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyMainUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.f209255h.mo99789a(intent);
            } else {
                C72428s1.C72429a aVar = this.f209255h.f210687g;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        setMMTitle("");
        this.f209255h.f210686f = new C72133a();
        setBackBtn(new C72134b());
        String string = getInput().getString("realname_verify_process_get_wording_cache");
        try {
            if (!Util.isNullOrNil(string)) {
                C77919e72 e722 = (C77919e72) new C77919e72().parseFrom(string.getBytes(C77613a.f226275a));
                this.f209256i = e722.f227240z;
                C77942hl2 hl22 = e722.f227212A;
                if (hl22 != null) {
                    JumpRemind.m90059d(hl22).mo104782f(this, new C72141b0(this));
                }
            }
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.WcPayRealnameVerifyMainUI", e, "", new Object[0]);
        }
        initView();
    }

    public void onPause() {
        super.onPause();
        this.f209255h.mo99790b();
    }

    public void onResume() {
        super.onResume();
        this.f209255h.mo99791c();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
