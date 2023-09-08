package com.tencent.p014mm.wexnet;

import com.tencent.p014mm.wexnet.WeXNet;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/wexnet/SessionKeeper;", "Ljava/lang/AutoCloseable;", "Lrx3/b0;", "close", "finalize", "", "sessionPtr", "J", "getSessionPtr", "()J", "<init>", "(J)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.wexnet.SessionKeeper */
public final class SessionKeeper implements AutoCloseable {
    private final long sessionPtr;

    public SessionKeeper(long j) {
        this.sessionPtr = j;
    }

    public void close() {
        try {
            WeXNet.C86022a aVar = WeXNet.Companion;
            long j = this.sessionPtr;
            aVar.mo120038a();
            Result unused = WeXNet.releaseSession(j);
        } catch (WeXNet.C86022a.C86023a unused2) {
        }
    }

    public final void finalize() {
        close();
    }

    public final long getSessionPtr() {
        return this.sessionPtr;
    }
}
