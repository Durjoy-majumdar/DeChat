package com.tencent.thumbplayer.datatransport;

import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.util.Map;

public class TPPlayProxyListenerEmptyImpl implements ITPPlayListener, ITPPreloadProxy.IPreloadListener {
    private String tag;

    public TPPlayProxyListenerEmptyImpl(String str) {
        this.tag = str;
    }

    public long getAdvRemainTime() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , getAdvRemainTime");
        return 0;
    }

    public String getContentType(int i, String str) {
        return null;
    }

    public int getCurrentPlayClipNo() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , getCurrentPlayClipNo");
        return 0;
    }

    public long getCurrentPlayOffset() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , getCurrentPlayOffset");
        return -1;
    }

    public long getCurrentPosition() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , getCurrentPosition");
        return 0;
    }

    public String getDataFilePath(int i, String str) {
        return null;
    }

    public long getDataTotalSize(int i, String str) {
        return 0;
    }

    public Object getPlayInfo(long j) {
        String str = this.tag;
        TPLogUtil.m21897i(str, " empty proxy player listener , notify , getPlayInfo with type : " + j);
        return null;
    }

    public long getPlayerBufferLength() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , getPlayerBufferLength");
        return 0;
    }

    public void onDownloadCdnUrlExpired(Map<String, String> map) {
    }

    public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
    }

    public void onDownloadCdnUrlUpdate(String str) {
    }

    public void onDownloadError(int i, int i2, String str) {
    }

    public void onDownloadFinish() {
    }

    public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
        String str2 = this.tag;
        TPLogUtil.m21897i(str2, " empty proxy player listener , notify , onPlayProgress, current : " + j + ", total : " + j2);
    }

    public void onDownloadProtocolUpdate(String str, String str2) {
    }

    public void onDownloadStatusUpdate(int i) {
    }

    public Object onPlayCallback(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        String str = this.tag;
        TPLogUtil.m21897i(str, " empty proxy player listener , notify , onPlayCallback, messageType : " + i + ",ext1:" + obj + ",ext2:" + obj2 + ",ext3" + obj3 + ",ext4" + obj4);
        return null;
    }

    public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2) {
    }

    public void onPrepareError() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , onPrepareError : ");
    }

    public void onPrepareSuccess() {
        TPLogUtil.m21897i(this.tag, " empty proxy player listener , notify , onPrepareSuccess : ");
    }

    public int onReadData(int i, String str, long j, long j2) {
        return 0;
    }

    public int onStartReadData(int i, String str, long j, long j2) {
        return 0;
    }

    public int onStopReadData(int i, String str, int i2) {
        return 0;
    }

    public Object getPlayInfo(String str) {
        String str2 = this.tag;
        TPLogUtil.m21897i(str2, " empty proxy player listener , notify , getPlayInfo with key : " + str);
        return null;
    }
}
