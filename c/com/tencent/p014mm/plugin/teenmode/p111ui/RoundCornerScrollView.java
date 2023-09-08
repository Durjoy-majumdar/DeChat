package com.tencent.p014mm.plugin.teenmode.p111ui;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ScrollView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/RoundCornerScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "plugin-teenmode_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.teenmode.ui.RoundCornerScrollView */
public final class RoundCornerScrollView extends ScrollView {

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.RoundCornerScrollView$a */
    public static final class C71351a extends ViewOutlineProvider {

        /* renamed from: a */
        public float f206659a;

        public C71351a(float f) {
            this.f206659a = f;
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            if (view != null) {
                view.getDrawingRect(rect);
            }
            Rect rect2 = new Rect(0, 0, (rect.right - rect.left) - 0, (rect.bottom - rect.top) - 0);
            if (outline != null) {
                outline.setRoundRect(rect2, this.f206659a);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RoundCornerScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundCornerScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        new Path();
        new RectF();
        setClipToOutline(true);
        setOutlineProvider(new C71351a((float) C76577a.m92151b(MMApplicationContext.getContext(), 8)));
        setBackground(getContext().getResources().getDrawable(C0966R.C0969drawable.ar7));
    }
}
