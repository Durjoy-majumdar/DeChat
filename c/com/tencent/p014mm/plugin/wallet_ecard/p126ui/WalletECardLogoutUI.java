package com.tencent.p014mm.plugin.wallet_ecard.p126ui;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de3.C75355a0;
import j20.C117292a;
import j63.C46449i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import te3.C50559nk3;
import te3.C51127rm;
import te3.ji4;
import v43.C78334a;
import yq3.C79143a;
import yq3.C79148e;

/* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI */
public class WalletECardLogoutUI extends WalletECardBaseUI {

    /* renamed from: o */
    public static final /* synthetic */ int f117397o = 0;

    /* renamed from: d */
    public TextView f117398d;

    /* renamed from: e */
    public TextView f117399e;

    /* renamed from: f */
    public TextView f117400f;

    /* renamed from: g */
    public LinearLayout f117401g;

    /* renamed from: h */
    public View f117402h;

    /* renamed from: i */
    public CdnImageView f117403i;

    /* renamed from: j */
    public String f117404j;

    /* renamed from: n */
    public String f117405n;

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI$a */
    public class C43433a implements View.OnClickListener {
        public C43433a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletECardLogoutUI walletECardLogoutUI = WalletECardLogoutUI.this;
            int i = WalletECardLogoutUI.f117397o;
            walletECardLogoutUI.getClass();
            Log.m105924i("MicroMsg.WalletECardLogoutUI", "do logout");
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_is_show_detail", false);
            Bankcard bankcard = new Bankcard();
            bankcard.field_bindSerial = walletECardLogoutUI.f117404j;
            bankcard.field_bankcardType = walletECardLogoutUI.f117405n;
            bundle.putParcelable("key_bankcard", bankcard);
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            bundle.putString("key_check_pwd_title", walletECardLogoutUI.getString(C0966R.string.kr6));
            C79143a.m95771j(walletECardLogoutUI, C78334a.class, bundle, (C79148e.C79149a) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI$b */
    public class C43434b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C46449i f117407a;

        public C43434b(C46449i iVar) {
            this.f117407a = iVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            WalletECardLogoutUI walletECardLogoutUI = WalletECardLogoutUI.this;
            C50559nk3 nk32 = this.f117407a.f125128s;
            walletECardLogoutUI.f117404j = nk32.f138649n;
            walletECardLogoutUI.f117405n = nk32.f138650o;
            walletECardLogoutUI.getClass();
            if (!Util.isNullOrNil(nk32.f138644f)) {
                walletECardLogoutUI.setMMTitle(nk32.f138644f);
            }
            if (!Util.isNullOrNil(nk32.f138646h)) {
                walletECardLogoutUI.f117398d.setText(nk32.f138646h);
            }
            if (!Util.isNullOrNil(nk32.f138645g)) {
                walletECardLogoutUI.f117403i.setUrl(nk32.f138645g);
            }
            C51127rm rmVar = nk32.f138647i;
            if (rmVar != null) {
                if (!Util.isNullOrNil(rmVar.f141026d)) {
                    walletECardLogoutUI.f117399e.setText(rmVar.f141026d);
                }
                LinkedList<String> linkedList = rmVar.f141027e;
                if (linkedList != null) {
                    Iterator<String> it = linkedList.iterator();
                    while (it.hasNext()) {
                        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(walletECardLogoutUI).inflate(C0966R.C0971layout.a07, walletECardLogoutUI.f117401g, false);
                        ((TextView) linearLayout.findViewById(C0966R.C0970id.cds)).setText(it.next());
                        walletECardLogoutUI.f117401g.addView(linearLayout);
                    }
                }
            }
            if (nk32.f138652q != null) {
                Log.m105924i("MicroMsg.WalletECardLogoutUI", "show trade detail");
                ji4 ji4 = nk32.f138652q;
                if (!Util.isNullOrNil(ji4.f136144d)) {
                    C72476y0 y0Var = new C72476y0(2, (C72476y0.C72477a) new C43435a(walletECardLogoutUI, ji4));
                    SpannableString spannableString = new SpannableString(ji4.f136144d);
                    spannableString.setSpan(y0Var, 0, spannableString.length(), 18);
                    walletECardLogoutUI.f117400f.setClickable(true);
                    walletECardLogoutUI.f117400f.setOnTouchListener(new C75355a0(walletECardLogoutUI));
                    walletECardLogoutUI.f117400f.setText(spannableString);
                    walletECardLogoutUI.f117400f.setOnClickListener(new C5813b(walletECardLogoutUI));
                    walletECardLogoutUI.f117400f.setVisibility(0);
                }
            }
            View view = walletECardLogoutUI.f117402h;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryCancelECardDescRes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/QryCancelECardDescRes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a08;
    }

    public void initView() {
        this.f117398d = (TextView) findViewById(C0966R.C0970id.f357910ce0);
        this.f117399e = (TextView) findViewById(C0966R.C0970id.cdz);
        this.f117401g = (LinearLayout) findViewById(C0966R.C0970id.cdy);
        this.f117400f = (TextView) findViewById(C0966R.C0970id.cdt);
        this.f117403i = (CdnImageView) findViewById(C0966R.C0970id.cdv);
        this.f117402h = findViewById(C0966R.C0970id.cdx);
        ((Button) findViewById(C0966R.C0970id.cdw)).setOnClickListener(new C43433a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(2931);
        initView();
        setMMTitle((int) C0966R.string.c36);
        Log.m105924i("MicroMsg.WalletECardLogoutUI", "do qry logout desc");
        C46449i iVar = new C46449i(1);
        iVar.mo104821m1(this);
        doSceneProgress(iVar, true);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2931);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C46449i)) {
            return false;
        }
        C46449i iVar = (C46449i) yVar;
        iVar.mo104823q1(new C43434b(iVar));
        return true;
    }
}
