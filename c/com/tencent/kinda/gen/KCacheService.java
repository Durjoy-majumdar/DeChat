package com.tencent.kinda.gen;

public interface KCacheService {
    byte[] get(String str);

    boolean getBool(String str);

    long getInt64(String str, long j);

    boolean remove(String str);

    void set(String str, byte[] bArr, long j);

    void setBool(String str, boolean z, long j);

    void setInt64(String str, long j, long j2);
}
