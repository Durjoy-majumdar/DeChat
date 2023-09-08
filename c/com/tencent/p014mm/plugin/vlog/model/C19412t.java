package com.tencent.p014mm.plugin.vlog.model;

import android.app.Activity;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.Display;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPCodecUtils;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import org.json.JSONArray;
import org.json.JSONObject;
import p213oh.C11412b;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.vlog.model.t */
public final class C19412t extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f54826d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19412t(Activity activity) {
        super(0);
        this.f54826d = activity;
    }

    public Object invoke() {
        boolean z;
        boolean z2;
        boolean z3;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        try {
            Display.HdrCapabilities hdrCapabilities = this.f54826d.getWindowManager().getDefaultDisplay().getHdrCapabilities();
            int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C87412m.m108593f(supportedHdrTypes, "supportHdrTypes");
            for (int put : supportedHdrTypes) {
                jSONArray.put(put);
            }
            jSONObject.put("HDRTypes", jSONArray);
            jSONObject.put("MaxLuminance", Float.valueOf(hdrCapabilities.getDesiredMaxLuminance()));
            jSONObject.put("MinLuminance", Float.valueOf(hdrCapabilities.getDesiredMinLuminance()));
            jSONObject.put("AvgLuminance", Float.valueOf(hdrCapabilities.getDesiredMaxAverageLuminance()));
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null) {
                z3 = false;
                z2 = false;
                z = false;
                for (MediaCodecInfo capabilitiesForType : codecInfos) {
                    try {
                        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = capabilitiesForType.getCapabilitiesForType("video/hevc");
                        if (!(capabilitiesForType2 == null || (codecProfileLevelArr = capabilitiesForType2.profileLevels) == null)) {
                            int length = codecProfileLevelArr.length;
                            int i = 0;
                            while (i < length) {
                                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i];
                                try {
                                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = codecProfileLevelArr;
                                    z3 |= TPCodecUtils.isHDRsupport(2, codecProfileLevel.profile, codecProfileLevel.level);
                                    z2 |= TPCodecUtils.isHDRsupport(0, codecProfileLevel.profile, codecProfileLevel.level);
                                    z |= TPCodecUtils.isHDRsupport(1, codecProfileLevel.profile, codecProfileLevel.level);
                                    i++;
                                    codecProfileLevelArr = codecProfileLevelArr2;
                                } catch (Exception e) {
                                    e = e;
                                    int i2 = C11412b.f33577a;
                                    Log.printErrStackTrace("MicroMsg.HDRUtil", e, "", new Object[0]);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        int i25 = C11412b.f33577a;
                        Log.printErrStackTrace("MicroMsg.HDRUtil", e, "", new Object[0]);
                    }
                }
            } else {
                z3 = false;
                z2 = false;
                z = false;
            }
            jSONObject.put("isSupportDolbyHDR", z3);
            jSONObject.put("isSupportHDR10", z2);
            jSONObject.put("isSupportHDR10Plus", z);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "json.toString()");
            C30520u.f82231b = C112551y.m153814n(jSONObject2, ",", ";", false);
        } catch (Exception e3) {
            int i3 = C11412b.f33577a;
            Log.printErrStackTrace("MicroMsg.HDRUtil", e3, "", new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
