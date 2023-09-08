package kx1;

import android.net.Uri;
import android.webkit.URLUtil;
import ax1.C39642e;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86312j;
import eb0.C75592q0;
import gy3.C8479f0;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import zt3.C119157j;

/* renamed from: kx1.a */
public final class C46787a {

    /* renamed from: kx1.a$a */
    public static final class C46788a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f125905d;

        /* renamed from: e */
        public final /* synthetic */ boolean f125906e;

        /* renamed from: f */
        public final /* synthetic */ String f125907f;

        /* renamed from: g */
        public final /* synthetic */ String f125908g;

        /* renamed from: h */
        public final /* synthetic */ String f125909h;

        /* renamed from: i */
        public final /* synthetic */ C46789b f125910i;

        public C46788a(C8479f0<String> f0Var, boolean z, String str, String str2, String str3, C46789b bVar) {
            this.f125905d = f0Var;
            this.f125906e = z;
            this.f125907f = str;
            this.f125908g = str2;
            this.f125909h = str3;
            this.f125910i = bVar;
        }

        public final void run() {
            boolean z = this.f125906e;
            String str = this.f125907f;
            String str2 = this.f125908g;
            String str3 = this.f125909h;
            C46789b bVar = this.f125910i;
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_GameChatRoomMediaUploader";
            gVar.field_mediaId = (String) this.f125905d.f27484d;
            gVar.f287662f = bVar;
            gVar.field_fullpath = str2;
            gVar.field_needStorage = false;
            gVar.field_priority = 3;
            if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
                gVar.field_fileType = 2;
                gVar.f287672s = str;
                gVar.field_authKey = "";
            } else {
                gVar.field_fileId = str;
                gVar.field_aesKey = str3;
                if (z) {
                    gVar.field_fileType = 3;
                } else {
                    gVar.field_fileType = 2;
                }
            }
            ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
        }
    }

    /* renamed from: kx1.a$b */
    public static final class C46789b implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C39642e f125911d;

        /* renamed from: e */
        public final /* synthetic */ String f125912e;

        public C46789b(C39642e eVar, String str) {
            this.f125911d = eVar;
            this.f125912e = str;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2;
            String str3;
            long j;
            String dVar2;
            String str4 = str;
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar3 = dVar;
            C87412m.m108594g(str4, "mediaId");
            Object[] objArr = new Object[4];
            objArr[0] = str4;
            objArr[1] = Integer.valueOf(i);
            String str5 = "null";
            if (cVar2 == null || (str2 = cVar.toString()) == null) {
                str2 = str5;
            }
            objArr[2] = str2;
            if (!(dVar3 == null || (dVar2 = dVar.toString()) == null)) {
                str5 = dVar2;
            }
            objArr[3] = str5;
            Log.m105925i("MicroMsg.ChatRoomMediaDownloader", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
            if (i2 == -21005) {
                Log.m105925i("MicroMsg.ChatRoomMediaDownloader", "duplicate request, ignore this request, media id is %s", str4);
                return 0;
            } else if (i2 != 0) {
                Log.m105921e("MicroMsg.ChatRoomMediaDownloader", "start failed : %d, media id is :%s", Integer.valueOf(i), str4);
                this.f125911d.mo62209a(false, i2, str4, "");
                return 0;
            } else if (cVar2 != null) {
                Log.m105925i("MicroMsg.ChatRoomMediaDownloader", "progressInfo : %s", cVar.toString());
                long j2 = cVar2.field_toltalLength;
                long j3 = 0;
                if (j2 > 0) {
                    str3 = "MicroMsg.ChatRoomMediaDownloader";
                    j = (cVar2.field_finishedLength * ((long) 100)) / j2;
                } else {
                    str3 = "MicroMsg.ChatRoomMediaDownloader";
                    j = 0;
                }
                if (j >= 0) {
                    j3 = j > 100 ? 100 : j;
                }
                Log.m105919d(str3, "progressInfo, percent = %d, finishLen = %d, totalLen = %d", Long.valueOf(j3), Long.valueOf(cVar2.field_finishedLength), Long.valueOf(cVar2.field_toltalLength));
                this.f125911d.mo62210b((int) j3, str4);
                return 0;
            } else {
                String str6 = "MicroMsg.ChatRoomMediaDownloader";
                if (dVar3 != null) {
                    int i3 = dVar3.field_retCode;
                    if (i3 != 0) {
                        Log.m105921e(str6, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str4, Integer.valueOf(i3), dVar3);
                        this.f125911d.mo62209a(false, dVar3.field_retCode, str4, "");
                    } else {
                        Log.m105925i(str6, "cdn trans suceess, media id : %s", str4);
                        this.f125911d.mo62209a(true, 0, str4, this.f125912e);
                    }
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            return null;
        }
    }

    /* renamed from: a */
    public static final String m52077a(boolean z, String str, String str2, String str3, C39642e eVar) {
        String str4;
        C87412m.m108594g(eVar, "downloadCallback");
        C8479f0 f0Var = new C8479f0();
        StringBuilder sb = new StringBuilder();
        sb.append("gameimgdownload");
        sb.append('_');
        sb.append(MD5Util.getMD5String(C75592q0.m90789s() + Util.nowMilliSecond()));
        T sb4 = sb.toString();
        f0Var.f27484d = sb4;
        if (str == null) {
            return sb4;
        }
        if (z) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("thumb_download_");
            sb5.append(MD5Util.getMD5String(str + str2));
            str4 = sb5.toString();
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("image_download_");
            sb6.append(MD5Util.getMD5String(str + str2));
            str4 = sb6.toString();
        }
        String str5 = C41872f.m45392b(C41872f.C41873a.ONE_WEEK) + "image/chatroom/" + str4;
        Uri n = C116299g2.m163858n(str5);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            Log.m105924i("MicroMsg.ChatRoomMediaDownloader", "local cache file");
            eVar.mo62209a(true, 0, (String) f0Var.f27484d, str5);
            return (String) f0Var.f27484d;
        }
        ((C119157j) C119157j.f356862d).mo183875f(new C46788a(f0Var, z, str, str5, str2, new C46789b(eVar, str5)));
        return (String) f0Var.f27484d;
    }
}
