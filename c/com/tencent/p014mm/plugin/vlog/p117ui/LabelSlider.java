package com.tencent.p014mm.plugin.vlog.p117ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import sx3.C110818d0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/LabelSlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "color", "Lrx3/b0;", "setTrackColor", "count", "setLabelCount", "", "", "labelList", "setLabels", "index", "setSelection", "Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;", "A", "Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;", "getCallback", "()Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;", "setCallback", "(Lcom/tencent/mm/plugin/vlog/ui/LabelSlider$b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.LabelSlider */
public final class LabelSlider extends ConstraintLayout {

    /* renamed from: A */
    public C71571b f207400A;

    /* renamed from: v */
    public int f207401v;

    /* renamed from: w */
    public final SliderTrackView f207402w;

    /* renamed from: x */
    public final LinkedList<Guideline> f207403x;

    /* renamed from: y */
    public final LinkedList<TextView> f207404y;

    /* renamed from: z */
    public final LinkedList<CharSequence> f207405z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.LabelSlider$a */
    public static final class C71570a implements C71571b {

        /* renamed from: a */
        public final /* synthetic */ LabelSlider f207406a;

        public C71570a(LabelSlider labelSlider) {
            this.f207406a = labelSlider;
        }

        /* renamed from: a */
        public void mo98710a(int i) {
            C71571b callback = this.f207406a.getCallback();
            if (callback != null) {
                callback.mo98710a(i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.LabelSlider$b */
    public interface C71571b {
        /* renamed from: a */
        void mo98710a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.LabelSlider$c */
    public static final class C71572c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LabelSlider f207407d;

        public C71572c(LabelSlider labelSlider) {
            this.f207407d = labelSlider;
        }

        public final void run() {
            this.f207407d.mo98704r();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LabelSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f207401v = 5;
        this.f207403x = new LinkedList<>();
        this.f207404y = new LinkedList<>();
        this.f207405z = new LinkedList<>();
        SliderTrackView sliderTrackView = new SliderTrackView(context, (AttributeSet) null);
        this.f207402w = sliderTrackView;
        Drawable drawable = context.getDrawable(C0966R.C0969drawable.c37);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, drawable != null ? drawable.getIntrinsicHeight() : 48);
        layoutParams.f44464s = 0;
        layoutParams.f44462q = 0;
        layoutParams.f44449h = 0;
        addView(sliderTrackView, layoutParams);
        sliderTrackView.setThumbDrawable(drawable);
        sliderTrackView.setCallback(new C71570a(this));
    }

    public final C71571b getCallback() {
        return this.f207400A;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C71572c(this));
    }

    /* renamed from: r */
    public final void mo98704r() {
        this.f207402w.setPointCount(this.f207401v);
        this.f207402w.setStartOffset(getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3753d4));
        for (TextView removeView : this.f207404y) {
            removeView(removeView);
        }
        this.f207404y.clear();
        for (Guideline removeView2 : this.f207403x) {
            removeView(removeView2);
        }
        this.f207403x.clear();
        if (getWidth() > 0) {
            int i = 0;
            for (T next : this.f207402w.getTrackPoint()) {
                int i2 = i + 1;
                if (i >= 0) {
                    float floatValue = ((Number) next).floatValue();
                    Guideline guideline = new Guideline(getContext());
                    guideline.setId(View.generateViewId());
                    ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
                    layoutParams.f44462q = 0;
                    layoutParams.f44461p = 0;
                    layoutParams.f44426R = 1;
                    layoutParams.f44435a = (int) floatValue;
                    addView(guideline, layoutParams);
                    this.f207403x.add(guideline);
                    TextView textView = new TextView(getContext());
                    textView.setText((CharSequence) C110818d0.m150917O(this.f207405z, i));
                    textView.setTextColor(-855638017);
                    textView.setGravity(17);
                    ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(-2, -2);
                    layoutParams2.f44451i = this.f207402w.getId();
                    layoutParams2.f44462q = guideline.getId();
                    layoutParams2.f44464s = guideline.getId();
                    layoutParams2.f44455k = 0;
                    addView(textView, layoutParams2);
                    this.f207404y.add(textView);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    public final void setCallback(C71571b bVar) {
        this.f207400A = bVar;
    }

    public final void setLabelCount(int i) {
        this.f207401v = i;
        mo98704r();
    }

    public final void setLabels(List<? extends CharSequence> list) {
        C87412m.m108594g(list, "labelList");
        this.f207405z.clear();
        this.f207405z.addAll(list);
        int i = 0;
        for (T next : this.f207404y) {
            int i2 = i + 1;
            if (i >= 0) {
                ((TextView) next).setText((CharSequence) C110818d0.m150917O(this.f207405z, i));
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public final void setSelection(int i) {
        this.f207402w.setSelection(i);
    }

    public final void setTrackColor(int i) {
        this.f207402w.setTrackColor(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LabelSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
