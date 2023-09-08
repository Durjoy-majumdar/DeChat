package com.tencent.ilink.network;

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

    /* renamed from: com.tencent.ilink.network.Proto$1 */
    public static /* synthetic */ class C241181 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69252xa1df5c61;

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
                f69252xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69252xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69252xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69252xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69252xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69252xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69252xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.ilink.network.Proto.C241181.<clinit>():void");
        }
    }

    public static final class CloudCgiRequest extends C23861l0<CloudCgiRequest, Builder> implements CloudCgiRequestOrBuilder {
        public static final int CGI_TYPE_FIELD_NUMBER = 1;
        public static final int CLOUD_TASKID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final CloudCgiRequest DEFAULT_INSTANCE;
        public static final int LONG_POLLING_FIELD_NUMBER = 5;
        private static volatile C24062w1<CloudCgiRequest> PARSER = null;
        public static final int REQUEST_BODY_FIELD_NUMBER = 3;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int cgiType_ = 1;
        private int cloudTaskid_;
        private boolean longPolling_;
        private C16994k requestBody_ = C16994k.f46000e;
        private int timeoutMs_;

        public static final class Builder extends C23861l0.C23862a<CloudCgiRequest, Builder> implements CloudCgiRequestOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearCgiType() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearCgiType();
                return this;
            }

            public Builder clearCloudTaskid() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearCloudTaskid();
                return this;
            }

            public Builder clearLongPolling() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearLongPolling();
                return this;
            }

            public Builder clearRequestBody() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearRequestBody();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).clearTimeoutMs();
                return this;
            }

            public CloudCgiType getCgiType() {
                return ((CloudCgiRequest) this.instance).getCgiType();
            }

            public int getCloudTaskid() {
                return ((CloudCgiRequest) this.instance).getCloudTaskid();
            }

            public boolean getLongPolling() {
                return ((CloudCgiRequest) this.instance).getLongPolling();
            }

            public C16994k getRequestBody() {
                return ((CloudCgiRequest) this.instance).getRequestBody();
            }

            public int getTimeoutMs() {
                return ((CloudCgiRequest) this.instance).getTimeoutMs();
            }

            public boolean hasCgiType() {
                return ((CloudCgiRequest) this.instance).hasCgiType();
            }

            public boolean hasCloudTaskid() {
                return ((CloudCgiRequest) this.instance).hasCloudTaskid();
            }

            public boolean hasLongPolling() {
                return ((CloudCgiRequest) this.instance).hasLongPolling();
            }

            public boolean hasRequestBody() {
                return ((CloudCgiRequest) this.instance).hasRequestBody();
            }

            public boolean hasTimeoutMs() {
                return ((CloudCgiRequest) this.instance).hasTimeoutMs();
            }

            public Builder setCgiType(CloudCgiType cloudCgiType) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setCgiType(cloudCgiType);
                return this;
            }

            public Builder setCloudTaskid(int i) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setCloudTaskid(i);
                return this;
            }

            public Builder setLongPolling(boolean z) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setLongPolling(z);
                return this;
            }

            public Builder setRequestBody(C16994k kVar) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setRequestBody(kVar);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((CloudCgiRequest) this.instance).setTimeoutMs(i);
                return this;
            }

            private Builder() {
                super(CloudCgiRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            CloudCgiRequest cloudCgiRequest = new CloudCgiRequest();
            DEFAULT_INSTANCE = cloudCgiRequest;
            C23861l0.registerDefaultInstance(CloudCgiRequest.class, cloudCgiRequest);
        }

        private CloudCgiRequest() {
        }

        /* access modifiers changed from: private */
        public void clearCgiType() {
            this.bitField0_ &= -2;
            this.cgiType_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearCloudTaskid() {
            this.bitField0_ &= -3;
            this.cloudTaskid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLongPolling() {
            this.bitField0_ &= -17;
            this.longPolling_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRequestBody() {
            this.bitField0_ &= -5;
            this.requestBody_ = getDefaultInstance().getRequestBody();
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -9;
            this.timeoutMs_ = 0;
        }

        public static CloudCgiRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static CloudCgiRequest parseDelimitedFrom(InputStream inputStream) {
            return (CloudCgiRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudCgiRequest parseFrom(ByteBuffer byteBuffer) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<CloudCgiRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCgiType(CloudCgiType cloudCgiType) {
            this.cgiType_ = cloudCgiType.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCloudTaskid(int i) {
            this.bitField0_ |= 2;
            this.cloudTaskid_ = i;
        }

        /* access modifiers changed from: private */
        public void setLongPolling(boolean z) {
            this.bitField0_ |= 16;
            this.longPolling_ = z;
        }

        /* access modifiers changed from: private */
        public void setRequestBody(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.requestBody_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 8;
            this.timeoutMs_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဋ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "cgiType_", CloudCgiType.internalGetVerifier(), "cloudTaskid_", "requestBody_", "timeoutMs_", "longPolling_"});
                case 3:
                    return new CloudCgiRequest();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<CloudCgiRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (CloudCgiRequest.class) {
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

        public CloudCgiType getCgiType() {
            CloudCgiType forNumber = CloudCgiType.forNumber(this.cgiType_);
            return forNumber == null ? CloudCgiType.kAuthRequest : forNumber;
        }

        public int getCloudTaskid() {
            return this.cloudTaskid_;
        }

        public boolean getLongPolling() {
            return this.longPolling_;
        }

        public C16994k getRequestBody() {
            return this.requestBody_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public boolean hasCgiType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCloudTaskid() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLongPolling() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasRequestBody() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(CloudCgiRequest cloudCgiRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(cloudCgiRequest);
        }

        public static CloudCgiRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CloudCgiRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CloudCgiRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static CloudCgiRequest parseFrom(C16994k kVar) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static CloudCgiRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static CloudCgiRequest parseFrom(byte[] bArr) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CloudCgiRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static CloudCgiRequest parseFrom(InputStream inputStream) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CloudCgiRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static CloudCgiRequest parseFrom(C23856l lVar) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static CloudCgiRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (CloudCgiRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface CloudCgiRequestOrBuilder extends C23848k1 {
        CloudCgiType getCgiType();

        int getCloudTaskid();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getLongPolling();

        C16994k getRequestBody();

        int getTimeoutMs();

        boolean hasCgiType();

        boolean hasCloudTaskid();

        boolean hasLongPolling();

        boolean hasRequestBody();

        boolean hasTimeoutMs();

        /* synthetic */ boolean isInitialized();
    }

    public enum CloudCgiType implements C23908o0.C23911c {
        kAuthRequest(1),
        kTransferRequest(2);
        
        private static final C23908o0.C23912d<CloudCgiType> internalValueMap = null;
        public static final int kAuthRequest_VALUE = 1;
        public static final int kTransferRequest_VALUE = 2;
        private final int value;

        public static final class CloudCgiTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new CloudCgiTypeVerifier();
            }

            private CloudCgiTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return CloudCgiType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<CloudCgiType>() {
                public CloudCgiType findValueByNumber(int i) {
                    return CloudCgiType.forNumber(i);
                }
            };
        }

        private CloudCgiType(int i) {
            this.value = i;
        }

        public static CloudCgiType forNumber(int i) {
            if (i == 1) {
                return kAuthRequest;
            }
            if (i != 2) {
                return null;
            }
            return kTransferRequest;
        }

        public static C23908o0.C23912d<CloudCgiType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return CloudCgiTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static CloudCgiType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class HostInfo extends C23861l0<HostInfo, Builder> implements HostInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final HostInfo DEFAULT_INSTANCE;
        public static final int IP_LIST_FIELD_NUMBER = 3;
        public static final int ORIGIN_FIELD_NUMBER = 1;
        private static volatile C24062w1<HostInfo> PARSER = null;
        public static final int SUBSTITUTE_FIELD_NUMBER = 2;
        private int bitField0_;
        private C23908o0.C23919j<IPInfo> ipList_ = C23861l0.emptyProtobufList();
        private String origin_ = "";
        private String substitute_ = "";

        public static final class Builder extends C23861l0.C23862a<HostInfo, Builder> implements HostInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder addAllIpList(Iterable<? extends IPInfo> iterable) {
                copyOnWrite();
                ((HostInfo) this.instance).addAllIpList(iterable);
                return this;
            }

            public Builder addIpList(IPInfo iPInfo) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(iPInfo);
                return this;
            }

            public Builder clearIpList() {
                copyOnWrite();
                ((HostInfo) this.instance).clearIpList();
                return this;
            }

            public Builder clearOrigin() {
                copyOnWrite();
                ((HostInfo) this.instance).clearOrigin();
                return this;
            }

            public Builder clearSubstitute() {
                copyOnWrite();
                ((HostInfo) this.instance).clearSubstitute();
                return this;
            }

            public IPInfo getIpList(int i) {
                return ((HostInfo) this.instance).getIpList(i);
            }

            public int getIpListCount() {
                return ((HostInfo) this.instance).getIpListCount();
            }

            public List<IPInfo> getIpListList() {
                return Collections.unmodifiableList(((HostInfo) this.instance).getIpListList());
            }

            public String getOrigin() {
                return ((HostInfo) this.instance).getOrigin();
            }

            public C16994k getOriginBytes() {
                return ((HostInfo) this.instance).getOriginBytes();
            }

            public String getSubstitute() {
                return ((HostInfo) this.instance).getSubstitute();
            }

            public C16994k getSubstituteBytes() {
                return ((HostInfo) this.instance).getSubstituteBytes();
            }

            public boolean hasOrigin() {
                return ((HostInfo) this.instance).hasOrigin();
            }

            public boolean hasSubstitute() {
                return ((HostInfo) this.instance).hasSubstitute();
            }

            public Builder removeIpList(int i) {
                copyOnWrite();
                ((HostInfo) this.instance).removeIpList(i);
                return this;
            }

            public Builder setIpList(int i, IPInfo iPInfo) {
                copyOnWrite();
                ((HostInfo) this.instance).setIpList(i, iPInfo);
                return this;
            }

            public Builder setOrigin(String str) {
                copyOnWrite();
                ((HostInfo) this.instance).setOrigin(str);
                return this;
            }

            public Builder setOriginBytes(C16994k kVar) {
                copyOnWrite();
                ((HostInfo) this.instance).setOriginBytes(kVar);
                return this;
            }

            public Builder setSubstitute(String str) {
                copyOnWrite();
                ((HostInfo) this.instance).setSubstitute(str);
                return this;
            }

            public Builder setSubstituteBytes(C16994k kVar) {
                copyOnWrite();
                ((HostInfo) this.instance).setSubstituteBytes(kVar);
                return this;
            }

            private Builder() {
                super(HostInfo.DEFAULT_INSTANCE);
            }

            public Builder addIpList(int i, IPInfo iPInfo) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(i, iPInfo);
                return this;
            }

            public Builder setIpList(int i, IPInfo.Builder builder) {
                copyOnWrite();
                ((HostInfo) this.instance).setIpList(i, (IPInfo) builder.build());
                return this;
            }

            public Builder addIpList(IPInfo.Builder builder) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList((IPInfo) builder.build());
                return this;
            }

            public Builder addIpList(int i, IPInfo.Builder builder) {
                copyOnWrite();
                ((HostInfo) this.instance).addIpList(i, (IPInfo) builder.build());
                return this;
            }
        }

        static {
            HostInfo hostInfo = new HostInfo();
            DEFAULT_INSTANCE = hostInfo;
            C23861l0.registerDefaultInstance(HostInfo.class, hostInfo);
        }

        private HostInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllIpList(Iterable<? extends IPInfo> iterable) {
            ensureIpListIsMutable();
            C23810b.addAll(iterable, this.ipList_);
        }

        /* access modifiers changed from: private */
        public void addIpList(IPInfo iPInfo) {
            iPInfo.getClass();
            ensureIpListIsMutable();
            this.ipList_.add(iPInfo);
        }

        /* access modifiers changed from: private */
        public void clearIpList() {
            this.ipList_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearOrigin() {
            this.bitField0_ &= -2;
            this.origin_ = getDefaultInstance().getOrigin();
        }

        /* access modifiers changed from: private */
        public void clearSubstitute() {
            this.bitField0_ &= -3;
            this.substitute_ = getDefaultInstance().getSubstitute();
        }

        private void ensureIpListIsMutable() {
            C23908o0.C23919j<IPInfo> jVar = this.ipList_;
            if (!jVar.mo37523Q()) {
                this.ipList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static HostInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static HostInfo parseDelimitedFrom(InputStream inputStream) {
            return (HostInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HostInfo parseFrom(ByteBuffer byteBuffer) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<HostInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeIpList(int i) {
            ensureIpListIsMutable();
            this.ipList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setIpList(int i, IPInfo iPInfo) {
            iPInfo.getClass();
            ensureIpListIsMutable();
            this.ipList_.set(i, iPInfo);
        }

        /* access modifiers changed from: private */
        public void setOrigin(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.origin_ = str;
        }

        /* access modifiers changed from: private */
        public void setOriginBytes(C16994k kVar) {
            this.origin_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setSubstitute(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.substitute_ = str;
        }

        /* access modifiers changed from: private */
        public void setSubstituteBytes(C16994k kVar) {
            this.substitute_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "origin_", "substitute_", "ipList_", IPInfo.class});
                case 3:
                    return new HostInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<HostInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (HostInfo.class) {
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

        public IPInfo getIpList(int i) {
            return this.ipList_.get(i);
        }

        public int getIpListCount() {
            return this.ipList_.size();
        }

        public List<IPInfo> getIpListList() {
            return this.ipList_;
        }

        public IPInfoOrBuilder getIpListOrBuilder(int i) {
            return this.ipList_.get(i);
        }

        public List<? extends IPInfoOrBuilder> getIpListOrBuilderList() {
            return this.ipList_;
        }

        public String getOrigin() {
            return this.origin_;
        }

        public C16994k getOriginBytes() {
            return C16994k.m16791k(this.origin_);
        }

        public String getSubstitute() {
            return this.substitute_;
        }

        public C16994k getSubstituteBytes() {
            return C16994k.m16791k(this.substitute_);
        }

        public boolean hasOrigin() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSubstitute() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(HostInfo hostInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(hostInfo);
        }

        public static HostInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (HostInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static HostInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static HostInfo parseFrom(C16994k kVar) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addIpList(int i, IPInfo iPInfo) {
            iPInfo.getClass();
            ensureIpListIsMutable();
            this.ipList_.add(i, iPInfo);
        }

        public static HostInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static HostInfo parseFrom(byte[] bArr) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HostInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static HostInfo parseFrom(InputStream inputStream) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HostInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static HostInfo parseFrom(C23856l lVar) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static HostInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (HostInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface HostInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        IPInfo getIpList(int i);

        int getIpListCount();

        List<IPInfo> getIpListList();

        String getOrigin();

        C16994k getOriginBytes();

        String getSubstitute();

        C16994k getSubstituteBytes();

        boolean hasOrigin();

        boolean hasSubstitute();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IPInfo extends C23861l0<IPInfo, Builder> implements IPInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IPInfo DEFAULT_INSTANCE;
        public static final int IPV4_FIELD_NUMBER = 2;
        public static final int IPV6_FIELD_NUMBER = 3;
        private static volatile C24062w1<IPInfo> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private String ipv4_ = "";
        private String ipv6_ = "";
        private int type_;

        public static final class Builder extends C23861l0.C23862a<IPInfo, Builder> implements IPInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearIpv4() {
                copyOnWrite();
                ((IPInfo) this.instance).clearIpv4();
                return this;
            }

            public Builder clearIpv6() {
                copyOnWrite();
                ((IPInfo) this.instance).clearIpv6();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IPInfo) this.instance).clearType();
                return this;
            }

            public String getIpv4() {
                return ((IPInfo) this.instance).getIpv4();
            }

            public C16994k getIpv4Bytes() {
                return ((IPInfo) this.instance).getIpv4Bytes();
            }

            public String getIpv6() {
                return ((IPInfo) this.instance).getIpv6();
            }

            public C16994k getIpv6Bytes() {
                return ((IPInfo) this.instance).getIpv6Bytes();
            }

            public int getType() {
                return ((IPInfo) this.instance).getType();
            }

            public boolean hasIpv4() {
                return ((IPInfo) this.instance).hasIpv4();
            }

            public boolean hasIpv6() {
                return ((IPInfo) this.instance).hasIpv6();
            }

            public boolean hasType() {
                return ((IPInfo) this.instance).hasType();
            }

            public Builder setIpv4(String str) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv4(str);
                return this;
            }

            public Builder setIpv4Bytes(C16994k kVar) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv4Bytes(kVar);
                return this;
            }

            public Builder setIpv6(String str) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv6(str);
                return this;
            }

            public Builder setIpv6Bytes(C16994k kVar) {
                copyOnWrite();
                ((IPInfo) this.instance).setIpv6Bytes(kVar);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((IPInfo) this.instance).setType(i);
                return this;
            }

            private Builder() {
                super(IPInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IPInfo iPInfo = new IPInfo();
            DEFAULT_INSTANCE = iPInfo;
            C23861l0.registerDefaultInstance(IPInfo.class, iPInfo);
        }

        private IPInfo() {
        }

        /* access modifiers changed from: private */
        public void clearIpv4() {
            this.bitField0_ &= -3;
            this.ipv4_ = getDefaultInstance().getIpv4();
        }

        /* access modifiers changed from: private */
        public void clearIpv6() {
            this.bitField0_ &= -5;
            this.ipv6_ = getDefaultInstance().getIpv6();
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        public static IPInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IPInfo parseDelimitedFrom(InputStream inputStream) {
            return (IPInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IPInfo parseFrom(ByteBuffer byteBuffer) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IPInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIpv4(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.ipv4_ = str;
        }

        /* access modifiers changed from: private */
        public void setIpv4Bytes(C16994k kVar) {
            this.ipv4_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setIpv6(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.ipv6_ = str;
        }

        /* access modifiers changed from: private */
        public void setIpv6Bytes(C16994k kVar) {
            this.ipv6_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "type_", "ipv4_", "ipv6_"});
                case 3:
                    return new IPInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IPInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IPInfo.class) {
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

        public String getIpv4() {
            return this.ipv4_;
        }

        public C16994k getIpv4Bytes() {
            return C16994k.m16791k(this.ipv4_);
        }

        public String getIpv6() {
            return this.ipv6_;
        }

        public C16994k getIpv6Bytes() {
            return C16994k.m16791k(this.ipv6_);
        }

        public int getType() {
            return this.type_;
        }

        public boolean hasIpv4() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIpv6() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IPInfo iPInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(iPInfo);
        }

        public static IPInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IPInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IPInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IPInfo parseFrom(C16994k kVar) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IPInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IPInfo parseFrom(byte[] bArr) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IPInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IPInfo parseFrom(InputStream inputStream) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IPInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IPInfo parseFrom(C23856l lVar) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IPInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IPInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IPInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIpv4();

        C16994k getIpv4Bytes();

        String getIpv6();

        C16994k getIpv6Bytes();

        int getType();

        boolean hasIpv4();

        boolean hasIpv6();

        boolean hasType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkAddMsgCmd extends C23861l0<IlinkAddMsgCmd, Builder> implements IlinkAddMsgCmdOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 6;
        public static final int CREATETIME_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final IlinkAddMsgCmd DEFAULT_INSTANCE;
        public static final int FROMUSERNAME_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MSGTYPE_FIELD_NUMBER = 5;
        private static volatile C24062w1<IlinkAddMsgCmd> PARSER = null;
        public static final int PUSHCONTENT_FIELD_NUMBER = 7;
        public static final int ROOMNAME_FIELD_NUMBER = 4;
        public static final int SEQ_FIELD_NUMBER = 8;
        public static final int STATUS_FIELD_NUMBER = 10;
        public static final int TOUSERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private String content_ = "";
        private long createTime_;
        private String fromUsername_ = "";
        private long id_;
        private int msgType_;
        private String pushContent_ = "";
        private String roomName_ = "";
        private long seq_;
        private long status_;
        private String toUsername_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkAddMsgCmd, Builder> implements IlinkAddMsgCmdOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearContent();
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearCreateTime();
                return this;
            }

            public Builder clearFromUsername() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearFromUsername();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearMsgType();
                return this;
            }

            public Builder clearPushContent() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearPushContent();
                return this;
            }

            public Builder clearRoomName() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearRoomName();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearSeq();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearStatus();
                return this;
            }

            public Builder clearToUsername() {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).clearToUsername();
                return this;
            }

            public String getContent() {
                return ((IlinkAddMsgCmd) this.instance).getContent();
            }

            public C16994k getContentBytes() {
                return ((IlinkAddMsgCmd) this.instance).getContentBytes();
            }

            public long getCreateTime() {
                return ((IlinkAddMsgCmd) this.instance).getCreateTime();
            }

            public String getFromUsername() {
                return ((IlinkAddMsgCmd) this.instance).getFromUsername();
            }

            public C16994k getFromUsernameBytes() {
                return ((IlinkAddMsgCmd) this.instance).getFromUsernameBytes();
            }

            public long getId() {
                return ((IlinkAddMsgCmd) this.instance).getId();
            }

            public int getMsgType() {
                return ((IlinkAddMsgCmd) this.instance).getMsgType();
            }

            public String getPushContent() {
                return ((IlinkAddMsgCmd) this.instance).getPushContent();
            }

            public C16994k getPushContentBytes() {
                return ((IlinkAddMsgCmd) this.instance).getPushContentBytes();
            }

            public String getRoomName() {
                return ((IlinkAddMsgCmd) this.instance).getRoomName();
            }

            public C16994k getRoomNameBytes() {
                return ((IlinkAddMsgCmd) this.instance).getRoomNameBytes();
            }

            public long getSeq() {
                return ((IlinkAddMsgCmd) this.instance).getSeq();
            }

            public long getStatus() {
                return ((IlinkAddMsgCmd) this.instance).getStatus();
            }

            public String getToUsername() {
                return ((IlinkAddMsgCmd) this.instance).getToUsername();
            }

            public C16994k getToUsernameBytes() {
                return ((IlinkAddMsgCmd) this.instance).getToUsernameBytes();
            }

            public boolean hasContent() {
                return ((IlinkAddMsgCmd) this.instance).hasContent();
            }

            public boolean hasCreateTime() {
                return ((IlinkAddMsgCmd) this.instance).hasCreateTime();
            }

            public boolean hasFromUsername() {
                return ((IlinkAddMsgCmd) this.instance).hasFromUsername();
            }

            public boolean hasId() {
                return ((IlinkAddMsgCmd) this.instance).hasId();
            }

            public boolean hasMsgType() {
                return ((IlinkAddMsgCmd) this.instance).hasMsgType();
            }

            public boolean hasPushContent() {
                return ((IlinkAddMsgCmd) this.instance).hasPushContent();
            }

            public boolean hasRoomName() {
                return ((IlinkAddMsgCmd) this.instance).hasRoomName();
            }

            public boolean hasSeq() {
                return ((IlinkAddMsgCmd) this.instance).hasSeq();
            }

            public boolean hasStatus() {
                return ((IlinkAddMsgCmd) this.instance).hasStatus();
            }

            public boolean hasToUsername() {
                return ((IlinkAddMsgCmd) this.instance).hasToUsername();
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setContentBytes(kVar);
                return this;
            }

            public Builder setCreateTime(long j) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setCreateTime(j);
                return this;
            }

            public Builder setFromUsername(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setFromUsername(str);
                return this;
            }

            public Builder setFromUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setFromUsernameBytes(kVar);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setId(j);
                return this;
            }

            public Builder setMsgType(int i) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setMsgType(i);
                return this;
            }

            public Builder setPushContent(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setPushContent(str);
                return this;
            }

            public Builder setPushContentBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setPushContentBytes(kVar);
                return this;
            }

            public Builder setRoomName(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setRoomName(str);
                return this;
            }

            public Builder setRoomNameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setRoomNameBytes(kVar);
                return this;
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setSeq(j);
                return this;
            }

            public Builder setStatus(long j) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setStatus(j);
                return this;
            }

            public Builder setToUsername(String str) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setToUsername(str);
                return this;
            }

            public Builder setToUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAddMsgCmd) this.instance).setToUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkAddMsgCmd.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAddMsgCmd ilinkAddMsgCmd = new IlinkAddMsgCmd();
            DEFAULT_INSTANCE = ilinkAddMsgCmd;
            C23861l0.registerDefaultInstance(IlinkAddMsgCmd.class, ilinkAddMsgCmd);
        }

        private IlinkAddMsgCmd() {
        }

        /* access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -33;
            this.content_ = getDefaultInstance().getContent();
        }

        /* access modifiers changed from: private */
        public void clearCreateTime() {
            this.bitField0_ &= -257;
            this.createTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFromUsername() {
            this.bitField0_ &= -3;
            this.fromUsername_ = getDefaultInstance().getFromUsername();
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgType() {
            this.bitField0_ &= -17;
            this.msgType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPushContent() {
            this.bitField0_ &= -65;
            this.pushContent_ = getDefaultInstance().getPushContent();
        }

        /* access modifiers changed from: private */
        public void clearRoomName() {
            this.bitField0_ &= -9;
            this.roomName_ = getDefaultInstance().getRoomName();
        }

        /* access modifiers changed from: private */
        public void clearSeq() {
            this.bitField0_ &= -129;
            this.seq_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStatus() {
            this.bitField0_ &= -513;
            this.status_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToUsername() {
            this.bitField0_ &= -5;
            this.toUsername_ = getDefaultInstance().getToUsername();
        }

        public static IlinkAddMsgCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAddMsgCmd parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAddMsgCmd) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAddMsgCmd parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAddMsgCmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.content_ = str;
        }

        /* access modifiers changed from: private */
        public void setContentBytes(C16994k kVar) {
            this.content_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setCreateTime(long j) {
            this.bitField0_ |= 256;
            this.createTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setFromUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.fromUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromUsernameBytes(C16994k kVar) {
            this.fromUsername_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setId(long j) {
            this.bitField0_ |= 1;
            this.id_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgType(int i) {
            this.bitField0_ |= 16;
            this.msgType_ = i;
        }

        /* access modifiers changed from: private */
        public void setPushContent(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.pushContent_ = str;
        }

        /* access modifiers changed from: private */
        public void setPushContentBytes(C16994k kVar) {
            this.pushContent_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setRoomName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.roomName_ = str;
        }

        /* access modifiers changed from: private */
        public void setRoomNameBytes(C16994k kVar) {
            this.roomName_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setSeq(long j) {
            this.bitField0_ |= 128;
            this.seq_ = j;
        }

        /* access modifiers changed from: private */
        public void setStatus(long j) {
            this.bitField0_ |= 512;
            this.status_ = j;
        }

        /* access modifiers changed from: private */
        public void setToUsername(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.toUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setToUsernameBytes(C16994k kVar) {
            this.toUsername_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဃ\u0007\tဃ\b\nဃ\t", new Object[]{"bitField0_", "id_", "fromUsername_", "toUsername_", "roomName_", "msgType_", "content_", "pushContent_", "seq_", "createTime_", "status_"});
                case 3:
                    return new IlinkAddMsgCmd();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAddMsgCmd> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAddMsgCmd.class) {
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

        public String getContent() {
            return this.content_;
        }

        public C16994k getContentBytes() {
            return C16994k.m16791k(this.content_);
        }

        public long getCreateTime() {
            return this.createTime_;
        }

        public String getFromUsername() {
            return this.fromUsername_;
        }

        public C16994k getFromUsernameBytes() {
            return C16994k.m16791k(this.fromUsername_);
        }

        public long getId() {
            return this.id_;
        }

        public int getMsgType() {
            return this.msgType_;
        }

        public String getPushContent() {
            return this.pushContent_;
        }

        public C16994k getPushContentBytes() {
            return C16994k.m16791k(this.pushContent_);
        }

        public String getRoomName() {
            return this.roomName_;
        }

        public C16994k getRoomNameBytes() {
            return C16994k.m16791k(this.roomName_);
        }

        public long getSeq() {
            return this.seq_;
        }

        public long getStatus() {
            return this.status_;
        }

        public String getToUsername() {
            return this.toUsername_;
        }

        public C16994k getToUsernameBytes() {
            return C16994k.m16791k(this.toUsername_);
        }

        public boolean hasContent() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCreateTime() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasFromUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMsgType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPushContent() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRoomName() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSeq() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasStatus() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasToUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkAddMsgCmd ilinkAddMsgCmd) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAddMsgCmd);
        }

        public static IlinkAddMsgCmd parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAddMsgCmd) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(C16994k kVar) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAddMsgCmd parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(byte[] bArr) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAddMsgCmd parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(InputStream inputStream) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAddMsgCmd parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAddMsgCmd parseFrom(C23856l lVar) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAddMsgCmd parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAddMsgCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAddMsgCmdOrBuilder extends C23848k1 {
        String getContent();

        C16994k getContentBytes();

        long getCreateTime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFromUsername();

        C16994k getFromUsernameBytes();

        long getId();

        int getMsgType();

        String getPushContent();

        C16994k getPushContentBytes();

        String getRoomName();

        C16994k getRoomNameBytes();

        long getSeq();

        long getStatus();

        String getToUsername();

        C16994k getToUsernameBytes();

        boolean hasContent();

        boolean hasCreateTime();

        boolean hasFromUsername();

        boolean hasId();

        boolean hasMsgType();

        boolean hasPushContent();

        boolean hasRoomName();

        boolean hasSeq();

        boolean hasStatus();

        boolean hasToUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkAppAuthClientInfo extends C23861l0<IlinkAppAuthClientInfo, Builder> implements IlinkAppAuthClientInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkAppAuthClientInfo DEFAULT_INSTANCE;
        public static final int HOST_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkAppAuthClientInfo> PARSER;
        private C23908o0.C23919j<HostInfo> hostList_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<IlinkAppAuthClientInfo, Builder> implements IlinkAppAuthClientInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder addAllHostList(Iterable<? extends HostInfo> iterable) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addAllHostList(iterable);
                return this;
            }

            public Builder addHostList(HostInfo hostInfo) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(hostInfo);
                return this;
            }

            public Builder clearHostList() {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).clearHostList();
                return this;
            }

            public HostInfo getHostList(int i) {
                return ((IlinkAppAuthClientInfo) this.instance).getHostList(i);
            }

            public int getHostListCount() {
                return ((IlinkAppAuthClientInfo) this.instance).getHostListCount();
            }

            public List<HostInfo> getHostListList() {
                return Collections.unmodifiableList(((IlinkAppAuthClientInfo) this.instance).getHostListList());
            }

            public Builder removeHostList(int i) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).removeHostList(i);
                return this;
            }

            public Builder setHostList(int i, HostInfo hostInfo) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).setHostList(i, hostInfo);
                return this;
            }

            private Builder() {
                super(IlinkAppAuthClientInfo.DEFAULT_INSTANCE);
            }

            public Builder addHostList(int i, HostInfo hostInfo) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(i, hostInfo);
                return this;
            }

            public Builder setHostList(int i, HostInfo.Builder builder) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).setHostList(i, (HostInfo) builder.build());
                return this;
            }

            public Builder addHostList(HostInfo.Builder builder) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList((HostInfo) builder.build());
                return this;
            }

            public Builder addHostList(int i, HostInfo.Builder builder) {
                copyOnWrite();
                ((IlinkAppAuthClientInfo) this.instance).addHostList(i, (HostInfo) builder.build());
                return this;
            }
        }

        static {
            IlinkAppAuthClientInfo ilinkAppAuthClientInfo = new IlinkAppAuthClientInfo();
            DEFAULT_INSTANCE = ilinkAppAuthClientInfo;
            C23861l0.registerDefaultInstance(IlinkAppAuthClientInfo.class, ilinkAppAuthClientInfo);
        }

        private IlinkAppAuthClientInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllHostList(Iterable<? extends HostInfo> iterable) {
            ensureHostListIsMutable();
            C23810b.addAll(iterable, this.hostList_);
        }

        /* access modifiers changed from: private */
        public void addHostList(HostInfo hostInfo) {
            hostInfo.getClass();
            ensureHostListIsMutable();
            this.hostList_.add(hostInfo);
        }

        /* access modifiers changed from: private */
        public void clearHostList() {
            this.hostList_ = C23861l0.emptyProtobufList();
        }

        private void ensureHostListIsMutable() {
            C23908o0.C23919j<HostInfo> jVar = this.hostList_;
            if (!jVar.mo37523Q()) {
                this.hostList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static IlinkAppAuthClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppAuthClientInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppAuthClientInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppAuthClientInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAppAuthClientInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeHostList(int i) {
            ensureHostListIsMutable();
            this.hostList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setHostList(int i, HostInfo hostInfo) {
            hostInfo.getClass();
            ensureHostListIsMutable();
            this.hostList_.set(i, hostInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hostList_", HostInfo.class});
                case 3:
                    return new IlinkAppAuthClientInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAppAuthClientInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppAuthClientInfo.class) {
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

        public HostInfo getHostList(int i) {
            return this.hostList_.get(i);
        }

        public int getHostListCount() {
            return this.hostList_.size();
        }

        public List<HostInfo> getHostListList() {
            return this.hostList_;
        }

        public HostInfoOrBuilder getHostListOrBuilder(int i) {
            return this.hostList_.get(i);
        }

        public List<? extends HostInfoOrBuilder> getHostListOrBuilderList() {
            return this.hostList_;
        }

        public static Builder newBuilder(IlinkAppAuthClientInfo ilinkAppAuthClientInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAppAuthClientInfo);
        }

        public static IlinkAppAuthClientInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppAuthClientInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(C16994k kVar) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addHostList(int i, HostInfo hostInfo) {
            hostInfo.getClass();
            ensureHostListIsMutable();
            this.hostList_.add(i, hostInfo);
        }

        public static IlinkAppAuthClientInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(byte[] bArr) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppAuthClientInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(InputStream inputStream) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppAuthClientInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppAuthClientInfo parseFrom(C23856l lVar) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppAuthClientInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAppAuthClientInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAppAuthClientInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        HostInfo getHostList(int i);

        int getHostListCount();

        List<HostInfo> getHostListList();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkAppAuthFlag implements C23908o0.C23911c {
        kIlinkAppNoSessionEncrypt(1);
        
        private static final C23908o0.C23912d<IlinkAppAuthFlag> internalValueMap = null;
        public static final int kIlinkAppNoSessionEncrypt_VALUE = 1;
        private final int value;

        public static final class IlinkAppAuthFlagVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkAppAuthFlagVerifier();
            }

            private IlinkAppAuthFlagVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkAppAuthFlag.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkAppAuthFlag>() {
                public IlinkAppAuthFlag findValueByNumber(int i) {
                    return IlinkAppAuthFlag.forNumber(i);
                }
            };
        }

        private IlinkAppAuthFlag(int i) {
            this.value = i;
        }

        public static IlinkAppAuthFlag forNumber(int i) {
            if (i != 1) {
                return null;
            }
            return kIlinkAppNoSessionEncrypt;
        }

        public static C23908o0.C23912d<IlinkAppAuthFlag> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkAppAuthFlagVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkAppAuthFlag valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkAppCommSessionInfo extends C23861l0<IlinkAppCommSessionInfo, Builder> implements IlinkAppCommSessionInfoOrBuilder {
        public static final int AUTH_FLAG_FIELD_NUMBER = 6;
        public static final int AUTOAUTH_ENC_KEY_FIELD_NUMBER = 3;
        public static final int CLIENT_SESSION_KEY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkAppCommSessionInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkAppCommSessionInfo> PARSER = null;
        public static final int SERVERID_FIELD_NUMBER = 5;
        public static final int SERVER_SESSION_KEY_FIELD_NUMBER = 2;
        public static final int UIN_FIELD_NUMBER = 4;
        private int authFlag_ = 1;
        private C16994k autoauthEncKey_;
        private int bitField0_;
        private C16994k clientSessionKey_;
        private C16994k serverSessionKey_;
        private C16994k serverid_;
        private long uin_;

        public static final class Builder extends C23861l0.C23862a<IlinkAppCommSessionInfo, Builder> implements IlinkAppCommSessionInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAuthFlag() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearAuthFlag();
                return this;
            }

            public Builder clearAutoauthEncKey() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearAutoauthEncKey();
                return this;
            }

            public Builder clearClientSessionKey() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearClientSessionKey();
                return this;
            }

            public Builder clearServerSessionKey() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearServerSessionKey();
                return this;
            }

            public Builder clearServerid() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearServerid();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).clearUin();
                return this;
            }

            public IlinkAppAuthFlag getAuthFlag() {
                return ((IlinkAppCommSessionInfo) this.instance).getAuthFlag();
            }

            public C16994k getAutoauthEncKey() {
                return ((IlinkAppCommSessionInfo) this.instance).getAutoauthEncKey();
            }

            public C16994k getClientSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).getClientSessionKey();
            }

            public C16994k getServerSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).getServerSessionKey();
            }

            public C16994k getServerid() {
                return ((IlinkAppCommSessionInfo) this.instance).getServerid();
            }

            public long getUin() {
                return ((IlinkAppCommSessionInfo) this.instance).getUin();
            }

            public boolean hasAuthFlag() {
                return ((IlinkAppCommSessionInfo) this.instance).hasAuthFlag();
            }

            public boolean hasAutoauthEncKey() {
                return ((IlinkAppCommSessionInfo) this.instance).hasAutoauthEncKey();
            }

            public boolean hasClientSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).hasClientSessionKey();
            }

            public boolean hasServerSessionKey() {
                return ((IlinkAppCommSessionInfo) this.instance).hasServerSessionKey();
            }

            public boolean hasServerid() {
                return ((IlinkAppCommSessionInfo) this.instance).hasServerid();
            }

            public boolean hasUin() {
                return ((IlinkAppCommSessionInfo) this.instance).hasUin();
            }

            public Builder setAuthFlag(IlinkAppAuthFlag ilinkAppAuthFlag) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setAuthFlag(ilinkAppAuthFlag);
                return this;
            }

            public Builder setAutoauthEncKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setAutoauthEncKey(kVar);
                return this;
            }

            public Builder setClientSessionKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setClientSessionKey(kVar);
                return this;
            }

            public Builder setServerSessionKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setServerSessionKey(kVar);
                return this;
            }

            public Builder setServerid(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setServerid(kVar);
                return this;
            }

            public Builder setUin(long j) {
                copyOnWrite();
                ((IlinkAppCommSessionInfo) this.instance).setUin(j);
                return this;
            }

            private Builder() {
                super(IlinkAppCommSessionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppCommSessionInfo ilinkAppCommSessionInfo = new IlinkAppCommSessionInfo();
            DEFAULT_INSTANCE = ilinkAppCommSessionInfo;
            C23861l0.registerDefaultInstance(IlinkAppCommSessionInfo.class, ilinkAppCommSessionInfo);
        }

        private IlinkAppCommSessionInfo() {
            C16994k kVar = C16994k.f46000e;
            this.clientSessionKey_ = kVar;
            this.serverSessionKey_ = kVar;
            this.autoauthEncKey_ = kVar;
            this.serverid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearAuthFlag() {
            this.bitField0_ &= -33;
            this.authFlag_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearAutoauthEncKey() {
            this.bitField0_ &= -5;
            this.autoauthEncKey_ = getDefaultInstance().getAutoauthEncKey();
        }

        /* access modifiers changed from: private */
        public void clearClientSessionKey() {
            this.bitField0_ &= -2;
            this.clientSessionKey_ = getDefaultInstance().getClientSessionKey();
        }

        /* access modifiers changed from: private */
        public void clearServerSessionKey() {
            this.bitField0_ &= -3;
            this.serverSessionKey_ = getDefaultInstance().getServerSessionKey();
        }

        /* access modifiers changed from: private */
        public void clearServerid() {
            this.bitField0_ &= -17;
            this.serverid_ = getDefaultInstance().getServerid();
        }

        /* access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -9;
            this.uin_ = 0;
        }

        public static IlinkAppCommSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppCommSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppCommSessionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppCommSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAppCommSessionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAuthFlag(IlinkAppAuthFlag ilinkAppAuthFlag) {
            this.authFlag_ = ilinkAppAuthFlag.getNumber();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setAutoauthEncKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.autoauthEncKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setClientSessionKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.clientSessionKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setServerSessionKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.serverSessionKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setServerid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.serverid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setUin(long j) {
            this.bitField0_ |= 8;
            this.uin_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ဃ\u0003\u0005ည\u0004\u0006ဌ\u0005", new Object[]{"bitField0_", "clientSessionKey_", "serverSessionKey_", "autoauthEncKey_", "uin_", "serverid_", "authFlag_", IlinkAppAuthFlag.internalGetVerifier()});
                case 3:
                    return new IlinkAppCommSessionInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAppCommSessionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppCommSessionInfo.class) {
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

        public IlinkAppAuthFlag getAuthFlag() {
            IlinkAppAuthFlag forNumber = IlinkAppAuthFlag.forNumber(this.authFlag_);
            return forNumber == null ? IlinkAppAuthFlag.kIlinkAppNoSessionEncrypt : forNumber;
        }

        public C16994k getAutoauthEncKey() {
            return this.autoauthEncKey_;
        }

        public C16994k getClientSessionKey() {
            return this.clientSessionKey_;
        }

        public C16994k getServerSessionKey() {
            return this.serverSessionKey_;
        }

        public C16994k getServerid() {
            return this.serverid_;
        }

        public long getUin() {
            return this.uin_;
        }

        public boolean hasAuthFlag() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasAutoauthEncKey() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientSessionKey() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasServerSessionKey() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasServerid() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUin() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkAppCommSessionInfo ilinkAppCommSessionInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAppCommSessionInfo);
        }

        public static IlinkAppCommSessionInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppCommSessionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(C16994k kVar) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppCommSessionInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(byte[] bArr) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppCommSessionInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(InputStream inputStream) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppCommSessionInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppCommSessionInfo parseFrom(C23856l lVar) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppCommSessionInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAppCommSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAppCommSessionInfoOrBuilder extends C23848k1 {
        IlinkAppAuthFlag getAuthFlag();

        C16994k getAutoauthEncKey();

        C16994k getClientSessionKey();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getServerSessionKey();

        C16994k getServerid();

        long getUin();

        boolean hasAuthFlag();

        boolean hasAutoauthEncKey();

        boolean hasClientSessionKey();

        boolean hasServerSessionKey();

        boolean hasServerid();

        boolean hasUin();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkAppGetSessionInfo extends C23861l0<IlinkAppGetSessionInfo, Builder> implements IlinkAppGetSessionInfoOrBuilder {
        public static final int CLIENT_SESSION_KEY_FIELD_NUMBER = 3;
        public static final int COOKIE_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final IlinkAppGetSessionInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkAppGetSessionInfo> PARSER = null;
        public static final int REAL_UIN_FIELD_NUMBER = 1;
        public static final int SERVERID_FIELD_NUMBER = 5;
        public static final int SERVER_SESSION_KEY_FIELD_NUMBER = 4;
        public static final int SHOW_UIN_FIELD_NUMBER = 2;
        private int bitField0_;
        private C16994k clientSessionKey_;
        private C16994k cookie_;
        private long realUin_;
        private C16994k serverSessionKey_;
        private C16994k serverid_;
        private long showUin_;

        public static final class Builder extends C23861l0.C23862a<IlinkAppGetSessionInfo, Builder> implements IlinkAppGetSessionInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearClientSessionKey() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearClientSessionKey();
                return this;
            }

            public Builder clearCookie() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearCookie();
                return this;
            }

            public Builder clearRealUin() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearRealUin();
                return this;
            }

            public Builder clearServerSessionKey() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearServerSessionKey();
                return this;
            }

            public Builder clearServerid() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearServerid();
                return this;
            }

            public Builder clearShowUin() {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).clearShowUin();
                return this;
            }

            public C16994k getClientSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).getClientSessionKey();
            }

            public C16994k getCookie() {
                return ((IlinkAppGetSessionInfo) this.instance).getCookie();
            }

            public long getRealUin() {
                return ((IlinkAppGetSessionInfo) this.instance).getRealUin();
            }

            public C16994k getServerSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).getServerSessionKey();
            }

            public C16994k getServerid() {
                return ((IlinkAppGetSessionInfo) this.instance).getServerid();
            }

            public long getShowUin() {
                return ((IlinkAppGetSessionInfo) this.instance).getShowUin();
            }

            public boolean hasClientSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).hasClientSessionKey();
            }

            public boolean hasCookie() {
                return ((IlinkAppGetSessionInfo) this.instance).hasCookie();
            }

            public boolean hasRealUin() {
                return ((IlinkAppGetSessionInfo) this.instance).hasRealUin();
            }

            public boolean hasServerSessionKey() {
                return ((IlinkAppGetSessionInfo) this.instance).hasServerSessionKey();
            }

            public boolean hasServerid() {
                return ((IlinkAppGetSessionInfo) this.instance).hasServerid();
            }

            public boolean hasShowUin() {
                return ((IlinkAppGetSessionInfo) this.instance).hasShowUin();
            }

            public Builder setClientSessionKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setClientSessionKey(kVar);
                return this;
            }

            public Builder setCookie(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setCookie(kVar);
                return this;
            }

            public Builder setRealUin(long j) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setRealUin(j);
                return this;
            }

            public Builder setServerSessionKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setServerSessionKey(kVar);
                return this;
            }

            public Builder setServerid(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setServerid(kVar);
                return this;
            }

            public Builder setShowUin(long j) {
                copyOnWrite();
                ((IlinkAppGetSessionInfo) this.instance).setShowUin(j);
                return this;
            }

            private Builder() {
                super(IlinkAppGetSessionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppGetSessionInfo ilinkAppGetSessionInfo = new IlinkAppGetSessionInfo();
            DEFAULT_INSTANCE = ilinkAppGetSessionInfo;
            C23861l0.registerDefaultInstance(IlinkAppGetSessionInfo.class, ilinkAppGetSessionInfo);
        }

        private IlinkAppGetSessionInfo() {
            C16994k kVar = C16994k.f46000e;
            this.clientSessionKey_ = kVar;
            this.serverSessionKey_ = kVar;
            this.serverid_ = kVar;
            this.cookie_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearClientSessionKey() {
            this.bitField0_ &= -5;
            this.clientSessionKey_ = getDefaultInstance().getClientSessionKey();
        }

        /* access modifiers changed from: private */
        public void clearCookie() {
            this.bitField0_ &= -33;
            this.cookie_ = getDefaultInstance().getCookie();
        }

        /* access modifiers changed from: private */
        public void clearRealUin() {
            this.bitField0_ &= -2;
            this.realUin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearServerSessionKey() {
            this.bitField0_ &= -9;
            this.serverSessionKey_ = getDefaultInstance().getServerSessionKey();
        }

        /* access modifiers changed from: private */
        public void clearServerid() {
            this.bitField0_ &= -17;
            this.serverid_ = getDefaultInstance().getServerid();
        }

        /* access modifiers changed from: private */
        public void clearShowUin() {
            this.bitField0_ &= -3;
            this.showUin_ = 0;
        }

        public static IlinkAppGetSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppGetSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppGetSessionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppGetSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAppGetSessionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClientSessionKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.clientSessionKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCookie(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.cookie_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setRealUin(long j) {
            this.bitField0_ |= 1;
            this.realUin_ = j;
        }

        /* access modifiers changed from: private */
        public void setServerSessionKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.serverSessionKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setServerid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.serverid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setShowUin(long j) {
            this.bitField0_ |= 2;
            this.showUin_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ည\u0005", new Object[]{"bitField0_", "realUin_", "showUin_", "clientSessionKey_", "serverSessionKey_", "serverid_", "cookie_"});
                case 3:
                    return new IlinkAppGetSessionInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAppGetSessionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppGetSessionInfo.class) {
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

        public C16994k getClientSessionKey() {
            return this.clientSessionKey_;
        }

        public C16994k getCookie() {
            return this.cookie_;
        }

        public long getRealUin() {
            return this.realUin_;
        }

        public C16994k getServerSessionKey() {
            return this.serverSessionKey_;
        }

        public C16994k getServerid() {
            return this.serverid_;
        }

        public long getShowUin() {
            return this.showUin_;
        }

        public boolean hasClientSessionKey() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCookie() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasRealUin() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasServerSessionKey() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasServerid() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasShowUin() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkAppGetSessionInfo ilinkAppGetSessionInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAppGetSessionInfo);
        }

        public static IlinkAppGetSessionInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppGetSessionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(C16994k kVar) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppGetSessionInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(byte[] bArr) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppGetSessionInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(InputStream inputStream) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppGetSessionInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppGetSessionInfo parseFrom(C23856l lVar) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppGetSessionInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAppGetSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAppGetSessionInfoOrBuilder extends C23848k1 {
        C16994k getClientSessionKey();

        C16994k getCookie();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getRealUin();

        C16994k getServerSessionKey();

        C16994k getServerid();

        long getShowUin();

        boolean hasClientSessionKey();

        boolean hasCookie();

        boolean hasRealUin();

        boolean hasServerSessionKey();

        boolean hasServerid();

        boolean hasShowUin();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkAppLoginInfo extends C23861l0<IlinkAppLoginInfo, Builder> implements IlinkAppLoginInfoOrBuilder {
        public static final int AUTH_CODE_FIELD_NUMBER = 1;
        public static final int CLIENT_INFO_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final IlinkAppLoginInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkAppLoginInfo> PARSER = null;
        public static final int SESSION_MODULE_TYPE_FIELD_NUMBER = 3;
        public static final int SESSION_TYPE_FIELD_NUMBER = 2;
        private C16994k authCode_ = C16994k.f46000e;
        private int bitField0_;
        private String clientInfo_ = "";
        private int sessionModuleType_;
        private int sessionType_;

        public static final class Builder extends C23861l0.C23862a<IlinkAppLoginInfo, Builder> implements IlinkAppLoginInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAuthCode() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearAuthCode();
                return this;
            }

            public Builder clearClientInfo() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearClientInfo();
                return this;
            }

            public Builder clearSessionModuleType() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearSessionModuleType();
                return this;
            }

            public Builder clearSessionType() {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).clearSessionType();
                return this;
            }

            public C16994k getAuthCode() {
                return ((IlinkAppLoginInfo) this.instance).getAuthCode();
            }

            public String getClientInfo() {
                return ((IlinkAppLoginInfo) this.instance).getClientInfo();
            }

            public C16994k getClientInfoBytes() {
                return ((IlinkAppLoginInfo) this.instance).getClientInfoBytes();
            }

            public int getSessionModuleType() {
                return ((IlinkAppLoginInfo) this.instance).getSessionModuleType();
            }

            public int getSessionType() {
                return ((IlinkAppLoginInfo) this.instance).getSessionType();
            }

            public boolean hasAuthCode() {
                return ((IlinkAppLoginInfo) this.instance).hasAuthCode();
            }

            public boolean hasClientInfo() {
                return ((IlinkAppLoginInfo) this.instance).hasClientInfo();
            }

            public boolean hasSessionModuleType() {
                return ((IlinkAppLoginInfo) this.instance).hasSessionModuleType();
            }

            public boolean hasSessionType() {
                return ((IlinkAppLoginInfo) this.instance).hasSessionType();
            }

            public Builder setAuthCode(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setAuthCode(kVar);
                return this;
            }

            public Builder setClientInfo(String str) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setClientInfo(str);
                return this;
            }

            public Builder setClientInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setClientInfoBytes(kVar);
                return this;
            }

            public Builder setSessionModuleType(int i) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setSessionModuleType(i);
                return this;
            }

            public Builder setSessionType(int i) {
                copyOnWrite();
                ((IlinkAppLoginInfo) this.instance).setSessionType(i);
                return this;
            }

            private Builder() {
                super(IlinkAppLoginInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkAppLoginInfo ilinkAppLoginInfo = new IlinkAppLoginInfo();
            DEFAULT_INSTANCE = ilinkAppLoginInfo;
            C23861l0.registerDefaultInstance(IlinkAppLoginInfo.class, ilinkAppLoginInfo);
        }

        private IlinkAppLoginInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAuthCode() {
            this.bitField0_ &= -2;
            this.authCode_ = getDefaultInstance().getAuthCode();
        }

        /* access modifiers changed from: private */
        public void clearClientInfo() {
            this.bitField0_ &= -9;
            this.clientInfo_ = getDefaultInstance().getClientInfo();
        }

        /* access modifiers changed from: private */
        public void clearSessionModuleType() {
            this.bitField0_ &= -5;
            this.sessionModuleType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionType() {
            this.bitField0_ &= -3;
            this.sessionType_ = 0;
        }

        public static IlinkAppLoginInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkAppLoginInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkAppLoginInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppLoginInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkAppLoginInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAuthCode(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.authCode_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setClientInfo(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.clientInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientInfoBytes(C16994k kVar) {
            this.clientInfo_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setSessionModuleType(int i) {
            this.bitField0_ |= 4;
            this.sessionModuleType_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionType(int i) {
            this.bitField0_ |= 2;
            this.sessionType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "authCode_", "sessionType_", "sessionModuleType_", "clientInfo_"});
                case 3:
                    return new IlinkAppLoginInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkAppLoginInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkAppLoginInfo.class) {
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

        public String getClientInfo() {
            return this.clientInfo_;
        }

        public C16994k getClientInfoBytes() {
            return C16994k.m16791k(this.clientInfo_);
        }

        public int getSessionModuleType() {
            return this.sessionModuleType_;
        }

        public int getSessionType() {
            return this.sessionType_;
        }

        public boolean hasAuthCode() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasClientInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSessionModuleType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSessionType() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkAppLoginInfo ilinkAppLoginInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkAppLoginInfo);
        }

        public static IlinkAppLoginInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppLoginInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(C16994k kVar) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkAppLoginInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(byte[] bArr) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkAppLoginInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(InputStream inputStream) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkAppLoginInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkAppLoginInfo parseFrom(C23856l lVar) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkAppLoginInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkAppLoginInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkAppLoginInfoOrBuilder extends C23848k1 {
        C16994k getAuthCode();

        String getClientInfo();

        C16994k getClientInfoBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getSessionModuleType();

        int getSessionType();

        boolean hasAuthCode();

        boolean hasClientInfo();

        boolean hasSessionModuleType();

        boolean hasSessionType();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkAppSessionType implements C23908o0.C23911c {
        kIlinkAppNoneLogin(0),
        kIlinkAppFaceLogin(1),
        kIlinkAppQrcodeLogin(2),
        kIlinkAppImLogin(3),
        kIlinkAppGetSession(4),
        kIlinkApp3rdAppAuth(5),
        kIlinkAppOAuthLogin(6),
        kIlinkAppVisitorLogin(7),
        kIlinkAppCloudLogin(8);
        
        private static final C23908o0.C23912d<IlinkAppSessionType> internalValueMap = null;
        public static final int kIlinkApp3rdAppAuth_VALUE = 5;
        public static final int kIlinkAppCloudLogin_VALUE = 8;
        public static final int kIlinkAppFaceLogin_VALUE = 1;
        public static final int kIlinkAppGetSession_VALUE = 4;
        public static final int kIlinkAppImLogin_VALUE = 3;
        public static final int kIlinkAppNoneLogin_VALUE = 0;
        public static final int kIlinkAppOAuthLogin_VALUE = 6;
        public static final int kIlinkAppQrcodeLogin_VALUE = 2;
        public static final int kIlinkAppVisitorLogin_VALUE = 7;
        private final int value;

        public static final class IlinkAppSessionTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkAppSessionTypeVerifier();
            }

            private IlinkAppSessionTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkAppSessionType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkAppSessionType>() {
                public IlinkAppSessionType findValueByNumber(int i) {
                    return IlinkAppSessionType.forNumber(i);
                }
            };
        }

        private IlinkAppSessionType(int i) {
            this.value = i;
        }

        public static IlinkAppSessionType forNumber(int i) {
            switch (i) {
                case 0:
                    return kIlinkAppNoneLogin;
                case 1:
                    return kIlinkAppFaceLogin;
                case 2:
                    return kIlinkAppQrcodeLogin;
                case 3:
                    return kIlinkAppImLogin;
                case 4:
                    return kIlinkAppGetSession;
                case 5:
                    return kIlinkApp3rdAppAuth;
                case 6:
                    return kIlinkAppOAuthLogin;
                case 7:
                    return kIlinkAppVisitorLogin;
                case 8:
                    return kIlinkAppCloudLogin;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<IlinkAppSessionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkAppSessionTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkAppSessionType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkBypassMsgItem extends C23861l0<IlinkBypassMsgItem, Builder> implements IlinkBypassMsgItemOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 5;
        public static final int CREATETIME_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final IlinkBypassMsgItem DEFAULT_INSTANCE;
        public static final int FROM_USERNAME_FIELD_NUMBER = 2;
        public static final int MSGID_FIELD_NUMBER = 1;
        public static final int MSG_SESSION_ID_FIELD_NUMBER = 8;
        public static final int MSG_TYPE_FIELD_NUMBER = 4;
        private static volatile C24062w1<IlinkBypassMsgItem> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 7;
        public static final int TO_USERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private C16994k content_ = C16994k.f46000e;
        private long createtime_;
        private String fromUsername_ = "";
        private String msgSessionId_ = "";
        private int msgType_;
        private long msgid_;
        private long seq_;
        private String toUsername_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkBypassMsgItem, Builder> implements IlinkBypassMsgItemOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearContent() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearContent();
                return this;
            }

            public Builder clearCreatetime() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearCreatetime();
                return this;
            }

            public Builder clearFromUsername() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearFromUsername();
                return this;
            }

            public Builder clearMsgSessionId() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearMsgSessionId();
                return this;
            }

            public Builder clearMsgType() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearMsgType();
                return this;
            }

            public Builder clearMsgid() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearMsgid();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearSeq();
                return this;
            }

            public Builder clearToUsername() {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).clearToUsername();
                return this;
            }

            public C16994k getContent() {
                return ((IlinkBypassMsgItem) this.instance).getContent();
            }

            public long getCreatetime() {
                return ((IlinkBypassMsgItem) this.instance).getCreatetime();
            }

            public String getFromUsername() {
                return ((IlinkBypassMsgItem) this.instance).getFromUsername();
            }

            public C16994k getFromUsernameBytes() {
                return ((IlinkBypassMsgItem) this.instance).getFromUsernameBytes();
            }

            public String getMsgSessionId() {
                return ((IlinkBypassMsgItem) this.instance).getMsgSessionId();
            }

            public C16994k getMsgSessionIdBytes() {
                return ((IlinkBypassMsgItem) this.instance).getMsgSessionIdBytes();
            }

            public int getMsgType() {
                return ((IlinkBypassMsgItem) this.instance).getMsgType();
            }

            public long getMsgid() {
                return ((IlinkBypassMsgItem) this.instance).getMsgid();
            }

            public long getSeq() {
                return ((IlinkBypassMsgItem) this.instance).getSeq();
            }

            public String getToUsername() {
                return ((IlinkBypassMsgItem) this.instance).getToUsername();
            }

            public C16994k getToUsernameBytes() {
                return ((IlinkBypassMsgItem) this.instance).getToUsernameBytes();
            }

            public boolean hasContent() {
                return ((IlinkBypassMsgItem) this.instance).hasContent();
            }

            public boolean hasCreatetime() {
                return ((IlinkBypassMsgItem) this.instance).hasCreatetime();
            }

            public boolean hasFromUsername() {
                return ((IlinkBypassMsgItem) this.instance).hasFromUsername();
            }

            public boolean hasMsgSessionId() {
                return ((IlinkBypassMsgItem) this.instance).hasMsgSessionId();
            }

            public boolean hasMsgType() {
                return ((IlinkBypassMsgItem) this.instance).hasMsgType();
            }

            public boolean hasMsgid() {
                return ((IlinkBypassMsgItem) this.instance).hasMsgid();
            }

            public boolean hasSeq() {
                return ((IlinkBypassMsgItem) this.instance).hasSeq();
            }

            public boolean hasToUsername() {
                return ((IlinkBypassMsgItem) this.instance).hasToUsername();
            }

            public Builder setContent(C16994k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setContent(kVar);
                return this;
            }

            public Builder setCreatetime(long j) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setCreatetime(j);
                return this;
            }

            public Builder setFromUsername(String str) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setFromUsername(str);
                return this;
            }

            public Builder setFromUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setFromUsernameBytes(kVar);
                return this;
            }

            public Builder setMsgSessionId(String str) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgSessionId(str);
                return this;
            }

            public Builder setMsgSessionIdBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgSessionIdBytes(kVar);
                return this;
            }

            public Builder setMsgType(int i) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgType(i);
                return this;
            }

            public Builder setMsgid(long j) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setMsgid(j);
                return this;
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setSeq(j);
                return this;
            }

            public Builder setToUsername(String str) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setToUsername(str);
                return this;
            }

            public Builder setToUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkBypassMsgItem) this.instance).setToUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkBypassMsgItem.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkBypassMsgItem ilinkBypassMsgItem = new IlinkBypassMsgItem();
            DEFAULT_INSTANCE = ilinkBypassMsgItem;
            C23861l0.registerDefaultInstance(IlinkBypassMsgItem.class, ilinkBypassMsgItem);
        }

        private IlinkBypassMsgItem() {
        }

        /* access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -17;
            this.content_ = getDefaultInstance().getContent();
        }

        /* access modifiers changed from: private */
        public void clearCreatetime() {
            this.bitField0_ &= -33;
            this.createtime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFromUsername() {
            this.bitField0_ &= -3;
            this.fromUsername_ = getDefaultInstance().getFromUsername();
        }

        /* access modifiers changed from: private */
        public void clearMsgSessionId() {
            this.bitField0_ &= -129;
            this.msgSessionId_ = getDefaultInstance().getMsgSessionId();
        }

        /* access modifiers changed from: private */
        public void clearMsgType() {
            this.bitField0_ &= -9;
            this.msgType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgid() {
            this.bitField0_ &= -2;
            this.msgid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSeq() {
            this.bitField0_ &= -65;
            this.seq_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearToUsername() {
            this.bitField0_ &= -5;
            this.toUsername_ = getDefaultInstance().getToUsername();
        }

        public static IlinkBypassMsgItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkBypassMsgItem parseDelimitedFrom(InputStream inputStream) {
            return (IlinkBypassMsgItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgItem parseFrom(ByteBuffer byteBuffer) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkBypassMsgItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setContent(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.content_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCreatetime(long j) {
            this.bitField0_ |= 32;
            this.createtime_ = j;
        }

        /* access modifiers changed from: private */
        public void setFromUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.fromUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromUsernameBytes(C16994k kVar) {
            this.fromUsername_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setMsgSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.msgSessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgSessionIdBytes(C16994k kVar) {
            this.msgSessionId_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setMsgType(int i) {
            this.bitField0_ |= 8;
            this.msgType_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgid(long j) {
            this.bitField0_ |= 1;
            this.msgid_ = j;
        }

        /* access modifiers changed from: private */
        public void setSeq(long j) {
            this.bitField0_ |= 64;
            this.seq_ = j;
        }

        /* access modifiers changed from: private */
        public void setToUsername(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.toUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setToUsernameBytes(C16994k kVar) {
            this.toUsername_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ည\u0004\u0006ဃ\u0005\u0007ဃ\u0006\bဈ\u0007", new Object[]{"bitField0_", "msgid_", "fromUsername_", "toUsername_", "msgType_", "content_", "createtime_", "seq_", "msgSessionId_"});
                case 3:
                    return new IlinkBypassMsgItem();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkBypassMsgItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkBypassMsgItem.class) {
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

        public C16994k getContent() {
            return this.content_;
        }

        public long getCreatetime() {
            return this.createtime_;
        }

        public String getFromUsername() {
            return this.fromUsername_;
        }

        public C16994k getFromUsernameBytes() {
            return C16994k.m16791k(this.fromUsername_);
        }

        public String getMsgSessionId() {
            return this.msgSessionId_;
        }

        public C16994k getMsgSessionIdBytes() {
            return C16994k.m16791k(this.msgSessionId_);
        }

        public int getMsgType() {
            return this.msgType_;
        }

        public long getMsgid() {
            return this.msgid_;
        }

        public long getSeq() {
            return this.seq_;
        }

        public String getToUsername() {
            return this.toUsername_;
        }

        public C16994k getToUsernameBytes() {
            return C16994k.m16791k(this.toUsername_);
        }

        public boolean hasContent() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCreatetime() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFromUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasMsgSessionId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasMsgType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMsgid() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSeq() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasToUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkBypassMsgItem ilinkBypassMsgItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkBypassMsgItem);
        }

        public static IlinkBypassMsgItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkBypassMsgItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(C16994k kVar) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkBypassMsgItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(byte[] bArr) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkBypassMsgItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(InputStream inputStream) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgItem parseFrom(C23856l lVar) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkBypassMsgItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkBypassMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkBypassMsgItemOrBuilder extends C23848k1 {
        C16994k getContent();

        long getCreatetime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFromUsername();

        C16994k getFromUsernameBytes();

        String getMsgSessionId();

        C16994k getMsgSessionIdBytes();

        int getMsgType();

        long getMsgid();

        long getSeq();

        String getToUsername();

        C16994k getToUsernameBytes();

        boolean hasContent();

        boolean hasCreatetime();

        boolean hasFromUsername();

        boolean hasMsgSessionId();

        boolean hasMsgType();

        boolean hasMsgid();

        boolean hasSeq();

        boolean hasToUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkBypassMsgList extends C23861l0<IlinkBypassMsgList, Builder> implements IlinkBypassMsgListOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkBypassMsgList DEFAULT_INSTANCE;
        public static final int MSGITEMS_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkBypassMsgList> PARSER;
        private C23908o0.C23919j<IlinkBypassMsgItem> msgitems_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<IlinkBypassMsgList, Builder> implements IlinkBypassMsgListOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder addAllMsgitems(Iterable<? extends IlinkBypassMsgItem> iterable) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addAllMsgitems(iterable);
                return this;
            }

            public Builder addMsgitems(IlinkBypassMsgItem ilinkBypassMsgItem) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(ilinkBypassMsgItem);
                return this;
            }

            public Builder clearMsgitems() {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).clearMsgitems();
                return this;
            }

            public IlinkBypassMsgItem getMsgitems(int i) {
                return ((IlinkBypassMsgList) this.instance).getMsgitems(i);
            }

            public int getMsgitemsCount() {
                return ((IlinkBypassMsgList) this.instance).getMsgitemsCount();
            }

            public List<IlinkBypassMsgItem> getMsgitemsList() {
                return Collections.unmodifiableList(((IlinkBypassMsgList) this.instance).getMsgitemsList());
            }

            public Builder removeMsgitems(int i) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).removeMsgitems(i);
                return this;
            }

            public Builder setMsgitems(int i, IlinkBypassMsgItem ilinkBypassMsgItem) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).setMsgitems(i, ilinkBypassMsgItem);
                return this;
            }

            private Builder() {
                super(IlinkBypassMsgList.DEFAULT_INSTANCE);
            }

            public Builder addMsgitems(int i, IlinkBypassMsgItem ilinkBypassMsgItem) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(i, ilinkBypassMsgItem);
                return this;
            }

            public Builder setMsgitems(int i, IlinkBypassMsgItem.Builder builder) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).setMsgitems(i, (IlinkBypassMsgItem) builder.build());
                return this;
            }

            public Builder addMsgitems(IlinkBypassMsgItem.Builder builder) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems((IlinkBypassMsgItem) builder.build());
                return this;
            }

            public Builder addMsgitems(int i, IlinkBypassMsgItem.Builder builder) {
                copyOnWrite();
                ((IlinkBypassMsgList) this.instance).addMsgitems(i, (IlinkBypassMsgItem) builder.build());
                return this;
            }
        }

        static {
            IlinkBypassMsgList ilinkBypassMsgList = new IlinkBypassMsgList();
            DEFAULT_INSTANCE = ilinkBypassMsgList;
            C23861l0.registerDefaultInstance(IlinkBypassMsgList.class, ilinkBypassMsgList);
        }

        private IlinkBypassMsgList() {
        }

        /* access modifiers changed from: private */
        public void addAllMsgitems(Iterable<? extends IlinkBypassMsgItem> iterable) {
            ensureMsgitemsIsMutable();
            C23810b.addAll(iterable, this.msgitems_);
        }

        /* access modifiers changed from: private */
        public void addMsgitems(IlinkBypassMsgItem ilinkBypassMsgItem) {
            ilinkBypassMsgItem.getClass();
            ensureMsgitemsIsMutable();
            this.msgitems_.add(ilinkBypassMsgItem);
        }

        /* access modifiers changed from: private */
        public void clearMsgitems() {
            this.msgitems_ = C23861l0.emptyProtobufList();
        }

        private void ensureMsgitemsIsMutable() {
            C23908o0.C23919j<IlinkBypassMsgItem> jVar = this.msgitems_;
            if (!jVar.mo37523Q()) {
                this.msgitems_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static IlinkBypassMsgList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkBypassMsgList parseDelimitedFrom(InputStream inputStream) {
            return (IlinkBypassMsgList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgList parseFrom(ByteBuffer byteBuffer) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkBypassMsgList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMsgitems(int i) {
            ensureMsgitemsIsMutable();
            this.msgitems_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setMsgitems(int i, IlinkBypassMsgItem ilinkBypassMsgItem) {
            ilinkBypassMsgItem.getClass();
            ensureMsgitemsIsMutable();
            this.msgitems_.set(i, ilinkBypassMsgItem);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"msgitems_", IlinkBypassMsgItem.class});
                case 3:
                    return new IlinkBypassMsgList();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkBypassMsgList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkBypassMsgList.class) {
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

        public IlinkBypassMsgItem getMsgitems(int i) {
            return this.msgitems_.get(i);
        }

        public int getMsgitemsCount() {
            return this.msgitems_.size();
        }

        public List<IlinkBypassMsgItem> getMsgitemsList() {
            return this.msgitems_;
        }

        public IlinkBypassMsgItemOrBuilder getMsgitemsOrBuilder(int i) {
            return this.msgitems_.get(i);
        }

        public List<? extends IlinkBypassMsgItemOrBuilder> getMsgitemsOrBuilderList() {
            return this.msgitems_;
        }

        public static Builder newBuilder(IlinkBypassMsgList ilinkBypassMsgList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkBypassMsgList);
        }

        public static IlinkBypassMsgList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkBypassMsgList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(C16994k kVar) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addMsgitems(int i, IlinkBypassMsgItem ilinkBypassMsgItem) {
            ilinkBypassMsgItem.getClass();
            ensureMsgitemsIsMutable();
            this.msgitems_.add(i, ilinkBypassMsgItem);
        }

        public static IlinkBypassMsgList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(byte[] bArr) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkBypassMsgList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(InputStream inputStream) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkBypassMsgList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkBypassMsgList parseFrom(C23856l lVar) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkBypassMsgList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkBypassMsgList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkBypassMsgListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        IlinkBypassMsgItem getMsgitems(int i);

        int getMsgitemsCount();

        List<IlinkBypassMsgItem> getMsgitemsList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkC2CDownload extends C23861l0<IlinkC2CDownload, Builder> implements IlinkC2CDownloadOrBuilder {
        public static final int AESKEY_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final IlinkC2CDownload DEFAULT_INSTANCE;
        public static final int FILEID_FIELD_NUMBER = 7;
        public static final int FILE_PATH_FIELD_NUMBER = 3;
        public static final int FILE_SIZE_FIELD_NUMBER = 4;
        public static final int FILE_TYPE_FIELD_NUMBER = 2;
        public static final int FILE_URL_FIELD_NUMBER = 5;
        private static volatile C24062w1<IlinkC2CDownload> PARSER = null;
        public static final int TASK_IDENT_FIELD_NUMBER = 1;
        private C16994k aeskey_;
        private int bitField0_;
        private String filePath_ = "";
        private long fileSize_;
        private int fileType_;
        private String fileUrl_ = "";
        private C16994k fileid_;
        private String taskIdent_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkC2CDownload, Builder> implements IlinkC2CDownloadOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAeskey() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearAeskey();
                return this;
            }

            public Builder clearFilePath() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFilePath();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileSize();
                return this;
            }

            public Builder clearFileType() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileType();
                return this;
            }

            public Builder clearFileUrl() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileUrl();
                return this;
            }

            public Builder clearFileid() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearFileid();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).clearTaskIdent();
                return this;
            }

            public C16994k getAeskey() {
                return ((IlinkC2CDownload) this.instance).getAeskey();
            }

            public String getFilePath() {
                return ((IlinkC2CDownload) this.instance).getFilePath();
            }

            public C16994k getFilePathBytes() {
                return ((IlinkC2CDownload) this.instance).getFilePathBytes();
            }

            public long getFileSize() {
                return ((IlinkC2CDownload) this.instance).getFileSize();
            }

            public int getFileType() {
                return ((IlinkC2CDownload) this.instance).getFileType();
            }

            public String getFileUrl() {
                return ((IlinkC2CDownload) this.instance).getFileUrl();
            }

            public C16994k getFileUrlBytes() {
                return ((IlinkC2CDownload) this.instance).getFileUrlBytes();
            }

            public C16994k getFileid() {
                return ((IlinkC2CDownload) this.instance).getFileid();
            }

            public String getTaskIdent() {
                return ((IlinkC2CDownload) this.instance).getTaskIdent();
            }

            public C16994k getTaskIdentBytes() {
                return ((IlinkC2CDownload) this.instance).getTaskIdentBytes();
            }

            public boolean hasAeskey() {
                return ((IlinkC2CDownload) this.instance).hasAeskey();
            }

            public boolean hasFilePath() {
                return ((IlinkC2CDownload) this.instance).hasFilePath();
            }

            public boolean hasFileSize() {
                return ((IlinkC2CDownload) this.instance).hasFileSize();
            }

            public boolean hasFileType() {
                return ((IlinkC2CDownload) this.instance).hasFileType();
            }

            public boolean hasFileUrl() {
                return ((IlinkC2CDownload) this.instance).hasFileUrl();
            }

            public boolean hasFileid() {
                return ((IlinkC2CDownload) this.instance).hasFileid();
            }

            public boolean hasTaskIdent() {
                return ((IlinkC2CDownload) this.instance).hasTaskIdent();
            }

            public Builder setAeskey(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setAeskey(kVar);
                return this;
            }

            public Builder setFilePath(String str) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFilePath(str);
                return this;
            }

            public Builder setFilePathBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFilePathBytes(kVar);
                return this;
            }

            public Builder setFileSize(long j) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileSize(j);
                return this;
            }

            public Builder setFileType(int i) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileType(i);
                return this;
            }

            public Builder setFileUrl(String str) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileUrl(str);
                return this;
            }

            public Builder setFileUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileUrlBytes(kVar);
                return this;
            }

            public Builder setFileid(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setFileid(kVar);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CDownload) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CDownload.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CDownload ilinkC2CDownload = new IlinkC2CDownload();
            DEFAULT_INSTANCE = ilinkC2CDownload;
            C23861l0.registerDefaultInstance(IlinkC2CDownload.class, ilinkC2CDownload);
        }

        private IlinkC2CDownload() {
            C16994k kVar = C16994k.f46000e;
            this.aeskey_ = kVar;
            this.fileid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearAeskey() {
            this.bitField0_ &= -33;
            this.aeskey_ = getDefaultInstance().getAeskey();
        }

        /* access modifiers changed from: private */
        public void clearFilePath() {
            this.bitField0_ &= -5;
            this.filePath_ = getDefaultInstance().getFilePath();
        }

        /* access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -9;
            this.fileSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileType() {
            this.bitField0_ &= -3;
            this.fileType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileUrl() {
            this.bitField0_ &= -17;
            this.fileUrl_ = getDefaultInstance().getFileUrl();
        }

        /* access modifiers changed from: private */
        public void clearFileid() {
            this.bitField0_ &= -65;
            this.fileid_ = getDefaultInstance().getFileid();
        }

        /* access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -2;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        public static IlinkC2CDownload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CDownload parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CDownload) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownload parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkC2CDownload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAeskey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.aeskey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setFilePath(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.filePath_ = str;
        }

        /* access modifiers changed from: private */
        public void setFilePathBytes(C16994k kVar) {
            this.filePath_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setFileSize(long j) {
            this.bitField0_ |= 8;
            this.fileSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setFileType(int i) {
            this.bitField0_ |= 2;
            this.fileType_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileUrl(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.fileUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setFileUrlBytes(C16994k kVar) {
            this.fileUrl_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setFileid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 64;
            this.fileid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.taskIdent_ = str;
        }

        /* access modifiers changed from: private */
        public void setTaskIdentBytes(C16994k kVar) {
            this.taskIdent_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"bitField0_", "taskIdent_", "fileType_", "filePath_", "fileSize_", "fileUrl_", "aeskey_", "fileid_"});
                case 3:
                    return new IlinkC2CDownload();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkC2CDownload> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CDownload.class) {
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

        public C16994k getAeskey() {
            return this.aeskey_;
        }

        public String getFilePath() {
            return this.filePath_;
        }

        public C16994k getFilePathBytes() {
            return C16994k.m16791k(this.filePath_);
        }

        public long getFileSize() {
            return this.fileSize_;
        }

        public int getFileType() {
            return this.fileType_;
        }

        public String getFileUrl() {
            return this.fileUrl_;
        }

        public C16994k getFileUrlBytes() {
            return C16994k.m16791k(this.fileUrl_);
        }

        public C16994k getFileid() {
            return this.fileid_;
        }

        public String getTaskIdent() {
            return this.taskIdent_;
        }

        public C16994k getTaskIdentBytes() {
            return C16994k.m16791k(this.taskIdent_);
        }

        public boolean hasAeskey() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFilePath() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFileSize() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFileType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFileUrl() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFileid() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasTaskIdent() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkC2CDownload ilinkC2CDownload) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkC2CDownload);
        }

        public static IlinkC2CDownload parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CDownload) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownload parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CDownload parseFrom(C16994k kVar) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CDownload parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CDownload parseFrom(byte[] bArr) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CDownload parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CDownload parseFrom(InputStream inputStream) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownload parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownload parseFrom(C23856l lVar) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CDownload parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkC2CDownload) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkC2CDownloadOrBuilder extends C23848k1 {
        C16994k getAeskey();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFilePath();

        C16994k getFilePathBytes();

        long getFileSize();

        int getFileType();

        String getFileUrl();

        C16994k getFileUrlBytes();

        C16994k getFileid();

        String getTaskIdent();

        C16994k getTaskIdentBytes();

        boolean hasAeskey();

        boolean hasFilePath();

        boolean hasFileSize();

        boolean hasFileType();

        boolean hasFileUrl();

        boolean hasFileid();

        boolean hasTaskIdent();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkC2CDownloadResult extends C23861l0<IlinkC2CDownloadResult, Builder> implements IlinkC2CDownloadResultOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkC2CDownloadResult DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 7;
        public static final int EN_QUEUETIME_FIELD_NUMBER = 5;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int FILE_SIZE_FIELD_NUMBER = 3;
        private static volatile C24062w1<IlinkC2CDownloadResult> PARSER = null;
        public static final int RECVED_BYTES_FIELD_NUMBER = 4;
        public static final int START_TIME_FIELD_NUMBER = 6;
        public static final int TASK_IDENT_FIELD_NUMBER = 2;
        private int bitField0_;
        private long enQueuetime_;
        private long endTime_;
        private int errorCode_;
        private long fileSize_;
        private long recvedBytes_;
        private long startTime_;
        private String taskIdent_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkC2CDownloadResult, Builder> implements IlinkC2CDownloadResultOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearEnQueuetime() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearEnQueuetime();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearEndTime();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearFileSize();
                return this;
            }

            public Builder clearRecvedBytes() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearRecvedBytes();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearStartTime();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).clearTaskIdent();
                return this;
            }

            public long getEnQueuetime() {
                return ((IlinkC2CDownloadResult) this.instance).getEnQueuetime();
            }

            public long getEndTime() {
                return ((IlinkC2CDownloadResult) this.instance).getEndTime();
            }

            public int getErrorCode() {
                return ((IlinkC2CDownloadResult) this.instance).getErrorCode();
            }

            public long getFileSize() {
                return ((IlinkC2CDownloadResult) this.instance).getFileSize();
            }

            public long getRecvedBytes() {
                return ((IlinkC2CDownloadResult) this.instance).getRecvedBytes();
            }

            public long getStartTime() {
                return ((IlinkC2CDownloadResult) this.instance).getStartTime();
            }

            public String getTaskIdent() {
                return ((IlinkC2CDownloadResult) this.instance).getTaskIdent();
            }

            public C16994k getTaskIdentBytes() {
                return ((IlinkC2CDownloadResult) this.instance).getTaskIdentBytes();
            }

            public boolean hasEnQueuetime() {
                return ((IlinkC2CDownloadResult) this.instance).hasEnQueuetime();
            }

            public boolean hasEndTime() {
                return ((IlinkC2CDownloadResult) this.instance).hasEndTime();
            }

            public boolean hasErrorCode() {
                return ((IlinkC2CDownloadResult) this.instance).hasErrorCode();
            }

            public boolean hasFileSize() {
                return ((IlinkC2CDownloadResult) this.instance).hasFileSize();
            }

            public boolean hasRecvedBytes() {
                return ((IlinkC2CDownloadResult) this.instance).hasRecvedBytes();
            }

            public boolean hasStartTime() {
                return ((IlinkC2CDownloadResult) this.instance).hasStartTime();
            }

            public boolean hasTaskIdent() {
                return ((IlinkC2CDownloadResult) this.instance).hasTaskIdent();
            }

            public Builder setEnQueuetime(long j) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setEnQueuetime(j);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setEndTime(j);
                return this;
            }

            public Builder setErrorCode(int i) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setErrorCode(i);
                return this;
            }

            public Builder setFileSize(long j) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setFileSize(j);
                return this;
            }

            public Builder setRecvedBytes(long j) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setRecvedBytes(j);
                return this;
            }

            public Builder setStartTime(long j) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setStartTime(j);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CDownloadResult) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CDownloadResult.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CDownloadResult ilinkC2CDownloadResult = new IlinkC2CDownloadResult();
            DEFAULT_INSTANCE = ilinkC2CDownloadResult;
            C23861l0.registerDefaultInstance(IlinkC2CDownloadResult.class, ilinkC2CDownloadResult);
        }

        private IlinkC2CDownloadResult() {
        }

        /* access modifiers changed from: private */
        public void clearEnQueuetime() {
            this.bitField0_ &= -17;
            this.enQueuetime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -65;
            this.endTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearErrorCode() {
            this.bitField0_ &= -2;
            this.errorCode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -5;
            this.fileSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRecvedBytes() {
            this.bitField0_ &= -9;
            this.recvedBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -33;
            this.startTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -3;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        public static IlinkC2CDownloadResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CDownloadResult parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CDownloadResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownloadResult parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkC2CDownloadResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEnQueuetime(long j) {
            this.bitField0_ |= 16;
            this.enQueuetime_ = j;
        }

        /* access modifiers changed from: private */
        public void setEndTime(long j) {
            this.bitField0_ |= 64;
            this.endTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.bitField0_ |= 1;
            this.errorCode_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileSize(long j) {
            this.bitField0_ |= 4;
            this.fileSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setRecvedBytes(long j) {
            this.bitField0_ |= 8;
            this.recvedBytes_ = j;
        }

        /* access modifiers changed from: private */
        public void setStartTime(long j) {
            this.bitField0_ |= 32;
            this.startTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.taskIdent_ = str;
        }

        /* access modifiers changed from: private */
        public void setTaskIdentBytes(C16994k kVar) {
            this.taskIdent_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007ဃ\u0006", new Object[]{"bitField0_", "errorCode_", "taskIdent_", "fileSize_", "recvedBytes_", "enQueuetime_", "startTime_", "endTime_"});
                case 3:
                    return new IlinkC2CDownloadResult();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkC2CDownloadResult> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CDownloadResult.class) {
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

        public long getEnQueuetime() {
            return this.enQueuetime_;
        }

        public long getEndTime() {
            return this.endTime_;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public long getFileSize() {
            return this.fileSize_;
        }

        public long getRecvedBytes() {
            return this.recvedBytes_;
        }

        public long getStartTime() {
            return this.startTime_;
        }

        public String getTaskIdent() {
            return this.taskIdent_;
        }

        public C16994k getTaskIdentBytes() {
            return C16994k.m16791k(this.taskIdent_);
        }

        public boolean hasEnQueuetime() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasEndTime() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFileSize() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasRecvedBytes() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasStartTime() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTaskIdent() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkC2CDownloadResult ilinkC2CDownloadResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkC2CDownloadResult);
        }

        public static IlinkC2CDownloadResult parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CDownloadResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(C16994k kVar) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CDownloadResult parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(byte[] bArr) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CDownloadResult parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(InputStream inputStream) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CDownloadResult parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CDownloadResult parseFrom(C23856l lVar) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CDownloadResult parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkC2CDownloadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkC2CDownloadResultOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getEnQueuetime();

        long getEndTime();

        int getErrorCode();

        long getFileSize();

        long getRecvedBytes();

        long getStartTime();

        String getTaskIdent();

        C16994k getTaskIdentBytes();

        boolean hasEnQueuetime();

        boolean hasEndTime();

        boolean hasErrorCode();

        boolean hasFileSize();

        boolean hasRecvedBytes();

        boolean hasStartTime();

        boolean hasTaskIdent();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkC2CUpload extends C23861l0<IlinkC2CUpload, Builder> implements IlinkC2CUploadOrBuilder {
        public static final int APP_TYPE_FIELD_NUMBER = 6;
        public static final int BIZ_SCENE_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final IlinkC2CUpload DEFAULT_INSTANCE;
        public static final int FILE_DATA_FIELD_NUMBER = 9;
        public static final int FILE_PATH_FIELD_NUMBER = 3;
        public static final int FILE_TYPE_FIELD_NUMBER = 2;
        public static final int IS_STORAGE_MODE_FIELD_NUMBER = 7;
        private static volatile C24062w1<IlinkC2CUpload> PARSER = null;
        public static final int SNS_UPLOAD_VERSION_FIELD_NUMBER = 8;
        public static final int TASK_IDENT_FIELD_NUMBER = 1;
        public static final int THUMB_FILEDATA_FIELD_NUMBER = 10;
        public static final int THUMB_FILEPATH_FIELD_NUMBER = 4;
        private int appType_;
        private int bitField0_;
        private int bizScene_;
        private C16994k fileData_;
        private String filePath_ = "";
        private int fileType_;
        private boolean isStorageMode_;
        private int snsUploadVersion_;
        private String taskIdent_ = "";
        private C16994k thumbFiledata_;
        private String thumbFilepath_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkC2CUpload, Builder> implements IlinkC2CUploadOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAppType() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearAppType();
                return this;
            }

            public Builder clearBizScene() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearBizScene();
                return this;
            }

            public Builder clearFileData() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearFileData();
                return this;
            }

            public Builder clearFilePath() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearFilePath();
                return this;
            }

            public Builder clearFileType() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearFileType();
                return this;
            }

            public Builder clearIsStorageMode() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearIsStorageMode();
                return this;
            }

            public Builder clearSnsUploadVersion() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearSnsUploadVersion();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearTaskIdent();
                return this;
            }

            public Builder clearThumbFiledata() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearThumbFiledata();
                return this;
            }

            public Builder clearThumbFilepath() {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).clearThumbFilepath();
                return this;
            }

            public int getAppType() {
                return ((IlinkC2CUpload) this.instance).getAppType();
            }

            public IlinkEBizScene getBizScene() {
                return ((IlinkC2CUpload) this.instance).getBizScene();
            }

            public C16994k getFileData() {
                return ((IlinkC2CUpload) this.instance).getFileData();
            }

            public String getFilePath() {
                return ((IlinkC2CUpload) this.instance).getFilePath();
            }

            public C16994k getFilePathBytes() {
                return ((IlinkC2CUpload) this.instance).getFilePathBytes();
            }

            public int getFileType() {
                return ((IlinkC2CUpload) this.instance).getFileType();
            }

            public boolean getIsStorageMode() {
                return ((IlinkC2CUpload) this.instance).getIsStorageMode();
            }

            public int getSnsUploadVersion() {
                return ((IlinkC2CUpload) this.instance).getSnsUploadVersion();
            }

            public String getTaskIdent() {
                return ((IlinkC2CUpload) this.instance).getTaskIdent();
            }

            public C16994k getTaskIdentBytes() {
                return ((IlinkC2CUpload) this.instance).getTaskIdentBytes();
            }

            public C16994k getThumbFiledata() {
                return ((IlinkC2CUpload) this.instance).getThumbFiledata();
            }

            public String getThumbFilepath() {
                return ((IlinkC2CUpload) this.instance).getThumbFilepath();
            }

            public C16994k getThumbFilepathBytes() {
                return ((IlinkC2CUpload) this.instance).getThumbFilepathBytes();
            }

            public boolean hasAppType() {
                return ((IlinkC2CUpload) this.instance).hasAppType();
            }

            public boolean hasBizScene() {
                return ((IlinkC2CUpload) this.instance).hasBizScene();
            }

            public boolean hasFileData() {
                return ((IlinkC2CUpload) this.instance).hasFileData();
            }

            public boolean hasFilePath() {
                return ((IlinkC2CUpload) this.instance).hasFilePath();
            }

            public boolean hasFileType() {
                return ((IlinkC2CUpload) this.instance).hasFileType();
            }

            public boolean hasIsStorageMode() {
                return ((IlinkC2CUpload) this.instance).hasIsStorageMode();
            }

            public boolean hasSnsUploadVersion() {
                return ((IlinkC2CUpload) this.instance).hasSnsUploadVersion();
            }

            public boolean hasTaskIdent() {
                return ((IlinkC2CUpload) this.instance).hasTaskIdent();
            }

            public boolean hasThumbFiledata() {
                return ((IlinkC2CUpload) this.instance).hasThumbFiledata();
            }

            public boolean hasThumbFilepath() {
                return ((IlinkC2CUpload) this.instance).hasThumbFilepath();
            }

            public Builder setAppType(int i) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setAppType(i);
                return this;
            }

            public Builder setBizScene(IlinkEBizScene ilinkEBizScene) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setBizScene(ilinkEBizScene);
                return this;
            }

            public Builder setFileData(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFileData(kVar);
                return this;
            }

            public Builder setFilePath(String str) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFilePath(str);
                return this;
            }

            public Builder setFilePathBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFilePathBytes(kVar);
                return this;
            }

            public Builder setFileType(int i) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setFileType(i);
                return this;
            }

            public Builder setIsStorageMode(boolean z) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setIsStorageMode(z);
                return this;
            }

            public Builder setSnsUploadVersion(int i) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setSnsUploadVersion(i);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            public Builder setThumbFiledata(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setThumbFiledata(kVar);
                return this;
            }

            public Builder setThumbFilepath(String str) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setThumbFilepath(str);
                return this;
            }

            public Builder setThumbFilepathBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUpload) this.instance).setThumbFilepathBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CUpload.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CUpload ilinkC2CUpload = new IlinkC2CUpload();
            DEFAULT_INSTANCE = ilinkC2CUpload;
            C23861l0.registerDefaultInstance(IlinkC2CUpload.class, ilinkC2CUpload);
        }

        private IlinkC2CUpload() {
            C16994k kVar = C16994k.f46000e;
            this.fileData_ = kVar;
            this.thumbFiledata_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearAppType() {
            this.bitField0_ &= -33;
            this.appType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBizScene() {
            this.bitField0_ &= -17;
            this.bizScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileData() {
            this.bitField0_ &= -257;
            this.fileData_ = getDefaultInstance().getFileData();
        }

        /* access modifiers changed from: private */
        public void clearFilePath() {
            this.bitField0_ &= -5;
            this.filePath_ = getDefaultInstance().getFilePath();
        }

        /* access modifiers changed from: private */
        public void clearFileType() {
            this.bitField0_ &= -3;
            this.fileType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIsStorageMode() {
            this.bitField0_ &= -65;
            this.isStorageMode_ = false;
        }

        /* access modifiers changed from: private */
        public void clearSnsUploadVersion() {
            this.bitField0_ &= -129;
            this.snsUploadVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -2;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        /* access modifiers changed from: private */
        public void clearThumbFiledata() {
            this.bitField0_ &= -513;
            this.thumbFiledata_ = getDefaultInstance().getThumbFiledata();
        }

        /* access modifiers changed from: private */
        public void clearThumbFilepath() {
            this.bitField0_ &= -9;
            this.thumbFilepath_ = getDefaultInstance().getThumbFilepath();
        }

        public static IlinkC2CUpload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CUpload parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CUpload) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUpload parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkC2CUpload> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppType(int i) {
            this.bitField0_ |= 32;
            this.appType_ = i;
        }

        /* access modifiers changed from: private */
        public void setBizScene(IlinkEBizScene ilinkEBizScene) {
            this.bizScene_ = ilinkEBizScene.getNumber();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setFileData(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 256;
            this.fileData_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setFilePath(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.filePath_ = str;
        }

        /* access modifiers changed from: private */
        public void setFilePathBytes(C16994k kVar) {
            this.filePath_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setFileType(int i) {
            this.bitField0_ |= 2;
            this.fileType_ = i;
        }

        /* access modifiers changed from: private */
        public void setIsStorageMode(boolean z) {
            this.bitField0_ |= 64;
            this.isStorageMode_ = z;
        }

        /* access modifiers changed from: private */
        public void setSnsUploadVersion(int i) {
            this.bitField0_ |= 128;
            this.snsUploadVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.taskIdent_ = str;
        }

        /* access modifiers changed from: private */
        public void setTaskIdentBytes(C16994k kVar) {
            this.taskIdent_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setThumbFiledata(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 512;
            this.thumbFiledata_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setThumbFilepath(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.thumbFilepath_ = str;
        }

        /* access modifiers changed from: private */
        public void setThumbFilepathBytes(C16994k kVar) {
            this.thumbFilepath_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဋ\u0005\u0007ဇ\u0006\bဋ\u0007\tည\b\nည\t", new Object[]{"bitField0_", "taskIdent_", "fileType_", "filePath_", "thumbFilepath_", "bizScene_", IlinkEBizScene.internalGetVerifier(), "appType_", "isStorageMode_", "snsUploadVersion_", "fileData_", "thumbFiledata_"});
                case 3:
                    return new IlinkC2CUpload();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkC2CUpload> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CUpload.class) {
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

        public int getAppType() {
            return this.appType_;
        }

        public IlinkEBizScene getBizScene() {
            IlinkEBizScene forNumber = IlinkEBizScene.forNumber(this.bizScene_);
            return forNumber == null ? IlinkEBizScene.kC2CScene : forNumber;
        }

        public C16994k getFileData() {
            return this.fileData_;
        }

        public String getFilePath() {
            return this.filePath_;
        }

        public C16994k getFilePathBytes() {
            return C16994k.m16791k(this.filePath_);
        }

        public int getFileType() {
            return this.fileType_;
        }

        public boolean getIsStorageMode() {
            return this.isStorageMode_;
        }

        public int getSnsUploadVersion() {
            return this.snsUploadVersion_;
        }

        public String getTaskIdent() {
            return this.taskIdent_;
        }

        public C16994k getTaskIdentBytes() {
            return C16994k.m16791k(this.taskIdent_);
        }

        public C16994k getThumbFiledata() {
            return this.thumbFiledata_;
        }

        public String getThumbFilepath() {
            return this.thumbFilepath_;
        }

        public C16994k getThumbFilepathBytes() {
            return C16994k.m16791k(this.thumbFilepath_);
        }

        public boolean hasAppType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasBizScene() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFileData() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasFilePath() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFileType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasIsStorageMode() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasSnsUploadVersion() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasTaskIdent() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasThumbFiledata() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasThumbFilepath() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkC2CUpload ilinkC2CUpload) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkC2CUpload);
        }

        public static IlinkC2CUpload parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CUpload) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUpload parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CUpload parseFrom(C16994k kVar) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CUpload parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CUpload parseFrom(byte[] bArr) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CUpload parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CUpload parseFrom(InputStream inputStream) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUpload parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUpload parseFrom(C23856l lVar) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CUpload parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkC2CUpload) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkC2CUploadOrBuilder extends C23848k1 {
        int getAppType();

        IlinkEBizScene getBizScene();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getFileData();

        String getFilePath();

        C16994k getFilePathBytes();

        int getFileType();

        boolean getIsStorageMode();

        int getSnsUploadVersion();

        String getTaskIdent();

        C16994k getTaskIdentBytes();

        C16994k getThumbFiledata();

        String getThumbFilepath();

        C16994k getThumbFilepathBytes();

        boolean hasAppType();

        boolean hasBizScene();

        boolean hasFileData();

        boolean hasFilePath();

        boolean hasFileType();

        boolean hasIsStorageMode();

        boolean hasSnsUploadVersion();

        boolean hasTaskIdent();

        boolean hasThumbFiledata();

        boolean hasThumbFilepath();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkC2CUploadResult extends C23861l0<IlinkC2CUploadResult, Builder> implements IlinkC2CUploadResultOrBuilder {
        public static final int AESKEY_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final IlinkC2CUploadResult DEFAULT_INSTANCE;
        public static final int ERROR_CODE_FIELD_NUMBER = 1;
        public static final int FILEID_FIELD_NUMBER = 6;
        public static final int FILE_SIZE_FIELD_NUMBER = 3;
        public static final int FILE_URL_FIELD_NUMBER = 4;
        private static volatile C24062w1<IlinkC2CUploadResult> PARSER = null;
        public static final int TASK_IDENT_FIELD_NUMBER = 2;
        public static final int THUMB_URL_FIELD_NUMBER = 5;
        private C16994k aeskey_;
        private int bitField0_;
        private int errorCode_;
        private long fileSize_;
        private String fileUrl_ = "";
        private C16994k fileid_;
        private String taskIdent_ = "";
        private String thumbUrl_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkC2CUploadResult, Builder> implements IlinkC2CUploadResultOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAeskey() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearAeskey();
                return this;
            }

            public Builder clearErrorCode() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearErrorCode();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearFileSize();
                return this;
            }

            public Builder clearFileUrl() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearFileUrl();
                return this;
            }

            public Builder clearFileid() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearFileid();
                return this;
            }

            public Builder clearTaskIdent() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearTaskIdent();
                return this;
            }

            public Builder clearThumbUrl() {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).clearThumbUrl();
                return this;
            }

            public C16994k getAeskey() {
                return ((IlinkC2CUploadResult) this.instance).getAeskey();
            }

            public int getErrorCode() {
                return ((IlinkC2CUploadResult) this.instance).getErrorCode();
            }

            public long getFileSize() {
                return ((IlinkC2CUploadResult) this.instance).getFileSize();
            }

            public String getFileUrl() {
                return ((IlinkC2CUploadResult) this.instance).getFileUrl();
            }

            public C16994k getFileUrlBytes() {
                return ((IlinkC2CUploadResult) this.instance).getFileUrlBytes();
            }

            public C16994k getFileid() {
                return ((IlinkC2CUploadResult) this.instance).getFileid();
            }

            public String getTaskIdent() {
                return ((IlinkC2CUploadResult) this.instance).getTaskIdent();
            }

            public C16994k getTaskIdentBytes() {
                return ((IlinkC2CUploadResult) this.instance).getTaskIdentBytes();
            }

            public String getThumbUrl() {
                return ((IlinkC2CUploadResult) this.instance).getThumbUrl();
            }

            public C16994k getThumbUrlBytes() {
                return ((IlinkC2CUploadResult) this.instance).getThumbUrlBytes();
            }

            public boolean hasAeskey() {
                return ((IlinkC2CUploadResult) this.instance).hasAeskey();
            }

            public boolean hasErrorCode() {
                return ((IlinkC2CUploadResult) this.instance).hasErrorCode();
            }

            public boolean hasFileSize() {
                return ((IlinkC2CUploadResult) this.instance).hasFileSize();
            }

            public boolean hasFileUrl() {
                return ((IlinkC2CUploadResult) this.instance).hasFileUrl();
            }

            public boolean hasFileid() {
                return ((IlinkC2CUploadResult) this.instance).hasFileid();
            }

            public boolean hasTaskIdent() {
                return ((IlinkC2CUploadResult) this.instance).hasTaskIdent();
            }

            public boolean hasThumbUrl() {
                return ((IlinkC2CUploadResult) this.instance).hasThumbUrl();
            }

            public Builder setAeskey(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setAeskey(kVar);
                return this;
            }

            public Builder setErrorCode(int i) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setErrorCode(i);
                return this;
            }

            public Builder setFileSize(long j) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileSize(j);
                return this;
            }

            public Builder setFileUrl(String str) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileUrl(str);
                return this;
            }

            public Builder setFileUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileUrlBytes(kVar);
                return this;
            }

            public Builder setFileid(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setFileid(kVar);
                return this;
            }

            public Builder setTaskIdent(String str) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setTaskIdent(str);
                return this;
            }

            public Builder setTaskIdentBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setTaskIdentBytes(kVar);
                return this;
            }

            public Builder setThumbUrl(String str) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setThumbUrl(str);
                return this;
            }

            public Builder setThumbUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkC2CUploadResult) this.instance).setThumbUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkC2CUploadResult.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkC2CUploadResult ilinkC2CUploadResult = new IlinkC2CUploadResult();
            DEFAULT_INSTANCE = ilinkC2CUploadResult;
            C23861l0.registerDefaultInstance(IlinkC2CUploadResult.class, ilinkC2CUploadResult);
        }

        private IlinkC2CUploadResult() {
            C16994k kVar = C16994k.f46000e;
            this.fileid_ = kVar;
            this.aeskey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearAeskey() {
            this.bitField0_ &= -65;
            this.aeskey_ = getDefaultInstance().getAeskey();
        }

        /* access modifiers changed from: private */
        public void clearErrorCode() {
            this.bitField0_ &= -2;
            this.errorCode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -5;
            this.fileSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileUrl() {
            this.bitField0_ &= -9;
            this.fileUrl_ = getDefaultInstance().getFileUrl();
        }

        /* access modifiers changed from: private */
        public void clearFileid() {
            this.bitField0_ &= -33;
            this.fileid_ = getDefaultInstance().getFileid();
        }

        /* access modifiers changed from: private */
        public void clearTaskIdent() {
            this.bitField0_ &= -3;
            this.taskIdent_ = getDefaultInstance().getTaskIdent();
        }

        /* access modifiers changed from: private */
        public void clearThumbUrl() {
            this.bitField0_ &= -17;
            this.thumbUrl_ = getDefaultInstance().getThumbUrl();
        }

        public static IlinkC2CUploadResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkC2CUploadResult parseDelimitedFrom(InputStream inputStream) {
            return (IlinkC2CUploadResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUploadResult parseFrom(ByteBuffer byteBuffer) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkC2CUploadResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAeskey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 64;
            this.aeskey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setErrorCode(int i) {
            this.bitField0_ |= 1;
            this.errorCode_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileSize(long j) {
            this.bitField0_ |= 4;
            this.fileSize_ = j;
        }

        /* access modifiers changed from: private */
        public void setFileUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.fileUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setFileUrlBytes(C16994k kVar) {
            this.fileUrl_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setFileid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32;
            this.fileid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setTaskIdent(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.taskIdent_ = str;
        }

        /* access modifiers changed from: private */
        public void setTaskIdentBytes(C16994k kVar) {
            this.taskIdent_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setThumbUrl(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.thumbUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setThumbUrlBytes(C16994k kVar) {
            this.thumbUrl_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ည\u0005\u0007ည\u0006", new Object[]{"bitField0_", "errorCode_", "taskIdent_", "fileSize_", "fileUrl_", "thumbUrl_", "fileid_", "aeskey_"});
                case 3:
                    return new IlinkC2CUploadResult();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkC2CUploadResult> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkC2CUploadResult.class) {
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

        public C16994k getAeskey() {
            return this.aeskey_;
        }

        public int getErrorCode() {
            return this.errorCode_;
        }

        public long getFileSize() {
            return this.fileSize_;
        }

        public String getFileUrl() {
            return this.fileUrl_;
        }

        public C16994k getFileUrlBytes() {
            return C16994k.m16791k(this.fileUrl_);
        }

        public C16994k getFileid() {
            return this.fileid_;
        }

        public String getTaskIdent() {
            return this.taskIdent_;
        }

        public C16994k getTaskIdentBytes() {
            return C16994k.m16791k(this.taskIdent_);
        }

        public String getThumbUrl() {
            return this.thumbUrl_;
        }

        public C16994k getThumbUrlBytes() {
            return C16994k.m16791k(this.thumbUrl_);
        }

        public boolean hasAeskey() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasErrorCode() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFileSize() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFileUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFileid() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTaskIdent() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasThumbUrl() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(IlinkC2CUploadResult ilinkC2CUploadResult) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkC2CUploadResult);
        }

        public static IlinkC2CUploadResult parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CUploadResult) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(C16994k kVar) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkC2CUploadResult parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(byte[] bArr) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkC2CUploadResult parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(InputStream inputStream) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkC2CUploadResult parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkC2CUploadResult parseFrom(C23856l lVar) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkC2CUploadResult parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkC2CUploadResult) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkC2CUploadResultOrBuilder extends C23848k1 {
        C16994k getAeskey();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getErrorCode();

        long getFileSize();

        String getFileUrl();

        C16994k getFileUrlBytes();

        C16994k getFileid();

        String getTaskIdent();

        C16994k getTaskIdentBytes();

        String getThumbUrl();

        C16994k getThumbUrlBytes();

        boolean hasAeskey();

        boolean hasErrorCode();

        boolean hasFileSize();

        boolean hasFileUrl();

        boolean hasFileid();

        boolean hasTaskIdent();

        boolean hasThumbUrl();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkCdnFileType implements C23908o0.C23911c {
        kMediaTypeFile(5),
        kMediaTypeAppImageStorage(20304);
        
        private static final C23908o0.C23912d<IlinkCdnFileType> internalValueMap = null;
        public static final int kMediaTypeAppImageStorage_VALUE = 20304;
        public static final int kMediaTypeFile_VALUE = 5;
        private final int value;

        public static final class IlinkCdnFileTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkCdnFileTypeVerifier();
            }

            private IlinkCdnFileTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkCdnFileType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkCdnFileType>() {
                public IlinkCdnFileType findValueByNumber(int i) {
                    return IlinkCdnFileType.forNumber(i);
                }
            };
        }

        private IlinkCdnFileType(int i) {
            this.value = i;
        }

        public static IlinkCdnFileType forNumber(int i) {
            if (i == 5) {
                return kMediaTypeFile;
            }
            if (i != 20304) {
                return null;
            }
            return kMediaTypeAppImageStorage;
        }

        public static C23908o0.C23912d<IlinkCdnFileType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkCdnFileTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkCdnFileType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkCmdItem extends C23861l0<IlinkCmdItem, Builder> implements IlinkCmdItemOrBuilder {
        public static final int CMDBUF_FIELD_NUMBER = 2;
        public static final int CMDID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkCmdItem DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkCmdItem> PARSER;
        private int bitField0_;
        private C16994k cmdbuf_ = C16994k.f46000e;
        private int cmdid_;

        public static final class Builder extends C23861l0.C23862a<IlinkCmdItem, Builder> implements IlinkCmdItemOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearCmdbuf() {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).clearCmdbuf();
                return this;
            }

            public Builder clearCmdid() {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).clearCmdid();
                return this;
            }

            public C16994k getCmdbuf() {
                return ((IlinkCmdItem) this.instance).getCmdbuf();
            }

            public int getCmdid() {
                return ((IlinkCmdItem) this.instance).getCmdid();
            }

            public boolean hasCmdbuf() {
                return ((IlinkCmdItem) this.instance).hasCmdbuf();
            }

            public boolean hasCmdid() {
                return ((IlinkCmdItem) this.instance).hasCmdid();
            }

            public Builder setCmdbuf(C16994k kVar) {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).setCmdbuf(kVar);
                return this;
            }

            public Builder setCmdid(int i) {
                copyOnWrite();
                ((IlinkCmdItem) this.instance).setCmdid(i);
                return this;
            }

            private Builder() {
                super(IlinkCmdItem.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkCmdItem ilinkCmdItem = new IlinkCmdItem();
            DEFAULT_INSTANCE = ilinkCmdItem;
            C23861l0.registerDefaultInstance(IlinkCmdItem.class, ilinkCmdItem);
        }

        private IlinkCmdItem() {
        }

        /* access modifiers changed from: private */
        public void clearCmdbuf() {
            this.bitField0_ &= -3;
            this.cmdbuf_ = getDefaultInstance().getCmdbuf();
        }

        /* access modifiers changed from: private */
        public void clearCmdid() {
            this.bitField0_ &= -2;
            this.cmdid_ = 0;
        }

        public static IlinkCmdItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkCmdItem parseDelimitedFrom(InputStream inputStream) {
            return (IlinkCmdItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCmdItem parseFrom(ByteBuffer byteBuffer) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkCmdItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCmdbuf(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.cmdbuf_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCmdid(int i) {
            this.bitField0_ |= 1;
            this.cmdid_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"bitField0_", "cmdid_", "cmdbuf_"});
                case 3:
                    return new IlinkCmdItem();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkCmdItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkCmdItem.class) {
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

        public C16994k getCmdbuf() {
            return this.cmdbuf_;
        }

        public int getCmdid() {
            return this.cmdid_;
        }

        public boolean hasCmdbuf() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCmdid() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(IlinkCmdItem ilinkCmdItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkCmdItem);
        }

        public static IlinkCmdItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkCmdItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCmdItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkCmdItem parseFrom(C16994k kVar) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkCmdItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkCmdItem parseFrom(byte[] bArr) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkCmdItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkCmdItem parseFrom(InputStream inputStream) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkCmdItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkCmdItem parseFrom(C23856l lVar) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkCmdItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkCmdItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkCmdItemOrBuilder extends C23848k1 {
        C16994k getCmdbuf();

        int getCmdid();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasCmdbuf();

        boolean hasCmdid();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkContentType implements C23908o0.C23911c {
        kIlinkContentTypeDefault(0),
        kIlinkContentTypeProtobuf(1),
        kIlinkContentTypeJson(2);
        
        private static final C23908o0.C23912d<IlinkContentType> internalValueMap = null;
        public static final int kIlinkContentTypeDefault_VALUE = 0;
        public static final int kIlinkContentTypeJson_VALUE = 2;
        public static final int kIlinkContentTypeProtobuf_VALUE = 1;
        private final int value;

        public static final class IlinkContentTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkContentTypeVerifier();
            }

            private IlinkContentTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkContentType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkContentType>() {
                public IlinkContentType findValueByNumber(int i) {
                    return IlinkContentType.forNumber(i);
                }
            };
        }

        private IlinkContentType(int i) {
            this.value = i;
        }

        public static IlinkContentType forNumber(int i) {
            if (i == 0) {
                return kIlinkContentTypeDefault;
            }
            if (i == 1) {
                return kIlinkContentTypeProtobuf;
            }
            if (i != 2) {
                return null;
            }
            return kIlinkContentTypeJson;
        }

        public static C23908o0.C23912d<IlinkContentType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkContentTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkContentType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkCryptoAlgo implements C23908o0.C23911c {
        kIlinkNoCrypto(0),
        kIlinkSession(1),
        kIlinkHybridEcdh(2),
        kIlinkEcdh(3);
        
        private static final C23908o0.C23912d<IlinkCryptoAlgo> internalValueMap = null;
        public static final int kIlinkEcdh_VALUE = 3;
        public static final int kIlinkHybridEcdh_VALUE = 2;
        public static final int kIlinkNoCrypto_VALUE = 0;
        public static final int kIlinkSession_VALUE = 1;
        private final int value;

        public static final class IlinkCryptoAlgoVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkCryptoAlgoVerifier();
            }

            private IlinkCryptoAlgoVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkCryptoAlgo.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkCryptoAlgo>() {
                public IlinkCryptoAlgo findValueByNumber(int i) {
                    return IlinkCryptoAlgo.forNumber(i);
                }
            };
        }

        private IlinkCryptoAlgo(int i) {
            this.value = i;
        }

        public static IlinkCryptoAlgo forNumber(int i) {
            if (i == 0) {
                return kIlinkNoCrypto;
            }
            if (i == 1) {
                return kIlinkSession;
            }
            if (i == 2) {
                return kIlinkHybridEcdh;
            }
            if (i != 3) {
                return null;
            }
            return kIlinkEcdh;
        }

        public static C23908o0.C23912d<IlinkCryptoAlgo> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkCryptoAlgoVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkCryptoAlgo valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkDeviceSessionInfo extends C23861l0<IlinkDeviceSessionInfo, Builder> implements IlinkDeviceSessionInfoOrBuilder {
        public static final int AUTOAUTH_ENC_KEY_FIELD_NUMBER = 3;
        public static final int CLIENT_RANDOM_KEY_FIELD_NUMBER = 1;
        public static final int COOKIE_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final IlinkDeviceSessionInfo DEFAULT_INSTANCE;
        public static final int ILINK_DEVICEID_FIELD_NUMBER = 7;
        public static final int ILINK_PRODUCTID_FIELD_NUMBER = 8;
        private static volatile C24062w1<IlinkDeviceSessionInfo> PARSER = null;
        public static final int SERVERID_FIELD_NUMBER = 4;
        public static final int SERVER_RANDOM_KEY_FIELD_NUMBER = 2;
        public static final int UIN_FIELD_NUMBER = 6;
        private C16994k autoauthEncKey_;
        private int bitField0_;
        private C16994k clientRandomKey_;
        private C16994k cookie_;
        private C16994k ilinkDeviceid_;
        private int ilinkProductid_;
        private C16994k serverRandomKey_;
        private C16994k serverid_;
        private long uin_;

        public static final class Builder extends C23861l0.C23862a<IlinkDeviceSessionInfo, Builder> implements IlinkDeviceSessionInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAutoauthEncKey() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearAutoauthEncKey();
                return this;
            }

            public Builder clearClientRandomKey() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearClientRandomKey();
                return this;
            }

            public Builder clearCookie() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearCookie();
                return this;
            }

            public Builder clearIlinkDeviceid() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearIlinkDeviceid();
                return this;
            }

            public Builder clearIlinkProductid() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearIlinkProductid();
                return this;
            }

            public Builder clearServerRandomKey() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearServerRandomKey();
                return this;
            }

            public Builder clearServerid() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearServerid();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).clearUin();
                return this;
            }

            public C16994k getAutoauthEncKey() {
                return ((IlinkDeviceSessionInfo) this.instance).getAutoauthEncKey();
            }

            public C16994k getClientRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).getClientRandomKey();
            }

            public C16994k getCookie() {
                return ((IlinkDeviceSessionInfo) this.instance).getCookie();
            }

            public C16994k getIlinkDeviceid() {
                return ((IlinkDeviceSessionInfo) this.instance).getIlinkDeviceid();
            }

            public int getIlinkProductid() {
                return ((IlinkDeviceSessionInfo) this.instance).getIlinkProductid();
            }

            public C16994k getServerRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).getServerRandomKey();
            }

            public C16994k getServerid() {
                return ((IlinkDeviceSessionInfo) this.instance).getServerid();
            }

            public long getUin() {
                return ((IlinkDeviceSessionInfo) this.instance).getUin();
            }

            public boolean hasAutoauthEncKey() {
                return ((IlinkDeviceSessionInfo) this.instance).hasAutoauthEncKey();
            }

            public boolean hasClientRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).hasClientRandomKey();
            }

            public boolean hasCookie() {
                return ((IlinkDeviceSessionInfo) this.instance).hasCookie();
            }

            public boolean hasIlinkDeviceid() {
                return ((IlinkDeviceSessionInfo) this.instance).hasIlinkDeviceid();
            }

            public boolean hasIlinkProductid() {
                return ((IlinkDeviceSessionInfo) this.instance).hasIlinkProductid();
            }

            public boolean hasServerRandomKey() {
                return ((IlinkDeviceSessionInfo) this.instance).hasServerRandomKey();
            }

            public boolean hasServerid() {
                return ((IlinkDeviceSessionInfo) this.instance).hasServerid();
            }

            public boolean hasUin() {
                return ((IlinkDeviceSessionInfo) this.instance).hasUin();
            }

            public Builder setAutoauthEncKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setAutoauthEncKey(kVar);
                return this;
            }

            public Builder setClientRandomKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setClientRandomKey(kVar);
                return this;
            }

            public Builder setCookie(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setCookie(kVar);
                return this;
            }

            public Builder setIlinkDeviceid(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setIlinkDeviceid(kVar);
                return this;
            }

            public Builder setIlinkProductid(int i) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setIlinkProductid(i);
                return this;
            }

            public Builder setServerRandomKey(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setServerRandomKey(kVar);
                return this;
            }

            public Builder setServerid(C16994k kVar) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setServerid(kVar);
                return this;
            }

            public Builder setUin(long j) {
                copyOnWrite();
                ((IlinkDeviceSessionInfo) this.instance).setUin(j);
                return this;
            }

            private Builder() {
                super(IlinkDeviceSessionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkDeviceSessionInfo ilinkDeviceSessionInfo = new IlinkDeviceSessionInfo();
            DEFAULT_INSTANCE = ilinkDeviceSessionInfo;
            C23861l0.registerDefaultInstance(IlinkDeviceSessionInfo.class, ilinkDeviceSessionInfo);
        }

        private IlinkDeviceSessionInfo() {
            C16994k kVar = C16994k.f46000e;
            this.clientRandomKey_ = kVar;
            this.serverRandomKey_ = kVar;
            this.autoauthEncKey_ = kVar;
            this.serverid_ = kVar;
            this.cookie_ = kVar;
            this.ilinkDeviceid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearAutoauthEncKey() {
            this.bitField0_ &= -5;
            this.autoauthEncKey_ = getDefaultInstance().getAutoauthEncKey();
        }

        /* access modifiers changed from: private */
        public void clearClientRandomKey() {
            this.bitField0_ &= -2;
            this.clientRandomKey_ = getDefaultInstance().getClientRandomKey();
        }

        /* access modifiers changed from: private */
        public void clearCookie() {
            this.bitField0_ &= -17;
            this.cookie_ = getDefaultInstance().getCookie();
        }

        /* access modifiers changed from: private */
        public void clearIlinkDeviceid() {
            this.bitField0_ &= -65;
            this.ilinkDeviceid_ = getDefaultInstance().getIlinkDeviceid();
        }

        /* access modifiers changed from: private */
        public void clearIlinkProductid() {
            this.bitField0_ &= -129;
            this.ilinkProductid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearServerRandomKey() {
            this.bitField0_ &= -3;
            this.serverRandomKey_ = getDefaultInstance().getServerRandomKey();
        }

        /* access modifiers changed from: private */
        public void clearServerid() {
            this.bitField0_ &= -9;
            this.serverid_ = getDefaultInstance().getServerid();
        }

        /* access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -33;
            this.uin_ = 0;
        }

        public static IlinkDeviceSessionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkDeviceSessionInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkDeviceSessionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceSessionInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkDeviceSessionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAutoauthEncKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.autoauthEncKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setClientRandomKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.clientRandomKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCookie(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.cookie_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setIlinkDeviceid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 64;
            this.ilinkDeviceid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setIlinkProductid(int i) {
            this.bitField0_ |= 128;
            this.ilinkProductid_ = i;
        }

        /* access modifiers changed from: private */
        public void setServerRandomKey(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 2;
            this.serverRandomKey_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setServerid(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.serverid_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setUin(long j) {
            this.bitField0_ |= 32;
            this.uin_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003\u0005ည\u0004\u0006ဃ\u0005\u0007ည\u0006\bဋ\u0007", new Object[]{"bitField0_", "clientRandomKey_", "serverRandomKey_", "autoauthEncKey_", "serverid_", "cookie_", "uin_", "ilinkDeviceid_", "ilinkProductid_"});
                case 3:
                    return new IlinkDeviceSessionInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkDeviceSessionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkDeviceSessionInfo.class) {
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

        public C16994k getAutoauthEncKey() {
            return this.autoauthEncKey_;
        }

        public C16994k getClientRandomKey() {
            return this.clientRandomKey_;
        }

        public C16994k getCookie() {
            return this.cookie_;
        }

        public C16994k getIlinkDeviceid() {
            return this.ilinkDeviceid_;
        }

        public int getIlinkProductid() {
            return this.ilinkProductid_;
        }

        public C16994k getServerRandomKey() {
            return this.serverRandomKey_;
        }

        public C16994k getServerid() {
            return this.serverid_;
        }

        public long getUin() {
            return this.uin_;
        }

        public boolean hasAutoauthEncKey() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientRandomKey() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCookie() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasIlinkDeviceid() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasIlinkProductid() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasServerRandomKey() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasServerid() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUin() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(IlinkDeviceSessionInfo ilinkDeviceSessionInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkDeviceSessionInfo);
        }

        public static IlinkDeviceSessionInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkDeviceSessionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(C16994k kVar) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkDeviceSessionInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(byte[] bArr) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkDeviceSessionInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(InputStream inputStream) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkDeviceSessionInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkDeviceSessionInfo parseFrom(C23856l lVar) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkDeviceSessionInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkDeviceSessionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkDeviceSessionInfoOrBuilder extends C23848k1 {
        C16994k getAutoauthEncKey();

        C16994k getClientRandomKey();

        C16994k getCookie();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        C16994k getIlinkDeviceid();

        int getIlinkProductid();

        C16994k getServerRandomKey();

        C16994k getServerid();

        long getUin();

        boolean hasAutoauthEncKey();

        boolean hasClientRandomKey();

        boolean hasCookie();

        boolean hasIlinkDeviceid();

        boolean hasIlinkProductid();

        boolean hasServerRandomKey();

        boolean hasServerid();

        boolean hasUin();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkDeviceSessionType implements C23908o0.C23911c {
        kIlinkDeviceAuth(0),
        kIlinkDeviceGetSession(1);
        
        private static final C23908o0.C23912d<IlinkDeviceSessionType> internalValueMap = null;
        public static final int kIlinkDeviceAuth_VALUE = 0;
        public static final int kIlinkDeviceGetSession_VALUE = 1;
        private final int value;

        public static final class IlinkDeviceSessionTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkDeviceSessionTypeVerifier();
            }

            private IlinkDeviceSessionTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkDeviceSessionType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkDeviceSessionType>() {
                public IlinkDeviceSessionType findValueByNumber(int i) {
                    return IlinkDeviceSessionType.forNumber(i);
                }
            };
        }

        private IlinkDeviceSessionType(int i) {
            this.value = i;
        }

        public static IlinkDeviceSessionType forNumber(int i) {
            if (i == 0) {
                return kIlinkDeviceAuth;
            }
            if (i != 1) {
                return null;
            }
            return kIlinkDeviceGetSession;
        }

        public static C23908o0.C23912d<IlinkDeviceSessionType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkDeviceSessionTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkDeviceSessionType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkEBizScene implements C23908o0.C23911c {
        kC2CScene(0),
        kAppScene(2);
        
        private static final C23908o0.C23912d<IlinkEBizScene> internalValueMap = null;
        public static final int kAppScene_VALUE = 2;
        public static final int kC2CScene_VALUE = 0;
        private final int value;

        public static final class IlinkEBizSceneVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkEBizSceneVerifier();
            }

            private IlinkEBizSceneVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkEBizScene.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkEBizScene>() {
                public IlinkEBizScene findValueByNumber(int i) {
                    return IlinkEBizScene.forNumber(i);
                }
            };
        }

        private IlinkEBizScene(int i) {
            this.value = i;
        }

        public static IlinkEBizScene forNumber(int i) {
            if (i == 0) {
                return kC2CScene;
            }
            if (i != 2) {
                return null;
            }
            return kAppScene;
        }

        public static C23908o0.C23912d<IlinkEBizScene> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkEBizSceneVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkEBizScene valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkKvReportInfo extends C23861l0<IlinkKvReportInfo, Builder> implements IlinkKvReportInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkKvReportInfo DEFAULT_INSTANCE;
        public static final int IGNORE_FREQ_CHECK_FIELD_NUMBER = 5;
        public static final int LOGID_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkKvReportInfo> PARSER = null;
        public static final int REPORT_NOW_FIELD_NUMBER = 4;
        public static final int REPORT_UIN_TYPE_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 2;
        public static final int VALUE_FIELD_NUMBER = 3;
        private int bitField0_;
        private boolean ignoreFreqCheck_;
        private int logid_;
        private boolean reportNow_;
        private int reportUinType_;
        private int type_;
        private C16994k value_ = C16994k.f46000e;

        public static final class Builder extends C23861l0.C23862a<IlinkKvReportInfo, Builder> implements IlinkKvReportInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearIgnoreFreqCheck() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearIgnoreFreqCheck();
                return this;
            }

            public Builder clearLogid() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearLogid();
                return this;
            }

            public Builder clearReportNow() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearReportNow();
                return this;
            }

            public Builder clearReportUinType() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearReportUinType();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearType();
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).clearValue();
                return this;
            }

            public boolean getIgnoreFreqCheck() {
                return ((IlinkKvReportInfo) this.instance).getIgnoreFreqCheck();
            }

            public int getLogid() {
                return ((IlinkKvReportInfo) this.instance).getLogid();
            }

            public boolean getReportNow() {
                return ((IlinkKvReportInfo) this.instance).getReportNow();
            }

            public int getReportUinType() {
                return ((IlinkKvReportInfo) this.instance).getReportUinType();
            }

            public int getType() {
                return ((IlinkKvReportInfo) this.instance).getType();
            }

            public C16994k getValue() {
                return ((IlinkKvReportInfo) this.instance).getValue();
            }

            public boolean hasIgnoreFreqCheck() {
                return ((IlinkKvReportInfo) this.instance).hasIgnoreFreqCheck();
            }

            public boolean hasLogid() {
                return ((IlinkKvReportInfo) this.instance).hasLogid();
            }

            public boolean hasReportNow() {
                return ((IlinkKvReportInfo) this.instance).hasReportNow();
            }

            public boolean hasReportUinType() {
                return ((IlinkKvReportInfo) this.instance).hasReportUinType();
            }

            public boolean hasType() {
                return ((IlinkKvReportInfo) this.instance).hasType();
            }

            public boolean hasValue() {
                return ((IlinkKvReportInfo) this.instance).hasValue();
            }

            public Builder setIgnoreFreqCheck(boolean z) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setIgnoreFreqCheck(z);
                return this;
            }

            public Builder setLogid(int i) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setLogid(i);
                return this;
            }

            public Builder setReportNow(boolean z) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setReportNow(z);
                return this;
            }

            public Builder setReportUinType(int i) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setReportUinType(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setType(i);
                return this;
            }

            public Builder setValue(C16994k kVar) {
                copyOnWrite();
                ((IlinkKvReportInfo) this.instance).setValue(kVar);
                return this;
            }

            private Builder() {
                super(IlinkKvReportInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkKvReportInfo ilinkKvReportInfo = new IlinkKvReportInfo();
            DEFAULT_INSTANCE = ilinkKvReportInfo;
            C23861l0.registerDefaultInstance(IlinkKvReportInfo.class, ilinkKvReportInfo);
        }

        private IlinkKvReportInfo() {
        }

        /* access modifiers changed from: private */
        public void clearIgnoreFreqCheck() {
            this.bitField0_ &= -17;
            this.ignoreFreqCheck_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLogid() {
            this.bitField0_ &= -2;
            this.logid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReportNow() {
            this.bitField0_ &= -9;
            this.reportNow_ = false;
        }

        /* access modifiers changed from: private */
        public void clearReportUinType() {
            this.bitField0_ &= -33;
            this.reportUinType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -3;
            this.type_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearValue() {
            this.bitField0_ &= -5;
            this.value_ = getDefaultInstance().getValue();
        }

        public static IlinkKvReportInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkKvReportInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkKvReportInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkKvReportInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkKvReportInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIgnoreFreqCheck(boolean z) {
            this.bitField0_ |= 16;
            this.ignoreFreqCheck_ = z;
        }

        /* access modifiers changed from: private */
        public void setLogid(int i) {
            this.bitField0_ |= 1;
            this.logid_ = i;
        }

        /* access modifiers changed from: private */
        public void setReportNow(boolean z) {
            this.bitField0_ |= 8;
            this.reportNow_ = z;
        }

        /* access modifiers changed from: private */
        public void setReportUinType(int i) {
            this.bitField0_ |= 32;
            this.reportUinType_ = i;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 2;
            this.type_ = i;
        }

        /* access modifiers changed from: private */
        public void setValue(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.value_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "logid_", "type_", "value_", "reportNow_", "ignoreFreqCheck_", "reportUinType_"});
                case 3:
                    return new IlinkKvReportInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkKvReportInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkKvReportInfo.class) {
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

        public boolean getIgnoreFreqCheck() {
            return this.ignoreFreqCheck_;
        }

        public int getLogid() {
            return this.logid_;
        }

        public boolean getReportNow() {
            return this.reportNow_;
        }

        public int getReportUinType() {
            return this.reportUinType_;
        }

        public int getType() {
            return this.type_;
        }

        public C16994k getValue() {
            return this.value_;
        }

        public boolean hasIgnoreFreqCheck() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLogid() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasReportNow() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasReportUinType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasValue() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkKvReportInfo ilinkKvReportInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkKvReportInfo);
        }

        public static IlinkKvReportInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkKvReportInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(C16994k kVar) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkKvReportInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(byte[] bArr) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkKvReportInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(InputStream inputStream) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkKvReportInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkKvReportInfo parseFrom(C23856l lVar) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkKvReportInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkKvReportInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkKvReportInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getIgnoreFreqCheck();

        int getLogid();

        boolean getReportNow();

        int getReportUinType();

        int getType();

        C16994k getValue();

        boolean hasIgnoreFreqCheck();

        boolean hasLogid();

        boolean hasReportNow();

        boolean hasReportUinType();

        boolean hasType();

        boolean hasValue();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkLogLevel implements C23908o0.C23911c {
        kIlinkLogLevelVerbose(0),
        kIlinkLogLevelDebug(1),
        kIlinkLogLevelInfo(2),
        kIlinkLogLevelWarn(3),
        kIlinkLogLevelError(4),
        kIlinkLogLevelFatal(5),
        kIlinkLogLevelNone(6);
        
        private static final C23908o0.C23912d<IlinkLogLevel> internalValueMap = null;
        public static final int kIlinkLogLevelDebug_VALUE = 1;
        public static final int kIlinkLogLevelError_VALUE = 4;
        public static final int kIlinkLogLevelFatal_VALUE = 5;
        public static final int kIlinkLogLevelInfo_VALUE = 2;
        public static final int kIlinkLogLevelNone_VALUE = 6;
        public static final int kIlinkLogLevelVerbose_VALUE = 0;
        public static final int kIlinkLogLevelWarn_VALUE = 3;
        private final int value;

        public static final class IlinkLogLevelVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkLogLevelVerifier();
            }

            private IlinkLogLevelVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkLogLevel.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkLogLevel>() {
                public IlinkLogLevel findValueByNumber(int i) {
                    return IlinkLogLevel.forNumber(i);
                }
            };
        }

        private IlinkLogLevel(int i) {
            this.value = i;
        }

        public static IlinkLogLevel forNumber(int i) {
            switch (i) {
                case 0:
                    return kIlinkLogLevelVerbose;
                case 1:
                    return kIlinkLogLevelDebug;
                case 2:
                    return kIlinkLogLevelInfo;
                case 3:
                    return kIlinkLogLevelWarn;
                case 4:
                    return kIlinkLogLevelError;
                case 5:
                    return kIlinkLogLevelFatal;
                case 6:
                    return kIlinkLogLevelNone;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<IlinkLogLevel> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkLogLevelVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkLogLevel valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkMsgIotAppMsg extends C23861l0<IlinkMsgIotAppMsg, Builder> implements IlinkMsgIotAppMsgOrBuilder {
        public static final int APPBODY_FIELD_NUMBER = 3;
        public static final int APPID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkMsgIotAppMsg DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkMsgIotAppMsg> PARSER = null;
        public static final int UIN_FIELD_NUMBER = 2;
        private C16994k appbody_ = C16994k.f46000e;
        private String appid_ = "";
        private int bitField0_;
        private long uin_;

        public static final class Builder extends C23861l0.C23862a<IlinkMsgIotAppMsg, Builder> implements IlinkMsgIotAppMsgOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAppbody() {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).clearAppbody();
                return this;
            }

            public Builder clearAppid() {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).clearAppid();
                return this;
            }

            public Builder clearUin() {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).clearUin();
                return this;
            }

            public C16994k getAppbody() {
                return ((IlinkMsgIotAppMsg) this.instance).getAppbody();
            }

            public String getAppid() {
                return ((IlinkMsgIotAppMsg) this.instance).getAppid();
            }

            public C16994k getAppidBytes() {
                return ((IlinkMsgIotAppMsg) this.instance).getAppidBytes();
            }

            public long getUin() {
                return ((IlinkMsgIotAppMsg) this.instance).getUin();
            }

            public boolean hasAppbody() {
                return ((IlinkMsgIotAppMsg) this.instance).hasAppbody();
            }

            public boolean hasAppid() {
                return ((IlinkMsgIotAppMsg) this.instance).hasAppid();
            }

            public boolean hasUin() {
                return ((IlinkMsgIotAppMsg) this.instance).hasUin();
            }

            public Builder setAppbody(C16994k kVar) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setAppbody(kVar);
                return this;
            }

            public Builder setAppid(String str) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setAppid(str);
                return this;
            }

            public Builder setAppidBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setAppidBytes(kVar);
                return this;
            }

            public Builder setUin(long j) {
                copyOnWrite();
                ((IlinkMsgIotAppMsg) this.instance).setUin(j);
                return this;
            }

            private Builder() {
                super(IlinkMsgIotAppMsg.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkMsgIotAppMsg ilinkMsgIotAppMsg = new IlinkMsgIotAppMsg();
            DEFAULT_INSTANCE = ilinkMsgIotAppMsg;
            C23861l0.registerDefaultInstance(IlinkMsgIotAppMsg.class, ilinkMsgIotAppMsg);
        }

        private IlinkMsgIotAppMsg() {
        }

        /* access modifiers changed from: private */
        public void clearAppbody() {
            this.bitField0_ &= -5;
            this.appbody_ = getDefaultInstance().getAppbody();
        }

        /* access modifiers changed from: private */
        public void clearAppid() {
            this.bitField0_ &= -2;
            this.appid_ = getDefaultInstance().getAppid();
        }

        /* access modifiers changed from: private */
        public void clearUin() {
            this.bitField0_ &= -3;
            this.uin_ = 0;
        }

        public static IlinkMsgIotAppMsg getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkMsgIotAppMsg parseDelimitedFrom(InputStream inputStream) {
            return (IlinkMsgIotAppMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkMsgIotAppMsg parseFrom(ByteBuffer byteBuffer) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkMsgIotAppMsg> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppbody(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.appbody_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setAppid(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.appid_ = str;
        }

        /* access modifiers changed from: private */
        public void setAppidBytes(C16994k kVar) {
            this.appid_ = kVar.mo18752u();
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဃ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "appid_", "uin_", "appbody_"});
                case 3:
                    return new IlinkMsgIotAppMsg();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkMsgIotAppMsg> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkMsgIotAppMsg.class) {
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

        public C16994k getAppbody() {
            return this.appbody_;
        }

        public String getAppid() {
            return this.appid_;
        }

        public C16994k getAppidBytes() {
            return C16994k.m16791k(this.appid_);
        }

        public long getUin() {
            return this.uin_;
        }

        public boolean hasAppbody() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasAppid() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUin() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkMsgIotAppMsg ilinkMsgIotAppMsg) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkMsgIotAppMsg);
        }

        public static IlinkMsgIotAppMsg parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkMsgIotAppMsg) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(C16994k kVar) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkMsgIotAppMsg parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(byte[] bArr) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkMsgIotAppMsg parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(InputStream inputStream) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkMsgIotAppMsg parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkMsgIotAppMsg parseFrom(C23856l lVar) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkMsgIotAppMsg parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkMsgIotAppMsg) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkMsgIotAppMsgOrBuilder extends C23848k1 {
        C16994k getAppbody();

        String getAppid();

        C16994k getAppidBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getUin();

        boolean hasAppbody();

        boolean hasAppid();

        boolean hasUin();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkNetProxyInfo extends C23861l0<IlinkNetProxyInfo, Builder> implements IlinkNetProxyInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkNetProxyInfo DEFAULT_INSTANCE;
        public static final int IP_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkNetProxyInfo> PARSER = null;
        public static final int PASSWORD_FIELD_NUMBER = 4;
        public static final int PORT_FIELD_NUMBER = 2;
        public static final int PROXYTYPE_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private String ip_ = "";
        private C16994k password_;
        private int port_;
        private int proxytype_;
        private C16994k username_;

        public static final class Builder extends C23861l0.C23862a<IlinkNetProxyInfo, Builder> implements IlinkNetProxyInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearIp() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearIp();
                return this;
            }

            public Builder clearPassword() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearPassword();
                return this;
            }

            public Builder clearPort() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearPort();
                return this;
            }

            public Builder clearProxytype() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearProxytype();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).clearUsername();
                return this;
            }

            public String getIp() {
                return ((IlinkNetProxyInfo) this.instance).getIp();
            }

            public C16994k getIpBytes() {
                return ((IlinkNetProxyInfo) this.instance).getIpBytes();
            }

            public C16994k getPassword() {
                return ((IlinkNetProxyInfo) this.instance).getPassword();
            }

            public int getPort() {
                return ((IlinkNetProxyInfo) this.instance).getPort();
            }

            public int getProxytype() {
                return ((IlinkNetProxyInfo) this.instance).getProxytype();
            }

            public C16994k getUsername() {
                return ((IlinkNetProxyInfo) this.instance).getUsername();
            }

            public boolean hasIp() {
                return ((IlinkNetProxyInfo) this.instance).hasIp();
            }

            public boolean hasPassword() {
                return ((IlinkNetProxyInfo) this.instance).hasPassword();
            }

            public boolean hasPort() {
                return ((IlinkNetProxyInfo) this.instance).hasPort();
            }

            public boolean hasProxytype() {
                return ((IlinkNetProxyInfo) this.instance).hasProxytype();
            }

            public boolean hasUsername() {
                return ((IlinkNetProxyInfo) this.instance).hasUsername();
            }

            public Builder setIp(String str) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setIp(str);
                return this;
            }

            public Builder setIpBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setIpBytes(kVar);
                return this;
            }

            public Builder setPassword(C16994k kVar) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setPassword(kVar);
                return this;
            }

            public Builder setPort(int i) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setPort(i);
                return this;
            }

            public Builder setProxytype(int i) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setProxytype(i);
                return this;
            }

            public Builder setUsername(C16994k kVar) {
                copyOnWrite();
                ((IlinkNetProxyInfo) this.instance).setUsername(kVar);
                return this;
            }

            private Builder() {
                super(IlinkNetProxyInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkNetProxyInfo ilinkNetProxyInfo = new IlinkNetProxyInfo();
            DEFAULT_INSTANCE = ilinkNetProxyInfo;
            C23861l0.registerDefaultInstance(IlinkNetProxyInfo.class, ilinkNetProxyInfo);
        }

        private IlinkNetProxyInfo() {
            C16994k kVar = C16994k.f46000e;
            this.username_ = kVar;
            this.password_ = kVar;
        }

        /* access modifiers changed from: private */
        public void clearIp() {
            this.bitField0_ &= -2;
            this.ip_ = getDefaultInstance().getIp();
        }

        /* access modifiers changed from: private */
        public void clearPassword() {
            this.bitField0_ &= -9;
            this.password_ = getDefaultInstance().getPassword();
        }

        /* access modifiers changed from: private */
        public void clearPort() {
            this.bitField0_ &= -3;
            this.port_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearProxytype() {
            this.bitField0_ &= -17;
            this.proxytype_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -5;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static IlinkNetProxyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkNetProxyInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkNetProxyInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkNetProxyInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkNetProxyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setIp(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.ip_ = str;
        }

        /* access modifiers changed from: private */
        public void setIpBytes(C16994k kVar) {
            this.ip_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setPassword(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 8;
            this.password_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setPort(int i) {
            this.bitField0_ |= 2;
            this.port_ = i;
        }

        /* access modifiers changed from: private */
        public void setProxytype(int i) {
            this.bitField0_ |= 16;
            this.proxytype_ = i;
        }

        /* access modifiers changed from: private */
        public void setUsername(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.username_ = kVar;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "ip_", "port_", "username_", "password_", "proxytype_"});
                case 3:
                    return new IlinkNetProxyInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkNetProxyInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkNetProxyInfo.class) {
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

        public String getIp() {
            return this.ip_;
        }

        public C16994k getIpBytes() {
            return C16994k.m16791k(this.ip_);
        }

        public C16994k getPassword() {
            return this.password_;
        }

        public int getPort() {
            return this.port_;
        }

        public int getProxytype() {
            return this.proxytype_;
        }

        public C16994k getUsername() {
            return this.username_;
        }

        public boolean hasIp() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasPassword() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPort() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasProxytype() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(IlinkNetProxyInfo ilinkNetProxyInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkNetProxyInfo);
        }

        public static IlinkNetProxyInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkNetProxyInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(C16994k kVar) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkNetProxyInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(byte[] bArr) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkNetProxyInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(InputStream inputStream) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkNetProxyInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkNetProxyInfo parseFrom(C23856l lVar) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkNetProxyInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkNetProxyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkNetProxyInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getIp();

        C16994k getIpBytes();

        C16994k getPassword();

        int getPort();

        int getProxytype();

        C16994k getUsername();

        boolean hasIp();

        boolean hasPassword();

        boolean hasPort();

        boolean hasProxytype();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkNetType implements C23908o0.C23911c {
        kIlinkShortlink(0),
        kIlinkLonglink(1);
        
        private static final C23908o0.C23912d<IlinkNetType> internalValueMap = null;
        public static final int kIlinkLonglink_VALUE = 1;
        public static final int kIlinkShortlink_VALUE = 0;
        private final int value;

        public static final class IlinkNetTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkNetTypeVerifier();
            }

            private IlinkNetTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkNetType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkNetType>() {
                public IlinkNetType findValueByNumber(int i) {
                    return IlinkNetType.forNumber(i);
                }
            };
        }

        private IlinkNetType(int i) {
            this.value = i;
        }

        public static IlinkNetType forNumber(int i) {
            if (i == 0) {
                return kIlinkShortlink;
            }
            if (i != 1) {
                return null;
            }
            return kIlinkLonglink;
        }

        public static C23908o0.C23912d<IlinkNetType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkNetTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkNetType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkPullLogCmd extends C23861l0<IlinkPullLogCmd, Builder> implements IlinkPullLogCmdOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkPullLogCmd DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 2;
        public static final int EXT_BUFFER_FIELD_NUMBER = 7;
        public static final int ILINK_APPIDS_FIELD_NUMBER = 5;
        public static final int ILINK_CAPATH_FIELD_NUMBER = 8;
        public static final int ILINK_LOGS_FIELD_NUMBER = 9;
        public static final int INCLUDE_DEVLOG_FIELD_NUMBER = 6;
        private static volatile C24062w1<IlinkPullLogCmd> PARSER = null;
        public static final int START_TIME_FIELD_NUMBER = 1;
        public static final int UPLOAD_TOKEN_FIELD_NUMBER = 3;
        public static final int USE_NETTYPE_FIELD_NUMBER = 4;
        private int bitField0_;
        private int endTime_;
        private String extBuffer_ = "";
        private C23908o0.C23919j<String> ilinkAppids_ = C23861l0.emptyProtobufList();
        private String ilinkCapath_ = "";
        private C23908o0.C23919j<String> ilinkLogs_ = C23861l0.emptyProtobufList();
        private boolean includeDevlog_;
        private int startTime_;
        private String uploadToken_ = "";
        private int useNettype_;

        public static final class Builder extends C23861l0.C23862a<IlinkPullLogCmd, Builder> implements IlinkPullLogCmdOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder addAllIlinkAppids(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addAllIlinkAppids(iterable);
                return this;
            }

            public Builder addAllIlinkLogs(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addAllIlinkLogs(iterable);
                return this;
            }

            public Builder addIlinkAppids(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkAppids(str);
                return this;
            }

            public Builder addIlinkAppidsBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkAppidsBytes(kVar);
                return this;
            }

            public Builder addIlinkLogs(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkLogs(str);
                return this;
            }

            public Builder addIlinkLogsBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).addIlinkLogsBytes(kVar);
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearEndTime();
                return this;
            }

            public Builder clearExtBuffer() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearExtBuffer();
                return this;
            }

            public Builder clearIlinkAppids() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIlinkAppids();
                return this;
            }

            public Builder clearIlinkCapath() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIlinkCapath();
                return this;
            }

            public Builder clearIlinkLogs() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIlinkLogs();
                return this;
            }

            public Builder clearIncludeDevlog() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearIncludeDevlog();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearStartTime();
                return this;
            }

            public Builder clearUploadToken() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearUploadToken();
                return this;
            }

            public Builder clearUseNettype() {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).clearUseNettype();
                return this;
            }

            public int getEndTime() {
                return ((IlinkPullLogCmd) this.instance).getEndTime();
            }

            public String getExtBuffer() {
                return ((IlinkPullLogCmd) this.instance).getExtBuffer();
            }

            public C16994k getExtBufferBytes() {
                return ((IlinkPullLogCmd) this.instance).getExtBufferBytes();
            }

            public String getIlinkAppids(int i) {
                return ((IlinkPullLogCmd) this.instance).getIlinkAppids(i);
            }

            public C16994k getIlinkAppidsBytes(int i) {
                return ((IlinkPullLogCmd) this.instance).getIlinkAppidsBytes(i);
            }

            public int getIlinkAppidsCount() {
                return ((IlinkPullLogCmd) this.instance).getIlinkAppidsCount();
            }

            public List<String> getIlinkAppidsList() {
                return Collections.unmodifiableList(((IlinkPullLogCmd) this.instance).getIlinkAppidsList());
            }

            public String getIlinkCapath() {
                return ((IlinkPullLogCmd) this.instance).getIlinkCapath();
            }

            public C16994k getIlinkCapathBytes() {
                return ((IlinkPullLogCmd) this.instance).getIlinkCapathBytes();
            }

            public String getIlinkLogs(int i) {
                return ((IlinkPullLogCmd) this.instance).getIlinkLogs(i);
            }

            public C16994k getIlinkLogsBytes(int i) {
                return ((IlinkPullLogCmd) this.instance).getIlinkLogsBytes(i);
            }

            public int getIlinkLogsCount() {
                return ((IlinkPullLogCmd) this.instance).getIlinkLogsCount();
            }

            public List<String> getIlinkLogsList() {
                return Collections.unmodifiableList(((IlinkPullLogCmd) this.instance).getIlinkLogsList());
            }

            public boolean getIncludeDevlog() {
                return ((IlinkPullLogCmd) this.instance).getIncludeDevlog();
            }

            public int getStartTime() {
                return ((IlinkPullLogCmd) this.instance).getStartTime();
            }

            public String getUploadToken() {
                return ((IlinkPullLogCmd) this.instance).getUploadToken();
            }

            public C16994k getUploadTokenBytes() {
                return ((IlinkPullLogCmd) this.instance).getUploadTokenBytes();
            }

            public int getUseNettype() {
                return ((IlinkPullLogCmd) this.instance).getUseNettype();
            }

            public boolean hasEndTime() {
                return ((IlinkPullLogCmd) this.instance).hasEndTime();
            }

            public boolean hasExtBuffer() {
                return ((IlinkPullLogCmd) this.instance).hasExtBuffer();
            }

            public boolean hasIlinkCapath() {
                return ((IlinkPullLogCmd) this.instance).hasIlinkCapath();
            }

            public boolean hasIncludeDevlog() {
                return ((IlinkPullLogCmd) this.instance).hasIncludeDevlog();
            }

            public boolean hasStartTime() {
                return ((IlinkPullLogCmd) this.instance).hasStartTime();
            }

            public boolean hasUploadToken() {
                return ((IlinkPullLogCmd) this.instance).hasUploadToken();
            }

            public boolean hasUseNettype() {
                return ((IlinkPullLogCmd) this.instance).hasUseNettype();
            }

            public Builder setEndTime(int i) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setEndTime(i);
                return this;
            }

            public Builder setExtBuffer(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setExtBuffer(str);
                return this;
            }

            public Builder setExtBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setExtBufferBytes(kVar);
                return this;
            }

            public Builder setIlinkAppids(int i, String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkAppids(i, str);
                return this;
            }

            public Builder setIlinkCapath(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkCapath(str);
                return this;
            }

            public Builder setIlinkCapathBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkCapathBytes(kVar);
                return this;
            }

            public Builder setIlinkLogs(int i, String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIlinkLogs(i, str);
                return this;
            }

            public Builder setIncludeDevlog(boolean z) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setIncludeDevlog(z);
                return this;
            }

            public Builder setStartTime(int i) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setStartTime(i);
                return this;
            }

            public Builder setUploadToken(String str) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setUploadToken(str);
                return this;
            }

            public Builder setUploadTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setUploadTokenBytes(kVar);
                return this;
            }

            public Builder setUseNettype(int i) {
                copyOnWrite();
                ((IlinkPullLogCmd) this.instance).setUseNettype(i);
                return this;
            }

            private Builder() {
                super(IlinkPullLogCmd.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkPullLogCmd ilinkPullLogCmd = new IlinkPullLogCmd();
            DEFAULT_INSTANCE = ilinkPullLogCmd;
            C23861l0.registerDefaultInstance(IlinkPullLogCmd.class, ilinkPullLogCmd);
        }

        private IlinkPullLogCmd() {
        }

        /* access modifiers changed from: private */
        public void addAllIlinkAppids(Iterable<String> iterable) {
            ensureIlinkAppidsIsMutable();
            C23810b.addAll(iterable, this.ilinkAppids_);
        }

        /* access modifiers changed from: private */
        public void addAllIlinkLogs(Iterable<String> iterable) {
            ensureIlinkLogsIsMutable();
            C23810b.addAll(iterable, this.ilinkLogs_);
        }

        /* access modifiers changed from: private */
        public void addIlinkAppids(String str) {
            str.getClass();
            ensureIlinkAppidsIsMutable();
            this.ilinkAppids_.add(str);
        }

        /* access modifiers changed from: private */
        public void addIlinkAppidsBytes(C16994k kVar) {
            ensureIlinkAppidsIsMutable();
            this.ilinkAppids_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void addIlinkLogs(String str) {
            str.getClass();
            ensureIlinkLogsIsMutable();
            this.ilinkLogs_.add(str);
        }

        /* access modifiers changed from: private */
        public void addIlinkLogsBytes(C16994k kVar) {
            ensureIlinkLogsIsMutable();
            this.ilinkLogs_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -3;
            this.endTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExtBuffer() {
            this.bitField0_ &= -33;
            this.extBuffer_ = getDefaultInstance().getExtBuffer();
        }

        /* access modifiers changed from: private */
        public void clearIlinkAppids() {
            this.ilinkAppids_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearIlinkCapath() {
            this.bitField0_ &= -65;
            this.ilinkCapath_ = getDefaultInstance().getIlinkCapath();
        }

        /* access modifiers changed from: private */
        public void clearIlinkLogs() {
            this.ilinkLogs_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearIncludeDevlog() {
            this.bitField0_ &= -17;
            this.includeDevlog_ = false;
        }

        /* access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -2;
            this.startTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUploadToken() {
            this.bitField0_ &= -5;
            this.uploadToken_ = getDefaultInstance().getUploadToken();
        }

        /* access modifiers changed from: private */
        public void clearUseNettype() {
            this.bitField0_ &= -9;
            this.useNettype_ = 0;
        }

        private void ensureIlinkAppidsIsMutable() {
            C23908o0.C23919j<String> jVar = this.ilinkAppids_;
            if (!jVar.mo37523Q()) {
                this.ilinkAppids_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureIlinkLogsIsMutable() {
            C23908o0.C23919j<String> jVar = this.ilinkLogs_;
            if (!jVar.mo37523Q()) {
                this.ilinkLogs_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static IlinkPullLogCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkPullLogCmd parseDelimitedFrom(InputStream inputStream) {
            return (IlinkPullLogCmd) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkPullLogCmd parseFrom(ByteBuffer byteBuffer) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkPullLogCmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setEndTime(int i) {
            this.bitField0_ |= 2;
            this.endTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setExtBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.extBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setExtBufferBytes(C16994k kVar) {
            this.extBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setIlinkAppids(int i, String str) {
            str.getClass();
            ensureIlinkAppidsIsMutable();
            this.ilinkAppids_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setIlinkCapath(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.ilinkCapath_ = str;
        }

        /* access modifiers changed from: private */
        public void setIlinkCapathBytes(C16994k kVar) {
            this.ilinkCapath_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setIlinkLogs(int i, String str) {
            str.getClass();
            ensureIlinkLogsIsMutable();
            this.ilinkLogs_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setIncludeDevlog(boolean z) {
            this.bitField0_ |= 16;
            this.includeDevlog_ = z;
        }

        /* access modifiers changed from: private */
        public void setStartTime(int i) {
            this.bitField0_ |= 1;
            this.startTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setUploadToken(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.uploadToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setUploadTokenBytes(C16994k kVar) {
            this.uploadToken_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setUseNettype(int i) {
            this.bitField0_ |= 8;
            this.useNettype_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005\u001a\u0006ဇ\u0004\u0007ဈ\u0005\bဈ\u0006\t\u001a", new Object[]{"bitField0_", "startTime_", "endTime_", "uploadToken_", "useNettype_", "ilinkAppids_", "includeDevlog_", "extBuffer_", "ilinkCapath_", "ilinkLogs_"});
                case 3:
                    return new IlinkPullLogCmd();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkPullLogCmd> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkPullLogCmd.class) {
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

        public int getEndTime() {
            return this.endTime_;
        }

        public String getExtBuffer() {
            return this.extBuffer_;
        }

        public C16994k getExtBufferBytes() {
            return C16994k.m16791k(this.extBuffer_);
        }

        public String getIlinkAppids(int i) {
            return this.ilinkAppids_.get(i);
        }

        public C16994k getIlinkAppidsBytes(int i) {
            return C16994k.m16791k(this.ilinkAppids_.get(i));
        }

        public int getIlinkAppidsCount() {
            return this.ilinkAppids_.size();
        }

        public List<String> getIlinkAppidsList() {
            return this.ilinkAppids_;
        }

        public String getIlinkCapath() {
            return this.ilinkCapath_;
        }

        public C16994k getIlinkCapathBytes() {
            return C16994k.m16791k(this.ilinkCapath_);
        }

        public String getIlinkLogs(int i) {
            return this.ilinkLogs_.get(i);
        }

        public C16994k getIlinkLogsBytes(int i) {
            return C16994k.m16791k(this.ilinkLogs_.get(i));
        }

        public int getIlinkLogsCount() {
            return this.ilinkLogs_.size();
        }

        public List<String> getIlinkLogsList() {
            return this.ilinkLogs_;
        }

        public boolean getIncludeDevlog() {
            return this.includeDevlog_;
        }

        public int getStartTime() {
            return this.startTime_;
        }

        public String getUploadToken() {
            return this.uploadToken_;
        }

        public C16994k getUploadTokenBytes() {
            return C16994k.m16791k(this.uploadToken_);
        }

        public int getUseNettype() {
            return this.useNettype_;
        }

        public boolean hasEndTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasExtBuffer() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasIlinkCapath() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasIncludeDevlog() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUploadToken() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasUseNettype() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkPullLogCmd ilinkPullLogCmd) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkPullLogCmd);
        }

        public static IlinkPullLogCmd parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkPullLogCmd) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(C16994k kVar) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkPullLogCmd parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(byte[] bArr) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkPullLogCmd parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(InputStream inputStream) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkPullLogCmd parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkPullLogCmd parseFrom(C23856l lVar) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkPullLogCmd parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkPullLogCmd) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkPullLogCmdOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getEndTime();

        String getExtBuffer();

        C16994k getExtBufferBytes();

        String getIlinkAppids(int i);

        C16994k getIlinkAppidsBytes(int i);

        int getIlinkAppidsCount();

        List<String> getIlinkAppidsList();

        String getIlinkCapath();

        C16994k getIlinkCapathBytes();

        String getIlinkLogs(int i);

        C16994k getIlinkLogsBytes(int i);

        int getIlinkLogsCount();

        List<String> getIlinkLogsList();

        boolean getIncludeDevlog();

        int getStartTime();

        String getUploadToken();

        C16994k getUploadTokenBytes();

        int getUseNettype();

        boolean hasEndTime();

        boolean hasExtBuffer();

        boolean hasIlinkCapath();

        boolean hasIncludeDevlog();

        boolean hasStartTime();

        boolean hasUploadToken();

        boolean hasUseNettype();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkPullLogNetType implements C23908o0.C23911c {
        kIlinkLan(0),
        kIlinkAny(1);
        
        private static final C23908o0.C23912d<IlinkPullLogNetType> internalValueMap = null;
        public static final int kIlinkAny_VALUE = 1;
        public static final int kIlinkLan_VALUE = 0;
        private final int value;

        public static final class IlinkPullLogNetTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkPullLogNetTypeVerifier();
            }

            private IlinkPullLogNetTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkPullLogNetType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkPullLogNetType>() {
                public IlinkPullLogNetType findValueByNumber(int i) {
                    return IlinkPullLogNetType.forNumber(i);
                }
            };
        }

        private IlinkPullLogNetType(int i) {
            this.value = i;
        }

        public static IlinkPullLogNetType forNumber(int i) {
            if (i == 0) {
                return kIlinkLan;
            }
            if (i != 1) {
                return null;
            }
            return kIlinkAny;
        }

        public static C23908o0.C23912d<IlinkPullLogNetType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkPullLogNetTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkPullLogNetType valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum IlinkReqCGIType implements C23908o0.C23911c {
        kIlinkCGITypeDirect(0),
        kIlinkCGITypeH5Transfer(1);
        
        private static final C23908o0.C23912d<IlinkReqCGIType> internalValueMap = null;
        public static final int kIlinkCGITypeDirect_VALUE = 0;
        public static final int kIlinkCGITypeH5Transfer_VALUE = 1;
        private final int value;

        public static final class IlinkReqCGITypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkReqCGITypeVerifier();
            }

            private IlinkReqCGITypeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkReqCGIType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkReqCGIType>() {
                public IlinkReqCGIType findValueByNumber(int i) {
                    return IlinkReqCGIType.forNumber(i);
                }
            };
        }

        private IlinkReqCGIType(int i) {
            this.value = i;
        }

        public static IlinkReqCGIType forNumber(int i) {
            if (i == 0) {
                return kIlinkCGITypeDirect;
            }
            if (i != 1) {
                return null;
            }
            return kIlinkCGITypeH5Transfer;
        }

        public static C23908o0.C23912d<IlinkReqCGIType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkReqCGITypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkReqCGIType valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkRequestInfo extends C23861l0<IlinkRequestInfo, Builder> implements IlinkRequestInfoOrBuilder {
        public static final int BODY_FIELD_NUMBER = 3;
        public static final int CGI_TYPE_FIELD_NUMBER = 14;
        public static final int CMDID_FIELD_NUMBER = 1;
        public static final int CONTENT_TYPE_FIELD_NUMBER = 12;
        public static final int CRYPTO_ALGO_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final IlinkRequestInfo DEFAULT_INSTANCE;
        public static final int LIMIT_FLOW_FIELD_NUMBER = 8;
        public static final int LIMIT_FREQUENCY_FIELD_NUMBER = 9;
        public static final int LONG_POLLING_FIELD_NUMBER = 10;
        public static final int LONG_POLLING_TIMEOUT_FIELD_NUMBER = 11;
        public static final int NETWORK_STATUS_SENSITIVE_FIELD_NUMBER = 13;
        public static final int NET_TYPE_FIELD_NUMBER = 6;
        private static volatile C24062w1<IlinkRequestInfo> PARSER = null;
        public static final int RETRY_COUNT_FIELD_NUMBER = 5;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 4;
        public static final int URL_FIELD_NUMBER = 2;
        private int bitField0_;
        private C16994k body_ = C16994k.f46000e;
        private int cgiType_;
        private int cmdid_;
        private int contentType_ = 1;
        private int cryptoAlgo_ = 1;
        private boolean limitFlow_;
        private boolean limitFrequency_;
        private int longPollingTimeout_;
        private boolean longPolling_;
        private int netType_ = 1;
        private boolean networkStatusSensitive_;
        private int retryCount_;
        private int timeoutMs_;
        private String url_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkRequestInfo, Builder> implements IlinkRequestInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearBody();
                return this;
            }

            public Builder clearCgiType() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearCgiType();
                return this;
            }

            public Builder clearCmdid() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearCmdid();
                return this;
            }

            public Builder clearContentType() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearContentType();
                return this;
            }

            public Builder clearCryptoAlgo() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearCryptoAlgo();
                return this;
            }

            public Builder clearLimitFlow() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLimitFlow();
                return this;
            }

            public Builder clearLimitFrequency() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLimitFrequency();
                return this;
            }

            public Builder clearLongPolling() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLongPolling();
                return this;
            }

            public Builder clearLongPollingTimeout() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearLongPollingTimeout();
                return this;
            }

            public Builder clearNetType() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearNetType();
                return this;
            }

            public Builder clearNetworkStatusSensitive() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearNetworkStatusSensitive();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearTimeoutMs();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).clearUrl();
                return this;
            }

            public C16994k getBody() {
                return ((IlinkRequestInfo) this.instance).getBody();
            }

            public IlinkReqCGIType getCgiType() {
                return ((IlinkRequestInfo) this.instance).getCgiType();
            }

            public int getCmdid() {
                return ((IlinkRequestInfo) this.instance).getCmdid();
            }

            public IlinkContentType getContentType() {
                return ((IlinkRequestInfo) this.instance).getContentType();
            }

            public IlinkCryptoAlgo getCryptoAlgo() {
                return ((IlinkRequestInfo) this.instance).getCryptoAlgo();
            }

            public boolean getLimitFlow() {
                return ((IlinkRequestInfo) this.instance).getLimitFlow();
            }

            public boolean getLimitFrequency() {
                return ((IlinkRequestInfo) this.instance).getLimitFrequency();
            }

            public boolean getLongPolling() {
                return ((IlinkRequestInfo) this.instance).getLongPolling();
            }

            public int getLongPollingTimeout() {
                return ((IlinkRequestInfo) this.instance).getLongPollingTimeout();
            }

            public IlinkNetType getNetType() {
                return ((IlinkRequestInfo) this.instance).getNetType();
            }

            public boolean getNetworkStatusSensitive() {
                return ((IlinkRequestInfo) this.instance).getNetworkStatusSensitive();
            }

            public int getRetryCount() {
                return ((IlinkRequestInfo) this.instance).getRetryCount();
            }

            public int getTimeoutMs() {
                return ((IlinkRequestInfo) this.instance).getTimeoutMs();
            }

            public String getUrl() {
                return ((IlinkRequestInfo) this.instance).getUrl();
            }

            public C16994k getUrlBytes() {
                return ((IlinkRequestInfo) this.instance).getUrlBytes();
            }

            public boolean hasBody() {
                return ((IlinkRequestInfo) this.instance).hasBody();
            }

            public boolean hasCgiType() {
                return ((IlinkRequestInfo) this.instance).hasCgiType();
            }

            public boolean hasCmdid() {
                return ((IlinkRequestInfo) this.instance).hasCmdid();
            }

            public boolean hasContentType() {
                return ((IlinkRequestInfo) this.instance).hasContentType();
            }

            public boolean hasCryptoAlgo() {
                return ((IlinkRequestInfo) this.instance).hasCryptoAlgo();
            }

            public boolean hasLimitFlow() {
                return ((IlinkRequestInfo) this.instance).hasLimitFlow();
            }

            public boolean hasLimitFrequency() {
                return ((IlinkRequestInfo) this.instance).hasLimitFrequency();
            }

            public boolean hasLongPolling() {
                return ((IlinkRequestInfo) this.instance).hasLongPolling();
            }

            public boolean hasLongPollingTimeout() {
                return ((IlinkRequestInfo) this.instance).hasLongPollingTimeout();
            }

            public boolean hasNetType() {
                return ((IlinkRequestInfo) this.instance).hasNetType();
            }

            public boolean hasNetworkStatusSensitive() {
                return ((IlinkRequestInfo) this.instance).hasNetworkStatusSensitive();
            }

            public boolean hasRetryCount() {
                return ((IlinkRequestInfo) this.instance).hasRetryCount();
            }

            public boolean hasTimeoutMs() {
                return ((IlinkRequestInfo) this.instance).hasTimeoutMs();
            }

            public boolean hasUrl() {
                return ((IlinkRequestInfo) this.instance).hasUrl();
            }

            public Builder setBody(C16994k kVar) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setBody(kVar);
                return this;
            }

            public Builder setCgiType(IlinkReqCGIType ilinkReqCGIType) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setCgiType(ilinkReqCGIType);
                return this;
            }

            public Builder setCmdid(int i) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setCmdid(i);
                return this;
            }

            public Builder setContentType(IlinkContentType ilinkContentType) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setContentType(ilinkContentType);
                return this;
            }

            public Builder setCryptoAlgo(IlinkCryptoAlgo ilinkCryptoAlgo) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setCryptoAlgo(ilinkCryptoAlgo);
                return this;
            }

            public Builder setLimitFlow(boolean z) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLimitFlow(z);
                return this;
            }

            public Builder setLimitFrequency(boolean z) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLimitFrequency(z);
                return this;
            }

            public Builder setLongPolling(boolean z) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLongPolling(z);
                return this;
            }

            public Builder setLongPollingTimeout(int i) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setLongPollingTimeout(i);
                return this;
            }

            public Builder setNetType(IlinkNetType ilinkNetType) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setNetType(ilinkNetType);
                return this;
            }

            public Builder setNetworkStatusSensitive(boolean z) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setNetworkStatusSensitive(z);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setTimeoutMs(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkRequestInfo) this.instance).setUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkRequestInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkRequestInfo ilinkRequestInfo = new IlinkRequestInfo();
            DEFAULT_INSTANCE = ilinkRequestInfo;
            C23861l0.registerDefaultInstance(IlinkRequestInfo.class, ilinkRequestInfo);
        }

        private IlinkRequestInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -5;
            this.body_ = getDefaultInstance().getBody();
        }

        /* access modifiers changed from: private */
        public void clearCgiType() {
            this.bitField0_ &= -8193;
            this.cgiType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCmdid() {
            this.bitField0_ &= -2;
            this.cmdid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearContentType() {
            this.bitField0_ &= -2049;
            this.contentType_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearCryptoAlgo() {
            this.bitField0_ &= -65;
            this.cryptoAlgo_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearLimitFlow() {
            this.bitField0_ &= -129;
            this.limitFlow_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLimitFrequency() {
            this.bitField0_ &= -257;
            this.limitFrequency_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLongPolling() {
            this.bitField0_ &= -513;
            this.longPolling_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLongPollingTimeout() {
            this.bitField0_ &= -1025;
            this.longPollingTimeout_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNetType() {
            this.bitField0_ &= -33;
            this.netType_ = 1;
        }

        /* access modifiers changed from: private */
        public void clearNetworkStatusSensitive() {
            this.bitField0_ &= -4097;
            this.networkStatusSensitive_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -17;
            this.retryCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -9;
            this.timeoutMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = getDefaultInstance().getUrl();
        }

        public static IlinkRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkRequestInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkRequestInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkRequestInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkRequestInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBody(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.body_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setCgiType(IlinkReqCGIType ilinkReqCGIType) {
            this.cgiType_ = ilinkReqCGIType.getNumber();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setCmdid(int i) {
            this.bitField0_ |= 1;
            this.cmdid_ = i;
        }

        /* access modifiers changed from: private */
        public void setContentType(IlinkContentType ilinkContentType) {
            this.contentType_ = ilinkContentType.getNumber();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setCryptoAlgo(IlinkCryptoAlgo ilinkCryptoAlgo) {
            this.cryptoAlgo_ = ilinkCryptoAlgo.getNumber();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setLimitFlow(boolean z) {
            this.bitField0_ |= 128;
            this.limitFlow_ = z;
        }

        /* access modifiers changed from: private */
        public void setLimitFrequency(boolean z) {
            this.bitField0_ |= 256;
            this.limitFrequency_ = z;
        }

        /* access modifiers changed from: private */
        public void setLongPolling(boolean z) {
            this.bitField0_ |= 512;
            this.longPolling_ = z;
        }

        /* access modifiers changed from: private */
        public void setLongPollingTimeout(int i) {
            this.bitField0_ |= 1024;
            this.longPollingTimeout_ = i;
        }

        /* access modifiers changed from: private */
        public void setNetType(IlinkNetType ilinkNetType) {
            this.netType_ = ilinkNetType.getNumber();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setNetworkStatusSensitive(boolean z) {
            this.bitField0_ |= 4096;
            this.networkStatusSensitive_ = z;
        }

        /* access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.bitField0_ |= 16;
            this.retryCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 8;
            this.timeoutMs_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bင\n\fဌ\u000b\rဇ\f\u000eဌ\r", new Object[]{"bitField0_", "cmdid_", "url_", "body_", "timeoutMs_", "retryCount_", "netType_", IlinkNetType.internalGetVerifier(), "cryptoAlgo_", IlinkCryptoAlgo.internalGetVerifier(), "limitFlow_", "limitFrequency_", "longPolling_", "longPollingTimeout_", "contentType_", IlinkContentType.internalGetVerifier(), "networkStatusSensitive_", "cgiType_", IlinkReqCGIType.internalGetVerifier()});
                case 3:
                    return new IlinkRequestInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkRequestInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkRequestInfo.class) {
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

        public IlinkReqCGIType getCgiType() {
            IlinkReqCGIType forNumber = IlinkReqCGIType.forNumber(this.cgiType_);
            return forNumber == null ? IlinkReqCGIType.kIlinkCGITypeDirect : forNumber;
        }

        public int getCmdid() {
            return this.cmdid_;
        }

        public IlinkContentType getContentType() {
            IlinkContentType forNumber = IlinkContentType.forNumber(this.contentType_);
            return forNumber == null ? IlinkContentType.kIlinkContentTypeProtobuf : forNumber;
        }

        public IlinkCryptoAlgo getCryptoAlgo() {
            IlinkCryptoAlgo forNumber = IlinkCryptoAlgo.forNumber(this.cryptoAlgo_);
            return forNumber == null ? IlinkCryptoAlgo.kIlinkSession : forNumber;
        }

        public boolean getLimitFlow() {
            return this.limitFlow_;
        }

        public boolean getLimitFrequency() {
            return this.limitFrequency_;
        }

        public boolean getLongPolling() {
            return this.longPolling_;
        }

        public int getLongPollingTimeout() {
            return this.longPollingTimeout_;
        }

        public IlinkNetType getNetType() {
            IlinkNetType forNumber = IlinkNetType.forNumber(this.netType_);
            return forNumber == null ? IlinkNetType.kIlinkLonglink : forNumber;
        }

        public boolean getNetworkStatusSensitive() {
            return this.networkStatusSensitive_;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public String getUrl() {
            return this.url_;
        }

        public C16994k getUrlBytes() {
            return C16994k.m16791k(this.url_);
        }

        public boolean hasBody() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCgiType() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasCmdid() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasContentType() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasCryptoAlgo() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasLimitFlow() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasLimitFrequency() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasLongPolling() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasLongPollingTimeout() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasNetType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasNetworkStatusSensitive() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasRetryCount() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(IlinkRequestInfo ilinkRequestInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkRequestInfo);
        }

        public static IlinkRequestInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkRequestInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkRequestInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkRequestInfo parseFrom(C16994k kVar) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkRequestInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkRequestInfo parseFrom(byte[] bArr) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkRequestInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkRequestInfo parseFrom(InputStream inputStream) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkRequestInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkRequestInfo parseFrom(C23856l lVar) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkRequestInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkRequestInfoOrBuilder extends C23848k1 {
        C16994k getBody();

        IlinkReqCGIType getCgiType();

        int getCmdid();

        IlinkContentType getContentType();

        IlinkCryptoAlgo getCryptoAlgo();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getLimitFlow();

        boolean getLimitFrequency();

        boolean getLongPolling();

        int getLongPollingTimeout();

        IlinkNetType getNetType();

        boolean getNetworkStatusSensitive();

        int getRetryCount();

        int getTimeoutMs();

        String getUrl();

        C16994k getUrlBytes();

        boolean hasBody();

        boolean hasCgiType();

        boolean hasCmdid();

        boolean hasContentType();

        boolean hasCryptoAlgo();

        boolean hasLimitFlow();

        boolean hasLimitFrequency();

        boolean hasLongPolling();

        boolean hasLongPollingTimeout();

        boolean hasNetType();

        boolean hasNetworkStatusSensitive();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        boolean hasUrl();

        /* synthetic */ boolean isInitialized();
    }

    public enum IlinkRunningMode implements C23908o0.C23911c {
        kIlinkDeviceMode(0),
        kIlinkAppMode(1);
        
        private static final C23908o0.C23912d<IlinkRunningMode> internalValueMap = null;
        public static final int kIlinkAppMode_VALUE = 1;
        public static final int kIlinkDeviceMode_VALUE = 0;
        private final int value;

        public static final class IlinkRunningModeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new IlinkRunningModeVerifier();
            }

            private IlinkRunningModeVerifier() {
            }

            public boolean isInRange(int i) {
                return IlinkRunningMode.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<IlinkRunningMode>() {
                public IlinkRunningMode findValueByNumber(int i) {
                    return IlinkRunningMode.forNumber(i);
                }
            };
        }

        private IlinkRunningMode(int i) {
            this.value = i;
        }

        public static IlinkRunningMode forNumber(int i) {
            if (i == 0) {
                return kIlinkDeviceMode;
            }
            if (i != 1) {
                return null;
            }
            return kIlinkAppMode;
        }

        public static C23908o0.C23912d<IlinkRunningMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return IlinkRunningModeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static IlinkRunningMode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static final class IlinkServerIplist extends C23861l0<IlinkServerIplist, Builder> implements IlinkServerIplistOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkServerIplist DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkServerIplist> PARSER = null;
        public static final int SVR_IPLIST_FIELD_NUMBER = 1;
        private C23908o0.C23919j<String> svrIplist_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<IlinkServerIplist, Builder> implements IlinkServerIplistOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder addAllSvrIplist(Iterable<String> iterable) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).addAllSvrIplist(iterable);
                return this;
            }

            public Builder addSvrIplist(String str) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).addSvrIplist(str);
                return this;
            }

            public Builder addSvrIplistBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).addSvrIplistBytes(kVar);
                return this;
            }

            public Builder clearSvrIplist() {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).clearSvrIplist();
                return this;
            }

            public String getSvrIplist(int i) {
                return ((IlinkServerIplist) this.instance).getSvrIplist(i);
            }

            public C16994k getSvrIplistBytes(int i) {
                return ((IlinkServerIplist) this.instance).getSvrIplistBytes(i);
            }

            public int getSvrIplistCount() {
                return ((IlinkServerIplist) this.instance).getSvrIplistCount();
            }

            public List<String> getSvrIplistList() {
                return Collections.unmodifiableList(((IlinkServerIplist) this.instance).getSvrIplistList());
            }

            public Builder setSvrIplist(int i, String str) {
                copyOnWrite();
                ((IlinkServerIplist) this.instance).setSvrIplist(i, str);
                return this;
            }

            private Builder() {
                super(IlinkServerIplist.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkServerIplist ilinkServerIplist = new IlinkServerIplist();
            DEFAULT_INSTANCE = ilinkServerIplist;
            C23861l0.registerDefaultInstance(IlinkServerIplist.class, ilinkServerIplist);
        }

        private IlinkServerIplist() {
        }

        /* access modifiers changed from: private */
        public void addAllSvrIplist(Iterable<String> iterable) {
            ensureSvrIplistIsMutable();
            C23810b.addAll(iterable, this.svrIplist_);
        }

        /* access modifiers changed from: private */
        public void addSvrIplist(String str) {
            str.getClass();
            ensureSvrIplistIsMutable();
            this.svrIplist_.add(str);
        }

        /* access modifiers changed from: private */
        public void addSvrIplistBytes(C16994k kVar) {
            ensureSvrIplistIsMutable();
            this.svrIplist_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearSvrIplist() {
            this.svrIplist_ = C23861l0.emptyProtobufList();
        }

        private void ensureSvrIplistIsMutable() {
            C23908o0.C23919j<String> jVar = this.svrIplist_;
            if (!jVar.mo37523Q()) {
                this.svrIplist_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static IlinkServerIplist getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkServerIplist parseDelimitedFrom(InputStream inputStream) {
            return (IlinkServerIplist) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkServerIplist parseFrom(ByteBuffer byteBuffer) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkServerIplist> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setSvrIplist(int i, String str) {
            str.getClass();
            ensureSvrIplistIsMutable();
            this.svrIplist_.set(i, str);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"svrIplist_"});
                case 3:
                    return new IlinkServerIplist();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkServerIplist> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkServerIplist.class) {
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

        public String getSvrIplist(int i) {
            return this.svrIplist_.get(i);
        }

        public C16994k getSvrIplistBytes(int i) {
            return C16994k.m16791k(this.svrIplist_.get(i));
        }

        public int getSvrIplistCount() {
            return this.svrIplist_.size();
        }

        public List<String> getSvrIplistList() {
            return this.svrIplist_;
        }

        public static Builder newBuilder(IlinkServerIplist ilinkServerIplist) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkServerIplist);
        }

        public static IlinkServerIplist parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkServerIplist) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkServerIplist parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkServerIplist parseFrom(C16994k kVar) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkServerIplist parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkServerIplist parseFrom(byte[] bArr) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkServerIplist parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkServerIplist parseFrom(InputStream inputStream) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkServerIplist parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkServerIplist parseFrom(C23856l lVar) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkServerIplist parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkServerIplist) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkServerIplistOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getSvrIplist(int i);

        C16994k getSvrIplistBytes(int i);

        int getSvrIplistCount();

        List<String> getSvrIplistList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkSmcBaseInfo extends C23861l0<IlinkSmcBaseInfo, Builder> implements IlinkSmcBaseInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final IlinkSmcBaseInfo DEFAULT_INSTANCE;
        public static final int DEVICE_BRAND_FIELD_NUMBER = 2;
        public static final int DEVICE_MODEL_FIELD_NUMBER = 1;
        public static final int LANGUAGE_VER_FIELD_NUMBER = 5;
        public static final int OSNAME_FIELD_NUMBER = 3;
        public static final int OSVERSION_FIELD_NUMBER = 4;
        private static volatile C24062w1<IlinkSmcBaseInfo> PARSER;
        private int bitField0_;
        private String deviceBrand_ = "";
        private String deviceModel_ = "";
        private String languageVer_ = "";
        private String osname_ = "";
        private String osversion_ = "";

        public static final class Builder extends C23861l0.C23862a<IlinkSmcBaseInfo, Builder> implements IlinkSmcBaseInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearDeviceBrand() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearDeviceBrand();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearLanguageVer() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearLanguageVer();
                return this;
            }

            public Builder clearOsname() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearOsname();
                return this;
            }

            public Builder clearOsversion() {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).clearOsversion();
                return this;
            }

            public String getDeviceBrand() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceBrand();
            }

            public C16994k getDeviceBrandBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceBrandBytes();
            }

            public String getDeviceModel() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceModel();
            }

            public C16994k getDeviceModelBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getDeviceModelBytes();
            }

            public String getLanguageVer() {
                return ((IlinkSmcBaseInfo) this.instance).getLanguageVer();
            }

            public C16994k getLanguageVerBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getLanguageVerBytes();
            }

            public String getOsname() {
                return ((IlinkSmcBaseInfo) this.instance).getOsname();
            }

            public C16994k getOsnameBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getOsnameBytes();
            }

            public String getOsversion() {
                return ((IlinkSmcBaseInfo) this.instance).getOsversion();
            }

            public C16994k getOsversionBytes() {
                return ((IlinkSmcBaseInfo) this.instance).getOsversionBytes();
            }

            public boolean hasDeviceBrand() {
                return ((IlinkSmcBaseInfo) this.instance).hasDeviceBrand();
            }

            public boolean hasDeviceModel() {
                return ((IlinkSmcBaseInfo) this.instance).hasDeviceModel();
            }

            public boolean hasLanguageVer() {
                return ((IlinkSmcBaseInfo) this.instance).hasLanguageVer();
            }

            public boolean hasOsname() {
                return ((IlinkSmcBaseInfo) this.instance).hasOsname();
            }

            public boolean hasOsversion() {
                return ((IlinkSmcBaseInfo) this.instance).hasOsversion();
            }

            public Builder setDeviceBrand(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceBrand(str);
                return this;
            }

            public Builder setDeviceBrandBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceBrandBytes(kVar);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setDeviceModelBytes(kVar);
                return this;
            }

            public Builder setLanguageVer(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setLanguageVer(str);
                return this;
            }

            public Builder setLanguageVerBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setLanguageVerBytes(kVar);
                return this;
            }

            public Builder setOsname(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsname(str);
                return this;
            }

            public Builder setOsnameBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsnameBytes(kVar);
                return this;
            }

            public Builder setOsversion(String str) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsversion(str);
                return this;
            }

            public Builder setOsversionBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkSmcBaseInfo) this.instance).setOsversionBytes(kVar);
                return this;
            }

            private Builder() {
                super(IlinkSmcBaseInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkSmcBaseInfo ilinkSmcBaseInfo = new IlinkSmcBaseInfo();
            DEFAULT_INSTANCE = ilinkSmcBaseInfo;
            C23861l0.registerDefaultInstance(IlinkSmcBaseInfo.class, ilinkSmcBaseInfo);
        }

        private IlinkSmcBaseInfo() {
        }

        /* access modifiers changed from: private */
        public void clearDeviceBrand() {
            this.bitField0_ &= -3;
            this.deviceBrand_ = getDefaultInstance().getDeviceBrand();
        }

        /* access modifiers changed from: private */
        public void clearDeviceModel() {
            this.bitField0_ &= -2;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* access modifiers changed from: private */
        public void clearLanguageVer() {
            this.bitField0_ &= -17;
            this.languageVer_ = getDefaultInstance().getLanguageVer();
        }

        /* access modifiers changed from: private */
        public void clearOsname() {
            this.bitField0_ &= -5;
            this.osname_ = getDefaultInstance().getOsname();
        }

        /* access modifiers changed from: private */
        public void clearOsversion() {
            this.bitField0_ &= -9;
            this.osversion_ = getDefaultInstance().getOsversion();
        }

        public static IlinkSmcBaseInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkSmcBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (IlinkSmcBaseInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSmcBaseInfo parseFrom(ByteBuffer byteBuffer) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkSmcBaseInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDeviceBrand(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.deviceBrand_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceBrandBytes(C16994k kVar) {
            this.deviceBrand_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.deviceModel_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceModelBytes(C16994k kVar) {
            this.deviceModel_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setLanguageVer(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.languageVer_ = str;
        }

        /* access modifiers changed from: private */
        public void setLanguageVerBytes(C16994k kVar) {
            this.languageVer_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setOsname(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.osname_ = str;
        }

        /* access modifiers changed from: private */
        public void setOsnameBytes(C16994k kVar) {
            this.osname_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setOsversion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.osversion_ = str;
        }

        /* access modifiers changed from: private */
        public void setOsversionBytes(C16994k kVar) {
            this.osversion_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "deviceModel_", "deviceBrand_", "osname_", "osversion_", "languageVer_"});
                case 3:
                    return new IlinkSmcBaseInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkSmcBaseInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkSmcBaseInfo.class) {
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

        public String getDeviceBrand() {
            return this.deviceBrand_;
        }

        public C16994k getDeviceBrandBytes() {
            return C16994k.m16791k(this.deviceBrand_);
        }

        public String getDeviceModel() {
            return this.deviceModel_;
        }

        public C16994k getDeviceModelBytes() {
            return C16994k.m16791k(this.deviceModel_);
        }

        public String getLanguageVer() {
            return this.languageVer_;
        }

        public C16994k getLanguageVerBytes() {
            return C16994k.m16791k(this.languageVer_);
        }

        public String getOsname() {
            return this.osname_;
        }

        public C16994k getOsnameBytes() {
            return C16994k.m16791k(this.osname_);
        }

        public String getOsversion() {
            return this.osversion_;
        }

        public C16994k getOsversionBytes() {
            return C16994k.m16791k(this.osversion_);
        }

        public boolean hasDeviceBrand() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDeviceModel() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLanguageVer() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasOsname() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasOsversion() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkSmcBaseInfo ilinkSmcBaseInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkSmcBaseInfo);
        }

        public static IlinkSmcBaseInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkSmcBaseInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(C16994k kVar) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkSmcBaseInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(byte[] bArr) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkSmcBaseInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(InputStream inputStream) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSmcBaseInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSmcBaseInfo parseFrom(C23856l lVar) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkSmcBaseInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkSmcBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkSmcBaseInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDeviceBrand();

        C16994k getDeviceBrandBytes();

        String getDeviceModel();

        C16994k getDeviceModelBytes();

        String getLanguageVer();

        C16994k getLanguageVerBytes();

        String getOsname();

        C16994k getOsnameBytes();

        String getOsversion();

        C16994k getOsversionBytes();

        boolean hasDeviceBrand();

        boolean hasDeviceModel();

        boolean hasLanguageVer();

        boolean hasOsname();

        boolean hasOsversion();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkStartConfig extends C23861l0<IlinkStartConfig, Builder> implements IlinkStartConfigOrBuilder {
        public static final int APP_VERSION_FIELD_NUMBER = 6;
        public static final int DEBUG_IP_FIELD_NUMBER = 3;
        public static final int DEBUG_NET_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final IlinkStartConfig DEFAULT_INSTANCE;
        public static final int FILE_DIR_FIELD_NUMBER = 1;
        private static volatile C24062w1<IlinkStartConfig> PARSER = null;
        public static final int RUNNING_MODE_FIELD_NUMBER = 5;
        public static final int SELECT_DOMAIN_FIELD_NUMBER = 4;
        private int appVersion_;
        private int bitField0_;
        private String debugIp_ = "";
        private int debugNet_;
        private String fileDir_ = "";
        private int runningMode_;
        private int selectDomain_;

        public static final class Builder extends C23861l0.C23862a<IlinkStartConfig, Builder> implements IlinkStartConfigOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAppVersion() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearAppVersion();
                return this;
            }

            public Builder clearDebugIp() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearDebugIp();
                return this;
            }

            public Builder clearDebugNet() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearDebugNet();
                return this;
            }

            public Builder clearFileDir() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearFileDir();
                return this;
            }

            public Builder clearRunningMode() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearRunningMode();
                return this;
            }

            public Builder clearSelectDomain() {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).clearSelectDomain();
                return this;
            }

            public int getAppVersion() {
                return ((IlinkStartConfig) this.instance).getAppVersion();
            }

            public String getDebugIp() {
                return ((IlinkStartConfig) this.instance).getDebugIp();
            }

            public C16994k getDebugIpBytes() {
                return ((IlinkStartConfig) this.instance).getDebugIpBytes();
            }

            public int getDebugNet() {
                return ((IlinkStartConfig) this.instance).getDebugNet();
            }

            public String getFileDir() {
                return ((IlinkStartConfig) this.instance).getFileDir();
            }

            public C16994k getFileDirBytes() {
                return ((IlinkStartConfig) this.instance).getFileDirBytes();
            }

            public IlinkRunningMode getRunningMode() {
                return ((IlinkStartConfig) this.instance).getRunningMode();
            }

            public int getSelectDomain() {
                return ((IlinkStartConfig) this.instance).getSelectDomain();
            }

            public boolean hasAppVersion() {
                return ((IlinkStartConfig) this.instance).hasAppVersion();
            }

            public boolean hasDebugIp() {
                return ((IlinkStartConfig) this.instance).hasDebugIp();
            }

            public boolean hasDebugNet() {
                return ((IlinkStartConfig) this.instance).hasDebugNet();
            }

            public boolean hasFileDir() {
                return ((IlinkStartConfig) this.instance).hasFileDir();
            }

            public boolean hasRunningMode() {
                return ((IlinkStartConfig) this.instance).hasRunningMode();
            }

            public boolean hasSelectDomain() {
                return ((IlinkStartConfig) this.instance).hasSelectDomain();
            }

            public Builder setAppVersion(int i) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setAppVersion(i);
                return this;
            }

            public Builder setDebugIp(String str) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setDebugIp(str);
                return this;
            }

            public Builder setDebugIpBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setDebugIpBytes(kVar);
                return this;
            }

            public Builder setDebugNet(int i) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setDebugNet(i);
                return this;
            }

            public Builder setFileDir(String str) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setFileDir(str);
                return this;
            }

            public Builder setFileDirBytes(C16994k kVar) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setFileDirBytes(kVar);
                return this;
            }

            public Builder setRunningMode(IlinkRunningMode ilinkRunningMode) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setRunningMode(ilinkRunningMode);
                return this;
            }

            public Builder setSelectDomain(int i) {
                copyOnWrite();
                ((IlinkStartConfig) this.instance).setSelectDomain(i);
                return this;
            }

            private Builder() {
                super(IlinkStartConfig.DEFAULT_INSTANCE);
            }
        }

        static {
            IlinkStartConfig ilinkStartConfig = new IlinkStartConfig();
            DEFAULT_INSTANCE = ilinkStartConfig;
            C23861l0.registerDefaultInstance(IlinkStartConfig.class, ilinkStartConfig);
        }

        private IlinkStartConfig() {
        }

        /* access modifiers changed from: private */
        public void clearAppVersion() {
            this.bitField0_ &= -33;
            this.appVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDebugIp() {
            this.bitField0_ &= -5;
            this.debugIp_ = getDefaultInstance().getDebugIp();
        }

        /* access modifiers changed from: private */
        public void clearDebugNet() {
            this.bitField0_ &= -3;
            this.debugNet_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileDir() {
            this.bitField0_ &= -2;
            this.fileDir_ = getDefaultInstance().getFileDir();
        }

        /* access modifiers changed from: private */
        public void clearRunningMode() {
            this.bitField0_ &= -17;
            this.runningMode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSelectDomain() {
            this.bitField0_ &= -9;
            this.selectDomain_ = 0;
        }

        public static IlinkStartConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkStartConfig parseDelimitedFrom(InputStream inputStream) {
            return (IlinkStartConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkStartConfig parseFrom(ByteBuffer byteBuffer) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkStartConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppVersion(int i) {
            this.bitField0_ |= 32;
            this.appVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setDebugIp(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.debugIp_ = str;
        }

        /* access modifiers changed from: private */
        public void setDebugIpBytes(C16994k kVar) {
            this.debugIp_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setDebugNet(int i) {
            this.bitField0_ |= 2;
            this.debugNet_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileDir(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fileDir_ = str;
        }

        /* access modifiers changed from: private */
        public void setFileDirBytes(C16994k kVar) {
            this.fileDir_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setRunningMode(IlinkRunningMode ilinkRunningMode) {
            this.runningMode_ = ilinkRunningMode.getNumber();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setSelectDomain(int i) {
            this.bitField0_ |= 8;
            this.selectDomain_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဌ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "fileDir_", "debugNet_", "debugIp_", "selectDomain_", "runningMode_", IlinkRunningMode.internalGetVerifier(), "appVersion_"});
                case 3:
                    return new IlinkStartConfig();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkStartConfig> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkStartConfig.class) {
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

        public int getAppVersion() {
            return this.appVersion_;
        }

        public String getDebugIp() {
            return this.debugIp_;
        }

        public C16994k getDebugIpBytes() {
            return C16994k.m16791k(this.debugIp_);
        }

        public int getDebugNet() {
            return this.debugNet_;
        }

        public String getFileDir() {
            return this.fileDir_;
        }

        public C16994k getFileDirBytes() {
            return C16994k.m16791k(this.fileDir_);
        }

        public IlinkRunningMode getRunningMode() {
            IlinkRunningMode forNumber = IlinkRunningMode.forNumber(this.runningMode_);
            return forNumber == null ? IlinkRunningMode.kIlinkDeviceMode : forNumber;
        }

        public int getSelectDomain() {
            return this.selectDomain_;
        }

        public boolean hasAppVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDebugIp() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDebugNet() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFileDir() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasRunningMode() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSelectDomain() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(IlinkStartConfig ilinkStartConfig) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkStartConfig);
        }

        public static IlinkStartConfig parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkStartConfig) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkStartConfig parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkStartConfig parseFrom(C16994k kVar) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static IlinkStartConfig parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkStartConfig parseFrom(byte[] bArr) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkStartConfig parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkStartConfig parseFrom(InputStream inputStream) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkStartConfig parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkStartConfig parseFrom(C23856l lVar) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkStartConfig parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkStartConfig) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkStartConfigOrBuilder extends C23848k1 {
        int getAppVersion();

        String getDebugIp();

        C16994k getDebugIpBytes();

        int getDebugNet();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFileDir();

        C16994k getFileDirBytes();

        IlinkRunningMode getRunningMode();

        int getSelectDomain();

        boolean hasAppVersion();

        boolean hasDebugIp();

        boolean hasDebugNet();

        boolean hasFileDir();

        boolean hasRunningMode();

        boolean hasSelectDomain();

        /* synthetic */ boolean isInitialized();
    }

    public static final class IlinkSyncCmdList extends C23861l0<IlinkSyncCmdList, Builder> implements IlinkSyncCmdListOrBuilder {
        public static final int CMDLIST_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final IlinkSyncCmdList DEFAULT_INSTANCE;
        private static volatile C24062w1<IlinkSyncCmdList> PARSER;
        private C23908o0.C23919j<IlinkCmdItem> cmdlist_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<IlinkSyncCmdList, Builder> implements IlinkSyncCmdListOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder addAllCmdlist(Iterable<? extends IlinkCmdItem> iterable) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addAllCmdlist(iterable);
                return this;
            }

            public Builder addCmdlist(IlinkCmdItem ilinkCmdItem) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(ilinkCmdItem);
                return this;
            }

            public Builder clearCmdlist() {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).clearCmdlist();
                return this;
            }

            public IlinkCmdItem getCmdlist(int i) {
                return ((IlinkSyncCmdList) this.instance).getCmdlist(i);
            }

            public int getCmdlistCount() {
                return ((IlinkSyncCmdList) this.instance).getCmdlistCount();
            }

            public List<IlinkCmdItem> getCmdlistList() {
                return Collections.unmodifiableList(((IlinkSyncCmdList) this.instance).getCmdlistList());
            }

            public Builder removeCmdlist(int i) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).removeCmdlist(i);
                return this;
            }

            public Builder setCmdlist(int i, IlinkCmdItem ilinkCmdItem) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).setCmdlist(i, ilinkCmdItem);
                return this;
            }

            private Builder() {
                super(IlinkSyncCmdList.DEFAULT_INSTANCE);
            }

            public Builder addCmdlist(int i, IlinkCmdItem ilinkCmdItem) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(i, ilinkCmdItem);
                return this;
            }

            public Builder setCmdlist(int i, IlinkCmdItem.Builder builder) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).setCmdlist(i, (IlinkCmdItem) builder.build());
                return this;
            }

            public Builder addCmdlist(IlinkCmdItem.Builder builder) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist((IlinkCmdItem) builder.build());
                return this;
            }

            public Builder addCmdlist(int i, IlinkCmdItem.Builder builder) {
                copyOnWrite();
                ((IlinkSyncCmdList) this.instance).addCmdlist(i, (IlinkCmdItem) builder.build());
                return this;
            }
        }

        static {
            IlinkSyncCmdList ilinkSyncCmdList = new IlinkSyncCmdList();
            DEFAULT_INSTANCE = ilinkSyncCmdList;
            C23861l0.registerDefaultInstance(IlinkSyncCmdList.class, ilinkSyncCmdList);
        }

        private IlinkSyncCmdList() {
        }

        /* access modifiers changed from: private */
        public void addAllCmdlist(Iterable<? extends IlinkCmdItem> iterable) {
            ensureCmdlistIsMutable();
            C23810b.addAll(iterable, this.cmdlist_);
        }

        /* access modifiers changed from: private */
        public void addCmdlist(IlinkCmdItem ilinkCmdItem) {
            ilinkCmdItem.getClass();
            ensureCmdlistIsMutable();
            this.cmdlist_.add(ilinkCmdItem);
        }

        /* access modifiers changed from: private */
        public void clearCmdlist() {
            this.cmdlist_ = C23861l0.emptyProtobufList();
        }

        private void ensureCmdlistIsMutable() {
            C23908o0.C23919j<IlinkCmdItem> jVar = this.cmdlist_;
            if (!jVar.mo37523Q()) {
                this.cmdlist_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static IlinkSyncCmdList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static IlinkSyncCmdList parseDelimitedFrom(InputStream inputStream) {
            return (IlinkSyncCmdList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSyncCmdList parseFrom(ByteBuffer byteBuffer) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<IlinkSyncCmdList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeCmdlist(int i) {
            ensureCmdlistIsMutable();
            this.cmdlist_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCmdlist(int i, IlinkCmdItem ilinkCmdItem) {
            ilinkCmdItem.getClass();
            ensureCmdlistIsMutable();
            this.cmdlist_.set(i, ilinkCmdItem);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"cmdlist_", IlinkCmdItem.class});
                case 3:
                    return new IlinkSyncCmdList();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<IlinkSyncCmdList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (IlinkSyncCmdList.class) {
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

        public IlinkCmdItem getCmdlist(int i) {
            return this.cmdlist_.get(i);
        }

        public int getCmdlistCount() {
            return this.cmdlist_.size();
        }

        public List<IlinkCmdItem> getCmdlistList() {
            return this.cmdlist_;
        }

        public IlinkCmdItemOrBuilder getCmdlistOrBuilder(int i) {
            return this.cmdlist_.get(i);
        }

        public List<? extends IlinkCmdItemOrBuilder> getCmdlistOrBuilderList() {
            return this.cmdlist_;
        }

        public static Builder newBuilder(IlinkSyncCmdList ilinkSyncCmdList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(ilinkSyncCmdList);
        }

        public static IlinkSyncCmdList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkSyncCmdList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(C16994k kVar) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addCmdlist(int i, IlinkCmdItem ilinkCmdItem) {
            ilinkCmdItem.getClass();
            ensureCmdlistIsMutable();
            this.cmdlist_.add(i, ilinkCmdItem);
        }

        public static IlinkSyncCmdList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(byte[] bArr) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static IlinkSyncCmdList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(InputStream inputStream) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static IlinkSyncCmdList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static IlinkSyncCmdList parseFrom(C23856l lVar) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static IlinkSyncCmdList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (IlinkSyncCmdList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface IlinkSyncCmdListOrBuilder extends C23848k1 {
        IlinkCmdItem getCmdlist(int i);

        int getCmdlistCount();

        List<IlinkCmdItem> getCmdlistList();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        /* synthetic */ boolean isInitialized();
    }

    public static final class ResourceRequestInfo extends C23861l0<ResourceRequestInfo, Builder> implements ResourceRequestInfoOrBuilder {
        public static final int APP_REQ_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final ResourceRequestInfo DEFAULT_INSTANCE;
        public static final int LIMIT_FLOW_FIELD_NUMBER = 4;
        public static final int LIMIT_FREQUENCY_FIELD_NUMBER = 5;
        private static volatile C24062w1<ResourceRequestInfo> PARSER = null;
        public static final int RETRY_COUNT_FIELD_NUMBER = 3;
        public static final int TIMEOUT_MS_FIELD_NUMBER = 2;
        private C16994k appReq_ = C16994k.f46000e;
        private int bitField0_;
        private boolean limitFlow_;
        private boolean limitFrequency_;
        private int retryCount_;
        private int timeoutMs_;

        public static final class Builder extends C23861l0.C23862a<ResourceRequestInfo, Builder> implements ResourceRequestInfoOrBuilder {
            public /* synthetic */ Builder(C241181 r1) {
                this();
            }

            public Builder clearAppReq() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearAppReq();
                return this;
            }

            public Builder clearLimitFlow() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearLimitFlow();
                return this;
            }

            public Builder clearLimitFrequency() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearLimitFrequency();
                return this;
            }

            public Builder clearRetryCount() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearRetryCount();
                return this;
            }

            public Builder clearTimeoutMs() {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).clearTimeoutMs();
                return this;
            }

            public C16994k getAppReq() {
                return ((ResourceRequestInfo) this.instance).getAppReq();
            }

            public boolean getLimitFlow() {
                return ((ResourceRequestInfo) this.instance).getLimitFlow();
            }

            public boolean getLimitFrequency() {
                return ((ResourceRequestInfo) this.instance).getLimitFrequency();
            }

            public int getRetryCount() {
                return ((ResourceRequestInfo) this.instance).getRetryCount();
            }

            public int getTimeoutMs() {
                return ((ResourceRequestInfo) this.instance).getTimeoutMs();
            }

            public boolean hasAppReq() {
                return ((ResourceRequestInfo) this.instance).hasAppReq();
            }

            public boolean hasLimitFlow() {
                return ((ResourceRequestInfo) this.instance).hasLimitFlow();
            }

            public boolean hasLimitFrequency() {
                return ((ResourceRequestInfo) this.instance).hasLimitFrequency();
            }

            public boolean hasRetryCount() {
                return ((ResourceRequestInfo) this.instance).hasRetryCount();
            }

            public boolean hasTimeoutMs() {
                return ((ResourceRequestInfo) this.instance).hasTimeoutMs();
            }

            public Builder setAppReq(C16994k kVar) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setAppReq(kVar);
                return this;
            }

            public Builder setLimitFlow(boolean z) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setLimitFlow(z);
                return this;
            }

            public Builder setLimitFrequency(boolean z) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setLimitFrequency(z);
                return this;
            }

            public Builder setRetryCount(int i) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setRetryCount(i);
                return this;
            }

            public Builder setTimeoutMs(int i) {
                copyOnWrite();
                ((ResourceRequestInfo) this.instance).setTimeoutMs(i);
                return this;
            }

            private Builder() {
                super(ResourceRequestInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            ResourceRequestInfo resourceRequestInfo = new ResourceRequestInfo();
            DEFAULT_INSTANCE = resourceRequestInfo;
            C23861l0.registerDefaultInstance(ResourceRequestInfo.class, resourceRequestInfo);
        }

        private ResourceRequestInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAppReq() {
            this.bitField0_ &= -2;
            this.appReq_ = getDefaultInstance().getAppReq();
        }

        /* access modifiers changed from: private */
        public void clearLimitFlow() {
            this.bitField0_ &= -9;
            this.limitFlow_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLimitFrequency() {
            this.bitField0_ &= -17;
            this.limitFrequency_ = false;
        }

        /* access modifiers changed from: private */
        public void clearRetryCount() {
            this.bitField0_ &= -5;
            this.retryCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTimeoutMs() {
            this.bitField0_ &= -3;
            this.timeoutMs_ = 0;
        }

        public static ResourceRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ResourceRequestInfo parseDelimitedFrom(InputStream inputStream) {
            return (ResourceRequestInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceRequestInfo parseFrom(ByteBuffer byteBuffer) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<ResourceRequestInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAppReq(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1;
            this.appReq_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setLimitFlow(boolean z) {
            this.bitField0_ |= 8;
            this.limitFlow_ = z;
        }

        /* access modifiers changed from: private */
        public void setLimitFrequency(boolean z) {
            this.bitField0_ |= 16;
            this.limitFrequency_ = z;
        }

        /* access modifiers changed from: private */
        public void setRetryCount(int i) {
            this.bitField0_ |= 4;
            this.retryCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setTimeoutMs(int i) {
            this.bitField0_ |= 2;
            this.timeoutMs_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "appReq_", "timeoutMs_", "retryCount_", "limitFlow_", "limitFrequency_"});
                case 3:
                    return new ResourceRequestInfo();
                case 4:
                    return new Builder((C241181) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<ResourceRequestInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ResourceRequestInfo.class) {
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

        public C16994k getAppReq() {
            return this.appReq_;
        }

        public boolean getLimitFlow() {
            return this.limitFlow_;
        }

        public boolean getLimitFrequency() {
            return this.limitFrequency_;
        }

        public int getRetryCount() {
            return this.retryCount_;
        }

        public int getTimeoutMs() {
            return this.timeoutMs_;
        }

        public boolean hasAppReq() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLimitFlow() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasLimitFrequency() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasRetryCount() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTimeoutMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(ResourceRequestInfo resourceRequestInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(resourceRequestInfo);
        }

        public static ResourceRequestInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ResourceRequestInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ResourceRequestInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ResourceRequestInfo parseFrom(C16994k kVar) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ResourceRequestInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ResourceRequestInfo parseFrom(byte[] bArr) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourceRequestInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ResourceRequestInfo parseFrom(InputStream inputStream) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceRequestInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ResourceRequestInfo parseFrom(C23856l lVar) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ResourceRequestInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ResourceRequestInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface ResourceRequestInfoOrBuilder extends C23848k1 {
        C16994k getAppReq();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getLimitFlow();

        boolean getLimitFrequency();

        int getRetryCount();

        int getTimeoutMs();

        boolean hasAppReq();

        boolean hasLimitFlow();

        boolean hasLimitFrequency();

        boolean hasRetryCount();

        boolean hasTimeoutMs();

        /* synthetic */ boolean isInitialized();
    }

    private Proto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
