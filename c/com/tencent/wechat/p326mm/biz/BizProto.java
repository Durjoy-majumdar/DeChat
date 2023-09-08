package com.tencent.wechat.p326mm.biz;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24062w1;
import com.tencent.wechat.p326mm.biz.BizCgiProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tencent.wechat.mm.biz.BizProto */
public final class BizProto {

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$1 */
    public static /* synthetic */ class C243781 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69823xa1df5c61;

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
                f69823xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69823xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69823xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69823xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69823xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69823xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69823xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.p326mm.biz.BizProto.C243781.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizDataChangeEventType */
    public enum BizDataChangeEventType implements C23908o0.C23911c {
        eventTypeInsert(1),
        eventTypeDelete(2),
        eventTypeDeleteByUserName(3),
        eventTypeDeleteByUserNameAndSvrId(4),
        eventTypeUpdate(5),
        eventTypeResort(6),
        eventTypeReInit(7);
        
        public static final int eventTypeDeleteByUserNameAndSvrId_VALUE = 4;
        public static final int eventTypeDeleteByUserName_VALUE = 3;
        public static final int eventTypeDelete_VALUE = 2;
        public static final int eventTypeInsert_VALUE = 1;
        public static final int eventTypeReInit_VALUE = 7;
        public static final int eventTypeResort_VALUE = 6;
        public static final int eventTypeUpdate_VALUE = 5;
        private static final C23908o0.C23912d<BizDataChangeEventType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizDataChangeEventType$BizDataChangeEventTypeVerifier */
        public static final class BizDataChangeEventTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new BizDataChangeEventTypeVerifier();
            }

            private BizDataChangeEventTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return BizDataChangeEventType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<BizDataChangeEventType>() {
                public BizDataChangeEventType findValueByNumber(int i) {
                    return BizDataChangeEventType.forNumber(i);
                }
            };
        }

        private BizDataChangeEventType(int i) {
            this.value = i;
        }

        public static BizDataChangeEventType forNumber(int i) {
            switch (i) {
                case 1:
                    return eventTypeInsert;
                case 2:
                    return eventTypeDelete;
                case 3:
                    return eventTypeDeleteByUserName;
                case 4:
                    return eventTypeDeleteByUserNameAndSvrId;
                case 5:
                    return eventTypeUpdate;
                case 6:
                    return eventTypeResort;
                case 7:
                    return eventTypeReInit;
                default:
                    return null;
            }
        }

        public static C23908o0.C23912d<BizDataChangeEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return BizDataChangeEventTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BizDataChangeEventType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizEchoRequest */
    public static final class BizEchoRequest extends C23861l0<BizEchoRequest, Builder> implements BizEchoRequestOrBuilder {
        public static final int BODY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizEchoRequest DEFAULT_INSTANCE;
        private static volatile C24062w1<BizEchoRequest> PARSER;
        private int bitField0_;
        private String body_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizEchoRequest$Builder */
        public static final class Builder extends C23861l0.C23862a<BizEchoRequest, Builder> implements BizEchoRequestOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((BizEchoRequest) this.instance).clearBody();
                return this;
            }

            public String getBody() {
                return ((BizEchoRequest) this.instance).getBody();
            }

            public C16994k getBodyBytes() {
                return ((BizEchoRequest) this.instance).getBodyBytes();
            }

            public boolean hasBody() {
                return ((BizEchoRequest) this.instance).hasBody();
            }

            public Builder setBody(String str) {
                copyOnWrite();
                ((BizEchoRequest) this.instance).setBody(str);
                return this;
            }

            public Builder setBodyBytes(C16994k kVar) {
                copyOnWrite();
                ((BizEchoRequest) this.instance).setBodyBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizEchoRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            BizEchoRequest bizEchoRequest = new BizEchoRequest();
            DEFAULT_INSTANCE = bizEchoRequest;
            C23861l0.registerDefaultInstance(BizEchoRequest.class, bizEchoRequest);
        }

        private BizEchoRequest() {
        }

        /* access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -2;
            this.body_ = getDefaultInstance().getBody();
        }

        public static BizEchoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizEchoRequest parseDelimitedFrom(InputStream inputStream) {
            return (BizEchoRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizEchoRequest parseFrom(ByteBuffer byteBuffer) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizEchoRequest> parser() {
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
                    return new BizEchoRequest();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizEchoRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizEchoRequest.class) {
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

        public static Builder newBuilder(BizEchoRequest bizEchoRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizEchoRequest);
        }

        public static BizEchoRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizEchoRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizEchoRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizEchoRequest parseFrom(C16994k kVar) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizEchoRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizEchoRequest parseFrom(byte[] bArr) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizEchoRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizEchoRequest parseFrom(InputStream inputStream) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizEchoRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizEchoRequest parseFrom(C23856l lVar) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizEchoRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizEchoRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizEchoRequestOrBuilder */
    public interface BizEchoRequestOrBuilder extends C23848k1 {
        String getBody();

        C16994k getBodyBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBody();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizEchoResponse */
    public static final class BizEchoResponse extends C23861l0<BizEchoResponse, Builder> implements BizEchoResponseOrBuilder {
        public static final int BODY_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final BizEchoResponse DEFAULT_INSTANCE;
        private static volatile C24062w1<BizEchoResponse> PARSER;
        private int bitField0_;
        private String body_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizEchoResponse$Builder */
        public static final class Builder extends C23861l0.C23862a<BizEchoResponse, Builder> implements BizEchoResponseOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearBody() {
                copyOnWrite();
                ((BizEchoResponse) this.instance).clearBody();
                return this;
            }

            public String getBody() {
                return ((BizEchoResponse) this.instance).getBody();
            }

            public C16994k getBodyBytes() {
                return ((BizEchoResponse) this.instance).getBodyBytes();
            }

            public boolean hasBody() {
                return ((BizEchoResponse) this.instance).hasBody();
            }

            public Builder setBody(String str) {
                copyOnWrite();
                ((BizEchoResponse) this.instance).setBody(str);
                return this;
            }

            public Builder setBodyBytes(C16994k kVar) {
                copyOnWrite();
                ((BizEchoResponse) this.instance).setBodyBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizEchoResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            BizEchoResponse bizEchoResponse = new BizEchoResponse();
            DEFAULT_INSTANCE = bizEchoResponse;
            C23861l0.registerDefaultInstance(BizEchoResponse.class, bizEchoResponse);
        }

        private BizEchoResponse() {
        }

        /* access modifiers changed from: private */
        public void clearBody() {
            this.bitField0_ &= -2;
            this.body_ = getDefaultInstance().getBody();
        }

        public static BizEchoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizEchoResponse parseDelimitedFrom(InputStream inputStream) {
            return (BizEchoResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizEchoResponse parseFrom(ByteBuffer byteBuffer) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizEchoResponse> parser() {
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
                    return new BizEchoResponse();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizEchoResponse> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizEchoResponse.class) {
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

        public static Builder newBuilder(BizEchoResponse bizEchoResponse) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizEchoResponse);
        }

        public static BizEchoResponse parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizEchoResponse) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizEchoResponse parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizEchoResponse parseFrom(C16994k kVar) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizEchoResponse parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizEchoResponse parseFrom(byte[] bArr) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizEchoResponse parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizEchoResponse parseFrom(InputStream inputStream) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizEchoResponse parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizEchoResponse parseFrom(C23856l lVar) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizEchoResponse parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizEchoResponse) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizEchoResponseOrBuilder */
    public interface BizEchoResponseOrBuilder extends C23848k1 {
        String getBody();

        C16994k getBodyBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean hasBody();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizListSnapshot */
    public static final class BizListSnapshot extends C23861l0<BizListSnapshot, Builder> implements BizListSnapshotOrBuilder {
        public static final int CURRENTCGISESSIONID_FIELD_NUMBER = 2;
        public static final int CURRENTSESSIONID_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final BizListSnapshot DEFAULT_INSTANCE;
        public static final int INFOLIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizListSnapshot> PARSER;
        private int bitField0_;
        private int currentCgiSessionId_;
        private int currentSessionId_;
        private C23908o0.C23919j<BizSnapshotInfo> infoList_ = C23861l0.emptyProtobufList();

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizListSnapshot$Builder */
        public static final class Builder extends C23861l0.C23862a<BizListSnapshot, Builder> implements BizListSnapshotOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder addAllInfoList(Iterable<? extends BizSnapshotInfo> iterable) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).addAllInfoList(iterable);
                return this;
            }

            public Builder addInfoList(BizSnapshotInfo bizSnapshotInfo) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).addInfoList(bizSnapshotInfo);
                return this;
            }

            public Builder clearCurrentCgiSessionId() {
                copyOnWrite();
                ((BizListSnapshot) this.instance).clearCurrentCgiSessionId();
                return this;
            }

            public Builder clearCurrentSessionId() {
                copyOnWrite();
                ((BizListSnapshot) this.instance).clearCurrentSessionId();
                return this;
            }

            public Builder clearInfoList() {
                copyOnWrite();
                ((BizListSnapshot) this.instance).clearInfoList();
                return this;
            }

            public int getCurrentCgiSessionId() {
                return ((BizListSnapshot) this.instance).getCurrentCgiSessionId();
            }

            public int getCurrentSessionId() {
                return ((BizListSnapshot) this.instance).getCurrentSessionId();
            }

            public BizSnapshotInfo getInfoList(int i) {
                return ((BizListSnapshot) this.instance).getInfoList(i);
            }

            public int getInfoListCount() {
                return ((BizListSnapshot) this.instance).getInfoListCount();
            }

            public List<BizSnapshotInfo> getInfoListList() {
                return Collections.unmodifiableList(((BizListSnapshot) this.instance).getInfoListList());
            }

            public boolean hasCurrentCgiSessionId() {
                return ((BizListSnapshot) this.instance).hasCurrentCgiSessionId();
            }

            public boolean hasCurrentSessionId() {
                return ((BizListSnapshot) this.instance).hasCurrentSessionId();
            }

            public Builder removeInfoList(int i) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).removeInfoList(i);
                return this;
            }

            public Builder setCurrentCgiSessionId(int i) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).setCurrentCgiSessionId(i);
                return this;
            }

            public Builder setCurrentSessionId(int i) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).setCurrentSessionId(i);
                return this;
            }

            public Builder setInfoList(int i, BizSnapshotInfo bizSnapshotInfo) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).setInfoList(i, bizSnapshotInfo);
                return this;
            }

            private Builder() {
                super(BizListSnapshot.DEFAULT_INSTANCE);
            }

            public Builder addInfoList(int i, BizSnapshotInfo bizSnapshotInfo) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).addInfoList(i, bizSnapshotInfo);
                return this;
            }

            public Builder setInfoList(int i, BizSnapshotInfo.Builder builder) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).setInfoList(i, (BizSnapshotInfo) builder.build());
                return this;
            }

            public Builder addInfoList(BizSnapshotInfo.Builder builder) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).addInfoList((BizSnapshotInfo) builder.build());
                return this;
            }

            public Builder addInfoList(int i, BizSnapshotInfo.Builder builder) {
                copyOnWrite();
                ((BizListSnapshot) this.instance).addInfoList(i, (BizSnapshotInfo) builder.build());
                return this;
            }
        }

        static {
            BizListSnapshot bizListSnapshot = new BizListSnapshot();
            DEFAULT_INSTANCE = bizListSnapshot;
            C23861l0.registerDefaultInstance(BizListSnapshot.class, bizListSnapshot);
        }

        private BizListSnapshot() {
        }

        /* access modifiers changed from: private */
        public void addAllInfoList(Iterable<? extends BizSnapshotInfo> iterable) {
            ensureInfoListIsMutable();
            C23810b.addAll(iterable, this.infoList_);
        }

        /* access modifiers changed from: private */
        public void addInfoList(BizSnapshotInfo bizSnapshotInfo) {
            bizSnapshotInfo.getClass();
            ensureInfoListIsMutable();
            this.infoList_.add(bizSnapshotInfo);
        }

        /* access modifiers changed from: private */
        public void clearCurrentCgiSessionId() {
            this.bitField0_ &= -2;
            this.currentCgiSessionId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearCurrentSessionId() {
            this.bitField0_ &= -3;
            this.currentSessionId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearInfoList() {
            this.infoList_ = C23861l0.emptyProtobufList();
        }

        private void ensureInfoListIsMutable() {
            C23908o0.C23919j<BizSnapshotInfo> jVar = this.infoList_;
            if (!jVar.mo37523Q()) {
                this.infoList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizListSnapshot getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizListSnapshot parseDelimitedFrom(InputStream inputStream) {
            return (BizListSnapshot) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizListSnapshot parseFrom(ByteBuffer byteBuffer) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizListSnapshot> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeInfoList(int i) {
            ensureInfoListIsMutable();
            this.infoList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setCurrentCgiSessionId(int i) {
            this.bitField0_ |= 1;
            this.currentCgiSessionId_ = i;
        }

        /* access modifiers changed from: private */
        public void setCurrentSessionId(int i) {
            this.bitField0_ |= 2;
            this.currentSessionId_ = i;
        }

        /* access modifiers changed from: private */
        public void setInfoList(int i, BizSnapshotInfo bizSnapshotInfo) {
            bizSnapshotInfo.getClass();
            ensureInfoListIsMutable();
            this.infoList_.set(i, bizSnapshotInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0000\u0003ဋ\u0001", new Object[]{"bitField0_", "infoList_", BizSnapshotInfo.class, "currentCgiSessionId_", "currentSessionId_"});
                case 3:
                    return new BizListSnapshot();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizListSnapshot> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizListSnapshot.class) {
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

        public int getCurrentCgiSessionId() {
            return this.currentCgiSessionId_;
        }

        public int getCurrentSessionId() {
            return this.currentSessionId_;
        }

        public BizSnapshotInfo getInfoList(int i) {
            return this.infoList_.get(i);
        }

        public int getInfoListCount() {
            return this.infoList_.size();
        }

        public List<BizSnapshotInfo> getInfoListList() {
            return this.infoList_;
        }

        public BizSnapshotInfoOrBuilder getInfoListOrBuilder(int i) {
            return this.infoList_.get(i);
        }

        public List<? extends BizSnapshotInfoOrBuilder> getInfoListOrBuilderList() {
            return this.infoList_;
        }

        public boolean hasCurrentCgiSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasCurrentSessionId() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BizListSnapshot bizListSnapshot) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizListSnapshot);
        }

        public static BizListSnapshot parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizListSnapshot) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizListSnapshot parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizListSnapshot parseFrom(C16994k kVar) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addInfoList(int i, BizSnapshotInfo bizSnapshotInfo) {
            bizSnapshotInfo.getClass();
            ensureInfoListIsMutable();
            this.infoList_.add(i, bizSnapshotInfo);
        }

        public static BizListSnapshot parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizListSnapshot parseFrom(byte[] bArr) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizListSnapshot parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizListSnapshot parseFrom(InputStream inputStream) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizListSnapshot parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizListSnapshot parseFrom(C23856l lVar) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizListSnapshot parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizListSnapshot) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizListSnapshotOrBuilder */
    public interface BizListSnapshotOrBuilder extends C23848k1 {
        int getCurrentCgiSessionId();

        int getCurrentSessionId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        BizSnapshotInfo getInfoList(int i);

        int getInfoListCount();

        List<BizSnapshotInfo> getInfoListList();

        boolean hasCurrentCgiSessionId();

        boolean hasCurrentSessionId();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgInfo */
    public static final class BizMsgInfo extends C23861l0<BizMsgInfo, Builder> implements BizMsgInfoOrBuilder {
        public static final int BUFFER_FIELD_NUMBER = 13;
        public static final int CONTENT_FIELD_NUMBER = 2;
        public static final int DATATYPE_FIELD_NUMBER = 15;
        /* access modifiers changed from: private */
        public static final BizMsgInfo DEFAULT_INSTANCE;
        public static final int HASREDDOT_FIELD_NUMBER = 10;
        public static final int ISEXPAND_FIELD_NUMBER = 9;
        public static final int ISNEWMSG_FIELD_NUMBER = 11;
        public static final int ISSHOWBIGCOVER_FIELD_NUMBER = 8;
        public static final int LOCALID_FIELD_NUMBER = 1;
        public static final int MSGSOURCE_FIELD_NUMBER = 17;
        public static final int MSGSTATUS_FIELD_NUMBER = 6;
        public static final int MSGVIEWTYPE_FIELD_NUMBER = 7;
        private static volatile C24062w1<BizMsgInfo> PARSER = null;
        public static final int RANKSESSIONID_FIELD_NUMBER = 12;
        public static final int RECOMMENDREASON_FIELD_NUMBER = 16;
        public static final int SVRID_FIELD_NUMBER = 4;
        public static final int SVRTIME_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 3;
        public static final int XML_FIELD_NUMBER = 14;
        private int bitField0_;
        private String buffer_ = "";
        private BizMsgItemContent content_;
        private int dataType_;
        private boolean hasRedDot_;
        private boolean isExpand_;
        private boolean isNewMsg_;
        private boolean isShowBigCover_;
        private long localId_;
        private String msgSource_ = "";
        private int msgStatus_;
        private int msgViewType_;
        private String rankSessionId_ = "";
        private String recommendReason_ = "";
        private long svrId_;
        private long svrTime_;
        private String userName_ = "";
        private String xml_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgInfo, Builder> implements BizMsgInfoOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearBuffer();
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearContent();
                return this;
            }

            public Builder clearDataType() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearDataType();
                return this;
            }

            public Builder clearHasRedDot() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearHasRedDot();
                return this;
            }

            public Builder clearIsExpand() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearIsExpand();
                return this;
            }

            public Builder clearIsNewMsg() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearIsNewMsg();
                return this;
            }

            public Builder clearIsShowBigCover() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearIsShowBigCover();
                return this;
            }

            public Builder clearLocalId() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearLocalId();
                return this;
            }

            public Builder clearMsgSource() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearMsgSource();
                return this;
            }

            public Builder clearMsgStatus() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearMsgStatus();
                return this;
            }

            public Builder clearMsgViewType() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearMsgViewType();
                return this;
            }

            public Builder clearRankSessionId() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearRankSessionId();
                return this;
            }

            public Builder clearRecommendReason() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearRecommendReason();
                return this;
            }

            public Builder clearSvrId() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearSvrId();
                return this;
            }

            public Builder clearSvrTime() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearSvrTime();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearUserName();
                return this;
            }

            public Builder clearXml() {
                copyOnWrite();
                ((BizMsgInfo) this.instance).clearXml();
                return this;
            }

            public String getBuffer() {
                return ((BizMsgInfo) this.instance).getBuffer();
            }

            public C16994k getBufferBytes() {
                return ((BizMsgInfo) this.instance).getBufferBytes();
            }

            public BizMsgItemContent getContent() {
                return ((BizMsgInfo) this.instance).getContent();
            }

            public int getDataType() {
                return ((BizMsgInfo) this.instance).getDataType();
            }

            public boolean getHasRedDot() {
                return ((BizMsgInfo) this.instance).getHasRedDot();
            }

            public boolean getIsExpand() {
                return ((BizMsgInfo) this.instance).getIsExpand();
            }

            public boolean getIsNewMsg() {
                return ((BizMsgInfo) this.instance).getIsNewMsg();
            }

            public boolean getIsShowBigCover() {
                return ((BizMsgInfo) this.instance).getIsShowBigCover();
            }

            public long getLocalId() {
                return ((BizMsgInfo) this.instance).getLocalId();
            }

            public String getMsgSource() {
                return ((BizMsgInfo) this.instance).getMsgSource();
            }

            public C16994k getMsgSourceBytes() {
                return ((BizMsgInfo) this.instance).getMsgSourceBytes();
            }

            public int getMsgStatus() {
                return ((BizMsgInfo) this.instance).getMsgStatus();
            }

            public int getMsgViewType() {
                return ((BizMsgInfo) this.instance).getMsgViewType();
            }

            public String getRankSessionId() {
                return ((BizMsgInfo) this.instance).getRankSessionId();
            }

            public C16994k getRankSessionIdBytes() {
                return ((BizMsgInfo) this.instance).getRankSessionIdBytes();
            }

            public String getRecommendReason() {
                return ((BizMsgInfo) this.instance).getRecommendReason();
            }

            public C16994k getRecommendReasonBytes() {
                return ((BizMsgInfo) this.instance).getRecommendReasonBytes();
            }

            public long getSvrId() {
                return ((BizMsgInfo) this.instance).getSvrId();
            }

            public long getSvrTime() {
                return ((BizMsgInfo) this.instance).getSvrTime();
            }

            public String getUserName() {
                return ((BizMsgInfo) this.instance).getUserName();
            }

            public C16994k getUserNameBytes() {
                return ((BizMsgInfo) this.instance).getUserNameBytes();
            }

            public String getXml() {
                return ((BizMsgInfo) this.instance).getXml();
            }

            public C16994k getXmlBytes() {
                return ((BizMsgInfo) this.instance).getXmlBytes();
            }

            public boolean hasBuffer() {
                return ((BizMsgInfo) this.instance).hasBuffer();
            }

            public boolean hasContent() {
                return ((BizMsgInfo) this.instance).hasContent();
            }

            public boolean hasDataType() {
                return ((BizMsgInfo) this.instance).hasDataType();
            }

            public boolean hasHasRedDot() {
                return ((BizMsgInfo) this.instance).hasHasRedDot();
            }

            public boolean hasIsExpand() {
                return ((BizMsgInfo) this.instance).hasIsExpand();
            }

            public boolean hasIsNewMsg() {
                return ((BizMsgInfo) this.instance).hasIsNewMsg();
            }

            public boolean hasIsShowBigCover() {
                return ((BizMsgInfo) this.instance).hasIsShowBigCover();
            }

            public boolean hasLocalId() {
                return ((BizMsgInfo) this.instance).hasLocalId();
            }

            public boolean hasMsgSource() {
                return ((BizMsgInfo) this.instance).hasMsgSource();
            }

            public boolean hasMsgStatus() {
                return ((BizMsgInfo) this.instance).hasMsgStatus();
            }

            public boolean hasMsgViewType() {
                return ((BizMsgInfo) this.instance).hasMsgViewType();
            }

            public boolean hasRankSessionId() {
                return ((BizMsgInfo) this.instance).hasRankSessionId();
            }

            public boolean hasRecommendReason() {
                return ((BizMsgInfo) this.instance).hasRecommendReason();
            }

            public boolean hasSvrId() {
                return ((BizMsgInfo) this.instance).hasSvrId();
            }

            public boolean hasSvrTime() {
                return ((BizMsgInfo) this.instance).hasSvrTime();
            }

            public boolean hasUserName() {
                return ((BizMsgInfo) this.instance).hasUserName();
            }

            public boolean hasXml() {
                return ((BizMsgInfo) this.instance).hasXml();
            }

            public Builder mergeContent(BizMsgItemContent bizMsgItemContent) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).mergeContent(bizMsgItemContent);
                return this;
            }

            public Builder setBuffer(String str) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setBuffer(str);
                return this;
            }

            public Builder setBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setBufferBytes(kVar);
                return this;
            }

            public Builder setContent(BizMsgItemContent bizMsgItemContent) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setContent(bizMsgItemContent);
                return this;
            }

            public Builder setDataType(int i) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setDataType(i);
                return this;
            }

            public Builder setHasRedDot(boolean z) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setHasRedDot(z);
                return this;
            }

            public Builder setIsExpand(boolean z) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setIsExpand(z);
                return this;
            }

            public Builder setIsNewMsg(boolean z) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setIsNewMsg(z);
                return this;
            }

            public Builder setIsShowBigCover(boolean z) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setIsShowBigCover(z);
                return this;
            }

            public Builder setLocalId(long j) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setLocalId(j);
                return this;
            }

            public Builder setMsgSource(String str) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setMsgSource(str);
                return this;
            }

            public Builder setMsgSourceBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setMsgSourceBytes(kVar);
                return this;
            }

            public Builder setMsgStatus(int i) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setMsgStatus(i);
                return this;
            }

            public Builder setMsgViewType(int i) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setMsgViewType(i);
                return this;
            }

            public Builder setRankSessionId(String str) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setRankSessionId(str);
                return this;
            }

            public Builder setRankSessionIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setRankSessionIdBytes(kVar);
                return this;
            }

            public Builder setRecommendReason(String str) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setRecommendReason(str);
                return this;
            }

            public Builder setRecommendReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setRecommendReasonBytes(kVar);
                return this;
            }

            public Builder setSvrId(long j) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setSvrId(j);
                return this;
            }

            public Builder setSvrTime(long j) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setSvrTime(j);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setUserNameBytes(kVar);
                return this;
            }

            public Builder setXml(String str) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setXml(str);
                return this;
            }

            public Builder setXmlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setXmlBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizMsgInfo.DEFAULT_INSTANCE);
            }

            public Builder setContent(BizMsgItemContent.Builder builder) {
                copyOnWrite();
                ((BizMsgInfo) this.instance).setContent((BizMsgItemContent) builder.build());
                return this;
            }
        }

        static {
            BizMsgInfo bizMsgInfo = new BizMsgInfo();
            DEFAULT_INSTANCE = bizMsgInfo;
            C23861l0.registerDefaultInstance(BizMsgInfo.class, bizMsgInfo);
        }

        private BizMsgInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -4097;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -3;
        }

        /* access modifiers changed from: private */
        public void clearDataType() {
            this.bitField0_ &= -16385;
            this.dataType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearHasRedDot() {
            this.bitField0_ &= -513;
            this.hasRedDot_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsExpand() {
            this.bitField0_ &= -257;
            this.isExpand_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsNewMsg() {
            this.bitField0_ &= -1025;
            this.isNewMsg_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsShowBigCover() {
            this.bitField0_ &= -129;
            this.isShowBigCover_ = false;
        }

        /* access modifiers changed from: private */
        public void clearLocalId() {
            this.bitField0_ &= -2;
            this.localId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgSource() {
            this.bitField0_ &= -65537;
            this.msgSource_ = getDefaultInstance().getMsgSource();
        }

        /* access modifiers changed from: private */
        public void clearMsgStatus() {
            this.bitField0_ &= -33;
            this.msgStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgViewType() {
            this.bitField0_ &= -65;
            this.msgViewType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRankSessionId() {
            this.bitField0_ &= -2049;
            this.rankSessionId_ = getDefaultInstance().getRankSessionId();
        }

        /* access modifiers changed from: private */
        public void clearRecommendReason() {
            this.bitField0_ &= -32769;
            this.recommendReason_ = getDefaultInstance().getRecommendReason();
        }

        /* access modifiers changed from: private */
        public void clearSvrId() {
            this.bitField0_ &= -9;
            this.svrId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSvrTime() {
            this.bitField0_ &= -17;
            this.svrTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserName() {
            this.bitField0_ &= -5;
            this.userName_ = getDefaultInstance().getUserName();
        }

        /* access modifiers changed from: private */
        public void clearXml() {
            this.bitField0_ &= -8193;
            this.xml_ = getDefaultInstance().getXml();
        }

        public static BizMsgInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeContent(BizMsgItemContent bizMsgItemContent) {
            bizMsgItemContent.getClass();
            BizMsgItemContent bizMsgItemContent2 = this.content_;
            if (bizMsgItemContent2 == null || bizMsgItemContent2 == BizMsgItemContent.getDefaultInstance()) {
                this.content_ = bizMsgItemContent;
            } else {
                this.content_ = (BizMsgItemContent) ((BizMsgItemContent.Builder) BizMsgItemContent.newBuilder(this.content_).mergeFrom(bizMsgItemContent)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgInfo parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgInfo parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.buffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setBufferBytes(C16994k kVar) {
            this.buffer_ = kVar.mo18752u();
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setContent(BizMsgItemContent bizMsgItemContent) {
            bizMsgItemContent.getClass();
            this.content_ = bizMsgItemContent;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setDataType(int i) {
            this.bitField0_ |= 16384;
            this.dataType_ = i;
        }

        /* access modifiers changed from: private */
        public void setHasRedDot(boolean z) {
            this.bitField0_ |= 512;
            this.hasRedDot_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsExpand(boolean z) {
            this.bitField0_ |= 256;
            this.isExpand_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsNewMsg(boolean z) {
            this.bitField0_ |= 1024;
            this.isNewMsg_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsShowBigCover(boolean z) {
            this.bitField0_ |= 128;
            this.isShowBigCover_ = z;
        }

        /* access modifiers changed from: private */
        public void setLocalId(long j) {
            this.bitField0_ |= 1;
            this.localId_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgSource(String str) {
            str.getClass();
            this.bitField0_ |= 65536;
            this.msgSource_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgSourceBytes(C16994k kVar) {
            this.msgSource_ = kVar.mo18752u();
            this.bitField0_ |= 65536;
        }

        /* access modifiers changed from: private */
        public void setMsgStatus(int i) {
            this.bitField0_ |= 32;
            this.msgStatus_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgViewType(int i) {
            this.bitField0_ |= 64;
            this.msgViewType_ = i;
        }

        /* access modifiers changed from: private */
        public void setRankSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.rankSessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setRankSessionIdBytes(C16994k kVar) {
            this.rankSessionId_ = kVar.mo18752u();
            this.bitField0_ |= 2048;
        }

        /* access modifiers changed from: private */
        public void setRecommendReason(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.recommendReason_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecommendReasonBytes(C16994k kVar) {
            this.recommendReason_ = kVar.mo18752u();
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setSvrId(long j) {
            this.bitField0_ |= 8;
            this.svrId_ = j;
        }

        /* access modifiers changed from: private */
        public void setSvrTime(long j) {
            this.bitField0_ |= 16;
            this.svrTime_ = j;
        }

        /* access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.userName_ = str;
        }

        /* access modifiers changed from: private */
        public void setUserNameBytes(C16994k kVar) {
            this.userName_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setXml(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.xml_ = str;
        }

        /* access modifiers changed from: private */
        public void setXmlBytes(C16994k kVar) {
            this.xml_ = kVar.mo18752u();
            this.bitField0_ |= 8192;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဋ\u000e\u0010ဈ\u000f\u0011ဈ\u0010", new Object[]{"bitField0_", "localId_", "content_", "userName_", "svrId_", "svrTime_", "msgStatus_", "msgViewType_", "isShowBigCover_", "isExpand_", "hasRedDot_", "isNewMsg_", "rankSessionId_", "buffer_", "xml_", "dataType_", "recommendReason_", "msgSource_"});
                case 3:
                    return new BizMsgInfo();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgInfo.class) {
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

        public BizMsgItemContent getContent() {
            BizMsgItemContent bizMsgItemContent = this.content_;
            return bizMsgItemContent == null ? BizMsgItemContent.getDefaultInstance() : bizMsgItemContent;
        }

        public int getDataType() {
            return this.dataType_;
        }

        public boolean getHasRedDot() {
            return this.hasRedDot_;
        }

        public boolean getIsExpand() {
            return this.isExpand_;
        }

        public boolean getIsNewMsg() {
            return this.isNewMsg_;
        }

        public boolean getIsShowBigCover() {
            return this.isShowBigCover_;
        }

        public long getLocalId() {
            return this.localId_;
        }

        public String getMsgSource() {
            return this.msgSource_;
        }

        public C16994k getMsgSourceBytes() {
            return C16994k.m16791k(this.msgSource_);
        }

        public int getMsgStatus() {
            return this.msgStatus_;
        }

        public int getMsgViewType() {
            return this.msgViewType_;
        }

        public String getRankSessionId() {
            return this.rankSessionId_;
        }

        public C16994k getRankSessionIdBytes() {
            return C16994k.m16791k(this.rankSessionId_);
        }

        public String getRecommendReason() {
            return this.recommendReason_;
        }

        public C16994k getRecommendReasonBytes() {
            return C16994k.m16791k(this.recommendReason_);
        }

        public long getSvrId() {
            return this.svrId_;
        }

        public long getSvrTime() {
            return this.svrTime_;
        }

        public String getUserName() {
            return this.userName_;
        }

        public C16994k getUserNameBytes() {
            return C16994k.m16791k(this.userName_);
        }

        public String getXml() {
            return this.xml_;
        }

        public C16994k getXmlBytes() {
            return C16994k.m16791k(this.xml_);
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasDataType() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasHasRedDot() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasIsExpand() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasIsNewMsg() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasIsShowBigCover() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasLocalId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMsgSource() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasMsgStatus() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasMsgViewType() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRankSessionId() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasRecommendReason() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasSvrId() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSvrTime() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasUserName() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasXml() {
            return (this.bitField0_ & 8192) != 0;
        }

        public static Builder newBuilder(BizMsgInfo bizMsgInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgInfo);
        }

        public static BizMsgInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgInfo parseFrom(C16994k kVar) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgInfo parseFrom(byte[] bArr) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgInfo parseFrom(InputStream inputStream) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgInfo parseFrom(C23856l lVar) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgInfoList */
    public static final class BizMsgInfoList extends C23861l0<BizMsgInfoList, Builder> implements BizMsgInfoListOrBuilder {
        /* access modifiers changed from: private */
        public static final BizMsgInfoList DEFAULT_INSTANCE;
        public static final int ISDATAEND_FIELD_NUMBER = 2;
        public static final int MSGLIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizMsgInfoList> PARSER;
        private int bitField0_;
        private boolean isDataEnd_;
        private C23908o0.C23919j<BizMsgInfo> msgList_ = C23861l0.emptyProtobufList();

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgInfoList$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgInfoList, Builder> implements BizMsgInfoListOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder addAllMsgList(Iterable<? extends BizMsgInfo> iterable) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).addAllMsgList(iterable);
                return this;
            }

            public Builder addMsgList(BizMsgInfo bizMsgInfo) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).addMsgList(bizMsgInfo);
                return this;
            }

            public Builder clearIsDataEnd() {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).clearIsDataEnd();
                return this;
            }

            public Builder clearMsgList() {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).clearMsgList();
                return this;
            }

            public boolean getIsDataEnd() {
                return ((BizMsgInfoList) this.instance).getIsDataEnd();
            }

            public BizMsgInfo getMsgList(int i) {
                return ((BizMsgInfoList) this.instance).getMsgList(i);
            }

            public int getMsgListCount() {
                return ((BizMsgInfoList) this.instance).getMsgListCount();
            }

            public List<BizMsgInfo> getMsgListList() {
                return Collections.unmodifiableList(((BizMsgInfoList) this.instance).getMsgListList());
            }

            public boolean hasIsDataEnd() {
                return ((BizMsgInfoList) this.instance).hasIsDataEnd();
            }

            public Builder removeMsgList(int i) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).removeMsgList(i);
                return this;
            }

            public Builder setIsDataEnd(boolean z) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).setIsDataEnd(z);
                return this;
            }

            public Builder setMsgList(int i, BizMsgInfo bizMsgInfo) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).setMsgList(i, bizMsgInfo);
                return this;
            }

            private Builder() {
                super(BizMsgInfoList.DEFAULT_INSTANCE);
            }

            public Builder addMsgList(int i, BizMsgInfo bizMsgInfo) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).addMsgList(i, bizMsgInfo);
                return this;
            }

            public Builder setMsgList(int i, BizMsgInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).setMsgList(i, (BizMsgInfo) builder.build());
                return this;
            }

            public Builder addMsgList(BizMsgInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).addMsgList((BizMsgInfo) builder.build());
                return this;
            }

            public Builder addMsgList(int i, BizMsgInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgInfoList) this.instance).addMsgList(i, (BizMsgInfo) builder.build());
                return this;
            }
        }

        static {
            BizMsgInfoList bizMsgInfoList = new BizMsgInfoList();
            DEFAULT_INSTANCE = bizMsgInfoList;
            C23861l0.registerDefaultInstance(BizMsgInfoList.class, bizMsgInfoList);
        }

        private BizMsgInfoList() {
        }

        /* access modifiers changed from: private */
        public void addAllMsgList(Iterable<? extends BizMsgInfo> iterable) {
            ensureMsgListIsMutable();
            C23810b.addAll(iterable, this.msgList_);
        }

        /* access modifiers changed from: private */
        public void addMsgList(BizMsgInfo bizMsgInfo) {
            bizMsgInfo.getClass();
            ensureMsgListIsMutable();
            this.msgList_.add(bizMsgInfo);
        }

        /* access modifiers changed from: private */
        public void clearIsDataEnd() {
            this.bitField0_ &= -2;
            this.isDataEnd_ = false;
        }

        /* access modifiers changed from: private */
        public void clearMsgList() {
            this.msgList_ = C23861l0.emptyProtobufList();
        }

        private void ensureMsgListIsMutable() {
            C23908o0.C23919j<BizMsgInfo> jVar = this.msgList_;
            if (!jVar.mo37523Q()) {
                this.msgList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizMsgInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgInfoList parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgInfoList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgInfoList parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMsgList(int i) {
            ensureMsgListIsMutable();
            this.msgList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setIsDataEnd(boolean z) {
            this.bitField0_ |= 1;
            this.isDataEnd_ = z;
        }

        /* access modifiers changed from: private */
        public void setMsgList(int i, BizMsgInfo bizMsgInfo) {
            bizMsgInfo.getClass();
            ensureMsgListIsMutable();
            this.msgList_.set(i, bizMsgInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"bitField0_", "msgList_", BizMsgInfo.class, "isDataEnd_"});
                case 3:
                    return new BizMsgInfoList();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgInfoList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgInfoList.class) {
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

        public boolean getIsDataEnd() {
            return this.isDataEnd_;
        }

        public BizMsgInfo getMsgList(int i) {
            return this.msgList_.get(i);
        }

        public int getMsgListCount() {
            return this.msgList_.size();
        }

        public List<BizMsgInfo> getMsgListList() {
            return this.msgList_;
        }

        public BizMsgInfoOrBuilder getMsgListOrBuilder(int i) {
            return this.msgList_.get(i);
        }

        public List<? extends BizMsgInfoOrBuilder> getMsgListOrBuilderList() {
            return this.msgList_;
        }

        public boolean hasIsDataEnd() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgInfoList bizMsgInfoList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgInfoList);
        }

        public static BizMsgInfoList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgInfoList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgInfoList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgInfoList parseFrom(C16994k kVar) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addMsgList(int i, BizMsgInfo bizMsgInfo) {
            bizMsgInfo.getClass();
            ensureMsgListIsMutable();
            this.msgList_.add(i, bizMsgInfo);
        }

        public static BizMsgInfoList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgInfoList parseFrom(byte[] bArr) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgInfoList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgInfoList parseFrom(InputStream inputStream) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgInfoList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgInfoList parseFrom(C23856l lVar) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgInfoList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgInfoListOrBuilder */
    public interface BizMsgInfoListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getIsDataEnd();

        BizMsgInfo getMsgList(int i);

        int getMsgListCount();

        List<BizMsgInfo> getMsgListList();

        boolean hasIsDataEnd();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgInfoOrBuilder */
    public interface BizMsgInfoOrBuilder extends C23848k1 {
        String getBuffer();

        C16994k getBufferBytes();

        BizMsgItemContent getContent();

        int getDataType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getHasRedDot();

        boolean getIsExpand();

        boolean getIsNewMsg();

        boolean getIsShowBigCover();

        long getLocalId();

        String getMsgSource();

        C16994k getMsgSourceBytes();

        int getMsgStatus();

        int getMsgViewType();

        String getRankSessionId();

        C16994k getRankSessionIdBytes();

        String getRecommendReason();

        C16994k getRecommendReasonBytes();

        long getSvrId();

        long getSvrTime();

        String getUserName();

        C16994k getUserNameBytes();

        String getXml();

        C16994k getXmlBytes();

        boolean hasBuffer();

        boolean hasContent();

        boolean hasDataType();

        boolean hasHasRedDot();

        boolean hasIsExpand();

        boolean hasIsNewMsg();

        boolean hasIsShowBigCover();

        boolean hasLocalId();

        boolean hasMsgSource();

        boolean hasMsgStatus();

        boolean hasMsgViewType();

        boolean hasRankSessionId();

        boolean hasRecommendReason();

        boolean hasSvrId();

        boolean hasSvrTime();

        boolean hasUserName();

        boolean hasXml();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgItem */
    public static final class BizMsgItem extends C23861l0<BizMsgItem, Builder> implements BizMsgItemOrBuilder {
        public static final int COVER_1_1_FIELD_NUMBER = 5;
        public static final int COVER_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final BizMsgItem DEFAULT_INSTANCE;
        public static final int DIGEST_FIELD_NUMBER = 6;
        public static final int ISPAYSUBSCRIBE_FIELD_NUMBER = 12;
        public static final int ITEMSHOWTYPE_FIELD_NUMBER = 7;
        private static volatile C24062w1<BizMsgItem> PARSER = null;
        public static final int PICNUM_FIELD_NUMBER = 11;
        public static final int PLAYER_FIELD_NUMBER = 10;
        public static final int PLAY_LENGTH_FIELD_NUMBER = 8;
        public static final int PLAY_URL_FIELD_NUMBER = 9;
        public static final int TIME_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 2;
        public static final int VIDEOHEIGHT_FIELD_NUMBER = 15;
        public static final int VIDEOWIDTH_FIELD_NUMBER = 14;
        public static final int VID_FIELD_NUMBER = 13;
        private int bitField0_;
        private String cover11_ = "";
        private String cover_ = "";
        private String digest_ = "";
        private boolean isPaySubscribe_;
        private int itemShowType_;
        private int picNum_;
        private int playLength_;
        private String playUrl_ = "";
        private String player_ = "";
        private long time_;
        private String title_ = "";
        private String url_ = "";
        private String vid_ = "";
        private int videoHeight_;
        private int videoWidth_;

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgItem$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgItem, Builder> implements BizMsgItemOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearCover() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearCover();
                return this;
            }

            public Builder clearCover11() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearCover11();
                return this;
            }

            public Builder clearDigest() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearDigest();
                return this;
            }

            public Builder clearIsPaySubscribe() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearIsPaySubscribe();
                return this;
            }

            public Builder clearItemShowType() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearItemShowType();
                return this;
            }

            public Builder clearPicNum() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearPicNum();
                return this;
            }

            public Builder clearPlayLength() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearPlayLength();
                return this;
            }

            public Builder clearPlayUrl() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearPlayUrl();
                return this;
            }

            public Builder clearPlayer() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearPlayer();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearTime();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearTitle();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearUrl();
                return this;
            }

            public Builder clearVid() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearVid();
                return this;
            }

            public Builder clearVideoHeight() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearVideoHeight();
                return this;
            }

            public Builder clearVideoWidth() {
                copyOnWrite();
                ((BizMsgItem) this.instance).clearVideoWidth();
                return this;
            }

            public String getCover() {
                return ((BizMsgItem) this.instance).getCover();
            }

            public String getCover11() {
                return ((BizMsgItem) this.instance).getCover11();
            }

            public C16994k getCover11Bytes() {
                return ((BizMsgItem) this.instance).getCover11Bytes();
            }

            public C16994k getCoverBytes() {
                return ((BizMsgItem) this.instance).getCoverBytes();
            }

            public String getDigest() {
                return ((BizMsgItem) this.instance).getDigest();
            }

            public C16994k getDigestBytes() {
                return ((BizMsgItem) this.instance).getDigestBytes();
            }

            public boolean getIsPaySubscribe() {
                return ((BizMsgItem) this.instance).getIsPaySubscribe();
            }

            public int getItemShowType() {
                return ((BizMsgItem) this.instance).getItemShowType();
            }

            public int getPicNum() {
                return ((BizMsgItem) this.instance).getPicNum();
            }

            public int getPlayLength() {
                return ((BizMsgItem) this.instance).getPlayLength();
            }

            public String getPlayUrl() {
                return ((BizMsgItem) this.instance).getPlayUrl();
            }

            public C16994k getPlayUrlBytes() {
                return ((BizMsgItem) this.instance).getPlayUrlBytes();
            }

            public String getPlayer() {
                return ((BizMsgItem) this.instance).getPlayer();
            }

            public C16994k getPlayerBytes() {
                return ((BizMsgItem) this.instance).getPlayerBytes();
            }

            public long getTime() {
                return ((BizMsgItem) this.instance).getTime();
            }

            public String getTitle() {
                return ((BizMsgItem) this.instance).getTitle();
            }

            public C16994k getTitleBytes() {
                return ((BizMsgItem) this.instance).getTitleBytes();
            }

            public String getUrl() {
                return ((BizMsgItem) this.instance).getUrl();
            }

            public C16994k getUrlBytes() {
                return ((BizMsgItem) this.instance).getUrlBytes();
            }

            public String getVid() {
                return ((BizMsgItem) this.instance).getVid();
            }

            public C16994k getVidBytes() {
                return ((BizMsgItem) this.instance).getVidBytes();
            }

            public int getVideoHeight() {
                return ((BizMsgItem) this.instance).getVideoHeight();
            }

            public int getVideoWidth() {
                return ((BizMsgItem) this.instance).getVideoWidth();
            }

            public boolean hasCover() {
                return ((BizMsgItem) this.instance).hasCover();
            }

            public boolean hasCover11() {
                return ((BizMsgItem) this.instance).hasCover11();
            }

            public boolean hasDigest() {
                return ((BizMsgItem) this.instance).hasDigest();
            }

            public boolean hasIsPaySubscribe() {
                return ((BizMsgItem) this.instance).hasIsPaySubscribe();
            }

            public boolean hasItemShowType() {
                return ((BizMsgItem) this.instance).hasItemShowType();
            }

            public boolean hasPicNum() {
                return ((BizMsgItem) this.instance).hasPicNum();
            }

            public boolean hasPlayLength() {
                return ((BizMsgItem) this.instance).hasPlayLength();
            }

            public boolean hasPlayUrl() {
                return ((BizMsgItem) this.instance).hasPlayUrl();
            }

            public boolean hasPlayer() {
                return ((BizMsgItem) this.instance).hasPlayer();
            }

            public boolean hasTime() {
                return ((BizMsgItem) this.instance).hasTime();
            }

            public boolean hasTitle() {
                return ((BizMsgItem) this.instance).hasTitle();
            }

            public boolean hasUrl() {
                return ((BizMsgItem) this.instance).hasUrl();
            }

            public boolean hasVid() {
                return ((BizMsgItem) this.instance).hasVid();
            }

            public boolean hasVideoHeight() {
                return ((BizMsgItem) this.instance).hasVideoHeight();
            }

            public boolean hasVideoWidth() {
                return ((BizMsgItem) this.instance).hasVideoWidth();
            }

            public Builder setCover(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setCover(str);
                return this;
            }

            public Builder setCover11(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setCover11(str);
                return this;
            }

            public Builder setCover11Bytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setCover11Bytes(kVar);
                return this;
            }

            public Builder setCoverBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setCoverBytes(kVar);
                return this;
            }

            public Builder setDigest(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setDigest(str);
                return this;
            }

            public Builder setDigestBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setDigestBytes(kVar);
                return this;
            }

            public Builder setIsPaySubscribe(boolean z) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setIsPaySubscribe(z);
                return this;
            }

            public Builder setItemShowType(int i) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setItemShowType(i);
                return this;
            }

            public Builder setPicNum(int i) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setPicNum(i);
                return this;
            }

            public Builder setPlayLength(int i) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setPlayLength(i);
                return this;
            }

            public Builder setPlayUrl(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setPlayUrl(str);
                return this;
            }

            public Builder setPlayUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setPlayUrlBytes(kVar);
                return this;
            }

            public Builder setPlayer(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setPlayer(str);
                return this;
            }

            public Builder setPlayerBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setPlayerBytes(kVar);
                return this;
            }

            public Builder setTime(long j) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setTime(j);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setTitleBytes(kVar);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setUrlBytes(kVar);
                return this;
            }

            public Builder setVid(String str) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setVid(str);
                return this;
            }

            public Builder setVidBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setVidBytes(kVar);
                return this;
            }

            public Builder setVideoHeight(int i) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setVideoHeight(i);
                return this;
            }

            public Builder setVideoWidth(int i) {
                copyOnWrite();
                ((BizMsgItem) this.instance).setVideoWidth(i);
                return this;
            }

            private Builder() {
                super(BizMsgItem.DEFAULT_INSTANCE);
            }
        }

        static {
            BizMsgItem bizMsgItem = new BizMsgItem();
            DEFAULT_INSTANCE = bizMsgItem;
            C23861l0.registerDefaultInstance(BizMsgItem.class, bizMsgItem);
        }

        private BizMsgItem() {
        }

        /* access modifiers changed from: private */
        public void clearCover() {
            this.bitField0_ &= -9;
            this.cover_ = getDefaultInstance().getCover();
        }

        /* access modifiers changed from: private */
        public void clearCover11() {
            this.bitField0_ &= -17;
            this.cover11_ = getDefaultInstance().getCover11();
        }

        /* access modifiers changed from: private */
        public void clearDigest() {
            this.bitField0_ &= -33;
            this.digest_ = getDefaultInstance().getDigest();
        }

        /* access modifiers changed from: private */
        public void clearIsPaySubscribe() {
            this.bitField0_ &= -2049;
            this.isPaySubscribe_ = false;
        }

        /* access modifiers changed from: private */
        public void clearItemShowType() {
            this.bitField0_ &= -65;
            this.itemShowType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPicNum() {
            this.bitField0_ &= -1025;
            this.picNum_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayLength() {
            this.bitField0_ &= -129;
            this.playLength_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearPlayUrl() {
            this.bitField0_ &= -257;
            this.playUrl_ = getDefaultInstance().getPlayUrl();
        }

        /* access modifiers changed from: private */
        public void clearPlayer() {
            this.bitField0_ &= -513;
            this.player_ = getDefaultInstance().getPlayer();
        }

        /* access modifiers changed from: private */
        public void clearTime() {
            this.bitField0_ &= -5;
            this.time_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = getDefaultInstance().getTitle();
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -3;
            this.url_ = getDefaultInstance().getUrl();
        }

        /* access modifiers changed from: private */
        public void clearVid() {
            this.bitField0_ &= -4097;
            this.vid_ = getDefaultInstance().getVid();
        }

        /* access modifiers changed from: private */
        public void clearVideoHeight() {
            this.bitField0_ &= -16385;
            this.videoHeight_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearVideoWidth() {
            this.bitField0_ &= -8193;
            this.videoWidth_ = 0;
        }

        public static BizMsgItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgItem parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgItem parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgItem> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setCover(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.cover_ = str;
        }

        /* access modifiers changed from: private */
        public void setCover11(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.cover11_ = str;
        }

        /* access modifiers changed from: private */
        public void setCover11Bytes(C16994k kVar) {
            this.cover11_ = kVar.mo18752u();
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void setCoverBytes(C16994k kVar) {
            this.cover_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void setDigest(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.digest_ = str;
        }

        /* access modifiers changed from: private */
        public void setDigestBytes(C16994k kVar) {
            this.digest_ = kVar.mo18752u();
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void setIsPaySubscribe(boolean z) {
            this.bitField0_ |= 2048;
            this.isPaySubscribe_ = z;
        }

        /* access modifiers changed from: private */
        public void setItemShowType(int i) {
            this.bitField0_ |= 64;
            this.itemShowType_ = i;
        }

        /* access modifiers changed from: private */
        public void setPicNum(int i) {
            this.bitField0_ |= 1024;
            this.picNum_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayLength(int i) {
            this.bitField0_ |= 128;
            this.playLength_ = i;
        }

        /* access modifiers changed from: private */
        public void setPlayUrl(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.playUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setPlayUrlBytes(C16994k kVar) {
            this.playUrl_ = kVar.mo18752u();
            this.bitField0_ |= 256;
        }

        /* access modifiers changed from: private */
        public void setPlayer(String str) {
            str.getClass();
            this.bitField0_ |= 512;
            this.player_ = str;
        }

        /* access modifiers changed from: private */
        public void setPlayerBytes(C16994k kVar) {
            this.player_ = kVar.mo18752u();
            this.bitField0_ |= 512;
        }

        /* access modifiers changed from: private */
        public void setTime(long j) {
            this.bitField0_ |= 4;
            this.time_ = j;
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

        /* access modifiers changed from: private */
        public void setVid(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.vid_ = str;
        }

        /* access modifiers changed from: private */
        public void setVidBytes(C16994k kVar) {
            this.vid_ = kVar.mo18752u();
            this.bitField0_ |= 4096;
        }

        /* access modifiers changed from: private */
        public void setVideoHeight(int i) {
            this.bitField0_ |= 16384;
            this.videoHeight_ = i;
        }

        /* access modifiers changed from: private */
        public void setVideoWidth(int i) {
            this.bitField0_ |= 8192;
            this.videoWidth_ = i;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဋ\u0006\bဋ\u0007\tဈ\b\nဈ\t\u000bဋ\n\fဇ\u000b\rဈ\f\u000eဋ\r\u000fဋ\u000e", new Object[]{"bitField0_", "title_", "url_", "time_", "cover_", "cover11_", "digest_", "itemShowType_", "playLength_", "playUrl_", "player_", "picNum_", "isPaySubscribe_", "vid_", "videoWidth_", "videoHeight_"});
                case 3:
                    return new BizMsgItem();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgItem> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgItem.class) {
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

        public String getCover() {
            return this.cover_;
        }

        public String getCover11() {
            return this.cover11_;
        }

        public C16994k getCover11Bytes() {
            return C16994k.m16791k(this.cover11_);
        }

        public C16994k getCoverBytes() {
            return C16994k.m16791k(this.cover_);
        }

        public String getDigest() {
            return this.digest_;
        }

        public C16994k getDigestBytes() {
            return C16994k.m16791k(this.digest_);
        }

        public boolean getIsPaySubscribe() {
            return this.isPaySubscribe_;
        }

        public int getItemShowType() {
            return this.itemShowType_;
        }

        public int getPicNum() {
            return this.picNum_;
        }

        public int getPlayLength() {
            return this.playLength_;
        }

        public String getPlayUrl() {
            return this.playUrl_;
        }

        public C16994k getPlayUrlBytes() {
            return C16994k.m16791k(this.playUrl_);
        }

        public String getPlayer() {
            return this.player_;
        }

        public C16994k getPlayerBytes() {
            return C16994k.m16791k(this.player_);
        }

        public long getTime() {
            return this.time_;
        }

        public String getTitle() {
            return this.title_;
        }

        public C16994k getTitleBytes() {
            return C16994k.m16791k(this.title_);
        }

        public String getUrl() {
            return this.url_;
        }

        public C16994k getUrlBytes() {
            return C16994k.m16791k(this.url_);
        }

        public String getVid() {
            return this.vid_;
        }

        public C16994k getVidBytes() {
            return C16994k.m16791k(this.vid_);
        }

        public int getVideoHeight() {
            return this.videoHeight_;
        }

        public int getVideoWidth() {
            return this.videoWidth_;
        }

        public boolean hasCover() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasCover11() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDigest() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasIsPaySubscribe() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasItemShowType() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasPicNum() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasPlayLength() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasPlayUrl() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasPlayer() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasTime() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasVid() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasVideoHeight() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasVideoWidth() {
            return (this.bitField0_ & 8192) != 0;
        }

        public static Builder newBuilder(BizMsgItem bizMsgItem) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgItem);
        }

        public static BizMsgItem parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgItem) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgItem parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgItem parseFrom(C16994k kVar) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgItem parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgItem parseFrom(byte[] bArr) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgItem parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgItem parseFrom(InputStream inputStream) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgItem parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgItem parseFrom(C23856l lVar) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgItem parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgItem) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgItemContent */
    public static final class BizMsgItemContent extends C23861l0<BizMsgItemContent, Builder> implements BizMsgItemContentOrBuilder {
        /* access modifiers changed from: private */
        public static final BizMsgItemContent DEFAULT_INSTANCE;
        public static final int ITEMS_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizMsgItemContent> PARSER = null;
        public static final int VIEWMSGCARD_FIELD_NUMBER = 2;
        private int bitField0_;
        private C23908o0.C23919j<BizMsgItem> items_ = C23861l0.emptyProtobufList();
        private BizCgiProto.ViewMsgCard viewMsgCard_;

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgItemContent$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgItemContent, Builder> implements BizMsgItemContentOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder addAllItems(Iterable<? extends BizMsgItem> iterable) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).addAllItems(iterable);
                return this;
            }

            public Builder addItems(BizMsgItem bizMsgItem) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).addItems(bizMsgItem);
                return this;
            }

            public Builder clearItems() {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).clearItems();
                return this;
            }

            public Builder clearViewMsgCard() {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).clearViewMsgCard();
                return this;
            }

            public BizMsgItem getItems(int i) {
                return ((BizMsgItemContent) this.instance).getItems(i);
            }

            public int getItemsCount() {
                return ((BizMsgItemContent) this.instance).getItemsCount();
            }

            public List<BizMsgItem> getItemsList() {
                return Collections.unmodifiableList(((BizMsgItemContent) this.instance).getItemsList());
            }

            public BizCgiProto.ViewMsgCard getViewMsgCard() {
                return ((BizMsgItemContent) this.instance).getViewMsgCard();
            }

            public boolean hasViewMsgCard() {
                return ((BizMsgItemContent) this.instance).hasViewMsgCard();
            }

            public Builder mergeViewMsgCard(BizCgiProto.ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).mergeViewMsgCard(viewMsgCard);
                return this;
            }

            public Builder removeItems(int i) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).removeItems(i);
                return this;
            }

            public Builder setItems(int i, BizMsgItem bizMsgItem) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).setItems(i, bizMsgItem);
                return this;
            }

            public Builder setViewMsgCard(BizCgiProto.ViewMsgCard viewMsgCard) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).setViewMsgCard(viewMsgCard);
                return this;
            }

            private Builder() {
                super(BizMsgItemContent.DEFAULT_INSTANCE);
            }

            public Builder addItems(int i, BizMsgItem bizMsgItem) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).addItems(i, bizMsgItem);
                return this;
            }

            public Builder setItems(int i, BizMsgItem.Builder builder) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).setItems(i, (BizMsgItem) builder.build());
                return this;
            }

            public Builder setViewMsgCard(BizCgiProto.ViewMsgCard.Builder builder) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).setViewMsgCard((BizCgiProto.ViewMsgCard) builder.build());
                return this;
            }

            public Builder addItems(BizMsgItem.Builder builder) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).addItems((BizMsgItem) builder.build());
                return this;
            }

            public Builder addItems(int i, BizMsgItem.Builder builder) {
                copyOnWrite();
                ((BizMsgItemContent) this.instance).addItems(i, (BizMsgItem) builder.build());
                return this;
            }
        }

        static {
            BizMsgItemContent bizMsgItemContent = new BizMsgItemContent();
            DEFAULT_INSTANCE = bizMsgItemContent;
            C23861l0.registerDefaultInstance(BizMsgItemContent.class, bizMsgItemContent);
        }

        private BizMsgItemContent() {
        }

        /* access modifiers changed from: private */
        public void addAllItems(Iterable<? extends BizMsgItem> iterable) {
            ensureItemsIsMutable();
            C23810b.addAll(iterable, this.items_);
        }

        /* access modifiers changed from: private */
        public void addItems(BizMsgItem bizMsgItem) {
            bizMsgItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(bizMsgItem);
        }

        /* access modifiers changed from: private */
        public void clearItems() {
            this.items_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearViewMsgCard() {
            this.viewMsgCard_ = null;
            this.bitField0_ &= -2;
        }

        private void ensureItemsIsMutable() {
            C23908o0.C23919j<BizMsgItem> jVar = this.items_;
            if (!jVar.mo37523Q()) {
                this.items_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizMsgItemContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeViewMsgCard(BizCgiProto.ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            BizCgiProto.ViewMsgCard viewMsgCard2 = this.viewMsgCard_;
            if (viewMsgCard2 == null || viewMsgCard2 == BizCgiProto.ViewMsgCard.getDefaultInstance()) {
                this.viewMsgCard_ = viewMsgCard;
            } else {
                this.viewMsgCard_ = (BizCgiProto.ViewMsgCard) ((BizCgiProto.ViewMsgCard.Builder) BizCgiProto.ViewMsgCard.newBuilder(this.viewMsgCard_).mergeFrom(viewMsgCard)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgItemContent parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgItemContent) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgItemContent parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgItemContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeItems(int i) {
            ensureItemsIsMutable();
            this.items_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setItems(int i, BizMsgItem bizMsgItem) {
            bizMsgItem.getClass();
            ensureItemsIsMutable();
            this.items_.set(i, bizMsgItem);
        }

        /* access modifiers changed from: private */
        public void setViewMsgCard(BizCgiProto.ViewMsgCard viewMsgCard) {
            viewMsgCard.getClass();
            this.viewMsgCard_ = viewMsgCard;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "items_", BizMsgItem.class, "viewMsgCard_"});
                case 3:
                    return new BizMsgItemContent();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgItemContent> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgItemContent.class) {
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

        public BizMsgItem getItems(int i) {
            return this.items_.get(i);
        }

        public int getItemsCount() {
            return this.items_.size();
        }

        public List<BizMsgItem> getItemsList() {
            return this.items_;
        }

        public BizMsgItemOrBuilder getItemsOrBuilder(int i) {
            return this.items_.get(i);
        }

        public List<? extends BizMsgItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        public BizCgiProto.ViewMsgCard getViewMsgCard() {
            BizCgiProto.ViewMsgCard viewMsgCard = this.viewMsgCard_;
            return viewMsgCard == null ? BizCgiProto.ViewMsgCard.getDefaultInstance() : viewMsgCard;
        }

        public boolean hasViewMsgCard() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgItemContent bizMsgItemContent) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgItemContent);
        }

        public static BizMsgItemContent parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgItemContent) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgItemContent parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgItemContent parseFrom(C16994k kVar) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addItems(int i, BizMsgItem bizMsgItem) {
            bizMsgItem.getClass();
            ensureItemsIsMutable();
            this.items_.add(i, bizMsgItem);
        }

        public static BizMsgItemContent parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgItemContent parseFrom(byte[] bArr) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgItemContent parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgItemContent parseFrom(InputStream inputStream) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgItemContent parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgItemContent parseFrom(C23856l lVar) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgItemContent parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgItemContent) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgItemContentOrBuilder */
    public interface BizMsgItemContentOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        BizMsgItem getItems(int i);

        int getItemsCount();

        List<BizMsgItem> getItemsList();

        BizCgiProto.ViewMsgCard getViewMsgCard();

        boolean hasViewMsgCard();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgItemOrBuilder */
    public interface BizMsgItemOrBuilder extends C23848k1 {
        String getCover();

        String getCover11();

        C16994k getCover11Bytes();

        C16994k getCoverBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getDigest();

        C16994k getDigestBytes();

        boolean getIsPaySubscribe();

        int getItemShowType();

        int getPicNum();

        int getPlayLength();

        String getPlayUrl();

        C16994k getPlayUrlBytes();

        String getPlayer();

        C16994k getPlayerBytes();

        long getTime();

        String getTitle();

        C16994k getTitleBytes();

        String getUrl();

        C16994k getUrlBytes();

        String getVid();

        C16994k getVidBytes();

        int getVideoHeight();

        int getVideoWidth();

        boolean hasCover();

        boolean hasCover11();

        boolean hasDigest();

        boolean hasIsPaySubscribe();

        boolean hasItemShowType();

        boolean hasPicNum();

        boolean hasPlayLength();

        boolean hasPlayUrl();

        boolean hasPlayer();

        boolean hasTime();

        boolean hasTitle();

        boolean hasUrl();

        boolean hasVid();

        boolean hasVideoHeight();

        boolean hasVideoWidth();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgReSortV2CardContext */
    public static final class BizMsgReSortV2CardContext extends C23861l0<BizMsgReSortV2CardContext, Builder> implements BizMsgReSortV2CardContextOrBuilder {
        /* access modifiers changed from: private */
        public static final BizMsgReSortV2CardContext DEFAULT_INSTANCE;
        public static final int DIGEST_EXPOSURE_INFO_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizMsgReSortV2CardContext> PARSER;
        private int bitField0_;
        private BizCgiProto.DigestExposureInfo digestExposureInfo_;

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgReSortV2CardContext$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortV2CardContext, Builder> implements BizMsgReSortV2CardContextOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearDigestExposureInfo() {
                copyOnWrite();
                ((BizMsgReSortV2CardContext) this.instance).clearDigestExposureInfo();
                return this;
            }

            public BizCgiProto.DigestExposureInfo getDigestExposureInfo() {
                return ((BizMsgReSortV2CardContext) this.instance).getDigestExposureInfo();
            }

            public boolean hasDigestExposureInfo() {
                return ((BizMsgReSortV2CardContext) this.instance).hasDigestExposureInfo();
            }

            public Builder mergeDigestExposureInfo(BizCgiProto.DigestExposureInfo digestExposureInfo) {
                copyOnWrite();
                ((BizMsgReSortV2CardContext) this.instance).mergeDigestExposureInfo(digestExposureInfo);
                return this;
            }

            public Builder setDigestExposureInfo(BizCgiProto.DigestExposureInfo digestExposureInfo) {
                copyOnWrite();
                ((BizMsgReSortV2CardContext) this.instance).setDigestExposureInfo(digestExposureInfo);
                return this;
            }

            private Builder() {
                super(BizMsgReSortV2CardContext.DEFAULT_INSTANCE);
            }

            public Builder setDigestExposureInfo(BizCgiProto.DigestExposureInfo.Builder builder) {
                copyOnWrite();
                ((BizMsgReSortV2CardContext) this.instance).setDigestExposureInfo((BizCgiProto.DigestExposureInfo) builder.build());
                return this;
            }
        }

        static {
            BizMsgReSortV2CardContext bizMsgReSortV2CardContext = new BizMsgReSortV2CardContext();
            DEFAULT_INSTANCE = bizMsgReSortV2CardContext;
            C23861l0.registerDefaultInstance(BizMsgReSortV2CardContext.class, bizMsgReSortV2CardContext);
        }

        private BizMsgReSortV2CardContext() {
        }

        /* access modifiers changed from: private */
        public void clearDigestExposureInfo() {
            this.digestExposureInfo_ = null;
            this.bitField0_ &= -2;
        }

        public static BizMsgReSortV2CardContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeDigestExposureInfo(BizCgiProto.DigestExposureInfo digestExposureInfo) {
            digestExposureInfo.getClass();
            BizCgiProto.DigestExposureInfo digestExposureInfo2 = this.digestExposureInfo_;
            if (digestExposureInfo2 == null || digestExposureInfo2 == BizCgiProto.DigestExposureInfo.getDefaultInstance()) {
                this.digestExposureInfo_ = digestExposureInfo;
            } else {
                this.digestExposureInfo_ = (BizCgiProto.DigestExposureInfo) ((BizCgiProto.DigestExposureInfo.Builder) BizCgiProto.DigestExposureInfo.newBuilder(this.digestExposureInfo_).mergeFrom(digestExposureInfo)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortV2CardContext parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortV2CardContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2CardContext parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortV2CardContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setDigestExposureInfo(BizCgiProto.DigestExposureInfo digestExposureInfo) {
            digestExposureInfo.getClass();
            this.digestExposureInfo_ = digestExposureInfo;
            this.bitField0_ |= 1;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "digestExposureInfo_"});
                case 3:
                    return new BizMsgReSortV2CardContext();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortV2CardContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortV2CardContext.class) {
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

        public BizCgiProto.DigestExposureInfo getDigestExposureInfo() {
            BizCgiProto.DigestExposureInfo digestExposureInfo = this.digestExposureInfo_;
            return digestExposureInfo == null ? BizCgiProto.DigestExposureInfo.getDefaultInstance() : digestExposureInfo;
        }

        public boolean hasDigestExposureInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizMsgReSortV2CardContext bizMsgReSortV2CardContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortV2CardContext);
        }

        public static BizMsgReSortV2CardContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2CardContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2CardContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortV2CardContext parseFrom(C16994k kVar) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgReSortV2CardContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortV2CardContext parseFrom(byte[] bArr) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortV2CardContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortV2CardContext parseFrom(InputStream inputStream) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2CardContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2CardContext parseFrom(C23856l lVar) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortV2CardContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortV2CardContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgReSortV2CardContextOrBuilder */
    public interface BizMsgReSortV2CardContextOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        BizCgiProto.DigestExposureInfo getDigestExposureInfo();

        boolean hasDigestExposureInfo();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgReSortV2ReqContext */
    public static final class BizMsgReSortV2ReqContext extends C23861l0<BizMsgReSortV2ReqContext, Builder> implements BizMsgReSortV2ReqContextOrBuilder {
        public static final int BIZUSERNAME_FIELD_NUMBER = 7;
        /* access modifiers changed from: private */
        public static final BizMsgReSortV2ReqContext DEFAULT_INSTANCE;
        public static final int DIGEST_MSG_TYPE_FIELD_NUMBER = 6;
        public static final int IS_HEADSET_ON_FIELD_NUMBER = 5;
        public static final int MSG_BOX_EXPOSE_DIGEST_FIELD_NUMBER = 3;
        public static final int MSG_BOX_EXPOSE_MSG_ID_FIELD_NUMBER = 1;
        public static final int MSG_BOX_EXPOSE_POS_FIELD_NUMBER = 2;
        public static final int NET_TYPE_FIELD_NUMBER = 4;
        private static volatile C24062w1<BizMsgReSortV2ReqContext> PARSER;
        private int bitField0_;
        private String bizusername_ = "";
        private int digestMsgType_;
        private boolean isHeadsetOn_;
        private String msgBoxExposeDigest_ = "";
        private long msgBoxExposeMsgId_;
        private int msgBoxExposePos_;
        private String netType_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgReSortV2ReqContext$Builder */
        public static final class Builder extends C23861l0.C23862a<BizMsgReSortV2ReqContext, Builder> implements BizMsgReSortV2ReqContextOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearBizusername() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearBizusername();
                return this;
            }

            public Builder clearDigestMsgType() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearDigestMsgType();
                return this;
            }

            public Builder clearIsHeadsetOn() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearIsHeadsetOn();
                return this;
            }

            public Builder clearMsgBoxExposeDigest() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearMsgBoxExposeDigest();
                return this;
            }

            public Builder clearMsgBoxExposeMsgId() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearMsgBoxExposeMsgId();
                return this;
            }

            public Builder clearMsgBoxExposePos() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearMsgBoxExposePos();
                return this;
            }

            public Builder clearNetType() {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).clearNetType();
                return this;
            }

            public String getBizusername() {
                return ((BizMsgReSortV2ReqContext) this.instance).getBizusername();
            }

            public C16994k getBizusernameBytes() {
                return ((BizMsgReSortV2ReqContext) this.instance).getBizusernameBytes();
            }

            public int getDigestMsgType() {
                return ((BizMsgReSortV2ReqContext) this.instance).getDigestMsgType();
            }

            public boolean getIsHeadsetOn() {
                return ((BizMsgReSortV2ReqContext) this.instance).getIsHeadsetOn();
            }

            public String getMsgBoxExposeDigest() {
                return ((BizMsgReSortV2ReqContext) this.instance).getMsgBoxExposeDigest();
            }

            public C16994k getMsgBoxExposeDigestBytes() {
                return ((BizMsgReSortV2ReqContext) this.instance).getMsgBoxExposeDigestBytes();
            }

            public long getMsgBoxExposeMsgId() {
                return ((BizMsgReSortV2ReqContext) this.instance).getMsgBoxExposeMsgId();
            }

            public int getMsgBoxExposePos() {
                return ((BizMsgReSortV2ReqContext) this.instance).getMsgBoxExposePos();
            }

            public String getNetType() {
                return ((BizMsgReSortV2ReqContext) this.instance).getNetType();
            }

            public C16994k getNetTypeBytes() {
                return ((BizMsgReSortV2ReqContext) this.instance).getNetTypeBytes();
            }

            public boolean hasBizusername() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasBizusername();
            }

            public boolean hasDigestMsgType() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasDigestMsgType();
            }

            public boolean hasIsHeadsetOn() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasIsHeadsetOn();
            }

            public boolean hasMsgBoxExposeDigest() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasMsgBoxExposeDigest();
            }

            public boolean hasMsgBoxExposeMsgId() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasMsgBoxExposeMsgId();
            }

            public boolean hasMsgBoxExposePos() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasMsgBoxExposePos();
            }

            public boolean hasNetType() {
                return ((BizMsgReSortV2ReqContext) this.instance).hasNetType();
            }

            public Builder setBizusername(String str) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setBizusername(str);
                return this;
            }

            public Builder setBizusernameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setBizusernameBytes(kVar);
                return this;
            }

            public Builder setDigestMsgType(int i) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setDigestMsgType(i);
                return this;
            }

            public Builder setIsHeadsetOn(boolean z) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setIsHeadsetOn(z);
                return this;
            }

            public Builder setMsgBoxExposeDigest(String str) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setMsgBoxExposeDigest(str);
                return this;
            }

            public Builder setMsgBoxExposeDigestBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setMsgBoxExposeDigestBytes(kVar);
                return this;
            }

            public Builder setMsgBoxExposeMsgId(long j) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setMsgBoxExposeMsgId(j);
                return this;
            }

            public Builder setMsgBoxExposePos(int i) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setMsgBoxExposePos(i);
                return this;
            }

            public Builder setNetType(String str) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setNetType(str);
                return this;
            }

            public Builder setNetTypeBytes(C16994k kVar) {
                copyOnWrite();
                ((BizMsgReSortV2ReqContext) this.instance).setNetTypeBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizMsgReSortV2ReqContext.DEFAULT_INSTANCE);
            }
        }

        static {
            BizMsgReSortV2ReqContext bizMsgReSortV2ReqContext = new BizMsgReSortV2ReqContext();
            DEFAULT_INSTANCE = bizMsgReSortV2ReqContext;
            C23861l0.registerDefaultInstance(BizMsgReSortV2ReqContext.class, bizMsgReSortV2ReqContext);
        }

        private BizMsgReSortV2ReqContext() {
        }

        /* access modifiers changed from: private */
        public void clearBizusername() {
            this.bitField0_ &= -65;
            this.bizusername_ = getDefaultInstance().getBizusername();
        }

        /* access modifiers changed from: private */
        public void clearDigestMsgType() {
            this.bitField0_ &= -33;
            this.digestMsgType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearIsHeadsetOn() {
            this.bitField0_ &= -17;
            this.isHeadsetOn_ = false;
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposeDigest() {
            this.bitField0_ &= -5;
            this.msgBoxExposeDigest_ = getDefaultInstance().getMsgBoxExposeDigest();
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposeMsgId() {
            this.bitField0_ &= -2;
            this.msgBoxExposeMsgId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgBoxExposePos() {
            this.bitField0_ &= -3;
            this.msgBoxExposePos_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearNetType() {
            this.bitField0_ &= -9;
            this.netType_ = getDefaultInstance().getNetType();
        }

        public static BizMsgReSortV2ReqContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizMsgReSortV2ReqContext parseDelimitedFrom(InputStream inputStream) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2ReqContext parseFrom(ByteBuffer byteBuffer) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizMsgReSortV2ReqContext> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBizusername(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.bizusername_ = str;
        }

        /* access modifiers changed from: private */
        public void setBizusernameBytes(C16994k kVar) {
            this.bizusername_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setDigestMsgType(int i) {
            this.bitField0_ |= 32;
            this.digestMsgType_ = i;
        }

        /* access modifiers changed from: private */
        public void setIsHeadsetOn(boolean z) {
            this.bitField0_ |= 16;
            this.isHeadsetOn_ = z;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeDigest(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.msgBoxExposeDigest_ = str;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeDigestBytes(C16994k kVar) {
            this.msgBoxExposeDigest_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposeMsgId(long j) {
            this.bitField0_ |= 1;
            this.msgBoxExposeMsgId_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgBoxExposePos(int i) {
            this.bitField0_ |= 2;
            this.msgBoxExposePos_ = i;
        }

        /* access modifiers changed from: private */
        public void setNetType(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.netType_ = str;
        }

        /* access modifiers changed from: private */
        public void setNetTypeBytes(C16994k kVar) {
            this.netType_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဃ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "msgBoxExposeMsgId_", "msgBoxExposePos_", "msgBoxExposeDigest_", "netType_", "isHeadsetOn_", "digestMsgType_", "bizusername_"});
                case 3:
                    return new BizMsgReSortV2ReqContext();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizMsgReSortV2ReqContext> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizMsgReSortV2ReqContext.class) {
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

        public boolean getIsHeadsetOn() {
            return this.isHeadsetOn_;
        }

        public String getMsgBoxExposeDigest() {
            return this.msgBoxExposeDigest_;
        }

        public C16994k getMsgBoxExposeDigestBytes() {
            return C16994k.m16791k(this.msgBoxExposeDigest_);
        }

        public long getMsgBoxExposeMsgId() {
            return this.msgBoxExposeMsgId_;
        }

        public int getMsgBoxExposePos() {
            return this.msgBoxExposePos_;
        }

        public String getNetType() {
            return this.netType_;
        }

        public C16994k getNetTypeBytes() {
            return C16994k.m16791k(this.netType_);
        }

        public boolean hasBizusername() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasDigestMsgType() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasIsHeadsetOn() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasMsgBoxExposeDigest() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasMsgBoxExposeMsgId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMsgBoxExposePos() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNetType() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(BizMsgReSortV2ReqContext bizMsgReSortV2ReqContext) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizMsgReSortV2ReqContext);
        }

        public static BizMsgReSortV2ReqContext parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2ReqContext parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizMsgReSortV2ReqContext parseFrom(C16994k kVar) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizMsgReSortV2ReqContext parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizMsgReSortV2ReqContext parseFrom(byte[] bArr) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizMsgReSortV2ReqContext parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizMsgReSortV2ReqContext parseFrom(InputStream inputStream) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizMsgReSortV2ReqContext parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizMsgReSortV2ReqContext parseFrom(C23856l lVar) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizMsgReSortV2ReqContext parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizMsgReSortV2ReqContext) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizMsgReSortV2ReqContextOrBuilder */
    public interface BizMsgReSortV2ReqContextOrBuilder extends C23848k1 {
        String getBizusername();

        C16994k getBizusernameBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getDigestMsgType();

        boolean getIsHeadsetOn();

        String getMsgBoxExposeDigest();

        C16994k getMsgBoxExposeDigestBytes();

        long getMsgBoxExposeMsgId();

        int getMsgBoxExposePos();

        String getNetType();

        C16994k getNetTypeBytes();

        boolean hasBizusername();

        boolean hasDigestMsgType();

        boolean hasIsHeadsetOn();

        boolean hasMsgBoxExposeDigest();

        boolean hasMsgBoxExposeMsgId();

        boolean hasMsgBoxExposePos();

        boolean hasNetType();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRecDataChangeEventType */
    public enum BizRecDataChangeEventType implements C23908o0.C23911c {
        recEventTypeAdd(1),
        recEventTypeRefresh(2),
        recEventTypeCache(3);
        
        private static final C23908o0.C23912d<BizRecDataChangeEventType> internalValueMap = null;
        public static final int recEventTypeAdd_VALUE = 1;
        public static final int recEventTypeCache_VALUE = 3;
        public static final int recEventTypeRefresh_VALUE = 2;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRecDataChangeEventType$BizRecDataChangeEventTypeVerifier */
        public static final class BizRecDataChangeEventTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new BizRecDataChangeEventTypeVerifier();
            }

            private BizRecDataChangeEventTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return BizRecDataChangeEventType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<BizRecDataChangeEventType>() {
                public BizRecDataChangeEventType findValueByNumber(int i) {
                    return BizRecDataChangeEventType.forNumber(i);
                }
            };
        }

        private BizRecDataChangeEventType(int i) {
            this.value = i;
        }

        public static BizRecDataChangeEventType forNumber(int i) {
            if (i == 1) {
                return recEventTypeAdd;
            }
            if (i == 2) {
                return recEventTypeRefresh;
            }
            if (i != 3) {
                return null;
            }
            return recEventTypeCache;
        }

        public static C23908o0.C23912d<BizRecDataChangeEventType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return BizRecDataChangeEventTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static BizRecDataChangeEventType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRecInfo */
    public static final class BizRecInfo extends C23861l0<BizRecInfo, Builder> implements BizRecInfoOrBuilder {
        /* access modifiers changed from: private */
        public static final BizRecInfo DEFAULT_INSTANCE;
        public static final int MSGLIST_FIELD_NUMBER = 2;
        private static volatile C24062w1<BizRecInfo> PARSER = null;
        public static final int TITLE_FIELD_NUMBER = 1;
        private int bitField0_;
        private C23908o0.C23919j<BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> msgList_ = C23861l0.emptyProtobufList();
        private String title_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRecInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRecInfo, Builder> implements BizRecInfoOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder addAllMsgList(Iterable<? extends BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> iterable) {
                copyOnWrite();
                ((BizRecInfo) this.instance).addAllMsgList(iterable);
                return this;
            }

            public Builder addMsgList(BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg recommendCardMsg) {
                copyOnWrite();
                ((BizRecInfo) this.instance).addMsgList(recommendCardMsg);
                return this;
            }

            public Builder clearMsgList() {
                copyOnWrite();
                ((BizRecInfo) this.instance).clearMsgList();
                return this;
            }

            public Builder clearTitle() {
                copyOnWrite();
                ((BizRecInfo) this.instance).clearTitle();
                return this;
            }

            public BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg getMsgList(int i) {
                return ((BizRecInfo) this.instance).getMsgList(i);
            }

            public int getMsgListCount() {
                return ((BizRecInfo) this.instance).getMsgListCount();
            }

            public List<BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> getMsgListList() {
                return Collections.unmodifiableList(((BizRecInfo) this.instance).getMsgListList());
            }

            public String getTitle() {
                return ((BizRecInfo) this.instance).getTitle();
            }

            public C16994k getTitleBytes() {
                return ((BizRecInfo) this.instance).getTitleBytes();
            }

            public boolean hasTitle() {
                return ((BizRecInfo) this.instance).hasTitle();
            }

            public Builder removeMsgList(int i) {
                copyOnWrite();
                ((BizRecInfo) this.instance).removeMsgList(i);
                return this;
            }

            public Builder setMsgList(int i, BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg recommendCardMsg) {
                copyOnWrite();
                ((BizRecInfo) this.instance).setMsgList(i, recommendCardMsg);
                return this;
            }

            public Builder setTitle(String str) {
                copyOnWrite();
                ((BizRecInfo) this.instance).setTitle(str);
                return this;
            }

            public Builder setTitleBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRecInfo) this.instance).setTitleBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizRecInfo.DEFAULT_INSTANCE);
            }

            public Builder addMsgList(int i, BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg recommendCardMsg) {
                copyOnWrite();
                ((BizRecInfo) this.instance).addMsgList(i, recommendCardMsg);
                return this;
            }

            public Builder setMsgList(int i, BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg.Builder builder) {
                copyOnWrite();
                ((BizRecInfo) this.instance).setMsgList(i, (BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg) builder.build());
                return this;
            }

            public Builder addMsgList(BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg.Builder builder) {
                copyOnWrite();
                ((BizRecInfo) this.instance).addMsgList((BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg) builder.build());
                return this;
            }

            public Builder addMsgList(int i, BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg.Builder builder) {
                copyOnWrite();
                ((BizRecInfo) this.instance).addMsgList(i, (BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg) builder.build());
                return this;
            }
        }

        static {
            BizRecInfo bizRecInfo = new BizRecInfo();
            DEFAULT_INSTANCE = bizRecInfo;
            C23861l0.registerDefaultInstance(BizRecInfo.class, bizRecInfo);
        }

        private BizRecInfo() {
        }

        /* access modifiers changed from: private */
        public void addAllMsgList(Iterable<? extends BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> iterable) {
            ensureMsgListIsMutable();
            C23810b.addAll(iterable, this.msgList_);
        }

        /* access modifiers changed from: private */
        public void addMsgList(BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg recommendCardMsg) {
            recommendCardMsg.getClass();
            ensureMsgListIsMutable();
            this.msgList_.add(recommendCardMsg);
        }

        /* access modifiers changed from: private */
        public void clearMsgList() {
            this.msgList_ = C23861l0.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void clearTitle() {
            this.bitField0_ &= -2;
            this.title_ = getDefaultInstance().getTitle();
        }

        private void ensureMsgListIsMutable() {
            C23908o0.C23919j<BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> jVar = this.msgList_;
            if (!jVar.mo37523Q()) {
                this.msgList_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static BizRecInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRecInfo parseDelimitedFrom(InputStream inputStream) {
            return (BizRecInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecInfo parseFrom(ByteBuffer byteBuffer) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRecInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeMsgList(int i) {
            ensureMsgListIsMutable();
            this.msgList_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setMsgList(int i, BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg recommendCardMsg) {
            recommendCardMsg.getClass();
            ensureMsgListIsMutable();
            this.msgList_.set(i, recommendCardMsg);
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

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "title_", "msgList_", BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg.class});
                case 3:
                    return new BizRecInfo();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRecInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRecInfo.class) {
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

        public BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg getMsgList(int i) {
            return this.msgList_.get(i);
        }

        public int getMsgListCount() {
            return this.msgList_.size();
        }

        public List<BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> getMsgListList() {
            return this.msgList_;
        }

        public BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsgOrBuilder getMsgListOrBuilder(int i) {
            return this.msgList_.get(i);
        }

        public List<? extends BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsgOrBuilder> getMsgListOrBuilderList() {
            return this.msgList_;
        }

        public String getTitle() {
            return this.title_;
        }

        public C16994k getTitleBytes() {
            return C16994k.m16791k(this.title_);
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BizRecInfo bizRecInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRecInfo);
        }

        public static BizRecInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRecInfo parseFrom(C16994k kVar) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addMsgList(int i, BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg recommendCardMsg) {
            recommendCardMsg.getClass();
            ensureMsgListIsMutable();
            this.msgList_.add(i, recommendCardMsg);
        }

        public static BizRecInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRecInfo parseFrom(byte[] bArr) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRecInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRecInfo parseFrom(InputStream inputStream) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRecInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRecInfo parseFrom(C23856l lVar) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRecInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRecInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRecInfoOrBuilder */
    public interface BizRecInfoOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg getMsgList(int i);

        int getMsgListCount();

        List<BizCgiProto.GetRecommendFeedsResponse.RecommendCardMsg> getMsgListList();

        String getTitle();

        C16994k getTitleBytes();

        boolean hasTitle();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRequest */
    public static final class BizRequest extends C23861l0<BizRequest, Builder> implements BizRequestOrBuilder {
        public static final int CONFIG_DIR_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final BizRequest DEFAULT_INSTANCE;
        public static final int FROM_USERNAME_FIELD_NUMBER = 1;
        private static volatile C24062w1<BizRequest> PARSER = null;
        public static final int TO_USERNAME_FIELD_NUMBER = 2;
        private int bitField0_;
        private String configDir_ = "";
        private String fromUsername_ = "";
        private String toUsername_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRequest$Builder */
        public static final class Builder extends C23861l0.C23862a<BizRequest, Builder> implements BizRequestOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearConfigDir() {
                copyOnWrite();
                ((BizRequest) this.instance).clearConfigDir();
                return this;
            }

            public Builder clearFromUsername() {
                copyOnWrite();
                ((BizRequest) this.instance).clearFromUsername();
                return this;
            }

            public Builder clearToUsername() {
                copyOnWrite();
                ((BizRequest) this.instance).clearToUsername();
                return this;
            }

            public String getConfigDir() {
                return ((BizRequest) this.instance).getConfigDir();
            }

            public C16994k getConfigDirBytes() {
                return ((BizRequest) this.instance).getConfigDirBytes();
            }

            public String getFromUsername() {
                return ((BizRequest) this.instance).getFromUsername();
            }

            public C16994k getFromUsernameBytes() {
                return ((BizRequest) this.instance).getFromUsernameBytes();
            }

            public String getToUsername() {
                return ((BizRequest) this.instance).getToUsername();
            }

            public C16994k getToUsernameBytes() {
                return ((BizRequest) this.instance).getToUsernameBytes();
            }

            public boolean hasConfigDir() {
                return ((BizRequest) this.instance).hasConfigDir();
            }

            public boolean hasFromUsername() {
                return ((BizRequest) this.instance).hasFromUsername();
            }

            public boolean hasToUsername() {
                return ((BizRequest) this.instance).hasToUsername();
            }

            public Builder setConfigDir(String str) {
                copyOnWrite();
                ((BizRequest) this.instance).setConfigDir(str);
                return this;
            }

            public Builder setConfigDirBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRequest) this.instance).setConfigDirBytes(kVar);
                return this;
            }

            public Builder setFromUsername(String str) {
                copyOnWrite();
                ((BizRequest) this.instance).setFromUsername(str);
                return this;
            }

            public Builder setFromUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRequest) this.instance).setFromUsernameBytes(kVar);
                return this;
            }

            public Builder setToUsername(String str) {
                copyOnWrite();
                ((BizRequest) this.instance).setToUsername(str);
                return this;
            }

            public Builder setToUsernameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizRequest) this.instance).setToUsernameBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            BizRequest bizRequest = new BizRequest();
            DEFAULT_INSTANCE = bizRequest;
            C23861l0.registerDefaultInstance(BizRequest.class, bizRequest);
        }

        private BizRequest() {
        }

        /* access modifiers changed from: private */
        public void clearConfigDir() {
            this.bitField0_ &= -5;
            this.configDir_ = getDefaultInstance().getConfigDir();
        }

        /* access modifiers changed from: private */
        public void clearFromUsername() {
            this.bitField0_ &= -2;
            this.fromUsername_ = getDefaultInstance().getFromUsername();
        }

        /* access modifiers changed from: private */
        public void clearToUsername() {
            this.bitField0_ &= -3;
            this.toUsername_ = getDefaultInstance().getToUsername();
        }

        public static BizRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizRequest parseDelimitedFrom(InputStream inputStream) {
            return (BizRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRequest parseFrom(ByteBuffer byteBuffer) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setConfigDir(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.configDir_ = str;
        }

        /* access modifiers changed from: private */
        public void setConfigDirBytes(C16994k kVar) {
            this.configDir_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setFromUsername(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.fromUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setFromUsernameBytes(C16994k kVar) {
            this.fromUsername_ = kVar.mo18752u();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setToUsername(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.toUsername_ = str;
        }

        /* access modifiers changed from: private */
        public void setToUsernameBytes(C16994k kVar) {
            this.toUsername_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "fromUsername_", "toUsername_", "configDir_"});
                case 3:
                    return new BizRequest();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizRequest> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizRequest.class) {
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

        public String getConfigDir() {
            return this.configDir_;
        }

        public C16994k getConfigDirBytes() {
            return C16994k.m16791k(this.configDir_);
        }

        public String getFromUsername() {
            return this.fromUsername_;
        }

        public C16994k getFromUsernameBytes() {
            return C16994k.m16791k(this.fromUsername_);
        }

        public String getToUsername() {
            return this.toUsername_;
        }

        public C16994k getToUsernameBytes() {
            return C16994k.m16791k(this.toUsername_);
        }

        public boolean hasConfigDir() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasFromUsername() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasToUsername() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BizRequest bizRequest) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizRequest);
        }

        public static BizRequest parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRequest) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRequest parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizRequest parseFrom(C16994k kVar) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizRequest parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizRequest parseFrom(byte[] bArr) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizRequest parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizRequest parseFrom(InputStream inputStream) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizRequest parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizRequest parseFrom(C23856l lVar) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizRequest parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizRequest) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizRequestOrBuilder */
    public interface BizRequestOrBuilder extends C23848k1 {
        String getConfigDir();

        C16994k getConfigDirBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getFromUsername();

        C16994k getFromUsernameBytes();

        String getToUsername();

        C16994k getToUsernameBytes();

        boolean hasConfigDir();

        boolean hasFromUsername();

        boolean hasToUsername();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizSnapshotInfo */
    public static final class BizSnapshotInfo extends C23861l0<BizSnapshotInfo, Builder> implements BizSnapshotInfoOrBuilder {
        public static final int BIZUIN_FIELD_NUMBER = 7;
        public static final int BUFFER_FIELD_NUMBER = 15;
        public static final int CARDID_FIELD_NUMBER = 2;
        public static final int CGISESSIONID_FIELD_NUMBER = 10;
        /* access modifiers changed from: private */
        public static final BizSnapshotInfo DEFAULT_INSTANCE;
        public static final int FIRSTITEMSHOWTYPE_FIELD_NUMBER = 20;
        public static final int FRAMESETNAME_FIELD_NUMBER = 22;
        public static final int HASREDDOT_FIELD_NUMBER = 13;
        public static final int ISNEWMSG_FIELD_NUMBER = 12;
        public static final int ISPREVIEWMSG_FIELD_NUMBER = 17;
        public static final int ISSHOWBIGCOVER_FIELD_NUMBER = 14;
        public static final int LOCALID_FIELD_NUMBER = 1;
        public static final int MAXIDX_FIELD_NUMBER = 9;
        public static final int MID_FIELD_NUMBER = 8;
        public static final int MSGDETAILTYPE_FIELD_NUMBER = 18;
        public static final int MSGSTATUS_FIELD_NUMBER = 5;
        public static final int MSGVIEWTYPE_FIELD_NUMBER = 4;
        private static volatile C24062w1<BizSnapshotInfo> PARSER = null;
        public static final int RANKSESSIONID_FIELD_NUMBER = 16;
        public static final int RECOMMENDREASON_FIELD_NUMBER = 21;
        public static final int RECYCLECARDTYPE_FIELD_NUMBER = 19;
        public static final int SESSIONID_FIELD_NUMBER = 11;
        public static final int SVRTIME_FIELD_NUMBER = 6;
        public static final int USERNAME_FIELD_NUMBER = 3;
        private int bitField0_;
        private long bizUin_;
        private String buffer_ = "";
        private String cardId_ = "";
        private int cgiSessionId_;
        private int firstItemShowType_;
        private String frameSetName_ = "";
        private boolean hasRedDot_;
        private boolean isNewMsg_;
        private boolean isPreviewMsg_;
        private boolean isShowBigCover_ = true;
        private long localId_;
        private int maxIdx_;
        private long mid_;
        private int msgDetailType_;
        private int msgStatus_;
        private int msgViewType_;
        private String rankSessionId_ = "";
        private String recommendReason_ = "";
        private int recycleCardType_;
        private int sessionId_;
        private int svrTime_;
        private String userName_ = "";

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizSnapshotInfo$Builder */
        public static final class Builder extends C23861l0.C23862a<BizSnapshotInfo, Builder> implements BizSnapshotInfoOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder clearBizUin() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearBizUin();
                return this;
            }

            public Builder clearBuffer() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearBuffer();
                return this;
            }

            public Builder clearCardId() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearCardId();
                return this;
            }

            public Builder clearCgiSessionId() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearCgiSessionId();
                return this;
            }

            public Builder clearFirstItemShowType() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearFirstItemShowType();
                return this;
            }

            public Builder clearFrameSetName() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearFrameSetName();
                return this;
            }

            public Builder clearHasRedDot() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearHasRedDot();
                return this;
            }

            public Builder clearIsNewMsg() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearIsNewMsg();
                return this;
            }

            public Builder clearIsPreviewMsg() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearIsPreviewMsg();
                return this;
            }

            public Builder clearIsShowBigCover() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearIsShowBigCover();
                return this;
            }

            public Builder clearLocalId() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearLocalId();
                return this;
            }

            public Builder clearMaxIdx() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearMaxIdx();
                return this;
            }

            public Builder clearMid() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearMid();
                return this;
            }

            public Builder clearMsgDetailType() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearMsgDetailType();
                return this;
            }

            public Builder clearMsgStatus() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearMsgStatus();
                return this;
            }

            public Builder clearMsgViewType() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearMsgViewType();
                return this;
            }

            public Builder clearRankSessionId() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearRankSessionId();
                return this;
            }

            public Builder clearRecommendReason() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearRecommendReason();
                return this;
            }

            public Builder clearRecycleCardType() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearRecycleCardType();
                return this;
            }

            public Builder clearSessionId() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearSessionId();
                return this;
            }

            public Builder clearSvrTime() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearSvrTime();
                return this;
            }

            public Builder clearUserName() {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).clearUserName();
                return this;
            }

            public long getBizUin() {
                return ((BizSnapshotInfo) this.instance).getBizUin();
            }

            public String getBuffer() {
                return ((BizSnapshotInfo) this.instance).getBuffer();
            }

            public C16994k getBufferBytes() {
                return ((BizSnapshotInfo) this.instance).getBufferBytes();
            }

            public String getCardId() {
                return ((BizSnapshotInfo) this.instance).getCardId();
            }

            public C16994k getCardIdBytes() {
                return ((BizSnapshotInfo) this.instance).getCardIdBytes();
            }

            public int getCgiSessionId() {
                return ((BizSnapshotInfo) this.instance).getCgiSessionId();
            }

            public int getFirstItemShowType() {
                return ((BizSnapshotInfo) this.instance).getFirstItemShowType();
            }

            public String getFrameSetName() {
                return ((BizSnapshotInfo) this.instance).getFrameSetName();
            }

            public C16994k getFrameSetNameBytes() {
                return ((BizSnapshotInfo) this.instance).getFrameSetNameBytes();
            }

            public boolean getHasRedDot() {
                return ((BizSnapshotInfo) this.instance).getHasRedDot();
            }

            public boolean getIsNewMsg() {
                return ((BizSnapshotInfo) this.instance).getIsNewMsg();
            }

            public boolean getIsPreviewMsg() {
                return ((BizSnapshotInfo) this.instance).getIsPreviewMsg();
            }

            public boolean getIsShowBigCover() {
                return ((BizSnapshotInfo) this.instance).getIsShowBigCover();
            }

            public long getLocalId() {
                return ((BizSnapshotInfo) this.instance).getLocalId();
            }

            public int getMaxIdx() {
                return ((BizSnapshotInfo) this.instance).getMaxIdx();
            }

            public long getMid() {
                return ((BizSnapshotInfo) this.instance).getMid();
            }

            public int getMsgDetailType() {
                return ((BizSnapshotInfo) this.instance).getMsgDetailType();
            }

            public int getMsgStatus() {
                return ((BizSnapshotInfo) this.instance).getMsgStatus();
            }

            public int getMsgViewType() {
                return ((BizSnapshotInfo) this.instance).getMsgViewType();
            }

            public String getRankSessionId() {
                return ((BizSnapshotInfo) this.instance).getRankSessionId();
            }

            public C16994k getRankSessionIdBytes() {
                return ((BizSnapshotInfo) this.instance).getRankSessionIdBytes();
            }

            public String getRecommendReason() {
                return ((BizSnapshotInfo) this.instance).getRecommendReason();
            }

            public C16994k getRecommendReasonBytes() {
                return ((BizSnapshotInfo) this.instance).getRecommendReasonBytes();
            }

            public int getRecycleCardType() {
                return ((BizSnapshotInfo) this.instance).getRecycleCardType();
            }

            public int getSessionId() {
                return ((BizSnapshotInfo) this.instance).getSessionId();
            }

            public int getSvrTime() {
                return ((BizSnapshotInfo) this.instance).getSvrTime();
            }

            public String getUserName() {
                return ((BizSnapshotInfo) this.instance).getUserName();
            }

            public C16994k getUserNameBytes() {
                return ((BizSnapshotInfo) this.instance).getUserNameBytes();
            }

            public boolean hasBizUin() {
                return ((BizSnapshotInfo) this.instance).hasBizUin();
            }

            public boolean hasBuffer() {
                return ((BizSnapshotInfo) this.instance).hasBuffer();
            }

            public boolean hasCardId() {
                return ((BizSnapshotInfo) this.instance).hasCardId();
            }

            public boolean hasCgiSessionId() {
                return ((BizSnapshotInfo) this.instance).hasCgiSessionId();
            }

            public boolean hasFirstItemShowType() {
                return ((BizSnapshotInfo) this.instance).hasFirstItemShowType();
            }

            public boolean hasFrameSetName() {
                return ((BizSnapshotInfo) this.instance).hasFrameSetName();
            }

            public boolean hasHasRedDot() {
                return ((BizSnapshotInfo) this.instance).hasHasRedDot();
            }

            public boolean hasIsNewMsg() {
                return ((BizSnapshotInfo) this.instance).hasIsNewMsg();
            }

            public boolean hasIsPreviewMsg() {
                return ((BizSnapshotInfo) this.instance).hasIsPreviewMsg();
            }

            public boolean hasIsShowBigCover() {
                return ((BizSnapshotInfo) this.instance).hasIsShowBigCover();
            }

            public boolean hasLocalId() {
                return ((BizSnapshotInfo) this.instance).hasLocalId();
            }

            public boolean hasMaxIdx() {
                return ((BizSnapshotInfo) this.instance).hasMaxIdx();
            }

            public boolean hasMid() {
                return ((BizSnapshotInfo) this.instance).hasMid();
            }

            public boolean hasMsgDetailType() {
                return ((BizSnapshotInfo) this.instance).hasMsgDetailType();
            }

            public boolean hasMsgStatus() {
                return ((BizSnapshotInfo) this.instance).hasMsgStatus();
            }

            public boolean hasMsgViewType() {
                return ((BizSnapshotInfo) this.instance).hasMsgViewType();
            }

            public boolean hasRankSessionId() {
                return ((BizSnapshotInfo) this.instance).hasRankSessionId();
            }

            public boolean hasRecommendReason() {
                return ((BizSnapshotInfo) this.instance).hasRecommendReason();
            }

            public boolean hasRecycleCardType() {
                return ((BizSnapshotInfo) this.instance).hasRecycleCardType();
            }

            public boolean hasSessionId() {
                return ((BizSnapshotInfo) this.instance).hasSessionId();
            }

            public boolean hasSvrTime() {
                return ((BizSnapshotInfo) this.instance).hasSvrTime();
            }

            public boolean hasUserName() {
                return ((BizSnapshotInfo) this.instance).hasUserName();
            }

            public Builder setBizUin(long j) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setBizUin(j);
                return this;
            }

            public Builder setBuffer(String str) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setBuffer(str);
                return this;
            }

            public Builder setBufferBytes(C16994k kVar) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setBufferBytes(kVar);
                return this;
            }

            public Builder setCardId(String str) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setCardId(str);
                return this;
            }

            public Builder setCardIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setCardIdBytes(kVar);
                return this;
            }

            public Builder setCgiSessionId(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setCgiSessionId(i);
                return this;
            }

            public Builder setFirstItemShowType(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setFirstItemShowType(i);
                return this;
            }

            public Builder setFrameSetName(String str) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setFrameSetName(str);
                return this;
            }

            public Builder setFrameSetNameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setFrameSetNameBytes(kVar);
                return this;
            }

            public Builder setHasRedDot(boolean z) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setHasRedDot(z);
                return this;
            }

            public Builder setIsNewMsg(boolean z) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setIsNewMsg(z);
                return this;
            }

            public Builder setIsPreviewMsg(boolean z) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setIsPreviewMsg(z);
                return this;
            }

            public Builder setIsShowBigCover(boolean z) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setIsShowBigCover(z);
                return this;
            }

            public Builder setLocalId(long j) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setLocalId(j);
                return this;
            }

            public Builder setMaxIdx(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setMaxIdx(i);
                return this;
            }

            public Builder setMid(long j) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setMid(j);
                return this;
            }

            public Builder setMsgDetailType(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setMsgDetailType(i);
                return this;
            }

            public Builder setMsgStatus(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setMsgStatus(i);
                return this;
            }

            public Builder setMsgViewType(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setMsgViewType(i);
                return this;
            }

            public Builder setRankSessionId(String str) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setRankSessionId(str);
                return this;
            }

            public Builder setRankSessionIdBytes(C16994k kVar) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setRankSessionIdBytes(kVar);
                return this;
            }

            public Builder setRecommendReason(String str) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setRecommendReason(str);
                return this;
            }

            public Builder setRecommendReasonBytes(C16994k kVar) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setRecommendReasonBytes(kVar);
                return this;
            }

            public Builder setRecycleCardType(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setRecycleCardType(i);
                return this;
            }

            public Builder setSessionId(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setSessionId(i);
                return this;
            }

            public Builder setSvrTime(int i) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setSvrTime(i);
                return this;
            }

            public Builder setUserName(String str) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setUserName(str);
                return this;
            }

            public Builder setUserNameBytes(C16994k kVar) {
                copyOnWrite();
                ((BizSnapshotInfo) this.instance).setUserNameBytes(kVar);
                return this;
            }

            private Builder() {
                super(BizSnapshotInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            BizSnapshotInfo bizSnapshotInfo = new BizSnapshotInfo();
            DEFAULT_INSTANCE = bizSnapshotInfo;
            C23861l0.registerDefaultInstance(BizSnapshotInfo.class, bizSnapshotInfo);
        }

        private BizSnapshotInfo() {
        }

        /* access modifiers changed from: private */
        public void clearBizUin() {
            this.bitField0_ &= -65;
            this.bizUin_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearBuffer() {
            this.bitField0_ &= -16385;
            this.buffer_ = getDefaultInstance().getBuffer();
        }

        /* access modifiers changed from: private */
        public void clearCardId() {
            this.bitField0_ &= -3;
            this.cardId_ = getDefaultInstance().getCardId();
        }

        /* access modifiers changed from: private */
        public void clearCgiSessionId() {
            this.bitField0_ &= -513;
            this.cgiSessionId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFirstItemShowType() {
            this.bitField0_ &= -524289;
            this.firstItemShowType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearFrameSetName() {
            this.bitField0_ &= -2097153;
            this.frameSetName_ = getDefaultInstance().getFrameSetName();
        }

        /* access modifiers changed from: private */
        public void clearHasRedDot() {
            this.bitField0_ &= -4097;
            this.hasRedDot_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsNewMsg() {
            this.bitField0_ &= -2049;
            this.isNewMsg_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsPreviewMsg() {
            this.bitField0_ &= -65537;
            this.isPreviewMsg_ = false;
        }

        /* access modifiers changed from: private */
        public void clearIsShowBigCover() {
            this.bitField0_ &= -8193;
            this.isShowBigCover_ = true;
        }

        /* access modifiers changed from: private */
        public void clearLocalId() {
            this.bitField0_ &= -2;
            this.localId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMaxIdx() {
            this.bitField0_ &= -257;
            this.maxIdx_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMid() {
            this.bitField0_ &= -129;
            this.mid_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgDetailType() {
            this.bitField0_ &= -131073;
            this.msgDetailType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgStatus() {
            this.bitField0_ &= -17;
            this.msgStatus_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearMsgViewType() {
            this.bitField0_ &= -9;
            this.msgViewType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearRankSessionId() {
            this.bitField0_ &= -32769;
            this.rankSessionId_ = getDefaultInstance().getRankSessionId();
        }

        /* access modifiers changed from: private */
        public void clearRecommendReason() {
            this.bitField0_ &= -1048577;
            this.recommendReason_ = getDefaultInstance().getRecommendReason();
        }

        /* access modifiers changed from: private */
        public void clearRecycleCardType() {
            this.bitField0_ &= -262145;
            this.recycleCardType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSessionId() {
            this.bitField0_ &= -1025;
            this.sessionId_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearSvrTime() {
            this.bitField0_ &= -33;
            this.svrTime_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUserName() {
            this.bitField0_ &= -5;
            this.userName_ = getDefaultInstance().getUserName();
        }

        public static BizSnapshotInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static BizSnapshotInfo parseDelimitedFrom(InputStream inputStream) {
            return (BizSnapshotInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizSnapshotInfo parseFrom(ByteBuffer byteBuffer) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<BizSnapshotInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setBizUin(long j) {
            this.bitField0_ |= 64;
            this.bizUin_ = j;
        }

        /* access modifiers changed from: private */
        public void setBuffer(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.buffer_ = str;
        }

        /* access modifiers changed from: private */
        public void setBufferBytes(C16994k kVar) {
            this.buffer_ = kVar.mo18752u();
            this.bitField0_ |= 16384;
        }

        /* access modifiers changed from: private */
        public void setCardId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.cardId_ = str;
        }

        /* access modifiers changed from: private */
        public void setCardIdBytes(C16994k kVar) {
            this.cardId_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setCgiSessionId(int i) {
            this.bitField0_ |= 512;
            this.cgiSessionId_ = i;
        }

        /* access modifiers changed from: private */
        public void setFirstItemShowType(int i) {
            this.bitField0_ |= 524288;
            this.firstItemShowType_ = i;
        }

        /* access modifiers changed from: private */
        public void setFrameSetName(String str) {
            str.getClass();
            this.bitField0_ |= 2097152;
            this.frameSetName_ = str;
        }

        /* access modifiers changed from: private */
        public void setFrameSetNameBytes(C16994k kVar) {
            this.frameSetName_ = kVar.mo18752u();
            this.bitField0_ |= 2097152;
        }

        /* access modifiers changed from: private */
        public void setHasRedDot(boolean z) {
            this.bitField0_ |= 4096;
            this.hasRedDot_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsNewMsg(boolean z) {
            this.bitField0_ |= 2048;
            this.isNewMsg_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsPreviewMsg(boolean z) {
            this.bitField0_ |= 65536;
            this.isPreviewMsg_ = z;
        }

        /* access modifiers changed from: private */
        public void setIsShowBigCover(boolean z) {
            this.bitField0_ |= 8192;
            this.isShowBigCover_ = z;
        }

        /* access modifiers changed from: private */
        public void setLocalId(long j) {
            this.bitField0_ |= 1;
            this.localId_ = j;
        }

        /* access modifiers changed from: private */
        public void setMaxIdx(int i) {
            this.bitField0_ |= 256;
            this.maxIdx_ = i;
        }

        /* access modifiers changed from: private */
        public void setMid(long j) {
            this.bitField0_ |= 128;
            this.mid_ = j;
        }

        /* access modifiers changed from: private */
        public void setMsgDetailType(int i) {
            this.bitField0_ |= 131072;
            this.msgDetailType_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgStatus(int i) {
            this.bitField0_ |= 16;
            this.msgStatus_ = i;
        }

        /* access modifiers changed from: private */
        public void setMsgViewType(int i) {
            this.bitField0_ |= 8;
            this.msgViewType_ = i;
        }

        /* access modifiers changed from: private */
        public void setRankSessionId(String str) {
            str.getClass();
            this.bitField0_ |= 32768;
            this.rankSessionId_ = str;
        }

        /* access modifiers changed from: private */
        public void setRankSessionIdBytes(C16994k kVar) {
            this.rankSessionId_ = kVar.mo18752u();
            this.bitField0_ |= 32768;
        }

        /* access modifiers changed from: private */
        public void setRecommendReason(String str) {
            str.getClass();
            this.bitField0_ |= 1048576;
            this.recommendReason_ = str;
        }

        /* access modifiers changed from: private */
        public void setRecommendReasonBytes(C16994k kVar) {
            this.recommendReason_ = kVar.mo18752u();
            this.bitField0_ |= 1048576;
        }

        /* access modifiers changed from: private */
        public void setRecycleCardType(int i) {
            this.bitField0_ |= 262144;
            this.recycleCardType_ = i;
        }

        /* access modifiers changed from: private */
        public void setSessionId(int i) {
            this.bitField0_ |= 1024;
            this.sessionId_ = i;
        }

        /* access modifiers changed from: private */
        public void setSvrTime(int i) {
            this.bitField0_ |= 32;
            this.svrTime_ = i;
        }

        /* access modifiers changed from: private */
        public void setUserName(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.userName_ = str;
        }

        /* access modifiers changed from: private */
        public void setUserNameBytes(C16994k kVar) {
            this.userName_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဃ\u0006\bဃ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဇ\u0010\u0012ဋ\u0011\u0013ဋ\u0012\u0014ဋ\u0013\u0015ဈ\u0014\u0016ဈ\u0015", new Object[]{"bitField0_", "localId_", "cardId_", "userName_", "msgViewType_", "msgStatus_", "svrTime_", "bizUin_", "mid_", "maxIdx_", "cgiSessionId_", "sessionId_", "isNewMsg_", "hasRedDot_", "isShowBigCover_", "buffer_", "rankSessionId_", "isPreviewMsg_", "msgDetailType_", "recycleCardType_", "firstItemShowType_", "recommendReason_", "frameSetName_"});
                case 3:
                    return new BizSnapshotInfo();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<BizSnapshotInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (BizSnapshotInfo.class) {
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

        public long getBizUin() {
            return this.bizUin_;
        }

        public String getBuffer() {
            return this.buffer_;
        }

        public C16994k getBufferBytes() {
            return C16994k.m16791k(this.buffer_);
        }

        public String getCardId() {
            return this.cardId_;
        }

        public C16994k getCardIdBytes() {
            return C16994k.m16791k(this.cardId_);
        }

        public int getCgiSessionId() {
            return this.cgiSessionId_;
        }

        public int getFirstItemShowType() {
            return this.firstItemShowType_;
        }

        public String getFrameSetName() {
            return this.frameSetName_;
        }

        public C16994k getFrameSetNameBytes() {
            return C16994k.m16791k(this.frameSetName_);
        }

        public boolean getHasRedDot() {
            return this.hasRedDot_;
        }

        public boolean getIsNewMsg() {
            return this.isNewMsg_;
        }

        public boolean getIsPreviewMsg() {
            return this.isPreviewMsg_;
        }

        public boolean getIsShowBigCover() {
            return this.isShowBigCover_;
        }

        public long getLocalId() {
            return this.localId_;
        }

        public int getMaxIdx() {
            return this.maxIdx_;
        }

        public long getMid() {
            return this.mid_;
        }

        public int getMsgDetailType() {
            return this.msgDetailType_;
        }

        public int getMsgStatus() {
            return this.msgStatus_;
        }

        public int getMsgViewType() {
            return this.msgViewType_;
        }

        public String getRankSessionId() {
            return this.rankSessionId_;
        }

        public C16994k getRankSessionIdBytes() {
            return C16994k.m16791k(this.rankSessionId_);
        }

        public String getRecommendReason() {
            return this.recommendReason_;
        }

        public C16994k getRecommendReasonBytes() {
            return C16994k.m16791k(this.recommendReason_);
        }

        public int getRecycleCardType() {
            return this.recycleCardType_;
        }

        public int getSessionId() {
            return this.sessionId_;
        }

        public int getSvrTime() {
            return this.svrTime_;
        }

        public String getUserName() {
            return this.userName_;
        }

        public C16994k getUserNameBytes() {
            return C16994k.m16791k(this.userName_);
        }

        public boolean hasBizUin() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasBuffer() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasCardId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCgiSessionId() {
            return (this.bitField0_ & 512) != 0;
        }

        public boolean hasFirstItemShowType() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasFrameSetName() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasHasRedDot() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasIsNewMsg() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasIsPreviewMsg() {
            return (this.bitField0_ & 65536) != 0;
        }

        public boolean hasIsShowBigCover() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasLocalId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMaxIdx() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasMid() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasMsgDetailType() {
            return (this.bitField0_ & 131072) != 0;
        }

        public boolean hasMsgStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasMsgViewType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRankSessionId() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasRecommendReason() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasRecycleCardType() {
            return (this.bitField0_ & 262144) != 0;
        }

        public boolean hasSessionId() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasSvrTime() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasUserName() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(BizSnapshotInfo bizSnapshotInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(bizSnapshotInfo);
        }

        public static BizSnapshotInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizSnapshotInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizSnapshotInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static BizSnapshotInfo parseFrom(C16994k kVar) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static BizSnapshotInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static BizSnapshotInfo parseFrom(byte[] bArr) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BizSnapshotInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static BizSnapshotInfo parseFrom(InputStream inputStream) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BizSnapshotInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static BizSnapshotInfo parseFrom(C23856l lVar) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static BizSnapshotInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (BizSnapshotInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$BizSnapshotInfoOrBuilder */
    public interface BizSnapshotInfoOrBuilder extends C23848k1 {
        long getBizUin();

        String getBuffer();

        C16994k getBufferBytes();

        String getCardId();

        C16994k getCardIdBytes();

        int getCgiSessionId();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        int getFirstItemShowType();

        String getFrameSetName();

        C16994k getFrameSetNameBytes();

        boolean getHasRedDot();

        boolean getIsNewMsg();

        boolean getIsPreviewMsg();

        boolean getIsShowBigCover();

        long getLocalId();

        int getMaxIdx();

        long getMid();

        int getMsgDetailType();

        int getMsgStatus();

        int getMsgViewType();

        String getRankSessionId();

        C16994k getRankSessionIdBytes();

        String getRecommendReason();

        C16994k getRecommendReasonBytes();

        int getRecycleCardType();

        int getSessionId();

        int getSvrTime();

        String getUserName();

        C16994k getUserNameBytes();

        boolean hasBizUin();

        boolean hasBuffer();

        boolean hasCardId();

        boolean hasCgiSessionId();

        boolean hasFirstItemShowType();

        boolean hasFrameSetName();

        boolean hasHasRedDot();

        boolean hasIsNewMsg();

        boolean hasIsPreviewMsg();

        boolean hasIsShowBigCover();

        boolean hasLocalId();

        boolean hasMaxIdx();

        boolean hasMid();

        boolean hasMsgDetailType();

        boolean hasMsgStatus();

        boolean hasMsgViewType();

        boolean hasRankSessionId();

        boolean hasRecommendReason();

        boolean hasRecycleCardType();

        boolean hasSessionId();

        boolean hasSvrTime();

        boolean hasUserName();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardInfoList */
    public static final class DynamicCardInfoList extends C23861l0<DynamicCardInfoList, Builder> implements DynamicCardInfoListOrBuilder {
        /* access modifiers changed from: private */
        public static final DynamicCardInfoList DEFAULT_INSTANCE;
        public static final int LIST_FIELD_NUMBER = 1;
        private static volatile C24062w1<DynamicCardInfoList> PARSER;
        private C23908o0.C23919j<DynamicCardInfo> list_ = C23861l0.emptyProtobufList();

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardInfoList$Builder */
        public static final class Builder extends C23861l0.C23862a<DynamicCardInfoList, Builder> implements DynamicCardInfoListOrBuilder {
            public /* synthetic */ Builder(C243781 r1) {
                this();
            }

            public Builder addAllList(Iterable<? extends DynamicCardInfo> iterable) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).addAllList(iterable);
                return this;
            }

            public Builder addList(DynamicCardInfo dynamicCardInfo) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).addList(dynamicCardInfo);
                return this;
            }

            public Builder clearList() {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).clearList();
                return this;
            }

            public DynamicCardInfo getList(int i) {
                return ((DynamicCardInfoList) this.instance).getList(i);
            }

            public int getListCount() {
                return ((DynamicCardInfoList) this.instance).getListCount();
            }

            public List<DynamicCardInfo> getListList() {
                return Collections.unmodifiableList(((DynamicCardInfoList) this.instance).getListList());
            }

            public Builder removeList(int i) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).removeList(i);
                return this;
            }

            public Builder setList(int i, DynamicCardInfo dynamicCardInfo) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).setList(i, dynamicCardInfo);
                return this;
            }

            private Builder() {
                super(DynamicCardInfoList.DEFAULT_INSTANCE);
            }

            public Builder addList(int i, DynamicCardInfo dynamicCardInfo) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).addList(i, dynamicCardInfo);
                return this;
            }

            public Builder setList(int i, DynamicCardInfo.Builder builder) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).setList(i, (DynamicCardInfo) builder.build());
                return this;
            }

            public Builder addList(DynamicCardInfo.Builder builder) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).addList((DynamicCardInfo) builder.build());
                return this;
            }

            public Builder addList(int i, DynamicCardInfo.Builder builder) {
                copyOnWrite();
                ((DynamicCardInfoList) this.instance).addList(i, (DynamicCardInfo) builder.build());
                return this;
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardInfoList$DynamicCardInfo */
        public static final class DynamicCardInfo extends C23861l0<DynamicCardInfo, Builder> implements DynamicCardInfoOrBuilder {
            /* access modifiers changed from: private */
            public static final DynamicCardInfo DEFAULT_INSTANCE;
            public static final int FRAMESETDATA_FIELD_NUMBER = 3;
            public static final int FRAMESETNAME_FIELD_NUMBER = 2;
            public static final int MSGID_FIELD_NUMBER = 1;
            private static volatile C24062w1<DynamicCardInfo> PARSER = null;
            public static final int POS_FIELD_NUMBER = 4;
            private int bitField0_;
            private String frameSetData_ = "";
            private String frameSetName_ = "";
            private long msgId_;
            private int pos_;

            /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardInfoList$DynamicCardInfo$Builder */
            public static final class Builder extends C23861l0.C23862a<DynamicCardInfo, Builder> implements DynamicCardInfoOrBuilder {
                public /* synthetic */ Builder(C243781 r1) {
                    this();
                }

                public Builder clearFrameSetData() {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).clearFrameSetData();
                    return this;
                }

                public Builder clearFrameSetName() {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).clearFrameSetName();
                    return this;
                }

                public Builder clearMsgId() {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).clearMsgId();
                    return this;
                }

                public Builder clearPos() {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).clearPos();
                    return this;
                }

                public String getFrameSetData() {
                    return ((DynamicCardInfo) this.instance).getFrameSetData();
                }

                public C16994k getFrameSetDataBytes() {
                    return ((DynamicCardInfo) this.instance).getFrameSetDataBytes();
                }

                public String getFrameSetName() {
                    return ((DynamicCardInfo) this.instance).getFrameSetName();
                }

                public C16994k getFrameSetNameBytes() {
                    return ((DynamicCardInfo) this.instance).getFrameSetNameBytes();
                }

                public long getMsgId() {
                    return ((DynamicCardInfo) this.instance).getMsgId();
                }

                public int getPos() {
                    return ((DynamicCardInfo) this.instance).getPos();
                }

                public boolean hasFrameSetData() {
                    return ((DynamicCardInfo) this.instance).hasFrameSetData();
                }

                public boolean hasFrameSetName() {
                    return ((DynamicCardInfo) this.instance).hasFrameSetName();
                }

                public boolean hasMsgId() {
                    return ((DynamicCardInfo) this.instance).hasMsgId();
                }

                public boolean hasPos() {
                    return ((DynamicCardInfo) this.instance).hasPos();
                }

                public Builder setFrameSetData(String str) {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).setFrameSetData(str);
                    return this;
                }

                public Builder setFrameSetDataBytes(C16994k kVar) {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).setFrameSetDataBytes(kVar);
                    return this;
                }

                public Builder setFrameSetName(String str) {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).setFrameSetName(str);
                    return this;
                }

                public Builder setFrameSetNameBytes(C16994k kVar) {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).setFrameSetNameBytes(kVar);
                    return this;
                }

                public Builder setMsgId(long j) {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).setMsgId(j);
                    return this;
                }

                public Builder setPos(int i) {
                    copyOnWrite();
                    ((DynamicCardInfo) this.instance).setPos(i);
                    return this;
                }

                private Builder() {
                    super(DynamicCardInfo.DEFAULT_INSTANCE);
                }
            }

            static {
                DynamicCardInfo dynamicCardInfo = new DynamicCardInfo();
                DEFAULT_INSTANCE = dynamicCardInfo;
                C23861l0.registerDefaultInstance(DynamicCardInfo.class, dynamicCardInfo);
            }

            private DynamicCardInfo() {
            }

            /* access modifiers changed from: private */
            public void clearFrameSetData() {
                this.bitField0_ &= -5;
                this.frameSetData_ = getDefaultInstance().getFrameSetData();
            }

            /* access modifiers changed from: private */
            public void clearFrameSetName() {
                this.bitField0_ &= -3;
                this.frameSetName_ = getDefaultInstance().getFrameSetName();
            }

            /* access modifiers changed from: private */
            public void clearMsgId() {
                this.bitField0_ &= -2;
                this.msgId_ = 0;
            }

            /* access modifiers changed from: private */
            public void clearPos() {
                this.bitField0_ &= -9;
                this.pos_ = 0;
            }

            public static DynamicCardInfo getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static DynamicCardInfo parseDelimitedFrom(InputStream inputStream) {
                return (DynamicCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DynamicCardInfo parseFrom(ByteBuffer byteBuffer) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static C24062w1<DynamicCardInfo> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* access modifiers changed from: private */
            public void setFrameSetData(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.frameSetData_ = str;
            }

            /* access modifiers changed from: private */
            public void setFrameSetDataBytes(C16994k kVar) {
                this.frameSetData_ = kVar.mo18752u();
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void setFrameSetName(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.frameSetName_ = str;
            }

            /* access modifiers changed from: private */
            public void setFrameSetNameBytes(C16994k kVar) {
                this.frameSetName_ = kVar.mo18752u();
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void setMsgId(long j) {
                this.bitField0_ |= 1;
                this.msgId_ = j;
            }

            /* access modifiers changed from: private */
            public void setPos(int i) {
                this.bitField0_ |= 8;
                this.pos_ = i;
            }

            public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
                switch (fVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003", new Object[]{"bitField0_", "msgId_", "frameSetName_", "frameSetData_", "pos_"});
                    case 3:
                        return new DynamicCardInfo();
                    case 4:
                        return new Builder((C243781) null);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C24062w1<DynamicCardInfo> w1Var = PARSER;
                        if (w1Var == null) {
                            synchronized (DynamicCardInfo.class) {
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

            public long getMsgId() {
                return this.msgId_;
            }

            public int getPos() {
                return this.pos_;
            }

            public boolean hasFrameSetData() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasFrameSetName() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasMsgId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasPos() {
                return (this.bitField0_ & 8) != 0;
            }

            public static Builder newBuilder(DynamicCardInfo dynamicCardInfo) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(dynamicCardInfo);
            }

            public static DynamicCardInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
                return (DynamicCardInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static DynamicCardInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
            }

            public static DynamicCardInfo parseFrom(C16994k kVar) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
            }

            public static DynamicCardInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
            }

            public static DynamicCardInfo parseFrom(byte[] bArr) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static DynamicCardInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
            }

            public static DynamicCardInfo parseFrom(InputStream inputStream) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static DynamicCardInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
            }

            public static DynamicCardInfo parseFrom(C23856l lVar) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
            }

            public static DynamicCardInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
                return (DynamicCardInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
            }
        }

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardInfoList$DynamicCardInfoOrBuilder */
        public interface DynamicCardInfoOrBuilder extends C23848k1 {
            /* synthetic */ C23845j1 getDefaultInstanceForType();

            String getFrameSetData();

            C16994k getFrameSetDataBytes();

            String getFrameSetName();

            C16994k getFrameSetNameBytes();

            long getMsgId();

            int getPos();

            boolean hasFrameSetData();

            boolean hasFrameSetName();

            boolean hasMsgId();

            boolean hasPos();

            /* synthetic */ boolean isInitialized();
        }

        static {
            DynamicCardInfoList dynamicCardInfoList = new DynamicCardInfoList();
            DEFAULT_INSTANCE = dynamicCardInfoList;
            C23861l0.registerDefaultInstance(DynamicCardInfoList.class, dynamicCardInfoList);
        }

        private DynamicCardInfoList() {
        }

        /* access modifiers changed from: private */
        public void addAllList(Iterable<? extends DynamicCardInfo> iterable) {
            ensureListIsMutable();
            C23810b.addAll(iterable, this.list_);
        }

        /* access modifiers changed from: private */
        public void addList(DynamicCardInfo dynamicCardInfo) {
            dynamicCardInfo.getClass();
            ensureListIsMutable();
            this.list_.add(dynamicCardInfo);
        }

        /* access modifiers changed from: private */
        public void clearList() {
            this.list_ = C23861l0.emptyProtobufList();
        }

        private void ensureListIsMutable() {
            C23908o0.C23919j<DynamicCardInfo> jVar = this.list_;
            if (!jVar.mo37523Q()) {
                this.list_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static DynamicCardInfoList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DynamicCardInfoList parseDelimitedFrom(InputStream inputStream) {
            return (DynamicCardInfoList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicCardInfoList parseFrom(ByteBuffer byteBuffer) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<DynamicCardInfoList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeList(int i) {
            ensureListIsMutable();
            this.list_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setList(int i, DynamicCardInfo dynamicCardInfo) {
            dynamicCardInfo.getClass();
            ensureListIsMutable();
            this.list_.set(i, dynamicCardInfo);
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"list_", DynamicCardInfo.class});
                case 3:
                    return new DynamicCardInfoList();
                case 4:
                    return new Builder((C243781) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<DynamicCardInfoList> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (DynamicCardInfoList.class) {
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

        public DynamicCardInfo getList(int i) {
            return this.list_.get(i);
        }

        public int getListCount() {
            return this.list_.size();
        }

        public List<DynamicCardInfo> getListList() {
            return this.list_;
        }

        public DynamicCardInfoOrBuilder getListOrBuilder(int i) {
            return this.list_.get(i);
        }

        public List<? extends DynamicCardInfoOrBuilder> getListOrBuilderList() {
            return this.list_;
        }

        public static Builder newBuilder(DynamicCardInfoList dynamicCardInfoList) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(dynamicCardInfoList);
        }

        public static DynamicCardInfoList parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DynamicCardInfoList) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DynamicCardInfoList parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static DynamicCardInfoList parseFrom(C16994k kVar) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addList(int i, DynamicCardInfo dynamicCardInfo) {
            dynamicCardInfo.getClass();
            ensureListIsMutable();
            this.list_.add(i, dynamicCardInfo);
        }

        public static DynamicCardInfoList parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static DynamicCardInfoList parseFrom(byte[] bArr) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DynamicCardInfoList parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static DynamicCardInfoList parseFrom(InputStream inputStream) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DynamicCardInfoList parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static DynamicCardInfoList parseFrom(C23856l lVar) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static DynamicCardInfoList parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (DynamicCardInfoList) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardInfoListOrBuilder */
    public interface DynamicCardInfoListOrBuilder extends C23848k1 {
        /* synthetic */ C23845j1 getDefaultInstanceForType();

        DynamicCardInfoList.DynamicCardInfo getList(int i);

        int getListCount();

        List<DynamicCardInfoList.DynamicCardInfo> getListList();

        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardType */
    public enum DynamicCardType implements C23908o0.C23911c {
        DynamicCardTypeAd(1),
        DynamicCardTypeRec(2);
        
        public static final int DynamicCardTypeAd_VALUE = 1;
        public static final int DynamicCardTypeRec_VALUE = 2;
        private static final C23908o0.C23912d<DynamicCardType> internalValueMap = null;
        private final int value;

        /* renamed from: com.tencent.wechat.mm.biz.BizProto$DynamicCardType$DynamicCardTypeVerifier */
        public static final class DynamicCardTypeVerifier implements C23908o0.C23913e {
            public static final C23908o0.C23913e INSTANCE = null;

            static {
                INSTANCE = new DynamicCardTypeVerifier();
            }

            private DynamicCardTypeVerifier() {
            }

            public boolean isInRange(int i) {
                return DynamicCardType.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C23908o0.C23912d<DynamicCardType>() {
                public DynamicCardType findValueByNumber(int i) {
                    return DynamicCardType.forNumber(i);
                }
            };
        }

        private DynamicCardType(int i) {
            this.value = i;
        }

        public static DynamicCardType forNumber(int i) {
            if (i == 1) {
                return DynamicCardTypeAd;
            }
            if (i != 2) {
                return null;
            }
            return DynamicCardTypeRec;
        }

        public static C23908o0.C23912d<DynamicCardType> internalGetValueMap() {
            return internalValueMap;
        }

        public static C23908o0.C23913e internalGetVerifier() {
            return DynamicCardTypeVerifier.INSTANCE;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static DynamicCardType valueOf(int i) {
            return forNumber(i);
        }
    }

    private BizProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
