package g63;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import eb0.C75592q0;
import p281yz.C79173v;
import p755xs.C102720b;

/* renamed from: g63.h */
public class C75883h {

    /* renamed from: a */
    public static final String f222537a = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_bule_bg.9_v2.png");

    /* renamed from: b */
    public static final String f222538b = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_bule_bg.9_v2.png");

    /* renamed from: c */
    public static final String f222539c = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_red_bg.9_v2.png");

    /* renamed from: d */
    public static final String f222540d = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_red_bg.9_v2.png");

    /* renamed from: e */
    public static final String f222541e = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_yellow_bg.9_v2.png");

    /* renamed from: f */
    public static final String f222542f = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_yellow_bg.9_v2.png");

    /* renamed from: g */
    public static final String f222543g = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_hbule_bg.9_v2.png");

    /* renamed from: h */
    public static final String f222544h = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_hbule_bg.9_v2.png");

    /* renamed from: i */
    public static final String f222545i = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_green_bg.9_v2.png");

    /* renamed from: j */
    public static final String f222546j = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_green_bg.9_v2.png");

    /* renamed from: k */
    public static final String f222547k = (HttpWrapperBase.PROTOCAL_HTTP + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_purple_bg.9_v2.png");

    /* renamed from: l */
    public static final String f222548l = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/zh_CN/htmledition/images/mmpaybanklogo/wallet_bankcard_purple_bg.9_v2.png");

    /* renamed from: g63.h$a */
    public static class C75884a implements C102720b.C78973a {

        /* renamed from: d */
        public TextView f222549d = null;

        /* renamed from: e */
        public TextView f222550e = null;

        /* renamed from: f */
        public TextView f222551f = null;

        /* renamed from: g */
        public ViewGroup f222552g = null;

        /* renamed from: h */
        public ImageView f222553h = null;

        /* renamed from: i */
        public ImageView f222554i = null;

        /* renamed from: j */
        public TextView f222555j = null;

        /* renamed from: n */
        public TextView f222556n = null;

        /* renamed from: o */
        public ViewGroup f222557o = null;

        /* renamed from: p */
        public TextView f222558p = null;

        /* renamed from: q */
        public TextView f222559q = null;

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", bitmap = ");
            sb.append(bitmap == null);
            Log.m105918d("MicroMsg.BankcardListAdapter", sb.toString());
        }
    }

    /* renamed from: a */
    public static View m91138a(Context context, View view, Bankcard bankcard, int i, BankcardLogoHelper bankcardLogoHelper, boolean z, int i2) {
        C75884a aVar;
        View view2;
        TextView textView;
        Context context2 = context;
        Bankcard bankcard2 = bankcard;
        if (view == null || view.getTag() == null) {
            int i3 = i;
            View inflate = View.inflate(context, i, (ViewGroup) null);
            C75884a aVar2 = new C75884a();
            aVar2.f222554i = (ImageView) inflate.findViewById(C0966R.C0970id.a5r);
            aVar2.f222550e = (TextView) inflate.findViewById(C0966R.C0970id.a5w);
            aVar2.f222551f = (TextView) inflate.findViewById(C0966R.C0970id.a7d);
            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.a6v);
            aVar2.f222549d = textView2;
            textView2.setTextSize(1, 32.0f);
            aVar2.f222555j = (TextView) inflate.findViewById(C0966R.C0970id.a6u);
            aVar2.f222552g = (ViewGroup) inflate.findViewById(C0966R.C0970id.lfc);
            aVar2.f222553h = (ImageView) inflate.findViewById(C0966R.C0970id.a74);
            aVar2.f222556n = (TextView) inflate.findViewById(C0966R.C0970id.a6p);
            aVar2.f222557o = (ViewGroup) inflate.findViewById(C0966R.C0970id.a6r);
            aVar2.f222558p = (TextView) inflate.findViewById(C0966R.C0970id.a6c);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.a75);
            aVar2.f222559q = (TextView) inflate.findViewById(C0966R.C0970id.a7_);
            inflate.setTag(aVar2);
            view2 = inflate;
            aVar = aVar2;
        } else {
            view2 = view;
            aVar = (C75884a) view.getTag();
        }
        if (bankcard2.field_bankcardState == 1) {
            aVar.f222555j.setVisibility(0);
        } else {
            aVar.f222555j.setVisibility(8);
        }
        if (z) {
            aVar.f222559q.setText(context.getString(C0966R.string.kn8));
            aVar.f222559q.setVisibility(0);
        } else if (!Util.isNullOrNil(bankcard2.field_card_state_name)) {
            aVar.f222559q.setText(bankcard2.field_card_state_name);
            aVar.f222559q.setVisibility(0);
        } else {
            aVar.f222559q.setVisibility(8);
        }
        aVar.f222550e.setVisibility(0);
        aVar.f222550e.setText(bankcard2.field_bankName);
        if (C75592q0.m90763K()) {
            aVar.f222551f.setVisibility(8);
        } else if (!Util.isNullOrNil(bankcard2.field_bankcardTypeName)) {
            aVar.f222551f.setText(bankcard2.field_bankcardTypeName);
        } else if (bankcard.mo99394u2()) {
            aVar.f222551f.setText(C0966R.string.lbt);
        } else if (bankcard.mo99389o2()) {
            aVar.f222551f.setText(C0966R.string.krm);
        } else {
            aVar.f222551f.setText(C0966R.string.ksc);
        }
        TextView textView3 = aVar.f222549d;
        if (textView3 != null) {
            textView3.setText(bankcard2.field_bankcardTail);
        }
        if (Util.isNullOrNil(bankcard2.field_card_bottom_wording) || (textView = aVar.f222558p) == null) {
            aVar.f222557o.setVisibility(8);
        } else {
            textView.setText(bankcard2.field_card_bottom_wording);
            aVar.f222557o.setVisibility(0);
        }
        bankcardLogoHelper.mo99893d(context, bankcard, aVar.f222554i, aVar.f222552g, aVar.f222553h, aVar.f222559q);
        if (aVar.f222556n != null) {
            ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().getClass();
            aVar.f222556n.setVisibility(8);
        }
        return view2;
    }
}
