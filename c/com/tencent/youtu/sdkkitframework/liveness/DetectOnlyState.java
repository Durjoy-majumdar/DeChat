package com.tencent.youtu.sdkkitframework.liveness;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.youtu.sdkkitframework.common.CommonUtils;
import com.tencent.youtu.sdkkitframework.common.ErrorCode;
import com.tencent.youtu.sdkkitframework.common.FileUtils;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.common.StringCode;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.common.YtSDKStats;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam;
import com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam;
import java.nio.ByteBuffer;
import java.util.HashMap;
import org.json.JSONObject;

public class DetectOnlyState extends YtFSMBaseState {
    private static final String TAG = "DetectOnlyState";
    private boolean isLoadResourceOnline = false;
    private int minFaceSize = 80;
    private boolean needBigFaceMode = false;
    private String resourceDownloadPath = "";

    public void enterFirst() {
    }

    public void loadStateWith(String str, JSONObject jSONObject) {
        super.loadStateWith(str, jSONObject);
        try {
            if (jSONObject.has("resource_online")) {
                this.isLoadResourceOnline = jSONObject.getBoolean("resource_online");
            }
            if (jSONObject.has("resource_download_path")) {
                this.resourceDownloadPath = jSONObject.getString("resource_download_path");
            }
            if (jSONObject.has("need_big_face_mode")) {
                this.needBigFaceMode = jSONObject.getBoolean("need_big_face_mode");
            }
            if (jSONObject.has("min_face_size")) {
                this.minFaceSize = jSONObject.getInt("min_face_size");
            }
        } catch (Exception e) {
            YtLogger.m106579e(TAG, "Failed to parse json:" + e.getLocalizedMessage());
        }
        if (!this.isLoadResourceOnline) {
            FileUtils.loadLibrary("YTFaceTrackPro2");
        }
        Context context = YtFSM.getInstance().getContext().currentAppContext;
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (this.isLoadResourceOnline) {
            absolutePath = this.resourceDownloadPath;
            YtLogger.m106580i(TAG, "Use online path:" + absolutePath);
        } else {
            YtLogger.m106580i(TAG, "Use local path:" + absolutePath);
        }
        String[] strArr = {"net1_18.rpnmodel", "net1_18_bin.rpnproto", "net2_36.rpnmodel", "net2_36_bin.rpnproto"};
        if (!this.isLoadResourceOnline) {
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                AssetManager assets = context.getAssets();
                FileUtils.copyAsset(assets, "FaceTrackModels/detector/" + str2, absolutePath + "/" + str2);
            }
        }
        String[] strArr2 = {"align.rpdm", "align.stb", "align_bin.rpdc", "eye.rpdm", "eye_bin.rpdc"};
        if (!this.isLoadResourceOnline) {
            for (int i2 = 0; i2 < 5; i2++) {
                String str3 = strArr2[i2];
                AssetManager assets2 = context.getAssets();
                FileUtils.copyAsset(assets2, "FaceTrackModels/ufa/" + str3, absolutePath + "/" + str3);
            }
        }
        String[] strArr3 = {"rotBasis.bin"};
        if (!this.isLoadResourceOnline) {
            for (int i3 = 0; i3 < 1; i3++) {
                String str4 = strArr3[i3];
                AssetManager assets3 = context.getAssets();
                FileUtils.copyAsset(assets3, "FaceTrackModels/poseest/" + str4, absolutePath + "/" + str4);
            }
        }
        int GlobalInit = YTFaceTrack.GlobalInit(absolutePath + "/");
        if (GlobalInit != 0) {
            YtSDKStats.getInstance().reportError(GlobalInit, "failed to init face trace sdk");
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>(GlobalInit) {
                public final /* synthetic */ int val$r;

                {
                    this.val$r = r4;
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED));
                    put(StateEvent.Name.MESSAGE, CommonUtils.makeMessageJson(ErrorCode.YT_SDK_FACETRACE_INIT_FAILED, StringCode.MSG_PARAM_ERROR, "检测初始化失败" + r4));
                }
            });
            return;
        }
        YTFaceDetectParam GetFaceDetectParam = YTFaceTrack.getInstance().GetFaceDetectParam();
        String str5 = TAG;
        YtLogger.m106580i(str5, "big face mode" + this.needBigFaceMode);
        GetFaceDetectParam.bigger_face_mode = this.needBigFaceMode;
        GetFaceDetectParam.min_face_size = this.minFaceSize;
        YTFaceTrack.getInstance().SetFaceDetectParam(GetFaceDetectParam);
        YTFaceTrackParam GetFaceTrackParam = YTFaceTrack.getInstance().GetFaceTrackParam();
        GetFaceTrackParam.need_pose_estimate = false;
        GetFaceTrackParam.single_detect_mode = true;
        GetFaceTrackParam.detect_interval = -1;
        YTFaceTrack.getInstance().SetFaceTrackParam(GetFaceTrackParam);
        YtLogger.m106580i(str5, "Detect version:" + YTFaceTrack.Version);
    }

    public void update(byte[] bArr, int i, int i2, int i3, long j) {
        super.update(bArr, i, i2, i3, j);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        Rect[] GetFaceRect = YTFaceTrack.getInstance().GetFaceRect(YTFaceTrack.getInstance().GetYTImageBitmap(createBitmap, 1));
        if (GetFaceRect == null) {
            YtSDKStats.getInstance().reportError(ErrorCode.YT_SDK_PARAM_ERROR, "detecet failed");
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() {
                {
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                    put(StateEvent.Name.UI_TIPS, StringCode.RST_FAILED);
                    put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.FAILED);
                    put(StateEvent.Name.ERROR_CODE, Integer.valueOf(ErrorCode.YT_SDK_PARAM_ERROR));
                    put(StateEvent.Name.MESSAGE, "{\"errorcode\":3145728,\"errormsg\":\"检测失败\"}");
                }
            });
            return;
        }
        String str = "[";
        for (int i4 = 0; i4 < GetFaceRect.length; i4++) {
            Rect rect = GetFaceRect[i4];
            int i5 = rect.left;
            int i6 = rect.top;
            str = str + "{\"rect\":{\"x\":" + i5 + ",\"y\":" + i6 + ",\"w\":" + (rect.right - i5) + ",\"h\":" + (rect.bottom - i6) + "}}";
            if (i4 < GetFaceRect.length - 1) {
                str = str + ",";
            }
        }
        YtSDKStats.getInstance().reportInfo("errorcode: 0, face_count: " + GetFaceRect.length);
        YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>("{\"errorcode\":0,\"errormsg\":\"OK\",\"face_count\":" + GetFaceRect.length + ",\"face_rects\":" + (str + "]") + "}") {
            public final /* synthetic */ String val$message;

            {
                this.val$message = r3;
                put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.PROCESS_FIN);
                put(StateEvent.Name.UI_TIPS, StringCode.RST_SUCCEED);
                put(StateEvent.Name.PROCESS_RESULT, StateEvent.ProcessResult.SUCCEED);
                put(StateEvent.Name.ERROR_CODE, 0);
                put(StateEvent.Name.MESSAGE, r3);
            }
        });
    }
}
