package p269xe;

import android.content.Context;
import android.provider.Settings;
import com.tencent.mars.comm.NetworkSignalUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import p329d3.C86165a;
import p981ie.C117159b;

/* renamed from: xe.e$b$b$$a */
public final /* synthetic */ class e$b$b$$a implements C86165a {
    public final void accept(Object obj) {
        Map map = (Map) obj;
        Context context = MMApplicationContext.getContext();
        map.put("stat-bat-temp", Integer.valueOf(C117159b.m165208i(context)));
        map.put("stat-dev-thermal", Integer.valueOf(C117159b.m165216q(context)));
        map.put("stat-dev-watt", Integer.valueOf(C117159b.m165209j(context)));
        map.put("stat-dev-light", Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_brightness", Integer.MIN_VALUE)));
        map.put("stat-net-radio", Long.valueOf(NetworkSignalUtil.getGSMSignalStrength()));
        map.put("stat-net-wifi", Long.valueOf(NetworkSignalUtil.getWifiSignalStrength()));
        int i = 0;
        for (int i2 : C117159b.m165211l()) {
            if (i2 > i) {
                i = i2;
            }
        }
        map.put("stat-cpu-freq", Integer.valueOf(i));
    }
}
