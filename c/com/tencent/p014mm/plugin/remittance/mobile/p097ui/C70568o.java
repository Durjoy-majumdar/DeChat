package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import java.util.ArrayList;
import qo3.C101218e0;
import te3.C64600o30;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.o */
public class C70568o extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ MobileRemittanceUI f204030g;

    public C70568o(MobileRemittanceUI mobileRemittanceUI) {
        this.f204030g = mobileRemittanceUI;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemittanceUI", "DelayOption View show bottomView");
        this.f204030g.showCircleStWcKb();
        MobileRemittanceUI mobileRemittanceUI = this.f204030g;
        mobileRemittanceUI.f203958S = mobileRemittanceUI.f203959T;
        C101218e0 e0Var = new C101218e0(mobileRemittanceUI.getContext(), 1, 3);
        e0Var.mo140667n(mobileRemittanceUI.getContext().getString(C0966R.string.gua), mobileRemittanceUI.getContext().getString(C0966R.string.gud));
        ViewGroup viewGroup = null;
        View inflate = View.inflate(mobileRemittanceUI.getContext(), C0966R.C0971layout.bg6, (ViewGroup) null);
        C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.knx)).getPaint(), 0.8f);
        View inflate2 = View.inflate(mobileRemittanceUI.getContext(), C0966R.C0971layout.bg5, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(C0966R.C0970id.br8);
        C70566l lVar = new C70566l(mobileRemittanceUI, e0Var);
        C70567m mVar = new C70567m(mobileRemittanceUI, e0Var);
        e0Var.f296373D = lVar;
        e0Var.f296374E = mVar;
        ArrayList arrayList = new ArrayList();
        C5057n nVar = new C5057n(mobileRemittanceUI, arrayList);
        int i = 0;
        while (i < ((ArrayList) mobileRemittanceUI.f203973n).size()) {
            C64600o30 o302 = (C64600o30) ((ArrayList) mobileRemittanceUI.f203973n).get(i);
            View inflate3 = mobileRemittanceUI.getLayoutInflater().inflate(C0966R.C0971layout.bg7, viewGroup);
            TextView textView = (TextView) inflate3.findViewById(C0966R.C0970id.gwe);
            textView.setText(o302.f184612d);
            ImageView imageView = (ImageView) inflate3.findViewById(C0966R.C0970id.gwd);
            imageView.getDrawable().setColorFilter(mobileRemittanceUI.getResources().getColor(C0966R.color.f2939n), PorterDuff.Mode.SRC_ATOP);
            if (mobileRemittanceUI.f203959T == i) {
                imageView.setVisibility(0);
                textView.setContentDescription(mobileRemittanceUI.getString(C0966R.string.hih) + o302.f184612d);
            } else {
                imageView.setVisibility(8);
            }
            imageView.setTag(Integer.valueOf(i));
            inflate3.setTag(imageView);
            inflate3.setOnClickListener(nVar);
            linearLayout.addView(inflate3);
            arrayList.add(inflate3);
            i++;
            viewGroup = null;
        }
        e0Var.mo140672r(inflate);
        e0Var.mo140663j(inflate2);
        e0Var.mo140655A();
        mobileRemittanceUI.mo97216J7(7);
    }
}
