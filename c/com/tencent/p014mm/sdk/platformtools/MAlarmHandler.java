package com.tencent.p014mm.sdk.platformtools;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import junit.framework.Assert;

/* renamed from: com.tencent.mm.sdk.platformtools.MAlarmHandler */
public class MAlarmHandler {
    private static final int MAX_TIMERID = 8192;
    public static final long NEXT_FIRE_INTERVAL = Long.MAX_VALUE;
    private static final String TAG = "MicroMsg.MAlarmHandler";
    private static IBumper bumper;
    private static boolean initilized = false;
    private static Map<Integer, MAlarmHandler> maps = new HashMap();
    private static int timerID;
    private static boolean withNewStart;
    private final CallBack callback;
    private long interval = 0;
    private final boolean loop;
    private final int myTimerID;

    /* renamed from: ts */
    private long f347905ts = 0;

    /* renamed from: com.tencent.mm.sdk.platformtools.MAlarmHandler$CallBack */
    public interface CallBack {
        boolean onTimerExpired();
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.MAlarmHandler$IBumper */
    public interface IBumper {
        void cancel();

        void prepare();
    }

    public MAlarmHandler(CallBack callBack, boolean z) {
        Assert.assertTrue("bumper not initialized", initilized);
        this.callback = callBack;
        this.loop = z;
        this.myTimerID = incTimerID();
    }

    public static long fire() {
        IBumper iBumper;
        withNewStart = false;
        LinkedList linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        hashSet.addAll(maps.keySet());
        Iterator it = hashSet.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            MAlarmHandler mAlarmHandler = maps.get(num);
            if (mAlarmHandler != null) {
                long ticksToNow = Util.ticksToNow(mAlarmHandler.f347905ts);
                if (ticksToNow < 0) {
                    ticksToNow = 0;
                }
                long j2 = mAlarmHandler.interval;
                if (ticksToNow > j2) {
                    if (!mAlarmHandler.callback.onTimerExpired() || !mAlarmHandler.loop) {
                        linkedList.add(num);
                    } else {
                        j = mAlarmHandler.interval;
                    }
                    mAlarmHandler.f347905ts = Util.currentTicks();
                } else if (j2 - ticksToNow < j) {
                    j = j2 - ticksToNow;
                }
            }
        }
        for (int i = 0; i < linkedList.size(); i++) {
            maps.remove(linkedList.get(i));
        }
        if (!withNewStart && j == NEXT_FIRE_INTERVAL && (iBumper = bumper) != null) {
            iBumper.cancel();
            Log.m105926v(TAG, "cancel bumper for no more handler");
        }
        return j;
    }

    private static int incTimerID() {
        if (timerID >= 8192) {
            timerID = 0;
        }
        int i = timerID + 1;
        timerID = i;
        return i;
    }

    public static void initAlarmBumper(IBumper iBumper) {
        initilized = true;
        bumper = iBumper;
    }

    private static boolean needPrepare(long j) {
        Log.m105918d(TAG, "check need prepare: check=" + j);
        long j2 = NEXT_FIRE_INTERVAL;
        for (Map.Entry<Integer, MAlarmHandler> value : maps.entrySet()) {
            MAlarmHandler mAlarmHandler = (MAlarmHandler) value.getValue();
            if (mAlarmHandler != null) {
                long ticksToNow = Util.ticksToNow(mAlarmHandler.f347905ts);
                if (ticksToNow < 0) {
                    ticksToNow = 0;
                }
                long j3 = mAlarmHandler.interval;
                if (ticksToNow <= j3) {
                    if (j3 - ticksToNow < j2) {
                        j3 -= ticksToNow;
                    }
                }
                j2 = j3;
            }
        }
        return j2 > j;
    }

    public void finalize() {
        stopTimer();
        super.finalize();
    }

    public void startTimer(long j) {
        withNewStart = true;
        this.interval = j;
        this.f347905ts = Util.currentTicks();
        boolean needPrepare = needPrepare(this.interval);
        stopTimer();
        maps.put(Integer.valueOf(this.myTimerID), this);
        if (bumper != null && needPrepare) {
            Log.m105926v(TAG, "prepare bumper");
            bumper.prepare();
        }
    }

    public void stopTimer() {
        maps.remove(Integer.valueOf(this.myTimerID));
    }

    public boolean stopped() {
        return !maps.containsKey(Integer.valueOf(this.myTimerID));
    }
}
