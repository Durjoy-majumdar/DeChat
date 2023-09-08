package com.tencent.p014mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import cr3.C75282g;
import cr3.C75296i;
import di3.C86312j;
import id2.C33289q;
import id2.C76306j;
import id2.C76307l;
import id2.C76310o;
import id2.C76312r;
import java.util.ArrayList;
import kd2.C76559f;
import nj3.C76879j;
import ob0.C117747y;
import p281yz.C79173v;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.offline.h */
public class C69954h extends C79148e {

    /* renamed from: com.tencent.mm.plugin.offline.h$a */
    public class C69955a extends C75282g {

        /* renamed from: com.tencent.mm.plugin.offline.h$a$a */
        public class C69956a implements Runnable {
            public C69956a() {
            }

            public void run() {
                Log.m105918d("MicroMsg.OfflineProcess", "tofutest do callback");
                C69955a aVar = C69955a.this;
                C69954h hVar = C69954h.this;
                hVar.mo91264o(aVar.f221418a, 0, hVar.f232423c);
                ((WalletBaseUI) C69955a.this.f221418a).hideLoading();
            }
        }

        public C69955a(MMActivity mMActivity, C75296i iVar) {
            super(mMActivity, iVar);
        }

        /* renamed from: a */
        public CharSequence mo91282a(int i) {
            return i != 0 ? i != 1 ? "" : this.f221418a.getString(C0966R.string.f361554kr2) : this.f221418a.getString(C0966R.string.f361555kr3);
        }

        /* renamed from: d */
        public boolean mo91271d(Object... objArr) {
            Bankcard bankcard;
            Class cls = C79173v.class;
            String str = objArr[0];
            C69954h.this.f232423c.putString("key_pwd1", str);
            Bankcard d = C76559f.m92108d(true);
            if (d == null) {
                Log.m105920e("MicroMsg.OfflineProcess", "no support bank car for offline");
                ((C79173v) C86312j.m106911c(cls)).Ex0().getClass();
                bankcard = ((C79173v) C86312j.m106911c(cls)).Ex0().mo91329k((ArrayList<Bankcard>) null, (String) null, true, true);
                if (bankcard == null) {
                    Log.m105920e("MicroMsg.WalletUserInfoManger", "defaultBankcards == null");
                }
            } else {
                bankcard = d;
            }
            if (bankcard == null) {
                Log.m105920e("MicroMsg.OfflineProcess", "no any bank car for offline");
                return false;
            }
            String string = C69954h.this.f232423c.getString("oper");
            if (!C76559f.m92115k()) {
                Log.m105924i("MicroMsg.OfflineProcess", "Offline is not Create ");
                this.f221419b.mo105625d(new C76307l(bankcard, objArr[0], C69954h.this.f232423c.getInt("offline_chg_fee", 0)), true);
            } else if (string != null) {
                Log.m105924i("MicroMsg.OfflineProcess", "oper == " + string);
                if (string.equals("create")) {
                    this.f221419b.mo105625d(new C76307l(bankcard, objArr[0], C69954h.this.f232423c.getInt("offline_chg_fee", 0)), true);
                } else if (string.equals("clr")) {
                    this.f221419b.mo105625d(new C76306j(bankcard, str, "clr", 0, ""), true);
                } else if (string.equals("changeto")) {
                    this.f221419b.mo105625d(new C76306j(bankcard, str, "changeto", C69954h.this.f232423c.getInt("offline_chg_fee"), ""), true);
                } else if (!string.equals("freeze")) {
                    return false;
                } else {
                    this.f221419b.mo105625d(new C33289q(str), true);
                }
            }
            return true;
        }

        /* renamed from: e */
        public boolean mo91272e(int i, int i2, String str, C117747y yVar) {
            if (i == 0 && i2 == 0) {
                if (yVar instanceof C76307l) {
                    Log.m105924i("MicroMsg.OfflineProcess", "Offline is Create ");
                    this.f221419b.mo105625d(new C76312r(C69954h.this.f232423c.getInt("offline_from_scene", -1), (String) null, 8, 0, ""), true);
                    C69954h.this.f232423c.putBoolean("is_offline_create", true);
                    C115669n.INSTANCE.mo160131h(22805, 3);
                } else if ((yVar instanceof C76310o) || (yVar instanceof C76312r)) {
                    Log.m105924i("MicroMsg.OfflineProcess", "OfflineQueryUser is ok ");
                    ((WalletBaseUI) this.f221418a).showLoading(false);
                    WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
                    walletGetUserInfoEvent.f194038d.f194040a = 8;
                    walletGetUserInfoEvent.f194039e.f194055a = new C69956a();
                    walletGetUserInfoEvent.publish();
                } else if (yVar instanceof C76306j) {
                    C76306j jVar = (C76306j) yVar;
                    if ("1".equals(jVar.f223507d)) {
                        MMActivity mMActivity = this.f221418a;
                        String str2 = jVar.f223508e;
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("key_authen", new Authen());
                        bundle.putString("key_pwd1", C69954h.this.f232423c.getString("key_pwd1"));
                        bundle.putString("key_mobile", str2);
                        bundle.putInt("verify_scene", 1);
                        bundle.putInt("offline_add_fee", C69954h.this.f232423c.getInt("offline_chg_fee", 0));
                        C79143a.m95771j(mMActivity, C69964o.class, bundle, (C79148e.C79149a) null);
                        C69954h hVar = C69954h.this;
                        hVar.mo91264o(mMActivity, 0, hVar.f232423c);
                    } else {
                        C69954h.this.f232423c.putBoolean("back_to_coin_purse_ui", true);
                        this.f221419b.mo105625d(new C76310o("" + System.currentTimeMillis(), C69954h.this.f232423c.getInt("offline_from_scene", -1)), false);
                    }
                } else if (yVar instanceof C33289q) {
                    C69963m.wx0().Cx0(196631, "");
                    C69963m.wx0().Ax0().f223553b = null;
                    C69954h hVar2 = C69954h.this;
                    hVar2.mo91264o(this.f221418a, 0, hVar2.f232423c);
                }
                return true;
            }
            if (yVar instanceof C76307l) {
                Log.m105924i("MicroMsg.OfflineProcess", "Offline Create is failed!");
                C76307l lVar = (C76307l) yVar;
                if (i2 == 410) {
                    MMActivity mMActivity2 = this.f221418a;
                    String str3 = str;
                    C76879j.m92707A(mMActivity2, str3, "", mMActivity2.getString(C0966R.string.l3j), mMActivity2.getString(C0966R.string.f7926wf), new C69957i(this, mMActivity2, lVar.f223522s), new C69958j(this, mMActivity2));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: A */
    public C79148e mo91260A(Activity activity, Bundle bundle) {
        mo109103B(activity, WalletCheckPwdUI.class, bundle);
        return this;
    }

    /* renamed from: c */
    public void mo91257c(Activity activity, int i) {
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    public String mo91258e() {
        return "OfflineProcess";
    }

    /* renamed from: f */
    public void mo91259f(Activity activity, Bundle bundle) {
        mo96262m(activity);
        if (bundle != null && bundle.getBoolean("is_offline_create")) {
            C76559f.m92126v((WalletBaseUI) activity);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 == 8) goto L_0x0024;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo96262m(android.app.Activity r12) {
        /*
            r11 = this;
            if (r12 == 0) goto L_0x0062
            android.os.Bundle r0 = r11.f232423c
            r1 = -1
            java.lang.String r2 = "offline_from_scene"
            int r0 = r0.getInt(r2, r1)
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 != r4) goto L_0x0014
            r1 = 2
            goto L_0x0024
        L_0x0014:
            if (r0 != r3) goto L_0x0018
        L_0x0016:
            r1 = 1
            goto L_0x0024
        L_0x0018:
            if (r0 != r2) goto L_0x001c
            r1 = 3
            goto L_0x0024
        L_0x001c:
            if (r0 != r1) goto L_0x0020
            r1 = 6
            goto L_0x0024
        L_0x0020:
            r2 = 8
            if (r0 != r2) goto L_0x0016
        L_0x0024:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 14096(0x3710, float:1.9753E-41)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r6] = r1
            r2.mo160131h(r3, r5)
            java.lang.ref.WeakReference<android.content.Context> r1 = r11.f232422b
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI
            if (r2 == 0) goto L_0x0045
            com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI r1 = (com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineCoinPurseUI) r1
            r1.finish()
        L_0x0045:
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI> r1 = com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineEntranceUI.class
            r9.<init>(r12, r1)
            java.lang.String r1 = "key_from_scene"
            r9.putExtra(r1, r0)
            java.lang.String r0 = "is_offline_create"
            r9.putExtra(r0, r4)
            java.lang.Class<com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI> r7 = com.tencent.p014mm.plugin.offline.p085ui.WalletOfflineEntranceUI.class
            r10 = 1
            r8 = -1
            r5 = r11
            r6 = r12
            r5.mo109110h(r6, r7, r8, r9, r10)
            r12.finish()
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.offline.C69954h.mo96262m(android.app.Activity):void");
    }

    /* renamed from: o */
    public void mo91264o(Activity activity, int i, Bundle bundle) {
        if (activity instanceof WalletCheckPwdUI) {
            mo96262m(activity);
        }
    }

    /* renamed from: p */
    public C75282g mo91265p(MMActivity mMActivity, C75296i iVar) {
        if (mMActivity instanceof WalletCheckPwdUI) {
            return new C69955a(mMActivity, iVar);
        }
        return null;
    }

    /* renamed from: t */
    public boolean mo91267t(Activity activity, Bundle bundle) {
        return false;
    }
}
