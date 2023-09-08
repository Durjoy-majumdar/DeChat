package com.tencent.p014mm.plugin.brandservice.p028ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import yr3.C112481c;
import yr3.C79150a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u001b\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¨\u0006 "}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout;", "Landroid/widget/RelativeLayout;", "", "maxLines", "Lrx3/b0;", "setMaxLines", "", "hide", "setCollapseButtonHideWhenExpanded", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "getContextTextView", "Landroid/widget/TextView;", "getCollapseButton", "", "collapseText", "setCollapseText", "expandText", "setExpandText", "enableExpand", "setEnableExpand", "", "content", "setContent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout */
public final class MPCollapseTextLayout extends RelativeLayout {

    /* renamed from: y */
    public static final /* synthetic */ int f312064y = 0;

    /* renamed from: d */
    public String f312065d = "";

    /* renamed from: e */
    public boolean f312066e;

    /* renamed from: f */
    public boolean f312067f;

    /* renamed from: g */
    public int f312068g = 5;

    /* renamed from: h */
    public Context f312069h;

    /* renamed from: i */
    public MMNeat7extView f312070i;

    /* renamed from: j */
    public TextView f312071j;

    /* renamed from: n */
    public TextView f312072n;

    /* renamed from: o */
    public int f312073o;

    /* renamed from: p */
    public int f312074p;

    /* renamed from: q */
    public int f312075q;

    /* renamed from: r */
    public boolean f312076r;

    /* renamed from: s */
    public boolean f312077s;

    /* renamed from: t */
    public int f312078t;

    /* renamed from: u */
    public String f312079u = "";

    /* renamed from: v */
    public String f312080v = "";

    /* renamed from: w */
    public int f312081w;

    /* renamed from: x */
    public boolean f312082x;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout$a */
    public interface C105111a {
        /* renamed from: a */
        void mo149399a(C79150a aVar);

        /* renamed from: b */
        void mo149400b(int i);

        /* renamed from: c */
        void mo149401c(int i);
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout$b */
    public static final class C105112b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPCollapseTextLayout f312083d;

        public C105112b(MPCollapseTextLayout mPCollapseTextLayout) {
            this.f312083d = mPCollapseTextLayout;
        }

        public final void run() {
            TextView textView = this.f312083d.f312071j;
            if (textView != null) {
                textView.setVisibility(0);
            }
            MPCollapseTextLayout mPCollapseTextLayout = this.f312083d;
            TextView textView2 = mPCollapseTextLayout.f312071j;
            if (textView2 != null) {
                textView2.setText(mPCollapseTextLayout.f312065d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout$c */
    public static final class C105113c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPCollapseTextLayout f312084d;

        public C105113c(MPCollapseTextLayout mPCollapseTextLayout) {
            this.f312084d = mPCollapseTextLayout;
        }

        public final void run() {
            MMNeat7extView mMNeat7extView = this.f312084d.f312070i;
            if (mMNeat7extView != null) {
                mMNeat7extView.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout$d */
    public static final class C105114d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MPCollapseTextLayout f312085d;

        public C105114d(MPCollapseTextLayout mPCollapseTextLayout) {
            this.f312085d = mPCollapseTextLayout;
        }

        public final void run() {
            ViewParent parent;
            MPCollapseTextLayout mPCollapseTextLayout = this.f312085d;
            int i = MPCollapseTextLayout.f312064y;
            mPCollapseTextLayout.getClass();
            Log.m105918d("MicroMsg.MPCollapseTextLayout", "alvinluo collapseSpeicalText");
            TextView textView = mPCollapseTextLayout.f312071j;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = mPCollapseTextLayout.f312071j;
            if (textView2 != null) {
                textView2.setMaxLines(mPCollapseTextLayout.f312068g);
            }
            TextView textView3 = mPCollapseTextLayout.f312071j;
            if (textView3 != null) {
                textView3.setText(mPCollapseTextLayout.f312065d);
            }
            TextView textView4 = mPCollapseTextLayout.f312072n;
            if (textView4 != null) {
                textView4.setPadding(0, 0, 0, 0);
            }
            MMNeat7extView mMNeat7extView = mPCollapseTextLayout.f312070i;
            if (mMNeat7extView != null) {
                mMNeat7extView.setVisibility(8);
            }
            TextView textView5 = mPCollapseTextLayout.f312072n;
            ViewGroup.LayoutParams layoutParams = textView5 != null ? textView5.getLayoutParams() : null;
            if (layoutParams != null && (layoutParams instanceof RelativeLayout.LayoutParams)) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(12);
                layoutParams2.removeRule(3);
                layoutParams2.addRule(3, C0966R.C0970id.bsl);
            }
            TextView textView6 = mPCollapseTextLayout.f312072n;
            if (textView6 != null && (parent = textView6.getParent()) != null) {
                parent.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.widget.MPCollapseTextLayout$e */
    public static final class C105115e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MPCollapseTextLayout f312086d;

        /* renamed from: e */
        public final /* synthetic */ int f312087e;

        public C105115e(MPCollapseTextLayout mPCollapseTextLayout, int i, C105111a aVar) {
            this.f312086d = mPCollapseTextLayout;
            this.f312087e = i;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout$processContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MPCollapseTextLayout mPCollapseTextLayout = this.f312086d;
            if (!mPCollapseTextLayout.f312066e) {
                MMNeat7extView mMNeat7extView = mPCollapseTextLayout.f312070i;
                if (mMNeat7extView != null) {
                    mMNeat7extView.setMaxLines(Integer.MAX_VALUE);
                }
                TextView textView = mPCollapseTextLayout.f312071j;
                if (textView != null) {
                    textView.setMaxLines(Integer.MAX_VALUE);
                }
                MMNeat7extView mMNeat7extView2 = mPCollapseTextLayout.f312070i;
                C79150a i = mMNeat7extView2 != null ? mMNeat7extView2.mo154990i(mPCollapseTextLayout.f312081w, Integer.MAX_VALUE) : null;
                mPCollapseTextLayout.mo149387d(i, mPCollapseTextLayout.f312081w, i != null ? ((NeatLayout) i).f319992L : 0);
            } else {
                mPCollapseTextLayout.mo149384a(mPCollapseTextLayout.f312068g);
                mPCollapseTextLayout.mo149385b(mPCollapseTextLayout.f312081w);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/widget/MPCollapseTextLayout$processContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPCollapseTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f312069h = context;
        mo149388e(attributeSet);
    }

    /* renamed from: a */
    public final void mo149384a(int i) {
        if (!this.f312077s) {
            MMNeat7extView mMNeat7extView = this.f312070i;
            if (mMNeat7extView != null) {
                mMNeat7extView.setMaxLines(i);
                return;
            }
            return;
        }
        TextView textView = this.f312071j;
        if (textView != null) {
            textView.setMaxLines(i);
        }
    }

    /* renamed from: b */
    public final void mo149385b(int i) {
        if (this.f312070i != null) {
            this.f312066e = false;
            TextView textView = this.f312072n;
            if (textView != null) {
                textView.setText(this.f312080v);
            }
            boolean z = this.f312077s;
            MMNeat7extView mMNeat7extView = this.f312070i;
            ViewGroup.LayoutParams layoutParams = null;
            C79150a i2 = mMNeat7extView != null ? mMNeat7extView.mo154990i(i, Integer.MAX_VALUE) : null;
            float e = i2 != null ? ((C112481c) i2).mo109125e(this.f312068g - 1) : 0.0f;
            Log.m105927v("MicroMsg.MPCollapseTextLayout", "alvinluo doCollapseText lastLineRight: %f, textWidth: %d, mCollapseButtonWidth: %d, content: %s", Float.valueOf(e), Integer.valueOf(i), Integer.valueOf(this.f312073o), this.f312065d);
            if (mo149386c(e, i)) {
                if (!z) {
                    MMNeat7extView mMNeat7extView2 = this.f312070i;
                    if (mMNeat7extView2 != null) {
                        mMNeat7extView2.mo154992j(TextUtils.TruncateAt.END, 0.0f);
                    }
                } else {
                    post(new C105112b(this));
                }
            } else if (!z) {
                float max = (((float) this.f312073o) + ((float) this.f312075q)) - Math.max(((float) i) - e, 0.0f);
                MMNeat7extView mMNeat7extView3 = this.f312070i;
                if (mMNeat7extView3 != null) {
                    mMNeat7extView3.mo154992j(TextUtils.TruncateAt.END, max);
                }
                Log.m105927v("MicroMsg.MPCollapseTextLayout", "alvinluo doCollapseText ellipsize: %f", Float.valueOf(max));
                post(new C105113c(this));
            } else {
                post(new C105114d(this));
                return;
            }
            TextView textView2 = this.f312072n;
            if (textView2 != null) {
                layoutParams = textView2.getLayoutParams();
            }
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(3);
                layoutParams2.addRule(12);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo149386c(float f, int i) {
        TextView textView = this.f312072n;
        int measuredWidth = textView != null ? textView.getMeasuredWidth() : this.f312074p;
        this.f312073o = measuredWidth;
        float f2 = (float) (i - measuredWidth);
        if (this.f312077s) {
            f2 = (((float) i) * 3.0f) / 4.0f;
        }
        return f < f2;
    }

    /* renamed from: d */
    public final void mo149387d(C79150a aVar, int i, int i2) {
        if (this.f312076r) {
            TextView textView = this.f312072n;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (aVar != null) {
            this.f312066e = true;
            TextView textView2 = this.f312072n;
            if (textView2 != null) {
                textView2.setText(this.f312079u);
            }
            TextView textView3 = this.f312072n;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            float e = aVar.mo109125e(i2 - 1);
            Log.m105927v("MicroMsg.MPCollapseTextLayout", "alvinluo expandText textWidth: %d, realLines: %d, maxLines: %d, last line right: %f", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f312068g), Float.valueOf(e));
            TextView textView4 = this.f312072n;
            ViewGroup.LayoutParams layoutParams = textView4 != null ? textView4.getLayoutParams() : null;
            boolean z = layoutParams instanceof RelativeLayout.LayoutParams;
            if (z && !mo149386c(e, i)) {
                Log.m105926v("MicroMsg.MPCollapseTextLayout", "alvinluo expandText collapseButton show be at below");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.removeRule(12);
                layoutParams2.removeRule(3);
                layoutParams2.addRule(3, this.f312077s ? C0966R.C0970id.bsl : C0966R.C0970id.bsk);
            } else if (z) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams3.removeRule(3);
                layoutParams3.addRule(12);
            }
        }
    }

    /* renamed from: e */
    public final void mo149388e(AttributeSet attributeSet) {
        setClipChildren(false);
        setClipToPadding(false);
        View inflate = C85868k2.m106137b(this.f312069h).inflate(C0966R.C0971layout.b4d, this);
        this.f312070i = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.bsk);
        this.f312072n = (TextView) inflate.findViewById(C0966R.C0970id.bg_);
        this.f312071j = (TextView) inflate.findViewById(C0966R.C0970id.bsl);
        TextView textView = this.f312072n;
        if (textView != null) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int b = C76577a.m92151b(this.f312069h, 30);
        this.f312074p = b;
        TextView textView2 = this.f312072n;
        if (textView2 != null) {
            b = textView2.getMeasuredWidth();
        }
        this.f312073o = b;
        this.f312078t = (int) (C76577a.m92156g(this.f312069h) * 2.5f);
        this.f312075q = getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        String string = this.f312069h.getResources().getString(C0966R.string.f360192ap3);
        C87412m.m108593f(string, "mContext.resources.getSt…_line_item_text_collapse)");
        this.f312079u = string;
        String string2 = this.f312069h.getResources().getString(C0966R.string.ap5);
        C87412m.m108593f(string2, "mContext.resources.getSt…time_line_item_text_more)");
        this.f312080v = string2;
    }

    /* renamed from: f */
    public final void mo149389f(CharSequence charSequence, boolean z, boolean z2, C105111a aVar) {
        TextView textView;
        MMNeat7extView mMNeat7extView = this.f312070i;
        C79150a i = mMNeat7extView != null ? mMNeat7extView.mo154990i(this.f312081w, Integer.MAX_VALUE) : null;
        if (aVar != null) {
            aVar.mo149399a(i);
        }
        int i2 = i != null ? ((NeatLayout) i).f319992L : 0;
        Log.m105927v("MicroMsg.MPCollapseTextLayout", "alvinluo processContent width: %d, line: %d, specialText: %b, expand: %b, enableExpand: %b, hashCode: %d", Integer.valueOf(this.f312081w), Integer.valueOf(i2), Boolean.valueOf(this.f312077s), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(hashCode()));
        if (!this.f312077s) {
            MMNeat7extView mMNeat7extView2 = this.f312070i;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.setVisibility(0);
            }
            TextView textView2 = this.f312071j;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TextView textView3 = this.f312072n;
            if (textView3 != null) {
                textView3.setPadding(0, 0, 0, this.f312078t);
            }
        } else {
            MMNeat7extView mMNeat7extView3 = this.f312070i;
            if (mMNeat7extView3 != null) {
                mMNeat7extView3.setVisibility(8);
            }
            TextView textView4 = this.f312071j;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            TextView textView5 = this.f312072n;
            if (textView5 != null) {
                textView5.setPadding(0, 0, 0, 0);
            }
        }
        int i3 = this.f312068g;
        if (i2 > i3) {
            if (!z) {
                mo149384a(i3);
            }
            TextView textView6 = this.f312072n;
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            if (z) {
                mo149387d(i, this.f312081w, i2);
            } else {
                mo149385b(this.f312081w);
            }
            if (z2 && (textView = this.f312072n) != null) {
                textView.setOnClickListener(new C105115e(this, i2, aVar));
                return;
            }
            return;
        }
        mo149384a(Integer.MAX_VALUE);
        TextView textView7 = this.f312072n;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
    }

    public final TextView getCollapseButton() {
        return this.f312072n;
    }

    public final MMNeat7extView getContextTextView() {
        return this.f312070i;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Log.m105927v("MicroMsg.MPCollapseTextLayout", "alvinluo onMeasure width: %d, viewWidth: %d", Integer.valueOf(getMeasuredWidth()), Integer.valueOf(this.f312081w));
        if (this.f312081w != getMeasuredWidth()) {
            this.f312081w = getMeasuredWidth();
            if (this.f312082x) {
                Log.m105926v("MicroMsg.MPCollapseTextLayout", "alvinluo onMeasure needProcessContent");
                this.f312082x = false;
                mo149389f(this.f312065d, this.f312066e, this.f312067f, (C105111a) null);
            }
        }
    }

    public final void setCollapseButtonHideWhenExpanded(boolean z) {
        this.f312076r = z;
    }

    public final void setCollapseText(String str) {
        C87412m.m108594g(str, "collapseText");
        this.f312079u = str;
    }

    public final void setContent(CharSequence charSequence) {
        C87412m.m108594g(charSequence, "content");
        if (!this.f312065d.equals(charSequence) || this.f312066e || this.f312067f) {
            this.f312065d = charSequence.toString();
            MMNeat7extView mMNeat7extView = this.f312070i;
            if (mMNeat7extView != null) {
                mMNeat7extView.setMaxLines(this.f312068g);
            }
            MMNeat7extView mMNeat7extView2 = this.f312070i;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.mo104279b(charSequence);
            }
            TextView textView = this.f312071j;
            if (textView != null) {
                textView.setMaxLines(this.f312068g);
            }
            TextView textView2 = this.f312071j;
            if (textView2 != null) {
                textView2.setText(charSequence);
            }
            MMNeat7extView mMNeat7extView3 = this.f312070i;
            this.f312077s = mMNeat7extView3 != null ? mMNeat7extView3.f320006e : false;
            this.f312066e = false;
            this.f312067f = false;
            if (this.f312081w != 0) {
                this.f312082x = false;
                mo149389f(charSequence, false, false, (C105111a) null);
                return;
            }
            this.f312082x = true;
            return;
        }
        Log.m105927v("MicroMsg.MPCollapseTextLayout", "alvinluo setContent ignore %s", this.f312065d, charSequence);
    }

    public final void setEnableExpand(boolean z) {
        this.f312067f = z;
    }

    public final void setExpandText(String str) {
        C87412m.m108594g(str, "expandText");
        this.f312080v = str;
    }

    public final void setMaxLines(int i) {
        this.f312068g = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPCollapseTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f312069h = context;
        mo149388e(attributeSet);
    }
}
