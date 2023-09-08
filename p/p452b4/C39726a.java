package p452b4;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: b4.a */
public class C39726a {

    /* renamed from: e */
    public static final Map<String, Lock> f106586e = new HashMap();

    /* renamed from: a */
    public final File f106587a;

    /* renamed from: b */
    public final Lock f106588b;

    /* renamed from: c */
    public final boolean f106589c;

    /* renamed from: d */
    public FileChannel f106590d;

    public C39726a(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, str + ".lck");
        this.f106587a = file2;
        String absolutePath = file2.getAbsolutePath();
        Map<String, Lock> map = f106586e;
        synchronized (map) {
            lock = (Lock) ((HashMap) map).get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                ((HashMap) map).put(absolutePath, lock);
            }
        }
        this.f106588b = lock;
        this.f106589c = z;
    }

    /* renamed from: a */
    public void mo62356a() {
        FileChannel fileChannel = this.f106590d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f106588b.unlock();
    }
}
