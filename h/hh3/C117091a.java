package hh3;

import android.os.Message;
import android.os.SystemClock;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.mmdata.rpt.SystemServiceHookStatusStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sx3.C110818d0;

/* renamed from: hh3.a */
public final class C117091a implements MMHandler.Callback {

    /* renamed from: d */
    public static final C117091a f350859d = new C117091a();

    public final boolean handleMessage(Message message) {
        C87412m.m108594g(message, "msg");
        CopyOnWriteArrayList<SystemServiceHookStatusStruct> copyOnWriteArrayList = C117092b.f350862c;
        if (copyOnWriteArrayList.size() > 100) {
            ArrayList<Long> arrayList = C117092b.f350864e;
            arrayList.add(Long.valueOf(SystemClock.uptimeMillis()));
            if (arrayList.size() == 5) {
                if (((Number) C110818d0.m150923U(arrayList)).longValue() - ((Number) C110818d0.m150914L(arrayList)).longValue() < C117092b.f350865f) {
                    SystemServiceHookStatusStruct systemServiceHookStatusStruct = new SystemServiceHookStatusStruct();
                    systemServiceHookStatusStruct.f343841d = 0;
                    systemServiceHookStatusStruct.f343848k = systemServiceHookStatusStruct.mo86045b("ProcessName", MMApplicationContext.getProcessName(), true);
                    systemServiceHookStatusStruct.f343849l = systemServiceHookStatusStruct.mo86045b("ErrStack", "too freq!; report 5 times in 2 seconds", true);
                    systemServiceHookStatusStruct.f343844g = systemServiceHookStatusStruct.mo86045b("CurrentActivity", AppForegroundDelegate.INSTANCE.mo174210c(), true);
                    systemServiceHookStatusStruct.mo86054n();
                    Log.m105924i(C117092b.f350861b, "reportTooFrequency");
                }
                arrayList.clear();
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(copyOnWriteArrayList);
            copyOnWriteArrayList.clear();
            Iterator it = arrayList2.iterator();
            C87412m.m108593f(it, "tempReportList.iterator()");
            while (it.hasNext()) {
                Object next = it.next();
                C87412m.m108593f(next, "i.next()");
                SystemServiceHookStatusStruct systemServiceHookStatusStruct2 = (SystemServiceHookStatusStruct) next;
                int i = systemServiceHookStatusStruct2.f343841d;
                String mD5String = i == 0 ? MD5Util.getMD5String(systemServiceHookStatusStruct2.f343849l) : i == 1 ? MD5Util.getMD5String(systemServiceHookStatusStruct2.f343845h) : null;
                if (mD5String != null) {
                    HashMap<String, SystemServiceHookStatusStruct> hashMap = C117092b.f350863d;
                    SystemServiceHookStatusStruct systemServiceHookStatusStruct3 = hashMap.get(mD5String);
                    if (systemServiceHookStatusStruct3 == null) {
                        hashMap.put(mD5String, systemServiceHookStatusStruct2);
                    } else {
                        systemServiceHookStatusStruct3.f343847j = systemServiceHookStatusStruct3.mo86045b("MethodOffsetTime", systemServiceHookStatusStruct3.f343847j + ';' + systemServiceHookStatusStruct2.f343847j, true);
                        it.remove();
                    }
                }
            }
            C117092b.f350863d.clear();
            String str = C117092b.f350861b;
            Log.m105924i(str, "report，size = " + arrayList2.size());
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                ((SystemServiceHookStatusStruct) it4.next()).mo86054n();
            }
            arrayList2.clear();
        }
        return false;
    }
}
