package mo1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import o40.C61926c;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: mo1.n2 */
public final class C11021n2<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ String f32745a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f32746b;

    public C11021n2(String str, ImageView imageView) {
        this.f32745a = str;
        this.f32746b = imageView;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            String str = this.f32745a;
            C61926c.m72668M(new C11018m2(this.f32746b));
            Log.m105924i("Finder.ProfileUiStyleUIC", "[handleProfileCover] [" + bitmap.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + bitmap.getHeight() + "] allocationByteCount=" + Util.getSizeKB((long) bitmap.getAllocationByteCount()) + " coverUrl=" + str);
        }
    }
}
