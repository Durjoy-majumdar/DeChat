package yu2;

import a14.C53930o0;
import bv2.C92314d;
import bv2.C92320h;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C32925e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101804kv2;
import vr2.C102268v;

/* renamed from: yu2.a */
public final class C102914a {

    /* renamed from: a */
    public final C102915a f303766a;

    /* renamed from: b */
    public boolean f303767b = true;

    /* renamed from: c */
    public final C13601g f303768c = C36568h.m40985a(C102918d.f303777d);

    /* renamed from: d */
    public final C13601g f303769d = C36568h.m40985a(C102917c.f303776d);

    /* renamed from: e */
    public Map<String, String> f303770e;

    /* renamed from: f */
    public C94853e f303771f;

    /* renamed from: g */
    public CdnVideoResourceDownloader f303772g;

    /* renamed from: h */
    public C92320h f303773h;

    /* renamed from: i */
    public final C94853e.C94861h f303774i = new C102916b(this);

    /* renamed from: yu2.a$a */
    public interface C102915a {
        /* renamed from: a */
        void mo133700a(ArrayList<String> arrayList, boolean z);
    }

    /* renamed from: yu2.a$b */
    public static final class C102916b implements C94853e.C94861h {

        /* renamed from: d */
        public final /* synthetic */ C102914a f303775d;

        public C102916b(C102914a aVar) {
            this.f303775d = aVar;
        }

        public void onImageFinish(String str, boolean z) {
            String str2;
            SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
            C87412m.m108594g(str, "mediaId");
            C102914a aVar = this.f303775d;
            SnsMethodCalculate.markStartTimeMs("access$getMediaIdPathMap$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            Map<String, String> map = aVar.f303770e;
            SnsMethodCalculate.markEndTimeMs("access$getMediaIdPathMap$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            if (map == null || (str2 = (String) ((LinkedHashMap) map).get(str)) == null) {
                str2 = "";
            }
            if (!z || C87412m.m108589b(str2, "")) {
                C102914a.m136062c(this.f303775d, (String) null, 1, (Object) null);
            } else {
                C102914a aVar2 = this.f303775d;
                SnsMethodCalculate.markStartTimeMs("access$doSnsFileSaveTask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
                aVar2.mo142634b(str2);
                SnsMethodCalculate.markEndTimeMs("access$doSnsFileSaveTask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            }
            SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        }

        public void onSetbg() {
            SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
            SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        }

        public void onSightFinish(String str, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
            C87412m.m108594g(str, "mediaId");
            SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        }

        public void onThumbFinish(String str) {
            SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
            C87412m.m108594g(str, "mediaId");
            Log.m105918d("MicroMsg.SnsAlbumPickerDownloadHelper", "IOnDownloadListener onThumbFinish mediaId = " + str + " } ");
            SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$downLoadFinishCallback$1");
        }
    }

    /* renamed from: yu2.a$c */
    public static final class C102917c extends C87413o implements C32224a<ArrayList<String>> {

        /* renamed from: d */
        public static final C102917c f303776d = new C102917c();

        public C102917c() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$filePathList$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$filePathList$2");
            ArrayList arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$filePathList$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$filePathList$2");
            return arrayList;
        }
    }

    /* renamed from: yu2.a$d */
    public static final class C102918d extends C87413o implements C32224a<List<C102944e0>> {

        /* renamed from: d */
        public static final C102918d f303777d = new C102918d();

        public C102918d() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$taskQueue$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$taskQueue$2");
            ArrayList arrayList = new ArrayList();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$taskQueue$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper$taskQueue$2");
            return arrayList;
        }
    }

    public C102914a(C102915a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f303766a = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ void m136062c(C102914a aVar, String str, int i, Object obj) {
        SnsMethodCalculate.markStartTimeMs("doSnsFileSaveTask$default", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        if ((i & 1) != 0) {
            str = "";
        }
        aVar.mo142634b(str);
        SnsMethodCalculate.markEndTimeMs("doSnsFileSaveTask$default", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    /* renamed from: a */
    public final void mo142633a(String str, C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("checkSnsCdnVideoLocalFile", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        C87412m.m108594g(str, "cdnSnsVideoLocalPath");
        C87412m.m108594g(kv22, "mediaObj");
        SnsMethodCalculate.markStartTimeMs("getVideoTempPathWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        String a = C94938q1.m120514a(kv22, ".mp4");
        SnsMethodCalculate.markStartTimeMs("getTmpVideoSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        String str2 = C32925e.f89499a.mo58862b("snsalbumpicker") + a;
        SnsMethodCalculate.markEndTimeMs("getTmpVideoSavePath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
        C87412m.m108593f(str2, "getTmpVideoSavePath(BIZ_NAME, newFileName)");
        SnsMethodCalculate.markEndTimeMs("getVideoTempPathWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        boolean k = C86013q1.m106450k(str2);
        boolean z = k && C87412m.m108589b(C86013q1.m106456q(str), C86013q1.m106456q(str2));
        if (!z) {
            SnsMethodCalculate.markStartTimeMs("copyVideoFileToTempDirWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            long d = C86013q1.m106443d(str, str2, false);
            Map<String, String> map = this.f303770e;
            if (map != null) {
                String str3 = kv22.f298689d;
                C87412m.m108593f(str3, "mediaObj.Id");
                String put = map.put(str3, str2);
            }
            Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "copyVideoFileToTempDirWithExtName result:" + d + ", from " + str + " copy to " + str2);
            SnsMethodCalculate.markEndTimeMs("copyVideoFileToTempDirWithExtName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        }
        Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "checkSnsCdnVideoLocalFile, tempMp4FileExist:" + k + ", tempFileExistWithMd5Check:" + z + ", path:" + str2);
        mo142634b(str2);
        SnsMethodCalculate.markEndTimeMs("checkSnsCdnVideoLocalFile", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    /* renamed from: b */
    public final void mo142634b(String str) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("doSnsFileSaveTask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        if (!C87412m.m108589b(str, "") && !mo142635d().contains(str)) {
            mo142635d().add(str);
        }
        Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "doSnsFileSaveTask taskQueue remain size:" + mo142636e().size() + ", fileStoragePath:" + str);
        if (mo142636e().size() > 0) {
            boolean z = false;
            C102944e0 remove = mo142636e().remove(0);
            SnsInfo a = remove.mo142658a();
            C101804kv2 b = remove.mo142659b();
            SnsMethodCalculate.markStartTimeMs("downloadSnsMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            if (a.getTimeLine() == null) {
                SnsMethodCalculate.markEndTimeMs("downloadSnsMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            } else {
                Map<String, String> map = this.f303770e;
                if (map == null || (str2 = map.get(b.f298689d)) == null) {
                    str2 = "";
                }
                if (b.f298690e == 6) {
                    this.f303767b = false;
                    if (C87412m.m108589b(str2, "") || !C86013q1.m106450k(str2)) {
                        String localid = a.getLocalid();
                        C87412m.m108593f(localid, "snsInfo.getLocalid()");
                        int createTime = a.getCreateTime();
                        SnsMethodCalculate.markStartTimeMs("downLoadSnsVideoByCdn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
                        String b2 = C94938q1.m120515b(localid, b);
                        CdnVideoResourceDownloader cdnVideoResourceDownloader = new CdnVideoResourceDownloader(new C92314d(b, createTime, localid));
                        this.f303772g = cdnVideoResourceDownloader;
                        this.f303773h = new C92320h(cdnVideoResourceDownloader, new C102920b(b2, this, b, localid));
                        Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "downLoadSnsVideoByCdn start localId: " + localid);
                        CdnVideoResourceDownloader cdnVideoResourceDownloader2 = this.f303772g;
                        if (cdnVideoResourceDownloader2 != null) {
                            cdnVideoResourceDownloader2.start();
                        }
                        C92320h hVar = this.f303773h;
                        if (hVar != null) {
                            hVar.mo126321b();
                        }
                        SnsMethodCalculate.markEndTimeMs("downLoadSnsVideoByCdn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
                    } else {
                        mo142633a(str2, b);
                    }
                } else if (C87412m.m108589b(str2, "") || !C86013q1.m106450k(str2)) {
                    String snsId = a.getSnsId();
                    C87412m.m108593f(snsId, "snsInfo.snsId");
                    SnsMethodCalculate.markStartTimeMs("downloadSnsImageByCdn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
                    C96983o3 o3Var = C96983o3.f284139k;
                    C94853e eVar = this.f303771f;
                    if (eVar != null && true == eVar.mo130980e(b, 10, (C102268v) null, o3Var, snsId)) {
                        z = true;
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "addDownLoadSns = true Image media.id:" + b.f298689d + "  mediaObj.Type = " + b.f298690e + " url: " + b.f298692g);
                    } else {
                        Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "addDownLoadSns = false Image media.id:" + b.f298689d + "  media.Type = " + b.f298690e + " url: " + b.f298692g);
                    }
                    SnsMethodCalculate.markEndTimeMs("downloadSnsImageByCdn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
                } else {
                    mo142634b(str2);
                }
                SnsMethodCalculate.markEndTimeMs("downloadSnsMedia", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            }
        } else {
            SnsMethodCalculate.markStartTimeMs("finishAllSnsMediaDownLoad", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
            Log.m105924i("MicroMsg.SnsAlbumPickerDownloadHelper", "finishAllSnsMediaDownLoad filePathList size:" + mo142635d().size() + ", callback:" + this.f303766a + ']');
            mo142637f();
            C102915a aVar = this.f303766a;
            if (aVar != null) {
                aVar.mo133700a(mo142635d(), this.f303767b);
            }
            SnsMethodCalculate.markEndTimeMs("finishAllSnsMediaDownLoad", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        }
        SnsMethodCalculate.markEndTimeMs("doSnsFileSaveTask", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }

    /* renamed from: d */
    public final ArrayList<String> mo142635d() {
        SnsMethodCalculate.markStartTimeMs("getFilePathList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        ArrayList<String> arrayList = (ArrayList) ((C36570n) this.f303769d).getValue();
        SnsMethodCalculate.markEndTimeMs("getFilePathList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        return arrayList;
    }

    /* renamed from: e */
    public final List<C102944e0> mo142636e() {
        SnsMethodCalculate.markStartTimeMs("getTaskQueue", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        List<C102944e0> list = (List) ((C36570n) this.f303768c).getValue();
        SnsMethodCalculate.markEndTimeMs("getTaskQueue", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        return list;
    }

    /* renamed from: f */
    public final void mo142637f() {
        SnsMethodCalculate.markStartTimeMs("removeDownLoadManagerState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
        C94853e eVar = this.f303771f;
        if (eVar != null) {
            eVar.mo130997v(this.f303774i);
        }
        C94853e eVar2 = this.f303771f;
        if (eVar2 != null) {
            eVar2.mo130990o();
        }
        C94853e eVar3 = this.f303771f;
        if (eVar3 != null) {
            eVar3.mo130989n();
        }
        CdnVideoResourceDownloader cdnVideoResourceDownloader = this.f303772g;
        if (cdnVideoResourceDownloader != null) {
            cdnVideoResourceDownloader.stop();
        }
        this.f303772g = null;
        C92320h hVar = this.f303773h;
        if (hVar != null) {
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
            Log.m105924i("MicroMsg.VideoResourceDownloaderDelegate", "release");
            C53930o0.m60558e(hVar.f264175c, (CancellationException) null, 1, (Object) null);
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.video.VideoResourceDownloaderDelegate");
        }
        SnsMethodCalculate.markEndTimeMs("removeDownLoadManagerState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerDownloadHelper");
    }
}
