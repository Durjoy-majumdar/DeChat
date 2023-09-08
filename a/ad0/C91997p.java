package ad0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.Map;
import ke3.C88144b;
import te3.C49399fa;

/* renamed from: ad0.p */
public class C91997p implements C54017f {

    /* renamed from: a */
    public C49399fa f263357a = new C49399fa();

    /* renamed from: c */
    public static boolean m115545c(Context context, C49399fa faVar, Rect rect) {
        Log.m105925i("MicroMsg.SnsMpVideoShareObject", "onClick %s/%s", faVar.f133375p, faVar.f133368f);
        Intent intent = new Intent();
        intent.putExtra("show_search_chat_content_result", false);
        intent.putExtra("img_gallery_msg_id", 0);
        intent.putExtra("img_gallery_talker", faVar.f133375p);
        intent.putExtra("img_gallery_chatroom_name", false);
        if (rect != null) {
            intent.putExtra("img_gallery_width", rect.right - rect.left).putExtra("img_gallery_height", rect.bottom - rect.top).putExtra("img_gallery_left", rect.left).putExtra("img_gallery_top", rect.top);
        }
        intent.putExtra("img_gallery_is_mp_video_without_msg", true);
        intent.putExtra("img_gallery_mp_video_click_from", 1);
        intent.putExtra("img_gallery_path", MD5Util.getMD5String(faVar.f133367e));
        intent.putExtra("show_enter_grid", false);
        intent.putExtra("KOpenArticleSceneFromScene", 2);
        try {
            intent.putExtra("img_gallery_mp_share_video_info", faVar.toByteArray());
        } catch (IOException e) {
            Log.m105921e("MicroMsg.SnsMpVideoShareObject", "onClick toByteArray ex %s", e.getMessage());
        }
        C88144b.m109801s(context, "com.tencent.mm.ui.chatting.gallery.ImageGalleryUI", intent, (Bundle) null);
        ((Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    /* renamed from: d */
    public static C49399fa m115546d(String str, Map<String, String> map) {
        C49399fa faVar = new C49399fa();
        try {
            String str2 = str + ".mmbrandmpvideo";
            if (!map.isEmpty()) {
                if (map.containsKey(str2 + ".videoUrl")) {
                    faVar.f133366d = Util.nullAsNil(map.get(str2 + ".mpUrl"));
                    faVar.f133367e = Util.nullAsNil(map.get(str2 + ".videoUrl"));
                    faVar.f133374o = Util.nullAsNil(map.get(str2 + ".url"));
                    faVar.f133369g = Util.nullAsNil(map.get(str2 + ".title"));
                    faVar.f133368f = Util.nullAsNil(map.get(str2 + ".videoVid"));
                    faVar.f133370h = Util.nullAsNil(map.get(str2 + ".thumbUrl"));
                    faVar.f133375p = Util.nullAsNil(map.get(str2 + ".bizUsrName"));
                    faVar.f133376q = Util.nullAsNil(map.get(str2 + ".bizNickName"));
                    faVar.f133371i = (int) Util.safeParseFloat(map.get(str2 + ".videoDuration"));
                    faVar.f133372j = (int) Util.safeParseFloat(map.get(str2 + ".thumbWidth"));
                    faVar.f133373n = (int) Util.safeParseFloat(map.get(str2 + ".thumbHeight"));
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SnsMpVideoShareObject", "parse error %s", e.getMessage());
        }
        return faVar;
    }

    /* renamed from: b */
    public String mo74685b() {
        C49399fa faVar = this.f263357a;
        StringBuilder sb = new StringBuilder();
        if (faVar != null) {
            try {
                sb.append("<mmbrandmpvideo>");
                sb.append("<mpUrl>");
                sb.append(Util.escapeStringForXml(faVar.f133366d));
                sb.append("</mpUrl>");
                sb.append("<thumbUrl>");
                sb.append(Util.escapeStringForXml(faVar.f133370h));
                sb.append("</thumbUrl>");
                sb.append("<videoVid>");
                sb.append(faVar.f133368f);
                sb.append("</videoVid>");
                sb.append("<bizUsrName>");
                sb.append(faVar.f133375p);
                sb.append("</bizUsrName>");
                sb.append("<bizNickName>");
                sb.append(faVar.f133376q);
                sb.append("</bizNickName>");
                sb.append("<videoUrl>");
                sb.append(Util.escapeStringForXml(faVar.f133367e));
                sb.append("</videoUrl>");
                sb.append("<url>");
                sb.append(Util.escapeStringForXml(faVar.f133374o));
                sb.append("</url>");
                sb.append("<title>");
                sb.append(Util.escapeStringForXml(faVar.f133369g));
                sb.append("</title>");
                sb.append("<videoDuration>");
                sb.append(faVar.f133371i);
                sb.append("</videoDuration>");
                sb.append("<thumbWidth>");
                sb.append(faVar.f133372j);
                sb.append("</thumbWidth>");
                sb.append("<thumbHeight>");
                sb.append(faVar.f133373n);
                sb.append("</thumbHeight>");
                sb.append("</mmbrandmpvideo>");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SnsMpVideoShareObject", "make content error %s", e.getMessage());
            }
        }
        return sb.toString();
    }
}
