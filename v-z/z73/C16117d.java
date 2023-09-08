package z73;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.Map;
import ke3.C88144b;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: z73.d */
public final class C16117d extends C15053a {

    /* renamed from: d */
    public static final C16117d f43301d = new C16117d();

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        String str;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var2, "msg");
        Log.m105924i("MicroMsg.WebSearch.OpenEmotionPageJSApi", "handleMsg params:" + h1Var2.f38983a);
        Map<String, Object> map = h1Var2.f38983a;
        int e = C43471q.m46981e(map, "type", 0);
        int e2 = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        String f = C43471q.m46982f(map, "searchId");
        String f2 = C43471q.m46982f(map, "activityId");
        int e3 = C43471q.m46981e(map, "isGenSticker", 0);
        int e4 = C43471q.m46981e(map, "fromSearchType", 0);
        Intent intent = new Intent();
        intent.putExtra("extra_scence", e2);
        intent.putExtra("extra_type", e);
        intent.putExtra("searchID", f);
        intent.putExtra("docID", C43471q.m46982f(map, "docID"));
        intent.putExtra("activityId", f2);
        intent.putExtra("search_type", e4);
        intent.putExtra("extra_gen_sticker", e3);
        if (e != 1) {
            String str2 = ".ui.fts.FTSEmojiDetailPageUI";
            String str3 = "productID";
            String str4 = "extra_md5";
            String str5 = "biz_user_name";
            String str6 = "bizUin";
            if (e == 2) {
                intent.putExtra("extra_emoji_name", C43471q.m46982f(map, "express"));
                intent.putExtra(str4, C43471q.m46982f(map, "md5"));
                intent.putExtra("extra_aeskey", C43471q.m46982f(map, "aesKey"));
                intent.putExtra("extra_encrypt_url", C43471q.m46982f(map, "encryptUrl"));
                intent.putExtra("extra_thumb_url", C43471q.m46982f(map, "thumb"));
                intent.putExtra("id", C43471q.m46982f(map, "designerId"));
                intent.putExtra("extra_product_id", C43471q.m46982f(map, str3));
                intent.putExtra("productUrl", C43471q.m46982f(map, "productUrl"));
                intent.putExtra("extra_product_name", C43471q.m46982f(map, "productName"));
                intent.putExtra("weapp_user_name", C43471q.m46982f(map, "weappUserName"));
                intent.putExtra(str5, C43471q.m46982f(map, str6));
                intent.putExtra("weapp_version", C43471q.m46981e(map, "weappVersion", 0));
                intent.putExtra("source_type", C43471q.m46981e(map, "sourceType", 0));
            } else if (e == 3) {
                intent.putExtra("extra_emoji_name", C43471q.m46982f(map, "express"));
                intent.putExtra(str4, C43471q.m46982f(map, "md5"));
                intent.putExtra("extra_aeskey", C43471q.m46982f(map, "aesKey"));
                intent.putExtra("extra_encrypt_url", C43471q.m46982f(map, "encryptUrl"));
                intent.putExtra("extra_thumb_url", C43471q.m46982f(map, "thumb"));
                intent.putExtra("id", C43471q.m46982f(map, "designerId"));
                intent.putExtra("name", C43471q.m46982f(map, "designerName"));
                intent.putExtra("headurl", C43471q.m46982f(map, "designerThumb"));
                intent.putExtra("weapp_user_name", C43471q.m46982f(map, "weappUserName"));
                intent.putExtra("weapp_version", C43471q.m46981e(map, "weappVersion", 0));
                intent.putExtra("source_type", C43471q.m46981e(map, "sourceType", 0));
                intent.putExtra(str5, C43471q.m46982f(map, str6));
            } else if (e != 4) {
                str = "";
            } else {
                intent.putExtra("extra_emoji_name", C43471q.m46982f(map, "express"));
                intent.putExtra("extra_encrypt_url", C43471q.m46982f(map, "encryptUrl"));
                intent.putExtra("extra_thumb_url", C43471q.m46982f(map, "thumb"));
                intent.putExtra("extra_article_name", C43471q.m46982f(map, "sourceTitle"));
                intent.putExtra("extra_article_url", C43471q.m46982f(map, "articleSource"));
                intent.putExtra("disableAddSticker", C43471q.m46981e(map, "disableAddSticker", 0) > 0);
                intent.putExtra("needSavePhotosAlbum", C43471q.m46981e(map, "needSavePhotosAlbum", 0) > 0);
                intent.putExtra("weapp_user_name", C43471q.m46982f(map, "weappUserName"));
                intent.putExtra("weapp_version", C43471q.m46981e(map, "weappVersion", 0));
                intent.putExtra("source_type", C43471q.m46981e(map, "sourceType", 0));
                intent.putExtra(str5, C43471q.m46982f(map, str6));
            }
            str = str2;
        } else {
            intent.putExtra("extra_id", C43471q.m46982f(map, "productID"));
            intent.putExtra("preceding_scence", 18);
            intent.putExtra("download_entrance_scene", 27);
            intent.putExtra("searchID", f);
            str = ".ui.EmojiStoreDetailUI";
        }
        if (Util.isNullOrNil(str)) {
            return true;
        }
        C88144b.m109791i(jVar.f38998a, "emoji", str, intent, (Bundle) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "openEmotionPageJsApi";
    }
}
