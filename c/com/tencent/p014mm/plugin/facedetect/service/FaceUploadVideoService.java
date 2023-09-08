package com.tencent.p014mm.plugin.facedetect.service;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import au1.C0222b;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.MMService;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb1.C45646t;
import f40.C86709a0;
import java.io.ByteArrayOutputStream;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;

/* renamed from: com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService */
public class FaceUploadVideoService extends MMService implements C11385n {

    /* renamed from: i */
    public int f345989i = -1;

    /* renamed from: com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService$b */
    public class C105231b implements C98124g.C98125a {

        /* renamed from: d */
        public long f312624d;

        /* renamed from: e */
        public String f312625e;

        /* renamed from: f */
        public String f312626f;

        public C105231b(long j, String str, String str2, C2274a aVar) {
            this.f312624d = j;
            this.f312625e = str;
            this.f312626f = str2;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            int i2 = i;
            C98121d dVar2 = dVar;
            Log.m105925i("MicroMsg.FaceUploadVideoService", "hy: sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
            if (dVar2 != null && dVar2.field_retCode == 0) {
                Log.m105924i("MicroMsg.FaceUploadVideoService", "hy: upload video done. now upload");
                C0222b.m171j(FaceUploadVideoService.this.f345989i, 0, "success");
                C115669n.INSTANCE.idkeyStat(917, 23, 1, false);
                FaceDetectReporter.m162243d(this.f312624d, 0, 0);
                C86709a0.m107524d().mo123455a(1197, FaceUploadVideoService.this);
                C86709a0.m107524d().mo123460f(new C45646t(this.f312626f, this.f312624d, this.f312625e, dVar2.field_fileId, dVar2.field_aesKey));
            } else if (dVar2 != null) {
                Log.m105929w("MicroMsg.FaceUploadVideoService", "hy: upload video cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
                C86013q1.m106447h(this.f312626f);
                C0222b.m171j(FaceUploadVideoService.this.f345989i, dVar2.field_retCode, "cdn error retCode");
                C115669n.INSTANCE.idkeyStat(917, 24, 1, false);
                FaceDetectReporter.m162243d(this.f312624d, 1, dVar2.field_retCode);
                return 0;
            } else if (i2 != 0) {
                Log.m105929w("MicroMsg.FaceUploadVideoService", "hy: upload video start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, Integer.valueOf(i), cVar, dVar2);
                C86013q1.m106447h(this.f312626f);
                C0222b.m171j(FaceUploadVideoService.this.f345989i, i2, "cdn error startRet");
                C115669n.INSTANCE.idkeyStat(917, 24, 1, false);
                FaceDetectReporter.m162243d(this.f312624d, 1, i2);
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.FaceUploadVideoService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        return null;
    }

    /* renamed from: g */
    public int mo93615g(Intent intent, int i, int i2) {
        Intent intent2 = intent;
        if (intent2 == null) {
            Log.m105920e("MicroMsg.FaceUploadVideoService", "hy: null intent called to FaceUploadVideoService! Stub");
            super.mo93615g((Intent) null, i, i2);
            return 0;
        }
        int i3 = i;
        int i4 = i2;
        String stringExtra = intent2.getStringExtra("key_video_file_name");
        long longExtra = intent2.getLongExtra("k_bio_id", -1);
        String stringExtra2 = intent2.getStringExtra("key_app_id");
        this.f345989i = intent2.getIntExtra("key_face_type", -1);
        Log.m105925i("MicroMsg.FaceUploadVideoService", "hy: start uploading %s", stringExtra);
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105928w("MicroMsg.FaceUploadVideoService", "hy: null file name");
            C0222b.m171j(this.f345989i, -2, "null file name");
            super.mo93615g(intent, i, i2);
            return 0;
        }
        Uri n = C116299g2.m163858n(stringExtra);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            Log.m105928w("MicroMsg.FaceUploadVideoService", "hy: file not exist");
            C0222b.m171j(this.f345989i, -3, "file not exist");
            super.mo93615g(intent, i, i2);
            return 0;
        } else if (longExtra != -1 || !Util.isNullOrNil(stringExtra2)) {
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_FaceUploadVideoService";
            C105231b bVar = r0;
            C98124g gVar2 = gVar;
            C105231b bVar2 = new C105231b(longExtra, stringExtra2, stringExtra, (C2274a) null);
            gVar2.f287662f = bVar;
            gVar2.field_mediaId = C85191v.m105068g(stringExtra);
            gVar2.field_fullpath = stringExtra;
            gVar2.field_thumbpath = "";
            gVar2.field_fileType = 5;
            gVar2.field_talker = "";
            gVar2.field_priority = 2;
            gVar2.field_needStorage = false;
            gVar2.field_isStreamMedia = false;
            gVar2.field_appType = 0;
            gVar2.field_bzScene = 0;
            gVar2.field_largesvideo = 0;
            if (!((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar2)) {
                Log.m105921e("MicroMsg.FaceUploadVideoService", "hy: video task info failed. clientid:%s", gVar2.field_mediaId);
                C0222b.m171j(this.f345989i, -5, "add task fail");
                C86013q1.m106447h(stringExtra);
                FaceDetectReporter.m162243d(longExtra, 1, 10086);
            }
            super.mo93615g(intent, i, i2);
            return 0;
        } else {
            Log.m105928w("MicroMsg.FaceUploadVideoService", "hy: bioId or app id null");
            C0222b.m171j(this.f345989i, -4, "bioId or app id null");
            C86013q1.m106447h(stringExtra);
            super.mo93615g(intent, i, i2);
            return 0;
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C45646t) {
            C45646t tVar = (C45646t) yVar;
            Log.m105925i("MicroMsg.FaceUploadVideoService", "hy: bind video errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C115669n.INSTANCE.idkeyStat(917, i2 == 0 ? 25 : 26, 1, false);
            C86709a0.m107524d().mo123470p(1197, this);
            C86013q1.m106447h(tVar.f123437f);
            stopSelf();
        }
    }
}
