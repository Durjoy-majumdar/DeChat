package com.tencent.liteav.live;

import com.tencent.rtmp.p899ui.TXCloudVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* renamed from: com.tencent.liteav.live.a */
public final class C104511a {

    /* renamed from: a */
    private static Method f309757a;

    /* renamed from: b */
    private static Method f309758b;

    static {
        Class<TXCloudVideoView> cls = TXCloudVideoView.class;
        try {
            Method declaredMethod = cls.getDeclaredMethod("setShowLogCallback", new Class[]{WeakReference.class});
            f309757a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("isShowLogEnabled", new Class[0]);
            f309758b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m139801a(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView == null) {
            return false;
        }
        try {
            Object invoke = f309758b.invoke(tXCloudVideoView, new Object[0]);
            if (invoke != null && (invoke instanceof Boolean)) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static void m139800a(TXCloudVideoView tXCloudVideoView, WeakReference<TXCloudVideoView.C106890b> weakReference) {
        if (tXCloudVideoView != null) {
            try {
                f309757a.invoke(tXCloudVideoView, new Object[]{weakReference});
            } catch (Exception unused) {
            }
        }
    }
}
