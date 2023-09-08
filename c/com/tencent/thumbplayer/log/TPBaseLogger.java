package com.tencent.thumbplayer.log;

import com.tencent.thumbplayer.utils.TPLogUtil;

public class TPBaseLogger implements ITPLogger {
    private TPLoggerContext mTPLoggerContext;
    private String mTag;

    public TPBaseLogger(TPLoggerContext tPLoggerContext) {
        this.mTPLoggerContext = tPLoggerContext;
        this.mTag = tPLoggerContext.getTag();
    }

    public void debug(String str) {
        TPLogUtil.m21893d(this.mTPLoggerContext.getTag(), str);
    }

    public void error(String str) {
        TPLogUtil.m21894e(this.mTPLoggerContext.getTag(), str);
    }

    public TPLoggerContext getTPLoggerContext() {
        return this.mTPLoggerContext;
    }

    public String getTag() {
        return this.mTPLoggerContext.getTag();
    }

    public void info(String str) {
        TPLogUtil.m21897i(this.mTPLoggerContext.getTag(), str);
    }

    public void printException(Exception exc) {
        TPLogUtil.m21895e(this.mTPLoggerContext.getTag(), (Throwable) exc);
    }

    public void updateContext(TPLoggerContext tPLoggerContext) {
        if (tPLoggerContext == null) {
            this.mTPLoggerContext = new TPLoggerContext(this.mTag);
        } else {
            this.mTPLoggerContext = tPLoggerContext;
        }
    }

    public void updateTaskId(String str) {
        this.mTPLoggerContext.setTaskId(str);
    }

    public void verbose(String str) {
        TPLogUtil.m21898v(this.mTPLoggerContext.getTag(), str);
    }

    public void warn(String str) {
        TPLogUtil.m21899w(this.mTPLoggerContext.getTag(), str);
    }

    public TPBaseLogger(TPLoggerContext tPLoggerContext, String str) {
        TPLoggerContext tPLoggerContext2 = new TPLoggerContext(tPLoggerContext, str);
        this.mTPLoggerContext = tPLoggerContext2;
        this.mTag = tPLoggerContext2.getTag();
    }
}
