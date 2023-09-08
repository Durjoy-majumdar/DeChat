package i61;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreDetailUI;
import com.tencent.p014mm.plugin.emoji.p040ui.EmojiStoreTopicUI;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.EmojiStoreV3SingleProductAlbumUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import j20.C117292a;
import k20.C9556a;
import p214om.C11502f;
import te3.C101754a80;
import te3.C101824o80;

/* renamed from: i61.n */
public class C98605n {
    /* renamed from: a */
    public static void m128199a(Context context, C101754a80 a802, boolean z) {
        Context context2 = context;
        C101754a80 a803 = a802;
        if (a803 == null) {
            Log.m105924i("MicroMsg.emoji.EmojiUINavigatorMgr", "banner is null. do nothing");
            return;
        }
        int i = a803.f297843i;
        if (i == 0) {
            Log.m105924i("MicroMsg.emoji.EmojiUINavigatorMgr", "MM_EMOTION_BANNER_SET_NULL do nothing");
            C115669n.INSTANCE.mo160131h(13223, 1, Integer.valueOf(a803.f297841g), a803.f297839e, 0, 0);
        } else if (i == 1) {
            if (z) {
                m128200b(context2, a803, true, 15, 8);
            } else {
                m128200b(context2, a803, true, 3, 5);
            }
            C115669n.INSTANCE.mo160131h(13223, 1, Integer.valueOf(a803.f297841g), a803.f297839e, 0, 4);
        } else if (i == 2) {
            String str = a803.f297840f;
            String str2 = a803.f297839e;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, context2);
            C115669n.INSTANCE.mo160131h(13223, 1, Integer.valueOf(a803.f297841g), a803.f297839e, 0, 3);
        } else if (i == 3) {
            int i2 = a803.f297841g;
            String str3 = a803.f297839e;
            String str4 = a803.f297845n;
            String str5 = a803.f297844j;
            String str6 = a803.f297842h;
            Intent intent2 = new Intent();
            intent2.setClass(context2, EmojiStoreTopicUI.class);
            intent2.putExtra("topic_id", i2);
            intent2.putExtra("topic_name", str3);
            intent2.putExtra("topic_ad_url", str6);
            intent2.putExtra("topic_icon_url", str5);
            intent2.putExtra("topic_desc", str4);
            if (z) {
                intent2.putExtra("extra_scence", 15);
            } else {
                intent2.putExtra("extra_scence", 3);
            }
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startEmotionList", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startEmotionList", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.mo160131h(13223, 1, Integer.valueOf(a803.f297841g), a803.f297839e, 0, 2);
        } else if (i != 4) {
            Log.m105925i("MicroMsg.emoji.EmojiUINavigatorMgr", "Unkown type do nothing. SetType:%d", Integer.valueOf(i));
        } else {
            m128203e(context, a803.f297841g, a803.f297839e, a803.f297845n, a803.f297844j, a803.f297842h, 10001);
            C115669n.INSTANCE.mo160131h(13223, 1, Integer.valueOf(a803.f297841g), a803.f297839e, 0, 1);
        }
    }

    /* renamed from: b */
    public static void m128200b(Context context, C101754a80 a802, boolean z, int i, int i2) {
        Intent intent = new Intent();
        intent.setClass(context, EmojiStoreDetailUI.class);
        intent.putExtra("extra_id", a802.f297846o);
        intent.putExtra("extra_name", a802.f297839e);
        intent.putExtra("extra_description", a802.f297845n);
        intent.putExtra("preceding_scence", i2);
        intent.putExtra("call_by", 1);
        intent.putExtra("download_entrance_scene", i);
        intent.putExtra("check_clickflag", z);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startDetailByBannerSet", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/EmotionBannerSet;ZII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startDetailByBannerSet", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/EmotionBannerSet;ZII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: c */
    public static void m128201c(Context context, C101824o80 o802, boolean z, int i, int i2, int i3, String str, int i4) {
        m128202d(context, o802, z, i, i2, i3, str, i4, (EmoticonStoreActionStruct) null);
    }

    /* renamed from: d */
    public static void m128202d(Context context, C101824o80 o802, boolean z, int i, int i2, int i3, String str, int i4, EmoticonStoreActionStruct emoticonStoreActionStruct) {
        Context context2 = context;
        C101824o80 o803 = o802;
        int i5 = i2;
        Intent intent = new Intent();
        intent.setClass(context, EmojiStoreDetailUI.class);
        if (o803 != null) {
            intent.putExtra("extra_id", o803.f298994d);
            intent.putExtra("extra_name", o803.f298996f);
            intent.putExtra("extra_copyright", o803.f299004q);
            intent.putExtra("extra_coverurl", o803.f299002o);
            intent.putExtra("extra_description", o803.f298997g);
            intent.putExtra("extra_price", o803.f298999i);
            intent.putExtra("extra_type", o803.f299000j);
            intent.putExtra("extra_flag", o803.f299001n);
            intent.putExtra("preceding_scence", i4);
            intent.putExtra("call_by", 1);
            boolean z2 = z;
            intent.putExtra("check_clickflag", z);
            int i6 = i;
            intent.putExtra("download_entrance_scene", i);
            intent.putExtra("extra_pack_wecoin_price", o803.f298990A);
            intent.putExtra("extra_wecoin_price", o803.f298991B);
            if (emoticonStoreActionStruct != null) {
                intent.putExtra("action_report", emoticonStoreActionStruct.mo1005p());
            }
            if (i5 != -1) {
                intent.putExtra("extra_status", i2);
            }
            if (i3 != -1) {
                intent.putExtra("extra_progress", -1);
            }
            if (!Util.isNullOrNil(str)) {
                String str2 = str;
                intent.putExtra("to_talker_name", str);
            }
        } else {
            Log.m105924i("MicroMsg.emoji.EmojiUINavigatorMgr", "get detail intent failed. summary is null.");
        }
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startDetailBySummary", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/EmotionSummary;ZIIILjava/lang/String;ILcom/tencent/mm/autogen/mmdata/rpt/EmoticonStoreActionStruct;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startDetailBySummary", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/EmotionSummary;ZIIILjava/lang/String;ILcom/tencent/mm/autogen/mmdata/rpt/EmoticonStoreActionStruct;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: e */
    public static void m128203e(Context context, int i, String str, String str2, String str3, String str4, int i2) {
        Intent intent = new Intent();
        intent.setClass(context, EmojiStoreV3SingleProductAlbumUI.class);
        intent.putExtra("set_id", i);
        intent.putExtra("set_title", str);
        intent.putExtra("set_desc", str2);
        intent.putExtra("set_iconURL", str3);
        intent.putExtra("headurl", str4);
        intent.putExtra("entrance_scene", i2);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/emoji/mgr/EmojiUINavigatorMgr", "startV3SingleProductAlbumUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
