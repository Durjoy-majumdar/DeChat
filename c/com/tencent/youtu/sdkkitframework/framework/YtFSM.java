package com.tencent.youtu.sdkkitframework.framework;

import android.os.Process;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class YtFSM {
    /* access modifiers changed from: private */
    public static final String TAG = "YtFSM";
    private static YtFSM instance;
    /* access modifiers changed from: private */
    public YtFSMUpdateData currentData = new YtFSMUpdateData();
    /* access modifiers changed from: private */
    public YtFSMBaseState currentState;
    private YtSDKKitFramework.YtSDKKitFrameworkWorkMode currentWorkMode = YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_UNKNOWN;
    private YtSDKKitFramework.IYtSDKKitFrameworkEventListener eventListener;
    /* access modifiers changed from: private */
    public ConcurrentLinkedQueue<Object> eventQueue = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */
    public String firstStateName;
    /* access modifiers changed from: private */
    public boolean isStarted = false;
    /* access modifiers changed from: private */
    public boolean needEventHandler = false;
    private YtSDKKitFramework.YtSDKPlatformContext sdkPlatformContex;
    private Lock startStopLock = new ReentrantLock();
    /* access modifiers changed from: private */
    public Lock stateLock = new ReentrantLock();
    /* access modifiers changed from: private */
    public HashMap<String, YtFSMBaseState> stateMap = new HashMap<>();
    private Thread updateEventHandler;
    /* access modifiers changed from: private */
    public ConcurrentLinkedQueue<YtFSMUpdateData> updateQueue = new ConcurrentLinkedQueue<>();

    public class YtFSMFireEventData {
        public YtSDKKitFramework.YtFrameworkFireEventType eventType;
        public Object extraData;

        public YtFSMFireEventData(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
            this.eventType = ytFrameworkFireEventType;
            this.extraData = obj;
        }
    }

    public class YtFSMUpdateData {
        public byte[] imageData;
        public int imageHeight;
        public int imageType;
        public int imageWidth;
        public long timeStamp;

        private YtFSMUpdateData() {
        }
    }

    private YtFSM() {
    }

    public static synchronized void clearInstance() {
        synchronized (YtFSM.class) {
            if (instance != null) {
                instance = null;
            }
        }
    }

    public static synchronized YtFSM getInstance() {
        YtFSM ytFSM;
        synchronized (YtFSM.class) {
            if (instance == null) {
                instance = new YtFSM();
            }
            ytFSM = instance;
        }
        return ytFSM;
    }

    public void cleanUpQueue() {
        this.updateQueue.clear();
    }

    public YtSDKKitFramework.YtSDKPlatformContext getContext() {
        String str = TAG;
        YtLogger.m106580i(str, "YtFSM#getContext");
        if (this.sdkPlatformContex == null) {
            YtLogger.m106580i(str, "sdkPlatformContex == null");
            this.sdkPlatformContex = new YtSDKKitFramework.YtSDKPlatformContext();
        }
        return this.sdkPlatformContex;
    }

    public YtFSMBaseState getStateByName(String str) {
        if (this.stateMap.containsKey(str)) {
            return this.stateMap.get(str);
        }
        return null;
    }

    public YtSDKKitFramework.YtSDKKitFrameworkWorkMode getWorkMode() {
        return this.currentWorkMode;
    }

    public void handleEvent(YtSDKKitFramework.YtFrameworkFireEventType ytFrameworkFireEventType, Object obj) {
        try {
            this.eventQueue.add(new YtFSMFireEventData(ytFrameworkFireEventType, obj));
        } catch (Exception e) {
            String str = TAG;
            YtLogger.m106579e(str, "Handle event failed:" + e.getLocalizedMessage());
        }
    }

    public void handlePauseEvent() {
        for (YtFSMBaseState onPause : this.stateMap.values()) {
            onPause.onPause();
        }
    }

    public void handleResumeEvent() {
        for (YtFSMBaseState onResume : this.stateMap.values()) {
            onResume.onResume();
        }
    }

    public int registerState(YtFSMBaseState ytFSMBaseState) {
        YtSDKStats.getInstance().registerStateName(ytFSMBaseState.getStateSimpleName());
        this.stateMap.put(ytFSMBaseState.getStateName(), ytFSMBaseState);
        return 0;
    }

    public void reset() {
        String str = TAG;
        YtLogger.m106580i(str, "FSM reset work mode " + this.currentWorkMode);
        try {
            this.eventQueue.add("reset");
        } catch (Exception e) {
            String str2 = TAG;
            YtLogger.m106579e(str2, "handle reset failed:" + e.getLocalizedMessage());
        }
    }

    public void sendFSMEvent(HashMap<String, Object> hashMap) {
        if (this.eventListener != null) {
            if (hashMap.containsKey(StateEvent.Name.PROCESS_RESULT)) {
                String str = TAG;
                YtLogger.m106580i(str, "send framework event result: " + hashMap.get(StateEvent.Name.PROCESS_RESULT) + " errorcode:" + hashMap.get(StateEvent.Name.ERROR_CODE));
            }
            this.eventListener.onFrameworkEvent(hashMap);
            return;
        }
        YtLogger.m106579e(TAG, "Event listener not init");
    }

    public void sendNetworkRequest(String str, String str2, String str3, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        if (this.eventListener != null) {
            sendFSMEvent(new HashMap<String, Object>(str) {
                public final /* synthetic */ String val$netType;

                {
                    this.val$netType = r2;
                    put(StateEvent.Name.UI_TIPS, r2);
                }
            });
            this.eventListener.onNetworkRequestEvent(str2, str3, hashMap, iYtSDKKitNetResponseParser);
            return;
        }
        YtLogger.m106579e(TAG, "Event listener not init");
    }

    public void setContext(YtSDKKitFramework.YtSDKPlatformContext ytSDKPlatformContext) {
        this.sdkPlatformContex = ytSDKPlatformContext;
    }

    public void setEventListener(YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener) {
        this.eventListener = iYtSDKKitFrameworkEventListener;
    }

    public void start(String str, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, final int i) {
        String str2 = TAG;
        YtLogger.m106580i(str2, "FSM start use work mode " + ytSDKKitFrameworkWorkMode);
        try {
            this.startStopLock.lock();
            if (!this.isStarted) {
                this.firstStateName = str;
                this.currentWorkMode = ytSDKKitFrameworkWorkMode;
                this.isStarted = true;
                this.needEventHandler = true;
                if (this.stateMap.containsKey(str)) {
                    YtLogger.m106580i(str2, "start set current state:" + str);
                    YtFSMBaseState ytFSMBaseState = this.stateMap.get(this.firstStateName);
                    this.currentState = ytFSMBaseState;
                    ytFSMBaseState.enter();
                } else {
                    YtLogger.m106579e(str2, "Start " + str + " failed which is not found");
                }
                this.updateQueue.clear();
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        Process.setThreadPriority(i);
                        while (YtFSM.this.needEventHandler) {
                            if (YtFSM.this.isStarted) {
                                while (!YtFSM.this.eventQueue.isEmpty()) {
                                    Object poll = YtFSM.this.eventQueue.poll();
                                    if (poll instanceof String) {
                                        if (((String) poll).equals("reset")) {
                                            for (YtFSMBaseState reset : YtFSM.this.stateMap.values()) {
                                                reset.reset();
                                            }
                                            if (YtFSM.this.stateMap.containsKey(YtFSM.this.firstStateName)) {
                                                String access$600 = YtFSM.TAG;
                                                YtLogger.m106580i(access$600, "reset set current state:" + YtFSM.this.firstStateName);
                                                YtFSM ytFSM = YtFSM.this;
                                                YtFSMBaseState unused = ytFSM.currentState = (YtFSMBaseState) ytFSM.stateMap.get(YtFSM.this.firstStateName);
                                                YtFSM.this.currentState.enter();
                                            } else {
                                                String access$6002 = YtFSM.TAG;
                                                YtLogger.m106579e(access$6002, "reset failed: " + YtFSM.this.firstStateName + " state is not found");
                                            }
                                            YtFSM.this.updateQueue.clear();
                                        }
                                    } else if (poll instanceof YtFSMFireEventData) {
                                        YtFSMFireEventData ytFSMFireEventData = (YtFSMFireEventData) poll;
                                        String access$6003 = YtFSM.TAG;
                                        YtLogger.m106580i(access$6003, "handleevent " + ytFSMFireEventData.eventType + " for all states");
                                        for (YtFSMBaseState handleEvent : YtFSM.this.stateMap.values()) {
                                            handleEvent.handleEvent(ytFSMFireEventData.eventType, ytFSMFireEventData.extraData);
                                        }
                                    }
                                }
                                try {
                                    YtFSM.this.stateLock.lock();
                                    YtFSMUpdateData ytFSMUpdateData = (YtFSMUpdateData) YtFSM.this.updateQueue.poll();
                                    String access$6004 = YtFSM.TAG;
                                    YtLogger.m106580i(access$6004, "debug_thread " + Thread.currentThread().getName() + " priority:" + Process.getThreadPriority(Process.myTid()));
                                    if (ytFSMUpdateData != null) {
                                        YtFSMUpdateData unused2 = YtFSM.this.currentData = ytFSMUpdateData;
                                        if (YtFSM.this.currentState != null) {
                                            YtFSM.this.currentState.update(YtFSM.this.currentData.imageData, YtFSM.this.currentData.imageWidth, YtFSM.this.currentData.imageHeight, YtFSM.this.currentData.imageType, YtFSM.this.currentData.timeStamp);
                                        }
                                    }
                                } finally {
                                    YtFSM.this.stateLock.unlock();
                                }
                            }
                            try {
                                Thread.sleep(5);
                            } catch (InterruptedException unused3) {
                                YtLogger.m106579e(YtFSM.TAG, "sleep failed");
                            }
                        }
                    }
                });
                this.updateEventHandler = thread;
                thread.setName("YtEventUpdateThread");
                this.updateEventHandler.start();
            }
        } catch (Exception e) {
            YtLogger.m106579e(TAG, e.getLocalizedMessage());
        } catch (Throwable th) {
            this.startStopLock.unlock();
            throw th;
        }
        this.startStopLock.unlock();
    }

    public void stop() {
        String str = TAG;
        YtLogger.m106580i(str, "FSM stop work mode " + this.currentWorkMode);
        try {
            this.startStopLock.lock();
            this.needEventHandler = false;
            Thread thread = this.updateEventHandler;
            if (thread != null && thread.isAlive()) {
                this.updateEventHandler.join();
            }
            if (this.isStarted) {
                this.isStarted = false;
                for (YtFSMBaseState unload : this.stateMap.values()) {
                    unload.unload();
                }
                this.stateMap.clear();
                this.updateQueue.clear();
            }
        } catch (InterruptedException e) {
            YtLogger.m106579e(TAG, e.getLocalizedMessage());
        } catch (Throwable th) {
            this.startStopLock.unlock();
            throw th;
        }
        this.startStopLock.unlock();
    }

    public int transitNextRound(String str) {
        if (this.stateMap.containsKey(str)) {
            this.currentState.exit();
            String str2 = TAG;
            YtLogger.m106580i(str2, "transitnextround set current state:" + str);
            YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
            this.currentState = ytFSMBaseState;
            ytFSMBaseState.enter();
            return 0;
        }
        String str3 = TAG;
        YtLogger.m106579e(str3, "transitnextround faild:" + str + " state is not found");
        return -1;
    }

    public int transitNow(String str) {
        if (this.stateMap.containsKey(str)) {
            this.currentState.exit();
            String str2 = TAG;
            YtLogger.m106580i(str2, "transitnow set current state:" + str);
            YtFSMBaseState ytFSMBaseState = this.stateMap.get(str);
            this.currentState = ytFSMBaseState;
            ytFSMBaseState.enter();
            YtFSMUpdateData ytFSMUpdateData = this.currentData;
            if (ytFSMUpdateData != null) {
                this.currentState.update(ytFSMUpdateData.imageData, ytFSMUpdateData.imageWidth, ytFSMUpdateData.imageHeight, ytFSMUpdateData.imageType, ytFSMUpdateData.timeStamp);
            }
            return 0;
        }
        String str3 = TAG;
        YtLogger.m106579e(str3, "transitnow failed:" + str + " state is not found");
        return -1;
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        if (this.isStarted) {
            YtFSMUpdateData ytFSMUpdateData = new YtFSMUpdateData();
            ytFSMUpdateData.imageData = bArr;
            ytFSMUpdateData.imageWidth = i;
            ytFSMUpdateData.imageHeight = i2;
            ytFSMUpdateData.imageType = i3;
            ytFSMUpdateData.timeStamp = j;
            if (this.updateQueue.size() >= 10) {
                this.updateQueue.poll();
                YtLogger.m106582w(TAG, "drop frame");
            }
            this.updateQueue.add(ytFSMUpdateData);
            String str = TAG;
            YtLogger.m106580i(str, "debug_thread queue size:" + this.updateQueue.size());
        }
    }

    public void updateSDKSetting(JSONObject jSONObject) {
        for (YtFSMBaseState updateSDKSetting : this.stateMap.values()) {
            updateSDKSetting.updateSDKSetting(jSONObject);
        }
    }
}
