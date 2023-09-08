package com.tencent.p014mm.plugin.finder.replay.bullet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import te3.C51343t41;
import wo1.C66154f;
import wo1.C66155g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/bullet/LiveDanmakuView;", "Landroid/view/TextureView;", "", "d", "Z", "isReuse", "()Z", "setReuse", "(Z)V", "Landroid/view/View;", "f", "Landroid/view/View;", "getAnchorView", "()Landroid/view/View;", "setAnchorView", "(Landroid/view/View;)V", "anchorView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.bullet.LiveDanmakuView */
public final class LiveDanmakuView extends TextureView {

    /* renamed from: d */
    public boolean f160793d;

    /* renamed from: e */
    public C66154f f160794e;

    /* renamed from: f */
    public View f160795f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDanmakuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo78677a(C66154f fVar, C66155g gVar, List<? extends C51343t41> list) {
        C66154f fVar2;
        C87412m.m108594g(fVar, "manager");
        C87412m.m108594g(gVar, "config");
        this.f160794e = fVar;
        boolean z = true;
        if (!fVar.mo90194a()) {
            z = false;
        }
        if (!z && (fVar2 = this.f160794e) != null) {
            fVar2.mo90195b(list);
        }
    }

    public final View getAnchorView() {
        return this.f160795f;
    }

    public void onDetachedFromWindow() {
        C66154f fVar;
        super.onDetachedFromWindow();
        if (!this.f160793d && (fVar = this.f160794e) != null) {
            fVar.onDetach();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r8, r0)
            int r0 = r8.getAction()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x003a
            wo1.f r0 = r7.f160794e
            if (r0 == 0) goto L_0x0036
            zj.j r0 = r0.mo90198f()
            if (r0 == 0) goto L_0x0036
            android.graphics.Point r3 = new android.graphics.Point
            float r4 = r8.getX()
            int r4 = (int) r4
            float r5 = r8.getY()
            int r5 = (int) r5
            float r6 = r7.getY()
            int r6 = (int) r6
            int r5 = r5 + r6
            r3.<init>(r4, r5)
            zj.e r0 = r0.f192019d
            boolean r0 = r0.mo90814a(r3, r2)
            if (r0 != r1) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            r2 = 1
        L_0x003a:
            if (r2 == 0) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            boolean r1 = super.onTouchEvent(r8)
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.bullet.LiveDanmakuView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAnchorView(View view) {
        this.f160795f = view;
    }

    public final void setReuse(boolean z) {
        this.f160793d = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDanmakuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
