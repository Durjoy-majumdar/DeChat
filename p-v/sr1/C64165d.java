package sr1;

import android.graphics.Bitmap;
import com.tencent.p014mm.autogen.events.PreloadProcessChangeEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import pl1.C100810g0;
import r60.C101350i;
import t60.C64207e;
import te3.C64689rq2;
import x60.C102564a;

/* renamed from: sr1.d */
public final class C64165d<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ C64689rq2 f181886a;

    public C64165d(C64689rq2 rq22) {
        this.f181886a = rq22;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C64689rq2 rq22 = this.f181886a;
            PreloadProcessChangeEvent preloadProcessChangeEvent = new PreloadProcessChangeEvent();
            int l = (int) C86013q1.m106451l(((C100810g0) aVar.f301995a).getPath());
            PreloadProcessChangeEvent.C55157a aVar2 = preloadProcessChangeEvent.f154859d;
            aVar2.f154860a = rq22.f185275p;
            aVar2.f154862c = 2;
            aVar2.f154863d = l;
            preloadProcessChangeEvent.publish();
            Log.m105924i("Finder.ImageBannerAdapter", rq22.f185275p + " [" + bitmap.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + bitmap.getHeight() + "] fileLength=" + Util.getSizeKB((long) l) + " allocationByteCount=" + Util.getSizeKB((long) bitmap.getAllocationByteCount()));
        }
    }
}
