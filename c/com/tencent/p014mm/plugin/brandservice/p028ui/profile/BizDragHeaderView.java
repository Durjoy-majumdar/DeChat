package com.tencent.p014mm.plugin.brandservice.p028ui.profile;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView */
public final class BizDragHeaderView extends View {

    /* renamed from: d */
    public Path f197566d = new Path();

    /* renamed from: e */
    public RectF f197567e = new RectF();

    /* renamed from: f */
    public int f197568f = mo94614a(8);

    /* renamed from: g */
    public int f197569g = mo94614a(40);

    /* renamed from: h */
    public int f197570h = mo94614a(4);

    /* renamed from: i */
    public final int f197571i = getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_1);

    public BizDragHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RectF rectF = this.f197567e;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) this.f197569g;
        rectF.bottom = (float) this.f197570h;
    }

    /* renamed from: a */
    public final int mo94614a(int i) {
        return C76577a.m92151b(getContext(), i);
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        this.f197566d.reset();
        Path path = this.f197566d;
        RectF rectF = this.f197567e;
        int i = this.f197568f;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
        canvas.clipPath(this.f197566d);
        canvas.drawColor(this.f197571i);
    }

    public BizDragHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        RectF rectF = this.f197567e;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) this.f197569g;
        rectF.bottom = (float) this.f197570h;
    }
}
