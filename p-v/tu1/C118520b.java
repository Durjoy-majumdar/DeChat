package tu1;

import android.content.Context;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p823sg.C90193h;
import z04.C112551y;
import z04.C119027c;

/* renamed from: tu1.b */
public final class C118520b implements C98127h.C98128a, C98124g.C98125a, C98124g.C98126b {

    /* renamed from: d */
    public final String f354695d = "MicroMsg.FlutterVideoPlayerMgr";

    /* renamed from: e */
    public String f354696e;

    /* renamed from: f */
    public String f354697f;

    /* renamed from: g */
    public HashMap<String, C118521a> f354698g = new HashMap<>();

    /* renamed from: h */
    public String f354699h;

    /* renamed from: tu1.b$a */
    public static final class C118521a {

        /* renamed from: a */
        public long f354700a;

        /* renamed from: b */
        public long f354701b;

        /* renamed from: c */
        public long f354702c;

        /* renamed from: d */
        public boolean f354703d;

        /* renamed from: e */
        public String f354704e = "";

        /* renamed from: f */
        public boolean f354705f;

        /* renamed from: g */
        public boolean f354706g;

        /* renamed from: h */
        public boolean f354707h;
    }

    public C118520b(Context context) {
        C87412m.m108594g(context, "context");
        this.f354696e = context.getCacheDir() + "/flutter/FTVideo/";
    }

    /* renamed from: a */
    public final C118521a mo183240a(String str) {
        if (this.f354698g.get(str) == null) {
            return new C118521a();
        }
        C118521a aVar = this.f354698g.get(str);
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
        return aVar;
    }

    /* renamed from: b */
    public void mo31987b(String str, C98121d dVar) {
        if (str != null && dVar != null) {
            if (this.f354698g.get(str) == null) {
                String str2 = this.f354695d;
                Log.m105920e(str2, "preload completed, but task not found, mediaId:" + str);
                return;
            }
            C118521a aVar = this.f354698g.get(str);
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            C118521a aVar2 = aVar;
            String str3 = this.f354695d;
            Log.m105918d(str3, "cdntask end preload id:" + str + ", isplaymode:" + aVar2.f354706g);
            aVar2.f354702c = dVar.field_fileLength;
            aVar2.f354701b = dVar.field_recvedBytes;
            aVar2.f354707h = true;
            aVar2.f354705f = false;
            this.f354698g.put(str, aVar2);
            String str4 = this.f354695d;
            Log.m105924i(str4, "preload completed mediaId:" + str);
        }
    }

    /* renamed from: c */
    public final void mo183241c(String str, Long l) {
        C118521a aVar;
        this.f354699h = str;
        if (str == null) {
            Log.m105918d(this.f354695d, "FVPlayer preLoadTask empty preload task");
            return;
        }
        byte[] bytes = str.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        String f = C90193h.m112878f(bytes);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f354696e);
        sb.append('-');
        String str2 = this.f354699h;
        sb.append(str2 != null ? str2.hashCode() : 0);
        sb.append(".mp4");
        String i = new C86009m1(sb.toString()).mo119971i();
        C87412m.m108593f(i, "VFSFile(\"${root}-${preLo…ode()}.mp4\").absolutePath");
        if (C112551y.m153809i(f, this.f354697f, true)) {
            String str3 = this.f354695d;
            Log.m105918d(str3, "FVPlayer preLoadTask can not preload playing task lastPlayMediaId:" + this.f354697f);
            return;
        }
        String str4 = this.f354695d;
        Log.m105918d(str4, "FVPlayer preLoadTask mediaId:" + f + " url:" + this.f354699h + " path:" + i);
        if (this.f354698g.get(f) == null) {
            aVar = new C118521a();
        } else {
            C118521a aVar2 = this.f354698g.get(f);
            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            aVar = aVar2;
        }
        if (aVar.f354707h && l != null && l.longValue() != 0 && aVar.f354700a < l.longValue()) {
            aVar.f354707h = false;
        }
        if (aVar.f354703d || aVar.f354707h || aVar.f354705f) {
            String str5 = this.f354695d;
            Log.m105918d(str5, "FVPlayer preLoadTask mediaId:" + f + " has downloaded or isDoing:" + aVar.f354703d + ", " + aVar.f354707h + ", " + aVar.f354705f + '.');
        } else {
            C98127h hVar = new C98127h();
            hVar.f287660d = "task_FlutterCdnDownloadMgr_1";
            hVar.field_mediaId = f;
            hVar.f287705p0 = this.f354699h;
            hVar.f287673t = 60;
            hVar.f287674u = 60;
            hVar.f287654K = 2;
            hVar.f287689V = 2;
            hVar.f287655L = 3;
            hVar.field_requestVideoFormat = 0;
            hVar.field_fullpath = i;
            hVar.f287696Y0 = 8;
            hVar.f287657N = 1;
            hVar.f287704f1 = this;
            hVar.f287662f = this;
            hVar.f287656M = this;
            if (!(l == null || l.longValue() == 0)) {
                hVar.f287671r = l.longValue();
            }
            if (!CdnLogic.taskExist(f)) {
                C118532k.f354730c.mo183248a().f354733b.mo141424a(hVar);
                aVar.f354705f = true;
                aVar.f354706g = false;
                String str6 = this.f354695d;
                Log.m105918d(str6, "cdntaskaction adddownload FVPlayer preLoadTask mediaId:" + f + " .");
            } else {
                String str7 = this.f354695d;
                Log.m105918d(str7, "FVPlayer preLoadTask task exist mediaId:" + f + " .");
            }
        }
        aVar.f354704e = i;
        HashMap<String, C118521a> hashMap = this.f354698g;
        C87412m.m108593f(f, "mediaId");
        hashMap.put(f, aVar);
    }

    /* renamed from: d */
    public final void mo183242d(boolean z, String str, String str2, Long l) {
        String str3 = this.f354695d;
        Log.m105918d(str3, "FVPlayer retryStartTask mediaId:" + str2 + " url:" + str);
        C118521a a = mo183240a(str2);
        if (z) {
            Boolean valueOf = Boolean.valueOf(a.f354705f);
            C87412m.m108591d(valueOf);
            if (valueOf.booleanValue()) {
                Boolean valueOf2 = Boolean.valueOf(a.f354706g);
                C87412m.m108591d(valueOf2);
                if (valueOf2.booleanValue()) {
                    String str4 = this.f354695d;
                    Log.m105926v(str4, "play mode is downloading:" + str2);
                    return;
                }
            }
            mo183243f(str, str2);
            return;
        }
        Boolean valueOf3 = Boolean.valueOf(a.f354705f);
        C87412m.m108591d(valueOf3);
        if (valueOf3.booleanValue()) {
            String str5 = this.f354695d;
            Log.m105918d(str5, "is already downloading, isPlayMode:" + z + ", curMode:" + Boolean.valueOf(a.f354706g));
        } else if (!a.f354707h || !(l == null || l.longValue() == 0 || a.f354701b >= l.longValue())) {
            mo183241c(str, l);
        } else {
            Log.m105918d(this.f354695d, "preload already done");
        }
    }

    /* renamed from: e */
    public void mo17917e(String str, long j, long j2) {
        C118521a aVar;
        String str2 = this.f354695d;
        Log.m105918d(str2, "onProgress mediaId:" + str + ", finish:" + j + ", length:" + j2);
        if (str != null) {
            if (this.f354698g.get(str) == null) {
                aVar = new C118521a();
            } else {
                C118521a aVar2 = this.f354698g.get(str);
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                aVar = aVar2;
            }
            aVar.f354700a = j;
            aVar.f354702c = j2;
            this.f354698g.put(str, aVar);
            if (j == j2) {
                String str3 = this.f354695d;
                Log.m105924i(str3, "onprogress cdntask end id:" + str);
                aVar.f354703d = true;
            }
        }
    }

    /* renamed from: f */
    public final void mo183243f(String str, String str2) {
        byte[] bArr;
        C118521a aVar;
        Log.m105918d(this.f354695d, "FVPlayer startTask mediaId:" + str2 + " url:" + str);
        if (!CdnLogic.taskExist(str2)) {
            boolean z = this.f354698g.get(str2) == null;
            C118521a aVar2 = this.f354698g.get(str2);
            Boolean valueOf = aVar2 != null ? Boolean.valueOf(aVar2.f354703d) : null;
            Log.m105920e(this.f354695d, "testtest task not in preload, in info cache:" + z + ", completed:" + valueOf);
        }
        if (str != null) {
            bArr = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = null;
        }
        String f = C90193h.m112878f(bArr);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f354696e);
        sb.append('-');
        sb.append(str != null ? str.hashCode() : 0);
        sb.append(".mp4");
        String i = new C86009m1(sb.toString()).mo119971i();
        C87412m.m108593f(i, "VFSFile(\"${root}-${url.h…ode()}.mp4\").absolutePath");
        if (this.f354698g.get(f) == null) {
            aVar = new C118521a();
        } else {
            C118521a aVar3 = this.f354698g.get(f);
            C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
            aVar = aVar3;
        }
        if (!C112551y.m153810j(this.f354697f, f, false, 2, (Object) null) || !aVar.f354705f || !aVar.f354706g) {
            if (!aVar.f354703d) {
                C98127h hVar = new C98127h();
                hVar.f287660d = "task_FlutterCdnDownloadMgr_2";
                hVar.field_mediaId = f;
                hVar.f287705p0 = str;
                hVar.f287673t = 60;
                hVar.f287674u = 60;
                hVar.f287654K = 1;
                hVar.f287689V = 1;
                hVar.f287655L = 3;
                hVar.field_requestVideoFormat = 0;
                hVar.field_fullpath = i;
                hVar.f287696Y0 = 8;
                hVar.f287704f1 = this;
                String str3 = this.f354697f;
                if (str3 != null && !C112551y.m153810j(str3, f, false, 2, (Object) null) && CdnLogic.taskExist(this.f354697f)) {
                    int b = C118532k.f354730c.mo183248a().f354733b.mo141425b(this.f354697f);
                    aVar.f354705f = false;
                    Log.m105918d(this.f354695d, "cdntaskaction cancel FVPlayer startTask cancelDownloadTask lastPlayMediaId:" + this.f354697f + ' ' + b);
                }
                if (CdnLogic.taskExist(f) && !aVar.f354706g) {
                    int b2 = C118532k.f354730c.mo183248a().f354733b.mo141425b(f);
                    aVar.f354705f = false;
                    Log.m105918d(this.f354695d, "cdntaskaction cancel FVPlayer startTask cancelDownloadTask lastPlayMediaId:" + this.f354697f + " mediaId:" + f + ' ' + b2);
                }
                int a = C118532k.f354730c.mo183248a().f354733b.mo141424a(hVar);
                aVar.f354705f = true;
                aVar.f354706g = true;
                Log.m105918d(this.f354695d, "cdntaskaction adddownload FVPlayer startTask addDownloadTaskNotCancelInMainThread mediaId:" + f + ' ' + a + " playmode:true path: " + i);
            } else {
                Log.m105918d(this.f354695d, "FVPlayer startTask mediaId:" + f + " has downloaded.");
            }
            this.f354697f = f;
            aVar.f354704e = i;
            HashMap<String, C118521a> hashMap = this.f354698g;
            C87412m.m108593f(f, "mediaId");
            hashMap.put(f, aVar);
            return;
        }
        Log.m105924i(this.f354695d, "playmode is downloading:" + f);
    }

    /* renamed from: g */
    public void mo17918g(String str, int i, C98121d dVar) {
        C118521a aVar;
        if (str == null || dVar == null) {
            String str2 = this.f354695d;
            Log.m105920e(str2, "onfinish but id not found:" + str);
        } else {
            if (this.f354698g.get(str) == null) {
                aVar = new C118521a();
            } else {
                C118521a aVar2 = this.f354698g.get(str);
                C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.video.FlutterCdnDownloadMgr.FTVideoTaskInfo");
                aVar = aVar2;
            }
            String str3 = this.f354695d;
            Log.m105918d(str3, "cdntask end id:" + str + ", isplaymode:" + aVar.f354706g);
            long j = dVar.field_fileLength;
            aVar.f354700a = j;
            aVar.f354702c = j;
            aVar.f354703d = true;
            this.f354698g.put(str, aVar);
            this.f354697f = null;
        }
        C118521a aVar3 = this.f354698g.get(str);
        if (aVar3 != null) {
            aVar3.f354705f = false;
        }
    }

    /* renamed from: g0 */
    public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
        String str2 = this.f354695d;
        Log.m105918d(str2, "FVPlayer callback mediaId:" + str + ' ');
        return 0;
    }

    /* renamed from: h */
    public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        String str2 = this.f354695d;
        Log.m105918d(str2, "FVPlayer getCdnAuthInfo mediaId:" + str);
    }

    /* renamed from: i */
    public final int mo183244i(String str) {
        String str2 = this.f354695d;
        Log.m105918d(str2, "cdntaskaction cancel FVPlayer stopTask mediaId:" + str + ' ');
        int b = C118532k.f354730c.mo183248a().f354733b.mo141425b(str);
        C118521a aVar = this.f354698g.get(str);
        if (aVar != null) {
            aVar.f354705f = false;
        }
        if (C112551y.m153809i(this.f354697f, str, true)) {
            this.f354697f = null;
        }
        return b;
    }

    /* renamed from: j */
    public byte[] mo1775j(String str, byte[] bArr) {
        String str2 = this.f354695d;
        Log.m105918d(str2, "FVPlayer decodePrepareResponse mediaId:" + str + ' ');
        return new byte[0];
    }

    public void onDataAvailable(String str, long j, long j2) {
        String str2 = this.f354695d;
        Log.m105918d(str2, "onDataAvailable mediaId:" + str + ", offset:" + j + ", length:" + j2);
    }

    public void onM3U8Ready(String str, String str2) {
        C87412m.m108594g(str, "mediaId");
    }

    public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
        C87412m.m108594g(videoInfo, "info");
    }
}
