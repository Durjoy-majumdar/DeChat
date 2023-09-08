package com.tencent.liteav.videobase.p1096b;

import android.os.Looper;
import android.os.SystemClock;
import com.tencent.liteav.base.util.C17111b;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.liteav.videobase.b.c */
public final class C104514c {

    /* renamed from: a */
    public final C17111b f309776a;

    /* renamed from: b */
    public final AtomicInteger f309777b = new AtomicInteger(-1);

    /* renamed from: c */
    public Object f309778c = null;

    /* renamed from: d */
    public C104516e f309779d;

    /* renamed from: e */
    private final String f309780e;

    public C104514c(Looper looper) {
        this.f309776a = new C17111b(looper);
        this.f309780e = String.format(Locale.ENGLISH, "// %s-%s E8083882-0D59-47A1-B4B6-25C15A69875A\nvoid main() {gl_FragColor = vec4(0, 0, 0, 0);}", new Object[]{Integer.valueOf(hashCode()), Long.valueOf(SystemClock.uptimeMillis())});
    }
}
