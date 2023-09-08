package com.tencent.ilink.auth;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24062w1;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class Proto {

    /* renamed from: com.tencent.ilink.auth.Proto$1 */
    public static /* synthetic */ class C241071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69250xa1df5c61;

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
                f69250xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69250xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69250xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69250xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69250xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69250xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69250xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.ilink.auth.Proto.C241071.<clinit>():void");
        }
    }

    public enum IlinkAppLoginType implements C23908o0.C23911c {
        kILinkAppLoginType_WxPay(1),
        kILinkAppLoginType_WxBase(2),
        kILinkAppLoginType_WxOAuth(4);
        
        private static final C23908o0.C23912d<IlinkAppLoginType> internalValueMap = null;
        public static final int kILinkAppLoginType_WxBase_VALUE = 2;
        public static final int kILinkAppLoginType_WxOAuth_VALUE = 4;
        public static final int kILinkAppLoginType_WxPay_VALUE = 1;
        private final int value;

        public static final class IlinkAppLoginTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkAppLoginTypeVerifier();
            }

            private IlinkAppLoginTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkAppLoginType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkAppLoginType>() {
                public IlinkAppLoginType findValueByNumber(int i) {
                    return IlinkAppLoginType.forNumber(i);
                }
            };
        }

        private IlinkAppLoginType(int i) {
            this.value = i;
        }

        public static IlinkAppLoginType forNumber(int i) {
            if (i == 1) {
                return kILinkAppLoginType_WxPay;
            }
            if (i == 2) {
                return kILinkAppLoginType_WxBase;
            }
            if (i != 4) {
                return null;
            }
            return kILinkAppLoginType_WxOAuth;
        }

        public static C23908o0.C23912d<IlinkAppLoginType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkAppLoginTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkAppLoginType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkAppMessage extends C23861l0<IlinkAppMessage, Builder> implements IlinkAppMessageOrBuilder {
        public static final int BODY_FIELD_NUMBER = 3;
        public static final int CREATE_TIME_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final IlinkAppMessage DEFAULT_INSTANCE;
        public static final int MSGID_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkAppMessage> PARSER;
        private int bitField0_;
        private C16994k body_ = C16994k.f46000e;
        private long createTime_;
        private long msgid_;

        public static final class Builder extends C23861l0.C23862a<IlinkAppMessage, Builder> implements IlinkAppMessageOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((IlinkAppMessage) this.instance).clearBody();
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((IlinkAppMessage) this.instance).clearCreateTime();
                return this;
            }

            public Builder clearMsgid() {
                copyOnWrite();
                ((IlinkAppMessage) this.instance).clearMsgid();
                return this;
            }

            public C16994k getBody() {
                return ((IlinkAppMessage) this.instance).getBody();
            }

            public long getCreateTime() {
                return ((IlinkAppMessage) this.instance).getCreateTime();
            }

            public long getMsgid() {
                return ((IlinkAppMessage) this.instance).getMsgid();
            }

            public boolean hasBody() {
                return ((IlinkAppMessage) this.instance).hasBody();
            }

            public boolean hasCreateTime() {
                return ((IlinkAppMessage) this.instance).hasCreateTime();
            }

            public boolean hasMsgid() {
                return ((IlinkAppMessage) this.instance).hasMsgid();
            }

            public Builder setBody(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppMessage) this.instance).setBody(kVar);
                return this;
            }

            public Builder setCreateTime(long j) {
                copyOnWrite();
                ((IlinkAppMessage) this.instance).setCreateTime(j);
                return this;
            }

            public Builder setMsgid(long j) {
                copyOnWrite();
                ((IlinkAppMessage) this.instance).setMsgid(j);
                return this;
            }

            private Builder() {
                super(IlinkAppMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppMessage ilinkAppMessage = new IlinkAppMessage();
            DEFAULT_INSTANCE = ilinkAppMessage;
            C23861l0.registerDefaultInstance(IlinkAppMessage.class, ilinkAppMessage);
        }

        private IlinkAppMessage() {
        }

        /* access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -5;
            this.body_ = getDefaultInstance().getBody();
        }

        /* access modifiers changed from: private */
        public void clearCreateTime() {
            this.bitField0_ &= -3;
            this.createTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgid() {
            this.bitField0_ &= -2;
            this.msgid_ = 0;
        }

        public static IlinkAppMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppMessage parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppMessage) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppMessage parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAppMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBody(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.body_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCreateTime(long j) {
            this.bitField0_ |= 2;
            this.createTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgid(long j) {
            this.bitField0_ |= 1;
            this.msgid_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "msgid_", "createTime_", "body_"});
                case 3:
                    return new IlinkAppMessage();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAppMessage> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppMessage.class) {
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

        public C16994k getBody() {
            return this.body_;
        }

        public long getCreateTime() {
            return this.createTime_;
        }

        public long getMsgid() {
            return this.msgid_;
        }

        public boolean hasBody() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCreateTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkAppMessage ilinkAppMessage) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAppMessage);
        }

        public static IlinkAppMessage parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppMessage) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppMessage parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppMessage parseFrom(C16994k kVar) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppMessage parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppMessage parseFrom(byte[] bArr) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppMessage parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppMessage parseFrom(InputStream inputStream) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppMessage parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppMessage parseFrom(C23856l lVar) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppMessage parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAppMessage) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAppMessageOrBuilder extends C23848k1 {
        C16994k getBody();

        long getCreateTime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getMsgid();

        boolean hasBody();

        boolean hasCreateTime();

        boolean hasMsgid();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkCancelOAuthRequest extends C23861l0<IlinkCancelOAuthRequest, Builder> implements IlinkCancelOAuthRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkCancelOAuthRequest DEFAULT_INSTANCE;
        public static final int ILINK_APPID_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkCancelOAuthRequest> PARSER;
        private C23908o0.C23919j<String> ilinkAppidList_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<IlinkCancelOAuthRequest, Builder> implements IlinkCancelOAuthRequestOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder addAllIlinkAppidList(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkCancelOAuthRequest) this.instance).addAllIlinkAppidList(iterable);
                return this;
            }

            public Builder addIlinkAppidList(String str) {
                copyOnWrite();
                ((IlinkCancelOAuthRequest) this.instance).addIlinkAppidList(str);
                return this;
            }

            public Builder addIlinkAppidListBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkCancelOAuthRequest) this.instance).addIlinkAppidListBytes(kVar);
                return this;
            }

            public Builder clearIlinkAppidList() {
                copyOnWrite();
                ((IlinkCancelOAuthRequest) this.instance).clearIlinkAppidList();
                return this;
            }

            public String getIlinkAppidList(int i) {
                return ((IlinkCancelOAuthRequest) this.instance).getIlinkAppidList(i);
            }

            public C16994k getIlinkAppidListBytes(int i) {
                return ((IlinkCancelOAuthRequest) this.instance).getIlinkAppidListBytes(i);
            }

            public int getIlinkAppidListCount() {
                return ((IlinkCancelOAuthRequest) this.instance).getIlinkAppidListCount();
            }

            public List<String> getIlinkAppidListList() {
                return Collections.unmodifiableList(((IlinkCancelOAuthRequest) this.instance).getIlinkAppidListList());
            }

            public Builder setIlinkAppidList(int i, String str) {
                copyOnWrite();
                ((IlinkCancelOAuthRequest) this.instance).setIlinkAppidList(i, str);
                return this;
            }

            private Builder() {
                super(IlinkCancelOAuthRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkCancelOAuthRequest ilinkCancelOAuthRequest = new IlinkCancelOAuthRequest();
            DEFAULT_INSTANCE = ilinkCancelOAuthRequest;
            C23861l0.registerDefaultInstance(IlinkCancelOAuthRequest.class, ilinkCancelOAuthRequest);
        }

        private IlinkCancelOAuthRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllIlinkAppidList(Iterable<String> iterable) {
            ensureIlinkAppidListIsMutable();
            C23810b.addAll(iterable, this.ilinkAppidList_);
        }

        /* access modifiers changed from: private */
        public void addIlinkAppidList(String str) {
            str.getClass();
            ensureIlinkAppidListIsMutable();
            this.ilinkAppidList_.add(str);
        }

        /* access modifiers changed from: private */
        public void addIlinkAppidListBytes(C16994k kVar) {
            ensureIlinkAppidListIsMutable();
            this.ilinkAppidList_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearIlinkAppidList() {
            this.ilinkAppidList_ = C23861l0.emptyProtobufList();
        }

        private void ensureIlinkAppidListIsMutable() {
            C23908o0.C23919j<String> jVar = this.ilinkAppidList_;
            if (!jVar.mo37523Q()) {
                this.ilinkAppidList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static IlinkCancelOAuthRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkCancelOAuthRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkCancelOAuthRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCancelOAuthRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkCancelOAuthRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIlinkAppidList(int i, String str) {
            str.getClass();
            ensureIlinkAppidListIsMutable();
            this.ilinkAppidList_.set(i, str);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"ilinkAppidList_"});
                case 3:
                    return new IlinkCancelOAuthRequest();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkCancelOAuthRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkCancelOAuthRequest.class) {
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

        public String getIlinkAppidList(int i) {
            return this.ilinkAppidList_.get(i);
        }

        public C16994k getIlinkAppidListBytes(int i) {
            return C16994k.m16791k(this.ilinkAppidList_.get(i));
        }

        public int getIlinkAppidListCount() {
            return this.ilinkAppidList_.size();
        }

        public List<String> getIlinkAppidListList() {
            return this.ilinkAppidList_;
        }

        public static Builder newBuilder(IlinkCancelOAuthRequest ilinkCancelOAuthRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkCancelOAuthRequest);
        }

        public static IlinkCancelOAuthRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkCancelOAuthRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCancelOAuthRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkCancelOAuthRequest parseFrom(C16994k kVar) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkCancelOAuthRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkCancelOAuthRequest parseFrom(byte[] bArr) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkCancelOAuthRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkCancelOAuthRequest parseFrom(InputStream inputStream) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCancelOAuthRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCancelOAuthRequest parseFrom(C23856l lVar) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkCancelOAuthRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkCancelOAuthRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkCancelOAuthRequestOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIlinkAppidList(int i);

        C16994k getIlinkAppidListBytes(int i);

        int getIlinkAppidListCount();

        List<String> getIlinkAppidListList();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkCancelType implements C23908o0.C23911c {
        kIlinkCancelUnknown(-1),
        kIlinkCancelAll(0),
        kIlinkCancelFaceRecognizeConfig(1),
        kIlinkCancelFaceRecognize(2),
        kIlinkCancelFaceExtVerify(3),
        kIlinkCancelFaceLogin(4),
        kIlinkCancelGetLoginQrCode(5),
        kIlinkCancelCheckLoginQrCode(6),
        kIlinkCancelQrCodeLogin(7),
        kIlinkCancelAutoLogin(8),
        kIlinkCancelLogout(9),
        kIlinkCancelGetAppPushToken(10),
        kIlinkCancelOAuthLogin(11),
        kIlinkCancelThirdAppLogin(12),
        kIlinkCancelVisitorLogin(13),
        kIlinkCancelDeviceLogin(14);
        
        private static final C23908o0.C23912d<IlinkCancelType> internalValueMap = null;
        public static final int kIlinkCancelAll_VALUE = 0;
        public static final int kIlinkCancelAutoLogin_VALUE = 8;
        public static final int kIlinkCancelCheckLoginQrCode_VALUE = 6;
        public static final int kIlinkCancelDeviceLogin_VALUE = 14;
        public static final int kIlinkCancelFaceExtVerify_VALUE = 3;
        public static final int kIlinkCancelFaceLogin_VALUE = 4;
        public static final int kIlinkCancelFaceRecognizeConfig_VALUE = 1;
        public static final int kIlinkCancelFaceRecognize_VALUE = 2;
        public static final int kIlinkCancelGetAppPushToken_VALUE = 10;
        public static final int kIlinkCancelGetLoginQrCode_VALUE = 5;
        public static final int kIlinkCancelLogout_VALUE = 9;
        public static final int kIlinkCancelOAuthLogin_VALUE = 11;
        public static final int kIlinkCancelQrCodeLogin_VALUE = 7;
        public static final int kIlinkCancelThirdAppLogin_VALUE = 12;
        public static final int kIlinkCancelUnknown_VALUE = -1;
        public static final int kIlinkCancelVisitorLogin_VALUE = 13;
        private final int value;

        public static final class IlinkCancelTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkCancelTypeVerifier();
            }

            private IlinkCancelTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkCancelType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkCancelType>() {
                public IlinkCancelType findValueByNumber(int i) {
                    return IlinkCancelType.forNumber(i);
                }
            };
        }

        private IlinkCancelType(int i) {
            this.value = i;
        }

        public static IlinkCancelType forNumber(int i) {
            switch (i) {
                case -1:
                    return kIlinkCancelUnknown;
                case 0:
                    return kIlinkCancelAll;
                case 1:
                    return kIlinkCancelFaceRecognizeConfig;
                case 2:
                    return kIlinkCancelFaceRecognize;
                case 3:
                    return kIlinkCancelFaceExtVerify;
                case 4:
                    return kIlinkCancelFaceLogin;
                case 5:
                    return kIlinkCancelGetLoginQrCode;
                case 6:
                    return kIlinkCancelCheckLoginQrCode;
                case 7:
                    return kIlinkCancelQrCodeLogin;
                case 8:
                    return kIlinkCancelAutoLogin;
                case 9:
                    return kIlinkCancelLogout;
                case 10:
                    return kIlinkCancelGetAppPushToken;
                case 11:
                    return kIlinkCancelOAuthLogin;
                case 12:
                    return kIlinkCancelThirdAppLogin;
                case 13:
                    return kIlinkCancelVisitorLogin;
                case 14:
                    return kIlinkCancelDeviceLogin;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<IlinkCancelType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkCancelTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkCancelType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkCheckLoginQrCodeResponse extends C23861l0<IlinkCheckLoginQrCodeResponse, Builder> implements IlinkCheckLoginQrCodeResponseOrBuilder {
        public static final int AVATAR_URL_FIELD_NUMBER = 4;
        public static final int BUSINESS_CONFIRM_RESP_BUFFER_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final IlinkCheckLoginQrCodeResponse DEFAULT_INSTANCE;
        public static final int NICKNAME_FIELD_NUMBER = 3;
        private static volatile C24062w1<IlinkCheckLoginQrCodeResponse> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int UIN_FIELD_NUMBER = 2;
        private String avatarUrl_ = "";
        private int bitField0_;
        private C16994k businessConfirmRespBuffer_ = C16994k.f46000e;
        private String nickname_ = "";
        private int status_;
        private long uin_;

        public static final class Builder extends C23861l0.C23862a<IlinkCheckLoginQrCodeResponse, Builder> implements IlinkCheckLoginQrCodeResponseOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder clearBusinessConfirmRespBuffer() {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).clearBusinessConfirmRespBuffer();
                return this;
            }

            public Builder clearNickname() {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).clearNickname();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).clearStatus();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).clearUin();
                return this;
            }

            public String getAvatarUrl() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getAvatarUrl();
            }

            public C16994k getAvatarUrlBytes() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getAvatarUrlBytes();
            }

            public C16994k getBusinessConfirmRespBuffer() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getBusinessConfirmRespBuffer();
            }

            public String getNickname() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getNickname();
            }

            public C16994k getNicknameBytes() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getNicknameBytes();
            }

            public IlinkLoginQrCodeStatus getStatus() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getStatus();
            }

            public long getUin() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).getUin();
            }

            public boolean hasAvatarUrl() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).hasAvatarUrl();
            }

            public boolean hasBusinessConfirmRespBuffer() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).hasBusinessConfirmRespBuffer();
            }

            public boolean hasNickname() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).hasNickname();
            }

            public boolean hasStatus() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).hasStatus();
            }

            public boolean hasUin() {
                return ((IlinkCheckLoginQrCodeResponse) this.instance).hasUin();
            }

            public Builder setAvatarUrl(String str) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setAvatarUrl(str);
                return this;
            }

            public Builder setAvatarUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setAvatarUrlBytes(kVar);
                return this;
            }

            public Builder setBusinessConfirmRespBuffer(C16994k kVar) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setBusinessConfirmRespBuffer(kVar);
                return this;
            }

            public Builder setNickname(String str) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setNickname(str);
                return this;
            }

            public Builder setNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setNicknameBytes(kVar);
                return this;
            }

            public Builder setStatus(IlinkLoginQrCodeStatus ilinkLoginQrCodeStatus) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setStatus(ilinkLoginQrCodeStatus);
                return this;
            }

            public Builder setUin(long j) {
                copyOnWrite();
                ((IlinkCheckLoginQrCodeResponse) this.instance).setUin(j);
                return this;
            }

            private Builder() {
                super(IlinkCheckLoginQrCodeResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkCheckLoginQrCodeResponse ilinkCheckLoginQrCodeResponse = new IlinkCheckLoginQrCodeResponse();
            DEFAULT_INSTANCE = ilinkCheckLoginQrCodeResponse;
            C23861l0.registerDefaultInstance(IlinkCheckLoginQrCodeResponse.class, ilinkCheckLoginQrCodeResponse);
        }

        private IlinkCheckLoginQrCodeResponse() {
        }

        /* access modifiers changed from: private */
        public void clearAvatarUrl() {
            this.bitField0_ &= -9;
            this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
        }

        /* access modifiers changed from: private */
        public void clearBusinessConfirmRespBuffer() {
            this.bitField0_ &= -17;
            this.businessConfirmRespBuffer_ = getDefaultInstance().getBusinessConfirmRespBuffer();
        }

        /* access modifiers changed from: private */
        public void clearNickname() {
            this.bitField0_ &= -5;
            this.nickname_ = getDefaultInstance().getNickname();
        }

        /* access modifiers changed from: private */
        public void clearStatus() {
            this.bitField0_ &= -2;
            this.status_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -3;
            this.uin_ = 0;
        }

        public static IlinkCheckLoginQrCodeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkCheckLoginQrCodeResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkCheckLoginQrCodeResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAvatarUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.avatarUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setAvatarUrlBytes(C16994k kVar) {
            this.avatarUrl_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setBusinessConfirmRespBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.businessConfirmRespBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setNickname(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.nickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setNicknameBytes(C16994k kVar) {
            this.nickname_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setStatus(IlinkLoginQrCodeStatus ilinkLoginQrCodeStatus) {
            this.status_ = ilinkLoginQrCodeStatus.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setUin(long j) {
            this.bitField0_ |= 2;
            this.uin_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004", new Object[]{"bitField0_", "status_", IlinkLoginQrCodeStatus.internalGetVerifier(), "uin_", "nickname_", "avatarUrl_", "businessConfirmRespBuffer_"});
                case 3:
                    return new IlinkCheckLoginQrCodeResponse();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkCheckLoginQrCodeResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkCheckLoginQrCodeResponse.class) {
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

        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        public C16994k getAvatarUrlBytes() {
            return C16994k.m16791k(this.avatarUrl_);
        }

        public C16994k getBusinessConfirmRespBuffer() {
            return this.businessConfirmRespBuffer_;
        }

        public String getNickname() {
            return this.nickname_;
        }

        public C16994k getNicknameBytes() {
            return C16994k.m16791k(this.nickname_);
        }

        public IlinkLoginQrCodeStatus getStatus() {
            IlinkLoginQrCodeStatus forNumber = IlinkLoginQrCodeStatus.forNumber(this.status_);
            return forNumber == null ? IlinkLoginQrCodeStatus.kLoginQrCodeStatus_NoScan : forNumber;
        }

        public long getUin() {
            return this.uin_;
        }

        public boolean hasAvatarUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasBusinessConfirmRespBuffer() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasNickname() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUin() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkCheckLoginQrCodeResponse ilinkCheckLoginQrCodeResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkCheckLoginQrCodeResponse);
        }

        public static IlinkCheckLoginQrCodeResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(C16994k kVar) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(byte[] bArr) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(InputStream inputStream) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(C23856l lVar) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkCheckLoginQrCodeResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkCheckLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkCheckLoginQrCodeResponseOrBuilder extends C23848k1 {
        String getAvatarUrl();

        C16994k getAvatarUrlBytes();

        C16994k getBusinessConfirmRespBuffer();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getNickname();

        C16994k getNicknameBytes();

        IlinkLoginQrCodeStatus getStatus();

        long getUin();

        boolean hasAvatarUrl();

        boolean hasBusinessConfirmRespBuffer();

        boolean hasNickname();

        boolean hasStatus();

        boolean hasUin();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkDeviceLoginRequest extends C23861l0<IlinkDeviceLoginRequest, Builder> implements IlinkDeviceLoginRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkDeviceLoginRequest DEFAULT_INSTANCE;
        public static final int DEVICE_AUTH_TYPE_FIELD_NUMBER = 4;
        public static final int DEVICE_ID_FIELD_NUMBER = 2;
        public static final int DEVICE_SIGNATURE_FIELD_NUMBER = 3;
        public static final int DEVICE_SIGNATURE_TIMESTAMP_FIELD_NUMBER = 6;
        public static final int DEVICE_SIGNATURE_VERSION_FIELD_NUMBER = 5;
        private static volatile C24062w1<IlinkDeviceLoginRequest> PARSER = null;
        public static final int PRODUCT_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private int deviceAuthType_;
        private String deviceId_ = "";
        private int deviceSignatureTimestamp_;
        private int deviceSignatureVersion_;
        private String deviceSignature_ = "";
        private int productId_;

        public static final class Builder extends C23861l0.C23862a<IlinkDeviceLoginRequest, Builder> implements IlinkDeviceLoginRequestOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearDeviceAuthType() {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).clearDeviceAuthType();
                return this;
            }

            public Builder clearDeviceId() {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).clearDeviceId();
                return this;
            }

            public Builder clearDeviceSignature() {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).clearDeviceSignature();
                return this;
            }

            public Builder clearDeviceSignatureTimestamp() {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).clearDeviceSignatureTimestamp();
                return this;
            }

            public Builder clearDeviceSignatureVersion() {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).clearDeviceSignatureVersion();
                return this;
            }

            public Builder clearProductId() {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).clearProductId();
                return this;
            }

            public int getDeviceAuthType() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceAuthType();
            }

            public String getDeviceId() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceId();
            }

            public C16994k getDeviceIdBytes() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceIdBytes();
            }

            public String getDeviceSignature() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceSignature();
            }

            public C16994k getDeviceSignatureBytes() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceSignatureBytes();
            }

            public int getDeviceSignatureTimestamp() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceSignatureTimestamp();
            }

            public int getDeviceSignatureVersion() {
                return ((IlinkDeviceLoginRequest) this.instance).getDeviceSignatureVersion();
            }

            public int getProductId() {
                return ((IlinkDeviceLoginRequest) this.instance).getProductId();
            }

            public boolean hasDeviceAuthType() {
                return ((IlinkDeviceLoginRequest) this.instance).hasDeviceAuthType();
            }

            public boolean hasDeviceId() {
                return ((IlinkDeviceLoginRequest) this.instance).hasDeviceId();
            }

            public boolean hasDeviceSignature() {
                return ((IlinkDeviceLoginRequest) this.instance).hasDeviceSignature();
            }

            public boolean hasDeviceSignatureTimestamp() {
                return ((IlinkDeviceLoginRequest) this.instance).hasDeviceSignatureTimestamp();
            }

            public boolean hasDeviceSignatureVersion() {
                return ((IlinkDeviceLoginRequest) this.instance).hasDeviceSignatureVersion();
            }

            public boolean hasProductId() {
                return ((IlinkDeviceLoginRequest) this.instance).hasProductId();
            }

            public Builder setDeviceAuthType(int i) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceAuthType(i);
                return this;
            }

            public Builder setDeviceId(String str) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceId(str);
                return this;
            }

            public Builder setDeviceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceIdBytes(kVar);
                return this;
            }

            public Builder setDeviceSignature(String str) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceSignature(str);
                return this;
            }

            public Builder setDeviceSignatureBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceSignatureBytes(kVar);
                return this;
            }

            public Builder setDeviceSignatureTimestamp(int i) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceSignatureTimestamp(i);
                return this;
            }

            public Builder setDeviceSignatureVersion(int i) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setDeviceSignatureVersion(i);
                return this;
            }

            public Builder setProductId(int i) {
                copyOnWrite();
                ((IlinkDeviceLoginRequest) this.instance).setProductId(i);
                return this;
            }

            private Builder() {
                super(IlinkDeviceLoginRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkDeviceLoginRequest ilinkDeviceLoginRequest = new IlinkDeviceLoginRequest();
            DEFAULT_INSTANCE = ilinkDeviceLoginRequest;
            C23861l0.registerDefaultInstance(IlinkDeviceLoginRequest.class, ilinkDeviceLoginRequest);
        }

        private IlinkDeviceLoginRequest() {
        }

        /* access modifiers changed from: private */
        public void clearDeviceAuthType() {
            this.bitField0_ &= -9;
            this.deviceAuthType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeviceId() {
            this.bitField0_ &= -3;
            this.deviceId_ = getDefaultInstance().getDeviceId();
        }

        /* access modifiers changed from: private */
        public void clearDeviceSignature() {
            this.bitField0_ &= -5;
            this.deviceSignature_ = getDefaultInstance().getDeviceSignature();
        }

        /* access modifiers changed from: private */
        public void clearDeviceSignatureTimestamp() {
            this.bitField0_ &= -33;
            this.deviceSignatureTimestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeviceSignatureVersion() {
            this.bitField0_ &= -17;
            this.deviceSignatureVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearProductId() {
            this.bitField0_ &= -2;
            this.productId_ = 0;
        }

        public static IlinkDeviceLoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkDeviceLoginRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkDeviceLoginRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceLoginRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkDeviceLoginRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDeviceAuthType(int i) {
            this.bitField0_ |= 8;
            this.deviceAuthType_ = i;
        }

        /* access modifiers changed from: private */
        public void setDeviceId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.deviceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceIdBytes(C16994k kVar) {
            this.deviceId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setDeviceSignature(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.deviceSignature_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceSignatureBytes(C16994k kVar) {
            this.deviceSignature_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setDeviceSignatureTimestamp(int i) {
            this.bitField0_ |= 32;
            this.deviceSignatureTimestamp_ = i;
        }

        /* access modifiers changed from: private */
        public void setDeviceSignatureVersion(int i) {
            this.bitField0_ |= 16;
            this.deviceSignatureVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setProductId(int i) {
            this.bitField0_ |= 1;
            this.productId_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "productId_", "deviceId_", "deviceSignature_", "deviceAuthType_", "deviceSignatureVersion_", "deviceSignatureTimestamp_"});
                case 3:
                    return new IlinkDeviceLoginRequest();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkDeviceLoginRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkDeviceLoginRequest.class) {
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

        public int getDeviceAuthType() {
            return this.deviceAuthType_;
        }

        public String getDeviceId() {
            return this.deviceId_;
        }

        public C16994k getDeviceIdBytes() {
            return C16994k.m16791k(this.deviceId_);
        }

        public String getDeviceSignature() {
            return this.deviceSignature_;
        }

        public C16994k getDeviceSignatureBytes() {
            return C16994k.m16791k(this.deviceSignature_);
        }

        public int getDeviceSignatureTimestamp() {
            return this.deviceSignatureTimestamp_;
        }

        public int getDeviceSignatureVersion() {
            return this.deviceSignatureVersion_;
        }

        public int getProductId() {
            return this.productId_;
        }

        public boolean hasDeviceAuthType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDeviceId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDeviceSignature() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDeviceSignatureTimestamp() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDeviceSignatureVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasProductId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkDeviceLoginRequest ilinkDeviceLoginRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkDeviceLoginRequest);
        }

        public static IlinkDeviceLoginRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkDeviceLoginRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceLoginRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkDeviceLoginRequest parseFrom(C16994k kVar) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkDeviceLoginRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkDeviceLoginRequest parseFrom(byte[] bArr) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkDeviceLoginRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkDeviceLoginRequest parseFrom(InputStream inputStream) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceLoginRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceLoginRequest parseFrom(C23856l lVar) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkDeviceLoginRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkDeviceLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkDeviceLoginRequestOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDeviceAuthType();

        String getDeviceId();

        C16994k getDeviceIdBytes();

        String getDeviceSignature();

        C16994k getDeviceSignatureBytes();

        int getDeviceSignatureTimestamp();

        int getDeviceSignatureVersion();

        int getProductId();

        boolean hasDeviceAuthType();

        boolean hasDeviceId();

        boolean hasDeviceSignature();

        boolean hasDeviceSignatureTimestamp();

        boolean hasDeviceSignatureVersion();

        boolean hasProductId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkDeviceLoginResponse extends C23861l0<IlinkDeviceLoginResponse, Builder> implements IlinkDeviceLoginResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkDeviceLoginResponse DEFAULT_INSTANCE;
        public static final int ILINK_ID_FIELD_NUMBER = 2;
        public static final int ILINK_SN_FIELD_NUMBER = 1;
        public static final int ILINK_TOKEN_FIELD_NUMBER = 3;
        private static volatile C24062w1<IlinkDeviceLoginResponse> PARSER = null;
        public static final int SESSION_FIELD_NUMBER = 4;
        private int bitField0_;
        private String ilinkId_ = "";
        private String ilinkSn_ = "";
        private String ilinkToken_ = "";
        private C16994k session_ = C16994k.f46000e;

        public static final class Builder extends C23861l0.C23862a<IlinkDeviceLoginResponse, Builder> implements IlinkDeviceLoginResponseOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearIlinkId() {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).clearIlinkId();
                return this;
            }

            public Builder clearIlinkSn() {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).clearIlinkSn();
                return this;
            }

            public Builder clearIlinkToken() {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).clearIlinkToken();
                return this;
            }

            public Builder clearSession() {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).clearSession();
                return this;
            }

            public String getIlinkId() {
                return ((IlinkDeviceLoginResponse) this.instance).getIlinkId();
            }

            public C16994k getIlinkIdBytes() {
                return ((IlinkDeviceLoginResponse) this.instance).getIlinkIdBytes();
            }

            public String getIlinkSn() {
                return ((IlinkDeviceLoginResponse) this.instance).getIlinkSn();
            }

            public C16994k getIlinkSnBytes() {
                return ((IlinkDeviceLoginResponse) this.instance).getIlinkSnBytes();
            }

            public String getIlinkToken() {
                return ((IlinkDeviceLoginResponse) this.instance).getIlinkToken();
            }

            public C16994k getIlinkTokenBytes() {
                return ((IlinkDeviceLoginResponse) this.instance).getIlinkTokenBytes();
            }

            public C16994k getSession() {
                return ((IlinkDeviceLoginResponse) this.instance).getSession();
            }

            public boolean hasIlinkId() {
                return ((IlinkDeviceLoginResponse) this.instance).hasIlinkId();
            }

            public boolean hasIlinkSn() {
                return ((IlinkDeviceLoginResponse) this.instance).hasIlinkSn();
            }

            public boolean hasIlinkToken() {
                return ((IlinkDeviceLoginResponse) this.instance).hasIlinkToken();
            }

            public boolean hasSession() {
                return ((IlinkDeviceLoginResponse) this.instance).hasSession();
            }

            public Builder setIlinkId(String str) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setIlinkId(str);
                return this;
            }

            public Builder setIlinkIdBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setIlinkIdBytes(kVar);
                return this;
            }

            public Builder setIlinkSn(String str) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setIlinkSn(str);
                return this;
            }

            public Builder setIlinkSnBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setIlinkSnBytes(kVar);
                return this;
            }

            public Builder setIlinkToken(String str) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setIlinkToken(str);
                return this;
            }

            public Builder setIlinkTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setIlinkTokenBytes(kVar);
                return this;
            }

            public Builder setSession(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceLoginResponse) this.instance).setSession(kVar);
                return this;
            }

            private Builder() {
                super(IlinkDeviceLoginResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkDeviceLoginResponse ilinkDeviceLoginResponse = new IlinkDeviceLoginResponse();
            DEFAULT_INSTANCE = ilinkDeviceLoginResponse;
            C23861l0.registerDefaultInstance(IlinkDeviceLoginResponse.class, ilinkDeviceLoginResponse);
        }

        private IlinkDeviceLoginResponse() {
        }

        /* access modifiers changed from: private */
        public void clearIlinkId() {
            this.bitField0_ &= -3;
            this.ilinkId_ = getDefaultInstance().getIlinkId();
        }

        /* access modifiers changed from: private */
        public void clearIlinkSn() {
            this.bitField0_ &= -2;
            this.ilinkSn_ = getDefaultInstance().getIlinkSn();
        }

        /* access modifiers changed from: private */
        public void clearIlinkToken() {
            this.bitField0_ &= -5;
            this.ilinkToken_ = getDefaultInstance().getIlinkToken();
        }

        /* access modifiers changed from: private */
        public void clearSession() {
            this.bitField0_ &= -9;
            this.session_ = getDefaultInstance().getSession();
        }

        public static IlinkDeviceLoginResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkDeviceLoginResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkDeviceLoginResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceLoginResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkDeviceLoginResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIlinkId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.ilinkId_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkIdBytes(C16994k kVar) {
            this.ilinkId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setIlinkSn(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.ilinkSn_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkSnBytes(C16994k kVar) {
            this.ilinkSn_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setIlinkToken(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.ilinkToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkTokenBytes(C16994k kVar) {
            this.ilinkToken_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setSession(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.session_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"bitField0_", "ilinkSn_", "ilinkId_", "ilinkToken_", "session_"});
                case 3:
                    return new IlinkDeviceLoginResponse();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkDeviceLoginResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkDeviceLoginResponse.class) {
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

        public String getIlinkId() {
            return this.ilinkId_;
        }

        public C16994k getIlinkIdBytes() {
            return C16994k.m16791k(this.ilinkId_);
        }

        public String getIlinkSn() {
            return this.ilinkSn_;
        }

        public C16994k getIlinkSnBytes() {
            return C16994k.m16791k(this.ilinkSn_);
        }

        public String getIlinkToken() {
            return this.ilinkToken_;
        }

        public C16994k getIlinkTokenBytes() {
            return C16994k.m16791k(this.ilinkToken_);
        }

        public C16994k getSession() {
            return this.session_;
        }

        public boolean hasIlinkId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIlinkSn() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIlinkToken() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSession() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkDeviceLoginResponse ilinkDeviceLoginResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkDeviceLoginResponse);
        }

        public static IlinkDeviceLoginResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkDeviceLoginResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceLoginResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkDeviceLoginResponse parseFrom(C16994k kVar) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkDeviceLoginResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkDeviceLoginResponse parseFrom(byte[] bArr) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkDeviceLoginResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkDeviceLoginResponse parseFrom(InputStream inputStream) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceLoginResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceLoginResponse parseFrom(C23856l lVar) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkDeviceLoginResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkDeviceLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkDeviceLoginResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIlinkId();

        C16994k getIlinkIdBytes();

        String getIlinkSn();

        C16994k getIlinkSnBytes();

        String getIlinkToken();

        C16994k getIlinkTokenBytes();

        C16994k getSession();

        boolean hasIlinkId();

        boolean hasIlinkSn();

        boolean hasIlinkToken();

        boolean hasSession();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkEchoRequest extends C23861l0<IlinkEchoRequest, Builder> implements IlinkEchoRequestOrBuilder {
        public static final int BODY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkEchoRequest DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkEchoRequest> PARSER;
        private int bitField0_;
        private String body_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkEchoRequest, Builder> implements IlinkEchoRequestOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((IlinkEchoRequest) this.instance).clearBody();
                return this;
            }

            public String getBody() {
                return ((IlinkEchoRequest) this.instance).getBody();
            }

            public C16994k getBodyBytes() {
                return ((IlinkEchoRequest) this.instance).getBodyBytes();
            }

            public boolean hasBody() {
                return ((IlinkEchoRequest) this.instance).hasBody();
            }

            public Builder setBody(String str) {
                copyOnWrite();
                ((IlinkEchoRequest) this.instance).setBody(str);
                return this;
            }

            public Builder setBodyBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkEchoRequest) this.instance).setBodyBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkEchoRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkEchoRequest ilinkEchoRequest = new IlinkEchoRequest();
            DEFAULT_INSTANCE = ilinkEchoRequest;
            C23861l0.registerDefaultInstance(IlinkEchoRequest.class, ilinkEchoRequest);
        }

        private IlinkEchoRequest() {
        }

        /* access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -2;
            this.body_ = getDefaultInstance().getBody();
        }

        public static IlinkEchoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkEchoRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkEchoRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkEchoRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkEchoRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBody(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.body_ = str;
        }

        /* access modifiers changed from: private */
        public void setBodyBytes(C16994k kVar) {
            this.body_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "body_"});
                case 3:
                    return new IlinkEchoRequest();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkEchoRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkEchoRequest.class) {
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

        public String getBody() {
            return this.body_;
        }

        public C16994k getBodyBytes() {
            return C16994k.m16791k(this.body_);
        }

        public boolean hasBody() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkEchoRequest ilinkEchoRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkEchoRequest);
        }

        public static IlinkEchoRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkEchoRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkEchoRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkEchoRequest parseFrom(C16994k kVar) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkEchoRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkEchoRequest parseFrom(byte[] bArr) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkEchoRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkEchoRequest parseFrom(InputStream inputStream) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkEchoRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkEchoRequest parseFrom(C23856l lVar) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkEchoRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkEchoRequestOrBuilder extends C23848k1 {
        String getBody();

        C16994k getBodyBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBody();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkEchoResponse extends C23861l0<IlinkEchoResponse, Builder> implements IlinkEchoResponseOrBuilder {
        public static final int BODY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkEchoResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkEchoResponse> PARSER;
        private int bitField0_;
        private String body_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkEchoResponse, Builder> implements IlinkEchoResponseOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((IlinkEchoResponse) this.instance).clearBody();
                return this;
            }

            public String getBody() {
                return ((IlinkEchoResponse) this.instance).getBody();
            }

            public C16994k getBodyBytes() {
                return ((IlinkEchoResponse) this.instance).getBodyBytes();
            }

            public boolean hasBody() {
                return ((IlinkEchoResponse) this.instance).hasBody();
            }

            public Builder setBody(String str) {
                copyOnWrite();
                ((IlinkEchoResponse) this.instance).setBody(str);
                return this;
            }

            public Builder setBodyBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkEchoResponse) this.instance).setBodyBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkEchoResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkEchoResponse ilinkEchoResponse = new IlinkEchoResponse();
            DEFAULT_INSTANCE = ilinkEchoResponse;
            C23861l0.registerDefaultInstance(IlinkEchoResponse.class, ilinkEchoResponse);
        }

        private IlinkEchoResponse() {
        }

        /* access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -2;
            this.body_ = getDefaultInstance().getBody();
        }

        public static IlinkEchoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkEchoResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkEchoResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkEchoResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkEchoResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBody(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.body_ = str;
        }

        /* access modifiers changed from: private */
        public void setBodyBytes(C16994k kVar) {
            this.body_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "body_"});
                case 3:
                    return new IlinkEchoResponse();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkEchoResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkEchoResponse.class) {
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

        public String getBody() {
            return this.body_;
        }

        public C16994k getBodyBytes() {
            return C16994k.m16791k(this.body_);
        }

        public boolean hasBody() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkEchoResponse ilinkEchoResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkEchoResponse);
        }

        public static IlinkEchoResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkEchoResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkEchoResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkEchoResponse parseFrom(C16994k kVar) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkEchoResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkEchoResponse parseFrom(byte[] bArr) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkEchoResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkEchoResponse parseFrom(InputStream inputStream) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkEchoResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkEchoResponse parseFrom(C23856l lVar) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkEchoResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkEchoResponseOrBuilder extends C23848k1 {
        String getBody();

        C16994k getBodyBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBody();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkGetLoginQrCodeRequest extends C23861l0<IlinkGetLoginQrCodeRequest, Builder> implements IlinkGetLoginQrCodeRequestOrBuilder {
        public static final int CONFIRM_BUSINESS_INFO_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final IlinkGetLoginQrCodeRequest DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkGetLoginQrCodeRequest> PARSER = null;
        public static final int QRCODE_VERIFY_SCENE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C16994k confirmBusinessInfo_ = C16994k.f46000e;
        private int qrcodeVerifyScene_;

        public static final class Builder extends C23861l0.C23862a<IlinkGetLoginQrCodeRequest, Builder> implements IlinkGetLoginQrCodeRequestOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearConfirmBusinessInfo() {
                copyOnWrite();
                ((IlinkGetLoginQrCodeRequest) this.instance).clearConfirmBusinessInfo();
                return this;
            }

            public Builder clearQrcodeVerifyScene() {
                copyOnWrite();
                ((IlinkGetLoginQrCodeRequest) this.instance).clearQrcodeVerifyScene();
                return this;
            }

            public C16994k getConfirmBusinessInfo() {
                return ((IlinkGetLoginQrCodeRequest) this.instance).getConfirmBusinessInfo();
            }

            public int getQrcodeVerifyScene() {
                return ((IlinkGetLoginQrCodeRequest) this.instance).getQrcodeVerifyScene();
            }

            public boolean hasConfirmBusinessInfo() {
                return ((IlinkGetLoginQrCodeRequest) this.instance).hasConfirmBusinessInfo();
            }

            public boolean hasQrcodeVerifyScene() {
                return ((IlinkGetLoginQrCodeRequest) this.instance).hasQrcodeVerifyScene();
            }

            public Builder setConfirmBusinessInfo(C16994k kVar) {
                copyOnWrite();
                ((IlinkGetLoginQrCodeRequest) this.instance).setConfirmBusinessInfo(kVar);
                return this;
            }

            public Builder setQrcodeVerifyScene(int i) {
                copyOnWrite();
                ((IlinkGetLoginQrCodeRequest) this.instance).setQrcodeVerifyScene(i);
                return this;
            }

            private Builder() {
                super(IlinkGetLoginQrCodeRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkGetLoginQrCodeRequest ilinkGetLoginQrCodeRequest = new IlinkGetLoginQrCodeRequest();
            DEFAULT_INSTANCE = ilinkGetLoginQrCodeRequest;
            C23861l0.registerDefaultInstance(IlinkGetLoginQrCodeRequest.class, ilinkGetLoginQrCodeRequest);
        }

        private IlinkGetLoginQrCodeRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfirmBusinessInfo() {
            this.bitField0_ &= -3;
            this.confirmBusinessInfo_ = getDefaultInstance().getConfirmBusinessInfo();
        }

        /* access modifiers changed from: private */
        public void clearQrcodeVerifyScene() {
            this.bitField0_ &= -2;
            this.qrcodeVerifyScene_ = 0;
        }

        public static IlinkGetLoginQrCodeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkGetLoginQrCodeRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkGetLoginQrCodeRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfirmBusinessInfo(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.confirmBusinessInfo_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setQrcodeVerifyScene(int i) {
            this.bitField0_ |= 1;
            this.qrcodeVerifyScene_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "qrcodeVerifyScene_", "confirmBusinessInfo_"});
                case 3:
                    return new IlinkGetLoginQrCodeRequest();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkGetLoginQrCodeRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkGetLoginQrCodeRequest.class) {
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

        public C16994k getConfirmBusinessInfo() {
            return this.confirmBusinessInfo_;
        }

        public int getQrcodeVerifyScene() {
            return this.qrcodeVerifyScene_;
        }

        public boolean hasConfirmBusinessInfo() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasQrcodeVerifyScene() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkGetLoginQrCodeRequest ilinkGetLoginQrCodeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkGetLoginQrCodeRequest);
        }

        public static IlinkGetLoginQrCodeRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(C16994k kVar) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(byte[] bArr) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(InputStream inputStream) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(C23856l lVar) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkGetLoginQrCodeRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkGetLoginQrCodeRequestOrBuilder extends C23848k1 {
        C16994k getConfirmBusinessInfo();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getQrcodeVerifyScene();

        boolean hasConfirmBusinessInfo();

        boolean hasQrcodeVerifyScene();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkGetLoginQrCodeResponse extends C23861l0<IlinkGetLoginQrCodeResponse, Builder> implements IlinkGetLoginQrCodeResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkGetLoginQrCodeResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkGetLoginQrCodeResponse> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        private int bitField0_;
        private String path_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkGetLoginQrCodeResponse, Builder> implements IlinkGetLoginQrCodeResponseOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearPath() {
                copyOnWrite();
                ((IlinkGetLoginQrCodeResponse) this.instance).clearPath();
                return this;
            }

            public String getPath() {
                return ((IlinkGetLoginQrCodeResponse) this.instance).getPath();
            }

            public C16994k getPathBytes() {
                return ((IlinkGetLoginQrCodeResponse) this.instance).getPathBytes();
            }

            public boolean hasPath() {
                return ((IlinkGetLoginQrCodeResponse) this.instance).hasPath();
            }

            public Builder setPath(String str) {
                copyOnWrite();
                ((IlinkGetLoginQrCodeResponse) this.instance).setPath(str);
                return this;
            }

            public Builder setPathBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkGetLoginQrCodeResponse) this.instance).setPathBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkGetLoginQrCodeResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkGetLoginQrCodeResponse ilinkGetLoginQrCodeResponse = new IlinkGetLoginQrCodeResponse();
            DEFAULT_INSTANCE = ilinkGetLoginQrCodeResponse;
            C23861l0.registerDefaultInstance(IlinkGetLoginQrCodeResponse.class, ilinkGetLoginQrCodeResponse);
        }

        private IlinkGetLoginQrCodeResponse() {
        }

        /* access modifiers changed from: private */
        public void clearPath() {
            this.bitField0_ &= -2;
            this.path_ = getDefaultInstance().getPath();
        }

        public static IlinkGetLoginQrCodeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkGetLoginQrCodeResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkGetLoginQrCodeResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPath(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.path_ = str;
        }

        /* access modifiers changed from: private */
        public void setPathBytes(C16994k kVar) {
            this.path_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "path_"});
                case 3:
                    return new IlinkGetLoginQrCodeResponse();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkGetLoginQrCodeResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkGetLoginQrCodeResponse.class) {
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

        public String getPath() {
            return this.path_;
        }

        public C16994k getPathBytes() {
            return C16994k.m16791k(this.path_);
        }

        public boolean hasPath() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkGetLoginQrCodeResponse ilinkGetLoginQrCodeResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkGetLoginQrCodeResponse);
        }

        public static IlinkGetLoginQrCodeResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(C16994k kVar) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(byte[] bArr) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(InputStream inputStream) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(C23856l lVar) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkGetLoginQrCodeResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkGetLoginQrCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkGetLoginQrCodeResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getPath();

        C16994k getPathBytes();

        boolean hasPath();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkGetOAuthCodeRequest extends C23861l0<IlinkGetOAuthCodeRequest, Builder> implements IlinkGetOAuthCodeRequestOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkGetOAuthCodeRequest DEFAULT_INSTANCE;
        public static final int ILINK_APPID_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkGetOAuthCodeRequest> PARSER;
        private int bitField0_;
        private String ilinkAppid_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkGetOAuthCodeRequest, Builder> implements IlinkGetOAuthCodeRequestOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearIlinkAppid() {
                copyOnWrite();
                ((IlinkGetOAuthCodeRequest) this.instance).clearIlinkAppid();
                return this;
            }

            public String getIlinkAppid() {
                return ((IlinkGetOAuthCodeRequest) this.instance).getIlinkAppid();
            }

            public C16994k getIlinkAppidBytes() {
                return ((IlinkGetOAuthCodeRequest) this.instance).getIlinkAppidBytes();
            }

            public boolean hasIlinkAppid() {
                return ((IlinkGetOAuthCodeRequest) this.instance).hasIlinkAppid();
            }

            public Builder setIlinkAppid(String str) {
                copyOnWrite();
                ((IlinkGetOAuthCodeRequest) this.instance).setIlinkAppid(str);
                return this;
            }

            public Builder setIlinkAppidBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkGetOAuthCodeRequest) this.instance).setIlinkAppidBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkGetOAuthCodeRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkGetOAuthCodeRequest ilinkGetOAuthCodeRequest = new IlinkGetOAuthCodeRequest();
            DEFAULT_INSTANCE = ilinkGetOAuthCodeRequest;
            C23861l0.registerDefaultInstance(IlinkGetOAuthCodeRequest.class, ilinkGetOAuthCodeRequest);
        }

        private IlinkGetOAuthCodeRequest() {
        }

        /* access modifiers changed from: private */
        public void clearIlinkAppid() {
            this.bitField0_ &= -2;
            this.ilinkAppid_ = getDefaultInstance().getIlinkAppid();
        }

        public static IlinkGetOAuthCodeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkGetOAuthCodeRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkGetOAuthCodeRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIlinkAppid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.ilinkAppid_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkAppidBytes(C16994k kVar) {
            this.ilinkAppid_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "ilinkAppid_"});
                case 3:
                    return new IlinkGetOAuthCodeRequest();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkGetOAuthCodeRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkGetOAuthCodeRequest.class) {
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

        public String getIlinkAppid() {
            return this.ilinkAppid_;
        }

        public C16994k getIlinkAppidBytes() {
            return C16994k.m16791k(this.ilinkAppid_);
        }

        public boolean hasIlinkAppid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkGetOAuthCodeRequest ilinkGetOAuthCodeRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkGetOAuthCodeRequest);
        }

        public static IlinkGetOAuthCodeRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(C16994k kVar) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(byte[] bArr) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(InputStream inputStream) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(C23856l lVar) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkGetOAuthCodeRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkGetOAuthCodeRequestOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIlinkAppid();

        C16994k getIlinkAppidBytes();

        boolean hasIlinkAppid();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkGetOAuthCodeResponse extends C23861l0<IlinkGetOAuthCodeResponse, Builder> implements IlinkGetOAuthCodeResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkGetOAuthCodeResponse DEFAULT_INSTANCE;
        public static final int OAUTH_CODE_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkGetOAuthCodeResponse> PARSER;
        private int bitField0_;
        private C16994k oauthCode_ = C16994k.f46000e;

        public static final class Builder extends C23861l0.C23862a<IlinkGetOAuthCodeResponse, Builder> implements IlinkGetOAuthCodeResponseOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearOauthCode() {
                copyOnWrite();
                ((IlinkGetOAuthCodeResponse) this.instance).clearOauthCode();
                return this;
            }

            public C16994k getOauthCode() {
                return ((IlinkGetOAuthCodeResponse) this.instance).getOauthCode();
            }

            public boolean hasOauthCode() {
                return ((IlinkGetOAuthCodeResponse) this.instance).hasOauthCode();
            }

            public Builder setOauthCode(C16994k kVar) {
                copyOnWrite();
                ((IlinkGetOAuthCodeResponse) this.instance).setOauthCode(kVar);
                return this;
            }

            private Builder() {
                super(IlinkGetOAuthCodeResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkGetOAuthCodeResponse ilinkGetOAuthCodeResponse = new IlinkGetOAuthCodeResponse();
            DEFAULT_INSTANCE = ilinkGetOAuthCodeResponse;
            C23861l0.registerDefaultInstance(IlinkGetOAuthCodeResponse.class, ilinkGetOAuthCodeResponse);
        }

        private IlinkGetOAuthCodeResponse() {
        }

        /* access modifiers changed from: private */
        public void clearOauthCode() {
            this.bitField0_ &= -2;
            this.oauthCode_ = getDefaultInstance().getOauthCode();
        }

        public static IlinkGetOAuthCodeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkGetOAuthCodeResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkGetOAuthCodeResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setOauthCode(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.oauthCode_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "oauthCode_"});
                case 3:
                    return new IlinkGetOAuthCodeResponse();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkGetOAuthCodeResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkGetOAuthCodeResponse.class) {
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

        public C16994k getOauthCode() {
            return this.oauthCode_;
        }

        public boolean hasOauthCode() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkGetOAuthCodeResponse ilinkGetOAuthCodeResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkGetOAuthCodeResponse);
        }

        public static IlinkGetOAuthCodeResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(C16994k kVar) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(byte[] bArr) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(InputStream inputStream) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(C23856l lVar) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkGetOAuthCodeResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkGetOAuthCodeResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkGetOAuthCodeResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getOauthCode();

        boolean hasOauthCode();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkLoginQrCodeStatus implements C23908o0.C23911c {
        kLoginQrCodeStatus_NoScan(0),
        kLoginQrCodeStatus_Scanned(1),
        kLoginQrCodeStatus_Confirmed(2),
        kLoginQrCodeStatus_Canceled(3),
        kLoginQrCodeStatus_Expired(4);
        
        private static final C23908o0.C23912d<IlinkLoginQrCodeStatus> internalValueMap = null;
        public static final int kLoginQrCodeStatus_Canceled_VALUE = 3;
        public static final int kLoginQrCodeStatus_Confirmed_VALUE = 2;
        public static final int kLoginQrCodeStatus_Expired_VALUE = 4;
        public static final int kLoginQrCodeStatus_NoScan_VALUE = 0;
        public static final int kLoginQrCodeStatus_Scanned_VALUE = 1;
        private final int value;

        public static final class IlinkLoginQrCodeStatusVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkLoginQrCodeStatusVerifier();
            }

            private IlinkLoginQrCodeStatusVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkLoginQrCodeStatus.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkLoginQrCodeStatus>() {
                public IlinkLoginQrCodeStatus findValueByNumber(int i) {
                    return IlinkLoginQrCodeStatus.forNumber(i);
                }
            };
        }

        private IlinkLoginQrCodeStatus(int i) {
            this.value = i;
        }

        public static IlinkLoginQrCodeStatus forNumber(int i) {
            if (i == 0) {
                return kLoginQrCodeStatus_NoScan;
            }
            if (i == 1) {
                return kLoginQrCodeStatus_Scanned;
            }
            if (i == 2) {
                return kLoginQrCodeStatus_Confirmed;
            }
            if (i == 3) {
                return kLoginQrCodeStatus_Canceled;
            }
            if (i != 4) {
                return null;
            }
            return kLoginQrCodeStatus_Expired;
        }

        public static C23908o0.C23912d<IlinkLoginQrCodeStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkLoginQrCodeStatusVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkLoginQrCodeStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkLoginRequest extends C23861l0<IlinkLoginRequest, Builder> implements IlinkLoginRequestOrBuilder {
        public static final int AUTH_CODE_FIELD_NUMBER = 3;
        public static final int BUSINESS_REQ_BUFFER_FIELD_NUMBER = 8;
        public static final int CLIENT_INFO_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final IlinkLoginRequest DEFAULT_INSTANCE;
        public static final int LKID_FIELD_NUMBER = 5;
        private static volatile C24062w1<IlinkLoginRequest> PARSER = null;
        public static final int RETRY_COUNT_FIELD_NUMBER = 2;
        public static final int SECURITY_INFO_FIELD_NUMBER = 6;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 1;
        public static final int VENDORID_FIELD_NUMBER = 4;
        private C16994k authCode_;
        private int bitField0_;
        private C16994k businessReqBuffer_;
        private String clientInfo_ = "";
        private C16994k lkid_;
        private int retryCount_;
        private C16994k securityInfo_;
        private int timeoutMs_;
        private C16994k vendorid_;

        public static final class Builder extends C23861l0.C23862a<IlinkLoginRequest, Builder> implements IlinkLoginRequestOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearAuthCode() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearAuthCode();
                return this;
            }

            public Builder clearBusinessReqBuffer() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearBusinessReqBuffer();
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearClientInfo();
                return this;
            }

            public Builder clearLkid() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearLkid();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearSecurityInfo() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearSecurityInfo();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearTimeoutMs();
                return this;
            }

            public Builder clearVendorid() {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).clearVendorid();
                return this;
            }

            public C16994k getAuthCode() {
                return ((IlinkLoginRequest) this.instance).getAuthCode();
            }

            public C16994k getBusinessReqBuffer() {
                return ((IlinkLoginRequest) this.instance).getBusinessReqBuffer();
            }

            public String getClientInfo() {
                return ((IlinkLoginRequest) this.instance).getClientInfo();
            }

            public C16994k getClientInfoBytes() {
                return ((IlinkLoginRequest) this.instance).getClientInfoBytes();
            }

            public C16994k getLkid() {
                return ((IlinkLoginRequest) this.instance).getLkid();
            }

            public int getRetryCount() {
                return ((IlinkLoginRequest) this.instance).getRetryCount();
            }

            public C16994k getSecurityInfo() {
                return ((IlinkLoginRequest) this.instance).getSecurityInfo();
            }

            public int getTimeoutMs() {
                return ((IlinkLoginRequest) this.instance).getTimeoutMs();
            }

            public C16994k getVendorid() {
                return ((IlinkLoginRequest) this.instance).getVendorid();
            }

            public boolean hasAuthCode() {
                return ((IlinkLoginRequest) this.instance).hasAuthCode();
            }

            public boolean hasBusinessReqBuffer() {
                return ((IlinkLoginRequest) this.instance).hasBusinessReqBuffer();
            }

            public boolean hasClientInfo() {
                return ((IlinkLoginRequest) this.instance).hasClientInfo();
            }

            public boolean hasLkid() {
                return ((IlinkLoginRequest) this.instance).hasLkid();
            }

            public boolean hasRetryCount() {
                return ((IlinkLoginRequest) this.instance).hasRetryCount();
            }

            public boolean hasSecurityInfo() {
                return ((IlinkLoginRequest) this.instance).hasSecurityInfo();
            }

            public boolean hasTimeoutMs() {
                return ((IlinkLoginRequest) this.instance).hasTimeoutMs();
            }

            public boolean hasVendorid() {
                return ((IlinkLoginRequest) this.instance).hasVendorid();
            }

            public Builder setAuthCode(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setAuthCode(kVar);
                return this;
            }

            public Builder setBusinessReqBuffer(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setBusinessReqBuffer(kVar);
                return this;
            }

            public Builder setClientInfo(String str) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setClientInfo(str);
                return this;
            }

            public Builder setClientInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setClientInfoBytes(kVar);
                return this;
            }

            public Builder setLkid(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setLkid(kVar);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setSecurityInfo(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setSecurityInfo(kVar);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setTimeoutMs(i);
                return this;
            }

            public Builder setVendorid(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginRequest) this.instance).setVendorid(kVar);
                return this;
            }

            private Builder() {
                super(IlinkLoginRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkLoginRequest ilinkLoginRequest = new IlinkLoginRequest();
            DEFAULT_INSTANCE = ilinkLoginRequest;
            C23861l0.registerDefaultInstance(IlinkLoginRequest.class, ilinkLoginRequest);
        }

        private IlinkLoginRequest() {
            C16994k kVar = C16994k.f46000e;
            this.authCode_ = kVar;
            this.vendorid_ = kVar;
            this.lkid_ = kVar;
            this.securityInfo_ = kVar;
            this.businessReqBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearAuthCode() {
            this.bitField0_ &= -5;
            this.authCode_ = getDefaultInstance().getAuthCode();
        }

        /* access modifiers changed from: private */
        public void clearBusinessReqBuffer() {
            this.bitField0_ &= -129;
            this.businessReqBuffer_ = getDefaultInstance().getBusinessReqBuffer();
        }

        /* access modifiers changed from: private */
        public void clearClientInfo() {
            this.bitField0_ &= -65;
            this.clientInfo_ = getDefaultInstance().getClientInfo();
        }

        /* access modifiers changed from: private */
        public void clearLkid() {
            this.bitField0_ &= -17;
            this.lkid_ = getDefaultInstance().getLkid();
        }

        /* access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -3;
            this.retryCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSecurityInfo() {
            this.bitField0_ &= -33;
            this.securityInfo_ = getDefaultInstance().getSecurityInfo();
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -2;
            this.timeoutMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVendorid() {
            this.bitField0_ &= -9;
            this.vendorid_ = getDefaultInstance().getVendorid();
        }

        public static IlinkLoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkLoginRequest parseDelimitedFrom(InputStream inputStream) {
            return (IlinkLoginRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkLoginRequest parseFrom(ByteBuffer byteBuffer) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkLoginRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAuthCode(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.authCode_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setBusinessReqBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 128;
            this.businessReqBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setClientInfo(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.clientInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientInfoBytes(C16994k kVar) {
            this.clientInfo_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setLkid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.lkid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.bitField0_ |= 2;
            this.retryCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setSecurityInfo(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.securityInfo_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 1;
            this.timeoutMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setVendorid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.vendorid_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"bitField0_", "timeoutMs_", "retryCount_", "authCode_", "vendorid_", "lkid_", "securityInfo_", "clientInfo_", "businessReqBuffer_"});
                case 3:
                    return new IlinkLoginRequest();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkLoginRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkLoginRequest.class) {
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

        public C16994k getAuthCode() {
            return this.authCode_;
        }

        public C16994k getBusinessReqBuffer() {
            return this.businessReqBuffer_;
        }

        public String getClientInfo() {
            return this.clientInfo_;
        }

        public C16994k getClientInfoBytes() {
            return C16994k.m16791k(this.clientInfo_);
        }

        public C16994k getLkid() {
            return this.lkid_;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public C16994k getSecurityInfo() {
            return this.securityInfo_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public C16994k getVendorid() {
            return this.vendorid_;
        }

        public boolean hasAuthCode() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasBusinessReqBuffer() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasClientInfo() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasLkid() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasRetryCount() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSecurityInfo() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVendorid() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkLoginRequest ilinkLoginRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkLoginRequest);
        }

        public static IlinkLoginRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkLoginRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkLoginRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkLoginRequest parseFrom(C16994k kVar) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkLoginRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkLoginRequest parseFrom(byte[] bArr) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkLoginRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkLoginRequest parseFrom(InputStream inputStream) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkLoginRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkLoginRequest parseFrom(C23856l lVar) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkLoginRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkLoginRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkLoginRequestOrBuilder extends C23848k1 {
        C16994k getAuthCode();

        C16994k getBusinessReqBuffer();

        String getClientInfo();

        C16994k getClientInfoBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getLkid();

        int getRetryCount();

        C16994k getSecurityInfo();

        int getTimeoutMs();

        C16994k getVendorid();

        boolean hasAuthCode();

        boolean hasBusinessReqBuffer();

        boolean hasClientInfo();

        boolean hasLkid();

        boolean hasRetryCount();

        boolean hasSecurityInfo();

        boolean hasTimeoutMs();

        boolean hasVendorid();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkLoginResponse extends C23861l0<IlinkLoginResponse, Builder> implements IlinkLoginResponseOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkLoginResponse DEFAULT_INSTANCE;
        public static final int DETAIL_RET_FIELD_NUMBER = 3;
        public static final int LOGIN_TYPE_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkLoginResponse> PARSER = null;
        public static final int VERIFY_BUFFER_FIELD_NUMBER = 2;
        private int bitField0_;
        private int detailRet_;
        private int loginType_;
        private C16994k verifyBuffer_ = C16994k.f46000e;

        public static final class Builder extends C23861l0.C23862a<IlinkLoginResponse, Builder> implements IlinkLoginResponseOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearDetailRet() {
                copyOnWrite();
                ((IlinkLoginResponse) this.instance).clearDetailRet();
                return this;
            }

            public Builder clearLoginType() {
                copyOnWrite();
                ((IlinkLoginResponse) this.instance).clearLoginType();
                return this;
            }

            public Builder clearVerifyBuffer() {
                copyOnWrite();
                ((IlinkLoginResponse) this.instance).clearVerifyBuffer();
                return this;
            }

            public int getDetailRet() {
                return ((IlinkLoginResponse) this.instance).getDetailRet();
            }

            public int getLoginType() {
                return ((IlinkLoginResponse) this.instance).getLoginType();
            }

            public C16994k getVerifyBuffer() {
                return ((IlinkLoginResponse) this.instance).getVerifyBuffer();
            }

            public boolean hasDetailRet() {
                return ((IlinkLoginResponse) this.instance).hasDetailRet();
            }

            public boolean hasLoginType() {
                return ((IlinkLoginResponse) this.instance).hasLoginType();
            }

            public boolean hasVerifyBuffer() {
                return ((IlinkLoginResponse) this.instance).hasVerifyBuffer();
            }

            public Builder setDetailRet(int i) {
                copyOnWrite();
                ((IlinkLoginResponse) this.instance).setDetailRet(i);
                return this;
            }

            public Builder setLoginType(int i) {
                copyOnWrite();
                ((IlinkLoginResponse) this.instance).setLoginType(i);
                return this;
            }

            public Builder setVerifyBuffer(C16994k kVar) {
                copyOnWrite();
                ((IlinkLoginResponse) this.instance).setVerifyBuffer(kVar);
                return this;
            }

            private Builder() {
                super(IlinkLoginResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkLoginResponse ilinkLoginResponse = new IlinkLoginResponse();
            DEFAULT_INSTANCE = ilinkLoginResponse;
            C23861l0.registerDefaultInstance(IlinkLoginResponse.class, ilinkLoginResponse);
        }

        private IlinkLoginResponse() {
        }

        /* access modifiers changed from: private */
        public void clearDetailRet() {
            this.bitField0_ &= -5;
            this.detailRet_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoginType() {
            this.bitField0_ &= -2;
            this.loginType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVerifyBuffer() {
            this.bitField0_ &= -3;
            this.verifyBuffer_ = getDefaultInstance().getVerifyBuffer();
        }

        public static IlinkLoginResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkLoginResponse parseDelimitedFrom(InputStream inputStream) {
            return (IlinkLoginResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkLoginResponse parseFrom(ByteBuffer byteBuffer) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkLoginResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDetailRet(int i) {
            this.bitField0_ |= 4;
            this.detailRet_ = i;
        }

        /* access modifiers changed from: private */
        public void setLoginType(int i) {
            this.bitField0_ |= 1;
            this.loginType_ = i;
        }

        /* access modifiers changed from: private */
        public void setVerifyBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.verifyBuffer_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ည\u0001\u0003င\u0002", new Object[]{"bitField0_", "loginType_", "verifyBuffer_", "detailRet_"});
                case 3:
                    return new IlinkLoginResponse();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkLoginResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkLoginResponse.class) {
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

        public int getDetailRet() {
            return this.detailRet_;
        }

        public int getLoginType() {
            return this.loginType_;
        }

        public C16994k getVerifyBuffer() {
            return this.verifyBuffer_;
        }

        public boolean hasDetailRet() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLoginType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVerifyBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkLoginResponse ilinkLoginResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkLoginResponse);
        }

        public static IlinkLoginResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkLoginResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkLoginResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkLoginResponse parseFrom(C16994k kVar) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkLoginResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkLoginResponse parseFrom(byte[] bArr) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkLoginResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkLoginResponse parseFrom(InputStream inputStream) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkLoginResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkLoginResponse parseFrom(C23856l lVar) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkLoginResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkLoginResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkLoginResponseOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDetailRet();

        int getLoginType();

        C16994k getVerifyBuffer();

        boolean hasDetailRet();

        boolean hasLoginType();

        boolean hasVerifyBuffer();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkLoginScene implements C23908o0.C23911c {
        kIlinkLoginSceneNone(0),
        kIlinkLoginSceneFace(1),
        kIlinkLoginSceneQrCode(2),
        kIlinkLoginSceneThirdApp(5),
        kIlinkLoginSceneOAuth(6),
        kIlinkLoginSceneVisitor(7);
        
        private static final C23908o0.C23912d<IlinkLoginScene> internalValueMap = null;
        public static final int kIlinkLoginSceneFace_VALUE = 1;
        public static final int kIlinkLoginSceneNone_VALUE = 0;
        public static final int kIlinkLoginSceneOAuth_VALUE = 6;
        public static final int kIlinkLoginSceneQrCode_VALUE = 2;
        public static final int kIlinkLoginSceneThirdApp_VALUE = 5;
        public static final int kIlinkLoginSceneVisitor_VALUE = 7;
        private final int value;

        public static final class IlinkLoginSceneVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkLoginSceneVerifier();
            }

            private IlinkLoginSceneVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkLoginScene.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkLoginScene>() {
                public IlinkLoginScene findValueByNumber(int i) {
                    return IlinkLoginScene.forNumber(i);
                }
            };
        }

        private IlinkLoginScene(int i) {
            this.value = i;
        }

        public static IlinkLoginScene forNumber(int i) {
            if (i == 0) {
                return kIlinkLoginSceneNone;
            }
            if (i == 1) {
                return kIlinkLoginSceneFace;
            }
            if (i == 2) {
                return kIlinkLoginSceneQrCode;
            }
            if (i == 5) {
                return kIlinkLoginSceneThirdApp;
            }
            if (i == 6) {
                return kIlinkLoginSceneOAuth;
            }
            if (i != 7) {
                return null;
            }
            return kIlinkLoginSceneVisitor;
        }

        public static C23908o0.C23912d<IlinkLoginScene> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkLoginSceneVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkLoginScene valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkLoginStatus implements C23908o0.C23911c {
        kIlinkLoginUnknown(-1),
        kIlinkLoginSuccess(0),
        kIlinkRequireManualLogin(1),
        kIlinkRequireAutoLogin(2);
        
        private static final C23908o0.C23912d<IlinkLoginStatus> internalValueMap = null;
        public static final int kIlinkLoginSuccess_VALUE = 0;
        public static final int kIlinkLoginUnknown_VALUE = -1;
        public static final int kIlinkRequireAutoLogin_VALUE = 2;
        public static final int kIlinkRequireManualLogin_VALUE = 1;
        private final int value;

        public static final class IlinkLoginStatusVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkLoginStatusVerifier();
            }

            private IlinkLoginStatusVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkLoginStatus.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkLoginStatus>() {
                public IlinkLoginStatus findValueByNumber(int i) {
                    return IlinkLoginStatus.forNumber(i);
                }
            };
        }

        private IlinkLoginStatus(int i) {
            this.value = i;
        }

        public static IlinkLoginStatus forNumber(int i) {
            if (i == -1) {
                return kIlinkLoginUnknown;
            }
            if (i == 0) {
                return kIlinkLoginSuccess;
            }
            if (i == 1) {
                return kIlinkRequireManualLogin;
            }
            if (i != 2) {
                return null;
            }
            return kIlinkRequireAutoLogin;
        }

        public static C23908o0.C23912d<IlinkLoginStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkLoginStatusVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkLoginStatus valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkLoginType implements C23908o0.C23911c {
        kIlinkLoginTypeNone(0),
        kIlinkLoginTypeAuto(1),
        kIlinkLoginTypeFace(2),
        kIlinkLoginTypeQrCode(3),
        kIlinkLoginTypeOAuth(4),
        kIlinkLoginTypeThirdApp(5),
        kIlinkLoginTypeVisitor(6);
        
        private static final C23908o0.C23912d<IlinkLoginType> internalValueMap = null;
        public static final int kIlinkLoginTypeAuto_VALUE = 1;
        public static final int kIlinkLoginTypeFace_VALUE = 2;
        public static final int kIlinkLoginTypeNone_VALUE = 0;
        public static final int kIlinkLoginTypeOAuth_VALUE = 4;
        public static final int kIlinkLoginTypeQrCode_VALUE = 3;
        public static final int kIlinkLoginTypeThirdApp_VALUE = 5;
        public static final int kIlinkLoginTypeVisitor_VALUE = 6;
        private final int value;

        public static final class IlinkLoginTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkLoginTypeVerifier();
            }

            private IlinkLoginTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkLoginType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkLoginType>() {
                public IlinkLoginType findValueByNumber(int i) {
                    return IlinkLoginType.forNumber(i);
                }
            };
        }

        private IlinkLoginType(int i) {
            this.value = i;
        }

        public static IlinkLoginType forNumber(int i) {
            switch (i) {
                case 0:
                    return kIlinkLoginTypeNone;
                case 1:
                    return kIlinkLoginTypeAuto;
                case 2:
                    return kIlinkLoginTypeFace;
                case 3:
                    return kIlinkLoginTypeQrCode;
                case 4:
                    return kIlinkLoginTypeOAuth;
                case 5:
                    return kIlinkLoginTypeThirdApp;
                case 6:
                    return kIlinkLoginTypeVisitor;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<IlinkLoginType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkLoginTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkLoginType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkSessionKickOutDetailRet implements C23908o0.C23911c {
        kIlinkSessionKickOutDetailRet_Default(0),
        kIlinkSessionKickOutDetailRet_DeviceIdUnMatch(1),
        kIlinkSessionKickOutDetailRet_DisableStatus(2),
        kIlinkSessionKickOutDetailRet_DeviceClosed_Comm(3),
        kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate(4),
        kIlinkSessionKickOutDetailRet_3rdApp_Timeout(5);
        
        private static final C23908o0.C23912d<IlinkSessionKickOutDetailRet> internalValueMap = null;
        public static final int kIlinkSessionKickOutDetailRet_3rdApp_Timeout_VALUE = 5;
        public static final int kIlinkSessionKickOutDetailRet_Default_VALUE = 0;
        public static final int kIlinkSessionKickOutDetailRet_DeviceClosed_Comm_VALUE = 3;
        public static final int kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate_VALUE = 4;
        public static final int kIlinkSessionKickOutDetailRet_DeviceIdUnMatch_VALUE = 1;
        public static final int kIlinkSessionKickOutDetailRet_DisableStatus_VALUE = 2;
        private final int value;

        public static final class IlinkSessionKickOutDetailRetVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkSessionKickOutDetailRetVerifier();
            }

            private IlinkSessionKickOutDetailRetVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkSessionKickOutDetailRet.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkSessionKickOutDetailRet>() {
                public IlinkSessionKickOutDetailRet findValueByNumber(int i) {
                    return IlinkSessionKickOutDetailRet.forNumber(i);
                }
            };
        }

        private IlinkSessionKickOutDetailRet(int i) {
            this.value = i;
        }

        public static IlinkSessionKickOutDetailRet forNumber(int i) {
            if (i == 0) {
                return kIlinkSessionKickOutDetailRet_Default;
            }
            if (i == 1) {
                return kIlinkSessionKickOutDetailRet_DeviceIdUnMatch;
            }
            if (i == 2) {
                return kIlinkSessionKickOutDetailRet_DisableStatus;
            }
            if (i == 3) {
                return kIlinkSessionKickOutDetailRet_DeviceClosed_Comm;
            }
            if (i == 4) {
                return kIlinkSessionKickOutDetailRet_DeviceClosed_Migrate;
            }
            if (i != 5) {
                return null;
            }
            return kIlinkSessionKickOutDetailRet_3rdApp_Timeout;
        }

        public static C23908o0.C23912d<IlinkSessionKickOutDetailRet> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkSessionKickOutDetailRetVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkSessionKickOutDetailRet valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkUserInfo extends C23861l0<IlinkUserInfo, Builder> implements IlinkUserInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkUserInfo DEFAULT_INSTANCE;
        public static final int LOGIN_SCENE_FIELD_NUMBER = 5;
        public static final int LOGIN_STATUS_FIELD_NUMBER = 1;
        public static final int LOGIN_TYPE_FIELD_NUMBER = 2;
        private static volatile C24062w1<IlinkUserInfo> PARSER = null;
        public static final int UIN_FIELD_NUMBER = 3;
        public static final int USERNAME_FIELD_NUMBER = 4;
        private int bitField0_;
        private int loginScene_;
        private int loginStatus_ = -1;
        private int loginType_;
        private long uin_;
        private String username_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkUserInfo, Builder> implements IlinkUserInfoOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearLoginScene() {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).clearLoginScene();
                return this;
            }

            public Builder clearLoginStatus() {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).clearLoginStatus();
                return this;
            }

            public Builder clearLoginType() {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).clearLoginType();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).clearUin();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).clearUsername();
                return this;
            }

            public IlinkLoginScene getLoginScene() {
                return ((IlinkUserInfo) this.instance).getLoginScene();
            }

            public IlinkLoginStatus getLoginStatus() {
                return ((IlinkUserInfo) this.instance).getLoginStatus();
            }

            public int getLoginType() {
                return ((IlinkUserInfo) this.instance).getLoginType();
            }

            public long getUin() {
                return ((IlinkUserInfo) this.instance).getUin();
            }

            public String getUsername() {
                return ((IlinkUserInfo) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((IlinkUserInfo) this.instance).getUsernameBytes();
            }

            public boolean hasLoginScene() {
                return ((IlinkUserInfo) this.instance).hasLoginScene();
            }

            public boolean hasLoginStatus() {
                return ((IlinkUserInfo) this.instance).hasLoginStatus();
            }

            public boolean hasLoginType() {
                return ((IlinkUserInfo) this.instance).hasLoginType();
            }

            public boolean hasUin() {
                return ((IlinkUserInfo) this.instance).hasUin();
            }

            public boolean hasUsername() {
                return ((IlinkUserInfo) this.instance).hasUsername();
            }

            public Builder setLoginScene(IlinkLoginScene ilinkLoginScene) {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).setLoginScene(ilinkLoginScene);
                return this;
            }

            public Builder setLoginStatus(IlinkLoginStatus ilinkLoginStatus) {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).setLoginStatus(ilinkLoginStatus);
                return this;
            }

            public Builder setLoginType(int i) {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).setLoginType(i);
                return this;
            }

            public Builder setUin(long j) {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).setUin(j);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkUserInfo) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkUserInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkUserInfo ilinkUserInfo = new IlinkUserInfo();
            DEFAULT_INSTANCE = ilinkUserInfo;
            C23861l0.registerDefaultInstance(IlinkUserInfo.class, ilinkUserInfo);
        }

        private IlinkUserInfo() {
        }

        /* access modifiers changed from: private */
        public void clearLoginScene() {
            this.bitField0_ &= -17;
            this.loginScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoginStatus() {
            this.bitField0_ &= -2;
            this.loginStatus_ = -1;
        }

        /* access modifiers changed from: private */
        public void clearLoginType() {
            this.bitField0_ &= -3;
            this.loginType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -5;
            this.uin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -9;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static IlinkUserInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkUserInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkUserInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkUserInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkUserInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setLoginScene(IlinkLoginScene ilinkLoginScene) {
            this.loginScene_ = ilinkLoginScene.getNumber();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setLoginStatus(IlinkLoginStatus ilinkLoginStatus) {
            this.loginStatus_ = ilinkLoginStatus.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setLoginType(int i) {
            this.bitField0_ |= 2;
            this.loginType_ = i;
        }

        /* access modifiers changed from: private */
        public void setUin(long j) {
            this.bitField0_ |= 4;
            this.uin_ = j;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "loginStatus_", IlinkLoginStatus.internalGetVerifier(), "loginType_", "uin_", "username_", "loginScene_", IlinkLoginScene.internalGetVerifier()});
                case 3:
                    return new IlinkUserInfo();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkUserInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkUserInfo.class) {
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

        public IlinkLoginScene getLoginScene() {
            IlinkLoginScene forNumber = IlinkLoginScene.forNumber(this.loginScene_);
            return forNumber == null ? IlinkLoginScene.kIlinkLoginSceneNone : forNumber;
        }

        public IlinkLoginStatus getLoginStatus() {
            IlinkLoginStatus forNumber = IlinkLoginStatus.forNumber(this.loginStatus_);
            return forNumber == null ? IlinkLoginStatus.kIlinkLoginUnknown : forNumber;
        }

        public int getLoginType() {
            return this.loginType_;
        }

        public long getUin() {
            return this.uin_;
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasLoginScene() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLoginStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLoginType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasUin() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkUserInfo ilinkUserInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkUserInfo);
        }

        public static IlinkUserInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkUserInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkUserInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkUserInfo parseFrom(C16994k kVar) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkUserInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkUserInfo parseFrom(byte[] bArr) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkUserInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkUserInfo parseFrom(InputStream inputStream) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkUserInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkUserInfo parseFrom(C23856l lVar) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkUserInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkUserInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkUserInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        IlinkLoginScene getLoginScene();

        IlinkLoginStatus getLoginStatus();

        int getLoginType();

        long getUin();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasLoginScene();

        boolean hasLoginStatus();

        boolean hasLoginType();

        boolean hasUin();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class TdiInitParameter extends C23861l0<TdiInitParameter, Builder> implements TdiInitParameterOrBuilder {
        public static final int APP_DIR_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TdiInitParameter DEFAULT_INSTANCE;
        public static final int ILINK_ID_FIELD_NUMBER = 4;
        public static final int ILINK_PRODUCT_ID_FIELD_NUMBER = 2;
        public static final int ILINK_SN_FIELD_NUMBER = 3;
        public static final int ILINK_TOKEN_FIELD_NUMBER = 5;
        public static final int IOS_IDFA_FIELD_NUMBER = 6;
        private static volatile C24062w1<TdiInitParameter> PARSER = null;
        public static final int SESSION_MODULE_TYPE_FIELD_NUMBER = 8;
        public static final int SESSION_TYPE_FIELD_NUMBER = 7;
        private String appDir_ = "";
        private int bitField0_;
        private String ilinkId_ = "";
        private int ilinkProductId_;
        private String ilinkSn_ = "";
        private String ilinkToken_ = "";
        private String iosIdfa_ = "";
        private int sessionModuleType_;
        private int sessionType_;

        public static final class Builder extends C23861l0.C23862a<TdiInitParameter, Builder> implements TdiInitParameterOrBuilder {
            public /* synthetic */ Builder(C241071 r1) {
                this();
            }

            public Builder clearAppDir() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearAppDir();
                return this;
            }

            public Builder clearIlinkId() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearIlinkId();
                return this;
            }

            public Builder clearIlinkProductId() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearIlinkProductId();
                return this;
            }

            public Builder clearIlinkSn() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearIlinkSn();
                return this;
            }

            public Builder clearIlinkToken() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearIlinkToken();
                return this;
            }

            public Builder clearIosIdfa() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearIosIdfa();
                return this;
            }

            public Builder clearSessionModuleType() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearSessionModuleType();
                return this;
            }

            public Builder clearSessionType() {
                copyOnWrite();
                ((TdiInitParameter) this.instance).clearSessionType();
                return this;
            }

            public String getAppDir() {
                return ((TdiInitParameter) this.instance).getAppDir();
            }

            public C16994k getAppDirBytes() {
                return ((TdiInitParameter) this.instance).getAppDirBytes();
            }

            public String getIlinkId() {
                return ((TdiInitParameter) this.instance).getIlinkId();
            }

            public C16994k getIlinkIdBytes() {
                return ((TdiInitParameter) this.instance).getIlinkIdBytes();
            }

            public int getIlinkProductId() {
                return ((TdiInitParameter) this.instance).getIlinkProductId();
            }

            public String getIlinkSn() {
                return ((TdiInitParameter) this.instance).getIlinkSn();
            }

            public C16994k getIlinkSnBytes() {
                return ((TdiInitParameter) this.instance).getIlinkSnBytes();
            }

            public String getIlinkToken() {
                return ((TdiInitParameter) this.instance).getIlinkToken();
            }

            public C16994k getIlinkTokenBytes() {
                return ((TdiInitParameter) this.instance).getIlinkTokenBytes();
            }

            public String getIosIdfa() {
                return ((TdiInitParameter) this.instance).getIosIdfa();
            }

            public C16994k getIosIdfaBytes() {
                return ((TdiInitParameter) this.instance).getIosIdfaBytes();
            }

            public int getSessionModuleType() {
                return ((TdiInitParameter) this.instance).getSessionModuleType();
            }

            public int getSessionType() {
                return ((TdiInitParameter) this.instance).getSessionType();
            }

            public boolean hasAppDir() {
                return ((TdiInitParameter) this.instance).hasAppDir();
            }

            public boolean hasIlinkId() {
                return ((TdiInitParameter) this.instance).hasIlinkId();
            }

            public boolean hasIlinkProductId() {
                return ((TdiInitParameter) this.instance).hasIlinkProductId();
            }

            public boolean hasIlinkSn() {
                return ((TdiInitParameter) this.instance).hasIlinkSn();
            }

            public boolean hasIlinkToken() {
                return ((TdiInitParameter) this.instance).hasIlinkToken();
            }

            public boolean hasIosIdfa() {
                return ((TdiInitParameter) this.instance).hasIosIdfa();
            }

            public boolean hasSessionModuleType() {
                return ((TdiInitParameter) this.instance).hasSessionModuleType();
            }

            public boolean hasSessionType() {
                return ((TdiInitParameter) this.instance).hasSessionType();
            }

            public Builder setAppDir(String str) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setAppDir(str);
                return this;
            }

            public Builder setAppDirBytes(C16994k kVar) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setAppDirBytes(kVar);
                return this;
            }

            public Builder setIlinkId(String str) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkId(str);
                return this;
            }

            public Builder setIlinkIdBytes(C16994k kVar) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkIdBytes(kVar);
                return this;
            }

            public Builder setIlinkProductId(int i) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkProductId(i);
                return this;
            }

            public Builder setIlinkSn(String str) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkSn(str);
                return this;
            }

            public Builder setIlinkSnBytes(C16994k kVar) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkSnBytes(kVar);
                return this;
            }

            public Builder setIlinkToken(String str) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkToken(str);
                return this;
            }

            public Builder setIlinkTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIlinkTokenBytes(kVar);
                return this;
            }

            public Builder setIosIdfa(String str) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIosIdfa(str);
                return this;
            }

            public Builder setIosIdfaBytes(C16994k kVar) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setIosIdfaBytes(kVar);
                return this;
            }

            public Builder setSessionModuleType(int i) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setSessionModuleType(i);
                return this;
            }

            public Builder setSessionType(int i) {
                copyOnWrite();
                ((TdiInitParameter) this.instance).setSessionType(i);
                return this;
            }

            private Builder() {
                super(TdiInitParameter.DEFAULT_INSTANCE);
            }
        }

        static {
            TdiInitParameter tdiInitParameter = new TdiInitParameter();
            DEFAULT_INSTANCE = tdiInitParameter;
            C23861l0.registerDefaultInstance(TdiInitParameter.class, tdiInitParameter);
        }

        private TdiInitParameter() {
        }

        /* access modifiers changed from: private */
        public void clearAppDir() {
            this.bitField0_ &= -2;
            this.appDir_ = getDefaultInstance().getAppDir();
        }

        /* access modifiers changed from: private */
        public void clearIlinkId() {
            this.bitField0_ &= -9;
            this.ilinkId_ = getDefaultInstance().getIlinkId();
        }

        /* access modifiers changed from: private */
        public void clearIlinkProductId() {
            this.bitField0_ &= -3;
            this.ilinkProductId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIlinkSn() {
            this.bitField0_ &= -5;
            this.ilinkSn_ = getDefaultInstance().getIlinkSn();
        }

        /* access modifiers changed from: private */
        public void clearIlinkToken() {
            this.bitField0_ &= -17;
            this.ilinkToken_ = getDefaultInstance().getIlinkToken();
        }

        /* access modifiers changed from: private */
        public void clearIosIdfa() {
            this.bitField0_ &= -33;
            this.iosIdfa_ = getDefaultInstance().getIosIdfa();
        }

        /* access modifiers changed from: private */
        public void clearSessionModuleType() {
            this.bitField0_ &= -129;
            this.sessionModuleType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionType() {
            this.bitField0_ &= -65;
            this.sessionType_ = 0;
        }

        public static TdiInitParameter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static TdiInitParameter parseDelimitedFrom(InputStream inputStream) {
            return (TdiInitParameter) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TdiInitParameter parseFrom(ByteBuffer byteBuffer) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<TdiInitParameter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppDir(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.appDir_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppDirBytes(C16994k kVar) {
            this.appDir_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setIlinkId(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.ilinkId_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkIdBytes(C16994k kVar) {
            this.ilinkId_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setIlinkProductId(int i) {
            this.bitField0_ |= 2;
            this.ilinkProductId_ = i;
        }

        /* access modifiers changed from: private */
        public void setIlinkSn(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.ilinkSn_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkSnBytes(C16994k kVar) {
            this.ilinkSn_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setIlinkToken(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.ilinkToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkTokenBytes(C16994k kVar) {
            this.ilinkToken_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setIosIdfa(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.iosIdfa_ = str;
        }

        /* access modifiers changed from: private */
        public void setIosIdfaBytes(C16994k kVar) {
            this.iosIdfa_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setSessionModuleType(int i) {
            this.bitField0_ |= 128;
            this.sessionModuleType_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionType(int i) {
            this.bitField0_ |= 64;
            this.sessionType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဋ\u0006\bဋ\u0007", new Object[]{"bitField0_", "appDir_", "ilinkProductId_", "ilinkSn_", "ilinkId_", "ilinkToken_", "iosIdfa_", "sessionType_", "sessionModuleType_"});
                case 3:
                    return new TdiInitParameter();
                case 4:
                    return new Builder((C241071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<TdiInitParameter> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (TdiInitParameter.class) {
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

        public String getAppDir() {
            return this.appDir_;
        }

        public C16994k getAppDirBytes() {
            return C16994k.m16791k(this.appDir_);
        }

        public String getIlinkId() {
            return this.ilinkId_;
        }

        public C16994k getIlinkIdBytes() {
            return C16994k.m16791k(this.ilinkId_);
        }

        public int getIlinkProductId() {
            return this.ilinkProductId_;
        }

        public String getIlinkSn() {
            return this.ilinkSn_;
        }

        public C16994k getIlinkSnBytes() {
            return C16994k.m16791k(this.ilinkSn_);
        }

        public String getIlinkToken() {
            return this.ilinkToken_;
        }

        public C16994k getIlinkTokenBytes() {
            return C16994k.m16791k(this.ilinkToken_);
        }

        public String getIosIdfa() {
            return this.iosIdfa_;
        }

        public C16994k getIosIdfaBytes() {
            return C16994k.m16791k(this.iosIdfa_);
        }

        public int getSessionModuleType() {
            return this.sessionModuleType_;
        }

        public int getSessionType() {
            return this.sessionType_;
        }

        public boolean hasAppDir() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIlinkId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIlinkProductId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIlinkSn() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasIlinkToken() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasIosIdfa() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSessionModuleType() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSessionType() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(TdiInitParameter tdiInitParameter) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(tdiInitParameter);
        }

        public static TdiInitParameter parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TdiInitParameter) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TdiInitParameter parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static TdiInitParameter parseFrom(C16994k kVar) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static TdiInitParameter parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static TdiInitParameter parseFrom(byte[] bArr) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TdiInitParameter parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static TdiInitParameter parseFrom(InputStream inputStream) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TdiInitParameter parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static TdiInitParameter parseFrom(C23856l lVar) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static TdiInitParameter parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (TdiInitParameter) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface TdiInitParameterOrBuilder extends C23848k1 {
        String getAppDir();

        C16994k getAppDirBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIlinkId();

        C16994k getIlinkIdBytes();

        int getIlinkProductId();

        String getIlinkSn();

        C16994k getIlinkSnBytes();

        String getIlinkToken();

        C16994k getIlinkTokenBytes();

        String getIosIdfa();

        C16994k getIosIdfaBytes();

        int getSessionModuleType();

        int getSessionType();

        boolean hasAppDir();

        boolean hasIlinkId();

        boolean hasIlinkProductId();

        boolean hasIlinkSn();

        boolean hasIlinkToken();

        boolean hasIosIdfa();

        boolean hasSessionModuleType();

        boolean hasSessionType();

        /* synthetic */ boolean isInitialized();
    }

    private Proto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
