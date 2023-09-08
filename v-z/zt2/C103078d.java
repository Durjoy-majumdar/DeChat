package zt2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.unread.ImproveUnreadUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import nj3.C76912y0;

/* renamed from: zt2.d */
public final class C103078d implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ ImproveUnreadUIC f304137d;

    public C103078d(ImproveUnreadUIC improveUnreadUIC) {
        this.f304137d = improveUnreadUIC;
    }

    public final boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$setDebugPrintInfo$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$setDebugPrintInfo$1");
        Log.m105924i("MicroMsg.Improve.UnreadUIC", "-------start print unread list count:" + ImproveUnreadUIC.m122724c3(this.f304137d).size() + "--------");
        int i = 0;
        for (Map.Entry entry : ImproveUnreadUIC.m122724c3(this.f304137d).entrySet()) {
            String str = ((C103080g) entry.getValue()).mo142790b() ? "indicator" : "";
            Log.m105924i("MicroMsg.Improve.UnreadUIC", i + " feed:" + ((String) entry.getKey()) + " expose:" + ((C103080g) entry.getValue()).mo142789a() + ' ' + str);
            i++;
        }
        C76912y0.m92768g(this.f304137d.getContext(), "日志打印成功！");
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC$setDebugPrintInfo$1");
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/unread/ImproveUnreadUIC$setDebugPrintInfo$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
