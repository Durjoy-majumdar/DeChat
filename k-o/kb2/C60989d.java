package kb2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.json.JSONObject;
import qw1.C63341j;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.model.preview.MvPreviewAlbumVideoItemConvert$updateMedia$1", mo125469f = "MvPreviewAlbumVideoItemConvert.kt", mo125470l = {104}, mo125471m = "invokeSuspend")
/* renamed from: kb2.d */
public final class C60989d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f173698d;

    /* renamed from: e */
    public final /* synthetic */ GalleryItem$VideoMediaItem f173699e;

    /* renamed from: f */
    public final /* synthetic */ C32224a<C13598b0> f173700f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.model.preview.MvPreviewAlbumVideoItemConvert$updateMedia$1$1", mo125469f = "MvPreviewAlbumVideoItemConvert.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: kb2.d$a */
    public static final class C60990a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f173701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60990a(C32224a<C13598b0> aVar, C15601d<? super C60990a> dVar) {
            super(2, dVar);
            this.f173701d = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60990a(this.f173701d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60990a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f173701d.invoke();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60989d(GalleryItem$VideoMediaItem galleryItem$VideoMediaItem, C32224a<C13598b0> aVar, C15601d<? super C60989d> dVar) {
        super(2, dVar);
        this.f173699e = galleryItem$VideoMediaItem;
        this.f173700f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60989d(this.f173699e, this.f173700f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60989d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = ISightJNIService.class;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f173698d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.Mv.MvPreviewDataSource", "load width and height");
            String e = this.f173699e.mo80159e();
            if (e == null) {
                e = "";
            }
            String simpleMp4InfoVFS = ((ISightJNIService) C86312j.m106911c(cls)).getSimpleMp4InfoVFS(e);
            C87412m.m108593f(simpleMp4InfoVFS, "getService(ISightJNIServ…getSimpleMp4InfoVFS(path)");
            Log.m105925i("MicroMsg.Mv.MvPreviewDataSource", "get simple mp4 info %s", simpleMp4InfoVFS);
            JSONObject jSONObject = new JSONObject(simpleMp4InfoVFS);
            this.f173699e.f162766w = jSONObject.getInt("videoDuration");
            this.f173699e.f162767x = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            this.f173699e.f162768y = jSONObject.getInt(V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            this.f173699e.f162769z = jSONObject.getInt("videoBitrate");
            this.f173699e.f162762B = jSONObject.getInt("videoFPS");
            this.f173699e.f162763C = ((ISightJNIService) C86312j.m106911c(cls)).getMp4RotateVFS(e);
            GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = this.f173699e;
            galleryItem$VideoMediaItem.f162761A = 0;
            galleryItem$VideoMediaItem.f162764u = C63341j.m74673a(jSONObject.getString("videoType"));
            this.f173699e.f162765v = C63341j.m74673a(jSONObject.getString("audioType"));
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C60990a aVar2 = new C60990a(this.f173700f, (C15601d<? super C60990a>) null);
            this.f173698d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
