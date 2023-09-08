package er1;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import p206nj.C76861g;
import pl1.C11986o0;
import pl1.C62344b0;
import pl1.C62367r0;
import rx3.C13604l;
import te3.C64726td1;
import up1.C37521f;

/* renamed from: er1.j5 */
public final class C58741j5 {

    /* renamed from: a */
    public static final C58741j5 f168184a = new C58741j5();

    /* renamed from: b */
    public static final String f168185b;

    /* renamed from: c */
    public static final String f168186c;

    /* renamed from: d */
    public static final String f168187d;

    /* renamed from: e */
    public static final String f168188e;

    /* renamed from: f */
    public static final String f168189f;

    /* renamed from: g */
    public static final String f168190g;

    /* renamed from: h */
    public static final String f168191h;

    /* renamed from: i */
    public static final String f168192i;

    /* renamed from: j */
    public static final String f168193j;

    /* renamed from: k */
    public static final String f168194k;

    /* renamed from: l */
    public static final String f168195l;

    /* renamed from: m */
    public static final String f168196m;

    /* renamed from: n */
    public static final C58769q0[] f168197n;

    static {
        String str = VFSStrategy.m163776d("finder") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("Finder.PathRouter", "FINDER_DATA_ROOT=" + str);
        String str2 = VFSStrategy.m163776d("finder_page") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("Finder.PathRouter", "FINDER_DATA_PAGE_ROOT=" + str2);
        f168185b = str2;
        String str3 = VFSStrategy.m163776d(WeChatBrands.Business.GROUP_LIVE) + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("Finder.PathRouter", "FINDER_LIVE_ROOT=" + str3);
        f168186c = str3;
        String str4 = VFSStrategy.m163776d("live_replay") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("Finder.PathRouter", "FINDER_LIVE_REPLAY_ROOT=" + str4);
        f168187d = str4;
        String str5 = VFSStrategy.m163776d("finderposting") + XVFSFile.SEPARATOR_CHAR;
        Log.m105924i("Finder.PathRouter", "FINDER_POSTING_ROOT=" + str5);
        String str6 = str + "image/";
        Log.m105924i("Finder.PathRouter", "FINDER_IMG_DIR=" + str6);
        f168188e = str6;
        String str7 = str + "video/";
        Log.m105924i("Finder.PathRouter", "FINDER_VIDEO_DIR=" + str7);
        f168189f = str7;
        String str8 = str + "avatar/";
        Log.m105924i("Finder.PathRouter", "FINDER_AVATAR_DIR=" + str8);
        f168190g = str8;
        String str9 = str + "cover/";
        Log.m105924i("Finder.PathRouter", "FINDER_COVER_DIR=" + str9);
        f168191h = str9;
        String str10 = str + "tmp/";
        Log.m105924i("Finder.PathRouter", "FINDER_TMP_DIR=" + str10);
        f168192i = str10;
        String str11 = str + "capture/";
        Log.m105924i("Finder.PathRouter", "FINDER_CAPTURE_DIR=" + str11);
        f168193j = str11;
        String str12 = str + "constants/";
        Log.m105924i("Finder.PathRouter", "FINDER_CONSTANTS_DIR=" + str12);
        f168194k = str12;
        String str13 = str5 + "media_tmp/";
        Log.m105924i("Finder.PathRouter", "POST_MEDIA_TMP_DIR=" + str13);
        f168195l = str13;
        String str14 = str5 + "posting/";
        Log.m105924i("Finder.PathRouter", "POST_MEDIA_DIR=" + str14);
        f168196m = str14;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        boolean z = C37521f.f99400f8.mo60266n().intValue() == 0;
        boolean z2 = z;
        C58769q0[] q0VarArr = {new C58769q0(str, "视频号根目录", 0, false, 21, false, 36, (C8480h) null), new C58769q0(str2, "视频号page根目录", 0, false, 0, false, 52, (C8480h) null), new C58769q0(str3, "视频号直播根目录", 0, false, 31, false, 36, (C8480h) null), new C58769q0(str5, "视频号发表根目录", 0, false, 21, false, 36, (C8480h) null), new C58769q0(str6, "feed图片目录", fVar.mo61193s(), z2, 23, false, 32, (C8480h) null), new C58769q0(str7, "feed视频目录", fVar.mo61196v(), z, 24, true), new C58769q0(str8, "视频号头像目录", fVar.mo61190p(), z2, 25, false, 32, (C8480h) null), new C58769q0(str9, "视频号封面目录", fVar.mo61192r(), z2, 25, false, 32, (C8480h) null), new C58769q0(str10, "视频号临时目录", fVar.mo61195u(), z2, 27, false, 32, (C8480h) null), new C58769q0(str12, "视频号简单数据记录目录", fVar.mo61190p(), z2, 0, false, 48, (C8480h) null), new C58769q0(str11, "视频号拍摄目录", fVar.mo61191q(), z2, 28, false, 32, (C8480h) null), new C58769q0(str14, "视频号发表目录", 0, false, 29, false, 36, (C8480h) null), new C58769q0(str13, "视频号发表临时目录", fVar.mo61194t(), false, 30, false, 40, (C8480h) null)};
        f168197n = q0VarArr;
        for (int i = 0; i < 13; i++) {
            C86013q1.m106461v(q0VarArr[i].f168261a);
        }
    }

    /* renamed from: a */
    public final void mo83727a() {
        for (C58769q0 q0Var : f168197n) {
            C86013q1.m106445f(q0Var.f168261a);
        }
        for (C58769q0 q0Var2 : f168197n) {
            C86013q1.m106461v(q0Var2.f168261a);
        }
    }

    /* renamed from: b */
    public final String mo83728b() {
        C76861g.C47263a aVar = new C76861g.C47263a();
        aVar.mo72289b();
        StringBuilder sb = new StringBuilder("\n");
        long j = 0;
        for (C58769q0 q0Var : f168197n) {
            C13604l<Integer, Long> a = q0Var.mo83807a(true);
            j += ((Number) a.f38556e).longValue();
            sb.append(q0Var.f168262b + '(' + ((Number) a.f38555d).intValue() + " file), size=" + Util.getSizeKB(((Number) a.f38556e).longValue()) + ", cost=" + aVar.mo72288a() + "ms path=" + q0Var.f168261a + 10);
        }
        sb.append("TotalSize=" + Util.getSizeKB(j) + " Cost=" + aVar.mo72288a() + LocaleUtil.MALAY);
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "ss.toString()");
        return sb4;
    }

    /* renamed from: c */
    public final String mo83729c(C64726td1 td12) {
        C87412m.m108594g(td12, "musicInfo");
        return f168192i + td12.f185534d;
    }

    /* renamed from: d */
    public final String mo83730d(C62344b0 b0Var, String str) {
        C87412m.m108594g(b0Var, "image");
        C87412m.m108594g(str, "suffix");
        return f168196m + b0Var.mo11841b() + '_' + str;
    }

    /* renamed from: e */
    public final String mo83731e(String str) {
        C87412m.m108594g(str, DownloadInfo.FILENAME);
        return f168196m + str;
    }

    /* renamed from: f */
    public final String mo83732f(C11986o0 o0Var, String str) {
        C87412m.m108594g(o0Var, "image");
        C87412m.m108594g(str, "suffix");
        return f168196m + o0Var.mo11841b() + '_' + str;
    }

    /* renamed from: g */
    public final String mo83733g(String str) {
        C87412m.m108594g(str, "videoPath");
        return f168196m + "video_" + MD5Util.getMD5String(str) + '_' + C86013q1.m106452m(str) + "_half_thumb";
    }

    /* renamed from: h */
    public final String mo83734h(C62367r0 r0Var, String str) {
        C87412m.m108594g(r0Var, "video");
        C87412m.m108594g(str, "suffix");
        return f168196m + r0Var.mo11841b() + '_' + str;
    }

    /* renamed from: i */
    public final String mo83735i(String str) {
        C87412m.m108594g(str, "videoPath");
        return f168196m + "video_" + MD5Util.getMD5String(str) + '_' + C86013q1.m106452m(str) + "_thumb";
    }

    /* renamed from: j */
    public final String mo83736j(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("finder_video_");
        sb.append(str);
        sb.append('_');
        if (Util.isNullOrNil(str2)) {
            if (str3 == null) {
                str3 = "";
            }
            str2 = MD5Util.getMD5String(str3);
        }
        sb.append(str2);
        return sb.toString();
    }
}
