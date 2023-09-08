package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Intent;
import com.tencent.p014mm.plugin.p081mv.p082ui.WeCheckBox;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import gy3.C87412m;
import la2.C99364n;
import ma2.C61454t;
import p529fv.C59326j;
import p823sg.C90193h;
import qc0.C101093a;
import qc0.C101106m;
import sa2.C101567h;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.d */
public class C56968d implements WeCheckBox.C56945b {

    /* renamed from: a */
    public final /* synthetic */ C101106m f163170a;

    /* renamed from: b */
    public final /* synthetic */ WeCheckBox f163171b;

    /* renamed from: c */
    public final /* synthetic */ int f163172c;

    /* renamed from: d */
    public final /* synthetic */ MusicMainUINew f163173d;

    public C56968d(MusicMainUINew musicMainUINew, C101106m mVar, WeCheckBox weCheckBox, int i) {
        this.f163173d = musicMainUINew;
        this.f163170a = mVar;
        this.f163171b = weCheckBox;
        this.f163172c = i;
    }

    /* renamed from: a */
    public void mo80419a(boolean z) {
        if (this.f163170a == null) {
            int i = MusicMainUINew.f163137C;
            Log.m105920e("MusicMainUINew", "musicWrapper is null, do nothing");
        } else if (z) {
            this.f163173d.f163142f.mo80434c();
            MusicMainUINew musicMainUINew = this.f163173d;
            C101106m mVar = this.f163170a;
            musicMainUINew.getClass();
            Class cls = C59326j.class;
            Intent intent = new Intent();
            intent.putExtra("key_mv_song_name", mVar.f295962g);
            intent.putExtra("key_mv_song_lyric", mVar.f295969q);
            intent.putExtra("key_mv_album_cover_url", mVar.f295965j);
            intent.putExtra("key_mv_cover_url", mVar.f295965j);
            intent.putExtra("key_mv_singer_name", mVar.f295963h);
            intent.putExtra("key_mv_album_name", mVar.f295964i);
            String str = mVar.f295965j;
            if (str == null) {
                str = "";
            }
            C61454t tVar = C61454t.f174766a;
            StringBuilder sb = new StringBuilder();
            sb.append("thumb_");
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(C90193h.m112878f(bytes));
            String i2 = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
            C87412m.m108593f(i2, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
            intent.putExtra("key_mv_thumb_path", i2);
            intent.putExtra("key_mv_music_from_shake", true);
            ((C59326j) C86312j.m106911c(cls)).mo84431a8(mVar.f295965j);
            ((C59326j) C86312j.m106911c(cls)).mo84429HI(intent.getExtras());
            if (C99364n.m129616h().mo138822a() instanceof C101567h) {
                ((C101567h) C99364n.m129616h().mo138822a()).mo141050G(1.0f);
            }
            Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.TRUE);
            this.f163173d.f163150q = true;
            C101093a.m132488j(this.f163170a);
            WeCheckBox weCheckBox = this.f163173d.f163138A;
            if (weCheckBox != null) {
                weCheckBox.setChecked(false);
            }
            this.f163173d.f163138A = this.f163171b;
            C56994w wVar = C56994w.f163218a;
            C56994w.f163219b.f156848q = (long) this.f163172c;
            wVar.mo80436a(257);
        } else {
            if (C101093a.m132480b().f295960e == this.f163170a.f295960e) {
                C101093a.m132490l();
            }
            this.f163173d.f163138A = null;
        }
    }
}
