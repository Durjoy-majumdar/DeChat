package yf0;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hp3.C98494b;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117877b;
import op3.C117878c;
import zf0.C79324f;
import zf0.C79325g;
import zf0.C79326h;

/* renamed from: yf0.m */
public class C79106m implements C98494b<C79105l> {

    /* renamed from: a */
    public C79105l f232264a;

    /* renamed from: b */
    public final C79107a f232265b = new C79107a();

    /* renamed from: c */
    public final C79109c f232266c = new C79109c();

    /* renamed from: d */
    public final C79108b f232267d = new C79108b();

    /* renamed from: yf0.m$a */
    public class C79107a implements C88820e<Boolean, C117877b<Integer, Map<String, Object>>> {
        public C79107a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C79105l lVar = C79106m.this.f232264a;
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            Map<String, Object> map = (Map) bVar.mo182596a(1);
            lVar.getClass();
            lVar.f232263g = C88643g.m110544b();
            if (lVar.f232260d) {
                Log.m105920e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
                lVar.f232263g.mo72091a(Boolean.FALSE);
                return null;
            } else if (map == null || map.size() == 0) {
                lVar.f232263g.mo72091a(Boolean.FALSE);
                return null;
            } else {
                Log.m105925i("MicroMsg.LaunchAALogic", "launchAAByMoney, data.keySet: %s", map.keySet());
                lVar.f232260d = true;
                lVar.f232262f = map;
                lVar.f232261e = intValue;
                if (intValue == 1) {
                    if (!map.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !lVar.f232262f.containsKey("perAmount") || !lVar.f232262f.containsKey("totalUserNumber") || !lVar.f232262f.containsKey("launchScene") || !lVar.f232262f.containsKey("chatRoomName") || !lVar.f232262f.containsKey(AppMeasurement.Param.TIMESTAMP)) {
                        lVar.f232263g.mo72091a(Boolean.FALSE);
                        lVar.f232260d = false;
                        return null;
                    }
                    try {
                        long longValue = ((Long) lVar.f232262f.get("perAmount")).longValue();
                        int intValue2 = ((Integer) lVar.f232262f.get("totalUserNumber")).intValue();
                        long longValue2 = ((Long) lVar.f232262f.get(AppMeasurement.Param.TIMESTAMP)).longValue();
                        Log.m105924i("MicroMsg.LaunchAALogic", "launchAAByMoney");
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C79324f(longValue, (String) lVar.f232262f.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), intValue2, ((Integer) lVar.f232262f.get("launchScene")).intValue(), longValue2, (String) lVar.f232262f.get("chatRoomName")));
                        C115669n.INSTANCE.idkeyStat(407, (long) ((intValue2 <= 0 || intValue2 > 10) ? (intValue2 <= 10 || intValue2 > 20) ? (intValue2 <= 20 || intValue2 > 50) ? 16 : 15 : 14 : 13), 1, false);
                        lVar.f232263g.mo72092b();
                        return null;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.LaunchAALogic", "launchAAByMoney, without specific user error: %s", e.getMessage());
                        lVar.f232263g.mo72091a(Boolean.FALSE);
                        lVar.f232260d = false;
                        return null;
                    }
                } else if (intValue != 2) {
                    return null;
                } else {
                    if (!map.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !lVar.f232262f.containsKey("perAmount") || !lVar.f232262f.containsKey("payerlist") || !lVar.f232262f.containsKey("launchScene") || !lVar.f232262f.containsKey("chatRoomName") || !lVar.f232262f.containsKey(AppMeasurement.Param.TIMESTAMP)) {
                        lVar.f232263g.mo72091a(Boolean.FALSE);
                        lVar.f232260d = false;
                        return null;
                    }
                    try {
                        long longValue3 = ((Long) lVar.f232262f.get("perAmount")).longValue();
                        List list = (List) lVar.f232262f.get("payerlist");
                        long longValue4 = ((Long) lVar.f232262f.get(AppMeasurement.Param.TIMESTAMP)).longValue();
                        boolean booleanValue = ((Boolean) lVar.f232262f.get("isGroupSolitatire")).booleanValue();
                        LinkedList linkedList = new LinkedList((List) lVar.f232262f.get("payerlistGroupSolitatire"));
                        C86709a0.m107528h();
                        C86709a0.m107529k().f251779b.mo123460f(new C79324f(longValue3, (String) lVar.f232262f.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), list, ((Integer) lVar.f232262f.get("launchScene")).intValue(), longValue4, (String) lVar.f232262f.get("chatRoomName"), (String) lVar.f232262f.get("pic_cdn_url"), (String) lVar.f232262f.get("pic_cdn_thumb_url"), (String) lVar.f232262f.get("pf_order_no"), (String) lVar.f232262f.get("pic_cdn_md5"), booleanValue, linkedList));
                        int size = list.size();
                        C115669n.INSTANCE.idkeyStat(407, (long) ((size <= 0 || size > 10) ? (size <= 10 || size > 20) ? (size <= 20 || size > 50) ? 16 : 15 : 14 : 13), 1, false);
                        lVar.f232263g.mo72092b();
                        return null;
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.LaunchAALogic", "launchAAByMoney, specific user error: %", e2.getMessage());
                        lVar.f232263g.mo72091a(Boolean.FALSE);
                        lVar.f232260d = false;
                        return null;
                    }
                }
            }
        }
    }

    /* renamed from: yf0.m$b */
    public class C79108b implements C88820e<C117878c<Boolean, String, Long>, Map<String, Object>> {
        public C79108b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Map<String, Object> map = (Map) obj;
            C79105l lVar = C79106m.this.f232264a;
            lVar.getClass();
            lVar.f232263g = C88643g.m110544b();
            Log.m105924i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize");
            if (lVar.f232260d) {
                Log.m105920e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
                lVar.f232263g.mo72091a(Boolean.FALSE);
                return null;
            } else if (map == null || map.size() == 0) {
                lVar.f232263g.mo72091a(Boolean.FALSE);
                return null;
            } else {
                lVar.f232260d = true;
                lVar.f232262f = map;
                lVar.f232261e = 3;
                if (!map.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !lVar.f232262f.containsKey("launchScene") || !lVar.f232262f.containsKey("chatRoomName") || !lVar.f232262f.containsKey(AppMeasurement.Param.TIMESTAMP)) {
                    Log.m105924i("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize interrupt");
                    lVar.f232263g.mo72091a(Boolean.FALSE);
                    lVar.f232260d = false;
                    return null;
                }
                try {
                    boolean booleanValue = ((Boolean) lVar.f232262f.get("isGroupSolitatire")).booleanValue();
                    LinkedList linkedList = new LinkedList((List) lVar.f232262f.get("payerlistGroupSolitatire"));
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C79326h((String) lVar.f232262f.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), ((Integer) lVar.f232262f.get("launchScene")).intValue(), (String) lVar.f232262f.get("chatRoomName"), ((Long) lVar.f232262f.get(AppMeasurement.Param.TIMESTAMP)).longValue(), (String) lVar.f232262f.get("pic_cdn_url"), (String) lVar.f232262f.get("pic_cdn_thumb_url"), (String) lVar.f232262f.get("pf_order_no"), (String) lVar.f232262f.get("pic_cdn_md5"), booleanValue, linkedList));
                    lVar.f232263g.mo72092b();
                    return null;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.LaunchAALogic", "launchAAByPersonCustomize error: %s", e.getMessage());
                    lVar.f232263g.mo72091a(Boolean.FALSE);
                    lVar.f232260d = false;
                    return null;
                }
            }
        }
    }

    /* renamed from: yf0.m$c */
    public class C79109c implements C88820e<C117878c<Boolean, String, Long>, Map<String, Object>> {
        public C79109c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Map<String, Object> map = (Map) obj;
            C79105l lVar = C79106m.this.f232264a;
            lVar.getClass();
            lVar.f232263g = C88643g.m110544b();
            Log.m105924i("MicroMsg.LaunchAALogic", "launchAAByPerson");
            if (lVar.f232260d) {
                Log.m105920e("MicroMsg.LaunchAALogic", "launchAA, isLaunching!!! ignore it");
                lVar.f232263g.mo72091a(Boolean.FALSE);
                return null;
            } else if (map == null || map.size() == 0) {
                lVar.f232263g.mo72091a(Boolean.FALSE);
                return null;
            } else {
                lVar.f232260d = true;
                lVar.f232262f = map;
                lVar.f232261e = 3;
                if (!map.containsKey(FFmpegMetadataRetriever.METADATA_KEY_TITLE) || !lVar.f232262f.containsKey("totalPayAmount") || !lVar.f232262f.containsKey("payerlist") || !lVar.f232262f.containsKey("launchScene") || !lVar.f232262f.containsKey("chatRoomName") || !lVar.f232262f.containsKey(AppMeasurement.Param.TIMESTAMP)) {
                    lVar.f232263g.mo72091a(Boolean.FALSE);
                    lVar.f232260d = false;
                    return null;
                }
                try {
                    long longValue = ((Long) lVar.f232262f.get("totalPayAmount")).longValue();
                    List list = (List) lVar.f232262f.get("payerlist");
                    boolean booleanValue = ((Boolean) lVar.f232262f.get("isGroupSolitatire")).booleanValue();
                    LinkedList linkedList = new LinkedList((List) lVar.f232262f.get("payerlistGroupSolitatire"));
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C79325g((String) lVar.f232262f.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE), longValue, list, ((Integer) lVar.f232262f.get("launchScene")).intValue(), (String) lVar.f232262f.get("chatRoomName"), ((Long) lVar.f232262f.get(AppMeasurement.Param.TIMESTAMP)).longValue(), (String) lVar.f232262f.get("pic_cdn_url"), (String) lVar.f232262f.get("pic_cdn_thumb_url"), (String) lVar.f232262f.get("pf_order_no"), (String) lVar.f232262f.get("pic_cdn_md5"), booleanValue, linkedList));
                    int size = list.size();
                    int i = 20;
                    if (size > 0 && size <= 10) {
                        i = 17;
                    } else if (size > 10 && size <= 20) {
                        i = 18;
                    } else if (size > 20 && size <= 50) {
                        i = 19;
                    }
                    C115669n.INSTANCE.idkeyStat(407, (long) i, 1, false);
                    lVar.f232263g.mo72092b();
                    return null;
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.LaunchAALogic", "launchAAByPerson error: %s", e.getMessage());
                    lVar.f232263g.mo72091a(Boolean.FALSE);
                    lVar.f232260d = false;
                    return null;
                }
            }
        }
    }

    public C79106m() {
        C79105l lVar = new C79105l();
        this.f232264a = lVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f232264a;
    }
}
