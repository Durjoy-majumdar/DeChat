package ja0;

import a14.C0000n0;
import a14.C53973z1;
import android.graphics.BitmapFactory;
import com.tencent.p014mm.autogen.mmdata.rpt.MaaSCreationReportStruct;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p232rw.C63679m;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.mj_template.maas.report.MaasReport24946$markInputMediaInfo$1", mo125469f = "MaasReport24946.kt", mo125470l = {40}, mo125471m = "invokeSuspend")
/* renamed from: ja0.d */
public final class C60783d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f173123d;

    /* renamed from: e */
    public final /* synthetic */ C53973z1 f173124e;

    /* renamed from: f */
    public final /* synthetic */ List<GalleryItem$MediaItem> f173125f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60783d(C53973z1 z1Var, List<? extends GalleryItem$MediaItem> list, C15601d<? super C60783d> dVar) {
        super(2, dVar);
        this.f173124e = z1Var;
        this.f173125f = list;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60783d(this.f173124e, this.f173125f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60783d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f173123d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C53973z1 z1Var = this.f173124e;
            if (z1Var != null) {
                this.f173123d = 1;
                if (z1Var.mo74521O(this) == aVar) {
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MaaSCreationReportStruct maaSCreationReportStruct = C60784e.f173128c;
        C60784e eVar = C60784e.f173126a;
        List<GalleryItem$MediaItem> list = this.f173125f;
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            GalleryItem$MediaItem galleryItem$MediaItem = (GalleryItem$MediaItem) it.next();
            if (galleryItem$MediaItem instanceof GalleryItem$VideoMediaItem) {
                GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = (GalleryItem$VideoMediaItem) galleryItem$MediaItem;
                jSONObject = new JSONObject();
                MultiMediaVideoChecker multiMediaVideoChecker = MultiMediaVideoChecker.f273077a;
                String str = galleryItem$VideoMediaItem.f162747d;
                C87412m.m108593f(str, "originalPath");
                C63679m.C63680a b = multiMediaVideoChecker.mo129930b(str);
                if (b != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(b.f180525a);
                    jSONArray2.put(b.f180526b);
                    C13598b0 b0Var = C13598b0.f38549a;
                    jSONObject.put("s", jSONArray2);
                    jSONObject.put("d", b.f180528d);
                    jSONObject.put("f", Float.valueOf(b.f180527c));
                    jSONObject.put("vb", b.f180529e);
                    jSONObject.put("ab", b.f180532h);
                    jSONObject.put("as", b.f180534j);
                    jSONObject.put("acc", b.f180533i);
                    if (jSONObject.put("t", b.f180531g ? "265" : "264") != null) {
                    }
                }
                JSONArray jSONArray3 = new JSONArray();
                jSONArray3.put(galleryItem$VideoMediaItem.f162768y);
                jSONArray3.put(galleryItem$VideoMediaItem.f162767x);
                C13598b0 b0Var2 = C13598b0.f38549a;
                jSONObject.put("s", jSONArray3);
                jSONObject.put("d", galleryItem$VideoMediaItem.f162766w);
                jSONObject.put("f", galleryItem$VideoMediaItem.f162762B);
                jSONObject.put("vb", galleryItem$VideoMediaItem.f162769z);
            } else if (galleryItem$MediaItem instanceof GalleryItem$ImageMediaItem) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray4 = new JSONArray();
                BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(((GalleryItem$ImageMediaItem) galleryItem$MediaItem).f162747d);
                jSONArray4.put(imageOptions != null ? imageOptions.outWidth : 0);
                if (imageOptions != null) {
                    i2 = imageOptions.outHeight;
                }
                jSONArray4.put(i2);
                C13598b0 b0Var3 = C13598b0.f38549a;
                jSONObject2.put("s", jSONArray4);
                jSONObject = jSONObject2;
            } else {
                jSONObject = new JSONObject();
            }
            jSONArray.put(jSONObject);
        }
        String jSONObject3 = new JSONObject().put("d", jSONArray).toString();
        C87412m.m108593f(jSONObject3, "JSONObject().put(\"d\", jsonArray).toString()");
        maaSCreationReportStruct.f156479f = maaSCreationReportStruct.mo86045b("importMediaInfo", C112551y.m153814n(jSONObject3, ",", ";", false), true);
        MaaSCreationReportStruct maaSCreationReportStruct2 = C60784e.f173128c;
        List<GalleryItem$MediaItem> list2 = this.f173125f;
        ArrayList arrayList = new ArrayList();
        for (T next : list2) {
            if (next instanceof GalleryItem$ImageMediaItem) {
                arrayList.add(next);
            }
        }
        maaSCreationReportStruct2.f156481h = arrayList.size();
        MaaSCreationReportStruct maaSCreationReportStruct3 = C60784e.f173128c;
        List<GalleryItem$MediaItem> list3 = this.f173125f;
        ArrayList arrayList2 = new ArrayList();
        for (T next2 : list3) {
            if (next2 instanceof GalleryItem$VideoMediaItem) {
                arrayList2.add(next2);
            }
        }
        maaSCreationReportStruct3.f156480g = arrayList2.size();
        Log.m105924i("MaasReport24946", "markInputMediaInfo: " + C60784e.f173128c.f156479f);
        return C13598b0.f38549a;
    }
}
