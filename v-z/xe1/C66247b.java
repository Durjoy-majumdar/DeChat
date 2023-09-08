package xe1;

import a14.C0000n0;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.SystemClock;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.Iterator;
import kotlin.ResultKt;
import my3.C61595o;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36904l0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.core.WatermarkDetCore$getBufferFormBitmap$2", mo125469f = "WatermarkDetCore.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: xe1.b */
public final class C66247b extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends ByteBuffer, ? extends C13604l<? extends Integer, ? extends Integer>>>, Object> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f190304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66247b(Bitmap bitmap, C15601d<? super C66247b> dVar) {
        super(2, dVar);
        this.f190304d = bitmap;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C66247b(this.f190304d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C66247b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        long uptimeMillis = SystemClock.uptimeMillis();
        Bitmap bitmap = this.f190304d;
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        float height = 320.0f / ((float) (bitmap.getWidth() >= bitmap.getHeight() ? bitmap.getHeight() : bitmap.getWidth()));
        if (height < 1.0f) {
            Matrix matrix = new Matrix();
            matrix.setScale(height, height);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        }
        if (bitmap.getConfig() != config) {
            bitmap = bitmap.copy(config, true);
            C87412m.m108593f(bitmap, "{\n            newBitmap.…y(config, true)\n        }");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int length = array.length / 4;
        int i = length * 3;
        byte[] bArr = new byte[i];
        Iterator it = C61595o.m72301i(0, length).iterator();
        while (it.hasNext()) {
            int a = ((C36904l0) it).mo59695a();
            int i2 = a * 3;
            int i3 = a * 4;
            bArr[i2] = array[i3];
            bArr[i2 + 1] = array[i3 + 1];
            bArr[i2 + 2] = array[i3 + 2];
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.put(bArr);
        Log.m105924i("Finder.WatermarkDetCore", "handle bitmap time: " + (SystemClock.uptimeMillis() - uptimeMillis) + ", width:" + this.f190304d.getWidth() + " height:" + this.f190304d.getHeight() + " new width:" + bitmap.getWidth() + " new height:" + bitmap.getHeight());
        return new C13604l(allocateDirect, new C13604l(new Integer(bitmap.getWidth()), new Integer(bitmap.getHeight())));
    }
}
