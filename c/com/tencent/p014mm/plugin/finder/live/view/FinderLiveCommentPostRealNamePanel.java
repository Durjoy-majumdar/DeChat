package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import qo3.C101218e0;
import rx3.C13598b0;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u000b\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "tv", "Lrx3/b0;", "setLicenseText", "Lkotlin/Function3;", "Landroid/content/Context;", "Landroid/content/Intent;", "", "callback", "setWebviewForwardCallback", "", "height", "setDialogHeight", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel */
public final class FinderLiveCommentPostRealNamePanel extends LinearLayout {

    /* renamed from: d */
    public C32228q<? super Context, ? super Intent, ? super Integer, C13598b0> f15210d;

    /* renamed from: e */
    public C32226l<? super Boolean, C13598b0> f15211e;

    /* renamed from: f */
    public C101218e0 f15212f;

    /* renamed from: g */
    public boolean f15213g;

    /* renamed from: h */
    public String f15214h = "";

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$a */
    public static final class C3189a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveCommentPostRealNamePanel f15215a;

        public C3189a(FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel) {
            this.f15215a = finderLiveCommentPostRealNamePanel;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f15215a;
            finderLiveCommentPostRealNamePanel.f15213g = z;
            if (z) {
                C101218e0 e0Var = finderLiveCommentPostRealNamePanel.f15212f;
                if (e0Var != null) {
                    e0Var.mo140676v(0);
                } else {
                    C87412m.m108603p("bottomDialog");
                    throw null;
                }
            } else {
                C101218e0 e0Var2 = finderLiveCommentPostRealNamePanel.f15212f;
                if (e0Var2 != null) {
                    e0Var2.mo140676v(1);
                } else {
                    C87412m.m108603p("bottomDialog");
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$b */
    public static final class C3190b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ FinderLiveCommentPostRealNamePanel f15216a;

        /* renamed from: b */
        public final /* synthetic */ Context f15217b;

        public C3190b(FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel, Context context) {
            this.f15216a = finderLiveCommentPostRealNamePanel;
            this.f15217b = context;
        }

        /* renamed from: a */
        public final void mo2001a() {
            FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f15216a;
            if (finderLiveCommentPostRealNamePanel.f15213g && !Util.isNullOrNil(finderLiveCommentPostRealNamePanel.f15214h)) {
                Intent intent = new Intent();
                intent.putExtra("open_custom_style_url", true);
                intent.putExtra("forceHideShare", true);
                intent.putExtra("show_native_web_view", true);
                intent.putExtra("rawUrl", this.f15216a.f15214h);
                intent.putExtra("screen_orientation", 1);
                C32228q<? super Context, ? super Intent, ? super Integer, C13598b0> qVar = this.f15216a.f15210d;
                if (qVar != null) {
                    qVar.invoke(this.f15217b, intent, 10000);
                }
                ((C54116w) C86312j.m106911c(C54116w.class)).xy0(C54067f0.C0068p0.AuthEnter);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveCommentPostRealNamePanel$c */
    public static final class C3191c extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveCommentPostRealNamePanel f15218d;

        public C3191c(FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel) {
            this.f15218d = finderLiveCommentPostRealNamePanel;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
            FinderLiveCommentPostRealNamePanel finderLiveCommentPostRealNamePanel = this.f15218d;
            C32228q<? super Context, ? super Intent, ? super Integer, C13598b0> qVar = finderLiveCommentPostRealNamePanel.f15210d;
            if (qVar != null) {
                Context context = finderLiveCommentPostRealNamePanel.getContext();
                C87412m.m108593f(context, "context");
                qVar.invoke(context, intent, null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveCommentPostRealNamePanel$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(Color.parseColor("#7D90A9"));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentPostRealNamePanel(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo3251a(context);
    }

    private final void setLicenseText(TextView textView) {
        String string = textView.getContext().getResources().getString(C0966R.string.dfk);
        C87412m.m108593f(string, "tv.context.resources.get…inder_live_anchor_iterms)");
        String string2 = textView.getContext().getResources().getString(C0966R.string.djy, new Object[]{string});
        C87412m.m108593f(string2, "tv.context.resources.get…alname_license, firstStr)");
        String format = String.format(string2, Arrays.copyOf(new Object[0], 0));
        C87412m.m108593f(format, "format(format, *args)");
        int E = C112550d0.m153769E(format, string, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new C3191c(this), E, string.length() + E, 33);
        textView.setHighlightColor(textView.getContext().getResources().getColor(17170445));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
    }

    /* renamed from: a */
    public final void mo3251a(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.afq, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.fnc);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.license_checkbox)");
        ((CheckBox) findViewById).setOnCheckedChangeListener(new C3189a(this));
        View findViewById2 = inflate.findViewById(C0966R.C0970id.fnd);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.license_content)");
        setLicenseText((TextView) findViewById2);
        C101218e0 e0Var = new C101218e0(context, 2, 1);
        this.f15212f = e0Var;
        e0Var.mo140677w(context.getResources().getString(C0966R.string.g7g));
        C101218e0 e0Var2 = this.f15212f;
        if (e0Var2 != null) {
            e0Var2.f296375F = new C3190b(this, context);
            e0Var2.mo140676v(1);
            C101218e0 e0Var3 = this.f15212f;
            if (e0Var3 != null) {
                e0Var3.mo140663j(this);
            } else {
                C87412m.m108603p("bottomDialog");
                throw null;
            }
        } else {
            C87412m.m108603p("bottomDialog");
            throw null;
        }
    }

    public final void setDialogHeight(double d) {
        C101218e0 e0Var = this.f15212f;
        if (e0Var != null) {
            e0Var.mo140674t((int) d);
        } else {
            C87412m.m108603p("bottomDialog");
            throw null;
        }
    }

    public final void setWebviewForwardCallback(C32228q<? super Context, ? super Intent, ? super Integer, C13598b0> qVar) {
        C87412m.m108594g(qVar, "callback");
        this.f15210d = qVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentPostRealNamePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo3251a(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveCommentPostRealNamePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
        mo3251a(context);
    }
}
