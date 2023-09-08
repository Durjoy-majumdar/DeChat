package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import p492dn.C45426j;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.qg4;

/* renamed from: com.tencent.mm.pluginsdk.model.a */
public final class C44545a {

    /* renamed from: a */
    public static final C44545a f120794a = new C44545a();

    /* renamed from: b */
    public static final C13601g f120795b = C36568h.m40985a(C30654a.f82504d);

    /* renamed from: com.tencent.mm.pluginsdk.model.a$a */
    public static final class C30654a extends C87413o implements C32224a<Integer[]> {

        /* renamed from: d */
        public static final C30654a f82504d = new C30654a();

        public C30654a() {
            super(0);
        }

        public Object invoke() {
            return new Integer[]{1};
        }
    }

    /* renamed from: a */
    public final String mo69323a() {
        Context context = MMApplicationContext.getContext();
        return NetStatusUtil.isWifi(context) ? "wifi" : NetStatusUtil.is5G(context) ? "5g" : NetStatusUtil.is4G(context) ? "4g" : NetStatusUtil.is3G(context) ? "3g" : NetStatusUtil.is2G(context) ? "2g" : NetStatusUtil.isConnected(context) ? "unknown" : "none";
    }

    /* renamed from: b */
    public final qg4 mo69324b() {
        C47465a aVar;
        byte[] decodeBytes;
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        C87412m.m108593f(singleMMKV, "getSingleMMKV(BizConstants.brandService)");
        if (singleMMKV.containsKey("k_TimelineSettingInfo") && (decodeBytes = singleMMKV.decodeBytes("k_TimelineSettingInfo")) != null) {
            if (!(decodeBytes.length == 0)) {
                try {
                    qg4 newInstance = qg4.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
                return (qg4) aVar;
            }
        }
        aVar = null;
        return (qg4) aVar;
    }

    /* renamed from: c */
    public final boolean mo69325c() {
        Class cls = C45426j.class;
        boolean C = ((C45426j) C86312j.m106911c(cls)).n40().mo157504C();
        boolean Jh0 = ((C45426j) C86312j.m106911c(cls)).Jh0();
        Log.m105924i("MicroMsg.BizCommUtil", "isHeadsetOn isHeadsetPlugged:" + C + " isBluetoothOn:" + Jh0);
        return C || Jh0;
    }

    /* renamed from: d */
    public final boolean mo69326d(int i) {
        for (Integer intValue : (Integer[]) ((C36570n) f120795b).getValue()) {
            if ((intValue.intValue() & i) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final void mo69327e(qg4 qg4) {
        if (qg4 != null) {
            try {
                Log.m105924i("MicroMsg.BizCommUtil", "setTimelineSettingInfo bitSet = " + qg4.f140315d);
                MultiProcessMMKV.getSingleMMKV("brandService").encode("k_TimelineSettingInfo", qg4.toByteArray());
            } catch (IOException e) {
                Log.m105929w("MicroMsg.BizCommUtil", "encode TimelineSettingInfo ex %s", e.getMessage());
            }
        }
    }
}
