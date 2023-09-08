package ob0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116724d4;
import eb0.C116755s2;
import junit.framework.Assert;

/* renamed from: ob0.y */
public abstract class C117747y {
    private static final long DEFAULT_RETURN_TIMEOUT = 600000;
    private static final int LIMIT_NOT_INITIALIZED = -99;
    private static final String TAG = "MicroMsg.NetSceneBase";
    private C114770g dispatcher;
    private boolean hasCallbackToQueue;
    private C114799u irr;
    private boolean isCanceled = false;
    private boolean isKinda = false;
    public long lastdispatch = Util.currentTicks();
    private int limit = -99;
    private C116755s2 mDispatchInterceptor;
    private int netId = -1;
    private int priority = 0;
    private C11385n queueCallback;
    private C117734h0 remoteCB;

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatch$0(C1311n nVar, int i, C114799u uVar) {
        try {
            nVar.onGYNetEnd(-1, 3, i, "dispatch intercept", uVar, (byte[]) null);
            Log.m105925i(TAG, "dispatcher intercept send, %s, ThreadID:%s, getType:%s", Integer.valueOf(this.netId), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(uVar.getType()));
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "callbackWrapper intercept onGYNetEnd err", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatch$1(C1311n nVar, C114799u uVar) {
        nVar.onGYNetEnd(-1, 3, -1, "send to network failed", uVar, (byte[]) null);
        Log.m105925i(TAG, "dispatcher send, %s, ThreadID:%s, getType:%s", Integer.valueOf(this.netId), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(uVar.getType()));
    }

    public boolean accept(C117747y yVar) {
        return false;
    }

    public boolean acceptConcurrent(C117747y yVar) {
        return false;
    }

    public void cancel() {
        C114770g gVar;
        Log.m105925i(TAG, "cancel: %d, hash:%d, type:%d", Integer.valueOf(this.netId), Integer.valueOf(hashCode()), Integer.valueOf(getType()));
        this.isCanceled = true;
        C117734h0 h0Var = this.remoteCB;
        if (h0Var != null) {
            h0Var.cancel();
        }
        int i = this.netId;
        if (i != -1 && (gVar = this.dispatcher) != null) {
            this.netId = -1;
            gVar.mo55463U2(i);
        }
    }

    public int dispatch(C114770g gVar, C114799u uVar, C1311n nVar) {
        prepareDispatcher(gVar);
        this.irr = uVar;
        C1311n b = C116724d4.m164632b(nVar, this);
        C116724d4.m164631a(this);
        int dispatchInterceptRet = getDispatchInterceptRet(gVar, uVar, nVar);
        if (dispatchInterceptRet != 0) {
            new MMHandler().post(new y$$a(this, b, dispatchInterceptRet, uVar));
            return dispatchInterceptRet;
        }
        if (this.limit == -99) {
            this.limit = securityLimitCount();
            Log.m105924i(TAG, "initilized security limit count to " + this.limit);
        }
        if (securityLimitCount() > 1) {
            int ordinal = securityVerificationChecked(uVar).ordinal();
            if (ordinal == 0) {
                Assert.assertTrue("scene security verification not passed, type=" + uVar.getType() + ", uri=" + uVar.getUri() + ", CHECK NOW", false);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    Assert.assertTrue("invalid security verification status", false);
                } else {
                    Log.m105920e(TAG, "scene security verification not passed, type=" + uVar.getType() + ", uri=" + uVar.getUri());
                    this.limit = this.limit - 1;
                    setSecurityCheckError(y$$c.EStatusCheckFailed);
                    this.netId = -1;
                    return -1;
                }
            }
        }
        if (securityLimitCountReach()) {
            Log.m105920e(TAG, "dispatch failed, scene limited for security, current limit=" + securityLimitCount());
            setSecurityCheckError(y$$c.EReachMaxLimit);
            this.netId = -1;
            return -1;
        }
        this.limit--;
        C117739j0 j0Var = new C117739j0(uVar);
        if (this.remoteCB != null && !isSupportConcurrent()) {
            this.remoteCB.cancel();
        }
        C117734h0 h0Var = new C117734h0(uVar, b, this, this.queueCallback, gVar);
        this.remoteCB = h0Var;
        int a4 = gVar.mo55467a4(j0Var, h0Var);
        this.netId = a4;
        Log.m105925i(TAG, "dispatcher send, %s", Integer.valueOf(a4));
        if (this.netId < 0) {
            new MMHandler().post(new y$$b(this, b, uVar));
            return 99999999;
        }
        this.remoteCB.mo182448e();
        return this.netId;
    }

    public C114770g dispatcher() {
        return this.dispatcher;
    }

    public abstract int doScene(C114770g gVar, C11385n nVar);

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        C116755s2 s2Var = this.mDispatchInterceptor;
        if (s2Var != null) {
            return s2Var.mo180726a(gVar, uVar, nVar, this);
        }
        return 0;
    }

    public String getInfo() {
        return "";
    }

    public boolean getIsKinda() {
        return this.isKinda;
    }

    public int getMMReqRespHash() {
        C114799u uVar = this.irr;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }

    public int getPriority() {
        return this.priority;
    }

    public C114799u getReqResp() {
        return this.irr;
    }

    public long getReturnTimeout() {
        return DEFAULT_RETURN_TIMEOUT;
    }

    public abstract int getType();

    public boolean hasCallBackToQueue() {
        return this.hasCallbackToQueue;
    }

    public boolean isCanceled() {
        return this.isCanceled;
    }

    public boolean isSupportConcurrent() {
        return false;
    }

    public boolean needCheckCallback() {
        return securityLimitCount() == 1;
    }

    public void prepareDispatcher(C114770g gVar) {
        this.lastdispatch = Util.currentTicks();
        this.dispatcher = gVar;
    }

    public void reset() {
        this.lastdispatch = Util.currentTicks();
        this.netId = -1;
        this.limit = -99;
    }

    public int securityLimitCount() {
        return 1;
    }

    public boolean securityLimitCountReach() {
        return this.limit <= 0;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EUnchecked;
    }

    public void setDispatchInterceptor(C116755s2 s2Var) {
        this.mDispatchInterceptor = s2Var;
    }

    public void setHasCallbackToQueue(boolean z) {
        this.hasCallbackToQueue = z;
    }

    public void setIsKinda(boolean z) {
        this.isKinda = z;
    }

    public void setOnSceneEnd(C11385n nVar) {
        this.queueCallback = nVar;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setSecurityCheckError(y$$c y__c) {
    }

    public boolean uniqueInNetsceneQueue() {
        return false;
    }

    @Deprecated
    public void updateDispatchId(int i) {
    }

    public void updateDispatchIdNew(int i) {
        this.netId = i;
    }
}
