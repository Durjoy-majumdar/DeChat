package com.tencent.p014mm.plugin.lite.jsapi.comms;

import a70.C112760b;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.LiteAppCloseWindowEvent;
import com.tencent.p014mm.autogen.events.MusicPlayerEvent;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import com.tencent.p014mm.plugin.lite.api.C4770c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e00.C7572d0;
import e00.C7576p0;
import f12.C7970a;
import ke3.C88144b;
import org.json.JSONObject;
import p652pu.C100910b;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C62602o;
import qc0.C89588n;
import te3.C64719t23;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiSetBackgroundAudioStateMV */
public class LiteAppJsApiSetBackgroundAudioStateMV extends C4770c {

    /* renamed from: g */
    public static int f19821g;

    /* renamed from: h */
    public static final IListener f19822h;

    /* renamed from: i */
    public static final IListener f19823i;

    static {
        C40008f fVar = C40008f.f107254d;
        f19822h = new IListener<LiteAppCloseWindowEvent>(fVar) {
            {
                this.__eventId = 1345568757;
            }

            public boolean callback(IEvent iEvent) {
                LiteAppCloseWindowEvent liteAppCloseWindowEvent = (LiteAppCloseWindowEvent) iEvent;
                LiteAppJsApiSetBackgroundAudioStateMV.f19821g = 0;
                LiteAppJsApiSetBackgroundAudioStateMV.f19823i.dead();
                dead();
                return true;
            }
        };
        f19823i = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                if (LiteAppJsApiSetBackgroundAudioStateMV.f19821g != 0) {
                    String str = musicPlayerEvent.f9336d.f9341e;
                    Log.m105925i("LiteAppJsApidoSetBackgroundAudioStateMV", "backgroundAudioListener callback in, state:%s", str);
                    MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
                    boolean z = aVar.f9342f;
                    int i = (int) (aVar.f9340d / 1000);
                    if (!z) {
                        Log.m105920e("LiteAppJsApidoSetBackgroundAudioStateMV", "is not from QQMusicPlayer, don't callback!");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("state", str);
                            jSONObject.put("duration", i);
                            C101106m mVar = musicPlayerEvent.f9336d.f9338b;
                            if (mVar != null) {
                                jSONObject.put("src", mVar.f295966n);
                                jSONObject.put("srcId", musicPlayerEvent.f9336d.f9338b.f295944E);
                            }
                            jSONObject.put("errCode", musicPlayerEvent.f9336d.f9345i);
                            String str2 = "";
                            if (!TextUtils.isEmpty(musicPlayerEvent.f9336d.f9346j)) {
                                str2 = musicPlayerEvent.f9336d.f9346j;
                            }
                            jSONObject.put("errMsg", str2);
                            C101106m b = C101093a.m132480b();
                            if (b != null) {
                                String ms02 = ((C7576p0) C86312j.m106911c(C7576p0.class)).ms0(b.f295960e);
                                if (!Util.isNullOrNil(ms02)) {
                                    jSONObject.put("audioId", ms02);
                                }
                            }
                            LiteAppCenter.publishGlobalEventToTopPage((long) LiteAppJsApiSetBackgroundAudioStateMV.f19821g, "onBackgroundAudioStateChange", "[" + jSONObject.toString() + "]");
                        } catch (Exception e) {
                            Log.m105920e("LiteAppJsApidoSetBackgroundAudioStateMV", e.getMessage());
                        }
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        boolean z2;
        int i;
        JSONObject jSONObject2 = jSONObject;
        Log.m105918d("LiteAppJsApidoSetBackgroundAudioStateMV", "invoke setBackgroundAudioStateMV");
        if (jSONObject2 == null) {
            this.f19815f.mo5689a("param is null");
            return;
        }
        f19821g = this.f19814e.f31713a;
        Log.m105924i("LiteAppJsApidoSetBackgroundAudioStateMV", "appUuid: " + f19821g);
        IListener iListener = f19823i;
        iListener.dead();
        iListener.alive();
        IListener iListener2 = f19822h;
        iListener2.dead();
        iListener2.alive();
        String optString = jSONObject2.optString("url");
        String Et0 = !Util.isNullOrNil(optString) ? ((C7572d0) C86312j.m106911c(C7572d0.class)).Et0(optString) : null;
        String optString2 = jSONObject2.optString("src");
        String optString3 = jSONObject2.optString("lowbandSrc");
        String optString4 = jSONObject2.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        String optString5 = jSONObject2.optString("epname");
        String optString6 = jSONObject2.optString("singer");
        String optString7 = jSONObject2.optString("coverImgUrl");
        String optString8 = jSONObject2.optString("webUrl");
        int i2 = Util.getInt(jSONObject2.optString("startTime"), 0);
        String optString9 = jSONObject2.optString("srcId");
        String optString10 = jSONObject2.optString("protocol");
        String optString11 = jSONObject2.optString("musicbar_url");
        String optString12 = jSONObject2.optString("songLyric");
        String str2 = optString9;
        String optString13 = jSONObject2.optString("src_username");
        String str3 = optString5;
        String str4 = optString10;
        int i3 = Util.getInt(jSONObject2.optString("needStartMusicUI"), 0);
        double d = 1.0d;
        double d2 = Util.getDouble(jSONObject2.optString("playbackRate"), 1.0d);
        int i4 = i2;
        String str5 = optString8;
        double d3 = Util.getDouble(jSONObject2.optString("volume"), 1.0d);
        if (d2 >= 0.5d && d2 <= 2.0d) {
            d = d2;
        }
        String str6 = Et0;
        if (TextUtils.isEmpty(optString12)) {
            Log.m105920e("LiteAppJsApidoSetBackgroundAudioStateMV", "songLyric is empty");
        } else {
            Log.m105925i("LiteAppJsApidoSetBackgroundAudioStateMV", "songLyric: %s", optString12);
        }
        String str7 = optString7 == null ? "" : optString7;
        String optString14 = jSONObject2.optString("mid");
        String optString15 = jSONObject2.optString("mvMusicGenre");
        String str8 = optString3;
        String optString16 = jSONObject2.optString("mvIdentification");
        String str9 = "";
        double d4 = d3;
        long j = Util.getLong(jSONObject2.optString("mvIssueDate"), 0);
        long j2 = Util.getLong(jSONObject2.optString("mvDuration"), 0);
        String optString17 = jSONObject2.optString(TPReportKeys.LiveExKeys.LIVE_EX_EXTRA_INFO);
        String str10 = optString12;
        String optString18 = jSONObject2.optString("mvObjectId");
        String optString19 = jSONObject2.optString("mvNonceId");
        String optString20 = jSONObject2.optString("mvCoverUrl");
        String optString21 = jSONObject2.optString("mvMakerFinderNickname");
        String optString22 = jSONObject2.optString("musicOperationUrl");
        String optString23 = jSONObject2.optString("sceneNote");
        String optString24 = jSONObject2.optString("musicAppId");
        Object[] objArr = {optString2, optString4, optString6, str7, str5, Integer.valueOf(i4), str4, optString11, Double.valueOf(d), Double.valueOf(d4)};
        String str11 = optString11;
        String str12 = "LiteAppJsApidoSetBackgroundAudioStateMV";
        Log.m105925i(str12, "src : %s, title : %s, singer : %s, coverImgUrl : %s, webUrl : %s, startTime:%d, protocol:%s, musicbar_url:%s, playbackRate:%f, volume:%f", objArr);
        Log.m105925i(str12, "genre:%s, identification:%s, issueDate:%d, duration:%d, extraInfo:%s, mvObjectId:%s, mvNonceId:%s, mvCoverUrl:%s, mvMakerFinderNickname:%s, sceneNote:%s, musicAppId:%s", optString15, optString16, Long.valueOf(j), Long.valueOf(j2), optString17, optString18, optString19, optString20, optString21, optString23, optString24);
        if (Util.isNullOrNil(optString2) || Util.isNullOrNil(optString4)) {
            Log.m105920e(str12, "setBackgroundAudioStateMv fail, src or title is null");
            this.f19815f.mo5689a("setBackgroundAudioStateMv:fail, src or title is null");
        } else if (str10 == null || str10.length() <= 32768) {
            StringBuilder sb = new StringBuilder();
            String str13 = optString15;
            String str14 = str9;
            sb.append(str14);
            double d5 = d;
            sb.append(optString2.hashCode());
            String sb4 = sb.toString();
            String str15 = str14;
            String str16 = str4;
            String str17 = optString17;
            long j3 = j2;
            String str18 = optString16;
            String str19 = sb4;
            String str20 = optString22;
            String str21 = optString23;
            String str22 = str3;
            C101106m a = C89588n.m112021a(10, str7, optString4, optString6, str5, str8, optString2, str14 + optString2.hashCode(), C112760b.m154195C(), C7970a.m8127a() + str7.hashCode(), str22, str);
            a.f295942C = str6;
            a.f295943D = i4 * 1000;
            a.f295944E = str2;
            a.f295945F = str16;
            a.f295947H = str11;
            String str23 = str10;
            a.f295969q = str23;
            a.f295948I = optString13;
            a.f295950K = d5;
            a.f295951L = (float) d4;
            String str24 = optString14;
            a.f295954P = str24;
            C64719t23 t232 = new C64719t23();
            String str25 = optString18;
            t232.f185459d = str25;
            String str26 = optString19;
            t232.f185460e = str26;
            String str27 = optString20;
            t232.f185461f = str27;
            String str28 = optString21;
            t232.f185462g = str28;
            t232.f185473u = optString4;
            String str29 = optString6;
            t232.f185463h = str29;
            String str30 = str7;
            t232.f185475w = str30;
            String str31 = str22;
            t232.f185464i = str31;
            t232.f185467o = j;
            long j4 = j;
            int i5 = (int) j3;
            t232.f185469q = i5;
            String str32 = str18;
            t232.f185468p = str32;
            long j5 = j4;
            String str33 = str17;
            t232.f185465j = str33;
            t232.f185474v = str23;
            int i6 = i5;
            String str34 = str13;
            t232.f185466n = str34;
            t232.f185470r = str24;
            t232.f185472t = str30;
            String str35 = str24;
            ((C100910b) C86312j.m106911c(C100910b.class)).mo139950z5(a, C62602o.m73561a(str19, t232));
            if (!a.mo140556b(C101093a.m132480b()) || !C101093a.m132481c()) {
                i = 1;
                z2 = false;
            } else {
                i = 1;
                z2 = true;
            }
            Object[] objArr2 = new Object[i];
            objArr2[0] = Integer.valueOf(i3);
            Log.m105925i(str12, "needStartMusicUI :%d", objArr2);
            if (!z2) {
                Log.m105924i(str12, "play the music");
                C101093a.m132488j(a);
                int i7 = i3;
                if (i7 == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("key_scene", 8);
                    C88144b.m109791i(MMApplicationContext.getContext(), "music", ".ui.MusicMainUI", intent, (Bundle) null);
                } else if (i7 == 2) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_mv_song_name", optString4);
                    intent2.putExtra("key_mv_song_lyric", str23);
                    intent2.putExtra("key_mv_album_cover_url", str30);
                    intent2.putExtra("key_mv_feed_id", str25);
                    intent2.putExtra("key_mv_nonce_id", str26);
                    intent2.putExtra("key_mv_cover_url", str27);
                    intent2.putExtra("key_mv_poster", str28);
                    intent2.putExtra("key_mv_singer_name", str29);
                    intent2.putExtra("key_mv_album_name", str31);
                    intent2.putExtra("key_mv_music_genre", str34);
                    intent2.putExtra("key_mv_issue_date", j5 + str15);
                    intent2.putExtra("key_mv_identification", str32);
                    intent2.putExtra("key_mv_extra_info", str33);
                    intent2.putExtra("key_mv_music_duration", i6);
                    intent2.putExtra("key_mv_music_operation_url", str20);
                    intent2.putExtra("key_mv_song_mid", str35);
                    intent2.putExtra("key_mv_scene_note", str21);
                    intent2.setFlags(268435456);
                    C88144b.m109791i(MMApplicationContext.getContext(), "mv", ".ui.MusicMvMainUI", intent2, (Bundle) null);
                }
            } else {
                Log.m105924i(str12, "The same music is playing");
                C101093a.m132491m(a);
            }
            Log.m105924i(str12, "setBackgroundAudioStateMV ok");
            this.f19815f.mo5690b();
        } else {
            Log.m105920e(str12, "setBackgroundAudioState fail, songLyric is too long");
            this.f19815f.mo5689a("setBackgroundAudioStateMv:fail, songLyric is too long");
        }
    }
}
