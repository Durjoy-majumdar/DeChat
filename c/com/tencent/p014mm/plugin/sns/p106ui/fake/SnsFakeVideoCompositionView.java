package com.tencent.p014mm.plugin.sns.p106ui.fake;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import gy3.C87412m;
import java.lang.reflect.Field;
import kotlin.Metadata;
import nj3.C100123u0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0015J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/fake/SnsFakeVideoCompositionView;", "Lcom/tencent/mm/videocomposition/play/VideoCompositionPlayView;", "Lnj3/u0;", "", "isIntercepted", "Lrx3/b0;", "setInterceptDetach", "r", "Z", "isInterceptedDetach", "()Z", "setInterceptedDetach", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView */
public final class SnsFakeVideoCompositionView extends VideoCompositionPlayView implements C100123u0 {

    /* renamed from: r */
    public boolean f164406r;

    /* renamed from: s */
    public Object f164407s;

    /* renamed from: t */
    public Object f164408t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsFakeVideoCompositionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public void destroyDrawingCache() {
        SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        super.destroyDrawingCache();
        if (this.f164406r) {
            mo81001r();
        }
        SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    /* renamed from: m */
    public final void mo80998m() {
        SnsMethodCalculate.markStartTimeMs("hookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        try {
            Log.m105924i("MicroMsg.SnsFakeVideoCompositionView", "hookInnerDetach");
            Field declaredField = TextureView.class.getDeclaredField("mLayer");
            declaredField.setAccessible(true);
            this.f164407s = declaredField.get(this);
            declaredField.set(this, (Object) null);
            Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
            declaredField2.setAccessible(true);
            this.f164408t = declaredField2.get(this);
            declaredField2.set(this, (Object) null);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsFakeVideoCompositionView", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("hookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        if (this.f164406r) {
            mo80998m();
        }
        super.onAttachedToWindow();
        if (this.f164406r) {
            mo81001r();
        }
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        if (this.f164406r) {
            mo80998m();
        } else {
            try {
                super.onDetachedFromWindow();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SnsFakeVideoCompositionView", e, "unkown error", new Object[0]);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    /* renamed from: r */
    public final void mo81001r() {
        SnsMethodCalculate.markStartTimeMs("unHookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        try {
            Log.m105924i("MicroMsg.SnsFakeVideoCompositionView", "unHookInnerDetach");
            if (this.f164407s != null) {
                Field declaredField = TextureView.class.getDeclaredField("mLayer");
                declaredField.setAccessible(true);
                declaredField.set(this, this.f164407s);
                this.f164407s = null;
            }
            if (this.f164408t != null) {
                Field declaredField2 = TextureView.class.getDeclaredField("mSurface");
                declaredField2.setAccessible(true);
                declaredField2.set(this, this.f164408t);
                this.f164408t = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SnsFakeVideoCompositionView", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("unHookInnerDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public void setInterceptDetach(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        this.f164406r = z;
        SnsMethodCalculate.markEndTimeMs("setInterceptDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    public final void setInterceptedDetach(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setInterceptedDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
        this.f164406r = z;
        SnsMethodCalculate.markEndTimeMs("setInterceptedDetach", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoCompositionView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsFakeVideoCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
