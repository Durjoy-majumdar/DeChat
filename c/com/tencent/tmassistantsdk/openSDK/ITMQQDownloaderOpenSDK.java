package com.tencent.tmassistantsdk.openSDK;

import android.content.Context;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;

public interface ITMQQDownloaderOpenSDK {
    long addDownloadTaskFromAuthorize(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str);

    long addDownloadTaskFromTaskList(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2);

    void destroyQQDownloaderOpenSDK();

    TMAssistantDownloadTaskInfo getDownloadTaskState(TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam);

    void initQQDownloaderOpenSDK(Context context);

    boolean registerListener(ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener);

    boolean removeDownloadTask(long j);

    void startToAuthorized(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, String str);

    void startToDownloadTaskList(Context context);

    void startToDownloadTaskList(Context context, TMQQDownloaderOpenSDKParam tMQQDownloaderOpenSDKParam, boolean z, boolean z2);

    boolean unregisterListener(ITMQQDownloaderOpenSDKListener iTMQQDownloaderOpenSDKListener);
}
