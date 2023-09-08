package com.tencent.p014mm.plugin.magicbrush.report;

import di3.C7335d;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor */
public interface IMagicBrushMonitor extends C7335d {

    @Metadata(mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b0\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$Key;", "", "(Ljava/lang/String;I)V", "SetDeviceOrientationTimeout", "MagicLiveCardBasicLibNull", "MagicNetworkDownloadTaskCount", "MagicNetworkDownloadTaskSuccess", "MagicNetworkDownloadTaskFail", "MagicNetworkDownloadTaskSuccessCost", "MagicNetworkDownloadTaskFailCost", "MagicNetworkDownloadTaskTimeout", "MagicNetworkDownloadTaskSpeed2G", "MagicNetworkDownloadTaskSpeed3G", "MagicNetworkDownloadTaskSpeed4G", "MagicNetworkDownloadTaskSpeedWIFI", "MagicNetworkDownloadTaskSpeedOtherNet", "MagicNetworkCDNDownloadTaskCount", "MagicNetworkCDNDownloadTaskSuccess", "MagicNetworkCDNDownloadTaskFail", "MagicNetworkCDNDownloadTaskSuccessCost", "MagicNetworkCDNDownloadTaskFailCost", "MagicNetworkCDNDownloadTaskTimeout", "MagicNetworkCDNDownloadTaskSpeed2G", "MagicNetworkCDNDownloadTaskSpeed3G", "MagicNetworkCDNDownloadTaskSpeed4G", "MagicNetworkCDNDownloadTaskSpeedWIFI", "MagicNetworkCDNDownloadTaskSpeedOtherNet", "MagicTempFileClearCount", "MagicTempFileClearTimeout", "MagicTempFileSizeExceedLimit", "MagicAdBrandServiceFrameSetNameEmpty", "MagicAdBrandServiceFrameSetDataEmpty", "MagicBrandServiceFrameSetNameEmpty", "MagicBrandServiceFrameSetDataEmpty", "MagicStartAppBrand1AlreadyAlive", "MagicStartAppBrand1ByBrandServiceUnreadCountProcessCostTime", "MagicStartAppBrand1ByBrandServiceUnreadCountSoCostTime", "MagicAdBrandServicePendingEvent", "MagicBrandServicePendingEvent", "MagicAdBrandServiceStatusOnClick", "MagicBrandCreateScene", "MagicAdBrandServiceEnterByClick", "MagicAdBrandServiceCardNum", "AdCanvasEnterByClick", "AdCanvasCardNum", "MagicBrandCardExpose", "MagicBrandCardExposeRaw", "MagicBrandPreloadToUseGap", "MagicBrandNotSendPendingEvents", "mb-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$Key */
    public enum Key {
        SetDeviceOrientationTimeout,
        MagicLiveCardBasicLibNull,
        MagicNetworkDownloadTaskCount,
        MagicNetworkDownloadTaskSuccess,
        MagicNetworkDownloadTaskFail,
        MagicNetworkDownloadTaskSuccessCost,
        MagicNetworkDownloadTaskFailCost,
        MagicNetworkDownloadTaskTimeout,
        MagicNetworkDownloadTaskSpeed2G,
        MagicNetworkDownloadTaskSpeed3G,
        MagicNetworkDownloadTaskSpeed4G,
        MagicNetworkDownloadTaskSpeedWIFI,
        MagicNetworkDownloadTaskSpeedOtherNet,
        MagicNetworkCDNDownloadTaskCount,
        MagicNetworkCDNDownloadTaskSuccess,
        MagicNetworkCDNDownloadTaskFail,
        MagicNetworkCDNDownloadTaskSuccessCost,
        MagicNetworkCDNDownloadTaskFailCost,
        MagicNetworkCDNDownloadTaskTimeout,
        MagicNetworkCDNDownloadTaskSpeed2G,
        MagicNetworkCDNDownloadTaskSpeed3G,
        MagicNetworkCDNDownloadTaskSpeed4G,
        MagicNetworkCDNDownloadTaskSpeedWIFI,
        MagicNetworkCDNDownloadTaskSpeedOtherNet,
        MagicTempFileClearCount,
        MagicTempFileClearTimeout,
        MagicTempFileSizeExceedLimit,
        MagicAdBrandServiceFrameSetNameEmpty,
        MagicAdBrandServiceFrameSetDataEmpty,
        MagicBrandServiceFrameSetNameEmpty,
        MagicBrandServiceFrameSetDataEmpty,
        MagicStartAppBrand1AlreadyAlive,
        MagicStartAppBrand1ByBrandServiceUnreadCountProcessCostTime,
        MagicStartAppBrand1ByBrandServiceUnreadCountSoCostTime,
        MagicAdBrandServicePendingEvent,
        MagicBrandServicePendingEvent,
        MagicAdBrandServiceStatusOnClick,
        MagicBrandCreateScene,
        MagicAdBrandServiceEnterByClick,
        MagicAdBrandServiceCardNum,
        AdCanvasEnterByClick,
        AdCanvasCardNum,
        MagicBrandCardExpose,
        MagicBrandCardExposeRaw,
        MagicBrandPreloadToUseGap,
        MagicBrandNotSendPendingEvents
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$MagicPkgScene;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "AutoPreCheck", "AutoCheck", "Clean", "Check", "Download", "IPXXDownload", "DownloadFinish", "Update", "UpdateMulti", "Get", "GetMulti", "mb-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene */
    public enum MagicPkgScene {
        AutoPreCheck(0),
        AutoCheck(1),
        Clean(2),
        Check(3),
        Download(4),
        IPXXDownload(5),
        DownloadFinish(6),
        Update(7),
        UpdateMulti(8),
        Get(9),
        GetMulti(10);
        
        private final int value;

        private MagicPkgScene(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$PerformanceScene;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Start", "Ready", "FirstFrameFromStart", "FirstFrameFromReady", "PreloadDone", "mb-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene */
    public enum PerformanceScene {
        Start(1),
        Ready(2),
        FirstFrameFromStart(3),
        FirstFrameFromReady(4),
        PreloadDone(5);
        
        private final int value;

        private PerformanceScene(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$TimeCostScene;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SETUP", "START", "DESTROY", "MAIN", "PLUGIN", "BIND_SERVICE", "LOAD_SO", "PRELOAD_SERVICE", "mb-api_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$TimeCostScene */
    public enum TimeCostScene {
        SETUP(1),
        START(2),
        DESTROY(3),
        MAIN(4),
        PLUGIN(5),
        BIND_SERVICE(8192),
        LOAD_SO(8193),
        PRELOAD_SERVICE(8194);
        
        private final int value;

        private TimeCostScene(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$a */
    public static final class C85281a {
        /* renamed from: a */
        public static /* synthetic */ void m105253a(IMagicBrushMonitor iMagicBrushMonitor, String str, int i, String str2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    str2 = null;
                }
                iMagicBrushMonitor.Ov0(str, i, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: kvReport");
        }

        /* renamed from: b */
        public static /* synthetic */ void m105254b(IMagicBrushMonitor iMagicBrushMonitor, String str, String str2, PerformanceScene performanceScene, long j, List list, JSONObject jSONObject, int i, Object obj) {
            if (obj == null) {
                iMagicBrushMonitor.u40(str, str2, performanceScene, j, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : jSONObject);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performanceReport");
        }

        /* renamed from: c */
        public static /* synthetic */ void m105255c(IMagicBrushMonitor iMagicBrushMonitor, String str, String str2, String str3, String str4, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    str4 = "";
                }
                iMagicBrushMonitor.R80(str, str2, str3, str4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: runtimeReport");
        }

        /* renamed from: d */
        public static /* synthetic */ void m105256d(IMagicBrushMonitor iMagicBrushMonitor, String str, String str2, TimeCostScene timeCostScene, long j, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 16) != 0) {
                    str3 = "";
                }
                iMagicBrushMonitor.mo51764Io(str, str2, timeCostScene, j, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: timeCostReport");
        }
    }

    /* renamed from: Io */
    void mo51764Io(String str, String str2, TimeCostScene timeCostScene, long j, String str3);

    void Ov0(String str, int i, String str2);

    void R80(String str, String str2, String str3, String str4);

    void ir0(String str, String str2, String str3, String str4, int i, MagicPkgScene magicPkgScene, int i2, int i3);

    void u40(String str, String str2, PerformanceScene performanceScene, long j, List<String> list, JSONObject jSONObject);
}
