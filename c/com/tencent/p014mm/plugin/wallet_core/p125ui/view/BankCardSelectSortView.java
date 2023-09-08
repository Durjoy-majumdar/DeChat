package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import android.content.Context;
import android.graphics.Bitmap;
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
import com.tencent.p014mm.sdk.platformtools.Util;
import qj3.C47864f;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView */
public class BankCardSelectSortView extends BaseSortView {

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView$a */
    public class C72437a implements C44721b.C44723b {
        public C72437a() {
        }

        /* renamed from: a */
        public View mo63508a(C47864f fVar, View view, ViewGroup viewGroup, int i, int i2, boolean z, boolean z2) {
            Context context = BankCardSelectSortView.this.getContext();
            if (view == null) {
                view = LayoutInflater.from(context).inflate(C0966R.C0971layout.f6562id, (ViewGroup) null);
                view.setImportantForAccessibility(2);
                C72439c cVar = new C72439c();
                cVar.f210702b = (TextView) view.findViewById(C0966R.C0970id.ay5);
                cVar.f210703c = (TextView) view.findViewById(C0966R.C0970id.akq);
                cVar.f210701a = (CdnImageView) view.findViewById(C0966R.C0970id.akp);
                view.setTag(cVar);
            }
            C72439c cVar2 = (C72439c) view.getTag();
            BankCardSelectSortView bankCardSelectSortView = BankCardSelectSortView.this;
            if (!bankCardSelectSortView.f121306p || !z) {
                cVar2.f210702b.setVisibility(8);
            } else {
                cVar2.f210702b.setText(fVar.f128465a);
                cVar2.f210702b.setContentDescription(bankCardSelectSortView.getContext().getString(C0966R.string.kna, new Object[]{fVar.f128465a}));
                cVar2.f210702b.setVisibility(0);
            }
            C72438b bVar = (C72438b) fVar.f128466b;
            cVar2.f210703c.setText(bVar.f210698c);
            if (!Util.isNullOrNil(bVar.f210696a)) {
                cVar2.f210701a.setUseSdcardCache(true);
                cVar2.f210701a.mo100289d(bVar.f210696a, -1, 0, 0, bVar.f210697b);
            } else {
                cVar2.f210701a.setImageBitmap((Bitmap) null);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView$b */
    public static class C72438b {

        /* renamed from: a */
        public String f210696a;

        /* renamed from: b */
        public String f210697b;

        /* renamed from: c */
        public String f210698c;

        /* renamed from: d */
        public String f210699d;

        /* renamed from: e */
        public String f210700e;
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.BankCardSelectSortView$c */
    public static class C72439c {

        /* renamed from: a */
        public CdnImageView f210701a;

        /* renamed from: b */
        public TextView f210702b;

        /* renamed from: c */
        public TextView f210703c;
    }

    public BankCardSelectSortView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public View mo63491b() {
        return View.inflate(getContext(), C0966R.C0971layout.f6563ie, this);
    }

    /* renamed from: c */
    public boolean mo63492c(String str, C47864f fVar) {
        return ((C72438b) fVar.f128466b).f210698c.toUpperCase().contains(str.toUpperCase());
    }

    public C44721b.C44723b getItemViewCreator() {
        return new C72437a();
    }

    public ListView getListView() {
        return (ListView) findViewById(C0966R.C0970id.fph);
    }

    public View getNoResultView() {
        return findViewById(C0966R.C0970id.a76);
    }

    public VerticalScrollBar getScrollBar() {
        return (VerticalScrollBar) findViewById(C0966R.C0970id.jkw);
    }
}
