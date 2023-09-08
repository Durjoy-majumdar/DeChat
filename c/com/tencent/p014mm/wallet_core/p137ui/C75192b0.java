package com.tencent.p014mm.wallet_core.p137ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import di3.C86312j;
import gl3.C75922b;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.wallet_core.ui.b0 */
public class C75192b0 extends C75922b {

    /* renamed from: A */
    public C75193a f221227A = new C75193a(this);

    /* renamed from: x */
    public String f221228x;

    /* renamed from: y */
    public boolean f221229y;

    /* renamed from: z */
    public C75194b f221230z = new C75194b();

    /* renamed from: com.tencent.mm.wallet_core.ui.b0$a */
    public class C75193a implements C75922b.C75923a {

        /* renamed from: a */
        public TextView f221231a;

        /* renamed from: b */
        public WeImageView f221232b;

        public C75193a(C75192b0 b0Var) {
        }
    }

    /* renamed from: com.tencent.mm.wallet_core.ui.b0$b */
    public class C75194b implements C75922b.C75924b {
        public C75194b() {
        }

        /* renamed from: a */
        public void mo67029a(Context context, C75922b.C75923a aVar, C75922b bVar, boolean z, boolean z2) {
            C75193a aVar2 = (C75193a) aVar;
            String str = ((C75192b0) bVar).f221228x;
            TextView textView = aVar2.f221231a;
            if (textView != null) {
                if (str == null || str.length() == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(textView.getContext(), str, textView.getTextSize()));
                    textView.setVisibility(0);
                }
            }
            if (C75192b0.this.f221229y) {
                aVar2.f221232b.setVisibility(0);
            } else {
                aVar2.f221232b.setVisibility(8);
            }
        }

        /* renamed from: b */
        public View mo67030b(Context context, ViewGroup viewGroup, View view) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f7216yo, viewGroup, false);
            C75193a aVar = C75192b0.this.f221227A;
            aVar.f221231a = (TextView) inflate.findViewById(C0966R.C0970id.evf);
            aVar.f221232b = (WeImageView) inflate.findViewById(C0966R.C0970id.euw);
            inflate.setTag(aVar);
            if (C75192b0.this.f222606c) {
                View findViewById = inflate.findViewById(C0966R.C0970id.evg);
                if (findViewById != null) {
                    findViewById.setBackgroundResource(C0966R.color.f2947a4);
                }
                TextView textView = aVar.f221231a;
                textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
            }
            return inflate;
        }

        /* renamed from: c */
        public boolean mo67031c(Context context, View view, C75922b bVar) {
            return false;
        }
    }

    public C75192b0(int i) {
        super(0, i);
    }

    /* renamed from: a */
    public void mo67027a(Context context, C75922b.C75923a aVar) {
    }

    /* renamed from: b */
    public C75922b.C75924b mo67028b() {
        return this.f221230z;
    }
}
