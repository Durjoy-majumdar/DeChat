package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import gy3.C87412m;
import hb2.C59822f;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import ke3.C88144b;
import la2.C99364n;
import nb2.C61646d;
import qc0.C101093a;
import qc0.C101106m;
import sa2.C101567h;
import te3.C64488kb1;
import te3.C64793w23;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.o */
public class C56979o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163187d;

    public C56979o(MusicMainUINew musicMainUINew) {
        this.f163187d = musicMainUINew;
    }

    public void onClick(View view) {
        C59822f fVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMainUINew musicMainUINew = this.f163187d;
        int i = MusicMainUINew.f163137C;
        musicMainUINew.getClass();
        Intent intent = new Intent();
        C64488kb1 b = musicMainUINew.f163159z.mo80430b(musicMainUINew.getContext());
        if (((ArrayList) musicMainUINew.f163147n).size() > 0 && (fVar = ((C61646d) ((ArrayList) musicMainUINew.f163147n).get(0)).f175298d) != null) {
            intent.putExtra("key_mv_nonce_id", fVar.f170756d);
            intent.putExtra("key_mv_feed_id", String.valueOf(fVar.f170755c));
            intent.putExtra("key_mv_cover_url", fVar.f170757e);
            intent.putExtra("key_mv_poster", fVar.f170758f);
        }
        intent.putExtra("key_mv_song_name", b.f183904d);
        intent.putExtra("key_mv_cover_url", b.f183912o);
        intent.putExtra("key_mv_album_cover_url", b.f183912o);
        intent.putExtra("key_mv_singer_name", b.f183905e);
        intent.putExtra("key_mv_album_name", b.f183911n);
        intent.putExtra("key_mv_music_from_shake", true);
        intent.putExtra("key_mv_song_mid", b.f183922y);
        intent.putExtra("key_mv_audio_type", MusicMainUINew.f163137C);
        try {
            C64793w23 w232 = new C64793w23();
            String uuid = UUID.randomUUID().toString();
            C87412m.m108593f(uuid, "randomUUID().toString()");
            w232.f186034e = uuid;
            w232.f186033d = 19;
            intent.putExtra("key_mv_report_data", w232.toByteArray());
        } catch (IOException unused) {
        }
        musicMainUINew.f163158y = true;
        if (C99364n.m129616h().mo138822a() instanceof C101567h) {
            ((C101567h) C99364n.m129616h().mo138822a()).mo141050G(1.0f);
        }
        if (!C101093a.m132481c()) {
            musicMainUINew.f163145i = C99364n.m129616h().mo138832k();
            C99364n.m129616h().mo138834o((C101106m) null);
        }
        C88144b.m109791i(musicMainUINew.getContext(), "mv", ".ui.MusicMvMainUI", intent, (Bundle) null);
        C56994w wVar = C56994w.f163218a;
        C56994w.f163219b.f156848q = 0;
        wVar.mo80436a(252);
        musicMainUINew.finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
