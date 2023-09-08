package com.tencent.wechat.p326mm.biz;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23817d;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24061w0;
import com.google.protobuf.C24062w1;
import com.tencent.wechat.p326mm.biz.BizCgiCardProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.wechat.mm.biz.BizCgiProto */
public final class BizCgiProto {

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$1 */
    public static /* synthetic */ class C243681 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69822xa1df5c61;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|5|6|7|8|9|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0026 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0013 */
        static {
            /*
                com.google.protobuf.l0$f[] r0 = com.google.protobuf.C23861l0.C23867f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f69822xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69822xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69822xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69822xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69822xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69822xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69822xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.p326mm.biz.BizCgiProto.C243681.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$AdInfo */
    public static final class AdInfo extends C23861l0<AdInfo, Builder> implements AdInfoOrBuilder {
        public static final int AD_FETCH_CONTROL_FIELD_NUMBER = 3;
        public static final int AD_FETCH_INFO_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final AdInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<AdInfo> PARSER = null;
        public static final int TIMELINE_EXPOSURE_POS_FIELD_NUMBER = 1;
        public static final int USER_AGENT_FIELD_NUMBER = 2;
        private String adFetchControl_ = "";
        private String adFetchInfo_ = "";
        private int bitField0_;
        private int timelineExposurePos_;
        private String userAgent_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$AdInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<AdInfo, Builder> implements AdInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearAdFetchControl() {
                copyOnWrite();
                ((AdInfo) this.instance).clearAdFetchControl();
                return this;
            }

            public Builder clearAdFetchInfo() {
                copyOnWrite();
                ((AdInfo) this.instance).clearAdFetchInfo();
                return this;
            }

            public Builder clearTimelineExposurePos() {
                copyOnWrite();
                ((AdInfo) this.instance).clearTimelineExposurePos();
                return this;
            }

            public Builder clearUserAgent() {
                copyOnWrite();
                ((AdInfo) this.instance).clearUserAgent();
                return this;
            }

            public String getAdFetchControl() {
                return ((AdInfo) this.instance).getAdFetchControl();
            }

            public C16994k getAdFetchControlBytes() {
                return ((AdInfo) this.instance).getAdFetchControlBytes();
            }

            public String getAdFetchInfo() {
                return ((AdInfo) this.instance).getAdFetchInfo();
            }

            public C16994k getAdFetchInfoBytes() {
                return ((AdInfo) this.instance).getAdFetchInfoBytes();
            }

            public int getTimelineExposurePos() {
                return ((AdInfo) this.instance).getTimelineExposurePos();
            }

            public String getUserAgent() {
                return ((AdInfo) this.instance).getUserAgent();
            }

            public C16994k getUserAgentBytes() {
                return ((AdInfo) this.instance).getUserAgentBytes();
            }

            public boolean hasAdFetchControl() {
                return ((AdInfo) this.instance).hasAdFetchControl();
            }

            public boolean hasAdFetchInfo() {
                return ((AdInfo) this.instance).hasAdFetchInfo();
            }

            public boolean hasTimelineExposurePos() {
                return ((AdInfo) this.instance).hasTimelineExposurePos();
            }

            public boolean hasUserAgent() {
                return ((AdInfo) this.instance).hasUserAgent();
            }

            public Builder setAdFetchControl(String str) {
                copyOnWrite();
                ((AdInfo) this.instance).setAdFetchControl(str);
                return this;
            }

            public Builder setAdFetchControlBytes(C16994k kVar) {
                copyOnWrite();
                ((AdInfo) this.instance).setAdFetchControlBytes(kVar);
                return this;
            }

            public Builder setAdFetchInfo(String str) {
                copyOnWrite();
                ((AdInfo) this.instance).setAdFetchInfo(str);
                return this;
            }

            public Builder setAdFetchInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((AdInfo) this.instance).setAdFetchInfoBytes(kVar);
                return this;
            }

            public Builder setTimelineExposurePos(int i) {
                copyOnWrite();
                ((AdInfo) this.instance).setTimelineExposurePos(i);
                return this;
            }

            public Builder setUserAgent(String str) {
                copyOnWrite();
                ((AdInfo) this.instance).setUserAgent(str);
                return this;
            }

            public Builder setUserAgentBytes(C16994k kVar) {
                copyOnWrite();
                ((AdInfo) this.instance).setUserAgentBytes(kVar);
                return this;
            }

            private Builder() {
                super(AdInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            AdInfo adInfo = new AdInfo();
            DEFAULT_INSTANCE = adInfo;
            C23861l0.registerDefaultInstance(AdInfo.class, adInfo);
        }

        private AdInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAdFetchControl() {
            this.bitField0_ &= -5;
            this.adFetchControl_ = getDefaultInstance().getAdFetchControl();
        }

        /* access modifiers changed from: private */
        public void clearAdFetchInfo() {
            this.bitField0_ &= -9;
            this.adFetchInfo_ = getDefaultInstance().getAdFetchInfo();
        }

        /* access modifiers changed from: private */
        public void clearTimelineExposurePos() {
            this.bitField0_ &= -2;
            this.timelineExposurePos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserAgent() {
            this.bitField0_ &= -3;
            this.userAgent_ = getDefaultInstance().getUserAgent();
        }

        public static AdInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AdInfo parseDelimitedFrom(InputStream inputStream) {
            return (AdInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdInfo parseFrom(ByteBuffer byteBuffer) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<AdInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAdFetchControl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.adFetchControl_ = str;
        }

        /* access modifiers changed from: private */
        public void setAdFetchControlBytes(C16994k kVar) {
            this.adFetchControl_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setAdFetchInfo(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.adFetchInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setAdFetchInfoBytes(C16994k kVar) {
            this.adFetchInfo_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setTimelineExposurePos(int i) {
            this.bitField0_ |= 1;
            this.timelineExposurePos_ = i;
        }

        /* access modifiers changed from: private */
        public void setUserAgent(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.userAgent_ = str;
        }

        /* access modifiers changed from: private */
        public void setUserAgentBytes(C16994k kVar) {
            this.userAgent_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "timelineExposurePos_", "userAgent_", "adFetchControl_", "adFetchInfo_"});
                case 3:
                    return new AdInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<AdInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (AdInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAdFetchControl() {
            return this.adFetchControl_;
        }

        public C16994k getAdFetchControlBytes() {
            return C16994k.m16791k(this.adFetchControl_);
        }

        public String getAdFetchInfo() {
            return this.adFetchInfo_;
        }

        public C16994k getAdFetchInfoBytes() {
            return C16994k.m16791k(this.adFetchInfo_);
        }

        public int getTimelineExposurePos() {
            return this.timelineExposurePos_;
        }

        public String getUserAgent() {
            return this.userAgent_;
        }

        public C16994k getUserAgentBytes() {
            return C16994k.m16791k(this.userAgent_);
        }

        public boolean hasAdFetchControl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasAdFetchInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTimelineExposurePos() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUserAgent() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(AdInfo adInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(adInfo);
        }

        public static AdInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AdInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AdInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static AdInfo parseFrom(C16994k kVar) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static AdInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static AdInfo parseFrom(byte[] bArr) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AdInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static AdInfo parseFrom(InputStream inputStream) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AdInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AdInfo parseFrom(C23856l lVar) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static AdInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AdInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$AdInfoOrBuilder */
    public interface AdInfoOrBuilder extends C23848k1 {
        String getAdFetchControl();

        C16994k getAdFetchControlBytes();

        String getAdFetchInfo();

        C16994k getAdFetchInfoBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getTimelineExposurePos();

        String getUserAgent();

        C16994k getUserAgentBytes();

        boolean hasAdFetchControl();

        boolean hasAdFetchInfo();

        boolean hasTimelineExposurePos();

        boolean hasUserAgent();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BaseRequest */
    public static final class BaseRequest extends C23861l0<BaseRequest, Builder> implements BaseRequestOrBuilder {
        public static final int CLIENTVERSION_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final BaseRequest DEFAULT_INSTANCE;
        public static final int DEVICEID_FIELD_NUMBER = 3;
        public static final int DEVICETYPE_FIELD_NUMBER = 5;
        private static volatile C24062w1<BaseRequest> PARSER = null;
        public static final int SCENE_FIELD_NUMBER = 6;
        public static final int SESSIONKEY_FIELD_NUMBER = 1;
        public static final int UIN_FIELD_NUMBER = 2;
        private int bitField0_;
        private int clientVersion_;
        private C16994k deviceID_;
        private C16994k deviceType_;
        private byte memoizedIsInitialized = 2;
        private int scene_;
        private C16994k sessionKey_;
        private int uin_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BaseRequest$Builder */
        public static final class Builder extends C23861l0.C23862a<BaseRequest, Builder> implements BaseRequestOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearClientVersion() {
                copyOnWrite();
                ((BaseRequest) this.instance).clearClientVersion();
                return this;
            }

            public Builder clearDeviceID() {
                copyOnWrite();
                ((BaseRequest) this.instance).clearDeviceID();
                return this;
            }

            public Builder clearDeviceType() {
                copyOnWrite();
                ((BaseRequest) this.instance).clearDeviceType();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((BaseRequest) this.instance).clearScene();
                return this;
            }

            public Builder clearSessionKey() {
                copyOnWrite();
                ((BaseRequest) this.instance).clearSessionKey();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((BaseRequest) this.instance).clearUin();
                return this;
            }

            public int getClientVersion() {
                return ((BaseRequest) this.instance).getClientVersion();
            }

            public C16994k getDeviceID() {
                return ((BaseRequest) this.instance).getDeviceID();
            }

            public C16994k getDeviceType() {
                return ((BaseRequest) this.instance).getDeviceType();
            }

            public int getScene() {
                return ((BaseRequest) this.instance).getScene();
            }

            public C16994k getSessionKey() {
                return ((BaseRequest) this.instance).getSessionKey();
            }

            public int getUin() {
                return ((BaseRequest) this.instance).getUin();
            }

            public boolean hasClientVersion() {
                return ((BaseRequest) this.instance).hasClientVersion();
            }

            public boolean hasDeviceID() {
                return ((BaseRequest) this.instance).hasDeviceID();
            }

            public boolean hasDeviceType() {
                return ((BaseRequest) this.instance).hasDeviceType();
            }

            public boolean hasScene() {
                return ((BaseRequest) this.instance).hasScene();
            }

            public boolean hasSessionKey() {
                return ((BaseRequest) this.instance).hasSessionKey();
            }

            public boolean hasUin() {
                return ((BaseRequest) this.instance).hasUin();
            }

            public Builder setClientVersion(int i) {
                copyOnWrite();
                ((BaseRequest) this.instance).setClientVersion(i);
                return this;
            }

            public Builder setDeviceID(C16994k kVar) {
                copyOnWrite();
                ((BaseRequest) this.instance).setDeviceID(kVar);
                return this;
            }

            public Builder setDeviceType(C16994k kVar) {
                copyOnWrite();
                ((BaseRequest) this.instance).setDeviceType(kVar);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((BaseRequest) this.instance).setScene(i);
                return this;
            }

            public Builder setSessionKey(C16994k kVar) {
                copyOnWrite();
                ((BaseRequest) this.instance).setSessionKey(kVar);
                return this;
            }

            public Builder setUin(int i) {
                copyOnWrite();
                ((BaseRequest) this.instance).setUin(i);
                return this;
            }

            private Builder() {
                super(BaseRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            BaseRequest baseRequest = new BaseRequest();
            DEFAULT_INSTANCE = baseRequest;
            C23861l0.registerDefaultInstance(BaseRequest.class, baseRequest);
        }

        private BaseRequest() {
            C16994k kVar = C16994k.f46000e;
            this.sessionKey_ = kVar;
            this.deviceID_ = kVar;
            this.deviceType_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearClientVersion() {
            this.bitField0_ &= -9;
            this.clientVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeviceID() {
            this.bitField0_ &= -5;
            this.deviceID_ = getDefaultInstance().getDeviceID();
        }

        /* access modifiers changed from: private */
        public void clearDeviceType() {
            this.bitField0_ &= -17;
            this.deviceType_ = getDefaultInstance().getDeviceType();
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -33;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionKey() {
            this.bitField0_ &= -2;
            this.sessionKey_ = getDefaultInstance().getSessionKey();
        }

        /* access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -3;
            this.uin_ = 0;
        }

        public static BaseRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BaseRequest parseDelimitedFrom(InputStream inputStream) {
            return (BaseRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BaseRequest parseFrom(ByteBuffer byteBuffer) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BaseRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClientVersion(int i) {
            this.bitField0_ |= 8;
            this.clientVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setDeviceID(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.deviceID_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setDeviceType(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.deviceType_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 32;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.sessionKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setUin(int i) {
            this.bitField0_ |= 2;
            this.uin_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᔊ\u0000\u0002ᔋ\u0001\u0003ᔊ\u0002\u0004ᔄ\u0003\u0005ᔊ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "sessionKey_", "uin_", "deviceID_", "clientVersion_", "deviceType_", "scene_"});
                case 3:
                    return new BaseRequest();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BaseRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BaseRequest.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getClientVersion() {
            return this.clientVersion_;
        }

        public C16994k getDeviceID() {
            return this.deviceID_;
        }

        public C16994k getDeviceType() {
            return this.deviceType_;
        }

        public int getScene() {
            return this.scene_;
        }

        public C16994k getSessionKey() {
            return this.sessionKey_;
        }

        public int getUin() {
            return this.uin_;
        }

        public boolean hasClientVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDeviceID() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDeviceType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSessionKey() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUin() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BaseRequest baseRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(baseRequest);
        }

        public static BaseRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BaseRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BaseRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BaseRequest parseFrom(C16994k kVar) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BaseRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BaseRequest parseFrom(byte[] bArr) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BaseRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BaseRequest parseFrom(InputStream inputStream) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BaseRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BaseRequest parseFrom(C23856l lVar) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BaseRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BaseRequestOrBuilder */
    public interface BaseRequestOrBuilder extends C23848k1 {
        int getClientVersion();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getDeviceID();

        C16994k getDeviceType();

        int getScene();

        C16994k getSessionKey();

        int getUin();

        boolean hasClientVersion();

        boolean hasDeviceID();

        boolean hasDeviceType();

        boolean hasScene();

        boolean hasSessionKey();

        boolean hasUin();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BaseResponse */
    public static final class BaseResponse extends C23861l0<BaseResponse, Builder> implements BaseResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final BaseResponse DEFAULT_INSTANCE;
        public static final int ERRMSG_FIELD_NUMBER = 2;
        private static volatile C24062w1<BaseResponse> PARSER = null;
        public static final int RET_FIELD_NUMBER = 1;
        private int bitField0_;
        private SKBuiltinString_t errMsg_;
        private byte memoizedIsInitialized = 2;
        private int ret_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BaseResponse$Builder */
        public static final class Builder extends C23861l0.C23862a<BaseResponse, Builder> implements BaseResponseOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearErrMsg() {
                copyOnWrite();
                ((BaseResponse) this.instance).clearErrMsg();
                return this;
            }

            public Builder clearRet() {
                copyOnWrite();
                ((BaseResponse) this.instance).clearRet();
                return this;
            }

            public SKBuiltinString_t getErrMsg() {
                return ((BaseResponse) this.instance).getErrMsg();
            }

            public int getRet() {
                return ((BaseResponse) this.instance).getRet();
            }

            public boolean hasErrMsg() {
                return ((BaseResponse) this.instance).hasErrMsg();
            }

            public boolean hasRet() {
                return ((BaseResponse) this.instance).hasRet();
            }

            public Builder mergeErrMsg(SKBuiltinString_t sKBuiltinString_t) {
                copyOnWrite();
                ((BaseResponse) this.instance).mergeErrMsg(sKBuiltinString_t);
                return this;
            }

            public Builder setErrMsg(SKBuiltinString_t sKBuiltinString_t) {
                copyOnWrite();
                ((BaseResponse) this.instance).setErrMsg(sKBuiltinString_t);
                return this;
            }

            public Builder setRet(int i) {
                copyOnWrite();
                ((BaseResponse) this.instance).setRet(i);
                return this;
            }

            private Builder() {
                super(BaseResponse.DEFAULT_INSTANCE);
            }

            public Builder setErrMsg(SKBuiltinString_t.Builder builder) {
                copyOnWrite();
                ((BaseResponse) this.instance).setErrMsg((SKBuiltinString_t) builder.build());
                return this;
            }
        }

        static {
            BaseResponse baseResponse = new BaseResponse();
            DEFAULT_INSTANCE = baseResponse;
            C23861l0.registerDefaultInstance(BaseResponse.class, baseResponse);
        }

        private BaseResponse() {
        }

        /* access modifiers changed from: private */
        public void clearErrMsg() {
            this.errMsg_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearRet() {
            this.bitField0_ &= -2;
            this.ret_ = 0;
        }

        public static BaseResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeErrMsg(SKBuiltinString_t sKBuiltinString_t) {
            sKBuiltinString_t.getClass();
            SKBuiltinString_t sKBuiltinString_t2 = this.errMsg_;
            if (sKBuiltinString_t2 == null || sKBuiltinString_t2 == SKBuiltinString_t.getDefaultInstance()) {
                this.errMsg_ = sKBuiltinString_t;
            } else {
                this.errMsg_ = (SKBuiltinString_t) ((SKBuiltinString_t.Builder) SKBuiltinString_t.newBuilder(this.errMsg_).mergeFrom(sKBuiltinString_t)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BaseResponse parseDelimitedFrom(InputStream inputStream) {
            return (BaseResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BaseResponse parseFrom(ByteBuffer byteBuffer) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BaseResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setErrMsg(SKBuiltinString_t sKBuiltinString_t) {
            sKBuiltinString_t.getClass();
            this.errMsg_ = sKBuiltinString_t;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setRet(int i) {
            this.bitField0_ |= 1;
            this.ret_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔉ\u0001", new Object[]{"bitField0_", "ret_", "errMsg_"});
                case 3:
                    return new BaseResponse();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BaseResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BaseResponse.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public SKBuiltinString_t getErrMsg() {
            SKBuiltinString_t sKBuiltinString_t = this.errMsg_;
            return sKBuiltinString_t == null ? SKBuiltinString_t.getDefaultInstance() : sKBuiltinString_t;
        }

        public int getRet() {
            return this.ret_;
        }

        public boolean hasErrMsg() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRet() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BaseResponse baseResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(baseResponse);
        }

        public static BaseResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BaseResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BaseResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BaseResponse parseFrom(C16994k kVar) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BaseResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BaseResponse parseFrom(byte[] bArr) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BaseResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BaseResponse parseFrom(InputStream inputStream) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BaseResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BaseResponse parseFrom(C23856l lVar) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BaseResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BaseResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BaseResponseOrBuilder */
    public interface BaseResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        SKBuiltinString_t getErrMsg();

        int getRet();

        boolean hasErrMsg();

        boolean hasRet();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortContext */
    public static final class BizMsgReSortContext extends C23861l0<BizMsgReSortContext, Builder> implements BizMsgReSortContextOrBuilder {
        public static final int CONTEXT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizMsgReSortContext DEFAULT_INSTANCE;
        public static final int MAX_WEIGHT_FIELD_NUMBER = 3;
        public static final int OFTEN_READ_BIZUSERNAME_FIELD_NUMBER = 2;
        private static volatile C24062w1<BizMsgReSortContext> PARSER;
        private int bitField0_;
        private C23908o0.C23919j<BizMsgReSortItemContext> context_ = C23861l0.emptyProtobufList();
        private int maxWeight_;
        private String oftenReadBizusername_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortContext$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortContext, Builder> implements BizMsgReSortContextOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder addAllContext(Iterable<? extends BizMsgReSortItemContext> iterable) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).addAllContext(iterable);
                return this;
            }

            public Builder addContext(BizMsgReSortItemContext bizMsgReSortItemContext) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).addContext(bizMsgReSortItemContext);
                return this;
            }

            public Builder clearContext() {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).clearContext();
                return this;
            }

            public Builder clearMaxWeight() {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).clearMaxWeight();
                return this;
            }

            public Builder clearOftenReadBizusername() {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).clearOftenReadBizusername();
                return this;
            }

            public BizMsgReSortItemContext getContext(int i) {
                return ((BizMsgReSortContext) this.instance).getContext(i);
            }

            public int getContextCount() {
                return ((BizMsgReSortContext) this.instance).getContextCount();
            }

            public List<BizMsgReSortItemContext> getContextList() {
                return Collections.unmodifiableList(((BizMsgReSortContext) this.instance).getContextList());
            }

            public int getMaxWeight() {
                return ((BizMsgReSortContext) this.instance).getMaxWeight();
            }

            public String getOftenReadBizusername() {
                return ((BizMsgReSortContext) this.instance).getOftenReadBizusername();
            }

            public C16994k getOftenReadBizusernameBytes() {
                return ((BizMsgReSortContext) this.instance).getOftenReadBizusernameBytes();
            }

            public boolean hasMaxWeight() {
                return ((BizMsgReSortContext) this.instance).hasMaxWeight();
            }

            public boolean hasOftenReadBizusername() {
                return ((BizMsgReSortContext) this.instance).hasOftenReadBizusername();
            }

            public Builder removeContext(int i) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).removeContext(i);
                return this;
            }

            public Builder setContext(int i, BizMsgReSortItemContext bizMsgReSortItemContext) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).setContext(i, bizMsgReSortItemContext);
                return this;
            }

            public Builder setMaxWeight(int i) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).setMaxWeight(i);
                return this;
            }

            public Builder setOftenReadBizusername(String str) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).setOftenReadBizusername(str);
                return this;
            }

            public Builder setOftenReadBizusernameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).setOftenReadBizusernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizMsgReSortContext.DEFAULT_INSTANCE);
            }

            public Builder addContext(int i, BizMsgReSortItemContext bizMsgReSortItemContext) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).addContext(i, bizMsgReSortItemContext);
                return this;
            }

            public Builder setContext(int i, BizMsgReSortItemContext.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).setContext(i, (BizMsgReSortItemContext) builder.build());
                return this;
            }

            public Builder addContext(BizMsgReSortItemContext.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).addContext((BizMsgReSortItemContext) builder.build());
                return this;
            }

            public Builder addContext(int i, BizMsgReSortItemContext.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortContext) this.instance).addContext(i, (BizMsgReSortItemContext) builder.build());
                return this;
            }
        }

        static {
            BizMsgReSortContext bizMsgReSortContext = new BizMsgReSortContext();
            DEFAULT_INSTANCE = bizMsgReSortContext;
            C23861l0.registerDefaultInstance(BizMsgReSortContext.class, bizMsgReSortContext);
        }

        private BizMsgReSortContext() {
        }

        /* access modifiers changed from: private */
        public void addAllContext(Iterable<? extends BizMsgReSortItemContext> iterable) {
            ensureContextIsMutable();
            C23810b.addAll(iterable, this.context_);
        }

        /* access modifiers changed from: private */
        public void addContext(BizMsgReSortItemContext bizMsgReSortItemContext) {
            bizMsgReSortItemContext.getClass();
            ensureContextIsMutable();
            this.context_.add(bizMsgReSortItemContext);
        }

        /* access modifiers changed from: private */
        public void clearContext() {
            this.context_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMaxWeight() {
            this.bitField0_ &= -3;
            this.maxWeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOftenReadBizusername() {
            this.bitField0_ &= -2;
            this.oftenReadBizusername_ = getDefaultInstance().getOftenReadBizusername();
        }

        private void ensureContextIsMutable() {
            C23908o0.C23919j<BizMsgReSortItemContext> jVar = this.context_;
            if (!jVar.mo37523Q()) {
                this.context_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizMsgReSortContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortContext parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortContext parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeContext(int i) {
            ensureContextIsMutable();
            this.context_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setContext(int i, BizMsgReSortItemContext bizMsgReSortItemContext) {
            bizMsgReSortItemContext.getClass();
            ensureContextIsMutable();
            this.context_.set(i, bizMsgReSortItemContext);
        }

        /* access modifiers changed from: private */
        public void setMaxWeight(int i) {
            this.bitField0_ |= 2;
            this.maxWeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setOftenReadBizusername(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.oftenReadBizusername_ = str;
        }

        /* access modifiers changed from: private */
        public void setOftenReadBizusernameBytes(C16994k kVar) {
            this.oftenReadBizusername_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဋ\u0001", new Object[]{"bitField0_", "context_", BizMsgReSortItemContext.class, "oftenReadBizusername_", "maxWeight_"});
                case 3:
                    return new BizMsgReSortContext();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortContext.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public BizMsgReSortItemContext getContext(int i) {
            return this.context_.get(i);
        }

        public int getContextCount() {
            return this.context_.size();
        }

        public List<BizMsgReSortItemContext> getContextList() {
            return this.context_;
        }

        public BizMsgReSortItemContextOrBuilder getContextOrBuilder(int i) {
            return this.context_.get(i);
        }

        public List<? extends BizMsgReSortItemContextOrBuilder> getContextOrBuilderList() {
            return this.context_;
        }

        public int getMaxWeight() {
            return this.maxWeight_;
        }

        public String getOftenReadBizusername() {
            return this.oftenReadBizusername_;
        }

        public C16994k getOftenReadBizusernameBytes() {
            return C16994k.m16791k(this.oftenReadBizusername_);
        }

        public boolean hasMaxWeight() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOftenReadBizusername() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgReSortContext bizMsgReSortContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortContext);
        }

        public static BizMsgReSortContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortContext parseFrom(C16994k kVar) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addContext(int i, BizMsgReSortItemContext bizMsgReSortItemContext) {
            bizMsgReSortItemContext.getClass();
            ensureContextIsMutable();
            this.context_.add(i, bizMsgReSortItemContext);
        }

        public static BizMsgReSortContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortContext parseFrom(byte[] bArr) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortContext parseFrom(InputStream inputStream) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortContext parseFrom(C23856l lVar) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortContextOrBuilder */
    public interface BizMsgReSortContextOrBuilder extends C23848k1 {
        BizMsgReSortItemContext getContext(int i);

        int getContextCount();

        List<BizMsgReSortItemContext> getContextList();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getMaxWeight();

        String getOftenReadBizusername();

        C16994k getOftenReadBizusernameBytes();

        boolean hasMaxWeight();

        boolean hasOftenReadBizusername();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortItemContext */
    public static final class BizMsgReSortItemContext extends C23861l0<BizMsgReSortItemContext, Builder> implements BizMsgReSortItemContextOrBuilder {
        public static final int COMM_CONTEXT_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizMsgReSortItemContext DEFAULT_INSTANCE;
        public static final int IS_REQ_MSG_FIELD_NUMBER = 2;
        private static volatile C24062w1<BizMsgReSortItemContext> PARSER;
        private int bitField0_;
        private CommItemContext commContext_;
        private boolean isReqMsg_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortItemContext$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortItemContext, Builder> implements BizMsgReSortItemContextOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearCommContext() {
                copyOnWrite();
                ((BizMsgReSortItemContext) this.instance).clearCommContext();
                return this;
            }

            public Builder clearIsReqMsg() {
                copyOnWrite();
                ((BizMsgReSortItemContext) this.instance).clearIsReqMsg();
                return this;
            }

            public CommItemContext getCommContext() {
                return ((BizMsgReSortItemContext) this.instance).getCommContext();
            }

            public boolean getIsReqMsg() {
                return ((BizMsgReSortItemContext) this.instance).getIsReqMsg();
            }

            public boolean hasCommContext() {
                return ((BizMsgReSortItemContext) this.instance).hasCommContext();
            }

            public boolean hasIsReqMsg() {
                return ((BizMsgReSortItemContext) this.instance).hasIsReqMsg();
            }

            public Builder mergeCommContext(CommItemContext commItemContext) {
                copyOnWrite();
                ((BizMsgReSortItemContext) this.instance).mergeCommContext(commItemContext);
                return this;
            }

            public Builder setCommContext(CommItemContext commItemContext) {
                copyOnWrite();
                ((BizMsgReSortItemContext) this.instance).setCommContext(commItemContext);
                return this;
            }

            public Builder setIsReqMsg(boolean z) {
                copyOnWrite();
                ((BizMsgReSortItemContext) this.instance).setIsReqMsg(z);
                return this;
            }

            private Builder() {
                super(BizMsgReSortItemContext.DEFAULT_INSTANCE);
            }

            public Builder setCommContext(CommItemContext.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortItemContext) this.instance).setCommContext((CommItemContext) builder.build());
                return this;
            }
        }

        static {
            BizMsgReSortItemContext bizMsgReSortItemContext = new BizMsgReSortItemContext();
            DEFAULT_INSTANCE = bizMsgReSortItemContext;
            C23861l0.registerDefaultInstance(BizMsgReSortItemContext.class, bizMsgReSortItemContext);
        }

        private BizMsgReSortItemContext() {
        }

        /* access modifiers changed from: private */
        public void clearCommContext() {
            this.commContext_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearIsReqMsg() {
            this.bitField0_ &= -3;
            this.isReqMsg_ = false;
        }

        public static BizMsgReSortItemContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCommContext(CommItemContext commItemContext) {
            commItemContext.getClass();
            CommItemContext commItemContext2 = this.commContext_;
            if (commItemContext2 == null || commItemContext2 == CommItemContext.getDefaultInstance()) {
                this.commContext_ = commItemContext;
            } else {
                this.commContext_ = (CommItemContext) ((CommItemContext.Builder) CommItemContext.newBuilder(this.commContext_).mergeFrom(commItemContext)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortItemContext parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortItemContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortItemContext parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortItemContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCommContext(CommItemContext commItemContext) {
            commItemContext.getClass();
            this.commContext_ = commItemContext;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setIsReqMsg(boolean z) {
            this.bitField0_ |= 2;
            this.isReqMsg_ = z;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "commContext_", "isReqMsg_"});
                case 3:
                    return new BizMsgReSortItemContext();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortItemContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortItemContext.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public CommItemContext getCommContext() {
            CommItemContext commItemContext = this.commContext_;
            return commItemContext == null ? CommItemContext.getDefaultInstance() : commItemContext;
        }

        public boolean getIsReqMsg() {
            return this.isReqMsg_;
        }

        public boolean hasCommContext() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIsReqMsg() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BizMsgReSortItemContext bizMsgReSortItemContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortItemContext);
        }

        public static BizMsgReSortItemContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortItemContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortItemContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortItemContext parseFrom(C16994k kVar) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgReSortItemContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortItemContext parseFrom(byte[] bArr) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortItemContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortItemContext parseFrom(InputStream inputStream) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortItemContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortItemContext parseFrom(C23856l lVar) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortItemContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortItemContextOrBuilder */
    public interface BizMsgReSortItemContextOrBuilder extends C23848k1 {
        CommItemContext getCommContext();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getIsReqMsg();

        boolean hasCommContext();

        boolean hasIsReqMsg();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Buffer */
    public static final class BizMsgReSortV2Buffer extends C23861l0<BizMsgReSortV2Buffer, Builder> implements BizMsgReSortV2BufferOrBuilder {
        /* access modifiers changed from: private */
        public static final BizMsgReSortV2Buffer DEFAULT_INSTANCE;
        public static final int LAST_RESORT_TIME_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizMsgReSortV2Buffer> PARSER;
        private int bitField0_;
        private int lastResortTime_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Buffer$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortV2Buffer, Builder> implements BizMsgReSortV2BufferOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearLastResortTime() {
                copyOnWrite();
                ((BizMsgReSortV2Buffer) this.instance).clearLastResortTime();
                return this;
            }

            public int getLastResortTime() {
                return ((BizMsgReSortV2Buffer) this.instance).getLastResortTime();
            }

            public boolean hasLastResortTime() {
                return ((BizMsgReSortV2Buffer) this.instance).hasLastResortTime();
            }

            public Builder setLastResortTime(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Buffer) this.instance).setLastResortTime(i);
                return this;
            }

            private Builder() {
                super(BizMsgReSortV2Buffer.DEFAULT_INSTANCE);
            }
        }

        static {
            BizMsgReSortV2Buffer bizMsgReSortV2Buffer = new BizMsgReSortV2Buffer();
            DEFAULT_INSTANCE = bizMsgReSortV2Buffer;
            C23861l0.registerDefaultInstance(BizMsgReSortV2Buffer.class, bizMsgReSortV2Buffer);
        }

        private BizMsgReSortV2Buffer() {
        }

        /* access modifiers changed from: private */
        public void clearLastResortTime() {
            this.bitField0_ &= -2;
            this.lastResortTime_ = 0;
        }

        public static BizMsgReSortV2Buffer getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortV2Buffer parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortV2Buffer) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2Buffer parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortV2Buffer> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLastResortTime(int i) {
            this.bitField0_ |= 1;
            this.lastResortTime_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"bitField0_", "lastResortTime_"});
                case 3:
                    return new BizMsgReSortV2Buffer();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortV2Buffer> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortV2Buffer.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getLastResortTime() {
            return this.lastResortTime_;
        }

        public boolean hasLastResortTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgReSortV2Buffer bizMsgReSortV2Buffer) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortV2Buffer);
        }

        public static BizMsgReSortV2Buffer parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2Buffer) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2Buffer parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortV2Buffer parseFrom(C16994k kVar) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgReSortV2Buffer parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortV2Buffer parseFrom(byte[] bArr) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortV2Buffer parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortV2Buffer parseFrom(InputStream inputStream) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2Buffer parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2Buffer parseFrom(C23856l lVar) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortV2Buffer parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortV2Buffer) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2BufferOrBuilder */
    public interface BizMsgReSortV2BufferOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getLastResortTime();

        boolean hasLastResortTime();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Req */
    public static final class BizMsgReSortV2Req extends C23861l0<BizMsgReSortV2Req, Builder> implements BizMsgReSortV2ReqOrBuilder {
        public static final int AD_INFO_FIELD_NUMBER = 14;
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int BUFFER_FIELD_NUMBER = 4;
        public static final int CONTEXT_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final BizMsgReSortV2Req DEFAULT_INSTANCE;
        public static final int ENV_FIELD_NUMBER = 11;
        public static final int MSG_BOX_EXPOSE_INFO_FIELD_NUMBER = 8;
        private static volatile C24062w1<BizMsgReSortV2Req> PARSER = null;
        public static final int PRE_CARD_FIELD_NUMBER = 2;
        public static final int REC_CARD_EXPOSE_INFO_FIELD_NUMBER = 10;
        public static final int REC_FEEDS_REQ_FIELD_NUMBER = 13;
        public static final int REMAIN_CARD_FIELD_NUMBER = 3;
        public static final int SCENE_FIELD_NUMBER = 5;
        public static final int SESSION_ID_FIELD_NUMBER = 6;
        public static final int UNREAD_MSG_CNT_FIELD_NUMBER = 7;
        private AdInfo adInfo_;
        private BaseRequest baseRequest_;
        private int bitField0_;
        private String buffer_ = "";
        private BizMsgResortV2Context context_;
        private BizMsgResortV2Env env_;
        private byte memoizedIsInitialized = 2;
        private MsgBoxExposeInfo msgBoxExposeInfo_;
        private C23908o0.C23919j<MsgCard> preCard_ = C23861l0.emptyProtobufList();
        private RecCardExposeInfo recCardExposeInfo_;
        private GetRecommendFeedsRequest recFeedsReq_;
        private C23908o0.C23919j<MsgCard> remainCard_ = C23861l0.emptyProtobufList();
        private int scene_;
        private int sessionId_;
        private int unreadMsgCnt_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Req$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortV2Req, Builder> implements BizMsgReSortV2ReqOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder addAllPreCard(Iterable<? extends MsgCard> iterable) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addAllPreCard(iterable);
                return this;
            }

            public Builder addAllRemainCard(Iterable<? extends MsgCard> iterable) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addAllRemainCard(iterable);
                return this;
            }

            public Builder addPreCard(MsgCard msgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addPreCard(msgCard);
                return this;
            }

            public Builder addRemainCard(MsgCard msgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addRemainCard(msgCard);
                return this;
            }

            public Builder clearAdInfo() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearAdInfo();
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearBuffer();
                return this;
            }

            public Builder clearContext() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearContext();
                return this;
            }

            public Builder clearEnv() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearEnv();
                return this;
            }

            public Builder clearMsgBoxExposeInfo() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearMsgBoxExposeInfo();
                return this;
            }

            public Builder clearPreCard() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearPreCard();
                return this;
            }

            public Builder clearRecCardExposeInfo() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearRecCardExposeInfo();
                return this;
            }

            public Builder clearRecFeedsReq() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearRecFeedsReq();
                return this;
            }

            public Builder clearRemainCard() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearRemainCard();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearScene();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearSessionId();
                return this;
            }

            public Builder clearUnreadMsgCnt() {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).clearUnreadMsgCnt();
                return this;
            }

            public AdInfo getAdInfo() {
                return ((BizMsgReSortV2Req) this.instance).getAdInfo();
            }

            public BaseRequest getBaseRequest() {
                return ((BizMsgReSortV2Req) this.instance).getBaseRequest();
            }

            public String getBuffer() {
                return ((BizMsgReSortV2Req) this.instance).getBuffer();
            }

            public C16994k getBufferBytes() {
                return ((BizMsgReSortV2Req) this.instance).getBufferBytes();
            }

            public BizMsgResortV2Context getContext() {
                return ((BizMsgReSortV2Req) this.instance).getContext();
            }

            public BizMsgResortV2Env getEnv() {
                return ((BizMsgReSortV2Req) this.instance).getEnv();
            }

            public MsgBoxExposeInfo getMsgBoxExposeInfo() {
                return ((BizMsgReSortV2Req) this.instance).getMsgBoxExposeInfo();
            }

            public MsgCard getPreCard(int i) {
                return ((BizMsgReSortV2Req) this.instance).getPreCard(i);
            }

            public int getPreCardCount() {
                return ((BizMsgReSortV2Req) this.instance).getPreCardCount();
            }

            public List<MsgCard> getPreCardList() {
                return Collections.unmodifiableList(((BizMsgReSortV2Req) this.instance).getPreCardList());
            }

            public RecCardExposeInfo getRecCardExposeInfo() {
                return ((BizMsgReSortV2Req) this.instance).getRecCardExposeInfo();
            }

            public GetRecommendFeedsRequest getRecFeedsReq() {
                return ((BizMsgReSortV2Req) this.instance).getRecFeedsReq();
            }

            public MsgCard getRemainCard(int i) {
                return ((BizMsgReSortV2Req) this.instance).getRemainCard(i);
            }

            public int getRemainCardCount() {
                return ((BizMsgReSortV2Req) this.instance).getRemainCardCount();
            }

            public List<MsgCard> getRemainCardList() {
                return Collections.unmodifiableList(((BizMsgReSortV2Req) this.instance).getRemainCardList());
            }

            public int getScene() {
                return ((BizMsgReSortV2Req) this.instance).getScene();
            }

            public int getSessionId() {
                return ((BizMsgReSortV2Req) this.instance).getSessionId();
            }

            public int getUnreadMsgCnt() {
                return ((BizMsgReSortV2Req) this.instance).getUnreadMsgCnt();
            }

            public boolean hasAdInfo() {
                return ((BizMsgReSortV2Req) this.instance).hasAdInfo();
            }

            public boolean hasBaseRequest() {
                return ((BizMsgReSortV2Req) this.instance).hasBaseRequest();
            }

            public boolean hasBuffer() {
                return ((BizMsgReSortV2Req) this.instance).hasBuffer();
            }

            public boolean hasContext() {
                return ((BizMsgReSortV2Req) this.instance).hasContext();
            }

            public boolean hasEnv() {
                return ((BizMsgReSortV2Req) this.instance).hasEnv();
            }

            public boolean hasMsgBoxExposeInfo() {
                return ((BizMsgReSortV2Req) this.instance).hasMsgBoxExposeInfo();
            }

            public boolean hasRecCardExposeInfo() {
                return ((BizMsgReSortV2Req) this.instance).hasRecCardExposeInfo();
            }

            public boolean hasRecFeedsReq() {
                return ((BizMsgReSortV2Req) this.instance).hasRecFeedsReq();
            }

            public boolean hasScene() {
                return ((BizMsgReSortV2Req) this.instance).hasScene();
            }

            public boolean hasSessionId() {
                return ((BizMsgReSortV2Req) this.instance).hasSessionId();
            }

            public boolean hasUnreadMsgCnt() {
                return ((BizMsgReSortV2Req) this.instance).hasUnreadMsgCnt();
            }

            public Builder mergeAdInfo(AdInfo adInfo) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeAdInfo(adInfo);
                return this;
            }

            public Builder mergeBaseRequest(BaseRequest baseRequest) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeContext(BizMsgResortV2Context bizMsgResortV2Context) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeContext(bizMsgResortV2Context);
                return this;
            }

            public Builder mergeEnv(BizMsgResortV2Env bizMsgResortV2Env) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeEnv(bizMsgResortV2Env);
                return this;
            }

            public Builder mergeMsgBoxExposeInfo(MsgBoxExposeInfo msgBoxExposeInfo) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeMsgBoxExposeInfo(msgBoxExposeInfo);
                return this;
            }

            public Builder mergeRecCardExposeInfo(RecCardExposeInfo recCardExposeInfo) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeRecCardExposeInfo(recCardExposeInfo);
                return this;
            }

            public Builder mergeRecFeedsReq(GetRecommendFeedsRequest getRecommendFeedsRequest) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).mergeRecFeedsReq(getRecommendFeedsRequest);
                return this;
            }

            public Builder removePreCard(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).removePreCard(i);
                return this;
            }

            public Builder removeRemainCard(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).removeRemainCard(i);
                return this;
            }

            public Builder setAdInfo(AdInfo adInfo) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setAdInfo(adInfo);
                return this;
            }

            public Builder setBaseRequest(BaseRequest baseRequest) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setBuffer(String str) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setBuffer(str);
                return this;
            }

            public Builder setBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setBufferBytes(kVar);
                return this;
            }

            public Builder setContext(BizMsgResortV2Context bizMsgResortV2Context) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setContext(bizMsgResortV2Context);
                return this;
            }

            public Builder setEnv(BizMsgResortV2Env bizMsgResortV2Env) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setEnv(bizMsgResortV2Env);
                return this;
            }

            public Builder setMsgBoxExposeInfo(MsgBoxExposeInfo msgBoxExposeInfo) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setMsgBoxExposeInfo(msgBoxExposeInfo);
                return this;
            }

            public Builder setPreCard(int i, MsgCard msgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setPreCard(i, msgCard);
                return this;
            }

            public Builder setRecCardExposeInfo(RecCardExposeInfo recCardExposeInfo) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setRecCardExposeInfo(recCardExposeInfo);
                return this;
            }

            public Builder setRecFeedsReq(GetRecommendFeedsRequest getRecommendFeedsRequest) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setRecFeedsReq(getRecommendFeedsRequest);
                return this;
            }

            public Builder setRemainCard(int i, MsgCard msgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setRemainCard(i, msgCard);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setScene(i);
                return this;
            }

            public Builder setSessionId(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setSessionId(i);
                return this;
            }

            public Builder setUnreadMsgCnt(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setUnreadMsgCnt(i);
                return this;
            }

            private Builder() {
                super(BizMsgReSortV2Req.DEFAULT_INSTANCE);
            }

            public Builder addPreCard(int i, MsgCard msgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addPreCard(i, msgCard);
                return this;
            }

            public Builder addRemainCard(int i, MsgCard msgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addRemainCard(i, msgCard);
                return this;
            }

            public Builder setAdInfo(AdInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setAdInfo((AdInfo) builder.build());
                return this;
            }

            public Builder setBaseRequest(BaseRequest.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setBaseRequest((BaseRequest) builder.build());
                return this;
            }

            public Builder setContext(BizMsgResortV2Context.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setContext((BizMsgResortV2Context) builder.build());
                return this;
            }

            public Builder setEnv(BizMsgResortV2Env.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setEnv((BizMsgResortV2Env) builder.build());
                return this;
            }

            public Builder setMsgBoxExposeInfo(MsgBoxExposeInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setMsgBoxExposeInfo((MsgBoxExposeInfo) builder.build());
                return this;
            }

            public Builder setPreCard(int i, MsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setPreCard(i, (MsgCard) builder.build());
                return this;
            }

            public Builder setRecCardExposeInfo(RecCardExposeInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setRecCardExposeInfo((RecCardExposeInfo) builder.build());
                return this;
            }

            public Builder setRecFeedsReq(GetRecommendFeedsRequest.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setRecFeedsReq((GetRecommendFeedsRequest) builder.build());
                return this;
            }

            public Builder setRemainCard(int i, MsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).setRemainCard(i, (MsgCard) builder.build());
                return this;
            }

            public Builder addPreCard(MsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addPreCard((MsgCard) builder.build());
                return this;
            }

            public Builder addRemainCard(MsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addRemainCard((MsgCard) builder.build());
                return this;
            }

            public Builder addPreCard(int i, MsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addPreCard(i, (MsgCard) builder.build());
                return this;
            }

            public Builder addRemainCard(int i, MsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Req) this.instance).addRemainCard(i, (MsgCard) builder.build());
                return this;
            }
        }

        static {
            BizMsgReSortV2Req bizMsgReSortV2Req = new BizMsgReSortV2Req();
            DEFAULT_INSTANCE = bizMsgReSortV2Req;
            C23861l0.registerDefaultInstance(BizMsgReSortV2Req.class, bizMsgReSortV2Req);
        }

        private BizMsgReSortV2Req() {
        }

        /* access modifiers changed from: private */
        public void addAllPreCard(Iterable<? extends MsgCard> iterable) {
            ensurePreCardIsMutable();
            C23810b.addAll(iterable, this.preCard_);
        }

        /* access modifiers changed from: private */
        public void addAllRemainCard(Iterable<? extends MsgCard> iterable) {
            ensureRemainCardIsMutable();
            C23810b.addAll(iterable, this.remainCard_);
        }

        /* access modifiers changed from: private */
        public void addPreCard(MsgCard msgCard) {
            msgCard.getClass();
            ensurePreCardIsMutable();
            this.preCard_.add(msgCard);
        }

        /* access modifiers changed from: private */
        public void addRemainCard(MsgCard msgCard) {
            msgCard.getClass();
            ensureRemainCardIsMutable();
            this.remainCard_.add(msgCard);
        }

        /* access modifiers changed from: private */
        public void clearAdInfo() {
            this.adInfo_ = null;
            this.bitField0_ &= -1025;
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -3;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearContext() {
            this.context_ = null;
            this.bitField0_ &= -65;
        }

        /* access modifiers changed from: private */
        public void clearEnv() {
            this.env_ = null;
            this.bitField0_ &= -257;
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposeInfo() {
            this.msgBoxExposeInfo_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearPreCard() {
            this.preCard_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearRecCardExposeInfo() {
            this.recCardExposeInfo_ = null;
            this.bitField0_ &= -129;
        }

        /* access modifiers changed from: private */
        public void clearRecFeedsReq() {
            this.recFeedsReq_ = null;
            this.bitField0_ &= -513;
        }

        /* access modifiers changed from: private */
        public void clearRemainCard() {
            this.remainCard_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -5;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -9;
            this.sessionId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUnreadMsgCnt() {
            this.bitField0_ &= -17;
            this.unreadMsgCnt_ = 0;
        }

        private void ensurePreCardIsMutable() {
            C23908o0.C23919j<MsgCard> jVar = this.preCard_;
            if (!jVar.mo37523Q()) {
                this.preCard_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureRemainCardIsMutable() {
            C23908o0.C23919j<MsgCard> jVar = this.remainCard_;
            if (!jVar.mo37523Q()) {
                this.remainCard_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizMsgReSortV2Req getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAdInfo(AdInfo adInfo) {
            adInfo.getClass();
            AdInfo adInfo2 = this.adInfo_;
            if (adInfo2 == null || adInfo2 == AdInfo.getDefaultInstance()) {
                this.adInfo_ = adInfo;
            } else {
                this.adInfo_ = (AdInfo) ((AdInfo.Builder) AdInfo.newBuilder(this.adInfo_).mergeFrom(adInfo)).buildPartial();
            }
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void mergeBaseRequest(BaseRequest baseRequest) {
            baseRequest.getClass();
            BaseRequest baseRequest2 = this.baseRequest_;
            if (baseRequest2 == null || baseRequest2 == BaseRequest.getDefaultInstance()) {
                this.baseRequest_ = baseRequest;
            } else {
                this.baseRequest_ = (BaseRequest) ((BaseRequest.Builder) BaseRequest.newBuilder(this.baseRequest_).mergeFrom(baseRequest)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeContext(BizMsgResortV2Context bizMsgResortV2Context) {
            bizMsgResortV2Context.getClass();
            BizMsgResortV2Context bizMsgResortV2Context2 = this.context_;
            if (bizMsgResortV2Context2 == null || bizMsgResortV2Context2 == BizMsgResortV2Context.getDefaultInstance()) {
                this.context_ = bizMsgResortV2Context;
            } else {
                this.context_ = (BizMsgResortV2Context) ((BizMsgResortV2Context.Builder) BizMsgResortV2Context.newBuilder(this.context_).mergeFrom(bizMsgResortV2Context)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void mergeEnv(BizMsgResortV2Env bizMsgResortV2Env) {
            bizMsgResortV2Env.getClass();
            BizMsgResortV2Env bizMsgResortV2Env2 = this.env_;
            if (bizMsgResortV2Env2 == null || bizMsgResortV2Env2 == BizMsgResortV2Env.getDefaultInstance()) {
                this.env_ = bizMsgResortV2Env;
            } else {
                this.env_ = (BizMsgResortV2Env) ((BizMsgResortV2Env.Builder) BizMsgResortV2Env.newBuilder(this.env_).mergeFrom(bizMsgResortV2Env)).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void mergeMsgBoxExposeInfo(MsgBoxExposeInfo msgBoxExposeInfo) {
            msgBoxExposeInfo.getClass();
            MsgBoxExposeInfo msgBoxExposeInfo2 = this.msgBoxExposeInfo_;
            if (msgBoxExposeInfo2 == null || msgBoxExposeInfo2 == MsgBoxExposeInfo.getDefaultInstance()) {
                this.msgBoxExposeInfo_ = msgBoxExposeInfo;
            } else {
                this.msgBoxExposeInfo_ = (MsgBoxExposeInfo) ((MsgBoxExposeInfo.Builder) MsgBoxExposeInfo.newBuilder(this.msgBoxExposeInfo_).mergeFrom(msgBoxExposeInfo)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeRecCardExposeInfo(RecCardExposeInfo recCardExposeInfo) {
            recCardExposeInfo.getClass();
            RecCardExposeInfo recCardExposeInfo2 = this.recCardExposeInfo_;
            if (recCardExposeInfo2 == null || recCardExposeInfo2 == RecCardExposeInfo.getDefaultInstance()) {
                this.recCardExposeInfo_ = recCardExposeInfo;
            } else {
                this.recCardExposeInfo_ = (RecCardExposeInfo) ((RecCardExposeInfo.Builder) RecCardExposeInfo.newBuilder(this.recCardExposeInfo_).mergeFrom(recCardExposeInfo)).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void mergeRecFeedsReq(GetRecommendFeedsRequest getRecommendFeedsRequest) {
            getRecommendFeedsRequest.getClass();
            GetRecommendFeedsRequest getRecommendFeedsRequest2 = this.recFeedsReq_;
            if (getRecommendFeedsRequest2 == null || getRecommendFeedsRequest2 == GetRecommendFeedsRequest.getDefaultInstance()) {
                this.recFeedsReq_ = getRecommendFeedsRequest;
            } else {
                this.recFeedsReq_ = (GetRecommendFeedsRequest) ((GetRecommendFeedsRequest.Builder) GetRecommendFeedsRequest.newBuilder(this.recFeedsReq_).mergeFrom(getRecommendFeedsRequest)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortV2Req parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortV2Req) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2Req parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortV2Req> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removePreCard(int i) {
            ensurePreCardIsMutable();
            this.preCard_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeRemainCard(int i) {
            ensureRemainCardIsMutable();
            this.remainCard_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAdInfo(AdInfo adInfo) {
            adInfo.getClass();
            this.adInfo_ = adInfo;
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.buffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setBufferBytes(C16994k kVar) {
            this.buffer_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setContext(BizMsgResortV2Context bizMsgResortV2Context) {
            bizMsgResortV2Context.getClass();
            this.context_ = bizMsgResortV2Context;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setEnv(BizMsgResortV2Env bizMsgResortV2Env) {
            bizMsgResortV2Env.getClass();
            this.env_ = bizMsgResortV2Env;
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeInfo(MsgBoxExposeInfo msgBoxExposeInfo) {
            msgBoxExposeInfo.getClass();
            this.msgBoxExposeInfo_ = msgBoxExposeInfo;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setPreCard(int i, MsgCard msgCard) {
            msgCard.getClass();
            ensurePreCardIsMutable();
            this.preCard_.set(i, msgCard);
        }

        /* access modifiers changed from: private */
        public void setRecCardExposeInfo(RecCardExposeInfo recCardExposeInfo) {
            recCardExposeInfo.getClass();
            this.recCardExposeInfo_ = recCardExposeInfo;
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setRecFeedsReq(GetRecommendFeedsRequest getRecommendFeedsRequest) {
            getRecommendFeedsRequest.getClass();
            this.recFeedsReq_ = getRecommendFeedsRequest;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setRemainCard(int i, MsgCard msgCard) {
            msgCard.getClass();
            ensureRemainCardIsMutable();
            this.remainCard_.set(i, msgCard);
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 4;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionId(int i) {
            this.bitField0_ |= 8;
            this.sessionId_ = i;
        }

        /* access modifiers changed from: private */
        public void setUnreadMsgCnt(int i) {
            this.bitField0_ |= 16;
            this.unreadMsgCnt_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            Class<MsgCard> cls = MsgCard.class;
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0002\u0002\u0001ᔉ\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0001\u0005ဋ\u0002\u0006ဋ\u0003\u0007ဋ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\rᐉ\t\u000eဉ\n", new Object[]{"bitField0_", "baseRequest_", "preCard_", cls, "remainCard_", cls, "buffer_", "scene_", "sessionId_", "unreadMsgCnt_", "msgBoxExposeInfo_", "context_", "recCardExposeInfo_", "env_", "recFeedsReq_", "adInfo_"});
                case 3:
                    return new BizMsgReSortV2Req();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortV2Req> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortV2Req.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public AdInfo getAdInfo() {
            AdInfo adInfo = this.adInfo_;
            return adInfo == null ? AdInfo.getDefaultInstance() : adInfo;
        }

        public BaseRequest getBaseRequest() {
            BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? BaseRequest.getDefaultInstance() : baseRequest;
        }

        public String getBuffer() {
            return this.buffer_;
        }

        public C16994k getBufferBytes() {
            return C16994k.m16791k(this.buffer_);
        }

        public BizMsgResortV2Context getContext() {
            BizMsgResortV2Context bizMsgResortV2Context = this.context_;
            return bizMsgResortV2Context == null ? BizMsgResortV2Context.getDefaultInstance() : bizMsgResortV2Context;
        }

        public BizMsgResortV2Env getEnv() {
            BizMsgResortV2Env bizMsgResortV2Env = this.env_;
            return bizMsgResortV2Env == null ? BizMsgResortV2Env.getDefaultInstance() : bizMsgResortV2Env;
        }

        public MsgBoxExposeInfo getMsgBoxExposeInfo() {
            MsgBoxExposeInfo msgBoxExposeInfo = this.msgBoxExposeInfo_;
            return msgBoxExposeInfo == null ? MsgBoxExposeInfo.getDefaultInstance() : msgBoxExposeInfo;
        }

        public MsgCard getPreCard(int i) {
            return this.preCard_.get(i);
        }

        public int getPreCardCount() {
            return this.preCard_.size();
        }

        public List<MsgCard> getPreCardList() {
            return this.preCard_;
        }

        public MsgCardOrBuilder getPreCardOrBuilder(int i) {
            return this.preCard_.get(i);
        }

        public List<? extends MsgCardOrBuilder> getPreCardOrBuilderList() {
            return this.preCard_;
        }

        public RecCardExposeInfo getRecCardExposeInfo() {
            RecCardExposeInfo recCardExposeInfo = this.recCardExposeInfo_;
            return recCardExposeInfo == null ? RecCardExposeInfo.getDefaultInstance() : recCardExposeInfo;
        }

        public GetRecommendFeedsRequest getRecFeedsReq() {
            GetRecommendFeedsRequest getRecommendFeedsRequest = this.recFeedsReq_;
            return getRecommendFeedsRequest == null ? GetRecommendFeedsRequest.getDefaultInstance() : getRecommendFeedsRequest;
        }

        public MsgCard getRemainCard(int i) {
            return this.remainCard_.get(i);
        }

        public int getRemainCardCount() {
            return this.remainCard_.size();
        }

        public List<MsgCard> getRemainCardList() {
            return this.remainCard_;
        }

        public MsgCardOrBuilder getRemainCardOrBuilder(int i) {
            return this.remainCard_.get(i);
        }

        public List<? extends MsgCardOrBuilder> getRemainCardOrBuilderList() {
            return this.remainCard_;
        }

        public int getScene() {
            return this.scene_;
        }

        public int getSessionId() {
            return this.sessionId_;
        }

        public int getUnreadMsgCnt() {
            return this.unreadMsgCnt_;
        }

        public boolean hasAdInfo() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasContext() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasEnv() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasMsgBoxExposeInfo() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasRecCardExposeInfo() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasRecFeedsReq() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUnreadMsgCnt() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(BizMsgReSortV2Req bizMsgReSortV2Req) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortV2Req);
        }

        public static BizMsgReSortV2Req parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2Req) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2Req parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortV2Req parseFrom(C16994k kVar) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addPreCard(int i, MsgCard msgCard) {
            msgCard.getClass();
            ensurePreCardIsMutable();
            this.preCard_.add(i, msgCard);
        }

        /* access modifiers changed from: private */
        public void addRemainCard(int i, MsgCard msgCard) {
            msgCard.getClass();
            ensureRemainCardIsMutable();
            this.remainCard_.add(i, msgCard);
        }

        public static BizMsgReSortV2Req parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortV2Req parseFrom(byte[] bArr) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortV2Req parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortV2Req parseFrom(InputStream inputStream) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2Req parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2Req parseFrom(C23856l lVar) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortV2Req parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortV2Req) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2ReqOrBuilder */
    public interface BizMsgReSortV2ReqOrBuilder extends C23848k1 {
        AdInfo getAdInfo();

        BaseRequest getBaseRequest();

        String getBuffer();

        C16994k getBufferBytes();

        BizMsgResortV2Context getContext();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        BizMsgResortV2Env getEnv();

        MsgBoxExposeInfo getMsgBoxExposeInfo();

        MsgCard getPreCard(int i);

        int getPreCardCount();

        List<MsgCard> getPreCardList();

        RecCardExposeInfo getRecCardExposeInfo();

        GetRecommendFeedsRequest getRecFeedsReq();

        MsgCard getRemainCard(int i);

        int getRemainCardCount();

        List<MsgCard> getRemainCardList();

        int getScene();

        int getSessionId();

        int getUnreadMsgCnt();

        boolean hasAdInfo();

        boolean hasBaseRequest();

        boolean hasBuffer();

        boolean hasContext();

        boolean hasEnv();

        boolean hasMsgBoxExposeInfo();

        boolean hasRecCardExposeInfo();

        boolean hasRecFeedsReq();

        boolean hasScene();

        boolean hasSessionId();

        boolean hasUnreadMsgCnt();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Resp */
    public static final class BizMsgReSortV2Resp extends C23861l0<BizMsgReSortV2Resp, Builder> implements BizMsgReSortV2RespOrBuilder {
        public static final int ADVERTISEMENT_EXT_FIELD_NUMBER = 12;
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        public static final int BUFFER_FIELD_NUMBER = 2;
        public static final int CONFIG_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final BizMsgReSortV2Resp DEFAULT_INSTANCE;
        public static final int EXTRA_INSERT_CARD_FIELD_NUMBER = 13;
        public static final int FOLD_LINE_POS_FIELD_NUMBER = 10;
        public static final int NEXT_REQ_TIME_FIELD_NUMBER = 3;
        private static volatile C24062w1<BizMsgReSortV2Resp> PARSER = null;
        public static final int RANK_SESSIONID_FIELD_NUMBER = 8;
        public static final int RECYCLE_LOCAL_ID_FIELD_NUMBER = 9;
        public static final int REC_FEEDS_RESP_FIELD_NUMBER = 11;
        public static final int SESSION_ID_FIELD_NUMBER = 5;
        public static final int UNREAD_MSG_CNT_FIELD_NUMBER = 6;
        public static final int VIEW_CARD_FIELD_NUMBER = 4;
        private String advertisementExt_ = "";
        private BaseResponse baseResponse_;
        private int bitField0_;
        private String buffer_ = "";
        private MsgCardReSortV2Config config_;
        private C23908o0.C23919j<ExtraInsertCard> extraInsertCard_ = C23861l0.emptyProtobufList();
        private int foldLinePos_;
        private byte memoizedIsInitialized = 2;
        private long nextReqTime_;
        private String rankSessionid_ = "";
        private GetRecommendFeedsResponse recFeedsResp_;
        private C23908o0.C23918i recycleLocalId_ = C23861l0.emptyLongList();
        private int sessionId_;
        private int unreadMsgCnt_;
        private C23908o0.C23919j<ViewMsgCard> viewCard_ = C23861l0.emptyProtobufList();

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Resp$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortV2Resp, Builder> implements BizMsgReSortV2RespOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder addAllExtraInsertCard(Iterable<? extends ExtraInsertCard> iterable) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addAllExtraInsertCard(iterable);
                return this;
            }

            public Builder addAllRecycleLocalId(Iterable<? extends Long> iterable) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addAllRecycleLocalId(iterable);
                return this;
            }

            public Builder addAllViewCard(Iterable<? extends ViewMsgCard> iterable) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addAllViewCard(iterable);
                return this;
            }

            public Builder addExtraInsertCard(ExtraInsertCard extraInsertCard) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addExtraInsertCard(extraInsertCard);
                return this;
            }

            public Builder addRecycleLocalId(long j) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addRecycleLocalId(j);
                return this;
            }

            public Builder addViewCard(ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addViewCard(viewMsgCard);
                return this;
            }

            public Builder clearAdvertisementExt() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearAdvertisementExt();
                return this;
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearBuffer();
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearConfig();
                return this;
            }

            public Builder clearExtraInsertCard() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearExtraInsertCard();
                return this;
            }

            public Builder clearFoldLinePos() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearFoldLinePos();
                return this;
            }

            public Builder clearNextReqTime() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearNextReqTime();
                return this;
            }

            public Builder clearRankSessionid() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearRankSessionid();
                return this;
            }

            public Builder clearRecFeedsResp() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearRecFeedsResp();
                return this;
            }

            public Builder clearRecycleLocalId() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearRecycleLocalId();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearSessionId();
                return this;
            }

            public Builder clearUnreadMsgCnt() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearUnreadMsgCnt();
                return this;
            }

            public Builder clearViewCard() {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).clearViewCard();
                return this;
            }

            public String getAdvertisementExt() {
                return ((BizMsgReSortV2Resp) this.instance).getAdvertisementExt();
            }

            public C16994k getAdvertisementExtBytes() {
                return ((BizMsgReSortV2Resp) this.instance).getAdvertisementExtBytes();
            }

            public BaseResponse getBaseResponse() {
                return ((BizMsgReSortV2Resp) this.instance).getBaseResponse();
            }

            public String getBuffer() {
                return ((BizMsgReSortV2Resp) this.instance).getBuffer();
            }

            public C16994k getBufferBytes() {
                return ((BizMsgReSortV2Resp) this.instance).getBufferBytes();
            }

            public MsgCardReSortV2Config getConfig() {
                return ((BizMsgReSortV2Resp) this.instance).getConfig();
            }

            public ExtraInsertCard getExtraInsertCard(int i) {
                return ((BizMsgReSortV2Resp) this.instance).getExtraInsertCard(i);
            }

            public int getExtraInsertCardCount() {
                return ((BizMsgReSortV2Resp) this.instance).getExtraInsertCardCount();
            }

            public List<ExtraInsertCard> getExtraInsertCardList() {
                return Collections.unmodifiableList(((BizMsgReSortV2Resp) this.instance).getExtraInsertCardList());
            }

            public int getFoldLinePos() {
                return ((BizMsgReSortV2Resp) this.instance).getFoldLinePos();
            }

            public long getNextReqTime() {
                return ((BizMsgReSortV2Resp) this.instance).getNextReqTime();
            }

            public String getRankSessionid() {
                return ((BizMsgReSortV2Resp) this.instance).getRankSessionid();
            }

            public C16994k getRankSessionidBytes() {
                return ((BizMsgReSortV2Resp) this.instance).getRankSessionidBytes();
            }

            public GetRecommendFeedsResponse getRecFeedsResp() {
                return ((BizMsgReSortV2Resp) this.instance).getRecFeedsResp();
            }

            public long getRecycleLocalId(int i) {
                return ((BizMsgReSortV2Resp) this.instance).getRecycleLocalId(i);
            }

            public int getRecycleLocalIdCount() {
                return ((BizMsgReSortV2Resp) this.instance).getRecycleLocalIdCount();
            }

            public List<Long> getRecycleLocalIdList() {
                return Collections.unmodifiableList(((BizMsgReSortV2Resp) this.instance).getRecycleLocalIdList());
            }

            public int getSessionId() {
                return ((BizMsgReSortV2Resp) this.instance).getSessionId();
            }

            public int getUnreadMsgCnt() {
                return ((BizMsgReSortV2Resp) this.instance).getUnreadMsgCnt();
            }

            public ViewMsgCard getViewCard(int i) {
                return ((BizMsgReSortV2Resp) this.instance).getViewCard(i);
            }

            public int getViewCardCount() {
                return ((BizMsgReSortV2Resp) this.instance).getViewCardCount();
            }

            public List<ViewMsgCard> getViewCardList() {
                return Collections.unmodifiableList(((BizMsgReSortV2Resp) this.instance).getViewCardList());
            }

            public boolean hasAdvertisementExt() {
                return ((BizMsgReSortV2Resp) this.instance).hasAdvertisementExt();
            }

            public boolean hasBaseResponse() {
                return ((BizMsgReSortV2Resp) this.instance).hasBaseResponse();
            }

            public boolean hasBuffer() {
                return ((BizMsgReSortV2Resp) this.instance).hasBuffer();
            }

            public boolean hasConfig() {
                return ((BizMsgReSortV2Resp) this.instance).hasConfig();
            }

            public boolean hasFoldLinePos() {
                return ((BizMsgReSortV2Resp) this.instance).hasFoldLinePos();
            }

            public boolean hasNextReqTime() {
                return ((BizMsgReSortV2Resp) this.instance).hasNextReqTime();
            }

            public boolean hasRankSessionid() {
                return ((BizMsgReSortV2Resp) this.instance).hasRankSessionid();
            }

            public boolean hasRecFeedsResp() {
                return ((BizMsgReSortV2Resp) this.instance).hasRecFeedsResp();
            }

            public boolean hasSessionId() {
                return ((BizMsgReSortV2Resp) this.instance).hasSessionId();
            }

            public boolean hasUnreadMsgCnt() {
                return ((BizMsgReSortV2Resp) this.instance).hasUnreadMsgCnt();
            }

            public Builder mergeBaseResponse(BaseResponse baseResponse) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder mergeConfig(MsgCardReSortV2Config msgCardReSortV2Config) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).mergeConfig(msgCardReSortV2Config);
                return this;
            }

            public Builder mergeRecFeedsResp(GetRecommendFeedsResponse getRecommendFeedsResponse) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).mergeRecFeedsResp(getRecommendFeedsResponse);
                return this;
            }

            public Builder removeExtraInsertCard(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).removeExtraInsertCard(i);
                return this;
            }

            public Builder removeViewCard(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).removeViewCard(i);
                return this;
            }

            public Builder setAdvertisementExt(String str) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setAdvertisementExt(str);
                return this;
            }

            public Builder setAdvertisementExtBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setAdvertisementExtBytes(kVar);
                return this;
            }

            public Builder setBaseResponse(BaseResponse baseResponse) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setBuffer(String str) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setBuffer(str);
                return this;
            }

            public Builder setBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setBufferBytes(kVar);
                return this;
            }

            public Builder setConfig(MsgCardReSortV2Config msgCardReSortV2Config) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setConfig(msgCardReSortV2Config);
                return this;
            }

            public Builder setExtraInsertCard(int i, ExtraInsertCard extraInsertCard) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setExtraInsertCard(i, extraInsertCard);
                return this;
            }

            public Builder setFoldLinePos(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setFoldLinePos(i);
                return this;
            }

            public Builder setNextReqTime(long j) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setNextReqTime(j);
                return this;
            }

            public Builder setRankSessionid(String str) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setRankSessionid(str);
                return this;
            }

            public Builder setRankSessionidBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setRankSessionidBytes(kVar);
                return this;
            }

            public Builder setRecFeedsResp(GetRecommendFeedsResponse getRecommendFeedsResponse) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setRecFeedsResp(getRecommendFeedsResponse);
                return this;
            }

            public Builder setRecycleLocalId(int i, long j) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setRecycleLocalId(i, j);
                return this;
            }

            public Builder setSessionId(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setSessionId(i);
                return this;
            }

            public Builder setUnreadMsgCnt(int i) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setUnreadMsgCnt(i);
                return this;
            }

            public Builder setViewCard(int i, ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setViewCard(i, viewMsgCard);
                return this;
            }

            private Builder() {
                super(BizMsgReSortV2Resp.DEFAULT_INSTANCE);
            }

            public Builder addExtraInsertCard(int i, ExtraInsertCard extraInsertCard) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addExtraInsertCard(i, extraInsertCard);
                return this;
            }

            public Builder addViewCard(int i, ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addViewCard(i, viewMsgCard);
                return this;
            }

            public Builder setBaseResponse(BaseResponse.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setBaseResponse((BaseResponse) builder.build());
                return this;
            }

            public Builder setConfig(MsgCardReSortV2Config.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setConfig((MsgCardReSortV2Config) builder.build());
                return this;
            }

            public Builder setExtraInsertCard(int i, ExtraInsertCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setExtraInsertCard(i, (ExtraInsertCard) builder.build());
                return this;
            }

            public Builder setRecFeedsResp(GetRecommendFeedsResponse.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setRecFeedsResp((GetRecommendFeedsResponse) builder.build());
                return this;
            }

            public Builder setViewCard(int i, ViewMsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).setViewCard(i, (ViewMsgCard) builder.build());
                return this;
            }

            public Builder addExtraInsertCard(ExtraInsertCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addExtraInsertCard((ExtraInsertCard) builder.build());
                return this;
            }

            public Builder addViewCard(ViewMsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addViewCard((ViewMsgCard) builder.build());
                return this;
            }

            public Builder addExtraInsertCard(int i, ExtraInsertCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addExtraInsertCard(i, (ExtraInsertCard) builder.build());
                return this;
            }

            public Builder addViewCard(int i, ViewMsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2Resp) this.instance).addViewCard(i, (ViewMsgCard) builder.build());
                return this;
            }
        }

        static {
            BizMsgReSortV2Resp bizMsgReSortV2Resp = new BizMsgReSortV2Resp();
            DEFAULT_INSTANCE = bizMsgReSortV2Resp;
            C23861l0.registerDefaultInstance(BizMsgReSortV2Resp.class, bizMsgReSortV2Resp);
        }

        private BizMsgReSortV2Resp() {
        }

        /* access modifiers changed from: private */
        public void addAllExtraInsertCard(Iterable<? extends ExtraInsertCard> iterable) {
            ensureExtraInsertCardIsMutable();
            C23810b.addAll(iterable, this.extraInsertCard_);
        }

        /* access modifiers changed from: private */
        public void addAllRecycleLocalId(Iterable<? extends Long> iterable) {
            ensureRecycleLocalIdIsMutable();
            C23810b.addAll(iterable, this.recycleLocalId_);
        }

        /* access modifiers changed from: private */
        public void addAllViewCard(Iterable<? extends ViewMsgCard> iterable) {
            ensureViewCardIsMutable();
            C23810b.addAll(iterable, this.viewCard_);
        }

        /* access modifiers changed from: private */
        public void addExtraInsertCard(ExtraInsertCard extraInsertCard) {
            extraInsertCard.getClass();
            ensureExtraInsertCardIsMutable();
            this.extraInsertCard_.add(extraInsertCard);
        }

        /* access modifiers changed from: private */
        public void addRecycleLocalId(long j) {
            ensureRecycleLocalIdIsMutable();
            ((C24061w0) this.recycleLocalId_).mo38392h(j);
        }

        /* access modifiers changed from: private */
        public void addViewCard(ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            ensureViewCardIsMutable();
            this.viewCard_.add(viewMsgCard);
        }

        /* access modifiers changed from: private */
        public void clearAdvertisementExt() {
            this.bitField0_ &= -513;
            this.advertisementExt_ = getDefaultInstance().getAdvertisementExt();
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -3;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -33;
        }

        /* access modifiers changed from: private */
        public void clearExtraInsertCard() {
            this.extraInsertCard_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearFoldLinePos() {
            this.bitField0_ &= -129;
            this.foldLinePos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNextReqTime() {
            this.bitField0_ &= -5;
            this.nextReqTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRankSessionid() {
            this.bitField0_ &= -65;
            this.rankSessionid_ = getDefaultInstance().getRankSessionid();
        }

        /* access modifiers changed from: private */
        public void clearRecFeedsResp() {
            this.recFeedsResp_ = null;
            this.bitField0_ &= -257;
        }

        /* access modifiers changed from: private */
        public void clearRecycleLocalId() {
            this.recycleLocalId_ = C23861l0.emptyLongList();
        }

        /* access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -9;
            this.sessionId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUnreadMsgCnt() {
            this.bitField0_ &= -17;
            this.unreadMsgCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearViewCard() {
            this.viewCard_ = C23861l0.emptyProtobufList();
        }

        private void ensureExtraInsertCardIsMutable() {
            C23908o0.C23919j<ExtraInsertCard> jVar = this.extraInsertCard_;
            if (!jVar.mo37523Q()) {
                this.extraInsertCard_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureRecycleLocalIdIsMutable() {
            C23908o0.C23918i iVar = this.recycleLocalId_;
            if (!((C23817d) iVar).f68221d) {
                this.recycleLocalId_ = C23861l0.mutableCopy(iVar);
            }
        }

        private void ensureViewCardIsMutable() {
            C23908o0.C23919j<ViewMsgCard> jVar = this.viewCard_;
            if (!jVar.mo37523Q()) {
                this.viewCard_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizMsgReSortV2Resp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseResponse(BaseResponse baseResponse) {
            baseResponse.getClass();
            BaseResponse baseResponse2 = this.baseResponse_;
            if (baseResponse2 == null || baseResponse2 == BaseResponse.getDefaultInstance()) {
                this.baseResponse_ = baseResponse;
            } else {
                this.baseResponse_ = (BaseResponse) ((BaseResponse.Builder) BaseResponse.newBuilder(this.baseResponse_).mergeFrom(baseResponse)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(MsgCardReSortV2Config msgCardReSortV2Config) {
            msgCardReSortV2Config.getClass();
            MsgCardReSortV2Config msgCardReSortV2Config2 = this.config_;
            if (msgCardReSortV2Config2 == null || msgCardReSortV2Config2 == MsgCardReSortV2Config.getDefaultInstance()) {
                this.config_ = msgCardReSortV2Config;
            } else {
                this.config_ = (MsgCardReSortV2Config) ((MsgCardReSortV2Config.Builder) MsgCardReSortV2Config.newBuilder(this.config_).mergeFrom(msgCardReSortV2Config)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeRecFeedsResp(GetRecommendFeedsResponse getRecommendFeedsResponse) {
            getRecommendFeedsResponse.getClass();
            GetRecommendFeedsResponse getRecommendFeedsResponse2 = this.recFeedsResp_;
            if (getRecommendFeedsResponse2 == null || getRecommendFeedsResponse2 == GetRecommendFeedsResponse.getDefaultInstance()) {
                this.recFeedsResp_ = getRecommendFeedsResponse;
            } else {
                this.recFeedsResp_ = (GetRecommendFeedsResponse) ((GetRecommendFeedsResponse.Builder) GetRecommendFeedsResponse.newBuilder(this.recFeedsResp_).mergeFrom(getRecommendFeedsResponse)).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortV2Resp parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortV2Resp) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2Resp parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortV2Resp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeExtraInsertCard(int i) {
            ensureExtraInsertCardIsMutable();
            this.extraInsertCard_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeViewCard(int i) {
            ensureViewCardIsMutable();
            this.viewCard_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAdvertisementExt(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.advertisementExt_ = str;
        }

        /* access modifiers changed from: private */
        public void setAdvertisementExtBytes(C16994k kVar) {
            this.advertisementExt_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.buffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setBufferBytes(C16994k kVar) {
            this.buffer_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setConfig(MsgCardReSortV2Config msgCardReSortV2Config) {
            msgCardReSortV2Config.getClass();
            this.config_ = msgCardReSortV2Config;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setExtraInsertCard(int i, ExtraInsertCard extraInsertCard) {
            extraInsertCard.getClass();
            ensureExtraInsertCardIsMutable();
            this.extraInsertCard_.set(i, extraInsertCard);
        }

        /* access modifiers changed from: private */
        public void setFoldLinePos(int i) {
            this.bitField0_ |= 128;
            this.foldLinePos_ = i;
        }

        /* access modifiers changed from: private */
        public void setNextReqTime(long j) {
            this.bitField0_ |= 4;
            this.nextReqTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setRankSessionid(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.rankSessionid_ = str;
        }

        /* access modifiers changed from: private */
        public void setRankSessionidBytes(C16994k kVar) {
            this.rankSessionid_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setRecFeedsResp(GetRecommendFeedsResponse getRecommendFeedsResponse) {
            getRecommendFeedsResponse.getClass();
            this.recFeedsResp_ = getRecommendFeedsResponse;
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setRecycleLocalId(int i, long j) {
            ensureRecycleLocalIdIsMutable();
            C24061w0 w0Var = (C24061w0) this.recycleLocalId_;
            w0Var.mo37528f();
            w0Var.mo38393i(i);
            long[] jArr = w0Var.f69186e;
            long j2 = jArr[i];
            jArr[i] = j;
        }

        /* access modifiers changed from: private */
        public void setSessionId(int i) {
            this.bitField0_ |= 8;
            this.sessionId_ = i;
        }

        /* access modifiers changed from: private */
        public void setUnreadMsgCnt(int i) {
            this.bitField0_ |= 16;
            this.unreadMsgCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setViewCard(int i, ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            ensureViewCardIsMutable();
            this.viewCard_.set(i, viewMsgCard);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0003\u0002\u0001ᔉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004\u001b\u0005ဋ\u0003\u0006ဋ\u0004\u0007ဉ\u0005\bဈ\u0006\t\u0015\nဋ\u0007\u000bᐉ\b\fဈ\t\r\u001b", new Object[]{"bitField0_", "baseResponse_", "buffer_", "nextReqTime_", "viewCard_", ViewMsgCard.class, "sessionId_", "unreadMsgCnt_", "config_", "rankSessionid_", "recycleLocalId_", "foldLinePos_", "recFeedsResp_", "advertisementExt_", "extraInsertCard_", ExtraInsertCard.class});
                case 3:
                    return new BizMsgReSortV2Resp();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortV2Resp> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortV2Resp.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAdvertisementExt() {
            return this.advertisementExt_;
        }

        public C16994k getAdvertisementExtBytes() {
            return C16994k.m16791k(this.advertisementExt_);
        }

        public BaseResponse getBaseResponse() {
            BaseResponse baseResponse = this.baseResponse_;
            return baseResponse == null ? BaseResponse.getDefaultInstance() : baseResponse;
        }

        public String getBuffer() {
            return this.buffer_;
        }

        public C16994k getBufferBytes() {
            return C16994k.m16791k(this.buffer_);
        }

        public MsgCardReSortV2Config getConfig() {
            MsgCardReSortV2Config msgCardReSortV2Config = this.config_;
            return msgCardReSortV2Config == null ? MsgCardReSortV2Config.getDefaultInstance() : msgCardReSortV2Config;
        }

        public ExtraInsertCard getExtraInsertCard(int i) {
            return this.extraInsertCard_.get(i);
        }

        public int getExtraInsertCardCount() {
            return this.extraInsertCard_.size();
        }

        public List<ExtraInsertCard> getExtraInsertCardList() {
            return this.extraInsertCard_;
        }

        public ExtraInsertCardOrBuilder getExtraInsertCardOrBuilder(int i) {
            return this.extraInsertCard_.get(i);
        }

        public List<? extends ExtraInsertCardOrBuilder> getExtraInsertCardOrBuilderList() {
            return this.extraInsertCard_;
        }

        public int getFoldLinePos() {
            return this.foldLinePos_;
        }

        public long getNextReqTime() {
            return this.nextReqTime_;
        }

        public String getRankSessionid() {
            return this.rankSessionid_;
        }

        public C16994k getRankSessionidBytes() {
            return C16994k.m16791k(this.rankSessionid_);
        }

        public GetRecommendFeedsResponse getRecFeedsResp() {
            GetRecommendFeedsResponse getRecommendFeedsResponse = this.recFeedsResp_;
            return getRecommendFeedsResponse == null ? GetRecommendFeedsResponse.getDefaultInstance() : getRecommendFeedsResponse;
        }

        public long getRecycleLocalId(int i) {
            return ((C24061w0) this.recycleLocalId_).mo38395k(i);
        }

        public int getRecycleLocalIdCount() {
            return ((C24061w0) this.recycleLocalId_).f69187f;
        }

        public List<Long> getRecycleLocalIdList() {
            return this.recycleLocalId_;
        }

        public int getSessionId() {
            return this.sessionId_;
        }

        public int getUnreadMsgCnt() {
            return this.unreadMsgCnt_;
        }

        public ViewMsgCard getViewCard(int i) {
            return this.viewCard_.get(i);
        }

        public int getViewCardCount() {
            return this.viewCard_.size();
        }

        public List<ViewMsgCard> getViewCardList() {
            return this.viewCard_;
        }

        public ViewMsgCardOrBuilder getViewCardOrBuilder(int i) {
            return this.viewCard_.get(i);
        }

        public List<? extends ViewMsgCardOrBuilder> getViewCardOrBuilderList() {
            return this.viewCard_;
        }

        public boolean hasAdvertisementExt() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFoldLinePos() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasNextReqTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasRankSessionid() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRecFeedsResp() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUnreadMsgCnt() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(BizMsgReSortV2Resp bizMsgReSortV2Resp) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortV2Resp);
        }

        public static BizMsgReSortV2Resp parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2Resp) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2Resp parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortV2Resp parseFrom(C16994k kVar) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addExtraInsertCard(int i, ExtraInsertCard extraInsertCard) {
            extraInsertCard.getClass();
            ensureExtraInsertCardIsMutable();
            this.extraInsertCard_.add(i, extraInsertCard);
        }

        /* access modifiers changed from: private */
        public void addViewCard(int i, ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            ensureViewCardIsMutable();
            this.viewCard_.add(i, viewMsgCard);
        }

        public static BizMsgReSortV2Resp parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortV2Resp parseFrom(byte[] bArr) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortV2Resp parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortV2Resp parseFrom(InputStream inputStream) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2Resp parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2Resp parseFrom(C23856l lVar) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortV2Resp parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortV2Resp) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2RespOrBuilder */
    public interface BizMsgReSortV2RespOrBuilder extends C23848k1 {
        String getAdvertisementExt();

        C16994k getAdvertisementExtBytes();

        BaseResponse getBaseResponse();

        String getBuffer();

        C16994k getBufferBytes();

        MsgCardReSortV2Config getConfig();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        ExtraInsertCard getExtraInsertCard(int i);

        int getExtraInsertCardCount();

        List<ExtraInsertCard> getExtraInsertCardList();

        int getFoldLinePos();

        long getNextReqTime();

        String getRankSessionid();

        C16994k getRankSessionidBytes();

        GetRecommendFeedsResponse getRecFeedsResp();

        long getRecycleLocalId(int i);

        int getRecycleLocalIdCount();

        List<Long> getRecycleLocalIdList();

        int getSessionId();

        int getUnreadMsgCnt();

        ViewMsgCard getViewCard(int i);

        int getViewCardCount();

        List<ViewMsgCard> getViewCardList();

        boolean hasAdvertisementExt();

        boolean hasBaseResponse();

        boolean hasBuffer();

        boolean hasConfig();

        boolean hasFoldLinePos();

        boolean hasNextReqTime();

        boolean hasRankSessionid();

        boolean hasRecFeedsResp();

        boolean hasSessionId();

        boolean hasUnreadMsgCnt();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Scene */
    public enum BizMsgReSortV2Scene implements C23908o0.C23911c {
        BIZ_MSG_RESORT_V2_SCENE_NEW_MSG(0),
        BIZ_MSG_RESORT_V2_SCENE_MAIN_TAB(1),
        BIZ_MSG_RESORT_V2_SCENE_ENTER_BOX(3),
        BIZ_MSG_RESORT_V2_SCENE_CLICK_OFTEN_READ_BAR(4),
        BIZ_MSG_RESORT_V2_SCENE_CLICK_MSG(5),
        BIZ_MSG_RESORT_V2_SCENE_PC_ENTER_BOX(6),
        BIZ_MSG_RESORT_V2_SCENE_PULL_FEEDS(7),
        BIZ_MSG_RESORT_V2_SCENE_PULL_REC_FEEDS(8);
        
        public static final int BIZ_MSG_RESORT_V2_SCENE_CLICK_MSG_VALUE = 5;
        public static final int BIZ_MSG_RESORT_V2_SCENE_CLICK_OFTEN_READ_BAR_VALUE = 4;
        public static final int BIZ_MSG_RESORT_V2_SCENE_ENTER_BOX_VALUE = 3;
        public static final int BIZ_MSG_RESORT_V2_SCENE_MAIN_TAB_VALUE = 1;
        public static final int BIZ_MSG_RESORT_V2_SCENE_NEW_MSG_VALUE = 0;
        public static final int BIZ_MSG_RESORT_V2_SCENE_PC_ENTER_BOX_VALUE = 6;
        public static final int BIZ_MSG_RESORT_V2_SCENE_PULL_FEEDS_VALUE = 7;
        public static final int BIZ_MSG_RESORT_V2_SCENE_PULL_REC_FEEDS_VALUE = 8;
        private static final C23908o0.C23912d<BizMsgReSortV2Scene> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgReSortV2Scene$BizMsgReSortV2SceneVerifier */
        public static final class BizMsgReSortV2SceneVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new BizMsgReSortV2SceneVerifier();
            }

            private BizMsgReSortV2SceneVerifier() {
            }

            public boolean isInRange(int i) {
                return BizMsgReSortV2Scene.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<BizMsgReSortV2Scene>() {
                public BizMsgReSortV2Scene findValueByNumber(int i) {
                    return BizMsgReSortV2Scene.forNumber(i);
                }
            };
        }

        private BizMsgReSortV2Scene(int i) {
            this.value = i;
        }

        public static BizMsgReSortV2Scene forNumber(int i) {
            switch (i) {
                case 0:
                    return BIZ_MSG_RESORT_V2_SCENE_NEW_MSG;
                case 1:
                    return BIZ_MSG_RESORT_V2_SCENE_MAIN_TAB;
                case 3:
                    return BIZ_MSG_RESORT_V2_SCENE_ENTER_BOX;
                case 4:
                    return BIZ_MSG_RESORT_V2_SCENE_CLICK_OFTEN_READ_BAR;
                case 5:
                    return BIZ_MSG_RESORT_V2_SCENE_CLICK_MSG;
                case 6:
                    return BIZ_MSG_RESORT_V2_SCENE_PC_ENTER_BOX;
                case 7:
                    return BIZ_MSG_RESORT_V2_SCENE_PULL_FEEDS;
                case 8:
                    return BIZ_MSG_RESORT_V2_SCENE_PULL_REC_FEEDS;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<BizMsgReSortV2Scene> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return BizMsgReSortV2SceneVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BizMsgReSortV2Scene valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgResortV2Context */
    public static final class BizMsgResortV2Context extends C23861l0<BizMsgResortV2Context, Builder> implements BizMsgResortV2ContextOrBuilder {
        /* access modifiers changed from: private */
        public static final BizMsgResortV2Context DEFAULT_INSTANCE;
        public static final int OFTEN_READ_BIZUSERNAME_FIELD_NUMBER = 2;
        private static volatile C24062w1<BizMsgResortV2Context> PARSER;
        private int bitField0_;
        private String oftenReadBizusername_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgResortV2Context$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgResortV2Context, Builder> implements BizMsgResortV2ContextOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearOftenReadBizusername() {
                copyOnWrite();
                ((BizMsgResortV2Context) this.instance).clearOftenReadBizusername();
                return this;
            }

            public String getOftenReadBizusername() {
                return ((BizMsgResortV2Context) this.instance).getOftenReadBizusername();
            }

            public C16994k getOftenReadBizusernameBytes() {
                return ((BizMsgResortV2Context) this.instance).getOftenReadBizusernameBytes();
            }

            public boolean hasOftenReadBizusername() {
                return ((BizMsgResortV2Context) this.instance).hasOftenReadBizusername();
            }

            public Builder setOftenReadBizusername(String str) {
                copyOnWrite();
                ((BizMsgResortV2Context) this.instance).setOftenReadBizusername(str);
                return this;
            }

            public Builder setOftenReadBizusernameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgResortV2Context) this.instance).setOftenReadBizusernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizMsgResortV2Context.DEFAULT_INSTANCE);
            }
        }

        static {
            BizMsgResortV2Context bizMsgResortV2Context = new BizMsgResortV2Context();
            DEFAULT_INSTANCE = bizMsgResortV2Context;
            C23861l0.registerDefaultInstance(BizMsgResortV2Context.class, bizMsgResortV2Context);
        }

        private BizMsgResortV2Context() {
        }

        /* access modifiers changed from: private */
        public void clearOftenReadBizusername() {
            this.bitField0_ &= -2;
            this.oftenReadBizusername_ = getDefaultInstance().getOftenReadBizusername();
        }

        public static BizMsgResortV2Context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgResortV2Context parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgResortV2Context) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgResortV2Context parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgResortV2Context> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOftenReadBizusername(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.oftenReadBizusername_ = str;
        }

        /* access modifiers changed from: private */
        public void setOftenReadBizusernameBytes(C16994k kVar) {
            this.oftenReadBizusername_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"bitField0_", "oftenReadBizusername_"});
                case 3:
                    return new BizMsgResortV2Context();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgResortV2Context> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgResortV2Context.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getOftenReadBizusername() {
            return this.oftenReadBizusername_;
        }

        public C16994k getOftenReadBizusernameBytes() {
            return C16994k.m16791k(this.oftenReadBizusername_);
        }

        public boolean hasOftenReadBizusername() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgResortV2Context bizMsgResortV2Context) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgResortV2Context);
        }

        public static BizMsgResortV2Context parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgResortV2Context) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgResortV2Context parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgResortV2Context parseFrom(C16994k kVar) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgResortV2Context parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgResortV2Context parseFrom(byte[] bArr) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgResortV2Context parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgResortV2Context parseFrom(InputStream inputStream) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgResortV2Context parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgResortV2Context parseFrom(C23856l lVar) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgResortV2Context parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgResortV2Context) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgResortV2ContextOrBuilder */
    public interface BizMsgResortV2ContextOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getOftenReadBizusername();

        C16994k getOftenReadBizusernameBytes();

        boolean hasOftenReadBizusername();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgResortV2Env */
    public static final class BizMsgResortV2Env extends C23861l0<BizMsgResortV2Env, Builder> implements BizMsgResortV2EnvOrBuilder {
        /* access modifiers changed from: private */
        public static final BizMsgResortV2Env DEFAULT_INSTANCE;
        public static final int IS_HEADSET_ON_FIELD_NUMBER = 2;
        public static final int NET_TYPE_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizMsgResortV2Env> PARSER;
        private int bitField0_;
        private boolean isHeadsetOn_;
        private String netType_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgResortV2Env$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgResortV2Env, Builder> implements BizMsgResortV2EnvOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearIsHeadsetOn() {
                copyOnWrite();
                ((BizMsgResortV2Env) this.instance).clearIsHeadsetOn();
                return this;
            }

            public Builder clearNetType() {
                copyOnWrite();
                ((BizMsgResortV2Env) this.instance).clearNetType();
                return this;
            }

            public boolean getIsHeadsetOn() {
                return ((BizMsgResortV2Env) this.instance).getIsHeadsetOn();
            }

            public String getNetType() {
                return ((BizMsgResortV2Env) this.instance).getNetType();
            }

            public C16994k getNetTypeBytes() {
                return ((BizMsgResortV2Env) this.instance).getNetTypeBytes();
            }

            public boolean hasIsHeadsetOn() {
                return ((BizMsgResortV2Env) this.instance).hasIsHeadsetOn();
            }

            public boolean hasNetType() {
                return ((BizMsgResortV2Env) this.instance).hasNetType();
            }

            public Builder setIsHeadsetOn(boolean z) {
                copyOnWrite();
                ((BizMsgResortV2Env) this.instance).setIsHeadsetOn(z);
                return this;
            }

            public Builder setNetType(String str) {
                copyOnWrite();
                ((BizMsgResortV2Env) this.instance).setNetType(str);
                return this;
            }

            public Builder setNetTypeBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgResortV2Env) this.instance).setNetTypeBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizMsgResortV2Env.DEFAULT_INSTANCE);
            }
        }

        static {
            BizMsgResortV2Env bizMsgResortV2Env = new BizMsgResortV2Env();
            DEFAULT_INSTANCE = bizMsgResortV2Env;
            C23861l0.registerDefaultInstance(BizMsgResortV2Env.class, bizMsgResortV2Env);
        }

        private BizMsgResortV2Env() {
        }

        /* access modifiers changed from: private */
        public void clearIsHeadsetOn() {
            this.bitField0_ &= -3;
            this.isHeadsetOn_ = false;
        }

        /* access modifiers changed from: private */
        public void clearNetType() {
            this.bitField0_ &= -2;
            this.netType_ = getDefaultInstance().getNetType();
        }

        public static BizMsgResortV2Env getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgResortV2Env parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgResortV2Env) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgResortV2Env parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgResortV2Env> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIsHeadsetOn(boolean z) {
            this.bitField0_ |= 2;
            this.isHeadsetOn_ = z;
        }

        /* access modifiers changed from: private */
        public void setNetType(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.netType_ = str;
        }

        /* access modifiers changed from: private */
        public void setNetTypeBytes(C16994k kVar) {
            this.netType_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "netType_", "isHeadsetOn_"});
                case 3:
                    return new BizMsgResortV2Env();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgResortV2Env> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgResortV2Env.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public boolean getIsHeadsetOn() {
            return this.isHeadsetOn_;
        }

        public String getNetType() {
            return this.netType_;
        }

        public C16994k getNetTypeBytes() {
            return C16994k.m16791k(this.netType_);
        }

        public boolean hasIsHeadsetOn() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNetType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgResortV2Env bizMsgResortV2Env) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgResortV2Env);
        }

        public static BizMsgResortV2Env parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgResortV2Env) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgResortV2Env parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgResortV2Env parseFrom(C16994k kVar) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgResortV2Env parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgResortV2Env parseFrom(byte[] bArr) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgResortV2Env parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgResortV2Env parseFrom(InputStream inputStream) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgResortV2Env parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgResortV2Env parseFrom(C23856l lVar) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgResortV2Env parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgResortV2Env) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizMsgResortV2EnvOrBuilder */
    public interface BizMsgResortV2EnvOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getIsHeadsetOn();

        String getNetType();

        C16994k getNetTypeBytes();

        boolean hasIsHeadsetOn();

        boolean hasNetType();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizTimeLineAdCardInfo */
    public static final class BizTimeLineAdCardInfo extends C23861l0<BizTimeLineAdCardInfo, Builder> implements BizTimeLineAdCardInfoOrBuilder {
        public static final int AD_CARD_INFO_FIELD_NUMBER = 2;
        public static final int AD_POS_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizTimeLineAdCardInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<BizTimeLineAdCardInfo> PARSER;
        private String adCardInfo_ = "";
        private int adPos_;
        private int bitField0_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizTimeLineAdCardInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<BizTimeLineAdCardInfo, Builder> implements BizTimeLineAdCardInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearAdCardInfo() {
                copyOnWrite();
                ((BizTimeLineAdCardInfo) this.instance).clearAdCardInfo();
                return this;
            }

            public Builder clearAdPos() {
                copyOnWrite();
                ((BizTimeLineAdCardInfo) this.instance).clearAdPos();
                return this;
            }

            public String getAdCardInfo() {
                return ((BizTimeLineAdCardInfo) this.instance).getAdCardInfo();
            }

            public C16994k getAdCardInfoBytes() {
                return ((BizTimeLineAdCardInfo) this.instance).getAdCardInfoBytes();
            }

            public int getAdPos() {
                return ((BizTimeLineAdCardInfo) this.instance).getAdPos();
            }

            public boolean hasAdCardInfo() {
                return ((BizTimeLineAdCardInfo) this.instance).hasAdCardInfo();
            }

            public boolean hasAdPos() {
                return ((BizTimeLineAdCardInfo) this.instance).hasAdPos();
            }

            public Builder setAdCardInfo(String str) {
                copyOnWrite();
                ((BizTimeLineAdCardInfo) this.instance).setAdCardInfo(str);
                return this;
            }

            public Builder setAdCardInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((BizTimeLineAdCardInfo) this.instance).setAdCardInfoBytes(kVar);
                return this;
            }

            public Builder setAdPos(int i) {
                copyOnWrite();
                ((BizTimeLineAdCardInfo) this.instance).setAdPos(i);
                return this;
            }

            private Builder() {
                super(BizTimeLineAdCardInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            BizTimeLineAdCardInfo bizTimeLineAdCardInfo = new BizTimeLineAdCardInfo();
            DEFAULT_INSTANCE = bizTimeLineAdCardInfo;
            C23861l0.registerDefaultInstance(BizTimeLineAdCardInfo.class, bizTimeLineAdCardInfo);
        }

        private BizTimeLineAdCardInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAdCardInfo() {
            this.bitField0_ &= -3;
            this.adCardInfo_ = getDefaultInstance().getAdCardInfo();
        }

        /* access modifiers changed from: private */
        public void clearAdPos() {
            this.bitField0_ &= -2;
            this.adPos_ = 0;
        }

        public static BizTimeLineAdCardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizTimeLineAdCardInfo parseDelimitedFrom(InputStream inputStream) {
            return (BizTimeLineAdCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizTimeLineAdCardInfo parseFrom(ByteBuffer byteBuffer) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizTimeLineAdCardInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAdCardInfo(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.adCardInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setAdCardInfoBytes(C16994k kVar) {
            this.adCardInfo_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setAdPos(int i) {
            this.bitField0_ |= 1;
            this.adPos_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "adPos_", "adCardInfo_"});
                case 3:
                    return new BizTimeLineAdCardInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizTimeLineAdCardInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizTimeLineAdCardInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getAdCardInfo() {
            return this.adCardInfo_;
        }

        public C16994k getAdCardInfoBytes() {
            return C16994k.m16791k(this.adCardInfo_);
        }

        public int getAdPos() {
            return this.adPos_;
        }

        public boolean hasAdCardInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasAdPos() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizTimeLineAdCardInfo bizTimeLineAdCardInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizTimeLineAdCardInfo);
        }

        public static BizTimeLineAdCardInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizTimeLineAdCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizTimeLineAdCardInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizTimeLineAdCardInfo parseFrom(C16994k kVar) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizTimeLineAdCardInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizTimeLineAdCardInfo parseFrom(byte[] bArr) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizTimeLineAdCardInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizTimeLineAdCardInfo parseFrom(InputStream inputStream) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizTimeLineAdCardInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizTimeLineAdCardInfo parseFrom(C23856l lVar) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizTimeLineAdCardInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizTimeLineAdCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$BizTimeLineAdCardInfoOrBuilder */
    public interface BizTimeLineAdCardInfoOrBuilder extends C23848k1 {
        String getAdCardInfo();

        C16994k getAdCardInfoBytes();

        int getAdPos();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasAdCardInfo();

        boolean hasAdPos();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$CanvasRecCardInfo */
    public static final class CanvasRecCardInfo extends C23861l0<CanvasRecCardInfo, Builder> implements CanvasRecCardInfoOrBuilder {
        public static final int CARD_INFO_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final CanvasRecCardInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<CanvasRecCardInfo> PARSER;
        private int bitField0_;
        private BizCgiCardProto.BizRecommendExptXml cardInfo_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$CanvasRecCardInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<CanvasRecCardInfo, Builder> implements CanvasRecCardInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearCardInfo() {
                copyOnWrite();
                ((CanvasRecCardInfo) this.instance).clearCardInfo();
                return this;
            }

            public BizCgiCardProto.BizRecommendExptXml getCardInfo() {
                return ((CanvasRecCardInfo) this.instance).getCardInfo();
            }

            public boolean hasCardInfo() {
                return ((CanvasRecCardInfo) this.instance).hasCardInfo();
            }

            public Builder mergeCardInfo(BizCgiCardProto.BizRecommendExptXml bizRecommendExptXml) {
                copyOnWrite();
                ((CanvasRecCardInfo) this.instance).mergeCardInfo(bizRecommendExptXml);
                return this;
            }

            public Builder setCardInfo(BizCgiCardProto.BizRecommendExptXml bizRecommendExptXml) {
                copyOnWrite();
                ((CanvasRecCardInfo) this.instance).setCardInfo(bizRecommendExptXml);
                return this;
            }

            private Builder() {
                super(CanvasRecCardInfo.DEFAULT_INSTANCE);
            }

            public Builder setCardInfo(BizCgiCardProto.BizRecommendExptXml.Builder builder) {
                copyOnWrite();
                ((CanvasRecCardInfo) this.instance).setCardInfo((BizCgiCardProto.BizRecommendExptXml) builder.build());
                return this;
            }
        }

        static {
            CanvasRecCardInfo canvasRecCardInfo = new CanvasRecCardInfo();
            DEFAULT_INSTANCE = canvasRecCardInfo;
            C23861l0.registerDefaultInstance(CanvasRecCardInfo.class, canvasRecCardInfo);
        }

        private CanvasRecCardInfo() {
        }

        /* access modifiers changed from: private */
        public void clearCardInfo() {
            this.cardInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static CanvasRecCardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCardInfo(BizCgiCardProto.BizRecommendExptXml bizRecommendExptXml) {
            bizRecommendExptXml.getClass();
            BizCgiCardProto.BizRecommendExptXml bizRecommendExptXml2 = this.cardInfo_;
            if (bizRecommendExptXml2 == null || bizRecommendExptXml2 == BizCgiCardProto.BizRecommendExptXml.getDefaultInstance()) {
                this.cardInfo_ = bizRecommendExptXml;
            } else {
                this.cardInfo_ = (BizCgiCardProto.BizRecommendExptXml) ((BizCgiCardProto.BizRecommendExptXml.Builder) BizCgiCardProto.BizRecommendExptXml.newBuilder(this.cardInfo_).mergeFrom(bizRecommendExptXml)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CanvasRecCardInfo parseDelimitedFrom(InputStream inputStream) {
            return (CanvasRecCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CanvasRecCardInfo parseFrom(ByteBuffer byteBuffer) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CanvasRecCardInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCardInfo(BizCgiCardProto.BizRecommendExptXml bizRecommendExptXml) {
            bizRecommendExptXml.getClass();
            this.cardInfo_ = bizRecommendExptXml;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "cardInfo_"});
                case 3:
                    return new CanvasRecCardInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CanvasRecCardInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CanvasRecCardInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public BizCgiCardProto.BizRecommendExptXml getCardInfo() {
            BizCgiCardProto.BizRecommendExptXml bizRecommendExptXml = this.cardInfo_;
            return bizRecommendExptXml == null ? BizCgiCardProto.BizRecommendExptXml.getDefaultInstance() : bizRecommendExptXml;
        }

        public boolean hasCardInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(CanvasRecCardInfo canvasRecCardInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(canvasRecCardInfo);
        }

        public static CanvasRecCardInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CanvasRecCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CanvasRecCardInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CanvasRecCardInfo parseFrom(C16994k kVar) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CanvasRecCardInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CanvasRecCardInfo parseFrom(byte[] bArr) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CanvasRecCardInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CanvasRecCardInfo parseFrom(InputStream inputStream) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CanvasRecCardInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CanvasRecCardInfo parseFrom(C23856l lVar) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CanvasRecCardInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CanvasRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$CanvasRecCardInfoOrBuilder */
    public interface CanvasRecCardInfoOrBuilder extends C23848k1 {
        BizCgiCardProto.BizRecommendExptXml getCardInfo();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasCardInfo();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$CommItemContext */
    public static final class CommItemContext extends C23861l0<CommItemContext, Builder> implements CommItemContextOrBuilder {
        public static final int APPMSGID_FIELD_NUMBER = 2;
        public static final int BIZUIN_FIELD_NUMBER = 1;
        public static final int CARD_TYPE_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final CommItemContext DEFAULT_INSTANCE;
        public static final int EXTRA_DATA_FIELD_NUMBER = 10;
        public static final int IS_CLICK_FIELD_NUMBER = 8;
        public static final int IS_OFTEN_READ_FIELD_NUMBER = 9;
        public static final int ITEMIDX_FIELD_NUMBER = 3;
        public static final int ITEM_SHOW_TYPE_FIELD_NUMBER = 5;
        private static volatile C24062w1<CommItemContext> PARSER = null;
        public static final int POS_FIELD_NUMBER = 7;
        public static final int STYLE_FIELD_NUMBER = 12;
        public static final int TIME_FIELD_NUMBER = 4;
        public static final int WORDING_REPORT_INFO_FIELD_NUMBER = 11;
        private int appmsgid_;
        private int bitField0_;
        private int bizuin_;
        private int cardType_;
        private String extraData_ = "";
        private boolean isClick_;
        private boolean isOftenRead_;
        private int itemShowType_;
        private int itemidx_;
        private int pos_;
        private int style_;
        private int time_;
        private String wordingReportInfo_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$CommItemContext$Builder */
        public static final class Builder extends C23861l0.C23862a<CommItemContext, Builder> implements CommItemContextOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearAppmsgid() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearAppmsgid();
                return this;
            }

            public Builder clearBizuin() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearBizuin();
                return this;
            }

            public Builder clearCardType() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearCardType();
                return this;
            }

            public Builder clearExtraData() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearExtraData();
                return this;
            }

            public Builder clearIsClick() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearIsClick();
                return this;
            }

            public Builder clearIsOftenRead() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearIsOftenRead();
                return this;
            }

            public Builder clearItemShowType() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearItemShowType();
                return this;
            }

            public Builder clearItemidx() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearItemidx();
                return this;
            }

            public Builder clearPos() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearPos();
                return this;
            }

            public Builder clearStyle() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearStyle();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearTime();
                return this;
            }

            public Builder clearWordingReportInfo() {
                copyOnWrite();
                ((CommItemContext) this.instance).clearWordingReportInfo();
                return this;
            }

            public int getAppmsgid() {
                return ((CommItemContext) this.instance).getAppmsgid();
            }

            public int getBizuin() {
                return ((CommItemContext) this.instance).getBizuin();
            }

            public int getCardType() {
                return ((CommItemContext) this.instance).getCardType();
            }

            public String getExtraData() {
                return ((CommItemContext) this.instance).getExtraData();
            }

            public C16994k getExtraDataBytes() {
                return ((CommItemContext) this.instance).getExtraDataBytes();
            }

            public boolean getIsClick() {
                return ((CommItemContext) this.instance).getIsClick();
            }

            public boolean getIsOftenRead() {
                return ((CommItemContext) this.instance).getIsOftenRead();
            }

            public int getItemShowType() {
                return ((CommItemContext) this.instance).getItemShowType();
            }

            public int getItemidx() {
                return ((CommItemContext) this.instance).getItemidx();
            }

            public int getPos() {
                return ((CommItemContext) this.instance).getPos();
            }

            public int getStyle() {
                return ((CommItemContext) this.instance).getStyle();
            }

            public int getTime() {
                return ((CommItemContext) this.instance).getTime();
            }

            public String getWordingReportInfo() {
                return ((CommItemContext) this.instance).getWordingReportInfo();
            }

            public C16994k getWordingReportInfoBytes() {
                return ((CommItemContext) this.instance).getWordingReportInfoBytes();
            }

            public boolean hasAppmsgid() {
                return ((CommItemContext) this.instance).hasAppmsgid();
            }

            public boolean hasBizuin() {
                return ((CommItemContext) this.instance).hasBizuin();
            }

            public boolean hasCardType() {
                return ((CommItemContext) this.instance).hasCardType();
            }

            public boolean hasExtraData() {
                return ((CommItemContext) this.instance).hasExtraData();
            }

            public boolean hasIsClick() {
                return ((CommItemContext) this.instance).hasIsClick();
            }

            public boolean hasIsOftenRead() {
                return ((CommItemContext) this.instance).hasIsOftenRead();
            }

            public boolean hasItemShowType() {
                return ((CommItemContext) this.instance).hasItemShowType();
            }

            public boolean hasItemidx() {
                return ((CommItemContext) this.instance).hasItemidx();
            }

            public boolean hasPos() {
                return ((CommItemContext) this.instance).hasPos();
            }

            public boolean hasStyle() {
                return ((CommItemContext) this.instance).hasStyle();
            }

            public boolean hasTime() {
                return ((CommItemContext) this.instance).hasTime();
            }

            public boolean hasWordingReportInfo() {
                return ((CommItemContext) this.instance).hasWordingReportInfo();
            }

            public Builder setAppmsgid(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setAppmsgid(i);
                return this;
            }

            public Builder setBizuin(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setBizuin(i);
                return this;
            }

            public Builder setCardType(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setCardType(i);
                return this;
            }

            public Builder setExtraData(String str) {
                copyOnWrite();
                ((CommItemContext) this.instance).setExtraData(str);
                return this;
            }

            public Builder setExtraDataBytes(C16994k kVar) {
                copyOnWrite();
                ((CommItemContext) this.instance).setExtraDataBytes(kVar);
                return this;
            }

            public Builder setIsClick(boolean z) {
                copyOnWrite();
                ((CommItemContext) this.instance).setIsClick(z);
                return this;
            }

            public Builder setIsOftenRead(boolean z) {
                copyOnWrite();
                ((CommItemContext) this.instance).setIsOftenRead(z);
                return this;
            }

            public Builder setItemShowType(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setItemShowType(i);
                return this;
            }

            public Builder setItemidx(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setItemidx(i);
                return this;
            }

            public Builder setPos(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setPos(i);
                return this;
            }

            public Builder setStyle(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setStyle(i);
                return this;
            }

            public Builder setTime(int i) {
                copyOnWrite();
                ((CommItemContext) this.instance).setTime(i);
                return this;
            }

            public Builder setWordingReportInfo(String str) {
                copyOnWrite();
                ((CommItemContext) this.instance).setWordingReportInfo(str);
                return this;
            }

            public Builder setWordingReportInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((CommItemContext) this.instance).setWordingReportInfoBytes(kVar);
                return this;
            }

            private Builder() {
                super(CommItemContext.DEFAULT_INSTANCE);
            }
        }

        static {
            CommItemContext commItemContext = new CommItemContext();
            DEFAULT_INSTANCE = commItemContext;
            C23861l0.registerDefaultInstance(CommItemContext.class, commItemContext);
        }

        private CommItemContext() {
        }

        /* access modifiers changed from: private */
        public void clearAppmsgid() {
            this.bitField0_ &= -3;
            this.appmsgid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBizuin() {
            this.bitField0_ &= -2;
            this.bizuin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCardType() {
            this.bitField0_ &= -33;
            this.cardType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExtraData() {
            this.bitField0_ &= -513;
            this.extraData_ = getDefaultInstance().getExtraData();
        }

        /* access modifiers changed from: private */
        public void clearIsClick() {
            this.bitField0_ &= -129;
            this.isClick_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsOftenRead() {
            this.bitField0_ &= -257;
            this.isOftenRead_ = false;
        }

        /* access modifiers changed from: private */
        public void clearItemShowType() {
            this.bitField0_ &= -17;
            this.itemShowType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearItemidx() {
            this.bitField0_ &= -5;
            this.itemidx_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPos() {
            this.bitField0_ &= -65;
            this.pos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStyle() {
            this.bitField0_ &= -2049;
            this.style_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.bitField0_ &= -9;
            this.time_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWordingReportInfo() {
            this.bitField0_ &= -1025;
            this.wordingReportInfo_ = getDefaultInstance().getWordingReportInfo();
        }

        public static CommItemContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CommItemContext parseDelimitedFrom(InputStream inputStream) {
            return (CommItemContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommItemContext parseFrom(ByteBuffer byteBuffer) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CommItemContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppmsgid(int i) {
            this.bitField0_ |= 2;
            this.appmsgid_ = i;
        }

        /* access modifiers changed from: private */
        public void setBizuin(int i) {
            this.bitField0_ |= 1;
            this.bizuin_ = i;
        }

        /* access modifiers changed from: private */
        public void setCardType(int i) {
            this.bitField0_ |= 32;
            this.cardType_ = i;
        }

        /* access modifiers changed from: private */
        public void setExtraData(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.extraData_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtraDataBytes(C16994k kVar) {
            this.extraData_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setIsClick(boolean z) {
            this.bitField0_ |= 128;
            this.isClick_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsOftenRead(boolean z) {
            this.bitField0_ |= 256;
            this.isOftenRead_ = z;
        }

        /* access modifiers changed from: private */
        public void setItemShowType(int i) {
            this.bitField0_ |= 16;
            this.itemShowType_ = i;
        }

        /* access modifiers changed from: private */
        public void setItemidx(int i) {
            this.bitField0_ |= 4;
            this.itemidx_ = i;
        }

        /* access modifiers changed from: private */
        public void setPos(int i) {
            this.bitField0_ |= 64;
            this.pos_ = i;
        }

        /* access modifiers changed from: private */
        public void setStyle(int i) {
            this.bitField0_ |= 2048;
            this.style_ = i;
        }

        /* access modifiers changed from: private */
        public void setTime(int i) {
            this.bitField0_ |= 8;
            this.time_ = i;
        }

        /* access modifiers changed from: private */
        public void setWordingReportInfo(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.wordingReportInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setWordingReportInfoBytes(C16994k kVar) {
            this.wordingReportInfo_ = kVar.mo18752u();
            this.bitField0_ |= 1024;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဇ\u0007\tဇ\b\nဈ\t\u000bဈ\n\fဋ\u000b", new Object[]{"bitField0_", "bizuin_", "appmsgid_", "itemidx_", "time_", "itemShowType_", "cardType_", "pos_", "isClick_", "isOftenRead_", "extraData_", "wordingReportInfo_", "style_"});
                case 3:
                    return new CommItemContext();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CommItemContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CommItemContext.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getAppmsgid() {
            return this.appmsgid_;
        }

        public int getBizuin() {
            return this.bizuin_;
        }

        public int getCardType() {
            return this.cardType_;
        }

        public String getExtraData() {
            return this.extraData_;
        }

        public C16994k getExtraDataBytes() {
            return C16994k.m16791k(this.extraData_);
        }

        public boolean getIsClick() {
            return this.isClick_;
        }

        public boolean getIsOftenRead() {
            return this.isOftenRead_;
        }

        public int getItemShowType() {
            return this.itemShowType_;
        }

        public int getItemidx() {
            return this.itemidx_;
        }

        public int getPos() {
            return this.pos_;
        }

        public int getStyle() {
            return this.style_;
        }

        public int getTime() {
            return this.time_;
        }

        public String getWordingReportInfo() {
            return this.wordingReportInfo_;
        }

        public C16994k getWordingReportInfoBytes() {
            return C16994k.m16791k(this.wordingReportInfo_);
        }

        public boolean hasAppmsgid() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasBizuin() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCardType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasExtraData() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasIsClick() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasIsOftenRead() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasItemShowType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasItemidx() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasPos() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasStyle() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasTime() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasWordingReportInfo() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(CommItemContext commItemContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(commItemContext);
        }

        public static CommItemContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommItemContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommItemContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CommItemContext parseFrom(C16994k kVar) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CommItemContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CommItemContext parseFrom(byte[] bArr) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CommItemContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CommItemContext parseFrom(InputStream inputStream) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CommItemContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CommItemContext parseFrom(C23856l lVar) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CommItemContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CommItemContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$CommItemContextOrBuilder */
    public interface CommItemContextOrBuilder extends C23848k1 {
        int getAppmsgid();

        int getBizuin();

        int getCardType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getExtraData();

        C16994k getExtraDataBytes();

        boolean getIsClick();

        boolean getIsOftenRead();

        int getItemShowType();

        int getItemidx();

        int getPos();

        int getStyle();

        int getTime();

        String getWordingReportInfo();

        C16994k getWordingReportInfoBytes();

        boolean hasAppmsgid();

        boolean hasBizuin();

        boolean hasCardType();

        boolean hasExtraData();

        boolean hasIsClick();

        boolean hasIsOftenRead();

        boolean hasItemShowType();

        boolean hasItemidx();

        boolean hasPos();

        boolean hasStyle();

        boolean hasTime();

        boolean hasWordingReportInfo();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$DigestExposureInfo */
    public static final class DigestExposureInfo extends C23861l0<DigestExposureInfo, Builder> implements DigestExposureInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final DigestExposureInfo DEFAULT_INSTANCE;
        public static final int DIGEST_EXPOSURE_CNT_FIELD_NUMBER = 1;
        public static final int DIGEST_EXPOSURE_PERIOD_FIELD_NUMBER = 2;
        public static final int DIGEST_EXPOSURE_POS_FIELD_NUMBER = 3;
        private static volatile C24062w1<DigestExposureInfo> PARSER;
        private int bitField0_;
        private int digestExposureCnt_;
        private int digestExposurePeriod_;
        private int digestExposurePos_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$DigestExposureInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<DigestExposureInfo, Builder> implements DigestExposureInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearDigestExposureCnt() {
                copyOnWrite();
                ((DigestExposureInfo) this.instance).clearDigestExposureCnt();
                return this;
            }

            public Builder clearDigestExposurePeriod() {
                copyOnWrite();
                ((DigestExposureInfo) this.instance).clearDigestExposurePeriod();
                return this;
            }

            public Builder clearDigestExposurePos() {
                copyOnWrite();
                ((DigestExposureInfo) this.instance).clearDigestExposurePos();
                return this;
            }

            public int getDigestExposureCnt() {
                return ((DigestExposureInfo) this.instance).getDigestExposureCnt();
            }

            public int getDigestExposurePeriod() {
                return ((DigestExposureInfo) this.instance).getDigestExposurePeriod();
            }

            public int getDigestExposurePos() {
                return ((DigestExposureInfo) this.instance).getDigestExposurePos();
            }

            public boolean hasDigestExposureCnt() {
                return ((DigestExposureInfo) this.instance).hasDigestExposureCnt();
            }

            public boolean hasDigestExposurePeriod() {
                return ((DigestExposureInfo) this.instance).hasDigestExposurePeriod();
            }

            public boolean hasDigestExposurePos() {
                return ((DigestExposureInfo) this.instance).hasDigestExposurePos();
            }

            public Builder setDigestExposureCnt(int i) {
                copyOnWrite();
                ((DigestExposureInfo) this.instance).setDigestExposureCnt(i);
                return this;
            }

            public Builder setDigestExposurePeriod(int i) {
                copyOnWrite();
                ((DigestExposureInfo) this.instance).setDigestExposurePeriod(i);
                return this;
            }

            public Builder setDigestExposurePos(int i) {
                copyOnWrite();
                ((DigestExposureInfo) this.instance).setDigestExposurePos(i);
                return this;
            }

            private Builder() {
                super(DigestExposureInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            DigestExposureInfo digestExposureInfo = new DigestExposureInfo();
            DEFAULT_INSTANCE = digestExposureInfo;
            C23861l0.registerDefaultInstance(DigestExposureInfo.class, digestExposureInfo);
        }

        private DigestExposureInfo() {
        }

        /* access modifiers changed from: private */
        public void clearDigestExposureCnt() {
            this.bitField0_ &= -2;
            this.digestExposureCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDigestExposurePeriod() {
            this.bitField0_ &= -3;
            this.digestExposurePeriod_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDigestExposurePos() {
            this.bitField0_ &= -5;
            this.digestExposurePos_ = 0;
        }

        public static DigestExposureInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DigestExposureInfo parseDelimitedFrom(InputStream inputStream) {
            return (DigestExposureInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DigestExposureInfo parseFrom(ByteBuffer byteBuffer) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<DigestExposureInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDigestExposureCnt(int i) {
            this.bitField0_ |= 1;
            this.digestExposureCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setDigestExposurePeriod(int i) {
            this.bitField0_ |= 2;
            this.digestExposurePeriod_ = i;
        }

        /* access modifiers changed from: private */
        public void setDigestExposurePos(int i) {
            this.bitField0_ |= 4;
            this.digestExposurePos_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "digestExposureCnt_", "digestExposurePeriod_", "digestExposurePos_"});
                case 3:
                    return new DigestExposureInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<DigestExposureInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (DigestExposureInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getDigestExposureCnt() {
            return this.digestExposureCnt_;
        }

        public int getDigestExposurePeriod() {
            return this.digestExposurePeriod_;
        }

        public int getDigestExposurePos() {
            return this.digestExposurePos_;
        }

        public boolean hasDigestExposureCnt() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDigestExposurePeriod() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDigestExposurePos() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(DigestExposureInfo digestExposureInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(digestExposureInfo);
        }

        public static DigestExposureInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DigestExposureInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DigestExposureInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static DigestExposureInfo parseFrom(C16994k kVar) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static DigestExposureInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static DigestExposureInfo parseFrom(byte[] bArr) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DigestExposureInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static DigestExposureInfo parseFrom(InputStream inputStream) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DigestExposureInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DigestExposureInfo parseFrom(C23856l lVar) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static DigestExposureInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (DigestExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$DigestExposureInfoOrBuilder */
    public interface DigestExposureInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDigestExposureCnt();

        int getDigestExposurePeriod();

        int getDigestExposurePos();

        boolean hasDigestExposureCnt();

        boolean hasDigestExposurePeriod();

        boolean hasDigestExposurePos();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$DigestMsgCardInfo */
    public static final class DigestMsgCardInfo extends C23861l0<DigestMsgCardInfo, Builder> implements DigestMsgCardInfoOrBuilder {
        public static final int BIZUSERNAME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final DigestMsgCardInfo DEFAULT_INSTANCE;
        public static final int DIGEST_MSG_TYPE_FIELD_NUMBER = 1;
        private static volatile C24062w1<DigestMsgCardInfo> PARSER;
        private int bitField0_;
        private String bizusername_ = "";
        private int digestMsgType_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$DigestMsgCardInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<DigestMsgCardInfo, Builder> implements DigestMsgCardInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearBizusername() {
                copyOnWrite();
                ((DigestMsgCardInfo) this.instance).clearBizusername();
                return this;
            }

            public Builder clearDigestMsgType() {
                copyOnWrite();
                ((DigestMsgCardInfo) this.instance).clearDigestMsgType();
                return this;
            }

            public String getBizusername() {
                return ((DigestMsgCardInfo) this.instance).getBizusername();
            }

            public C16994k getBizusernameBytes() {
                return ((DigestMsgCardInfo) this.instance).getBizusernameBytes();
            }

            public int getDigestMsgType() {
                return ((DigestMsgCardInfo) this.instance).getDigestMsgType();
            }

            public boolean hasBizusername() {
                return ((DigestMsgCardInfo) this.instance).hasBizusername();
            }

            public boolean hasDigestMsgType() {
                return ((DigestMsgCardInfo) this.instance).hasDigestMsgType();
            }

            public Builder setBizusername(String str) {
                copyOnWrite();
                ((DigestMsgCardInfo) this.instance).setBizusername(str);
                return this;
            }

            public Builder setBizusernameBytes(C16994k kVar) {
                copyOnWrite();
                ((DigestMsgCardInfo) this.instance).setBizusernameBytes(kVar);
                return this;
            }

            public Builder setDigestMsgType(int i) {
                copyOnWrite();
                ((DigestMsgCardInfo) this.instance).setDigestMsgType(i);
                return this;
            }

            private Builder() {
                super(DigestMsgCardInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            DigestMsgCardInfo digestMsgCardInfo = new DigestMsgCardInfo();
            DEFAULT_INSTANCE = digestMsgCardInfo;
            C23861l0.registerDefaultInstance(DigestMsgCardInfo.class, digestMsgCardInfo);
        }

        private DigestMsgCardInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBizusername() {
            this.bitField0_ &= -3;
            this.bizusername_ = getDefaultInstance().getBizusername();
        }

        /* access modifiers changed from: private */
        public void clearDigestMsgType() {
            this.bitField0_ &= -2;
            this.digestMsgType_ = 0;
        }

        public static DigestMsgCardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DigestMsgCardInfo parseDelimitedFrom(InputStream inputStream) {
            return (DigestMsgCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DigestMsgCardInfo parseFrom(ByteBuffer byteBuffer) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<DigestMsgCardInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBizusername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.bizusername_ = str;
        }

        /* access modifiers changed from: private */
        public void setBizusernameBytes(C16994k kVar) {
            this.bizusername_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setDigestMsgType(int i) {
            this.bitField0_ |= 1;
            this.digestMsgType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "digestMsgType_", "bizusername_"});
                case 3:
                    return new DigestMsgCardInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<DigestMsgCardInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (DigestMsgCardInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getBizusername() {
            return this.bizusername_;
        }

        public C16994k getBizusernameBytes() {
            return C16994k.m16791k(this.bizusername_);
        }

        public int getDigestMsgType() {
            return this.digestMsgType_;
        }

        public boolean hasBizusername() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDigestMsgType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DigestMsgCardInfo digestMsgCardInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(digestMsgCardInfo);
        }

        public static DigestMsgCardInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DigestMsgCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DigestMsgCardInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static DigestMsgCardInfo parseFrom(C16994k kVar) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static DigestMsgCardInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static DigestMsgCardInfo parseFrom(byte[] bArr) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DigestMsgCardInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static DigestMsgCardInfo parseFrom(InputStream inputStream) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DigestMsgCardInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DigestMsgCardInfo parseFrom(C23856l lVar) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static DigestMsgCardInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (DigestMsgCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$DigestMsgCardInfoOrBuilder */
    public interface DigestMsgCardInfoOrBuilder extends C23848k1 {
        String getBizusername();

        C16994k getBizusernameBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDigestMsgType();

        boolean hasBizusername();

        boolean hasDigestMsgType();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ExtraInsertCard */
    public static final class ExtraInsertCard extends C23861l0<ExtraInsertCard, Builder> implements ExtraInsertCardOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 4;
        public static final int CARD_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final ExtraInsertCard DEFAULT_INSTANCE;
        private static volatile C24062w1<ExtraInsertCard> PARSER = null;
        public static final int POS_FIELD_NUMBER = 1;
        public static final int REPLACE_LOCAL_ID_FIELD_NUMBER = 3;
        private int action_;
        private int bitField0_;
        private ViewMsgCard card_;
        private int pos_;
        private long replaceLocalId_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ExtraInsertCard$Builder */
        public static final class Builder extends C23861l0.C23862a<ExtraInsertCard, Builder> implements ExtraInsertCardOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearAction() {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).clearAction();
                return this;
            }

            public Builder clearCard() {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).clearCard();
                return this;
            }

            public Builder clearPos() {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).clearPos();
                return this;
            }

            public Builder clearReplaceLocalId() {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).clearReplaceLocalId();
                return this;
            }

            public int getAction() {
                return ((ExtraInsertCard) this.instance).getAction();
            }

            public ViewMsgCard getCard() {
                return ((ExtraInsertCard) this.instance).getCard();
            }

            public int getPos() {
                return ((ExtraInsertCard) this.instance).getPos();
            }

            public long getReplaceLocalId() {
                return ((ExtraInsertCard) this.instance).getReplaceLocalId();
            }

            public boolean hasAction() {
                return ((ExtraInsertCard) this.instance).hasAction();
            }

            public boolean hasCard() {
                return ((ExtraInsertCard) this.instance).hasCard();
            }

            public boolean hasPos() {
                return ((ExtraInsertCard) this.instance).hasPos();
            }

            public boolean hasReplaceLocalId() {
                return ((ExtraInsertCard) this.instance).hasReplaceLocalId();
            }

            public Builder mergeCard(ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).mergeCard(viewMsgCard);
                return this;
            }

            public Builder setAction(int i) {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).setAction(i);
                return this;
            }

            public Builder setCard(ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).setCard(viewMsgCard);
                return this;
            }

            public Builder setPos(int i) {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).setPos(i);
                return this;
            }

            public Builder setReplaceLocalId(long j) {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).setReplaceLocalId(j);
                return this;
            }

            private Builder() {
                super(ExtraInsertCard.DEFAULT_INSTANCE);
            }

            public Builder setCard(ViewMsgCard.Builder builder) {
                copyOnWrite();
                ((ExtraInsertCard) this.instance).setCard((ViewMsgCard) builder.build());
                return this;
            }
        }

        static {
            ExtraInsertCard extraInsertCard = new ExtraInsertCard();
            DEFAULT_INSTANCE = extraInsertCard;
            C23861l0.registerDefaultInstance(ExtraInsertCard.class, extraInsertCard);
        }

        private ExtraInsertCard() {
        }

        /* access modifiers changed from: private */
        public void clearAction() {
            this.bitField0_ &= -9;
            this.action_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCard() {
            this.card_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearPos() {
            this.bitField0_ &= -2;
            this.pos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReplaceLocalId() {
            this.bitField0_ &= -5;
            this.replaceLocalId_ = 0;
        }

        public static ExtraInsertCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCard(ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            ViewMsgCard viewMsgCard2 = this.card_;
            if (viewMsgCard2 == null || viewMsgCard2 == ViewMsgCard.getDefaultInstance()) {
                this.card_ = viewMsgCard;
            } else {
                this.card_ = (ViewMsgCard) ((ViewMsgCard.Builder) ViewMsgCard.newBuilder(this.card_).mergeFrom(viewMsgCard)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtraInsertCard parseDelimitedFrom(InputStream inputStream) {
            return (ExtraInsertCard) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtraInsertCard parseFrom(ByteBuffer byteBuffer) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<ExtraInsertCard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAction(int i) {
            this.bitField0_ |= 8;
            this.action_ = i;
        }

        /* access modifiers changed from: private */
        public void setCard(ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            this.card_ = viewMsgCard;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setPos(int i) {
            this.bitField0_ |= 1;
            this.pos_ = i;
        }

        /* access modifiers changed from: private */
        public void setReplaceLocalId(long j) {
            this.bitField0_ |= 4;
            this.replaceLocalId_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဉ\u0001\u0003ဃ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "pos_", "card_", "replaceLocalId_", "action_"});
                case 3:
                    return new ExtraInsertCard();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<ExtraInsertCard> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ExtraInsertCard.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getAction() {
            return this.action_;
        }

        public ViewMsgCard getCard() {
            ViewMsgCard viewMsgCard = this.card_;
            return viewMsgCard == null ? ViewMsgCard.getDefaultInstance() : viewMsgCard;
        }

        public int getPos() {
            return this.pos_;
        }

        public long getReplaceLocalId() {
            return this.replaceLocalId_;
        }

        public boolean hasAction() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasCard() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPos() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasReplaceLocalId() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(ExtraInsertCard extraInsertCard) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(extraInsertCard);
        }

        public static ExtraInsertCard parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ExtraInsertCard) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ExtraInsertCard parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ExtraInsertCard parseFrom(C16994k kVar) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ExtraInsertCard parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ExtraInsertCard parseFrom(byte[] bArr) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtraInsertCard parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ExtraInsertCard parseFrom(InputStream inputStream) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtraInsertCard parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ExtraInsertCard parseFrom(C23856l lVar) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ExtraInsertCard parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ExtraInsertCard) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ExtraInsertCardOrBuilder */
    public interface ExtraInsertCardOrBuilder extends C23848k1 {
        int getAction();

        ViewMsgCard getCard();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getPos();

        long getReplaceLocalId();

        boolean hasAction();

        boolean hasCard();

        boolean hasPos();

        boolean hasReplaceLocalId();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$FrameSetInfo */
    public static final class FrameSetInfo extends C23861l0<FrameSetInfo, Builder> implements FrameSetInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final FrameSetInfo DEFAULT_INSTANCE;
        public static final int FRAME_SET_DATA_FIELD_NUMBER = 2;
        public static final int FRAME_SET_NAME_FIELD_NUMBER = 1;
        private static volatile C24062w1<FrameSetInfo> PARSER;
        private int bitField0_;
        private String frameSetData_ = "";
        private String frameSetName_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$FrameSetInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<FrameSetInfo, Builder> implements FrameSetInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearFrameSetData() {
                copyOnWrite();
                ((FrameSetInfo) this.instance).clearFrameSetData();
                return this;
            }

            public Builder clearFrameSetName() {
                copyOnWrite();
                ((FrameSetInfo) this.instance).clearFrameSetName();
                return this;
            }

            public String getFrameSetData() {
                return ((FrameSetInfo) this.instance).getFrameSetData();
            }

            public C16994k getFrameSetDataBytes() {
                return ((FrameSetInfo) this.instance).getFrameSetDataBytes();
            }

            public String getFrameSetName() {
                return ((FrameSetInfo) this.instance).getFrameSetName();
            }

            public C16994k getFrameSetNameBytes() {
                return ((FrameSetInfo) this.instance).getFrameSetNameBytes();
            }

            public boolean hasFrameSetData() {
                return ((FrameSetInfo) this.instance).hasFrameSetData();
            }

            public boolean hasFrameSetName() {
                return ((FrameSetInfo) this.instance).hasFrameSetName();
            }

            public Builder setFrameSetData(String str) {
                copyOnWrite();
                ((FrameSetInfo) this.instance).setFrameSetData(str);
                return this;
            }

            public Builder setFrameSetDataBytes(C16994k kVar) {
                copyOnWrite();
                ((FrameSetInfo) this.instance).setFrameSetDataBytes(kVar);
                return this;
            }

            public Builder setFrameSetName(String str) {
                copyOnWrite();
                ((FrameSetInfo) this.instance).setFrameSetName(str);
                return this;
            }

            public Builder setFrameSetNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FrameSetInfo) this.instance).setFrameSetNameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FrameSetInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FrameSetInfo frameSetInfo = new FrameSetInfo();
            DEFAULT_INSTANCE = frameSetInfo;
            C23861l0.registerDefaultInstance(FrameSetInfo.class, frameSetInfo);
        }

        private FrameSetInfo() {
        }

        /* access modifiers changed from: private */
        public void clearFrameSetData() {
            this.bitField0_ &= -3;
            this.frameSetData_ = getDefaultInstance().getFrameSetData();
        }

        /* access modifiers changed from: private */
        public void clearFrameSetName() {
            this.bitField0_ &= -2;
            this.frameSetName_ = getDefaultInstance().getFrameSetName();
        }

        public static FrameSetInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FrameSetInfo parseDelimitedFrom(InputStream inputStream) {
            return (FrameSetInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FrameSetInfo parseFrom(ByteBuffer byteBuffer) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FrameSetInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFrameSetData(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.frameSetData_ = str;
        }

        /* access modifiers changed from: private */
        public void setFrameSetDataBytes(C16994k kVar) {
            this.frameSetData_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setFrameSetName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.frameSetName_ = str;
        }

        /* access modifiers changed from: private */
        public void setFrameSetNameBytes(C16994k kVar) {
            this.frameSetName_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "frameSetName_", "frameSetData_"});
                case 3:
                    return new FrameSetInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FrameSetInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FrameSetInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getFrameSetData() {
            return this.frameSetData_;
        }

        public C16994k getFrameSetDataBytes() {
            return C16994k.m16791k(this.frameSetData_);
        }

        public String getFrameSetName() {
            return this.frameSetName_;
        }

        public C16994k getFrameSetNameBytes() {
            return C16994k.m16791k(this.frameSetName_);
        }

        public boolean hasFrameSetData() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFrameSetName() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FrameSetInfo frameSetInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(frameSetInfo);
        }

        public static FrameSetInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FrameSetInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FrameSetInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FrameSetInfo parseFrom(C16994k kVar) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FrameSetInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FrameSetInfo parseFrom(byte[] bArr) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FrameSetInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FrameSetInfo parseFrom(InputStream inputStream) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FrameSetInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FrameSetInfo parseFrom(C23856l lVar) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FrameSetInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FrameSetInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$FrameSetInfoOrBuilder */
    public interface FrameSetInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFrameSetData();

        C16994k getFrameSetDataBytes();

        String getFrameSetName();

        C16994k getFrameSetNameBytes();

        boolean hasFrameSetData();

        boolean hasFrameSetName();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsIconType */
    public enum GetRecommendFeedsIconType implements C23908o0.C23911c {
        GET_RECOMMEND_FEEDS_ICON_TYPE_SEEN(1);
        
        public static final int GET_RECOMMEND_FEEDS_ICON_TYPE_SEEN_VALUE = 1;
        private static final C23908o0.C23912d<GetRecommendFeedsIconType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsIconType$GetRecommendFeedsIconTypeVerifier */
        public static final class GetRecommendFeedsIconTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new GetRecommendFeedsIconTypeVerifier();
            }

            private GetRecommendFeedsIconTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return GetRecommendFeedsIconType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<GetRecommendFeedsIconType>() {
                public GetRecommendFeedsIconType findValueByNumber(int i) {
                    return GetRecommendFeedsIconType.forNumber(i);
                }
            };
        }

        private GetRecommendFeedsIconType(int i) {
            this.value = i;
        }

        public static GetRecommendFeedsIconType forNumber(int i) {
            if (i != 1) {
                return null;
            }
            return GET_RECOMMEND_FEEDS_ICON_TYPE_SEEN;
        }

        public static C23908o0.C23912d<GetRecommendFeedsIconType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return GetRecommendFeedsIconTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GetRecommendFeedsIconType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsRequest */
    public static final class GetRecommendFeedsRequest extends C23861l0<GetRecommendFeedsRequest, Builder> implements GetRecommendFeedsRequestOrBuilder {
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int BIZMSGCONTEXT_FIELD_NUMBER = 5;
        public static final int BUFFER_FIELD_NUMBER = 3;
        public static final int CONTEXT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final GetRecommendFeedsRequest DEFAULT_INSTANCE;
        private static volatile C24062w1<GetRecommendFeedsRequest> PARSER = null;
        public static final int SCENE_FIELD_NUMBER = 2;
        private BaseRequest baseRequest_;
        private int bitField0_;
        private BizMsgReSortContext bizMsgContext_;
        private C16994k buffer_ = C16994k.f46000e;
        private RecommendFeedsContext context_;
        private byte memoizedIsInitialized = 2;
        private int scene_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsRequest$Builder */
        public static final class Builder extends C23861l0.C23862a<GetRecommendFeedsRequest, Builder> implements GetRecommendFeedsRequestOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearBizMsgContext() {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).clearBizMsgContext();
                return this;
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).clearBuffer();
                return this;
            }

            public Builder clearContext() {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).clearContext();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).clearScene();
                return this;
            }

            public BaseRequest getBaseRequest() {
                return ((GetRecommendFeedsRequest) this.instance).getBaseRequest();
            }

            public BizMsgReSortContext getBizMsgContext() {
                return ((GetRecommendFeedsRequest) this.instance).getBizMsgContext();
            }

            public C16994k getBuffer() {
                return ((GetRecommendFeedsRequest) this.instance).getBuffer();
            }

            public RecommendFeedsContext getContext() {
                return ((GetRecommendFeedsRequest) this.instance).getContext();
            }

            public int getScene() {
                return ((GetRecommendFeedsRequest) this.instance).getScene();
            }

            public boolean hasBaseRequest() {
                return ((GetRecommendFeedsRequest) this.instance).hasBaseRequest();
            }

            public boolean hasBizMsgContext() {
                return ((GetRecommendFeedsRequest) this.instance).hasBizMsgContext();
            }

            public boolean hasBuffer() {
                return ((GetRecommendFeedsRequest) this.instance).hasBuffer();
            }

            public boolean hasContext() {
                return ((GetRecommendFeedsRequest) this.instance).hasContext();
            }

            public boolean hasScene() {
                return ((GetRecommendFeedsRequest) this.instance).hasScene();
            }

            public Builder mergeBaseRequest(BaseRequest baseRequest) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeBizMsgContext(BizMsgReSortContext bizMsgReSortContext) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).mergeBizMsgContext(bizMsgReSortContext);
                return this;
            }

            public Builder mergeContext(RecommendFeedsContext recommendFeedsContext) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).mergeContext(recommendFeedsContext);
                return this;
            }

            public Builder setBaseRequest(BaseRequest baseRequest) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setBizMsgContext(BizMsgReSortContext bizMsgReSortContext) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setBizMsgContext(bizMsgReSortContext);
                return this;
            }

            public Builder setBuffer(C16994k kVar) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setBuffer(kVar);
                return this;
            }

            public Builder setContext(RecommendFeedsContext recommendFeedsContext) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setContext(recommendFeedsContext);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setScene(i);
                return this;
            }

            private Builder() {
                super(GetRecommendFeedsRequest.DEFAULT_INSTANCE);
            }

            public Builder setBaseRequest(BaseRequest.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setBaseRequest((BaseRequest) builder.build());
                return this;
            }

            public Builder setBizMsgContext(BizMsgReSortContext.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setBizMsgContext((BizMsgReSortContext) builder.build());
                return this;
            }

            public Builder setContext(RecommendFeedsContext.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsRequest) this.instance).setContext((RecommendFeedsContext) builder.build());
                return this;
            }
        }

        static {
            GetRecommendFeedsRequest getRecommendFeedsRequest = new GetRecommendFeedsRequest();
            DEFAULT_INSTANCE = getRecommendFeedsRequest;
            C23861l0.registerDefaultInstance(GetRecommendFeedsRequest.class, getRecommendFeedsRequest);
        }

        private GetRecommendFeedsRequest() {
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearBizMsgContext() {
            this.bizMsgContext_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -5;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearContext() {
            this.context_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -3;
            this.scene_ = 0;
        }

        public static GetRecommendFeedsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseRequest(BaseRequest baseRequest) {
            baseRequest.getClass();
            BaseRequest baseRequest2 = this.baseRequest_;
            if (baseRequest2 == null || baseRequest2 == BaseRequest.getDefaultInstance()) {
                this.baseRequest_ = baseRequest;
            } else {
                this.baseRequest_ = (BaseRequest) ((BaseRequest.Builder) BaseRequest.newBuilder(this.baseRequest_).mergeFrom(baseRequest)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeBizMsgContext(BizMsgReSortContext bizMsgReSortContext) {
            bizMsgReSortContext.getClass();
            BizMsgReSortContext bizMsgReSortContext2 = this.bizMsgContext_;
            if (bizMsgReSortContext2 == null || bizMsgReSortContext2 == BizMsgReSortContext.getDefaultInstance()) {
                this.bizMsgContext_ = bizMsgReSortContext;
            } else {
                this.bizMsgContext_ = (BizMsgReSortContext) ((BizMsgReSortContext.Builder) BizMsgReSortContext.newBuilder(this.bizMsgContext_).mergeFrom(bizMsgReSortContext)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeContext(RecommendFeedsContext recommendFeedsContext) {
            recommendFeedsContext.getClass();
            RecommendFeedsContext recommendFeedsContext2 = this.context_;
            if (recommendFeedsContext2 == null || recommendFeedsContext2 == RecommendFeedsContext.getDefaultInstance()) {
                this.context_ = recommendFeedsContext;
            } else {
                this.context_ = (RecommendFeedsContext) ((RecommendFeedsContext.Builder) RecommendFeedsContext.newBuilder(this.context_).mergeFrom(recommendFeedsContext)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GetRecommendFeedsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetRecommendFeedsRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetRecommendFeedsRequest parseFrom(ByteBuffer byteBuffer) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<GetRecommendFeedsRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setBizMsgContext(BizMsgReSortContext bizMsgReSortContext) {
            bizMsgReSortContext.getClass();
            this.bizMsgContext_ = bizMsgReSortContext;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.buffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setContext(RecommendFeedsContext recommendFeedsContext) {
            recommendFeedsContext.getClass();
            this.context_ = recommendFeedsContext;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 2;
            this.scene_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "baseRequest_", "scene_", "buffer_", "context_", "bizMsgContext_"});
                case 3:
                    return new GetRecommendFeedsRequest();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<GetRecommendFeedsRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (GetRecommendFeedsRequest.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public BaseRequest getBaseRequest() {
            BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? BaseRequest.getDefaultInstance() : baseRequest;
        }

        public BizMsgReSortContext getBizMsgContext() {
            BizMsgReSortContext bizMsgReSortContext = this.bizMsgContext_;
            return bizMsgReSortContext == null ? BizMsgReSortContext.getDefaultInstance() : bizMsgReSortContext;
        }

        public C16994k getBuffer() {
            return this.buffer_;
        }

        public RecommendFeedsContext getContext() {
            RecommendFeedsContext recommendFeedsContext = this.context_;
            return recommendFeedsContext == null ? RecommendFeedsContext.getDefaultInstance() : recommendFeedsContext;
        }

        public int getScene() {
            return this.scene_;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBizMsgContext() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasContext() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(GetRecommendFeedsRequest getRecommendFeedsRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(getRecommendFeedsRequest);
        }

        public static GetRecommendFeedsRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (GetRecommendFeedsRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static GetRecommendFeedsRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static GetRecommendFeedsRequest parseFrom(C16994k kVar) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static GetRecommendFeedsRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static GetRecommendFeedsRequest parseFrom(byte[] bArr) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetRecommendFeedsRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static GetRecommendFeedsRequest parseFrom(InputStream inputStream) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetRecommendFeedsRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static GetRecommendFeedsRequest parseFrom(C23856l lVar) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static GetRecommendFeedsRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (GetRecommendFeedsRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsRequestOrBuilder */
    public interface GetRecommendFeedsRequestOrBuilder extends C23848k1 {
        BaseRequest getBaseRequest();

        BizMsgReSortContext getBizMsgContext();

        C16994k getBuffer();

        RecommendFeedsContext getContext();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getScene();

        boolean hasBaseRequest();

        boolean hasBizMsgContext();

        boolean hasBuffer();

        boolean hasContext();

        boolean hasScene();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse */
    public static final class GetRecommendFeedsResponse extends C23861l0<GetRecommendFeedsResponse, Builder> implements GetRecommendFeedsResponseOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        public static final int BUFFER_FIELD_NUMBER = 5;
        public static final int CONFIG_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final GetRecommendFeedsResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<GetRecommendFeedsResponse> PARSER = null;
        public static final int RECOMMENDCARD_FIELD_NUMBER = 2;
        public static final int RECOMMENDFEEDSWORDING_FIELD_NUMBER = 4;
        private BaseResponse baseResponse_;
        private int bitField0_;
        private C16994k buffer_ = C16994k.f46000e;
        private RecommendFeedsConfig config_;
        private byte memoizedIsInitialized = 2;
        private C23908o0.C23919j<RecommendCardMsg> recommendCard_ = C23861l0.emptyProtobufList();
        private String recommendFeedsWording_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$Builder */
        public static final class Builder extends C23861l0.C23862a<GetRecommendFeedsResponse, Builder> implements GetRecommendFeedsResponseOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder addAllRecommendCard(Iterable<? extends RecommendCardMsg> iterable) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).addAllRecommendCard(iterable);
                return this;
            }

            public Builder addRecommendCard(RecommendCardMsg recommendCardMsg) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).addRecommendCard(recommendCardMsg);
                return this;
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).clearBuffer();
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).clearConfig();
                return this;
            }

            public Builder clearRecommendCard() {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).clearRecommendCard();
                return this;
            }

            public Builder clearRecommendFeedsWording() {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).clearRecommendFeedsWording();
                return this;
            }

            public BaseResponse getBaseResponse() {
                return ((GetRecommendFeedsResponse) this.instance).getBaseResponse();
            }

            public C16994k getBuffer() {
                return ((GetRecommendFeedsResponse) this.instance).getBuffer();
            }

            public RecommendFeedsConfig getConfig() {
                return ((GetRecommendFeedsResponse) this.instance).getConfig();
            }

            public RecommendCardMsg getRecommendCard(int i) {
                return ((GetRecommendFeedsResponse) this.instance).getRecommendCard(i);
            }

            public int getRecommendCardCount() {
                return ((GetRecommendFeedsResponse) this.instance).getRecommendCardCount();
            }

            public List<RecommendCardMsg> getRecommendCardList() {
                return Collections.unmodifiableList(((GetRecommendFeedsResponse) this.instance).getRecommendCardList());
            }

            public String getRecommendFeedsWording() {
                return ((GetRecommendFeedsResponse) this.instance).getRecommendFeedsWording();
            }

            public C16994k getRecommendFeedsWordingBytes() {
                return ((GetRecommendFeedsResponse) this.instance).getRecommendFeedsWordingBytes();
            }

            public boolean hasBaseResponse() {
                return ((GetRecommendFeedsResponse) this.instance).hasBaseResponse();
            }

            public boolean hasBuffer() {
                return ((GetRecommendFeedsResponse) this.instance).hasBuffer();
            }

            public boolean hasConfig() {
                return ((GetRecommendFeedsResponse) this.instance).hasConfig();
            }

            public boolean hasRecommendFeedsWording() {
                return ((GetRecommendFeedsResponse) this.instance).hasRecommendFeedsWording();
            }

            public Builder mergeBaseResponse(BaseResponse baseResponse) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder mergeConfig(RecommendFeedsConfig recommendFeedsConfig) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).mergeConfig(recommendFeedsConfig);
                return this;
            }

            public Builder removeRecommendCard(int i) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).removeRecommendCard(i);
                return this;
            }

            public Builder setBaseResponse(BaseResponse baseResponse) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setBuffer(C16994k kVar) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setBuffer(kVar);
                return this;
            }

            public Builder setConfig(RecommendFeedsConfig recommendFeedsConfig) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setConfig(recommendFeedsConfig);
                return this;
            }

            public Builder setRecommendCard(int i, RecommendCardMsg recommendCardMsg) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setRecommendCard(i, recommendCardMsg);
                return this;
            }

            public Builder setRecommendFeedsWording(String str) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setRecommendFeedsWording(str);
                return this;
            }

            public Builder setRecommendFeedsWordingBytes(C16994k kVar) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setRecommendFeedsWordingBytes(kVar);
                return this;
            }

            private Builder() {
                super(GetRecommendFeedsResponse.DEFAULT_INSTANCE);
            }

            public Builder addRecommendCard(int i, RecommendCardMsg recommendCardMsg) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).addRecommendCard(i, recommendCardMsg);
                return this;
            }

            public Builder setBaseResponse(BaseResponse.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setBaseResponse((BaseResponse) builder.build());
                return this;
            }

            public Builder setConfig(RecommendFeedsConfig.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setConfig((RecommendFeedsConfig) builder.build());
                return this;
            }

            public Builder setRecommendCard(int i, RecommendCardMsg.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).setRecommendCard(i, (RecommendCardMsg) builder.build());
                return this;
            }

            public Builder addRecommendCard(RecommendCardMsg.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).addRecommendCard((RecommendCardMsg) builder.build());
                return this;
            }

            public Builder addRecommendCard(int i, RecommendCardMsg.Builder builder) {
                copyOnWrite();
                ((GetRecommendFeedsResponse) this.instance).addRecommendCard(i, (RecommendCardMsg) builder.build());
                return this;
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg */
        public static final class RecommendCardMsg extends C23861l0<RecommendCardMsg, Builder> implements RecommendCardMsgOrBuilder {
            public static final int AGGREGATIONTITLE_FIELD_NUMBER = 7;
            public static final int AGGREGATIONURL_FIELD_NUMBER = 8;
            public static final int CANVASBUFFER_FIELD_NUMBER = 13;
            public static final int CARDID_FIELD_NUMBER = 5;
            /* access modifiers changed from: private */
            public static final RecommendCardMsg DEFAULT_INSTANCE;
            public static final int EXTRADATA_FIELD_NUMBER = 1;
            public static final int FRIENDSEENHEADIMGURL_FIELD_NUMBER = 12;
            public static final int ICONTYPE_FIELD_NUMBER = 11;
            public static final int NEGATIVEFEEDBACKREASON_FIELD_NUMBER = 6;
            public static final int PACKAGEVERSION_FIELD_NUMBER = 15;
            private static volatile C24062w1<RecommendCardMsg> PARSER = null;
            public static final int RECOMMENDITEM_FIELD_NUMBER = 2;
            public static final int RECOMMENDTAG_FIELD_NUMBER = 10;
            public static final int RECOMMENDWORDING_FIELD_NUMBER = 9;
            public static final int SEPARATESTYLE_FIELD_NUMBER = 14;
            public static final int STYLEFLAG_FIELD_NUMBER = 4;
            public static final int STYLE_FIELD_NUMBER = 3;
            private String aggregationTitle_ = "";
            private String aggregationUrl_ = "";
            private int bitField0_;
            private String canvasBuffer_ = "";
            private String cardId_ = "";
            private String extraData_ = "";
            private C23908o0.C23919j<String> friendSeenHeadImgUrl_ = C23861l0.emptyProtobufList();
            private int iconType_;
            private C23908o0.C23919j<String> negativeFeedbackReason_ = C23861l0.emptyProtobufList();
            private int packageVersion_;
            private C23908o0.C23919j<RecommendItemMsg> recommendItem_ = C23861l0.emptyProtobufList();
            private RecommendTagMsg recommendTag_;
            private String recommendWording_ = "";
            private int separateStyle_;
            private int styleFlag_;
            private int style_;

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$Builder */
            public static final class Builder extends C23861l0.C23862a<RecommendCardMsg, Builder> implements RecommendCardMsgOrBuilder {
                public /* synthetic */ Builder(C243681 r1) {
                    this();
                }

                public Builder addAllFriendSeenHeadImgUrl(Iterable<String> iterable) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addAllFriendSeenHeadImgUrl(iterable);
                    return this;
                }

                public Builder addAllNegativeFeedbackReason(Iterable<String> iterable) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addAllNegativeFeedbackReason(iterable);
                    return this;
                }

                public Builder addAllRecommendItem(Iterable<? extends RecommendItemMsg> iterable) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addAllRecommendItem(iterable);
                    return this;
                }

                public Builder addFriendSeenHeadImgUrl(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addFriendSeenHeadImgUrl(str);
                    return this;
                }

                public Builder addFriendSeenHeadImgUrlBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addFriendSeenHeadImgUrlBytes(kVar);
                    return this;
                }

                public Builder addNegativeFeedbackReason(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addNegativeFeedbackReason(str);
                    return this;
                }

                public Builder addNegativeFeedbackReasonBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addNegativeFeedbackReasonBytes(kVar);
                    return this;
                }

                public Builder addRecommendItem(RecommendItemMsg recommendItemMsg) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addRecommendItem(recommendItemMsg);
                    return this;
                }

                public Builder clearAggregationTitle() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearAggregationTitle();
                    return this;
                }

                public Builder clearAggregationUrl() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearAggregationUrl();
                    return this;
                }

                public Builder clearCanvasBuffer() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearCanvasBuffer();
                    return this;
                }

                public Builder clearCardId() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearCardId();
                    return this;
                }

                public Builder clearExtraData() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearExtraData();
                    return this;
                }

                public Builder clearFriendSeenHeadImgUrl() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearFriendSeenHeadImgUrl();
                    return this;
                }

                public Builder clearIconType() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearIconType();
                    return this;
                }

                public Builder clearNegativeFeedbackReason() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearNegativeFeedbackReason();
                    return this;
                }

                public Builder clearPackageVersion() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearPackageVersion();
                    return this;
                }

                public Builder clearRecommendItem() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearRecommendItem();
                    return this;
                }

                public Builder clearRecommendTag() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearRecommendTag();
                    return this;
                }

                public Builder clearRecommendWording() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearRecommendWording();
                    return this;
                }

                public Builder clearSeparateStyle() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearSeparateStyle();
                    return this;
                }

                public Builder clearStyle() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearStyle();
                    return this;
                }

                public Builder clearStyleFlag() {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).clearStyleFlag();
                    return this;
                }

                public String getAggregationTitle() {
                    return ((RecommendCardMsg) this.instance).getAggregationTitle();
                }

                public C16994k getAggregationTitleBytes() {
                    return ((RecommendCardMsg) this.instance).getAggregationTitleBytes();
                }

                public String getAggregationUrl() {
                    return ((RecommendCardMsg) this.instance).getAggregationUrl();
                }

                public C16994k getAggregationUrlBytes() {
                    return ((RecommendCardMsg) this.instance).getAggregationUrlBytes();
                }

                public String getCanvasBuffer() {
                    return ((RecommendCardMsg) this.instance).getCanvasBuffer();
                }

                public C16994k getCanvasBufferBytes() {
                    return ((RecommendCardMsg) this.instance).getCanvasBufferBytes();
                }

                public String getCardId() {
                    return ((RecommendCardMsg) this.instance).getCardId();
                }

                public C16994k getCardIdBytes() {
                    return ((RecommendCardMsg) this.instance).getCardIdBytes();
                }

                public String getExtraData() {
                    return ((RecommendCardMsg) this.instance).getExtraData();
                }

                public C16994k getExtraDataBytes() {
                    return ((RecommendCardMsg) this.instance).getExtraDataBytes();
                }

                public String getFriendSeenHeadImgUrl(int i) {
                    return ((RecommendCardMsg) this.instance).getFriendSeenHeadImgUrl(i);
                }

                public C16994k getFriendSeenHeadImgUrlBytes(int i) {
                    return ((RecommendCardMsg) this.instance).getFriendSeenHeadImgUrlBytes(i);
                }

                public int getFriendSeenHeadImgUrlCount() {
                    return ((RecommendCardMsg) this.instance).getFriendSeenHeadImgUrlCount();
                }

                public List<String> getFriendSeenHeadImgUrlList() {
                    return Collections.unmodifiableList(((RecommendCardMsg) this.instance).getFriendSeenHeadImgUrlList());
                }

                public int getIconType() {
                    return ((RecommendCardMsg) this.instance).getIconType();
                }

                public String getNegativeFeedbackReason(int i) {
                    return ((RecommendCardMsg) this.instance).getNegativeFeedbackReason(i);
                }

                public C16994k getNegativeFeedbackReasonBytes(int i) {
                    return ((RecommendCardMsg) this.instance).getNegativeFeedbackReasonBytes(i);
                }

                public int getNegativeFeedbackReasonCount() {
                    return ((RecommendCardMsg) this.instance).getNegativeFeedbackReasonCount();
                }

                public List<String> getNegativeFeedbackReasonList() {
                    return Collections.unmodifiableList(((RecommendCardMsg) this.instance).getNegativeFeedbackReasonList());
                }

                public int getPackageVersion() {
                    return ((RecommendCardMsg) this.instance).getPackageVersion();
                }

                public RecommendItemMsg getRecommendItem(int i) {
                    return ((RecommendCardMsg) this.instance).getRecommendItem(i);
                }

                public int getRecommendItemCount() {
                    return ((RecommendCardMsg) this.instance).getRecommendItemCount();
                }

                public List<RecommendItemMsg> getRecommendItemList() {
                    return Collections.unmodifiableList(((RecommendCardMsg) this.instance).getRecommendItemList());
                }

                public RecommendTagMsg getRecommendTag() {
                    return ((RecommendCardMsg) this.instance).getRecommendTag();
                }

                public String getRecommendWording() {
                    return ((RecommendCardMsg) this.instance).getRecommendWording();
                }

                public C16994k getRecommendWordingBytes() {
                    return ((RecommendCardMsg) this.instance).getRecommendWordingBytes();
                }

                public int getSeparateStyle() {
                    return ((RecommendCardMsg) this.instance).getSeparateStyle();
                }

                public int getStyle() {
                    return ((RecommendCardMsg) this.instance).getStyle();
                }

                public int getStyleFlag() {
                    return ((RecommendCardMsg) this.instance).getStyleFlag();
                }

                public boolean hasAggregationTitle() {
                    return ((RecommendCardMsg) this.instance).hasAggregationTitle();
                }

                public boolean hasAggregationUrl() {
                    return ((RecommendCardMsg) this.instance).hasAggregationUrl();
                }

                public boolean hasCanvasBuffer() {
                    return ((RecommendCardMsg) this.instance).hasCanvasBuffer();
                }

                public boolean hasCardId() {
                    return ((RecommendCardMsg) this.instance).hasCardId();
                }

                public boolean hasExtraData() {
                    return ((RecommendCardMsg) this.instance).hasExtraData();
                }

                public boolean hasIconType() {
                    return ((RecommendCardMsg) this.instance).hasIconType();
                }

                public boolean hasPackageVersion() {
                    return ((RecommendCardMsg) this.instance).hasPackageVersion();
                }

                public boolean hasRecommendTag() {
                    return ((RecommendCardMsg) this.instance).hasRecommendTag();
                }

                public boolean hasRecommendWording() {
                    return ((RecommendCardMsg) this.instance).hasRecommendWording();
                }

                public boolean hasSeparateStyle() {
                    return ((RecommendCardMsg) this.instance).hasSeparateStyle();
                }

                public boolean hasStyle() {
                    return ((RecommendCardMsg) this.instance).hasStyle();
                }

                public boolean hasStyleFlag() {
                    return ((RecommendCardMsg) this.instance).hasStyleFlag();
                }

                public Builder mergeRecommendTag(RecommendTagMsg recommendTagMsg) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).mergeRecommendTag(recommendTagMsg);
                    return this;
                }

                public Builder removeRecommendItem(int i) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).removeRecommendItem(i);
                    return this;
                }

                public Builder setAggregationTitle(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setAggregationTitle(str);
                    return this;
                }

                public Builder setAggregationTitleBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setAggregationTitleBytes(kVar);
                    return this;
                }

                public Builder setAggregationUrl(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setAggregationUrl(str);
                    return this;
                }

                public Builder setAggregationUrlBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setAggregationUrlBytes(kVar);
                    return this;
                }

                public Builder setCanvasBuffer(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setCanvasBuffer(str);
                    return this;
                }

                public Builder setCanvasBufferBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setCanvasBufferBytes(kVar);
                    return this;
                }

                public Builder setCardId(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setCardId(str);
                    return this;
                }

                public Builder setCardIdBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setCardIdBytes(kVar);
                    return this;
                }

                public Builder setExtraData(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setExtraData(str);
                    return this;
                }

                public Builder setExtraDataBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setExtraDataBytes(kVar);
                    return this;
                }

                public Builder setFriendSeenHeadImgUrl(int i, String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setFriendSeenHeadImgUrl(i, str);
                    return this;
                }

                public Builder setIconType(int i) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setIconType(i);
                    return this;
                }

                public Builder setNegativeFeedbackReason(int i, String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setNegativeFeedbackReason(i, str);
                    return this;
                }

                public Builder setPackageVersion(int i) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setPackageVersion(i);
                    return this;
                }

                public Builder setRecommendItem(int i, RecommendItemMsg recommendItemMsg) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setRecommendItem(i, recommendItemMsg);
                    return this;
                }

                public Builder setRecommendTag(RecommendTagMsg recommendTagMsg) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setRecommendTag(recommendTagMsg);
                    return this;
                }

                public Builder setRecommendWording(String str) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setRecommendWording(str);
                    return this;
                }

                public Builder setRecommendWordingBytes(C16994k kVar) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setRecommendWordingBytes(kVar);
                    return this;
                }

                public Builder setSeparateStyle(int i) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setSeparateStyle(i);
                    return this;
                }

                public Builder setStyle(int i) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setStyle(i);
                    return this;
                }

                public Builder setStyleFlag(int i) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setStyleFlag(i);
                    return this;
                }

                private Builder() {
                    super(RecommendCardMsg.DEFAULT_INSTANCE);
                }

                public Builder addRecommendItem(int i, RecommendItemMsg recommendItemMsg) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addRecommendItem(i, recommendItemMsg);
                    return this;
                }

                public Builder setRecommendItem(int i, RecommendItemMsg.Builder builder) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setRecommendItem(i, (RecommendItemMsg) builder.build());
                    return this;
                }

                public Builder setRecommendTag(RecommendTagMsg.Builder builder) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).setRecommendTag((RecommendTagMsg) builder.build());
                    return this;
                }

                public Builder addRecommendItem(RecommendItemMsg.Builder builder) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addRecommendItem((RecommendItemMsg) builder.build());
                    return this;
                }

                public Builder addRecommendItem(int i, RecommendItemMsg.Builder builder) {
                    copyOnWrite();
                    ((RecommendCardMsg) this.instance).addRecommendItem(i, (RecommendItemMsg) builder.build());
                    return this;
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg */
            public static final class RecommendItemMsg extends C23861l0<RecommendItemMsg, Builder> implements RecommendItemMsgOrBuilder {
                public static final int AGGREGATIONTITLE_FIELD_NUMBER = 4;
                public static final int AGGREGATIONURL_FIELD_NUMBER = 5;
                public static final int BIZINFO_FIELD_NUMBER = 1;
                public static final int CANVASBUFFER_FIELD_NUMBER = 10;
                /* access modifiers changed from: private */
                public static final RecommendItemMsg DEFAULT_INSTANCE;
                public static final int FINDERINFO_FIELD_NUMBER = 14;
                public static final int ICONTYPE_FIELD_NUMBER = 9;
                public static final int ITEMINFO_FIELD_NUMBER = 2;
                private static volatile C24062w1<RecommendItemMsg> PARSER = null;
                public static final int RECINFO_FIELD_NUMBER = 3;
                public static final int RECOMMENDTAG_FIELD_NUMBER = 8;
                public static final int RECOMMENDWORDING_FIELD_NUMBER = 6;
                public static final int STYLEFLAG_FIELD_NUMBER = 7;
                private String aggregationTitle_ = "";
                private String aggregationUrl_ = "";
                private int bitField0_;
                private BizAcctInfo bizInfo_;
                private String canvasBuffer_ = "";
                private FinderMsg finderInfo_;
                private int iconType_;
                private ItemMsg itemInfo_;
                private String recInfo_ = "";
                private RecommendTagMsg recommendTag_;
                private String recommendWording_ = "";
                private int styleFlag_;

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$BizAcctInfo */
                public static final class BizAcctInfo extends C23861l0<BizAcctInfo, Builder> implements BizAcctInfoOrBuilder {
                    public static final int BRANDICONURL_FIELD_NUMBER = 3;
                    /* access modifiers changed from: private */
                    public static final BizAcctInfo DEFAULT_INSTANCE;
                    public static final int NICKNAME_FIELD_NUMBER = 2;
                    private static volatile C24062w1<BizAcctInfo> PARSER = null;
                    public static final int SIGNATURE_FIELD_NUMBER = 4;
                    public static final int USERNAME_FIELD_NUMBER = 1;
                    private int bitField0_;
                    private String brandIconUrl_ = "";
                    private String nickName_ = "";
                    private String signature_ = "";
                    private String userName_ = "";

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$BizAcctInfo$Builder */
                    public static final class Builder extends C23861l0.C23862a<BizAcctInfo, Builder> implements BizAcctInfoOrBuilder {
                        public /* synthetic */ Builder(C243681 r1) {
                            this();
                        }

                        public Builder clearBrandIconUrl() {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).clearBrandIconUrl();
                            return this;
                        }

                        public Builder clearNickName() {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).clearNickName();
                            return this;
                        }

                        public Builder clearSignature() {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).clearSignature();
                            return this;
                        }

                        public Builder clearUserName() {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).clearUserName();
                            return this;
                        }

                        public String getBrandIconUrl() {
                            return ((BizAcctInfo) this.instance).getBrandIconUrl();
                        }

                        public C16994k getBrandIconUrlBytes() {
                            return ((BizAcctInfo) this.instance).getBrandIconUrlBytes();
                        }

                        public String getNickName() {
                            return ((BizAcctInfo) this.instance).getNickName();
                        }

                        public C16994k getNickNameBytes() {
                            return ((BizAcctInfo) this.instance).getNickNameBytes();
                        }

                        public String getSignature() {
                            return ((BizAcctInfo) this.instance).getSignature();
                        }

                        public C16994k getSignatureBytes() {
                            return ((BizAcctInfo) this.instance).getSignatureBytes();
                        }

                        public String getUserName() {
                            return ((BizAcctInfo) this.instance).getUserName();
                        }

                        public C16994k getUserNameBytes() {
                            return ((BizAcctInfo) this.instance).getUserNameBytes();
                        }

                        public boolean hasBrandIconUrl() {
                            return ((BizAcctInfo) this.instance).hasBrandIconUrl();
                        }

                        public boolean hasNickName() {
                            return ((BizAcctInfo) this.instance).hasNickName();
                        }

                        public boolean hasSignature() {
                            return ((BizAcctInfo) this.instance).hasSignature();
                        }

                        public boolean hasUserName() {
                            return ((BizAcctInfo) this.instance).hasUserName();
                        }

                        public Builder setBrandIconUrl(String str) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setBrandIconUrl(str);
                            return this;
                        }

                        public Builder setBrandIconUrlBytes(C16994k kVar) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setBrandIconUrlBytes(kVar);
                            return this;
                        }

                        public Builder setNickName(String str) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setNickName(str);
                            return this;
                        }

                        public Builder setNickNameBytes(C16994k kVar) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setNickNameBytes(kVar);
                            return this;
                        }

                        public Builder setSignature(String str) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setSignature(str);
                            return this;
                        }

                        public Builder setSignatureBytes(C16994k kVar) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setSignatureBytes(kVar);
                            return this;
                        }

                        public Builder setUserName(String str) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setUserName(str);
                            return this;
                        }

                        public Builder setUserNameBytes(C16994k kVar) {
                            copyOnWrite();
                            ((BizAcctInfo) this.instance).setUserNameBytes(kVar);
                            return this;
                        }

                        private Builder() {
                            super(BizAcctInfo.DEFAULT_INSTANCE);
                        }
                    }

                    static {
                        BizAcctInfo bizAcctInfo = new BizAcctInfo();
                        DEFAULT_INSTANCE = bizAcctInfo;
                        C23861l0.registerDefaultInstance(BizAcctInfo.class, bizAcctInfo);
                    }

                    private BizAcctInfo() {
                    }

                    /* access modifiers changed from: private */
                    public void clearBrandIconUrl() {
                        this.bitField0_ &= -5;
                        this.brandIconUrl_ = getDefaultInstance().getBrandIconUrl();
                    }

                    /* access modifiers changed from: private */
                    public void clearNickName() {
                        this.bitField0_ &= -3;
                        this.nickName_ = getDefaultInstance().getNickName();
                    }

                    /* access modifiers changed from: private */
                    public void clearSignature() {
                        this.bitField0_ &= -9;
                        this.signature_ = getDefaultInstance().getSignature();
                    }

                    /* access modifiers changed from: private */
                    public void clearUserName() {
                        this.bitField0_ &= -2;
                        this.userName_ = getDefaultInstance().getUserName();
                    }

                    public static BizAcctInfo getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Builder newBuilder() {
                        return (Builder) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static BizAcctInfo parseDelimitedFrom(InputStream inputStream) {
                        return (BizAcctInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static BizAcctInfo parseFrom(ByteBuffer byteBuffer) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static C24062w1<BizAcctInfo> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    /* access modifiers changed from: private */
                    public void setBrandIconUrl(String str) {
                        str.getClass();
                        this.bitField0_ |= 4;
                        this.brandIconUrl_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setBrandIconUrlBytes(C16994k kVar) {
                        this.brandIconUrl_ = kVar.mo18752u();
                        this.bitField0_ |= 4;
                    }

                    /* access modifiers changed from: private */
                    public void setNickName(String str) {
                        str.getClass();
                        this.bitField0_ |= 2;
                        this.nickName_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setNickNameBytes(C16994k kVar) {
                        this.nickName_ = kVar.mo18752u();
                        this.bitField0_ |= 2;
                    }

                    /* access modifiers changed from: private */
                    public void setSignature(String str) {
                        str.getClass();
                        this.bitField0_ |= 8;
                        this.signature_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setSignatureBytes(C16994k kVar) {
                        this.signature_ = kVar.mo18752u();
                        this.bitField0_ |= 8;
                    }

                    /* access modifiers changed from: private */
                    public void setUserName(String str) {
                        str.getClass();
                        this.bitField0_ |= 1;
                        this.userName_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setUserNameBytes(C16994k kVar) {
                        this.userName_ = kVar.mo18752u();
                        this.bitField0_ |= 1;
                    }

                    public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                        switch (fVar.ordinal()) {
                            case 0:
                                return (byte) 1;
                            case 1:
                                return null;
                            case 2:
                                return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "userName_", "nickName_", "brandIconUrl_", "signature_"});
                            case 3:
                                return new BizAcctInfo();
                            case 4:
                                return new Builder((C243681) null);
                            case 5:
                                return DEFAULT_INSTANCE;
                            case 6:
                                C24062w1<BizAcctInfo> w1Var = PARSER;
                                if (w1Var == null) {
                                    synchronized (BizAcctInfo.class) {
                                        w1Var = PARSER;
                                        if (w1Var == null) {
                                            w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                            PARSER = w1Var;
                                        }
                                    }
                                }
                                return w1Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    public String getBrandIconUrl() {
                        return this.brandIconUrl_;
                    }

                    public C16994k getBrandIconUrlBytes() {
                        return C16994k.m16791k(this.brandIconUrl_);
                    }

                    public String getNickName() {
                        return this.nickName_;
                    }

                    public C16994k getNickNameBytes() {
                        return C16994k.m16791k(this.nickName_);
                    }

                    public String getSignature() {
                        return this.signature_;
                    }

                    public C16994k getSignatureBytes() {
                        return C16994k.m16791k(this.signature_);
                    }

                    public String getUserName() {
                        return this.userName_;
                    }

                    public C16994k getUserNameBytes() {
                        return C16994k.m16791k(this.userName_);
                    }

                    public boolean hasBrandIconUrl() {
                        return (this.bitField0_ & 4) != 0;
                    }

                    public boolean hasNickName() {
                        return (this.bitField0_ & 2) != 0;
                    }

                    public boolean hasSignature() {
                        return (this.bitField0_ & 8) != 0;
                    }

                    public boolean hasUserName() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    public static Builder newBuilder(BizAcctInfo bizAcctInfo) {
                        return (Builder) DEFAULT_INSTANCE.createBuilder(bizAcctInfo);
                    }

                    public static BizAcctInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                        return (BizAcctInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                    }

                    public static BizAcctInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                    }

                    public static BizAcctInfo parseFrom(C16994k kVar) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                    }

                    public static BizAcctInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                    }

                    public static BizAcctInfo parseFrom(byte[] bArr) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static BizAcctInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                    }

                    public static BizAcctInfo parseFrom(InputStream inputStream) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static BizAcctInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                    }

                    public static BizAcctInfo parseFrom(C23856l lVar) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                    }

                    public static BizAcctInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                        return (BizAcctInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                    }
                }

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$BizAcctInfoOrBuilder */
                public interface BizAcctInfoOrBuilder extends C23848k1 {
                    String getBrandIconUrl();

                    C16994k getBrandIconUrlBytes();

                    /* synthetic */ C23845j1 getDefaultInstanceForType();

                    String getNickName();

                    C16994k getNickNameBytes();

                    String getSignature();

                    C16994k getSignatureBytes();

                    String getUserName();

                    C16994k getUserNameBytes();

                    boolean hasBrandIconUrl();

                    boolean hasNickName();

                    boolean hasSignature();

                    boolean hasUserName();

                    /* synthetic */ boolean isInitialized();
                }

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$Builder */
                public static final class Builder extends C23861l0.C23862a<RecommendItemMsg, Builder> implements RecommendItemMsgOrBuilder {
                    public /* synthetic */ Builder(C243681 r1) {
                        this();
                    }

                    public Builder clearAggregationTitle() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearAggregationTitle();
                        return this;
                    }

                    public Builder clearAggregationUrl() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearAggregationUrl();
                        return this;
                    }

                    public Builder clearBizInfo() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearBizInfo();
                        return this;
                    }

                    public Builder clearCanvasBuffer() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearCanvasBuffer();
                        return this;
                    }

                    public Builder clearFinderInfo() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearFinderInfo();
                        return this;
                    }

                    public Builder clearIconType() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearIconType();
                        return this;
                    }

                    public Builder clearItemInfo() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearItemInfo();
                        return this;
                    }

                    public Builder clearRecInfo() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearRecInfo();
                        return this;
                    }

                    public Builder clearRecommendTag() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearRecommendTag();
                        return this;
                    }

                    public Builder clearRecommendWording() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearRecommendWording();
                        return this;
                    }

                    public Builder clearStyleFlag() {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).clearStyleFlag();
                        return this;
                    }

                    public String getAggregationTitle() {
                        return ((RecommendItemMsg) this.instance).getAggregationTitle();
                    }

                    public C16994k getAggregationTitleBytes() {
                        return ((RecommendItemMsg) this.instance).getAggregationTitleBytes();
                    }

                    public String getAggregationUrl() {
                        return ((RecommendItemMsg) this.instance).getAggregationUrl();
                    }

                    public C16994k getAggregationUrlBytes() {
                        return ((RecommendItemMsg) this.instance).getAggregationUrlBytes();
                    }

                    public BizAcctInfo getBizInfo() {
                        return ((RecommendItemMsg) this.instance).getBizInfo();
                    }

                    public String getCanvasBuffer() {
                        return ((RecommendItemMsg) this.instance).getCanvasBuffer();
                    }

                    public C16994k getCanvasBufferBytes() {
                        return ((RecommendItemMsg) this.instance).getCanvasBufferBytes();
                    }

                    public FinderMsg getFinderInfo() {
                        return ((RecommendItemMsg) this.instance).getFinderInfo();
                    }

                    public int getIconType() {
                        return ((RecommendItemMsg) this.instance).getIconType();
                    }

                    public ItemMsg getItemInfo() {
                        return ((RecommendItemMsg) this.instance).getItemInfo();
                    }

                    public String getRecInfo() {
                        return ((RecommendItemMsg) this.instance).getRecInfo();
                    }

                    public C16994k getRecInfoBytes() {
                        return ((RecommendItemMsg) this.instance).getRecInfoBytes();
                    }

                    public RecommendTagMsg getRecommendTag() {
                        return ((RecommendItemMsg) this.instance).getRecommendTag();
                    }

                    public String getRecommendWording() {
                        return ((RecommendItemMsg) this.instance).getRecommendWording();
                    }

                    public C16994k getRecommendWordingBytes() {
                        return ((RecommendItemMsg) this.instance).getRecommendWordingBytes();
                    }

                    public int getStyleFlag() {
                        return ((RecommendItemMsg) this.instance).getStyleFlag();
                    }

                    public boolean hasAggregationTitle() {
                        return ((RecommendItemMsg) this.instance).hasAggregationTitle();
                    }

                    public boolean hasAggregationUrl() {
                        return ((RecommendItemMsg) this.instance).hasAggregationUrl();
                    }

                    public boolean hasBizInfo() {
                        return ((RecommendItemMsg) this.instance).hasBizInfo();
                    }

                    public boolean hasCanvasBuffer() {
                        return ((RecommendItemMsg) this.instance).hasCanvasBuffer();
                    }

                    public boolean hasFinderInfo() {
                        return ((RecommendItemMsg) this.instance).hasFinderInfo();
                    }

                    public boolean hasIconType() {
                        return ((RecommendItemMsg) this.instance).hasIconType();
                    }

                    public boolean hasItemInfo() {
                        return ((RecommendItemMsg) this.instance).hasItemInfo();
                    }

                    public boolean hasRecInfo() {
                        return ((RecommendItemMsg) this.instance).hasRecInfo();
                    }

                    public boolean hasRecommendTag() {
                        return ((RecommendItemMsg) this.instance).hasRecommendTag();
                    }

                    public boolean hasRecommendWording() {
                        return ((RecommendItemMsg) this.instance).hasRecommendWording();
                    }

                    public boolean hasStyleFlag() {
                        return ((RecommendItemMsg) this.instance).hasStyleFlag();
                    }

                    public Builder mergeBizInfo(BizAcctInfo bizAcctInfo) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).mergeBizInfo(bizAcctInfo);
                        return this;
                    }

                    public Builder mergeFinderInfo(FinderMsg finderMsg) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).mergeFinderInfo(finderMsg);
                        return this;
                    }

                    public Builder mergeItemInfo(ItemMsg itemMsg) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).mergeItemInfo(itemMsg);
                        return this;
                    }

                    public Builder mergeRecommendTag(RecommendTagMsg recommendTagMsg) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).mergeRecommendTag(recommendTagMsg);
                        return this;
                    }

                    public Builder setAggregationTitle(String str) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setAggregationTitle(str);
                        return this;
                    }

                    public Builder setAggregationTitleBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setAggregationTitleBytes(kVar);
                        return this;
                    }

                    public Builder setAggregationUrl(String str) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setAggregationUrl(str);
                        return this;
                    }

                    public Builder setAggregationUrlBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setAggregationUrlBytes(kVar);
                        return this;
                    }

                    public Builder setBizInfo(BizAcctInfo bizAcctInfo) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setBizInfo(bizAcctInfo);
                        return this;
                    }

                    public Builder setCanvasBuffer(String str) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setCanvasBuffer(str);
                        return this;
                    }

                    public Builder setCanvasBufferBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setCanvasBufferBytes(kVar);
                        return this;
                    }

                    public Builder setFinderInfo(FinderMsg finderMsg) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setFinderInfo(finderMsg);
                        return this;
                    }

                    public Builder setIconType(int i) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setIconType(i);
                        return this;
                    }

                    public Builder setItemInfo(ItemMsg itemMsg) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setItemInfo(itemMsg);
                        return this;
                    }

                    public Builder setRecInfo(String str) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setRecInfo(str);
                        return this;
                    }

                    public Builder setRecInfoBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setRecInfoBytes(kVar);
                        return this;
                    }

                    public Builder setRecommendTag(RecommendTagMsg recommendTagMsg) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setRecommendTag(recommendTagMsg);
                        return this;
                    }

                    public Builder setRecommendWording(String str) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setRecommendWording(str);
                        return this;
                    }

                    public Builder setRecommendWordingBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setRecommendWordingBytes(kVar);
                        return this;
                    }

                    public Builder setStyleFlag(int i) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setStyleFlag(i);
                        return this;
                    }

                    private Builder() {
                        super(RecommendItemMsg.DEFAULT_INSTANCE);
                    }

                    public Builder setBizInfo(BizAcctInfo.Builder builder) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setBizInfo((BizAcctInfo) builder.build());
                        return this;
                    }

                    public Builder setFinderInfo(FinderMsg.Builder builder) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setFinderInfo((FinderMsg) builder.build());
                        return this;
                    }

                    public Builder setItemInfo(ItemMsg.Builder builder) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setItemInfo((ItemMsg) builder.build());
                        return this;
                    }

                    public Builder setRecommendTag(RecommendTagMsg.Builder builder) {
                        copyOnWrite();
                        ((RecommendItemMsg) this.instance).setRecommendTag((RecommendTagMsg) builder.build());
                        return this;
                    }
                }

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$FinderMsg */
                public static final class FinderMsg extends C23861l0<FinderMsg, Builder> implements FinderMsgOrBuilder {
                    /* access modifiers changed from: private */
                    public static final FinderMsg DEFAULT_INSTANCE;
                    public static final int FINDER_FEEDS_FIELD_NUMBER = 2;
                    private static volatile C24062w1<FinderMsg> PARSER = null;
                    public static final int SUB_TYPE_FIELD_NUMBER = 1;
                    private int bitField0_;
                    private C23908o0.C23919j<BizCgiCardProto.FinderRecommendData> finderFeeds_ = C23861l0.emptyProtobufList();
                    private int subType_;

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$FinderMsg$Builder */
                    public static final class Builder extends C23861l0.C23862a<FinderMsg, Builder> implements FinderMsgOrBuilder {
                        public /* synthetic */ Builder(C243681 r1) {
                            this();
                        }

                        public Builder addAllFinderFeeds(Iterable<? extends BizCgiCardProto.FinderRecommendData> iterable) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).addAllFinderFeeds(iterable);
                            return this;
                        }

                        public Builder addFinderFeeds(BizCgiCardProto.FinderRecommendData finderRecommendData) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).addFinderFeeds(finderRecommendData);
                            return this;
                        }

                        public Builder clearFinderFeeds() {
                            copyOnWrite();
                            ((FinderMsg) this.instance).clearFinderFeeds();
                            return this;
                        }

                        public Builder clearSubType() {
                            copyOnWrite();
                            ((FinderMsg) this.instance).clearSubType();
                            return this;
                        }

                        public BizCgiCardProto.FinderRecommendData getFinderFeeds(int i) {
                            return ((FinderMsg) this.instance).getFinderFeeds(i);
                        }

                        public int getFinderFeedsCount() {
                            return ((FinderMsg) this.instance).getFinderFeedsCount();
                        }

                        public List<BizCgiCardProto.FinderRecommendData> getFinderFeedsList() {
                            return Collections.unmodifiableList(((FinderMsg) this.instance).getFinderFeedsList());
                        }

                        public int getSubType() {
                            return ((FinderMsg) this.instance).getSubType();
                        }

                        public boolean hasSubType() {
                            return ((FinderMsg) this.instance).hasSubType();
                        }

                        public Builder removeFinderFeeds(int i) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).removeFinderFeeds(i);
                            return this;
                        }

                        public Builder setFinderFeeds(int i, BizCgiCardProto.FinderRecommendData finderRecommendData) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).setFinderFeeds(i, finderRecommendData);
                            return this;
                        }

                        public Builder setSubType(int i) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).setSubType(i);
                            return this;
                        }

                        private Builder() {
                            super(FinderMsg.DEFAULT_INSTANCE);
                        }

                        public Builder addFinderFeeds(int i, BizCgiCardProto.FinderRecommendData finderRecommendData) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).addFinderFeeds(i, finderRecommendData);
                            return this;
                        }

                        public Builder setFinderFeeds(int i, BizCgiCardProto.FinderRecommendData.Builder builder) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).setFinderFeeds(i, (BizCgiCardProto.FinderRecommendData) builder.build());
                            return this;
                        }

                        public Builder addFinderFeeds(BizCgiCardProto.FinderRecommendData.Builder builder) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).addFinderFeeds((BizCgiCardProto.FinderRecommendData) builder.build());
                            return this;
                        }

                        public Builder addFinderFeeds(int i, BizCgiCardProto.FinderRecommendData.Builder builder) {
                            copyOnWrite();
                            ((FinderMsg) this.instance).addFinderFeeds(i, (BizCgiCardProto.FinderRecommendData) builder.build());
                            return this;
                        }
                    }

                    static {
                        FinderMsg finderMsg = new FinderMsg();
                        DEFAULT_INSTANCE = finderMsg;
                        C23861l0.registerDefaultInstance(FinderMsg.class, finderMsg);
                    }

                    private FinderMsg() {
                    }

                    /* access modifiers changed from: private */
                    public void addAllFinderFeeds(Iterable<? extends BizCgiCardProto.FinderRecommendData> iterable) {
                        ensureFinderFeedsIsMutable();
                        C23810b.addAll(iterable, this.finderFeeds_);
                    }

                    /* access modifiers changed from: private */
                    public void addFinderFeeds(BizCgiCardProto.FinderRecommendData finderRecommendData) {
                        finderRecommendData.getClass();
                        ensureFinderFeedsIsMutable();
                        this.finderFeeds_.add(finderRecommendData);
                    }

                    /* access modifiers changed from: private */
                    public void clearFinderFeeds() {
                        this.finderFeeds_ = C23861l0.emptyProtobufList();
                    }

                    /* access modifiers changed from: private */
                    public void clearSubType() {
                        this.bitField0_ &= -2;
                        this.subType_ = 0;
                    }

                    private void ensureFinderFeedsIsMutable() {
                        C23908o0.C23919j<BizCgiCardProto.FinderRecommendData> jVar = this.finderFeeds_;
                        if (!jVar.mo37523Q()) {
                            this.finderFeeds_ = C23861l0.mutableCopy(jVar);
                        }
                    }

                    public static FinderMsg getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    public static Builder newBuilder() {
                        return (Builder) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static FinderMsg parseDelimitedFrom(InputStream inputStream) {
                        return (FinderMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static FinderMsg parseFrom(ByteBuffer byteBuffer) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static C24062w1<FinderMsg> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    /* access modifiers changed from: private */
                    public void removeFinderFeeds(int i) {
                        ensureFinderFeedsIsMutable();
                        this.finderFeeds_.remove(i);
                    }

                    /* access modifiers changed from: private */
                    public void setFinderFeeds(int i, BizCgiCardProto.FinderRecommendData finderRecommendData) {
                        finderRecommendData.getClass();
                        ensureFinderFeedsIsMutable();
                        this.finderFeeds_.set(i, finderRecommendData);
                    }

                    /* access modifiers changed from: private */
                    public void setSubType(int i) {
                        this.bitField0_ |= 1;
                        this.subType_ = i;
                    }

                    public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                        switch (fVar.ordinal()) {
                            case 0:
                                return (byte) 1;
                            case 1:
                                return null;
                            case 2:
                                return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001b", new Object[]{"bitField0_", "subType_", "finderFeeds_", BizCgiCardProto.FinderRecommendData.class});
                            case 3:
                                return new FinderMsg();
                            case 4:
                                return new Builder((C243681) null);
                            case 5:
                                return DEFAULT_INSTANCE;
                            case 6:
                                C24062w1<FinderMsg> w1Var = PARSER;
                                if (w1Var == null) {
                                    synchronized (FinderMsg.class) {
                                        w1Var = PARSER;
                                        if (w1Var == null) {
                                            w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                            PARSER = w1Var;
                                        }
                                    }
                                }
                                return w1Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    public BizCgiCardProto.FinderRecommendData getFinderFeeds(int i) {
                        return this.finderFeeds_.get(i);
                    }

                    public int getFinderFeedsCount() {
                        return this.finderFeeds_.size();
                    }

                    public List<BizCgiCardProto.FinderRecommendData> getFinderFeedsList() {
                        return this.finderFeeds_;
                    }

                    public BizCgiCardProto.FinderRecommendDataOrBuilder getFinderFeedsOrBuilder(int i) {
                        return this.finderFeeds_.get(i);
                    }

                    public List<? extends BizCgiCardProto.FinderRecommendDataOrBuilder> getFinderFeedsOrBuilderList() {
                        return this.finderFeeds_;
                    }

                    public int getSubType() {
                        return this.subType_;
                    }

                    public boolean hasSubType() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    public static Builder newBuilder(FinderMsg finderMsg) {
                        return (Builder) DEFAULT_INSTANCE.createBuilder(finderMsg);
                    }

                    public static FinderMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                        return (FinderMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                    }

                    public static FinderMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                    }

                    public static FinderMsg parseFrom(C16994k kVar) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                    }

                    /* access modifiers changed from: private */
                    public void addFinderFeeds(int i, BizCgiCardProto.FinderRecommendData finderRecommendData) {
                        finderRecommendData.getClass();
                        ensureFinderFeedsIsMutable();
                        this.finderFeeds_.add(i, finderRecommendData);
                    }

                    public static FinderMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                    }

                    public static FinderMsg parseFrom(byte[] bArr) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static FinderMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                    }

                    public static FinderMsg parseFrom(InputStream inputStream) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static FinderMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                    }

                    public static FinderMsg parseFrom(C23856l lVar) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                    }

                    public static FinderMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                        return (FinderMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                    }
                }

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$FinderMsgOrBuilder */
                public interface FinderMsgOrBuilder extends C23848k1 {
                    /* synthetic */ C23845j1 getDefaultInstanceForType();

                    BizCgiCardProto.FinderRecommendData getFinderFeeds(int i);

                    int getFinderFeedsCount();

                    List<BizCgiCardProto.FinderRecommendData> getFinderFeedsList();

                    int getSubType();

                    boolean hasSubType();

                    /* synthetic */ boolean isInitialized();
                }

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg */
                public static final class ItemMsg extends C23861l0<ItemMsg, Builder> implements ItemMsgOrBuilder {
                    public static final int CONTENTURL_FIELD_NUMBER = 3;
                    public static final int COVERIMGURL_1_1_FIELD_NUMBER = 5;
                    public static final int COVERIMGURL_235_1_FIELD_NUMBER = 6;
                    public static final int COVERIMGURL_FIELD_NUMBER = 4;
                    public static final int CREATETIME_FIELD_NUMBER = 8;
                    /* access modifiers changed from: private */
                    public static final ItemMsg DEFAULT_INSTANCE;
                    public static final int DIGEST_FIELD_NUMBER = 2;
                    public static final int ITEMSHOWTYPE_FIELD_NUMBER = 7;
                    private static volatile C24062w1<ItemMsg> PARSER = null;
                    public static final int PICTUREINFO_FIELD_NUMBER = 11;
                    public static final int TITLE_FIELD_NUMBER = 1;
                    public static final int VIDEOINFO_FIELD_NUMBER = 9;
                    public static final int VOICEINFO_FIELD_NUMBER = 10;
                    private int bitField0_;
                    private String contentUrl_ = "";
                    private String coverImgUrl11_ = "";
                    private String coverImgUrl2351_ = "";
                    private String coverImgUrl_ = "";
                    private int createTime_;
                    private String digest_ = "";
                    private int itemShowType_;
                    private PictureMsg pictureInfo_;
                    private String title_ = "";
                    private VideoMsg videoInfo_;
                    private VoiceMsg voiceInfo_;

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$Builder */
                    public static final class Builder extends C23861l0.C23862a<ItemMsg, Builder> implements ItemMsgOrBuilder {
                        public /* synthetic */ Builder(C243681 r1) {
                            this();
                        }

                        public Builder clearContentUrl() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearContentUrl();
                            return this;
                        }

                        public Builder clearCoverImgUrl() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearCoverImgUrl();
                            return this;
                        }

                        public Builder clearCoverImgUrl11() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearCoverImgUrl11();
                            return this;
                        }

                        public Builder clearCoverImgUrl2351() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearCoverImgUrl2351();
                            return this;
                        }

                        public Builder clearCreateTime() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearCreateTime();
                            return this;
                        }

                        public Builder clearDigest() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearDigest();
                            return this;
                        }

                        public Builder clearItemShowType() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearItemShowType();
                            return this;
                        }

                        public Builder clearPictureInfo() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearPictureInfo();
                            return this;
                        }

                        public Builder clearTitle() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearTitle();
                            return this;
                        }

                        public Builder clearVideoInfo() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearVideoInfo();
                            return this;
                        }

                        public Builder clearVoiceInfo() {
                            copyOnWrite();
                            ((ItemMsg) this.instance).clearVoiceInfo();
                            return this;
                        }

                        public String getContentUrl() {
                            return ((ItemMsg) this.instance).getContentUrl();
                        }

                        public C16994k getContentUrlBytes() {
                            return ((ItemMsg) this.instance).getContentUrlBytes();
                        }

                        public String getCoverImgUrl() {
                            return ((ItemMsg) this.instance).getCoverImgUrl();
                        }

                        public String getCoverImgUrl11() {
                            return ((ItemMsg) this.instance).getCoverImgUrl11();
                        }

                        public C16994k getCoverImgUrl11Bytes() {
                            return ((ItemMsg) this.instance).getCoverImgUrl11Bytes();
                        }

                        public String getCoverImgUrl2351() {
                            return ((ItemMsg) this.instance).getCoverImgUrl2351();
                        }

                        public C16994k getCoverImgUrl2351Bytes() {
                            return ((ItemMsg) this.instance).getCoverImgUrl2351Bytes();
                        }

                        public C16994k getCoverImgUrlBytes() {
                            return ((ItemMsg) this.instance).getCoverImgUrlBytes();
                        }

                        public int getCreateTime() {
                            return ((ItemMsg) this.instance).getCreateTime();
                        }

                        public String getDigest() {
                            return ((ItemMsg) this.instance).getDigest();
                        }

                        public C16994k getDigestBytes() {
                            return ((ItemMsg) this.instance).getDigestBytes();
                        }

                        public int getItemShowType() {
                            return ((ItemMsg) this.instance).getItemShowType();
                        }

                        public PictureMsg getPictureInfo() {
                            return ((ItemMsg) this.instance).getPictureInfo();
                        }

                        public String getTitle() {
                            return ((ItemMsg) this.instance).getTitle();
                        }

                        public C16994k getTitleBytes() {
                            return ((ItemMsg) this.instance).getTitleBytes();
                        }

                        public VideoMsg getVideoInfo() {
                            return ((ItemMsg) this.instance).getVideoInfo();
                        }

                        public VoiceMsg getVoiceInfo() {
                            return ((ItemMsg) this.instance).getVoiceInfo();
                        }

                        public boolean hasContentUrl() {
                            return ((ItemMsg) this.instance).hasContentUrl();
                        }

                        public boolean hasCoverImgUrl() {
                            return ((ItemMsg) this.instance).hasCoverImgUrl();
                        }

                        public boolean hasCoverImgUrl11() {
                            return ((ItemMsg) this.instance).hasCoverImgUrl11();
                        }

                        public boolean hasCoverImgUrl2351() {
                            return ((ItemMsg) this.instance).hasCoverImgUrl2351();
                        }

                        public boolean hasCreateTime() {
                            return ((ItemMsg) this.instance).hasCreateTime();
                        }

                        public boolean hasDigest() {
                            return ((ItemMsg) this.instance).hasDigest();
                        }

                        public boolean hasItemShowType() {
                            return ((ItemMsg) this.instance).hasItemShowType();
                        }

                        public boolean hasPictureInfo() {
                            return ((ItemMsg) this.instance).hasPictureInfo();
                        }

                        public boolean hasTitle() {
                            return ((ItemMsg) this.instance).hasTitle();
                        }

                        public boolean hasVideoInfo() {
                            return ((ItemMsg) this.instance).hasVideoInfo();
                        }

                        public boolean hasVoiceInfo() {
                            return ((ItemMsg) this.instance).hasVoiceInfo();
                        }

                        public Builder mergePictureInfo(PictureMsg pictureMsg) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).mergePictureInfo(pictureMsg);
                            return this;
                        }

                        public Builder mergeVideoInfo(VideoMsg videoMsg) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).mergeVideoInfo(videoMsg);
                            return this;
                        }

                        public Builder mergeVoiceInfo(VoiceMsg voiceMsg) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).mergeVoiceInfo(voiceMsg);
                            return this;
                        }

                        public Builder setContentUrl(String str) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setContentUrl(str);
                            return this;
                        }

                        public Builder setContentUrlBytes(C16994k kVar) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setContentUrlBytes(kVar);
                            return this;
                        }

                        public Builder setCoverImgUrl(String str) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCoverImgUrl(str);
                            return this;
                        }

                        public Builder setCoverImgUrl11(String str) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCoverImgUrl11(str);
                            return this;
                        }

                        public Builder setCoverImgUrl11Bytes(C16994k kVar) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCoverImgUrl11Bytes(kVar);
                            return this;
                        }

                        public Builder setCoverImgUrl2351(String str) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCoverImgUrl2351(str);
                            return this;
                        }

                        public Builder setCoverImgUrl2351Bytes(C16994k kVar) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCoverImgUrl2351Bytes(kVar);
                            return this;
                        }

                        public Builder setCoverImgUrlBytes(C16994k kVar) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCoverImgUrlBytes(kVar);
                            return this;
                        }

                        public Builder setCreateTime(int i) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setCreateTime(i);
                            return this;
                        }

                        public Builder setDigest(String str) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setDigest(str);
                            return this;
                        }

                        public Builder setDigestBytes(C16994k kVar) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setDigestBytes(kVar);
                            return this;
                        }

                        public Builder setItemShowType(int i) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setItemShowType(i);
                            return this;
                        }

                        public Builder setPictureInfo(PictureMsg pictureMsg) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setPictureInfo(pictureMsg);
                            return this;
                        }

                        public Builder setTitle(String str) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setTitle(str);
                            return this;
                        }

                        public Builder setTitleBytes(C16994k kVar) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setTitleBytes(kVar);
                            return this;
                        }

                        public Builder setVideoInfo(VideoMsg videoMsg) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setVideoInfo(videoMsg);
                            return this;
                        }

                        public Builder setVoiceInfo(VoiceMsg voiceMsg) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setVoiceInfo(voiceMsg);
                            return this;
                        }

                        private Builder() {
                            super(ItemMsg.DEFAULT_INSTANCE);
                        }

                        public Builder setPictureInfo(PictureMsg.Builder builder) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setPictureInfo((PictureMsg) builder.build());
                            return this;
                        }

                        public Builder setVideoInfo(VideoMsg.Builder builder) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setVideoInfo((VideoMsg) builder.build());
                            return this;
                        }

                        public Builder setVoiceInfo(VoiceMsg.Builder builder) {
                            copyOnWrite();
                            ((ItemMsg) this.instance).setVoiceInfo((VoiceMsg) builder.build());
                            return this;
                        }
                    }

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$PictureMsg */
                    public static final class PictureMsg extends C23861l0<PictureMsg, Builder> implements PictureMsgOrBuilder {
                        /* access modifiers changed from: private */
                        public static final PictureMsg DEFAULT_INSTANCE;
                        private static volatile C24062w1<PictureMsg> PARSER = null;
                        public static final int PICNUM_FIELD_NUMBER = 1;
                        public static final int PICTUREURL_FIELD_NUMBER = 2;
                        private int bitField0_;
                        private int picNum_;
                        private C23908o0.C23919j<String> pictureUrl_ = C23861l0.emptyProtobufList();

                        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$PictureMsg$Builder */
                        public static final class Builder extends C23861l0.C23862a<PictureMsg, Builder> implements PictureMsgOrBuilder {
                            public /* synthetic */ Builder(C243681 r1) {
                                this();
                            }

                            public Builder addAllPictureUrl(Iterable<String> iterable) {
                                copyOnWrite();
                                ((PictureMsg) this.instance).addAllPictureUrl(iterable);
                                return this;
                            }

                            public Builder addPictureUrl(String str) {
                                copyOnWrite();
                                ((PictureMsg) this.instance).addPictureUrl(str);
                                return this;
                            }

                            public Builder addPictureUrlBytes(C16994k kVar) {
                                copyOnWrite();
                                ((PictureMsg) this.instance).addPictureUrlBytes(kVar);
                                return this;
                            }

                            public Builder clearPicNum() {
                                copyOnWrite();
                                ((PictureMsg) this.instance).clearPicNum();
                                return this;
                            }

                            public Builder clearPictureUrl() {
                                copyOnWrite();
                                ((PictureMsg) this.instance).clearPictureUrl();
                                return this;
                            }

                            public int getPicNum() {
                                return ((PictureMsg) this.instance).getPicNum();
                            }

                            public String getPictureUrl(int i) {
                                return ((PictureMsg) this.instance).getPictureUrl(i);
                            }

                            public C16994k getPictureUrlBytes(int i) {
                                return ((PictureMsg) this.instance).getPictureUrlBytes(i);
                            }

                            public int getPictureUrlCount() {
                                return ((PictureMsg) this.instance).getPictureUrlCount();
                            }

                            public List<String> getPictureUrlList() {
                                return Collections.unmodifiableList(((PictureMsg) this.instance).getPictureUrlList());
                            }

                            public boolean hasPicNum() {
                                return ((PictureMsg) this.instance).hasPicNum();
                            }

                            public Builder setPicNum(int i) {
                                copyOnWrite();
                                ((PictureMsg) this.instance).setPicNum(i);
                                return this;
                            }

                            public Builder setPictureUrl(int i, String str) {
                                copyOnWrite();
                                ((PictureMsg) this.instance).setPictureUrl(i, str);
                                return this;
                            }

                            private Builder() {
                                super(PictureMsg.DEFAULT_INSTANCE);
                            }
                        }

                        static {
                            PictureMsg pictureMsg = new PictureMsg();
                            DEFAULT_INSTANCE = pictureMsg;
                            C23861l0.registerDefaultInstance(PictureMsg.class, pictureMsg);
                        }

                        private PictureMsg() {
                        }

                        /* access modifiers changed from: private */
                        public void addAllPictureUrl(Iterable<String> iterable) {
                            ensurePictureUrlIsMutable();
                            C23810b.addAll(iterable, this.pictureUrl_);
                        }

                        /* access modifiers changed from: private */
                        public void addPictureUrl(String str) {
                            str.getClass();
                            ensurePictureUrlIsMutable();
                            this.pictureUrl_.add(str);
                        }

                        /* access modifiers changed from: private */
                        public void addPictureUrlBytes(C16994k kVar) {
                            ensurePictureUrlIsMutable();
                            this.pictureUrl_.add(kVar.mo18752u());
                        }

                        /* access modifiers changed from: private */
                        public void clearPicNum() {
                            this.bitField0_ &= -2;
                            this.picNum_ = 0;
                        }

                        /* access modifiers changed from: private */
                        public void clearPictureUrl() {
                            this.pictureUrl_ = C23861l0.emptyProtobufList();
                        }

                        private void ensurePictureUrlIsMutable() {
                            C23908o0.C23919j<String> jVar = this.pictureUrl_;
                            if (!jVar.mo37523Q()) {
                                this.pictureUrl_ = C23861l0.mutableCopy(jVar);
                            }
                        }

                        public static PictureMsg getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        public static Builder newBuilder() {
                            return (Builder) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static PictureMsg parseDelimitedFrom(InputStream inputStream) {
                            return (PictureMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static PictureMsg parseFrom(ByteBuffer byteBuffer) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static C24062w1<PictureMsg> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        /* access modifiers changed from: private */
                        public void setPicNum(int i) {
                            this.bitField0_ |= 1;
                            this.picNum_ = i;
                        }

                        /* access modifiers changed from: private */
                        public void setPictureUrl(int i, String str) {
                            str.getClass();
                            ensurePictureUrlIsMutable();
                            this.pictureUrl_.set(i, str);
                        }

                        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                            switch (fVar.ordinal()) {
                                case 0:
                                    return (byte) 1;
                                case 1:
                                    return null;
                                case 2:
                                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဋ\u0000\u0002\u001a", new Object[]{"bitField0_", "picNum_", "pictureUrl_"});
                                case 3:
                                    return new PictureMsg();
                                case 4:
                                    return new Builder((C243681) null);
                                case 5:
                                    return DEFAULT_INSTANCE;
                                case 6:
                                    C24062w1<PictureMsg> w1Var = PARSER;
                                    if (w1Var == null) {
                                        synchronized (PictureMsg.class) {
                                            w1Var = PARSER;
                                            if (w1Var == null) {
                                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                                PARSER = w1Var;
                                            }
                                        }
                                    }
                                    return w1Var;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        public int getPicNum() {
                            return this.picNum_;
                        }

                        public String getPictureUrl(int i) {
                            return this.pictureUrl_.get(i);
                        }

                        public C16994k getPictureUrlBytes(int i) {
                            return C16994k.m16791k(this.pictureUrl_.get(i));
                        }

                        public int getPictureUrlCount() {
                            return this.pictureUrl_.size();
                        }

                        public List<String> getPictureUrlList() {
                            return this.pictureUrl_;
                        }

                        public boolean hasPicNum() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        public static Builder newBuilder(PictureMsg pictureMsg) {
                            return (Builder) DEFAULT_INSTANCE.createBuilder(pictureMsg);
                        }

                        public static PictureMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                            return (PictureMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                        }

                        public static PictureMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                        }

                        public static PictureMsg parseFrom(C16994k kVar) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                        }

                        public static PictureMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                        }

                        public static PictureMsg parseFrom(byte[] bArr) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static PictureMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                        }

                        public static PictureMsg parseFrom(InputStream inputStream) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static PictureMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                        }

                        public static PictureMsg parseFrom(C23856l lVar) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                        }

                        public static PictureMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                            return (PictureMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                        }
                    }

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$PictureMsgOrBuilder */
                    public interface PictureMsgOrBuilder extends C23848k1 {
                        /* synthetic */ C23845j1 getDefaultInstanceForType();

                        int getPicNum();

                        String getPictureUrl(int i);

                        C16994k getPictureUrlBytes(int i);

                        int getPictureUrlCount();

                        List<String> getPictureUrlList();

                        boolean hasPicNum();

                        /* synthetic */ boolean isInitialized();
                    }

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$VideoMsg */
                    public static final class VideoMsg extends C23861l0<VideoMsg, Builder> implements VideoMsgOrBuilder {
                        /* access modifiers changed from: private */
                        public static final VideoMsg DEFAULT_INSTANCE;
                        public static final int FINDER_FEED_XML_FIELD_NUMBER = 5;
                        private static volatile C24062w1<VideoMsg> PARSER = null;
                        public static final int VIDEODURATION_FIELD_NUMBER = 4;
                        public static final int VIDEOHEIGHT_FIELD_NUMBER = 3;
                        public static final int VIDEOID_FIELD_NUMBER = 1;
                        public static final int VIDEOWIDTH_FIELD_NUMBER = 2;
                        private int bitField0_;
                        private String finderFeedXml_ = "";
                        private int videoDuration_;
                        private int videoHeight_;
                        private String videoId_ = "";
                        private int videoWidth_;

                        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$VideoMsg$Builder */
                        public static final class Builder extends C23861l0.C23862a<VideoMsg, Builder> implements VideoMsgOrBuilder {
                            public /* synthetic */ Builder(C243681 r1) {
                                this();
                            }

                            public Builder clearFinderFeedXml() {
                                copyOnWrite();
                                ((VideoMsg) this.instance).clearFinderFeedXml();
                                return this;
                            }

                            public Builder clearVideoDuration() {
                                copyOnWrite();
                                ((VideoMsg) this.instance).clearVideoDuration();
                                return this;
                            }

                            public Builder clearVideoHeight() {
                                copyOnWrite();
                                ((VideoMsg) this.instance).clearVideoHeight();
                                return this;
                            }

                            public Builder clearVideoId() {
                                copyOnWrite();
                                ((VideoMsg) this.instance).clearVideoId();
                                return this;
                            }

                            public Builder clearVideoWidth() {
                                copyOnWrite();
                                ((VideoMsg) this.instance).clearVideoWidth();
                                return this;
                            }

                            public String getFinderFeedXml() {
                                return ((VideoMsg) this.instance).getFinderFeedXml();
                            }

                            public C16994k getFinderFeedXmlBytes() {
                                return ((VideoMsg) this.instance).getFinderFeedXmlBytes();
                            }

                            public int getVideoDuration() {
                                return ((VideoMsg) this.instance).getVideoDuration();
                            }

                            public int getVideoHeight() {
                                return ((VideoMsg) this.instance).getVideoHeight();
                            }

                            public String getVideoId() {
                                return ((VideoMsg) this.instance).getVideoId();
                            }

                            public C16994k getVideoIdBytes() {
                                return ((VideoMsg) this.instance).getVideoIdBytes();
                            }

                            public int getVideoWidth() {
                                return ((VideoMsg) this.instance).getVideoWidth();
                            }

                            public boolean hasFinderFeedXml() {
                                return ((VideoMsg) this.instance).hasFinderFeedXml();
                            }

                            public boolean hasVideoDuration() {
                                return ((VideoMsg) this.instance).hasVideoDuration();
                            }

                            public boolean hasVideoHeight() {
                                return ((VideoMsg) this.instance).hasVideoHeight();
                            }

                            public boolean hasVideoId() {
                                return ((VideoMsg) this.instance).hasVideoId();
                            }

                            public boolean hasVideoWidth() {
                                return ((VideoMsg) this.instance).hasVideoWidth();
                            }

                            public Builder setFinderFeedXml(String str) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setFinderFeedXml(str);
                                return this;
                            }

                            public Builder setFinderFeedXmlBytes(C16994k kVar) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setFinderFeedXmlBytes(kVar);
                                return this;
                            }

                            public Builder setVideoDuration(int i) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setVideoDuration(i);
                                return this;
                            }

                            public Builder setVideoHeight(int i) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setVideoHeight(i);
                                return this;
                            }

                            public Builder setVideoId(String str) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setVideoId(str);
                                return this;
                            }

                            public Builder setVideoIdBytes(C16994k kVar) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setVideoIdBytes(kVar);
                                return this;
                            }

                            public Builder setVideoWidth(int i) {
                                copyOnWrite();
                                ((VideoMsg) this.instance).setVideoWidth(i);
                                return this;
                            }

                            private Builder() {
                                super(VideoMsg.DEFAULT_INSTANCE);
                            }
                        }

                        static {
                            VideoMsg videoMsg = new VideoMsg();
                            DEFAULT_INSTANCE = videoMsg;
                            C23861l0.registerDefaultInstance(VideoMsg.class, videoMsg);
                        }

                        private VideoMsg() {
                        }

                        /* access modifiers changed from: private */
                        public void clearFinderFeedXml() {
                            this.bitField0_ &= -17;
                            this.finderFeedXml_ = getDefaultInstance().getFinderFeedXml();
                        }

                        /* access modifiers changed from: private */
                        public void clearVideoDuration() {
                            this.bitField0_ &= -9;
                            this.videoDuration_ = 0;
                        }

                        /* access modifiers changed from: private */
                        public void clearVideoHeight() {
                            this.bitField0_ &= -5;
                            this.videoHeight_ = 0;
                        }

                        /* access modifiers changed from: private */
                        public void clearVideoId() {
                            this.bitField0_ &= -2;
                            this.videoId_ = getDefaultInstance().getVideoId();
                        }

                        /* access modifiers changed from: private */
                        public void clearVideoWidth() {
                            this.bitField0_ &= -3;
                            this.videoWidth_ = 0;
                        }

                        public static VideoMsg getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        public static Builder newBuilder() {
                            return (Builder) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static VideoMsg parseDelimitedFrom(InputStream inputStream) {
                            return (VideoMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static VideoMsg parseFrom(ByteBuffer byteBuffer) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static C24062w1<VideoMsg> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        /* access modifiers changed from: private */
                        public void setFinderFeedXml(String str) {
                            str.getClass();
                            this.bitField0_ |= 16;
                            this.finderFeedXml_ = str;
                        }

                        /* access modifiers changed from: private */
                        public void setFinderFeedXmlBytes(C16994k kVar) {
                            this.finderFeedXml_ = kVar.mo18752u();
                            this.bitField0_ |= 16;
                        }

                        /* access modifiers changed from: private */
                        public void setVideoDuration(int i) {
                            this.bitField0_ |= 8;
                            this.videoDuration_ = i;
                        }

                        /* access modifiers changed from: private */
                        public void setVideoHeight(int i) {
                            this.bitField0_ |= 4;
                            this.videoHeight_ = i;
                        }

                        /* access modifiers changed from: private */
                        public void setVideoId(String str) {
                            str.getClass();
                            this.bitField0_ |= 1;
                            this.videoId_ = str;
                        }

                        /* access modifiers changed from: private */
                        public void setVideoIdBytes(C16994k kVar) {
                            this.videoId_ = kVar.mo18752u();
                            this.bitField0_ |= 1;
                        }

                        /* access modifiers changed from: private */
                        public void setVideoWidth(int i) {
                            this.bitField0_ |= 2;
                            this.videoWidth_ = i;
                        }

                        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                            switch (fVar.ordinal()) {
                                case 0:
                                    return (byte) 1;
                                case 1:
                                    return null;
                                case 2:
                                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "videoId_", "videoWidth_", "videoHeight_", "videoDuration_", "finderFeedXml_"});
                                case 3:
                                    return new VideoMsg();
                                case 4:
                                    return new Builder((C243681) null);
                                case 5:
                                    return DEFAULT_INSTANCE;
                                case 6:
                                    C24062w1<VideoMsg> w1Var = PARSER;
                                    if (w1Var == null) {
                                        synchronized (VideoMsg.class) {
                                            w1Var = PARSER;
                                            if (w1Var == null) {
                                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                                PARSER = w1Var;
                                            }
                                        }
                                    }
                                    return w1Var;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        public String getFinderFeedXml() {
                            return this.finderFeedXml_;
                        }

                        public C16994k getFinderFeedXmlBytes() {
                            return C16994k.m16791k(this.finderFeedXml_);
                        }

                        public int getVideoDuration() {
                            return this.videoDuration_;
                        }

                        public int getVideoHeight() {
                            return this.videoHeight_;
                        }

                        public String getVideoId() {
                            return this.videoId_;
                        }

                        public C16994k getVideoIdBytes() {
                            return C16994k.m16791k(this.videoId_);
                        }

                        public int getVideoWidth() {
                            return this.videoWidth_;
                        }

                        public boolean hasFinderFeedXml() {
                            return (this.bitField0_ & 16) != 0;
                        }

                        public boolean hasVideoDuration() {
                            return (this.bitField0_ & 8) != 0;
                        }

                        public boolean hasVideoHeight() {
                            return (this.bitField0_ & 4) != 0;
                        }

                        public boolean hasVideoId() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        public boolean hasVideoWidth() {
                            return (this.bitField0_ & 2) != 0;
                        }

                        public static Builder newBuilder(VideoMsg videoMsg) {
                            return (Builder) DEFAULT_INSTANCE.createBuilder(videoMsg);
                        }

                        public static VideoMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                            return (VideoMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                        }

                        public static VideoMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                        }

                        public static VideoMsg parseFrom(C16994k kVar) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                        }

                        public static VideoMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                        }

                        public static VideoMsg parseFrom(byte[] bArr) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static VideoMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                        }

                        public static VideoMsg parseFrom(InputStream inputStream) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static VideoMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                        }

                        public static VideoMsg parseFrom(C23856l lVar) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                        }

                        public static VideoMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                            return (VideoMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                        }
                    }

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$VideoMsgOrBuilder */
                    public interface VideoMsgOrBuilder extends C23848k1 {
                        /* synthetic */ C23845j1 getDefaultInstanceForType();

                        String getFinderFeedXml();

                        C16994k getFinderFeedXmlBytes();

                        int getVideoDuration();

                        int getVideoHeight();

                        String getVideoId();

                        C16994k getVideoIdBytes();

                        int getVideoWidth();

                        boolean hasFinderFeedXml();

                        boolean hasVideoDuration();

                        boolean hasVideoHeight();

                        boolean hasVideoId();

                        boolean hasVideoWidth();

                        /* synthetic */ boolean isInitialized();
                    }

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$VoiceMsg */
                    public static final class VoiceMsg extends C23861l0<VoiceMsg, Builder> implements VoiceMsgOrBuilder {
                        /* access modifiers changed from: private */
                        public static final VoiceMsg DEFAULT_INSTANCE;
                        private static volatile C24062w1<VoiceMsg> PARSER = null;
                        public static final int VOICEDURATION_FIELD_NUMBER = 2;
                        public static final int VOICEPLAYURL_FIELD_NUMBER = 1;
                        private int bitField0_;
                        private int voiceDuration_;
                        private String voicePlayUrl_ = "";

                        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$VoiceMsg$Builder */
                        public static final class Builder extends C23861l0.C23862a<VoiceMsg, Builder> implements VoiceMsgOrBuilder {
                            public /* synthetic */ Builder(C243681 r1) {
                                this();
                            }

                            public Builder clearVoiceDuration() {
                                copyOnWrite();
                                ((VoiceMsg) this.instance).clearVoiceDuration();
                                return this;
                            }

                            public Builder clearVoicePlayUrl() {
                                copyOnWrite();
                                ((VoiceMsg) this.instance).clearVoicePlayUrl();
                                return this;
                            }

                            public int getVoiceDuration() {
                                return ((VoiceMsg) this.instance).getVoiceDuration();
                            }

                            public String getVoicePlayUrl() {
                                return ((VoiceMsg) this.instance).getVoicePlayUrl();
                            }

                            public C16994k getVoicePlayUrlBytes() {
                                return ((VoiceMsg) this.instance).getVoicePlayUrlBytes();
                            }

                            public boolean hasVoiceDuration() {
                                return ((VoiceMsg) this.instance).hasVoiceDuration();
                            }

                            public boolean hasVoicePlayUrl() {
                                return ((VoiceMsg) this.instance).hasVoicePlayUrl();
                            }

                            public Builder setVoiceDuration(int i) {
                                copyOnWrite();
                                ((VoiceMsg) this.instance).setVoiceDuration(i);
                                return this;
                            }

                            public Builder setVoicePlayUrl(String str) {
                                copyOnWrite();
                                ((VoiceMsg) this.instance).setVoicePlayUrl(str);
                                return this;
                            }

                            public Builder setVoicePlayUrlBytes(C16994k kVar) {
                                copyOnWrite();
                                ((VoiceMsg) this.instance).setVoicePlayUrlBytes(kVar);
                                return this;
                            }

                            private Builder() {
                                super(VoiceMsg.DEFAULT_INSTANCE);
                            }
                        }

                        static {
                            VoiceMsg voiceMsg = new VoiceMsg();
                            DEFAULT_INSTANCE = voiceMsg;
                            C23861l0.registerDefaultInstance(VoiceMsg.class, voiceMsg);
                        }

                        private VoiceMsg() {
                        }

                        /* access modifiers changed from: private */
                        public void clearVoiceDuration() {
                            this.bitField0_ &= -3;
                            this.voiceDuration_ = 0;
                        }

                        /* access modifiers changed from: private */
                        public void clearVoicePlayUrl() {
                            this.bitField0_ &= -2;
                            this.voicePlayUrl_ = getDefaultInstance().getVoicePlayUrl();
                        }

                        public static VoiceMsg getDefaultInstance() {
                            return DEFAULT_INSTANCE;
                        }

                        public static Builder newBuilder() {
                            return (Builder) DEFAULT_INSTANCE.createBuilder();
                        }

                        public static VoiceMsg parseDelimitedFrom(InputStream inputStream) {
                            return (VoiceMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static VoiceMsg parseFrom(ByteBuffer byteBuffer) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                        }

                        public static C24062w1<VoiceMsg> parser() {
                            return DEFAULT_INSTANCE.getParserForType();
                        }

                        /* access modifiers changed from: private */
                        public void setVoiceDuration(int i) {
                            this.bitField0_ |= 2;
                            this.voiceDuration_ = i;
                        }

                        /* access modifiers changed from: private */
                        public void setVoicePlayUrl(String str) {
                            str.getClass();
                            this.bitField0_ |= 1;
                            this.voicePlayUrl_ = str;
                        }

                        /* access modifiers changed from: private */
                        public void setVoicePlayUrlBytes(C16994k kVar) {
                            this.voicePlayUrl_ = kVar.mo18752u();
                            this.bitField0_ |= 1;
                        }

                        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                            switch (fVar.ordinal()) {
                                case 0:
                                    return (byte) 1;
                                case 1:
                                    return null;
                                case 2:
                                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "voicePlayUrl_", "voiceDuration_"});
                                case 3:
                                    return new VoiceMsg();
                                case 4:
                                    return new Builder((C243681) null);
                                case 5:
                                    return DEFAULT_INSTANCE;
                                case 6:
                                    C24062w1<VoiceMsg> w1Var = PARSER;
                                    if (w1Var == null) {
                                        synchronized (VoiceMsg.class) {
                                            w1Var = PARSER;
                                            if (w1Var == null) {
                                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                                PARSER = w1Var;
                                            }
                                        }
                                    }
                                    return w1Var;
                                default:
                                    throw new UnsupportedOperationException();
                            }
                        }

                        public int getVoiceDuration() {
                            return this.voiceDuration_;
                        }

                        public String getVoicePlayUrl() {
                            return this.voicePlayUrl_;
                        }

                        public C16994k getVoicePlayUrlBytes() {
                            return C16994k.m16791k(this.voicePlayUrl_);
                        }

                        public boolean hasVoiceDuration() {
                            return (this.bitField0_ & 2) != 0;
                        }

                        public boolean hasVoicePlayUrl() {
                            return (this.bitField0_ & 1) != 0;
                        }

                        public static Builder newBuilder(VoiceMsg voiceMsg) {
                            return (Builder) DEFAULT_INSTANCE.createBuilder(voiceMsg);
                        }

                        public static VoiceMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                            return (VoiceMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                        }

                        public static VoiceMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                        }

                        public static VoiceMsg parseFrom(C16994k kVar) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                        }

                        public static VoiceMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                        }

                        public static VoiceMsg parseFrom(byte[] bArr) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                        }

                        public static VoiceMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                        }

                        public static VoiceMsg parseFrom(InputStream inputStream) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                        }

                        public static VoiceMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                        }

                        public static VoiceMsg parseFrom(C23856l lVar) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                        }

                        public static VoiceMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                            return (VoiceMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                        }
                    }

                    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsg$VoiceMsgOrBuilder */
                    public interface VoiceMsgOrBuilder extends C23848k1 {
                        /* synthetic */ C23845j1 getDefaultInstanceForType();

                        int getVoiceDuration();

                        String getVoicePlayUrl();

                        C16994k getVoicePlayUrlBytes();

                        boolean hasVoiceDuration();

                        boolean hasVoicePlayUrl();

                        /* synthetic */ boolean isInitialized();
                    }

                    static {
                        ItemMsg itemMsg = new ItemMsg();
                        DEFAULT_INSTANCE = itemMsg;
                        C23861l0.registerDefaultInstance(ItemMsg.class, itemMsg);
                    }

                    private ItemMsg() {
                    }

                    /* access modifiers changed from: private */
                    public void clearContentUrl() {
                        this.bitField0_ &= -5;
                        this.contentUrl_ = getDefaultInstance().getContentUrl();
                    }

                    /* access modifiers changed from: private */
                    public void clearCoverImgUrl() {
                        this.bitField0_ &= -9;
                        this.coverImgUrl_ = getDefaultInstance().getCoverImgUrl();
                    }

                    /* access modifiers changed from: private */
                    public void clearCoverImgUrl11() {
                        this.bitField0_ &= -17;
                        this.coverImgUrl11_ = getDefaultInstance().getCoverImgUrl11();
                    }

                    /* access modifiers changed from: private */
                    public void clearCoverImgUrl2351() {
                        this.bitField0_ &= -33;
                        this.coverImgUrl2351_ = getDefaultInstance().getCoverImgUrl2351();
                    }

                    /* access modifiers changed from: private */
                    public void clearCreateTime() {
                        this.bitField0_ &= -129;
                        this.createTime_ = 0;
                    }

                    /* access modifiers changed from: private */
                    public void clearDigest() {
                        this.bitField0_ &= -3;
                        this.digest_ = getDefaultInstance().getDigest();
                    }

                    /* access modifiers changed from: private */
                    public void clearItemShowType() {
                        this.bitField0_ &= -65;
                        this.itemShowType_ = 0;
                    }

                    /* access modifiers changed from: private */
                    public void clearPictureInfo() {
                        this.pictureInfo_ = null;
                        this.bitField0_ &= -1025;
                    }

                    /* access modifiers changed from: private */
                    public void clearTitle() {
                        this.bitField0_ &= -2;
                        this.title_ = getDefaultInstance().getTitle();
                    }

                    /* access modifiers changed from: private */
                    public void clearVideoInfo() {
                        this.videoInfo_ = null;
                        this.bitField0_ &= -257;
                    }

                    /* access modifiers changed from: private */
                    public void clearVoiceInfo() {
                        this.voiceInfo_ = null;
                        this.bitField0_ &= -513;
                    }

                    public static ItemMsg getDefaultInstance() {
                        return DEFAULT_INSTANCE;
                    }

                    /* access modifiers changed from: private */
                    public void mergePictureInfo(PictureMsg pictureMsg) {
                        pictureMsg.getClass();
                        PictureMsg pictureMsg2 = this.pictureInfo_;
                        if (pictureMsg2 == null || pictureMsg2 == PictureMsg.getDefaultInstance()) {
                            this.pictureInfo_ = pictureMsg;
                        } else {
                            this.pictureInfo_ = (PictureMsg) ((PictureMsg.Builder) PictureMsg.newBuilder(this.pictureInfo_).mergeFrom(pictureMsg)).buildPartial();
                        }
                        this.bitField0_ |= 1024;
                    }

                    /* access modifiers changed from: private */
                    public void mergeVideoInfo(VideoMsg videoMsg) {
                        videoMsg.getClass();
                        VideoMsg videoMsg2 = this.videoInfo_;
                        if (videoMsg2 == null || videoMsg2 == VideoMsg.getDefaultInstance()) {
                            this.videoInfo_ = videoMsg;
                        } else {
                            this.videoInfo_ = (VideoMsg) ((VideoMsg.Builder) VideoMsg.newBuilder(this.videoInfo_).mergeFrom(videoMsg)).buildPartial();
                        }
                        this.bitField0_ |= 256;
                    }

                    /* access modifiers changed from: private */
                    public void mergeVoiceInfo(VoiceMsg voiceMsg) {
                        voiceMsg.getClass();
                        VoiceMsg voiceMsg2 = this.voiceInfo_;
                        if (voiceMsg2 == null || voiceMsg2 == VoiceMsg.getDefaultInstance()) {
                            this.voiceInfo_ = voiceMsg;
                        } else {
                            this.voiceInfo_ = (VoiceMsg) ((VoiceMsg.Builder) VoiceMsg.newBuilder(this.voiceInfo_).mergeFrom(voiceMsg)).buildPartial();
                        }
                        this.bitField0_ |= 512;
                    }

                    public static Builder newBuilder() {
                        return (Builder) DEFAULT_INSTANCE.createBuilder();
                    }

                    public static ItemMsg parseDelimitedFrom(InputStream inputStream) {
                        return (ItemMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static ItemMsg parseFrom(ByteBuffer byteBuffer) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                    }

                    public static C24062w1<ItemMsg> parser() {
                        return DEFAULT_INSTANCE.getParserForType();
                    }

                    /* access modifiers changed from: private */
                    public void setContentUrl(String str) {
                        str.getClass();
                        this.bitField0_ |= 4;
                        this.contentUrl_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setContentUrlBytes(C16994k kVar) {
                        this.contentUrl_ = kVar.mo18752u();
                        this.bitField0_ |= 4;
                    }

                    /* access modifiers changed from: private */
                    public void setCoverImgUrl(String str) {
                        str.getClass();
                        this.bitField0_ |= 8;
                        this.coverImgUrl_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setCoverImgUrl11(String str) {
                        str.getClass();
                        this.bitField0_ |= 16;
                        this.coverImgUrl11_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setCoverImgUrl11Bytes(C16994k kVar) {
                        this.coverImgUrl11_ = kVar.mo18752u();
                        this.bitField0_ |= 16;
                    }

                    /* access modifiers changed from: private */
                    public void setCoverImgUrl2351(String str) {
                        str.getClass();
                        this.bitField0_ |= 32;
                        this.coverImgUrl2351_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setCoverImgUrl2351Bytes(C16994k kVar) {
                        this.coverImgUrl2351_ = kVar.mo18752u();
                        this.bitField0_ |= 32;
                    }

                    /* access modifiers changed from: private */
                    public void setCoverImgUrlBytes(C16994k kVar) {
                        this.coverImgUrl_ = kVar.mo18752u();
                        this.bitField0_ |= 8;
                    }

                    /* access modifiers changed from: private */
                    public void setCreateTime(int i) {
                        this.bitField0_ |= 128;
                        this.createTime_ = i;
                    }

                    /* access modifiers changed from: private */
                    public void setDigest(String str) {
                        str.getClass();
                        this.bitField0_ |= 2;
                        this.digest_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setDigestBytes(C16994k kVar) {
                        this.digest_ = kVar.mo18752u();
                        this.bitField0_ |= 2;
                    }

                    /* access modifiers changed from: private */
                    public void setItemShowType(int i) {
                        this.bitField0_ |= 64;
                        this.itemShowType_ = i;
                    }

                    /* access modifiers changed from: private */
                    public void setPictureInfo(PictureMsg pictureMsg) {
                        pictureMsg.getClass();
                        this.pictureInfo_ = pictureMsg;
                        this.bitField0_ |= 1024;
                    }

                    /* access modifiers changed from: private */
                    public void setTitle(String str) {
                        str.getClass();
                        this.bitField0_ |= 1;
                        this.title_ = str;
                    }

                    /* access modifiers changed from: private */
                    public void setTitleBytes(C16994k kVar) {
                        this.title_ = kVar.mo18752u();
                        this.bitField0_ |= 1;
                    }

                    /* access modifiers changed from: private */
                    public void setVideoInfo(VideoMsg videoMsg) {
                        videoMsg.getClass();
                        this.videoInfo_ = videoMsg;
                        this.bitField0_ |= 256;
                    }

                    /* access modifiers changed from: private */
                    public void setVoiceInfo(VoiceMsg voiceMsg) {
                        voiceMsg.getClass();
                        this.voiceInfo_ = voiceMsg;
                        this.bitField0_ |= 512;
                    }

                    public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                        switch (fVar.ordinal()) {
                            case 0:
                                return (byte) 1;
                            case 1:
                                return null;
                            case 2:
                                return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဋ\u0006\bဋ\u0007\tဉ\b\nဉ\t\u000bဉ\n", new Object[]{"bitField0_", "title_", "digest_", "contentUrl_", "coverImgUrl_", "coverImgUrl11_", "coverImgUrl2351_", "itemShowType_", "createTime_", "videoInfo_", "voiceInfo_", "pictureInfo_"});
                            case 3:
                                return new ItemMsg();
                            case 4:
                                return new Builder((C243681) null);
                            case 5:
                                return DEFAULT_INSTANCE;
                            case 6:
                                C24062w1<ItemMsg> w1Var = PARSER;
                                if (w1Var == null) {
                                    synchronized (ItemMsg.class) {
                                        w1Var = PARSER;
                                        if (w1Var == null) {
                                            w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                            PARSER = w1Var;
                                        }
                                    }
                                }
                                return w1Var;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    }

                    public String getContentUrl() {
                        return this.contentUrl_;
                    }

                    public C16994k getContentUrlBytes() {
                        return C16994k.m16791k(this.contentUrl_);
                    }

                    public String getCoverImgUrl() {
                        return this.coverImgUrl_;
                    }

                    public String getCoverImgUrl11() {
                        return this.coverImgUrl11_;
                    }

                    public C16994k getCoverImgUrl11Bytes() {
                        return C16994k.m16791k(this.coverImgUrl11_);
                    }

                    public String getCoverImgUrl2351() {
                        return this.coverImgUrl2351_;
                    }

                    public C16994k getCoverImgUrl2351Bytes() {
                        return C16994k.m16791k(this.coverImgUrl2351_);
                    }

                    public C16994k getCoverImgUrlBytes() {
                        return C16994k.m16791k(this.coverImgUrl_);
                    }

                    public int getCreateTime() {
                        return this.createTime_;
                    }

                    public String getDigest() {
                        return this.digest_;
                    }

                    public C16994k getDigestBytes() {
                        return C16994k.m16791k(this.digest_);
                    }

                    public int getItemShowType() {
                        return this.itemShowType_;
                    }

                    public PictureMsg getPictureInfo() {
                        PictureMsg pictureMsg = this.pictureInfo_;
                        return pictureMsg == null ? PictureMsg.getDefaultInstance() : pictureMsg;
                    }

                    public String getTitle() {
                        return this.title_;
                    }

                    public C16994k getTitleBytes() {
                        return C16994k.m16791k(this.title_);
                    }

                    public VideoMsg getVideoInfo() {
                        VideoMsg videoMsg = this.videoInfo_;
                        return videoMsg == null ? VideoMsg.getDefaultInstance() : videoMsg;
                    }

                    public VoiceMsg getVoiceInfo() {
                        VoiceMsg voiceMsg = this.voiceInfo_;
                        return voiceMsg == null ? VoiceMsg.getDefaultInstance() : voiceMsg;
                    }

                    public boolean hasContentUrl() {
                        return (this.bitField0_ & 4) != 0;
                    }

                    public boolean hasCoverImgUrl() {
                        return (this.bitField0_ & 8) != 0;
                    }

                    public boolean hasCoverImgUrl11() {
                        return (this.bitField0_ & 16) != 0;
                    }

                    public boolean hasCoverImgUrl2351() {
                        return (this.bitField0_ & 32) != 0;
                    }

                    public boolean hasCreateTime() {
                        return (this.bitField0_ & 128) != 0;
                    }

                    public boolean hasDigest() {
                        return (this.bitField0_ & 2) != 0;
                    }

                    public boolean hasItemShowType() {
                        return (this.bitField0_ & 64) != 0;
                    }

                    public boolean hasPictureInfo() {
                        return (this.bitField0_ & 1024) != 0;
                    }

                    public boolean hasTitle() {
                        return (this.bitField0_ & 1) != 0;
                    }

                    public boolean hasVideoInfo() {
                        return (this.bitField0_ & 256) != 0;
                    }

                    public boolean hasVoiceInfo() {
                        return (this.bitField0_ & 512) != 0;
                    }

                    public static Builder newBuilder(ItemMsg itemMsg) {
                        return (Builder) DEFAULT_INSTANCE.createBuilder(itemMsg);
                    }

                    public static ItemMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                        return (ItemMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                    }

                    public static ItemMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                    }

                    public static ItemMsg parseFrom(C16994k kVar) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                    }

                    public static ItemMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                    }

                    public static ItemMsg parseFrom(byte[] bArr) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                    }

                    public static ItemMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                    }

                    public static ItemMsg parseFrom(InputStream inputStream) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                    }

                    public static ItemMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                    }

                    public static ItemMsg parseFrom(C23856l lVar) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                    }

                    public static ItemMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                        return (ItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                    }
                }

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsg$ItemMsgOrBuilder */
                public interface ItemMsgOrBuilder extends C23848k1 {
                    String getContentUrl();

                    C16994k getContentUrlBytes();

                    String getCoverImgUrl();

                    String getCoverImgUrl11();

                    C16994k getCoverImgUrl11Bytes();

                    String getCoverImgUrl2351();

                    C16994k getCoverImgUrl2351Bytes();

                    C16994k getCoverImgUrlBytes();

                    int getCreateTime();

                    /* synthetic */ C23845j1 getDefaultInstanceForType();

                    String getDigest();

                    C16994k getDigestBytes();

                    int getItemShowType();

                    ItemMsg.PictureMsg getPictureInfo();

                    String getTitle();

                    C16994k getTitleBytes();

                    ItemMsg.VideoMsg getVideoInfo();

                    ItemMsg.VoiceMsg getVoiceInfo();

                    boolean hasContentUrl();

                    boolean hasCoverImgUrl();

                    boolean hasCoverImgUrl11();

                    boolean hasCoverImgUrl2351();

                    boolean hasCreateTime();

                    boolean hasDigest();

                    boolean hasItemShowType();

                    boolean hasPictureInfo();

                    boolean hasTitle();

                    boolean hasVideoInfo();

                    boolean hasVoiceInfo();

                    /* synthetic */ boolean isInitialized();
                }

                static {
                    RecommendItemMsg recommendItemMsg = new RecommendItemMsg();
                    DEFAULT_INSTANCE = recommendItemMsg;
                    C23861l0.registerDefaultInstance(RecommendItemMsg.class, recommendItemMsg);
                }

                private RecommendItemMsg() {
                }

                /* access modifiers changed from: private */
                public void clearAggregationTitle() {
                    this.bitField0_ &= -9;
                    this.aggregationTitle_ = getDefaultInstance().getAggregationTitle();
                }

                /* access modifiers changed from: private */
                public void clearAggregationUrl() {
                    this.bitField0_ &= -17;
                    this.aggregationUrl_ = getDefaultInstance().getAggregationUrl();
                }

                /* access modifiers changed from: private */
                public void clearBizInfo() {
                    this.bizInfo_ = null;
                    this.bitField0_ &= -2;
                }

                /* access modifiers changed from: private */
                public void clearCanvasBuffer() {
                    this.bitField0_ &= -513;
                    this.canvasBuffer_ = getDefaultInstance().getCanvasBuffer();
                }

                /* access modifiers changed from: private */
                public void clearFinderInfo() {
                    this.finderInfo_ = null;
                    this.bitField0_ &= -1025;
                }

                /* access modifiers changed from: private */
                public void clearIconType() {
                    this.bitField0_ &= -257;
                    this.iconType_ = 0;
                }

                /* access modifiers changed from: private */
                public void clearItemInfo() {
                    this.itemInfo_ = null;
                    this.bitField0_ &= -3;
                }

                /* access modifiers changed from: private */
                public void clearRecInfo() {
                    this.bitField0_ &= -5;
                    this.recInfo_ = getDefaultInstance().getRecInfo();
                }

                /* access modifiers changed from: private */
                public void clearRecommendTag() {
                    this.recommendTag_ = null;
                    this.bitField0_ &= -129;
                }

                /* access modifiers changed from: private */
                public void clearRecommendWording() {
                    this.bitField0_ &= -33;
                    this.recommendWording_ = getDefaultInstance().getRecommendWording();
                }

                /* access modifiers changed from: private */
                public void clearStyleFlag() {
                    this.bitField0_ &= -65;
                    this.styleFlag_ = 0;
                }

                public static RecommendItemMsg getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                /* access modifiers changed from: private */
                public void mergeBizInfo(BizAcctInfo bizAcctInfo) {
                    bizAcctInfo.getClass();
                    BizAcctInfo bizAcctInfo2 = this.bizInfo_;
                    if (bizAcctInfo2 == null || bizAcctInfo2 == BizAcctInfo.getDefaultInstance()) {
                        this.bizInfo_ = bizAcctInfo;
                    } else {
                        this.bizInfo_ = (BizAcctInfo) ((BizAcctInfo.Builder) BizAcctInfo.newBuilder(this.bizInfo_).mergeFrom(bizAcctInfo)).buildPartial();
                    }
                    this.bitField0_ |= 1;
                }

                /* access modifiers changed from: private */
                public void mergeFinderInfo(FinderMsg finderMsg) {
                    finderMsg.getClass();
                    FinderMsg finderMsg2 = this.finderInfo_;
                    if (finderMsg2 == null || finderMsg2 == FinderMsg.getDefaultInstance()) {
                        this.finderInfo_ = finderMsg;
                    } else {
                        this.finderInfo_ = (FinderMsg) ((FinderMsg.Builder) FinderMsg.newBuilder(this.finderInfo_).mergeFrom(finderMsg)).buildPartial();
                    }
                    this.bitField0_ |= 1024;
                }

                /* access modifiers changed from: private */
                public void mergeItemInfo(ItemMsg itemMsg) {
                    itemMsg.getClass();
                    ItemMsg itemMsg2 = this.itemInfo_;
                    if (itemMsg2 == null || itemMsg2 == ItemMsg.getDefaultInstance()) {
                        this.itemInfo_ = itemMsg;
                    } else {
                        this.itemInfo_ = (ItemMsg) ((ItemMsg.Builder) ItemMsg.newBuilder(this.itemInfo_).mergeFrom(itemMsg)).buildPartial();
                    }
                    this.bitField0_ |= 2;
                }

                /* access modifiers changed from: private */
                public void mergeRecommendTag(RecommendTagMsg recommendTagMsg) {
                    recommendTagMsg.getClass();
                    RecommendTagMsg recommendTagMsg2 = this.recommendTag_;
                    if (recommendTagMsg2 == null || recommendTagMsg2 == RecommendTagMsg.getDefaultInstance()) {
                        this.recommendTag_ = recommendTagMsg;
                    } else {
                        this.recommendTag_ = (RecommendTagMsg) ((RecommendTagMsg.Builder) RecommendTagMsg.newBuilder(this.recommendTag_).mergeFrom(recommendTagMsg)).buildPartial();
                    }
                    this.bitField0_ |= 128;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static RecommendItemMsg parseDelimitedFrom(InputStream inputStream) {
                    return (RecommendItemMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RecommendItemMsg parseFrom(ByteBuffer byteBuffer) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static C24062w1<RecommendItemMsg> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setAggregationTitle(String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.aggregationTitle_ = str;
                }

                /* access modifiers changed from: private */
                public void setAggregationTitleBytes(C16994k kVar) {
                    this.aggregationTitle_ = kVar.mo18752u();
                    this.bitField0_ |= 8;
                }

                /* access modifiers changed from: private */
                public void setAggregationUrl(String str) {
                    str.getClass();
                    this.bitField0_ |= 16;
                    this.aggregationUrl_ = str;
                }

                /* access modifiers changed from: private */
                public void setAggregationUrlBytes(C16994k kVar) {
                    this.aggregationUrl_ = kVar.mo18752u();
                    this.bitField0_ |= 16;
                }

                /* access modifiers changed from: private */
                public void setBizInfo(BizAcctInfo bizAcctInfo) {
                    bizAcctInfo.getClass();
                    this.bizInfo_ = bizAcctInfo;
                    this.bitField0_ |= 1;
                }

                /* access modifiers changed from: private */
                public void setCanvasBuffer(String str) {
                    str.getClass();
                    this.bitField0_ |= 512;
                    this.canvasBuffer_ = str;
                }

                /* access modifiers changed from: private */
                public void setCanvasBufferBytes(C16994k kVar) {
                    this.canvasBuffer_ = kVar.mo18752u();
                    this.bitField0_ |= 512;
                }

                /* access modifiers changed from: private */
                public void setFinderInfo(FinderMsg finderMsg) {
                    finderMsg.getClass();
                    this.finderInfo_ = finderMsg;
                    this.bitField0_ |= 1024;
                }

                /* access modifiers changed from: private */
                public void setIconType(int i) {
                    this.bitField0_ |= 256;
                    this.iconType_ = i;
                }

                /* access modifiers changed from: private */
                public void setItemInfo(ItemMsg itemMsg) {
                    itemMsg.getClass();
                    this.itemInfo_ = itemMsg;
                    this.bitField0_ |= 2;
                }

                /* access modifiers changed from: private */
                public void setRecInfo(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.recInfo_ = str;
                }

                /* access modifiers changed from: private */
                public void setRecInfoBytes(C16994k kVar) {
                    this.recInfo_ = kVar.mo18752u();
                    this.bitField0_ |= 4;
                }

                /* access modifiers changed from: private */
                public void setRecommendTag(RecommendTagMsg recommendTagMsg) {
                    recommendTagMsg.getClass();
                    this.recommendTag_ = recommendTagMsg;
                    this.bitField0_ |= 128;
                }

                /* access modifiers changed from: private */
                public void setRecommendWording(String str) {
                    str.getClass();
                    this.bitField0_ |= 32;
                    this.recommendWording_ = str;
                }

                /* access modifiers changed from: private */
                public void setRecommendWordingBytes(C16994k kVar) {
                    this.recommendWording_ = kVar.mo18752u();
                    this.bitField0_ |= 32;
                }

                /* access modifiers changed from: private */
                public void setStyleFlag(int i) {
                    this.bitField0_ |= 64;
                    this.styleFlag_ = i;
                }

                public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                    switch (fVar.ordinal()) {
                        case 0:
                            return (byte) 1;
                        case 1:
                            return null;
                        case 2:
                            return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဋ\u0006\bဉ\u0007\tဋ\b\nဈ\t\u000eဉ\n", new Object[]{"bitField0_", "bizInfo_", "itemInfo_", "recInfo_", "aggregationTitle_", "aggregationUrl_", "recommendWording_", "styleFlag_", "recommendTag_", "iconType_", "canvasBuffer_", "finderInfo_"});
                        case 3:
                            return new RecommendItemMsg();
                        case 4:
                            return new Builder((C243681) null);
                        case 5:
                            return DEFAULT_INSTANCE;
                        case 6:
                            C24062w1<RecommendItemMsg> w1Var = PARSER;
                            if (w1Var == null) {
                                synchronized (RecommendItemMsg.class) {
                                    w1Var = PARSER;
                                    if (w1Var == null) {
                                        w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                        PARSER = w1Var;
                                    }
                                }
                            }
                            return w1Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                public String getAggregationTitle() {
                    return this.aggregationTitle_;
                }

                public C16994k getAggregationTitleBytes() {
                    return C16994k.m16791k(this.aggregationTitle_);
                }

                public String getAggregationUrl() {
                    return this.aggregationUrl_;
                }

                public C16994k getAggregationUrlBytes() {
                    return C16994k.m16791k(this.aggregationUrl_);
                }

                public BizAcctInfo getBizInfo() {
                    BizAcctInfo bizAcctInfo = this.bizInfo_;
                    return bizAcctInfo == null ? BizAcctInfo.getDefaultInstance() : bizAcctInfo;
                }

                public String getCanvasBuffer() {
                    return this.canvasBuffer_;
                }

                public C16994k getCanvasBufferBytes() {
                    return C16994k.m16791k(this.canvasBuffer_);
                }

                public FinderMsg getFinderInfo() {
                    FinderMsg finderMsg = this.finderInfo_;
                    return finderMsg == null ? FinderMsg.getDefaultInstance() : finderMsg;
                }

                public int getIconType() {
                    return this.iconType_;
                }

                public ItemMsg getItemInfo() {
                    ItemMsg itemMsg = this.itemInfo_;
                    return itemMsg == null ? ItemMsg.getDefaultInstance() : itemMsg;
                }

                public String getRecInfo() {
                    return this.recInfo_;
                }

                public C16994k getRecInfoBytes() {
                    return C16994k.m16791k(this.recInfo_);
                }

                public RecommendTagMsg getRecommendTag() {
                    RecommendTagMsg recommendTagMsg = this.recommendTag_;
                    return recommendTagMsg == null ? RecommendTagMsg.getDefaultInstance() : recommendTagMsg;
                }

                public String getRecommendWording() {
                    return this.recommendWording_;
                }

                public C16994k getRecommendWordingBytes() {
                    return C16994k.m16791k(this.recommendWording_);
                }

                public int getStyleFlag() {
                    return this.styleFlag_;
                }

                public boolean hasAggregationTitle() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasAggregationUrl() {
                    return (this.bitField0_ & 16) != 0;
                }

                public boolean hasBizInfo() {
                    return (this.bitField0_ & 1) != 0;
                }

                public boolean hasCanvasBuffer() {
                    return (this.bitField0_ & 512) != 0;
                }

                public boolean hasFinderInfo() {
                    return (this.bitField0_ & 1024) != 0;
                }

                public boolean hasIconType() {
                    return (this.bitField0_ & 256) != 0;
                }

                public boolean hasItemInfo() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasRecInfo() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasRecommendTag() {
                    return (this.bitField0_ & 128) != 0;
                }

                public boolean hasRecommendWording() {
                    return (this.bitField0_ & 32) != 0;
                }

                public boolean hasStyleFlag() {
                    return (this.bitField0_ & 64) != 0;
                }

                public static Builder newBuilder(RecommendItemMsg recommendItemMsg) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(recommendItemMsg);
                }

                public static RecommendItemMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (RecommendItemMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static RecommendItemMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                }

                public static RecommendItemMsg parseFrom(C16994k kVar) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                }

                public static RecommendItemMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                }

                public static RecommendItemMsg parseFrom(byte[] bArr) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static RecommendItemMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                }

                public static RecommendItemMsg parseFrom(InputStream inputStream) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RecommendItemMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static RecommendItemMsg parseFrom(C23856l lVar) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                }

                public static RecommendItemMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                    return (RecommendItemMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendItemMsgOrBuilder */
            public interface RecommendItemMsgOrBuilder extends C23848k1 {
                String getAggregationTitle();

                C16994k getAggregationTitleBytes();

                String getAggregationUrl();

                C16994k getAggregationUrlBytes();

                RecommendItemMsg.BizAcctInfo getBizInfo();

                String getCanvasBuffer();

                C16994k getCanvasBufferBytes();

                /* synthetic */ C23845j1 getDefaultInstanceForType();

                RecommendItemMsg.FinderMsg getFinderInfo();

                int getIconType();

                RecommendItemMsg.ItemMsg getItemInfo();

                String getRecInfo();

                C16994k getRecInfoBytes();

                RecommendTagMsg getRecommendTag();

                String getRecommendWording();

                C16994k getRecommendWordingBytes();

                int getStyleFlag();

                boolean hasAggregationTitle();

                boolean hasAggregationUrl();

                boolean hasBizInfo();

                boolean hasCanvasBuffer();

                boolean hasFinderInfo();

                boolean hasIconType();

                boolean hasItemInfo();

                boolean hasRecInfo();

                boolean hasRecommendTag();

                boolean hasRecommendWording();

                boolean hasStyleFlag();

                /* synthetic */ boolean isInitialized();
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendTagMsg */
            public static final class RecommendTagMsg extends C23861l0<RecommendTagMsg, Builder> implements RecommendTagMsgOrBuilder {
                public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
                public static final int DARK_MODE_BACKGROUND_COLOR_FIELD_NUMBER = 5;
                public static final int DARK_MODE_TEXT_COLOR_FIELD_NUMBER = 4;
                /* access modifiers changed from: private */
                public static final RecommendTagMsg DEFAULT_INSTANCE;
                private static volatile C24062w1<RecommendTagMsg> PARSER = null;
                public static final int TEXT_COLOR_FIELD_NUMBER = 2;
                public static final int WORDING_FIELD_NUMBER = 1;
                private String backgroundColor_ = "";
                private int bitField0_;
                private String darkModeBackgroundColor_ = "";
                private String darkModeTextColor_ = "";
                private String textColor_ = "";
                private String wording_ = "";

                /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendTagMsg$Builder */
                public static final class Builder extends C23861l0.C23862a<RecommendTagMsg, Builder> implements RecommendTagMsgOrBuilder {
                    public /* synthetic */ Builder(C243681 r1) {
                        this();
                    }

                    public Builder clearBackgroundColor() {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).clearBackgroundColor();
                        return this;
                    }

                    public Builder clearDarkModeBackgroundColor() {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).clearDarkModeBackgroundColor();
                        return this;
                    }

                    public Builder clearDarkModeTextColor() {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).clearDarkModeTextColor();
                        return this;
                    }

                    public Builder clearTextColor() {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).clearTextColor();
                        return this;
                    }

                    public Builder clearWording() {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).clearWording();
                        return this;
                    }

                    public String getBackgroundColor() {
                        return ((RecommendTagMsg) this.instance).getBackgroundColor();
                    }

                    public C16994k getBackgroundColorBytes() {
                        return ((RecommendTagMsg) this.instance).getBackgroundColorBytes();
                    }

                    public String getDarkModeBackgroundColor() {
                        return ((RecommendTagMsg) this.instance).getDarkModeBackgroundColor();
                    }

                    public C16994k getDarkModeBackgroundColorBytes() {
                        return ((RecommendTagMsg) this.instance).getDarkModeBackgroundColorBytes();
                    }

                    public String getDarkModeTextColor() {
                        return ((RecommendTagMsg) this.instance).getDarkModeTextColor();
                    }

                    public C16994k getDarkModeTextColorBytes() {
                        return ((RecommendTagMsg) this.instance).getDarkModeTextColorBytes();
                    }

                    public String getTextColor() {
                        return ((RecommendTagMsg) this.instance).getTextColor();
                    }

                    public C16994k getTextColorBytes() {
                        return ((RecommendTagMsg) this.instance).getTextColorBytes();
                    }

                    public String getWording() {
                        return ((RecommendTagMsg) this.instance).getWording();
                    }

                    public C16994k getWordingBytes() {
                        return ((RecommendTagMsg) this.instance).getWordingBytes();
                    }

                    public boolean hasBackgroundColor() {
                        return ((RecommendTagMsg) this.instance).hasBackgroundColor();
                    }

                    public boolean hasDarkModeBackgroundColor() {
                        return ((RecommendTagMsg) this.instance).hasDarkModeBackgroundColor();
                    }

                    public boolean hasDarkModeTextColor() {
                        return ((RecommendTagMsg) this.instance).hasDarkModeTextColor();
                    }

                    public boolean hasTextColor() {
                        return ((RecommendTagMsg) this.instance).hasTextColor();
                    }

                    public boolean hasWording() {
                        return ((RecommendTagMsg) this.instance).hasWording();
                    }

                    public Builder setBackgroundColor(String str) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setBackgroundColor(str);
                        return this;
                    }

                    public Builder setBackgroundColorBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setBackgroundColorBytes(kVar);
                        return this;
                    }

                    public Builder setDarkModeBackgroundColor(String str) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setDarkModeBackgroundColor(str);
                        return this;
                    }

                    public Builder setDarkModeBackgroundColorBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setDarkModeBackgroundColorBytes(kVar);
                        return this;
                    }

                    public Builder setDarkModeTextColor(String str) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setDarkModeTextColor(str);
                        return this;
                    }

                    public Builder setDarkModeTextColorBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setDarkModeTextColorBytes(kVar);
                        return this;
                    }

                    public Builder setTextColor(String str) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setTextColor(str);
                        return this;
                    }

                    public Builder setTextColorBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setTextColorBytes(kVar);
                        return this;
                    }

                    public Builder setWording(String str) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setWording(str);
                        return this;
                    }

                    public Builder setWordingBytes(C16994k kVar) {
                        copyOnWrite();
                        ((RecommendTagMsg) this.instance).setWordingBytes(kVar);
                        return this;
                    }

                    private Builder() {
                        super(RecommendTagMsg.DEFAULT_INSTANCE);
                    }
                }

                static {
                    RecommendTagMsg recommendTagMsg = new RecommendTagMsg();
                    DEFAULT_INSTANCE = recommendTagMsg;
                    C23861l0.registerDefaultInstance(RecommendTagMsg.class, recommendTagMsg);
                }

                private RecommendTagMsg() {
                }

                /* access modifiers changed from: private */
                public void clearBackgroundColor() {
                    this.bitField0_ &= -5;
                    this.backgroundColor_ = getDefaultInstance().getBackgroundColor();
                }

                /* access modifiers changed from: private */
                public void clearDarkModeBackgroundColor() {
                    this.bitField0_ &= -17;
                    this.darkModeBackgroundColor_ = getDefaultInstance().getDarkModeBackgroundColor();
                }

                /* access modifiers changed from: private */
                public void clearDarkModeTextColor() {
                    this.bitField0_ &= -9;
                    this.darkModeTextColor_ = getDefaultInstance().getDarkModeTextColor();
                }

                /* access modifiers changed from: private */
                public void clearTextColor() {
                    this.bitField0_ &= -3;
                    this.textColor_ = getDefaultInstance().getTextColor();
                }

                /* access modifiers changed from: private */
                public void clearWording() {
                    this.bitField0_ &= -2;
                    this.wording_ = getDefaultInstance().getWording();
                }

                public static RecommendTagMsg getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Builder newBuilder() {
                    return (Builder) DEFAULT_INSTANCE.createBuilder();
                }

                public static RecommendTagMsg parseDelimitedFrom(InputStream inputStream) {
                    return (RecommendTagMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RecommendTagMsg parseFrom(ByteBuffer byteBuffer) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
                }

                public static C24062w1<RecommendTagMsg> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }

                /* access modifiers changed from: private */
                public void setBackgroundColor(String str) {
                    str.getClass();
                    this.bitField0_ |= 4;
                    this.backgroundColor_ = str;
                }

                /* access modifiers changed from: private */
                public void setBackgroundColorBytes(C16994k kVar) {
                    this.backgroundColor_ = kVar.mo18752u();
                    this.bitField0_ |= 4;
                }

                /* access modifiers changed from: private */
                public void setDarkModeBackgroundColor(String str) {
                    str.getClass();
                    this.bitField0_ |= 16;
                    this.darkModeBackgroundColor_ = str;
                }

                /* access modifiers changed from: private */
                public void setDarkModeBackgroundColorBytes(C16994k kVar) {
                    this.darkModeBackgroundColor_ = kVar.mo18752u();
                    this.bitField0_ |= 16;
                }

                /* access modifiers changed from: private */
                public void setDarkModeTextColor(String str) {
                    str.getClass();
                    this.bitField0_ |= 8;
                    this.darkModeTextColor_ = str;
                }

                /* access modifiers changed from: private */
                public void setDarkModeTextColorBytes(C16994k kVar) {
                    this.darkModeTextColor_ = kVar.mo18752u();
                    this.bitField0_ |= 8;
                }

                /* access modifiers changed from: private */
                public void setTextColor(String str) {
                    str.getClass();
                    this.bitField0_ |= 2;
                    this.textColor_ = str;
                }

                /* access modifiers changed from: private */
                public void setTextColorBytes(C16994k kVar) {
                    this.textColor_ = kVar.mo18752u();
                    this.bitField0_ |= 2;
                }

                /* access modifiers changed from: private */
                public void setWording(String str) {
                    str.getClass();
                    this.bitField0_ |= 1;
                    this.wording_ = str;
                }

                /* access modifiers changed from: private */
                public void setWordingBytes(C16994k kVar) {
                    this.wording_ = kVar.mo18752u();
                    this.bitField0_ |= 1;
                }

                public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                    switch (fVar.ordinal()) {
                        case 0:
                            return (byte) 1;
                        case 1:
                            return null;
                        case 2:
                            return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "wording_", "textColor_", "backgroundColor_", "darkModeTextColor_", "darkModeBackgroundColor_"});
                        case 3:
                            return new RecommendTagMsg();
                        case 4:
                            return new Builder((C243681) null);
                        case 5:
                            return DEFAULT_INSTANCE;
                        case 6:
                            C24062w1<RecommendTagMsg> w1Var = PARSER;
                            if (w1Var == null) {
                                synchronized (RecommendTagMsg.class) {
                                    w1Var = PARSER;
                                    if (w1Var == null) {
                                        w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                        PARSER = w1Var;
                                    }
                                }
                            }
                            return w1Var;
                        default:
                            throw new UnsupportedOperationException();
                    }
                }

                public String getBackgroundColor() {
                    return this.backgroundColor_;
                }

                public C16994k getBackgroundColorBytes() {
                    return C16994k.m16791k(this.backgroundColor_);
                }

                public String getDarkModeBackgroundColor() {
                    return this.darkModeBackgroundColor_;
                }

                public C16994k getDarkModeBackgroundColorBytes() {
                    return C16994k.m16791k(this.darkModeBackgroundColor_);
                }

                public String getDarkModeTextColor() {
                    return this.darkModeTextColor_;
                }

                public C16994k getDarkModeTextColorBytes() {
                    return C16994k.m16791k(this.darkModeTextColor_);
                }

                public String getTextColor() {
                    return this.textColor_;
                }

                public C16994k getTextColorBytes() {
                    return C16994k.m16791k(this.textColor_);
                }

                public String getWording() {
                    return this.wording_;
                }

                public C16994k getWordingBytes() {
                    return C16994k.m16791k(this.wording_);
                }

                public boolean hasBackgroundColor() {
                    return (this.bitField0_ & 4) != 0;
                }

                public boolean hasDarkModeBackgroundColor() {
                    return (this.bitField0_ & 16) != 0;
                }

                public boolean hasDarkModeTextColor() {
                    return (this.bitField0_ & 8) != 0;
                }

                public boolean hasTextColor() {
                    return (this.bitField0_ & 2) != 0;
                }

                public boolean hasWording() {
                    return (this.bitField0_ & 1) != 0;
                }

                public static Builder newBuilder(RecommendTagMsg recommendTagMsg) {
                    return (Builder) DEFAULT_INSTANCE.createBuilder(recommendTagMsg);
                }

                public static RecommendTagMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (RecommendTagMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static RecommendTagMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
                }

                public static RecommendTagMsg parseFrom(C16994k kVar) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
                }

                public static RecommendTagMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
                }

                public static RecommendTagMsg parseFrom(byte[] bArr) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
                }

                public static RecommendTagMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
                }

                public static RecommendTagMsg parseFrom(InputStream inputStream) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
                }

                public static RecommendTagMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
                }

                public static RecommendTagMsg parseFrom(C23856l lVar) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
                }

                public static RecommendTagMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                    return (RecommendTagMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
                }
            }

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsg$RecommendTagMsgOrBuilder */
            public interface RecommendTagMsgOrBuilder extends C23848k1 {
                String getBackgroundColor();

                C16994k getBackgroundColorBytes();

                String getDarkModeBackgroundColor();

                C16994k getDarkModeBackgroundColorBytes();

                String getDarkModeTextColor();

                C16994k getDarkModeTextColorBytes();

                /* synthetic */ C23845j1 getDefaultInstanceForType();

                String getTextColor();

                C16994k getTextColorBytes();

                String getWording();

                C16994k getWordingBytes();

                boolean hasBackgroundColor();

                boolean hasDarkModeBackgroundColor();

                boolean hasDarkModeTextColor();

                boolean hasTextColor();

                boolean hasWording();

                /* synthetic */ boolean isInitialized();
            }

            static {
                RecommendCardMsg recommendCardMsg = new RecommendCardMsg();
                DEFAULT_INSTANCE = recommendCardMsg;
                C23861l0.registerDefaultInstance(RecommendCardMsg.class, recommendCardMsg);
            }

            private RecommendCardMsg() {
            }

            /* access modifiers changed from: private */
            public void addAllFriendSeenHeadImgUrl(Iterable<String> iterable) {
                ensureFriendSeenHeadImgUrlIsMutable();
                C23810b.addAll(iterable, this.friendSeenHeadImgUrl_);
            }

            /* access modifiers changed from: private */
            public void addAllNegativeFeedbackReason(Iterable<String> iterable) {
                ensureNegativeFeedbackReasonIsMutable();
                C23810b.addAll(iterable, this.negativeFeedbackReason_);
            }

            /* access modifiers changed from: private */
            public void addAllRecommendItem(Iterable<? extends RecommendItemMsg> iterable) {
                ensureRecommendItemIsMutable();
                C23810b.addAll(iterable, this.recommendItem_);
            }

            /* access modifiers changed from: private */
            public void addFriendSeenHeadImgUrl(String str) {
                str.getClass();
                ensureFriendSeenHeadImgUrlIsMutable();
                this.friendSeenHeadImgUrl_.add(str);
            }

            /* access modifiers changed from: private */
            public void addFriendSeenHeadImgUrlBytes(C16994k kVar) {
                ensureFriendSeenHeadImgUrlIsMutable();
                this.friendSeenHeadImgUrl_.add(kVar.mo18752u());
            }

            /* access modifiers changed from: private */
            public void addNegativeFeedbackReason(String str) {
                str.getClass();
                ensureNegativeFeedbackReasonIsMutable();
                this.negativeFeedbackReason_.add(str);
            }

            /* access modifiers changed from: private */
            public void addNegativeFeedbackReasonBytes(C16994k kVar) {
                ensureNegativeFeedbackReasonIsMutable();
                this.negativeFeedbackReason_.add(kVar.mo18752u());
            }

            /* access modifiers changed from: private */
            public void addRecommendItem(RecommendItemMsg recommendItemMsg) {
                recommendItemMsg.getClass();
                ensureRecommendItemIsMutable();
                this.recommendItem_.add(recommendItemMsg);
            }

            /* access modifiers changed from: private */
            public void clearAggregationTitle() {
                this.bitField0_ &= -17;
                this.aggregationTitle_ = getDefaultInstance().getAggregationTitle();
            }

            /* access modifiers changed from: private */
            public void clearAggregationUrl() {
                this.bitField0_ &= -33;
                this.aggregationUrl_ = getDefaultInstance().getAggregationUrl();
            }

            /* access modifiers changed from: private */
            public void clearCanvasBuffer() {
                this.bitField0_ &= -513;
                this.canvasBuffer_ = getDefaultInstance().getCanvasBuffer();
            }

            /* access modifiers changed from: private */
            public void clearCardId() {
                this.bitField0_ &= -9;
                this.cardId_ = getDefaultInstance().getCardId();
            }

            /* access modifiers changed from: private */
            public void clearExtraData() {
                this.bitField0_ &= -2;
                this.extraData_ = getDefaultInstance().getExtraData();
            }

            /* access modifiers changed from: private */
            public void clearFriendSeenHeadImgUrl() {
                this.friendSeenHeadImgUrl_ = C23861l0.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearIconType() {
                this.bitField0_ &= -257;
                this.iconType_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearNegativeFeedbackReason() {
                this.negativeFeedbackReason_ = C23861l0.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearPackageVersion() {
                this.bitField0_ &= -2049;
                this.packageVersion_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearRecommendItem() {
                this.recommendItem_ = C23861l0.emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void clearRecommendTag() {
                this.recommendTag_ = null;
                this.bitField0_ &= -129;
            }

            /* access modifiers changed from: private */
            public void clearRecommendWording() {
                this.bitField0_ &= -65;
                this.recommendWording_ = getDefaultInstance().getRecommendWording();
            }

            /* access modifiers changed from: private */
            public void clearSeparateStyle() {
                this.bitField0_ &= -1025;
                this.separateStyle_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearStyle() {
                this.bitField0_ &= -3;
                this.style_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearStyleFlag() {
                this.bitField0_ &= -5;
                this.styleFlag_ = 0;
            }

            private void ensureFriendSeenHeadImgUrlIsMutable() {
                C23908o0.C23919j<String> jVar = this.friendSeenHeadImgUrl_;
                if (!jVar.mo37523Q()) {
                    this.friendSeenHeadImgUrl_ = C23861l0.mutableCopy(jVar);
                }
            }

            private void ensureNegativeFeedbackReasonIsMutable() {
                C23908o0.C23919j<String> jVar = this.negativeFeedbackReason_;
                if (!jVar.mo37523Q()) {
                    this.negativeFeedbackReason_ = C23861l0.mutableCopy(jVar);
                }
            }

            private void ensureRecommendItemIsMutable() {
                C23908o0.C23919j<RecommendItemMsg> jVar = this.recommendItem_;
                if (!jVar.mo37523Q()) {
                    this.recommendItem_ = C23861l0.mutableCopy(jVar);
                }
            }

            public static RecommendCardMsg getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            /* access modifiers changed from: private */
            public void mergeRecommendTag(RecommendTagMsg recommendTagMsg) {
                recommendTagMsg.getClass();
                RecommendTagMsg recommendTagMsg2 = this.recommendTag_;
                if (recommendTagMsg2 == null || recommendTagMsg2 == RecommendTagMsg.getDefaultInstance()) {
                    this.recommendTag_ = recommendTagMsg;
                } else {
                    this.recommendTag_ = (RecommendTagMsg) ((RecommendTagMsg.Builder) RecommendTagMsg.newBuilder(this.recommendTag_).mergeFrom(recommendTagMsg)).buildPartial();
                }
                this.bitField0_ |= 128;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static RecommendCardMsg parseDelimitedFrom(InputStream inputStream) {
                return (RecommendCardMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RecommendCardMsg parseFrom(ByteBuffer byteBuffer) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<RecommendCardMsg> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void removeRecommendItem(int i) {
                ensureRecommendItemIsMutable();
                this.recommendItem_.remove(i);
            }

            /* access modifiers changed from: private */
            public void setAggregationTitle(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.aggregationTitle_ = str;
            }

            /* access modifiers changed from: private */
            public void setAggregationTitleBytes(C16994k kVar) {
                this.aggregationTitle_ = kVar.mo18752u();
                this.bitField0_ |= 16;
            }

            /* access modifiers changed from: private */
            public void setAggregationUrl(String str) {
                str.getClass();
                this.bitField0_ |= 32;
                this.aggregationUrl_ = str;
            }

            /* access modifiers changed from: private */
            public void setAggregationUrlBytes(C16994k kVar) {
                this.aggregationUrl_ = kVar.mo18752u();
                this.bitField0_ |= 32;
            }

            /* access modifiers changed from: private */
            public void setCanvasBuffer(String str) {
                str.getClass();
                this.bitField0_ |= 512;
                this.canvasBuffer_ = str;
            }

            /* access modifiers changed from: private */
            public void setCanvasBufferBytes(C16994k kVar) {
                this.canvasBuffer_ = kVar.mo18752u();
                this.bitField0_ |= 512;
            }

            /* access modifiers changed from: private */
            public void setCardId(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.cardId_ = str;
            }

            /* access modifiers changed from: private */
            public void setCardIdBytes(C16994k kVar) {
                this.cardId_ = kVar.mo18752u();
                this.bitField0_ |= 8;
            }

            /* access modifiers changed from: private */
            public void setExtraData(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.extraData_ = str;
            }

            /* access modifiers changed from: private */
            public void setExtraDataBytes(C16994k kVar) {
                this.extraData_ = kVar.mo18752u();
                this.bitField0_ |= 1;
            }

            /* access modifiers changed from: private */
            public void setFriendSeenHeadImgUrl(int i, String str) {
                str.getClass();
                ensureFriendSeenHeadImgUrlIsMutable();
                this.friendSeenHeadImgUrl_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void setIconType(int i) {
                this.bitField0_ |= 256;
                this.iconType_ = i;
            }

            /* access modifiers changed from: private */
            public void setNegativeFeedbackReason(int i, String str) {
                str.getClass();
                ensureNegativeFeedbackReasonIsMutable();
                this.negativeFeedbackReason_.set(i, str);
            }

            /* access modifiers changed from: private */
            public void setPackageVersion(int i) {
                this.bitField0_ |= 2048;
                this.packageVersion_ = i;
            }

            /* access modifiers changed from: private */
            public void setRecommendItem(int i, RecommendItemMsg recommendItemMsg) {
                recommendItemMsg.getClass();
                ensureRecommendItemIsMutable();
                this.recommendItem_.set(i, recommendItemMsg);
            }

            /* access modifiers changed from: private */
            public void setRecommendTag(RecommendTagMsg recommendTagMsg) {
                recommendTagMsg.getClass();
                this.recommendTag_ = recommendTagMsg;
                this.bitField0_ |= 128;
            }

            /* access modifiers changed from: private */
            public void setRecommendWording(String str) {
                str.getClass();
                this.bitField0_ |= 64;
                this.recommendWording_ = str;
            }

            /* access modifiers changed from: private */
            public void setRecommendWordingBytes(C16994k kVar) {
                this.recommendWording_ = kVar.mo18752u();
                this.bitField0_ |= 64;
            }

            /* access modifiers changed from: private */
            public void setSeparateStyle(int i) {
                this.bitField0_ |= 1024;
                this.separateStyle_ = i;
            }

            /* access modifiers changed from: private */
            public void setStyle(int i) {
                this.bitField0_ |= 2;
                this.style_ = i;
            }

            /* access modifiers changed from: private */
            public void setStyleFlag(int i) {
                this.bitField0_ |= 4;
                this.styleFlag_ = i;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဋ\u0001\u0004ဋ\u0002\u0005ဈ\u0003\u0006\u001a\u0007ဈ\u0004\bဈ\u0005\tဈ\u0006\nဉ\u0007\u000bဋ\b\f\u001a\rဈ\t\u000eဋ\n\u000fဋ\u000b", new Object[]{"bitField0_", "extraData_", "recommendItem_", RecommendItemMsg.class, "style_", "styleFlag_", "cardId_", "negativeFeedbackReason_", "aggregationTitle_", "aggregationUrl_", "recommendWording_", "recommendTag_", "iconType_", "friendSeenHeadImgUrl_", "canvasBuffer_", "separateStyle_", "packageVersion_"});
                    case 3:
                        return new RecommendCardMsg();
                    case 4:
                        return new Builder((C243681) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<RecommendCardMsg> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (RecommendCardMsg.class) {
                                w1Var = PARSER;
                                if (w1Var == null) {
                                    w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                    PARSER = w1Var;
                                }
                            }
                        }
                        return w1Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public String getAggregationTitle() {
                return this.aggregationTitle_;
            }

            public C16994k getAggregationTitleBytes() {
                return C16994k.m16791k(this.aggregationTitle_);
            }

            public String getAggregationUrl() {
                return this.aggregationUrl_;
            }

            public C16994k getAggregationUrlBytes() {
                return C16994k.m16791k(this.aggregationUrl_);
            }

            public String getCanvasBuffer() {
                return this.canvasBuffer_;
            }

            public C16994k getCanvasBufferBytes() {
                return C16994k.m16791k(this.canvasBuffer_);
            }

            public String getCardId() {
                return this.cardId_;
            }

            public C16994k getCardIdBytes() {
                return C16994k.m16791k(this.cardId_);
            }

            public String getExtraData() {
                return this.extraData_;
            }

            public C16994k getExtraDataBytes() {
                return C16994k.m16791k(this.extraData_);
            }

            public String getFriendSeenHeadImgUrl(int i) {
                return this.friendSeenHeadImgUrl_.get(i);
            }

            public C16994k getFriendSeenHeadImgUrlBytes(int i) {
                return C16994k.m16791k(this.friendSeenHeadImgUrl_.get(i));
            }

            public int getFriendSeenHeadImgUrlCount() {
                return this.friendSeenHeadImgUrl_.size();
            }

            public List<String> getFriendSeenHeadImgUrlList() {
                return this.friendSeenHeadImgUrl_;
            }

            public int getIconType() {
                return this.iconType_;
            }

            public String getNegativeFeedbackReason(int i) {
                return this.negativeFeedbackReason_.get(i);
            }

            public C16994k getNegativeFeedbackReasonBytes(int i) {
                return C16994k.m16791k(this.negativeFeedbackReason_.get(i));
            }

            public int getNegativeFeedbackReasonCount() {
                return this.negativeFeedbackReason_.size();
            }

            public List<String> getNegativeFeedbackReasonList() {
                return this.negativeFeedbackReason_;
            }

            public int getPackageVersion() {
                return this.packageVersion_;
            }

            public RecommendItemMsg getRecommendItem(int i) {
                return this.recommendItem_.get(i);
            }

            public int getRecommendItemCount() {
                return this.recommendItem_.size();
            }

            public List<RecommendItemMsg> getRecommendItemList() {
                return this.recommendItem_;
            }

            public RecommendItemMsgOrBuilder getRecommendItemOrBuilder(int i) {
                return this.recommendItem_.get(i);
            }

            public List<? extends RecommendItemMsgOrBuilder> getRecommendItemOrBuilderList() {
                return this.recommendItem_;
            }

            public RecommendTagMsg getRecommendTag() {
                RecommendTagMsg recommendTagMsg = this.recommendTag_;
                return recommendTagMsg == null ? RecommendTagMsg.getDefaultInstance() : recommendTagMsg;
            }

            public String getRecommendWording() {
                return this.recommendWording_;
            }

            public C16994k getRecommendWordingBytes() {
                return C16994k.m16791k(this.recommendWording_);
            }

            public int getSeparateStyle() {
                return this.separateStyle_;
            }

            public int getStyle() {
                return this.style_;
            }

            public int getStyleFlag() {
                return this.styleFlag_;
            }

            public boolean hasAggregationTitle() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasAggregationUrl() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasCanvasBuffer() {
                return (this.bitField0_ & 512) != 0;
            }

            public boolean hasCardId() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasExtraData() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasIconType() {
                return (this.bitField0_ & 256) != 0;
            }

            public boolean hasPackageVersion() {
                return (this.bitField0_ & 2048) != 0;
            }

            public boolean hasRecommendTag() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasRecommendWording() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasSeparateStyle() {
                return (this.bitField0_ & 1024) != 0;
            }

            public boolean hasStyle() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasStyleFlag() {
                return (this.bitField0_ & 4) != 0;
            }

            public static Builder newBuilder(RecommendCardMsg recommendCardMsg) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(recommendCardMsg);
            }

            public static RecommendCardMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (RecommendCardMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static RecommendCardMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static RecommendCardMsg parseFrom(C16994k kVar) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            /* access modifiers changed from: private */
            public void addRecommendItem(int i, RecommendItemMsg recommendItemMsg) {
                recommendItemMsg.getClass();
                ensureRecommendItemIsMutable();
                this.recommendItem_.add(i, recommendItemMsg);
            }

            public static RecommendCardMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static RecommendCardMsg parseFrom(byte[] bArr) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RecommendCardMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static RecommendCardMsg parseFrom(InputStream inputStream) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RecommendCardMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static RecommendCardMsg parseFrom(C23856l lVar) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static RecommendCardMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (RecommendCardMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendCardMsgOrBuilder */
        public interface RecommendCardMsgOrBuilder extends C23848k1 {
            String getAggregationTitle();

            C16994k getAggregationTitleBytes();

            String getAggregationUrl();

            C16994k getAggregationUrlBytes();

            String getCanvasBuffer();

            C16994k getCanvasBufferBytes();

            String getCardId();

            C16994k getCardIdBytes();

            /* synthetic */ C23845j1 getDefaultInstanceForType();

            String getExtraData();

            C16994k getExtraDataBytes();

            String getFriendSeenHeadImgUrl(int i);

            C16994k getFriendSeenHeadImgUrlBytes(int i);

            int getFriendSeenHeadImgUrlCount();

            List<String> getFriendSeenHeadImgUrlList();

            int getIconType();

            String getNegativeFeedbackReason(int i);

            C16994k getNegativeFeedbackReasonBytes(int i);

            int getNegativeFeedbackReasonCount();

            List<String> getNegativeFeedbackReasonList();

            int getPackageVersion();

            RecommendCardMsg.RecommendItemMsg getRecommendItem(int i);

            int getRecommendItemCount();

            List<RecommendCardMsg.RecommendItemMsg> getRecommendItemList();

            RecommendCardMsg.RecommendTagMsg getRecommendTag();

            String getRecommendWording();

            C16994k getRecommendWordingBytes();

            int getSeparateStyle();

            int getStyle();

            int getStyleFlag();

            boolean hasAggregationTitle();

            boolean hasAggregationUrl();

            boolean hasCanvasBuffer();

            boolean hasCardId();

            boolean hasExtraData();

            boolean hasIconType();

            boolean hasPackageVersion();

            boolean hasRecommendTag();

            boolean hasRecommendWording();

            boolean hasSeparateStyle();

            boolean hasStyle();

            boolean hasStyleFlag();

            /* synthetic */ boolean isInitialized();
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendFeedsConfig */
        public static final class RecommendFeedsConfig extends C23861l0<RecommendFeedsConfig, Builder> implements RecommendFeedsConfigOrBuilder {
            public static final int BIZMSGCONTEXTCNT_FIELD_NUMBER = 5;
            /* access modifiers changed from: private */
            public static final RecommendFeedsConfig DEFAULT_INSTANCE;
            public static final int NEXTREQTIME_FIELD_NUMBER = 1;
            private static volatile C24062w1<RecommendFeedsConfig> PARSER = null;
            public static final int PROTECTIONTIME_FIELD_NUMBER = 2;
            public static final int SHOWMORECARDBUTTON_FIELD_NUMBER = 4;
            public static final int SUBSCRIBEMSGLIMIT_FIELD_NUMBER = 3;
            private int bitField0_;
            private int bizmsgContextCnt_;
            private int nextReqTime_;
            private int protectionTime_;
            private boolean showMoreCardButton_;
            private int subscribeMsgLimit_;

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendFeedsConfig$Builder */
            public static final class Builder extends C23861l0.C23862a<RecommendFeedsConfig, Builder> implements RecommendFeedsConfigOrBuilder {
                public /* synthetic */ Builder(C243681 r1) {
                    this();
                }

                public Builder clearBizmsgContextCnt() {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).clearBizmsgContextCnt();
                    return this;
                }

                public Builder clearNextReqTime() {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).clearNextReqTime();
                    return this;
                }

                public Builder clearProtectionTime() {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).clearProtectionTime();
                    return this;
                }

                public Builder clearShowMoreCardButton() {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).clearShowMoreCardButton();
                    return this;
                }

                public Builder clearSubscribeMsgLimit() {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).clearSubscribeMsgLimit();
                    return this;
                }

                public int getBizmsgContextCnt() {
                    return ((RecommendFeedsConfig) this.instance).getBizmsgContextCnt();
                }

                public int getNextReqTime() {
                    return ((RecommendFeedsConfig) this.instance).getNextReqTime();
                }

                public int getProtectionTime() {
                    return ((RecommendFeedsConfig) this.instance).getProtectionTime();
                }

                public boolean getShowMoreCardButton() {
                    return ((RecommendFeedsConfig) this.instance).getShowMoreCardButton();
                }

                public int getSubscribeMsgLimit() {
                    return ((RecommendFeedsConfig) this.instance).getSubscribeMsgLimit();
                }

                public boolean hasBizmsgContextCnt() {
                    return ((RecommendFeedsConfig) this.instance).hasBizmsgContextCnt();
                }

                public boolean hasNextReqTime() {
                    return ((RecommendFeedsConfig) this.instance).hasNextReqTime();
                }

                public boolean hasProtectionTime() {
                    return ((RecommendFeedsConfig) this.instance).hasProtectionTime();
                }

                public boolean hasShowMoreCardButton() {
                    return ((RecommendFeedsConfig) this.instance).hasShowMoreCardButton();
                }

                public boolean hasSubscribeMsgLimit() {
                    return ((RecommendFeedsConfig) this.instance).hasSubscribeMsgLimit();
                }

                public Builder setBizmsgContextCnt(int i) {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).setBizmsgContextCnt(i);
                    return this;
                }

                public Builder setNextReqTime(int i) {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).setNextReqTime(i);
                    return this;
                }

                public Builder setProtectionTime(int i) {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).setProtectionTime(i);
                    return this;
                }

                public Builder setShowMoreCardButton(boolean z) {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).setShowMoreCardButton(z);
                    return this;
                }

                public Builder setSubscribeMsgLimit(int i) {
                    copyOnWrite();
                    ((RecommendFeedsConfig) this.instance).setSubscribeMsgLimit(i);
                    return this;
                }

                private Builder() {
                    super(RecommendFeedsConfig.DEFAULT_INSTANCE);
                }
            }

            static {
                RecommendFeedsConfig recommendFeedsConfig = new RecommendFeedsConfig();
                DEFAULT_INSTANCE = recommendFeedsConfig;
                C23861l0.registerDefaultInstance(RecommendFeedsConfig.class, recommendFeedsConfig);
            }

            private RecommendFeedsConfig() {
            }

            /* access modifiers changed from: private */
            public void clearBizmsgContextCnt() {
                this.bitField0_ &= -17;
                this.bizmsgContextCnt_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearNextReqTime() {
                this.bitField0_ &= -2;
                this.nextReqTime_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearProtectionTime() {
                this.bitField0_ &= -3;
                this.protectionTime_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearShowMoreCardButton() {
                this.bitField0_ &= -9;
                this.showMoreCardButton_ = false;
            }

            /* access modifiers changed from: private */
            public void clearSubscribeMsgLimit() {
                this.bitField0_ &= -5;
                this.subscribeMsgLimit_ = 0;
            }

            public static RecommendFeedsConfig getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static RecommendFeedsConfig parseDelimitedFrom(InputStream inputStream) {
                return (RecommendFeedsConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RecommendFeedsConfig parseFrom(ByteBuffer byteBuffer) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<RecommendFeedsConfig> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBizmsgContextCnt(int i) {
                this.bitField0_ |= 16;
                this.bizmsgContextCnt_ = i;
            }

            /* access modifiers changed from: private */
            public void setNextReqTime(int i) {
                this.bitField0_ |= 1;
                this.nextReqTime_ = i;
            }

            /* access modifiers changed from: private */
            public void setProtectionTime(int i) {
                this.bitField0_ |= 2;
                this.protectionTime_ = i;
            }

            /* access modifiers changed from: private */
            public void setShowMoreCardButton(boolean z) {
                this.bitField0_ |= 8;
                this.showMoreCardButton_ = z;
            }

            /* access modifiers changed from: private */
            public void setSubscribeMsgLimit(int i) {
                this.bitField0_ |= 4;
                this.subscribeMsgLimit_ = i;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "nextReqTime_", "protectionTime_", "subscribeMsgLimit_", "showMoreCardButton_", "bizmsgContextCnt_"});
                    case 3:
                        return new RecommendFeedsConfig();
                    case 4:
                        return new Builder((C243681) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<RecommendFeedsConfig> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (RecommendFeedsConfig.class) {
                                w1Var = PARSER;
                                if (w1Var == null) {
                                    w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                    PARSER = w1Var;
                                }
                            }
                        }
                        return w1Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public int getBizmsgContextCnt() {
                return this.bizmsgContextCnt_;
            }

            public int getNextReqTime() {
                return this.nextReqTime_;
            }

            public int getProtectionTime() {
                return this.protectionTime_;
            }

            public boolean getShowMoreCardButton() {
                return this.showMoreCardButton_;
            }

            public int getSubscribeMsgLimit() {
                return this.subscribeMsgLimit_;
            }

            public boolean hasBizmsgContextCnt() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasNextReqTime() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasProtectionTime() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasShowMoreCardButton() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasSubscribeMsgLimit() {
                return (this.bitField0_ & 4) != 0;
            }

            public static Builder newBuilder(RecommendFeedsConfig recommendFeedsConfig) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(recommendFeedsConfig);
            }

            public static RecommendFeedsConfig parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (RecommendFeedsConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static RecommendFeedsConfig parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static RecommendFeedsConfig parseFrom(C16994k kVar) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static RecommendFeedsConfig parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static RecommendFeedsConfig parseFrom(byte[] bArr) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static RecommendFeedsConfig parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static RecommendFeedsConfig parseFrom(InputStream inputStream) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static RecommendFeedsConfig parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static RecommendFeedsConfig parseFrom(C23856l lVar) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static RecommendFeedsConfig parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (RecommendFeedsConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponse$RecommendFeedsConfigOrBuilder */
        public interface RecommendFeedsConfigOrBuilder extends C23848k1 {
            int getBizmsgContextCnt();

            /* synthetic */ C23845j1 getDefaultInstanceForType();

            int getNextReqTime();

            int getProtectionTime();

            boolean getShowMoreCardButton();

            int getSubscribeMsgLimit();

            boolean hasBizmsgContextCnt();

            boolean hasNextReqTime();

            boolean hasProtectionTime();

            boolean hasShowMoreCardButton();

            boolean hasSubscribeMsgLimit();

            /* synthetic */ boolean isInitialized();
        }

        static {
            GetRecommendFeedsResponse getRecommendFeedsResponse = new GetRecommendFeedsResponse();
            DEFAULT_INSTANCE = getRecommendFeedsResponse;
            C23861l0.registerDefaultInstance(GetRecommendFeedsResponse.class, getRecommendFeedsResponse);
        }

        private GetRecommendFeedsResponse() {
        }

        /* access modifiers changed from: private */
        public void addAllRecommendCard(Iterable<? extends RecommendCardMsg> iterable) {
            ensureRecommendCardIsMutable();
            C23810b.addAll(iterable, this.recommendCard_);
        }

        /* access modifiers changed from: private */
        public void addRecommendCard(RecommendCardMsg recommendCardMsg) {
            recommendCardMsg.getClass();
            ensureRecommendCardIsMutable();
            this.recommendCard_.add(recommendCardMsg);
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -9;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearRecommendCard() {
            this.recommendCard_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearRecommendFeedsWording() {
            this.bitField0_ &= -5;
            this.recommendFeedsWording_ = getDefaultInstance().getRecommendFeedsWording();
        }

        private void ensureRecommendCardIsMutable() {
            C23908o0.C23919j<RecommendCardMsg> jVar = this.recommendCard_;
            if (!jVar.mo37523Q()) {
                this.recommendCard_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static GetRecommendFeedsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseResponse(BaseResponse baseResponse) {
            baseResponse.getClass();
            BaseResponse baseResponse2 = this.baseResponse_;
            if (baseResponse2 == null || baseResponse2 == BaseResponse.getDefaultInstance()) {
                this.baseResponse_ = baseResponse;
            } else {
                this.baseResponse_ = (BaseResponse) ((BaseResponse.Builder) BaseResponse.newBuilder(this.baseResponse_).mergeFrom(baseResponse)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(RecommendFeedsConfig recommendFeedsConfig) {
            recommendFeedsConfig.getClass();
            RecommendFeedsConfig recommendFeedsConfig2 = this.config_;
            if (recommendFeedsConfig2 == null || recommendFeedsConfig2 == RecommendFeedsConfig.getDefaultInstance()) {
                this.config_ = recommendFeedsConfig;
            } else {
                this.config_ = (RecommendFeedsConfig) ((RecommendFeedsConfig.Builder) RecommendFeedsConfig.newBuilder(this.config_).mergeFrom(recommendFeedsConfig)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static GetRecommendFeedsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetRecommendFeedsResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetRecommendFeedsResponse parseFrom(ByteBuffer byteBuffer) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<GetRecommendFeedsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeRecommendCard(int i) {
            ensureRecommendCardIsMutable();
            this.recommendCard_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.buffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setConfig(RecommendFeedsConfig recommendFeedsConfig) {
            recommendFeedsConfig.getClass();
            this.config_ = recommendFeedsConfig;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setRecommendCard(int i, RecommendCardMsg recommendCardMsg) {
            recommendCardMsg.getClass();
            ensureRecommendCardIsMutable();
            this.recommendCard_.set(i, recommendCardMsg);
        }

        /* access modifiers changed from: private */
        public void setRecommendFeedsWording(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.recommendFeedsWording_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecommendFeedsWordingBytes(C16994k kVar) {
            this.recommendFeedsWording_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᔉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0002\u0005ည\u0003", new Object[]{"bitField0_", "baseResponse_", "recommendCard_", RecommendCardMsg.class, "config_", "recommendFeedsWording_", "buffer_"});
                case 3:
                    return new GetRecommendFeedsResponse();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<GetRecommendFeedsResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (GetRecommendFeedsResponse.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public BaseResponse getBaseResponse() {
            BaseResponse baseResponse = this.baseResponse_;
            return baseResponse == null ? BaseResponse.getDefaultInstance() : baseResponse;
        }

        public C16994k getBuffer() {
            return this.buffer_;
        }

        public RecommendFeedsConfig getConfig() {
            RecommendFeedsConfig recommendFeedsConfig = this.config_;
            return recommendFeedsConfig == null ? RecommendFeedsConfig.getDefaultInstance() : recommendFeedsConfig;
        }

        public RecommendCardMsg getRecommendCard(int i) {
            return this.recommendCard_.get(i);
        }

        public int getRecommendCardCount() {
            return this.recommendCard_.size();
        }

        public List<RecommendCardMsg> getRecommendCardList() {
            return this.recommendCard_;
        }

        public RecommendCardMsgOrBuilder getRecommendCardOrBuilder(int i) {
            return this.recommendCard_.get(i);
        }

        public List<? extends RecommendCardMsgOrBuilder> getRecommendCardOrBuilderList() {
            return this.recommendCard_;
        }

        public String getRecommendFeedsWording() {
            return this.recommendFeedsWording_;
        }

        public C16994k getRecommendFeedsWordingBytes() {
            return C16994k.m16791k(this.recommendFeedsWording_);
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasRecommendFeedsWording() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(GetRecommendFeedsResponse getRecommendFeedsResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(getRecommendFeedsResponse);
        }

        public static GetRecommendFeedsResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (GetRecommendFeedsResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static GetRecommendFeedsResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static GetRecommendFeedsResponse parseFrom(C16994k kVar) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addRecommendCard(int i, RecommendCardMsg recommendCardMsg) {
            recommendCardMsg.getClass();
            ensureRecommendCardIsMutable();
            this.recommendCard_.add(i, recommendCardMsg);
        }

        public static GetRecommendFeedsResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static GetRecommendFeedsResponse parseFrom(byte[] bArr) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetRecommendFeedsResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static GetRecommendFeedsResponse parseFrom(InputStream inputStream) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetRecommendFeedsResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static GetRecommendFeedsResponse parseFrom(C23856l lVar) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static GetRecommendFeedsResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (GetRecommendFeedsResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsResponseOrBuilder */
    public interface GetRecommendFeedsResponseOrBuilder extends C23848k1 {
        BaseResponse getBaseResponse();

        C16994k getBuffer();

        GetRecommendFeedsResponse.RecommendFeedsConfig getConfig();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        GetRecommendFeedsResponse.RecommendCardMsg getRecommendCard(int i);

        int getRecommendCardCount();

        List<GetRecommendFeedsResponse.RecommendCardMsg> getRecommendCardList();

        String getRecommendFeedsWording();

        C16994k getRecommendFeedsWordingBytes();

        boolean hasBaseResponse();

        boolean hasBuffer();

        boolean hasConfig();

        boolean hasRecommendFeedsWording();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsScene */
    public enum GetRecommendFeedsScene implements C23908o0.C23911c {
        INVALID_SCENE(0),
        GET_RECOMMEND_FEEDS_SCENE_PRELOAD(1),
        GET_RECOMMEND_FEEDS_SCENE_ENTER(2),
        GET_RECOMMEND_FEEDS_SCENE_LOAD_MORE(3),
        GET_RECOMMEND_FEEDS_SCENE_REPLACE(4);
        
        public static final int GET_RECOMMEND_FEEDS_SCENE_ENTER_VALUE = 2;
        public static final int GET_RECOMMEND_FEEDS_SCENE_LOAD_MORE_VALUE = 3;
        public static final int GET_RECOMMEND_FEEDS_SCENE_PRELOAD_VALUE = 1;
        public static final int GET_RECOMMEND_FEEDS_SCENE_REPLACE_VALUE = 4;
        public static final int INVALID_SCENE_VALUE = 0;
        private static final C23908o0.C23912d<GetRecommendFeedsScene> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsScene$GetRecommendFeedsSceneVerifier */
        public static final class GetRecommendFeedsSceneVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new GetRecommendFeedsSceneVerifier();
            }

            private GetRecommendFeedsSceneVerifier() {
            }

            public boolean isInRange(int i) {
                return GetRecommendFeedsScene.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<GetRecommendFeedsScene>() {
                public GetRecommendFeedsScene findValueByNumber(int i) {
                    return GetRecommendFeedsScene.forNumber(i);
                }
            };
        }

        private GetRecommendFeedsScene(int i) {
            this.value = i;
        }

        public static GetRecommendFeedsScene forNumber(int i) {
            if (i == 0) {
                return INVALID_SCENE;
            }
            if (i == 1) {
                return GET_RECOMMEND_FEEDS_SCENE_PRELOAD;
            }
            if (i == 2) {
                return GET_RECOMMEND_FEEDS_SCENE_ENTER;
            }
            if (i == 3) {
                return GET_RECOMMEND_FEEDS_SCENE_LOAD_MORE;
            }
            if (i != 4) {
                return null;
            }
            return GET_RECOMMEND_FEEDS_SCENE_REPLACE;
        }

        public static C23908o0.C23912d<GetRecommendFeedsScene> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return GetRecommendFeedsSceneVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GetRecommendFeedsScene valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsStyle */
    public enum GetRecommendFeedsStyle implements C23908o0.C23911c {
        GET_RECOMMEND_FEEDS_STYLE_VERSION_1(2001),
        GET_RECOMMEND_FEEDS_STYLE_TAG_VERSION_1(2002);
        
        public static final int GET_RECOMMEND_FEEDS_STYLE_TAG_VERSION_1_VALUE = 2002;
        public static final int GET_RECOMMEND_FEEDS_STYLE_VERSION_1_VALUE = 2001;
        private static final C23908o0.C23912d<GetRecommendFeedsStyle> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsStyle$GetRecommendFeedsStyleVerifier */
        public static final class GetRecommendFeedsStyleVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new GetRecommendFeedsStyleVerifier();
            }

            private GetRecommendFeedsStyleVerifier() {
            }

            public boolean isInRange(int i) {
                return GetRecommendFeedsStyle.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<GetRecommendFeedsStyle>() {
                public GetRecommendFeedsStyle findValueByNumber(int i) {
                    return GetRecommendFeedsStyle.forNumber(i);
                }
            };
        }

        private GetRecommendFeedsStyle(int i) {
            this.value = i;
        }

        public static GetRecommendFeedsStyle forNumber(int i) {
            if (i == 2001) {
                return GET_RECOMMEND_FEEDS_STYLE_VERSION_1;
            }
            if (i != 2002) {
                return null;
            }
            return GET_RECOMMEND_FEEDS_STYLE_TAG_VERSION_1;
        }

        public static C23908o0.C23912d<GetRecommendFeedsStyle> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return GetRecommendFeedsStyleVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GetRecommendFeedsStyle valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsStyleFlag */
    public enum GetRecommendFeedsStyleFlag implements C23908o0.C23911c {
        GET_RECOMMEND_FEEDS_STYLE_FLAG_BIG(0),
        GET_RECOMMEND_FEEDS_STYLE_FLAG_SMALL(1),
        GET_RECOMMEND_FEEDS_STYLE_FLAG_THREE(2),
        GET_RECOMMEND_FEEDS_STYLE_FLAG_CONTENT_BIG(3),
        GET_RECOMMEND_FEEDS_STYLE_FLAG_CONTENT_SMALL(4);
        
        public static final int GET_RECOMMEND_FEEDS_STYLE_FLAG_BIG_VALUE = 0;
        public static final int GET_RECOMMEND_FEEDS_STYLE_FLAG_CONTENT_BIG_VALUE = 3;
        public static final int GET_RECOMMEND_FEEDS_STYLE_FLAG_CONTENT_SMALL_VALUE = 4;
        public static final int GET_RECOMMEND_FEEDS_STYLE_FLAG_SMALL_VALUE = 1;
        public static final int GET_RECOMMEND_FEEDS_STYLE_FLAG_THREE_VALUE = 2;
        private static final C23908o0.C23912d<GetRecommendFeedsStyleFlag> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$GetRecommendFeedsStyleFlag$GetRecommendFeedsStyleFlagVerifier */
        public static final class GetRecommendFeedsStyleFlagVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new GetRecommendFeedsStyleFlagVerifier();
            }

            private GetRecommendFeedsStyleFlagVerifier() {
            }

            public boolean isInRange(int i) {
                return GetRecommendFeedsStyleFlag.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<GetRecommendFeedsStyleFlag>() {
                public GetRecommendFeedsStyleFlag findValueByNumber(int i) {
                    return GetRecommendFeedsStyleFlag.forNumber(i);
                }
            };
        }

        private GetRecommendFeedsStyleFlag(int i) {
            this.value = i;
        }

        public static GetRecommendFeedsStyleFlag forNumber(int i) {
            if (i == 0) {
                return GET_RECOMMEND_FEEDS_STYLE_FLAG_BIG;
            }
            if (i == 1) {
                return GET_RECOMMEND_FEEDS_STYLE_FLAG_SMALL;
            }
            if (i == 2) {
                return GET_RECOMMEND_FEEDS_STYLE_FLAG_THREE;
            }
            if (i == 3) {
                return GET_RECOMMEND_FEEDS_STYLE_FLAG_CONTENT_BIG;
            }
            if (i != 4) {
                return null;
            }
            return GET_RECOMMEND_FEEDS_STYLE_FLAG_CONTENT_SMALL;
        }

        public static C23908o0.C23912d<GetRecommendFeedsStyleFlag> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return GetRecommendFeedsStyleFlagVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static GetRecommendFeedsStyleFlag valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$InBoxResortContext */
    public static final class InBoxResortContext extends C23861l0<InBoxResortContext, Builder> implements InBoxResortContextOrBuilder {
        /* access modifiers changed from: private */
        public static final InBoxResortContext DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static volatile C24062w1<InBoxResortContext> PARSER;
        private C23908o0.C23919j<ContextItem> items_ = C23861l0.emptyProtobufList();

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$InBoxResortContext$Builder */
        public static final class Builder extends C23861l0.C23862a<InBoxResortContext, Builder> implements InBoxResortContextOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder addAllItems(Iterable<? extends ContextItem> iterable) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).addAllItems(iterable);
                return this;
            }

            public Builder addItems(ContextItem contextItem) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).addItems(contextItem);
                return this;
            }

            public Builder clearItems() {
                copyOnWrite();
                ((InBoxResortContext) this.instance).clearItems();
                return this;
            }

            public ContextItem getItems(int i) {
                return ((InBoxResortContext) this.instance).getItems(i);
            }

            public int getItemsCount() {
                return ((InBoxResortContext) this.instance).getItemsCount();
            }

            public List<ContextItem> getItemsList() {
                return Collections.unmodifiableList(((InBoxResortContext) this.instance).getItemsList());
            }

            public Builder removeItems(int i) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).removeItems(i);
                return this;
            }

            public Builder setItems(int i, ContextItem contextItem) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).setItems(i, contextItem);
                return this;
            }

            private Builder() {
                super(InBoxResortContext.DEFAULT_INSTANCE);
            }

            public Builder addItems(int i, ContextItem contextItem) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).addItems(i, contextItem);
                return this;
            }

            public Builder setItems(int i, ContextItem.Builder builder) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).setItems(i, (ContextItem) builder.build());
                return this;
            }

            public Builder addItems(ContextItem.Builder builder) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).addItems((ContextItem) builder.build());
                return this;
            }

            public Builder addItems(int i, ContextItem.Builder builder) {
                copyOnWrite();
                ((InBoxResortContext) this.instance).addItems(i, (ContextItem) builder.build());
                return this;
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$InBoxResortContext$ContextItem */
        public static final class ContextItem extends C23861l0<ContextItem, Builder> implements ContextItemOrBuilder {
            public static final int BIZUIN_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final ContextItem DEFAULT_INSTANCE;
            public static final int IDX_FIELD_NUMBER = 3;
            public static final int ITEM_SHOW_TYPE_FIELD_NUMBER = 5;
            public static final int ITEM_STATUS_FIELD_NUMBER = 4;
            public static final int MSGID_FIELD_NUMBER = 2;
            private static volatile C24062w1<ContextItem> PARSER;
            private int bitField0_;
            private int bizuin_;
            private int idx_;
            private int itemShowType_;
            private int itemStatus_;
            private int msgid_;

            /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$InBoxResortContext$ContextItem$Builder */
            public static final class Builder extends C23861l0.C23862a<ContextItem, Builder> implements ContextItemOrBuilder {
                public /* synthetic */ Builder(C243681 r1) {
                    this();
                }

                public Builder clearBizuin() {
                    copyOnWrite();
                    ((ContextItem) this.instance).clearBizuin();
                    return this;
                }

                public Builder clearIdx() {
                    copyOnWrite();
                    ((ContextItem) this.instance).clearIdx();
                    return this;
                }

                public Builder clearItemShowType() {
                    copyOnWrite();
                    ((ContextItem) this.instance).clearItemShowType();
                    return this;
                }

                public Builder clearItemStatus() {
                    copyOnWrite();
                    ((ContextItem) this.instance).clearItemStatus();
                    return this;
                }

                public Builder clearMsgid() {
                    copyOnWrite();
                    ((ContextItem) this.instance).clearMsgid();
                    return this;
                }

                public int getBizuin() {
                    return ((ContextItem) this.instance).getBizuin();
                }

                public int getIdx() {
                    return ((ContextItem) this.instance).getIdx();
                }

                public int getItemShowType() {
                    return ((ContextItem) this.instance).getItemShowType();
                }

                public int getItemStatus() {
                    return ((ContextItem) this.instance).getItemStatus();
                }

                public int getMsgid() {
                    return ((ContextItem) this.instance).getMsgid();
                }

                public boolean hasBizuin() {
                    return ((ContextItem) this.instance).hasBizuin();
                }

                public boolean hasIdx() {
                    return ((ContextItem) this.instance).hasIdx();
                }

                public boolean hasItemShowType() {
                    return ((ContextItem) this.instance).hasItemShowType();
                }

                public boolean hasItemStatus() {
                    return ((ContextItem) this.instance).hasItemStatus();
                }

                public boolean hasMsgid() {
                    return ((ContextItem) this.instance).hasMsgid();
                }

                public Builder setBizuin(int i) {
                    copyOnWrite();
                    ((ContextItem) this.instance).setBizuin(i);
                    return this;
                }

                public Builder setIdx(int i) {
                    copyOnWrite();
                    ((ContextItem) this.instance).setIdx(i);
                    return this;
                }

                public Builder setItemShowType(int i) {
                    copyOnWrite();
                    ((ContextItem) this.instance).setItemShowType(i);
                    return this;
                }

                public Builder setItemStatus(int i) {
                    copyOnWrite();
                    ((ContextItem) this.instance).setItemStatus(i);
                    return this;
                }

                public Builder setMsgid(int i) {
                    copyOnWrite();
                    ((ContextItem) this.instance).setMsgid(i);
                    return this;
                }

                private Builder() {
                    super(ContextItem.DEFAULT_INSTANCE);
                }
            }

            static {
                ContextItem contextItem = new ContextItem();
                DEFAULT_INSTANCE = contextItem;
                C23861l0.registerDefaultInstance(ContextItem.class, contextItem);
            }

            private ContextItem() {
            }

            /* access modifiers changed from: private */
            public void clearBizuin() {
                this.bitField0_ &= -2;
                this.bizuin_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearIdx() {
                this.bitField0_ &= -5;
                this.idx_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearItemShowType() {
                this.bitField0_ &= -17;
                this.itemShowType_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearItemStatus() {
                this.bitField0_ &= -9;
                this.itemStatus_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearMsgid() {
                this.bitField0_ &= -3;
                this.msgid_ = 0;
            }

            public static ContextItem getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static ContextItem parseDelimitedFrom(InputStream inputStream) {
                return (ContextItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContextItem parseFrom(ByteBuffer byteBuffer) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<ContextItem> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setBizuin(int i) {
                this.bitField0_ |= 1;
                this.bizuin_ = i;
            }

            /* access modifiers changed from: private */
            public void setIdx(int i) {
                this.bitField0_ |= 4;
                this.idx_ = i;
            }

            /* access modifiers changed from: private */
            public void setItemShowType(int i) {
                this.bitField0_ |= 16;
                this.itemShowType_ = i;
            }

            /* access modifiers changed from: private */
            public void setItemStatus(int i) {
                this.bitField0_ |= 8;
                this.itemStatus_ = i;
            }

            /* access modifiers changed from: private */
            public void setMsgid(int i) {
                this.bitField0_ |= 2;
                this.msgid_ = i;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "bizuin_", "msgid_", "idx_", "itemStatus_", "itemShowType_"});
                    case 3:
                        return new ContextItem();
                    case 4:
                        return new Builder((C243681) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<ContextItem> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (ContextItem.class) {
                                w1Var = PARSER;
                                if (w1Var == null) {
                                    w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                    PARSER = w1Var;
                                }
                            }
                        }
                        return w1Var;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public int getBizuin() {
                return this.bizuin_;
            }

            public int getIdx() {
                return this.idx_;
            }

            public int getItemShowType() {
                return this.itemShowType_;
            }

            public int getItemStatus() {
                return this.itemStatus_;
            }

            public int getMsgid() {
                return this.msgid_;
            }

            public boolean hasBizuin() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasIdx() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasItemShowType() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasItemStatus() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasMsgid() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder(ContextItem contextItem) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(contextItem);
            }

            public static ContextItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (ContextItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static ContextItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static ContextItem parseFrom(C16994k kVar) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static ContextItem parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static ContextItem parseFrom(byte[] bArr) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static ContextItem parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static ContextItem parseFrom(InputStream inputStream) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static ContextItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static ContextItem parseFrom(C23856l lVar) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static ContextItem parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (ContextItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$InBoxResortContext$ContextItemOrBuilder */
        public interface ContextItemOrBuilder extends C23848k1 {
            int getBizuin();

            /* synthetic */ C23845j1 getDefaultInstanceForType();

            int getIdx();

            int getItemShowType();

            int getItemStatus();

            int getMsgid();

            boolean hasBizuin();

            boolean hasIdx();

            boolean hasItemShowType();

            boolean hasItemStatus();

            boolean hasMsgid();

            /* synthetic */ boolean isInitialized();
        }

        static {
            InBoxResortContext inBoxResortContext = new InBoxResortContext();
            DEFAULT_INSTANCE = inBoxResortContext;
            C23861l0.registerDefaultInstance(InBoxResortContext.class, inBoxResortContext);
        }

        private InBoxResortContext() {
        }

        /* access modifiers changed from: private */
        public void addAllItems(Iterable<? extends ContextItem> iterable) {
            ensureItemsIsMutable();
            C23810b.addAll(iterable, this.items_);
        }

        /* access modifiers changed from: private */
        public void addItems(ContextItem contextItem) {
            contextItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(contextItem);
        }

        /* access modifiers changed from: private */
        public void clearItems() {
            this.items_ = C23861l0.emptyProtobufList();
        }

        private void ensureItemsIsMutable() {
            C23908o0.C23919j<ContextItem> jVar = this.items_;
            if (!jVar.mo37523Q()) {
                this.items_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static InBoxResortContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static InBoxResortContext parseDelimitedFrom(InputStream inputStream) {
            return (InBoxResortContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InBoxResortContext parseFrom(ByteBuffer byteBuffer) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<InBoxResortContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setItems(int i, ContextItem contextItem) {
            contextItem.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, contextItem);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", ContextItem.class});
                case 3:
                    return new InBoxResortContext();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<InBoxResortContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (InBoxResortContext.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public ContextItem getItems(int i) {
            return this.items_.get(i);
        }

        public int getItemsCount() {
            return this.items_.size();
        }

        public List<ContextItem> getItemsList() {
            return this.items_;
        }

        public ContextItemOrBuilder getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public List<? extends ContextItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        public static Builder newBuilder(InBoxResortContext inBoxResortContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(inBoxResortContext);
        }

        public static InBoxResortContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (InBoxResortContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static InBoxResortContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static InBoxResortContext parseFrom(C16994k kVar) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addItems(int i, ContextItem contextItem) {
            contextItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, contextItem);
        }

        public static InBoxResortContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static InBoxResortContext parseFrom(byte[] bArr) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static InBoxResortContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static InBoxResortContext parseFrom(InputStream inputStream) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static InBoxResortContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static InBoxResortContext parseFrom(C23856l lVar) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static InBoxResortContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (InBoxResortContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$InBoxResortContextOrBuilder */
    public interface InBoxResortContextOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        InBoxResortContext.ContextItem getItems(int i);

        int getItemsCount();

        List<InBoxResortContext.ContextItem> getItemsList();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ItemStatus */
    public enum ItemStatus implements C23908o0.C23911c {
        ITEM_STATUS_IS_TRIGGER_ITEM(1),
        ITEM_STATUS_IS_CLICKED(2);
        
        public static final int ITEM_STATUS_IS_CLICKED_VALUE = 2;
        public static final int ITEM_STATUS_IS_TRIGGER_ITEM_VALUE = 1;
        private static final C23908o0.C23912d<ItemStatus> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ItemStatus$ItemStatusVerifier */
        public static final class ItemStatusVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new ItemStatusVerifier();
            }

            private ItemStatusVerifier() {
            }

            public boolean isInRange(int i) {
                return ItemStatus.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<ItemStatus>() {
                public ItemStatus findValueByNumber(int i) {
                    return ItemStatus.forNumber(i);
                }
            };
        }

        private ItemStatus(int i) {
            this.value = i;
        }

        public static ItemStatus forNumber(int i) {
            if (i == 1) {
                return ITEM_STATUS_IS_TRIGGER_ITEM;
            }
            if (i != 2) {
                return null;
            }
            return ITEM_STATUS_IS_CLICKED;
        }

        public static C23908o0.C23912d<ItemStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return ItemStatusVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ItemStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgBoxExposeInfo */
    public static final class MsgBoxExposeInfo extends C23861l0<MsgBoxExposeInfo, Builder> implements MsgBoxExposeInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final MsgBoxExposeInfo DEFAULT_INSTANCE;
        public static final int MSG_BOX_EXPOSE_DIGEST_FIELD_NUMBER = 2;
        public static final int MSG_BOX_EXPOSE_MSG_FIELD_NUMBER = 3;
        public static final int MSG_BOX_EXPOSE_POS_FIELD_NUMBER = 1;
        private static volatile C24062w1<MsgBoxExposeInfo> PARSER;
        private int bitField0_;
        private String msgBoxExposeDigest_ = "";
        private MsgCard msgBoxExposeMsg_;
        private int msgBoxExposePos_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgBoxExposeInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<MsgBoxExposeInfo, Builder> implements MsgBoxExposeInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearMsgBoxExposeDigest() {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).clearMsgBoxExposeDigest();
                return this;
            }

            public Builder clearMsgBoxExposeMsg() {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).clearMsgBoxExposeMsg();
                return this;
            }

            public Builder clearMsgBoxExposePos() {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).clearMsgBoxExposePos();
                return this;
            }

            public String getMsgBoxExposeDigest() {
                return ((MsgBoxExposeInfo) this.instance).getMsgBoxExposeDigest();
            }

            public C16994k getMsgBoxExposeDigestBytes() {
                return ((MsgBoxExposeInfo) this.instance).getMsgBoxExposeDigestBytes();
            }

            public MsgCard getMsgBoxExposeMsg() {
                return ((MsgBoxExposeInfo) this.instance).getMsgBoxExposeMsg();
            }

            public int getMsgBoxExposePos() {
                return ((MsgBoxExposeInfo) this.instance).getMsgBoxExposePos();
            }

            public boolean hasMsgBoxExposeDigest() {
                return ((MsgBoxExposeInfo) this.instance).hasMsgBoxExposeDigest();
            }

            public boolean hasMsgBoxExposeMsg() {
                return ((MsgBoxExposeInfo) this.instance).hasMsgBoxExposeMsg();
            }

            public boolean hasMsgBoxExposePos() {
                return ((MsgBoxExposeInfo) this.instance).hasMsgBoxExposePos();
            }

            public Builder mergeMsgBoxExposeMsg(MsgCard msgCard) {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).mergeMsgBoxExposeMsg(msgCard);
                return this;
            }

            public Builder setMsgBoxExposeDigest(String str) {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).setMsgBoxExposeDigest(str);
                return this;
            }

            public Builder setMsgBoxExposeDigestBytes(C16994k kVar) {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).setMsgBoxExposeDigestBytes(kVar);
                return this;
            }

            public Builder setMsgBoxExposeMsg(MsgCard msgCard) {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).setMsgBoxExposeMsg(msgCard);
                return this;
            }

            public Builder setMsgBoxExposePos(int i) {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).setMsgBoxExposePos(i);
                return this;
            }

            private Builder() {
                super(MsgBoxExposeInfo.DEFAULT_INSTANCE);
            }

            public Builder setMsgBoxExposeMsg(MsgCard.Builder builder) {
                copyOnWrite();
                ((MsgBoxExposeInfo) this.instance).setMsgBoxExposeMsg((MsgCard) builder.build());
                return this;
            }
        }

        static {
            MsgBoxExposeInfo msgBoxExposeInfo = new MsgBoxExposeInfo();
            DEFAULT_INSTANCE = msgBoxExposeInfo;
            C23861l0.registerDefaultInstance(MsgBoxExposeInfo.class, msgBoxExposeInfo);
        }

        private MsgBoxExposeInfo() {
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposeDigest() {
            this.bitField0_ &= -3;
            this.msgBoxExposeDigest_ = getDefaultInstance().getMsgBoxExposeDigest();
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposeMsg() {
            this.msgBoxExposeMsg_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposePos() {
            this.bitField0_ &= -2;
            this.msgBoxExposePos_ = 0;
        }

        public static MsgBoxExposeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeMsgBoxExposeMsg(MsgCard msgCard) {
            msgCard.getClass();
            MsgCard msgCard2 = this.msgBoxExposeMsg_;
            if (msgCard2 == null || msgCard2 == MsgCard.getDefaultInstance()) {
                this.msgBoxExposeMsg_ = msgCard;
            } else {
                this.msgBoxExposeMsg_ = (MsgCard) ((MsgCard.Builder) MsgCard.newBuilder(this.msgBoxExposeMsg_).mergeFrom(msgCard)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MsgBoxExposeInfo parseDelimitedFrom(InputStream inputStream) {
            return (MsgBoxExposeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgBoxExposeInfo parseFrom(ByteBuffer byteBuffer) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MsgBoxExposeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeDigest(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.msgBoxExposeDigest_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeDigestBytes(C16994k kVar) {
            this.msgBoxExposeDigest_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeMsg(MsgCard msgCard) {
            msgCard.getClass();
            this.msgBoxExposeMsg_ = msgCard;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposePos(int i) {
            this.bitField0_ |= 1;
            this.msgBoxExposePos_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "msgBoxExposePos_", "msgBoxExposeDigest_", "msgBoxExposeMsg_"});
                case 3:
                    return new MsgBoxExposeInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MsgBoxExposeInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MsgBoxExposeInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getMsgBoxExposeDigest() {
            return this.msgBoxExposeDigest_;
        }

        public C16994k getMsgBoxExposeDigestBytes() {
            return C16994k.m16791k(this.msgBoxExposeDigest_);
        }

        public MsgCard getMsgBoxExposeMsg() {
            MsgCard msgCard = this.msgBoxExposeMsg_;
            return msgCard == null ? MsgCard.getDefaultInstance() : msgCard;
        }

        public int getMsgBoxExposePos() {
            return this.msgBoxExposePos_;
        }

        public boolean hasMsgBoxExposeDigest() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgBoxExposeMsg() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMsgBoxExposePos() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MsgBoxExposeInfo msgBoxExposeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(msgBoxExposeInfo);
        }

        public static MsgBoxExposeInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgBoxExposeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgBoxExposeInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MsgBoxExposeInfo parseFrom(C16994k kVar) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static MsgBoxExposeInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MsgBoxExposeInfo parseFrom(byte[] bArr) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MsgBoxExposeInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MsgBoxExposeInfo parseFrom(InputStream inputStream) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgBoxExposeInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgBoxExposeInfo parseFrom(C23856l lVar) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MsgBoxExposeInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MsgBoxExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgBoxExposeInfoOrBuilder */
    public interface MsgBoxExposeInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getMsgBoxExposeDigest();

        C16994k getMsgBoxExposeDigestBytes();

        MsgCard getMsgBoxExposeMsg();

        int getMsgBoxExposePos();

        boolean hasMsgBoxExposeDigest();

        boolean hasMsgBoxExposeMsg();

        boolean hasMsgBoxExposePos();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCard */
    public static final class MsgCard extends C23861l0<MsgCard, Builder> implements MsgCardOrBuilder {
        public static final int AD_CARD_INFO_FIELD_NUMBER = 81;
        public static final int BIZUIN_FIELD_NUMBER = 31;
        public static final int BUFFER_FIELD_NUMBER = 6;
        public static final int CARD_TYPE_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final MsgCard DEFAULT_INSTANCE;
        public static final int DIGEST_CARD_INFO_FIELD_NUMBER = 11;
        public static final int DIGEST_EXPOSURE_INFO_FIELD_NUMBER = 8;
        public static final int EXPOSURE_INFO_FIELD_NUMBER = 9;
        public static final int EXTRA_DATA_FIELD_NUMBER = 61;
        public static final int INBOX_RESORT_CONTEXT_FIELD_NUMBER = 12;
        public static final int ITEM_SHOW_TYPE_FIELD_NUMBER = 5;
        public static final int LOCAL_ID_FIELD_NUMBER = 34;
        public static final int MAX_IDX_FIELD_NUMBER = 33;
        public static final int MSGID_FIELD_NUMBER = 32;
        public static final int MSG_STATUS_FIELD_NUMBER = 2;
        public static final int MSG_TYPE_FIELD_NUMBER = 1;
        private static volatile C24062w1<MsgCard> PARSER = null;
        public static final int PIC_TYPE_FIELD_NUMBER = 35;
        public static final int RECYCLE_CARD_TYPE_FIELD_NUMBER = 62;
        public static final int SEND_TIME_FIELD_NUMBER = 3;
        private BizTimeLineAdCardInfo adCardInfo_;
        private int bitField0_;
        private int bizuin_;
        private String buffer_ = "";
        private int cardType_;
        private DigestMsgCardInfo digestCardInfo_;
        private DigestExposureInfo digestExposureInfo_;
        private MsgCardExposureInfo exposureInfo_;
        private String extraData_ = "";
        private InBoxResortContext inboxResortContext_;
        private int itemShowType_;
        private long localId_;
        private int maxIdx_;
        private int msgStatus_;
        private int msgType_;
        private int msgid_;
        private int picType_;
        private int recycleCardType_;
        private int sendTime_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCard$Builder */
        public static final class Builder extends C23861l0.C23862a<MsgCard, Builder> implements MsgCardOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearAdCardInfo() {
                copyOnWrite();
                ((MsgCard) this.instance).clearAdCardInfo();
                return this;
            }

            public Builder clearBizuin() {
                copyOnWrite();
                ((MsgCard) this.instance).clearBizuin();
                return this;
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((MsgCard) this.instance).clearBuffer();
                return this;
            }

            public Builder clearCardType() {
                copyOnWrite();
                ((MsgCard) this.instance).clearCardType();
                return this;
            }

            public Builder clearDigestCardInfo() {
                copyOnWrite();
                ((MsgCard) this.instance).clearDigestCardInfo();
                return this;
            }

            public Builder clearDigestExposureInfo() {
                copyOnWrite();
                ((MsgCard) this.instance).clearDigestExposureInfo();
                return this;
            }

            public Builder clearExposureInfo() {
                copyOnWrite();
                ((MsgCard) this.instance).clearExposureInfo();
                return this;
            }

            public Builder clearExtraData() {
                copyOnWrite();
                ((MsgCard) this.instance).clearExtraData();
                return this;
            }

            public Builder clearInboxResortContext() {
                copyOnWrite();
                ((MsgCard) this.instance).clearInboxResortContext();
                return this;
            }

            public Builder clearItemShowType() {
                copyOnWrite();
                ((MsgCard) this.instance).clearItemShowType();
                return this;
            }

            public Builder clearLocalId() {
                copyOnWrite();
                ((MsgCard) this.instance).clearLocalId();
                return this;
            }

            public Builder clearMaxIdx() {
                copyOnWrite();
                ((MsgCard) this.instance).clearMaxIdx();
                return this;
            }

            public Builder clearMsgStatus() {
                copyOnWrite();
                ((MsgCard) this.instance).clearMsgStatus();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((MsgCard) this.instance).clearMsgType();
                return this;
            }

            public Builder clearMsgid() {
                copyOnWrite();
                ((MsgCard) this.instance).clearMsgid();
                return this;
            }

            public Builder clearPicType() {
                copyOnWrite();
                ((MsgCard) this.instance).clearPicType();
                return this;
            }

            public Builder clearRecycleCardType() {
                copyOnWrite();
                ((MsgCard) this.instance).clearRecycleCardType();
                return this;
            }

            public Builder clearSendTime() {
                copyOnWrite();
                ((MsgCard) this.instance).clearSendTime();
                return this;
            }

            public BizTimeLineAdCardInfo getAdCardInfo() {
                return ((MsgCard) this.instance).getAdCardInfo();
            }

            public int getBizuin() {
                return ((MsgCard) this.instance).getBizuin();
            }

            public String getBuffer() {
                return ((MsgCard) this.instance).getBuffer();
            }

            public C16994k getBufferBytes() {
                return ((MsgCard) this.instance).getBufferBytes();
            }

            public int getCardType() {
                return ((MsgCard) this.instance).getCardType();
            }

            public DigestMsgCardInfo getDigestCardInfo() {
                return ((MsgCard) this.instance).getDigestCardInfo();
            }

            public DigestExposureInfo getDigestExposureInfo() {
                return ((MsgCard) this.instance).getDigestExposureInfo();
            }

            public MsgCardExposureInfo getExposureInfo() {
                return ((MsgCard) this.instance).getExposureInfo();
            }

            public String getExtraData() {
                return ((MsgCard) this.instance).getExtraData();
            }

            public C16994k getExtraDataBytes() {
                return ((MsgCard) this.instance).getExtraDataBytes();
            }

            public InBoxResortContext getInboxResortContext() {
                return ((MsgCard) this.instance).getInboxResortContext();
            }

            public int getItemShowType() {
                return ((MsgCard) this.instance).getItemShowType();
            }

            public long getLocalId() {
                return ((MsgCard) this.instance).getLocalId();
            }

            public int getMaxIdx() {
                return ((MsgCard) this.instance).getMaxIdx();
            }

            public int getMsgStatus() {
                return ((MsgCard) this.instance).getMsgStatus();
            }

            public int getMsgType() {
                return ((MsgCard) this.instance).getMsgType();
            }

            public int getMsgid() {
                return ((MsgCard) this.instance).getMsgid();
            }

            public int getPicType() {
                return ((MsgCard) this.instance).getPicType();
            }

            public int getRecycleCardType() {
                return ((MsgCard) this.instance).getRecycleCardType();
            }

            public int getSendTime() {
                return ((MsgCard) this.instance).getSendTime();
            }

            public boolean hasAdCardInfo() {
                return ((MsgCard) this.instance).hasAdCardInfo();
            }

            public boolean hasBizuin() {
                return ((MsgCard) this.instance).hasBizuin();
            }

            public boolean hasBuffer() {
                return ((MsgCard) this.instance).hasBuffer();
            }

            public boolean hasCardType() {
                return ((MsgCard) this.instance).hasCardType();
            }

            public boolean hasDigestCardInfo() {
                return ((MsgCard) this.instance).hasDigestCardInfo();
            }

            public boolean hasDigestExposureInfo() {
                return ((MsgCard) this.instance).hasDigestExposureInfo();
            }

            public boolean hasExposureInfo() {
                return ((MsgCard) this.instance).hasExposureInfo();
            }

            public boolean hasExtraData() {
                return ((MsgCard) this.instance).hasExtraData();
            }

            public boolean hasInboxResortContext() {
                return ((MsgCard) this.instance).hasInboxResortContext();
            }

            public boolean hasItemShowType() {
                return ((MsgCard) this.instance).hasItemShowType();
            }

            public boolean hasLocalId() {
                return ((MsgCard) this.instance).hasLocalId();
            }

            public boolean hasMaxIdx() {
                return ((MsgCard) this.instance).hasMaxIdx();
            }

            public boolean hasMsgStatus() {
                return ((MsgCard) this.instance).hasMsgStatus();
            }

            public boolean hasMsgType() {
                return ((MsgCard) this.instance).hasMsgType();
            }

            public boolean hasMsgid() {
                return ((MsgCard) this.instance).hasMsgid();
            }

            public boolean hasPicType() {
                return ((MsgCard) this.instance).hasPicType();
            }

            public boolean hasRecycleCardType() {
                return ((MsgCard) this.instance).hasRecycleCardType();
            }

            public boolean hasSendTime() {
                return ((MsgCard) this.instance).hasSendTime();
            }

            public Builder mergeAdCardInfo(BizTimeLineAdCardInfo bizTimeLineAdCardInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).mergeAdCardInfo(bizTimeLineAdCardInfo);
                return this;
            }

            public Builder mergeDigestCardInfo(DigestMsgCardInfo digestMsgCardInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).mergeDigestCardInfo(digestMsgCardInfo);
                return this;
            }

            public Builder mergeDigestExposureInfo(DigestExposureInfo digestExposureInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).mergeDigestExposureInfo(digestExposureInfo);
                return this;
            }

            public Builder mergeExposureInfo(MsgCardExposureInfo msgCardExposureInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).mergeExposureInfo(msgCardExposureInfo);
                return this;
            }

            public Builder mergeInboxResortContext(InBoxResortContext inBoxResortContext) {
                copyOnWrite();
                ((MsgCard) this.instance).mergeInboxResortContext(inBoxResortContext);
                return this;
            }

            public Builder setAdCardInfo(BizTimeLineAdCardInfo bizTimeLineAdCardInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).setAdCardInfo(bizTimeLineAdCardInfo);
                return this;
            }

            public Builder setBizuin(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setBizuin(i);
                return this;
            }

            public Builder setBuffer(String str) {
                copyOnWrite();
                ((MsgCard) this.instance).setBuffer(str);
                return this;
            }

            public Builder setBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((MsgCard) this.instance).setBufferBytes(kVar);
                return this;
            }

            public Builder setCardType(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setCardType(i);
                return this;
            }

            public Builder setDigestCardInfo(DigestMsgCardInfo digestMsgCardInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).setDigestCardInfo(digestMsgCardInfo);
                return this;
            }

            public Builder setDigestExposureInfo(DigestExposureInfo digestExposureInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).setDigestExposureInfo(digestExposureInfo);
                return this;
            }

            public Builder setExposureInfo(MsgCardExposureInfo msgCardExposureInfo) {
                copyOnWrite();
                ((MsgCard) this.instance).setExposureInfo(msgCardExposureInfo);
                return this;
            }

            public Builder setExtraData(String str) {
                copyOnWrite();
                ((MsgCard) this.instance).setExtraData(str);
                return this;
            }

            public Builder setExtraDataBytes(C16994k kVar) {
                copyOnWrite();
                ((MsgCard) this.instance).setExtraDataBytes(kVar);
                return this;
            }

            public Builder setInboxResortContext(InBoxResortContext inBoxResortContext) {
                copyOnWrite();
                ((MsgCard) this.instance).setInboxResortContext(inBoxResortContext);
                return this;
            }

            public Builder setItemShowType(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setItemShowType(i);
                return this;
            }

            public Builder setLocalId(long j) {
                copyOnWrite();
                ((MsgCard) this.instance).setLocalId(j);
                return this;
            }

            public Builder setMaxIdx(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setMaxIdx(i);
                return this;
            }

            public Builder setMsgStatus(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setMsgStatus(i);
                return this;
            }

            public Builder setMsgType(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setMsgType(i);
                return this;
            }

            public Builder setMsgid(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setMsgid(i);
                return this;
            }

            public Builder setPicType(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setPicType(i);
                return this;
            }

            public Builder setRecycleCardType(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setRecycleCardType(i);
                return this;
            }

            public Builder setSendTime(int i) {
                copyOnWrite();
                ((MsgCard) this.instance).setSendTime(i);
                return this;
            }

            private Builder() {
                super(MsgCard.DEFAULT_INSTANCE);
            }

            public Builder setAdCardInfo(BizTimeLineAdCardInfo.Builder builder) {
                copyOnWrite();
                ((MsgCard) this.instance).setAdCardInfo((BizTimeLineAdCardInfo) builder.build());
                return this;
            }

            public Builder setDigestCardInfo(DigestMsgCardInfo.Builder builder) {
                copyOnWrite();
                ((MsgCard) this.instance).setDigestCardInfo((DigestMsgCardInfo) builder.build());
                return this;
            }

            public Builder setDigestExposureInfo(DigestExposureInfo.Builder builder) {
                copyOnWrite();
                ((MsgCard) this.instance).setDigestExposureInfo((DigestExposureInfo) builder.build());
                return this;
            }

            public Builder setExposureInfo(MsgCardExposureInfo.Builder builder) {
                copyOnWrite();
                ((MsgCard) this.instance).setExposureInfo((MsgCardExposureInfo) builder.build());
                return this;
            }

            public Builder setInboxResortContext(InBoxResortContext.Builder builder) {
                copyOnWrite();
                ((MsgCard) this.instance).setInboxResortContext((InBoxResortContext) builder.build());
                return this;
            }
        }

        static {
            MsgCard msgCard = new MsgCard();
            DEFAULT_INSTANCE = msgCard;
            C23861l0.registerDefaultInstance(MsgCard.class, msgCard);
        }

        private MsgCard() {
        }

        /* access modifiers changed from: private */
        public void clearAdCardInfo() {
            this.adCardInfo_ = null;
            this.bitField0_ &= -131073;
        }

        /* access modifiers changed from: private */
        public void clearBizuin() {
            this.bitField0_ &= -1025;
            this.bizuin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -17;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearCardType() {
            this.bitField0_ &= -33;
            this.cardType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDigestCardInfo() {
            this.digestCardInfo_ = null;
            this.bitField0_ &= -257;
        }

        /* access modifiers changed from: private */
        public void clearDigestExposureInfo() {
            this.digestExposureInfo_ = null;
            this.bitField0_ &= -65;
        }

        /* access modifiers changed from: private */
        public void clearExposureInfo() {
            this.exposureInfo_ = null;
            this.bitField0_ &= -129;
        }

        /* access modifiers changed from: private */
        public void clearExtraData() {
            this.bitField0_ &= -32769;
            this.extraData_ = getDefaultInstance().getExtraData();
        }

        /* access modifiers changed from: private */
        public void clearInboxResortContext() {
            this.inboxResortContext_ = null;
            this.bitField0_ &= -513;
        }

        /* access modifiers changed from: private */
        public void clearItemShowType() {
            this.bitField0_ &= -9;
            this.itemShowType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLocalId() {
            this.bitField0_ &= -8193;
            this.localId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMaxIdx() {
            this.bitField0_ &= -4097;
            this.maxIdx_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgStatus() {
            this.bitField0_ &= -3;
            this.msgStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgType() {
            this.bitField0_ &= -2;
            this.msgType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgid() {
            this.bitField0_ &= -2049;
            this.msgid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPicType() {
            this.bitField0_ &= -16385;
            this.picType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecycleCardType() {
            this.bitField0_ &= -65537;
            this.recycleCardType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSendTime() {
            this.bitField0_ &= -5;
            this.sendTime_ = 0;
        }

        public static MsgCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAdCardInfo(BizTimeLineAdCardInfo bizTimeLineAdCardInfo) {
            bizTimeLineAdCardInfo.getClass();
            BizTimeLineAdCardInfo bizTimeLineAdCardInfo2 = this.adCardInfo_;
            if (bizTimeLineAdCardInfo2 == null || bizTimeLineAdCardInfo2 == BizTimeLineAdCardInfo.getDefaultInstance()) {
                this.adCardInfo_ = bizTimeLineAdCardInfo;
            } else {
                this.adCardInfo_ = (BizTimeLineAdCardInfo) ((BizTimeLineAdCardInfo.Builder) BizTimeLineAdCardInfo.newBuilder(this.adCardInfo_).mergeFrom(bizTimeLineAdCardInfo)).buildPartial();
            }
            this.bitField0_ |= 131072;
        }

        /* access modifiers changed from: private */
        public void mergeDigestCardInfo(DigestMsgCardInfo digestMsgCardInfo) {
            digestMsgCardInfo.getClass();
            DigestMsgCardInfo digestMsgCardInfo2 = this.digestCardInfo_;
            if (digestMsgCardInfo2 == null || digestMsgCardInfo2 == DigestMsgCardInfo.getDefaultInstance()) {
                this.digestCardInfo_ = digestMsgCardInfo;
            } else {
                this.digestCardInfo_ = (DigestMsgCardInfo) ((DigestMsgCardInfo.Builder) DigestMsgCardInfo.newBuilder(this.digestCardInfo_).mergeFrom(digestMsgCardInfo)).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void mergeDigestExposureInfo(DigestExposureInfo digestExposureInfo) {
            digestExposureInfo.getClass();
            DigestExposureInfo digestExposureInfo2 = this.digestExposureInfo_;
            if (digestExposureInfo2 == null || digestExposureInfo2 == DigestExposureInfo.getDefaultInstance()) {
                this.digestExposureInfo_ = digestExposureInfo;
            } else {
                this.digestExposureInfo_ = (DigestExposureInfo) ((DigestExposureInfo.Builder) DigestExposureInfo.newBuilder(this.digestExposureInfo_).mergeFrom(digestExposureInfo)).buildPartial();
            }
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void mergeExposureInfo(MsgCardExposureInfo msgCardExposureInfo) {
            msgCardExposureInfo.getClass();
            MsgCardExposureInfo msgCardExposureInfo2 = this.exposureInfo_;
            if (msgCardExposureInfo2 == null || msgCardExposureInfo2 == MsgCardExposureInfo.getDefaultInstance()) {
                this.exposureInfo_ = msgCardExposureInfo;
            } else {
                this.exposureInfo_ = (MsgCardExposureInfo) ((MsgCardExposureInfo.Builder) MsgCardExposureInfo.newBuilder(this.exposureInfo_).mergeFrom(msgCardExposureInfo)).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void mergeInboxResortContext(InBoxResortContext inBoxResortContext) {
            inBoxResortContext.getClass();
            InBoxResortContext inBoxResortContext2 = this.inboxResortContext_;
            if (inBoxResortContext2 == null || inBoxResortContext2 == InBoxResortContext.getDefaultInstance()) {
                this.inboxResortContext_ = inBoxResortContext;
            } else {
                this.inboxResortContext_ = (InBoxResortContext) ((InBoxResortContext.Builder) InBoxResortContext.newBuilder(this.inboxResortContext_).mergeFrom(inBoxResortContext)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MsgCard parseDelimitedFrom(InputStream inputStream) {
            return (MsgCard) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgCard parseFrom(ByteBuffer byteBuffer) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MsgCard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAdCardInfo(BizTimeLineAdCardInfo bizTimeLineAdCardInfo) {
            bizTimeLineAdCardInfo.getClass();
            this.adCardInfo_ = bizTimeLineAdCardInfo;
            this.bitField0_ |= 131072;
        }

        /* access modifiers changed from: private */
        public void setBizuin(int i) {
            this.bitField0_ |= 1024;
            this.bizuin_ = i;
        }

        /* access modifiers changed from: private */
        public void setBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.buffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setBufferBytes(C16994k kVar) {
            this.buffer_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setCardType(int i) {
            this.bitField0_ |= 32;
            this.cardType_ = i;
        }

        /* access modifiers changed from: private */
        public void setDigestCardInfo(DigestMsgCardInfo digestMsgCardInfo) {
            digestMsgCardInfo.getClass();
            this.digestCardInfo_ = digestMsgCardInfo;
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setDigestExposureInfo(DigestExposureInfo digestExposureInfo) {
            digestExposureInfo.getClass();
            this.digestExposureInfo_ = digestExposureInfo;
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setExposureInfo(MsgCardExposureInfo msgCardExposureInfo) {
            msgCardExposureInfo.getClass();
            this.exposureInfo_ = msgCardExposureInfo;
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setExtraData(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.extraData_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtraDataBytes(C16994k kVar) {
            this.extraData_ = kVar.mo18752u();
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setInboxResortContext(InBoxResortContext inBoxResortContext) {
            inBoxResortContext.getClass();
            this.inboxResortContext_ = inBoxResortContext;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setItemShowType(int i) {
            this.bitField0_ |= 8;
            this.itemShowType_ = i;
        }

        /* access modifiers changed from: private */
        public void setLocalId(long j) {
            this.bitField0_ |= 8192;
            this.localId_ = j;
        }

        /* access modifiers changed from: private */
        public void setMaxIdx(int i) {
            this.bitField0_ |= 4096;
            this.maxIdx_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgStatus(int i) {
            this.bitField0_ |= 2;
            this.msgStatus_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgType(int i) {
            this.bitField0_ |= 1;
            this.msgType_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgid(int i) {
            this.bitField0_ |= 2048;
            this.msgid_ = i;
        }

        /* access modifiers changed from: private */
        public void setPicType(int i) {
            this.bitField0_ |= 16384;
            this.picType_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecycleCardType(int i) {
            this.bitField0_ |= 65536;
            this.recycleCardType_ = i;
        }

        /* access modifiers changed from: private */
        public void setSendTime(int i) {
            this.bitField0_ |= 4;
            this.sendTime_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0012\u0000\u0001\u0001Q\u0012\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0005ဋ\u0003\u0006ဈ\u0004\u0007ဋ\u0005\bဉ\u0006\tဉ\u0007\u000bဉ\b\fဉ\t\u001fဋ\n ဋ\u000b!ဋ\f\"ဃ\r#ဋ\u000e=ဈ\u000f>ဋ\u0010Qဉ\u0011", new Object[]{"bitField0_", "msgType_", "msgStatus_", "sendTime_", "itemShowType_", "buffer_", "cardType_", "digestExposureInfo_", "exposureInfo_", "digestCardInfo_", "inboxResortContext_", "bizuin_", "msgid_", "maxIdx_", "localId_", "picType_", "extraData_", "recycleCardType_", "adCardInfo_"});
                case 3:
                    return new MsgCard();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MsgCard> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MsgCard.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public BizTimeLineAdCardInfo getAdCardInfo() {
            BizTimeLineAdCardInfo bizTimeLineAdCardInfo = this.adCardInfo_;
            return bizTimeLineAdCardInfo == null ? BizTimeLineAdCardInfo.getDefaultInstance() : bizTimeLineAdCardInfo;
        }

        public int getBizuin() {
            return this.bizuin_;
        }

        public String getBuffer() {
            return this.buffer_;
        }

        public C16994k getBufferBytes() {
            return C16994k.m16791k(this.buffer_);
        }

        public int getCardType() {
            return this.cardType_;
        }

        public DigestMsgCardInfo getDigestCardInfo() {
            DigestMsgCardInfo digestMsgCardInfo = this.digestCardInfo_;
            return digestMsgCardInfo == null ? DigestMsgCardInfo.getDefaultInstance() : digestMsgCardInfo;
        }

        public DigestExposureInfo getDigestExposureInfo() {
            DigestExposureInfo digestExposureInfo = this.digestExposureInfo_;
            return digestExposureInfo == null ? DigestExposureInfo.getDefaultInstance() : digestExposureInfo;
        }

        public MsgCardExposureInfo getExposureInfo() {
            MsgCardExposureInfo msgCardExposureInfo = this.exposureInfo_;
            return msgCardExposureInfo == null ? MsgCardExposureInfo.getDefaultInstance() : msgCardExposureInfo;
        }

        public String getExtraData() {
            return this.extraData_;
        }

        public C16994k getExtraDataBytes() {
            return C16994k.m16791k(this.extraData_);
        }

        public InBoxResortContext getInboxResortContext() {
            InBoxResortContext inBoxResortContext = this.inboxResortContext_;
            return inBoxResortContext == null ? InBoxResortContext.getDefaultInstance() : inBoxResortContext;
        }

        public int getItemShowType() {
            return this.itemShowType_;
        }

        public long getLocalId() {
            return this.localId_;
        }

        public int getMaxIdx() {
            return this.maxIdx_;
        }

        public int getMsgStatus() {
            return this.msgStatus_;
        }

        public int getMsgType() {
            return this.msgType_;
        }

        public int getMsgid() {
            return this.msgid_;
        }

        public int getPicType() {
            return this.picType_;
        }

        public int getRecycleCardType() {
            return this.recycleCardType_;
        }

        public int getSendTime() {
            return this.sendTime_;
        }

        public boolean hasAdCardInfo() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasBizuin() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCardType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDigestCardInfo() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDigestExposureInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasExposureInfo() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasExtraData() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasInboxResortContext() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasItemShowType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasLocalId() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasMaxIdx() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasMsgStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMsgid() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasPicType() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasRecycleCardType() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasSendTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(MsgCard msgCard) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(msgCard);
        }

        public static MsgCard parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgCard) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgCard parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MsgCard parseFrom(C16994k kVar) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static MsgCard parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MsgCard parseFrom(byte[] bArr) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MsgCard parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MsgCard parseFrom(InputStream inputStream) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgCard parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgCard parseFrom(C23856l lVar) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MsgCard parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardExposureInfo */
    public static final class MsgCardExposureInfo extends C23861l0<MsgCardExposureInfo, Builder> implements MsgCardExposureInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final MsgCardExposureInfo DEFAULT_INSTANCE;
        public static final int EXPOSURE_AREA_RATIO_FIELD_NUMBER = 2;
        public static final int EXPOSURE_CNT_FIELD_NUMBER = 1;
        private static volatile C24062w1<MsgCardExposureInfo> PARSER;
        private int bitField0_;
        private int exposureAreaRatio_;
        private int exposureCnt_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardExposureInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<MsgCardExposureInfo, Builder> implements MsgCardExposureInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearExposureAreaRatio() {
                copyOnWrite();
                ((MsgCardExposureInfo) this.instance).clearExposureAreaRatio();
                return this;
            }

            public Builder clearExposureCnt() {
                copyOnWrite();
                ((MsgCardExposureInfo) this.instance).clearExposureCnt();
                return this;
            }

            public int getExposureAreaRatio() {
                return ((MsgCardExposureInfo) this.instance).getExposureAreaRatio();
            }

            public int getExposureCnt() {
                return ((MsgCardExposureInfo) this.instance).getExposureCnt();
            }

            public boolean hasExposureAreaRatio() {
                return ((MsgCardExposureInfo) this.instance).hasExposureAreaRatio();
            }

            public boolean hasExposureCnt() {
                return ((MsgCardExposureInfo) this.instance).hasExposureCnt();
            }

            public Builder setExposureAreaRatio(int i) {
                copyOnWrite();
                ((MsgCardExposureInfo) this.instance).setExposureAreaRatio(i);
                return this;
            }

            public Builder setExposureCnt(int i) {
                copyOnWrite();
                ((MsgCardExposureInfo) this.instance).setExposureCnt(i);
                return this;
            }

            private Builder() {
                super(MsgCardExposureInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            MsgCardExposureInfo msgCardExposureInfo = new MsgCardExposureInfo();
            DEFAULT_INSTANCE = msgCardExposureInfo;
            C23861l0.registerDefaultInstance(MsgCardExposureInfo.class, msgCardExposureInfo);
        }

        private MsgCardExposureInfo() {
        }

        /* access modifiers changed from: private */
        public void clearExposureAreaRatio() {
            this.bitField0_ &= -3;
            this.exposureAreaRatio_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExposureCnt() {
            this.bitField0_ &= -2;
            this.exposureCnt_ = 0;
        }

        public static MsgCardExposureInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MsgCardExposureInfo parseDelimitedFrom(InputStream inputStream) {
            return (MsgCardExposureInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgCardExposureInfo parseFrom(ByteBuffer byteBuffer) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MsgCardExposureInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setExposureAreaRatio(int i) {
            this.bitField0_ |= 2;
            this.exposureAreaRatio_ = i;
        }

        /* access modifiers changed from: private */
        public void setExposureCnt(int i) {
            this.bitField0_ |= 1;
            this.exposureCnt_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "exposureCnt_", "exposureAreaRatio_"});
                case 3:
                    return new MsgCardExposureInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MsgCardExposureInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MsgCardExposureInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getExposureAreaRatio() {
            return this.exposureAreaRatio_;
        }

        public int getExposureCnt() {
            return this.exposureCnt_;
        }

        public boolean hasExposureAreaRatio() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasExposureCnt() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MsgCardExposureInfo msgCardExposureInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(msgCardExposureInfo);
        }

        public static MsgCardExposureInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgCardExposureInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgCardExposureInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MsgCardExposureInfo parseFrom(C16994k kVar) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static MsgCardExposureInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MsgCardExposureInfo parseFrom(byte[] bArr) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MsgCardExposureInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MsgCardExposureInfo parseFrom(InputStream inputStream) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgCardExposureInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgCardExposureInfo parseFrom(C23856l lVar) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MsgCardExposureInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MsgCardExposureInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardExposureInfoOrBuilder */
    public interface MsgCardExposureInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getExposureAreaRatio();

        int getExposureCnt();

        boolean hasExposureAreaRatio();

        boolean hasExposureCnt();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardOrBuilder */
    public interface MsgCardOrBuilder extends C23848k1 {
        BizTimeLineAdCardInfo getAdCardInfo();

        int getBizuin();

        String getBuffer();

        C16994k getBufferBytes();

        int getCardType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        DigestMsgCardInfo getDigestCardInfo();

        DigestExposureInfo getDigestExposureInfo();

        MsgCardExposureInfo getExposureInfo();

        String getExtraData();

        C16994k getExtraDataBytes();

        InBoxResortContext getInboxResortContext();

        int getItemShowType();

        long getLocalId();

        int getMaxIdx();

        int getMsgStatus();

        int getMsgType();

        int getMsgid();

        int getPicType();

        int getRecycleCardType();

        int getSendTime();

        boolean hasAdCardInfo();

        boolean hasBizuin();

        boolean hasBuffer();

        boolean hasCardType();

        boolean hasDigestCardInfo();

        boolean hasDigestExposureInfo();

        boolean hasExposureInfo();

        boolean hasExtraData();

        boolean hasInboxResortContext();

        boolean hasItemShowType();

        boolean hasLocalId();

        boolean hasMaxIdx();

        boolean hasMsgStatus();

        boolean hasMsgType();

        boolean hasMsgid();

        boolean hasPicType();

        boolean hasRecycleCardType();

        boolean hasSendTime();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardReSortV2Config */
    public static final class MsgCardReSortV2Config extends C23861l0<MsgCardReSortV2Config, Builder> implements MsgCardReSortV2ConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final MsgCardReSortV2Config DEFAULT_INSTANCE;
        public static final int ENTER_BOX_REQUIRE_BUFFER_CNT_FIELD_NUMBER = 3;
        public static final int FORCE_INSERT_AD_POS_FIELD_NUMBER = 6;
        public static final int INBOX_RESORT_CONTEXT_CNT_FIELD_NUMBER = 5;
        private static volatile C24062w1<MsgCardReSortV2Config> PARSER = null;
        public static final int PULL_FEEDS_PRELOAD_BUFFER_CNT_FIELD_NUMBER = 4;
        public static final int REQUIRE_PRE_CARD_CNT_FIELD_NUMBER = 1;
        public static final int REQUIRE_REMAIN_CARD_CNT_FIELD_NUMBER = 2;
        private int bitField0_;
        private int enterBoxRequireBufferCnt_;
        private int forceInsertAdPos_ = -1;
        private int inboxResortContextCnt_;
        private int pullFeedsPreloadBufferCnt_;
        private int requirePreCardCnt_;
        private int requireRemainCardCnt_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardReSortV2Config$Builder */
        public static final class Builder extends C23861l0.C23862a<MsgCardReSortV2Config, Builder> implements MsgCardReSortV2ConfigOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearEnterBoxRequireBufferCnt() {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).clearEnterBoxRequireBufferCnt();
                return this;
            }

            public Builder clearForceInsertAdPos() {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).clearForceInsertAdPos();
                return this;
            }

            public Builder clearInboxResortContextCnt() {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).clearInboxResortContextCnt();
                return this;
            }

            public Builder clearPullFeedsPreloadBufferCnt() {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).clearPullFeedsPreloadBufferCnt();
                return this;
            }

            public Builder clearRequirePreCardCnt() {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).clearRequirePreCardCnt();
                return this;
            }

            public Builder clearRequireRemainCardCnt() {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).clearRequireRemainCardCnt();
                return this;
            }

            public int getEnterBoxRequireBufferCnt() {
                return ((MsgCardReSortV2Config) this.instance).getEnterBoxRequireBufferCnt();
            }

            public int getForceInsertAdPos() {
                return ((MsgCardReSortV2Config) this.instance).getForceInsertAdPos();
            }

            public int getInboxResortContextCnt() {
                return ((MsgCardReSortV2Config) this.instance).getInboxResortContextCnt();
            }

            public int getPullFeedsPreloadBufferCnt() {
                return ((MsgCardReSortV2Config) this.instance).getPullFeedsPreloadBufferCnt();
            }

            public int getRequirePreCardCnt() {
                return ((MsgCardReSortV2Config) this.instance).getRequirePreCardCnt();
            }

            public int getRequireRemainCardCnt() {
                return ((MsgCardReSortV2Config) this.instance).getRequireRemainCardCnt();
            }

            public boolean hasEnterBoxRequireBufferCnt() {
                return ((MsgCardReSortV2Config) this.instance).hasEnterBoxRequireBufferCnt();
            }

            public boolean hasForceInsertAdPos() {
                return ((MsgCardReSortV2Config) this.instance).hasForceInsertAdPos();
            }

            public boolean hasInboxResortContextCnt() {
                return ((MsgCardReSortV2Config) this.instance).hasInboxResortContextCnt();
            }

            public boolean hasPullFeedsPreloadBufferCnt() {
                return ((MsgCardReSortV2Config) this.instance).hasPullFeedsPreloadBufferCnt();
            }

            public boolean hasRequirePreCardCnt() {
                return ((MsgCardReSortV2Config) this.instance).hasRequirePreCardCnt();
            }

            public boolean hasRequireRemainCardCnt() {
                return ((MsgCardReSortV2Config) this.instance).hasRequireRemainCardCnt();
            }

            public Builder setEnterBoxRequireBufferCnt(int i) {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).setEnterBoxRequireBufferCnt(i);
                return this;
            }

            public Builder setForceInsertAdPos(int i) {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).setForceInsertAdPos(i);
                return this;
            }

            public Builder setInboxResortContextCnt(int i) {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).setInboxResortContextCnt(i);
                return this;
            }

            public Builder setPullFeedsPreloadBufferCnt(int i) {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).setPullFeedsPreloadBufferCnt(i);
                return this;
            }

            public Builder setRequirePreCardCnt(int i) {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).setRequirePreCardCnt(i);
                return this;
            }

            public Builder setRequireRemainCardCnt(int i) {
                copyOnWrite();
                ((MsgCardReSortV2Config) this.instance).setRequireRemainCardCnt(i);
                return this;
            }

            private Builder() {
                super(MsgCardReSortV2Config.DEFAULT_INSTANCE);
            }
        }

        static {
            MsgCardReSortV2Config msgCardReSortV2Config = new MsgCardReSortV2Config();
            DEFAULT_INSTANCE = msgCardReSortV2Config;
            C23861l0.registerDefaultInstance(MsgCardReSortV2Config.class, msgCardReSortV2Config);
        }

        private MsgCardReSortV2Config() {
        }

        /* access modifiers changed from: private */
        public void clearEnterBoxRequireBufferCnt() {
            this.bitField0_ &= -5;
            this.enterBoxRequireBufferCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearForceInsertAdPos() {
            this.bitField0_ &= -33;
            this.forceInsertAdPos_ = -1;
        }

        /* access modifiers changed from: private */
        public void clearInboxResortContextCnt() {
            this.bitField0_ &= -17;
            this.inboxResortContextCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPullFeedsPreloadBufferCnt() {
            this.bitField0_ &= -9;
            this.pullFeedsPreloadBufferCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRequirePreCardCnt() {
            this.bitField0_ &= -2;
            this.requirePreCardCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRequireRemainCardCnt() {
            this.bitField0_ &= -3;
            this.requireRemainCardCnt_ = 0;
        }

        public static MsgCardReSortV2Config getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MsgCardReSortV2Config parseDelimitedFrom(InputStream inputStream) {
            return (MsgCardReSortV2Config) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgCardReSortV2Config parseFrom(ByteBuffer byteBuffer) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MsgCardReSortV2Config> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEnterBoxRequireBufferCnt(int i) {
            this.bitField0_ |= 4;
            this.enterBoxRequireBufferCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setForceInsertAdPos(int i) {
            this.bitField0_ |= 32;
            this.forceInsertAdPos_ = i;
        }

        /* access modifiers changed from: private */
        public void setInboxResortContextCnt(int i) {
            this.bitField0_ |= 16;
            this.inboxResortContextCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setPullFeedsPreloadBufferCnt(int i) {
            this.bitField0_ |= 8;
            this.pullFeedsPreloadBufferCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setRequirePreCardCnt(int i) {
            this.bitField0_ |= 1;
            this.requirePreCardCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setRequireRemainCardCnt(int i) {
            this.bitField0_ |= 2;
            this.requireRemainCardCnt_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006င\u0005", new Object[]{"bitField0_", "requirePreCardCnt_", "requireRemainCardCnt_", "enterBoxRequireBufferCnt_", "pullFeedsPreloadBufferCnt_", "inboxResortContextCnt_", "forceInsertAdPos_"});
                case 3:
                    return new MsgCardReSortV2Config();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MsgCardReSortV2Config> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MsgCardReSortV2Config.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getEnterBoxRequireBufferCnt() {
            return this.enterBoxRequireBufferCnt_;
        }

        public int getForceInsertAdPos() {
            return this.forceInsertAdPos_;
        }

        public int getInboxResortContextCnt() {
            return this.inboxResortContextCnt_;
        }

        public int getPullFeedsPreloadBufferCnt() {
            return this.pullFeedsPreloadBufferCnt_;
        }

        public int getRequirePreCardCnt() {
            return this.requirePreCardCnt_;
        }

        public int getRequireRemainCardCnt() {
            return this.requireRemainCardCnt_;
        }

        public boolean hasEnterBoxRequireBufferCnt() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasForceInsertAdPos() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasInboxResortContextCnt() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPullFeedsPreloadBufferCnt() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRequirePreCardCnt() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasRequireRemainCardCnt() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(MsgCardReSortV2Config msgCardReSortV2Config) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(msgCardReSortV2Config);
        }

        public static MsgCardReSortV2Config parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgCardReSortV2Config) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgCardReSortV2Config parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MsgCardReSortV2Config parseFrom(C16994k kVar) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static MsgCardReSortV2Config parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MsgCardReSortV2Config parseFrom(byte[] bArr) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MsgCardReSortV2Config parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MsgCardReSortV2Config parseFrom(InputStream inputStream) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MsgCardReSortV2Config parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MsgCardReSortV2Config parseFrom(C23856l lVar) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MsgCardReSortV2Config parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MsgCardReSortV2Config) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardReSortV2ConfigOrBuilder */
    public interface MsgCardReSortV2ConfigOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getEnterBoxRequireBufferCnt();

        int getForceInsertAdPos();

        int getInboxResortContextCnt();

        int getPullFeedsPreloadBufferCnt();

        int getRequirePreCardCnt();

        int getRequireRemainCardCnt();

        boolean hasEnterBoxRequireBufferCnt();

        boolean hasForceInsertAdPos();

        boolean hasInboxResortContextCnt();

        boolean hasPullFeedsPreloadBufferCnt();

        boolean hasRequirePreCardCnt();

        boolean hasRequireRemainCardCnt();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardStatus */
    public enum MsgCardStatus implements C23908o0.C23911c {
        MSG_CARD_STATUS_READ(1),
        MSG_CARD_STATUS_EXPOSED(2),
        MSG_CARD_STATUS_OLD_GROUP(4),
        MSG_CARD_STATUS_VALID_EXPOSED(8),
        MSG_CARD_STATUS_OFTEN_READ(16),
        MSG_CARD_STATUS_IS_DIGEST_EXPOSED(32),
        MSG_CARD_STATUS_IS_DIGEST_MSG(64),
        MSG_CARD_STATUS_IS_PREVIEW_MSG(128);
        
        public static final int MSG_CARD_STATUS_EXPOSED_VALUE = 2;
        public static final int MSG_CARD_STATUS_IS_DIGEST_EXPOSED_VALUE = 32;
        public static final int MSG_CARD_STATUS_IS_DIGEST_MSG_VALUE = 64;
        public static final int MSG_CARD_STATUS_IS_PREVIEW_MSG_VALUE = 128;
        public static final int MSG_CARD_STATUS_OFTEN_READ_VALUE = 16;
        public static final int MSG_CARD_STATUS_OLD_GROUP_VALUE = 4;
        public static final int MSG_CARD_STATUS_READ_VALUE = 1;
        public static final int MSG_CARD_STATUS_VALID_EXPOSED_VALUE = 8;
        private static final C23908o0.C23912d<MsgCardStatus> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardStatus$MsgCardStatusVerifier */
        public static final class MsgCardStatusVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new MsgCardStatusVerifier();
            }

            private MsgCardStatusVerifier() {
            }

            public boolean isInRange(int i) {
                return MsgCardStatus.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<MsgCardStatus>() {
                public MsgCardStatus findValueByNumber(int i) {
                    return MsgCardStatus.forNumber(i);
                }
            };
        }

        private MsgCardStatus(int i) {
            this.value = i;
        }

        public static MsgCardStatus forNumber(int i) {
            if (i == 1) {
                return MSG_CARD_STATUS_READ;
            }
            if (i == 2) {
                return MSG_CARD_STATUS_EXPOSED;
            }
            if (i == 4) {
                return MSG_CARD_STATUS_OLD_GROUP;
            }
            if (i == 8) {
                return MSG_CARD_STATUS_VALID_EXPOSED;
            }
            if (i == 16) {
                return MSG_CARD_STATUS_OFTEN_READ;
            }
            if (i == 32) {
                return MSG_CARD_STATUS_IS_DIGEST_EXPOSED;
            }
            if (i == 64) {
                return MSG_CARD_STATUS_IS_DIGEST_MSG;
            }
            if (i != 128) {
                return null;
            }
            return MSG_CARD_STATUS_IS_PREVIEW_MSG;
        }

        public static C23908o0.C23912d<MsgCardStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return MsgCardStatusVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MsgCardStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardType */
    public enum MsgCardType implements C23908o0.C23911c {
        MSG_CARD_TYPE_SUBSCRIBE(0),
        MSG_CARD_TYPE_HISTORY_LINE(1),
        MSG_CARD_TYPE_FINDER(2),
        MSG_CARD_TYPE_LIVE(3),
        MSG_CARD_TYPE_COLUMN(4),
        MSG_CARD_TYPE_RECMSG(5),
        MSG_CARD_TYPE_AD(6);
        
        public static final int MSG_CARD_TYPE_AD_VALUE = 6;
        public static final int MSG_CARD_TYPE_COLUMN_VALUE = 4;
        public static final int MSG_CARD_TYPE_FINDER_VALUE = 2;
        public static final int MSG_CARD_TYPE_HISTORY_LINE_VALUE = 1;
        public static final int MSG_CARD_TYPE_LIVE_VALUE = 3;
        public static final int MSG_CARD_TYPE_RECMSG_VALUE = 5;
        public static final int MSG_CARD_TYPE_SUBSCRIBE_VALUE = 0;
        private static final C23908o0.C23912d<MsgCardType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardType$MsgCardTypeVerifier */
        public static final class MsgCardTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new MsgCardTypeVerifier();
            }

            private MsgCardTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return MsgCardType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<MsgCardType>() {
                public MsgCardType findValueByNumber(int i) {
                    return MsgCardType.forNumber(i);
                }
            };
        }

        private MsgCardType(int i) {
            this.value = i;
        }

        public static MsgCardType forNumber(int i) {
            switch (i) {
                case 0:
                    return MSG_CARD_TYPE_SUBSCRIBE;
                case 1:
                    return MSG_CARD_TYPE_HISTORY_LINE;
                case 2:
                    return MSG_CARD_TYPE_FINDER;
                case 3:
                    return MSG_CARD_TYPE_LIVE;
                case 4:
                    return MSG_CARD_TYPE_COLUMN;
                case 5:
                    return MSG_CARD_TYPE_RECMSG;
                case 6:
                    return MSG_CARD_TYPE_AD;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<MsgCardType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return MsgCardTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MsgCardType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardViewType */
    public enum MsgCardViewType implements C23908o0.C23911c {
        MSG_CARD_VIEW_TYPE_SUBSCRIBE(0),
        MSG_CARD_VIEW_TYPE_HISTORY_LINE(1),
        MSG_CARD_VIEW_TYPE_REC_NATIVE(2),
        MSG_CARD_VIEW_TYPE_REC_CANVAS(3),
        MSG_CARD_VIEW_TYPE_AD_CANVAS(4);
        
        public static final int MSG_CARD_VIEW_TYPE_AD_CANVAS_VALUE = 4;
        public static final int MSG_CARD_VIEW_TYPE_HISTORY_LINE_VALUE = 1;
        public static final int MSG_CARD_VIEW_TYPE_REC_CANVAS_VALUE = 3;
        public static final int MSG_CARD_VIEW_TYPE_REC_NATIVE_VALUE = 2;
        public static final int MSG_CARD_VIEW_TYPE_SUBSCRIBE_VALUE = 0;
        private static final C23908o0.C23912d<MsgCardViewType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$MsgCardViewType$MsgCardViewTypeVerifier */
        public static final class MsgCardViewTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new MsgCardViewTypeVerifier();
            }

            private MsgCardViewTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return MsgCardViewType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<MsgCardViewType>() {
                public MsgCardViewType findValueByNumber(int i) {
                    return MsgCardViewType.forNumber(i);
                }
            };
        }

        private MsgCardViewType(int i) {
            this.value = i;
        }

        public static MsgCardViewType forNumber(int i) {
            if (i == 0) {
                return MSG_CARD_VIEW_TYPE_SUBSCRIBE;
            }
            if (i == 1) {
                return MSG_CARD_VIEW_TYPE_HISTORY_LINE;
            }
            if (i == 2) {
                return MSG_CARD_VIEW_TYPE_REC_NATIVE;
            }
            if (i == 3) {
                return MSG_CARD_VIEW_TYPE_REC_CANVAS;
            }
            if (i != 4) {
                return null;
            }
            return MSG_CARD_VIEW_TYPE_AD_CANVAS;
        }

        public static C23908o0.C23912d<MsgCardViewType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return MsgCardViewTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static MsgCardViewType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$NativeRecCardInfo */
    public static final class NativeRecCardInfo extends C23861l0<NativeRecCardInfo, Builder> implements NativeRecCardInfoOrBuilder {
        public static final int CARD_INFO_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final NativeRecCardInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<NativeRecCardInfo> PARSER;
        private int bitField0_;
        private BizCgiCardProto.BizRecommendArticleXml cardInfo_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$NativeRecCardInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<NativeRecCardInfo, Builder> implements NativeRecCardInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearCardInfo() {
                copyOnWrite();
                ((NativeRecCardInfo) this.instance).clearCardInfo();
                return this;
            }

            public BizCgiCardProto.BizRecommendArticleXml getCardInfo() {
                return ((NativeRecCardInfo) this.instance).getCardInfo();
            }

            public boolean hasCardInfo() {
                return ((NativeRecCardInfo) this.instance).hasCardInfo();
            }

            public Builder mergeCardInfo(BizCgiCardProto.BizRecommendArticleXml bizRecommendArticleXml) {
                copyOnWrite();
                ((NativeRecCardInfo) this.instance).mergeCardInfo(bizRecommendArticleXml);
                return this;
            }

            public Builder setCardInfo(BizCgiCardProto.BizRecommendArticleXml bizRecommendArticleXml) {
                copyOnWrite();
                ((NativeRecCardInfo) this.instance).setCardInfo(bizRecommendArticleXml);
                return this;
            }

            private Builder() {
                super(NativeRecCardInfo.DEFAULT_INSTANCE);
            }

            public Builder setCardInfo(BizCgiCardProto.BizRecommendArticleXml.Builder builder) {
                copyOnWrite();
                ((NativeRecCardInfo) this.instance).setCardInfo((BizCgiCardProto.BizRecommendArticleXml) builder.build());
                return this;
            }
        }

        static {
            NativeRecCardInfo nativeRecCardInfo = new NativeRecCardInfo();
            DEFAULT_INSTANCE = nativeRecCardInfo;
            C23861l0.registerDefaultInstance(NativeRecCardInfo.class, nativeRecCardInfo);
        }

        private NativeRecCardInfo() {
        }

        /* access modifiers changed from: private */
        public void clearCardInfo() {
            this.cardInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static NativeRecCardInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCardInfo(BizCgiCardProto.BizRecommendArticleXml bizRecommendArticleXml) {
            bizRecommendArticleXml.getClass();
            BizCgiCardProto.BizRecommendArticleXml bizRecommendArticleXml2 = this.cardInfo_;
            if (bizRecommendArticleXml2 == null || bizRecommendArticleXml2 == BizCgiCardProto.BizRecommendArticleXml.getDefaultInstance()) {
                this.cardInfo_ = bizRecommendArticleXml;
            } else {
                this.cardInfo_ = (BizCgiCardProto.BizRecommendArticleXml) ((BizCgiCardProto.BizRecommendArticleXml.Builder) BizCgiCardProto.BizRecommendArticleXml.newBuilder(this.cardInfo_).mergeFrom(bizRecommendArticleXml)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static NativeRecCardInfo parseDelimitedFrom(InputStream inputStream) {
            return (NativeRecCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeRecCardInfo parseFrom(ByteBuffer byteBuffer) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<NativeRecCardInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCardInfo(BizCgiCardProto.BizRecommendArticleXml bizRecommendArticleXml) {
            bizRecommendArticleXml.getClass();
            this.cardInfo_ = bizRecommendArticleXml;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "cardInfo_"});
                case 3:
                    return new NativeRecCardInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<NativeRecCardInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (NativeRecCardInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public BizCgiCardProto.BizRecommendArticleXml getCardInfo() {
            BizCgiCardProto.BizRecommendArticleXml bizRecommendArticleXml = this.cardInfo_;
            return bizRecommendArticleXml == null ? BizCgiCardProto.BizRecommendArticleXml.getDefaultInstance() : bizRecommendArticleXml;
        }

        public boolean hasCardInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NativeRecCardInfo nativeRecCardInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(nativeRecCardInfo);
        }

        public static NativeRecCardInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (NativeRecCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static NativeRecCardInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static NativeRecCardInfo parseFrom(C16994k kVar) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static NativeRecCardInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static NativeRecCardInfo parseFrom(byte[] bArr) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NativeRecCardInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static NativeRecCardInfo parseFrom(InputStream inputStream) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NativeRecCardInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static NativeRecCardInfo parseFrom(C23856l lVar) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static NativeRecCardInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (NativeRecCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$NativeRecCardInfoOrBuilder */
    public interface NativeRecCardInfoOrBuilder extends C23848k1 {
        BizCgiCardProto.BizRecommendArticleXml getCardInfo();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasCardInfo();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$RecCardExposeInfo */
    public static final class RecCardExposeInfo extends C23861l0<RecCardExposeInfo, Builder> implements RecCardExposeInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final RecCardExposeInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<RecCardExposeInfo> PARSER = null;
        public static final int REC_CARD_CONTENT_EXPOSE_CNT_FIELD_NUMBER = 1;
        public static final int REC_CARD_DIGEST_EXPOSE_CNT_FIELD_NUMBER = 2;
        private int bitField0_;
        private int recCardContentExposeCnt_;
        private int recCardDigestExposeCnt_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$RecCardExposeInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<RecCardExposeInfo, Builder> implements RecCardExposeInfoOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearRecCardContentExposeCnt() {
                copyOnWrite();
                ((RecCardExposeInfo) this.instance).clearRecCardContentExposeCnt();
                return this;
            }

            public Builder clearRecCardDigestExposeCnt() {
                copyOnWrite();
                ((RecCardExposeInfo) this.instance).clearRecCardDigestExposeCnt();
                return this;
            }

            public int getRecCardContentExposeCnt() {
                return ((RecCardExposeInfo) this.instance).getRecCardContentExposeCnt();
            }

            public int getRecCardDigestExposeCnt() {
                return ((RecCardExposeInfo) this.instance).getRecCardDigestExposeCnt();
            }

            public boolean hasRecCardContentExposeCnt() {
                return ((RecCardExposeInfo) this.instance).hasRecCardContentExposeCnt();
            }

            public boolean hasRecCardDigestExposeCnt() {
                return ((RecCardExposeInfo) this.instance).hasRecCardDigestExposeCnt();
            }

            public Builder setRecCardContentExposeCnt(int i) {
                copyOnWrite();
                ((RecCardExposeInfo) this.instance).setRecCardContentExposeCnt(i);
                return this;
            }

            public Builder setRecCardDigestExposeCnt(int i) {
                copyOnWrite();
                ((RecCardExposeInfo) this.instance).setRecCardDigestExposeCnt(i);
                return this;
            }

            private Builder() {
                super(RecCardExposeInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            RecCardExposeInfo recCardExposeInfo = new RecCardExposeInfo();
            DEFAULT_INSTANCE = recCardExposeInfo;
            C23861l0.registerDefaultInstance(RecCardExposeInfo.class, recCardExposeInfo);
        }

        private RecCardExposeInfo() {
        }

        /* access modifiers changed from: private */
        public void clearRecCardContentExposeCnt() {
            this.bitField0_ &= -2;
            this.recCardContentExposeCnt_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecCardDigestExposeCnt() {
            this.bitField0_ &= -3;
            this.recCardDigestExposeCnt_ = 0;
        }

        public static RecCardExposeInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RecCardExposeInfo parseDelimitedFrom(InputStream inputStream) {
            return (RecCardExposeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecCardExposeInfo parseFrom(ByteBuffer byteBuffer) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RecCardExposeInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRecCardContentExposeCnt(int i) {
            this.bitField0_ |= 1;
            this.recCardContentExposeCnt_ = i;
        }

        /* access modifiers changed from: private */
        public void setRecCardDigestExposeCnt(int i) {
            this.bitField0_ |= 2;
            this.recCardDigestExposeCnt_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"bitField0_", "recCardContentExposeCnt_", "recCardDigestExposeCnt_"});
                case 3:
                    return new RecCardExposeInfo();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RecCardExposeInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RecCardExposeInfo.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getRecCardContentExposeCnt() {
            return this.recCardContentExposeCnt_;
        }

        public int getRecCardDigestExposeCnt() {
            return this.recCardDigestExposeCnt_;
        }

        public boolean hasRecCardContentExposeCnt() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasRecCardDigestExposeCnt() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(RecCardExposeInfo recCardExposeInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(recCardExposeInfo);
        }

        public static RecCardExposeInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RecCardExposeInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RecCardExposeInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RecCardExposeInfo parseFrom(C16994k kVar) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static RecCardExposeInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RecCardExposeInfo parseFrom(byte[] bArr) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecCardExposeInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RecCardExposeInfo parseFrom(InputStream inputStream) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecCardExposeInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RecCardExposeInfo parseFrom(C23856l lVar) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RecCardExposeInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RecCardExposeInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$RecCardExposeInfoOrBuilder */
    public interface RecCardExposeInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getRecCardContentExposeCnt();

        int getRecCardDigestExposeCnt();

        boolean hasRecCardContentExposeCnt();

        boolean hasRecCardDigestExposeCnt();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$RecommendFeedsContext */
    public static final class RecommendFeedsContext extends C23861l0<RecommendFeedsContext, Builder> implements RecommendFeedsContextOrBuilder {
        public static final int ACTIONBUFFER_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final RecommendFeedsContext DEFAULT_INSTANCE;
        private static volatile C24062w1<RecommendFeedsContext> PARSER = null;
        public static final int REFERER_FIELD_NUMBER = 1;
        private String actionBuffer_ = "";
        private int bitField0_;
        private String referer_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$RecommendFeedsContext$Builder */
        public static final class Builder extends C23861l0.C23862a<RecommendFeedsContext, Builder> implements RecommendFeedsContextOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearActionBuffer() {
                copyOnWrite();
                ((RecommendFeedsContext) this.instance).clearActionBuffer();
                return this;
            }

            public Builder clearReferer() {
                copyOnWrite();
                ((RecommendFeedsContext) this.instance).clearReferer();
                return this;
            }

            public String getActionBuffer() {
                return ((RecommendFeedsContext) this.instance).getActionBuffer();
            }

            public C16994k getActionBufferBytes() {
                return ((RecommendFeedsContext) this.instance).getActionBufferBytes();
            }

            public String getReferer() {
                return ((RecommendFeedsContext) this.instance).getReferer();
            }

            public C16994k getRefererBytes() {
                return ((RecommendFeedsContext) this.instance).getRefererBytes();
            }

            public boolean hasActionBuffer() {
                return ((RecommendFeedsContext) this.instance).hasActionBuffer();
            }

            public boolean hasReferer() {
                return ((RecommendFeedsContext) this.instance).hasReferer();
            }

            public Builder setActionBuffer(String str) {
                copyOnWrite();
                ((RecommendFeedsContext) this.instance).setActionBuffer(str);
                return this;
            }

            public Builder setActionBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((RecommendFeedsContext) this.instance).setActionBufferBytes(kVar);
                return this;
            }

            public Builder setReferer(String str) {
                copyOnWrite();
                ((RecommendFeedsContext) this.instance).setReferer(str);
                return this;
            }

            public Builder setRefererBytes(C16994k kVar) {
                copyOnWrite();
                ((RecommendFeedsContext) this.instance).setRefererBytes(kVar);
                return this;
            }

            private Builder() {
                super(RecommendFeedsContext.DEFAULT_INSTANCE);
            }
        }

        static {
            RecommendFeedsContext recommendFeedsContext = new RecommendFeedsContext();
            DEFAULT_INSTANCE = recommendFeedsContext;
            C23861l0.registerDefaultInstance(RecommendFeedsContext.class, recommendFeedsContext);
        }

        private RecommendFeedsContext() {
        }

        /* access modifiers changed from: private */
        public void clearActionBuffer() {
            this.bitField0_ &= -3;
            this.actionBuffer_ = getDefaultInstance().getActionBuffer();
        }

        /* access modifiers changed from: private */
        public void clearReferer() {
            this.bitField0_ &= -2;
            this.referer_ = getDefaultInstance().getReferer();
        }

        public static RecommendFeedsContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static RecommendFeedsContext parseDelimitedFrom(InputStream inputStream) {
            return (RecommendFeedsContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecommendFeedsContext parseFrom(ByteBuffer byteBuffer) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<RecommendFeedsContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setActionBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.actionBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setActionBufferBytes(C16994k kVar) {
            this.actionBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setReferer(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.referer_ = str;
        }

        /* access modifiers changed from: private */
        public void setRefererBytes(C16994k kVar) {
            this.referer_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "referer_", "actionBuffer_"});
                case 3:
                    return new RecommendFeedsContext();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<RecommendFeedsContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (RecommendFeedsContext.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getActionBuffer() {
            return this.actionBuffer_;
        }

        public C16994k getActionBufferBytes() {
            return C16994k.m16791k(this.actionBuffer_);
        }

        public String getReferer() {
            return this.referer_;
        }

        public C16994k getRefererBytes() {
            return C16994k.m16791k(this.referer_);
        }

        public boolean hasActionBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasReferer() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(RecommendFeedsContext recommendFeedsContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(recommendFeedsContext);
        }

        public static RecommendFeedsContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RecommendFeedsContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RecommendFeedsContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static RecommendFeedsContext parseFrom(C16994k kVar) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static RecommendFeedsContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static RecommendFeedsContext parseFrom(byte[] bArr) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecommendFeedsContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static RecommendFeedsContext parseFrom(InputStream inputStream) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecommendFeedsContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static RecommendFeedsContext parseFrom(C23856l lVar) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static RecommendFeedsContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (RecommendFeedsContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$RecommendFeedsContextOrBuilder */
    public interface RecommendFeedsContextOrBuilder extends C23848k1 {
        String getActionBuffer();

        C16994k getActionBufferBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getReferer();

        C16994k getRefererBytes();

        boolean hasActionBuffer();

        boolean hasReferer();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinBuffer_t */
    public static final class SKBuiltinBuffer_t extends C23861l0<SKBuiltinBuffer_t, Builder> implements SKBuiltinBuffer_tOrBuilder {
        public static final int BUFFER_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final SKBuiltinBuffer_t DEFAULT_INSTANCE;
        public static final int ILEN_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinBuffer_t> PARSER;
        private int bitField0_;
        private C16994k buffer_ = C16994k.f46000e;
        private int iLen_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinBuffer_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinBuffer_t, Builder> implements SKBuiltinBuffer_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((SKBuiltinBuffer_t) this.instance).clearBuffer();
                return this;
            }

            public Builder clearILen() {
                copyOnWrite();
                ((SKBuiltinBuffer_t) this.instance).clearILen();
                return this;
            }

            public C16994k getBuffer() {
                return ((SKBuiltinBuffer_t) this.instance).getBuffer();
            }

            public int getILen() {
                return ((SKBuiltinBuffer_t) this.instance).getILen();
            }

            public boolean hasBuffer() {
                return ((SKBuiltinBuffer_t) this.instance).hasBuffer();
            }

            public boolean hasILen() {
                return ((SKBuiltinBuffer_t) this.instance).hasILen();
            }

            public Builder setBuffer(C16994k kVar) {
                copyOnWrite();
                ((SKBuiltinBuffer_t) this.instance).setBuffer(kVar);
                return this;
            }

            public Builder setILen(int i) {
                copyOnWrite();
                ((SKBuiltinBuffer_t) this.instance).setILen(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinBuffer_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinBuffer_t sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
            DEFAULT_INSTANCE = sKBuiltinBuffer_t;
            C23861l0.registerDefaultInstance(SKBuiltinBuffer_t.class, sKBuiltinBuffer_t);
        }

        private SKBuiltinBuffer_t() {
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -3;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearILen() {
            this.bitField0_ &= -2;
            this.iLen_ = 0;
        }

        public static SKBuiltinBuffer_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinBuffer_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinBuffer_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinBuffer_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinBuffer_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.buffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setILen(int i) {
            this.bitField0_ |= 1;
            this.iLen_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔋ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "iLen_", "buffer_"});
                case 3:
                    return new SKBuiltinBuffer_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinBuffer_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinBuffer_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public C16994k getBuffer() {
            return this.buffer_;
        }

        public int getILen() {
            return this.iLen_;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasILen() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinBuffer_t sKBuiltinBuffer_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinBuffer_t);
        }

        public static SKBuiltinBuffer_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinBuffer_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinBuffer_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinBuffer_t parseFrom(C16994k kVar) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinBuffer_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinBuffer_t parseFrom(byte[] bArr) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinBuffer_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinBuffer_t parseFrom(InputStream inputStream) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinBuffer_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinBuffer_t parseFrom(C23856l lVar) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinBuffer_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinBuffer_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinBuffer_tOrBuilder */
    public interface SKBuiltinBuffer_tOrBuilder extends C23848k1 {
        C16994k getBuffer();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getILen();

        boolean hasBuffer();

        boolean hasILen();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinChar_t */
    public static final class SKBuiltinChar_t extends C23861l0<SKBuiltinChar_t, Builder> implements SKBuiltinChar_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinChar_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinChar_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinChar_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinChar_t, Builder> implements SKBuiltinChar_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearIVal() {
                copyOnWrite();
                ((SKBuiltinChar_t) this.instance).clearIVal();
                return this;
            }

            public int getIVal() {
                return ((SKBuiltinChar_t) this.instance).getIVal();
            }

            public boolean hasIVal() {
                return ((SKBuiltinChar_t) this.instance).hasIVal();
            }

            public Builder setIVal(int i) {
                copyOnWrite();
                ((SKBuiltinChar_t) this.instance).setIVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinChar_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinChar_t sKBuiltinChar_t = new SKBuiltinChar_t();
            DEFAULT_INSTANCE = sKBuiltinChar_t;
            C23861l0.registerDefaultInstance(SKBuiltinChar_t.class, sKBuiltinChar_t);
        }

        private SKBuiltinChar_t() {
        }

        /* access modifiers changed from: private */
        public void clearIVal() {
            this.bitField0_ &= -2;
            this.iVal_ = 0;
        }

        public static SKBuiltinChar_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinChar_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinChar_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinChar_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinChar_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIVal(int i) {
            this.bitField0_ |= 1;
            this.iVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "iVal_"});
                case 3:
                    return new SKBuiltinChar_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinChar_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinChar_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIVal() {
            return this.iVal_;
        }

        public boolean hasIVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinChar_t sKBuiltinChar_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinChar_t);
        }

        public static SKBuiltinChar_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinChar_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinChar_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinChar_t parseFrom(C16994k kVar) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinChar_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinChar_t parseFrom(byte[] bArr) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinChar_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinChar_t parseFrom(InputStream inputStream) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinChar_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinChar_t parseFrom(C23856l lVar) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinChar_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinChar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinChar_tOrBuilder */
    public interface SKBuiltinChar_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinDouble64_t */
    public static final class SKBuiltinDouble64_t extends C23861l0<SKBuiltinDouble64_t, Builder> implements SKBuiltinDouble64_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinDouble64_t DEFAULT_INSTANCE;
        public static final int DVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinDouble64_t> PARSER;
        private int bitField0_;
        private double dVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinDouble64_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinDouble64_t, Builder> implements SKBuiltinDouble64_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearDVal() {
                copyOnWrite();
                ((SKBuiltinDouble64_t) this.instance).clearDVal();
                return this;
            }

            public double getDVal() {
                return ((SKBuiltinDouble64_t) this.instance).getDVal();
            }

            public boolean hasDVal() {
                return ((SKBuiltinDouble64_t) this.instance).hasDVal();
            }

            public Builder setDVal(double d) {
                copyOnWrite();
                ((SKBuiltinDouble64_t) this.instance).setDVal(d);
                return this;
            }

            private Builder() {
                super(SKBuiltinDouble64_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinDouble64_t sKBuiltinDouble64_t = new SKBuiltinDouble64_t();
            DEFAULT_INSTANCE = sKBuiltinDouble64_t;
            C23861l0.registerDefaultInstance(SKBuiltinDouble64_t.class, sKBuiltinDouble64_t);
        }

        private SKBuiltinDouble64_t() {
        }

        /* access modifiers changed from: private */
        public void clearDVal() {
            this.bitField0_ &= -2;
            this.dVal_ = 0.0d;
        }

        public static SKBuiltinDouble64_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinDouble64_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinDouble64_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinDouble64_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinDouble64_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDVal(double d) {
            this.bitField0_ |= 1;
            this.dVal_ = d;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔀ\u0000", new Object[]{"bitField0_", "dVal_"});
                case 3:
                    return new SKBuiltinDouble64_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinDouble64_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinDouble64_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public double getDVal() {
            return this.dVal_;
        }

        public boolean hasDVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinDouble64_t sKBuiltinDouble64_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinDouble64_t);
        }

        public static SKBuiltinDouble64_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinDouble64_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinDouble64_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinDouble64_t parseFrom(C16994k kVar) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinDouble64_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinDouble64_t parseFrom(byte[] bArr) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinDouble64_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinDouble64_t parseFrom(InputStream inputStream) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinDouble64_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinDouble64_t parseFrom(C23856l lVar) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinDouble64_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinDouble64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinDouble64_tOrBuilder */
    public interface SKBuiltinDouble64_tOrBuilder extends C23848k1 {
        double getDVal();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasDVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinFloat32_t */
    public static final class SKBuiltinFloat32_t extends C23861l0<SKBuiltinFloat32_t, Builder> implements SKBuiltinFloat32_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinFloat32_t DEFAULT_INSTANCE;
        public static final int FVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinFloat32_t> PARSER;
        private int bitField0_;
        private float fVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinFloat32_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinFloat32_t, Builder> implements SKBuiltinFloat32_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearFVal() {
                copyOnWrite();
                ((SKBuiltinFloat32_t) this.instance).clearFVal();
                return this;
            }

            public float getFVal() {
                return ((SKBuiltinFloat32_t) this.instance).getFVal();
            }

            public boolean hasFVal() {
                return ((SKBuiltinFloat32_t) this.instance).hasFVal();
            }

            public Builder setFVal(float f) {
                copyOnWrite();
                ((SKBuiltinFloat32_t) this.instance).setFVal(f);
                return this;
            }

            private Builder() {
                super(SKBuiltinFloat32_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinFloat32_t sKBuiltinFloat32_t = new SKBuiltinFloat32_t();
            DEFAULT_INSTANCE = sKBuiltinFloat32_t;
            C23861l0.registerDefaultInstance(SKBuiltinFloat32_t.class, sKBuiltinFloat32_t);
        }

        private SKBuiltinFloat32_t() {
        }

        /* access modifiers changed from: private */
        public void clearFVal() {
            this.bitField0_ &= -2;
            this.fVal_ = 0.0f;
        }

        public static SKBuiltinFloat32_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinFloat32_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinFloat32_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinFloat32_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinFloat32_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setFVal(float f) {
            this.bitField0_ |= 1;
            this.fVal_ = f;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔁ\u0000", new Object[]{"bitField0_", "fVal_"});
                case 3:
                    return new SKBuiltinFloat32_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinFloat32_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinFloat32_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public float getFVal() {
            return this.fVal_;
        }

        public boolean hasFVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinFloat32_t sKBuiltinFloat32_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinFloat32_t);
        }

        public static SKBuiltinFloat32_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinFloat32_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinFloat32_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinFloat32_t parseFrom(C16994k kVar) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinFloat32_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinFloat32_t parseFrom(byte[] bArr) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinFloat32_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinFloat32_t parseFrom(InputStream inputStream) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinFloat32_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinFloat32_t parseFrom(C23856l lVar) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinFloat32_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinFloat32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinFloat32_tOrBuilder */
    public interface SKBuiltinFloat32_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        float getFVal();

        boolean hasFVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt16_t */
    public static final class SKBuiltinInt16_t extends C23861l0<SKBuiltinInt16_t, Builder> implements SKBuiltinInt16_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt16_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt16_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt16_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt16_t, Builder> implements SKBuiltinInt16_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearIVal() {
                copyOnWrite();
                ((SKBuiltinInt16_t) this.instance).clearIVal();
                return this;
            }

            public int getIVal() {
                return ((SKBuiltinInt16_t) this.instance).getIVal();
            }

            public boolean hasIVal() {
                return ((SKBuiltinInt16_t) this.instance).hasIVal();
            }

            public Builder setIVal(int i) {
                copyOnWrite();
                ((SKBuiltinInt16_t) this.instance).setIVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinInt16_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinInt16_t sKBuiltinInt16_t = new SKBuiltinInt16_t();
            DEFAULT_INSTANCE = sKBuiltinInt16_t;
            C23861l0.registerDefaultInstance(SKBuiltinInt16_t.class, sKBuiltinInt16_t);
        }

        private SKBuiltinInt16_t() {
        }

        /* access modifiers changed from: private */
        public void clearIVal() {
            this.bitField0_ &= -2;
            this.iVal_ = 0;
        }

        public static SKBuiltinInt16_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinInt16_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinInt16_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt16_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinInt16_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIVal(int i) {
            this.bitField0_ |= 1;
            this.iVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "iVal_"});
                case 3:
                    return new SKBuiltinInt16_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinInt16_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinInt16_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIVal() {
            return this.iVal_;
        }

        public boolean hasIVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinInt16_t sKBuiltinInt16_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinInt16_t);
        }

        public static SKBuiltinInt16_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt16_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt16_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinInt16_t parseFrom(C16994k kVar) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinInt16_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinInt16_t parseFrom(byte[] bArr) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinInt16_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinInt16_t parseFrom(InputStream inputStream) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt16_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt16_t parseFrom(C23856l lVar) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinInt16_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinInt16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt16_tOrBuilder */
    public interface SKBuiltinInt16_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt32_t */
    public static final class SKBuiltinInt32_t extends C23861l0<SKBuiltinInt32_t, Builder> implements SKBuiltinInt32_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt32_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt32_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt32_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt32_t, Builder> implements SKBuiltinInt32_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearIVal() {
                copyOnWrite();
                ((SKBuiltinInt32_t) this.instance).clearIVal();
                return this;
            }

            public int getIVal() {
                return ((SKBuiltinInt32_t) this.instance).getIVal();
            }

            public boolean hasIVal() {
                return ((SKBuiltinInt32_t) this.instance).hasIVal();
            }

            public Builder setIVal(int i) {
                copyOnWrite();
                ((SKBuiltinInt32_t) this.instance).setIVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinInt32_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinInt32_t sKBuiltinInt32_t = new SKBuiltinInt32_t();
            DEFAULT_INSTANCE = sKBuiltinInt32_t;
            C23861l0.registerDefaultInstance(SKBuiltinInt32_t.class, sKBuiltinInt32_t);
        }

        private SKBuiltinInt32_t() {
        }

        /* access modifiers changed from: private */
        public void clearIVal() {
            this.bitField0_ &= -2;
            this.iVal_ = 0;
        }

        public static SKBuiltinInt32_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinInt32_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinInt32_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt32_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinInt32_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIVal(int i) {
            this.bitField0_ |= 1;
            this.iVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔋ\u0000", new Object[]{"bitField0_", "iVal_"});
                case 3:
                    return new SKBuiltinInt32_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinInt32_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinInt32_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIVal() {
            return this.iVal_;
        }

        public boolean hasIVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinInt32_t sKBuiltinInt32_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinInt32_t);
        }

        public static SKBuiltinInt32_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt32_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt32_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinInt32_t parseFrom(C16994k kVar) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinInt32_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinInt32_t parseFrom(byte[] bArr) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinInt32_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinInt32_t parseFrom(InputStream inputStream) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt32_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt32_t parseFrom(C23856l lVar) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinInt32_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinInt32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt32_tOrBuilder */
    public interface SKBuiltinInt32_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt64_t */
    public static final class SKBuiltinInt64_t extends C23861l0<SKBuiltinInt64_t, Builder> implements SKBuiltinInt64_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt64_t DEFAULT_INSTANCE;
        public static final int LLVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt64_t> PARSER;
        private int bitField0_;
        private long llVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt64_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt64_t, Builder> implements SKBuiltinInt64_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearLlVal() {
                copyOnWrite();
                ((SKBuiltinInt64_t) this.instance).clearLlVal();
                return this;
            }

            public long getLlVal() {
                return ((SKBuiltinInt64_t) this.instance).getLlVal();
            }

            public boolean hasLlVal() {
                return ((SKBuiltinInt64_t) this.instance).hasLlVal();
            }

            public Builder setLlVal(long j) {
                copyOnWrite();
                ((SKBuiltinInt64_t) this.instance).setLlVal(j);
                return this;
            }

            private Builder() {
                super(SKBuiltinInt64_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinInt64_t sKBuiltinInt64_t = new SKBuiltinInt64_t();
            DEFAULT_INSTANCE = sKBuiltinInt64_t;
            C23861l0.registerDefaultInstance(SKBuiltinInt64_t.class, sKBuiltinInt64_t);
        }

        private SKBuiltinInt64_t() {
        }

        /* access modifiers changed from: private */
        public void clearLlVal() {
            this.bitField0_ &= -2;
            this.llVal_ = 0;
        }

        public static SKBuiltinInt64_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinInt64_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinInt64_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt64_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinInt64_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLlVal(long j) {
            this.bitField0_ |= 1;
            this.llVal_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔂ\u0000", new Object[]{"bitField0_", "llVal_"});
                case 3:
                    return new SKBuiltinInt64_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinInt64_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinInt64_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getLlVal() {
            return this.llVal_;
        }

        public boolean hasLlVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinInt64_t sKBuiltinInt64_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinInt64_t);
        }

        public static SKBuiltinInt64_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt64_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt64_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinInt64_t parseFrom(C16994k kVar) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinInt64_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinInt64_t parseFrom(byte[] bArr) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinInt64_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinInt64_t parseFrom(InputStream inputStream) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt64_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt64_t parseFrom(C23856l lVar) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinInt64_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinInt64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt64_tOrBuilder */
    public interface SKBuiltinInt64_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getLlVal();

        boolean hasLlVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt8_t */
    public static final class SKBuiltinInt8_t extends C23861l0<SKBuiltinInt8_t, Builder> implements SKBuiltinInt8_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt8_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt8_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt8_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt8_t, Builder> implements SKBuiltinInt8_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearIVal() {
                copyOnWrite();
                ((SKBuiltinInt8_t) this.instance).clearIVal();
                return this;
            }

            public int getIVal() {
                return ((SKBuiltinInt8_t) this.instance).getIVal();
            }

            public boolean hasIVal() {
                return ((SKBuiltinInt8_t) this.instance).hasIVal();
            }

            public Builder setIVal(int i) {
                copyOnWrite();
                ((SKBuiltinInt8_t) this.instance).setIVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinInt8_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinInt8_t sKBuiltinInt8_t = new SKBuiltinInt8_t();
            DEFAULT_INSTANCE = sKBuiltinInt8_t;
            C23861l0.registerDefaultInstance(SKBuiltinInt8_t.class, sKBuiltinInt8_t);
        }

        private SKBuiltinInt8_t() {
        }

        /* access modifiers changed from: private */
        public void clearIVal() {
            this.bitField0_ &= -2;
            this.iVal_ = 0;
        }

        public static SKBuiltinInt8_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinInt8_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinInt8_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt8_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinInt8_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIVal(int i) {
            this.bitField0_ |= 1;
            this.iVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔄ\u0000", new Object[]{"bitField0_", "iVal_"});
                case 3:
                    return new SKBuiltinInt8_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinInt8_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinInt8_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getIVal() {
            return this.iVal_;
        }

        public boolean hasIVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinInt8_t sKBuiltinInt8_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinInt8_t);
        }

        public static SKBuiltinInt8_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt8_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt8_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinInt8_t parseFrom(C16994k kVar) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinInt8_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinInt8_t parseFrom(byte[] bArr) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinInt8_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinInt8_t parseFrom(InputStream inputStream) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinInt8_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinInt8_t parseFrom(C23856l lVar) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinInt8_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinInt8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinInt8_tOrBuilder */
    public interface SKBuiltinInt8_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinString_t */
    public static final class SKBuiltinString_t extends C23861l0<SKBuiltinString_t, Builder> implements SKBuiltinString_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinString_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinString_t> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 1;
        private int bitField0_;
        private String string_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinString_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinString_t, Builder> implements SKBuiltinString_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearString() {
                copyOnWrite();
                ((SKBuiltinString_t) this.instance).clearString();
                return this;
            }

            public String getString() {
                return ((SKBuiltinString_t) this.instance).getString();
            }

            public C16994k getStringBytes() {
                return ((SKBuiltinString_t) this.instance).getStringBytes();
            }

            public boolean hasString() {
                return ((SKBuiltinString_t) this.instance).hasString();
            }

            public Builder setString(String str) {
                copyOnWrite();
                ((SKBuiltinString_t) this.instance).setString(str);
                return this;
            }

            public Builder setStringBytes(C16994k kVar) {
                copyOnWrite();
                ((SKBuiltinString_t) this.instance).setStringBytes(kVar);
                return this;
            }

            private Builder() {
                super(SKBuiltinString_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinString_t sKBuiltinString_t = new SKBuiltinString_t();
            DEFAULT_INSTANCE = sKBuiltinString_t;
            C23861l0.registerDefaultInstance(SKBuiltinString_t.class, sKBuiltinString_t);
        }

        private SKBuiltinString_t() {
        }

        /* access modifiers changed from: private */
        public void clearString() {
            this.bitField0_ &= -2;
            this.string_ = getDefaultInstance().getString();
        }

        public static SKBuiltinString_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinString_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinString_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinString_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinString_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setString(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.string_ = str;
        }

        /* access modifiers changed from: private */
        public void setStringBytes(C16994k kVar) {
            this.string_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "string_"});
                case 3:
                    return new SKBuiltinString_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinString_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinString_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getString() {
            return this.string_;
        }

        public C16994k getStringBytes() {
            return C16994k.m16791k(this.string_);
        }

        public boolean hasString() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinString_t sKBuiltinString_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinString_t);
        }

        public static SKBuiltinString_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinString_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinString_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinString_t parseFrom(C16994k kVar) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinString_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinString_t parseFrom(byte[] bArr) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinString_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinString_t parseFrom(InputStream inputStream) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinString_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinString_t parseFrom(C23856l lVar) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinString_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinString_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinString_tOrBuilder */
    public interface SKBuiltinString_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getString();

        C16994k getStringBytes();

        boolean hasString();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUchar_t */
    public static final class SKBuiltinUchar_t extends C23861l0<SKBuiltinUchar_t, Builder> implements SKBuiltinUchar_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUchar_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUchar_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUchar_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinUchar_t, Builder> implements SKBuiltinUchar_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearUiVal() {
                copyOnWrite();
                ((SKBuiltinUchar_t) this.instance).clearUiVal();
                return this;
            }

            public int getUiVal() {
                return ((SKBuiltinUchar_t) this.instance).getUiVal();
            }

            public boolean hasUiVal() {
                return ((SKBuiltinUchar_t) this.instance).hasUiVal();
            }

            public Builder setUiVal(int i) {
                copyOnWrite();
                ((SKBuiltinUchar_t) this.instance).setUiVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinUchar_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinUchar_t sKBuiltinUchar_t = new SKBuiltinUchar_t();
            DEFAULT_INSTANCE = sKBuiltinUchar_t;
            C23861l0.registerDefaultInstance(SKBuiltinUchar_t.class, sKBuiltinUchar_t);
        }

        private SKBuiltinUchar_t() {
        }

        /* access modifiers changed from: private */
        public void clearUiVal() {
            this.bitField0_ &= -2;
            this.uiVal_ = 0;
        }

        public static SKBuiltinUchar_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinUchar_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinUchar_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUchar_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinUchar_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUiVal(int i) {
            this.bitField0_ |= 1;
            this.uiVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔋ\u0000", new Object[]{"bitField0_", "uiVal_"});
                case 3:
                    return new SKBuiltinUchar_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinUchar_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinUchar_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getUiVal() {
            return this.uiVal_;
        }

        public boolean hasUiVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinUchar_t sKBuiltinUchar_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinUchar_t);
        }

        public static SKBuiltinUchar_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUchar_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUchar_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinUchar_t parseFrom(C16994k kVar) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinUchar_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinUchar_t parseFrom(byte[] bArr) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinUchar_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinUchar_t parseFrom(InputStream inputStream) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUchar_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUchar_t parseFrom(C23856l lVar) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinUchar_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinUchar_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUchar_tOrBuilder */
    public interface SKBuiltinUchar_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint16_t */
    public static final class SKBuiltinUint16_t extends C23861l0<SKBuiltinUint16_t, Builder> implements SKBuiltinUint16_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint16_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint16_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint16_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint16_t, Builder> implements SKBuiltinUint16_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearUiVal() {
                copyOnWrite();
                ((SKBuiltinUint16_t) this.instance).clearUiVal();
                return this;
            }

            public int getUiVal() {
                return ((SKBuiltinUint16_t) this.instance).getUiVal();
            }

            public boolean hasUiVal() {
                return ((SKBuiltinUint16_t) this.instance).hasUiVal();
            }

            public Builder setUiVal(int i) {
                copyOnWrite();
                ((SKBuiltinUint16_t) this.instance).setUiVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinUint16_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinUint16_t sKBuiltinUint16_t = new SKBuiltinUint16_t();
            DEFAULT_INSTANCE = sKBuiltinUint16_t;
            C23861l0.registerDefaultInstance(SKBuiltinUint16_t.class, sKBuiltinUint16_t);
        }

        private SKBuiltinUint16_t() {
        }

        /* access modifiers changed from: private */
        public void clearUiVal() {
            this.bitField0_ &= -2;
            this.uiVal_ = 0;
        }

        public static SKBuiltinUint16_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinUint16_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinUint16_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint16_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinUint16_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUiVal(int i) {
            this.bitField0_ |= 1;
            this.uiVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔋ\u0000", new Object[]{"bitField0_", "uiVal_"});
                case 3:
                    return new SKBuiltinUint16_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinUint16_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinUint16_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getUiVal() {
            return this.uiVal_;
        }

        public boolean hasUiVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinUint16_t sKBuiltinUint16_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinUint16_t);
        }

        public static SKBuiltinUint16_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint16_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint16_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinUint16_t parseFrom(C16994k kVar) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinUint16_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinUint16_t parseFrom(byte[] bArr) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinUint16_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinUint16_t parseFrom(InputStream inputStream) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint16_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint16_t parseFrom(C23856l lVar) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinUint16_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinUint16_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint16_tOrBuilder */
    public interface SKBuiltinUint16_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint32_t */
    public static final class SKBuiltinUint32_t extends C23861l0<SKBuiltinUint32_t, Builder> implements SKBuiltinUint32_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint32_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint32_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint32_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint32_t, Builder> implements SKBuiltinUint32_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearUiVal() {
                copyOnWrite();
                ((SKBuiltinUint32_t) this.instance).clearUiVal();
                return this;
            }

            public int getUiVal() {
                return ((SKBuiltinUint32_t) this.instance).getUiVal();
            }

            public boolean hasUiVal() {
                return ((SKBuiltinUint32_t) this.instance).hasUiVal();
            }

            public Builder setUiVal(int i) {
                copyOnWrite();
                ((SKBuiltinUint32_t) this.instance).setUiVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinUint32_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinUint32_t sKBuiltinUint32_t = new SKBuiltinUint32_t();
            DEFAULT_INSTANCE = sKBuiltinUint32_t;
            C23861l0.registerDefaultInstance(SKBuiltinUint32_t.class, sKBuiltinUint32_t);
        }

        private SKBuiltinUint32_t() {
        }

        /* access modifiers changed from: private */
        public void clearUiVal() {
            this.bitField0_ &= -2;
            this.uiVal_ = 0;
        }

        public static SKBuiltinUint32_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinUint32_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinUint32_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint32_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinUint32_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUiVal(int i) {
            this.bitField0_ |= 1;
            this.uiVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔋ\u0000", new Object[]{"bitField0_", "uiVal_"});
                case 3:
                    return new SKBuiltinUint32_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinUint32_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinUint32_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getUiVal() {
            return this.uiVal_;
        }

        public boolean hasUiVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinUint32_t sKBuiltinUint32_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinUint32_t);
        }

        public static SKBuiltinUint32_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint32_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint32_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinUint32_t parseFrom(C16994k kVar) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinUint32_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinUint32_t parseFrom(byte[] bArr) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinUint32_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinUint32_t parseFrom(InputStream inputStream) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint32_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint32_t parseFrom(C23856l lVar) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinUint32_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinUint32_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint32_tOrBuilder */
    public interface SKBuiltinUint32_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint64_t */
    public static final class SKBuiltinUint64_t extends C23861l0<SKBuiltinUint64_t, Builder> implements SKBuiltinUint64_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint64_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint64_t> PARSER = null;
        public static final int ULLVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private long ullVal_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint64_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint64_t, Builder> implements SKBuiltinUint64_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearUllVal() {
                copyOnWrite();
                ((SKBuiltinUint64_t) this.instance).clearUllVal();
                return this;
            }

            public long getUllVal() {
                return ((SKBuiltinUint64_t) this.instance).getUllVal();
            }

            public boolean hasUllVal() {
                return ((SKBuiltinUint64_t) this.instance).hasUllVal();
            }

            public Builder setUllVal(long j) {
                copyOnWrite();
                ((SKBuiltinUint64_t) this.instance).setUllVal(j);
                return this;
            }

            private Builder() {
                super(SKBuiltinUint64_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinUint64_t sKBuiltinUint64_t = new SKBuiltinUint64_t();
            DEFAULT_INSTANCE = sKBuiltinUint64_t;
            C23861l0.registerDefaultInstance(SKBuiltinUint64_t.class, sKBuiltinUint64_t);
        }

        private SKBuiltinUint64_t() {
        }

        /* access modifiers changed from: private */
        public void clearUllVal() {
            this.bitField0_ &= -2;
            this.ullVal_ = 0;
        }

        public static SKBuiltinUint64_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinUint64_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinUint64_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint64_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinUint64_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUllVal(long j) {
            this.bitField0_ |= 1;
            this.ullVal_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔃ\u0000", new Object[]{"bitField0_", "ullVal_"});
                case 3:
                    return new SKBuiltinUint64_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinUint64_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinUint64_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public long getUllVal() {
            return this.ullVal_;
        }

        public boolean hasUllVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinUint64_t sKBuiltinUint64_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinUint64_t);
        }

        public static SKBuiltinUint64_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint64_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint64_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinUint64_t parseFrom(C16994k kVar) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinUint64_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinUint64_t parseFrom(byte[] bArr) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinUint64_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinUint64_t parseFrom(InputStream inputStream) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint64_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint64_t parseFrom(C23856l lVar) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinUint64_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinUint64_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint64_tOrBuilder */
    public interface SKBuiltinUint64_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getUllVal();

        boolean hasUllVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint8_t */
    public static final class SKBuiltinUint8_t extends C23861l0<SKBuiltinUint8_t, Builder> implements SKBuiltinUint8_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint8_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint8_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint8_t$Builder */
        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint8_t, Builder> implements SKBuiltinUint8_tOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearUiVal() {
                copyOnWrite();
                ((SKBuiltinUint8_t) this.instance).clearUiVal();
                return this;
            }

            public int getUiVal() {
                return ((SKBuiltinUint8_t) this.instance).getUiVal();
            }

            public boolean hasUiVal() {
                return ((SKBuiltinUint8_t) this.instance).hasUiVal();
            }

            public Builder setUiVal(int i) {
                copyOnWrite();
                ((SKBuiltinUint8_t) this.instance).setUiVal(i);
                return this;
            }

            private Builder() {
                super(SKBuiltinUint8_t.DEFAULT_INSTANCE);
            }
        }

        static {
            SKBuiltinUint8_t sKBuiltinUint8_t = new SKBuiltinUint8_t();
            DEFAULT_INSTANCE = sKBuiltinUint8_t;
            C23861l0.registerDefaultInstance(SKBuiltinUint8_t.class, sKBuiltinUint8_t);
        }

        private SKBuiltinUint8_t() {
        }

        /* access modifiers changed from: private */
        public void clearUiVal() {
            this.bitField0_ &= -2;
            this.uiVal_ = 0;
        }

        public static SKBuiltinUint8_t getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static SKBuiltinUint8_t parseDelimitedFrom(InputStream inputStream) {
            return (SKBuiltinUint8_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint8_t parseFrom(ByteBuffer byteBuffer) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<SKBuiltinUint8_t> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setUiVal(int i) {
            this.bitField0_ |= 1;
            this.uiVal_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            int i = 1;
            switch (fVar.ordinal()) {
                case 0:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 1:
                    if (obj == null) {
                        i = 0;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔋ\u0000", new Object[]{"bitField0_", "uiVal_"});
                case 3:
                    return new SKBuiltinUint8_t();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<SKBuiltinUint8_t> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (SKBuiltinUint8_t.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getUiVal() {
            return this.uiVal_;
        }

        public boolean hasUiVal() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(SKBuiltinUint8_t sKBuiltinUint8_t) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(sKBuiltinUint8_t);
        }

        public static SKBuiltinUint8_t parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint8_t) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint8_t parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static SKBuiltinUint8_t parseFrom(C16994k kVar) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static SKBuiltinUint8_t parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static SKBuiltinUint8_t parseFrom(byte[] bArr) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SKBuiltinUint8_t parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static SKBuiltinUint8_t parseFrom(InputStream inputStream) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SKBuiltinUint8_t parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static SKBuiltinUint8_t parseFrom(C23856l lVar) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static SKBuiltinUint8_t parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (SKBuiltinUint8_t) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$SKBuiltinUint8_tOrBuilder */
    public interface SKBuiltinUint8_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ViewMsgCard */
    public static final class ViewMsgCard extends C23861l0<ViewMsgCard, Builder> implements ViewMsgCardOrBuilder {
        public static final int BUFFER_FIELD_NUMBER = 4;
        public static final int CANVAS_REC_CARD_INFO_FIELD_NUMBER = 62;
        /* access modifiers changed from: private */
        public static final ViewMsgCard DEFAULT_INSTANCE;
        public static final int FRAME_SET_INFO_FIELD_NUMBER = 91;
        public static final int LOCAL_ID_FIELD_NUMBER = 2;
        public static final int MSG_TIME_FIELD_NUMBER = 5;
        public static final int MSG_TYPE_FIELD_NUMBER = 3;
        public static final int MSG_VIEW_TYPE_FIELD_NUMBER = 1;
        public static final int NATIVE_REC_CARD_INFO_FIELD_NUMBER = 61;
        private static volatile C24062w1<ViewMsgCard> PARSER = null;
        public static final int PIC_TYPE_FIELD_NUMBER = 31;
        public static final int WORDING_FIELD_NUMBER = 6;
        private int bitField0_;
        private String buffer_ = "";
        private CanvasRecCardInfo canvasRecCardInfo_;
        private FrameSetInfo frameSetInfo_;
        private long localId_;
        private int msgTime_;
        private int msgType_;
        private int msgViewType_;
        private NativeRecCardInfo nativeRecCardInfo_;
        private int picType_;
        private String wording_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ViewMsgCard$Builder */
        public static final class Builder extends C23861l0.C23862a<ViewMsgCard, Builder> implements ViewMsgCardOrBuilder {
            public /* synthetic */ Builder(C243681 r1) {
                this();
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearBuffer();
                return this;
            }

            public Builder clearCanvasRecCardInfo() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearCanvasRecCardInfo();
                return this;
            }

            public Builder clearFrameSetInfo() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearFrameSetInfo();
                return this;
            }

            public Builder clearLocalId() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearLocalId();
                return this;
            }

            public Builder clearMsgTime() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearMsgTime();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearMsgType();
                return this;
            }

            public Builder clearMsgViewType() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearMsgViewType();
                return this;
            }

            public Builder clearNativeRecCardInfo() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearNativeRecCardInfo();
                return this;
            }

            public Builder clearPicType() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearPicType();
                return this;
            }

            public Builder clearWording() {
                copyOnWrite();
                ((ViewMsgCard) this.instance).clearWording();
                return this;
            }

            public String getBuffer() {
                return ((ViewMsgCard) this.instance).getBuffer();
            }

            public C16994k getBufferBytes() {
                return ((ViewMsgCard) this.instance).getBufferBytes();
            }

            public CanvasRecCardInfo getCanvasRecCardInfo() {
                return ((ViewMsgCard) this.instance).getCanvasRecCardInfo();
            }

            public FrameSetInfo getFrameSetInfo() {
                return ((ViewMsgCard) this.instance).getFrameSetInfo();
            }

            public long getLocalId() {
                return ((ViewMsgCard) this.instance).getLocalId();
            }

            public int getMsgTime() {
                return ((ViewMsgCard) this.instance).getMsgTime();
            }

            public int getMsgType() {
                return ((ViewMsgCard) this.instance).getMsgType();
            }

            public int getMsgViewType() {
                return ((ViewMsgCard) this.instance).getMsgViewType();
            }

            public NativeRecCardInfo getNativeRecCardInfo() {
                return ((ViewMsgCard) this.instance).getNativeRecCardInfo();
            }

            public int getPicType() {
                return ((ViewMsgCard) this.instance).getPicType();
            }

            public String getWording() {
                return ((ViewMsgCard) this.instance).getWording();
            }

            public C16994k getWordingBytes() {
                return ((ViewMsgCard) this.instance).getWordingBytes();
            }

            public boolean hasBuffer() {
                return ((ViewMsgCard) this.instance).hasBuffer();
            }

            public boolean hasCanvasRecCardInfo() {
                return ((ViewMsgCard) this.instance).hasCanvasRecCardInfo();
            }

            public boolean hasFrameSetInfo() {
                return ((ViewMsgCard) this.instance).hasFrameSetInfo();
            }

            public boolean hasLocalId() {
                return ((ViewMsgCard) this.instance).hasLocalId();
            }

            public boolean hasMsgTime() {
                return ((ViewMsgCard) this.instance).hasMsgTime();
            }

            public boolean hasMsgType() {
                return ((ViewMsgCard) this.instance).hasMsgType();
            }

            public boolean hasMsgViewType() {
                return ((ViewMsgCard) this.instance).hasMsgViewType();
            }

            public boolean hasNativeRecCardInfo() {
                return ((ViewMsgCard) this.instance).hasNativeRecCardInfo();
            }

            public boolean hasPicType() {
                return ((ViewMsgCard) this.instance).hasPicType();
            }

            public boolean hasWording() {
                return ((ViewMsgCard) this.instance).hasWording();
            }

            public Builder mergeCanvasRecCardInfo(CanvasRecCardInfo canvasRecCardInfo) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).mergeCanvasRecCardInfo(canvasRecCardInfo);
                return this;
            }

            public Builder mergeFrameSetInfo(FrameSetInfo frameSetInfo) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).mergeFrameSetInfo(frameSetInfo);
                return this;
            }

            public Builder mergeNativeRecCardInfo(NativeRecCardInfo nativeRecCardInfo) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).mergeNativeRecCardInfo(nativeRecCardInfo);
                return this;
            }

            public Builder setBuffer(String str) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setBuffer(str);
                return this;
            }

            public Builder setBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setBufferBytes(kVar);
                return this;
            }

            public Builder setCanvasRecCardInfo(CanvasRecCardInfo canvasRecCardInfo) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setCanvasRecCardInfo(canvasRecCardInfo);
                return this;
            }

            public Builder setFrameSetInfo(FrameSetInfo frameSetInfo) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setFrameSetInfo(frameSetInfo);
                return this;
            }

            public Builder setLocalId(long j) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setLocalId(j);
                return this;
            }

            public Builder setMsgTime(int i) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setMsgTime(i);
                return this;
            }

            public Builder setMsgType(int i) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setMsgType(i);
                return this;
            }

            public Builder setMsgViewType(int i) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setMsgViewType(i);
                return this;
            }

            public Builder setNativeRecCardInfo(NativeRecCardInfo nativeRecCardInfo) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setNativeRecCardInfo(nativeRecCardInfo);
                return this;
            }

            public Builder setPicType(int i) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setPicType(i);
                return this;
            }

            public Builder setWording(String str) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setWording(str);
                return this;
            }

            public Builder setWordingBytes(C16994k kVar) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setWordingBytes(kVar);
                return this;
            }

            private Builder() {
                super(ViewMsgCard.DEFAULT_INSTANCE);
            }

            public Builder setCanvasRecCardInfo(CanvasRecCardInfo.Builder builder) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setCanvasRecCardInfo((CanvasRecCardInfo) builder.build());
                return this;
            }

            public Builder setFrameSetInfo(FrameSetInfo.Builder builder) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setFrameSetInfo((FrameSetInfo) builder.build());
                return this;
            }

            public Builder setNativeRecCardInfo(NativeRecCardInfo.Builder builder) {
                copyOnWrite();
                ((ViewMsgCard) this.instance).setNativeRecCardInfo((NativeRecCardInfo) builder.build());
                return this;
            }
        }

        static {
            ViewMsgCard viewMsgCard = new ViewMsgCard();
            DEFAULT_INSTANCE = viewMsgCard;
            C23861l0.registerDefaultInstance(ViewMsgCard.class, viewMsgCard);
        }

        private ViewMsgCard() {
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -9;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearCanvasRecCardInfo() {
            this.canvasRecCardInfo_ = null;
            this.bitField0_ &= -257;
        }

        /* access modifiers changed from: private */
        public void clearFrameSetInfo() {
            this.frameSetInfo_ = null;
            this.bitField0_ &= -513;
        }

        /* access modifiers changed from: private */
        public void clearLocalId() {
            this.bitField0_ &= -3;
            this.localId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgTime() {
            this.bitField0_ &= -17;
            this.msgTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgType() {
            this.bitField0_ &= -5;
            this.msgType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgViewType() {
            this.bitField0_ &= -2;
            this.msgViewType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNativeRecCardInfo() {
            this.nativeRecCardInfo_ = null;
            this.bitField0_ &= -129;
        }

        /* access modifiers changed from: private */
        public void clearPicType() {
            this.bitField0_ &= -65;
            this.picType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWording() {
            this.bitField0_ &= -33;
            this.wording_ = getDefaultInstance().getWording();
        }

        public static ViewMsgCard getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCanvasRecCardInfo(CanvasRecCardInfo canvasRecCardInfo) {
            canvasRecCardInfo.getClass();
            CanvasRecCardInfo canvasRecCardInfo2 = this.canvasRecCardInfo_;
            if (canvasRecCardInfo2 == null || canvasRecCardInfo2 == CanvasRecCardInfo.getDefaultInstance()) {
                this.canvasRecCardInfo_ = canvasRecCardInfo;
            } else {
                this.canvasRecCardInfo_ = (CanvasRecCardInfo) ((CanvasRecCardInfo.Builder) CanvasRecCardInfo.newBuilder(this.canvasRecCardInfo_).mergeFrom(canvasRecCardInfo)).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void mergeFrameSetInfo(FrameSetInfo frameSetInfo) {
            frameSetInfo.getClass();
            FrameSetInfo frameSetInfo2 = this.frameSetInfo_;
            if (frameSetInfo2 == null || frameSetInfo2 == FrameSetInfo.getDefaultInstance()) {
                this.frameSetInfo_ = frameSetInfo;
            } else {
                this.frameSetInfo_ = (FrameSetInfo) ((FrameSetInfo.Builder) FrameSetInfo.newBuilder(this.frameSetInfo_).mergeFrom(frameSetInfo)).buildPartial();
            }
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void mergeNativeRecCardInfo(NativeRecCardInfo nativeRecCardInfo) {
            nativeRecCardInfo.getClass();
            NativeRecCardInfo nativeRecCardInfo2 = this.nativeRecCardInfo_;
            if (nativeRecCardInfo2 == null || nativeRecCardInfo2 == NativeRecCardInfo.getDefaultInstance()) {
                this.nativeRecCardInfo_ = nativeRecCardInfo;
            } else {
                this.nativeRecCardInfo_ = (NativeRecCardInfo) ((NativeRecCardInfo.Builder) NativeRecCardInfo.newBuilder(this.nativeRecCardInfo_).mergeFrom(nativeRecCardInfo)).buildPartial();
            }
            this.bitField0_ |= 128;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ViewMsgCard parseDelimitedFrom(InputStream inputStream) {
            return (ViewMsgCard) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViewMsgCard parseFrom(ByteBuffer byteBuffer) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<ViewMsgCard> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.buffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setBufferBytes(C16994k kVar) {
            this.buffer_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setCanvasRecCardInfo(CanvasRecCardInfo canvasRecCardInfo) {
            canvasRecCardInfo.getClass();
            this.canvasRecCardInfo_ = canvasRecCardInfo;
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setFrameSetInfo(FrameSetInfo frameSetInfo) {
            frameSetInfo.getClass();
            this.frameSetInfo_ = frameSetInfo;
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setLocalId(long j) {
            this.bitField0_ |= 2;
            this.localId_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgTime(int i) {
            this.bitField0_ |= 16;
            this.msgTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgType(int i) {
            this.bitField0_ |= 4;
            this.msgType_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgViewType(int i) {
            this.bitField0_ |= 1;
            this.msgViewType_ = i;
        }

        /* access modifiers changed from: private */
        public void setNativeRecCardInfo(NativeRecCardInfo nativeRecCardInfo) {
            nativeRecCardInfo.getClass();
            this.nativeRecCardInfo_ = nativeRecCardInfo;
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setPicType(int i) {
            this.bitField0_ |= 64;
            this.picType_ = i;
        }

        /* access modifiers changed from: private */
        public void setWording(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.wording_ = str;
        }

        /* access modifiers changed from: private */
        public void setWordingBytes(C16994k kVar) {
            this.wording_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001[\n\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u001fဋ\u0006=ဉ\u0007>ဉ\b[ဉ\t", new Object[]{"bitField0_", "msgViewType_", "localId_", "msgType_", "buffer_", "msgTime_", "wording_", "picType_", "nativeRecCardInfo_", "canvasRecCardInfo_", "frameSetInfo_"});
                case 3:
                    return new ViewMsgCard();
                case 4:
                    return new Builder((C243681) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<ViewMsgCard> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ViewMsgCard.class) {
                            w1Var = PARSER;
                            if (w1Var == null) {
                                w1Var = new C23861l0.C23863b<>(DEFAULT_INSTANCE);
                                PARSER = w1Var;
                            }
                        }
                    }
                    return w1Var;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getBuffer() {
            return this.buffer_;
        }

        public C16994k getBufferBytes() {
            return C16994k.m16791k(this.buffer_);
        }

        public CanvasRecCardInfo getCanvasRecCardInfo() {
            CanvasRecCardInfo canvasRecCardInfo = this.canvasRecCardInfo_;
            return canvasRecCardInfo == null ? CanvasRecCardInfo.getDefaultInstance() : canvasRecCardInfo;
        }

        public FrameSetInfo getFrameSetInfo() {
            FrameSetInfo frameSetInfo = this.frameSetInfo_;
            return frameSetInfo == null ? FrameSetInfo.getDefaultInstance() : frameSetInfo;
        }

        public long getLocalId() {
            return this.localId_;
        }

        public int getMsgTime() {
            return this.msgTime_;
        }

        public int getMsgType() {
            return this.msgType_;
        }

        public int getMsgViewType() {
            return this.msgViewType_;
        }

        public NativeRecCardInfo getNativeRecCardInfo() {
            NativeRecCardInfo nativeRecCardInfo = this.nativeRecCardInfo_;
            return nativeRecCardInfo == null ? NativeRecCardInfo.getDefaultInstance() : nativeRecCardInfo;
        }

        public int getPicType() {
            return this.picType_;
        }

        public String getWording() {
            return this.wording_;
        }

        public C16994k getWordingBytes() {
            return C16994k.m16791k(this.wording_);
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasCanvasRecCardInfo() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasFrameSetInfo() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasLocalId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgTime() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasMsgType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMsgViewType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasNativeRecCardInfo() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasPicType() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasWording() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(ViewMsgCard viewMsgCard) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(viewMsgCard);
        }

        public static ViewMsgCard parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ViewMsgCard) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ViewMsgCard parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ViewMsgCard parseFrom(C16994k kVar) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ViewMsgCard parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ViewMsgCard parseFrom(byte[] bArr) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ViewMsgCard parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ViewMsgCard parseFrom(InputStream inputStream) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ViewMsgCard parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ViewMsgCard parseFrom(C23856l lVar) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ViewMsgCard parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ViewMsgCard) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizCgiProto$ViewMsgCardOrBuilder */
    public interface ViewMsgCardOrBuilder extends C23848k1 {
        String getBuffer();

        C16994k getBufferBytes();

        CanvasRecCardInfo getCanvasRecCardInfo();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FrameSetInfo getFrameSetInfo();

        long getLocalId();

        int getMsgTime();

        int getMsgType();

        int getMsgViewType();

        NativeRecCardInfo getNativeRecCardInfo();

        int getPicType();

        String getWording();

        C16994k getWordingBytes();

        boolean hasBuffer();

        boolean hasCanvasRecCardInfo();

        boolean hasFrameSetInfo();

        boolean hasLocalId();

        boolean hasMsgTime();

        boolean hasMsgType();

        boolean hasMsgViewType();

        boolean hasNativeRecCardInfo();

        boolean hasPicType();

        boolean hasWording();

        /* synthetic */ boolean isInitialized();
    }

    private BizCgiProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
