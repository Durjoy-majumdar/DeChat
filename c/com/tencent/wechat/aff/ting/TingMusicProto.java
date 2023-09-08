package com.tencent.wechat.aff.ting;

import com.google.protobuf.C16994k;
import com.google.protobuf.C23806a0;
import com.google.protobuf.C23810b;
import com.google.protobuf.C23845j1;
import com.google.protobuf.C23848k1;
import com.google.protobuf.C23856l;
import com.google.protobuf.C23861l0;
import com.google.protobuf.C23908o0;
import com.google.protobuf.C24062w1;
import com.tencent.wechat.aff.ting.MMBaseProto;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class TingMusicProto {

    /* renamed from: com.tencent.wechat.aff.ting.TingMusicProto$1 */
    public static /* synthetic */ class C243221 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        public static final /* synthetic */ int[] f69818xa1df5c61;

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
                f69818xa1df5c61 = r0
                r1 = 1
                r2 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000d }
            L_0x000d:
                r0 = 2
                r3 = 4
                int[] r4 = f69818xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0013 }
                r4[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                int[] r4 = f69818xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0017 }
                r4[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r0 = 5
                int[] r2 = f69818xa1df5c61     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r0] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 6
                int[] r3 = f69818xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0021 }
                r3[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                int[] r0 = f69818xa1df5c61     // Catch:{ NoSuchFieldError -> 0x0026 }
                r3 = 0
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                int[] r0 = f69818xa1df5c61     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.aff.ting.TingMusicProto.C243221.<clinit>():void");
        }
    }

    public static final class MusicLiveGetLinkReq extends C23861l0<MusicLiveGetLinkReq, Builder> implements MusicLiveGetLinkReqOrBuilder {
        public static final int BASEREQUEST_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final MusicLiveGetLinkReq DEFAULT_INSTANCE;
        public static final int INFOS_FIELD_NUMBER = 2;
        private static volatile C24062w1<MusicLiveGetLinkReq> PARSER;
        private MMBaseProto.BaseRequest baseRequest_;
        private int bitField0_;
        private C23908o0.C23919j<MusicLiveGetLinkReqInfo> infos_ = C23861l0.emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<MusicLiveGetLinkReq, Builder> implements MusicLiveGetLinkReqOrBuilder {
            public /* synthetic */ Builder(C243221 r1) {
                this();
            }

            public Builder addAllInfos(Iterable<? extends MusicLiveGetLinkReqInfo> iterable) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).addAllInfos(iterable);
                return this;
            }

            public Builder addInfos(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).addInfos(musicLiveGetLinkReqInfo);
                return this;
            }

            public Builder clearBaseRequest() {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).clearBaseRequest();
                return this;
            }

            public Builder clearInfos() {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).clearInfos();
                return this;
            }

            public MMBaseProto.BaseRequest getBaseRequest() {
                return ((MusicLiveGetLinkReq) this.instance).getBaseRequest();
            }

            public MusicLiveGetLinkReqInfo getInfos(int i) {
                return ((MusicLiveGetLinkReq) this.instance).getInfos(i);
            }

            public int getInfosCount() {
                return ((MusicLiveGetLinkReq) this.instance).getInfosCount();
            }

            public List<MusicLiveGetLinkReqInfo> getInfosList() {
                return Collections.unmodifiableList(((MusicLiveGetLinkReq) this.instance).getInfosList());
            }

            public boolean hasBaseRequest() {
                return ((MusicLiveGetLinkReq) this.instance).hasBaseRequest();
            }

            public Builder mergeBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).mergeBaseRequest(baseRequest);
                return this;
            }

            public Builder removeInfos(int i) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).removeInfos(i);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).setBaseRequest(baseRequest);
                return this;
            }

            public Builder setInfos(int i, MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).setInfos(i, musicLiveGetLinkReqInfo);
                return this;
            }

            private Builder() {
                super(MusicLiveGetLinkReq.DEFAULT_INSTANCE);
            }

            public Builder addInfos(int i, MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).addInfos(i, musicLiveGetLinkReqInfo);
                return this;
            }

            public Builder setBaseRequest(MMBaseProto.BaseRequest.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).setBaseRequest((MMBaseProto.BaseRequest) builder.build());
                return this;
            }

            public Builder setInfos(int i, MusicLiveGetLinkReqInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).setInfos(i, (MusicLiveGetLinkReqInfo) builder.build());
                return this;
            }

            public Builder addInfos(MusicLiveGetLinkReqInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).addInfos((MusicLiveGetLinkReqInfo) builder.build());
                return this;
            }

            public Builder addInfos(int i, MusicLiveGetLinkReqInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkReq) this.instance).addInfos(i, (MusicLiveGetLinkReqInfo) builder.build());
                return this;
            }
        }

        static {
            MusicLiveGetLinkReq musicLiveGetLinkReq = new MusicLiveGetLinkReq();
            DEFAULT_INSTANCE = musicLiveGetLinkReq;
            C23861l0.registerDefaultInstance(MusicLiveGetLinkReq.class, musicLiveGetLinkReq);
        }

        private MusicLiveGetLinkReq() {
        }

        /* access modifiers changed from: private */
        public void addAllInfos(Iterable<? extends MusicLiveGetLinkReqInfo> iterable) {
            ensureInfosIsMutable();
            C23810b.addAll(iterable, this.infos_);
        }

        /* access modifiers changed from: private */
        public void addInfos(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
            musicLiveGetLinkReqInfo.getClass();
            ensureInfosIsMutable();
            this.infos_.add(musicLiveGetLinkReqInfo);
        }

        /* access modifiers changed from: private */
        public void clearBaseRequest() {
            this.baseRequest_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearInfos() {
            this.infos_ = C23861l0.emptyProtobufList();
        }

        private void ensureInfosIsMutable() {
            C23908o0.C23919j<MusicLiveGetLinkReqInfo> jVar = this.infos_;
            if (!jVar.mo37523Q()) {
                this.infos_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static MusicLiveGetLinkReq getDefaultInstance() {
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

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MusicLiveGetLinkReq parseDelimitedFrom(InputStream inputStream) {
            return (MusicLiveGetLinkReq) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkReq parseFrom(ByteBuffer byteBuffer) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MusicLiveGetLinkReq> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeInfos(int i) {
            ensureInfosIsMutable();
            this.infos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBaseRequest(MMBaseProto.BaseRequest baseRequest) {
            baseRequest.getClass();
            this.baseRequest_ = baseRequest;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setInfos(int i, MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
            musicLiveGetLinkReqInfo.getClass();
            ensureInfosIsMutable();
            this.infos_.set(i, musicLiveGetLinkReqInfo);
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"bitField0_", "baseRequest_", "infos_", MusicLiveGetLinkReqInfo.class});
                case 3:
                    return new MusicLiveGetLinkReq();
                case 4:
                    return new Builder((C243221) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MusicLiveGetLinkReq> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MusicLiveGetLinkReq.class) {
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

        public MusicLiveGetLinkReqInfo getInfos(int i) {
            return this.infos_.get(i);
        }

        public int getInfosCount() {
            return this.infos_.size();
        }

        public List<MusicLiveGetLinkReqInfo> getInfosList() {
            return this.infos_;
        }

        public MusicLiveGetLinkReqInfoOrBuilder getInfosOrBuilder(int i) {
            return this.infos_.get(i);
        }

        public List<? extends MusicLiveGetLinkReqInfoOrBuilder> getInfosOrBuilderList() {
            return this.infos_;
        }

        public boolean hasBaseRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MusicLiveGetLinkReq musicLiveGetLinkReq) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(musicLiveGetLinkReq);
        }

        public static MusicLiveGetLinkReq parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkReq) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkReq parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MusicLiveGetLinkReq parseFrom(C16994k kVar) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addInfos(int i, MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
            musicLiveGetLinkReqInfo.getClass();
            ensureInfosIsMutable();
            this.infos_.add(i, musicLiveGetLinkReqInfo);
        }

        public static MusicLiveGetLinkReq parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MusicLiveGetLinkReq parseFrom(byte[] bArr) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicLiveGetLinkReq parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MusicLiveGetLinkReq parseFrom(InputStream inputStream) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkReq parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkReq parseFrom(C23856l lVar) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MusicLiveGetLinkReq parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkReq) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class MusicLiveGetLinkReqInfo extends C23861l0<MusicLiveGetLinkReqInfo, Builder> implements MusicLiveGetLinkReqInfoOrBuilder {
        public static final int APPID_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final MusicLiveGetLinkReqInfo DEFAULT_INSTANCE;
        public static final int MID_FIELD_NUMBER = 2;
        private static volatile C24062w1<MusicLiveGetLinkReqInfo> PARSER = null;
        public static final int WEB_URL_FIELD_NUMBER = 3;
        private String appid_ = "";
        private int bitField0_;
        private String mid_ = "";
        private String webUrl_ = "";

        public static final class Builder extends C23861l0.C23862a<MusicLiveGetLinkReqInfo, Builder> implements MusicLiveGetLinkReqInfoOrBuilder {
            public /* synthetic */ Builder(C243221 r1) {
                this();
            }

            public Builder clearAppid() {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).clearAppid();
                return this;
            }

            public Builder clearMid() {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).clearMid();
                return this;
            }

            public Builder clearWebUrl() {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).clearWebUrl();
                return this;
            }

            public String getAppid() {
                return ((MusicLiveGetLinkReqInfo) this.instance).getAppid();
            }

            public C16994k getAppidBytes() {
                return ((MusicLiveGetLinkReqInfo) this.instance).getAppidBytes();
            }

            public String getMid() {
                return ((MusicLiveGetLinkReqInfo) this.instance).getMid();
            }

            public C16994k getMidBytes() {
                return ((MusicLiveGetLinkReqInfo) this.instance).getMidBytes();
            }

            public String getWebUrl() {
                return ((MusicLiveGetLinkReqInfo) this.instance).getWebUrl();
            }

            public C16994k getWebUrlBytes() {
                return ((MusicLiveGetLinkReqInfo) this.instance).getWebUrlBytes();
            }

            public boolean hasAppid() {
                return ((MusicLiveGetLinkReqInfo) this.instance).hasAppid();
            }

            public boolean hasMid() {
                return ((MusicLiveGetLinkReqInfo) this.instance).hasMid();
            }

            public boolean hasWebUrl() {
                return ((MusicLiveGetLinkReqInfo) this.instance).hasWebUrl();
            }

            public Builder setAppid(String str) {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).setAppid(str);
                return this;
            }

            public Builder setAppidBytes(C16994k kVar) {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).setAppidBytes(kVar);
                return this;
            }

            public Builder setMid(String str) {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).setMid(str);
                return this;
            }

            public Builder setMidBytes(C16994k kVar) {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).setMidBytes(kVar);
                return this;
            }

            public Builder setWebUrl(String str) {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).setWebUrl(str);
                return this;
            }

            public Builder setWebUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((MusicLiveGetLinkReqInfo) this.instance).setWebUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(MusicLiveGetLinkReqInfo.DEFAULT_INSTANCE);
            }
        }

        static {
            MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo = new MusicLiveGetLinkReqInfo();
            DEFAULT_INSTANCE = musicLiveGetLinkReqInfo;
            C23861l0.registerDefaultInstance(MusicLiveGetLinkReqInfo.class, musicLiveGetLinkReqInfo);
        }

        private MusicLiveGetLinkReqInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAppid() {
            this.bitField0_ &= -2;
            this.appid_ = getDefaultInstance().getAppid();
        }

        /* access modifiers changed from: private */
        public void clearMid() {
            this.bitField0_ &= -3;
            this.mid_ = getDefaultInstance().getMid();
        }

        /* access modifiers changed from: private */
        public void clearWebUrl() {
            this.bitField0_ &= -5;
            this.webUrl_ = getDefaultInstance().getWebUrl();
        }

        public static MusicLiveGetLinkReqInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MusicLiveGetLinkReqInfo parseDelimitedFrom(InputStream inputStream) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(ByteBuffer byteBuffer) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MusicLiveGetLinkReqInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
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
        public void setMid(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.mid_ = str;
        }

        /* access modifiers changed from: private */
        public void setMidBytes(C16994k kVar) {
            this.mid_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setWebUrl(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.webUrl_ = str;
        }

        /* access modifiers changed from: private */
        public void setWebUrlBytes(C16994k kVar) {
            this.webUrl_ = kVar.mo18752u();
            this.bitField0_ |= 4;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "appid_", "mid_", "webUrl_"});
                case 3:
                    return new MusicLiveGetLinkReqInfo();
                case 4:
                    return new Builder((C243221) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MusicLiveGetLinkReqInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MusicLiveGetLinkReqInfo.class) {
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

        public String getAppid() {
            return this.appid_;
        }

        public C16994k getAppidBytes() {
            return C16994k.m16791k(this.appid_);
        }

        public String getMid() {
            return this.mid_;
        }

        public C16994k getMidBytes() {
            return C16994k.m16791k(this.mid_);
        }

        public String getWebUrl() {
            return this.webUrl_;
        }

        public C16994k getWebUrlBytes() {
            return C16994k.m16791k(this.webUrl_);
        }

        public boolean hasAppid() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMid() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasWebUrl() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(musicLiveGetLinkReqInfo);
        }

        public static MusicLiveGetLinkReqInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(C16994k kVar) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(byte[] bArr) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(InputStream inputStream) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(C23856l lVar) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MusicLiveGetLinkReqInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkReqInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface MusicLiveGetLinkReqInfoOrBuilder extends C23848k1 {
        String getAppid();

        C16994k getAppidBytes();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        String getMid();

        C16994k getMidBytes();

        String getWebUrl();

        C16994k getWebUrlBytes();

        boolean hasAppid();

        boolean hasMid();

        boolean hasWebUrl();

        /* synthetic */ boolean isInitialized();
    }

    public interface MusicLiveGetLinkReqOrBuilder extends C23848k1 {
        MMBaseProto.BaseRequest getBaseRequest();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        MusicLiveGetLinkReqInfo getInfos(int i);

        int getInfosCount();

        List<MusicLiveGetLinkReqInfo> getInfosList();

        boolean hasBaseRequest();

        /* synthetic */ boolean isInitialized();
    }

    public static final class MusicLiveGetLinkResp extends C23861l0<MusicLiveGetLinkResp, Builder> implements MusicLiveGetLinkRespOrBuilder {
        public static final int BASERESPONSE_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final MusicLiveGetLinkResp DEFAULT_INSTANCE;
        public static final int INFOS_FIELD_NUMBER = 2;
        private static volatile C24062w1<MusicLiveGetLinkResp> PARSER;
        private MMBaseProto.BaseResponse baseResponse_;
        private int bitField0_;
        private C23908o0.C23919j<MusicLiveGetLinkRespInfo> infos_ = C23861l0.emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends C23861l0.C23862a<MusicLiveGetLinkResp, Builder> implements MusicLiveGetLinkRespOrBuilder {
            public /* synthetic */ Builder(C243221 r1) {
                this();
            }

            public Builder addAllInfos(Iterable<? extends MusicLiveGetLinkRespInfo> iterable) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).addAllInfos(iterable);
                return this;
            }

            public Builder addInfos(MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).addInfos(musicLiveGetLinkRespInfo);
                return this;
            }

            public Builder clearBaseResponse() {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).clearBaseResponse();
                return this;
            }

            public Builder clearInfos() {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).clearInfos();
                return this;
            }

            public MMBaseProto.BaseResponse getBaseResponse() {
                return ((MusicLiveGetLinkResp) this.instance).getBaseResponse();
            }

            public MusicLiveGetLinkRespInfo getInfos(int i) {
                return ((MusicLiveGetLinkResp) this.instance).getInfos(i);
            }

            public int getInfosCount() {
                return ((MusicLiveGetLinkResp) this.instance).getInfosCount();
            }

            public List<MusicLiveGetLinkRespInfo> getInfosList() {
                return Collections.unmodifiableList(((MusicLiveGetLinkResp) this.instance).getInfosList());
            }

            public boolean hasBaseResponse() {
                return ((MusicLiveGetLinkResp) this.instance).hasBaseResponse();
            }

            public Builder mergeBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).mergeBaseResponse(baseResponse);
                return this;
            }

            public Builder removeInfos(int i) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).removeInfos(i);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).setBaseResponse(baseResponse);
                return this;
            }

            public Builder setInfos(int i, MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).setInfos(i, musicLiveGetLinkRespInfo);
                return this;
            }

            private Builder() {
                super(MusicLiveGetLinkResp.DEFAULT_INSTANCE);
            }

            public Builder addInfos(int i, MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).addInfos(i, musicLiveGetLinkRespInfo);
                return this;
            }

            public Builder setBaseResponse(MMBaseProto.BaseResponse.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).setBaseResponse((MMBaseProto.BaseResponse) builder.build());
                return this;
            }

            public Builder setInfos(int i, MusicLiveGetLinkRespInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).setInfos(i, (MusicLiveGetLinkRespInfo) builder.build());
                return this;
            }

            public Builder addInfos(MusicLiveGetLinkRespInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).addInfos((MusicLiveGetLinkRespInfo) builder.build());
                return this;
            }

            public Builder addInfos(int i, MusicLiveGetLinkRespInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkResp) this.instance).addInfos(i, (MusicLiveGetLinkRespInfo) builder.build());
                return this;
            }
        }

        static {
            MusicLiveGetLinkResp musicLiveGetLinkResp = new MusicLiveGetLinkResp();
            DEFAULT_INSTANCE = musicLiveGetLinkResp;
            C23861l0.registerDefaultInstance(MusicLiveGetLinkResp.class, musicLiveGetLinkResp);
        }

        private MusicLiveGetLinkResp() {
        }

        /* access modifiers changed from: private */
        public void addAllInfos(Iterable<? extends MusicLiveGetLinkRespInfo> iterable) {
            ensureInfosIsMutable();
            C23810b.addAll(iterable, this.infos_);
        }

        /* access modifiers changed from: private */
        public void addInfos(MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
            musicLiveGetLinkRespInfo.getClass();
            ensureInfosIsMutable();
            this.infos_.add(musicLiveGetLinkRespInfo);
        }

        /* access modifiers changed from: private */
        public void clearBaseResponse() {
            this.baseResponse_ = null;
            this.bitField0_ &= -2;
        }

        /* access modifiers changed from: private */
        public void clearInfos() {
            this.infos_ = C23861l0.emptyProtobufList();
        }

        private void ensureInfosIsMutable() {
            C23908o0.C23919j<MusicLiveGetLinkRespInfo> jVar = this.infos_;
            if (!jVar.mo37523Q()) {
                this.infos_ = C23861l0.mutableCopy(jVar);
            }
        }

        public static MusicLiveGetLinkResp getDefaultInstance() {
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

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MusicLiveGetLinkResp parseDelimitedFrom(InputStream inputStream) {
            return (MusicLiveGetLinkResp) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkResp parseFrom(ByteBuffer byteBuffer) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MusicLiveGetLinkResp> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void removeInfos(int i) {
            ensureInfosIsMutable();
            this.infos_.remove(i);
        }

        /* access modifiers changed from: private */
        public void setBaseResponse(MMBaseProto.BaseResponse baseResponse) {
            baseResponse.getClass();
            this.baseResponse_ = baseResponse;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void setInfos(int i, MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
            musicLiveGetLinkRespInfo.getClass();
            ensureInfosIsMutable();
            this.infos_.set(i, musicLiveGetLinkRespInfo);
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
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"bitField0_", "baseResponse_", "infos_", MusicLiveGetLinkRespInfo.class});
                case 3:
                    return new MusicLiveGetLinkResp();
                case 4:
                    return new Builder((C243221) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MusicLiveGetLinkResp> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MusicLiveGetLinkResp.class) {
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

        public MusicLiveGetLinkRespInfo getInfos(int i) {
            return this.infos_.get(i);
        }

        public int getInfosCount() {
            return this.infos_.size();
        }

        public List<MusicLiveGetLinkRespInfo> getInfosList() {
            return this.infos_;
        }

        public MusicLiveGetLinkRespInfoOrBuilder getInfosOrBuilder(int i) {
            return this.infos_.get(i);
        }

        public List<? extends MusicLiveGetLinkRespInfoOrBuilder> getInfosOrBuilderList() {
            return this.infos_;
        }

        public boolean hasBaseResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(MusicLiveGetLinkResp musicLiveGetLinkResp) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(musicLiveGetLinkResp);
        }

        public static MusicLiveGetLinkResp parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkResp) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkResp parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MusicLiveGetLinkResp parseFrom(C16994k kVar) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        /* access modifiers changed from: private */
        public void addInfos(int i, MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
            musicLiveGetLinkRespInfo.getClass();
            ensureInfosIsMutable();
            this.infos_.add(i, musicLiveGetLinkRespInfo);
        }

        public static MusicLiveGetLinkResp parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MusicLiveGetLinkResp parseFrom(byte[] bArr) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicLiveGetLinkResp parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MusicLiveGetLinkResp parseFrom(InputStream inputStream) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkResp parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkResp parseFrom(C23856l lVar) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MusicLiveGetLinkResp parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkResp) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public static final class MusicLiveGetLinkRespInfo extends C23861l0<MusicLiveGetLinkRespInfo, Builder> implements MusicLiveGetLinkRespInfoOrBuilder {
        public static final int AUDIO_TYPE_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final MusicLiveGetLinkRespInfo DEFAULT_INSTANCE;
        public static final int ENABLE_JOIN_MEMBERSHIP_FIELD_NUMBER = 6;
        public static final int ERR_MSG_FIELD_NUMBER = 2;
        public static final int INFO_FIELD_NUMBER = 3;
        public static final int LYRIC_FIELD_NUMBER = 7;
        private static volatile C24062w1<MusicLiveGetLinkRespInfo> PARSER = null;
        public static final int RET_FIELD_NUMBER = 1;
        public static final int URL_FIELD_NUMBER = 4;
        private int audioType_;
        private int bitField0_;
        private boolean enableJoinMembership_;
        private String errMsg_ = "";
        private MusicLiveGetLinkReqInfo info_;
        private String lyric_ = "";
        private int ret_;
        private String url_ = "";

        public static final class Builder extends C23861l0.C23862a<MusicLiveGetLinkRespInfo, Builder> implements MusicLiveGetLinkRespInfoOrBuilder {
            public /* synthetic */ Builder(C243221 r1) {
                this();
            }

            public Builder clearAudioType() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearAudioType();
                return this;
            }

            public Builder clearEnableJoinMembership() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearEnableJoinMembership();
                return this;
            }

            public Builder clearErrMsg() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearErrMsg();
                return this;
            }

            public Builder clearInfo() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearInfo();
                return this;
            }

            public Builder clearLyric() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearLyric();
                return this;
            }

            public Builder clearRet() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearRet();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).clearUrl();
                return this;
            }

            public int getAudioType() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getAudioType();
            }

            public boolean getEnableJoinMembership() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getEnableJoinMembership();
            }

            public String getErrMsg() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getErrMsg();
            }

            public C16994k getErrMsgBytes() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getErrMsgBytes();
            }

            public MusicLiveGetLinkReqInfo getInfo() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getInfo();
            }

            public String getLyric() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getLyric();
            }

            public C16994k getLyricBytes() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getLyricBytes();
            }

            public int getRet() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getRet();
            }

            public String getUrl() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getUrl();
            }

            public C16994k getUrlBytes() {
                return ((MusicLiveGetLinkRespInfo) this.instance).getUrlBytes();
            }

            public boolean hasAudioType() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasAudioType();
            }

            public boolean hasEnableJoinMembership() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasEnableJoinMembership();
            }

            public boolean hasErrMsg() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasErrMsg();
            }

            public boolean hasInfo() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasInfo();
            }

            public boolean hasLyric() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasLyric();
            }

            public boolean hasRet() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasRet();
            }

            public boolean hasUrl() {
                return ((MusicLiveGetLinkRespInfo) this.instance).hasUrl();
            }

            public Builder mergeInfo(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).mergeInfo(musicLiveGetLinkReqInfo);
                return this;
            }

            public Builder setAudioType(int i) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setAudioType(i);
                return this;
            }

            public Builder setEnableJoinMembership(boolean z) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setEnableJoinMembership(z);
                return this;
            }

            public Builder setErrMsg(String str) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setErrMsg(str);
                return this;
            }

            public Builder setErrMsgBytes(C16994k kVar) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setErrMsgBytes(kVar);
                return this;
            }

            public Builder setInfo(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setInfo(musicLiveGetLinkReqInfo);
                return this;
            }

            public Builder setLyric(String str) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setLyric(str);
                return this;
            }

            public Builder setLyricBytes(C16994k kVar) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setLyricBytes(kVar);
                return this;
            }

            public Builder setRet(int i) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setRet(i);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(C16994k kVar) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setUrlBytes(kVar);
                return this;
            }

            private Builder() {
                super(MusicLiveGetLinkRespInfo.DEFAULT_INSTANCE);
            }

            public Builder setInfo(MusicLiveGetLinkReqInfo.Builder builder) {
                copyOnWrite();
                ((MusicLiveGetLinkRespInfo) this.instance).setInfo((MusicLiveGetLinkReqInfo) builder.build());
                return this;
            }
        }

        static {
            MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo = new MusicLiveGetLinkRespInfo();
            DEFAULT_INSTANCE = musicLiveGetLinkRespInfo;
            C23861l0.registerDefaultInstance(MusicLiveGetLinkRespInfo.class, musicLiveGetLinkRespInfo);
        }

        private MusicLiveGetLinkRespInfo() {
        }

        /* access modifiers changed from: private */
        public void clearAudioType() {
            this.bitField0_ &= -17;
            this.audioType_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearEnableJoinMembership() {
            this.bitField0_ &= -33;
            this.enableJoinMembership_ = false;
        }

        /* access modifiers changed from: private */
        public void clearErrMsg() {
            this.bitField0_ &= -3;
            this.errMsg_ = getDefaultInstance().getErrMsg();
        }

        /* access modifiers changed from: private */
        public void clearInfo() {
            this.info_ = null;
            this.bitField0_ &= -5;
        }

        /* access modifiers changed from: private */
        public void clearLyric() {
            this.bitField0_ &= -65;
            this.lyric_ = getDefaultInstance().getLyric();
        }

        /* access modifiers changed from: private */
        public void clearRet() {
            this.bitField0_ &= -2;
            this.ret_ = 0;
        }

        /* access modifiers changed from: private */
        public void clearUrl() {
            this.bitField0_ &= -9;
            this.url_ = getDefaultInstance().getUrl();
        }

        public static MusicLiveGetLinkRespInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* access modifiers changed from: private */
        public void mergeInfo(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
            musicLiveGetLinkReqInfo.getClass();
            MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo2 = this.info_;
            if (musicLiveGetLinkReqInfo2 == null || musicLiveGetLinkReqInfo2 == MusicLiveGetLinkReqInfo.getDefaultInstance()) {
                this.info_ = musicLiveGetLinkReqInfo;
            } else {
                this.info_ = (MusicLiveGetLinkReqInfo) ((MusicLiveGetLinkReqInfo.Builder) MusicLiveGetLinkReqInfo.newBuilder(this.info_).mergeFrom(musicLiveGetLinkReqInfo)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static MusicLiveGetLinkRespInfo parseDelimitedFrom(InputStream inputStream) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(ByteBuffer byteBuffer) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static C24062w1<MusicLiveGetLinkRespInfo> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* access modifiers changed from: private */
        public void setAudioType(int i) {
            this.bitField0_ |= 16;
            this.audioType_ = i;
        }

        /* access modifiers changed from: private */
        public void setEnableJoinMembership(boolean z) {
            this.bitField0_ |= 32;
            this.enableJoinMembership_ = z;
        }

        /* access modifiers changed from: private */
        public void setErrMsg(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.errMsg_ = str;
        }

        /* access modifiers changed from: private */
        public void setErrMsgBytes(C16994k kVar) {
            this.errMsg_ = kVar.mo18752u();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void setInfo(MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo) {
            musicLiveGetLinkReqInfo.getClass();
            this.info_ = musicLiveGetLinkReqInfo;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void setLyric(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.lyric_ = str;
        }

        /* access modifiers changed from: private */
        public void setLyricBytes(C16994k kVar) {
            this.lyric_ = kVar.mo18752u();
            this.bitField0_ |= 64;
        }

        /* access modifiers changed from: private */
        public void setRet(int i) {
            this.bitField0_ |= 1;
            this.ret_ = i;
        }

        /* access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.url_ = str;
        }

        /* access modifiers changed from: private */
        public void setUrlBytes(C16994k kVar) {
            this.url_ = kVar.mo18752u();
            this.bitField0_ |= 8;
        }

        public final Object dynamicMethod(C23861l0.C23867f fVar, Object obj, Object obj2) {
            switch (fVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return C23861l0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "ret_", "errMsg_", "info_", "url_", "audioType_", "enableJoinMembership_", "lyric_"});
                case 3:
                    return new MusicLiveGetLinkRespInfo();
                case 4:
                    return new Builder((C243221) null);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C24062w1<MusicLiveGetLinkRespInfo> w1Var = PARSER;
                    if (w1Var == null) {
                        synchronized (MusicLiveGetLinkRespInfo.class) {
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

        public int getAudioType() {
            return this.audioType_;
        }

        public boolean getEnableJoinMembership() {
            return this.enableJoinMembership_;
        }

        public String getErrMsg() {
            return this.errMsg_;
        }

        public C16994k getErrMsgBytes() {
            return C16994k.m16791k(this.errMsg_);
        }

        public MusicLiveGetLinkReqInfo getInfo() {
            MusicLiveGetLinkReqInfo musicLiveGetLinkReqInfo = this.info_;
            return musicLiveGetLinkReqInfo == null ? MusicLiveGetLinkReqInfo.getDefaultInstance() : musicLiveGetLinkReqInfo;
        }

        public String getLyric() {
            return this.lyric_;
        }

        public C16994k getLyricBytes() {
            return C16994k.m16791k(this.lyric_);
        }

        public int getRet() {
            return this.ret_;
        }

        public String getUrl() {
            return this.url_;
        }

        public C16994k getUrlBytes() {
            return C16994k.m16791k(this.url_);
        }

        public boolean hasAudioType() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasEnableJoinMembership() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasErrMsg() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasInfo() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLyric() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasRet() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUrl() {
            return (this.bitField0_ & 8) != 0;
        }

        public static Builder newBuilder(MusicLiveGetLinkRespInfo musicLiveGetLinkRespInfo) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(musicLiveGetLinkRespInfo);
        }

        public static MusicLiveGetLinkRespInfo parseDelimitedFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(ByteBuffer byteBuffer, C23806a0 a0Var) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, byteBuffer, a0Var);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(C16994k kVar) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(C16994k kVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, kVar, a0Var);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(byte[] bArr) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(byte[] bArr, C23806a0 a0Var) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, bArr, a0Var);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(InputStream inputStream) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(InputStream inputStream, C23806a0 a0Var) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, inputStream, a0Var);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(C23856l lVar) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar);
        }

        public static MusicLiveGetLinkRespInfo parseFrom(C23856l lVar, C23806a0 a0Var) {
            return (MusicLiveGetLinkRespInfo) C23861l0.parseFrom(DEFAULT_INSTANCE, lVar, a0Var);
        }
    }

    public interface MusicLiveGetLinkRespInfoOrBuilder extends C23848k1 {
        int getAudioType();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        boolean getEnableJoinMembership();

        String getErrMsg();

        C16994k getErrMsgBytes();

        MusicLiveGetLinkReqInfo getInfo();

        String getLyric();

        C16994k getLyricBytes();

        int getRet();

        String getUrl();

        C16994k getUrlBytes();

        boolean hasAudioType();

        boolean hasEnableJoinMembership();

        boolean hasErrMsg();

        boolean hasInfo();

        boolean hasLyric();

        boolean hasRet();

        boolean hasUrl();

        /* synthetic */ boolean isInitialized();
    }

    public interface MusicLiveGetLinkRespOrBuilder extends C23848k1 {
        MMBaseProto.BaseResponse getBaseResponse();

        /* synthetic */ C23845j1 getDefaultInstanceForType();

        MusicLiveGetLinkRespInfo getInfos(int i);

        int getInfosCount();

        List<MusicLiveGetLinkRespInfo> getInfosList();

        boolean hasBaseResponse();

        /* synthetic */ boolean isInitialized();
    }

    private TingMusicProto() {
    }

    public static void registerAllExtensions(C23806a0 a0Var) {
    }
}
