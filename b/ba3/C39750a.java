package ba3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ba3.a */
public final class C39750a {

    /* renamed from: a */
    public static final C39750a f106644a = new C39750a();

    /* renamed from: b */
    public static final C13601g f106645b = C36568h.m40985a(C28276a.f77850d);

    /* renamed from: c */
    public static final MMKVSlotManager f106646c;

    /* renamed from: ba3.a$a */
    public static final class C28276a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C28276a f77850d = new C28276a();

        public C28276a() {
            super(0);
        }

        public Object invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("MicroMsg.MPVideoPreviewDataMgr");
        C87412m.m108593f(mmkv, "getMMKV(TAG)");
        f106646c = new MMKVSlotManager(mmkv, 600);
    }

    /* renamed from: a */
    public final boolean mo62385a() {
        return ((Boolean) ((C36570n) f106645b).getValue()).booleanValue();
    }

    /* renamed from: b */
    public final Map<String, Object> mo62386b(String str) {
        HashMap hashMap = null;
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "getVideo vid null");
            return null;
        }
        MMKVSlotManager mMKVSlotManager = f106646c;
        int i = 0;
        int decodeInt = mMKVSlotManager.decodeInt("MicroMsg.MPVideoPreviewDataMgr_" + str + "_playTime", 0);
        int decodeInt2 = mMKVSlotManager.decodeInt("MicroMsg.MPVideoPreviewDataMgr_" + str + "_expire", 0);
        boolean z = System.currentTimeMillis() / ((long) 1000) > ((long) decodeInt2);
        if (!(decodeInt == 0 || decodeInt2 == 0 || z)) {
            hashMap = new HashMap();
            C87412m.m108592e(Integer.valueOf(decodeInt), "null cannot be cast to non-null type java.lang.Object");
            hashMap.put("videoInitialTime", Integer.valueOf(decodeInt));
            String decodeString = mMKVSlotManager.decodeString("MicroMsg.MPVideoPreviewDataMgr_" + str + "_bitmap", "");
            C87412m.m108592e(decodeString, "null cannot be cast to non-null type java.lang.Object");
            hashMap.put("videoInitialSnapshot", decodeString);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getVideo vid = ");
        sb.append(str);
        sb.append(", map size = ");
        if (hashMap != null) {
            i = hashMap.size();
        }
        sb.append(i);
        Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", sb.toString());
        return hashMap;
    }

    /* renamed from: c */
    public final void mo62387c(String str) {
        try {
            String optString = new JSONObject(str).optString("video_data");
            if (Util.isNullOrNil(optString)) {
                Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "reportByLeaveForMPGateway video_data null");
                return;
            }
            JSONObject jSONObject = new JSONObject(optString);
            String optString2 = jSONObject.optString(TPReportKeys.Common.COMMON_VID);
            int i = (int) Util.getFloat(jSONObject.optString("lastPlayedTime"), 0.0f);
            int i2 = (int) Util.getFloat(jSONObject.optString("lastPlayedTimeExpiredTime"), 0.0f);
            if (mo62385a()) {
                MMKVSlotManager mMKVSlotManager = f106646c;
                MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) mMKVSlotManager.getSlotForWrite();
                multiProcessMMKV.encode("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_playTime", i);
                multiProcessMMKV.encode("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_expire", i2);
                ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode("MicroMsg.MPVideoPreviewDataMgr_" + optString2 + "_bitmap", "");
            }
        } catch (Exception e) {
            Log.m105925i("MicroMsg.MPVideoPreviewDataMgr", "reportByLeaveForMPGateway, ex = %s", e.getMessage());
        }
    }

    /* renamed from: d */
    public final void mo62388d(String str) {
        if (mo62385a()) {
            Map<String, Object> b = mo62386b(str);
            if (b == null) {
                Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "prepareOnReceivePageData vid not found");
                ((MultiProcessMMKV) f106646c.getSlotForWrite()).encode("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", "");
                return;
            }
            ((MultiProcessMMKV) f106646c.getSlotForWrite()).encode("MicroMsg.MPVideoPreviewDataMgr_prepareOnReceivePageData_vid", str);
            StringBuilder sb = new StringBuilder();
            sb.append("prepareOnReceivePageData len = ");
            Object obj = b.get("videoInitialSnapshot");
            Integer num = null;
            String str2 = obj instanceof String ? (String) obj : null;
            if (str2 != null) {
                num = Integer.valueOf(str2.length());
            }
            sb.append(num);
            Log.m105926v("MicroMsg.MPVideoPreviewDataMgr", sb.toString());
        }
    }
}
