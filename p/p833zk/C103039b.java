package p833zk;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;
import v51.C102148e;

/* renamed from: zk.b */
public final class C103039b implements C103043e {

    /* renamed from: a */
    public C103044f f304017a;

    /* renamed from: b */
    public C32226l<? super Boolean, C13598b0> f304018b;

    /* renamed from: c */
    public long f304019c;

    /* renamed from: d */
    public int f304020d;

    /* renamed from: e */
    public int f304021e;

    /* renamed from: f */
    public final C103040a f304022f = new C103040a(this);

    /* renamed from: zk.b$a */
    public static final class C103040a implements CdnLogic.DownloadCallback {

        /* renamed from: d */
        public final /* synthetic */ C103039b f304023d;

        public C103040a(C103039b bVar) {
            this.f304023d = bVar;
        }

        public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
            C87412m.m108594g(str, "filekey");
            C87412m.m108594g(c2CDownloadResult, "result");
            this.f304023d.getClass();
            Log.m105924i("MicroMsg.EmojiCdnHttpsFetcher", "onC2CDownloadCompleted: " + str + ", " + c2CDownloadResult.errorCode);
            if (c2CDownloadResult.errorCode != 0) {
                C32226l<? super Boolean, C13598b0> lVar = this.f304023d.f304018b;
                if (lVar != null) {
                    lVar.invoke(Boolean.FALSE);
                }
                this.f304023d.mo142748b(false);
                return;
            }
            C32226l<? super Boolean, C13598b0> lVar2 = this.f304023d.f304018b;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.TRUE);
            }
            this.f304023d.mo142748b(true);
        }

        public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
            C87412m.m108594g(str, "filekey");
        }
    }

    /* renamed from: a */
    public void mo142747a(C103044f fVar, C32226l<? super Boolean, C13598b0> lVar) {
        C87412m.m108594g(fVar, "fetcherConfig");
        this.f304017a = fVar;
        this.f304018b = lVar;
        C86009m1 l = new C86009m1(fVar.f304027c).mo119974l();
        if (l != null) {
            l.mo119987x();
        }
        this.f304020d = fVar.f304029e == 2 ? CdnLogic.kMediaTypeEmojiWXAM : CdnLogic.kMediaTypeEmojiNormal;
        this.f304019c = Util.nowMilliSecond();
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.queueTimeoutSeconds = 60;
        c2CDownloadRequest.transforTimeoutSeconds = 60;
        c2CDownloadRequest.taskStartTime = this.f304019c;
        c2CDownloadRequest.fileType = this.f304020d;
        c2CDownloadRequest.fileKey = "downemoji_" + fVar.f304025a.getMd5();
        c2CDownloadRequest.url = fVar.f304026b;
        c2CDownloadRequest.setSavePath(fVar.f304027c);
        this.f304021e = CdnLogic.startHttpsDownload(c2CDownloadRequest, this.f304022f);
        Log.m105924i("MicroMsg.EmojiCdnHttpsFetcher", "fetch: start " + fVar.f304025a.getMd5() + ' ' + this.f304021e);
        C102148e.m134580a(20, 1);
        C103044f fVar2 = this.f304017a;
        if (fVar2 != null) {
            int i = fVar2.f304029e;
            if (i == 0) {
                C102148e.m134580a(1, 1);
            } else if (i == 1) {
                C102148e.m134580a(6, 1);
            } else if (i == 2) {
                C102148e.m134580a(10, 1);
            }
        }
        if (this.f304021e != 0) {
            C32226l<? super Boolean, C13598b0> lVar2 = this.f304018b;
            if (lVar2 != null) {
                lVar2.invoke(Boolean.FALSE);
            }
            mo142748b(false);
        }
    }

    /* renamed from: b */
    public final void mo142748b(boolean z) {
        C103044f fVar = this.f304017a;
        if (fVar == null) {
            return;
        }
        if (z) {
            C102148e.m134580a(21, 1);
            C102148e.m134580a(2, 1);
            return;
        }
        C102148e.m134580a(22, 1);
        C102148e.m134580a(3, 1);
        int i = fVar.f304029e;
        if (i == 0) {
            String md5 = fVar.f304025a.getMd5();
            EmojiInfo emojiInfo = fVar.f304025a;
            C102148e.m134581b(md5, 4, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
        } else if (i == 1) {
            String md52 = fVar.f304025a.getMd5();
            EmojiInfo emojiInfo2 = fVar.f304025a;
            C102148e.m134581b(md52, 2, 1, 1, emojiInfo2.field_groupId, 1, emojiInfo2.field_designerID);
        } else if (i == 2) {
            String md53 = fVar.f304025a.getMd5();
            EmojiInfo emojiInfo3 = fVar.f304025a;
            C102148e.m134581b(md53, 4, 1, 1, emojiInfo3.field_groupId, 1, emojiInfo3.field_designerID);
        }
    }
}
