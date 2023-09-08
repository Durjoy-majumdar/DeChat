package jh2;

import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32227p;
import gy3.C87412m;
import hi2.C98453h;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import jh2.C60863m;
import jp3.C9486a;
import jp3.C9487b;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import rx3.C13598b0;

/* renamed from: jh2.c */
public final class C60858c implements C9486a {

    /* renamed from: d */
    public final C9487b<C9486a> f173393d;

    /* renamed from: e */
    public final AudioCacheInfo f173394e;

    /* renamed from: f */
    public final String f173395f = "MicroMsg.AudioDownloadTask";

    /* renamed from: g */
    public final C98124g f173396g;

    /* renamed from: h */
    public final String f173397h;

    /* renamed from: i */
    public final List<C32227p<Boolean, String, C13598b0>> f173398i = Collections.synchronizedList(new ArrayList());

    /* renamed from: jh2.c$a */
    public static final class C60859a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ C60858c f173399d;

        /* renamed from: e */
        public final /* synthetic */ String f173400e;

        /* renamed from: f */
        public final /* synthetic */ String f173401f;

        public C60859a(C60858c cVar, String str, String str2) {
            this.f173399d = cVar;
            this.f173400e = str;
            this.f173401f = str2;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            String str2;
            String dVar2;
            C87412m.m108594g(str, "mediaId");
            String str3 = this.f173399d.f173395f;
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = Integer.valueOf(i);
            String str4 = "null";
            if (cVar == null || (str2 = cVar.toString()) == null) {
                str2 = str4;
            }
            objArr[2] = str2;
            if (!(dVar == null || (dVar2 = dVar.toString()) == null)) {
                str4 = dVar2;
            }
            objArr[3] = str4;
            Log.m105919d(str3, "AudioDownloadTask on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", objArr);
            if (dVar != null) {
                if (dVar.field_retCode == 0) {
                    String str5 = this.f173399d.f173395f;
                    Log.m105924i(str5, "download success " + str + ' ' + this.f173400e);
                    C86013q1.m106463x(this.f173401f, this.f173400e);
                    this.f173399d.mo85767a(true, this.f173400e);
                } else {
                    String str6 = this.f173399d.f173395f;
                    Log.m105928w(str6, "download fail sceneResult " + dVar.field_retCode);
                    this.f173399d.mo85767a(false, (String) null);
                }
            } else if (i != 0) {
                String str7 = this.f173399d.f173395f;
                Log.m105928w(str7, "download fail startRet " + i);
                this.f173399d.mo85767a(false, (String) null);
            }
            return 0;
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
            return new byte[0];
        }
    }

    public C60858c(C9487b<C9486a> bVar, AudioCacheInfo audioCacheInfo) {
        C87412m.m108594g(audioCacheInfo, "info");
        this.f173393d = bVar;
        this.f173394e = audioCacheInfo;
        String str = audioCacheInfo.f163817i + "_temp";
        String str2 = audioCacheInfo.f163817i;
        C98453h hVar = C98453h.f288774a;
        hVar.mo137808f(str, true);
        if (str2 != null) {
            hVar.mo137808f(str2, true);
        }
        String str3 = "downaudio_" + audioCacheInfo.f163813e;
        this.f173397h = str3;
        C98124g gVar = new C98124g();
        this.f173396g = gVar;
        gVar.f287660d = "task_AudioDownloadTask";
        gVar.f287673t = 60;
        gVar.f287674u = 60;
        gVar.field_mediaId = str3;
        gVar.f287672s = audioCacheInfo.f163814f;
        gVar.field_fileType = 40001;
        gVar.field_fullpath = str;
        gVar.field_aesKey = audioCacheInfo.f163826u;
        gVar.f287662f = new C60859a(this, str2, str);
    }

    /* renamed from: a */
    public final void mo85767a(boolean z, String str) {
        List<C32227p<Boolean, String, C13598b0>> list = this.f173398i;
        C87412m.m108593f(list, "callbacks");
        synchronized (list) {
            for (C32227p invoke : list) {
                invoke.invoke(Boolean.valueOf(z), str);
            }
        }
        this.f173398i.clear();
    }

    public void dead() {
        C60863m.C60868a aVar = C60863m.f173403b;
        C60863m.f173404c.mo85772f(this.f173394e);
    }
}
