package sh3;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sticker.loader.StickerLoadInfo;
import gy3.C87412m;
import kotlin.Metadata;

/* renamed from: sh3.i */
public final class C101627i extends C101630j {

    /* renamed from: h */
    public final String f297493h = "MicroMsg.StickerProcessTask";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lsh3/i$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-sticker_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: sh3.i$a */
    public static final class C101628a implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "data");
            Log.m105924i("MicroMsg.IPCStickerTask", "invoke: ");
            StickerLoadInfo stickerLoadInfo = (StickerLoadInfo) bundle.getParcelable("load_info");
            Bundle bundle2 = new Bundle();
            if (stickerLoadInfo != null) {
                C101624e eVar = C101624e.f297484a;
                C13680h hVar = new C13680h(bundle2, gVar);
                Log.m105924i("MicroMsg.StickerFileManager", "loadFromRemote: " + stickerLoadInfo.mo135558a());
                C101630j lVar = stickerLoadInfo.f284100d == 1 ? new C101632l(stickerLoadInfo) : new C101622d(stickerLoadInfo);
                if (!lVar.f297496g.contains(hVar)) {
                    lVar.f297496g.add(hVar);
                }
                C101624e.f297491h.put(stickerLoadInfo.mo135558a(), lVar);
                C101624e.f297490g.mo89348b(lVar);
                return;
            }
            bundle2.putBoolean("task_result", false);
            if (gVar != null) {
                gVar.mo894a(bundle2);
            }
        }
    }

    /* renamed from: sh3.i$b */
    public static final class C101629b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C101627i f297494d;

        public C101629b(C101627i iVar) {
            this.f297494d = iVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Log.m105924i(this.f297494d.f297493h, "result: ");
            this.f297494d.mo141083e(((Bundle) obj).getBoolean("task_result"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101627i(StickerLoadInfo stickerLoadInfo) {
        super(stickerLoadInfo);
        C87412m.m108594g(stickerLoadInfo, "info");
    }

    /* renamed from: a */
    public void mo11852a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("load_info", this.f297495f);
        C80907o.m98781d(MMApplicationContext.getPackageName(), bundle, C101628a.class, new C101629b(this));
    }

    /* renamed from: d */
    public String mo11854d() {
        return this.f297495f.mo135558a();
    }

    /* renamed from: e */
    public void mo141083e(boolean z) {
        String str = this.f297493h;
        Log.m105924i(str, "onResult: " + mo11854d() + ' ' + z);
        super.mo141083e(z);
    }
}
