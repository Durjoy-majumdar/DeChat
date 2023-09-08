package com.tencent.p014mm.plugin.finder.conv;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C75359b0;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/conv/FinderConvChooseTipsView;", "Landroid/widget/FrameLayout;", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.conv.FinderConvChooseTipsView */
public final class FinderConvChooseTipsView extends FrameLayout {

    /* renamed from: d */
    public final String f12551d = "FinderLiveVisitorRoleChooserPlugin";

    /* renamed from: com.tencent.mm.plugin.finder.conv.FinderConvChooseTipsView$a */
    public static final class C2318a extends C75359b0 {

        /* renamed from: d */
        public final /* synthetic */ FinderConvChooseTipsView f12552d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2318a(int i, int i2, FinderConvChooseTipsView finderConvChooseTipsView) {
            super(i, i2);
            this.f12552d = finderConvChooseTipsView;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/conv/FinderConvChooseTipsView$initView$clickable$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "v");
            Log.m105924i(this.f12552d.getTAG(), "choose role click");
            Intent intent = new Intent();
            if (this.f12552d.getContext() instanceof Activity) {
                intent.putExtra("KEY_CAN_MODEI_ALIAS", false);
                intent.putExtra("KEY_SOURCE", 2);
                Context context = this.f12552d.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((C58684b) C86312j.m106911c(C58684b.class)).mo13294xt((Activity) context, intent, 1010, false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/conv/FinderConvChooseTipsView$initView$clickable$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderConvChooseTipsView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo2246a();
    }

    /* renamed from: a */
    public final void mo2246a() {
        TextView textView = (TextView) C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a_2, this).findViewById(C0966R.C0970id.mz7);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        CharSequence text = textView.getText();
        String string = getContext().getString(C0966R.string.d4i);
        C87412m.m108593f(string, "context.getString(R.stri…oose_role_tips_span_part)");
        C87412m.m108593f(text, "str");
        int E = C112550d0.m153769E(text, string, 0, false, 6, (Object) null);
        if (E < 0) {
            E = 0;
        }
        int length = string.length() + E;
        int length2 = text.length();
        if (length > length2) {
            length = length2;
        }
        newSpannable.setSpan(new C2318a(getContext().getResources().getColor(C0966R.color.a1d), getContext().getResources().getColor(C0966R.color.a1f), this), E, length, 18);
        textView.setText(newSpannable, TextView.BufferType.SPANNABLE);
        textView.setTextSize(1, (textView.getContext().getResources().getDimension(C0966R.dimen.f3879hn) * C76577a.m92165p(getContext())) / C76577a.m92156g(getContext()));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final String getTAG() {
        return this.f12551d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderConvChooseTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        mo2246a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderConvChooseTipsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        mo2246a();
    }
}
