package ft2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Map;
import vr2.C102236a0;

/* renamed from: ft2.g */
public class C97982g implements Runnable {
    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$9");
        for (Map.Entry value : C97979c.m126543b().entrySet()) {
            c$$e c__e = (c$$e) value.getValue();
            c__e.f287364g = C102236a0.m134712G();
            Log.m105919d("MicroMsg.SnsTimeLineVendingAdapter", "report big pic click, picNum:%d, clickPicNum:%d, firstClickPos:%d, networkType:%d, id:%s", Integer.valueOf(c__e.f287358a), Integer.valueOf(c__e.f287359b.size()), Integer.valueOf(c__e.f287363f), Integer.valueOf(c__e.f287364g), c__e.f287365h);
            Iterator<Integer> it = c__e.f287360c.iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + it.next() + "|";
            }
            if (str.length() >= 2) {
                str = str.substring(0, str.length() - 1);
            }
            Iterator<Integer> it4 = c__e.f287361d.iterator();
            String str2 = "";
            while (it4.hasNext()) {
                str2 = str2 + it4.next() + "|";
            }
            if (str2.length() >= 2) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            Iterator<Integer> it5 = c__e.f287362e.iterator();
            String str3 = "";
            while (it5.hasNext()) {
                str3 = str3 + it5.next() + "|";
            }
            if (str3.length() >= 2) {
                str3 = str3.substring(0, str3.length() - 1);
            }
            C115669n.INSTANCE.mo160131h(11599, Integer.valueOf(c__e.f287358a), Integer.valueOf(c__e.f287359b.size()), Integer.valueOf(c__e.f287363f), Integer.valueOf(c__e.f287364g), 0, c__e.f287365h, Long.valueOf(c__e.f287366i), Integer.valueOf(c__e.f287367j), 0, 0, Integer.valueOf(c__e.f287368k), Integer.valueOf(c__e.f287369l), 0, str, str2, str3, 0, "", Integer.valueOf(c__e.f287370m));
        }
        C97979c.m126543b().clear();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter$9");
    }
}
