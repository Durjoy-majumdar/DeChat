package com.tencent.thumbplayer.tplayer;

import android.os.ParcelFileDescriptor;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.TPVideoInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import java.util.Map;

class TPThreadSwitchCommons {

    public static class TPAudioTrackSourceParams {
        public TPDownloadParamData dlParamData;
        public String name;
        public String url;
    }

    public static class TPDataSourceParams {
        public Map<String, String> httpHeader;
        public ITPMediaAsset mediaAsset;
        public ParcelFileDescriptor pfd;
        public String url;
    }

    public static class TPDrmPropertyParams {
        public String propertyName;
        public String value;
    }

    public static class TPLoopbackParams {
        public boolean isLoopback;
        public long loopEndPositionMs = -1;
        public long loopStartPositionMs = 0;
    }

    public static class TPOnPlayCallBackParams {
        public Object ext1;
        public Object ext2;
        public Object ext3;
        public Object ext4;
        public int messageType;
    }

    public static class TPOnReadDataParams {
        public int fileId;
        public String fileKey;
        public long length;
        public long offset;
    }

    public static class TPOnStartReadDataParams {
        public int fileId;
        public String fileKey;
        public long requestEnd;
        public long requestStart;
    }

    public static class TPProgramInfoResult {
        public TPProgramInfo[] programInfos;

        public void reset() {
            this.programInfos = null;
        }
    }

    public static class TPSubTitleParams {
        public TPDownloadParamData downloadParamData;
        public String mimeType;
        public String name;
        public String url;
    }

    public static class TPSwitchCommonParams {
        public long arg1;
        public long arg2;
        public Object extraObject;
    }

    public static class TPSwitchDefParams {
        public long defID;
        public ITPMediaAsset mediaAsset;
        public int mode;
        public String url;
        public TPVideoInfo videoInfo;
    }

    public static class TPTrackInfoResult {
        public TPTrackInfo[] trackInfos;

        public void reset() {
            this.trackInfos = null;
        }
    }

    public static class TPVideoCaptureParams {
        public TPCaptureCallBack callBack;
        public TPCaptureParams params;
    }

    public static class TPVideoSizeResult {
        public int height;
        public int width;

        public void resetHeight() {
            this.height = 0;
        }

        public void resetWidth() {
            this.width = 0;
        }
    }
}
