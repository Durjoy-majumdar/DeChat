package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import c00.C0405n;
import c00.C0406o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import java.util.Map;
import ke3.C88144b;
import u73.C14136q0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.e4 */
public class C2097e4 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizTimeLineUI f12061d;

    public C2097e4(BizTimeLineUI bizTimeLineUI) {
        this.f12061d = bizTimeLineUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Class cls = C0406o.class;
        Class cls2 = C0405n.class;
        if (C43471q.m46984h(0)) {
            boolean yv02 = ((C0406o) C86312j.m106911c(cls)).yv0(11, 2);
            Intent O20 = ((C0405n) C86312j.m106911c(cls2)).O20();
            O20.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f12061d.getString(C0966R.string.f3r));
            O20.putExtra("searchbar_tips", this.f12061d.getString(C0966R.string.f3r));
            O20.putExtra("KRightBtn", true);
            O20.putExtra("ftsneedkeyboard", !yv02);
            O20.putExtra("publishIdPrefix", "bs");
            O20.putExtra("ftsType", 2);
            O20.putExtra("ftsbizscene", 11);
            Map<String, String> hn = ((C0405n) C86312j.m106911c(cls2)).mo280hn(11, true, 2);
            String lh02 = ((C0405n) C86312j.m106911c(cls2)).lh0(Util.safeParseInt(hn.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
            hn.put("sessionId", lh02);
            O20.putExtra("sessionId", lh02);
            O20.putExtra("rawUrl", ((C0405n) C86312j.m106911c(cls2)).mo277Vw(hn));
            O20.putExtra("key_load_js_without_delay", true);
            O20.putExtra("key_preload_biz", 4);
            O20.addFlags(67108864);
            O20.putExtra("KOpenArticleSceneFromScene", 90);
            String Fb = ((C0406o) C86312j.m106911c(cls)).mo447Fb("bizAccountTopSearch");
            if (!TextUtils.isEmpty(Fb)) {
                O20.putExtra("key_search_input_hint", Fb);
            }
            C88144b.m109806x(MMApplicationContext.getContext(), O20, (Bundle) null);
            C14136q0.m13469a(11, lh02, lh02, false, "", 2, "", false, "");
        } else {
            Log.m105920e("MicroMsg.BizTimeLineUI", "fts h5 template not avail");
        }
        return true;
    }
}
