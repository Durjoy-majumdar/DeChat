package com.tencent.xweb;

public interface IXWebBroadcastListener {
    public static final String DATA_TAG = "extra_data";
    public static final int FINISHED_CODE_CANCELED = -2;
    public static final int FINISHED_CODE_FAILED = -1;
    public static final int FINISHED_CODE_NO_MATCHED_CORE = -5;
    public static final int FINISHED_CODE_OTHER_PROCESS_UPDATING = -3;
    public static final int FINISHED_CODE_SUC = 0;
    public static final int SCHEDULER_TYPE_NORMAL = 0;
    public static final int SCHEDULER_TYPE_PREDOWNLOAD = 1;
    public static final String STAGE_FINISHED = "finished";
    public static final String STAGE_MAINCFG_UPDATE = "cfg_update";
    public static final String STAGE_PLUGINCFG_UPDATE = "plugin_update";
    public static final String STAGE_PROGRESSED = "updating";
    public static final String STAGE_START = "start";
    public static final String STAGE_TAG = "stage";
    public static final String UPDATE_ACTION = "com.tencent.xweb.update";

    void onMainCfgUpdated();

    void onPluginCfgUpdated();

    void onUpdateFinished(int i);

    void onUpdateProgressed(int i);

    void onUpdateStart(int i);
}
