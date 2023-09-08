package mo1;

import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C55032t1;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicUIC;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import er1.C58684b;
import fe1.C58969q;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.UUID;
import jq3.C60898l;
import jq3.C60905o;
import o40.C61926c;
import p640ox.C77049b;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64417hb1;
import te3.C64488kb1;
import te3.C64519lb1;
import te3.C64719t23;
import te3.C64793w23;
import up1.C65415e0;
import up1.C65418l;

/* renamed from: mo1.h1 */
public final class C61511h1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ WxRecyclerAdapter<C0740i2> f174864d;

    /* renamed from: e */
    public final /* synthetic */ FinderProfileMusicUIC f174865e;

    public C61511h1(WxRecyclerAdapter<C0740i2> wxRecyclerAdapter, FinderProfileMusicUIC finderProfileMusicUIC) {
        this.f174864d = wxRecyclerAdapter;
        this.f174865e = finderProfileMusicUIC;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        String str;
        String str2;
        String str3;
        String str4;
        C8479f0 f0Var;
        C13598b0 b0Var;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i2;
        String str15;
        String str16;
        C64417hb1 hb12;
        C64488kb1 kb12;
        C64417hb1 hb13;
        C64488kb1 kb13;
        C64417hb1 hb14;
        C64488kb1 kb14;
        C64417hb1 hb15;
        C64488kb1 kb15;
        C64417hb1 hb16;
        C64488kb1 kb16;
        C64417hb1 hb17;
        C64488kb1 kb17;
        C64519lb1 lb12;
        C64417hb1 hb18;
        C64488kb1 kb18;
        C64417hb1 hb19;
        C64488kb1 kb19;
        C64417hb1 hb110;
        C64488kb1 kb110;
        C64417hb1 hb111;
        C64488kb1 kb111;
        C64417hb1 hb112;
        C64488kb1 kb112;
        C64417hb1 hb113;
        C64488kb1 kb113;
        FinderObjectDesc finderObjectDesc;
        C64417hb1 hb114;
        C64488kb1 kb114;
        FinderObjectDesc finderObjectDesc2;
        C64417hb1 hb115;
        C64488kb1 kb115;
        C64519lb1 lb13;
        FinderObjectDesc finderObjectDesc3;
        C64417hb1 hb116;
        C64488kb1 kb116;
        FinderObjectDesc finderObjectDesc4;
        C64417hb1 hb117;
        C64488kb1 kb117;
        FinderObjectDesc finderObjectDesc5;
        C64417hb1 hb118;
        C64488kb1 kb118;
        FinderObjectDesc finderObjectDesc6;
        C64417hb1 hb119;
        C64488kb1 kb119;
        FinderObjectDesc finderObjectDesc7;
        C64417hb1 hb120;
        C64488kb1 kb120;
        FinderObjectDesc finderObjectDesc8;
        C64417hb1 hb121;
        C64488kb1 kb121;
        FinderObjectDesc finderObjectDesc9;
        C64417hb1 hb122;
        C64488kb1 kb122;
        FinderObjectDesc finderObjectDesc10;
        C64417hb1 hb123;
        C64488kb1 kb123;
        FinderObjectDesc finderObjectDesc11;
        C64417hb1 hb124;
        C64488kb1 kb124;
        FinderObjectDesc finderObjectDesc12;
        C64417hb1 hb125;
        C64488kb1 kb125;
        FinderObjectDesc finderObjectDesc13;
        C64417hb1 hb126;
        C64488kb1 kb126;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        String str17;
        String str18;
        String str19;
        String str20;
        long j;
        FinderObjectDesc finderObjectDesc14;
        C64417hb1 hb127;
        C64488kb1 kb127;
        C64519lb1 lb14;
        FinderObjectDesc finderObjectDesc15;
        C64417hb1 hb128;
        C64488kb1 kb128;
        FinderObjectDesc finderObjectDesc16;
        C64417hb1 hb129;
        C64488kb1 kb129;
        FinderObjectDesc finderObjectDesc17;
        C64417hb1 hb130;
        C64488kb1 kb130;
        FinderObjectDesc finderObjectDesc18;
        C64417hb1 hb131;
        C64488kb1 kb131;
        FinderObjectDesc finderObjectDesc19;
        C64417hb1 hb132;
        C64488kb1 kb132;
        FinderObjectDesc finderObjectDesc20;
        C64417hb1 hb133;
        C64488kb1 kb133;
        FinderObjectDesc finderObjectDesc21;
        C64417hb1 hb134;
        C64488kb1 kb134;
        FinderObjectDesc finderObjectDesc22;
        C64417hb1 hb135;
        C64488kb1 kb135;
        FinderObjectDesc finderObjectDesc23;
        C64417hb1 hb136;
        C64488kb1 kb136;
        FinderObjectDesc finderObjectDesc24;
        C64417hb1 hb137;
        C64488kb1 kb137;
        FinderObjectDesc finderObjectDesc25;
        C64417hb1 hb138;
        C64488kb1 kb138;
        Class<C58684b> cls = C58684b.class;
        Class<C11057v> cls2 = C11057v.class;
        C60905o oVar = (C60905o) zVar;
        Class<C13442s8> cls3 = C13442s8.class;
        Class<C64793w23> cls4 = C64793w23.class;
        Class<C77049b> cls5 = C77049b.class;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C0740i2 i2Var = (C0740i2) oVar.f173503E;
        if (i2Var instanceof C55032t1) {
            this.f174864d.mo85796c6();
            StringBuilder sb = new StringBuilder();
            sb.append("onItemClick position:");
            sb.append(i);
            sb.append(" isLocal: ");
            C55032t1 t1Var = (C55032t1) i2Var;
            sb.append(t1Var.f154491d.getFeedObject().f164794id == 0);
            sb.append(", imageUrl: ");
            sb.append(t1Var.mo76087q0());
            Log.m105924i("Finder.FinderProfileMusicUIC", sb.toString());
            Intent intent = new Intent();
            String str21 = "Finder.FinderProfileMusicUIC";
            Class<C58684b> cls6 = cls;
            Class<C11057v> cls7 = cls2;
            Class<C13442s8> cls8 = cls3;
            String str22 = "randomUUID().toString()";
            String str23 = "MusicMvMainUI";
            Class<C64793w23> cls9 = cls4;
            FinderProfileMusicUIC finderProfileMusicUIC = this.f174865e;
            Class<C77049b> cls10 = cls5;
            if (t1Var.f154491d.getFeedObject().f164794id == 0) {
                C64719t23 t232 = new C64719t23();
                FinderObject p0 = t1Var.mo76086p0();
                C58969q l = t1Var.mo3507l();
                if (l != null) {
                    str17 = "key_mv_song_mid";
                    str18 = l.getNickname();
                } else {
                    str17 = "key_mv_song_mid";
                    str18 = null;
                }
                t232.f185462g = str18;
                t232.f185463h = (p0 == null || (finderObjectDesc25 = p0.objectDesc) == null || (hb138 = finderObjectDesc25.mvInfo) == null || (kb138 = hb138.f183456e) == null) ? null : kb138.f183905e;
                t232.f185464i = (p0 == null || (finderObjectDesc24 = p0.objectDesc) == null || (hb137 = finderObjectDesc24.mvInfo) == null || (kb137 = hb137.f183456e) == null) ? null : kb137.f183911n;
                t232.f185465j = (p0 == null || (finderObjectDesc23 = p0.objectDesc) == null || (hb136 = finderObjectDesc23.mvInfo) == null || (kb136 = hb136.f183456e) == null) ? null : kb136.f183916s;
                t232.f185466n = (p0 == null || (finderObjectDesc22 = p0.objectDesc) == null || (hb135 = finderObjectDesc22.mvInfo) == null || (kb135 = hb135.f183456e) == null) ? null : kb135.f183913p;
                if (p0 == null || (finderObjectDesc21 = p0.objectDesc) == null || (hb134 = finderObjectDesc21.mvInfo) == null || (kb134 = hb134.f183456e) == null) {
                    str20 = "key_mv_music_operation_url";
                    str19 = "key_mv_extra_info";
                    j = 0;
                } else {
                    str20 = "key_mv_music_operation_url";
                    str19 = "key_mv_extra_info";
                    j = kb134.f183915r;
                }
                t232.f185467o = j;
                t232.f185468p = (p0 == null || (finderObjectDesc20 = p0.objectDesc) == null || (hb133 = finderObjectDesc20.mvInfo) == null || (kb133 = hb133.f183456e) == null) ? null : kb133.f183917t;
                t232.f185469q = (p0 == null || (finderObjectDesc19 = p0.objectDesc) == null || (hb132 = finderObjectDesc19.mvInfo) == null || (kb132 = hb132.f183456e) == null) ? 0 : kb132.f183918u;
                t232.f185473u = (p0 == null || (finderObjectDesc18 = p0.objectDesc) == null || (hb131 = finderObjectDesc18.mvInfo) == null || (kb131 = hb131.f183456e) == null) ? null : kb131.f183904d;
                t232.f185474v = (p0 == null || (finderObjectDesc17 = p0.objectDesc) == null || (hb130 = finderObjectDesc17.mvInfo) == null || (kb130 = hb130.f183456e) == null) ? null : kb130.f183910j;
                t232.f185475w = (p0 == null || (finderObjectDesc16 = p0.objectDesc) == null || (hb129 = finderObjectDesc16.mvInfo) == null || (kb129 = hb129.f183456e) == null) ? null : kb129.f183912o;
                t232.f185470r = (p0 == null || (finderObjectDesc15 = p0.objectDesc) == null || (hb128 = finderObjectDesc15.mvInfo) == null || (kb128 = hb128.f183456e) == null) ? null : kb128.f183922y;
                t232.f185472t = t1Var.mo76087q0();
                t232.f185471s = (p0 == null || (finderObjectDesc14 = p0.objectDesc) == null || (hb127 = finderObjectDesc14.mvInfo) == null || (kb127 = hb127.f183456e) == null || (lb14 = kb127.f183921x) == null) ? null : lb14.f184069d;
                C13598b0 b0Var2 = C13598b0.f38549a;
                String str24 = t232.f185473u;
                if (str24 == null) {
                    str24 = "";
                }
                intent.putExtra("key_mv_song_name", str24);
                String str25 = t232.f185474v;
                if (str25 == null) {
                    str25 = "";
                }
                intent.putExtra("key_mv_song_lyric", str25);
                String str26 = t232.f185463h;
                if (str26 == null) {
                    str26 = "";
                }
                intent.putExtra("key_mv_singer_name", str26);
                String str27 = t232.f185464i;
                if (str27 == null) {
                    str27 = "";
                }
                intent.putExtra("key_mv_album_name", str27);
                String str28 = t232.f185466n;
                if (str28 == null) {
                    str28 = "";
                }
                intent.putExtra("key_mv_music_genre", str28);
                intent.putExtra("key_mv_issue_date", String.valueOf(t232.f185467o));
                String str29 = t232.f185475w;
                if (str29 == null) {
                    str29 = "";
                }
                intent.putExtra("key_mv_album_cover_url", str29);
                String str30 = t232.f185468p;
                if (str30 == null) {
                    str30 = "";
                }
                intent.putExtra("key_mv_identification", str30);
                String str31 = t232.f185465j;
                if (str31 == null) {
                    str31 = "";
                }
                intent.putExtra(str19, str31);
                intent.putExtra("key_mv_music_duration", t232.f185469q);
                intent.putExtra(str20, t232.f185471s);
                intent.putExtra(str17, t232.f185470r);
                C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(cls10)).mo72357nb(finderProfileMusicUIC.getActivity(), str23, 7, cls9);
                if (w232 != null) {
                    String uuid = UUID.randomUUID().toString();
                    C87412m.m108593f(uuid, str22);
                    w232.f186034e = uuid;
                    w232.f186035f = 86;
                    w232.f186036g = C61926c.m72691p(t1Var.f154491d.getId());
                    w232.f186033d = 8;
                    w232.f186038i = ((C13442s8) C39818r.f106831a.mo62444c(finderProfileMusicUIC.getActivity()).mo75002a(cls8)).f38098n;
                }
                FinderObject p05 = t1Var.mo76086p0();
                FinderProfileMusicUIC finderProfileMusicUIC2 = finderProfileMusicUIC;
                if (p05 != null) {
                    FinderProfileMusicUIC.m64329c3(finderProfileMusicUIC2, p05);
                    C64488kb1 kb139 = finderProfileMusicUIC2.f160630v;
                    if (kb139 != null) {
                        C65415e0 e0Var = C65415e0.f188260a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("finder_local_");
                        Object obj = kb139.f183909i;
                        if (obj == null) {
                            obj = Long.valueOf(t1Var.f154491d.getLocalId());
                        }
                        sb4.append(obj);
                        e0Var.mo89507e(kb139, sb4.toString(), 13, t232);
                    }
                    finderProfileMusicUIC2.f160630v = null;
                }
                ((C11057v) C39818r.f106831a.mo62444c(finderProfileMusicUIC2.getActivity()).mo75002a(cls7)).f32817f = false;
                C65418l.C65419a aVar = C65418l.f188265M;
                FinderItem finderItem = t1Var.f154491d;
                C87412m.m108594g(finderItem, "finderItem");
                intent.putExtra("key_track_data", aVar.mo89518b(aVar.mo89517a(finderItem)).toByteArray());
                ((C58684b) C86312j.m106911c(cls6)).jy0(finderProfileMusicUIC2.getActivity(), intent);
            } else {
                String str32 = "key_mv_song_mid";
                String str33 = "key_mv_music_operation_url";
                String str34 = "key_mv_extra_info";
                Class<C13442s8> cls11 = cls8;
                String str35 = str22;
                String str36 = str23;
                Class<C64793w23> cls12 = cls9;
                FinderObject feedObject = t1Var.f154491d.getFeedObject();
                String str37 = "key_mv_music_duration";
                FinderObjectDesc finderObjectDesc26 = feedObject.objectDesc;
                if (finderObjectDesc26 == null || (linkedList = finderObjectDesc26.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
                    str2 = "key_mv_identification";
                    str = str34;
                    str3 = null;
                } else {
                    str2 = "key_mv_identification";
                    StringBuilder sb5 = new StringBuilder();
                    str = str34;
                    sb5.append(finderMedia.thumbUrl);
                    sb5.append(finderMedia.thumb_url_token);
                    str3 = sb5.toString();
                    C13598b0 b0Var3 = C13598b0.f38549a;
                }
                if (!(!(str3 == null || str3.length() == 0) || (finderObjectDesc13 = feedObject.objectDesc) == null || (hb126 = finderObjectDesc13.mvInfo) == null || (kb126 = hb126.f183456e) == null)) {
                    String str38 = kb126.f183912o;
                    if (str38 == null) {
                        str38 = "";
                    }
                    C13598b0 b0Var4 = C13598b0.f38549a;
                }
                FinderContact finderContact = feedObject.contact;
                String str39 = finderContact != null ? finderContact.nickname : null;
                C8479f0 f0Var2 = new C8479f0();
                String str40 = "key_mv_album_cover_url";
                long j2 = feedObject.f164794id;
                String str41 = "key_mv_issue_date";
                String str42 = feedObject.objectNonceId;
                if (str3 == null || str39 == null || str42 == null) {
                    str4 = str21;
                    f0Var = f0Var2;
                    b0Var = null;
                } else {
                    String str43 = "key_mv_music_genre";
                    String str44 = "key_mv_album_name";
                    String str45 = "key_mv_singer_name";
                    C64793w23 w233 = (C64793w23) ((C77049b) C86312j.m106911c(cls10)).mo72357nb(finderProfileMusicUIC.getActivity(), str36, 7, cls12);
                    if (w233 != null) {
                        String uuid2 = UUID.randomUUID().toString();
                        C87412m.m108593f(uuid2, str35);
                        w233.f186034e = uuid2;
                        w233.f186035f = 86;
                        w233.f186036g = C61926c.m72691p(feedObject.f164794id);
                        w233.f186033d = 8;
                        w233.f186038i = ((C13442s8) C39818r.f106831a.mo62443b(finderProfileMusicUIC.getContext()).mo75002a(cls11)).f38098n;
                        C13598b0 b0Var5 = C13598b0.f38549a;
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_mv_cover_url", str3);
                    intent2.putExtra("key_mv_feed_id", C61926c.m72691p(j2));
                    intent2.putExtra("key_mv_nonce_id", str42);
                    intent2.putExtra("key_mv_poster", str39);
                    intent2.putExtra("key_need_update_music_ball_url", true);
                    FinderObject p06 = t1Var.mo76086p0();
                    if (p06 == null || (finderObjectDesc12 = p06.objectDesc) == null || (hb125 = finderObjectDesc12.mvInfo) == null || (kb125 = hb125.f183456e) == null || (str5 = kb125.f183904d) == null) {
                        str5 = "";
                    }
                    intent2.putExtra("key_mv_song_name", str5);
                    FinderObject p07 = t1Var.mo76086p0();
                    if (p07 == null || (finderObjectDesc11 = p07.objectDesc) == null || (hb124 = finderObjectDesc11.mvInfo) == null || (kb124 = hb124.f183456e) == null || (str6 = kb124.f183910j) == null) {
                        str6 = "";
                    }
                    intent2.putExtra("key_mv_song_lyric", str6);
                    FinderObject p08 = t1Var.mo76086p0();
                    if (p08 == null || (finderObjectDesc10 = p08.objectDesc) == null || (hb123 = finderObjectDesc10.mvInfo) == null || (kb123 = hb123.f183456e) == null || (str7 = kb123.f183905e) == null) {
                        str7 = "";
                    }
                    intent2.putExtra(str45, str7);
                    FinderObject p09 = t1Var.mo76086p0();
                    if (p09 == null || (finderObjectDesc9 = p09.objectDesc) == null || (hb122 = finderObjectDesc9.mvInfo) == null || (kb122 = hb122.f183456e) == null || (str8 = kb122.f183911n) == null) {
                        str8 = "";
                    }
                    intent2.putExtra(str44, str8);
                    FinderObject p010 = t1Var.mo76086p0();
                    if (p010 == null || (finderObjectDesc8 = p010.objectDesc) == null || (hb121 = finderObjectDesc8.mvInfo) == null || (kb121 = hb121.f183456e) == null || (str9 = kb121.f183913p) == null) {
                        str9 = "";
                    }
                    intent2.putExtra(str43, str9);
                    FinderObject p011 = t1Var.mo76086p0();
                    if (p011 == null || (finderObjectDesc7 = p011.objectDesc) == null || (hb120 = finderObjectDesc7.mvInfo) == null || (kb120 = hb120.f183456e) == null || (str10 = Long.valueOf(kb120.f183915r).toString()) == null) {
                        str10 = "";
                    }
                    intent2.putExtra(str41, str10);
                    FinderObject p012 = t1Var.mo76086p0();
                    if (p012 == null || (finderObjectDesc6 = p012.objectDesc) == null || (hb119 = finderObjectDesc6.mvInfo) == null || (kb119 = hb119.f183456e) == null || (str11 = kb119.f183912o) == null) {
                        str11 = "";
                    }
                    intent2.putExtra(str40, str11);
                    FinderObject p013 = t1Var.mo76086p0();
                    if (p013 == null || (finderObjectDesc5 = p013.objectDesc) == null || (hb118 = finderObjectDesc5.mvInfo) == null || (kb118 = hb118.f183456e) == null || (str12 = kb118.f183916s) == null) {
                        str12 = "";
                    }
                    intent2.putExtra(str, str12);
                    FinderObject p014 = t1Var.mo76086p0();
                    if (p014 == null || (finderObjectDesc4 = p014.objectDesc) == null || (hb117 = finderObjectDesc4.mvInfo) == null || (kb117 = hb117.f183456e) == null || (str13 = kb117.f183917t) == null) {
                        str13 = "";
                    }
                    intent2.putExtra(str2, str13);
                    FinderObject p015 = t1Var.mo76086p0();
                    if (p015 == null || (finderObjectDesc3 = p015.objectDesc) == null || (hb116 = finderObjectDesc3.mvInfo) == null || (kb116 = hb116.f183456e) == null) {
                        str14 = str37;
                        i2 = 0;
                    } else {
                        i2 = kb116.f183918u;
                        str14 = str37;
                    }
                    intent2.putExtra(str14, i2);
                    FinderObject p016 = t1Var.mo76086p0();
                    if (p016 == null || (finderObjectDesc2 = p016.objectDesc) == null || (hb115 = finderObjectDesc2.mvInfo) == null || (kb115 = hb115.f183456e) == null || (lb13 = kb115.f183921x) == null || (str15 = lb13.f184069d) == null) {
                        str15 = "";
                    }
                    intent2.putExtra(str33, str15);
                    FinderObject p017 = t1Var.mo76086p0();
                    if (p017 == null || (finderObjectDesc = p017.objectDesc) == null || (hb114 = finderObjectDesc.mvInfo) == null || (kb114 = hb114.f183456e) == null || (str16 = kb114.f183922y) == null) {
                        str16 = "";
                    }
                    intent2.putExtra(str32, str16);
                    C13598b0 b0Var6 = C13598b0.f38549a;
                    T t233 = new C64719t23();
                    t233.f185459d = C61926c.m72691p(j2);
                    t233.f185460e = feedObject.objectNonceId;
                    t233.f185461f = str3;
                    C58969q l2 = t1Var.mo3507l();
                    t233.f185462g = l2 != null ? l2.getNickname() : null;
                    FinderObjectDesc finderObjectDesc27 = feedObject.objectDesc;
                    t233.f185463h = (finderObjectDesc27 == null || (hb113 = finderObjectDesc27.mvInfo) == null || (kb113 = hb113.f183456e) == null) ? null : kb113.f183905e;
                    t233.f185464i = (finderObjectDesc27 == null || (hb112 = finderObjectDesc27.mvInfo) == null || (kb112 = hb112.f183456e) == null) ? null : kb112.f183911n;
                    t233.f185465j = (finderObjectDesc27 == null || (hb111 = finderObjectDesc27.mvInfo) == null || (kb111 = hb111.f183456e) == null) ? null : kb111.f183916s;
                    t233.f185466n = (finderObjectDesc27 == null || (hb110 = finderObjectDesc27.mvInfo) == null || (kb110 = hb110.f183456e) == null) ? null : kb110.f183913p;
                    t233.f185467o = (finderObjectDesc27 == null || (hb19 = finderObjectDesc27.mvInfo) == null || (kb19 = hb19.f183456e) == null) ? 0 : kb19.f183915r;
                    t233.f185468p = (finderObjectDesc27 == null || (hb18 = finderObjectDesc27.mvInfo) == null || (kb18 = hb18.f183456e) == null) ? null : kb18.f183917t;
                    t233.f185471s = (finderObjectDesc27 == null || (hb17 = finderObjectDesc27.mvInfo) == null || (kb17 = hb17.f183456e) == null || (lb12 = kb17.f183921x) == null) ? null : lb12.f184069d;
                    t233.f185469q = (finderObjectDesc27 == null || (hb16 = finderObjectDesc27.mvInfo) == null || (kb16 = hb16.f183456e) == null) ? 0 : kb16.f183918u;
                    t233.f185473u = (finderObjectDesc27 == null || (hb15 = finderObjectDesc27.mvInfo) == null || (kb15 = hb15.f183456e) == null) ? null : kb15.f183904d;
                    t233.f185474v = (finderObjectDesc27 == null || (hb14 = finderObjectDesc27.mvInfo) == null || (kb14 = hb14.f183456e) == null) ? null : kb14.f183910j;
                    t233.f185475w = (finderObjectDesc27 == null || (hb13 = finderObjectDesc27.mvInfo) == null || (kb13 = hb13.f183456e) == null) ? null : kb13.f183912o;
                    t233.f185470r = (finderObjectDesc27 == null || (hb12 = finderObjectDesc27.mvInfo) == null || (kb12 = hb12.f183456e) == null) ? null : kb12.f183922y;
                    t233.f185472t = str3;
                    f0Var = f0Var2;
                    f0Var.f27484d = t233;
                    str4 = str21;
                    Log.m105924i(str4, "jump to musicMvMainUI");
                    ((C11057v) C39818r.f106831a.mo62444c(finderProfileMusicUIC.getActivity()).mo75002a(cls7)).f32817f = false;
                    ((C58684b) C86312j.m106911c(cls6)).jy0(finderProfileMusicUIC.getContext(), intent2);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null) {
                    Log.m105924i(str4, "jump to musicMvMainUI error " + str3 + ' ' + str39 + ' ' + feedObject.f164794id + ' ' + feedObject.objectNonceId);
                    C13598b0 b0Var7 = C13598b0.f38549a;
                }
                FinderObject p018 = t1Var.mo76086p0();
                if (p018 != null) {
                    FinderProfileMusicUIC finderProfileMusicUIC3 = finderProfileMusicUIC;
                    FinderProfileMusicUIC.m64329c3(finderProfileMusicUIC3, p018);
                    C64488kb1 kb140 = finderProfileMusicUIC3.f160630v;
                    if (kb140 != null) {
                        C65415e0.f188260a.mo89507e(kb140, C61926c.m72691p(p018.f164794id), 13, (C64719t23) f0Var.f27484d);
                        C13598b0 b0Var8 = C13598b0.f38549a;
                    }
                    finderProfileMusicUIC3.f160630v = null;
                    C13598b0 b0Var9 = C13598b0.f38549a;
                }
            }
            C13598b0 b0Var10 = C13598b0.f38549a;
        }
    }
}
