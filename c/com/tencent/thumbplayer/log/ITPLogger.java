package com.tencent.thumbplayer.log;

public interface ITPLogger {
    void debug(String str);

    void error(String str);

    String getTag();

    void info(String str);

    void printException(Exception exc);

    void updateContext(TPLoggerContext tPLoggerContext);

    void updateTaskId(String str);

    void verbose(String str);

    void warn(String str);
}
