package sc1;

import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicVideoObject;
import com.tencent.p014mm.plugin.favorite.p883ui.FavOpenApiEntry;
import com.tencent.p014mm.pluginsdk.model.app.ReportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import rn3.C90049b0;

/* renamed from: sc1.b */
public class C90170b implements C90049b0 {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f258887a;

    /* renamed from: b */
    public final /* synthetic */ WXMusicVideoObject f258888b;

    /* renamed from: c */
    public final /* synthetic */ FavOpenApiEntry f258889c;

    public C90170b(FavOpenApiEntry favOpenApiEntry, WXMediaMessage wXMediaMessage, WXMusicVideoObject wXMusicVideoObject) {
        this.f258889c = favOpenApiEntry;
        this.f258887a = wXMediaMessage;
        this.f258888b = wXMusicVideoObject;
    }

    /* renamed from: a */
    public void mo119879a(String str, boolean z) {
        if (z) {
            WXMediaMessage wXMediaMessage = this.f258887a;
            wXMediaMessage.mediaObject = this.f258888b;
            FavOpenApiEntry favOpenApiEntry = this.f258889c;
            int i = FavOpenApiEntry.f248191o;
            favOpenApiEntry.mo118222H7(wXMediaMessage, str);
            return;
        }
        Log.m105920e("MicroMsg.FavOpenApiEntry", "thumb img CDN upload fail!");
        ReportUtil.m84997c(this.f258889c, ReportUtil.m84995a(this.f258889c.getIntent().getExtras(), -1), true, false);
        this.f258889c.finish();
    }
}
