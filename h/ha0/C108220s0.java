package ha0;

import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJMovieOutroInfo;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.MJRecommendOptions;
import com.tencent.maas.instamovie.base.asset.MJAssetIdentifierType;
import com.tencent.maas.instamovie.base.asset.MJAssetInfo;
import com.tencent.maas.instamovie.base.asset.MJAssetMediaType;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C36570n;
import sx3.C36907w;

/* renamed from: ha0.s0 */
public final class C108220s0 extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

    /* renamed from: d */
    public final /* synthetic */ List<GalleryItem$MediaItem> f324030d;

    /* renamed from: e */
    public final /* synthetic */ C108183c0 f324031e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108220s0(List<? extends GalleryItem$MediaItem> list, C108183c0 c0Var) {
        super(2);
        this.f324030d = list;
        this.f324031e = c0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
        MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
        C87412m.m108594g(onTaskProgress, "onProgress");
        C87412m.m108594g(onComplete, "onComplete");
        List<GalleryItem$MediaItem> list = this.f324030d;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (GalleryItem$MediaItem galleryItem$MediaItem : list) {
            arrayList.add(new MJAssetInfo(MJAssetIdentifierType.Filepath, galleryItem$MediaItem.f162747d, galleryItem$MediaItem.getType() == 1 ? MJAssetMediaType.Image : MJAssetMediaType.Video));
        }
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "startMovieCreationAutoRecommendTemplate");
        C108183c0 c0Var = this.f324031e;
        MJAsyncTaskInfo startMovieCreationAutoRecommendTemplate = c0Var.f323934a.startMovieCreationAutoRecommendTemplate(arrayList, c0Var.f323936c, new MJRecommendOptions(MJRecommendOptions.Mode.Foreground, c0Var.f323935b.f174314a), (MJMovieOutroInfo) ((C36570n) this.f324031e.f323937d).getValue(), onTaskProgress, onComplete);
        C87412m.m108593f(startMovieCreationAutoRecommendTemplate, "movieSession.startMovieC…omplete\n                )");
        return startMovieCreationAutoRecommendTemplate;
    }
}
