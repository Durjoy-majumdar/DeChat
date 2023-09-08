package vl2;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.plugin.scanner.C115670k;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import fy3.C32227p;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: vl2.t */
public final class C118679t {

    /* renamed from: a */
    public static final C118679t f355131a = new C118679t();

    /* renamed from: b */
    public static C98124g.C98125a f355132b = new C118680a();

    /* renamed from: c */
    public static final Map<String, C118681b> f355133c = new HashMap();

    /* renamed from: vl2.t$a */
    public static final class C118680a implements C98124g.C98125a {
        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C87412m.m108594g(str, "mediaId");
            Log.m105925i("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", str, Integer.valueOf(i), cVar, dVar);
            C118682c cVar2 = new C118682c();
            if (i != 0) {
                Log.m105921e("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn start failed : %d, media id is :%s", Integer.valueOf(i), str);
                cVar2.f355134a = i;
                C118679t tVar = C118679t.f355131a;
                HashMap hashMap = (HashMap) C118679t.f355133c;
                if (hashMap.containsKey(str)) {
                    Object remove = hashMap.remove(str);
                    C87412m.m108591d(remove);
                    ((C118681b) remove).mo175984a(str, cVar2);
                }
                return 0;
            }
            if (dVar != null) {
                int i2 = dVar.field_retCode;
                cVar2.f355134a = i2;
                if (i2 != 0) {
                    Log.m105921e("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", str, Integer.valueOf(i2), dVar);
                } else {
                    Log.m105925i("MicroMsg.ScanTranslationCdnService", "scanTranslateUploadCdn cdn trans suceess, media id : %s", str);
                    cVar2.f355135b = dVar.field_fileId;
                    cVar2.f355136c = dVar.field_aesKey;
                }
                C118679t tVar2 = C118679t.f355131a;
                HashMap hashMap2 = (HashMap) C118679t.f355133c;
                if (hashMap2.containsKey(str)) {
                    Object remove2 = hashMap2.remove(str);
                    C87412m.m108591d(remove2);
                    ((C118681b) remove2).mo175984a(str, cVar2);
                }
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(byteArrayOutputStream, "buff");
            Log.m105925i("MicroMsg.ScanTranslationCdnService", "getCdnAuthInfo, mediaId = %s", str);
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(bArr, "inbuf");
            Log.m105925i("MicroMsg.ScanTranslationCdnService", "decodePrepareResponse, mediaId = %s", str);
            return null;
        }
    }

    /* renamed from: vl2.t$b */
    public interface C118681b {
        /* renamed from: a */
        void mo175984a(String str, C118682c cVar);
    }

    /* renamed from: vl2.t$c */
    public static final class C118682c {

        /* renamed from: a */
        public int f355134a;

        /* renamed from: b */
        public String f355135b;

        /* renamed from: c */
        public String f355136c;
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.scanner.util.ScanTranslateCdnService$addUploadTask$1", mo125469f = "ScanTranslateCdnService.kt", mo125470l = {108}, mo125471m = "invokeSuspend")
    /* renamed from: vl2.t$d */
    public static final class C118683d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f355137d;

        /* renamed from: e */
        public final /* synthetic */ String f355138e;

        /* renamed from: f */
        public final /* synthetic */ String f355139f;

        /* renamed from: g */
        public final /* synthetic */ String f355140g;

        /* renamed from: h */
        public final /* synthetic */ int f355141h;

        /* renamed from: i */
        public final /* synthetic */ C118681b f355142i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C118683d(String str, String str2, String str3, int i, C118681b bVar, C15601d<? super C118683d> dVar) {
            super(2, dVar);
            this.f355138e = str;
            this.f355139f = str2;
            this.f355140g = str3;
            this.f355141h = i;
            this.f355142i = bVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C118683d(this.f355138e, this.f355139f, this.f355140g, this.f355141h, this.f355142i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C118683d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f355137d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C86009m1 l = new C86009m1(this.f355138e).mo119974l();
                if (!(l != null && l.mo119967g()) && l != null) {
                    l.mo119987x();
                }
                String str = this.f355139f;
                String str2 = this.f355138e;
                C87412m.m108593f(str2, "uploadPath");
                this.f355137d = 1;
                C66218h hVar = new C66218h(C66447b.m78392b(this));
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                Bitmap decodeFile = BitmapUtil.decodeFile(str, options);
                if (decodeFile == null) {
                    Log.m105920e("MicroMsg.ScanImageUtils", "alvinluo convertHevcToJpeg bitmap null");
                    Result.Companion companion = Result.Companion;
                    hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                } else {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                        C86013q1.m106437S(str2, byteArrayOutputStream.toByteArray());
                        Result.Companion companion2 = Result.Companion;
                        hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.ScanImageUtils", e, "alvinluo convertHevcToJpeg exception", new Object[0]);
                        Result.Companion companion3 = Result.Companion;
                        hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    }
                }
                obj = hVar.mo90314b();
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Log.m105925i("MicroMsg.ScanTranslationCdnService", "alvinluo addUploadTask convertHevcToJpeg success: %s, exist: %s, uploadPath: %s", Boolean.valueOf(booleanValue), Boolean.valueOf(C86013q1.m106450k(this.f355138e)), this.f355138e);
            if (booleanValue) {
                C118679t.f355131a.mo183402b(this.f355140g, this.f355138e, this.f355141h, this.f355142i);
            } else {
                C118682c cVar = new C118682c();
                cVar.f355134a = 1;
                this.f355142i.mo175984a(this.f355140g, cVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m167367a(String str, String str2, int i, C118681b bVar) {
        C87412m.m108594g(bVar, "uploadCallback");
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapUtil.decodeFile(str2, options);
        Log.m105919d("MicroMsg.ScanImageUtils", "alvinluo getImageMimeType %s", options.outMimeType);
        String str3 = options.outMimeType;
        if ((str3 == null || str3.length() == 0) || (!C112551y.m153808h(str3, "hevc", false, 2, (Object) null) && !C112551y.m153808h(str3, "wxpc", false, 2, (Object) null) && !C112551y.m153808h(str3, "wxam", false, 2, (Object) null))) {
            z = false;
        }
        if (z) {
            String PT = ((C115670k) C86312j.m106911c(C115670k.class)).mo57346PT(MD5Util.getMD5String(str2 + C86013q1.m106452m(str2)), "jpg");
            if (C86013q1.m106450k(PT)) {
                Log.m105924i("MicroMsg.ScanTranslationCdnService", "alvinluo addUploadTask hevc image exist");
                f355131a.mo183402b(str, PT, i, bVar);
                return;
            }
            C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C118683d(PT, str2, str, i, bVar, (C15601d<? super C118683d>) null), 3, (Object) null);
            return;
        }
        f355131a.mo183402b(str, str2, i, bVar);
    }

    /* renamed from: c */
    public static final String m167368c(String str) {
        return C75592q0.m90789s() + '_' + str + '_' + System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo183402b(String str, String str2, int i, C118681b bVar) {
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_ScannerCdnService";
        gVar.f287662f = f355132b;
        gVar.field_mediaId = str;
        gVar.field_fullpath = str2;
        gVar.field_fileType = i;
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_needCompressImage = true;
        gVar.field_isStreamMedia = false;
        gVar.field_force_aeskeycdn = true;
        gVar.field_trysafecdn = false;
        ((HashMap) f355133c).put(str, bVar);
        ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
    }
}
