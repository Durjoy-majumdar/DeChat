package jq2;

import android.widget.TextView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import f40.C86709a0;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jp2.C60886l;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48683a92;
import vr2.C102235a;
import vr2.C102236a0;
import vr2.C102260r;
import zt3.C119157j;

/* renamed from: jq2.n */
public class C98995n {

    /* renamed from: a */
    public static Map<String, Long> f290254a = new ConcurrentHashMap();

    /* renamed from: jq2.n$b */
    public static class C98997b implements C11385n {

        /* renamed from: d */
        public int f290255d;

        /* renamed from: e */
        public String f290256e;

        /* renamed from: f */
        public ADInfo f290257f;

        public C98997b(int i, String str, C98996a aVar) {
            this.f290255d = i;
            this.f290256e = str;
        }

        /* renamed from: a */
        public static /* synthetic */ ADInfo m128909a(C98997b bVar) {
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            ADInfo aDInfo = bVar.f290257f;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            return aDInfo;
        }

        /* renamed from: b */
        public static void m128910b(C98997b bVar, String str) {
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            long B0 = C102236a0.m134706B0(str);
            AdSnsInfo jo = C94866e1.zx0().mo139864jo(B0);
            if (jo == null) {
                Log.m105920e("DynamicDataReqHelper", "adInfo can not get from DB due to adsnsinfo is null, longSnsId = " + B0 + ", snsId = " + str);
                SnsMethodCalculate.markEndTimeMs("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            } else {
                bVar.f290257f = jo.getAdInfo();
                SnsMethodCalculate.markEndTimeMs("setAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            }
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }

        /* renamed from: c */
        public static void m128911c(C98997b bVar, C102235a aVar) {
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            aVar.f301030b = null;
            aVar.f301033e = null;
            aVar.f301034f = null;
            aVar.f301032d.clear();
            SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }

        /* renamed from: d */
        public static void m128912d(C98997b bVar, C102235a aVar) {
            SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            if (bVar.f290257f == null || aVar == null) {
                Log.m105920e("DynamicDataReqHelper", "adInfo or adChainData is null");
                SnsMethodCalculate.markEndTimeMs("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            } else {
                MMHandlerThread.postToMainThread(new C98998o(bVar, aVar));
                SnsMethodCalculate.markEndTimeMs("updateInMainThread", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            }
            SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
            if (yVar instanceof C60886l) {
                try {
                    C48683a92 a922 = (C48683a92) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("errType = ");
                    sb.append(i);
                    sb.append(", errCode = ");
                    sb.append(i2);
                    sb.append(", snsId = ");
                    sb.append(this.f290256e);
                    sb.append(", rsp.sns_ad_id = ");
                    sb.append(a922 == null ? "" : a922.f130388e);
                    Log.m105924i("DynamicDataReqHelper", sb.toString());
                    if (i == 0 && i2 == 0 && a922 != null) {
                        int i3 = a922.f130387d;
                        String str2 = a922.f130388e;
                        String str3 = a922.f130389f;
                        int i4 = this.f290255d;
                        if (i4 == 1 && i4 == i3) {
                            if (!Util.isNullOrNil(this.f290256e, str3) && this.f290256e.equals(str2)) {
                                String str4 = this.f290256e;
                                SnsMethodCalculate.markStartTimeMs("updateAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
                                ((C119157j) C119157j.f356862d).mo183875f(new C98999p(this, str4, str3));
                                SnsMethodCalculate.markEndTimeMs("updateAdInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
                            }
                        }
                    }
                    C86709a0.m107524d().mo123470p(yVar.getType(), this);
                } catch (Throwable th) {
                    Log.m105920e("DynamicDataReqHelper", "NetSceneDynamicAdDataUpdate onSceneEnd exp=" + th.toString() + ", snsId = " + this.f290256e);
                }
            }
            SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper$AdChainSceneEndCallback");
        }
    }

    /* renamed from: a */
    public static boolean m128905a(ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        boolean z = false;
        if (aDInfo == null) {
            SnsMethodCalculate.markEndTimeMs("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return false;
        }
        boolean z2 = !Util.isNullOrNil(aDInfo.adExtTailWording) && aDInfo.adExtTailWordingExchangeValue > 0;
        if (z2) {
            boolean contains = aDInfo.adExtTailWording.contains("%d");
            int indexOf = aDInfo.adExtTailWording.indexOf("%");
            int lastIndexOf = aDInfo.adExtTailWording.lastIndexOf("%");
            if (contains && indexOf == lastIndexOf) {
                z = true;
            }
            z2 = z;
        }
        SnsMethodCalculate.markEndTimeMs("checkAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        return z2;
    }

    /* renamed from: b */
    public static boolean m128906b(ADInfo aDInfo, String str) {
        SnsMethodCalculate.markStartTimeMs("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (aDInfo == null || ((aDInfo.adActionExtTailType != ADInfo.ADChainStrengthenUserInfoFormatWording || Util.isNullOrNil(aDInfo.adActionExtTailWording) || aDInfo.adActionExtUserList.size() <= 0) && (aDInfo.adActionExtTailType != ADInfo.ADChainStrengthenDefaultWording || Util.isNullOrNil(aDInfo.adActionExtTailWording)))) {
            SnsMethodCalculate.markEndTimeMs("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return false;
        }
        Log.m105924i("DynamicDataReqHelper", "use init adChainData");
        ((ConcurrentHashMap) f290254a).put(str, Long.valueOf(System.currentTimeMillis()));
        SnsMethodCalculate.markEndTimeMs("checkOriginAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        return true;
    }

    /* renamed from: c */
    public static void m128907c(int i, String str, ADInfo aDInfo, SnsObject snsObject) {
        String str2 = str;
        ADInfo aDInfo2 = aDInfo;
        SnsMethodCalculate.markStartTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (aDInfo2 == null || Util.isNullOrNil(str)) {
            Log.m105920e("DynamicDataReqHelper", "adInfo or snsId is null, snsId = " + str2);
            SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        } else if (snsObject == null) {
            Log.m105920e("DynamicDataReqHelper", "snsObject is null, snsId = " + str2);
            SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        } else if (aDInfo2.adChainType != 1) {
            Log.m105924i("DynamicDataReqHelper", "adChainType is not 1, snsId = " + str2);
            SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        } else {
            int i2 = aDInfo2.adChainTypeExpireTime;
            int i3 = i2 == 0 ? CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL : i2 * 1000;
            long currentTimeMillis = System.currentTimeMillis();
            Long l = (Long) ((ConcurrentHashMap) f290254a).get(str2);
            if (currentTimeMillis - (l == null ? 0 : l.longValue()) < ((long) i3)) {
                SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
                return;
            }
            HashSet<String> y = C102260r.m134885y(snsObject);
            HashSet<String> v = C102260r.m134882v(snsObject);
            C60886l lVar = new C60886l(i, "", aDInfo2.aid, str, aDInfo2.uxInfo, C102260r.m134884x(y, v).size(), y.size(), v.size());
            int i4 = i;
            C86709a0.m107524d().mo123455a(4342, new C98997b(i, str2, (C98996a) null));
            C86709a0.m107529k().f251779b.mo123460f(lVar);
            ((ConcurrentHashMap) f290254a).put(str2, Long.valueOf(currentTimeMillis));
            C115669n.INSTANCE.mo175911u(1612, 43);
            SnsMethodCalculate.markEndTimeMs("updateAdChainData", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        }
    }

    /* renamed from: d */
    public static void m128908d(TextView textView, SnsObject snsObject, ADInfo aDInfo) {
        SnsMethodCalculate.markStartTimeMs("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
        if (textView == null || snsObject == null || aDInfo == null) {
            SnsMethodCalculate.markEndTimeMs("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
            return;
        }
        try {
            SnsMethodCalculate.markStartTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            HashSet<String> x = C102260r.m134884x(C102260r.m134885y(snsObject), C102260r.m134882v(snsObject));
            if (!Util.isNullOrNil(snsObject.Username)) {
                x.remove(snsObject.Username);
            }
            SnsMethodCalculate.markEndTimeMs("getLikeCommentUsersUnion", "com.tencent.mm.plugin.sns.data.SnsAdUtil");
            int max = Math.max(x.size(), aDInfo.adExtTailWordingExchangeValue);
            textView.setText(String.format(aDInfo.adExtTailWording, new Object[]{Integer.valueOf(max)}));
            textView.setVisibility(0);
            if (aDInfo.adExtTailWordingExchangeValue < x.size()) {
                C115669n.INSTANCE.mo175911u(1612, 51);
            }
        } catch (Throwable th) {
            textView.setVisibility(8);
            Log.m105920e("DynamicDataReqHelper", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("updateAdExtTailWording", "com.tencent.mm.plugin.sns.ad.timeline.helper.DynamicDataReqHelper");
    }
}
