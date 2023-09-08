package com.tencent.youtu.sdkkitframework.framework;

import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import org.json.JSONObject;

public abstract class YtFSMBaseState {
    private static final String TAG = "YtFSMBaseState";
    public boolean isFirstEnter = true;
    public HashMap<String, Object> stateData;
    public String stateName;
    public String stateSimpleName;

    public void enter() {
        YtSDKStats.getInstance().enterState(this.stateSimpleName);
        if (this.isFirstEnter) {
            this.isFirstEnter = false;
            enterFirst();
        }
        String str = TAG;
        YtLogger.m106580i(str, this.stateName + " enter");
    }

    public abstract void enterFirst();

    public void exit() {
        String str = TAG;
        YtLogger.m106580i(str, this.stateName + " exit");
    }

    public Object getStateDataBy(String str) {
        return this.stateData.get(str);
    }

    public String getStateName() {
        return this.stateName;
    }

    public String getStateSimpleName() {
        return this.stateSimpleName;
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
    }

    public void handleStateAction(String str, Object obj) {
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        this.stateName = str;
        try {
            this.stateSimpleName = Class.forName(str).getSimpleName();
        } catch (Exception unused) {
            String[] split = str.split("\\.");
            this.stateSimpleName = split[split.length - 1];
        }
        String str2 = TAG;
        YtLogger.m106580i(str2, "load " + this.stateSimpleName);
        this.stateData = new HashMap<>();
        YtSDKStats.getInstance().registerStateName(this.stateSimpleName);
    }

    public void moveToNextState() {
        String str = TAG;
        YtLogger.m106580i(str, this.stateName + " move to next");
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void reset() {
        this.isFirstEnter = true;
        this.stateData.clear();
        String str = TAG;
        YtLogger.m106580i(str, this.stateName + " reset");
    }

    public void unload() {
        String str = TAG;
        YtLogger.m106580i(str, "unload " + this.stateSimpleName);
        this.stateData.clear();
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        YtSDKStats.getInstance().updateState(this.stateName);
        String str = TAG;
        YtLogger.m106580i(str, this.stateName + " update image : " + i + "x" + i2 + " type " + i3);
    }

    public void updateSDKSetting(JSONObject jSONObject) {
    }
}
