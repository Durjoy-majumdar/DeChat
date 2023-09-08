package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import go3.C76003c;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import ye1.C15982w;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderChooseNewsView;", "Landroid/widget/RelativeLayout;", "Landroid/widget/CheckBox;", "e", "Lrx3/g;", "getCheckBox", "()Landroid/widget/CheckBox;", "checkBox", "Landroid/widget/TextView;", "f", "getDescText", "()Landroid/widget/TextView;", "descText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderChooseNewsView */
public final class FinderChooseNewsView extends RelativeLayout {

    /* renamed from: d */
    public C15982w f17635d = C15982w.m14890a(LayoutInflater.from(getContext()), this, true);

    /* renamed from: e */
    public final C13601g f17636e = C36568h.m40985a(new C4204x0(this));

    /* renamed from: f */
    public final C13601g f17637f = C36568h.m40985a(new C4215y0(this));

    public FinderChooseNewsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        SpannableString spannableString = new SpannableString(getContext().getResources().getString(C0966R.string.lq8));
        Drawable e = C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_like, C76577a.m92153d(getContext(), C0966R.color.FG_2));
        Drawable e2 = C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_fire, C76577a.m92153d(getContext(), C0966R.color.FG_2));
        e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        C76003c cVar = new C76003c(e, 1);
        C76003c cVar2 = new C76003c(e2, 1);
        SpannableString spannableString2 = spannableString;
        int D = C112550d0.m153768D(spannableString2, 8197, 0, false, 6, (Object) null);
        int D2 = C112550d0.m153768D(spannableString2, 8198, 0, false, 6, (Object) null);
        spannableString.setSpan(cVar, D, D + 1, 34);
        spannableString.setSpan(cVar2, D2, D2 + 1, 34);
        getDescText().setText(spannableString);
    }

    private final CheckBox getCheckBox() {
        return (CheckBox) this.f17636e.getValue();
    }

    private final TextView getDescText() {
        return (TextView) this.f17637f.getValue();
    }

    /* renamed from: a */
    public final boolean mo4423a() {
        return getCheckBox().isChecked();
    }

    public FinderChooseNewsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp);
        SpannableString spannableString = new SpannableString(getContext().getResources().getString(C0966R.string.lq8));
        Drawable e = C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_like, C76577a.m92153d(getContext(), C0966R.color.FG_2));
        Drawable e2 = C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_fire, C76577a.m92153d(getContext(), C0966R.color.FG_2));
        e.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        e2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        C76003c cVar = new C76003c(e, 1);
        C76003c cVar2 = new C76003c(e2, 1);
        SpannableString spannableString2 = spannableString;
        int D = C112550d0.m153768D(spannableString2, 8197, 0, false, 6, (Object) null);
        int D2 = C112550d0.m153768D(spannableString2, 8198, 0, false, 6, (Object) null);
        spannableString.setSpan(cVar, D, D + 1, 34);
        spannableString.setSpan(cVar2, D2, D2 + 1, 34);
        getDescText().setText(spannableString);
    }
}
