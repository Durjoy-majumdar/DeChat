package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import b90.C92211a;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j90.C108667e;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/VendorEffectSettingView;", "Landroid/widget/FrameLayout;", "Lj90/e;", "d", "Lj90/e;", "getCameraView", "()Lj90/e;", "setCameraView", "(Lj90/e;)V", "cameraView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView */
public final class VendorEffectSettingView extends FrameLayout {

    /* renamed from: d */
    public C108667e f273015d;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView$a */
    public static final class C94428a extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VendorEffectSettingView f273016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94428a(VendorEffectSettingView vendorEffectSettingView) {
            super(1);
            this.f273016d = vendorEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f273016d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C94432a(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView$b */
    public static final class C94429b extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VendorEffectSettingView f273017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94429b(VendorEffectSettingView vendorEffectSettingView) {
            super(1);
            this.f273017d = vendorEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f273017d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C94433b(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView$c */
    public static final class C94430c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ VendorEffectSettingView f273018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94430c(VendorEffectSettingView vendorEffectSettingView) {
            super(1);
            this.f273018d = vendorEffectSettingView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C108667e cameraView = this.f273018d.getCameraView();
            if (cameraView != null) {
                cameraView.mo148312q(new C94434c(intValue));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView$d */
    public static final class C94431d implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ TextView f273019d;

        /* renamed from: e */
        public final /* synthetic */ VendorEffectSettingView f273020e;

        /* renamed from: f */
        public final /* synthetic */ int f273021f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Integer, C13598b0> f273022g;

        public C94431d(TextView textView, VendorEffectSettingView vendorEffectSettingView, int i, C32226l<? super Integer, C13598b0> lVar) {
            this.f273019d = textView;
            this.f273020e = vendorEffectSettingView;
            this.f273021f = i;
            this.f273022g = lVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C87412m.m108594g(seekBar, "seekBar");
            this.f273019d.setText(this.f273020e.getResources().getString(this.f273021f, new Object[]{Integer.valueOf(i)}));
            this.f273022g.invoke(Integer.valueOf(i));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            C87412m.m108594g(seekBar, "seekBar");
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            C87412m.m108594g(seekBar, "seekBar");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VendorEffectSettingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.f6676lh, this);
        mo129884a(C0966R.C0970id.l3n, C0966R.C0970id.l3o, C0966R.string.f360164aj0, C92211a.f263930b, 5, new C94428a(this));
        mo129884a(C0966R.C0970id.l3p, C0966R.C0970id.l3q, C0966R.string.aj5, C92211a.f263931c, 100, new C94429b(this));
        mo129884a(C0966R.C0970id.l3r, C0966R.C0970id.l3s, C0966R.string.aj6, C92211a.f263932d, 100, new C94430c(this));
    }

    /* renamed from: a */
    public final void mo129884a(int i, int i2, int i3, int i4, int i5, C32226l<? super Integer, C13598b0> lVar) {
        View findViewById = findViewById(i);
        C87412m.m108593f(findViewById, "findViewById(seekBarId)");
        SeekBar seekBar = (SeekBar) findViewById;
        View findViewById2 = findViewById(i2);
        C87412m.m108593f(findViewById2, "findViewById(textViewId)");
        TextView textView = (TextView) findViewById2;
        textView.setText(getResources().getString(i3, new Object[]{Integer.valueOf(i4)}));
        seekBar.setProgress(i4);
        seekBar.setMax(i5);
        seekBar.setOnSeekBarChangeListener(new C94431d(textView, this, i3, lVar));
    }

    public final C108667e getCameraView() {
        return this.f273015d;
    }

    public final void setCameraView(C108667e eVar) {
        this.f273015d = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VendorEffectSettingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
