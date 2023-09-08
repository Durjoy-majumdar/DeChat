package com.tencent.p014mm.plugin.p081mv.p082ui.shake;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C86493v0;
import gy3.C87412m;
import ke3.C88144b;
import la2.C99364n;
import ma2.C61454t;
import nj3.C76879j;
import p1081gi.C98121d;
import p166hy.C60228r0;
import p529fv.C59331r;
import p763ym.C79138l;
import p823sg.C90193h;
import qc0.C101106m;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.mv.ui.shake.e */
public class C56969e implements C76879j.C11180n {

    /* renamed from: a */
    public final /* synthetic */ MusicMainUINew f163174a;

    public C56969e(MusicMainUINew musicMainUINew) {
        this.f163174a = musicMainUINew;
    }

    /* renamed from: j */
    public void mo782j(int i) {
        Bitmap bitmap = null;
        String str = "";
        if (i == 0) {
            MusicMainUINew musicMainUINew = this.f163174a;
            C64488kb1 b = musicMainUINew.f163159z.mo80430b(musicMainUINew.getContext());
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195582i = 76;
            bVar.f195570f = b.f183904d;
            bVar.f195574g = b.f183905e;
            bVar.f195542X = b.f183916s;
            String str2 = b.f183908h;
            if (str2 == null) {
                str2 = str;
            }
            bVar.f195586j = str2;
            bVar.f195590k = str;
            String str3 = b.f183906f;
            if (str3 == null) {
                str3 = str;
            }
            bVar.f195530T = str3;
            bVar.f195533U = str;
            bVar.f195562d = "wx5aa333606550dfd5";
            C72916m mVar = new C72916m();
            String str4 = b.f183912o;
            String str5 = b.f183910j;
            mVar.f212533p = b.f183922y;
            mVar.f212523f = str4;
            mVar.f212519b = str4;
            mVar.f212520c = str5;
            mVar.f212525h = b.f183905e;
            mVar.f212526i = b.f183911n;
            mVar.f212527j = b.f183913p;
            mVar.f212528k = String.valueOf(b.f183915r);
            mVar.f212529l = b.f183917t;
            mVar.f212531n = b.f183918u;
            mVar.f212530m = b.f183916s;
            C64519lb1 lb12 = b.f183921x;
            mVar.f212532o = lb12 != null ? lb12.f184069d : str;
            mVar.f212534q = "wx485a97c844086dc9";
            bVar.mo93545f(mVar);
            String s = C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null);
            Intent intent = new Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", s);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            String str6 = b.f183912o;
            if (str6 != null) {
                str = str6;
            }
            C61454t tVar = C61454t.f174766a;
            StringBuilder sb = new StringBuilder();
            sb.append("thumb_");
            byte[] bytes = str.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(C90193h.m112878f(bytes));
            String i2 = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
            C87412m.m108593f(i2, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
            intent.putExtra("Retr_Msg_thumb_path", i2);
            C56994w wVar = C56994w.f163218a;
            C56994w.f163219b.f156848q = 0;
            wVar.mo80436a(254);
            C88144b.m109802t(musicMainUINew.getContext(), ".ui.transmit.MsgRetransmitUI", intent, 1);
        } else if (i == 1) {
            MusicMainUINew musicMainUINew2 = this.f163174a;
            C64488kb1 b2 = musicMainUINew2.f163159z.mo80430b(musicMainUINew2.getContext());
            C64719t23 t232 = new C64719t23();
            C101106m k = C99364n.m129616h().mo138832k();
            t232.f185463h = b2.f183905e;
            t232.f185464i = b2.f183911n;
            t232.f185466n = b2.f183913p;
            t232.f185467o = b2.f183915r;
            t232.f185468p = b2.f183917t;
            t232.f185469q = b2.f183918u;
            t232.f185465j = b2.f183916s;
            C64519lb1 lb13 = b2.f183921x;
            t232.f185471s = lb13 != null ? lb13.f184069d : str;
            t232.f185470r = b2.f183922y;
            t232.f185476x = "wx485a97c844086dc9";
            C56994w wVar2 = C56994w.f163218a;
            C56994w.f163219b.f156848q = 0;
            wVar2.mo80436a(253);
            AppCompatActivity context = musicMainUINew2.getContext();
            Class cls = C59331r.class;
            WXMusicObject wXMusicObject = new WXMusicObject();
            wXMusicObject.musicUrl = k.f295968p;
            wXMusicObject.musicDataUrl = k.f295966n;
            String str7 = k.f295967o;
            wXMusicObject.musicLowBandUrl = str7;
            wXMusicObject.musicLowBandDataUrl = str7;
            wXMusicObject.songAlbumUrl = b2.f183912o;
            wXMusicObject.songLyric = b2.f183910j;
            WXMediaMessage wXMediaMessage = new WXMediaMessage();
            wXMediaMessage.mediaObject = wXMusicObject;
            wXMediaMessage.title = b2.f183904d;
            wXMediaMessage.description = k.f295963h;
            String str8 = b2.f183916s;
            if (str8 != null) {
                str = str8;
            }
            wXMediaMessage.messageExt = str;
            String zw = ((C59331r) C86312j.m106911c(cls)).mo84031zw(k);
            if (zw != null && C86013q1.m106450k(zw)) {
                Float valueOf = Float.valueOf(context.getResources().getDimension(C0966R.dimen.f3896i7));
                bitmap = BitmapUtil.getBitmapNative(zw, valueOf.intValue(), valueOf.intValue());
            }
            if (bitmap != null) {
                wXMediaMessage.thumbData = Util.bmpToByteArray(bitmap, true);
            } else {
                int i3 = C0966R.C0969drawable.aiu;
                if (C85875k4.m106211z()) {
                    i3 = C0966R.C0969drawable.ait;
                }
                wXMediaMessage.thumbData = Util.bmpToByteArray(BitmapUtil.getBitmapNative(i3), true);
            }
            Intent intent2 = new Intent();
            Bundle bundle = new Bundle();
            SendMessageToWX.Req req = new SendMessageToWX.Req();
            req.message = wXMediaMessage;
            req.toBundle(bundle);
            intent2.putExtra("Ksnsupload_timeline", bundle);
            intent2.putExtra("Ksnsupload_musicid", k.f295960e);
            if (((C79138l) C86312j.m106911c(C79138l.class)).mo73994Lc(((C59331r) C86312j.m106911c(cls)).mo84028pv(k))) {
                intent2.putExtra("Ksnsupload_appid", "wx5aa333606550dfd5");
            }
            intent2.putExtra("Ksnsupload_appname", ((C59331r) C86312j.m106911c(cls)).d40(k));
            String a = C86493v0.m107223a("music_player");
            C86493v0.m107224d().mo120947c(a, true).mo120962i("prePublishId", "music_player");
            intent2.putExtra("reportSessionId", a);
            intent2.putExtra("Ksnsupload_music_share_object_xml", ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84718BQ(t232).mo74685b());
            intent2.putExtra("Ksnsupload_type", 25);
            intent2.putExtra("need_result", true);
            C88144b.m109803u((MMActivity) musicMainUINew2.getHostActivity(), ".plugin.sns.ui.SnsUploadUI", intent2, 1, new C56970f(musicMainUINew2));
        }
    }
}
