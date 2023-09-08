package com.tencent.skyline;

import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/skyline/ISkylineRuntimeFromNative;", "", "", "taskId", "Lrx3/b0;", "notifyRouteDone", "id", "pageId", "notifyBack", "notifyBackDone", "Lcom/tencent/skyline/IRouteBackCallback;", "routeBackCallback", "waitForBack", "notifyWindowReady", "notifyWindowDestroy", "", "runtimeDelegatePtr", "notifyBootstrapDone", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public interface ISkylineRuntimeFromNative {
    void notifyBack(int i, int i2);

    void notifyBackDone(int i, int i2);

    void notifyBootstrapDone(long j);

    void notifyRouteDone(int i);

    void notifyWindowDestroy(int i);

    void notifyWindowReady(int i);

    void waitForBack(IRouteBackCallback iRouteBackCallback);
}
