package com.tencent.ilink.base;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24062w1;
import com.tencent.ilink.network.Proto;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Proto {

    /* renamed from: com.tencent.ilink.base.Proto$1 */
    public static /* synthetic */ class C241151 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69251xa1df5c61;

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
                f69251xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69251xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69251xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69251xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69251xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69251xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69251xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.ilink.base.Proto.C241151.<clinit>():void");
        }
    }

    public static final class IlinkAuthConfig extends C23861l0<IlinkAuthConfig, Builder> implements IlinkAuthConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkAuthConfig DEFAULT_INSTANCE;
        public static final int ILINK_ID_FIELD_NUMBER = 2;
        public static final int ILINK_SN_FIELD_NUMBER = 1;
        public static final int ILINK_TOKEN_FIELD_NUMBER = 3;
        public static final int IOS_IDFA_FIELD_NUMBER = 6;
        private static volatile C24062w1<IlinkAuthConfig> PARSER = null;
        public static final int SESSION_MODULE_TYPE_FIELD_NUMBER = 5;
        public static final int SESSION_TYPE_FIELD_NUMBER = 4;
        private int bitField0_;
        private String ilinkId_ = "";
        private String ilinkSn_ = "";
        private String ilinkToken_ = "";
        private String iosIdfa_ = "";
        private int sessionModuleType_;
        private int sessionType_;

        public static final class Builder extends C23861l0.C23862a<IlinkAuthConfig, Builder> implements IlinkAuthConfigOrBuilder {
            public /* synthetic */ Builder(C241151 r1) {
                this();
            }

            public Builder clearIlinkId() {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).clearIlinkId();
                return this;
            }

            public Builder clearIlinkSn() {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).clearIlinkSn();
                return this;
            }

            public Builder clearIlinkToken() {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).clearIlinkToken();
                return this;
            }

            public Builder clearIosIdfa() {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).clearIosIdfa();
                return this;
            }

            public Builder clearSessionModuleType() {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).clearSessionModuleType();
                return this;
            }

            public Builder clearSessionType() {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).clearSessionType();
                return this;
            }

            public String getIlinkId() {
                return ((IlinkAuthConfig) this.instance).getIlinkId();
            }

            public C16994k getIlinkIdBytes() {
                return ((IlinkAuthConfig) this.instance).getIlinkIdBytes();
            }

            public String getIlinkSn() {
                return ((IlinkAuthConfig) this.instance).getIlinkSn();
            }

            public C16994k getIlinkSnBytes() {
                return ((IlinkAuthConfig) this.instance).getIlinkSnBytes();
            }

            public String getIlinkToken() {
                return ((IlinkAuthConfig) this.instance).getIlinkToken();
            }

            public C16994k getIlinkTokenBytes() {
                return ((IlinkAuthConfig) this.instance).getIlinkTokenBytes();
            }

            public String getIosIdfa() {
                return ((IlinkAuthConfig) this.instance).getIosIdfa();
            }

            public C16994k getIosIdfaBytes() {
                return ((IlinkAuthConfig) this.instance).getIosIdfaBytes();
            }

            public int getSessionModuleType() {
                return ((IlinkAuthConfig) this.instance).getSessionModuleType();
            }

            public int getSessionType() {
                return ((IlinkAuthConfig) this.instance).getSessionType();
            }

            public boolean hasIlinkId() {
                return ((IlinkAuthConfig) this.instance).hasIlinkId();
            }

            public boolean hasIlinkSn() {
                return ((IlinkAuthConfig) this.instance).hasIlinkSn();
            }

            public boolean hasIlinkToken() {
                return ((IlinkAuthConfig) this.instance).hasIlinkToken();
            }

            public boolean hasIosIdfa() {
                return ((IlinkAuthConfig) this.instance).hasIosIdfa();
            }

            public boolean hasSessionModuleType() {
                return ((IlinkAuthConfig) this.instance).hasSessionModuleType();
            }

            public boolean hasSessionType() {
                return ((IlinkAuthConfig) this.instance).hasSessionType();
            }

            public Builder setIlinkId(String str) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIlinkId(str);
                return this;
            }

            public Builder setIlinkIdBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIlinkIdBytes(kVar);
                return this;
            }

            public Builder setIlinkSn(String str) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIlinkSn(str);
                return this;
            }

            public Builder setIlinkSnBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIlinkSnBytes(kVar);
                return this;
            }

            public Builder setIlinkToken(String str) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIlinkToken(str);
                return this;
            }

            public Builder setIlinkTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIlinkTokenBytes(kVar);
                return this;
            }

            public Builder setIosIdfa(String str) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIosIdfa(str);
                return this;
            }

            public Builder setIosIdfaBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setIosIdfaBytes(kVar);
                return this;
            }

            public Builder setSessionModuleType(int i) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setSessionModuleType(i);
                return this;
            }

            public Builder setSessionType(int i) {
                copyOnWrite();
                ((IlinkAuthConfig) this.instance).setSessionType(i);
                return this;
            }

            private Builder() {
                super(IlinkAuthConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAuthConfig ilinkAuthConfig = new IlinkAuthConfig();
            DEFAULT_INSTANCE = ilinkAuthConfig;
            C23861l0.registerDefaultInstance(IlinkAuthConfig.class, ilinkAuthConfig);
        }

        private IlinkAuthConfig() {
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
        public void clearIosIdfa() {
            this.bitField0_ &= -33;
            this.iosIdfa_ = getDefaultInstance().getIosIdfa();
        }

        /* access modifiers changed from: private */
        public void clearSessionModuleType() {
            this.bitField0_ &= -17;
            this.sessionModuleType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionType() {
            this.bitField0_ &= -9;
            this.sessionType_ = 0;
        }

        public static IlinkAuthConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAuthConfig parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAuthConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAuthConfig parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAuthConfig> parser() {
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
            this.bitField0_ |= 16;
            this.sessionModuleType_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionType(int i) {
            this.bitField0_ |= 8;
            this.sessionType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "ilinkSn_", "ilinkId_", "ilinkToken_", "sessionType_", "sessionModuleType_", "iosIdfa_"});
                case 3:
                    return new IlinkAuthConfig();
                case 4:
                    return new Builder((C241151) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAuthConfig> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAuthConfig.class) {
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

        public boolean hasIlinkId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIlinkSn() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIlinkToken() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasIosIdfa() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasSessionModuleType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSessionType() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkAuthConfig ilinkAuthConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAuthConfig);
        }

        public static IlinkAuthConfig parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAuthConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAuthConfig parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAuthConfig parseFrom(C16994k kVar) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAuthConfig parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAuthConfig parseFrom(byte[] bArr) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAuthConfig parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAuthConfig parseFrom(InputStream inputStream) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAuthConfig parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAuthConfig parseFrom(C23856l lVar) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAuthConfig parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAuthConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAuthConfigOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIlinkId();

        C16994k getIlinkIdBytes();

        String getIlinkSn();

        C16994k getIlinkSnBytes();

        String getIlinkToken();

        C16994k getIlinkTokenBytes();

        String getIosIdfa();

        C16994k getIosIdfaBytes();

        int getSessionModuleType();

        int getSessionType();

        boolean hasIlinkId();

        boolean hasIlinkSn();

        boolean hasIlinkToken();

        boolean hasIosIdfa();

        boolean hasSessionModuleType();

        boolean hasSessionType();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkDomainType implements C23908o0.C23911c {
        ILINK_DOMAIN_WEIXIN_COM(0),
        ILINK_DOMAIN_IOT_TENCENT_COM(1),
        ILINK_DOMAIN_WECHATPAY_CN(2);
        
        public static final int ILINK_DOMAIN_IOT_TENCENT_COM_VALUE = 1;
        public static final int ILINK_DOMAIN_WECHATPAY_CN_VALUE = 2;
        public static final int ILINK_DOMAIN_WEIXIN_COM_VALUE = 0;
        private static final C23908o0.C23912d<IlinkDomainType> internalValueMap = null;
        private final int value;

        public static final class IlinkDomainTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkDomainTypeVerifier();
            }

            private IlinkDomainTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkDomainType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkDomainType>() {
                public IlinkDomainType findValueByNumber(int i) {
                    return IlinkDomainType.forNumber(i);
                }
            };
        }

        private IlinkDomainType(int i) {
            this.value = i;
        }

        public static IlinkDomainType forNumber(int i) {
            if (i == 0) {
                return ILINK_DOMAIN_WEIXIN_COM;
            }
            if (i == 1) {
                return ILINK_DOMAIN_IOT_TENCENT_COM;
            }
            if (i != 2) {
                return null;
            }
            return ILINK_DOMAIN_WECHATPAY_CN;
        }

        public static C23908o0.C23912d<IlinkDomainType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkDomainTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkDomainType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkErrorCode implements C23908o0.C23911c {
        ILINK_ERROR_NONE(0),
        ILINK_ERROR_HANDLE_RESPONSE(1),
        ILINK_ERROR_AEPROXY_UNKNOWN(11),
        ILINK_ERROR_AEPROXY_NO_DATA(12),
        ILINK_ERROR_SESSION_TIMEOUT(13),
        ILINK_ERROR_AEPROXY_SYS(14),
        ILINK_ERROR_AEPROXY_ARG(15),
        ILINK_ERROR_APP_UNKNOWN(21),
        ILINK_ERROR_APP_SESSION_TIMEOUT(22),
        ILINK_ERROR_APP_ECDH_DECRYPT(23),
        ILINK_ERROR_APP_UNPACK(24),
        ILINK_ERROR_APP_NO_DATA(25),
        ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT(26),
        ILINK_ERROR_MARS(31),
        ILINK_ERROR_SOCKET_DISCONNECTED(32),
        ILINK_ERROR_TASK_TIMEOUT(33),
        ILINK_ERROR_NETWORK_UNAVAILABLE(34),
        ILINK_ERROR_SEND_PACKAGE_TIMEOUT(35),
        ILINK_ERROR_SOCKET_CREATE(36),
        ILINK_ERROR_SOCKET_SHUTDOWN(37),
        ILINK_ERROR_SOCKET_READ(38),
        ILINK_ERROR_SOCKET_RECV(39),
        ILINK_ERROR_UNPACK_MXPKG(40),
        ILINK_ERROR_DNS_RESOLVE(41),
        ILINK_ERROR_LONGPOLLING_TIMEOUT(42);
        
        public static final int ILINK_ERROR_AEPROXY_ARG_VALUE = 15;
        public static final int ILINK_ERROR_AEPROXY_NO_DATA_VALUE = 12;
        public static final int ILINK_ERROR_AEPROXY_SYS_VALUE = 14;
        public static final int ILINK_ERROR_AEPROXY_UNKNOWN_VALUE = 11;
        public static final int ILINK_ERROR_APP_ECDH_DECRYPT_VALUE = 23;
        public static final int ILINK_ERROR_APP_NO_DATA_VALUE = 25;
        public static final int ILINK_ERROR_APP_SESSION_TIMEOUT_VALUE = 22;
        public static final int ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT_VALUE = 26;
        public static final int ILINK_ERROR_APP_UNKNOWN_VALUE = 21;
        public static final int ILINK_ERROR_APP_UNPACK_VALUE = 24;
        public static final int ILINK_ERROR_DNS_RESOLVE_VALUE = 41;
        public static final int ILINK_ERROR_HANDLE_RESPONSE_VALUE = 1;
        public static final int ILINK_ERROR_LONGPOLLING_TIMEOUT_VALUE = 42;
        public static final int ILINK_ERROR_MARS_VALUE = 31;
        public static final int ILINK_ERROR_NETWORK_UNAVAILABLE_VALUE = 34;
        public static final int ILINK_ERROR_NONE_VALUE = 0;
        public static final int ILINK_ERROR_SEND_PACKAGE_TIMEOUT_VALUE = 35;
        public static final int ILINK_ERROR_SESSION_TIMEOUT_VALUE = 13;
        public static final int ILINK_ERROR_SOCKET_CREATE_VALUE = 36;
        public static final int ILINK_ERROR_SOCKET_DISCONNECTED_VALUE = 32;
        public static final int ILINK_ERROR_SOCKET_READ_VALUE = 38;
        public static final int ILINK_ERROR_SOCKET_RECV_VALUE = 39;
        public static final int ILINK_ERROR_SOCKET_SHUTDOWN_VALUE = 37;
        public static final int ILINK_ERROR_TASK_TIMEOUT_VALUE = 33;
        public static final int ILINK_ERROR_UNPACK_MXPKG_VALUE = 40;
        private static final C23908o0.C23912d<IlinkErrorCode> internalValueMap = null;
        private final int value;

        public static final class IlinkErrorCodeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkErrorCodeVerifier();
            }

            private IlinkErrorCodeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkErrorCode.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkErrorCode>() {
                public IlinkErrorCode findValueByNumber(int i) {
                    return IlinkErrorCode.forNumber(i);
                }
            };
        }

        private IlinkErrorCode(int i) {
            this.value = i;
        }

        public static IlinkErrorCode forNumber(int i) {
            if (i == 0) {
                return ILINK_ERROR_NONE;
            }
            if (i == 1) {
                return ILINK_ERROR_HANDLE_RESPONSE;
            }
            switch (i) {
                case 11:
                    return ILINK_ERROR_AEPROXY_UNKNOWN;
                case 12:
                    return ILINK_ERROR_AEPROXY_NO_DATA;
                case 13:
                    return ILINK_ERROR_SESSION_TIMEOUT;
                case 14:
                    return ILINK_ERROR_AEPROXY_SYS;
                case 15:
                    return ILINK_ERROR_AEPROXY_ARG;
                default:
                    switch (i) {
                        case 21:
                            return ILINK_ERROR_APP_UNKNOWN;
                        case 22:
                            return ILINK_ERROR_APP_SESSION_TIMEOUT;
                        case 23:
                            return ILINK_ERROR_APP_ECDH_DECRYPT;
                        case 24:
                            return ILINK_ERROR_APP_UNPACK;
                        case 25:
                            return ILINK_ERROR_APP_NO_DATA;
                        case 26:
                            return ILINK_ERROR_APP_TOO_MANY_IDC_REDIRECT;
                        default:
                            switch (i) {
                                case 31:
                                    return ILINK_ERROR_MARS;
                                case 32:
                                    return ILINK_ERROR_SOCKET_DISCONNECTED;
                                case 33:
                                    return ILINK_ERROR_TASK_TIMEOUT;
                                case 34:
                                    return ILINK_ERROR_NETWORK_UNAVAILABLE;
                                case 35:
                                    return ILINK_ERROR_SEND_PACKAGE_TIMEOUT;
                                case 36:
                                    return ILINK_ERROR_SOCKET_CREATE;
                                case 37:
                                    return ILINK_ERROR_SOCKET_SHUTDOWN;
                                case 38:
                                    return ILINK_ERROR_SOCKET_READ;
                                case 39:
                                    return ILINK_ERROR_SOCKET_RECV;
                                case 40:
                                    return ILINK_ERROR_UNPACK_MXPKG;
                                case 41:
                                    return ILINK_ERROR_DNS_RESOLVE;
                                case 42:
                                    return ILINK_ERROR_LONGPOLLING_TIMEOUT;
                                default:
                                    return null;
                            }
                    }
            }
        }

        public static C23908o0.C23912d<IlinkErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkErrorCodeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkErrorCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkLogConfig extends C23861l0<IlinkLogConfig, Builder> implements IlinkLogConfigOrBuilder {
        public static final int CUSTOM_LOG_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final IlinkLogConfig DEFAULT_INSTANCE;
        public static final int ENABLE_CONSOLE_FIELD_NUMBER = 3;
        public static final int ENABLE_FILTER_FIELD_NUMBER = 4;
        public static final int ENABLE_XLOG_FIELD_NUMBER = 5;
        public static final int LEVEL_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkLogConfig> PARSER = null;
        public static final int XLOG_SO_NAME_FIELD_NUMBER = 6;
        private int bitField0_;
        private boolean customLog_;
        private boolean enableConsole_;
        private boolean enableFilter_;
        private boolean enableXlog_ = true;
        private int level_;
        private String xlogSoName_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkLogConfig, Builder> implements IlinkLogConfigOrBuilder {
            public /* synthetic */ Builder(C241151 r1) {
                this();
            }

            public Builder clearCustomLog() {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).clearCustomLog();
                return this;
            }

            public Builder clearEnableConsole() {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).clearEnableConsole();
                return this;
            }

            public Builder clearEnableFilter() {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).clearEnableFilter();
                return this;
            }

            public Builder clearEnableXlog() {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).clearEnableXlog();
                return this;
            }

            public Builder clearLevel() {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).clearLevel();
                return this;
            }

            public Builder clearXlogSoName() {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).clearXlogSoName();
                return this;
            }

            public boolean getCustomLog() {
                return ((IlinkLogConfig) this.instance).getCustomLog();
            }

            public boolean getEnableConsole() {
                return ((IlinkLogConfig) this.instance).getEnableConsole();
            }

            public boolean getEnableFilter() {
                return ((IlinkLogConfig) this.instance).getEnableFilter();
            }

            public boolean getEnableXlog() {
                return ((IlinkLogConfig) this.instance).getEnableXlog();
            }

            public Proto.IlinkLogLevel getLevel() {
                return ((IlinkLogConfig) this.instance).getLevel();
            }

            public String getXlogSoName() {
                return ((IlinkLogConfig) this.instance).getXlogSoName();
            }

            public C16994k getXlogSoNameBytes() {
                return ((IlinkLogConfig) this.instance).getXlogSoNameBytes();
            }

            public boolean hasCustomLog() {
                return ((IlinkLogConfig) this.instance).hasCustomLog();
            }

            public boolean hasEnableConsole() {
                return ((IlinkLogConfig) this.instance).hasEnableConsole();
            }

            public boolean hasEnableFilter() {
                return ((IlinkLogConfig) this.instance).hasEnableFilter();
            }

            public boolean hasEnableXlog() {
                return ((IlinkLogConfig) this.instance).hasEnableXlog();
            }

            public boolean hasLevel() {
                return ((IlinkLogConfig) this.instance).hasLevel();
            }

            public boolean hasXlogSoName() {
                return ((IlinkLogConfig) this.instance).hasXlogSoName();
            }

            public Builder setCustomLog(boolean z) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setCustomLog(z);
                return this;
            }

            public Builder setEnableConsole(boolean z) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setEnableConsole(z);
                return this;
            }

            public Builder setEnableFilter(boolean z) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setEnableFilter(z);
                return this;
            }

            public Builder setEnableXlog(boolean z) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setEnableXlog(z);
                return this;
            }

            public Builder setLevel(Proto.IlinkLogLevel ilinkLogLevel) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setLevel(ilinkLogLevel);
                return this;
            }

            public Builder setXlogSoName(String str) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setXlogSoName(str);
                return this;
            }

            public Builder setXlogSoNameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkLogConfig) this.instance).setXlogSoNameBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkLogConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkLogConfig ilinkLogConfig = new IlinkLogConfig();
            DEFAULT_INSTANCE = ilinkLogConfig;
            C23861l0.registerDefaultInstance(IlinkLogConfig.class, ilinkLogConfig);
        }

        private IlinkLogConfig() {
        }

        /* access modifiers changed from: private */
        public void clearCustomLog() {
            this.bitField0_ &= -3;
            this.customLog_ = false;
        }

        /* access modifiers changed from: private */
        public void clearEnableConsole() {
            this.bitField0_ &= -5;
            this.enableConsole_ = false;
        }

        /* access modifiers changed from: private */
        public void clearEnableFilter() {
            this.bitField0_ &= -9;
            this.enableFilter_ = false;
        }

        /* access modifiers changed from: private */
        public void clearEnableXlog() {
            this.bitField0_ &= -17;
            this.enableXlog_ = true;
        }

        /* access modifiers changed from: private */
        public void clearLevel() {
            this.bitField0_ &= -2;
            this.level_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearXlogSoName() {
            this.bitField0_ &= -33;
            this.xlogSoName_ = getDefaultInstance().getXlogSoName();
        }

        public static IlinkLogConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkLogConfig parseDelimitedFrom(InputStream inputStream) {
            return (IlinkLogConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkLogConfig parseFrom(ByteBuffer byteBuffer) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkLogConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCustomLog(boolean z) {
            this.bitField0_ |= 2;
            this.customLog_ = z;
        }

        /* access modifiers changed from: private */
        public void setEnableConsole(boolean z) {
            this.bitField0_ |= 4;
            this.enableConsole_ = z;
        }

        /* access modifiers changed from: private */
        public void setEnableFilter(boolean z) {
            this.bitField0_ |= 8;
            this.enableFilter_ = z;
        }

        /* access modifiers changed from: private */
        public void setEnableXlog(boolean z) {
            this.bitField0_ |= 16;
            this.enableXlog_ = z;
        }

        /* access modifiers changed from: private */
        public void setLevel(Proto.IlinkLogLevel ilinkLogLevel) {
            this.level_ = ilinkLogLevel.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setXlogSoName(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.xlogSoName_ = str;
        }

        /* access modifiers changed from: private */
        public void setXlogSoNameBytes(C16994k kVar) {
            this.xlogSoName_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "level_", Proto.IlinkLogLevel.internalGetVerifier(), "customLog_", "enableConsole_", "enableFilter_", "enableXlog_", "xlogSoName_"});
                case 3:
                    return new IlinkLogConfig();
                case 4:
                    return new Builder((C241151) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkLogConfig> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkLogConfig.class) {
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

        public boolean getCustomLog() {
            return this.customLog_;
        }

        public boolean getEnableConsole() {
            return this.enableConsole_;
        }

        public boolean getEnableFilter() {
            return this.enableFilter_;
        }

        public boolean getEnableXlog() {
            return this.enableXlog_;
        }

        public Proto.IlinkLogLevel getLevel() {
            Proto.IlinkLogLevel forNumber = Proto.IlinkLogLevel.forNumber(this.level_);
            return forNumber == null ? Proto.IlinkLogLevel.kIlinkLogLevelVerbose : forNumber;
        }

        public String getXlogSoName() {
            return this.xlogSoName_;
        }

        public C16994k getXlogSoNameBytes() {
            return C16994k.m16791k(this.xlogSoName_);
        }

        public boolean hasCustomLog() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasEnableConsole() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasEnableFilter() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasEnableXlog() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLevel() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasXlogSoName() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(IlinkLogConfig ilinkLogConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkLogConfig);
        }

        public static IlinkLogConfig parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkLogConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkLogConfig parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkLogConfig parseFrom(C16994k kVar) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkLogConfig parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkLogConfig parseFrom(byte[] bArr) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkLogConfig parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkLogConfig parseFrom(InputStream inputStream) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkLogConfig parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkLogConfig parseFrom(C23856l lVar) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkLogConfig parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkLogConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkLogConfigOrBuilder extends C23848k1 {
        boolean getCustomLog();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getEnableConsole();

        boolean getEnableFilter();

        boolean getEnableXlog();

        Proto.IlinkLogLevel getLevel();

        String getXlogSoName();

        C16994k getXlogSoNameBytes();

        boolean hasCustomLog();

        boolean hasEnableConsole();

        boolean hasEnableFilter();

        boolean hasEnableXlog();

        boolean hasLevel();

        boolean hasXlogSoName();

        /* synthetic */ boolean isInitialized();
    }

    private Proto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
