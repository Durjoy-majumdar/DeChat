package com.tencent.p014mm.svg;

import android.graphics.Canvas;
import ii3.C87739b;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.svg.WeChatSVG */
public class WeChatSVG {
    static {
        if (C87739b.m109157b()) {
            C9556a aVar = new C9556a();
            aVar.mo10233c("wechatsvg");
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/svg/WeChatSVG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/svg/WeChatSVG", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            nativeInit();
        }
    }

    public static native float[] getViewPort(long j);

    private static native void nativeInit();

    public static native long parse(String str);

    public static native void release(long j);

    public static native int render(long j, Canvas canvas);

    public static native int renderViewPort(long j, Canvas canvas, float f, float f2);
}
