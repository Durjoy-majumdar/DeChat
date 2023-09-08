package gr1;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;

/* renamed from: gr1.n1 */
public final class C59666n1<T, R> implements C64207e {

    /* renamed from: a */
    public final /* synthetic */ FinderVideoLayout f170488a;

    public C59666n1(FinderVideoLayout finderVideoLayout) {
        this.f170488a = finderVideoLayout;
    }

    /* renamed from: a */
    public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            FinderVideoLayout finderVideoLayout = this.f170488a;
            String fTPPTag = finderVideoLayout.getFTPPTag();
            StringBuilder sb = new StringBuilder();
            sb.append("[convert] mediaId=");
            FinderVideoLayout.C56521b playInfo = finderVideoLayout.getPlayInfo();
            C87412m.m108591d(playInfo);
            sb.append(playInfo.f161893b);
            sb.append(" thumb[");
            sb.append(bitmap.getWidth());
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(bitmap.getHeight());
            sb.append("] view[");
            sb.append(finderVideoLayout.getThumbView().getWidth());
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(finderVideoLayout.getThumbView().getHeight());
            sb.append("] size=");
            sb.append(Util.getSizeKB((long) bitmap.getAllocationByteCount()));
            sb.append(' ');
            Log.m105924i(fTPPTag, sb.toString());
        }
    }
}
