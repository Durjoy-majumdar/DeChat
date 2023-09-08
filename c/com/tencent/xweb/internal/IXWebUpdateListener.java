package com.tencent.xweb.internal;

public interface IXWebUpdateListener {
    public static final int CHECK_FAILED = 1;
    public static final int DOWNLOAD_FAILED = 3;
    public static final int INSTALL_FAILED = 4;
    public static final int NO_NETWORK = 2;

    boolean onNeedDownload();

    void onUpdateCancelled();

    void onUpdateCompleted();

    void onUpdateFailed(int i);

    void onUpdateProgress(int i);

    void onUpdateStart();
}
