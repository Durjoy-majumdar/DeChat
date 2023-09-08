package b14;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import gy3.C8480h;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: b14.c */
public final class C54394c {

    /* renamed from: a */
    public static final /* synthetic */ int f152601a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C54393b bVar = null;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m168114constructorimpl(new C54392a(m61090a(Looper.getMainLooper(), true), (String) null, 2, (C8480h) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m168120isFailureimpl(obj)) {
            bVar = obj;
        }
        C54393b bVar2 = bVar;
    }

    /* renamed from: a */
    public static final Handler m61090a(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
