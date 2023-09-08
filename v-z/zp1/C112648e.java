package zp1;

import android.os.BatteryManager;
import com.tencent.p014mm.plugin.performance.watchdogs.MemoryWatchDog;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Map;
import p204mr.C61570q;
import p757xv.C91353u;
import p757xv.C91355x;

/* renamed from: zp1.e */
public final class C112648e {

    /* renamed from: s */
    public static final long f337295s = System.currentTimeMillis();

    /* renamed from: t */
    public static long f337296t = 1;

    /* renamed from: u */
    public static final /* synthetic */ int f337297u = 0;

    /* renamed from: a */
    public final C61570q f337298a;

    /* renamed from: b */
    public final C112649a f337299b;

    /* renamed from: c */
    public final String f337300c;

    /* renamed from: d */
    public C112648e f337301d;

    /* renamed from: e */
    public final long f337302e;

    /* renamed from: f */
    public final long f337303f;

    /* renamed from: g */
    public final int f337304g;

    /* renamed from: h */
    public final int f337305h;

    /* renamed from: i */
    public final long f337306i;

    /* renamed from: j */
    public final long f337307j;

    /* renamed from: k */
    public final long f337308k;

    /* renamed from: l */
    public final long f337309l;

    /* renamed from: m */
    public final long f337310m;

    /* renamed from: n */
    public final long f337311n;

    /* renamed from: o */
    public final long f337312o;

    /* renamed from: p */
    public final long f337313p;

    /* renamed from: q */
    public final long f337314q;

    /* renamed from: r */
    public final long f337315r;

    /* renamed from: zp1.e$a */
    public enum C112649a {
        OPERATOR_TYPE_ONCE("once"),
        OPERATOR_TYPE_ENTER(LocaleUtil.INDONESIAN_NEWNAME),
        OPERATOR_TYPE_LEAVE("out");
        

        /* renamed from: d */
        public final String f337320d;

        /* access modifiers changed from: public */
        C112649a(String str) {
            this.f337320d = str;
        }
    }

    public C112648e(C61570q qVar, C112649a aVar, String str, C112648e eVar, int i, C8480h hVar) {
        str = (i & 4) != 0 ? "" : str;
        eVar = (i & 8) != 0 ? null : eVar;
        C87412m.m108594g(qVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        C87412m.m108594g(aVar, "operatorType");
        C87412m.m108594g(str, "anythingElse");
        this.f337298a = qVar;
        this.f337299b = aVar;
        this.f337300c = str;
        this.f337301d = eVar;
        Object systemService = MMApplicationContext.getContext().getSystemService("batterymanager");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        BatteryManager batteryManager = (BatteryManager) systemService;
        C91355x g = ((MemoryWatchDog) ((C91353u) C86312j.m106911c(C91353u.class)).mo112623CU()).mo118581g();
        this.f337302e = System.currentTimeMillis();
        long j = f337296t;
        f337296t = 1 + j;
        this.f337303f = j;
        this.f337304g = batteryManager.getIntProperty(4);
        this.f337305h = batteryManager.getIntProperty(2);
        this.f337306i = (long) g.f261988A;
        Map<String, String> map = g.f262001c;
        C87412m.m108593f(map, "memoryInfo.memoryStats");
        String str2 = map.get("summary.code");
        String str3 = "-1";
        this.f337307j = Util.safeParseLong(str2 == null ? str3 : str2);
        Map<String, String> map2 = g.f262001c;
        C87412m.m108593f(map2, "memoryInfo.memoryStats");
        String str4 = map2.get("summary.stack");
        this.f337308k = Util.safeParseLong(str4 == null ? str3 : str4);
        Map<String, String> map3 = g.f262001c;
        C87412m.m108593f(map3, "memoryInfo.memoryStats");
        String str5 = map3.get("summary.graphics");
        this.f337309l = Util.safeParseLong(str5 == null ? str3 : str5);
        Map<String, String> map4 = g.f262001c;
        C87412m.m108593f(map4, "memoryInfo.memoryStats");
        String str6 = map4.get("summary.java-heap");
        this.f337310m = Util.safeParseLong(str6 == null ? str3 : str6);
        Map<String, String> map5 = g.f262001c;
        C87412m.m108593f(map5, "memoryInfo.memoryStats");
        String str7 = map5.get("summary.native-heap");
        this.f337311n = Util.safeParseLong(str7 == null ? str3 : str7);
        Map<String, String> map6 = g.f262001c;
        C87412m.m108593f(map6, "memoryInfo.memoryStats");
        String str8 = map6.get("summary.system");
        this.f337312o = Util.safeParseLong(str8 == null ? str3 : str8);
        Map<String, String> map7 = g.f262001c;
        C87412m.m108593f(map7, "memoryInfo.memoryStats");
        String str9 = map7.get("summary.total-pss");
        this.f337313p = Util.safeParseLong(str9 == null ? str3 : str9);
        Map<String, String> map8 = g.f262001c;
        C87412m.m108593f(map8, "memoryInfo.memoryStats");
        String str10 = map8.get("summary.private-other");
        this.f337314q = Util.safeParseLong(str10 == null ? str3 : str10);
        Map<String, String> map9 = g.f262001c;
        C87412m.m108593f(map9, "memoryInfo.memoryStats");
        String str11 = map9.get("summary.total-swap");
        this.f337315r = Util.safeParseLong(str11 != null ? str11 : str3);
    }
}
