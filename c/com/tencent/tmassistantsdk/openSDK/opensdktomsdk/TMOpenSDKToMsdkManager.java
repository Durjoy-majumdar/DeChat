package com.tencent.tmassistantsdk.openSDK.opensdktomsdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.pluginsdk.model.app.C44563k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannel;
import com.tencent.tmassistantsdk.channel.TMAssistantSDKChannelDataItem;
import com.tencent.tmassistantsdk.downloadclient.ITMAssistantDownloadSDKClientListener;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClient;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKManager;
import com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadTaskInfo;
import com.tencent.tmassistantsdk.logreport.TipsInfoReportManager;
import com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest;
import com.tencent.tmassistantsdk.network.IGetAuthorizedHttpRequestListenner;
import com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDK;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.component.PopDialog;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.ActionButton;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.TipsInfo;
import com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog;
import com.tencent.tmassistantsdk.util.Res;
import com.tencent.tmassistantsdk.util.TMLog;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nd3.C47223a;

public class TMOpenSDKToMsdkManager {
    public static final String CLIENT_NAME = "downloadSDKClient";
    public static final String TAG = "OpensdkToMsdkManager";
    public static TMOpenSDKToMsdkManager mInstance;
    public int authorizedState = 0;
    public PopDialog dialog = null;
    public boolean hasNotify = false;
    public long insertActionId = -1;
    public boolean isInstallFinished = false;
    public TMOpenSDKAuthorizedInfo mAuthorizedInfo = null;
    public TMAssistantDownloadSDKClient mClient = null;
    public Context mContext = null;
    public ITMAssistantDownloadSDKClientListener mDownloadSDKListener = new ITMAssistantDownloadSDKClientListener() {
        public void OnDownloadSDKTaskProgressChanged(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, String str, long j, long j2) {
            Message message = new Message();
            message.what = 1;
            Bundle bundle = new Bundle();
            bundle.putLong("receiveDataLen", j);
            bundle.putLong("totalDataLen", j2);
            message.setData(bundle);
            TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
        }

        public void OnDownloadSDKTaskStateChanged(final TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient, final String str, int i, int i2, String str2, boolean z, boolean z2) {
            TMLog.m164114i(TMOpenSDKToMsdkManager.TAG, "OnDownloadSDKTaskStateChanged client:" + tMAssistantDownloadSDKClient + " | state:" + i + " | errorcode:" + i2 + " | errorMsg:" + str2);
            if (tMAssistantDownloadSDKClient != null && !TextUtils.isEmpty(str)) {
                if (4 == i) {
                    TMOpenSDKToMsdkManager.this.mSubMessageHandler.post(new Runnable() {
                        public void run() {
                            try {
                                String str = tMAssistantDownloadSDKClient.getDownloadTaskState(str).mSavePath;
                                if (!TextUtils.isEmpty(str)) {
                                    Message message = new Message();
                                    message.what = 0;
                                    message.obj = str;
                                    TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                                }
                            } catch (Exception e) {
                                Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e, "", new Object[0]);
                            }
                        }
                    });
                } else if (5 == i) {
                    Message message = new Message();
                    message.what = 3;
                    TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                }
            }
        }

        public void OnDwonloadSDKServiceInvalid(TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient) {
        }
    };
    public String mDownloadUrl = null;
    public GetAuthorizedHttpRequest mHttpRequest = null;
    public MMHandler mMainMessageHandler = null;
    public TMQQDownloaderOpenSDK mOpenSDK = null;
    public IGetAuthorizedHttpRequestListenner mRequestListener = new IGetAuthorizedHttpRequestListenner() {
        public void onGetAuthorizedRequestFinished(AuthorizedResult authorizedResult, int i) {
            Message message = new Message();
            if (i != 0) {
                message.what = 5;
                message.obj = Integer.valueOf(i);
            } else if (authorizedResult != null) {
                message.what = 4;
                message.obj = authorizedResult;
            } else {
                return;
            }
            TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
        }
    };
    public MMHandler mSubMessageHandler = null;
    public HandlerThread mSubMessagehandlerThread = null;
    public int mSupportVersionCode = 0;
    public ITMOpenSDKToMsdkListener mToMsdkListener = null;
    public View.OnClickListener negativeBtnListenner = new View.OnClickListener() {
        private byte _hellAccFlag_;

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (TMOpenSDKToMsdkManager.this.dialog.isShowing()) {
                TMOpenSDKToMsdkManager.this.dialog.dismiss();
                TMOpenSDKToMsdkManager.this.mHttpRequest = null;
            }
            TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
            createTipsInfoLog.cancelBtnClickCount++;
            TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
            try {
                TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = TMOpenSDKToMsdkManager.this;
                if (tMOpenSDKToMsdkManager.mClient != null) {
                    tMOpenSDKToMsdkManager.pauseDownloadTask(tMOpenSDKToMsdkManager.mDownloadUrl);
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e, "", new Object[0]);
            }
            TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager2 = TMOpenSDKToMsdkManager.this;
            if (tMOpenSDKToMsdkManager2.authorizedState == 2) {
                tMOpenSDKToMsdkManager2.notifyAuthorizedFinished(true, tMOpenSDKToMsdkManager2.mAuthorizedInfo);
            } else {
                tMOpenSDKToMsdkManager2.notifyAuthorizedFinished(false, tMOpenSDKToMsdkManager2.mAuthorizedInfo);
            }
            C117292a.m165361g(this, "com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };
    public View.OnClickListener positiveBtnListener = new View.OnClickListener() {
        private byte _hellAccFlag_;

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (TMOpenSDKToMsdkManager.this.mContext == null) {
                C117292a.m165361g(this, "com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ActionButton actionButton = (ActionButton) view.getTag();
            try {
                TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = TMOpenSDKToMsdkManager.this;
                int checkQQDownloaderInstalled = tMOpenSDKToMsdkManager.mOpenSDK.checkQQDownloaderInstalled(tMOpenSDKToMsdkManager.mSupportVersionCode);
                if (checkQQDownloaderInstalled == 0) {
                    try {
                        TMOpenSDKToMsdkManager.this.startToQQDownloaderAuthorized(actionButton.jumpUrl);
                    } catch (Exception e) {
                        Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e, "", new Object[0]);
                    }
                } else if (checkQQDownloaderInstalled == 1) {
                    TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager2 = TMOpenSDKToMsdkManager.this;
                    tMOpenSDKToMsdkManager2.startDownloadTask(tMOpenSDKToMsdkManager2.mDownloadUrl, actionButton.jumpUrl);
                } else if (checkQQDownloaderInstalled == 2) {
                    TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager3 = TMOpenSDKToMsdkManager.this;
                    tMOpenSDKToMsdkManager3.startDownloadTask(tMOpenSDKToMsdkManager3.mDownloadUrl, actionButton.jumpUrl);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e2, "", new Object[0]);
            }
            C117292a.m165361g(this, "com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };
    public View.OnClickListener retryBtnListener = new View.OnClickListener() {
        private byte _hellAccFlag_;

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = TMOpenSDKToMsdkManager.this;
            TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo = tMOpenSDKToMsdkManager.mAuthorizedInfo;
            if (tMOpenSDKAuthorizedInfo == null) {
                C117292a.m165361g(this, "com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Context context = tMOpenSDKToMsdkManager.mContext;
            if (context != null) {
                tMOpenSDKToMsdkManager.getUserAuthorizedInfo(tMOpenSDKAuthorizedInfo, context);
            }
            TMOpenSDKToMsdkManager.this.dialog.dismiss();
            C117292a.m165361g(this, "com/tencent/tmassistantsdk/openSDK/opensdktomsdk/TMOpenSDKToMsdkManager$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    };
    public TMAssistantSDKChannel sdkChannel = null;

    private TMOpenSDKToMsdkManager(Context context) {
        this.mContext = context;
    }

    public static String about() {
        return "TMOpenSDKToMsdkManager_2014_04_01_19_51_release_25434";
    }

    public static synchronized TMOpenSDKToMsdkManager getInstance(Context context) {
        TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager;
        synchronized (TMOpenSDKToMsdkManager.class) {
            if (mInstance == null) {
                mInstance = new TMOpenSDKToMsdkManager(context);
            }
            tMOpenSDKToMsdkManager = mInstance;
        }
        return tMOpenSDKToMsdkManager;
    }

    public void continueDownload() {
        this.mSubMessageHandler.post(new Runnable() {
            public void run() {
                try {
                    TMAssistantDownloadTaskInfo downloadTaskState = TMOpenSDKToMsdkManager.this.getClient().getDownloadTaskState(TMOpenSDKToMsdkManager.this.mDownloadUrl);
                    if (downloadTaskState != null) {
                        int i = downloadTaskState.mState;
                        if (i == 3) {
                            Message message = new Message();
                            message.what = 6;
                            Bundle bundle = new Bundle();
                            bundle.putLong("receiveDataLen", downloadTaskState.mReceiveDataLen);
                            bundle.putLong("totalDataLen", downloadTaskState.mTotalDataLen);
                            message.setData(bundle);
                            TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                        } else if (i == 4) {
                            Message message2 = new Message();
                            message2.what = 0;
                            message2.arg1 = 1;
                            message2.obj = downloadTaskState.mSavePath;
                            TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message2);
                        }
                    }
                    if (downloadTaskState == null || downloadTaskState.mState != 4) {
                        TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                        createTipsInfoLog.downloadTipsCount++;
                        TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
                        return;
                    }
                    TipsInfoLog createTipsInfoLog2 = TipsInfoReportManager.getInstance().createTipsInfoLog(TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                    createTipsInfoLog2.installTipsCount++;
                    TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog2);
                } catch (Exception e) {
                    Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e, "", new Object[0]);
                }
            }
        });
    }

    public TMAssistantDownloadSDKClient getClient() {
        Context context = this.mContext;
        if (context == null) {
            return null;
        }
        TMAssistantDownloadSDKClient tMAssistantDownloadSDKClient = this.mClient;
        if (tMAssistantDownloadSDKClient != null) {
            return tMAssistantDownloadSDKClient;
        }
        TMAssistantDownloadSDKClient downloadSDKClient = TMAssistantDownloadSDKManager.getInstance(context).getDownloadSDKClient(CLIENT_NAME);
        downloadSDKClient.registerDownloadTaskListener(this.mDownloadSDKListener);
        this.mClient = downloadSDKClient;
        return downloadSDKClient;
    }

    public void getUserAuthorizedInfo(TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo, Context context) {
        if (context != null) {
            this.mContext = context;
        }
        TMLog.m164114i(TAG, "getUserAuthorizedInfo method called!");
        this.hasNotify = false;
        GetAuthorizedHttpRequest getAuthorizedHttpRequest = this.mHttpRequest;
        if (getAuthorizedHttpRequest != null) {
            TMLog.m164114i(TAG, "mHttpRequest != null, request didn't finish!");
        } else if (tMOpenSDKAuthorizedInfo != null) {
            this.mAuthorizedInfo = tMOpenSDKAuthorizedInfo;
            if (getAuthorizedHttpRequest == null) {
                this.authorizedState = 1;
                GetAuthorizedHttpRequest getAuthorizedHttpRequest2 = new GetAuthorizedHttpRequest();
                this.mHttpRequest = getAuthorizedHttpRequest2;
                getAuthorizedHttpRequest2.setListenner(this.mRequestListener);
                this.mHttpRequest.sendRequest(tMOpenSDKAuthorizedInfo);
            }
        } else {
            TMLog.m164114i(TAG, "AuthorizedInfo object is null!");
        }
    }

    public void handleDownloadContinue(long j, long j2) {
        Context context = this.mContext;
        if (context == null) {
            TMLog.m164114i(TAG, "handleDownloading context = null!");
            return;
        }
        Res res = new Res(context);
        String string = this.mContext.getString(res.string("white_list_positive_continue"));
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        float f = (float) j2;
        sb.append((int) ((((float) (100 * j)) + 0.0f) / f));
        sb.append("%)");
        String sb4 = sb.toString();
        TextView textView = this.dialog.downloadText;
        textView.setText(string + sb4);
        ProgressBar progressBar = this.dialog.downloadProgressBar;
        progressBar.setProgress((int) (((((float) j) + 0.0f) / f) * ((float) progressBar.getMax())));
        if (this.dialog.downloadProgressBar.getProgress() > 0) {
            this.dialog.setPositiveBtnBgResource(res.drawable("com_tencent_tmassistant_sdk_button_bg"));
        }
    }

    public void handleDownloadFailed() {
        Context context = this.mContext;
        if (context == null) {
            TMLog.m164114i(TAG, "handleDownloading context = null!");
            return;
        }
        Res res = new Res(context);
        this.dialog.setPositiveBtnEnable(true);
        this.dialog.downloadText.setText(this.mContext.getString(res.string("white_list_positive_retry")));
        if (this.dialog.downloadProgressBar.getProgress() > 0) {
            this.dialog.setPositiveBtnBgResource(res.drawable("com_tencent_tmassistant_sdk_button_bg"));
        }
    }

    public void handleDownloading(long j, long j2) {
        Context context = this.mContext;
        if (context == null) {
            TMLog.m164114i(TAG, "handleDownloading context = null!");
            return;
        }
        String string = this.mContext.getString(new Res(context).string("white_list_positive_downloading"));
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        float f = (float) j2;
        sb.append((int) ((((float) (100 * j)) + 0.0f) / f));
        sb.append("%)");
        String sb4 = sb.toString();
        TextView textView = this.dialog.downloadText;
        textView.setText(string + sb4);
        ProgressBar progressBar = this.dialog.downloadProgressBar;
        progressBar.setProgress((int) (((((float) j) + 0.0f) / f) * ((float) progressBar.getMax())));
        TMLog.m164114i(TAG, "handleDownloading : receivedlen:" + j + " | totalLen:" + j2);
    }

    public void handleInstall(String str, int i) {
        Context context = this.mContext;
        if (context != null) {
            Res res = new Res(context);
            this.dialog.setPositiveBtnEnable(true);
            this.dialog.downloadText.setText(this.mContext.getString(res.string("white_list_positive_install")));
            Context context2 = this.mContext;
            if (context2 == null) {
                TMLog.m164114i(TAG, "handleDownloading context = null!");
                return;
            }
            this.isInstallFinished = true;
            if (i != 1) {
                C44563k0.m48979d(context2, str, (C47223a) null, false);
            }
        }
    }

    public void initOpenSDK(ITMOpenSDKToMsdkListener iTMOpenSDKToMsdkListener) {
        TMQQDownloaderOpenSDK instance = TMQQDownloaderOpenSDK.getInstance();
        this.mOpenSDK = instance;
        instance.initQQDownloaderOpenSDK(this.mContext);
        this.mToMsdkListener = iTMOpenSDKToMsdkListener;
        this.sdkChannel = new TMAssistantSDKChannel();
        this.mSubMessageHandler = new MMHandler("OpenSDKToMsdkManager");
        this.mMainMessageHandler = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new MMHandler.Callback() {
            public boolean handleMessage(Message message) {
                Bundle data;
                int i = message.what;
                if (i == 0) {
                    int i2 = message.arg1;
                    TMOpenSDKToMsdkManager.this.handleInstall(message.obj.toString(), i2);
                    return false;
                } else if (i == 1) {
                    Bundle data2 = message.getData();
                    if (data2 == null) {
                        return false;
                    }
                    TMOpenSDKToMsdkManager.this.handleDownloading(data2.getLong("receiveDataLen"), data2.getLong("totalDataLen"));
                    return false;
                } else if (i == 3) {
                    TMOpenSDKToMsdkManager.this.handleDownloadFailed();
                    return false;
                } else if (i == 4) {
                    AuthorizedResult authorizedResult = (AuthorizedResult) message.obj;
                    if (authorizedResult == null) {
                        return false;
                    }
                    TMOpenSDKToMsdkManager.this.onNetworkFinishedSuccess(authorizedResult);
                    return false;
                } else if (i == 5) {
                    TMOpenSDKToMsdkManager.this.onNetworkFinishedFailed(((Integer) message.obj).intValue());
                    return false;
                } else if (i != 6 || (data = message.getData()) == null) {
                    return false;
                } else {
                    TMOpenSDKToMsdkManager.this.handleDownloadContinue(data.getLong("receiveDataLen"), data.getLong("totalDataLen"));
                    return false;
                }
            }
        });
    }

    public boolean isExitsAction(long j) {
        TMAssistantSDKChannel tMAssistantSDKChannel;
        if (j < 0 || (tMAssistantSDKChannel = this.sdkChannel) == null) {
            return false;
        }
        Iterator<TMAssistantSDKChannelDataItem> it = tMAssistantSDKChannel.getChannelDataItemList().iterator();
        while (it.hasNext()) {
            TMAssistantSDKChannelDataItem next = it.next();
            if (((long) next.mDBIdentity) == j && next.mDataItemEndTime - next.mDataItemStartTime <= 300000) {
                return true;
            }
        }
        return false;
    }

    public void notifyAuthorizedFinished(boolean z, TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        TMLog.m164114i(TAG, "before realy notifyAuthorizedFinished: TMOpenSDKAuthorizedInfo:" + this.mAuthorizedInfo);
        if (this.mToMsdkListener == null) {
            TMLog.m164114i(TAG, "before notifyAuthorizedFinished: mToMsdkListener = null !");
        }
        if (this.mToMsdkListener != null && this.mAuthorizedInfo != null) {
            TMLog.m164114i(TAG, "notifyAuthorizedFinished: result:" + z);
            this.mToMsdkListener.onAuthorizedFinished(z, this.mAuthorizedInfo);
            this.mHttpRequest = null;
            this.hasNotify = true;
        }
    }

    public void onDestroy() {
        PopDialog popDialog = this.dialog;
        if (popDialog != null && popDialog.isShowing()) {
            this.dialog.dismiss();
        }
        TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK = this.mOpenSDK;
        if (tMQQDownloaderOpenSDK != null) {
            tMQQDownloaderOpenSDK.destroyQQDownloaderOpenSDK();
        }
        this.mToMsdkListener = null;
        this.hasNotify = false;
        this.isInstallFinished = false;
        this.authorizedState = 0;
        this.mHttpRequest = null;
        this.mAuthorizedInfo = null;
        this.sdkChannel = null;
        this.insertActionId = -1;
        Context context = this.mContext;
        if (context != null) {
            TMAssistantDownloadSDKManager.closeAllService(context);
        }
        this.mClient = null;
    }

    public void onNetworkException(int i) {
        Context context = this.mContext;
        if (context != null) {
            Res res = new Res(context);
            String string = 1 == i ? this.mContext.getString(res.string("white_list_network_not_connected")) : this.mContext.getString(res.string("white_list_network_error"));
            TipsInfo tipsInfo = new TipsInfo();
            tipsInfo.title = this.mContext.getString(res.string("white_list_dlg_title"));
            tipsInfo.content = string;
            ArrayList<ActionButton> arrayList = new ArrayList<>();
            ActionButton actionButton = new ActionButton();
            actionButton.jumpType = 3;
            arrayList.add(actionButton);
            String string2 = this.mContext.getString(res.string("white_list_negtive_known"));
            actionButton.textInstalled = string2;
            actionButton.textUninstalled = string2;
            tipsInfo.actionButton = arrayList;
            showDialog(tipsInfo);
            this.mHttpRequest = null;
            this.mDownloadUrl = "";
            this.authorizedState = 3;
            TMLog.m164114i(TAG, "network error happened!");
            TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
            createTipsInfoLog.networkErrorTipsCount++;
            TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
        }
    }

    public void onNetworkFinishedFailed(int i) {
        if (i == 606 || i == 602 || i == 601 || i == 704) {
            onServerException(i);
        } else {
            onNetworkException(i);
        }
    }

    public void onNetworkFinishedSuccess(AuthorizedResult authorizedResult) {
        this.mDownloadUrl = authorizedResult.downloadUrl;
        this.mSupportVersionCode = authorizedResult.versionCode;
        this.mHttpRequest = null;
        TMLog.m164114i(TAG, "onNetworkFinishedSuccess! authorizedResult.hasAuthoried=" + authorizedResult.hasAuthoried + "  listenner:" + this.mToMsdkListener + "  authroizedinfo:" + this.mAuthorizedInfo);
        if (authorizedResult.hasAuthoried == 1) {
            this.authorizedState = 2;
            TipsInfo tipsInfo = authorizedResult.tipsInfo;
            if (tipsInfo != null) {
                showDialog(tipsInfo);
            } else {
                notifyAuthorizedFinished(true, this.mAuthorizedInfo);
            }
        } else {
            this.authorizedState = 3;
            TipsInfo tipsInfo2 = authorizedResult.tipsInfo;
            if (tipsInfo2 != null) {
                showDialog(tipsInfo2);
                return;
            }
            onServerException(authorizedResult.errorCode);
            TMLog.m164114i(TAG, "not in white list and no tips!");
        }
    }

    public void onResume() {
        int i;
        Context context;
        tryToCloseDialog();
        if (this.hasNotify || (i = this.authorizedState) == 2) {
            return;
        }
        if ((i == 3 || i == 0) && (context = this.mContext) != null) {
            getUserAuthorizedInfo(this.mAuthorizedInfo, context);
        }
    }

    public void onServerException(int i) {
        Context context = this.mContext;
        if (context != null) {
            Res res = new Res(context);
            TipsInfo tipsInfo = new TipsInfo();
            tipsInfo.title = this.mContext.getString(res.string("white_list_dlg_title"));
            if (i == 602 || i == 601) {
                tipsInfo.content = this.mContext.getString(res.string("white_list_network_error"));
            } else {
                tipsInfo.content = this.mContext.getString(res.string("white_list_server_error"));
            }
            ArrayList<ActionButton> arrayList = new ArrayList<>();
            ActionButton actionButton = new ActionButton();
            actionButton.jumpType = 4;
            String string = this.mContext.getString(res.string("white_list_positive_retry_again"));
            actionButton.textInstalled = string;
            actionButton.textUninstalled = string;
            ActionButton actionButton2 = new ActionButton();
            actionButton2.jumpType = 3;
            String string2 = this.mContext.getString(res.string("white_list_negtive"));
            actionButton2.textInstalled = string2;
            actionButton2.textUninstalled = string2;
            arrayList.add(actionButton);
            arrayList.add(actionButton2);
            tipsInfo.actionButton = arrayList;
            showDialog(tipsInfo);
            this.mHttpRequest = null;
            this.mDownloadUrl = "";
            this.authorizedState = 3;
            TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
            createTipsInfoLog.networkErrorTipsCount++;
            TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
        }
    }

    public void pauseDownloadTask(final String str) {
        if (!TextUtils.isEmpty(str) && this.mAuthorizedInfo != null) {
            this.mSubMessageHandler.post(new Runnable() {
                public void run() {
                    TMAssistantDownloadSDKClient client = TMOpenSDKToMsdkManager.this.getClient();
                    try {
                        if (client.getDownloadTaskState(str) != null) {
                            client.pauseDownloadTask(str);
                        } else {
                            TMLog.m164114i(TMOpenSDKToMsdkManager.TAG, "getDownloadTaskState taskinfo is null!");
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e, "", new Object[0]);
                    }
                }
            });
        }
    }

    public void showDialog(TipsInfo tipsInfo) {
        ArrayList<ActionButton> arrayList;
        if (this.mContext != null) {
            PopDialog popDialog = this.dialog;
            if (popDialog == null || !popDialog.isShowing()) {
                Context context = this.mContext;
                if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                    Res res = new Res(this.mContext);
                    if (tipsInfo != null && (arrayList = tipsInfo.actionButton) != null && arrayList.size() > 0) {
                        PopDialog popDialog2 = new PopDialog(this.mContext, res.style("while_list_dialog"), arrayList.size());
                        this.dialog = popDialog2;
                        popDialog2.show();
                        this.dialog.setTitle(tipsInfo.title);
                        this.dialog.setContent(tipsInfo.content);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ActionButton actionButton = arrayList.get(i);
                            int i2 = actionButton.jumpType;
                            if (i2 == 3) {
                                this.dialog.setNegativeBtnText(actionButton.textInstalled);
                                this.dialog.setNegativeBtnClickListener(this.negativeBtnListenner);
                            } else if (i2 == 4) {
                                this.dialog.setPositiveBtnText(actionButton.textUninstalled);
                                this.dialog.setPositiveBtnClickListener(this.retryBtnListener);
                            } else {
                                try {
                                    int checkQQDownloaderInstalled = this.mOpenSDK.checkQQDownloaderInstalled(this.mSupportVersionCode);
                                    if (checkQQDownloaderInstalled == 0) {
                                        this.dialog.setPositiveBtnText(actionButton.textInstalled);
                                        TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
                                        createTipsInfoLog.authorizedTipsCount++;
                                        TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
                                    } else if (checkQQDownloaderInstalled == 1) {
                                        this.dialog.setPositiveBtnText(actionButton.textUninstalled);
                                        continueDownload();
                                    } else if (checkQQDownloaderInstalled == 2) {
                                        this.dialog.setPositiveBtnText(this.mContext.getString(res.string("white_list_positive_update")));
                                        continueDownload();
                                    }
                                } catch (Exception e) {
                                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                                }
                                this.dialog.setPositiveBtnTag(actionButton);
                                this.dialog.setPositiveBtnClickListener(this.positiveBtnListener);
                            }
                        }
                        return;
                    }
                    return;
                }
                TMLog.m164114i(TAG, "context is finishing!  context" + this.mContext);
            }
        }
    }

    public void startDownloadTask(final String str, final String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.dialog.setPositiveBtnEnable(false);
            this.mSubMessageHandler.post(new Runnable() {
                public void run() {
                    TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager = TMOpenSDKToMsdkManager.this;
                    if (!(tMOpenSDKToMsdkManager.mContext == null || tMOpenSDKToMsdkManager.mOpenSDK == null || TextUtils.isEmpty(str2))) {
                        TMOpenSDKToMsdkManager tMOpenSDKToMsdkManager2 = TMOpenSDKToMsdkManager.this;
                        tMOpenSDKToMsdkManager2.insertActionId = tMOpenSDKToMsdkManager2.mOpenSDK.addDownloadTaskFromAuthorize(str2);
                    }
                    TMAssistantDownloadSDKClient client = TMOpenSDKToMsdkManager.this.getClient();
                    if (client != null) {
                        try {
                            int startDownloadTask = client.startDownloadTask(str, "application/vnd.android.package-archive");
                            if (4 == startDownloadTask) {
                                String str = client.getDownloadTaskState(str).mSavePath;
                                Message message = new Message();
                                message.what = 0;
                                message.obj = str;
                                TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message);
                            } else if (startDownloadTask == 0) {
                                TMLog.m164114i(TMOpenSDKToMsdkManager.TAG, "start success!");
                            } else if (1 == startDownloadTask) {
                                Message message2 = new Message();
                                message2.what = 5;
                                message2.obj = 1;
                                TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message2);
                            } else {
                                Message message3 = new Message();
                                message3.what = 3;
                                TMOpenSDKToMsdkManager.this.mMainMessageHandler.sendMessage(message3);
                            }
                            if (startDownloadTask == 4) {
                                TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                                createTipsInfoLog.installBtnClickCount++;
                                TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
                                return;
                            }
                            TipsInfoLog createTipsInfoLog2 = TipsInfoReportManager.getInstance().createTipsInfoLog(TMOpenSDKToMsdkManager.this.mAuthorizedInfo);
                            createTipsInfoLog2.downloadBtnClickCount++;
                            TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog2);
                        } catch (Exception e) {
                            Log.printErrStackTrace(TMOpenSDKToMsdkManager.TAG, e, "", new Object[0]);
                        }
                    }
                }
            });
        }
    }

    public void startToQQDownloaderAuthorized(String str) {
        TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK;
        if (this.dialog.isShowing()) {
            this.dialog.dismiss();
        }
        this.mHttpRequest = null;
        this.isInstallFinished = false;
        if (!TextUtils.isEmpty(str)) {
            TipsInfoLog createTipsInfoLog = TipsInfoReportManager.getInstance().createTipsInfoLog(this.mAuthorizedInfo);
            createTipsInfoLog.authorizedBtnClickCount++;
            TipsInfoReportManager.getInstance().addLogData(createTipsInfoLog);
            Context context = this.mContext;
            if (context != null && (tMQQDownloaderOpenSDK = this.mOpenSDK) != null) {
                tMQQDownloaderOpenSDK.startToAuthorized(context, str);
            }
        }
    }

    public void tryToCloseDialog() {
        TMQQDownloaderOpenSDK tMQQDownloaderOpenSDK = this.mOpenSDK;
        if (tMQQDownloaderOpenSDK != null && this.mContext != null) {
            try {
                int checkQQDownloaderInstalled = tMQQDownloaderOpenSDK.checkQQDownloaderInstalled(this.mSupportVersionCode);
                if (this.isInstallFinished && checkQQDownloaderInstalled == 0) {
                    this.mHttpRequest = null;
                    this.isInstallFinished = false;
                    this.mDownloadUrl = null;
                    if (this.dialog.isShowing()) {
                        this.dialog.dismiss();
                    }
                    TMAssistantDownloadSDKManager.closeAllService(this.mContext);
                    this.mClient = null;
                    if (isExitsAction(this.insertActionId)) {
                        this.mOpenSDK.startQQDownloader(this.mContext);
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }
}
