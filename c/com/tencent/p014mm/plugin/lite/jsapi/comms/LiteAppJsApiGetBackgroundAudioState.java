package com.tencent.p014mm.plugin.lite.jsapi.comms;

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
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e00.C7576p0;
import java.util.HashMap;
import org.json.JSONObject;
import qc0.C101093a;
import qc0.C101106m;
import qc0.C12155j;

/* renamed from: com.tencent.mm.plugin.lite.jsapi.comms.LiteAppJsApiGetBackgroundAudioState */
public class LiteAppJsApiGetBackgroundAudioState extends C4770c {

    /* renamed from: g */
    public static int f19818g;

    /* renamed from: h */
    public static final IListener f19819h;

    /* renamed from: i */
    public static final IListener f19820i;

    static {
        C40008f fVar = C40008f.f107254d;
        f19819h = new IListener<LiteAppCloseWindowEvent>(fVar) {
            {
                this.__eventId = 1345568757;
            }

            public boolean callback(IEvent iEvent) {
                LiteAppCloseWindowEvent liteAppCloseWindowEvent = (LiteAppCloseWindowEvent) iEvent;
                LiteAppJsApiGetBackgroundAudioState.f19818g = 0;
                LiteAppJsApiGetBackgroundAudioState.f19820i.dead();
                dead();
                return true;
            }
        };
        f19820i = new IListener<MusicPlayerEvent>(fVar) {
            {
                this.__eventId = -1155728636;
            }

            public boolean callback(IEvent iEvent) {
                MusicPlayerEvent musicPlayerEvent = (MusicPlayerEvent) iEvent;
                if (LiteAppJsApiGetBackgroundAudioState.f19818g != 0) {
                    String str = musicPlayerEvent.f9336d.f9341e;
                    Log.m105925i("LiteAppJsApiGetBackgroundAudioState", "backgroundAudioListener callback in, state:%s", str);
                    MusicPlayerEvent.C1094a aVar = musicPlayerEvent.f9336d;
                    boolean z = aVar.f9342f;
                    int i = (int) (aVar.f9340d / 1000);
                    if (!z) {
                        Log.m105920e("LiteAppJsApiGetBackgroundAudioState", "is not from QQMusicPlayer, don't callback!");
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
                            LiteAppCenter.publishGlobalEventToTopPage((long) LiteAppJsApiGetBackgroundAudioState.f19818g, "onBackgroundAudioStateChange", "[" + jSONObject.toString() + "]");
                        } catch (Exception e) {
                            Log.m105920e("LiteAppJsApiGetBackgroundAudioState", e.getMessage());
                        }
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public void mo5693a(String str, JSONObject jSONObject, boolean z) {
        Log.m105918d("LiteAppJsApiGetBackgroundAudioState", "invoke getBackgroundAudioState");
        C101106m b = C101093a.m132480b();
        C12155j a = C101093a.m132479a();
        int i = 1;
        if (b == null || a == null || a.f35262c == 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("paused", 1);
            this.f19815f.mo5691c(hashMap);
        } else if (TextUtils.isEmpty(b.f295972t) || str.equals(b.f295972t)) {
            int i2 = a.f35260a;
            int i3 = a.f35261b;
            if ("stop".equals(a.f35264e) || i2 < 0 || i3 < 0) {
                Log.m105920e("LiteAppJsApiGetBackgroundAudioState", "return parameter is invalid");
                this.f19815f.mo5689a("fail");
                return;
            }
            f19818g = this.f19814e.f31713a;
            IListener iListener = f19819h;
            iListener.dead();
            iListener.alive();
            IListener iListener2 = f19820i;
            iListener2.dead();
            iListener2.alive();
            int i4 = i2 / 1000;
            int i5 = i3 / 1000;
            int i6 = a.f35262c;
            int i7 = i4 > 0 ? (a.f35263d * i4) / 100 : 0;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("duration", Integer.valueOf(i4));
            hashMap2.put("currentTime", Integer.valueOf(i5));
            if (i6 == 1) {
                i = 0;
            }
            hashMap2.put("paused", Integer.valueOf(i));
            hashMap2.put("src", b.f295966n);
            hashMap2.put("buffered", Integer.valueOf(i7));
            hashMap2.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, b.f295962g);
            hashMap2.put("epname", b.f295964i);
            hashMap2.put("singer", b.f295963h);
            hashMap2.put("coverImgUrl", b.f295965j);
            hashMap2.put("isLive", 0);
            hashMap2.put("startTime", Integer.valueOf(b.f295943D / 1000));
            hashMap2.put("srcId", b.f295944E);
            String str2 = b.f295945F;
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("protocol", str2);
            hashMap2.put("webUrl", b.f295968p);
            hashMap2.put("playState", a.f35264e);
            hashMap2.put("songLyric", b.f295969q);
            hashMap2.put("playbackRate", Double.valueOf(b.f295950K));
            this.f19815f.mo5691c(hashMap2);
        } else {
            this.f19815f.mo5689a("appId is different");
        }
    }
}
