package zu2;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.DynamicGridView;

/* renamed from: zu2.j */
public class C103102j implements TypeEvaluator<Rect> {
    public C103102j(DynamicGridView dynamicGridView) {
    }

    /* renamed from: a */
    public int mo142844a(int i, int i2, float f) {
        SnsMethodCalculate.markStartTimeMs("interpolate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        int i3 = (int) (((float) i) + (f * ((float) (i2 - i))));
        SnsMethodCalculate.markEndTimeMs("interpolate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        return i3;
    }

    public Object evaluate(float f, Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        SnsMethodCalculate.markStartTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        Rect rect3 = new Rect(mo142844a(rect.left, rect2.left, f), mo142844a(rect.top, rect2.top, f), mo142844a(rect.right, rect2.right, f), mo142844a(rect.bottom, rect2.bottom, f));
        SnsMethodCalculate.markEndTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        SnsMethodCalculate.markEndTimeMs("evaluate", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$6");
        return rect3;
    }
}
