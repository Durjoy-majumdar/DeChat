package com.tencent.p014mm.plugin.kidswatch.p066ui.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.kidswatch.model.KidsWatchAcctInfo;
import gc0.C20828a;
import gy3.C87412m;
import hc0.C20937c;
import kg3.C76577a;
import kotlin.Metadata;
import p192l4.C10462b;
import v12.C52736a;
import z12.C16094a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/kidswatch/ui/login/KidsWatchCardLayout;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/kidswatch/model/KidsWatchAcctInfo;", "kidsAcctInfo", "Lrx3/b0;", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-kidswatch_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchCardLayout */
public final class KidsWatchCardLayout extends LinearLayout {

    /* renamed from: d */
    public boolean f114959d;

    /* renamed from: e */
    public final C20937c.C20939b f114960e;

    /* renamed from: f */
    public C52736a f114961f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KidsWatchCardLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        int a = C74942w4.m89784a(context, 16);
        C20937c.C20939b bVar = new C20937c.C20939b();
        this.f114960e = bVar;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359841b32, this, false);
        addView(inflate);
        int i2 = C0966R.C0970id.a1q;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) C10462b.m10395a(inflate, C0966R.C0970id.a1q);
        if (roundCornerImageView != null) {
            i2 = C0966R.C0970id.arh;
            LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.arh);
            if (linearLayout != null) {
                i2 = C0966R.C0970id.c49;
                TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.c49);
                if (textView != null) {
                    i2 = C0966R.C0970id.g5c;
                    TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.g5c);
                    if (textView2 != null) {
                        i2 = C0966R.C0970id.g5d;
                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.g5d);
                        if (textView3 != null) {
                            i2 = C0966R.C0970id.hfu;
                            TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.hfu);
                            if (textView4 != null) {
                                this.f114961f = new C52736a((LinearLayout) inflate, roundCornerImageView, linearLayout, textView, textView2, textView3, textView4);
                                setNestedScrollingEnabled(true);
                                RoundCornerImageView roundCornerImageView2 = this.f114961f.f147314a;
                                roundCornerImageView2.f220448f = a;
                                roundCornerImageView2.f220449g = a;
                                bVar.f59359o = C0966R.C0969drawable.bfa;
                                bVar.f59365u = (float) a;
                                bVar.f59364t = true;
                                mo66555a();
                                C16094a aVar = C16094a.f43246a;
                                Context context2 = getContext();
                                C87412m.m108593f(context2, "context");
                                aVar.mo14692c(context2, this.f114961f.f147315b, (LinearLayout) null);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* renamed from: a */
    public final void mo66555a() {
        if (this.f114959d) {
            this.f114961f.f147317d.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.aaq));
            this.f114961f.f147318e.setText(getContext().getString(C0966R.string.g0v));
            return;
        }
        this.f114961f.f147317d.setBackground(C76577a.m92158i(getContext(), C0966R.C0969drawable.aal));
        this.f114961f.f147318e.setText(getContext().getString(C0966R.string.g0c));
    }

    public final void setData(KidsWatchAcctInfo kidsWatchAcctInfo) {
        C87412m.m108594g(kidsWatchAcctInfo, "kidsAcctInfo");
        C20828a.m22825b().mo32519h(kidsWatchAcctInfo.f114956f, this.f114961f.f147314a, this.f114960e.mo32666a());
        this.f114961f.f147319f.setText(kidsWatchAcctInfo.f114955e);
        boolean z = true;
        if (kidsWatchAcctInfo.f114954d != 1) {
            z = false;
        }
        this.f114959d = z;
        this.f114961f.f147316c.setText(kidsWatchAcctInfo.f114958h);
        mo66555a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KidsWatchCardLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
