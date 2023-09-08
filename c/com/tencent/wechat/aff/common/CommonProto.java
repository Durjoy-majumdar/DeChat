package com.tencent.wechat.aff.common;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C24062w1;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CommonProto {

    /* renamed from: com.tencent.wechat.aff.common.CommonProto$1 */
    public static /* synthetic */ class C243061 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69808xa1df5c61;

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
                f69808xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69808xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69808xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69808xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69808xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69808xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69808xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.common.CommonProto.C243061.<clinit>():void");
        }
    }

    public static final class AffCgiRequest extends C23861l0<AffCgiRequest, Builder> implements AffCgiRequestOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final AffCgiRequest DEFAULT_INSTANCE;
        public static final int ILINK_FIELD_NUMBER = 10;
        public static final int LONGPOLLINGTIMEOUT_FIELD_NUMBER = 8;
        public static final int LONGPOLLING_FIELD_NUMBER = 7;
        public static final int MMNET_FIELD_NUMBER = 9;
        private static volatile C24062w1<AffCgiRequest> PARSER = null;
        public static final int TRANSFERINFO_FIELD_NUMBER = 11;
        private int bitField0_;
        private C16994k data_ = C16994k.f46000e;
        private AffCgiInfo ilink_;
        private int longPollingTimeout_;
        private boolean longPolling_;
        private AffCgiInfo mmnet_;
        private AffCgiTransferInfo transferInfo_;

        public static final class AffCgiInfo extends C23861l0<AffCgiInfo, Builder> implements AffCgiInfoOrBuilder {
            public static final int CMDID_FIELD_NUMBER = 1;
            /* access modifiers changed from: private */
            public static final AffCgiInfo DEFAULT_INSTANCE;
            private static volatile C24062w1<AffCgiInfo> PARSER = null;
            public static final int URL_FIELD_NUMBER = 2;
            private int bitField0_;
            private int cmdid_;
            private String url_ = "";

            public static final class Builder extends C23861l0.C23862a<AffCgiInfo, Builder> implements AffCgiInfoOrBuilder {
                public /* synthetic */ Builder(C243061 r1) {
                    this();
                }

                public Builder clearCmdid() {
                    copyOnWrite();
                    ((AffCgiInfo) this.instance).clearCmdid();
                    return this;
                }

                public Builder clearUrl() {
                    copyOnWrite();
                    ((AffCgiInfo) this.instance).clearUrl();
                    return this;
                }

                public int getCmdid() {
                    return ((AffCgiInfo) this.instance).getCmdid();
                }

                public String getUrl() {
                    return ((AffCgiInfo) this.instance).getUrl();
                }

                public C16994k getUrlBytes() {
                    return ((AffCgiInfo) this.instance).getUrlBytes();
                }

                public boolean hasCmdid() {
                    return ((AffCgiInfo) this.instance).hasCmdid();
                }

                public boolean hasUrl() {
                    return ((AffCgiInfo) this.instance).hasUrl();
                }

                public Builder setCmdid(int i) {
                    copyOnWrite();
                    ((AffCgiInfo) this.instance).setCmdid(i);
                    return this;
                }

                public Builder setUrl(String str) {
                    copyOnWrite();
                    ((AffCgiInfo) this.instance).setUrl(str);
                    return this;
                }

                public Builder setUrlBytes(C16994k kVar) {
                    copyOnWrite();
                    ((AffCgiInfo) this.instance).setUrlBytes(kVar);
                    return this;
                }

                private Builder() {
                    super(AffCgiInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                AffCgiInfo affCgiInfo = new AffCgiInfo();
                DEFAULT_INSTANCE = affCgiInfo;
                C23861l0.registerDefaultInstance(AffCgiInfo.class, affCgiInfo);
            }

            private AffCgiInfo() {
            }

            /* access modifiers changed from: private */
            public void clearCmdid() {
                this.bitField0_ &= -2;
                this.cmdid_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearUrl() {
                this.bitField0_ &= -3;
                this.url_ = getDefaultInstance().getUrl();
            }

            public static AffCgiInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static AffCgiInfo parseDelimitedFrom(InputStream inputStream) {
                return (AffCgiInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AffCgiInfo parseFrom(ByteBuffer byteBuffer) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<AffCgiInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setCmdid(int i) {
                this.bitField0_ |= 1;
                this.cmdid_ = i;
            }

            /* access modifiers changed from: private */
            public void setUrl(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.url_ = str;
            }

            /* access modifiers changed from: private */
            public void setUrlBytes(C16994k kVar) {
                this.url_ = kVar.mo18752u();
                this.bitField0_ |= 2;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "cmdid_", "url_"});
                    case 3:
                        return new AffCgiInfo();
                    case 4:
                        return new Builder((C243061) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<AffCgiInfo> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (AffCgiInfo.class) {
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

            public int getCmdid() {
                return this.cmdid_;
            }

            public String getUrl() {
                return this.url_;
            }

            public C16994k getUrlBytes() {
                return C16994k.m16791k(this.url_);
            }

            public boolean hasCmdid() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasUrl() {
                return (this.bitField0_ & 2) != 0;
            }

            public static Builder newBuilder(AffCgiInfo affCgiInfo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(affCgiInfo);
            }

            public static AffCgiInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (AffCgiInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static AffCgiInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static AffCgiInfo parseFrom(C16994k kVar) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static AffCgiInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static AffCgiInfo parseFrom(byte[] bArr) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AffCgiInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static AffCgiInfo parseFrom(InputStream inputStream) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AffCgiInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static AffCgiInfo parseFrom(C23856l lVar) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static AffCgiInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (AffCgiInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        public interface AffCgiInfoOrBuilder extends C23848k1 {
            int getCmdid();

            /* synthetic */ C23845j1 getDefaultInstanceForType();

            String getUrl();

            C16994k getUrlBytes();

            boolean hasCmdid();

            boolean hasUrl();

            /* synthetic */ boolean isInitialized();
        }

        public static final class AffCgiTransferInfo extends C23861l0<AffCgiTransferInfo, Builder> implements AffCgiTransferInfoOrBuilder {
            /* access modifiers changed from: private */
            public static final AffCgiTransferInfo DEFAULT_INSTANCE;
            private static volatile C24062w1<AffCgiTransferInfo> PARSER = null;
            public static final int REQUESTCLASS_FIELD_NUMBER = 2;
            public static final int RESPONSECLASS_FIELD_NUMBER = 3;
            public static final int TRANSFER_FIELD_NUMBER = 1;
            private int bitField0_;
            private String requestClass_ = "";
            private String responseClass_ = "";
            private boolean transfer_;

            public static final class Builder extends C23861l0.C23862a<AffCgiTransferInfo, Builder> implements AffCgiTransferInfoOrBuilder {
                public /* synthetic */ Builder(C243061 r1) {
                    this();
                }

                public Builder clearRequestClass() {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).clearRequestClass();
                    return this;
                }

                public Builder clearResponseClass() {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).clearResponseClass();
                    return this;
                }

                public Builder clearTransfer() {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).clearTransfer();
                    return this;
                }

                public String getRequestClass() {
                    return ((AffCgiTransferInfo) this.instance).getRequestClass();
                }

                public C16994k getRequestClassBytes() {
                    return ((AffCgiTransferInfo) this.instance).getRequestClassBytes();
                }

                public String getResponseClass() {
                    return ((AffCgiTransferInfo) this.instance).getResponseClass();
                }

                public C16994k getResponseClassBytes() {
                    return ((AffCgiTransferInfo) this.instance).getResponseClassBytes();
                }

                public boolean getTransfer() {
                    return ((AffCgiTransferInfo) this.instance).getTransfer();
                }

                public boolean hasRequestClass() {
                    return ((AffCgiTransferInfo) this.instance).hasRequestClass();
                }

                public boolean hasResponseClass() {
                    return ((AffCgiTransferInfo) this.instance).hasResponseClass();
                }

                public boolean hasTransfer() {
                    return ((AffCgiTransferInfo) this.instance).hasTransfer();
                }

                public Builder setRequestClass(String str) {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).setRequestClass(str);
                    return this;
                }

                public Builder setRequestClassBytes(C16994k kVar) {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).setRequestClassBytes(kVar);
                    return this;
                }

                public Builder setResponseClass(String str) {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).setResponseClass(str);
                    return this;
                }

                public Builder setResponseClassBytes(C16994k kVar) {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).setResponseClassBytes(kVar);
                    return this;
                }

                public Builder setTransfer(boolean z) {
                    copyOnWrite();
                    ((AffCgiTransferInfo) this.instance).setTransfer(z);
                    return this;
                }

                private Builder() {
                    super(AffCgiTransferInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                AffCgiTransferInfo affCgiTransferInfo = new AffCgiTransferInfo();
                DEFAULT_INSTANCE = affCgiTransferInfo;
                C23861l0.registerDefaultInstance(AffCgiTransferInfo.class, affCgiTransferInfo);
            }

            private AffCgiTransferInfo() {
            }

            /* access modifiers changed from: private */
            public void clearRequestClass() {
                this.bitField0_ &= -3;
                this.requestClass_ = getDefaultInstance().getRequestClass();
            }

            /* access modifiers changed from: private */
            public void clearResponseClass() {
                this.bitField0_ &= -5;
                this.responseClass_ = getDefaultInstance().getResponseClass();
            }

            /* access modifiers changed from: private */
            public void clearTransfer() {
                this.bitField0_ &= -2;
                this.transfer_ = false;
            }

            public static AffCgiTransferInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static AffCgiTransferInfo parseDelimitedFrom(InputStream inputStream) {
                return (AffCgiTransferInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AffCgiTransferInfo parseFrom(ByteBuffer byteBuffer) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<AffCgiTransferInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setRequestClass(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.requestClass_ = str;
            }

            /* access modifiers changed from: private */
            public void setRequestClassBytes(C16994k kVar) {
                this.requestClass_ = kVar.mo18752u();
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void setResponseClass(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.responseClass_ = str;
            }

            /* access modifiers changed from: private */
            public void setResponseClassBytes(C16994k kVar) {
                this.responseClass_ = kVar.mo18752u();
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void setTransfer(boolean z) {
                this.bitField0_ |= 1;
                this.transfer_ = z;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "transfer_", "requestClass_", "responseClass_"});
                    case 3:
                        return new AffCgiTransferInfo();
                    case 4:
                        return new Builder((C243061) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<AffCgiTransferInfo> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (AffCgiTransferInfo.class) {
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

            public String getRequestClass() {
                return this.requestClass_;
            }

            public C16994k getRequestClassBytes() {
                return C16994k.m16791k(this.requestClass_);
            }

            public String getResponseClass() {
                return this.responseClass_;
            }

            public C16994k getResponseClassBytes() {
                return C16994k.m16791k(this.responseClass_);
            }

            public boolean getTransfer() {
                return this.transfer_;
            }

            public boolean hasRequestClass() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasResponseClass() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasTransfer() {
                return (this.bitField0_ & 1) != 0;
            }

            public static Builder newBuilder(AffCgiTransferInfo affCgiTransferInfo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(affCgiTransferInfo);
            }

            public static AffCgiTransferInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (AffCgiTransferInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static AffCgiTransferInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static AffCgiTransferInfo parseFrom(C16994k kVar) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static AffCgiTransferInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static AffCgiTransferInfo parseFrom(byte[] bArr) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static AffCgiTransferInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static AffCgiTransferInfo parseFrom(InputStream inputStream) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static AffCgiTransferInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static AffCgiTransferInfo parseFrom(C23856l lVar) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static AffCgiTransferInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (AffCgiTransferInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        public interface AffCgiTransferInfoOrBuilder extends C23848k1 {
            /* synthetic */ C23845j1 getDefaultInstanceForType();

            String getRequestClass();

            C16994k getRequestClassBytes();

            String getResponseClass();

            C16994k getResponseClassBytes();

            boolean getTransfer();

            boolean hasRequestClass();

            boolean hasResponseClass();

            boolean hasTransfer();

            /* synthetic */ boolean isInitialized();
        }

        public static final class Builder extends C23861l0.C23862a<AffCgiRequest, Builder> implements AffCgiRequestOrBuilder {
            public /* synthetic */ Builder(C243061 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((AffCgiRequest) this.instance).clearData();
                return this;
            }

            public Builder clearIlink() {
                copyOnWrite();
                ((AffCgiRequest) this.instance).clearIlink();
                return this;
            }

            public Builder clearLongPolling() {
                copyOnWrite();
                ((AffCgiRequest) this.instance).clearLongPolling();
                return this;
            }

            public Builder clearLongPollingTimeout() {
                copyOnWrite();
                ((AffCgiRequest) this.instance).clearLongPollingTimeout();
                return this;
            }

            public Builder clearMmnet() {
                copyOnWrite();
                ((AffCgiRequest) this.instance).clearMmnet();
                return this;
            }

            public Builder clearTransferInfo() {
                copyOnWrite();
                ((AffCgiRequest) this.instance).clearTransferInfo();
                return this;
            }

            public C16994k getData() {
                return ((AffCgiRequest) this.instance).getData();
            }

            public AffCgiInfo getIlink() {
                return ((AffCgiRequest) this.instance).getIlink();
            }

            public boolean getLongPolling() {
                return ((AffCgiRequest) this.instance).getLongPolling();
            }

            public int getLongPollingTimeout() {
                return ((AffCgiRequest) this.instance).getLongPollingTimeout();
            }

            public AffCgiInfo getMmnet() {
                return ((AffCgiRequest) this.instance).getMmnet();
            }

            public AffCgiTransferInfo getTransferInfo() {
                return ((AffCgiRequest) this.instance).getTransferInfo();
            }

            public boolean hasData() {
                return ((AffCgiRequest) this.instance).hasData();
            }

            public boolean hasIlink() {
                return ((AffCgiRequest) this.instance).hasIlink();
            }

            public boolean hasLongPolling() {
                return ((AffCgiRequest) this.instance).hasLongPolling();
            }

            public boolean hasLongPollingTimeout() {
                return ((AffCgiRequest) this.instance).hasLongPollingTimeout();
            }

            public boolean hasMmnet() {
                return ((AffCgiRequest) this.instance).hasMmnet();
            }

            public boolean hasTransferInfo() {
                return ((AffCgiRequest) this.instance).hasTransferInfo();
            }

            public Builder mergeIlink(AffCgiInfo affCgiInfo) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).mergeIlink(affCgiInfo);
                return this;
            }

            public Builder mergeMmnet(AffCgiInfo affCgiInfo) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).mergeMmnet(affCgiInfo);
                return this;
            }

            public Builder mergeTransferInfo(AffCgiTransferInfo affCgiTransferInfo) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).mergeTransferInfo(affCgiTransferInfo);
                return this;
            }

            public Builder setData(C16994k kVar) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setData(kVar);
                return this;
            }

            public Builder setIlink(AffCgiInfo affCgiInfo) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setIlink(affCgiInfo);
                return this;
            }

            public Builder setLongPolling(boolean z) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setLongPolling(z);
                return this;
            }

            public Builder setLongPollingTimeout(int i) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setLongPollingTimeout(i);
                return this;
            }

            public Builder setMmnet(AffCgiInfo affCgiInfo) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setMmnet(affCgiInfo);
                return this;
            }

            public Builder setTransferInfo(AffCgiTransferInfo affCgiTransferInfo) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setTransferInfo(affCgiTransferInfo);
                return this;
            }

            private Builder() {
                super(AffCgiRequest.DEFAULT_INSTANCE);
            }

            public Builder setIlink(AffCgiInfo.Builder builder) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setIlink((AffCgiInfo) builder.build());
                return this;
            }

            public Builder setMmnet(AffCgiInfo.Builder builder) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setMmnet((AffCgiInfo) builder.build());
                return this;
            }

            public Builder setTransferInfo(AffCgiTransferInfo.Builder builder) {
                copyOnWrite();
                ((AffCgiRequest) this.instance).setTransferInfo((AffCgiTransferInfo) builder.build());
                return this;
            }
        }

        static {
            AffCgiRequest affCgiRequest = new AffCgiRequest();
            DEFAULT_INSTANCE = affCgiRequest;
            C23861l0.registerDefaultInstance(AffCgiRequest.class, affCgiRequest);
        }

        private AffCgiRequest() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -2;
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearIlink() {
            this.ilink_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearLongPolling() {
            this.bitField0_ &= -3;
            this.longPolling_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLongPollingTimeout() {
            this.bitField0_ &= -5;
            this.longPollingTimeout_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMmnet() {
            this.mmnet_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearTransferInfo() {
            this.transferInfo_ = null;
            this.bitField0_ &= -33;
        }

        public static AffCgiRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeIlink(AffCgiInfo affCgiInfo) {
            affCgiInfo.getClass();
            AffCgiInfo affCgiInfo2 = this.ilink_;
            if (affCgiInfo2 == null || affCgiInfo2 == AffCgiInfo.getDefaultInstance()) {
                this.ilink_ = affCgiInfo;
            } else {
                this.ilink_ = (AffCgiInfo) ((AffCgiInfo.Builder) AffCgiInfo.newBuilder(this.ilink_).mergeFrom(affCgiInfo)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeMmnet(AffCgiInfo affCgiInfo) {
            affCgiInfo.getClass();
            AffCgiInfo affCgiInfo2 = this.mmnet_;
            if (affCgiInfo2 == null || affCgiInfo2 == AffCgiInfo.getDefaultInstance()) {
                this.mmnet_ = affCgiInfo;
            } else {
                this.mmnet_ = (AffCgiInfo) ((AffCgiInfo.Builder) AffCgiInfo.newBuilder(this.mmnet_).mergeFrom(affCgiInfo)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeTransferInfo(AffCgiTransferInfo affCgiTransferInfo) {
            affCgiTransferInfo.getClass();
            AffCgiTransferInfo affCgiTransferInfo2 = this.transferInfo_;
            if (affCgiTransferInfo2 == null || affCgiTransferInfo2 == AffCgiTransferInfo.getDefaultInstance()) {
                this.transferInfo_ = affCgiTransferInfo;
            } else {
                this.transferInfo_ = (AffCgiTransferInfo) ((AffCgiTransferInfo.Builder) AffCgiTransferInfo.newBuilder(this.transferInfo_).mergeFrom(affCgiTransferInfo)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AffCgiRequest parseDelimitedFrom(InputStream inputStream) {
            return (AffCgiRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AffCgiRequest parseFrom(ByteBuffer byteBuffer) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<AffCgiRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.data_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setIlink(AffCgiInfo affCgiInfo) {
            affCgiInfo.getClass();
            this.ilink_ = affCgiInfo;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setLongPolling(boolean z) {
            this.bitField0_ |= 2;
            this.longPolling_ = z;
        }

        /* access modifiers changed from: private */
        public void setLongPollingTimeout(int i) {
            this.bitField0_ |= 4;
            this.longPollingTimeout_ = i;
        }

        /* access modifiers changed from: private */
        public void setMmnet(AffCgiInfo affCgiInfo) {
            affCgiInfo.getClass();
            this.mmnet_ = affCgiInfo;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setTransferInfo(AffCgiTransferInfo affCgiTransferInfo) {
            affCgiTransferInfo.getClass();
            this.transferInfo_ = affCgiTransferInfo;
            this.bitField0_ |= 32;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ည\u0000\u0007ဇ\u0001\bဋ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005", new Object[]{"bitField0_", "data_", "longPolling_", "longPollingTimeout_", "mmnet_", "ilink_", "transferInfo_"});
                case 3:
                    return new AffCgiRequest();
                case 4:
                    return new Builder((C243061) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<AffCgiRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (AffCgiRequest.class) {
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

        public C16994k getData() {
            return this.data_;
        }

        public AffCgiInfo getIlink() {
            AffCgiInfo affCgiInfo = this.ilink_;
            return affCgiInfo == null ? AffCgiInfo.getDefaultInstance() : affCgiInfo;
        }

        public boolean getLongPolling() {
            return this.longPolling_;
        }

        public int getLongPollingTimeout() {
            return this.longPollingTimeout_;
        }

        public AffCgiInfo getMmnet() {
            AffCgiInfo affCgiInfo = this.mmnet_;
            return affCgiInfo == null ? AffCgiInfo.getDefaultInstance() : affCgiInfo;
        }

        public AffCgiTransferInfo getTransferInfo() {
            AffCgiTransferInfo affCgiTransferInfo = this.transferInfo_;
            return affCgiTransferInfo == null ? AffCgiTransferInfo.getDefaultInstance() : affCgiTransferInfo;
        }

        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasIlink() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLongPolling() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLongPollingTimeout() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMmnet() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTransferInfo() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(AffCgiRequest affCgiRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(affCgiRequest);
        }

        public static AffCgiRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AffCgiRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AffCgiRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static AffCgiRequest parseFrom(C16994k kVar) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static AffCgiRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static AffCgiRequest parseFrom(byte[] bArr) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AffCgiRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static AffCgiRequest parseFrom(InputStream inputStream) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AffCgiRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AffCgiRequest parseFrom(C23856l lVar) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static AffCgiRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AffCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface AffCgiRequestOrBuilder extends C23848k1 {
        C16994k getData();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        AffCgiRequest.AffCgiInfo getIlink();

        boolean getLongPolling();

        int getLongPollingTimeout();

        AffCgiRequest.AffCgiInfo getMmnet();

        AffCgiRequest.AffCgiTransferInfo getTransferInfo();

        boolean hasData();

        boolean hasIlink();

        boolean hasLongPolling();

        boolean hasLongPollingTimeout();

        boolean hasMmnet();

        boolean hasTransferInfo();

        /* synthetic */ boolean isInitialized();
    }

    public static final class AffCgiResponse extends C23861l0<AffCgiResponse, Builder> implements AffCgiResponseOrBuilder {
        public static final int DATA_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final AffCgiResponse DEFAULT_INSTANCE;
        public static final int ERRORCODE_FIELD_NUMBER = 2;
        public static final int ERRORMESSAGE_FIELD_NUMBER = 3;
        public static final int ERRORTYPE_FIELD_NUMBER = 1;
        private static volatile C24062w1<AffCgiResponse> PARSER;
        private int bitField0_;
        private C16994k data_ = C16994k.f46000e;
        private int errorCode_;
        private String errorMessage_ = "";
        private int errorType_;

        public static final class Builder extends C23861l0.C23862a<AffCgiResponse, Builder> implements AffCgiResponseOrBuilder {
            public /* synthetic */ Builder(C243061 r1) {
                this();
            }

            public Builder clearData() {
                copyOnWrite();
                ((AffCgiResponse) this.instance).clearData();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((AffCgiResponse) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearErrorMessage() {
                copyOnWrite();
                ((AffCgiResponse) this.instance).clearErrorMessage();
                return this;
            }

            public Builder clearErrorType() {
                copyOnWrite();
                ((AffCgiResponse) this.instance).clearErrorType();
                return this;
            }

            public C16994k getData() {
                return ((AffCgiResponse) this.instance).getData();
            }

            public int getErrorCode() {
                return ((AffCgiResponse) this.instance).getErrorCode();
            }

            public String getErrorMessage() {
                return ((AffCgiResponse) this.instance).getErrorMessage();
            }

            public C16994k getErrorMessageBytes() {
                return ((AffCgiResponse) this.instance).getErrorMessageBytes();
            }

            public int getErrorType() {
                return ((AffCgiResponse) this.instance).getErrorType();
            }

            public boolean hasData() {
                return ((AffCgiResponse) this.instance).hasData();
            }

            public boolean hasErrorCode() {
                return ((AffCgiResponse) this.instance).hasErrorCode();
            }

            public boolean hasErrorMessage() {
                return ((AffCgiResponse) this.instance).hasErrorMessage();
            }

            public boolean hasErrorType() {
                return ((AffCgiResponse) this.instance).hasErrorType();
            }

            public Builder setData(C16994k kVar) {
                copyOnWrite();
                ((AffCgiResponse) this.instance).setData(kVar);
                return this;
            }

            public Builder setErrorCode(int i) {
                copyOnWrite();
                ((AffCgiResponse) this.instance).setErrorCode(i);
                return this;
            }

            public Builder setErrorMessage(String str) {
                copyOnWrite();
                ((AffCgiResponse) this.instance).setErrorMessage(str);
                return this;
            }

            public Builder setErrorMessageBytes(C16994k kVar) {
                copyOnWrite();
                ((AffCgiResponse) this.instance).setErrorMessageBytes(kVar);
                return this;
            }

            public Builder setErrorType(int i) {
                copyOnWrite();
                ((AffCgiResponse) this.instance).setErrorType(i);
                return this;
            }

            private Builder() {
                super(AffCgiResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            AffCgiResponse affCgiResponse = new AffCgiResponse();
            DEFAULT_INSTANCE = affCgiResponse;
            C23861l0.registerDefaultInstance(AffCgiResponse.class, affCgiResponse);
        }

        private AffCgiResponse() {
        }

        /* access modifiers changed from: private */
        public void clearData() {
            this.bitField0_ &= -9;
            this.data_ = getDefaultInstance().getData();
        }

        /* access modifiers changed from: private */
        public void clearErrorCode() {
            this.bitField0_ &= -3;
            this.errorCode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearErrorMessage() {
            this.bitField0_ &= -5;
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        /* access modifiers changed from: private */
        public void clearErrorType() {
            this.bitField0_ &= -2;
            this.errorType_ = 0;
        }

        public static AffCgiResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static AffCgiResponse parseDelimitedFrom(InputStream inputStream) {
            return (AffCgiResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AffCgiResponse parseFrom(ByteBuffer byteBuffer) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<AffCgiResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setData(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.data_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.bitField0_ |= 2;
            this.errorCode_ = i;
        }

        /* access modifiers changed from: private */
        public void setErrorMessage(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.errorMessage_ = str;
        }

        /* access modifiers changed from: private */
        public void setErrorMessageBytes(C16994k kVar) {
            this.errorMessage_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setErrorType(int i) {
            this.bitField0_ |= 1;
            this.errorType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003", new Object[]{"bitField0_", "errorType_", "errorCode_", "errorMessage_", "data_"});
                case 3:
                    return new AffCgiResponse();
                case 4:
                    return new Builder((C243061) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<AffCgiResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (AffCgiResponse.class) {
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

        public C16994k getData() {
            return this.data_;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public C16994k getErrorMessageBytes() {
            return C16994k.m16791k(this.errorMessage_);
        }

        public int getErrorType() {
            return this.errorType_;
        }

        public boolean hasData() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasErrorMessage() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasErrorType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(AffCgiResponse affCgiResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(affCgiResponse);
        }

        public static AffCgiResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AffCgiResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AffCgiResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static AffCgiResponse parseFrom(C16994k kVar) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static AffCgiResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static AffCgiResponse parseFrom(byte[] bArr) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AffCgiResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static AffCgiResponse parseFrom(InputStream inputStream) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AffCgiResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static AffCgiResponse parseFrom(C23856l lVar) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static AffCgiResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (AffCgiResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface AffCgiResponseOrBuilder extends C23848k1 {
        C16994k getData();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getErrorCode();

        String getErrorMessage();

        C16994k getErrorMessageBytes();

        int getErrorType();

        boolean hasData();

        boolean hasErrorCode();

        boolean hasErrorMessage();

        boolean hasErrorType();

        /* synthetic */ boolean isInitialized();
    }

    private CommonProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
