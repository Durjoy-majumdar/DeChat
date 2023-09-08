package cw2;

import android.database.Cursor;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gw2.C98268m;
import gy3.C87412m;
import kw2.C34078m;
import kw2.C99270n;
import p823sg.C90193h;
import te3.bc4;
import z04.C119027c;

/* renamed from: cw2.u */
public final class C97399u {

    /* renamed from: a */
    public static final C97399u f285903a = new C97399u();

    /* renamed from: a */
    public final String mo136667a(int i, String str) {
        String str2;
        if (str == null) {
            str2 = "story_local_video_" + i;
        } else {
            str2 = C1297x.m1387b("storyvideo", (long) i, "story", str);
        }
        if (Util.isNullOrNil(str2)) {
            return null;
        }
        return str2;
    }

    /* renamed from: b */
    public final C34078m mo136668b(C98268m mVar) {
        C87412m.m108594g(mVar, "videoItem");
        String str = "";
        boolean z = false;
        if (mVar.mo137567a()) {
            C34078m mVar2 = new C34078m();
            mVar2.field_storyId = mVar.f288089b;
            mVar2.field_url = str;
            mVar2.field_cacheSize = 0;
            mVar2.field_totalSize = 0;
            mVar2.field_filePath = str;
            return mVar2;
        }
        String d = mo136670d(mVar.f288093f, mVar.f288091d);
        C97391o oVar = C97391o.f285892a;
        if (d != null) {
            str = d;
        }
        oVar.mo136650c(str, true);
        StoryCore.C96337h hVar = StoryCore.f281736t;
        C99270n k = hVar.mo134193k();
        long j = mVar.f288089b;
        C34078m mVar3 = null;
        if (j == 0) {
            String str2 = C99270n.f291096f;
            Log.m105924i(str2, "Test get mediaId error " + j + ' ' + Util.getStack());
        } else {
            Cursor rawQuery = k.f291097d.rawQuery("select * from StoryVideoCacheInfo  where storyId = '" + j + "' ", (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToFirst()) {
                    C34078m mVar4 = new C34078m();
                    mVar4.convertFrom(rawQuery);
                    mVar3 = mVar4;
                }
                rawQuery.close();
            }
        }
        if (mVar3 == null) {
            mVar3 = new C34078m();
            mVar3.field_storyId = mVar.f288089b;
            mVar3.field_url = mVar.f288093f.f297961f;
            mVar3.field_cacheSize = 0;
            mVar3.field_totalSize = 0;
            mVar3.field_filePath = d;
            hVar.mo134193k().insert(mVar3);
        }
        String str3 = mVar3.field_filePath;
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        if (z) {
            mVar3.field_filePath = d;
        }
        return mVar3;
    }

    /* renamed from: c */
    public final String mo136669c(String str) {
        C97391o oVar = C97391o.f285892a;
        String i = C86013q1.m106448i(oVar.mo136649b(str) + "video/", true);
        C87412m.m108591d(i);
        Log.m105925i("MicroMsg.StoryVideoLogic", "get story video dir %s username %s", i, str);
        return i;
    }

    /* renamed from: d */
    public final String mo136670d(bc4 bc4, String str) {
        String str2;
        if (bc4 == null) {
            return null;
        }
        C97391o oVar = C97391o.f285892a;
        String str3 = bc4.f297961f;
        if (str3 == null) {
            oVar.getClass();
            str2 = "";
        } else {
            byte[] bytes = str3.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            str2 = oVar.mo136655h(oVar.mo136649b(str) + "video/", C90193h.m112878f(bytes));
        }
        Log.m105925i("MicroMsg.StoryVideoLogic", "get story video path %s", str2);
        return str2;
    }

    /* renamed from: e */
    public final String mo136671e(bc4 bc4) {
        if (bc4 == null) {
            return null;
        }
        C97391o oVar = C97391o.f285892a;
        String str = bc4.f297959d;
        if (str == null) {
            oVar.getClass();
            return "";
        }
        return oVar.mo136655h(oVar.mo136648a(), str) + ".u";
    }
}
