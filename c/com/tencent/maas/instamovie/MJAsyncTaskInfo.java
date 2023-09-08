package com.tencent.maas.instamovie;

import com.tencent.maas.instamovie.base.MJError;

public class MJAsyncTaskInfo {
    public MJError error;
    public long executionID;
    public String taskTag;

    public MJAsyncTaskInfo(MJError mJError, long j, String str) {
        this.error = mJError;
        this.executionID = j;
        this.taskTag = str;
    }
}
