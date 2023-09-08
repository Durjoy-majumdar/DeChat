package ma2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.UUID;
import ke3.C88144b;
import qc0.C101093a;
import qc0.C101107p;
import qc0.C62602o;
import te3.C101822o23;
import te3.C64719t23;
import te3.C64793w23;
import wx2.C66204d;

/* renamed from: ma2.z */
public final class C99825z implements C66204d.C38350a {
    /* renamed from: D1 */
    public void mo61631D1(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "info");
    }

    /* renamed from: Q0 */
    public void mo61632Q0(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "info");
        if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76822Vm()) {
            C101822o23 o232 = new C101822o23();
            try {
                o232.parseFrom(multiTaskInfo.field_data);
                int i = o232.f298946e;
                String str = o232.f298947f;
                String str2 = o232.f298948g;
                String str3 = o232.f298949h;
                String str4 = o232.f298950i;
                String str5 = o232.f298951j;
                String str6 = o232.f298952n;
                String str7 = o232.f298953o;
                C101093a.m132488j(C101107p.m132494b(i, str, str2, str3, str4, str5, str6, str7, o232.f298954p, o232.f298955q, o232.f298956r, o232.f298957s, C62602o.m73561a(str7, o232.f298945d)));
                C64793w23 w232 = new C64793w23();
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "randomUUID().toString()");
                w232.f186034e = uuid;
                w232.f186035f = 86;
                w232.f186033d = 7;
                Intent intent = new Intent();
                C64719t23 t232 = o232.f298945d;
                intent.putExtra("key_scene", 12);
                intent.putExtra("key_mv_feed_id", t232.f185459d);
                intent.putExtra("key_mv_nonce_id", t232.f185460e);
                intent.putExtra("key_mv_cover_url", t232.f185461f);
                intent.putExtra("key_mv_poster", t232.f185462g);
                String str8 = t232.f185473u;
                String str9 = "";
                if (str8 == null) {
                    str8 = str9;
                }
                intent.putExtra("key_mv_song_name", str8);
                String str10 = t232.f185474v;
                if (str10 == null) {
                    str10 = str9;
                }
                intent.putExtra("key_mv_song_lyric", str10);
                String str11 = t232.f185463h;
                if (str11 == null) {
                    str11 = str9;
                }
                intent.putExtra("key_mv_singer_name", str11);
                String str12 = t232.f185464i;
                if (str12 == null) {
                    str12 = str9;
                }
                intent.putExtra("key_mv_album_name", str12);
                String str13 = t232.f185466n;
                if (str13 == null) {
                    str13 = str9;
                }
                intent.putExtra("key_mv_music_genre", str13);
                String l = Long.valueOf(t232.f185467o).toString();
                if (l == null) {
                    l = str9;
                }
                intent.putExtra("key_mv_issue_date", l);
                String str14 = t232.f185475w;
                if (str14 == null) {
                    str14 = str9;
                }
                intent.putExtra("key_mv_album_cover_url", str14);
                String str15 = t232.f185468p;
                if (str15 == null) {
                    str15 = str9;
                }
                intent.putExtra("key_mv_identification", str15);
                String str16 = t232.f185465j;
                if (str16 == null) {
                    str16 = str9;
                }
                intent.putExtra("key_mv_extra_info", str16);
                intent.putExtra("key_mv_music_duration", t232.f185469q);
                String str17 = t232.f185472t;
                if (str17 == null) {
                    str17 = str9;
                }
                intent.putExtra("key_mv_thumb_path", str17);
                String str18 = t232.f185471s;
                if (str18 == null) {
                    str18 = str9;
                }
                intent.putExtra("key_mv_music_operation_url", str18);
                String str19 = t232.f185470r;
                if (str19 != null) {
                    str9 = str19;
                }
                intent.putExtra("key_mv_song_mid", str9);
                intent.putExtra("key_mv_report_data", w232.toByteArray());
                intent.setFlags(268435456);
                C88144b.m109791i(MMApplicationContext.getContext(), "mv", ".ui.MusicMvMainUI", intent, (Bundle) null);
            } catch (Throwable unused) {
                Log.m105920e("MicroMsg.MusicPlayerMultiTaskHelper", "MusicMultiTaskData parse failed");
            }
        }
    }

    /* renamed from: m1 */
    public void mo61633m1(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "info");
    }
}
