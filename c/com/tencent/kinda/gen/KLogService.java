package com.tencent.kinda.gen;

public interface KLogService {
    void debug(String str, String str2);

    void error(String str, String str2);

    void info(String str, String str2);

    void verbose(String str, String str2);

    void warning(String str, String str2);
}
