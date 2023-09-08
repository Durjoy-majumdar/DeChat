package com.tencent.thumbplayer.tplayer.reportv2;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.thumbplayer.api.reportv2.ITPExtendReportController;
import com.tencent.thumbplayer.api.reportv2.ITPReportChannelListener;
import com.tencent.thumbplayer.api.reportv2.ITPReportInfoGetter;
import com.tencent.thumbplayer.event.ITPEventReceiver;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.reportv2.api.ITPPlayerInfoGetter;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPProcessLifeCycleEventPublisher;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class TPReportController implements ITPExtendReportController, ITPEventReceiver {
    private static final Map<Integer, Integer> CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP;
    private static final String TAG = "TPReportController";
    private static final long mSyncWaitTimeOutMs = 500;
    private Context mContext = null;
    private TPReportControllerState mControllerState = new TPReportControllerState();
    /* access modifiers changed from: private */
    public TPReportEventHandler mEventHandler = null;
    /* access modifiers changed from: private */
    public ITPReporter mITPReporter = null;
    private ITPPlayerInfoGetter mPlayerInfoGetter = null;
    private TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener mProcessLifeCycleChangeListener = new TPProcessLifeCycleEventPublisher.ITPOnProcessLifeCycleChangeListener() {
        public void onEvent(int i) {
            int i2;
            TPLogUtil.m21897i(TPReportController.TAG, "ProcessLifeCycleChangeListener eventId: " + i);
            if (i == 2) {
                i2 = 1002;
            } else if (i == 3) {
                i2 = 1001;
            } else {
                return;
            }
            TPReportController.this.mEventHandler.sendEmptyMessage(i2);
        }
    };
    private Object mReleaseSyncObjectLock = new Object();
    private CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> mReportChannelListenerList;
    private ITPReportInfoGetter mReportInfoGetter = null;
    private HandlerThread mReportThread = null;
    private TPReporterInitParams mReporterInitParams = new TPReporterInitParams();

    public class TPReportEventHandler extends Handler {
        public TPReportEventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            TPPlayerEventInfo.BaseEventInfo baseEventInfo = (TPPlayerEventInfo.BaseEventInfo) message.obj;
            TPReportController.this.dealSpecialEventBeforeReporterIfNeed(i, baseEventInfo);
            if (TPReportController.this.mITPReporter != null) {
                TPReportController.this.mITPReporter.onEvent(i, baseEventInfo);
            }
            TPReportController.this.dealSpecialEventAfterReporterIfNeed(i, baseEventInfo);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP = hashMap;
        hashMap.put(117, 0);
        hashMap.put(204, 103);
        hashMap.put(101, 1);
        hashMap.put(102, 2);
        hashMap.put(103, 3);
        hashMap.put(104, 4);
        hashMap.put(105, 5);
        hashMap.put(107, 5);
        hashMap.put(108, 5);
        hashMap.put(106, 6);
        hashMap.put(109, 7);
        hashMap.put(110, 8);
        hashMap.put(111, 9);
        hashMap.put(112, 10);
        hashMap.put(114, 11);
        hashMap.put(115, 12);
        hashMap.put(201, 100);
        hashMap.put(202, 101);
        hashMap.put(203, 102);
        hashMap.put(116, 14);
        hashMap.put(113, 13);
        hashMap.put(118, 15);
    }

    public TPReportController(Context context) {
        this.mContext = context.getApplicationContext();
        this.mReportChannelListenerList = new CopyOnWriteArrayList<>();
    }

    /* access modifiers changed from: private */
    public void dealSpecialEventAfterReporterIfNeed(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i == 5) {
            onPlayEnd(baseEventInfo);
        } else if (i == 1000) {
            onControllerRelease(baseEventInfo);
        }
    }

    /* access modifiers changed from: private */
    public void dealSpecialEventBeforeReporterIfNeed(int i, TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (i == 0) {
            onSetDataSource(baseEventInfo);
        } else if (i == 1) {
            onPrepareStart(baseEventInfo);
        } else if (i == 2) {
            onPrepareEnd(baseEventInfo);
        } else if (i == 6) {
            onPlayError(baseEventInfo);
        } else if (i == 103) {
            onGetConvertedDataSource(baseEventInfo);
        }
    }

    private void initReporter(int i) {
        if (this.mITPReporter != null) {
            TPLogUtil.m21899w(TAG, "mITPReporter has been create, do not create again.");
            return;
        }
        ITPReporter createReporterWithType = TPReporterFactory.createReporterWithType(i);
        this.mITPReporter = createReporterWithType;
        if (createReporterWithType == null) {
            TPLogUtil.m21899w(TAG, "initReporter(" + i + ") fail, mITPReporter is null.");
            return;
        }
        createReporterWithType.init(this.mContext, this.mReporterInitParams);
        this.mITPReporter.setReportInfoGetter(this.mReportInfoGetter);
        this.mITPReporter.setPlayerInfoGetter(this.mPlayerInfoGetter);
        Iterator<WeakReference<ITPReportChannelListener>> it = this.mReportChannelListenerList.iterator();
        while (it.hasNext()) {
            ITPReportChannelListener iTPReportChannelListener = (ITPReportChannelListener) it.next().get();
            if (iTPReportChannelListener != null) {
                this.mITPReporter.addReportChannelListener(iTPReportChannelListener);
            }
        }
    }

    private void onControllerRelease(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        TPLogUtil.m21897i(TAG, "onControllerRelease");
        synchronized (this.mReleaseSyncObjectLock) {
            if (this.mReportThread != null) {
                TPThreadPool.getInstance().recycle(this.mReportThread, this.mEventHandler);
                this.mReportThread = null;
                this.mEventHandler = null;
            }
            this.mReportChannelListenerList.clear();
            this.mReleaseSyncObjectLock.notifyAll();
            this.mReleaseSyncObjectLock = null;
        }
    }

    private void onGetConvertedDataSource(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof TPPlayerEventInfo.DTReturnConvertedUrlEventInfo) {
            this.mReporterInitParams.mConvertDataSourceETimeMs = ((TPPlayerEventInfo.DTReturnConvertedUrlEventInfo) baseEventInfo).getEventTimeSinceBootMs();
            TPLogUtil.m21897i(TAG, "onGetConvertedDataSource time:" + this.mReporterInitParams.mConvertDataSourceETimeMs);
        }
    }

    private void onPlayEnd(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        this.mControllerState.setState(1);
        ITPReporter iTPReporter = this.mITPReporter;
        if (iTPReporter != null) {
            iTPReporter.reset();
            this.mITPReporter = null;
        }
        this.mReporterInitParams = new TPReporterInitParams();
    }

    private void onPlayError(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (this.mControllerState.isMatchState(2)) {
            initReporter(2);
        }
        this.mControllerState.setState(1);
    }

    private void onPrepareEnd(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (!this.mControllerState.isMatchState(2)) {
            TPLogUtil.m21894e(TAG, "onPrepareEnd Current state is not match:" + this.mControllerState.toString());
            return;
        }
        this.mControllerState.setState(3);
        if (baseEventInfo instanceof TPPlayerEventInfo.PrepareEndEventInfo) {
            TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = (TPPlayerEventInfo.PrepareEndEventInfo) baseEventInfo;
            this.mReporterInitParams.mPlayerType = TPReportUtils.convertTPPlayerTypeToReportPlayerEnum(prepareEndEventInfo.getPlayerType());
            TPLogUtil.m21897i(TAG, "onPrepareEnd durationMs:" + prepareEndEventInfo.getDurationMs() + " playType:" + this.mReporterInitParams.mPlayerType);
            if (prepareEndEventInfo.getDurationMs() == 0) {
                initReporter(1);
            } else {
                initReporter(0);
            }
        }
    }

    private void onPrepareStart(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        this.mControllerState.setState(2);
        if (baseEventInfo instanceof TPPlayerEventInfo.PrepareStartEventInfo) {
            TPPlayerEventInfo.PrepareStartEventInfo prepareStartEventInfo = (TPPlayerEventInfo.PrepareStartEventInfo) baseEventInfo;
            this.mReporterInitParams.mTPPrepareStartOccurElapsedTimeMs = prepareStartEventInfo.getEventTimeSinceBootMs();
            this.mReporterInitParams.mTPPrepareStartOccurTimeSince1970Ms = prepareStartEventInfo.getEventTimeSince1970Ms();
            this.mReporterInitParams.mPlayFlowId = prepareStartEventInfo.getFlowId();
        }
    }

    private void onSetDataSource(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        if (baseEventInfo instanceof TPPlayerEventInfo.SetDataSourceEventInfo) {
            TPPlayerEventInfo.SetDataSourceEventInfo setDataSourceEventInfo = (TPPlayerEventInfo.SetDataSourceEventInfo) baseEventInfo;
            this.mReporterInitParams.mTPSetDataSourceTimeMs = setDataSourceEventInfo.getEventTimeSinceBootMs();
            this.mReporterInitParams.mOriginalUrl = setDataSourceEventInfo.getUrl();
            this.mReporterInitParams.mIsUseProxy = setDataSourceEventInfo.isIsUseProxy() ? 1 : 0;
            this.mReporterInitParams.mUrlProtocol = setDataSourceEventInfo.getUrlProtocol();
            TPLogUtil.m21897i(TAG, "onSetDataSource url:" + this.mReporterInitParams.mOriginalUrl + " isUseProxy:" + this.mReporterInitParams.mIsUseProxy + " urlProtocol:" + this.mReporterInitParams.mUrlProtocol);
        }
    }

    public void addReportChannelListener(ITPReportChannelListener iTPReportChannelListener) {
        CopyOnWriteArrayList<WeakReference<ITPReportChannelListener>> copyOnWriteArrayList = this.mReportChannelListenerList;
        if (copyOnWriteArrayList == null) {
            TPLogUtil.m21899w(TAG, "mReportChannelListenerList is null");
            return;
        }
        Iterator<WeakReference<ITPReportChannelListener>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((ITPReportChannelListener) it.next().get()) == iTPReportChannelListener) {
                TPLogUtil.m21899w(TAG, "mReportChannelListenerList has contain reportChannelListener");
                return;
            }
        }
        this.mReportChannelListenerList.add(new WeakReference(iTPReportChannelListener));
    }

    public void init() {
        this.mReportThread = TPThreadPool.getInstance().obtainHandleThread("TPReportController_Thread");
        this.mEventHandler = new TPReportEventHandler(this.mReportThread.getLooper());
        TPProcessLifeCycleEventPublisher.addEventListener(this.mProcessLifeCycleChangeListener);
    }

    public void onEvent(TPPlayerEventInfo.BaseEventInfo baseEventInfo) {
        Map<Integer, Integer> map = CAPTURE_EVENT_TO_PROCESSOR_EVENT_MAP;
        if (!map.containsKey(Integer.valueOf(baseEventInfo.getEventId()))) {
            TPLogUtil.m21899w(TAG, "EventId:" + baseEventInfo.getEventId() + " is not need process");
            return;
        }
        this.mEventHandler.obtainMessage(map.get(Integer.valueOf(baseEventInfo.getEventId())).intValue(), baseEventInfo).sendToTarget();
    }

    public void release() {
        TPLogUtil.m21897i(TAG, "release");
        TPProcessLifeCycleEventPublisher.removeEventListener(this.mProcessLifeCycleChangeListener);
        synchronized (this.mReleaseSyncObjectLock) {
            TPReportEventHandler tPReportEventHandler = this.mEventHandler;
            if (tPReportEventHandler != null) {
                tPReportEventHandler.sendEmptyMessage(1000);
            }
            try {
                this.mReleaseSyncObjectLock.wait(500);
            } catch (InterruptedException e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public void setPlayerInfoGetter(ITPPlayerInfoGetter iTPPlayerInfoGetter) {
        this.mPlayerInfoGetter = iTPPlayerInfoGetter;
    }

    public void setReportInfoGetter(ITPReportInfoGetter iTPReportInfoGetter) {
        this.mReportInfoGetter = iTPReportInfoGetter;
    }

    public void setReportToBeaconNeeded(boolean z) {
        TPLogUtil.m21897i(TAG, "reporting is needed:" + z);
        this.mReporterInitParams.mNeedReportToBeacon = Boolean.valueOf(z);
    }
}
