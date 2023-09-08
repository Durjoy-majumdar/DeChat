package com.tencent.liteav.videobase.videobase;

import com.tencent.liteav.videobase.videobase.C17263h;

public interface IVideoReporter {
    void notifyError(C17263h.C17268a aVar, String str, Object... objArr);

    void notifyEvent(C17263h.C17269b bVar, String str, Object... objArr);

    void notifyWarning(C17263h.C17270c cVar, String str, Object... objArr);

    void updateStatus(C17271i iVar, int i, Object obj);

    void updateStatus(C17271i iVar, Object obj);
}
