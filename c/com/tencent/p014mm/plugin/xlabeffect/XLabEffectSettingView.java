package com.tencent.p014mm.plugin.xlabeffect;

import ac3.C103362j1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j90.C108667e;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/xlabeffect/XLabEffectSettingView;", "Landroid/widget/FrameLayout;", "Lj90/e;", "d", "Lj90/e;", "getCameraView", "()Lj90/e;", "setCameraView", "(Lj90/e;)V", "cameraView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-xlabeffect_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView */
public final class XLabEffectSettingView extends FrameLayout {

    /* renamed from: d */
    public C108667e f318460d;

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView$f */
    public static final class C96753f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f283434d;

        /* renamed from: e */
        public final /* synthetic */ XLabEffectSettingView f283435e;

        /* renamed from: f */
        public final /* synthetic */ int f283436f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Integer, C13598b0> f283437g;

        public C96753f(TextView textView, XLabEffectSettingView xLabEffectSettingView, int i, C32226l<? super Integer, C13598b0> lVar) {
            this.f283434d = textView;
            this.f283435e = xLabEffectSettingView;
            this.f283436f = i;
            this.f283437g = lVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C87412m.m108594g(seekBar, "seekBar");
            this.f283434d.setText(this.f283435e.getResources().getString(this.f283436f, new Object[]{Integer.valueOf(i)}));
            this.f283437g.invoke(Integer.valueOf(i));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C87412m.m108594g(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C87412m.m108594g(seekBar, "seekBar");
        }
    }

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView$a */
    public static final class C106576a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XLabEffectSettingView f318461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106576a(XLabEffectSettingView xLabEffectSettingView) {
            super(1);
            this.f318461d = xLabEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f318461d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C106581a(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView$b */
    public static final class C106577b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XLabEffectSettingView f318462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106577b(XLabEffectSettingView xLabEffectSettingView) {
            super(1);
            this.f318462d = xLabEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f318462d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C106582b(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView$c */
    public static final class C106578c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XLabEffectSettingView f318463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106578c(XLabEffectSettingView xLabEffectSettingView) {
            super(1);
            this.f318463d = xLabEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f318463d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C106583c(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView$d */
    public static final class C106579d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XLabEffectSettingView f318464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106579d(XLabEffectSettingView xLabEffectSettingView) {
            super(1);
            this.f318464d = xLabEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f318464d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C106584d(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView$e */
    public static final class C106580e extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ XLabEffectSettingView f318465d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106580e(XLabEffectSettingView xLabEffectSettingView) {
            super(1);
            this.f318465d = xLabEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f318465d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C106585e(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XLabEffectSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.a1e, this);
        C103362j1 j1Var = C103362j1.f304817a;
        mo153294a(C0966R.C0970id.lv5, C0966R.C0970id.lv6, C0966R.string.lpd, C103362j1.f304818b, new C106576a(this));
        mo153294a(C0966R.C0970id.luz, C0966R.C0970id.f359613lv0, C0966R.string.lpa, C103362j1.f304819c, new C106577b(this));
        mo153294a(C0966R.C0970id.f359614lv1, C0966R.C0970id.f359615lv2, C0966R.string.lpb, C103362j1.f304820d, new C106578c(this));
        mo153294a(C0966R.C0970id.f359616lv3, C0966R.C0970id.lv4, C0966R.string.lpc, C103362j1.f304821e, new C106579d(this));
        mo153294a(C0966R.C0970id.lux, C0966R.C0970id.luy, C0966R.string.lp_, C103362j1.f304822f, new C106580e(this));
        setBackgroundColor(-1);
    }

    /* renamed from: a */
    public final void mo153294a(int i, int i2, int i3, int i4, C32226l<? super Integer, C13598b0> lVar) {
        View findViewById = findViewById(i);
        C87412m.m108593f(findViewById, "findViewById(seekBarId)");
        SeekBar seekBar = (SeekBar) findViewById;
        View findViewById2 = findViewById(i2);
        C87412m.m108593f(findViewById2, "findViewById(textViewId)");
        TextView textView = (TextView) findViewById2;
        textView.setText(getResources().getString(i3, new Object[]{Integer.valueOf(i4)}));
        seekBar.setProgress(i4);
        seekBar.setOnSeekBarChangeListener(new C96753f(textView, this, i3, lVar));
    }

    public final C108667e getCameraView() {
        return this.f318460d;
    }

    public final void setCameraView(C108667e eVar) {
        this.f318460d = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public XLabEffectSettingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public XLabEffectSettingView(Context context) {
        this(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
    }
}
