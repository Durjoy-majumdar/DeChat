package tg3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatPermissions;

/* renamed from: tg3.u */
public class C90494u {

    /* renamed from: h */
    public static long f260096h = 125829120;

    /* renamed from: a */
    public MTimerHandler f260097a = new MTimerHandler(new C90495a(), true);

    /* renamed from: b */
    public long f260098b = 0;

    /* renamed from: c */
    public long f260099c = 0;

    /* renamed from: d */
    public String f260100d = null;

    /* renamed from: e */
    public boolean f260101e = false;

    /* renamed from: f */
    public C90461a0 f260102f;

    /* renamed from: g */
    public boolean f260103g = false;

    /* renamed from: tg3.u$a */
    public class C90495a implements MTimerHandler.CallBack {
        public C90495a() {
        }

        public boolean onTimerExpired() {
            C90494u.this.mo124665a(true);
            return true;
        }
    }

    public C90494u(C90461a0 a0Var) {
        this.f260102f = a0Var;
    }

    /* renamed from: a */
    public final void mo124665a(boolean z) {
        if (z || this.f260098b + this.f260099c >= 524288) {
            long j = 0;
            if (this.f260098b + this.f260099c > 0) {
                Intent intent = new Intent();
                intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
                intent.putExtra("intent_extra_flow_stat_upstream", this.f260098b);
                intent.putExtra("intent_extra_flow_stat_downstream", this.f260099c);
                Context context = this.f260102f.f259984A;
                if (context != null) {
                    this.f260103g = NetStatusUtil.isWifi(context);
                }
                intent.putExtra("intent_extra_flow_stat_is_wifi", this.f260103g);
                Context context2 = this.f260102f.f259984A;
                if (context2 != null) {
                    context2.sendBroadcast(intent, WeChatPermissions.PERMISSION_MM_MESSAGE());
                }
            }
            if (Util.isNullOrNil(this.f260100d)) {
                Log.m105920e("MicroMsg.TrafficStatistic", "traffic is null!");
            } else {
                String str = this.f260100d;
                long j2 = this.f260098b;
                long j3 = this.f260099c;
                SharedPreferences sharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(MMApplicationContext.getContext(), "update_flowstat_prefs", 4);
                long j4 = sharedPreferences.getLong(str, 0);
                Log.m105925i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flowUp %s, flowDown %s", str, Long.valueOf(j2), Long.valueOf(j3));
                Log.m105925i("MicroMsg.UpdateUtil", "putPackFlowStat pack %s, flow %s", str, Long.valueOf(j4));
                long j5 = j4 + j2 + j3;
                sharedPreferences.edit().putLong(str, j5).commit();
                this.f260098b = 0;
                this.f260099c = 0;
                j = j5;
            }
            if (j >= f260096h && this.f260102f.f260006r == 2) {
                Log.m105920e("MicroMsg.TrafficStatistic", "checkIfTrafficAlert reach traffic alert line!");
                this.f260102f.mo124630j();
            }
        }
    }

    /* renamed from: b */
    public void mo124666b() {
        mo124665a(true);
        this.f260097a.stopTimer();
        this.f260101e = false;
    }
}
