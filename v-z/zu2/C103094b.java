package zu2;

import android.content.Context;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.previewimageview.C96142a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zu2.b */
public abstract class C103094b extends C103093a {

    /* renamed from: f */
    public Context f304200f;

    /* renamed from: g */
    public ArrayList<Object> f304201g = new ArrayList<>();

    /* renamed from: h */
    public int f304202h;

    public C103094b(Context context, int i) {
        this.f304200f = context;
        this.f304202h = i;
    }

    /* renamed from: g */
    public void mo133754g(List<?> list) {
        SnsMethodCalculate.markStartTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        C96142a aVar = (C96142a) this;
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        SnsMethodCalculate.markStartTimeMs("clearStableIdMap", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        aVar.f304199e.clear();
        SnsMethodCalculate.markEndTimeMs("clearStableIdMap", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        aVar.f304201g.clear();
        aVar.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        aVar.f280862o = false;
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        SnsMethodCalculate.markStartTimeMs("addAllStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        for (Object f : list) {
            mo142829f(f);
        }
        SnsMethodCalculate.markEndTimeMs("addAllStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        this.f304201g.addAll(list);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("set", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
    }

    public int getColumnCount() {
        SnsMethodCalculate.markStartTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        int i = this.f304202h;
        SnsMethodCalculate.markEndTimeMs("getColumnCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return i;
    }

    public int getCount() {
        SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        int size = this.f304201g.size();
        SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return size;
    }

    public Object getItem(int i) {
        SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        Object obj = this.f304201g.get(i);
        SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return obj;
    }
}
