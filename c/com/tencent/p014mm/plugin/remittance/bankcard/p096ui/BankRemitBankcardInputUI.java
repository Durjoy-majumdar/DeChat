package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.remittance.bankcard.model.BankcardElemParcel;
import com.tencent.p014mm.plugin.remittance.bankcard.model.EnterTimeParcel;
import com.tencent.p014mm.plugin.remittance.bankcard.model.TransferRecordParcel;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tenpay.android.wechat.TenpaySecureEditText;
import f40.C86709a0;
import fy3.C32226l;
import gr3.C76024a;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C117747y;
import p1108f3.C107453d;
import p910lj.C76701a;
import qo3.C77407n;
import si2.C48381a;
import si2.C48384d;
import si2.C48386f;
import si2.C48390k;
import si2.C77714i;
import te3.C49667h7;
import te3.C51360t9;
import te3.C51731vs;
import te3.C78010x83;
import te3.dz4;
import ti2.C78029c;
import ui2.C78166a;
import ui2.C78168b;
import ui2.C78169c;
import ui2.C78170d;
import xi3.C78844a;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI */
public class BankRemitBankcardInputUI extends BankRemitBaseUI {

    /* renamed from: W */
    public static final /* synthetic */ int f203706W = 0;

    /* renamed from: A */
    public String f203707A;

    /* renamed from: B */
    public String f203708B;

    /* renamed from: C */
    public String f203709C;

    /* renamed from: D */
    public Dialog f203710D = null;

    /* renamed from: E */
    public EnterTimeParcel f203711E;

    /* renamed from: F */
    public BankcardElemParcel f203712F;

    /* renamed from: G */
    public TransferRecordParcel f203713G;

    /* renamed from: H */
    public boolean f203714H = true;

    /* renamed from: I */
    public boolean f203715I = false;

    /* renamed from: J */
    public boolean f203716J = false;

    /* renamed from: K */
    public C48386f f203717K = null;

    /* renamed from: L */
    public boolean f203718L = false;

    /* renamed from: M */
    public boolean f203719M = false;

    /* renamed from: N */
    public boolean f203720N = true;

    /* renamed from: P */
    public String f203721P;

    /* renamed from: Q */
    public dz4 f203722Q;

    /* renamed from: R */
    public boolean f203723R = false;

    /* renamed from: S */
    public boolean f203724S = false;

    /* renamed from: T */
    public boolean f203725T = false;

    /* renamed from: U */
    public String f203726U;

    /* renamed from: V */
    public String f203727V;

    /* renamed from: e */
    public WalletFormView f203728e;

    /* renamed from: f */
    public WalletFormView f203729f;

    /* renamed from: g */
    public WalletFormView f203730g;

    /* renamed from: h */
    public WalletFormView f203731h;

    /* renamed from: i */
    public CdnImageView f203732i;

    /* renamed from: j */
    public Button f203733j;

    /* renamed from: n */
    public C77407n f203734n;

    /* renamed from: o */
    public WcPayBannerView f203735o;

    /* renamed from: p */
    public ListView f203736p;

    /* renamed from: q */
    public C78029c f203737q;

    /* renamed from: r */
    public Filter.FilterListener f203738r;

    /* renamed from: s */
    public ArrayList<TransferRecordParcel> f203739s;

    /* renamed from: t */
    public ArrayList<TransferRecordParcel> f203740t;

    /* renamed from: u */
    public String f203741u = "";

    /* renamed from: v */
    public int f203742v;

    /* renamed from: w */
    public int f203743w;

    /* renamed from: x */
    public String f203744x;

    /* renamed from: y */
    public String f203745y;

    /* renamed from: z */
    public String f203746z;

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$a */
    public class C70478a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$a$a */
        public class C70479a implements C11182m0 {
            public C70479a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.add(0, 0, 0, (CharSequence) BankRemitBankcardInputUI.this.getString(C0966R.string.ahj));
                e0Var.add(0, 1, 0, (CharSequence) BankRemitBankcardInputUI.this.getString(C0966R.string.ahh));
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$a$b */
        public class C70480b implements C11184p0 {
            public C70480b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    if (!Util.isNullOrNil(BankRemitBankcardInputUI.this.f203709C)) {
                        C75228t.m90219L(BankRemitBankcardInputUI.this.getContext(), BankRemitBankcardInputUI.this.f203709C, false);
                    } else {
                        Log.m105928w("MicroMsg.BankRemitBankcardInputUI", "paylist url is null");
                    }
                    C115669n.INSTANCE.mo160131h(14673, 6);
                } else if (itemId == 1) {
                    AppCompatActivity context = BankRemitBankcardInputUI.this.getContext();
                    C75228t.m90219L(context, HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf4568", true);
                }
            }
        }

        public C70478a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Log.m105918d("MicroMsg.BankRemitBankcardInputUI", "help click");
            BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
            bankRemitBankcardInputUI.f203734n = new C77407n((Context) bankRemitBankcardInputUI.getContext(), 1, false);
            BankRemitBankcardInputUI bankRemitBankcardInputUI2 = BankRemitBankcardInputUI.this;
            C77407n nVar = bankRemitBankcardInputUI2.f203734n;
            nVar.f225771i = new C70479a();
            nVar.f225782p = new C70480b();
            bankRemitBankcardInputUI2.hideTenpayKB();
            BankRemitBankcardInputUI.this.f203734n.mo107573q();
            C115669n.INSTANCE.mo160131h(14673, 2);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$b */
    public class C70481b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48381a f203750a;

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$b$a */
        public class C70482a implements DialogInterface.OnClickListener {
            public C70482a(C70481b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C70481b(C48381a aVar) {
            this.f203750a = aVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "appoint reponse error: %s, msg: %s", Integer.valueOf(this.f203750a.f129504s.f134471d), this.f203750a.f129504s.f134472e);
            if (!Util.isNullOrNil(this.f203750a.f129504s.f134472e)) {
                C76879j.m92713G(BankRemitBankcardInputUI.this.getContext(), this.f203750a.f129504s.f134472e, (String) null, false, new C70482a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$c */
    public class C70483c implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48381a f203752a;

        public C70483c(C48381a aVar) {
            this.f203752a = aVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
            C49667h7 h7Var = this.f203752a.f129504s;
            bankRemitBankcardInputUI.f203744x = h7Var.f134474g;
            bankRemitBankcardInputUI.f203712F = new BankcardElemParcel(h7Var.f134473f);
            Object[] objArr = new Object[1];
            BankcardElemParcel bankcardElemParcel = BankRemitBankcardInputUI.this.f203712F;
            objArr[0] = bankcardElemParcel != null ? bankcardElemParcel.f115896e : "";
            Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "response bank: %s", objArr);
            BankRemitBankcardInputUI.this.mo97162U7();
            BankRemitBankcardInputUI.this.mo97160S7();
            BankRemitBankcardInputUI.this.mo97163V7();
            BankRemitBankcardInputUI.this.mo97155N7();
            BankRemitBankcardInputUI.this.mo97161T7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$d */
    public class C70484d implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48386f f203754a;

        public C70484d(C48386f fVar) {
            this.f203754a = fVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            C51360t9 t9Var = this.f203754a.f129518s.f138800f;
            if (t9Var == null) {
                Log.m105928w("MicroMsg.BankRemitBankcardInputUI", "bank_elem is null");
                BankRemitBankcardInputUI.m83016J7(BankRemitBankcardInputUI.this);
                return;
            }
            BankRemitBankcardInputUI.this.f203712F = new BankcardElemParcel(t9Var);
            BankRemitBankcardInputUI.this.mo97162U7();
            BankRemitBankcardInputUI.this.mo97160S7();
            BankRemitBankcardInputUI.this.mo97163V7();
            BankRemitBankcardInputUI.this.mo97155N7();
            BankRemitBankcardInputUI.this.mo97161T7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$e */
    public class C70485e implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48390k f203756a;

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$e$a */
        public class C70486a implements DialogInterface.OnClickListener {
            public C70486a(C70485e eVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C70485e(C48390k kVar) {
            this.f203756a = kVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "records response error: %s, %s", Integer.valueOf(this.f203756a.f129533s.f138100d), this.f203756a.f129533s.f138101e);
            if (!Util.isNullOrNil(this.f203756a.f129533s.f138101e)) {
                C76879j.m92713G(BankRemitBankcardInputUI.this.getContext(), this.f203756a.f129533s.f138101e, (String) null, false, new C70486a(this));
            }
            BankRemitBankcardInputUI.this.f203718L = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$f */
    public class C70487f implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48390k f203758a;

        public C70487f(C48390k kVar) {
            this.f203758a = kVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
            bankRemitBankcardInputUI.f203718L = false;
            String str2 = this.f203758a.f129533s.f138104h;
            bankRemitBankcardInputUI.f203745y = str2;
            Log.m105919d("MicroMsg.BankRemitBankcardInputUI", "timing_id: %s", str2);
            BankRemitBankcardInputUI.this.f203739s = TransferRecordParcel.m46479a(this.f203758a.f129533s.f138103g);
            BankRemitBankcardInputUI.this.f203740t = TransferRecordParcel.m46479a(this.f203758a.f129533s.f138102f);
            Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "selfList: %d, freqList: %d", Integer.valueOf(BankRemitBankcardInputUI.this.f203739s.size()), Integer.valueOf(BankRemitBankcardInputUI.this.f203740t.size()));
            BankRemitBankcardInputUI bankRemitBankcardInputUI2 = BankRemitBankcardInputUI.this;
            bankRemitBankcardInputUI2.f203736p = (ListView) bankRemitBankcardInputUI2.findViewById(C0966R.C0970id.h_a);
            ArrayList arrayList = new ArrayList();
            ArrayList<TransferRecordParcel> arrayList2 = bankRemitBankcardInputUI2.f203739s;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            ArrayList<TransferRecordParcel> arrayList3 = bankRemitBankcardInputUI2.f203740t;
            if (arrayList3 != null) {
                arrayList.addAll(arrayList3);
            }
            bankRemitBankcardInputUI2.f203736p.setOnItemClickListener(new C78166a(bankRemitBankcardInputUI2));
            bankRemitBankcardInputUI2.f203738r = new C78168b(bankRemitBankcardInputUI2);
            C78029c cVar = new C78029c(bankRemitBankcardInputUI2, arrayList);
            bankRemitBankcardInputUI2.f203737q = cVar;
            bankRemitBankcardInputUI2.f203736p.setAdapter(cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$g */
    public class C70488g implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48384d f203760a;

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$g$a */
        public class C70489a implements DialogInterface.OnClickListener {
            public C70489a(C70488g gVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C70488g(C48384d dVar) {
            this.f203760a = dVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "check response error: %s, %s", Integer.valueOf(this.f203760a.f129511s.f143662d), this.f203760a.f129511s.f143663e);
            if (!Util.isNullOrNil(this.f203760a.f129511s.f143663e)) {
                C76879j.m92713G(BankRemitBankcardInputUI.this.getContext(), this.f203760a.f129511s.f143663e, (String) null, false, new C70489a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$h */
    public class C70490h implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C48384d f203762a;

        public C70490h(C48384d dVar) {
            this.f203762a = dVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
            C51731vs vsVar = this.f203762a.f129511s;
            bankRemitBankcardInputUI.f203744x = vsVar.f143667i;
            bankRemitBankcardInputUI.f203708B = vsVar.f143666h;
            bankRemitBankcardInputUI.f203746z = vsVar.f143664f;
            bankRemitBankcardInputUI.f203707A = vsVar.f143665g;
            bankRemitBankcardInputUI.f203722Q = vsVar.f143668j;
            BankRemitBankcardInputUI.m83019M7(bankRemitBankcardInputUI);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$i */
    public class C70491i implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C77714i f203764a;

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$i$a */
        public class C70492a implements DialogInterface.OnClickListener {
            public C70492a(C70491i iVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C70491i(C77714i iVar) {
            this.f203764a = iVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "operation response error: %s, %s", Integer.valueOf(this.f203764a.f226499s.f228378d), this.f203764a.f226499s.f228379e);
            if (!Util.isNullOrNil(this.f203764a.f226499s.f228379e)) {
                C76879j.m92713G(BankRemitBankcardInputUI.this.getContext(), this.f203764a.f226499s.f228379e, (String) null, false, new C70492a(this));
            }
            BankRemitBankcardInputUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$j */
    public class C70493j implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C77714i f203766a;

        public C70493j(C77714i iVar) {
            this.f203766a = iVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            Dialog dialog = BankRemitBankcardInputUI.this.f203710D;
            if (dialog != null && dialog.isShowing()) {
                BankRemitBankcardInputUI.this.f203710D.dismiss();
            }
            BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
            bankRemitBankcardInputUI.f203723R = true;
            bankRemitBankcardInputUI.f203724S = false;
            C78010x83 x832 = this.f203766a.f226499s;
            bankRemitBankcardInputUI.f203709C = x832.f228384j;
            String str2 = x832.f228385n;
            bankRemitBankcardInputUI.f203741u = str2;
            Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "set uniqueId:%s", str2);
            BankRemitBankcardInputUI bankRemitBankcardInputUI2 = BankRemitBankcardInputUI.this;
            C78010x83 x833 = this.f203766a.f226499s;
            int i3 = x833.f228386o;
            bankRemitBankcardInputUI2.f203742v = i3;
            bankRemitBankcardInputUI2.f203743w = x833.f228387p;
            Log.m105919d("MicroMsg.BankRemitBankcardInputUI", "set nameLenLimit:%s", Integer.valueOf(i3));
            BankRemitBankcardInputUI.this.f203735o.setBannerData(this.f203766a.f226499s.f228388q);
            if (BankRemitBankcardInputUI.m83018L7(BankRemitBankcardInputUI.this)) {
                BankRemitBankcardInputUI bankRemitBankcardInputUI3 = BankRemitBankcardInputUI.this;
                if (bankRemitBankcardInputUI3.f203725T) {
                    if (bankRemitBankcardInputUI3.f203715I) {
                        Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "NetSceneBankRemitOperation: from record goto next direct");
                        BankRemitBankcardInputUI.m83019M7(BankRemitBankcardInputUI.this);
                    } else {
                        BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI3.f203712F;
                        String str3 = bankcardElemParcel.f115896e;
                        String str4 = bankcardElemParcel.f115895d;
                        bankRemitBankcardInputUI3.getClass();
                        Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "doCheckBankBind()");
                        bankRemitBankcardInputUI3.mo97156O7(bankRemitBankcardInputUI3.f203726U, bankRemitBankcardInputUI3.f203727V, str3, str4);
                    }
                    BankRemitBankcardInputUI.this.f203725T = false;
                    return;
                }
                return;
            }
            BankRemitBankcardInputUI.this.mo97161T7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$k */
    public class C70494k implements Runnable {
        public C70494k() {
        }

        public void run() {
            BankRemitBankcardInputUI.this.showVKB();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$l */
    public class C70495l implements Runnable {
        public C70495l() {
        }

        public void run() {
            BankRemitBankcardInputUI.this.f203728e.mo105072d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$m */
    public class C70496m implements View.OnFocusChangeListener {
        public C70496m() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z) {
                BankRemitBankcardInputUI.this.f203728e.getInfoIv().setIconContentDescription(BankRemitBankcardInputUI.this.getString(C0966R.string.ai8));
            } else if (BankRemitBankcardInputUI.this.f203728e.getContentEt().getText() == null || BankRemitBankcardInputUI.this.f203728e.getContentEt().getText().length() <= 0) {
                BankRemitBankcardInputUI.this.f203728e.getInfoIv().setIconContentDescription(BankRemitBankcardInputUI.this.getString(C0966R.string.ai8));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$n */
    public class C70497n implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ EditText f203771d;

        public C70497n(EditText editText) {
            this.f203771d = editText;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            EditText editText = this.f203771d;
            if (editText != null) {
                editText.clearFocus();
            }
            ((InputMethodManager) BankRemitBankcardInputUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            ListView listView = BankRemitBankcardInputUI.this.f203736p;
            if (listView != null) {
                listView.setVisibility(8);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$o */
    public class C70498o implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ EditText f203773d;

        /* renamed from: e */
        public final /* synthetic */ EditText f203774e;

        public C70498o(EditText editText, EditText editText2) {
            this.f203773d = editText;
            this.f203774e = editText2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0088, code lost:
            r6 = r6.f203728e.getInputLength();
            r0 = r5.f203775f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r6) {
            /*
                r5 = this;
                int r0 = r6.length()
                if (r0 != 0) goto L_0x001a
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r0 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r0.f203728e
                com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView r0 = r0.getInfoIv()
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r1 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                r2 = 2131822419(0x7f110753, float:1.9277609E38)
                java.lang.String r1 = r1.getString(r2)
                r0.setIconContentDescription(r1)
            L_0x001a:
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r0 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r1 = r0.f203729f
                r2 = 1
                r1.setContentEnabled(r2)
                r1 = 0
                r0.f203716J = r1
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r0 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r0.f203730g
                r0.setClickable(r2)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r0 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                boolean r3 = r0.f203714H
                if (r3 == 0) goto L_0x0048
                android.widget.ListView r3 = r0.f203736p
                if (r3 == 0) goto L_0x0048
                ti2.c r0 = r0.f203737q
                android.widget.Filter r0 = r0.getFilter()
                java.lang.String r6 = r6.toString()
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r3 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                android.widget.Filter$FilterListener r3 = r3.f203738r
                r0.filter(r6, r3)
                goto L_0x004a
            L_0x0048:
                r0.f203714H = r2
            L_0x004a:
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r6 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                boolean r0 = r6.f203715I
                if (r0 == 0) goto L_0x007b
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r6.f203729f
                r0.mo105071c()
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r6.f203730g
                r0.mo105071c()
                com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r6.f203732i
                r3 = 0
                r0.setImageBitmap(r3)
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r6.f203731h
                r0.mo105071c()
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r0 = r6.f203731h
                r4 = 8
                r0.setVisibility(r4)
                r6.mo97155N7()
                java.lang.String r0 = ""
                r6.f203746z = r0
                r6.f203707A = r0
                r6.f203744x = r0
                r6.f203712F = r3
                r6.f203711E = r3
            L_0x007b:
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r6 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                r6.mo97161T7()
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r6 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                r6.f203715I = r1
                boolean r0 = r6.f203723R
                if (r0 == 0) goto L_0x00ad
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r6.f203728e
                int r6 = r6.getInputLength()
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r0 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                int r3 = r0.f203742v
                if (r6 > r3) goto L_0x00ad
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r0.f203728e
                r6.setMaxInputLength(r3)
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r6 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                com.tencent.mm.wallet_core.ui.formview.WalletFormView r6 = r6.f203728e
                android.text.InputFilter[] r0 = new android.text.InputFilter[r2]
                android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
                com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI r3 = com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.this
                int r3 = r3.f203742v
                r2.<init>(r3)
                r0[r1] = r2
                r6.setFilters(r0)
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.bankcard.p096ui.BankRemitBankcardInputUI.C70498o.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText;
            if (charSequence != null && charSequence.toString().substring(i, i3 + i).equals("\n")) {
                EditText editText2 = this.f203773d;
                if (editText2 != null) {
                    editText2.setText(charSequence.toString().replaceFirst("\n", ""));
                }
                ListView listView = BankRemitBankcardInputUI.this.f203736p;
                if (listView != null) {
                    listView.setVisibility(8);
                }
                if (!BankRemitBankcardInputUI.this.f203716J && (editText = this.f203774e) != null) {
                    editText.requestFocus();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$p */
    public class C70499p implements TextView.OnEditorActionListener {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$p$a */
        public class C70500a implements Runnable {
            public C70500a() {
            }

            public void run() {
                BankRemitBankcardInputUI.this.showTenpayKB();
            }
        }

        public C70499p() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            BankRemitBankcardInputUI.this.hideVKB();
            if (BankRemitBankcardInputUI.this.f203716J) {
                return false;
            }
            MMHandlerThread.postToMainThreadDelayed(new C70500a(), 200);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$q */
    public class C70501q implements TextWatcher {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$q$a */
        public class C70502a implements Runnable {
            public C70502a() {
            }

            public void run() {
                BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
                int i = BankRemitBankcardInputUI.f203706W;
                bankRemitBankcardInputUI.mo97161T7();
            }
        }

        public C70501q() {
        }

        public void afterTextChanged(Editable editable) {
            BankRemitBankcardInputUI.this.f203720N = true;
            MMHandlerThread.postToMainThreadDelayed(new C70502a(), 200);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$r */
    public class C70503r extends C7089c0 {
        public C70503r() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            BankRemitBankcardInputUI.this.hideVKB();
            BankRemitBankcardInputUI.this.f203729f.mo105072d();
            String text = BankRemitBankcardInputUI.this.f203729f.getText();
            if (!BankRemitBankcardInputUI.this.f203720N || Util.isNullOrNil(text)) {
                BankRemitBankcardInputUI.m83016J7(BankRemitBankcardInputUI.this);
                return;
            }
            String mD5Value = BankRemitBankcardInputUI.this.f203729f.getMD5Value();
            BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
            bankRemitBankcardInputUI.getClass();
            Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by cardNo");
            if (bankRemitBankcardInputUI.f203717K != null) {
                Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "cancel pre scene");
                bankRemitBankcardInputUI.cancelNetScene(bankRemitBankcardInputUI.f203717K);
            }
            bankRemitBankcardInputUI.f203720N = false;
            C48386f fVar = new C48386f(text, mD5Value);
            bankRemitBankcardInputUI.f203717K = fVar;
            bankRemitBankcardInputUI.doSceneProgress(fVar, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$s */
    public class C70504s extends C7089c0 {
        public C70504s() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            ArrayList<EnterTimeParcel> arrayList;
            Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "click arrive time et");
            BankRemitBankcardInputUI.this.hideVKB();
            BankRemitBankcardInputUI.this.f203729f.mo105072d();
            if (!BankRemitBankcardInputUI.m83017K7(BankRemitBankcardInputUI.this)) {
                Intent intent = new Intent(BankRemitBankcardInputUI.this.getContext(), BankRemitSelectArriveTimeUI.class);
                BankcardElemParcel bankcardElemParcel = BankRemitBankcardInputUI.this.f203712F;
                if (!(bankcardElemParcel == null || (arrayList = bankcardElemParcel.f115903o) == null)) {
                    intent.putParcelableArrayListExtra("key_arrive_time_parcel_list", arrayList);
                }
                EnterTimeParcel enterTimeParcel = BankRemitBankcardInputUI.this.f203711E;
                if (enterTimeParcel != null) {
                    intent.putExtra("key_select_arrive_time", enterTimeParcel.f115906d);
                }
                BankRemitBankcardInputUI.this.startActivityForResult(intent, 3);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$t */
    public class C70505t extends C30870z1 {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$t$a */
        public class C70506a implements DialogInterface.OnCancelListener {
            public C70506a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "coperationTipDialogNoTransparent onCancel()");
                BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
                bankRemitBankcardInputUI.f203725T = false;
                bankRemitBankcardInputUI.f203724S = false;
                Dialog dialog = bankRemitBankcardInputUI.f203710D;
                if (dialog != null && dialog.isShowing()) {
                    BankRemitBankcardInputUI.this.f203710D.dismiss();
                }
                if (BankRemitBankcardInputUI.this.getContentView().getVisibility() == 8 || BankRemitBankcardInputUI.this.getContentView().getVisibility() == 4) {
                    Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "usr cancel, & visibility not visiable, so finish");
                    BankRemitBankcardInputUI.this.finish();
                }
                BankRemitBankcardInputUI.this.forceCancel();
            }
        }

        public C70505t() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "click next btn");
            BankRemitBankcardInputUI.this.hideVKB();
            BankRemitBankcardInputUI.this.hideTenpayKB();
            if (!BankRemitBankcardInputUI.m83017K7(BankRemitBankcardInputUI.this)) {
                String text = BankRemitBankcardInputUI.this.f203728e.getText();
                String text2 = BankRemitBankcardInputUI.this.f203729f.getText();
                if (!Util.isNullOrNil(text) && !text.trim().isEmpty() && !Util.isNullOrNil(text2) && !text2.trim().isEmpty()) {
                    BankRemitBankcardInputUI bankRemitBankcardInputUI = BankRemitBankcardInputUI.this;
                    if (bankRemitBankcardInputUI.f203712F != null) {
                        Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "onRealClick() ifGetOperation:%s waitingGetOperation:%s ifAutoNext:%s", Boolean.valueOf(bankRemitBankcardInputUI.f203723R), Boolean.valueOf(BankRemitBankcardInputUI.this.f203724S), Boolean.valueOf(BankRemitBankcardInputUI.this.f203725T));
                        BankRemitBankcardInputUI bankRemitBankcardInputUI2 = BankRemitBankcardInputUI.this;
                        if (!bankRemitBankcardInputUI2.f203723R) {
                            bankRemitBankcardInputUI2.f203725T = true;
                            bankRemitBankcardInputUI2.f203726U = text;
                            bankRemitBankcardInputUI2.f203727V = text2;
                            Dialog dialog = bankRemitBankcardInputUI2.f203710D;
                            if (dialog != null) {
                                dialog.show();
                            } else {
                                bankRemitBankcardInputUI2.f203710D = C76879j.m92723Q(bankRemitBankcardInputUI2, bankRemitBankcardInputUI2.getString(C0966R.string.f7961xj), BankRemitBankcardInputUI.this.getString(C0966R.string.l4f), true, true, new C70506a());
                            }
                            BankRemitBankcardInputUI bankRemitBankcardInputUI3 = BankRemitBankcardInputUI.this;
                            if (!bankRemitBankcardInputUI3.f203724S) {
                                Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "do operation");
                                bankRemitBankcardInputUI3.f203724S = true;
                                bankRemitBankcardInputUI3.doSceneProgress(new C77714i(), false);
                                return;
                            }
                            return;
                        } else if (BankRemitBankcardInputUI.m83018L7(bankRemitBankcardInputUI2)) {
                            BankRemitBankcardInputUI bankRemitBankcardInputUI4 = BankRemitBankcardInputUI.this;
                            if (bankRemitBankcardInputUI4.f203715I) {
                                Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "from record goto next direct");
                                BankRemitBankcardInputUI.m83019M7(BankRemitBankcardInputUI.this);
                                return;
                            }
                            BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI4.f203712F;
                            bankRemitBankcardInputUI4.mo97156O7(text, text2, bankcardElemParcel.f115896e, bankcardElemParcel.f115895d);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                Log.m105929w("MicroMsg.BankRemitBankcardInputUI", "args is empty, payeeName: %s, bankCardNo: %s, bankcard: %s", text, text2, BankRemitBankcardInputUI.this.f203712F);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$u */
    public static class C70507u extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$u$a */
        public class C70508a implements C32226l<View, String> {

            /* renamed from: d */
            public final /* synthetic */ TextView f203784d;

            /* renamed from: e */
            public final /* synthetic */ TenpaySecureEditText f203785e;

            public C70508a(TextView textView, TenpaySecureEditText tenpaySecureEditText) {
                this.f203784d = textView;
                this.f203785e = tenpaySecureEditText;
            }

            public Object invoke(Object obj) {
                WalletFormView walletFormView = (WalletFormView) ((View) obj);
                StringBuilder sb = new StringBuilder();
                if (this.f203784d != null) {
                    sb.append(this.f203784d.getText() + ",");
                }
                if (this.f203785e != null) {
                    sb.append(this.f203785e.getText() + ",");
                }
                sb.append(C70507u.this.getString(C0966R.string.ahr));
                if (!walletFormView.isClickable()) {
                    sb.append(C70507u.this.getString(C0966R.string.lap));
                }
                return sb.toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$u$b */
        public class C70509b implements C32226l<View, String> {

            /* renamed from: d */
            public final /* synthetic */ TextView f203787d;

            /* renamed from: e */
            public final /* synthetic */ TenpaySecureEditText f203788e;

            public C70509b(C70507u uVar, TextView textView, TenpaySecureEditText tenpaySecureEditText) {
                this.f203787d = textView;
                this.f203788e = tenpaySecureEditText;
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                StringBuilder sb = new StringBuilder();
                if (this.f203787d != null) {
                    sb.append(this.f203787d.getText() + ",");
                }
                if (this.f203788e != null) {
                    sb.append(this.f203788e.getText() + ",");
                }
                return sb.toString();
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$u$c */
        public class C70510c extends View.AccessibilityDelegate {
            public C70510c(C70507u uVar) {
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (view instanceof EditText) {
                    new C107453d(AccessibilityNodeInfo.obtain(view)).mo157858r("");
                }
            }
        }

        public C70507u(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.f6550i0);
            root.disable(C0966R.C0970id.a5z);
            root.disable(C0966R.C0970id.f357497a60);
            root.disable(C0966R.C0970id.f357498a61);
            root.disable(C0966R.C0970id.f357499a62);
            MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.aiu);
            root2.disable(C0966R.C0970id.aiu);
            root2.disable(C0966R.C0970id.lj4);
            root2.disable(C0966R.C0970id.f359549lh0);
            root.focusOrder().next(C0966R.C0970id.ljn);
            root.focusOrder().next(C0966R.C0970id.lg_);
            root.focusOrder().next(C0966R.C0970id.f359550lh1).next(C0966R.C0970id.h_a);
            TenpaySecureEditText tenpaySecureEditText = (TenpaySecureEditText) findViewById(C0966R.C0970id.aiu).findViewById(C0966R.C0970id.lg_);
            root2.view(C0966R.C0970id.f359550lh1).expand(12, 12, 12, 12);
            MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.ait);
            root3.disable(C0966R.C0970id.ait);
            root3.disable(C0966R.C0970id.lj4);
            root3.disable(C0966R.C0970id.f359549lh0);
            root3.focusOrder().next(C0966R.C0970id.ljn);
            root3.focusOrder().next(C0966R.C0970id.lg_);
            root3.focusOrder().next(C0966R.C0970id.f359550lh1);
            MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0970id.ais);
            root4.disable(C0966R.C0970id.a5y);
            root4.disable(C0966R.C0970id.ljn);
            root4.disable(C0966R.C0970id.lj4);
            root4.disable(C0966R.C0970id.f359552lh3);
            root4.disable(C0966R.C0970id.lg_);
            View findViewById = findViewById(C0966R.C0970id.ais);
            TenpaySecureEditText tenpaySecureEditText2 = (TenpaySecureEditText) findViewById.findViewById(C0966R.C0970id.lg_);
            tenpaySecureEditText2.setAccessibilityDelegate(new C70510c(this));
            ViewSetter view = root4.view(C0966R.C0970id.ais);
            ViewType viewType = ViewType.Button;
            view.type(viewType).desc((C32226l<? super View, String>) new C70508a((TextView) findViewById.findViewById(C0966R.C0970id.ljn), tenpaySecureEditText2));
            MMBaseAccessibilityConfig.ConfigHelper root5 = root(C0966R.C0970id.air);
            root5.disable(C0966R.C0970id.f359549lh0);
            root5.disable(C0966R.C0970id.ljn);
            root5.disable(C0966R.C0970id.lj4);
            root5.disable(C0966R.C0970id.f359552lh3);
            root5.disable(C0966R.C0970id.lg_);
            View findViewById2 = findViewById(C0966R.C0970id.air);
            TenpaySecureEditText tenpaySecureEditText3 = (TenpaySecureEditText) findViewById2.findViewById(C0966R.C0970id.lg_);
            tenpaySecureEditText3.setAccessibilityDelegate(new C70510c(this));
            root5.view(C0966R.C0970id.air).type(viewType).desc((C32226l<? super View, String>) new C70509b(this, (TextView) findViewById2.findViewById(C0966R.C0970id.ljn), tenpaySecureEditText3));
            root(C0966R.C0970id.f357825by3).view(C0966R.C0970id.f5421eo).desc((int) C0966R.string.f7369e7).type(viewType);
        }

        public void onResume() {
            super.onResume();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$v */
    public class C70511v extends View.AccessibilityDelegate {
        public C70511v(BankRemitBankcardInputUI bankRemitBankcardInputUI, C70478a aVar) {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            BankRemitBankcardInputUI bankRemitBankcardInputUI;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 32768 && (bankRemitBankcardInputUI = (BankRemitBankcardInputUI) view.getContext()) != null) {
                View findViewById = bankRemitBankcardInputUI.findViewById(C0966R.C0970id.h_a);
                if (findViewById != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$CardNumberTitleAccessibilityDelegate", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$CardNumberTitleAccessibilityDelegate", "onInitializeAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                WalletFormView walletFormView = bankRemitBankcardInputUI.f203728e;
                if (walletFormView != null) {
                    walletFormView.mo105072d();
                    bankRemitBankcardInputUI.hideVKB();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI$w */
    public class C70512w extends View.AccessibilityDelegate {
        public C70512w(BankRemitBankcardInputUI bankRemitBankcardInputUI, C70478a aVar) {
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            BankRemitBankcardInputUI bankRemitBankcardInputUI;
            WalletFormView walletFormView;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 32768 && (bankRemitBankcardInputUI = (BankRemitBankcardInputUI) view.getContext()) != null && (walletFormView = bankRemitBankcardInputUI.f203728e) != null && walletFormView.getText() == null) {
                bankRemitBankcardInputUI.f203728e.mo105072d();
                bankRemitBankcardInputUI.hideVKB();
            }
        }
    }

    /* renamed from: J7 */
    public static void m83016J7(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        bankRemitBankcardInputUI.getClass();
        bankRemitBankcardInputUI.startActivityForResult(new Intent(bankRemitBankcardInputUI.getContext(), BankRemitSelectBankUI.class), 2);
    }

    /* renamed from: K7 */
    public static boolean m83017K7(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        BankcardElemParcel bankcardElemParcel = bankRemitBankcardInputUI.f203712F;
        if (bankcardElemParcel == null || Util.isNullOrNil(bankcardElemParcel.f115902n)) {
            return false;
        }
        Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "show alert text: %s", bankRemitBankcardInputUI.f203712F.f115902n);
        C76879j.m92713G(bankRemitBankcardInputUI, bankRemitBankcardInputUI.f203712F.f115902n, "", false, new C78170d(bankRemitBankcardInputUI));
        return true;
    }

    /* renamed from: L7 */
    public static boolean m83018L7(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        int i = bankRemitBankcardInputUI.f203742v;
        if (i <= 0 || i >= bankRemitBankcardInputUI.f203728e.getInputLength()) {
            return true;
        }
        C76701a.makeText((Context) bankRemitBankcardInputUI, (CharSequence) bankRemitBankcardInputUI.getString(C0966R.string.ahw, new Object[]{bankRemitBankcardInputUI.f203742v + ""}), 1).show();
        return false;
    }

    /* renamed from: M7 */
    public static void m83019M7(BankRemitBankcardInputUI bankRemitBankcardInputUI) {
        bankRemitBankcardInputUI.getClass();
        Intent intent = new Intent(bankRemitBankcardInputUI.getContext(), BankRemitMoneyInputUI.class);
        if (bankRemitBankcardInputUI.f203715I) {
            intent.putExtra("key_bank_card_seqno", bankRemitBankcardInputUI.f203713G.f115911d);
            intent.putExtra("key_bank_card_tailno", bankRemitBankcardInputUI.f203713G.f115912e);
            intent.putExtra("key_payee_name", bankRemitBankcardInputUI.f203713G.f115916i);
            intent.putExtra("key_input_type", 1);
        } else {
            intent.putExtra("key_bank_card_seqno", bankRemitBankcardInputUI.f203746z);
            intent.putExtra("key_bank_card_tailno", bankRemitBankcardInputUI.f203707A);
            intent.putExtra("key_payee_name", bankRemitBankcardInputUI.f203708B);
            if (Util.isNullOrNil(bankRemitBankcardInputUI.f203721P)) {
                intent.putExtra("key_input_type", 0);
            } else {
                intent.putExtra("key_input_type", 3);
            }
        }
        intent.putExtra("key_unique_id", Util.nullAsNil(bankRemitBankcardInputUI.f203741u));
        intent.putExtra("key_enter_time_scene", bankRemitBankcardInputUI.f203711E.f115906d);
        intent.putExtra("key_encrypt_data", bankRemitBankcardInputUI.f203744x);
        intent.putExtra("key_bank_card_elem_parcel", bankRemitBankcardInputUI.f203712F);
        intent.putExtra("key_reason_len", bankRemitBankcardInputUI.f203743w);
        dz4 dz4 = bankRemitBankcardInputUI.f203722Q;
        if (dz4 != null) {
            try {
                intent.putExtra("key_notice_item", dz4.toByteArray());
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.BankRemitBankcardInputUI", e, "", new Object[0]);
            }
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(bankRemitBankcardInputUI, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI", "gotoMoneyInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bankRemitBankcardInputUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bankRemitBankcardInputUI, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI", "gotoMoneyInputUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: N7 */
    public final void mo97155N7() {
        if (this.f203731h.getVisibility() == 0) {
            this.f203730g.setBackground(getResources().getDrawable(C0966R.C0969drawable.b1e));
        } else {
            this.f203730g.setBackground(getResources().getDrawable(C0966R.C0969drawable.f4511eo));
        }
    }

    /* renamed from: O7 */
    public final void mo97156O7(String str, String str2, String str3, String str4) {
        Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "do check bank bind: %s %s", str3, str4);
        Log.m105919d("MicroMsg.BankRemitBankcardInputUI", "payeeName: %s, bankCardNo: %s", str, str2);
        doSceneProgress(new C48384d(str, str2, str3, str4));
    }

    /* renamed from: P7 */
    public final void mo97157P7(boolean z) {
        Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "do fetch transfer record: %s", Boolean.valueOf(z));
        if (z) {
            doSceneProgress(new C48390k(), true);
        } else {
            doSceneProgress(new C48390k(), false);
        }
    }

    /* renamed from: Q7 */
    public final void mo97158Q7(TransferRecordParcel transferRecordParcel, List<TransferRecordParcel> list) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                TransferRecordParcel transferRecordParcel2 = list.get(size);
                if (transferRecordParcel2.f115911d.equals(transferRecordParcel.f115911d)) {
                    transferRecordParcel2.f115917j = transferRecordParcel.f115917j;
                    return;
                }
            }
        }
    }

    /* renamed from: R7 */
    public final void mo97159R7(String str, List<TransferRecordParcel> list) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                TransferRecordParcel transferRecordParcel = list.get(size);
                if (transferRecordParcel.f115911d.equals(str)) {
                    list.remove(transferRecordParcel);
                    return;
                }
            }
        }
    }

    /* renamed from: S7 */
    public final void mo97160S7() {
        ArrayList<EnterTimeParcel> arrayList;
        BankcardElemParcel bankcardElemParcel = this.f203712F;
        if (bankcardElemParcel == null || Util.isNullOrNil(bankcardElemParcel.f115900i)) {
            BankcardElemParcel bankcardElemParcel2 = this.f203712F;
            if (bankcardElemParcel2 != null && (arrayList = bankcardElemParcel2.f115903o) != null) {
                Iterator<EnterTimeParcel> it = arrayList.iterator();
                while (it.hasNext()) {
                    EnterTimeParcel next = it.next();
                    if (next.f115909g > 0) {
                        this.f203711E = next;
                        return;
                    }
                }
                return;
            }
            return;
        }
        this.f203711E = null;
    }

    /* renamed from: T7 */
    public final void mo97161T7() {
        BankcardElemParcel bankcardElemParcel;
        if (Util.isNullOrNil(this.f203728e.getText()) || this.f203728e.getText().trim().isEmpty() || Util.isNullOrNil(this.f203729f.getText()) || !this.f203728e.mo105094l() || this.f203729f.getText().trim().isEmpty() || !this.f203729f.mo105094l() || Util.isNullOrNil(this.f203730g.getText()) || this.f203731h.getVisibility() != 0 || Util.isNullOrNil(this.f203731h.getText()) || (bankcardElemParcel = this.f203712F) == null || !Util.isNullOrNil(bankcardElemParcel.f115902n)) {
            this.f203733j.setEnabled(false);
        } else {
            this.f203733j.setEnabled(true);
        }
    }

    /* renamed from: U7 */
    public final void mo97162U7() {
        BankcardElemParcel bankcardElemParcel = this.f203712F;
        if (bankcardElemParcel != null) {
            this.f203730g.setText(bankcardElemParcel.f115896e);
            this.f203732i.setUrl(this.f203712F.f115897f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f203732i.getLayoutParams();
            layoutParams.setMargins(C76577a.m92151b(getContext(), 15), 0, 0, 0);
            this.f203732i.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: V7 */
    public final void mo97163V7() {
        EnterTimeParcel enterTimeParcel = this.f203711E;
        if (enterTimeParcel != null) {
            if (!Util.isNullOrNil(enterTimeParcel.f115910h)) {
                this.f203731h.setContentTextColor(C43423i0.m46931b(this.f203711E.f115910h, true));
            } else {
                this.f203731h.setContentTextColorRes(C0966R.color.a7f);
            }
            this.f203731h.setText(this.f203711E.f115907e);
            this.f203731h.setVisibility(0);
            return;
        }
        BankcardElemParcel bankcardElemParcel = this.f203712F;
        if (bankcardElemParcel == null || Util.isNullOrNil(bankcardElemParcel.f115900i)) {
            this.f203731h.setVisibility(8);
            return;
        }
        this.f203731h.setText(this.f203712F.f115900i);
        if (!Util.isNullOrNil(this.f203712F.f115901j)) {
            this.f203731h.setContentTextColor(C43423i0.m46931b(this.f203712F.f115901j, true));
        } else {
            this.f203731h.setContentTextColorRes(C0966R.color.a7f);
        }
        this.f203731h.setVisibility(0);
    }

    /* renamed from: W7 */
    public final void mo97164W7() {
        TransferRecordParcel transferRecordParcel = this.f203713G;
        if (transferRecordParcel != null) {
            this.f203728e.setText(transferRecordParcel.f115916i);
            this.f203715I = true;
            this.f203729f.setText(getString(C0966R.string.agx, new Object[]{this.f203713G.f115912e}));
            this.f203730g.setText(this.f203713G.f115914g);
            this.f203732i.setUrl(this.f203713G.f115913f);
            this.f203729f.mo105072d();
            this.f203729f.setContentEnabled(false);
            this.f203716J = true;
            this.f203730g.setClickable(false);
        }
    }

    public void finish() {
        super.finish();
        try {
            hideVKB();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "%s %s", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6550i0;
    }

    public void initView() {
        LinearLayout linearLayout;
        int b = C76577a.m92151b(getContext(), 16);
        int b2 = C76577a.m92151b(getContext(), 8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(b, b);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = b2;
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.aiu);
        this.f203728e = walletFormView;
        walletFormView.getInfoIv().setLayoutParams(layoutParams);
        this.f203728e.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
        WalletIconImageView infoIv = this.f203728e.getInfoIv();
        int color = getResources().getColor(C0966R.color.FG_2);
        infoIv.f212566u = C0966R.raw.icons_filled_close2;
        infoIv.f212567v = color;
        this.f203728e.setIsSecretAnswer(true);
        this.f203728e.findViewById(C0966R.C0970id.f359550lh1).setAccessibilityDelegate(new C70512w(this, (C70478a) null));
        this.f203728e.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        WalletFormView walletFormView2 = (WalletFormView) findViewById(C0966R.C0970id.ait);
        this.f203729f = walletFormView2;
        walletFormView2.getInfoIv().setLayoutParams(layoutParams);
        this.f203729f.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
        WalletIconImageView infoIv2 = this.f203729f.getInfoIv();
        int color2 = getResources().getColor(C0966R.color.FG_2);
        infoIv2.f212566u = C0966R.raw.icons_filled_close2;
        infoIv2.f212567v = color2;
        ((TextView) this.f203729f.findViewById(C0966R.C0970id.ljn)).setAccessibilityDelegate(new C70511v(this, (C70478a) null));
        this.f203729f.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        WalletFormView walletFormView3 = (WalletFormView) findViewById(C0966R.C0970id.ais);
        this.f203730g = walletFormView3;
        walletFormView3.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f203732i = (CdnImageView) this.f203730g.findViewById(C0966R.C0970id.f359552lh3);
        WalletFormView walletFormView4 = (WalletFormView) findViewById(C0966R.C0970id.air);
        this.f203731h = walletFormView4;
        walletFormView4.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f203733j = (Button) findViewById(C0966R.C0970id.aiv);
        this.f203728e.setFilterChar("\\x20\\t\\r\\n".toCharArray());
        this.f203728e.setOnFocusChangeListener(new C70496m());
        EditText contentEt = this.f203728e.getContentEt();
        EditText contentEt2 = this.f203729f.getContentEt();
        if (!C78844a.C15689b.f42385a.mo108842h(true) && (linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f357498a61)) != null) {
            linearLayout.setClickable(true);
            linearLayout.setOnTouchListener(new C70497n(contentEt));
        }
        this.f203728e.mo105069a(new C70498o(contentEt, contentEt2));
        this.f203728e.setOnEditorActionListener(new C70499p());
        C76024a.m91320a(this.f203729f);
        setEditFocusListener(this.f203729f, 2, false, false, true);
        this.f203729f.mo105069a(new C70501q());
        if (!Util.isNullOrNil(this.f203721P)) {
            this.f203729f.setText(this.f203721P);
        }
        this.f203730g.setOnClickListener(new C70503r());
        this.f203731h.setOnClickListener(new C70504s());
        this.f203733j.setOnClickListener(new C70505t());
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f203735o = wcPayBannerView;
        wcPayBannerView.mo105020a();
        this.f203728e.getInfoIv().setVisibility(0);
        this.f203728e.getInfoIv().setClickable(true);
        this.f203728e.getInfoIv().setEnabled(true);
        this.f203728e.getInfoIv().setIconContentDescription(getString(C0966R.string.ai8));
        this.f203728e.getInfoIv().setOnClickListener(new C78169c(this));
        mo97161T7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<EnterTimeParcel> arrayList;
        TransferRecordParcel transferRecordParcel;
        if (i == 1) {
            if (i2 == -1) {
                this.f203714H = false;
                String stringExtra = intent.getStringExtra("key_bank_card_seqno");
                this.f203746z = stringExtra;
                ArrayList<TransferRecordParcel> arrayList2 = this.f203739s;
                if (arrayList2 != null) {
                    Iterator<TransferRecordParcel> it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        transferRecordParcel = it.next();
                        if (transferRecordParcel.f115911d.equals(stringExtra)) {
                            break;
                        }
                    }
                }
                ArrayList<TransferRecordParcel> arrayList3 = this.f203740t;
                if (arrayList3 != null) {
                    Iterator<TransferRecordParcel> it4 = arrayList3.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        transferRecordParcel = it4.next();
                        if (transferRecordParcel.f115911d.equals(stringExtra)) {
                            break;
                        }
                    }
                }
                transferRecordParcel = null;
                this.f203713G = transferRecordParcel;
                mo97164W7();
                mo97161T7();
                TransferRecordParcel transferRecordParcel2 = this.f203713G;
                if (transferRecordParcel2 != null) {
                    String str = transferRecordParcel2.f115911d;
                    String str2 = this.f203745y;
                    String str3 = transferRecordParcel2.f115915h;
                    Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "do query bankinfo by seq: %s", str);
                    doSceneProgress(new C48381a(str, str2, str3), false);
                }
                MMHandlerThread.postToMainThreadDelayed(new C70495l(), 50);
            }
            Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "resultCode: %s", Integer.valueOf(i2));
            if (intent != null) {
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("key_delete_seq_no_list");
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_modified_record_list");
                if (stringArrayListExtra != null) {
                    Iterator<String> it5 = stringArrayListExtra.iterator();
                    while (it5.hasNext()) {
                        String next = it5.next();
                        mo97159R7(next, this.f203739s);
                        mo97159R7(next, this.f203740t);
                    }
                }
                if (parcelableArrayListExtra != null) {
                    Iterator it6 = parcelableArrayListExtra.iterator();
                    while (it6.hasNext()) {
                        TransferRecordParcel transferRecordParcel3 = (TransferRecordParcel) it6.next();
                        mo97158Q7(transferRecordParcel3, this.f203739s);
                        mo97158Q7(transferRecordParcel3, this.f203740t);
                    }
                }
            }
        } else if (i == 3) {
            if (i2 == -1) {
                int intExtra = intent.getIntExtra("key_enter_time_scene", -1);
                BankcardElemParcel bankcardElemParcel = this.f203712F;
                if (bankcardElemParcel != null && (arrayList = bankcardElemParcel.f115903o) != null) {
                    Iterator<EnterTimeParcel> it7 = arrayList.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        EnterTimeParcel next2 = it7.next();
                        if (next2.f115906d == intExtra) {
                            this.f203711E = next2;
                            break;
                        }
                    }
                }
                Log.m105929w("MicroMsg.BankRemitBankcardInputUI", "can't find the right enter scene: %d", Integer.valueOf(intExtra));
                mo97163V7();
                mo97161T7();
            }
        } else if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.f203712F = (BankcardElemParcel) intent.getParcelableExtra("key_bank_card_elem_parcel");
            mo97162U7();
            mo97160S7();
            mo97163V7();
            mo97155N7();
            mo97161T7();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideActionbarLine();
        this.f203721P = getIntent().getStringExtra("key_content");
        initView();
        addSceneEndListener(1348);
        addSceneEndListener(1542);
        addSceneEndListener(1378);
        addSceneEndListener(1349);
        addSceneEndListener(1280);
        this.f203709C = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BANK_REMIT_PAYLIST_STRING_SYNC, "");
        mo97157P7(false);
        Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "do operation");
        this.f203724S = true;
        doSceneProgress(new C77714i(), false);
        setMMTitle((int) C0966R.string.aie);
        addIconOptionMenu(0, C0966R.raw.actionbar_icon_dark_more, new C70478a());
        C115669n.INSTANCE.mo160131h(14673, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1348);
        removeSceneEndListener(1542);
        removeSceneEndListener(1378);
        removeSceneEndListener(1349);
        removeSceneEndListener(1280);
    }

    public void onResume() {
        super.onResume();
        this.f203728e.postDelayed(new C70494k(), 500);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (yVar instanceof C48381a) {
            C48381a aVar = (C48381a) yVar;
            if (!aVar.f129506u.equals(this.f203713G.f115911d)) {
                Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "outdated request: %s, %s", aVar.f129506u, this.f203746z);
                return true;
            }
            aVar.mo104823q1(new C70483c(aVar));
            aVar.mo104820l1(new C70481b(aVar));
            if (aVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", aVar);
            }
        } else if (yVar instanceof C48386f) {
            C48386f fVar = (C48386f) yVar;
            if (fVar == this.f203717K) {
                Log.m105924i("MicroMsg.BankRemitBankcardInputUI", "reset pending scene");
                this.f203717K = null;
            }
            if (!fVar.f129520u.equals(this.f203729f.getMD5Value())) {
                Log.m105925i("MicroMsg.BankRemitBankcardInputUI", "outdated card request: %s, %s", fVar.f129520u, this.f203729f.getMD5Value());
                return true;
            }
            fVar.mo104823q1(new C70484d(fVar));
            if (fVar.f221040j) {
                Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "bank info reponse error: %s, msg: %s", Integer.valueOf(fVar.f129518s.f138798d), fVar.f129518s.f138799e);
                m83016J7(this);
            }
            if (fVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", fVar);
            }
        } else if (yVar instanceof C48390k) {
            C48390k kVar = (C48390k) yVar;
            this.f203719M = true;
            kVar.mo104823q1(new C70487f(kVar));
            kVar.mo104820l1(new C70485e(kVar));
            if (kVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", kVar);
                this.f203718L = true;
            }
        } else if (yVar instanceof C48384d) {
            C48384d dVar = (C48384d) yVar;
            dVar.mo104823q1(new C70490h(dVar));
            dVar.mo104820l1(new C70488g(dVar));
            if (dVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", dVar);
            }
        } else if (yVar instanceof C77714i) {
            C77714i iVar = (C77714i) yVar;
            iVar.mo104823q1(new C70493j(iVar));
            iVar.mo104820l1(new C70491i(iVar));
            if (iVar.f221039i) {
                Log.m105921e("MicroMsg.BankRemitBankcardInputUI", "net error: %s", iVar);
                this.f203724S = false;
                this.f203725T = false;
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C70507u.class);
    }
}
