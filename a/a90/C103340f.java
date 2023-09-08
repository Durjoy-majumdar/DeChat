package a90;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p277yf.C112440j;
import rx3.C13598b0;

/* renamed from: a90.f */
public final class C103340f {

    /* renamed from: a */
    public Context f304720a;

    /* renamed from: b */
    public C112440j f304721b;

    /* renamed from: c */
    public RenderScript f304722c;

    public C103340f(Context context) {
        C87412m.m108594g(context, "mContext");
        this.f304720a = context;
        Log.m105924i("MicroMsg.RenderScriptImageHelper", "rs create: " + this);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.RenderScriptImageHelper", "rs create: %s", android.util.Log.getStackTraceString(new Throwable()));
        }
        this.f304722c = RenderScript.create(this.f304720a);
        this.f304721b = new C112440j(this.f304722c);
    }

    /* renamed from: a */
    public final void mo143200a() {
        if (this.f304722c == null) {
            throw new NullPointerException("RenderScript has been destroyed!!! " + this);
        }
    }

    /* renamed from: b */
    public final void mo143201b() {
        Log.m105924i("MicroMsg.RenderScriptImageHelper", "release rs script " + this);
        C112440j jVar = this.f304721b;
        if (jVar != null) {
            jVar.destroy();
        }
        RenderScript renderScript = this.f304722c;
        C13598b0 b0Var = null;
        if (renderScript != null) {
            Log.m105924i("MicroMsg.RenderScriptImageHelper", "rs destroy");
            renderScript.destroy();
            this.f304722c = null;
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.RenderScriptImageHelper", "rs has already been destroyed!!! " + this);
        }
    }

    /* renamed from: c */
    public final Bitmap mo143202c(Bitmap bitmap, int i) {
        C112440j jVar;
        C87412m.m108594g(bitmap, "bitmap");
        mo143200a();
        if (i == 0) {
            return bitmap;
        }
        C112440j jVar2 = this.f304721b;
        if (jVar2 != null) {
            int width = bitmap.getWidth();
            synchronized (jVar2) {
                jVar2.setVar(1, width);
            }
        }
        C112440j jVar3 = this.f304721b;
        if (jVar3 != null) {
            int height = bitmap.getHeight();
            synchronized (jVar3) {
                jVar3.setVar(2, height);
            }
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f304722c, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        bitmap.recycle();
        C112440j jVar4 = this.f304721b;
        if (jVar4 != null) {
            synchronized (jVar4) {
                jVar4.setVar(0, createFromBitmap);
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap((i == 90 || i == 270) ? bitmap.getHeight() : bitmap.getWidth(), (i == 90 || i == 270) ? bitmap.getWidth() : bitmap.getHeight(), bitmap.getConfig());
        Allocation createFromBitmap2 = Allocation.createFromBitmap(this.f304722c, createBitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        if (i == 90) {
            C112440j jVar5 = this.f304721b;
            if (jVar5 != null) {
                jVar5.mo164149e(createFromBitmap2, createFromBitmap2);
            }
        } else if (i == 180) {
            C112440j jVar6 = this.f304721b;
            if (jVar6 != null) {
                jVar6.mo164147c(createFromBitmap2, createFromBitmap2);
            }
        } else if (i == 270 && (jVar = this.f304721b) != null) {
            jVar.mo164148d(createFromBitmap2, createFromBitmap2);
        }
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
        C87412m.m108593f(createBitmap, "target");
        return createBitmap;
    }

    public final void finalize() {
        Log.m105918d("MicroMsg.RenderScriptImageHelper", "finalize");
        RenderScript renderScript = this.f304722c;
        if (renderScript != null) {
            Log.m105920e("MicroMsg.RenderScriptImageHelper", "RS leak warning: maybe you forget to call destroy!!! " + this);
            if (Build.VERSION.SDK_INT < 23) {
                Log.m105920e("MicroMsg.RenderScriptImageHelper", "help destroy RenderScript");
                renderScript.destroy();
                this.f304722c = null;
            }
        }
    }
}
