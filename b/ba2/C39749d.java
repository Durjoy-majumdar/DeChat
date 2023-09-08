package ba2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.internal.ConstValue;
import te3.C101828pe0;
import te3.i25;

/* renamed from: ba2.d */
public class C39749d {
    /* renamed from: a */
    public static void m42534a(Intent intent, C101828pe0 pe02) {
        if (pe02 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("app_type", pe02.f299168o);
            bundle.putString("app_media_id", pe02.f299169p);
            bundle.putLong("app_msg_id", pe02.f299170q);
            bundle.putBoolean("app_show_share", pe02.f299171r);
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, pe02.f299172s);
            intent.putExtras(bundle);
        }
    }

    /* renamed from: b */
    public static void m42535b(Intent intent, i25 i25) {
        if (i25 != null) {
            Bundle bundle = new Bundle();
            bundle.putString(FFmpegMetadataRetriever.METADATA_KEY_TITLE, i25.f135054h);
            bundle.putString("webpageTitle", i25.f135055i);
            bundle.putBoolean("hide_option_menu", i25.f135056j);
            bundle.putBoolean("translate_webview", i25.f135057n);
            bundle.putString("srcUsername", i25.f135058o);
            bundle.putString("srcDisplayname", i25.f135059p);
            bundle.putInt("mode", i25.f135060q);
            bundle.putString("KTemplateId", i25.f135061r);
            bundle.putString("KPublisherId", i25.f135062s);
            bundle.putInt("KOpenArticleSceneFromScene", i25.f135063t);
            bundle.putInt(C74928u.C45093i.f122315g, i25.f135064u);
            bundle.putInt("pay_channel", i25.f135065v);
            bundle.putInt("key_download_restrict", i25.f135066w);
            bundle.putInt("key_wallet_region", i25.f135067x);
            bundle.putString("key_function_id", i25.f135068y);
            bundle.putInt(C74928u.C45093i.f122318j, i25.f135069z);
            bundle.putInt("geta8key_scene", i25.f135041A);
            bundle.putString(C74928u.C45093i.f122325q, i25.f135046F);
            bundle.putBoolean("key_menu_hide_expose", i25.f135047G);
            bundle.putString("webviewCurrentProcess", i25.f135048H);
            bundle.putString("rawUrl", i25.f135051e);
            intent.putExtras(bundle);
        }
    }

    /* renamed from: c */
    public static void m42536c(Bundle bundle, C101828pe0 pe02) {
        if (pe02 != null && bundle != null) {
            pe02.f299168o = bundle.getString("app_type");
            pe02.f299169p = bundle.getString("app_media_id");
            pe02.f299170q = bundle.getLong("app_msg_id");
            pe02.f299171r = bundle.getBoolean("app_show_share");
            pe02.f299172s = bundle.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            pe02.f299160d = bundle.getBoolean("ifAppAttachDownloadUI");
            pe02.f299161e = bundle.getString(AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
            pe02.f299162f = bundle.getString("fileExt");
            pe02.f299163g = bundle.getString("appId");
            pe02.f299164h = bundle.getString(ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
            pe02.f299166j = bundle.getBoolean("showMenu");
        }
    }

    /* renamed from: d */
    public static void m42537d(Bundle bundle, i25 i25) {
        if (i25 != null && bundle != null) {
            i25.f135054h = bundle.getString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            i25.f135055i = bundle.getString("webpageTitle");
            i25.f135056j = bundle.getBoolean("hide_option_menu");
            i25.f135057n = bundle.getBoolean("translate_webview");
            i25.f135058o = bundle.getString("srcUsername");
            i25.f135059p = bundle.getString("srcDisplayname");
            i25.f135060q = bundle.getInt("mode");
            i25.f135061r = bundle.getString("KTemplateId");
            i25.f135062s = bundle.getString("KPublisherId");
            i25.f135063t = bundle.getInt("KOpenArticleSceneFromScene");
            i25.f135064u = bundle.getInt(C74928u.C45093i.f122315g);
            i25.f135065v = bundle.getInt("pay_channel");
            i25.f135066w = bundle.getInt("key_download_restrict");
            i25.f135067x = bundle.getInt("key_wallet_region");
            i25.f135068y = bundle.getString("key_function_id");
            i25.f135069z = bundle.getInt(C74928u.C45093i.f122318j, -1);
            i25.f135041A = bundle.getInt("geta8key_scene");
            i25.f135046F = bundle.getString(C74928u.C45093i.f122325q);
            i25.f135047G = bundle.getBoolean("key_menu_hide_expose");
            i25.f135048H = bundle.getString("webviewCurrentProcess");
            i25.f135051e = bundle.getString("rawUrl");
        }
    }
}
