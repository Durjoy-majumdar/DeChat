package lh0;

import com.tencent.p014mm.autogen.mmdata.rpt.CalendarFinderSyncStatisticsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.CalendarStatisticsStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import jh0.C33573a;
import oa1.C117731d;

/* renamed from: lh0.f */
public class C21436f {

    /* renamed from: a */
    public String f60672a = null;

    /* renamed from: a */
    public long mo33600a(String str, long j) {
        MultiProcessMMKV b = mo33601b();
        return b == null ? j : b.getLong(str, j);
    }

    /* renamed from: b */
    public final MultiProcessMMKV mo33601b() {
        int h = C117731d.m166007c().mo182446h();
        if (h == 0) {
            return null;
        }
        String str = h + "_" + "WxExptAiMMKV";
        if (!Util.isEqual(this.f60672a, str)) {
            Log.m105925i("MicroMsg.AiMMKV", "%s get mmkv change uin old[%s] new[%s]", hashCode() + "", this.f60672a, str);
            this.f60672a = str;
        }
        return MultiProcessMMKV.getMMKV(this.f60672a);
    }

    /* renamed from: c */
    public CalendarStatisticsStruct mo33602c(String str) {
        int c = C33573a.m40127c(Util.nowMilliSecond());
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        String str2 = "";
        MultiProcessMMKV b = vx02.f92371i.mo33601b();
        if (b != null) {
            str2 = b.getString(str, str2);
        }
        CalendarStatisticsStruct calendarStatisticsStruct = !Util.isNullOrNil(str2) ? new CalendarStatisticsStruct(str2) : null;
        if (calendarStatisticsStruct != null && calendarStatisticsStruct.f48234d == ((long) c)) {
            return calendarStatisticsStruct;
        }
        CalendarStatisticsStruct calendarStatisticsStruct2 = new CalendarStatisticsStruct();
        calendarStatisticsStruct2.f48234d = (long) c;
        return calendarStatisticsStruct2;
    }

    /* renamed from: d */
    public CalendarFinderSyncStatisticsStruct mo33603d(String str) {
        int c = C33573a.m40127c(Util.nowMilliSecond());
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        String str2 = "";
        MultiProcessMMKV b = vx02.f92371i.mo33601b();
        if (b != null) {
            str2 = b.getString(str, str2);
        }
        CalendarFinderSyncStatisticsStruct calendarFinderSyncStatisticsStruct = !Util.isNullOrNil(str2) ? new CalendarFinderSyncStatisticsStruct(str2) : null;
        if (calendarFinderSyncStatisticsStruct != null && calendarFinderSyncStatisticsStruct.f48229d == ((long) c)) {
            return calendarFinderSyncStatisticsStruct;
        }
        CalendarFinderSyncStatisticsStruct calendarFinderSyncStatisticsStruct2 = new CalendarFinderSyncStatisticsStruct();
        calendarFinderSyncStatisticsStruct2.f48229d = (long) c;
        return calendarFinderSyncStatisticsStruct2;
    }

    /* renamed from: e */
    public void mo33604e(String str, long j) {
        MultiProcessMMKV b = mo33601b();
        if (b != null) {
            b.putLong(str, j);
        }
    }

    /* renamed from: f */
    public void mo33605f(String str, CalendarStatisticsStruct calendarStatisticsStruct) {
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        C21436f fVar = vx02.f92371i;
        String p = calendarStatisticsStruct.mo1005p();
        MultiProcessMMKV b = fVar.mo33601b();
        if (b != null) {
            b.putString(str, p);
        }
    }
}
