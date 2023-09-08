package com.tencent.p014mm.plugin.remittance.bankcard.p096ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.VerticalScrollBar;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import e63.C75556b;
import qj3.C47864f;
import te3.C51360t9;

/* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView */
public class BankRemitSortView extends BaseSortView {

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView$a */
    public class C42828a implements C44721b.C44723b {
        public C42828a() {
        }

        /* renamed from: a */
        public View mo63508a(C47864f fVar, View view, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2) {
            Context context = BankRemitSortView.this.getContext();
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6562id, (ViewGroup) null);
                C42829b bVar = new C42829b(BankRemitSortView.this, (C42828a) null);
                bVar.f115979b = (TextView) view.findViewById(C0966R.C0970id.ay5);
                bVar.f115980c = (TextView) view.findViewById(C0966R.C0970id.akq);
                bVar.f115978a = (CdnImageView) view.findViewById(C0966R.C0970id.akp);
                view.setTag(bVar);
            }
            C42829b bVar2 = (C42829b) view.getTag();
            C51360t9 t9Var = (C51360t9) fVar.f128466b;
            if (t9Var != null) {
                if (!BankRemitSortView.this.f121306p || !z) {
                    bVar2.f115979b.setVisibility(8);
                } else {
                    if (fVar.f128465a.equals("☆")) {
                        bVar2.f115979b.setText(C0966R.string.ai4);
                    } else {
                        bVar2.f115979b.setText(fVar.f128465a);
                    }
                    bVar2.f115979b.setVisibility(0);
                }
                bVar2.f115978a.setUseSdcardCache(true);
                CdnImageView cdnImageView = bVar2.f115978a;
                String str = t9Var.f142041f;
                cdnImageView.mo100289d(str, -1, 0, 0, C75556b.m90591a(str));
                bVar2.f115980c.setText(t9Var.f142040e);
            } else {
                Log.m105929w("MicroMsg.BankcardSortView", "elem is null: %s", Integer.valueOf(i));
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitSortView$b */
    public class C42829b {

        /* renamed from: a */
        public CdnImageView f115978a;

        /* renamed from: b */
        public TextView f115979b;

        /* renamed from: c */
        public TextView f115980c;

        public C42829b(BankRemitSortView bankRemitSortView, C42828a aVar) {
        }
    }

    public BankRemitSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public View mo63491b() {
        return View.inflate(getContext(), C0966R.C0971layout.f6563ie, this);
    }

    /* renamed from: c */
    public boolean mo63492c(String str, C47864f fVar) {
        return false;
    }

    public C44721b.C44723b getItemViewCreator() {
        return new C42828a();
    }

    public ListView getListView() {
        return (ListView) findViewById(C0966R.C0970id.fph);
    }

    public View getNoResultView() {
        return null;
    }

    public VerticalScrollBar getScrollBar() {
        return (VerticalScrollBar) findViewById(C0966R.C0970id.jkw);
    }
}
