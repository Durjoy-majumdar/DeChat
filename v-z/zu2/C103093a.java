package zu2;

import android.widget.BaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashMap;

/* renamed from: zu2.a */
public abstract class C103093a extends BaseAdapter implements C103095c {

    /* renamed from: d */
    public int f304198d = 0;

    /* renamed from: e */
    public HashMap<Object, Integer> f304199e = new HashMap<>();

    /* renamed from: f */
    public void mo142829f(Object obj) {
        SnsMethodCalculate.markStartTimeMs("addStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        HashMap<Object, Integer> hashMap = this.f304199e;
        int i = this.f304198d;
        this.f304198d = i + 1;
        hashMap.put(obj, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("addStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
    }

    public final long getItemId(int i) {
        SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        if (i < 0 || i >= this.f304199e.size()) {
            SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
            return -1;
        }
        long intValue = (long) this.f304199e.get(((C103094b) this).getItem(i)).intValue();
        SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        return intValue;
    }

    public final boolean hasStableIds() {
        SnsMethodCalculate.markStartTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        SnsMethodCalculate.markEndTimeMs("hasStableIds", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        return true;
    }
}
