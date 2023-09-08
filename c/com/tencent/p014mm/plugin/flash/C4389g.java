package com.tencent.p014mm.plugin.flash;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import au1.C0222b;
import com.tencent.p014mm.plugin.flash.C105349l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.YtCameraSetting;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;

/* renamed from: com.tencent.mm.plugin.flash.g */
public class C4389g implements C105349l.C4396e {

    /* renamed from: a */
    public final /* synthetic */ YtSDKKitFramework.IYTReflectListener f19026a;

    /* renamed from: b */
    public final /* synthetic */ YtSDKKitFramework.IYTBaseFunctionListener f19027b;

    /* renamed from: c */
    public final /* synthetic */ YtSDKKitFramework.YtSDKKitFrameworkWorkMode f19028c;

    /* renamed from: d */
    public final /* synthetic */ YtSDKKitFramework.IYtSDKKitFrameworkEventListener f19029d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f19030e;

    /* renamed from: f */
    public final /* synthetic */ C105349l.C4396e f19031f;

    /* renamed from: g */
    public final /* synthetic */ C4390h f19032g;

    public C4389g(C4390h hVar, YtSDKKitFramework.IYTReflectListener iYTReflectListener, YtSDKKitFramework.IYTBaseFunctionListener iYTBaseFunctionListener, YtSDKKitFramework.YtSDKKitFrameworkWorkMode ytSDKKitFrameworkWorkMode, YtSDKKitFramework.IYtSDKKitFrameworkEventListener iYtSDKKitFrameworkEventListener, SurfaceTexture surfaceTexture, C105349l.C4396e eVar) {
        this.f19032g = hVar;
        this.f19026a = iYTReflectListener;
        this.f19027b = iYTBaseFunctionListener;
        this.f19028c = ytSDKKitFrameworkWorkMode;
        this.f19029d = iYtSDKKitFrameworkEventListener;
        this.f19030e = surfaceTexture;
        this.f19031f = eVar;
    }

    /* renamed from: a */
    public void mo5233a(Boolean bool, C105349l lVar) {
        if (!bool.booleanValue()) {
            Log.m105920e("MicroMsg.FaceFlashManagerError", "open camera failed");
            C0222b.m173l("openCamera", -1);
            C0222b.m163b().f9686B = 1;
            this.f19032g.f19036c.mo5240K7(90035, "open camera failed");
            return;
        }
        C0222b.m172k("openCamera");
        if (!this.f19032g.f19034a.mo149952b(lVar.f313127d.f322936a, lVar.f313138o)) {
            C0222b.m173l("sdkCamera", -1);
            C0222b.m163b().f9686B = 2;
            this.f19032g.f19036c.mo5240K7(90013, "init yt camera failed");
            return;
        }
        C0222b.m172k("sdkCamera");
        YtSDKKitFramework.YtSDKPlatformContext platformContext = YtSDKKitFramework.getInstance().getPlatformContext();
        platformContext.reflectListener = this.f19026a;
        platformContext.baseFunctionListener = this.f19027b;
        if (!this.f19032g.f19034a.mo149951a(this.f19028c, this.f19029d)) {
            C0222b.m173l("sdkFaceType", -1);
            C0222b.m163b().f9686B = 2;
            this.f19032g.f19036c.mo5240K7(90013, "init yt framework failed");
            return;
        }
        C0222b.m172k("sdkFaceType");
        lVar.mo149958g(this.f19030e, new g$$a(this));
        Point c = lVar.mo149955c();
        Log.m105925i("MicroMsg.FaceFlashManager", "set sdk preview size:%sx%s", Integer.valueOf(c.x), Integer.valueOf(c.y));
        int rotate = YtCameraSetting.getRotate(this.f19032g.f19036c, lVar.f313138o, 1);
        int i = c.x;
        int i2 = c.y;
        if (rotate >= 5) {
            int i3 = i;
            i = i2;
            i2 = i3;
        }
        Log.m105925i("MicroMsg.FaceFlashManager", "setPreviewRect width:%d,height:%d", Integer.valueOf(i), Integer.valueOf(i2));
        C0222b.m173l("detect", i + "x" + i2);
        YtSDKKitFramework.getInstance().setPreviewRect(new Rect(0, 0, i, i2));
        YtSDKKitFramework.getInstance().setDetectRect(new Rect(0, 0, i, i2));
        this.f19031f.mo5233a(Boolean.TRUE, lVar);
        C0222b.m175n(11);
    }
}
