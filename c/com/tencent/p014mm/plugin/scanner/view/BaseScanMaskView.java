package com.tencent.p014mm.plugin.scanner.view;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.scanner.api.BaseScanRequest;
import com.tencent.p014mm.plugin.scanner.model.C71004i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.qbar.ScanDecodeFrameData;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import yk2.C112475a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001b\b\u0016\u0012\u0006\u0010r\u001a\u00020q\u0012\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vB#\b\u0016\u0012\u0006\u0010r\u001a\u00020q\u0012\b\u0010t\u001a\u0004\u0018\u00010s\u0012\u0006\u0010w\u001a\u00020\r¢\u0006\u0004\bu\u0010xJ\u0010\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\rH\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00105\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00109\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R$\u0010@\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010D\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=\"\u0004\bC\u0010?R\"\u0010H\u001a\u00020E8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010S\u001a\u0004\u0018\u00010L8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010Z\u001a\u00020\r8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010^\u001a\u00020E8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b[\u0010G\u001a\u0004\b\\\u0010I\"\u0004\b]\u0010KR\"\u0010b\u001a\u00020\r8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b_\u0010U\u001a\u0004\b`\u0010W\"\u0004\ba\u0010YR\"\u0010d\u001a\u00020E8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bc\u0010G\u001a\u0004\bd\u0010I\"\u0004\be\u0010KR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010\u0016¨\u0006y"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "T", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/scanner/view/a;", "Landroid/graphics/Rect;", "rect", "Lrx3/b0;", "setPreviewRect", "setScanRect", "Lcom/tencent/qbar/ScanDecodeFrameData;", "frameData", "setDecodeSuccessFrameData", "", "scanSource", "setScanSource", "bottomHeight", "setBottomExtraHeight", "Landroid/view/View;", "getTargetSuccessMarkView", "request", "setScanRequest", "(Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;)V", "Lcom/tencent/mm/plugin/scanner/model/i;", "d", "Lcom/tencent/mm/plugin/scanner/model/i;", "getScanUIModel", "()Lcom/tencent/mm/plugin/scanner/model/i;", "setScanUIModel", "(Lcom/tencent/mm/plugin/scanner/model/i;)V", "scanUIModel", "Landroid/app/Activity;", "e", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "activity", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getScanTips", "()Landroid/widget/TextView;", "setScanTips", "(Landroid/widget/TextView;)V", "scanTips", "g", "Landroid/view/View;", "getFlashSwitcher", "()Landroid/view/View;", "setFlashSwitcher", "(Landroid/view/View;)V", "flashSwitcher", "h", "getMGalleryButton", "setMGalleryButton", "mGalleryButton", "i", "Landroid/graphics/Rect;", "getMPreviewRect", "()Landroid/graphics/Rect;", "setMPreviewRect", "(Landroid/graphics/Rect;)V", "mPreviewRect", "j", "getMScanRect", "setMScanRect", "mScanRect", "", "n", "Z", "isFlashShow", "()Z", "setFlashShow", "(Z)V", "Lyk2/a;", "o", "Lyk2/a;", "getScanCamera", "()Lyk2/a;", "setScanCamera", "(Lyk2/a;)V", "scanCamera", "p", "I", "getMScanSource", "()I", "setMScanSource", "(I)V", "mScanSource", "q", "getCurrentNetworkAvailable", "setCurrentNetworkAvailable", "currentNetworkAvailable", "r", "getMBottomExtraHeight", "setMBottomExtraHeight", "mBottomExtraHeight", "s", "isViewDestroy", "setViewDestroy", "t", "Lcom/tencent/qbar/ScanDecodeFrameData;", "getFrameData", "()Lcom/tencent/qbar/ScanDecodeFrameData;", "setFrameData", "(Lcom/tencent/qbar/ScanDecodeFrameData;)V", "u", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "getRequest", "()Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "setRequest", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scan-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.view.BaseScanMaskView */
public abstract class BaseScanMaskView<T extends BaseScanRequest> extends RelativeLayout implements C106135a<T> {

    /* renamed from: d */
    public C71004i f316122d;

    /* renamed from: e */
    public Activity f316123e;

    /* renamed from: f */
    public TextView f316124f;

    /* renamed from: g */
    public View f316125g;

    /* renamed from: h */
    public View f316126h;

    /* renamed from: i */
    public Rect f316127i;

    /* renamed from: j */
    public Rect f316128j;

    /* renamed from: n */
    public boolean f316129n;

    /* renamed from: o */
    public C112475a f316130o;

    /* renamed from: p */
    public int f316131p;

    /* renamed from: q */
    public boolean f316132q;

    /* renamed from: r */
    public int f316133r;

    /* renamed from: s */
    public boolean f316134s;

    /* renamed from: t */
    public ScanDecodeFrameData f316135t;

    /* renamed from: u */
    public BaseScanRequest f316136u;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseScanMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: j */
    private final void m142751j() {
        this.f316132q = C86709a0.m107524d().mo123467m() == 6 || C86709a0.m107524d().mo123467m() == 4;
    }

    public final Activity getActivity() {
        return this.f316123e;
    }

    public final boolean getCurrentNetworkAvailable() {
        return this.f316132q;
    }

    public final View getFlashSwitcher() {
        return this.f316125g;
    }

    public final ScanDecodeFrameData getFrameData() {
        return this.f316135t;
    }

    public final int getMBottomExtraHeight() {
        return this.f316133r;
    }

    public final View getMGalleryButton() {
        return this.f316126h;
    }

    public final Rect getMPreviewRect() {
        return this.f316127i;
    }

    public final Rect getMScanRect() {
        return this.f316128j;
    }

    public final int getMScanSource() {
        return this.f316131p;
    }

    public final BaseScanRequest getRequest() {
        return this.f316136u;
    }

    public final C112475a getScanCamera() {
        return this.f316130o;
    }

    public final TextView getScanTips() {
        return this.f316124f;
    }

    public final C71004i getScanUIModel() {
        return this.f316122d;
    }

    public View getTargetSuccessMarkView() {
        return null;
    }

    /* renamed from: h */
    public void mo151678h(Animator.AnimatorListener animatorListener) {
        Log.m105919d("MicroMsg.BaseScanMaskView", "alvinluo onViewDestroy hashCode: %d", Integer.valueOf(hashCode()));
        this.f316134s = true;
    }

    /* renamed from: i */
    public void mo151679i(View view) {
    }

    /* renamed from: k */
    public void mo151840k(int i) {
        Log.m105925i("MicroMsg.BaseScanMaskView", "alvinluo onNetworkChange state: %d", Integer.valueOf(i));
        m142751j();
    }

    /* renamed from: l */
    public void mo151732l() {
    }

    /* renamed from: m */
    public void mo151680m(boolean z) {
        Log.m105925i("MicroMsg.BaseScanMaskView", "alvinluo onPreviewReady hashCode: %d, isSwitchTab: %b", Integer.valueOf(hashCode()), Boolean.valueOf(z));
    }

    /* renamed from: n */
    public void mo151733n() {
    }

    /* renamed from: o */
    public void mo151681o(Object obj, C71029e eVar) {
        C87412m.m108594g(obj, "data");
    }

    /* renamed from: p */
    public void mo151735p(boolean z) {
    }

    /* renamed from: q */
    public void mo151736q(boolean z) {
    }

    /* renamed from: r */
    public void mo151683r() {
        Log.m105925i("MicroMsg.BaseScanMaskView", "alvinluo onViewReady hashCode: %d", Integer.valueOf(hashCode()));
        this.f316134s = false;
    }

    public void release() {
    }

    /* renamed from: s */
    public void mo151685s(boolean z, DialogInterface.OnCancelListener onCancelListener) {
    }

    public final void setActivity(Activity activity) {
        this.f316123e = activity;
    }

    public void setBottomExtraHeight(int i) {
        this.f316133r = i;
    }

    public final void setCurrentNetworkAvailable(boolean z) {
        this.f316132q = z;
    }

    public void setDecodeSuccessFrameData(ScanDecodeFrameData scanDecodeFrameData) {
        this.f316135t = scanDecodeFrameData;
    }

    public final void setFlashShow(boolean z) {
        this.f316129n = z;
    }

    public final void setFlashSwitcher(View view) {
        this.f316125g = view;
    }

    public final void setFrameData(ScanDecodeFrameData scanDecodeFrameData) {
        this.f316135t = scanDecodeFrameData;
    }

    public final void setMBottomExtraHeight(int i) {
        this.f316133r = i;
    }

    public final void setMGalleryButton(View view) {
        this.f316126h = view;
    }

    public final void setMPreviewRect(Rect rect) {
        this.f316127i = rect;
    }

    public final void setMScanRect(Rect rect) {
        this.f316128j = rect;
    }

    public final void setMScanSource(int i) {
        this.f316131p = i;
    }

    public final void setPreviewRect(Rect rect) {
        this.f316127i = rect;
        postInvalidate();
    }

    public final void setRequest(BaseScanRequest baseScanRequest) {
        this.f316136u = baseScanRequest;
    }

    public final void setScanCamera(C112475a aVar) {
        this.f316130o = aVar;
    }

    public final void setScanRect(Rect rect) {
        this.f316128j = rect;
    }

    public void setScanRequest(T t) {
        this.f316136u = t;
    }

    public void setScanSource(int i) {
        this.f316131p = i;
    }

    public final void setScanTips(TextView textView) {
        this.f316124f = textView;
    }

    public final void setScanUIModel(C71004i iVar) {
        this.f316122d = iVar;
    }

    public final void setViewDestroy(boolean z) {
        this.f316134s = z;
    }

    /* renamed from: t */
    public final void mo151859t(boolean z) {
        BaseScanRequest baseScanRequest;
        int i = 0;
        Log.m105925i("MicroMsg.BaseScanMaskView", "alvinluo showScanTips show: %s, flash: %s", Boolean.valueOf(z), Boolean.valueOf(this.f316129n));
        if (this.f316129n && z) {
            TextView textView = this.f316124f;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else if (!z || (baseScanRequest = this.f316136u) == null) {
            TextView textView2 = this.f316124f;
            if (textView2 != null) {
                if (!z) {
                    i = 8;
                }
                textView2.setVisibility(i);
            }
        } else {
            TextView textView3 = this.f316124f;
            if (textView3 != null) {
                C87412m.m108591d(baseScanRequest);
                if (baseScanRequest.f248897e || !z) {
                    i = 8;
                }
                textView3.setVisibility(i);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseScanMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        m142751j();
        Log.m105925i("MicroMsg.BaseScanMaskView", "alvinluo init networkAvailable: %b", Boolean.valueOf(this.f316132q));
    }
}
