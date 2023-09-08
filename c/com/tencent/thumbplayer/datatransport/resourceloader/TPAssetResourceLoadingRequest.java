package com.tencent.thumbplayer.datatransport.resourceloader;

import android.os.Looper;
import com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoadingRequest;
import com.tencent.thumbplayer.api.resourceloader.TPAssetResourceLoadingContentInformationRequest;

public class TPAssetResourceLoadingRequest implements ITPAssetResourceLoadingRequest {
    private TPAssetResourceLoadingContentInformationRequest mContentInformation;
    private boolean mIsCancelled = false;
    private boolean mIsFinished = false;
    private TPAssetResourceLoadingDataRequest mLoadingDataRequest;
    private int mRequestNum;

    public TPAssetResourceLoadingRequest(long j, long j2, int i, boolean z) {
        this.mRequestNum = i;
        TPAssetResourceLoadingDataRequest tPAssetResourceLoadingDataRequest = new TPAssetResourceLoadingDataRequest(j, j2, z);
        this.mLoadingDataRequest = tPAssetResourceLoadingDataRequest;
        tPAssetResourceLoadingDataRequest.setRequestNum(i);
    }

    public synchronized void cancelRequest() {
        this.mIsCancelled = true;
        this.mLoadingDataRequest.release();
    }

    public synchronized void finishLoading() {
        this.mIsFinished = true;
    }

    public TPAssetResourceLoadingContentInformationRequest getContentInformation() {
        return this.mContentInformation;
    }

    public int getDataReadyLength(long j) {
        return this.mLoadingDataRequest.getDataReadyLength(j);
    }

    public synchronized boolean isCancelled() {
        return this.mIsCancelled;
    }

    public synchronized boolean isFinished() {
        return this.mIsFinished;
    }

    public void setContentInformation(TPAssetResourceLoadingContentInformationRequest tPAssetResourceLoadingContentInformationRequest) {
        this.mContentInformation = tPAssetResourceLoadingContentInformationRequest;
    }

    public void setDataWritePath(String str) {
        this.mLoadingDataRequest.setDataWritePath(str);
    }

    public void setDataWriteThreadLooper(Looper looper) {
        this.mLoadingDataRequest.setDataWriteThreadLooper(looper);
    }

    public TPAssetResourceLoadingDataRequest getLoadingDataRequest() {
        return this.mLoadingDataRequest;
    }
}
