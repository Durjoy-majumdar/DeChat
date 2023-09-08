package so0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hr0.C87584b;
import in0.C87759c;
import in0.C87760d;
import java.math.BigInteger;
import kn0.C88235m;
import kn0.C88236n;
import p224ra.C89909e;
import p404z6.C91618d;
import p830xc.C91165a;
import p975hd.C87481e;
import po0.C89424j;
import ym0.C91512j;

/* renamed from: so0.a */
public class C90268a {

    /* renamed from: b */
    public static final BigInteger f259093b = BigInteger.valueOf(1024);

    /* renamed from: a */
    public final a$$c f259094a = new a$$c((a$$b) null);

    /* renamed from: a */
    public C87759c mo123086a(int i, int i2) {
        C87759c cVar = null;
        if (-4000 >= i) {
            if (i != -4999) {
                switch (i) {
                    case -4006:
                    case -4000:
                        cVar = C87759c.NETWORK;
                        break;
                    case -4005:
                        cVar = C87759c.RENDER;
                        break;
                    case -4004:
                        cVar = C87759c.EXTRACT;
                        break;
                    case -4003:
                        cVar = C87759c.DECODE;
                        break;
                    case -4002:
                        cVar = C87759c.ILLEGAL;
                        break;
                    case -4001:
                        cVar = C87759c.EXTRACT_NOT_SUPPORT;
                        break;
                }
            } else {
                cVar = C87759c.OTHER;
            }
            if (cVar == null) {
                Log.m105920e("MicroMsg.AppBrand.GeneralErrorType", "fromExoErrorInfo, errorType is null, errorWhat: " + i + ", errorExtra: " + i2);
            }
        }
        Log.m105924i("MicroMsg.AppBrand.GeneralErrorType", "fromErrorInfo, errorWhat: " + i + ", errorExtra: " + i2 + ", errorType: " + cVar);
        return cVar;
    }

    /* renamed from: b */
    public boolean mo123087b(C87760d dVar) {
        return false;
    }

    /* renamed from: c */
    public final void mo124489c(C87481e eVar, C91165a aVar, C87760d dVar, String str) {
        int i;
        int i2;
        int i3;
        C91618d dVar2;
        a$$c a__c = this.f259094a;
        if (a__c.f259102g < a__c.f259101f) {
            Log.m105924i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "reportVideoProfile, wired case, ignore reporting and reset data");
            this.f259094a.mo124490a();
            return;
        }
        String appId = aVar != null ? aVar.getAppId() : "";
        C91618d dVar3 = C88235m.f255054b;
        C88236n nVar = (C88236n) dVar.mo22544o(C88236n.class);
        if (nVar != null) {
            i3 = nVar.f60451O;
            i2 = nVar.f60452P;
            i = nVar.f60453Q;
            C91618d dVar4 = nVar.f60457U;
            if (dVar4 == null) {
                dVar4 = dVar3;
            }
            C91618d dVar5 = nVar.f60456T;
            if (dVar5 != null) {
                dVar3 = dVar5;
            }
            dVar2 = dVar3;
            dVar3 = dVar4;
        } else {
            dVar2 = dVar3;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        int i4 = dVar3.f262471d;
        int i5 = dVar3.f262473f;
        int i6 = dVar3.f262474g;
        int i7 = dVar2.f262471d;
        int i8 = dVar2.f262473f;
        int i9 = dVar2.f262474g;
        int i15 = i3;
        a$$c a__c2 = this.f259094a;
        int i16 = i2;
        this.f259094a.f259113r.getClass();
        Boolean bool = Boolean.FALSE;
        this.f259094a.f259113r.getClass();
        Log.m105925i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "reportVideoProfile:%s, appId:%s, proxy:%s, playerType:%s, playerCreateTime:%s, videoPath:%s, cachedSize:%s, duration:%s, prepareTime:%s, bufferCount:%s, bufferTime:%s, error(%s, %s, %s), minBufferMs:%s, maxBufferMs:%s, bufferForPlaybackMs:%s, fixNotifyErrorChannel: %d, lockCache: %b, useCronet: %b, interruptCache: %b, notifyErrorFix2FailCount: %d, audioRenderedCount: %d, audioDroppedCount: %d, audioMaxConsecutiveDroppedCount: %d, videoRenderedCount: %d, videoDroppedCount: %d, videoMaxConsecutiveDroppedCount: %d", str, appId, Boolean.valueOf(C91512j.m114810c().f262321e), Integer.valueOf(this.f259094a.f259097b), Long.valueOf(this.f259094a.f259098c), a__c2.f259096a, Long.valueOf(a__c2.f259099d), Long.valueOf(this.f259094a.f259100e), Long.valueOf(this.f259094a.f259103h), Integer.valueOf(this.f259094a.f259104i), Long.valueOf(this.f259094a.f259105j), Integer.valueOf(this.f259094a.f259110o), Integer.valueOf(this.f259094a.f259111p), this.f259094a.f259112q, Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i), Integer.valueOf(this.f259094a.f259113r.f255063a), bool, bool, Boolean.valueOf(this.f259094a.f259113r.f255064b), Integer.valueOf(this.f259094a.f259114s), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
        a$$c a__c3 = this.f259094a;
        this.f259094a.f259113r.getClass();
        this.f259094a.f259113r.getClass();
        Object[] objArr = {appId, Integer.valueOf(this.f259094a.f259097b), a__c3.f259096a, Long.valueOf(a__c3.f259103h), Long.valueOf(this.f259094a.f259100e), Long.valueOf(this.f259094a.f259099d), Integer.valueOf(this.f259094a.f259110o), Integer.valueOf(this.f259094a.f259111p), this.f259094a.f259112q, 1, Integer.valueOf(C91512j.m114810c().f262321e ? 1 : 0), Integer.valueOf(this.f259094a.f259104i), Long.valueOf(this.f259094a.f259105j), Long.valueOf(this.f259094a.f259098c), Long.valueOf(this.f259094a.f259101f), Long.valueOf(this.f259094a.f259102g), Long.valueOf(this.f259094a.f259108m), Long.valueOf(this.f259094a.f259109n), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i), Integer.valueOf(this.f259094a.f259113r.f255063a), 0, 0, Integer.valueOf(this.f259094a.f259113r.f255064b ? 1 : 0), Integer.valueOf(this.f259094a.f259114s), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)};
        ((C89424j) eVar).getClass();
        ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(18651, objArr);
        this.f259094a.mo124490a();
    }
}
