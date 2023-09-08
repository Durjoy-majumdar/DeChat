package com.tencent.thumbplayer.log;

import android.text.TextUtils;

public class TPLoggerContext {
    public static final String DEFAULT_TAG = "TPLogger";
    public static final String PREFIX_THUMB_PLAYER = "ThumbPlayer";
    private String classId;
    private String model;
    private String prefix;
    private String tag;
    private String taskId;

    public TPLoggerContext(String str) {
        this(str, "", "", "");
    }

    private void buildTag() {
        this.tag = this.prefix;
        if (!TextUtils.isEmpty(this.classId)) {
            this.tag += "_C" + this.classId;
        }
        if (!TextUtils.isEmpty(this.taskId)) {
            this.tag += ActivityStubs.TRANSPARENT_STUB_FORMAT_SUFFIX + this.taskId;
        }
        if (!TextUtils.isEmpty(this.model)) {
            this.tag += "_" + this.model;
        }
    }

    public String getClassId() {
        return this.classId;
    }

    public String getModel() {
        return this.model;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public void setTaskId(String str) {
        this.taskId = str;
        buildTag();
    }

    public String toString() {
        return "TPLoggerContext{prefix='" + this.prefix + '\'' + ", classId='" + this.classId + '\'' + ", taskId='" + this.taskId + '\'' + ", model='" + this.model + '\'' + ", tag='" + this.tag + '\'' + '}';
    }

    public void update(TPLoggerContext tPLoggerContext, String str) {
        if (tPLoggerContext != null) {
            this.prefix = tPLoggerContext.prefix;
            this.classId = tPLoggerContext.classId;
            this.taskId = tPLoggerContext.taskId;
        } else {
            this.prefix = "";
            this.classId = "";
            this.taskId = "";
        }
        this.model = str;
        buildTag();
    }

    public TPLoggerContext(TPLoggerContext tPLoggerContext) {
        this(tPLoggerContext.prefix, tPLoggerContext.classId, tPLoggerContext.taskId, tPLoggerContext.model);
    }

    public TPLoggerContext(String str, String str2, String str3, String str4) {
        this.tag = DEFAULT_TAG;
        this.prefix = str;
        this.classId = str2;
        this.taskId = str3;
        this.model = str4;
        buildTag();
    }

    public TPLoggerContext(TPLoggerContext tPLoggerContext, String str) {
        this.prefix = "";
        this.classId = "";
        this.taskId = "";
        this.model = "";
        this.tag = DEFAULT_TAG;
        update(tPLoggerContext, str);
    }
}
