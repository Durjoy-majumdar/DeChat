package tj3;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: tj3.h */
public final class C111010h implements C111008c {

    /* renamed from: a */
    public RenderScript f332459a;

    /* renamed from: b */
    public final ScriptIntrinsicBlur f332460b;

    /* renamed from: c */
    public Allocation f332461c;

    /* renamed from: d */
    public int f332462d = -1;

    /* renamed from: e */
    public int f332463e = -1;

    public C111010h(Context context) {
        Log.m105925i("MicroMsg.RenderScriptBlur", "rs create: %s", this);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.RenderScriptBlur", "rs create: %s", android.util.Log.getStackTraceString(new Throwable()));
        }
        RenderScript create = RenderScript.create(context);
        this.f332459a = create;
        this.f332460b = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    /* renamed from: a */
    public Bitmap.Config mo162691a() {
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: b */
    public final Bitmap mo162692b(Bitmap bitmap, float f) {
        Log.m105918d("MicroMsg.RenderScriptBlur", "blur");
        RenderScript renderScript = this.f332459a;
        if (renderScript != null) {
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
            if (!(bitmap.getHeight() == this.f332463e && bitmap.getWidth() == this.f332462d)) {
                Allocation allocation = this.f332461c;
                if (allocation != null) {
                    allocation.destroy();
                }
                this.f332461c = Allocation.createTyped(this.f332459a, createFromBitmap.getType());
                this.f332462d = bitmap.getWidth();
                this.f332463e = bitmap.getHeight();
            }
            this.f332460b.setRadius(f);
            this.f332460b.setInput(createFromBitmap);
            this.f332460b.forEach(this.f332461c);
            this.f332461c.copyTo(bitmap);
            createFromBitmap.destroy();
            return bitmap;
        }
        throw new NullPointerException("RenderScript has been destroyed!!! " + toString());
    }

    public final void destroy() {
        Log.m105925i("MicroMsg.RenderScriptBlur", "destroy %s", toString());
        this.f332460b.destroy();
        RenderScript renderScript = this.f332459a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f332459a = null;
        } else {
            Log.m105921e("MicroMsg.RenderScriptBlur", "RenderScript has already been destroyed!!! %s", this);
        }
        Allocation allocation = this.f332461c;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    public void finalize() {
        Log.m105918d("MicroMsg.RenderScriptBlur", "finalize");
        super.finalize();
        if (this.f332459a != null) {
            Log.m105921e("MicroMsg.RenderScriptBlur", "RS leak warning: maybe you forget to call destroy!!! %s", this);
            if (Build.VERSION.SDK_INT < 23) {
                Log.m105920e("MicroMsg.RenderScriptBlur", "help destroy RenderScript");
                this.f332459a.destroy();
                this.f332459a = null;
            }
        }
    }
}
