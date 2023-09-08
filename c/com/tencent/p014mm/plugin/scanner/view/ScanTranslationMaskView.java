package com.tencent.p014mm.plugin.scanner.view;

import android.animation.Animator;
import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.model.C106072h1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;
import vl2.C111557w;
import yk2.C112475a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/view/ScanTranslationMaskView;", "Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "Landroid/hardware/Camera$PreviewCallback;", "", "bottomHeight", "Lrx3/b0;", "setBottomExtraHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scan-translation_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.view.ScanTranslationMaskView */
public final class ScanTranslationMaskView extends BaseScanMaskView<BaseScanRequest> implements Camera.PreviewCallback {

    /* renamed from: v */
    public View f316155v;

    /* renamed from: w */
    public boolean f316156w;

    /* renamed from: x */
    public final long[] f316157x;

    /* renamed from: y */
    public long f316158y;

    /* renamed from: z */
    public C106072h1 f316159z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanTranslationMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: h */
    public void mo151678h(Animator.AnimatorListener animatorListener) {
        synchronized (Boolean.valueOf(this.f316156w)) {
            this.f316156w = true;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        C111557w.m152065a(this, 1.0f, 0.0f, 200, animatorListener);
    }

    /* renamed from: k */
    public void mo151840k(int i) {
        super.mo151840k(i);
        Log.m105925i("MicroMsg.ScanTranslationMaskView", "alvinluo onNetworkChange state: %d, currentNetworkAvailable: %b", Integer.valueOf(i), Boolean.valueOf(getCurrentNetworkAvailable()));
        mo151869v();
    }

    /* renamed from: m */
    public void mo151680m(boolean z) {
        super.mo151680m(z);
        View view = this.f316155v;
        if (view != null) {
            view.setEnabled(true);
            this.f316157x[0] = System.currentTimeMillis();
            setVisibility(0);
            if (getCurrentNetworkAvailable()) {
                C111557w.m152065a(this, 0.0f, 1.0f, 200, (Animator.AnimatorListener) null);
                return;
            }
            return;
        }
        C87412m.m108603p("captureBtn");
        throw null;
    }

    /* renamed from: n */
    public void mo151733n() {
        Log.m105924i("MicroMsg.ScanTranslationMaskView", "alvinluo onResume");
        this.f316157x[0] = System.currentTimeMillis();
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Object[] objArr = new Object[1];
        boolean z = false;
        objArr[0] = bArr != null ? Integer.valueOf(bArr.length) : null;
        Log.m105925i("MicroMsg.ScanTranslationMaskView", "alvinluo onPreviewFrame data size: %d", objArr);
        if (bArr != null) {
            if (bArr.length == 0) {
                z = true;
            }
            if ((true ^ z) && getScanCamera() != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("key_translate_yuv_byte_array", bArr);
                C112475a scanCamera = getScanCamera();
                C87412m.m108591d(scanCamera);
                bundle.putParcelable("key_translate_camera_resolution", scanCamera.f324142d);
                C112475a scanCamera2 = getScanCamera();
                C87412m.m108591d(scanCamera2);
                bundle.putInt("key_translate_camera_rotation", scanCamera2.f324147i);
                bundle.putLong("key_translate_capture_time", this.f316158y);
                C106072h1 h1Var = this.f316159z;
                if (h1Var != null) {
                    h1Var.mo360a(System.currentTimeMillis(), bundle);
                }
            }
        }
    }

    /* renamed from: r */
    public void mo151683r() {
        super.mo151683r();
        synchronized (Boolean.valueOf(this.f316156w)) {
            this.f316156w = false;
            C13598b0 b0Var = C13598b0.f38549a;
        }
        mo151869v();
    }

    public void setBottomExtraHeight(int i) {
        super.setBottomExtraHeight(i);
        View view = this.f316155v;
        if (view == null) {
            C87412m.m108603p("captureBtn");
            throw null;
        } else if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = C76577a.m92151b(getContext(), 24) + getMBottomExtraHeight();
            }
            view.setLayoutParams(layoutParams);
        } else {
            C87412m.m108603p("captureBtn");
            throw null;
        }
    }

    /* renamed from: v */
    public final void mo151869v() {
        if (getCurrentNetworkAvailable()) {
            View view = this.f316155v;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("captureBtn");
            throw null;
        }
        View view3 = this.f316155v;
        if (view3 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("captureBtn");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanTranslationMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316157x = new long[2];
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.b4y, this);
        C87412m.m108593f(inflate, "view");
        View findViewById = inflate.findViewById(C0966R.C0970id.j19);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.scan_capture_btn)");
        this.f316155v = findViewById;
        findViewById.setEnabled(false);
        View view = this.f316155v;
        if (view != null) {
            view.setOnClickListener(new C106136f(this));
            this.f316159z = new C106072h1(context);
            return;
        }
        C87412m.m108603p("captureBtn");
        throw null;
    }
}
