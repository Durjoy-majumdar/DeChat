package com.tencent.thumbplayer.datatransport.resourceloader;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest;
import com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLFileSystem;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLIOUtil;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class TPAssetResourceLoader implements ITPAssetResourceLoader {
    private static final int MSG_ON_START_READ_DATA = 256;
    private static final int MSG_ON_STOP_READ_DATA = 257;
    /* access modifiers changed from: private */
    public static String TAG = "TPAssetResourceLoader";
    private static final String mCacheDir = "resourceLoader";
    private String mBusinessFilePath = "";
    private EventHandler mCallbackForResourceLoaderHandler;
    /* access modifiers changed from: private */
    public TPAssetResourceLoadingContentInformationRequest mContentInformation;
    private String mContentType = "";
    private Context mContext;
    private String mDataCacheFilePath = "";
    /* access modifiers changed from: private */
    public long mDataTotalSize = 0;
    private String mFileSuffix = ".mp4";
    private HandlerThread mHandlerThread;
    private ArrayList<TPAssetResourceLoadingRequest> mLoadingRequests;
    private int mRequestNum = 0;
    /* access modifiers changed from: private */
    public ITPAssetResourceLoaderListener mTPAssetResourceLoaderListener;
    /* access modifiers changed from: private */
    public HandlerThread mWriteDataThread;

    public class EventHandler extends Handler {
        public EventHandler(Looper looper) {
            super(looper);
        }

        private boolean handleIsRequestToEnd(long j, long j2) {
            boolean z = TPAssetResourceLoader.this.mDataTotalSize > 0 && j2 + j >= TPAssetResourceLoader.this.mDataTotalSize;
            if (z) {
                TPAssetResourceLoader.this.clearRequestList();
            }
            return z;
        }

        private void handleRequestToLoad(long j, long j2, String str, int i, int i2) {
            TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest = new TPAssetResourceLoadingRequest(j, j2, i2, handleIsRequestToEnd(j, j2));
            tPAssetResourceLoadingRequest.setDataWriteThreadLooper(TPAssetResourceLoader.this.mWriteDataThread.getLooper());
            tPAssetResourceLoadingRequest.setDataWritePath(TPAssetResourceLoader.this.getDataFilePath(i, str));
            tPAssetResourceLoadingRequest.setContentInformation(TPAssetResourceLoader.this.mContentInformation);
            if (TPAssetResourceLoader.this.mTPAssetResourceLoaderListener.shouldWaitForLoadingOfRequestedResource(tPAssetResourceLoadingRequest)) {
                TPAssetResourceLoader.this.addRequest(tPAssetResourceLoadingRequest);
                String access$100 = TPAssetResourceLoader.TAG;
                TPLogUtil.m21897i(access$100, "add to mLoadingRequests, requestId: " + i2);
            }
        }

        public void handleMessage(Message message) {
            String access$100 = TPAssetResourceLoader.TAG;
            TPLogUtil.m21893d(access$100, "mCallbackForResourceLoaderHandler msg : " + message.what);
            if (TPAssetResourceLoader.this.mTPAssetResourceLoaderListener != null) {
                int i = message.what;
                if (i == 256) {
                    TPLogUtil.m21897i(TPAssetResourceLoader.TAG, "start read data");
                    StartReadDataParams startReadDataParams = (StartReadDataParams) message.obj;
                    long j = startReadDataParams.requestStart;
                    long j2 = startReadDataParams.requestEnd;
                    String str = startReadDataParams.fileKey;
                    int i2 = message.arg1;
                    int i3 = message.arg2;
                    String access$1002 = TPAssetResourceLoader.TAG;
                    TPLogUtil.m21897i(access$1002, "start read data, requestStart: " + j + " requestEnd:" + j2 + " requestId:" + i3);
                    long access$300 = TPAssetResourceLoader.this.getRequestLength(j, j2);
                    if (access$300 <= 0) {
                        TPLogUtil.m21894e(TPAssetResourceLoader.TAG, "requestLength invalid, check requestStart and requestEnd");
                    } else {
                        handleRequestToLoad(j, access$300, str, i2, i3);
                    }
                } else if (i == 257) {
                    TPLogUtil.m21897i(TPAssetResourceLoader.TAG, "stop read data");
                    TPAssetResourceLoader.this.handleStopReadData(message.arg1);
                }
            }
        }
    }

    public static class StartReadDataParams {
        public String fileKey;
        public long requestEnd;
        public long requestStart;

        private StartReadDataParams() {
        }
    }

    public TPAssetResourceLoader(Context context, Looper looper) {
        this.mContext = context;
        this.mLoadingRequests = new ArrayList<>();
        if (looper == null) {
            HandlerThread obtainShareThread = TPThreadPool.getInstance().obtainShareThread();
            this.mHandlerThread = obtainShareThread;
            looper = obtainShareThread.getLooper();
        }
        this.mCallbackForResourceLoaderHandler = new EventHandler(looper);
        this.mWriteDataThread = TPThreadPool.getInstance().obtainHandleThread("TPAssetResourceLoader-dataWriteThread");
    }

    /* access modifiers changed from: private */
    public synchronized void addRequest(TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest) {
        ArrayList<TPAssetResourceLoadingRequest> arrayList = this.mLoadingRequests;
        if (arrayList != null) {
            arrayList.add(tPAssetResourceLoadingRequest);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void clearRequestList() {
        ArrayList<TPAssetResourceLoadingRequest> arrayList = this.mLoadingRequests;
        if (arrayList != null) {
            Iterator<TPAssetResourceLoadingRequest> it = arrayList.iterator();
            while (it.hasNext()) {
                ITPAssetResourceLoadingRequest next = it.next();
                ((TPAssetResourceLoadingRequest) next).cancelRequest();
                this.mTPAssetResourceLoaderListener.didCancelLoadingRequest(next);
            }
            this.mLoadingRequests.clear();
        }
    }

    private String getBusinessFilePath() {
        return this.mBusinessFilePath;
    }

    private String getDataCacheFilePath(Context context, int i) {
        if (TextUtils.isEmpty(this.mDataCacheFilePath)) {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            File externalCacheFile = TPDLFileSystem.getExternalCacheFile(context, mCacheDir, format + "-" + i + this.mFileSuffix);
            TPDLIOUtil.createFile(externalCacheFile);
            this.mDataCacheFilePath = externalCacheFile.getAbsolutePath();
        }
        return this.mDataCacheFilePath;
    }

    private synchronized int getDataReadyLength(long j) {
        if (this.mLoadingRequests == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.mLoadingRequests.size(); i2++) {
            i = Math.max(i, this.mLoadingRequests.get(i2).getDataReadyLength(j));
        }
        return i;
    }

    private synchronized TPAssetResourceLoadingRequest getLoadingRequestWithNum(int i) {
        if (this.mLoadingRequests == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.mLoadingRequests.size(); i2++) {
            TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest = this.mLoadingRequests.get(i2);
            if (tPAssetResourceLoadingRequest.getLoadingDataRequest().getRequestNum() == i) {
                return tPAssetResourceLoadingRequest;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public long getRequestLength(long j, long j2) {
        if (j2 > 0) {
            return j2 - j;
        }
        long j3 = this.mDataTotalSize;
        if (j3 <= 0) {
            return 536870912;
        }
        return j3 - j;
    }

    private void handleResourceLoaderCallback(int i, int i2, int i3, Object obj) {
        EventHandler eventHandler = this.mCallbackForResourceLoaderHandler;
        if (eventHandler != null) {
            Message obtainMessage = eventHandler.obtainMessage();
            obtainMessage.what = i;
            obtainMessage.arg1 = i2;
            obtainMessage.arg2 = i3;
            obtainMessage.obj = obj;
            this.mCallbackForResourceLoaderHandler.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: private */
    public void handleStopReadData(int i) {
        TPAssetResourceLoadingRequest loadingRequestWithNum = getLoadingRequestWithNum(i);
        if (loadingRequestWithNum == null) {
            String str = TAG;
            TPLogUtil.m21894e(str, "TPAssetLoader can't find the request " + i + " with current loading requests");
            return;
        }
        loadingRequestWithNum.cancelRequest();
        String str2 = TAG;
        TPLogUtil.m21897i(str2, "handleStopReadData, cancel the loading request with id " + i);
        removeRequest(loadingRequestWithNum);
        this.mTPAssetResourceLoaderListener.didCancelLoadingRequest(loadingRequestWithNum);
    }

    private synchronized void removeRequest(TPAssetResourceLoadingRequest tPAssetResourceLoadingRequest) {
        ArrayList<TPAssetResourceLoadingRequest> arrayList = this.mLoadingRequests;
        if (arrayList != null) {
            arrayList.remove(tPAssetResourceLoadingRequest);
        }
    }

    public void fillInContentInformation() {
        if (this.mTPAssetResourceLoaderListener == null) {
            TPLogUtil.m21894e(TAG, "listener not set");
            return;
        }
        TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest = new TPAssetResourceLoadingContentInformationRequest();
        this.mContentInformation = tPAssetResourceLoadingContentInformationRequest;
        this.mTPAssetResourceLoaderListener.fillInContentInformation(tPAssetResourceLoadingContentInformationRequest);
        TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest2 = this.mContentInformation;
        this.mContentType = tPAssetResourceLoadingContentInformationRequest2.contentType;
        this.mDataTotalSize = tPAssetResourceLoadingContentInformationRequest2.dataTotalSize;
        this.mBusinessFilePath = tPAssetResourceLoadingContentInformationRequest2.dataFilePath;
        String str = TAG;
        TPLogUtil.m21897i(str, "proxy start, mDataTotalSize: " + this.mDataTotalSize + " businessPath:" + this.mBusinessFilePath);
    }

    public String getContentType(int i, String str) {
        return this.mContentType;
    }

    public String getDataFilePath(int i, String str) {
        String businessFilePath = getBusinessFilePath();
        return !TextUtils.isEmpty(businessFilePath) ? businessFilePath : getDataCacheFilePath(this.mContext, i);
    }

    public long getDataTotalSize(int i, String str) {
        return this.mDataTotalSize;
    }

    public int onReadData(int i, String str, long j, long j2) {
        int min = (int) Math.min((long) getDataReadyLength(j), j2);
        if (min <= 0) {
            return -1;
        }
        String str2 = TAG;
        TPLogUtil.m21893d(str2, "onReadData, fileId: " + i + " readOffset: " + j + " readLength:" + j2 + " readyLength:" + min);
        return min;
    }

    public int onStartReadData(int i, String str, long j, long j2) {
        if (this.mTPAssetResourceLoaderListener == null) {
            TPLogUtil.m21894e(TAG, "listener not set");
            return 0;
        }
        String str2 = TAG;
        TPLogUtil.m21897i(str2, "onStartReadData, fileId:" + i + ", fileKey:" + str + ", requestStart:" + j + ", requestEnd:" + j2);
        int i2 = this.mRequestNum + 1;
        StartReadDataParams startReadDataParams = new StartReadDataParams();
        startReadDataParams.requestStart = j;
        startReadDataParams.requestEnd = j2;
        startReadDataParams.fileKey = str;
        handleResourceLoaderCallback(256, i, i2, startReadDataParams);
        this.mRequestNum = i2;
        return i2;
    }

    public int onStopReadData(int i, String str, int i2) {
        if (this.mTPAssetResourceLoaderListener == null) {
            TPLogUtil.m21894e(TAG, "listener not set");
            return 0;
        }
        handleResourceLoaderCallback(257, i2, 0, (Object) null);
        return 0;
    }

    public void release() {
        TPLogUtil.m21897i(TAG, "release start");
        reset();
        TPThreadPool.getInstance().recycle(this.mHandlerThread, this.mCallbackForResourceLoaderHandler);
        TPThreadPool.getInstance().recycle(this.mWriteDataThread, (Handler) null);
        this.mHandlerThread = null;
        this.mWriteDataThread = null;
        this.mCallbackForResourceLoaderHandler = null;
        this.mLoadingRequests = null;
    }

    public void reset() {
        TPLogUtil.m21897i(TAG, "reset start");
        clearRequestList();
        this.mDataTotalSize = 0;
        this.mContentType = "";
        this.mBusinessFilePath = "";
        if (!TextUtils.isEmpty(this.mDataCacheFilePath)) {
            try {
                new File(this.mDataCacheFilePath).deleteOnExit();
                this.mDataCacheFilePath = "";
            } catch (Exception e) {
                String str = TAG;
                TPLogUtil.m21894e(str, "reset, delete cache file has exception:" + e.toString());
            }
        }
        EventHandler eventHandler = this.mCallbackForResourceLoaderHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void setTPAssetResourceLoaderListener(ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener) {
        this.mTPAssetResourceLoaderListener = iTPAssetResourceLoaderListener;
    }
}
