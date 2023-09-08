package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.MaxListView;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI */
public class WalletSelectBankcardUI extends WalletBaseUI {

    /* renamed from: d */
    public TextView f210274d;

    /* renamed from: e */
    public MaxListView f210275e;

    /* renamed from: f */
    public TextView f210276f;

    /* renamed from: g */
    public int f210277g = 0;

    /* renamed from: h */
    public String f210278h = null;

    /* renamed from: i */
    public boolean f210279i = true;

    /* renamed from: j */
    public String f210280j = null;

    /* renamed from: n */
    public List<Bankcard> f210281n = null;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI$a */
    public class C72307a extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletSelectBankcardUI$a$a */
        public class C72308a {

            /* renamed from: a */
            public TextView f210283a;

            public C72308a(C72307a aVar) {
            }
        }

        public C72307a(C72406n1 n1Var) {
        }

        public int getCount() {
            WalletSelectBankcardUI walletSelectBankcardUI = WalletSelectBankcardUI.this;
            if (walletSelectBankcardUI.f210279i) {
                List<Bankcard> list = walletSelectBankcardUI.f210281n;
                if (list == null) {
                    return 1;
                }
                return 1 + list.size();
            }
            List<Bankcard> list2 = walletSelectBankcardUI.f210281n;
            if (list2 == null) {
                return 0;
            }
            return list2.size();
        }

        public Object getItem(int i) {
            List<Bankcard> list = WalletSelectBankcardUI.this.f210281n;
            if (list == null || list.size() <= i) {
                return null;
            }
            return WalletSelectBankcardUI.this.f210281n.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C72308a aVar;
            Bankcard bankcard = (Bankcard) getItem(i);
            if (view == null) {
                view = LayoutInflater.from(WalletSelectBankcardUI.this).inflate(C0966R.C0971layout.cgf, viewGroup, false);
                aVar = new C72308a(this);
                aVar.f210283a = (TextView) view.findViewById(C0966R.C0970id.a6q);
                view.setTag(aVar);
            } else {
                aVar = (C72308a) view.getTag();
            }
            if (bankcard != null) {
                aVar.f210283a.setText(bankcard.field_desc);
            } else {
                aVar.f210283a.setText(C0966R.string.l8n);
            }
            return view;
        }
    }

    /* renamed from: H7 */
    public static void m84648H7(WalletSelectBankcardUI walletSelectBankcardUI, Bankcard bankcard) {
        walletSelectBankcardUI.getInput().putParcelable("key_bankcard", bankcard);
        walletSelectBankcardUI.getNetController().mo91271d(new Object[0]);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cgg;
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.kmg);
        this.f210277g = getInput().getInt("key_scene", 0);
        this.f210278h = getInput().getString("key_top_tips");
        this.f210279i = getInput().getBoolean("key_is_show_new_bankcard", true);
        this.f210280j = getInput().getString("bottom_tips");
        ArrayList parcelableArrayList = getInput().getParcelableArrayList("key_showing_bankcards");
        this.f210281n = parcelableArrayList;
        if (parcelableArrayList == null) {
            this.f210281n = ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91326h();
        }
        this.f210274d = (TextView) findViewById(C0966R.C0970id.kpl);
        this.f210275e = (MaxListView) findViewById(C0966R.C0970id.f357504a73);
        this.f210276f = (TextView) findViewById(C0966R.C0970id.f357562ai1);
        if (!Util.isNullOrNil(this.f210278h)) {
            this.f210274d.setVisibility(0);
            this.f210274d.setText(this.f210278h);
        } else {
            this.f210274d.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f210280j)) {
            this.f210276f.setVisibility(0);
            this.f210276f.setText(this.f210280j);
        } else {
            this.f210276f.setVisibility(8);
        }
        if (this.f210277g == 0) {
            this.f210276f.setVisibility(0);
            C72478z zVar = new C72478z(this);
            zVar.f210835d = new C72406n1(this);
            String string = getString(C0966R.string.l8h);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(zVar, string.length() - 14, string.length(), 33);
            this.f210276f.setText(spannableString);
            this.f210276f.setMovementMethod(LinkMovementMethod.getInstance());
        }
        this.f210275e.setAdapter(new C72307a((C72406n1) null));
        this.f210275e.setOnItemClickListener(new C72410o1(this));
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
