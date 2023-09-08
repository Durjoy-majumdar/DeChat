package com.tencent.p014mm.hardcoder;

import com.tencent.p014mm.hardcoder.C17776i;
import com.tencent.p014mm.hardcoder.C17778l;
import di3.C7335d;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNI */
public interface WXHardCoderJNI extends C7335d {
    boolean getDebug();

    boolean getEnable();

    boolean getHCKVPerReport();

    long getHcAlbumScrollAction();

    int getHcAlbumScrollCPU();

    int getHcAlbumScrollDelay();

    boolean getHcAlbumScrollEnable();

    int getHcAlbumScrollIO();

    boolean getHcAlbumScrollThr();

    int getHcAlbumScrollTimeout();

    int getHcBeginTimeHour();

    int getHcBeginTimeMin();

    boolean getHcBgEnable();

    long getHcBizAction();

    int getHcBizCPU();

    int getHcBizDelay();

    boolean getHcBizEnable();

    int getHcBizIO();

    boolean getHcBizThr();

    int getHcBizTimeout();

    long getHcBootAction();

    int getHcBootCPU();

    int getHcBootDelay();

    boolean getHcBootEnable();

    int getHcBootIO();

    boolean getHcBootThr();

    int getHcBootTimeout();

    long getHcDBActionQuery();

    long getHcDBActionWrite();

    int getHcDBCPU();

    int getHcDBDelayQuery();

    int getHcDBDelayWrite();

    boolean getHcDBEnable();

    int getHcDBIO();

    boolean getHcDBThr();

    int getHcDBTimeout();

    int getHcDBTimeoutBusy();

    long getHcDecodePicAction();

    int getHcDecodePicCPU();

    int getHcDecodePicDelay();

    boolean getHcDecodePicEnable();

    int getHcDecodePicIO();

    boolean getHcDecodePicThr();

    int getHcDecodePicTimeout();

    long getHcEncodeVideoAction();

    int getHcEncodeVideoCPU();

    int getHcEncodeVideoDelay();

    boolean getHcEncodeVideoEnable();

    int getHcEncodeVideoIO();

    boolean getHcEncodeVideoThr();

    int getHcEncodeVideoTimeout();

    int getHcEndTimeHour();

    int getHcEndTimeMin();

    long getHcEnterChattingAction();

    int getHcEnterChattingCPU();

    int getHcEnterChattingDelay();

    boolean getHcEnterChattingEnable();

    int getHcEnterChattingIO();

    boolean getHcEnterChattingThr();

    int getHcEnterChattingTimeout();

    long getHcGifAction();

    int getHcGifCPU();

    int getHcGifDelay();

    boolean getHcGifEnable();

    long getHcGifFrameAction();

    int getHcGifFrameCPU();

    int getHcGifFrameDelay();

    boolean getHcGifFrameEnable();

    int getHcGifFrameIO();

    boolean getHcGifFrameThr();

    int getHcGifFrameTimeout();

    int getHcGifIO();

    boolean getHcGifThr();

    int getHcGifTimeout();

    boolean getHcKVFtReport();

    boolean getHcKVPerReport();

    long getHcMediaGalleryScrollAction();

    int getHcMediaGalleryScrollCPU();

    int getHcMediaGalleryScrollDelay();

    boolean getHcMediaGalleryScrollEnable();

    int getHcMediaGalleryScrollIO();

    boolean getHcMediaGalleryScrollThr();

    int getHcMediaGalleryScrollTimeout();

    long getHcMiniProgramLaunchAction();

    int getHcMiniProgramLaunchCPU();

    int getHcMiniProgramLaunchDelay();

    boolean getHcMiniProgramLaunchEnable();

    int getHcMiniProgramLaunchIO();

    boolean getHcMiniProgramLaunchThr();

    int getHcMiniProgramLaunchTimeout();

    long getHcQuitChattingAction();

    int getHcQuitChattingCPU();

    int getHcQuitChattingDelay();

    boolean getHcQuitChattingEnable();

    int getHcQuitChattingIO();

    boolean getHcQuitChattingThr();

    int getHcQuitChattingTimeout();

    long getHcReceiveMsgAction();

    int getHcReceiveMsgCPU();

    int getHcReceiveMsgDelay();

    boolean getHcReceiveMsgEnable();

    int getHcReceiveMsgIO();

    boolean getHcReceiveMsgThr();

    int getHcReceiveMsgTimeout();

    int getHcRetryInterval();

    long getHcSNSMsgScrollAction();

    int getHcSNSMsgScrollCPU();

    int getHcSNSMsgScrollDelay();

    boolean getHcSNSMsgScrollEnable();

    int getHcSNSMsgScrollIO();

    boolean getHcSNSMsgScrollThr();

    int getHcSNSMsgScrollTimeout();

    long getHcSNSScrollAction();

    int getHcSNSScrollCPU();

    int getHcSNSScrollDelay();

    boolean getHcSNSScrollEnable();

    int getHcSNSScrollIO();

    boolean getHcSNSScrollThr();

    int getHcSNSScrollTimeout();

    long getHcSNSUserScrollAction();

    int getHcSNSUserScrollCPU();

    int getHcSNSUserScrollDelay();

    boolean getHcSNSUserScrollEnable();

    int getHcSNSUserScrollIO();

    boolean getHcSNSUserScrollThr();

    int getHcSNSUserScrollTimeout();

    long getHcSendMsgAction();

    int getHcSendMsgCPU();

    int getHcSendMsgDelay();

    boolean getHcSendMsgEnable();

    int getHcSendMsgIO();

    boolean getHcSendMsgThr();

    int getHcSendMsgTimeout();

    long getHcSendPicMsgAction();

    int getHcSendPicMsgCPU();

    int getHcSendPicMsgDelay();

    boolean getHcSendPicMsgEnable();

    int getHcSendPicMsgIO();

    boolean getHcSendPicMsgThr();

    int getHcSendPicMsgTimeout();

    boolean getHcTimeLimit();

    int getHcTimeoutMargin();

    int getHcUinHash();

    long getHcUpdateChatroomAction();

    int getHcUpdateChatroomCPU();

    int getHcUpdateChatroomDelay();

    boolean getHcUpdateChatroomEnable();

    int getHcUpdateChatroomIO();

    long getHcUpdateChatroomMemberCount();

    boolean getHcUpdateChatroomThr();

    int getHcUpdateChatroomTimeout();

    long getParameters(int i, C104630a aVar, JSONObject jSONObject);

    long getParameters(int i, C104630a aVar, String... strArr);

    int initHardCoder(C17776i.C17777a aVar, C17778l.C17779a aVar2, C104631d dVar);

    boolean isCheckEnv();

    boolean isHCEnable();

    int isRunning();

    String readServerAddr(boolean z);

    int registerGetParametersCallback(int i, C104630a aVar, String... strArr);

    long registerSystemEventCallback(C104633j jVar);

    void reloadSPConfig(int i);

    void reportFPS(int i, long j, int i2, long j2, long j3);

    void reportIDKey(boolean z, int i, int i2, boolean z2);

    void setDebug(boolean z);

    void setHcAlbumScrollAction(long j);

    void setHcAlbumScrollCPU(int i);

    void setHcAlbumScrollDelay(int i);

    void setHcAlbumScrollEnable(boolean z);

    void setHcAlbumScrollIO(int i);

    void setHcAlbumScrollThr(boolean z);

    void setHcAlbumScrollTimeout(int i);

    void setHcBeginTimeHour(int i);

    void setHcBeginTimeMin(int i);

    void setHcBgEnable(boolean z);

    void setHcBizAction(long j);

    void setHcBizCPU(int i);

    void setHcBizDelay(int i);

    void setHcBizEnable(boolean z);

    void setHcBizIO(int i);

    void setHcBizThr(boolean z);

    void setHcBizTimeout(int i);

    void setHcBootAction(long j);

    void setHcBootCPU(int i);

    void setHcBootDelay(int i);

    void setHcBootEnable(boolean z);

    void setHcBootIO(int i);

    void setHcBootThr(boolean z);

    void setHcBootTimeout(int i);

    void setHcDBActionQuery(long j);

    void setHcDBActionWrite(long j);

    void setHcDBCPU(int i);

    void setHcDBDelayQuery(int i);

    void setHcDBDelayWrite(int i);

    void setHcDBEnable(boolean z);

    void setHcDBIO(int i);

    void setHcDBThr(boolean z);

    void setHcDBTimeout(int i);

    void setHcDBTimeoutBusy(int i);

    void setHcDecodePicAction(long j);

    void setHcDecodePicCPU(int i);

    void setHcDecodePicDelay(int i);

    void setHcDecodePicEnable(boolean z);

    void setHcDecodePicIO(int i);

    void setHcDecodePicThr(boolean z);

    void setHcDecodePicTimeout(int i);

    void setHcEnable(boolean z);

    void setHcEncodeVideoAction(long j);

    void setHcEncodeVideoCPU(int i);

    void setHcEncodeVideoDelay(int i);

    void setHcEncodeVideoEnable(boolean z);

    void setHcEncodeVideoIO(int i);

    void setHcEncodeVideoThr(boolean z);

    void setHcEncodeVideoTimeout(int i);

    void setHcEndTimeHour(int i);

    void setHcEndTimeMin(int i);

    void setHcEnterChattingAction(long j);

    void setHcEnterChattingCPU(int i);

    void setHcEnterChattingDelay(int i);

    void setHcEnterChattingEnable(boolean z);

    void setHcEnterChattingIO(int i);

    void setHcEnterChattingThr(boolean z);

    void setHcEnterChattingTimeout(int i);

    void setHcGifAction(long j);

    void setHcGifCPU(int i);

    void setHcGifDelay(int i);

    void setHcGifEnable(boolean z);

    void setHcGifFrameAction(long j);

    void setHcGifFrameCPU(int i);

    void setHcGifFrameDelay(int i);

    void setHcGifFrameEnable(boolean z);

    void setHcGifFrameIO(int i);

    void setHcGifFrameThr(boolean z);

    void setHcGifFrameTimeout(int i);

    void setHcGifIO(int i);

    void setHcGifThr(boolean z);

    void setHcGifTimeout(int i);

    void setHcKVFtReport(boolean z);

    void setHcKVPerReport(boolean z);

    void setHcMediaGalleryScrollAction(long j);

    void setHcMediaGalleryScrollCPU(int i);

    void setHcMediaGalleryScrollDelay(int i);

    void setHcMediaGalleryScrollEnable(boolean z);

    void setHcMediaGalleryScrollIO(int i);

    void setHcMediaGalleryScrollThr(boolean z);

    void setHcMediaGalleryScrollTimeout(int i);

    void setHcMiniProgramLaunchAction(long j);

    void setHcMiniProgramLaunchCPU(int i);

    void setHcMiniProgramLaunchDelay(int i);

    void setHcMiniProgramLaunchEnable(boolean z);

    void setHcMiniProgramLaunchIO(int i);

    void setHcMiniProgramLaunchThr(boolean z);

    void setHcMiniProgramLaunchTimeout(int i);

    void setHcQuitChattingAction(long j);

    void setHcQuitChattingCPU(int i);

    void setHcQuitChattingDelay(int i);

    void setHcQuitChattingEnable(boolean z);

    void setHcQuitChattingIO(int i);

    void setHcQuitChattingThr(boolean z);

    void setHcQuitChattingTimeout(int i);

    void setHcReceiveMsgAction(long j);

    void setHcReceiveMsgCPU(int i);

    void setHcReceiveMsgDelay(int i);

    void setHcReceiveMsgEnable(boolean z);

    void setHcReceiveMsgIO(int i);

    void setHcReceiveMsgThr(boolean z);

    void setHcReceiveMsgTimeout(int i);

    void setHcRetryInterval(int i);

    void setHcSNSMsgScrollAction(long j);

    void setHcSNSMsgScrollCPU(int i);

    void setHcSNSMsgScrollDelay(int i);

    void setHcSNSMsgScrollEnable(boolean z);

    void setHcSNSMsgScrollIO(int i);

    void setHcSNSMsgScrollThr(boolean z);

    void setHcSNSMsgScrollTimeout(int i);

    void setHcSNSScrollAction(long j);

    void setHcSNSScrollCPU(int i);

    void setHcSNSScrollDelay(int i);

    void setHcSNSScrollEnable(boolean z);

    void setHcSNSScrollIO(int i);

    void setHcSNSScrollThr(boolean z);

    void setHcSNSScrollTimeout(int i);

    void setHcSNSUserScrollAction(long j);

    void setHcSNSUserScrollCPU(int i);

    void setHcSNSUserScrollDelay(int i);

    void setHcSNSUserScrollEnable(boolean z);

    void setHcSNSUserScrollIO(int i);

    void setHcSNSUserScrollThr(boolean z);

    void setHcSNSUserScrollTimeout(int i);

    void setHcSendMsgAction(long j);

    void setHcSendMsgCPU(int i);

    void setHcSendMsgDelay(int i);

    void setHcSendMsgEnable(boolean z);

    void setHcSendMsgIO(int i);

    void setHcSendMsgThr(boolean z);

    void setHcSendMsgTimeout(int i);

    void setHcSendPicMsgAction(long j);

    void setHcSendPicMsgCPU(int i);

    void setHcSendPicMsgDelay(int i);

    void setHcSendPicMsgEnable(boolean z);

    void setHcSendPicMsgIO(int i);

    void setHcSendPicMsgThr(boolean z);

    void setHcSendPicMsgTimeout(int i);

    void setHcTimeLimit(boolean z);

    void setHcTimeoutMargin(int i);

    void setHcUinHash(int i);

    void setHcUpdateChatroomAction(long j);

    void setHcUpdateChatroomCPU(int i);

    void setHcUpdateChatroomDelay(int i);

    void setHcUpdateChatroomEnable(boolean z);

    void setHcUpdateChatroomIO(int i);

    void setHcUpdateChatroomMemberCount(long j);

    void setHcUpdateChatroomThr(boolean z);

    void setHcUpdateChatroomTimeout(int i);

    void setRetryConnectInterval(int i);

    int startPerformance(boolean z, int i, int i2, int i3, int i4, int i5, int i6, long j, String str);

    int stopPerformance(boolean z, int i);

    long terminateApp(int i, long j);
}
