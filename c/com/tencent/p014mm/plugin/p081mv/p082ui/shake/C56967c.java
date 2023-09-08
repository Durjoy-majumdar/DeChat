package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.p081mv.p082ui.WeCheckBox;
import gy3.C87412m;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import ke3.C88144b;
import qc0.C101106m;
import te3.C64793w23;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.c */
public class C56967c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101106m f163166d;

    /* renamed from: e */
    public final /* synthetic */ WeCheckBox f163167e;

    /* renamed from: f */
    public final /* synthetic */ int f163168f;

    /* renamed from: g */
    public final /* synthetic */ MusicMainUINew f163169g;

    public C56967c(MusicMainUINew musicMainUINew, C101106m mVar, WeCheckBox weCheckBox, int i) {
        this.f163169g = musicMainUINew;
        this.f163166d = mVar;
        this.f163167e = weCheckBox;
        this.f163168f = i;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MusicMainUINew musicMainUINew = this.f163169g;
        musicMainUINew.f163158y = true;
        musicMainUINew.f163139B.dead();
        C101106m mVar = this.f163166d;
        if (mVar != null) {
            MusicMainUINew musicMainUINew2 = this.f163169g;
            musicMainUINew2.getClass();
            Intent intent = new Intent();
            intent.putExtra("key_mv_song_name", mVar.f295962g);
            intent.putExtra("key_mv_cover_url", mVar.f295965j);
            intent.putExtra("key_mv_album_cover_url", mVar.f295965j);
            intent.putExtra("key_mv_singer_name", mVar.f295963h);
            intent.putExtra("key_mv_album_name", mVar.f295964i);
            intent.putExtra("key_mv_music_from_shake", true);
            try {
                C64793w23 w232 = new C64793w23();
                String uuid = UUID.randomUUID().toString();
                C87412m.m108593f(uuid, "randomUUID().toString()");
                w232.f186034e = uuid;
                w232.f186033d = 20;
                intent.putExtra("key_mv_report_data", w232.toByteArray());
            } catch (IOException unused) {
            }
            C88144b.m109791i(musicMainUINew2.getContext(), "mv", ".ui.MusicMvMainUI", intent, (Bundle) null);
        }
        this.f163167e.setChecked(true);
        this.f163169g.f163150q = true;
        C56994w wVar = C56994w.f163218a;
        C56994w.f163219b.f156848q = (long) this.f163168f;
        wVar.mo80436a(252);
        C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/shake/MusicMainUINew$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
