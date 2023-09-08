package com.tencent.wechat.aff.common;

import android.os.Handler;
import android.os.Looper;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo182094d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
public final class ThreadHelper$Companion$mainThreadHandle$2 extends C87413o implements C32224a<Handler> {
    public static final ThreadHelper$Companion$mainThreadHandle$2 INSTANCE = new ThreadHelper$Companion$mainThreadHandle$2();

    public ThreadHelper$Companion$mainThreadHandle$2() {
        super(0);
    }

    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
