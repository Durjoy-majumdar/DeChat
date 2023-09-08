package com.tencent.p014mm.plugin.wxcredit.p132ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import b63.C67205s0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.appbrand.weishi.C84909g;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletPreferenceUI;
import cr3.C75296i;
import di3.C86312j;
import f40.C86709a0;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import pj3.C47511g;
import qb3.C77309a;
import qb3.C77312b;
import rb3.C48015i;
import rb3.C77502d;
import rb3.C77508k;
import sb3.C77642e;
import v53.C78342e0;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI */
public class WalletWXCreditDetailUI extends WalletPreferenceUI {

    /* renamed from: g */
    public C47511g f211401g;

    /* renamed from: h */
    public C79148e f211402h;

    /* renamed from: i */
    public Bankcard f211403i;

    /* renamed from: j */
    public C77508k f211404j;

    /* renamed from: n */
    public boolean f211405n = false;

    /* renamed from: o */
    public View.OnClickListener f211406o = new C72660c();

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI$a */
    public class C72658a implements DialogInterface.OnClickListener {
        public C72658a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C75296i H7 = WalletWXCreditDetailUI.this.mo105011H7();
            Bankcard bankcard = WalletWXCreditDetailUI.this.f211403i;
            H7.mo105625d(new C48015i(bankcard.field_bankcardType, bankcard.f209410e2), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI$b */
    public class C72659b implements MenuItem.OnMenuItemClickListener {
        public C72659b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WalletWXCreditDetailUI.this.hideVKB();
            WalletWXCreditDetailUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI$c */
    public class C72660c implements View.OnClickListener {
        public C72660c() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            r8 = r7.f211409d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI$3"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                int r0 = r8.getId()
                r1 = 2131316857(0x7f095079, float:1.8252207E38)
                if (r0 != r1) goto L_0x0032
                com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI r8 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditDetailUI.this
                rb3.k r0 = r8.f211404j
                if (r0 == 0) goto L_0x0047
                rb3.j r0 = r0.f226004n
                java.lang.String r0 = r0.f225990a
                com.tencent.p014mm.wallet_core.p137ui.C75228t.m90226S(r8, r0)
                goto L_0x0047
            L_0x0032:
                int r8 = r8.getId()
                r0 = 2131316855(0x7f095077, float:1.8252203E38)
                if (r8 != r0) goto L_0x0047
                com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI r8 = com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditDetailUI.this
                rb3.k r0 = r8.f211404j
                if (r0 == 0) goto L_0x0047
                java.lang.String r0 = r0.f226003m
                r1 = 0
                com.tencent.p014mm.wallet_core.p137ui.C75228t.m90219L(r8, r0, r1)
            L_0x0047:
                java.lang.String r8 = "com/tencent/mm/plugin/wxcredit/ui/WalletWXCreditDetailUI$3"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wxcredit.p132ui.WalletWXCreditDetailUI.C72660c.onClick(android.view.View):void");
        }
    }

    /* renamed from: I7 */
    public boolean mo94696I7(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C77502d) {
                C67205s0 Ex0 = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0();
                Ex0.getClass();
                Ex0.f192964q = System.currentTimeMillis() / 1000;
                C77508k kVar = ((C77502d) yVar).f225985d;
                this.f211404j = kVar;
                if (kVar != null && kVar.f225991a == 2) {
                    C86709a0.m107528h();
                    if (((Boolean) C86709a0.m107535s().mo121142i().mo119684e(196658, Boolean.FALSE)).booleanValue()) {
                        C79148e g = C79143a.m95768g(this);
                        Bundle bundle = g.f232423c;
                        bundle.putDouble("key_total_amount", this.f211404j.f225992b);
                        bundle.putBoolean("key_can_upgrade_amount", this.f211404j.f225996f);
                        g.mo109106E(this, WalletWXCreditOpenNotifyUI.class, bundle, 1);
                        return true;
                    }
                }
                if (mo100109J7()) {
                    setContentViewVisibility(0);
                    mo100110K7();
                }
                return true;
            } else if (yVar instanceof C48015i) {
                mo105011H7().mo105625d(new C78342e0((String) null, 0), true);
            } else if (yVar instanceof C78342e0) {
                finish();
            }
        }
        return false;
    }

    /* renamed from: J7 */
    public final boolean mo100109J7() {
        Bankcard bankcard = this.f211403i;
        if (bankcard == null) {
            return false;
        }
        if (bankcard.field_bankcardState == 0) {
            return true;
        }
        int i = bankcard.field_wxcreditState;
        C77508k kVar = this.f211404j;
        if (kVar != null) {
            i = kVar.f225991a;
        }
        if (i == 1) {
            long secondsToNow = Util.secondsToNow(((C79173v) C86312j.m106911c(C79173v.class)).Ex0().f192964q);
            Log.m105918d("MicroMsg.WalletUserInfoManger", "pass time " + secondsToNow);
            return (secondsToNow > 300 ? 1 : (secondsToNow == 300 ? 0 : -1)) > 0;
        } else if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return true;
                }
                this.f211402h.f232423c.putBoolean("key_can_unbind", false);
            }
            C77508k kVar2 = this.f211404j;
            if (kVar2 == null) {
                return true;
            }
            this.f211402h.f232423c.putString("key_repayment_url", kVar2.f225997g);
            C79148e eVar = this.f211402h;
            eVar.mo91264o(this, 1, eVar.f232423c);
            return false;
        } else {
            C76879j.m92744o(this, C0966R.string.f361620lc0, -1, false, new C72658a());
            return false;
        }
    }

    /* renamed from: K7 */
    public final void mo100110K7() {
        if (!this.f211405n) {
            initView();
        }
        if (this.f211404j != null) {
            WalletWXCreditDetailHeaderPreference walletWXCreditDetailHeaderPreference = (WalletWXCreditDetailHeaderPreference) this.f211401g.mo72519a("wallet_wxcredit_header");
            walletWXCreditDetailHeaderPreference.f23934L.setText(C75228t.m90256l(this.f211404j.f225993c));
            String str = this.f211403i.field_bankName;
            String str2 = this.f211404j.f226002l;
            walletWXCreditDetailHeaderPreference.f23933K.setText(walletWXCreditDetailHeaderPreference.f121274d.getString(C0966R.string.lcr, new Object[]{str2, str}));
        }
        if (this.f211404j != null) {
            this.f211401g.mo72519a("wallet_wxcredit_total_amount").mo69924H(getString(C0966R.string.f361622lc2, new Object[]{C75228t.m90256l(this.f211404j.f225992b)}));
            this.f211401g.mo72529n("wallet_wxcredit_change_amount", !this.f211404j.f225996f);
            Preference a = this.f211401g.mo72519a("wallet_wxcredit_bill");
            double d = this.f211404j.f225994d;
            if (d != 0.0d) {
                a.mo7741E(C75228t.m90256l(d));
            }
            Preference a2 = this.f211401g.mo72519a("wallet_wxcredit_repayment");
            Preference a3 = this.f211401g.mo72519a("wallet_wxcredit_repayment_tips");
            double d2 = this.f211404j.f225995e;
            if (d2 > 0.0d) {
                a2.mo7741E(C75228t.m90256l(d2));
                a3.mo69924H(getString(C0966R.string.lcp, new Object[]{this.f211404j.f225998h}));
                this.f211401g.mo72529n("wallet_wxcredit_repayment_tips", false);
            } else {
                this.f211401g.mo72529n("wallet_wxcredit_repayment_tips", true);
            }
        }
        if (this.f211403i != null) {
            this.f211401g.mo72519a("wallet_wxcredit_bank_name").mo69924H(this.f211403i.field_bankName);
        }
        ((WalletWXCreditDetailFooterPreference) this.f211401g.mo72519a("wallet_wxcredit_footer")).f23931M = this.f211406o;
        this.f211401g.notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8992de;
    }

    public void initView() {
        this.f211405n = true;
        setMMTitle((int) C0966R.string.f361621lc1);
        this.f211401g = getPreferenceScreen();
        setBackBtn(new C72659b());
        addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C77642e(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        setContentViewVisibility(0);
        mo100110K7();
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo105011H7().mo105624c(C84909g.CTRL_INDEX);
        mo105011H7().mo105624c(600);
        setContentViewVisibility(4);
        C79148e g = C79143a.m95768g(this);
        this.f211402h = g;
        if (this.f211403i == null) {
            this.f211403i = (Bankcard) g.f232423c.getParcelable("key_bankcard");
        }
        if (mo100109J7()) {
            if (this.f221209e == null) {
                if (this.f221210f == null) {
                    this.f221210f = C79143a.m95768g(this);
                }
                this.f221209e = this.f221210f.mo91265p(this, this.f221208d);
            }
            if (!this.f221209e.mo91280c(this.f211403i)) {
                setContentViewVisibility(0);
                initView();
            }
        }
    }

    public void onDestroy() {
        mo105011H7().mo105630i(C84909g.CTRL_INDEX);
        mo105011H7().mo105630i(600);
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C77508k kVar;
        Class<C77312b> cls = C77312b.class;
        String str = preference.f121285r;
        if ("wallet_wxcredit_change_amount".equals(str)) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_bankcard", this.f211403i);
            C79143a.m95771j(this, C77309a.class, bundle, (C79148e.C79149a) null);
            return true;
        }
        if ("wallet_wxcredit_bill".equals(str)) {
            if (this.f211404j != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("key_url", this.f211404j.f226001k);
                C79143a.m95771j(this, cls, bundle2, (C79148e.C79149a) null);
            }
        } else if ("wallet_wxcredit_card_info".equals(str)) {
            if (this.f211404j != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("key_url", this.f211404j.f225999i);
                C79143a.m95771j(this, cls, bundle3, (C79148e.C79149a) null);
            }
        } else if ("wallet_wxcredit_right".equals(str)) {
            C77508k kVar2 = this.f211404j;
            if (kVar2 != null) {
                C75228t.m90219L(this, kVar2.f226000j, false);
            }
        } else if ("wallet_wxcredit_repayment".equals(str)) {
            C77508k kVar3 = this.f211404j;
            if (kVar3 != null) {
                C75228t.m90219L(this, kVar3.f225997g, false);
            }
        } else if ("wallet_wxcredit_bank_name".equals(str) && (kVar = this.f211404j) != null) {
            C75228t.m90223P(this, kVar.f226004n.f225990a);
        }
        return false;
    }
}
