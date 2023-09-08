package ml0;

import android.os.Bundle;
import com.tencent.live2.jsplugin.V2TXJSAdapterConstants;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.math.BigDecimal;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ml0.x */
public class C88781x {
    /* renamed from: a */
    public static Bundle m110845a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = "autoPauseIfOpenNative";
        String str3 = "autoPauseIfNavigate";
        String str4 = "needEvent";
        String str5 = V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE;
        String str6 = "debug";
        Objects.toString(jSONObject);
        String str7 = "needAudioVolume";
        Bundle bundle = new Bundle();
        String str8 = V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE;
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL)) {
                bundle.putString(V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, jSONObject2.getString(V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL));
            }
            str = V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE;
        } catch (JSONException e) {
            str = V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE;
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, e.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("mode")) {
                bundle.putInt("mode", jSONObject2.getInt("mode"));
            }
        } catch (JSONException e2) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "mode", e2.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, jSONObject2.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY));
            }
        } catch (JSONException e3) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, e3.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("muted")) {
                bundle.putBoolean("muted", jSONObject2.getBoolean("muted"));
            }
        } catch (JSONException e4) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "muted", e4.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO, jSONObject2.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO));
            }
        } catch (JSONException e5) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO, e5.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO, jSONObject2.getBoolean(V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO));
            }
        } catch (JSONException e6) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO, e6.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("orientation")) {
                bundle.putString("orientation", jSONObject2.getString("orientation"));
            }
        } catch (JSONException e7) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "orientation", e7.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT)) {
                bundle.putString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, jSONObject2.getString(V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT));
            }
        } catch (JSONException e8) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, e8.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE)) {
                bundle.putFloat(V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE, BigDecimal.valueOf(jSONObject2.getDouble(V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE)).floatValue());
            }
        } catch (JSONException e9) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE, e9.getLocalizedMessage());
        }
        String str9 = str;
        try {
            if (jSONObject2.has(str9)) {
                bundle.putFloat(str9, BigDecimal.valueOf(jSONObject2.getDouble(str9)).floatValue());
            }
        } catch (JSONException e15) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str9, e15.getLocalizedMessage());
        }
        String str10 = str8;
        try {
            if (jSONObject2.has(str10)) {
                bundle.putBoolean(str10, jSONObject2.getBoolean(str10));
            }
        } catch (JSONException e16) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str10, e16.getLocalizedMessage());
        }
        String str11 = str7;
        try {
            if (jSONObject2.has(str11)) {
                bundle.putBoolean(str11, jSONObject2.getBoolean(str11));
            }
        } catch (JSONException e17) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str11, e17.getLocalizedMessage());
        }
        String str12 = str6;
        try {
            if (jSONObject2.has(str12)) {
                bundle.putBoolean(str12, jSONObject2.getBoolean(str12));
            }
        } catch (JSONException e18) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str12, e18.getLocalizedMessage());
        }
        String str13 = str5;
        try {
            if (jSONObject2.has(str13)) {
                bundle.putString(str13, jSONObject2.getString(str13));
            }
        } catch (JSONException e19) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str13, e19.getLocalizedMessage());
        }
        String str14 = str4;
        try {
            if (jSONObject2.has(str14)) {
                bundle.putBoolean(str14, jSONObject2.getBoolean(str14));
            }
        } catch (JSONException e25) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str14, e25.getLocalizedMessage());
        }
        String str15 = str3;
        try {
            if (jSONObject2.has(str15)) {
                bundle.putBoolean(str15, jSONObject2.getBoolean(str15));
            }
        } catch (JSONException e26) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str15, e26.getLocalizedMessage());
        }
        String str16 = str2;
        try {
            if (jSONObject2.has(str16)) {
                bundle.putBoolean(str16, jSONObject2.getBoolean(str16));
            }
        } catch (JSONException e27) {
            Log.m105925i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", str16, e27.getLocalizedMessage());
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m110846b(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = jSONObject;
        String str2 = V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY;
        String str3 = "orientation";
        String str4 = V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE;
        String str5 = V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT;
        String str6 = V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH;
        Objects.toString(jSONObject);
        String str7 = V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE;
        Bundle bundle = new Bundle();
        String str8 = V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE;
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL)) {
                bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, jSONObject2.getString(V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL));
            }
            str = V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR;
        } catch (JSONException e) {
            str = V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR;
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, e.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("mode")) {
                bundle.putInt("mode", jSONObject2.getInt("mode"));
            }
        } catch (JSONException e2) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "mode", e2.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH));
            }
        } catch (JSONException e3) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH, e3.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY)) {
                bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY, jSONObject2.getString(V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY));
            }
        } catch (JSONException e4) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY, e4.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("muted")) {
                bundle.putBoolean("muted", jSONObject2.getBoolean("muted"));
            }
        } catch (JSONException e5) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "muted", e5.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA));
            }
        } catch (JSONException e6) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, e6.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC));
            }
        } catch (JSONException e7) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, e7.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("enableAGC")) {
                bundle.putBoolean("enableAGC", jSONObject2.getBoolean("enableAGC"));
            }
        } catch (JSONException e8) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "enableAGC", e8.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("enableANS")) {
                bundle.putBoolean("enableANS", jSONObject2.getBoolean("enableANS"));
            }
        } catch (JSONException e9) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "enableANS", e9.getLocalizedMessage());
        }
        String str9 = str;
        try {
            if (jSONObject2.has(str9)) {
                bundle.putBoolean(str9, jSONObject2.getBoolean(str9));
            }
        } catch (JSONException e15) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str9, e15.getLocalizedMessage());
        }
        String str10 = str8;
        try {
            if (jSONObject2.has(str10)) {
                bundle.putString(str10, jSONObject2.getString(str10));
            }
        } catch (JSONException e16) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str10, e16.getLocalizedMessage());
        }
        String str11 = str7;
        try {
            if (jSONObject2.has(str11)) {
                bundle.putInt(str11, jSONObject2.getInt(str11));
            }
        } catch (JSONException e17) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str11, e17.getLocalizedMessage());
        }
        String str12 = str6;
        try {
            if (jSONObject2.has(str12)) {
                bundle.putInt(str12, jSONObject2.getInt(str12));
            }
        } catch (JSONException e18) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str12, e18.getLocalizedMessage());
        }
        String str13 = str5;
        try {
            if (jSONObject2.has(str13)) {
                bundle.putInt(str13, jSONObject2.getInt(str13));
            }
        } catch (JSONException e19) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str13, e19.getLocalizedMessage());
        }
        String str14 = str4;
        try {
            if (jSONObject2.has(str14)) {
                bundle.putInt(str14, jSONObject2.getInt(str14));
            }
        } catch (JSONException e25) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str14, e25.getLocalizedMessage());
        }
        String str15 = str3;
        try {
            if (jSONObject2.has(str15)) {
                bundle.putString(str15, jSONObject2.getString(str15));
            }
        } catch (JSONException e26) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str15, e26.getLocalizedMessage());
        }
        String str16 = str2;
        try {
            if (jSONObject2.has(str16)) {
                bundle.putInt(str16, jSONObject2.getInt(str16));
            }
        } catch (JSONException e27) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", str16, e27.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE)) {
                bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, jSONObject2.getString(V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE));
            }
        } catch (JSONException e28) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, e28.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
                bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, jSONObject2.getString(V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE));
            }
        } catch (JSONException e29) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, e29.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS)) {
                bundle.putInt(V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS, jSONObject2.getInt(V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS));
            }
        } catch (JSONException e35) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS, e35.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_ASPECT)) {
                bundle.putInt(V2TXJSAdapterConstants.PUSHER_KEY_ASPECT, jSONObject2.getInt(V2TXJSAdapterConstants.PUSHER_KEY_ASPECT));
            }
        } catch (JSONException e36) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_ASPECT, e36.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE)) {
                bundle.putInt(V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE, jSONObject2.getInt(V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE));
            }
        } catch (JSONException e37) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE, e37.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE)) {
                bundle.putInt(V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE, jSONObject2.getInt(V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE));
            }
        } catch (JSONException e38) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE, e38.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_ZOOM));
            }
        } catch (JSONException e39) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, e39.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("debug")) {
                bundle.putBoolean("debug", jSONObject2.getBoolean("debug"));
            }
        } catch (JSONException e44) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "debug", e44.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_MIRROR));
            }
        } catch (JSONException e45) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_MIRROR, e45.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR));
            }
        } catch (JSONException e46) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR, e46.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR)) {
                bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR, jSONObject2.getString(V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR));
            }
        } catch (JSONException e47) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT)) {
                bundle.putFloat(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT, BigDecimal.valueOf(jSONObject2.getDouble(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT)).floatValue());
            }
        } catch (JSONException e48) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT, e48.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP)) {
                bundle.putFloat(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP, BigDecimal.valueOf(jSONObject2.getDouble(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP)).floatValue());
            }
        } catch (JSONException e49) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP, e49.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH)) {
                bundle.putFloat(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH, BigDecimal.valueOf(jSONObject2.getDouble(V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH)).floatValue());
            }
        } catch (JSONException e54) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH, e54.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION)) {
                bundle.putString(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, jSONObject2.getString(V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION));
            }
        } catch (JSONException e55) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, e55.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT)) {
                bundle.putBoolean(V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT, jSONObject2.getBoolean(V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT));
            }
        } catch (JSONException e56) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT, e56.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has("needAudioVolume")) {
                bundle.putBoolean("needAudioVolume", jSONObject2.getBoolean("needAudioVolume"));
            }
        } catch (JSONException e57) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "needAudioVolume", e57.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE)) {
                bundle.putInt(V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE, jSONObject2.getInt(V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE));
            }
        } catch (JSONException e58) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE, e58.getLocalizedMessage());
        }
        try {
            if (jSONObject2.has(V2TXJSAdapterConstants.PUSHER_KEY_FPS)) {
                bundle.putInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS, jSONObject2.getInt(V2TXJSAdapterConstants.PUSHER_KEY_FPS));
            }
        } catch (JSONException e59) {
            Log.m105925i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", V2TXJSAdapterConstants.PUSHER_KEY_FPS, e59.getLocalizedMessage());
        }
        return bundle;
    }
}
