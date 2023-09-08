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

/* renamed from: tj3.i */
public final class C111011i implements C111008c {

    /* renamed from: a */
    public RenderScript f332464a;

    /* renamed from: b */
    public final ScriptIntrinsicBlur f332465b;

    /* renamed from: c */
    public Allocation f332466c;

    /* renamed from: d */
    public int f332467d = -1;

    /* renamed from: e */
    public int f332468e = -1;

    public C111011i(Context context) {
        Log.m105925i("MicroMsg.SupportRenderScriptBlur", "rs create: %s", this);
        if (BuildInfo.DEBUG) {
            Log.m105919d("MicroMsg.SupportRenderScriptBlur", "rs create: %s", android.util.Log.getStackTraceString(new Throwable()));
        }
        RenderScript create = RenderScript.create(context);
        this.f332464a = create;
        this.f332465b = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    /* renamed from: a */
    public Bitmap.Config mo162691a() {
        return Bitmap.Config.ARGB_8888;
    }

    /* renamed from: b */
    public final Bitmap mo162692b(Bitmap bitmap, float f) {
        boolean z = true;
        if (f <= 0.0f) {
            Log.m105929w("MicroMsg.SupportRenderScriptBlur", "Radius(%s) out of range (0 < r <= 25), realRadius:%s", Float.valueOf(f), Float.valueOf(1.0f));
            f = 1.0f;
        } else if (f > 25.0f) {
            Log.m105929w("MicroMsg.SupportRenderScriptBlur", "Radius(%s) out of range (0 < r <= 25), realRadius:%s", Float.valueOf(f), Float.valueOf(25.0f));
            f = 25.0f;
        }
        RenderScript renderScript = this.f332464a;
        if (renderScript != null) {
            Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
            if (!(bitmap.getHeight() == this.f332468e && bitmap.getWidth() == this.f332467d)) {
                z = false;
            }
            if (!z) {
                Allocation allocation = this.f332466c;
                if (allocation != null) {
                    allocation.destroy();
                }
                this.f332466c = Allocation.createTyped(this.f332464a, createFromBitmap.getType());
                this.f332467d = bitmap.getWidth();
                this.f332468e = bitmap.getHeight();
            }
            this.f332465b.setRadius(f);
            this.f332465b.setInput(createFromBitmap);
            this.f332465b.forEach(this.f332466c);
            this.f332466c.copyTo(bitmap);
            createFromBitmap.destroy();
            return bitmap;
        }
        throw new NullPointerException("RenderScript has been destroyed!!! " + toString());
    }

    public final void destroy() {
        Log.m105925i("MicroMsg.SupportRenderScriptBlur", "destroy %s", this);
        this.f332465b.destroy();
        RenderScript renderScript = this.f332464a;
        if (renderScript != null) {
            renderScript.destroy();
            this.f332464a = null;
        } else {
            Log.m105920e("MicroMsg.SupportRenderScriptBlur", "RenderScript has already been destroyed!!!");
        }
        Allocation allocation = this.f332466c;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    public void finalize() {
        Log.m105918d("MicroMsg.SupportRenderScriptBlur", "finalize");
        super.finalize();
        if (this.f332464a != null) {
            Log.m105921e("MicroMsg.SupportRenderScriptBlur", "RS leak warning: maybe you forget to call destroy!!! %s", this);
            if (Build.VERSION.SDK_INT < 23) {
                Log.m105920e("MicroMsg.SupportRenderScriptBlur", "help destroy RenderScript");
                this.f332464a.destroy();
                this.f332464a = null;
            }
        }
    }
}
