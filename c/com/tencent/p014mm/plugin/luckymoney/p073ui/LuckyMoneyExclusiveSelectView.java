package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyExclusiveSelectView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/plugin/luckymoney/ui/m1;", "", "getInputViewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectView */
public final class LuckyMoneyExclusiveSelectView extends LinearLayout implements C69637m1 {

    /* renamed from: d */
    public TextView f19923d;

    /* renamed from: e */
    public TextView f19924e;

    /* renamed from: f */
    public WeImageView f19925f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LuckyMoneyExclusiveSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attributeSet");
        View inflate = View.inflate(context, C0966R.C0971layout.b9o, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.gev);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.l…ey_exclusive_username_tv)");
        this.f19923d = (TextView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.geu);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.l…money_exclusive_title_tv)");
        this.f19924e = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.ger);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.l…money_exclusive_arrow_iv)");
        this.f19925f = (WeImageView) findViewById3;
    }

    /* renamed from: a */
    public void mo5751a() {
        TextView textView = this.f19924e;
        if (textView != null) {
            textView.setTextColor(C69242l1.m81598d(getContext()));
            WeImageView weImageView = this.f19925f;
            if (weImageView != null) {
                weImageView.setIconColor(C69242l1.m81598d(getContext()));
            } else {
                C87412m.m108603p("arrowIv");
                throw null;
            }
        } else {
            C87412m.m108603p("titleTv");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo5752b() {
        TextView textView = this.f19924e;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(C0966R.color.a7f));
            WeImageView weImageView = this.f19925f;
            if (weImageView != null) {
                weImageView.setIconColor(getResources().getColor(C0966R.color.FG_0));
            } else {
                C87412m.m108603p("arrowIv");
                throw null;
            }
        } else {
            C87412m.m108603p("titleTv");
            throw null;
        }
    }

    /* renamed from: c */
    public int mo5753c() {
        return 0;
    }

    /* renamed from: d */
    public int mo5754d() {
        TextView textView = this.f19923d;
        if (textView != null) {
            return !Util.isNullOrNil(textView.getText()) ? 0 : 4;
        }
        C87412m.m108603p("usernameTv");
        throw null;
    }

    /* renamed from: e */
    public String mo5755e(int i) {
        if (i != 3 && i != 4) {
            return "";
        }
        Context context = getContext();
        Object[] objArr = new Object[1];
        TextView textView = this.f19924e;
        if (textView != null) {
            objArr[0] = textView.getText();
            String string = context.getString(C0966R.string.gig, objArr);
            C87412m.m108593f(string, "context.getString(R.stri…lity_text2, titleTv.text)");
            return string;
        }
        C87412m.m108603p("titleTv");
        throw null;
    }

    public int getInputViewId() {
        return 0;
    }
}
