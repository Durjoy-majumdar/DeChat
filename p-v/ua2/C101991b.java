package ua2;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ua2.b */
public class C101991b {

    /* renamed from: c */
    public static C101991b f300315c;

    /* renamed from: a */
    public Context f300316a;

    /* renamed from: b */
    public ConcurrentHashMap<Class<? extends C37363a>, C37363a> f300317b = new ConcurrentHashMap<>();

    public C101991b(Context context) {
        this.f300316a = context;
    }

    /* renamed from: a */
    public static void m134283a(Class<? extends C37363a> cls, C37363a aVar) {
        if (aVar != null) {
            if (f300315c == null) {
                synchronized (C101991b.class) {
                    if (f300315c == null) {
                        Log.m105924i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                        f300315c = new C101991b((Context) null);
                    }
                }
            }
            f300315c.f300317b.put(cls, aVar);
        }
    }

    /* renamed from: b */
    public static <T extends C37363a> T m134284b(Class<T> cls) {
        if (f300315c == null) {
            synchronized (C101991b.class) {
                if (f300315c == null) {
                    Log.m105924i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                    f300315c = new C101991b((Context) null);
                }
            }
        }
        T t = (C37363a) f300315c.f300317b.get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }
}
