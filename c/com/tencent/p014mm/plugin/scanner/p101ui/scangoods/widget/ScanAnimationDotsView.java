package com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import kotlin.Metadata;
import tl2.C111012a;
import tl2.C111015b;
import tl2.C111016c;
import tl2.C111018d;
import tl2.C111019e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationDotsView;", "Landroid/view/View;", "Ltl2/d;", "", "duration", "Lrx3/b0;", "setDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.scangoods.widget.ScanAnimationDotsView */
public final class ScanAnimationDotsView extends View implements C111018d {

    /* renamed from: d */
    public int f315894d;

    /* renamed from: e */
    public C111019e f315895e;

    /* renamed from: f */
    public int f315896f;

    /* renamed from: g */
    public int f315897g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScanAnimationDotsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo151668a() {
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C111019e eVar = this.f315895e;
        if (eVar != null) {
            Iterator<C111016c> it = ((C111012a) eVar).f332474g.iterator();
            while (it.hasNext()) {
                it.next().mo162703e(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f315896f != getMeasuredWidth() || this.f315897g != getMeasuredHeight()) {
            this.f315896f = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.f315897g = measuredHeight;
            C111019e eVar = this.f315895e;
            if (eVar != null) {
                int i3 = this.f315896f;
                C111012a aVar = (C111012a) eVar;
                aVar.f332475h = i3;
                aVar.f332476i = measuredHeight;
                Iterator<C111016c> it = aVar.f332474g.iterator();
                while (it.hasNext()) {
                    it.next().mo162702d(i3, measuredHeight, false);
                }
            }
        }
    }

    public void setDuration(long j) {
        C111019e eVar = this.f315895e;
        if (eVar != null) {
            C111012a aVar = (C111012a) eVar;
            aVar.f332473f = j;
            Iterator<C111016c> it = aVar.f332474g.iterator();
            while (it.hasNext()) {
                it.next().setDuration(j);
            }
        }
    }

    public void startAnimation() {
        Log.m105927v("MicroMsg.ScanAnimationDotsView", "alvinluo startAnimation type: %d", Integer.valueOf(this.f315894d));
        C111019e eVar = this.f315895e;
        if (eVar != null) {
            eVar.startAnimation();
        }
    }

    public void stopAnimation() {
        Log.m105926v("MicroMsg.ScanAnimationDotsView", "alvinluo stopAnimation");
        C111019e eVar = this.f315895e;
        if (eVar != null) {
            eVar.stopAnimation();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanAnimationDotsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315894d = 1;
        this.f315895e = new C111015b(context, this);
    }
}
