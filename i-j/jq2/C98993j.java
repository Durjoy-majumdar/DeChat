package jq2;

import ao2.C79618h;
import br2.C54550e;
import co2.C92448q;
import co2.C92449r;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lo2.C99556n;
import rq2.C101425k;
import te3.C101789j00;

/* renamed from: jq2.j */
public class C98993j {
    /* renamed from: a */
    public static boolean m128899a(SnsInfo snsInfo) {
        C92449r rVar;
        SnsMethodCalculate.markStartTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (snsInfo == null) {
            Log.m105928w("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is null!!");
            SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        } else if (!snsInfo.isAd()) {
            Log.m105928w("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is not ad!!");
            SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        } else if (C54550e.m61296a(snsInfo)) {
            Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoPreload: the snsInfo is ad living stream");
            SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        } else {
            TimeLineObject timeLine = snsInfo.getTimeLine();
            ADXml adXml = snsInfo.getAdXml();
            boolean b = m128900b(timeLine, adXml);
            if (b) {
                try {
                    if (!adXml.isSlideFullCard() || (rVar = adXml.adSliderFullCardInfo) == null) {
                        C101789j00 j002 = timeLine.ContentObj;
                        if (j002 != null && j002.f298427h.size() >= 1) {
                            Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, enableAdOnlineVideoPreload, snsId=" + timeLine.f283893Id);
                            C99556n.m129939b(adXml, timeLine.ContentObj.f298427h.get(0), timeLine.f283893Id);
                        }
                    } else {
                        List<C92448q> list = rVar.f264582a;
                        if (!C101425k.m133097a(list)) {
                            Iterator it = ((ArrayList) list).iterator();
                            while (it.hasNext()) {
                                C92448q qVar = (C92448q) it.next();
                                if (qVar != null && qVar.mo126435a()) {
                                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, the isSlideFullCard ad exists video item, start H.265");
                                    C99556n.m129939b(adXml, qVar.f264577e, timeLine.f283893Id);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    Log.m105920e("SnsAd.OnlinePlayerSwitchHelper", "AdH265Helper, enableAdOnlineVideoPreload exp=" + th.toString());
                }
            }
            SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return b;
        }
    }

    /* renamed from: b */
    public static boolean m128900b(TimeLineObject timeLineObject, ADXml aDXml) {
        boolean z;
        C92449r rVar;
        C101789j00 j002;
        SnsMethodCalculate.markStartTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        SnsMethodCalculate.markStartTimeMs("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        if (timeLineObject == null || (j002 = timeLineObject.ContentObj) == null) {
            SnsMethodCalculate.markEndTimeMs("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            z = false;
        } else {
            z = j002.f298424e == 15;
            SnsMethodCalculate.markEndTimeMs("isVideoSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        }
        if (aDXml != null && aDXml.isFullCardAd()) {
            if (aDXml.isLongPressGestureAd()) {
                Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload false, longpressgesture offline");
                SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            } else if (aDXml.isAdBreakFrameVideo() || aDXml.isAdIpInteractVideo()) {
                Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "fullcard adBreakFrameVideo is offline");
                SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                return false;
            } else {
                int i = C79618h.f233469a;
                if (i == 1) {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload false, force offline");
                    SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                    return false;
                } else if (i == 2) {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload true,  force online");
                    SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                    return true;
                }
            }
        }
        if (!m128902d() && aDXml != null && aDXml.isSlideFullCard() && (rVar = aDXml.adSliderFullCardInfo) != null) {
            List<C92448q> list = rVar.f264582a;
            if (!C101425k.m133097a(list)) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    C92448q qVar = (C92448q) it.next();
                    if (qVar != null && qVar.mo126435a()) {
                        Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "slideFullCard ad exists video item, so preload is enable!");
                        SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                        return true;
                    }
                }
            }
        }
        if (!z || aDXml == null || (!aDXml.isNormalAd() && !aDXml.isCardAd())) {
            if (z && m128901c(aDXml)) {
                SnsMethodCalculate.markStartTimeMs("useOnlineVideoInNormalTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                SnsMethodCalculate.markEndTimeMs("useOnlineVideoInNormalTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                if (aDXml.isNormalAd()) {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "the normal video preload is disable, because the online normal video preload is enable!");
                    SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                    return true;
                }
                SnsMethodCalculate.markStartTimeMs("useOnlineVideoInBaseCardTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                SnsMethodCalculate.markEndTimeMs("useOnlineVideoInBaseCardTimeline", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                if (aDXml.isCardAd()) {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "the base card ad video preload is disable, because the online base card prload is enable!");
                    SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                    return true;
                }
                SnsMethodCalculate.markStartTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                SnsMethodCalculate.markEndTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                if (aDXml.isFullCardAd() && !aDXml.isLongPressGestureAd() && !aDXml.isAdBreakFrameVideo() && !aDXml.isAdIpInteractVideo()) {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "fullcard useOnlineVideoView preload true");
                    SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                    return true;
                } else if (aDXml.isCombinedGridAD()) {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "combinedGridAD useOnlineVideoView preload true");
                    SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
                    return true;
                } else {
                    Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "the ad video preload is not disable!");
                }
            }
            SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return false;
        }
        Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "normal video ad or card video ad, so preload is enable!");
        SnsMethodCalculate.markEndTimeMs("enableAdOnlineVideoPreload", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return true;
    }

    /* renamed from: c */
    public static boolean m128901c(ADXml aDXml) {
        SnsMethodCalculate.markStartTimeMs("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        boolean z = false;
        if (aDXml != null) {
            if (aDXml.videoPlayInStreamingMode > 0) {
                z = true;
            }
            if (z) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(1579, 20);
                if (aDXml.isCardAd()) {
                    nVar.mo175911u(1579, 22);
                }
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                nVar2.mo175911u(1579, 19);
                if (aDXml.isCardAd()) {
                    nVar2.mo175911u(1579, 21);
                }
            }
            Log.m105918d("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoFeatureInAdXml return " + z);
            SnsMethodCalculate.markEndTimeMs("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
            return z;
        }
        Log.m105918d("SnsAd.OnlinePlayerSwitchHelper", "enableOnlineVideoFeatureInAdXml : the adxml is null, so return false");
        SnsMethodCalculate.markEndTimeMs("enableOnlineVideoFeatureInAdXml", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return false;
    }

    /* renamed from: d */
    public static boolean m128902d() {
        int i;
        SnsMethodCalculate.markStartTimeMs("useOfflineVideoAdSlideFullCard", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        boolean z = false;
        try {
            i = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_timeline_slide_full_card_video_online, 0);
            try {
                Log.m105924i("SnsAd.OnlinePlayerSwitchHelper", "useOnlineVideoAdSlideFullCard value is " + i);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            i = 0;
        }
        if (i > 0) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("useOfflineVideoAdSlideFullCard", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdOnlinePlayerSwitchHelper");
        return z;
    }
}
