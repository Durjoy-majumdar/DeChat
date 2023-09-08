package p007bo;

import com.google.protobuf.C23861l0;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C19601c0;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.wechat.p326mm.biz.BizCgiProto;
import com.tencent.wechat.p326mm.biz.BizProto;
import com.tencent.wechat.p326mm.biz.jni.BizAffBridge;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import js0.C46574u;
import kj2.C117407d;
import p224ra.C89909e;
import rb0.C22221f;
import rb0.C48009v0;

/* renamed from: bo.a */
public final class C16796a implements BizAffBridge.Callback {
    public BizProto.BizMsgInfoList onDataMigrate() {
        Log.m105924i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration");
        C16797b.f45394a = false;
        List<C19623o0> bO = C48009v0.Jx0().mo25799bO(285212721, 100);
        if (bO.isEmpty()) {
            C16797b.f45394a = true;
            C117407d.INSTANCE.mo182089r(1971, 23, 1);
            Log.m105924i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration infoList is empty");
            BizProto.BizMsgInfoList defaultInstance = BizProto.BizMsgInfoList.getDefaultInstance();
            C87412m.m108593f(defaultInstance, "getDefaultInstance()");
            return defaultInstance;
        }
        LinkedList linkedList = (LinkedList) bO;
        long q2 = ((C19623o0) linkedList.get(0)).mo25767q2();
        BizProto.BizMsgInfoList.Builder newBuilder = BizProto.BizMsgInfoList.newBuilder();
        for (C19623o0 o0Var : bO) {
            if (o0Var.mo25754B2()) {
                newBuilder.addMsgList(C16813m.f45424a.mo17855a(o0Var, o0Var.mo25767q2() == q2));
            }
        }
        BizProto.BizMsgInfoList bizMsgInfoList = (BizProto.BizMsgInfoList) newBuilder.build();
        Log.m105924i("MicroMsg.BizFlutterDataMigrateHelper", "doDataMigration size = " + linkedList.size());
        C16797b.f45394a = true;
        C87412m.m108593f(bizMsgInfoList, "bizMsgInfoList");
        return bizMsgInfoList;
    }

    public BizProto.BizMsgReSortV2CardContext onGetResortCardContext(long j) {
        BizProto.BizMsgReSortV2CardContext.Builder newBuilder = BizProto.BizMsgReSortV2CardContext.newBuilder();
        BizCgiProto.DigestExposureInfo.Builder newBuilder2 = BizCgiProto.DigestExposureInfo.newBuilder();
        String valueOf = String.valueOf(j);
        C22221f fVar = C22221f.f62962a;
        C19601c0 c0Var = C19601c0.f55446a;
        newBuilder2.setDigestExposureCnt(fVar.decodeInt(c0Var.mo25714c(valueOf), 0));
        newBuilder2.setDigestExposurePeriod((int) fVar.decodeLong(c0Var.mo25715d(valueOf), 0));
        newBuilder2.setDigestExposurePos(fVar.decodeInt(c0Var.mo25713b(valueOf), 0));
        newBuilder.setDigestExposureInfo((BizCgiProto.DigestExposureInfo) newBuilder2.build());
        C23861l0 build = newBuilder.build();
        C87412m.m108593f(build, "newBuilder().apply {\n   …                }.build()");
        return (BizProto.BizMsgReSortV2CardContext) build;
    }

    public BizProto.BizMsgReSortV2ReqContext onGetResortContext() {
        BizProto.BizMsgReSortV2ReqContext.Builder newBuilder = BizProto.BizMsgReSortV2ReqContext.newBuilder();
        C44545a aVar = C44545a.f120794a;
        newBuilder.setNetType(aVar.mo69323a());
        newBuilder.setIsHeadsetOn(aVar.mo69325c());
        C19601c0 c0Var = C19601c0.f55446a;
        String str = C19601c0.f55451f;
        if (str == null) {
            str = "";
        }
        newBuilder.setMsgBoxExposeDigest(str);
        newBuilder.setMsgBoxExposePos(((C45696d) C86709a0.m107533q(C45696d.class)).mo71017z3());
        long j = 0;
        if (C19601c0.f55457l) {
            newBuilder.setDigestMsgType(7);
            newBuilder.setBizusername(C19601c0.f55460o);
            newBuilder.setMsgBoxExposeMsgId(0);
        } else {
            newBuilder.setDigestMsgType(0);
            MultiProcessMMKV multiProcessMMKV = C19601c0.f55455j;
            if (!multiProcessMMKV.decodeBool("BizLastMsgIsNotifyMsg", false)) {
                j = multiProcessMMKV.decodeLong("BizLastMsgId");
            }
            newBuilder.setMsgBoxExposeMsgId(j);
        }
        C23861l0 build = newBuilder.build();
        C87412m.m108593f(build, "newBuilder().apply {\n   …                }.build()");
        return (BizProto.BizMsgReSortV2ReqContext) build;
    }

    public String onGetUserAgent() {
        String a = C46574u.m51897a(MMApplicationContext.getContext(), System.getProperty("http.agent"), (C46574u.C46575a) C89909e.m112436a(C46574u.C46575a.class));
        C87412m.m108593f(a, "appendUserAgent(\n       …s.java)\n                )");
        return a;
    }
}
