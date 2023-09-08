package ly1;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import p500dy.C97560f;
import sw1.C48478n;
import sx3.C36907w;
import vx1.C53037a;
import ww1.C53213c;
import ww1.C53214d;
import ww1.C53215e;

/* renamed from: ly1.w0 */
public final class C46914w0 {
    /* renamed from: a */
    public final C53037a mo72119a(C48478n.C13793h hVar, String str, String str2) {
        String fileMD5String = MD5Util.getFileMD5String(new C86009m1(hVar.f38919c));
        Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(hVar.f38919c, 2);
        String str3 = str + ("cover_" + fileMD5String + ".png");
        String str4 = str + (hVar.f38917a + '_' + fileMD5String + ".mp4");
        if (createVideoThumbnail != null && !createVideoThumbnail.isRecycled()) {
            try {
                BitmapUtil.saveBitmapToImage(createVideoThumbnail, 100, Bitmap.CompressFormat.PNG, str3, true);
            } catch (IOException unused) {
            }
        }
        int a = ((C97560f) C86312j.m106911c(C97560f.class)).Z40(hVar.f38919c).mo130041a();
        long d = C86013q1.m106443d(hVar.f38919c, str4, false);
        if (d != -1) {
            C53037a aVar = new C53037a();
            aVar.field_fileId = fileMD5String;
            aVar.field_userId = str2;
            aVar.field_appId = hVar.f38917a;
            aVar.field_appName = hVar.f38918b;
            aVar.field_filePath = str4;
            aVar.field_orgFilePath = hVar.f38919c;
            aVar.field_coverPath = str3;
            aVar.field_extJsonData = hVar.f38920d;
            aVar.field_createTime = System.currentTimeMillis();
            aVar.field_durationSec = (long) a;
            aVar.field_title = hVar.f38921e;
            aVar.field_desc = hVar.f38922f;
            return aVar;
        }
        Log.m105919d("MicroMsg.MiniGameVideoProcessor", "gamelog.saveToGameCenterLocal, GameExternalService, userId = %s ret = %d ", str2, Long.valueOf(d));
        return null;
    }

    /* renamed from: b */
    public final void mo72120b(List<? extends C53037a> list, int i) {
        C87412m.m108594g(list, "videoList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C53037a aVar : list) {
            C53213c cVar = new C53213c();
            cVar.f148443d = aVar.field_fileId;
            cVar.f148445f = aVar.field_appId;
            cVar.f148444e = aVar.field_extJsonData;
            arrayList.add(cVar);
        }
        C53214d dVar = new C53214d();
        dVar.f148446d = i;
        dVar.f148447e = new LinkedList<>(arrayList);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = dVar;
        bVar.f127067b = new C53215e();
        bVar.f127068c = "/cgi-bin/mmgame-bin/reportlocalwxagvideo";
        bVar.f127069d = 25686;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C46912u0(dVar));
    }
}
