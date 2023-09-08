package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import java.util.HashMap;

public class YtSDKStats extends YtFSMBaseState {
    private static YtSDKStats ytSDKStats;
    private String currentAction;
    private long currentEnterTimeStampMS;
    private String currentState;
    private String preInfo;
    private String preUpdateState;
    private HashMap<String, Object> stateNameMap = new HashMap<>();

    public static synchronized void clearInstance() {
        synchronized (YtSDKStats.class) {
            if (ytSDKStats != null) {
                ytSDKStats = null;
            }
        }
    }

    public static synchronized YtSDKStats getInstance() {
        synchronized (YtSDKStats.class) {
            YtSDKStats ytSDKStats2 = ytSDKStats;
            if (ytSDKStats2 != null) {
                return ytSDKStats2;
            }
            YtSDKStats ytSDKStats3 = new YtSDKStats();
            ytSDKStats = ytSDKStats3;
            return ytSDKStats3;
        }
    }

    public static String getNowTimeStamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    private void makeReport(String str, String str2, HashMap<String, Object> hashMap, String str3, String str4) {
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("state_id", str);
        hashMap3.put("state_action", str2);
        if (hashMap != null) {
            hashMap3.put("state_error", hashMap);
        }
        if (str3 != null) {
            hashMap3.put("state_cost", str3);
        }
        if (str4 != null) {
            hashMap3.put("state_info", str4);
        }
        hashMap2.put(StateEvent.Name.STATE_STATS, hashMap3);
        sendStateEvent(hashMap2);
    }

    private void sendStateEvent(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            YtFSM.getInstance().sendFSMEvent(hashMap);
        }
    }

    public void enterFirst() {
    }

    public void enterState(String str) {
        Object obj = this.stateNameMap.get(str);
        if (obj != null) {
            this.currentAction = "enter";
            int intValue = ((Integer) obj).intValue();
            if (intValue == 0) {
                exitState();
                if (this.currentAction != null) {
                    this.currentEnterTimeStampMS = System.currentTimeMillis();
                    this.currentState = str;
                    makeReport(str, this.currentAction, (HashMap<String, Object>) null, (String) null, (String) null);
                }
            }
            this.stateNameMap.put(str, Integer.valueOf(intValue + 1));
        }
    }

    public void exitState() {
        if (this.currentState != null) {
            makeReport(this.currentState, "exit", (HashMap<String, Object>) null, Long.toString(System.currentTimeMillis() - this.currentEnterTimeStampMS), (String) null);
        }
    }

    public void registerStateName(String str) {
        this.stateNameMap.put(str, 0);
    }

    public void reportError(int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(StateEvent.Name.ERROR_CODE, Integer.valueOf(i));
        hashMap.put("error_msg", str);
        makeReport(this.currentState, this.currentAction, hashMap, (String) null, (String) null);
    }

    public void reportInfo(String str) {
        String str2 = this.preInfo;
        if (str2 == null || !str2.equals(str)) {
            this.preInfo = str;
        }
        makeReport(this.currentState, this.currentAction, (HashMap<String, Object>) null, (String) null, str);
    }

    public void reset() {
        for (String put : this.stateNameMap.keySet()) {
            this.stateNameMap.put(put, 0);
        }
        this.currentState = null;
        this.preUpdateState = null;
        this.preInfo = null;
    }

    public void updateState(String str) {
        this.currentAction = "update";
        String str2 = this.preUpdateState;
        if (str2 == null || !str2.equals(this.currentState)) {
            String str3 = this.currentState;
            this.preUpdateState = str3;
            makeReport(str3, this.currentAction, (HashMap<String, Object>) null, (String) null, (String) null);
        }
    }
}
