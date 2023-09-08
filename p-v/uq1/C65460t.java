package uq1;

import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import pl1.C62366q;
import te3.C64689rq2;

/* renamed from: uq1.t */
public final class C65460t {

    /* renamed from: a */
    public static final C65460t f188357a = new C65460t();

    /* renamed from: b */
    public static final C62366q f188358b = new C65461a();

    /* renamed from: uq1.t$a */
    public static final class C65461a implements C62366q {
    }

    /* renamed from: a */
    public final void mo89573a(FinderMedia finderMedia, C64689rq2 rq22, LinkedList<C64689rq2> linkedList) {
        T t;
        C87412m.m108594g(finderMedia, "media");
        C87412m.m108594g(rq22, "fullMedia");
        C87412m.m108594g(linkedList, "halfMediaList");
        Log.m105924i("Finder.HalfMediaLogic", "fillBack " + rq22.f185251R);
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(rq22.f185251R, ((C64689rq2) t).f185251R)) {
                break;
            }
        }
        C64689rq2 rq23 = (C64689rq2) t;
        if (rq23 == null) {
            String str = rq22.f185278r;
            finderMedia.url = str;
            finderMedia.thumbUrl = rq22.f185279s;
            String str2 = rq22.f185272j;
            finderMedia.md5sum = str2;
            float f = rq22.f185270h;
            finderMedia.width = f;
            float f2 = rq22.f185271i;
            finderMedia.height = f2;
            int i = rq22.f185273n;
            finderMedia.fileSize = i;
            int i2 = rq22.f185274o;
            finderMedia.bitrate = i2;
            finderMedia.full_url = str;
            finderMedia.full_thumb_url = rq22.f185241H;
            finderMedia.full_md5sum = str2;
            finderMedia.full_width = f;
            finderMedia.full_height = f2;
            finderMedia.full_file_size = i;
            finderMedia.full_bitrate = i2;
            Log.m105924i("Finder.HalfMediaLogic", "no half");
            Log.m105924i("Finder.HalfMediaLogic", "media.url:" + finderMedia.url);
            Log.m105924i("Finder.HalfMediaLogic", "media.thumbUrl:" + finderMedia.thumbUrl);
            Log.m105924i("Finder.HalfMediaLogic", "media.full_url:" + finderMedia.full_url);
            Log.m105924i("Finder.HalfMediaLogic", "media.full_thumb_url:" + finderMedia.full_thumb_url);
        } else {
            finderMedia.url = rq23.f185278r;
            finderMedia.thumbUrl = rq23.f185279s;
            finderMedia.md5sum = rq23.f185272j;
            finderMedia.width = rq23.f185270h;
            finderMedia.height = rq23.f185271i;
            finderMedia.fileSize = rq23.f185273n;
            finderMedia.bitrate = rq23.f185274o;
            finderMedia.full_url = rq22.f185278r;
            finderMedia.full_thumb_url = rq22.f185241H;
            finderMedia.full_md5sum = rq22.f185272j;
            finderMedia.full_width = rq22.f185270h;
            finderMedia.full_height = rq22.f185271i;
            finderMedia.full_file_size = rq22.f185273n;
            finderMedia.full_bitrate = rq22.f185274o;
            Log.m105924i("Finder.HalfMediaLogic", "half");
            Log.m105924i("Finder.HalfMediaLogic", "media.url:" + finderMedia.url);
            Log.m105924i("Finder.HalfMediaLogic", "media.thumbUrl:" + finderMedia.thumbUrl);
            Log.m105924i("Finder.HalfMediaLogic", "media.full_url:" + finderMedia.full_url);
            Log.m105924i("Finder.HalfMediaLogic", "media.full_thumb_url:" + finderMedia.full_thumb_url);
        }
        finderMedia.coverUrl = rq22.f185237D;
        finderMedia.full_cover_url = rq22.f185259V;
        Log.m105924i("Finder.HalfMediaLogic", "media.coverUrl:" + finderMedia.coverUrl);
        Log.m105924i("Finder.HalfMediaLogic", "media.fullCover:" + finderMedia.full_cover_url);
        finderMedia.half_rect = rq22.f185248P;
    }
}
