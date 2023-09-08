package p269xe;

import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114444c;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p1177ce.C113287a;
import p212oe.C117750b;
import p212oe.b$$f;
import p269xe.C91179e;
import p981ie.C87705i;

/* renamed from: xe.d$$j$$m */
public final /* synthetic */ class d$$j$$m implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114490k0.C114491a.C114492a f355635a;

    public /* synthetic */ d$$j$$m(C114490k0.C114491a.C114492a aVar) {
        this.f355635a = aVar;
    }

    public final void accept(Object obj) {
        String str;
        List list;
        C114490k0.C114491a.C114492a aVar = this.f355635a;
        C113287a aVar2 = (C113287a) obj;
        if (aVar.f343208d >= C117750b.m166045c() && aVar.mo173690b() && b$$f.m166058c() && ((Integer) ((C114444c.C114446c) aVar.f343207c).f343122d.f343211a).intValue() > 0) {
            long max = Math.max(1, aVar.f343208d / 60000);
            String f = C118872b.m167609f();
            String str2 = "";
            int intValue = ((Integer) ((C114444c.C114446c) aVar.f343207c).f343122d.f343211a).intValue();
            int intValue2 = ((Integer) ((C114444c.C114446c) aVar.f343207c).f343123e.f343211a).intValue();
            List<ITEM> list2 = ((C114444c.C114446c) aVar.f343207c).f343126h.f343212a;
            if (!list2.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<ITEM> it = list2.iterator();
                while (true) {
                    str = "default";
                    if (!it.hasNext()) {
                        break;
                    }
                    C114444c.C28653b bVar = (C114444c.C28653b) ((C114490k0.C114491a.C114494b.C114495a) it.next()).f343210a;
                    if (!TextUtils.isEmpty(bVar.f78625g)) {
                        str = bVar.f78625g;
                    }
                    List list3 = (List) linkedHashMap.get(str);
                    if (list3 == null) {
                        list3 = new ArrayList();
                        linkedHashMap.put(str, list3);
                    }
                    list3.add(bVar);
                }
                int i = 0;
                for (String str3 : linkedHashMap.keySet()) {
                    if (!str3.equals(str) && (list = (List) linkedHashMap.get(str3)) != null && list.size() > i && !str2.equals(str3)) {
                        i = list.size();
                        str2 = str3;
                    }
                }
            }
            Log.m105924i("Matrix.battery.BatteryReporter", "#statAlarmSnapshot, count = " + intValue);
            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
            C91179e.C91181b.m114437a(0, 5, f, "", aVar2.mo165839c(), aVar2.mo165840d(), "avgAlarm", ((long) intValue) / max, "traceCount", ((long) intValue2) / max, "duringMin", max, aVar2.f338971i, str2, (long) aVar2.f338964b, (long) aVar2.f338967e, (long) aVar2.f338972j, "");
        }
    }
}
