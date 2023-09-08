package com.tencent.wechat.aff.finder;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24062w1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import com.tencent.wechat.aff.ting.MMBaseProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class FinderProto {

    /* renamed from: com.tencent.wechat.aff.finder.FinderProto$1 */
    public static /* synthetic */ class C243071 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69809xa1df5c61;

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
                f69809xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69809xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69809xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69809xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69809xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69809xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69809xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.finder.FinderProto.C243071.<clinit>():void");
        }
    }

    public static final class ClientContextInfo extends C23861l0<ClientContextInfo, Builder> implements ClientContextInfoOrBuilder {
        public static final int CLICKTABCONTEXTID_FIELD_NUMBER = 2;
        public static final int CLIENTREPORTBUFF_FIELD_NUMBER = 3;
        public static final int CONTEXTID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final ClientContextInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<ClientContextInfo> PARSER;
        private int bitField0_;
        private String clickTabContextId_ = "";
        private String clientReportBuff_ = "";
        private String contextId_ = "";

        public static final class Builder extends C23861l0.C23862a<ClientContextInfo, Builder> implements ClientContextInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearClickTabContextId() {
                copyOnWrite();
                ((ClientContextInfo) this.instance).clearClickTabContextId();
                return this;
            }

            public Builder clearClientReportBuff() {
                copyOnWrite();
                ((ClientContextInfo) this.instance).clearClientReportBuff();
                return this;
            }

            public Builder clearContextId() {
                copyOnWrite();
                ((ClientContextInfo) this.instance).clearContextId();
                return this;
            }

            public String getClickTabContextId() {
                return ((ClientContextInfo) this.instance).getClickTabContextId();
            }

            public C16994k getClickTabContextIdBytes() {
                return ((ClientContextInfo) this.instance).getClickTabContextIdBytes();
            }

            public String getClientReportBuff() {
                return ((ClientContextInfo) this.instance).getClientReportBuff();
            }

            public C16994k getClientReportBuffBytes() {
                return ((ClientContextInfo) this.instance).getClientReportBuffBytes();
            }

            public String getContextId() {
                return ((ClientContextInfo) this.instance).getContextId();
            }

            public C16994k getContextIdBytes() {
                return ((ClientContextInfo) this.instance).getContextIdBytes();
            }

            public boolean hasClickTabContextId() {
                return ((ClientContextInfo) this.instance).hasClickTabContextId();
            }

            public boolean hasClientReportBuff() {
                return ((ClientContextInfo) this.instance).hasClientReportBuff();
            }

            public boolean hasContextId() {
                return ((ClientContextInfo) this.instance).hasContextId();
            }

            public Builder setClickTabContextId(String str) {
                copyOnWrite();
                ((ClientContextInfo) this.instance).setClickTabContextId(str);
                return this;
            }

            public Builder setClickTabContextIdBytes(C16994k kVar) {
                copyOnWrite();
                ((ClientContextInfo) this.instance).setClickTabContextIdBytes(kVar);
                return this;
            }

            public Builder setClientReportBuff(String str) {
                copyOnWrite();
                ((ClientContextInfo) this.instance).setClientReportBuff(str);
                return this;
            }

            public Builder setClientReportBuffBytes(C16994k kVar) {
                copyOnWrite();
                ((ClientContextInfo) this.instance).setClientReportBuffBytes(kVar);
                return this;
            }

            public Builder setContextId(String str) {
                copyOnWrite();
                ((ClientContextInfo) this.instance).setContextId(str);
                return this;
            }

            public Builder setContextIdBytes(C16994k kVar) {
                copyOnWrite();
                ((ClientContextInfo) this.instance).setContextIdBytes(kVar);
                return this;
            }

            private Builder() {
                super(ClientContextInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            ClientContextInfo clientContextInfo = new ClientContextInfo();
            DEFAULT_INSTANCE = clientContextInfo;
            C23861l0.registerDefaultInstance(ClientContextInfo.class, clientContextInfo);
        }

        private ClientContextInfo() {
        }

        /* access modifiers changed from: private */
        public void clearClickTabContextId() {
            this.bitField0_ &= -3;
            this.clickTabContextId_ = getDefaultInstance().getClickTabContextId();
        }

        /* access modifiers changed from: private */
        public void clearClientReportBuff() {
            this.bitField0_ &= -5;
            this.clientReportBuff_ = getDefaultInstance().getClientReportBuff();
        }

        /* access modifiers changed from: private */
        public void clearContextId() {
            this.bitField0_ &= -2;
            this.contextId_ = getDefaultInstance().getContextId();
        }

        public static ClientContextInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static ClientContextInfo parseDelimitedFrom(InputStream inputStream) {
            return (ClientContextInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientContextInfo parseFrom(ByteBuffer byteBuffer) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<ClientContextInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClickTabContextId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.clickTabContextId_ = str;
        }

        /* access modifiers changed from: private */
        public void setClickTabContextIdBytes(C16994k kVar) {
            this.clickTabContextId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setClientReportBuff(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.clientReportBuff_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientReportBuffBytes(C16994k kVar) {
            this.clientReportBuff_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setContextId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.contextId_ = str;
        }

        /* access modifiers changed from: private */
        public void setContextIdBytes(C16994k kVar) {
            this.contextId_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "contextId_", "clickTabContextId_", "clientReportBuff_"});
                case 3:
                    return new ClientContextInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<ClientContextInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (ClientContextInfo.class) {
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

        public String getClickTabContextId() {
            return this.clickTabContextId_;
        }

        public C16994k getClickTabContextIdBytes() {
            return C16994k.m16791k(this.clickTabContextId_);
        }

        public String getClientReportBuff() {
            return this.clientReportBuff_;
        }

        public C16994k getClientReportBuffBytes() {
            return C16994k.m16791k(this.clientReportBuff_);
        }

        public String getContextId() {
            return this.contextId_;
        }

        public C16994k getContextIdBytes() {
            return C16994k.m16791k(this.contextId_);
        }

        public boolean hasClickTabContextId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasClientReportBuff() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasContextId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ClientContextInfo clientContextInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(clientContextInfo);
        }

        public static ClientContextInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ClientContextInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ClientContextInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static ClientContextInfo parseFrom(C16994k kVar) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static ClientContextInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static ClientContextInfo parseFrom(byte[] bArr) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ClientContextInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static ClientContextInfo parseFrom(InputStream inputStream) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ClientContextInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static ClientContextInfo parseFrom(C23856l lVar) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static ClientContextInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (ClientContextInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface ClientContextInfoOrBuilder extends C23848k1 {
        String getClickTabContextId();

        C16994k getClickTabContextIdBytes();

        String getClientReportBuff();

        C16994k getClientReportBuffBytes();

        String getContextId();

        C16994k getContextIdBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasClickTabContextId();

        boolean hasClientReportBuff();

        boolean hasContextId();

        /* synthetic */ boolean isInitialized();
    }

    public static final class DownloadSpeed extends C23861l0<DownloadSpeed, Builder> implements DownloadSpeedOrBuilder {
        public static final int CLIENT_IP_FIELD_NUMBER = 6;
        public static final int COST_MS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final DownloadSpeed DEFAULT_INSTANCE;
        public static final int END_TIME_FIELD_NUMBER = 4;
        public static final int NETWORK_ID_FIELD_NUMBER = 7;
        public static final int NET_TYPE_FIELD_NUMBER = 5;
        private static volatile C24062w1<DownloadSpeed> PARSER = null;
        public static final int SERVER_IP_FIELD_NUMBER = 8;
        public static final int SIZE_BYTE_FIELD_NUMBER = 1;
        public static final int START_TIME_FIELD_NUMBER = 3;
        private int bitField0_;
        private String clientIp_ = "";
        private long costMs_;
        private long endTime_;
        private int netType_;
        private int networkId_;
        private String serverIp_ = "";
        private long sizeByte_;
        private long startTime_;

        public static final class Builder extends C23861l0.C23862a<DownloadSpeed, Builder> implements DownloadSpeedOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearClientIp() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearClientIp();
                return this;
            }

            public Builder clearCostMs() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearCostMs();
                return this;
            }

            public Builder clearEndTime() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearEndTime();
                return this;
            }

            public Builder clearNetType() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearNetType();
                return this;
            }

            public Builder clearNetworkId() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearNetworkId();
                return this;
            }

            public Builder clearServerIp() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearServerIp();
                return this;
            }

            public Builder clearSizeByte() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearSizeByte();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((DownloadSpeed) this.instance).clearStartTime();
                return this;
            }

            public String getClientIp() {
                return ((DownloadSpeed) this.instance).getClientIp();
            }

            public C16994k getClientIpBytes() {
                return ((DownloadSpeed) this.instance).getClientIpBytes();
            }

            public long getCostMs() {
                return ((DownloadSpeed) this.instance).getCostMs();
            }

            public long getEndTime() {
                return ((DownloadSpeed) this.instance).getEndTime();
            }

            public int getNetType() {
                return ((DownloadSpeed) this.instance).getNetType();
            }

            public int getNetworkId() {
                return ((DownloadSpeed) this.instance).getNetworkId();
            }

            public String getServerIp() {
                return ((DownloadSpeed) this.instance).getServerIp();
            }

            public C16994k getServerIpBytes() {
                return ((DownloadSpeed) this.instance).getServerIpBytes();
            }

            public long getSizeByte() {
                return ((DownloadSpeed) this.instance).getSizeByte();
            }

            public long getStartTime() {
                return ((DownloadSpeed) this.instance).getStartTime();
            }

            public boolean hasClientIp() {
                return ((DownloadSpeed) this.instance).hasClientIp();
            }

            public boolean hasCostMs() {
                return ((DownloadSpeed) this.instance).hasCostMs();
            }

            public boolean hasEndTime() {
                return ((DownloadSpeed) this.instance).hasEndTime();
            }

            public boolean hasNetType() {
                return ((DownloadSpeed) this.instance).hasNetType();
            }

            public boolean hasNetworkId() {
                return ((DownloadSpeed) this.instance).hasNetworkId();
            }

            public boolean hasServerIp() {
                return ((DownloadSpeed) this.instance).hasServerIp();
            }

            public boolean hasSizeByte() {
                return ((DownloadSpeed) this.instance).hasSizeByte();
            }

            public boolean hasStartTime() {
                return ((DownloadSpeed) this.instance).hasStartTime();
            }

            public Builder setClientIp(String str) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setClientIp(str);
                return this;
            }

            public Builder setClientIpBytes(C16994k kVar) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setClientIpBytes(kVar);
                return this;
            }

            public Builder setCostMs(long j) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setCostMs(j);
                return this;
            }

            public Builder setEndTime(long j) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setEndTime(j);
                return this;
            }

            public Builder setNetType(int i) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setNetType(i);
                return this;
            }

            public Builder setNetworkId(int i) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setNetworkId(i);
                return this;
            }

            public Builder setServerIp(String str) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setServerIp(str);
                return this;
            }

            public Builder setServerIpBytes(C16994k kVar) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setServerIpBytes(kVar);
                return this;
            }

            public Builder setSizeByte(long j) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setSizeByte(j);
                return this;
            }

            public Builder setStartTime(long j) {
                copyOnWrite();
                ((DownloadSpeed) this.instance).setStartTime(j);
                return this;
            }

            private Builder() {
                super(DownloadSpeed.DEFAULT_INSTANCE);
            }
        }

        public enum NetType implements C23908o0.C23911c {
            NET_NULL(0),
            NET_WIFI(1),
            NET_2G(2),
            NET_3G(3),
            NET_4G(4),
            NET_5G(5);
            
            public static final int NET_2G_VALUE = 2;
            public static final int NET_3G_VALUE = 3;
            public static final int NET_4G_VALUE = 4;
            public static final int NET_5G_VALUE = 5;
            public static final int NET_NULL_VALUE = 0;
            public static final int NET_WIFI_VALUE = 1;
            private static final C23908o0.C23912d<NetType> internalValueMap = null;
            private final int value;

            public static final class NetTypeVerifier implements C23908o0.C23913e {
                public static final C23908o0.C23913e INSTANCE = null;

                static {
                    INSTANCE = new NetTypeVerifier();
                }

                private NetTypeVerifier() {
                }

                public boolean isInRange(int i) {
                    return NetType.forNumber(i) != null;
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new C23908o0.C23912d<NetType>() {
                    public NetType findValueByNumber(int i) {
                        return NetType.forNumber(i);
                    }
                };
            }

            private NetType(int i) {
                this.value = i;
            }

            public static NetType forNumber(int i) {
                if (i == 0) {
                    return NET_NULL;
                }
                if (i == 1) {
                    return NET_WIFI;
                }
                if (i == 2) {
                    return NET_2G;
                }
                if (i == 3) {
                    return NET_3G;
                }
                if (i == 4) {
                    return NET_4G;
                }
                if (i != 5) {
                    return null;
                }
                return NET_5G;
            }

            public static C23908o0.C23912d<NetType> internalGetValueMap() {
                return internalValueMap;
            }

            public static C23908o0.C23913e internalGetVerifier() {
                return NetTypeVerifier.INSTANCE;
            }

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static NetType valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            DownloadSpeed downloadSpeed = new DownloadSpeed();
            DEFAULT_INSTANCE = downloadSpeed;
            C23861l0.registerDefaultInstance(DownloadSpeed.class, downloadSpeed);
        }

        private DownloadSpeed() {
        }

        /* access modifiers changed from: private */
        public void clearClientIp() {
            this.bitField0_ &= -33;
            this.clientIp_ = getDefaultInstance().getClientIp();
        }

        /* access modifiers changed from: private */
        public void clearCostMs() {
            this.bitField0_ &= -3;
            this.costMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEndTime() {
            this.bitField0_ &= -9;
            this.endTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNetType() {
            this.bitField0_ &= -17;
            this.netType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNetworkId() {
            this.bitField0_ &= -65;
            this.networkId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearServerIp() {
            this.bitField0_ &= -129;
            this.serverIp_ = getDefaultInstance().getServerIp();
        }

        /* access modifiers changed from: private */
        public void clearSizeByte() {
            this.bitField0_ &= -2;
            this.sizeByte_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -5;
            this.startTime_ = 0;
        }

        public static DownloadSpeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DownloadSpeed parseDelimitedFrom(InputStream inputStream) {
            return (DownloadSpeed) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DownloadSpeed parseFrom(ByteBuffer byteBuffer) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<DownloadSpeed> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClientIp(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.clientIp_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientIpBytes(C16994k kVar) {
            this.clientIp_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setCostMs(long j) {
            this.bitField0_ |= 2;
            this.costMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setEndTime(long j) {
            this.bitField0_ |= 8;
            this.endTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setNetType(int i) {
            this.bitField0_ |= 16;
            this.netType_ = i;
        }

        /* access modifiers changed from: private */
        public void setNetworkId(int i) {
            this.bitField0_ |= 64;
            this.networkId_ = i;
        }

        /* access modifiers changed from: private */
        public void setServerIp(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.serverIp_ = str;
        }

        /* access modifiers changed from: private */
        public void setServerIpBytes(C16994k kVar) {
            this.serverIp_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setSizeByte(long j) {
            this.bitField0_ |= 1;
            this.sizeByte_ = j;
        }

        /* access modifiers changed from: private */
        public void setStartTime(long j) {
            this.bitField0_ |= 4;
            this.startTime_ = j;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဈ\u0005\u0007ဋ\u0006\bဈ\u0007", new Object[]{"bitField0_", "sizeByte_", "costMs_", "startTime_", "endTime_", "netType_", "clientIp_", "networkId_", "serverIp_"});
                case 3:
                    return new DownloadSpeed();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<DownloadSpeed> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (DownloadSpeed.class) {
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

        public String getClientIp() {
            return this.clientIp_;
        }

        public C16994k getClientIpBytes() {
            return C16994k.m16791k(this.clientIp_);
        }

        public long getCostMs() {
            return this.costMs_;
        }

        public long getEndTime() {
            return this.endTime_;
        }

        public int getNetType() {
            return this.netType_;
        }

        public int getNetworkId() {
            return this.networkId_;
        }

        public String getServerIp() {
            return this.serverIp_;
        }

        public C16994k getServerIpBytes() {
            return C16994k.m16791k(this.serverIp_);
        }

        public long getSizeByte() {
            return this.sizeByte_;
        }

        public long getStartTime() {
            return this.startTime_;
        }

        public boolean hasClientIp() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasCostMs() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasEndTime() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasNetType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasNetworkId() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasServerIp() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSizeByte() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasStartTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(DownloadSpeed downloadSpeed) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(downloadSpeed);
        }

        public static DownloadSpeed parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DownloadSpeed) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DownloadSpeed parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static DownloadSpeed parseFrom(C16994k kVar) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static DownloadSpeed parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static DownloadSpeed parseFrom(byte[] bArr) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DownloadSpeed parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static DownloadSpeed parseFrom(InputStream inputStream) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DownloadSpeed parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DownloadSpeed parseFrom(C23856l lVar) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static DownloadSpeed parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (DownloadSpeed) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface DownloadSpeedOrBuilder extends C23848k1 {
        String getClientIp();

        C16994k getClientIpBytes();

        long getCostMs();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getEndTime();

        int getNetType();

        int getNetworkId();

        String getServerIp();

        C16994k getServerIpBytes();

        long getSizeByte();

        long getStartTime();

        boolean hasClientIp();

        boolean hasCostMs();

        boolean hasEndTime();

        boolean hasNetType();

        boolean hasNetworkId();

        boolean hasServerIp();

        boolean hasSizeByte();

        boolean hasStartTime();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderAdBaseRequest extends C23861l0<FinderAdBaseRequest, Builder> implements FinderAdBaseRequestOrBuilder {
        public static final int CARRIER_FIELD_NUMBER = 4;
        public static final int CONNECT_TYPE_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final FinderAdBaseRequest DEFAULT_INSTANCE;
        public static final int DEVICE_INFO_FIELD_NUMBER = 1;
        private static volatile C24062w1<FinderAdBaseRequest> PARSER = null;
        public static final int SUPPORT_FLAG_FIELD_NUMBER = 5;
        public static final int USER_AGENT_FIELD_NUMBER = 2;
        private int bitField0_;
        private int carrier_;
        private int connectType_;
        private String deviceInfo_ = "";
        private int supportFlag_;
        private String userAgent_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderAdBaseRequest, Builder> implements FinderAdBaseRequestOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearCarrier() {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).clearCarrier();
                return this;
            }

            public Builder clearConnectType() {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).clearConnectType();
                return this;
            }

            public Builder clearDeviceInfo() {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).clearDeviceInfo();
                return this;
            }

            public Builder clearSupportFlag() {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).clearSupportFlag();
                return this;
            }

            public Builder clearUserAgent() {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).clearUserAgent();
                return this;
            }

            public int getCarrier() {
                return ((FinderAdBaseRequest) this.instance).getCarrier();
            }

            public int getConnectType() {
                return ((FinderAdBaseRequest) this.instance).getConnectType();
            }

            public String getDeviceInfo() {
                return ((FinderAdBaseRequest) this.instance).getDeviceInfo();
            }

            public C16994k getDeviceInfoBytes() {
                return ((FinderAdBaseRequest) this.instance).getDeviceInfoBytes();
            }

            public int getSupportFlag() {
                return ((FinderAdBaseRequest) this.instance).getSupportFlag();
            }

            public String getUserAgent() {
                return ((FinderAdBaseRequest) this.instance).getUserAgent();
            }

            public C16994k getUserAgentBytes() {
                return ((FinderAdBaseRequest) this.instance).getUserAgentBytes();
            }

            public boolean hasCarrier() {
                return ((FinderAdBaseRequest) this.instance).hasCarrier();
            }

            public boolean hasConnectType() {
                return ((FinderAdBaseRequest) this.instance).hasConnectType();
            }

            public boolean hasDeviceInfo() {
                return ((FinderAdBaseRequest) this.instance).hasDeviceInfo();
            }

            public boolean hasSupportFlag() {
                return ((FinderAdBaseRequest) this.instance).hasSupportFlag();
            }

            public boolean hasUserAgent() {
                return ((FinderAdBaseRequest) this.instance).hasUserAgent();
            }

            public Builder setCarrier(int i) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setCarrier(i);
                return this;
            }

            public Builder setConnectType(int i) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setConnectType(i);
                return this;
            }

            public Builder setDeviceInfo(String str) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setDeviceInfo(str);
                return this;
            }

            public Builder setDeviceInfoBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setDeviceInfoBytes(kVar);
                return this;
            }

            public Builder setSupportFlag(int i) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setSupportFlag(i);
                return this;
            }

            public Builder setUserAgent(String str) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setUserAgent(str);
                return this;
            }

            public Builder setUserAgentBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderAdBaseRequest) this.instance).setUserAgentBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderAdBaseRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderAdBaseRequest finderAdBaseRequest = new FinderAdBaseRequest();
            DEFAULT_INSTANCE = finderAdBaseRequest;
            C23861l0.registerDefaultInstance(FinderAdBaseRequest.class, finderAdBaseRequest);
        }

        private FinderAdBaseRequest() {
        }

        /* access modifiers changed from: private */
        public void clearCarrier() {
            this.bitField0_ &= -9;
            this.carrier_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearConnectType() {
            this.bitField0_ &= -5;
            this.connectType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeviceInfo() {
            this.bitField0_ &= -2;
            this.deviceInfo_ = getDefaultInstance().getDeviceInfo();
        }

        /* access modifiers changed from: private */
        public void clearSupportFlag() {
            this.bitField0_ &= -17;
            this.supportFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserAgent() {
            this.bitField0_ &= -3;
            this.userAgent_ = getDefaultInstance().getUserAgent();
        }

        public static FinderAdBaseRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderAdBaseRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderAdBaseRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderAdBaseRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderAdBaseRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCarrier(int i) {
            this.bitField0_ |= 8;
            this.carrier_ = i;
        }

        /* access modifiers changed from: private */
        public void setConnectType(int i) {
            this.bitField0_ |= 4;
            this.connectType_ = i;
        }

        /* access modifiers changed from: private */
        public void setDeviceInfo(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.deviceInfo_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceInfoBytes(C16994k kVar) {
            this.deviceInfo_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setSupportFlag(int i) {
            this.bitField0_ |= 16;
            this.supportFlag_ = i;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"bitField0_", "deviceInfo_", "userAgent_", "connectType_", "carrier_", "supportFlag_"});
                case 3:
                    return new FinderAdBaseRequest();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderAdBaseRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderAdBaseRequest.class) {
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

        public int getCarrier() {
            return this.carrier_;
        }

        public int getConnectType() {
            return this.connectType_;
        }

        public String getDeviceInfo() {
            return this.deviceInfo_;
        }

        public C16994k getDeviceInfoBytes() {
            return C16994k.m16791k(this.deviceInfo_);
        }

        public int getSupportFlag() {
            return this.supportFlag_;
        }

        public String getUserAgent() {
            return this.userAgent_;
        }

        public C16994k getUserAgentBytes() {
            return C16994k.m16791k(this.userAgent_);
        }

        public boolean hasCarrier() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasConnectType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDeviceInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSupportFlag() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUserAgent() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderAdBaseRequest finderAdBaseRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderAdBaseRequest);
        }

        public static FinderAdBaseRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderAdBaseRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderAdBaseRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderAdBaseRequest parseFrom(C16994k kVar) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderAdBaseRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderAdBaseRequest parseFrom(byte[] bArr) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderAdBaseRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderAdBaseRequest parseFrom(InputStream inputStream) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderAdBaseRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderAdBaseRequest parseFrom(C23856l lVar) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderAdBaseRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderAdBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderAdBaseRequestOrBuilder extends C23848k1 {
        int getCarrier();

        int getConnectType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDeviceInfo();

        C16994k getDeviceInfoBytes();

        int getSupportFlag();

        String getUserAgent();

        C16994k getUserAgentBytes();

        boolean hasCarrier();

        boolean hasConnectType();

        boolean hasDeviceInfo();

        boolean hasSupportFlag();

        boolean hasUserAgent();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderBaseRequest extends C23861l0<FinderBaseRequest, Builder> implements FinderBaseRequestOrBuilder {
        public static final int AD_BASEREQ_FIELD_NUMBER = 11;
        public static final int CLIENT_FLAG_FIELD_NUMBER = 10;
        public static final int CTXINFO_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final FinderBaseRequest DEFAULT_INSTANCE;
        public static final int EXPTFLAG_FIELD_NUMBER = 4;
        public static final int EXTSPAMINFO_FIELD_NUMBER = 3;
        public static final int LIVE_IDENTITY_FIELD_NUMBER = 7;
        public static final int OBJECT_BASE_INFOS_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderBaseRequest> PARSER = null;
        public static final int REQUESTID_FIELD_NUMBER = 6;
        public static final int SCENE_FIELD_NUMBER = 2;
        public static final int USERVERSION_FIELD_NUMBER = 1;
        private FinderAdBaseRequest adBasereq_;
        private int bitField0_;
        private int clientFlag_;
        private ClientContextInfo ctxInfo_;
        private int exptFlag_;
        private C16994k extSpamInfo_ = C16994k.f46000e;
        private int liveIdentity_;
        private C23908o0.C23919j<FinderObjectBaseInfo> objectBaseInfos_ = C23861l0.emptyProtobufList();
        private long requestId_;
        private int scene_;
        private int userVersion_;

        public static final class Builder extends C23861l0.C23862a<FinderBaseRequest, Builder> implements FinderBaseRequestOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllObjectBaseInfos(Iterable<? extends FinderObjectBaseInfo> iterable) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).addAllObjectBaseInfos(iterable);
                return this;
            }

            public Builder addObjectBaseInfos(FinderObjectBaseInfo finderObjectBaseInfo) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).addObjectBaseInfos(finderObjectBaseInfo);
                return this;
            }

            public Builder clearAdBasereq() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearAdBasereq();
                return this;
            }

            public Builder clearClientFlag() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearClientFlag();
                return this;
            }

            public Builder clearCtxInfo() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearCtxInfo();
                return this;
            }

            public Builder clearExptFlag() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearExptFlag();
                return this;
            }

            public Builder clearExtSpamInfo() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearExtSpamInfo();
                return this;
            }

            public Builder clearLiveIdentity() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearLiveIdentity();
                return this;
            }

            public Builder clearObjectBaseInfos() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearObjectBaseInfos();
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearRequestId();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearScene();
                return this;
            }

            public Builder clearUserVersion() {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).clearUserVersion();
                return this;
            }

            public FinderAdBaseRequest getAdBasereq() {
                return ((FinderBaseRequest) this.instance).getAdBasereq();
            }

            public int getClientFlag() {
                return ((FinderBaseRequest) this.instance).getClientFlag();
            }

            public ClientContextInfo getCtxInfo() {
                return ((FinderBaseRequest) this.instance).getCtxInfo();
            }

            public int getExptFlag() {
                return ((FinderBaseRequest) this.instance).getExptFlag();
            }

            public C16994k getExtSpamInfo() {
                return ((FinderBaseRequest) this.instance).getExtSpamInfo();
            }

            public int getLiveIdentity() {
                return ((FinderBaseRequest) this.instance).getLiveIdentity();
            }

            public FinderObjectBaseInfo getObjectBaseInfos(int i) {
                return ((FinderBaseRequest) this.instance).getObjectBaseInfos(i);
            }

            public int getObjectBaseInfosCount() {
                return ((FinderBaseRequest) this.instance).getObjectBaseInfosCount();
            }

            public List<FinderObjectBaseInfo> getObjectBaseInfosList() {
                return Collections.unmodifiableList(((FinderBaseRequest) this.instance).getObjectBaseInfosList());
            }

            public long getRequestId() {
                return ((FinderBaseRequest) this.instance).getRequestId();
            }

            public int getScene() {
                return ((FinderBaseRequest) this.instance).getScene();
            }

            public int getUserVersion() {
                return ((FinderBaseRequest) this.instance).getUserVersion();
            }

            public boolean hasAdBasereq() {
                return ((FinderBaseRequest) this.instance).hasAdBasereq();
            }

            public boolean hasClientFlag() {
                return ((FinderBaseRequest) this.instance).hasClientFlag();
            }

            public boolean hasCtxInfo() {
                return ((FinderBaseRequest) this.instance).hasCtxInfo();
            }

            public boolean hasExptFlag() {
                return ((FinderBaseRequest) this.instance).hasExptFlag();
            }

            public boolean hasExtSpamInfo() {
                return ((FinderBaseRequest) this.instance).hasExtSpamInfo();
            }

            public boolean hasLiveIdentity() {
                return ((FinderBaseRequest) this.instance).hasLiveIdentity();
            }

            public boolean hasRequestId() {
                return ((FinderBaseRequest) this.instance).hasRequestId();
            }

            public boolean hasScene() {
                return ((FinderBaseRequest) this.instance).hasScene();
            }

            public boolean hasUserVersion() {
                return ((FinderBaseRequest) this.instance).hasUserVersion();
            }

            public Builder mergeAdBasereq(FinderAdBaseRequest finderAdBaseRequest) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).mergeAdBasereq(finderAdBaseRequest);
                return this;
            }

            public Builder mergeCtxInfo(ClientContextInfo clientContextInfo) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).mergeCtxInfo(clientContextInfo);
                return this;
            }

            public Builder removeObjectBaseInfos(int i) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).removeObjectBaseInfos(i);
                return this;
            }

            public Builder setAdBasereq(FinderAdBaseRequest finderAdBaseRequest) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setAdBasereq(finderAdBaseRequest);
                return this;
            }

            public Builder setClientFlag(int i) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setClientFlag(i);
                return this;
            }

            public Builder setCtxInfo(ClientContextInfo clientContextInfo) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setCtxInfo(clientContextInfo);
                return this;
            }

            public Builder setExptFlag(int i) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setExptFlag(i);
                return this;
            }

            public Builder setExtSpamInfo(C16994k kVar) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setExtSpamInfo(kVar);
                return this;
            }

            public Builder setLiveIdentity(int i) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setLiveIdentity(i);
                return this;
            }

            public Builder setObjectBaseInfos(int i, FinderObjectBaseInfo finderObjectBaseInfo) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setObjectBaseInfos(i, finderObjectBaseInfo);
                return this;
            }

            public Builder setRequestId(long j) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setRequestId(j);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setScene(i);
                return this;
            }

            public Builder setUserVersion(int i) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setUserVersion(i);
                return this;
            }

            private Builder() {
                super(FinderBaseRequest.DEFAULT_INSTANCE);
            }

            public Builder addObjectBaseInfos(int i, FinderObjectBaseInfo finderObjectBaseInfo) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).addObjectBaseInfos(i, finderObjectBaseInfo);
                return this;
            }

            public Builder setAdBasereq(FinderAdBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setAdBasereq((FinderAdBaseRequest) builder.build());
                return this;
            }

            public Builder setCtxInfo(ClientContextInfo.Builder builder) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setCtxInfo((ClientContextInfo) builder.build());
                return this;
            }

            public Builder setObjectBaseInfos(int i, FinderObjectBaseInfo.Builder builder) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).setObjectBaseInfos(i, (FinderObjectBaseInfo) builder.build());
                return this;
            }

            public Builder addObjectBaseInfos(FinderObjectBaseInfo.Builder builder) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).addObjectBaseInfos((FinderObjectBaseInfo) builder.build());
                return this;
            }

            public Builder addObjectBaseInfos(int i, FinderObjectBaseInfo.Builder builder) {
                copyOnWrite();
                ((FinderBaseRequest) this.instance).addObjectBaseInfos(i, (FinderObjectBaseInfo) builder.build());
                return this;
            }
        }

        static {
            FinderBaseRequest finderBaseRequest = new FinderBaseRequest();
            DEFAULT_INSTANCE = finderBaseRequest;
            C23861l0.registerDefaultInstance(FinderBaseRequest.class, finderBaseRequest);
        }

        private FinderBaseRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllObjectBaseInfos(Iterable<? extends FinderObjectBaseInfo> iterable) {
            ensureObjectBaseInfosIsMutable();
            C23810b.addAll(iterable, this.objectBaseInfos_);
        }

        /* access modifiers changed from: private */
        public void addObjectBaseInfos(FinderObjectBaseInfo finderObjectBaseInfo) {
            finderObjectBaseInfo.getClass();
            ensureObjectBaseInfosIsMutable();
            this.objectBaseInfos_.add(finderObjectBaseInfo);
        }

        /* access modifiers changed from: private */
        public void clearAdBasereq() {
            this.adBasereq_ = null;
            this.bitField0_ &= -257;
        }

        /* access modifiers changed from: private */
        public void clearClientFlag() {
            this.bitField0_ &= -129;
            this.clientFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCtxInfo() {
            this.ctxInfo_ = null;
            this.bitField0_ &= -17;
        }

        /* access modifiers changed from: private */
        public void clearExptFlag() {
            this.bitField0_ &= -9;
            this.exptFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExtSpamInfo() {
            this.bitField0_ &= -5;
            this.extSpamInfo_ = getDefaultInstance().getExtSpamInfo();
        }

        /* access modifiers changed from: private */
        public void clearLiveIdentity() {
            this.bitField0_ &= -65;
            this.liveIdentity_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearObjectBaseInfos() {
            this.objectBaseInfos_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearRequestId() {
            this.bitField0_ &= -33;
            this.requestId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -3;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserVersion() {
            this.bitField0_ &= -2;
            this.userVersion_ = 0;
        }

        private void ensureObjectBaseInfosIsMutable() {
            C23908o0.C23919j<FinderObjectBaseInfo> jVar = this.objectBaseInfos_;
            if (!jVar.mo37523Q()) {
                this.objectBaseInfos_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderBaseRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAdBasereq(FinderAdBaseRequest finderAdBaseRequest) {
            finderAdBaseRequest.getClass();
            FinderAdBaseRequest finderAdBaseRequest2 = this.adBasereq_;
            if (finderAdBaseRequest2 == null || finderAdBaseRequest2 == FinderAdBaseRequest.getDefaultInstance()) {
                this.adBasereq_ = finderAdBaseRequest;
            } else {
                this.adBasereq_ = (FinderAdBaseRequest) ((FinderAdBaseRequest.Builder) FinderAdBaseRequest.newBuilder(this.adBasereq_).mergeFrom(finderAdBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void mergeCtxInfo(ClientContextInfo clientContextInfo) {
            clientContextInfo.getClass();
            ClientContextInfo clientContextInfo2 = this.ctxInfo_;
            if (clientContextInfo2 == null || clientContextInfo2 == ClientContextInfo.getDefaultInstance()) {
                this.ctxInfo_ = clientContextInfo;
            } else {
                this.ctxInfo_ = (ClientContextInfo) ((ClientContextInfo.Builder) ClientContextInfo.newBuilder(this.ctxInfo_).mergeFrom(clientContextInfo)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderBaseRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderBaseRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderBaseRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderBaseRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeObjectBaseInfos(int i) {
            ensureObjectBaseInfosIsMutable();
            this.objectBaseInfos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAdBasereq(FinderAdBaseRequest finderAdBaseRequest) {
            finderAdBaseRequest.getClass();
            this.adBasereq_ = finderAdBaseRequest;
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setClientFlag(int i) {
            this.bitField0_ |= 128;
            this.clientFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setCtxInfo(ClientContextInfo clientContextInfo) {
            clientContextInfo.getClass();
            this.ctxInfo_ = clientContextInfo;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setExptFlag(int i) {
            this.bitField0_ |= 8;
            this.exptFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setExtSpamInfo(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.extSpamInfo_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setLiveIdentity(int i) {
            this.bitField0_ |= 64;
            this.liveIdentity_ = i;
        }

        /* access modifiers changed from: private */
        public void setObjectBaseInfos(int i, FinderObjectBaseInfo finderObjectBaseInfo) {
            finderObjectBaseInfo.getClass();
            ensureObjectBaseInfosIsMutable();
            this.objectBaseInfos_.set(i, finderObjectBaseInfo);
        }

        /* access modifiers changed from: private */
        public void setRequestId(long j) {
            this.bitField0_ |= 32;
            this.requestId_ = j;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 2;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setUserVersion(int i) {
            this.bitField0_ |= 1;
            this.userVersion_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ည\u0002\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဃ\u0005\u0007ဋ\u0006\b\u001b\nဋ\u0007\u000bဉ\b", new Object[]{"bitField0_", "userVersion_", "scene_", "extSpamInfo_", "exptFlag_", "ctxInfo_", "requestId_", "liveIdentity_", "objectBaseInfos_", FinderObjectBaseInfo.class, "clientFlag_", "adBasereq_"});
                case 3:
                    return new FinderBaseRequest();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderBaseRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderBaseRequest.class) {
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

        public FinderAdBaseRequest getAdBasereq() {
            FinderAdBaseRequest finderAdBaseRequest = this.adBasereq_;
            return finderAdBaseRequest == null ? FinderAdBaseRequest.getDefaultInstance() : finderAdBaseRequest;
        }

        public int getClientFlag() {
            return this.clientFlag_;
        }

        public ClientContextInfo getCtxInfo() {
            ClientContextInfo clientContextInfo = this.ctxInfo_;
            return clientContextInfo == null ? ClientContextInfo.getDefaultInstance() : clientContextInfo;
        }

        public int getExptFlag() {
            return this.exptFlag_;
        }

        public C16994k getExtSpamInfo() {
            return this.extSpamInfo_;
        }

        public int getLiveIdentity() {
            return this.liveIdentity_;
        }

        public FinderObjectBaseInfo getObjectBaseInfos(int i) {
            return this.objectBaseInfos_.get(i);
        }

        public int getObjectBaseInfosCount() {
            return this.objectBaseInfos_.size();
        }

        public List<FinderObjectBaseInfo> getObjectBaseInfosList() {
            return this.objectBaseInfos_;
        }

        public FinderObjectBaseInfoOrBuilder getObjectBaseInfosOrBuilder(int i) {
            return this.objectBaseInfos_.get(i);
        }

        public List<? extends FinderObjectBaseInfoOrBuilder> getObjectBaseInfosOrBuilderList() {
            return this.objectBaseInfos_;
        }

        public long getRequestId() {
            return this.requestId_;
        }

        public int getScene() {
            return this.scene_;
        }

        public int getUserVersion() {
            return this.userVersion_;
        }

        public boolean hasAdBasereq() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasClientFlag() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCtxInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasExptFlag() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasExtSpamInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLiveIdentity() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRequestId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasUserVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FinderBaseRequest finderBaseRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderBaseRequest);
        }

        public static FinderBaseRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderBaseRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderBaseRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderBaseRequest parseFrom(C16994k kVar) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addObjectBaseInfos(int i, FinderObjectBaseInfo finderObjectBaseInfo) {
            finderObjectBaseInfo.getClass();
            ensureObjectBaseInfosIsMutable();
            this.objectBaseInfos_.add(i, finderObjectBaseInfo);
        }

        public static FinderBaseRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderBaseRequest parseFrom(byte[] bArr) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderBaseRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderBaseRequest parseFrom(InputStream inputStream) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderBaseRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderBaseRequest parseFrom(C23856l lVar) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderBaseRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderBaseRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderBaseRequestOrBuilder extends C23848k1 {
        FinderAdBaseRequest getAdBasereq();

        int getClientFlag();

        ClientContextInfo getCtxInfo();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getExptFlag();

        C16994k getExtSpamInfo();

        int getLiveIdentity();

        FinderObjectBaseInfo getObjectBaseInfos(int i);

        int getObjectBaseInfosCount();

        List<FinderObjectBaseInfo> getObjectBaseInfosList();

        long getRequestId();

        int getScene();

        int getUserVersion();

        boolean hasAdBasereq();

        boolean hasClientFlag();

        boolean hasCtxInfo();

        boolean hasExptFlag();

        boolean hasExtSpamInfo();

        boolean hasLiveIdentity();

        boolean hasRequestId();

        boolean hasScene();

        boolean hasUserVersion();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderClientStatusOrBuilder extends C23848k1 {
        int getBandwidthKbps();

        String getClientIp();

        C16994k getClientIpBytes();

        int getClientVersion();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDeviceBrand();

        C16994k getDeviceBrandBytes();

        String getDeviceModel();

        C16994k getDeviceModelBytes();

        int getDeviceTypeId();

        FinderFluencyInfo getFinderFluencyInfo(int i);

        int getFinderFluencyInfoCount();

        List<FinderFluencyInfo> getFinderFluencyInfoList();

        FinderDownloadInfo getLastPreloadDownloadInfo(int i);

        int getLastPreloadDownloadInfoCount();

        List<FinderDownloadInfo> getLastPreloadDownloadInfoList();

        FinderDownloadInfo getLastVideosDownloadInfo(int i);

        int getLastVideosDownloadInfoCount();

        List<FinderDownloadInfo> getLastVideosDownloadInfoList();

        String getNetName();

        C16994k getNetNameBytes();

        int getNetType();

        String getOsName();

        C16994k getOsNameBytes();

        String getOsVersion();

        C16994k getOsVersionBytes();

        DownloadSpeed getRecentFinderDownloadSpeed(int i);

        int getRecentFinderDownloadSpeedCount();

        List<DownloadSpeed> getRecentFinderDownloadSpeedList();

        DownloadSpeed getRecentWechatDownloadSpeed(int i);

        int getRecentWechatDownloadSpeedCount();

        List<DownloadSpeed> getRecentWechatDownloadSpeedList();

        String getSupportedFileFormat(int i);

        C16994k getSupportedFileFormatBytes(int i);

        int getSupportedFileFormatCount();

        List<String> getSupportedFileFormatList();

        boolean hasBandwidthKbps();

        boolean hasClientIp();

        boolean hasClientVersion();

        boolean hasDeviceBrand();

        boolean hasDeviceModel();

        boolean hasDeviceTypeId();

        boolean hasNetName();

        boolean hasNetType();

        boolean hasOsName();

        boolean hasOsVersion();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderCommentInfoOrBuilder extends C23848k1 {
        FinderContact getAuthorContact();

        int getBlacklistFlag();

        String getClientId();

        C16994k getClientIdBytes();

        long getCommentId();

        String getContent();

        C16994k getContentBytes();

        int getContentType();

        int getContinueFlag();

        long getCreatetime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDeleteFlag();

        int getDislikeCount();

        int getDislikeFlag();

        int getDisplayFlag();

        long getDisplayid();

        String getDisplayidDiscarded();

        C16994k getDisplayidDiscardedBytes();

        int getExpandCommentCount();

        int getExtFlag();

        String getHeadUrl();

        C16994k getHeadUrlBytes();

        FinderIpRegionInfo getIpRegionInfo();

        C16994k getLastBuffer();

        FinderCommentInfo getLevelTwoComment(int i);

        int getLevelTwoCommentCount();

        List<FinderCommentInfo> getLevelTwoCommentList();

        int getLikeCount();

        int getLikeFlag();

        FinderContactMsgInfo getMsgInfo();

        String getNickname();

        C16994k getNicknameBytes();

        String getReplayNickname();

        C16994k getReplayNicknameBytes();

        int getReplyBlacklistFlag();

        long getReplyCommentId();

        FinderContact getReplyContact();

        String getReplyContent();

        C16994k getReplyContentBytes();

        String getReplyUsername();

        C16994k getReplyUsernameBytes();

        String getReportJson();

        C16994k getReportJsonBytes();

        int getUnreadFlag();

        int getUpContinueFlag();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasAuthorContact();

        boolean hasBlacklistFlag();

        boolean hasClientId();

        boolean hasCommentId();

        boolean hasContent();

        boolean hasContentType();

        boolean hasContinueFlag();

        boolean hasCreatetime();

        boolean hasDeleteFlag();

        boolean hasDislikeCount();

        boolean hasDislikeFlag();

        boolean hasDisplayFlag();

        boolean hasDisplayid();

        boolean hasDisplayidDiscarded();

        boolean hasExpandCommentCount();

        boolean hasExtFlag();

        boolean hasHeadUrl();

        boolean hasIpRegionInfo();

        boolean hasLastBuffer();

        boolean hasLikeCount();

        boolean hasLikeFlag();

        boolean hasMsgInfo();

        boolean hasNickname();

        boolean hasReplayNickname();

        boolean hasReplyBlacklistFlag();

        boolean hasReplyCommentId();

        boolean hasReplyContact();

        boolean hasReplyContent();

        boolean hasReplyUsername();

        boolean hasReportJson();

        boolean hasUnreadFlag();

        boolean hasUpContinueFlag();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderCommentRequest extends C23861l0<FinderCommentRequest, Builder> implements FinderCommentRequestOrBuilder {
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        public static final int CLIENTID_FIELD_NUMBER = 9;
        public static final int CLIENT_UDF_KV_FIELD_NUMBER = 18;
        public static final int COMMENTID_FIELD_NUMBER = 5;
        public static final int COMMENTSCENE_FIELD_NUMBER = 15;
        public static final int CONTENT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final FinderCommentRequest DEFAULT_INSTANCE;
        public static final int FINDERBASEREQUEST_FIELD_NUMBER = 13;
        public static final int OBJECTID_FIELD_NUMBER = 3;
        public static final int OBJECTNONCEID_FIELD_NUMBER = 12;
        public static final int OPTYPE_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderCommentRequest> PARSER = null;
        public static final int PASTED_CONTENT_FIELD_NUMBER = 17;
        public static final int REPLYCOMMENTID_FIELD_NUMBER = 6;
        public static final int REPLYUSERNAME_FIELD_NUMBER = 7;
        public static final int ROOTCOMMENTID_FIELD_NUMBER = 10;
        public static final int SCENE_FIELD_NUMBER = 11;
        public static final int SESSIONBUFFER_FIELD_NUMBER = 14;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private String clientId_ = "";
        private String clientUdfKv_ = "";
        private long commentId_;
        private int commentScene_;
        private String content_ = "";
        private FinderBaseRequest finderBaseRequest_;
        private byte memoizedIsInitialized = 2;
        private long objectId_;
        private String objectNonceId_ = "";
        private int opType_;
        private C23908o0.C23919j<String> pastedContent_ = C23861l0.emptyProtobufList();
        private long replyCommentId_;
        private String replyUsername_ = "";
        private long rootCommentId_;
        private int scene_;
        private String sessionBuffer_ = "";
        private String username_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderCommentRequest, Builder> implements FinderCommentRequestOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllPastedContent(Iterable<String> iterable) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).addAllPastedContent(iterable);
                return this;
            }

            public Builder addPastedContent(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).addPastedContent(str);
                return this;
            }

            public Builder addPastedContentBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).addPastedContentBytes(kVar);
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearClientId();
                return this;
            }

            public Builder clearClientUdfKv() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearClientUdfKv();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearCommentId();
                return this;
            }

            public Builder clearCommentScene() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearCommentScene();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearContent();
                return this;
            }

            public Builder clearFinderBaseRequest() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearFinderBaseRequest();
                return this;
            }

            public Builder clearObjectId() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearObjectId();
                return this;
            }

            public Builder clearObjectNonceId() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearObjectNonceId();
                return this;
            }

            public Builder clearOpType() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearOpType();
                return this;
            }

            public Builder clearPastedContent() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearPastedContent();
                return this;
            }

            public Builder clearReplyCommentId() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearReplyCommentId();
                return this;
            }

            public Builder clearReplyUsername() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearReplyUsername();
                return this;
            }

            public Builder clearRootCommentId() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearRootCommentId();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearScene();
                return this;
            }

            public Builder clearSessionBuffer() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearSessionBuffer();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).clearUsername();
                return this;
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((FinderCommentRequest) this.instance).getBaseRequest();
            }

            public String getClientId() {
                return ((FinderCommentRequest) this.instance).getClientId();
            }

            public C16994k getClientIdBytes() {
                return ((FinderCommentRequest) this.instance).getClientIdBytes();
            }

            public String getClientUdfKv() {
                return ((FinderCommentRequest) this.instance).getClientUdfKv();
            }

            public C16994k getClientUdfKvBytes() {
                return ((FinderCommentRequest) this.instance).getClientUdfKvBytes();
            }

            public long getCommentId() {
                return ((FinderCommentRequest) this.instance).getCommentId();
            }

            public int getCommentScene() {
                return ((FinderCommentRequest) this.instance).getCommentScene();
            }

            public String getContent() {
                return ((FinderCommentRequest) this.instance).getContent();
            }

            public C16994k getContentBytes() {
                return ((FinderCommentRequest) this.instance).getContentBytes();
            }

            public FinderBaseRequest getFinderBaseRequest() {
                return ((FinderCommentRequest) this.instance).getFinderBaseRequest();
            }

            public long getObjectId() {
                return ((FinderCommentRequest) this.instance).getObjectId();
            }

            public String getObjectNonceId() {
                return ((FinderCommentRequest) this.instance).getObjectNonceId();
            }

            public C16994k getObjectNonceIdBytes() {
                return ((FinderCommentRequest) this.instance).getObjectNonceIdBytes();
            }

            public int getOpType() {
                return ((FinderCommentRequest) this.instance).getOpType();
            }

            public String getPastedContent(int i) {
                return ((FinderCommentRequest) this.instance).getPastedContent(i);
            }

            public C16994k getPastedContentBytes(int i) {
                return ((FinderCommentRequest) this.instance).getPastedContentBytes(i);
            }

            public int getPastedContentCount() {
                return ((FinderCommentRequest) this.instance).getPastedContentCount();
            }

            public List<String> getPastedContentList() {
                return Collections.unmodifiableList(((FinderCommentRequest) this.instance).getPastedContentList());
            }

            public long getReplyCommentId() {
                return ((FinderCommentRequest) this.instance).getReplyCommentId();
            }

            public String getReplyUsername() {
                return ((FinderCommentRequest) this.instance).getReplyUsername();
            }

            public C16994k getReplyUsernameBytes() {
                return ((FinderCommentRequest) this.instance).getReplyUsernameBytes();
            }

            public long getRootCommentId() {
                return ((FinderCommentRequest) this.instance).getRootCommentId();
            }

            public int getScene() {
                return ((FinderCommentRequest) this.instance).getScene();
            }

            public String getSessionBuffer() {
                return ((FinderCommentRequest) this.instance).getSessionBuffer();
            }

            public C16994k getSessionBufferBytes() {
                return ((FinderCommentRequest) this.instance).getSessionBufferBytes();
            }

            public String getUsername() {
                return ((FinderCommentRequest) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderCommentRequest) this.instance).getUsernameBytes();
            }

            public boolean hasBaseRequest() {
                return ((FinderCommentRequest) this.instance).hasBaseRequest();
            }

            public boolean hasClientId() {
                return ((FinderCommentRequest) this.instance).hasClientId();
            }

            public boolean hasClientUdfKv() {
                return ((FinderCommentRequest) this.instance).hasClientUdfKv();
            }

            public boolean hasCommentId() {
                return ((FinderCommentRequest) this.instance).hasCommentId();
            }

            public boolean hasCommentScene() {
                return ((FinderCommentRequest) this.instance).hasCommentScene();
            }

            public boolean hasContent() {
                return ((FinderCommentRequest) this.instance).hasContent();
            }

            public boolean hasFinderBaseRequest() {
                return ((FinderCommentRequest) this.instance).hasFinderBaseRequest();
            }

            public boolean hasObjectId() {
                return ((FinderCommentRequest) this.instance).hasObjectId();
            }

            public boolean hasObjectNonceId() {
                return ((FinderCommentRequest) this.instance).hasObjectNonceId();
            }

            public boolean hasOpType() {
                return ((FinderCommentRequest) this.instance).hasOpType();
            }

            public boolean hasReplyCommentId() {
                return ((FinderCommentRequest) this.instance).hasReplyCommentId();
            }

            public boolean hasReplyUsername() {
                return ((FinderCommentRequest) this.instance).hasReplyUsername();
            }

            public boolean hasRootCommentId() {
                return ((FinderCommentRequest) this.instance).hasRootCommentId();
            }

            public boolean hasScene() {
                return ((FinderCommentRequest) this.instance).hasScene();
            }

            public boolean hasSessionBuffer() {
                return ((FinderCommentRequest) this.instance).hasSessionBuffer();
            }

            public boolean hasUsername() {
                return ((FinderCommentRequest) this.instance).hasUsername();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).mergeFinderBaseRequest(finderBaseRequest);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setClientIdBytes(kVar);
                return this;
            }

            public Builder setClientUdfKv(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setClientUdfKv(str);
                return this;
            }

            public Builder setClientUdfKvBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setClientUdfKvBytes(kVar);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setCommentId(j);
                return this;
            }

            public Builder setCommentScene(int i) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setCommentScene(i);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setContentBytes(kVar);
                return this;
            }

            public Builder setFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setFinderBaseRequest(finderBaseRequest);
                return this;
            }

            public Builder setObjectId(long j) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setObjectId(j);
                return this;
            }

            public Builder setObjectNonceId(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setObjectNonceId(str);
                return this;
            }

            public Builder setObjectNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setObjectNonceIdBytes(kVar);
                return this;
            }

            public Builder setOpType(int i) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setOpType(i);
                return this;
            }

            public Builder setPastedContent(int i, String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setPastedContent(i, str);
                return this;
            }

            public Builder setReplyCommentId(long j) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setReplyCommentId(j);
                return this;
            }

            public Builder setReplyUsername(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setReplyUsername(str);
                return this;
            }

            public Builder setReplyUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setReplyUsernameBytes(kVar);
                return this;
            }

            public Builder setRootCommentId(long j) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setRootCommentId(j);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setScene(i);
                return this;
            }

            public Builder setSessionBuffer(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setSessionBuffer(str);
                return this;
            }

            public Builder setSessionBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setSessionBufferBytes(kVar);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderCommentRequest.DEFAULT_INSTANCE);
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setFinderBaseRequest(FinderBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderCommentRequest) this.instance).setFinderBaseRequest((FinderBaseRequest) builder.build());
                return this;
            }
        }

        static {
            FinderCommentRequest finderCommentRequest = new FinderCommentRequest();
            DEFAULT_INSTANCE = finderCommentRequest;
            C23861l0.registerDefaultInstance(FinderCommentRequest.class, finderCommentRequest);
        }

        private FinderCommentRequest() {
        }

        /* access modifiers changed from: private */
        public void addAllPastedContent(Iterable<String> iterable) {
            ensurePastedContentIsMutable();
            C23810b.addAll(iterable, this.pastedContent_);
        }

        /* access modifiers changed from: private */
        public void addPastedContent(String str) {
            str.getClass();
            ensurePastedContentIsMutable();
            this.pastedContent_.add(str);
        }

        /* access modifiers changed from: private */
        public void addPastedContentBytes(C16994k kVar) {
            ensurePastedContentIsMutable();
            this.pastedContent_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearClientId() {
            this.bitField0_ &= -257;
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* access modifiers changed from: private */
        public void clearClientUdfKv() {
            this.bitField0_ &= -32769;
            this.clientUdfKv_ = getDefaultInstance().getClientUdfKv();
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -17;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCommentScene() {
            this.bitField0_ &= -16385;
            this.commentScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -9;
            this.content_ = getDefaultInstance().getContent();
        }

        /* access modifiers changed from: private */
        public void clearFinderBaseRequest() {
            this.finderBaseRequest_ = null;
            this.bitField0_ &= -4097;
        }

        /* access modifiers changed from: private */
        public void clearObjectId() {
            this.bitField0_ &= -5;
            this.objectId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearObjectNonceId() {
            this.bitField0_ &= -2049;
            this.objectNonceId_ = getDefaultInstance().getObjectNonceId();
        }

        /* access modifiers changed from: private */
        public void clearOpType() {
            this.bitField0_ &= -129;
            this.opType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPastedContent() {
            this.pastedContent_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearReplyCommentId() {
            this.bitField0_ &= -33;
            this.replyCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReplyUsername() {
            this.bitField0_ &= -65;
            this.replyUsername_ = getDefaultInstance().getReplyUsername();
        }

        /* access modifiers changed from: private */
        public void clearRootCommentId() {
            this.bitField0_ &= -513;
            this.rootCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -1025;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionBuffer() {
            this.bitField0_ &= -8193;
            this.sessionBuffer_ = getDefaultInstance().getSessionBuffer();
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -3;
            this.username_ = getDefaultInstance().getUsername();
        }

        private void ensurePastedContentIsMutable() {
            C23908o0.C23919j<String> jVar = this.pastedContent_;
            if (!jVar.mo37523Q()) {
                this.pastedContent_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderCommentRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            MMBaseProto.BaseRequest baseRequest2 = this.baseRequest_;
            if (baseRequest2 == null || baseRequest2 == MMBaseProto.BaseRequest.getDefaultInstance()) {
                this.baseRequest_ = baseRequest;
            } else {
                this.baseRequest_ = (MMBaseProto.BaseRequest) ((MMBaseProto.BaseRequest.Builder) MMBaseProto.BaseRequest.newBuilder(this.baseRequest_).mergeFrom(baseRequest)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            FinderBaseRequest finderBaseRequest2 = this.finderBaseRequest_;
            if (finderBaseRequest2 == null || finderBaseRequest2 == FinderBaseRequest.getDefaultInstance()) {
                this.finderBaseRequest_ = finderBaseRequest;
            } else {
                this.finderBaseRequest_ = (FinderBaseRequest) ((FinderBaseRequest.Builder) FinderBaseRequest.newBuilder(this.finderBaseRequest_).mergeFrom(finderBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderCommentRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderCommentRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderCommentRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.clientId_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientIdBytes(C16994k kVar) {
            this.clientId_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setClientUdfKv(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.clientUdfKv_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientUdfKvBytes(C16994k kVar) {
            this.clientUdfKv_ = kVar.mo18752u();
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 16;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setCommentScene(int i) {
            this.bitField0_ |= 16384;
            this.commentScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.content_ = str;
        }

        /* access modifiers changed from: private */
        public void setContentBytes(C16994k kVar) {
            this.content_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            this.finderBaseRequest_ = finderBaseRequest;
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setObjectId(long j) {
            this.bitField0_ |= 4;
            this.objectId_ = j;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.objectNonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceIdBytes(C16994k kVar) {
            this.objectNonceId_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setOpType(int i) {
            this.bitField0_ |= 128;
            this.opType_ = i;
        }

        /* access modifiers changed from: private */
        public void setPastedContent(int i, String str) {
            str.getClass();
            ensurePastedContentIsMutable();
            this.pastedContent_.set(i, str);
        }

        /* access modifiers changed from: private */
        public void setReplyCommentId(long j) {
            this.bitField0_ |= 32;
            this.replyCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setReplyUsername(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.replyUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setReplyUsernameBytes(C16994k kVar) {
            this.replyUsername_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setRootCommentId(long j) {
            this.bitField0_ |= 512;
            this.rootCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 1024;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.sessionBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionBufferBytes(C16994k kVar) {
            this.sessionBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 2;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဃ\u0004\u0006ဃ\u0005\u0007ဈ\u0006\bဋ\u0007\tဈ\b\nဃ\t\u000bဋ\n\fဈ\u000b\rဉ\f\u000eဈ\r\u000fဋ\u000e\u0011\u001a\u0012ဈ\u000f", new Object[]{"bitField0_", "baseRequest_", "username_", "objectId_", "content_", "commentId_", "replyCommentId_", "replyUsername_", "opType_", "clientId_", "rootCommentId_", "scene_", "objectNonceId_", "finderBaseRequest_", "sessionBuffer_", "commentScene_", "pastedContent_", "clientUdfKv_"});
                case 3:
                    return new FinderCommentRequest();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderCommentRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderCommentRequest.class) {
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

        public MMBaseProto.BaseRequest getBaseRequest() {
            MMBaseProto.BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? MMBaseProto.BaseRequest.getDefaultInstance() : baseRequest;
        }

        public String getClientId() {
            return this.clientId_;
        }

        public C16994k getClientIdBytes() {
            return C16994k.m16791k(this.clientId_);
        }

        public String getClientUdfKv() {
            return this.clientUdfKv_;
        }

        public C16994k getClientUdfKvBytes() {
            return C16994k.m16791k(this.clientUdfKv_);
        }

        public long getCommentId() {
            return this.commentId_;
        }

        public int getCommentScene() {
            return this.commentScene_;
        }

        public String getContent() {
            return this.content_;
        }

        public C16994k getContentBytes() {
            return C16994k.m16791k(this.content_);
        }

        public FinderBaseRequest getFinderBaseRequest() {
            FinderBaseRequest finderBaseRequest = this.finderBaseRequest_;
            return finderBaseRequest == null ? FinderBaseRequest.getDefaultInstance() : finderBaseRequest;
        }

        public long getObjectId() {
            return this.objectId_;
        }

        public String getObjectNonceId() {
            return this.objectNonceId_;
        }

        public C16994k getObjectNonceIdBytes() {
            return C16994k.m16791k(this.objectNonceId_);
        }

        public int getOpType() {
            return this.opType_;
        }

        public String getPastedContent(int i) {
            return this.pastedContent_.get(i);
        }

        public C16994k getPastedContentBytes(int i) {
            return C16994k.m16791k(this.pastedContent_.get(i));
        }

        public int getPastedContentCount() {
            return this.pastedContent_.size();
        }

        public List<String> getPastedContentList() {
            return this.pastedContent_;
        }

        public long getReplyCommentId() {
            return this.replyCommentId_;
        }

        public String getReplyUsername() {
            return this.replyUsername_;
        }

        public C16994k getReplyUsernameBytes() {
            return C16994k.m16791k(this.replyUsername_);
        }

        public long getRootCommentId() {
            return this.rootCommentId_;
        }

        public int getScene() {
            return this.scene_;
        }

        public String getSessionBuffer() {
            return this.sessionBuffer_;
        }

        public C16994k getSessionBufferBytes() {
            return C16994k.m16791k(this.sessionBuffer_);
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasClientId() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasClientUdfKv() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasCommentScene() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFinderBaseRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasObjectId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasObjectNonceId() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasOpType() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasReplyCommentId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasReplyUsername() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRootCommentId() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSessionBuffer() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderCommentRequest finderCommentRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderCommentRequest);
        }

        public static FinderCommentRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderCommentRequest parseFrom(C16994k kVar) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderCommentRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderCommentRequest parseFrom(byte[] bArr) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderCommentRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderCommentRequest parseFrom(InputStream inputStream) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentRequest parseFrom(C23856l lVar) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderCommentRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderCommentRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderCommentRequestOrBuilder extends C23848k1 {
        MMBaseProto.BaseRequest getBaseRequest();

        String getClientId();

        C16994k getClientIdBytes();

        String getClientUdfKv();

        C16994k getClientUdfKvBytes();

        long getCommentId();

        int getCommentScene();

        String getContent();

        C16994k getContentBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderBaseRequest getFinderBaseRequest();

        long getObjectId();

        String getObjectNonceId();

        C16994k getObjectNonceIdBytes();

        int getOpType();

        String getPastedContent(int i);

        C16994k getPastedContentBytes(int i);

        int getPastedContentCount();

        List<String> getPastedContentList();

        long getReplyCommentId();

        String getReplyUsername();

        C16994k getReplyUsernameBytes();

        long getRootCommentId();

        int getScene();

        String getSessionBuffer();

        C16994k getSessionBufferBytes();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasBaseRequest();

        boolean hasClientId();

        boolean hasClientUdfKv();

        boolean hasCommentId();

        boolean hasCommentScene();

        boolean hasContent();

        boolean hasFinderBaseRequest();

        boolean hasObjectId();

        boolean hasObjectNonceId();

        boolean hasOpType();

        boolean hasReplyCommentId();

        boolean hasReplyUsername();

        boolean hasRootCommentId();

        boolean hasScene();

        boolean hasSessionBuffer();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderCommentResponse extends C23861l0<FinderCommentResponse, Builder> implements FinderCommentResponseOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        public static final int CLIENTID_FIELD_NUMBER = 3;
        public static final int COMMENT_ID_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final FinderCommentResponse DEFAULT_INSTANCE;
        public static final int EXPOSED_COMMENT_FIELD_NUMBER = 5;
        public static final int FINDER_OBJECT_FIELD_NUMBER = 4;
        private static volatile C24062w1<FinderCommentResponse> PARSER;
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private String clientid_ = "";
        private long commentId_;
        private C23908o0.C23919j<FinderCommentInfo> exposedComment_ = C23861l0.emptyProtobufList();
        private FinderObject finderObject_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<FinderCommentResponse, Builder> implements FinderCommentResponseOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllExposedComment(Iterable<? extends FinderCommentInfo> iterable) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).addAllExposedComment(iterable);
                return this;
            }

            public Builder addExposedComment(FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).addExposedComment(finderCommentInfo);
                return this;
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearClientid() {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).clearClientid();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).clearCommentId();
                return this;
            }

            public Builder clearExposedComment() {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).clearExposedComment();
                return this;
            }

            public Builder clearFinderObject() {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).clearFinderObject();
                return this;
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((FinderCommentResponse) this.instance).getBaseResponse();
            }

            public String getClientid() {
                return ((FinderCommentResponse) this.instance).getClientid();
            }

            public C16994k getClientidBytes() {
                return ((FinderCommentResponse) this.instance).getClientidBytes();
            }

            public long getCommentId() {
                return ((FinderCommentResponse) this.instance).getCommentId();
            }

            public FinderCommentInfo getExposedComment(int i) {
                return ((FinderCommentResponse) this.instance).getExposedComment(i);
            }

            public int getExposedCommentCount() {
                return ((FinderCommentResponse) this.instance).getExposedCommentCount();
            }

            public List<FinderCommentInfo> getExposedCommentList() {
                return Collections.unmodifiableList(((FinderCommentResponse) this.instance).getExposedCommentList());
            }

            public FinderObject getFinderObject() {
                return ((FinderCommentResponse) this.instance).getFinderObject();
            }

            public boolean hasBaseResponse() {
                return ((FinderCommentResponse) this.instance).hasBaseResponse();
            }

            public boolean hasClientid() {
                return ((FinderCommentResponse) this.instance).hasClientid();
            }

            public boolean hasCommentId() {
                return ((FinderCommentResponse) this.instance).hasCommentId();
            }

            public boolean hasFinderObject() {
                return ((FinderCommentResponse) this.instance).hasFinderObject();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder mergeFinderObject(FinderObject finderObject) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).mergeFinderObject(finderObject);
                return this;
            }

            public Builder removeExposedComment(int i) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).removeExposedComment(i);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setClientid(String str) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setClientid(str);
                return this;
            }

            public Builder setClientidBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setClientidBytes(kVar);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setCommentId(j);
                return this;
            }

            public Builder setExposedComment(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setExposedComment(i, finderCommentInfo);
                return this;
            }

            public Builder setFinderObject(FinderObject finderObject) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setFinderObject(finderObject);
                return this;
            }

            private Builder() {
                super(FinderCommentResponse.DEFAULT_INSTANCE);
            }

            public Builder addExposedComment(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).addExposedComment(i, finderCommentInfo);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }

            public Builder setExposedComment(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setExposedComment(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder setFinderObject(FinderObject.Builder builder) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).setFinderObject((FinderObject) builder.build());
                return this;
            }

            public Builder addExposedComment(FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).addExposedComment((FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addExposedComment(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderCommentResponse) this.instance).addExposedComment(i, (FinderCommentInfo) builder.build());
                return this;
            }
        }

        static {
            FinderCommentResponse finderCommentResponse = new FinderCommentResponse();
            DEFAULT_INSTANCE = finderCommentResponse;
            C23861l0.registerDefaultInstance(FinderCommentResponse.class, finderCommentResponse);
        }

        private FinderCommentResponse() {
        }

        /* access modifiers changed from: private */
        public void addAllExposedComment(Iterable<? extends FinderCommentInfo> iterable) {
            ensureExposedCommentIsMutable();
            C23810b.addAll(iterable, this.exposedComment_);
        }

        /* access modifiers changed from: private */
        public void addExposedComment(FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureExposedCommentIsMutable();
            this.exposedComment_.add(finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearClientid() {
            this.bitField0_ &= -5;
            this.clientid_ = getDefaultInstance().getClientid();
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -3;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExposedComment() {
            this.exposedComment_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearFinderObject() {
            this.finderObject_ = null;
            this.bitField0_ &= -9;
        }

        private void ensureExposedCommentIsMutable() {
            C23908o0.C23919j<FinderCommentInfo> jVar = this.exposedComment_;
            if (!jVar.mo37523Q()) {
                this.exposedComment_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderCommentResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            MMBaseProto.BaseResponse baseResponse2 = this.baseResponse_;
            if (baseResponse2 == null || baseResponse2 == MMBaseProto.BaseResponse.getDefaultInstance()) {
                this.baseResponse_ = baseResponse;
            } else {
                this.baseResponse_ = (MMBaseProto.BaseResponse) ((MMBaseProto.BaseResponse.Builder) MMBaseProto.BaseResponse.newBuilder(this.baseResponse_).mergeFrom(baseResponse)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeFinderObject(FinderObject finderObject) {
            finderObject.getClass();
            FinderObject finderObject2 = this.finderObject_;
            if (finderObject2 == null || finderObject2 == FinderObject.getDefaultInstance()) {
                this.finderObject_ = finderObject;
            } else {
                this.finderObject_ = (FinderObject) ((FinderObject.Builder) FinderObject.newBuilder(this.finderObject_).mergeFrom(finderObject)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderCommentResponse parseDelimitedFrom(InputStream inputStream) {
            return (FinderCommentResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentResponse parseFrom(ByteBuffer byteBuffer) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderCommentResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeExposedComment(int i) {
            ensureExposedCommentIsMutable();
            this.exposedComment_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setClientid(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.clientid_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientidBytes(C16994k kVar) {
            this.clientid_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 2;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setExposedComment(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureExposedCommentIsMutable();
            this.exposedComment_.set(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void setFinderObject(FinderObject finderObject) {
            finderObject.getClass();
            this.finderObject_ = finderObject;
            this.bitField0_ |= 8;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ᔉ\u0000\u0002ဃ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"bitField0_", "baseResponse_", "commentId_", "clientid_", "finderObject_", "exposedComment_", FinderCommentInfo.class});
                case 3:
                    return new FinderCommentResponse();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderCommentResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderCommentResponse.class) {
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

        public MMBaseProto.BaseResponse getBaseResponse() {
            MMBaseProto.BaseResponse baseResponse = this.baseResponse_;
            return baseResponse == null ? MMBaseProto.BaseResponse.getDefaultInstance() : baseResponse;
        }

        public String getClientid() {
            return this.clientid_;
        }

        public C16994k getClientidBytes() {
            return C16994k.m16791k(this.clientid_);
        }

        public long getCommentId() {
            return this.commentId_;
        }

        public FinderCommentInfo getExposedComment(int i) {
            return this.exposedComment_.get(i);
        }

        public int getExposedCommentCount() {
            return this.exposedComment_.size();
        }

        public List<FinderCommentInfo> getExposedCommentList() {
            return this.exposedComment_;
        }

        public FinderCommentInfoOrBuilder getExposedCommentOrBuilder(int i) {
            return this.exposedComment_.get(i);
        }

        public List<? extends FinderCommentInfoOrBuilder> getExposedCommentOrBuilderList() {
            return this.exposedComment_;
        }

        public FinderObject getFinderObject() {
            FinderObject finderObject = this.finderObject_;
            return finderObject == null ? FinderObject.getDefaultInstance() : finderObject;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasClientid() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasFinderObject() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(FinderCommentResponse finderCommentResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderCommentResponse);
        }

        public static FinderCommentResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderCommentResponse parseFrom(C16994k kVar) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addExposedComment(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureExposedCommentIsMutable();
            this.exposedComment_.add(i, finderCommentInfo);
        }

        public static FinderCommentResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderCommentResponse parseFrom(byte[] bArr) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderCommentResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderCommentResponse parseFrom(InputStream inputStream) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentResponse parseFrom(C23856l lVar) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderCommentResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderCommentResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderCommentResponseOrBuilder extends C23848k1 {
        MMBaseProto.BaseResponse getBaseResponse();

        String getClientid();

        C16994k getClientidBytes();

        long getCommentId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderCommentInfo getExposedComment(int i);

        int getExposedCommentCount();

        List<FinderCommentInfo> getExposedCommentList();

        FinderObject getFinderObject();

        boolean hasBaseResponse();

        boolean hasClientid();

        boolean hasCommentId();

        boolean hasFinderObject();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderContactMsgInfo extends C23861l0<FinderContactMsgInfo, Builder> implements FinderContactMsgInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderContactMsgInfo DEFAULT_INSTANCE;
        public static final int MSG_USERNAME_FIELD_NUMBER = 1;
        private static volatile C24062w1<FinderContactMsgInfo> PARSER = null;
        public static final int SESSION_ID_FIELD_NUMBER = 2;
        private int bitField0_;
        private String msgUsername_ = "";
        private String sessionId_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderContactMsgInfo, Builder> implements FinderContactMsgInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearMsgUsername() {
                copyOnWrite();
                ((FinderContactMsgInfo) this.instance).clearMsgUsername();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((FinderContactMsgInfo) this.instance).clearSessionId();
                return this;
            }

            public String getMsgUsername() {
                return ((FinderContactMsgInfo) this.instance).getMsgUsername();
            }

            public C16994k getMsgUsernameBytes() {
                return ((FinderContactMsgInfo) this.instance).getMsgUsernameBytes();
            }

            public String getSessionId() {
                return ((FinderContactMsgInfo) this.instance).getSessionId();
            }

            public C16994k getSessionIdBytes() {
                return ((FinderContactMsgInfo) this.instance).getSessionIdBytes();
            }

            public boolean hasMsgUsername() {
                return ((FinderContactMsgInfo) this.instance).hasMsgUsername();
            }

            public boolean hasSessionId() {
                return ((FinderContactMsgInfo) this.instance).hasSessionId();
            }

            public Builder setMsgUsername(String str) {
                copyOnWrite();
                ((FinderContactMsgInfo) this.instance).setMsgUsername(str);
                return this;
            }

            public Builder setMsgUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContactMsgInfo) this.instance).setMsgUsernameBytes(kVar);
                return this;
            }

            public Builder setSessionId(String str) {
                copyOnWrite();
                ((FinderContactMsgInfo) this.instance).setSessionId(str);
                return this;
            }

            public Builder setSessionIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContactMsgInfo) this.instance).setSessionIdBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderContactMsgInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderContactMsgInfo finderContactMsgInfo = new FinderContactMsgInfo();
            DEFAULT_INSTANCE = finderContactMsgInfo;
            C23861l0.registerDefaultInstance(FinderContactMsgInfo.class, finderContactMsgInfo);
        }

        private FinderContactMsgInfo() {
        }

        /* access modifiers changed from: private */
        public void clearMsgUsername() {
            this.bitField0_ &= -2;
            this.msgUsername_ = getDefaultInstance().getMsgUsername();
        }

        /* access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -3;
            this.sessionId_ = getDefaultInstance().getSessionId();
        }

        public static FinderContactMsgInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderContactMsgInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderContactMsgInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderContactMsgInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderContactMsgInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setMsgUsername(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.msgUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgUsernameBytes(C16994k kVar) {
            this.msgUsername_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.sessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionIdBytes(C16994k kVar) {
            this.sessionId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "msgUsername_", "sessionId_"});
                case 3:
                    return new FinderContactMsgInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderContactMsgInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderContactMsgInfo.class) {
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

        public String getMsgUsername() {
            return this.msgUsername_;
        }

        public C16994k getMsgUsernameBytes() {
            return C16994k.m16791k(this.msgUsername_);
        }

        public String getSessionId() {
            return this.sessionId_;
        }

        public C16994k getSessionIdBytes() {
            return C16994k.m16791k(this.sessionId_);
        }

        public boolean hasMsgUsername() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderContactMsgInfo finderContactMsgInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderContactMsgInfo);
        }

        public static FinderContactMsgInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderContactMsgInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderContactMsgInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderContactMsgInfo parseFrom(C16994k kVar) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderContactMsgInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderContactMsgInfo parseFrom(byte[] bArr) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderContactMsgInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderContactMsgInfo parseFrom(InputStream inputStream) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderContactMsgInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderContactMsgInfo parseFrom(C23856l lVar) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderContactMsgInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderContactMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderContactMsgInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getMsgUsername();

        C16994k getMsgUsernameBytes();

        String getSessionId();

        C16994k getSessionIdBytes();

        boolean hasMsgUsername();

        boolean hasSessionId();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderContactOrBuilder extends C23848k1 {
        long getAdditionalFlag();

        int getCoverEntranceFlag();

        String getCoverImgUrl();

        C16994k getCoverImgUrlBytes();

        String getCoverUrl();

        C16994k getCoverUrlBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getExtFlag();

        int getFansCount();

        int getFeedCount();

        int getFollowFlag();

        int getFollowTime();

        int getForeignUserFlag();

        int getFriendFollowCount();

        String getHeadUrl();

        C16994k getHeadUrlBytes();

        String getLiveCoverImgUrl();

        C16994k getLiveCoverImgUrlBytes();

        int getLiveStatus();

        String getLoggingoutWording();

        C16994k getLoggingoutWordingBytes();

        String getNickname();

        C16994k getNicknameBytes();

        int getOneTimeFlag();

        int getOriginalEntranceFlag();

        int getOriginalFlag();

        long getSeq();

        String getSignature();

        C16994k getSignatureBytes();

        int getSpamStatus();

        long getStatus();

        int getUserFlag();

        int getUserMode();

        String getUsername();

        C16994k getUsernameBytes();

        String getVestNickname();

        C16994k getVestNicknameBytes();

        String getWxUsernameV5();

        C16994k getWxUsernameV5Bytes();

        boolean hasAdditionalFlag();

        boolean hasCoverEntranceFlag();

        boolean hasCoverImgUrl();

        boolean hasCoverUrl();

        boolean hasExtFlag();

        boolean hasFansCount();

        boolean hasFeedCount();

        boolean hasFollowFlag();

        boolean hasFollowTime();

        boolean hasForeignUserFlag();

        boolean hasFriendFollowCount();

        boolean hasHeadUrl();

        boolean hasLiveCoverImgUrl();

        boolean hasLiveStatus();

        boolean hasLoggingoutWording();

        boolean hasNickname();

        boolean hasOneTimeFlag();

        boolean hasOriginalEntranceFlag();

        boolean hasOriginalFlag();

        boolean hasSeq();

        boolean hasSignature();

        boolean hasSpamStatus();

        boolean hasStatus();

        boolean hasUserFlag();

        boolean hasUserMode();

        boolean hasUsername();

        boolean hasVestNickname();

        boolean hasWxUsernameV5();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderDownloadInfoOrBuilder extends C23848k1 {
        String getCodingFormat();

        C16994k getCodingFormatBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        DownloadSpeed getDownloadSpeed();

        int getDownloadSpeedKbps();

        int getDownloadedBytes();

        int getDuration();

        long getFeedId();

        int getFileBytes();

        String getFileFormat();

        C16994k getFileFormatBytes();

        int getFirstLoadTimeMs();

        long getMegaVideoId();

        int getNetworkId();

        int getPageIndex();

        int getPlayCount();

        int getPlayPosition();

        int getPreloadBytes();

        int getPreloadMaxBitRate();

        long getPreloadStrategyId();

        String getRequestFormat();

        C16994k getRequestFormatBytes();

        int getRttMs();

        int getScene();

        int getStopPlayTimestamp();

        String getSvrIp();

        C16994k getSvrIpBytes();

        int getSvrPort();

        int getTotalPlayTimeMs();

        int getTotalWaitTimeMs();

        FinderWaitDetail getWaitDetails(int i);

        int getWaitDetailsCount();

        List<FinderWaitDetail> getWaitDetailsList();

        boolean hasCodingFormat();

        boolean hasDownloadSpeed();

        boolean hasDownloadSpeedKbps();

        boolean hasDownloadedBytes();

        boolean hasDuration();

        boolean hasFeedId();

        boolean hasFileBytes();

        boolean hasFileFormat();

        boolean hasFirstLoadTimeMs();

        boolean hasMegaVideoId();

        boolean hasNetworkId();

        boolean hasPageIndex();

        boolean hasPlayCount();

        boolean hasPlayPosition();

        boolean hasPreloadBytes();

        boolean hasPreloadMaxBitRate();

        boolean hasPreloadStrategyId();

        boolean hasRequestFormat();

        boolean hasRttMs();

        boolean hasScene();

        boolean hasStopPlayTimestamp();

        boolean hasSvrIp();

        boolean hasSvrPort();

        boolean hasTotalPlayTimeMs();

        boolean hasTotalWaitTimeMs();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderGetCommentDetailRequest extends C23861l0<FinderGetCommentDetailRequest, Builder> implements FinderGetCommentDetailRequestOrBuilder {
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FinderGetCommentDetailRequest DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 10;
        public static final int ENCRYPTEDOBJECTID_FIELD_NUMBER = 11;
        public static final int FINDERBASEREQUEST_FIELD_NUMBER = 13;
        public static final int FINDERUSERNAME_FIELD_NUMBER = 7;
        public static final int IDENTITYSCENE_FIELD_NUMBER = 14;
        public static final int LASTBUFFER_FIELD_NUMBER = 5;
        public static final int LATITUDE_FIELD_NUMBER = 20;
        public static final int LIKEBUFFER_FIELD_NUMBER = 16;
        public static final int LONGITUDE_FIELD_NUMBER = 19;
        public static final int MAXCOMMENTID_FIELD_NUMBER = 3;
        public static final int NEEDOBJECT_FIELD_NUMBER = 4;
        public static final int NEED_SELECTION_FIELD_NUMBER = 18;
        public static final int OBJECTID_FIELD_NUMBER = 2;
        public static final int OBJECTNONCEID_FIELD_NUMBER = 12;
        private static volatile C24062w1<FinderGetCommentDetailRequest> PARSER = null;
        public static final int PLATFORM_SCENE_FIELD_NUMBER = 17;
        public static final int PULLSCENE_FIELD_NUMBER = 15;
        public static final int REFCOMMENTID_FIELD_NUMBER = 8;
        public static final int ROOTCOMMENTID_FIELD_NUMBER = 6;
        public static final int SCENE_FIELD_NUMBER = 9;
        public static final int SESSION_BUFFER_FIELD_NUMBER = 24;
        public static final int SHARE_TIME_FIELD_NUMBER = 25;
        public static final int TRACE_BUFFER_FIELD_NUMBER = 23;
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private int direction_;
        private String encryptedObjectid_;
        private FinderBaseRequest finderBaseRequest_;
        private String finderUsername_;
        private int identityScene_;
        private C16994k lastBuffer_;
        private float latitude_;
        private C16994k likeBuffer_;
        private float longitude_;
        private long maxCommentId_;
        private byte memoizedIsInitialized = 2;
        private int needObject_;
        private int needSelection_;
        private String objectNonceId_;
        private long objectid_;
        private int platformScene_;
        private int pullScene_;
        private long refCommentId_;
        private long rootCommentId_;
        private int scene_;
        private String sessionBuffer_;
        private int shareTime_;
        private C16994k traceBuffer_;

        public static final class Builder extends C23861l0.C23862a<FinderGetCommentDetailRequest, Builder> implements FinderGetCommentDetailRequestOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearDirection() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearDirection();
                return this;
            }

            public Builder clearEncryptedObjectid() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearEncryptedObjectid();
                return this;
            }

            public Builder clearFinderBaseRequest() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearFinderBaseRequest();
                return this;
            }

            public Builder clearFinderUsername() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearFinderUsername();
                return this;
            }

            public Builder clearIdentityScene() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearIdentityScene();
                return this;
            }

            public Builder clearLastBuffer() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearLastBuffer();
                return this;
            }

            public Builder clearLatitude() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearLatitude();
                return this;
            }

            public Builder clearLikeBuffer() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearLikeBuffer();
                return this;
            }

            public Builder clearLongitude() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearLongitude();
                return this;
            }

            public Builder clearMaxCommentId() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearMaxCommentId();
                return this;
            }

            public Builder clearNeedObject() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearNeedObject();
                return this;
            }

            public Builder clearNeedSelection() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearNeedSelection();
                return this;
            }

            public Builder clearObjectNonceId() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearObjectNonceId();
                return this;
            }

            public Builder clearObjectid() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearObjectid();
                return this;
            }

            public Builder clearPlatformScene() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearPlatformScene();
                return this;
            }

            public Builder clearPullScene() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearPullScene();
                return this;
            }

            public Builder clearRefCommentId() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearRefCommentId();
                return this;
            }

            public Builder clearRootCommentId() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearRootCommentId();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearScene();
                return this;
            }

            public Builder clearSessionBuffer() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearSessionBuffer();
                return this;
            }

            public Builder clearShareTime() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearShareTime();
                return this;
            }

            public Builder clearTraceBuffer() {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).clearTraceBuffer();
                return this;
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((FinderGetCommentDetailRequest) this.instance).getBaseRequest();
            }

            public int getDirection() {
                return ((FinderGetCommentDetailRequest) this.instance).getDirection();
            }

            public String getEncryptedObjectid() {
                return ((FinderGetCommentDetailRequest) this.instance).getEncryptedObjectid();
            }

            public C16994k getEncryptedObjectidBytes() {
                return ((FinderGetCommentDetailRequest) this.instance).getEncryptedObjectidBytes();
            }

            public FinderBaseRequest getFinderBaseRequest() {
                return ((FinderGetCommentDetailRequest) this.instance).getFinderBaseRequest();
            }

            public String getFinderUsername() {
                return ((FinderGetCommentDetailRequest) this.instance).getFinderUsername();
            }

            public C16994k getFinderUsernameBytes() {
                return ((FinderGetCommentDetailRequest) this.instance).getFinderUsernameBytes();
            }

            public int getIdentityScene() {
                return ((FinderGetCommentDetailRequest) this.instance).getIdentityScene();
            }

            public C16994k getLastBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).getLastBuffer();
            }

            public float getLatitude() {
                return ((FinderGetCommentDetailRequest) this.instance).getLatitude();
            }

            public C16994k getLikeBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).getLikeBuffer();
            }

            public float getLongitude() {
                return ((FinderGetCommentDetailRequest) this.instance).getLongitude();
            }

            public long getMaxCommentId() {
                return ((FinderGetCommentDetailRequest) this.instance).getMaxCommentId();
            }

            public int getNeedObject() {
                return ((FinderGetCommentDetailRequest) this.instance).getNeedObject();
            }

            public int getNeedSelection() {
                return ((FinderGetCommentDetailRequest) this.instance).getNeedSelection();
            }

            public String getObjectNonceId() {
                return ((FinderGetCommentDetailRequest) this.instance).getObjectNonceId();
            }

            public C16994k getObjectNonceIdBytes() {
                return ((FinderGetCommentDetailRequest) this.instance).getObjectNonceIdBytes();
            }

            public long getObjectid() {
                return ((FinderGetCommentDetailRequest) this.instance).getObjectid();
            }

            public int getPlatformScene() {
                return ((FinderGetCommentDetailRequest) this.instance).getPlatformScene();
            }

            public int getPullScene() {
                return ((FinderGetCommentDetailRequest) this.instance).getPullScene();
            }

            public long getRefCommentId() {
                return ((FinderGetCommentDetailRequest) this.instance).getRefCommentId();
            }

            public long getRootCommentId() {
                return ((FinderGetCommentDetailRequest) this.instance).getRootCommentId();
            }

            public int getScene() {
                return ((FinderGetCommentDetailRequest) this.instance).getScene();
            }

            public String getSessionBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).getSessionBuffer();
            }

            public C16994k getSessionBufferBytes() {
                return ((FinderGetCommentDetailRequest) this.instance).getSessionBufferBytes();
            }

            public int getShareTime() {
                return ((FinderGetCommentDetailRequest) this.instance).getShareTime();
            }

            public C16994k getTraceBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).getTraceBuffer();
            }

            public boolean hasBaseRequest() {
                return ((FinderGetCommentDetailRequest) this.instance).hasBaseRequest();
            }

            public boolean hasDirection() {
                return ((FinderGetCommentDetailRequest) this.instance).hasDirection();
            }

            public boolean hasEncryptedObjectid() {
                return ((FinderGetCommentDetailRequest) this.instance).hasEncryptedObjectid();
            }

            public boolean hasFinderBaseRequest() {
                return ((FinderGetCommentDetailRequest) this.instance).hasFinderBaseRequest();
            }

            public boolean hasFinderUsername() {
                return ((FinderGetCommentDetailRequest) this.instance).hasFinderUsername();
            }

            public boolean hasIdentityScene() {
                return ((FinderGetCommentDetailRequest) this.instance).hasIdentityScene();
            }

            public boolean hasLastBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).hasLastBuffer();
            }

            public boolean hasLatitude() {
                return ((FinderGetCommentDetailRequest) this.instance).hasLatitude();
            }

            public boolean hasLikeBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).hasLikeBuffer();
            }

            public boolean hasLongitude() {
                return ((FinderGetCommentDetailRequest) this.instance).hasLongitude();
            }

            public boolean hasMaxCommentId() {
                return ((FinderGetCommentDetailRequest) this.instance).hasMaxCommentId();
            }

            public boolean hasNeedObject() {
                return ((FinderGetCommentDetailRequest) this.instance).hasNeedObject();
            }

            public boolean hasNeedSelection() {
                return ((FinderGetCommentDetailRequest) this.instance).hasNeedSelection();
            }

            public boolean hasObjectNonceId() {
                return ((FinderGetCommentDetailRequest) this.instance).hasObjectNonceId();
            }

            public boolean hasObjectid() {
                return ((FinderGetCommentDetailRequest) this.instance).hasObjectid();
            }

            public boolean hasPlatformScene() {
                return ((FinderGetCommentDetailRequest) this.instance).hasPlatformScene();
            }

            public boolean hasPullScene() {
                return ((FinderGetCommentDetailRequest) this.instance).hasPullScene();
            }

            public boolean hasRefCommentId() {
                return ((FinderGetCommentDetailRequest) this.instance).hasRefCommentId();
            }

            public boolean hasRootCommentId() {
                return ((FinderGetCommentDetailRequest) this.instance).hasRootCommentId();
            }

            public boolean hasScene() {
                return ((FinderGetCommentDetailRequest) this.instance).hasScene();
            }

            public boolean hasSessionBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).hasSessionBuffer();
            }

            public boolean hasShareTime() {
                return ((FinderGetCommentDetailRequest) this.instance).hasShareTime();
            }

            public boolean hasTraceBuffer() {
                return ((FinderGetCommentDetailRequest) this.instance).hasTraceBuffer();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder mergeFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).mergeFinderBaseRequest(finderBaseRequest);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setDirection(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setDirection(i);
                return this;
            }

            public Builder setEncryptedObjectid(String str) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setEncryptedObjectid(str);
                return this;
            }

            public Builder setEncryptedObjectidBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setEncryptedObjectidBytes(kVar);
                return this;
            }

            public Builder setFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setFinderBaseRequest(finderBaseRequest);
                return this;
            }

            public Builder setFinderUsername(String str) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setFinderUsername(str);
                return this;
            }

            public Builder setFinderUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setFinderUsernameBytes(kVar);
                return this;
            }

            public Builder setIdentityScene(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setIdentityScene(i);
                return this;
            }

            public Builder setLastBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setLastBuffer(kVar);
                return this;
            }

            public Builder setLatitude(float f) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setLatitude(f);
                return this;
            }

            public Builder setLikeBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setLikeBuffer(kVar);
                return this;
            }

            public Builder setLongitude(float f) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setLongitude(f);
                return this;
            }

            public Builder setMaxCommentId(long j) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setMaxCommentId(j);
                return this;
            }

            public Builder setNeedObject(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setNeedObject(i);
                return this;
            }

            public Builder setNeedSelection(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setNeedSelection(i);
                return this;
            }

            public Builder setObjectNonceId(String str) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setObjectNonceId(str);
                return this;
            }

            public Builder setObjectNonceIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setObjectNonceIdBytes(kVar);
                return this;
            }

            public Builder setObjectid(long j) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setObjectid(j);
                return this;
            }

            public Builder setPlatformScene(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setPlatformScene(i);
                return this;
            }

            public Builder setPullScene(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setPullScene(i);
                return this;
            }

            public Builder setRefCommentId(long j) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setRefCommentId(j);
                return this;
            }

            public Builder setRootCommentId(long j) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setRootCommentId(j);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setScene(i);
                return this;
            }

            public Builder setSessionBuffer(String str) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setSessionBuffer(str);
                return this;
            }

            public Builder setSessionBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setSessionBufferBytes(kVar);
                return this;
            }

            public Builder setShareTime(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setShareTime(i);
                return this;
            }

            public Builder setTraceBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setTraceBuffer(kVar);
                return this;
            }

            private Builder() {
                super(FinderGetCommentDetailRequest.DEFAULT_INSTANCE);
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setFinderBaseRequest(FinderBaseRequest.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailRequest) this.instance).setFinderBaseRequest((FinderBaseRequest) builder.build());
                return this;
            }
        }

        static {
            FinderGetCommentDetailRequest finderGetCommentDetailRequest = new FinderGetCommentDetailRequest();
            DEFAULT_INSTANCE = finderGetCommentDetailRequest;
            C23861l0.registerDefaultInstance(FinderGetCommentDetailRequest.class, finderGetCommentDetailRequest);
        }

        private FinderGetCommentDetailRequest() {
            C16994k kVar = C16994k.f46000e;
            this.lastBuffer_ = kVar;
            this.finderUsername_ = "";
            this.encryptedObjectid_ = "";
            this.objectNonceId_ = "";
            this.likeBuffer_ = kVar;
            this.traceBuffer_ = kVar;
            this.sessionBuffer_ = "";
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearDirection() {
            this.bitField0_ &= -513;
            this.direction_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEncryptedObjectid() {
            this.bitField0_ &= -1025;
            this.encryptedObjectid_ = getDefaultInstance().getEncryptedObjectid();
        }

        /* access modifiers changed from: private */
        public void clearFinderBaseRequest() {
            this.finderBaseRequest_ = null;
            this.bitField0_ &= -4097;
        }

        /* access modifiers changed from: private */
        public void clearFinderUsername() {
            this.bitField0_ &= -65;
            this.finderUsername_ = getDefaultInstance().getFinderUsername();
        }

        /* access modifiers changed from: private */
        public void clearIdentityScene() {
            this.bitField0_ &= -8193;
            this.identityScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLastBuffer() {
            this.bitField0_ &= -17;
            this.lastBuffer_ = getDefaultInstance().getLastBuffer();
        }

        /* access modifiers changed from: private */
        public void clearLatitude() {
            this.bitField0_ &= -524289;
            this.latitude_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearLikeBuffer() {
            this.bitField0_ &= -32769;
            this.likeBuffer_ = getDefaultInstance().getLikeBuffer();
        }

        /* access modifiers changed from: private */
        public void clearLongitude() {
            this.bitField0_ &= -262145;
            this.longitude_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearMaxCommentId() {
            this.bitField0_ &= -5;
            this.maxCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNeedObject() {
            this.bitField0_ &= -9;
            this.needObject_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNeedSelection() {
            this.bitField0_ &= -131073;
            this.needSelection_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearObjectNonceId() {
            this.bitField0_ &= -2049;
            this.objectNonceId_ = getDefaultInstance().getObjectNonceId();
        }

        /* access modifiers changed from: private */
        public void clearObjectid() {
            this.bitField0_ &= -3;
            this.objectid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlatformScene() {
            this.bitField0_ &= -65537;
            this.platformScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPullScene() {
            this.bitField0_ &= -16385;
            this.pullScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRefCommentId() {
            this.bitField0_ &= -129;
            this.refCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRootCommentId() {
            this.bitField0_ &= -33;
            this.rootCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -257;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionBuffer() {
            this.bitField0_ &= -2097153;
            this.sessionBuffer_ = getDefaultInstance().getSessionBuffer();
        }

        /* access modifiers changed from: private */
        public void clearShareTime() {
            this.bitField0_ &= -4194305;
            this.shareTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTraceBuffer() {
            this.bitField0_ &= -1048577;
            this.traceBuffer_ = getDefaultInstance().getTraceBuffer();
        }

        public static FinderGetCommentDetailRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            MMBaseProto.BaseRequest baseRequest2 = this.baseRequest_;
            if (baseRequest2 == null || baseRequest2 == MMBaseProto.BaseRequest.getDefaultInstance()) {
                this.baseRequest_ = baseRequest;
            } else {
                this.baseRequest_ = (MMBaseProto.BaseRequest) ((MMBaseProto.BaseRequest.Builder) MMBaseProto.BaseRequest.newBuilder(this.baseRequest_).mergeFrom(baseRequest)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            FinderBaseRequest finderBaseRequest2 = this.finderBaseRequest_;
            if (finderBaseRequest2 == null || finderBaseRequest2 == FinderBaseRequest.getDefaultInstance()) {
                this.finderBaseRequest_ = finderBaseRequest;
            } else {
                this.finderBaseRequest_ = (FinderBaseRequest) ((FinderBaseRequest.Builder) FinderBaseRequest.newBuilder(this.finderBaseRequest_).mergeFrom(finderBaseRequest)).buildPartial();
            }
            this.bitField0_ |= 4096;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderGetCommentDetailRequest parseDelimitedFrom(InputStream inputStream) {
            return (FinderGetCommentDetailRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderGetCommentDetailRequest parseFrom(ByteBuffer byteBuffer) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderGetCommentDetailRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setDirection(int i) {
            this.bitField0_ |= 512;
            this.direction_ = i;
        }

        /* access modifiers changed from: private */
        public void setEncryptedObjectid(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.encryptedObjectid_ = str;
        }

        /* access modifiers changed from: private */
        public void setEncryptedObjectidBytes(C16994k kVar) {
            this.encryptedObjectid_ = kVar.mo18752u();
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setFinderBaseRequest(FinderBaseRequest finderBaseRequest) {
            finderBaseRequest.getClass();
            this.finderBaseRequest_ = finderBaseRequest;
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setFinderUsername(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.finderUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setFinderUsernameBytes(C16994k kVar) {
            this.finderUsername_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setIdentityScene(int i) {
            this.bitField0_ |= 8192;
            this.identityScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setLastBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16;
            this.lastBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setLatitude(float f) {
            this.bitField0_ |= 524288;
            this.latitude_ = f;
        }

        /* access modifiers changed from: private */
        public void setLikeBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 32768;
            this.likeBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setLongitude(float f) {
            this.bitField0_ |= 262144;
            this.longitude_ = f;
        }

        /* access modifiers changed from: private */
        public void setMaxCommentId(long j) {
            this.bitField0_ |= 4;
            this.maxCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setNeedObject(int i) {
            this.bitField0_ |= 8;
            this.needObject_ = i;
        }

        /* access modifiers changed from: private */
        public void setNeedSelection(int i) {
            this.bitField0_ |= 131072;
            this.needSelection_ = i;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceId(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.objectNonceId_ = str;
        }

        /* access modifiers changed from: private */
        public void setObjectNonceIdBytes(C16994k kVar) {
            this.objectNonceId_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setObjectid(long j) {
            this.bitField0_ |= 2;
            this.objectid_ = j;
        }

        /* access modifiers changed from: private */
        public void setPlatformScene(int i) {
            this.bitField0_ |= 65536;
            this.platformScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setPullScene(int i) {
            this.bitField0_ |= 16384;
            this.pullScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setRefCommentId(long j) {
            this.bitField0_ |= 128;
            this.refCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setRootCommentId(long j) {
            this.bitField0_ |= 32;
            this.rootCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 256;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.sessionBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionBufferBytes(C16994k kVar) {
            this.sessionBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 2097152;
        }

        /* access modifiers changed from: private */
        public void setShareTime(int i) {
            this.bitField0_ |= 4194304;
            this.shareTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setTraceBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1048576;
            this.traceBuffer_ = kVar;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0019\u0017\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဋ\u0003\u0005ည\u0004\u0006ဃ\u0005\u0007ဈ\u0006\bဃ\u0007\tဋ\b\nဋ\t\u000bဈ\n\fဈ\u000b\rဉ\f\u000eဋ\r\u000fဋ\u000e\u0010ည\u000f\u0011ဋ\u0010\u0012ဋ\u0011\u0013ခ\u0012\u0014ခ\u0013\u0017ည\u0014\u0018ဈ\u0015\u0019ဋ\u0016", new Object[]{"bitField0_", "baseRequest_", "objectid_", "maxCommentId_", "needObject_", "lastBuffer_", "rootCommentId_", "finderUsername_", "refCommentId_", "scene_", "direction_", "encryptedObjectid_", "objectNonceId_", "finderBaseRequest_", "identityScene_", "pullScene_", "likeBuffer_", "platformScene_", "needSelection_", "longitude_", "latitude_", "traceBuffer_", "sessionBuffer_", "shareTime_"});
                case 3:
                    return new FinderGetCommentDetailRequest();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderGetCommentDetailRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderGetCommentDetailRequest.class) {
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

        public MMBaseProto.BaseRequest getBaseRequest() {
            MMBaseProto.BaseRequest baseRequest = this.baseRequest_;
            return baseRequest == null ? MMBaseProto.BaseRequest.getDefaultInstance() : baseRequest;
        }

        public int getDirection() {
            return this.direction_;
        }

        public String getEncryptedObjectid() {
            return this.encryptedObjectid_;
        }

        public C16994k getEncryptedObjectidBytes() {
            return C16994k.m16791k(this.encryptedObjectid_);
        }

        public FinderBaseRequest getFinderBaseRequest() {
            FinderBaseRequest finderBaseRequest = this.finderBaseRequest_;
            return finderBaseRequest == null ? FinderBaseRequest.getDefaultInstance() : finderBaseRequest;
        }

        public String getFinderUsername() {
            return this.finderUsername_;
        }

        public C16994k getFinderUsernameBytes() {
            return C16994k.m16791k(this.finderUsername_);
        }

        public int getIdentityScene() {
            return this.identityScene_;
        }

        public C16994k getLastBuffer() {
            return this.lastBuffer_;
        }

        public float getLatitude() {
            return this.latitude_;
        }

        public C16994k getLikeBuffer() {
            return this.likeBuffer_;
        }

        public float getLongitude() {
            return this.longitude_;
        }

        public long getMaxCommentId() {
            return this.maxCommentId_;
        }

        public int getNeedObject() {
            return this.needObject_;
        }

        public int getNeedSelection() {
            return this.needSelection_;
        }

        public String getObjectNonceId() {
            return this.objectNonceId_;
        }

        public C16994k getObjectNonceIdBytes() {
            return C16994k.m16791k(this.objectNonceId_);
        }

        public long getObjectid() {
            return this.objectid_;
        }

        public int getPlatformScene() {
            return this.platformScene_;
        }

        public int getPullScene() {
            return this.pullScene_;
        }

        public long getRefCommentId() {
            return this.refCommentId_;
        }

        public long getRootCommentId() {
            return this.rootCommentId_;
        }

        public int getScene() {
            return this.scene_;
        }

        public String getSessionBuffer() {
            return this.sessionBuffer_;
        }

        public C16994k getSessionBufferBytes() {
            return C16994k.m16791k(this.sessionBuffer_);
        }

        public int getShareTime() {
            return this.shareTime_;
        }

        public C16994k getTraceBuffer() {
            return this.traceBuffer_;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDirection() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasEncryptedObjectid() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasFinderBaseRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasFinderUsername() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasIdentityScene() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasLastBuffer() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasLatitude() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasLikeBuffer() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasLongitude() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasMaxCommentId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasNeedObject() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasNeedSelection() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasObjectNonceId() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasObjectid() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPlatformScene() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasPullScene() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasRefCommentId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasRootCommentId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasSessionBuffer() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasShareTime() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasTraceBuffer() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public static Builder newBuilder(FinderGetCommentDetailRequest finderGetCommentDetailRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderGetCommentDetailRequest);
        }

        public static FinderGetCommentDetailRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderGetCommentDetailRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderGetCommentDetailRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderGetCommentDetailRequest parseFrom(C16994k kVar) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderGetCommentDetailRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderGetCommentDetailRequest parseFrom(byte[] bArr) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderGetCommentDetailRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderGetCommentDetailRequest parseFrom(InputStream inputStream) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderGetCommentDetailRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderGetCommentDetailRequest parseFrom(C23856l lVar) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderGetCommentDetailRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderGetCommentDetailRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderGetCommentDetailRequestOrBuilder extends C23848k1 {
        MMBaseProto.BaseRequest getBaseRequest();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDirection();

        String getEncryptedObjectid();

        C16994k getEncryptedObjectidBytes();

        FinderBaseRequest getFinderBaseRequest();

        String getFinderUsername();

        C16994k getFinderUsernameBytes();

        int getIdentityScene();

        C16994k getLastBuffer();

        float getLatitude();

        C16994k getLikeBuffer();

        float getLongitude();

        long getMaxCommentId();

        int getNeedObject();

        int getNeedSelection();

        String getObjectNonceId();

        C16994k getObjectNonceIdBytes();

        long getObjectid();

        int getPlatformScene();

        int getPullScene();

        long getRefCommentId();

        long getRootCommentId();

        int getScene();

        String getSessionBuffer();

        C16994k getSessionBufferBytes();

        int getShareTime();

        C16994k getTraceBuffer();

        boolean hasBaseRequest();

        boolean hasDirection();

        boolean hasEncryptedObjectid();

        boolean hasFinderBaseRequest();

        boolean hasFinderUsername();

        boolean hasIdentityScene();

        boolean hasLastBuffer();

        boolean hasLatitude();

        boolean hasLikeBuffer();

        boolean hasLongitude();

        boolean hasMaxCommentId();

        boolean hasNeedObject();

        boolean hasNeedSelection();

        boolean hasObjectNonceId();

        boolean hasObjectid();

        boolean hasPlatformScene();

        boolean hasPullScene();

        boolean hasRefCommentId();

        boolean hasRootCommentId();

        boolean hasScene();

        boolean hasSessionBuffer();

        boolean hasShareTime();

        boolean hasTraceBuffer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderGetCommentDetailResponse extends C23861l0<FinderGetCommentDetailResponse, Builder> implements FinderGetCommentDetailResponseOrBuilder {
        public static final int BARRAGE_COMMENT_INFO_FIELD_NUMBER = 10;
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        public static final int COMMENT_COUNT_FIELD_NUMBER = 5;
        public static final int COMMENT_INFO_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final FinderGetCommentDetailResponse DEFAULT_INSTANCE;
        public static final int DESC_COMMENT_INFO_FIELD_NUMBER = 20;
        public static final int DOWN_CONTINUE_FLAG_FIELD_NUMBER = 7;
        public static final int JSON_RESP_FIELD_NUMBER = 13;
        public static final int LAST_BUFFER_FIELD_NUMBER = 4;
        public static final int NEXT_CHECK_OBJECT_STATUS_FIELD_NUMBER = 8;
        public static final int OBJECT_FIELD_NUMBER = 3;
        private static volatile C24062w1<FinderGetCommentDetailResponse> PARSER = null;
        public static final int SECONDARY_SHOW_FLAG_FIELD_NUMBER = 9;
        public static final int UP_CONTINUE_FLAG_FIELD_NUMBER = 6;
        private C23908o0.C23919j<FinderCommentInfo> barrageCommentInfo_ = C23861l0.emptyProtobufList();
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private int commentCount_;
        private C23908o0.C23919j<FinderCommentInfo> commentInfo_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<FinderCommentInfo> descCommentInfo_ = C23861l0.emptyProtobufList();
        private int downContinueFlag_;
        private String jsonResp_ = "";
        private C16994k lastBuffer_ = C16994k.f46000e;
        private byte memoizedIsInitialized = 2;
        private int nextCheckObjectStatus_;
        private FinderObject object_;
        private int secondaryShowFlag_;
        private int upContinueFlag_;

        public static final class Builder extends C23861l0.C23862a<FinderGetCommentDetailResponse, Builder> implements FinderGetCommentDetailResponseOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllBarrageCommentInfo(Iterable<? extends FinderCommentInfo> iterable) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addAllBarrageCommentInfo(iterable);
                return this;
            }

            public Builder addAllCommentInfo(Iterable<? extends FinderCommentInfo> iterable) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addAllCommentInfo(iterable);
                return this;
            }

            public Builder addAllDescCommentInfo(Iterable<? extends FinderCommentInfo> iterable) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addAllDescCommentInfo(iterable);
                return this;
            }

            public Builder addBarrageCommentInfo(FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addBarrageCommentInfo(finderCommentInfo);
                return this;
            }

            public Builder addCommentInfo(FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addCommentInfo(finderCommentInfo);
                return this;
            }

            public Builder addDescCommentInfo(FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addDescCommentInfo(finderCommentInfo);
                return this;
            }

            public Builder clearBarrageCommentInfo() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearBarrageCommentInfo();
                return this;
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearCommentCount() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearCommentCount();
                return this;
            }

            public Builder clearCommentInfo() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearCommentInfo();
                return this;
            }

            public Builder clearDescCommentInfo() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearDescCommentInfo();
                return this;
            }

            public Builder clearDownContinueFlag() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearDownContinueFlag();
                return this;
            }

            public Builder clearJsonResp() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearJsonResp();
                return this;
            }

            public Builder clearLastBuffer() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearLastBuffer();
                return this;
            }

            public Builder clearNextCheckObjectStatus() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearNextCheckObjectStatus();
                return this;
            }

            public Builder clearObject() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearObject();
                return this;
            }

            public Builder clearSecondaryShowFlag() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearSecondaryShowFlag();
                return this;
            }

            public Builder clearUpContinueFlag() {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).clearUpContinueFlag();
                return this;
            }

            public FinderCommentInfo getBarrageCommentInfo(int i) {
                return ((FinderGetCommentDetailResponse) this.instance).getBarrageCommentInfo(i);
            }

            public int getBarrageCommentInfoCount() {
                return ((FinderGetCommentDetailResponse) this.instance).getBarrageCommentInfoCount();
            }

            public List<FinderCommentInfo> getBarrageCommentInfoList() {
                return Collections.unmodifiableList(((FinderGetCommentDetailResponse) this.instance).getBarrageCommentInfoList());
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((FinderGetCommentDetailResponse) this.instance).getBaseResponse();
            }

            public int getCommentCount() {
                return ((FinderGetCommentDetailResponse) this.instance).getCommentCount();
            }

            public FinderCommentInfo getCommentInfo(int i) {
                return ((FinderGetCommentDetailResponse) this.instance).getCommentInfo(i);
            }

            public int getCommentInfoCount() {
                return ((FinderGetCommentDetailResponse) this.instance).getCommentInfoCount();
            }

            public List<FinderCommentInfo> getCommentInfoList() {
                return Collections.unmodifiableList(((FinderGetCommentDetailResponse) this.instance).getCommentInfoList());
            }

            public FinderCommentInfo getDescCommentInfo(int i) {
                return ((FinderGetCommentDetailResponse) this.instance).getDescCommentInfo(i);
            }

            public int getDescCommentInfoCount() {
                return ((FinderGetCommentDetailResponse) this.instance).getDescCommentInfoCount();
            }

            public List<FinderCommentInfo> getDescCommentInfoList() {
                return Collections.unmodifiableList(((FinderGetCommentDetailResponse) this.instance).getDescCommentInfoList());
            }

            public int getDownContinueFlag() {
                return ((FinderGetCommentDetailResponse) this.instance).getDownContinueFlag();
            }

            public String getJsonResp() {
                return ((FinderGetCommentDetailResponse) this.instance).getJsonResp();
            }

            public C16994k getJsonRespBytes() {
                return ((FinderGetCommentDetailResponse) this.instance).getJsonRespBytes();
            }

            public C16994k getLastBuffer() {
                return ((FinderGetCommentDetailResponse) this.instance).getLastBuffer();
            }

            public int getNextCheckObjectStatus() {
                return ((FinderGetCommentDetailResponse) this.instance).getNextCheckObjectStatus();
            }

            public FinderObject getObject() {
                return ((FinderGetCommentDetailResponse) this.instance).getObject();
            }

            public int getSecondaryShowFlag() {
                return ((FinderGetCommentDetailResponse) this.instance).getSecondaryShowFlag();
            }

            public int getUpContinueFlag() {
                return ((FinderGetCommentDetailResponse) this.instance).getUpContinueFlag();
            }

            public boolean hasBaseResponse() {
                return ((FinderGetCommentDetailResponse) this.instance).hasBaseResponse();
            }

            public boolean hasCommentCount() {
                return ((FinderGetCommentDetailResponse) this.instance).hasCommentCount();
            }

            public boolean hasDownContinueFlag() {
                return ((FinderGetCommentDetailResponse) this.instance).hasDownContinueFlag();
            }

            public boolean hasJsonResp() {
                return ((FinderGetCommentDetailResponse) this.instance).hasJsonResp();
            }

            public boolean hasLastBuffer() {
                return ((FinderGetCommentDetailResponse) this.instance).hasLastBuffer();
            }

            public boolean hasNextCheckObjectStatus() {
                return ((FinderGetCommentDetailResponse) this.instance).hasNextCheckObjectStatus();
            }

            public boolean hasObject() {
                return ((FinderGetCommentDetailResponse) this.instance).hasObject();
            }

            public boolean hasSecondaryShowFlag() {
                return ((FinderGetCommentDetailResponse) this.instance).hasSecondaryShowFlag();
            }

            public boolean hasUpContinueFlag() {
                return ((FinderGetCommentDetailResponse) this.instance).hasUpContinueFlag();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder mergeObject(FinderObject finderObject) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).mergeObject(finderObject);
                return this;
            }

            public Builder removeBarrageCommentInfo(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).removeBarrageCommentInfo(i);
                return this;
            }

            public Builder removeCommentInfo(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).removeCommentInfo(i);
                return this;
            }

            public Builder removeDescCommentInfo(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).removeDescCommentInfo(i);
                return this;
            }

            public Builder setBarrageCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setBarrageCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setCommentCount(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setCommentCount(i);
                return this;
            }

            public Builder setCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder setDescCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setDescCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder setDownContinueFlag(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setDownContinueFlag(i);
                return this;
            }

            public Builder setJsonResp(String str) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setJsonResp(str);
                return this;
            }

            public Builder setJsonRespBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setJsonRespBytes(kVar);
                return this;
            }

            public Builder setLastBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setLastBuffer(kVar);
                return this;
            }

            public Builder setNextCheckObjectStatus(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setNextCheckObjectStatus(i);
                return this;
            }

            public Builder setObject(FinderObject finderObject) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setObject(finderObject);
                return this;
            }

            public Builder setSecondaryShowFlag(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setSecondaryShowFlag(i);
                return this;
            }

            public Builder setUpContinueFlag(int i) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setUpContinueFlag(i);
                return this;
            }

            private Builder() {
                super(FinderGetCommentDetailResponse.DEFAULT_INSTANCE);
            }

            public Builder addBarrageCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addBarrageCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder addCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder addDescCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addDescCommentInfo(i, finderCommentInfo);
                return this;
            }

            public Builder setBarrageCommentInfo(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setBarrageCommentInfo(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }

            public Builder setCommentInfo(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setCommentInfo(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder setDescCommentInfo(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setDescCommentInfo(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder setObject(FinderObject.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).setObject((FinderObject) builder.build());
                return this;
            }

            public Builder addBarrageCommentInfo(FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addBarrageCommentInfo((FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addCommentInfo(FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addCommentInfo((FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addDescCommentInfo(FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addDescCommentInfo((FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addBarrageCommentInfo(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addBarrageCommentInfo(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addCommentInfo(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addCommentInfo(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addDescCommentInfo(int i, FinderCommentInfo.Builder builder) {
                copyOnWrite();
                ((FinderGetCommentDetailResponse) this.instance).addDescCommentInfo(i, (FinderCommentInfo) builder.build());
                return this;
            }
        }

        static {
            FinderGetCommentDetailResponse finderGetCommentDetailResponse = new FinderGetCommentDetailResponse();
            DEFAULT_INSTANCE = finderGetCommentDetailResponse;
            C23861l0.registerDefaultInstance(FinderGetCommentDetailResponse.class, finderGetCommentDetailResponse);
        }

        private FinderGetCommentDetailResponse() {
        }

        /* access modifiers changed from: private */
        public void addAllBarrageCommentInfo(Iterable<? extends FinderCommentInfo> iterable) {
            ensureBarrageCommentInfoIsMutable();
            C23810b.addAll(iterable, this.barrageCommentInfo_);
        }

        /* access modifiers changed from: private */
        public void addAllCommentInfo(Iterable<? extends FinderCommentInfo> iterable) {
            ensureCommentInfoIsMutable();
            C23810b.addAll(iterable, this.commentInfo_);
        }

        /* access modifiers changed from: private */
        public void addAllDescCommentInfo(Iterable<? extends FinderCommentInfo> iterable) {
            ensureDescCommentInfoIsMutable();
            C23810b.addAll(iterable, this.descCommentInfo_);
        }

        /* access modifiers changed from: private */
        public void addBarrageCommentInfo(FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureBarrageCommentInfoIsMutable();
            this.barrageCommentInfo_.add(finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void addCommentInfo(FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureCommentInfoIsMutable();
            this.commentInfo_.add(finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void addDescCommentInfo(FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureDescCommentInfoIsMutable();
            this.descCommentInfo_.add(finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void clearBarrageCommentInfo() {
            this.barrageCommentInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearCommentCount() {
            this.bitField0_ &= -9;
            this.commentCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCommentInfo() {
            this.commentInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDescCommentInfo() {
            this.descCommentInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearDownContinueFlag() {
            this.bitField0_ &= -33;
            this.downContinueFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearJsonResp() {
            this.bitField0_ &= -257;
            this.jsonResp_ = getDefaultInstance().getJsonResp();
        }

        /* access modifiers changed from: private */
        public void clearLastBuffer() {
            this.bitField0_ &= -5;
            this.lastBuffer_ = getDefaultInstance().getLastBuffer();
        }

        /* access modifiers changed from: private */
        public void clearNextCheckObjectStatus() {
            this.bitField0_ &= -65;
            this.nextCheckObjectStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearObject() {
            this.object_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearSecondaryShowFlag() {
            this.bitField0_ &= -129;
            this.secondaryShowFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUpContinueFlag() {
            this.bitField0_ &= -17;
            this.upContinueFlag_ = 0;
        }

        private void ensureBarrageCommentInfoIsMutable() {
            C23908o0.C23919j<FinderCommentInfo> jVar = this.barrageCommentInfo_;
            if (!jVar.mo37523Q()) {
                this.barrageCommentInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureCommentInfoIsMutable() {
            C23908o0.C23919j<FinderCommentInfo> jVar = this.commentInfo_;
            if (!jVar.mo37523Q()) {
                this.commentInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureDescCommentInfoIsMutable() {
            C23908o0.C23919j<FinderCommentInfo> jVar = this.descCommentInfo_;
            if (!jVar.mo37523Q()) {
                this.descCommentInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderGetCommentDetailResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            MMBaseProto.BaseResponse baseResponse2 = this.baseResponse_;
            if (baseResponse2 == null || baseResponse2 == MMBaseProto.BaseResponse.getDefaultInstance()) {
                this.baseResponse_ = baseResponse;
            } else {
                this.baseResponse_ = (MMBaseProto.BaseResponse) ((MMBaseProto.BaseResponse.Builder) MMBaseProto.BaseResponse.newBuilder(this.baseResponse_).mergeFrom(baseResponse)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeObject(FinderObject finderObject) {
            finderObject.getClass();
            FinderObject finderObject2 = this.object_;
            if (finderObject2 == null || finderObject2 == FinderObject.getDefaultInstance()) {
                this.object_ = finderObject;
            } else {
                this.object_ = (FinderObject) ((FinderObject.Builder) FinderObject.newBuilder(this.object_).mergeFrom(finderObject)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderGetCommentDetailResponse parseDelimitedFrom(InputStream inputStream) {
            return (FinderGetCommentDetailResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderGetCommentDetailResponse parseFrom(ByteBuffer byteBuffer) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderGetCommentDetailResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeBarrageCommentInfo(int i) {
            ensureBarrageCommentInfoIsMutable();
            this.barrageCommentInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeCommentInfo(int i) {
            ensureCommentInfoIsMutable();
            this.commentInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeDescCommentInfo(int i) {
            ensureDescCommentInfoIsMutable();
            this.descCommentInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBarrageCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureBarrageCommentInfoIsMutable();
            this.barrageCommentInfo_.set(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setCommentCount(int i) {
            this.bitField0_ |= 8;
            this.commentCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureCommentInfoIsMutable();
            this.commentInfo_.set(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void setDescCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureDescCommentInfoIsMutable();
            this.descCommentInfo_.set(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void setDownContinueFlag(int i) {
            this.bitField0_ |= 32;
            this.downContinueFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setJsonResp(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.jsonResp_ = str;
        }

        /* access modifiers changed from: private */
        public void setJsonRespBytes(C16994k kVar) {
            this.jsonResp_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setLastBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 4;
            this.lastBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setNextCheckObjectStatus(int i) {
            this.bitField0_ |= 64;
            this.nextCheckObjectStatus_ = i;
        }

        /* access modifiers changed from: private */
        public void setObject(FinderObject finderObject) {
            finderObject.getClass();
            this.object_ = finderObject;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setSecondaryShowFlag(int i) {
            this.bitField0_ |= 128;
            this.secondaryShowFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setUpContinueFlag(int i) {
            this.bitField0_ |= 16;
            this.upContinueFlag_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            Class<FinderCommentInfo> cls = FinderCommentInfo.class;
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\u0014\f\u0000\u0003\u0001\u0001ᐉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ည\u0002\u0005ဋ\u0003\u0006ဋ\u0004\u0007ဋ\u0005\bဋ\u0006\tဋ\u0007\n\u001b\rဈ\b\u0014\u001b", new Object[]{"bitField0_", "baseResponse_", "commentInfo_", cls, "object_", "lastBuffer_", "commentCount_", "upContinueFlag_", "downContinueFlag_", "nextCheckObjectStatus_", "secondaryShowFlag_", "barrageCommentInfo_", cls, "jsonResp_", "descCommentInfo_", cls});
                case 3:
                    return new FinderGetCommentDetailResponse();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderGetCommentDetailResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderGetCommentDetailResponse.class) {
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

        public FinderCommentInfo getBarrageCommentInfo(int i) {
            return this.barrageCommentInfo_.get(i);
        }

        public int getBarrageCommentInfoCount() {
            return this.barrageCommentInfo_.size();
        }

        public List<FinderCommentInfo> getBarrageCommentInfoList() {
            return this.barrageCommentInfo_;
        }

        public FinderCommentInfoOrBuilder getBarrageCommentInfoOrBuilder(int i) {
            return this.barrageCommentInfo_.get(i);
        }

        public List<? extends FinderCommentInfoOrBuilder> getBarrageCommentInfoOrBuilderList() {
            return this.barrageCommentInfo_;
        }

        public MMBaseProto.BaseResponse getBaseResponse() {
            MMBaseProto.BaseResponse baseResponse = this.baseResponse_;
            return baseResponse == null ? MMBaseProto.BaseResponse.getDefaultInstance() : baseResponse;
        }

        public int getCommentCount() {
            return this.commentCount_;
        }

        public FinderCommentInfo getCommentInfo(int i) {
            return this.commentInfo_.get(i);
        }

        public int getCommentInfoCount() {
            return this.commentInfo_.size();
        }

        public List<FinderCommentInfo> getCommentInfoList() {
            return this.commentInfo_;
        }

        public FinderCommentInfoOrBuilder getCommentInfoOrBuilder(int i) {
            return this.commentInfo_.get(i);
        }

        public List<? extends FinderCommentInfoOrBuilder> getCommentInfoOrBuilderList() {
            return this.commentInfo_;
        }

        public FinderCommentInfo getDescCommentInfo(int i) {
            return this.descCommentInfo_.get(i);
        }

        public int getDescCommentInfoCount() {
            return this.descCommentInfo_.size();
        }

        public List<FinderCommentInfo> getDescCommentInfoList() {
            return this.descCommentInfo_;
        }

        public FinderCommentInfoOrBuilder getDescCommentInfoOrBuilder(int i) {
            return this.descCommentInfo_.get(i);
        }

        public List<? extends FinderCommentInfoOrBuilder> getDescCommentInfoOrBuilderList() {
            return this.descCommentInfo_;
        }

        public int getDownContinueFlag() {
            return this.downContinueFlag_;
        }

        public String getJsonResp() {
            return this.jsonResp_;
        }

        public C16994k getJsonRespBytes() {
            return C16994k.m16791k(this.jsonResp_);
        }

        public C16994k getLastBuffer() {
            return this.lastBuffer_;
        }

        public int getNextCheckObjectStatus() {
            return this.nextCheckObjectStatus_;
        }

        public FinderObject getObject() {
            FinderObject finderObject = this.object_;
            return finderObject == null ? FinderObject.getDefaultInstance() : finderObject;
        }

        public int getSecondaryShowFlag() {
            return this.secondaryShowFlag_;
        }

        public int getUpContinueFlag() {
            return this.upContinueFlag_;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCommentCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDownContinueFlag() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasJsonResp() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasLastBuffer() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasNextCheckObjectStatus() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasObject() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSecondaryShowFlag() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasUpContinueFlag() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(FinderGetCommentDetailResponse finderGetCommentDetailResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderGetCommentDetailResponse);
        }

        public static FinderGetCommentDetailResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderGetCommentDetailResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderGetCommentDetailResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderGetCommentDetailResponse parseFrom(C16994k kVar) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addBarrageCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureBarrageCommentInfoIsMutable();
            this.barrageCommentInfo_.add(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void addCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureCommentInfoIsMutable();
            this.commentInfo_.add(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void addDescCommentInfo(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureDescCommentInfoIsMutable();
            this.descCommentInfo_.add(i, finderCommentInfo);
        }

        public static FinderGetCommentDetailResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderGetCommentDetailResponse parseFrom(byte[] bArr) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderGetCommentDetailResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderGetCommentDetailResponse parseFrom(InputStream inputStream) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderGetCommentDetailResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderGetCommentDetailResponse parseFrom(C23856l lVar) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderGetCommentDetailResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderGetCommentDetailResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderGetCommentDetailResponseOrBuilder extends C23848k1 {
        FinderCommentInfo getBarrageCommentInfo(int i);

        int getBarrageCommentInfoCount();

        List<FinderCommentInfo> getBarrageCommentInfoList();

        MMBaseProto.BaseResponse getBaseResponse();

        int getCommentCount();

        FinderCommentInfo getCommentInfo(int i);

        int getCommentInfoCount();

        List<FinderCommentInfo> getCommentInfoList();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderCommentInfo getDescCommentInfo(int i);

        int getDescCommentInfoCount();

        List<FinderCommentInfo> getDescCommentInfoList();

        int getDownContinueFlag();

        String getJsonResp();

        C16994k getJsonRespBytes();

        C16994k getLastBuffer();

        int getNextCheckObjectStatus();

        FinderObject getObject();

        int getSecondaryShowFlag();

        int getUpContinueFlag();

        boolean hasBaseResponse();

        boolean hasCommentCount();

        boolean hasDownContinueFlag();

        boolean hasJsonResp();

        boolean hasLastBuffer();

        boolean hasNextCheckObjectStatus();

        boolean hasObject();

        boolean hasSecondaryShowFlag();

        boolean hasUpContinueFlag();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderHdrMediaSpecList extends C23861l0<FinderHdrMediaSpecList, Builder> implements FinderHdrMediaSpecListOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderHdrMediaSpecList DEFAULT_INSTANCE;
        public static final int HDR_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<FinderHdrMediaSpecList> PARSER;
        private C23908o0.C23919j<FinderMediaSpec> hdrList_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FinderHdrMediaSpecList, Builder> implements FinderHdrMediaSpecListOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllHdrList(Iterable<? extends FinderMediaSpec> iterable) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).addAllHdrList(iterable);
                return this;
            }

            public Builder addHdrList(FinderMediaSpec finderMediaSpec) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).addHdrList(finderMediaSpec);
                return this;
            }

            public Builder clearHdrList() {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).clearHdrList();
                return this;
            }

            public FinderMediaSpec getHdrList(int i) {
                return ((FinderHdrMediaSpecList) this.instance).getHdrList(i);
            }

            public int getHdrListCount() {
                return ((FinderHdrMediaSpecList) this.instance).getHdrListCount();
            }

            public List<FinderMediaSpec> getHdrListList() {
                return Collections.unmodifiableList(((FinderHdrMediaSpecList) this.instance).getHdrListList());
            }

            public Builder removeHdrList(int i) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).removeHdrList(i);
                return this;
            }

            public Builder setHdrList(int i, FinderMediaSpec finderMediaSpec) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).setHdrList(i, finderMediaSpec);
                return this;
            }

            private Builder() {
                super(FinderHdrMediaSpecList.DEFAULT_INSTANCE);
            }

            public Builder addHdrList(int i, FinderMediaSpec finderMediaSpec) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).addHdrList(i, finderMediaSpec);
                return this;
            }

            public Builder setHdrList(int i, FinderMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).setHdrList(i, (FinderMediaSpec) builder.build());
                return this;
            }

            public Builder addHdrList(FinderMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).addHdrList((FinderMediaSpec) builder.build());
                return this;
            }

            public Builder addHdrList(int i, FinderMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderHdrMediaSpecList) this.instance).addHdrList(i, (FinderMediaSpec) builder.build());
                return this;
            }
        }

        static {
            FinderHdrMediaSpecList finderHdrMediaSpecList = new FinderHdrMediaSpecList();
            DEFAULT_INSTANCE = finderHdrMediaSpecList;
            C23861l0.registerDefaultInstance(FinderHdrMediaSpecList.class, finderHdrMediaSpecList);
        }

        private FinderHdrMediaSpecList() {
        }

        /* access modifiers changed from: private */
        public void addAllHdrList(Iterable<? extends FinderMediaSpec> iterable) {
            ensureHdrListIsMutable();
            C23810b.addAll(iterable, this.hdrList_);
        }

        /* access modifiers changed from: private */
        public void addHdrList(FinderMediaSpec finderMediaSpec) {
            finderMediaSpec.getClass();
            ensureHdrListIsMutable();
            this.hdrList_.add(finderMediaSpec);
        }

        /* access modifiers changed from: private */
        public void clearHdrList() {
            this.hdrList_ = C23861l0.emptyProtobufList();
        }

        private void ensureHdrListIsMutable() {
            C23908o0.C23919j<FinderMediaSpec> jVar = this.hdrList_;
            if (!jVar.mo37523Q()) {
                this.hdrList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderHdrMediaSpecList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderHdrMediaSpecList parseDelimitedFrom(InputStream inputStream) {
            return (FinderHdrMediaSpecList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderHdrMediaSpecList parseFrom(ByteBuffer byteBuffer) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderHdrMediaSpecList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeHdrList(int i) {
            ensureHdrListIsMutable();
            this.hdrList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setHdrList(int i, FinderMediaSpec finderMediaSpec) {
            finderMediaSpec.getClass();
            ensureHdrListIsMutable();
            this.hdrList_.set(i, finderMediaSpec);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hdrList_", FinderMediaSpec.class});
                case 3:
                    return new FinderHdrMediaSpecList();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderHdrMediaSpecList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderHdrMediaSpecList.class) {
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

        public FinderMediaSpec getHdrList(int i) {
            return this.hdrList_.get(i);
        }

        public int getHdrListCount() {
            return this.hdrList_.size();
        }

        public List<FinderMediaSpec> getHdrListList() {
            return this.hdrList_;
        }

        public FinderMediaSpecOrBuilder getHdrListOrBuilder(int i) {
            return this.hdrList_.get(i);
        }

        public List<? extends FinderMediaSpecOrBuilder> getHdrListOrBuilderList() {
            return this.hdrList_;
        }

        public static Builder newBuilder(FinderHdrMediaSpecList finderHdrMediaSpecList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderHdrMediaSpecList);
        }

        public static FinderHdrMediaSpecList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderHdrMediaSpecList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderHdrMediaSpecList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderHdrMediaSpecList parseFrom(C16994k kVar) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addHdrList(int i, FinderMediaSpec finderMediaSpec) {
            finderMediaSpec.getClass();
            ensureHdrListIsMutable();
            this.hdrList_.add(i, finderMediaSpec);
        }

        public static FinderHdrMediaSpecList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderHdrMediaSpecList parseFrom(byte[] bArr) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderHdrMediaSpecList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderHdrMediaSpecList parseFrom(InputStream inputStream) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderHdrMediaSpecList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderHdrMediaSpecList parseFrom(C23856l lVar) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderHdrMediaSpecList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderHdrMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderHdrMediaSpecListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderMediaSpec getHdrList(int i);

        int getHdrListCount();

        List<FinderMediaSpec> getHdrListList();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderHlsMediaSpec extends C23861l0<FinderHlsMediaSpec, Builder> implements FinderHlsMediaSpecOrBuilder {
        public static final int BIT_RATE_FIELD_NUMBER = 3;
        public static final int CODING_FORMAT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final FinderHlsMediaSpec DEFAULT_INSTANCE;
        public static final int DYNAMIC_RANGE_TYPE_FIELD_NUMBER = 5;
        public static final int FILE_FORMAT_FIELD_NUMBER = 1;
        public static final int FIRST_LOAD_BYTES_FIELD_NUMBER = 2;
        public static final int HEIGHT_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderHlsMediaSpec> PARSER = null;
        public static final int VFPS_FIELD_NUMBER = 6;
        public static final int WIDTH_FIELD_NUMBER = 7;
        private int bitField0_;
        private int bitRate_;
        private String codingFormat_ = "";
        private int dynamicRangeType_;
        private String fileFormat_ = "";
        private int firstLoadBytes_;
        private int height_;
        private float vfps_;
        private int width_;

        public static final class Builder extends C23861l0.C23862a<FinderHlsMediaSpec, Builder> implements FinderHlsMediaSpecOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearBitRate() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearBitRate();
                return this;
            }

            public Builder clearCodingFormat() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearCodingFormat();
                return this;
            }

            public Builder clearDynamicRangeType() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearDynamicRangeType();
                return this;
            }

            public Builder clearFileFormat() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearFileFormat();
                return this;
            }

            public Builder clearFirstLoadBytes() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearFirstLoadBytes();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearHeight();
                return this;
            }

            public Builder clearVfps() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearVfps();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).clearWidth();
                return this;
            }

            public int getBitRate() {
                return ((FinderHlsMediaSpec) this.instance).getBitRate();
            }

            public String getCodingFormat() {
                return ((FinderHlsMediaSpec) this.instance).getCodingFormat();
            }

            public C16994k getCodingFormatBytes() {
                return ((FinderHlsMediaSpec) this.instance).getCodingFormatBytes();
            }

            public int getDynamicRangeType() {
                return ((FinderHlsMediaSpec) this.instance).getDynamicRangeType();
            }

            public String getFileFormat() {
                return ((FinderHlsMediaSpec) this.instance).getFileFormat();
            }

            public C16994k getFileFormatBytes() {
                return ((FinderHlsMediaSpec) this.instance).getFileFormatBytes();
            }

            public int getFirstLoadBytes() {
                return ((FinderHlsMediaSpec) this.instance).getFirstLoadBytes();
            }

            public int getHeight() {
                return ((FinderHlsMediaSpec) this.instance).getHeight();
            }

            public float getVfps() {
                return ((FinderHlsMediaSpec) this.instance).getVfps();
            }

            public int getWidth() {
                return ((FinderHlsMediaSpec) this.instance).getWidth();
            }

            public boolean hasBitRate() {
                return ((FinderHlsMediaSpec) this.instance).hasBitRate();
            }

            public boolean hasCodingFormat() {
                return ((FinderHlsMediaSpec) this.instance).hasCodingFormat();
            }

            public boolean hasDynamicRangeType() {
                return ((FinderHlsMediaSpec) this.instance).hasDynamicRangeType();
            }

            public boolean hasFileFormat() {
                return ((FinderHlsMediaSpec) this.instance).hasFileFormat();
            }

            public boolean hasFirstLoadBytes() {
                return ((FinderHlsMediaSpec) this.instance).hasFirstLoadBytes();
            }

            public boolean hasHeight() {
                return ((FinderHlsMediaSpec) this.instance).hasHeight();
            }

            public boolean hasVfps() {
                return ((FinderHlsMediaSpec) this.instance).hasVfps();
            }

            public boolean hasWidth() {
                return ((FinderHlsMediaSpec) this.instance).hasWidth();
            }

            public Builder setBitRate(int i) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setBitRate(i);
                return this;
            }

            public Builder setCodingFormat(String str) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setCodingFormat(str);
                return this;
            }

            public Builder setCodingFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setCodingFormatBytes(kVar);
                return this;
            }

            public Builder setDynamicRangeType(int i) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setDynamicRangeType(i);
                return this;
            }

            public Builder setFileFormat(String str) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setFileFormat(str);
                return this;
            }

            public Builder setFileFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setFileFormatBytes(kVar);
                return this;
            }

            public Builder setFirstLoadBytes(int i) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setFirstLoadBytes(i);
                return this;
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setHeight(i);
                return this;
            }

            public Builder setVfps(float f) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setVfps(f);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((FinderHlsMediaSpec) this.instance).setWidth(i);
                return this;
            }

            private Builder() {
                super(FinderHlsMediaSpec.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderHlsMediaSpec finderHlsMediaSpec = new FinderHlsMediaSpec();
            DEFAULT_INSTANCE = finderHlsMediaSpec;
            C23861l0.registerDefaultInstance(FinderHlsMediaSpec.class, finderHlsMediaSpec);
        }

        private FinderHlsMediaSpec() {
        }

        /* access modifiers changed from: private */
        public void clearBitRate() {
            this.bitField0_ &= -5;
            this.bitRate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCodingFormat() {
            this.bitField0_ &= -9;
            this.codingFormat_ = getDefaultInstance().getCodingFormat();
        }

        /* access modifiers changed from: private */
        public void clearDynamicRangeType() {
            this.bitField0_ &= -17;
            this.dynamicRangeType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileFormat() {
            this.bitField0_ &= -2;
            this.fileFormat_ = getDefaultInstance().getFileFormat();
        }

        /* access modifiers changed from: private */
        public void clearFirstLoadBytes() {
            this.bitField0_ &= -3;
            this.firstLoadBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -129;
            this.height_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVfps() {
            this.bitField0_ &= -33;
            this.vfps_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -65;
            this.width_ = 0;
        }

        public static FinderHlsMediaSpec getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderHlsMediaSpec parseDelimitedFrom(InputStream inputStream) {
            return (FinderHlsMediaSpec) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderHlsMediaSpec parseFrom(ByteBuffer byteBuffer) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderHlsMediaSpec> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBitRate(int i) {
            this.bitField0_ |= 4;
            this.bitRate_ = i;
        }

        /* access modifiers changed from: private */
        public void setCodingFormat(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.codingFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setCodingFormatBytes(C16994k kVar) {
            this.codingFormat_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setDynamicRangeType(int i) {
            this.bitField0_ |= 16;
            this.dynamicRangeType_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileFormat(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fileFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setFileFormatBytes(C16994k kVar) {
            this.fileFormat_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setFirstLoadBytes(int i) {
            this.bitField0_ |= 2;
            this.firstLoadBytes_ = i;
        }

        /* access modifiers changed from: private */
        public void setHeight(int i) {
            this.bitField0_ |= 128;
            this.height_ = i;
        }

        /* access modifiers changed from: private */
        public void setVfps(float f) {
            this.bitField0_ |= 32;
            this.vfps_ = f;
        }

        /* access modifiers changed from: private */
        public void setWidth(int i) {
            this.bitField0_ |= 64;
            this.width_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ခ\u0005\u0007ဋ\u0006\bဋ\u0007", new Object[]{"bitField0_", "fileFormat_", "firstLoadBytes_", "bitRate_", "codingFormat_", "dynamicRangeType_", "vfps_", "width_", "height_"});
                case 3:
                    return new FinderHlsMediaSpec();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderHlsMediaSpec> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderHlsMediaSpec.class) {
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

        public int getBitRate() {
            return this.bitRate_;
        }

        public String getCodingFormat() {
            return this.codingFormat_;
        }

        public C16994k getCodingFormatBytes() {
            return C16994k.m16791k(this.codingFormat_);
        }

        public int getDynamicRangeType() {
            return this.dynamicRangeType_;
        }

        public String getFileFormat() {
            return this.fileFormat_;
        }

        public C16994k getFileFormatBytes() {
            return C16994k.m16791k(this.fileFormat_);
        }

        public int getFirstLoadBytes() {
            return this.firstLoadBytes_;
        }

        public int getHeight() {
            return this.height_;
        }

        public float getVfps() {
            return this.vfps_;
        }

        public int getWidth() {
            return this.width_;
        }

        public boolean hasBitRate() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCodingFormat() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDynamicRangeType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFileFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFirstLoadBytes() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasVfps() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(FinderHlsMediaSpec finderHlsMediaSpec) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderHlsMediaSpec);
        }

        public static FinderHlsMediaSpec parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderHlsMediaSpec) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderHlsMediaSpec parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderHlsMediaSpec parseFrom(C16994k kVar) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderHlsMediaSpec parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderHlsMediaSpec parseFrom(byte[] bArr) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderHlsMediaSpec parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderHlsMediaSpec parseFrom(InputStream inputStream) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderHlsMediaSpec parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderHlsMediaSpec parseFrom(C23856l lVar) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderHlsMediaSpec parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderHlsMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderHlsMediaSpecList extends C23861l0<FinderHlsMediaSpecList, Builder> implements FinderHlsMediaSpecListOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderHlsMediaSpecList DEFAULT_INSTANCE;
        public static final int HLS_LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<FinderHlsMediaSpecList> PARSER;
        private C23908o0.C23919j<FinderHlsMediaSpec> hlsList_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FinderHlsMediaSpecList, Builder> implements FinderHlsMediaSpecListOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllHlsList(Iterable<? extends FinderHlsMediaSpec> iterable) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).addAllHlsList(iterable);
                return this;
            }

            public Builder addHlsList(FinderHlsMediaSpec finderHlsMediaSpec) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).addHlsList(finderHlsMediaSpec);
                return this;
            }

            public Builder clearHlsList() {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).clearHlsList();
                return this;
            }

            public FinderHlsMediaSpec getHlsList(int i) {
                return ((FinderHlsMediaSpecList) this.instance).getHlsList(i);
            }

            public int getHlsListCount() {
                return ((FinderHlsMediaSpecList) this.instance).getHlsListCount();
            }

            public List<FinderHlsMediaSpec> getHlsListList() {
                return Collections.unmodifiableList(((FinderHlsMediaSpecList) this.instance).getHlsListList());
            }

            public Builder removeHlsList(int i) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).removeHlsList(i);
                return this;
            }

            public Builder setHlsList(int i, FinderHlsMediaSpec finderHlsMediaSpec) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).setHlsList(i, finderHlsMediaSpec);
                return this;
            }

            private Builder() {
                super(FinderHlsMediaSpecList.DEFAULT_INSTANCE);
            }

            public Builder addHlsList(int i, FinderHlsMediaSpec finderHlsMediaSpec) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).addHlsList(i, finderHlsMediaSpec);
                return this;
            }

            public Builder setHlsList(int i, FinderHlsMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).setHlsList(i, (FinderHlsMediaSpec) builder.build());
                return this;
            }

            public Builder addHlsList(FinderHlsMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).addHlsList((FinderHlsMediaSpec) builder.build());
                return this;
            }

            public Builder addHlsList(int i, FinderHlsMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderHlsMediaSpecList) this.instance).addHlsList(i, (FinderHlsMediaSpec) builder.build());
                return this;
            }
        }

        static {
            FinderHlsMediaSpecList finderHlsMediaSpecList = new FinderHlsMediaSpecList();
            DEFAULT_INSTANCE = finderHlsMediaSpecList;
            C23861l0.registerDefaultInstance(FinderHlsMediaSpecList.class, finderHlsMediaSpecList);
        }

        private FinderHlsMediaSpecList() {
        }

        /* access modifiers changed from: private */
        public void addAllHlsList(Iterable<? extends FinderHlsMediaSpec> iterable) {
            ensureHlsListIsMutable();
            C23810b.addAll(iterable, this.hlsList_);
        }

        /* access modifiers changed from: private */
        public void addHlsList(FinderHlsMediaSpec finderHlsMediaSpec) {
            finderHlsMediaSpec.getClass();
            ensureHlsListIsMutable();
            this.hlsList_.add(finderHlsMediaSpec);
        }

        /* access modifiers changed from: private */
        public void clearHlsList() {
            this.hlsList_ = C23861l0.emptyProtobufList();
        }

        private void ensureHlsListIsMutable() {
            C23908o0.C23919j<FinderHlsMediaSpec> jVar = this.hlsList_;
            if (!jVar.mo37523Q()) {
                this.hlsList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderHlsMediaSpecList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderHlsMediaSpecList parseDelimitedFrom(InputStream inputStream) {
            return (FinderHlsMediaSpecList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderHlsMediaSpecList parseFrom(ByteBuffer byteBuffer) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderHlsMediaSpecList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeHlsList(int i) {
            ensureHlsListIsMutable();
            this.hlsList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setHlsList(int i, FinderHlsMediaSpec finderHlsMediaSpec) {
            finderHlsMediaSpec.getClass();
            ensureHlsListIsMutable();
            this.hlsList_.set(i, finderHlsMediaSpec);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"hlsList_", FinderHlsMediaSpec.class});
                case 3:
                    return new FinderHlsMediaSpecList();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderHlsMediaSpecList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderHlsMediaSpecList.class) {
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

        public FinderHlsMediaSpec getHlsList(int i) {
            return this.hlsList_.get(i);
        }

        public int getHlsListCount() {
            return this.hlsList_.size();
        }

        public List<FinderHlsMediaSpec> getHlsListList() {
            return this.hlsList_;
        }

        public FinderHlsMediaSpecOrBuilder getHlsListOrBuilder(int i) {
            return this.hlsList_.get(i);
        }

        public List<? extends FinderHlsMediaSpecOrBuilder> getHlsListOrBuilderList() {
            return this.hlsList_;
        }

        public static Builder newBuilder(FinderHlsMediaSpecList finderHlsMediaSpecList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderHlsMediaSpecList);
        }

        public static FinderHlsMediaSpecList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderHlsMediaSpecList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderHlsMediaSpecList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderHlsMediaSpecList parseFrom(C16994k kVar) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addHlsList(int i, FinderHlsMediaSpec finderHlsMediaSpec) {
            finderHlsMediaSpec.getClass();
            ensureHlsListIsMutable();
            this.hlsList_.add(i, finderHlsMediaSpec);
        }

        public static FinderHlsMediaSpecList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderHlsMediaSpecList parseFrom(byte[] bArr) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderHlsMediaSpecList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderHlsMediaSpecList parseFrom(InputStream inputStream) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderHlsMediaSpecList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderHlsMediaSpecList parseFrom(C23856l lVar) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderHlsMediaSpecList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderHlsMediaSpecList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderHlsMediaSpecListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        FinderHlsMediaSpec getHlsList(int i);

        int getHlsListCount();

        List<FinderHlsMediaSpec> getHlsListList();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderHlsMediaSpecOrBuilder extends C23848k1 {
        int getBitRate();

        String getCodingFormat();

        C16994k getCodingFormatBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDynamicRangeType();

        String getFileFormat();

        C16994k getFileFormatBytes();

        int getFirstLoadBytes();

        int getHeight();

        float getVfps();

        int getWidth();

        boolean hasBitRate();

        boolean hasCodingFormat();

        boolean hasDynamicRangeType();

        boolean hasFileFormat();

        boolean hasFirstLoadBytes();

        boolean hasHeight();

        boolean hasVfps();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderIpRegionInfo extends C23861l0<FinderIpRegionInfo, Builder> implements FinderIpRegionInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderIpRegionInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderIpRegionInfo> PARSER = null;
        public static final int REGION_TEXT_FIELD_NUMBER = 1;
        private int bitField0_;
        private String regionText_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderIpRegionInfo, Builder> implements FinderIpRegionInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearRegionText() {
                copyOnWrite();
                ((FinderIpRegionInfo) this.instance).clearRegionText();
                return this;
            }

            public String getRegionText() {
                return ((FinderIpRegionInfo) this.instance).getRegionText();
            }

            public C16994k getRegionTextBytes() {
                return ((FinderIpRegionInfo) this.instance).getRegionTextBytes();
            }

            public boolean hasRegionText() {
                return ((FinderIpRegionInfo) this.instance).hasRegionText();
            }

            public Builder setRegionText(String str) {
                copyOnWrite();
                ((FinderIpRegionInfo) this.instance).setRegionText(str);
                return this;
            }

            public Builder setRegionTextBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderIpRegionInfo) this.instance).setRegionTextBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderIpRegionInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderIpRegionInfo finderIpRegionInfo = new FinderIpRegionInfo();
            DEFAULT_INSTANCE = finderIpRegionInfo;
            C23861l0.registerDefaultInstance(FinderIpRegionInfo.class, finderIpRegionInfo);
        }

        private FinderIpRegionInfo() {
        }

        /* access modifiers changed from: private */
        public void clearRegionText() {
            this.bitField0_ &= -2;
            this.regionText_ = getDefaultInstance().getRegionText();
        }

        public static FinderIpRegionInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderIpRegionInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderIpRegionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderIpRegionInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderIpRegionInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setRegionText(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.regionText_ = str;
        }

        /* access modifiers changed from: private */
        public void setRegionTextBytes(C16994k kVar) {
            this.regionText_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "regionText_"});
                case 3:
                    return new FinderIpRegionInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderIpRegionInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderIpRegionInfo.class) {
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

        public String getRegionText() {
            return this.regionText_;
        }

        public C16994k getRegionTextBytes() {
            return C16994k.m16791k(this.regionText_);
        }

        public boolean hasRegionText() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FinderIpRegionInfo finderIpRegionInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderIpRegionInfo);
        }

        public static FinderIpRegionInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderIpRegionInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderIpRegionInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderIpRegionInfo parseFrom(C16994k kVar) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderIpRegionInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderIpRegionInfo parseFrom(byte[] bArr) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderIpRegionInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderIpRegionInfo parseFrom(InputStream inputStream) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderIpRegionInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderIpRegionInfo parseFrom(C23856l lVar) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderIpRegionInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderIpRegionInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderIpRegionInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getRegionText();

        C16994k getRegionTextBytes();

        boolean hasRegionText();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderLiveCdnTransInfo extends C23861l0<FinderLiveCdnTransInfo, Builder> implements FinderLiveCdnTransInfoOrBuilder {
        public static final int BITRATE_FIELD_NUMBER = 2;
        public static final int CODINGFORMAT_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final FinderLiveCdnTransInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderLiveCdnTransInfo> PARSER;
        private int bitField0_;
        private int bitRate_;
        private String codingFormat_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderLiveCdnTransInfo, Builder> implements FinderLiveCdnTransInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearBitRate() {
                copyOnWrite();
                ((FinderLiveCdnTransInfo) this.instance).clearBitRate();
                return this;
            }

            public Builder clearCodingFormat() {
                copyOnWrite();
                ((FinderLiveCdnTransInfo) this.instance).clearCodingFormat();
                return this;
            }

            public int getBitRate() {
                return ((FinderLiveCdnTransInfo) this.instance).getBitRate();
            }

            public String getCodingFormat() {
                return ((FinderLiveCdnTransInfo) this.instance).getCodingFormat();
            }

            public C16994k getCodingFormatBytes() {
                return ((FinderLiveCdnTransInfo) this.instance).getCodingFormatBytes();
            }

            public boolean hasBitRate() {
                return ((FinderLiveCdnTransInfo) this.instance).hasBitRate();
            }

            public boolean hasCodingFormat() {
                return ((FinderLiveCdnTransInfo) this.instance).hasCodingFormat();
            }

            public Builder setBitRate(int i) {
                copyOnWrite();
                ((FinderLiveCdnTransInfo) this.instance).setBitRate(i);
                return this;
            }

            public Builder setCodingFormat(String str) {
                copyOnWrite();
                ((FinderLiveCdnTransInfo) this.instance).setCodingFormat(str);
                return this;
            }

            public Builder setCodingFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLiveCdnTransInfo) this.instance).setCodingFormatBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderLiveCdnTransInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderLiveCdnTransInfo finderLiveCdnTransInfo = new FinderLiveCdnTransInfo();
            DEFAULT_INSTANCE = finderLiveCdnTransInfo;
            C23861l0.registerDefaultInstance(FinderLiveCdnTransInfo.class, finderLiveCdnTransInfo);
        }

        private FinderLiveCdnTransInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBitRate() {
            this.bitField0_ &= -2;
            this.bitRate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCodingFormat() {
            this.bitField0_ &= -3;
            this.codingFormat_ = getDefaultInstance().getCodingFormat();
        }

        public static FinderLiveCdnTransInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderLiveCdnTransInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderLiveCdnTransInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLiveCdnTransInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderLiveCdnTransInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBitRate(int i) {
            this.bitField0_ |= 1;
            this.bitRate_ = i;
        }

        /* access modifiers changed from: private */
        public void setCodingFormat(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.codingFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setCodingFormatBytes(C16994k kVar) {
            this.codingFormat_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဋ\u0000\u0003ဈ\u0001", new Object[]{"bitField0_", "bitRate_", "codingFormat_"});
                case 3:
                    return new FinderLiveCdnTransInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderLiveCdnTransInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderLiveCdnTransInfo.class) {
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

        public int getBitRate() {
            return this.bitRate_;
        }

        public String getCodingFormat() {
            return this.codingFormat_;
        }

        public C16994k getCodingFormatBytes() {
            return C16994k.m16791k(this.codingFormat_);
        }

        public boolean hasBitRate() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCodingFormat() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderLiveCdnTransInfo);
        }

        public static FinderLiveCdnTransInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLiveCdnTransInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLiveCdnTransInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderLiveCdnTransInfo parseFrom(C16994k kVar) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderLiveCdnTransInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderLiveCdnTransInfo parseFrom(byte[] bArr) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderLiveCdnTransInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderLiveCdnTransInfo parseFrom(InputStream inputStream) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLiveCdnTransInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLiveCdnTransInfo parseFrom(C23856l lVar) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderLiveCdnTransInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderLiveCdnTransInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderLiveCdnTransInfoOrBuilder extends C23848k1 {
        int getBitRate();

        String getCodingFormat();

        C16994k getCodingFormatBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBitRate();

        boolean hasCodingFormat();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderLiveMediaSpec extends C23861l0<FinderLiveMediaSpec, Builder> implements FinderLiveMediaSpecOrBuilder {
        public static final int AUDIENCE_CDN_QUALITY_CFG_FIELD_NUMBER = 3;
        public static final int AUDIENCE_CDN_URL_FIELD_NUMBER = 4;
        public static final int CDNTRANSINFO_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final FinderLiveMediaSpec DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderLiveMediaSpec> PARSER;
        private int audienceCdnQualityCfg_;
        private String audienceCdnUrl_ = "";
        private int bitField0_;
        private C23908o0.C23919j<FinderLiveCdnTransInfo> cdnTransInfo_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FinderLiveMediaSpec, Builder> implements FinderLiveMediaSpecOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllCdnTransInfo(Iterable<? extends FinderLiveCdnTransInfo> iterable) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).addAllCdnTransInfo(iterable);
                return this;
            }

            public Builder addCdnTransInfo(FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).addCdnTransInfo(finderLiveCdnTransInfo);
                return this;
            }

            public Builder clearAudienceCdnQualityCfg() {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).clearAudienceCdnQualityCfg();
                return this;
            }

            public Builder clearAudienceCdnUrl() {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).clearAudienceCdnUrl();
                return this;
            }

            public Builder clearCdnTransInfo() {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).clearCdnTransInfo();
                return this;
            }

            public int getAudienceCdnQualityCfg() {
                return ((FinderLiveMediaSpec) this.instance).getAudienceCdnQualityCfg();
            }

            public String getAudienceCdnUrl() {
                return ((FinderLiveMediaSpec) this.instance).getAudienceCdnUrl();
            }

            public C16994k getAudienceCdnUrlBytes() {
                return ((FinderLiveMediaSpec) this.instance).getAudienceCdnUrlBytes();
            }

            public FinderLiveCdnTransInfo getCdnTransInfo(int i) {
                return ((FinderLiveMediaSpec) this.instance).getCdnTransInfo(i);
            }

            public int getCdnTransInfoCount() {
                return ((FinderLiveMediaSpec) this.instance).getCdnTransInfoCount();
            }

            public List<FinderLiveCdnTransInfo> getCdnTransInfoList() {
                return Collections.unmodifiableList(((FinderLiveMediaSpec) this.instance).getCdnTransInfoList());
            }

            public boolean hasAudienceCdnQualityCfg() {
                return ((FinderLiveMediaSpec) this.instance).hasAudienceCdnQualityCfg();
            }

            public boolean hasAudienceCdnUrl() {
                return ((FinderLiveMediaSpec) this.instance).hasAudienceCdnUrl();
            }

            public Builder removeCdnTransInfo(int i) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).removeCdnTransInfo(i);
                return this;
            }

            public Builder setAudienceCdnQualityCfg(int i) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).setAudienceCdnQualityCfg(i);
                return this;
            }

            public Builder setAudienceCdnUrl(String str) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).setAudienceCdnUrl(str);
                return this;
            }

            public Builder setAudienceCdnUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).setAudienceCdnUrlBytes(kVar);
                return this;
            }

            public Builder setCdnTransInfo(int i, FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).setCdnTransInfo(i, finderLiveCdnTransInfo);
                return this;
            }

            private Builder() {
                super(FinderLiveMediaSpec.DEFAULT_INSTANCE);
            }

            public Builder addCdnTransInfo(int i, FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).addCdnTransInfo(i, finderLiveCdnTransInfo);
                return this;
            }

            public Builder setCdnTransInfo(int i, FinderLiveCdnTransInfo.Builder builder) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).setCdnTransInfo(i, (FinderLiveCdnTransInfo) builder.build());
                return this;
            }

            public Builder addCdnTransInfo(FinderLiveCdnTransInfo.Builder builder) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).addCdnTransInfo((FinderLiveCdnTransInfo) builder.build());
                return this;
            }

            public Builder addCdnTransInfo(int i, FinderLiveCdnTransInfo.Builder builder) {
                copyOnWrite();
                ((FinderLiveMediaSpec) this.instance).addCdnTransInfo(i, (FinderLiveCdnTransInfo) builder.build());
                return this;
            }
        }

        static {
            FinderLiveMediaSpec finderLiveMediaSpec = new FinderLiveMediaSpec();
            DEFAULT_INSTANCE = finderLiveMediaSpec;
            C23861l0.registerDefaultInstance(FinderLiveMediaSpec.class, finderLiveMediaSpec);
        }

        private FinderLiveMediaSpec() {
        }

        /* access modifiers changed from: private */
        public void addAllCdnTransInfo(Iterable<? extends FinderLiveCdnTransInfo> iterable) {
            ensureCdnTransInfoIsMutable();
            C23810b.addAll(iterable, this.cdnTransInfo_);
        }

        /* access modifiers changed from: private */
        public void addCdnTransInfo(FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
            finderLiveCdnTransInfo.getClass();
            ensureCdnTransInfoIsMutable();
            this.cdnTransInfo_.add(finderLiveCdnTransInfo);
        }

        /* access modifiers changed from: private */
        public void clearAudienceCdnQualityCfg() {
            this.bitField0_ &= -2;
            this.audienceCdnQualityCfg_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearAudienceCdnUrl() {
            this.bitField0_ &= -3;
            this.audienceCdnUrl_ = getDefaultInstance().getAudienceCdnUrl();
        }

        /* access modifiers changed from: private */
        public void clearCdnTransInfo() {
            this.cdnTransInfo_ = C23861l0.emptyProtobufList();
        }

        private void ensureCdnTransInfoIsMutable() {
            C23908o0.C23919j<FinderLiveCdnTransInfo> jVar = this.cdnTransInfo_;
            if (!jVar.mo37523Q()) {
                this.cdnTransInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderLiveMediaSpec getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderLiveMediaSpec parseDelimitedFrom(InputStream inputStream) {
            return (FinderLiveMediaSpec) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLiveMediaSpec parseFrom(ByteBuffer byteBuffer) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderLiveMediaSpec> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeCdnTransInfo(int i) {
            ensureCdnTransInfoIsMutable();
            this.cdnTransInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAudienceCdnQualityCfg(int i) {
            this.bitField0_ |= 1;
            this.audienceCdnQualityCfg_ = i;
        }

        /* access modifiers changed from: private */
        public void setAudienceCdnUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.audienceCdnUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setAudienceCdnUrlBytes(C16994k kVar) {
            this.audienceCdnUrl_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setCdnTransInfo(int i, FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
            finderLiveCdnTransInfo.getClass();
            ensureCdnTransInfoIsMutable();
            this.cdnTransInfo_.set(i, finderLiveCdnTransInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003ဋ\u0000\u0004ဈ\u0001", new Object[]{"bitField0_", "cdnTransInfo_", FinderLiveCdnTransInfo.class, "audienceCdnQualityCfg_", "audienceCdnUrl_"});
                case 3:
                    return new FinderLiveMediaSpec();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderLiveMediaSpec> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderLiveMediaSpec.class) {
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

        public int getAudienceCdnQualityCfg() {
            return this.audienceCdnQualityCfg_;
        }

        public String getAudienceCdnUrl() {
            return this.audienceCdnUrl_;
        }

        public C16994k getAudienceCdnUrlBytes() {
            return C16994k.m16791k(this.audienceCdnUrl_);
        }

        public FinderLiveCdnTransInfo getCdnTransInfo(int i) {
            return this.cdnTransInfo_.get(i);
        }

        public int getCdnTransInfoCount() {
            return this.cdnTransInfo_.size();
        }

        public List<FinderLiveCdnTransInfo> getCdnTransInfoList() {
            return this.cdnTransInfo_;
        }

        public FinderLiveCdnTransInfoOrBuilder getCdnTransInfoOrBuilder(int i) {
            return this.cdnTransInfo_.get(i);
        }

        public List<? extends FinderLiveCdnTransInfoOrBuilder> getCdnTransInfoOrBuilderList() {
            return this.cdnTransInfo_;
        }

        public boolean hasAudienceCdnQualityCfg() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasAudienceCdnUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderLiveMediaSpec finderLiveMediaSpec) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderLiveMediaSpec);
        }

        public static FinderLiveMediaSpec parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLiveMediaSpec) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLiveMediaSpec parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderLiveMediaSpec parseFrom(C16994k kVar) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addCdnTransInfo(int i, FinderLiveCdnTransInfo finderLiveCdnTransInfo) {
            finderLiveCdnTransInfo.getClass();
            ensureCdnTransInfoIsMutable();
            this.cdnTransInfo_.add(i, finderLiveCdnTransInfo);
        }

        public static FinderLiveMediaSpec parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderLiveMediaSpec parseFrom(byte[] bArr) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderLiveMediaSpec parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderLiveMediaSpec parseFrom(InputStream inputStream) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLiveMediaSpec parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLiveMediaSpec parseFrom(C23856l lVar) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderLiveMediaSpec parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderLiveMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderLiveMediaSpecOrBuilder extends C23848k1 {
        int getAudienceCdnQualityCfg();

        String getAudienceCdnUrl();

        C16994k getAudienceCdnUrlBytes();

        FinderLiveCdnTransInfo getCdnTransInfo(int i);

        int getCdnTransInfoCount();

        List<FinderLiveCdnTransInfo> getCdnTransInfoList();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasAudienceCdnQualityCfg();

        boolean hasAudienceCdnUrl();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderLivePermissionVerifyInfo extends C23861l0<FinderLivePermissionVerifyInfo, Builder> implements FinderLivePermissionVerifyInfoOrBuilder {
        public static final int BIZ_ID_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final FinderLivePermissionVerifyInfo DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderLivePermissionVerifyInfo> PARSER = null;
        public static final int VERIFY_TYPE_FIELD_NUMBER = 1;
        public static final int WXA_APPID_FIELD_NUMBER = 2;
        private int bitField0_;
        private int bizId_;
        private int verifyType_;
        private String wxaAppid_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderLivePermissionVerifyInfo, Builder> implements FinderLivePermissionVerifyInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearBizId() {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).clearBizId();
                return this;
            }

            public Builder clearVerifyType() {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).clearVerifyType();
                return this;
            }

            public Builder clearWxaAppid() {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).clearWxaAppid();
                return this;
            }

            public int getBizId() {
                return ((FinderLivePermissionVerifyInfo) this.instance).getBizId();
            }

            public int getVerifyType() {
                return ((FinderLivePermissionVerifyInfo) this.instance).getVerifyType();
            }

            public String getWxaAppid() {
                return ((FinderLivePermissionVerifyInfo) this.instance).getWxaAppid();
            }

            public C16994k getWxaAppidBytes() {
                return ((FinderLivePermissionVerifyInfo) this.instance).getWxaAppidBytes();
            }

            public boolean hasBizId() {
                return ((FinderLivePermissionVerifyInfo) this.instance).hasBizId();
            }

            public boolean hasVerifyType() {
                return ((FinderLivePermissionVerifyInfo) this.instance).hasVerifyType();
            }

            public boolean hasWxaAppid() {
                return ((FinderLivePermissionVerifyInfo) this.instance).hasWxaAppid();
            }

            public Builder setBizId(int i) {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).setBizId(i);
                return this;
            }

            public Builder setVerifyType(int i) {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).setVerifyType(i);
                return this;
            }

            public Builder setWxaAppid(String str) {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).setWxaAppid(str);
                return this;
            }

            public Builder setWxaAppidBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderLivePermissionVerifyInfo) this.instance).setWxaAppidBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderLivePermissionVerifyInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderLivePermissionVerifyInfo finderLivePermissionVerifyInfo = new FinderLivePermissionVerifyInfo();
            DEFAULT_INSTANCE = finderLivePermissionVerifyInfo;
            C23861l0.registerDefaultInstance(FinderLivePermissionVerifyInfo.class, finderLivePermissionVerifyInfo);
        }

        private FinderLivePermissionVerifyInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBizId() {
            this.bitField0_ &= -5;
            this.bizId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVerifyType() {
            this.bitField0_ &= -2;
            this.verifyType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWxaAppid() {
            this.bitField0_ &= -3;
            this.wxaAppid_ = getDefaultInstance().getWxaAppid();
        }

        public static FinderLivePermissionVerifyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderLivePermissionVerifyInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderLivePermissionVerifyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBizId(int i) {
            this.bitField0_ |= 4;
            this.bizId_ = i;
        }

        /* access modifiers changed from: private */
        public void setVerifyType(int i) {
            this.bitField0_ |= 1;
            this.verifyType_ = i;
        }

        /* access modifiers changed from: private */
        public void setWxaAppid(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.wxaAppid_ = str;
        }

        /* access modifiers changed from: private */
        public void setWxaAppidBytes(C16994k kVar) {
            this.wxaAppid_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "verifyType_", "wxaAppid_", "bizId_"});
                case 3:
                    return new FinderLivePermissionVerifyInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderLivePermissionVerifyInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderLivePermissionVerifyInfo.class) {
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

        public int getBizId() {
            return this.bizId_;
        }

        public int getVerifyType() {
            return this.verifyType_;
        }

        public String getWxaAppid() {
            return this.wxaAppid_;
        }

        public C16994k getWxaAppidBytes() {
            return C16994k.m16791k(this.wxaAppid_);
        }

        public boolean hasBizId() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasVerifyType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWxaAppid() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderLivePermissionVerifyInfo finderLivePermissionVerifyInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderLivePermissionVerifyInfo);
        }

        public static FinderLivePermissionVerifyInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(C16994k kVar) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(byte[] bArr) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(InputStream inputStream) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(C23856l lVar) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderLivePermissionVerifyInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderLivePermissionVerifyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderLivePermissionVerifyInfoOrBuilder extends C23848k1 {
        int getBizId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getVerifyType();

        String getWxaAppid();

        C16994k getWxaAppidBytes();

        boolean hasBizId();

        boolean hasVerifyType();

        boolean hasWxaAppid();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderMedia extends C23861l0<FinderMedia, Builder> implements FinderMediaOrBuilder {
        public static final int BITRATE_FIELD_NUMBER = 9;
        public static final int CODEC_INFO_FIELD_NUMBER = 16;
        public static final int COVER_URL_FIELD_NUMBER = 11;
        public static final int COVER_URL_TOKEN_FIELD_NUMBER = 15;
        public static final int DECODE_KEY_FIELD_NUMBER = 12;
        /* access modifiers changed from: private */
        public static final FinderMedia DEFAULT_INSTANCE;
        public static final int FILE_SIZE_FIELD_NUMBER = 8;
        public static final int FULL_BITRATE_FIELD_NUMBER = 28;
        public static final int FULL_COVER_URL_FIELD_NUMBER = 30;
        public static final int FULL_COVER_URL_TOKEN_FIELD_NUMBER = 31;
        public static final int FULL_FILE_SIZE_FIELD_NUMBER = 27;
        public static final int FULL_HEIGHT_FIELD_NUMBER = 25;
        public static final int FULL_MD5SUM_FIELD_NUMBER = 26;
        public static final int FULL_THUMB_URL_FIELD_NUMBER = 21;
        public static final int FULL_THUMB_URL_TOKEN_FIELD_NUMBER = 22;
        public static final int FULL_URL_FIELD_NUMBER = 23;
        public static final int FULL_URL_TOKEN_FIELD_NUMBER = 29;
        public static final int FULL_WIDTH_FIELD_NUMBER = 24;
        public static final int HDR_SPEC_FIELD_NUMBER = 32;
        public static final int HEIGHT_FIELD_NUMBER = 6;
        public static final int HLS_SPEC_FIELD_NUMBER = 18;
        public static final int HOT_FLAG_FIELD_NUMBER = 19;
        public static final int LIVE_SPEC_FIELD_NUMBER = 17;
        public static final int MD5SUM_FIELD_NUMBER = 7;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
        private static volatile C24062w1<FinderMedia> PARSER = null;
        public static final int SPEC_FIELD_NUMBER = 10;
        public static final int THUMB_URL_FIELD_NUMBER = 2;
        public static final int THUMB_URL_TOKEN_FIELD_NUMBER = 14;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int URL_TOKEN_FIELD_NUMBER = 13;
        public static final int VIDEO_DURATION_FIELD_NUMBER = 4;
        public static final int WIDTH_FIELD_NUMBER = 5;
        private int bitField0_;
        private int bitrate_;
        private FinderMediaCodecInfo codecInfo_;
        private String coverUrlToken_ = "";
        private String coverUrl_ = "";
        private String decodeKey_ = "";
        private int fileSize_;
        private int fullBitrate_;
        private String fullCoverUrlToken_ = "";
        private String fullCoverUrl_ = "";
        private int fullFileSize_;
        private float fullHeight_;
        private String fullMd5Sum_ = "";
        private String fullThumbUrlToken_ = "";
        private String fullThumbUrl_ = "";
        private String fullUrlToken_ = "";
        private String fullUrl_ = "";
        private float fullWidth_;
        private FinderHdrMediaSpecList hdrSpec_;
        private float height_;
        private FinderHlsMediaSpecList hlsSpec_;
        private int hotFlag_;
        private FinderLiveMediaSpec liveSpec_;
        private String md5Sum_ = "";
        private int mediaType_;
        private C23908o0.C23919j<FinderMediaSpec> spec_ = C23861l0.emptyProtobufList();
        private String thumbUrlToken_ = "";
        private String thumbUrl_ = "";
        private String urlToken_ = "";
        private String url_ = "";
        private int videoDuration_;
        private float width_;

        public static final class Builder extends C23861l0.C23862a<FinderMedia, Builder> implements FinderMediaOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllSpec(Iterable<? extends FinderMediaSpec> iterable) {
                copyOnWrite();
                ((FinderMedia) this.instance).addAllSpec(iterable);
                return this;
            }

            public Builder addSpec(FinderMediaSpec finderMediaSpec) {
                copyOnWrite();
                ((FinderMedia) this.instance).addSpec(finderMediaSpec);
                return this;
            }

            public Builder clearBitrate() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearBitrate();
                return this;
            }

            public Builder clearCodecInfo() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearCodecInfo();
                return this;
            }

            public Builder clearCoverUrl() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearCoverUrl();
                return this;
            }

            public Builder clearCoverUrlToken() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearCoverUrlToken();
                return this;
            }

            public Builder clearDecodeKey() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearDecodeKey();
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFileSize();
                return this;
            }

            public Builder clearFullBitrate() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullBitrate();
                return this;
            }

            public Builder clearFullCoverUrl() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullCoverUrl();
                return this;
            }

            public Builder clearFullCoverUrlToken() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullCoverUrlToken();
                return this;
            }

            public Builder clearFullFileSize() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullFileSize();
                return this;
            }

            public Builder clearFullHeight() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullHeight();
                return this;
            }

            public Builder clearFullMd5Sum() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullMd5Sum();
                return this;
            }

            public Builder clearFullThumbUrl() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullThumbUrl();
                return this;
            }

            public Builder clearFullThumbUrlToken() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullThumbUrlToken();
                return this;
            }

            public Builder clearFullUrl() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullUrl();
                return this;
            }

            public Builder clearFullUrlToken() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullUrlToken();
                return this;
            }

            public Builder clearFullWidth() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearFullWidth();
                return this;
            }

            public Builder clearHdrSpec() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearHdrSpec();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearHeight();
                return this;
            }

            public Builder clearHlsSpec() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearHlsSpec();
                return this;
            }

            public Builder clearHotFlag() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearHotFlag();
                return this;
            }

            public Builder clearLiveSpec() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearLiveSpec();
                return this;
            }

            public Builder clearMd5Sum() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearMd5Sum();
                return this;
            }

            public Builder clearMediaType() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearMediaType();
                return this;
            }

            public Builder clearSpec() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearSpec();
                return this;
            }

            public Builder clearThumbUrl() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearThumbUrl();
                return this;
            }

            public Builder clearThumbUrlToken() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearThumbUrlToken();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearUrl();
                return this;
            }

            public Builder clearUrlToken() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearUrlToken();
                return this;
            }

            public Builder clearVideoDuration() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearVideoDuration();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((FinderMedia) this.instance).clearWidth();
                return this;
            }

            public int getBitrate() {
                return ((FinderMedia) this.instance).getBitrate();
            }

            public FinderMediaCodecInfo getCodecInfo() {
                return ((FinderMedia) this.instance).getCodecInfo();
            }

            public String getCoverUrl() {
                return ((FinderMedia) this.instance).getCoverUrl();
            }

            public C16994k getCoverUrlBytes() {
                return ((FinderMedia) this.instance).getCoverUrlBytes();
            }

            public String getCoverUrlToken() {
                return ((FinderMedia) this.instance).getCoverUrlToken();
            }

            public C16994k getCoverUrlTokenBytes() {
                return ((FinderMedia) this.instance).getCoverUrlTokenBytes();
            }

            public String getDecodeKey() {
                return ((FinderMedia) this.instance).getDecodeKey();
            }

            public C16994k getDecodeKeyBytes() {
                return ((FinderMedia) this.instance).getDecodeKeyBytes();
            }

            public int getFileSize() {
                return ((FinderMedia) this.instance).getFileSize();
            }

            public int getFullBitrate() {
                return ((FinderMedia) this.instance).getFullBitrate();
            }

            public String getFullCoverUrl() {
                return ((FinderMedia) this.instance).getFullCoverUrl();
            }

            public C16994k getFullCoverUrlBytes() {
                return ((FinderMedia) this.instance).getFullCoverUrlBytes();
            }

            public String getFullCoverUrlToken() {
                return ((FinderMedia) this.instance).getFullCoverUrlToken();
            }

            public C16994k getFullCoverUrlTokenBytes() {
                return ((FinderMedia) this.instance).getFullCoverUrlTokenBytes();
            }

            public int getFullFileSize() {
                return ((FinderMedia) this.instance).getFullFileSize();
            }

            public float getFullHeight() {
                return ((FinderMedia) this.instance).getFullHeight();
            }

            public String getFullMd5Sum() {
                return ((FinderMedia) this.instance).getFullMd5Sum();
            }

            public C16994k getFullMd5SumBytes() {
                return ((FinderMedia) this.instance).getFullMd5SumBytes();
            }

            public String getFullThumbUrl() {
                return ((FinderMedia) this.instance).getFullThumbUrl();
            }

            public C16994k getFullThumbUrlBytes() {
                return ((FinderMedia) this.instance).getFullThumbUrlBytes();
            }

            public String getFullThumbUrlToken() {
                return ((FinderMedia) this.instance).getFullThumbUrlToken();
            }

            public C16994k getFullThumbUrlTokenBytes() {
                return ((FinderMedia) this.instance).getFullThumbUrlTokenBytes();
            }

            public String getFullUrl() {
                return ((FinderMedia) this.instance).getFullUrl();
            }

            public C16994k getFullUrlBytes() {
                return ((FinderMedia) this.instance).getFullUrlBytes();
            }

            public String getFullUrlToken() {
                return ((FinderMedia) this.instance).getFullUrlToken();
            }

            public C16994k getFullUrlTokenBytes() {
                return ((FinderMedia) this.instance).getFullUrlTokenBytes();
            }

            public float getFullWidth() {
                return ((FinderMedia) this.instance).getFullWidth();
            }

            public FinderHdrMediaSpecList getHdrSpec() {
                return ((FinderMedia) this.instance).getHdrSpec();
            }

            public float getHeight() {
                return ((FinderMedia) this.instance).getHeight();
            }

            public FinderHlsMediaSpecList getHlsSpec() {
                return ((FinderMedia) this.instance).getHlsSpec();
            }

            public int getHotFlag() {
                return ((FinderMedia) this.instance).getHotFlag();
            }

            public FinderLiveMediaSpec getLiveSpec() {
                return ((FinderMedia) this.instance).getLiveSpec();
            }

            public String getMd5Sum() {
                return ((FinderMedia) this.instance).getMd5Sum();
            }

            public C16994k getMd5SumBytes() {
                return ((FinderMedia) this.instance).getMd5SumBytes();
            }

            public int getMediaType() {
                return ((FinderMedia) this.instance).getMediaType();
            }

            public FinderMediaSpec getSpec(int i) {
                return ((FinderMedia) this.instance).getSpec(i);
            }

            public int getSpecCount() {
                return ((FinderMedia) this.instance).getSpecCount();
            }

            public List<FinderMediaSpec> getSpecList() {
                return Collections.unmodifiableList(((FinderMedia) this.instance).getSpecList());
            }

            public String getThumbUrl() {
                return ((FinderMedia) this.instance).getThumbUrl();
            }

            public C16994k getThumbUrlBytes() {
                return ((FinderMedia) this.instance).getThumbUrlBytes();
            }

            public String getThumbUrlToken() {
                return ((FinderMedia) this.instance).getThumbUrlToken();
            }

            public C16994k getThumbUrlTokenBytes() {
                return ((FinderMedia) this.instance).getThumbUrlTokenBytes();
            }

            public String getUrl() {
                return ((FinderMedia) this.instance).getUrl();
            }

            public C16994k getUrlBytes() {
                return ((FinderMedia) this.instance).getUrlBytes();
            }

            public String getUrlToken() {
                return ((FinderMedia) this.instance).getUrlToken();
            }

            public C16994k getUrlTokenBytes() {
                return ((FinderMedia) this.instance).getUrlTokenBytes();
            }

            public int getVideoDuration() {
                return ((FinderMedia) this.instance).getVideoDuration();
            }

            public float getWidth() {
                return ((FinderMedia) this.instance).getWidth();
            }

            public boolean hasBitrate() {
                return ((FinderMedia) this.instance).hasBitrate();
            }

            public boolean hasCodecInfo() {
                return ((FinderMedia) this.instance).hasCodecInfo();
            }

            public boolean hasCoverUrl() {
                return ((FinderMedia) this.instance).hasCoverUrl();
            }

            public boolean hasCoverUrlToken() {
                return ((FinderMedia) this.instance).hasCoverUrlToken();
            }

            public boolean hasDecodeKey() {
                return ((FinderMedia) this.instance).hasDecodeKey();
            }

            public boolean hasFileSize() {
                return ((FinderMedia) this.instance).hasFileSize();
            }

            public boolean hasFullBitrate() {
                return ((FinderMedia) this.instance).hasFullBitrate();
            }

            public boolean hasFullCoverUrl() {
                return ((FinderMedia) this.instance).hasFullCoverUrl();
            }

            public boolean hasFullCoverUrlToken() {
                return ((FinderMedia) this.instance).hasFullCoverUrlToken();
            }

            public boolean hasFullFileSize() {
                return ((FinderMedia) this.instance).hasFullFileSize();
            }

            public boolean hasFullHeight() {
                return ((FinderMedia) this.instance).hasFullHeight();
            }

            public boolean hasFullMd5Sum() {
                return ((FinderMedia) this.instance).hasFullMd5Sum();
            }

            public boolean hasFullThumbUrl() {
                return ((FinderMedia) this.instance).hasFullThumbUrl();
            }

            public boolean hasFullThumbUrlToken() {
                return ((FinderMedia) this.instance).hasFullThumbUrlToken();
            }

            public boolean hasFullUrl() {
                return ((FinderMedia) this.instance).hasFullUrl();
            }

            public boolean hasFullUrlToken() {
                return ((FinderMedia) this.instance).hasFullUrlToken();
            }

            public boolean hasFullWidth() {
                return ((FinderMedia) this.instance).hasFullWidth();
            }

            public boolean hasHdrSpec() {
                return ((FinderMedia) this.instance).hasHdrSpec();
            }

            public boolean hasHeight() {
                return ((FinderMedia) this.instance).hasHeight();
            }

            public boolean hasHlsSpec() {
                return ((FinderMedia) this.instance).hasHlsSpec();
            }

            public boolean hasHotFlag() {
                return ((FinderMedia) this.instance).hasHotFlag();
            }

            public boolean hasLiveSpec() {
                return ((FinderMedia) this.instance).hasLiveSpec();
            }

            public boolean hasMd5Sum() {
                return ((FinderMedia) this.instance).hasMd5Sum();
            }

            public boolean hasMediaType() {
                return ((FinderMedia) this.instance).hasMediaType();
            }

            public boolean hasThumbUrl() {
                return ((FinderMedia) this.instance).hasThumbUrl();
            }

            public boolean hasThumbUrlToken() {
                return ((FinderMedia) this.instance).hasThumbUrlToken();
            }

            public boolean hasUrl() {
                return ((FinderMedia) this.instance).hasUrl();
            }

            public boolean hasUrlToken() {
                return ((FinderMedia) this.instance).hasUrlToken();
            }

            public boolean hasVideoDuration() {
                return ((FinderMedia) this.instance).hasVideoDuration();
            }

            public boolean hasWidth() {
                return ((FinderMedia) this.instance).hasWidth();
            }

            public Builder mergeCodecInfo(FinderMediaCodecInfo finderMediaCodecInfo) {
                copyOnWrite();
                ((FinderMedia) this.instance).mergeCodecInfo(finderMediaCodecInfo);
                return this;
            }

            public Builder mergeHdrSpec(FinderHdrMediaSpecList finderHdrMediaSpecList) {
                copyOnWrite();
                ((FinderMedia) this.instance).mergeHdrSpec(finderHdrMediaSpecList);
                return this;
            }

            public Builder mergeHlsSpec(FinderHlsMediaSpecList finderHlsMediaSpecList) {
                copyOnWrite();
                ((FinderMedia) this.instance).mergeHlsSpec(finderHlsMediaSpecList);
                return this;
            }

            public Builder mergeLiveSpec(FinderLiveMediaSpec finderLiveMediaSpec) {
                copyOnWrite();
                ((FinderMedia) this.instance).mergeLiveSpec(finderLiveMediaSpec);
                return this;
            }

            public Builder removeSpec(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).removeSpec(i);
                return this;
            }

            public Builder setBitrate(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setBitrate(i);
                return this;
            }

            public Builder setCodecInfo(FinderMediaCodecInfo finderMediaCodecInfo) {
                copyOnWrite();
                ((FinderMedia) this.instance).setCodecInfo(finderMediaCodecInfo);
                return this;
            }

            public Builder setCoverUrl(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setCoverUrl(str);
                return this;
            }

            public Builder setCoverUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setCoverUrlBytes(kVar);
                return this;
            }

            public Builder setCoverUrlToken(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setCoverUrlToken(str);
                return this;
            }

            public Builder setCoverUrlTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setCoverUrlTokenBytes(kVar);
                return this;
            }

            public Builder setDecodeKey(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setDecodeKey(str);
                return this;
            }

            public Builder setDecodeKeyBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setDecodeKeyBytes(kVar);
                return this;
            }

            public Builder setFileSize(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFileSize(i);
                return this;
            }

            public Builder setFullBitrate(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullBitrate(i);
                return this;
            }

            public Builder setFullCoverUrl(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullCoverUrl(str);
                return this;
            }

            public Builder setFullCoverUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullCoverUrlBytes(kVar);
                return this;
            }

            public Builder setFullCoverUrlToken(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullCoverUrlToken(str);
                return this;
            }

            public Builder setFullCoverUrlTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullCoverUrlTokenBytes(kVar);
                return this;
            }

            public Builder setFullFileSize(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullFileSize(i);
                return this;
            }

            public Builder setFullHeight(float f) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullHeight(f);
                return this;
            }

            public Builder setFullMd5Sum(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullMd5Sum(str);
                return this;
            }

            public Builder setFullMd5SumBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullMd5SumBytes(kVar);
                return this;
            }

            public Builder setFullThumbUrl(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullThumbUrl(str);
                return this;
            }

            public Builder setFullThumbUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullThumbUrlBytes(kVar);
                return this;
            }

            public Builder setFullThumbUrlToken(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullThumbUrlToken(str);
                return this;
            }

            public Builder setFullThumbUrlTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullThumbUrlTokenBytes(kVar);
                return this;
            }

            public Builder setFullUrl(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullUrl(str);
                return this;
            }

            public Builder setFullUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullUrlBytes(kVar);
                return this;
            }

            public Builder setFullUrlToken(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullUrlToken(str);
                return this;
            }

            public Builder setFullUrlTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullUrlTokenBytes(kVar);
                return this;
            }

            public Builder setFullWidth(float f) {
                copyOnWrite();
                ((FinderMedia) this.instance).setFullWidth(f);
                return this;
            }

            public Builder setHdrSpec(FinderHdrMediaSpecList finderHdrMediaSpecList) {
                copyOnWrite();
                ((FinderMedia) this.instance).setHdrSpec(finderHdrMediaSpecList);
                return this;
            }

            public Builder setHeight(float f) {
                copyOnWrite();
                ((FinderMedia) this.instance).setHeight(f);
                return this;
            }

            public Builder setHlsSpec(FinderHlsMediaSpecList finderHlsMediaSpecList) {
                copyOnWrite();
                ((FinderMedia) this.instance).setHlsSpec(finderHlsMediaSpecList);
                return this;
            }

            public Builder setHotFlag(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setHotFlag(i);
                return this;
            }

            public Builder setLiveSpec(FinderLiveMediaSpec finderLiveMediaSpec) {
                copyOnWrite();
                ((FinderMedia) this.instance).setLiveSpec(finderLiveMediaSpec);
                return this;
            }

            public Builder setMd5Sum(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setMd5Sum(str);
                return this;
            }

            public Builder setMd5SumBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setMd5SumBytes(kVar);
                return this;
            }

            public Builder setMediaType(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setMediaType(i);
                return this;
            }

            public Builder setSpec(int i, FinderMediaSpec finderMediaSpec) {
                copyOnWrite();
                ((FinderMedia) this.instance).setSpec(i, finderMediaSpec);
                return this;
            }

            public Builder setThumbUrl(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setThumbUrl(str);
                return this;
            }

            public Builder setThumbUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setThumbUrlBytes(kVar);
                return this;
            }

            public Builder setThumbUrlToken(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setThumbUrlToken(str);
                return this;
            }

            public Builder setThumbUrlTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setThumbUrlTokenBytes(kVar);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setUrlBytes(kVar);
                return this;
            }

            public Builder setUrlToken(String str) {
                copyOnWrite();
                ((FinderMedia) this.instance).setUrlToken(str);
                return this;
            }

            public Builder setUrlTokenBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMedia) this.instance).setUrlTokenBytes(kVar);
                return this;
            }

            public Builder setVideoDuration(int i) {
                copyOnWrite();
                ((FinderMedia) this.instance).setVideoDuration(i);
                return this;
            }

            public Builder setWidth(float f) {
                copyOnWrite();
                ((FinderMedia) this.instance).setWidth(f);
                return this;
            }

            private Builder() {
                super(FinderMedia.DEFAULT_INSTANCE);
            }

            public Builder addSpec(int i, FinderMediaSpec finderMediaSpec) {
                copyOnWrite();
                ((FinderMedia) this.instance).addSpec(i, finderMediaSpec);
                return this;
            }

            public Builder setCodecInfo(FinderMediaCodecInfo.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).setCodecInfo((FinderMediaCodecInfo) builder.build());
                return this;
            }

            public Builder setHdrSpec(FinderHdrMediaSpecList.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).setHdrSpec((FinderHdrMediaSpecList) builder.build());
                return this;
            }

            public Builder setHlsSpec(FinderHlsMediaSpecList.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).setHlsSpec((FinderHlsMediaSpecList) builder.build());
                return this;
            }

            public Builder setLiveSpec(FinderLiveMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).setLiveSpec((FinderLiveMediaSpec) builder.build());
                return this;
            }

            public Builder setSpec(int i, FinderMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).setSpec(i, (FinderMediaSpec) builder.build());
                return this;
            }

            public Builder addSpec(FinderMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).addSpec((FinderMediaSpec) builder.build());
                return this;
            }

            public Builder addSpec(int i, FinderMediaSpec.Builder builder) {
                copyOnWrite();
                ((FinderMedia) this.instance).addSpec(i, (FinderMediaSpec) builder.build());
                return this;
            }
        }

        static {
            FinderMedia finderMedia = new FinderMedia();
            DEFAULT_INSTANCE = finderMedia;
            C23861l0.registerDefaultInstance(FinderMedia.class, finderMedia);
        }

        private FinderMedia() {
        }

        /* access modifiers changed from: private */
        public void addAllSpec(Iterable<? extends FinderMediaSpec> iterable) {
            ensureSpecIsMutable();
            C23810b.addAll(iterable, this.spec_);
        }

        /* access modifiers changed from: private */
        public void addSpec(FinderMediaSpec finderMediaSpec) {
            finderMediaSpec.getClass();
            ensureSpecIsMutable();
            this.spec_.add(finderMediaSpec);
        }

        /* access modifiers changed from: private */
        public void clearBitrate() {
            this.bitField0_ &= -257;
            this.bitrate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCodecInfo() {
            this.codecInfo_ = null;
            this.bitField0_ &= -16385;
        }

        /* access modifiers changed from: private */
        public void clearCoverUrl() {
            this.bitField0_ &= -513;
            this.coverUrl_ = getDefaultInstance().getCoverUrl();
        }

        /* access modifiers changed from: private */
        public void clearCoverUrlToken() {
            this.bitField0_ &= -8193;
            this.coverUrlToken_ = getDefaultInstance().getCoverUrlToken();
        }

        /* access modifiers changed from: private */
        public void clearDecodeKey() {
            this.bitField0_ &= -1025;
            this.decodeKey_ = getDefaultInstance().getDecodeKey();
        }

        /* access modifiers changed from: private */
        public void clearFileSize() {
            this.bitField0_ &= -129;
            this.fileSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFullBitrate() {
            this.bitField0_ &= -33554433;
            this.fullBitrate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFullCoverUrl() {
            this.bitField0_ &= -134217729;
            this.fullCoverUrl_ = getDefaultInstance().getFullCoverUrl();
        }

        /* access modifiers changed from: private */
        public void clearFullCoverUrlToken() {
            this.bitField0_ &= -268435457;
            this.fullCoverUrlToken_ = getDefaultInstance().getFullCoverUrlToken();
        }

        /* access modifiers changed from: private */
        public void clearFullFileSize() {
            this.bitField0_ &= -16777217;
            this.fullFileSize_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFullHeight() {
            this.bitField0_ &= -4194305;
            this.fullHeight_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearFullMd5Sum() {
            this.bitField0_ &= -8388609;
            this.fullMd5Sum_ = getDefaultInstance().getFullMd5Sum();
        }

        /* access modifiers changed from: private */
        public void clearFullThumbUrl() {
            this.bitField0_ &= -262145;
            this.fullThumbUrl_ = getDefaultInstance().getFullThumbUrl();
        }

        /* access modifiers changed from: private */
        public void clearFullThumbUrlToken() {
            this.bitField0_ &= -524289;
            this.fullThumbUrlToken_ = getDefaultInstance().getFullThumbUrlToken();
        }

        /* access modifiers changed from: private */
        public void clearFullUrl() {
            this.bitField0_ &= -1048577;
            this.fullUrl_ = getDefaultInstance().getFullUrl();
        }

        /* access modifiers changed from: private */
        public void clearFullUrlToken() {
            this.bitField0_ &= -67108865;
            this.fullUrlToken_ = getDefaultInstance().getFullUrlToken();
        }

        /* access modifiers changed from: private */
        public void clearFullWidth() {
            this.bitField0_ &= -2097153;
            this.fullWidth_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearHdrSpec() {
            this.hdrSpec_ = null;
            this.bitField0_ &= -536870913;
        }

        /* access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -33;
            this.height_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearHlsSpec() {
            this.hlsSpec_ = null;
            this.bitField0_ &= -65537;
        }

        /* access modifiers changed from: private */
        public void clearHotFlag() {
            this.bitField0_ &= -131073;
            this.hotFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLiveSpec() {
            this.liveSpec_ = null;
            this.bitField0_ &= -32769;
        }

        /* access modifiers changed from: private */
        public void clearMd5Sum() {
            this.bitField0_ &= -65;
            this.md5Sum_ = getDefaultInstance().getMd5Sum();
        }

        /* access modifiers changed from: private */
        public void clearMediaType() {
            this.bitField0_ &= -5;
            this.mediaType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSpec() {
            this.spec_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearThumbUrl() {
            this.bitField0_ &= -3;
            this.thumbUrl_ = getDefaultInstance().getThumbUrl();
        }

        /* access modifiers changed from: private */
        public void clearThumbUrlToken() {
            this.bitField0_ &= -4097;
            this.thumbUrlToken_ = getDefaultInstance().getThumbUrlToken();
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -2;
            this.url_ = getDefaultInstance().getUrl();
        }

        /* access modifiers changed from: private */
        public void clearUrlToken() {
            this.bitField0_ &= -2049;
            this.urlToken_ = getDefaultInstance().getUrlToken();
        }

        /* access modifiers changed from: private */
        public void clearVideoDuration() {
            this.bitField0_ &= -9;
            this.videoDuration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -17;
            this.width_ = 0.0f;
        }

        private void ensureSpecIsMutable() {
            C23908o0.C23919j<FinderMediaSpec> jVar = this.spec_;
            if (!jVar.mo37523Q()) {
                this.spec_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderMedia getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeCodecInfo(FinderMediaCodecInfo finderMediaCodecInfo) {
            finderMediaCodecInfo.getClass();
            FinderMediaCodecInfo finderMediaCodecInfo2 = this.codecInfo_;
            if (finderMediaCodecInfo2 == null || finderMediaCodecInfo2 == FinderMediaCodecInfo.getDefaultInstance()) {
                this.codecInfo_ = finderMediaCodecInfo;
            } else {
                this.codecInfo_ = (FinderMediaCodecInfo) ((FinderMediaCodecInfo.Builder) FinderMediaCodecInfo.newBuilder(this.codecInfo_).mergeFrom(finderMediaCodecInfo)).buildPartial();
            }
            this.bitField0_ |= 16384;
        }

        /* access modifiers changed from: private */
        public void mergeHdrSpec(FinderHdrMediaSpecList finderHdrMediaSpecList) {
            finderHdrMediaSpecList.getClass();
            FinderHdrMediaSpecList finderHdrMediaSpecList2 = this.hdrSpec_;
            if (finderHdrMediaSpecList2 == null || finderHdrMediaSpecList2 == FinderHdrMediaSpecList.getDefaultInstance()) {
                this.hdrSpec_ = finderHdrMediaSpecList;
            } else {
                this.hdrSpec_ = (FinderHdrMediaSpecList) ((FinderHdrMediaSpecList.Builder) FinderHdrMediaSpecList.newBuilder(this.hdrSpec_).mergeFrom(finderHdrMediaSpecList)).buildPartial();
            }
            this.bitField0_ |= 536870912;
        }

        /* access modifiers changed from: private */
        public void mergeHlsSpec(FinderHlsMediaSpecList finderHlsMediaSpecList) {
            finderHlsMediaSpecList.getClass();
            FinderHlsMediaSpecList finderHlsMediaSpecList2 = this.hlsSpec_;
            if (finderHlsMediaSpecList2 == null || finderHlsMediaSpecList2 == FinderHlsMediaSpecList.getDefaultInstance()) {
                this.hlsSpec_ = finderHlsMediaSpecList;
            } else {
                this.hlsSpec_ = (FinderHlsMediaSpecList) ((FinderHlsMediaSpecList.Builder) FinderHlsMediaSpecList.newBuilder(this.hlsSpec_).mergeFrom(finderHlsMediaSpecList)).buildPartial();
            }
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void mergeLiveSpec(FinderLiveMediaSpec finderLiveMediaSpec) {
            finderLiveMediaSpec.getClass();
            FinderLiveMediaSpec finderLiveMediaSpec2 = this.liveSpec_;
            if (finderLiveMediaSpec2 == null || finderLiveMediaSpec2 == FinderLiveMediaSpec.getDefaultInstance()) {
                this.liveSpec_ = finderLiveMediaSpec;
            } else {
                this.liveSpec_ = (FinderLiveMediaSpec) ((FinderLiveMediaSpec.Builder) FinderLiveMediaSpec.newBuilder(this.liveSpec_).mergeFrom(finderLiveMediaSpec)).buildPartial();
            }
            this.bitField0_ |= 32768;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderMedia parseDelimitedFrom(InputStream inputStream) {
            return (FinderMedia) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderMedia parseFrom(ByteBuffer byteBuffer) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderMedia> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeSpec(int i) {
            ensureSpecIsMutable();
            this.spec_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBitrate(int i) {
            this.bitField0_ |= 256;
            this.bitrate_ = i;
        }

        /* access modifiers changed from: private */
        public void setCodecInfo(FinderMediaCodecInfo finderMediaCodecInfo) {
            finderMediaCodecInfo.getClass();
            this.codecInfo_ = finderMediaCodecInfo;
            this.bitField0_ |= 16384;
        }

        /* access modifiers changed from: private */
        public void setCoverUrl(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.coverUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverUrlBytes(C16994k kVar) {
            this.coverUrl_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setCoverUrlToken(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.coverUrlToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverUrlTokenBytes(C16994k kVar) {
            this.coverUrlToken_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setDecodeKey(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.decodeKey_ = str;
        }

        /* access modifiers changed from: private */
        public void setDecodeKeyBytes(C16994k kVar) {
            this.decodeKey_ = kVar.mo18752u();
            this.bitField0_ |= 1024;
        }

        /* access modifiers changed from: private */
        public void setFileSize(int i) {
            this.bitField0_ |= 128;
            this.fileSize_ = i;
        }

        /* access modifiers changed from: private */
        public void setFullBitrate(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            this.fullBitrate_ = i;
        }

        /* access modifiers changed from: private */
        public void setFullCoverUrl(String str) {
            str.getClass();
            this.bitField0_ |= 134217728;
            this.fullCoverUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullCoverUrlBytes(C16994k kVar) {
            this.fullCoverUrl_ = kVar.mo18752u();
            this.bitField0_ |= 134217728;
        }

        /* access modifiers changed from: private */
        public void setFullCoverUrlToken(String str) {
            str.getClass();
            this.bitField0_ |= 268435456;
            this.fullCoverUrlToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullCoverUrlTokenBytes(C16994k kVar) {
            this.fullCoverUrlToken_ = kVar.mo18752u();
            this.bitField0_ |= 268435456;
        }

        /* access modifiers changed from: private */
        public void setFullFileSize(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.fullFileSize_ = i;
        }

        /* access modifiers changed from: private */
        public void setFullHeight(float f) {
            this.bitField0_ |= 4194304;
            this.fullHeight_ = f;
        }

        /* access modifiers changed from: private */
        public void setFullMd5Sum(String str) {
            str.getClass();
            this.bitField0_ |= 8388608;
            this.fullMd5Sum_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullMd5SumBytes(C16994k kVar) {
            this.fullMd5Sum_ = kVar.mo18752u();
            this.bitField0_ |= 8388608;
        }

        /* access modifiers changed from: private */
        public void setFullThumbUrl(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.fullThumbUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullThumbUrlBytes(C16994k kVar) {
            this.fullThumbUrl_ = kVar.mo18752u();
            this.bitField0_ |= 262144;
        }

        /* access modifiers changed from: private */
        public void setFullThumbUrlToken(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.fullThumbUrlToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullThumbUrlTokenBytes(C16994k kVar) {
            this.fullThumbUrlToken_ = kVar.mo18752u();
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void setFullUrl(String str) {
            str.getClass();
            this.bitField0_ |= 1048576;
            this.fullUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullUrlBytes(C16994k kVar) {
            this.fullUrl_ = kVar.mo18752u();
            this.bitField0_ |= 1048576;
        }

        /* access modifiers changed from: private */
        public void setFullUrlToken(String str) {
            str.getClass();
            this.bitField0_ |= 67108864;
            this.fullUrlToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setFullUrlTokenBytes(C16994k kVar) {
            this.fullUrlToken_ = kVar.mo18752u();
            this.bitField0_ |= 67108864;
        }

        /* access modifiers changed from: private */
        public void setFullWidth(float f) {
            this.bitField0_ |= 2097152;
            this.fullWidth_ = f;
        }

        /* access modifiers changed from: private */
        public void setHdrSpec(FinderHdrMediaSpecList finderHdrMediaSpecList) {
            finderHdrMediaSpecList.getClass();
            this.hdrSpec_ = finderHdrMediaSpecList;
            this.bitField0_ |= 536870912;
        }

        /* access modifiers changed from: private */
        public void setHeight(float f) {
            this.bitField0_ |= 32;
            this.height_ = f;
        }

        /* access modifiers changed from: private */
        public void setHlsSpec(FinderHlsMediaSpecList finderHlsMediaSpecList) {
            finderHlsMediaSpecList.getClass();
            this.hlsSpec_ = finderHlsMediaSpecList;
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void setHotFlag(int i) {
            this.bitField0_ |= 131072;
            this.hotFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setLiveSpec(FinderLiveMediaSpec finderLiveMediaSpec) {
            finderLiveMediaSpec.getClass();
            this.liveSpec_ = finderLiveMediaSpec;
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setMd5Sum(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.md5Sum_ = str;
        }

        /* access modifiers changed from: private */
        public void setMd5SumBytes(C16994k kVar) {
            this.md5Sum_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setMediaType(int i) {
            this.bitField0_ |= 4;
            this.mediaType_ = i;
        }

        /* access modifiers changed from: private */
        public void setSpec(int i, FinderMediaSpec finderMediaSpec) {
            finderMediaSpec.getClass();
            ensureSpecIsMutable();
            this.spec_.set(i, finderMediaSpec);
        }

        /* access modifiers changed from: private */
        public void setThumbUrl(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.thumbUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setThumbUrlBytes(C16994k kVar) {
            this.thumbUrl_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setThumbUrlToken(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.thumbUrlToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setThumbUrlTokenBytes(C16994k kVar) {
            this.thumbUrlToken_ = kVar.mo18752u();
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.url_ = str;
        }

        /* access modifiers changed from: private */
        public void setUrlBytes(C16994k kVar) {
            this.url_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setUrlToken(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.urlToken_ = str;
        }

        /* access modifiers changed from: private */
        public void setUrlTokenBytes(C16994k kVar) {
            this.urlToken_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setVideoDuration(int i) {
            this.bitField0_ |= 8;
            this.videoDuration_ = i;
        }

        /* access modifiers changed from: private */
        public void setWidth(float f) {
            this.bitField0_ |= 16;
            this.width_ = f;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001 \u001f\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဈ\u0006\bဋ\u0007\tင\b\n\u001b\u000bဈ\t\fဈ\n\rဈ\u000b\u000eဈ\f\u000fဈ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဋ\u0011\u0015ဈ\u0012\u0016ဈ\u0013\u0017ဈ\u0014\u0018ခ\u0015\u0019ခ\u0016\u001aဈ\u0017\u001bဋ\u0018\u001cင\u0019\u001dဈ\u001a\u001eဈ\u001b\u001fဈ\u001c ဉ\u001d", new Object[]{"bitField0_", "url_", "thumbUrl_", "mediaType_", "videoDuration_", "width_", "height_", "md5Sum_", "fileSize_", "bitrate_", "spec_", FinderMediaSpec.class, "coverUrl_", "decodeKey_", "urlToken_", "thumbUrlToken_", "coverUrlToken_", "codecInfo_", "liveSpec_", "hlsSpec_", "hotFlag_", "fullThumbUrl_", "fullThumbUrlToken_", "fullUrl_", "fullWidth_", "fullHeight_", "fullMd5Sum_", "fullFileSize_", "fullBitrate_", "fullUrlToken_", "fullCoverUrl_", "fullCoverUrlToken_", "hdrSpec_"});
                case 3:
                    return new FinderMedia();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderMedia> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderMedia.class) {
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

        public int getBitrate() {
            return this.bitrate_;
        }

        public FinderMediaCodecInfo getCodecInfo() {
            FinderMediaCodecInfo finderMediaCodecInfo = this.codecInfo_;
            return finderMediaCodecInfo == null ? FinderMediaCodecInfo.getDefaultInstance() : finderMediaCodecInfo;
        }

        public String getCoverUrl() {
            return this.coverUrl_;
        }

        public C16994k getCoverUrlBytes() {
            return C16994k.m16791k(this.coverUrl_);
        }

        public String getCoverUrlToken() {
            return this.coverUrlToken_;
        }

        public C16994k getCoverUrlTokenBytes() {
            return C16994k.m16791k(this.coverUrlToken_);
        }

        public String getDecodeKey() {
            return this.decodeKey_;
        }

        public C16994k getDecodeKeyBytes() {
            return C16994k.m16791k(this.decodeKey_);
        }

        public int getFileSize() {
            return this.fileSize_;
        }

        public int getFullBitrate() {
            return this.fullBitrate_;
        }

        public String getFullCoverUrl() {
            return this.fullCoverUrl_;
        }

        public C16994k getFullCoverUrlBytes() {
            return C16994k.m16791k(this.fullCoverUrl_);
        }

        public String getFullCoverUrlToken() {
            return this.fullCoverUrlToken_;
        }

        public C16994k getFullCoverUrlTokenBytes() {
            return C16994k.m16791k(this.fullCoverUrlToken_);
        }

        public int getFullFileSize() {
            return this.fullFileSize_;
        }

        public float getFullHeight() {
            return this.fullHeight_;
        }

        public String getFullMd5Sum() {
            return this.fullMd5Sum_;
        }

        public C16994k getFullMd5SumBytes() {
            return C16994k.m16791k(this.fullMd5Sum_);
        }

        public String getFullThumbUrl() {
            return this.fullThumbUrl_;
        }

        public C16994k getFullThumbUrlBytes() {
            return C16994k.m16791k(this.fullThumbUrl_);
        }

        public String getFullThumbUrlToken() {
            return this.fullThumbUrlToken_;
        }

        public C16994k getFullThumbUrlTokenBytes() {
            return C16994k.m16791k(this.fullThumbUrlToken_);
        }

        public String getFullUrl() {
            return this.fullUrl_;
        }

        public C16994k getFullUrlBytes() {
            return C16994k.m16791k(this.fullUrl_);
        }

        public String getFullUrlToken() {
            return this.fullUrlToken_;
        }

        public C16994k getFullUrlTokenBytes() {
            return C16994k.m16791k(this.fullUrlToken_);
        }

        public float getFullWidth() {
            return this.fullWidth_;
        }

        public FinderHdrMediaSpecList getHdrSpec() {
            FinderHdrMediaSpecList finderHdrMediaSpecList = this.hdrSpec_;
            return finderHdrMediaSpecList == null ? FinderHdrMediaSpecList.getDefaultInstance() : finderHdrMediaSpecList;
        }

        public float getHeight() {
            return this.height_;
        }

        public FinderHlsMediaSpecList getHlsSpec() {
            FinderHlsMediaSpecList finderHlsMediaSpecList = this.hlsSpec_;
            return finderHlsMediaSpecList == null ? FinderHlsMediaSpecList.getDefaultInstance() : finderHlsMediaSpecList;
        }

        public int getHotFlag() {
            return this.hotFlag_;
        }

        public FinderLiveMediaSpec getLiveSpec() {
            FinderLiveMediaSpec finderLiveMediaSpec = this.liveSpec_;
            return finderLiveMediaSpec == null ? FinderLiveMediaSpec.getDefaultInstance() : finderLiveMediaSpec;
        }

        public String getMd5Sum() {
            return this.md5Sum_;
        }

        public C16994k getMd5SumBytes() {
            return C16994k.m16791k(this.md5Sum_);
        }

        public int getMediaType() {
            return this.mediaType_;
        }

        public FinderMediaSpec getSpec(int i) {
            return this.spec_.get(i);
        }

        public int getSpecCount() {
            return this.spec_.size();
        }

        public List<FinderMediaSpec> getSpecList() {
            return this.spec_;
        }

        public FinderMediaSpecOrBuilder getSpecOrBuilder(int i) {
            return this.spec_.get(i);
        }

        public List<? extends FinderMediaSpecOrBuilder> getSpecOrBuilderList() {
            return this.spec_;
        }

        public String getThumbUrl() {
            return this.thumbUrl_;
        }

        public C16994k getThumbUrlBytes() {
            return C16994k.m16791k(this.thumbUrl_);
        }

        public String getThumbUrlToken() {
            return this.thumbUrlToken_;
        }

        public C16994k getThumbUrlTokenBytes() {
            return C16994k.m16791k(this.thumbUrlToken_);
        }

        public String getUrl() {
            return this.url_;
        }

        public C16994k getUrlBytes() {
            return C16994k.m16791k(this.url_);
        }

        public String getUrlToken() {
            return this.urlToken_;
        }

        public C16994k getUrlTokenBytes() {
            return C16994k.m16791k(this.urlToken_);
        }

        public int getVideoDuration() {
            return this.videoDuration_;
        }

        public float getWidth() {
            return this.width_;
        }

        public boolean hasBitrate() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasCodecInfo() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasCoverUrl() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasCoverUrlToken() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasDecodeKey() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasFileSize() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasFullBitrate() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
        }

        public boolean hasFullCoverUrl() {
            return (this.bitField0_ & 134217728) != 0;
        }

        public boolean hasFullCoverUrlToken() {
            return (this.bitField0_ & 268435456) != 0;
        }

        public boolean hasFullFileSize() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasFullHeight() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasFullMd5Sum() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasFullThumbUrl() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasFullThumbUrlToken() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasFullUrl() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasFullUrlToken() {
            return (this.bitField0_ & 67108864) != 0;
        }

        public boolean hasFullWidth() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasHdrSpec() {
            return (this.bitField0_ & 536870912) != 0;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasHlsSpec() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasHotFlag() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasLiveSpec() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasMd5Sum() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasMediaType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasThumbUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasThumbUrlToken() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUrlToken() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasVideoDuration() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(FinderMedia finderMedia) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderMedia);
        }

        public static FinderMedia parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderMedia) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderMedia parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderMedia parseFrom(C16994k kVar) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addSpec(int i, FinderMediaSpec finderMediaSpec) {
            finderMediaSpec.getClass();
            ensureSpecIsMutable();
            this.spec_.add(i, finderMediaSpec);
        }

        public static FinderMedia parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderMedia parseFrom(byte[] bArr) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderMedia parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderMedia parseFrom(InputStream inputStream) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderMedia parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderMedia parseFrom(C23856l lVar) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderMedia parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderMedia) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderMediaCodecInfo extends C23861l0<FinderMediaCodecInfo, Builder> implements FinderMediaCodecInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderMediaCodecInfo DEFAULT_INSTANCE;
        public static final int HAS_STICKERS_FIELD_NUMBER = 6;
        public static final int HDIMG_SCORE_FIELD_NUMBER = 5;
        private static volatile C24062w1<FinderMediaCodecInfo> PARSER = null;
        public static final int THUMB_SCORE_FIELD_NUMBER = 4;
        public static final int VIDEO_AUDIO_SCORE_FIELD_NUMBER = 3;
        public static final int VIDEO_COVER_SCORE_FIELD_NUMBER = 2;
        public static final int VIDEO_SCORE_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean hasStickers_;
        private float hdimgScore_;
        private float thumbScore_;
        private float videoAudioScore_;
        private float videoCoverScore_;
        private float videoScore_;

        public static final class Builder extends C23861l0.C23862a<FinderMediaCodecInfo, Builder> implements FinderMediaCodecInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearHasStickers() {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).clearHasStickers();
                return this;
            }

            public Builder clearHdimgScore() {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).clearHdimgScore();
                return this;
            }

            public Builder clearThumbScore() {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).clearThumbScore();
                return this;
            }

            public Builder clearVideoAudioScore() {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).clearVideoAudioScore();
                return this;
            }

            public Builder clearVideoCoverScore() {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).clearVideoCoverScore();
                return this;
            }

            public Builder clearVideoScore() {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).clearVideoScore();
                return this;
            }

            public boolean getHasStickers() {
                return ((FinderMediaCodecInfo) this.instance).getHasStickers();
            }

            public float getHdimgScore() {
                return ((FinderMediaCodecInfo) this.instance).getHdimgScore();
            }

            public float getThumbScore() {
                return ((FinderMediaCodecInfo) this.instance).getThumbScore();
            }

            public float getVideoAudioScore() {
                return ((FinderMediaCodecInfo) this.instance).getVideoAudioScore();
            }

            public float getVideoCoverScore() {
                return ((FinderMediaCodecInfo) this.instance).getVideoCoverScore();
            }

            public float getVideoScore() {
                return ((FinderMediaCodecInfo) this.instance).getVideoScore();
            }

            public boolean hasHasStickers() {
                return ((FinderMediaCodecInfo) this.instance).hasHasStickers();
            }

            public boolean hasHdimgScore() {
                return ((FinderMediaCodecInfo) this.instance).hasHdimgScore();
            }

            public boolean hasThumbScore() {
                return ((FinderMediaCodecInfo) this.instance).hasThumbScore();
            }

            public boolean hasVideoAudioScore() {
                return ((FinderMediaCodecInfo) this.instance).hasVideoAudioScore();
            }

            public boolean hasVideoCoverScore() {
                return ((FinderMediaCodecInfo) this.instance).hasVideoCoverScore();
            }

            public boolean hasVideoScore() {
                return ((FinderMediaCodecInfo) this.instance).hasVideoScore();
            }

            public Builder setHasStickers(boolean z) {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).setHasStickers(z);
                return this;
            }

            public Builder setHdimgScore(float f) {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).setHdimgScore(f);
                return this;
            }

            public Builder setThumbScore(float f) {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).setThumbScore(f);
                return this;
            }

            public Builder setVideoAudioScore(float f) {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).setVideoAudioScore(f);
                return this;
            }

            public Builder setVideoCoverScore(float f) {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).setVideoCoverScore(f);
                return this;
            }

            public Builder setVideoScore(float f) {
                copyOnWrite();
                ((FinderMediaCodecInfo) this.instance).setVideoScore(f);
                return this;
            }

            private Builder() {
                super(FinderMediaCodecInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderMediaCodecInfo finderMediaCodecInfo = new FinderMediaCodecInfo();
            DEFAULT_INSTANCE = finderMediaCodecInfo;
            C23861l0.registerDefaultInstance(FinderMediaCodecInfo.class, finderMediaCodecInfo);
        }

        private FinderMediaCodecInfo() {
        }

        /* access modifiers changed from: private */
        public void clearHasStickers() {
            this.bitField0_ &= -33;
            this.hasStickers_ = false;
        }

        /* access modifiers changed from: private */
        public void clearHdimgScore() {
            this.bitField0_ &= -17;
            this.hdimgScore_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearThumbScore() {
            this.bitField0_ &= -9;
            this.thumbScore_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearVideoAudioScore() {
            this.bitField0_ &= -5;
            this.videoAudioScore_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearVideoCoverScore() {
            this.bitField0_ &= -3;
            this.videoCoverScore_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearVideoScore() {
            this.bitField0_ &= -2;
            this.videoScore_ = 0.0f;
        }

        public static FinderMediaCodecInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderMediaCodecInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderMediaCodecInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderMediaCodecInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderMediaCodecInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setHasStickers(boolean z) {
            this.bitField0_ |= 32;
            this.hasStickers_ = z;
        }

        /* access modifiers changed from: private */
        public void setHdimgScore(float f) {
            this.bitField0_ |= 16;
            this.hdimgScore_ = f;
        }

        /* access modifiers changed from: private */
        public void setThumbScore(float f) {
            this.bitField0_ |= 8;
            this.thumbScore_ = f;
        }

        /* access modifiers changed from: private */
        public void setVideoAudioScore(float f) {
            this.bitField0_ |= 4;
            this.videoAudioScore_ = f;
        }

        /* access modifiers changed from: private */
        public void setVideoCoverScore(float f) {
            this.bitField0_ |= 2;
            this.videoCoverScore_ = f;
        }

        /* access modifiers changed from: private */
        public void setVideoScore(float f) {
            this.bitField0_ |= 1;
            this.videoScore_ = f;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "videoScore_", "videoCoverScore_", "videoAudioScore_", "thumbScore_", "hdimgScore_", "hasStickers_"});
                case 3:
                    return new FinderMediaCodecInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderMediaCodecInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderMediaCodecInfo.class) {
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

        public boolean getHasStickers() {
            return this.hasStickers_;
        }

        public float getHdimgScore() {
            return this.hdimgScore_;
        }

        public float getThumbScore() {
            return this.thumbScore_;
        }

        public float getVideoAudioScore() {
            return this.videoAudioScore_;
        }

        public float getVideoCoverScore() {
            return this.videoCoverScore_;
        }

        public float getVideoScore() {
            return this.videoScore_;
        }

        public boolean hasHasStickers() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasHdimgScore() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasThumbScore() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasVideoAudioScore() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasVideoCoverScore() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasVideoScore() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FinderMediaCodecInfo finderMediaCodecInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderMediaCodecInfo);
        }

        public static FinderMediaCodecInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderMediaCodecInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderMediaCodecInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderMediaCodecInfo parseFrom(C16994k kVar) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderMediaCodecInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderMediaCodecInfo parseFrom(byte[] bArr) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderMediaCodecInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderMediaCodecInfo parseFrom(InputStream inputStream) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderMediaCodecInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderMediaCodecInfo parseFrom(C23856l lVar) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderMediaCodecInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderMediaCodecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderMediaCodecInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getHasStickers();

        float getHdimgScore();

        float getThumbScore();

        float getVideoAudioScore();

        float getVideoCoverScore();

        float getVideoScore();

        boolean hasHasStickers();

        boolean hasHdimgScore();

        boolean hasThumbScore();

        boolean hasVideoAudioScore();

        boolean hasVideoCoverScore();

        boolean hasVideoScore();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderMediaOrBuilder extends C23848k1 {
        int getBitrate();

        FinderMediaCodecInfo getCodecInfo();

        String getCoverUrl();

        C16994k getCoverUrlBytes();

        String getCoverUrlToken();

        C16994k getCoverUrlTokenBytes();

        String getDecodeKey();

        C16994k getDecodeKeyBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getFileSize();

        int getFullBitrate();

        String getFullCoverUrl();

        C16994k getFullCoverUrlBytes();

        String getFullCoverUrlToken();

        C16994k getFullCoverUrlTokenBytes();

        int getFullFileSize();

        float getFullHeight();

        String getFullMd5Sum();

        C16994k getFullMd5SumBytes();

        String getFullThumbUrl();

        C16994k getFullThumbUrlBytes();

        String getFullThumbUrlToken();

        C16994k getFullThumbUrlTokenBytes();

        String getFullUrl();

        C16994k getFullUrlBytes();

        String getFullUrlToken();

        C16994k getFullUrlTokenBytes();

        float getFullWidth();

        FinderHdrMediaSpecList getHdrSpec();

        float getHeight();

        FinderHlsMediaSpecList getHlsSpec();

        int getHotFlag();

        FinderLiveMediaSpec getLiveSpec();

        String getMd5Sum();

        C16994k getMd5SumBytes();

        int getMediaType();

        FinderMediaSpec getSpec(int i);

        int getSpecCount();

        List<FinderMediaSpec> getSpecList();

        String getThumbUrl();

        C16994k getThumbUrlBytes();

        String getThumbUrlToken();

        C16994k getThumbUrlTokenBytes();

        String getUrl();

        C16994k getUrlBytes();

        String getUrlToken();

        C16994k getUrlTokenBytes();

        int getVideoDuration();

        float getWidth();

        boolean hasBitrate();

        boolean hasCodecInfo();

        boolean hasCoverUrl();

        boolean hasCoverUrlToken();

        boolean hasDecodeKey();

        boolean hasFileSize();

        boolean hasFullBitrate();

        boolean hasFullCoverUrl();

        boolean hasFullCoverUrlToken();

        boolean hasFullFileSize();

        boolean hasFullHeight();

        boolean hasFullMd5Sum();

        boolean hasFullThumbUrl();

        boolean hasFullThumbUrlToken();

        boolean hasFullUrl();

        boolean hasFullUrlToken();

        boolean hasFullWidth();

        boolean hasHdrSpec();

        boolean hasHeight();

        boolean hasHlsSpec();

        boolean hasHotFlag();

        boolean hasLiveSpec();

        boolean hasMd5Sum();

        boolean hasMediaType();

        boolean hasThumbUrl();

        boolean hasThumbUrlToken();

        boolean hasUrl();

        boolean hasUrlToken();

        boolean hasVideoDuration();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderMediaSpec extends C23861l0<FinderMediaSpec, Builder> implements FinderMediaSpecOrBuilder {
        public static final int BIT_RATE_FIELD_NUMBER = 3;
        public static final int CODING_FORMAT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final FinderMediaSpec DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 9;
        public static final int DYNAMIC_RANGE_TYPE_FIELD_NUMBER = 5;
        public static final int FILE_FORMAT_FIELD_NUMBER = 1;
        public static final int FIRST_LOAD_BYTES_FIELD_NUMBER = 2;
        public static final int HEIGHT_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderMediaSpec> PARSER = null;
        public static final int VFPS_FIELD_NUMBER = 6;
        public static final int WIDTH_FIELD_NUMBER = 7;
        private int bitField0_;
        private int bitRate_;
        private String codingFormat_ = "";
        private int durationMs_;
        private int dynamicRangeType_;
        private String fileFormat_ = "";
        private int firstLoadBytes_;
        private int height_;
        private float vfps_;
        private int width_;

        public static final class Builder extends C23861l0.C23862a<FinderMediaSpec, Builder> implements FinderMediaSpecOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearBitRate() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearBitRate();
                return this;
            }

            public Builder clearCodingFormat() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearCodingFormat();
                return this;
            }

            public Builder clearDurationMs() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearDurationMs();
                return this;
            }

            public Builder clearDynamicRangeType() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearDynamicRangeType();
                return this;
            }

            public Builder clearFileFormat() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearFileFormat();
                return this;
            }

            public Builder clearFirstLoadBytes() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearFirstLoadBytes();
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearHeight();
                return this;
            }

            public Builder clearVfps() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearVfps();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).clearWidth();
                return this;
            }

            public int getBitRate() {
                return ((FinderMediaSpec) this.instance).getBitRate();
            }

            public String getCodingFormat() {
                return ((FinderMediaSpec) this.instance).getCodingFormat();
            }

            public C16994k getCodingFormatBytes() {
                return ((FinderMediaSpec) this.instance).getCodingFormatBytes();
            }

            public int getDurationMs() {
                return ((FinderMediaSpec) this.instance).getDurationMs();
            }

            public int getDynamicRangeType() {
                return ((FinderMediaSpec) this.instance).getDynamicRangeType();
            }

            public String getFileFormat() {
                return ((FinderMediaSpec) this.instance).getFileFormat();
            }

            public C16994k getFileFormatBytes() {
                return ((FinderMediaSpec) this.instance).getFileFormatBytes();
            }

            public int getFirstLoadBytes() {
                return ((FinderMediaSpec) this.instance).getFirstLoadBytes();
            }

            public int getHeight() {
                return ((FinderMediaSpec) this.instance).getHeight();
            }

            public float getVfps() {
                return ((FinderMediaSpec) this.instance).getVfps();
            }

            public int getWidth() {
                return ((FinderMediaSpec) this.instance).getWidth();
            }

            public boolean hasBitRate() {
                return ((FinderMediaSpec) this.instance).hasBitRate();
            }

            public boolean hasCodingFormat() {
                return ((FinderMediaSpec) this.instance).hasCodingFormat();
            }

            public boolean hasDurationMs() {
                return ((FinderMediaSpec) this.instance).hasDurationMs();
            }

            public boolean hasDynamicRangeType() {
                return ((FinderMediaSpec) this.instance).hasDynamicRangeType();
            }

            public boolean hasFileFormat() {
                return ((FinderMediaSpec) this.instance).hasFileFormat();
            }

            public boolean hasFirstLoadBytes() {
                return ((FinderMediaSpec) this.instance).hasFirstLoadBytes();
            }

            public boolean hasHeight() {
                return ((FinderMediaSpec) this.instance).hasHeight();
            }

            public boolean hasVfps() {
                return ((FinderMediaSpec) this.instance).hasVfps();
            }

            public boolean hasWidth() {
                return ((FinderMediaSpec) this.instance).hasWidth();
            }

            public Builder setBitRate(int i) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setBitRate(i);
                return this;
            }

            public Builder setCodingFormat(String str) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setCodingFormat(str);
                return this;
            }

            public Builder setCodingFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setCodingFormatBytes(kVar);
                return this;
            }

            public Builder setDurationMs(int i) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setDurationMs(i);
                return this;
            }

            public Builder setDynamicRangeType(int i) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setDynamicRangeType(i);
                return this;
            }

            public Builder setFileFormat(String str) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setFileFormat(str);
                return this;
            }

            public Builder setFileFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setFileFormatBytes(kVar);
                return this;
            }

            public Builder setFirstLoadBytes(int i) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setFirstLoadBytes(i);
                return this;
            }

            public Builder setHeight(int i) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setHeight(i);
                return this;
            }

            public Builder setVfps(float f) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setVfps(f);
                return this;
            }

            public Builder setWidth(int i) {
                copyOnWrite();
                ((FinderMediaSpec) this.instance).setWidth(i);
                return this;
            }

            private Builder() {
                super(FinderMediaSpec.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderMediaSpec finderMediaSpec = new FinderMediaSpec();
            DEFAULT_INSTANCE = finderMediaSpec;
            C23861l0.registerDefaultInstance(FinderMediaSpec.class, finderMediaSpec);
        }

        private FinderMediaSpec() {
        }

        /* access modifiers changed from: private */
        public void clearBitRate() {
            this.bitField0_ &= -5;
            this.bitRate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCodingFormat() {
            this.bitField0_ &= -9;
            this.codingFormat_ = getDefaultInstance().getCodingFormat();
        }

        /* access modifiers changed from: private */
        public void clearDurationMs() {
            this.bitField0_ &= -257;
            this.durationMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDynamicRangeType() {
            this.bitField0_ &= -17;
            this.dynamicRangeType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileFormat() {
            this.bitField0_ &= -2;
            this.fileFormat_ = getDefaultInstance().getFileFormat();
        }

        /* access modifiers changed from: private */
        public void clearFirstLoadBytes() {
            this.bitField0_ &= -3;
            this.firstLoadBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeight() {
            this.bitField0_ &= -129;
            this.height_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVfps() {
            this.bitField0_ &= -33;
            this.vfps_ = 0.0f;
        }

        /* access modifiers changed from: private */
        public void clearWidth() {
            this.bitField0_ &= -65;
            this.width_ = 0;
        }

        public static FinderMediaSpec getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderMediaSpec parseDelimitedFrom(InputStream inputStream) {
            return (FinderMediaSpec) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderMediaSpec parseFrom(ByteBuffer byteBuffer) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderMediaSpec> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBitRate(int i) {
            this.bitField0_ |= 4;
            this.bitRate_ = i;
        }

        /* access modifiers changed from: private */
        public void setCodingFormat(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.codingFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setCodingFormatBytes(C16994k kVar) {
            this.codingFormat_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setDurationMs(int i) {
            this.bitField0_ |= 256;
            this.durationMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setDynamicRangeType(int i) {
            this.bitField0_ |= 16;
            this.dynamicRangeType_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileFormat(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fileFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setFileFormatBytes(C16994k kVar) {
            this.fileFormat_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setFirstLoadBytes(int i) {
            this.bitField0_ |= 2;
            this.firstLoadBytes_ = i;
        }

        /* access modifiers changed from: private */
        public void setHeight(int i) {
            this.bitField0_ |= 128;
            this.height_ = i;
        }

        /* access modifiers changed from: private */
        public void setVfps(float f) {
            this.bitField0_ |= 32;
            this.vfps_ = f;
        }

        /* access modifiers changed from: private */
        public void setWidth(int i) {
            this.bitField0_ |= 64;
            this.width_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ခ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b", new Object[]{"bitField0_", "fileFormat_", "firstLoadBytes_", "bitRate_", "codingFormat_", "dynamicRangeType_", "vfps_", "width_", "height_", "durationMs_"});
                case 3:
                    return new FinderMediaSpec();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderMediaSpec> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderMediaSpec.class) {
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

        public int getBitRate() {
            return this.bitRate_;
        }

        public String getCodingFormat() {
            return this.codingFormat_;
        }

        public C16994k getCodingFormatBytes() {
            return C16994k.m16791k(this.codingFormat_);
        }

        public int getDurationMs() {
            return this.durationMs_;
        }

        public int getDynamicRangeType() {
            return this.dynamicRangeType_;
        }

        public String getFileFormat() {
            return this.fileFormat_;
        }

        public C16994k getFileFormatBytes() {
            return C16994k.m16791k(this.fileFormat_);
        }

        public int getFirstLoadBytes() {
            return this.firstLoadBytes_;
        }

        public int getHeight() {
            return this.height_;
        }

        public float getVfps() {
            return this.vfps_;
        }

        public int getWidth() {
            return this.width_;
        }

        public boolean hasBitRate() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCodingFormat() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDurationMs() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDynamicRangeType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasFileFormat() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFirstLoadBytes() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasHeight() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasVfps() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasWidth() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(FinderMediaSpec finderMediaSpec) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderMediaSpec);
        }

        public static FinderMediaSpec parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderMediaSpec) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderMediaSpec parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderMediaSpec parseFrom(C16994k kVar) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderMediaSpec parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderMediaSpec parseFrom(byte[] bArr) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderMediaSpec parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderMediaSpec parseFrom(InputStream inputStream) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderMediaSpec parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderMediaSpec parseFrom(C23856l lVar) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderMediaSpec parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderMediaSpec) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderMediaSpecOrBuilder extends C23848k1 {
        int getBitRate();

        String getCodingFormat();

        C16994k getCodingFormatBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDurationMs();

        int getDynamicRangeType();

        String getFileFormat();

        C16994k getFileFormatBytes();

        int getFirstLoadBytes();

        int getHeight();

        float getVfps();

        int getWidth();

        boolean hasBitRate();

        boolean hasCodingFormat();

        boolean hasDurationMs();

        boolean hasDynamicRangeType();

        boolean hasFileFormat();

        boolean hasFirstLoadBytes();

        boolean hasHeight();

        boolean hasVfps();

        boolean hasWidth();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderObject extends C23861l0<FinderObject, Builder> implements FinderObjectOrBuilder {
        public static final int CREATETIME_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final FinderObject DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int LIKE_FLAG_FIELD_NUMBER = 6;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        public static final int OBJECT_DESC_FIELD_NUMBER = 4;
        private static volatile C24062w1<FinderObject> PARSER = null;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private int createtime_;
        private String id_ = "";
        private int likeFlag_;
        private String nickname_ = "";
        private FinderObjectDesc objectDesc_;
        private String username_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderObject, Builder> implements FinderObjectOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearCreatetime() {
                copyOnWrite();
                ((FinderObject) this.instance).clearCreatetime();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((FinderObject) this.instance).clearId();
                return this;
            }

            public Builder clearLikeFlag() {
                copyOnWrite();
                ((FinderObject) this.instance).clearLikeFlag();
                return this;
            }

            public Builder clearNickname() {
                copyOnWrite();
                ((FinderObject) this.instance).clearNickname();
                return this;
            }

            public Builder clearObjectDesc() {
                copyOnWrite();
                ((FinderObject) this.instance).clearObjectDesc();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderObject) this.instance).clearUsername();
                return this;
            }

            public int getCreatetime() {
                return ((FinderObject) this.instance).getCreatetime();
            }

            public String getId() {
                return ((FinderObject) this.instance).getId();
            }

            public C16994k getIdBytes() {
                return ((FinderObject) this.instance).getIdBytes();
            }

            public int getLikeFlag() {
                return ((FinderObject) this.instance).getLikeFlag();
            }

            public String getNickname() {
                return ((FinderObject) this.instance).getNickname();
            }

            public C16994k getNicknameBytes() {
                return ((FinderObject) this.instance).getNicknameBytes();
            }

            public FinderObjectDesc getObjectDesc() {
                return ((FinderObject) this.instance).getObjectDesc();
            }

            public String getUsername() {
                return ((FinderObject) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderObject) this.instance).getUsernameBytes();
            }

            public boolean hasCreatetime() {
                return ((FinderObject) this.instance).hasCreatetime();
            }

            public boolean hasId() {
                return ((FinderObject) this.instance).hasId();
            }

            public boolean hasLikeFlag() {
                return ((FinderObject) this.instance).hasLikeFlag();
            }

            public boolean hasNickname() {
                return ((FinderObject) this.instance).hasNickname();
            }

            public boolean hasObjectDesc() {
                return ((FinderObject) this.instance).hasObjectDesc();
            }

            public boolean hasUsername() {
                return ((FinderObject) this.instance).hasUsername();
            }

            public Builder mergeObjectDesc(FinderObjectDesc finderObjectDesc) {
                copyOnWrite();
                ((FinderObject) this.instance).mergeObjectDesc(finderObjectDesc);
                return this;
            }

            public Builder setCreatetime(int i) {
                copyOnWrite();
                ((FinderObject) this.instance).setCreatetime(i);
                return this;
            }

            public Builder setId(String str) {
                copyOnWrite();
                ((FinderObject) this.instance).setId(str);
                return this;
            }

            public Builder setIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderObject) this.instance).setIdBytes(kVar);
                return this;
            }

            public Builder setLikeFlag(int i) {
                copyOnWrite();
                ((FinderObject) this.instance).setLikeFlag(i);
                return this;
            }

            public Builder setNickname(String str) {
                copyOnWrite();
                ((FinderObject) this.instance).setNickname(str);
                return this;
            }

            public Builder setNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderObject) this.instance).setNicknameBytes(kVar);
                return this;
            }

            public Builder setObjectDesc(FinderObjectDesc finderObjectDesc) {
                copyOnWrite();
                ((FinderObject) this.instance).setObjectDesc(finderObjectDesc);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderObject) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderObject) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderObject.DEFAULT_INSTANCE);
            }

            public Builder setObjectDesc(FinderObjectDesc.Builder builder) {
                copyOnWrite();
                ((FinderObject) this.instance).setObjectDesc((FinderObjectDesc) builder.build());
                return this;
            }
        }

        static {
            FinderObject finderObject = new FinderObject();
            DEFAULT_INSTANCE = finderObject;
            C23861l0.registerDefaultInstance(FinderObject.class, finderObject);
        }

        private FinderObject() {
        }

        /* access modifiers changed from: private */
        public void clearCreatetime() {
            this.bitField0_ &= -17;
            this.createtime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = getDefaultInstance().getId();
        }

        /* access modifiers changed from: private */
        public void clearLikeFlag() {
            this.bitField0_ &= -33;
            this.likeFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNickname() {
            this.bitField0_ &= -3;
            this.nickname_ = getDefaultInstance().getNickname();
        }

        /* access modifiers changed from: private */
        public void clearObjectDesc() {
            this.objectDesc_ = null;
            this.bitField0_ &= -9;
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -5;
            this.username_ = getDefaultInstance().getUsername();
        }

        public static FinderObject getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeObjectDesc(FinderObjectDesc finderObjectDesc) {
            finderObjectDesc.getClass();
            FinderObjectDesc finderObjectDesc2 = this.objectDesc_;
            if (finderObjectDesc2 == null || finderObjectDesc2 == FinderObjectDesc.getDefaultInstance()) {
                this.objectDesc_ = finderObjectDesc;
            } else {
                this.objectDesc_ = (FinderObjectDesc) ((FinderObjectDesc.Builder) FinderObjectDesc.newBuilder(this.objectDesc_).mergeFrom(finderObjectDesc)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderObject parseDelimitedFrom(InputStream inputStream) {
            return (FinderObject) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderObject parseFrom(ByteBuffer byteBuffer) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderObject> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCreatetime(int i) {
            this.bitField0_ |= 16;
            this.createtime_ = i;
        }

        /* access modifiers changed from: private */
        public void setId(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.id_ = str;
        }

        /* access modifiers changed from: private */
        public void setIdBytes(C16994k kVar) {
            this.id_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setLikeFlag(int i) {
            this.bitField0_ |= 32;
            this.likeFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setNickname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.nickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setNicknameBytes(C16994k kVar) {
            this.nickname_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setObjectDesc(FinderObjectDesc finderObjectDesc) {
            finderObjectDesc.getClass();
            this.objectDesc_ = finderObjectDesc;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"bitField0_", "id_", "nickname_", "username_", "objectDesc_", "createtime_", "likeFlag_"});
                case 3:
                    return new FinderObject();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderObject> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderObject.class) {
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

        public int getCreatetime() {
            return this.createtime_;
        }

        public String getId() {
            return this.id_;
        }

        public C16994k getIdBytes() {
            return C16994k.m16791k(this.id_);
        }

        public int getLikeFlag() {
            return this.likeFlag_;
        }

        public String getNickname() {
            return this.nickname_;
        }

        public C16994k getNicknameBytes() {
            return C16994k.m16791k(this.nickname_);
        }

        public FinderObjectDesc getObjectDesc() {
            FinderObjectDesc finderObjectDesc = this.objectDesc_;
            return finderObjectDesc == null ? FinderObjectDesc.getDefaultInstance() : finderObjectDesc;
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasCreatetime() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLikeFlag() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasNickname() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasObjectDesc() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(FinderObject finderObject) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderObject);
        }

        public static FinderObject parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderObject) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderObject parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderObject parseFrom(C16994k kVar) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderObject parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderObject parseFrom(byte[] bArr) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderObject parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderObject parseFrom(InputStream inputStream) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderObject parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderObject parseFrom(C23856l lVar) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderObject parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderObject) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderObjectBaseInfo extends C23861l0<FinderObjectBaseInfo, Builder> implements FinderObjectBaseInfoOrBuilder {
        public static final int CLIENT_EXPOSE_COUNT_FIELD_NUMBER = 5;
        public static final int CLIENT_EXPOSE_TIME_MS_FIELD_NUMBER = 4;
        public static final int CLIENT_RECV_TIME_MS_FIELD_NUMBER = 3;
        public static final int CLIENT_UDF_KV_FIELD_NUMBER = 6;
        /* access modifiers changed from: private */
        public static final FinderObjectBaseInfo DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        private static volatile C24062w1<FinderObjectBaseInfo> PARSER = null;
        public static final int SESSION_BUFFER_FIELD_NUMBER = 2;
        private int bitField0_;
        private int clientExposeCount_;
        private long clientExposeTimeMs_;
        private long clientRecvTimeMs_;
        private String clientUdfKv_ = "";
        private long id_;
        private String sessionBuffer_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderObjectBaseInfo, Builder> implements FinderObjectBaseInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearClientExposeCount() {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).clearClientExposeCount();
                return this;
            }

            public Builder clearClientExposeTimeMs() {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).clearClientExposeTimeMs();
                return this;
            }

            public Builder clearClientRecvTimeMs() {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).clearClientRecvTimeMs();
                return this;
            }

            public Builder clearClientUdfKv() {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).clearClientUdfKv();
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).clearId();
                return this;
            }

            public Builder clearSessionBuffer() {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).clearSessionBuffer();
                return this;
            }

            public int getClientExposeCount() {
                return ((FinderObjectBaseInfo) this.instance).getClientExposeCount();
            }

            public long getClientExposeTimeMs() {
                return ((FinderObjectBaseInfo) this.instance).getClientExposeTimeMs();
            }

            public long getClientRecvTimeMs() {
                return ((FinderObjectBaseInfo) this.instance).getClientRecvTimeMs();
            }

            public String getClientUdfKv() {
                return ((FinderObjectBaseInfo) this.instance).getClientUdfKv();
            }

            public C16994k getClientUdfKvBytes() {
                return ((FinderObjectBaseInfo) this.instance).getClientUdfKvBytes();
            }

            public long getId() {
                return ((FinderObjectBaseInfo) this.instance).getId();
            }

            public String getSessionBuffer() {
                return ((FinderObjectBaseInfo) this.instance).getSessionBuffer();
            }

            public C16994k getSessionBufferBytes() {
                return ((FinderObjectBaseInfo) this.instance).getSessionBufferBytes();
            }

            public boolean hasClientExposeCount() {
                return ((FinderObjectBaseInfo) this.instance).hasClientExposeCount();
            }

            public boolean hasClientExposeTimeMs() {
                return ((FinderObjectBaseInfo) this.instance).hasClientExposeTimeMs();
            }

            public boolean hasClientRecvTimeMs() {
                return ((FinderObjectBaseInfo) this.instance).hasClientRecvTimeMs();
            }

            public boolean hasClientUdfKv() {
                return ((FinderObjectBaseInfo) this.instance).hasClientUdfKv();
            }

            public boolean hasId() {
                return ((FinderObjectBaseInfo) this.instance).hasId();
            }

            public boolean hasSessionBuffer() {
                return ((FinderObjectBaseInfo) this.instance).hasSessionBuffer();
            }

            public Builder setClientExposeCount(int i) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setClientExposeCount(i);
                return this;
            }

            public Builder setClientExposeTimeMs(long j) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setClientExposeTimeMs(j);
                return this;
            }

            public Builder setClientRecvTimeMs(long j) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setClientRecvTimeMs(j);
                return this;
            }

            public Builder setClientUdfKv(String str) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setClientUdfKv(str);
                return this;
            }

            public Builder setClientUdfKvBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setClientUdfKvBytes(kVar);
                return this;
            }

            public Builder setId(long j) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setId(j);
                return this;
            }

            public Builder setSessionBuffer(String str) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setSessionBuffer(str);
                return this;
            }

            public Builder setSessionBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderObjectBaseInfo) this.instance).setSessionBufferBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderObjectBaseInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderObjectBaseInfo finderObjectBaseInfo = new FinderObjectBaseInfo();
            DEFAULT_INSTANCE = finderObjectBaseInfo;
            C23861l0.registerDefaultInstance(FinderObjectBaseInfo.class, finderObjectBaseInfo);
        }

        private FinderObjectBaseInfo() {
        }

        /* access modifiers changed from: private */
        public void clearClientExposeCount() {
            this.bitField0_ &= -17;
            this.clientExposeCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearClientExposeTimeMs() {
            this.bitField0_ &= -9;
            this.clientExposeTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearClientRecvTimeMs() {
            this.bitField0_ &= -5;
            this.clientRecvTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearClientUdfKv() {
            this.bitField0_ &= -33;
            this.clientUdfKv_ = getDefaultInstance().getClientUdfKv();
        }

        /* access modifiers changed from: private */
        public void clearId() {
            this.bitField0_ &= -2;
            this.id_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionBuffer() {
            this.bitField0_ &= -3;
            this.sessionBuffer_ = getDefaultInstance().getSessionBuffer();
        }

        public static FinderObjectBaseInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderObjectBaseInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderObjectBaseInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderObjectBaseInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderObjectBaseInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setClientExposeCount(int i) {
            this.bitField0_ |= 16;
            this.clientExposeCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setClientExposeTimeMs(long j) {
            this.bitField0_ |= 8;
            this.clientExposeTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setClientRecvTimeMs(long j) {
            this.bitField0_ |= 4;
            this.clientRecvTimeMs_ = j;
        }

        /* access modifiers changed from: private */
        public void setClientUdfKv(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.clientUdfKv_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientUdfKvBytes(C16994k kVar) {
            this.clientUdfKv_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setId(long j) {
            this.bitField0_ |= 1;
            this.id_ = j;
        }

        /* access modifiers changed from: private */
        public void setSessionBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.sessionBuffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setSessionBufferBytes(C16994k kVar) {
            this.sessionBuffer_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဋ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "id_", "sessionBuffer_", "clientRecvTimeMs_", "clientExposeTimeMs_", "clientExposeCount_", "clientUdfKv_"});
                case 3:
                    return new FinderObjectBaseInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderObjectBaseInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderObjectBaseInfo.class) {
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

        public int getClientExposeCount() {
            return this.clientExposeCount_;
        }

        public long getClientExposeTimeMs() {
            return this.clientExposeTimeMs_;
        }

        public long getClientRecvTimeMs() {
            return this.clientRecvTimeMs_;
        }

        public String getClientUdfKv() {
            return this.clientUdfKv_;
        }

        public C16994k getClientUdfKvBytes() {
            return C16994k.m16791k(this.clientUdfKv_);
        }

        public long getId() {
            return this.id_;
        }

        public String getSessionBuffer() {
            return this.sessionBuffer_;
        }

        public C16994k getSessionBufferBytes() {
            return C16994k.m16791k(this.sessionBuffer_);
        }

        public boolean hasClientExposeCount() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasClientExposeTimeMs() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasClientRecvTimeMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientUdfKv() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasSessionBuffer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderObjectBaseInfo finderObjectBaseInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderObjectBaseInfo);
        }

        public static FinderObjectBaseInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderObjectBaseInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderObjectBaseInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderObjectBaseInfo parseFrom(C16994k kVar) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderObjectBaseInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderObjectBaseInfo parseFrom(byte[] bArr) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderObjectBaseInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderObjectBaseInfo parseFrom(InputStream inputStream) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderObjectBaseInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderObjectBaseInfo parseFrom(C23856l lVar) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderObjectBaseInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderObjectBaseInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderObjectBaseInfoOrBuilder extends C23848k1 {
        int getClientExposeCount();

        long getClientExposeTimeMs();

        long getClientRecvTimeMs();

        String getClientUdfKv();

        C16994k getClientUdfKvBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        long getId();

        String getSessionBuffer();

        C16994k getSessionBufferBytes();

        boolean hasClientExposeCount();

        boolean hasClientExposeTimeMs();

        boolean hasClientRecvTimeMs();

        boolean hasClientUdfKv();

        boolean hasId();

        boolean hasSessionBuffer();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderObjectDesc extends C23861l0<FinderObjectDesc, Builder> implements FinderObjectDescOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderObjectDesc DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        public static final int MEDIA_FIELD_NUMBER = 2;
        public static final int MEDIA_TYPE_FIELD_NUMBER = 3;
        private static volatile C24062w1<FinderObjectDesc> PARSER;
        private int bitField0_;
        private String description_ = "";
        private int mediaType_;
        private C23908o0.C23919j<FinderMedia> media_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FinderObjectDesc, Builder> implements FinderObjectDescOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllMedia(Iterable<? extends FinderMedia> iterable) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).addAllMedia(iterable);
                return this;
            }

            public Builder addMedia(FinderMedia finderMedia) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).addMedia(finderMedia);
                return this;
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).clearDescription();
                return this;
            }

            public Builder clearMedia() {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).clearMedia();
                return this;
            }

            public Builder clearMediaType() {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).clearMediaType();
                return this;
            }

            public String getDescription() {
                return ((FinderObjectDesc) this.instance).getDescription();
            }

            public C16994k getDescriptionBytes() {
                return ((FinderObjectDesc) this.instance).getDescriptionBytes();
            }

            public FinderMedia getMedia(int i) {
                return ((FinderObjectDesc) this.instance).getMedia(i);
            }

            public int getMediaCount() {
                return ((FinderObjectDesc) this.instance).getMediaCount();
            }

            public List<FinderMedia> getMediaList() {
                return Collections.unmodifiableList(((FinderObjectDesc) this.instance).getMediaList());
            }

            public int getMediaType() {
                return ((FinderObjectDesc) this.instance).getMediaType();
            }

            public boolean hasDescription() {
                return ((FinderObjectDesc) this.instance).hasDescription();
            }

            public boolean hasMediaType() {
                return ((FinderObjectDesc) this.instance).hasMediaType();
            }

            public Builder removeMedia(int i) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).removeMedia(i);
                return this;
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).setDescriptionBytes(kVar);
                return this;
            }

            public Builder setMedia(int i, FinderMedia finderMedia) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).setMedia(i, finderMedia);
                return this;
            }

            public Builder setMediaType(int i) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).setMediaType(i);
                return this;
            }

            private Builder() {
                super(FinderObjectDesc.DEFAULT_INSTANCE);
            }

            public Builder addMedia(int i, FinderMedia finderMedia) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).addMedia(i, finderMedia);
                return this;
            }

            public Builder setMedia(int i, FinderMedia.Builder builder) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).setMedia(i, (FinderMedia) builder.build());
                return this;
            }

            public Builder addMedia(FinderMedia.Builder builder) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).addMedia((FinderMedia) builder.build());
                return this;
            }

            public Builder addMedia(int i, FinderMedia.Builder builder) {
                copyOnWrite();
                ((FinderObjectDesc) this.instance).addMedia(i, (FinderMedia) builder.build());
                return this;
            }
        }

        static {
            FinderObjectDesc finderObjectDesc = new FinderObjectDesc();
            DEFAULT_INSTANCE = finderObjectDesc;
            C23861l0.registerDefaultInstance(FinderObjectDesc.class, finderObjectDesc);
        }

        private FinderObjectDesc() {
        }

        /* access modifiers changed from: private */
        public void addAllMedia(Iterable<? extends FinderMedia> iterable) {
            ensureMediaIsMutable();
            C23810b.addAll(iterable, this.media_);
        }

        /* access modifiers changed from: private */
        public void addMedia(FinderMedia finderMedia) {
            finderMedia.getClass();
            ensureMediaIsMutable();
            this.media_.add(finderMedia);
        }

        /* access modifiers changed from: private */
        public void clearDescription() {
            this.bitField0_ &= -2;
            this.description_ = getDefaultInstance().getDescription();
        }

        /* access modifiers changed from: private */
        public void clearMedia() {
            this.media_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearMediaType() {
            this.bitField0_ &= -3;
            this.mediaType_ = 0;
        }

        private void ensureMediaIsMutable() {
            C23908o0.C23919j<FinderMedia> jVar = this.media_;
            if (!jVar.mo37523Q()) {
                this.media_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderObjectDesc getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderObjectDesc parseDelimitedFrom(InputStream inputStream) {
            return (FinderObjectDesc) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderObjectDesc parseFrom(ByteBuffer byteBuffer) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderObjectDesc> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMedia(int i) {
            ensureMediaIsMutable();
            this.media_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.description_ = str;
        }

        /* access modifiers changed from: private */
        public void setDescriptionBytes(C16994k kVar) {
            this.description_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setMedia(int i, FinderMedia finderMedia) {
            finderMedia.getClass();
            ensureMediaIsMutable();
            this.media_.set(i, finderMedia);
        }

        /* access modifiers changed from: private */
        public void setMediaType(int i) {
            this.bitField0_ |= 2;
            this.mediaType_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဋ\u0001", new Object[]{"bitField0_", "description_", "media_", FinderMedia.class, "mediaType_"});
                case 3:
                    return new FinderObjectDesc();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderObjectDesc> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderObjectDesc.class) {
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

        public String getDescription() {
            return this.description_;
        }

        public C16994k getDescriptionBytes() {
            return C16994k.m16791k(this.description_);
        }

        public FinderMedia getMedia(int i) {
            return this.media_.get(i);
        }

        public int getMediaCount() {
            return this.media_.size();
        }

        public List<FinderMedia> getMediaList() {
            return this.media_;
        }

        public FinderMediaOrBuilder getMediaOrBuilder(int i) {
            return this.media_.get(i);
        }

        public List<? extends FinderMediaOrBuilder> getMediaOrBuilderList() {
            return this.media_;
        }

        public int getMediaType() {
            return this.mediaType_;
        }

        public boolean hasDescription() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMediaType() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(FinderObjectDesc finderObjectDesc) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderObjectDesc);
        }

        public static FinderObjectDesc parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderObjectDesc) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderObjectDesc parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderObjectDesc parseFrom(C16994k kVar) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addMedia(int i, FinderMedia finderMedia) {
            finderMedia.getClass();
            ensureMediaIsMutable();
            this.media_.add(i, finderMedia);
        }

        public static FinderObjectDesc parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderObjectDesc parseFrom(byte[] bArr) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderObjectDesc parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderObjectDesc parseFrom(InputStream inputStream) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderObjectDesc parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderObjectDesc parseFrom(C23856l lVar) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderObjectDesc parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderObjectDesc) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderObjectDescOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDescription();

        C16994k getDescriptionBytes();

        FinderMedia getMedia(int i);

        int getMediaCount();

        List<FinderMedia> getMediaList();

        int getMediaType();

        boolean hasDescription();

        boolean hasMediaType();

        /* synthetic */ boolean isInitialized();
    }

    public interface FinderObjectOrBuilder extends C23848k1 {
        int getCreatetime();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getId();

        C16994k getIdBytes();

        int getLikeFlag();

        String getNickname();

        C16994k getNicknameBytes();

        FinderObjectDesc getObjectDesc();

        String getUsername();

        C16994k getUsernameBytes();

        boolean hasCreatetime();

        boolean hasId();

        boolean hasLikeFlag();

        boolean hasNickname();

        boolean hasObjectDesc();

        boolean hasUsername();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderWaitDetail extends C23861l0<FinderWaitDetail, Builder> implements FinderWaitDetailOrBuilder {
        /* access modifiers changed from: private */
        public static final FinderWaitDetail DEFAULT_INSTANCE;
        private static volatile C24062w1<FinderWaitDetail> PARSER = null;
        public static final int PERCENT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        public static final int WAITMS_FIELD_NUMBER = 3;
        private int bitField0_;
        private int percent_;
        private int type_;
        private int waitMs_;

        public static final class Builder extends C23861l0.C23862a<FinderWaitDetail, Builder> implements FinderWaitDetailOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearPercent() {
                copyOnWrite();
                ((FinderWaitDetail) this.instance).clearPercent();
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((FinderWaitDetail) this.instance).clearType();
                return this;
            }

            public Builder clearWaitMs() {
                copyOnWrite();
                ((FinderWaitDetail) this.instance).clearWaitMs();
                return this;
            }

            public int getPercent() {
                return ((FinderWaitDetail) this.instance).getPercent();
            }

            public int getType() {
                return ((FinderWaitDetail) this.instance).getType();
            }

            public int getWaitMs() {
                return ((FinderWaitDetail) this.instance).getWaitMs();
            }

            public boolean hasPercent() {
                return ((FinderWaitDetail) this.instance).hasPercent();
            }

            public boolean hasType() {
                return ((FinderWaitDetail) this.instance).hasType();
            }

            public boolean hasWaitMs() {
                return ((FinderWaitDetail) this.instance).hasWaitMs();
            }

            public Builder setPercent(int i) {
                copyOnWrite();
                ((FinderWaitDetail) this.instance).setPercent(i);
                return this;
            }

            public Builder setType(int i) {
                copyOnWrite();
                ((FinderWaitDetail) this.instance).setType(i);
                return this;
            }

            public Builder setWaitMs(int i) {
                copyOnWrite();
                ((FinderWaitDetail) this.instance).setWaitMs(i);
                return this;
            }

            private Builder() {
                super(FinderWaitDetail.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderWaitDetail finderWaitDetail = new FinderWaitDetail();
            DEFAULT_INSTANCE = finderWaitDetail;
            C23861l0.registerDefaultInstance(FinderWaitDetail.class, finderWaitDetail);
        }

        private FinderWaitDetail() {
        }

        /* access modifiers changed from: private */
        public void clearPercent() {
            this.bitField0_ &= -3;
            this.percent_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearType() {
            this.bitField0_ &= -2;
            this.type_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWaitMs() {
            this.bitField0_ &= -5;
            this.waitMs_ = 0;
        }

        public static FinderWaitDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderWaitDetail parseDelimitedFrom(InputStream inputStream) {
            return (FinderWaitDetail) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderWaitDetail parseFrom(ByteBuffer byteBuffer) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderWaitDetail> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setPercent(int i) {
            this.bitField0_ |= 2;
            this.percent_ = i;
        }

        /* access modifiers changed from: private */
        public void setType(int i) {
            this.bitField0_ |= 1;
            this.type_ = i;
        }

        /* access modifiers changed from: private */
        public void setWaitMs(int i) {
            this.bitField0_ |= 4;
            this.waitMs_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"bitField0_", "type_", "percent_", "waitMs_"});
                case 3:
                    return new FinderWaitDetail();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderWaitDetail> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderWaitDetail.class) {
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

        public int getPercent() {
            return this.percent_;
        }

        public int getType() {
            return this.type_;
        }

        public int getWaitMs() {
            return this.waitMs_;
        }

        public boolean hasPercent() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWaitMs() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(FinderWaitDetail finderWaitDetail) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderWaitDetail);
        }

        public static FinderWaitDetail parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderWaitDetail) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderWaitDetail parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderWaitDetail parseFrom(C16994k kVar) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderWaitDetail parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderWaitDetail parseFrom(byte[] bArr) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderWaitDetail parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderWaitDetail parseFrom(InputStream inputStream) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderWaitDetail parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderWaitDetail parseFrom(C23856l lVar) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderWaitDetail parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderWaitDetail) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderWaitDetailOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getPercent();

        int getType();

        int getWaitMs();

        boolean hasPercent();

        boolean hasType();

        boolean hasWaitMs();

        /* synthetic */ boolean isInitialized();
    }

    public static final class FinderClientStatus extends C23861l0<FinderClientStatus, Builder> implements FinderClientStatusOrBuilder {
        public static final int BANDWIDTHKBPS_FIELD_NUMBER = 3;
        public static final int CLIENT_IP_FIELD_NUMBER = 13;
        public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
        /* access modifiers changed from: private */
        public static final FinderClientStatus DEFAULT_INSTANCE;
        public static final int DEVICEBRAND_FIELD_NUMBER = 6;
        public static final int DEVICEMODEL_FIELD_NUMBER = 5;
        public static final int DEVICE_TYPE_ID_FIELD_NUMBER = 11;
        public static final int FINDERFLUENCYINFO_FIELD_NUMBER = 10;
        public static final int LASTVIDEOSDOWNLOADINFO_FIELD_NUMBER = 4;
        public static final int LAST_PRELOAD_DOWNLOAD_INFO_FIELD_NUMBER = 16;
        public static final int NETNAME_FIELD_NUMBER = 2;
        public static final int NETTYPE_FIELD_NUMBER = 1;
        public static final int OSNAME_FIELD_NUMBER = 7;
        public static final int OSVERSION_FIELD_NUMBER = 8;
        private static volatile C24062w1<FinderClientStatus> PARSER = null;
        public static final int RECENT_FINDER_DOWNLOAD_SPEED_FIELD_NUMBER = 14;
        public static final int RECENT_WECHAT_DOWNLOAD_SPEED_FIELD_NUMBER = 15;
        public static final int SUPPORTEDFILEFORMAT_FIELD_NUMBER = 9;
        private int bandwidthKbps_;
        private int bitField0_;
        private String clientIp_ = "";
        private int clientVersion_;
        private String deviceBrand_ = "";
        private String deviceModel_ = "";
        private int deviceTypeId_;
        private C23908o0.C23919j<FinderFluencyInfo> finderFluencyInfo_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<FinderDownloadInfo> lastPreloadDownloadInfo_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<FinderDownloadInfo> lastVideosDownloadInfo_ = C23861l0.emptyProtobufList();
        private String netName_ = "";
        private int netType_;
        private String osName_ = "";
        private String osVersion_ = "";
        private C23908o0.C23919j<DownloadSpeed> recentFinderDownloadSpeed_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<DownloadSpeed> recentWechatDownloadSpeed_ = C23861l0.emptyProtobufList();
        private C23908o0.C23919j<String> supportedFileFormat_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FinderClientStatus, Builder> implements FinderClientStatusOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllFinderFluencyInfo(Iterable<? extends FinderFluencyInfo> iterable) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addAllFinderFluencyInfo(iterable);
                return this;
            }

            public Builder addAllLastPreloadDownloadInfo(Iterable<? extends FinderDownloadInfo> iterable) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addAllLastPreloadDownloadInfo(iterable);
                return this;
            }

            public Builder addAllLastVideosDownloadInfo(Iterable<? extends FinderDownloadInfo> iterable) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addAllLastVideosDownloadInfo(iterable);
                return this;
            }

            public Builder addAllRecentFinderDownloadSpeed(Iterable<? extends DownloadSpeed> iterable) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addAllRecentFinderDownloadSpeed(iterable);
                return this;
            }

            public Builder addAllRecentWechatDownloadSpeed(Iterable<? extends DownloadSpeed> iterable) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addAllRecentWechatDownloadSpeed(iterable);
                return this;
            }

            public Builder addAllSupportedFileFormat(Iterable<String> iterable) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addAllSupportedFileFormat(iterable);
                return this;
            }

            public Builder addFinderFluencyInfo(FinderFluencyInfo finderFluencyInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addFinderFluencyInfo(finderFluencyInfo);
                return this;
            }

            public Builder addLastPreloadDownloadInfo(FinderDownloadInfo finderDownloadInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastPreloadDownloadInfo(finderDownloadInfo);
                return this;
            }

            public Builder addLastVideosDownloadInfo(FinderDownloadInfo finderDownloadInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastVideosDownloadInfo(finderDownloadInfo);
                return this;
            }

            public Builder addRecentFinderDownloadSpeed(DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentFinderDownloadSpeed(downloadSpeed);
                return this;
            }

            public Builder addRecentWechatDownloadSpeed(DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentWechatDownloadSpeed(downloadSpeed);
                return this;
            }

            public Builder addSupportedFileFormat(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addSupportedFileFormat(str);
                return this;
            }

            public Builder addSupportedFileFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addSupportedFileFormatBytes(kVar);
                return this;
            }

            public Builder clearBandwidthKbps() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearBandwidthKbps();
                return this;
            }

            public Builder clearClientIp() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearClientIp();
                return this;
            }

            public Builder clearClientVersion() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearClientVersion();
                return this;
            }

            public Builder clearDeviceBrand() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearDeviceBrand();
                return this;
            }

            public Builder clearDeviceModel() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearDeviceModel();
                return this;
            }

            public Builder clearDeviceTypeId() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearDeviceTypeId();
                return this;
            }

            public Builder clearFinderFluencyInfo() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearFinderFluencyInfo();
                return this;
            }

            public Builder clearLastPreloadDownloadInfo() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearLastPreloadDownloadInfo();
                return this;
            }

            public Builder clearLastVideosDownloadInfo() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearLastVideosDownloadInfo();
                return this;
            }

            public Builder clearNetName() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearNetName();
                return this;
            }

            public Builder clearNetType() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearNetType();
                return this;
            }

            public Builder clearOsName() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearOsName();
                return this;
            }

            public Builder clearOsVersion() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearOsVersion();
                return this;
            }

            public Builder clearRecentFinderDownloadSpeed() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearRecentFinderDownloadSpeed();
                return this;
            }

            public Builder clearRecentWechatDownloadSpeed() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearRecentWechatDownloadSpeed();
                return this;
            }

            public Builder clearSupportedFileFormat() {
                copyOnWrite();
                ((FinderClientStatus) this.instance).clearSupportedFileFormat();
                return this;
            }

            public int getBandwidthKbps() {
                return ((FinderClientStatus) this.instance).getBandwidthKbps();
            }

            public String getClientIp() {
                return ((FinderClientStatus) this.instance).getClientIp();
            }

            public C16994k getClientIpBytes() {
                return ((FinderClientStatus) this.instance).getClientIpBytes();
            }

            public int getClientVersion() {
                return ((FinderClientStatus) this.instance).getClientVersion();
            }

            public String getDeviceBrand() {
                return ((FinderClientStatus) this.instance).getDeviceBrand();
            }

            public C16994k getDeviceBrandBytes() {
                return ((FinderClientStatus) this.instance).getDeviceBrandBytes();
            }

            public String getDeviceModel() {
                return ((FinderClientStatus) this.instance).getDeviceModel();
            }

            public C16994k getDeviceModelBytes() {
                return ((FinderClientStatus) this.instance).getDeviceModelBytes();
            }

            public int getDeviceTypeId() {
                return ((FinderClientStatus) this.instance).getDeviceTypeId();
            }

            public FinderFluencyInfo getFinderFluencyInfo(int i) {
                return ((FinderClientStatus) this.instance).getFinderFluencyInfo(i);
            }

            public int getFinderFluencyInfoCount() {
                return ((FinderClientStatus) this.instance).getFinderFluencyInfoCount();
            }

            public List<FinderFluencyInfo> getFinderFluencyInfoList() {
                return Collections.unmodifiableList(((FinderClientStatus) this.instance).getFinderFluencyInfoList());
            }

            public FinderDownloadInfo getLastPreloadDownloadInfo(int i) {
                return ((FinderClientStatus) this.instance).getLastPreloadDownloadInfo(i);
            }

            public int getLastPreloadDownloadInfoCount() {
                return ((FinderClientStatus) this.instance).getLastPreloadDownloadInfoCount();
            }

            public List<FinderDownloadInfo> getLastPreloadDownloadInfoList() {
                return Collections.unmodifiableList(((FinderClientStatus) this.instance).getLastPreloadDownloadInfoList());
            }

            public FinderDownloadInfo getLastVideosDownloadInfo(int i) {
                return ((FinderClientStatus) this.instance).getLastVideosDownloadInfo(i);
            }

            public int getLastVideosDownloadInfoCount() {
                return ((FinderClientStatus) this.instance).getLastVideosDownloadInfoCount();
            }

            public List<FinderDownloadInfo> getLastVideosDownloadInfoList() {
                return Collections.unmodifiableList(((FinderClientStatus) this.instance).getLastVideosDownloadInfoList());
            }

            public String getNetName() {
                return ((FinderClientStatus) this.instance).getNetName();
            }

            public C16994k getNetNameBytes() {
                return ((FinderClientStatus) this.instance).getNetNameBytes();
            }

            public int getNetType() {
                return ((FinderClientStatus) this.instance).getNetType();
            }

            public String getOsName() {
                return ((FinderClientStatus) this.instance).getOsName();
            }

            public C16994k getOsNameBytes() {
                return ((FinderClientStatus) this.instance).getOsNameBytes();
            }

            public String getOsVersion() {
                return ((FinderClientStatus) this.instance).getOsVersion();
            }

            public C16994k getOsVersionBytes() {
                return ((FinderClientStatus) this.instance).getOsVersionBytes();
            }

            public DownloadSpeed getRecentFinderDownloadSpeed(int i) {
                return ((FinderClientStatus) this.instance).getRecentFinderDownloadSpeed(i);
            }

            public int getRecentFinderDownloadSpeedCount() {
                return ((FinderClientStatus) this.instance).getRecentFinderDownloadSpeedCount();
            }

            public List<DownloadSpeed> getRecentFinderDownloadSpeedList() {
                return Collections.unmodifiableList(((FinderClientStatus) this.instance).getRecentFinderDownloadSpeedList());
            }

            public DownloadSpeed getRecentWechatDownloadSpeed(int i) {
                return ((FinderClientStatus) this.instance).getRecentWechatDownloadSpeed(i);
            }

            public int getRecentWechatDownloadSpeedCount() {
                return ((FinderClientStatus) this.instance).getRecentWechatDownloadSpeedCount();
            }

            public List<DownloadSpeed> getRecentWechatDownloadSpeedList() {
                return Collections.unmodifiableList(((FinderClientStatus) this.instance).getRecentWechatDownloadSpeedList());
            }

            public String getSupportedFileFormat(int i) {
                return ((FinderClientStatus) this.instance).getSupportedFileFormat(i);
            }

            public C16994k getSupportedFileFormatBytes(int i) {
                return ((FinderClientStatus) this.instance).getSupportedFileFormatBytes(i);
            }

            public int getSupportedFileFormatCount() {
                return ((FinderClientStatus) this.instance).getSupportedFileFormatCount();
            }

            public List<String> getSupportedFileFormatList() {
                return Collections.unmodifiableList(((FinderClientStatus) this.instance).getSupportedFileFormatList());
            }

            public boolean hasBandwidthKbps() {
                return ((FinderClientStatus) this.instance).hasBandwidthKbps();
            }

            public boolean hasClientIp() {
                return ((FinderClientStatus) this.instance).hasClientIp();
            }

            public boolean hasClientVersion() {
                return ((FinderClientStatus) this.instance).hasClientVersion();
            }

            public boolean hasDeviceBrand() {
                return ((FinderClientStatus) this.instance).hasDeviceBrand();
            }

            public boolean hasDeviceModel() {
                return ((FinderClientStatus) this.instance).hasDeviceModel();
            }

            public boolean hasDeviceTypeId() {
                return ((FinderClientStatus) this.instance).hasDeviceTypeId();
            }

            public boolean hasNetName() {
                return ((FinderClientStatus) this.instance).hasNetName();
            }

            public boolean hasNetType() {
                return ((FinderClientStatus) this.instance).hasNetType();
            }

            public boolean hasOsName() {
                return ((FinderClientStatus) this.instance).hasOsName();
            }

            public boolean hasOsVersion() {
                return ((FinderClientStatus) this.instance).hasOsVersion();
            }

            public Builder removeFinderFluencyInfo(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).removeFinderFluencyInfo(i);
                return this;
            }

            public Builder removeLastPreloadDownloadInfo(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).removeLastPreloadDownloadInfo(i);
                return this;
            }

            public Builder removeLastVideosDownloadInfo(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).removeLastVideosDownloadInfo(i);
                return this;
            }

            public Builder removeRecentFinderDownloadSpeed(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).removeRecentFinderDownloadSpeed(i);
                return this;
            }

            public Builder removeRecentWechatDownloadSpeed(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).removeRecentWechatDownloadSpeed(i);
                return this;
            }

            public Builder setBandwidthKbps(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setBandwidthKbps(i);
                return this;
            }

            public Builder setClientIp(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setClientIp(str);
                return this;
            }

            public Builder setClientIpBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setClientIpBytes(kVar);
                return this;
            }

            public Builder setClientVersion(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setClientVersion(i);
                return this;
            }

            public Builder setDeviceBrand(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setDeviceBrand(str);
                return this;
            }

            public Builder setDeviceBrandBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setDeviceBrandBytes(kVar);
                return this;
            }

            public Builder setDeviceModel(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setDeviceModel(str);
                return this;
            }

            public Builder setDeviceModelBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setDeviceModelBytes(kVar);
                return this;
            }

            public Builder setDeviceTypeId(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setDeviceTypeId(i);
                return this;
            }

            public Builder setFinderFluencyInfo(int i, FinderFluencyInfo finderFluencyInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setFinderFluencyInfo(i, finderFluencyInfo);
                return this;
            }

            public Builder setLastPreloadDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setLastPreloadDownloadInfo(i, finderDownloadInfo);
                return this;
            }

            public Builder setLastVideosDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setLastVideosDownloadInfo(i, finderDownloadInfo);
                return this;
            }

            public Builder setNetName(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setNetName(str);
                return this;
            }

            public Builder setNetNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setNetNameBytes(kVar);
                return this;
            }

            public Builder setNetType(int i) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setNetType(i);
                return this;
            }

            public Builder setOsName(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setOsName(str);
                return this;
            }

            public Builder setOsNameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setOsNameBytes(kVar);
                return this;
            }

            public Builder setOsVersion(String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setOsVersion(str);
                return this;
            }

            public Builder setOsVersionBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setOsVersionBytes(kVar);
                return this;
            }

            public Builder setRecentFinderDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setRecentFinderDownloadSpeed(i, downloadSpeed);
                return this;
            }

            public Builder setRecentWechatDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setRecentWechatDownloadSpeed(i, downloadSpeed);
                return this;
            }

            public Builder setSupportedFileFormat(int i, String str) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setSupportedFileFormat(i, str);
                return this;
            }

            private Builder() {
                super(FinderClientStatus.DEFAULT_INSTANCE);
            }

            public Builder addFinderFluencyInfo(int i, FinderFluencyInfo finderFluencyInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addFinderFluencyInfo(i, finderFluencyInfo);
                return this;
            }

            public Builder addLastPreloadDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastPreloadDownloadInfo(i, finderDownloadInfo);
                return this;
            }

            public Builder addLastVideosDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastVideosDownloadInfo(i, finderDownloadInfo);
                return this;
            }

            public Builder addRecentFinderDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentFinderDownloadSpeed(i, downloadSpeed);
                return this;
            }

            public Builder addRecentWechatDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentWechatDownloadSpeed(i, downloadSpeed);
                return this;
            }

            public Builder setFinderFluencyInfo(int i, FinderFluencyInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setFinderFluencyInfo(i, (FinderFluencyInfo) builder.build());
                return this;
            }

            public Builder setLastPreloadDownloadInfo(int i, FinderDownloadInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setLastPreloadDownloadInfo(i, (FinderDownloadInfo) builder.build());
                return this;
            }

            public Builder setLastVideosDownloadInfo(int i, FinderDownloadInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setLastVideosDownloadInfo(i, (FinderDownloadInfo) builder.build());
                return this;
            }

            public Builder setRecentFinderDownloadSpeed(int i, DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setRecentFinderDownloadSpeed(i, (DownloadSpeed) builder.build());
                return this;
            }

            public Builder setRecentWechatDownloadSpeed(int i, DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).setRecentWechatDownloadSpeed(i, (DownloadSpeed) builder.build());
                return this;
            }

            public Builder addFinderFluencyInfo(FinderFluencyInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addFinderFluencyInfo((FinderFluencyInfo) builder.build());
                return this;
            }

            public Builder addLastPreloadDownloadInfo(FinderDownloadInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastPreloadDownloadInfo((FinderDownloadInfo) builder.build());
                return this;
            }

            public Builder addLastVideosDownloadInfo(FinderDownloadInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastVideosDownloadInfo((FinderDownloadInfo) builder.build());
                return this;
            }

            public Builder addRecentFinderDownloadSpeed(DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentFinderDownloadSpeed((DownloadSpeed) builder.build());
                return this;
            }

            public Builder addRecentWechatDownloadSpeed(DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentWechatDownloadSpeed((DownloadSpeed) builder.build());
                return this;
            }

            public Builder addFinderFluencyInfo(int i, FinderFluencyInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addFinderFluencyInfo(i, (FinderFluencyInfo) builder.build());
                return this;
            }

            public Builder addLastPreloadDownloadInfo(int i, FinderDownloadInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastPreloadDownloadInfo(i, (FinderDownloadInfo) builder.build());
                return this;
            }

            public Builder addLastVideosDownloadInfo(int i, FinderDownloadInfo.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addLastVideosDownloadInfo(i, (FinderDownloadInfo) builder.build());
                return this;
            }

            public Builder addRecentFinderDownloadSpeed(int i, DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentFinderDownloadSpeed(i, (DownloadSpeed) builder.build());
                return this;
            }

            public Builder addRecentWechatDownloadSpeed(int i, DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderClientStatus) this.instance).addRecentWechatDownloadSpeed(i, (DownloadSpeed) builder.build());
                return this;
            }
        }

        static {
            FinderClientStatus finderClientStatus = new FinderClientStatus();
            DEFAULT_INSTANCE = finderClientStatus;
            C23861l0.registerDefaultInstance(FinderClientStatus.class, finderClientStatus);
        }

        private FinderClientStatus() {
        }

        /* access modifiers changed from: private */
        public void addAllFinderFluencyInfo(Iterable<? extends FinderFluencyInfo> iterable) {
            ensureFinderFluencyInfoIsMutable();
            C23810b.addAll(iterable, this.finderFluencyInfo_);
        }

        /* access modifiers changed from: private */
        public void addAllLastPreloadDownloadInfo(Iterable<? extends FinderDownloadInfo> iterable) {
            ensureLastPreloadDownloadInfoIsMutable();
            C23810b.addAll(iterable, this.lastPreloadDownloadInfo_);
        }

        /* access modifiers changed from: private */
        public void addAllLastVideosDownloadInfo(Iterable<? extends FinderDownloadInfo> iterable) {
            ensureLastVideosDownloadInfoIsMutable();
            C23810b.addAll(iterable, this.lastVideosDownloadInfo_);
        }

        /* access modifiers changed from: private */
        public void addAllRecentFinderDownloadSpeed(Iterable<? extends DownloadSpeed> iterable) {
            ensureRecentFinderDownloadSpeedIsMutable();
            C23810b.addAll(iterable, this.recentFinderDownloadSpeed_);
        }

        /* access modifiers changed from: private */
        public void addAllRecentWechatDownloadSpeed(Iterable<? extends DownloadSpeed> iterable) {
            ensureRecentWechatDownloadSpeedIsMutable();
            C23810b.addAll(iterable, this.recentWechatDownloadSpeed_);
        }

        /* access modifiers changed from: private */
        public void addAllSupportedFileFormat(Iterable<String> iterable) {
            ensureSupportedFileFormatIsMutable();
            C23810b.addAll(iterable, this.supportedFileFormat_);
        }

        /* access modifiers changed from: private */
        public void addFinderFluencyInfo(FinderFluencyInfo finderFluencyInfo) {
            finderFluencyInfo.getClass();
            ensureFinderFluencyInfoIsMutable();
            this.finderFluencyInfo_.add(finderFluencyInfo);
        }

        /* access modifiers changed from: private */
        public void addLastPreloadDownloadInfo(FinderDownloadInfo finderDownloadInfo) {
            finderDownloadInfo.getClass();
            ensureLastPreloadDownloadInfoIsMutable();
            this.lastPreloadDownloadInfo_.add(finderDownloadInfo);
        }

        /* access modifiers changed from: private */
        public void addLastVideosDownloadInfo(FinderDownloadInfo finderDownloadInfo) {
            finderDownloadInfo.getClass();
            ensureLastVideosDownloadInfoIsMutable();
            this.lastVideosDownloadInfo_.add(finderDownloadInfo);
        }

        /* access modifiers changed from: private */
        public void addRecentFinderDownloadSpeed(DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            ensureRecentFinderDownloadSpeedIsMutable();
            this.recentFinderDownloadSpeed_.add(downloadSpeed);
        }

        /* access modifiers changed from: private */
        public void addRecentWechatDownloadSpeed(DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            ensureRecentWechatDownloadSpeedIsMutable();
            this.recentWechatDownloadSpeed_.add(downloadSpeed);
        }

        /* access modifiers changed from: private */
        public void addSupportedFileFormat(String str) {
            str.getClass();
            ensureSupportedFileFormatIsMutable();
            this.supportedFileFormat_.add(str);
        }

        /* access modifiers changed from: private */
        public void addSupportedFileFormatBytes(C16994k kVar) {
            ensureSupportedFileFormatIsMutable();
            this.supportedFileFormat_.add(kVar.mo18752u());
        }

        /* access modifiers changed from: private */
        public void clearBandwidthKbps() {
            this.bitField0_ &= -5;
            this.bandwidthKbps_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearClientIp() {
            this.bitField0_ &= -513;
            this.clientIp_ = getDefaultInstance().getClientIp();
        }

        /* access modifiers changed from: private */
        public void clearClientVersion() {
            this.bitField0_ &= -257;
            this.clientVersion_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeviceBrand() {
            this.bitField0_ &= -17;
            this.deviceBrand_ = getDefaultInstance().getDeviceBrand();
        }

        /* access modifiers changed from: private */
        public void clearDeviceModel() {
            this.bitField0_ &= -9;
            this.deviceModel_ = getDefaultInstance().getDeviceModel();
        }

        /* access modifiers changed from: private */
        public void clearDeviceTypeId() {
            this.bitField0_ &= -129;
            this.deviceTypeId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinderFluencyInfo() {
            this.finderFluencyInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearLastPreloadDownloadInfo() {
            this.lastPreloadDownloadInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearLastVideosDownloadInfo() {
            this.lastVideosDownloadInfo_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearNetName() {
            this.bitField0_ &= -3;
            this.netName_ = getDefaultInstance().getNetName();
        }

        /* access modifiers changed from: private */
        public void clearNetType() {
            this.bitField0_ &= -2;
            this.netType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOsName() {
            this.bitField0_ &= -33;
            this.osName_ = getDefaultInstance().getOsName();
        }

        /* access modifiers changed from: private */
        public void clearOsVersion() {
            this.bitField0_ &= -65;
            this.osVersion_ = getDefaultInstance().getOsVersion();
        }

        /* access modifiers changed from: private */
        public void clearRecentFinderDownloadSpeed() {
            this.recentFinderDownloadSpeed_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearRecentWechatDownloadSpeed() {
            this.recentWechatDownloadSpeed_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearSupportedFileFormat() {
            this.supportedFileFormat_ = C23861l0.emptyProtobufList();
        }

        private void ensureFinderFluencyInfoIsMutable() {
            C23908o0.C23919j<FinderFluencyInfo> jVar = this.finderFluencyInfo_;
            if (!jVar.mo37523Q()) {
                this.finderFluencyInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureLastPreloadDownloadInfoIsMutable() {
            C23908o0.C23919j<FinderDownloadInfo> jVar = this.lastPreloadDownloadInfo_;
            if (!jVar.mo37523Q()) {
                this.lastPreloadDownloadInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureLastVideosDownloadInfoIsMutable() {
            C23908o0.C23919j<FinderDownloadInfo> jVar = this.lastVideosDownloadInfo_;
            if (!jVar.mo37523Q()) {
                this.lastVideosDownloadInfo_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureRecentFinderDownloadSpeedIsMutable() {
            C23908o0.C23919j<DownloadSpeed> jVar = this.recentFinderDownloadSpeed_;
            if (!jVar.mo37523Q()) {
                this.recentFinderDownloadSpeed_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureRecentWechatDownloadSpeedIsMutable() {
            C23908o0.C23919j<DownloadSpeed> jVar = this.recentWechatDownloadSpeed_;
            if (!jVar.mo37523Q()) {
                this.recentWechatDownloadSpeed_ = C23861l0.mutableCopy(jVar);
            }
        }

        private void ensureSupportedFileFormatIsMutable() {
            C23908o0.C23919j<String> jVar = this.supportedFileFormat_;
            if (!jVar.mo37523Q()) {
                this.supportedFileFormat_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderClientStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderClientStatus parseDelimitedFrom(InputStream inputStream) {
            return (FinderClientStatus) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderClientStatus parseFrom(ByteBuffer byteBuffer) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderClientStatus> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeFinderFluencyInfo(int i) {
            ensureFinderFluencyInfoIsMutable();
            this.finderFluencyInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeLastPreloadDownloadInfo(int i) {
            ensureLastPreloadDownloadInfoIsMutable();
            this.lastPreloadDownloadInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeLastVideosDownloadInfo(int i) {
            ensureLastVideosDownloadInfoIsMutable();
            this.lastVideosDownloadInfo_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeRecentFinderDownloadSpeed(int i) {
            ensureRecentFinderDownloadSpeedIsMutable();
            this.recentFinderDownloadSpeed_.remove(i);
        }

        /* access modifiers changed from: private */
        public void removeRecentWechatDownloadSpeed(int i) {
            ensureRecentWechatDownloadSpeedIsMutable();
            this.recentWechatDownloadSpeed_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBandwidthKbps(int i) {
            this.bitField0_ |= 4;
            this.bandwidthKbps_ = i;
        }

        /* access modifiers changed from: private */
        public void setClientIp(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.clientIp_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientIpBytes(C16994k kVar) {
            this.clientIp_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setClientVersion(int i) {
            this.bitField0_ |= 256;
            this.clientVersion_ = i;
        }

        /* access modifiers changed from: private */
        public void setDeviceBrand(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.deviceBrand_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceBrandBytes(C16994k kVar) {
            this.deviceBrand_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setDeviceModel(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.deviceModel_ = str;
        }

        /* access modifiers changed from: private */
        public void setDeviceModelBytes(C16994k kVar) {
            this.deviceModel_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setDeviceTypeId(int i) {
            this.bitField0_ |= 128;
            this.deviceTypeId_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinderFluencyInfo(int i, FinderFluencyInfo finderFluencyInfo) {
            finderFluencyInfo.getClass();
            ensureFinderFluencyInfoIsMutable();
            this.finderFluencyInfo_.set(i, finderFluencyInfo);
        }

        /* access modifiers changed from: private */
        public void setLastPreloadDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
            finderDownloadInfo.getClass();
            ensureLastPreloadDownloadInfoIsMutable();
            this.lastPreloadDownloadInfo_.set(i, finderDownloadInfo);
        }

        /* access modifiers changed from: private */
        public void setLastVideosDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
            finderDownloadInfo.getClass();
            ensureLastVideosDownloadInfoIsMutable();
            this.lastVideosDownloadInfo_.set(i, finderDownloadInfo);
        }

        /* access modifiers changed from: private */
        public void setNetName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.netName_ = str;
        }

        /* access modifiers changed from: private */
        public void setNetNameBytes(C16994k kVar) {
            this.netName_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setNetType(int i) {
            this.bitField0_ |= 1;
            this.netType_ = i;
        }

        /* access modifiers changed from: private */
        public void setOsName(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.osName_ = str;
        }

        /* access modifiers changed from: private */
        public void setOsNameBytes(C16994k kVar) {
            this.osName_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setOsVersion(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.osVersion_ = str;
        }

        /* access modifiers changed from: private */
        public void setOsVersionBytes(C16994k kVar) {
            this.osVersion_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setRecentFinderDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            ensureRecentFinderDownloadSpeedIsMutable();
            this.recentFinderDownloadSpeed_.set(i, downloadSpeed);
        }

        /* access modifiers changed from: private */
        public void setRecentWechatDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            ensureRecentWechatDownloadSpeedIsMutable();
            this.recentWechatDownloadSpeed_.set(i, downloadSpeed);
        }

        /* access modifiers changed from: private */
        public void setSupportedFileFormat(int i, String str) {
            str.getClass();
            ensureSupportedFileFormatIsMutable();
            this.supportedFileFormat_.set(i, str);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            Class<DownloadSpeed> cls = DownloadSpeed.class;
            Class<FinderDownloadInfo> cls2 = FinderDownloadInfo.class;
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0006\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0003ဋ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\t\u001a\n\u001b\u000bဋ\u0007\fဋ\b\rဈ\t\u000e\u001b\u000f\u001b\u0010\u001b", new Object[]{"bitField0_", "netType_", "netName_", "bandwidthKbps_", "lastVideosDownloadInfo_", cls2, "deviceModel_", "deviceBrand_", "osName_", "osVersion_", "supportedFileFormat_", "finderFluencyInfo_", FinderFluencyInfo.class, "deviceTypeId_", "clientVersion_", "clientIp_", "recentFinderDownloadSpeed_", cls, "recentWechatDownloadSpeed_", cls, "lastPreloadDownloadInfo_", cls2});
                case 3:
                    return new FinderClientStatus();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderClientStatus> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderClientStatus.class) {
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

        public int getBandwidthKbps() {
            return this.bandwidthKbps_;
        }

        public String getClientIp() {
            return this.clientIp_;
        }

        public C16994k getClientIpBytes() {
            return C16994k.m16791k(this.clientIp_);
        }

        public int getClientVersion() {
            return this.clientVersion_;
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

        public int getDeviceTypeId() {
            return this.deviceTypeId_;
        }

        public FinderFluencyInfo getFinderFluencyInfo(int i) {
            return this.finderFluencyInfo_.get(i);
        }

        public int getFinderFluencyInfoCount() {
            return this.finderFluencyInfo_.size();
        }

        public List<FinderFluencyInfo> getFinderFluencyInfoList() {
            return this.finderFluencyInfo_;
        }

        public FinderFluencyInfoOrBuilder getFinderFluencyInfoOrBuilder(int i) {
            return this.finderFluencyInfo_.get(i);
        }

        public List<? extends FinderFluencyInfoOrBuilder> getFinderFluencyInfoOrBuilderList() {
            return this.finderFluencyInfo_;
        }

        public FinderDownloadInfo getLastPreloadDownloadInfo(int i) {
            return this.lastPreloadDownloadInfo_.get(i);
        }

        public int getLastPreloadDownloadInfoCount() {
            return this.lastPreloadDownloadInfo_.size();
        }

        public List<FinderDownloadInfo> getLastPreloadDownloadInfoList() {
            return this.lastPreloadDownloadInfo_;
        }

        public FinderDownloadInfoOrBuilder getLastPreloadDownloadInfoOrBuilder(int i) {
            return this.lastPreloadDownloadInfo_.get(i);
        }

        public List<? extends FinderDownloadInfoOrBuilder> getLastPreloadDownloadInfoOrBuilderList() {
            return this.lastPreloadDownloadInfo_;
        }

        public FinderDownloadInfo getLastVideosDownloadInfo(int i) {
            return this.lastVideosDownloadInfo_.get(i);
        }

        public int getLastVideosDownloadInfoCount() {
            return this.lastVideosDownloadInfo_.size();
        }

        public List<FinderDownloadInfo> getLastVideosDownloadInfoList() {
            return this.lastVideosDownloadInfo_;
        }

        public FinderDownloadInfoOrBuilder getLastVideosDownloadInfoOrBuilder(int i) {
            return this.lastVideosDownloadInfo_.get(i);
        }

        public List<? extends FinderDownloadInfoOrBuilder> getLastVideosDownloadInfoOrBuilderList() {
            return this.lastVideosDownloadInfo_;
        }

        public String getNetName() {
            return this.netName_;
        }

        public C16994k getNetNameBytes() {
            return C16994k.m16791k(this.netName_);
        }

        public int getNetType() {
            return this.netType_;
        }

        public String getOsName() {
            return this.osName_;
        }

        public C16994k getOsNameBytes() {
            return C16994k.m16791k(this.osName_);
        }

        public String getOsVersion() {
            return this.osVersion_;
        }

        public C16994k getOsVersionBytes() {
            return C16994k.m16791k(this.osVersion_);
        }

        public DownloadSpeed getRecentFinderDownloadSpeed(int i) {
            return this.recentFinderDownloadSpeed_.get(i);
        }

        public int getRecentFinderDownloadSpeedCount() {
            return this.recentFinderDownloadSpeed_.size();
        }

        public List<DownloadSpeed> getRecentFinderDownloadSpeedList() {
            return this.recentFinderDownloadSpeed_;
        }

        public DownloadSpeedOrBuilder getRecentFinderDownloadSpeedOrBuilder(int i) {
            return this.recentFinderDownloadSpeed_.get(i);
        }

        public List<? extends DownloadSpeedOrBuilder> getRecentFinderDownloadSpeedOrBuilderList() {
            return this.recentFinderDownloadSpeed_;
        }

        public DownloadSpeed getRecentWechatDownloadSpeed(int i) {
            return this.recentWechatDownloadSpeed_.get(i);
        }

        public int getRecentWechatDownloadSpeedCount() {
            return this.recentWechatDownloadSpeed_.size();
        }

        public List<DownloadSpeed> getRecentWechatDownloadSpeedList() {
            return this.recentWechatDownloadSpeed_;
        }

        public DownloadSpeedOrBuilder getRecentWechatDownloadSpeedOrBuilder(int i) {
            return this.recentWechatDownloadSpeed_.get(i);
        }

        public List<? extends DownloadSpeedOrBuilder> getRecentWechatDownloadSpeedOrBuilderList() {
            return this.recentWechatDownloadSpeed_;
        }

        public String getSupportedFileFormat(int i) {
            return this.supportedFileFormat_.get(i);
        }

        public C16994k getSupportedFileFormatBytes(int i) {
            return C16994k.m16791k(this.supportedFileFormat_.get(i));
        }

        public int getSupportedFileFormatCount() {
            return this.supportedFileFormat_.size();
        }

        public List<String> getSupportedFileFormatList() {
            return this.supportedFileFormat_;
        }

        public boolean hasBandwidthKbps() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientIp() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasClientVersion() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDeviceBrand() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDeviceModel() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDeviceTypeId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasNetName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNetType() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOsName() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasOsVersion() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(FinderClientStatus finderClientStatus) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderClientStatus);
        }

        public static FinderClientStatus parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderClientStatus) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderClientStatus parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderClientStatus parseFrom(C16994k kVar) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addFinderFluencyInfo(int i, FinderFluencyInfo finderFluencyInfo) {
            finderFluencyInfo.getClass();
            ensureFinderFluencyInfoIsMutable();
            this.finderFluencyInfo_.add(i, finderFluencyInfo);
        }

        /* access modifiers changed from: private */
        public void addLastPreloadDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
            finderDownloadInfo.getClass();
            ensureLastPreloadDownloadInfoIsMutable();
            this.lastPreloadDownloadInfo_.add(i, finderDownloadInfo);
        }

        /* access modifiers changed from: private */
        public void addLastVideosDownloadInfo(int i, FinderDownloadInfo finderDownloadInfo) {
            finderDownloadInfo.getClass();
            ensureLastVideosDownloadInfoIsMutable();
            this.lastVideosDownloadInfo_.add(i, finderDownloadInfo);
        }

        /* access modifiers changed from: private */
        public void addRecentFinderDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            ensureRecentFinderDownloadSpeedIsMutable();
            this.recentFinderDownloadSpeed_.add(i, downloadSpeed);
        }

        /* access modifiers changed from: private */
        public void addRecentWechatDownloadSpeed(int i, DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            ensureRecentWechatDownloadSpeedIsMutable();
            this.recentWechatDownloadSpeed_.add(i, downloadSpeed);
        }

        public static FinderClientStatus parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderClientStatus parseFrom(byte[] bArr) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderClientStatus parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderClientStatus parseFrom(InputStream inputStream) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderClientStatus parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderClientStatus parseFrom(C23856l lVar) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderClientStatus parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderClientStatus) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderCommentInfo extends C23861l0<FinderCommentInfo, Builder> implements FinderCommentInfoOrBuilder {
        public static final int AUTHOR_CONTACT_FIELD_NUMBER = 28;
        public static final int BLACKLIST_FLAG_FIELD_NUMBER = 19;
        public static final int CLIENT_ID_FIELD_NUMBER = 22;
        public static final int COMMENT_ID_FIELD_NUMBER = 4;
        public static final int CONTENT_FIELD_NUMBER = 3;
        public static final int CONTENT_TYPE_FIELD_NUMBER = 30;
        public static final int CONTINUE_FLAG_FIELD_NUMBER = 17;
        public static final int CREATETIME_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final FinderCommentInfo DEFAULT_INSTANCE;
        public static final int DELETE_FLAG_FIELD_NUMBER = 6;
        public static final int DISLIKE_COUNT_FIELD_NUMBER = 34;
        public static final int DISLIKE_FLAG_FIELD_NUMBER = 33;
        public static final int DISPLAYID_DISCARDED_FIELD_NUMBER = 11;
        public static final int DISPLAYID_FIELD_NUMBER = 14;
        public static final int DISPLAY_FLAG_FIELD_NUMBER = 18;
        public static final int EXPAND_COMMENT_COUNT_FIELD_NUMBER = 15;
        public static final int EXT_FLAG_FIELD_NUMBER = 25;
        public static final int HEAD_URL_FIELD_NUMBER = 7;
        public static final int IP_REGION_INFO_FIELD_NUMBER = 35;
        public static final int LAST_BUFFER_FIELD_NUMBER = 16;
        public static final int LEVEL_TWO_COMMENT_FIELD_NUMBER = 8;
        public static final int LIKE_COUNT_FIELD_NUMBER = 13;
        public static final int LIKE_FLAG_FIELD_NUMBER = 12;
        public static final int MSG_INFO_FIELD_NUMBER = 27;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        private static volatile C24062w1<FinderCommentInfo> PARSER = null;
        public static final int REPLAY_NICKNAME_FIELD_NUMBER = 10;
        public static final int REPLY_BLACKLIST_FLAG_FIELD_NUMBER = 24;
        public static final int REPLY_COMMENT_ID_FIELD_NUMBER = 5;
        public static final int REPLY_CONTACT_FIELD_NUMBER = 29;
        public static final int REPLY_CONTENT_FIELD_NUMBER = 20;
        public static final int REPLY_USERNAME_FIELD_NUMBER = 21;
        public static final int REPORT_JSON_FIELD_NUMBER = 32;
        public static final int UNREAD_FLAG_FIELD_NUMBER = 26;
        public static final int UP_CONTINUE_FLAG_FIELD_NUMBER = 23;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private FinderContact authorContact_;
        private int bitField0_;
        private int bitField1_;
        private int blacklistFlag_;
        private String clientId_ = "";
        private long commentId_;
        private int contentType_;
        private String content_ = "";
        private int continueFlag_;
        private long createtime_;
        private int deleteFlag_;
        private int dislikeCount_;
        private int dislikeFlag_;
        private int displayFlag_;
        private String displayidDiscarded_ = "";
        private long displayid_;
        private int expandCommentCount_;
        private int extFlag_;
        private String headUrl_ = "";
        private FinderIpRegionInfo ipRegionInfo_;
        private C16994k lastBuffer_ = C16994k.f46000e;
        private C23908o0.C23919j<FinderCommentInfo> levelTwoComment_ = C23861l0.emptyProtobufList();
        private int likeCount_;
        private int likeFlag_;
        private FinderContactMsgInfo msgInfo_;
        private String nickname_ = "";
        private String replayNickname_ = "";
        private int replyBlacklistFlag_;
        private long replyCommentId_;
        private FinderContact replyContact_;
        private String replyContent_ = "";
        private String replyUsername_ = "";
        private String reportJson_ = "";
        private int unreadFlag_;
        private int upContinueFlag_;
        private String username_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderCommentInfo, Builder> implements FinderCommentInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllLevelTwoComment(Iterable<? extends FinderCommentInfo> iterable) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).addAllLevelTwoComment(iterable);
                return this;
            }

            public Builder addLevelTwoComment(FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).addLevelTwoComment(finderCommentInfo);
                return this;
            }

            public Builder clearAuthorContact() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearAuthorContact();
                return this;
            }

            public Builder clearBlacklistFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearBlacklistFlag();
                return this;
            }

            public Builder clearClientId() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearClientId();
                return this;
            }

            public Builder clearCommentId() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearCommentId();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearContent();
                return this;
            }

            public Builder clearContentType() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearContentType();
                return this;
            }

            public Builder clearContinueFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearContinueFlag();
                return this;
            }

            public Builder clearCreatetime() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearCreatetime();
                return this;
            }

            public Builder clearDeleteFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearDeleteFlag();
                return this;
            }

            public Builder clearDislikeCount() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearDislikeCount();
                return this;
            }

            public Builder clearDislikeFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearDislikeFlag();
                return this;
            }

            public Builder clearDisplayFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearDisplayFlag();
                return this;
            }

            public Builder clearDisplayid() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearDisplayid();
                return this;
            }

            public Builder clearDisplayidDiscarded() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearDisplayidDiscarded();
                return this;
            }

            public Builder clearExpandCommentCount() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearExpandCommentCount();
                return this;
            }

            public Builder clearExtFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearExtFlag();
                return this;
            }

            public Builder clearHeadUrl() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearHeadUrl();
                return this;
            }

            public Builder clearIpRegionInfo() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearIpRegionInfo();
                return this;
            }

            public Builder clearLastBuffer() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearLastBuffer();
                return this;
            }

            public Builder clearLevelTwoComment() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearLevelTwoComment();
                return this;
            }

            public Builder clearLikeCount() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearLikeCount();
                return this;
            }

            public Builder clearLikeFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearLikeFlag();
                return this;
            }

            public Builder clearMsgInfo() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearMsgInfo();
                return this;
            }

            public Builder clearNickname() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearNickname();
                return this;
            }

            public Builder clearReplayNickname() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReplayNickname();
                return this;
            }

            public Builder clearReplyBlacklistFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReplyBlacklistFlag();
                return this;
            }

            public Builder clearReplyCommentId() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReplyCommentId();
                return this;
            }

            public Builder clearReplyContact() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReplyContact();
                return this;
            }

            public Builder clearReplyContent() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReplyContent();
                return this;
            }

            public Builder clearReplyUsername() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReplyUsername();
                return this;
            }

            public Builder clearReportJson() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearReportJson();
                return this;
            }

            public Builder clearUnreadFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearUnreadFlag();
                return this;
            }

            public Builder clearUpContinueFlag() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearUpContinueFlag();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).clearUsername();
                return this;
            }

            public FinderContact getAuthorContact() {
                return ((FinderCommentInfo) this.instance).getAuthorContact();
            }

            public int getBlacklistFlag() {
                return ((FinderCommentInfo) this.instance).getBlacklistFlag();
            }

            public String getClientId() {
                return ((FinderCommentInfo) this.instance).getClientId();
            }

            public C16994k getClientIdBytes() {
                return ((FinderCommentInfo) this.instance).getClientIdBytes();
            }

            public long getCommentId() {
                return ((FinderCommentInfo) this.instance).getCommentId();
            }

            public String getContent() {
                return ((FinderCommentInfo) this.instance).getContent();
            }

            public C16994k getContentBytes() {
                return ((FinderCommentInfo) this.instance).getContentBytes();
            }

            public int getContentType() {
                return ((FinderCommentInfo) this.instance).getContentType();
            }

            public int getContinueFlag() {
                return ((FinderCommentInfo) this.instance).getContinueFlag();
            }

            public long getCreatetime() {
                return ((FinderCommentInfo) this.instance).getCreatetime();
            }

            public int getDeleteFlag() {
                return ((FinderCommentInfo) this.instance).getDeleteFlag();
            }

            public int getDislikeCount() {
                return ((FinderCommentInfo) this.instance).getDislikeCount();
            }

            public int getDislikeFlag() {
                return ((FinderCommentInfo) this.instance).getDislikeFlag();
            }

            public int getDisplayFlag() {
                return ((FinderCommentInfo) this.instance).getDisplayFlag();
            }

            public long getDisplayid() {
                return ((FinderCommentInfo) this.instance).getDisplayid();
            }

            public String getDisplayidDiscarded() {
                return ((FinderCommentInfo) this.instance).getDisplayidDiscarded();
            }

            public C16994k getDisplayidDiscardedBytes() {
                return ((FinderCommentInfo) this.instance).getDisplayidDiscardedBytes();
            }

            public int getExpandCommentCount() {
                return ((FinderCommentInfo) this.instance).getExpandCommentCount();
            }

            public int getExtFlag() {
                return ((FinderCommentInfo) this.instance).getExtFlag();
            }

            public String getHeadUrl() {
                return ((FinderCommentInfo) this.instance).getHeadUrl();
            }

            public C16994k getHeadUrlBytes() {
                return ((FinderCommentInfo) this.instance).getHeadUrlBytes();
            }

            public FinderIpRegionInfo getIpRegionInfo() {
                return ((FinderCommentInfo) this.instance).getIpRegionInfo();
            }

            public C16994k getLastBuffer() {
                return ((FinderCommentInfo) this.instance).getLastBuffer();
            }

            public FinderCommentInfo getLevelTwoComment(int i) {
                return ((FinderCommentInfo) this.instance).getLevelTwoComment(i);
            }

            public int getLevelTwoCommentCount() {
                return ((FinderCommentInfo) this.instance).getLevelTwoCommentCount();
            }

            public List<FinderCommentInfo> getLevelTwoCommentList() {
                return Collections.unmodifiableList(((FinderCommentInfo) this.instance).getLevelTwoCommentList());
            }

            public int getLikeCount() {
                return ((FinderCommentInfo) this.instance).getLikeCount();
            }

            public int getLikeFlag() {
                return ((FinderCommentInfo) this.instance).getLikeFlag();
            }

            public FinderContactMsgInfo getMsgInfo() {
                return ((FinderCommentInfo) this.instance).getMsgInfo();
            }

            public String getNickname() {
                return ((FinderCommentInfo) this.instance).getNickname();
            }

            public C16994k getNicknameBytes() {
                return ((FinderCommentInfo) this.instance).getNicknameBytes();
            }

            public String getReplayNickname() {
                return ((FinderCommentInfo) this.instance).getReplayNickname();
            }

            public C16994k getReplayNicknameBytes() {
                return ((FinderCommentInfo) this.instance).getReplayNicknameBytes();
            }

            public int getReplyBlacklistFlag() {
                return ((FinderCommentInfo) this.instance).getReplyBlacklistFlag();
            }

            public long getReplyCommentId() {
                return ((FinderCommentInfo) this.instance).getReplyCommentId();
            }

            public FinderContact getReplyContact() {
                return ((FinderCommentInfo) this.instance).getReplyContact();
            }

            public String getReplyContent() {
                return ((FinderCommentInfo) this.instance).getReplyContent();
            }

            public C16994k getReplyContentBytes() {
                return ((FinderCommentInfo) this.instance).getReplyContentBytes();
            }

            public String getReplyUsername() {
                return ((FinderCommentInfo) this.instance).getReplyUsername();
            }

            public C16994k getReplyUsernameBytes() {
                return ((FinderCommentInfo) this.instance).getReplyUsernameBytes();
            }

            public String getReportJson() {
                return ((FinderCommentInfo) this.instance).getReportJson();
            }

            public C16994k getReportJsonBytes() {
                return ((FinderCommentInfo) this.instance).getReportJsonBytes();
            }

            public int getUnreadFlag() {
                return ((FinderCommentInfo) this.instance).getUnreadFlag();
            }

            public int getUpContinueFlag() {
                return ((FinderCommentInfo) this.instance).getUpContinueFlag();
            }

            public String getUsername() {
                return ((FinderCommentInfo) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderCommentInfo) this.instance).getUsernameBytes();
            }

            public boolean hasAuthorContact() {
                return ((FinderCommentInfo) this.instance).hasAuthorContact();
            }

            public boolean hasBlacklistFlag() {
                return ((FinderCommentInfo) this.instance).hasBlacklistFlag();
            }

            public boolean hasClientId() {
                return ((FinderCommentInfo) this.instance).hasClientId();
            }

            public boolean hasCommentId() {
                return ((FinderCommentInfo) this.instance).hasCommentId();
            }

            public boolean hasContent() {
                return ((FinderCommentInfo) this.instance).hasContent();
            }

            public boolean hasContentType() {
                return ((FinderCommentInfo) this.instance).hasContentType();
            }

            public boolean hasContinueFlag() {
                return ((FinderCommentInfo) this.instance).hasContinueFlag();
            }

            public boolean hasCreatetime() {
                return ((FinderCommentInfo) this.instance).hasCreatetime();
            }

            public boolean hasDeleteFlag() {
                return ((FinderCommentInfo) this.instance).hasDeleteFlag();
            }

            public boolean hasDislikeCount() {
                return ((FinderCommentInfo) this.instance).hasDislikeCount();
            }

            public boolean hasDislikeFlag() {
                return ((FinderCommentInfo) this.instance).hasDislikeFlag();
            }

            public boolean hasDisplayFlag() {
                return ((FinderCommentInfo) this.instance).hasDisplayFlag();
            }

            public boolean hasDisplayid() {
                return ((FinderCommentInfo) this.instance).hasDisplayid();
            }

            public boolean hasDisplayidDiscarded() {
                return ((FinderCommentInfo) this.instance).hasDisplayidDiscarded();
            }

            public boolean hasExpandCommentCount() {
                return ((FinderCommentInfo) this.instance).hasExpandCommentCount();
            }

            public boolean hasExtFlag() {
                return ((FinderCommentInfo) this.instance).hasExtFlag();
            }

            public boolean hasHeadUrl() {
                return ((FinderCommentInfo) this.instance).hasHeadUrl();
            }

            public boolean hasIpRegionInfo() {
                return ((FinderCommentInfo) this.instance).hasIpRegionInfo();
            }

            public boolean hasLastBuffer() {
                return ((FinderCommentInfo) this.instance).hasLastBuffer();
            }

            public boolean hasLikeCount() {
                return ((FinderCommentInfo) this.instance).hasLikeCount();
            }

            public boolean hasLikeFlag() {
                return ((FinderCommentInfo) this.instance).hasLikeFlag();
            }

            public boolean hasMsgInfo() {
                return ((FinderCommentInfo) this.instance).hasMsgInfo();
            }

            public boolean hasNickname() {
                return ((FinderCommentInfo) this.instance).hasNickname();
            }

            public boolean hasReplayNickname() {
                return ((FinderCommentInfo) this.instance).hasReplayNickname();
            }

            public boolean hasReplyBlacklistFlag() {
                return ((FinderCommentInfo) this.instance).hasReplyBlacklistFlag();
            }

            public boolean hasReplyCommentId() {
                return ((FinderCommentInfo) this.instance).hasReplyCommentId();
            }

            public boolean hasReplyContact() {
                return ((FinderCommentInfo) this.instance).hasReplyContact();
            }

            public boolean hasReplyContent() {
                return ((FinderCommentInfo) this.instance).hasReplyContent();
            }

            public boolean hasReplyUsername() {
                return ((FinderCommentInfo) this.instance).hasReplyUsername();
            }

            public boolean hasReportJson() {
                return ((FinderCommentInfo) this.instance).hasReportJson();
            }

            public boolean hasUnreadFlag() {
                return ((FinderCommentInfo) this.instance).hasUnreadFlag();
            }

            public boolean hasUpContinueFlag() {
                return ((FinderCommentInfo) this.instance).hasUpContinueFlag();
            }

            public boolean hasUsername() {
                return ((FinderCommentInfo) this.instance).hasUsername();
            }

            public Builder mergeAuthorContact(FinderContact finderContact) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).mergeAuthorContact(finderContact);
                return this;
            }

            public Builder mergeIpRegionInfo(FinderIpRegionInfo finderIpRegionInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).mergeIpRegionInfo(finderIpRegionInfo);
                return this;
            }

            public Builder mergeMsgInfo(FinderContactMsgInfo finderContactMsgInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).mergeMsgInfo(finderContactMsgInfo);
                return this;
            }

            public Builder mergeReplyContact(FinderContact finderContact) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).mergeReplyContact(finderContact);
                return this;
            }

            public Builder removeLevelTwoComment(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).removeLevelTwoComment(i);
                return this;
            }

            public Builder setAuthorContact(FinderContact finderContact) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setAuthorContact(finderContact);
                return this;
            }

            public Builder setBlacklistFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setBlacklistFlag(i);
                return this;
            }

            public Builder setClientId(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setClientId(str);
                return this;
            }

            public Builder setClientIdBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setClientIdBytes(kVar);
                return this;
            }

            public Builder setCommentId(long j) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setCommentId(j);
                return this;
            }

            public Builder setContent(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setContent(str);
                return this;
            }

            public Builder setContentBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setContentBytes(kVar);
                return this;
            }

            public Builder setContentType(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setContentType(i);
                return this;
            }

            public Builder setContinueFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setContinueFlag(i);
                return this;
            }

            public Builder setCreatetime(long j) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setCreatetime(j);
                return this;
            }

            public Builder setDeleteFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDeleteFlag(i);
                return this;
            }

            public Builder setDislikeCount(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDislikeCount(i);
                return this;
            }

            public Builder setDislikeFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDislikeFlag(i);
                return this;
            }

            public Builder setDisplayFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDisplayFlag(i);
                return this;
            }

            public Builder setDisplayid(long j) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDisplayid(j);
                return this;
            }

            public Builder setDisplayidDiscarded(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDisplayidDiscarded(str);
                return this;
            }

            public Builder setDisplayidDiscardedBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setDisplayidDiscardedBytes(kVar);
                return this;
            }

            public Builder setExpandCommentCount(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setExpandCommentCount(i);
                return this;
            }

            public Builder setExtFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setExtFlag(i);
                return this;
            }

            public Builder setHeadUrl(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setHeadUrl(str);
                return this;
            }

            public Builder setHeadUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setHeadUrlBytes(kVar);
                return this;
            }

            public Builder setIpRegionInfo(FinderIpRegionInfo finderIpRegionInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setIpRegionInfo(finderIpRegionInfo);
                return this;
            }

            public Builder setLastBuffer(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setLastBuffer(kVar);
                return this;
            }

            public Builder setLevelTwoComment(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setLevelTwoComment(i, finderCommentInfo);
                return this;
            }

            public Builder setLikeCount(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setLikeCount(i);
                return this;
            }

            public Builder setLikeFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setLikeFlag(i);
                return this;
            }

            public Builder setMsgInfo(FinderContactMsgInfo finderContactMsgInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setMsgInfo(finderContactMsgInfo);
                return this;
            }

            public Builder setNickname(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setNickname(str);
                return this;
            }

            public Builder setNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setNicknameBytes(kVar);
                return this;
            }

            public Builder setReplayNickname(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplayNickname(str);
                return this;
            }

            public Builder setReplayNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplayNicknameBytes(kVar);
                return this;
            }

            public Builder setReplyBlacklistFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyBlacklistFlag(i);
                return this;
            }

            public Builder setReplyCommentId(long j) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyCommentId(j);
                return this;
            }

            public Builder setReplyContact(FinderContact finderContact) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyContact(finderContact);
                return this;
            }

            public Builder setReplyContent(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyContent(str);
                return this;
            }

            public Builder setReplyContentBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyContentBytes(kVar);
                return this;
            }

            public Builder setReplyUsername(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyUsername(str);
                return this;
            }

            public Builder setReplyUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyUsernameBytes(kVar);
                return this;
            }

            public Builder setReportJson(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReportJson(str);
                return this;
            }

            public Builder setReportJsonBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReportJsonBytes(kVar);
                return this;
            }

            public Builder setUnreadFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setUnreadFlag(i);
                return this;
            }

            public Builder setUpContinueFlag(int i) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setUpContinueFlag(i);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderCommentInfo.DEFAULT_INSTANCE);
            }

            public Builder addLevelTwoComment(int i, FinderCommentInfo finderCommentInfo) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).addLevelTwoComment(i, finderCommentInfo);
                return this;
            }

            public Builder setAuthorContact(FinderContact.Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setAuthorContact((FinderContact) builder.build());
                return this;
            }

            public Builder setIpRegionInfo(FinderIpRegionInfo.Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setIpRegionInfo((FinderIpRegionInfo) builder.build());
                return this;
            }

            public Builder setLevelTwoComment(int i, Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setLevelTwoComment(i, (FinderCommentInfo) builder.build());
                return this;
            }

            public Builder setMsgInfo(FinderContactMsgInfo.Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setMsgInfo((FinderContactMsgInfo) builder.build());
                return this;
            }

            public Builder setReplyContact(FinderContact.Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).setReplyContact((FinderContact) builder.build());
                return this;
            }

            public Builder addLevelTwoComment(Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).addLevelTwoComment((FinderCommentInfo) builder.build());
                return this;
            }

            public Builder addLevelTwoComment(int i, Builder builder) {
                copyOnWrite();
                ((FinderCommentInfo) this.instance).addLevelTwoComment(i, (FinderCommentInfo) builder.build());
                return this;
            }
        }

        static {
            FinderCommentInfo finderCommentInfo = new FinderCommentInfo();
            DEFAULT_INSTANCE = finderCommentInfo;
            C23861l0.registerDefaultInstance(FinderCommentInfo.class, finderCommentInfo);
        }

        private FinderCommentInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllLevelTwoComment(Iterable<? extends FinderCommentInfo> iterable) {
            ensureLevelTwoCommentIsMutable();
            C23810b.addAll(iterable, this.levelTwoComment_);
        }

        /* access modifiers changed from: private */
        public void addLevelTwoComment(FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureLevelTwoCommentIsMutable();
            this.levelTwoComment_.add(finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void clearAuthorContact() {
            this.authorContact_ = null;
            this.bitField0_ &= -67108865;
        }

        /* access modifiers changed from: private */
        public void clearBlacklistFlag() {
            this.bitField0_ &= -131073;
            this.blacklistFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearClientId() {
            this.bitField0_ &= -1048577;
            this.clientId_ = getDefaultInstance().getClientId();
        }

        /* access modifiers changed from: private */
        public void clearCommentId() {
            this.bitField0_ &= -9;
            this.commentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -5;
            this.content_ = getDefaultInstance().getContent();
        }

        /* access modifiers changed from: private */
        public void clearContentType() {
            this.bitField0_ &= -268435457;
            this.contentType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearContinueFlag() {
            this.bitField0_ &= -32769;
            this.continueFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCreatetime() {
            this.bitField0_ &= -129;
            this.createtime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDeleteFlag() {
            this.bitField0_ &= -33;
            this.deleteFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDislikeCount() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.dislikeCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDislikeFlag() {
            this.bitField0_ &= -1073741825;
            this.dislikeFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDisplayFlag() {
            this.bitField0_ &= -65537;
            this.displayFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDisplayid() {
            this.bitField0_ &= -4097;
            this.displayid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDisplayidDiscarded() {
            this.bitField0_ &= -513;
            this.displayidDiscarded_ = getDefaultInstance().getDisplayidDiscarded();
        }

        /* access modifiers changed from: private */
        public void clearExpandCommentCount() {
            this.bitField0_ &= -8193;
            this.expandCommentCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearExtFlag() {
            this.bitField0_ &= -8388609;
            this.extFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeadUrl() {
            this.bitField0_ &= -65;
            this.headUrl_ = getDefaultInstance().getHeadUrl();
        }

        /* access modifiers changed from: private */
        public void clearIpRegionInfo() {
            this.ipRegionInfo_ = null;
            this.bitField1_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearLastBuffer() {
            this.bitField0_ &= -16385;
            this.lastBuffer_ = getDefaultInstance().getLastBuffer();
        }

        /* access modifiers changed from: private */
        public void clearLevelTwoComment() {
            this.levelTwoComment_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearLikeCount() {
            this.bitField0_ &= -2049;
            this.likeCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLikeFlag() {
            this.bitField0_ &= -1025;
            this.likeFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgInfo() {
            this.msgInfo_ = null;
            this.bitField0_ &= -33554433;
        }

        /* access modifiers changed from: private */
        public void clearNickname() {
            this.bitField0_ &= -3;
            this.nickname_ = getDefaultInstance().getNickname();
        }

        /* access modifiers changed from: private */
        public void clearReplayNickname() {
            this.bitField0_ &= -257;
            this.replayNickname_ = getDefaultInstance().getReplayNickname();
        }

        /* access modifiers changed from: private */
        public void clearReplyBlacklistFlag() {
            this.bitField0_ &= -4194305;
            this.replyBlacklistFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReplyCommentId() {
            this.bitField0_ &= -17;
            this.replyCommentId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReplyContact() {
            this.replyContact_ = null;
            this.bitField0_ &= -134217729;
        }

        /* access modifiers changed from: private */
        public void clearReplyContent() {
            this.bitField0_ &= -262145;
            this.replyContent_ = getDefaultInstance().getReplyContent();
        }

        /* access modifiers changed from: private */
        public void clearReplyUsername() {
            this.bitField0_ &= -524289;
            this.replyUsername_ = getDefaultInstance().getReplyUsername();
        }

        /* access modifiers changed from: private */
        public void clearReportJson() {
            this.bitField0_ &= -536870913;
            this.reportJson_ = getDefaultInstance().getReportJson();
        }

        /* access modifiers changed from: private */
        public void clearUnreadFlag() {
            this.bitField0_ &= -16777217;
            this.unreadFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUpContinueFlag() {
            this.bitField0_ &= -2097153;
            this.upContinueFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -2;
            this.username_ = getDefaultInstance().getUsername();
        }

        private void ensureLevelTwoCommentIsMutable() {
            C23908o0.C23919j<FinderCommentInfo> jVar = this.levelTwoComment_;
            if (!jVar.mo37523Q()) {
                this.levelTwoComment_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderCommentInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeAuthorContact(FinderContact finderContact) {
            finderContact.getClass();
            FinderContact finderContact2 = this.authorContact_;
            if (finderContact2 == null || finderContact2 == FinderContact.getDefaultInstance()) {
                this.authorContact_ = finderContact;
            } else {
                this.authorContact_ = (FinderContact) ((FinderContact.Builder) FinderContact.newBuilder(this.authorContact_).mergeFrom(finderContact)).buildPartial();
            }
            this.bitField0_ |= 67108864;
        }

        /* access modifiers changed from: private */
        public void mergeIpRegionInfo(FinderIpRegionInfo finderIpRegionInfo) {
            finderIpRegionInfo.getClass();
            FinderIpRegionInfo finderIpRegionInfo2 = this.ipRegionInfo_;
            if (finderIpRegionInfo2 == null || finderIpRegionInfo2 == FinderIpRegionInfo.getDefaultInstance()) {
                this.ipRegionInfo_ = finderIpRegionInfo;
            } else {
                this.ipRegionInfo_ = (FinderIpRegionInfo) ((FinderIpRegionInfo.Builder) FinderIpRegionInfo.newBuilder(this.ipRegionInfo_).mergeFrom(finderIpRegionInfo)).buildPartial();
            }
            this.bitField1_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeMsgInfo(FinderContactMsgInfo finderContactMsgInfo) {
            finderContactMsgInfo.getClass();
            FinderContactMsgInfo finderContactMsgInfo2 = this.msgInfo_;
            if (finderContactMsgInfo2 == null || finderContactMsgInfo2 == FinderContactMsgInfo.getDefaultInstance()) {
                this.msgInfo_ = finderContactMsgInfo;
            } else {
                this.msgInfo_ = (FinderContactMsgInfo) ((FinderContactMsgInfo.Builder) FinderContactMsgInfo.newBuilder(this.msgInfo_).mergeFrom(finderContactMsgInfo)).buildPartial();
            }
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        }

        /* access modifiers changed from: private */
        public void mergeReplyContact(FinderContact finderContact) {
            finderContact.getClass();
            FinderContact finderContact2 = this.replyContact_;
            if (finderContact2 == null || finderContact2 == FinderContact.getDefaultInstance()) {
                this.replyContact_ = finderContact;
            } else {
                this.replyContact_ = (FinderContact) ((FinderContact.Builder) FinderContact.newBuilder(this.replyContact_).mergeFrom(finderContact)).buildPartial();
            }
            this.bitField0_ |= 134217728;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderCommentInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderCommentInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderCommentInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeLevelTwoComment(int i) {
            ensureLevelTwoCommentIsMutable();
            this.levelTwoComment_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setAuthorContact(FinderContact finderContact) {
            finderContact.getClass();
            this.authorContact_ = finderContact;
            this.bitField0_ |= 67108864;
        }

        /* access modifiers changed from: private */
        public void setBlacklistFlag(int i) {
            this.bitField0_ |= 131072;
            this.blacklistFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setClientId(String str) {
            str.getClass();
            this.bitField0_ |= 1048576;
            this.clientId_ = str;
        }

        /* access modifiers changed from: private */
        public void setClientIdBytes(C16994k kVar) {
            this.clientId_ = kVar.mo18752u();
            this.bitField0_ |= 1048576;
        }

        /* access modifiers changed from: private */
        public void setCommentId(long j) {
            this.bitField0_ |= 8;
            this.commentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setContent(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.content_ = str;
        }

        /* access modifiers changed from: private */
        public void setContentBytes(C16994k kVar) {
            this.content_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setContentType(int i) {
            this.bitField0_ |= 268435456;
            this.contentType_ = i;
        }

        /* access modifiers changed from: private */
        public void setContinueFlag(int i) {
            this.bitField0_ |= 32768;
            this.continueFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setCreatetime(long j) {
            this.bitField0_ |= 128;
            this.createtime_ = j;
        }

        /* access modifiers changed from: private */
        public void setDeleteFlag(int i) {
            this.bitField0_ |= 32;
            this.deleteFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setDislikeCount(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.dislikeCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setDislikeFlag(int i) {
            this.bitField0_ |= 1073741824;
            this.dislikeFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setDisplayFlag(int i) {
            this.bitField0_ |= 65536;
            this.displayFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setDisplayid(long j) {
            this.bitField0_ |= 4096;
            this.displayid_ = j;
        }

        /* access modifiers changed from: private */
        public void setDisplayidDiscarded(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.displayidDiscarded_ = str;
        }

        /* access modifiers changed from: private */
        public void setDisplayidDiscardedBytes(C16994k kVar) {
            this.displayidDiscarded_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setExpandCommentCount(int i) {
            this.bitField0_ |= 8192;
            this.expandCommentCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setExtFlag(int i) {
            this.bitField0_ |= 8388608;
            this.extFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setHeadUrl(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.headUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setHeadUrlBytes(C16994k kVar) {
            this.headUrl_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setIpRegionInfo(FinderIpRegionInfo finderIpRegionInfo) {
            finderIpRegionInfo.getClass();
            this.ipRegionInfo_ = finderIpRegionInfo;
            this.bitField1_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setLastBuffer(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 16384;
            this.lastBuffer_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setLevelTwoComment(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureLevelTwoCommentIsMutable();
            this.levelTwoComment_.set(i, finderCommentInfo);
        }

        /* access modifiers changed from: private */
        public void setLikeCount(int i) {
            this.bitField0_ |= 2048;
            this.likeCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setLikeFlag(int i) {
            this.bitField0_ |= 1024;
            this.likeFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgInfo(FinderContactMsgInfo finderContactMsgInfo) {
            finderContactMsgInfo.getClass();
            this.msgInfo_ = finderContactMsgInfo;
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        }

        /* access modifiers changed from: private */
        public void setNickname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.nickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setNicknameBytes(C16994k kVar) {
            this.nickname_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setReplayNickname(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.replayNickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setReplayNicknameBytes(C16994k kVar) {
            this.replayNickname_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setReplyBlacklistFlag(int i) {
            this.bitField0_ |= 4194304;
            this.replyBlacklistFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setReplyCommentId(long j) {
            this.bitField0_ |= 16;
            this.replyCommentId_ = j;
        }

        /* access modifiers changed from: private */
        public void setReplyContact(FinderContact finderContact) {
            finderContact.getClass();
            this.replyContact_ = finderContact;
            this.bitField0_ |= 134217728;
        }

        /* access modifiers changed from: private */
        public void setReplyContent(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.replyContent_ = str;
        }

        /* access modifiers changed from: private */
        public void setReplyContentBytes(C16994k kVar) {
            this.replyContent_ = kVar.mo18752u();
            this.bitField0_ |= 262144;
        }

        /* access modifiers changed from: private */
        public void setReplyUsername(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.replyUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setReplyUsernameBytes(C16994k kVar) {
            this.replyUsername_ = kVar.mo18752u();
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void setReportJson(String str) {
            str.getClass();
            this.bitField0_ |= 536870912;
            this.reportJson_ = str;
        }

        /* access modifiers changed from: private */
        public void setReportJsonBytes(C16994k kVar) {
            this.reportJson_ = kVar.mo18752u();
            this.bitField0_ |= 536870912;
        }

        /* access modifiers changed from: private */
        public void setUnreadFlag(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.unreadFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setUpContinueFlag(int i) {
            this.bitField0_ |= 2097152;
            this.upContinueFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            Class<FinderCommentInfo> cls = FinderCommentInfo.class;
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\"\u0000\u0002\u0001#\"\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဈ\u0006\b\u001b\tဃ\u0007\nဈ\b\u000bဈ\t\fဋ\n\rဋ\u000b\u000eဃ\f\u000fဋ\r\u0010ည\u000e\u0011ဋ\u000f\u0012ဋ\u0010\u0013ဋ\u0011\u0014ဈ\u0012\u0015ဈ\u0013\u0016ဈ\u0014\u0017ဋ\u0015\u0018ဋ\u0016\u0019ဋ\u0017\u001aဋ\u0018\u001bဉ\u0019\u001cဉ\u001a\u001dဉ\u001b\u001eဋ\u001c ဈ\u001d!ဋ\u001e\"ဋ\u001f#ဉ ", new Object[]{"bitField0_", "bitField1_", "username_", "nickname_", "content_", "commentId_", "replyCommentId_", "deleteFlag_", "headUrl_", "levelTwoComment_", cls, "createtime_", "replayNickname_", "displayidDiscarded_", "likeFlag_", "likeCount_", "displayid_", "expandCommentCount_", "lastBuffer_", "continueFlag_", "displayFlag_", "blacklistFlag_", "replyContent_", "replyUsername_", "clientId_", "upContinueFlag_", "replyBlacklistFlag_", "extFlag_", "unreadFlag_", "msgInfo_", "authorContact_", "replyContact_", "contentType_", "reportJson_", "dislikeFlag_", "dislikeCount_", "ipRegionInfo_"});
                case 3:
                    return new FinderCommentInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderCommentInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (cls) {
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

        public FinderContact getAuthorContact() {
            FinderContact finderContact = this.authorContact_;
            return finderContact == null ? FinderContact.getDefaultInstance() : finderContact;
        }

        public int getBlacklistFlag() {
            return this.blacklistFlag_;
        }

        public String getClientId() {
            return this.clientId_;
        }

        public C16994k getClientIdBytes() {
            return C16994k.m16791k(this.clientId_);
        }

        public long getCommentId() {
            return this.commentId_;
        }

        public String getContent() {
            return this.content_;
        }

        public C16994k getContentBytes() {
            return C16994k.m16791k(this.content_);
        }

        public int getContentType() {
            return this.contentType_;
        }

        public int getContinueFlag() {
            return this.continueFlag_;
        }

        public long getCreatetime() {
            return this.createtime_;
        }

        public int getDeleteFlag() {
            return this.deleteFlag_;
        }

        public int getDislikeCount() {
            return this.dislikeCount_;
        }

        public int getDislikeFlag() {
            return this.dislikeFlag_;
        }

        public int getDisplayFlag() {
            return this.displayFlag_;
        }

        public long getDisplayid() {
            return this.displayid_;
        }

        public String getDisplayidDiscarded() {
            return this.displayidDiscarded_;
        }

        public C16994k getDisplayidDiscardedBytes() {
            return C16994k.m16791k(this.displayidDiscarded_);
        }

        public int getExpandCommentCount() {
            return this.expandCommentCount_;
        }

        public int getExtFlag() {
            return this.extFlag_;
        }

        public String getHeadUrl() {
            return this.headUrl_;
        }

        public C16994k getHeadUrlBytes() {
            return C16994k.m16791k(this.headUrl_);
        }

        public FinderIpRegionInfo getIpRegionInfo() {
            FinderIpRegionInfo finderIpRegionInfo = this.ipRegionInfo_;
            return finderIpRegionInfo == null ? FinderIpRegionInfo.getDefaultInstance() : finderIpRegionInfo;
        }

        public C16994k getLastBuffer() {
            return this.lastBuffer_;
        }

        public FinderCommentInfo getLevelTwoComment(int i) {
            return this.levelTwoComment_.get(i);
        }

        public int getLevelTwoCommentCount() {
            return this.levelTwoComment_.size();
        }

        public List<FinderCommentInfo> getLevelTwoCommentList() {
            return this.levelTwoComment_;
        }

        public FinderCommentInfoOrBuilder getLevelTwoCommentOrBuilder(int i) {
            return this.levelTwoComment_.get(i);
        }

        public List<? extends FinderCommentInfoOrBuilder> getLevelTwoCommentOrBuilderList() {
            return this.levelTwoComment_;
        }

        public int getLikeCount() {
            return this.likeCount_;
        }

        public int getLikeFlag() {
            return this.likeFlag_;
        }

        public FinderContactMsgInfo getMsgInfo() {
            FinderContactMsgInfo finderContactMsgInfo = this.msgInfo_;
            return finderContactMsgInfo == null ? FinderContactMsgInfo.getDefaultInstance() : finderContactMsgInfo;
        }

        public String getNickname() {
            return this.nickname_;
        }

        public C16994k getNicknameBytes() {
            return C16994k.m16791k(this.nickname_);
        }

        public String getReplayNickname() {
            return this.replayNickname_;
        }

        public C16994k getReplayNicknameBytes() {
            return C16994k.m16791k(this.replayNickname_);
        }

        public int getReplyBlacklistFlag() {
            return this.replyBlacklistFlag_;
        }

        public long getReplyCommentId() {
            return this.replyCommentId_;
        }

        public FinderContact getReplyContact() {
            FinderContact finderContact = this.replyContact_;
            return finderContact == null ? FinderContact.getDefaultInstance() : finderContact;
        }

        public String getReplyContent() {
            return this.replyContent_;
        }

        public C16994k getReplyContentBytes() {
            return C16994k.m16791k(this.replyContent_);
        }

        public String getReplyUsername() {
            return this.replyUsername_;
        }

        public C16994k getReplyUsernameBytes() {
            return C16994k.m16791k(this.replyUsername_);
        }

        public String getReportJson() {
            return this.reportJson_;
        }

        public C16994k getReportJsonBytes() {
            return C16994k.m16791k(this.reportJson_);
        }

        public int getUnreadFlag() {
            return this.unreadFlag_;
        }

        public int getUpContinueFlag() {
            return this.upContinueFlag_;
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public boolean hasAuthorContact() {
            return (this.bitField0_ & 67108864) != 0;
        }

        public boolean hasBlacklistFlag() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasClientId() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasCommentId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasContentType() {
            return (this.bitField0_ & 268435456) != 0;
        }

        public boolean hasContinueFlag() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasCreatetime() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasDeleteFlag() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasDislikeCount() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        public boolean hasDislikeFlag() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        public boolean hasDisplayFlag() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasDisplayid() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasDisplayidDiscarded() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasExpandCommentCount() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasExtFlag() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasHeadUrl() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasIpRegionInfo() {
            return (this.bitField1_ & 1) != 0;
        }

        public boolean hasLastBuffer() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasLikeCount() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasLikeFlag() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasMsgInfo() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
        }

        public boolean hasNickname() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasReplayNickname() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasReplyBlacklistFlag() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasReplyCommentId() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasReplyContact() {
            return (this.bitField0_ & 134217728) != 0;
        }

        public boolean hasReplyContent() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasReplyUsername() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasReportJson() {
            return (this.bitField0_ & 536870912) != 0;
        }

        public boolean hasUnreadFlag() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasUpContinueFlag() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(FinderCommentInfo finderCommentInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderCommentInfo);
        }

        public static FinderCommentInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderCommentInfo parseFrom(C16994k kVar) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addLevelTwoComment(int i, FinderCommentInfo finderCommentInfo) {
            finderCommentInfo.getClass();
            ensureLevelTwoCommentIsMutable();
            this.levelTwoComment_.add(i, finderCommentInfo);
        }

        public static FinderCommentInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderCommentInfo parseFrom(byte[] bArr) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderCommentInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderCommentInfo parseFrom(InputStream inputStream) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderCommentInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderCommentInfo parseFrom(C23856l lVar) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderCommentInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderCommentInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderContact extends C23861l0<FinderContact, Builder> implements FinderContactOrBuilder {
        public static final int ADDITIONALFLAG_FIELD_NUMBER = 40;
        public static final int COVERENTRANCEFLAG_FIELD_NUMBER = 32;
        public static final int COVERIMGURL_FIELD_NUMBER = 9;
        public static final int COVERURL_FIELD_NUMBER = 31;
        /* access modifiers changed from: private */
        public static final FinderContact DEFAULT_INSTANCE;
        public static final int EXTFLAG_FIELD_NUMBER = 11;
        public static final int FANS_COUNT_FIELD_NUMBER = 24;
        public static final int FEEDCOUNT_FIELD_NUMBER = 27;
        public static final int FOLLOWFLAG_FIELD_NUMBER = 6;
        public static final int FOLLOWTIME_FIELD_NUMBER = 7;
        public static final int FOREIGN_USER_FLAG_FIELD_NUMBER = 19;
        public static final int FRIEND_FOLLOW_COUNT_FIELD_NUMBER = 23;
        public static final int HEAD_URL_FIELD_NUMBER = 3;
        public static final int LIVECOVERIMGURL_FIELD_NUMBER = 18;
        public static final int LIVESTATUS_FIELD_NUMBER = 15;
        public static final int LOGGINGOUT_WORDING_FIELD_NUMBER = 21;
        public static final int NICKNAME_FIELD_NUMBER = 2;
        public static final int ONE_TIME_FLAG_FIELD_NUMBER = 36;
        public static final int ORIGINALENTRANCEFLAG_FIELD_NUMBER = 17;
        public static final int ORIGINALFLAG_FIELD_NUMBER = 13;
        private static volatile C24062w1<FinderContact> PARSER = null;
        public static final int SEQ_FIELD_NUMBER = 4;
        public static final int SIGNATURE_FIELD_NUMBER = 5;
        public static final int SPAMSTATUS_FIELD_NUMBER = 10;
        public static final int STATUS_FIELD_NUMBER = 38;
        public static final int USERNAME_FIELD_NUMBER = 1;
        public static final int USER_FLAG_FIELD_NUMBER = 35;
        public static final int USER_MODE_FIELD_NUMBER = 28;
        public static final int VESTNICKNAME_FIELD_NUMBER = 26;
        public static final int WX_USERNAME_V5_FIELD_NUMBER = 25;
        private long additionalFlag_;
        private int bitField0_;
        private int coverEntranceFlag_;
        private String coverImgUrl_ = "";
        private String coverUrl_ = "";
        private int extFlag_;
        private int fansCount_;
        private int feedCount_;
        private int followFlag_;
        private int followTime_;
        private int foreignUserFlag_;
        private int friendFollowCount_;
        private String headUrl_ = "";
        private String liveCoverImgUrl_ = "";
        private int liveStatus_;
        private String loggingoutWording_ = "";
        private String nickname_ = "";
        private int oneTimeFlag_;
        private int originalEntranceFlag_;
        private int originalFlag_;
        private long seq_;
        private String signature_ = "";
        private int spamStatus_;
        private long status_;
        private int userFlag_;
        private int userMode_;
        private String username_ = "";
        private String vestNickname_ = "";
        private String wxUsernameV5_ = "";

        public static final class Builder extends C23861l0.C23862a<FinderContact, Builder> implements FinderContactOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearAdditionalFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearAdditionalFlag();
                return this;
            }

            public Builder clearCoverEntranceFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearCoverEntranceFlag();
                return this;
            }

            public Builder clearCoverImgUrl() {
                copyOnWrite();
                ((FinderContact) this.instance).clearCoverImgUrl();
                return this;
            }

            public Builder clearCoverUrl() {
                copyOnWrite();
                ((FinderContact) this.instance).clearCoverUrl();
                return this;
            }

            public Builder clearExtFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearExtFlag();
                return this;
            }

            public Builder clearFansCount() {
                copyOnWrite();
                ((FinderContact) this.instance).clearFansCount();
                return this;
            }

            public Builder clearFeedCount() {
                copyOnWrite();
                ((FinderContact) this.instance).clearFeedCount();
                return this;
            }

            public Builder clearFollowFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearFollowFlag();
                return this;
            }

            public Builder clearFollowTime() {
                copyOnWrite();
                ((FinderContact) this.instance).clearFollowTime();
                return this;
            }

            public Builder clearForeignUserFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearForeignUserFlag();
                return this;
            }

            public Builder clearFriendFollowCount() {
                copyOnWrite();
                ((FinderContact) this.instance).clearFriendFollowCount();
                return this;
            }

            public Builder clearHeadUrl() {
                copyOnWrite();
                ((FinderContact) this.instance).clearHeadUrl();
                return this;
            }

            public Builder clearLiveCoverImgUrl() {
                copyOnWrite();
                ((FinderContact) this.instance).clearLiveCoverImgUrl();
                return this;
            }

            public Builder clearLiveStatus() {
                copyOnWrite();
                ((FinderContact) this.instance).clearLiveStatus();
                return this;
            }

            public Builder clearLoggingoutWording() {
                copyOnWrite();
                ((FinderContact) this.instance).clearLoggingoutWording();
                return this;
            }

            public Builder clearNickname() {
                copyOnWrite();
                ((FinderContact) this.instance).clearNickname();
                return this;
            }

            public Builder clearOneTimeFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearOneTimeFlag();
                return this;
            }

            public Builder clearOriginalEntranceFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearOriginalEntranceFlag();
                return this;
            }

            public Builder clearOriginalFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearOriginalFlag();
                return this;
            }

            public Builder clearSeq() {
                copyOnWrite();
                ((FinderContact) this.instance).clearSeq();
                return this;
            }

            public Builder clearSignature() {
                copyOnWrite();
                ((FinderContact) this.instance).clearSignature();
                return this;
            }

            public Builder clearSpamStatus() {
                copyOnWrite();
                ((FinderContact) this.instance).clearSpamStatus();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((FinderContact) this.instance).clearStatus();
                return this;
            }

            public Builder clearUserFlag() {
                copyOnWrite();
                ((FinderContact) this.instance).clearUserFlag();
                return this;
            }

            public Builder clearUserMode() {
                copyOnWrite();
                ((FinderContact) this.instance).clearUserMode();
                return this;
            }

            public Builder clearUsername() {
                copyOnWrite();
                ((FinderContact) this.instance).clearUsername();
                return this;
            }

            public Builder clearVestNickname() {
                copyOnWrite();
                ((FinderContact) this.instance).clearVestNickname();
                return this;
            }

            public Builder clearWxUsernameV5() {
                copyOnWrite();
                ((FinderContact) this.instance).clearWxUsernameV5();
                return this;
            }

            public long getAdditionalFlag() {
                return ((FinderContact) this.instance).getAdditionalFlag();
            }

            public int getCoverEntranceFlag() {
                return ((FinderContact) this.instance).getCoverEntranceFlag();
            }

            public String getCoverImgUrl() {
                return ((FinderContact) this.instance).getCoverImgUrl();
            }

            public C16994k getCoverImgUrlBytes() {
                return ((FinderContact) this.instance).getCoverImgUrlBytes();
            }

            public String getCoverUrl() {
                return ((FinderContact) this.instance).getCoverUrl();
            }

            public C16994k getCoverUrlBytes() {
                return ((FinderContact) this.instance).getCoverUrlBytes();
            }

            public int getExtFlag() {
                return ((FinderContact) this.instance).getExtFlag();
            }

            public int getFansCount() {
                return ((FinderContact) this.instance).getFansCount();
            }

            public int getFeedCount() {
                return ((FinderContact) this.instance).getFeedCount();
            }

            public int getFollowFlag() {
                return ((FinderContact) this.instance).getFollowFlag();
            }

            public int getFollowTime() {
                return ((FinderContact) this.instance).getFollowTime();
            }

            public int getForeignUserFlag() {
                return ((FinderContact) this.instance).getForeignUserFlag();
            }

            public int getFriendFollowCount() {
                return ((FinderContact) this.instance).getFriendFollowCount();
            }

            public String getHeadUrl() {
                return ((FinderContact) this.instance).getHeadUrl();
            }

            public C16994k getHeadUrlBytes() {
                return ((FinderContact) this.instance).getHeadUrlBytes();
            }

            public String getLiveCoverImgUrl() {
                return ((FinderContact) this.instance).getLiveCoverImgUrl();
            }

            public C16994k getLiveCoverImgUrlBytes() {
                return ((FinderContact) this.instance).getLiveCoverImgUrlBytes();
            }

            public int getLiveStatus() {
                return ((FinderContact) this.instance).getLiveStatus();
            }

            public String getLoggingoutWording() {
                return ((FinderContact) this.instance).getLoggingoutWording();
            }

            public C16994k getLoggingoutWordingBytes() {
                return ((FinderContact) this.instance).getLoggingoutWordingBytes();
            }

            public String getNickname() {
                return ((FinderContact) this.instance).getNickname();
            }

            public C16994k getNicknameBytes() {
                return ((FinderContact) this.instance).getNicknameBytes();
            }

            public int getOneTimeFlag() {
                return ((FinderContact) this.instance).getOneTimeFlag();
            }

            public int getOriginalEntranceFlag() {
                return ((FinderContact) this.instance).getOriginalEntranceFlag();
            }

            public int getOriginalFlag() {
                return ((FinderContact) this.instance).getOriginalFlag();
            }

            public long getSeq() {
                return ((FinderContact) this.instance).getSeq();
            }

            public String getSignature() {
                return ((FinderContact) this.instance).getSignature();
            }

            public C16994k getSignatureBytes() {
                return ((FinderContact) this.instance).getSignatureBytes();
            }

            public int getSpamStatus() {
                return ((FinderContact) this.instance).getSpamStatus();
            }

            public long getStatus() {
                return ((FinderContact) this.instance).getStatus();
            }

            public int getUserFlag() {
                return ((FinderContact) this.instance).getUserFlag();
            }

            public int getUserMode() {
                return ((FinderContact) this.instance).getUserMode();
            }

            public String getUsername() {
                return ((FinderContact) this.instance).getUsername();
            }

            public C16994k getUsernameBytes() {
                return ((FinderContact) this.instance).getUsernameBytes();
            }

            public String getVestNickname() {
                return ((FinderContact) this.instance).getVestNickname();
            }

            public C16994k getVestNicknameBytes() {
                return ((FinderContact) this.instance).getVestNicknameBytes();
            }

            public String getWxUsernameV5() {
                return ((FinderContact) this.instance).getWxUsernameV5();
            }

            public C16994k getWxUsernameV5Bytes() {
                return ((FinderContact) this.instance).getWxUsernameV5Bytes();
            }

            public boolean hasAdditionalFlag() {
                return ((FinderContact) this.instance).hasAdditionalFlag();
            }

            public boolean hasCoverEntranceFlag() {
                return ((FinderContact) this.instance).hasCoverEntranceFlag();
            }

            public boolean hasCoverImgUrl() {
                return ((FinderContact) this.instance).hasCoverImgUrl();
            }

            public boolean hasCoverUrl() {
                return ((FinderContact) this.instance).hasCoverUrl();
            }

            public boolean hasExtFlag() {
                return ((FinderContact) this.instance).hasExtFlag();
            }

            public boolean hasFansCount() {
                return ((FinderContact) this.instance).hasFansCount();
            }

            public boolean hasFeedCount() {
                return ((FinderContact) this.instance).hasFeedCount();
            }

            public boolean hasFollowFlag() {
                return ((FinderContact) this.instance).hasFollowFlag();
            }

            public boolean hasFollowTime() {
                return ((FinderContact) this.instance).hasFollowTime();
            }

            public boolean hasForeignUserFlag() {
                return ((FinderContact) this.instance).hasForeignUserFlag();
            }

            public boolean hasFriendFollowCount() {
                return ((FinderContact) this.instance).hasFriendFollowCount();
            }

            public boolean hasHeadUrl() {
                return ((FinderContact) this.instance).hasHeadUrl();
            }

            public boolean hasLiveCoverImgUrl() {
                return ((FinderContact) this.instance).hasLiveCoverImgUrl();
            }

            public boolean hasLiveStatus() {
                return ((FinderContact) this.instance).hasLiveStatus();
            }

            public boolean hasLoggingoutWording() {
                return ((FinderContact) this.instance).hasLoggingoutWording();
            }

            public boolean hasNickname() {
                return ((FinderContact) this.instance).hasNickname();
            }

            public boolean hasOneTimeFlag() {
                return ((FinderContact) this.instance).hasOneTimeFlag();
            }

            public boolean hasOriginalEntranceFlag() {
                return ((FinderContact) this.instance).hasOriginalEntranceFlag();
            }

            public boolean hasOriginalFlag() {
                return ((FinderContact) this.instance).hasOriginalFlag();
            }

            public boolean hasSeq() {
                return ((FinderContact) this.instance).hasSeq();
            }

            public boolean hasSignature() {
                return ((FinderContact) this.instance).hasSignature();
            }

            public boolean hasSpamStatus() {
                return ((FinderContact) this.instance).hasSpamStatus();
            }

            public boolean hasStatus() {
                return ((FinderContact) this.instance).hasStatus();
            }

            public boolean hasUserFlag() {
                return ((FinderContact) this.instance).hasUserFlag();
            }

            public boolean hasUserMode() {
                return ((FinderContact) this.instance).hasUserMode();
            }

            public boolean hasUsername() {
                return ((FinderContact) this.instance).hasUsername();
            }

            public boolean hasVestNickname() {
                return ((FinderContact) this.instance).hasVestNickname();
            }

            public boolean hasWxUsernameV5() {
                return ((FinderContact) this.instance).hasWxUsernameV5();
            }

            public Builder setAdditionalFlag(long j) {
                copyOnWrite();
                ((FinderContact) this.instance).setAdditionalFlag(j);
                return this;
            }

            public Builder setCoverEntranceFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setCoverEntranceFlag(i);
                return this;
            }

            public Builder setCoverImgUrl(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setCoverImgUrl(str);
                return this;
            }

            public Builder setCoverImgUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setCoverImgUrlBytes(kVar);
                return this;
            }

            public Builder setCoverUrl(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setCoverUrl(str);
                return this;
            }

            public Builder setCoverUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setCoverUrlBytes(kVar);
                return this;
            }

            public Builder setExtFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setExtFlag(i);
                return this;
            }

            public Builder setFansCount(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setFansCount(i);
                return this;
            }

            public Builder setFeedCount(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setFeedCount(i);
                return this;
            }

            public Builder setFollowFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setFollowFlag(i);
                return this;
            }

            public Builder setFollowTime(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setFollowTime(i);
                return this;
            }

            public Builder setForeignUserFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setForeignUserFlag(i);
                return this;
            }

            public Builder setFriendFollowCount(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setFriendFollowCount(i);
                return this;
            }

            public Builder setHeadUrl(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setHeadUrl(str);
                return this;
            }

            public Builder setHeadUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setHeadUrlBytes(kVar);
                return this;
            }

            public Builder setLiveCoverImgUrl(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setLiveCoverImgUrl(str);
                return this;
            }

            public Builder setLiveCoverImgUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setLiveCoverImgUrlBytes(kVar);
                return this;
            }

            public Builder setLiveStatus(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setLiveStatus(i);
                return this;
            }

            public Builder setLoggingoutWording(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setLoggingoutWording(str);
                return this;
            }

            public Builder setLoggingoutWordingBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setLoggingoutWordingBytes(kVar);
                return this;
            }

            public Builder setNickname(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setNickname(str);
                return this;
            }

            public Builder setNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setNicknameBytes(kVar);
                return this;
            }

            public Builder setOneTimeFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setOneTimeFlag(i);
                return this;
            }

            public Builder setOriginalEntranceFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setOriginalEntranceFlag(i);
                return this;
            }

            public Builder setOriginalFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setOriginalFlag(i);
                return this;
            }

            public Builder setSeq(long j) {
                copyOnWrite();
                ((FinderContact) this.instance).setSeq(j);
                return this;
            }

            public Builder setSignature(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setSignature(str);
                return this;
            }

            public Builder setSignatureBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setSignatureBytes(kVar);
                return this;
            }

            public Builder setSpamStatus(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setSpamStatus(i);
                return this;
            }

            public Builder setStatus(long j) {
                copyOnWrite();
                ((FinderContact) this.instance).setStatus(j);
                return this;
            }

            public Builder setUserFlag(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setUserFlag(i);
                return this;
            }

            public Builder setUserMode(int i) {
                copyOnWrite();
                ((FinderContact) this.instance).setUserMode(i);
                return this;
            }

            public Builder setUsername(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setUsername(str);
                return this;
            }

            public Builder setUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setUsernameBytes(kVar);
                return this;
            }

            public Builder setVestNickname(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setVestNickname(str);
                return this;
            }

            public Builder setVestNicknameBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setVestNicknameBytes(kVar);
                return this;
            }

            public Builder setWxUsernameV5(String str) {
                copyOnWrite();
                ((FinderContact) this.instance).setWxUsernameV5(str);
                return this;
            }

            public Builder setWxUsernameV5Bytes(C16994k kVar) {
                copyOnWrite();
                ((FinderContact) this.instance).setWxUsernameV5Bytes(kVar);
                return this;
            }

            private Builder() {
                super(FinderContact.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderContact finderContact = new FinderContact();
            DEFAULT_INSTANCE = finderContact;
            C23861l0.registerDefaultInstance(FinderContact.class, finderContact);
        }

        private FinderContact() {
        }

        /* access modifiers changed from: private */
        public void clearAdditionalFlag() {
            this.bitField0_ &= -134217729;
            this.additionalFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCoverEntranceFlag() {
            this.bitField0_ &= -8388609;
            this.coverEntranceFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCoverImgUrl() {
            this.bitField0_ &= -129;
            this.coverImgUrl_ = getDefaultInstance().getCoverImgUrl();
        }

        /* access modifiers changed from: private */
        public void clearCoverUrl() {
            this.bitField0_ &= -4194305;
            this.coverUrl_ = getDefaultInstance().getCoverUrl();
        }

        /* access modifiers changed from: private */
        public void clearExtFlag() {
            this.bitField0_ &= -513;
            this.extFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFansCount() {
            this.bitField0_ &= -131073;
            this.fansCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFeedCount() {
            this.bitField0_ &= -1048577;
            this.feedCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFollowFlag() {
            this.bitField0_ &= -33;
            this.followFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFollowTime() {
            this.bitField0_ &= -65;
            this.followTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearForeignUserFlag() {
            this.bitField0_ &= -16385;
            this.foreignUserFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFriendFollowCount() {
            this.bitField0_ &= -65537;
            this.friendFollowCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHeadUrl() {
            this.bitField0_ &= -5;
            this.headUrl_ = getDefaultInstance().getHeadUrl();
        }

        /* access modifiers changed from: private */
        public void clearLiveCoverImgUrl() {
            this.bitField0_ &= -8193;
            this.liveCoverImgUrl_ = getDefaultInstance().getLiveCoverImgUrl();
        }

        /* access modifiers changed from: private */
        public void clearLiveStatus() {
            this.bitField0_ &= -2049;
            this.liveStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoggingoutWording() {
            this.bitField0_ &= -32769;
            this.loggingoutWording_ = getDefaultInstance().getLoggingoutWording();
        }

        /* access modifiers changed from: private */
        public void clearNickname() {
            this.bitField0_ &= -3;
            this.nickname_ = getDefaultInstance().getNickname();
        }

        /* access modifiers changed from: private */
        public void clearOneTimeFlag() {
            this.bitField0_ &= -33554433;
            this.oneTimeFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOriginalEntranceFlag() {
            this.bitField0_ &= -4097;
            this.originalEntranceFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearOriginalFlag() {
            this.bitField0_ &= -1025;
            this.originalFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSeq() {
            this.bitField0_ &= -9;
            this.seq_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSignature() {
            this.bitField0_ &= -17;
            this.signature_ = getDefaultInstance().getSignature();
        }

        /* access modifiers changed from: private */
        public void clearSpamStatus() {
            this.bitField0_ &= -257;
            this.spamStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStatus() {
            this.bitField0_ &= -67108865;
            this.status_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserFlag() {
            this.bitField0_ &= -16777217;
            this.userFlag_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserMode() {
            this.bitField0_ &= -2097153;
            this.userMode_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUsername() {
            this.bitField0_ &= -2;
            this.username_ = getDefaultInstance().getUsername();
        }

        /* access modifiers changed from: private */
        public void clearVestNickname() {
            this.bitField0_ &= -524289;
            this.vestNickname_ = getDefaultInstance().getVestNickname();
        }

        /* access modifiers changed from: private */
        public void clearWxUsernameV5() {
            this.bitField0_ &= -262145;
            this.wxUsernameV5_ = getDefaultInstance().getWxUsernameV5();
        }

        public static FinderContact getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderContact parseDelimitedFrom(InputStream inputStream) {
            return (FinderContact) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderContact parseFrom(ByteBuffer byteBuffer) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderContact> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAdditionalFlag(long j) {
            this.bitField0_ |= 134217728;
            this.additionalFlag_ = j;
        }

        /* access modifiers changed from: private */
        public void setCoverEntranceFlag(int i) {
            this.bitField0_ |= 8388608;
            this.coverEntranceFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrl(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.coverImgUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverImgUrlBytes(C16994k kVar) {
            this.coverImgUrl_ = kVar.mo18752u();
            this.bitField0_ |= 128;
        }

        /* access modifiers changed from: private */
        public void setCoverUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4194304;
            this.coverUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setCoverUrlBytes(C16994k kVar) {
            this.coverUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4194304;
        }

        /* access modifiers changed from: private */
        public void setExtFlag(int i) {
            this.bitField0_ |= 512;
            this.extFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setFansCount(int i) {
            this.bitField0_ |= 131072;
            this.fansCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setFeedCount(int i) {
            this.bitField0_ |= 1048576;
            this.feedCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setFollowFlag(int i) {
            this.bitField0_ |= 32;
            this.followFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setFollowTime(int i) {
            this.bitField0_ |= 64;
            this.followTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setForeignUserFlag(int i) {
            this.bitField0_ |= 16384;
            this.foreignUserFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setFriendFollowCount(int i) {
            this.bitField0_ |= 65536;
            this.friendFollowCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setHeadUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.headUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setHeadUrlBytes(C16994k kVar) {
            this.headUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setLiveCoverImgUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.liveCoverImgUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setLiveCoverImgUrlBytes(C16994k kVar) {
            this.liveCoverImgUrl_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setLiveStatus(int i) {
            this.bitField0_ |= 2048;
            this.liveStatus_ = i;
        }

        /* access modifiers changed from: private */
        public void setLoggingoutWording(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.loggingoutWording_ = str;
        }

        /* access modifiers changed from: private */
        public void setLoggingoutWordingBytes(C16994k kVar) {
            this.loggingoutWording_ = kVar.mo18752u();
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setNickname(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.nickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setNicknameBytes(C16994k kVar) {
            this.nickname_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setOneTimeFlag(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            this.oneTimeFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setOriginalEntranceFlag(int i) {
            this.bitField0_ |= 4096;
            this.originalEntranceFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setOriginalFlag(int i) {
            this.bitField0_ |= 1024;
            this.originalFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setSeq(long j) {
            this.bitField0_ |= 8;
            this.seq_ = j;
        }

        /* access modifiers changed from: private */
        public void setSignature(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.signature_ = str;
        }

        /* access modifiers changed from: private */
        public void setSignatureBytes(C16994k kVar) {
            this.signature_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setSpamStatus(int i) {
            this.bitField0_ |= 256;
            this.spamStatus_ = i;
        }

        /* access modifiers changed from: private */
        public void setStatus(long j) {
            this.bitField0_ |= 67108864;
            this.status_ = j;
        }

        /* access modifiers changed from: private */
        public void setUserFlag(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.userFlag_ = i;
        }

        /* access modifiers changed from: private */
        public void setUserMode(int i) {
            this.bitField0_ |= 2097152;
            this.userMode_ = i;
        }

        /* access modifiers changed from: private */
        public void setUsername(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.username_ = str;
        }

        /* access modifiers changed from: private */
        public void setUsernameBytes(C16994k kVar) {
            this.username_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setVestNickname(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.vestNickname_ = str;
        }

        /* access modifiers changed from: private */
        public void setVestNicknameBytes(C16994k kVar) {
            this.vestNickname_ = kVar.mo18752u();
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void setWxUsernameV5(String str) {
            str.getClass();
            this.bitField0_ |= 262144;
            this.wxUsernameV5_ = str;
        }

        /* access modifiers changed from: private */
        public void setWxUsernameV5Bytes(C16994k kVar) {
            this.wxUsernameV5_ = kVar.mo18752u();
            this.bitField0_ |= 262144;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001c\u0000\u0001\u0001(\u001c\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဈ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\tဈ\u0007\nဋ\b\u000bဋ\t\rဋ\n\u000fဋ\u000b\u0011ဋ\f\u0012ဈ\r\u0013ဋ\u000e\u0015ဈ\u000f\u0017ဋ\u0010\u0018ဋ\u0011\u0019ဈ\u0012\u001aဈ\u0013\u001bဋ\u0014\u001cဋ\u0015\u001fဈ\u0016 ဋ\u0017#ဋ\u0018$ဋ\u0019&ဃ\u001a(ဃ\u001b", new Object[]{"bitField0_", "username_", "nickname_", "headUrl_", "seq_", "signature_", "followFlag_", "followTime_", "coverImgUrl_", "spamStatus_", "extFlag_", "originalFlag_", "liveStatus_", "originalEntranceFlag_", "liveCoverImgUrl_", "foreignUserFlag_", "loggingoutWording_", "friendFollowCount_", "fansCount_", "wxUsernameV5_", "vestNickname_", "feedCount_", "userMode_", "coverUrl_", "coverEntranceFlag_", "userFlag_", "oneTimeFlag_", "status_", "additionalFlag_"});
                case 3:
                    return new FinderContact();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderContact> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderContact.class) {
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

        public long getAdditionalFlag() {
            return this.additionalFlag_;
        }

        public int getCoverEntranceFlag() {
            return this.coverEntranceFlag_;
        }

        public String getCoverImgUrl() {
            return this.coverImgUrl_;
        }

        public C16994k getCoverImgUrlBytes() {
            return C16994k.m16791k(this.coverImgUrl_);
        }

        public String getCoverUrl() {
            return this.coverUrl_;
        }

        public C16994k getCoverUrlBytes() {
            return C16994k.m16791k(this.coverUrl_);
        }

        public int getExtFlag() {
            return this.extFlag_;
        }

        public int getFansCount() {
            return this.fansCount_;
        }

        public int getFeedCount() {
            return this.feedCount_;
        }

        public int getFollowFlag() {
            return this.followFlag_;
        }

        public int getFollowTime() {
            return this.followTime_;
        }

        public int getForeignUserFlag() {
            return this.foreignUserFlag_;
        }

        public int getFriendFollowCount() {
            return this.friendFollowCount_;
        }

        public String getHeadUrl() {
            return this.headUrl_;
        }

        public C16994k getHeadUrlBytes() {
            return C16994k.m16791k(this.headUrl_);
        }

        public String getLiveCoverImgUrl() {
            return this.liveCoverImgUrl_;
        }

        public C16994k getLiveCoverImgUrlBytes() {
            return C16994k.m16791k(this.liveCoverImgUrl_);
        }

        public int getLiveStatus() {
            return this.liveStatus_;
        }

        public String getLoggingoutWording() {
            return this.loggingoutWording_;
        }

        public C16994k getLoggingoutWordingBytes() {
            return C16994k.m16791k(this.loggingoutWording_);
        }

        public String getNickname() {
            return this.nickname_;
        }

        public C16994k getNicknameBytes() {
            return C16994k.m16791k(this.nickname_);
        }

        public int getOneTimeFlag() {
            return this.oneTimeFlag_;
        }

        public int getOriginalEntranceFlag() {
            return this.originalEntranceFlag_;
        }

        public int getOriginalFlag() {
            return this.originalFlag_;
        }

        public long getSeq() {
            return this.seq_;
        }

        public String getSignature() {
            return this.signature_;
        }

        public C16994k getSignatureBytes() {
            return C16994k.m16791k(this.signature_);
        }

        public int getSpamStatus() {
            return this.spamStatus_;
        }

        public long getStatus() {
            return this.status_;
        }

        public int getUserFlag() {
            return this.userFlag_;
        }

        public int getUserMode() {
            return this.userMode_;
        }

        public String getUsername() {
            return this.username_;
        }

        public C16994k getUsernameBytes() {
            return C16994k.m16791k(this.username_);
        }

        public String getVestNickname() {
            return this.vestNickname_;
        }

        public C16994k getVestNicknameBytes() {
            return C16994k.m16791k(this.vestNickname_);
        }

        public String getWxUsernameV5() {
            return this.wxUsernameV5_;
        }

        public C16994k getWxUsernameV5Bytes() {
            return C16994k.m16791k(this.wxUsernameV5_);
        }

        public boolean hasAdditionalFlag() {
            return (this.bitField0_ & 134217728) != 0;
        }

        public boolean hasCoverEntranceFlag() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasCoverImgUrl() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasCoverUrl() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasExtFlag() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasFansCount() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasFeedCount() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasFollowFlag() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFollowTime() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasForeignUserFlag() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasFriendFollowCount() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasHeadUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLiveCoverImgUrl() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasLiveStatus() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasLoggingoutWording() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasNickname() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOneTimeFlag() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0;
        }

        public boolean hasOriginalEntranceFlag() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasOriginalFlag() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSeq() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSignature() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasSpamStatus() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasStatus() {
            return (this.bitField0_ & 67108864) != 0;
        }

        public boolean hasUserFlag() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasUserMode() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasUsername() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVestNickname() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasWxUsernameV5() {
            return (this.bitField0_ & 262144) != 0;
        }

        public static Builder newBuilder(FinderContact finderContact) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderContact);
        }

        public static FinderContact parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderContact) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderContact parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderContact parseFrom(C16994k kVar) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderContact parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderContact parseFrom(byte[] bArr) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderContact parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderContact parseFrom(InputStream inputStream) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderContact parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderContact parseFrom(C23856l lVar) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderContact parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderContact) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderDownloadInfo extends C23861l0<FinderDownloadInfo, Builder> implements FinderDownloadInfoOrBuilder {
        public static final int CODINGFORMAT_FIELD_NUMBER = 15;
        /* access modifiers changed from: private */
        public static final FinderDownloadInfo DEFAULT_INSTANCE;
        public static final int DOWNLOADEDBYTES_FIELD_NUMBER = 5;
        public static final int DOWNLOADSPEEDKBPS_FIELD_NUMBER = 10;
        public static final int DOWNLOAD_SPEED_FIELD_NUMBER = 24;
        public static final int DURATION_FIELD_NUMBER = 7;
        public static final int FEEDID_FIELD_NUMBER = 1;
        public static final int FILEBYTES_FIELD_NUMBER = 6;
        public static final int FILEFORMAT_FIELD_NUMBER = 21;
        public static final int FIRSTLOADTIMEMS_FIELD_NUMBER = 14;
        public static final int MEGA_VIDEO_ID_FIELD_NUMBER = 22;
        public static final int NETWORKID_FIELD_NUMBER = 18;
        public static final int PAGEINDEX_FIELD_NUMBER = 2;
        private static volatile C24062w1<FinderDownloadInfo> PARSER = null;
        public static final int PLAYPOSITION_FIELD_NUMBER = 13;
        public static final int PLAY_COUNT_FIELD_NUMBER = 23;
        public static final int PRELOADBYTES_FIELD_NUMBER = 4;
        public static final int PRELOADSTRATEGYID_FIELD_NUMBER = 16;
        public static final int PRELOAD_MAX_BIT_RATE_FIELD_NUMBER = 25;
        public static final int REQUEST_FORMAT_FIELD_NUMBER = 26;
        public static final int RTTMS_FIELD_NUMBER = 17;
        public static final int SCENE_FIELD_NUMBER = 3;
        public static final int STOPPLAYTIMESTAMP_FIELD_NUMBER = 12;
        public static final int SVRIP_FIELD_NUMBER = 19;
        public static final int SVRPORT_FIELD_NUMBER = 20;
        public static final int TOTALPLAYTIMEMS_FIELD_NUMBER = 8;
        public static final int TOTALWAITTIMEMS_FIELD_NUMBER = 9;
        public static final int WAITDETAILS_FIELD_NUMBER = 11;
        private int bitField0_;
        private String codingFormat_ = "";
        private int downloadSpeedKbps_;
        private DownloadSpeed downloadSpeed_;
        private int downloadedBytes_;
        private int duration_;
        private long feedId_;
        private int fileBytes_;
        private String fileFormat_ = "";
        private int firstLoadTimeMs_;
        private long megaVideoId_;
        private int networkId_;
        private int pageIndex_;
        private int playCount_;
        private int playPosition_;
        private int preloadBytes_;
        private int preloadMaxBitRate_;
        private long preloadStrategyId_;
        private String requestFormat_ = "";
        private int rttMs_;
        private int scene_;
        private int stopPlayTimestamp_;
        private String svrIp_ = "";
        private int svrPort_;
        private int totalPlayTimeMs_;
        private int totalWaitTimeMs_;
        private C23908o0.C23919j<FinderWaitDetail> waitDetails_ = C23861l0.emptyProtobufList();

        public static final class Builder extends C23861l0.C23862a<FinderDownloadInfo, Builder> implements FinderDownloadInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder addAllWaitDetails(Iterable<? extends FinderWaitDetail> iterable) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).addAllWaitDetails(iterable);
                return this;
            }

            public Builder addWaitDetails(FinderWaitDetail finderWaitDetail) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).addWaitDetails(finderWaitDetail);
                return this;
            }

            public Builder clearCodingFormat() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearCodingFormat();
                return this;
            }

            public Builder clearDownloadSpeed() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearDownloadSpeed();
                return this;
            }

            public Builder clearDownloadSpeedKbps() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearDownloadSpeedKbps();
                return this;
            }

            public Builder clearDownloadedBytes() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearDownloadedBytes();
                return this;
            }

            public Builder clearDuration() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearDuration();
                return this;
            }

            public Builder clearFeedId() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearFeedId();
                return this;
            }

            public Builder clearFileBytes() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearFileBytes();
                return this;
            }

            public Builder clearFileFormat() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearFileFormat();
                return this;
            }

            public Builder clearFirstLoadTimeMs() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearFirstLoadTimeMs();
                return this;
            }

            public Builder clearMegaVideoId() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearMegaVideoId();
                return this;
            }

            public Builder clearNetworkId() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearNetworkId();
                return this;
            }

            public Builder clearPageIndex() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearPageIndex();
                return this;
            }

            public Builder clearPlayCount() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearPlayCount();
                return this;
            }

            public Builder clearPlayPosition() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearPlayPosition();
                return this;
            }

            public Builder clearPreloadBytes() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearPreloadBytes();
                return this;
            }

            public Builder clearPreloadMaxBitRate() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearPreloadMaxBitRate();
                return this;
            }

            public Builder clearPreloadStrategyId() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearPreloadStrategyId();
                return this;
            }

            public Builder clearRequestFormat() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearRequestFormat();
                return this;
            }

            public Builder clearRttMs() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearRttMs();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearScene();
                return this;
            }

            public Builder clearStopPlayTimestamp() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearStopPlayTimestamp();
                return this;
            }

            public Builder clearSvrIp() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearSvrIp();
                return this;
            }

            public Builder clearSvrPort() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearSvrPort();
                return this;
            }

            public Builder clearTotalPlayTimeMs() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearTotalPlayTimeMs();
                return this;
            }

            public Builder clearTotalWaitTimeMs() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearTotalWaitTimeMs();
                return this;
            }

            public Builder clearWaitDetails() {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).clearWaitDetails();
                return this;
            }

            public String getCodingFormat() {
                return ((FinderDownloadInfo) this.instance).getCodingFormat();
            }

            public C16994k getCodingFormatBytes() {
                return ((FinderDownloadInfo) this.instance).getCodingFormatBytes();
            }

            public DownloadSpeed getDownloadSpeed() {
                return ((FinderDownloadInfo) this.instance).getDownloadSpeed();
            }

            public int getDownloadSpeedKbps() {
                return ((FinderDownloadInfo) this.instance).getDownloadSpeedKbps();
            }

            public int getDownloadedBytes() {
                return ((FinderDownloadInfo) this.instance).getDownloadedBytes();
            }

            public int getDuration() {
                return ((FinderDownloadInfo) this.instance).getDuration();
            }

            public long getFeedId() {
                return ((FinderDownloadInfo) this.instance).getFeedId();
            }

            public int getFileBytes() {
                return ((FinderDownloadInfo) this.instance).getFileBytes();
            }

            public String getFileFormat() {
                return ((FinderDownloadInfo) this.instance).getFileFormat();
            }

            public C16994k getFileFormatBytes() {
                return ((FinderDownloadInfo) this.instance).getFileFormatBytes();
            }

            public int getFirstLoadTimeMs() {
                return ((FinderDownloadInfo) this.instance).getFirstLoadTimeMs();
            }

            public long getMegaVideoId() {
                return ((FinderDownloadInfo) this.instance).getMegaVideoId();
            }

            public int getNetworkId() {
                return ((FinderDownloadInfo) this.instance).getNetworkId();
            }

            public int getPageIndex() {
                return ((FinderDownloadInfo) this.instance).getPageIndex();
            }

            public int getPlayCount() {
                return ((FinderDownloadInfo) this.instance).getPlayCount();
            }

            public int getPlayPosition() {
                return ((FinderDownloadInfo) this.instance).getPlayPosition();
            }

            public int getPreloadBytes() {
                return ((FinderDownloadInfo) this.instance).getPreloadBytes();
            }

            public int getPreloadMaxBitRate() {
                return ((FinderDownloadInfo) this.instance).getPreloadMaxBitRate();
            }

            public long getPreloadStrategyId() {
                return ((FinderDownloadInfo) this.instance).getPreloadStrategyId();
            }

            public String getRequestFormat() {
                return ((FinderDownloadInfo) this.instance).getRequestFormat();
            }

            public C16994k getRequestFormatBytes() {
                return ((FinderDownloadInfo) this.instance).getRequestFormatBytes();
            }

            public int getRttMs() {
                return ((FinderDownloadInfo) this.instance).getRttMs();
            }

            public int getScene() {
                return ((FinderDownloadInfo) this.instance).getScene();
            }

            public int getStopPlayTimestamp() {
                return ((FinderDownloadInfo) this.instance).getStopPlayTimestamp();
            }

            public String getSvrIp() {
                return ((FinderDownloadInfo) this.instance).getSvrIp();
            }

            public C16994k getSvrIpBytes() {
                return ((FinderDownloadInfo) this.instance).getSvrIpBytes();
            }

            public int getSvrPort() {
                return ((FinderDownloadInfo) this.instance).getSvrPort();
            }

            public int getTotalPlayTimeMs() {
                return ((FinderDownloadInfo) this.instance).getTotalPlayTimeMs();
            }

            public int getTotalWaitTimeMs() {
                return ((FinderDownloadInfo) this.instance).getTotalWaitTimeMs();
            }

            public FinderWaitDetail getWaitDetails(int i) {
                return ((FinderDownloadInfo) this.instance).getWaitDetails(i);
            }

            public int getWaitDetailsCount() {
                return ((FinderDownloadInfo) this.instance).getWaitDetailsCount();
            }

            public List<FinderWaitDetail> getWaitDetailsList() {
                return Collections.unmodifiableList(((FinderDownloadInfo) this.instance).getWaitDetailsList());
            }

            public boolean hasCodingFormat() {
                return ((FinderDownloadInfo) this.instance).hasCodingFormat();
            }

            public boolean hasDownloadSpeed() {
                return ((FinderDownloadInfo) this.instance).hasDownloadSpeed();
            }

            public boolean hasDownloadSpeedKbps() {
                return ((FinderDownloadInfo) this.instance).hasDownloadSpeedKbps();
            }

            public boolean hasDownloadedBytes() {
                return ((FinderDownloadInfo) this.instance).hasDownloadedBytes();
            }

            public boolean hasDuration() {
                return ((FinderDownloadInfo) this.instance).hasDuration();
            }

            public boolean hasFeedId() {
                return ((FinderDownloadInfo) this.instance).hasFeedId();
            }

            public boolean hasFileBytes() {
                return ((FinderDownloadInfo) this.instance).hasFileBytes();
            }

            public boolean hasFileFormat() {
                return ((FinderDownloadInfo) this.instance).hasFileFormat();
            }

            public boolean hasFirstLoadTimeMs() {
                return ((FinderDownloadInfo) this.instance).hasFirstLoadTimeMs();
            }

            public boolean hasMegaVideoId() {
                return ((FinderDownloadInfo) this.instance).hasMegaVideoId();
            }

            public boolean hasNetworkId() {
                return ((FinderDownloadInfo) this.instance).hasNetworkId();
            }

            public boolean hasPageIndex() {
                return ((FinderDownloadInfo) this.instance).hasPageIndex();
            }

            public boolean hasPlayCount() {
                return ((FinderDownloadInfo) this.instance).hasPlayCount();
            }

            public boolean hasPlayPosition() {
                return ((FinderDownloadInfo) this.instance).hasPlayPosition();
            }

            public boolean hasPreloadBytes() {
                return ((FinderDownloadInfo) this.instance).hasPreloadBytes();
            }

            public boolean hasPreloadMaxBitRate() {
                return ((FinderDownloadInfo) this.instance).hasPreloadMaxBitRate();
            }

            public boolean hasPreloadStrategyId() {
                return ((FinderDownloadInfo) this.instance).hasPreloadStrategyId();
            }

            public boolean hasRequestFormat() {
                return ((FinderDownloadInfo) this.instance).hasRequestFormat();
            }

            public boolean hasRttMs() {
                return ((FinderDownloadInfo) this.instance).hasRttMs();
            }

            public boolean hasScene() {
                return ((FinderDownloadInfo) this.instance).hasScene();
            }

            public boolean hasStopPlayTimestamp() {
                return ((FinderDownloadInfo) this.instance).hasStopPlayTimestamp();
            }

            public boolean hasSvrIp() {
                return ((FinderDownloadInfo) this.instance).hasSvrIp();
            }

            public boolean hasSvrPort() {
                return ((FinderDownloadInfo) this.instance).hasSvrPort();
            }

            public boolean hasTotalPlayTimeMs() {
                return ((FinderDownloadInfo) this.instance).hasTotalPlayTimeMs();
            }

            public boolean hasTotalWaitTimeMs() {
                return ((FinderDownloadInfo) this.instance).hasTotalWaitTimeMs();
            }

            public Builder mergeDownloadSpeed(DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).mergeDownloadSpeed(downloadSpeed);
                return this;
            }

            public Builder removeWaitDetails(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).removeWaitDetails(i);
                return this;
            }

            public Builder setCodingFormat(String str) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setCodingFormat(str);
                return this;
            }

            public Builder setCodingFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setCodingFormatBytes(kVar);
                return this;
            }

            public Builder setDownloadSpeed(DownloadSpeed downloadSpeed) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setDownloadSpeed(downloadSpeed);
                return this;
            }

            public Builder setDownloadSpeedKbps(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setDownloadSpeedKbps(i);
                return this;
            }

            public Builder setDownloadedBytes(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setDownloadedBytes(i);
                return this;
            }

            public Builder setDuration(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setDuration(i);
                return this;
            }

            public Builder setFeedId(long j) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setFeedId(j);
                return this;
            }

            public Builder setFileBytes(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setFileBytes(i);
                return this;
            }

            public Builder setFileFormat(String str) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setFileFormat(str);
                return this;
            }

            public Builder setFileFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setFileFormatBytes(kVar);
                return this;
            }

            public Builder setFirstLoadTimeMs(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setFirstLoadTimeMs(i);
                return this;
            }

            public Builder setMegaVideoId(long j) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setMegaVideoId(j);
                return this;
            }

            public Builder setNetworkId(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setNetworkId(i);
                return this;
            }

            public Builder setPageIndex(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setPageIndex(i);
                return this;
            }

            public Builder setPlayCount(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setPlayCount(i);
                return this;
            }

            public Builder setPlayPosition(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setPlayPosition(i);
                return this;
            }

            public Builder setPreloadBytes(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setPreloadBytes(i);
                return this;
            }

            public Builder setPreloadMaxBitRate(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setPreloadMaxBitRate(i);
                return this;
            }

            public Builder setPreloadStrategyId(long j) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setPreloadStrategyId(j);
                return this;
            }

            public Builder setRequestFormat(String str) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setRequestFormat(str);
                return this;
            }

            public Builder setRequestFormatBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setRequestFormatBytes(kVar);
                return this;
            }

            public Builder setRttMs(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setRttMs(i);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setScene(i);
                return this;
            }

            public Builder setStopPlayTimestamp(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setStopPlayTimestamp(i);
                return this;
            }

            public Builder setSvrIp(String str) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setSvrIp(str);
                return this;
            }

            public Builder setSvrIpBytes(C16994k kVar) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setSvrIpBytes(kVar);
                return this;
            }

            public Builder setSvrPort(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setSvrPort(i);
                return this;
            }

            public Builder setTotalPlayTimeMs(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setTotalPlayTimeMs(i);
                return this;
            }

            public Builder setTotalWaitTimeMs(int i) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setTotalWaitTimeMs(i);
                return this;
            }

            public Builder setWaitDetails(int i, FinderWaitDetail finderWaitDetail) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setWaitDetails(i, finderWaitDetail);
                return this;
            }

            private Builder() {
                super(FinderDownloadInfo.DEFAULT_INSTANCE);
            }

            public Builder addWaitDetails(int i, FinderWaitDetail finderWaitDetail) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).addWaitDetails(i, finderWaitDetail);
                return this;
            }

            public Builder setDownloadSpeed(DownloadSpeed.Builder builder) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setDownloadSpeed((DownloadSpeed) builder.build());
                return this;
            }

            public Builder setWaitDetails(int i, FinderWaitDetail.Builder builder) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).setWaitDetails(i, (FinderWaitDetail) builder.build());
                return this;
            }

            public Builder addWaitDetails(FinderWaitDetail.Builder builder) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).addWaitDetails((FinderWaitDetail) builder.build());
                return this;
            }

            public Builder addWaitDetails(int i, FinderWaitDetail.Builder builder) {
                copyOnWrite();
                ((FinderDownloadInfo) this.instance).addWaitDetails(i, (FinderWaitDetail) builder.build());
                return this;
            }
        }

        static {
            FinderDownloadInfo finderDownloadInfo = new FinderDownloadInfo();
            DEFAULT_INSTANCE = finderDownloadInfo;
            C23861l0.registerDefaultInstance(FinderDownloadInfo.class, finderDownloadInfo);
        }

        private FinderDownloadInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllWaitDetails(Iterable<? extends FinderWaitDetail> iterable) {
            ensureWaitDetailsIsMutable();
            C23810b.addAll(iterable, this.waitDetails_);
        }

        /* access modifiers changed from: private */
        public void addWaitDetails(FinderWaitDetail finderWaitDetail) {
            finderWaitDetail.getClass();
            ensureWaitDetailsIsMutable();
            this.waitDetails_.add(finderWaitDetail);
        }

        /* access modifiers changed from: private */
        public void clearCodingFormat() {
            this.bitField0_ &= -8193;
            this.codingFormat_ = getDefaultInstance().getCodingFormat();
        }

        /* access modifiers changed from: private */
        public void clearDownloadSpeed() {
            this.downloadSpeed_ = null;
            this.bitField0_ &= -4194305;
        }

        /* access modifiers changed from: private */
        public void clearDownloadSpeedKbps() {
            this.bitField0_ &= -513;
            this.downloadSpeedKbps_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownloadedBytes() {
            this.bitField0_ &= -17;
            this.downloadedBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDuration() {
            this.bitField0_ &= -65;
            this.duration_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFeedId() {
            this.bitField0_ &= -2;
            this.feedId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileBytes() {
            this.bitField0_ &= -33;
            this.fileBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFileFormat() {
            this.bitField0_ &= -524289;
            this.fileFormat_ = getDefaultInstance().getFileFormat();
        }

        /* access modifiers changed from: private */
        public void clearFirstLoadTimeMs() {
            this.bitField0_ &= -4097;
            this.firstLoadTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMegaVideoId() {
            this.bitField0_ &= -1048577;
            this.megaVideoId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNetworkId() {
            this.bitField0_ &= -65537;
            this.networkId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPageIndex() {
            this.bitField0_ &= -3;
            this.pageIndex_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayCount() {
            this.bitField0_ &= -2097153;
            this.playCount_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayPosition() {
            this.bitField0_ &= -2049;
            this.playPosition_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPreloadBytes() {
            this.bitField0_ &= -9;
            this.preloadBytes_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPreloadMaxBitRate() {
            this.bitField0_ &= -8388609;
            this.preloadMaxBitRate_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPreloadStrategyId() {
            this.bitField0_ &= -16385;
            this.preloadStrategyId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRequestFormat() {
            this.bitField0_ &= -16777217;
            this.requestFormat_ = getDefaultInstance().getRequestFormat();
        }

        /* access modifiers changed from: private */
        public void clearRttMs() {
            this.bitField0_ &= -32769;
            this.rttMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -5;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStopPlayTimestamp() {
            this.bitField0_ &= -1025;
            this.stopPlayTimestamp_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSvrIp() {
            this.bitField0_ &= -131073;
            this.svrIp_ = getDefaultInstance().getSvrIp();
        }

        /* access modifiers changed from: private */
        public void clearSvrPort() {
            this.bitField0_ &= -262145;
            this.svrPort_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTotalPlayTimeMs() {
            this.bitField0_ &= -129;
            this.totalPlayTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTotalWaitTimeMs() {
            this.bitField0_ &= -257;
            this.totalWaitTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearWaitDetails() {
            this.waitDetails_ = C23861l0.emptyProtobufList();
        }

        private void ensureWaitDetailsIsMutable() {
            C23908o0.C23919j<FinderWaitDetail> jVar = this.waitDetails_;
            if (!jVar.mo37523Q()) {
                this.waitDetails_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static FinderDownloadInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDownloadSpeed(DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            DownloadSpeed downloadSpeed2 = this.downloadSpeed_;
            if (downloadSpeed2 == null || downloadSpeed2 == DownloadSpeed.getDefaultInstance()) {
                this.downloadSpeed_ = downloadSpeed;
            } else {
                this.downloadSpeed_ = (DownloadSpeed) ((DownloadSpeed.Builder) DownloadSpeed.newBuilder(this.downloadSpeed_).mergeFrom(downloadSpeed)).buildPartial();
            }
            this.bitField0_ |= 4194304;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderDownloadInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderDownloadInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderDownloadInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderDownloadInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeWaitDetails(int i) {
            ensureWaitDetailsIsMutable();
            this.waitDetails_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCodingFormat(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.codingFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setCodingFormatBytes(C16994k kVar) {
            this.codingFormat_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        /* access modifiers changed from: private */
        public void setDownloadSpeed(DownloadSpeed downloadSpeed) {
            downloadSpeed.getClass();
            this.downloadSpeed_ = downloadSpeed;
            this.bitField0_ |= 4194304;
        }

        /* access modifiers changed from: private */
        public void setDownloadSpeedKbps(int i) {
            this.bitField0_ |= 512;
            this.downloadSpeedKbps_ = i;
        }

        /* access modifiers changed from: private */
        public void setDownloadedBytes(int i) {
            this.bitField0_ |= 16;
            this.downloadedBytes_ = i;
        }

        /* access modifiers changed from: private */
        public void setDuration(int i) {
            this.bitField0_ |= 64;
            this.duration_ = i;
        }

        /* access modifiers changed from: private */
        public void setFeedId(long j) {
            this.bitField0_ |= 1;
            this.feedId_ = j;
        }

        /* access modifiers changed from: private */
        public void setFileBytes(int i) {
            this.bitField0_ |= 32;
            this.fileBytes_ = i;
        }

        /* access modifiers changed from: private */
        public void setFileFormat(String str) {
            str.getClass();
            this.bitField0_ |= 524288;
            this.fileFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setFileFormatBytes(C16994k kVar) {
            this.fileFormat_ = kVar.mo18752u();
            this.bitField0_ |= 524288;
        }

        /* access modifiers changed from: private */
        public void setFirstLoadTimeMs(int i) {
            this.bitField0_ |= 4096;
            this.firstLoadTimeMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setMegaVideoId(long j) {
            this.bitField0_ |= 1048576;
            this.megaVideoId_ = j;
        }

        /* access modifiers changed from: private */
        public void setNetworkId(int i) {
            this.bitField0_ |= 65536;
            this.networkId_ = i;
        }

        /* access modifiers changed from: private */
        public void setPageIndex(int i) {
            this.bitField0_ |= 2;
            this.pageIndex_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayCount(int i) {
            this.bitField0_ |= 2097152;
            this.playCount_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayPosition(int i) {
            this.bitField0_ |= 2048;
            this.playPosition_ = i;
        }

        /* access modifiers changed from: private */
        public void setPreloadBytes(int i) {
            this.bitField0_ |= 8;
            this.preloadBytes_ = i;
        }

        /* access modifiers changed from: private */
        public void setPreloadMaxBitRate(int i) {
            this.bitField0_ |= 8388608;
            this.preloadMaxBitRate_ = i;
        }

        /* access modifiers changed from: private */
        public void setPreloadStrategyId(long j) {
            this.bitField0_ |= 16384;
            this.preloadStrategyId_ = j;
        }

        /* access modifiers changed from: private */
        public void setRequestFormat(String str) {
            str.getClass();
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.requestFormat_ = str;
        }

        /* access modifiers changed from: private */
        public void setRequestFormatBytes(C16994k kVar) {
            this.requestFormat_ = kVar.mo18752u();
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }

        /* access modifiers changed from: private */
        public void setRttMs(int i) {
            this.bitField0_ |= 32768;
            this.rttMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 4;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setStopPlayTimestamp(int i) {
            this.bitField0_ |= 1024;
            this.stopPlayTimestamp_ = i;
        }

        /* access modifiers changed from: private */
        public void setSvrIp(String str) {
            str.getClass();
            this.bitField0_ |= 131072;
            this.svrIp_ = str;
        }

        /* access modifiers changed from: private */
        public void setSvrIpBytes(C16994k kVar) {
            this.svrIp_ = kVar.mo18752u();
            this.bitField0_ |= 131072;
        }

        /* access modifiers changed from: private */
        public void setSvrPort(int i) {
            this.bitField0_ |= 262144;
            this.svrPort_ = i;
        }

        /* access modifiers changed from: private */
        public void setTotalPlayTimeMs(int i) {
            this.bitField0_ |= 128;
            this.totalPlayTimeMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setTotalWaitTimeMs(int i) {
            this.bitField0_ |= 256;
            this.totalWaitTimeMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setWaitDetails(int i, FinderWaitDetail finderWaitDetail) {
            finderWaitDetail.getClass();
            ensureWaitDetailsIsMutable();
            this.waitDetails_.set(i, finderWaitDetail);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000b\u001b\fဋ\n\rဋ\u000b\u000eဋ\f\u000fဈ\r\u0010ဃ\u000e\u0011ဋ\u000f\u0012ဋ\u0010\u0013ဈ\u0011\u0014ဋ\u0012\u0015ဈ\u0013\u0016ဃ\u0014\u0017ဋ\u0015\u0018ဉ\u0016\u0019ဋ\u0017\u001aဈ\u0018", new Object[]{"bitField0_", "feedId_", "pageIndex_", "scene_", "preloadBytes_", "downloadedBytes_", "fileBytes_", "duration_", "totalPlayTimeMs_", "totalWaitTimeMs_", "downloadSpeedKbps_", "waitDetails_", FinderWaitDetail.class, "stopPlayTimestamp_", "playPosition_", "firstLoadTimeMs_", "codingFormat_", "preloadStrategyId_", "rttMs_", "networkId_", "svrIp_", "svrPort_", "fileFormat_", "megaVideoId_", "playCount_", "downloadSpeed_", "preloadMaxBitRate_", "requestFormat_"});
                case 3:
                    return new FinderDownloadInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderDownloadInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderDownloadInfo.class) {
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

        public String getCodingFormat() {
            return this.codingFormat_;
        }

        public C16994k getCodingFormatBytes() {
            return C16994k.m16791k(this.codingFormat_);
        }

        public DownloadSpeed getDownloadSpeed() {
            DownloadSpeed downloadSpeed = this.downloadSpeed_;
            return downloadSpeed == null ? DownloadSpeed.getDefaultInstance() : downloadSpeed;
        }

        public int getDownloadSpeedKbps() {
            return this.downloadSpeedKbps_;
        }

        public int getDownloadedBytes() {
            return this.downloadedBytes_;
        }

        public int getDuration() {
            return this.duration_;
        }

        public long getFeedId() {
            return this.feedId_;
        }

        public int getFileBytes() {
            return this.fileBytes_;
        }

        public String getFileFormat() {
            return this.fileFormat_;
        }

        public C16994k getFileFormatBytes() {
            return C16994k.m16791k(this.fileFormat_);
        }

        public int getFirstLoadTimeMs() {
            return this.firstLoadTimeMs_;
        }

        public long getMegaVideoId() {
            return this.megaVideoId_;
        }

        public int getNetworkId() {
            return this.networkId_;
        }

        public int getPageIndex() {
            return this.pageIndex_;
        }

        public int getPlayCount() {
            return this.playCount_;
        }

        public int getPlayPosition() {
            return this.playPosition_;
        }

        public int getPreloadBytes() {
            return this.preloadBytes_;
        }

        public int getPreloadMaxBitRate() {
            return this.preloadMaxBitRate_;
        }

        public long getPreloadStrategyId() {
            return this.preloadStrategyId_;
        }

        public String getRequestFormat() {
            return this.requestFormat_;
        }

        public C16994k getRequestFormatBytes() {
            return C16994k.m16791k(this.requestFormat_);
        }

        public int getRttMs() {
            return this.rttMs_;
        }

        public int getScene() {
            return this.scene_;
        }

        public int getStopPlayTimestamp() {
            return this.stopPlayTimestamp_;
        }

        public String getSvrIp() {
            return this.svrIp_;
        }

        public C16994k getSvrIpBytes() {
            return C16994k.m16791k(this.svrIp_);
        }

        public int getSvrPort() {
            return this.svrPort_;
        }

        public int getTotalPlayTimeMs() {
            return this.totalPlayTimeMs_;
        }

        public int getTotalWaitTimeMs() {
            return this.totalWaitTimeMs_;
        }

        public FinderWaitDetail getWaitDetails(int i) {
            return this.waitDetails_.get(i);
        }

        public int getWaitDetailsCount() {
            return this.waitDetails_.size();
        }

        public List<FinderWaitDetail> getWaitDetailsList() {
            return this.waitDetails_;
        }

        public FinderWaitDetailOrBuilder getWaitDetailsOrBuilder(int i) {
            return this.waitDetails_.get(i);
        }

        public List<? extends FinderWaitDetailOrBuilder> getWaitDetailsOrBuilderList() {
            return this.waitDetails_;
        }

        public boolean hasCodingFormat() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasDownloadSpeed() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasDownloadSpeedKbps() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasDownloadedBytes() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDuration() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasFeedId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasFileBytes() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasFileFormat() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasFirstLoadTimeMs() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasMegaVideoId() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasNetworkId() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasPageIndex() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPlayCount() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasPlayPosition() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasPreloadBytes() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasPreloadMaxBitRate() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasPreloadStrategyId() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasRequestFormat() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public boolean hasRttMs() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasStopPlayTimestamp() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSvrIp() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasSvrPort() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasTotalPlayTimeMs() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasTotalWaitTimeMs() {
            return (this.bitField0_ & 256) != 0;
        }

        public static Builder newBuilder(FinderDownloadInfo finderDownloadInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderDownloadInfo);
        }

        public static FinderDownloadInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderDownloadInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderDownloadInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderDownloadInfo parseFrom(C16994k kVar) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addWaitDetails(int i, FinderWaitDetail finderWaitDetail) {
            finderWaitDetail.getClass();
            ensureWaitDetailsIsMutable();
            this.waitDetails_.add(i, finderWaitDetail);
        }

        public static FinderDownloadInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderDownloadInfo parseFrom(byte[] bArr) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderDownloadInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderDownloadInfo parseFrom(InputStream inputStream) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderDownloadInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderDownloadInfo parseFrom(C23856l lVar) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderDownloadInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderDownloadInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class FinderFluencyInfo extends C23861l0<FinderFluencyInfo, Builder> implements FinderFluencyInfoOrBuilder {
        public static final int CGI_TYPE_FIELD_NUMBER = 14;
        public static final int COMMENT_SCENE_FIELD_NUMBER = 12;
        public static final int CONNECT_SUCCESSFUL_TIME_FIELD_NUMBER = 19;
        public static final int DB_OPER_MS_FIELD_NUMBER = 10;
        public static final int DEBUG_MESSAGE_FIELD_NUMBER = 11;
        public static final int DECODETOFIRSTFRAMEMS_FIELD_NUMBER = 9;
        /* access modifiers changed from: private */
        public static final FinderFluencyInfo DEFAULT_INSTANCE;
        public static final int DOWNLOADTODECODEMS_FIELD_NUMBER = 8;
        public static final int FINISHSCENE_FIELD_NUMBER = 4;
        public static final int GLOBALINITMS_FIELD_NUMBER = 5;
        public static final int HOT_FIELD_NUMBER = 2;
        public static final int LOADING_TIME_MS_FIELD_NUMBER = 16;
        private static volatile C24062w1<FinderFluencyInfo> PARSER = null;
        public static final int PULLCGIMS_FIELD_NUMBER = 6;
        public static final int PULLTYPE_FIELD_NUMBER = 3;
        public static final int READ_PACKET_FINISHED_TIME_FIELD_NUMBER = 24;
        public static final int SCENE_FIELD_NUMBER = 1;
        public static final int SHOWUIMS_FIELD_NUMBER = 7;
        public static final int START_CONNECT_TIME_FIELD_NUMBER = 18;
        public static final int START_READ_PACKET_TIME_FIELD_NUMBER = 23;
        public static final int START_SEND_PACKET_TIME_FIELD_NUMBER = 22;
        public static final int START_TIME_FIELD_NUMBER = 17;
        public static final int START_TLS_HANDSHAKE_TIME_FIELD_NUMBER = 20;
        public static final int STATUS_FIELD_NUMBER = 13;
        public static final int TLS_HANDSHAKE_SUCCESSFUL_TIME_FIELD_NUMBER = 21;
        public static final int TOTAL_TIME_MS_FIELD_NUMBER = 15;
        public static final int UI_REFRESH_END_COST_MS_FIELD_NUMBER = 25;
        private int bitField0_;
        private int cgiType_;
        private int commentScene_;
        private long connectSuccessfulTime_;
        private int dbOperMs_;
        private C16994k debugMessage_ = C16994k.f46000e;
        private int decodeToFirstFrameMs_;
        private int downloadToDecodeMs_;
        private int finishScene_;
        private int globalInitMs_;
        private int hot_;
        private int loadingTimeMs_;
        private int pullCgiMs_;
        private int pullType_;
        private long readPacketFinishedTime_;
        private int scene_;
        private int showUiMs_;
        private long startConnectTime_;
        private long startReadPacketTime_;
        private long startSendPacketTime_;
        private long startTime_;
        private long startTlsHandshakeTime_;
        private int status_;
        private long tlsHandshakeSuccessfulTime_;
        private int totalTimeMs_;
        private int uiRefreshEndCostMs_;

        public static final class Builder extends C23861l0.C23862a<FinderFluencyInfo, Builder> implements FinderFluencyInfoOrBuilder {
            public /* synthetic */ Builder(C243071 r1) {
                this();
            }

            public Builder clearCgiType() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearCgiType();
                return this;
            }

            public Builder clearCommentScene() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearCommentScene();
                return this;
            }

            public Builder clearConnectSuccessfulTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearConnectSuccessfulTime();
                return this;
            }

            public Builder clearDbOperMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearDbOperMs();
                return this;
            }

            public Builder clearDebugMessage() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearDebugMessage();
                return this;
            }

            public Builder clearDecodeToFirstFrameMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearDecodeToFirstFrameMs();
                return this;
            }

            public Builder clearDownloadToDecodeMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearDownloadToDecodeMs();
                return this;
            }

            public Builder clearFinishScene() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearFinishScene();
                return this;
            }

            public Builder clearGlobalInitMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearGlobalInitMs();
                return this;
            }

            public Builder clearHot() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearHot();
                return this;
            }

            public Builder clearLoadingTimeMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearLoadingTimeMs();
                return this;
            }

            public Builder clearPullCgiMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearPullCgiMs();
                return this;
            }

            public Builder clearPullType() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearPullType();
                return this;
            }

            public Builder clearReadPacketFinishedTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearReadPacketFinishedTime();
                return this;
            }

            public Builder clearScene() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearScene();
                return this;
            }

            public Builder clearShowUiMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearShowUiMs();
                return this;
            }

            public Builder clearStartConnectTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearStartConnectTime();
                return this;
            }

            public Builder clearStartReadPacketTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearStartReadPacketTime();
                return this;
            }

            public Builder clearStartSendPacketTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearStartSendPacketTime();
                return this;
            }

            public Builder clearStartTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearStartTime();
                return this;
            }

            public Builder clearStartTlsHandshakeTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearStartTlsHandshakeTime();
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearStatus();
                return this;
            }

            public Builder clearTlsHandshakeSuccessfulTime() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearTlsHandshakeSuccessfulTime();
                return this;
            }

            public Builder clearTotalTimeMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearTotalTimeMs();
                return this;
            }

            public Builder clearUiRefreshEndCostMs() {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).clearUiRefreshEndCostMs();
                return this;
            }

            public int getCgiType() {
                return ((FinderFluencyInfo) this.instance).getCgiType();
            }

            public int getCommentScene() {
                return ((FinderFluencyInfo) this.instance).getCommentScene();
            }

            public long getConnectSuccessfulTime() {
                return ((FinderFluencyInfo) this.instance).getConnectSuccessfulTime();
            }

            public int getDbOperMs() {
                return ((FinderFluencyInfo) this.instance).getDbOperMs();
            }

            public C16994k getDebugMessage() {
                return ((FinderFluencyInfo) this.instance).getDebugMessage();
            }

            public int getDecodeToFirstFrameMs() {
                return ((FinderFluencyInfo) this.instance).getDecodeToFirstFrameMs();
            }

            public int getDownloadToDecodeMs() {
                return ((FinderFluencyInfo) this.instance).getDownloadToDecodeMs();
            }

            public int getFinishScene() {
                return ((FinderFluencyInfo) this.instance).getFinishScene();
            }

            public int getGlobalInitMs() {
                return ((FinderFluencyInfo) this.instance).getGlobalInitMs();
            }

            public int getHot() {
                return ((FinderFluencyInfo) this.instance).getHot();
            }

            public int getLoadingTimeMs() {
                return ((FinderFluencyInfo) this.instance).getLoadingTimeMs();
            }

            public int getPullCgiMs() {
                return ((FinderFluencyInfo) this.instance).getPullCgiMs();
            }

            public int getPullType() {
                return ((FinderFluencyInfo) this.instance).getPullType();
            }

            public long getReadPacketFinishedTime() {
                return ((FinderFluencyInfo) this.instance).getReadPacketFinishedTime();
            }

            public int getScene() {
                return ((FinderFluencyInfo) this.instance).getScene();
            }

            public int getShowUiMs() {
                return ((FinderFluencyInfo) this.instance).getShowUiMs();
            }

            public long getStartConnectTime() {
                return ((FinderFluencyInfo) this.instance).getStartConnectTime();
            }

            public long getStartReadPacketTime() {
                return ((FinderFluencyInfo) this.instance).getStartReadPacketTime();
            }

            public long getStartSendPacketTime() {
                return ((FinderFluencyInfo) this.instance).getStartSendPacketTime();
            }

            public long getStartTime() {
                return ((FinderFluencyInfo) this.instance).getStartTime();
            }

            public long getStartTlsHandshakeTime() {
                return ((FinderFluencyInfo) this.instance).getStartTlsHandshakeTime();
            }

            public int getStatus() {
                return ((FinderFluencyInfo) this.instance).getStatus();
            }

            public long getTlsHandshakeSuccessfulTime() {
                return ((FinderFluencyInfo) this.instance).getTlsHandshakeSuccessfulTime();
            }

            public int getTotalTimeMs() {
                return ((FinderFluencyInfo) this.instance).getTotalTimeMs();
            }

            public int getUiRefreshEndCostMs() {
                return ((FinderFluencyInfo) this.instance).getUiRefreshEndCostMs();
            }

            public boolean hasCgiType() {
                return ((FinderFluencyInfo) this.instance).hasCgiType();
            }

            public boolean hasCommentScene() {
                return ((FinderFluencyInfo) this.instance).hasCommentScene();
            }

            public boolean hasConnectSuccessfulTime() {
                return ((FinderFluencyInfo) this.instance).hasConnectSuccessfulTime();
            }

            public boolean hasDbOperMs() {
                return ((FinderFluencyInfo) this.instance).hasDbOperMs();
            }

            public boolean hasDebugMessage() {
                return ((FinderFluencyInfo) this.instance).hasDebugMessage();
            }

            public boolean hasDecodeToFirstFrameMs() {
                return ((FinderFluencyInfo) this.instance).hasDecodeToFirstFrameMs();
            }

            public boolean hasDownloadToDecodeMs() {
                return ((FinderFluencyInfo) this.instance).hasDownloadToDecodeMs();
            }

            public boolean hasFinishScene() {
                return ((FinderFluencyInfo) this.instance).hasFinishScene();
            }

            public boolean hasGlobalInitMs() {
                return ((FinderFluencyInfo) this.instance).hasGlobalInitMs();
            }

            public boolean hasHot() {
                return ((FinderFluencyInfo) this.instance).hasHot();
            }

            public boolean hasLoadingTimeMs() {
                return ((FinderFluencyInfo) this.instance).hasLoadingTimeMs();
            }

            public boolean hasPullCgiMs() {
                return ((FinderFluencyInfo) this.instance).hasPullCgiMs();
            }

            public boolean hasPullType() {
                return ((FinderFluencyInfo) this.instance).hasPullType();
            }

            public boolean hasReadPacketFinishedTime() {
                return ((FinderFluencyInfo) this.instance).hasReadPacketFinishedTime();
            }

            public boolean hasScene() {
                return ((FinderFluencyInfo) this.instance).hasScene();
            }

            public boolean hasShowUiMs() {
                return ((FinderFluencyInfo) this.instance).hasShowUiMs();
            }

            public boolean hasStartConnectTime() {
                return ((FinderFluencyInfo) this.instance).hasStartConnectTime();
            }

            public boolean hasStartReadPacketTime() {
                return ((FinderFluencyInfo) this.instance).hasStartReadPacketTime();
            }

            public boolean hasStartSendPacketTime() {
                return ((FinderFluencyInfo) this.instance).hasStartSendPacketTime();
            }

            public boolean hasStartTime() {
                return ((FinderFluencyInfo) this.instance).hasStartTime();
            }

            public boolean hasStartTlsHandshakeTime() {
                return ((FinderFluencyInfo) this.instance).hasStartTlsHandshakeTime();
            }

            public boolean hasStatus() {
                return ((FinderFluencyInfo) this.instance).hasStatus();
            }

            public boolean hasTlsHandshakeSuccessfulTime() {
                return ((FinderFluencyInfo) this.instance).hasTlsHandshakeSuccessfulTime();
            }

            public boolean hasTotalTimeMs() {
                return ((FinderFluencyInfo) this.instance).hasTotalTimeMs();
            }

            public boolean hasUiRefreshEndCostMs() {
                return ((FinderFluencyInfo) this.instance).hasUiRefreshEndCostMs();
            }

            public Builder setCgiType(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setCgiType(i);
                return this;
            }

            public Builder setCommentScene(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setCommentScene(i);
                return this;
            }

            public Builder setConnectSuccessfulTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setConnectSuccessfulTime(j);
                return this;
            }

            public Builder setDbOperMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setDbOperMs(i);
                return this;
            }

            public Builder setDebugMessage(C16994k kVar) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setDebugMessage(kVar);
                return this;
            }

            public Builder setDecodeToFirstFrameMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setDecodeToFirstFrameMs(i);
                return this;
            }

            public Builder setDownloadToDecodeMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setDownloadToDecodeMs(i);
                return this;
            }

            public Builder setFinishScene(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setFinishScene(i);
                return this;
            }

            public Builder setGlobalInitMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setGlobalInitMs(i);
                return this;
            }

            public Builder setHot(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setHot(i);
                return this;
            }

            public Builder setLoadingTimeMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setLoadingTimeMs(i);
                return this;
            }

            public Builder setPullCgiMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setPullCgiMs(i);
                return this;
            }

            public Builder setPullType(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setPullType(i);
                return this;
            }

            public Builder setReadPacketFinishedTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setReadPacketFinishedTime(j);
                return this;
            }

            public Builder setScene(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setScene(i);
                return this;
            }

            public Builder setShowUiMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setShowUiMs(i);
                return this;
            }

            public Builder setStartConnectTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setStartConnectTime(j);
                return this;
            }

            public Builder setStartReadPacketTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setStartReadPacketTime(j);
                return this;
            }

            public Builder setStartSendPacketTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setStartSendPacketTime(j);
                return this;
            }

            public Builder setStartTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setStartTime(j);
                return this;
            }

            public Builder setStartTlsHandshakeTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setStartTlsHandshakeTime(j);
                return this;
            }

            public Builder setStatus(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setStatus(i);
                return this;
            }

            public Builder setTlsHandshakeSuccessfulTime(long j) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setTlsHandshakeSuccessfulTime(j);
                return this;
            }

            public Builder setTotalTimeMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setTotalTimeMs(i);
                return this;
            }

            public Builder setUiRefreshEndCostMs(int i) {
                copyOnWrite();
                ((FinderFluencyInfo) this.instance).setUiRefreshEndCostMs(i);
                return this;
            }

            private Builder() {
                super(FinderFluencyInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            FinderFluencyInfo finderFluencyInfo = new FinderFluencyInfo();
            DEFAULT_INSTANCE = finderFluencyInfo;
            C23861l0.registerDefaultInstance(FinderFluencyInfo.class, finderFluencyInfo);
        }

        private FinderFluencyInfo() {
        }

        /* access modifiers changed from: private */
        public void clearCgiType() {
            this.bitField0_ &= -8193;
            this.cgiType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCommentScene() {
            this.bitField0_ &= -2049;
            this.commentScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearConnectSuccessfulTime() {
            this.bitField0_ &= -262145;
            this.connectSuccessfulTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDbOperMs() {
            this.bitField0_ &= -513;
            this.dbOperMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDebugMessage() {
            this.bitField0_ &= -1025;
            this.debugMessage_ = getDefaultInstance().getDebugMessage();
        }

        /* access modifiers changed from: private */
        public void clearDecodeToFirstFrameMs() {
            this.bitField0_ &= -257;
            this.decodeToFirstFrameMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearDownloadToDecodeMs() {
            this.bitField0_ &= -129;
            this.downloadToDecodeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFinishScene() {
            this.bitField0_ &= -9;
            this.finishScene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearGlobalInitMs() {
            this.bitField0_ &= -17;
            this.globalInitMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHot() {
            this.bitField0_ &= -3;
            this.hot_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearLoadingTimeMs() {
            this.bitField0_ &= -32769;
            this.loadingTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPullCgiMs() {
            this.bitField0_ &= -33;
            this.pullCgiMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPullType() {
            this.bitField0_ &= -5;
            this.pullType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearReadPacketFinishedTime() {
            this.bitField0_ &= -8388609;
            this.readPacketFinishedTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearScene() {
            this.bitField0_ &= -2;
            this.scene_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearShowUiMs() {
            this.bitField0_ &= -65;
            this.showUiMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartConnectTime() {
            this.bitField0_ &= -131073;
            this.startConnectTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartReadPacketTime() {
            this.bitField0_ &= -4194305;
            this.startReadPacketTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartSendPacketTime() {
            this.bitField0_ &= -2097153;
            this.startSendPacketTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartTime() {
            this.bitField0_ &= -65537;
            this.startTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStartTlsHandshakeTime() {
            this.bitField0_ &= -524289;
            this.startTlsHandshakeTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearStatus() {
            this.bitField0_ &= -4097;
            this.status_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTlsHandshakeSuccessfulTime() {
            this.bitField0_ &= -1048577;
            this.tlsHandshakeSuccessfulTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTotalTimeMs() {
            this.bitField0_ &= -16385;
            this.totalTimeMs_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUiRefreshEndCostMs() {
            this.bitField0_ &= -16777217;
            this.uiRefreshEndCostMs_ = 0;
        }

        public static FinderFluencyInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static FinderFluencyInfo parseDelimitedFrom(InputStream inputStream) {
            return (FinderFluencyInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderFluencyInfo parseFrom(ByteBuffer byteBuffer) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<FinderFluencyInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCgiType(int i) {
            this.bitField0_ |= 8192;
            this.cgiType_ = i;
        }

        /* access modifiers changed from: private */
        public void setCommentScene(int i) {
            this.bitField0_ |= 2048;
            this.commentScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setConnectSuccessfulTime(long j) {
            this.bitField0_ |= 262144;
            this.connectSuccessfulTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setDbOperMs(int i) {
            this.bitField0_ |= 512;
            this.dbOperMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setDebugMessage(C16994k kVar) {
            kVar.getClass();
            this.bitField0_ |= 1024;
            this.debugMessage_ = kVar;
        }

        /* access modifiers changed from: private */
        public void setDecodeToFirstFrameMs(int i) {
            this.bitField0_ |= 256;
            this.decodeToFirstFrameMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setDownloadToDecodeMs(int i) {
            this.bitField0_ |= 128;
            this.downloadToDecodeMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setFinishScene(int i) {
            this.bitField0_ |= 8;
            this.finishScene_ = i;
        }

        /* access modifiers changed from: private */
        public void setGlobalInitMs(int i) {
            this.bitField0_ |= 16;
            this.globalInitMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setHot(int i) {
            this.bitField0_ |= 2;
            this.hot_ = i;
        }

        /* access modifiers changed from: private */
        public void setLoadingTimeMs(int i) {
            this.bitField0_ |= 32768;
            this.loadingTimeMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setPullCgiMs(int i) {
            this.bitField0_ |= 32;
            this.pullCgiMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setPullType(int i) {
            this.bitField0_ |= 4;
            this.pullType_ = i;
        }

        /* access modifiers changed from: private */
        public void setReadPacketFinishedTime(long j) {
            this.bitField0_ |= 8388608;
            this.readPacketFinishedTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setScene(int i) {
            this.bitField0_ |= 1;
            this.scene_ = i;
        }

        /* access modifiers changed from: private */
        public void setShowUiMs(int i) {
            this.bitField0_ |= 64;
            this.showUiMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setStartConnectTime(long j) {
            this.bitField0_ |= 131072;
            this.startConnectTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setStartReadPacketTime(long j) {
            this.bitField0_ |= 4194304;
            this.startReadPacketTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setStartSendPacketTime(long j) {
            this.bitField0_ |= 2097152;
            this.startSendPacketTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setStartTime(long j) {
            this.bitField0_ |= 65536;
            this.startTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setStartTlsHandshakeTime(long j) {
            this.bitField0_ |= 524288;
            this.startTlsHandshakeTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setStatus(int i) {
            this.bitField0_ |= 4096;
            this.status_ = i;
        }

        /* access modifiers changed from: private */
        public void setTlsHandshakeSuccessfulTime(long j) {
            this.bitField0_ |= 1048576;
            this.tlsHandshakeSuccessfulTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setTotalTimeMs(int i) {
            this.bitField0_ |= 16384;
            this.totalTimeMs_ = i;
        }

        /* access modifiers changed from: private */
        public void setUiRefreshEndCostMs(int i) {
            this.bitField0_ |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            this.uiRefreshEndCostMs_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bည\n\fဋ\u000b\rဋ\f\u000eဋ\r\u000fဋ\u000e\u0010ဋ\u000f\u0011ဃ\u0010\u0012ဃ\u0011\u0013ဃ\u0012\u0014ဃ\u0013\u0015ဃ\u0014\u0016ဃ\u0015\u0017ဃ\u0016\u0018ဃ\u0017\u0019ဋ\u0018", new Object[]{"bitField0_", "scene_", "hot_", "pullType_", "finishScene_", "globalInitMs_", "pullCgiMs_", "showUiMs_", "downloadToDecodeMs_", "decodeToFirstFrameMs_", "dbOperMs_", "debugMessage_", "commentScene_", "status_", "cgiType_", "totalTimeMs_", "loadingTimeMs_", "startTime_", "startConnectTime_", "connectSuccessfulTime_", "startTlsHandshakeTime_", "tlsHandshakeSuccessfulTime_", "startSendPacketTime_", "startReadPacketTime_", "readPacketFinishedTime_", "uiRefreshEndCostMs_"});
                case 3:
                    return new FinderFluencyInfo();
                case 4:
                    return new Builder((C243071) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<FinderFluencyInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (FinderFluencyInfo.class) {
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

        public int getCgiType() {
            return this.cgiType_;
        }

        public int getCommentScene() {
            return this.commentScene_;
        }

        public long getConnectSuccessfulTime() {
            return this.connectSuccessfulTime_;
        }

        public int getDbOperMs() {
            return this.dbOperMs_;
        }

        public C16994k getDebugMessage() {
            return this.debugMessage_;
        }

        public int getDecodeToFirstFrameMs() {
            return this.decodeToFirstFrameMs_;
        }

        public int getDownloadToDecodeMs() {
            return this.downloadToDecodeMs_;
        }

        public int getFinishScene() {
            return this.finishScene_;
        }

        public int getGlobalInitMs() {
            return this.globalInitMs_;
        }

        public int getHot() {
            return this.hot_;
        }

        public int getLoadingTimeMs() {
            return this.loadingTimeMs_;
        }

        public int getPullCgiMs() {
            return this.pullCgiMs_;
        }

        public int getPullType() {
            return this.pullType_;
        }

        public long getReadPacketFinishedTime() {
            return this.readPacketFinishedTime_;
        }

        public int getScene() {
            return this.scene_;
        }

        public int getShowUiMs() {
            return this.showUiMs_;
        }

        public long getStartConnectTime() {
            return this.startConnectTime_;
        }

        public long getStartReadPacketTime() {
            return this.startReadPacketTime_;
        }

        public long getStartSendPacketTime() {
            return this.startSendPacketTime_;
        }

        public long getStartTime() {
            return this.startTime_;
        }

        public long getStartTlsHandshakeTime() {
            return this.startTlsHandshakeTime_;
        }

        public int getStatus() {
            return this.status_;
        }

        public long getTlsHandshakeSuccessfulTime() {
            return this.tlsHandshakeSuccessfulTime_;
        }

        public int getTotalTimeMs() {
            return this.totalTimeMs_;
        }

        public int getUiRefreshEndCostMs() {
            return this.uiRefreshEndCostMs_;
        }

        public boolean hasCgiType() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasCommentScene() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasConnectSuccessfulTime() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasDbOperMs() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasDebugMessage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasDecodeToFirstFrameMs() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDownloadToDecodeMs() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasFinishScene() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasGlobalInitMs() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasHot() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLoadingTimeMs() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasPullCgiMs() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasPullType() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasReadPacketFinishedTime() {
            return (this.bitField0_ & 8388608) != 0;
        }

        public boolean hasScene() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasShowUiMs() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasStartConnectTime() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasStartReadPacketTime() {
            return (this.bitField0_ & 4194304) != 0;
        }

        public boolean hasStartSendPacketTime() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasStartTime() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasStartTlsHandshakeTime() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasStatus() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasTlsHandshakeSuccessfulTime() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasTotalTimeMs() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasUiRefreshEndCostMs() {
            return (this.bitField0_ & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0;
        }

        public static Builder newBuilder(FinderFluencyInfo finderFluencyInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(finderFluencyInfo);
        }

        public static FinderFluencyInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderFluencyInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderFluencyInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static FinderFluencyInfo parseFrom(C16994k kVar) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static FinderFluencyInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static FinderFluencyInfo parseFrom(byte[] bArr) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static FinderFluencyInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static FinderFluencyInfo parseFrom(InputStream inputStream) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static FinderFluencyInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static FinderFluencyInfo parseFrom(C23856l lVar) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static FinderFluencyInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (FinderFluencyInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface FinderFluencyInfoOrBuilder extends C23848k1 {
        int getCgiType();

        int getCommentScene();

        long getConnectSuccessfulTime();

        int getDbOperMs();

        C16994k getDebugMessage();

        int getDecodeToFirstFrameMs();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDownloadToDecodeMs();

        int getFinishScene();

        int getGlobalInitMs();

        int getHot();

        int getLoadingTimeMs();

        int getPullCgiMs();

        int getPullType();

        long getReadPacketFinishedTime();

        int getScene();

        int getShowUiMs();

        long getStartConnectTime();

        long getStartReadPacketTime();

        long getStartSendPacketTime();

        long getStartTime();

        long getStartTlsHandshakeTime();

        int getStatus();

        long getTlsHandshakeSuccessfulTime();

        int getTotalTimeMs();

        int getUiRefreshEndCostMs();

        boolean hasCgiType();

        boolean hasCommentScene();

        boolean hasConnectSuccessfulTime();

        boolean hasDbOperMs();

        boolean hasDebugMessage();

        boolean hasDecodeToFirstFrameMs();

        boolean hasDownloadToDecodeMs();

        boolean hasFinishScene();

        boolean hasGlobalInitMs();

        boolean hasHot();

        boolean hasLoadingTimeMs();

        boolean hasPullCgiMs();

        boolean hasPullType();

        boolean hasReadPacketFinishedTime();

        boolean hasScene();

        boolean hasShowUiMs();

        boolean hasStartConnectTime();

        boolean hasStartReadPacketTime();

        boolean hasStartSendPacketTime();

        boolean hasStartTime();

        boolean hasStartTlsHandshakeTime();

        boolean hasStatus();

        boolean hasTlsHandshakeSuccessfulTime();

        boolean hasTotalTimeMs();

        boolean hasUiRefreshEndCostMs();

        /* synthetic */ boolean isInitialized();
    }

    private FinderProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
