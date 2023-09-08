package zt1;

import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetectlight.Utils.YTAGFaceReflectForWXJNIInterface;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zt1.h */
public class C119139h {
    /* renamed from: a */
    public static byte[] m168004a(String str, byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        String faceMd5 = YTAGFaceReflectForWXJNIInterface.faceMd5(bArr, (long) bArr.length);
        jSONObject.put("face_lib_version", 3);
        jSONObject.put("md5", faceMd5);
        Log.m105925i("MicroMsg.FaceFlashDataUtil", "getBioHeader md5:%s", faceMd5);
        String jSONObject2 = jSONObject.toString();
        return YTAGFaceReflectForWXJNIInterface.encrypt(str, jSONObject2, (long) jSONObject2.getBytes().length);
    }

    /* renamed from: b */
    public static byte[] m168005b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("livedata");
        jSONObject2.put("time_point_list", new JSONArray());
        JSONArray jSONArray = jSONObject2.getJSONArray("frames");
        jSONObject2.remove("frames");
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("face_image", jSONObject3.get("image"));
            JSONArray jSONArray3 = jSONObject3.getJSONArray("x_coordinates");
            JSONArray jSONArray4 = jSONObject3.getJSONArray("y_coordinates");
            JSONArray jSONArray5 = new JSONArray();
            for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("x", jSONArray3.get(i2));
                jSONObject5.put("y", jSONArray4.get(i2));
                jSONArray5.put(jSONObject5);
            }
            jSONObject4.put("coordinate_list", jSONArray5);
            jSONArray2.put(jSONObject4);
        }
        jSONObject2.put("face_live_pic_list_new", jSONArray2);
        if (jSONObject2.has("select_data")) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("select_data", jSONObject2.optJSONObject("select_data").toString());
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("onetwinkle_data", jSONObject6);
            jSONObject2.put("livedata", jSONObject7);
        }
        String string = jSONArray.getJSONObject(0).getString("image");
        String string2 = jSONObject2.getString("mouth_lip_reading");
        JSONArray jSONArray6 = new JSONArray();
        JSONObject jSONObject8 = new JSONObject();
        jSONObject8.put("face_image", FaceProNative.addVerifyData2Jpg(str, string2, string));
        jSONObject8.put("coordinate_list", jSONArray2.getJSONObject(0).get("coordinate_list"));
        jSONArray6.put(jSONObject8);
        jSONObject2.put("face_frame_list", jSONArray6);
        String jSONObject9 = jSONObject2.toString();
        return YTAGFaceReflectForWXJNIInterface.encrypt(str, jSONObject9, (long) jSONObject9.getBytes().length);
    }

    /* renamed from: c */
    public static JSONObject m168006c(String str, String str2, String str3, String str4, int i, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("app_id", str2);
        jSONObject3.put("business_name", str3);
        jSONObject3.put("person_id", str4);
        jSONObject3.put(TPReportKeys.LiveExKeys.LIVE_EX_LIVE_TYPE, i);
        jSONObject3.put("req_type", WeChatBrands.Business.GROUP_LIVE);
        JSONObject jSONObject4 = new JSONObject();
        if (i == 2) {
            jSONObject2 = jSONObject.getJSONObject("livedata");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                Log.m105920e("MicroMsg.FaceFlashManagerError", "LIVE_REFLECTION does not have livedata");
            }
            if (jSONObject2.has("select_data")) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("select_data", jSONObject2.optJSONObject("select_data").toString());
                jSONObject2.put("onetwinkle_data", jSONObject5);
            }
        } else if (i != 3) {
            jSONObject2 = new JSONObject();
        } else {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("reflect_data", jSONObject.optJSONObject("reflect_data"));
            jSONObject6.put("color_data", jSONObject.optString("color_data"));
            jSONObject6.put("platform", 2);
            jSONObject4.put("live_image", jSONObject.optJSONObject("live_image"));
            jSONObject4.put("eye_image", jSONObject.optJSONObject("eye_image"));
            jSONObject4.put("mouth_image", jSONObject.optJSONObject("mouth_image"));
            jSONObject4.put("action_video", jSONObject.getString("action_video"));
            jSONObject4.put("select_data", jSONObject.optJSONObject("select_data").toString());
            jSONObject4.put("action_str", jSONObject.optString("action_str", ""));
            jSONObject4.put("check_conf", jSONObject.optJSONObject("check_conf"));
            jSONObject4.put("mode", jSONObject.optInt("mode"));
            jSONObject6.put("onetwinkle_data", jSONObject4);
            jSONObject2 = jSONObject6;
        }
        jSONObject3.put("livedata", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject7 = new JSONObject();
        int i2 = 0;
        if (i == 2) {
            jSONObject7.put("face_image", YTAGFaceReflectForWXJNIInterface.verifyDataToJpg(str, jSONObject.getJSONObject("livedata").getJSONArray("frames").getJSONObject(0).getString("image")));
            JSONArray jSONArray2 = new JSONArray();
            for (int i3 = 0; i3 < 90; i3 = i3 + 1 + 1) {
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put("x", 0);
                jSONObject8.put("y", 0);
                jSONArray2.put(jSONObject8);
            }
            jSONObject7.put("coordinate_list", jSONArray2);
        } else if (i == 3) {
            jSONObject7.put("face_image", YTAGFaceReflectForWXJNIInterface.verifyDataToJpg(str, jSONObject.getJSONObject("live_image").getString("image")));
            JSONArray jSONArray3 = jSONObject.getJSONObject("live_image").getJSONArray("five_points");
            JSONArray jSONArray4 = new JSONArray();
            while (i2 < jSONArray3.length()) {
                JSONObject jSONObject9 = new JSONObject();
                jSONObject9.put("x", (double) Util.getFloat(String.valueOf(jSONArray3.get(i2)), 0.0f));
                int i4 = i2 + 1;
                jSONObject9.put("y", (double) Util.getFloat(String.valueOf(jSONArray3.get(i4)), 0.0f));
                jSONArray4.put(jSONObject9);
                i2 = i4 + 1;
            }
            jSONObject7.put("coordinate_list", jSONArray4);
        }
        jSONArray.put(jSONObject7);
        jSONObject3.put("face_frame_list", jSONArray);
        return jSONObject3;
    }
}
