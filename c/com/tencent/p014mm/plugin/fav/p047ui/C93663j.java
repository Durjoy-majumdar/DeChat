package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashMap;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;
import te3.C90431pc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.j */
public class C93663j {
    /* renamed from: a */
    public static boolean m118352a(C90431pc0 pc02) {
        if (pc02 == null) {
            return false;
        }
        return pc02.f259745h == 3 || pc02.f259749o == 1;
    }

    /* renamed from: b */
    public static HashMap<String, Object> m118353b(C100755z zVar) {
        C90431pc0 pc02 = zVar.field_favProto.f298610I;
        C101834rc0 D = C100734q.m131813D(zVar);
        String format = String.format("file://%s", new Object[]{C100734q.m131826Q(D)});
        if (!C86013q1.m106450k(format)) {
            format = String.format("file://%s", new Object[]{C100734q.m131880w(D)});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("desc", zVar.field_favProto.f298626q);
        hashMap.put("type", 2);
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, zVar.field_favProto.f298626q);
        hashMap.put("app_id", pc02.f259742e);
        hashMap.put("pkg_type", Integer.valueOf(pc02.f259743f));
        hashMap.put("pkg_version", Integer.valueOf(pc02.f259748n));
        hashMap.put("img_url", format);
        hashMap.put("is_dynamic", Boolean.FALSE);
        hashMap.put("cache_key", "");
        hashMap.put("path", pc02.f259746i);
        hashMap.put("subType", Integer.valueOf(pc02.f259752r));
        Log.m105925i("MicroMsg.FavAppBrandLogic", "buildAppBrandMsgParamsForIntent image path:%s", format);
        return hashMap;
    }
}
