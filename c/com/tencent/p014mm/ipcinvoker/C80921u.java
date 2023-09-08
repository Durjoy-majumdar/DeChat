package com.tencent.p014mm.ipcinvoker;

import com.tencent.p014mm.ipcinvoker.C80922v;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.u */
public class C80921u implements RejectedExecutionHandler {
    public C80921u(C80922v.C80923a aVar) {
    }

    public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        C90741c.m113810c("IPC.ExecutorServiceCreatorImpl", "on rejectedExecution(r : %s)", runnable);
    }
}
