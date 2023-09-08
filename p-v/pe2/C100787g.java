package pe2;

import com.tencent.p014mm.autogen.events.PriorityTickPostSyncTaskEvent;

/* renamed from: pe2.g */
public class C100787g implements Runnable {
    public C100787g(C100788h hVar) {
    }

    public void run() {
        new PriorityTickPostSyncTaskEvent().publish();
    }
}
