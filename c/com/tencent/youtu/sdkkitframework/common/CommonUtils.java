package com.tencent.youtu.sdkkitframework.common;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public class CommonUtils {
    public static final int MAX_TIMEOUT_MS = 30000;
    public static final int MIN_TIMEOUT_MS = 0;
    private static final String TAG = "CommonUtils";
    private static ConcurrentHashMap<String, BenchMarkTime> benchMarkMaps = new ConcurrentHashMap<>();

    public static class BenchMarkTime {
        public long avg = 0;
        public long begin;
        public long cur = 0;
        public long max = Long.MIN_VALUE;
        public long min = MAlarmHandler.NEXT_FIRE_INTERVAL;
        public long tick = 0;
        public long total = 0;

        private void update(long j) {
            this.tick++;
            this.min = Math.min(j, this.min);
            this.max = Math.max(j, this.max);
            long j2 = this.total + j;
            this.total = j2;
            this.avg = j2 / this.tick;
        }

        public void begin() {
            this.begin = System.currentTimeMillis();
        }

        public void end() {
            long currentTimeMillis = System.currentTimeMillis() - this.begin;
            this.cur = currentTimeMillis;
            update(currentTimeMillis);
        }

        public String getTime() {
            return "avg: " + this.avg + "ms min: " + this.min + "ms max: " + this.max + "ms cur: " + this.cur + LocaleUtil.MALAY;
        }
    }

    public static void benchMarkBegin(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            benchMarkMaps.put(str, new BenchMarkTime());
        }
        benchMarkMaps.get(str).begin();
    }

    public static long benchMarkEnd(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return 0;
        }
        BenchMarkTime benchMarkTime = benchMarkMaps.get(str);
        benchMarkTime.end();
        YtLogger.m106580i(TAG, "benchMarkEnd -- " + str + " : " + benchMarkTime.cur + LocaleUtil.MALAY);
        return benchMarkTime.cur;
    }

    public static String getBenchMarkTime(String str) {
        if (!benchMarkMaps.containsKey(str)) {
            return "";
        }
        return "[" + str + "]" + benchMarkMaps.get(str).getTime();
    }

    private static byte[] getSignature(String str, String str2) {
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec(str2.getBytes(), instance.getAlgorithm()));
        return instance.doFinal(str.getBytes());
    }

    public static String getYoutuOpenAppSign(String str, String str2, String str3, String str4) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str5 = "a=" + str + "&k=" + str2 + "&e=" + (2592000 + currentTimeMillis) + "&t=" + currentTimeMillis + "&r=" + Math.abs(new Random().nextInt()) + "&u=" + str4 + "&f=";
        byte[] signature = getSignature(str5, str3);
        byte[] bArr = new byte[(signature.length + str5.getBytes().length)];
        System.arraycopy(signature, 0, bArr, 0, signature.length);
        System.arraycopy(str5.getBytes(), 0, bArr, signature.length, str5.getBytes().length);
        return new String(Base64.encode(bArr, 2));
    }

    public static String makeMessageJson(int i, String str, String str2) {
        try {
            new JSONObject(str2);
            return str2;
        } catch (Exception unused) {
            return "{ \"errorcode\":" + i + ",\"errormsg\": \"" + str + "\",\"extrainfo\":\"" + str2 + "\"}";
        }
    }

    public static void reportException(String str, Exception exc) {
        YtSDKStats instance = YtSDKStats.getInstance();
        instance.reportInfo(str + " cause exception: " + exc.getLocalizedMessage());
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(exc) {
            public final /* synthetic */ Exception val$e;

            {
                this.val$e = r5;
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_PARAM_ERROR, StringCode.RST_FAILED, r5.getLocalizedMessage()));
            }
        });
    }
}
