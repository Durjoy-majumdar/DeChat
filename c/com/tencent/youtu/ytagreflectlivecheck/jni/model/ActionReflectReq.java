package com.tencent.youtu.ytagreflectlivecheck.jni.model;

import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;

public class ActionReflectReq {
    public String action_video = null;
    public String app_id = "";
    public String client_version = null;
    public String color_data = "";
    public YTImageInfo compare_image = null;
    public String encode_reflect_data = null;
    public YTImageInfo eye_image = null;
    public YTImageInfo live_image = null;
    public int mode = 0;
    public YTImageInfo mouth_image = null;
    public int platform = 2;
    public ReflectColorData reflect_data = null;
    public String reserve = null;
    public LiveStyleRequester.SeleceData select_data;
    public String session_id = null;
}
