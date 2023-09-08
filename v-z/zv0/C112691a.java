package zv0;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: zv0.a */
public final class C112691a {

    /* renamed from: a */
    public long f337412a = -1;

    /* renamed from: b */
    public List<BallInfo> f337413b;

    /* renamed from: a */
    public void mo164421a(int i) {
        int i2;
        int i3;
        List<BallInfo> list = this.f337413b;
        String str = (list == null || list.isEmpty()) ? null : this.f337413b.get(0).f311683H.f311724p;
        long nowMilliSecond = Util.nowMilliSecond();
        StringBuilder sb = new StringBuilder();
        List<BallInfo> list2 = this.f337413b;
        if (list2 != null) {
            i3 = list2.size();
            i2 = 0;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = this.f337413b.get(i4).f311679D;
                if (i5 == 8 || i5 == 4) {
                    i5 = 4;
                }
                i2 |= i5;
                if (i4 != 0) {
                    sb.append(";");
                }
                sb.append(this.f337413b.get(i4).f311683H.f311723o);
            }
        } else {
            i3 = 0;
            i2 = 0;
        }
        String format = String.format("%s,%d,%d,%d,%d,%d,%s", new Object[]{str, Long.valueOf(this.f337412a), Long.valueOf(nowMilliSecond), Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2), sb.toString()});
        Log.m105927v("MicroMsg.FloatMenuReportHelper", "whenHideMenu reportStr:%s", format);
        C115669n.INSTANCE.kvStat(17603, format);
        this.f337412a = -1;
    }
}
