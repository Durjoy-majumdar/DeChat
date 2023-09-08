package p348ih;

import android.text.TextUtils;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ih.j */
public class C87731j implements ThreadFactory {

    /* renamed from: d */
    public final ThreadGroup f254019d;

    /* renamed from: e */
    public final AtomicInteger f254020e;

    /* renamed from: f */
    public String f254021f;

    public C87731j() {
        this.f254020e = new AtomicInteger(1);
        this.f254021f = "";
        this.f254019d = new ThreadGroup("AUDIO_MIX_THREAD_POOL_GROUP");
    }

    public Thread newThread(Runnable runnable) {
        if (TextUtils.isEmpty(this.f254021f)) {
            this.f254021f = "audio_mix_thread#";
        }
        ThreadGroup threadGroup = this.f254019d;
        Thread thread = new Thread(threadGroup, runnable, this.f254021f + this.f254020e.getAndIncrement(), 0);
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }

    public C87731j(String str, String str2) {
        this.f254020e = new AtomicInteger(1);
        this.f254021f = "";
        this.f254019d = new ThreadGroup(str);
        this.f254021f = str2;
    }
}
