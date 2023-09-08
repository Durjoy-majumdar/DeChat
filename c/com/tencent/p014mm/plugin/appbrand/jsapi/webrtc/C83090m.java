package com.tencent.p014mm.plugin.appbrand.jsapi.webrtc;

import com.tencent.p014mm.libmmwebrtc.MMWebRTCBinding;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import gy3.C87412m;
import org.json.JSONObject;
import org.webrtc.VideoSink;
import p1044ub.C90630c;
import p284zb.C91635f;
import p284zb.C91640i;
import rx3.C13603j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.m */
public final class C83090m {

    /* renamed from: a */
    public static final C83090m f242865a = new C83090m();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.m$a */
    public enum C83091a {
        ErrOk,
        ErrNoWebRTCRuntime,
        ErrWebRTCRuntimeReleased,
        ErrNoMediaStreamTrackId,
        ErrInternal
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webrtc.m$b */
    public enum C83092b {
        AddOrUpdate,
        Remove
    }

    /* renamed from: a */
    public final C83091a mo115333a(JSONObject jSONObject, VideoSink videoSink, C82381f fVar, C83092b bVar) {
        MMWebRTCBinding mMWebRTCBinding;
        C83091a aVar = C83091a.ErrOk;
        C83091a aVar2 = C83091a.ErrInternal;
        C87412m.m108594g(videoSink, "videoSink");
        C87412m.m108594g(fVar, "appBrandComponent");
        C87412m.m108594g(bVar, "opCode");
        if (jSONObject == null) {
            return C83091a.ErrNoMediaStreamTrackId;
        }
        int optInt = jSONObject.optInt("mediaStreamTrackId");
        if (fVar instanceof C91635f) {
            C91640i<? extends C91635f> iVar = ((C91635f) fVar).f262593H;
            synchronized (iVar) {
                mMWebRTCBinding = iVar.f262601g;
            }
        } else if (fVar instanceof C90630c) {
            C91640i<? extends C91635f> iVar2 = ((C90630c) fVar).mo116160O0().f262593H;
            synchronized (iVar2) {
                mMWebRTCBinding = iVar2.f262601g;
            }
        } else {
            mMWebRTCBinding = null;
        }
        if (mMWebRTCBinding == null) {
            return C83091a.ErrNoWebRTCRuntime;
        }
        if (!mMWebRTCBinding.isRunning()) {
            return C83091a.ErrWebRTCRuntimeReleased;
        }
        int ordinal = bVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new C13603j();
            } else if (mMWebRTCBinding.removeStreamFromVideoSink(videoSink, optInt)) {
                return aVar;
            }
        } else if (mMWebRTCBinding.addOrUpdateStreamToVideoSink(videoSink, optInt)) {
            return aVar;
        }
        return aVar2;
    }
}
