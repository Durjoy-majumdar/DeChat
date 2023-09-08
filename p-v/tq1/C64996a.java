package tq1;

import android.content.Context;
import android.content.Intent;
import com.tencent.tmassistantsdk.downloadservice.ByteRange;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import te3.C64488kb1;
import te3.C64719t23;
import up1.C65415e0;

/* renamed from: tq1.a */
public final class C64996a {

    /* renamed from: a */
    public static final C64996a f187120a = new C64996a();

    /* renamed from: a */
    public final void mo89155a(byte[] bArr, long j, String str, Context context) {
        C87412m.m108594g(bArr, ByteRange.BYTES_UNIT);
        C87412m.m108594g(str, "entity_id");
        C87412m.m108594g(context, "context");
        try {
            C64488kb1 kb12 = new C64488kb1();
            kb12.parseFrom(bArr);
            C64719t23 t232 = new C64719t23();
            Intent intent = new Intent();
            intent.putExtra("key_mv_cover_url", kb12.f183912o);
            intent.putExtra("key_launch_mv_comment", true);
            intent.putExtra("key_refer_mv_comment_id", j);
            intent.putExtra("key_need_update_music_ball_url", true);
            intent.putExtra("key_mv_extra_info", kb12.f183916s);
            intent.putExtra("key_mv_identification", kb12.f183917t);
            intent.putExtra("key_mv_music_duration", kb12.f183918u);
            intent.putExtra("key_mv_song_mid", kb12.f183922y);
            String str2 = kb12.f183912o;
            t232.f185461f = str2;
            t232.f185463h = kb12.f183905e;
            t232.f185464i = kb12.f183911n;
            t232.f185465j = kb12.f183916s;
            t232.f185466n = kb12.f183913p;
            t232.f185468p = kb12.f183917t;
            t232.f185469q = kb12.f183918u;
            t232.f185473u = kb12.f183904d;
            t232.f185474v = kb12.f183910j;
            t232.f185475w = str2;
            t232.f185470r = kb12.f183922y;
            t232.f185472t = str2;
            C65415e0 e0Var = C65415e0.f188260a;
            String str3 = kb12.f183909i;
            if (str3 == null) {
                str3 = String.valueOf(System.currentTimeMillis());
            }
            C87412m.m108593f(str3, "finderMVSongInfo.songId?…ntTimeMillis().toString()");
            e0Var.mo89507e(kb12, str3, 13, t232);
            String str4 = t232.f185473u;
            String str5 = "";
            if (str4 == null) {
                str4 = str5;
            }
            intent.putExtra("key_mv_song_name", str4);
            String str6 = t232.f185474v;
            if (str6 == null) {
                str6 = str5;
            }
            intent.putExtra("key_mv_song_lyric", str6);
            String str7 = t232.f185463h;
            if (str7 == null) {
                str7 = str5;
            }
            intent.putExtra("key_mv_singer_name", str7);
            String str8 = t232.f185464i;
            if (str8 == null) {
                str8 = str5;
            }
            intent.putExtra("key_mv_album_name", str8);
            String str9 = t232.f185466n;
            if (str9 == null) {
                str9 = str5;
            }
            intent.putExtra("key_mv_music_genre", str9);
            intent.putExtra("key_mv_issue_date", String.valueOf(t232.f185467o));
            String str10 = t232.f185475w;
            if (str10 == null) {
                str10 = str5;
            }
            intent.putExtra("key_mv_album_cover_url", str10);
            String str11 = t232.f185468p;
            if (str11 == null) {
                str11 = str5;
            }
            intent.putExtra("key_mv_identification", str11);
            String str12 = t232.f185465j;
            if (str12 != null) {
                str5 = str12;
            }
            intent.putExtra("key_mv_extra_info", str5);
            intent.putExtra("key_mv_music_duration", t232.f185469q);
            intent.putExtra("key_mv_music_operation_url", t232.f185471s);
            intent.putExtra("key_mv_song_mid", t232.f185470r);
            intent.putExtra("key_mv_entity_id", str);
            ((C58684b) C86312j.m106911c(C58684b.class)).jy0(context, intent);
        } catch (Exception unused) {
        }
    }
}
