package com.tencent.p014mm.live.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0006\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u001a\u0010\u000e\u001a\u00020\t8\u0006XD¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/live/core/view/LiveVideoView;", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "Lkotlin/Function2;", "", "Lrx3/b0;", "callback", "setPreviewTouchListener", "alpha", "setAlpha", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.core.view.LiveVideoView */
public final class LiveVideoView extends TXCloudVideoView {

    /* renamed from: d */
    public final String f157166d;

    /* renamed from: e */
    public long f157167e;

    /* renamed from: f */
    public C32227p<? super Float, ? super Float, C13598b0> f157168f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveVideoView(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        C87412m.m108594g(context, "context");
        this.f157166d = "LiveVideoView";
        this.f157167e = -1;
    }

    public void addVideoView(TextureView textureView) {
        String str = this.f157166d;
        StringBuilder sb = new StringBuilder();
        sb.append("addVideoView(");
        sb.append(hashCode());
        sb.append(") TextureView:");
        sb.append(textureView != null ? textureView.hashCode() : 0);
        Log.m105924i(str, sb.toString());
        super.addVideoView(textureView);
    }

    public final String getTAG() {
        return this.f157166d;
    }

    public void onAttachedToWindow() {
        String str = this.f157166d;
        Log.m105924i(str, "onAttachedToWindow(" + hashCode() + ")!");
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        String str = this.f157166d;
        Log.m105924i(str, "onDetachedFromWindow(" + hashCode() + ")!");
        super.onDetachedFromWindow();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C32227p<? super Float, ? super Float, C13598b0> pVar;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f157168f == null) {
            return onTouchEvent;
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f157167e = System.currentTimeMillis();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f157167e > 0 && System.currentTimeMillis() - this.f157167e <= ((long) ViewConfiguration.getTapTimeout()) && (pVar = this.f157168f) != null) {
                pVar.invoke(Float.valueOf(motionEvent.getRawX()), Float.valueOf(motionEvent.getRawY()));
            }
            this.f157167e = -1;
        }
        return true;
    }

    public void removeVideoView() {
        String str = this.f157166d;
        Log.m105924i(str, "removeVideoView(" + hashCode() + ")!");
        super.removeVideoView();
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        String str = this.f157166d;
        Log.m105924i(str, "setAlpha alpha:" + f);
    }

    public final void setPreviewTouchListener(C32227p<? super Float, ? super Float, C13598b0> pVar) {
        this.f157168f = pVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LiveVideoView(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            gy3.C87412m.m108593f(r2, r0)
            r0 = 0
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.core.view.LiveVideoView.<init>(android.content.Context):void");
    }
}
