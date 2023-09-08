package com.tencent.wechat.aff.ting;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C24062w1;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MMBaseProto {

    /* renamed from: com.tencent.wechat.aff.ting.MMBaseProto$1 */
    public static /* synthetic */ class C243091 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69810xa1df5c61;

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
                f69810xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69810xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69810xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69810xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69810xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69810xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69810xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ting.MMBaseProto.C243091.<clinit>():void");
        }
    }

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

        public static final class Builder extends C23861l0.C23862a<BaseRequest, Builder> implements BaseRequestOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

        public static final class Builder extends C23861l0.C23862a<BaseResponse, Builder> implements BaseResponseOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface BaseResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        SKBuiltinString_t getErrMsg();

        int getRet();

        boolean hasErrMsg();

        boolean hasRet();

        /* synthetic */ boolean isInitialized();
    }

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

        public static final class Builder extends C23861l0.C23862a<SKBuiltinBuffer_t, Builder> implements SKBuiltinBuffer_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinBuffer_tOrBuilder extends C23848k1 {
        C16994k getBuffer();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getILen();

        boolean hasBuffer();

        boolean hasILen();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinChar_t extends C23861l0<SKBuiltinChar_t, Builder> implements SKBuiltinChar_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinChar_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinChar_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinChar_t, Builder> implements SKBuiltinChar_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinChar_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinDouble64_t extends C23861l0<SKBuiltinDouble64_t, Builder> implements SKBuiltinDouble64_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinDouble64_t DEFAULT_INSTANCE;
        public static final int DVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinDouble64_t> PARSER;
        private int bitField0_;
        private double dVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinDouble64_t, Builder> implements SKBuiltinDouble64_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinDouble64_tOrBuilder extends C23848k1 {
        double getDVal();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasDVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinFloat32_t extends C23861l0<SKBuiltinFloat32_t, Builder> implements SKBuiltinFloat32_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinFloat32_t DEFAULT_INSTANCE;
        public static final int FVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinFloat32_t> PARSER;
        private int bitField0_;
        private float fVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinFloat32_t, Builder> implements SKBuiltinFloat32_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinFloat32_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        float getFVal();

        boolean hasFVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinInt16_t extends C23861l0<SKBuiltinInt16_t, Builder> implements SKBuiltinInt16_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt16_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt16_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt16_t, Builder> implements SKBuiltinInt16_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinInt16_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinInt32_t extends C23861l0<SKBuiltinInt32_t, Builder> implements SKBuiltinInt32_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt32_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt32_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt32_t, Builder> implements SKBuiltinInt32_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinInt32_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinInt64_t extends C23861l0<SKBuiltinInt64_t, Builder> implements SKBuiltinInt64_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt64_t DEFAULT_INSTANCE;
        public static final int LLVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt64_t> PARSER;
        private int bitField0_;
        private long llVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt64_t, Builder> implements SKBuiltinInt64_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinInt64_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getLlVal();

        boolean hasLlVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinInt8_t extends C23861l0<SKBuiltinInt8_t, Builder> implements SKBuiltinInt8_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinInt8_t DEFAULT_INSTANCE;
        public static final int IVAL_FIELD_NUMBER = 1;
        private static volatile C24062w1<SKBuiltinInt8_t> PARSER;
        private int bitField0_;
        private int iVal_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinInt8_t, Builder> implements SKBuiltinInt8_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinInt8_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getIVal();

        boolean hasIVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinString_t extends C23861l0<SKBuiltinString_t, Builder> implements SKBuiltinString_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinString_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinString_t> PARSER = null;
        public static final int STRING_FIELD_NUMBER = 1;
        private int bitField0_;
        private String string_ = "";

        public static final class Builder extends C23861l0.C23862a<SKBuiltinString_t, Builder> implements SKBuiltinString_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinString_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getString();

        C16994k getStringBytes();

        boolean hasString();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinUchar_t extends C23861l0<SKBuiltinUchar_t, Builder> implements SKBuiltinUchar_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUchar_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUchar_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinUchar_t, Builder> implements SKBuiltinUchar_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinUchar_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinUint16_t extends C23861l0<SKBuiltinUint16_t, Builder> implements SKBuiltinUint16_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint16_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint16_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint16_t, Builder> implements SKBuiltinUint16_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinUint16_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinUint32_t extends C23861l0<SKBuiltinUint32_t, Builder> implements SKBuiltinUint32_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint32_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint32_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint32_t, Builder> implements SKBuiltinUint32_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinUint32_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinUint64_t extends C23861l0<SKBuiltinUint64_t, Builder> implements SKBuiltinUint64_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint64_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint64_t> PARSER = null;
        public static final int ULLVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private long ullVal_;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint64_t, Builder> implements SKBuiltinUint64_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinUint64_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getUllVal();

        boolean hasUllVal();

        /* synthetic */ boolean isInitialized();
    }

    public static final class SKBuiltinUint8_t extends C23861l0<SKBuiltinUint8_t, Builder> implements SKBuiltinUint8_tOrBuilder {
        /* access modifiers changed from: private */
        public static final SKBuiltinUint8_t DEFAULT_INSTANCE;
        private static volatile C24062w1<SKBuiltinUint8_t> PARSER = null;
        public static final int UIVAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int uiVal_;

        public static final class Builder extends C23861l0.C23862a<SKBuiltinUint8_t, Builder> implements SKBuiltinUint8_tOrBuilder {
            public /* synthetic */ Builder(C243091 r1) {
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
                    return new Builder((C243091) null);
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

    public interface SKBuiltinUint8_tOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getUiVal();

        boolean hasUiVal();

        /* synthetic */ boolean isInitialized();
    }

    private MMBaseProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
