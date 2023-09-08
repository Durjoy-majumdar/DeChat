package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.C68082g;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyExclusiveSelectContactUI;
import com.tencent.p014mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.p014mm.plugin.remittance.model.C42854w;
import com.tencent.p014mm.plugin.remittance.model.C70592i0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import ie3.C8883h;
import j20.C117292a;
import k20.C9556a;
import nj3.C88989a;
import ob0.C117747y;
import p196ln.C76706g;
import p196ln.C76708i;
import q43.C77302a;
import qo3.C47883u;
import qo3.C77426q;
import te3.C51308sw2;
import te3.C77935gl2;
import v53.C78339d;
import yq3.C79148e;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI */
public class RemittanceAdapterUI extends WalletBaseUI {

    /* renamed from: q */
    public static final /* synthetic */ int f204320q = 0;

    /* renamed from: d */
    public int f204321d;

    /* renamed from: e */
    public String f204322e = null;

    /* renamed from: f */
    public int f204323f;

    /* renamed from: g */
    public String f204324g = null;

    /* renamed from: h */
    public boolean f204325h = false;

    /* renamed from: i */
    public C77302a f204326i = null;

    /* renamed from: j */
    public String f204327j = null;

    /* renamed from: n */
    public String f204328n = null;

    /* renamed from: o */
    public String f204329o;

    /* renamed from: p */
    public int f204330p;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI$a */
    public class C70619a implements C72506r.C72510d {

        /* renamed from: a */
        public final /* synthetic */ C70592i0 f204331a;

        /* renamed from: b */
        public final /* synthetic */ C72506r f204332b;

        public C70619a(C70592i0 i0Var, C72506r rVar) {
            this.f204331a = i0Var;
            this.f204332b = rVar;
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            if (gl22.f227479e == 2) {
                RemittanceAdapterUI remittanceAdapterUI = RemittanceAdapterUI.this;
                C70592i0 i0Var = this.f204331a;
                int i = RemittanceAdapterUI.f204320q;
                remittanceAdapterUI.mo97267H7(i0Var);
                return;
            }
            this.f204332b.f210915a = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI$b */
    public class C70620b implements C72506r.C72510d {

        /* renamed from: a */
        public final /* synthetic */ C72506r f204334a;

        public C70620b(C72506r rVar) {
            this.f204334a = rVar;
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            int i = gl22.f227479e;
            if (i == 0 || i == 1) {
                RemittanceAdapterUI.this.finish();
            } else if (i == 3 || i == 4) {
                this.f204334a.f210915a = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI$c */
    public class C70621c implements C47883u {
        public C70621c() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            RemittanceAdapterUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI$d */
    public class C70622d implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ long f204337a;

        /* renamed from: b */
        public final /* synthetic */ C70592i0 f204338b;

        /* renamed from: c */
        public final /* synthetic */ Intent f204339c;

        public C70622d(long j, C70592i0 i0Var, Intent intent) {
            this.f204337a = j;
            this.f204338b = i0Var;
            this.f204339c = intent;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            if (z) {
                Log.m105926v("MicroMsg.RemittanceAdapterUI", "getContact suc; cost=" + (Util.nowMilliSecond() - this.f204337a) + " ms");
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
                ((C68082g) ((C76706g) C86312j.m106911c(C76706g.class)).mo106847uz()).mo93582i(str);
            } else {
                Log.m105928w("MicroMsg.RemittanceAdapterUI", "getContact failed");
            }
            RemittanceAdapterUI remittanceAdapterUI = RemittanceAdapterUI.this;
            remittanceAdapterUI.mo97269J7(remittanceAdapterUI.f204322e, this.f204338b.f204151h, this.f204339c);
        }
    }

    /* renamed from: H7 */
    public final void mo97267H7(C70592i0 i0Var) {
        String str = i0Var.f204161u;
        String str2 = i0Var.f204147d;
        this.f204322e = str2;
        if (!Util.isNullOrNil(str2) || !Util.isNullOrNil(str)) {
            if (this.f204321d == 1) {
                if (i0Var.f204151h == 33) {
                    C77302a c = C77302a.m93123c(this.f204322e, 2);
                    this.f204326i = c;
                    c.mo107446a(20, getIntent().getStringExtra("receiver_name"));
                } else {
                    C77302a c2 = C77302a.m93123c(this.f204322e, 3);
                    this.f204326i = c2;
                    c2.mo107446a(10, getIntent().getStringExtra("receiver_name"));
                }
            }
            Intent intent = new Intent();
            intent.putExtra("fee", i0Var.f204149f);
            intent.putExtra("desc", i0Var.f204150g);
            intent.putExtra("scan_remittance_id", i0Var.f204152i);
            intent.putExtra("receiver_true_name", C75228t.m90270s(i0Var.f204148e));
            intent.putExtra("receiver_true_name_busi", i0Var.f204165y);
            intent.putExtra("receiver_tips", i0Var.f204153j);
            intent.putExtra("rcvr_new_desc", i0Var.f204154n);
            intent.putExtra("payer_desc", i0Var.f204155o);
            intent.putExtra("rcvr_open_id", i0Var.f204161u);
            intent.putExtra("mch_name", i0Var.f204158r);
            intent.putExtra("mch_info", i0Var.f204164x);
            intent.putExtra("mch_photo", i0Var.f204159s);
            intent.putExtra("mch_type", i0Var.f204162v);
            intent.putExtra("mch_time", i0Var.f204160t);
            intent.putExtra("amount_remind_bit", i0Var.f204166z);
            intent.putExtra("payer_desc_required", i0Var.f204145F);
            intent.putExtra("payer_desc_placeholder", i0Var.f204146G);
            int i = i0Var.f204157q;
            if (i == 1) {
                intent.putExtra("busi_type", i);
                intent.putExtra("rcvr_ticket", i0Var.f204156p);
                intent.putExtra("rcvr_open_id", i0Var.f204161u);
                intent.putExtra("get_pay_wifi", i0Var.f204163w);
                BusiRemittanceResp busiRemittanceResp = i0Var.f204144E;
                if (busiRemittanceResp != null) {
                    intent.putExtra("BusiRemittanceResp", busiRemittanceResp);
                }
            }
            if (this.f204323f == 56) {
                intent.putExtra("app_id", this.f204327j);
            }
            C86709a0.m107528h();
            C72996z1 H3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69656H3(this.f204322e);
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(this.f204322e, 3);
            if (H3 != null || this.f204322e.equals("")) {
                mo97269J7(this.f204322e, i0Var.f204151h, intent);
                return;
            }
            Log.m105918d("MicroMsg.RemittanceAdapterUI", "Receiver in contactStg and try to get contact");
            C31519v2.m39436a().mo55988e(this.f204322e, "", new C70622d(Util.nowMilliSecond(), i0Var, intent));
            return;
        }
        Log.m105918d("MicroMsg.RemittanceAdapterUI", "Username empty & fishsh. scene=" + this.f204321d);
        finish();
    }

    /* renamed from: I7 */
    public final void mo97268I7(String str) {
        C77426q qVar = new C77426q(getContext());
        if (Util.isNullOrNil(str)) {
            str = getContext().getString(C0966R.string.l_3);
        }
        qVar.mo107595g(str);
        qVar.mo107600l(new C70621c());
        qVar.mo107602n(getContext().getString(C0966R.string.kke));
        qVar.mo107603o();
    }

    /* renamed from: J7 */
    public void mo97269J7(String str, int i, Intent intent) {
        Log.m105924i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.f204321d + ", name=" + str + " payScene: " + i);
        Intent intent2 = intent != null ? new Intent(intent) : new Intent();
        C77302a.m93125e(this.f204326i, intent2);
        int intExtra = intent2.getIntExtra("busi_type", 0);
        if (intExtra == 1) {
            intent2.setClass(this, RemittanceBusiUI.class);
            intent2.putExtra("chat_type", getIntent().getIntExtra("chat_type", 0));
            intent2.putExtra("send_type", getIntent().getIntExtra("send_type", 0));
        } else {
            intent2.setClass(this, RemittanceUI.class);
        }
        intent2.putExtra("receiver_name", str);
        intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f204321d);
        intent2.putExtra("pay_scene", i);
        intent2.putExtra("pay_channel", this.f204323f);
        intent2.putExtra("qq_extend_info", this.f204324g);
        intent2.putExtra("qrcode_sender_username", getIntent().getStringExtra("qrcode_sender_username"));
        if (intExtra != 1) {
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent2);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        setResult(-1);
        finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 16) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            Log.m105925i("MicroMsg.RemittanceAdapterUI", "select user: %s", stringExtra);
            if (!Util.isNullOrNil(stringExtra)) {
                Intent intent2 = new Intent();
                intent2.putExtra("key_group_name", this.f204322e);
                mo97269J7(stringExtra, 31, intent2);
                return;
            }
            finish();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        if (!this.f204325h) {
            Log.m105918d("MicroMsg.RemittanceAdapterUI", "back press not lock");
            finish();
            return;
        }
        Log.m105918d("MicroMsg.RemittanceAdapterUI", "back press but lock");
    }

    public void onCreate(Bundle bundle) {
        C79148e process;
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f204321d = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f204322e = getIntent().getStringExtra("receiver_name");
        this.f204323f = getIntent().getIntExtra("pay_channel", -1);
        this.f204324g = getIntent().getStringExtra("qq_extend_info");
        this.f204326i = C77302a.m93124d(getIntent());
        this.f204328n = getIntent().getStringExtra("qrcodeUrl");
        this.f204330p = getIntent().getIntExtra("ScanScene", 0);
        this.f204329o = getIntent().getStringExtra("qrcode_sender_username");
        int i = this.f204323f;
        if (i == 56) {
            this.f204327j = this.f204326i.f225422a;
        }
        if (i == -1 && (process = getProcess()) != null) {
            this.f204323f = process.f232423c.getInt("pay_channel", -1);
        }
        int i2 = this.f204321d;
        if (i2 == 1) {
            this.f204325h = true;
            C70592i0 i0Var = new C70592i0(this.f204322e, this.f204323f, this.f204324g, this.f204329o);
            i0Var.setProcessName("RemittanceProcess");
            doSceneProgress(i0Var, true);
        } else if (i2 == 7) {
            this.f204325h = true;
            addSceneEndListener(4708);
            C42854w wVar = new C42854w(this.f204328n, this.f204330p, this.f204323f, this.f204329o);
            wVar.setProcessName("MerchantPay");
            doSceneProgress(wVar, true);
        } else if (i2 == 3) {
            addSceneEndListener(580);
            if (getIntent() == null) {
                Log.m105918d("MicroMsg.RemittanceAdapterUI", "func[doCheckPayNetscene] intent null");
                setResult(0);
                finish();
                return;
            }
            C78339d dVar = new C78339d(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 3, "getTransferMoneyRequest", getIntent().getIntExtra("pay_channel", 0));
            dVar.setProcessName("RemittanceProcess");
            doSceneForceProgress(dVar);
        } else if (i2 == 2) {
            if (Util.isNullOrNil(this.f204322e)) {
                Log.m105928w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.f204321d);
                finish();
            } else if (C72996z1.m85820U5(this.f204322e)) {
                Log.m105925i("MicroMsg.RemittanceAdapterUI", "do select a contact: %s", this.f204322e);
                Intent intent = new Intent(this, LuckyMoneyExclusiveSelectContactUI.class);
                intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 31);
                intent.putExtra("chatroomName", this.f204322e);
                intent.putExtra("key_title", getString(C0966R.string.i36));
                intent.putExtra("key_same_name_tips", getString(C0966R.string.i35));
                startActivityForResult(intent, 16);
            } else {
                mo97269J7(this.f204322e, 31, (Intent) null);
            }
        } else if (i2 != 5 && i2 != 6) {
            mo97269J7((String) null, 31, (Intent) null);
        } else if (Util.isNullOrNil(this.f204322e)) {
            Log.m105928w("MicroMsg.RemittanceAdapterUI", "Username empty & finish. scene=" + this.f204321d);
            finish();
        } else {
            String str = this.f204322e;
            Log.m105924i("MicroMsg.RemittanceAdapterUI", "startRemittanceUI scene=" + this.f204321d + ", name=" + str);
            Intent intent2 = new Intent();
            C77302a.m93125e(this.f204326i, intent2);
            intent2.setClass(this, RemittanceOSRedirect.class);
            intent2.putExtra("receiver_name", str);
            intent2.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, this.f204321d);
            intent2.putExtra("pay_scene", 31);
            intent2.putExtra("pay_channel", this.f204323f);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceOSUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startRemittanceOSUI", "(Ljava/lang/String;ILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            setResult(-1);
            finish();
        }
    }

    public void onDestroy() {
        if (this.f204321d == 3) {
            removeSceneEndListener(580);
        }
        if (this.f204321d == 7) {
            removeSceneEndListener(4708);
        }
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z = yVar instanceof C70592i0;
        if (z) {
            this.f204325h = false;
        }
        if (i != 0 || i2 != 0) {
            setResult(0);
            mo97268I7(str);
            return true;
        } else if (z) {
            C70592i0 i0Var = (C70592i0) yVar;
            if (this.f204321d == 1 && i0Var.f204141B == 0 && i0Var.f204140A == 1) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", i0Var.f204142C);
                C75228t.m90217J(this, intent);
                finish();
                return true;
            } else if (C72506r.m84838d(i0Var.f204143D)) {
                C72506r rVar = new C72506r(this);
                rVar.mo99912b(i0Var.f204143D, new C70619a(i0Var, rVar));
                return true;
            } else {
                mo97267H7(i0Var);
                return true;
            }
        } else if (yVar instanceof C78339d) {
            C8883h.f28150a = ((C78339d) yVar).mo108331j1();
            mo97269J7((String) null, 31, (Intent) null);
            return true;
        } else if (!(yVar instanceof C42854w)) {
            return false;
        } else {
            C42854w wVar = (C42854w) yVar;
            C51308sw2 sw22 = wVar.f116055f;
            if (sw22.f141790d != 0) {
                mo97268I7(sw22.f141791e);
            } else if (C72506r.m84839e(sw22.f141798o)) {
                C72506r rVar2 = new C72506r(this);
                rVar2.mo99913c(wVar.f116055f.f141798o, new C70620b(rVar2));
                return true;
            } else if (!Util.isNullOrNil(wVar.f116055f.f141792f)) {
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", wVar.f116055f.f141792f);
                intent2.putExtra("pay_chat_type", getIntent().getIntExtra("chat_type", 0));
                intent2.putExtra("pay_send_type", getIntent().getIntExtra("send_type", 0));
                intent2.putExtra("pay_qrcode_session_type", getIntent().getIntExtra("qrcodeSessionType", 0));
                intent2.putExtra("pay_qrcode_session_name", getIntent().getStringExtra("qrcodeSessionName"));
                intent2.putExtra("pay_qrcode_timeline_objid", getIntent().getStringExtra("qrcodeTimelineObjId"));
                C75228t.m90217J(this, intent2);
                finish();
                return true;
            } else {
                C51308sw2 sw23 = wVar.f116055f;
                Intent intent3 = new Intent();
                intent3.putExtra("payScene", 73);
                intent3.putExtra("payChannel", this.f204323f);
                intent3.putExtra("shopName", sw23.f141793g);
                intent3.putExtra("shopHeadImgURL", sw23.f141794h);
                intent3.putExtra("scanId", sw23.f141795i);
                intent3.putExtra("shopAdName", sw23.f141796j);
                intent3.putExtra("shopAddress", sw23.f141797n);
                intent3.putExtra("amountBit", sw23.f141799p);
                intent3.putExtra("key_shop_amount", sw23.f141800q);
                intent3.putExtra("key_shop_desc", sw23.f141801r);
                intent3.putExtra("qrcodeUrl", this.f204328n);
                intent3.putExtra("chat_type", getIntent().getIntExtra("chat_type", 0));
                intent3.putExtra("send_type", getIntent().getIntExtra("send_type", 0));
                intent3.putExtra("qrcodeSessionType", getIntent().getIntExtra("qrcodeSessionType", 0));
                intent3.putExtra("qrcodeSessionName", getIntent().getStringExtra("qrcodeSessionName"));
                intent3.putExtra("qrcodeTimelineObjId", getIntent().getStringExtra("qrcodeTimelineObjId"));
                intent3.putExtra("qrcode_sender_username", this.f204329o);
                intent3.putExtra("merchantPayPayerDescRequired", sw23.f141802s);
                intent3.putExtra("merchantPayPayerDescPlaceholder", sw23.f141803t);
                Intent intent4 = new Intent(intent3);
                intent4.setClass(this, WalletMerchantPayUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent4);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startMerchantPayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/remittance/ui/RemittanceAdapterUI", "startMerchantPayUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                setResult(-1);
                finish();
            }
            return true;
        }
    }
}
