package com.tencent.wechat.p326mm.biz.jni;

import com.google.protobuf.C23861l0;
import com.tencent.wechat.p326mm.biz.BizProto;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eR$\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/wechat/mm/biz/jni/BizAffBridge;", "", "", "hello", "sayHello", "Lcom/tencent/wechat/mm/biz/BizProto$BizMsgInfo;", "callJava", "getUserAgent", "", "getResortContext", "doDataMigrate", "", "msgId", "getResortCardContext", "Lcom/tencent/wechat/mm/biz/jni/BizAffBridge$Callback;", "cb", "Lrx3/b0;", "setCallBack", "callback", "Lcom/tencent/wechat/mm/biz/jni/BizAffBridge$Callback;", "getCallback", "()Lcom/tencent/wechat/mm/biz/jni/BizAffBridge$Callback;", "setCallback", "(Lcom/tencent/wechat/mm/biz/jni/BizAffBridge$Callback;)V", "<init>", "()V", "Callback", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.wechat.mm.biz.jni.BizAffBridge */
public final class BizAffBridge {
    public static final BizAffBridge INSTANCE = new BizAffBridge();
    private static Callback callback;

    @Metadata(mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/wechat/mm/biz/jni/BizAffBridge$Callback;", "", "onDataMigrate", "Lcom/tencent/wechat/mm/biz/BizProto$BizMsgInfoList;", "onGetResortCardContext", "Lcom/tencent/wechat/mm/biz/BizProto$BizMsgReSortV2CardContext;", "msgId", "", "onGetResortContext", "Lcom/tencent/wechat/mm/biz/BizProto$BizMsgReSortV2ReqContext;", "onGetUserAgent", "", "aff-module_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.wechat.mm.biz.jni.BizAffBridge$Callback */
    public interface Callback {
        BizProto.BizMsgInfoList onDataMigrate();

        BizProto.BizMsgReSortV2CardContext onGetResortCardContext(long j);

        BizProto.BizMsgReSortV2ReqContext onGetResortContext();

        String onGetUserAgent();
    }

    private BizAffBridge() {
    }

    public static final BizProto.BizMsgInfo callJava(BizProto.BizMsgInfo bizMsgInfo) {
        C87412m.m108594g(bizMsgInfo, "hello");
        BizProto.BizMsgInfo.Builder newBuilder = BizProto.BizMsgInfo.newBuilder();
        newBuilder.setUserName("use_from_java");
        C23861l0 build = newBuilder.build();
        C87412m.m108593f(build, "ret.build()");
        return (BizProto.BizMsgInfo) build;
    }

    public static final byte[] doDataMigrate() {
        BizProto.BizMsgInfoList bizMsgInfoList;
        Callback callback2 = callback;
        if (callback2 == null || (bizMsgInfoList = callback2.onDataMigrate()) == null) {
            bizMsgInfoList = BizProto.BizMsgInfoList.getDefaultInstance();
        }
        byte[] byteArray = bizMsgInfoList.toByteArray();
        C87412m.m108593f(byteArray, "data.toByteArray()");
        return byteArray;
    }

    public static final byte[] getResortCardContext(long j) {
        BizProto.BizMsgReSortV2CardContext bizMsgReSortV2CardContext;
        Callback callback2 = callback;
        if (callback2 == null || (bizMsgReSortV2CardContext = callback2.onGetResortCardContext(j)) == null) {
            bizMsgReSortV2CardContext = BizProto.BizMsgReSortV2CardContext.getDefaultInstance();
        }
        byte[] byteArray = bizMsgReSortV2CardContext.toByteArray();
        C87412m.m108593f(byteArray, "resortContext.toByteArray()");
        return byteArray;
    }

    public static final byte[] getResortContext() {
        BizProto.BizMsgReSortV2ReqContext bizMsgReSortV2ReqContext;
        Callback callback2 = callback;
        if (callback2 == null || (bizMsgReSortV2ReqContext = callback2.onGetResortContext()) == null) {
            bizMsgReSortV2ReqContext = BizProto.BizMsgReSortV2ReqContext.getDefaultInstance();
        }
        byte[] byteArray = bizMsgReSortV2ReqContext.toByteArray();
        C87412m.m108593f(byteArray, "resortContext.toByteArray()");
        return byteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.onGetUserAgent();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String getUserAgent() {
        /*
            com.tencent.wechat.mm.biz.jni.BizAffBridge$Callback r0 = callback
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.onGetUserAgent()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.p326mm.biz.jni.BizAffBridge.getUserAgent():java.lang.String");
    }

    public static final String sayHello(String str) {
        C87412m.m108594g(str, "hello");
        return "hello from java " + str;
    }

    public final Callback getCallback() {
        return callback;
    }

    public final void setCallBack(Callback callback2) {
        C87412m.m108594g(callback2, "cb");
        callback = callback2;
    }

    public final void setCallback(Callback callback2) {
        callback = callback2;
    }
}
