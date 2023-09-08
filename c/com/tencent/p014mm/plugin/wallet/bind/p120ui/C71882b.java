package com.tencent.p014mm.plugin.wallet.bind.p120ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import e63.C75556b;
import eb0.C75592q0;
import f40.C86709a0;
import g63.C75883h;
import hi3.C87515a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.plugin.wallet.bind.ui.b */
public class C71882b extends BaseAdapter {

    /* renamed from: d */
    public final Context f208509d;

    /* renamed from: e */
    public ArrayList<Bankcard> f208510e;

    /* renamed from: f */
    public int f208511f = 0;

    /* renamed from: g */
    public BankcardLogoHelper f208512g;

    /* renamed from: h */
    public List<String> f208513h;

    /* renamed from: com.tencent.mm.plugin.wallet.bind.ui.b$a */
    public class C71883a {

        /* renamed from: a */
        public TextView f208514a = null;

        /* renamed from: b */
        public TextView f208515b = null;

        /* renamed from: c */
        public ViewGroup f208516c = null;

        /* renamed from: d */
        public ImageView f208517d = null;

        /* renamed from: e */
        public ImageView f208518e = null;

        /* renamed from: f */
        public TextView f208519f = null;

        /* renamed from: g */
        public TextView f208520g = null;

        /* renamed from: h */
        public WalletTextView f208521h = null;

        /* renamed from: i */
        public TextView f208522i = null;

        public C71883a(C71882b bVar) {
        }
    }

    static {
        WeChatHosts.domainString(C0966R.string.fmc);
        WeChatHosts.domainString(C0966R.string.fmc);
        WeChatHosts.domainString(C0966R.string.fmc);
        WeChatHosts.domainString(C0966R.string.fmc);
        WeChatHosts.domainString(C0966R.string.fmc);
        WeChatHosts.domainString(C0966R.string.fmc);
    }

    public C71882b(Context context, ArrayList<Bankcard> arrayList) {
        this.f208509d = context;
        this.f208510e = arrayList;
        BankcardLogoHelper bankcardLogoHelper = new BankcardLogoHelper();
        this.f208512g = bankcardLogoHelper;
        bankcardLogoHelper.mo99892c(context, this.f208510e);
        mo99074d();
    }

    /* renamed from: a */
    public Bankcard getItem(int i) {
        if (i < 0 || i >= this.f208511f) {
            return null;
        }
        return this.f208510e.get(i);
    }

    /* renamed from: b */
    public void mo99073b(ArrayList<Bankcard> arrayList) {
        this.f208510e = arrayList;
        if (arrayList != null) {
            this.f208511f = arrayList.size();
        } else {
            this.f208511f = 0;
        }
        if (this.f208511f > 0) {
            this.f208512g.mo99892c(this.f208509d, this.f208510e);
        }
        mo99074d();
    }

    /* renamed from: d */
    public final void mo99074d() {
        C86709a0.m107528h();
        this.f208513h = Util.stringsToList(((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC, "")).split(","));
    }

    public int getCount() {
        return this.f208511f;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        Bankcard a = getItem(i);
        if (a == null) {
            return 4;
        }
        if (a.field_bankcardState == 9) {
            return a.field_wxcreditState == 0 ? 2 : 3;
        }
        if (a.mo99394u2() && "CITIC_CREDIT".equals(a.field_bankcardType)) {
            return 5;
        }
        if (a.mo99392r2()) {
            return 6;
        }
        return (!a.mo99390p2() || C75592q0.m90763K()) ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        C71883a aVar;
        View view2;
        View view3;
        C71883a aVar2;
        C71883a aVar3;
        View view4;
        Bankcard a = getItem(i);
        if (a == null) {
            return view;
        }
        int itemViewType = getItemViewType(i);
        List<String> list = this.f208513h;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = this.f208513h.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(a.field_bindSerial)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        Log.m105927v("MicroMsg.BankcardListAdapter", "getView, pos: %d, bottom_wording: %s, showNew: %s", Integer.valueOf(i), a.field_card_bottom_wording, Boolean.valueOf(z));
        switch (itemViewType) {
            case 0:
                return C75883h.m91138a(this.f208509d, view, a, C0966R.C0971layout.cdt, this.f208512g, z, itemViewType);
            case 1:
                return C75883h.m91138a(this.f208509d, view, a, C0966R.C0971layout.cdy, this.f208512g, z, itemViewType);
            case 2:
                if (view == null || view.getTag() == null) {
                    view2 = View.inflate(this.f208509d, C0966R.C0971layout.f360052ce1, (ViewGroup) null);
                    aVar = new C71883a(this);
                    aVar.f208518e = (ImageView) view2.findViewById(C0966R.C0970id.a5r);
                    aVar.f208514a = (TextView) view2.findViewById(C0966R.C0970id.a5w);
                    aVar.f208520g = (TextView) view2.findViewById(C0966R.C0970id.hdn);
                    ImageView imageView = (ImageView) view2.findViewById(C0966R.C0970id.a6w);
                    ImageView imageView2 = (ImageView) view2.findViewById(C0966R.C0970id.a6x);
                    ImageView imageView3 = (ImageView) view2.findViewById(C0966R.C0970id.a6y);
                    view2.setTag(aVar);
                } else {
                    aVar = (C71883a) view.getTag();
                    view2 = view;
                }
                aVar.f208514a.setText(this.f208509d.getString(C0966R.string.ku9, new Object[]{a.field_bankName}));
                if (C71884c.m84324a(a)) {
                    aVar.f208520g.setVisibility(0);
                } else {
                    aVar.f208520g.setVisibility(8);
                }
                return view2;
            case 3:
                if (view == null || view.getTag() == null) {
                    view3 = View.inflate(this.f208509d, C0966R.C0971layout.f360054ce3, (ViewGroup) null);
                    C71883a aVar4 = new C71883a(this);
                    aVar4.f208518e = (ImageView) view3.findViewById(C0966R.C0970id.a5r);
                    aVar4.f208514a = (TextView) view3.findViewById(C0966R.C0970id.a5w);
                    aVar4.f208519f = (TextView) view3.findViewById(C0966R.C0970id.a6u);
                    ImageView imageView4 = (ImageView) view3.findViewById(C0966R.C0970id.a6w);
                    ImageView imageView5 = (ImageView) view3.findViewById(C0966R.C0970id.a6x);
                    ImageView imageView6 = (ImageView) view3.findViewById(C0966R.C0970id.a6y);
                    view3.setTag(aVar4);
                    aVar2 = aVar4;
                } else {
                    aVar2 = (C71883a) view.getTag();
                    view3 = view;
                }
                int i2 = a.field_wxcreditState;
                if (i2 == 1) {
                    aVar2.f208519f.setBackgroundResource(C0966R.C0969drawable.cey);
                    aVar2.f208519f.setVisibility(0);
                } else if (i2 != 3) {
                    aVar2.f208519f.setVisibility(8);
                } else {
                    aVar2.f208519f.setBackgroundResource(C0966R.C0969drawable.cep);
                    aVar2.f208519f.setVisibility(0);
                }
                aVar2.f208514a.setText(a.field_bankName);
                this.f208512g.mo99894e(this.f208509d, a, aVar2.f208518e);
                return view3;
            case 4:
                return View.inflate(this.f208509d, C0966R.C0971layout.cdu, (ViewGroup) null);
            case 5:
                return C75883h.m91138a(this.f208509d, view, a, C0966R.C0971layout.f360053ce2, this.f208512g, z, itemViewType);
            case 6:
                if (view == null || view.getTag() == null) {
                    view4 = View.inflate(this.f208509d, C0966R.C0971layout.cdw, (ViewGroup) null);
                    aVar3 = new C71883a(this);
                    aVar3.f208518e = (ImageView) view4.findViewById(C0966R.C0970id.a5r);
                    aVar3.f208514a = (TextView) view4.findViewById(C0966R.C0970id.a5w);
                    aVar3.f208515b = (TextView) view4.findViewById(C0966R.C0970id.a7d);
                    aVar3.f208519f = (TextView) view4.findViewById(C0966R.C0970id.a6u);
                    aVar3.f208521h = (WalletTextView) view4.findViewById(C0966R.C0970id.lf_);
                    aVar3.f208517d = (ImageView) view4.findViewById(C0966R.C0970id.a74);
                    aVar3.f208522i = (TextView) view4.findViewById(C0966R.C0970id.lfa);
                    aVar3.f208516c = (ViewGroup) view4.findViewById(C0966R.C0970id.lfc);
                    view4.setTag(aVar3);
                } else {
                    aVar3 = (C71883a) view.getTag();
                    view4 = view;
                }
                aVar3.f208518e.setImageDrawable(C87515a.m108835e(this.f208509d.getResources(), C0966R.raw.honey_pay_bank_logo, 0.0f));
                if ((aVar3.f208518e instanceof CdnImageView) && !Util.isNullOrNil(a.f209391D2)) {
                    ((CdnImageView) aVar3.f208518e).setUseSdcardCache(true);
                    ((CdnImageView) aVar3.f208518e).setImgSavedPath(C75556b.f221973a);
                    ((CdnImageView) aVar3.f208518e).mo100288c(a.f209391D2, 0, 0, C0966R.raw.honey_pay_bank_logo);
                }
                aVar3.f208514a.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f208509d, C75228t.m90277z(C75228t.m90268r(a.f209431z2), 10), aVar3.f208514a.getTextSize()));
                aVar3.f208515b.setText(a.f209390C2);
                if (a.f209388A2 == 0) {
                    String bigDecimal = C75228t.m90248h("" + a.f209430y2, "100", 2, RoundingMode.HALF_UP).toString();
                    aVar3.f208521h.setPrefix(C45121z0.m49962b());
                    aVar3.f208521h.setText(bigDecimal);
                    aVar3.f208521h.setTextSize(1, 30.0f);
                    aVar3.f208521h.setVisibility(0);
                    aVar3.f208522i.setVisibility(0);
                } else {
                    aVar3.f208521h.setVisibility(4);
                    aVar3.f208522i.setVisibility(4);
                }
                if (C85875k4.m106211z()) {
                    aVar3.f208516c.setBackgroundResource(C0966R.C0969drawable.ceu);
                    aVar3.f208517d.setImageResource(C0966R.raw.honey_pay_input_logo_dm);
                }
                view4.postDelayed(new C71881a(this, aVar3, view4), 50);
                return view4;
            default:
                return view;
        }
    }

    public int getViewTypeCount() {
        return 7;
    }
}
