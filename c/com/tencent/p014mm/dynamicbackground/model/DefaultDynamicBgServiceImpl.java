package com.tencent.p014mm.dynamicbackground.model;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import kotlin.Metadata;
import p913nk.C76918b;
import rx3.C110660q;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl;", "Lnk/b;", "", "isEnableNativeDynamicBackground", "enable", "Lrx3/b0;", "setEnableNativeDynamicBackground", "Landroid/content/Context;", "context", "Landroid/graphics/Point;", "getDisplayRealSize", "loadDynamicBgLibrary", "willCrash", "markWillCrash", "onInitCrash", "onInitStart", "onInitEnd", "isInitCrash", "needMarkDrawPoint", "markDrawStartPoint", "markDrawEndPoint", "", "getSleepTimeInMsPerFrame", "isEnable", "Z", "<init>", "()V", "Companion", "a", "dynamicbg_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.dynamicbackground.model.DefaultDynamicBgServiceImpl */
public final class DefaultDynamicBgServiceImpl implements C76918b {
    public static final C68011a Companion = new C68011a((C8480h) null);
    private static final String TAG = "MicroMsg.DefaultDynamicBgServiceImpl";
    private byte _hellAccFlag_;
    private boolean isEnable = true;

    /* renamed from: com.tencent.mm.dynamicbackground.model.DefaultDynamicBgServiceImpl$a */
    public static final class C68011a {
        public C68011a(C8480h hVar) {
        }
    }

    public Point getDisplayRealSize(Context context) {
        C87412m.m108595h(context, "context");
        Point point = new Point();
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
            return point;
        }
        throw new C110660q("null cannot be cast to non-null type android.view.WindowManager");
    }

    public float getSleepTimeInMsPerFrame() {
        return 16.0f;
    }

    public boolean isEnableNativeDynamicBackground() {
        return this.isEnable;
    }

    public boolean isInitCrash() {
        return false;
    }

    public void loadDynamicBgLibrary() {
        C9556a aVar = new C9556a();
        aVar.mo10233c("dynamicBg");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/dynamicbackground/model/DefaultDynamicBgServiceImpl", "loadDynamicBgLibrary", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public void markDrawEndPoint() {
    }

    public void markDrawStartPoint() {
    }

    public void markWillCrash() {
    }

    public boolean needMarkDrawPoint() {
        return false;
    }

    public void onInitCrash() {
    }

    public void onInitEnd() {
    }

    public void onInitStart() {
    }

    public void setEnableNativeDynamicBackground(boolean z) {
        this.isEnable = z;
    }

    public boolean willCrash() {
        return false;
    }
}
